package com.friday.lecture.floatwindow;

import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import androidx.compose.runtime.internal.StabilityInferred;
import com.friday.common.service.BaseLifecycleService;
import com.friday.lecture.R$dimen;
import com.friday.lecture.R$layout;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class StudentDemoService extends BaseLifecycleService {

    /* renamed from: d */
    public WindowManager f8684d;

    /* renamed from: e */
    public View f8685e;

    @Override // com.friday.common.service.BaseLifecycleService, androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        Display defaultDisplay;
        super.onCreate();
        Object systemService = getSystemService("window");
        AbstractC9979u.m20292e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f8684d = (WindowManager) systemService;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = this.f8684d;
        if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        if (Build.VERSION.SDK_INT >= 26) {
            layoutParams.type = 2038;
        } else {
            layoutParams.type = 2002;
        }
        layoutParams.gravity = 8388691;
        layoutParams.width = (int) getResources().getDimension(R$dimen.view_32);
        layoutParams.height = (int) getResources().getDimension(R$dimen.view_24);
        layoutParams.x = (int) getResources().getDimension(R$dimen.view_7);
        layoutParams.y = (int) getResources().getDimension(R$dimen.view_8);
        layoutParams.format = 1;
        layoutParams.flags = 40;
        View viewInflate = View.inflate(this, R$layout.window_student_demo_flag, null);
        this.f8685e = viewInflate;
        WindowManager windowManager2 = this.f8684d;
        if (windowManager2 != null) {
            windowManager2.addView(viewInflate, layoutParams);
        }
    }

    @Override // com.friday.common.service.BaseLifecycleService, androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        try {
            WindowManager windowManager = this.f8684d;
            if (windowManager != null) {
                windowManager.removeViewImmediate(this.f8685e);
            }
        } catch (Exception unused) {
        }
    }
}
