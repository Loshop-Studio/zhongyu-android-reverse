package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8797p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class DraggableAnchorsConfig<T> {
    public static final int $stable = 8;
    private final List<T> keys = new ArrayList();
    private float[] positions;

    public DraggableAnchorsConfig() {
        float[] fArr = new float[5];
        for (int i10 = 0; i10 < 5; i10++) {
            fArr[i10] = Float.NaN;
        }
        this.positions = fArr;
    }

    private final void expandPositions() {
        float[] fArrCopyOf = Arrays.copyOf(this.positions, this.keys.size() + 2);
        AbstractC9133u.m16132f(fArrCopyOf, "copyOf(...)");
        this.positions = fArrCopyOf;
    }

    /* renamed from: at */
    public final void m831at(T t10, float f10) {
        this.keys.add(t10);
        if (this.positions.length < this.keys.size()) {
            expandPositions();
        }
        this.positions[this.keys.size() - 1] = f10;
    }

    public final List<T> buildKeys$foundation_release() {
        return this.keys;
    }

    public final float[] buildPositions$foundation_release() {
        return AbstractC8797p.m14657x(this.positions, 0, this.keys.size());
    }

    public final List<T> getKeys$foundation_release() {
        return this.keys;
    }

    public final float[] getPositions$foundation_release() {
        return this.positions;
    }

    public final void setPositions$foundation_release(float[] fArr) {
        this.positions = fArr;
    }
}
