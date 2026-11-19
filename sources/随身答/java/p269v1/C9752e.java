package p269v1;

import com.liulishuo.okdownload.C6593a;
import java.io.File;
import java.io.IOException;
import p209p1.C9315d;
import p229r1.C9419c;
import p229r1.InterfaceC9425i;

/* renamed from: v1.e */
/* loaded from: classes4.dex */
public class C9752e {

    /* renamed from: a */
    public final C9750c f17260a = new C9750c();

    /* renamed from: b */
    public C9751d m16331b(C6593a c6593a, C9419c c9419c, InterfaceC9425i interfaceC9425i) {
        return new C9751d(c6593a, c9419c, interfaceC9425i);
    }

    /* renamed from: c */
    public void m16332c(C6593a c6593a) throws IOException {
        File fileM4596l = c6593a.m4596l();
        if (fileM4596l != null && fileM4596l.exists() && !fileM4596l.delete()) {
            throw new IOException("Delete file failed!");
        }
    }

    /* renamed from: d */
    public C9750c m16333d() {
        return this.f17260a;
    }

    /* renamed from: e */
    public boolean m16334e(C6593a c6593a) {
        if (!C9315d.m15182k().m15190h().mo16297b()) {
            return false;
        }
        if (c6593a.m4608x() != null) {
            return c6593a.m4608x().booleanValue();
        }
        return true;
    }

    /* renamed from: a */
    public void m16330a(C9751d c9751d, C6593a c6593a) {
    }
}
