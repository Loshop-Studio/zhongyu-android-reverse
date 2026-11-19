package p218r1;

import java.io.File;

/* renamed from: r1.a */
/* loaded from: classes4.dex */
public abstract class AbstractC8997a {

    /* renamed from: a */
    public static final File f15400a = new File("");

    /* renamed from: a */
    public boolean m15113a(AbstractC8997a abstractC8997a) {
        if (mo4388f().equals(abstractC8997a.mo4388f()) && !mo4388f().equals("") && !mo4386d().equals(f15400a)) {
            if (mo4387e().equals(abstractC8997a.mo4387e())) {
                return true;
            }
            if (!mo4386d().equals(abstractC8997a.mo4386d())) {
                return false;
            }
            String strMo4384b = mo4384b();
            String strMo4384b2 = abstractC8997a.mo4384b();
            if (strMo4384b2 != null && strMo4384b != null && strMo4384b2.equals(strMo4384b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public abstract String mo4384b();

    /* renamed from: c */
    public abstract int mo4385c();

    /* renamed from: d */
    public abstract File mo4386d();

    /* renamed from: e */
    public abstract File mo4387e();

    /* renamed from: f */
    public abstract String mo4388f();
}
