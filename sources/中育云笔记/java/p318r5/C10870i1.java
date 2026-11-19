package p318r5;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import p007a6.AbstractC0063c;
import p007a6.AbstractC0064d;
import p418y5.AbstractC11912a;

/* renamed from: r5.i1 */
/* loaded from: classes5.dex */
public class C10870i1 {

    /* renamed from: a */
    public String f26235a = AbstractC10900v0.m23682q().getFilesDir().getPath();

    /* renamed from: h */
    public static boolean m23486h(File file) {
        File[] fileArrListFiles;
        if (file == null || !file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles()) == null || fileArrListFiles.length == 0) {
            return false;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isFile()) {
                if (!file2.delete()) {
                    AbstractC10861f1.m23436h("hmsSdk", "delete file failed : " + file2.getName());
                }
            } else if (file2.isDirectory()) {
                m23486h(file2);
            }
        }
        return file.delete();
    }

    /* renamed from: i */
    public static boolean m23487i() {
        return m23486h(new File(AbstractC10900v0.m23682q().getFilesDir().getPath() + MqttTopic.TOPIC_LEVEL_SEPARATOR + "hms"));
    }

    /* renamed from: a */
    public String m23488a() throws Throwable {
        String strM23493f;
        String strM23493f2;
        String strM23493f3;
        String strM23493f4;
        String strM23495j = m23495j();
        if (m23494g()) {
            AbstractC10861f1.m23436h("hmsSdk", "refresh components");
            strM23493f = AbstractC0063c.m125e(128);
            m23490c("aprpap", strM23493f);
            strM23493f2 = AbstractC0063c.m125e(128);
            m23490c("febdoc", strM23493f2);
            strM23493f3 = AbstractC0063c.m125e(128);
            m23490c("marfil", strM23493f3);
            strM23493f4 = AbstractC0063c.m125e(128);
            m23490c("maywnj", strM23493f4);
            AbstractC10877l.m23522f(AbstractC10900v0.m23682q(), "Privacy_MY", "assemblyFlash", System.currentTimeMillis());
        } else {
            strM23493f = m23493f("aprpap");
            strM23493f2 = m23493f("febdoc");
            strM23493f3 = m23493f("marfil");
            strM23493f4 = m23493f("maywnj");
        }
        return AbstractC0064d.m127a(AbstractC11912a.m26447b(m23492e(strM23493f, strM23493f2, strM23493f3, strM23495j), AbstractC0064d.m128b(strM23493f4), 10000, 16));
    }

    /* renamed from: b */
    public final String m23489b(String str) {
        return this.f26235a + "/hms/component/".replace("component", str);
    }

    /* renamed from: c */
    public final void m23490c(String str, String str2) throws Throwable {
        File file = new File(m23489b(str));
        File file2 = new File(m23489b(str), "hianalytics_" + str);
        if (!file.exists() && file.mkdirs()) {
            AbstractC10861f1.m23436h("hmsSdk", "file directory is mkdirs");
        }
        if (m23491d(file2)) {
            AbstractC10863g0.m23451d(file2, str2);
        } else {
            AbstractC10861f1.m23441m("hmsSdk", "refreshComponent():file is not found,and file is create failed");
        }
    }

    /* renamed from: d */
    public final boolean m23491d(File file) {
        if (file.exists()) {
            return true;
        }
        try {
            return file.createNewFile();
        } catch (IOException unused) {
            AbstractC10861f1.m23441m("hmsSdk", "create new file error!");
            return false;
        }
    }

    /* renamed from: e */
    public final char[] m23492e(String str, String str2, String str3, String str4) throws UnsupportedEncodingException {
        byte[] bArrM128b = AbstractC0064d.m128b(str);
        byte[] bArrM128b2 = AbstractC0064d.m128b(str2);
        byte[] bArrM128b3 = AbstractC0064d.m128b(str3);
        byte[] bArrM128b4 = AbstractC0064d.m128b(str4);
        int length = bArrM128b.length;
        if (length > bArrM128b2.length) {
            length = bArrM128b2.length;
        }
        if (length > bArrM128b3.length) {
            length = bArrM128b3.length;
        }
        if (length > bArrM128b4.length) {
            length = bArrM128b4.length;
        }
        char[] cArr = new char[length];
        for (int i10 = 0; i10 < length; i10++) {
            cArr[i10] = (char) (((bArrM128b[i10] ^ bArrM128b2[i10]) ^ bArrM128b3[i10]) ^ bArrM128b4[i10]);
        }
        return cArr;
    }

    /* renamed from: f */
    public final String m23493f(String str) throws Throwable {
        File file = new File(m23489b(str), "hianalytics_" + str);
        if (m23491d(file)) {
            return AbstractC10863g0.m23448a(file);
        }
        String strM125e = AbstractC0063c.m125e(128);
        AbstractC10863g0.m23451d(file, strM125e);
        return strM125e;
    }

    /* renamed from: g */
    public final boolean m23494g() {
        long jM23517a = AbstractC10877l.m23517a(AbstractC10900v0.m23682q(), "Privacy_MY", "assemblyFlash", -1L);
        if (-1 != jM23517a) {
            return System.currentTimeMillis() - jM23517a > 31536000000L;
        }
        AbstractC10861f1.m23436h("hmsSdk", "First init components");
        return true;
    }

    /* renamed from: j */
    public final String m23495j() {
        return "f6040d0e807aaec325ecf44823765544e92905158169f694b282bf17388632cf95a83bae7d2d235c1f039b0df1dcca5fda619b6f7f459f2ff8d70ddb7b601592fe29fcae58c028f319b3b12495e67aa5390942a997a8cb572c8030b2df5c2b622608bea02b0c3e5d4dff3f72c9e3204049a45c0760cd3604af8d57f0e0c693cc";
    }
}
