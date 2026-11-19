package com.zykj.huiwei.launcher.server;

// RE note 本类字节码直接引用的读写或显示接口包括位图。

import android.animation.ValueAnimator;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import com.blankj.utilcode.util.AbstractC4640d;
import com.blankj.utilcode.util.AbstractC4668s;
import com.blankj.utilcode.util.AbstractC4672w;
import com.zykj.huiwei.launcher.databinding.FloatingToolbarBinding;
import com.zykj.huiwei.launcher.server.MyFloatingToolService;
import com.zykj.manage.R;
import java.io.File;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import p050e4.C6274f;
import p078i4.AbstractC6546p;
import p085j4.C6597k;
import p184x3.AbstractC7834b;
import p184x3.C7855w;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 Z2\u00020\u0001:\u00030(,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010\u0003J\u000f\u0010!\u001a\u00020\u0006H\u0003¢\u0006\u0004\b!\u0010\u0003J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"H\u0003¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0006H\u0002¢\u0006\u0004\b&\u0010\u0003R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u0010:\u001a\u000607R\u00020\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010B\u001a\u00060?R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010J\u001a\u00020G8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010V\u001a\u00020S8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010UR$\u0010Y\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010X¨\u0006["}, m7880d2 = {"Lcom/zykj/huiwei/launcher/server/MyFloatingToolService;", "Landroid/app/Service;", "<init>", "()V", "Lkotlin/Function1;", "Landroid/net/Uri;", "", "callback", "J", "(Lkotlin/jvm/functions/Function1;)V", "onCreate", "onDestroy", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "Landroid/content/Context;", "context", "", "s", "(Landroid/content/Context;)Ljava/lang/String;", "saveDir", "I", "(Landroid/content/Context;Ljava/lang/String;)V", "imagePath", "u", "(Ljava/lang/String;)V", "error", "t", "B", "v", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "K", "", "isLeft", "O", "(Z)V", "N", "Landroid/view/WindowManager;", "a", "Landroid/view/WindowManager;", "windowManager", "Landroid/view/View;", "b", "Landroid/view/View;", "floatingView", "Landroid/view/WindowManager$LayoutParams;", "c", "Landroid/view/WindowManager$LayoutParams;", "layoutParams", "Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;", "d", "Lcom/zykj/huiwei/launcher/databinding/FloatingToolbarBinding;", "binding", "Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;", "e", "Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$b;", "dragOrClickListener", "Lx3/w;", "f", "Lx3/w;", "screenshotFinishReceiver", "Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$c;", "g", "Lcom/zykj/huiwei/launcher/server/MyFloatingToolService$c;", "binder", "Lj4/k;", "h", "Lj4/k;", "screenshotHelper", "Le4/f;", "i", "Le4/f;", "croppedBitmapDialog", "Lkotlinx/coroutines/CompletableJob;", "j", "Lkotlinx/coroutines/CompletableJob;", "job", "Lkotlinx/coroutines/CoroutineScope;", "k", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lcom/zykj/huiwei/launcher/server/OverlayToastManager;", "l", "Lcom/zykj/huiwei/launcher/server/OverlayToastManager;", "overlayToastManager", "m", "Lkotlin/jvm/functions/Function1;", "onImageSavedCallback", "n", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nMyFloatingToolService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyFloatingToolService.kt\ncom/zykj/huiwei/launcher/server/MyFloatingToolService\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,493:1\n257#2,2:494\n257#2,2:496\n257#2,2:498\n257#2,2:500\n257#2,2:502\n*S KotlinDebug\n*F\n+ 1 MyFloatingToolService.kt\ncom/zykj/huiwei/launcher/server/MyFloatingToolService\n*L\n423#1:494,2\n430#1:496,2\n143#1:498,2\n149#1:500,2\n202#1:502,2\n*E\n"})
/* loaded from: classes4.dex */
public final class MyFloatingToolService extends Service {

    /* renamed from: o */
    public static final int f6215o = 8;

    /* renamed from: a, reason: from kotlin metadata */
    public WindowManager windowManager;

    /* renamed from: b, reason: from kotlin metadata */
    public View floatingView;

    /* renamed from: c, reason: from kotlin metadata */
    public WindowManager.LayoutParams layoutParams;

    /* renamed from: d, reason: from kotlin metadata */
    public FloatingToolbarBinding binding;

    /* renamed from: e, reason: from kotlin metadata */
    public ViewOnTouchListenerC6081b dragOrClickListener;

    /* renamed from: f, reason: from kotlin metadata */
    public C7855w screenshotFinishReceiver;

