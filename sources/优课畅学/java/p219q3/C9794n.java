package p219q3;

import com.zykj.lib.login.p062ui.teacher.pwd.PasswordSecurityLevel;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: q3.n */
/* loaded from: classes4.dex */
public final class C9794n {

    /* renamed from: a */
    public final String f19583a;

    /* renamed from: b */
    public final String f19584b;

    /* renamed from: c */
    public final boolean f19585c;

    /* renamed from: d */
    public final boolean f19586d;

    /* renamed from: e */
    public final PasswordSecurityLevel f19587e;

    /* renamed from: f */
    public final boolean f19588f;

    /* renamed from: g */
    public final String f19589g;

    /* renamed from: h */
    public final boolean f19590h;

    /* renamed from: i */
    public final String f19591i;

    public C9794n(String newPwdText, String confirmPwdText, boolean z10, boolean z11, PasswordSecurityLevel currentPolicy, boolean z12, String str, boolean z13, String str2) {
        AbstractC9133u.m16133g(newPwdText, "newPwdText");
        AbstractC9133u.m16133g(confirmPwdText, "confirmPwdText");
        AbstractC9133u.m16133g(currentPolicy, "currentPolicy");
        this.f19583a = newPwdText;
        this.f19584b = confirmPwdText;
        this.f19585c = z10;
        this.f19586d = z11;
        this.f19587e = currentPolicy;
        this.f19588f = z12;
        this.f19589g = str;
        this.f19590h = z13;
        this.f19591i = str2;
    }

    /* renamed from: b */
    public static /* synthetic */ C9794n m18342b(C9794n c9794n, String str, String str2, boolean z10, boolean z11, PasswordSecurityLevel passwordSecurityLevel, boolean z12, String str3, boolean z13, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c9794n.f19583a;
        }
        if ((i10 & 2) != 0) {
            str2 = c9794n.f19584b;
        }
        if ((i10 & 4) != 0) {
            z10 = c9794n.f19585c;
        }
        if ((i10 & 8) != 0) {
            z11 = c9794n.f19586d;
        }
        if ((i10 & 16) != 0) {
            passwordSecurityLevel = c9794n.f19587e;
        }
        if ((i10 & 32) != 0) {
            z12 = c9794n.f19588f;
        }
        if ((i10 & 64) != 0) {
            str3 = c9794n.f19589g;
        }
        if ((i10 & 128) != 0) {
            z13 = c9794n.f19590h;
        }
        if ((i10 & 256) != 0) {
            str4 = c9794n.f19591i;
        }
        boolean z14 = z13;
        String str5 = str4;
        boolean z15 = z12;
        String str6 = str3;
        PasswordSecurityLevel passwordSecurityLevel2 = passwordSecurityLevel;
        boolean z16 = z10;
        return c9794n.m18343a(str, str2, z16, z11, passwordSecurityLevel2, z15, str6, z14, str5);
    }

    /* renamed from: a */
    public final C9794n m18343a(String newPwdText, String confirmPwdText, boolean z10, boolean z11, PasswordSecurityLevel currentPolicy, boolean z12, String str, boolean z13, String str2) {
        AbstractC9133u.m16133g(newPwdText, "newPwdText");
        AbstractC9133u.m16133g(confirmPwdText, "confirmPwdText");
        AbstractC9133u.m16133g(currentPolicy, "currentPolicy");
        return new C9794n(newPwdText, confirmPwdText, z10, z11, currentPolicy, z12, str, z13, str2);
    }

    /* renamed from: c */
    public final String m18344c() {
        return this.f19591i;
    }

    /* renamed from: d */
    public final String m18345d() {
        return this.f19584b;
    }

    /* renamed from: e */
    public final PasswordSecurityLevel m18346e() {
        return this.f19587e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9794n)) {
            return false;
        }
        C9794n c9794n = (C9794n) obj;
        return AbstractC9133u.m16128b(this.f19583a, c9794n.f19583a) && AbstractC9133u.m16128b(this.f19584b, c9794n.f19584b) && this.f19585c == c9794n.f19585c && this.f19586d == c9794n.f19586d && this.f19587e == c9794n.f19587e && this.f19588f == c9794n.f19588f && AbstractC9133u.m16128b(this.f19589g, c9794n.f19589g) && this.f19590h == c9794n.f19590h && AbstractC9133u.m16128b(this.f19591i, c9794n.f19591i);
    }

    /* renamed from: f */
    public final String m18347f() {
        return this.f19583a;
    }

    /* renamed from: g */
    public final boolean m18348g() {
        return this.f19590h;
    }

    /* renamed from: h */
    public final boolean m18349h() {
        return this.f19588f;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.f19583a.hashCode() * 31) + this.f19584b.hashCode()) * 31) + Boolean.hashCode(this.f19585c)) * 31) + Boolean.hashCode(this.f19586d)) * 31) + this.f19587e.hashCode()) * 31) + Boolean.hashCode(this.f19588f)) * 31;
        String str = this.f19589g;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.f19590h)) * 31;
        String str2 = this.f19591i;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: i */
    public final boolean m18350i() {
        return this.f19585c;
    }

    /* renamed from: j */
    public final boolean m18351j() {
        return this.f19586d;
    }

    public String toString() {
        return "ChangePwdUiState(newPwdText=" + this.f19583a + ", confirmPwdText=" + this.f19584b + ", isLoading=" + this.f19585c + ", isMatch=" + this.f19586d + ", currentPolicy=" + this.f19587e + ", showNewPwdError=" + this.f19588f + ", newPwdErrorText=" + this.f19589g + ", showConfirmError=" + this.f19590h + ", confirmErrorText=" + this.f19591i + ")";
    }

    public /* synthetic */ C9794n(String str, String str2, boolean z10, boolean z11, PasswordSecurityLevel passwordSecurityLevel, boolean z12, String str3, boolean z13, String str4, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? PasswordSecurityLevel.f10085f : passwordSecurityLevel, (i10 & 32) != 0 ? false : z12, (i10 & 64) != 0 ? null : str3, (i10 & 128) != 0 ? false : z13, (i10 & 256) != 0 ? null : str4);
    }
}
