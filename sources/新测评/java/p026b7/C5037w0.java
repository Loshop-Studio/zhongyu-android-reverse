package p026b7;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b7.w0 */
/* loaded from: classes4.dex */
public final class C5037w0 {

    /* renamed from: a */
    public Function0 f2560a;

    public C5037w0(Function0 getPointList) {
        Intrinsics.checkNotNullParameter(getPointList, "getPointList");
        this.f2560a = getPointList;
    }

    /* renamed from: b */
    public static final List m2517b() {
        return CollectionsKt.emptyList();
    }

    /* renamed from: c */
    public final Function0 m2518c() {
        return this.f2560a;
    }

    /* renamed from: d */
    public final void m2519d(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.f2560a = function0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5037w0) && Intrinsics.areEqual(this.f2560a, ((C5037w0) obj).f2560a);
    }

    public int hashCode() {
        return this.f2560a.hashCode();
    }

    public String toString() {
        return "ManualPointFunctions(getPointList=" + this.f2560a + ")";
    }

    public /* synthetic */ C5037w0(Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new Function0() { // from class: b7.v0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5037w0.m2517b();
            }
        } : function0);
    }
}
