package com.efs.sdk.base.p035a.p038c;

import android.content.Context;
import android.os.Message;
import android.util.Pair;
import android.webkit.ValueCallback;
import com.efs.sdk.base.observer.IEfsReporterObserver;
import com.efs.sdk.base.processor.action.ILogEncryptAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.efs.sdk.base.a.c.a */
/* loaded from: classes.dex */
public final class C1285a {

    /* renamed from: a */
    public String f7008a;

    /* renamed from: b */
    public String f7009b;

    /* renamed from: c */
    public Context f7010c;

    /* renamed from: h */
    public String f7015h;

    /* renamed from: m */
    public ILogEncryptAction f7020m;

    /* renamed from: d */
    public boolean f7011d = true;

    /* renamed from: e */
    public boolean f7012e = true;

    /* renamed from: f */
    public boolean f7013f = false;

    /* renamed from: p */
    private Boolean f7023p = null;

    /* renamed from: g */
    public boolean f7014g = false;

    /* renamed from: i */
    public boolean f7016i = false;

    /* renamed from: j */
    public long f7017j = 5000;

    /* renamed from: k */
    public long f7018k = 10000;

    /* renamed from: l */
    public long f7019l = 10000;

    /* renamed from: q */
    private Map<String, String> f7024q = new HashMap(5);

    /* renamed from: n */
    public ConcurrentHashMap<Integer, List<ValueCallback<Pair<Message, Message>>>> f7021n = new ConcurrentHashMap<>();

    /* renamed from: o */
    public List<IEfsReporterObserver> f7022o = new ArrayList(5);

    /* renamed from: a */
    public final Map<String, String> m5450a() {
        Map<String, String> map = this.f7024q;
        return map == null ? Collections.emptyMap() : map;
    }

    /* renamed from: a */
    public final void m5451a(Map<String, String> map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        HashMap map2 = new HashMap(this.f7024q);
        map2.putAll(map);
        this.f7024q = map2;
    }

    /* renamed from: a */
    public final List<ValueCallback<Pair<Message, Message>>> m5449a(int i4) {
        if (this.f7021n.containsKey(Integer.valueOf(i4)) && this.f7021n.get(Integer.valueOf(i4)) != null) {
            return this.f7021n.get(Integer.valueOf(i4));
        }
        return Collections.emptyList();
    }
}
