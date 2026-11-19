package androidx.work.impl.constraints;

import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
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
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.CombineKt;

@Metadata(m13557d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m13558d2 = {"Landroidx/work/impl/constraints/WorkConstraintsTracker;", "", "trackers", "Landroidx/work/impl/constraints/trackers/Trackers;", "(Landroidx/work/impl/constraints/trackers/Trackers;)V", "controllers", "", "Landroidx/work/impl/constraints/controllers/ConstraintController;", "(Ljava/util/List;)V", "areAllConstraintsMet", "", "workSpec", "Landroidx/work/impl/model/WorkSpec;", "track", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/work/impl/constraints/ConstraintsState;", "spec", "work-runtime_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nWorkConstraintsTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkConstraintsTracker.kt\nandroidx/work/impl/constraints/WorkConstraintsTracker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,315:1\n766#2:316\n857#2,2:317\n1549#2:319\n1620#2,3:320\n766#2:328\n857#2,2:329\n287#3:323\n288#3:326\n37#4,2:324\n107#5:327\n*S KotlinDebug\n*F\n+ 1 WorkConstraintsTracker.kt\nandroidx/work/impl/constraints/WorkConstraintsTracker\n*L\n94#1:316\n94#1:317,2\n94#1:319\n94#1:320,3\n102#1:328\n102#1:329,2\n95#1:323\n95#1:326\n95#1:324,2\n95#1:327\n*E\n"})
/* loaded from: classes3.dex */
public final class WorkConstraintsTracker {
    private final List<ConstraintController> controllers;

    /* JADX WARN: Multi-variable type inference failed */
    public WorkConstraintsTracker(List<? extends ConstraintController> controllers) {
        Intrinsics.checkNotNullParameter(controllers, "controllers");
        this.controllers = controllers;
    }

    public final boolean areAllConstraintsMet(WorkSpec workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        List<ConstraintController> list = this.controllers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ConstraintController) obj).isCurrentlyConstrained(workSpec)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            Logger.get().debug(WorkConstraintsTrackerKt.TAG, "Work " + workSpec.id + " constrained by " + CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, new Function1<ConstraintController, CharSequence>() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker.areAllConstraintsMet.1
                @Override // kotlin.jvm.functions.Function1
                public final CharSequence invoke(ConstraintController it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    String simpleName = it.getClass().getSimpleName();
                    Intrinsics.checkNotNullExpressionValue(simpleName, "it.javaClass.simpleName");
                    return simpleName;
                }
            }, 31, null));
        }
        return arrayList.isEmpty();
    }

    public final Flow<ConstraintsState> track(WorkSpec spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        List<ConstraintController> list = this.controllers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ConstraintController) obj).hasConstraint(spec)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            arrayList2.add(((ConstraintController) obj2).track(spec.constraints));
        }
        final Flow[] flowArr = (Flow[]) CollectionsKt.toList(arrayList2).toArray(new Flow[0]);
        return FlowKt.distinctUntilChanged(new Flow<ConstraintsState>() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1

            @Metadata(m13557d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u008a@¨\u0006\u0007"}, m13558d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
            @DebugMetadata(m13595c = "androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3", m13596f = "WorkConstraintsTracker.kt", m13597i = {}, m13598l = {292}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
            @SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2\n+ 2 WorkConstraintsTracker.kt\nandroidx/work/impl/constraints/WorkConstraintsTracker\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,332:1\n96#2:333\n1282#3,2:334\n*S KotlinDebug\n*F\n+ 1 WorkConstraintsTracker.kt\nandroidx/work/impl/constraints/WorkConstraintsTracker\n*L\n96#1:334,2\n*E\n"})
            /* renamed from: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3 */
            public static final class C47763 extends SuspendLambda implements Function3<FlowCollector<? super ConstraintsState>, ConstraintsState[], Continuation<? super Unit>, Object> {
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                public C47763(Continuation continuation) {
                    super(3, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    ConstraintsState constraintsState;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i10 = this.label;
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = (FlowCollector) this.L$0;
                        ConstraintsState[] constraintsStateArr = (ConstraintsState[]) ((Object[]) this.L$1);
                        int length = constraintsStateArr.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= length) {
                                constraintsState = null;
                                break;
                            }
                            constraintsState = constraintsStateArr[i11];
                            if (!Intrinsics.areEqual(constraintsState, ConstraintsState.ConstraintsMet.INSTANCE)) {
                                break;
                            }
                            i11++;
                        }
                        if (constraintsState == null) {
                            constraintsState = ConstraintsState.ConstraintsMet.INSTANCE;
                        }
                        this.label = 1;
                        if (flowCollector.emit(constraintsState, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(FlowCollector<? super ConstraintsState> flowCollector, ConstraintsState[] constraintsStateArr, Continuation<? super Unit> continuation) {
                    C47763 c47763 = new C47763(continuation);
                    c47763.L$0 = flowCollector;
                    c47763.L$1 = constraintsStateArr;
                    return c47763.invokeSuspend(Unit.INSTANCE);
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super ConstraintsState> flowCollector, Continuation continuation) {
                final Flow[] flowArr2 = flowArr;
                Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr2, new Function0<ConstraintsState[]>() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final ConstraintsState[] invoke() {
                        return new ConstraintsState[flowArr2.length];
                    }
                }, new C47763(null), continuation);
                return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkConstraintsTracker(Trackers trackers) {
        this((List<? extends ConstraintController>) CollectionsKt.listOfNotNull((Object[]) new ConstraintController[]{new BatteryChargingController(trackers.getBatteryChargingTracker()), new BatteryNotLowController(trackers.getBatteryNotLowTracker()), new StorageNotLowController(trackers.getStorageNotLowTracker()), new NetworkConnectedController(trackers.getNetworkStateTracker()), new NetworkUnmeteredController(trackers.getNetworkStateTracker()), new NetworkNotRoamingController(trackers.getNetworkStateTracker()), new NetworkMeteredController(trackers.getNetworkStateTracker()), Build.VERSION.SDK_INT >= 28 ? WorkConstraintsTrackerKt.NetworkRequestConstraintController(trackers.getContext()) : null}));
        Intrinsics.checkNotNullParameter(trackers, "trackers");
    }
}
