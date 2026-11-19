package androidx.compose.p006ui.input.pointer.util;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.C3335ai;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0003H\u0086\u0002J\u0006\u0010\u000f\u001a\u00020\u0007J\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0007H\u0086\u0002J\u0011\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0000H\u0086\u0002R\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, m5175d2 = {"Landroidx/compose/ui/input/pointer/util/Vector;", "", "length", "", "(I)V", "elements", "", "", "getElements", "()[Ljava/lang/Float;", "[Ljava/lang/Float;", "getLength", "()I", "get", C3335ai.f1660aA, "norm", "set", "", "value", "times", C3335ai.f1705at, "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class Vector {
    private final Float[] elements;
    private final int length;

    public Vector(int i4) {
        this.length = i4;
        Float[] fArr = new Float[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            fArr[i5] = Float.valueOf(0.0f);
        }
        this.elements = fArr;
    }

    public final float get(int i4) {
        return this.elements[i4].floatValue();
    }

    public final Float[] getElements() {
        return this.elements;
    }

    public final int getLength() {
        return this.length;
    }

    public final float norm() {
        return (float) Math.sqrt(times(this));
    }

    public final void set(int i4, float value) {
        this.elements[i4] = Float.valueOf(value);
    }

    public final float times(Vector a4) {
        Intrinsics.checkNotNullParameter(a4, "a");
        int i4 = this.length;
        float f4 = 0.0f;
        for (int i5 = 0; i5 < i4; i5++) {
            f4 += get(i5) * a4.get(i5);
        }
        return f4;
    }
}
