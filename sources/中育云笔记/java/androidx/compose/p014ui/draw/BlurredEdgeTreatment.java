package androidx.compose.p014ui.draw;

import androidx.compose.p014ui.graphics.RectangleShapeKt;
import androidx.compose.p014ui.graphics.Shape;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@Immutable
/* loaded from: classes2.dex */
public final class BlurredEdgeTreatment {
    public static final Companion Companion = new Companion(null);
    private static final Shape Rectangle = m30480constructorimpl(RectangleShapeKt.getRectangleShape());
    private static final Shape Unbounded = m30480constructorimpl(null);
    private final Shape shape;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getRectangle---Goahg, reason: not valid java name */
        public final Shape m30486getRectangleGoahg() {
            return BlurredEdgeTreatment.Rectangle;
        }

        /* renamed from: getUnbounded---Goahg, reason: not valid java name */
        public final Shape m30487getUnboundedGoahg() {
            return BlurredEdgeTreatment.Unbounded;
        }

        private Companion() {
        }
    }

    private /* synthetic */ BlurredEdgeTreatment(Shape shape) {
        this.shape = shape;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ BlurredEdgeTreatment m30479boximpl(Shape shape) {
        return new BlurredEdgeTreatment(shape);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static Shape m30480constructorimpl(Shape shape) {
        return shape;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m30481equalsimpl(Shape shape, Object obj) {
        return (obj instanceof BlurredEdgeTreatment) && AbstractC9979u.m20289b(shape, ((BlurredEdgeTreatment) obj).m30485unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30482equalsimpl0(Shape shape, Shape shape2) {
        return AbstractC9979u.m20289b(shape, shape2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m30483hashCodeimpl(Shape shape) {
        if (shape == null) {
            return 0;
        }
        return shape.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m30484toStringimpl(Shape shape) {
        return "BlurredEdgeTreatment(shape=" + shape + ')';
    }

    public boolean equals(Object obj) {
        return m30481equalsimpl(this.shape, obj);
    }

    public final Shape getShape() {
        return this.shape;
    }

    public int hashCode() {
        return m30483hashCodeimpl(this.shape);
    }

    public String toString() {
        return m30484toStringimpl(this.shape);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Shape m30485unboximpl() {
        return this.shape;
    }
}
