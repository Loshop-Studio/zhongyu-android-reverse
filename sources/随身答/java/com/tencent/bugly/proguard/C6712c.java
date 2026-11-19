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
class C6712c {

    /* renamed from: a */
    protected HashMap<String, HashMap<String, byte[]>> f6173a = new HashMap<>();

    /* renamed from: b */
    protected HashMap<String, Object> f6174b = new HashMap<>();

    /* renamed from: e */
    private HashMap<String, Object> f6177e = new HashMap<>();

    /* renamed from: c */
    protected String f6175c = "GBK";

    /* renamed from: d */
    C6720k f6176d = new C6720k();

    /* renamed from: a */
    public void mo5318a(String str) {
        this.f6175c = str;
    }

    /* renamed from: a */
    public <T> void mo5319a(String str, T t9) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, UnsupportedEncodingException {
        if (str == null) {
            throw new IllegalArgumentException("put key can not is null");
        }
        if (t9 == null) {
            throw new IllegalArgumentException("put value can not is null");
        }
        if (t9 instanceof Set) {
            throw new IllegalArgumentException("can not support Set");
        }
        C6721l c6721l = new C6721l();
        c6721l.m5392a(this.f6175c);
        c6721l.m5397a(t9, 0);
        byte[] bArrM5408a = C6723n.m5408a(c6721l.f6206a);
        HashMap<String, byte[]> map = new HashMap<>(1);
        ArrayList arrayList = new ArrayList(1);
        m5317a((ArrayList<String>) arrayList, t9);
        map.put(C6662a.m4960a(arrayList), bArrM5408a);
        this.f6177e.remove(str);
        this.f6173a.put(str, map);
    }

    /* renamed from: a */
    private static void m5317a(ArrayList<String> arrayList, Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
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
    public byte[] mo5321a() throws UnsupportedEncodingException {
        C6721l c6721l = new C6721l(0);
        c6721l.m5392a(this.f6175c);
        c6721l.m5400a((Map) this.f6173a, 0);
        return C6723n.m5408a(c6721l.f6206a);
    }

    /* renamed from: a */
    public void mo5320a(byte[] bArr) {
        this.f6176d.m5377a(bArr);
        this.f6176d.m5371a(this.f6175c);
        HashMap map = new HashMap(1);
        HashMap map2 = new HashMap(1);
        map2.put("", new byte[0]);
        map.put("", map2);
        this.f6173a = this.f6176d.m5375a((Map) map, 0, false);
    }
}
