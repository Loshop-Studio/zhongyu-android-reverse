package androidx.compose.material3.pulltorefresh;

import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.motion.widget.Key;
import kotlin.Metadata;

@Immutable
@Metadata(m7879d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, m7880d2 = {"Landroidx/compose/material3/pulltorefresh/ArrowValues;", "", Key.ROTATION, "", "startAngle", "endAngle", "scale", "(FFFF)V", "getEndAngle", "()F", "getRotation", "getScale", "getStartAngle", "material3_release"}, m7881k = 1, m7882mv = {1, 8, 0}, m7884xi = 48)
/* loaded from: classes2.dex */
final class ArrowValues {
    private final float endAngle;
    private final float rotation;
    private final float scale;
    private final float startAngle;

    public ArrowValues(float f6, float f7, float f8, float f9) {
        this.rotation = f6;
        this.startAngle = f7;
        this.endAngle = f8;
        this.scale = f9;
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
