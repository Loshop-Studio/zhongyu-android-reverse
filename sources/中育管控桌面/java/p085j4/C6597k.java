package p085j4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import com.blankj.utilcode.util.AbstractC4642e;
import com.blankj.utilcode.util.AbstractC4646g;
import com.zykj.manage.R;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: j4.k */
/* loaded from: classes4.dex */
public final class C6597k {

    /* renamed from: m */
    public static final a f8599m = new a(null);

    /* renamed from: n */
    public static final int f8600n = 8;

    /* renamed from: a */
    public final Context f8601a;

    /* renamed from: b */
    public final WindowManager f8602b;

    /* renamed from: c */
    public final Function1 f8603c;

    /* renamed from: d */
    public final Function0 f8604d;

    /* renamed from: e */
    public FrameLayout f8605e;

    /* renamed from: f */
    public C6587a f8606f;

    /* renamed from: g */
    public int f8607g;

    /* renamed from: h */
    public int f8608h;

    /* renamed from: i */
    public LinearLayout f8609i;

    /* renamed from: j */
    public Button f8610j;

    /* renamed from: k */
    public Button f8611k;

    /* renamed from: l */
    public Bitmap f8612l;

    /* renamed from: j4.k$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public C6597k(Context context, WindowManager windowManager, Function1 onCroppedBitmapReady, Function0 onCropFlowCancelled) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(windowManager, "windowManager");
        Intrinsics.checkNotNullParameter(onCroppedBitmapReady, "onCroppedBitmapReady");
        Intrinsics.checkNotNullParameter(onCropFlowCancelled, "onCropFlowCancelled");
        this.f8601a = context;
        this.f8602b = windowManager;
        this.f8603c = onCroppedBitmapReady;
        this.f8604d = onCropFlowCancelled;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f8607g = displayMetrics.widthPixels;
        this.f8608h = displayMetrics.heightPixels;
    }

    /* renamed from: h */
    public static final void m7513h(C6597k c6597k, Button button, View view) {
        Bitmap croppedBitmap;
        C6587a c6587a = c6597k.f8606f;
        if (c6587a == null || (croppedBitmap = c6587a.getCroppedBitmap()) == null) {
            Toast.makeText(button.getContext(), "无法获取裁剪后的图片，请重试。", 0).show();
        } else {
            c6597k.f8603c.invoke(croppedBitmap);
        }
        c6597k.m7518f();
    }

