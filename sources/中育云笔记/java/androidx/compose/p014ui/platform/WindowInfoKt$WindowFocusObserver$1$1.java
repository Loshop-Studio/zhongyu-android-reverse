package androidx.compose.p014ui.platform;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1", m26211f = "WindowInfo.kt", m26212l = {63}, m26213m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class WindowInfoKt$WindowFocusObserver$1$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ State<InterfaceC9540l> $callback;
    final /* synthetic */ WindowInfo $windowInfo;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WindowInfoKt$WindowFocusObserver$1$1(WindowInfo windowInfo, State<? extends InterfaceC9540l> state, InterfaceC11588c<? super WindowInfoKt$WindowFocusObserver$1$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$windowInfo = windowInfo;
        this.$callback = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new WindowInfoKt$WindowFocusObserver$1$1(this.$windowInfo, this.$callback, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            final WindowInfo windowInfo = this.$windowInfo;
            InterfaceC11594c interfaceC11594cSnapshotFlow = SnapshotStateKt.snapshotFlow(new InterfaceC9529a() { // from class: androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1.1
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public final Boolean invoke() {
                    return Boolean.valueOf(windowInfo.isWindowFocused());
                }
            });
            final State<InterfaceC9540l> state = this.$callback;
            InterfaceC11595d interfaceC11595d = new InterfaceC11595d() { // from class: androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1.2
                @Override // p379vd.InterfaceC11595d
                public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC11588c interfaceC11588c) {
                    return emit(((Boolean) obj2).booleanValue(), (InterfaceC11588c<? super C10786q>) interfaceC11588c);
                }

                public final Object emit(boolean z10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    state.getValue().invoke(AbstractC11826a.m26206a(z10));
                    return C10786q.f26013a;
                }
            };
            this.label = 1;
            if (interfaceC11594cSnapshotFlow.collect(interfaceC11595d, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((WindowInfoKt$WindowFocusObserver$1$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
