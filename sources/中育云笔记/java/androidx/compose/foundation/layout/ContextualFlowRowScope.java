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
public interface ContextualFlowRowScope extends RowScope {
    static /* synthetic */ Modifier fillMaxRowHeight$default(ContextualFlowRowScope contextualFlowRowScope, Modifier modifier, float f10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillMaxRowHeight");
        }
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return contextualFlowRowScope.fillMaxRowHeight(modifier, f10);
    }

    @ExperimentalLayoutApi
    Modifier fillMaxRowHeight(Modifier modifier, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10);

    int getIndexInLine();

    int getLineIndex();

    /* renamed from: getMaxHeight-D9Ej5fM, reason: not valid java name */
    float mo27376getMaxHeightD9Ej5fM();

    /* renamed from: getMaxWidthInLine-D9Ej5fM, reason: not valid java name */
    float mo27377getMaxWidthInLineD9Ej5fM();
}
