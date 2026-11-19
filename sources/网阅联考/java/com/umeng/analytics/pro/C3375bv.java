package com.umeng.analytics.pro;

import java.util.BitSet;

/* renamed from: com.umeng.analytics.pro.bv */
/* loaded from: classes2.dex */
public final class C3375bv extends C3363bj {

    /* renamed from: com.umeng.analytics.pro.bv$a */
    public static class a implements InterfaceC3371br {
        @Override // com.umeng.analytics.pro.InterfaceC3371br
        /* renamed from: a */
        public AbstractC3369bp mo3081a(AbstractC3384cd abstractC3384cd) {
            return new C3375bv(abstractC3384cd);
        }
    }

    public C3375bv(AbstractC3384cd abstractC3384cd) {
        super(abstractC3384cd);
    }

    @Override // com.umeng.analytics.pro.AbstractC3369bp
    /* renamed from: D */
    public Class<? extends InterfaceC3377bx> mo3106D() {
        return AbstractC3381ca.class;
    }

    /* renamed from: a */
    public void m3114a(BitSet bitSet, int i4) throws C3349aw {
        for (byte b4 : m3113b(bitSet, i4)) {
            mo3039a(b4);
        }
    }

    /* renamed from: b */
    public BitSet m3115b(int i4) throws C3349aw {
        int iCeil = (int) Math.ceil(i4 / 8.0d);
        byte[] bArr = new byte[iCeil];
        for (int i5 = 0; i5 < iCeil; i5++) {
            bArr[i5] = mo3075u();
        }
        return m3112a(bArr);
    }

    /* renamed from: a */
    public static BitSet m3112a(byte[] bArr) {
        BitSet bitSet = new BitSet();
        for (int i4 = 0; i4 < bArr.length * 8; i4++) {
            if ((bArr[(bArr.length - (i4 / 8)) - 1] & (1 << (i4 % 8))) > 0) {
                bitSet.set(i4);
            }
        }
        return bitSet;
    }

    /* renamed from: b */
    public static byte[] m3113b(BitSet bitSet, int i4) {
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
