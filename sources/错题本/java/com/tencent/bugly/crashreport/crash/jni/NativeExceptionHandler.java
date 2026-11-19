package com.tencent.bugly.crashreport.crash.jni;

import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import java.util.Map;

/* loaded from: classes3.dex */
public interface NativeExceptionHandler {
    boolean getAndUpdateAnrState();

    void handleNativeException(int i, int i8, long j7, long j8, String str, String str2, String str3, String str4, int i9, String str5, int i10, int i11, int i12, String str6, String str7);

    void handleNativeException2(int i, int i8, long j7, long j8, String str, String str2, String str3, String str4, int i9, String str5, int i10, int i11, int i12, String str6, String str7, String[] strArr);

    CrashDetailBean packageCrashDatas(String str, String str2, long j7, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, byte[] bArr, Map<String, String> map, boolean z8, boolean z9);
}
