package com.canhub.cropper;

import android.graphics.Bitmap;
import android.net.Uri;
import com.canhub.cropper.BitmapCroppingWorkerJob;
import com.canhub.cropper.C5903a;
import com.taobao.sophix.PatchStatus;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.canhub.cropper.BitmapCroppingWorkerJob$start$1", m26211f = "BitmapCroppingWorkerJob.kt", m26212l = {PatchStatus.CODE_LOAD_SOPHIX_VERSION, 115}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BitmapCroppingWorkerJob$start$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f5105c;

    /* renamed from: d */
    public /* synthetic */ Object f5106d;

    /* renamed from: e */
    public final /* synthetic */ BitmapCroppingWorkerJob f5107e;

    @InterfaceC11829d(m26210c = "com.canhub.cropper.BitmapCroppingWorkerJob$start$1$1", m26211f = "BitmapCroppingWorkerJob.kt", m26212l = {104}, m26213m = "invokeSuspend")
    /* renamed from: com.canhub.cropper.BitmapCroppingWorkerJob$start$1$1 */
    public static final class C58771 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f5108c;

        /* renamed from: d */
        public final /* synthetic */ BitmapCroppingWorkerJob f5109d;

        /* renamed from: e */
        public final /* synthetic */ Bitmap f5110e;

        /* renamed from: f */
        public final /* synthetic */ C5903a.a f5111f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C58771(BitmapCroppingWorkerJob bitmapCroppingWorkerJob, Bitmap bitmap, C5903a.a aVar, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f5109d = bitmapCroppingWorkerJob;
            this.f5110e = bitmap;
            this.f5111f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return new C58771(this.f5109d, this.f5110e, this.f5111f, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f5108c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                Uri uriM4566J = C5903a.f5362a.m4566J(this.f5109d.f5077c, this.f5110e, this.f5109d.f5093s, this.f5109d.f5094t, this.f5109d.f5095u);
                BitmapCroppingWorkerJob bitmapCroppingWorkerJob = this.f5109d;
                BitmapCroppingWorkerJob.C5876a c5876a = new BitmapCroppingWorkerJob.C5876a(this.f5110e, uriM4566J, null, this.f5111f.m4595b());
                this.f5108c = 1;
                if (bitmapCroppingWorkerJob.m4417v(c5876a, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C58771) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitmapCroppingWorkerJob$start$1(BitmapCroppingWorkerJob bitmapCroppingWorkerJob, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f5107e = bitmapCroppingWorkerJob;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        BitmapCroppingWorkerJob$start$1 bitmapCroppingWorkerJob$start$1 = new BitmapCroppingWorkerJob$start$1(this.f5107e, interfaceC11588c);
        bitmapCroppingWorkerJob$start$1.f5106d = obj;
        return bitmapCroppingWorkerJob$start$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x011e, code lost:
    
        if (r6.m4417v(r7, r21) != r2) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.BitmapCroppingWorkerJob$start$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((BitmapCroppingWorkerJob$start$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
