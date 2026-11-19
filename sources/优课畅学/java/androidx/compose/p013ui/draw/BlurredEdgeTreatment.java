package androidx.compose.p013ui.draw;

import androidx.compose.p013ui.graphics.RectangleShapeKt;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@Immutable
/* loaded from: classes2.dex */
public final class BlurredEdgeTreatment {
    public static final Companion Companion = new Companion(null);
    private static final Shape Rectangle = m23878constructorimpl(RectangleShapeKt.getRectangleShape());
    private static final Shape Unbounded = m23878constructorimpl(null);
    private final Shape shape;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getRectangle---Goahg, reason: not valid java name */
        public final Shape m23884getRectangleGoahg() {
            return BlurredEdgeTreatment.Rectangle;
        }

        /* renamed from: getUnbounded---Goahg, reason: not valid java name */
        public final Shape m23885getUnboundedGoahg() {
            return BlurredEdgeTreatment.Unbounded;
        }

        private Companion() {
        }
    }

    private /* synthetic */ BlurredEdgeTreatment(Shape shape) {
        this.shape = shape;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ BlurredEdgeTreatment m23877boximpl(Shape shape) {
        return new BlurredEdgeTreatment(shape);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static Shape m23878constructorimpl(Shape shape) {
        return shape;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m23879equalsimpl(Shape shape, Object obj) {
        return (obj instanceof BlurredEdgeTreatment) && AbstractC9133u.m16128b(shape, ((BlurredEdgeTreatment) obj).m23883unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m23880equalsimpl0(Shape shape, Shape shape2) {
        return AbstractC9133u.m16128b(shape, shape2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m23881hashCodeimpl(Shape shape) {
        if (shape == null) {
            return 0;
        }
        return shape.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m23882toStringimpl(Shape shape) {
        return "BlurredEdgeTreatment(shape=" + shape + ')';
    }

    public boolean equals(Object obj) {
        return m23879equalsimpl(this.shape, obj);
    }

    public final Shape getShape() {
        return this.shape;
    }

    public int hashCode() {
        return m23881hashCodeimpl(this.shape);
    }

    public String toString() {
        return m23882toStringimpl(this.shape);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Shape m23883unboximpl() {
        return this.shape;
    }
}
