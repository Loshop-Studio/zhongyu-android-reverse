package com.zykj.view.p037ui.camera;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.LifecycleCoroutineScope;
import android.view.LifecycleOwner;
import android.view.LifecycleOwnerKt;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.result.ActivityResultLauncher;
import android.view.result.contract.ActivityResultContracts;
import android.widget.CompoundButton;
import android.widget.ImageView;
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
import androidx.camera.core.impl.C0362d;
import androidx.camera.core.impl.utils.RunnableC0377a;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.blankj.utilcode.util.AbstractC3382c;
import com.google.android.material.chip.C3521a;
import com.zykj.sketch.utils.ToastUtils;
import com.zykj.view.databinding.ViewFragmentImagePickBinding;
import com.zykj.view.utils.ExtKt;
import java.io.File;
import java.util.UUID;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC5896f0;
import kotlinx.coroutines.AbstractC6014x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p049e1.InterfaceFutureC5453a;
import p054e7.AbstractC5479k;
import p068g7.C5609e;

@Metadata(m5109d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 42\u00020\u0001:\u00014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u000b\u0010\u0003J+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0003R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\"\u0010.\u001a\u0010\u0012\f\u0012\n -*\u0004\u0018\u00010,0,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u0004\u0018\u0001008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00065"}, m5110d2 = {"Lcom/zykj/view/ui/camera/ImagePickFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Ld6/s;", "initData", "initView", "takePic", "requestCameraPermission", "startCamera", "setUpCamera", "bindCameraUseCases", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "cameraProvider", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "Landroidx/camera/core/ImageCapture;", "imageCapture", "Landroidx/camera/core/ImageCapture;", "Landroidx/camera/core/CameraControl;", "mCameraControl", "Landroidx/camera/core/CameraControl;", "Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;", "mBindView", "Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;", "Landroidx/camera/core/Camera;", "camera", "Landroidx/camera/core/Camera;", "Landroidx/camera/core/Preview;", "preview", "Landroidx/camera/core/Preview;", "Landroidx/activity/result/ActivityResultLauncher;", "", "kotlin.jvm.PlatformType", "requestPermissionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "uri", "Companion", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nImagePickFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImagePickFragment.kt\ncom/zykj/view/ui/camera/ImagePickFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ImagePickFragment.kt\ncom/zykj/view/ui/camera/ImagePickFragmentKt\n*L\n1#1,284:1\n1#2:285\n276#3,9:286\n*S KotlinDebug\n*F\n+ 1 ImagePickFragment.kt\ncom/zykj/view/ui/camera/ImagePickFragment\n*L\n235#1:286,9\n*E\n"})
/* loaded from: classes3.dex */
public final class ImagePickFragment extends Fragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private Camera camera;

    @Nullable
    private ProcessCameraProvider cameraProvider;

    @Nullable
    private ImageCapture imageCapture;
    private ViewFragmentImagePickBinding mBindView;

    @Nullable
    private CameraControl mCameraControl;

    @Nullable
    private Preview preview;

    @NotNull
    private final ActivityResultLauncher<String> requestPermissionLauncher;

    @Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m5110d2 = {"Lcom/zykj/view/ui/camera/ImagePickFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/zykj/view/ui/camera/ImagePickFragment;", "uri", "Landroid/net/Uri;", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @NotNull
        public final ImagePickFragment newInstance(@Nullable Uri uri) {
            Bundle bundle = new Bundle();
            if (uri != null) {
                bundle.putParcelable("Uri", uri);
            }
            ImagePickFragment imagePickFragment = new ImagePickFragment();
            imagePickFragment.setArguments(bundle);
            return imagePickFragment;
        }

        private Companion() {
        }
    }

    public ImagePickFragment() {
        ActivityResultLauncher<String> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new C0362d(this, 13));
        AbstractC5830k.m5329f(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.requestPermissionLauncher = activityResultLauncherRegisterForActivityResult;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void bindCameraUseCases() {
        this.imageCapture = new ImageCapture.Builder().setTargetAspectRatio(0).build();
        ProcessCameraProvider processCameraProvider = this.cameraProvider;
        if (processCameraProvider != null) {
            processCameraProvider.unbindAll();
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            AbstractC5830k.m5329f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            CameraSelector cameraSelectorBuild = new CameraSelector.Builder().requireLensFacing(1).build();
            AbstractC5830k.m5329f(cameraSelectorBuild, "build(...)");
            Camera cameraBindToLifecycle = processCameraProvider.bindToLifecycle(viewLifecycleOwner, cameraSelectorBuild, this.imageCapture, this.preview);
            this.mCameraControl = cameraBindToLifecycle.getCameraControl();
            this.camera = cameraBindToLifecycle;
        }
        ViewFragmentImagePickBinding viewFragmentImagePickBinding = this.mBindView;
        if (viewFragmentImagePickBinding == null) {
            AbstractC5830k.m5339p("mBindView");
            throw null;
        }
        final PreviewView prevView = viewFragmentImagePickBinding.prevView;
        AbstractC5830k.m5329f(prevView, "prevView");
        prevView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.zykj.view.ui.camera.ImagePickFragment$bindCameraUseCases$$inlined$afterMeasured$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (prevView.getMeasuredWidth() <= 0 || prevView.getMeasuredHeight() <= 0) {
                    return;
                }
                prevView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                ViewFragmentImagePickBinding viewFragmentImagePickBinding2 = this.mBindView;
                if (viewFragmentImagePickBinding2 == null) {
                    AbstractC5830k.m5339p("mBindView");
                    throw null;
                }
                PreviewView previewView = viewFragmentImagePickBinding2.prevView;
                final ImagePickFragment imagePickFragment = this;
                previewView.setOnTouchListener(new View.OnTouchListener() { // from class: com.zykj.view.ui.camera.ImagePickFragment$bindCameraUseCases$2$1
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        Camera camera;
                        int action = motionEvent.getAction();
                        if (action == 0) {
                            return true;
                        }
                        if (action != 1) {
                            return false;
                        }
                        ViewFragmentImagePickBinding viewFragmentImagePickBinding3 = imagePickFragment.mBindView;
                        if (viewFragmentImagePickBinding3 == null) {
                            AbstractC5830k.m5339p("mBindView");
                            throw null;
                        }
                        float width = viewFragmentImagePickBinding3.prevView.getWidth();
                        if (imagePickFragment.mBindView == null) {
                            AbstractC5830k.m5339p("mBindView");
                            throw null;
                        }
                        MeteringPoint meteringPointCreatePoint = new SurfaceOrientedMeteringPointFactory(width, r4.prevView.getHeight()).createPoint(motionEvent.getX(), motionEvent.getY());
                        AbstractC5830k.m5329f(meteringPointCreatePoint, "createPoint(...)");
                        try {
                            camera = imagePickFragment.camera;
                        } catch (CameraInfoUnavailableException e) {
                            Log.d("ERROR", "cannot access camera", e);
                        }
                        if (camera == null) {
                            AbstractC5830k.m5339p("camera");
                            throw null;
                        }
                        CameraControl cameraControl = camera.getCameraControl();
                        FocusMeteringAction.Builder builder = new FocusMeteringAction.Builder(meteringPointCreatePoint, 1);
                        builder.disableAutoCancel();
                        AbstractC5830k.m5327d(cameraControl.startFocusAndMetering(builder.build()));
                        return true;
                    }
                });
            }
        });
    }

    private final Uri getUri() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (Uri) arguments.getParcelable("Uri");
        }
        return null;
    }

    private final void initData() {
        Preview previewBuild = new Preview.Builder().setTargetAspectRatio(0).build();
        this.preview = previewBuild;
        if (previewBuild != null) {
            ViewFragmentImagePickBinding viewFragmentImagePickBinding = this.mBindView;
            if (viewFragmentImagePickBinding == null) {
                AbstractC5830k.m5339p("mBindView");
                throw null;
            }
            previewBuild.setSurfaceProvider(viewFragmentImagePickBinding.prevView.getSurfaceProvider());
        }
        if (ContextCompat.checkSelfPermission(requireContext(), "android.permission.CAMERA") == 0) {
            startCamera();
        } else {
            requestCameraPermission();
        }
    }

    private final void initView() {
        ViewFragmentImagePickBinding viewFragmentImagePickBinding = this.mBindView;
        if (viewFragmentImagePickBinding == null) {
            AbstractC5830k.m5339p("mBindView");
            throw null;
        }
        ImageView capture = viewFragmentImagePickBinding.capture;
        AbstractC5830k.m5329f(capture, "capture");
        final int i = 0;
        ExtKt.singleClick$default(capture, 0L, new View.OnClickListener(this) { // from class: com.zykj.view.ui.camera.a

            /* renamed from: b */
            public final /* synthetic */ ImagePickFragment f8324b;

            {
                this.f8324b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        ImagePickFragment.initView$lambda$1(this.f8324b, view);
                        break;
                    default:
                        ImagePickFragment.initView$lambda$2(this.f8324b, view);
                        break;
                }
            }
        }, 1, null);
        ViewFragmentImagePickBinding viewFragmentImagePickBinding2 = this.mBindView;
        if (viewFragmentImagePickBinding2 == null) {
            AbstractC5830k.m5339p("mBindView");
            throw null;
        }
        ImageView cancel = viewFragmentImagePickBinding2.cancel;
        AbstractC5830k.m5329f(cancel, "cancel");
        final int i8 = 1;
        ExtKt.singleClick$default(cancel, 0L, new View.OnClickListener(this) { // from class: com.zykj.view.ui.camera.a

            /* renamed from: b */
            public final /* synthetic */ ImagePickFragment f8324b;

            {
                this.f8324b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i8) {
                    case 0:
                        ImagePickFragment.initView$lambda$1(this.f8324b, view);
                        break;
                    default:
                        ImagePickFragment.initView$lambda$2(this.f8324b, view);
                        break;
                }
            }
        }, 1, null);
        ViewFragmentImagePickBinding viewFragmentImagePickBinding3 = this.mBindView;
        if (viewFragmentImagePickBinding3 != null) {
            viewFragmentImagePickBinding3.ckLight.setOnCheckedChangeListener(new C3521a(this, 1));
        } else {
            AbstractC5830k.m5339p("mBindView");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(ImagePickFragment imagePickFragment, View view) {
        ViewFragmentImagePickBinding viewFragmentImagePickBinding = imagePickFragment.mBindView;
        if (viewFragmentImagePickBinding == null) {
            AbstractC5830k.m5339p("mBindView");
            throw null;
        }
        viewFragmentImagePickBinding.capture.setEnabled(false);
        imagePickFragment.takePic();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(ImagePickFragment imagePickFragment, View view) {
        imagePickFragment.requireActivity().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3(ImagePickFragment imagePickFragment, CompoundButton compoundButton, boolean z8) {
        CameraControl cameraControl = imagePickFragment.mCameraControl;
        if (cameraControl != null) {
            cameraControl.enableTorch(z8);
        }
    }

    private final void requestCameraPermission() {
        this.requestPermissionLauncher.launch("android.permission.CAMERA");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestPermissionLauncher$lambda$0(ImagePickFragment imagePickFragment, boolean z8) {
        if (z8) {
            imagePickFragment.startCamera();
        } else {
            ToastUtils.showShort(imagePickFragment.requireContext(), "没有照相机权限");
            imagePickFragment.requireActivity().finish();
        }
    }

    private final void setUpCamera() {
        ProcessCameraProvider.Companion companion = ProcessCameraProvider.INSTANCE;
        Context contextRequireContext = requireContext();
        AbstractC5830k.m5329f(contextRequireContext, "requireContext(...)");
        InterfaceFutureC5453a companion2 = companion.getInstance(contextRequireContext);
        companion2.addListener(new RunnableC0377a(19, this, companion2), ContextCompat.getMainExecutor(requireContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUpCamera$lambda$5(ImagePickFragment imagePickFragment, InterfaceFutureC5453a interfaceFutureC5453a) {
        imagePickFragment.cameraProvider = (ProcessCameraProvider) interfaceFutureC5453a.get();
        imagePickFragment.bindCameraUseCases();
    }

    private final void startCamera() {
        setUpCamera();
    }

    private final void takePic() {
        File file;
        Uri uri = getUri();
        if (uri == null || (file = AbstractC3382c.m2317r(uri)) == null) {
            File externalCacheDir = requireContext().getExternalCacheDir();
            String absolutePath = externalCacheDir != null ? externalCacheDir.getAbsolutePath() : null;
            file = new File(absolutePath + File.separator + UUID.randomUUID() + ".webp");
        }
        ImageCapture.OutputFileOptions outputFileOptionsBuild = new ImageCapture.OutputFileOptions.Builder(file).build();
        AbstractC5830k.m5329f(outputFileOptionsBuild, "build(...)");
        ImageCapture imageCapture = this.imageCapture;
        if (imageCapture != null) {
            imageCapture.lambda$takePicture$2(outputFileOptionsBuild, Executors.newSingleThreadExecutor(), new ImageCapture.OnImageSavedCallback() { // from class: com.zykj.view.ui.camera.ImagePickFragment.takePic.1
                @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
                public void onError(ImageCaptureException exception) {
                    AbstractC5830k.m5330g(exception, "exception");
                    LifecycleOwner viewLifecycleOwner = ImagePickFragment.this.getViewLifecycleOwner();
                    AbstractC5830k.m5329f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner);
                    C5609e c5609e = AbstractC5896f0.f9343a;
                    AbstractC6014x.m5651v(lifecycleScope, AbstractC5479k.f8471a, null, new ImagePickFragment$takePic$1$onError$1(ImagePickFragment.this, exception, null), 2);
                }

                @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
                public void onImageSaved(ImageCapture.OutputFileResults outputFileResults) {
                    AbstractC5830k.m5330g(outputFileResults, "outputFileResults");
                    LifecycleOwner viewLifecycleOwner = ImagePickFragment.this.getViewLifecycleOwner();
                    AbstractC5830k.m5329f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner);
                    C5609e c5609e = AbstractC5896f0.f9343a;
                    AbstractC6014x.m5651v(lifecycleScope, AbstractC5479k.f8471a, null, new ImagePickFragment$takePic$1$onImageSaved$1(ImagePickFragment.this, outputFileResults, null), 2);
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        AbstractC5830k.m5330g(inflater, "inflater");
        ViewFragmentImagePickBinding viewFragmentImagePickBindingInflate = ViewFragmentImagePickBinding.inflate(inflater, container, false);
        AbstractC5830k.m5329f(viewFragmentImagePickBindingInflate, "inflate(...)");
        this.mBindView = viewFragmentImagePickBindingInflate;
        View root = viewFragmentImagePickBindingInflate.getRoot();
        AbstractC5830k.m5329f(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        CameraControl cameraControl = this.mCameraControl;
        if (cameraControl != null) {
            ViewFragmentImagePickBinding viewFragmentImagePickBinding = this.mBindView;
            if (viewFragmentImagePickBinding != null) {
                cameraControl.enableTorch(viewFragmentImagePickBinding.ckLight.isChecked());
            } else {
                AbstractC5830k.m5339p("mBindView");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        AbstractC5830k.m5330g(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
        initData();
    }
}
