package androidx.compose.p013ui;

import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.BiasAbsoluteAlignment;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(m13557d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J*\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, m13558d2 = {"Landroidx/compose/ui/BiasAlignment;", "Landroidx/compose/ui/Alignment;", "horizontalBias", "", "verticalBias", "(FF)V", "getHorizontalBias", "()F", "getVerticalBias", "align", "Landroidx/compose/ui/unit/IntOffset;", "size", "Landroidx/compose/ui/unit/IntSize;", "space", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "align-KFBX0sM", "(JJLandroidx/compose/ui/unit/LayoutDirection;)J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Horizontal", "Vertical", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nAlignment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAlignment\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,279:1\n54#2:280\n59#2:282\n85#3:281\n90#3:283\n80#3:286\n26#4:284\n32#5:285\n*S KotlinDebug\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAlignment\n*L\n151#1:280\n152#1:282\n151#1:281\n152#1:283\n162#1:286\n162#1:284\n162#1:285\n*E\n"})
/* loaded from: classes2.dex */
public final /* data */ class BiasAlignment implements Alignment {
    public static final int $stable = 0;
    private final float horizontalBias;
    private final float verticalBias;

    @Metadata(m13557d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\bHÖ\u0001J\u0011\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0016H\u0096\u0002J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0019"}, m13558d2 = {"Landroidx/compose/ui/BiasAlignment$Horizontal;", "Landroidx/compose/ui/Alignment$Horizontal;", "bias", "", "(F)V", "getBias", "()F", "align", "", "size", "space", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "component1", "copy", "equals", "", "other", "", "hashCode", "plus", "Landroidx/compose/ui/Alignment;", "Landroidx/compose/ui/Alignment$Vertical;", "toString", "", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    @Immutable
    @SourceDebugExtension({"SMAP\nAlignment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAlignment$Horizontal\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,279:1\n26#2:280\n*S KotlinDebug\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAlignment$Horizontal\n*L\n182#1:280\n*E\n"})
    public static final /* data */ class Horizontal implements Alignment.Horizontal {
        public static final int $stable = 0;
        private final float bias;

        public Horizontal(float f10) {
            this.bias = f10;
        }

        public static /* synthetic */ Horizontal copy$default(Horizontal horizontal, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = horizontal.bias;
            }
            return horizontal.copy(f10);
        }

        @Override // androidx.compose.ui.Alignment.Horizontal
        public int align(int size, int space, LayoutDirection layoutDirection) {
            return Math.round(((space - size) / 2.0f) * (1 + (layoutDirection == LayoutDirection.Ltr ? this.bias : (-1) * this.bias)));
        }

        /* renamed from: component1, reason: from getter */
        public final float getBias() {
            return this.bias;
        }

        public final Horizontal copy(float bias) {
            return new Horizontal(bias);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Horizontal) && Float.compare(this.bias, ((Horizontal) other).bias) == 0;
        }

        public final float getBias() {
            return this.bias;
        }

        public int hashCode() {
            return Float.hashCode(this.bias);
        }

        @Override // androidx.compose.ui.Alignment.Horizontal
        public Alignment plus(Alignment.Vertical other) {
            return other instanceof Vertical ? new BiasAlignment(this.bias, ((Vertical) other).getBias()) : super.plus(other);
        }

        public String toString() {
            return "Horizontal(bias=" + this.bias + ')';
        }
    }

    @Metadata(m13557d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\bHÖ\u0001J\u0011\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0014H\u0096\u0002J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, m13558d2 = {"Landroidx/compose/ui/BiasAlignment$Vertical;", "Landroidx/compose/ui/Alignment$Vertical;", "bias", "", "(F)V", "getBias", "()F", "align", "", "size", "space", "component1", "copy", "equals", "", "other", "", "hashCode", "plus", "Landroidx/compose/ui/Alignment;", "Landroidx/compose/ui/Alignment$Horizontal;", "toString", "", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    @Immutable
    @SourceDebugExtension({"SMAP\nAlignment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAlignment$Vertical\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,279:1\n26#2:280\n*S KotlinDebug\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAlignment$Vertical\n*L\n208#1:280\n*E\n"})
    public static final /* data */ class Vertical implements Alignment.Vertical {
        public static final int $stable = 0;
        private final float bias;

        public Vertical(float f10) {
            this.bias = f10;
        }

        public static /* synthetic */ Vertical copy$default(Vertical vertical, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = vertical.bias;
            }
            return vertical.copy(f10);
        }

        @Override // androidx.compose.ui.Alignment.Vertical
        public int align(int size, int space) {
            return Math.round(((space - size) / 2.0f) * (1 + this.bias));
        }

        /* renamed from: component1, reason: from getter */
        public final float getBias() {
            return this.bias;
        }

        public final Vertical copy(float bias) {
            return new Vertical(bias);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Vertical) && Float.compare(this.bias, ((Vertical) other).bias) == 0;
        }

        public final float getBias() {
            return this.bias;
        }

        public int hashCode() {
            return Float.hashCode(this.bias);
        }

        @Override // androidx.compose.ui.Alignment.Vertical
        public Alignment plus(Alignment.Horizontal other) {
            return other instanceof Horizontal ? new BiasAlignment(((Horizontal) other).getBias(), this.bias) : other instanceof BiasAbsoluteAlignment.Horizontal ? new BiasAbsoluteAlignment(((BiasAbsoluteAlignment.Horizontal) other).getBias(), this.bias) : super.plus(other);
        }

        public String toString() {
            return "Vertical(bias=" + this.bias + ')';
        }
    }

    public BiasAlignment(float f10, float f11) {
        this.horizontalBias = f10;
        this.verticalBias = f11;
    }

    public static /* synthetic */ BiasAlignment copy$default(BiasAlignment biasAlignment, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = biasAlignment.horizontalBias;
        }
        if ((i10 & 2) != 0) {
            f11 = biasAlignment.verticalBias;
        }
        return biasAlignment.copy(f10, f11);
    }

    @Override // androidx.compose.p013ui.Alignment
    /* renamed from: align-KFBX0sM */
    public long mo20552alignKFBX0sM(long size, long space, LayoutDirection layoutDirection) {
        float f10 = (((int) (space >> 32)) - ((int) (size >> 32))) / 2.0f;
        float f11 = (((int) (space & 4294967295L)) - ((int) (size & 4294967295L))) / 2.0f;
        float f12 = 1;
        return IntOffset.m23683constructorimpl((Math.round(f10 * ((layoutDirection == LayoutDirection.Ltr ? this.horizontalBias : (-1) * this.horizontalBias) + f12)) << 32) | (Math.round(f11 * (f12 + this.verticalBias)) & 4294967295L));
    }

    /* renamed from: component1, reason: from getter */
    public final float getHorizontalBias() {
        return this.horizontalBias;
    }

    /* renamed from: component2, reason: from getter */
    public final float getVerticalBias() {
        return this.verticalBias;
    }

    public final BiasAlignment copy(float horizontalBias, float verticalBias) {
        return new BiasAlignment(horizontalBias, verticalBias);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BiasAlignment)) {
            return false;
        }
        BiasAlignment biasAlignment = (BiasAlignment) other;
        return Float.compare(this.horizontalBias, biasAlignment.horizontalBias) == 0 && Float.compare(this.verticalBias, biasAlignment.verticalBias) == 0;
    }

    public final float getHorizontalBias() {
        return this.horizontalBias;
    }

    public final float getVerticalBias() {
        return this.verticalBias;
    }

    public int hashCode() {
        return (Float.hashCode(this.horizontalBias) * 31) + Float.hashCode(this.verticalBias);
    }

    public String toString() {
        return "BiasAlignment(horizontalBias=" + this.horizontalBias + ", verticalBias=" + this.verticalBias + ')';
    }
}
