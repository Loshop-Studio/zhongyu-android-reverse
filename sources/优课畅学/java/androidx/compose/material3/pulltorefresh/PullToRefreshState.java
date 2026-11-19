package androidx.compose.material3.pulltorefresh;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.runtime.Stable;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;

@Stable
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public interface PullToRefreshState {
    Object animateToHidden(InterfaceC9324c<? super C8736p> interfaceC9324c);

    Object animateToThreshold(InterfaceC9324c<? super C8736p> interfaceC9324c);

    @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE)
    float getDistanceFraction();

    default boolean isAnimating() {
        return false;
    }

    Object snapTo(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE) float f10, InterfaceC9324c<? super C8736p> interfaceC9324c);
}
