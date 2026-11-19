package p215k2;

import com.blankj.utilcode.util.PathUtils;
import com.friday.common.helper.C5962b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC9979u;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import p411xe.AbstractC11878c;
import p411xe.C11877b;

/* renamed from: k2.q */
/* loaded from: classes3.dex */
public final class C9799q {

    /* renamed from: a */
    public static final C9799q f22994a = new C9799q();

    /* renamed from: b */
    public static volatile int f22995b = 21;

    /* renamed from: c */
    public static final int f22996c = 8;

    /* renamed from: a */
    public final String m19799a(String filename) throws IOException {
        AbstractC9979u.m20294g(filename, "filename");
        C11877b c11877b = new C11877b();
        File file = new File(PathUtils.getExternalAppCachePath() + MqttTopic.TOPIC_LEVEL_SEPARATOR + AbstractC9803u.m19814a() + ".jpg");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            try {
                c11877b.m25986o(10000);
                c11877b.m25977f(C5962b.f6082a.m5299a().m5283k(), f22995b);
                c11877b.m26404l0("tester", "testing");
                if (!AbstractC11878c.m26414a(c11877b.m26361C())) {
                    c11877b.mo25978g();
                    fileOutputStream.close();
                    if (c11877b.m25985n()) {
                        try {
                            c11877b.m26405m0();
                            c11877b.mo25978g();
                        } catch (IOException unused) {
                        }
                    }
                    return null;
                }
                c11877b.m26409q0(2);
                c11877b.m26393a0();
                c11877b.m26408p0(filename, fileOutputStream);
                fileOutputStream.close();
                if (c11877b.m25985n()) {
                    try {
                        c11877b.m26405m0();
                        c11877b.mo25978g();
                    } catch (IOException unused2) {
                    }
                }
                return file.getAbsolutePath();
            } catch (Exception e10) {
                e10.printStackTrace();
                fileOutputStream.close();
                if (!c11877b.m25985n()) {
                    return null;
                }
                try {
                    c11877b.m26405m0();
                    c11877b.mo25978g();
                    return null;
                } catch (IOException unused3) {
                    return null;
                }
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            if (c11877b.m25985n()) {
                try {
                    c11877b.m26405m0();
                    c11877b.mo25978g();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0016  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m19800b(java.lang.Integer r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L16
            int r0 = r3.intValue()
            r1 = 1
            if (r1 > r0) goto Le
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r0 >= r1) goto Le
            goto Lf
        Le:
            r3 = 0
        Lf:
            if (r3 == 0) goto L16
            int r3 = r3.intValue()
            goto L18
        L16:
            r3 = 21
        L18:
            p215k2.C9799q.f22995b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p215k2.C9799q.m19800b(java.lang.Integer):void");
    }

    /* renamed from: c */
    public final boolean m19801c(String str, InputStream input) throws IOException {
        AbstractC9979u.m20294g(input, "input");
        C11877b c11877b = new C11877b();
        try {
            try {
                c11877b.m25986o(10000);
                c11877b.m25977f(C5962b.f6082a.m5299a().m5283k(), f22995b);
                c11877b.m26404l0("tester", "testing");
                if (!AbstractC11878c.m26414a(c11877b.m26361C())) {
                    c11877b.mo25978g();
                    input.close();
                    if (c11877b.m25985n()) {
                        try {
                            c11877b.m26405m0();
                            c11877b.mo25978g();
                        } catch (IOException unused) {
                        }
                    }
                    return false;
                }
                c11877b.m26409q0(2);
                c11877b.m26393a0();
                c11877b.m26410r0(str, input);
                input.close();
                if (c11877b.m25985n()) {
                    try {
                        c11877b.m26405m0();
                        c11877b.mo25978g();
                    } catch (IOException unused2) {
                    }
                }
                return true;
            } catch (IOException e10) {
                e10.printStackTrace();
                input.close();
                if (!c11877b.m25985n()) {
                    return false;
                }
                try {
                    c11877b.m26405m0();
                    c11877b.mo25978g();
                    return false;
                } catch (IOException unused3) {
                    return false;
                }
            }
        } catch (Throwable th) {
            input.close();
            if (c11877b.m25985n()) {
                try {
                    c11877b.m26405m0();
                    c11877b.mo25978g();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }
}
