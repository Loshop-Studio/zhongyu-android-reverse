package p139i7;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i7.k */
/* loaded from: classes5.dex */
public final class C8150k {

    /* renamed from: a */
    public final Path f13964a;

    /* renamed from: b */
    public final Paint f13965b;

    /* renamed from: c */
    public final RectF f13966c;

    /* renamed from: d */
    public final List f13967d;

    public C8150k(Path path, Paint paint, RectF rectF, List pointList) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(rectF, "rectF");
        Intrinsics.checkNotNullParameter(pointList, "pointList");
        this.f13964a = path;
        this.f13965b = paint;
        this.f13966c = rectF;
        this.f13967d = pointList;
    }

    /* renamed from: a */
    public final Paint m13076a() {
        return this.f13965b;
    }

    /* renamed from: b */
    public final Path m13077b() {
        return this.f13964a;
    }

    /* renamed from: c */
    public final List m13078c() {
        return this.f13967d;
    }

    /* renamed from: d */
    public final RectF m13079d() {
        return this.f13966c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8150k)) {
            return false;
        }
        C8150k c8150k = (C8150k) obj;
        return Intrinsics.areEqual(this.f13964a, c8150k.f13964a) && Intrinsics.areEqual(this.f13965b, c8150k.f13965b) && Intrinsics.areEqual(this.f13966c, c8150k.f13966c) && Intrinsics.areEqual(this.f13967d, c8150k.f13967d);
    }

    public int hashCode() {
        return (((((this.f13964a.hashCode() * 31) + this.f13965b.hashCode()) * 31) + this.f13966c.hashCode()) * 31) + this.f13967d.hashCode();
    }

    public String toString() {
        return "WritePath(path=" + this.f13964a + ", paint=" + this.f13965b + ", rectF=" + this.f13966c + ", pointList=" + this.f13967d + ")";
    }
}
