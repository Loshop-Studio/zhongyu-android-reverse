package com.friday.common.helper;

import android.util.Log;
import je.C9742v;
import je.C9743w;
import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.common.helper.OssUploadHelper$zyFsUpload$2", m26211f = "OssUploadHelper.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class OssUploadHelper$zyFsUpload$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f6076c;

    /* renamed from: d */
    public final /* synthetic */ C9743w f6077d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OssUploadHelper$zyFsUpload$2(C9743w c9743w, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f6077d = c9743w;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new OssUploadHelper$zyFsUpload$2(this.f6077d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM20054c;
        AbstractC11725a.m25952f();
        if (this.f6076c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        C9743w c9743w = this.f6077d;
        try {
            Result.C9921a c9921a = Result.f23263d;
            objM20054c = Result.m20054c(new C9742v().mo19319b(c9743w).execute());
        } catch (Throwable th) {
            Result.C9921a c9921a2 = Result.f23263d;
            objM20054c = Result.m20054c(AbstractC9924b.m20070a(th));
        }
        Throwable thM20056e = Result.m20056e(objM20054c);
        if (thM20056e != null) {
            String message = thM20056e.getMessage();
            if (message == null) {
                message = "";
            }
            Log.i("UploadDataWork", message);
        }
        return AbstractC11826a.m26206a(Result.m20059k(objM20054c));
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((OssUploadHelper$zyFsUpload$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
