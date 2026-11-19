package p378vb;

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
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p363ub.C11380d;

/* renamed from: vb.l */
/* loaded from: classes6.dex */
public final class C11582l {

    /* renamed from: a */
    public final Fragment f27475a;

    /* renamed from: b */
    public final ComponentActivity f27476b;

    /* renamed from: c */
    public InterfaceC9540l f27477c;

    /* renamed from: d */
    public final ActivityResultLauncher f27478d;

    /* renamed from: e */
    public InterfaceC9540l f27479e;

    /* renamed from: f */
    public final ActivityResultLauncher f27480f;

    /* renamed from: g */
    public InterfaceC9540l f27481g;

    /* renamed from: h */
    public final ActivityResultLauncher f27482h;

    /* renamed from: i */
    public InterfaceC9540l f27483i;

    /* renamed from: j */
    public final ActivityResultLauncher f27484j;

    /* renamed from: k */
    public InterfaceC9529a f27485k;

    /* renamed from: l */
    public final ActivityResultLauncher f27486l;

    /* renamed from: m */
    public final CropImageOptions f27487m;

    public C11582l(Fragment fragment, ComponentActivity componentActivity) {
        this.f27475a = fragment;
        this.f27476b = componentActivity;
        this.f27478d = m25499p(new ActivityResultContract<Uri, Uri>() { // from class: com.zykj.view.ui.camera.EzyCameraContract$StartCameraForResult
            @Override // androidx.activity.result.contract.ActivityResultContract
            public Intent createIntent(Context context, Uri input) {
                AbstractC9979u.m20294g(context, "context");
                AbstractC9979u.m20294g(input, "input");
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
        }, new ActivityResultCallback() { // from class: vb.b
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                C11582l.m25487k(this.f27456a, (Uri) obj);
            }
        });
        this.f27480f = m25499p(new ActivityResultContracts.TakePicture(), new ActivityResultCallback() { // from class: vb.c
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                C11582l.m25497z(this.f27457a, ((Boolean) obj).booleanValue());
            }
        });
        this.f27482h = m25499p(new ActivityResultContracts.PickVisualMedia(), new ActivityResultCallback() { // from class: vb.d
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                C11582l.m25489n(this.f27458a, (Uri) obj);
            }
        });
        this.f27484j = m25499p(new ActivityResultContract<C11380d, Uri>() { // from class: com.zykj.view.ui.crop.EzyCropContract$StartCropForResult
            @Override // androidx.activity.result.contract.ActivityResultContract
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Intent createIntent(Context context, C11380d input) {
                AbstractC9979u.m20294g(context, "context");
                AbstractC9979u.m20294g(input, "input");
                Intent intent = new Intent(context, (Class<?>) EzyCropActivity.class);
                intent.putExtra("Uri", input.m25326b());
                intent.putExtra("CropImageOptions", input.m25325a());
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
        }, new ActivityResultCallback() { // from class: vb.e
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                C11582l.m25488m(this.f27459a, (Uri) obj);
            }
        });
        this.f27486l = m25499p(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback() { // from class: vb.f
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                C11582l.m25490o(this.f27460a, ((Boolean) obj).booleanValue());
            }
        });
        CropImageOptions cropImageOptions = new CropImageOptions(false, false, null, null, 0.0f, 0.0f, 0.0f, null, null, false, false, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, -1, -1, 63, null);
        cropImageOptions.f5201p = true;
        cropImageOptions.f5203q = true;
        cropImageOptions.f5220z = Utils.getApp().getColor(R$color.colorPrimary);
        cropImageOptions.f5154D = Utils.getApp().getColor(R$color.colorPrimary);
        cropImageOptions.f5199o = Utils.getApp().getColor(R$color.colorPrimary);
        cropImageOptions.f5211u = 0.1f;
        this.f27487m = cropImageOptions;
    }

    /* renamed from: k */
    public static final void m25487k(C11582l c11582l, Uri uri) {
        InterfaceC9540l interfaceC9540l = c11582l.f27477c;
        if (interfaceC9540l != null) {
            interfaceC9540l.invoke(uri);
        }
        c11582l.f27477c = null;
    }

    /* renamed from: m */
    public static final void m25488m(C11582l c11582l, Uri uri) {
        InterfaceC9540l interfaceC9540l = c11582l.f27483i;
        if (interfaceC9540l != null) {
            interfaceC9540l.invoke(uri);
        }
        c11582l.f27483i = null;
    }

    /* renamed from: n */
    public static final void m25489n(C11582l c11582l, Uri uri) {
        InterfaceC9540l interfaceC9540l = c11582l.f27481g;
        if (interfaceC9540l != null) {
            interfaceC9540l.invoke(uri);
        }
        c11582l.f27481g = null;
    }

    /* renamed from: o */
    public static final void m25490o(C11582l c11582l, boolean z10) {
        if (!z10) {
            ToastUtils.showShort("权限未获取成功", new Object[0]);
            return;
        }
        InterfaceC9529a interfaceC9529a = c11582l.f27485k;
        if (interfaceC9529a != null) {
            interfaceC9529a.invoke();
        }
        c11582l.f27485k = null;
    }

    /* renamed from: r */
    public static final C10786q m25491r(InterfaceC9540l interfaceC9540l, Uri uri) {
        interfaceC9540l.invoke(uri);
        return C10786q.f26013a;
    }

    /* renamed from: t */
    public static final C10786q m25492t(boolean z10, C11582l c11582l, InterfaceC9540l interfaceC9540l, Uri uri) {
        if (!z10 || uri == null) {
            interfaceC9540l.invoke(uri);
        } else {
            c11582l.m25500q(uri, interfaceC9540l);
        }
        return C10786q.f26013a;
    }

    /* renamed from: v */
    public static /* synthetic */ void m25493v(C11582l c11582l, Uri uri, boolean z10, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            uri = AbstractC11583m.m25503a();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        c11582l.m25502u(uri, z10, interfaceC9540l);
    }

    /* renamed from: w */
    public static final C10786q m25494w(final C11582l c11582l, final Uri uri, final boolean z10, final InterfaceC9540l interfaceC9540l) {
        c11582l.f27479e = new InterfaceC9540l() { // from class: vb.h
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return C11582l.m25495x(z10, c11582l, uri, interfaceC9540l, ((Boolean) obj).booleanValue());
            }
        };
        c11582l.f27480f.launch(uri);
        return C10786q.f26013a;
    }

    /* renamed from: x */
    public static final C10786q m25495x(boolean z10, C11582l c11582l, final Uri uri, final InterfaceC9540l interfaceC9540l, boolean z11) {
        if (!z10) {
            interfaceC9540l.invoke(uri);
        } else if (z11) {
            c11582l.m25500q(uri, new InterfaceC9540l() { // from class: vb.k
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return C11582l.m25496y(uri, interfaceC9540l, (Uri) obj);
                }
            });
        } else {
            interfaceC9540l.invoke(null);
        }
        return C10786q.f26013a;
    }

    /* renamed from: y */
    public static final C10786q m25496y(Uri uri, InterfaceC9540l interfaceC9540l, Uri uri2) {
        FileUtils.delete(UriUtils.uri2FileNoCacheCopy(uri));
        interfaceC9540l.invoke(uri2);
        return C10786q.f26013a;
    }

    /* renamed from: z */
    public static final void m25497z(C11582l c11582l, boolean z10) {
        InterfaceC9540l interfaceC9540l = c11582l.f27479e;
        if (interfaceC9540l != null) {
            interfaceC9540l.invoke(Boolean.valueOf(z10));
        }
        c11582l.f27479e = null;
    }

    /* renamed from: l */
    public final void m25498l(InterfaceC9529a interfaceC9529a) {
        this.f27485k = interfaceC9529a;
        this.f27486l.launch("android.permission.CAMERA");
    }

    /* renamed from: p */
    public final ActivityResultLauncher m25499p(ActivityResultContract activityResultContract, ActivityResultCallback activityResultCallback) {
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult;
        Fragment fragment = this.f27475a;
        if (fragment != null && (activityResultLauncherRegisterForActivityResult = fragment.registerForActivityResult(activityResultContract, activityResultCallback)) != null) {
            return activityResultLauncherRegisterForActivityResult;
        }
        ComponentActivity componentActivity = this.f27476b;
        componentActivity.getClass();
        return componentActivity.registerForActivityResult(activityResultContract, activityResultCallback);
    }

    /* renamed from: q */
    public final void m25500q(Uri uri, final InterfaceC9540l successCallback) {
        AbstractC9979u.m20294g(uri, "uri");
        AbstractC9979u.m20294g(successCallback, "successCallback");
        this.f27483i = new InterfaceC9540l() { // from class: vb.j
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return C11582l.m25491r(successCallback, (Uri) obj);
            }
        };
        this.f27484j.launch(new C11380d(uri, this.f27487m));
    }

    /* renamed from: s */
    public final void m25501s(final boolean z10, final InterfaceC9540l successCallback) {
        AbstractC9979u.m20294g(successCallback, "successCallback");
        this.f27481g = new InterfaceC9540l() { // from class: vb.i
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return C11582l.m25492t(z10, this, successCallback, (Uri) obj);
            }
        };
        this.f27482h.launch(new PickVisualMediaRequest.Builder().setMediaType(ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE).build());
    }

    /* renamed from: u */
    public final void m25502u(final Uri uri, final boolean z10, final InterfaceC9540l successCallback) {
        AbstractC9979u.m20294g(uri, "uri");
        AbstractC9979u.m20294g(successCallback, "successCallback");
        m25498l(new InterfaceC9529a() { // from class: vb.g
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return C11582l.m25494w(this.f27461c, uri, z10, successCallback);
            }
        });
    }

    public /* synthetic */ C11582l(Fragment fragment, ComponentActivity componentActivity, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? null : fragment, (i10 & 2) != 0 ? null : componentActivity);
    }
}
