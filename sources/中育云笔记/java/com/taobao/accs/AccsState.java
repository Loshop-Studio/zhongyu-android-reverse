package com.taobao.accs;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class AccsState {
    public static final String ALL = "all";
    public static final String BIND_APP_FROM_CACHE = "bfc";
    public static final String CONNECTION_CHANGE = "cc";
    public static final String LAST_MSG_RECEIVE_TIME = "lmrt";
    public static final String LAST_MSG_SEND_TIME = "lmst";
    public static final String RECENT_ERRORS = "re";
    public static final String SDK_VERSION = "sv";

    /* renamed from: a */
    private HashMap<String, C7599c> f12879a = new HashMap<>();

    /* renamed from: b */
    private long f12880b = -1;

    /* renamed from: c */
    private long f12881c = -1;

    /* renamed from: com.taobao.accs.AccsState$a */
    public static class C7597a {

        /* renamed from: a */
        private static final AccsState f12882a = new AccsState();

        private C7597a() {
        }
    }

    /* renamed from: com.taobao.accs.AccsState$b */
    public static class C7598b {

        /* renamed from: a */
        public long f12883a;

        /* renamed from: b */
        public String f12884b;

        /* renamed from: c */
        public String f12885c;

        public C7598b(long j10, String str, String str2) {
            this.f12883a = j10;
            this.f12884b = str;
            this.f12885c = str2;
        }

        /* renamed from: a */
        public JSONArray m9846a() {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(this.f12883a);
            jSONArray.put(this.f12884b);
            jSONArray.put(this.f12885c);
            return jSONArray;
        }
    }

    /* renamed from: com.taobao.accs.AccsState$c */
    public static class C7599c {
        public static final int MAX_HISTORY = 5;

        /* renamed from: a */
        private final HashMap<String, C7598b> f12886a;

        /* renamed from: b */
        private final HashMap<String, ArrayList<C7598b>> f12887b;

        private C7599c() {
            this.f12886a = new HashMap<>();
            this.f12887b = new HashMap<>();
        }

        /* renamed from: a */
        public void m9849a(String str, Object obj, long j10) {
            this.f12886a.put(str, new C7598b(j10, str, m9847a(obj)));
        }

        /* renamed from: b */
        public void m9852b(String str, Object obj, long j10) {
            ArrayList<C7598b> arrayList = this.f12887b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f12887b.put(str, arrayList);
            }
            arrayList.add(new C7598b(j10, str, m9847a(obj)));
            while (arrayList.size() > 5) {
                arrayList.remove(0);
            }
        }

        /* renamed from: a */
        private static String m9847a(Object obj) {
            return obj == null ? "null" : obj.toString();
        }

        /* renamed from: a */
        public boolean m9850a(String str) {
            return this.f12886a.containsKey(str) || this.f12887b.containsKey(str);
        }

        /* renamed from: a */
        public JSONArray m9848a() {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = new ArrayList(this.f12886a.values());
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                jSONArray.put(((C7598b) obj).m9846a());
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator<ArrayList<C7598b>> it = this.f12887b.values().iterator();
            while (it.hasNext()) {
                arrayList2.addAll(it.next());
            }
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                jSONArray.put(((C7598b) obj2).m9846a());
            }
            return jSONArray;
        }

        /* renamed from: b */
        public JSONArray m9851b(String str) {
            JSONArray jSONArray = new JSONArray();
            C7598b c7598b = this.f12886a.get(str);
            if (c7598b != null) {
                jSONArray.put(c7598b.m9846a());
            }
            ArrayList<C7598b> arrayList = this.f12887b.get(str);
            if (arrayList != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    C7598b c7598b2 = arrayList.get(i10);
                    i10++;
                    jSONArray.put(c7598b2.m9846a());
                }
            }
            return jSONArray;
        }
    }

    public static AccsState getInstance() {
        return C7597a.f12882a;
    }

    /* renamed from: a */
    public synchronized void m9841a(String str, Object obj) {
        m9836a(ALL).m9849a(str, obj, m9840b());
    }

    /* renamed from: b */
    public synchronized void m9843b(String str, Object obj) {
        m9836a(ALL).m9852b(str, obj, m9840b());
    }

    public synchronized String getState() {
        if (!m9838a(this.f12879a)) {
            return "{}";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", this.f12881c);
            ArrayList arrayList = new ArrayList(this.f12879a.entrySet());
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                Map.Entry entry = (Map.Entry) obj;
                jSONObject.put((String) entry.getKey(), ((C7599c) entry.getValue()).m9848a());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject.toString();
    }

    public synchronized String getStateByKey(String str) {
        if (!m9839a(this.f12879a, str)) {
            return "{}";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", this.f12881c);
            ArrayList arrayList = new ArrayList(this.f12879a.entrySet());
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                Map.Entry entry = (Map.Entry) obj;
                if (((C7599c) entry.getValue()).m9850a(str)) {
                    jSONObject.put((String) entry.getKey(), ((C7599c) entry.getValue()).m9851b(str));
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public synchronized void m9842a(String str, String str2, Object obj) {
        m9836a(str).m9849a(str2, obj, m9840b());
    }

    /* renamed from: b */
    public synchronized void m9844b(String str, String str2, Object obj) {
        m9836a(str).m9852b(str2, obj, m9840b());
    }

    /* renamed from: a */
    private C7599c m9836a(String str) {
        C7599c c7599c = this.f12879a.get(str);
        if (c7599c != null) {
            return c7599c;
        }
        C7599c c7599c2 = new C7599c();
        this.f12879a.put(str, c7599c2);
        return c7599c2;
    }

    /* renamed from: b */
    private long m9840b() {
        m9837a();
        return SystemClock.elapsedRealtime() - this.f12880b;
    }

    /* renamed from: a */
    private void m9837a() {
        if (this.f12881c < 0 || this.f12880b < 0) {
            this.f12881c = System.currentTimeMillis();
            this.f12880b = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: a */
    private boolean m9838a(HashMap<String, C7599c> map) {
        return map.size() > 0;
    }

    /* renamed from: a */
    private boolean m9839a(HashMap<String, C7599c> map, String str) {
        ArrayList arrayList = new ArrayList(map.values());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((C7599c) obj).m9850a(str)) {
                return true;
            }
        }
        return false;
    }
}
