package com.tencent.bugly.proguard;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.i */
/* loaded from: classes4.dex */
public final class C6718i {

    /* renamed from: a */
    private StringBuilder f6200a;

    /* renamed from: b */
    private int f6201b;

    public C6718i(StringBuilder sb, int i9) {
        this.f6200a = sb;
        this.f6201b = i9;
    }

    /* renamed from: a */
    private void m5340a(String str) {
        for (int i9 = 0; i9 < this.f6201b; i9++) {
            this.f6200a.append('\t');
        }
        if (str != null) {
            StringBuilder sb = this.f6200a;
            sb.append(str);
            sb.append(": ");
        }
    }

    /* renamed from: a */
    public final C6718i m5348a(boolean z9, String str) {
        m5340a(str);
        StringBuilder sb = this.f6200a;
        sb.append(z9 ? 'T' : 'F');
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    public final C6718i m5341a(byte b10, String str) {
        m5340a(str);
        StringBuilder sb = this.f6200a;
        sb.append((int) b10);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    private C6718i m5329a(char c10, String str) {
        m5340a(str);
        StringBuilder sb = this.f6200a;
        sb.append(c10);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    public final C6718i m5347a(short s9, String str) {
        m5340a(str);
        StringBuilder sb = this.f6200a;
        sb.append((int) s9);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    public final C6718i m5342a(int i9, String str) {
        m5340a(str);
        StringBuilder sb = this.f6200a;
        sb.append(i9);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    public final C6718i m5343a(long j9, String str) {
        m5340a(str);
        StringBuilder sb = this.f6200a;
        sb.append(j9);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    private C6718i m5331a(float f10, String str) {
        m5340a(str);
        StringBuilder sb = this.f6200a;
        sb.append(f10);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    private C6718i m5330a(double d10, String str) {
        m5340a(str);
        StringBuilder sb = this.f6200a;
        sb.append(d10);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    public final C6718i m5345a(String str, String str2) {
        m5340a(str2);
        if (str == null) {
            this.f6200a.append("null\n");
            return this;
        }
        StringBuilder sb = this.f6200a;
        sb.append(str);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    public final C6718i m5349a(byte[] bArr, String str) {
        m5340a(str);
        if (bArr == null) {
            this.f6200a.append("null\n");
            return this;
        }
        if (bArr.length == 0) {
            StringBuilder sb = this.f6200a;
            sb.append(bArr.length);
            sb.append(", []\n");
            return this;
        }
        StringBuilder sb2 = this.f6200a;
        sb2.append(bArr.length);
        sb2.append(", [\n");
        C6718i c6718i = new C6718i(this.f6200a, this.f6201b + 1);
        for (byte b10 : bArr) {
            c6718i.m5341a(b10, (String) null);
        }
        m5329a(']', (String) null);
        return this;
    }

    /* renamed from: a */
    private C6718i m5339a(short[] sArr, String str) {
        m5340a(str);
        if (sArr == null) {
            this.f6200a.append("null\n");
            return this;
        }
        if (sArr.length == 0) {
            StringBuilder sb = this.f6200a;
            sb.append(sArr.length);
            sb.append(", []\n");
            return this;
        }
        StringBuilder sb2 = this.f6200a;
        sb2.append(sArr.length);
        sb2.append(", [\n");
        C6718i c6718i = new C6718i(this.f6200a, this.f6201b + 1);
        for (short s9 : sArr) {
            c6718i.m5347a(s9, (String) null);
        }
        m5329a(']', (String) null);
        return this;
    }

    /* renamed from: a */
    private C6718i m5336a(int[] iArr, String str) {
        m5340a(str);
        if (iArr == null) {
            this.f6200a.append("null\n");
            return this;
        }
        if (iArr.length == 0) {
            StringBuilder sb = this.f6200a;
            sb.append(iArr.length);
            sb.append(", []\n");
            return this;
        }
        StringBuilder sb2 = this.f6200a;
        sb2.append(iArr.length);
        sb2.append(", [\n");
        C6718i c6718i = new C6718i(this.f6200a, this.f6201b + 1);
        for (int i9 : iArr) {
            c6718i.m5342a(i9, (String) null);
        }
        m5329a(']', (String) null);
        return this;
    }

    /* renamed from: a */
    private C6718i m5337a(long[] jArr, String str) {
        m5340a(str);
        if (jArr == null) {
            this.f6200a.append("null\n");
            return this;
        }
        if (jArr.length == 0) {
            StringBuilder sb = this.f6200a;
            sb.append(jArr.length);
            sb.append(", []\n");
            return this;
        }
        StringBuilder sb2 = this.f6200a;
        sb2.append(jArr.length);
        sb2.append(", [\n");
        C6718i c6718i = new C6718i(this.f6200a, this.f6201b + 1);
        for (long j9 : jArr) {
            c6718i.m5343a(j9, (String) null);
        }
        m5329a(']', (String) null);
        return this;
    }

    /* renamed from: a */
    private C6718i m5335a(float[] fArr, String str) {
        m5340a(str);
        if (fArr == null) {
            this.f6200a.append("null\n");
            return this;
        }
        if (fArr.length == 0) {
            StringBuilder sb = this.f6200a;
            sb.append(fArr.length);
            sb.append(", []\n");
            return this;
        }
        StringBuilder sb2 = this.f6200a;
        sb2.append(fArr.length);
        sb2.append(", [\n");
        C6718i c6718i = new C6718i(this.f6200a, this.f6201b + 1);
        for (float f10 : fArr) {
            c6718i.m5331a(f10, (String) null);
        }
        m5329a(']', (String) null);
        return this;
    }

    /* renamed from: a */
    private C6718i m5334a(double[] dArr, String str) {
        m5340a(str);
        if (dArr == null) {
            this.f6200a.append("null\n");
            return this;
        }
        if (dArr.length == 0) {
            StringBuilder sb = this.f6200a;
            sb.append(dArr.length);
            sb.append(", []\n");
            return this;
        }
        StringBuilder sb2 = this.f6200a;
        sb2.append(dArr.length);
        sb2.append(", [\n");
        C6718i c6718i = new C6718i(this.f6200a, this.f6201b + 1);
        for (double d10 : dArr) {
            c6718i.m5330a(d10, (String) null);
        }
        m5329a(']', (String) null);
        return this;
    }

    /* renamed from: a */
    public final <K, V> C6718i m5346a(Map<K, V> map, String str) {
        m5340a(str);
        if (map == null) {
            this.f6200a.append("null\n");
            return this;
        }
        if (map.isEmpty()) {
            StringBuilder sb = this.f6200a;
            sb.append(map.size());
            sb.append(", {}\n");
            return this;
        }
        StringBuilder sb2 = this.f6200a;
        sb2.append(map.size());
        sb2.append(", {\n");
        C6718i c6718i = new C6718i(this.f6200a, this.f6201b + 1);
        C6718i c6718i2 = new C6718i(this.f6200a, this.f6201b + 2);
        for (Map.Entry<K, V> entry : map.entrySet()) {
            c6718i.m5329a('(', (String) null);
            c6718i2.m5332a((C6718i) entry.getKey(), (String) null);
            c6718i2.m5332a((C6718i) entry.getValue(), (String) null);
            c6718i.m5329a(')', (String) null);
        }
        m5329a('}', (String) null);
        return this;
    }

    /* renamed from: a */
    private <T> C6718i m5338a(T[] tArr, String str) {
        m5340a(str);
        if (tArr == null) {
            this.f6200a.append("null\n");
            return this;
        }
        if (tArr.length == 0) {
            StringBuilder sb = this.f6200a;
            sb.append(tArr.length);
            sb.append(", []\n");
            return this;
        }
        StringBuilder sb2 = this.f6200a;
        sb2.append(tArr.length);
        sb2.append(", [\n");
        C6718i c6718i = new C6718i(this.f6200a, this.f6201b + 1);
        for (T t9 : tArr) {
            c6718i.m5332a((C6718i) t9, (String) null);
        }
        m5329a(']', (String) null);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private <T> C6718i m5333a(Collection<T> collection, String str) {
        if (collection == null) {
            m5340a(str);
            this.f6200a.append("null\t");
            return this;
        }
        return m5338a(collection.toArray(), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private <T> C6718i m5332a(T t9, String str) {
        if (t9 == 0) {
            this.f6200a.append("null\n");
            return this;
        }
        if (t9 instanceof Byte) {
            m5341a(((Byte) t9).byteValue(), str);
            return this;
        }
        if (t9 instanceof Boolean) {
            m5348a(((Boolean) t9).booleanValue(), str);
            return this;
        }
        if (t9 instanceof Short) {
            m5347a(((Short) t9).shortValue(), str);
            return this;
        }
        if (t9 instanceof Integer) {
            m5342a(((Integer) t9).intValue(), str);
            return this;
        }
        if (t9 instanceof Long) {
            m5343a(((Long) t9).longValue(), str);
            return this;
        }
        if (t9 instanceof Float) {
            m5331a(((Float) t9).floatValue(), str);
            return this;
        }
        if (t9 instanceof Double) {
            m5330a(((Double) t9).doubleValue(), str);
            return this;
        }
        if (t9 instanceof String) {
            m5345a((String) t9, str);
            return this;
        }
        if (t9 instanceof Map) {
            m5346a((Map) t9, str);
            return this;
        }
        if (t9 instanceof List) {
            m5333a((Collection) t9, str);
            return this;
        }
        if (t9 instanceof AbstractC6722m) {
            m5344a((AbstractC6722m) t9, str);
            return this;
        }
        if (t9 instanceof byte[]) {
            m5349a((byte[]) t9, str);
            return this;
        }
        if (t9 instanceof boolean[]) {
            m5332a((C6718i) t9, str);
            return this;
        }
        if (t9 instanceof short[]) {
            m5339a((short[]) t9, str);
            return this;
        }
        if (t9 instanceof int[]) {
            m5336a((int[]) t9, str);
            return this;
        }
        if (t9 instanceof long[]) {
            m5337a((long[]) t9, str);
            return this;
        }
        if (t9 instanceof float[]) {
            m5335a((float[]) t9, str);
            return this;
        }
        if (t9 instanceof double[]) {
            m5334a((double[]) t9, str);
            return this;
        }
        if (t9.getClass().isArray()) {
            m5338a((Object[]) t9, str);
            return this;
        }
        throw new C6719j("write object error: unsupport type.");
    }

    /* renamed from: a */
    public final C6718i m5344a(AbstractC6722m abstractC6722m, String str) {
        m5329a('{', str);
        if (abstractC6722m == null) {
            StringBuilder sb = this.f6200a;
            sb.append('\t');
            sb.append("null");
        } else {
            abstractC6722m.mo5316a(this.f6200a, this.f6201b + 1);
        }
        m5329a('}', (String) null);
        return this;
    }
}
