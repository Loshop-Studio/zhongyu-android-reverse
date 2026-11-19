package androidx.work.impl.constraints.controllers;

import androidx.work.Constraints;
import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.channels.ProduceKt;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p365ud.InterfaceC11395j;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public abstract class BaseConstraintController<T> implements ConstraintController {
    private final ConstraintTracker<T> tracker;

    @InterfaceC11829d(m26210c = "androidx.work.impl.constraints.controllers.BaseConstraintController$track$1", m26211f = "ContraintControllers.kt", m26212l = {63}, m26213m = "invokeSuspend")
    /* renamed from: androidx.work.impl.constraints.controllers.BaseConstraintController$track$1 */
    public static final class C48131 extends SuspendLambda implements InterfaceC9544p {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaseConstraintController<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48131(BaseConstraintController<T> baseConstraintController, InterfaceC11588c<? super C48131> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.this$0 = baseConstraintController;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C48131 c48131 = new C48131(this.this$0, interfaceC11588c);
            c48131.L$0 = obj;
            return c48131;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                final InterfaceC11395j interfaceC11395j = (InterfaceC11395j) this.L$0;
                final BaseConstraintController<T> baseConstraintController = this.this$0;
                final ConstraintListener<T> constraintListener = new ConstraintListener<T>() { // from class: androidx.work.impl.constraints.controllers.BaseConstraintController$track$1$listener$1
                    @Override // androidx.work.impl.constraints.ConstraintListener
                    public void onConstraintChanged(T t10) {
                        interfaceC11395j.getChannel().mo33808trySendJP2dKIU(baseConstraintController.isConstrained(t10) ? new ConstraintsState.ConstraintsNotMet(baseConstraintController.getReason()) : ConstraintsState.ConstraintsMet.INSTANCE);
                    }
                };
                ((BaseConstraintController) this.this$0).tracker.addListener(constraintListener);
                final BaseConstraintController<T> baseConstraintController2 = this.this$0;
                InterfaceC9529a interfaceC9529a = new InterfaceC9529a() { // from class: androidx.work.impl.constraints.controllers.BaseConstraintController.track.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m33967invoke();
                        return C10786q.f26013a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m33967invoke() {
                        ((BaseConstraintController) baseConstraintController2).tracker.removeListener(constraintListener);
                    }
                };
                this.label = 1;
                if (ProduceKt.m20713a(interfaceC11395j, interfaceC9529a, this) == objM25952f) {
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
        public final Object invoke(InterfaceC11395j interfaceC11395j, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C48131) create(interfaceC11395j, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public BaseConstraintController(ConstraintTracker<T> tracker) {
        AbstractC9979u.m20294g(tracker, "tracker");
        this.tracker = tracker;
    }

    public static /* synthetic */ void getReason$annotations() {
    }

    public abstract int getReason();

    public boolean isConstrained(T t10) {
        return false;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean isCurrentlyConstrained(WorkSpec workSpec) {
        AbstractC9979u.m20294g(workSpec, "workSpec");
        return hasConstraint(workSpec) && isConstrained(this.tracker.readSystemState());
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public InterfaceC11594c track(Constraints constraints) {
        AbstractC9979u.m20294g(constraints, "constraints");
        return AbstractC11596e.m25555e(new C48131(this, null));
    }
}
