package com.tencent.bugly.proguard;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.i */
/* loaded from: classes5.dex */
public final class C7823i {

    /* renamed from: a */
    private StringBuilder f14065a;

    /* renamed from: b */
    private int f14066b;

    public C7823i(StringBuilder sb2, int i10) {
        this.f14065a = sb2;
        this.f14066b = i10;
    }

    /* renamed from: a */
    private void m10851a(String str) {
        for (int i10 = 0; i10 < this.f14066b; i10++) {
            this.f14065a.append('\t');
        }
        if (str != null) {
            StringBuilder sb2 = this.f14065a;
            sb2.append(str);
            sb2.append(": ");
        }
    }

    /* renamed from: a */
    public final C7823i m10859a(boolean z10, String str) {
        m10851a(str);
        StringBuilder sb2 = this.f14065a;
        sb2.append(z10 ? 'T' : 'F');
        sb2.append('\n');
        return this;
    }

    /* renamed from: a */
    public final C7823i m10852a(byte b10, String str) {
        m10851a(str);
        StringBuilder sb2 = this.f14065a;
        sb2.append((int) b10);
        sb2.append('\n');
        return this;
    }

    /* renamed from: a */
    private C7823i m10840a(char c10, String str) {
        m10851a(str);
        StringBuilder sb2 = this.f14065a;
        sb2.append(c10);
        sb2.append('\n');
        return this;
    }

    /* renamed from: a */
    public final C7823i m10858a(short s10, String str) {
        m10851a(str);
        StringBuilder sb2 = this.f14065a;
        sb2.append((int) s10);
        sb2.append('\n');
        return this;
    }

    /* renamed from: a */
    public final C7823i m10853a(int i10, String str) {
        m10851a(str);
        StringBuilder sb2 = this.f14065a;
        sb2.append(i10);
        sb2.append('\n');
        return this;
    }

    /* renamed from: a */
    public final C7823i m10854a(long j10, String str) {
        m10851a(str);
        StringBuilder sb2 = this.f14065a;
        sb2.append(j10);
        sb2.append('\n');
        return this;
    }

    /* renamed from: a */
    private C7823i m10842a(float f10, String str) {
        m10851a(str);
        StringBuilder sb2 = this.f14065a;
        sb2.append(f10);
        sb2.append('\n');
        return this;
    }

    /* renamed from: a */
    private C7823i m10841a(double d10, String str) {
        m10851a(str);
        StringBuilder sb2 = this.f14065a;
        sb2.append(d10);
        sb2.append('\n');
        return this;
    }

    /* renamed from: a */
    public final C7823i m10856a(String str, String str2) {
        m10851a(str2);
        if (str == null) {
            this.f14065a.append("null\n");
            return this;
        }
        StringBuilder sb2 = this.f14065a;
        sb2.append(str);
        sb2.append('\n');
        return this;
    }

    /* renamed from: a */
    public final C7823i m10860a(byte[] bArr, String str) {
        m10851a(str);
        if (bArr == null) {
            this.f14065a.append("null\n");
            return this;
        }
        if (bArr.length == 0) {
            StringBuilder sb2 = this.f14065a;
            sb2.append(bArr.length);
            sb2.append(", []\n");
            return this;
        }
        StringBuilder sb3 = this.f14065a;
        sb3.append(bArr.length);
        sb3.append(", [\n");
        C7823i c7823i = new C7823i(this.f14065a, this.f14066b + 1);
        for (byte b10 : bArr) {
            c7823i.m10852a(b10, (String) null);
        }
        m10840a(']', (String) null);
        return this;
    }

    /* renamed from: a */
    private C7823i m10850a(short[] sArr, String str) {
        m10851a(str);
        if (sArr == null) {
            this.f14065a.append("null\n");
            return this;
        }
        if (sArr.length == 0) {
            StringBuilder sb2 = this.f14065a;
            sb2.append(sArr.length);
            sb2.append(", []\n");
            return this;
        }
        StringBuilder sb3 = this.f14065a;
        sb3.append(sArr.length);
        sb3.append(", [\n");
        C7823i c7823i = new C7823i(this.f14065a, this.f14066b + 1);
        for (short s10 : sArr) {
            c7823i.m10858a(s10, (String) null);
        }
        m10840a(']', (String) null);
        return this;
    }

