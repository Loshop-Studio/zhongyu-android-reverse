package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p073h4.AbstractC5625a;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\t\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u001c\u0010\t\u001a\u00020\u0005*\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0086\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0011R\"\u0010\u0017\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m5110d2 = {"Landroidx/compose/foundation/gestures/DraggableAnchorsConfig;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", "Ld6/s;", "expandPositions", "", RequestParameters.POSITION, "at", "(Ljava/lang/Object;F)V", "", "buildPositions$foundation_release", "()[F", "buildPositions", "", "buildKeys$foundation_release", "()Ljava/util/List;", "buildKeys", "", "keys", "Ljava/util/List;", "getKeys$foundation_release", "positions", "[F", "getPositions$foundation_release", "setPositions$foundation_release", "([F)V", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class DraggableAnchorsConfig<T> {
    public static final int $stable = 8;

    @NotNull
    private final List<T> keys = new ArrayList();

    @NotNull
    private float[] positions;

    public DraggableAnchorsConfig() {
        float[] fArr = new float[5];
        for (int i = 0; i < 5; i++) {
            fArr[i] = Float.NaN;
        }
        this.positions = fArr;
    }

    private final void expandPositions() {
        float[] fArrCopyOf = Arrays.copyOf(this.positions, this.keys.size() + 2);
        AbstractC5830k.m5329f(fArrCopyOf, "copyOf(...)");
        this.positions = fArrCopyOf;
    }

    /* renamed from: at */
    public final void m940at(T t8, float f) {
        this.keys.add(t8);
        if (this.positions.length < this.keys.size()) {
            expandPositions();
        }
        this.positions[this.keys.size() - 1] = f;
    }

    @NotNull
    public final List<T> buildKeys$foundation_release() {
        return this.keys;
    }

    @NotNull
    public final float[] buildPositions$foundation_release() {
        float[] fArr = this.positions;
        int size = this.keys.size();
        AbstractC5830k.m5330g(fArr, "<this>");
        AbstractC5625a.m4947g(size, fArr.length);
        float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, 0, size);
        AbstractC5830k.m5329f(fArrCopyOfRange, "copyOfRange(...)");
        return fArrCopyOfRange;
    }

    @NotNull
    public final List<T> getKeys$foundation_release() {
        return this.keys;
    }

    @NotNull
    /* renamed from: getPositions$foundation_release, reason: from getter */
    public final float[] getPositions() {
        return this.positions;
    }

    public final void setPositions$foundation_release(@NotNull float[] fArr) {
        this.positions = fArr;
    }
}
