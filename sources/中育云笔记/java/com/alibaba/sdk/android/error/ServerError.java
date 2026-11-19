package com.alibaba.sdk.android.error;

import com.huawei.hms.framework.common.BundleUtil;

@Deprecated
/* loaded from: classes3.dex */
public class ServerError extends ErrorCode {
    public static final String TYPE_SERVER = "SERVER";

    public ServerError(String str, String str2, String str3, String[] strArr, boolean z10) {
        super(str + BundleUtil.UNDERLINE_TAG + "SERVER" + BundleUtil.UNDERLINE_TAG + str2, str3, null, strArr, z10);
    }
}
