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
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.flow.internal.CombineKt;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8809v;
import p134i7.AbstractC8811w;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10575q;

/* loaded from: classes3.dex */
public final class WorkConstraintsTracker {
    private final List<ConstraintController> controllers;

    /* JADX WARN: Multi-variable type inference failed */
    public WorkConstraintsTracker(List<? extends ConstraintController> controllers) {
        AbstractC9133u.m16133g(controllers, "controllers");
        this.controllers = controllers;
    }

    public final boolean areAllConstraintsMet(WorkSpec workSpec) {
        AbstractC9133u.m16133g(workSpec, "workSpec");
        List<ConstraintController> list = this.controllers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ConstraintController) obj).isCurrentlyConstrained(workSpec)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            Logger.get().debug(WorkConstraintsTrackerKt.TAG, "Work " + workSpec.f2050id + " constrained by " + AbstractC8778f0.m14576v0(arrayList, null, null, null, 0, null, new InterfaceC10570l() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker.areAllConstraintsMet.1
                @Override // p300x7.InterfaceC10570l
                public final CharSequence invoke(ConstraintController it) {
                    AbstractC9133u.m16133g(it, "it");
                    String simpleName = it.getClass().getSimpleName();
                    AbstractC9133u.m16132f(simpleName, "it.javaClass.simpleName");
                    return simpleName;
                }
            }, 31, null));
        }
        return arrayList.isEmpty();
    }

    public final InterfaceC9266c track(WorkSpec spec) {
        AbstractC9133u.m16133g(spec, "spec");
        List<ConstraintController> list = this.controllers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ConstraintController) obj).hasConstraint(spec)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC8811w.m14786x(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ConstraintController) it.next()).track(spec.constraints));
        }
        final InterfaceC9266c[] interfaceC9266cArr = (InterfaceC9266c[]) AbstractC8778f0.m14544U0(arrayList2).toArray(new InterfaceC9266c[0]);
        return AbstractC9268e.m17025o(new InterfaceC9266c() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1

            @InterfaceC9539d(m17800c = "androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3", m17801f = "WorkConstraintsTracker.kt", m17802l = {292}, m17803m = "invokeSuspend")
            /* renamed from: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3 */
            public static final class C48613 extends SuspendLambda implements InterfaceC10575q {
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                public C48613(InterfaceC9324c interfaceC9324c) {
                    super(3, interfaceC9324c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    ConstraintsState constraintsState;
                    Object objM17291f = AbstractC9434a.m17291f();
                    int i10 = this.label;
                    if (i10 == 0) {
                        AbstractC9079b.m15926b(obj);
                        InterfaceC9267d interfaceC9267d = (InterfaceC9267d) this.L$0;
                        ConstraintsState[] constraintsStateArr = (ConstraintsState[]) ((Object[]) this.L$1);
                        int length = constraintsStateArr.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= length) {
                                constraintsState = null;
                                break;
                            }
                            constraintsState = constraintsStateArr[i11];
                            if (!AbstractC9133u.m16128b(constraintsState, ConstraintsState.ConstraintsMet.INSTANCE)) {
                                break;
                            }
                            i11++;
                        }
                        if (constraintsState == null) {
                            constraintsState = ConstraintsState.ConstraintsMet.INSTANCE;
                        }
                        this.label = 1;
                        if (interfaceC9267d.emit(constraintsState, this) == objM17291f) {
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

                @Override // p300x7.InterfaceC10575q
                public final Object invoke(InterfaceC9267d interfaceC9267d, ConstraintsState[] constraintsStateArr, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                    C48613 c48613 = new C48613(interfaceC9324c);
                    c48613.L$0 = interfaceC9267d;
                    c48613.L$1 = constraintsStateArr;
                    return c48613.invokeSuspend(C8736p.f16368a);
                }
            }

            @Override // p169l8.InterfaceC9266c
            public Object collect(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
                final InterfaceC9266c[] interfaceC9266cArr2 = interfaceC9266cArr;
                Object objM16706a = CombineKt.m16706a(interfaceC9267d, interfaceC9266cArr2, new InterfaceC10559a() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p300x7.InterfaceC10559a
                    public final ConstraintsState[] invoke() {
                        return new ConstraintsState[interfaceC9266cArr2.length];
                    }
                }, new C48613(null), interfaceC9324c);
                return objM16706a == AbstractC9434a.m17291f() ? objM16706a : C8736p.f16368a;
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkConstraintsTracker(Trackers trackers) {
        this((List<? extends ConstraintController>) AbstractC8809v.m14775r(new BatteryChargingController(trackers.getBatteryChargingTracker()), new BatteryNotLowController(trackers.getBatteryNotLowTracker()), new StorageNotLowController(trackers.getStorageNotLowTracker()), new NetworkConnectedController(trackers.getNetworkStateTracker()), new NetworkUnmeteredController(trackers.getNetworkStateTracker()), new NetworkNotRoamingController(trackers.getNetworkStateTracker()), new NetworkMeteredController(trackers.getNetworkStateTracker()), Build.VERSION.SDK_INT >= 28 ? WorkConstraintsTrackerKt.NetworkRequestConstraintController(trackers.getContext()) : null));
        AbstractC9133u.m16133g(trackers, "trackers");
    }
}
