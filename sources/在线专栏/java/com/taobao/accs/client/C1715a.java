package com.taobao.accs.client;

import android.text.TextUtils;
import com.taobao.accs.IAppReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.taobao.accs.client.a */
/* loaded from: classes.dex */
public class C1715a {

    /* renamed from: a */
    private final ConcurrentHashMap<String, HashSet<IAppReceiver>> f7514a;

    /* renamed from: com.taobao.accs.client.a$a */
    private static class a {

        /* renamed from: a */
        private static final C1715a f7515a = new C1715a();

        private a() {
        }
    }

    /* renamed from: a */
    public static C1715a m5837a() {
        return a.f7515a;
    }

    /* renamed from: b */
    public ArrayList<IAppReceiver> m5840b() {
        HashSet hashSet = new HashSet();
        Iterator<HashSet<IAppReceiver>> it = this.f7514a.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next());
        }
        return new ArrayList<>(hashSet);
    }

    private C1715a() {
        this.f7514a = new ConcurrentHashMap<>(2);
    }

    /* renamed from: a */
    public void m5839a(String str, IAppReceiver iAppReceiver) {
        if (iAppReceiver != null) {
            HashSet<IAppReceiver> hashSet = this.f7514a.get(str);
            if (hashSet == null) {
                hashSet = new HashSet<>();
                this.f7514a.put(str, hashSet);
            }
            if (hashSet.contains(iAppReceiver)) {
                return;
            }
            hashSet.add(iAppReceiver);
        }
    }

    /* renamed from: b */
    public void m5841b(String str) {
        try {
            this.f7514a.remove(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public ArrayList<IAppReceiver> m5838a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashSet<IAppReceiver> hashSet = this.f7514a.get(str);
        if (hashSet == null) {
            return new ArrayList<>();
        }
        return new ArrayList<>(hashSet);
    }
}
