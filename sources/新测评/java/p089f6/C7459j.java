package p089f6;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: f6.j */
/* loaded from: classes4.dex */
public final class C7459j {

    /* renamed from: a */
    public Function0 f12207a;

    /* renamed from: b */
    public Function0 f12208b;

    /* renamed from: c */
    public Function0 f12209c;

    /* renamed from: d */
    public Function0 f12210d;

    /* renamed from: e */
    public Function0 f12211e;

    /* renamed from: f6.j$a */
    public static final class a implements Function0 {

        /* renamed from: a */
        public static final a f12212a = new a();

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            return null;
        }
    }

    /* renamed from: f6.j$b */
    public static final class b implements Function0 {

        /* renamed from: a */
        public static final b f12213a = new b();

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            return null;
        }
    }

    public C7459j(Function0 getStemBitmap, Function0 isChange, Function0 isEmpty, Function0 buildBitmap, Function0 saveData) {
        Intrinsics.checkNotNullParameter(getStemBitmap, "getStemBitmap");
        Intrinsics.checkNotNullParameter(isChange, "isChange");
        Intrinsics.checkNotNullParameter(isEmpty, "isEmpty");
        Intrinsics.checkNotNullParameter(buildBitmap, "buildBitmap");
        Intrinsics.checkNotNullParameter(saveData, "saveData");
        this.f12207a = getStemBitmap;
        this.f12208b = isChange;
        this.f12209c = isEmpty;
        this.f12210d = buildBitmap;
        this.f12211e = saveData;
    }

    /* renamed from: d */
    public static final boolean m12052d() {
        return false;
    }

    /* renamed from: e */
    public static final boolean m12053e() {
        return false;
    }

    /* renamed from: f */
    public static final Unit m12054f() {
        return Unit.INSTANCE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7459j)) {
            return false;
        }
        C7459j c7459j = (C7459j) obj;
        return Intrinsics.areEqual(this.f12207a, c7459j.f12207a) && Intrinsics.areEqual(this.f12208b, c7459j.f12208b) && Intrinsics.areEqual(this.f12209c, c7459j.f12209c) && Intrinsics.areEqual(this.f12210d, c7459j.f12210d) && Intrinsics.areEqual(this.f12211e, c7459j.f12211e);
    }

    /* renamed from: g */
    public final Function0 m12055g() {
        return this.f12210d;
    }

    /* renamed from: h */
    public final Function0 m12056h() {
        return this.f12207a;
    }

    public int hashCode() {
        return (((((((this.f12207a.hashCode() * 31) + this.f12208b.hashCode()) * 31) + this.f12209c.hashCode()) * 31) + this.f12210d.hashCode()) * 31) + this.f12211e.hashCode();
    }

    /* renamed from: i */
    public final Function0 m12057i() {
        return this.f12211e;
    }

    /* renamed from: j */
    public final Function0 m12058j() {
        return this.f12208b;
    }

    /* renamed from: k */
    public final Function0 m12059k() {
        return this.f12209c;
    }

    /* renamed from: l */
    public final void m12060l(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.f12210d = function0;
    }

    /* renamed from: m */
    public final void m12061m(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.f12208b = function0;
    }

    /* renamed from: n */
    public final void m12062n(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.f12209c = function0;
    }

    /* renamed from: o */
    public final void m12063o(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.f12207a = function0;
    }

    /* renamed from: p */
    public final void m12064p(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.f12211e = function0;
    }

    public String toString() {
        return "DraftFunctions(getStemBitmap=" + this.f12207a + ", isChange=" + this.f12208b + ", isEmpty=" + this.f12209c + ", buildBitmap=" + this.f12210d + ", saveData=" + this.f12211e + ")";
    }

    public /* synthetic */ C7459j(Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? a.f12212a : function0, (i10 & 2) != 0 ? new Function0() { // from class: f6.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C7459j.m12052d());
            }
        } : function02, (i10 & 4) != 0 ? new Function0() { // from class: f6.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C7459j.m12053e());
            }
        } : function03, (i10 & 8) != 0 ? b.f12213a : function04, (i10 & 16) != 0 ? new Function0() { // from class: f6.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C7459j.m12054f();
            }
        } : function05);
    }
}
