package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tencent.bugly.proguard.c */
/* loaded from: classes3.dex */
class C5829c {

    /* renamed from: a */
    protected HashMap<String, HashMap<String, byte[]>> f4317a = new HashMap<>();

    /* renamed from: b */
    protected HashMap<String, Object> f4318b = new HashMap<>();

    /* renamed from: e */
    private HashMap<String, Object> f4321e = new HashMap<>();

    /* renamed from: c */
    protected String f4319c = "GBK";

    /* renamed from: d */
    C5837k f4320d = new C5837k();

    /* renamed from: a */
    public void mo4144a(String str) {
        this.f4319c = str;
    }

    /* renamed from: a */
    public <T> void mo4145a(String str, T t6) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, UnsupportedEncodingException {
        if (str == null) {
            throw new IllegalArgumentException("put key can not is null");
        }
        if (t6 == null) {
            throw new IllegalArgumentException("put value can not is null");
        }
        if (t6 instanceof Set) {
            throw new IllegalArgumentException("can not support Set");
        }
        C5838l c5838l = new C5838l();
        c5838l.m4218a(this.f4319c);
        c5838l.m4223a(t6, 0);
        byte[] bArrM4234a = C5840n.m4234a(c5838l.f4350a);
        HashMap<String, byte[]> map = new HashMap<>(1);
        ArrayList arrayList = new ArrayList(1);
        m4143a((ArrayList<String>) arrayList, t6);
        map.put(C5779a.m3786a(arrayList), bArrM4234a);
        this.f4321e.remove(str);
        this.f4317a.put(str, map);
    }

    /* renamed from: a */
    private static void m4143a(ArrayList<String> arrayList, Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
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
    public byte[] mo4147a() throws UnsupportedEncodingException {
        C5838l c5838l = new C5838l(0);
        c5838l.m4218a(this.f4319c);
        c5838l.m4226a((Map) this.f4317a, 0);
        return C5840n.m4234a(c5838l.f4350a);
    }

    /* renamed from: a */
    public void mo4146a(byte[] bArr) {
        this.f4320d.m4203a(bArr);
        this.f4320d.m4197a(this.f4319c);
        HashMap map = new HashMap(1);
        HashMap map2 = new HashMap(1);
        map2.put("", new byte[0]);
        map.put("", map2);
        this.f4317a = this.f4320d.m4201a((Map) map, 0, false);
    }
}
