package com.tendcloud.tenddata;

import androidx.camera.video.AudioStats;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.tendcloud.tenddata.do */
/* loaded from: classes5.dex */
public class C7937do {

    /* renamed from: a */
    private static int f14731a = 2;

    /* renamed from: b */
    private static int f14732b = 6;

    /* renamed from: c */
    private static int f14733c = 6;

    /* renamed from: d */
    private static int f14734d = -40;

    /* renamed from: e */
    private static int f14735e = 4;

    /* renamed from: f */
    private C7934dl f14736f;

    /* renamed from: com.tendcloud.tenddata.do$a */
    public class a {
        public C7936dn fp1;
        public C7936dn fp2;
        public double score;

        public a(C7936dn c7936dn, C7936dn c7936dn2, double d10) {
            this.fp1 = c7936dn;
            this.fp2 = c7936dn2;
            this.score = d10;
        }
    }

    /* renamed from: com.tendcloud.tenddata.do$b */
    public class b {
        public Object key;
        public Object value;

        public b(Object obj, Object obj2) {
            this.key = obj;
            this.value = obj2;
        }
    }

    public C7937do() {
        this(new C7934dl());
    }

    /* renamed from: a */
    public double m11742a(C7936dn c7936dn, C7936dn c7936dn2) {
        int i10 = 0;
        Map<String, C7933dk> mapM11737a = c7936dn.m11737a(false);
        Map<String, C7933dk> mapM11737a2 = c7936dn2.m11737a(false);
        HashSet hashSet = new HashSet();
        int iM11720c = 0;
        double d10 = AudioStats.AUDIO_AMPLITUDE_NONE;
        double dM11741a = AudioStats.AUDIO_AMPLITUDE_NONE;
        for (Map.Entry<String, C7933dk> entry : mapM11737a.entrySet()) {
            C7933dk value = entry.getValue();
            C7933dk c7933dk = mapM11737a2.get(entry.getKey());
            iM11720c += value.m11720c();
            if (c7933dk == null) {
                hashSet.add(value);
            } else {
                double dM11746b = m11746b(value.m11720c(), c7933dk.m11720c());
                d10 += dM11746b;
                dM11741a += dM11746b * m11741a(value.m11720c(), c7933dk.m11720c());
                i10++;
            }
        }
        if (i10 == 0) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        for (Map.Entry<String, C7933dk> entry2 : mapM11737a2.entrySet()) {
            iM11720c += entry2.getValue().m11720c();
            if (!mapM11737a.containsKey(entry2.getKey())) {
                hashSet.add(entry2.getValue());
            }
        }
        int iMax = Math.max(this.f14736f.m11727d(), (int) ((iM11720c / (c7936dn.m11739c().size() + c7936dn2.m11739c().size())) + 1.2d));
        Iterator it = hashSet.iterator();
        double d11 = 0.0d;
        while (it.hasNext()) {
            if (((C7933dk) it.next()).m11720c() > iMax) {
                d11 += 1.0d;
            }
        }
        return (dM11741a / d10) * (1.0d - Math.pow(d11 / ((i10 * 2) + d11), f14735e));
    }

    /* renamed from: b */
    public C7936dn m11747b(C7936dn c7936dn, C7936dn c7936dn2) {
        Map<String, C7933dk> mapM11737a = c7936dn.m11737a(false);
        Map<String, C7933dk> mapM11737a2 = c7936dn2.m11737a(false);
        TreeMap treeMap = new TreeMap();
        C7936dn c7936dn3 = new C7936dn();
        c7936dn3.setPoiId(c7936dn2.m11738b());
        c7936dn3.setTimestamp(c7936dn2.m11736a());
        LinkedList linkedList = new LinkedList();
        c7936dn3.setBsslist(linkedList);
        for (Map.Entry<String, C7933dk> entry : mapM11737a.entrySet()) {
            C7933dk value = entry.getValue();
            C7933dk c7933dk = mapM11737a2.get(entry.getKey());
            if (c7933dk == null) {
                double d10 = -value.m11720c();
                while (treeMap.containsKey(Double.valueOf(d10))) {
                    d10 += 1.0E-4d;
                }
                treeMap.put(Double.valueOf(d10), value);
            } else {
                linkedList.add(new C7933dk(c7933dk.m11718a(), c7933dk.m11719b(), (byte) ((c7933dk.m11720c() + value.m11720c()) / 2), c7933dk.m11721d(), c7933dk.m11722e()));
            }
        }
        for (Map.Entry<String, C7933dk> entry2 : mapM11737a2.entrySet()) {
            if (!mapM11737a.containsKey(entry2.getKey())) {
                double d11 = -entry2.getValue().m11720c();
                while (treeMap.containsKey(Double.valueOf(d11))) {
                    d11 += 1.0E-4d;
                }
                treeMap.put(Double.valueOf(d11), entry2.getValue());
            }
        }
        for (Map.Entry entry3 : treeMap.entrySet()) {
            byte b10 = (byte) (-((Double) entry3.getKey()).doubleValue());
            if (linkedList.size() >= this.f14736f.m11726c() || b10 < this.f14736f.m11727d()) {
                break;
            }
            linkedList.add(entry3.getValue());
        }
        return c7936dn3;
    }

