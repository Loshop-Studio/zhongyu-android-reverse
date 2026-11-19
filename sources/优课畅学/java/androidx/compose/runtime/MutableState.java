package androidx.compose.runtime;

import p300x7.InterfaceC10570l;

@Stable
/* loaded from: classes2.dex */
public interface MutableState<T> extends State<T> {
    T component1();

    InterfaceC10570l component2();

    @Override // androidx.compose.runtime.State
    T getValue();

    void setValue(T t10);
}
