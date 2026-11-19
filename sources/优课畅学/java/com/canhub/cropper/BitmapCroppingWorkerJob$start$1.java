package com.canhub.cropper;

import android.graphics.Bitmap;
import android.net.Uri;
import com.canhub.cropper.BitmapCroppingWorkerJob;
import com.canhub.cropper.C5484a;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.canhub.cropper.BitmapCroppingWorkerJob$start$1", m17801f = "BitmapCroppingWorkerJob.kt", m17802l = {76, 115}, m17803m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BitmapCroppingWorkerJob$start$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f3335a;

    /* renamed from: b */
    public /* synthetic */ Object f3336b;

    /* renamed from: c */
    public final /* synthetic */ BitmapCroppingWorkerJob f3337c;

    @InterfaceC9539d(m17800c = "com.canhub.cropper.BitmapCroppingWorkerJob$start$1$1", m17801f = "BitmapCroppingWorkerJob.kt", m17802l = {104}, m17803m = "invokeSuspend")
    /* renamed from: com.canhub.cropper.BitmapCroppingWorkerJob$start$1$1 */
    public static final class C54581 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f3338a;

        /* renamed from: b */
        public final /* synthetic */ BitmapCroppingWorkerJob f3339b;

        /* renamed from: c */
        public final /* synthetic */ Bitmap f3340c;

        /* renamed from: d */
        public final /* synthetic */ C5484a.a f3341d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C54581(BitmapCroppingWorkerJob bitmapCroppingWorkerJob, Bitmap bitmap, C5484a.a aVar, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f3339b = bitmapCroppingWorkerJob;
            this.f3340c = bitmap;
            this.f3341d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return new C54581(this.f3339b, this.f3340c, this.f3341d, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C54581) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f3338a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                Uri uriM3364J = C5484a.f3592a.m3364J(this.f3339b.f3307a, this.f3340c, this.f3339b.f3323q, this.f3339b.f3324r, this.f3339b.f3325s);
                BitmapCroppingWorkerJob bitmapCroppingWorkerJob = this.f3339b;
                BitmapCroppingWorkerJob.C5457a c5457a = new BitmapCroppingWorkerJob.C5457a(this.f3340c, uriM3364J, null, this.f3341d.m3393b());
                this.f3338a = 1;
                if (bitmapCroppingWorkerJob.m3215v(c5457a, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitmapCroppingWorkerJob$start$1(BitmapCroppingWorkerJob bitmapCroppingWorkerJob, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f3337c = bitmapCroppingWorkerJob;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        BitmapCroppingWorkerJob$start$1 bitmapCroppingWorkerJob$start$1 = new BitmapCroppingWorkerJob$start$1(this.f3337c, interfaceC9324c);
        bitmapCroppingWorkerJob$start$1.f3336b = obj;
        return bitmapCroppingWorkerJob$start$1;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((BitmapCroppingWorkerJob$start$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x011e, code lost:
    
        if (r6.m3215v(r7, r21) != r2) goto L31;
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
}
