package androidx.camera.core.impl;

import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.result.ActivityResult;
import android.view.result.ActivityResultCallback;
import androidx.camera.video.internal.audio.AudioSource;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import androidx.navigation.C2856d;
import androidx.navigation.internal.C2865d;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.canhub.cropper.C3448s;
import com.canhub.cropper.CropImageActivity;
import com.canhub.cropper.CropImageView;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.carousel.MaskableFrameLayout;
import com.google.android.material.navigation.NavigationView;
import com.google.gson.internal.AbstractC3862s;
import com.google.gson.internal.InterfaceC3854k;
import com.zykj.mistake.fragment.MistakeCollectionLegacyFragment;
import com.zykj.mistake.network.C5088a;
import com.zykj.mistake.presenter.MainPresenter;
import com.zykj.mistake.utils.C5102g;
import com.zykj.view.p037ui.camera.ImagePickFragment;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC5830k;
import p021b5.C3189a;
import p078i1.AbstractC5673c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p168t5.InterfaceC6599c;
import p177u6.InterfaceC6622a;
import p177u6.InterfaceC6623b;
import p185v7.AbstractC6675d;

/* renamed from: androidx.camera.core.impl.d */
/* loaded from: classes.dex */
public final /* synthetic */ class C0362d implements CallbackToFutureAdapter.Resolver, InputConnectionCompat.OnCommitContentListener, InterfaceC6622a, InterfaceC6623b, ActivityResultCallback, AccessibilityViewCommand, CanvasCompat.CanvasOperation, InterfaceC3854k, InterfaceC6599c, SwipeRefreshLayout.OnRefreshListener {

    /* renamed from: a */
    public final /* synthetic */ int f445a;

    /* renamed from: b */
    public final /* synthetic */ Object f446b;

    public /* synthetic */ C0362d(Object obj, int i) {
        this.f445a = i;
        this.f446b = obj;
    }

    @Override // com.google.gson.internal.InterfaceC3854k
    /* renamed from: a */
    public Object mo671a() {
        int i = this.f445a;
        Object obj = this.f446b;
        switch (i) {
            case 10:
                Constructor constructor = (Constructor) obj;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e) {
                    AbstractC6675d abstractC6675d = AbstractC5673c.f8842a;
                    throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
                } catch (InstantiationException e4) {
                    throw new RuntimeException("Failed to invoke constructor '" + AbstractC5673c.m5006b(constructor) + "' with no args", e4);
                } catch (InvocationTargetException e8) {
                    throw new RuntimeException("Failed to invoke constructor '" + AbstractC5673c.m5006b(constructor) + "' with no args", e8.getCause());
                }
            default:
                Class cls = (Class) obj;
                try {
                    return AbstractC3862s.f3055a.mo2815a(cls);
                } catch (Exception e9) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e9);
                }
        }
    }

    @Override // p168t5.InterfaceC6599c
    public void accept(Object obj) {
        ((C2856d) this.f446b).invoke(obj);
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f445a) {
            case 0:
                return ((CameraRepository) this.f446b).lambda$deinit$0(completer);
            case 1:
                return ((LiveDataObservable) this.f446b).lambda$fetchData$1(completer);
            default:
                return ((AudioSource) this.f446b).lambda$release$5(completer);
        }
    }

    /* renamed from: b */
    public Object m672b(Object p0) {
        C2865d c2865d = (C2865d) this.f446b;
        AbstractC5830k.m5330g(p0, "p0");
        return (File) c2865d.invoke(p0);
    }

    @Override // android.view.result.ActivityResultCallback
    public void onActivityResult(Object obj) {
        Uri data;
        switch (this.f445a) {
            case 6:
                C3448s c3448s = (C3448s) this.f446b;
                ActivityResult activityRes = (ActivityResult) obj;
                CropImageActivity cropImageActivity = (CropImageActivity) c3448s.f2625a.f10022b;
                AbstractC5830k.m5330g(activityRes, "activityRes");
                if (activityRes.getResultCode() != -1) {
                    cropImageActivity.m2435q();
                    break;
                } else {
                    Intent data2 = activityRes.getData();
                    if (data2 == null || (data = data2.getData()) == null) {
                        data = c3448s.f2628d;
                    }
                    if (data != null) {
                        cropImageActivity.f2362a = data;
                        CropImageView cropImageView = cropImageActivity.f2364c;
                        if (cropImageView != null) {
                            cropImageView.setImageUriAsync(data);
                            break;
                        }
                    } else {
                        cropImageActivity.m2435q();
                        break;
                    }
                }
                break;
            case 12:
                C5102g c5102g = (C5102g) this.f446b;
                ActivityResult result = (ActivityResult) obj;
                AbstractC5830k.m5330g(result, "result");
                if (result.getResultCode() == -1) {
                    Intent data3 = result.getData();
                    if (data3 != null ? data3.getBooleanExtra("KEY_WANT_CAMERA", false) : false) {
                        InterfaceC6469a interfaceC6469a = c5102g.f8041b;
                        if (interfaceC6469a != null) {
                            interfaceC6469a.invoke();
                        }
                    } else {
                        Intent data4 = result.getData();
                        Uri data5 = data4 != null ? data4.getData() : null;
                        if (data5 != null) {
                            Log.d("GalleryLauncher", "获取到的uri是: " + data5);
                            InterfaceC6471c interfaceC6471c = c5102g.f8042c;
                            if (interfaceC6471c != null) {
                                interfaceC6471c.invoke(data5);
                            }
                        }
                    }
                }
                c5102g.f8041b = null;
                c5102g.f8042c = null;
                break;
            default:
                ImagePickFragment.requestPermissionLauncher$lambda$0((ImagePickFragment) this.f446b, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener
    public boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle) {
        return InputConnectionCompat.lambda$createOnCommitContentListenerUsingPerformReceiveContent$0((View) this.f446b, inputContentInfoCompat, i, bundle);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        MainPresenter mainPresenter = (MainPresenter) ((MistakeCollectionLegacyFragment) this.f446b).m3966h();
        mainPresenter.m3969a(C5088a.m4381b().m4398p(), new C3189a(mainPresenter, 1));
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        return ((BottomSheetDragHandleView) this.f446b).lambda$onBottomSheetStateChanged$0(view, commandArguments);
    }

    @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
    public void run(Canvas canvas) {
        switch (this.f445a) {
            case 8:
                ((MaskableFrameLayout) this.f446b).lambda$dispatchDraw$1(canvas);
                break;
            default:
                ((NavigationView) this.f446b).lambda$dispatchDraw$0(canvas);
                break;
        }
    }
}
