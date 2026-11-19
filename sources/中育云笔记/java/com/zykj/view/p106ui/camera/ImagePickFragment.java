package com.zykj.view.p106ui.camera;

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
import com.zykj.view.p106ui.camera.ImagePickFragment;
import java.io.File;
import java.util.UUID;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p378vb.AbstractC11571a;
import sd.AbstractC11117h;
import sd.C11157r0;

/* loaded from: classes6.dex */
public final class ImagePickFragment extends Fragment {

    /* renamed from: k */
    public static final C8888a f20749k = new C8888a(null);

    /* renamed from: d */
    public ProcessCameraProvider f20750d;

    /* renamed from: e */
    public ImageCapture f20751e;

    /* renamed from: f */
    public CameraControl f20752f;

    /* renamed from: g */
    public ViewFragmentImagePickBinding f20753g;

    /* renamed from: h */
    public Camera f20754h;

    /* renamed from: i */
    public Preview f20755i;

    /* renamed from: j */
    public final ActivityResultLauncher f20756j;

    /* renamed from: com.zykj.view.ui.camera.ImagePickFragment$a */
    public static final class C8888a {
        public /* synthetic */ C8888a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final ImagePickFragment m17385a(Uri uri) {
            Bundle bundle = new Bundle();
            if (uri != null) {
                bundle.putParcelable("Uri", uri);
            }
            ImagePickFragment imagePickFragment = new ImagePickFragment();
            imagePickFragment.setArguments(bundle);
            return imagePickFragment;
        }

        public C8888a() {
        }
    }

    /* renamed from: com.zykj.view.ui.camera.ImagePickFragment$b */
    public static final class ViewTreeObserverOnGlobalLayoutListenerC8889b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: c */
        public final /* synthetic */ View f20757c;

        /* renamed from: d */
        public final /* synthetic */ ImagePickFragment f20758d;

