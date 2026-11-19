package p007a6;

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
import com.blankj.utilcode.util.AbstractC5364g0;
import com.blankj.utilcode.util.AbstractC5366h0;
import com.blankj.utilcode.util.AbstractC5371k;
import com.blankj.utilcode.util.ToastUtils;
import com.canhub.cropper.CropImageOptions;
import com.zykj.view.R$color;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p320z5.C10724d;

/* renamed from: a6.l */
/* loaded from: classes5.dex */
public final class C0038l {

    /* renamed from: a */
    public final Fragment f96a;

    /* renamed from: b */
    public final ComponentActivity f97b;

    /* renamed from: c */
    public InterfaceC10570l f98c;

    /* renamed from: d */
    public final ActivityResultLauncher f99d;

    /* renamed from: e */
    public InterfaceC10570l f100e;

    /* renamed from: f */
    public final ActivityResultLauncher f101f;

    /* renamed from: g */
    public InterfaceC10570l f102g;

    /* renamed from: h */
    public final ActivityResultLauncher f103h;

    /* renamed from: i */
    public InterfaceC10570l f104i;

    /* renamed from: j */
    public final ActivityResultLauncher f105j;

    /* renamed from: k */
    public InterfaceC10559a f106k;

    /* renamed from: l */
    public final ActivityResultLauncher f107l;

    /* renamed from: m */
    public final CropImageOptions f108m;

