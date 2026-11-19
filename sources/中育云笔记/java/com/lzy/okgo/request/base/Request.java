package com.lzy.okgo.request.base;

import android.text.TextUtils;
import com.lzy.okgo.cache.CacheMode;
import com.lzy.okgo.model.HttpHeaders;
import com.lzy.okgo.model.HttpParams;
import com.lzy.okgo.request.base.Request;
import java.io.Serializable;
import je.AbstractC9744x;
import je.C9742v;
import je.C9743w;
import je.C9745y;
import je.InterfaceC9725e;
import p033b7.C5172a;

/* loaded from: classes5.dex */
public abstract class Request<T, R extends Request> implements Serializable {

    /* renamed from: c */
    public String f12717c;

    /* renamed from: d */
    public String f12718d;

    /* renamed from: e */
    public transient C9742v f12719e;

    /* renamed from: f */
    public transient Object f12720f;

    /* renamed from: g */
    public int f12721g;

    /* renamed from: h */
    public CacheMode f12722h;

    /* renamed from: i */
    public long f12723i;

    /* renamed from: j */
    public HttpParams f12724j = new HttpParams();

    /* renamed from: k */
    public HttpHeaders f12725k = new HttpHeaders();

    /* renamed from: l */
    public transient C9743w f12726l;

    public Request(String str) {
        this.f12717c = str;
        this.f12718d = str;
        C5172a c5172aM2692h = C5172a.m2692h();
        String strM9662a = HttpHeaders.m9662a();
        if (!TextUtils.isEmpty(strM9662a)) {
            m9683k("Accept-Language", strM9662a);
        }
        String strM9663c = HttpHeaders.m9663c();
        if (!TextUtils.isEmpty(strM9663c)) {
            m9683k(com.alibaba.sdk.android.oss.common.utils.HttpHeaders.USER_AGENT, strM9663c);
        }
        if (c5172aM2692h.m2696e() != null) {
            m9684m(c5172aM2692h.m2696e());
        }
        if (c5172aM2692h.m2695d() != null) {
            m9682g(c5172aM2692h.m2695d());
        }
        this.f12721g = c5172aM2692h.m2700j();
        this.f12722h = c5172aM2692h.m2693b();
        this.f12723i = c5172aM2692h.m2694c();
    }

    /* renamed from: a */
    public C9745y m9679a() {
        return m9681f().execute();
    }

    /* renamed from: c */
    public abstract C9743w mo9676c(AbstractC9744x abstractC9744x);

    /* renamed from: d */
    public abstract AbstractC9744x mo9677d();

    /* renamed from: e */
    public String m9680e() {
        return this.f12718d;
    }

    /* renamed from: f */
    public InterfaceC9725e m9681f() {
        AbstractC9744x abstractC9744xMo9677d = mo9677d();
        if (abstractC9744xMo9677d != null) {
            C7516a c7516a = new C7516a(abstractC9744xMo9677d, null);
            c7516a.m9689e(null);
            this.f12726l = mo9676c(c7516a);
        } else {
            this.f12726l = mo9676c(null);
        }
        if (this.f12719e == null) {
            this.f12719e = C5172a.m2692h().m2699i();
        }
        return this.f12719e.mo19319b(this.f12726l);
    }

    /* renamed from: g */
    public Request m9682g(HttpHeaders httpHeaders) {
        this.f12725k.m9665e(httpHeaders);
        return this;
    }

    /* renamed from: k */
    public Request m9683k(String str, String str2) {
        this.f12725k.m9666f(str, str2);
        return this;
    }

    /* renamed from: m */
    public Request m9684m(HttpParams httpParams) {
        this.f12724j.m9668c(httpParams);
        return this;
    }
}
