package androidx.compose.p013ui.graphics;

import java.util.Arrays;
import kotlin.enums.AbstractC9108a;
import kotlin.jvm.internal.AbstractC9133u;
import p212p7.InterfaceC9760a;

/* loaded from: classes2.dex */
public final class PathSegment {
    private final float[] points;
    private final Type type;
    private final float weight;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        private static final /* synthetic */ InterfaceC9760a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type Move = new Type("Move", 0);
        public static final Type Line = new Type("Line", 1);
        public static final Type Quadratic = new Type("Quadratic", 2);
        public static final Type Conic = new Type("Conic", 3);
        public static final Type Cubic = new Type("Cubic", 4);
        public static final Type Close = new Type("Close", 5);
        public static final Type Done = new Type("Done", 6);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{Move, Line, Quadratic, Conic, Cubic, Close, Done};
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = AbstractC9108a.m16085a(typeArr$values);
        }

        private Type(String str, int i10) {
        }

        public static InterfaceC9760a getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public PathSegment(Type type, float[] fArr, float f10) {
        this.type = type;
        this.points = fArr;
        this.weight = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PathSegment.class == obj.getClass()) {
            PathSegment pathSegment = (PathSegment) obj;
            if (this.type == pathSegment.type && Arrays.equals(this.points, pathSegment.points) && this.weight == pathSegment.weight) {
                return true;
            }
        }
        return false;
    }

    public final float[] getPoints() {
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
        AbstractC9133u.m16132f(string, "toString(...)");
        sb.append(string);
        sb.append(", weight=");
        sb.append(this.weight);
        sb.append(')');
        return sb.toString();
    }
}
