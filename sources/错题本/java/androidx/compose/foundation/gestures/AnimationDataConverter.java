package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.p011ui.geometry.Offset;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\f"}, m5110d2 = {"Landroidx/compose/foundation/gestures/AnimationDataConverter;", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/foundation/gestures/AnimationData;", "Landroidx/compose/animation/core/AnimationVector4D;", "<init>", "()V", "Lkotlin/Function1;", "getConvertToVector", "()Lr6/c;", "convertToVector", "getConvertFromVector", "convertFromVector", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class AnimationDataConverter implements TwoWayConverter<AnimationData, AnimationVector4D> {

    @NotNull
    public static final AnimationDataConverter INSTANCE = new AnimationDataConverter();

    private AnimationDataConverter() {
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    @NotNull
    public InterfaceC6471c getConvertFromVector() {
        return new InterfaceC6471c() { // from class: androidx.compose.foundation.gestures.AnimationDataConverter$convertFromVector$1
            @Override // p152r6.InterfaceC6471c
            public final AnimationData invoke(AnimationVector4D animationVector4D) {
                float v12 = animationVector4D.getV1();
                float v2 = animationVector4D.getV2();
                float v32 = animationVector4D.getV3();
                return new AnimationData(v12, Offset.m10433constructorimpl((Float.floatToRawIntBits(v32) & 4294967295L) | (Float.floatToRawIntBits(v2) << 32)), animationVector4D.getV4(), null);
            }
        };
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    @NotNull
    public InterfaceC6471c getConvertToVector() {
        return new InterfaceC6471c() { // from class: androidx.compose.foundation.gestures.AnimationDataConverter$convertToVector$1
            @Override // p152r6.InterfaceC6471c
            public final AnimationVector4D invoke(AnimationData animationData) {
                return new AnimationVector4D(animationData.getZoom(), Float.intBitsToFloat((int) (animationData.m6929getOffsetF1C5BW0() >> 32)), Float.intBitsToFloat((int) (animationData.m6929getOffsetF1C5BW0() & 4294967295L)), animationData.getDegrees());
            }
        };
    }
}
