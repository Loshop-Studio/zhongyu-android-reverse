package com.tencent.bugly.proguard;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.i */
/* loaded from: classes4.dex */
public final class C6480i {

    /* renamed from: a */
    private StringBuilder f4966a;

    /* renamed from: b */
    private int f4967b;

    public C6480i(StringBuilder sb, int i10) {
        this.f4966a = sb;
        this.f4967b = i10;
    }

    /* renamed from: a */
    private void m4521a(String str) {
        for (int i10 = 0; i10 < this.f4967b; i10++) {
            this.f4966a.append('\t');
        }
        if (str != null) {
            StringBuilder sb = this.f4966a;
            sb.append(str);
            sb.append(": ");
        }
    }

    /* renamed from: a */
    public final C6480i m4529a(boolean z10, String str) {
        m4521a(str);
        StringBuilder sb = this.f4966a;
        sb.append(z10 ? 'T' : 'F');
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    public final C6480i m4522a(byte b10, String str) {
        m4521a(str);
        StringBuilder sb = this.f4966a;
        sb.append((int) b10);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    private C6480i m4510a(char c10, String str) {
        m4521a(str);
        StringBuilder sb = this.f4966a;
        sb.append(c10);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    public final C6480i m4528a(short s10, String str) {
        m4521a(str);
        StringBuilder sb = this.f4966a;
        sb.append((int) s10);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    public final C6480i m4523a(int i10, String str) {
        m4521a(str);
        StringBuilder sb = this.f4966a;
        sb.append(i10);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    public final C6480i m4524a(long j10, String str) {
        m4521a(str);
        StringBuilder sb = this.f4966a;
        sb.append(j10);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    private C6480i m4512a(float f10, String str) {
        m4521a(str);
        StringBuilder sb = this.f4966a;
        sb.append(f10);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    private C6480i m4511a(double d10, String str) {
        m4521a(str);
        StringBuilder sb = this.f4966a;
        sb.append(d10);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    public final C6480i m4526a(String str, String str2) {
        m4521a(str2);
        if (str == null) {
            this.f4966a.append("null\n");
            return this;
        }
        StringBuilder sb = this.f4966a;
        sb.append(str);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    public final C6480i m4530a(byte[] bArr, String str) {
        m4521a(str);
        if (bArr == null) {
            this.f4966a.append("null\n");
            return this;
        }
        if (bArr.length == 0) {
            StringBuilder sb = this.f4966a;
            sb.append(bArr.length);
            sb.append(", []\n");
            return this;
        }
        StringBuilder sb2 = this.f4966a;
        sb2.append(bArr.length);
        sb2.append(", [\n");
        C6480i c6480i = new C6480i(this.f4966a, this.f4967b + 1);
        for (byte b10 : bArr) {
            c6480i.m4522a(b10, (String) null);
        }
        m4510a(']', (String) null);
        return this;
    }

    /* renamed from: a */
    private C6480i m4520a(short[] sArr, String str) {
        m4521a(str);
        if (sArr == null) {
            this.f4966a.append("null\n");
            return this;
        }
        if (sArr.length == 0) {
            StringBuilder sb = this.f4966a;
            sb.append(sArr.length);
            sb.append(", []\n");
            return this;
        }
        StringBuilder sb2 = this.f4966a;
        sb2.append(sArr.length);
        sb2.append(", [\n");
        C6480i c6480i = new C6480i(this.f4966a, this.f4967b + 1);
        for (short s10 : sArr) {
            c6480i.m4528a(s10, (String) null);
        }
        m4510a(']', (String) null);
        return this;
    }

    /* renamed from: a */
    private C6480i m4517a(int[] iArr, String str) {
        m4521a(str);
        if (iArr == null) {
            this.f4966a.append("null\n");
            return this;
        }
        if (iArr.length == 0) {
            StringBuilder sb = this.f4966a;
            sb.append(iArr.length);
            sb.append(", []\n");
            return this;
        }
        StringBuilder sb2 = this.f4966a;
        sb2.append(iArr.length);
        sb2.append(", [\n");
        C6480i c6480i = new C6480i(this.f4966a, this.f4967b + 1);
        for (int i10 : iArr) {
            c6480i.m4523a(i10, (String) null);
        }
        m4510a(']', (String) null);
        return this;
    }

    /* renamed from: a */
    private C6480i m4518a(long[] jArr, String str) {
        m4521a(str);
        if (jArr == null) {
            this.f4966a.append("null\n");
            return this;
        }
        if (jArr.length == 0) {
            StringBuilder sb = this.f4966a;
            sb.append(jArr.length);
            sb.append(", []\n");
            return this;
        }
        StringBuilder sb2 = this.f4966a;
        sb2.append(jArr.length);
        sb2.append(", [\n");
        C6480i c6480i = new C6480i(this.f4966a, this.f4967b + 1);
        for (long j10 : jArr) {
            c6480i.m4524a(j10, (String) null);
        }
        m4510a(']', (String) null);
        return this;
    }

    /* renamed from: a */
    private C6480i m4516a(float[] fArr, String str) {
        m4521a(str);
        if (fArr == null) {
            this.f4966a.append("null\n");
            return this;
        }
        if (fArr.length == 0) {
            StringBuilder sb = this.f4966a;
            sb.append(fArr.length);
            sb.append(", []\n");
            return this;
        }
        StringBuilder sb2 = this.f4966a;
        sb2.append(fArr.length);
        sb2.append(", [\n");
        C6480i c6480i = new C6480i(this.f4966a, this.f4967b + 1);
        for (float f10 : fArr) {
            c6480i.m4512a(f10, (String) null);
        }
        m4510a(']', (String) null);
        return this;
    }

    /* renamed from: a */
    private C6480i m4515a(double[] dArr, String str) {
        m4521a(str);
        if (dArr == null) {
            this.f4966a.append("null\n");
            return this;
        }
        if (dArr.length == 0) {
            StringBuilder sb = this.f4966a;
            sb.append(dArr.length);
            sb.append(", []\n");
            return this;
        }
        StringBuilder sb2 = this.f4966a;
        sb2.append(dArr.length);
        sb2.append(", [\n");
        C6480i c6480i = new C6480i(this.f4966a, this.f4967b + 1);
        for (double d10 : dArr) {
            c6480i.m4511a(d10, (String) null);
        }
        m4510a(']', (String) null);
        return this;
    }

    /* renamed from: a */
    public final <K, V> C6480i m4527a(Map<K, V> map, String str) {
        m4521a(str);
        if (map == null) {
            this.f4966a.append("null\n");
            return this;
        }
        if (map.isEmpty()) {
            StringBuilder sb = this.f4966a;
            sb.append(map.size());
            sb.append(", {}\n");
            return this;
        }
        StringBuilder sb2 = this.f4966a;
        sb2.append(map.size());
        sb2.append(", {\n");
        C6480i c6480i = new C6480i(this.f4966a, this.f4967b + 1);
        C6480i c6480i2 = new C6480i(this.f4966a, this.f4967b + 2);
        for (Map.Entry<K, V> entry : map.entrySet()) {
            c6480i.m4510a('(', (String) null);
            c6480i2.m4513a((C6480i) entry.getKey(), (String) null);
            c6480i2.m4513a((C6480i) entry.getValue(), (String) null);
            c6480i.m4510a(')', (String) null);
        }
        m4510a('}', (String) null);
        return this;
    }

    /* renamed from: a */
    private <T> C6480i m4519a(T[] tArr, String str) {
        m4521a(str);
        if (tArr == null) {
            this.f4966a.append("null\n");
            return this;
        }
        if (tArr.length == 0) {
            StringBuilder sb = this.f4966a;
            sb.append(tArr.length);
            sb.append(", []\n");
            return this;
        }
        StringBuilder sb2 = this.f4966a;
        sb2.append(tArr.length);
        sb2.append(", [\n");
        C6480i c6480i = new C6480i(this.f4966a, this.f4967b + 1);
        for (T t10 : tArr) {
            c6480i.m4513a((C6480i) t10, (String) null);
        }
        m4510a(']', (String) null);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private <T> C6480i m4514a(Collection<T> collection, String str) {
        if (collection == null) {
            m4521a(str);
            this.f4966a.append("null\t");
            return this;
        }
        return m4519a(collection.toArray(), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private <T> C6480i m4513a(T t10, String str) {
        if (t10 == 0) {
            this.f4966a.append("null\n");
            return this;
        }
        if (t10 instanceof Byte) {
            m4522a(((Byte) t10).byteValue(), str);
            return this;
        }
        if (t10 instanceof Boolean) {
            m4529a(((Boolean) t10).booleanValue(), str);
            return this;
        }
        if (t10 instanceof Short) {
            m4528a(((Short) t10).shortValue(), str);
            return this;
        }
        if (t10 instanceof Integer) {
            m4523a(((Integer) t10).intValue(), str);
            return this;
        }
        if (t10 instanceof Long) {
            m4524a(((Long) t10).longValue(), str);
            return this;
        }
        if (t10 instanceof Float) {
            m4512a(((Float) t10).floatValue(), str);
            return this;
        }
        if (t10 instanceof Double) {
            m4511a(((Double) t10).doubleValue(), str);
            return this;
        }
        if (t10 instanceof String) {
            m4526a((String) t10, str);
            return this;
        }
        if (t10 instanceof Map) {
            m4527a((Map) t10, str);
            return this;
        }
        if (t10 instanceof List) {
            m4514a((Collection) t10, str);
            return this;
        }
        if (t10 instanceof AbstractC6484m) {
            m4525a((AbstractC6484m) t10, str);
            return this;
        }
        if (t10 instanceof byte[]) {
            m4530a((byte[]) t10, str);
            return this;
        }
        if (t10 instanceof boolean[]) {
            m4513a((C6480i) t10, str);
            return this;
        }
        if (t10 instanceof short[]) {
            m4520a((short[]) t10, str);
            return this;
        }
        if (t10 instanceof int[]) {
            m4517a((int[]) t10, str);
            return this;
        }
        if (t10 instanceof long[]) {
            m4518a((long[]) t10, str);
            return this;
        }
        if (t10 instanceof float[]) {
            m4516a((float[]) t10, str);
            return this;
        }
        if (t10 instanceof double[]) {
            m4515a((double[]) t10, str);
            return this;
        }
        if (t10.getClass().isArray()) {
            m4519a((Object[]) t10, str);
            return this;
        }
        throw new C6481j("write object error: unsupport type.");
    }

    /* renamed from: a */
    public final C6480i m4525a(AbstractC6484m abstractC6484m, String str) {
        m4510a('{', str);
        if (abstractC6484m == null) {
            StringBuilder sb = this.f4966a;
            sb.append('\t');
            sb.append("null");
        } else {
            abstractC6484m.mo4497a(this.f4966a, this.f4967b + 1);
        }
        m4510a('}', (String) null);
        return this;
    }
}
