package com.efs.sdk.base.p035a.p050i;

import com.efs.sdk.base.p035a.p040d.C1293a;
import com.efs.sdk.base.p035a.p050i.C1339f;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.efs.sdk.base.a.i.g */
/* loaded from: classes.dex */
public final class HandlerC1340g extends AbstractHandlerC1334a {

    /* renamed from: b */
    private ConcurrentHashMap<String, a> f7144b = new ConcurrentHashMap<>(10);

    /* renamed from: com.efs.sdk.base.a.i.g$a */
    static class a {

        /* renamed from: a */
        String f7145a;

        /* renamed from: b */
        String f7146b;

        /* renamed from: c */
        String f7147c;

        /* renamed from: d */
        AtomicInteger f7148d = new AtomicInteger(0);

        a(String str, String str2, String str3) {
            this.f7145a = str;
            this.f7146b = str2;
            this.f7147c = str3;
        }
    }

    /* renamed from: a */
    final void m5598a(String str, String str2, String str3) {
        String str4 = str + "_" + str2 + "_" + str3.trim();
        if (!this.f7144b.containsKey(str4) || this.f7144b.get(str4) == null) {
            this.f7144b.putIfAbsent(str4, new a(str, str2, str3));
        }
        this.f7144b.get(str4).f7148d.incrementAndGet();
    }

    @Override // com.efs.sdk.base.p035a.p050i.AbstractHandlerC1334a
    /* renamed from: a */
    public final void mo5587a() {
        try {
            if (this.f7126a != null) {
                Iterator<Map.Entry<String, a>> it = this.f7144b.entrySet().iterator();
                while (it.hasNext()) {
                    a value = it.next().getValue();
                    int i4 = value.f7148d.get();
                    if (i4 > 0) {
                        C1293a c1293a = this.f7126a;
                        String str = value.f7145a;
                        String str2 = value.f7146b;
                        String str3 = value.f7147c;
                        C1335b c1335b = new C1335b("efs_core", "req_succ_rate", C1339f.a.f7143a.f7139a.f7133c);
                        c1335b.put("rep_code", str);
                        c1335b.put("px_code", str2);
                        c1335b.put("path", str3);
                        c1335b.put("cnt", Integer.valueOf(i4));
                        c1293a.m5492a(c1335b);
                        value.f7148d.addAndGet(i4 * (-1));
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
