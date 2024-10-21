package org.sample;
import java.util.Base64;
import java.util.Arrays;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.lang.reflect.Method;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.results.format.ResultFormatType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(5)
@State(Scope.Benchmark)
public class ll1l1I1II {


private static List<byte[]> lIl1l1IlI(byte[] lllIII1II, int Ill1I11l1) {

    int l1lIIlll1 = lllIII1II.length;

    List<byte[]> llII1lIlI = new ArrayList<>();

    llII1lIlI.add(lllIII1II);



    for (int I11I11l1l = 1; I11I11l1l < Ill1I11l1; I11I11l1l++) {

        byte[] lll111I11 = llII1lIlI.get(llII1lIlI.size() - 1);

        byte[] ll1lIllIl = new byte[l1lIIlll1];



        for (int l111l1lIl = 0; l111l1lIl < l1lIIlll1; l111l1lIl++) {

            ll1lIllIl[l111l1lIl] = (byte) (lll111I11[(l111l1lIl + 1) % l1lIIlll1] ^

                    lll111I11[(l111l1lIl + 5) % l1lIIlll1] ^

                    lll111I11[(l111l1lIl + 13) % l1lIIlll1]);

        }



        for (int l111l1lIl = 0; l111l1lIl < l1lIIlll1; l111l1lIl++) {

            if (l111l1lIl % 2 == 0) {

                ll1lIllIl[l111l1lIl] = (byte) (~ll1lIllIl[l111l1lIl] & 0xFF);

            }

        }



        llII1lIlI.add(ll1lIllIl);

    }



    return llII1lIlI;

}



public static byte[] I1IlIII1l(byte[] I1Ill1lI1, byte[] IIIIll1l1) {

    byte[] lIII11lIl = Arrays.copyOfRange(I1Ill1lI1, 0, 8);

    byte[] lIl1Illll = Arrays.copyOfRange(I1Ill1lI1, 8, 16);

    byte[] l1IIl1llI = new byte[8];

    for (int I11I11l1l = 0; I11I11l1l < 8; I11I11l1l++) {

        l1IIl1llI[I11I11l1l] = (byte) (lIII11lIl[I11I11l1l] ^ IIIIll1l1[I11I11l1l]);

    }

    byte[] IIl11III1 = new byte[8];

    for (int I11I11l1l = 0; I11I11l1l < 8; I11I11l1l++) {

        IIl11III1[I11I11l1l] = (byte) (lIl1Illll[I11I11l1l] ^ l1IIl1llI[I11I11l1l]);

    }

    return lIIl1lIll(IIl11III1, lIII11lIl);

}



public static byte[] l1I11I1ll(byte[] l1I1l1l11, byte[] lllIII1II, int Ill1I11l1) throws NoSuchAlgorithmException {

    List<byte[]> IIIl1II1l = lIl1l1IlI(lllIII1II, Ill1I11l1);

    byte[] lI1I111lI = new byte[l1I1l1l11.length];

    for (int I11I11l1l = 0; I11I11l1l < l1I1l1l11.length; I11I11l1l += 16) {

        byte[] I1Ill1lI1 = Arrays.copyOfRange(l1I1l1l11, I11I11l1l, I11I11l1l + 16);

        for (int l111l1lIl = IIIl1II1l.size() - 1; l111l1lIl >= 0; l111l1lIl--) {

            I1Ill1lI1 = I1IlIII1l(I1Ill1lI1, IIIl1II1l.get(l111l1lIl));

        }

        System.arraycopy(I1Ill1lI1, 0, lI1I111lI, I11I11l1l, 16);

    }

    return IIlll1Il1(lI1I111lI);

}



public static byte[] lIIl1lIll(byte[] IIl111I1I, byte[] I11l1IlII) {

    byte[] ll1l11l11 = new byte[IIl111I1I.length + I11l1IlII.length];

    System.arraycopy(IIl111I1I, 0, ll1l11l11, 0, IIl111I1I.length);

    System.arraycopy(I11l1IlII, 0, ll1l11l11, IIl111I1I.length, I11l1IlII.length);

    return ll1l11l11;

}



public static byte[] IIlll1Il1(byte[] l1I1l1l11) {

    int I11I11l1l = l1I1l1l11.length - 1;

    while (I11I11l1l >= 0 && l1I1l1l11[I11I11l1l] == 0) {

        I11I11l1l--;

    }

    return Arrays.copyOf(l1I1l1l11, I11I11l1l + 1);

}



public static byte[] lIIlIIllI(String lllIII1II, String IlllIl11I) throws NoSuchAlgorithmException {

    byte[] I1I111I1I = Base64.getDecoder().decode(lllIII1II);

    byte[] l1lIlll1l = Base64.getDecoder().decode(IlllIl11I);



    byte[] II1IlIl11 = l1I11I1ll(I1I111I1I, l1lIlll1l, 16);



    return II1IlIl11;

}
public static final String[] IIll1lI1l = {"z9jdy4v5vDO3p5wTv27d6A==","z9jdy4v5vDO3p5wTv27d6A=="
};

private static final String I11III1lI = "OTRZlFkxgavlm6R/OwrgQA";
private static final String I1IIllI1l = "FFjkq397gh8";

        
             static{try {Class<?> III1llI1l = Class.forName("org.sample.ll1l1I1II");
             Method IIl1lI1Il = III1llI1l.getMethod("lIIlIIllI", String.class, String.class);
             Class<?> IIIIIIlll = Class.forName("org.sample.III11ll1I");
             Method IIllII1II = IIIIIIlll.getMethod("I1l1I1I1I", String.class, byte[].class);
             for (int I11I11l1l = 0; I11I11l1l < IIll1lI1l.length; I11I11l1l++) 
            {IIll1lI1l[I11I11l1l] = (String) IIllII1II.invoke(null, IIll1lI1l[I11I11l1l], (byte[]) IIl1lI1Il.invoke(null,I11III1lI,I1IIllI1l)); 
             }} catch (Exception e) {}}
         
