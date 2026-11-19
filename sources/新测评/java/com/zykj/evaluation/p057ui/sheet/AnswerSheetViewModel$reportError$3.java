package com.zykj.evaluation.p057ui.sheet;

import android.graphics.Bitmap;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.ImageUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.sheet.AnswerSheetViewModel$reportError$3", m13596f = "AnswerSheetViewModel.kt", m13597i = {0, 0}, m13598l = {269}, m13599m = "invokeSuspend", m13600n = {"bitmap", "scanFailedPath"}, m13601s = {"L$0", "L$1"})
/* loaded from: classes4.dex */
public final class AnswerSheetViewModel$reportError$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f9938a;

    /* renamed from: b */
    public Object f9939b;

    /* renamed from: c */
    public int f9940c;

    /* renamed from: d */
    public final /* synthetic */ AnswerSheetViewModel f9941d;

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "com.zykj.evaluation.ui.sheet.AnswerSheetViewModel$reportError$3$1", m13596f = "AnswerSheetViewModel.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: com.zykj.evaluation.ui.sheet.AnswerSheetViewModel$reportError$3$1 */
    public static final class C69321 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {

        /* renamed from: a */
        public int f9942a;

        /* renamed from: b */
        public final /* synthetic */ Bitmap f9943b;

        /* renamed from: c */
        public final /* synthetic */ String f9944c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C69321(Bitmap bitmap, String str, Continuation continuation) {
            super(2, continuation);
            this.f9943b = bitmap;
            this.f9944c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C69321(this.f9943b, this.f9944c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f9942a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(ImageUtils.save(this.f9943b, this.f9944c, Bitmap.CompressFormat.WEBP));
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C69321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnswerSheetViewModel$reportError$3(AnswerSheetViewModel answerSheetViewModel, Continuation continuation) {
        super(2, continuation);
        this.f9941d = answerSheetViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AnswerSheetViewModel$reportError$3(this.f9941d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f9940c;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            Bitmap bitmapM10213f = this.f9941d.m10176D().m10213f();
            String strM12470q = this.f9941d.m10205x().m12470q();
            CoroutineDispatcher io2 = Dispatchers.getIO();
            C69321 c69321 = new C69321(bitmapM10213f, strM12470q, null);
            this.f9938a = SpillingKt.nullOutSpilledVariable(bitmapM10213f);
            this.f9939b = strM12470q;
            this.f9940c = 1;
            if (BuildersKt.withContext(io2, c69321, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = strM12470q;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.f9939b;
            ResultKt.throwOnFailure(obj);
        }
        this.f9941d.ossTaskManger.m10489u(str, 3, new String[]{"ScanFailed/" + FileUtils.getFileName(str)});
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AnswerSheetViewModel$reportError$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
