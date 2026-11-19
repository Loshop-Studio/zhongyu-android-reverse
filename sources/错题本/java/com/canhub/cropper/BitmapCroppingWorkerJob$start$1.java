package com.canhub.cropper;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import androidx.core.location.LocationRequestCompat;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 0, 0})
@DebugMetadata(m5302c = "com.canhub.cropper.BitmapCroppingWorkerJob$start$1", m5303f = "BitmapCroppingWorkerJob.kt", m5304i = {}, m5305l = {76, 115}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes2.dex */
final class BitmapCroppingWorkerJob$start$1 extends SuspendLambda implements InterfaceC6473e {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C3425b this$0;

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 0, 0})
    @DebugMetadata(m5302c = "com.canhub.cropper.BitmapCroppingWorkerJob$start$1$1", m5303f = "BitmapCroppingWorkerJob.kt", m5304i = {}, m5305l = {LocationRequestCompat.QUALITY_LOW_POWER}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: com.canhub.cropper.BitmapCroppingWorkerJob$start$1$1 */
    public static final class C34211 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ C3431e $bitmapSampled;
        final /* synthetic */ Bitmap $resizedBitmap;
        int label;
        final /* synthetic */ C3425b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34211(C3425b c3425b, Bitmap bitmap, C3431e c3431e, InterfaceC5631c<? super C34211> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.this$0 = c3425b;
            this.$resizedBitmap = bitmap;
            this.$bitmapSampled = c3431e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return new C34211(this.this$0, this.$resizedBitmap, this.$bitmapSampled, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                Rect rect = AbstractC3437h.f2603a;
                C3425b c3425b = this.this$0;
                Uri uriM2491v = AbstractC3437h.m2491v(c3425b.f2538a, this.$resizedBitmap, c3425b.f2554q, c3425b.f2555r, c3425b.f2556s);
                C3425b c3425b2 = this.this$0;
                C3423a c3423a = new C3423a(this.$resizedBitmap, uriM2491v, null, this.$bitmapSampled.f2578b);
                this.label = 1;
                if (C3425b.m2454a(c3425b2, c3423a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C34211) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitmapCroppingWorkerJob$start$1(C3425b c3425b, InterfaceC5631c<? super BitmapCroppingWorkerJob$start$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = c3425b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        BitmapCroppingWorkerJob$start$1 bitmapCroppingWorkerJob$start$1 = new BitmapCroppingWorkerJob$start$1(this.this$0, interfaceC5631c);
        bitmapCroppingWorkerJob$start$1.L$0 = obj;
        return bitmapCroppingWorkerJob$start$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c7 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.BitmapCroppingWorkerJob$start$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((BitmapCroppingWorkerJob$start$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
