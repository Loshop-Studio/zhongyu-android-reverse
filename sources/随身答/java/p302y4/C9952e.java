package p302y4;

import android.graphics.RectF;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: y4.e */
/* loaded from: classes4.dex */
public final class C9952e {

    /* renamed from: a */
    public final RectF f17919a;

    /* renamed from: b */
    public final ArrayList f17920b;

    /* renamed from: c */
    public final RectF f17921c;

    /* renamed from: d */
    public final RectF f17922d;

    /* renamed from: e */
    public final ArrayList f17923e;

    /* renamed from: f */
    public final RectF f17924f;

    /* renamed from: g */
    public final RectF f17925g;

    /* renamed from: h */
    public final RectF f17926h;

    /* renamed from: i */
    public final RectF f17927i;

    /* renamed from: j */
    public final RectF f17928j;

    public C9952e(RectF delete, ArrayList colorList, RectF customColor, RectF writeEdit, ArrayList writeStrokeWidthList, RectF textEdit, RectF textSizeReduce, RectF textSizeAdd, RectF geometryStroke, RectF imageCrop) {
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
        this.f17919a = delete;
        this.f17920b = colorList;
        this.f17921c = customColor;
        this.f17922d = writeEdit;
        this.f17923e = writeStrokeWidthList;
        this.f17924f = textEdit;
        this.f17925g = textSizeReduce;
        this.f17926h = textSizeAdd;
        this.f17927i = geometryStroke;
        this.f17928j = imageCrop;
    }

    /* renamed from: a */
    public final ArrayList m17215a() {
        return this.f17920b;
    }

    /* renamed from: b */
    public final RectF m17216b() {
        return this.f17921c;
    }

    /* renamed from: c */
    public final RectF m17217c() {
        return this.f17919a;
    }

    /* renamed from: d */
    public final RectF m17218d() {
        return this.f17927i;
    }

    /* renamed from: e */
    public final RectF m17219e() {
        return this.f17928j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9952e)) {
            return false;
        }
        C9952e c9952e = (C9952e) obj;
        return Intrinsics.areEqual(this.f17919a, c9952e.f17919a) && Intrinsics.areEqual(this.f17920b, c9952e.f17920b) && Intrinsics.areEqual(this.f17921c, c9952e.f17921c) && Intrinsics.areEqual(this.f17922d, c9952e.f17922d) && Intrinsics.areEqual(this.f17923e, c9952e.f17923e) && Intrinsics.areEqual(this.f17924f, c9952e.f17924f) && Intrinsics.areEqual(this.f17925g, c9952e.f17925g) && Intrinsics.areEqual(this.f17926h, c9952e.f17926h) && Intrinsics.areEqual(this.f17927i, c9952e.f17927i) && Intrinsics.areEqual(this.f17928j, c9952e.f17928j);
    }

    /* renamed from: f */
    public final RectF m17220f() {
        return this.f17924f;
    }

    /* renamed from: g */
    public final RectF m17221g() {
        return this.f17926h;
    }

    /* renamed from: h */
    public final RectF m17222h() {
        return this.f17925g;
    }

    public int hashCode() {
        return (((((((((((((((((this.f17919a.hashCode() * 31) + this.f17920b.hashCode()) * 31) + this.f17921c.hashCode()) * 31) + this.f17922d.hashCode()) * 31) + this.f17923e.hashCode()) * 31) + this.f17924f.hashCode()) * 31) + this.f17925g.hashCode()) * 31) + this.f17926h.hashCode()) * 31) + this.f17927i.hashCode()) * 31) + this.f17928j.hashCode();
    }

    /* renamed from: i */
    public final RectF m17223i() {
        return this.f17922d;
    }

    /* renamed from: j */
    public final ArrayList m17224j() {
        return this.f17923e;
    }

    public String toString() {
        return "FunctionRectF(delete=" + this.f17919a + ", colorList=" + this.f17920b + ", customColor=" + this.f17921c + ", writeEdit=" + this.f17922d + ", writeStrokeWidthList=" + this.f17923e + ", textEdit=" + this.f17924f + ", textSizeReduce=" + this.f17925g + ", textSizeAdd=" + this.f17926h + ", geometryStroke=" + this.f17927i + ", imageCrop=" + this.f17928j + ')';
    }

    public /* synthetic */ C9952e(RectF rectF, ArrayList arrayList, RectF rectF2, RectF rectF3, ArrayList arrayList2, RectF rectF4, RectF rectF5, RectF rectF6, RectF rectF7, RectF rectF8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? new RectF() : rectF, (i9 & 2) != 0 ? new ArrayList() : arrayList, (i9 & 4) != 0 ? new RectF() : rectF2, (i9 & 8) != 0 ? new RectF() : rectF3, (i9 & 16) != 0 ? new ArrayList() : arrayList2, (i9 & 32) != 0 ? new RectF() : rectF4, (i9 & 64) != 0 ? new RectF() : rectF5, (i9 & 128) != 0 ? new RectF() : rectF6, (i9 & 256) != 0 ? new RectF() : rectF7, (i9 & 512) != 0 ? new RectF() : rectF8);
    }
}
