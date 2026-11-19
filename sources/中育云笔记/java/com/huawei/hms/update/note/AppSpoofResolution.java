package com.huawei.hms.update.note;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.availableupdate.C7247a;
import com.huawei.hms.p072ui.AbstractDialog;
import com.huawei.hms.p072ui.AbstractPromptDialog;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.ResourceLoaderUtil;

/* loaded from: classes5.dex */
public class AppSpoofResolution implements IBridgeActivityDelegate {

    /* renamed from: c */
    public Activity f11798c;

    /* renamed from: d */
    public C7352b f11799d;

    /* renamed from: com.huawei.hms.update.note.AppSpoofResolution$a */
    public class C7351a implements AbstractDialog.Callback {
        public C7351a() {
        }

        @Override // com.huawei.hms.ui.AbstractDialog.Callback
        public void onCancel(AbstractDialog abstractDialog) {
            C7247a.f11413c.m8384a(true);
            AppSpoofResolution.this.f11799d = null;
            AppSpoofResolution.this.m8737b();
        }

        @Override // com.huawei.hms.ui.AbstractDialog.Callback
        public void onDoWork(AbstractDialog abstractDialog) {
            C7247a.f11413c.m8384a(true);
            AppSpoofResolution.this.f11799d = null;
            AppSpoofResolution.this.m8737b();
        }
    }

    /* renamed from: com.huawei.hms.update.note.AppSpoofResolution$b */
    public static class C7352b extends AbstractPromptDialog {
        public C7352b() {
        }

        @Override // com.huawei.hms.p072ui.AbstractDialog
        public String onGetMessageString(Context context) throws PackageManager.NameNotFoundException {
            String applicationName = new PackageManagerHelper(context).getApplicationName("com.huawei.hwid");
            String str = TextUtils.isEmpty(applicationName) ? "com.huawei.hwid" : applicationName;
            if (ResourceLoaderUtil.getmContext() == null) {
                ResourceLoaderUtil.setmContext(context);
            }
            return ResourceLoaderUtil.getString("hms_is_spoof", str);
        }

        @Override // com.huawei.hms.p072ui.AbstractDialog
        public String onGetPositiveButtonString(Context context) {
            if (ResourceLoaderUtil.getmContext() == null) {
                ResourceLoaderUtil.setmContext(context);
            }
            return ResourceLoaderUtil.getString("hms_confirm");
        }

        @Override // com.huawei.hms.p072ui.AbstractPromptDialog, com.huawei.hms.p072ui.AbstractDialog
        public String onGetTitleString(Context context) {
            if (ResourceLoaderUtil.getmContext() == null) {
                ResourceLoaderUtil.setmContext(context);
            }
            return ResourceLoaderUtil.getString("hms_spoof_hints");
        }

        public /* synthetic */ C7352b(C7351a c7351a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m8737b() {
        Activity activityM8740e = m8740e();
        if (activityM8740e == null || activityM8740e.isFinishing()) {
            return;
        }
        HMSLog.m8727i("AppSpoofResolution", "enter AppSpoofResolution finishBridgeActivity：");
        if (C7247a.f11413c.m8382a().compareAndSet(true, false)) {
            SystemManager.getInstance().notifyNoticeResult(29);
        }
        activityM8740e.finish();
    }

    /* renamed from: d */
    private void m8739d() {
        Activity activityM8740e = m8740e();
        if (activityM8740e == null || activityM8740e.isFinishing()) {
            return;
        }
        C7352b c7352b = this.f11799d;
        if (c7352b == null) {
            this.f11799d = new C7352b(null);
        } else {
            c7352b.dismiss();
        }
        HMSLog.m8727i("AppSpoofResolution", "enter AppSpoofResolution showPromptdlg to resolve conn error");
        this.f11799d.show(activityM8740e, new C7351a());
    }

    /* renamed from: e */
    public Activity m8740e() {
        return this.f11798c;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 0;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        HMSLog.m8727i("AppSpoofResolution", "enter AppSpoofResolution onBridgeActivityCreate");
        if (activity == null || activity.isFinishing()) {
            HMSLog.m8725e("AppSpoofResolution", "activity is null or finishing");
            return;
        }
        this.f11798c = activity;
        C7247a c7247a = C7247a.f11413c;
        c7247a.m8383a(activity);
        c7247a.m8384a(false);
        m8739d();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        HMSLog.m8727i("AppSpoofResolution", "enter AppSpoofResolution onBridgeActivityDestroy");
        C7247a c7247a = C7247a.f11413c;
        if (c7247a.m8382a().compareAndSet(true, false)) {
            SystemManager.getInstance().notifyNoticeResult(29);
        }
        c7247a.m8385b(this.f11798c);
        this.f11798c = null;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i10, int i11, Intent intent) {
        if (i10 != getRequestCode()) {
            return false;
        }
        HMSLog.m8727i("AppSpoofResolution", "enter AppSpoofResolution onBridgeActivityResult");
        return true;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        if (this.f11799d == null) {
            return;
        }
        HMSLog.m8727i("AppSpoofResolution", "enter AppSpoofResolution re show prompt dialog");
        m8739d();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i10, KeyEvent keyEvent) {
        HMSLog.m8727i("AppSpoofResolution", "enter AppSpoofResolution On key up when resolve spoof error");
    }
}
