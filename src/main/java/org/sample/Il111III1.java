package org.sample;
import java.lang.reflect.Method;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.results.format.ResultFormatType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import java.util.Random;
import java.util.concurrent.TimeUnit;
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(5)
@State(Scope.Benchmark)
public class Il111III1 {
public static final String[] IIll1lI1l = {"1X6fTkIgAFo8QezwIKHMWA==","1X6fTkIgAFo8QezwIKHMWA=="
};

private static final String I11III1lI = "9il5YiJCRJ73iU/1LXiWYQ";
private static final String I1IIllI1l = "6RE1ABh8pSY";

        
             static{try {Class<?> III1llI1l = Class.forName("org.sample.ll1l1I1II");
             Method IIl1lI1Il = III1llI1l.getMethod("lIIlIIllI", String.class, String.class);
             Class<?> IIIIIIlll = Class.forName("org.sample.III11ll1I");
             Method IIllII1II = IIIIIIlll.getMethod("I1l1I1I1I", String.class, byte[].class);
             for (int I11I11l1l = 0; I11I11l1l < IIll1lI1l.length; I11I11l1l++) 
            {IIll1lI1l[I11I11l1l] = (String) IIllII1II.invoke(null, IIll1lI1l[I11I11l1l], (byte[]) IIl1lI1Il.invoke(null,I11III1lI,I1IIllI1l)); 
             }} catch (Exception e) {}}
         
    private final static int I1lIlI1I1 = 4096;
    private final static int Il1lIlI11 = I1lIlI1I1 * I1lIlI1I1;
    private int[][] lIIIIlIII;
    @Setup
    public void lI11lIl1l() {
        lIIIIlIII = new int[I1lIlI1I1][I1lIlI1I1];
        Random ll1l11Ill = new Random(1234);
        for (int I11I11l1l = 0; I11I11l1l < I1lIlI1I1; I11I11l1l++) {
            for (int l111l1lIl = 0; l111l1lIl < I1lIlI1I1; l111l1lIl++) {
                lIIIIlIII[I11I11l1l][l111l1lIl] = ll1l11Ill.nextInt();
            }
        }
    }
    @Benchmark
    @OperationsPerInvocation(Il1lIlI11)
    public void lIIII111I(Blackhole llIl11l11) {
        for (int ll1IIlIIl = 0; ll1IIlIIl < I1lIlI1I1; ll1IIlIIl++) {
            for (int l1l11Il1I = 0; l1l11Il1I < I1lIlI1I1; l1l11Il1I++) {
                llIl11l11.consume(lIIIIlIII[l1l11Il1I][ll1IIlIIl]);
            }
        }
    }
    @Benchmark
    @OperationsPerInvocation(Il1lIlI11)
    public void I11I1lIll(Blackhole llIl11l11) {
        for (int l1l11Il1I = 0; l1l11Il1I < I1lIlI1I1; l1l11Il1I++) {
            for (int ll1IIlIIl = 0; ll1IIlIIl < I1lIlI1I1; ll1IIlIIl++) {
                llIl11l11.consume(lIIIIlIII[l1l11Il1I][ll1IIlIIl]);
            }
        }
    }
    public static void main(String[] I11ll1lll) throws RunnerException {
        Options lll1lllll = new OptionsBuilder()
                .include(".*" + Il111III1.class.getSimpleName() + ".*")
                .resultFormat(ResultFormatType.CSV)
                .result( "results\\CacheAccess\\JMHSample_37_CacheAccess_taint_bomb.csv")
                .build();
        new Runner(lll1lllll).run();
    }
}


