package com.canhub.cropper;

import android.graphics.Bitmap;
import android.net.Uri;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 0, 0})
@DebugMetadata(m5302c = "com.canhub.cropper.BitmapLoadingWorkerJob$onPostExecute$2", m5303f = "BitmapLoadingWorkerJob.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes2.dex */
final class BitmapLoadingWorkerJob$onPostExecute$2 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ C3427c $result;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C3429d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitmapLoadingWorkerJob$onPostExecute$2(C3429d c3429d, C3427c c3427c, InterfaceC5631c<? super BitmapLoadingWorkerJob$onPostExecute$2> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = c3429d;
        this.$result = c3427c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        BitmapLoadingWorkerJob$onPostExecute$2 bitmapLoadingWorkerJob$onPostExecute$2 = new BitmapLoadingWorkerJob$onPostExecute$2(this.this$0, this.$result, interfaceC5631c);
        bitmapLoadingWorkerJob$onPostExecute$2.L$0 = obj;
        return bitmapLoadingWorkerJob$onPostExecute$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        CropImageView cropImageView;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5774b.m5119b(obj);
        InterfaceC6009v interfaceC6009v = (InterfaceC6009v) this.L$0;
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        if (AbstractC6014x.m5648s(interfaceC6009v) && (cropImageView = (CropImageView) this.this$0.f2572e.get()) != null) {
            C3427c result = this.$result;
            ref$BooleanRef.element = true;
            AbstractC5830k.m5330g(result, "result");
            Uri uri = result.f2559a;
            cropImageView.f2452K = null;
            cropImageView.m2444i();
            Exception exc = result.f2565g;
            if (exc == null) {
                int i = result.f2562d;
                cropImageView.f2464j = i;
                cropImageView.f2466l = result.f2563e;
                cropImageView.f2467m = result.f2564f;
                cropImageView.m2442g(result.f2560b, 0, uri, result.f2561c, i);
            }
            InterfaceC3455z interfaceC3455z = cropImageView.f2442A;
            if (interfaceC3455z != null) {
                interfaceC3455z.onSetImageUriComplete(cropImageView, uri, exc);
            }
        }
        if (!ref$BooleanRef.element && (bitmap = this.$result.f2560b) != null) {
            bitmap.recycle();
        }
        return C5443s.f8405a;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((BitmapLoadingWorkerJob$onPostExecute$2) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
