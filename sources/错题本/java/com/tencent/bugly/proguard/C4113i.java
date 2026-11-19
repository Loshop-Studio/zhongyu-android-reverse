package com.tencent.bugly.proguard;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.i */
/* loaded from: classes3.dex */
public final class C4113i {

    /* renamed from: a */
    private StringBuilder f3834a;

    /* renamed from: b */
    private int f3835b;

    public C4113i(StringBuilder sb, int i) {
        this.f3834a = sb;
        this.f3835b = i;
    }

    /* renamed from: a */
    private void m3257a(String str) {
        for (int i = 0; i < this.f3835b; i++) {
            this.f3834a.append('\t');
        }
        if (str != null) {
            StringBuilder sb = this.f3834a;
            sb.append(str);
            sb.append(": ");
        }
    }

    /* renamed from: a */
    public final C4113i m3265a(boolean z8, String str) {
        m3257a(str);
        StringBuilder sb = this.f3834a;
        sb.append(z8 ? 'T' : 'F');
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    public final C4113i m3258a(byte b6, String str) {
        m3257a(str);
        StringBuilder sb = this.f3834a;
        sb.append((int) b6);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    private C4113i m3246a(char c, String str) {
        m3257a(str);
        StringBuilder sb = this.f3834a;
        sb.append(c);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    public final C4113i m3264a(short s8, String str) {
        m3257a(str);
        StringBuilder sb = this.f3834a;
        sb.append((int) s8);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    public final C4113i m3259a(int i, String str) {
        m3257a(str);
        StringBuilder sb = this.f3834a;
        sb.append(i);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    public final C4113i m3260a(long j7, String str) {
        m3257a(str);
        StringBuilder sb = this.f3834a;
        sb.append(j7);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    private C4113i m3248a(float f, String str) {
        m3257a(str);
        StringBuilder sb = this.f3834a;
        sb.append(f);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    private C4113i m3247a(double d9, String str) {
        m3257a(str);
        StringBuilder sb = this.f3834a;
        sb.append(d9);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    public final C4113i m3262a(String str, String str2) {
        m3257a(str2);
        if (str == null) {
            this.f3834a.append("null\n");
            return this;
        }
        StringBuilder sb = this.f3834a;
        sb.append(str);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    public final C4113i m3266a(byte[] bArr, String str) {
        m3257a(str);
        if (bArr == null) {
            this.f3834a.append("null\n");
            return this;
        }
        if (bArr.length == 0) {
            StringBuilder sb = this.f3834a;
            sb.append(bArr.length);
            sb.append(", []\n");
            return this;
        }
        StringBuilder sb2 = this.f3834a;
        sb2.append(bArr.length);
        sb2.append(", [\n");
        C4113i c4113i = new C4113i(this.f3834a, this.f3835b + 1);
        for (byte b6 : bArr) {
            c4113i.m3258a(b6, (String) null);
        }
        m3246a(']', (String) null);
        return this;
    }

    /* renamed from: a */
    private C4113i m3256a(short[] sArr, String str) {
        m3257a(str);
        if (sArr == null) {
            this.f3834a.append("null\n");
            return this;
        }
        if (sArr.length == 0) {
            StringBuilder sb = this.f3834a;
            sb.append(sArr.length);
            sb.append(", []\n");
            return this;
        }
        StringBuilder sb2 = this.f3834a;
        sb2.append(sArr.length);
        sb2.append(", [\n");
        C4113i c4113i = new C4113i(this.f3834a, this.f3835b + 1);
        for (short s8 : sArr) {
            c4113i.m3264a(s8, (String) null);
        }
        m3246a(']', (String) null);
        return this;
    }

    /* renamed from: a */
    private C4113i m3253a(int[] iArr, String str) {
        m3257a(str);
        if (iArr == null) {
            this.f3834a.append("null\n");
            return this;
        }
        if (iArr.length == 0) {
            StringBuilder sb = this.f3834a;
            sb.append(iArr.length);
            sb.append(", []\n");
            return this;
        }
        StringBuilder sb2 = this.f3834a;
        sb2.append(iArr.length);
        sb2.append(", [\n");
        C4113i c4113i = new C4113i(this.f3834a, this.f3835b + 1);
        for (int i : iArr) {
            c4113i.m3259a(i, (String) null);
        }
        m3246a(']', (String) null);
        return this;
    }

    /* renamed from: a */
    private C4113i m3254a(long[] jArr, String str) {
        m3257a(str);
        if (jArr == null) {
            this.f3834a.append("null\n");
            return this;
        }
        if (jArr.length == 0) {
            StringBuilder sb = this.f3834a;
            sb.append(jArr.length);
            sb.append(", []\n");
            return this;
        }
        StringBuilder sb2 = this.f3834a;
        sb2.append(jArr.length);
        sb2.append(", [\n");
        C4113i c4113i = new C4113i(this.f3834a, this.f3835b + 1);
        for (long j7 : jArr) {
            c4113i.m3260a(j7, (String) null);
        }
        m3246a(']', (String) null);
        return this;
    }

    /* renamed from: a */
    private C4113i m3252a(float[] fArr, String str) {
        m3257a(str);
        if (fArr == null) {
            this.f3834a.append("null\n");
            return this;
        }
        if (fArr.length == 0) {
            StringBuilder sb = this.f3834a;
            sb.append(fArr.length);
            sb.append(", []\n");
            return this;
        }
        StringBuilder sb2 = this.f3834a;
        sb2.append(fArr.length);
        sb2.append(", [\n");
        C4113i c4113i = new C4113i(this.f3834a, this.f3835b + 1);
        for (float f : fArr) {
            c4113i.m3248a(f, (String) null);
        }
        m3246a(']', (String) null);
        return this;
    }

    /* renamed from: a */
    private C4113i m3251a(double[] dArr, String str) {
        m3257a(str);
        if (dArr == null) {
            this.f3834a.append("null\n");
            return this;
        }
        if (dArr.length == 0) {
            StringBuilder sb = this.f3834a;
            sb.append(dArr.length);
            sb.append(", []\n");
            return this;
        }
        StringBuilder sb2 = this.f3834a;
        sb2.append(dArr.length);
        sb2.append(", [\n");
        C4113i c4113i = new C4113i(this.f3834a, this.f3835b + 1);
        for (double d9 : dArr) {
            c4113i.m3247a(d9, (String) null);
        }
        m3246a(']', (String) null);
        return this;
    }

    /* renamed from: a */
    public final <K, V> C4113i m3263a(Map<K, V> map, String str) {
        m3257a(str);
        if (map == null) {
            this.f3834a.append("null\n");
            return this;
        }
        if (map.isEmpty()) {
            StringBuilder sb = this.f3834a;
            sb.append(map.size());
            sb.append(", {}\n");
            return this;
        }
        StringBuilder sb2 = this.f3834a;
        sb2.append(map.size());
        sb2.append(", {\n");
        C4113i c4113i = new C4113i(this.f3834a, this.f3835b + 1);
        C4113i c4113i2 = new C4113i(this.f3834a, this.f3835b + 2);
        for (Map.Entry<K, V> entry : map.entrySet()) {
            c4113i.m3246a('(', (String) null);
            c4113i2.m3249a((C4113i) entry.getKey(), (String) null);
            c4113i2.m3249a((C4113i) entry.getValue(), (String) null);
            c4113i.m3246a(')', (String) null);
        }
        m3246a('}', (String) null);
        return this;
    }

    /* renamed from: a */
    private <T> C4113i m3255a(T[] tArr, String str) {
        m3257a(str);
        if (tArr == null) {
            this.f3834a.append("null\n");
            return this;
        }
        if (tArr.length == 0) {
            StringBuilder sb = this.f3834a;
            sb.append(tArr.length);
            sb.append(", []\n");
            return this;
        }
        StringBuilder sb2 = this.f3834a;
        sb2.append(tArr.length);
        sb2.append(", [\n");
        C4113i c4113i = new C4113i(this.f3834a, this.f3835b + 1);
        for (T t8 : tArr) {
            c4113i.m3249a((C4113i) t8, (String) null);
        }
        m3246a(']', (String) null);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private <T> C4113i m3250a(Collection<T> collection, String str) {
        if (collection == null) {
            m3257a(str);
            this.f3834a.append("null\t");
            return this;
        }
        return m3255a(collection.toArray(), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private <T> C4113i m3249a(T t8, String str) {
        if (t8 == 0) {
            this.f3834a.append("null\n");
            return this;
        }
        if (t8 instanceof Byte) {
            m3258a(((Byte) t8).byteValue(), str);
            return this;
        }
        if (t8 instanceof Boolean) {
            m3265a(((Boolean) t8).booleanValue(), str);
            return this;
        }
        if (t8 instanceof Short) {
            m3264a(((Short) t8).shortValue(), str);
            return this;
        }
        if (t8 instanceof Integer) {
            m3259a(((Integer) t8).intValue(), str);
            return this;
        }
        if (t8 instanceof Long) {
            m3260a(((Long) t8).longValue(), str);
            return this;
        }
        if (t8 instanceof Float) {
            m3248a(((Float) t8).floatValue(), str);
            return this;
        }
        if (t8 instanceof Double) {
            m3247a(((Double) t8).doubleValue(), str);
            return this;
        }
        if (t8 instanceof String) {
            m3262a((String) t8, str);
            return this;
        }
        if (t8 instanceof Map) {
            m3263a((Map) t8, str);
            return this;
        }
        if (t8 instanceof List) {
            m3250a((Collection) t8, str);
            return this;
        }
        if (t8 instanceof AbstractC4123m) {
            m3261a((AbstractC4123m) t8, str);
            return this;
        }
        if (t8 instanceof byte[]) {
            m3266a((byte[]) t8, str);
            return this;
        }
        if (t8 instanceof boolean[]) {
            m3249a((C4113i) t8, str);
            return this;
        }
        if (t8 instanceof short[]) {
            m3256a((short[]) t8, str);
            return this;
        }
        if (t8 instanceof int[]) {
            m3253a((int[]) t8, str);
            return this;
        }
        if (t8 instanceof long[]) {
            m3254a((long[]) t8, str);
            return this;
        }
        if (t8 instanceof float[]) {
            m3252a((float[]) t8, str);
            return this;
        }
        if (t8 instanceof double[]) {
            m3251a((double[]) t8, str);
            return this;
        }
        if (t8.getClass().isArray()) {
            m3255a((Object[]) t8, str);
            return this;
        }
        throw new C4116j("write object error: unsupport type.");
    }

    /* renamed from: a */
    public final C4113i m3261a(AbstractC4123m abstractC4123m, String str) {
        m3246a('{', str);
        if (abstractC4123m == null) {
            StringBuilder sb = this.f3834a;
            sb.append('\t');
            sb.append("null");
        } else {
            abstractC4123m.mo3234a(this.f3834a, this.f3835b + 1);
        }
        m3246a('}', (String) null);
        return this;
    }
}
