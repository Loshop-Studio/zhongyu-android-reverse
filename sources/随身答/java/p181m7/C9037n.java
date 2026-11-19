package p181m7;

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
import com.zykj.view.p077ui.crop.EzyCropTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p171l7.C8900d;

/* renamed from: m7.n */
/* loaded from: classes5.dex */
public final class C9037n {

    /* renamed from: a */
    public final Fragment f15206a;

    /* renamed from: b */
    public final ComponentActivity f15207b;

    /* renamed from: c */
    public Function1 f15208c;

    /* renamed from: d */
    public final ActivityResultLauncher f15209d;

    /* renamed from: e */
    public Function1 f15210e;

    /* renamed from: f */
    public final ActivityResultLauncher f15211f;

    /* renamed from: g */
    public Function1 f15212g;

    /* renamed from: h */
    public final ActivityResultLauncher f15213h;

    /* renamed from: i */
    public Function1 f15214i;

    /* renamed from: j */
    public final ActivityResultLauncher f15215j;

    /* renamed from: k */
    public Function0 f15216k;

    /* renamed from: l */
    public final ActivityResultLauncher f15217l;

    /* renamed from: m */
    public final CropImageOptions f15218m;

    public C9037n(Fragment fragment, ComponentActivity componentActivity) {
        this.f15206a = fragment;
        this.f15207b = componentActivity;
        this.f15209d = m14418p(new ActivityResultContract<Uri, Uri>() { // from class: com.zykj.view.ui.camera.EzyCameraContract$StartCameraForResult
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
        }, new ActivityResultCallback() { // from class: m7.d
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                C9037n.m14409k(this.f15184a, (Uri) obj);
            }
        });
        this.f15211f = m14418p(new ActivityResultContracts.TakePicture(), new ActivityResultCallback() { // from class: m7.e
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                C9037n.m14398C(this.f15185a, ((Boolean) obj).booleanValue());
            }
        });
        this.f15213h = m14418p(new ActivityResultContracts.PickVisualMedia(), new ActivityResultCallback() { // from class: m7.f
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                C9037n.m14411n(this.f15186a, (Uri) obj);
            }
        });
        this.f15215j = m14418p(new ActivityResultContract<C8900d, Uri>() { // from class: com.zykj.view.ui.crop.EzyCropContract$StartCropForResult
            @Override // androidx.activity.result.contract.ActivityResultContract
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Intent createIntent(Context context, C8900d input) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input, "input");
                Intent intent = new Intent(context, (Class<?>) EzyCropActivity.class);
                intent.putExtra("Uri", input.m13832c());
                intent.putExtra("CropImageOptions", input.m13830a());
                intent.putExtra("EzyCropLightTheme", input.m13831b() == EzyCropTheme.f12910b);
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
        }, new ActivityResultCallback() { // from class: m7.g
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                C9037n.m14410m(this.f15187a, (Uri) obj);
            }
        });
        this.f15217l = m14418p(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback() { // from class: m7.h
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                C9037n.m14412o(this.f15188a, ((Boolean) obj).booleanValue());
            }
        });
        CropImageOptions cropImageOptions = new CropImageOptions(false, false, null, null, 0.0f, 0.0f, 0.0f, null, null, false, false, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, -1, -1, 63, null);
        cropImageOptions.autoZoomEnabled = true;
        cropImageOptions.multiTouchEnabled = true;
        cropImageOptions.borderLineColor = Utils.getApp().getColor(R$color.colorPrimary);
        cropImageOptions.borderCornerColor = Utils.getApp().getColor(R$color.colorPrimary);
        cropImageOptions.progressBarColor = Utils.getApp().getColor(R$color.colorPrimary);
        cropImageOptions.initialCropWindowPaddingRatio = 0.1f;
        this.f15218m = cropImageOptions;
    }

    /* renamed from: A */
    public static final Unit m14396A(boolean z9, C9037n c9037n, final Uri uri, EzyCropTheme ezyCropTheme, final Function1 function1, boolean z10) {
        if (!z9) {
            function1.invoke(uri);
        } else if (z10) {
            c9037n.m14419q(uri, ezyCropTheme, new Function1() { // from class: m7.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C9037n.m14397B(uri, function1, (Uri) obj);
                }
            });
        } else {
            function1.invoke(null);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: B */
    public static final Unit m14397B(Uri uri, Function1 function1, Uri uri2) {
        FileUtils.delete(UriUtils.uri2FileNoCacheCopy(uri));
        function1.invoke(uri2);
        return Unit.INSTANCE;
    }

    /* renamed from: C */
    public static final void m14398C(C9037n c9037n, boolean z9) {
        Function1 function1 = c9037n.f15210e;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z9));
        }
        c9037n.f15210e = null;
    }

    /* renamed from: k */
    public static final void m14409k(C9037n c9037n, Uri uri) {
        Function1 function1 = c9037n.f15208c;
        if (function1 != null) {
            function1.invoke(uri);
        }
        c9037n.f15208c = null;
    }

    /* renamed from: m */
    public static final void m14410m(C9037n c9037n, Uri uri) {
        Function1 function1 = c9037n.f15214i;
        if (function1 != null) {
            function1.invoke(uri);
        }
        c9037n.f15214i = null;
    }

    /* renamed from: n */
    public static final void m14411n(C9037n c9037n, Uri uri) {
        Function1 function1 = c9037n.f15212g;
        if (function1 != null) {
            function1.invoke(uri);
        }
        c9037n.f15212g = null;
    }

    /* renamed from: o */
    public static final void m14412o(C9037n c9037n, boolean z9) {
        if (!z9) {
            ToastUtils.showShort("权限未获取成功", new Object[0]);
            return;
        }
        Function0 function0 = c9037n.f15216k;
        if (function0 != null) {
            function0.invoke();
        }
        c9037n.f15216k = null;
    }

    /* renamed from: s */
    public static final Unit m14413s(Function1 function1, Uri uri) {
        function1.invoke(uri);
        return Unit.INSTANCE;
    }

    /* renamed from: v */
    public static final Unit m14414v(boolean z9, C9037n c9037n, EzyCropTheme ezyCropTheme, Function1 function1, Uri uri) {
        if (!z9 || uri == null) {
            function1.invoke(uri);
        } else {
            c9037n.m14419q(uri, ezyCropTheme, function1);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: y */
    public static /* synthetic */ void m14415y(C9037n c9037n, Uri uri, boolean z9, Function1 function1, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            uri = AbstractC9038o.m14425a();
        }
        if ((i9 & 2) != 0) {
            z9 = false;
        }
        c9037n.m14424x(uri, z9, function1);
    }

    /* renamed from: z */
    public static final Unit m14416z(final C9037n c9037n, final Uri uri, final boolean z9, final EzyCropTheme ezyCropTheme, final Function1 function1) {
        c9037n.f15210e = new Function1() { // from class: m7.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C9037n.m14396A(z9, c9037n, uri, ezyCropTheme, function1, ((Boolean) obj).booleanValue());
            }
        };
        c9037n.f15211f.launch(uri);
        return Unit.INSTANCE;
    }

    /* renamed from: l */
    public final void m14417l(Function0 function0) {
        this.f15216k = function0;
        this.f15217l.launch("android.permission.CAMERA");
    }

    /* renamed from: p */
    public final ActivityResultLauncher m14418p(ActivityResultContract activityResultContract, ActivityResultCallback activityResultCallback) {
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult;
        Fragment fragment = this.f15206a;
        if (fragment != null && (activityResultLauncherRegisterForActivityResult = fragment.registerForActivityResult(activityResultContract, activityResultCallback)) != null) {
            return activityResultLauncherRegisterForActivityResult;
        }
        ComponentActivity componentActivity = this.f15207b;
        componentActivity.getClass();
        return componentActivity.registerForActivityResult(activityResultContract, activityResultCallback);
    }

    /* renamed from: q */
    public final void m14419q(Uri uri, EzyCropTheme cropTheme, final Function1 successCallback) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(cropTheme, "cropTheme");
        Intrinsics.checkNotNullParameter(successCallback, "successCallback");
        this.f15214i = new Function1() { // from class: m7.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C9037n.m14413s(successCallback, (Uri) obj);
            }
        };
        this.f15215j.launch(new C8900d(uri, this.f15218m, cropTheme));
    }

    /* renamed from: r */
    public final void m14420r(Uri uri, Function1 successCallback) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(successCallback, "successCallback");
        m14419q(uri, EzyCropTheme.f12909a, successCallback);
    }

    /* renamed from: t */
    public final void m14421t(final boolean z9, final EzyCropTheme cropTheme, final Function1 successCallback) {
        Intrinsics.checkNotNullParameter(cropTheme, "cropTheme");
        Intrinsics.checkNotNullParameter(successCallback, "successCallback");
        this.f15212g = new Function1() { // from class: m7.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C9037n.m14414v(z9, this, cropTheme, successCallback, (Uri) obj);
            }
        };
        this.f15213h.launch(new PickVisualMediaRequest.Builder().setMediaType(ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE).build());
    }

    /* renamed from: u */
    public final void m14422u(boolean z9, Function1 successCallback) {
        Intrinsics.checkNotNullParameter(successCallback, "successCallback");
        m14421t(z9, EzyCropTheme.f12909a, successCallback);
    }

    /* renamed from: w */
    public final void m14423w(final Uri uri, final boolean z9, final EzyCropTheme cropTheme, final Function1 successCallback) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(cropTheme, "cropTheme");
        Intrinsics.checkNotNullParameter(successCallback, "successCallback");
        m14417l(new Function0() { // from class: m7.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C9037n.m14416z(this.f15189a, uri, z9, cropTheme, successCallback);
            }
        });
    }

    /* renamed from: x */
    public final void m14424x(Uri uri, boolean z9, Function1 successCallback) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(successCallback, "successCallback");
        m14423w(uri, z9, EzyCropTheme.f12909a, successCallback);
    }

    public /* synthetic */ C9037n(Fragment fragment, ComponentActivity componentActivity, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? null : fragment, (i9 & 2) != 0 ? null : componentActivity);
    }
}
