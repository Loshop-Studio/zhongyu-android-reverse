package com.p071uc.crashsdk.export;

import java.io.File;

/* loaded from: classes4.dex */
public interface ICrashClient {
    public static final int EVENT_TYPE_ADD_CRASH_STATS = 3;
    public static final int EVENT_TYPE_CLIENT_PROCESS_LOG_GENERATED = 4;
    public static final int EVENT_TYPE_CRASH_RESTARTING = 2;
    public static final int EVENT_TYPE_LOG_GENERATED = 1;

    void onAddCrashStats(String str, int i9, int i10);

    File onBeforeUploadLog(File file);

    void onClientProcessLogGenerated(String str, File file, String str2);

    void onCrashRestarting(boolean z9);

    String onGetCallbackInfo(String str, boolean z9);

    void onLogGenerated(File file, String str);
}
