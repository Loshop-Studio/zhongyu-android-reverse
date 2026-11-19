package p079e7;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e7.l0 */
/* loaded from: classes4.dex */
public final class C7393l0 {

    /* renamed from: a */
    public final String f12048a;

    /* renamed from: b */
    public final List f12049b;

    /* renamed from: c */
    public final RectF f12050c;

    /* renamed from: d */
    public final RectF f12051d;

    /* renamed from: e */
    public final Path f12052e;

    /* renamed from: f */
    public final Path f12053f;

    public C7393l0(String groupKey, List uuidList, RectF questionRectF, RectF correctTextRectF, Path choiceQuestionPath, Path choiceCorrectPath) {
        Intrinsics.checkNotNullParameter(groupKey, "groupKey");
        Intrinsics.checkNotNullParameter(uuidList, "uuidList");
        Intrinsics.checkNotNullParameter(questionRectF, "questionRectF");
        Intrinsics.checkNotNullParameter(correctTextRectF, "correctTextRectF");
        Intrinsics.checkNotNullParameter(choiceQuestionPath, "choiceQuestionPath");
        Intrinsics.checkNotNullParameter(choiceCorrectPath, "choiceCorrectPath");
        this.f12048a = groupKey;
        this.f12049b = uuidList;
        this.f12050c = questionRectF;
        this.f12051d = correctTextRectF;
        this.f12052e = choiceQuestionPath;
        this.f12053f = choiceCorrectPath;
    }

    /* renamed from: a */
    public final Path m11863a() {
        return this.f12053f;
    }

    /* renamed from: b */
    public final Path m11864b() {
        return this.f12052e;
    }

    /* renamed from: c */
    public final RectF m11865c() {
        return this.f12051d;
    }

    /* renamed from: d */
    public final String m11866d() {
        return this.f12048a;
    }

    /* renamed from: e */
    public final RectF m11867e() {
        return this.f12050c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7393l0)) {
            return false;
        }
        C7393l0 c7393l0 = (C7393l0) obj;
        return Intrinsics.areEqual(this.f12048a, c7393l0.f12048a) && Intrinsics.areEqual(this.f12049b, c7393l0.f12049b) && Intrinsics.areEqual(this.f12050c, c7393l0.f12050c) && Intrinsics.areEqual(this.f12051d, c7393l0.f12051d) && Intrinsics.areEqual(this.f12052e, c7393l0.f12052e) && Intrinsics.areEqual(this.f12053f, c7393l0.f12053f);
    }

    /* renamed from: f */
    public final List m11868f() {
        return this.f12049b;
    }

    public int hashCode() {
        return (((((((((this.f12048a.hashCode() * 31) + this.f12049b.hashCode()) * 31) + this.f12050c.hashCode()) * 31) + this.f12051d.hashCode()) * 31) + this.f12052e.hashCode()) * 31) + this.f12053f.hashCode();
    }

    public String toString() {
        return "SelectQuestionArea(groupKey=" + this.f12048a + ", uuidList=" + this.f12049b + ", questionRectF=" + this.f12050c + ", correctTextRectF=" + this.f12051d + ", choiceQuestionPath=" + this.f12052e + ", choiceCorrectPath=" + this.f12053f + ")";
    }
}
