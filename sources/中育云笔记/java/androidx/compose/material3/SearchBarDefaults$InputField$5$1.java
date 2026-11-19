package androidx.compose.material3;

import androidx.compose.p014ui.focus.FocusManager;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.material3.SearchBarDefaults$InputField$5$1", m26211f = "SearchBar.android.kt", m26212l = {571}, m26213m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SearchBarDefaults$InputField$5$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ FocusManager $focusManager;
    final /* synthetic */ boolean $shouldClearFocus;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarDefaults$InputField$5$1(boolean z10, FocusManager focusManager, InterfaceC11588c<? super SearchBarDefaults$InputField$5$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$shouldClearFocus = z10;
        this.$focusManager = focusManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new SearchBarDefaults$InputField$5$1(this.$shouldClearFocus, this.$focusManager, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            if (this.$shouldClearFocus) {
                this.label = 1;
                if (DelayKt.m20376b(100L, this) == objM25952f) {
                    return objM25952f;
                }
            }
            return C10786q.f26013a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        FocusManager.clearFocus$default(this.$focusManager, false, 1, null);
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((SearchBarDefaults$InputField$5$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
