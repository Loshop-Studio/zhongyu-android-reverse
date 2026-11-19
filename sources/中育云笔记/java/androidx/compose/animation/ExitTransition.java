package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import java.util.Map;
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@Immutable
/* loaded from: classes.dex */
public abstract class ExitTransition {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final ExitTransition KeepUntilTransitionsFinished;
    private static final ExitTransition None;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final ExitTransition getKeepUntilTransitionsFinished$animation_release() {
            return ExitTransition.KeepUntilTransitionsFinished;
        }

        public final ExitTransition getNone() {
            return ExitTransition.None;
        }

        private Companion() {
        }
    }

    static {
        AbstractC9972n abstractC9972n = null;
        Fade fade = null;
        Slide slide = null;
        ChangeSize changeSize = null;
        Scale scale = null;
        Map map = null;
        None = new ExitTransitionImpl(new TransitionData(fade, slide, changeSize, scale, false, map, 63, abstractC9972n));
        KeepUntilTransitionsFinished = new ExitTransitionImpl(new TransitionData(fade, slide, changeSize, scale, true, map, 47, abstractC9972n));
    }

    public /* synthetic */ ExitTransition(AbstractC9972n abstractC9972n) {
        this();
    }

    public boolean equals(Object obj) {
        return (obj instanceof ExitTransition) && AbstractC9979u.m20289b(((ExitTransition) obj).getData$animation_release(), getData$animation_release());
    }

    public abstract TransitionData getData$animation_release();

    public int hashCode() {
        return getData$animation_release().hashCode();
    }

    @Stable
    public final ExitTransition plus(ExitTransition exitTransition) {
        Fade fade = exitTransition.getData$animation_release().getFade();
        if (fade == null) {
            fade = getData$animation_release().getFade();
        }
        Slide slide = exitTransition.getData$animation_release().getSlide();
        if (slide == null) {
            slide = getData$animation_release().getSlide();
        }
        ChangeSize changeSize = exitTransition.getData$animation_release().getChangeSize();
        if (changeSize == null) {
            changeSize = getData$animation_release().getChangeSize();
        }
        Scale scale = exitTransition.getData$animation_release().getScale();
        if (scale == null) {
            scale = getData$animation_release().getScale();
        }
        return new ExitTransitionImpl(new TransitionData(fade, slide, changeSize, scale, exitTransition.getData$animation_release().getHold() || getData$animation_release().getHold(), AbstractC9925a.m20094n(getData$animation_release().getEffectsMap(), exitTransition.getData$animation_release().getEffectsMap())));
    }

    public String toString() {
        if (AbstractC9979u.m20289b(this, None)) {
            return "ExitTransition.None";
        }
        if (AbstractC9979u.m20289b(this, KeepUntilTransitionsFinished)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        TransitionData data$animation_release = getData$animation_release();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ExitTransition: \nFade - ");
        Fade fade = data$animation_release.getFade();
        sb2.append(fade != null ? fade.toString() : null);
        sb2.append(",\nSlide - ");
        Slide slide = data$animation_release.getSlide();
        sb2.append(slide != null ? slide.toString() : null);
        sb2.append(",\nShrink - ");
        ChangeSize changeSize = data$animation_release.getChangeSize();
        sb2.append(changeSize != null ? changeSize.toString() : null);
        sb2.append(",\nScale - ");
        Scale scale = data$animation_release.getScale();
        sb2.append(scale != null ? scale.toString() : null);
        sb2.append(",\nKeepUntilTransitionsFinished - ");
        sb2.append(data$animation_release.getHold());
        return sb2.toString();
    }

    private ExitTransition() {
    }
}
