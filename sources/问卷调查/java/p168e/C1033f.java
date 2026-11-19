package p168e;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p070b.p071a.p072a.p073a.C0561a;
import p160d.p161e.C0999e;
import p160d.p162f.p164b.C1011d;
import p168e.C1031d;

/* renamed from: e.f */
/* loaded from: classes.dex */
public final class C1033f {

    /* renamed from: e */
    public static final C1031d[] f5532e;

    /* renamed from: f */
    public static final C1031d[] f5533f;

    /* renamed from: g */
    public static final C1033f f5534g;

    /* renamed from: h */
    public static final C1033f f5535h;

    /* renamed from: a */
    public final boolean f5536a;

    /* renamed from: b */
    public final boolean f5537b;

    /* renamed from: c */
    public final String[] f5538c;

    /* renamed from: d */
    public final String[] f5539d;

    /* renamed from: e.f$a */
    public static final class a {

        /* renamed from: a */
        public boolean f5540a;

        /* renamed from: b */
        public String[] f5541b;

        /* renamed from: c */
        public String[] f5542c;

        /* renamed from: d */
        public boolean f5543d;

        public a(boolean z) {
            this.f5540a = z;
        }

        /* renamed from: a */
        public final C1033f m2833a() {
            return new C1033f(this.f5540a, this.f5543d, this.f5541b, this.f5542c);
        }

