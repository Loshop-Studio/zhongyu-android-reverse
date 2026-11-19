package p091k3;

import androidx.compose.p009ui.graphics.Color;
import com.zykj.gallery.R$drawable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p114n3.AbstractC7460a;

/* renamed from: k3.s0 */
/* loaded from: classes4.dex */
public abstract class AbstractC6667s0 {

    /* renamed from: a */
    public final String f8784a;

    /* renamed from: b */
    public final boolean f8785b;

    /* renamed from: c */
    public final String f8786c;

    /* renamed from: d */
    public final boolean f8787d;

    /* renamed from: e */
    public final String f8788e;

    /* renamed from: f */
    public final boolean f8789f;

    /* renamed from: g */
    public final long f8790g;

    /* renamed from: h */
    public final int f8791h;

    /* renamed from: i */
    public final boolean f8792i;

    /* renamed from: j */
    public final boolean f8793j;

    /* renamed from: k3.s0$a */
    public static final class a extends AbstractC6667s0 {

        /* renamed from: k */
        public final String f8794k;

        /* renamed from: l */
        public final String f8795l;

        /* renamed from: m */
        public final boolean f8796m;

        /* renamed from: n */
        public final boolean f8797n;

        /* renamed from: o */
        public final boolean f8798o;

        /* renamed from: p */
        public final long f8799p;

        /* renamed from: q */
        public final int f8800q;

        /* renamed from: r */
        public final boolean f8801r;

        /* renamed from: s */
        public final boolean f8802s;

        public /* synthetic */ a(String str, String str2, boolean z6, boolean z7, boolean z8, long j6, int i6, boolean z9, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, z6, z7, z8, j6, i6, z9, z10);
        }

        @Override // p091k3.AbstractC6667s0
        /* renamed from: a */
        public String mo7668a() {
            return this.f8795l;
        }

        @Override // p091k3.AbstractC6667s0
        /* renamed from: b */
        public long mo7669b() {
            return this.f8799p;
        }

        @Override // p091k3.AbstractC6667s0
        /* renamed from: c */
        public boolean mo7670c() {
            return this.f8801r;
        }

