package androidx.work.impl.constraints;

import android.os.Build;
import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.controllers.BatteryChargingController;
import androidx.work.impl.constraints.controllers.BatteryNotLowController;
import androidx.work.impl.constraints.controllers.ConstraintController;
import androidx.work.impl.constraints.controllers.NetworkConnectedController;
import androidx.work.impl.constraints.controllers.NetworkMeteredController;
import androidx.work.impl.constraints.controllers.NetworkNotRoamingController;
import androidx.work.impl.constraints.controllers.NetworkUnmeteredController;
import androidx.work.impl.constraints.controllers.StorageNotLowController;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.flow.internal.CombineKt;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;
import p325rc.AbstractC10980x;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class WorkConstraintsTracker {
    private final List<ConstraintController> controllers;

    /* JADX WARN: Multi-variable type inference failed */
    public WorkConstraintsTracker(List<? extends ConstraintController> controllers) {
        AbstractC9979u.m20294g(controllers, "controllers");
        this.controllers = controllers;
    }

    public final boolean areAllConstraintsMet(WorkSpec workSpec) {
        AbstractC9979u.m20294g(workSpec, "workSpec");
        List<ConstraintController> list = this.controllers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ConstraintController) obj).isCurrentlyConstrained(workSpec)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            Logger.get().debug(WorkConstraintsTrackerKt.TAG, "Work " + workSpec.f2164id + " constrained by " + AbstractC10947g0.m23954w0(arrayList, null, null, null, 0, null, new InterfaceC9540l() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker.areAllConstraintsMet.1
                @Override // p181hd.InterfaceC9540l
                public final CharSequence invoke(ConstraintController it) {
                    AbstractC9979u.m20294g(it, "it");
                    String simpleName = it.getClass().getSimpleName();
                    AbstractC9979u.m20293f(simpleName, "it.javaClass.simpleName");
                    return simpleName;
                }
            }, 31, null));
        }
        return arrayList.isEmpty();
    }

    public final InterfaceC11594c track(WorkSpec spec) {
        AbstractC9979u.m20294g(spec, "spec");
        List<ConstraintController> list = this.controllers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ConstraintController) obj).hasConstraint(spec)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC10980x.m24153x(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            arrayList2.add(((ConstraintController) obj2).track(spec.constraints));
        }
        final InterfaceC11594c[] interfaceC11594cArr = (InterfaceC11594c[]) AbstractC10947g0.m23922X0(arrayList2).toArray(new InterfaceC11594c[0]);
        return AbstractC11596e.m25564n(new InterfaceC11594c() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1

            @InterfaceC11829d(m26210c = "androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3", m26211f = "WorkConstraintsTracker.kt", m26212l = {292}, m26213m = "invokeSuspend")
            /* renamed from: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3 */
            public static final class C48093 extends SuspendLambda implements InterfaceC9545q {
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                public C48093(InterfaceC11588c interfaceC11588c) {
                    super(3, interfaceC11588c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    ConstraintsState constraintsState;
                    Object objM25952f = AbstractC11725a.m25952f();
                    int i10 = this.label;
                    if (i10 == 0) {
                        AbstractC9924b.m20071b(obj);
                        InterfaceC11595d interfaceC11595d = (InterfaceC11595d) this.L$0;
                        ConstraintsState[] constraintsStateArr = (ConstraintsState[]) ((Object[]) this.L$1);
                        int length = constraintsStateArr.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= length) {
                                constraintsState = null;
                                break;
                            }
                            constraintsState = constraintsStateArr[i11];
                            if (!AbstractC9979u.m20289b(constraintsState, ConstraintsState.ConstraintsMet.INSTANCE)) {
                                break;
                            }
                            i11++;
                        }
                        if (constraintsState == null) {
                            constraintsState = ConstraintsState.ConstraintsMet.INSTANCE;
                        }
                        this.label = 1;
                        if (interfaceC11595d.emit(constraintsState, this) == objM25952f) {
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

                @Override // p181hd.InterfaceC9545q
                public final Object invoke(InterfaceC11595d interfaceC11595d, ConstraintsState[] constraintsStateArr, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    C48093 c48093 = new C48093(interfaceC11588c);
                    c48093.L$0 = interfaceC11595d;
                    c48093.L$1 = constraintsStateArr;
                    return c48093.invokeSuspend(C10786q.f26013a);
                }
            }

            @Override // p379vd.InterfaceC11594c
            public Object collect(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
                final InterfaceC11594c[] interfaceC11594cArr2 = interfaceC11594cArr;
                Object objM20890a = CombineKt.m20890a(interfaceC11595d, interfaceC11594cArr2, new InterfaceC9529a() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public final ConstraintsState[] invoke() {
                        return new ConstraintsState[interfaceC11594cArr2.length];
                    }
                }, new C48093(null), interfaceC11588c);
                return objM20890a == AbstractC11725a.m25952f() ? objM20890a : C10786q.f26013a;
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkConstraintsTracker(Trackers trackers) {
        this((List<? extends ConstraintController>) AbstractC10978w.m24140r(new BatteryChargingController(trackers.getBatteryChargingTracker()), new BatteryNotLowController(trackers.getBatteryNotLowTracker()), new StorageNotLowController(trackers.getStorageNotLowTracker()), new NetworkConnectedController(trackers.getNetworkStateTracker()), new NetworkUnmeteredController(trackers.getNetworkStateTracker()), new NetworkNotRoamingController(trackers.getNetworkStateTracker()), new NetworkMeteredController(trackers.getNetworkStateTracker()), Build.VERSION.SDK_INT >= 28 ? WorkConstraintsTrackerKt.NetworkRequestConstraintController(trackers.getContext()) : null));
        AbstractC9979u.m20294g(trackers, "trackers");
    }
}
