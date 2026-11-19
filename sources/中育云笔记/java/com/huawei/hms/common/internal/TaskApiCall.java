package com.huawei.hms.common.internal;

import android.os.Parcelable;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.support.log.HMSLog;
import p385w4.AbstractC11697a;
import p385w4.C11702f;

/* loaded from: classes5.dex */
public abstract class TaskApiCall<ClientT extends AnyClient, ResultT> {

    /* renamed from: a */
    public final String f11587a;

    /* renamed from: b */
    public final String f11588b;

    /* renamed from: c */
    public Parcelable f11589c;

    /* renamed from: d */
    public String f11590d;

    /* renamed from: e */
    public int f11591e;

    @Deprecated
    public TaskApiCall(String str, String str2) {
        this.f11591e = 1;
        this.f11587a = str;
        this.f11588b = str2;
        this.f11589c = null;
        this.f11590d = null;
    }

    /* renamed from: a */
    public abstract void mo8490a(AnyClient anyClient, ResponseErrorCode responseErrorCode, String str, C11702f c11702f);

    public int getApiLevel() {
        return this.f11591e;
    }

    @Deprecated
    public int getMinApkVersion() {
        return 30000000;
    }

    public Parcelable getParcelable() {
        return this.f11589c;
    }

    public String getRequestJson() {
        return this.f11588b;
    }

    public AbstractC11697a getToken() {
        return null;
    }

    public String getTransactionId() {
        return this.f11590d;
    }

    public String getUri() {
        return this.f11587a;
    }

    public final void onResponse(ClientT clientt, ResponseErrorCode responseErrorCode, String str, C11702f c11702f) {
        HMSLog.m8727i("TaskApiCall", "doExecute, uri:" + this.f11587a + ", errorCode:" + responseErrorCode.getErrorCode() + ", transactionId:" + this.f11590d);
        mo8490a(clientt, responseErrorCode, str, c11702f);
    }

    public void setApiLevel(int i10) {
        this.f11591e = i10;
    }

    public void setParcelable(Parcelable parcelable) {
        this.f11589c = parcelable;
    }

    public void setTransactionId(String str) {
        this.f11590d = str;
    }

    public TaskApiCall(String str, String str2, String str3) {
        this.f11591e = 1;
        this.f11587a = str;
        this.f11588b = str2;
        this.f11589c = null;
        this.f11590d = str3;
    }

    public TaskApiCall(String str, String str2, String str3, int i10) {
        this.f11587a = str;
        this.f11588b = str2;
        this.f11589c = null;
        this.f11590d = str3;
        this.f11591e = i10;
    }

    public void setToken(AbstractC11697a abstractC11697a) {
    }
}
