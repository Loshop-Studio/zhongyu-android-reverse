package p246t7;

import com.zykj.view.R$color;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t7.c0 */
/* loaded from: classes5.dex */
public final class C9469c0 {

    /* renamed from: e */
    public static final a f16541e = new a(null);

    /* renamed from: a */
    public final double f16542a;

    /* renamed from: b */
    public final String f16543b;

    /* renamed from: c */
    public final boolean f16544c;

    /* renamed from: d */
    public final int f16545d;

    /* renamed from: t7.c0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final List m15848a() {
            C9469c0 c9469c0 = new C9469c0(2.0d, "2.0X", false, 0, 12, null);
            Object[] objArr = 0 == true ? 1 : 0;
            C9469c0 c9469c02 = new C9469c0(1.75d, "1.75X", objArr, 0, 12, null);
            Object[] objArr2 = 0 == true ? 1 : 0;
            C9469c0 c9469c03 = new C9469c0(1.5d, "1.5X", objArr2, 0, 12, null);
            Object[] objArr3 = 0 == true ? 1 : 0;
            C9469c0 c9469c04 = new C9469c0(1.25d, "1.25X", objArr3, 0, 12, null);
            C9469c0 c9469c05 = new C9469c0(1.0d, "1.0X", true, 0, 8, null);
            Object[] objArr4 = 0 == true ? 1 : 0;
            int i10 = 0;
            return CollectionsKt.arrayListOf(c9469c0, c9469c02, c9469c03, c9469c04, c9469c05, new C9469c0(0.75d, "0.75X", objArr4, 0, 12, null), new C9469c0(0.5d, "0.5X", 0 == true ? 1 : 0, i10, 12, null));
        }

        public a() {
        }
    }

    public C9469c0(double d10, String label, boolean z9, int i10) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f16542a = d10;
        this.f16543b = label;
        this.f16544c = z9;
        this.f16545d = i10;
    }

    /* renamed from: b */
    public static /* synthetic */ C9469c0 m15842b(C9469c0 c9469c0, double d10, String str, boolean z9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d10 = c9469c0.f16542a;
        }
        double d11 = d10;
        if ((i11 & 2) != 0) {
            str = c9469c0.f16543b;
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            z9 = c9469c0.f16544c;
        }
        boolean z10 = z9;
        if ((i11 & 8) != 0) {
            i10 = c9469c0.f16545d;
        }
        return c9469c0.m15843a(d11, str2, z10, i10);
    }

    /* renamed from: a */
    public final C9469c0 m15843a(double d10, String label, boolean z9, int i10) {
        Intrinsics.checkNotNullParameter(label, "label");
        return new C9469c0(d10, label, z9, i10);
    }

    /* renamed from: c */
    public final String m15844c() {
        return this.f16543b;
    }

    /* renamed from: d */
    public final boolean m15845d() {
        return this.f16544c;
    }

    /* renamed from: e */
    public final double m15846e() {
        return this.f16542a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9469c0)) {
            return false;
        }
        C9469c0 c9469c0 = (C9469c0) obj;
        return Double.compare(this.f16542a, c9469c0.f16542a) == 0 && Intrinsics.areEqual(this.f16543b, c9469c0.f16543b) && this.f16544c == c9469c0.f16544c && this.f16545d == c9469c0.f16545d;
    }

    /* renamed from: f */
    public final int m15847f() {
        return this.f16545d;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.f16542a) * 31) + this.f16543b.hashCode()) * 31) + Boolean.hashCode(this.f16544c)) * 31) + Integer.hashCode(this.f16545d);
    }

    public String toString() {
        return "SpeedRate(speed=" + this.f16542a + ", label=" + this.f16543b + ", selected=" + this.f16544c + ", textColor=" + this.f16545d + ")";
    }

    public /* synthetic */ C9469c0(double d10, String str, boolean z9, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(d10, str, (i11 & 4) != 0 ? false : z9, (i11 & 8) != 0 ? R$color.view_selector_green_white : i10);
    }
}
