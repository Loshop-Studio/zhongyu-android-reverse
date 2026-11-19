package p036c7;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: c7.a */
/* loaded from: classes5.dex */
public final class C5234a {

    /* renamed from: a */
    public Function0 f2473a;

    /* renamed from: b */
    public Function0 f2474b;

    /* renamed from: c */
    public Function0 f2475c;

    /* renamed from: d */
    public Function1 f2476d;

    public C5234a(Function0 function0, Function0 function02, Function0 function03, Function1 function1) {
        this.f2473a = function0;
        this.f2474b = function02;
        this.f2475c = function03;
        this.f2476d = function1;
    }

    /* renamed from: a */
    public final Function0 m2400a() {
        return this.f2473a;
    }

    /* renamed from: b */
    public final Function1 m2401b() {
        return this.f2476d;
    }

    /* renamed from: c */
    public final Function0 m2402c() {
        return this.f2475c;
    }

    /* renamed from: d */
    public final Function0 m2403d() {
        return this.f2474b;
    }

    public /* synthetic */ C5234a(Function0 function0, Function0 function02, Function0 function03, Function1 function1, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? null : function0, (i9 & 2) != 0 ? null : function02, (i9 & 4) != 0 ? null : function03, (i9 & 8) != 0 ? null : function1);
    }
}
