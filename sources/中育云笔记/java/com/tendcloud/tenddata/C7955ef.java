package com.tendcloud.tenddata;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.tendcloud.tenddata.C7960ek;
import com.tendcloud.tenddata.C8022zz;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.UUID;

/* renamed from: com.tendcloud.tenddata.ef */
/* loaded from: classes5.dex */
public class C7955ef {

    /* renamed from: a */
    private static volatile C7955ef f14834a;

    static {
        try {
            C7913cr.m11625a().register(m11868a());
        } catch (Throwable unused) {
        }
    }

    private C7955ef() {
    }

    /* renamed from: b */
    private final void m11874b(HashMap<String, Object> map) {
        try {
            AbstractC7841a abstractC7841a = (AbstractC7841a) map.get("service");
            long j10 = Long.parseLong(String.valueOf(map.get("occurTime")));
            if (map.containsKey("sessionEnd")) {
                m11870a(abstractC7841a);
                return;
            }
            if (map.containsKey("pageName")) {
                C7897cb.setLastActivity(String.valueOf(map.get("pageName")));
            }
            m11873b(abstractC7841a);
            C7897cb.m11387c(j10, abstractC7841a);
            C7843ab.f14275J = null;
        } catch (Throwable unused) {
        }
    }

    public final void onTDEBEventSession(C8022zz.a aVar) {
        HashMap<String, Object> map;
        if (aVar == null || (map = aVar.paraMap) == null) {
            return;
        }
        try {
            int i10 = Integer.parseInt(String.valueOf(map.get("apiType")));
            if (i10 == 10) {
                m11872a(aVar.paraMap);
            } else if (i10 == 11) {
                m11874b(aVar.paraMap);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private final void m11872a(HashMap<String, Object> map) {
        try {
            AbstractC7841a abstractC7841a = (AbstractC7841a) map.get("service");
            long j10 = Long.parseLong(String.valueOf(map.get("occurTime")));
            long jM11385c = C7897cb.m11385c(abstractC7841a);
            long jM11395f = C7897cb.m11395f(abstractC7841a);
            if (jM11395f <= jM11385c) {
                jM11395f = jM11385c;
            }
            if (j10 - jM11395f > 30000) {
                m11870a(abstractC7841a);
                m11869a(j10, abstractC7841a);
                C7897cb.setLastActivity("");
                return;
            }
            String strM11373a = C7897cb.m11373a(abstractC7841a);
            if (strM11373a == null) {
                m11869a(j10, abstractC7841a);
                C7897cb.setLastActivity("");
                return;
            }
            C7896ca.iForDeveloper("[" + abstractC7841a.name() + "][Session] - Same session as before! Session id is " + strM11373a);
            C7982ff.m11972a().setSessionId(strM11373a);
            C7982ff.m11972a().setSessionStartTime(jM11385c);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m11873b(AbstractC7841a abstractC7841a) {
        C7960ek c7960ek = new C7960ek();
        c7960ek.f14866a = abstractC7841a;
        c7960ek.f14867b = C7960ek.a.IMMEDIATELY;
        C7913cr.m11625a().post(c7960ek);
    }

    /* renamed from: a */
    private void m11870a(final AbstractC7841a abstractC7841a) {
        try {
            String strM11373a = C7897cb.m11373a(abstractC7841a);
            if (strM11373a == null || strM11373a.trim().isEmpty()) {
                return;
            }
            long jM11385c = C7897cb.m11385c(abstractC7841a);
            long jM11395f = C7897cb.m11395f(abstractC7841a) - jM11385c;
            if ((abstractC7841a.name().equals(GrsBaseInfo.CountryCodeSource.APP) || abstractC7841a.name().equals("APP_SQL") || abstractC7841a.name().equals("TRACKING") || abstractC7841a.name().equals("SDK")) && jM11395f < 500) {
                jM11395f = -1000;
            }
            C7961el c7961el = new C7961el();
            c7961el.f14869b = "session";
            c7961el.f14870c = "end";
            TreeMap treeMap = new TreeMap();
            treeMap.put("sessionId", strM11373a);
            treeMap.put("start", Long.valueOf(jM11385c));
            treeMap.put(TypedValues.TransitionType.S_DURATION, Long.valueOf(jM11395f / 1000));
            c7961el.f14871d = treeMap;
            c7961el.f14868a = abstractC7841a;
            c7961el.f14873f = new InterfaceC7981fe() { // from class: com.tendcloud.tenddata.ef.1
                @Override // com.tendcloud.tenddata.InterfaceC7981fe
                public void onStoreFailed() {
                }

                @Override // com.tendcloud.tenddata.InterfaceC7981fe
                public void onStoreSuccess() {
                    try {
                        C7955ef.this.m11873b(abstractC7841a);
                    } catch (Throwable unused) {
                    }
                }
            };
            C7913cr.m11625a().post(c7961el);
            C7897cb.m11376a((String) null, abstractC7841a);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private void m11869a(long j10, final AbstractC7841a abstractC7841a) {
        try {
            C7896ca.iForDeveloper("[" + abstractC7841a.name() + "][Session] - New session!");
            String string = UUID.randomUUID().toString();
            C7896ca.iForDeveloper("[" + abstractC7841a.name() + "][Session] - Id: " + string);
            long jM11395f = C7897cb.m11395f(abstractC7841a);
            long j11 = j10 - jM11395f;
            if (0 == jM11395f) {
                j11 = 0;
            }
            C7897cb.m11376a(string, abstractC7841a);
            C7897cb.m11375a(j10, abstractC7841a);
            C7897cb.m11383b(string, abstractC7841a);
            C7982ff.m11972a().setSessionId(string);
            C7982ff.m11972a().setSessionStartTime(j10);
            C7961el c7961el = new C7961el();
            c7961el.f14869b = "session";
            c7961el.f14870c = "begin";
            TreeMap treeMap = new TreeMap();
            treeMap.put("sessionId", string);
            treeMap.put("interval", Long.valueOf(j11 / 1000));
            c7961el.f14871d = treeMap;
            c7961el.f14868a = abstractC7841a;
            c7961el.f14873f = new InterfaceC7981fe() { // from class: com.tendcloud.tenddata.ef.2
                @Override // com.tendcloud.tenddata.InterfaceC7981fe
                public void onStoreFailed() {
                }

                @Override // com.tendcloud.tenddata.InterfaceC7981fe
                public void onStoreSuccess() {
                    try {
                        C7955ef.this.m11873b(abstractC7841a);
                    } catch (Throwable unused) {
                    }
                }
            };
            C7913cr.m11625a().post(c7961el);
            C7843ab.f14291Z.set(false);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static C7955ef m11868a() {
        if (f14834a == null) {
            synchronized (C7955ef.class) {
                try {
                    if (f14834a == null) {
                        f14834a = new C7955ef();
                    }
                } finally {
                }
            }
        }
        return f14834a;
    }
}
