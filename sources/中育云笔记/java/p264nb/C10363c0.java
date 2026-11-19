package p264nb;

import com.zykj.view.R$color;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10978w;

/* renamed from: nb.c0 */
/* loaded from: classes6.dex */
public final class C10363c0 {

    /* renamed from: e */
    public static final a f24680e = new a(null);

    /* renamed from: a */
    public final double f24681a;

    /* renamed from: b */
    public final String f24682b;

    /* renamed from: c */
    public final boolean f24683c;

    /* renamed from: d */
    public final int f24684d;

    /* renamed from: nb.c0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final List m21700a() {
            C10363c0 c10363c0 = new C10363c0(2.0d, "2.0X", false, 0, 12, null);
            Object[] objArr = 0 == true ? 1 : 0;
            C10363c0 c10363c02 = new C10363c0(1.75d, "1.75X", objArr, 0, 12, null);
            Object[] objArr2 = 0 == true ? 1 : 0;
            C10363c0 c10363c03 = new C10363c0(1.5d, "1.5X", objArr2, 0, 12, null);
            Object[] objArr3 = 0 == true ? 1 : 0;
            C10363c0 c10363c04 = new C10363c0(1.25d, "1.25X", objArr3, 0, 12, null);
            C10363c0 c10363c05 = new C10363c0(1.0d, "1.0X", true, 0, 8, null);
            Object[] objArr4 = 0 == true ? 1 : 0;
            int i10 = 0;
            return AbstractC10978w.m24129g(c10363c0, c10363c02, c10363c03, c10363c04, c10363c05, new C10363c0(0.75d, "0.75X", objArr4, 0, 12, null), new C10363c0(0.5d, "0.5X", 0 == true ? 1 : 0, i10, 12, null));
        }

        public a() {
        }
    }

    public C10363c0(double d10, String label, boolean z10, int i10) {
        AbstractC9979u.m20294g(label, "label");
        this.f24681a = d10;
        this.f24682b = label;
        this.f24683c = z10;
        this.f24684d = i10;
    }

    /* renamed from: b */
    public static /* synthetic */ C10363c0 m21694b(C10363c0 c10363c0, double d10, String str, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d10 = c10363c0.f24681a;
        }
        double d11 = d10;
        if ((i11 & 2) != 0) {
            str = c10363c0.f24682b;
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            z10 = c10363c0.f24683c;
        }
        boolean z11 = z10;
        if ((i11 & 8) != 0) {
            i10 = c10363c0.f24684d;
        }
        return c10363c0.m21695a(d11, str2, z11, i10);
    }

    /* renamed from: a */
    public final C10363c0 m21695a(double d10, String label, boolean z10, int i10) {
        AbstractC9979u.m20294g(label, "label");
        return new C10363c0(d10, label, z10, i10);
    }

    /* renamed from: c */
    public final String m21696c() {
        return this.f24682b;
    }

    /* renamed from: d */
    public final boolean m21697d() {
        return this.f24683c;
    }

    /* renamed from: e */
    public final double m21698e() {
        return this.f24681a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10363c0)) {
            return false;
        }
        C10363c0 c10363c0 = (C10363c0) obj;
        return Double.compare(this.f24681a, c10363c0.f24681a) == 0 && AbstractC9979u.m20289b(this.f24682b, c10363c0.f24682b) && this.f24683c == c10363c0.f24683c && this.f24684d == c10363c0.f24684d;
    }

    /* renamed from: f */
    public final int m21699f() {
        return this.f24684d;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.f24681a) * 31) + this.f24682b.hashCode()) * 31) + Boolean.hashCode(this.f24683c)) * 31) + Integer.hashCode(this.f24684d);
    }

    public String toString() {
        return "SpeedRate(speed=" + this.f24681a + ", label=" + this.f24682b + ", selected=" + this.f24683c + ", textColor=" + this.f24684d + ")";
    }

    public /* synthetic */ C10363c0(double d10, String str, boolean z10, int i10, int i11, AbstractC9972n abstractC9972n) {
        this(d10, str, (i11 & 4) != 0 ? false : z10, (i11 & 8) != 0 ? R$color.view_selector_green_white : i10);
    }
}
