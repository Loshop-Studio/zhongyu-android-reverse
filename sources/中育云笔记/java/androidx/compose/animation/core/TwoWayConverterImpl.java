package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
final class TwoWayConverterImpl<T, V extends AnimationVector> implements TwoWayConverter<T, V> {
    private final InterfaceC9540l convertFromVector;
    private final InterfaceC9540l convertToVector;

    public TwoWayConverterImpl(InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2) {
        this.convertToVector = interfaceC9540l;
        this.convertFromVector = interfaceC9540l2;
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    public InterfaceC9540l getConvertFromVector() {
        return this.convertFromVector;
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    public InterfaceC9540l getConvertToVector() {
        return this.convertToVector;
    }
}
