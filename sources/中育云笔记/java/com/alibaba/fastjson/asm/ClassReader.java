package com.alibaba.fastjson.asm;

import com.tendcloud.tenddata.C7863av;
import okio.Utf8;

/* loaded from: classes3.dex */
public class ClassReader {

    /* renamed from: b */
    public final byte[] f3981b;
    public final int header;
    private final int[] items;
    private final int maxStringLength;
    private boolean readAnnotations;
    private final String[] strings;

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ClassReader(java.io.InputStream r9, boolean r10) throws java.io.IOException {
        /*
            r8 = this;
            r8.<init>()
            r8.readAnnotations = r10
            java.io.ByteArrayOutputStream r10 = new java.io.ByteArrayOutputStream
            r10.<init>()
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]
        Le:
            int r1 = r9.read(r0)
            r2 = -1
            r3 = 0
            if (r1 != r2) goto L71
            r9.close()
            byte[] r9 = r10.toByteArray()
            r8.f3981b = r9
            r9 = 8
            int r9 = r8.readUnsignedShort(r9)
            int[] r9 = new int[r9]
            r8.items = r9
            int r9 = r9.length
            java.lang.String[] r10 = new java.lang.String[r9]
            r8.strings = r10
            r10 = 1
            r0 = 10
            r1 = r10
        L32:
            if (r1 >= r9) goto L6c
            int[] r2 = r8.items
            int r4 = r0 + 1
            r2[r1] = r4
            byte[] r2 = r8.f3981b
            r2 = r2[r0]
            r5 = 3
            if (r2 == r10) goto L61
            r4 = 15
            r6 = 4
            if (r2 == r4) goto L5f
            r4 = 18
            r7 = 5
            if (r2 == r4) goto L5d
            if (r2 == r5) goto L5d
            if (r2 == r6) goto L5d
            if (r2 == r7) goto L58
            r4 = 6
            if (r2 == r4) goto L58
            switch(r2) {
                case 9: goto L5d;
                case 10: goto L5d;
                case 11: goto L5d;
                case 12: goto L5d;
                default: goto L57;
            }
        L57:
            goto L69
        L58:
            int r1 = r1 + 1
            r5 = 9
            goto L69
        L5d:
            r5 = r7
            goto L69
        L5f:
            r5 = r6
            goto L69
        L61:
            int r2 = r8.readUnsignedShort(r4)
            int r5 = r5 + r2
            if (r5 <= r3) goto L69
            r3 = r5
        L69:
            int r0 = r0 + r5
            int r1 = r1 + r10
            goto L32
        L6c:
            r8.maxStringLength = r3
            r8.header = r0
            return
        L71:
            if (r1 <= 0) goto Le
            r10.write(r0, r3, r1)
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.asm.ClassReader.<init>(java.io.InputStream, boolean):void");
    }

    private int getAttributes() {
        int i10 = this.header;
        int unsignedShort = i10 + 8 + (readUnsignedShort(i10 + 6) * 2);
        for (int unsignedShort2 = readUnsignedShort(unsignedShort); unsignedShort2 > 0; unsignedShort2--) {
            for (int unsignedShort3 = readUnsignedShort(unsignedShort + 8); unsignedShort3 > 0; unsignedShort3--) {
                unsignedShort += readInt(unsignedShort + 12) + 6;
            }
            unsignedShort += 8;
        }
        int i11 = unsignedShort + 2;
        for (int unsignedShort4 = readUnsignedShort(i11); unsignedShort4 > 0; unsignedShort4--) {
            for (int unsignedShort5 = readUnsignedShort(i11 + 8); unsignedShort5 > 0; unsignedShort5--) {
                i11 += readInt(i11 + 12) + 6;
            }
            i11 += 8;
        }
        return i11 + 2;
    }

    private int readInt(int i10) {
        byte[] bArr = this.f3981b;
        return (bArr[i10 + 3] & C7863av.f14384i) | ((bArr[i10] & C7863av.f14384i) << 24) | ((bArr[i10 + 1] & C7863av.f14384i) << 16) | ((bArr[i10 + 2] & C7863av.f14384i) << 8);
    }

    private int readMethod(TypeCollector typeCollector, char[] cArr, int i10) {
        int unsignedShort = readUnsignedShort(i10);
        String utf8 = readUTF8(i10 + 2, cArr);
        String utf82 = readUTF8(i10 + 4, cArr);
        int i11 = i10 + 8;
        int i12 = 0;
        int i13 = 0;
        for (int unsignedShort2 = readUnsignedShort(i10 + 6); unsignedShort2 > 0; unsignedShort2--) {
            String utf83 = readUTF8(i11, cArr);
            int i14 = readInt(i11 + 2);
            int i15 = i11 + 6;
            if (utf83.equals("Code")) {
                i13 = i15;
            }
            i11 = i15 + i14;
        }
        MethodCollector methodCollectorVisitMethod = typeCollector.visitMethod(unsignedShort, utf8, utf82);
        if (methodCollectorVisitMethod != null && i13 != 0) {
            int i16 = i13 + 8 + readInt(i13 + 4);
            int i17 = i16 + 2;
            for (int unsignedShort3 = readUnsignedShort(i16); unsignedShort3 > 0; unsignedShort3--) {
                i17 += 8;
            }
            int i18 = i17 + 2;
            int i19 = 0;
            for (int unsignedShort4 = readUnsignedShort(i17); unsignedShort4 > 0; unsignedShort4--) {
                String utf84 = readUTF8(i18, cArr);
                if (utf84.equals("LocalVariableTable")) {
                    i12 = i18 + 6;
                } else if (utf84.equals("LocalVariableTypeTable")) {
                    i19 = i18 + 6;
                }
                i18 += readInt(i18 + 2) + 6;
            }
            if (i12 != 0) {
                if (i19 != 0) {
                    int unsignedShort5 = readUnsignedShort(i19) * 3;
                    int i20 = i19 + 2;
                    int[] iArr = new int[unsignedShort5];
                    while (unsignedShort5 > 0) {
                        iArr[unsignedShort5 - 1] = i20 + 6;
                        iArr[unsignedShort5 - 2] = readUnsignedShort(i20 + 8);
                        unsignedShort5 -= 3;
                        iArr[unsignedShort5] = readUnsignedShort(i20);
                        i20 += 10;
                    }
                }
                int i21 = i12 + 2;
                for (int unsignedShort6 = readUnsignedShort(i12); unsignedShort6 > 0; unsignedShort6--) {
                    methodCollectorVisitMethod.visitLocalVariable(readUTF8(i21 + 4, cArr), readUnsignedShort(i21 + 8));
                    i21 += 10;
                }
            }
        }
        return i11;
    }

    private String readUTF(int i10, int i11, char[] cArr) {
        int i12;
        int i13 = i11 + i10;
        byte[] bArr = this.f3981b;
        int i14 = 0;
        char c10 = 0;
        char c11 = 0;
        while (i10 < i13) {
            int i15 = i10 + 1;
            byte b10 = bArr[i10];
            if (c10 == 0) {
                int i16 = b10 & C7863av.f14384i;
                if (i16 < 128) {
                    cArr[i14] = (char) i16;
                    i14++;
                } else if (i16 >= 224 || i16 <= 191) {
                    c11 = (char) (b10 & 15);
                    c10 = 2;
                } else {
                    i12 = b10 & 31;
                    c11 = (char) i12;
                    c10 = 1;
                }
            } else if (c10 == 1) {
                cArr[i14] = (char) ((b10 & Utf8.REPLACEMENT_BYTE) | (c11 << 6));
                i14++;
                c10 = 0;
            } else if (c10 == 2) {
                i12 = (b10 & Utf8.REPLACEMENT_BYTE) | (c11 << 6);
                c11 = (char) i12;
                c10 = 1;
            }
            i10 = i15;
        }
        return new String(cArr, 0, i14);
    }

    private String readUTF8(int i10, char[] cArr) {
        int unsignedShort = readUnsignedShort(i10);
        String[] strArr = this.strings;
        String str = strArr[unsignedShort];
        if (str != null) {
            return str;
        }
        int i11 = this.items[unsignedShort];
        String utf = readUTF(i11 + 2, readUnsignedShort(i11), cArr);
        strArr[unsignedShort] = utf;
        return utf;
    }

    private int readUnsignedShort(int i10) {
        byte[] bArr = this.f3981b;
        return (bArr[i10 + 1] & C7863av.f14384i) | ((bArr[i10] & C7863av.f14384i) << 8);
    }

    public void accept(TypeCollector typeCollector) {
        int i10;
        char[] cArr = new char[this.maxStringLength];
        if (this.readAnnotations) {
            int attributes = getAttributes();
            for (int unsignedShort = readUnsignedShort(attributes); unsignedShort > 0; unsignedShort--) {
                if ("RuntimeVisibleAnnotations".equals(readUTF8(attributes + 2, cArr))) {
                    i10 = attributes + 8;
                    break;
                }
                attributes += readInt(attributes + 4) + 6;
            }
            i10 = 0;
        } else {
            i10 = 0;
        }
        int i11 = this.header;
        int unsignedShort2 = readUnsignedShort(i11 + 6);
        int i12 = i11 + 8;
        for (int i13 = 0; i13 < unsignedShort2; i13++) {
            i12 += 2;
        }
        int i14 = i12 + 2;
        int i15 = i14;
        for (int unsignedShort3 = readUnsignedShort(i12); unsignedShort3 > 0; unsignedShort3--) {
            i15 += 8;
            for (int unsignedShort4 = readUnsignedShort(i15 + 6); unsignedShort4 > 0; unsignedShort4--) {
                i15 += readInt(i15 + 2) + 6;
            }
        }
        int i16 = i15 + 2;
        for (int unsignedShort5 = readUnsignedShort(i15); unsignedShort5 > 0; unsignedShort5--) {
            i16 += 8;
            for (int unsignedShort6 = readUnsignedShort(i16 + 6); unsignedShort6 > 0; unsignedShort6--) {
                i16 += readInt(i16 + 2) + 6;
            }
        }
        int i17 = i16 + 2;
        for (int unsignedShort7 = readUnsignedShort(i16); unsignedShort7 > 0; unsignedShort7--) {
            i17 += readInt(i17 + 2) + 6;
        }
        if (i10 != 0) {
            int i18 = i10 + 2;
            for (int unsignedShort8 = readUnsignedShort(i10); unsignedShort8 > 0; unsignedShort8--) {
                typeCollector.visitAnnotation(readUTF8(i18, cArr));
            }
        }
        for (int unsignedShort9 = readUnsignedShort(i12); unsignedShort9 > 0; unsignedShort9--) {
            i14 += 8;
            for (int unsignedShort10 = readUnsignedShort(i14 + 6); unsignedShort10 > 0; unsignedShort10--) {
                i14 += readInt(i14 + 2) + 6;
            }
        }
        int method = i14 + 2;
        for (int unsignedShort11 = readUnsignedShort(i14); unsignedShort11 > 0; unsignedShort11--) {
            method = readMethod(typeCollector, cArr, method);
        }
    }
}
