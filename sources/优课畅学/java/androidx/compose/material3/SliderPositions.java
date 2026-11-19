package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8322g;
import p077d8.InterfaceC8317b;
import p123h7.InterfaceC8721a;

@Stable
@InterfaceC8721a
/* loaded from: classes2.dex */
public final class SliderPositions {
    public static final int $stable = 0;
    private final MutableState activeRange$delegate;
    private final MutableState tickFractions$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public SliderPositions() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SliderPositions)) {
            return false;
        }
        SliderPositions sliderPositions = (SliderPositions) obj;
        return AbstractC9133u.m16128b(getActiveRange(), sliderPositions.getActiveRange()) && Arrays.equals(getTickFractions(), sliderPositions.getTickFractions());
    }

    public final InterfaceC8317b getActiveRange() {
        return (InterfaceC8317b) this.activeRange$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float[] getTickFractions() {
        return (float[]) this.tickFractions$delegate.getValue();
    }

    public int hashCode() {
        return (getActiveRange().hashCode() * 31) + Arrays.hashCode(getTickFractions());
    }

    public final void setActiveRange$material3_release(InterfaceC8317b interfaceC8317b) {
        this.activeRange$delegate.setValue(interfaceC8317b);
    }

    public final void setTickFractions$material3_release(float[] fArr) {
        this.tickFractions$delegate.setValue(fArr);
    }

    public SliderPositions(InterfaceC8317b interfaceC8317b, float[] fArr) {
        this.activeRange$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(interfaceC8317b, null, 2, null);
        this.tickFractions$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fArr, null, 2, null);
    }

    public /* synthetic */ SliderPositions(InterfaceC8317b interfaceC8317b, float[] fArr, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? AbstractC8322g.m13507b(0.0f, 1.0f) : interfaceC8317b, (i10 & 2) != 0 ? new float[0] : fArr);
    }
}
