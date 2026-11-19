package com.tendcloud.tenddata;

import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tendcloud.tenddata.C8022zz;
import java.util.HashMap;
import java.util.TreeMap;

/* renamed from: com.tendcloud.tenddata.ec */
/* loaded from: classes5.dex */
public class C7952ec {

    /* renamed from: a */
    private static volatile C7952ec f14825a;

    /* renamed from: b */
    private HashMap<String, Object> f14826b = new HashMap<>();

    /* renamed from: com.tendcloud.tenddata.ec$a */
    public final class a {
        private String pageName;
        private String refer;
        private long startTime;

        private String getPageName() {
            return this.pageName;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String getRefer() {
            return this.refer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getStartTime() {
            return this.startTime;
        }

        public String toString() {
            return "pageName: " + this.pageName + "\nfrom: " + this.refer + "\nstartTime: " + this.startTime;
        }

        private a(long j10, String str, String str2) {
            this.startTime = j10;
            this.refer = str;
            this.pageName = str2;
        }
    }

    static {
        try {
            C7913cr.m11625a().register(m11852a());
        } catch (Throwable unused) {
        }
    }

    private C7952ec() {
    }

    /* renamed from: a */
    public static C7952ec m11852a() {
        if (f14825a == null) {
            synchronized (C7955ef.class) {
                try {
                    if (f14825a == null) {
                        f14825a = new C7952ec();
                    }
                } finally {
                }
            }
        }
        return f14825a;
    }

    public final void onTDEBEventPage(C8022zz.a aVar) {
        if (aVar != null) {
            try {
                HashMap<String, Object> map = aVar.paraMap;
                if (map == null) {
                    return;
                }
                int i10 = Integer.parseInt(String.valueOf(map.get("apiType")));
                if ((i10 == 4 || i10 == 5) && !String.valueOf(aVar.paraMap.get("occurTime")).trim().isEmpty()) {
                    m11855a(aVar.paraMap);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private void m11855a(HashMap<String, Object> map) {
        try {
            int i10 = Integer.parseInt(String.valueOf(map.get("apiType")));
            AbstractC7841a abstractC7841a = (AbstractC7841a) map.get("service");
            if (i10 != 4) {
                if (i10 != 5) {
                    return;
                }
                m11854a(String.valueOf(map.get("pageName")), abstractC7841a);
            } else {
                String strM11391d = C7843ab.f14275J;
                if (strM11391d == null) {
                    strM11391d = C7897cb.m11391d();
                }
                m11853a(Long.parseLong(String.valueOf(map.get("occurTime"))), String.valueOf(map.get("pageName")), strM11391d, abstractC7841a);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033 A[Catch: all -> 0x000b, TryCatch #0 {all -> 0x000b, blocks: (B:7:0x0012, B:9:0x0018, B:12:0x0047, B:10:0x0033), top: B:18:0x0012 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m11853a(long r9, java.lang.String r11, java.lang.String r12, com.tendcloud.tenddata.AbstractC7841a r13) {
        /*
            r8 = this;
            r0 = 1
            com.tendcloud.tenddata.C8022zz.f15142c = r0
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r8.f14826b
            boolean r0 = r0.containsKey(r11)
            if (r0 == 0) goto Le
        Lb:
            r2 = r8
            goto L9c
        Le:
            java.lang.String r0 = "onPageBegin being called!  pagename: "
            if (r12 == 0) goto L33
            boolean r1 = r12.isEmpty()     // Catch: java.lang.Throwable -> Lb
            if (r1 != 0) goto L33
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb
            r1.<init>()     // Catch: java.lang.Throwable -> Lb
            r1.append(r0)     // Catch: java.lang.Throwable -> Lb
            r1.append(r11)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = ", refer: "
            r1.append(r0)     // Catch: java.lang.Throwable -> Lb
            r1.append(r12)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> Lb
            com.tendcloud.tenddata.C7896ca.iForDeveloper(r0)     // Catch: java.lang.Throwable -> Lb
            goto L45
        L33:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb
            r1.<init>()     // Catch: java.lang.Throwable -> Lb
            r1.append(r0)     // Catch: java.lang.Throwable -> Lb
            r1.append(r11)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> Lb
            com.tendcloud.tenddata.C7896ca.iForDeveloper(r0)     // Catch: java.lang.Throwable -> Lb
        L45:
            if (r11 == 0) goto Lb
            com.tendcloud.tenddata.ec$a r1 = new com.tendcloud.tenddata.ec$a     // Catch: java.lang.Throwable -> Lb
            r7 = 0
            r2 = r8
            r3 = r9
            r6 = r11
            r5 = r12
            r1.<init>(r3, r5, r6)     // Catch: java.lang.Throwable -> L9c
            java.util.HashMap<java.lang.String, java.lang.Object> r9 = r2.f14826b     // Catch: java.lang.Throwable -> L9c
            r9.put(r6, r1)     // Catch: java.lang.Throwable -> L9c
            com.tendcloud.tenddata.el r9 = new com.tendcloud.tenddata.el     // Catch: java.lang.Throwable -> L9c
            r9.<init>()     // Catch: java.lang.Throwable -> L9c
            java.lang.String r10 = "page"
            r9.f14869b = r10     // Catch: java.lang.Throwable -> L9c
            java.lang.String r10 = "enter"
            r9.f14870c = r10     // Catch: java.lang.Throwable -> L9c
            java.util.TreeMap r10 = new java.util.TreeMap     // Catch: java.lang.Throwable -> L9c
            r10.<init>()     // Catch: java.lang.Throwable -> L9c
            java.lang.String r11 = "startTime"
            long r3 = com.tendcloud.tenddata.C7952ec.a.access$100(r1)     // Catch: java.lang.Throwable -> L9c
            java.lang.Long r12 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L9c
            r10.put(r11, r12)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r11 = "duration"
            r12 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L9c
            r10.put(r11, r12)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r11 = "name"
            java.lang.String r12 = com.tendcloud.tenddata.C7952ec.a.access$200(r1)     // Catch: java.lang.Throwable -> L9c
            r10.put(r11, r12)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r11 = "from"
            java.lang.String r12 = com.tendcloud.tenddata.C7952ec.a.access$300(r1)     // Catch: java.lang.Throwable -> L9c
            r10.put(r11, r12)     // Catch: java.lang.Throwable -> L9c
            r9.f14871d = r10     // Catch: java.lang.Throwable -> L9c
            r9.f14868a = r13     // Catch: java.lang.Throwable -> L9c
            com.tendcloud.tenddata.cr r10 = com.tendcloud.tenddata.C7913cr.m11625a()     // Catch: java.lang.Throwable -> L9c
            r10.post(r9)     // Catch: java.lang.Throwable -> L9c
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tendcloud.tenddata.C7952ec.m11853a(long, java.lang.String, java.lang.String, com.tendcloud.tenddata.a):void");
    }

    /* renamed from: a */
    private final void m11854a(String str, AbstractC7841a abstractC7841a) {
        if (this.f14826b.containsKey(str)) {
            try {
                C7896ca.iForDeveloper("onPageEnd being called! pageName: " + str);
                a aVar = (a) this.f14826b.remove(str);
                if (aVar != null) {
                    C7961el c7961el = new C7961el();
                    c7961el.f14869b = "page";
                    c7961el.f14870c = "leave";
                    long jRound = Math.round((System.currentTimeMillis() - aVar.getStartTime()) / 1000.0d);
                    TreeMap treeMap = new TreeMap();
                    treeMap.put("startTime", Long.valueOf(aVar.getStartTime()));
                    treeMap.put(HintConstants.AUTOFILL_HINT_NAME, str);
                    treeMap.put(TypedValues.TransitionType.S_FROM, aVar.getRefer());
                    treeMap.put(TypedValues.TransitionType.S_DURATION, Long.valueOf(jRound));
                    c7961el.f14871d = treeMap;
                    c7961el.f14868a = abstractC7841a;
                    C7913cr.m11625a().post(c7961el);
                }
                if (C7843ab.f14274I) {
                    C7897cb.setLastActivity(str);
                }
                C7843ab.f14275J = str;
            } catch (Throwable unused) {
            }
        }
    }
}
