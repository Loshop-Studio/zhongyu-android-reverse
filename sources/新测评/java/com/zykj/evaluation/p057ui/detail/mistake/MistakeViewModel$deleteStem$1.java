package com.zykj.evaluation.p057ui.detail.mistake;

import com.blankj.utilcode.util.FileUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import p306z5.C10013l1;
import p306z5.C9993f;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.detail.mistake.MistakeViewModel$deleteStem$1", m13596f = "MistakeViewModel.kt", m13597i = {}, m13598l = {241}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
@SourceDebugExtension({"SMAP\nMistakeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeViewModel.kt\ncom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$deleteStem$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,585:1\n230#2,3:586\n233#2,2:593\n1563#3:589\n1634#3,3:590\n*S KotlinDebug\n*F\n+ 1 MistakeViewModel.kt\ncom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$deleteStem$1\n*L\n244#1:586,3\n244#1:593,2\n246#1:589\n246#1:590,3\n*E\n"})
/* loaded from: classes4.dex */
public final class MistakeViewModel$deleteStem$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f9308a;

    /* renamed from: b */
    public final /* synthetic */ C9993f f9309b;

    /* renamed from: c */
    public final /* synthetic */ MistakeViewModel f9310c;

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "com.zykj.evaluation.ui.detail.mistake.MistakeViewModel$deleteStem$1$1", m13596f = "MistakeViewModel.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: com.zykj.evaluation.ui.detail.mistake.MistakeViewModel$deleteStem$1$1 */
    public static final class C69021 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {

        /* renamed from: a */
        public int f9311a;

        /* renamed from: b */
        public final /* synthetic */ C9993f f9312b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C69021(C9993f c9993f, Continuation continuation) {
            super(2, continuation);
            this.f9312b = c9993f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C69021(this.f9312b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f9311a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(FileUtils.delete(this.f9312b.m16803c()));
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C69021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeViewModel$deleteStem$1(C9993f c9993f, MistakeViewModel mistakeViewModel, Continuation continuation) {
        super(2, continuation);
        this.f9309b = c9993f;
        this.f9310c = mistakeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MistakeViewModel$deleteStem$1(this.f9309b, this.f9310c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objWithContext;
        Object value;
        C10013l1 c10013l1;
        ArrayList arrayList;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f9308a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            C69021 c69021 = new C69021(this.f9309b, null);
            this.f9308a = 1;
            objWithContext = BuildersKt.withContext(io2, c69021, this);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objWithContext = obj;
        }
        MistakeViewModel mistakeViewModel = this.f9310c;
        C9993f c9993f = this.f9309b;
        ((Boolean) objWithContext).getClass();
        MutableStateFlow mutableStateFlow = mistakeViewModel._mistakeUiState;
        do {
            value = mutableStateFlow.getValue();
            c10013l1 = (C10013l1) value;
            List<C9993f> listM16854j = c10013l1.m16854j();
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM16854j, 10));
            for (C9993f c9993fM16801b : listM16854j) {
                if (Intrinsics.areEqual(c9993fM16801b.m16803c(), c9993f.m16803c())) {
                    c9993fM16801b = C9993f.m16801b(c9993fM16801b, false, "", null, false, 5, null);
                }
                arrayList.add(c9993fM16801b);
            }
        } while (!mutableStateFlow.compareAndSet(value, C10013l1.m16845b(c10013l1, null, 0L, false, null, arrayList, false, null, null, null, null, null, 2031, null)));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((MistakeViewModel$deleteStem$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
