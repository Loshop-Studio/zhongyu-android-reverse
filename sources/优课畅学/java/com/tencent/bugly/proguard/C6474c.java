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
class C6474c {

    /* renamed from: a */
    protected HashMap<String, HashMap<String, byte[]>> f4939a = new HashMap<>();

    /* renamed from: b */
    protected HashMap<String, Object> f4940b = new HashMap<>();

    /* renamed from: e */
    private HashMap<String, Object> f4943e = new HashMap<>();

    /* renamed from: c */
    protected String f4941c = "GBK";

    /* renamed from: d */
    C6482k f4942d = new C6482k();

    /* renamed from: a */
    public void mo4499a(String str) {
        this.f4941c = str;
    }

    /* renamed from: a */
    public <T> void mo4500a(String str, T t10) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, UnsupportedEncodingException {
        if (str == null) {
            throw new IllegalArgumentException("put key can not is null");
        }
        if (t10 == null) {
            throw new IllegalArgumentException("put value can not is null");
        }
        if (t10 instanceof Set) {
            throw new IllegalArgumentException("can not support Set");
        }
        C6483l c6483l = new C6483l();
        c6483l.m4573a(this.f4941c);
        c6483l.m4578a(t10, 0);
        byte[] bArrM4589a = C6485n.m4589a(c6483l.f4972a);
        HashMap<String, byte[]> map = new HashMap<>(1);
        ArrayList arrayList = new ArrayList(1);
        m4498a((ArrayList<String>) arrayList, t10);
        map.put(C6424a.m4141a(arrayList), bArrM4589a);
        this.f4943e.remove(str);
        this.f4939a.put(str, map);
    }

    /* renamed from: a */
    private static void m4498a(ArrayList<String> arrayList, Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
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
    public byte[] mo4502a() throws UnsupportedEncodingException {
        C6483l c6483l = new C6483l(0);
        c6483l.m4573a(this.f4941c);
        c6483l.m4581a((Map) this.f4939a, 0);
        return C6485n.m4589a(c6483l.f4972a);
    }

    /* renamed from: a */
    public void mo4501a(byte[] bArr) {
        this.f4942d.m4558a(bArr);
        this.f4942d.m4552a(this.f4941c);
        HashMap map = new HashMap(1);
        HashMap map2 = new HashMap(1);
        map2.put("", new byte[0]);
        map.put("", map2);
        this.f4939a = this.f4942d.m4556a((Map) map, 0, false);
    }
}
