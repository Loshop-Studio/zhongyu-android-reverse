package com.taobao.accs.client;

import android.text.TextUtils;
import com.taobao.accs.IAppReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.taobao.accs.client.a */
/* loaded from: classes5.dex */
public class C7612a {

    /* renamed from: a */
    private final ConcurrentHashMap<String, HashSet<IAppReceiver>> f12912a;

    /* renamed from: com.taobao.accs.client.a$a */
    public static class a {

        /* renamed from: a */
        private static final C7612a f12913a = new C7612a();

        private a() {
        }
    }

    /* renamed from: a */
    public static C7612a m9863a() {
        return a.f12913a;
    }

    /* renamed from: b */
    public ArrayList<IAppReceiver> m9866b() {
        HashSet hashSet = new HashSet();
        Iterator<HashSet<IAppReceiver>> it = this.f12912a.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next());
        }
        return new ArrayList<>(hashSet);
    }

    private C7612a() {
        this.f12912a = new ConcurrentHashMap<>(2);
    }

    /* renamed from: a */
    public void m9865a(String str, IAppReceiver iAppReceiver) {
        if (iAppReceiver != null) {
            HashSet<IAppReceiver> hashSet = this.f12912a.get(str);
            if (hashSet == null) {
                hashSet = new HashSet<>();
                this.f12912a.put(str, hashSet);
            }
            if (hashSet.contains(iAppReceiver)) {
                return;
            }
            hashSet.add(iAppReceiver);
        }
    }

    /* renamed from: b */
    public void m9867b(String str) {
        try {
            this.f12912a.remove(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public ArrayList<IAppReceiver> m9864a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashSet<IAppReceiver> hashSet = this.f12912a.get(str);
        if (hashSet == null) {
            return new ArrayList<>();
        }
        return new ArrayList<>(hashSet);
    }
}
