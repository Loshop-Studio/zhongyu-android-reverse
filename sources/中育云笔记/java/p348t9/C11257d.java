package p348t9;

import android.graphics.RectF;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: t9.d */
/* loaded from: classes5.dex */
public final class C11257d {

    /* renamed from: a */
    public final RectF f27048a;

    /* renamed from: b */
    public final ArrayList f27049b;

    /* renamed from: c */
    public final RectF f27050c;

    /* renamed from: d */
    public final ArrayList f27051d;

    /* renamed from: e */
    public final RectF f27052e;

    /* renamed from: f */
    public final RectF f27053f;

    /* renamed from: g */
    public final RectF f27054g;

    /* renamed from: h */
    public final RectF f27055h;

    /* renamed from: i */
    public final RectF f27056i;

    public C11257d(RectF delete, ArrayList colorList, RectF writeEdit, ArrayList writeStrokeWidthList, RectF textEdit, RectF textSizeReduce, RectF textSizeAdd, RectF geometryStroke, RectF imageCrop) {
        AbstractC9979u.m20294g(delete, "delete");
        AbstractC9979u.m20294g(colorList, "colorList");
        AbstractC9979u.m20294g(writeEdit, "writeEdit");
        AbstractC9979u.m20294g(writeStrokeWidthList, "writeStrokeWidthList");
        AbstractC9979u.m20294g(textEdit, "textEdit");
        AbstractC9979u.m20294g(textSizeReduce, "textSizeReduce");
        AbstractC9979u.m20294g(textSizeAdd, "textSizeAdd");
        AbstractC9979u.m20294g(geometryStroke, "geometryStroke");
        AbstractC9979u.m20294g(imageCrop, "imageCrop");
        this.f27048a = delete;
        this.f27049b = colorList;
        this.f27050c = writeEdit;
        this.f27051d = writeStrokeWidthList;
        this.f27052e = textEdit;
        this.f27053f = textSizeReduce;
        this.f27054g = textSizeAdd;
        this.f27055h = geometryStroke;
        this.f27056i = imageCrop;
    }

    /* renamed from: a */
    public final ArrayList m25169a() {
        return this.f27049b;
    }

    /* renamed from: b */
    public final RectF m25170b() {
        return this.f27048a;
    }

    /* renamed from: c */
    public final RectF m25171c() {
        return this.f27055h;
    }

    /* renamed from: d */
    public final RectF m25172d() {
        return this.f27056i;
    }

    /* renamed from: e */
    public final RectF m25173e() {
        return this.f27052e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11257d)) {
            return false;
        }
        C11257d c11257d = (C11257d) obj;
        return AbstractC9979u.m20289b(this.f27048a, c11257d.f27048a) && AbstractC9979u.m20289b(this.f27049b, c11257d.f27049b) && AbstractC9979u.m20289b(this.f27050c, c11257d.f27050c) && AbstractC9979u.m20289b(this.f27051d, c11257d.f27051d) && AbstractC9979u.m20289b(this.f27052e, c11257d.f27052e) && AbstractC9979u.m20289b(this.f27053f, c11257d.f27053f) && AbstractC9979u.m20289b(this.f27054g, c11257d.f27054g) && AbstractC9979u.m20289b(this.f27055h, c11257d.f27055h) && AbstractC9979u.m20289b(this.f27056i, c11257d.f27056i);
    }

    /* renamed from: f */
    public final RectF m25174f() {
        return this.f27054g;
    }

    /* renamed from: g */
    public final RectF m25175g() {
        return this.f27053f;
    }

    /* renamed from: h */
    public final RectF m25176h() {
        return this.f27050c;
    }

    public int hashCode() {
        return (((((((((((((((this.f27048a.hashCode() * 31) + this.f27049b.hashCode()) * 31) + this.f27050c.hashCode()) * 31) + this.f27051d.hashCode()) * 31) + this.f27052e.hashCode()) * 31) + this.f27053f.hashCode()) * 31) + this.f27054g.hashCode()) * 31) + this.f27055h.hashCode()) * 31) + this.f27056i.hashCode();
    }

    /* renamed from: i */
    public final ArrayList m25177i() {
        return this.f27051d;
    }

    public String toString() {
        return "FunctionRectF(delete=" + this.f27048a + ", colorList=" + this.f27049b + ", writeEdit=" + this.f27050c + ", writeStrokeWidthList=" + this.f27051d + ", textEdit=" + this.f27052e + ", textSizeReduce=" + this.f27053f + ", textSizeAdd=" + this.f27054g + ", geometryStroke=" + this.f27055h + ", imageCrop=" + this.f27056i + ')';
    }

    public /* synthetic */ C11257d(RectF rectF, ArrayList arrayList, RectF rectF2, ArrayList arrayList2, RectF rectF3, RectF rectF4, RectF rectF5, RectF rectF6, RectF rectF7, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? new RectF() : rectF, (i10 & 2) != 0 ? new ArrayList() : arrayList, (i10 & 4) != 0 ? new RectF() : rectF2, (i10 & 8) != 0 ? new ArrayList() : arrayList2, (i10 & 16) != 0 ? new RectF() : rectF3, (i10 & 32) != 0 ? new RectF() : rectF4, (i10 & 64) != 0 ? new RectF() : rectF5, (i10 & 128) != 0 ? new RectF() : rectF6, (i10 & 256) != 0 ? new RectF() : rectF7);
    }
}
