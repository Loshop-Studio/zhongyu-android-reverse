package p288x7;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: x7.j */
/* loaded from: classes5.dex */
public final class C9880j {

    /* renamed from: a */
    public final Path f17510a;

    /* renamed from: b */
    public final Paint f17511b;

    /* renamed from: c */
    public final RectF f17512c;

    /* renamed from: d */
    public final List f17513d;

    public C9880j(Path path, Paint paint, RectF rectF, List pointList) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(rectF, "rectF");
        Intrinsics.checkNotNullParameter(pointList, "pointList");
        this.f17510a = path;
        this.f17511b = paint;
        this.f17512c = rectF;
        this.f17513d = pointList;
    }

    /* renamed from: a */
    public final Paint m16586a() {
        return this.f17511b;
    }

    /* renamed from: b */
    public final Path m16587b() {
        return this.f17510a;
    }

    /* renamed from: c */
    public final List m16588c() {
        return this.f17513d;
    }

    /* renamed from: d */
    public final RectF m16589d() {
        return this.f17512c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9880j)) {
            return false;
        }
        C9880j c9880j = (C9880j) obj;
        return Intrinsics.areEqual(this.f17510a, c9880j.f17510a) && Intrinsics.areEqual(this.f17511b, c9880j.f17511b) && Intrinsics.areEqual(this.f17512c, c9880j.f17512c) && Intrinsics.areEqual(this.f17513d, c9880j.f17513d);
    }

    public int hashCode() {
        return (((((this.f17510a.hashCode() * 31) + this.f17511b.hashCode()) * 31) + this.f17512c.hashCode()) * 31) + this.f17513d.hashCode();
    }

    public String toString() {
        return "WritePath(path=" + this.f17510a + ", paint=" + this.f17511b + ", rectF=" + this.f17512c + ", pointList=" + this.f17513d + ")";
    }
}
