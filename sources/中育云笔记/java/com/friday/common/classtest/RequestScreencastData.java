package com.friday.common.classtest;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.android.arouter.utils.Consts;
import com.blankj.utilcode.util.NetworkUtils;
import com.friday.common.helper.C5962b;
import java.net.SocketException;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10793c0;

@StabilityInferred(parameters = 1)
@Keep
/* loaded from: classes3.dex */
public final class RequestScreencastData {
    public static final int $stable = 0;

    /* renamed from: ip */
    private final String f5769ip;
    private final boolean isScreenCast;
    private final String userId;

    public RequestScreencastData() {
        this(false, null, null, 7, null);
    }

    public static /* synthetic */ RequestScreencastData copy$default(RequestScreencastData requestScreencastData, boolean z10, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = requestScreencastData.isScreenCast;
        }
        if ((i10 & 2) != 0) {
            str = requestScreencastData.userId;
        }
        if ((i10 & 4) != 0) {
            str2 = requestScreencastData.f5769ip;
        }
        return requestScreencastData.copy(z10, str, str2);
    }

    public final boolean component1() {
        return this.isScreenCast;
    }

    public final String component2() {
        return this.userId;
    }

    public final String component3() {
        return this.f5769ip;
    }

    public final RequestScreencastData copy(boolean z10, String userId, String ip) {
        AbstractC9979u.m20294g(userId, "userId");
        AbstractC9979u.m20294g(ip, "ip");
        return new RequestScreencastData(z10, userId, ip);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestScreencastData)) {
            return false;
        }
        RequestScreencastData requestScreencastData = (RequestScreencastData) obj;
        return this.isScreenCast == requestScreencastData.isScreenCast && AbstractC9979u.m20289b(this.userId, requestScreencastData.userId) && AbstractC9979u.m20289b(this.f5769ip, requestScreencastData.f5769ip);
    }

    public final String getIp() {
        return this.f5769ip;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isScreenCast) * 31) + this.userId.hashCode()) * 31) + this.f5769ip.hashCode();
    }

    public final boolean isScreenCast() {
        return this.isScreenCast;
    }

    public String toString() {
        return "RequestScreencastData(isScreenCast=" + this.isScreenCast + ", userId=" + this.userId + ", ip=" + this.f5769ip + ")";
    }

    public RequestScreencastData(boolean z10, String userId, String ip) {
        AbstractC9979u.m20294g(userId, "userId");
        AbstractC9979u.m20294g(ip, "ip");
        this.isScreenCast = z10;
        this.userId = userId;
        this.f5769ip = ip;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RequestScreencastData(boolean z10, String str, String str2, int i10, AbstractC9972n abstractC9972n) throws SocketException {
        z10 = (i10 & 1) != 0 ? true : z10;
        str = (i10 & 2) != 0 ? String.valueOf(C5962b.f6082a.m5299a().m5292t()) : str;
        if ((i10 & 4) != 0) {
            String iPAddress = NetworkUtils.getIPAddress(true);
            AbstractC9979u.m20293f(iPAddress, "getIPAddress(...)");
            str2 = AbstractC10793c0.m23113W0(iPAddress, Consts.DOT, null, 2, null);
        }
        this(z10, str, str2);
    }
}
