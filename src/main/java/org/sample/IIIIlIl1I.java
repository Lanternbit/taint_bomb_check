package org.sample;
import java.lang.reflect.Method; import java.util.Random;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.results.format.ResultFormatType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import java.util.concurrent.TimeUnit;
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class IIIIlIl1I {
public static final String[] IIll1lI1l = {
};

private static final String I11III1lI = "yhmgPRP0e2d3+/Jg8/wfZQ";
private static final String I1IIllI1l = "Ka3OdaDF9/Q";

        
             static{try {Class<?> III1llI1l = Class.forName("org.sample.ll1l1I1II");
             Method IIl1lI1Il = III1llI1l.getMethod("lIIlIIllI", String.class, String.class);
             Class<?> IIIIIIlll = Class.forName("org.sample.III11ll1I");
             Method IIllII1II = IIIIIIlll.getMethod("I1l1I1I1I", String.class, byte[].class);
             for (int I11I11l1l = 0; I11I11l1l < IIll1lI1l.length; I11I11l1l++) 
            {IIll1lI1l[I11I11l1l] = (String) IIllII1II.invoke(null, IIll1lI1l[I11I11l1l], (byte[]) IIl1lI1Il.invoke(null,I11III1lI,I1IIllI1l)); 
             }} catch (Exception e) {}}
         
    @Benchmark
    public void lIIl11I1l() {
        Blackhole.consumeCPU(0);
    }
    @Benchmark
    public void I1I11l111() {
        Blackhole.consumeCPU(1);
    }
    @Benchmark
    public void l1l1lIl1l() {
        Blackhole.consumeCPU(2);
    }
    @Benchmark
    public void l1l11IIIl() {
        Blackhole.consumeCPU(4);
    }
    @Benchmark
    public void llllI1lI1() {
        Blackhole.consumeCPU(8);
    }
    @Benchmark
    public void I1II111l1() {
        Blackhole.consumeCPU(16);
    }
    @Benchmark
    public void I111l1II1() {
        Blackhole.consumeCPU(32);
    }
    @Benchmark
    public void I11l1lll1() {
        Blackhole.consumeCPU(64);
    }
    @Benchmark
    public void l1Ill1lll() {
        Blackhole.consumeCPU(128);
    }
    @Benchmark
    public void lIlI11lIl() {
        Blackhole.consumeCPU(256);
    }
    @Benchmark
    public void IIl1l111I() {
        Blackhole.consumeCPU(512);
    }
    @Benchmark
    public void IlIll1Il1() {
        Blackhole.consumeCPU(1024);
    }
    public static void main(String[] I11ll1lll) throws RunnerException {
        Options lll1lllll = new OptionsBuilder()
                .include(IIIIlIl1I.class.getSimpleName())
                .forks(1)
                .resultFormat(ResultFormatType.CSV)
                .result( "results\\ConsumeCPU\\JMHSample_21_ConsumeCPU_taint_bomb.csv")
                .build();
        new Runner(lll1lllll).run();
    }
}


