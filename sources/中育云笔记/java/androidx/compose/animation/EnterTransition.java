package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@Immutable
/* loaded from: classes.dex */
public abstract class EnterTransition {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final EnterTransition None = new EnterTransitionImpl(new TransitionData(null, null, null, null, false, null, 63, null));

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final EnterTransition getNone() {
            return EnterTransition.None;
        }

        private Companion() {
        }
    }

    public /* synthetic */ EnterTransition(AbstractC9972n abstractC9972n) {
        this();
    }

    public boolean equals(Object obj) {
        return (obj instanceof EnterTransition) && AbstractC9979u.m20289b(((EnterTransition) obj).getData$animation_release(), getData$animation_release());
    }

    public abstract TransitionData getData$animation_release();

    public int hashCode() {
        return getData$animation_release().hashCode();
    }

    @Stable
    public final EnterTransition plus(EnterTransition enterTransition) {
        Fade fade = enterTransition.getData$animation_release().getFade();
        if (fade == null) {
            fade = getData$animation_release().getFade();
        }
        Slide slide = enterTransition.getData$animation_release().getSlide();
        if (slide == null) {
            slide = getData$animation_release().getSlide();
        }
        ChangeSize changeSize = enterTransition.getData$animation_release().getChangeSize();
        if (changeSize == null) {
            changeSize = getData$animation_release().getChangeSize();
        }
        Scale scale = enterTransition.getData$animation_release().getScale();
        if (scale == null) {
            scale = getData$animation_release().getScale();
        }
        return new EnterTransitionImpl(new TransitionData(fade, slide, changeSize, scale, false, AbstractC9925a.m20094n(getData$animation_release().getEffectsMap(), enterTransition.getData$animation_release().getEffectsMap()), 16, null));
    }

    public String toString() {
        if (AbstractC9979u.m20289b(this, None)) {
            return "EnterTransition.None";
        }
        TransitionData data$animation_release = getData$animation_release();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("EnterTransition: \nFade - ");
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
        return sb2.toString();
    }

    private EnterTransition() {
    }
}
