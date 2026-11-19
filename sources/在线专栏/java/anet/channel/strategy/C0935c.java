package anet.channel.strategy;

import anet.channel.util.HttpConstant;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: anet.channel.strategy.c */
/* loaded from: classes.dex */
public class C0935c {

    /* renamed from: a */
    private final ConcurrentHashMap<String, String> f5381a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private boolean f5382b = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: anet.channel.strategy.c$a */
    public static class a {

        /* renamed from: a */
        public static C0935c f5383a = new C0935c();

        private a() {
        }
    }

    /* renamed from: a */
    public void m4606a(boolean z3) {
        this.f5382b = z3;
    }

    /* renamed from: b */
    public void m4607b(String str) {
        this.f5381a.put(str, HttpConstant.HTTP);
    }

    /* renamed from: a */
    public String m4605a(String str) {
        if (!this.f5382b) {
            return null;
        }
        String str2 = this.f5381a.get(str);
        if (str2 != null) {
            return str2;
        }
        this.f5381a.put(str, HttpConstant.HTTPS);
        return HttpConstant.HTTPS;
    }
}
