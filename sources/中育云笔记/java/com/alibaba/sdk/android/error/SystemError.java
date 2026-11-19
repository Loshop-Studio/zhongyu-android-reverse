package com.alibaba.sdk.android.error;

import com.huawei.hms.framework.common.BundleUtil;

@Deprecated
/* loaded from: classes3.dex */
public class SystemError extends ErrorCode {
    public static final String TYPE_SYSTEM = "ANDROID";

    public SystemError(String str, String str2, String str3, String[] strArr, boolean z10) {
        super(str + BundleUtil.UNDERLINE_TAG + "ANDROID" + BundleUtil.UNDERLINE_TAG + str2, str3, null, strArr, z10);
    }
}
