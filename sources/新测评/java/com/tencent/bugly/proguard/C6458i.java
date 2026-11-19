package com.tencent.bugly.proguard;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.i */
/* loaded from: classes4.dex */
public final class C6458i {

    /* renamed from: a */
    private StringBuilder f5623a;

    /* renamed from: b */
    private int f5624b;

    public C6458i(StringBuilder sb, int i10) {
        this.f5623a = sb;
        this.f5624b = i10;
    }

    /* renamed from: a */
    private void m5161a(String str) {
        for (int i10 = 0; i10 < this.f5624b; i10++) {
            this.f5623a.append('\t');
        }
        if (str != null) {
            StringBuilder sb = this.f5623a;
            sb.append(str);
            sb.append(": ");
        }
    }

    /* renamed from: a */
    public final C6458i m5169a(boolean z9, String str) {
        m5161a(str);
        StringBuilder sb = this.f5623a;
        sb.append(z9 ? 'T' : 'F');
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    public final C6458i m5162a(byte b10, String str) {
        m5161a(str);
        StringBuilder sb = this.f5623a;
        sb.append((int) b10);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    private C6458i m5150a(char c10, String str) {
        m5161a(str);
        StringBuilder sb = this.f5623a;
        sb.append(c10);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    public final C6458i m5168a(short s10, String str) {
        m5161a(str);
        StringBuilder sb = this.f5623a;
        sb.append((int) s10);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    public final C6458i m5163a(int i10, String str) {
        m5161a(str);
        StringBuilder sb = this.f5623a;
        sb.append(i10);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    public final C6458i m5164a(long j10, String str) {
        m5161a(str);
        StringBuilder sb = this.f5623a;
        sb.append(j10);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    private C6458i m5152a(float f10, String str) {
        m5161a(str);
        StringBuilder sb = this.f5623a;
        sb.append(f10);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    private C6458i m5151a(double d10, String str) {
        m5161a(str);
        StringBuilder sb = this.f5623a;
        sb.append(d10);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    public final C6458i m5166a(String str, String str2) {
        m5161a(str2);
        if (str == null) {
            this.f5623a.append("null\n");
            return this;
        }
        StringBuilder sb = this.f5623a;
        sb.append(str);
        sb.append('\n');
        return this;
    }

    /* renamed from: a */
    public final C6458i m5170a(byte[] bArr, String str) {
        m5161a(str);
        if (bArr == null) {
            this.f5623a.append("null\n");
            return this;
        }
        if (bArr.length == 0) {
            StringBuilder sb = this.f5623a;
            sb.append(bArr.length);
            sb.append(", []\n");
            return this;
        }
        StringBuilder sb2 = this.f5623a;
        sb2.append(bArr.length);
        sb2.append(", [\n");
        C6458i c6458i = new C6458i(this.f5623a, this.f5624b + 1);
        for (byte b10 : bArr) {
            c6458i.m5162a(b10, (String) null);
        }
        m5150a(']', (String) null);
        return this;
    }

    /* renamed from: a */
    private C6458i m5160a(short[] sArr, String str) {
        m5161a(str);
        if (sArr == null) {
            this.f5623a.append("null\n");
            return this;
        }
        if (sArr.length == 0) {
            StringBuilder sb = this.f5623a;
            sb.append(sArr.length);
            sb.append(", []\n");
            return this;
        }
        StringBuilder sb2 = this.f5623a;
        sb2.append(sArr.length);
        sb2.append(", [\n");
        C6458i c6458i = new C6458i(this.f5623a, this.f5624b + 1);
        for (short s10 : sArr) {
            c6458i.m5168a(s10, (String) null);
        }
        m5150a(']', (String) null);
        return this;
    }

    /* renamed from: a */
    private C6458i m5157a(int[] iArr, String str) {
        m5161a(str);
        if (iArr == null) {
            this.f5623a.append("null\n");
            return this;
        }
        if (iArr.length == 0) {
            StringBuilder sb = this.f5623a;
            sb.append(iArr.length);
            sb.append(", []\n");
            return this;
        }
        StringBuilder sb2 = this.f5623a;
        sb2.append(iArr.length);
        sb2.append(", [\n");
        C6458i c6458i = new C6458i(this.f5623a, this.f5624b + 1);
        for (int i10 : iArr) {
            c6458i.m5163a(i10, (String) null);
        }
        m5150a(']', (String) null);
        return this;
    }

    /* renamed from: a */
    private C6458i m5158a(long[] jArr, String str) {
        m5161a(str);
        if (jArr == null) {
            this.f5623a.append("null\n");
            return this;
        }
        if (jArr.length == 0) {
            StringBuilder sb = this.f5623a;
            sb.append(jArr.length);
            sb.append(", []\n");
            return this;
        }
        StringBuilder sb2 = this.f5623a;
        sb2.append(jArr.length);
        sb2.append(", [\n");
        C6458i c6458i = new C6458i(this.f5623a, this.f5624b + 1);
        for (long j10 : jArr) {
            c6458i.m5164a(j10, (String) null);
        }
        m5150a(']', (String) null);
        return this;
    }

    /* renamed from: a */
    private C6458i m5156a(float[] fArr, String str) {
        m5161a(str);
        if (fArr == null) {
            this.f5623a.append("null\n");
            return this;
        }
        if (fArr.length == 0) {
            StringBuilder sb = this.f5623a;
            sb.append(fArr.length);
            sb.append(", []\n");
            return this;
        }
        StringBuilder sb2 = this.f5623a;
        sb2.append(fArr.length);
        sb2.append(", [\n");
        C6458i c6458i = new C6458i(this.f5623a, this.f5624b + 1);
        for (float f10 : fArr) {
            c6458i.m5152a(f10, (String) null);
        }
        m5150a(']', (String) null);
        return this;
    }

    /* renamed from: a */
    private C6458i m5155a(double[] dArr, String str) {
        m5161a(str);
        if (dArr == null) {
            this.f5623a.append("null\n");
            return this;
        }
        if (dArr.length == 0) {
            StringBuilder sb = this.f5623a;
            sb.append(dArr.length);
            sb.append(", []\n");
            return this;
        }
        StringBuilder sb2 = this.f5623a;
        sb2.append(dArr.length);
        sb2.append(", [\n");
        C6458i c6458i = new C6458i(this.f5623a, this.f5624b + 1);
        for (double d10 : dArr) {
            c6458i.m5151a(d10, (String) null);
        }
        m5150a(']', (String) null);
        return this;
    }

    /* renamed from: a */
    public final <K, V> C6458i m5167a(Map<K, V> map, String str) {
        m5161a(str);
        if (map == null) {
            this.f5623a.append("null\n");
            return this;
        }
        if (map.isEmpty()) {
            StringBuilder sb = this.f5623a;
            sb.append(map.size());
            sb.append(", {}\n");
            return this;
        }
        StringBuilder sb2 = this.f5623a;
        sb2.append(map.size());
        sb2.append(", {\n");
        C6458i c6458i = new C6458i(this.f5623a, this.f5624b + 1);
        C6458i c6458i2 = new C6458i(this.f5623a, this.f5624b + 2);
        for (Map.Entry<K, V> entry : map.entrySet()) {
            c6458i.m5150a('(', (String) null);
            c6458i2.m5153a((C6458i) entry.getKey(), (String) null);
            c6458i2.m5153a((C6458i) entry.getValue(), (String) null);
            c6458i.m5150a(')', (String) null);
        }
        m5150a('}', (String) null);
        return this;
    }

    /* renamed from: a */
    private <T> C6458i m5159a(T[] tArr, String str) {
        m5161a(str);
        if (tArr == null) {
            this.f5623a.append("null\n");
            return this;
        }
        if (tArr.length == 0) {
            StringBuilder sb = this.f5623a;
            sb.append(tArr.length);
            sb.append(", []\n");
            return this;
        }
        StringBuilder sb2 = this.f5623a;
        sb2.append(tArr.length);
        sb2.append(", [\n");
        C6458i c6458i = new C6458i(this.f5623a, this.f5624b + 1);
        for (T t10 : tArr) {
            c6458i.m5153a((C6458i) t10, (String) null);
        }
        m5150a(']', (String) null);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private <T> C6458i m5154a(Collection<T> collection, String str) {
        if (collection == null) {
            m5161a(str);
            this.f5623a.append("null\t");
            return this;
        }
        return m5159a(collection.toArray(), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private <T> C6458i m5153a(T t10, String str) {
        if (t10 == 0) {
            this.f5623a.append("null\n");
            return this;
        }
        if (t10 instanceof Byte) {
            m5162a(((Byte) t10).byteValue(), str);
            return this;
        }
        if (t10 instanceof Boolean) {
            m5169a(((Boolean) t10).booleanValue(), str);
            return this;
        }
        if (t10 instanceof Short) {
            m5168a(((Short) t10).shortValue(), str);
            return this;
        }
        if (t10 instanceof Integer) {
            m5163a(((Integer) t10).intValue(), str);
            return this;
        }
        if (t10 instanceof Long) {
            m5164a(((Long) t10).longValue(), str);
            return this;
        }
        if (t10 instanceof Float) {
            m5152a(((Float) t10).floatValue(), str);
            return this;
        }
        if (t10 instanceof Double) {
            m5151a(((Double) t10).doubleValue(), str);
            return this;
        }
        if (t10 instanceof String) {
            m5166a((String) t10, str);
            return this;
        }
        if (t10 instanceof Map) {
            m5167a((Map) t10, str);
            return this;
        }
        if (t10 instanceof List) {
            m5154a((Collection) t10, str);
            return this;
        }
        if (t10 instanceof AbstractC6462m) {
            m5165a((AbstractC6462m) t10, str);
            return this;
        }
        if (t10 instanceof byte[]) {
            m5170a((byte[]) t10, str);
            return this;
        }
        if (t10 instanceof boolean[]) {
            m5153a((C6458i) t10, str);
            return this;
        }
        if (t10 instanceof short[]) {
            m5160a((short[]) t10, str);
            return this;
        }
        if (t10 instanceof int[]) {
            m5157a((int[]) t10, str);
            return this;
        }
        if (t10 instanceof long[]) {
            m5158a((long[]) t10, str);
            return this;
        }
        if (t10 instanceof float[]) {
            m5156a((float[]) t10, str);
            return this;
        }
        if (t10 instanceof double[]) {
            m5155a((double[]) t10, str);
            return this;
        }
        if (t10.getClass().isArray()) {
            m5159a((Object[]) t10, str);
            return this;
        }
        throw new C6459j("write object error: unsupport type.");
    }

    /* renamed from: a */
    public final C6458i m5165a(AbstractC6462m abstractC6462m, String str) {
        m5150a('{', str);
        if (abstractC6462m == null) {
            StringBuilder sb = this.f5623a;
            sb.append('\t');
            sb.append("null");
        } else {
            abstractC6462m.mo5137a(this.f5623a, this.f5624b + 1);
        }
        m5150a('}', (String) null);
        return this;
    }
}
