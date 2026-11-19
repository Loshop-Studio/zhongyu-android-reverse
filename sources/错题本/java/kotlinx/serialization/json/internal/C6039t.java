package kotlinx.serialization.json.internal;

import androidx.compose.material3.AbstractC1923c;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5830k;
import p054e7.C5486r;
import p084i7.InterfaceC5685a;
import p101k7.InterfaceC5765g;
import p109l7.AbstractC6067a;
import p109l7.InterfaceC6069c;
import p109l7.InterfaceC6071e;
import p125n7.AbstractC6227b;
import p125n7.AbstractC6235j;
import p125n7.C6232g;
import p125n7.InterfaceC6233h;
import p133o7.AbstractC6281e;

/* renamed from: kotlinx.serialization.json.internal.t */
/* loaded from: classes4.dex */
public final class C6039t extends AbstractC6067a implements InterfaceC6233h {

    /* renamed from: a */
    public final AbstractC6227b f9578a;

    /* renamed from: b */
    public final WriteMode f9579b;

    /* renamed from: c */
    public final C6043x f9580c;

    /* renamed from: d */
    public final AbstractC6281e f9581d;

    /* renamed from: e */
    public int f9582e;

    /* renamed from: f */
    public C5486r f9583f;

    /* renamed from: g */
    public final C6028i f9584g;

    public C6039t(AbstractC6227b json, WriteMode mode, C6043x c6043x, InterfaceC5765g descriptor, C5486r c5486r) {
        AbstractC5830k.m5330g(json, "json");
        AbstractC5830k.m5330g(mode, "mode");
        AbstractC5830k.m5330g(descriptor, "descriptor");
        this.f9578a = json;
        this.f9579b = mode;
        this.f9580c = c6043x;
        this.f9581d = json.f9967b;
        this.f9582e = -1;
        this.f9583f = c5486r;
        this.f9584g = json.f9966a.f9977c ? null : new C6028i(descriptor);
    }

    @Override // p125n7.InterfaceC6233h
    /* renamed from: a */
    public final AbstractC6235j mo5658a() {
        return new C6036q(this.f9578a.f9966a, this.f9580c).m5702b();
    }

