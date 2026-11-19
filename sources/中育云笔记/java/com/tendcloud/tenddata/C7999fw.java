package com.tendcloud.tenddata;

import android.util.EventLogTags;
import android.util.Pair;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tendcloud.tenddata.fw */
/* loaded from: classes5.dex */
public class C7999fw {

    /* renamed from: c */
    private static C7985fi f14987c;

    /* renamed from: d */
    private static C7988fl f14988d;

    /* renamed from: e */
    private static C7992fp f14989e = new C7992fp();

    /* renamed from: f */
    private static C7989fm f14990f = null;

    /* renamed from: h */
    private static volatile C7999fw f14991h = null;

    /* renamed from: a */
    public JSONObject f14992a = null;

    /* renamed from: b */
    public JSONObject f14993b = null;

    /* renamed from: g */
    private C7996ft f14994g = null;

    /* renamed from: b */
    public static C7999fw m12011b() {
        if (f14991h == null) {
            synchronized (C7999fw.class) {
                try {
                    if (f14991h == null) {
                        f14991h = new C7999fw();
                    }
                } finally {
                }
            }
        }
        return f14991h;
    }

    /* renamed from: a */
    public synchronized JSONObject m12012a(C7984fh c7984fh, boolean z10) {
        return m12013a(c7984fh, z10, null);
    }

    /* renamed from: a */
    public synchronized JSONObject m12013a(C7984fh c7984fh, boolean z10, AbstractC7841a abstractC7841a) {
        return m12014a(c7984fh, z10, abstractC7841a, null);
    }

    /* renamed from: a */
    public synchronized JSONObject m12014a(C7984fh c7984fh, boolean z10, AbstractC7841a abstractC7841a, Pair<String, JSONArray> pair) {
        JSONObject jSONObject;
        String strM11808b;
        if (c7984fh != null) {
            if (c7984fh.mo11973b() != null) {
                synchronized (EventLogTags.class) {
                    try {
                        jSONObject = new JSONObject();
                        C7902cg.getFileLock(C7943du.m11787a().m11808b());
                        this.f14992a = new JSONObject();
                        this.f14993b = new JSONObject();
                        try {
                            if (f14987c == null) {
                                f14987c = C7985fi.m11974a();
                                f14987c.setUniqueId(C7998fv.m12008a(C7843ab.f14307g, C7843ab.f14307g.getPackageName()));
                            }
                            f14987c.setSubmitAppId(abstractC7841a);
                            f14987c.setSubmitChannelId(abstractC7841a);
                            if (f14989e == null) {
                                f14989e = new C7992fp();
                            }
                            C7992fp.f14962a.m11988a();
                            f14989e.m11991c().setSlots(C7903ch.m11504B(C7843ab.f14307g));
                            if (f14988d == null) {
                                f14988d = new C7988fl();
                            }
                            if (f14990f == null) {
                                C7989fm c7989fm = new C7989fm();
                                f14990f = c7989fm;
                                c7989fm.m11984a();
                            }
                        } catch (Throwable unused) {
                        }
                        f14990f.m11985c();
                        try {
                            jSONObject.put("version", "2.0");
                            jSONObject.put("action", c7984fh.mo11973b());
                            jSONObject.put("device", f14989e.mo11973b());
                            jSONObject.put("app", f14987c.mo11973b());
                            jSONObject.put("sdk", f14988d.mo11973b());
                            jSONObject.put("appContext", C7982ff.m11972a().mo11973b());
                            jSONObject.put("user", f14990f.mo11973b());
                            jSONObject.put("sharingFilterPermission", C7843ab.f14322v.ordinal());
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            jSONObject.put("ts", jCurrentTimeMillis);
                            jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_FINGERPRINT, C7912cq.m11612c(jCurrentTimeMillis + C7998fv.m12007a(C7843ab.f14307g) + f14989e.m11990a().m11996a() + f14989e.m11990a().m11997c()));
                            if (z10) {
                                JSONArray jSONArray = new JSONArray();
                                jSONArray.put(new C7996ft(EnumC7997fu.WIFI).mo11973b());
                                if (this.f14994g == null) {
                                    this.f14994g = new C7996ft(EnumC7997fu.CELLULAR);
                                }
                                jSONArray.put(this.f14994g.mo11973b());
                                try {
                                    if (C7912cq.m11607b(C7843ab.f14307g, "android.permission.BLUETOOTH")) {
                                        jSONArray.put(new C7996ft(EnumC7997fu.BLUETOOTH).mo11973b());
                                    }
                                } catch (Throwable unused2) {
                                }
                                jSONObject.put("networks", jSONArray);
                                JSONArray jSONArrayM11805a = C7943du.m11787a().m11805a("Location");
                                if (jSONArrayM11805a != null) {
                                    jSONObject.put("locations", new C7986fj().mo11973b());
                                    if (jSONArrayM11805a.length() > 0) {
                                        m12016a("Location", jSONArrayM11805a);
                                    }
                                }
                            }
                            if (pair != null && ((JSONArray) pair.second).length() > 0) {
                                m12016a((String) pair.first, (JSONArray) pair.second);
                            }
                            if (!C7843ab.f14317q) {
                                jSONObject.put("cloudcontrol", this.f14992a);
                            }
                            C7943du.m11787a().m11809c();
                        } catch (Throwable unused3) {
                        }
                        strM11808b = C7943du.m11787a().m11808b();
                    } catch (Throwable unused4) {
                        strM11808b = C7943du.m11787a().m11808b();
                    } finally {
                    }
                    C7902cg.releaseFileLock(strM11808b);
                }
                return jSONObject;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m12015a() {
        C7989fm c7989fm = f14990f;
        if (c7989fm != null) {
            c7989fm.m11986d();
        }
    }

    /* renamed from: a */
    public void m12016a(String str, JSONArray jSONArray) {
        try {
            if (C7843ab.f14317q || this.f14992a == null || jSONArray.length() <= 0) {
                return;
            }
            this.f14992a.put(str, jSONArray);
        } catch (Throwable unused) {
        }
    }
}
