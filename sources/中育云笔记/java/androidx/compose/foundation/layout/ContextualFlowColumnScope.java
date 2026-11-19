package androidx.compose.foundation.layout;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.p014ui.Modifier;
import androidx.compose.runtime.Stable;
import com.google.android.material.color.utilities.Contrast;
import p309qc.InterfaceC10770a;

@LayoutScopeMarker
@ExperimentalLayoutApi
@Stable
@InterfaceC10770a
/* loaded from: classes.dex */
public interface ContextualFlowColumnScope extends ColumnScope {
    static /* synthetic */ Modifier fillMaxColumnWidth$default(ContextualFlowColumnScope contextualFlowColumnScope, Modifier modifier, float f10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillMaxColumnWidth");
        }
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return contextualFlowColumnScope.fillMaxColumnWidth(modifier, f10);
    }

    @ExperimentalLayoutApi
    Modifier fillMaxColumnWidth(Modifier modifier, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10);

    int getIndexInLine();

    int getLineIndex();

    /* renamed from: getMaxHeightInLine-D9Ej5fM, reason: not valid java name */
    float mo27373getMaxHeightInLineD9Ej5fM();

    /* renamed from: getMaxWidth-D9Ej5fM, reason: not valid java name */
    float mo27374getMaxWidthD9Ej5fM();
}
