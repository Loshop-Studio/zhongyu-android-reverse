package anet.channel.strategy;

import anet.channel.util.HttpConstant;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: anet.channel.strategy.c */
/* loaded from: classes3.dex */
public class C5058c {

    /* renamed from: a */
    private final ConcurrentHashMap<String, String> f2659a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private boolean f2660b = true;

    /* renamed from: anet.channel.strategy.c$a */
    public static class a {

        /* renamed from: a */
        public static C5058c f2661a = new C5058c();

        private a() {
        }
    }

    /* renamed from: a */
    public void m2497a(boolean z10) {
        this.f2660b = z10;
    }

    /* renamed from: b */
    public void m2498b(String str) {
        this.f2659a.put(str, HttpConstant.HTTP);
    }

    /* renamed from: a */
    public String m2496a(String str) {
        if (!this.f2660b) {
            return null;
        }
        String str2 = this.f2659a.get(str);
        if (str2 != null) {
            return str2;
        }
        this.f2659a.put(str, "https");
        return "https";
    }
}