    /* renamed from: g, reason: from kotlin metadata */
    public final BinderC6082c binder = new BinderC6082c();

    /* renamed from: h, reason: from kotlin metadata */
    public C6597k screenshotHelper;

    /* renamed from: i, reason: from kotlin metadata */
    public C6274f croppedBitmapDialog;

    /* renamed from: j, reason: from kotlin metadata */
    public final CompletableJob job;

    /* renamed from: k, reason: from kotlin metadata */
    public final CoroutineScope scope;

    /* renamed from: l, reason: from kotlin metadata */
    public OverlayToastManager overlayToastManager;

    /* renamed from: m, reason: from kotlin metadata */
    public Function1 onImageSavedCallback;

    /* renamed from: com.zykj.huiwei.launcher.server.MyFloatingToolService$b */
    public final class ViewOnTouchListenerC6081b implements View.OnTouchListener {

        /* renamed from: a */
        public final long f6229a;

        /* renamed from: c */
        public final int f6231c;

        /* renamed from: d */
        public boolean f6232d;

        /* renamed from: e */
        public float f6233e;

        /* renamed from: f */
        public float f6234f;

        /* renamed from: g */
        public int f6235g;

        /* renamed from: h */
        public int f6236h;

        /* renamed from: j */
        public final Runnable f6238j;

        /* renamed from: b */
        public final Handler f6230b = new Handler(Looper.getMainLooper());

        /* renamed from: i */
        public boolean f6237i = true;

        public ViewOnTouchListenerC6081b(long j6) {
            this.f6229a = j6;
            this.f6231c = ViewConfiguration.get(MyFloatingToolService.this).getScaledTouchSlop();
            this.f6238j = new Runnable() { // from class: x3.q
                @Override // java.lang.Runnable
                public final void run() {
                    MyFloatingToolService.ViewOnTouchListenerC6081b.m5480b(this.f10454a, myFloatingToolService);
                }
            };
        }

        /* renamed from: b */
        public static final void m5480b(ViewOnTouchListenerC6081b viewOnTouchListenerC6081b, MyFloatingToolService myFloatingToolService) {
            viewOnTouchListenerC6081b.f6232d = true;
            WindowManager.LayoutParams layoutParams = myFloatingToolService.layoutParams;
            WindowManager.LayoutParams layoutParams2 = null;
            if (layoutParams == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutParams");
                layoutParams = null;
            }
            viewOnTouchListenerC6081b.f6235g = layoutParams.x;
            WindowManager.LayoutParams layoutParams3 = myFloatingToolService.layoutParams;
            if (layoutParams3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutParams");
            } else {
                layoutParams2 = layoutParams3;
            }
            viewOnTouchListenerC6081b.f6236h = layoutParams2.y;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View v6, MotionEvent event) {
            Intrinsics.checkNotNullParameter(v6, "v");
            Intrinsics.checkNotNullParameter(event, "event");
            int actionMasked = event.getActionMasked();
            WindowManager.LayoutParams layoutParams = null;
            if (actionMasked == 0) {
                this.f6233e = event.getRawX();
                this.f6234f = event.getRawY();
                this.f6232d = false;
                WindowManager.LayoutParams layoutParams2 = MyFloatingToolService.this.layoutParams;
                if (layoutParams2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutParams");
                } else {
                    layoutParams = layoutParams2;
                }
                this.f6237i = (layoutParams.gravity & 5) == 5;
                this.f6230b.postDelayed(this.f6238j, this.f6229a);
                return true;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (!this.f6232d) {
                        if (Math.abs(event.getRawX() - this.f6233e) > this.f6231c || Math.abs(event.getRawY() - this.f6234f) > this.f6231c) {
                            this.f6230b.removeCallbacks(this.f6238j);
                        }
                        return false;
                    }
                    int rawX = (int) (event.getRawX() - this.f6233e);
                    int rawY = (int) (event.getRawY() - this.f6234f);
                    WindowManager.LayoutParams layoutParams3 = MyFloatingToolService.this.layoutParams;
                    if (layoutParams3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("layoutParams");
                        layoutParams3 = null;
                    }
                    layoutParams3.x = this.f6237i ? RangesKt.coerceAtLeast(this.f6235g - rawX, 0) : RangesKt.coerceAtLeast(this.f6235g + rawX, 0);
                    WindowManager.LayoutParams layoutParams4 = MyFloatingToolService.this.layoutParams;
                    if (layoutParams4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("layoutParams");
                        layoutParams4 = null;
                    }
                    layoutParams4.y = this.f6236h + rawY;
                    WindowManager windowManager = MyFloatingToolService.this.windowManager;
                    if (windowManager == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("windowManager");
                        windowManager = null;
                    }
                    View view = MyFloatingToolService.this.floatingView;
                    if (view == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("floatingView");
                        view = null;
                    }
                    WindowManager.LayoutParams layoutParams5 = MyFloatingToolService.this.layoutParams;
                    if (layoutParams5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("layoutParams");
                    } else {
                        layoutParams = layoutParams5;
                    }
                    windowManager.updateViewLayout(view, layoutParams);
                    return true;
                }
                if (actionMasked != 3) {
                    return false;
                }
            }
            this.f6230b.removeCallbacks(this.f6238j);
            if (this.f6232d) {
                MyFloatingToolService.this.m5472K();
                return true;
            }
            v6.performClick();
            return false;
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.server.MyFloatingToolService$c */
    public final class BinderC6082c extends Binder {
        public BinderC6082c() {
        }

