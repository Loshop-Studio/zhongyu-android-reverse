package com.efs.sdk.base.p039a.p050h.p052b;

import androidx.annotation.Nullable;
import com.efs.sdk.base.http.HttpEnv;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p039a.p050h.C5697d;
import com.efs.sdk.base.p039a.p050h.p051a.InterfaceC5686c;
import java.io.File;
import java.util.Map;

/* renamed from: com.efs.sdk.base.a.h.b.b */
/* loaded from: classes3.dex */
public final class C5691b implements InterfaceC5686c<HttpResponse> {

    /* renamed from: a */
    String f4745a;

    /* renamed from: b */
    Map<String, String> f4746b;

    /* renamed from: c */
    public byte[] f4747c;

    /* renamed from: d */
    public File f4748d;

    /* renamed from: e */
    public String f4749e;

    /* renamed from: f */
    public Map<String, String> f4750f;

    /* renamed from: g */
    public boolean f4751g = false;

    @Override // com.efs.sdk.base.p039a.p050h.p051a.InterfaceC5686c
    @Nullable
    /* renamed from: a */
    public final /* synthetic */ HttpResponse mo4145a() {
        String str = this.f4749e;
        str.getClass();
        if (str.equals("get")) {
            return HttpEnv.getInstance().getHttpUtil().get(this.f4745a, this.f4746b);
        }
        if (str.equals("post")) {
            byte[] bArr = this.f4747c;
            return (bArr == null || bArr.length <= 0) ? HttpEnv.getInstance().getHttpUtil().post(this.f4745a, this.f4746b, this.f4748d) : this.f4751g ? HttpEnv.getInstance().getHttpUtil().postAsFile(this.f4745a, this.f4746b, this.f4747c) : HttpEnv.getInstance().getHttpUtil().post(this.f4745a, this.f4746b, this.f4747c);
        }
        C5697d.m4183b("efs.util.http", "request not support method '" + this.f4749e + "'", null);
        return null;
    }
}
