package com.google.flatbuffers;

import androidx.collection.AbstractC0584a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import p032c8.C3238c;

/* renamed from: com.google.flatbuffers.a */
/* loaded from: classes2.dex */
public final class C3821a {

    /* renamed from: a */
    public ByteBuffer f2954a;

    /* renamed from: b */
    public int f2955b;

    /* renamed from: c */
    public int f2956c;

    /* renamed from: d */
    public int[] f2957d;

    /* renamed from: e */
    public int f2958e;

    /* renamed from: f */
    public boolean f2959f;

    /* renamed from: g */
    public boolean f2960g;

    /* renamed from: h */
    public int f2961h;

    /* renamed from: i */
    public int[] f2962i;

    /* renamed from: j */
    public int f2963j;

    /* renamed from: k */
    public int f2964k;

    /* renamed from: l */
    public boolean f2965l;

    /* renamed from: m */
    public final C3238c f2966m;

    public C3821a() {
        if (C3238c.f1804a == null) {
            C3238c.f1804a = new C3238c();
        }
        C3238c c3238c = C3238c.f1804a;
        this.f2956c = 1;
        this.f2957d = null;
        this.f2958e = 0;
        this.f2959f = false;
        this.f2960g = false;
        this.f2962i = new int[16];
        this.f2963j = 0;
        this.f2964k = 0;
        this.f2965l = false;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(1024).order(ByteOrder.LITTLE_ENDIAN);
        this.f2954a = byteBufferOrder;
        this.f2966m = c3238c;
        this.f2955b = byteBufferOrder.capacity();
    }

    /* renamed from: a */
    public final void m2766a(int i, int i8) {
        if (this.f2965l || i8 != 0) {
            m2773h(4, 0);
            m2774i(i8);
            m2776k(i);
        }
    }

    /* renamed from: b */
    public final void m2767b(int i, int i8) {
        if (this.f2965l || i8 != 0) {
            m2773h(4, 0);
            m2774i((m2772g() - i8) + 4);
            m2776k(i);
        }
    }

    /* renamed from: c */
    public final void m2768c(short s8) {
        m2773h(2, 0);
        ByteBuffer byteBuffer = this.f2954a;
        int i = this.f2955b - 2;
        this.f2955b = i;
        byteBuffer.putShort(i, s8);
    }

    /* renamed from: d */
    public final void m2769d(int i, int i8) {
        if (i8 != 0) {
            if (i8 != m2772g()) {
                throw new AssertionError("FlatBuffers: struct must be serialized inline.");
            }
            m2776k(i);
        }
    }

