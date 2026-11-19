package com.tencent.smtt.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import com.tencent.smtt.sdk.TbsConfig;
import java.io.File;

/* renamed from: com.tencent.smtt.utils.aa */
/* loaded from: classes4.dex */
public class C6844aa {

    /* renamed from: a */
    private static File f6957a;

    /* renamed from: a */
    public static long m6263a() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getBlockSize() * statFs.getAvailableBlocks();
    }

    @TargetApi(9)
    /* renamed from: a */
    public static boolean m6264a(Context context) {
        File dir;
        if (context == null) {
            return false;
        }
        if (f6957a != null) {
            return true;
        }
        try {
            if (context.getApplicationInfo().processName.contains(TbsConfig.APP_WX) && (dir = context.getDir("tbs", 0)) != null && dir.isDirectory()) {
                File file = new File(dir, "share");
                if (!file.isDirectory() && !file.mkdir()) {
                    return false;
                }
                f6957a = file;
                file.setExecutable(true, false);
                return true;
            }
            return false;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }
}
