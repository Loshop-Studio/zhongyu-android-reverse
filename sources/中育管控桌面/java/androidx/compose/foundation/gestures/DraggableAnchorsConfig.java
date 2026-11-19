package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0000¢\u0006\u0002\b\u0010J\r\u0010\u0011\u001a\u00020\tH\u0000¢\u0006\u0002\b\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u001a\u0010\u0015\u001a\u00020\u0014*\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0017H\u0086\u0004¢\u0006\u0002\u0010\u0018R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0019"}, m7880d2 = {"Landroidx/compose/foundation/gestures/DraggableAnchorsConfig;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "keys", "", "getKeys$foundation_release", "()Ljava/util/List;", "positions", "", "getPositions$foundation_release", "()[F", "setPositions$foundation_release", "([F)V", "buildKeys", "", "buildKeys$foundation_release", "buildPositions", "buildPositions$foundation_release", "expandPositions", "", "at", RequestParameters.POSITION, "", "(Ljava/lang/Object;F)V", "foundation_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes.dex */
public final class DraggableAnchorsConfig<T> {
    public static final int $stable = 8;
    private final List<T> keys = new ArrayList();
    private float[] positions;

    public DraggableAnchorsConfig() {
        float[] fArr = new float[5];
        for (int i6 = 0; i6 < 5; i6++) {
            fArr[i6] = Float.NaN;
        }
        this.positions = fArr;
    }

    private final void expandPositions() {
        float[] fArrCopyOf = Arrays.copyOf(this.positions, this.keys.size() + 2);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        this.positions = fArrCopyOf;
    }

    /* renamed from: at */
    public final void m120at(T t6, float f6) {
        this.keys.add(t6);
        if (this.positions.length < this.keys.size()) {
            expandPositions();
        }
        this.positions[this.keys.size() - 1] = f6;
    }

    public final List<T> buildKeys$foundation_release() {
        return this.keys;
    }

    public final float[] buildPositions$foundation_release() {
        return ArraysKt.copyOfRange(this.positions, 0, this.keys.size());
    }

    public final List<T> getKeys$foundation_release() {
        return this.keys;
    }

    /* renamed from: getPositions$foundation_release, reason: from getter */
    public final float[] getPositions() {
        return this.positions;
    }

    public final void setPositions$foundation_release(float[] fArr) {
        this.positions = fArr;
    }
}
