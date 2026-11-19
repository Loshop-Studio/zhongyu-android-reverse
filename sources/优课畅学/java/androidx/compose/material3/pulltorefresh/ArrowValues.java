package androidx.compose.material3.pulltorefresh;

import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes2.dex */
final class ArrowValues {
    private final float endAngle;
    private final float rotation;
    private final float scale;
    private final float startAngle;

    public ArrowValues(float f10, float f11, float f12, float f13) {
        this.rotation = f10;
        this.startAngle = f11;
        this.endAngle = f12;
        this.scale = f13;
    }

    public final float getEndAngle() {
        return this.endAngle;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final float getScale() {
        return this.scale;
    }

    public final float getStartAngle() {
        return this.startAngle;
    }
}
