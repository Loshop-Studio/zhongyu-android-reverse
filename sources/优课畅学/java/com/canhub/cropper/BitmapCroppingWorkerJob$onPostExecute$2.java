package com.canhub.cropper;

import com.canhub.cropper.BitmapCroppingWorkerJob;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.AbstractC9165e;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.canhub.cropper.BitmapCroppingWorkerJob$onPostExecute$2", m17801f = "BitmapCroppingWorkerJob.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BitmapCroppingWorkerJob$onPostExecute$2 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f3331a;

    /* renamed from: b */
    public /* synthetic */ Object f3332b;

    /* renamed from: c */
    public final /* synthetic */ BitmapCroppingWorkerJob f3333c;

    /* renamed from: d */
    public final /* synthetic */ BitmapCroppingWorkerJob.C5457a f3334d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitmapCroppingWorkerJob$onPostExecute$2(BitmapCroppingWorkerJob bitmapCroppingWorkerJob, BitmapCroppingWorkerJob.C5457a c5457a, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f3333c = bitmapCroppingWorkerJob;
        this.f3334d = c5457a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        BitmapCroppingWorkerJob$onPostExecute$2 bitmapCroppingWorkerJob$onPostExecute$2 = new BitmapCroppingWorkerJob$onPostExecute$2(this.f3333c, this.f3334d, interfaceC9324c);
        bitmapCroppingWorkerJob$onPostExecute$2.f3332b = obj;
        return bitmapCroppingWorkerJob$onPostExecute$2;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((BitmapCroppingWorkerJob$onPostExecute$2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CropImageView cropImageView;
        AbstractC9434a.m17291f();
        if (this.f3331a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.f3332b;
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        if (AbstractC9165e.m16558g(interfaceC8822b0) && (cropImageView = (CropImageView) this.f3333c.f3308b.get()) != null) {
            BitmapCroppingWorkerJob.C5457a c5457a = this.f3334d;
            ref$BooleanRef.f17469a = true;
            cropImageView.m3286l(c5457a);
        }
        if (!ref$BooleanRef.f17469a && this.f3334d.m3217a() != null) {
            this.f3334d.m3217a().recycle();
        }
        return C8736p.f16368a;
    }
}
