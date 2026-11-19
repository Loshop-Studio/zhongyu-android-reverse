package com.zykj.evaluation.p057ui.sheet.normal;

import android.graphics.Bitmap;
import android.graphics.Point;
import com.zykj.camera.AnswerSheetNative;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m13558d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.sheet.normal.NormalViewModel$identifyAnswers$2", m13596f = "NormalViewModel.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
@SourceDebugExtension({"SMAP\nNormalViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NormalViewModel.kt\ncom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$2\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,1441:1\n37#2:1442\n36#2,3:1443\n*S KotlinDebug\n*F\n+ 1 NormalViewModel.kt\ncom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$2\n*L\n1014#1:1442\n1014#1:1443,3\n*E\n"})
/* loaded from: classes4.dex */
public final class NormalViewModel$identifyAnswers$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Boolean>>, Object> {

    /* renamed from: a */
    public int f10080a;

    /* renamed from: b */
    public final /* synthetic */ NormalViewModel f10081b;

    /* renamed from: c */
    public final /* synthetic */ Bitmap f10082c;

    /* renamed from: d */
    public final /* synthetic */ List f10083d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f10084e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NormalViewModel$identifyAnswers$2(NormalViewModel normalViewModel, Bitmap bitmap, List list, Bitmap bitmap2, Continuation continuation) {
        super(2, continuation);
        this.f10081b = normalViewModel;
        this.f10082c = bitmap;
        this.f10083d = list;
        this.f10084e = bitmap2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NormalViewModel$identifyAnswers$2(this.f10081b, this.f10082c, this.f10083d, this.f10084e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Boolean>> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM24299constructorimpl;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f10080a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        NormalViewModel normalViewModel = this.f10081b;
        Bitmap bitmap = this.f10082c;
        List list = this.f10083d;
        Bitmap bitmap2 = this.f10084e;
        try {
            Result.Companion companion = Result.INSTANCE;
            byte[] bArr = normalViewModel.tfLiteBuffer;
            byte[] bArr2 = null;
            if (bArr == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tfLiteBuffer");
                bArr = null;
            }
            byte[] bArr3 = normalViewModel.tfLiteBuffer;
            if (bArr3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tfLiteBuffer");
            } else {
                bArr2 = bArr3;
            }
            // RE note: The bundled TFL3 input is 28x28x1 float32. This JNI entry also takes sheet corners and page configuration.
            objM24299constructorimpl = Result.m24299constructorimpl(Boxing.boxBoolean(AnswerSheetNative.nativeScanAnswerSheetInChoice(bArr, bArr2.length, bitmap, (Point[]) list.toArray(new Point[0]), String.valueOf(normalViewModel.paperConfigJson), normalViewModel.m10203v(), normalViewModel.m10268K0().m16545d(), bitmap2)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM24299constructorimpl = Result.m24299constructorimpl(ResultKt.createFailure(th));
        }
        return Result.m24298boximpl(objM24299constructorimpl);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((NormalViewModel$identifyAnswers$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
