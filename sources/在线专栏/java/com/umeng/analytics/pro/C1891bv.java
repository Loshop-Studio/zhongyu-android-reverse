package com.umeng.analytics.pro;

import java.util.BitSet;

/* renamed from: com.umeng.analytics.pro.bv */
/* loaded from: classes.dex */
public final class C1891bv extends C1879bj {

    /* renamed from: com.umeng.analytics.pro.bv$a */
    public static class a implements InterfaceC1887br {
        @Override // com.umeng.analytics.pro.InterfaceC1887br
        /* renamed from: a */
        public AbstractC1885bp mo7004a(AbstractC1900cd abstractC1900cd) {
            return new C1891bv(abstractC1900cd);
        }
    }

    public C1891bv(AbstractC1900cd abstractC1900cd) {
        super(abstractC1900cd);
    }

    @Override // com.umeng.analytics.pro.AbstractC1885bp
    /* renamed from: D */
    public Class<? extends InterfaceC1893bx> mo7029D() {
        return AbstractC1897ca.class;
    }

    /* renamed from: a */
    public void m7037a(BitSet bitSet, int i4) throws C1865aw {
        for (byte b4 : m7036b(bitSet, i4)) {
            mo6962a(b4);
        }
    }

    /* renamed from: b */
    public BitSet m7038b(int i4) throws C1865aw {
        int iCeil = (int) Math.ceil(i4 / 8.0d);
        byte[] bArr = new byte[iCeil];
        for (int i5 = 0; i5 < iCeil; i5++) {
            bArr[i5] = mo6998u();
        }
        return m7035a(bArr);
    }

    /* renamed from: a */
    public static BitSet m7035a(byte[] bArr) {
        BitSet bitSet = new BitSet();
        for (int i4 = 0; i4 < bArr.length * 8; i4++) {
            if ((bArr[(bArr.length - (i4 / 8)) - 1] & (1 << (i4 % 8))) > 0) {
                bitSet.set(i4);
            }
        }
        return bitSet;
    }

    /* renamed from: b */
    public static byte[] m7036b(BitSet bitSet, int i4) {
        int iCeil = (int) Math.ceil(i4 / 8.0d);
        byte[] bArr = new byte[iCeil];
        for (int i5 = 0; i5 < bitSet.length(); i5++) {
            if (bitSet.get(i5)) {
                int i6 = (iCeil - (i5 / 8)) - 1;
                bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
            }
        }
        return bArr;
    }
}
