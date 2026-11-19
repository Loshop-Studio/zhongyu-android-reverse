package com.efs.sdk.base.p039a.p054i;

import com.efs.sdk.base.p039a.p044d.C5661a;
import com.efs.sdk.base.p039a.p054i.C5707f;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.efs.sdk.base.a.i.g */
/* loaded from: classes3.dex */
public final class HandlerC5708g extends AbstractHandlerC5702a {

    /* renamed from: b */
    private ConcurrentHashMap<String, a> f4778b = new ConcurrentHashMap<>(10);

    /* renamed from: com.efs.sdk.base.a.i.g$a */
    public static class a {

        /* renamed from: a */
        String f4779a;

        /* renamed from: b */
        String f4780b;

        /* renamed from: c */
        String f4781c;

        /* renamed from: d */
        AtomicInteger f4782d = new AtomicInteger(0);

        public a(String str, String str2, String str3) {
            this.f4779a = str;
            this.f4780b = str2;
            this.f4781c = str3;
        }
    }

    /* renamed from: a */
    public final void m4208a(String str, String str2, String str3) {
        String str4 = str + "_" + str2 + "_" + str3.trim();
        if (!this.f4778b.containsKey(str4) || this.f4778b.get(str4) == null) {
            this.f4778b.putIfAbsent(str4, new a(str, str2, str3));
        }
        this.f4778b.get(str4).f4782d.incrementAndGet();
    }

    @Override // com.efs.sdk.base.p039a.p054i.AbstractHandlerC5702a
    /* renamed from: a */
    public final void mo4197a() {
        try {
            if (this.f4760a != null) {
                Iterator<Map.Entry<String, a>> it = this.f4778b.entrySet().iterator();
                while (it.hasNext()) {
                    a value = it.next().getValue();
                    int i9 = value.f4782d.get();
                    if (i9 > 0) {
                        C5661a c5661a = this.f4760a;
                        String str = value.f4779a;
                        String str2 = value.f4780b;
                        String str3 = value.f4781c;
                        C5703b c5703b = new C5703b("efs_core", "req_succ_rate", C5707f.a.f4777a.f4773a.f4767c);
                        c5703b.put("rep_code", str);
                        c5703b.put("px_code", str2);
                        c5703b.put("path", str3);
                        c5703b.put("cnt", Integer.valueOf(i9));
                        c5661a.m4102a(c5703b);
                        value.f4782d.addAndGet(i9 * (-1));
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
