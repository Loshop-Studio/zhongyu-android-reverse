package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.strategy.C0947l;
import anet.channel.strategy.utils.C0953c;
import anet.channel.strategy.utils.SerialLruCache;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
class StrategyConfig implements Serializable {
    public static final String NO_RESULT = "No_Result";

    /* renamed from: a */
    private SerialLruCache<String, String> f5355a = null;

    /* renamed from: b */
    private Map<String, String> f5356b = null;

    /* renamed from: c */
    private transient StrategyInfoHolder f5357c = null;

    StrategyConfig() {
    }

    /* renamed from: a */
    StrategyConfig m4571a() {
        StrategyConfig strategyConfig = new StrategyConfig();
        synchronized (this) {
            strategyConfig.f5355a = new SerialLruCache<>(this.f5355a, 256);
            strategyConfig.f5356b = new ConcurrentHashMap(this.f5356b);
            strategyConfig.f5357c = this.f5357c;
        }
        return strategyConfig;
    }

    /* renamed from: b */
    void m4576b() {
        if (this.f5355a == null) {
            this.f5355a = new SerialLruCache<>(256);
        }
        if (this.f5356b == null) {
            this.f5356b = new ConcurrentHashMap();
        }
    }

    /* renamed from: b */
    String m4575b(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this) {
            str2 = this.f5356b.get(str);
        }
        return str2;
    }

    /* renamed from: a */
    void m4573a(StrategyInfoHolder strategyInfoHolder) {
        this.f5357c = strategyInfoHolder;
    }

    /* renamed from: a */
    void m4574a(C0947l.d dVar) {
        if (dVar.f5433b == null) {
            return;
        }
        synchronized (this) {
            TreeMap treeMap = null;
            int i4 = 0;
            while (true) {
                C0947l.b[] bVarArr = dVar.f5433b;
                if (i4 >= bVarArr.length) {
                    break;
                }
                C0947l.b bVar = bVarArr[i4];
                if (bVar.f5427j) {
                    this.f5355a.remove(bVar.f5418a);
                } else if (bVar.f5421d != null) {
                    if (treeMap == null) {
                        treeMap = new TreeMap();
                    }
                    treeMap.put(bVar.f5418a, bVar.f5421d);
                } else {
                    if (!HttpConstant.HTTP.equalsIgnoreCase(bVar.f5420c) && !HttpConstant.HTTPS.equalsIgnoreCase(bVar.f5420c)) {
                        this.f5355a.put(bVar.f5418a, NO_RESULT);
                    } else {
                        this.f5355a.put(bVar.f5418a, bVar.f5420c);
                    }
                    if (!TextUtils.isEmpty(bVar.f5422e)) {
                        this.f5356b.put(bVar.f5418a, bVar.f5422e);
                    } else {
                        this.f5356b.remove(bVar.f5418a);
                    }
                }
                i4++;
            }
            if (treeMap != null) {
                for (Map.Entry entry : treeMap.entrySet()) {
                    String str = (String) entry.getValue();
                    if (this.f5355a.containsKey(str)) {
                        this.f5355a.put(entry.getKey(), this.f5355a.get(str));
                    } else {
                        this.f5355a.put(entry.getKey(), NO_RESULT);
                    }
                }
            }
        }
        if (ALog.isPrintLog(1)) {
            ALog.m4636d("awcn.StrategyConfig", "", null, "SchemeMap", this.f5355a.toString());
            ALog.m4636d("awcn.StrategyConfig", "", null, "UnitMap", this.f5356b.toString());
        }
    }

    /* renamed from: a */
    String m4572a(String str) {
        String str2;
        if (TextUtils.isEmpty(str) || !C0953c.m4632c(str)) {
            return null;
        }
        synchronized (this) {
            str2 = this.f5355a.get(str);
            if (str2 == null) {
                this.f5355a.put(str, NO_RESULT);
            }
        }
        if (str2 == null) {
            this.f5357c.m4586d().m4598a(str, false);
        } else if (NO_RESULT.equals(str2)) {
            return null;
        }
        return str2;
    }
}
