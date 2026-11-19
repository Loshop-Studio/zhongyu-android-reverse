package com.tencent.bugly.proguard;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.i */
/* loaded from: classes3.dex */
public final class C5835i {

    /* renamed from: a */
    private StringBuilder f4344a;

    /* renamed from: b */
    private int f4345b;

    public C5835i(StringBuilder sb, int i6) {
        this.f4344a = sb;
        this.f4345b = i6;
    }

    /* renamed from: a */
    private void m4166a(String str) {
        for (int i6 = 0; i6 < this.f4345b; i6++) {
            this.f4344a.append('\t');
        }
        if (str != null) {
            StringBuilder sb = this.f4344a;
            sb.append(str);
            sb.append(": ");
        }
    }

    /* renamed from: a */
    public final C5835i m4174a(boolean z6, String str) {
        m4166a(str);
        StringBuilder sb = this.f4344a;
        sb.append(z6 ? 'T' : 'F');
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    public final C5835i m4167a(byte b7, String str) {
        m4166a(str);
        StringBuilder sb = this.f4344a;
        sb.append((int) b7);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    private C5835i m4155a(char c7, String str) {
        m4166a(str);
        StringBuilder sb = this.f4344a;
        sb.append(c7);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    public final C5835i m4173a(short s6, String str) {
        m4166a(str);
        StringBuilder sb = this.f4344a;
        sb.append((int) s6);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    public final C5835i m4168a(int i6, String str) {
        m4166a(str);
        StringBuilder sb = this.f4344a;
        sb.append(i6);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    public final C5835i m4169a(long j6, String str) {
        m4166a(str);
        StringBuilder sb = this.f4344a;
        sb.append(j6);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    private C5835i m4157a(float f6, String str) {
        m4166a(str);
        StringBuilder sb = this.f4344a;
        sb.append(f6);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    private C5835i m4156a(double d6, String str) {
        m4166a(str);
        StringBuilder sb = this.f4344a;
        sb.append(d6);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    public final C5835i m4171a(String str, String str2) {
        m4166a(str2);
        if (str == null) {
            this.f4344a.append("null\n");
            return this;
        }
        StringBuilder sb = this.f4344a;
        sb.append(str);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    public final C5835i m4175a(byte[] bArr, String str) {
        m4166a(str);
        if (bArr == null) {
            this.f4344a.append("null\n");
            return this;
        }
        if (bArr.length == 0) {
            StringBuilder sb = this.f4344a;
            sb.append(bArr.length);
            sb.append(", []\n");
            return this;
        }
        StringBuilder sb2 = this.f4344a;
        sb2.append(bArr.length);
        sb2.append(", [\n");
        C5835i c5835i = new C5835i(this.f4344a, this.f4345b + 1);
        for (byte b7 : bArr) {
            c5835i.m4167a(b7, (String) null);
        }
        m4155a(']', (String) null);
        return this;
    }

    /* renamed from: a */
    private C5835i m4165a(short[] sArr, String str) {
        m4166a(str);
        if (sArr == null) {
            this.f4344a.append("null\n");
            return this;
        }
        if (sArr.length == 0) {
            StringBuilder sb = this.f4344a;
            sb.append(sArr.length);
            sb.append(", []\n");
            return this;
        }
        StringBuilder sb2 = this.f4344a;
        sb2.append(sArr.length);
        sb2.append(", [\n");
        C5835i c5835i = new C5835i(this.f4344a, this.f4345b + 1);
        for (short s6 : sArr) {
            c5835i.m4173a(s6, (String) null);
        }
        m4155a(']', (String) null);
        return this;
    }

    /* renamed from: a */
    private C5835i m4162a(int[] iArr, String str) {
        m4166a(str);
        if (iArr == null) {
            this.f4344a.append("null\n");
            return this;
        }
        if (iArr.length == 0) {
            StringBuilder sb = this.f4344a;
            sb.append(iArr.length);
            sb.append(", []\n");
            return this;
        }
        StringBuilder sb2 = this.f4344a;
        sb2.append(iArr.length);
        sb2.append(", [\n");
        C5835i c5835i = new C5835i(this.f4344a, this.f4345b + 1);
        for (int i6 : iArr) {
            c5835i.m4168a(i6, (String) null);
        }
        m4155a(']', (String) null);
        return this;
    }

    /* renamed from: a */
    private C5835i m4163a(long[] jArr, String str) {
        m4166a(str);
        if (jArr == null) {
            this.f4344a.append("null\n");
            return this;
        }
        if (jArr.length == 0) {
            StringBuilder sb = this.f4344a;
            sb.append(jArr.length);
            sb.append(", []\n");
            return this;
        }
        StringBuilder sb2 = this.f4344a;
        sb2.append(jArr.length);
        sb2.append(", [\n");
        C5835i c5835i = new C5835i(this.f4344a, this.f4345b + 1);
        for (long j6 : jArr) {
            c5835i.m4169a(j6, (String) null);
        }
        m4155a(']', (String) null);
        return this;
    }

    /* renamed from: a */
    private C5835i m4161a(float[] fArr, String str) {
        m4166a(str);
        if (fArr == null) {
            this.f4344a.append("null\n");
            return this;
        }
        if (fArr.length == 0) {
            StringBuilder sb = this.f4344a;
            sb.append(fArr.length);
            sb.append(", []\n");
            return this;
        }
        StringBuilder sb2 = this.f4344a;
        sb2.append(fArr.length);
        sb2.append(", [\n");
        C5835i c5835i = new C5835i(this.f4344a, this.f4345b + 1);
        for (float f6 : fArr) {
            c5835i.m4157a(f6, (String) null);
        }
        m4155a(']', (String) null);
        return this;
    }

    /* renamed from: a */
    private C5835i m4160a(double[] dArr, String str) {
        m4166a(str);
        if (dArr == null) {
            this.f4344a.append("null\n");
            return this;
        }
        if (dArr.length == 0) {
            StringBuilder sb = this.f4344a;
            sb.append(dArr.length);
            sb.append(", []\n");
            return this;
        }
        StringBuilder sb2 = this.f4344a;
        sb2.append(dArr.length);
        sb2.append(", [\n");
        C5835i c5835i = new C5835i(this.f4344a, this.f4345b + 1);
        for (double d6 : dArr) {
            c5835i.m4156a(d6, (String) null);
        }
        m4155a(']', (String) null);
        return this;
    }

    /* renamed from: a */
    public final <K, V> C5835i m4172a(Map<K, V> map, String str) {
        m4166a(str);
        if (map == null) {
            this.f4344a.append("null\n");
            return this;
        }
        if (map.isEmpty()) {
            StringBuilder sb = this.f4344a;
            sb.append(map.size());
            sb.append(", {}\n");
            return this;
        }
        StringBuilder sb2 = this.f4344a;
        sb2.append(map.size());
        sb2.append(", {\n");
        C5835i c5835i = new C5835i(this.f4344a, this.f4345b + 1);
        C5835i c5835i2 = new C5835i(this.f4344a, this.f4345b + 2);
        for (Map.Entry<K, V> entry : map.entrySet()) {
            c5835i.m4155a('(', (String) null);
            c5835i2.m4158a((C5835i) entry.getKey(), (String) null);
            c5835i2.m4158a((C5835i) entry.getValue(), (String) null);
            c5835i.m4155a(')', (String) null);
        }
        m4155a('}', (String) null);
        return this;
    }

    /* renamed from: a */
    private <T> C5835i m4164a(T[] tArr, String str) {
        m4166a(str);
        if (tArr == null) {
            this.f4344a.append("null\n");
            return this;
        }
        if (tArr.length == 0) {
            StringBuilder sb = this.f4344a;
            sb.append(tArr.length);
            sb.append(", []\n");
            return this;
        }
        StringBuilder sb2 = this.f4344a;
        sb2.append(tArr.length);
        sb2.append(", [\n");
        C5835i c5835i = new C5835i(this.f4344a, this.f4345b + 1);
        for (T t6 : tArr) {
            c5835i.m4158a((C5835i) t6, (String) null);
        }
        m4155a(']', (String) null);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private <T> C5835i m4159a(Collection<T> collection, String str) {
        if (collection == null) {
            m4166a(str);
            this.f4344a.append("null\t");
            return this;
        }
        return m4164a(collection.toArray(), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private <T> C5835i m4158a(T t6, String str) {
        if (t6 == 0) {
            this.f4344a.append("null\n");
            return this;
        }
        if (t6 instanceof Byte) {
            m4167a(((Byte) t6).byteValue(), str);
            return this;
        }
        if (t6 instanceof Boolean) {
            m4174a(((Boolean) t6).booleanValue(), str);
            return this;
        }
        if (t6 instanceof Short) {
            m4173a(((Short) t6).shortValue(), str);
            return this;
        }
        if (t6 instanceof Integer) {
            m4168a(((Integer) t6).intValue(), str);
            return this;
        }
        if (t6 instanceof Long) {
            m4169a(((Long) t6).longValue(), str);
            return this;
        }
        if (t6 instanceof Float) {
            m4157a(((Float) t6).floatValue(), str);
            return this;
        }
        if (t6 instanceof Double) {
            m4156a(((Double) t6).doubleValue(), str);
            return this;
        }
        if (t6 instanceof String) {
            m4171a((String) t6, str);
            return this;
        }
        if (t6 instanceof Map) {
            m4172a((Map) t6, str);
            return this;
        }
        if (t6 instanceof List) {
            m4159a((Collection) t6, str);
            return this;
        }
        if (t6 instanceof AbstractC5839m) {
            m4170a((AbstractC5839m) t6, str);
            return this;
        }
        if (t6 instanceof byte[]) {
            m4175a((byte[]) t6, str);
            return this;
        }
        if (t6 instanceof boolean[]) {
            m4158a((C5835i) t6, str);
            return this;
        }
        if (t6 instanceof short[]) {
            m4165a((short[]) t6, str);
            return this;
        }
        if (t6 instanceof int[]) {
            m4162a((int[]) t6, str);
            return this;
        }
        if (t6 instanceof long[]) {
            m4163a((long[]) t6, str);
            return this;
        }
        if (t6 instanceof float[]) {
            m4161a((float[]) t6, str);
            return this;
        }
        if (t6 instanceof double[]) {
            m4160a((double[]) t6, str);
            return this;
        }
        if (t6.getClass().isArray()) {
            m4164a((Object[]) t6, str);
            return this;
        }
        throw new C5836j("write object error: unsupport type.");
    }

    /* renamed from: a */
    public final C5835i m4170a(AbstractC5839m abstractC5839m, String str) {
        m4155a('{', str);
        if (abstractC5839m == null) {
            StringBuilder sb = this.f4344a;
            sb.append('\t');
            sb.append("null");
        } else {
            abstractC5839m.mo4142a(this.f4344a, this.f4345b + 1);
        }
        m4155a('}', (String) null);
        return this;
    }
}