    /* renamed from: a */
    private C7823i m10847a(int[] iArr, String str) {
        m10851a(str);
        if (iArr == null) {
            this.f14065a.append("null\n");
            return this;
        }
        if (iArr.length == 0) {
            StringBuilder sb2 = this.f14065a;
            sb2.append(iArr.length);
            sb2.append(", []\n");
            return this;
        }
        StringBuilder sb3 = this.f14065a;
        sb3.append(iArr.length);
        sb3.append(", [\n");
        C7823i c7823i = new C7823i(this.f14065a, this.f14066b + 1);
        for (int i10 : iArr) {
            c7823i.m10853a(i10, (String) null);
        }
        m10840a(']', (String) null);
        return this;
    }

    /* renamed from: a */
    private C7823i m10848a(long[] jArr, String str) {
        m10851a(str);
        if (jArr == null) {
            this.f14065a.append("null\n");
            return this;
        }
        if (jArr.length == 0) {
            StringBuilder sb2 = this.f14065a;
            sb2.append(jArr.length);
            sb2.append(", []\n");
            return this;
        }
        StringBuilder sb3 = this.f14065a;
        sb3.append(jArr.length);
        sb3.append(", [\n");
        C7823i c7823i = new C7823i(this.f14065a, this.f14066b + 1);
        for (long j10 : jArr) {
            c7823i.m10854a(j10, (String) null);
        }
        m10840a(']', (String) null);
        return this;
    }

    /* renamed from: a */
    private C7823i m10846a(float[] fArr, String str) {
        m10851a(str);
        if (fArr == null) {
            this.f14065a.append("null\n");
            return this;
        }
        if (fArr.length == 0) {
            StringBuilder sb2 = this.f14065a;
            sb2.append(fArr.length);
            sb2.append(", []\n");
            return this;
        }
        StringBuilder sb3 = this.f14065a;
        sb3.append(fArr.length);
        sb3.append(", [\n");
        C7823i c7823i = new C7823i(this.f14065a, this.f14066b + 1);
        for (float f10 : fArr) {
            c7823i.m10842a(f10, (String) null);
        }
        m10840a(']', (String) null);
        return this;
    }

    /* renamed from: a */
    private C7823i m10845a(double[] dArr, String str) {
        m10851a(str);
        if (dArr == null) {
            this.f14065a.append("null\n");
            return this;
        }
        if (dArr.length == 0) {
            StringBuilder sb2 = this.f14065a;
            sb2.append(dArr.length);
            sb2.append(", []\n");
            return this;
        }
        StringBuilder sb3 = this.f14065a;
        sb3.append(dArr.length);
        sb3.append(", [\n");
        C7823i c7823i = new C7823i(this.f14065a, this.f14066b + 1);
        for (double d10 : dArr) {
            c7823i.m10841a(d10, (String) null);
        }
        m10840a(']', (String) null);
        return this;
    }

    /* renamed from: a */
    public final <K, V> C7823i m10857a(Map<K, V> map, String str) {
        m10851a(str);
        if (map == null) {
            this.f14065a.append("null\n");
            return this;
        }
        if (map.isEmpty()) {
            StringBuilder sb2 = this.f14065a;
            sb2.append(map.size());
            sb2.append(", {}\n");
            return this;
        }
        StringBuilder sb3 = this.f14065a;
        sb3.append(map.size());
        sb3.append(", {\n");
        C7823i c7823i = new C7823i(this.f14065a, this.f14066b + 1);
        C7823i c7823i2 = new C7823i(this.f14065a, this.f14066b + 2);
        for (Map.Entry<K, V> entry : map.entrySet()) {
            c7823i.m10840a('(', (String) null);
            c7823i2.m10843a((C7823i) entry.getKey(), (String) null);
            c7823i2.m10843a((C7823i) entry.getValue(), (String) null);
            c7823i.m10840a(')', (String) null);
        }
        m10840a('}', (String) null);
        return this;
    }