    public static final int IllII1l1l = 20_000_000;
    private int[] IIlIIll1I = new int[IllII1l1l];
    private List<Integer> I1lI11IIl = new ArrayList<>(IllII1l1l);
    private List<Integer> Il1llIlll = new ArrayList<>(IllII1l1l);
    @Setup
    public void lI11lIl1l() {
        Random ll1l11Ill = new Random(1234);
        for (int I11I11l1l = 0; I11I11l1l < IllII1l1l; I11I11l1l++) {
            IIlIIll1I[I11I11l1l] = ll1l11Ill.nextInt();
            I1lI11IIl.add(IIlIIll1I[I11I11l1l]);
            Il1llIlll.add(IIlIIll1I[I11I11l1l]);
        }
        Collections.shuffle(Il1llIlll);
    }
    @Benchmark
    public long I1Ill1I1I() {
        long llllIl1lI = 0;
        for (int I11I11l1l = 0; I11I11l1l < IllII1l1l; I11I11l1l++) {
            llllIl1lI += IIlIIll1I[I11I11l1l];
        }
        return llllIl1lI;
    }
    @Benchmark
    public long llIl11I11() {
        long llllIl1lI = 0;
        for (int I11I11l1l = 0; I11I11l1l < IllII1l1l; I11I11l1l++) {
            llllIl1lI += I1lI11IIl.get(I11I11l1l);
        }
        return llllIl1lI;
    }
    @Benchmark
    public long I11IIIIIl() {
        long llllIl1lI = 0;
        for (int I11I11l1l = 0; I11I11l1l < IllII1l1l; I11I11l1l++) {
            llllIl1lI += Il1llIlll.get(I11I11l1l);
        }
        return llllIl1lI;
    }
    public static void main(String[] I11ll1lll) throws RunnerException {
        Options lll1lllll = new OptionsBuilder()
                .include(IIll1lI1l[1] + ll1l1I1II.class.getSimpleName() + IIll1lI1l[0])
                .resultFormat(ResultFormatType.CSV)
                .result( "results\\MemoryAccess\\JMHSample_39_Memory_taint_bomb.csv")
                .build();
        new Runner(lll1lllll).run();
    }
}


