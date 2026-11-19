package kotlinx.coroutines.flow;

import androidx.compose.runtime.ComposerKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", m26211f = "Delay.kt", m26212l = {ComposerKt.providerMapsKey}, m26213m = "emit")
/* loaded from: classes6.dex */
public final class FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 extends ContinuationImpl {

    /* renamed from: c */
    public /* synthetic */ Object f23645c;

    /* renamed from: d */
    public final /* synthetic */ FlowKt__DelayKt$debounceInternal$1$values$1.C100131 f23646d;

    /* renamed from: e */
    public int f23647e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1(FlowKt__DelayKt$debounceInternal$1$values$1.C100131 c100131, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f23646d = c100131;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23645c = obj;
        this.f23647e |= Integer.MIN_VALUE;
        return this.f23646d.emit(null, this);
    }
}
