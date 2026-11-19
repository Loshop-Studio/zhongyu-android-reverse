package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import java.util.Map;
import kotlin.collections.AbstractC9080a;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@Immutable
/* loaded from: classes.dex */
public abstract class ExitTransition {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final ExitTransition KeepUntilTransitionsFinished;
    private static final ExitTransition None;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
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
        AbstractC9126n abstractC9126n = null;
        Fade fade = null;
        Slide slide = null;
        ChangeSize changeSize = null;
        Scale scale = null;
        Map map = null;
        None = new ExitTransitionImpl(new TransitionData(fade, slide, changeSize, scale, false, map, 63, abstractC9126n));
        KeepUntilTransitionsFinished = new ExitTransitionImpl(new TransitionData(fade, slide, changeSize, scale, true, map, 47, abstractC9126n));
    }

    public /* synthetic */ ExitTransition(AbstractC9126n abstractC9126n) {
        this();
    }

    public boolean equals(Object obj) {
        return (obj instanceof ExitTransition) && AbstractC9133u.m16128b(((ExitTransition) obj).getData$animation_release(), getData$animation_release());
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
        return new ExitTransitionImpl(new TransitionData(fade, slide, changeSize, scale, exitTransition.getData$animation_release().getHold() || getData$animation_release().getHold(), AbstractC9080a.m15949n(getData$animation_release().getEffectsMap(), exitTransition.getData$animation_release().getEffectsMap())));
    }

    public String toString() {
        if (AbstractC9133u.m16128b(this, None)) {
            return "ExitTransition.None";
        }
        if (AbstractC9133u.m16128b(this, KeepUntilTransitionsFinished)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        TransitionData data$animation_release = getData$animation_release();
        StringBuilder sb = new StringBuilder();
        sb.append("ExitTransition: \nFade - ");
        Fade fade = data$animation_release.getFade();
        sb.append(fade != null ? fade.toString() : null);
        sb.append(",\nSlide - ");
        Slide slide = data$animation_release.getSlide();
        sb.append(slide != null ? slide.toString() : null);
        sb.append(",\nShrink - ");
        ChangeSize changeSize = data$animation_release.getChangeSize();
        sb.append(changeSize != null ? changeSize.toString() : null);
        sb.append(",\nScale - ");
        Scale scale = data$animation_release.getScale();
        sb.append(scale != null ? scale.toString() : null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(data$animation_release.getHold());
        return sb.toString();
    }

    private ExitTransition() {
    }
}
