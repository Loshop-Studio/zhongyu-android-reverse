package com.tendcloud.tenddata;

import androidx.camera.video.AudioStats;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.tendcloud.tenddata.dm */
/* loaded from: classes5.dex */
final class C7935dm {

    /* renamed from: a */
    private static int f14721a = 2;

    /* renamed from: b */
    private static int f14722b = 6;

    /* renamed from: c */
    private static int f14723c = 6;

    /* renamed from: d */
    private static int f14724d = -40;

    /* renamed from: e */
    private static int f14725e = 4;

    /* renamed from: f */
    private b f14726f;

    /* renamed from: com.tendcloud.tenddata.dm$b */
    public static class b {
        static final int DEFAULT_MAX_BSS_ENTRIES = 50;
        static final int DEFAULT_MAX_FINGERPRINTS = 10;
        static final int DEFAULT_MIN_FINGERPRINTS = 3;
        static final int DEFAULT_RSSI_THRESHOLD = -85;
        private int maxFingerprints = 10;
        private int minFingerprints = 3;
        private int maxBssEntries = 50;
        private int rssiThreshold = -85;

        public int getMaxBssEntries() {
            return this.maxBssEntries;
        }

        public int getMaxFingerprints() {
            return this.maxFingerprints;
        }

        public int getMinFingerprints() {
            return this.minFingerprints;
        }

        public int getRssiThreshold() {
            return this.rssiThreshold;
        }

        public void setMaxBssEntries(int i10) {
            this.maxBssEntries = i10;
        }

        public void setMaxFingerprints(int i10) {
            this.maxFingerprints = i10;
        }

        public void setMinFingerprints(int i10) {
            this.minFingerprints = i10;
        }

        public void setRssiThreshold(int i10) {
            this.rssiThreshold = i10;
        }
    }

    /* renamed from: com.tendcloud.tenddata.dm$c */
    public class c {
        private List<a> bsslist;
        private Map<String, a> bssmap;
        private long poiId;
        private int timestamp;

        public c() {
        }

        public c cloneFingerprint() {
            c cVar = C7935dm.this.new c();
            cVar.setTimestamp(this.timestamp);
            cVar.setPoiId(this.poiId);
            LinkedList linkedList = new LinkedList();
            Iterator<a> it = this.bsslist.iterator();
            while (it.hasNext()) {
                linkedList.add(it.next().cloneBssEntry());
            }
            cVar.setBsslist(linkedList);
            return cVar;
        }

        public List<a> getBsslist() {
            return this.bsslist;
        }

        public Map<String, a> getBssmap(boolean z10) {
            if (this.bssmap == null || z10) {
                this.bssmap = new HashMap();
                for (a aVar : this.bsslist) {
                    this.bssmap.put(aVar.getBssid(), aVar);
                }
            }
            return this.bssmap;
        }

        public long getPoiId() {
            return this.poiId;
        }

        public int getTimestamp() {
            return this.timestamp;
        }

        public void setBsslist(List<a> list) {
            this.bsslist = list;
        }

        public void setPoiId(long j10) {
            this.poiId = j10;
        }

        public void setTimestamp(int i10) {
            this.timestamp = i10;
        }
    }

    /* renamed from: com.tendcloud.tenddata.dm$d */
    public class d {
        c fp1;
        c fp2;
        double score;

        public d(c cVar, c cVar2, double d10) {
            this.fp1 = cVar;
            this.fp2 = cVar2;
            this.score = d10;
        }
    }

    /* renamed from: com.tendcloud.tenddata.dm$e */
    public class e {
        Object key;
        Object value;

        public e(Object obj, Object obj2) {
            this.key = obj;
            this.value = obj2;
        }
    }

    public C7935dm() {
        this(new b());
    }