    public C0038l(Fragment fragment, ComponentActivity componentActivity) {
        this.f96a = fragment;
        this.f97b = componentActivity;
        this.f99d = m92q(new ActivityResultContract<Uri, Uri>() { // from class: com.zykj.view.ui.camera.EzyCameraContract$StartCameraForResult
            @Override // androidx.activity.result.contract.ActivityResultContract
            public Intent createIntent(Context context, Uri input) {
                AbstractC9133u.m16133g(context, "context");
                AbstractC9133u.m16133g(input, "input");
                Intent intent = new Intent(context, (Class<?>) EzyCameraActivity.class);
                intent.putExtra("Uri", input);
                return intent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.activity.result.contract.ActivityResultContract
            public Uri parseResult(int i10, Intent intent) {
                if (i10 == -1 && intent != null) {
                    return (Uri) intent.getParcelableExtra("ResultUri");
                }
                return null;
            }
        }, new ActivityResultCallback() { // from class: a6.b
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                C0038l.m80k(this.f77a, (Uri) obj);
            }
        });
        this.f101f = m92q(new ActivityResultContracts.TakePicture(), new ActivityResultCallback() { // from class: a6.c
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                C0038l.m69A(this.f78a, ((Boolean) obj).booleanValue());
            }
        });
        this.f103h = m92q(new ActivityResultContracts.PickVisualMedia(), new ActivityResultCallback() { // from class: a6.d
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                C0038l.m82n(this.f79a, (Uri) obj);
            }
        });
        this.f105j = m92q(new ActivityResultContract<C10724d, Uri>() { // from class: com.zykj.view.ui.crop.EzyCropContract$StartCropForResult
            @Override // androidx.activity.result.contract.ActivityResultContract
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Intent createIntent(Context context, C10724d input) {
                AbstractC9133u.m16133g(context, "context");
                AbstractC9133u.m16133g(input, "input");
                Intent intent = new Intent(context, (Class<?>) EzyCropActivity.class);
                intent.putExtra("Uri", input.m20024b());
                intent.putExtra("CropImageOptions", input.m20023a());
                return intent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.activity.result.contract.ActivityResultContract
            public Uri parseResult(int i10, Intent intent) {
                if (i10 == -1 && intent != null) {
                    return (Uri) intent.getParcelableExtra("ResultUri");
                }
                return null;
            }
        }, new ActivityResultCallback() { // from class: a6.e
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                C0038l.m81m(this.f80a, (Uri) obj);
            }
        });
        this.f107l = m92q(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback() { // from class: a6.f
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                C0038l.m83p(this.f81a, ((Boolean) obj).booleanValue());
            }
        });
        CropImageOptions cropImageOptions = new CropImageOptions(false, false, null, null, 0.0f, 0.0f, 0.0f, null, null, false, false, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, -1, -1, 63, null);
        cropImageOptions.f3429n = true;
        cropImageOptions.f3431o = true;
        cropImageOptions.f3448x = AbstractC5366h0.m2478a().getColor(R$color.colorPrimary);
        cropImageOptions.f3382B = AbstractC5366h0.m2478a().getColor(R$color.colorPrimary);
        cropImageOptions.f3427m = AbstractC5366h0.m2478a().getColor(R$color.colorPrimary);
        cropImageOptions.f3439s = 0.1f;
        this.f108m = cropImageOptions;
    }

    /* renamed from: A */
    public static final void m69A(C0038l c0038l, boolean z10) {
        InterfaceC10570l interfaceC10570l = c0038l.f100e;
        if (interfaceC10570l != null) {
            interfaceC10570l.invoke(Boolean.valueOf(z10));
        }
        c0038l.f100e = null;
    }

    /* renamed from: k */
    public static final void m80k(C0038l c0038l, Uri uri) {
        InterfaceC10570l interfaceC10570l = c0038l.f98c;
        if (interfaceC10570l != null) {
            interfaceC10570l.invoke(uri);
        }
        c0038l.f98c = null;
    }

    /* renamed from: m */
    public static final void m81m(C0038l c0038l, Uri uri) {
        InterfaceC10570l interfaceC10570l = c0038l.f104i;
        if (interfaceC10570l != null) {
            interfaceC10570l.invoke(uri);
        }
        c0038l.f104i = null;
    }

    /* renamed from: n */
    public static final void m82n(C0038l c0038l, Uri uri) {
        InterfaceC10570l interfaceC10570l = c0038l.f102g;
        if (interfaceC10570l != null) {
            interfaceC10570l.invoke(uri);
        }
        c0038l.f102g = null;
    }

    /* renamed from: p */
    public static final void m83p(C0038l c0038l, boolean z10) {
        if (!z10) {
            ToastUtils.m2403s("权限未获取成功", new Object[0]);
            return;
        }
        InterfaceC10559a interfaceC10559a = c0038l.f106k;
        if (interfaceC10559a != null) {
            interfaceC10559a.invoke();
        }
        c0038l.f106k = null;
    }

    /* renamed from: s */
    public static final C8736p m84s(InterfaceC10570l interfaceC10570l, Uri uri) {
        interfaceC10570l.invoke(uri);
        return C8736p.f16368a;
    }

    /* renamed from: u */
    public static final C8736p m85u(boolean z10, C0038l c0038l, InterfaceC10570l interfaceC10570l, Uri uri) {
        if (!z10 || uri == null) {
            interfaceC10570l.invoke(uri);
        } else {
            c0038l.m93r(uri, interfaceC10570l);
        }
        return C8736p.f16368a;
    }

    /* renamed from: w */
    public static /* synthetic */ void m86w(C0038l c0038l, Uri uri, boolean z10, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            uri = AbstractC0039m.m96a();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        c0038l.m95v(uri, z10, interfaceC10570l);
    }

    /* renamed from: x */
    public static final C8736p m87x(final C0038l c0038l, final Uri uri, final boolean z10, final InterfaceC10570l interfaceC10570l) {
        c0038l.f100e = new InterfaceC10570l() { // from class: a6.i
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return C0038l.m88y(z10, c0038l, uri, interfaceC10570l, ((Boolean) obj).booleanValue());
            }
        };
        c0038l.f101f.launch(uri);
        return C8736p.f16368a;
    }

    /* renamed from: y */
    public static final C8736p m88y(boolean z10, C0038l c0038l, final Uri uri, final InterfaceC10570l interfaceC10570l, boolean z11) {
        if (!z10) {
            interfaceC10570l.invoke(uri);
        } else if (z11) {
            c0038l.m93r(uri, new InterfaceC10570l() { // from class: a6.k
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj) {
                    return C0038l.m89z(uri, interfaceC10570l, (Uri) obj);
                }
            });
        } else {
            interfaceC10570l.invoke(null);
        }
        return C8736p.f16368a;
    }

    /* renamed from: z */
    public static final C8736p m89z(Uri uri, InterfaceC10570l interfaceC10570l, Uri uri2) {
        AbstractC5371k.m2522d(AbstractC5364g0.m2473f(uri));
        interfaceC10570l.invoke(uri2);
        return C8736p.f16368a;
    }

    /* renamed from: l */
    public final void m90l(InterfaceC10559a interfaceC10559a) {
        this.f106k = interfaceC10559a;
        this.f107l.launch("android.permission.CAMERA");
    }

    /* renamed from: o */
    public final CropImageOptions m91o() {
        return this.f108m;
    }

    /* renamed from: q */
    public final ActivityResultLauncher m92q(ActivityResultContract activityResultContract, ActivityResultCallback activityResultCallback) {
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult;
        Fragment fragment = this.f96a;
        if (fragment != null && (activityResultLauncherRegisterForActivityResult = fragment.registerForActivityResult(activityResultContract, activityResultCallback)) != null) {
            return activityResultLauncherRegisterForActivityResult;
        }
        ComponentActivity componentActivity = this.f97b;
        componentActivity.getClass();
        return componentActivity.registerForActivityResult(activityResultContract, activityResultCallback);
    }

    /* renamed from: r */
    public final void m93r(Uri uri, final InterfaceC10570l successCallback) {
        AbstractC9133u.m16133g(uri, "uri");
        AbstractC9133u.m16133g(successCallback, "successCallback");
        this.f104i = new InterfaceC10570l() { // from class: a6.h
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return C0038l.m84s(successCallback, (Uri) obj);
            }
        };
        this.f105j.launch(new C10724d(uri, this.f108m));
    }

    /* renamed from: t */
    public final void m94t(final boolean z10, final InterfaceC10570l successCallback) {
        AbstractC9133u.m16133g(successCallback, "successCallback");
        this.f102g = new InterfaceC10570l() { // from class: a6.j
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return C0038l.m85u(z10, this, successCallback, (Uri) obj);
            }
        };
        this.f103h.launch(new PickVisualMediaRequest.Builder().setMediaType(ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE).build());
    }

    /* renamed from: v */
    public final void m95v(final Uri uri, final boolean z10, final InterfaceC10570l successCallback) {
        AbstractC9133u.m16133g(uri, "uri");
        AbstractC9133u.m16133g(successCallback, "successCallback");
        m90l(new InterfaceC10559a() { // from class: a6.g
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return C0038l.m87x(this.f82a, uri, z10, successCallback);
            }
        });
    }

    public /* synthetic */ C0038l(Fragment fragment, ComponentActivity componentActivity, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? null : fragment, (i10 & 2) != 0 ? null : componentActivity);
    }
}