        /* renamed from: b */
        public final a m2834b(C1031d... c1031dArr) throws CloneNotSupportedException {
            C1011d.m2809e(c1031dArr, "cipherSuites");
            if (!this.f5540a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(c1031dArr.length);
            for (C1031d c1031d : c1031dArr) {
                arrayList.add(c1031d.f5531a);
            }
            Object[] array = arrayList.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            String[] strArr = (String[]) array;
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            C1011d.m2809e(strArr2, "cipherSuites");
            if (!this.f5540a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            if (!(!(strArr2.length == 0))) {
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            Object objClone = strArr2.clone();
            Objects.requireNonNull(objClone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            this.f5541b = (String[]) objClone;
            return this;
        }

        /* renamed from: c */
        public final a m2835c(boolean z) {
            if (!this.f5540a) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
            }
            this.f5543d = z;
            return this;
        }

        /* renamed from: d */
        public final a m2836d(EnumC1043p... enumC1043pArr) throws CloneNotSupportedException {
            C1011d.m2809e(enumC1043pArr, "tlsVersions");
            if (!this.f5540a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(enumC1043pArr.length);
            for (EnumC1043p enumC1043p : enumC1043pArr) {
                arrayList.add(enumC1043p.f5573b);
            }
            Object[] array = arrayList.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            String[] strArr = (String[]) array;
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            C1011d.m2809e(strArr2, "tlsVersions");
            if (!this.f5540a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            if (!(!(strArr2.length == 0))) {
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            Object objClone = strArr2.clone();
            Objects.requireNonNull(objClone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            this.f5542c = (String[]) objClone;
            return this;
        }
    }

    static {
        C1031d c1031d = C1031d.f5527p;
        C1031d c1031d2 = C1031d.f5528q;
        C1031d c1031d3 = C1031d.f5529r;
        C1031d c1031d4 = C1031d.f5521j;
        C1031d c1031d5 = C1031d.f5523l;
        C1031d c1031d6 = C1031d.f5522k;
        C1031d c1031d7 = C1031d.f5524m;
        C1031d c1031d8 = C1031d.f5526o;
        C1031d c1031d9 = C1031d.f5525n;
        C1031d[] c1031dArr = {c1031d, c1031d2, c1031d3, c1031d4, c1031d5, c1031d6, c1031d7, c1031d8, c1031d9};
        f5532e = c1031dArr;
        C1031d[] c1031dArr2 = {c1031d, c1031d2, c1031d3, c1031d4, c1031d5, c1031d6, c1031d7, c1031d8, c1031d9, C1031d.f5519h, C1031d.f5520i, C1031d.f5517f, C1031d.f5518g, C1031d.f5515d, C1031d.f5516e, C1031d.f5514c};
        f5533f = c1031dArr2;
        a aVar = new a(true);
        aVar.m2834b((C1031d[]) Arrays.copyOf(c1031dArr, c1031dArr.length));
        EnumC1043p enumC1043p = EnumC1043p.TLS_1_3;
        EnumC1043p enumC1043p2 = EnumC1043p.TLS_1_2;
        aVar.m2836d(enumC1043p, enumC1043p2);
        aVar.m2835c(true);
        aVar.m2833a();
        a aVar2 = new a(true);
        aVar2.m2834b((C1031d[]) Arrays.copyOf(c1031dArr2, c1031dArr2.length));
        aVar2.m2836d(enumC1043p, enumC1043p2);
        aVar2.m2835c(true);
        f5534g = aVar2.m2833a();
        a aVar3 = new a(true);
        aVar3.m2834b((C1031d[]) Arrays.copyOf(c1031dArr2, c1031dArr2.length));
        aVar3.m2836d(enumC1043p, enumC1043p2, EnumC1043p.TLS_1_1, EnumC1043p.TLS_1_0);
        aVar3.m2835c(true);
        aVar3.m2833a();
        f5535h = new C1033f(false, false, null, null);
    }

    public C1033f(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.f5536a = z;
        this.f5537b = z2;
        this.f5538c = strArr;
        this.f5539d = strArr2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1033f)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.f5536a;
        C1033f c1033f = (C1033f) obj;
        if (z != c1033f.f5536a) {
            return false;
        }
        return !z || (Arrays.equals(this.f5538c, c1033f.f5538c) && Arrays.equals(this.f5539d, c1033f.f5539d) && this.f5537b == c1033f.f5537b);
    }

    public int hashCode() {
        if (!this.f5536a) {
            return 17;
        }
        String[] strArr = this.f5538c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f5539d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f5537b ? 1 : 0);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public String toString() {
        List listM2799f;
        EnumC1043p enumC1043p;
        C1031d c1031d;
        if (!this.f5536a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ConnectionSpec(");
        sb.append("cipherSuites=");
        String[] strArr = this.f5538c;
        List listM2799f2 = null;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                C1031d.a aVar = C1031d.f5530s;
                synchronized (aVar) {
                    C1011d.m2809e(str, "javaName");
                    Map<String, C1031d> map = C1031d.f5513b;
                    c1031d = map.get(str);
                    if (c1031d == null) {
                        c1031d = map.get(aVar.m2832b(str));
                        if (c1031d == null) {
                            c1031d = new C1031d(str, null);
                        }
                        map.put(str, c1031d);
                    }
                }
                arrayList.add(c1031d);
            }
            listM2799f = C0999e.m2799f(arrayList);
        } else {
            listM2799f = null;
        }
        sb.append(Objects.toString(listM2799f, "[all enabled]"));
        sb.append(", ");
        sb.append("tlsVersions=");
        String[] strArr2 = this.f5539d;
        if (strArr2 != null) {
            ArrayList arrayList2 = new ArrayList(strArr2.length);
            for (String str2 : strArr2) {
                C1011d.m2809e(str2, "javaName");
                int iHashCode = str2.hashCode();
                if (iHashCode == 79201641) {
                    if (!str2.equals("SSLv3")) {
                        throw new IllegalArgumentException(C0561a.m2076d("Unexpected TLS version: ", str2));
                    }
                    enumC1043p = EnumC1043p.SSL_3_0;
                    arrayList2.add(enumC1043p);
                } else if (iHashCode != 79923350) {
                    switch (iHashCode) {
                        case -503070503:
                            if (!str2.equals("TLSv1.1")) {
                                throw new IllegalArgumentException(C0561a.m2076d("Unexpected TLS version: ", str2));
                            }
                            enumC1043p = EnumC1043p.TLS_1_1;
                            arrayList2.add(enumC1043p);
                        case -503070502:
                            if (!str2.equals("TLSv1.2")) {
                                throw new IllegalArgumentException(C0561a.m2076d("Unexpected TLS version: ", str2));
                            }
                            enumC1043p = EnumC1043p.TLS_1_2;
                            arrayList2.add(enumC1043p);
                        case -503070501:
                            if (!str2.equals("TLSv1.3")) {
                                throw new IllegalArgumentException(C0561a.m2076d("Unexpected TLS version: ", str2));
                            }
                            enumC1043p = EnumC1043p.TLS_1_3;
                            arrayList2.add(enumC1043p);
                        default:
                            throw new IllegalArgumentException(C0561a.m2076d("Unexpected TLS version: ", str2));
                    }
                } else {
                    if (!str2.equals("TLSv1")) {
                        throw new IllegalArgumentException(C0561a.m2076d("Unexpected TLS version: ", str2));
                    }
                    enumC1043p = EnumC1043p.TLS_1_0;
                    arrayList2.add(enumC1043p);
                }
            }
            listM2799f2 = C0999e.m2799f(arrayList2);
        }
        sb.append(Objects.toString(listM2799f2, "[all enabled]"));
        sb.append(", ");
        sb.append("supportsTlsExtensions=");
        sb.append(this.f5537b);
        sb.append(')');
        return sb.toString();
    }
}
