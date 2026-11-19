package com.efs.sdk.base.p039a.p042c;

import android.content.Context;
import android.os.Message;
import android.util.Pair;
import android.webkit.ValueCallback;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.work.WorkRequest;
import com.efs.sdk.base.observer.IEfsReporterObserver;
import com.efs.sdk.base.processor.action.ILogEncryptAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.efs.sdk.base.a.c.a */
/* loaded from: classes3.dex */
public final class C5653a {

    /* renamed from: a */
    public String f4642a;

    /* renamed from: b */
    public String f4643b;

    /* renamed from: c */
    public Context f4644c;

    /* renamed from: h */
    public String f4649h;

    /* renamed from: m */
    public ILogEncryptAction f4654m;

    /* renamed from: d */
    public boolean f4645d = true;

    /* renamed from: e */
    public boolean f4646e = true;

    /* renamed from: f */
    public boolean f4647f = false;

    /* renamed from: p */
    private Boolean f4657p = null;

    /* renamed from: g */
    public boolean f4648g = false;

    /* renamed from: i */
    public boolean f4650i = false;

    /* renamed from: j */
    public long f4651j = CoroutineLiveDataKt.DEFAULT_TIMEOUT;

    /* renamed from: k */
    public long f4652k = WorkRequest.MIN_BACKOFF_MILLIS;

    /* renamed from: l */
    public long f4653l = WorkRequest.MIN_BACKOFF_MILLIS;

    /* renamed from: q */
    private Map<String, String> f4658q = new HashMap(5);

    /* renamed from: n */
    public ConcurrentHashMap<Integer, List<ValueCallback<Pair<Message, Message>>>> f4655n = new ConcurrentHashMap<>();

    /* renamed from: o */
    public List<IEfsReporterObserver> f4656o = new ArrayList(5);

    /* renamed from: a */
    public final Map<String, String> m4060a() {
        Map<String, String> map = this.f4658q;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    /* renamed from: a */
    public final void m4061a(Map<String, String> map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        HashMap map2 = new HashMap(this.f4658q);
        map2.putAll(map);
        this.f4658q = map2;
    }

    /* renamed from: a */
    public final List<ValueCallback<Pair<Message, Message>>> m4059a(int i9) {
        if (this.f4655n.containsKey(Integer.valueOf(i9)) && this.f4655n.get(Integer.valueOf(i9)) != null) {
            return this.f4655n.get(Integer.valueOf(i9));
        }
        return Collections.EMPTY_LIST;
    }
}
