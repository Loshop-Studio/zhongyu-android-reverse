package p172l8;

import androidx.collection.SieveCacheKt;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: l8.d */
/* loaded from: classes5.dex */
public final class C8905d {

    /* renamed from: n */
    public static final b f14729n = new b(null);

    /* renamed from: o */
    public static final C8905d f14730o = new a().m13862d().m13859a();

    /* renamed from: p */
    public static final C8905d f14731p = new a().m13863e().m13861c(Integer.MAX_VALUE, TimeUnit.SECONDS).m13859a();

    /* renamed from: a */
    public final boolean f14732a;

    /* renamed from: b */
    public final boolean f14733b;

    /* renamed from: c */
    public final int f14734c;

    /* renamed from: d */
    public final int f14735d;

    /* renamed from: e */
    public final boolean f14736e;

    /* renamed from: f */
    public final boolean f14737f;

    /* renamed from: g */
    public final boolean f14738g;

    /* renamed from: h */
    public final int f14739h;

    /* renamed from: i */
    public final int f14740i;

    /* renamed from: j */
    public final boolean f14741j;

    /* renamed from: k */
    public final boolean f14742k;

    /* renamed from: l */
    public final boolean f14743l;

    /* renamed from: m */
    public String f14744m;

    /* renamed from: l8.d$a */
    public static final class a {

        /* renamed from: a */
        public boolean f14745a;

        /* renamed from: b */
        public boolean f14746b;

        /* renamed from: c */
        public int f14747c = -1;

        /* renamed from: d */
        public int f14748d = -1;

        /* renamed from: e */
        public int f14749e = -1;

        /* renamed from: f */
        public boolean f14750f;

        /* renamed from: g */
        public boolean f14751g;

        /* renamed from: h */
        public boolean f14752h;

        /* renamed from: a */
        public final C8905d m13859a() {
            return new C8905d(this.f14745a, this.f14746b, this.f14747c, -1, false, false, false, this.f14748d, this.f14749e, this.f14750f, this.f14751g, this.f14752h, null, null);
        }

        /* renamed from: b */
        public final int m13860b(long j9) {
            if (j9 > SieveCacheKt.NodeLinkMask) {
                return Integer.MAX_VALUE;
            }
            return (int) j9;
        }

        /* renamed from: c */
        public final a m13861c(int i9, TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            if (i9 >= 0) {
                this.f14748d = m13860b(timeUnit.toSeconds(i9));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + i9).toString());
        }

        /* renamed from: d */
        public final a m13862d() {
            this.f14745a = true;
            return this;
        }

        /* renamed from: e */
        public final a m13863e() {
            this.f14750f = true;
            return this;
        }
    }

    /* renamed from: l8.d$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m13864a(String str, String str2, int i9) {
            int length = str.length();
            while (i9 < length) {
                if (StringsKt.contains$default((CharSequence) str2, str.charAt(i9), false, 2, (Object) null)) {
                    return i9;
                }
                i9++;
            }
            return str.length();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00e6  */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final p172l8.C8905d m13865b(p172l8.C8918q r33) {
            /*
                Method dump skipped, instructions count: 426
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p172l8.C8905d.b.m13865b(l8.q):l8.d");
        }

        public b() {
        }
    }

    public /* synthetic */ C8905d(boolean z9, boolean z10, int i9, int i10, boolean z11, boolean z12, boolean z13, int i11, int i12, boolean z14, boolean z15, boolean z16, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(z9, z10, i9, i10, z11, z12, z13, i11, i12, z14, z15, z16, str);
    }

    /* renamed from: a */
    public final boolean m13850a() {
        return this.f14736e;
    }

    /* renamed from: b */
    public final boolean m13851b() {
        return this.f14737f;
    }

    /* renamed from: c */
    public final int m13852c() {
        return this.f14734c;
    }

    /* renamed from: d */
    public final int m13853d() {
        return this.f14739h;
    }

    /* renamed from: e */
    public final int m13854e() {
        return this.f14740i;
    }

    /* renamed from: f */
    public final boolean m13855f() {
        return this.f14738g;
    }

    /* renamed from: g */
    public final boolean m13856g() {
        return this.f14732a;
    }

    /* renamed from: h */
    public final boolean m13857h() {
        return this.f14733b;
    }

    /* renamed from: i */
    public final boolean m13858i() {
        return this.f14741j;
    }

    public String toString() {
        String str = this.f14744m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f14732a) {
            sb.append("no-cache, ");
        }
        if (this.f14733b) {
            sb.append("no-store, ");
        }
        if (this.f14734c != -1) {
            sb.append("max-age=");
            sb.append(this.f14734c);
            sb.append(", ");
        }
        if (this.f14735d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f14735d);
            sb.append(", ");
        }
        if (this.f14736e) {
            sb.append("private, ");
        }
        if (this.f14737f) {
            sb.append("public, ");
        }
        if (this.f14738g) {
            sb.append("must-revalidate, ");
        }
        if (this.f14739h != -1) {
            sb.append("max-stale=");
            sb.append(this.f14739h);
            sb.append(", ");
        }
        if (this.f14740i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f14740i);
            sb.append(", ");
        }
        if (this.f14741j) {
            sb.append("only-if-cached, ");
        }
        if (this.f14742k) {
            sb.append("no-transform, ");
        }
        if (this.f14743l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        this.f14744m = string;
        return string;
    }

    public C8905d(boolean z9, boolean z10, int i9, int i10, boolean z11, boolean z12, boolean z13, int i11, int i12, boolean z14, boolean z15, boolean z16, String str) {
        this.f14732a = z9;
        this.f14733b = z10;
        this.f14734c = i9;
        this.f14735d = i10;
        this.f14736e = z11;
        this.f14737f = z12;
        this.f14738g = z13;
        this.f14739h = i11;
        this.f14740i = i12;
        this.f14741j = z14;
        this.f14742k = z15;
        this.f14743l = z16;
        this.f14744m = str;
    }
}
