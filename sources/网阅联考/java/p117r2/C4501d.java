package p117r2;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* renamed from: r2.d */
/* loaded from: classes2.dex */
public final class C4501d {

    /* renamed from: a */
    public final boolean f5335a;

    /* renamed from: b */
    public final boolean f5336b;

    /* renamed from: c */
    public final int f5337c;

    /* renamed from: d */
    public final int f5338d;

    /* renamed from: e */
    public final boolean f5339e;

    /* renamed from: f */
    public final boolean f5340f;

    /* renamed from: g */
    public final boolean f5341g;

    /* renamed from: h */
    public final int f5342h;

    /* renamed from: i */
    public final int f5343i;

    /* renamed from: j */
    public final boolean f5344j;

    /* renamed from: k */
    public final boolean f5345k;

    /* renamed from: l */
    public final boolean f5346l;

    /* renamed from: m */
    public String f5347m;

    /* renamed from: p */
    public static final b f5334p = new b(null);

    /* renamed from: n */
    public static final C4501d f5332n = new a().m5863d().m5860a();

    /* renamed from: o */
    public static final C4501d f5333o = new a().m5864e().m5862c(Integer.MAX_VALUE, TimeUnit.SECONDS).m5860a();

    /* renamed from: r2.d$a */
    public static final class a {

        /* renamed from: a */
        public boolean f5348a;

        /* renamed from: b */
        public boolean f5349b;

        /* renamed from: c */
        public int f5350c = -1;

        /* renamed from: d */
        public int f5351d = -1;

        /* renamed from: e */
        public int f5352e = -1;

        /* renamed from: f */
        public boolean f5353f;

        /* renamed from: g */
        public boolean f5354g;

        /* renamed from: h */
        public boolean f5355h;

        /* renamed from: a */
        public final C4501d m5860a() {
            return new C4501d(this.f5348a, this.f5349b, this.f5350c, -1, false, false, false, this.f5351d, this.f5352e, this.f5353f, this.f5354g, this.f5355h, null, null);
        }

        /* renamed from: b */
        public final int m5861b(long j4) {
            if (j4 > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            return (int) j4;
        }

        /* renamed from: c */
        public final a m5862c(int i4, TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            if (i4 >= 0) {
                this.f5351d = m5861b(timeUnit.toSeconds(i4));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + i4).toString());
        }

        /* renamed from: d */
        public final a m5863d() {
            this.f5348a = true;
            return this;
        }

        /* renamed from: e */
        public final a m5864e() {
            this.f5353f = true;
            return this;
        }
    }

    /* renamed from: r2.d$b */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m5865a(String str, String str2, int i4) {
            int length = str.length();
            while (i4 < length) {
                if (StringsKt__StringsKt.contains$default((CharSequence) str2, str.charAt(i4), false, 2, (Object) null)) {
                    return i4;
                }
                i4++;
            }
            return str.length();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00e1  */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final p117r2.C4501d m5866b(p117r2.C4516s r32) {
            /*
                Method dump skipped, instructions count: 406
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p117r2.C4501d.b.m5866b(r2.s):r2.d");
        }
    }

    public C4501d(boolean z3, boolean z4, int i4, int i5, boolean z5, boolean z6, boolean z7, int i6, int i7, boolean z8, boolean z9, boolean z10, String str) {
        this.f5335a = z3;
        this.f5336b = z4;
        this.f5337c = i4;
        this.f5338d = i5;
        this.f5339e = z5;
        this.f5340f = z6;
        this.f5341g = z7;
        this.f5342h = i6;
        this.f5343i = i7;
        this.f5344j = z8;
        this.f5345k = z9;
        this.f5346l = z10;
        this.f5347m = str;
    }

    /* renamed from: a */
    public final boolean m5851a() {
        return this.f5339e;
    }

    /* renamed from: b */
    public final boolean m5852b() {
        return this.f5340f;
    }

    /* renamed from: c */
    public final int m5853c() {
        return this.f5337c;
    }

    /* renamed from: d */
    public final int m5854d() {
        return this.f5342h;
    }

    /* renamed from: e */
    public final int m5855e() {
        return this.f5343i;
    }

    /* renamed from: f */
    public final boolean m5856f() {
        return this.f5341g;
    }

    /* renamed from: g */
    public final boolean m5857g() {
        return this.f5335a;
    }

    /* renamed from: h */
    public final boolean m5858h() {
        return this.f5336b;
    }

    /* renamed from: i */
    public final boolean m5859i() {
        return this.f5344j;
    }

    public String toString() {
        String str = this.f5347m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f5335a) {
            sb.append("no-cache, ");
        }
        if (this.f5336b) {
            sb.append("no-store, ");
        }
        if (this.f5337c != -1) {
            sb.append("max-age=");
            sb.append(this.f5337c);
            sb.append(", ");
        }
        if (this.f5338d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f5338d);
            sb.append(", ");
        }
        if (this.f5339e) {
            sb.append("private, ");
        }
        if (this.f5340f) {
            sb.append("public, ");
        }
        if (this.f5341g) {
            sb.append("must-revalidate, ");
        }
        if (this.f5342h != -1) {
            sb.append("max-stale=");
            sb.append(this.f5342h);
            sb.append(", ");
        }
        if (this.f5343i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f5343i);
            sb.append(", ");
        }
        if (this.f5344j) {
            sb.append("only-if-cached, ");
        }
        if (this.f5345k) {
            sb.append("no-transform, ");
        }
        if (this.f5346l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        this.f5347m = string;
        return string;
    }

    public /* synthetic */ C4501d(boolean z3, boolean z4, int i4, int i5, boolean z5, boolean z6, boolean z7, int i6, int i7, boolean z8, boolean z9, boolean z10, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(z3, z4, i4, i5, z5, z6, z7, i6, i7, z8, z9, z10, str);
    }
}
