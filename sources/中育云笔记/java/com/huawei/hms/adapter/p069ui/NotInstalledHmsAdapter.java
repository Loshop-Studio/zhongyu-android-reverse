package com.huawei.hms.adapter.p069ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.p073ui.NotInstalledHmsDialogHelper;
import com.huawei.hms.utils.UIUtil;

/* loaded from: classes5.dex */
public class NotInstalledHmsAdapter implements IBridgeActivityDelegate {

    /* renamed from: e */
    public static final Object f11349e = new Object();

    /* renamed from: f */
    public static boolean f11350f;

    /* renamed from: c */
    public Activity f11351c;

    /* renamed from: d */
    public Dialog f11352d;

    /* renamed from: com.huawei.hms.adapter.ui.NotInstalledHmsAdapter$a */
    public static class DialogInterfaceOnCancelListenerC7232a implements DialogInterface.OnCancelListener {

        /* renamed from: c */
        public final Activity f11353c;

        public DialogInterfaceOnCancelListenerC7232a(Activity activity) {
            this.f11353c = activity;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            HMSLog.m8727i("NotInstalledHmsAdapter", "<Dialog onCancel>");
            SystemManager.getInstance().notifyUpdateResult(13);
            this.f11353c.finish();
        }
    }

    /* renamed from: com.huawei.hms.adapter.ui.NotInstalledHmsAdapter$b */
    public static class DialogInterfaceOnClickListenerC7233b implements DialogInterface.OnClickListener {

        /* renamed from: c */
        public final Activity f11354c;

        public DialogInterfaceOnClickListenerC7233b(Activity activity) {
            this.f11354c = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            HMSLog.m8727i("NotInstalledHmsAdapter", "<Dialog onClick>");
            SystemManager.getInstance().notifyUpdateResult(30);
            this.f11354c.finish();
        }
    }

    public static boolean getShowLock() {
        synchronized (f11349e) {
            try {
                HMSLog.m8727i("NotInstalledHmsAdapter", "<canShowDialog> sIsShowingDialog: " + f11350f);
                if (f11350f) {
                    return false;
                }
                f11350f = true;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void m8327a(Activity activity) {
        Dialog dialog = this.f11352d;
        if (dialog != null && dialog.isShowing()) {
            this.f11352d.setOnCancelListener(null);
            this.f11352d.cancel();
        }
        AlertDialog alertDialogCreate = NotInstalledHmsDialogHelper.getDialogBuilder(activity).setPositiveButton(NotInstalledHmsDialogHelper.getConfirmResId(activity), new DialogInterfaceOnClickListenerC7233b(activity)).setOnCancelListener(new DialogInterfaceOnCancelListenerC7232a(activity)).create();
        this.f11352d = alertDialogCreate;
        UIUtil.enableFocusedForButtonsInTV(alertDialogCreate);
        this.f11352d.show();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        HMSLog.m8727i("NotInstalledHmsAdapter", "<getRequestCode>");
        return 0;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        HMSLog.m8727i("NotInstalledHmsAdapter", "<onBridgeActivityCreate>");
        if (activity == null || activity.isFinishing()) {
            HMSLog.m8725e("NotInstalledHmsAdapter", "<onBridgeActivityCreate> activity is null or finishing");
        } else {
            this.f11351c = activity;
            m8327a(activity);
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        HMSLog.m8727i("NotInstalledHmsAdapter", "<onBridgeActivityDestroy>");
        synchronized (f11349e) {
            f11350f = false;
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i10, int i11, Intent intent) {
        HMSLog.m8727i("NotInstalledHmsAdapter", "<onBridgeActivityResult>");
        return false;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        HMSLog.m8727i("NotInstalledHmsAdapter", "<onBridgeConfigurationChanged>");
        Activity activity = this.f11351c;
        if (activity == null || activity.isFinishing()) {
            HMSLog.m8725e("NotInstalledHmsAdapter", "<onBridgeConfigurationChanged> mActivity is null or finishing");
        } else {
            m8327a(this.f11351c);
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i10, KeyEvent keyEvent) {
        HMSLog.m8727i("NotInstalledHmsAdapter", "<onKeyUp>");
    }
}
