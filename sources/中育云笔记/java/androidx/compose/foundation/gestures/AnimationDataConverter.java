package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.p014ui.geometry.Offset;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
final class AnimationDataConverter implements TwoWayConverter<AnimationData, AnimationVector4D> {
    public static final AnimationDataConverter INSTANCE = new AnimationDataConverter();

    private AnimationDataConverter() {
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    public InterfaceC9540l getConvertFromVector() {
        return new InterfaceC9540l() { // from class: androidx.compose.foundation.gestures.AnimationDataConverter$convertFromVector$1
            @Override // p181hd.InterfaceC9540l
            public final AnimationData invoke(AnimationVector4D animationVector4D) {
                float v12 = animationVector4D.getV1();
                float v22 = animationVector4D.getV2();
                float v32 = animationVector4D.getV3();
                return new AnimationData(v12, Offset.m30629constructorimpl((Float.floatToRawIntBits(v32) & 4294967295L) | (Float.floatToRawIntBits(v22) << 32)), animationVector4D.getV4(), null);
            }
        };
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    public InterfaceC9540l getConvertToVector() {
        return new InterfaceC9540l() { // from class: androidx.compose.foundation.gestures.AnimationDataConverter$convertToVector$1
            @Override // p181hd.InterfaceC9540l
            public final AnimationVector4D invoke(AnimationData animationData) {
                return new AnimationVector4D(animationData.getZoom(), Float.intBitsToFloat((int) (animationData.m27125getOffsetF1C5BW0() >> 32)), Float.intBitsToFloat((int) (animationData.m27125getOffsetF1C5BW0() & 4294967295L)), animationData.getDegrees());
            }
        };
    }
}
