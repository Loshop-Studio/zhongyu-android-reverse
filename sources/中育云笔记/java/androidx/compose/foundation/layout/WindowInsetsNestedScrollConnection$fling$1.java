package androidx.compose.foundation.layout;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection", m26211f = "WindowInsetsConnection.android.kt", m26212l = {301, 327, 352}, m26213m = "fling-huYlsQE")
/* loaded from: classes.dex */
public final class WindowInsetsNestedScrollConnection$fling$1 extends ContinuationImpl {
    float F$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsNestedScrollConnection$fling$1(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, InterfaceC11588c<? super WindowInsetsNestedScrollConnection$fling$1> interfaceC11588c) {
        super(interfaceC11588c);
        this.this$0 = windowInsetsNestedScrollConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m27533flinghuYlsQE(0L, 0.0f, false, this);
    }
}
