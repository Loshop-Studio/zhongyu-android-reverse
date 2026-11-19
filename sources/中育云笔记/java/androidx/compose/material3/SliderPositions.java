package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.AbstractC10409n;
import p265nd.InterfaceC10401f;
import p309qc.InterfaceC10770a;

@Stable
@InterfaceC10770a
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
        return AbstractC9979u.m20289b(getActiveRange(), sliderPositions.getActiveRange()) && Arrays.equals(getTickFractions(), sliderPositions.getTickFractions());
    }

    public final InterfaceC10401f getActiveRange() {
        return (InterfaceC10401f) this.activeRange$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float[] getTickFractions() {
        return (float[]) this.tickFractions$delegate.getValue();
    }

    public int hashCode() {
        return (getActiveRange().hashCode() * 31) + Arrays.hashCode(getTickFractions());
    }

    public final void setActiveRange$material3_release(InterfaceC10401f interfaceC10401f) {
        this.activeRange$delegate.setValue(interfaceC10401f);
    }

    public final void setTickFractions$material3_release(float[] fArr) {
        this.tickFractions$delegate.setValue(fArr);
    }

    public SliderPositions(InterfaceC10401f interfaceC10401f, float[] fArr) {
        this.activeRange$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(interfaceC10401f, null, 2, null);
        this.tickFractions$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fArr, null, 2, null);
    }

    public /* synthetic */ SliderPositions(InterfaceC10401f interfaceC10401f, float[] fArr, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? AbstractC10409n.m21749b(0.0f, 1.0f) : interfaceC10401f, (i10 & 2) != 0 ? new float[0] : fArr);
    }
}
