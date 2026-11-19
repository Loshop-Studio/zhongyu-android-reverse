package androidx.graphics.path;

import android.graphics.PointF;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
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
        AbstractC9133u.m16133g(type, "type");
        AbstractC9133u.m16133g(points, "points");
        this.type = type;
        this.points = points;
        this.weight = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC9133u.m16128b(PathSegment.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type androidx.graphics.path.PathSegment");
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
        StringBuilder sb = new StringBuilder();
        sb.append("PathSegment(type=");
        sb.append(this.type);
        sb.append(", points=");
        String string = Arrays.toString(this.points);
        AbstractC9133u.m16132f(string, "toString(this)");
        sb.append(string);
        sb.append(", weight=");
        sb.append(this.weight);
        sb.append(')');
        return sb.toString();
    }
}
