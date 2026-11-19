package com.zykj.view.p059ui.camera;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfoUnavailableException;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.MeteringPoint;
import androidx.camera.core.Preview;
import androidx.camera.core.SurfaceOrientedMeteringPointFactory;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.blankj.utilcode.util.UriUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.zykj.sketch.utils.ToastUtils;
import com.zykj.view.databinding.ViewFragmentImagePickBinding;
import com.zykj.view.p059ui.camera.ImagePickFragment;
import java.io.File;
import java.util.UUID;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import p027b8.AbstractC5046c;

@Metadata(m13557d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ;2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0018\u0010\u0003R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\"\u00106\u001a\u0010\u0012\f\u0012\n 3*\u0004\u0018\u00010202018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0004\u0018\u0001078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006<"}, m13558d2 = {"Lcom/zykj/view/ui/camera/ImagePickFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "l", "m", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "v", "q", "u", "s", "j", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "a", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "cameraProvider", "Landroidx/camera/core/ImageCapture;", "b", "Landroidx/camera/core/ImageCapture;", "imageCapture", "Landroidx/camera/core/CameraControl;", "c", "Landroidx/camera/core/CameraControl;", "mCameraControl", "Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;", "d", "Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;", "mBindView", "Landroidx/camera/core/Camera;", "e", "Landroidx/camera/core/Camera;", "camera", "Landroidx/camera/core/Preview;", "f", "Landroidx/camera/core/Preview;", "preview", "Landroidx/activity/result/ActivityResultLauncher;", "", "kotlin.jvm.PlatformType", "g", "Landroidx/activity/result/ActivityResultLauncher;", "requestPermissionLauncher", "Landroid/net/Uri;", "k", "()Landroid/net/Uri;", "uri", "h", "view_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nImagePickFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImagePickFragment.kt\ncom/zykj/view/ui/camera/ImagePickFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ImagePickFragment.kt\ncom/zykj/view/ui/camera/ImagePickFragmentKt\n*L\n1#1,284:1\n1#2:285\n276#3,9:286\n*S KotlinDebug\n*F\n+ 1 ImagePickFragment.kt\ncom/zykj/view/ui/camera/ImagePickFragment\n*L\n235#1:286,9\n*E\n"})
/* loaded from: classes5.dex */
public final class ImagePickFragment extends Fragment {

    /* renamed from: h, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata */
    public ProcessCameraProvider cameraProvider;

    /* renamed from: b, reason: from kotlin metadata */
    public ImageCapture imageCapture;

    /* renamed from: c, reason: from kotlin metadata */
    public CameraControl mCameraControl;

    /* renamed from: d, reason: from kotlin metadata */
    public ViewFragmentImagePickBinding mBindView;

    /* renamed from: e, reason: from kotlin metadata */
    public Camera camera;

    /* renamed from: f, reason: from kotlin metadata */
    public Preview preview;

    /* renamed from: g, reason: from kotlin metadata */
    public final ActivityResultLauncher requestPermissionLauncher;

    /* renamed from: com.zykj.view.ui.camera.ImagePickFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ImagePickFragment m11454a(Uri uri) {
            Bundle bundle = new Bundle();
            if (uri != null) {
                bundle.putParcelable("Uri", uri);
            }
            ImagePickFragment imagePickFragment = new ImagePickFragment();
            imagePickFragment.setArguments(bundle);
            return imagePickFragment;
        }

        public Companion() {
        }
    }

    /* renamed from: com.zykj.view.ui.camera.ImagePickFragment$b */
    public static final class ViewTreeObserverOnGlobalLayoutListenerC7266b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        public final /* synthetic */ View f11590a;

        /* renamed from: b */
        public final /* synthetic */ ImagePickFragment f11591b;

        public ViewTreeObserverOnGlobalLayoutListenerC7266b(View view, ImagePickFragment imagePickFragment) {
            this.f11590a = view;
            this.f11591b = imagePickFragment;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.f11590a.getMeasuredWidth() <= 0 || this.f11590a.getMeasuredHeight() <= 0) {
                return;
            }
            this.f11590a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            ViewFragmentImagePickBinding viewFragmentImagePickBinding = this.f11591b.mBindView;
            if (viewFragmentImagePickBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBindView");
                viewFragmentImagePickBinding = null;
            }
            viewFragmentImagePickBinding.f11402f.setOnTouchListener(this.f11591b.new ViewOnTouchListenerC7267c());
        }
    }

    /* renamed from: com.zykj.view.ui.camera.ImagePickFragment$c */
    public static final class ViewOnTouchListenerC7267c implements View.OnTouchListener {
        public ViewOnTouchListenerC7267c() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    return false;
                }
                ViewFragmentImagePickBinding viewFragmentImagePickBinding = ImagePickFragment.this.mBindView;
                Camera camera = null;
                if (viewFragmentImagePickBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBindView");
                    viewFragmentImagePickBinding = null;
                }
                float width = viewFragmentImagePickBinding.f11402f.getWidth();
                ViewFragmentImagePickBinding viewFragmentImagePickBinding2 = ImagePickFragment.this.mBindView;
                if (viewFragmentImagePickBinding2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBindView");
                    viewFragmentImagePickBinding2 = null;
                }
                MeteringPoint meteringPointCreatePoint = new SurfaceOrientedMeteringPointFactory(width, viewFragmentImagePickBinding2.f11402f.getHeight()).createPoint(motionEvent.getX(), motionEvent.getY());
                Intrinsics.checkNotNullExpressionValue(meteringPointCreatePoint, "createPoint(...)");
                try {
                    Camera camera2 = ImagePickFragment.this.camera;
                    if (camera2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("camera");
                    } else {
                        camera = camera2;
                    }
                    CameraControl cameraControl = camera.getCameraControl();
                    FocusMeteringAction.Builder builder = new FocusMeteringAction.Builder(meteringPointCreatePoint, 1);
                    builder.disableAutoCancel();
                    Intrinsics.checkNotNull(cameraControl.startFocusAndMetering(builder.build()));
                } catch (CameraInfoUnavailableException unused) {
                }
            }
            return true;
        }
    }

    public ImagePickFragment() {
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback() { // from class: z7.e
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ImagePickFragment.m11446r(this.f18142a, ((Boolean) obj).booleanValue());
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.requestPermissionLauncher = activityResultLauncherRegisterForActivityResult;
    }

    /* renamed from: l */
    private final void m11441l() {
        Preview previewBuild = new Preview.Builder().setTargetAspectRatio(0).build();
        this.preview = previewBuild;
        if (previewBuild != null) {
            ViewFragmentImagePickBinding viewFragmentImagePickBinding = this.mBindView;
            if (viewFragmentImagePickBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBindView");
                viewFragmentImagePickBinding = null;
            }
            previewBuild.setSurfaceProvider(viewFragmentImagePickBinding.f11402f.getSurfaceProvider());
        }
        if (ContextCompat.checkSelfPermission(requireContext(), "android.permission.CAMERA") == 0) {
            m11452u();
        } else {
            m11450q();
        }
    }

    /* renamed from: m */
    private final void m11442m() {
        ViewFragmentImagePickBinding viewFragmentImagePickBinding = this.mBindView;
        ViewFragmentImagePickBinding viewFragmentImagePickBinding2 = null;
        if (viewFragmentImagePickBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBindView");
            viewFragmentImagePickBinding = null;
        }
        ImageView capture = viewFragmentImagePickBinding.f11398b;
        Intrinsics.checkNotNullExpressionValue(capture, "capture");
        AbstractC5046c.m2530f(capture, 0L, new View.OnClickListener() { // from class: z7.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImagePickFragment.m11443n(this.f18139a, view);
            }
        }, 1, null);
        ViewFragmentImagePickBinding viewFragmentImagePickBinding3 = this.mBindView;
        if (viewFragmentImagePickBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBindView");
            viewFragmentImagePickBinding3 = null;
        }
        ImageView cancel = viewFragmentImagePickBinding3.f11397a;
        Intrinsics.checkNotNullExpressionValue(cancel, "cancel");
        AbstractC5046c.m2530f(cancel, 0L, new View.OnClickListener() { // from class: z7.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImagePickFragment.m11444o(this.f18140a, view);
            }
        }, 1, null);
        ViewFragmentImagePickBinding viewFragmentImagePickBinding4 = this.mBindView;
        if (viewFragmentImagePickBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBindView");
        } else {
            viewFragmentImagePickBinding2 = viewFragmentImagePickBinding4;
        }
        viewFragmentImagePickBinding2.f11399c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: z7.d
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
                ImagePickFragment.m11445p(this.f18141a, compoundButton, z9);
            }
        });
    }

    /* renamed from: n */
    public static final void m11443n(ImagePickFragment imagePickFragment, View view) {
        ViewFragmentImagePickBinding viewFragmentImagePickBinding = imagePickFragment.mBindView;
        if (viewFragmentImagePickBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBindView");
            viewFragmentImagePickBinding = null;
        }
        viewFragmentImagePickBinding.f11398b.setEnabled(false);
        imagePickFragment.m11453v();
    }

    /* renamed from: o */
    public static final void m11444o(ImagePickFragment imagePickFragment, View view) {
        imagePickFragment.requireActivity().finish();
    }

    /* renamed from: p */
    public static final void m11445p(ImagePickFragment imagePickFragment, CompoundButton compoundButton, boolean z9) {
        CameraControl cameraControl = imagePickFragment.mCameraControl;
        if (cameraControl != null) {
            cameraControl.enableTorch(z9);
        }
    }

    /* renamed from: r */
    public static final void m11446r(ImagePickFragment imagePickFragment, boolean z9) {
        if (z9) {
            imagePickFragment.m11452u();
        } else {
            ToastUtils.showShort(imagePickFragment.requireContext(), "没有照相机权限");
            imagePickFragment.requireActivity().finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: t */
    public static final void m11447t(ImagePickFragment imagePickFragment, ListenableFuture listenableFuture) {
        imagePickFragment.cameraProvider = (ProcessCameraProvider) listenableFuture.get();
        imagePickFragment.m11448j();
    }

    /* renamed from: j */
    public final void m11448j() {
        this.imageCapture = new ImageCapture.Builder().setTargetAspectRatio(0).build();
        ProcessCameraProvider processCameraProvider = this.cameraProvider;
        if (processCameraProvider != null) {
            processCameraProvider.unbindAll();
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            CameraSelector cameraSelectorBuild = new CameraSelector.Builder().requireLensFacing(1).build();
            Intrinsics.checkNotNullExpressionValue(cameraSelectorBuild, "build(...)");
            Camera cameraBindToLifecycle = processCameraProvider.bindToLifecycle(viewLifecycleOwner, cameraSelectorBuild, this.imageCapture, this.preview);
            this.mCameraControl = cameraBindToLifecycle.getCameraControl();
            this.camera = cameraBindToLifecycle;
        }
        ViewFragmentImagePickBinding viewFragmentImagePickBinding = this.mBindView;
        if (viewFragmentImagePickBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBindView");
            viewFragmentImagePickBinding = null;
        }
        PreviewView prevView = viewFragmentImagePickBinding.f11402f;
        Intrinsics.checkNotNullExpressionValue(prevView, "prevView");
        prevView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC7266b(prevView, this));
    }

    /* renamed from: k */
    public final Uri m11449k() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (Uri) arguments.getParcelable("Uri");
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ViewFragmentImagePickBinding viewFragmentImagePickBindingM11404a = ViewFragmentImagePickBinding.m11404a(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(viewFragmentImagePickBindingM11404a, "inflate(...)");
        this.mBindView = viewFragmentImagePickBindingM11404a;
        if (viewFragmentImagePickBindingM11404a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBindView");
            viewFragmentImagePickBindingM11404a = null;
        }
        View root = viewFragmentImagePickBindingM11404a.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        CameraControl cameraControl = this.mCameraControl;
        if (cameraControl != null) {
            ViewFragmentImagePickBinding viewFragmentImagePickBinding = this.mBindView;
            if (viewFragmentImagePickBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBindView");
                viewFragmentImagePickBinding = null;
            }
            cameraControl.enableTorch(viewFragmentImagePickBinding.f11399c.isChecked());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m11442m();
        m11441l();
    }

    /* renamed from: q */
    public final void m11450q() {
        this.requestPermissionLauncher.launch("android.permission.CAMERA");
    }

    /* renamed from: s */
    public final void m11451s() {
        ProcessCameraProvider.Companion companion = ProcessCameraProvider.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        final ListenableFuture<ProcessCameraProvider> companion2 = companion.getInstance(contextRequireContext);
        companion2.addListener(new Runnable() { // from class: z7.a
            @Override // java.lang.Runnable
            public final void run() {
                ImagePickFragment.m11447t(this.f18137a, companion2);
            }
        }, ContextCompat.getMainExecutor(requireContext()));
    }

    /* renamed from: u */
    public final void m11452u() {
        m11451s();
    }

    /* renamed from: v */
    public final void m11453v() {
        File file;
        Uri uriM11449k = m11449k();
        if (uriM11449k == null || (file = UriUtils.uri2File(uriM11449k)) == null) {
            File externalCacheDir = requireContext().getExternalCacheDir();
            String absolutePath = externalCacheDir != null ? externalCacheDir.getAbsolutePath() : null;
            file = new File(absolutePath + File.separator + UUID.randomUUID() + ".webp");
        }
        ImageCapture.OutputFileOptions outputFileOptionsBuild = new ImageCapture.OutputFileOptions.Builder(file).build();
        Intrinsics.checkNotNullExpressionValue(outputFileOptionsBuild, "build(...)");
        ImageCapture imageCapture = this.imageCapture;
        if (imageCapture != null) {
            imageCapture.takePicture(outputFileOptionsBuild, Executors.newSingleThreadExecutor(), new ImageCapture.OnImageSavedCallback() { // from class: com.zykj.view.ui.camera.ImagePickFragment$takePic$1
                @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
                public void onError(ImageCaptureException exception) {
                    Intrinsics.checkNotNullParameter(exception, "exception");
                    LifecycleOwner viewLifecycleOwner = this.f11593a.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), Dispatchers.getMain(), null, new ImagePickFragment$takePic$1$onError$1(this.f11593a, exception, null), 2, null);
                }

                @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
                public void onImageSaved(ImageCapture.OutputFileResults outputFileResults) {
                    Intrinsics.checkNotNullParameter(outputFileResults, "outputFileResults");
                    LifecycleOwner viewLifecycleOwner = this.f11593a.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), Dispatchers.getMain(), null, new ImagePickFragment$takePic$1$onImageSaved$1(this.f11593a, outputFileResults, null), 2, null);
                }
            });
        }
    }
}
