package com.huawei.hms.adapter;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.AndroidException;
import com.huawei.hms.adapter.p069ui.UpdateAdapter;
import com.huawei.hms.common.HmsCheckedState;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.AgHmsUpdateState;

/* loaded from: classes5.dex */
public class AvailableUtil {

    /* renamed from: a */
    public static final Object f11290a = new Object();

    /* renamed from: b */
    public static boolean f11291b = false;

    /* renamed from: c */
    public static boolean f11292c = false;

    /* renamed from: com.huawei.hms.adapter.AvailableUtil$a */
    public class RunnableC7224a implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ Context f11293c;

        public RunnableC7224a(Context context) {
            this.f11293c = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            HMSLog.m8727i("AvailableUtil", "enter asyncCheckHmsV3UpdateInfo");
            if (AvailableUtil.isInstallerLibExist(this.f11293c)) {
                UpdateAdapter.invokeMethod("com.huawei.hms.adapter.ui.InstallerAdapter", "checkHmsUpdateInfo", new Object[]{this.f11293c});
                HMSLog.m8727i("AvailableUtil", "quit asyncCheckHmsV3UpdateInfo");
            } else {
                AgHmsUpdateState.getInstance().setCheckedState(HmsCheckedState.NOT_NEED_UPDATE);
                HMSLog.m8725e("AvailableUtil", "asyncCheckHmsV3UpdateInfo installer is not exist");
            }
        }
    }

    public static void asyncCheckHmsUpdateInfo(Context context) {
        if (HmsCheckedState.UNCHECKED != AgHmsUpdateState.getInstance().getCheckedState()) {
            HMSLog.m8727i("AvailableUtil", "asyncCheckHmsUpdateInfo, not need to check");
        } else {
            new Thread(new RunnableC7224a(context), "Thread-asyncCheckHmsV3UpdateInfo").start();
        }
    }

    public static boolean isInstallerLibExist(Context context) {
        Bundle bundle;
        Object obj;
        boolean z10;
        if (f11291b) {
            HMSLog.m8727i("AvailableUtil", "installerInit exist: " + f11292c);
            return f11292c;
        }
        synchronized (f11290a) {
            if (!f11291b) {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    HMSLog.m8725e("AvailableUtil", "In isAvailableLibExist, Failed to get 'PackageManager' instance.");
                    try {
                        Class.forName("com.huawei.hms.update.manager.UpdateManager");
                        z10 = true;
                    } catch (ClassNotFoundException unused) {
                        HMSLog.m8725e("AvailableUtil", "In isInstallerLibExist, Failed to find class UpdateManager.");
                    }
                } else {
                    try {
                        ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
                        if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && (obj = bundle.get("availableHMSCoreInstaller")) != null && String.valueOf(obj).equalsIgnoreCase("yes")) {
                            HMSLog.m8727i("AvailableUtil", "available exist: true");
                            z10 = true;
                        }
                    } catch (AndroidException unused2) {
                        HMSLog.m8725e("AvailableUtil", "In isInstallerLibExist, Failed to read meta data for the availableHMSCoreInstaller.");
                    } catch (RuntimeException e10) {
                        HMSLog.m8726e("AvailableUtil", "In isInstallerLibExist, Failed to read meta data for the availableHMSCoreInstaller.", e10);
                    }
                    z10 = false;
                }
                f11292c = z10;
                f11291b = true;
            }
        }
        HMSLog.m8727i("AvailableUtil", "available exist: " + f11292c);
        return f11292c;
    }
}