    @Override // p109l7.AbstractC6067a, p109l7.InterfaceC6071e
    public final InterfaceC6069c beginStructure(InterfaceC5765g descriptor) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        AbstractC6227b abstractC6227b = this.f9578a;
        WriteMode writeModeM5696q = AbstractC6029j.m5696q(descriptor, abstractC6227b);
        C6043x c6043x = this.f9580c;
        C6031l c6031l = (C6031l) c6043x.f9598c;
        int i = c6031l.f9559b + 1;
        c6031l.f9559b = i;
        Object[] objArr = (Object[]) c6031l.f9560c;
        if (i == objArr.length) {
            int i8 = i * 2;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i8);
            AbstractC5830k.m5329f(objArrCopyOf, "copyOf(...)");
            c6031l.f9560c = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf((int[]) c6031l.f9561d, i8);
            AbstractC5830k.m5329f(iArrCopyOf, "copyOf(...)");
            c6031l.f9561d = iArrCopyOf;
        }
        ((Object[]) c6031l.f9560c)[i] = descriptor;
        c6043x.m5713g(writeModeM5696q.begin);
        if (c6043x.m5722q() != 4) {
            int i9 = AbstractC6038s.f9577a[writeModeM5696q.ordinal()];
            return (i9 == 1 || i9 == 2 || i9 == 3) ? new C6039t(this.f9578a, writeModeM5696q, c6043x, descriptor, this.f9583f) : (this.f9579b == writeModeM5696q && abstractC6227b.f9966a.f9977c) ? this : new C6039t(this.f9578a, writeModeM5696q, c6043x, descriptor, this.f9583f);
        }
        C6043x.m5706m(c6043x, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    @Override // p109l7.AbstractC6067a, p109l7.InterfaceC6071e
    public final boolean decodeBoolean() {
        boolean z8;
        boolean z9;
        C6043x c6043x = this.f9580c;
        int iM5725t = c6043x.m5725t();
        String str = (String) c6043x.f9600e;
        if (iM5725t == str.length()) {
            C6043x.m5706m(c6043x, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iM5725t) == '\"') {
            iM5725t++;
            z8 = true;
        } else {
            z8 = false;
        }
        int iM5724s = c6043x.m5724s(iM5725t);
        if (iM5724s >= str.length() || iM5724s == -1) {
            C6043x.m5706m(c6043x, "EOF", 0, null, 6);
            throw null;
        }
        int i = iM5724s + 1;
        int iCharAt = str.charAt(iM5724s) | ' ';
        if (iCharAt == 102) {
            c6043x.m5709c(i, "alse");
            z9 = false;
        } else {
            if (iCharAt != 116) {
                C6043x.m5706m(c6043x, "Expected valid boolean literal prefix, but had '" + c6043x.m5716j() + '\'', 0, null, 6);
                throw null;
            }
            c6043x.m5709c(i, "rue");
            z9 = true;
        }
        if (!z8) {
            return z9;
        }
        if (c6043x.f9597b == str.length()) {
            C6043x.m5706m(c6043x, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(c6043x.f9597b) == '\"') {
            c6043x.f9597b++;
            return z9;
        }
        C6043x.m5706m(c6043x, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // p109l7.AbstractC6067a, p109l7.InterfaceC6071e
    public final byte decodeByte() {
        C6043x c6043x = this.f9580c;
        long jM5714h = c6043x.m5714h();
        byte b6 = (byte) jM5714h;
        if (jM5714h == b6) {
            return b6;
        }
        C6043x.m5706m(c6043x, "Failed to parse byte for input '" + jM5714h + '\'', 0, null, 6);
        throw null;
    }

    @Override // p109l7.AbstractC6067a, p109l7.InterfaceC6071e
    public final char decodeChar() {
        C6043x c6043x = this.f9580c;
        String strM5716j = c6043x.m5716j();
        if (strM5716j.length() == 1) {
            return strM5716j.charAt(0);
        }
        C6043x.m5706m(c6043x, AbstractC1923c.m1047k('\'', "Expected single char, but got '", strM5716j), 0, null, 6);
        throw null;
    }

    @Override // p109l7.AbstractC6067a, p109l7.InterfaceC6071e
    public final double decodeDouble() throws NumberFormatException {
        C6043x c6043x = this.f9580c;
        String strM5716j = c6043x.m5716j();
        try {
            double d9 = Double.parseDouble(strM5716j);
            C6232g c6232g = this.f9578a.f9966a;
            if (Math.abs(d9) <= Double.MAX_VALUE) {
                return d9;
            }
            AbstractC6029j.m5697r(c6043x, Double.valueOf(d9));
            throw null;
        } catch (IllegalArgumentException unused) {
            C6043x.m5706m(c6043x, AbstractC1923c.m1047k('\'', "Failed to parse type 'double' for input '", strM5716j), 0, null, 6);
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
    
        r14 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ac, code lost:
    
        r1 = r3.f9559b;
        r6 = (int[]) r3.f9561d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b5, code lost:
    
        if (r6[r1] != (-2)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b7, code lost:
    
        r6[r1] = -1;
        r3.f9559b = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bc, code lost:
    
        r1 = r3.f9559b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
    
        if (r1 == (-1)) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c0, code lost:
    
        r3.f9559b = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c3, code lost:
    
        r1 = kotlin.text.AbstractC5855p.m5384R(6, r4.subSequence(0, r2.f9597b).toString(), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0105, code lost:
    
        throw new kotlinx.serialization.json.internal.JsonDecodingException("Encountered an unknown key '" + r5 + "' at offset " + r1 + " at path: " + r3.m5699a() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((java.lang.Object) kotlinx.serialization.json.internal.AbstractC6029j.m5693n(r4, r1)));
     */
    @Override // p109l7.InterfaceC6069c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int decodeElementIndex(p101k7.InterfaceC5765g r22) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.C6039t.decodeElementIndex(k7.g):int");
    }

    @Override // p109l7.AbstractC6067a, p109l7.InterfaceC6071e
    public final int decodeEnum(InterfaceC5765g enumDescriptor) {
        AbstractC5830k.m5330g(enumDescriptor, "enumDescriptor");
        C6043x c6043x = this.f9580c;
        return AbstractC6029j.m5690k(enumDescriptor, this.f9578a, c6043x.m5715i(), " at path " + ((C6031l) c6043x.f9598c).m5699a());
    }

    @Override // p109l7.AbstractC6067a, p109l7.InterfaceC6071e
    public final float decodeFloat() throws NumberFormatException {
        C6043x c6043x = this.f9580c;
        String strM5716j = c6043x.m5716j();
        try {
            float f = Float.parseFloat(strM5716j);
            C6232g c6232g = this.f9578a.f9966a;
            if (Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            AbstractC6029j.m5697r(c6043x, Float.valueOf(f));
            throw null;
        } catch (IllegalArgumentException unused) {
            C6043x.m5706m(c6043x, AbstractC1923c.m1047k('\'', "Failed to parse type 'float' for input '", strM5716j), 0, null, 6);
            throw null;
        }
    }

    @Override // p109l7.AbstractC6067a, p109l7.InterfaceC6071e
    public final InterfaceC6071e decodeInline(InterfaceC5765g descriptor) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        return AbstractC6042w.m5705a(descriptor) ? new C6027h(this.f9580c, this.f9578a) : super.decodeInline(descriptor);
    }

    @Override // p109l7.AbstractC6067a, p109l7.InterfaceC6071e
    public final int decodeInt() {
        C6043x c6043x = this.f9580c;
        long jM5714h = c6043x.m5714h();
        int i = (int) jM5714h;
        if (jM5714h == i) {
            return i;
        }
        C6043x.m5706m(c6043x, "Failed to parse int for input '" + jM5714h + '\'', 0, null, 6);
        throw null;
    }

    @Override // p109l7.AbstractC6067a, p109l7.InterfaceC6071e
    public final long decodeLong() {
        return this.f9580c.m5714h();
    }

    @Override // p109l7.AbstractC6067a, p109l7.InterfaceC6071e
    public final boolean decodeNotNullMark() {
        C6028i c6028i = this.f9584g;
        if (!(c6028i != null ? c6028i.f9555b : false)) {
            C6043x c6043x = this.f9580c;
            int iM5724s = c6043x.m5724s(c6043x.m5725t());
            String str = (String) c6043x.f9600e;
            int length = str.length() - iM5724s;
            boolean z8 = false;
            if (length >= 4 && iM5724s != -1) {
                int i = 0;
                while (true) {
                    if (i < 4) {
                        if ("null".charAt(i) != str.charAt(iM5724s + i)) {
                            break;
                        }
                        i++;
                    } else if (length <= 4 || AbstractC6029j.m5686g(str.charAt(iM5724s + 4)) != 0) {
                        z8 = true;
                        c6043x.f9597b = iM5724s + 4;
                    }
                }
            }
            if (!z8) {
                return true;
            }
        }
        return false;
    }

    @Override // p109l7.AbstractC6067a, p109l7.InterfaceC6071e
    public final Void decodeNull() {
        return null;
    }

    @Override // p109l7.AbstractC6067a, p109l7.InterfaceC6069c
    public final Object decodeSerializableElement(InterfaceC5765g descriptor, int i, InterfaceC5685a deserializer, Object obj) {
        C6031l c6031l = (C6031l) this.f9580c.f9598c;
        AbstractC5830k.m5330g(descriptor, "descriptor");
        AbstractC5830k.m5330g(deserializer, "deserializer");
        boolean z8 = this.f9579b == WriteMode.MAP && (i & 1) == 0;
        if (z8) {
            int[] iArr = (int[]) c6031l.f9561d;
            int i8 = c6031l.f9559b;
            if (iArr[i8] == -2) {
                ((Object[]) c6031l.f9560c)[i8] = C6030k.f9557a;
            }
        }
        Object objDecodeSerializableElement = super.decodeSerializableElement(descriptor, i, deserializer, obj);
        if (z8) {
            int[] iArr2 = (int[]) c6031l.f9561d;
            int i9 = c6031l.f9559b;
            if (iArr2[i9] != -2) {
                int i10 = i9 + 1;
                c6031l.f9559b = i10;
                Object[] objArr = (Object[]) c6031l.f9560c;
                if (i10 == objArr.length) {
                    int i11 = i10 * 2;
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, i11);
                    AbstractC5830k.m5329f(objArrCopyOf, "copyOf(...)");
                    c6031l.f9560c = objArrCopyOf;
                    int[] iArrCopyOf = Arrays.copyOf((int[]) c6031l.f9561d, i11);
                    AbstractC5830k.m5329f(iArrCopyOf, "copyOf(...)");
                    c6031l.f9561d = iArrCopyOf;
                }
            }
            Object[] objArr2 = (Object[]) c6031l.f9560c;
            int i12 = c6031l.f9559b;
            objArr2[i12] = objDecodeSerializableElement;
            ((int[]) c6031l.f9561d)[i12] = -2;
        }
        return objDecodeSerializableElement;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0126  */
    @Override // p109l7.InterfaceC6071e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object decodeSerializableValue(p084i7.InterfaceC5685a r11) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.C6039t.decodeSerializableValue(i7.a):java.lang.Object");
    }

    @Override // p109l7.AbstractC6067a, p109l7.InterfaceC6071e
    public final short decodeShort() {
        C6043x c6043x = this.f9580c;
        long jM5714h = c6043x.m5714h();
        short s8 = (short) jM5714h;
        if (jM5714h == s8) {
            return s8;
        }
        C6043x.m5706m(c6043x, "Failed to parse short for input '" + jM5714h + '\'', 0, null, 6);
        throw null;
    }

    @Override // p109l7.AbstractC6067a, p109l7.InterfaceC6071e
    public final String decodeString() {
        return this.f9580c.m5715i();
    }

    @Override // p109l7.AbstractC6067a, p109l7.InterfaceC6069c
    public final void endStructure(InterfaceC5765g descriptor) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        int iMo5101d = descriptor.mo5101d();
        AbstractC6227b abstractC6227b = this.f9578a;
        if (iMo5101d == 0 && AbstractC6029j.m5691l(descriptor, abstractC6227b)) {
            while (decodeElementIndex(descriptor) != -1) {
            }
        }
        C6043x c6043x = this.f9580c;
        if (c6043x.m5726u()) {
            C6232g c6232g = abstractC6227b.f9966a;
            AbstractC6029j.m5692m(c6043x, "");
            throw null;
        }
        c6043x.m5713g(this.f9579b.end);
        C6031l c6031l = (C6031l) c6043x.f9598c;
        int i = c6031l.f9559b;
        int[] iArr = (int[]) c6031l.f9561d;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            c6031l.f9559b = i - 1;
        }
        int i8 = c6031l.f9559b;
        if (i8 != -1) {
            c6031l.f9559b = i8 - 1;
        }
    }

    @Override // p109l7.InterfaceC6069c
    public final AbstractC6281e getSerializersModule() {
        return this.f9581d;
    }
}
