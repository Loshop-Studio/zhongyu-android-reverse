package com.alibaba.sdk.android.error;

@Deprecated
/* loaded from: classes.dex */
public class SdkError extends ErrorCode {
    public static final String TYPE_SDK = "SDK";

    public SdkError(String str, String str2, String str3, String[] strArr, boolean z3) {
        super(str + "_SDK_" + str2, str3, null, strArr, z3);
    }
}
