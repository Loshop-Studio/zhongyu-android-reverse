package com.zykj.evaluation.p057ui.detail;

import android.graphics.Bitmap;
import com.blankj.utilcode.util.ImageUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import p101g7.C7589e;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.detail.BaseDetailViewModel$saveBitmapToAddMistake$1$1", m13596f = "BaseDetailViewModel.kt", m13597i = {0}, m13598l = {370}, m13599m = "invokeSuspend", m13600n = {"path"}, m13601s = {"L$0"})
/* loaded from: classes4.dex */
public final class BaseDetailViewModel$saveBitmapToAddMistake$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f9158a;

    /* renamed from: b */
    public int f9159b;

    /* renamed from: c */
    public final /* synthetic */ BaseDetailViewModel f9160c;

    /* renamed from: d */
    public final /* synthetic */ Bitmap f9161d;

    /* renamed from: e */
    public final /* synthetic */ Function1 f9162e;

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "com.zykj.evaluation.ui.detail.BaseDetailViewModel$saveBitmapToAddMistake$1$1$1", m13596f = "BaseDetailViewModel.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: com.zykj.evaluation.ui.detail.BaseDetailViewModel$saveBitmapToAddMistake$1$1$1 */
    public static final class C68921 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {

        /* renamed from: a */
        public int f9163a;

        /* renamed from: b */
        public final /* synthetic */ BaseDetailViewModel f9164b;

        /* renamed from: c */
        public final /* synthetic */ Bitmap f9165c;

        /* renamed from: d */
        public final /* synthetic */ String f9166d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C68921(BaseDetailViewModel baseDetailViewModel, Bitmap bitmap, String str, Continuation continuation) {
            super(2, continuation);
            this.f9164b = baseDetailViewModel;
            this.f9165c = bitmap;
            this.f9166d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C68921(this.f9164b, this.f9165c, this.f9166d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f9163a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(ImageUtils.save(this.f9164b.m9310v(this.f9165c), this.f9166d, Bitmap.CompressFormat.WEBP, true));
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C68921) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDetailViewModel$saveBitmapToAddMistake$1$1(BaseDetailViewModel baseDetailViewModel, Bitmap bitmap, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f9160c = baseDetailViewModel;
        this.f9161d = bitmap;
        this.f9162e = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseDetailViewModel$saveBitmapToAddMistake$1$1(this.f9160c, this.f9161d, this.f9162e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f9159b;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            String strM12455p = C7589e.m12455p(this.f9160c.m9268K(), this.f9160c.m9274Q(), 0, 2, null);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            C68921 c68921 = new C68921(this.f9160c, this.f9161d, strM12455p, null);
            this.f9158a = strM12455p;
            this.f9159b = 1;
            Object objWithContext = BuildersKt.withContext(io2, c68921, this);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = strM12455p;
            obj = objWithContext;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.f9158a;
            ResultKt.throwOnFailure(obj);
        }
        Function1 function1 = this.f9162e;
        if (((Boolean) obj).booleanValue()) {
            function1.invoke(str);
        } else {
            function1.invoke("");
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((BaseDetailViewModel$saveBitmapToAddMistake$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
