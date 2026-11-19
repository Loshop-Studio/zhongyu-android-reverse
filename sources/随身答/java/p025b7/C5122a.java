package p025b7;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b7.a */
/* loaded from: classes5.dex */
public final class C5122a {

    /* renamed from: a */
    public final boolean f2246a;

    /* renamed from: b */
    public final Function1 f2247b;

    /* renamed from: c */
    public final Function2 f2248c;

    /* renamed from: d */
    public final Function1 f2249d;

    /* renamed from: e */
    public final Function1 f2250e;

    /* renamed from: f */
    public final Function1 f2251f;

    /* renamed from: g */
    public final Function1 f2252g;

    /* renamed from: h */
    public final Function0 f2253h;

    /* renamed from: i */
    public final Function0 f2254i;

    /* renamed from: j */
    public final Function1 f2255j;

    /* renamed from: k */
    public final Function1 f2256k;

    /* renamed from: l */
    public final Function1 f2257l;

    /* renamed from: m */
    public final Function1 f2258m;

    public C5122a(boolean z9, Function1 function1, Function2 function2, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function0 function0, Function0 function02, Function1 function16, Function1 function17, Function1 function18, Function1 function19) {
        this.f2246a = z9;
        this.f2247b = function1;
        this.f2248c = function2;
        this.f2249d = function12;
        this.f2250e = function13;
        this.f2251f = function14;
        this.f2252g = function15;
        this.f2253h = function0;
        this.f2254i = function02;
        this.f2255j = function16;
        this.f2256k = function17;
        this.f2257l = function18;
        this.f2258m = function19;
    }

    /* renamed from: a */
    public final boolean m2188a() {
        return this.f2246a;
    }

    /* renamed from: b */
    public final Function1 m2189b() {
        return this.f2247b;
    }

    /* renamed from: c */
    public final Function1 m2190c() {
        return this.f2250e;
    }

    /* renamed from: d */
    public final Function2 m2191d() {
        return this.f2248c;
    }

    /* renamed from: e */
    public final Function1 m2192e() {
        return this.f2252g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5122a)) {
            return false;
        }
        C5122a c5122a = (C5122a) obj;
        return this.f2246a == c5122a.f2246a && Intrinsics.areEqual(this.f2247b, c5122a.f2247b) && Intrinsics.areEqual(this.f2248c, c5122a.f2248c) && Intrinsics.areEqual(this.f2249d, c5122a.f2249d) && Intrinsics.areEqual(this.f2250e, c5122a.f2250e) && Intrinsics.areEqual(this.f2251f, c5122a.f2251f) && Intrinsics.areEqual(this.f2252g, c5122a.f2252g) && Intrinsics.areEqual(this.f2253h, c5122a.f2253h) && Intrinsics.areEqual(this.f2254i, c5122a.f2254i) && Intrinsics.areEqual(this.f2255j, c5122a.f2255j) && Intrinsics.areEqual(this.f2256k, c5122a.f2256k) && Intrinsics.areEqual(this.f2257l, c5122a.f2257l) && Intrinsics.areEqual(this.f2258m, c5122a.f2258m);
    }

    /* renamed from: f */
    public final Function1 m2193f() {
        return this.f2251f;
    }

    /* renamed from: g */
    public final Function1 m2194g() {
        return this.f2257l;
    }

    /* renamed from: h */
    public final Function0 m2195h() {
        return this.f2253h;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.f2246a) * 31;
        Function1 function1 = this.f2247b;
        int iHashCode2 = (iHashCode + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function2 function2 = this.f2248c;
        int iHashCode3 = (iHashCode2 + (function2 == null ? 0 : function2.hashCode())) * 31;
        Function1 function12 = this.f2249d;
        int iHashCode4 = (iHashCode3 + (function12 == null ? 0 : function12.hashCode())) * 31;
        Function1 function13 = this.f2250e;
        int iHashCode5 = (iHashCode4 + (function13 == null ? 0 : function13.hashCode())) * 31;
        Function1 function14 = this.f2251f;
        int iHashCode6 = (iHashCode5 + (function14 == null ? 0 : function14.hashCode())) * 31;
        Function1 function15 = this.f2252g;
        int iHashCode7 = (iHashCode6 + (function15 == null ? 0 : function15.hashCode())) * 31;
        Function0 function0 = this.f2253h;
        int iHashCode8 = (iHashCode7 + (function0 == null ? 0 : function0.hashCode())) * 31;
        Function0 function02 = this.f2254i;
        int iHashCode9 = (iHashCode8 + (function02 == null ? 0 : function02.hashCode())) * 31;
        Function1 function16 = this.f2255j;
        int iHashCode10 = (iHashCode9 + (function16 == null ? 0 : function16.hashCode())) * 31;
        Function1 function17 = this.f2256k;
        int iHashCode11 = (iHashCode10 + (function17 == null ? 0 : function17.hashCode())) * 31;
        Function1 function18 = this.f2257l;
        int iHashCode12 = (iHashCode11 + (function18 == null ? 0 : function18.hashCode())) * 31;
        Function1 function19 = this.f2258m;
        return iHashCode12 + (function19 != null ? function19.hashCode() : 0);
    }

    /* renamed from: i */
    public final Function0 m2196i() {
        return this.f2254i;
    }

    /* renamed from: j */
    public final Function1 m2197j() {
        return this.f2249d;
    }

    public String toString() {
        return "BoardCallbackConfig(needLoading=" + this.f2246a + ", onBackClick=" + this.f2247b + ", onCommitClick=" + this.f2248c + ", onPreviewClick=" + this.f2249d + ", onCameraClick=" + this.f2250e + ", onGalleryClick=" + this.f2251f + ", onCropClick=" + this.f2252g + ", onInitFinished=" + this.f2253h + ", onLoadFailed=" + this.f2254i + ", onAddCameraImage=" + this.f2255j + ", onAddGalleryImage=" + this.f2256k + ", onImageDelete=" + this.f2257l + ", onErrorReport=" + this.f2258m + ")";
    }

    public /* synthetic */ C5122a(boolean z9, Function1 function1, Function2 function2, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function0 function0, Function0 function02, Function1 function16, Function1 function17, Function1 function18, Function1 function19, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? true : z9, (i9 & 2) != 0 ? null : function1, (i9 & 4) != 0 ? null : function2, (i9 & 8) != 0 ? null : function12, (i9 & 16) != 0 ? null : function13, (i9 & 32) != 0 ? null : function14, (i9 & 64) != 0 ? null : function15, (i9 & 128) != 0 ? null : function0, (i9 & 256) != 0 ? null : function02, (i9 & 512) != 0 ? null : function16, (i9 & 1024) != 0 ? null : function17, (i9 & 2048) != 0 ? null : function18, (i9 & 4096) != 0 ? null : function19);
    }
}
