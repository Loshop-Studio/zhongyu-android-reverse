package com.friday.common.helper;

import com.alibaba.sdk.android.oss.OSSClient;
import com.alibaba.sdk.android.oss.model.PutObjectRequest;
import com.blankj.utilcode.util.LogUtils;
import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.common.helper.OssUploadHelper$ossUpload$putObject$1", m26211f = "OssUploadHelper.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class OssUploadHelper$ossUpload$putObject$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f6067c;

    /* renamed from: d */
    public final /* synthetic */ OSSClient f6068d;

    /* renamed from: e */
    public final /* synthetic */ PutObjectRequest f6069e;

    /* renamed from: f */
    public final /* synthetic */ String f6070f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OssUploadHelper$ossUpload$putObject$1(OSSClient oSSClient, PutObjectRequest putObjectRequest, String str, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f6068d = oSSClient;
        this.f6069e = putObjectRequest;
        this.f6070f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new OssUploadHelper$ossUpload$putObject$1(this.f6068d, this.f6069e, this.f6070f, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM20054c;
        AbstractC11725a.m25952f();
        if (this.f6067c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        OSSClient oSSClient = this.f6068d;
        PutObjectRequest putObjectRequest = this.f6069e;
        try {
            Result.C9921a c9921a = Result.f23263d;
            objM20054c = Result.m20054c(oSSClient.putObject(putObjectRequest));
        } catch (Throwable th) {
            Result.C9921a c9921a2 = Result.f23263d;
            objM20054c = Result.m20054c(AbstractC9924b.m20070a(th));
        }
        String str = this.f6070f;
        Throwable thM20056e = Result.m20056e(objM20054c);
        if (thM20056e != null) {
            LogUtils.m3887e("[" + str + "]上传OSS失败，reason: " + thM20056e.getMessage());
        }
        if (Result.m20058g(objM20054c)) {
            return null;
        }
        return objM20054c;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((OssUploadHelper$ossUpload$putObject$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
