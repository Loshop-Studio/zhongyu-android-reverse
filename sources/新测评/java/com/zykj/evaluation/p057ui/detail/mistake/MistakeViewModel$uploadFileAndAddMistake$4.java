package com.zykj.evaluation.p057ui.detail.mistake;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.work.WorkInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p306z5.C10013l1;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.detail.mistake.MistakeViewModel$uploadFileAndAddMistake$4", m13596f = "MistakeViewModel.kt", m13597i = {}, m13598l = {276}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class MistakeViewModel$uploadFileAndAddMistake$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f9329a;

    /* renamed from: b */
    public final /* synthetic */ MistakeViewModel f9330b;

    /* renamed from: c */
    public final /* synthetic */ List f9331c;

    /* renamed from: d */
    public final /* synthetic */ C10013l1 f9332d;

    /* renamed from: e */
    public final /* synthetic */ Function0 f9333e;

    @Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m13558d2 = {"<anonymous>", "", "workInfoList", "", "Landroidx/work/WorkInfo;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "com.zykj.evaluation.ui.detail.mistake.MistakeViewModel$uploadFileAndAddMistake$4$1", m13596f = "MistakeViewModel.kt", m13597i = {0, 0, 0, 1, 1, 1}, m13598l = {287, 298}, m13599m = "invokeSuspend", m13600n = {"workInfoList", "urlList", "shootUrlList", "workInfoList", "urlList", "shootUrlList"}, m13601s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    @SourceDebugExtension({"SMAP\nMistakeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeViewModel.kt\ncom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,585:1\n1740#2,3:586\n1563#2:589\n1634#2,3:590\n785#2:593\n796#2:594\n1878#2,2:595\n797#2,2:597\n1880#2:599\n799#2:600\n230#2,2:602\n295#2,2:604\n295#2,2:606\n295#2,2:608\n774#2:610\n865#2,2:611\n1563#2:613\n1634#2,3:614\n1740#2,3:617\n1#3:601\n*S KotlinDebug\n*F\n+ 1 MistakeViewModel.kt\ncom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1\n*L\n277#1:586,3\n279#1:589\n279#1:590,3\n282#1:593\n282#1:594\n282#1:595,2\n282#1:597,2\n282#1:599\n282#1:600\n305#1:602,2\n307#1:604,2\n308#1:606,2\n309#1:608,2\n310#1:610\n310#1:611,2\n311#1:613\n311#1:614,3\n317#1:617,3\n*E\n"})
    /* renamed from: com.zykj.evaluation.ui.detail.mistake.MistakeViewModel$uploadFileAndAddMistake$4$1 */
    public static final class C69041 extends SuspendLambda implements Function2<List<? extends WorkInfo>, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public Object f9334a;

        /* renamed from: b */
        public Object f9335b;

        /* renamed from: c */
        public int f9336c;

        /* renamed from: d */
        public /* synthetic */ Object f9337d;

        /* renamed from: e */
        public final /* synthetic */ MistakeViewModel f9338e;

        /* renamed from: f */
        public final /* synthetic */ C10013l1 f9339f;

        /* renamed from: g */
        public final /* synthetic */ Function0 f9340g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C69041(MistakeViewModel mistakeViewModel, C10013l1 c10013l1, Function0 function0, Continuation continuation) {
            super(2, continuation);
            this.f9338e = mistakeViewModel;
            this.f9339f = c10013l1;
            this.f9340g = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List list, Continuation continuation) {
            return ((C69041) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C69041 c69041 = new C69041(this.f9338e, this.f9339f, this.f9340g, continuation);
            c69041.f9337d = obj;
            return c69041;
        }

        /* JADX WARN: Code restructure failed: missing block: B:117:0x028e, code lost:
        
            if (r7.m14825g(r17, r32) == r2) goto L118;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0161  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0164  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0167  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0173  */
        /* JADX WARN: Type inference failed for: r3v9, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r8v34, types: [java.util.List] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r33) {
            /*
                Method dump skipped, instructions count: 678
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.detail.mistake.MistakeViewModel$uploadFileAndAddMistake$4.C69041.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1.smali:194
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeViewModel$uploadFileAndAddMistake$4(MistakeViewModel mistakeViewModel, List list, C10013l1 c10013l1, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.f9330b = mistakeViewModel;
        this.f9331c = list;
        this.f9332d = c10013l1;
        this.f9333e = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MistakeViewModel$uploadFileAndAddMistake$4(this.f9330b, this.f9331c, this.f9332d, this.f9333e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f9329a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowAsFlow = FlowLiveDataConversions.asFlow(this.f9330b.ossTaskManger.m10479k(this.f9331c));
            C69041 c69041 = new C69041(this.f9330b, this.f9332d, this.f9333e, null);
            this.f9329a = 1;
            if (FlowKt.collectLatest(flowAsFlow, c69041, this) == coroutine_suspended) {
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

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((MistakeViewModel$uploadFileAndAddMistake$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
