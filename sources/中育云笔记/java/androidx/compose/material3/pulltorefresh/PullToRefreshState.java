package androidx.compose.material3.pulltorefresh;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.runtime.Stable;
import p309qc.C10786q;
import vc.InterfaceC11588c;

@Stable
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public interface PullToRefreshState {
    Object animateToHidden(InterfaceC11588c<? super C10786q> interfaceC11588c);

    Object animateToThreshold(InterfaceC11588c<? super C10786q> interfaceC11588c);

    @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE)
    float getDistanceFraction();

    default boolean isAnimating() {
        return false;
    }

    Object snapTo(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE) float f10, InterfaceC11588c<? super C10786q> interfaceC11588c);
}
