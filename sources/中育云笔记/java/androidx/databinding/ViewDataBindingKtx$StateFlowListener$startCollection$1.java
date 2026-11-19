package androidx.databinding;

import androidx.databinding.ViewDataBindingKtx;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.alibaba.fastjson.asm.Opcodes;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1", m26211f = "ViewDataBindingKtx.kt", m26212l = {95}, m26213m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ViewDataBindingKtx$StateFlowListener$startCollection$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ InterfaceC11594c $flow;
    final /* synthetic */ LifecycleOwner $owner;
    int label;
    final /* synthetic */ ViewDataBindingKtx.StateFlowListener this$0;

    @InterfaceC11829d(m26210c = "androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1$1", m26211f = "ViewDataBindingKtx.kt", m26212l = {Opcodes.IADD}, m26213m = "invokeSuspend")
    /* renamed from: androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1$1 */
    public static final class C37281 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC11594c $flow;
        int label;
        final /* synthetic */ ViewDataBindingKtx.StateFlowListener this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37281(InterfaceC11594c interfaceC11594c, ViewDataBindingKtx.StateFlowListener stateFlowListener, InterfaceC11588c<? super C37281> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$flow = interfaceC11594c;
            this.this$0 = stateFlowListener;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C37281(this.$flow, this.this$0, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11594c interfaceC11594c = this.$flow;
                final ViewDataBindingKtx.StateFlowListener stateFlowListener = this.this$0;
                InterfaceC11595d interfaceC11595d = new InterfaceC11595d() { // from class: androidx.databinding.ViewDataBindingKtx.StateFlowListener.startCollection.1.1.1
                    @Override // p379vd.InterfaceC11595d
                    public final Object emit(Object obj2, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                        ViewDataBinding binder = stateFlowListener.listener.getBinder();
                        if (binder != null) {
                            binder.handleFieldChange(stateFlowListener.listener.mLocalFieldId, stateFlowListener.listener.getTarget(), 0);
                        }
                        return C10786q.f26013a;
                    }
                };
                this.label = 1;
                if (interfaceC11594c.collect(interfaceC11595d, this) == objM25952f) {
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
            return ((C37281) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewDataBindingKtx$StateFlowListener$startCollection$1(LifecycleOwner lifecycleOwner, InterfaceC11594c interfaceC11594c, ViewDataBindingKtx.StateFlowListener stateFlowListener, InterfaceC11588c<? super ViewDataBindingKtx$StateFlowListener$startCollection$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$owner = lifecycleOwner;
        this.$flow = interfaceC11594c;
        this.this$0 = stateFlowListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new ViewDataBindingKtx$StateFlowListener$startCollection$1(this.$owner, this.$flow, this.this$0, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            Lifecycle lifecycle = this.$owner.getLifecycle();
            Lifecycle.State state = Lifecycle.State.STARTED;
            C37281 c37281 = new C37281(this.$flow, this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, c37281, this) == objM25952f) {
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
        return ((ViewDataBindingKtx$StateFlowListener$startCollection$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
