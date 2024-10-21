package org.sample;
import java.lang.reflect.Method; import java.util.Random;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.results.format.ResultFormatType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import java.util.concurrent.TimeUnit;
@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class l111I11I1 {
public static final String[] IIll1lI1l = {
};

private static final String I11III1lI = "uNQrwsZUOtaXIBnwwKiVdA";
private static final String I1IIllI1l = "MqW1w7JQacw";

        
             static{try {Class<?> III1llI1l = Class.forName("org.sample.ll1l1I1II");
             Method IIl1lI1Il = III1llI1l.getMethod("lIIlIIllI", String.class, String.class);
             Class<?> IIIIIIlll = Class.forName("org.sample.III11ll1I");
             Method IIllII1II = IIIIIIlll.getMethod("I1l1I1I1I", String.class, byte[].class);
             for (int I11I11l1l = 0; I11I11l1l < IIll1lI1l.length; I11I11l1l++) 
            {IIll1lI1l[I11I11l1l] = (String) IIllII1II.invoke(null, IIll1lI1l[I11I11l1l], (byte[]) IIl1lI1Il.invoke(null,I11III1lI,I1IIllI1l)); 
             }} catch (Exception e) {}}
         
    int Il1llII1I = 1;
    int I11lllIII = 2;
    @Benchmark
    public int llI1I1lII() {
        return (Il1llII1I + I11lllIII);
    }
    private int ll1IlII1l(int ll1IlII1l) {
        int lI11IIlll = 0;
        for (int I11I11l1l = 0; I11I11l1l < ll1IlII1l; I11I11l1l++) {
            lI11IIlll += (Il1llII1I + I11lllIII);
        }
        return lI11IIlll;
    }
    @Benchmark
    @OperationsPerInvocation(1)
    public int lIl1lII1l() {
        return ll1IlII1l(1);
    }
    @Benchmark
    @OperationsPerInvocation(10)
    public int I111llI1l() {
        return ll1IlII1l(10);
    }
    @Benchmark
    @OperationsPerInvocation(100)
    public int Il1l11Il1() {
        return ll1IlII1l(100);
    }
    @Benchmark
    @OperationsPerInvocation(1_000)
    public int I1I1lI1II() {
        return ll1IlII1l(1_000);
    }
    @Benchmark
    @OperationsPerInvocation(10_000)
    public int IlIl1l111() {
        return ll1IlII1l(10_000);
    }
    @Benchmark
    @OperationsPerInvocation(100_000)
    public int I1ll111Il() {
        return ll1IlII1l(100_000);
    }
    public static void main(String[] I11ll1lll) throws RunnerException {
        Options lll1lllll = new OptionsBuilder()
                .include(l111I11I1.class.getSimpleName())
                .forks(1)
                .resultFormat(ResultFormatType.CSV)
                .result("results\\Loops\\JMHSample_11_Loops_taint_bomb.csv")
                .build();
        new Runner(lll1lllll).run();
    }
}


