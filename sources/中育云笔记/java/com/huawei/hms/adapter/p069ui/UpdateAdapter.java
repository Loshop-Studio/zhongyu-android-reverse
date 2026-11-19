package com.huawei.hms.adapter.p069ui;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.alibaba.android.arouter.utils.Consts;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.adapter.AvailableUtil;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.availableupdate.C7249c;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.kpms.KpmsConstant;
import com.huawei.hms.update.p073ui.UpdateBean;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes5.dex */
public class UpdateAdapter implements IBridgeActivityDelegate {

    /* renamed from: c */
    public WeakReference f11355c;

    /* renamed from: d */
    public Context f11356d;

    /* renamed from: e */
    public int f11357e;

    /* renamed from: f */
    public UpdateBean f11358f;

    /* renamed from: g */
    public boolean f11359g = false;

    /* renamed from: a */
    public static Object m8328a(String str, String str2, Object[] objArr) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        if (TextUtils.isEmpty(str)) {
            HMSLog.m8725e("UpdateAdapter", "className is empty.");
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            HMSLog.m8725e("UpdateAdapter", "methodName is empty.");
            return null;
        }
        if (objArr == null) {
            HMSLog.m8725e("UpdateAdapter", "args is null.");
            return null;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i10 = 0; i10 < objArr.length; i10++) {
            Object obj = objArr[i10];
            if (obj instanceof Activity) {
                clsArr[i10] = Activity.class;
            } else if (obj instanceof Context) {
                clsArr[i10] = Context.class;
            } else if (obj instanceof UpdateBean) {
                clsArr[i10] = UpdateBean.class;
            } else if (obj instanceof Integer) {
                clsArr[i10] = Integer.TYPE;
            } else if (obj instanceof Boolean) {
                clsArr[i10] = Boolean.TYPE;
            } else {
                HMSLog.m8725e("UpdateAdapter", "not set args[" + i10 + "] type");
            }
        }
        Class<?> cls = Class.forName(str);
        return cls.getMethod(str2, clsArr).invoke(cls.getDeclaredConstructor(null).newInstance(null), objArr);
    }

    /* renamed from: b */
    private void m8329b() {
        Activity activityM8334f = m8334f();
        if (activityM8334f == null || activityM8334f.isFinishing()) {
            return;
        }
        activityM8334f.finish();
    }

    /* renamed from: g */
    private void m8330g() {
        SystemManager.getInstance().notifyUpdateResult(8);
        m8329b();
    }

    public static Object invokeMethod(String str, String str2, Object[] objArr) {
        try {
            return m8328a(str, str2, objArr);
        } catch (Throwable th) {
            HMSLog.m8725e("UpdateAdapter", "invoke " + str + Consts.DOT + str2 + " fail. " + th.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    public final void m8331c(Intent intent) {
        int intExtra = -1;
        try {
            intExtra = intent.getIntExtra(BridgeActivity.EXTRA_RESULT, -1);
        } catch (Throwable unused) {
            HMSLog.m8728w("UpdateAdapter", "get extra_result failed, throwable occur.");
        }
        if (intExtra == 0) {
            HMSLog.m8727i("UpdateAdapter", "Error resolved successfully!");
            SystemManager.getInstance().notifyUpdateResult(0);
        } else if (intExtra == 13) {
            HMSLog.m8727i("UpdateAdapter", "Resolve error process canceled by user!");
            SystemManager.getInstance().notifyUpdateResult(13);
        } else if (intExtra == 8) {
            HMSLog.m8727i("UpdateAdapter", "Internal error occurred, recommended retry.");
            SystemManager.getInstance().notifyUpdateResult(8);
        } else {
            HMSLog.m8727i("UpdateAdapter", "Other error codes.");
            SystemManager.getInstance().notifyUpdateResult(intExtra);
        }
    }

    /* renamed from: d */
    public final boolean m8332d(Context context, String str, int i10) {
        if (context == null || TextUtils.isEmpty(str) || i10 == 0) {
            HMSLog.m8728w("UpdateAdapter", "Please check your params, one of params is invalid.");
            return false;
        }
        PackageManagerHelper packageManagerHelper = new PackageManagerHelper(context);
        return PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(packageManagerHelper.getPackageStates(str)) || packageManagerHelper.getPackageVersionCode(str) < i10;
    }

    /* renamed from: e */
    public final boolean m8333e(Intent intent, Activity activity) {
        if (!intent.getBooleanExtra(CommonCode.MapKey.NEW_UPDATE, false)) {
            return false;
        }
        HMSLog.m8727i("UpdateAdapter", "4.0 framework HMSCore upgrade process");
        String hMSPackageName = HMSPackageManager.getInstance(activity.getApplicationContext()).getHMSPackageName();
        if (TextUtils.isEmpty(hMSPackageName)) {
            HMSLog.m8728w("UpdateAdapter", "hmsPackageName is empty, update invalid.");
            m8330g();
            return true;
        }
        ComponentName componentName = new ComponentName(hMSPackageName, "com.huawei.hms.fwksdk.stub.UpdateStubActivity");
        Intent intent2 = new Intent();
        intent2.putExtra(KpmsConstant.CALLER_PACKAGE_NAME, activity.getApplicationContext().getPackageName());
        intent2.putExtra(KpmsConstant.UPDATE_PACKAGE_NAME, hMSPackageName);
        intent2.setComponent(componentName);
        activity.startActivityForResult(intent2, 1001);
        return true;
    }

    /* renamed from: f */
    public final Activity m8334f() {
        WeakReference weakReference = this.f11355c;
        if (weakReference == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 1001;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        if (activity == null) {
            HMSLog.m8727i("UpdateAdapter", "activity == null");
            m8330g();
            return;
        }
        if (activity.isFinishing()) {
            HMSLog.m8727i("UpdateAdapter", "activity is finishing");
            m8330g();
            return;
        }
        this.f11356d = activity.getApplicationContext();
        this.f11355c = new WeakReference(activity);
        C7249c.f11420b.m8389a(m8334f());
        Intent intent = activity.getIntent();
        if (intent == null) {
            m8330g();
            return;
        }
        try {
            this.f11357e = intent.getIntExtra(CommonCode.MapKey.UPDATE_VERSION, 0);
        } catch (Throwable th) {
            HMSLog.m8725e("UpdateAdapter", "get update_version:" + th.getMessage());
        }
        if (this.f11357e == 0) {
            m8330g();
            return;
        }
        if (intent.hasExtra("installHMS")) {
            this.f11359g = true;
        }
        if (m8333e(intent, activity)) {
            return;
        }
        try {
            if (AvailableUtil.isInstallerLibExist(this.f11356d)) {
                UpdateBean updateBean = (UpdateBean) m8328a("com.huawei.hms.adapter.ui.InstallerAdapter", "setUpdateBean", new Object[]{activity, Integer.valueOf(this.f11357e), Boolean.valueOf(this.f11359g)});
                this.f11358f = updateBean;
                m8328a("com.huawei.hms.adapter.ui.InstallerAdapter", "startUpdateHms", new Object[]{activity, updateBean, 1001});
                this.f11358f = null;
            }
        } catch (Throwable th2) {
            HMSLog.m8725e("UpdateAdapter", "InstallerAdapter.startUpdateHms is failed. message：" + th2.getMessage());
            m8330g();
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        HMSLog.m8727i("UpdateAdapter", "onBridgeActivityDestroy");
        C7249c.f11420b.m8390b(m8334f());
        this.f11355c = null;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i10, int i11, Intent intent) {
        int intExtra;
        if (i10 != getRequestCode()) {
            this.f11358f = null;
            return false;
        }
        HMSLog.m8727i("UpdateAdapter", "onBridgeActivityResult " + i11);
        if (AvailableUtil.isInstallerLibExist(this.f11356d) && i11 == 1214) {
            HMSLog.m8727i("UpdateAdapter", "Enter update escape route");
            Activity activityM8334f = m8334f();
            if (activityM8334f == null) {
                HMSLog.m8725e("UpdateAdapter", "bridgeActivity is null, update escape failed ");
                this.f11358f = null;
                return true;
            }
            invokeMethod("com.huawei.hms.update.manager.UpdateManager", "startUpdate", new Object[]{activityM8334f, 1001, this.f11358f});
            this.f11358f = null;
        }
        if (i11 == -1) {
            if (intent != null) {
                try {
                    intExtra = intent.getIntExtra(KpmsConstant.KIT_UPDATE_RESULT, 0);
                } catch (Throwable unused) {
                    HMSLog.m8728w("UpdateAdapter", "get kit_update_result failed, throwable occur.");
                    intExtra = 0;
                }
                if (intExtra == 1) {
                    HMSLog.m8727i("UpdateAdapter", "new framework update process,Error resolved successfully!");
                    SystemManager.getInstance().notifyUpdateResult(0);
                    this.f11358f = null;
                    m8329b();
                    return true;
                }
                m8331c(intent);
            }
        } else if (i11 == 0) {
            HMSLog.m8727i("UpdateAdapter", "Activity.RESULT_CANCELED");
            this.f11358f = null;
            Activity activityM8334f2 = m8334f();
            if (activityM8334f2 == null) {
                return true;
            }
            String hMSPackageName = HMSPackageManager.getInstance(activityM8334f2.getApplicationContext()).getHMSPackageName();
            if (TextUtils.isEmpty(hMSPackageName)) {
                hMSPackageName = "com.huawei.hwid";
            }
            if (this.f11359g || m8332d(activityM8334f2, hMSPackageName, this.f11357e)) {
                HMSLog.m8727i("UpdateAdapter", "Resolve error, process canceled by user clicking back button!");
                SystemManager.getInstance().notifyUpdateResult(13);
            } else {
                SystemManager.getInstance().notifyUpdateResult(0);
            }
        } else if (i11 == 1) {
            SystemManager.getInstance().notifyUpdateResult(28);
        }
        m8329b();
        return true;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        HMSLog.m8727i("UpdateAdapter", "onBridgeConfigurationChanged");
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i10, KeyEvent keyEvent) {
        HMSLog.m8727i("UpdateAdapter", "On key up when resolve conn error");
    }
}
