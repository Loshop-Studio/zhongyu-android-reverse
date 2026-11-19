package androidx.compose.p014ui.contentcapture;

import com.alibaba.fastjson.asm.Opcodes;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.ui.contentcapture.AndroidContentCaptureManager", m26211f = "AndroidContentCaptureManager.android.kt", m26212l = {Opcodes.RETURN, 186}, m26213m = "boundsUpdatesEventLoop$ui_release")
/* loaded from: classes2.dex */
public final class AndroidContentCaptureManager$boundsUpdatesEventLoop$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidContentCaptureManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidContentCaptureManager$boundsUpdatesEventLoop$1(AndroidContentCaptureManager androidContentCaptureManager, InterfaceC11588c<? super AndroidContentCaptureManager$boundsUpdatesEventLoop$1> interfaceC11588c) {
        super(interfaceC11588c);
        this.this$0 = androidContentCaptureManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.boundsUpdatesEventLoop$ui_release(this);
    }
}
