package com.tendcloud.tenddata;

import anet.channel.strategy.dispatch.DispatchConstants;
import com.tendcloud.tenddata.C8022zz;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tendcloud.tenddata.dy */
/* loaded from: classes5.dex */
public class C7947dy {

    /* renamed from: a */
    private static volatile C7947dy f14803a;

    static {
        try {
            C7913cr.m11625a().register(m11819a());
        } catch (Throwable unused) {
        }
    }

    private C7947dy() {
    }

    /* renamed from: a */
    public static C7947dy m11819a() {
        if (f14803a == null) {
            synchronized (C7947dy.class) {
                try {
                    if (f14803a == null) {
                        f14803a = new C7947dy();
                    }
                } finally {
                }
            }
        }
        return f14803a;
    }

    public final void onTDEBEventIndustry(C8022zz.a aVar) {
        if (aVar != null) {
            try {
                HashMap<String, Object> map = aVar.paraMap;
                if (map != null && Integer.parseInt(String.valueOf(map.get("apiType"))) == 17) {
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
                }
            } catch (Throwable unused) {
            }
        }
    }
}
