package p272w1;

import com.liulishuo.okdownload.C6327a;
import java.io.File;
import java.io.IOException;
import p207q1.C8879d;
import p229s1.C9126c;
import p229s1.InterfaceC9132i;

/* renamed from: w1.e */
/* loaded from: classes4.dex */
public class C9731e {

    /* renamed from: a */
    public final C9729c f17099a = new C9729c();

    /* renamed from: b */
    public C9730d m16298b(C6327a c6327a, C9126c c9126c, InterfaceC9132i interfaceC9132i) {
        return new C9730d(c6327a, c9126c, interfaceC9132i);
    }

    /* renamed from: c */
    public void m16299c(C6327a c6327a) throws IOException {
        File fileM4392l = c6327a.m4392l();
        if (fileM4392l != null && fileM4392l.exists() && !fileM4392l.delete()) {
            throw new IOException("Delete file failed!");
        }
    }

    /* renamed from: d */
    public C9729c m16300d() {
        return this.f17099a;
    }

    /* renamed from: e */
    public boolean m16301e(C6327a c6327a) {
        if (!C8879d.m14905k().m14913h().mo16264b()) {
            return false;
        }
        if (c6327a.m4404x() != null) {
            return c6327a.m4404x().booleanValue();
        }
        return true;
    }

    /* renamed from: a */
    public void m16297a(C9730d c9730d, C6327a c6327a) {
    }
}