    /* renamed from: e */
    public final int m2770e(CharSequence charSequence) {
        char c;
        char c9;
        int i;
        int i8;
        char cCharAt;
        this.f2966m.getClass();
        int length = charSequence.length();
        final int i9 = 0;
        while (i9 < length && charSequence.charAt(i9) < 128) {
            i9++;
        }
        int i10 = length;
        while (true) {
            c = 55296;
            c9 = 2048;
            if (i9 >= length) {
                break;
            }
            char cCharAt2 = charSequence.charAt(i9);
            if (cCharAt2 < 2048) {
                i10 += (127 - cCharAt2) >>> 31;
                i9++;
            } else {
                final int length2 = charSequence.length();
                int i11 = 0;
                while (i9 < length2) {
                    char cCharAt3 = charSequence.charAt(i9);
                    if (cCharAt3 < 2048) {
                        i11 += (127 - cCharAt3) >>> 31;
                    } else {
                        i11 += 2;
                        if (55296 <= cCharAt3 && cCharAt3 <= 57343) {
                            if (Character.codePointAt(charSequence, i9) < 65536) {
                                throw new IllegalArgumentException(i9, length2) { // from class: com.google.flatbuffers.Utf8Safe$UnpairedSurrogateException
                                    {
                                        super(AbstractC0584a.m912m(i9, length2, "Unpaired surrogate at index ", " of "));
                                    }
                                };
                            }
                            i9++;
                        }
                    }
                    i9++;
                }
                i10 += i11;
            }
        }
        if (i10 < length) {
            throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i10 + 4294967296L));
        }
        m2773h(1, 0);
        ByteBuffer byteBuffer = this.f2954a;
        int i12 = this.f2955b - 1;
        this.f2955b = i12;
        byteBuffer.put(i12, (byte) 0);
        if (this.f2959f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
        this.f2964k = i10;
        m2773h(4, i10);
        m2773h(1, i10);
        this.f2959f = true;
        ByteBuffer byteBuffer2 = this.f2954a;
        int i13 = this.f2955b - i10;
        this.f2955b = i13;
        byteBuffer2.position(i13);
        ByteBuffer byteBuffer3 = this.f2954a;
        if (byteBuffer3.hasArray()) {
            int iArrayOffset = byteBuffer3.arrayOffset();
            byte[] bArrArray = byteBuffer3.array();
            int iPosition = byteBuffer3.position() + iArrayOffset;
            int iRemaining = byteBuffer3.remaining();
            final int length3 = charSequence.length();
            int i14 = iRemaining + iPosition;
            final int i15 = 0;
            while (i15 < length3) {
                int i16 = i15 + iPosition;
                if (i16 >= i14 || (cCharAt = charSequence.charAt(i15)) >= 128) {
                    break;
                }
                bArrArray[i16] = (byte) cCharAt;
                i15++;
            }
            if (i15 == length3) {
                i = iPosition + length3;
            } else {
                i = iPosition + i15;
                while (i15 < length3) {
                    char cCharAt4 = charSequence.charAt(i15);
                    if (cCharAt4 < 128 && i < i14) {
                        bArrArray[i] = (byte) cCharAt4;
                        i++;
                    } else if (cCharAt4 < c9 && i <= i14 - 2) {
                        int i17 = i + 1;
                        bArrArray[i] = (byte) ((cCharAt4 >>> 6) | 960);
                        i += 2;
                        bArrArray[i17] = (byte) ((cCharAt4 & '?') | 128);
                    } else {
                        if ((cCharAt4 >= c && 57343 >= cCharAt4) || i > i14 - 3) {
                            if (i > i14 - 4) {
                                if (55296 <= cCharAt4 && cCharAt4 <= 57343 && ((i8 = i15 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt4, charSequence.charAt(i8)))) {
                                    throw new IllegalArgumentException(i15, length3) { // from class: com.google.flatbuffers.Utf8Safe$UnpairedSurrogateException
                                        {
                                            super(AbstractC0584a.m912m(i15, length3, "Unpaired surrogate at index ", " of "));
                                        }
                                    };
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt4 + " at index " + i);
                            }
                            int i18 = i15 + 1;
                            if (i18 != charSequence.length()) {
                                char cCharAt5 = charSequence.charAt(i18);
                                if (Character.isSurrogatePair(cCharAt4, cCharAt5)) {
                                    int codePoint = Character.toCodePoint(cCharAt4, cCharAt5);
                                    bArrArray[i] = (byte) ((codePoint >>> 18) | 240);
                                    bArrArray[i + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i19 = i + 3;
                                    bArrArray[i + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i += 4;
                                    bArrArray[i19] = (byte) ((codePoint & 63) | 128);
                                    i15 = i18;
                                } else {
                                    i15 = i18;
                                }
                            }
                            final int i20 = i15 - 1;
                            throw new IllegalArgumentException(i20, length3) { // from class: com.google.flatbuffers.Utf8Safe$UnpairedSurrogateException
                                {
                                    super(AbstractC0584a.m912m(i20, length3, "Unpaired surrogate at index ", " of "));
                                }
                            };
                        }
                        bArrArray[i] = (byte) ((cCharAt4 >>> '\f') | 480);
                        int i21 = i + 2;
                        bArrArray[i + 1] = (byte) (((cCharAt4 >>> 6) & 63) | 128);
                        i += 3;
                        bArrArray[i21] = (byte) ((cCharAt4 & '?') | 128);
                    }
                    i15++;
                    c = 55296;
                    c9 = 2048;
                }
            }
            byteBuffer3.position(i - iArrayOffset);
        } else {
            final int length4 = charSequence.length();
            int iPosition2 = byteBuffer3.position();
            final int i22 = 0;
            while (i22 < length4) {
                try {
                    char cCharAt6 = charSequence.charAt(i22);
                    if (cCharAt6 >= 128) {
                        break;
                    }
                    byteBuffer3.put(iPosition2 + i22, (byte) cCharAt6);
                    i22++;
                } catch (IndexOutOfBoundsException unused) {
                }
            }
            if (i22 == length4) {
                byteBuffer3.position(iPosition2 + i22);
            } else {
                iPosition2 += i22;
                while (i22 < length4) {
                    char cCharAt7 = charSequence.charAt(i22);
                    if (cCharAt7 >= 128) {
                        if (cCharAt7 < 2048) {
                            int i23 = iPosition2 + 1;
                            try {
                                byteBuffer3.put(iPosition2, (byte) ((cCharAt7 >>> 6) | 192));
                                byteBuffer3.put(i23, (byte) ((cCharAt7 & '?') | 128));
                                iPosition2 = i23;
                            } catch (IndexOutOfBoundsException unused2) {
                                iPosition2 = i23;
                            }
                        } else {
                            if (cCharAt7 >= 55296 && 57343 >= cCharAt7) {
                                int i24 = i22 + 1;
                                if (i24 != length4) {
                                    try {
                                        char cCharAt8 = charSequence.charAt(i24);
                                        if (Character.isSurrogatePair(cCharAt7, cCharAt8)) {
                                            int codePoint2 = Character.toCodePoint(cCharAt7, cCharAt8);
                                            int i25 = iPosition2 + 1;
                                            try {
                                                byteBuffer3.put(iPosition2, (byte) ((codePoint2 >>> 18) | 240));
                                                int i26 = iPosition2 + 2;
                                                try {
                                                    byteBuffer3.put(i25, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                                    iPosition2 += 3;
                                                    byteBuffer3.put(i26, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                                    byteBuffer3.put(iPosition2, (byte) ((codePoint2 & 63) | 128));
                                                    i22 = i24;
                                                    i22++;
                                                    iPosition2++;
                                                } catch (IndexOutOfBoundsException unused3) {
                                                    i22 = i24;
                                                    iPosition2 = i26;
                                                }
                                            } catch (IndexOutOfBoundsException unused4) {
                                                iPosition2 = i25;
                                                i22 = i24;
                                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i22) + " at index " + (Math.max(i22, (iPosition2 - byteBuffer3.position()) + 1) + byteBuffer3.position()));
                                            }
                                        } else {
                                            i22 = i24;
                                        }
                                    } catch (IndexOutOfBoundsException unused5) {
                                    }
                                }
                                throw new IllegalArgumentException(i22, length4) { // from class: com.google.flatbuffers.Utf8Safe$UnpairedSurrogateException
                                    {
                                        super(AbstractC0584a.m912m(i22, length4, "Unpaired surrogate at index ", " of "));
                                    }
                                };
                            }
                            int i27 = iPosition2 + 1;
                            try {
                                byteBuffer3.put(iPosition2, (byte) ((cCharAt7 >>> '\f') | 224));
                                iPosition2 += 2;
                                byteBuffer3.put(i27, (byte) (((cCharAt7 >>> 6) & 63) | 128));
                                byteBuffer3.put(iPosition2, (byte) ((cCharAt7 & '?') | 128));
                                i22++;
                                iPosition2++;
                            } catch (IndexOutOfBoundsException unused6) {
                                iPosition2 = i27;
                            }
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i22) + " at index " + (Math.max(i22, (iPosition2 - byteBuffer3.position()) + 1) + byteBuffer3.position()));
                    }
                    byteBuffer3.put(iPosition2, (byte) cCharAt7);
                    i22++;
                    iPosition2++;
                }
                byteBuffer3.position(iPosition2);
            }
        }
        if (!this.f2959f) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.f2959f = false;
        m2774i(this.f2964k);
        return m2772g();
    }

    /* renamed from: f */
    public final int m2771f() {
        int i;
        if (this.f2957d == null || !this.f2959f) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        m2773h(4, 0);
        m2774i(0);
        int iM2772g = m2772g();
        int i8 = this.f2958e - 1;
        while (i8 >= 0 && this.f2957d[i8] == 0) {
            i8--;
        }
        for (int i9 = i8; i9 >= 0; i9--) {
            int i10 = this.f2957d[i9];
            m2768c((short) (i10 != 0 ? iM2772g - i10 : 0));
        }
        m2768c((short) (iM2772g - this.f2961h));
        m2768c((short) ((i8 + 3) * 2));
        int i11 = 0;
        loop2: while (true) {
            if (i11 >= this.f2963j) {
                i = 0;
                break;
            }
            int iCapacity = this.f2954a.capacity() - this.f2962i[i11];
            int i12 = this.f2955b;
            short s8 = this.f2954a.getShort(iCapacity);
            if (s8 == this.f2954a.getShort(i12)) {
                for (int i13 = 2; i13 < s8; i13 += 2) {
                    if (this.f2954a.getShort(iCapacity + i13) != this.f2954a.getShort(i12 + i13)) {
                        break;
                    }
                }
                i = this.f2962i[i11];
                break loop2;
            }
            i11++;
        }
        if (i != 0) {
            int iCapacity2 = this.f2954a.capacity() - iM2772g;
            this.f2955b = iCapacity2;
            this.f2954a.putInt(iCapacity2, i - iM2772g);
        } else {
            int i14 = this.f2963j;
            int[] iArr = this.f2962i;
            if (i14 == iArr.length) {
                this.f2962i = Arrays.copyOf(iArr, i14 * 2);
            }
            int[] iArr2 = this.f2962i;
            int i15 = this.f2963j;
            this.f2963j = i15 + 1;
            iArr2[i15] = m2772g();
            ByteBuffer byteBuffer = this.f2954a;
            byteBuffer.putInt(byteBuffer.capacity() - iM2772g, m2772g() - iM2772g);
        }
        this.f2959f = false;
        return iM2772g;
    }

    /* renamed from: g */
    public final int m2772g() {
        return this.f2954a.capacity() - this.f2955b;
    }

    /* renamed from: h */
    public final void m2773h(int i, int i8) {
        if (i > this.f2956c) {
            this.f2956c = i;
        }
        int i9 = ((~((this.f2954a.capacity() - this.f2955b) + i8)) + 1) & (i - 1);
        while (this.f2955b < i9 + i + i8) {
            int iCapacity = this.f2954a.capacity();
            ByteBuffer byteBuffer = this.f2954a;
            int iCapacity2 = byteBuffer.capacity();
            if (((-1073741824) & iCapacity2) != 0) {
                throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
            }
            int i10 = iCapacity2 == 0 ? 1 : iCapacity2 << 1;
            byteBuffer.position(0);
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.position(byteBufferOrder.clear().capacity() - iCapacity2);
            byteBufferOrder.put(byteBuffer);
            this.f2954a = byteBufferOrder;
            this.f2955b = (byteBufferOrder.capacity() - iCapacity) + this.f2955b;
        }
        for (int i11 = 0; i11 < i9; i11++) {
            ByteBuffer byteBuffer2 = this.f2954a;
            int i12 = this.f2955b - 1;
            this.f2955b = i12;
            byteBuffer2.put(i12, (byte) 0);
        }
    }

    /* renamed from: i */
    public final void m2774i(int i) {
        ByteBuffer byteBuffer = this.f2954a;
        int i8 = this.f2955b - 4;
        this.f2955b = i8;
        byteBuffer.putInt(i8, i);
    }

    /* renamed from: j */
    public final byte[] m2775j() {
        int i = this.f2955b;
        int iCapacity = this.f2954a.capacity() - this.f2955b;
        if (!this.f2960g) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
        byte[] bArr = new byte[iCapacity];
        this.f2954a.position(i);
        this.f2954a.get(bArr);
        return bArr;
    }

    /* renamed from: k */
    public final void m2776k(int i) {
        this.f2957d[i] = m2772g();
    }

    /* renamed from: l */
    public final void m2777l(int i) {
        if (this.f2959f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
        int[] iArr = this.f2957d;
        if (iArr == null || iArr.length < i) {
            this.f2957d = new int[i];
        }
        this.f2958e = i;
        Arrays.fill(this.f2957d, 0, i, 0);
        this.f2959f = true;
        this.f2961h = m2772g();
    }
}
