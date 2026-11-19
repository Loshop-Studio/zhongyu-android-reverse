package com.tendcloud.tenddata;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: com.tendcloud.tenddata.em */
/* loaded from: classes5.dex */
public class C7962em implements InvocationHandler {
    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            try {
                C7994fr.m11998a().setOAID((String) objArr[1].getClass().getMethod("getOAID", null).invoke(objArr[1], null));
            } catch (Throwable unused) {
                C7994fr.m11998a().setOAID((String) objArr[0].getClass().getMethod("getOAID", null).invoke(objArr[0], null));
            }
        } catch (Throwable unused2) {
        }
        try {
            try {
                String str = (String) objArr[1].getClass().getMethod("getVAID", null).invoke(objArr[1], null);
                C7994fr c7994frM11998a = C7994fr.m11998a();
                if (C7912cq.m11608b(str)) {
                    str = null;
                }
                c7994frM11998a.setVAID(str);
            } catch (Throwable unused3) {
                String str2 = (String) objArr[0].getClass().getMethod("getVAID", null).invoke(objArr[0], null);
                C7994fr c7994frM11998a2 = C7994fr.m11998a();
                if (C7912cq.m11608b(str2)) {
                    str2 = null;
                }
                c7994frM11998a2.setVAID(str2);
            }
        } catch (Throwable unused4) {
        }
        try {
            try {
                String str3 = (String) objArr[1].getClass().getMethod("getAAID", null).invoke(objArr[1], null);
                C7994fr c7994frM11998a3 = C7994fr.m11998a();
                if (C7912cq.m11608b(str3)) {
                    str3 = null;
                }
                c7994frM11998a3.setAAID(str3);
            } catch (Throwable unused5) {
                String str4 = (String) objArr[0].getClass().getMethod("getAAID", null).invoke(objArr[0], null);
                C7994fr c7994frM11998a4 = C7994fr.m11998a();
                if (C7912cq.m11608b(str4)) {
                    str4 = null;
                }
                c7994frM11998a4.setAAID(str4);
            }
        } catch (Throwable unused6) {
        }
        C7945dw.f14801a.countDown();
        return null;
    }
}
