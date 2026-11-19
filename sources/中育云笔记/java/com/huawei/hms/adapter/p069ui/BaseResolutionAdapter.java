package com.huawei.hms.adapter.p069ui;

import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.kpms.KpmsConstant;
import com.huawei.hms.utils.RegionUtils;
import com.huawei.hms.utils.ResolutionFlagUtil;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class BaseResolutionAdapter implements IBridgeActivityDelegate {

    /* renamed from: c */
    public WeakReference f11346c;

    /* renamed from: d */
    public String f11347d = "";

    /* renamed from: e */
    public long f11348e = 0;

    /* renamed from: c */
    private void m8322c() {
        Activity activityM8326d = m8326d();
        if (activityM8326d == null || activityM8326d.isFinishing()) {
            return;
        }
        activityM8326d.finish();
    }

    /* renamed from: e */
    private void m8323e() {
        SystemManager.getInstance().notifyResolutionResult(null, this.f11347d);
        m8322c();
    }

    /* renamed from: a */
    public final void m8324a(long j10) {
        if (!RegionUtils.isChinaROM(m8326d())) {
            HMSLog.m8727i("BaseResolutionAdapter", "not ChinaROM");
            return;
        }
        Activity activityM8326d = m8326d();
        if (activityM8326d == null || activityM8326d.isFinishing()) {
            return;
        }
        HashMap map = new HashMap();
        map.put("package", activityM8326d.getPackageName());
        map.put(CommonCode.MapKey.RESOLUTION_FLAG, this.f11348e + "-" + j10);
        HiAnalyticsUtils.getInstance().onEvent(activityM8326d, HiAnalyticsConstant.HMS_SDK_BASE_START_RESOLUTION, map);
        HMSLog.m8725e("BaseResolutionAdapter", "check resolution flag failed, transactionId: " + this.f11347d + ", carriedTimeStamp: " + this.f11348e + ", savedTimeStamp: " + j10);
    }

    /* renamed from: b */
    public final boolean m8325b() {
        long resolutionFlag = ResolutionFlagUtil.getInstance().getResolutionFlag(this.f11347d);
        ResolutionFlagUtil.getInstance().removeResolutionFlag(this.f11347d);
        if (resolutionFlag != 0 && resolutionFlag == this.f11348e) {
            return true;
        }
        m8324a(resolutionFlag);
        return false;
    }

    /* renamed from: d */
    public final Activity m8326d() {
        WeakReference weakReference = this.f11346c;
        if (weakReference == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 1001;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBridgeActivityCreate(android.app.Activity r10) throws android.content.IntentSender.SendIntentException {
        /*
            r9 = this;
            java.lang.String r1 = "BaseResolutionAdapter"
            if (r10 != 0) goto Ld
            java.lang.String r10 = "activity is null"
            com.huawei.hms.support.log.HMSLog.m8725e(r1, r10)
            r9.m8323e()
            return
        Ld:
            boolean r0 = r10.isFinishing()
            if (r0 == 0) goto L19
            java.lang.String r10 = "activity is finishing"
            com.huawei.hms.support.log.HMSLog.m8725e(r1, r10)
            return
        L19:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r10)
            r9.f11346c = r0
            android.content.Intent r0 = r10.getIntent()
            if (r0 != 0) goto L2a
            r9.m8323e()
            return
        L2a:
            android.os.Bundle r2 = r0.getExtras()     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = "transaction_id"
            java.lang.String r3 = r0.getStringExtra(r3)     // Catch: java.lang.Throwable -> L41
            r9.f11347d = r3     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = "resolution_flag"
            r4 = 0
            long r3 = r0.getLongExtra(r3, r4)     // Catch: java.lang.Throwable -> L41
            r9.f11348e = r3     // Catch: java.lang.Throwable -> L41
            goto L61
        L41:
            r0 = move-exception
            goto L45
        L43:
            r0 = move-exception
            r2 = 0
        L45:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "get transaction_id or resolution_flag exception:"
            r3.append(r4)
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.huawei.hms.support.log.HMSLog.m8725e(r1, r0)
        L61:
            boolean r0 = r9.m8325b()
            if (r0 != 0) goto L6b
            r9.m8323e()
            return
        L6b:
            java.lang.String r0 = r9.f11347d
            if (r0 == 0) goto L83
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r0 < r3) goto L83
            java.lang.String r0 = "remove apk resolution failed task."
            com.huawei.hms.support.log.HMSLog.m8727i(r1, r0)
            com.huawei.hms.adapter.sysobs.ApkResolutionFailedManager r0 = com.huawei.hms.adapter.sysobs.ApkResolutionFailedManager.getInstance()
            java.lang.String r3 = r9.f11347d
            r0.removeTask(r3)
        L83:
            if (r2 != 0) goto L89
            r9.m8323e()
            return
        L89:
            java.lang.String r0 = "resolution"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            if (r0 != 0) goto L95
            r9.m8323e()
            return
        L95:
            boolean r2 = r0 instanceof android.content.Intent
            if (r2 == 0) goto Lae
            android.content.Intent r0 = (android.content.Intent) r0     // Catch: java.lang.Throwable -> La5
            android.content.Intent r0 = com.huawei.hms.utils.IntentUtil.modifyIntentBehaviorsSafe(r0)     // Catch: java.lang.Throwable -> La5
            r2 = 1001(0x3e9, float:1.403E-42)
            r10.startActivityForResult(r0, r2)     // Catch: java.lang.Throwable -> La5
            goto Lcb
        La5:
            r9.m8323e()
            java.lang.String r10 = "ActivityNotFoundException:exception"
            com.huawei.hms.support.log.HMSLog.m8725e(r1, r10)
            goto Lcb
        Lae:
            boolean r2 = r0 instanceof android.app.PendingIntent
            if (r2 == 0) goto Lcb
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0     // Catch: android.content.IntentSender.SendIntentException -> Lc3
            android.content.IntentSender r3 = r0.getIntentSender()     // Catch: android.content.IntentSender.SendIntentException -> Lc3
            r7 = 0
            r8 = 0
            r4 = 1001(0x3e9, float:1.403E-42)
            r5 = 0
            r6 = 0
            r2 = r10
            r2.startIntentSenderForResult(r3, r4, r5, r6, r7, r8)     // Catch: android.content.IntentSender.SendIntentException -> Lc3
            goto Lcb
        Lc3:
            r9.m8323e()
            java.lang.String r10 = "SendIntentException:exception"
            com.huawei.hms.support.log.HMSLog.m8725e(r1, r10)
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.adapter.p069ui.BaseResolutionAdapter.onBridgeActivityCreate(android.app.Activity):void");
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        HMSLog.m8727i("BaseResolutionAdapter", "onBridgeActivityDestroy");
        this.f11346c = null;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i10, int i11, Intent intent) {
        if (i10 != getRequestCode()) {
            return false;
        }
        HMSLog.m8727i("BaseResolutionAdapter", "onBridgeActivityResult, resultCode: " + i11);
        if (i11 == 1001 || i11 == 1002) {
            if (intent == null) {
                intent = new Intent();
            }
            intent.putExtra(CommonCode.MapKey.PRIVACY_STATEMENT_CONFIRM_RESULT, i11);
        }
        if (i11 == -1 || intent.hasExtra(KpmsConstant.KIT_UPDATE_RESULT) || intent.hasExtra(CommonCode.MapKey.PRIVACY_STATEMENT_CONFIRM_RESULT)) {
            SystemManager.getInstance().notifyResolutionResult(intent, this.f11347d);
        } else {
            SystemManager.getInstance().notifyResolutionResult(null, this.f11347d);
        }
        m8322c();
        return true;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        HMSLog.m8727i("BaseResolutionAdapter", "onBridgeConfigurationChanged");
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i10, KeyEvent keyEvent) {
        HMSLog.m8727i("BaseResolutionAdapter", "On key up when resolve conn error");
    }
}
