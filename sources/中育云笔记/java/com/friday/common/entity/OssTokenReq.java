package com.friday.common.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class OssTokenReq {
    public static final int $stable = 0;

    /* renamed from: fc */
    private final int f6026fc;

    /* renamed from: fe */
    private final String f6027fe;

    /* renamed from: fo */
    private final String f6028fo;

    /* renamed from: fr */
    private final int f6029fr;

    /* renamed from: ft */
    private final int f6030ft;
    private final String nonce;
    private final String sign;

    /* renamed from: ts */
    private final long f6031ts;

    public OssTokenReq(int i10, int i11, String fe2, int i12, String fo, String nonce, long j10, String sign) {
        AbstractC9979u.m20294g(fe2, "fe");
        AbstractC9979u.m20294g(fo, "fo");
        AbstractC9979u.m20294g(nonce, "nonce");
        AbstractC9979u.m20294g(sign, "sign");
        this.f6026fc = i10;
        this.f6030ft = i11;
        this.f6027fe = fe2;
        this.f6029fr = i12;
        this.f6028fo = fo;
        this.nonce = nonce;
        this.f6031ts = j10;
        this.sign = sign;
    }

    public static /* synthetic */ OssTokenReq copy$default(OssTokenReq ossTokenReq, int i10, int i11, String str, int i12, String str2, String str3, long j10, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = ossTokenReq.f6026fc;
        }
        if ((i13 & 2) != 0) {
            i11 = ossTokenReq.f6030ft;
        }
        if ((i13 & 4) != 0) {
            str = ossTokenReq.f6027fe;
        }
        if ((i13 & 8) != 0) {
            i12 = ossTokenReq.f6029fr;
        }
        if ((i13 & 16) != 0) {
            str2 = ossTokenReq.f6028fo;
        }
        if ((i13 & 32) != 0) {
            str3 = ossTokenReq.nonce;
        }
        if ((i13 & 64) != 0) {
            j10 = ossTokenReq.f6031ts;
        }
        if ((i13 & 128) != 0) {
            str4 = ossTokenReq.sign;
        }
        String str5 = str4;
        long j11 = j10;
        String str6 = str2;
        String str7 = str3;
        return ossTokenReq.copy(i10, i11, str, i12, str6, str7, j11, str5);
    }

    public final int component1() {
        return this.f6026fc;
    }

    public final int component2() {
        return this.f6030ft;
    }

    public final String component3() {
        return this.f6027fe;
    }

    public final int component4() {
        return this.f6029fr;
    }

    public final String component5() {
        return this.f6028fo;
    }

    public final String component6() {
        return this.nonce;
    }

    public final long component7() {
        return this.f6031ts;
    }

    public final String component8() {
        return this.sign;
    }

    public final OssTokenReq copy(int i10, int i11, String fe2, int i12, String fo, String nonce, long j10, String sign) {
        AbstractC9979u.m20294g(fe2, "fe");
        AbstractC9979u.m20294g(fo, "fo");
        AbstractC9979u.m20294g(nonce, "nonce");
        AbstractC9979u.m20294g(sign, "sign");
        return new OssTokenReq(i10, i11, fe2, i12, fo, nonce, j10, sign);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OssTokenReq)) {
            return false;
        }
        OssTokenReq ossTokenReq = (OssTokenReq) obj;
        return this.f6026fc == ossTokenReq.f6026fc && this.f6030ft == ossTokenReq.f6030ft && AbstractC9979u.m20289b(this.f6027fe, ossTokenReq.f6027fe) && this.f6029fr == ossTokenReq.f6029fr && AbstractC9979u.m20289b(this.f6028fo, ossTokenReq.f6028fo) && AbstractC9979u.m20289b(this.nonce, ossTokenReq.nonce) && this.f6031ts == ossTokenReq.f6031ts && AbstractC9979u.m20289b(this.sign, ossTokenReq.sign);
    }

    public final int getFc() {
        return this.f6026fc;
    }

    public final String getFe() {
        return this.f6027fe;
    }

    public final String getFo() {
        return this.f6028fo;
    }

    public final int getFr() {
        return this.f6029fr;
    }

    public final int getFt() {
        return this.f6030ft;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final String getSign() {
        return this.sign;
    }

    public final long getTs() {
        return this.f6031ts;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.f6026fc) * 31) + Integer.hashCode(this.f6030ft)) * 31) + this.f6027fe.hashCode()) * 31) + Integer.hashCode(this.f6029fr)) * 31) + this.f6028fo.hashCode()) * 31) + this.nonce.hashCode()) * 31) + Long.hashCode(this.f6031ts)) * 31) + this.sign.hashCode();
    }

    public String toString() {
        return "OssTokenReq(fc=" + this.f6026fc + ", ft=" + this.f6030ft + ", fe=" + this.f6027fe + ", fr=" + this.f6029fr + ", fo=" + this.f6028fo + ", nonce=" + this.nonce + ", ts=" + this.f6031ts + ", sign=" + this.sign + ")";
    }

    public /* synthetic */ OssTokenReq(int i10, int i11, String str, int i12, String str2, String str3, long j10, String str4, int i13, AbstractC9972n abstractC9972n) {
        this((i13 & 1) != 0 ? 1 : i10, i11, str, i12, str2, str3, j10, str4);
    }
}
