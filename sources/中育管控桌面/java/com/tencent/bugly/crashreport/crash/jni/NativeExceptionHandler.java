package com.tencent.bugly.crashreport.crash.jni;

import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import java.util.Map;

/* loaded from: classes3.dex */
public interface NativeExceptionHandler {
    boolean getAndUpdateAnrState();

    void handleNativeException(int i6, int i7, long j6, long j7, String str, String str2, String str3, String str4, int i8, String str5, int i9, int i10, int i11, String str6, String str7);

    void handleNativeException2(int i6, int i7, long j6, long j7, String str, String str2, String str3, String str4, int i8, String str5, int i9, int i10, int i11, String str6, String str7, String[] strArr);

    CrashDetailBean packageCrashDatas(String str, String str2, long j6, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, byte[] bArr, Map<String, String> map, boolean z6, boolean z7);
}
