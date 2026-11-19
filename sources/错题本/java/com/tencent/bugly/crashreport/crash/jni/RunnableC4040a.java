package com.tencent.bugly.crashreport.crash.jni;

import androidx.compose.material3.internal.CalendarModelKt;
import coil3.C3335t;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.proguard.C4055al;
import com.tencent.bugly.proguard.C4059ap;
import com.tencent.bugly.proguard.C4063at;
import com.tencent.bugly.proguard.C4077be;
import java.io.File;
import java.util.Arrays;

/* renamed from: com.tencent.bugly.crashreport.crash.jni.a */
/* loaded from: classes3.dex */
public final class RunnableC4040a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ NativeCrashHandler f3373a;

    public RunnableC4040a(NativeCrashHandler nativeCrashHandler) {
        this.f3373a = nativeCrashHandler;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        File[] fileArr;
        NativeCrashHandler nativeCrashHandler = this.f3373a;
        int i = 0;
        if (!C4059ap.m3070a(nativeCrashHandler.f3363d, "native_record_lock")) {
            C4055al.m3021a("[Native] Failed to lock file for handling native crash record.", new Object[0]);
            return;
        }
        if (!NativeCrashHandler.f3362n) {
            nativeCrashHandler.m2871a(999, "false");
        }
        CrashDetailBean crashDetailBeanM3204a = C4077be.m3204a(nativeCrashHandler.f3363d, NativeCrashHandler.f3359a, nativeCrashHandler.f3366g);
        if (crashDetailBeanM3204a != null) {
            C4055al.m3021a("[Native] Get crash from native record.", new Object[0]);
            if (!nativeCrashHandler.f3372m.m3140a(crashDetailBeanM3204a, true)) {
                nativeCrashHandler.f3372m.m3142b(crashDetailBeanM3204a, false);
            }
            C4077be.m3212a(false, NativeCrashHandler.f3359a);
        }
        long jM3076b = C4059ap.m3076b() - C4063at.f3579j;
        long jM3076b2 = C4059ap.m3076b() + CalendarModelKt.MillisecondsIn24Hours;
        File file = new File(NativeCrashHandler.f3359a);
        if (file.exists() && file.isDirectory()) {
            try {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                    Arrays.sort(fileArrListFiles, new C3335t(3));
                    int length = fileArrListFiles.length;
                    long length2 = 0;
                    int i8 = 0;
                    int i9 = 0;
                    while (i < length) {
                        File file2 = fileArrListFiles[i];
                        long jLastModified = file2.lastModified();
                        length2 += file2.length();
                        if (jLastModified < jM3076b || jLastModified >= jM3076b2 || length2 >= C4063at.f3578i) {
                            fileArr = fileArrListFiles;
                            C4055al.m3021a("[Native] Delete record file: %s", file2.getAbsolutePath());
                            i8++;
                            if (file2.delete()) {
                                i9++;
                            }
                        } else {
                            fileArr = fileArrListFiles;
                        }
                        i++;
                        fileArrListFiles = fileArr;
                    }
                    C4055al.m3025c("[Native] Number of record files overdue: %d, has deleted: %d", Integer.valueOf(i8), Integer.valueOf(i9));
                }
            } catch (Throwable th) {
                C4055al.m3022a(th);
            }
        }
        C4059ap.m3082b(nativeCrashHandler.f3363d, "native_record_lock");
    }
}
