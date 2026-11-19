package com.zykj.huiwei.launcher.bean.req;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0011"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/bean/req/ForcePsdReq;", "", HintConstants.AUTOFILL_HINT_PASSWORD, "", "<init>", "(Ljava/lang/String;)V", "getPassword", "()Ljava/lang/String;", "setPassword", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ForcePsdReq {
    public static final int $stable = 8;
    private String password;

    public ForcePsdReq(String password) {
        Intrinsics.checkNotNullParameter(password, "password");
        this.password = password;
    }

    public static /* synthetic */ ForcePsdReq copy$default(ForcePsdReq forcePsdReq, String str, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = forcePsdReq.password;
        }
        return forcePsdReq.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    public final ForcePsdReq copy(String password) {
        Intrinsics.checkNotNullParameter(password, "password");
        return new ForcePsdReq(password);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ForcePsdReq) && Intrinsics.areEqual(this.password, ((ForcePsdReq) other).password);
    }

    public final String getPassword() {
        return this.password;
    }

    public int hashCode() {
        return this.password.hashCode();
    }

    public final void setPassword(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.password = str;
    }

    public String toString() {
        return "ForcePsdReq(password=" + this.password + ")";
    }
}
