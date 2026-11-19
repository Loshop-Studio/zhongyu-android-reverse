package com.tendcloud.tenddata;

import android.app.Activity;
import android.content.Context;
import com.tendcloud.tenddata.C7847af;
import java.util.Map;

/* renamed from: com.tendcloud.tenddata.ac */
/* loaded from: classes5.dex */
public final class C7844ac {

    /* renamed from: a */
    private static InterfaceC7856ao f14327a;

    /* renamed from: a */
    public static synchronized void m11048a(Context context, AbstractC7841a abstractC7841a) {
        try {
            m11115f(context, abstractC7841a);
            f14327a.mo11158a(context, abstractC7841a);
        } finally {
        }
    }

    /* renamed from: b */
    public static String m11096b(Context context, AbstractC7841a abstractC7841a) {
        return C7843ab.m11027a(context, abstractC7841a);
    }

    /* renamed from: c */
    public static String m11106c(Context context, AbstractC7841a abstractC7841a) {
        return C7843ab.m11034b(context, abstractC7841a);
    }

    /* renamed from: d */
    public static synchronized String m11111d(Context context, AbstractC7841a abstractC7841a) {
        try {
            m11115f(context, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
        return f14327a.mo11203b(context, abstractC7841a);
    }

    /* renamed from: e */
    public static synchronized String m11114e(Context context, AbstractC7841a abstractC7841a) {
        try {
            m11115f(context, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
        return f14327a.mo11222e(context, abstractC7841a);
    }

    /* renamed from: f */
    private static synchronized void m11115f(Context context, AbstractC7841a abstractC7841a) {
        if (context != null) {
            try {
                C7843ab.f14307g = context.getApplicationContext();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (C7843ab.f14307g == null) {
            C7896ca.eForDeveloper("Init failed Context is null ");
            return;
        }
        if (f14327a == null) {
            System.currentTimeMillis();
            f14327a = C8022zz.m12130a();
        }
    }

    public static synchronized void setConfigurationDisable(int i10) {
        try {
            C7843ab.setConfigurationDisable(i10);
        } finally {
        }
    }

    public static void setProfileId(String str) {
        try {
            C7843ab.f14319s = str;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    public static Context m11095b() {
        return f14327a.mo11219d();
    }

    /* renamed from: c */
    public static void m11107c() {
        try {
            C7896ca.f14478a = false;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m11097b(Activity activity, AbstractC7841a abstractC7841a) {
        try {
            m11115f(activity, abstractC7841a);
            f14327a.mo11204b(activity, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: c */
    public static void m11108c(Context context, String str, AbstractC7841a abstractC7841a) {
        m11099b(context, str, "", abstractC7841a);
    }

    /* renamed from: a */
    public static synchronized void m11051a(Context context, String str, String str2, AbstractC7841a abstractC7841a) {
        try {
            m11115f(context, abstractC7841a);
            f14327a.mo11160a(context, str, str2, abstractC7841a);
        } finally {
        }
    }

    /* renamed from: c */
    public static void m11109c(String str, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11207b(str, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: d */
    public static void m11112d(String str, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11215c(str, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m11098b(Context context, String str, AbstractC7841a abstractC7841a) {
        try {
            m11115f(context, abstractC7841a);
            f14327a.mo11205b(context, str, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: c */
    public static void m11110c(String str, String str2, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11216c(str, str2, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: d */
    public static void m11113d(String str, String str2, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11221d(str, str2, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static synchronized void m11052a(Context context, String str, String str2, String str3, AbstractC7841a abstractC7841a) {
        try {
            m11115f(context, abstractC7841a);
            f14327a.mo11161a(context, str, str2, str3, abstractC7841a);
        } finally {
        }
    }

    /* renamed from: b */
    public static void m11099b(Context context, String str, String str2, AbstractC7841a abstractC7841a) {
        m11054a(context, str, str2, (Map<String, Object>) null, abstractC7841a);
    }

    /* renamed from: b */
    public static int m11094b(Context context) {
        return C7899cd.m11438c(context);
    }

    /* renamed from: b */
    public static void m11101b(String str, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11183a(str, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static boolean m11093a() {
        return C8022zz.f15141b;
    }

    /* renamed from: a */
    public static synchronized String m11045a(Context context) {
        try {
            m11115f(context, null);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
        return f14327a.mo11202b(context);
    }

    /* renamed from: b */
    public static void m11102b(String str, C7847af.ProfileType profileType, String str2, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11184a(str, profileType, str2, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m11103b(String str, String str2, int i10, String str3, String str4, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11189a(str, str2, i10, str3, str4, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11047a(Activity activity, String str, String str2, AbstractC7841a abstractC7841a) {
        try {
            m11115f(activity, abstractC7841a);
            f14327a.mo11157a(activity, str, str2, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m11100b(String str, int i10, String str2, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11206b(str, i10, str2, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11046a(Activity activity, AbstractC7841a abstractC7841a) {
        try {
            m11115f(activity, abstractC7841a);
            f14327a.mo11156a(activity, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m11104b(String str, String str2, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11211b(str, str2, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11050a(Context context, String str, AbstractC7841a abstractC7841a) {
        try {
            m11115f(context, abstractC7841a);
            f14327a.mo11159a(context, str, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m11105b(String str, String str2, Map<String, Object> map, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11217c(str, str2, map, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11079a(String str, Object obj, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11188a(str, obj);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11076a(String str, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.removeGlobalKV(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11056a(Context context, String str, Map<String, Object> map, AbstractC7841a abstractC7841a) {
        m11054a(context, str, "null", map, abstractC7841a);
    }

    /* renamed from: a */
    public static void m11057a(Context context, String str, Map<String, Object> map, Map<String, Object> map2, AbstractC7841a abstractC7841a) {
        m11055a(context, str, (String) null, map, map2, abstractC7841a);
    }

    /* renamed from: a */
    public static void m11054a(Context context, String str, String str2, Map<String, Object> map, AbstractC7841a abstractC7841a) {
        try {
            m11115f(context, abstractC7841a);
            f14327a.mo11163a(context, str, str2, map, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11055a(Context context, String str, String str2, Map<String, Object> map, Map<String, Object> map2, AbstractC7841a abstractC7841a) {
        try {
            m11115f(context, abstractC7841a);
            f14327a.mo11164a(context, str, str2, map, map2, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11053a(Context context, String str, String str2, Map<String, Object> map, double d10, AbstractC7841a abstractC7841a) {
        try {
            m11115f(context, abstractC7841a);
            f14327a.mo11162a(context, str, str2, map, d10, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11049a(Context context, String str, double d10, Map<String, Object> map, AbstractC7841a abstractC7841a) {
        try {
            m11115f(context, abstractC7841a);
            f14327a.mo11165a(context, str, map, d10, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11067a(AbstractC7841a abstractC7841a, String str) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11163a(C7843ab.f14307g, str, "", (Map<String, Object>) null, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11092a(boolean z10, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11218c(z10);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11058a(Context context, Throwable th, AbstractC7841a abstractC7841a) {
        try {
            m11115f(context, abstractC7841a);
            f14327a.mo11166a(context, th, abstractC7841a);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11077a(String str, C7847af.ProfileType profileType, String str2, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11208b(str, profileType, str2, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11072a(String str, TalkingDataProfile talkingDataProfile, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11179a(str, talkingDataProfile, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11075a(String str, TalkingDataProfile talkingDataProfile, Map<String, Object> map, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11182a(str, talkingDataProfile, map, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11063a(TalkingDataProfile talkingDataProfile, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11171a(talkingDataProfile, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11083a(String str, String str2, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11192a(str, str2, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11073a(String str, TalkingDataProfile talkingDataProfile, String str2, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11180a(str, talkingDataProfile, str2, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11074a(String str, TalkingDataProfile talkingDataProfile, String str2, Map<String, Object> map, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11181a(str, talkingDataProfile, str2, map, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11089a(String str, String str2, String str3, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11198a(str, str2, str3, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11080a(String str, String str2, int i10, String str3, String str4, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11210b(str, str2, i10, str3, str4, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11084a(String str, String str2, C8000fx c8000fx, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11193a(str, str2, c8000fx, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11081a(String str, String str2, int i10, String str3, String str4, C8000fx c8000fx, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11190a(str, str2, i10, str3, str4, c8000fx, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11082a(String str, String str2, int i10, String str3, String str4, String str5, int i11, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11191a(str, str2, i10, str3, str4, str5, i11, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11071a(String str, int i10, String str2, String str3, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11177a(str, i10, str2, str3, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11061a(TalkingDataOrder talkingDataOrder, String str, String str2, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11169a(talkingDataOrder, str, str2, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11078a(String str, C8000fx c8000fx, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11186a(str, c8000fx, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11070a(String str, int i10, String str2, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11176a(str, i10, str2, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11060a(TalkingDataOrder talkingDataOrder, String str, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11168a(talkingDataOrder, str, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11062a(TalkingDataOrder talkingDataOrder, String str, Map<String, Object> map, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11170a(talkingDataOrder, str, map, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11059a(TalkingDataOrder talkingDataOrder, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11167a(talkingDataOrder, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11085a(String str, String str2, String str3, int i10, int i11, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11194a(str, str2, str3, i10, i11, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11086a(String str, String str2, String str3, int i10, int i11, Map<String, Object> map, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11195a(str, str2, str3, i10, i11, map, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11087a(String str, String str2, String str3, int i10, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11196a(str, str2, str3, i10, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11088a(String str, String str2, String str3, int i10, Map<String, Object> map, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11197a(str, str2, str3, i10, map, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11068a(C8001fy c8001fy, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11174a(c8001fy, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11066a(TalkingDataShoppingCart talkingDataShoppingCart, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11173a(talkingDataShoppingCart, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11069a(C8002fz c8002fz, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11175a(c8002fz, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11064a(TalkingDataSearch talkingDataSearch, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11172a(talkingDataSearch, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11090a(String str, String str2, Map<String, Object> map, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11212b(str, str2, map, abstractC7841a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11091a(Map<String, Object> map, TDGenerateUrl tDGenerateUrl, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.mo11201a(map, tDGenerateUrl);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11065a(TalkingDataSharingFilter talkingDataSharingFilter, AbstractC7841a abstractC7841a) {
        try {
            m11115f(C7843ab.f14307g, abstractC7841a);
            f14327a.setCustomDataSwitch(talkingDataSharingFilter);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
