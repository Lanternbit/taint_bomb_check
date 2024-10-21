import os
import csv
from statistics import mean

# 결과를 저장할 리스트
results = []

# results 폴더 내의 모든 하위 폴더를 순회
for root, dirs, files in os.walk('results'):
    for file in files:
        if file.endswith('_original.csv') or file.endswith('_Jobf.csv') or file.endswith('_taint_bomb.csv'):
            file_path = os.path.join(root, file)
            with open(file_path, 'r') as csvfile:
                reader = csv.DictReader(csvfile)
                scores = []

                for row in reader:
                    # Score 열의 값을 float으로 변환하여 리스트에 추가
                    scores.append(float(row['Score']))
                    unit = row['Unit']

                # 평균 계산
                if scores:
                    avg_score = mean(scores)
                    results.append([file, avg_score, unit])

results.sort(key=lambda x: x[0])

# 결과를 새 CSV 파일로 저장
with open('average_scores.csv', 'w', newline='') as csvfile:
    writer = csv.writer(csvfile)
    writer.writerow(['File Name', 'Average Score', 'Unit'])
    writer.writerows(results)

print("평균 점수가 'average_scores.csv' 파일로 저장되었습니다.")