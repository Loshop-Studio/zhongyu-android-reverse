package p079e7;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e7.a */
/* loaded from: classes4.dex */
public final class C7370a {

    /* renamed from: a */
    public final String f11951a;

    /* renamed from: b */
    public final RectF f11952b;

    /* renamed from: c */
    public final int f11953c;

    public C7370a(String label, RectF answerTextRectF, int i10) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(answerTextRectF, "answerTextRectF");
        this.f11951a = label;
        this.f11952b = answerTextRectF;
        this.f11953c = i10;
    }

    /* renamed from: a */
    public final RectF m11797a() {
        return this.f11952b;
    }

    /* renamed from: b */
    public final int m11798b() {
        return this.f11953c;
    }

    /* renamed from: c */
    public final String m11799c() {
        return this.f11951a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7370a)) {
            return false;
        }
        C7370a c7370a = (C7370a) obj;
        return Intrinsics.areEqual(this.f11951a, c7370a.f11951a) && Intrinsics.areEqual(this.f11952b, c7370a.f11952b) && this.f11953c == c7370a.f11953c;
    }

    public int hashCode() {
        return (((this.f11951a.hashCode() * 31) + this.f11952b.hashCode()) * 31) + Integer.hashCode(this.f11953c);
    }

    public String toString() {
        return "AnswerArea(label=" + this.f11951a + ", answerTextRectF=" + this.f11952b + ", color=" + this.f11953c + ")";
    }
}
