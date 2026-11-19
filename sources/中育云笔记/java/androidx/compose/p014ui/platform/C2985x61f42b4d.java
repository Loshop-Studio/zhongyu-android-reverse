package androidx.compose.p014ui.platform;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1", m26211f = "PlatformTextInputModifierNode.kt", m26212l = {230}, m26213m = "startInputMethod")
/* renamed from: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1 */
/* loaded from: classes2.dex */
public final class C2985x61f42b4d extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2985x61f42b4d(ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1 chainedPlatformTextInputInterceptor$textInputSession$2$scope$1, InterfaceC11588c<? super C2985x61f42b4d> interfaceC11588c) {
        super(interfaceC11588c);
        this.this$0 = chainedPlatformTextInputInterceptor$textInputSession$2$scope$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.startInputMethod(null, this);
    }
}
