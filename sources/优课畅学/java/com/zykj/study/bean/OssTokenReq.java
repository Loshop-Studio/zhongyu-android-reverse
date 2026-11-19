package com.zykj.study.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class OssTokenReq {
    public static final int $stable = 0;

    /* renamed from: fc */
    private final int f10987fc;

    /* renamed from: fe */
    private final String f10988fe;

    /* renamed from: fo */
    private final String f10989fo;

    /* renamed from: fr */
    private final int f10990fr;

    /* renamed from: ft */
    private final int f10991ft;
    private final String nonce;
    private final String sign;

    /* renamed from: ts */
    private final long f10992ts;

    public OssTokenReq(int i10, int i11, String fe, int i12, String fo, String nonce, long j10, String sign) {
        AbstractC9133u.m16133g(fe, "fe");
        AbstractC9133u.m16133g(fo, "fo");
        AbstractC9133u.m16133g(nonce, "nonce");
        AbstractC9133u.m16133g(sign, "sign");
        this.f10987fc = i10;
        this.f10991ft = i11;
        this.f10988fe = fe;
        this.f10990fr = i12;
        this.f10989fo = fo;
        this.nonce = nonce;
        this.f10992ts = j10;
        this.sign = sign;
    }

    public static /* synthetic */ OssTokenReq copy$default(OssTokenReq ossTokenReq, int i10, int i11, String str, int i12, String str2, String str3, long j10, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = ossTokenReq.f10987fc;
        }
        if ((i13 & 2) != 0) {
            i11 = ossTokenReq.f10991ft;
        }
        if ((i13 & 4) != 0) {
            str = ossTokenReq.f10988fe;
        }
        if ((i13 & 8) != 0) {
            i12 = ossTokenReq.f10990fr;
        }
        if ((i13 & 16) != 0) {
            str2 = ossTokenReq.f10989fo;
        }
        if ((i13 & 32) != 0) {
            str3 = ossTokenReq.nonce;
        }
        if ((i13 & 64) != 0) {
            j10 = ossTokenReq.f10992ts;
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
        return this.f10987fc;
    }

    public final int component2() {
        return this.f10991ft;
    }

    public final String component3() {
        return this.f10988fe;
    }

    public final int component4() {
        return this.f10990fr;
    }

    public final String component5() {
        return this.f10989fo;
    }

    public final String component6() {
        return this.nonce;
    }

    public final long component7() {
        return this.f10992ts;
    }

    public final String component8() {
        return this.sign;
    }

    public final OssTokenReq copy(int i10, int i11, String fe, int i12, String fo, String nonce, long j10, String sign) {
        AbstractC9133u.m16133g(fe, "fe");
        AbstractC9133u.m16133g(fo, "fo");
        AbstractC9133u.m16133g(nonce, "nonce");
        AbstractC9133u.m16133g(sign, "sign");
        return new OssTokenReq(i10, i11, fe, i12, fo, nonce, j10, sign);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OssTokenReq)) {
            return false;
        }
        OssTokenReq ossTokenReq = (OssTokenReq) obj;
        return this.f10987fc == ossTokenReq.f10987fc && this.f10991ft == ossTokenReq.f10991ft && AbstractC9133u.m16128b(this.f10988fe, ossTokenReq.f10988fe) && this.f10990fr == ossTokenReq.f10990fr && AbstractC9133u.m16128b(this.f10989fo, ossTokenReq.f10989fo) && AbstractC9133u.m16128b(this.nonce, ossTokenReq.nonce) && this.f10992ts == ossTokenReq.f10992ts && AbstractC9133u.m16128b(this.sign, ossTokenReq.sign);
    }

    public final int getFc() {
        return this.f10987fc;
    }

    public final String getFe() {
        return this.f10988fe;
    }

    public final String getFo() {
        return this.f10989fo;
    }

    public final int getFr() {
        return this.f10990fr;
    }

    public final int getFt() {
        return this.f10991ft;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final String getSign() {
        return this.sign;
    }

    public final long getTs() {
        return this.f10992ts;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.f10987fc) * 31) + Integer.hashCode(this.f10991ft)) * 31) + this.f10988fe.hashCode()) * 31) + Integer.hashCode(this.f10990fr)) * 31) + this.f10989fo.hashCode()) * 31) + this.nonce.hashCode()) * 31) + Long.hashCode(this.f10992ts)) * 31) + this.sign.hashCode();
    }

    public String toString() {
        return "OssTokenReq(fc=" + this.f10987fc + ", ft=" + this.f10991ft + ", fe=" + this.f10988fe + ", fr=" + this.f10990fr + ", fo=" + this.f10989fo + ", nonce=" + this.nonce + ", ts=" + this.f10992ts + ", sign=" + this.sign + ")";
    }

    public /* synthetic */ OssTokenReq(int i10, int i11, String str, int i12, String str2, String str3, long j10, String str4, int i13, AbstractC9126n abstractC9126n) {
        this((i13 & 1) != 0 ? 5 : i10, i11, str, i12, str2, str3, j10, str4);
    }
}
