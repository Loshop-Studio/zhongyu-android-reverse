package com.blankj.utilcode.util;

import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import p016b0.RunnableC3059a;

/* renamed from: com.blankj.utilcode.util.v */
/* loaded from: classes2.dex */
public final class C3402v extends AbstractC3400t {

    /* renamed from: g */
    public static int f2183g;

    /* renamed from: d */
    public final /* synthetic */ int f2184d;

    /* renamed from: e */
    public Object f2185e;

    /* renamed from: f */
    public Object f2186f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3402v(C3404x c3404x, int i) {
        super(c3404x);
        this.f2184d = i;
    }

    @Override // com.blankj.utilcode.util.AbstractC3400t
    /* renamed from: a */
    public final void mo2351a() {
        Window window;
        switch (this.f2184d) {
            case 0:
                C3401u c3401u = (C3401u) this.f2185e;
                if (c3401u != null) {
                    C3381b0 c3381b0 = C3381b0.f2122g;
                    c3381b0.getClass();
                    Activity activity = C3381b0.f2123h;
                    if (activity != null && c3401u != null) {
                        AbstractC3383c0.m2328g(new RunnableC3406z(c3381b0, activity, c3401u, 1));
                    }
                    this.f2185e = null;
                    for (Activity activity2 : AbstractC3383c0.m2324c()) {
                        if (activity2 != null && !activity2.isFinishing() && !activity2.isDestroyed() && (window = activity2.getWindow()) != null) {
                            ViewGroup viewGroup = (ViewGroup) window.getDecorView();
                            StringBuilder sb = new StringBuilder("TAG_TOAST");
                            sb.append(f2183g - 1);
                            View viewFindViewWithTag = viewGroup.findViewWithTag(sb.toString());
                            if (viewFindViewWithTag != null) {
                                try {
                                    viewGroup.removeView(viewFindViewWithTag);
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }
                }
                AbstractC3400t abstractC3400t = (AbstractC3400t) this.f2186f;
                if (abstractC3400t != null) {
                    abstractC3400t.mo2351a();
                    this.f2186f = null;
                }
                super.mo2351a();
                break;
            default:
                try {
                    WindowManager windowManager = (WindowManager) this.f2185e;
                    if (windowManager != null) {
                        windowManager.removeViewImmediate(this.f2180c);
                        this.f2185e = null;
                    }
                } catch (Exception unused2) {
                }
                super.mo2351a();
                break;
        }
    }

    @Override // com.blankj.utilcode.util.AbstractC3400t
    /* renamed from: d */
    public final void mo2354d() {
        switch (this.f2184d) {
            case 0:
                if (this.f2178a != null) {
                    if (C3381b0.f2122g.f2129f) {
                        C3403w c3403w = new C3403w(this.f2179b);
                        c3403w.f2178a = this.f2178a;
                        c3403w.mo2354d();
                        this.f2186f = c3403w;
                        break;
                    } else {
                        boolean z8 = false;
                        for (Activity activity : AbstractC3383c0.m2324c()) {
                            if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
                                if (z8) {
                                    m2355e(activity, f2183g, true);
                                } else {
                                    WindowManager windowManager = activity.getWindowManager();
                                    C3402v c3402v = new C3402v(this.f2179b, 1);
                                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                                    c3402v.f2186f = layoutParams;
                                    c3402v.f2185e = windowManager;
                                    layoutParams.type = 99;
                                    c3402v.f2180c = m2352b(-1);
                                    c3402v.f2178a = this.f2178a;
                                    c3402v.mo2354d();
                                    this.f2186f = c3402v;
                                    z8 = true;
                                }
                            }
                        }
                        if (z8) {
                            C3401u c3401u = new C3401u(this, f2183g);
                            this.f2185e = c3401u;
                            C3381b0 c3381b0 = C3381b0.f2122g;
                            c3381b0.getClass();
                            Activity activity2 = C3381b0.f2123h;
                            if (activity2 != null) {
                                AbstractC3383c0.m2328g(new RunnableC3406z(c3381b0, activity2, c3401u, 0));
                            }
                            AbstractC3396p.f2173a.postDelayed(new RunnableC3059a(this, 5), 2000L);
                            f2183g++;
                            break;
                        } else {
                            C3403w c3403w2 = new C3403w(this.f2179b);
                            c3403w2.f2178a = this.f2178a;
                            c3403w2.mo2354d();
                            this.f2186f = c3403w2;
                            break;
                        }
                    }
                }
                break;
            default:
                WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) this.f2186f;
                if (this.f2178a != null) {
                    layoutParams2.height = -2;
                    layoutParams2.width = -2;
                    layoutParams2.format = -3;
                    layoutParams2.windowAnimations = R.style.Animation.Toast;
                    layoutParams2.setTitle("ToastWithoutNotification");
                    layoutParams2.flags = 152;
                    layoutParams2.packageName = AbstractC3382c.m2303d().getPackageName();
                    int gravity = this.f2178a.getGravity();
                    layoutParams2.gravity = gravity;
                    if ((gravity & 7) == 7) {
                        layoutParams2.horizontalWeight = 1.0f;
                    }
                    if ((gravity & 112) == 112) {
                        layoutParams2.verticalWeight = 1.0f;
                    }
                    layoutParams2.x = this.f2178a.getXOffset();
                    layoutParams2.y = this.f2178a.getYOffset();
                    layoutParams2.horizontalMargin = this.f2178a.getHorizontalMargin();
                    layoutParams2.verticalMargin = this.f2178a.getVerticalMargin();
                    try {
                        WindowManager windowManager2 = (WindowManager) this.f2185e;
                        if (windowManager2 != null) {
                            windowManager2.addView(this.f2180c, layoutParams2);
                        }
                    } catch (Exception unused) {
                    }
                    AbstractC3396p.f2173a.postDelayed(new RunnableC3059a(this, 6), 2000L);
                    break;
                }
                break;
        }
    }

    /* renamed from: e */
    public void m2355e(Activity activity, int i, boolean z8) {
        Window window = activity.getWindow();
        if (window != null) {
            ViewGroup viewGroup = (ViewGroup) window.getDecorView();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = this.f2178a.getGravity();
            int yOffset = this.f2178a.getYOffset();
            Resources system = Resources.getSystem();
            int identifier = system.getIdentifier("navigation_bar_height", "dimen", "android");
            layoutParams.bottomMargin = yOffset + (identifier != 0 ? system.getDimensionPixelSize(identifier) : 0);
            int yOffset2 = this.f2178a.getYOffset();
            Resources system2 = Resources.getSystem();
            layoutParams.topMargin = system2.getDimensionPixelSize(system2.getIdentifier("status_bar_height", "dimen", "android")) + yOffset2;
            layoutParams.leftMargin = this.f2178a.getXOffset();
            ImageView imageViewM2352b = m2352b(i);
            if (z8) {
                imageViewM2352b.setAlpha(0.0f);
                imageViewM2352b.animate().alpha(1.0f).setDuration(200L).start();
            }
            viewGroup.addView(imageViewM2352b, layoutParams);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3402v(int i) {
        super(C3404x.f2187b);
        this.f2184d = 1;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f2186f = layoutParams;
        this.f2185e = (WindowManager) AbstractC3382c.m2303d().getSystemService("window");
        layoutParams.type = i;
    }
}
