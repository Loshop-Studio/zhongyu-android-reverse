package com.efs.sdk.base.p020a.p031h.p033b;

import android.support.annotation.Nullable;
import com.efs.sdk.base.http.HttpEnv;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.p020a.p031h.C2957d;
import com.efs.sdk.base.p020a.p031h.p032a.InterfaceC2946c;
import java.io.File;
import java.util.Map;

/* renamed from: com.efs.sdk.base.a.h.b.b */
/* loaded from: classes2.dex */
public final class C2951b implements InterfaceC2946c<HttpResponse> {

    /* renamed from: a */
    String f1141a;

    /* renamed from: b */
    Map<String, String> f1142b;

    /* renamed from: c */
    public byte[] f1143c;

    /* renamed from: d */
    public File f1144d;

    /* renamed from: e */
    public String f1145e;

    /* renamed from: f */
    public Map<String, String> f1146f;

    /* renamed from: g */
    public boolean f1147g = false;

    @Override // com.efs.sdk.base.p020a.p031h.p032a.InterfaceC2946c
    @Nullable
    /* renamed from: a */
    public final /* synthetic */ HttpResponse mo2176a() {
        String str = this.f1145e;
        str.hashCode();
        if (str.equals("get")) {
            return HttpEnv.getInstance().getHttpUtil().get(this.f1141a, this.f1142b);
        }
        if (str.equals("post")) {
            byte[] bArr = this.f1143c;
            return (bArr == null || bArr.length <= 0) ? HttpEnv.getInstance().getHttpUtil().post(this.f1141a, this.f1142b, this.f1144d) : this.f1147g ? HttpEnv.getInstance().getHttpUtil().postAsFile(this.f1141a, this.f1142b, this.f1143c) : HttpEnv.getInstance().getHttpUtil().post(this.f1141a, this.f1142b, this.f1143c);
        }
        C2957d.m2214b("efs.util.http", "request not support method '" + this.f1145e + "'", null);
        return null;
    }
}