        @Override // p091k3.AbstractC6667s0
        /* renamed from: e */
        public String mo7672e() {
            return this.f8794k;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f8794k, aVar.f8794k) && Intrinsics.areEqual(this.f8795l, aVar.f8795l) && this.f8796m == aVar.f8796m && this.f8797n == aVar.f8797n && this.f8798o == aVar.f8798o && Color.m13900equalsimpl0(this.f8799p, aVar.f8799p) && this.f8800q == aVar.f8800q && this.f8801r == aVar.f8801r && this.f8802s == aVar.f8802s;
        }

        @Override // p091k3.AbstractC6667s0
        /* renamed from: f */
        public boolean mo7673f() {
            return this.f8798o;
        }

        @Override // p091k3.AbstractC6667s0
        /* renamed from: g */
        public boolean mo7674g() {
            return this.f8802s;
        }

        @Override // p091k3.AbstractC6667s0
        /* renamed from: h */
        public boolean mo7675h() {
            return this.f8797n;
        }

        public int hashCode() {
            return (((((((((((((((this.f8794k.hashCode() * 31) + this.f8795l.hashCode()) * 31) + Boolean.hashCode(this.f8796m)) * 31) + Boolean.hashCode(this.f8797n)) * 31) + Boolean.hashCode(this.f8798o)) * 31) + Color.m13906hashCodeimpl(this.f8799p)) * 31) + Integer.hashCode(this.f8800q)) * 31) + Boolean.hashCode(this.f8801r)) * 31) + Boolean.hashCode(this.f8802s);
        }

        @Override // p091k3.AbstractC6667s0
        /* renamed from: i */
        public boolean mo7676i() {
            return this.f8796m;
        }

        public String toString() {
            return "ScreenDetail(title=" + this.f8794k + ", delete=" + this.f8795l + ", isTitleShow=" + this.f8796m + ", isTipsShow=" + this.f8797n + ", isDeleteShow=" + this.f8798o + ", deleteColor=" + Color.m13907toStringimpl(this.f8799p) + ", backIcon=" + this.f8800q + ", deleteEnable=" + this.f8801r + ", isReceiverShow=" + this.f8802s + ")";
        }

        public /* synthetic */ a(String str, String str2, boolean z6, boolean z7, boolean z8, long j6, int i6, boolean z9, boolean z10, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i7 & 4) != 0 ? true : z6, (i7 & 8) != 0 ? false : z7, (i7 & 16) != 0 ? true : z8, (i7 & 32) != 0 ? AbstractC7460a.m8506c() : j6, (i7 & 64) != 0 ? R$drawable.gallery_icon_back_cancel : i6, (i7 & 128) != 0 ? true : z9, (i7 & 256) != 0 ? false : z10, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String title, String delete, boolean z6, boolean z7, boolean z8, long j6, int i6, boolean z9, boolean z10) {
            super(title, z6, null, z7, delete, z8, j6, i6, z9, z10, 4, null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(delete, "delete");
            this.f8794k = title;
            this.f8795l = delete;
            this.f8796m = z6;
            this.f8797n = z7;
            this.f8798o = z8;
            this.f8799p = j6;
            this.f8800q = i6;
            this.f8801r = z9;
            this.f8802s = z10;
        }
    }

    /* renamed from: k3.s0$b */
    public static final class b extends AbstractC6667s0 {

        /* renamed from: k */
        public final String f8803k;

        /* renamed from: l */
        public final String f8804l;

        /* renamed from: m */
        public final String f8805m;

        /* renamed from: n */
        public final boolean f8806n;

        /* renamed from: o */
        public final boolean f8807o;

        /* renamed from: p */
        public final boolean f8808p;

        /* renamed from: q */
        public final long f8809q;

        public /* synthetic */ b(String str, String str2, String str3, boolean z6, boolean z7, boolean z8, long j6, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, z6, z7, z8, j6);
        }

        @Override // p091k3.AbstractC6667s0
        /* renamed from: a */
        public String mo7668a() {
            return this.f8805m;
        }

        @Override // p091k3.AbstractC6667s0
        /* renamed from: b */
        public long mo7669b() {
            return this.f8809q;
        }

        @Override // p091k3.AbstractC6667s0
        /* renamed from: d */
        public String mo7671d() {
            return this.f8804l;
        }

        @Override // p091k3.AbstractC6667s0
        /* renamed from: e */
        public String mo7672e() {
            return this.f8803k;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f8803k, bVar.f8803k) && Intrinsics.areEqual(this.f8804l, bVar.f8804l) && Intrinsics.areEqual(this.f8805m, bVar.f8805m) && this.f8806n == bVar.f8806n && this.f8807o == bVar.f8807o && this.f8808p == bVar.f8808p && Color.m13900equalsimpl0(this.f8809q, bVar.f8809q);
        }

        @Override // p091k3.AbstractC6667s0
        /* renamed from: f */
        public boolean mo7673f() {
            return this.f8808p;
        }

        @Override // p091k3.AbstractC6667s0
        /* renamed from: h */
        public boolean mo7675h() {
            return this.f8807o;
        }

        public int hashCode() {
            return (((((((((((this.f8803k.hashCode() * 31) + this.f8804l.hashCode()) * 31) + this.f8805m.hashCode()) * 31) + Boolean.hashCode(this.f8806n)) * 31) + Boolean.hashCode(this.f8807o)) * 31) + Boolean.hashCode(this.f8808p)) * 31) + Color.m13906hashCodeimpl(this.f8809q);
        }

        @Override // p091k3.AbstractC6667s0
        /* renamed from: i */
        public boolean mo7676i() {
            return this.f8806n;
        }

        public String toString() {
            return "ScreenList(title=" + this.f8803k + ", tips=" + this.f8804l + ", delete=" + this.f8805m + ", isTitleShow=" + this.f8806n + ", isTipsShow=" + this.f8807o + ", isDeleteShow=" + this.f8808p + ", deleteColor=" + Color.m13907toStringimpl(this.f8809q) + ")";
        }

        public /* synthetic */ b(String str, String str2, String str3, boolean z6, boolean z7, boolean z8, long j6, int i6, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i6 & 8) != 0 ? true : z6, (i6 & 16) != 0 ? true : z7, (i6 & 32) != 0 ? true : z8, (i6 & 64) != 0 ? AbstractC7460a.m8506c() : j6, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String title, String tips, String delete, boolean z6, boolean z7, boolean z8, long j6) {
            super(title, z6, tips, z7, delete, z8, j6, 0, false, false, 896, null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(tips, "tips");
            Intrinsics.checkNotNullParameter(delete, "delete");
            this.f8803k = title;
            this.f8804l = tips;
            this.f8805m = delete;
            this.f8806n = z6;
            this.f8807o = z7;
            this.f8808p = z8;
            this.f8809q = j6;
        }
    }

    public /* synthetic */ AbstractC6667s0(String str, boolean z6, String str2, boolean z7, String str3, boolean z8, long j6, int i6, boolean z9, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z6, str2, z7, str3, z8, j6, i6, z9, z10);
    }

    /* renamed from: a */
    public abstract String mo7668a();

    /* renamed from: b */
    public abstract long mo7669b();

    /* renamed from: c */
    public boolean mo7670c() {
        return this.f8792i;
    }

    /* renamed from: d */
    public String mo7671d() {
        return this.f8786c;
    }

    /* renamed from: e */
    public abstract String mo7672e();

    /* renamed from: f */
    public abstract boolean mo7673f();

    /* renamed from: g */
    public boolean mo7674g() {
        return this.f8793j;
    }

    /* renamed from: h */
    public abstract boolean mo7675h();

    /* renamed from: i */
    public abstract boolean mo7676i();

    public AbstractC6667s0(String title, boolean z6, String tips, boolean z7, String delete, boolean z8, long j6, int i6, boolean z9, boolean z10) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tips, "tips");
        Intrinsics.checkNotNullParameter(delete, "delete");
        this.f8784a = title;
        this.f8785b = z6;
        this.f8786c = tips;
        this.f8787d = z7;
        this.f8788e = delete;
        this.f8789f = z8;
        this.f8790g = j6;
        this.f8791h = i6;
        this.f8792i = z9;
        this.f8793j = z10;
    }

    public /* synthetic */ AbstractC6667s0(String str, boolean z6, String str2, boolean z7, String str3, boolean z8, long j6, int i6, boolean z9, boolean z10, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? false : z6, (i7 & 4) != 0 ? "" : str2, (i7 & 8) != 0 ? false : z7, (i7 & 16) == 0 ? str3 : "", (i7 & 32) != 0 ? false : z8, (i7 & 64) != 0 ? AbstractC7460a.m8506c() : j6, (i7 & 128) != 0 ? R$drawable.gallery_icon_back : i6, (i7 & 256) != 0 ? true : z9, (i7 & 512) == 0 ? z10 : false, null);
    }
}
