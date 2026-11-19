package com.zykj.evaluation.p057ui.board;

import com.blankj.utilcode.util.FileUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.board.SketchDraftFragment$startSaveDataThread$1", m13596f = "SketchDraftFragment.kt", m13597i = {}, m13598l = {219}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class SketchDraftFragment$startSaveDataThread$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f9043a;

    /* renamed from: b */
    public final /* synthetic */ SketchDraftFragment f9044b;

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "com.zykj.evaluation.ui.board.SketchDraftFragment$startSaveDataThread$1$1", m13596f = "SketchDraftFragment.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: com.zykj.evaluation.ui.board.SketchDraftFragment$startSaveDataThread$1$1 */
    public static final class C68831 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f9045a;

        /* renamed from: b */
        public /* synthetic */ Object f9046b;

        /* renamed from: c */
        public final /* synthetic */ SketchDraftFragment f9047c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C68831(SketchDraftFragment sketchDraftFragment, Continuation continuation) {
            super(2, continuation);
            this.f9047c = sketchDraftFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C68831 c68831 = new C68831(this.f9047c, continuation);
            c68831.f9046b = obj;
            return c68831;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope = (CoroutineScope) this.f9046b;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f9045a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SketchDraftFragment sketchDraftFragment = this.f9047c;
            synchronized (coroutineScope) {
                try {
                    if (CoroutineScopeKt.isActive(coroutineScope)) {
                        FileUtils.delete(sketchDraftFragment.path);
                    }
                    if (CoroutineScopeKt.isActive(coroutineScope) && !sketchDraftFragment.m9165i0()) {
                        if (sketchDraftFragment.needRefreshOldPng) {
                            sketchDraftFragment.m9169p0(sketchDraftFragment.oldTime, sketchDraftFragment.path);
                        } else {
                            sketchDraftFragment.m9169p0(sketchDraftFragment.qstLastModifyTime, sketchDraftFragment.path);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C68831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchDraftFragment$startSaveDataThread$1(SketchDraftFragment sketchDraftFragment, Continuation continuation) {
        super(2, continuation);
        this.f9044b = sketchDraftFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SketchDraftFragment$startSaveDataThread$1(this.f9044b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f9043a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            C68831 c68831 = new C68831(this.f9044b, null);
            this.f9043a = 1;
            if (BuildersKt.withContext(io2, c68831, this) == coroutine_suspended) {
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
        return ((SketchDraftFragment$startSaveDataThread$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