        public ViewTreeObserverOnGlobalLayoutListenerC8889b(View view, ImagePickFragment imagePickFragment) {
            this.f20757c = view;
            this.f20758d = imagePickFragment;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.f20757c.getMeasuredWidth() <= 0 || this.f20757c.getMeasuredHeight() <= 0) {
                return;
            }
            this.f20757c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            ViewFragmentImagePickBinding viewFragmentImagePickBinding = this.f20758d.f20753g;
            if (viewFragmentImagePickBinding == null) {
                AbstractC9979u.m20312y("mBindView");
                viewFragmentImagePickBinding = null;
            }
            viewFragmentImagePickBinding.f20602h.setOnTouchListener(this.f20758d.new ViewOnTouchListenerC8890c());
        }
    }

    /* renamed from: com.zykj.view.ui.camera.ImagePickFragment$c */
    public static final class ViewOnTouchListenerC8890c implements View.OnTouchListener {
        public ViewOnTouchListenerC8890c() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    return false;
                }
                ViewFragmentImagePickBinding viewFragmentImagePickBinding = ImagePickFragment.this.f20753g;
                Camera camera = null;
                if (viewFragmentImagePickBinding == null) {
                    AbstractC9979u.m20312y("mBindView");
                    viewFragmentImagePickBinding = null;
                }
                float width = viewFragmentImagePickBinding.f20602h.getWidth();
                ViewFragmentImagePickBinding viewFragmentImagePickBinding2 = ImagePickFragment.this.f20753g;
                if (viewFragmentImagePickBinding2 == null) {
                    AbstractC9979u.m20312y("mBindView");
                    viewFragmentImagePickBinding2 = null;
                }
                MeteringPoint meteringPointCreatePoint = new SurfaceOrientedMeteringPointFactory(width, viewFragmentImagePickBinding2.f20602h.getHeight()).createPoint(motionEvent.getX(), motionEvent.getY());
                AbstractC9979u.m20293f(meteringPointCreatePoint, "createPoint(...)");
                try {
                    Camera camera2 = ImagePickFragment.this.f20754h;
                    if (camera2 == null) {
                        AbstractC9979u.m20312y("camera");
                    } else {
                        camera = camera2;
                    }
                    CameraControl cameraControl = camera.getCameraControl();
                    FocusMeteringAction.Builder builder = new FocusMeteringAction.Builder(meteringPointCreatePoint, 1);
                    builder.disableAutoCancel();
                    AbstractC9979u.m20291d(cameraControl.startFocusAndMetering(builder.build()));
                } catch (CameraInfoUnavailableException unused) {
                }
            }
            return true;
        }
    }

    public ImagePickFragment() {
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback() { // from class: tb.e
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ImagePickFragment.m17368B(this.f27076a, ((Boolean) obj).booleanValue());
            }
        });
        AbstractC9979u.m20293f(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.f20756j = activityResultLauncherRegisterForActivityResult;
    }

    /* renamed from: A */
    private final void m17367A() {
        this.f20756j.launch("android.permission.CAMERA");
    }

    /* renamed from: B */
    public static final void m17368B(ImagePickFragment imagePickFragment, boolean z10) {
        if (z10) {
            imagePickFragment.m17371E();
        } else {
            ToastUtils.showShort(imagePickFragment.requireContext(), "没有照相机权限");
            imagePickFragment.requireActivity().finish();
        }
    }

    /* renamed from: C */
    private final void m17369C() {
        ProcessCameraProvider.Companion companion = ProcessCameraProvider.Companion;
        Context contextRequireContext = requireContext();
        AbstractC9979u.m20293f(contextRequireContext, "requireContext(...)");
        final ListenableFuture<ProcessCameraProvider> companion2 = companion.getInstance(contextRequireContext);
        companion2.addListener(new Runnable() { // from class: tb.a
            @Override // java.lang.Runnable
            public final void run() {
                ImagePickFragment.m17370D(this.f27071c, companion2);
            }
        }, ContextCompat.getMainExecutor(requireContext()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: D */
    public static final void m17370D(ImagePickFragment imagePickFragment, ListenableFuture listenableFuture) {
        imagePickFragment.f20750d = (ProcessCameraProvider) listenableFuture.get();
        imagePickFragment.m17380v();
    }

    /* renamed from: E */
    private final void m17371E() {
        m17369C();
    }

    /* renamed from: F */
    private final void m17372F() {
        File file;
        Uri uriM17384w = m17384w();
        if (uriM17384w == null || (file = UriUtils.uri2File(uriM17384w)) == null) {
            File externalCacheDir = requireContext().getExternalCacheDir();
            String absolutePath = externalCacheDir != null ? externalCacheDir.getAbsolutePath() : null;
            file = new File(absolutePath + File.separator + UUID.randomUUID() + ".webp");
        }
        ImageCapture.OutputFileOptions outputFileOptionsBuild = new ImageCapture.OutputFileOptions.Builder(file).build();
        AbstractC9979u.m20293f(outputFileOptionsBuild, "build(...)");
        ImageCapture imageCapture = this.f20751e;
        if (imageCapture != null) {
            imageCapture.takePicture(outputFileOptionsBuild, Executors.newSingleThreadExecutor(), new ImageCapture.OnImageSavedCallback() { // from class: com.zykj.view.ui.camera.ImagePickFragment$takePic$1
                @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
                public void onError(ImageCaptureException exception) {
                    AbstractC9979u.m20294g(exception, "exception");
                    LifecycleOwner viewLifecycleOwner = this.f20760a.getViewLifecycleOwner();
                    AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), C11157r0.m24800c(), null, new ImagePickFragment$takePic$1$onError$1(this.f20760a, exception, null), 2, null);
                }

                @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
                public void onImageSaved(ImageCapture.OutputFileResults outputFileResults) {
                    AbstractC9979u.m20294g(outputFileResults, "outputFileResults");
                    LifecycleOwner viewLifecycleOwner = this.f20760a.getViewLifecycleOwner();
                    AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), C11157r0.m24800c(), null, new ImagePickFragment$takePic$1$onImageSaved$1(this.f20760a, outputFileResults, null), 2, null);
                }
            });
        }
    }

    private final void initData() {
        Preview previewBuild = new Preview.Builder().setTargetAspectRatio(0).build();
        this.f20755i = previewBuild;
        if (previewBuild != null) {
            ViewFragmentImagePickBinding viewFragmentImagePickBinding = this.f20753g;
            if (viewFragmentImagePickBinding == null) {
                AbstractC9979u.m20312y("mBindView");
                viewFragmentImagePickBinding = null;
            }
            previewBuild.setSurfaceProvider(viewFragmentImagePickBinding.f20602h.getSurfaceProvider());
        }
        if (ContextCompat.checkSelfPermission(requireContext(), "android.permission.CAMERA") == 0) {
            m17371E();
        } else {
            m17367A();
        }
    }

    private final void initView() {
        ViewFragmentImagePickBinding viewFragmentImagePickBinding = this.f20753g;
        ViewFragmentImagePickBinding viewFragmentImagePickBinding2 = null;
        if (viewFragmentImagePickBinding == null) {
            AbstractC9979u.m20312y("mBindView");
            viewFragmentImagePickBinding = null;
        }
        ImageView capture = viewFragmentImagePickBinding.f20598d;
        AbstractC9979u.m20293f(capture, "capture");
        AbstractC11571a.m25475d(capture, 0L, new View.OnClickListener() { // from class: tb.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImagePickFragment.m17381x(this.f27073c, view);
            }
        }, 1, null);
        ViewFragmentImagePickBinding viewFragmentImagePickBinding3 = this.f20753g;
        if (viewFragmentImagePickBinding3 == null) {
            AbstractC9979u.m20312y("mBindView");
            viewFragmentImagePickBinding3 = null;
        }
        ImageView cancel = viewFragmentImagePickBinding3.f20597c;
        AbstractC9979u.m20293f(cancel, "cancel");
        AbstractC11571a.m25475d(cancel, 0L, new View.OnClickListener() { // from class: tb.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImagePickFragment.m17382y(this.f27074c, view);
            }
        }, 1, null);
        ViewFragmentImagePickBinding viewFragmentImagePickBinding4 = this.f20753g;
        if (viewFragmentImagePickBinding4 == null) {
            AbstractC9979u.m20312y("mBindView");
        } else {
            viewFragmentImagePickBinding2 = viewFragmentImagePickBinding4;
        }
        viewFragmentImagePickBinding2.f20599e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: tb.d
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                ImagePickFragment.m17383z(this.f27075a, compoundButton, z10);
            }
        });
    }

    /* renamed from: v */
    private final void m17380v() {
        this.f20751e = new ImageCapture.Builder().setTargetAspectRatio(0).build();
        ProcessCameraProvider processCameraProvider = this.f20750d;
        if (processCameraProvider != null) {
            processCameraProvider.unbindAll();
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            CameraSelector cameraSelectorBuild = new CameraSelector.Builder().requireLensFacing(1).build();
            AbstractC9979u.m20293f(cameraSelectorBuild, "build(...)");
            Camera cameraBindToLifecycle = processCameraProvider.bindToLifecycle(viewLifecycleOwner, cameraSelectorBuild, this.f20751e, this.f20755i);
            this.f20752f = cameraBindToLifecycle.getCameraControl();
            this.f20754h = cameraBindToLifecycle;
        }
        ViewFragmentImagePickBinding viewFragmentImagePickBinding = this.f20753g;
        if (viewFragmentImagePickBinding == null) {
            AbstractC9979u.m20312y("mBindView");
            viewFragmentImagePickBinding = null;
        }
        PreviewView prevView = viewFragmentImagePickBinding.f20602h;
        AbstractC9979u.m20293f(prevView, "prevView");
        prevView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC8889b(prevView, this));
    }

    /* renamed from: x */
    public static final void m17381x(ImagePickFragment imagePickFragment, View view) {
        ViewFragmentImagePickBinding viewFragmentImagePickBinding = imagePickFragment.f20753g;
        if (viewFragmentImagePickBinding == null) {
            AbstractC9979u.m20312y("mBindView");
            viewFragmentImagePickBinding = null;
        }
        viewFragmentImagePickBinding.f20598d.setEnabled(false);
        imagePickFragment.m17372F();
    }

    /* renamed from: y */
    public static final void m17382y(ImagePickFragment imagePickFragment, View view) {
        imagePickFragment.requireActivity().finish();
    }

    /* renamed from: z */
    public static final void m17383z(ImagePickFragment imagePickFragment, CompoundButton compoundButton, boolean z10) {
        CameraControl cameraControl = imagePickFragment.f20752f;
        if (cameraControl != null) {
            cameraControl.enableTorch(z10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC9979u.m20294g(inflater, "inflater");
        ViewFragmentImagePickBinding viewFragmentImagePickBindingM17345a = ViewFragmentImagePickBinding.m17345a(inflater, viewGroup, false);
        AbstractC9979u.m20293f(viewFragmentImagePickBindingM17345a, "inflate(...)");
        this.f20753g = viewFragmentImagePickBindingM17345a;
        if (viewFragmentImagePickBindingM17345a == null) {
            AbstractC9979u.m20312y("mBindView");
            viewFragmentImagePickBindingM17345a = null;
        }
        View root = viewFragmentImagePickBindingM17345a.getRoot();
        AbstractC9979u.m20293f(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        CameraControl cameraControl = this.f20752f;
        if (cameraControl != null) {
            ViewFragmentImagePickBinding viewFragmentImagePickBinding = this.f20753g;
            if (viewFragmentImagePickBinding == null) {
                AbstractC9979u.m20312y("mBindView");
                viewFragmentImagePickBinding = null;
            }
            cameraControl.enableTorch(viewFragmentImagePickBinding.f20599e.isChecked());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC9979u.m20294g(view, "view");
        super.onViewCreated(view, bundle);
        initView();
        initData();
    }

    /* renamed from: w */
    public final Uri m17384w() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (Uri) arguments.getParcelable("Uri");
        }
        return null;
    }
}
