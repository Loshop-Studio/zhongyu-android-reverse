package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.collections.AbstractC9080a;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@Immutable
/* loaded from: classes.dex */
public abstract class EnterTransition {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final EnterTransition None = new EnterTransitionImpl(new TransitionData(null, null, null, null, false, null, 63, null));

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final EnterTransition getNone() {
            return EnterTransition.None;
        }

        private Companion() {
        }
    }

    public /* synthetic */ EnterTransition(AbstractC9126n abstractC9126n) {
        this();
    }

    public boolean equals(Object obj) {
        return (obj instanceof EnterTransition) && AbstractC9133u.m16128b(((EnterTransition) obj).getData$animation_release(), getData$animation_release());
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
        return new EnterTransitionImpl(new TransitionData(fade, slide, changeSize, scale, false, AbstractC9080a.m15949n(getData$animation_release().getEffectsMap(), enterTransition.getData$animation_release().getEffectsMap()), 16, null));
    }

    public String toString() {
        if (AbstractC9133u.m16128b(this, None)) {
            return "EnterTransition.None";
        }
        TransitionData data$animation_release = getData$animation_release();
        StringBuilder sb = new StringBuilder();
        sb.append("EnterTransition: \nFade - ");
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
        return sb.toString();
    }

    private EnterTransition() {
    }
}
