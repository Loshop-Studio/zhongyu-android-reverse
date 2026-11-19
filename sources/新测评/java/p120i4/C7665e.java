package p120i4;

import android.graphics.RectF;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i4.e */
/* loaded from: classes4.dex */
public final class C7665e {

    /* renamed from: a */
    public final RectF f12956a;

    /* renamed from: b */
    public final ArrayList f12957b;

    /* renamed from: c */
    public final RectF f12958c;

    /* renamed from: d */
    public final RectF f12959d;

    /* renamed from: e */
    public final ArrayList f12960e;

    /* renamed from: f */
    public final RectF f12961f;

    /* renamed from: g */
    public final RectF f12962g;

    /* renamed from: h */
    public final RectF f12963h;

    /* renamed from: i */
    public final RectF f12964i;

    /* renamed from: j */
    public final RectF f12965j;

    public C7665e(RectF delete, ArrayList colorList, RectF customColor, RectF writeEdit, ArrayList writeStrokeWidthList, RectF textEdit, RectF textSizeReduce, RectF textSizeAdd, RectF geometryStroke, RectF imageCrop) {
        Intrinsics.checkNotNullParameter(delete, "delete");
        Intrinsics.checkNotNullParameter(colorList, "colorList");
        Intrinsics.checkNotNullParameter(customColor, "customColor");
        Intrinsics.checkNotNullParameter(writeEdit, "writeEdit");
        Intrinsics.checkNotNullParameter(writeStrokeWidthList, "writeStrokeWidthList");
        Intrinsics.checkNotNullParameter(textEdit, "textEdit");
        Intrinsics.checkNotNullParameter(textSizeReduce, "textSizeReduce");
        Intrinsics.checkNotNullParameter(textSizeAdd, "textSizeAdd");
        Intrinsics.checkNotNullParameter(geometryStroke, "geometryStroke");
        Intrinsics.checkNotNullParameter(imageCrop, "imageCrop");
        this.f12956a = delete;
        this.f12957b = colorList;
        this.f12958c = customColor;
        this.f12959d = writeEdit;
        this.f12960e = writeStrokeWidthList;
        this.f12961f = textEdit;
        this.f12962g = textSizeReduce;
        this.f12963h = textSizeAdd;
        this.f12964i = geometryStroke;
        this.f12965j = imageCrop;
    }

    /* renamed from: a */
    public final ArrayList m12793a() {
        return this.f12957b;
    }

    /* renamed from: b */
    public final RectF m12794b() {
        return this.f12958c;
    }

    /* renamed from: c */
    public final RectF m12795c() {
        return this.f12956a;
    }

    /* renamed from: d */
    public final RectF m12796d() {
        return this.f12964i;
    }

    /* renamed from: e */
    public final RectF m12797e() {
        return this.f12965j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7665e)) {
            return false;
        }
        C7665e c7665e = (C7665e) obj;
        return Intrinsics.areEqual(this.f12956a, c7665e.f12956a) && Intrinsics.areEqual(this.f12957b, c7665e.f12957b) && Intrinsics.areEqual(this.f12958c, c7665e.f12958c) && Intrinsics.areEqual(this.f12959d, c7665e.f12959d) && Intrinsics.areEqual(this.f12960e, c7665e.f12960e) && Intrinsics.areEqual(this.f12961f, c7665e.f12961f) && Intrinsics.areEqual(this.f12962g, c7665e.f12962g) && Intrinsics.areEqual(this.f12963h, c7665e.f12963h) && Intrinsics.areEqual(this.f12964i, c7665e.f12964i) && Intrinsics.areEqual(this.f12965j, c7665e.f12965j);
    }

    /* renamed from: f */
    public final RectF m12798f() {
        return this.f12961f;
    }

    /* renamed from: g */
    public final RectF m12799g() {
        return this.f12963h;
    }

    /* renamed from: h */
    public final RectF m12800h() {
        return this.f12962g;
    }

    public int hashCode() {
        return (((((((((((((((((this.f12956a.hashCode() * 31) + this.f12957b.hashCode()) * 31) + this.f12958c.hashCode()) * 31) + this.f12959d.hashCode()) * 31) + this.f12960e.hashCode()) * 31) + this.f12961f.hashCode()) * 31) + this.f12962g.hashCode()) * 31) + this.f12963h.hashCode()) * 31) + this.f12964i.hashCode()) * 31) + this.f12965j.hashCode();
    }

    /* renamed from: i */
    public final RectF m12801i() {
        return this.f12959d;
    }

    /* renamed from: j */
    public final ArrayList m12802j() {
        return this.f12960e;
    }

    public String toString() {
        return "FunctionRectF(delete=" + this.f12956a + ", colorList=" + this.f12957b + ", customColor=" + this.f12958c + ", writeEdit=" + this.f12959d + ", writeStrokeWidthList=" + this.f12960e + ", textEdit=" + this.f12961f + ", textSizeReduce=" + this.f12962g + ", textSizeAdd=" + this.f12963h + ", geometryStroke=" + this.f12964i + ", imageCrop=" + this.f12965j + ')';
    }

    public /* synthetic */ C7665e(RectF rectF, ArrayList arrayList, RectF rectF2, RectF rectF3, ArrayList arrayList2, RectF rectF4, RectF rectF5, RectF rectF6, RectF rectF7, RectF rectF8, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new RectF() : rectF, (i10 & 2) != 0 ? new ArrayList() : arrayList, (i10 & 4) != 0 ? new RectF() : rectF2, (i10 & 8) != 0 ? new RectF() : rectF3, (i10 & 16) != 0 ? new ArrayList() : arrayList2, (i10 & 32) != 0 ? new RectF() : rectF4, (i10 & 64) != 0 ? new RectF() : rectF5, (i10 & 128) != 0 ? new RectF() : rectF6, (i10 & 256) != 0 ? new RectF() : rectF7, (i10 & 512) != 0 ? new RectF() : rectF8);
    }
}
