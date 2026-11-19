package com.tendcloud.tenddata;

import anet.channel.strategy.dispatch.DispatchConstants;
import com.tendcloud.tenddata.C7960ek;
import com.tendcloud.tenddata.C8022zz;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tendcloud.tenddata.dx */
/* loaded from: classes5.dex */
public class C7946dx {

    /* renamed from: a */
    private static volatile C7946dx f14802a;

    static {
        try {
            C7913cr.m11625a().register(m11818a());
        } catch (Throwable unused) {
        }
    }

    private C7946dx() {
    }

    /* renamed from: a */
    public static C7946dx m11818a() {
        if (f14802a == null) {
            synchronized (C7946dx.class) {
                try {
                    if (f14802a == null) {
                        f14802a = new C7946dx();
                    }
                } finally {
                }
            }
        }
        return f14802a;
    }

    public final void onTDEBEventIAP(C8022zz.a aVar) {
        if (aVar != null) {
            try {
                HashMap<String, Object> map = aVar.paraMap;
                if (map != null && Integer.parseInt(String.valueOf(map.get("apiType"))) == 8) {
                    C7961el c7961el = new C7961el();
                    Object obj = aVar.paraMap.get("data");
                    AbstractC7841a abstractC7841a = (AbstractC7841a) aVar.paraMap.get("service");
                    c7961el.f14869b = String.valueOf(aVar.paraMap.get(DispatchConstants.DOMAIN));
                    c7961el.f14870c = String.valueOf(aVar.paraMap.get("action"));
                    if (obj instanceof Map) {
                        c7961el.f14871d = (Map) obj;
                    }
                    c7961el.f14868a = abstractC7841a;
                    C7913cr.m11625a().post(c7961el);
                    C7960ek c7960ek = new C7960ek();
                    c7960ek.f14866a = abstractC7841a;
                    c7960ek.f14867b = C7960ek.a.IMMEDIATELY;
                    C7913cr.m11625a().post(c7960ek);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
