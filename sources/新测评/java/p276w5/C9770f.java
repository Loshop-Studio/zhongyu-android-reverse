package p276w5;

import androidx.compose.p013ui.text.AnnotatedString;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: w5.f */
/* loaded from: classes4.dex */
public final class C9770f {

    /* renamed from: a */
    public final String f17233a;

    /* renamed from: b */
    public final AnnotatedString f17234b;

    /* renamed from: c */
    public final String f17235c;

    public C9770f(String number, AnnotatedString originScore, String score) {
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(originScore, "originScore");
        Intrinsics.checkNotNullParameter(score, "score");
        this.f17233a = number;
        this.f17234b = originScore;
        this.f17235c = score;
    }

    /* renamed from: a */
    public final String m16378a() {
        return this.f17233a;
    }

    /* renamed from: b */
    public final AnnotatedString m16379b() {
        return this.f17234b;
    }

    /* renamed from: c */
    public final String m16380c() {
        return this.f17235c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9770f)) {
            return false;
        }
        C9770f c9770f = (C9770f) obj;
        return Intrinsics.areEqual(this.f17233a, c9770f.f17233a) && Intrinsics.areEqual(this.f17234b, c9770f.f17234b) && Intrinsics.areEqual(this.f17235c, c9770f.f17235c);
    }

    public int hashCode() {
        return (((this.f17233a.hashCode() * 31) + this.f17234b.hashCode()) * 31) + this.f17235c.hashCode();
    }

    public String toString() {
        String str = this.f17233a;
        AnnotatedString annotatedString = this.f17234b;
        return "DetailScoreState(number=" + str + ", originScore=" + ((Object) annotatedString) + ", score=" + this.f17235c + ")";
    }
}
