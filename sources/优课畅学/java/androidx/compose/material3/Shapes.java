package androidx.compose.material3;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@Immutable
/* loaded from: classes2.dex */
public final class Shapes {
    public static final int $stable = 0;
    private final CornerBasedShape extraLarge;
    private final CornerBasedShape extraSmall;
    private final CornerBasedShape large;
    private final CornerBasedShape medium;
    private final CornerBasedShape small;

    public Shapes() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ Shapes copy$default(Shapes shapes, CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, CornerBasedShape cornerBasedShape4, CornerBasedShape cornerBasedShape5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cornerBasedShape = shapes.extraSmall;
        }
        if ((i10 & 2) != 0) {
            cornerBasedShape2 = shapes.small;
        }
        if ((i10 & 4) != 0) {
            cornerBasedShape3 = shapes.medium;
        }
        if ((i10 & 8) != 0) {
            cornerBasedShape4 = shapes.large;
        }
        if ((i10 & 16) != 0) {
            cornerBasedShape5 = shapes.extraLarge;
        }
        CornerBasedShape cornerBasedShape6 = cornerBasedShape5;
        CornerBasedShape cornerBasedShape7 = cornerBasedShape3;
        return shapes.copy(cornerBasedShape, cornerBasedShape2, cornerBasedShape7, cornerBasedShape4, cornerBasedShape6);
    }

    public final Shapes copy(CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, CornerBasedShape cornerBasedShape4, CornerBasedShape cornerBasedShape5) {
        return new Shapes(cornerBasedShape, cornerBasedShape2, cornerBasedShape3, cornerBasedShape4, cornerBasedShape5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shapes)) {
            return false;
        }
        Shapes shapes = (Shapes) obj;
        return AbstractC9133u.m16128b(this.extraSmall, shapes.extraSmall) && AbstractC9133u.m16128b(this.small, shapes.small) && AbstractC9133u.m16128b(this.medium, shapes.medium) && AbstractC9133u.m16128b(this.large, shapes.large) && AbstractC9133u.m16128b(this.extraLarge, shapes.extraLarge);
    }

    public final CornerBasedShape getExtraLarge() {
        return this.extraLarge;
    }

    public final CornerBasedShape getExtraSmall() {
        return this.extraSmall;
    }

    public final CornerBasedShape getLarge() {
        return this.large;
    }

    public final CornerBasedShape getMedium() {
        return this.medium;
    }

    public final CornerBasedShape getSmall() {
        return this.small;
    }

    public int hashCode() {
        return (((((((this.extraSmall.hashCode() * 31) + this.small.hashCode()) * 31) + this.medium.hashCode()) * 31) + this.large.hashCode()) * 31) + this.extraLarge.hashCode();
    }

    public String toString() {
        return "Shapes(extraSmall=" + this.extraSmall + ", small=" + this.small + ", medium=" + this.medium + ", large=" + this.large + ", extraLarge=" + this.extraLarge + ')';
    }

    public Shapes(CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, CornerBasedShape cornerBasedShape4, CornerBasedShape cornerBasedShape5) {
        this.extraSmall = cornerBasedShape;
        this.small = cornerBasedShape2;
        this.medium = cornerBasedShape3;
        this.large = cornerBasedShape4;
        this.extraLarge = cornerBasedShape5;
    }

    public /* synthetic */ Shapes(CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, CornerBasedShape cornerBasedShape4, CornerBasedShape cornerBasedShape5, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? ShapeDefaults.INSTANCE.getExtraSmall() : cornerBasedShape, (i10 & 2) != 0 ? ShapeDefaults.INSTANCE.getSmall() : cornerBasedShape2, (i10 & 4) != 0 ? ShapeDefaults.INSTANCE.getMedium() : cornerBasedShape3, (i10 & 8) != 0 ? ShapeDefaults.INSTANCE.getLarge() : cornerBasedShape4, (i10 & 16) != 0 ? ShapeDefaults.INSTANCE.getExtraLarge() : cornerBasedShape5);
    }
}