    /* renamed from: a */
    private <T> C7823i m10849a(T[] tArr, String str) {
        m10851a(str);
        if (tArr == null) {
            this.f14065a.append("null\n");
            return this;
        }
        if (tArr.length == 0) {
            StringBuilder sb2 = this.f14065a;
            sb2.append(tArr.length);
            sb2.append(", []\n");
            return this;
        }
        StringBuilder sb3 = this.f14065a;
        sb3.append(tArr.length);
        sb3.append(", [\n");
        C7823i c7823i = new C7823i(this.f14065a, this.f14066b + 1);
        for (T t10 : tArr) {
            c7823i.m10843a((C7823i) t10, (String) null);
        }
        m10840a(']', (String) null);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private <T> C7823i m10844a(Collection<T> collection, String str) {
        if (collection == null) {
            m10851a(str);
            this.f14065a.append("null\t");
            return this;
        }
        return m10849a(collection.toArray(), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private <T> C7823i m10843a(T t10, String str) {
        if (t10 == 0) {
            this.f14065a.append("null\n");
            return this;
        }
        if (t10 instanceof Byte) {
            m10852a(((Byte) t10).byteValue(), str);
            return this;
        }
        if (t10 instanceof Boolean) {
            m10859a(((Boolean) t10).booleanValue(), str);
            return this;
        }
        if (t10 instanceof Short) {
            m10858a(((Short) t10).shortValue(), str);
            return this;
        }
        if (t10 instanceof Integer) {
            m10853a(((Integer) t10).intValue(), str);
            return this;
        }
        if (t10 instanceof Long) {
            m10854a(((Long) t10).longValue(), str);
            return this;
        }
        if (t10 instanceof Float) {
            m10842a(((Float) t10).floatValue(), str);
            return this;
        }
        if (t10 instanceof Double) {
            m10841a(((Double) t10).doubleValue(), str);
            return this;
        }
        if (t10 instanceof String) {
            m10856a((String) t10, str);
            return this;
        }
        if (t10 instanceof Map) {
            m10857a((Map) t10, str);
            return this;
        }
        if (t10 instanceof List) {
            m10844a((Collection) t10, str);
            return this;
        }
        if (t10 instanceof AbstractC7827m) {
            m10855a((AbstractC7827m) t10, str);
            return this;
        }
        if (t10 instanceof byte[]) {
            m10860a((byte[]) t10, str);
            return this;
        }
        if (t10 instanceof boolean[]) {
            m10843a((C7823i) t10, str);
            return this;
        }
        if (t10 instanceof short[]) {
            m10850a((short[]) t10, str);
            return this;
        }
        if (t10 instanceof int[]) {
            m10847a((int[]) t10, str);
            return this;
        }
        if (t10 instanceof long[]) {
            m10848a((long[]) t10, str);
            return this;
        }
        if (t10 instanceof float[]) {
            m10846a((float[]) t10, str);
            return this;
        }
        if (t10 instanceof double[]) {
            m10845a((double[]) t10, str);
            return this;
        }
        if (t10.getClass().isArray()) {
            m10849a((Object[]) t10, str);
            return this;
        }
        throw new C7824j("write object error: unsupport type.");
    }

    /* renamed from: a */
    public final C7823i m10855a(AbstractC7827m abstractC7827m, String str) {
        m10840a('{', str);
        if (abstractC7827m == null) {
            StringBuilder sb2 = this.f14065a;
            sb2.append('\t');
            sb2.append("null");
        } else {
            abstractC7827m.mo10827a(this.f14065a, this.f14066b + 1);
        }
        m10840a('}', (String) null);
        return this;
    }
}
