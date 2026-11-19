package p079e7;

import android.graphics.RectF;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e7.d */
/* loaded from: classes4.dex */
public final class C7376d {

    /* renamed from: a */
    public final boolean f11967a;

    /* renamed from: b */
    public final String f11968b;

    /* renamed from: c */
    public final List f11969c;

    /* renamed from: d */
    public final List f11970d;

    /* renamed from: e */
    public final RectF f11971e;

    /* renamed from: f */
    public final RectF f11972f;

    /* renamed from: g */
    public final RectF f11973g;

    /* renamed from: h */
    public float f11974h;

    /* renamed from: i */
    public float f11975i;

    public C7376d(boolean z9, String groupKey, List uuidList, List questionRectFList, RectF dragTextRectF, RectF dragBackgroundRectF, RectF limitRectF, float f10, float f11) {
        Intrinsics.checkNotNullParameter(groupKey, "groupKey");
        Intrinsics.checkNotNullParameter(uuidList, "uuidList");
        Intrinsics.checkNotNullParameter(questionRectFList, "questionRectFList");
        Intrinsics.checkNotNullParameter(dragTextRectF, "dragTextRectF");
        Intrinsics.checkNotNullParameter(dragBackgroundRectF, "dragBackgroundRectF");
        Intrinsics.checkNotNullParameter(limitRectF, "limitRectF");
        this.f11967a = z9;
        this.f11968b = groupKey;
        this.f11969c = uuidList;
        this.f11970d = questionRectFList;
        this.f11971e = dragTextRectF;
        this.f11972f = dragBackgroundRectF;
        this.f11973g = limitRectF;
        this.f11974h = f10;
        this.f11975i = f11;
    }

    /* renamed from: a */
    public final RectF m11827a() {
        return this.f11972f;
    }

    /* renamed from: b */
    public final RectF m11828b() {
        return this.f11971e;
    }

    /* renamed from: c */
    public final String m11829c() {
        return this.f11968b;
    }

    /* renamed from: d */
    public final RectF m11830d() {
        return this.f11973g;
    }

    /* renamed from: e */
    public final float m11831e() {
        return this.f11974h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7376d)) {
            return false;
        }
        C7376d c7376d = (C7376d) obj;
        return this.f11967a == c7376d.f11967a && Intrinsics.areEqual(this.f11968b, c7376d.f11968b) && Intrinsics.areEqual(this.f11969c, c7376d.f11969c) && Intrinsics.areEqual(this.f11970d, c7376d.f11970d) && Intrinsics.areEqual(this.f11971e, c7376d.f11971e) && Intrinsics.areEqual(this.f11972f, c7376d.f11972f) && Intrinsics.areEqual(this.f11973g, c7376d.f11973g) && Float.compare(this.f11974h, c7376d.f11974h) == 0 && Float.compare(this.f11975i, c7376d.f11975i) == 0;
    }

    /* renamed from: f */
    public final float m11832f() {
        return this.f11975i;
    }

    /* renamed from: g */
    public final List m11833g() {
        return this.f11970d;
    }

    /* renamed from: h */
    public final List m11834h() {
        return this.f11969c;
    }

    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.f11967a) * 31) + this.f11968b.hashCode()) * 31) + this.f11969c.hashCode()) * 31) + this.f11970d.hashCode()) * 31) + this.f11971e.hashCode()) * 31) + this.f11972f.hashCode()) * 31) + this.f11973g.hashCode()) * 31) + Float.hashCode(this.f11974h)) * 31) + Float.hashCode(this.f11975i);
    }

    /* renamed from: i */
    public final boolean m11835i() {
        return this.f11967a;
    }

    /* renamed from: j */
    public final void m11836j(float f10) {
        this.f11974h = f10;
    }

    /* renamed from: k */
    public final void m11837k(float f10) {
        this.f11975i = f10;
    }

    public String toString() {
        return "BlankQuestionArea(isBlank=" + this.f11967a + ", groupKey=" + this.f11968b + ", uuidList=" + this.f11969c + ", questionRectFList=" + this.f11970d + ", dragTextRectF=" + this.f11971e + ", dragBackgroundRectF=" + this.f11972f + ", limitRectF=" + this.f11973g + ", offsetX=" + this.f11974h + ", offsetY=" + this.f11975i + ")";
    }

    public /* synthetic */ C7376d(boolean z9, String str, List list, List list2, RectF rectF, RectF rectF2, RectF rectF3, float f10, float f11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z9, str, list, list2, rectF, rectF2, rectF3, (i10 & 128) != 0 ? 0.0f : f10, (i10 & 256) != 0 ? 0.0f : f11);
    }
}
