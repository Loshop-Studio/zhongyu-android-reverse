package p085j4;

import android.app.Dialog;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.IBinder;
import android.provider.Settings;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import com.blankj.utilcode.util.AbstractC4649h0;
import com.zykj.huiwei.launcher.p035ui.dialog.screenShoot.C6132a;
import com.zykj.huiwei.launcher.p035ui.dialog.screenShoot.CommonDialogFragment;
import com.zykj.huiwei.launcher.server.MyFloatingToolService;
import com.zykj.manage.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p085j4.C6591e;

/* renamed from: j4.e */
/* loaded from: classes4.dex */
public final class C6591e {

    /* renamed from: a */
    public final AppCompatActivity f8580a;

    /* renamed from: b */
    public final Function1 f8581b;

    /* renamed from: c */
    public final Function0 f8582c;

    /* renamed from: d */
    public final Function1 f8583d;

    /* renamed from: e */
    public final String f8584e;

    /* renamed from: f */
    public ActivityResultLauncher f8585f;

    /* renamed from: g */
    public ActivityResultLauncher f8586g;

    /* renamed from: h */
    public final a f8587h;

    /* renamed from: j4.e$a */
    public static final class a implements ServiceConnection {
        public a() {
        }

        /* renamed from: b */
        public static final Unit m7507b(C6591e c6591e, Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            Function1 function1 = c6591e.f8583d;
            if (function1 != null) {
                function1.invoke(uri);
            }
            return Unit.INSTANCE;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Intrinsics.checkNotNull(iBinder, "null cannot be cast to non-null type com.zykj.huiwei.launcher.server.MyFloatingToolService.MyServiceBinder");
            MyFloatingToolService.BinderC6082c binderC6082c = (MyFloatingToolService.BinderC6082c) iBinder;
            C6591e.this.f8581b.invoke(binderC6082c.m5481a());
            String unused = C6591e.this.f8584e;
            MyFloatingToolService myFloatingToolServiceM5481a = binderC6082c.m5481a();
            final C6591e c6591e = C6591e.this;
            myFloatingToolServiceM5481a.m5471J(new Function1() { // from class: j4.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C6591e.a.m7507b(c6591e, (Uri) obj);
                }
            });
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C6591e.this.f8582c.invoke();
            String unused = C6591e.this.f8584e;
        }
    }

    /* renamed from: j4.e$b */
    public static final class b implements CommonDialogFragment.InterfaceC6131b {
        public b() {
        }

        @Override // com.zykj.huiwei.launcher.p035ui.dialog.screenShoot.CommonDialogFragment.InterfaceC6131b
        /* renamed from: a */
        public void mo5823a(Dialog dialog) {
            if (dialog != null) {
                dialog.dismiss();
            }
            C6591e.this.m7500n();
        }
    }

    /* renamed from: j4.e$c */
    public static final class c implements CommonDialogFragment.InterfaceC6131b {
        public c() {
        }

        @Override // com.zykj.huiwei.launcher.p035ui.dialog.screenShoot.CommonDialogFragment.InterfaceC6131b
        /* renamed from: a */
        public void mo5823a(Dialog dialog) {
            if (dialog != null) {
                dialog.dismiss();
            }
            C6591e.this.m7501o();
        }
    }

    /* renamed from: j4.e$d */
    public static final class d implements CommonDialogFragment.InterfaceC6131b {
        public d() {
        }

        @Override // com.zykj.huiwei.launcher.p035ui.dialog.screenShoot.CommonDialogFragment.InterfaceC6131b
        /* renamed from: a */
        public void mo5823a(Dialog dialog) {
            if (dialog != null) {
                dialog.dismiss();
            }
            C6591e.this.m7500n();
        }
    }

    public C6591e(AppCompatActivity activity, Function1 onServiceConnected, Function0 onServiceDisconnected, Function1 function1) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(onServiceConnected, "onServiceConnected");
        Intrinsics.checkNotNullParameter(onServiceDisconnected, "onServiceDisconnected");
        this.f8580a = activity;
        this.f8581b = onServiceConnected;
        this.f8582c = onServiceDisconnected;
        this.f8583d = function1;
        this.f8584e = "FloatingToolManager";
        this.f8587h = new a();
        m7499k();
    }

    /* renamed from: l */
    public static final void m7495l(C6591e c6591e, ActivityResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Settings.canDrawOverlays(c6591e.f8580a)) {
            c6591e.m7497i();
        } else {
            c6591e.m7501o();
        }
    }

    /* renamed from: m */
    public static final void m7496m(C6591e c6591e, boolean z6) {
        if (z6) {
            c6591e.m7503q();
        } else {
            Toast.makeText(c6591e.f8580a, "读取存储权限被拒绝，无法显示图片", 1).show();
        }
    }

    /* renamed from: i */
    public final void m7497i() {
        if (ContextCompat.checkSelfPermission(this.f8580a, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            m7498j();
            return;
        }
        ActivityResultLauncher activityResultLauncher = null;
        if (this.f8580a.shouldShowRequestPermissionRationale("android.permission.READ_EXTERNAL_STORAGE")) {
            ActivityResultLauncher activityResultLauncher2 = this.f8586g;
            if (activityResultLauncher2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("requestStoragePermissionLauncher");
            } else {
                activityResultLauncher = activityResultLauncher2;
            }
            activityResultLauncher.launch("android.permission.READ_EXTERNAL_STORAGE");
            return;
        }
        ActivityResultLauncher activityResultLauncher3 = this.f8586g;
        if (activityResultLauncher3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestStoragePermissionLauncher");
        } else {
            activityResultLauncher = activityResultLauncher3;
        }
        activityResultLauncher.launch("android.permission.READ_EXTERNAL_STORAGE");
    }

    /* renamed from: j */
    public final void m7498j() {
        if (Settings.canDrawOverlays(this.f8580a)) {
            m7503q();
        } else {
            m7502p();
        }
    }

    /* renamed from: k */
    public final void m7499k() {
        this.f8585f = this.f8580a.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: j4.b
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                C6591e.m7495l(this.f8577a, (ActivityResult) obj);
            }
        });
        this.f8586g = this.f8580a.registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback() { // from class: j4.c
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                C6591e.m7496m(this.f8578a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* renamed from: n */
    public final void m7500n() {
        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + this.f8580a.getPackageName()));
        ActivityResultLauncher activityResultLauncher = this.f8585f;
        if (activityResultLauncher == null) {
            Intrinsics.throwUninitializedPropertyAccessException("overlayPermissionLauncher");
            activityResultLauncher = null;
        }
        activityResultLauncher.launch(intent);
    }

    /* renamed from: o */
    public final void m7501o() {
        C6132a c6132a = new C6132a(this.f8580a, false);
        String strM2191b = AbstractC4649h0.m2191b(R.string.floating_window_permission_title_reject);
        Intrinsics.checkNotNullExpressionValue(strM2191b, "getString(...)");
        C6132a c6132aM5829m = C6132a.m5829m(c6132a, strM2191b, null, null, 6, null);
        String strM2191b2 = AbstractC4649h0.m2191b(R.string.floating_window_permission_message_reject);
        Intrinsics.checkNotNullExpressionValue(strM2191b2, "getString(...)");
        C6132a c6132aM5826g = C6132a.m5826g(c6132aM5829m, strM2191b2, null, null, 6, null);
        String strM2191b3 = AbstractC4649h0.m2191b(R.string.hw_cancel);
        Intrinsics.checkNotNullExpressionValue(strM2191b3, "getString(...)");
        C6132a c6132aM5832e = C6132a.m5827i(c6132aM5826g, strM2191b3, null, null, null, null, null, null, null, 254, null).m5832e(true);
        String strM2191b4 = AbstractC4649h0.m2191b(R.string.hw_confirm);
        Intrinsics.checkNotNullExpressionValue(strM2191b4, "getString(...)");
        C6132a.m5828k(c6132aM5832e, strM2191b4, null, null, null, null, null, null, new b(), 126, null).m5837n();
    }

    /* renamed from: p */
    public final void m7502p() {
        C6132a c6132a = new C6132a(this.f8580a, true);
        String strM2191b = AbstractC4649h0.m2191b(R.string.floating_window_permission_title);
        Intrinsics.checkNotNullExpressionValue(strM2191b, "getString(...)");
        C6132a c6132aM5829m = C6132a.m5829m(c6132a, strM2191b, null, null, 6, null);
        String strM2191b2 = AbstractC4649h0.m2191b(R.string.floating_window_permission_message);
        Intrinsics.checkNotNullExpressionValue(strM2191b2, "getString(...)");
        C6132a c6132aM5826g = C6132a.m5826g(c6132aM5829m, strM2191b2, null, null, 6, null);
        String strM2191b3 = AbstractC4649h0.m2191b(R.string.hw_cancel);
        Intrinsics.checkNotNullExpressionValue(strM2191b3, "getString(...)");
        C6132a c6132aM5827i = C6132a.m5827i(c6132aM5826g, strM2191b3, null, null, null, null, null, null, new c(), 126, null);
        String strM2191b4 = AbstractC4649h0.m2191b(R.string.hw_confirm);
        Intrinsics.checkNotNullExpressionValue(strM2191b4, "getString(...)");
        C6132a.m5828k(c6132aM5827i, strM2191b4, null, null, null, null, null, null, new d(), 126, null).m5837n();
    }

    /* renamed from: q */
    public final void m7503q() {
        this.f8580a.bindService(new Intent(this.f8580a, (Class<?>) MyFloatingToolService.class), this.f8587h, 1);
    }

    /* renamed from: r */
    public final void m7504r() {
        m7497i();
    }

    /* renamed from: s */
    public final void m7505s() {
        this.f8580a.unbindService(this.f8587h);
    }
}