    public C7937do(C7934dl c7934dl) {
        this.f14736f = c7934dl;
    }

    /* renamed from: a */
    public double m11743a(C7936dn c7936dn, List<C7936dn> list) {
        Iterator<C7936dn> it = list.iterator();
        double dMax = AudioStats.AUDIO_AMPLITUDE_NONE;
        while (it.hasNext()) {
            dMax = Math.max(m11742a(it.next(), c7936dn), dMax);
        }
        return dMax;
    }

    /* renamed from: a */
    public double m11744a(List<C7936dn> list, List<C7936dn> list2) {
        boolean zIsEmpty = list.isEmpty();
        double d10 = AudioStats.AUDIO_AMPLITUDE_NONE;
        if (zIsEmpty || list2.isEmpty()) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        LinkedList linkedList = new LinkedList();
        m11748b(list, list2, linkedList);
        int i10 = 0;
        for (a aVar : linkedList) {
            if (aVar.fp1 != null && aVar.fp2 != null) {
                d10 += aVar.score;
                i10++;
            }
        }
        return d10 / i10;
    }

    /* renamed from: a */
    public double m11745a(List<C7936dn> list, List<C7936dn> list2, List<C7936dn> list3) {
        C7936dn c7936dn;
        boolean zIsEmpty = list.isEmpty();
        double d10 = AudioStats.AUDIO_AMPLITUDE_NONE;
        if (!zIsEmpty && !list2.isEmpty()) {
            LinkedList linkedList = new LinkedList();
            m11748b(list, list2, linkedList);
            int i10 = 0;
            for (a aVar : linkedList) {
                C7936dn c7936dn2 = aVar.fp1;
                if (c7936dn2 != null && (c7936dn = aVar.fp2) != null) {
                    d10 += aVar.score;
                    i10++;
                    list3.add(m11747b(c7936dn2, c7936dn));
                } else if (list3.size() < this.f14736f.m11725b()) {
                    C7936dn c7936dn3 = aVar.fp1;
                    list3.add(c7936dn3 == null ? aVar.fp2.m11740d() : c7936dn3.m11740d());
                }
            }
            return d10 / i10;
        }
        list3.addAll(list);
        list3.addAll(list2);
        return AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* renamed from: b */
    public void m11748b(List<C7936dn> list, List<C7936dn> list2, List<a> list3) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C7936dn c7936dn : list) {
            for (C7936dn c7936dn2 : list2) {
                hashSet2.add(c7936dn2);
                arrayList.add(new a(c7936dn, c7936dn2, m11742a(c7936dn, c7936dn2)));
            }
            hashSet.add(c7936dn);
        }
        Collections.sort(arrayList, new Comparator<a>() { // from class: com.tendcloud.tenddata.do.1
            @Override // java.util.Comparator
            public int compare(a aVar, a aVar2) {
                double d10 = aVar.score;
                double d11 = aVar2.score;
                if (d10 == d11) {
                    return 0;
                }
                return d10 < d11 ? 1 : -1;
            }
        });
        list3.clear();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a aVar = (a) obj;
            if (hashSet.contains(aVar.fp1) && hashSet2.contains(aVar.fp2)) {
                hashSet.remove(aVar.fp1);
                hashSet2.remove(aVar.fp2);
                list3.add(aVar);
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            list3.add(new a((C7936dn) it.next(), null, AudioStats.AUDIO_AMPLITUDE_NONE));
        }
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            list3.add(new a(null, (C7936dn) it2.next(), AudioStats.AUDIO_AMPLITUDE_NONE));
        }
    }

    /* renamed from: a */
    public double m11741a(int i10, int i11) {
        double d10 = AudioStats.AUDIO_AMPLITUDE_NONE;
        if (i10 >= 0 || i11 >= 0) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        double d11 = (i11 + i10) / 2;
        double dAbs = Math.abs(i10 - d11);
        int i12 = f14731a;
        if (dAbs > i12) {
            d10 = dAbs - i12;
        }
        return Math.pow((d10 + d11) / d11, f14732b);
    }

    /* renamed from: b */
    public double m11746b(int i10, int i11) {
        if (i10 >= 0 || i11 >= 0) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        double dMax = Math.max(i10, i11);
        if (dMax >= f14734d) {
            return 1.0d;
        }
        return Math.pow((dMax + 128.0d) / (r0 + 128), f14733c);
    }
}
