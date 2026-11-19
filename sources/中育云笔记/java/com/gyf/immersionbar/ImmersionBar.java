package com.gyf.immersionbar;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.app.Fragment;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.video.AudioStats;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.color.utilities.Contrast;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

@TargetApi(19)
/* loaded from: classes5.dex */
public final class ImmersionBar implements ImmersionCallback {
    private int mActionBarHeight;
    private Activity mActivity;
    private BarConfig mBarConfig;
    private BarParams mBarParams;
    private ViewGroup mContentView;
    private ViewGroup mDecorView;
    private Dialog mDialog;
    private FitsKeyboard mFitsKeyboard;
    private int mFitsStatusBarType;
    private Fragment mFragment;
    private boolean mInitialized;
    private boolean mIsActionBarBelowLOLLIPOP;
    private boolean mIsActivity;
    private boolean mIsDialog;
    private boolean mIsDialogFragment;
    private boolean mIsFragment;
    private boolean mKeyboardTempEnable;
    private int mNavigationBarHeight;
    private int mNavigationBarWidth;
    private int mPaddingBottom;
    private int mPaddingLeft;
    private int mPaddingRight;
    private int mPaddingTop;
    private ImmersionBar mParentBar;
    private androidx.fragment.app.Fragment mSupportFragment;
    private Map<String, BarParams> mTagMap;
    private Window mWindow;

