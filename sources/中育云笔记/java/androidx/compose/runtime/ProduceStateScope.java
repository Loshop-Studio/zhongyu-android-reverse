package androidx.compose.runtime;

import kotlin.coroutines.InterfaceC9945d;
import p181hd.InterfaceC9529a;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public interface ProduceStateScope<T> extends MutableState<T>, InterfaceC11122i0 {
    Object awaitDispose(InterfaceC9529a interfaceC9529a, InterfaceC11588c<?> interfaceC11588c);

    @Override // sd.InterfaceC11122i0
    /* synthetic */ InterfaceC9945d getCoroutineContext();
}
