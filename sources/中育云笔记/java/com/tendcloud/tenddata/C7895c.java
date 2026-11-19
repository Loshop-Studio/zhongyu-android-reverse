package com.tendcloud.tenddata;

import android.app.Activity;
import android.os.Message;
import com.tendcloud.tenddata.C8022zz;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import org.android.agoo.common.AgooConstants;

/* renamed from: com.tendcloud.tenddata.c */
/* loaded from: classes5.dex */
final class C7895c {
    private C7895c() {
    }

    /* renamed from: a */
    public static void m11363a(Activity activity, final AbstractC7841a abstractC7841a) {
        try {
            C7843ab.f14314n = 0;
            C8022zz.m12133b().removeMessages(0);
            if (activity == null || (activity.getChangingConfigurations() & 128) != 128) {
                C7912cq.execute(new Runnable() { // from class: com.tendcloud.tenddata.c.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            C8022zz.a aVar = new C8022zz.a();
                            aVar.paraMap.put("apiType", 10);
                            aVar.paraMap.put("occurTime", Long.valueOf(System.currentTimeMillis()));
                            aVar.paraMap.put("service", abstractC7841a);
                            Message.obtain(C8022zz.m12134c(), 102, aVar).sendToTarget();
                        } catch (Throwable unused) {
                        }
                    }
                });
            } else {
                C7896ca.iForDeveloper("Ignore page changing during screen switch");
                C8022zz.f15143d = true;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static void m11367b(final Activity activity, final AbstractC7841a abstractC7841a) {
        try {
            if (C7843ab.f14276K) {
                C7843ab.f14314n = 1;
                C8022zz.m12133b().removeMessages(0);
                Message messageObtain = Message.obtain();
                messageObtain.obj = abstractC7841a;
                messageObtain.what = 0;
                C8022zz.m12133b().sendMessageDelayed(messageObtain, 30000L);
                C7912cq.execute(new Runnable() { // from class: com.tendcloud.tenddata.c.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            C8022zz.a aVar = new C8022zz.a();
                            aVar.paraMap.put("apiType", 11);
                            aVar.paraMap.put("service", abstractC7841a);
                            HashMap<String, Object> map = aVar.paraMap;
                            Activity activity2 = activity;
                            map.put("pageName", activity2 != null ? activity2.getLocalClassName() : "");
                            aVar.paraMap.put("occurTime", String.valueOf(System.currentTimeMillis()));
                            Message.obtain(C8022zz.m12134c(), 102, aVar).sendToTarget();
                        } catch (Throwable unused) {
                        }
                    }
                });
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m11364a(AbstractC7841a abstractC7841a) {
        if (C7843ab.f14276K || !m11365a()) {
            return;
        }
        m11363a(null, abstractC7841a);
    }

    /* renamed from: a */
    private static boolean m11365a() {
        boolean zBooleanValue = false;
        try {
            zBooleanValue = ((Boolean) Class.forName("android.app.Activity").getDeclaredMethod("isResumed", null).invoke(m11366b(), null)).booleanValue();
            C7843ab.f14276K = true;
            return zBooleanValue;
        } catch (Throwable th) {
            C7896ca.eForInternal(th);
            return zBooleanValue;
        }
    }

    /* renamed from: b */
    private static Activity m11366b() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("currentActivityThread", null).invoke(null, null);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            for (Object obj : ((Map) declaredField.get(objInvoke)).values()) {
                Class<?> cls2 = obj.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj)) {
                    Field declaredField3 = cls2.getDeclaredField(AgooConstants.OPEN_ACTIIVTY_NAME);
                    declaredField3.setAccessible(true);
                    return (Activity) declaredField3.get(obj);
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