    /* renamed from: com.gyf.immersionbar.ImmersionBar$2 */
    public static /* synthetic */ class C72152 {
        static final /* synthetic */ int[] $SwitchMap$com$gyf$immersionbar$BarHide;

        static {
            int[] iArr = new int[BarHide.values().length];
            $SwitchMap$com$gyf$immersionbar$BarHide = iArr;
            try {
                iArr[BarHide.FLAG_HIDE_BAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$gyf$immersionbar$BarHide[BarHide.FLAG_HIDE_STATUS_BAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$gyf$immersionbar$BarHide[BarHide.FLAG_HIDE_NAVIGATION_BAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$gyf$immersionbar$BarHide[BarHide.FLAG_SHOW_BAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public ImmersionBar(Activity activity) {
        this.mIsActivity = false;
        this.mIsFragment = false;
        this.mIsDialogFragment = false;
        this.mIsDialog = false;
        this.mNavigationBarHeight = 0;
        this.mNavigationBarWidth = 0;
        this.mActionBarHeight = 0;
        this.mFitsKeyboard = null;
        this.mTagMap = new HashMap();
        this.mFitsStatusBarType = 0;
        this.mInitialized = false;
        this.mIsActionBarBelowLOLLIPOP = false;
        this.mKeyboardTempEnable = false;
        this.mPaddingLeft = 0;
        this.mPaddingTop = 0;
        this.mPaddingRight = 0;
        this.mPaddingBottom = 0;
        this.mIsActivity = true;
        this.mActivity = activity;
        initCommonParameter(activity.getWindow());
    }

    private void adjustDarkModeParams() {
        int i10;
        int i11;
        BarParams barParams = this.mBarParams;
        if (barParams.autoStatusBarDarkModeEnable && (i11 = barParams.statusBarColor) != 0) {
            statusBarDarkFont(i11 > -4539718, barParams.autoStatusBarDarkModeAlpha);
        }
        BarParams barParams2 = this.mBarParams;
        if (!barParams2.autoNavigationBarDarkModeEnable || (i10 = barParams2.navigationBarColor) == 0) {
            return;
        }
        navigationBarDarkIcon(i10 > -4539718, barParams2.autoNavigationBarDarkModeAlpha);
    }

    private void cancelListener() {
        if (this.mActivity != null) {
            FitsKeyboard fitsKeyboard = this.mFitsKeyboard;
            if (fitsKeyboard != null) {
                fitsKeyboard.cancel();
                this.mFitsKeyboard = null;
            }
            EMUI3NavigationBarObserver.getInstance().removeOnNavigationBarListener(this);
            NavigationBarObserver.getInstance().removeOnNavigationBarListener(this.mBarParams.onNavigationBarListener);
        }
    }

    public static boolean checkFitsSystemWindows(View view) {
        if (view == null) {
            return false;
        }
        if (view.getFitsSystemWindows()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (((childAt instanceof DrawerLayout) && checkFitsSystemWindows(childAt)) || childAt.getFitsSystemWindows()) {
                    return true;
                }
            }
        }
        return false;
    }

    private void checkInitWithActivity() {
        if (this.mParentBar == null) {
            this.mParentBar = with(this.mActivity);
        }
        ImmersionBar immersionBar = this.mParentBar;
        if (immersionBar == null || immersionBar.mInitialized) {
            return;
        }
        immersionBar.init();
    }

    public static void destroy(@NonNull androidx.fragment.app.Fragment fragment) {
        getRetriever().destroy(fragment, false);
    }

    private void fitsKeyboard() {
        if (!this.mIsFragment) {
            if (this.mBarParams.keyboardEnable) {
                if (this.mFitsKeyboard == null) {
                    this.mFitsKeyboard = new FitsKeyboard(this);
                }
                this.mFitsKeyboard.enable(this.mBarParams.keyboardMode);
                return;
            } else {
                FitsKeyboard fitsKeyboard = this.mFitsKeyboard;
                if (fitsKeyboard != null) {
                    fitsKeyboard.disable();
                    return;
                }
                return;
            }
        }
        ImmersionBar immersionBar = this.mParentBar;
        if (immersionBar != null) {
            if (immersionBar.mBarParams.keyboardEnable) {
                if (immersionBar.mFitsKeyboard == null) {
                    immersionBar.mFitsKeyboard = new FitsKeyboard(immersionBar);
                }
                ImmersionBar immersionBar2 = this.mParentBar;
                immersionBar2.mFitsKeyboard.enable(immersionBar2.mBarParams.keyboardMode);
                return;
            }
            FitsKeyboard fitsKeyboard2 = immersionBar.mFitsKeyboard;
            if (fitsKeyboard2 != null) {
                fitsKeyboard2.disable();
            }
        }
    }

    private void fitsLayoutOverlap() {
        int statusBarHeight = this.mBarParams.fitsLayoutOverlapEnable ? getStatusBarHeight(this.mActivity) : 0;
        int i10 = this.mFitsStatusBarType;
        if (i10 == 1) {
            setTitleBar(this.mActivity, statusBarHeight, this.mBarParams.titleBarView);
        } else if (i10 == 2) {
            setTitleBarMarginTop(this.mActivity, statusBarHeight, this.mBarParams.titleBarView);
        } else {
            if (i10 != 3) {
                return;
            }
            setStatusBarView(this.mActivity, statusBarHeight, this.mBarParams.statusBarView);
        }
    }

    private void fitsNotchScreen() {
        if (Build.VERSION.SDK_INT < 28 || this.mInitialized) {
            return;
        }
        WindowManager.LayoutParams attributes = this.mWindow.getAttributes();
        attributes.layoutInDisplayCutoutMode = 1;
        this.mWindow.setAttributes(attributes);
    }

    private void fitsWindows() {
        if (OSUtils.isEMUI3_x()) {
            fitsWindowsBelowLOLLIPOP();
        } else {
            fitsWindowsAboveLOLLIPOP();
        }
        fitsLayoutOverlap();
    }

    private void fitsWindowsAboveLOLLIPOP() {
        updateBarConfig();
        if (checkFitsSystemWindows(this.mDecorView.findViewById(android.R.id.content))) {
            setPadding(0, 0, 0, 0);
            return;
        }
        int statusBarHeight = (this.mBarParams.fits && this.mFitsStatusBarType == 4) ? this.mBarConfig.getStatusBarHeight() : 0;
        if (this.mBarParams.isSupportActionBar) {
            statusBarHeight = this.mBarConfig.getStatusBarHeight() + this.mActionBarHeight;
        }
        setPadding(0, statusBarHeight, 0, 0);
    }

    private void fitsWindowsBelowLOLLIPOP() {
        if (this.mBarParams.isSupportActionBar) {
            this.mIsActionBarBelowLOLLIPOP = true;
            this.mContentView.post(this);
        } else {
            this.mIsActionBarBelowLOLLIPOP = false;
            postFitsWindowsBelowLOLLIPOP();
        }
    }

    private void fitsWindowsEMUI() {
        View viewFindViewById = this.mDecorView.findViewById(Constants.IMMERSION_ID_NAVIGATION_BAR_VIEW);
        BarParams barParams = this.mBarParams;
        if (!barParams.navigationBarEnable || !barParams.navigationBarWithKitkatEnable) {
            EMUI3NavigationBarObserver.getInstance().removeOnNavigationBarListener(this);
            viewFindViewById.setVisibility(8);
        } else if (viewFindViewById != null) {
            EMUI3NavigationBarObserver.getInstance().addOnNavigationBarListener(this);
            EMUI3NavigationBarObserver.getInstance().register(this.mActivity.getApplication());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void fitsWindowsKITKAT() {
        /*
            r5 = this;
            android.view.ViewGroup r0 = r5.mDecorView
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            boolean r0 = checkFitsSystemWindows(r0)
            r1 = 0
            if (r0 == 0) goto L14
            r5.setPadding(r1, r1, r1, r1)
            return
        L14:
            com.gyf.immersionbar.BarParams r0 = r5.mBarParams
            boolean r0 = r0.fits
            if (r0 == 0) goto L26
            int r0 = r5.mFitsStatusBarType
            r2 = 4
            if (r0 != r2) goto L26
            com.gyf.immersionbar.BarConfig r0 = r5.mBarConfig
            int r0 = r0.getStatusBarHeight()
            goto L27
        L26:
            r0 = r1
        L27:
            com.gyf.immersionbar.BarParams r2 = r5.mBarParams
            boolean r2 = r2.isSupportActionBar
            if (r2 == 0) goto L36
            com.gyf.immersionbar.BarConfig r0 = r5.mBarConfig
            int r0 = r0.getStatusBarHeight()
            int r2 = r5.mActionBarHeight
            int r0 = r0 + r2
        L36:
            com.gyf.immersionbar.BarConfig r2 = r5.mBarConfig
            boolean r2 = r2.hasNavigationBar()
            if (r2 == 0) goto L88
            com.gyf.immersionbar.BarParams r2 = r5.mBarParams
            boolean r3 = r2.navigationBarEnable
            if (r3 == 0) goto L88
            boolean r3 = r2.navigationBarWithKitkatEnable
            if (r3 == 0) goto L88
            boolean r2 = r2.fullScreen
            if (r2 != 0) goto L65
            com.gyf.immersionbar.BarConfig r2 = r5.mBarConfig
            boolean r2 = r2.isNavigationAtBottom()
            if (r2 == 0) goto L5d
            com.gyf.immersionbar.BarConfig r2 = r5.mBarConfig
            int r2 = r2.getNavigationBarHeight()
            r3 = r2
            r2 = r1
            goto L67
        L5d:
            com.gyf.immersionbar.BarConfig r2 = r5.mBarConfig
            int r2 = r2.getNavigationBarWidth()
            r3 = r1
            goto L67
        L65:
            r2 = r1
            r3 = r2
        L67:
            com.gyf.immersionbar.BarParams r4 = r5.mBarParams
            boolean r4 = r4.hideNavigationBar
            if (r4 == 0) goto L79
            com.gyf.immersionbar.BarConfig r4 = r5.mBarConfig
            boolean r4 = r4.isNavigationAtBottom()
            if (r4 == 0) goto L77
            r3 = r1
            goto L8a
        L77:
            r2 = r1
            goto L8a
        L79:
            com.gyf.immersionbar.BarConfig r4 = r5.mBarConfig
            boolean r4 = r4.isNavigationAtBottom()
            if (r4 != 0) goto L8a
            com.gyf.immersionbar.BarConfig r2 = r5.mBarConfig
            int r2 = r2.getNavigationBarWidth()
            goto L8a
        L88:
            r2 = r1
            r3 = r2
        L8a:
            r5.setPadding(r1, r0, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gyf.immersionbar.ImmersionBar.fitsWindowsKITKAT():void");
    }

    @TargetApi(14)
    public static int getNavigationBarHeight(@NonNull Activity activity) {
        return new BarConfig(activity).getNavigationBarHeight();
    }

    @TargetApi(14)
    public static int getNavigationBarWidth(@NonNull Activity activity) {
        return new BarConfig(activity).getNavigationBarWidth();
    }

    public static int getNotchHeight(@NonNull Activity activity) {
        if (hasNotchScreen(activity)) {
            return NotchUtils.getNotchHeight(activity);
        }
        return 0;
    }

    private static RequestManagerRetriever getRetriever() {
        return RequestManagerRetriever.getInstance();
    }

    @TargetApi(14)
    public static int getStatusBarHeight(@NonNull Activity activity) {
        return new BarConfig(activity).getStatusBarHeight();
    }

    @TargetApi(14)
    public static boolean hasNavigationBar(@NonNull Activity activity) {
        return new BarConfig(activity).hasNavigationBar();
    }

    public static boolean hasNotchScreen(@NonNull Activity activity) {
        return NotchUtils.hasNotchScreen(activity);
    }

    private int hideBar(int i10) {
        int i11 = C72152.$SwitchMap$com$gyf$immersionbar$BarHide[this.mBarParams.barHide.ordinal()];
        if (i11 == 1) {
            i10 |= 518;
        } else if (i11 == 2) {
            i10 |= 1028;
        } else if (i11 == 3) {
            i10 |= 514;
        }
        return i10 | 4096;
    }

    public static void hideStatusBar(@NonNull Window window) {
        window.setFlags(1024, 1024);
    }

    @RequiresApi(api = 21)
    private int initBarAboveLOLLIPOP(int i10) {
        if (!this.mInitialized) {
            this.mBarParams.defaultNavigationBarColor = this.mWindow.getNavigationBarColor();
        }
        int i11 = i10 | 1024;
        BarParams barParams = this.mBarParams;
        if (barParams.fullScreen && barParams.navigationBarEnable) {
            i11 = i10 | 1536;
        }
        this.mWindow.clearFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        if (this.mBarConfig.hasNavigationBar()) {
            this.mWindow.clearFlags(134217728);
        }
        this.mWindow.addFlags(Integer.MIN_VALUE);
        BarParams barParams2 = this.mBarParams;
        if (barParams2.statusBarColorEnabled) {
            this.mWindow.setStatusBarColor(ColorUtils.blendARGB(barParams2.statusBarColor, barParams2.statusBarColorTransform, barParams2.statusBarAlpha));
        } else {
            this.mWindow.setStatusBarColor(ColorUtils.blendARGB(barParams2.statusBarColor, 0, barParams2.statusBarAlpha));
        }
        BarParams barParams3 = this.mBarParams;
        if (barParams3.navigationBarEnable) {
            this.mWindow.setNavigationBarColor(ColorUtils.blendARGB(barParams3.navigationBarColor, barParams3.navigationBarColorTransform, barParams3.navigationBarAlpha));
            return i11;
        }
        this.mWindow.setNavigationBarColor(barParams3.defaultNavigationBarColor);
        return i11;
    }

    private void initBarBelowLOLLIPOP() {
        this.mWindow.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        setupStatusBarView();
        if (this.mBarConfig.hasNavigationBar() || OSUtils.isEMUI3_x()) {
            BarParams barParams = this.mBarParams;
            if (barParams.navigationBarEnable && barParams.navigationBarWithKitkatEnable) {
                this.mWindow.addFlags(134217728);
            } else {
                this.mWindow.clearFlags(134217728);
            }
            if (this.mNavigationBarHeight == 0) {
                this.mNavigationBarHeight = this.mBarConfig.getNavigationBarHeight();
            }
            if (this.mNavigationBarWidth == 0) {
                this.mNavigationBarWidth = this.mBarConfig.getNavigationBarWidth();
            }
            setupNavBarView();
        }
    }

    private void initCommonParameter(Window window) {
        this.mWindow = window;
        this.mBarParams = new BarParams();
        ViewGroup viewGroup = (ViewGroup) this.mWindow.getDecorView();
        this.mDecorView = viewGroup;
        this.mContentView = (ViewGroup) viewGroup.findViewById(android.R.id.content);
    }

    private static boolean isEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }

    @TargetApi(14)
    public static boolean isNavigationAtBottom(@NonNull Activity activity) {
        return new BarConfig(activity).isNavigationAtBottom();
    }

    public static boolean isSupportNavigationIconDark() {
        return OSUtils.isMIUI6Later() || Build.VERSION.SDK_INT >= 26;
    }

    public static boolean isSupportStatusBarDarkFont() {
        if (OSUtils.isMIUI6Later()) {
            return true;
        }
        OSUtils.isFlymeOS4Later();
        return true;
    }

    private void postFitsWindowsBelowLOLLIPOP() {
        updateBarConfig();
        fitsWindowsKITKAT();
        if (this.mIsFragment || !OSUtils.isEMUI3_x()) {
            return;
        }
        fitsWindowsEMUI();
    }

    public static void setFitsSystemWindows(Activity activity, boolean z10) {
        if (activity == null) {
            return;
        }
        setFitsSystemWindows(((ViewGroup) activity.findViewById(android.R.id.content)).getChildAt(0), z10);
    }

    private int setNavigationIconDark(int i10) {
        return (Build.VERSION.SDK_INT < 26 || !this.mBarParams.navigationBarDarkIcon) ? i10 : i10 | 16;
    }

    private void setPadding(int i10, int i11, int i12, int i13) {
        ViewGroup viewGroup = this.mContentView;
        if (viewGroup != null) {
            viewGroup.setPadding(i10, i11, i12, i13);
        }
        this.mPaddingLeft = i10;
        this.mPaddingTop = i11;
        this.mPaddingRight = i12;
        this.mPaddingBottom = i13;
    }

    private void setSpecialBarDarkMode() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (OSUtils.isMIUI6Later()) {
            SpecialBarFontUtils.setMIUIBarDark(this.mWindow, "EXTRA_FLAG_STATUS_BAR_DARK_MODE", this.mBarParams.statusBarDarkFont);
            BarParams barParams = this.mBarParams;
            if (barParams.navigationBarEnable) {
                SpecialBarFontUtils.setMIUIBarDark(this.mWindow, "EXTRA_FLAG_NAVIGATION_BAR_DARK_MODE", barParams.navigationBarDarkIcon);
            }
        }
        if (OSUtils.isFlymeOS4Later()) {
            BarParams barParams2 = this.mBarParams;
            int i10 = barParams2.flymeOSStatusBarFontColor;
            if (i10 != 0) {
                SpecialBarFontUtils.setStatusBarDarkIcon(this.mActivity, i10);
            } else {
                SpecialBarFontUtils.setStatusBarDarkIcon(this.mActivity, barParams2.statusBarDarkFont);
            }
        }
    }

    private int setStatusBarDarkFont(int i10) {
        return this.mBarParams.statusBarDarkFont ? i10 | 8192 : i10;
    }

    public static void setStatusBarView(Activity activity, int i10, View... viewArr) {
        if (activity == null) {
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        for (View view : viewArr) {
            if (view != null) {
                Integer num = (Integer) view.getTag(C7217R.id.immersion_fits_layout_overlap);
                if (num == null) {
                    num = 0;
                }
                if (num.intValue() != i10) {
                    view.setTag(C7217R.id.immersion_fits_layout_overlap, Integer.valueOf(i10));
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = new ViewGroup.LayoutParams(-1, 0);
                    }
                    layoutParams.height = i10;
                    view.setLayoutParams(layoutParams);
                }
            }
        }
    }

    public static void setTitleBar(Activity activity, final int i10, View... viewArr) {
        if (activity == null) {
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        for (final View view : viewArr) {
            if (view != null) {
                final Integer num = (Integer) view.getTag(C7217R.id.immersion_fits_layout_overlap);
                if (num == null) {
                    num = 0;
                }
                if (num.intValue() != i10) {
                    view.setTag(C7217R.id.immersion_fits_layout_overlap, Integer.valueOf(i10));
                    final ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = new ViewGroup.LayoutParams(-1, -2);
                    }
                    int i11 = layoutParams.height;
                    if (i11 == -2 || i11 == -1) {
                        view.post(new Runnable() { // from class: com.gyf.immersionbar.ImmersionBar.1
                            @Override // java.lang.Runnable
                            public void run() {
                                layoutParams.height = (view.getHeight() + i10) - num.intValue();
                                View view2 = view;
                                view2.setPadding(view2.getPaddingLeft(), (view.getPaddingTop() + i10) - num.intValue(), view.getPaddingRight(), view.getPaddingBottom());
                                view.setLayoutParams(layoutParams);
                            }
                        });
                    } else {
                        layoutParams.height = i11 + (i10 - num.intValue());
                        view.setPadding(view.getPaddingLeft(), (view.getPaddingTop() + i10) - num.intValue(), view.getPaddingRight(), view.getPaddingBottom());
                        view.setLayoutParams(layoutParams);
                    }
                }
            }
        }
    }

    public static void setTitleBarMarginTop(Activity activity, int i10, View... viewArr) {
        if (activity == null) {
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        for (View view : viewArr) {
            if (view != null) {
                Integer num = (Integer) view.getTag(C7217R.id.immersion_fits_layout_overlap);
                if (num == null) {
                    num = 0;
                }
                if (num.intValue() != i10) {
                    view.setTag(C7217R.id.immersion_fits_layout_overlap, Integer.valueOf(i10));
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMargins(marginLayoutParams.leftMargin, (marginLayoutParams.topMargin + i10) - num.intValue(), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                    view.setLayoutParams(marginLayoutParams);
                }
            }
        }
    }

    private void setupNavBarView() {
        FrameLayout.LayoutParams layoutParams;
        ViewGroup viewGroup = this.mDecorView;
        int i10 = Constants.IMMERSION_ID_NAVIGATION_BAR_VIEW;
        View viewFindViewById = viewGroup.findViewById(i10);
        if (viewFindViewById == null) {
            viewFindViewById = new View(this.mActivity);
            viewFindViewById.setId(i10);
            this.mDecorView.addView(viewFindViewById);
        }
        if (this.mBarConfig.isNavigationAtBottom()) {
            layoutParams = new FrameLayout.LayoutParams(-1, this.mBarConfig.getNavigationBarHeight());
            layoutParams.gravity = 80;
        } else {
            layoutParams = new FrameLayout.LayoutParams(this.mBarConfig.getNavigationBarWidth(), -1);
            layoutParams.gravity = GravityCompat.END;
        }
        viewFindViewById.setLayoutParams(layoutParams);
        BarParams barParams = this.mBarParams;
        viewFindViewById.setBackgroundColor(ColorUtils.blendARGB(barParams.navigationBarColor, barParams.navigationBarColorTransform, barParams.navigationBarAlpha));
        BarParams barParams2 = this.mBarParams;
        if (barParams2.navigationBarEnable && barParams2.navigationBarWithKitkatEnable && !barParams2.hideNavigationBar) {
            viewFindViewById.setVisibility(0);
        } else {
            viewFindViewById.setVisibility(8);
        }
    }

    private void setupStatusBarView() {
        ViewGroup viewGroup = this.mDecorView;
        int i10 = Constants.IMMERSION_ID_STATUS_BAR_VIEW;
        View viewFindViewById = viewGroup.findViewById(i10);
        if (viewFindViewById == null) {
            viewFindViewById = new View(this.mActivity);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.mBarConfig.getStatusBarHeight());
            layoutParams.gravity = 48;
            viewFindViewById.setLayoutParams(layoutParams);
            viewFindViewById.setVisibility(0);
            viewFindViewById.setId(i10);
            this.mDecorView.addView(viewFindViewById);
        }
        BarParams barParams = this.mBarParams;
        if (barParams.statusBarColorEnabled) {
            viewFindViewById.setBackgroundColor(ColorUtils.blendARGB(barParams.statusBarColor, barParams.statusBarColorTransform, barParams.statusBarAlpha));
        } else {
            viewFindViewById.setBackgroundColor(ColorUtils.blendARGB(barParams.statusBarColor, 0, barParams.statusBarAlpha));
        }
    }

    public static void showStatusBar(@NonNull Window window) {
        window.clearFlags(1024);
    }

    private void transformView() {
        if (this.mBarParams.viewMap.size() != 0) {
            for (Map.Entry<View, Map<Integer, Integer>> entry : this.mBarParams.viewMap.entrySet()) {
                View key = entry.getKey();
                Map<Integer, Integer> value = entry.getValue();
                Integer numValueOf = Integer.valueOf(this.mBarParams.statusBarColor);
                Integer numValueOf2 = Integer.valueOf(this.mBarParams.statusBarColorTransform);
                for (Map.Entry<Integer, Integer> entry2 : value.entrySet()) {
                    Integer key2 = entry2.getKey();
                    numValueOf2 = entry2.getValue();
                    numValueOf = key2;
                }
                if (key != null) {
                    if (Math.abs(this.mBarParams.viewAlpha - 0.0f) == 0.0f) {
                        key.setBackgroundColor(ColorUtils.blendARGB(numValueOf.intValue(), numValueOf2.intValue(), this.mBarParams.statusBarAlpha));
                    } else {
                        key.setBackgroundColor(ColorUtils.blendARGB(numValueOf.intValue(), numValueOf2.intValue(), this.mBarParams.viewAlpha));
                    }
                }
            }
        }
    }

    private void updateBarConfig() {
        BarConfig barConfig = new BarConfig(this.mActivity);
        this.mBarConfig = barConfig;
        if (!this.mInitialized || this.mIsActionBarBelowLOLLIPOP) {
            this.mActionBarHeight = barConfig.getActionBarHeight();
        }
    }

    private void updateBarParams() {
        adjustDarkModeParams();
        updateBarConfig();
        ImmersionBar immersionBar = this.mParentBar;
        if (immersionBar != null) {
            if (this.mIsFragment) {
                immersionBar.mBarParams = this.mBarParams;
            }
            if (this.mIsDialog && immersionBar.mKeyboardTempEnable) {
                immersionBar.mBarParams.keyboardEnable = false;
            }
        }
    }

    public static ImmersionBar with(@NonNull Activity activity) {
        return getRetriever().get(activity);
    }

    public ImmersionBar addTag(String str) {
        if (isEmpty(str)) {
            throw new IllegalArgumentException("tag不能为空");
        }
        this.mTagMap.put(str, this.mBarParams.m33983clone());
        return this;
    }

    public ImmersionBar addViewSupportTransformColor(View view) {
        return addViewSupportTransformColorInt(view, this.mBarParams.statusBarColorTransform);
    }

    public ImmersionBar addViewSupportTransformColorInt(View view, @ColorInt int i10) {
        if (view == null) {
            throw new IllegalArgumentException("View参数不能为空");
        }
        HashMap map = new HashMap();
        map.put(Integer.valueOf(this.mBarParams.statusBarColor), Integer.valueOf(i10));
        this.mBarParams.viewMap.put(view, map);
        return this;
    }

    public ImmersionBar applySystemFits(boolean z10) {
        this.mBarParams.fitsLayoutOverlapEnable = !z10;
        setFitsSystemWindows(this.mActivity, z10);
        return this;
    }

    public ImmersionBar autoDarkModeEnable(boolean z10) {
        return autoDarkModeEnable(z10, 0.2f);
    }

    public ImmersionBar autoNavigationBarDarkModeEnable(boolean z10) {
        return autoNavigationBarDarkModeEnable(z10, 0.2f);
    }

    public ImmersionBar autoStatusBarDarkModeEnable(boolean z10) {
        return autoStatusBarDarkModeEnable(z10, 0.2f);
    }

    public ImmersionBar barAlpha(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10) {
        BarParams barParams = this.mBarParams;
        barParams.statusBarAlpha = f10;
        barParams.statusBarTempAlpha = f10;
        barParams.navigationBarAlpha = f10;
        barParams.navigationBarTempAlpha = f10;
        return this;
    }

    public ImmersionBar barColor(@ColorRes int i10) {
        return barColorInt(ContextCompat.getColor(this.mActivity, i10));
    }

    public ImmersionBar barColorInt(@ColorInt int i10) {
        BarParams barParams = this.mBarParams;
        barParams.statusBarColor = i10;
        barParams.navigationBarColor = i10;
        return this;
    }

    public ImmersionBar barColorTransform(@ColorRes int i10) {
        return barColorTransformInt(ContextCompat.getColor(this.mActivity, i10));
    }

    public ImmersionBar barColorTransformInt(@ColorInt int i10) {
        BarParams barParams = this.mBarParams;
        barParams.statusBarColorTransform = i10;
        barParams.navigationBarColorTransform = i10;
        return this;
    }

    public ImmersionBar barEnable(boolean z10) {
        this.mBarParams.barEnable = z10;
        return this;
    }

    public ImmersionBar fitsLayoutOverlapEnable(boolean z10) {
        this.mBarParams.fitsLayoutOverlapEnable = z10;
        return this;
    }

    public ImmersionBar fitsSystemWindows(boolean z10) {
        this.mBarParams.fits = z10;
        if (!z10) {
            this.mFitsStatusBarType = 0;
            return this;
        }
        if (this.mFitsStatusBarType == 0) {
            this.mFitsStatusBarType = 4;
        }
        return this;
    }

    public ImmersionBar fitsSystemWindowsInt(boolean z10, @ColorInt int i10) {
        return fitsSystemWindowsInt(z10, i10, ViewCompat.MEASURED_STATE_MASK, 0.0f);
    }

    public ImmersionBar flymeOSStatusBarFontColor(@ColorRes int i10) {
        this.mBarParams.flymeOSStatusBarFontColor = ContextCompat.getColor(this.mActivity, i10);
        BarParams barParams = this.mBarParams;
        barParams.flymeOSStatusBarFontTempColor = barParams.flymeOSStatusBarFontColor;
        return this;
    }

    public ImmersionBar flymeOSStatusBarFontColorInt(@ColorInt int i10) {
        BarParams barParams = this.mBarParams;
        barParams.flymeOSStatusBarFontColor = i10;
        barParams.flymeOSStatusBarFontTempColor = i10;
        return this;
    }

    public ImmersionBar fullScreen(boolean z10) {
        this.mBarParams.fullScreen = z10;
        return this;
    }

    public int getActionBarHeight() {
        return this.mActionBarHeight;
    }

    public Activity getActivity() {
        return this.mActivity;
    }

    public BarConfig getBarConfig() {
        if (this.mBarConfig == null) {
            this.mBarConfig = new BarConfig(this.mActivity);
        }
        return this.mBarConfig;
    }

    public BarParams getBarParams() {
        return this.mBarParams;
    }

    public Fragment getFragment() {
        return this.mFragment;
    }

    public int getPaddingBottom() {
        return this.mPaddingBottom;
    }

    public int getPaddingLeft() {
        return this.mPaddingLeft;
    }

    public int getPaddingRight() {
        return this.mPaddingRight;
    }

    public int getPaddingTop() {
        return this.mPaddingTop;
    }

    public androidx.fragment.app.Fragment getSupportFragment() {
        return this.mSupportFragment;
    }

    public ImmersionBar getTag(String str) {
        if (isEmpty(str)) {
            throw new IllegalArgumentException("tag不能为空");
        }
        BarParams barParams = this.mTagMap.get(str);
        if (barParams != null) {
            this.mBarParams = barParams.m33983clone();
        }
        return this;
    }

    public Window getWindow() {
        return this.mWindow;
    }

    public void init() {
        if (this.mBarParams.barEnable) {
            updateBarParams();
            setBar();
            fitsWindows();
            fitsKeyboard();
            transformView();
            this.mInitialized = true;
        }
    }

    public boolean initialized() {
        return this.mInitialized;
    }

    public boolean isDialogFragment() {
        return this.mIsDialogFragment;
    }

    public boolean isFragment() {
        return this.mIsFragment;
    }

    public ImmersionBar keyboardEnable(boolean z10) {
        return keyboardEnable(z10, this.mBarParams.keyboardMode);
    }

    public ImmersionBar keyboardMode(int i10) {
        this.mBarParams.keyboardMode = i10;
        return this;
    }

    public ImmersionBar navigationBarAlpha(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10) {
        BarParams barParams = this.mBarParams;
        barParams.navigationBarAlpha = f10;
        barParams.navigationBarTempAlpha = f10;
        return this;
    }

    public ImmersionBar navigationBarColor(@ColorRes int i10) {
        return navigationBarColorInt(ContextCompat.getColor(this.mActivity, i10));
    }

    public ImmersionBar navigationBarColorInt(@ColorInt int i10) {
        this.mBarParams.navigationBarColor = i10;
        return this;
    }

    public ImmersionBar navigationBarColorTransform(@ColorRes int i10) {
        return navigationBarColorTransformInt(ContextCompat.getColor(this.mActivity, i10));
    }

    public ImmersionBar navigationBarColorTransformInt(@ColorInt int i10) {
        this.mBarParams.navigationBarColorTransform = i10;
        return this;
    }

    public ImmersionBar navigationBarDarkIcon(boolean z10) {
        return navigationBarDarkIcon(z10, 0.2f);
    }

    public ImmersionBar navigationBarEnable(boolean z10) {
        this.mBarParams.navigationBarEnable = z10;
        return this;
    }

    public ImmersionBar navigationBarWithEMUI3Enable(boolean z10) {
        if (OSUtils.isEMUI3_x()) {
            BarParams barParams = this.mBarParams;
            barParams.navigationBarWithEMUI3Enable = z10;
            barParams.navigationBarWithKitkatEnable = z10;
        }
        return this;
    }

    public ImmersionBar navigationBarWithKitkatEnable(boolean z10) {
        this.mBarParams.navigationBarWithKitkatEnable = z10;
        return this;
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (!OSUtils.isEMUI3_x()) {
            fitsWindows();
        } else if (this.mInitialized && !this.mIsFragment && this.mBarParams.navigationBarWithKitkatEnable) {
            init();
        } else {
            fitsWindows();
        }
    }

    public void onDestroy() {
        ImmersionBar immersionBar;
        cancelListener();
        if (this.mIsDialog && (immersionBar = this.mParentBar) != null) {
            BarParams barParams = immersionBar.mBarParams;
            barParams.keyboardEnable = immersionBar.mKeyboardTempEnable;
            if (barParams.barHide != BarHide.FLAG_SHOW_BAR) {
                immersionBar.setBar();
            }
        }
        this.mInitialized = false;
    }

    @Override // com.gyf.immersionbar.OnNavigationBarListener
    public void onNavigationBarChange(boolean z10) {
        View viewFindViewById = this.mDecorView.findViewById(Constants.IMMERSION_ID_NAVIGATION_BAR_VIEW);
        if (viewFindViewById != null) {
            this.mBarConfig = new BarConfig(this.mActivity);
            int paddingBottom = this.mContentView.getPaddingBottom();
            int paddingRight = this.mContentView.getPaddingRight();
            if (z10) {
                viewFindViewById.setVisibility(0);
                if (!checkFitsSystemWindows(this.mDecorView.findViewById(android.R.id.content))) {
                    if (this.mNavigationBarHeight == 0) {
                        this.mNavigationBarHeight = this.mBarConfig.getNavigationBarHeight();
                    }
                    if (this.mNavigationBarWidth == 0) {
                        this.mNavigationBarWidth = this.mBarConfig.getNavigationBarWidth();
                    }
                    if (!this.mBarParams.hideNavigationBar) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewFindViewById.getLayoutParams();
                        if (this.mBarConfig.isNavigationAtBottom()) {
                            layoutParams.gravity = 80;
                            paddingBottom = this.mNavigationBarHeight;
                            layoutParams.height = paddingBottom;
                            if (this.mBarParams.fullScreen) {
                                paddingBottom = 0;
                            }
                            paddingRight = 0;
                        } else {
                            layoutParams.gravity = GravityCompat.END;
                            int i10 = this.mNavigationBarWidth;
                            layoutParams.width = i10;
                            if (this.mBarParams.fullScreen) {
                                i10 = 0;
                            }
                            paddingRight = i10;
                            paddingBottom = 0;
                        }
                        viewFindViewById.setLayoutParams(layoutParams);
                    }
                }
                setPadding(0, this.mContentView.getPaddingTop(), paddingRight, paddingBottom);
            }
            viewFindViewById.setVisibility(8);
            paddingBottom = 0;
            paddingRight = 0;
            setPadding(0, this.mContentView.getPaddingTop(), paddingRight, paddingBottom);
        }
    }

    public void onResume() {
        if (this.mIsFragment || !this.mInitialized || this.mBarParams == null) {
            return;
        }
        if (OSUtils.isEMUI3_x() && this.mBarParams.navigationBarWithEMUI3Enable) {
            init();
        } else if (this.mBarParams.barHide != BarHide.FLAG_SHOW_BAR) {
            setBar();
        }
    }

    public ImmersionBar removeSupportAllView() {
        if (this.mBarParams.viewMap.size() != 0) {
            this.mBarParams.viewMap.clear();
        }
        return this;
    }

    public ImmersionBar removeSupportView(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View参数不能为空");
        }
        Map<Integer, Integer> map = this.mBarParams.viewMap.get(view);
        if (map != null && map.size() != 0) {
            this.mBarParams.viewMap.remove(view);
        }
        return this;
    }

    public ImmersionBar reset() {
        this.mBarParams = new BarParams();
        this.mFitsStatusBarType = 0;
        return this;
    }

    @Override // java.lang.Runnable
    public void run() {
        postFitsWindowsBelowLOLLIPOP();
    }

    public void setBar() {
        int navigationIconDark = 256;
        if (OSUtils.isEMUI3_x()) {
            initBarBelowLOLLIPOP();
        } else {
            fitsNotchScreen();
            navigationIconDark = setNavigationIconDark(setStatusBarDarkFont(initBarAboveLOLLIPOP(256)));
        }
        this.mDecorView.setSystemUiVisibility(hideBar(navigationIconDark));
        setSpecialBarDarkMode();
        if (this.mBarParams.onNavigationBarListener != null) {
            NavigationBarObserver.getInstance().register(this.mActivity.getApplication());
        }
    }

    public ImmersionBar setOnBarListener(OnBarListener onBarListener) {
        if (onBarListener != null) {
            BarParams barParams = this.mBarParams;
            if (barParams.onBarListener == null) {
                barParams.onBarListener = onBarListener;
                return this;
            }
        } else {
            BarParams barParams2 = this.mBarParams;
            if (barParams2.onBarListener != null) {
                barParams2.onBarListener = null;
            }
        }
        return this;
    }

    public ImmersionBar setOnKeyboardListener(@Nullable OnKeyboardListener onKeyboardListener) {
        BarParams barParams = this.mBarParams;
        if (barParams.onKeyboardListener == null) {
            barParams.onKeyboardListener = onKeyboardListener;
        }
        return this;
    }

    public ImmersionBar setOnNavigationBarListener(OnNavigationBarListener onNavigationBarListener) {
        if (onNavigationBarListener != null) {
            BarParams barParams = this.mBarParams;
            if (barParams.onNavigationBarListener == null) {
                barParams.onNavigationBarListener = onNavigationBarListener;
                NavigationBarObserver.getInstance().addOnNavigationBarListener(this.mBarParams.onNavigationBarListener);
                return this;
            }
        } else if (this.mBarParams.onNavigationBarListener != null) {
            NavigationBarObserver.getInstance().removeOnNavigationBarListener(this.mBarParams.onNavigationBarListener);
            this.mBarParams.onNavigationBarListener = null;
        }
        return this;
    }

    public ImmersionBar statusBarAlpha(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10) {
        BarParams barParams = this.mBarParams;
        barParams.statusBarAlpha = f10;
        barParams.statusBarTempAlpha = f10;
        return this;
    }

    public ImmersionBar statusBarColor(@ColorRes int i10) {
        return statusBarColorInt(ContextCompat.getColor(this.mActivity, i10));
    }

    public ImmersionBar statusBarColorInt(@ColorInt int i10) {
        this.mBarParams.statusBarColor = i10;
        return this;
    }

    public ImmersionBar statusBarColorTransform(@ColorRes int i10) {
        return statusBarColorTransformInt(ContextCompat.getColor(this.mActivity, i10));
    }

    public ImmersionBar statusBarColorTransformEnable(boolean z10) {
        this.mBarParams.statusBarColorEnabled = z10;
        return this;
    }

    public ImmersionBar statusBarColorTransformInt(@ColorInt int i10) {
        this.mBarParams.statusBarColorTransform = i10;
        return this;
    }

    public ImmersionBar statusBarDarkFont(boolean z10) {
        return statusBarDarkFont(z10, 0.2f);
    }

    public ImmersionBar statusBarView(View view) {
        if (view != null) {
            this.mBarParams.statusBarView = view;
            if (this.mFitsStatusBarType == 0) {
                this.mFitsStatusBarType = 3;
            }
        }
        return this;
    }

    public ImmersionBar supportActionBar(boolean z10) {
        this.mBarParams.isSupportActionBar = z10;
        return this;
    }

    public ImmersionBar titleBar(View view) {
        return view == null ? this : titleBar(view, true);
    }

    public ImmersionBar titleBarMarginTop(@IdRes int i10) {
        androidx.fragment.app.Fragment fragment = this.mSupportFragment;
        if (fragment != null && fragment.getView() != null) {
            return titleBarMarginTop(this.mSupportFragment.getView().findViewById(i10));
        }
        Fragment fragment2 = this.mFragment;
        return (fragment2 == null || fragment2.getView() == null) ? titleBarMarginTop(this.mActivity.findViewById(i10)) : titleBarMarginTop(this.mFragment.getView().findViewById(i10));
    }

    public ImmersionBar transparentBar() {
        BarParams barParams = this.mBarParams;
        barParams.statusBarColor = 0;
        barParams.navigationBarColor = 0;
        barParams.fullScreen = true;
        return this;
    }

    public ImmersionBar transparentNavigationBar() {
        BarParams barParams = this.mBarParams;
        barParams.navigationBarColor = 0;
        barParams.fullScreen = true;
        return this;
    }

    public ImmersionBar transparentStatusBar() {
        this.mBarParams.statusBarColor = 0;
        return this;
    }

    public ImmersionBar viewAlpha(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10) {
        this.mBarParams.viewAlpha = f10;
        return this;
    }

    public static void destroy(@NonNull androidx.fragment.app.Fragment fragment, boolean z10) {
        getRetriever().destroy(fragment, z10);
    }

    @TargetApi(14)
    public static int getActionBarHeight(@NonNull Activity activity) {
        return new BarConfig(activity).getActionBarHeight();
    }

    public static boolean hasNotchScreen(@NonNull androidx.fragment.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            return false;
        }
        return hasNotchScreen(fragment.getActivity());
    }

    public static void setFitsSystemWindows(Activity activity) {
        setFitsSystemWindows(activity, true);
    }

    public static ImmersionBar with(@NonNull androidx.fragment.app.Fragment fragment) {
        return getRetriever().get(fragment, false);
    }

    public ImmersionBar addViewSupportTransformColor(View view, @ColorRes int i10) {
        return addViewSupportTransformColorInt(view, ContextCompat.getColor(this.mActivity, i10));
    }

    public ImmersionBar autoDarkModeEnable(boolean z10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10) {
        BarParams barParams = this.mBarParams;
        barParams.autoStatusBarDarkModeEnable = z10;
        barParams.autoStatusBarDarkModeAlpha = f10;
        barParams.autoNavigationBarDarkModeEnable = z10;
        barParams.autoNavigationBarDarkModeAlpha = f10;
        return this;
    }

    public ImmersionBar autoNavigationBarDarkModeEnable(boolean z10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10) {
        BarParams barParams = this.mBarParams;
        barParams.autoNavigationBarDarkModeEnable = z10;
        barParams.autoNavigationBarDarkModeAlpha = f10;
        return this;
    }

    public ImmersionBar autoStatusBarDarkModeEnable(boolean z10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10) {
        BarParams barParams = this.mBarParams;
        barParams.autoStatusBarDarkModeEnable = z10;
        barParams.autoStatusBarDarkModeAlpha = f10;
        return this;
    }

    public ImmersionBar barColor(@ColorRes int i10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10) {
        return barColorInt(ContextCompat.getColor(this.mActivity, i10), i10);
    }

    public ImmersionBar barColorTransform(String str) {
        return barColorTransformInt(Color.parseColor(str));
    }

    public ImmersionBar fitsSystemWindowsInt(boolean z10, @ColorInt int i10, @ColorInt int i11, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10) {
        BarParams barParams = this.mBarParams;
        barParams.fits = z10;
        barParams.contentColor = i10;
        barParams.contentColorTransform = i11;
        barParams.contentAlpha = f10;
        if (!z10) {
            this.mFitsStatusBarType = 0;
        } else if (this.mFitsStatusBarType == 0) {
            this.mFitsStatusBarType = 4;
        }
        this.mContentView.setBackgroundColor(ColorUtils.blendARGB(i10, i11, f10));
        return this;
    }

    public ImmersionBar hideBar(BarHide barHide) {
        this.mBarParams.barHide = barHide;
        if (OSUtils.isEMUI3_x()) {
            BarParams barParams = this.mBarParams;
            BarHide barHide2 = barParams.barHide;
            barParams.hideNavigationBar = barHide2 == BarHide.FLAG_HIDE_NAVIGATION_BAR || barHide2 == BarHide.FLAG_HIDE_BAR;
        }
        return this;
    }

    public ImmersionBar keyboardEnable(boolean z10, int i10) {
        BarParams barParams = this.mBarParams;
        barParams.keyboardEnable = z10;
        barParams.keyboardMode = i10;
        this.mKeyboardTempEnable = z10;
        return this;
    }

    public ImmersionBar navigationBarColor(@ColorRes int i10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10) {
        return navigationBarColorInt(ContextCompat.getColor(this.mActivity, i10), f10);
    }

    public ImmersionBar navigationBarColorInt(@ColorInt int i10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10) {
        BarParams barParams = this.mBarParams;
        barParams.navigationBarColor = i10;
        barParams.navigationBarAlpha = f10;
        return this;
    }

    public ImmersionBar navigationBarColorTransform(String str) {
        return navigationBarColorTransformInt(Color.parseColor(str));
    }

    public ImmersionBar navigationBarDarkIcon(boolean z10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10) {
        this.mBarParams.navigationBarDarkIcon = z10;
        if (z10 && !isSupportNavigationIconDark()) {
            this.mBarParams.navigationBarAlpha = f10;
            return this;
        }
        BarParams barParams = this.mBarParams;
        barParams.navigationBarAlpha = barParams.navigationBarTempAlpha;
        return this;
    }

    public ImmersionBar statusBarColor(@ColorRes int i10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10) {
        return statusBarColorInt(ContextCompat.getColor(this.mActivity, i10), f10);
    }

    public ImmersionBar statusBarColorInt(@ColorInt int i10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10) {
        BarParams barParams = this.mBarParams;
        barParams.statusBarColor = i10;
        barParams.statusBarAlpha = f10;
        return this;
    }

    public ImmersionBar statusBarColorTransform(String str) {
        return statusBarColorTransformInt(Color.parseColor(str));
    }

    public ImmersionBar statusBarDarkFont(boolean z10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10) {
        this.mBarParams.statusBarDarkFont = z10;
        if (z10 && !isSupportStatusBarDarkFont()) {
            this.mBarParams.statusBarAlpha = f10;
            return this;
        }
        BarParams barParams = this.mBarParams;
        barParams.flymeOSStatusBarFontColor = barParams.flymeOSStatusBarFontTempColor;
        barParams.statusBarAlpha = barParams.statusBarTempAlpha;
        return this;
    }

    public ImmersionBar titleBar(View view, boolean z10) {
        if (view == null) {
            return this;
        }
        if (this.mFitsStatusBarType == 0) {
            this.mFitsStatusBarType = 1;
        }
        BarParams barParams = this.mBarParams;
        barParams.titleBarView = view;
        barParams.statusBarColorEnabled = z10;
        return this;
    }

    public static void destroy(@NonNull Activity activity, @NonNull Dialog dialog) {
        getRetriever().destroy(activity, dialog);
    }

    @TargetApi(14)
    public static int getNavigationBarHeight(@NonNull androidx.fragment.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            return 0;
        }
        return getNavigationBarHeight(fragment.getActivity());
    }

    @TargetApi(14)
    public static int getNavigationBarWidth(@NonNull androidx.fragment.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            return 0;
        }
        return getNavigationBarWidth(fragment.getActivity());
    }

    public static int getNotchHeight(@NonNull androidx.fragment.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            return 0;
        }
        return getNotchHeight(fragment.getActivity());
    }

    @TargetApi(14)
    public static int getStatusBarHeight(@NonNull androidx.fragment.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            return 0;
        }
        return getStatusBarHeight(fragment.getActivity());
    }

    @TargetApi(14)
    public static boolean hasNavigationBar(@NonNull androidx.fragment.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            return false;
        }
        return hasNavigationBar(fragment.getActivity());
    }

    @TargetApi(14)
    public static boolean isNavigationAtBottom(@NonNull androidx.fragment.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            return false;
        }
        return isNavigationAtBottom(fragment.getActivity());
    }

    public static void setFitsSystemWindows(androidx.fragment.app.Fragment fragment, boolean z10) {
        if (fragment == null) {
            return;
        }
        setFitsSystemWindows(fragment.getActivity(), z10);
    }

    public static ImmersionBar with(@NonNull androidx.fragment.app.Fragment fragment, boolean z10) {
        return getRetriever().get(fragment, z10);
    }

    public ImmersionBar addViewSupportTransformColor(View view, @ColorRes int i10, @ColorRes int i11) {
        return addViewSupportTransformColorInt(view, ContextCompat.getColor(this.mActivity, i10), ContextCompat.getColor(this.mActivity, i11));
    }

    public ImmersionBar barColor(@ColorRes int i10, @ColorRes int i11, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10) {
        return barColorInt(ContextCompat.getColor(this.mActivity, i10), ContextCompat.getColor(this.mActivity, i11), f10);
    }

    public ImmersionBar barColorInt(@ColorInt int i10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10) {
        BarParams barParams = this.mBarParams;
        barParams.statusBarColor = i10;
        barParams.navigationBarColor = i10;
        barParams.statusBarAlpha = f10;
        barParams.navigationBarAlpha = f10;
        return this;
    }

    public ImmersionBar flymeOSStatusBarFontColor(String str) {
        this.mBarParams.flymeOSStatusBarFontColor = Color.parseColor(str);
        BarParams barParams = this.mBarParams;
        barParams.flymeOSStatusBarFontTempColor = barParams.flymeOSStatusBarFontColor;
        return this;
    }

    public ImmersionBar navigationBarColor(@ColorRes int i10, @ColorRes int i11, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10) {
        return navigationBarColorInt(ContextCompat.getColor(this.mActivity, i10), ContextCompat.getColor(this.mActivity, i11), f10);
    }

    public ImmersionBar statusBarColor(@ColorRes int i10, @ColorRes int i11, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10) {
        return statusBarColorInt(ContextCompat.getColor(this.mActivity, i10), ContextCompat.getColor(this.mActivity, i11), f10);
    }

    @TargetApi(14)
    public static int getActionBarHeight(@NonNull androidx.fragment.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            return 0;
        }
        return getActionBarHeight(fragment.getActivity());
    }

    public static boolean hasNotchScreen(@NonNull Fragment fragment) {
        if (fragment.getActivity() == null) {
            return false;
        }
        return hasNotchScreen(fragment.getActivity());
    }

    public static void setFitsSystemWindows(androidx.fragment.app.Fragment fragment) {
        if (fragment == null) {
            return;
        }
        setFitsSystemWindows(fragment.getActivity());
    }

    public static ImmersionBar with(@NonNull Fragment fragment) {
        return getRetriever().get(fragment, false);
    }

    public ImmersionBar navigationBarColorInt(@ColorInt int i10, @ColorInt int i11, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10) {
        BarParams barParams = this.mBarParams;
        barParams.navigationBarColor = i10;
        barParams.navigationBarColorTransform = i11;
        barParams.navigationBarAlpha = f10;
        return this;
    }

    public ImmersionBar statusBarColorInt(@ColorInt int i10, @ColorInt int i11, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10) {
        BarParams barParams = this.mBarParams;
        barParams.statusBarColor = i10;
        barParams.statusBarColorTransform = i11;
        barParams.statusBarAlpha = f10;
        return this;
    }

    public ImmersionBar statusBarView(@IdRes int i10) {
        return statusBarView(this.mActivity.findViewById(i10));
    }

    @TargetApi(14)
    public static int getNavigationBarHeight(@NonNull Fragment fragment) {
        if (fragment.getActivity() == null) {
            return 0;
        }
        return getNavigationBarHeight(fragment.getActivity());
    }

    @TargetApi(14)
    public static int getNavigationBarWidth(@NonNull Fragment fragment) {
        if (fragment.getActivity() == null) {
            return 0;
        }
        return getNavigationBarWidth(fragment.getActivity());
    }

    public static int getNotchHeight(@NonNull Fragment fragment) {
        if (fragment.getActivity() == null) {
            return 0;
        }
        return getNotchHeight(fragment.getActivity());
    }

    @TargetApi(14)
    public static int getStatusBarHeight(@NonNull Fragment fragment) {
        if (fragment.getActivity() == null) {
            return 0;
        }
        return getStatusBarHeight(fragment.getActivity());
    }

    @TargetApi(14)
    public static boolean hasNavigationBar(@NonNull Fragment fragment) {
        if (fragment.getActivity() == null) {
            return false;
        }
        return hasNavigationBar(fragment.getActivity());
    }

    @TargetApi(14)
    public static boolean isNavigationAtBottom(@NonNull Fragment fragment) {
        if (fragment.getActivity() == null) {
            return false;
        }
        return isNavigationAtBottom(fragment.getActivity());
    }

    public static void setFitsSystemWindows(Fragment fragment, boolean z10) {
        if (fragment == null) {
            return;
        }
        setFitsSystemWindows(fragment.getActivity(), z10);
    }

    public static ImmersionBar with(@NonNull Fragment fragment, boolean z10) {
        return getRetriever().get(fragment, z10);
    }

    public ImmersionBar addViewSupportTransformColorInt(View view, @ColorInt int i10, @ColorInt int i11) {
        if (view != null) {
            HashMap map = new HashMap();
            map.put(Integer.valueOf(i10), Integer.valueOf(i11));
            this.mBarParams.viewMap.put(view, map);
            return this;
        }
        throw new IllegalArgumentException("View参数不能为空");
    }

    public ImmersionBar fitsSystemWindows(boolean z10, @ColorRes int i10) {
        return fitsSystemWindowsInt(z10, ContextCompat.getColor(this.mActivity, i10));
    }

    public ImmersionBar statusBarView(@IdRes int i10, View view) {
        return statusBarView(view.findViewById(i10));
    }

    @TargetApi(14)
    public static int getActionBarHeight(@NonNull Fragment fragment) {
        if (fragment.getActivity() == null) {
            return 0;
        }
        return getActionBarHeight(fragment.getActivity());
    }

    public static boolean hasNotchScreen(@NonNull View view) {
        return NotchUtils.hasNotchScreen(view);
    }

    public static void setFitsSystemWindows(Fragment fragment) {
        if (fragment == null) {
            return;
        }
        setFitsSystemWindows(fragment.getActivity());
    }

    public static ImmersionBar with(@NonNull DialogFragment dialogFragment) {
        return getRetriever().get((androidx.fragment.app.Fragment) dialogFragment, false);
    }

    public ImmersionBar barColor(String str) {
        return barColorInt(Color.parseColor(str));
    }

    public ImmersionBar fitsSystemWindows(boolean z10, @ColorRes int i10, @ColorRes int i11, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10) {
        return fitsSystemWindowsInt(z10, ContextCompat.getColor(this.mActivity, i10), ContextCompat.getColor(this.mActivity, i11), f10);
    }

    public ImmersionBar navigationBarColor(String str) {
        return navigationBarColorInt(Color.parseColor(str));
    }

    public ImmersionBar statusBarColor(String str) {
        return statusBarColorInt(Color.parseColor(str));
    }

    public ImmersionBar titleBar(@IdRes int i10) {
        return titleBar(i10, true);
    }

    public ImmersionBar titleBarMarginTop(@IdRes int i10, View view) {
        return titleBarMarginTop(view.findViewById(i10));
    }

    private static void setFitsSystemWindows(View view, boolean z10) {
        if (view == null) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup instanceof DrawerLayout) {
                setFitsSystemWindows(viewGroup.getChildAt(0), z10);
                return;
            } else {
                viewGroup.setFitsSystemWindows(z10);
                viewGroup.setClipToPadding(true);
                return;
            }
        }
        view.setFitsSystemWindows(z10);
    }

    public static ImmersionBar with(@NonNull android.app.DialogFragment dialogFragment) {
        return getRetriever().get((Fragment) dialogFragment, false);
    }

    public ImmersionBar addViewSupportTransformColor(View view, String str) {
        return addViewSupportTransformColorInt(view, Color.parseColor(str));
    }

    public ImmersionBar barColor(String str, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10) {
        return barColorInt(Color.parseColor(str), f10);
    }

    public ImmersionBar barColorInt(@ColorInt int i10, @ColorInt int i11, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10) {
        BarParams barParams = this.mBarParams;
        barParams.statusBarColor = i10;
        barParams.navigationBarColor = i10;
        barParams.statusBarColorTransform = i11;
        barParams.navigationBarColorTransform = i11;
        barParams.statusBarAlpha = f10;
        barParams.navigationBarAlpha = f10;
        return this;
    }

    public ImmersionBar navigationBarColor(String str, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10) {
        return navigationBarColorInt(Color.parseColor(str), f10);
    }

    public ImmersionBar statusBarColor(String str, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10) {
        return statusBarColorInt(Color.parseColor(str), f10);
    }

    public ImmersionBar titleBar(@IdRes int i10, boolean z10) {
        androidx.fragment.app.Fragment fragment = this.mSupportFragment;
        if (fragment != null && fragment.getView() != null) {
            return titleBar(this.mSupportFragment.getView().findViewById(i10), z10);
        }
        Fragment fragment2 = this.mFragment;
        if (fragment2 != null && fragment2.getView() != null) {
            return titleBar(this.mFragment.getView().findViewById(i10), z10);
        }
        return titleBar(this.mActivity.findViewById(i10), z10);
    }

    public ImmersionBar titleBarMarginTop(View view) {
        if (view == null) {
            return this;
        }
        if (this.mFitsStatusBarType == 0) {
            this.mFitsStatusBarType = 2;
        }
        this.mBarParams.titleBarView = view;
        return this;
    }

    public static ImmersionBar with(@NonNull Activity activity, @NonNull Dialog dialog) {
        return getRetriever().get(activity, dialog);
    }

    public ImmersionBar addViewSupportTransformColor(View view, String str, String str2) {
        return addViewSupportTransformColorInt(view, Color.parseColor(str), Color.parseColor(str2));
    }

    public ImmersionBar barColor(String str, String str2, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10) {
        return barColorInt(Color.parseColor(str), Color.parseColor(str2), f10);
    }

    public ImmersionBar navigationBarColor(String str, String str2, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10) {
        return navigationBarColorInt(Color.parseColor(str), Color.parseColor(str2), f10);
    }

    public ImmersionBar statusBarColor(String str, String str2, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10) {
        return statusBarColorInt(Color.parseColor(str), Color.parseColor(str2), f10);
    }

    public static void setStatusBarView(Activity activity, View... viewArr) {
        setStatusBarView(activity, getStatusBarHeight(activity), viewArr);
    }

    public static void setStatusBarView(androidx.fragment.app.Fragment fragment, int i10, View... viewArr) {
        if (fragment == null) {
            return;
        }
        setStatusBarView(fragment.getActivity(), i10, viewArr);
    }

    public static void setStatusBarView(androidx.fragment.app.Fragment fragment, View... viewArr) {
        if (fragment == null) {
            return;
        }
        setStatusBarView(fragment.getActivity(), viewArr);
    }

    public ImmersionBar titleBar(@IdRes int i10, View view) {
        return titleBar(view.findViewById(i10), true);
    }

    public static void setStatusBarView(Fragment fragment, int i10, View... viewArr) {
        if (fragment == null) {
            return;
        }
        setStatusBarView(fragment.getActivity(), i10, viewArr);
    }

    public static void setTitleBarMarginTop(Activity activity, View... viewArr) {
        setTitleBarMarginTop(activity, getStatusBarHeight(activity), viewArr);
    }

    public ImmersionBar titleBar(@IdRes int i10, View view, boolean z10) {
        return titleBar(view.findViewById(i10), z10);
    }

    public static void setStatusBarView(Fragment fragment, View... viewArr) {
        if (fragment == null) {
            return;
        }
        setStatusBarView(fragment.getActivity(), viewArr);
    }

    public static void setTitleBarMarginTop(androidx.fragment.app.Fragment fragment, int i10, View... viewArr) {
        if (fragment == null) {
            return;
        }
        setTitleBarMarginTop(fragment.getActivity(), i10, viewArr);
    }

    public static void setTitleBar(Activity activity, View... viewArr) {
        setTitleBar(activity, getStatusBarHeight(activity), viewArr);
    }

    public static void setTitleBarMarginTop(androidx.fragment.app.Fragment fragment, View... viewArr) {
        if (fragment == null) {
            return;
        }
        setTitleBarMarginTop(fragment.getActivity(), viewArr);
    }

    public static void setTitleBar(androidx.fragment.app.Fragment fragment, int i10, View... viewArr) {
        if (fragment == null) {
            return;
        }
        setTitleBar(fragment.getActivity(), i10, viewArr);
    }

    public static void setTitleBarMarginTop(Fragment fragment, int i10, View... viewArr) {
        if (fragment == null) {
            return;
        }
        setTitleBarMarginTop(fragment.getActivity(), i10, viewArr);
    }

    public static void setTitleBar(androidx.fragment.app.Fragment fragment, View... viewArr) {
        if (fragment == null) {
            return;
        }
        setTitleBar(fragment.getActivity(), viewArr);
    }

    public static void setTitleBarMarginTop(Fragment fragment, View... viewArr) {
        if (fragment == null) {
            return;
        }
        setTitleBarMarginTop(fragment.getActivity(), viewArr);
    }

    public static void setTitleBar(Fragment fragment, int i10, View... viewArr) {
        if (fragment == null) {
            return;
        }
        setTitleBar(fragment.getActivity(), i10, viewArr);
    }

    public ImmersionBar(androidx.fragment.app.Fragment fragment) {
        this.mIsActivity = false;
        this.mIsFragment = false;
        this.mIsDialogFragment = false;
        this.mIsDialog = false;
        this.mNavigationBarHeight = 0;
        this.mNavigationBarWidth = 0;
        this.mActionBarHeight = 0;
        this.mFitsKeyboard = null;
        this.mTagMap = new HashMap();
        this.mFitsStatusBarType = 0;
        this.mInitialized = false;
        this.mIsActionBarBelowLOLLIPOP = false;
        this.mKeyboardTempEnable = false;
        this.mPaddingLeft = 0;
        this.mPaddingTop = 0;
        this.mPaddingRight = 0;
        this.mPaddingBottom = 0;
        this.mIsFragment = true;
        this.mActivity = fragment.getActivity();
        this.mSupportFragment = fragment;
        checkInitWithActivity();
        initCommonParameter(this.mActivity.getWindow());
    }

    public static void setTitleBar(Fragment fragment, View... viewArr) {
        if (fragment == null) {
            return;
        }
        setTitleBar(fragment.getActivity(), viewArr);
    }

    public ImmersionBar(Fragment fragment) {
        this.mIsActivity = false;
        this.mIsFragment = false;
        this.mIsDialogFragment = false;
        this.mIsDialog = false;
        this.mNavigationBarHeight = 0;
        this.mNavigationBarWidth = 0;
        this.mActionBarHeight = 0;
        this.mFitsKeyboard = null;
        this.mTagMap = new HashMap();
        this.mFitsStatusBarType = 0;
        this.mInitialized = false;
        this.mIsActionBarBelowLOLLIPOP = false;
        this.mKeyboardTempEnable = false;
        this.mPaddingLeft = 0;
        this.mPaddingTop = 0;
        this.mPaddingRight = 0;
        this.mPaddingBottom = 0;
        this.mIsFragment = true;
        this.mActivity = fragment.getActivity();
        this.mFragment = fragment;
        checkInitWithActivity();
        initCommonParameter(this.mActivity.getWindow());
    }

    public ImmersionBar(DialogFragment dialogFragment) {
        this.mIsActivity = false;
        this.mIsFragment = false;
        this.mIsDialogFragment = false;
        this.mIsDialog = false;
        this.mNavigationBarHeight = 0;
        this.mNavigationBarWidth = 0;
        this.mActionBarHeight = 0;
        this.mFitsKeyboard = null;
        this.mTagMap = new HashMap();
        this.mFitsStatusBarType = 0;
        this.mInitialized = false;
        this.mIsActionBarBelowLOLLIPOP = false;
        this.mKeyboardTempEnable = false;
        this.mPaddingLeft = 0;
        this.mPaddingTop = 0;
        this.mPaddingRight = 0;
        this.mPaddingBottom = 0;
        this.mIsDialog = true;
        this.mIsDialogFragment = true;
        this.mActivity = dialogFragment.getActivity();
        this.mSupportFragment = dialogFragment;
        this.mDialog = dialogFragment.getDialog();
        checkInitWithActivity();
        initCommonParameter(this.mDialog.getWindow());
    }

    public ImmersionBar(android.app.DialogFragment dialogFragment) {
        this.mIsActivity = false;
        this.mIsFragment = false;
        this.mIsDialogFragment = false;
        this.mIsDialog = false;
        this.mNavigationBarHeight = 0;
        this.mNavigationBarWidth = 0;
        this.mActionBarHeight = 0;
        this.mFitsKeyboard = null;
        this.mTagMap = new HashMap();
        this.mFitsStatusBarType = 0;
        this.mInitialized = false;
        this.mIsActionBarBelowLOLLIPOP = false;
        this.mKeyboardTempEnable = false;
        this.mPaddingLeft = 0;
        this.mPaddingTop = 0;
        this.mPaddingRight = 0;
        this.mPaddingBottom = 0;
        this.mIsDialog = true;
        this.mIsDialogFragment = true;
        this.mActivity = dialogFragment.getActivity();
        this.mFragment = dialogFragment;
        this.mDialog = dialogFragment.getDialog();
        checkInitWithActivity();
        initCommonParameter(this.mDialog.getWindow());
    }

    public ImmersionBar(Activity activity, Dialog dialog) {
        this.mIsActivity = false;
        this.mIsFragment = false;
        this.mIsDialogFragment = false;
        this.mIsDialog = false;
        this.mNavigationBarHeight = 0;
        this.mNavigationBarWidth = 0;
        this.mActionBarHeight = 0;
        this.mFitsKeyboard = null;
        this.mTagMap = new HashMap();
        this.mFitsStatusBarType = 0;
        this.mInitialized = false;
        this.mIsActionBarBelowLOLLIPOP = false;
        this.mKeyboardTempEnable = false;
        this.mPaddingLeft = 0;
        this.mPaddingTop = 0;
        this.mPaddingRight = 0;
        this.mPaddingBottom = 0;
        this.mIsDialog = true;
        this.mActivity = activity;
        this.mDialog = dialog;
        checkInitWithActivity();
        initCommonParameter(this.mDialog.getWindow());
    }
}
