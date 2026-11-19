package androidx.compose.foundation.layout;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.p014ui.Modifier;
import androidx.compose.runtime.Stable;
import com.google.android.material.color.utilities.Contrast;

@LayoutScopeMarker
@Stable
/* loaded from: classes.dex */
public interface FlowColumnScope extends ColumnScope {
    static /* synthetic */ Modifier fillMaxColumnWidth$default(FlowColumnScope flowColumnScope, Modifier modifier, float f10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillMaxColumnWidth");
        }
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return flowColumnScope.fillMaxColumnWidth(modifier, f10);
    }

    @ExperimentalLayoutApi
    Modifier fillMaxColumnWidth(Modifier modifier, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10);
}
