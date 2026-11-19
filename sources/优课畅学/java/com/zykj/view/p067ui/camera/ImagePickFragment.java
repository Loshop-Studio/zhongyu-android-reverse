package com.zykj.view.p067ui.camera;

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
import com.blankj.utilcode.util.AbstractC5364g0;
import com.google.common.util.concurrent.ListenableFuture;
import com.zykj.sketch.utils.ToastUtils;
import com.zykj.view.databinding.ViewFragmentImagePickBinding;
import com.zykj.view.p067ui.camera.ImagePickFragment;
import java.io.File;
import java.util.UUID;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p007a6.AbstractC0027a;
import p135i8.AbstractC8839h;
import p135i8.C8843i0;

/* loaded from: classes5.dex */
public final class ImagePickFragment extends Fragment {

    /* renamed from: h */
    public static final C8255a f15535h = new C8255a(null);

    /* renamed from: a */
    public ProcessCameraProvider f15536a;

    /* renamed from: b */
    public ImageCapture f15537b;

    /* renamed from: c */
    public CameraControl f15538c;

    /* renamed from: d */
    public ViewFragmentImagePickBinding f15539d;

    /* renamed from: e */
    public Camera f15540e;

    /* renamed from: f */
    public Preview f15541f;

    /* renamed from: g */
    public final ActivityResultLauncher f15542g;

    /* renamed from: com.zykj.view.ui.camera.ImagePickFragment$a */
    public static final class C8255a {
        public /* synthetic */ C8255a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final ImagePickFragment m13310a(Uri uri) {
            Bundle bundle = new Bundle();
            if (uri != null) {
                bundle.putParcelable("Uri", uri);
            }
            ImagePickFragment imagePickFragment = new ImagePickFragment();
            imagePickFragment.setArguments(bundle);
            return imagePickFragment;
        }

        public C8255a() {
        }
    }

    /* renamed from: com.zykj.view.ui.camera.ImagePickFragment$b */
    public static final class ViewTreeObserverOnGlobalLayoutListenerC8256b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        public final /* synthetic */ View f15543a;

        /* renamed from: b */
        public final /* synthetic */ ImagePickFragment f15544b;

