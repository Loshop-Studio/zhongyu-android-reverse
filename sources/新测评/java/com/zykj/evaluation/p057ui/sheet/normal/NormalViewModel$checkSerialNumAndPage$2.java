package com.zykj.evaluation.p057ui.sheet.normal;

import android.graphics.Bitmap;
import android.graphics.Point;
import com.zykj.camera.AnswerSheetNative;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.sheet.normal.NormalViewModel$checkSerialNumAndPage$2", m13596f = "NormalViewModel.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
@SourceDebugExtension({"SMAP\nNormalViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NormalViewModel.kt\ncom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$2\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,1441:1\n37#2:1442\n36#2,3:1443\n*S KotlinDebug\n*F\n+ 1 NormalViewModel.kt\ncom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$2\n*L\n966#1:1442\n966#1:1443,3\n*E\n"})
/* loaded from: classes4.dex */
public final class NormalViewModel$checkSerialNumAndPage$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {

    /* renamed from: a */
    public int f10018a;

    /* renamed from: b */
    public final /* synthetic */ Bitmap f10019b;

    /* renamed from: c */
    public final /* synthetic */ List f10020c;

    /* renamed from: d */
    public final /* synthetic */ NormalViewModel f10021d;

    /* renamed from: e */
    public final /* synthetic */ String[] f10022e;

    /* renamed from: f */
    public final /* synthetic */ Bitmap f10023f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NormalViewModel$checkSerialNumAndPage$2(Bitmap bitmap, List list, NormalViewModel normalViewModel, String[] strArr, Bitmap bitmap2, Continuation continuation) {
        super(2, continuation);
        this.f10019b = bitmap;
        this.f10020c = list;
        this.f10021d = normalViewModel;
        this.f10022e = strArr;
        this.f10023f = bitmap2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NormalViewModel$checkSerialNumAndPage$2(this.f10019b, this.f10020c, this.f10021d, this.f10022e, this.f10023f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f10018a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Boxing.boxInt(AnswerSheetNative.nativeGetAnswerSheetIds(this.f10019b, (Point[]) this.f10020c.toArray(new Point[0]), this.f10021d.paperConfigString, this.f10022e, this.f10023f));
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((NormalViewModel$checkSerialNumAndPage$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
