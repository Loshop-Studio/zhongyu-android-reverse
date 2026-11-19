package com.taobao.accs;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AccsState {
    public static final String ALL = "all";
    public static final String BIND_APP_FROM_CACHE = "bfc";
    public static final String CONNECTION_CHANGE = "cc";
    public static final String LAST_MSG_RECEIVE_TIME = "lmrt";
    public static final String LAST_MSG_SEND_TIME = "lmst";
    public static final String RECENT_ERRORS = "re";
    public static final String SDK_VERSION = "sv";

    /* renamed from: a */
    private HashMap<String, C1702c> f7481a = new HashMap<>();

    /* renamed from: b */
    private long f7482b = -1;

    /* renamed from: c */
    private long f7483c = -1;

    /* renamed from: com.taobao.accs.AccsState$a */
    private static class C1700a {

        /* renamed from: a */
        private static final AccsState f7484a = new AccsState();

        private C1700a() {
        }
    }

    /* renamed from: com.taobao.accs.AccsState$b */
    private static class C1701b {

        /* renamed from: a */
        public long f7485a;

        /* renamed from: b */
        public String f7486b;

        /* renamed from: c */
        public String f7487c;

        public C1701b(long j4, String str, String str2) {
            this.f7485a = j4;
            this.f7486b = str;
            this.f7487c = str2;
        }

        /* renamed from: a */
        public JSONArray m5820a() {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(this.f7485a);
            jSONArray.put(this.f7486b);
            jSONArray.put(this.f7487c);
            return jSONArray;
        }
    }

    /* renamed from: com.taobao.accs.AccsState$c */
    private static class C1702c {
        public static final int MAX_HISTORY = 5;

        /* renamed from: a */
        private final HashMap<String, C1701b> f7488a;

        /* renamed from: b */
        private final HashMap<String, ArrayList<C1701b>> f7489b;

        private C1702c() {
            this.f7488a = new HashMap<>();
            this.f7489b = new HashMap<>();
        }

        /* renamed from: a */
        public void m5823a(String str, Object obj, long j4) {
            this.f7488a.put(str, new C1701b(j4, str, m5821a(obj)));
        }

        /* renamed from: b */
        public void m5826b(String str, Object obj, long j4) {
            ArrayList<C1701b> arrayList = this.f7489b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f7489b.put(str, arrayList);
            }
            arrayList.add(new C1701b(j4, str, m5821a(obj)));
            while (arrayList.size() > 5) {
                arrayList.remove(0);
            }
        }

        /* renamed from: a */
        private static String m5821a(Object obj) {
            return obj == null ? "null" : obj.toString();
        }

        /* renamed from: a */
        public boolean m5824a(String str) {
            return this.f7488a.containsKey(str) || this.f7489b.containsKey(str);
        }

        /* renamed from: a */
        public JSONArray m5822a() {
            JSONArray jSONArray = new JSONArray();
            Iterator it = new ArrayList(this.f7488a.values()).iterator();
            while (it.hasNext()) {
                jSONArray.put(((C1701b) it.next()).m5820a());
            }
            ArrayList arrayList = new ArrayList();
            Iterator<ArrayList<C1701b>> it2 = this.f7489b.values().iterator();
            while (it2.hasNext()) {
                arrayList.addAll(it2.next());
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                jSONArray.put(((C1701b) it3.next()).m5820a());
            }
            return jSONArray;
        }

        /* renamed from: b */
        public JSONArray m5825b(String str) {
            JSONArray jSONArray = new JSONArray();
            C1701b c1701b = this.f7488a.get(str);
            if (c1701b != null) {
                jSONArray.put(c1701b.m5820a());
            }
            ArrayList<C1701b> arrayList = this.f7489b.get(str);
            if (arrayList != null) {
                Iterator<C1701b> it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().m5820a());
                }
            }
            return jSONArray;
        }
    }

    protected AccsState() {
    }

    public static AccsState getInstance() {
        return C1700a.f7484a;
    }

    /* renamed from: a */
    public synchronized void m5815a(String str, Object obj) {
        m5810a(ALL).m5823a(str, obj, m5814b());
    }

    /* renamed from: b */
    public synchronized void m5817b(String str, Object obj) {
        m5810a(ALL).m5826b(str, obj, m5814b());
    }

    public synchronized String getState() {
        if (!m5812a(this.f7481a)) {
            return "{}";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", this.f7483c);
            Iterator it = new ArrayList(this.f7481a.entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                jSONObject.put((String) entry.getKey(), ((C1702c) entry.getValue()).m5822a());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject.toString();
    }

    public synchronized String getStateByKey(String str) {
        if (!m5813a(this.f7481a, str)) {
            return "{}";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", this.f7483c);
            Iterator it = new ArrayList(this.f7481a.entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((C1702c) entry.getValue()).m5824a(str)) {
                    jSONObject.put((String) entry.getKey(), ((C1702c) entry.getValue()).m5825b(str));
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public synchronized void m5816a(String str, String str2, Object obj) {
        m5810a(str).m5823a(str2, obj, m5814b());
    }

    /* renamed from: b */
    public synchronized void m5818b(String str, String str2, Object obj) {
        m5810a(str).m5826b(str2, obj, m5814b());
    }

    /* renamed from: a */
    private C1702c m5810a(String str) {
        C1702c c1702c = this.f7481a.get(str);
        if (c1702c != null) {
            return c1702c;
        }
        C1702c c1702c2 = new C1702c();
        this.f7481a.put(str, c1702c2);
        return c1702c2;
    }

    /* renamed from: b */
    private long m5814b() {
        m5811a();
        return SystemClock.elapsedRealtime() - this.f7482b;
    }

    /* renamed from: a */
    private void m5811a() {
        if (this.f7483c < 0 || this.f7482b < 0) {
            this.f7483c = System.currentTimeMillis();
            this.f7482b = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: a */
    private boolean m5812a(HashMap<String, C1702c> map) {
        return map.size() > 0;
    }

    /* renamed from: a */
    private boolean m5813a(HashMap<String, C1702c> map, String str) {
        Iterator it = new ArrayList(map.values()).iterator();
        while (it.hasNext()) {
            if (((C1702c) it.next()).m5824a(str)) {
                return true;
            }
        }
        return false;
    }
}
