package com.alibaba.sdk.android.error;

import com.huawei.hms.framework.common.BundleUtil;

@Deprecated
/* loaded from: classes3.dex */
public class SdkError extends ErrorCode {
    public static final String TYPE_SDK = "SDK";

    public SdkError(String str, String str2, String str3, String[] strArr, boolean z10) {
        super(str + BundleUtil.UNDERLINE_TAG + "SDK" + BundleUtil.UNDERLINE_TAG + str2, str3, null, strArr, z10);
    }
}
