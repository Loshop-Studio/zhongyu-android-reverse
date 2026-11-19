package androidx.work.impl.constraints.controllers;

import androidx.work.Constraints;
import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.channels.ProduceKt;
import p123h7.C8736p;
import p157k8.InterfaceC9071g;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public abstract class BaseConstraintController<T> implements ConstraintController {
    private final ConstraintTracker<T> tracker;

    @InterfaceC9539d(m17800c = "androidx.work.impl.constraints.controllers.BaseConstraintController$track$1", m17801f = "ContraintControllers.kt", m17802l = {63}, m17803m = "invokeSuspend")
    /* renamed from: androidx.work.impl.constraints.controllers.BaseConstraintController$track$1 */
    public static final class C48651 extends SuspendLambda implements InterfaceC10574p {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaseConstraintController<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48651(BaseConstraintController<T> baseConstraintController, InterfaceC9324c<? super C48651> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.this$0 = baseConstraintController;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C48651 c48651 = new C48651(this.this$0, interfaceC9324c);
            c48651.L$0 = obj;
            return c48651;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                final InterfaceC9071g interfaceC9071g = (InterfaceC9071g) this.L$0;
                final BaseConstraintController<T> baseConstraintController = this.this$0;
                final ConstraintListener<T> constraintListener = new ConstraintListener<T>() { // from class: androidx.work.impl.constraints.controllers.BaseConstraintController$track$1$listener$1
                    @Override // androidx.work.impl.constraints.ConstraintListener
                    public void onConstraintChanged(T t10) {
                        interfaceC9071g.getChannel().mo27213trySendJP2dKIU(baseConstraintController.isConstrained(t10) ? new ConstraintsState.ConstraintsNotMet(baseConstraintController.getReason()) : ConstraintsState.ConstraintsMet.INSTANCE);
                    }
                };
                ((BaseConstraintController) this.this$0).tracker.addListener(constraintListener);
                final BaseConstraintController<T> baseConstraintController2 = this.this$0;
                InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: androidx.work.impl.constraints.controllers.BaseConstraintController.track.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p300x7.InterfaceC10559a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m27372invoke();
                        return C8736p.f16368a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m27372invoke() {
                        ((BaseConstraintController) baseConstraintController2).tracker.removeListener(constraintListener);
                    }
                };
                this.label = 1;
                if (ProduceKt.m16521a(interfaceC9071g, interfaceC10559a, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC9071g interfaceC9071g, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C48651) create(interfaceC9071g, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    public BaseConstraintController(ConstraintTracker<T> tracker) {
        AbstractC9133u.m16133g(tracker, "tracker");
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
        AbstractC9133u.m16133g(workSpec, "workSpec");
        return hasConstraint(workSpec) && isConstrained(this.tracker.readSystemState());
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public InterfaceC9266c track(Constraints constraints) {
        AbstractC9133u.m16133g(constraints, "constraints");
        return AbstractC9268e.m17015e(new C48651(this, null));
    }
}
