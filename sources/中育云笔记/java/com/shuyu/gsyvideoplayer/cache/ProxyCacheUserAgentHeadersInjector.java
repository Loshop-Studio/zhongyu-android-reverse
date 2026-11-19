package com.shuyu.gsyvideoplayer.cache;

import com.shuyu.gsyvideoplayer.utils.Debuger;
import java.util.HashMap;
import java.util.Map;
import p354u1.InterfaceC11322b;

/* loaded from: classes5.dex */
public class ProxyCacheUserAgentHeadersInjector implements InterfaceC11322b {
    public static final Map<String, String> mMapHeadData = new HashMap();

    @Override // p354u1.InterfaceC11322b
    public Map<String, String> addHeaders(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("****** proxy addHeaders ****** ");
        Map<String, String> map = mMapHeadData;
        sb2.append(map.size());
        Debuger.printfLog(sb2.toString());
        return map;
    }
}
