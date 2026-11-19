package androidx.compose.p013ui.platform;

import android.view.Choreographer;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1", m17801f = "AndroidUiDispatcher.android.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AndroidUiDispatcher$Companion$Main$2$dispatcher$1 extends SuspendLambda implements InterfaceC10574p {
    int label;

    public AndroidUiDispatcher$Companion$Main$2$dispatcher$1(InterfaceC9324c<? super AndroidUiDispatcher$Companion$Main$2$dispatcher$1> interfaceC9324c) {
        super(2, interfaceC9324c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        return new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super Choreographer> interfaceC9324c) {
        return ((AndroidUiDispatcher$Companion$Main$2$dispatcher$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC9434a.m17291f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        return Choreographer.getInstance();
    }
}
