package com.canhub.cropper;

import com.canhub.cropper.BitmapCroppingWorkerJob;
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

@InterfaceC11829d(m26210c = "com.canhub.cropper.BitmapCroppingWorkerJob$onPostExecute$2", m26211f = "BitmapCroppingWorkerJob.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BitmapCroppingWorkerJob$onPostExecute$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f5101c;

    /* renamed from: d */
    public /* synthetic */ Object f5102d;

    /* renamed from: e */
    public final /* synthetic */ BitmapCroppingWorkerJob f5103e;

    /* renamed from: f */
    public final /* synthetic */ BitmapCroppingWorkerJob.C5876a f5104f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitmapCroppingWorkerJob$onPostExecute$2(BitmapCroppingWorkerJob bitmapCroppingWorkerJob, BitmapCroppingWorkerJob.C5876a c5876a, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f5103e = bitmapCroppingWorkerJob;
        this.f5104f = c5876a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        BitmapCroppingWorkerJob$onPostExecute$2 bitmapCroppingWorkerJob$onPostExecute$2 = new BitmapCroppingWorkerJob$onPostExecute$2(this.f5103e, this.f5104f, interfaceC11588c);
        bitmapCroppingWorkerJob$onPostExecute$2.f5102d = obj;
        return bitmapCroppingWorkerJob$onPostExecute$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CropImageView cropImageView;
        AbstractC11725a.m25952f();
        if (this.f5101c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.f5102d;
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        if (AbstractC10006d.m20749f(interfaceC11122i0) && (cropImageView = (CropImageView) this.f5103e.f5078d.get()) != null) {
            BitmapCroppingWorkerJob.C5876a c5876a = this.f5104f;
            ref$BooleanRef.f23398c = true;
            cropImageView.m4487l(c5876a);
        }
        if (!ref$BooleanRef.f23398c && this.f5104f.m4419a() != null) {
            this.f5104f.m4419a().recycle();
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((BitmapCroppingWorkerJob$onPostExecute$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
