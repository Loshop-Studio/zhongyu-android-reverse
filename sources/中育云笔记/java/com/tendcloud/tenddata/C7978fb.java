package com.tendcloud.tenddata;

import android.util.EventLogTags;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;
import org.json.JSONObject;

/* renamed from: com.tendcloud.tenddata.fb */
/* loaded from: classes5.dex */
public class C7978fb {

    /* renamed from: d */
    static byte[] f14920d;

    /* renamed from: a */
    static HashMap<String, String> f14917a = new HashMap<>();

    /* renamed from: b */
    static HashMap<String, String> f14918b = new HashMap<>();

    /* renamed from: c */
    static String f14919c = "utf-8";

    /* renamed from: e */
    private static volatile C7978fb f14921e = null;

    static {
        try {
            C7913cr.m11625a().register(m11946a());
        } catch (Throwable unused) {
        }
    }

    private C7978fb() {
        String strM11612c = C7912cq.m11612c(C7843ab.f14307g.getPackageName());
        if (C7843ab.f14307g == null || strM11612c == null) {
            f14920d = C7843ab.class.getSimpleName().getBytes();
        } else {
            f14920d = strM11612c.getBytes();
        }
    }

    /* renamed from: a */
    public TreeSet<C7979fc> m11947a(AbstractC7841a abstractC7841a) {
        int size;
        TreeSet treeSet = new TreeSet();
        TreeSet<C7979fc> treeSetM11969a = null;
        try {
            treeSetM11969a = C7980fd.m11960a().m11969a(abstractC7841a, 100, (String) null);
            if (treeSetM11969a != null && treeSetM11969a.size() > 0) {
                Iterator<C7979fc> it = treeSetM11969a.iterator();
                while (it.hasNext()) {
                    C7979fc next = it.next();
                    try {
                        next.writeData(C7912cq.m11610b(next.m11956c(), f14920d));
                    } catch (Throwable unused) {
                    }
                }
                treeSet.addAll(treeSetM11969a);
                treeSetM11969a.clear();
            }
            size = treeSetM11969a == null ? 0 : treeSetM11969a.size();
        } catch (Throwable unused2) {
        }
        synchronized (EventLogTags.class) {
            if (size < 100) {
                try {
                    TreeSet<C7979fc> treeSetM11969a2 = C7980fd.m11960a().m11969a(abstractC7841a, 100 - size, abstractC7841a.getRootFolder());
                    if (treeSetM11969a2 != null) {
                        try {
                            if (treeSetM11969a2.size() > 0) {
                                Iterator<C7979fc> it2 = treeSetM11969a2.iterator();
                                while (it2.hasNext()) {
                                    C7979fc next2 = it2.next();
                                    try {
                                        byte[] bArrM11690b = C7928df.m11690b(next2.m11956c());
                                        if (bArrM11690b != null && bArrM11690b.length != 0) {
                                            next2.writeData(bArrM11690b);
                                        }
                                    } catch (Throwable unused3) {
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                    treeSetM11969a = treeSetM11969a2;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (treeSet.size() > 0 && treeSetM11969a != null) {
                treeSetM11969a.addAll(treeSet);
            }
            return treeSetM11969a;
        }
    }

    public final synchronized void onTDEBEventDataStore(C7961el c7961el) {
        if (c7961el == null) {
            return;
        }
        try {
            if (c7961el.f14868a.getMessageFormat().equals(AbstractC7841a.MF_JSON)) {
                if (c7961el.f14868a == null) {
                    return;
                }
                C7984fh c7984fh = new C7984fh(c7961el.f14869b, c7961el.f14870c);
                c7984fh.setData(c7961el.f14871d);
                JSONObject jSONObjectM12014a = !c7961el.f14868a.name().equals("BG") ? C7999fw.m12011b().m12014a(c7984fh, true, c7961el.f14868a, c7961el.f14872e) : null;
                if (jSONObjectM12014a == null) {
                } else {
                    C7980fd.m11960a().m11970a(new C7979fc(C7928df.m11689a(jSONObjectM12014a.toString().getBytes())), c7961el);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void sendMessageFaild(AbstractC7841a abstractC7841a) {
        try {
            C7980fd.m11960a().clearDataCache(abstractC7841a);
        } catch (Throwable unused) {
        }
    }

    public void sendMessageSuccess(AbstractC7841a abstractC7841a) {
        try {
            C7980fd.m11960a().confirmRead(abstractC7841a);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static C7978fb m11946a() {
        if (f14921e == null) {
            synchronized (C7978fb.class) {
                try {
                    if (f14921e == null) {
                        f14921e = new C7978fb();
                    }
                } finally {
                }
            }
        }
        return f14921e;
    }
}