    /* renamed from: a */
    public double m11729a(c cVar, c cVar2) {
        int i10 = 0;
        Map<String, a> bssmap = cVar.getBssmap(false);
        Map<String, a> bssmap2 = cVar2.getBssmap(false);
        HashSet hashSet = new HashSet();
        int rssi = 0;
        double d10 = AudioStats.AUDIO_AMPLITUDE_NONE;
        double dM11728a = AudioStats.AUDIO_AMPLITUDE_NONE;
        for (Map.Entry<String, a> entry : bssmap.entrySet()) {
            a value = entry.getValue();
            a aVar = bssmap2.get(entry.getKey());
            rssi += value.getRssi();
            if (aVar == null) {
                hashSet.add(value);
            } else {
                double dM11733b = m11733b(value.getRssi(), aVar.getRssi());
                d10 += dM11733b;
                dM11728a += dM11733b * m11728a(value.getRssi(), aVar.getRssi());
                i10++;
            }
        }
        if (i10 == 0) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        for (Map.Entry<String, a> entry2 : bssmap2.entrySet()) {
            rssi += entry2.getValue().getRssi();
            if (!bssmap.containsKey(entry2.getKey())) {
                hashSet.add(entry2.getValue());
            }
        }
        int iMax = Math.max(this.f14726f.getRssiThreshold(), (int) ((rssi / (cVar.getBsslist().size() + cVar2.getBsslist().size())) + 1.2d));
        Iterator it = hashSet.iterator();
        double d11 = 0.0d;
        while (it.hasNext()) {
            if (((a) it.next()).getRssi() > iMax) {
                d11 += 1.0d;
            }
        }
        return (dM11728a / d10) * (1.0d - Math.pow(d11 / ((i10 * 2) + d11), f14725e));
    }

    /* renamed from: b */
    public c m11734b(c cVar, c cVar2) {
        Map<String, a> bssmap = cVar.getBssmap(false);
        Map<String, a> bssmap2 = cVar2.getBssmap(false);
        TreeMap treeMap = new TreeMap();
        c cVar3 = new c();
        cVar3.setPoiId(cVar2.getPoiId());
        cVar3.setTimestamp(cVar2.getTimestamp());
        LinkedList linkedList = new LinkedList();
        cVar3.setBsslist(linkedList);
        for (Map.Entry<String, a> entry : bssmap.entrySet()) {
            a value = entry.getValue();
            a aVar = bssmap2.get(entry.getKey());
            if (aVar == null) {
                double d10 = -value.getRssi();
                while (treeMap.containsKey(Double.valueOf(d10))) {
                    d10 += 1.0E-4d;
                }
                treeMap.put(Double.valueOf(d10), value);
            } else {
                linkedList.add(new a(aVar.getSsid(), aVar.getBssid(), (byte) ((aVar.getRssi() + value.getRssi()) / 2), aVar.getBand(), aVar.getChannel()));
            }
        }
        for (Map.Entry<String, a> entry2 : bssmap2.entrySet()) {
            if (!bssmap.containsKey(entry2.getKey())) {
                double d11 = -entry2.getValue().getRssi();
                while (treeMap.containsKey(Double.valueOf(d11))) {
                    d11 += 1.0E-4d;
                }
                treeMap.put(Double.valueOf(d11), entry2.getValue());
            }
        }
        for (Map.Entry entry3 : treeMap.entrySet()) {
            byte b10 = (byte) (-((Double) entry3.getKey()).doubleValue());
            if (linkedList.size() >= this.f14726f.getMaxBssEntries() || b10 < this.f14726f.getRssiThreshold()) {
                break;
            }
            linkedList.add(entry3.getValue());
        }
        return cVar3;
    }

    public C7935dm(b bVar) {
        this.f14726f = bVar;
    }

    /* renamed from: com.tendcloud.tenddata.dm$a */
    public class a {
        private byte band;
        private String bssid;
        private byte channel;
        private byte rssi;
        private String ssid;

        public a() {
            this.ssid = "";
            this.bssid = "00:00:00:00:00:00";
            this.rssi = (byte) -127;
            this.band = (byte) 1;
            this.channel = (byte) 1;
        }

        public a cloneBssEntry() {
            return C7935dm.this.new a(this.ssid, this.bssid, this.rssi, this.band, this.channel);
        }

        public byte getBand() {
            return this.band;
        }

        public String getBssid() {
            return this.bssid;
        }

        public byte getChannel() {
            return this.channel;
        }

        public byte getRssi() {
            return this.rssi;
        }

        public String getSsid() {
            return this.ssid;
        }

        public void setBand(byte b10) {
            this.band = b10;
        }

        public void setBssid(String str) {
            this.bssid = str;
        }

        public void setChannel(byte b10) {
            this.channel = b10;
        }

        public void setRssi(byte b10) {
            this.rssi = b10;
        }

        public void setSsid(String str) {
            this.ssid = str;
        }

