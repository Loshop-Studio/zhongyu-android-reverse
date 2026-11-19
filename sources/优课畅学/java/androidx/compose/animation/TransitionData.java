package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import java.util.Map;
import kotlin.collections.AbstractC9080a;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@Immutable
/* loaded from: classes.dex */
public final class TransitionData {
    public static final int $stable = 0;
    private final ChangeSize changeSize;
    private final Map<TransitionEffectKey<?>, TransitionEffect> effectsMap;
    private final Fade fade;
    private final boolean hold;
    private final Scale scale;
    private final Slide slide;

    public TransitionData() {
        this(null, null, null, null, false, null, 63, null);
    }

    public static /* synthetic */ TransitionData copy$default(TransitionData transitionData, Fade fade, Slide slide, ChangeSize changeSize, Scale scale, boolean z10, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fade = transitionData.fade;
        }
        if ((i10 & 2) != 0) {
            slide = transitionData.slide;
        }
        if ((i10 & 4) != 0) {
            changeSize = transitionData.changeSize;
        }
        if ((i10 & 8) != 0) {
            scale = transitionData.scale;
        }
        if ((i10 & 16) != 0) {
            z10 = transitionData.hold;
        }
        if ((i10 & 32) != 0) {
            map = transitionData.effectsMap;
        }
        boolean z11 = z10;
        Map map2 = map;
        return transitionData.copy(fade, slide, changeSize, scale, z11, map2);
    }

    public final Fade component1() {
        return this.fade;
    }

    public final Slide component2() {
        return this.slide;
    }

    public final ChangeSize component3() {
        return this.changeSize;
    }

    public final Scale component4() {
        return this.scale;
    }

    public final boolean component5() {
        return this.hold;
    }

    public final Map<TransitionEffectKey<?>, TransitionEffect> component6() {
        return this.effectsMap;
    }

    public final TransitionData copy(Fade fade, Slide slide, ChangeSize changeSize, Scale scale, boolean z10, Map<TransitionEffectKey<?>, ? extends TransitionEffect> map) {
        return new TransitionData(fade, slide, changeSize, scale, z10, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransitionData)) {
            return false;
        }
        TransitionData transitionData = (TransitionData) obj;
        return AbstractC9133u.m16128b(this.fade, transitionData.fade) && AbstractC9133u.m16128b(this.slide, transitionData.slide) && AbstractC9133u.m16128b(this.changeSize, transitionData.changeSize) && AbstractC9133u.m16128b(this.scale, transitionData.scale) && this.hold == transitionData.hold && AbstractC9133u.m16128b(this.effectsMap, transitionData.effectsMap);
    }

    public final ChangeSize getChangeSize() {
        return this.changeSize;
    }

    public final Map<TransitionEffectKey<?>, TransitionEffect> getEffectsMap() {
        return this.effectsMap;
    }

    public final Fade getFade() {
        return this.fade;
    }

    public final boolean getHold() {
        return this.hold;
    }

    public final Scale getScale() {
        return this.scale;
    }

    public final Slide getSlide() {
        return this.slide;
    }

    public int hashCode() {
        Fade fade = this.fade;
        int iHashCode = (fade == null ? 0 : fade.hashCode()) * 31;
        Slide slide = this.slide;
        int iHashCode2 = (iHashCode + (slide == null ? 0 : slide.hashCode())) * 31;
        ChangeSize changeSize = this.changeSize;
        int iHashCode3 = (iHashCode2 + (changeSize == null ? 0 : changeSize.hashCode())) * 31;
        Scale scale = this.scale;
        return ((((iHashCode3 + (scale != null ? scale.hashCode() : 0)) * 31) + Boolean.hashCode(this.hold)) * 31) + this.effectsMap.hashCode();
    }

    public String toString() {
        return "TransitionData(fade=" + this.fade + ", slide=" + this.slide + ", changeSize=" + this.changeSize + ", scale=" + this.scale + ", hold=" + this.hold + ", effectsMap=" + this.effectsMap + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransitionData(Fade fade, Slide slide, ChangeSize changeSize, Scale scale, boolean z10, Map<TransitionEffectKey<?>, ? extends TransitionEffect> map) {
        this.fade = fade;
        this.slide = slide;
        this.changeSize = changeSize;
        this.scale = scale;
        this.hold = z10;
        this.effectsMap = map;
    }

    public /* synthetic */ TransitionData(Fade fade, Slide slide, ChangeSize changeSize, Scale scale, boolean z10, Map map, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? null : fade, (i10 & 2) != 0 ? null : slide, (i10 & 4) != 0 ? null : changeSize, (i10 & 8) != 0 ? null : scale, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? AbstractC9080a.m15943h() : map);
    }
}