    /* renamed from: i */
    public static final Unit m7514i(final C6597k c6597k, final Rect newCropRect) {
        Intrinsics.checkNotNullParameter(newCropRect, "newCropRect");
        Objects.toString(newCropRect);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: j4.j
            @Override // java.lang.Runnable
            public final void run() {
                C6597k.m7515j(this.f8597a, newCropRect);
            }
        });
        return Unit.INSTANCE;
    }

    /* renamed from: j */
    public static final void m7515j(C6597k c6597k, Rect rect) {
        c6597k.m7520m(rect);
    }

    /* renamed from: k */
    public static final void m7516k(C6597k c6597k) {
        Rect currentCropRect;
        C6587a c6587a = c6597k.f8606f;
        if (c6587a == null || (currentCropRect = c6587a.getCurrentCropRect()) == null) {
            Log.w("ScreenshotHelper", "初始裁剪框未就绪，等待布局完成后更新按钮位置。");
        } else {
            c6597k.m7520m(currentCropRect);
        }
    }

    /* renamed from: l */
    public static final void m7517l(C6597k c6597k, View view) {
        c6597k.f8604d.invoke();
        c6597k.m7518f();
    }

    /* renamed from: f */
    public final void m7518f() {
        FrameLayout frameLayout = this.f8605e;
        if (frameLayout != null && frameLayout.getParent() != null) {
            this.f8602b.removeView(frameLayout);
        }
        this.f8605e = null;
        this.f8606f = null;
        this.f8610j = null;
        this.f8611k = null;
        Bitmap bitmap = this.f8612l;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f8612l = null;
    }

    /* renamed from: g */
    public final void m7519g(Bitmap screenshotBitmap) {
        Intrinsics.checkNotNullParameter(screenshotBitmap, "screenshotBitmap");
        Bitmap bitmap = this.f8612l;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f8612l = screenshotBitmap;
        int iM2168b = AbstractC4642e.m2168b();
        AbstractC4642e.m2167a();
        Rect rect = new Rect(0, iM2168b, this.f8607g, this.f8608h);
        FrameLayout frameLayout = this.f8605e;
        if (frameLayout != null && frameLayout.getParent() != null) {
            this.f8602b.removeView(frameLayout);
        }
        FrameLayout frameLayout2 = new FrameLayout(this.f8601a);
        frameLayout2.setBackgroundColor(0);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, Build.VERSION.SDK_INT >= 26 ? 2038 : 2002, 1792, -3);
        layoutParams.gravity = 8388659;
        frameLayout2.setLayoutParams(layoutParams);
        this.f8605e = frameLayout2;
        C6587a c6587a = new C6587a(this.f8601a, null, 0, 6, null);
        Bitmap bitmap2 = this.f8612l;
        Intrinsics.checkNotNull(bitmap2);
        c6587a.m7486c(bitmap2);
        c6587a.setContentBoundaries(rect);
        c6587a.setCropRectColor(-15370497);
        this.f8606f = c6587a;
        FrameLayout frameLayout3 = this.f8605e;
        if (frameLayout3 != null) {
            frameLayout3.addView(c6587a, new FrameLayout.LayoutParams(-1, -1));
        }
        LinearLayout linearLayout = new LinearLayout(this.f8601a);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(ContextCompat.getDrawable(linearLayout.getContext(), R.drawable.crop_round_bg));
        linearLayout.setGravity(16);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f8609i = linearLayout;
        Button button = new Button(this.f8601a);
        button.setText("取消");
        button.setTextSize(14.0f);
        button.setTextColor(-1);
        button.setBackgroundColor(0);
        button.setLayoutParams(new LinearLayout.LayoutParams(button.getContext().getResources().getDimensionPixelSize(R.dimen.view_32), button.getContext().getResources().getDimensionPixelSize(R.dimen.view_20)));
        button.setOnClickListener(new View.OnClickListener() { // from class: j4.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6597k.m7517l(this.f8592a, view);
            }
        });
        this.f8611k = button;
        View view = new View(this.f8601a);
        view.setLayoutParams(new LinearLayout.LayoutParams(AbstractC4646g.m2185e(1.0f), AbstractC4646g.m2185e(24.0f)));
        view.setBackgroundColor(Color.parseColor("#33FFFFFF"));
        final Button button2 = new Button(this.f8601a);
        button2.setText("确定");
        button2.setTextSize(14.0f);
        button2.setTextColor(Color.parseColor("#FFFFFF"));
        button2.setBackgroundColor(0);
        button2.setLayoutParams(new LinearLayout.LayoutParams(button2.getContext().getResources().getDimensionPixelSize(R.dimen.view_32), button2.getContext().getResources().getDimensionPixelSize(R.dimen.view_20)));
        button2.setOnClickListener(new View.OnClickListener() { // from class: j4.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C6597k.m7513h(this.f8593a, button2, view2);
            }
        });
        this.f8610j = button2;
        LinearLayout linearLayout2 = this.f8609i;
        if (linearLayout2 != null) {
            linearLayout2.addView(this.f8611k);
        }
        LinearLayout linearLayout3 = this.f8609i;
        if (linearLayout3 != null) {
            linearLayout3.addView(view);
        }
        LinearLayout linearLayout4 = this.f8609i;
        if (linearLayout4 != null) {
            linearLayout4.addView(this.f8610j);
        }
        FrameLayout frameLayout4 = this.f8605e;
        if (frameLayout4 != null) {
            frameLayout4.addView(this.f8609i);
        }
        C6587a c6587a2 = this.f8606f;
        if (c6587a2 != null) {
            c6587a2.setOnCropRectChangeListener(new Function1() { // from class: j4.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C6597k.m7514i(this.f8595a, (Rect) obj);
                }
            });
        }
        FrameLayout frameLayout5 = this.f8605e;
        if (frameLayout5 != null) {
            frameLayout5.post(new Runnable() { // from class: j4.i
                @Override // java.lang.Runnable
                public final void run() {
                    C6597k.m7516k(this.f8596a);
                }
            });
        }
        try {
            WindowManager windowManager = this.f8602b;
            FrameLayout frameLayout6 = this.f8605e;
            Intrinsics.checkNotNull(frameLayout6);
            windowManager.addView(frameLayout6, frameLayout6.getLayoutParams());
        } catch (Exception e6) {
            Log.e("ScreenshotHelper", "添加截图裁剪浮窗失败: " + e6.getMessage(), e6);
            Toast.makeText(this.f8601a, "显示裁剪浮窗失败: " + e6.getMessage(), 1).show();
            this.f8604d.invoke();
            Bitmap bitmap3 = this.f8612l;
            if (bitmap3 != null) {
                bitmap3.recycle();
            }
        }
    }

    /* renamed from: m */
    public final void m7520m(Rect rect) {
        int iM2185e;
        int i6;
        int iM2185e2 = AbstractC4646g.m2185e(45.0f);
        int iM2185e3 = AbstractC4646g.m2185e(8.0f);
        int iM2185e4 = AbstractC4646g.m2185e(8.0f);
        LinearLayout linearLayout = this.f8609i;
        if (linearLayout != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.f8602b.getDefaultDisplay().getMetrics(displayMetrics);
            int i7 = displayMetrics.heightPixels;
            linearLayout.measure(0, 0);
            int measuredWidth = linearLayout.getMeasuredWidth();
            int measuredHeight = linearLayout.getMeasuredHeight();
            int i8 = rect.bottom;
            if (i8 + measuredHeight + iM2185e3 < i7) {
                iM2185e = (rect.right - measuredWidth) - iM2185e2;
                i6 = i8 + iM2185e3;
            } else {
                iM2185e = (rect.right - measuredWidth) - iM2185e2;
                i6 = (i8 - measuredHeight) - iM2185e4;
            }
            if (iM2185e < 0) {
                iM2185e = AbstractC4646g.m2185e(45.0f);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.leftMargin = iM2185e;
            layoutParams.topMargin = i6;
            linearLayout.setLayoutParams(layoutParams);
        }
    }
}
