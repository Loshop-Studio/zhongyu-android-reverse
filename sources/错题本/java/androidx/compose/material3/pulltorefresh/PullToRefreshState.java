package androidx.compose.material3.pulltorefresh;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;

@Stable
@ExperimentalMaterial3Api
@Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00068gX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, m5110d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "", "Ld6/s;", "animateToThreshold", "(Lh6/c;)Ljava/lang/Object;", "animateToHidden", "", "targetValue", "snapTo", "(FLh6/c;)Ljava/lang/Object;", "getDistanceFraction", "()F", "distanceFraction", "", "isAnimating", "()Z", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface PullToRefreshState {
    @Nullable
    Object animateToHidden(@NotNull InterfaceC5631c<? super C5443s> interfaceC5631c);

    @Nullable
    Object animateToThreshold(@NotNull InterfaceC5631c<? super C5443s> interfaceC5631c);

    @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE)
    float getDistanceFraction();

    default boolean isAnimating() {
        return false;
    }

    @Nullable
    Object snapTo(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE) float f, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c);
}
