package com.huawei.hms.api;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Fragment;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.activity.EnableServiceActivity;
import com.huawei.hms.activity.ForegroundIntentBuilder;
import com.huawei.hms.activity.internal.BusResponseCallback;
import com.huawei.hms.activity.internal.BusResponseResult;
import com.huawei.hms.adapter.AvailableUtil;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.adapter.p069ui.UpdateAdapter;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.ErrorDialogFragment;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.api.AvailabilityException;
import com.huawei.hms.common.api.HuaweiApiCallable;
import com.huawei.hms.common.internal.ConnectionErrorMessages;
import com.huawei.hms.common.internal.DialogRedirect;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.note.AppSpoofResolution;
import com.huawei.hms.update.note.DoNothingResolution;
import com.huawei.hms.update.note.NotInstalledHmsResolution;
import com.huawei.hms.update.p073ui.UpdateBean;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.huawei.hms.utils.UIUtil;
import com.huawei.hms.utils.Util;
import p385w4.AbstractC11701e;
import p385w4.C11702f;

/* renamed from: com.huawei.hms.api.a */
/* loaded from: classes5.dex */
public final class C7246a extends HuaweiApiAvailability {

    /* renamed from: a */
    public static final C7246a f11410a = new C7246a();

    /* renamed from: com.huawei.hms.api.a$a */
    public class a implements BusResponseCallback {

        /* renamed from: a */
        public final /* synthetic */ C11702f[] f11411a;

        public a(C11702f[] c11702fArr) {
            this.f11411a = c11702fArr;
        }

        @Override // com.huawei.hms.activity.internal.BusResponseCallback
        public BusResponseResult innerError(Activity activity, int i10, String str) {
            HMSLog.m8725e("HuaweiApiAvailabilityImpl", "Test foreground bus error: resultCode " + i10 + ", errMessage" + str);
            this.f11411a[0].m25873b(new AvailabilityException());
            return null;
        }

        @Override // com.huawei.hms.activity.internal.BusResponseCallback
        public BusResponseResult succeedReturn(Activity activity, int i10, Intent intent) {
            HMSLog.m8727i("HuaweiApiAvailabilityImpl", "Test foreground bus success: resultCode " + i10 + ", data" + intent);
            return null;
        }
    }

