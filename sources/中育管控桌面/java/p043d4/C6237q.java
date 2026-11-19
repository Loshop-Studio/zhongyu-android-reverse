package p043d4;

import com.zykj.huiwei.launcher.viewmodels.PasswordSecurityLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d4.q */
/* loaded from: classes4.dex */
public final class C6237q {

    /* renamed from: a */
    public final String f7544a;

    /* renamed from: b */
    public final String f7545b;

    /* renamed from: c */
    public final String f7546c;

    /* renamed from: d */
    public final boolean f7547d;

    /* renamed from: e */
    public final boolean f7548e;

    /* renamed from: f */
    public final PasswordSecurityLevel f7549f;

    /* renamed from: g */
    public final boolean f7550g;

    /* renamed from: h */
    public final boolean f7551h;

    /* renamed from: i */
    public final String f7552i;

    public C6237q(String oldPwdText, String newPwdText, String confirmPwdText, boolean z6, boolean z7, PasswordSecurityLevel currentPolicy, boolean z8, boolean z9, String str) {
        Intrinsics.checkNotNullParameter(oldPwdText, "oldPwdText");
        Intrinsics.checkNotNullParameter(newPwdText, "newPwdText");
        Intrinsics.checkNotNullParameter(confirmPwdText, "confirmPwdText");
        Intrinsics.checkNotNullParameter(currentPolicy, "currentPolicy");
        this.f7544a = oldPwdText;
        this.f7545b = newPwdText;
        this.f7546c = confirmPwdText;
        this.f7547d = z6;
        this.f7548e = z7;
        this.f7549f = currentPolicy;
        this.f7550g = z8;
        this.f7551h = z9;
        this.f7552i = str;
    }

    /* renamed from: b */
    public static /* synthetic */ C6237q m6326b(C6237q c6237q, String str, String str2, String str3, boolean z6, boolean z7, PasswordSecurityLevel passwordSecurityLevel, boolean z8, boolean z9, String str4, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = c6237q.f7544a;
        }
        if ((i6 & 2) != 0) {
            str2 = c6237q.f7545b;
        }
        if ((i6 & 4) != 0) {
            str3 = c6237q.f7546c;
        }
        if ((i6 & 8) != 0) {
            z6 = c6237q.f7547d;
        }
        if ((i6 & 16) != 0) {
            z7 = c6237q.f7548e;
        }
        if ((i6 & 32) != 0) {
            passwordSecurityLevel = c6237q.f7549f;
        }
        if ((i6 & 64) != 0) {
            z8 = c6237q.f7550g;
        }
        if ((i6 & 128) != 0) {
            z9 = c6237q.f7551h;
        }
        if ((i6 & 256) != 0) {
            str4 = c6237q.f7552i;
        }
        boolean z10 = z9;
        String str5 = str4;
        PasswordSecurityLevel passwordSecurityLevel2 = passwordSecurityLevel;
        boolean z11 = z8;
        boolean z12 = z7;
        String str6 = str3;
        return c6237q.m6327a(str, str2, str6, z6, z12, passwordSecurityLevel2, z11, z10, str5);
    }

    /* renamed from: a */
    public final C6237q m6327a(String oldPwdText, String newPwdText, String confirmPwdText, boolean z6, boolean z7, PasswordSecurityLevel currentPolicy, boolean z8, boolean z9, String str) {
        Intrinsics.checkNotNullParameter(oldPwdText, "oldPwdText");
        Intrinsics.checkNotNullParameter(newPwdText, "newPwdText");
        Intrinsics.checkNotNullParameter(confirmPwdText, "confirmPwdText");
        Intrinsics.checkNotNullParameter(currentPolicy, "currentPolicy");
        return new C6237q(oldPwdText, newPwdText, confirmPwdText, z6, z7, currentPolicy, z8, z9, str);
    }

    /* renamed from: c */
    public final String m6328c() {
        return this.f7552i;
    }

    /* renamed from: d */
    public final String m6329d() {
        return this.f7546c;
    }

    /* renamed from: e */
    public final PasswordSecurityLevel m6330e() {
        return this.f7549f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6237q)) {
            return false;
        }
        C6237q c6237q = (C6237q) obj;
        return Intrinsics.areEqual(this.f7544a, c6237q.f7544a) && Intrinsics.areEqual(this.f7545b, c6237q.f7545b) && Intrinsics.areEqual(this.f7546c, c6237q.f7546c) && this.f7547d == c6237q.f7547d && this.f7548e == c6237q.f7548e && this.f7549f == c6237q.f7549f && this.f7550g == c6237q.f7550g && this.f7551h == c6237q.f7551h && Intrinsics.areEqual(this.f7552i, c6237q.f7552i);
    }

    /* renamed from: f */
    public final String m6331f() {
        return this.f7545b;
    }

    /* renamed from: g */
    public final String m6332g() {
        return this.f7544a;
    }

    /* renamed from: h */
    public final boolean m6333h() {
        return this.f7551h;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.f7544a.hashCode() * 31) + this.f7545b.hashCode()) * 31) + this.f7546c.hashCode()) * 31) + Boolean.hashCode(this.f7547d)) * 31) + Boolean.hashCode(this.f7548e)) * 31) + this.f7549f.hashCode()) * 31) + Boolean.hashCode(this.f7550g)) * 31) + Boolean.hashCode(this.f7551h)) * 31;
        String str = this.f7552i;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: i */
    public final boolean m6334i() {
        return this.f7550g;
    }

    /* renamed from: j */
    public final boolean m6335j() {
        return this.f7547d;
    }

    /* renamed from: k */
    public final boolean m6336k() {
        return this.f7548e;
    }

    public String toString() {
        return "ChangePwdUiState(oldPwdText=" + this.f7544a + ", newPwdText=" + this.f7545b + ", confirmPwdText=" + this.f7546c + ", isLoading=" + this.f7547d + ", isMatch=" + this.f7548e + ", currentPolicy=" + this.f7549f + ", showNewPwdError=" + this.f7550g + ", showConfirmError=" + this.f7551h + ", confirmErrorText=" + this.f7552i + ")";
    }

    public /* synthetic */ C6237q(String str, String str2, String str3, boolean z6, boolean z7, PasswordSecurityLevel passwordSecurityLevel, boolean z8, boolean z9, String str4, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? "" : str2, (i6 & 4) != 0 ? "" : str3, (i6 & 8) != 0 ? false : z6, (i6 & 16) != 0 ? false : z7, (i6 & 32) != 0 ? PasswordSecurityLevel.f7292f : passwordSecurityLevel, (i6 & 64) != 0 ? false : z8, (i6 & 128) != 0 ? false : z9, (i6 & 256) != 0 ? null : str4);
    }
}
