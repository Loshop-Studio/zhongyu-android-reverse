package p219q1;

import java.io.File;

/* renamed from: q1.a */
/* loaded from: classes4.dex */
public abstract class AbstractC9351a {

    /* renamed from: a */
    public static final File f16249a = new File("");

    /* renamed from: a */
    public boolean m15294a(AbstractC9351a abstractC9351a) {
        if (mo4592f().equals(abstractC9351a.mo4592f()) && !mo4592f().equals("") && !mo4590d().equals(f16249a)) {
            if (mo4591e().equals(abstractC9351a.mo4591e())) {
                return true;
            }
            if (!mo4590d().equals(abstractC9351a.mo4590d())) {
                return false;
            }
            String strMo4588b = mo4588b();
            String strMo4588b2 = abstractC9351a.mo4588b();
            if (strMo4588b2 != null && strMo4588b != null && strMo4588b2.equals(strMo4588b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public abstract String mo4588b();

    /* renamed from: c */
    public abstract int mo4589c();

    /* renamed from: d */
    public abstract File mo4590d();

    /* renamed from: e */
    public abstract File mo4591e();

    /* renamed from: f */
    public abstract String mo4592f();
}
