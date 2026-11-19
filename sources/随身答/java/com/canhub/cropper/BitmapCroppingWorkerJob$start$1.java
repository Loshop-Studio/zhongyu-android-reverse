package com.canhub.cropper;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.canhub.cropper.BitmapCroppingWorkerJob;
import com.canhub.cropper.C5540a;
import com.taobao.sophix.PatchStatus;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 0, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.canhub.cropper.BitmapCroppingWorkerJob$start$1", m13451f = "BitmapCroppingWorkerJob.kt", m13452i = {}, m13453l = {PatchStatus.CODE_LOAD_SOPHIX_VERSION, 115}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes3.dex */
public final class BitmapCroppingWorkerJob$start$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f3690a;

    /* renamed from: b */
    public /* synthetic */ Object f3691b;

    /* renamed from: c */
    public final /* synthetic */ BitmapCroppingWorkerJob f3692c;

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 0, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.canhub.cropper.BitmapCroppingWorkerJob$start$1$1", m13451f = "BitmapCroppingWorkerJob.kt", m13452i = {}, m13453l = {104}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.canhub.cropper.BitmapCroppingWorkerJob$start$1$1 */
    public static final class C55141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f3693a;

        /* renamed from: b */
        public final /* synthetic */ BitmapCroppingWorkerJob f3694b;

        /* renamed from: c */
        public final /* synthetic */ Bitmap f3695c;

        /* renamed from: d */
        public final /* synthetic */ C5540a.a f3696d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C55141(BitmapCroppingWorkerJob bitmapCroppingWorkerJob, Bitmap bitmap, C5540a.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f3694b = bitmapCroppingWorkerJob;
            this.f3695c = bitmap;
            this.f3696d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C55141(this.f3694b, this.f3695c, this.f3696d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IOException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.f3693a;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                Uri uriM3546J = C5540a.f3947a.m3546J(this.f3694b.f3662a, this.f3695c, this.f3694b.f3678q, this.f3694b.f3679r, this.f3694b.f3680s);
                BitmapCroppingWorkerJob bitmapCroppingWorkerJob = this.f3694b;
                BitmapCroppingWorkerJob.C5513a c5513a = new BitmapCroppingWorkerJob.C5513a(this.f3695c, uriM3546J, null, this.f3696d.m3575b());
                this.f3693a = 1;
                if (bitmapCroppingWorkerJob.m3397v(c5513a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C55141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitmapCroppingWorkerJob$start$1(BitmapCroppingWorkerJob bitmapCroppingWorkerJob, Continuation continuation) {
        super(2, continuation);
        this.f3692c = bitmapCroppingWorkerJob;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BitmapCroppingWorkerJob$start$1 bitmapCroppingWorkerJob$start$1 = new BitmapCroppingWorkerJob$start$1(this.f3692c, continuation);
        bitmapCroppingWorkerJob$start$1.f3691b = obj;
        return bitmapCroppingWorkerJob$start$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x011e, code lost:
    
        if (r6.m3397v(r7, r21) != r2) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.BitmapCroppingWorkerJob$start$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((BitmapCroppingWorkerJob$start$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
