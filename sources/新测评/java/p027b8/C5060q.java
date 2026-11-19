package p027b8;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.PickVisualMediaRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.UriUtils;
import com.blankj.utilcode.util.Utils;
import com.canhub.cropper.CropImageOptions;
import com.zykj.view.R$color;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p010a8.C0036d;

/* renamed from: b8.q */
/* loaded from: classes5.dex */
public final class C5060q {

    /* renamed from: a */
    public final Fragment f2614a;

    /* renamed from: b */
    public final ComponentActivity f2615b;

    /* renamed from: c */
    public Function1 f2616c;

    /* renamed from: d */
    public final ActivityResultLauncher f2617d;

    /* renamed from: e */
    public Function1 f2618e;

    /* renamed from: f */
    public final ActivityResultLauncher f2619f;

    /* renamed from: g */
    public Function1 f2620g;

    /* renamed from: h */
    public final ActivityResultLauncher f2621h;

    /* renamed from: i */
    public Function1 f2622i;

    /* renamed from: j */
    public final ActivityResultLauncher f2623j;

    /* renamed from: k */
    public Function0 f2624k;

    /* renamed from: l */
    public final ActivityResultLauncher f2625l;

    /* renamed from: m */
    public final CropImageOptions f2626m;

    public C5060q(Fragment fragment, ComponentActivity componentActivity) {
        this.f2614a = fragment;
        this.f2615b = componentActivity;
        this.f2617d = m2566s(new ActivityResultContract<Uri, Uri>() { // from class: com.zykj.view.ui.camera.EzyCameraContract$StartCameraForResult
            @Override // androidx.activity.result.contract.ActivityResultContract
            public Intent createIntent(Context context, Uri input) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input, "input");
                Intent intent = new Intent(context, (Class<?>) EzyCameraActivity.class);
                intent.putExtra("Uri", input);
                return intent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.activity.result.contract.ActivityResultContract
            public Uri parseResult(int resultCode, Intent intent) {
                if (resultCode == -1 && intent != null) {
                    return (Uri) intent.getParcelableExtra("ResultUri");
                }
                return null;
            }
        }, new ActivityResultCallback() { // from class: b8.d
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                C5060q.m2554n(this.f2586a, (Uri) obj);
            }
        });
        this.f2619f = m2566s(new ActivityResultContracts.TakePicture(), new ActivityResultCallback() { // from class: b8.h
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                C5060q.m2540H(this.f2594a, ((Boolean) obj).booleanValue());
            }
        });
        this.f2621h = m2566s(new ActivityResultContracts.PickVisualMedia(), new ActivityResultCallback() { // from class: b8.i
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                C5060q.m2556q(this.f2595a, (Uri) obj);
            }
        });
        this.f2623j = m2566s(new ActivityResultContract<C0036d, Uri>() { // from class: com.zykj.view.ui.crop.EzyCropContract$StartCropForResult
            @Override // androidx.activity.result.contract.ActivityResultContract
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Intent createIntent(Context context, C0036d input) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input, "input");
                Intent intent = new Intent(context, (Class<?>) EzyCropActivity.class);
                intent.putExtra("Uri", input.m73b());
                intent.putExtra("CropImageOptions", input.m72a());
                return intent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.activity.result.contract.ActivityResultContract
            public Uri parseResult(int resultCode, Intent intent) {
                if (resultCode == -1 && intent != null) {
                    return (Uri) intent.getParcelableExtra("ResultUri");
                }
                return null;
            }
        }, new ActivityResultCallback() { // from class: b8.j
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                C5060q.m2555p(this.f2596a, (Uri) obj);
            }
        });
        this.f2625l = m2566s(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback() { // from class: b8.k
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                C5060q.m2557r(this.f2597a, ((Boolean) obj).booleanValue());
            }
        });
        CropImageOptions cropImageOptions = new CropImageOptions(false, false, null, null, 0.0f, 0.0f, 0.0f, null, null, false, false, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, -1, -1, 63, null);
        cropImageOptions.autoZoomEnabled = true;
        cropImageOptions.multiTouchEnabled = true;
        Application app = Utils.getApp();
        int i10 = R$color.colorPrimary;
        cropImageOptions.borderLineColor = app.getColor(i10);
        cropImageOptions.borderCornerColor = Utils.getApp().getColor(i10);
        cropImageOptions.progressBarColor = Utils.getApp().getColor(i10);
        cropImageOptions.initialCropWindowPaddingRatio = 0.1f;
        this.f2626m = cropImageOptions;
    }

    /* renamed from: B */
    public static final Unit m2535B(boolean z9, C5060q c5060q, Function1 function1, Uri uri) {
        if (!z9 || uri == null) {
            function1.invoke(uri);
        } else {
            c5060q.m2568y(uri, function1);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: D */
    public static /* synthetic */ void m2536D(C5060q c5060q, Uri uri, boolean z9, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            uri = AbstractC5061r.m2569a();
        }
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        c5060q.m2564C(uri, z9, function1);
    }

    /* renamed from: E */
    public static final Unit m2537E(final C5060q c5060q, final Uri uri, final boolean z9, final Function1 function1) {
        c5060q.f2618e = new Function1() { // from class: b8.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5060q.m2538F(z9, c5060q, uri, function1, ((Boolean) obj).booleanValue());
            }
        };
        c5060q.f2619f.launch(uri);
        return Unit.INSTANCE;
    }

    /* renamed from: F */
    public static final Unit m2538F(boolean z9, C5060q c5060q, final Uri uri, final Function1 function1, boolean z10) {
        if (!z9) {
            function1.invoke(uri);
        } else if (z10) {
            c5060q.m2568y(uri, new Function1() { // from class: b8.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C5060q.m2539G(uri, function1, (Uri) obj);
                }
            });
        } else {
            function1.invoke(null);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: G */
    public static final Unit m2539G(Uri uri, Function1 function1, Uri uri2) {
        FileUtils.delete(UriUtils.uri2FileNoCacheCopy(uri));
        function1.invoke(uri2);
        return Unit.INSTANCE;
    }

    /* renamed from: H */
    public static final void m2540H(C5060q c5060q, boolean z9) {
        Function1 function1 = c5060q.f2618e;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z9));
        }
        c5060q.f2618e = null;
    }

    /* renamed from: n */
    public static final void m2554n(C5060q c5060q, Uri uri) {
        Function1 function1 = c5060q.f2616c;
        if (function1 != null) {
            function1.invoke(uri);
        }
        c5060q.f2616c = null;
    }

    /* renamed from: p */
    public static final void m2555p(C5060q c5060q, Uri uri) {
        Function1 function1 = c5060q.f2622i;
        if (function1 != null) {
            function1.invoke(uri);
        }
        c5060q.f2622i = null;
    }

    /* renamed from: q */
    public static final void m2556q(C5060q c5060q, Uri uri) {
        Function1 function1 = c5060q.f2620g;
        if (function1 != null) {
            function1.invoke(uri);
        }
        c5060q.f2620g = null;
    }

    /* renamed from: r */
    public static final void m2557r(C5060q c5060q, boolean z9) {
        if (!z9) {
            ToastUtils.showShort("权限未获取成功", new Object[0]);
            return;
        }
        Function0 function0 = c5060q.f2624k;
        if (function0 != null) {
            function0.invoke();
        }
        c5060q.f2624k = null;
    }

    /* renamed from: u */
    public static /* synthetic */ void m2558u(C5060q c5060q, Uri uri, boolean z9, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            uri = AbstractC5061r.m2569a();
        }
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        c5060q.m2567t(uri, z9, function1);
    }

    /* renamed from: v */
    public static final Unit m2559v(final C5060q c5060q, Uri uri, final boolean z9, final Function1 function1) {
        c5060q.f2616c = new Function1() { // from class: b8.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5060q.m2560w(z9, c5060q, function1, (Uri) obj);
            }
        };
        c5060q.f2617d.launch(uri);
        return Unit.INSTANCE;
    }

    /* renamed from: w */
    public static final Unit m2560w(boolean z9, C5060q c5060q, final Function1 function1, final Uri uri) {
        if (!z9 || uri == null) {
            function1.invoke(uri);
        } else {
            c5060q.m2568y(uri, new Function1() { // from class: b8.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C5060q.m2561x(uri, function1, (Uri) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* renamed from: x */
    public static final Unit m2561x(Uri uri, Function1 function1, Uri uri2) {
        FileUtils.delete(UriUtils.uri2FileNoCacheCopy(uri));
        function1.invoke(uri2);
        return Unit.INSTANCE;
    }

    /* renamed from: z */
    public static final Unit m2562z(Function1 function1, Uri uri) {
        function1.invoke(uri);
        return Unit.INSTANCE;
    }

    /* renamed from: A */
    public final void m2563A(final boolean z9, final Function1 successCallback) {
        Intrinsics.checkNotNullParameter(successCallback, "successCallback");
        this.f2620g = new Function1() { // from class: b8.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5060q.m2535B(z9, this, successCallback, (Uri) obj);
            }
        };
        this.f2621h.launch(new PickVisualMediaRequest.Builder().setMediaType(ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE).build());
    }

    /* renamed from: C */
    public final void m2564C(final Uri uri, final boolean z9, final Function1 successCallback) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(successCallback, "successCallback");
        m2565o(new Function0() { // from class: b8.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5060q.m2537E(this.f2603a, uri, z9, successCallback);
            }
        });
    }

    /* renamed from: o */
    public final void m2565o(Function0 function0) {
        this.f2624k = function0;
        this.f2625l.launch("android.permission.CAMERA");
    }

    /* renamed from: s */
    public final ActivityResultLauncher m2566s(ActivityResultContract activityResultContract, ActivityResultCallback activityResultCallback) {
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult;
        Fragment fragment = this.f2614a;
        if (fragment != null && (activityResultLauncherRegisterForActivityResult = fragment.registerForActivityResult(activityResultContract, activityResultCallback)) != null) {
            return activityResultLauncherRegisterForActivityResult;
        }
        ComponentActivity componentActivity = this.f2615b;
        componentActivity.getClass();
        return componentActivity.registerForActivityResult(activityResultContract, activityResultCallback);
    }

    /* renamed from: t */
    public final void m2567t(final Uri uri, final boolean z9, final Function1 successCallback) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(successCallback, "successCallback");
        m2565o(new Function0() { // from class: b8.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5060q.m2559v(this.f2590a, uri, z9, successCallback);
            }
        });
    }

    /* renamed from: y */
    public final void m2568y(Uri uri, final Function1 successCallback) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(successCallback, "successCallback");
        this.f2622i = new Function1() { // from class: b8.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5060q.m2562z(successCallback, (Uri) obj);
            }
        };
        this.f2623j.launch(new C0036d(uri, this.f2626m));
    }

    public /* synthetic */ C5060q(Fragment fragment, ComponentActivity componentActivity, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : fragment, (i10 & 2) != 0 ? null : componentActivity);
    }
}
