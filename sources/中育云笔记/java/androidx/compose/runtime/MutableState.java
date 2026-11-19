package androidx.compose.runtime;

import p181hd.InterfaceC9540l;

@Stable
/* loaded from: classes2.dex */
public interface MutableState<T> extends State<T> {
    T component1();

    InterfaceC9540l component2();

    @Override // androidx.compose.runtime.State
    T getValue();

    void setValue(T t10);
}
