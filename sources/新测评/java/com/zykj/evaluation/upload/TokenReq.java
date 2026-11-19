package com.zykj.evaluation.upload;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Keep
@Metadata(m13557d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0006HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013¨\u0006("}, m13558d2 = {"Lcom/zykj/evaluation/upload/TokenReq;", "", "fc", "", "ft", "fe", "", "fr", "fo", "nonce", "ts", "", "sign", "<init>", "(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getFc", "()I", "getFt", "getFe", "()Ljava/lang/String;", "getFr", "getFo", "getNonce", "getTs", "()J", "getSign", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TokenReq {
    public static final int $stable = 0;
    private final int fc;
    private final String fe;
    private final String fo;
    private final int fr;
    private final int ft;
    private final String nonce;
    private final String sign;
    private final long ts;

    public TokenReq(int i10, int i11, String fe, int i12, String fo, String nonce, long j10, String sign) {
        Intrinsics.checkNotNullParameter(fe, "fe");
        Intrinsics.checkNotNullParameter(fo, "fo");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(sign, "sign");
        this.fc = i10;
        this.ft = i11;
        this.fe = fe;
        this.fr = i12;
        this.fo = fo;
        this.nonce = nonce;
        this.ts = j10;
        this.sign = sign;
    }

    public static /* synthetic */ TokenReq copy$default(TokenReq tokenReq, int i10, int i11, String str, int i12, String str2, String str3, long j10, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = tokenReq.fc;
        }
        if ((i13 & 2) != 0) {
            i11 = tokenReq.ft;
        }
        if ((i13 & 4) != 0) {
            str = tokenReq.fe;
        }
        if ((i13 & 8) != 0) {
            i12 = tokenReq.fr;
        }
        if ((i13 & 16) != 0) {
            str2 = tokenReq.fo;
        }
        if ((i13 & 32) != 0) {
            str3 = tokenReq.nonce;
        }
        if ((i13 & 64) != 0) {
            j10 = tokenReq.ts;
        }
        if ((i13 & 128) != 0) {
            str4 = tokenReq.sign;
        }
        String str5 = str4;
        long j11 = j10;
        String str6 = str2;
        String str7 = str3;
        return tokenReq.copy(i10, i11, str, i12, str6, str7, j11, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final int getFc() {
        return this.fc;
    }

    /* renamed from: component2, reason: from getter */
    public final int getFt() {
        return this.ft;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFe() {
        return this.fe;
    }

    /* renamed from: component4, reason: from getter */
    public final int getFr() {
        return this.fr;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFo() {
        return this.fo;
    }

    /* renamed from: component6, reason: from getter */
    public final String getNonce() {
        return this.nonce;
    }

    /* renamed from: component7, reason: from getter */
    public final long getTs() {
        return this.ts;
    }

    /* renamed from: component8, reason: from getter */
    public final String getSign() {
        return this.sign;
    }

    public final TokenReq copy(int fc, int ft, String fe, int fr, String fo, String nonce, long ts, String sign) {
        Intrinsics.checkNotNullParameter(fe, "fe");
        Intrinsics.checkNotNullParameter(fo, "fo");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(sign, "sign");
        return new TokenReq(fc, ft, fe, fr, fo, nonce, ts, sign);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenReq)) {
            return false;
        }
        TokenReq tokenReq = (TokenReq) other;
        return this.fc == tokenReq.fc && this.ft == tokenReq.ft && Intrinsics.areEqual(this.fe, tokenReq.fe) && this.fr == tokenReq.fr && Intrinsics.areEqual(this.fo, tokenReq.fo) && Intrinsics.areEqual(this.nonce, tokenReq.nonce) && this.ts == tokenReq.ts && Intrinsics.areEqual(this.sign, tokenReq.sign);
    }

    public final int getFc() {
        return this.fc;
    }

    public final String getFe() {
        return this.fe;
    }

    public final String getFo() {
        return this.fo;
    }

    public final int getFr() {
        return this.fr;
    }

    public final int getFt() {
        return this.ft;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final String getSign() {
        return this.sign;
    }

    public final long getTs() {
        return this.ts;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.fc) * 31) + Integer.hashCode(this.ft)) * 31) + this.fe.hashCode()) * 31) + Integer.hashCode(this.fr)) * 31) + this.fo.hashCode()) * 31) + this.nonce.hashCode()) * 31) + Long.hashCode(this.ts)) * 31) + this.sign.hashCode();
    }

    public String toString() {
        return "TokenReq(fc=" + this.fc + ", ft=" + this.ft + ", fe=" + this.fe + ", fr=" + this.fr + ", fo=" + this.fo + ", nonce=" + this.nonce + ", ts=" + this.ts + ", sign=" + this.sign + ")";
    }

    public /* synthetic */ TokenReq(int i10, int i11, String str, int i12, String str2, String str3, long j10, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 2 : i10, i11, str, i12, str2, str3, j10, str4);
    }
}
