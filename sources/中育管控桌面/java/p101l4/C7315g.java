package p101l4;

import com.zykj.huiwei.launcher.viewmodels.PasswordSecurityLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: l4.g */
/* loaded from: classes4.dex */
public final class C7315g {

    /* renamed from: a */
    public final String f9294a;

    /* renamed from: b */
    public final String f9295b;

    /* renamed from: c */
    public final boolean f9296c;

    /* renamed from: d */
    public final boolean f9297d;

    /* renamed from: e */
    public final PasswordSecurityLevel f9298e;

    /* renamed from: f */
    public final boolean f9299f;

    /* renamed from: g */
    public final String f9300g;

    /* renamed from: h */
    public final boolean f9301h;

    /* renamed from: i */
    public final boolean f9302i;

    /* renamed from: j */
    public final String f9303j;

    public C7315g(String newPwdText, String confirmPwdText, boolean z6, boolean z7, PasswordSecurityLevel currentPolicy, boolean z8, String str, boolean z9, boolean z10, String str2) {
        Intrinsics.checkNotNullParameter(newPwdText, "newPwdText");
        Intrinsics.checkNotNullParameter(confirmPwdText, "confirmPwdText");
        Intrinsics.checkNotNullParameter(currentPolicy, "currentPolicy");
        this.f9294a = newPwdText;
        this.f9295b = confirmPwdText;
        this.f9296c = z6;
        this.f9297d = z7;
        this.f9298e = currentPolicy;
        this.f9299f = z8;
        this.f9300g = str;
        this.f9301h = z9;
        this.f9302i = z10;
        this.f9303j = str2;
    }

    /* renamed from: b */
    public static /* synthetic */ C7315g m8297b(C7315g c7315g, String str, String str2, boolean z6, boolean z7, PasswordSecurityLevel passwordSecurityLevel, boolean z8, String str3, boolean z9, boolean z10, String str4, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = c7315g.f9294a;
        }
        if ((i6 & 2) != 0) {
            str2 = c7315g.f9295b;
        }
        if ((i6 & 4) != 0) {
            z6 = c7315g.f9296c;
        }
        if ((i6 & 8) != 0) {
            z7 = c7315g.f9297d;
        }
        if ((i6 & 16) != 0) {
            passwordSecurityLevel = c7315g.f9298e;
        }
        if ((i6 & 32) != 0) {
            z8 = c7315g.f9299f;
        }
        if ((i6 & 64) != 0) {
            str3 = c7315g.f9300g;
        }
        if ((i6 & 128) != 0) {
            z9 = c7315g.f9301h;
        }
        if ((i6 & 256) != 0) {
            z10 = c7315g.f9302i;
        }
        if ((i6 & 512) != 0) {
            str4 = c7315g.f9303j;
        }
        boolean z11 = z10;
        String str5 = str4;
        String str6 = str3;
        boolean z12 = z9;
        PasswordSecurityLevel passwordSecurityLevel2 = passwordSecurityLevel;
        boolean z13 = z8;
        return c7315g.m8298a(str, str2, z6, z7, passwordSecurityLevel2, z13, str6, z12, z11, str5);
    }

    /* renamed from: a */
    public final C7315g m8298a(String newPwdText, String confirmPwdText, boolean z6, boolean z7, PasswordSecurityLevel currentPolicy, boolean z8, String str, boolean z9, boolean z10, String str2) {
        Intrinsics.checkNotNullParameter(newPwdText, "newPwdText");
        Intrinsics.checkNotNullParameter(confirmPwdText, "confirmPwdText");
        Intrinsics.checkNotNullParameter(currentPolicy, "currentPolicy");
        return new C7315g(newPwdText, confirmPwdText, z6, z7, currentPolicy, z8, str, z9, z10, str2);
    }

    /* renamed from: c */
    public final String m8299c() {
        return this.f9303j;
    }

    /* renamed from: d */
    public final String m8300d() {
        return this.f9295b;
    }

    /* renamed from: e */
    public final PasswordSecurityLevel m8301e() {
        return this.f9298e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7315g)) {
            return false;
        }
        C7315g c7315g = (C7315g) obj;
        return Intrinsics.areEqual(this.f9294a, c7315g.f9294a) && Intrinsics.areEqual(this.f9295b, c7315g.f9295b) && this.f9296c == c7315g.f9296c && this.f9297d == c7315g.f9297d && this.f9298e == c7315g.f9298e && this.f9299f == c7315g.f9299f && Intrinsics.areEqual(this.f9300g, c7315g.f9300g) && this.f9301h == c7315g.f9301h && this.f9302i == c7315g.f9302i && Intrinsics.areEqual(this.f9303j, c7315g.f9303j);
    }

    /* renamed from: f */
    public final String m8302f() {
        return this.f9300g;
    }

    /* renamed from: g */
    public final String m8303g() {
        return this.f9294a;
    }

    /* renamed from: h */
    public final boolean m8304h() {
        return this.f9302i;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.f9294a.hashCode() * 31) + this.f9295b.hashCode()) * 31) + Boolean.hashCode(this.f9296c)) * 31) + Boolean.hashCode(this.f9297d)) * 31) + this.f9298e.hashCode()) * 31) + Boolean.hashCode(this.f9299f)) * 31;
        String str = this.f9300g;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.f9301h)) * 31) + Boolean.hashCode(this.f9302i)) * 31;
        String str2 = this.f9303j;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: i */
    public final boolean m8305i() {
        return this.f9301h;
    }

    /* renamed from: j */
    public final boolean m8306j() {
        return this.f9296c;
    }

    /* renamed from: k */
    public final boolean m8307k() {
        return this.f9297d;
    }

    /* renamed from: l */
    public final boolean m8308l() {
        return this.f9299f;
    }

    public String toString() {
        return "ChangePwdUiState(newPwdText=" + this.f9294a + ", confirmPwdText=" + this.f9295b + ", isLoading=" + this.f9296c + ", isMatch=" + this.f9297d + ", currentPolicy=" + this.f9298e + ", isSuccess=" + this.f9299f + ", errorMsg=" + this.f9300g + ", showNewPwdError=" + this.f9301h + ", showConfirmError=" + this.f9302i + ", confirmErrorText=" + this.f9303j + ")";
    }

    public /* synthetic */ C7315g(String str, String str2, boolean z6, boolean z7, PasswordSecurityLevel passwordSecurityLevel, boolean z8, String str3, boolean z9, boolean z10, String str4, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? "" : str2, (i6 & 4) != 0 ? false : z6, (i6 & 8) != 0 ? false : z7, (i6 & 16) != 0 ? PasswordSecurityLevel.f7292f : passwordSecurityLevel, (i6 & 32) != 0 ? false : z8, (i6 & 64) != 0 ? null : str3, (i6 & 128) != 0 ? false : z9, (i6 & 256) != 0 ? false : z10, (i6 & 512) != 0 ? null : str4);
    }
}
