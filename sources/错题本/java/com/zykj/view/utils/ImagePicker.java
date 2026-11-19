package com.zykj.view.utils;

import android.net.Uri;
import android.view.ComponentActivity;
import android.view.result.ActivityResultCallback;
import android.view.result.ActivityResultLauncher;
import android.view.result.PickVisualMediaRequest;
import android.view.result.contract.ActivityResultContract;
import android.view.result.contract.ActivityResultContracts;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.blankj.utilcode.util.AbstractC3382c;
import com.blankj.utilcode.util.AbstractC3385e;
import com.blankj.utilcode.util.C3404x;
import com.canhub.cropper.CropImageOptions;
import com.zykj.mistake.feature.notebook.detail.C4838m4;
import com.zykj.view.C5280R;
import com.zykj.view.p037ui.camera.EzyCameraContract;
import com.zykj.view.p037ui.crop.EzyCropContract;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007JC\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u001b\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00120\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ7\u0010\u001d\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00120\u001a¢\u0006\u0004\b\u001d\u0010\u001cJ-\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00120\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010 \u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00120\u001a¢\u0006\u0004\b \u0010!R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R&\u0010$\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R$\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010'R&\u0010*\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010%R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010'R&\u0010-\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010%R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010'R\u001e\u00100\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010'R\u0017\u00105\u001a\u0002048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u00069"}, m5110d2 = {"Lcom/zykj/view/utils/ImagePicker;", "", "Landroidx/fragment/app/Fragment;", "fragment", "Landroidx/activity/ComponentActivity;", "activity", "<init>", "(Landroidx/fragment/app/Fragment;Landroidx/activity/ComponentActivity;)V", "I", "O", "Landroidx/activity/result/contract/ActivityResultContract;", "contract", "Landroidx/activity/result/ActivityResultCallback;", "callback", "Landroidx/activity/result/ActivityResultLauncher;", "registerForActivityResult", "(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;", "Lkotlin/Function0;", "Ld6/s;", "successCallback", "checkCameraPermission", "(Lr6/a;)V", "Landroid/net/Uri;", "uri", "", "needCrop", "Lkotlin/Function1;", "startCapture", "(Landroid/net/Uri;ZLr6/c;)V", "startSystemCamera", "startGallery", "(ZLr6/c;)V", "startCrop", "(Landroid/net/Uri;Lr6/c;)V", "Landroidx/fragment/app/Fragment;", "Landroidx/activity/ComponentActivity;", "tempCameraCallback", "Lr6/c;", "cameraLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "tempSystemCameraCallback", "systemCameraLauncher", "tempGalleryCallback", "Landroidx/activity/result/PickVisualMediaRequest;", "galleryLauncher", "tempCropForImageCallback", "Lcom/zykj/view/ui/crop/EzyCropContract$CropRequestOptions;", "cropForImageLauncher", "tempPermissionCallback", "Lr6/a;", "", "permissionLauncher", "Lcom/canhub/cropper/CropImageOptions;", "cropImageOptions", "Lcom/canhub/cropper/CropImageOptions;", "getCropImageOptions", "()Lcom/canhub/cropper/CropImageOptions;", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class ImagePicker {

    @Nullable
    private final ComponentActivity activity;

    @NotNull
    private final ActivityResultLauncher<Uri> cameraLauncher;

    @NotNull
    private final ActivityResultLauncher<EzyCropContract.CropRequestOptions> cropForImageLauncher;

    @NotNull
    private final CropImageOptions cropImageOptions;

    @Nullable
    private final Fragment fragment;

    @NotNull
    private final ActivityResultLauncher<PickVisualMediaRequest> galleryLauncher;

    @NotNull
    private final ActivityResultLauncher<String> permissionLauncher;

    @NotNull
    private final ActivityResultLauncher<Uri> systemCameraLauncher;

    @Nullable
    private InterfaceC6471c tempCameraCallback;

    @Nullable
    private InterfaceC6471c tempCropForImageCallback;

    @Nullable
    private InterfaceC6471c tempGalleryCallback;

    @Nullable
    private InterfaceC6469a tempPermissionCallback;

    @Nullable
    private InterfaceC6471c tempSystemCameraCallback;

    /* JADX WARN: Multi-variable type inference failed */
    public ImagePicker() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cameraLauncher$lambda$0(ImagePicker imagePicker, Uri uri) {
        InterfaceC6471c interfaceC6471c = imagePicker.tempCameraCallback;
        if (interfaceC6471c != null) {
            interfaceC6471c.invoke(uri);
        }
        imagePicker.tempCameraCallback = null;
    }

    private final void checkCameraPermission(InterfaceC6469a successCallback) {
        this.tempPermissionCallback = successCallback;
        this.permissionLauncher.launch("android.permission.CAMERA");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cropForImageLauncher$lambda$3(ImagePicker imagePicker, Uri uri) {
        InterfaceC6471c interfaceC6471c = imagePicker.tempCropForImageCallback;
        if (interfaceC6471c != null) {
            interfaceC6471c.invoke(uri);
        }
        imagePicker.tempCropForImageCallback = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void galleryLauncher$lambda$2(ImagePicker imagePicker, Uri uri) {
        InterfaceC6471c interfaceC6471c = imagePicker.tempGalleryCallback;
        if (interfaceC6471c != null) {
            interfaceC6471c.invoke(uri);
        }
        imagePicker.tempGalleryCallback = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void permissionLauncher$lambda$4(ImagePicker imagePicker, boolean z8) {
        if (!z8) {
            C3404x.m2356a("权限未获取成功", new Object[0]);
            return;
        }
        InterfaceC6469a interfaceC6469a = imagePicker.tempPermissionCallback;
        if (interfaceC6469a != null) {
            interfaceC6469a.invoke();
        }
        imagePicker.tempPermissionCallback = null;
    }

    private final <I, O> ActivityResultLauncher<I> registerForActivityResult(ActivityResultContract<I, O> contract, ActivityResultCallback<O> callback) {
        ActivityResultLauncher<I> activityResultLauncherRegisterForActivityResult;
        Fragment fragment = this.fragment;
        if (fragment != null && (activityResultLauncherRegisterForActivityResult = fragment.registerForActivityResult(contract, callback)) != null) {
            return activityResultLauncherRegisterForActivityResult;
        }
        ComponentActivity componentActivity = this.activity;
        componentActivity.getClass();
        return componentActivity.registerForActivityResult(contract, callback);
    }

    public static /* synthetic */ void startCapture$default(ImagePicker imagePicker, Uri uri, boolean z8, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 1) != 0) {
            uri = ImagePickerKt.getRandomUri();
        }
        if ((i & 2) != 0) {
            z8 = false;
        }
        imagePicker.startCapture(uri, z8, interfaceC6471c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s startCapture$lambda$8(ImagePicker imagePicker, Uri uri, boolean z8, InterfaceC6471c interfaceC6471c) {
        imagePicker.tempCameraCallback = new C5388d(z8, imagePicker, interfaceC6471c, 1);
        imagePicker.cameraLauncher.launch(uri);
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s startCapture$lambda$8$lambda$7(boolean z8, ImagePicker imagePicker, InterfaceC6471c interfaceC6471c, Uri uri) {
        if (!z8 || uri == null) {
            interfaceC6471c.invoke(uri);
        } else {
            imagePicker.startCrop(uri, new C5387c(uri, interfaceC6471c, 0));
        }
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s startCapture$lambda$8$lambda$7$lambda$6(Uri uri, InterfaceC6471c interfaceC6471c, Uri uri2) {
        AbstractC3385e.m2333e(uri == null ? null : AbstractC3382c.m2318s(uri));
        interfaceC6471c.invoke(uri2);
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s startCrop$lambda$13(InterfaceC6471c interfaceC6471c, Uri uri) {
        interfaceC6471c.invoke(uri);
        return C5443s.f8405a;
    }

    public static /* synthetic */ void startGallery$default(ImagePicker imagePicker, boolean z8, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 1) != 0) {
            z8 = false;
        }
        imagePicker.startGallery(z8, interfaceC6471c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s startGallery$lambda$12(boolean z8, ImagePicker imagePicker, InterfaceC6471c interfaceC6471c, Uri uri) {
        if (!z8 || uri == null) {
            interfaceC6471c.invoke(uri);
        } else {
            imagePicker.startCrop(uri, interfaceC6471c);
        }
        return C5443s.f8405a;
    }

    public static /* synthetic */ void startSystemCamera$default(ImagePicker imagePicker, Uri uri, boolean z8, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 1) != 0) {
            uri = ImagePickerKt.getRandomUri();
        }
        if ((i & 2) != 0) {
            z8 = false;
        }
        imagePicker.startSystemCamera(uri, z8, interfaceC6471c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s startSystemCamera$lambda$11(final ImagePicker imagePicker, final Uri uri, final boolean z8, final InterfaceC6471c interfaceC6471c) {
        imagePicker.tempSystemCameraCallback = new InterfaceC6471c(imagePicker) { // from class: com.zykj.view.utils.a

            /* renamed from: b */
            public final /* synthetic */ ImagePicker f8326b;

            {
                this.f8326b = imagePicker;
            }

            @Override // p152r6.InterfaceC6471c
            public final Object invoke(Object obj) {
                return ImagePicker.startSystemCamera$lambda$11$lambda$10(z8, this.f8326b, uri, interfaceC6471c, ((Boolean) obj).booleanValue());
            }
        };
        imagePicker.systemCameraLauncher.launch(uri);
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s startSystemCamera$lambda$11$lambda$10(boolean z8, ImagePicker imagePicker, Uri uri, InterfaceC6471c interfaceC6471c, boolean z9) {
        if (!z8) {
            interfaceC6471c.invoke(uri);
        } else if (z9) {
            imagePicker.startCrop(uri, new C5387c(uri, interfaceC6471c, 1));
        } else {
            interfaceC6471c.invoke(null);
        }
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s startSystemCamera$lambda$11$lambda$10$lambda$9(Uri uri, InterfaceC6471c interfaceC6471c, Uri uri2) {
        AbstractC3385e.m2333e(uri == null ? null : AbstractC3382c.m2318s(uri));
        interfaceC6471c.invoke(uri2);
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void systemCameraLauncher$lambda$1(ImagePicker imagePicker, boolean z8) {
        InterfaceC6471c interfaceC6471c = imagePicker.tempSystemCameraCallback;
        if (interfaceC6471c != null) {
            interfaceC6471c.invoke(Boolean.valueOf(z8));
        }
        imagePicker.tempSystemCameraCallback = null;
    }

    @NotNull
    public final CropImageOptions getCropImageOptions() {
        return this.cropImageOptions;
    }

    public final void startCapture(@NotNull Uri uri, boolean needCrop, @NotNull InterfaceC6471c successCallback) {
        AbstractC5830k.m5330g(uri, "uri");
        AbstractC5830k.m5330g(successCallback, "successCallback");
        checkCameraPermission(new C5386b(this, uri, needCrop, successCallback, 0));
    }

    public final void startCrop(@NotNull Uri uri, @NotNull InterfaceC6471c successCallback) {
        AbstractC5830k.m5330g(uri, "uri");
        AbstractC5830k.m5330g(successCallback, "successCallback");
        this.tempCropForImageCallback = new C4838m4(successCallback, 11);
        this.cropForImageLauncher.launch(new EzyCropContract.CropRequestOptions(uri, this.cropImageOptions));
    }

    public final void startGallery(boolean needCrop, @NotNull InterfaceC6471c successCallback) {
        AbstractC5830k.m5330g(successCallback, "successCallback");
        this.tempGalleryCallback = new C5388d(needCrop, this, successCallback, 0);
        this.galleryLauncher.launch(new PickVisualMediaRequest.Builder().setMediaType(ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE).build());
    }

    public final void startSystemCamera(@NotNull Uri uri, boolean needCrop, @NotNull InterfaceC6471c successCallback) {
        AbstractC5830k.m5330g(uri, "uri");
        AbstractC5830k.m5330g(successCallback, "successCallback");
        checkCameraPermission(new C5386b(this, uri, needCrop, successCallback, 1));
    }

    public ImagePicker(@Nullable Fragment fragment, @Nullable ComponentActivity componentActivity) {
        this.fragment = fragment;
        this.activity = componentActivity;
        final int i = 0;
        this.cameraLauncher = registerForActivityResult(new EzyCameraContract.StartCameraForResult(), new ActivityResultCallback(this) { // from class: com.zykj.view.utils.e

            /* renamed from: b */
            public final /* synthetic */ ImagePicker f8342b;

            {
                this.f8342b = this;
            }

            @Override // android.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                switch (i) {
                    case 0:
                        ImagePicker.cameraLauncher$lambda$0(this.f8342b, (Uri) obj);
                        break;
                    case 1:
                        ImagePicker.systemCameraLauncher$lambda$1(this.f8342b, ((Boolean) obj).booleanValue());
                        break;
                    case 2:
                        ImagePicker.galleryLauncher$lambda$2(this.f8342b, (Uri) obj);
                        break;
                    case 3:
                        ImagePicker.cropForImageLauncher$lambda$3(this.f8342b, (Uri) obj);
                        break;
                    default:
                        ImagePicker.permissionLauncher$lambda$4(this.f8342b, ((Boolean) obj).booleanValue());
                        break;
                }
            }
        });
        final int i8 = 1;
        this.systemCameraLauncher = registerForActivityResult(new ActivityResultContracts.TakePicture(), new ActivityResultCallback(this) { // from class: com.zykj.view.utils.e

            /* renamed from: b */
            public final /* synthetic */ ImagePicker f8342b;

            {
                this.f8342b = this;
            }

            @Override // android.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                switch (i8) {
                    case 0:
                        ImagePicker.cameraLauncher$lambda$0(this.f8342b, (Uri) obj);
                        break;
                    case 1:
                        ImagePicker.systemCameraLauncher$lambda$1(this.f8342b, ((Boolean) obj).booleanValue());
                        break;
                    case 2:
                        ImagePicker.galleryLauncher$lambda$2(this.f8342b, (Uri) obj);
                        break;
                    case 3:
                        ImagePicker.cropForImageLauncher$lambda$3(this.f8342b, (Uri) obj);
                        break;
                    default:
                        ImagePicker.permissionLauncher$lambda$4(this.f8342b, ((Boolean) obj).booleanValue());
                        break;
                }
            }
        });
        final int i9 = 2;
        this.galleryLauncher = registerForActivityResult(new ActivityResultContracts.PickVisualMedia(), new ActivityResultCallback(this) { // from class: com.zykj.view.utils.e

            /* renamed from: b */
            public final /* synthetic */ ImagePicker f8342b;

            {
                this.f8342b = this;
            }

            @Override // android.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                switch (i9) {
                    case 0:
                        ImagePicker.cameraLauncher$lambda$0(this.f8342b, (Uri) obj);
                        break;
                    case 1:
                        ImagePicker.systemCameraLauncher$lambda$1(this.f8342b, ((Boolean) obj).booleanValue());
                        break;
                    case 2:
                        ImagePicker.galleryLauncher$lambda$2(this.f8342b, (Uri) obj);
                        break;
                    case 3:
                        ImagePicker.cropForImageLauncher$lambda$3(this.f8342b, (Uri) obj);
                        break;
                    default:
                        ImagePicker.permissionLauncher$lambda$4(this.f8342b, ((Boolean) obj).booleanValue());
                        break;
                }
            }
        });
        final int i10 = 3;
        this.cropForImageLauncher = registerForActivityResult(new EzyCropContract.StartCropForResult(), new ActivityResultCallback(this) { // from class: com.zykj.view.utils.e

            /* renamed from: b */
            public final /* synthetic */ ImagePicker f8342b;

            {
                this.f8342b = this;
            }

            @Override // android.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                switch (i10) {
                    case 0:
                        ImagePicker.cameraLauncher$lambda$0(this.f8342b, (Uri) obj);
                        break;
                    case 1:
                        ImagePicker.systemCameraLauncher$lambda$1(this.f8342b, ((Boolean) obj).booleanValue());
                        break;
                    case 2:
                        ImagePicker.galleryLauncher$lambda$2(this.f8342b, (Uri) obj);
                        break;
                    case 3:
                        ImagePicker.cropForImageLauncher$lambda$3(this.f8342b, (Uri) obj);
                        break;
                    default:
                        ImagePicker.permissionLauncher$lambda$4(this.f8342b, ((Boolean) obj).booleanValue());
                        break;
                }
            }
        });
        final int i11 = 4;
        this.permissionLauncher = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback(this) { // from class: com.zykj.view.utils.e

            /* renamed from: b */
            public final /* synthetic */ ImagePicker f8342b;

            {
                this.f8342b = this;
            }

            @Override // android.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                switch (i11) {
                    case 0:
                        ImagePicker.cameraLauncher$lambda$0(this.f8342b, (Uri) obj);
                        break;
                    case 1:
                        ImagePicker.systemCameraLauncher$lambda$1(this.f8342b, ((Boolean) obj).booleanValue());
                        break;
                    case 2:
                        ImagePicker.galleryLauncher$lambda$2(this.f8342b, (Uri) obj);
                        break;
                    case 3:
                        ImagePicker.cropForImageLauncher$lambda$3(this.f8342b, (Uri) obj);
                        break;
                    default:
                        ImagePicker.permissionLauncher$lambda$4(this.f8342b, ((Boolean) obj).booleanValue());
                        break;
                }
            }
        });
        CropImageOptions cropImageOptions = new CropImageOptions(null, null, 0.0f, 0.0f, 0.0f, null, null, false, false, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, false, 0.0f, 0, null, -1, -1, 63);
        cropImageOptions.f2421n = true;
        cropImageOptions.f2423o = true;
        cropImageOptions.f2438x = AbstractC3382c.m2303d().getColor(C5280R.color.colorPrimary);
        cropImageOptions.f2372B = AbstractC3382c.m2303d().getColor(C5280R.color.colorPrimary);
        cropImageOptions.f2419m = AbstractC3382c.m2303d().getColor(C5280R.color.colorPrimary);
        cropImageOptions.f2431s = 0.1f;
        this.cropImageOptions = cropImageOptions;
    }

    public /* synthetic */ ImagePicker(Fragment fragment, ComponentActivity componentActivity, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? null : fragment, (i & 2) != 0 ? null : componentActivity);
    }
}
