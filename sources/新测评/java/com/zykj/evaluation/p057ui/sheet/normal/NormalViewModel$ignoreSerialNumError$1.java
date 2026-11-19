package com.zykj.evaluation.p057ui.sheet.normal;

import android.graphics.Bitmap;
import com.blankj.utilcode.util.ScreenUtils;
import com.zykj.evaluation.p057ui.sheet.AbstractC6934b;
import com.zykj.evaluation.p057ui.sheet.C6933a;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import p026b7.C4997c1;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.sheet.normal.NormalViewModel$ignoreSerialNumError$1", m13596f = "NormalViewModel.kt", m13597i = {0, 0, 0, 0, 0}, m13598l = {795}, m13599m = "invokeSuspend", m13600n = {"it", "previewBitmap", "isPageError", "$i$a$-let-NormalViewModel$ignoreSerialNumError$1$1", "width"}, m13601s = {"L$0", "L$1", "Z$0", "I$0", "I$1"})
@SourceDebugExtension({"SMAP\nNormalViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NormalViewModel.kt\ncom/zykj/evaluation/ui/sheet/normal/NormalViewModel$ignoreSerialNumError$1\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,1441:1\n88#2:1442\n*S KotlinDebug\n*F\n+ 1 NormalViewModel.kt\ncom/zykj/evaluation/ui/sheet/normal/NormalViewModel$ignoreSerialNumError$1\n*L\n793#1:1442\n*E\n"})
/* loaded from: classes4.dex */
public final class NormalViewModel$ignoreSerialNumError$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public boolean f10096a;

    /* renamed from: b */
    public Object f10097b;

    /* renamed from: c */
    public Object f10098c;

    /* renamed from: d */
    public int f10099d;

    /* renamed from: e */
    public int f10100e;

    /* renamed from: f */
    public int f10101f;

    /* renamed from: g */
    public final /* synthetic */ NormalViewModel f10102g;

    /* renamed from: h */
    public final /* synthetic */ Function0 f10103h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NormalViewModel$ignoreSerialNumError$1(NormalViewModel normalViewModel, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.f10102g = normalViewModel;
        this.f10103h = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NormalViewModel$ignoreSerialNumError$1(this.f10102g, this.f10103h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f10101f;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            AbstractC6934b abstractC6934bM10214g = this.f10102g.m10176D().m10214g();
            Intrinsics.checkNotNull(abstractC6934bM10214g, "null cannot be cast to non-null type com.zykj.evaluation.ui.sheet.ScanResult.Failed");
            boolean zM10217b = ((AbstractC6934b.c) abstractC6934bM10214g).m10217b();
            if (zM10217b) {
                NormalViewModel normalViewModel = this.f10102g;
                normalViewModel.m10196X(C6933a.m10208b(normalViewModel.m10176D(), null, null, null, new AbstractC6934b.c(false, false, true), null, false, 55, null));
            } else {
                NormalViewModel normalViewModel2 = this.f10102g;
                normalViewModel2.m10196X(C6933a.m10208b(normalViewModel2.m10176D(), null, null, null, AbstractC6934b.d.f9957b, null, false, 55, null));
                C4997c1 scanResult = this.f10102g.getScanResult();
                if (scanResult != null) {
                    NormalViewModel normalViewModel3 = this.f10102g;
                    int iMin = Math.min(ScreenUtils.getScreenHeight(), ScreenUtils.getScreenWidth());
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, (int) (iMin * normalViewModel3.m10207z()), Bitmap.Config.RGB_565);
                    Bitmap bitmapM2473a = scanResult.m2473a();
                    List listM2474b = scanResult.m2474b();
                    this.f10097b = SpillingKt.nullOutSpilledVariable(scanResult);
                    this.f10098c = SpillingKt.nullOutSpilledVariable(bitmapCreateBitmap);
                    this.f10096a = zM10217b;
                    this.f10099d = 0;
                    this.f10100e = iMin;
                    this.f10101f = 1;
                    if (normalViewModel3.m10273P0(bitmapM2473a, listM2474b, bitmapCreateBitmap, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.f10103h.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((NormalViewModel$ignoreSerialNumError$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
