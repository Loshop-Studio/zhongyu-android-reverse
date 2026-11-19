package com.huawei.hms.framework.network.grs;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import p173h5.AbstractC9495d;
import p173h5.C9494c;

/* loaded from: classes5.dex */
public class GrsClient {
    private static final String EMPTY_STRING = "";
    private final C9494c grsClientGlobal;
    private int queryTimeout;

    public GrsClient(Context context, GrsBaseInfo grsBaseInfo) {
        if (context == null || grsBaseInfo == null) {
            throw new NullPointerException("invalid init params for context is null or GrsBaseInfo instance is null Object.");
        }
        this.grsClientGlobal = AbstractC9495d.m18697a(grsBaseInfo, context);
        this.queryTimeout = grsBaseInfo.getQueryTimeout();
    }

    public void ayncGetGrsUrl(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack) {
        C9494c c9494c = this.grsClientGlobal;
        if (c9494c == null) {
            iQueryUrlCallBack.onCallBackFail(-8);
        } else {
            c9494c.m18690m(str, str2, iQueryUrlCallBack, this.queryTimeout);
        }
    }

    public void ayncGetGrsUrls(String str, IQueryUrlsCallBack iQueryUrlsCallBack) {
        C9494c c9494c = this.grsClientGlobal;
        if (c9494c == null) {
            iQueryUrlsCallBack.onCallBackFail(-8);
        } else {
            c9494c.m18689l(str, iQueryUrlsCallBack, this.queryTimeout);
        }
    }

    public void clearSp() {
        C9494c c9494c = this.grsClientGlobal;
        if (c9494c == null) {
            return;
        }
        c9494c.m18687i();
    }

    public boolean forceExpire() {
        C9494c c9494c = this.grsClientGlobal;
        if (c9494c == null) {
            return false;
        }
        return c9494c.m18693r();
    }

    public String synGetGrsUrl(String str, String str2) {
        C9494c c9494c = this.grsClientGlobal;
        return c9494c == null ? "" : c9494c.m18685e(str, str2, this.queryTimeout);
    }

    public Map<String, String> synGetGrsUrls(String str) {
        C9494c c9494c = this.grsClientGlobal;
        return c9494c == null ? new HashMap() : c9494c.m18686f(str, this.queryTimeout);
    }
}
