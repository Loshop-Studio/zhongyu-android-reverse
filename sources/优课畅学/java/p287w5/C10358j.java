package p287w5;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: w5.j */
/* loaded from: classes5.dex */
public final class C10358j {

    /* renamed from: a */
    public final Path f20638a;

    /* renamed from: b */
    public final Paint f20639b;

    /* renamed from: c */
    public final RectF f20640c;

    /* renamed from: d */
    public final List f20641d;

    public C10358j(Path path, Paint paint, RectF rectF, List pointList) {
        AbstractC9133u.m16133g(path, "path");
        AbstractC9133u.m16133g(paint, "paint");
        AbstractC9133u.m16133g(rectF, "rectF");
        AbstractC9133u.m16133g(pointList, "pointList");
        this.f20638a = path;
        this.f20639b = paint;
        this.f20640c = rectF;
        this.f20641d = pointList;
    }

    /* renamed from: a */
    public final Paint m19292a() {
        return this.f20639b;
    }

    /* renamed from: b */
    public final Path m19293b() {
        return this.f20638a;
    }

    /* renamed from: c */
    public final List m19294c() {
        return this.f20641d;
    }

    /* renamed from: d */
    public final RectF m19295d() {
        return this.f20640c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10358j)) {
            return false;
        }
        C10358j c10358j = (C10358j) obj;
        return AbstractC9133u.m16128b(this.f20638a, c10358j.f20638a) && AbstractC9133u.m16128b(this.f20639b, c10358j.f20639b) && AbstractC9133u.m16128b(this.f20640c, c10358j.f20640c) && AbstractC9133u.m16128b(this.f20641d, c10358j.f20641d);
    }

    public int hashCode() {
        return (((((this.f20638a.hashCode() * 31) + this.f20639b.hashCode()) * 31) + this.f20640c.hashCode()) * 31) + this.f20641d.hashCode();
    }

    public String toString() {
        return "WritePath(path=" + this.f20638a + ", paint=" + this.f20639b + ", rectF=" + this.f20640c + ", pointList=" + this.f20641d + ")";
    }
}
