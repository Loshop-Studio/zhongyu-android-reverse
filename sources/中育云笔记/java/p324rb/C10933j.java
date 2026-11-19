package p324rb;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: rb.j */
/* loaded from: classes6.dex */
public final class C10933j {

    /* renamed from: a */
    public final Path f26438a;

    /* renamed from: b */
    public final Paint f26439b;

    /* renamed from: c */
    public final RectF f26440c;

    /* renamed from: d */
    public final List f26441d;

    public C10933j(Path path, Paint paint, RectF rectF, List pointList) {
        AbstractC9979u.m20294g(path, "path");
        AbstractC9979u.m20294g(paint, "paint");
        AbstractC9979u.m20294g(rectF, "rectF");
        AbstractC9979u.m20294g(pointList, "pointList");
        this.f26438a = path;
        this.f26439b = paint;
        this.f26440c = rectF;
        this.f26441d = pointList;
    }

    /* renamed from: a */
    public final Paint m23849a() {
        return this.f26439b;
    }

    /* renamed from: b */
    public final Path m23850b() {
        return this.f26438a;
    }

    /* renamed from: c */
    public final List m23851c() {
        return this.f26441d;
    }

    /* renamed from: d */
    public final RectF m23852d() {
        return this.f26440c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10933j)) {
            return false;
        }
        C10933j c10933j = (C10933j) obj;
        return AbstractC9979u.m20289b(this.f26438a, c10933j.f26438a) && AbstractC9979u.m20289b(this.f26439b, c10933j.f26439b) && AbstractC9979u.m20289b(this.f26440c, c10933j.f26440c) && AbstractC9979u.m20289b(this.f26441d, c10933j.f26441d);
    }

    public int hashCode() {
        return (((((this.f26438a.hashCode() * 31) + this.f26439b.hashCode()) * 31) + this.f26440c.hashCode()) * 31) + this.f26441d.hashCode();
    }

    public String toString() {
        return "WritePath(path=" + this.f26438a + ", paint=" + this.f26439b + ", rectF=" + this.f26440c + ", pointList=" + this.f26441d + ")";
    }
}
