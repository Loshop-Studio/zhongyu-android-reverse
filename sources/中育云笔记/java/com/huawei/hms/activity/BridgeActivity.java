package com.huawei.hms.activity;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.p072ui.SafeIntent;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.ResolutionFlagUtil;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.huawei.hms.utils.UIUtil;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes5.dex */
public class BridgeActivity extends Activity {
    public static final String EXTRA_DELEGATE_CLASS_NAME = "intent.extra.DELEGATE_CLASS_OBJECT";
    public static final String EXTRA_DELEGATE_UPDATE_INFO = "intent.extra.update.info";
    public static final String EXTRA_INTENT = "intent.extra.intent";
    public static final String EXTRA_IS_FULLSCREEN = "intent.extra.isfullscreen";
    public static final String EXTRA_RESULT = "intent.extra.RESULT";

    /* renamed from: d */
    public static final int f11261d = m8229a("ro.build.hw_emui_api_level", 0);

    /* renamed from: c */
    public IBridgeActivityDelegate f11262c;

    /* renamed from: com.huawei.hms.activity.BridgeActivity$a */
    public class ViewOnApplyWindowInsetsListenerC7220a implements View.OnApplyWindowInsetsListener {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f11263a;

        public ViewOnApplyWindowInsetsListenerC7220a(ViewGroup viewGroup) {
            this.f11263a = viewGroup;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                Object objInvoke = Class.forName("com.huawei.android.view.WindowManagerEx$LayoutParamsEx").getMethod("getDisplaySideRegion", WindowInsets.class).invoke(null, windowInsets);
                if (objInvoke == null) {
                    HMSLog.m8727i("BridgeActivity", "sideRegion is null");
                } else {
                    Rect rect = (Rect) Class.forName("com.huawei.android.view.DisplaySideRegionEx").getMethod("getSafeInsets", null).invoke(objInvoke, null);
                    ViewGroup viewGroup = this.f11263a;
                    if (viewGroup != null) {
                        viewGroup.setPadding(rect.left, 0, rect.right, 0);
                    }
                }
            } catch (ClassNotFoundException e10) {
                e = e10;
                HMSLog.m8725e("BridgeActivity", "An exception occurred while reading: onApplyWindowInsets" + e.getMessage());
                return view.onApplyWindowInsets(windowInsets);
            } catch (IllegalAccessException e11) {
                e = e11;
                HMSLog.m8725e("BridgeActivity", "An exception occurred while reading: onApplyWindowInsets" + e.getMessage());
                return view.onApplyWindowInsets(windowInsets);
            } catch (NoSuchMethodException e12) {
                e = e12;
                HMSLog.m8725e("BridgeActivity", "An exception occurred while reading: onApplyWindowInsets" + e.getMessage());
                return view.onApplyWindowInsets(windowInsets);
            } catch (InvocationTargetException e13) {
                e = e13;
                HMSLog.m8725e("BridgeActivity", "An exception occurred while reading: onApplyWindowInsets" + e.getMessage());
                return view.onApplyWindowInsets(windowInsets);
            }
            return view.onApplyWindowInsets(windowInsets);
        }
    }

    /* renamed from: a */
    public static int m8229a(String str, int i10) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return ((Integer) cls.getDeclaredMethod("getInt", String.class, Integer.TYPE).invoke(cls, str, Integer.valueOf(i10))).intValue();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            HMSLog.m8725e("BridgeActivity", "An exception occurred while reading: EMUI_SDK_INT");
            return i10;
        }
    }

    /* renamed from: c */
    public static void m8230c(Window window, boolean z10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            window.getClass().getMethod("setHwFloating", Boolean.TYPE).invoke(window, Boolean.valueOf(z10));
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e10) {
            HMSLog.m8725e("BridgeActivity", "In setHwFloating, Failed to call Window.setHwFloating()." + e10.getMessage());
        }
    }

    public static Intent getIntentStartBridgeActivity(Activity activity, String str) {
        Intent intent = new Intent(activity, (Class<?>) BridgeActivity.class);
        intent.putExtra(EXTRA_DELEGATE_CLASS_NAME, str);
        intent.putExtra(EXTRA_IS_FULLSCREEN, UIUtil.isActivityFullscreen(activity));
        return intent;
    }

    public static void setFullScreenWindowLayoutInDisplayCutout(Window window) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        if (window == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            window.setAttributes(attributes);
            window.getDecorView().setSystemUiVisibility(1280);
            return;
        }
        WindowManager.LayoutParams attributes2 = window.getAttributes();
        try {
            Class<?> cls = Class.forName("com.huawei.android.view.LayoutParamsEx");
            cls.getMethod("addHwFlags", Integer.TYPE).invoke(cls.getConstructor(WindowManager.LayoutParams.class).newInstance(attributes2), 65536);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            HMSLog.m8725e("BridgeActivity", "com.huawei.android.view.LayoutParamsEx fail");
        }
    }

    /* renamed from: b */
    public final void m8231b() {
        try {
            if (isFinishing() || isDestroyed()) {
                return;
            }
            setResult(1, null);
            finish();
        } catch (Throwable th) {
            HMSLog.m8726e("BridgeActivity", "finishBridgeActivity has an exception", th);
            throw new IllegalArgumentException("finishBridgeActivity has an exception ", th);
        }
    }

    /* renamed from: d */
    public final void m8232d() throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        View viewFindViewById = getWindow().findViewById(R.id.content);
        if (viewFindViewById == null || !(viewFindViewById instanceof ViewGroup)) {
            HMSLog.m8725e("BridgeActivity", "rootView is null or not ViewGroup");
            return;
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById;
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        try {
            Class<?> cls = Class.forName("com.huawei.android.view.WindowManagerEx$LayoutParamsEx");
            cls.getMethod("setDisplaySideMode", Integer.TYPE).invoke(cls.getDeclaredConstructor(WindowManager.LayoutParams.class).newInstance(attributes), 1);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            HMSLog.m8725e("BridgeActivity", "An exception occurred while reading: setDisplaySideMode" + e10.getMessage());
        }
        getWindow().getDecorView().setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC7220a(viewGroup));
    }

    /* renamed from: e */
    public final boolean m8233e() {
        Intent intent = getIntent();
        if (intent == null) {
            HMSLog.m8725e("BridgeActivity", "In initialize, Must not pass in a null intent.");
            return false;
        }
        if (intent.getBooleanExtra(EXTRA_IS_FULLSCREEN, false)) {
            getWindow().setFlags(1024, 1024);
        }
        try {
            String stringExtra = intent.getStringExtra(EXTRA_DELEGATE_CLASS_NAME);
            if (stringExtra == null) {
                HMSLog.m8725e("BridgeActivity", "In initialize, Must not pass in a null or non class object.");
                return false;
            }
            IBridgeActivityDelegate iBridgeActivityDelegate = (IBridgeActivityDelegate) Class.forName(stringExtra).asSubclass(IBridgeActivityDelegate.class).newInstance();
            this.f11262c = iBridgeActivityDelegate;
            try {
                iBridgeActivityDelegate.onBridgeActivityCreate(this);
                return true;
            } catch (Throwable th) {
                HMSLog.m8725e("BridgeActivity", "onBridgeActivityCreate Exception." + th.getMessage());
                return false;
            }
        } catch (ClassCastException e10) {
            e = e10;
            HMSLog.m8725e("BridgeActivity", "In initialize, Failed to create 'IUpdateWizard' instance." + e.getMessage());
            return false;
        } catch (ClassNotFoundException e11) {
            e = e11;
            HMSLog.m8725e("BridgeActivity", "In initialize, Failed to create 'IUpdateWizard' instance." + e.getMessage());
            return false;
        } catch (IllegalAccessException e12) {
            e = e12;
            HMSLog.m8725e("BridgeActivity", "In initialize, Failed to create 'IUpdateWizard' instance." + e.getMessage());
            return false;
        } catch (IllegalStateException e13) {
            e = e13;
            HMSLog.m8725e("BridgeActivity", "In initialize, Failed to create 'IUpdateWizard' instance." + e.getMessage());
            return false;
        } catch (InstantiationException e14) {
            e = e14;
            HMSLog.m8725e("BridgeActivity", "In initialize, Failed to create 'IUpdateWizard' instance." + e.getMessage());
            return false;
        } catch (Throwable unused) {
            HMSLog.m8725e("BridgeActivity", "In initialize, Failed to create 'IUpdateWizard' instance, throwable occur.");
            return false;
        }
    }

    /* renamed from: f */
    public final void m8234f() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        m8235g();
        Window window = getWindow();
        if (f11261d >= 9) {
            window.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            m8230c(window, true);
        }
        window.getDecorView().setSystemUiVisibility(0);
    }

    @Override // android.app.Activity
    public void finish() {
        HMSLog.m8727i("BridgeActivity", "Enter finish.");
        super.finish();
    }

    /* renamed from: g */
    public final void m8235g() {
        try {
            if (getWindow() == null) {
                HMSLog.m8728w("BridgeActivity", "requestHideTitle, window is null.");
            } else {
                requestWindowFeature(1);
            }
        } catch (Throwable th) {
            HMSLog.m8728w("BridgeActivity", "requestWindowFeature " + th.getMessage());
        }
    }

    @Override // android.app.Activity
    public Intent getIntent() {
        Intent intentModifyIntentBehaviorsSafe = UIUtil.modifyIntentBehaviorsSafe(super.getIntent());
        if (intentModifyIntentBehaviorsSafe != null) {
            return new SafeIntent(intentModifyIntentBehaviorsSafe);
        }
        return null;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        boolean zOnBridgeActivityResult;
        SafeIntent safeIntent = new SafeIntent(intent);
        super.onActivityResult(i10, i11, safeIntent);
        IBridgeActivityDelegate iBridgeActivityDelegate = this.f11262c;
        if (iBridgeActivityDelegate != null) {
            try {
                zOnBridgeActivityResult = iBridgeActivityDelegate.onBridgeActivityResult(i10, i11, safeIntent);
            } catch (Throwable unused) {
                HMSLog.m8728w("BridgeActivity", "onBridgeActivityResult failed, throwable occur.");
                zOnBridgeActivityResult = false;
            }
            if (zOnBridgeActivityResult || isFinishing()) {
                return;
            }
            setResult(i11, UIUtil.modifyIntentBehaviorsSafe(safeIntent));
            finish();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        IBridgeActivityDelegate iBridgeActivityDelegate = this.f11262c;
        if (iBridgeActivityDelegate != null) {
            iBridgeActivityDelegate.onBridgeConfigurationChanged();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        m8235g();
        super.onCreate(bundle);
        HMSLog.m8727i("BridgeActivity", "BridgeActivity onCreate");
        if (getIntent() == null) {
            setResult(1, null);
            finish();
            return;
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        m8234f();
        m8232d();
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(getApplicationContext());
        }
        setFullScreenWindowLayoutInDisplayCutout(getWindow());
        if (m8233e()) {
            return;
        }
        setResult(1, null);
        finish();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            ResolutionFlagUtil.getInstance().removeResolutionFlag(new SafeIntent(getIntent()).getStringExtra(CommonCode.MapKey.TRANSACTION_ID));
        } catch (Throwable th) {
            HMSLog.m8728w("BridgeActivity", "get transaction_id from intent fail: " + th.getClass().getSimpleName());
        }
        IBridgeActivityDelegate iBridgeActivityDelegate = this.f11262c;
        if (iBridgeActivityDelegate != null) {
            iBridgeActivityDelegate.onBridgeActivityDestroy();
        }
        HMSLog.m8727i("BridgeActivity", "BridgeActivity onDestroy");
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        IBridgeActivityDelegate iBridgeActivityDelegate = this.f11262c;
        if (iBridgeActivityDelegate != null) {
            iBridgeActivityDelegate.onKeyUp(i10, keyEvent);
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // android.app.Activity
    public void onResume() {
        try {
            super.onResume();
        } catch (Throwable th) {
            HMSLog.m8726e("BridgeActivity", "super.onResume has an exception", th);
            m8231b();
        }
    }

    public static Intent getIntentStartBridgeActivity(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) BridgeActivity.class);
        intent.putExtra(EXTRA_DELEGATE_CLASS_NAME, str);
        intent.putExtra(EXTRA_IS_FULLSCREEN, false);
        return intent;
    }
}
