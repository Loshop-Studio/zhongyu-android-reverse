package androidx.graphics.path;

import android.graphics.PointF;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public final class PathSegment {
    private final PointF[] points;
    private final Type type;
    private final float weight;

    public enum Type {
        Move,
        Line,
        Quadratic,
        Conic,
        Cubic,
        Close,
        Done
    }

    public PathSegment(Type type, PointF[] points, float f10) {
        AbstractC9979u.m20294g(type, "type");
        AbstractC9979u.m20294g(points, "points");
        this.type = type;
        this.points = points;
        this.weight = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC9979u.m20289b(PathSegment.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type androidx.graphics.path.PathSegment");
        PathSegment pathSegment = (PathSegment) obj;
        return this.type == pathSegment.type && Arrays.equals(this.points, pathSegment.points) && this.weight == pathSegment.weight;
    }

    public final PointF[] getPoints() {
        return this.points;
    }

    public final Type getType() {
        return this.type;
    }

    public final float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + Arrays.hashCode(this.points)) * 31) + Float.hashCode(this.weight);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("PathSegment(type=");
        sb2.append(this.type);
        sb2.append(", points=");
        String string = Arrays.toString(this.points);
        AbstractC9979u.m20293f(string, "toString(this)");
        sb2.append(string);
        sb2.append(", weight=");
        sb2.append(this.weight);
        sb2.append(')');
        return sb2.toString();
    }
}
