package androidx.compose.foundation.gestures;

import com.taobao.accs.data.Message;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.ScrollableKt", m26211f = "Scrollable.kt", m26212l = {Message.EXT_HEADER_VALUE_MAX_LEN}, m26213m = "semanticsScrollBy-d-4ec7I")
/* loaded from: classes.dex */
public final class ScrollableKt$semanticsScrollBy$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public ScrollableKt$semanticsScrollBy$1(InterfaceC11588c<? super ScrollableKt$semanticsScrollBy$1> interfaceC11588c) {
        super(interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ScrollableKt.m27228semanticsScrollByd4ec7I(null, 0L, this);
    }
}