    /* renamed from: a */
    public static Dialog m8372a(Activity activity, int i10, DialogRedirect dialogRedirect, DialogInterface.OnCancelListener onCancelListener) {
        if (i10 == 0) {
            return null;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, UIUtil.getDialogThemeId(activity));
        builder.setMessage(ConnectionErrorMessages.getErrorMessage(activity, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        builder.setPositiveButton(ConnectionErrorMessages.getErrorDialogButtonMessage(activity, i10), dialogRedirect);
        if (Util.isAvailableLibExist(activity) && AvailableUtil.isInstallerLibExist(activity)) {
            String errorTitle = ConnectionErrorMessages.getErrorTitle(activity, i10);
            if (errorTitle != null) {
                builder.setTitle(errorTitle);
            }
        } else {
            String errorTitle2 = ConnectionErrorMessages.getErrorTitle(activity, i10);
            if (errorTitle2 != null) {
                builder.setTitle(errorTitle2);
            }
        }
        return UIUtil.enableFocusedForButtonsInTV(builder.create());
    }

    /* renamed from: c */
    public static Intent m8373c(Activity activity, String str) {
        return BridgeActivity.getIntentStartBridgeActivity(activity, str);
    }

    /* renamed from: d */
    public static Intent m8374d(Context context, String str) {
        return BridgeActivity.getIntentStartBridgeActivity(context, str);
    }

    /* renamed from: f */
    public static void m8375f(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        Checker.checkNonNull(activity, "activity must not be null.");
        ErrorDialogFragment.newInstance(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    /* renamed from: h */
    public static C7246a m8376h() {
        return f11410a;
    }

    /* renamed from: b */
    public final Intent m8377b(Activity activity, int i10) {
        HMSLog.m8727i("HuaweiApiAvailabilityImpl", "getErrorResolutionIntent, errorCode: " + i10);
        if (i10 == 1 || i10 == 2) {
            return (Util.isAvailableLibExist(activity) && AvailableUtil.isInstallerLibExist(activity)) ? (Intent) UpdateAdapter.invokeMethod("com.huawei.hms.update.manager.UpdateManager", "startUpdateIntent", new Object[]{activity}) : BridgeActivity.getIntentStartBridgeActivity(activity, DoNothingResolution.class.getName());
        }
        if (i10 == 6) {
            return BridgeActivity.getIntentStartBridgeActivity(activity, BindingFailedResolution.class.getName());
        }
        if (i10 == 9 && Util.isAvailableLibExist(activity)) {
            return BridgeActivity.getIntentStartBridgeActivity(activity, AppSpoofResolution.class.getName());
        }
        return null;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public AbstractC11701e checkApiAccessible(HuaweiApi huaweiApi, HuaweiApi... huaweiApiArr) {
        AbstractC11701e abstractC11701eM25872a = new C11702f().m25872a();
        if (huaweiApi != null) {
            try {
                m8379g(huaweiApi);
            } catch (AvailabilityException e10) {
                HMSLog.m8727i("HuaweiApiAvailabilityImpl", "checkApi has AvailabilityException " + e10.getMessage());
            }
        }
        if (huaweiApiArr != null) {
            for (HuaweiApi huaweiApi2 : huaweiApiArr) {
                m8379g(huaweiApi2);
            }
        }
        return abstractC11701eM25872a;
    }

    /* renamed from: e */
    public final UpdateBean m8378e(Context context) {
        UpdateBean updateBean = new UpdateBean();
        updateBean.setHmsOrApkUpgrade(true);
        updateBean.setClientPackageName(HMSPackageManager.getInstance(context).getHMSPackageName());
        if (TextUtils.isEmpty(updateBean.getClientPackageName())) {
            updateBean.setClientPackageName("com.huawei.hwid");
        }
        updateBean.setClientVersionCode(HuaweiApiAvailability.getServicesVersionCode());
        updateBean.setClientAppId("C10132067");
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(context);
        }
        try {
            updateBean.setClientAppName(ResourceLoaderUtil.getString("hms_update_title"));
            return updateBean;
        } catch (Exception e10) {
            HMSLog.m8725e("HuaweiApiAvailabilityImpl", "getString has Exception:" + e10.getMessage());
            return updateBean;
        }
    }

    /* renamed from: g */
    public final void m8379g(Object obj) throws AvailabilityException {
        AvailabilityException availabilityException = new AvailabilityException();
        if ((obj instanceof HuaweiApi ? availabilityException.getConnectionResult((HuaweiApi<? extends Api.ApiOptions>) obj) : availabilityException.getConnectionResult((HuaweiApiCallable) obj)).getErrorCode() == 0) {
            return;
        }
        HMSLog.m8727i("HuaweiApiAvailabilityImpl", "The service is unavailable: " + availabilityException.getMessage());
        throw availabilityException;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public PendingIntent getErrPendingIntent(Context context, ConnectionResult connectionResult) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(connectionResult);
        return m8381j(context, connectionResult.getErrorCode());
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public Dialog getErrorDialog(Activity activity, int i10, int i11) {
        Checker.checkNonNull(activity, "activity must not be null.");
        HMSLog.m8727i("HuaweiApiAvailabilityImpl", "Enter getErrorDialog, errorCode: " + i10);
        return getErrorDialog(activity, i10, i11, null);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public String getErrorString(int i10) {
        HMSLog.m8727i("HuaweiApiAvailabilityImpl", "Enter getErrorString, errorCode: " + i10);
        return ConnectionResult.getErrorString(i10);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public AbstractC11701e getHuaweiServicesReady(Activity activity) {
        Preconditions.checkNotNull(activity);
        C11702f[] c11702fArr = {new C11702f()};
        AbstractC11701e abstractC11701eM25872a = c11702fArr[0].m25872a();
        int iIsHuaweiMobileServicesAvailable = isHuaweiMobileServicesAvailable(activity.getApplicationContext(), 30000000);
        Intent resolveErrorIntent = getResolveErrorIntent(activity, iIsHuaweiMobileServicesAvailable);
        Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(activity, ResolutionDelegate.class.getName());
        if (resolveErrorIntent != null) {
            ForegroundIntentBuilder.registerResponseCallback(ResolutionDelegate.CALLBACK_METHOD, new a(c11702fArr));
            Bundle bundle = new Bundle();
            bundle.putParcelable(CommonCode.MapKey.HAS_RESOLUTION, resolveErrorIntent);
            intentStartBridgeActivity.putExtras(bundle);
            activity.startActivity(intentStartBridgeActivity);
            return abstractC11701eM25872a;
        }
        if (iIsHuaweiMobileServicesAvailable == 3) {
            Intent intent = new Intent();
            intent.setClass(activity, EnableServiceActivity.class);
            activity.startActivity(intent);
            return abstractC11701eM25872a;
        }
        if (iIsHuaweiMobileServicesAvailable == 0) {
            HMSLog.m8727i("HuaweiApiAvailabilityImpl", "The HMS service is available.");
            return abstractC11701eM25872a;
        }
        HMSLog.m8725e("HuaweiApiAvailabilityImpl", "Framework can not solve the availability problem.");
        c11702fArr[0].m25873b(new AvailabilityException());
        return abstractC11701eM25872a;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public Intent getResolveErrorIntent(Activity activity, int i10) {
        HMSLog.m8727i("HuaweiApiAvailabilityImpl", "Enter getResolveErrorIntent, errorCode: " + i10);
        if (activity == null) {
            return null;
        }
        if (i10 == 1 || i10 == 2) {
            return (Util.isAvailableLibExist(activity) && AvailableUtil.isInstallerLibExist(activity)) ? (Intent) UpdateAdapter.invokeMethod("com.huawei.hms.update.manager.UpdateManager", "getStartUpdateIntent", new Object[]{activity, m8378e(activity.getApplicationContext())}) : m8373c(activity, NotInstalledHmsResolution.class.getName());
        }
        if (i10 == 6) {
            return m8373c(activity, BindingFailedResolution.class.getName());
        }
        if (i10 == 9 && Util.isAvailableLibExist(activity)) {
            return m8373c(activity, AppSpoofResolution.class.getName());
        }
        return null;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public PendingIntent getResolveErrorPendingIntent(Activity activity, int i10) {
        HMSLog.m8727i("HuaweiApiAvailabilityImpl", "Enter getResolveErrorPendingIntent, errorCode: " + i10);
        Intent resolveErrorIntent = getResolveErrorIntent(activity, i10);
        if (resolveErrorIntent != null) {
            return PendingIntent.getActivity(activity, 0, resolveErrorIntent, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        }
        return null;
    }

    /* renamed from: i */
    public Intent m8380i(Context context, int i10) {
        HMSLog.m8727i("HuaweiApiAvailabilityImpl", "Enter getResolveErrorIntent, errorCode: " + i10);
        if (i10 == 1 || i10 == 2) {
            return (Util.isAvailableLibExist(context) && AvailableUtil.isInstallerLibExist(context)) ? (Intent) UpdateAdapter.invokeMethod("com.huawei.hms.update.manager.UpdateManager", "getStartUpdateIntent", new Object[]{context, m8378e(context.getApplicationContext())}) : m8374d(context, NotInstalledHmsResolution.class.getName());
        }
        if (i10 == 6) {
            return m8374d(context, BindingFailedResolution.class.getName());
        }
        if (i10 == 9 && Util.isAvailableLibExist(context)) {
            return m8374d(context, AppSpoofResolution.class.getName());
        }
        return null;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public int isHuaweiMobileNoticeAvailable(Context context) {
        Checker.checkNonNull(context, "context must not be null.");
        PackageManagerHelper packageManagerHelper = new PackageManagerHelper(context);
        String hMSPackageNameForMultiService = HMSPackageManager.getInstance(context).getHMSPackageNameForMultiService();
        if (TextUtils.isEmpty(hMSPackageNameForMultiService)) {
            HMSLog.m8728w("HuaweiApiAvailabilityImpl", "hmsPackageName is empty, Service is invalid.");
            return 1;
        }
        if (!PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(packageManagerHelper.getPackageStates(hMSPackageNameForMultiService))) {
            return HMSPackageManager.getInstance(context).isApkUpdateNecessary(20600000) ? 2 : 0;
        }
        HMSLog.m8728w("HuaweiApiAvailabilityImpl", "hmsPackageName is not installed, Service is invalid.");
        return 1;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public int isHuaweiMobileServicesAvailable(Context context) {
        Checker.checkNonNull(context, "context must not be null.");
        return HuaweiMobileServicesUtil.isHuaweiMobileServicesAvailable(context, HuaweiApiAvailability.getServicesVersionCode());
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public boolean isUserResolvableError(int i10, PendingIntent pendingIntent) {
        if (i10 == 0) {
            return false;
        }
        return pendingIntent != null || i10 == 1 || i10 == 2 || i10 == 6 || i10 == 9;
    }

    /* renamed from: j */
    public PendingIntent m8381j(Context context, int i10) {
        HMSLog.m8727i("HuaweiApiAvailabilityImpl", "Enter getResolveErrorPendingIntent, errorCode: " + i10);
        Intent intentM8380i = m8380i(context, i10);
        if (intentM8380i != null) {
            return PendingIntent.getActivity(context, 0, intentM8380i, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        }
        return null;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public void popupErrNotification(Context context, ConnectionResult connectionResult) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(connectionResult);
        showErrorNotification(context, connectionResult.getErrorCode());
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public void resolveError(Activity activity, int i10, int i11) throws IntentSender.SendIntentException {
        resolveError(activity, i10, i11, null);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public boolean showErrorDialogFragment(Activity activity, int i10, int i11) {
        return showErrorDialogFragment(activity, i10, i11, null);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public void showErrorNotification(Context context, int i10) {
        Checker.checkNonNull(context, "context must not be null.");
        HMSLog.m8727i("HuaweiApiAvailabilityImpl", "Enter showErrorNotification, errorCode: " + i10);
        if (!(context instanceof Activity)) {
            HMSLog.m8727i("HuaweiApiAvailabilityImpl", "context not instanceof Activity");
            return;
        }
        Dialog errorDialog = getErrorDialog((Activity) context, i10, 0);
        if (errorDialog == null) {
            HMSLog.m8727i("HuaweiApiAvailabilityImpl", "showErrorNotification errorDialog can not be null");
        } else {
            errorDialog.show();
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public boolean isUserResolvableError(int i10) {
        return isUserResolvableError(i10, null);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public void resolveError(Activity activity, int i10, int i11, PendingIntent pendingIntent) throws IntentSender.SendIntentException {
        Checker.checkNonNull(activity, "activity must not be null.");
        if (pendingIntent != null) {
            HMSLog.m8727i("HuaweiApiAvailabilityImpl", "Enter resolveError, param pendingIntent is not null. and.errorCode: " + i10);
        } else {
            HMSLog.m8727i("HuaweiApiAvailabilityImpl", "Enter resolveError, param pendingIntent is  null. get pendingIntent from error code.and.errorCode: " + i10);
            pendingIntent = getResolveErrorPendingIntent(activity, i10);
        }
        if (pendingIntent != null) {
            HMSLog.m8727i("HuaweiApiAvailabilityImpl", "In resolveError, start pendingIntent.errorCode: " + i10);
            try {
                activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i11, null, 0, 0, 0);
            } catch (IntentSender.SendIntentException unused) {
                HMSLog.m8725e("HuaweiApiAvailabilityImpl", "Enter resolveError, start pendingIntent failed.errorCode: " + i10);
            }
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public boolean showErrorDialogFragment(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog errorDialog = getErrorDialog(activity, i10, i11, onCancelListener);
        if (errorDialog == null) {
            return false;
        }
        m8375f(activity, errorDialog, HuaweiMobileServicesUtil.HMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public Dialog getErrorDialog(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Checker.checkNonNull(activity, "activity must not be null.");
        HMSLog.m8727i("HuaweiApiAvailabilityImpl", "Enter getErrorDialog, errorCode: " + i10);
        return m8372a(activity, i10, DialogRedirect.getInstance(activity, m8377b(activity, i10), i11), onCancelListener);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public int isHuaweiMobileServicesAvailable(Context context, int i10) {
        Checker.checkNonNull(context, "context must not be null.");
        return HuaweiMobileServicesUtil.isHuaweiMobileServicesAvailable(context, i10);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public boolean showErrorDialogFragment(Activity activity, int i10, Fragment fragment, int i11, DialogInterface.OnCancelListener onCancelListener) {
        return showErrorDialogFragment(activity, i10, i11, onCancelListener);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public PendingIntent getErrPendingIntent(Context context, int i10, int i11) {
        HMSLog.m8727i("HuaweiApiAvailabilityImpl", "Enter getResolveErrorPendingIntent, errorCode: " + i10 + " requestCode: " + i11);
        Intent intentM8380i = m8380i(context, i10);
        if (intentM8380i != null) {
            return PendingIntent.getActivity(context, i11, intentM8380i, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        }
        return null;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public AbstractC11701e checkApiAccessible(HuaweiApiCallable huaweiApiCallable, HuaweiApiCallable... huaweiApiCallableArr) {
        AbstractC11701e abstractC11701eM25872a = new C11702f().m25872a();
        if (huaweiApiCallable != null) {
            try {
                m8379g(huaweiApiCallable);
            } catch (AvailabilityException e10) {
                HMSLog.m8727i("HuaweiApiAvailabilityImpl", "HuaweiApiCallable checkApi has AvailabilityException " + e10.getMessage());
            }
        }
        if (huaweiApiCallableArr != null) {
            for (HuaweiApiCallable huaweiApiCallable2 : huaweiApiCallableArr) {
                m8379g(huaweiApiCallable2);
            }
        }
        return abstractC11701eM25872a;
    }
}
