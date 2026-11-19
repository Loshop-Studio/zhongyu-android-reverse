package p180m6;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: m6.k0 */
/* loaded from: classes5.dex */
public final class C9005k0 {

    /* renamed from: a */
    public final Object f15131a;

    public C9005k0(Object obj) {
        this.f15131a = obj;
    }

    /* renamed from: a */
    public final C9005k0 m14380a(Object obj) {
        return new C9005k0(obj);
    }

    /* renamed from: b */
    public final Object m14381b() {
        return this.f15131a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9005k0) && Result.m24760equalsimpl0(this.f15131a, ((C9005k0) obj).f15131a);
    }

    public int hashCode() {
        return Result.m24763hashCodeimpl(this.f15131a);
    }

    public String toString() {
        return "SearchQuestionUiState(list=" + Result.m24766toStringimpl(this.f15131a) + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C9005k0(Result result, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i9 & 1) != 0) {
            Result.Companion companion = Result.INSTANCE;
            result = Result.m24757boximpl(Result.m24758constructorimpl(ResultKt.createFailure(new Exception())));
        }
        this(result.getValue());
    }
}
