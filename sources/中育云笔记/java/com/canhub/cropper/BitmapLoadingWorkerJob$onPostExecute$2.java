package com.canhub.cropper;

import com.canhub.cropper.BitmapLoadingWorkerJob;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.AbstractC10006d;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.canhub.cropper.BitmapLoadingWorkerJob$onPostExecute$2", m26211f = "BitmapLoadingWorkerJob.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BitmapLoadingWorkerJob$onPostExecute$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f5125c;

    /* renamed from: d */
    public /* synthetic */ Object f5126d;

    /* renamed from: e */
    public final /* synthetic */ BitmapLoadingWorkerJob f5127e;

    /* renamed from: f */
    public final /* synthetic */ BitmapLoadingWorkerJob.C5878a f5128f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitmapLoadingWorkerJob$onPostExecute$2(BitmapLoadingWorkerJob bitmapLoadingWorkerJob, BitmapLoadingWorkerJob.C5878a c5878a, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f5127e = bitmapLoadingWorkerJob;
        this.f5128f = c5878a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        BitmapLoadingWorkerJob$onPostExecute$2 bitmapLoadingWorkerJob$onPostExecute$2 = new BitmapLoadingWorkerJob$onPostExecute$2(this.f5127e, this.f5128f, interfaceC11588c);
        bitmapLoadingWorkerJob$onPostExecute$2.f5126d = obj;
        return bitmapLoadingWorkerJob$onPostExecute$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CropImageView cropImageView;
        AbstractC11725a.m25952f();
        if (this.f5125c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.f5126d;
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        if (AbstractC10006d.m20749f(interfaceC11122i0) && (cropImageView = (CropImageView) this.f5127e.f5116g.get()) != null) {
            BitmapLoadingWorkerJob.C5878a c5878a = this.f5128f;
            ref$BooleanRef.f23398c = true;
            cropImageView.m4488m(c5878a);
        }
        if (!ref$BooleanRef.f23398c && this.f5128f.m4432a() != null) {
            this.f5128f.m4432a().recycle();
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((BitmapLoadingWorkerJob$onPostExecute$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
