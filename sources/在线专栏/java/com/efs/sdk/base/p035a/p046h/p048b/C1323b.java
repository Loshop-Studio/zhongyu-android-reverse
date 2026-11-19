package com.efs.sdk.base.p035a.p046h.p048b;

import com.efs.sdk.base.http.HttpEnv;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p035a.p046h.C1329d;
import com.efs.sdk.base.p035a.p046h.p047a.InterfaceC1318c;
import java.io.File;
import java.util.Map;

/* renamed from: com.efs.sdk.base.a.h.b.b */
/* loaded from: classes.dex */
public final class C1323b implements InterfaceC1318c<HttpResponse> {

    /* renamed from: a */
    String f7111a;

    /* renamed from: b */
    Map<String, String> f7112b;

    /* renamed from: c */
    public byte[] f7113c;

    /* renamed from: d */
    public File f7114d;

    /* renamed from: e */
    public String f7115e;

    /* renamed from: f */
    public Map<String, String> f7116f;

    /* renamed from: g */
    public boolean f7117g = false;

    @Override // com.efs.sdk.base.p035a.p046h.p047a.InterfaceC1318c
    /* renamed from: a */
    public final /* synthetic */ HttpResponse mo5535a() {
        String str = this.f7115e;
        str.hashCode();
        if (str.equals("get")) {
            return HttpEnv.getInstance().getHttpUtil().get(this.f7111a, this.f7112b);
        }
        if (str.equals("post")) {
            byte[] bArr = this.f7113c;
            return (bArr == null || bArr.length <= 0) ? HttpEnv.getInstance().getHttpUtil().post(this.f7111a, this.f7112b, this.f7114d) : this.f7117g ? HttpEnv.getInstance().getHttpUtil().postAsFile(this.f7111a, this.f7112b, this.f7113c) : HttpEnv.getInstance().getHttpUtil().post(this.f7111a, this.f7112b, this.f7113c);
        }
        C1329d.m5573b("efs.util.http", "request not support method '" + this.f7115e + "'", null);
        return null;
    }
}
