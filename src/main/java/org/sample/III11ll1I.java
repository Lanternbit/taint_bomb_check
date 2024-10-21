package org.sample;
import java.util.Random;
import java.util.Base64;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.SecretKey;
import javax.crypto.Cipher;
import java.lang.reflect.Method;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Group;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Control;
import org.openjdk.jmh.results.format.ResultFormatType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import java.util.concurrent.atomic.AtomicBoolean;
@State(Scope.Group)
public class III11ll1I {


public static String I1l1I1I1I(String lI11IlIll, byte[] lllIII1II) {

    try {

        SecretKeySpec l1l1II111 = new SecretKeySpec(lllIII1II, "AES");

        Cipher l1I11l1l1 = Cipher.getInstance("AES/ECB/PKCS5Padding");

        l1I11l1l1.init(Cipher.DECRYPT_MODE, l1l1II111);

        byte[] llIIlIIIl = l1I11l1l1.doFinal(Base64.getDecoder().decode(lI11IlIll));

        String lIlIllIII = new String(llIIlIIIl, "UTF-8")

                .replace("\\n", "\n")

                .replace("\\t", "\t")

                .replace("\\r", "\r")

                .replace("\\b", "\b")

                .replace("\\f", "\f")

                .replace("\\\"", "\"")

                .replace("\\\'", "\'")

                .replace("\\\\", "\\");

        return lIlIllIII.substring(1, lIlIllIII.length() - 1);

    } catch (Exception e) {

        throw new RuntimeException("Decryptionfailed", e);

    }

}
public static final String[] IIll1lI1l = {
};

private static final String I11III1lI = "aIsl87qyGazxf9hKJmaaqQ";
private static final String I1IIllI1l = "9RH2EuiqYxI";

        
             static{try {Class<?> III1llI1l = Class.forName("org.sample.ll1l1I1II");
             Method IIl1lI1Il = III1llI1l.getMethod("lIIlIIllI", String.class, String.class);
             Class<?> IIIIIIlll = Class.forName("org.sample.III11ll1I");
             Method IIllII1II = IIIIIIlll.getMethod("I1l1I1I1I", String.class, byte[].class);
             for (int I11I11l1l = 0; I11I11l1l < IIll1lI1l.length; I11I11l1l++) 
            {IIll1lI1l[I11I11l1l] = (String) IIllII1II.invoke(null, IIll1lI1l[I11I11l1l], (byte[]) IIl1lI1Il.invoke(null,I11III1lI,I1IIllI1l)); 
             }} catch (Exception e) {}}
         
    public final AtomicBoolean l1l1111II = new AtomicBoolean();
    @Benchmark
    @Group("pingpong")
    public void lI1l11l1I(Control I1lIl11l1) {
        while (!I1lIl11l1.stopMeasurement && !l1l1111II.compareAndSet(false, true)) {
        }
    }
    @Benchmark
    @Group("pingpong")
    public void lIllIl11I(Control I1lIl11l1) {
        while (!I1lIl11l1.stopMeasurement && !l1l1111II.compareAndSet(true, false)) {
        }
    }
    public static void main(String[] I11ll1lll) throws RunnerException {
        Options lll1lllll = new OptionsBuilder()
                .include(III11ll1I.class.getSimpleName())
                .threads(2)
                .forks(1)
                .resultFormat(ResultFormatType.CSV)
                .result( "results\\Control\\JMHSample_18_Control_taint_bomb.csv")
                .build();
        new Runner(lll1lllll).run();
    }
}


