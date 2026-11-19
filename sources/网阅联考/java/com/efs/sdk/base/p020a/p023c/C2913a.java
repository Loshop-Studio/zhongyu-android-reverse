package com.efs.sdk.base.p020a.p023c;

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
/* loaded from: classes2.dex */
public final class C2913a {

    /* renamed from: a */
    public String f1038a;

    /* renamed from: b */
    public String f1039b;

    /* renamed from: c */
    public Context f1040c;

    /* renamed from: h */
    public String f1045h;

    /* renamed from: m */
    public ILogEncryptAction f1050m;

    /* renamed from: d */
    public boolean f1041d = true;

    /* renamed from: e */
    public boolean f1042e = true;

    /* renamed from: f */
    public boolean f1043f = false;

    /* renamed from: p */
    private Boolean f1053p = null;

    /* renamed from: g */
    public boolean f1044g = false;

    /* renamed from: i */
    public boolean f1046i = false;

    /* renamed from: j */
    public long f1047j = 5000;

    /* renamed from: k */
    public long f1048k = 10000;

    /* renamed from: l */
    public long f1049l = 10000;

    /* renamed from: q */
    private Map<String, String> f1054q = new HashMap(5);

    /* renamed from: n */
    public ConcurrentHashMap<Integer, List<ValueCallback<Pair<Message, Message>>>> f1051n = new ConcurrentHashMap<>();

    /* renamed from: o */
    public List<IEfsReporterObserver> f1052o = new ArrayList(5);

    /* renamed from: a */
    public final Map<String, String> m2091a() {
        Map<String, String> map = this.f1054q;
        return map == null ? Collections.emptyMap() : map;
    }

    /* renamed from: a */
    public final void m2092a(Map<String, String> map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        HashMap map2 = new HashMap(this.f1054q);
        map2.putAll(map);
        this.f1054q = map2;
    }

    /* renamed from: a */
    public final List<ValueCallback<Pair<Message, Message>>> m2090a(int i4) {
        if (this.f1051n.containsKey(Integer.valueOf(i4)) && this.f1051n.get(Integer.valueOf(i4)) != null) {
            return this.f1051n.get(Integer.valueOf(i4));
        }
        return Collections.emptyList();
    }
}