        public ViewTreeObserverOnGlobalLayoutListenerC8256b(View view, ImagePickFragment imagePickFragment) {
            this.f15543a = view;
            this.f15544b = imagePickFragment;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.f15543a.getMeasuredWidth() <= 0 || this.f15543a.getMeasuredHeight() <= 0) {
                return;
            }
            this.f15543a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            ViewFragmentImagePickBinding viewFragmentImagePickBinding = this.f15544b.f15539d;
            if (viewFragmentImagePickBinding == null) {
                AbstractC9133u.m16151y("mBindView");
                viewFragmentImagePickBinding = null;
            }
            viewFragmentImagePickBinding.f15391f.setOnTouchListener(this.f15544b.new ViewOnTouchListenerC8257c());
        }
    }

    /* renamed from: com.zykj.view.ui.camera.ImagePickFragment$c */
    public static final class ViewOnTouchListenerC8257c implements View.OnTouchListener {
        public ViewOnTouchListenerC8257c() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    return false;
                }
                ViewFragmentImagePickBinding viewFragmentImagePickBinding = ImagePickFragment.this.f15539d;
                Camera camera = null;
                if (viewFragmentImagePickBinding == null) {
                    AbstractC9133u.m16151y("mBindView");
                    viewFragmentImagePickBinding = null;
                }
                float width = viewFragmentImagePickBinding.f15391f.getWidth();
                ViewFragmentImagePickBinding viewFragmentImagePickBinding2 = ImagePickFragment.this.f15539d;
                if (viewFragmentImagePickBinding2 == null) {
                    AbstractC9133u.m16151y("mBindView");
                    viewFragmentImagePickBinding2 = null;
                }
                MeteringPoint meteringPointCreatePoint = new SurfaceOrientedMeteringPointFactory(width, viewFragmentImagePickBinding2.f15391f.getHeight()).createPoint(motionEvent.getX(), motionEvent.getY());
                AbstractC9133u.m16132f(meteringPointCreatePoint, "createPoint(...)");
                try {
                    Camera camera2 = ImagePickFragment.this.f15540e;
                    if (camera2 == null) {
                        AbstractC9133u.m16151y("camera");
                    } else {
                        camera = camera2;
                    }
                    CameraControl cameraControl = camera.getCameraControl();
                    FocusMeteringAction.Builder builder = new FocusMeteringAction.Builder(meteringPointCreatePoint, 1);
                    builder.disableAutoCancel();
                    AbstractC9133u.m16130d(cameraControl.startFocusAndMetering(builder.build()));
                } catch (CameraInfoUnavailableException unused) {
                }
            }
            return true;
        }
    }

    public ImagePickFragment() {
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback() { // from class: y5.e
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ImagePickFragment.m13307s(this.f21112a, ((Boolean) obj).booleanValue());
            }
        });
        AbstractC9133u.m16132f(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.f15542g = activityResultLauncherRegisterForActivityResult;
    }

    /* renamed from: n */
    private final void m13302n() {
        Preview previewBuild = new Preview.Builder().setTargetAspectRatio(0).build();
        this.f15541f = previewBuild;
        if (previewBuild != null) {
            ViewFragmentImagePickBinding viewFragmentImagePickBinding = this.f15539d;
            if (viewFragmentImagePickBinding == null) {
                AbstractC9133u.m16151y("mBindView");
                viewFragmentImagePickBinding = null;
            }
            previewBuild.setSurfaceProvider(viewFragmentImagePickBinding.f15391f.getSurfaceProvider());
        }
        if (ContextCompat.checkSelfPermission(requireContext(), "android.permission.CAMERA") == 0) {
            startCamera();
        } else {
            requestCameraPermission();
        }
    }

    /* renamed from: o */
    private final void m13303o() {
        ViewFragmentImagePickBinding viewFragmentImagePickBinding = this.f15539d;
        ViewFragmentImagePickBinding viewFragmentImagePickBinding2 = null;
        if (viewFragmentImagePickBinding == null) {
            AbstractC9133u.m16151y("mBindView");
            viewFragmentImagePickBinding = null;
        }
        ImageView capture = viewFragmentImagePickBinding.f15387b;
        AbstractC9133u.m16132f(capture, "capture");
        AbstractC0027a.m65d(capture, 0L, new View.OnClickListener() { // from class: y5.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImagePickFragment.m13304p(this.f21109a, view);
            }
        }, 1, null);
        ViewFragmentImagePickBinding viewFragmentImagePickBinding3 = this.f15539d;
        if (viewFragmentImagePickBinding3 == null) {
            AbstractC9133u.m16151y("mBindView");
            viewFragmentImagePickBinding3 = null;
        }
        ImageView cancel = viewFragmentImagePickBinding3.f15386a;
        AbstractC9133u.m16132f(cancel, "cancel");
        AbstractC0027a.m65d(cancel, 0L, new View.OnClickListener() { // from class: y5.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImagePickFragment.m13305q(this.f21110a, view);
            }
        }, 1, null);
        ViewFragmentImagePickBinding viewFragmentImagePickBinding4 = this.f15539d;
        if (viewFragmentImagePickBinding4 == null) {
            AbstractC9133u.m16151y("mBindView");
        } else {
            viewFragmentImagePickBinding2 = viewFragmentImagePickBinding4;
        }
        viewFragmentImagePickBinding2.f15388c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: y5.d
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                ImagePickFragment.m13306r(this.f21111a, compoundButton, z10);
            }
        });
    }

    /* renamed from: p */
    public static final void m13304p(ImagePickFragment imagePickFragment, View view) {
        ViewFragmentImagePickBinding viewFragmentImagePickBinding = imagePickFragment.f15539d;
        if (viewFragmentImagePickBinding == null) {
            AbstractC9133u.m16151y("mBindView");
            viewFragmentImagePickBinding = null;
        }
        viewFragmentImagePickBinding.f15387b.setEnabled(false);
        imagePickFragment.takePic();
    }

    /* renamed from: q */
    public static final void m13305q(ImagePickFragment imagePickFragment, View view) {
        imagePickFragment.requireActivity().finish();
    }

    /* renamed from: r */
    public static final void m13306r(ImagePickFragment imagePickFragment, CompoundButton compoundButton, boolean z10) {
        CameraControl cameraControl = imagePickFragment.f15538c;
        if (cameraControl != null) {
            cameraControl.enableTorch(z10);
        }
    }

    /* renamed from: s */
    public static final void m13307s(ImagePickFragment imagePickFragment, boolean z10) {
        if (z10) {
            imagePickFragment.startCamera();
        } else {
            ToastUtils.showShort(imagePickFragment.requireContext(), "没有照相机权限");
            imagePickFragment.requireActivity().finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: t */
    public static final void m13308t(ImagePickFragment imagePickFragment, ListenableFuture listenableFuture) {
        imagePickFragment.f15536a = (ProcessCameraProvider) listenableFuture.get();
        imagePickFragment.bindCameraUseCases();
    }

    public final void bindCameraUseCases() {
        this.f15537b = new ImageCapture.Builder().setTargetAspectRatio(0).build();
        ProcessCameraProvider processCameraProvider = this.f15536a;
        if (processCameraProvider != null) {
            processCameraProvider.unbindAll();
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            CameraSelector cameraSelectorBuild = new CameraSelector.Builder().requireLensFacing(1).build();
            AbstractC9133u.m16132f(cameraSelectorBuild, "build(...)");
            Camera cameraBindToLifecycle = processCameraProvider.bindToLifecycle(viewLifecycleOwner, cameraSelectorBuild, this.f15537b, this.f15541f);
            this.f15538c = cameraBindToLifecycle.getCameraControl();
            this.f15540e = cameraBindToLifecycle;
        }
        ViewFragmentImagePickBinding viewFragmentImagePickBinding = this.f15539d;
        if (viewFragmentImagePickBinding == null) {
            AbstractC9133u.m16151y("mBindView");
            viewFragmentImagePickBinding = null;
        }
        PreviewView prevView = viewFragmentImagePickBinding.f15391f;
        AbstractC9133u.m16132f(prevView, "prevView");
        prevView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC8256b(prevView, this));
    }

    /* renamed from: m */
    public final Uri m13309m() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (Uri) arguments.getParcelable("Uri");
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC9133u.m16133g(inflater, "inflater");
        ViewFragmentImagePickBinding viewFragmentImagePickBindingM13273a = ViewFragmentImagePickBinding.m13273a(inflater, viewGroup, false);
        AbstractC9133u.m16132f(viewFragmentImagePickBindingM13273a, "inflate(...)");
        this.f15539d = viewFragmentImagePickBindingM13273a;
        if (viewFragmentImagePickBindingM13273a == null) {
            AbstractC9133u.m16151y("mBindView");
            viewFragmentImagePickBindingM13273a = null;
        }
        View root = viewFragmentImagePickBindingM13273a.getRoot();
        AbstractC9133u.m16132f(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        CameraControl cameraControl = this.f15538c;
        if (cameraControl != null) {
            ViewFragmentImagePickBinding viewFragmentImagePickBinding = this.f15539d;
            if (viewFragmentImagePickBinding == null) {
                AbstractC9133u.m16151y("mBindView");
                viewFragmentImagePickBinding = null;
            }
            cameraControl.enableTorch(viewFragmentImagePickBinding.f15388c.isChecked());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC9133u.m16133g(view, "view");
        super.onViewCreated(view, bundle);
        m13303o();
        m13302n();
    }

    public final void requestCameraPermission() {
        this.f15542g.launch("android.permission.CAMERA");
    }

    public final void setUpCamera() {
        ProcessCameraProvider.Companion companion = ProcessCameraProvider.Companion;
        Context contextRequireContext = requireContext();
        AbstractC9133u.m16132f(contextRequireContext, "requireContext(...)");
        final ListenableFuture<ProcessCameraProvider> companion2 = companion.getInstance(contextRequireContext);
        companion2.addListener(new Runnable() { // from class: y5.a
            @Override // java.lang.Runnable
            public final void run() {
                ImagePickFragment.m13308t(this.f21107a, companion2);
            }
        }, ContextCompat.getMainExecutor(requireContext()));
    }

    public final void startCamera() {
        setUpCamera();
    }

    public final void takePic() {
        File file;
        Uri uriM13309m = m13309m();
        if (uriM13309m == null || (file = AbstractC5364g0.m2472e(uriM13309m)) == null) {
            File externalCacheDir = requireContext().getExternalCacheDir();
            String absolutePath = externalCacheDir != null ? externalCacheDir.getAbsolutePath() : null;
            file = new File(absolutePath + File.separator + UUID.randomUUID() + ".webp");
        }
        ImageCapture.OutputFileOptions outputFileOptionsBuild = new ImageCapture.OutputFileOptions.Builder(file).build();
        AbstractC9133u.m16132f(outputFileOptionsBuild, "build(...)");
        ImageCapture imageCapture = this.f15537b;
        if (imageCapture != null) {
            imageCapture.takePicture(outputFileOptionsBuild, Executors.newSingleThreadExecutor(), new ImageCapture.OnImageSavedCallback() { // from class: com.zykj.view.ui.camera.ImagePickFragment.takePic.1
                @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
                public void onError(ImageCaptureException exception) {
                    AbstractC9133u.m16133g(exception, "exception");
                    LifecycleOwner viewLifecycleOwner = ImagePickFragment.this.getViewLifecycleOwner();
                    AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), C8843i0.m14868c(), null, new ImagePickFragment$takePic$1$onError$1(ImagePickFragment.this, exception, null), 2, null);
                }

                @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
                public void onImageSaved(ImageCapture.OutputFileResults outputFileResults) {
                    AbstractC9133u.m16133g(outputFileResults, "outputFileResults");
                    LifecycleOwner viewLifecycleOwner = ImagePickFragment.this.getViewLifecycleOwner();
                    AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), C8843i0.m14868c(), null, new ImagePickFragment$takePic$1$onImageSaved$1(ImagePickFragment.this, outputFileResults, null), 2, null);
                }
            });
        }
    }
}
