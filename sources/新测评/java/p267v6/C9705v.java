package p267v6;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p267v6.AbstractC9706w;

/* renamed from: v6.v */
/* loaded from: classes4.dex */
public final class C9705v {

    /* renamed from: a */
    public final AbstractC9706w f17029a;

    /* renamed from: b */
    public final int f17030b;

    public C9705v(AbstractC9706w answerSheetType, int i10) {
        Intrinsics.checkNotNullParameter(answerSheetType, "answerSheetType");
        this.f17029a = answerSheetType;
        this.f17030b = i10;
    }

    /* renamed from: b */
    public static /* synthetic */ C9705v m16210b(C9705v c9705v, AbstractC9706w abstractC9706w, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            abstractC9706w = c9705v.f17029a;
        }
        if ((i11 & 2) != 0) {
            i10 = c9705v.f17030b;
        }
        return c9705v.m16211a(abstractC9706w, i10);
    }

    /* renamed from: a */
    public final C9705v m16211a(AbstractC9706w answerSheetType, int i10) {
        Intrinsics.checkNotNullParameter(answerSheetType, "answerSheetType");
        return new C9705v(answerSheetType, i10);
    }

    /* renamed from: c */
    public final AbstractC9706w m16212c() {
        return this.f17029a;
    }

    /* renamed from: d */
    public final int m16213d() {
        return this.f17030b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9705v)) {
            return false;
        }
        C9705v c9705v = (C9705v) obj;
        return Intrinsics.areEqual(this.f17029a, c9705v.f17029a) && this.f17030b == c9705v.f17030b;
    }

    public int hashCode() {
        return (this.f17029a.hashCode() * 31) + Integer.hashCode(this.f17030b);
    }

    public String toString() {
        return "AnswerSheetState(answerSheetType=" + this.f17029a + ", index=" + this.f17030b + ")";
    }

    public /* synthetic */ C9705v(AbstractC9706w abstractC9706w, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? AbstractC9706w.b.f17032a : abstractC9706w, (i11 & 2) != 0 ? 0 : i10);
    }
}
