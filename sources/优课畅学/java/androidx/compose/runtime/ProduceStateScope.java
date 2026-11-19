package androidx.compose.runtime;

import kotlin.coroutines.InterfaceC9100d;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10559a;

/* loaded from: classes2.dex */
public interface ProduceStateScope<T> extends MutableState<T>, InterfaceC8822b0 {
    Object awaitDispose(InterfaceC10559a interfaceC10559a, InterfaceC9324c<?> interfaceC9324c);

    @Override // p135i8.InterfaceC8822b0
    /* synthetic */ InterfaceC9100d getCoroutineContext();
}
