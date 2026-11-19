package com.efs.sdk.base.p020a.p035i;

import com.efs.sdk.base.p020a.p025d.C2921a;
import com.efs.sdk.base.p020a.p035i.C2967f;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.efs.sdk.base.a.i.g */
/* loaded from: classes2.dex */
public final class HandlerC2968g extends AbstractHandlerC2962a {

    /* renamed from: b */
    private ConcurrentHashMap<String, a> f1174b = new ConcurrentHashMap<>(10);

    /* renamed from: com.efs.sdk.base.a.i.g$a */
    public static class a {

        /* renamed from: a */
        String f1175a;

        /* renamed from: b */
        String f1176b;

        /* renamed from: c */
        String f1177c;

        /* renamed from: d */
        AtomicInteger f1178d = new AtomicInteger(0);

        public a(String str, String str2, String str3) {
            this.f1175a = str;
            this.f1176b = str2;
            this.f1177c = str3;
        }
    }

    /* renamed from: a */
    public final void m2239a(String str, String str2, String str3) {
        String str4 = str + "_" + str2 + "_" + str3.trim();
        if (!this.f1174b.containsKey(str4) || this.f1174b.get(str4) == null) {
            this.f1174b.putIfAbsent(str4, new a(str, str2, str3));
        }
        this.f1174b.get(str4).f1178d.incrementAndGet();
    }

    @Override // com.efs.sdk.base.p020a.p035i.AbstractHandlerC2962a
    /* renamed from: a */
    public final void mo2228a() {
        try {
            if (this.f1156a != null) {
                Iterator<Map.Entry<String, a>> it = this.f1174b.entrySet().iterator();
                while (it.hasNext()) {
                    a value = it.next().getValue();
                    int i4 = value.f1178d.get();
                    if (i4 > 0) {
                        C2921a c2921a = this.f1156a;
                        String str = value.f1175a;
                        String str2 = value.f1176b;
                        String str3 = value.f1177c;
                        C2963b c2963b = new C2963b("efs_core", "req_succ_rate", C2967f.a.f1173a.f1169a.f1163c);
                        c2963b.put("rep_code", str);
                        c2963b.put("px_code", str2);
                        c2963b.put("path", str3);
                        c2963b.put("cnt", Integer.valueOf(i4));
                        c2921a.m2133a(c2963b);
                        value.f1178d.addAndGet(i4 * (-1));
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
