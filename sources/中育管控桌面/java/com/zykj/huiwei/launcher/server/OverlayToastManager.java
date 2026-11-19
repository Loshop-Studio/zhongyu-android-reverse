package com.zykj.huiwei.launcher.server;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.blankj.utilcode.util.AbstractC4646g;
import com.zykj.huiwei.launcher.server.OverlayToastManager;
import com.zykj.manage.R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class OverlayToastManager {

    /* renamed from: a */
    public final Context f6270a;

    /* renamed from: b */
    public final CoroutineScope f6271b;

    /* renamed from: c */
    public final Lazy f6272c;

    /* renamed from: d */
    public View f6273d;

    /* renamed from: e */
    public final int f6274e;

    /* renamed from: f */
    public final int f6275f;

    public OverlayToastManager(Context context, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f6270a = context;
        this.f6271b = scope;
        this.f6272c = LazyKt.lazy(new Function0() { // from class: x3.v
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OverlayToastManager.m5499l(this.f10456a);
            }
        });
        this.f6274e = Color.parseColor("#F15C58");
        this.f6275f = -1;
    }

    /* renamed from: i */
    public static /* synthetic */ void m5498i(OverlayToastManager overlayToastManager, String str, long j6, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            j6 = 2000;
        }
        overlayToastManager.m5505h(str, j6);
    }

    /* renamed from: l */
    public static final WindowManager m5499l(OverlayToastManager overlayToastManager) {
        Object systemService = overlayToastManager.f6270a.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        return (WindowManager) systemService;
    }

    /* renamed from: c */
    public final View m5500c(Context context, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(message, "message");
        int iM2185e = AbstractC4646g.m2185e(8.0f);
        int iM2185e2 = AbstractC4646g.m2185e(24.0f);
        Drawable drawableM5506j = m5506j(context, this.f6274e);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setBackground(drawableM5506j);
        drawableM5506j.setAlpha(200);
        Drawable drawable = ContextCompat.getDrawable(context, R.drawable.xtoast_ic_clear_white_24dp);
        if (drawable == null) {
            drawable = null;
        }
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(drawable);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iM2185e2, iM2185e2);
        layoutParams.setMarginEnd(iM2185e);
        layoutParams.setMarginStart(iM2185e);
        imageView.setLayoutParams(layoutParams);
        imageView.setVisibility(0);
        linearLayout.addView(imageView);
        TextView textView = new TextView(context);
        textView.setText(message);
        textView.setTextColor(this.f6275f);
        textView.setTextSize(2, 20.0f);
        linearLayout.addView(textView);
        return linearLayout;
    }

    /* renamed from: d */
    public final View m5501d(String str) {
        return m5500c(this.f6270a, str);
    }

    /* renamed from: e */
    public final void m5502e() {
        m5504g();
    }

    /* renamed from: f */
    public final WindowManager m5503f() {
        return (WindowManager) this.f6272c.getValue();
    }

    /* renamed from: g */
    public final void m5504g() {
        View view = this.f6273d;
        if (view != null) {
            if (view.isAttachedToWindow()) {
                try {
                    m5503f().removeView(view);
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f6273d = null;
        }
    }

    /* renamed from: h */
    public final void m5505h(String message, long j6) {
        Intrinsics.checkNotNullParameter(message, "message");
        m5504g();
        View viewM5501d = m5501d(message);
        this.f6273d = viewM5501d;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, Build.VERSION.SDK_INT >= 26 ? 2038 : 2003, 264, -3);
        layoutParams.gravity = 17;
        try {
            m5503f().addView(viewM5501d, layoutParams);
            BuildersKt__Builders_commonKt.launch$default(this.f6271b, null, null, new OverlayToastManager$show$1(j6, this, null), 3, null);
        } catch (Exception e6) {
            e6.printStackTrace();
            this.f6273d = null;
        }
    }

    /* renamed from: j */
    public final Drawable m5506j(Context context, int i6) {
        NinePatchDrawable ninePatchDrawable = (NinePatchDrawable) ContextCompat.getDrawable(context, R.drawable.xtoast_frame);
        if (ninePatchDrawable != null) {
            return m5507k(ninePatchDrawable, i6);
        }
        throw new IllegalStateException("未找到图片XToastFrame");
    }

    /* renamed from: k */
    public final Drawable m5507k(Drawable drawable, int i6) {
        Drawable drawableMutate = DrawableCompat.wrap(drawable).mutate();
        Intrinsics.checkNotNullExpressionValue(drawableMutate, "mutate(...)");
        DrawableCompat.setTint(drawableMutate, i6);
        return drawableMutate;
    }
}
