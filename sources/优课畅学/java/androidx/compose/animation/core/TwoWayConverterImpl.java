package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
final class TwoWayConverterImpl<T, V extends AnimationVector> implements TwoWayConverter<T, V> {
    private final InterfaceC10570l convertFromVector;
    private final InterfaceC10570l convertToVector;

    public TwoWayConverterImpl(InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2) {
        this.convertToVector = interfaceC10570l;
        this.convertFromVector = interfaceC10570l2;
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    public InterfaceC10570l getConvertFromVector() {
        return this.convertFromVector;
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    public InterfaceC10570l getConvertToVector() {
        return this.convertToVector;
    }
}
