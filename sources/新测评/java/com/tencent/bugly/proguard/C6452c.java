package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tencent.bugly.proguard.c */
/* loaded from: classes4.dex */
class C6452c {

    /* renamed from: a */
    protected HashMap<String, HashMap<String, byte[]>> f5596a = new HashMap<>();

    /* renamed from: b */
    protected HashMap<String, Object> f5597b = new HashMap<>();

    /* renamed from: e */
    private HashMap<String, Object> f5600e = new HashMap<>();

    /* renamed from: c */
    protected String f5598c = "GBK";

    /* renamed from: d */
    C6460k f5599d = new C6460k();

    /* renamed from: a */
    public void mo5139a(String str) {
        this.f5598c = str;
    }

    /* renamed from: a */
    public <T> void mo5140a(String str, T t10) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, UnsupportedEncodingException {
        if (str == null) {
            throw new IllegalArgumentException("put key can not is null");
        }
        if (t10 == null) {
            throw new IllegalArgumentException("put value can not is null");
        }
        if (t10 instanceof Set) {
            throw new IllegalArgumentException("can not support Set");
        }
        C6461l c6461l = new C6461l();
        c6461l.m5213a(this.f5598c);
        c6461l.m5218a(t10, 0);
        byte[] bArrM5229a = C6463n.m5229a(c6461l.f5629a);
        HashMap<String, byte[]> map = new HashMap<>(1);
        ArrayList arrayList = new ArrayList(1);
        m5138a((ArrayList<String>) arrayList, t10);
        map.put(C6402a.m4781a(arrayList), bArrM5229a);
        this.f5600e.remove(str);
        this.f5596a.put(str, map);
    }

    /* renamed from: a */
    private static void m5138a(ArrayList<String> arrayList, Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        while (true) {
            if (obj.getClass().isArray()) {
                if (obj.getClass().getComponentType().toString().equals("byte")) {
                    if (Array.getLength(obj) > 0) {
                        arrayList.add("java.util.List");
                        obj = Array.get(obj, 0);
                    } else {
                        arrayList.add("Array");
                        arrayList.add("?");
                        return;
                    }
                } else {
                    throw new IllegalArgumentException("only byte[] is supported");
                }
            } else if (!(obj instanceof Array)) {
                if (obj instanceof List) {
                    arrayList.add("java.util.List");
                    List list = (List) obj;
                    if (list.size() > 0) {
                        obj = list.get(0);
                    } else {
                        arrayList.add("?");
                        return;
                    }
                } else if (obj instanceof Map) {
                    arrayList.add("java.util.Map");
                    Map map = (Map) obj;
                    if (map.size() > 0) {
                        Object next = map.keySet().iterator().next();
                        obj = map.get(next);
                        arrayList.add(next.getClass().getName());
                    } else {
                        arrayList.add("?");
                        arrayList.add("?");
                        return;
                    }
                } else {
                    arrayList.add(obj.getClass().getName());
                    return;
                }
            } else {
                throw new IllegalArgumentException("can not support Array, please use List");
            }
        }
    }

    /* renamed from: a */
    public byte[] mo5142a() throws UnsupportedEncodingException {
        C6461l c6461l = new C6461l(0);
        c6461l.m5213a(this.f5598c);
        c6461l.m5221a((Map) this.f5596a, 0);
        return C6463n.m5229a(c6461l.f5629a);
    }

    /* renamed from: a */
    public void mo5141a(byte[] bArr) {
        this.f5599d.m5198a(bArr);
        this.f5599d.m5192a(this.f5598c);
        HashMap map = new HashMap(1);
        HashMap map2 = new HashMap(1);
        map2.put("", new byte[0]);
        map.put("", map2);
        this.f5596a = this.f5599d.m5196a((Map) map, 0, false);
    }
}
