package p097e7;

import com.zykj.view.R$color;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e7.c0 */
/* loaded from: classes5.dex */
public final class C7858c0 {

    /* renamed from: e */
    public static final a f13208e = new a(null);

    /* renamed from: a */
    public final double f13209a;

    /* renamed from: b */
    public final String f13210b;

    /* renamed from: c */
    public final boolean f13211c;

    /* renamed from: d */
    public final int f13212d;

    /* renamed from: e7.c0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final List m12345a() {
            C7858c0 c7858c0 = new C7858c0(2.0d, "2.0X", false, 0, 12, null);
            Object[] objArr = 0 == true ? 1 : 0;
            C7858c0 c7858c02 = new C7858c0(1.75d, "1.75X", objArr, 0, 12, null);
            Object[] objArr2 = 0 == true ? 1 : 0;
            C7858c0 c7858c03 = new C7858c0(1.5d, "1.5X", objArr2, 0, 12, null);
            Object[] objArr3 = 0 == true ? 1 : 0;
            C7858c0 c7858c04 = new C7858c0(1.25d, "1.25X", objArr3, 0, 12, null);
            C7858c0 c7858c05 = new C7858c0(1.0d, "1.0X", true, 0, 8, null);
            Object[] objArr4 = 0 == true ? 1 : 0;
            int i9 = 0;
            return CollectionsKt.arrayListOf(c7858c0, c7858c02, c7858c03, c7858c04, c7858c05, new C7858c0(0.75d, "0.75X", objArr4, 0, 12, null), new C7858c0(0.5d, "0.5X", 0 == true ? 1 : 0, i9, 12, null));
        }

        public a() {
        }
    }

    public C7858c0(double d10, String label, boolean z9, int i9) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f13209a = d10;
        this.f13210b = label;
        this.f13211c = z9;
        this.f13212d = i9;
    }

    /* renamed from: b */
    public static /* synthetic */ C7858c0 m12339b(C7858c0 c7858c0, double d10, String str, boolean z9, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = c7858c0.f13209a;
        }
        double d11 = d10;
        if ((i10 & 2) != 0) {
            str = c7858c0.f13210b;
        }
        String str2 = str;
        if ((i10 & 4) != 0) {
            z9 = c7858c0.f13211c;
        }
        boolean z10 = z9;
        if ((i10 & 8) != 0) {
            i9 = c7858c0.f13212d;
        }
        return c7858c0.m12340a(d11, str2, z10, i9);
    }

    /* renamed from: a */
    public final C7858c0 m12340a(double d10, String label, boolean z9, int i9) {
        Intrinsics.checkNotNullParameter(label, "label");
        return new C7858c0(d10, label, z9, i9);
    }

    /* renamed from: c */
    public final String m12341c() {
        return this.f13210b;
    }

    /* renamed from: d */
    public final boolean m12342d() {
        return this.f13211c;
    }

    /* renamed from: e */
    public final double m12343e() {
        return this.f13209a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7858c0)) {
            return false;
        }
        C7858c0 c7858c0 = (C7858c0) obj;
        return Double.compare(this.f13209a, c7858c0.f13209a) == 0 && Intrinsics.areEqual(this.f13210b, c7858c0.f13210b) && this.f13211c == c7858c0.f13211c && this.f13212d == c7858c0.f13212d;
    }

    /* renamed from: f */
    public final int m12344f() {
        return this.f13212d;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.f13209a) * 31) + this.f13210b.hashCode()) * 31) + Boolean.hashCode(this.f13211c)) * 31) + Integer.hashCode(this.f13212d);
    }

    public String toString() {
        return "SpeedRate(speed=" + this.f13209a + ", label=" + this.f13210b + ", selected=" + this.f13211c + ", textColor=" + this.f13212d + ")";
    }

    public /* synthetic */ C7858c0(double d10, String str, boolean z9, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(d10, str, (i10 & 4) != 0 ? false : z9, (i10 & 8) != 0 ? R$color.view_selector_green_white : i9);
    }
}
