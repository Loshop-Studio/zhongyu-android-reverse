package androidx.compose.p014ui.platform;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", m26211f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", m26212l = {1916, 1951}, m26213m = "boundsUpdatesEventLoop$ui_release")
/* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 */
/* loaded from: classes2.dex */
public final class C2958x3d3eeeed extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2958x3d3eeeed(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, InterfaceC11588c<? super C2958x3d3eeeed> interfaceC11588c) {
        super(interfaceC11588c);
        this.this$0 = androidComposeViewAccessibilityDelegateCompat;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.boundsUpdatesEventLoop$ui_release(this);
    }
}
