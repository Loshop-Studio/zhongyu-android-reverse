package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tencent.bugly.proguard.c */
/* loaded from: classes5.dex */
public abstract class AbstractC7817c {

    /* renamed from: a */
    protected HashMap<String, HashMap<String, byte[]>> f14038a = new HashMap<>();

    /* renamed from: b */
    protected HashMap<String, Object> f14039b = new HashMap<>();

    /* renamed from: e */
    private HashMap<String, Object> f14042e = new HashMap<>();

    /* renamed from: c */
    protected String f14040c = "GBK";

    /* renamed from: d */
    C7825k f14041d = new C7825k();

    /* renamed from: b */
    public static void m10828b(ArrayList arrayList, Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        while (true) {
            if (obj.getClass().isArray()) {
                if (!obj.getClass().getComponentType().toString().equals("byte")) {
                    throw new IllegalArgumentException("only byte[] is supported");
                }
                if (Array.getLength(obj) <= 0) {
                    arrayList.add("Array");
                    arrayList.add("?");
                    return;
                } else {
                    arrayList.add("java.util.List");
                    obj = Array.get(obj, 0);
                }
            } else {
                if (obj instanceof Array) {
                    throw new IllegalArgumentException("can not support Array, please use List");
                }
                if (obj instanceof List) {
                    arrayList.add("java.util.List");
                    List list = (List) obj;
                    if (list.size() <= 0) {
                        arrayList.add("?");
                        return;
                    }
                    obj = list.get(0);
                } else {
                    if (!(obj instanceof Map)) {
                        arrayList.add(obj.getClass().getName());
                        return;
                    }
                    arrayList.add("java.util.Map");
                    Map map = (Map) obj;
                    if (map.size() <= 0) {
                        arrayList.add("?");
                        arrayList.add("?");
                        return;
                    } else {
                        Object next = map.keySet().iterator().next();
                        obj = map.get(next);
                        arrayList.add(next.getClass().getName());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo10829a(String str) {
        this.f14040c = str;
    }

    /* renamed from: a */
    public void mo10830a(String str, Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, UnsupportedEncodingException {
        if (str == null) {
            throw new IllegalArgumentException("put key can not is null");
        }
        if (obj == null) {
            throw new IllegalArgumentException("put value can not is null");
        }
        if (obj instanceof Set) {
            throw new IllegalArgumentException("can not support Set");
        }
        C7826l c7826l = new C7826l();
        c7826l.m10903a(this.f14040c);
        c7826l.m10908a(obj, 0);
        byte[] bArrM10919a = C7828n.m10919a(c7826l.f14071a);
        HashMap<String, byte[]> map = new HashMap<>(1);
        ArrayList arrayList = new ArrayList(1);
        m10828b(arrayList, obj);
        map.put(C7767a.m10471a(arrayList), bArrM10919a);
        this.f14042e.remove(str);
        this.f14038a.put(str, map);
    }

    /* renamed from: a */
    public byte[] mo10832a() throws UnsupportedEncodingException {
        C7826l c7826l = new C7826l(0);
        c7826l.m10903a(this.f14040c);
        c7826l.m10911a((Map) this.f14038a, 0);
        return C7828n.m10919a(c7826l.f14071a);
    }

    /* renamed from: a */
    public void mo10831a(byte[] bArr) {
        this.f14041d.m10888a(bArr);
        this.f14041d.m10882a(this.f14040c);
        HashMap map = new HashMap(1);
        HashMap map2 = new HashMap(1);
        map2.put("", new byte[0]);
        map.put("", map2);
        this.f14038a = this.f14041d.m10886a((Map) map, 0, false);
    }
}