        /* renamed from: a */
        public final MyFloatingToolService m5481a() {
            return MyFloatingToolService.this;
        }
    }

    public MyFloatingToolService() {
        CompletableJob completableJobSupervisorJob$default = SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null);
        this.job = completableJobSupervisorJob$default;
        this.scope = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().plus(completableJobSupervisorJob$default));
    }

    /* renamed from: C */
    public static final Unit m5437C(MyFloatingToolService myFloatingToolService, Bitmap croppedBitmap) {
        Intrinsics.checkNotNullParameter(croppedBitmap, "croppedBitmap");
        AbstractC4668s.m2377i("MyFloatingToolService,收到裁剪完成的 Bitmap！");
        FloatingToolbarBinding floatingToolbarBinding = myFloatingToolService.binding;
        C6274f c6274f = null;
        if (floatingToolbarBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            floatingToolbarBinding = null;
        }
        LinearLayout imgLinear = floatingToolbarBinding.imgLinear;
        Intrinsics.checkNotNullExpressionValue(imgLinear, "imgLinear");
        imgLinear.setVisibility(0);
        C6274f c6274f2 = myFloatingToolService.croppedBitmapDialog;
        if (c6274f2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("croppedBitmapDialog");
        } else {
            c6274f = c6274f2;
        }
        c6274f.m6404d(croppedBitmap);
        return Unit.INSTANCE;
    }

    /* renamed from: D */
    public static final Unit m5438D(MyFloatingToolService myFloatingToolService) {
        AbstractC4668s.m2377i("MyFloatingToolService,截图裁剪流程已取消 Bitmap！");
        FloatingToolbarBinding floatingToolbarBinding = myFloatingToolService.binding;
        if (floatingToolbarBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            floatingToolbarBinding = null;
        }
        LinearLayout imgLinear = floatingToolbarBinding.imgLinear;
        Intrinsics.checkNotNullExpressionValue(imgLinear, "imgLinear");
        imgLinear.setVisibility(0);
        return Unit.INSTANCE;
    }

    /* renamed from: E */
    public static final Unit m5439E(Bitmap it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AbstractC4668s.m2377i("croppedBitmapDialog,开始编辑图片逻辑");
        return Unit.INSTANCE;
    }

    /* renamed from: F */
    public static final Unit m5440F(MyFloatingToolService myFloatingToolService, Bitmap it) {
        Function1 function1;
        Intrinsics.checkNotNullParameter(it, "it");
        AbstractC4668s.m2377i("croppedBitmapDialog,开始保存图片逻辑");
        Uri uriM7405a = AbstractC6546p.m7405a(myFloatingToolService, it);
        if (uriM7405a != null && (function1 = myFloatingToolService.onImageSavedCallback) != null) {
            function1.invoke(uriM7405a);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: G */
    public static final Unit m5441G(MyFloatingToolService myFloatingToolService, String imagePath) {
        Intrinsics.checkNotNullParameter(imagePath, "imagePath");
        myFloatingToolService.m5477u(imagePath);
        return Unit.INSTANCE;
    }

    /* renamed from: H */
    public static final Unit m5442H(MyFloatingToolService myFloatingToolService, String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        myFloatingToolService.m5476t(error);
        return Unit.INSTANCE;
    }

    /* renamed from: L */
    public static final void m5443L(MyFloatingToolService myFloatingToolService, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WindowManager.LayoutParams layoutParams = myFloatingToolService.layoutParams;
        WindowManager.LayoutParams layoutParams2 = null;
        if (layoutParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutParams");
            layoutParams = null;
        }
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.x = ((Integer) animatedValue).intValue();
        WindowManager windowManager = myFloatingToolService.windowManager;
        if (windowManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("windowManager");
            windowManager = null;
        }
        View view = myFloatingToolService.floatingView;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("floatingView");
            view = null;
        }
        WindowManager.LayoutParams layoutParams3 = myFloatingToolService.layoutParams;
        if (layoutParams3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutParams");
        } else {
            layoutParams2 = layoutParams3;
        }
        windowManager.updateViewLayout(view, layoutParams2);
    }

    /* renamed from: M */
    public static final void m5444M(MyFloatingToolService myFloatingToolService, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WindowManager.LayoutParams layoutParams = myFloatingToolService.layoutParams;
        WindowManager.LayoutParams layoutParams2 = null;
        if (layoutParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutParams");
            layoutParams = null;
        }
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.x = ((Integer) animatedValue).intValue();
        WindowManager windowManager = myFloatingToolService.windowManager;
        if (windowManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("windowManager");
            windowManager = null;
        }
        View view = myFloatingToolService.floatingView;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("floatingView");
            view = null;
        }
        WindowManager.LayoutParams layoutParams3 = myFloatingToolService.layoutParams;
        if (layoutParams3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutParams");
        } else {
            layoutParams2 = layoutParams3;
        }
        windowManager.updateViewLayout(view, layoutParams2);
    }

    /* renamed from: P */
    public static final void m5445P(MyFloatingToolService myFloatingToolService, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WindowManager.LayoutParams layoutParams = myFloatingToolService.layoutParams;
        WindowManager.LayoutParams layoutParams2 = null;
        if (layoutParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutParams");
            layoutParams = null;
        }
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.x = ((Integer) animatedValue).intValue();
        WindowManager windowManager = myFloatingToolService.windowManager;
        if (windowManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("windowManager");
            windowManager = null;
        }
        View view = myFloatingToolService.floatingView;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("floatingView");
            view = null;
        }
        WindowManager.LayoutParams layoutParams3 = myFloatingToolService.layoutParams;
        if (layoutParams3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutParams");
        } else {
            layoutParams2 = layoutParams3;
        }
        windowManager.updateViewLayout(view, layoutParams2);
    }

    /* renamed from: w */
    public static final void m5464w(MyFloatingToolService myFloatingToolService, View view) {
        FloatingToolbarBinding floatingToolbarBinding = myFloatingToolService.binding;
        FloatingToolbarBinding floatingToolbarBinding2 = null;
        if (floatingToolbarBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            floatingToolbarBinding = null;
        }
        floatingToolbarBinding.imgScreenTurnOpen.setVisibility(0);
        FloatingToolbarBinding floatingToolbarBinding3 = myFloatingToolService.binding;
        if (floatingToolbarBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            floatingToolbarBinding2 = floatingToolbarBinding3;
        }
        floatingToolbarBinding2.linearMenu.setVisibility(8);
        AbstractC4668s.m2377i("MyFloatingToolService", "右箭头被点击 - 收起");
    }

    /* renamed from: x */
    public static final void m5465x(MyFloatingToolService myFloatingToolService, View view) {
        FloatingToolbarBinding floatingToolbarBinding = myFloatingToolService.binding;
        FloatingToolbarBinding floatingToolbarBinding2 = null;
        if (floatingToolbarBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            floatingToolbarBinding = null;
        }
        floatingToolbarBinding.imgScreenTurnOpen.setVisibility(0);
        FloatingToolbarBinding floatingToolbarBinding3 = myFloatingToolService.binding;
        if (floatingToolbarBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            floatingToolbarBinding2 = floatingToolbarBinding3;
        }
        floatingToolbarBinding2.linearMenu.setVisibility(8);
        AbstractC4668s.m2377i("MyFloatingToolService", "左箭头被点击 - 收起");
    }

    /* renamed from: y */
    public static final void m5466y(MyFloatingToolService myFloatingToolService, View view) {
        AbstractC4668s.m2377i("MyFloatingToolService", "截图按钮被点击");
        FloatingToolbarBinding floatingToolbarBinding = myFloatingToolService.binding;
        if (floatingToolbarBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            floatingToolbarBinding = null;
        }
        LinearLayout imgLinear = floatingToolbarBinding.imgLinear;
        Intrinsics.checkNotNullExpressionValue(imgLinear, "imgLinear");
        imgLinear.setVisibility(8);
        myFloatingToolService.m5470I(myFloatingToolService, myFloatingToolService.m5475s(myFloatingToolService));
    }

    /* renamed from: z */
    public static final void m5467z(MyFloatingToolService myFloatingToolService, View view) {
        FloatingToolbarBinding floatingToolbarBinding = myFloatingToolService.binding;
        FloatingToolbarBinding floatingToolbarBinding2 = null;
        if (floatingToolbarBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            floatingToolbarBinding = null;
        }
        floatingToolbarBinding.imgScreenTurnOpen.setVisibility(8);
        FloatingToolbarBinding floatingToolbarBinding3 = myFloatingToolService.binding;
        if (floatingToolbarBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            floatingToolbarBinding2 = floatingToolbarBinding3;
        }
        floatingToolbarBinding2.linearMenu.setVisibility(0);
        AbstractC4668s.m2377i("MyFloatingToolService", "单个箭头被点击 - 展开");
    }

    /* renamed from: A */
    public final void m5468A() {
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC7834b.m9512a();
            NotificationChannel notificationChannelM2435a = AbstractC4672w.m2435a("FloatingToolbarChannel", "悬浮工具栏通知", 2);
            notificationChannelM2435a.setDescription("用于显示悬浮工具栏的前台服务通知");
            Object systemService = getSystemService("notification");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).createNotificationChannel(notificationChannelM2435a);
        }
        Notification notificationBuild = new NotificationCompat.Builder(this, "FloatingToolbarChannel").setContentTitle("悬浮工具栏正在运行").setContentText("点击此处管理悬浮工具栏").setSmallIcon(R.mipmap.hw_ic_logo).setOngoing(true).setPriority(-1).build();
        Intrinsics.checkNotNullExpressionValue(notificationBuild, "build(...)");
        startForeground(101, notificationBuild);
    }

    /* renamed from: B */
    public final void m5469B() {
        WindowManager windowManager = this.windowManager;
        WindowManager windowManager2 = null;
        if (windowManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("windowManager");
            windowManager = null;
        }
        this.screenshotHelper = new C6597k(this, windowManager, new Function1() { // from class: x3.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MyFloatingToolService.m5437C(this.f10449a, (Bitmap) obj);
            }
        }, new Function0() { // from class: x3.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MyFloatingToolService.m5438D(this.f10450a);
            }
        });
        WindowManager windowManager3 = this.windowManager;
        if (windowManager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("windowManager");
        } else {
            windowManager2 = windowManager3;
        }
        this.croppedBitmapDialog = new C6274f(this, windowManager2, new Function1() { // from class: x3.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MyFloatingToolService.m5439E((Bitmap) obj);
            }
        }, new Function1() { // from class: x3.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MyFloatingToolService.m5440F(this.f10451a, (Bitmap) obj);
            }
        });
    }

    /* renamed from: I */
    public final void m5470I(Context context, String saveDir) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(saveDir, "saveDir");
        Intent intent = new Intent("com.linspirer.edu.screenshot");
        intent.setPackage("com.android.launcher3");
        intent.putExtra("savedir", saveDir);
        intent.putExtra("packageName", context.getPackageName());
        try {
            context.sendBroadcast(intent);
        } catch (Exception e6) {
            e6.printStackTrace();
            Toast.makeText(context, "发送截图请求失败: " + e6.getMessage(), 1).show();
        }
    }

    /* renamed from: J */
    public final void m5471J(Function1 callback) {
        this.onImageSavedCallback = callback;
    }

    /* renamed from: K */
    public final void m5472K() {
        int i6;
        ValueAnimator valueAnimatorOfInt;
        int i7 = Resources.getSystem().getDisplayMetrics().widthPixels;
        View view = this.floatingView;
        WindowManager.LayoutParams layoutParams = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("floatingView");
            view = null;
        }
        int width = view.getWidth();
        WindowManager.LayoutParams layoutParams2 = this.layoutParams;
        if (layoutParams2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutParams");
            layoutParams2 = null;
        }
        if ((layoutParams2.gravity & 5) == 5) {
            int i8 = i7 - width;
            WindowManager.LayoutParams layoutParams3 = this.layoutParams;
            if (layoutParams3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutParams");
                layoutParams3 = null;
            }
            i6 = i8 - layoutParams3.x;
        } else {
            WindowManager.LayoutParams layoutParams4 = this.layoutParams;
            if (layoutParams4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutParams");
                layoutParams4 = null;
            }
            i6 = layoutParams4.x;
        }
        if ((width / 2) + i6 < i7 / 2) {
            WindowManager.LayoutParams layoutParams5 = this.layoutParams;
            if (layoutParams5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutParams");
            } else {
                layoutParams = layoutParams5;
            }
            layoutParams.gravity = 19;
            valueAnimatorOfInt = ValueAnimator.ofInt(i6, 0);
            Intrinsics.checkNotNullExpressionValue(valueAnimatorOfInt, "ofInt(...)");
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: x3.f
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    MyFloatingToolService.m5443L(this.f10444a, valueAnimator);
                }
            });
            m5474O(true);
        } else {
            int i9 = (i7 - width) - i6;
            WindowManager.LayoutParams layoutParams6 = this.layoutParams;
            if (layoutParams6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutParams");
            } else {
                layoutParams = layoutParams6;
            }
            layoutParams.gravity = 21;
            valueAnimatorOfInt = ValueAnimator.ofInt(i9, 0);
            Intrinsics.checkNotNullExpressionValue(valueAnimatorOfInt, "ofInt(...)");
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: x3.g
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    MyFloatingToolService.m5444M(this.f10445a, valueAnimator);
                }
            });
            m5474O(false);
        }
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.start();
    }

    /* renamed from: N */
    public final void m5473N() {
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new MyFloatingToolService$startGlobalEventListening$1(this, null), 3, null);
    }

    /* renamed from: O */
    public final void m5474O(boolean isLeft) {
        int i6;
        int i7 = Resources.getSystem().getDisplayMetrics().widthPixels;
        View view = this.floatingView;
        FloatingToolbarBinding floatingToolbarBinding = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("floatingView");
            view = null;
        }
        int width = view.getWidth();
        WindowManager.LayoutParams layoutParams = this.layoutParams;
        if (layoutParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutParams");
            layoutParams = null;
        }
        if ((layoutParams.gravity & 5) == 5) {
            int i8 = i7 - width;
            WindowManager.LayoutParams layoutParams2 = this.layoutParams;
            if (layoutParams2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutParams");
                layoutParams2 = null;
            }
            i6 = i8 - layoutParams2.x;
        } else {
            WindowManager.LayoutParams layoutParams3 = this.layoutParams;
            if (layoutParams3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutParams");
                layoutParams3 = null;
            }
            i6 = layoutParams3.x;
        }
        WindowManager.LayoutParams layoutParams4 = this.layoutParams;
        if (layoutParams4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutParams");
            layoutParams4 = null;
        }
        layoutParams4.gravity = isLeft ? 19 : 21;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i6, 0);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: x3.h
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MyFloatingToolService.m5445P(this.f10446a, valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
        int i9 = isLeft ? R.drawable.service_gradient_bg_left : R.drawable.service_gradient_bg_right;
        int i10 = isLeft ? R.drawable.screen_turn_open_left : R.drawable.screen_turn_open_right;
        FloatingToolbarBinding floatingToolbarBinding2 = this.binding;
        if (floatingToolbarBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            floatingToolbarBinding2 = null;
        }
        floatingToolbarBinding2.imgLinear.setBackgroundResource(i9);
        FloatingToolbarBinding floatingToolbarBinding3 = this.binding;
        if (floatingToolbarBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            floatingToolbarBinding3 = null;
        }
        floatingToolbarBinding3.imgScreenTurnOpen.setImageDrawable(ContextCompat.getDrawable(this, i10));
        if (isLeft) {
            FloatingToolbarBinding floatingToolbarBinding4 = this.binding;
            if (floatingToolbarBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                floatingToolbarBinding4 = null;
            }
            floatingToolbarBinding4.imgArrowLeft.setVisibility(8);
            FloatingToolbarBinding floatingToolbarBinding5 = this.binding;
            if (floatingToolbarBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                floatingToolbarBinding = floatingToolbarBinding5;
            }
            floatingToolbarBinding.imgArrowRight.setVisibility(0);
            return;
        }
        FloatingToolbarBinding floatingToolbarBinding6 = this.binding;
        if (floatingToolbarBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            floatingToolbarBinding6 = null;
        }
        floatingToolbarBinding6.imgArrowLeft.setVisibility(0);
        FloatingToolbarBinding floatingToolbarBinding7 = this.binding;
        if (floatingToolbarBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            floatingToolbarBinding = floatingToolbarBinding7;
        }
        floatingToolbarBinding.imgArrowRight.setVisibility(8);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.binder;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Object systemService = getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.windowManager = (WindowManager) systemService;
        FloatingToolbarBinding floatingToolbarBindingInflate = FloatingToolbarBinding.inflate(LayoutInflater.from(this));
        Intrinsics.checkNotNullExpressionValue(floatingToolbarBindingInflate, "inflate(...)");
        this.binding = floatingToolbarBindingInflate;
        C7855w c7855w = null;
        if (floatingToolbarBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            floatingToolbarBindingInflate = null;
        }
        LinearLayout root = floatingToolbarBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        this.floatingView = root;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, Build.VERSION.SDK_INT >= 26 ? 2038 : 2003, 8, -3);
        layoutParams.gravity = 21;
        layoutParams.x = 0;
        layoutParams.y = 0;
        this.layoutParams = layoutParams;
        WindowManager windowManager = this.windowManager;
        if (windowManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("windowManager");
            windowManager = null;
        }
        View view = this.floatingView;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("floatingView");
            view = null;
        }
        WindowManager.LayoutParams layoutParams2 = this.layoutParams;
        if (layoutParams2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutParams");
            layoutParams2 = null;
        }
        windowManager.addView(view, layoutParams2);
        m5478v();
        m5468A();
        C7855w c7855w2 = new C7855w();
        c7855w2.m9524b(new Function1() { // from class: x3.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MyFloatingToolService.m5441G(this.f10447a, (String) obj);
            }
        });
        c7855w2.m9523a(new Function1() { // from class: x3.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MyFloatingToolService.m5442H(this.f10448a, (String) obj);
            }
        });
        this.screenshotFinishReceiver = c7855w2;
        IntentFilter intentFilter = new IntentFilter("com.android.launcher3.mdm.SCREEN_SHOT_FINISH");
        C7855w c7855w3 = this.screenshotFinishReceiver;
        if (c7855w3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenshotFinishReceiver");
        } else {
            c7855w = c7855w3;
        }
        registerReceiver(c7855w, intentFilter);
        m5469B();
        this.overlayToastManager = new OverlayToastManager(this, this.scope);
        m5473N();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        View view = this.floatingView;
        if (view != null) {
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("floatingView");
                view = null;
            }
            if (view.getParent() != null) {
                WindowManager windowManager = this.windowManager;
                if (windowManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("windowManager");
                    windowManager = null;
                }
                View view2 = this.floatingView;
                if (view2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("floatingView");
                    view2 = null;
                }
                windowManager.removeView(view2);
            }
        }
        stopForeground(true);
        OverlayToastManager overlayToastManager = this.overlayToastManager;
        if (overlayToastManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("overlayToastManager");
            overlayToastManager = null;
        }
        overlayToastManager.m5502e();
        Job.DefaultImpls.cancel$default((Job) this.job, (CancellationException) null, 1, (Object) null);
    }

    /* renamed from: s */
    public final String m5475s(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), AbstractC4640d.m2150d());
        if (!file.exists()) {
            file.mkdirs();
        }
        String absolutePath = new File(file, "Screenshot_" + System.currentTimeMillis()).getAbsolutePath();
        Intrinsics.checkNotNull(absolutePath);
        return absolutePath;
    }

    /* renamed from: t */
    public final void m5476t(String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        AbstractC4668s.m2379k("MyFloatingToolService", "截图失败: " + error);
        FloatingToolbarBinding floatingToolbarBinding = this.binding;
        if (floatingToolbarBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            floatingToolbarBinding = null;
        }
        LinearLayout imgLinear = floatingToolbarBinding.imgLinear;
        Intrinsics.checkNotNullExpressionValue(imgLinear, "imgLinear");
        imgLinear.setVisibility(0);
    }

    /* renamed from: u */
    public final void m5477u(String imagePath) {
        Intrinsics.checkNotNullParameter(imagePath, "imagePath");
        AbstractC4668s.m2377i("MyFloatingToolService", "接收到截图完成回调，路径: " + imagePath);
        if (new File(imagePath).exists()) {
            AbstractC4668s.m2377i("MyFloatingToolService", "文件实际存在: " + imagePath);
        } else {
            AbstractC4668s.m2379k("MyFloatingToolService", "图片文件未找到或未保存成功: " + imagePath);
        }
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(new File(imagePath).getAbsolutePath());
        FloatingToolbarBinding floatingToolbarBinding = null;
        C6597k c6597k = null;
        if (bitmapDecodeFile == null) {
            AbstractC4668s.m2377i("MyFloatingToolService", "无法加载截图文件");
            FloatingToolbarBinding floatingToolbarBinding2 = this.binding;
            if (floatingToolbarBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                floatingToolbarBinding = floatingToolbarBinding2;
            }
            LinearLayout imgLinear = floatingToolbarBinding.imgLinear;
            Intrinsics.checkNotNullExpressionValue(imgLinear, "imgLinear");
            imgLinear.setVisibility(0);
            return;
        }
        AbstractC4668s.m2377i("MyFloatingToolService", "截图已显示: " + imagePath);
        C6597k c6597k2 = this.screenshotHelper;
        if (c6597k2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenshotHelper");
        } else {
            c6597k = c6597k2;
        }
        c6597k.m7519g(bitmapDecodeFile);
    }

    /* renamed from: v */
    public final void m5478v() {
        this.dragOrClickListener = new ViewOnTouchListenerC6081b(500L);
        View view = this.floatingView;
        FloatingToolbarBinding floatingToolbarBinding = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("floatingView");
            view = null;
        }
        ViewOnTouchListenerC6081b viewOnTouchListenerC6081b = this.dragOrClickListener;
        if (viewOnTouchListenerC6081b == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dragOrClickListener");
            viewOnTouchListenerC6081b = null;
        }
        view.setOnTouchListener(viewOnTouchListenerC6081b);
        FloatingToolbarBinding floatingToolbarBinding2 = this.binding;
        if (floatingToolbarBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            floatingToolbarBinding2 = null;
        }
        ImageView imageView = floatingToolbarBinding2.imgScreenTurnOpen;
        ViewOnTouchListenerC6081b viewOnTouchListenerC6081b2 = this.dragOrClickListener;
        if (viewOnTouchListenerC6081b2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dragOrClickListener");
            viewOnTouchListenerC6081b2 = null;
        }
        imageView.setOnTouchListener(viewOnTouchListenerC6081b2);
        FloatingToolbarBinding floatingToolbarBinding3 = this.binding;
        if (floatingToolbarBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            floatingToolbarBinding3 = null;
        }
        ImageView imageView2 = floatingToolbarBinding3.imgArrowLeft;
        ViewOnTouchListenerC6081b viewOnTouchListenerC6081b3 = this.dragOrClickListener;
        if (viewOnTouchListenerC6081b3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dragOrClickListener");
            viewOnTouchListenerC6081b3 = null;
        }
        imageView2.setOnTouchListener(viewOnTouchListenerC6081b3);
        FloatingToolbarBinding floatingToolbarBinding4 = this.binding;
        if (floatingToolbarBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            floatingToolbarBinding4 = null;
        }
        ImageView imageView3 = floatingToolbarBinding4.imgArrowRight;
        ViewOnTouchListenerC6081b viewOnTouchListenerC6081b4 = this.dragOrClickListener;
        if (viewOnTouchListenerC6081b4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dragOrClickListener");
            viewOnTouchListenerC6081b4 = null;
        }
        imageView3.setOnTouchListener(viewOnTouchListenerC6081b4);
        FloatingToolbarBinding floatingToolbarBinding5 = this.binding;
        if (floatingToolbarBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            floatingToolbarBinding5 = null;
        }
        ImageView imageView4 = floatingToolbarBinding5.imgScreenShot;
        ViewOnTouchListenerC6081b viewOnTouchListenerC6081b5 = this.dragOrClickListener;
        if (viewOnTouchListenerC6081b5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dragOrClickListener");
            viewOnTouchListenerC6081b5 = null;
        }
        imageView4.setOnTouchListener(viewOnTouchListenerC6081b5);
        FloatingToolbarBinding floatingToolbarBinding6 = this.binding;
        if (floatingToolbarBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            floatingToolbarBinding6 = null;
        }
        floatingToolbarBinding6.imgScreenTurnOpen.setOnClickListener(new View.OnClickListener() { // from class: x3.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MyFloatingToolService.m5467z(this.f10452a, view2);
            }
        });
        FloatingToolbarBinding floatingToolbarBinding7 = this.binding;
        if (floatingToolbarBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            floatingToolbarBinding7 = null;
        }
        floatingToolbarBinding7.imgArrowLeft.setOnClickListener(new View.OnClickListener() { // from class: x3.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MyFloatingToolService.m5464w(this.f10453a, view2);
            }
        });
        FloatingToolbarBinding floatingToolbarBinding8 = this.binding;
        if (floatingToolbarBinding8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            floatingToolbarBinding8 = null;
        }
        floatingToolbarBinding8.imgArrowRight.setOnClickListener(new View.OnClickListener() { // from class: x3.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MyFloatingToolService.m5465x(this.f10442a, view2);
            }
        });
        FloatingToolbarBinding floatingToolbarBinding9 = this.binding;
        if (floatingToolbarBinding9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            floatingToolbarBinding = floatingToolbarBinding9;
        }
        floatingToolbarBinding.imgScreenShot.setOnClickListener(new View.OnClickListener() { // from class: x3.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MyFloatingToolService.m5466y(this.f10443a, view2);
            }
        });
    }
}
