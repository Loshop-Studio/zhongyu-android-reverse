package p011a9;

import androidx.collection.SieveCacheKt;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: a9.d */
/* loaded from: classes5.dex */
public final class C0041d {

    /* renamed from: n */
    public static final b f101n = new b(null);

    /* renamed from: o */
    public static final C0041d f102o = new a().m103d().m100a();

    /* renamed from: p */
    public static final C0041d f103p = new a().m104e().m102c(Integer.MAX_VALUE, TimeUnit.SECONDS).m100a();

    /* renamed from: a */
    public final boolean f104a;

    /* renamed from: b */
    public final boolean f105b;

    /* renamed from: c */
    public final int f106c;

    /* renamed from: d */
    public final int f107d;

    /* renamed from: e */
    public final boolean f108e;

    /* renamed from: f */
    public final boolean f109f;

    /* renamed from: g */
    public final boolean f110g;

    /* renamed from: h */
    public final int f111h;

    /* renamed from: i */
    public final int f112i;

    /* renamed from: j */
    public final boolean f113j;

    /* renamed from: k */
    public final boolean f114k;

    /* renamed from: l */
    public final boolean f115l;

    /* renamed from: m */
    public String f116m;

    /* renamed from: a9.d$a */
    public static final class a {

        /* renamed from: a */
        public boolean f117a;

        /* renamed from: b */
        public boolean f118b;

        /* renamed from: c */
        public int f119c = -1;

        /* renamed from: d */
        public int f120d = -1;

        /* renamed from: e */
        public int f121e = -1;

        /* renamed from: f */
        public boolean f122f;

        /* renamed from: g */
        public boolean f123g;

        /* renamed from: h */
        public boolean f124h;

        /* renamed from: a */
        public final C0041d m100a() {
            return new C0041d(this.f117a, this.f118b, this.f119c, -1, false, false, false, this.f120d, this.f121e, this.f122f, this.f123g, this.f124h, null, null);
        }

        /* renamed from: b */
        public final int m101b(long j10) {
            if (j10 > SieveCacheKt.NodeLinkMask) {
                return Integer.MAX_VALUE;
            }
            return (int) j10;
        }

        /* renamed from: c */
        public final a m102c(int i10, TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            if (i10 >= 0) {
                this.f120d = m101b(timeUnit.toSeconds(i10));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + i10).toString());
        }

        /* renamed from: d */
        public final a m103d() {
            this.f117a = true;
            return this;
        }

        /* renamed from: e */
        public final a m104e() {
            this.f122f = true;
            return this;
        }
    }

    /* renamed from: a9.d$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m105a(String str, String str2, int i10) {
            int length = str.length();
            while (i10 < length) {
                if (StringsKt.contains$default((CharSequence) str2, str.charAt(i10), false, 2, (Object) null)) {
                    return i10;
                }
                i10++;
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
        public final p011a9.C0041d m106b(p011a9.C0054q r33) {
            /*
                Method dump skipped, instructions count: 426
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p011a9.C0041d.b.m106b(a9.q):a9.d");
        }

        public b() {
        }
    }

    public /* synthetic */ C0041d(boolean z9, boolean z10, int i10, int i11, boolean z11, boolean z12, boolean z13, int i12, int i13, boolean z14, boolean z15, boolean z16, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(z9, z10, i10, i11, z11, z12, z13, i12, i13, z14, z15, z16, str);
    }

    /* renamed from: a */
    public final boolean m91a() {
        return this.f108e;
    }

    /* renamed from: b */
    public final boolean m92b() {
        return this.f109f;
    }

    /* renamed from: c */
    public final int m93c() {
        return this.f106c;
    }

    /* renamed from: d */
    public final int m94d() {
        return this.f111h;
    }

    /* renamed from: e */
    public final int m95e() {
        return this.f112i;
    }

    /* renamed from: f */
    public final boolean m96f() {
        return this.f110g;
    }

    /* renamed from: g */
    public final boolean m97g() {
        return this.f104a;
    }

    /* renamed from: h */
    public final boolean m98h() {
        return this.f105b;
    }

    /* renamed from: i */
    public final boolean m99i() {
        return this.f113j;
    }

    public String toString() {
        String str = this.f116m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f104a) {
            sb.append("no-cache, ");
        }
        if (this.f105b) {
            sb.append("no-store, ");
        }
        if (this.f106c != -1) {
            sb.append("max-age=");
            sb.append(this.f106c);
            sb.append(", ");
        }
        if (this.f107d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f107d);
            sb.append(", ");
        }
        if (this.f108e) {
            sb.append("private, ");
        }
        if (this.f109f) {
            sb.append("public, ");
        }
        if (this.f110g) {
            sb.append("must-revalidate, ");
        }
        if (this.f111h != -1) {
            sb.append("max-stale=");
            sb.append(this.f111h);
            sb.append(", ");
        }
        if (this.f112i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f112i);
            sb.append(", ");
        }
        if (this.f113j) {
            sb.append("only-if-cached, ");
        }
        if (this.f114k) {
            sb.append("no-transform, ");
        }
        if (this.f115l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        this.f116m = string;
        return string;
    }

    public C0041d(boolean z9, boolean z10, int i10, int i11, boolean z11, boolean z12, boolean z13, int i12, int i13, boolean z14, boolean z15, boolean z16, String str) {
        this.f104a = z9;
        this.f105b = z10;
        this.f106c = i10;
        this.f107d = i11;
        this.f108e = z11;
        this.f109f = z12;
        this.f110g = z13;
        this.f111h = i12;
        this.f112i = i13;
        this.f113j = z14;
        this.f114k = z15;
        this.f115l = z16;
        this.f116m = str;
    }
}
