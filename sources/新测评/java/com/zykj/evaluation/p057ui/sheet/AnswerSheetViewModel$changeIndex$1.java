package com.zykj.evaluation.p057ui.sheet;

// RE note 本类字节码直接引用的读写或显示接口包括位图。

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.compose.runtime.ComposerKt;
import com.zykj.evaluation.p057ui.sheet.AbstractC6935c;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import p267v6.C9709z;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.sheet.AnswerSheetViewModel$changeIndex$1", m13596f = "AnswerSheetViewModel.kt", m13597i = {}, m13598l = {ComposerKt.referenceKey}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
@SourceDebugExtension({"SMAP\nAnswerSheetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnswerSheetViewModel.kt\ncom/zykj/evaluation/ui/sheet/AnswerSheetViewModel$changeIndex$1\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,281:1\n88#2:282\n1563#3:283\n1634#3,3:284\n*S KotlinDebug\n*F\n+ 1 AnswerSheetViewModel.kt\ncom/zykj/evaluation/ui/sheet/AnswerSheetViewModel$changeIndex$1\n*L\n211#1:282\n213#1:283\n213#1:284,3\n*E\n"})
/* loaded from: classes4.dex */
public final class AnswerSheetViewModel$changeIndex$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f9933a;

    /* renamed from: b */
    public final /* synthetic */ AnswerSheetViewModel f9934b;

    /* renamed from: c */
    public final /* synthetic */ int f9935c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnswerSheetViewModel$changeIndex$1(AnswerSheetViewModel answerSheetViewModel, int i10, Continuation continuation) {
        super(2, continuation);
        this.f9934b = answerSheetViewModel;
        this.f9935c = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AnswerSheetViewModel$changeIndex$1(this.f9934b, this.f9935c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmapCreateBitmap;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f9933a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.f9934b.m10203v() == this.f9935c) {
                return Unit.INSTANCE;
            }
            AnswerSheetViewModel answerSheetViewModel = this.f9934b;
            this.f9933a = 1;
            if (answerSheetViewModel.mo10201s(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        String str = this.f9934b.getMPicArray()[this.f9935c];
        if (str == null || (bitmapCreateBitmap = BitmapFactory.decodeFile(str)) == null) {
            bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
        }
        Bitmap bitmap = bitmapCreateBitmap;
        List<C9709z> listM10212e = this.f9934b.m10176D().m10212e();
        AnswerSheetViewModel answerSheetViewModel2 = this.f9934b;
        int i11 = this.f9935c;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM10212e, 10));
        for (C9709z c9709z : listM10212e) {
            String str2 = answerSheetViewModel2.getMPicArray()[c9709z.m16225c()];
            arrayList.add(C9709z.m16223b(c9709z, 0, c9709z.m16225c() == i11 ? (str2 == null || str2.length() != 0) ? AbstractC6935c.a.b.f9962d : AbstractC6935c.a.C10139a.f9961d : str2 == null ? AbstractC6935c.c.f9965d : str2.length() == 0 ? AbstractC6935c.b.a.f9963d : AbstractC6935c.b.C10140b.f9964d, 1, null));
        }
        AnswerSheetViewModel answerSheetViewModel3 = this.f9934b;
        answerSheetViewModel3.m10196X(C6933a.m10208b(answerSheetViewModel3.m10176D(), bitmap, null, null, null, arrayList, false, 46, null));
        this.f9934b.mo10199q(this.f9935c);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AnswerSheetViewModel$changeIndex$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
