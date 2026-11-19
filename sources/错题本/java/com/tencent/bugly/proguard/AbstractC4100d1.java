package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tencent.bugly.proguard.d1 */
/* loaded from: classes3.dex */
public abstract class AbstractC4100d1 {

    /* renamed from: a */
    protected HashMap<String, HashMap<String, byte[]>> f3803a = new HashMap<>();

    /* renamed from: b */
    protected HashMap<String, Object> f3804b = new HashMap<>();

    /* renamed from: e */
    private HashMap<String, Object> f3807e = new HashMap<>();

    /* renamed from: c */
    protected String f3805c = "GBK";

    /* renamed from: d */
    C4119k f3806d = new C4119k();

    /* renamed from: a */
    public void mo3237a(String str, Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, UnsupportedEncodingException {
        if (str == null) {
            throw new IllegalArgumentException("put key can not is null");
        }
        if (obj == null) {
            throw new IllegalArgumentException("put value can not is null");
        }
        if (obj instanceof Set) {
            throw new IllegalArgumentException("can not support Set");
        }
        C4121l c4121l = new C4121l();
        c4121l.m3309a(this.f3805c);
        c4121l.m3314a(obj, 0);
        byte[] bArrM3325a = C4125n.m3325a(c4121l.f3848a);
        HashMap<String, byte[]> map = new HashMap<>(1);
        ArrayList arrayList = new ArrayList(1);
        while (true) {
            if (obj.getClass().isArray()) {
                if (!obj.getClass().getComponentType().toString().equals("byte")) {
                    throw new IllegalArgumentException("only byte[] is supported");
                }
                if (Array.getLength(obj) <= 0) {
                    arrayList.add("Array");
                    arrayList.add("?");
                    break;
                } else {
                    arrayList.add("java.util.List");
                    obj = Array.get(obj, 0);
                }
            } else if (!(obj instanceof Array)) {
                if (!(obj instanceof List)) {
                    if (!(obj instanceof Map)) {
                        arrayList.add(obj.getClass().getName());
                        break;
                    }
                    arrayList.add("java.util.Map");
                    Map map2 = (Map) obj;
                    if (map2.size() <= 0) {
                        arrayList.add("?");
                        arrayList.add("?");
                        break;
                    } else {
                        Object next = map2.keySet().iterator().next();
                        obj = map2.get(next);
                        arrayList.add(next.getClass().getName());
                    }
                } else {
                    arrayList.add("java.util.List");
                    List list = (List) obj;
                    if (list.size() <= 0) {
                        arrayList.add("?");
                        break;
                    }
                    obj = list.get(0);
                }
            } else {
                throw new IllegalArgumentException("can not support Array, please use List");
            }
        }
        map.put(C4041a.m2880a(arrayList), bArrM3325a);
        this.f3807e.remove(str);
        this.f3803a.put(str, map);
    }

    /* renamed from: a */
    public void mo3238a(byte[] bArr) {
        this.f3806d.m3294a(bArr);
        this.f3806d.m3288a(this.f3805c);
        HashMap map = new HashMap(1);
        HashMap map2 = new HashMap(1);
        map2.put("", new byte[0]);
        map.put("", map2);
        this.f3803a = this.f3806d.m3292a((Map) map, 0, false);
    }
}
