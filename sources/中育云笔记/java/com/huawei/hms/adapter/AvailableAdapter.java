package com.huawei.hms.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.adapter.p069ui.NotInstalledHmsAdapter;
import com.huawei.hms.adapter.p069ui.UpdateAdapter;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.adapter.sysobs.SystemObserver;
import com.huawei.hms.availableupdate.C7249c;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.note.AppSpoofResolution;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSBIInitializer;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.UIUtil;

/* loaded from: classes5.dex */
public class AvailableAdapter {

    /* renamed from: a */
    public final int f11285a;

    /* renamed from: b */
    public AvailableCallBack f11286b;

    /* renamed from: d */
    public SystemObserver f11288d = new C7223a();

    /* renamed from: c */
    public boolean f11287c = false;

    public interface AvailableCallBack {
        void onComplete(int i10);
    }

    /* renamed from: com.huawei.hms.adapter.AvailableAdapter$a */
    public class C7223a implements SystemObserver {
        public C7223a() {
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemObserver
        public boolean onNoticeResult(int i10) {
            AvailableCallBack availableCallBackM8253b = AvailableAdapter.this.m8253b();
            if (availableCallBackM8253b == null) {
                HMSLog.m8725e("AvailableAdapter", "onNoticeResult baseCallBack null");
                return true;
            }
            availableCallBackM8253b.onComplete(i10);
            return true;
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemObserver
        public boolean onSolutionResult(Intent intent, String str) {
            return false;
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemObserver
        public boolean onUpdateResult(int i10) {
            AvailableCallBack availableCallBackM8253b = AvailableAdapter.this.m8253b();
            if (availableCallBackM8253b == null) {
                HMSLog.m8725e("AvailableAdapter", "onUpdateResult baseCallBack null");
                return true;
            }
            availableCallBackM8253b.onComplete(i10);
            return true;
        }
    }

    public AvailableAdapter(int i10) {
        this.f11285a = i10;
    }

    /* renamed from: a */
    public final int m8252a(Context context) {
        if (HMSPackageManager.getInstance(context).isUseOldCertificate()) {
            HMSLog.m8725e("AvailableAdapter", "The CP uses the old certificate to terminate the connection.");
            return 13;
        }
        PackageManagerHelper.PackageStates hMSPackageStatesForMultiService = HMSPackageManager.getInstance(context).getHMSPackageStatesForMultiService();
        if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(hMSPackageStatesForMultiService)) {
            HMSLog.m8727i("AvailableAdapter", "HMS is not installed");
            return 1;
        }
        if (PackageManagerHelper.PackageStates.SPOOF.equals(hMSPackageStatesForMultiService)) {
            HMSLog.m8727i("AvailableAdapter", "HMS is spoofed");
            return 29;
        }
        if (!PackageManagerHelper.PackageStates.DISABLED.equals(hMSPackageStatesForMultiService)) {
            return 0;
        }
        HMSLog.m8727i("AvailableAdapter", "HMS is disabled");
        return 3;
    }

    /* renamed from: b */
    public final AvailableCallBack m8253b() {
        return this.f11286b;
    }

    public int checkHuaweiMobileServicesForUpdate(Context context) {
        Checker.checkNonNull(context, "context must not be null.");
        int iM8252a = m8252a(context);
        if (iM8252a != 0 || !HMSPackageManager.getInstance(context).isApkNeedUpdate(this.f11285a)) {
            return iM8252a;
        }
        HMSLog.m8727i("AvailableAdapter", "The current version does not meet the target version requirements");
        return 2;
    }

    /* renamed from: d */
    public final void m8254d(Activity activity, AvailableCallBack availableCallBack) {
        HMSLog.m8727i("AvailableAdapter", "<showHmsApkNotInstalledDialog> startResolution");
        if (!NotInstalledHmsAdapter.getShowLock()) {
            availableCallBack.onComplete(31);
            return;
        }
        this.f11286b = availableCallBack;
        SystemManager.getSystemNotifier().registerObserver(this.f11288d);
        activity.startActivity(BridgeActivity.getIntentStartBridgeActivity(activity, NotInstalledHmsAdapter.class.getName()));
    }

    /* renamed from: e */
    public final boolean m8255e(Activity activity) {
        if (HMSPackageManager.getInstance(activity).isUpdateHmsForThirdPartyDevice() || HMSPackageManager.getInstance(activity).getHmsVersionCode() < 40000000) {
            return false;
        }
        HMSLog.m8727i("AvailableAdapter", "enter 4.0 HmsCore upgrade process");
        return true;
    }

    /* renamed from: f */
    public final void m8256f(Context context) {
        HMSBIInitializer.getInstance(context).initBI();
    }

    public int isHuaweiMobileServicesAvailable(Context context) {
        Checker.checkNonNull(context, "context must not be null.");
        int iM8252a = m8252a(context);
        if (iM8252a != 0 || !HMSPackageManager.getInstance(context).isApkUpdateNecessary(this.f11285a)) {
            return iM8252a;
        }
        HMSLog.m8727i("AvailableAdapter", "The current version does not meet the minimum version requirements");
        return 2;
    }

    public boolean isUserNoticeError(int i10) {
        return i10 == 29;
    }

    public boolean isUserResolvableError(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public void setCalledBySolutionInstallHms(boolean z10) {
        this.f11287c = z10;
    }

    public void startNotice(Activity activity, AvailableCallBack availableCallBack) {
        if (activity == null || availableCallBack == null) {
            return;
        }
        if (UIUtil.isBackground(activity)) {
            HMSLog.m8727i("AvailableAdapter", "current app is in Background");
            availableCallBack.onComplete(28);
        } else {
            HMSLog.m8727i("AvailableAdapter", "startNotice");
            this.f11286b = availableCallBack;
            SystemManager.getSystemNotifier().registerObserver(this.f11288d);
            activity.startActivity(BridgeActivity.getIntentStartBridgeActivity(activity, AppSpoofResolution.class.getName()));
        }
    }

    public void startResolution(Activity activity, AvailableCallBack availableCallBack) {
        if (activity == null || availableCallBack == null) {
            return;
        }
        m8256f(activity);
        if (UIUtil.isBackground(activity)) {
            HMSLog.m8727i("AvailableAdapter", "current app is in Background");
            availableCallBack.onComplete(28);
            return;
        }
        boolean zM8255e = m8255e(activity);
        if (!AvailableUtil.isInstallerLibExist(activity) && !zM8255e) {
            m8254d(activity, availableCallBack);
            return;
        }
        if (C7249c.f11420b.m8391b()) {
            HMSLog.m8727i("AvailableAdapter", "startResolution");
            this.f11286b = availableCallBack;
            SystemManager.getSystemNotifier().registerObserver(this.f11288d);
            Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(activity, UpdateAdapter.class.getName());
            intentStartBridgeActivity.putExtra(CommonCode.MapKey.UPDATE_VERSION, this.f11285a);
            if (this.f11287c) {
                intentStartBridgeActivity.putExtra("installHMS", "installHMS");
            }
            intentStartBridgeActivity.putExtra(CommonCode.MapKey.NEW_UPDATE, zM8255e);
            activity.startActivity(intentStartBridgeActivity);
        }
    }
}
