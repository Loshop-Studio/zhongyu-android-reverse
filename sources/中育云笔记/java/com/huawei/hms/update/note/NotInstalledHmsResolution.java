package com.huawei.hms.update.note;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.availableupdate.C7248b;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.p073ui.NotInstalledHmsDialogHelper;
import com.huawei.hms.utils.UIUtil;

/* loaded from: classes5.dex */
public class NotInstalledHmsResolution implements IBridgeActivityDelegate {

    /* renamed from: c */
    public Dialog f11801c;

    /* renamed from: d */
    public Activity f11802d;

    /* renamed from: com.huawei.hms.update.note.NotInstalledHmsResolution$a */
    public static class DialogInterfaceOnClickListenerC7353a implements DialogInterface.OnClickListener {

        /* renamed from: c */
        public final Activity f11803c;

        public DialogInterfaceOnClickListenerC7353a(Activity activity) {
            this.f11803c = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            HMSLog.m8727i("NotInstalledHmsResolution", "<Dialog onClick>");
            this.f11803c.finish();
        }
    }

    /* renamed from: a */
    private void m8741a() {
        Dialog dialog = this.f11801c;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.f11801c.cancel();
    }

    /* renamed from: b */
    private void m8742b(Activity activity) {
        m8741a();
        AlertDialog alertDialogCreate = NotInstalledHmsDialogHelper.getDialogBuilder(activity).setPositiveButton(NotInstalledHmsDialogHelper.getConfirmResId(activity), new DialogInterfaceOnClickListenerC7353a(activity)).create();
        this.f11801c = alertDialogCreate;
        UIUtil.enableFocusedForButtonsInTV(alertDialogCreate);
        this.f11801c.show();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        HMSLog.m8727i("NotInstalledHmsResolution", "<Resolution getRequestCode>");
        return 0;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        HMSLog.m8727i("NotInstalledHmsResolution", "<Resolution onBridgeActivityCreate>");
        if (activity == null || activity.isFinishing()) {
            HMSLog.m8725e("NotInstalledHmsResolution", "<Resolution onBridgeActivityCreate> activity is null or finishing");
            return;
        }
        this.f11802d = activity;
        C7248b.f11417b.m8386a(activity);
        m8742b(activity);
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        HMSLog.m8727i("NotInstalledHmsResolution", "<Resolution onBridgeActivityDestroy>");
        m8741a();
        C7248b.f11417b.m8387b(this.f11802d);
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i10, int i11, Intent intent) {
        HMSLog.m8727i("NotInstalledHmsResolution", "<Resolution onBridgeActivityResult>");
        return false;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        HMSLog.m8727i("NotInstalledHmsResolution", "<Resolution onBridgeConfigurationChanged>");
        Activity activity = this.f11802d;
        if (activity == null || activity.isFinishing()) {
            HMSLog.m8725e("NotInstalledHmsResolution", "<Resolution onBridgeActivityCreate> mActivity is null or finishing");
        } else {
            m8742b(this.f11802d);
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i10, KeyEvent keyEvent) {
        HMSLog.m8727i("NotInstalledHmsResolution", "<Resolution onKeyUp>");
    }
}
