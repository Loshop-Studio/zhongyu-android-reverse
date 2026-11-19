package com.zykj.evaluation.p057ui.sheet.composition;

import android.graphics.Bitmap;
import android.graphics.Point;
import com.zykj.camera.AnswerSheetNative;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import p026b7.C4997c1;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.sheet.composition.CompositionViewModel$handleSuccessScanned$1$previewBitmap$1", m13596f = "CompositionViewModel.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
@SourceDebugExtension({"SMAP\nCompositionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositionViewModel.kt\ncom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1$previewBitmap$1\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,171:1\n88#2:172\n37#3:173\n36#3,3:174\n*S KotlinDebug\n*F\n+ 1 CompositionViewModel.kt\ncom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1$previewBitmap$1\n*L\n80#1:172\n81#1:173\n81#1:174,3\n*E\n"})
/* loaded from: classes4.dex */
public final class CompositionViewModel$handleSuccessScanned$1$previewBitmap$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {

    /* renamed from: a */
    public int f9987a;

    /* renamed from: b */
    public final /* synthetic */ CompositionViewModel f9988b;

    /* renamed from: c */
    public final /* synthetic */ C4997c1 f9989c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompositionViewModel$handleSuccessScanned$1$previewBitmap$1(CompositionViewModel compositionViewModel, C4997c1 c4997c1, Continuation continuation) {
        super(2, continuation);
        this.f9988b = compositionViewModel;
        this.f9989c = c4997c1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CompositionViewModel$handleSuccessScanned$1$previewBitmap$1(this.f9988b, this.f9989c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f9987a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1000, (int) (1000 * this.f9988b.m10207z()), Bitmap.Config.RGB_565);
        C4997c1 c4997c1 = this.f9989c;
        AnswerSheetNative.nativeCutImage(c4997c1.m2473a(), (Point[]) c4997c1.m2474b().toArray(new Point[0]), bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((CompositionViewModel$handleSuccessScanned$1$previewBitmap$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
