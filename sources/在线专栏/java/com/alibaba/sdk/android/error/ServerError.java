package com.alibaba.sdk.android.error;

@Deprecated
/* loaded from: classes.dex */
public class ServerError extends ErrorCode {
    public static final String TYPE_SERVER = "SERVER";

    public ServerError(String str, String str2, String str3, String[] strArr, boolean z3) {
        super(str + "_SERVER_" + str2, str3, null, strArr, z3);
    }
}