        public a(String str, String str2, byte b10, byte b11, byte b12) {
            this.ssid = str;
            this.bssid = str2;
            this.rssi = b10;
            this.band = b11;
            this.channel = b12;
        }
    }

    /* renamed from: a */
    public double m11730a(c cVar, List<c> list) {
        Iterator<c> it = list.iterator();
        double dMax = AudioStats.AUDIO_AMPLITUDE_NONE;
        while (it.hasNext()) {
            dMax = Math.max(m11729a(it.next(), cVar), dMax);
        }
        return dMax;
    }

    /* renamed from: a */
    public double m11731a(List<c> list, List<c> list2) {
        boolean zIsEmpty = list.isEmpty();
        double d10 = AudioStats.AUDIO_AMPLITUDE_NONE;
        if (zIsEmpty || list2.isEmpty()) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        LinkedList linkedList = new LinkedList();
        m11735b(list, list2, linkedList);
        int i10 = 0;
        for (d dVar : linkedList) {
            if (dVar.fp1 != null && dVar.fp2 != null) {
                d10 += dVar.score;
                i10++;
            }
        }
        return d10 / i10;
    }

    /* renamed from: a */
    public double m11732a(List<c> list, List<c> list2, List<c> list3) {
        c cVar;
        boolean zIsEmpty = list.isEmpty();
        double d10 = AudioStats.AUDIO_AMPLITUDE_NONE;
        if (!zIsEmpty && !list2.isEmpty()) {
            LinkedList linkedList = new LinkedList();
            m11735b(list, list2, linkedList);
            int i10 = 0;
            for (d dVar : linkedList) {
                c cVar2 = dVar.fp1;
                if (cVar2 != null && (cVar = dVar.fp2) != null) {
                    d10 += dVar.score;
                    i10++;
                    list3.add(m11734b(cVar2, cVar));
                } else if (list3.size() < this.f14726f.getMinFingerprints()) {
                    c cVar3 = dVar.fp1;
                    list3.add(cVar3 == null ? dVar.fp2.cloneFingerprint() : cVar3.cloneFingerprint());
                }
            }
            return d10 / i10;
        }
        list3.addAll(list);
        list3.addAll(list2);
        return AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* renamed from: b */
    public void m11735b(List<c> list, List<c> list2, List<d> list3) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (c cVar : list) {
            for (c cVar2 : list2) {
                hashSet2.add(cVar2);
                arrayList.add(new d(cVar, cVar2, m11729a(cVar, cVar2)));
            }
            hashSet.add(cVar);
        }
        Collections.sort(arrayList, new Comparator<d>() { // from class: com.tendcloud.tenddata.dm.1
            @Override // java.util.Comparator
            public int compare(d dVar, d dVar2) {
                if (Double.doubleToLongBits(dVar.score) == Double.doubleToLongBits(dVar2.score)) {
                    return 0;
                }
                return Double.doubleToLongBits(dVar.score) < Double.doubleToLongBits(dVar2.score) ? 1 : -1;
            }
        });
        list3.clear();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            d dVar = (d) obj;
            if (hashSet.contains(dVar.fp1) && hashSet2.contains(dVar.fp2)) {
                hashSet.remove(dVar.fp1);
                hashSet2.remove(dVar.fp2);
                list3.add(dVar);
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            list3.add(new d((c) it.next(), null, AudioStats.AUDIO_AMPLITUDE_NONE));
        }
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            list3.add(new d(null, (c) it2.next(), AudioStats.AUDIO_AMPLITUDE_NONE));
        }
    }

    /* renamed from: a */
    public double m11728a(int i10, int i11) {
        double d10 = AudioStats.AUDIO_AMPLITUDE_NONE;
        if (i10 >= 0 || i11 >= 0) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        double d11 = (i11 + i10) / 2;
        double dAbs = Math.abs(i10 - d11);
        int i12 = f14721a;
        if (dAbs > i12) {
            d10 = dAbs - i12;
        }
        return Math.pow((d10 + d11) / d11, f14722b);
    }

    /* renamed from: b */
    public double m11733b(int i10, int i11) {
        if (i10 >= 0 || i11 >= 0) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        double dMax = Math.max(i10, i11);
        if (dMax >= f14724d) {
            return 1.0d;
        }
        return Math.pow((dMax + 128.0d) / (r0 + 128), f14723c);
    }
}
