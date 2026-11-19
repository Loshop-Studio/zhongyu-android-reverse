package p243s5;

import com.zykj.view.R$color;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8809v;

/* renamed from: s5.c0 */
/* loaded from: classes5.dex */
public final class C10019c0 {

    /* renamed from: e */
    public static final a f20042e = new a(null);

    /* renamed from: a */
    public final double f20043a;

    /* renamed from: b */
    public final String f20044b;

    /* renamed from: c */
    public final boolean f20045c;

    /* renamed from: d */
    public final int f20046d;

    /* renamed from: s5.c0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final List m18726a() {
            C10019c0 c10019c0 = new C10019c0(2.0d, "2.0X", false, 0, 12, null);
            Object[] objArr = 0 == true ? 1 : 0;
            C10019c0 c10019c02 = new C10019c0(1.75d, "1.75X", objArr, 0, 12, null);
            Object[] objArr2 = 0 == true ? 1 : 0;
            C10019c0 c10019c03 = new C10019c0(1.5d, "1.5X", objArr2, 0, 12, null);
            Object[] objArr3 = 0 == true ? 1 : 0;
            C10019c0 c10019c04 = new C10019c0(1.25d, "1.25X", objArr3, 0, 12, null);
            C10019c0 c10019c05 = new C10019c0(1.0d, "1.0X", true, 0, 8, null);
            Object[] objArr4 = 0 == true ? 1 : 0;
            int i10 = 0;
            return AbstractC8809v.m14764g(c10019c0, c10019c02, c10019c03, c10019c04, c10019c05, new C10019c0(0.75d, "0.75X", objArr4, 0, 12, null), new C10019c0(0.5d, "0.5X", 0 == true ? 1 : 0, i10, 12, null));
        }

        public a() {
        }
    }

    public C10019c0(double d10, String label, boolean z10, int i10) {
        AbstractC9133u.m16133g(label, "label");
        this.f20043a = d10;
        this.f20044b = label;
        this.f20045c = z10;
        this.f20046d = i10;
    }

    /* renamed from: b */
    public static /* synthetic */ C10019c0 m18720b(C10019c0 c10019c0, double d10, String str, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d10 = c10019c0.f20043a;
        }
        double d11 = d10;
        if ((i11 & 2) != 0) {
            str = c10019c0.f20044b;
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            z10 = c10019c0.f20045c;
        }
        boolean z11 = z10;
        if ((i11 & 8) != 0) {
            i10 = c10019c0.f20046d;
        }
        return c10019c0.m18721a(d11, str2, z11, i10);
    }

    /* renamed from: a */
    public final C10019c0 m18721a(double d10, String label, boolean z10, int i10) {
        AbstractC9133u.m16133g(label, "label");
        return new C10019c0(d10, label, z10, i10);
    }

    /* renamed from: c */
    public final String m18722c() {
        return this.f20044b;
    }

    /* renamed from: d */
    public final boolean m18723d() {
        return this.f20045c;
    }

    /* renamed from: e */
    public final double m18724e() {
        return this.f20043a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10019c0)) {
            return false;
        }
        C10019c0 c10019c0 = (C10019c0) obj;
        return Double.compare(this.f20043a, c10019c0.f20043a) == 0 && AbstractC9133u.m16128b(this.f20044b, c10019c0.f20044b) && this.f20045c == c10019c0.f20045c && this.f20046d == c10019c0.f20046d;
    }

    /* renamed from: f */
    public final int m18725f() {
        return this.f20046d;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.f20043a) * 31) + this.f20044b.hashCode()) * 31) + Boolean.hashCode(this.f20045c)) * 31) + Integer.hashCode(this.f20046d);
    }

    public String toString() {
        return "SpeedRate(speed=" + this.f20043a + ", label=" + this.f20044b + ", selected=" + this.f20045c + ", textColor=" + this.f20046d + ")";
    }

    public /* synthetic */ C10019c0(double d10, String str, boolean z10, int i10, int i11, AbstractC9126n abstractC9126n) {
        this(d10, str, (i11 & 4) != 0 ? false : z10, (i11 & 8) != 0 ? R$color.view_selector_green_white : i10);
    }
}
