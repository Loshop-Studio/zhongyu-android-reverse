package com.tencent.smtt.utils;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.smtt.utils.z */
/* loaded from: classes4.dex */
public class C6869z {

    /* renamed from: a */
    private b f7032a = null;

    /* renamed from: b */
    private b f7033b = null;

    /* renamed from: com.tencent.smtt.utils.z$a */
    public class a {

        /* renamed from: b */
        private String f7035b;

        /* renamed from: c */
        private long f7036c;

        /* renamed from: d */
        private long f7037d;

        public a(String str, long j10, long j11) {
            this.f7035b = str;
            this.f7036c = j10;
            this.f7037d = j11;
        }

        /* renamed from: a */
        public long m6406a() {
            return this.f7036c;
        }

        /* renamed from: b */
        public long m6407b() {
            return this.f7037d;
        }
    }

    /* renamed from: com.tencent.smtt.utils.z$b */
    public class b {

        /* renamed from: b */
        private Map<String, a> f7039b;

        public b(File file) {
            HashMap map = new HashMap();
            this.f7039b = map;
            map.clear();
            m6408a(file);
        }

        /* renamed from: a */
        public Map<String, a> m6410a() {
            return this.f7039b;
        }

        /* renamed from: a */
        private void m6408a(File file) {
            if (!file.isDirectory()) {
                if (file.isFile()) {
                    m6409a(file.getName(), file.length(), file.lastModified());
                }
            } else {
                for (File file2 : file.listFiles()) {
                    m6408a(file2);
                }
            }
        }

        /* renamed from: a */
        private void m6409a(String str, long j10, long j11) {
            if (str == null || str.length() <= 0 || j10 <= 0 || j11 <= 0) {
                return;
            }
            a aVar = C6869z.this.new a(str, j10, j11);
            if (this.f7039b.containsKey(str)) {
                return;
            }
            this.f7039b.put(str, aVar);
        }
    }

    /* renamed from: a */
    public void m6403a(File file) {
        this.f7032a = new b(file);
    }

    /* renamed from: b */
    public void m6405b(File file) {
        this.f7033b = new b(file);
    }

    /* renamed from: a */
    public boolean m6404a() {
        b bVar = this.f7033b;
        return bVar != null && this.f7032a != null && bVar.m6410a().size() == this.f7032a.m6410a().size() && m6402a(this.f7032a, this.f7033b);
    }

    /* renamed from: a */
    private boolean m6402a(b bVar, b bVar2) {
        if (bVar == null || bVar.m6410a() == null || bVar2 == null || bVar2.m6410a() == null) {
            return false;
        }
        Map<String, a> mapM6410a = bVar.m6410a();
        Map<String, a> mapM6410a2 = bVar2.m6410a();
        for (Map.Entry<String, a> entry : mapM6410a.entrySet()) {
            String key = entry.getKey();
            a value = entry.getValue();
            if (mapM6410a2.containsKey(key)) {
                a aVar = mapM6410a2.get(key);
                if (value.m6406a() != aVar.m6406a() || value.m6407b() != aVar.m6407b()) {
                }
            }
            return false;
        }
        return true;
    }
}
