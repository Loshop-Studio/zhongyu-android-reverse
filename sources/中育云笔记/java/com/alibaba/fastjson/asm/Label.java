package com.alibaba.fastjson.asm;

/* loaded from: classes3.dex */
public class Label {
    static final int FORWARD_REFERENCE_HANDLE_MASK = 268435455;
    static final int FORWARD_REFERENCE_TYPE_MASK = -268435456;
    static final int FORWARD_REFERENCE_TYPE_SHORT = 268435456;
    static final int FORWARD_REFERENCE_TYPE_WIDE = 536870912;
    int inputStackTop;
    Label next;
    int outputStackMax;
    int position;
    private int referenceCount;
    private int[] srcAndRefPositions;
    int status;
    Label successor;

    private void addReference(int i10, int i11, int i12) {
        if (this.srcAndRefPositions == null) {
            this.srcAndRefPositions = new int[6];
        }
        int i13 = this.referenceCount;
        int[] iArr = this.srcAndRefPositions;
        if (i13 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 6];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.srcAndRefPositions = iArr2;
        }
        int[] iArr3 = this.srcAndRefPositions;
        int i14 = this.referenceCount;
        int i15 = i14 + 1;
        this.referenceCount = i15;
        iArr3[i14] = i10;
        this.referenceCount = i14 + 2;
        iArr3[i15] = i11 | i12;
    }

    public void put(MethodWriter methodWriter, ByteVector byteVector, int i10, boolean z10) {
        if ((this.status & 2) != 0) {
            if (z10) {
                byteVector.putInt(this.position - i10);
                return;
            } else {
                byteVector.putShort(this.position - i10);
                return;
            }
        }
        if (z10) {
            addReference(i10, byteVector.length, FORWARD_REFERENCE_TYPE_WIDE);
            byteVector.putInt(-1);
        } else {
            addReference(i10, byteVector.length, FORWARD_REFERENCE_TYPE_SHORT);
            byteVector.putShort(-1);
        }
    }

    public void resolve(MethodWriter methodWriter, int i10, byte[] bArr) {
        this.status |= 2;
        this.position = i10;
        int i11 = 0;
        while (i11 < this.referenceCount) {
            int[] iArr = this.srcAndRefPositions;
            int i12 = i11 + 1;
            int i13 = iArr[i11];
            i11 += 2;
            int i14 = iArr[i12];
            int i15 = FORWARD_REFERENCE_HANDLE_MASK & i14;
            int i16 = i10 - i13;
            if ((i14 & FORWARD_REFERENCE_TYPE_MASK) == FORWARD_REFERENCE_TYPE_SHORT) {
                bArr[i15] = (byte) (i16 >>> 8);
                bArr[i15 + 1] = (byte) i16;
            } else {
                bArr[i15] = (byte) (i16 >>> 24);
                bArr[i15 + 1] = (byte) (i16 >>> 16);
                bArr[i15 + 2] = (byte) (i16 >>> 8);
                bArr[i15 + 3] = (byte) i16;
            }
        }
    }
}
