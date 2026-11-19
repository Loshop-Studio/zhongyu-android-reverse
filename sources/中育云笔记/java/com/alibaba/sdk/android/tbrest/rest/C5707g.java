package com.alibaba.sdk.android.tbrest.rest;

import android.content.Context;
import com.alibaba.sdk.android.tbrest.utils.LogUtil;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: com.alibaba.sdk.android.tbrest.rest.g */
/* loaded from: classes3.dex */
public class C5707g {

    /* renamed from: h */
    private String f4529h;
    private Context mContext;

    /* renamed from: a */
    private Object f4521a = null;

    /* renamed from: b */
    private Object f4523b = null;

    /* renamed from: a */
    private Class f4520a = null;

    /* renamed from: a */
    private Field f4522a = null;

    /* renamed from: b */
    private Field f4524b = null;

    /* renamed from: c */
    private Field f4526c = null;

    /* renamed from: b */
    private Method f4525b = null;

    /* renamed from: g */
    private int f4528g = 1;

    /* renamed from: c */
    private boolean f4527c = false;

    public C5707g(Context context, String str) {
        this.mContext = context;
        this.f4529h = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void m3867f() {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f4527c     // Catch: java.lang.Throwable -> Lb2
            if (r0 == 0) goto L7
            monitor-exit(r5)
            return
        L7:
            r0 = 0
            java.lang.String r1 = "com.taobao.wireless.security.sdk.SecurityGuardManager"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "getInstance"
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Throwable -> L36
            java.lang.reflect.Method r2 = r1.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L36
            android.content.Context r3 = r5.mContext     // Catch: java.lang.Throwable -> L36
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L36
            java.lang.Object r2 = r2.invoke(r0, r3)     // Catch: java.lang.Throwable -> L36
            r5.f4521a = r2     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = "getSecureSignatureComp"
            java.lang.reflect.Method r2 = r1.getMethod(r2, r0)     // Catch: java.lang.Throwable -> L36
            java.lang.Object r3 = r5.f4521a     // Catch: java.lang.Throwable -> L36
            java.lang.Object r2 = r2.invoke(r3, r0)     // Catch: java.lang.Throwable -> L36
            r5.f4523b = r2     // Catch: java.lang.Throwable -> L36
            goto L3b
        L35:
            r1 = r0
        L36:
            java.lang.String r2 = "initSecurityCheck failure, It's ok "
            com.alibaba.sdk.android.tbrest.utils.LogUtil.m3872i(r2)     // Catch: java.lang.Throwable -> Lb2
        L3b:
            r2 = 1
            if (r1 == 0) goto Lb4
            java.lang.String r3 = "com.taobao.wireless.security.sdk.SecurityGuardParamContext"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> Lac
            r5.f4520a = r3     // Catch: java.lang.Throwable -> Lac
            java.lang.String r4 = "appKey"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: java.lang.Throwable -> Lac
            r5.f4522a = r3     // Catch: java.lang.Throwable -> Lac
            java.lang.Class r3 = r5.f4520a     // Catch: java.lang.Throwable -> Lac
            java.lang.String r4 = "paramMap"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: java.lang.Throwable -> Lac
            r5.f4524b = r3     // Catch: java.lang.Throwable -> Lac
            java.lang.Class r3 = r5.f4520a     // Catch: java.lang.Throwable -> Lac
            java.lang.String r4 = "requestType"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: java.lang.Throwable -> Lac
            r5.f4526c = r3     // Catch: java.lang.Throwable -> Lac
            java.lang.String r3 = "isOpen"
            java.lang.reflect.Method r1 = r1.getMethod(r3, r0)     // Catch: java.lang.Throwable -> L69
            goto L6f
        L69:
            java.lang.String r1 = "initSecurityCheck failure, It's ok"
            com.alibaba.sdk.android.tbrest.utils.LogUtil.m3872i(r1)     // Catch: java.lang.Throwable -> Lac
            r1 = r0
        L6f:
            if (r1 == 0) goto L7e
            java.lang.Object r3 = r5.f4521a     // Catch: java.lang.Throwable -> Lac
            java.lang.Object r0 = r1.invoke(r3, r0)     // Catch: java.lang.Throwable -> Lac
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Lac
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lac
            goto L8f
        L7e:
            java.lang.String r1 = "com.taobao.wireless.security.sdk.securitybody.ISecurityBodyComponent"
            java.lang.Class r0 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L85
            goto L8a
        L85:
            java.lang.String r1 = "initSecurityCheck failure, It's ok"
            com.alibaba.sdk.android.tbrest.utils.LogUtil.m3872i(r1)     // Catch: java.lang.Throwable -> Lac
        L8a:
            if (r0 != 0) goto L8e
            r0 = r2
            goto L8f
        L8e:
            r0 = 0
        L8f:
            if (r0 == 0) goto L93
            r0 = r2
            goto L95
        L93:
            r0 = 12
        L95:
            r5.f4528g = r0     // Catch: java.lang.Throwable -> Lac
            java.lang.String r0 = "com.taobao.wireless.security.sdk.securesignature.ISecureSignatureComponent"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r1 = "signRequest"
            java.lang.Class r3 = r5.f4520a     // Catch: java.lang.Throwable -> Lac
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Throwable -> Lac
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.Throwable -> Lac
            r5.f4525b = r0     // Catch: java.lang.Throwable -> Lac
            goto Lb4
        Lac:
            java.lang.String r0 = "initSecurityCheck failure, It's ok"
            com.alibaba.sdk.android.tbrest.utils.LogUtil.m3872i(r0)     // Catch: java.lang.Throwable -> Lb2
            goto Lb4
        Lb2:
            r0 = move-exception
            goto Lb8
        Lb4:
            r5.f4527c = r2     // Catch: java.lang.Throwable -> Lb2
            monitor-exit(r5)
            return
        Lb8:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lb2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.tbrest.rest.C5707g.m3867f():void");
    }

    /* renamed from: b */
    public String m3868b(String str) throws IllegalAccessException, InstantiationException, IllegalArgumentException {
        Class cls;
        if (!this.f4527c) {
            m3867f();
        }
        if (this.f4529h == null) {
            LogUtil.m3870e("RestSecuritySDKRequestAuthentication:getSign There is no appkey,please check it!");
            return null;
        }
        if (str != null && this.f4521a != null && (cls = this.f4520a) != null && this.f4522a != null && this.f4524b != null && this.f4526c != null && this.f4525b != null && this.f4523b != null) {
            try {
                Object objNewInstance = cls.newInstance();
                this.f4522a.set(objNewInstance, this.f4529h);
                ((Map) this.f4524b.get(objNewInstance)).put("INPUT", str);
                this.f4526c.set(objNewInstance, Integer.valueOf(this.f4528g));
                return (String) this.f4525b.invoke(this.f4523b, objNewInstance);
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            } catch (IllegalArgumentException e11) {
                e11.printStackTrace();
            } catch (InstantiationException e12) {
                e12.printStackTrace();
            } catch (InvocationTargetException e13) {
                e13.printStackTrace();
            }
        }
        return null;
    }
}
