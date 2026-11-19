package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.strategy.C5070l;
import anet.channel.strategy.utils.C5076c;
import anet.channel.strategy.utils.SerialLruCache;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
class StrategyConfig implements Serializable {
    public static final String NO_RESULT = "No_Result";

    /* renamed from: a */
    private SerialLruCache<String, String> f2633a = null;

    /* renamed from: b */
    private Map<String, String> f2634b = null;

    /* renamed from: c */
    private transient StrategyInfoHolder f2635c = null;

    /* renamed from: a */
    public StrategyConfig m2462a() {
        StrategyConfig strategyConfig = new StrategyConfig();
        synchronized (this) {
            strategyConfig.f2633a = new SerialLruCache<>(this.f2633a, 256);
            strategyConfig.f2634b = new ConcurrentHashMap(this.f2634b);
            strategyConfig.f2635c = this.f2635c;
        }
        return strategyConfig;
    }

    /* renamed from: b */
    public void m2467b() {
        if (this.f2633a == null) {
            this.f2633a = new SerialLruCache<>(256);
        }
        if (this.f2634b == null) {
            this.f2634b = new ConcurrentHashMap();
        }
    }

    /* renamed from: b */
    public String m2466b(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this) {
            str2 = this.f2634b.get(str);
        }
        return str2;
    }

    /* renamed from: a */
    public void m2464a(StrategyInfoHolder strategyInfoHolder) {
        this.f2635c = strategyInfoHolder;
    }

    /* renamed from: a */
    public void m2465a(C5070l.d dVar) {
        if (dVar.f2711b == null) {
            return;
        }
        synchronized (this) {
            int i10 = 0;
            TreeMap treeMap = null;
            while (true) {
                try {
                    C5070l.b[] bVarArr = dVar.f2711b;
                    if (i10 >= bVarArr.length) {
                        break;
                    }
                    C5070l.b bVar = bVarArr[i10];
                    if (bVar.f2705j) {
                        this.f2633a.remove(bVar.f2696a);
                    } else if (bVar.f2699d != null) {
                        if (treeMap == null) {
                            treeMap = new TreeMap();
                        }
                        treeMap.put(bVar.f2696a, bVar.f2699d);
                    } else {
                        if (!HttpConstant.HTTP.equalsIgnoreCase(bVar.f2698c) && !"https".equalsIgnoreCase(bVar.f2698c)) {
                            this.f2633a.put(bVar.f2696a, NO_RESULT);
                        } else {
                            this.f2633a.put(bVar.f2696a, bVar.f2698c);
                        }
                        if (!TextUtils.isEmpty(bVar.f2700e)) {
                            this.f2634b.put(bVar.f2696a, bVar.f2700e);
                        } else {
                            this.f2634b.remove(bVar.f2696a);
                        }
                    }
                    i10++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (treeMap != null) {
                for (Map.Entry entry : treeMap.entrySet()) {
                    String str = (String) entry.getValue();
                    if (this.f2633a.containsKey(str)) {
                        this.f2633a.put(entry.getKey(), this.f2633a.get(str));
                    } else {
                        this.f2633a.put(entry.getKey(), NO_RESULT);
                    }
                }
            }
        }
        if (ALog.isPrintLog(1)) {
            ALog.m2527d("awcn.StrategyConfig", "", null, "SchemeMap", this.f2633a.toString());
            ALog.m2527d("awcn.StrategyConfig", "", null, "UnitMap", this.f2634b.toString());
        }
    }

    /* renamed from: a */
    public String m2463a(String str) {
        String str2;
        if (TextUtils.isEmpty(str) || !C5076c.m2523c(str)) {
            return null;
        }
        synchronized (this) {
            try {
                str2 = this.f2633a.get(str);
                if (str2 == null) {
                    this.f2633a.put(str, NO_RESULT);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (str2 == null) {
            this.f2635c.m2477d().m2489a(str, false);
            return str2;
        }
        if (NO_RESULT.equals(str2)) {
            return null;
        }
        return str2;
    }
}
