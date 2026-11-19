package com.zykj.image;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Keep;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.Preview;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.fragment.FragmentKt;
import com.google.common.util.concurrent.ListenableFuture;
import com.zykj.base.utils.XToastUtils;
import com.zykj.image.ImagePickFragment;
import com.zykj.image.databinding.FragmentImagePickBinding;
import java.io.File;
import java.util.concurrent.Executors;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;

@Keep
/* loaded from: classes4.dex */
public final class ImagePickFragment extends Hilt_ImagePickFragment {
    public static final C7307a Companion = new C7307a(null);
    public static final String TAG = "ImagePickFragment";
    private final NavArgsLazy args$delegate = new NavArgsLazy(AbstractC9137y.m16154b(ImagePickFragmentArgs.class), new InterfaceC10559a() { // from class: com.zykj.image.ImagePickFragment$special$$inlined$navArgs$1
        {
            super(0);
        }

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this + " has null arguments");
        }
    });
    private ProcessCameraProvider cameraProvider;
    private ImageCapture imageCapture;
    private CameraControl mCameraControl;
    private final ActivityResultLauncher<String> requestPermissionLauncher;

    /* renamed from: com.zykj.image.ImagePickFragment$a */
    public static final class C7307a {
        public /* synthetic */ C7307a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C7307a() {
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.image.ImagePickFragment", m17801f = "ImagePickFragment.kt", m17802l = {50}, m17803m = "initData")
    /* renamed from: com.zykj.image.ImagePickFragment$initData$1 */
    public static final class C73081 extends ContinuationImpl {

        /* renamed from: a */
        public Object f9751a;

        /* renamed from: b */
        public /* synthetic */ Object f9752b;

        /* renamed from: d */
        public int f9754d;

        public C73081(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9752b = obj;
            this.f9754d |= Integer.MIN_VALUE;
            return ImagePickFragment.this.initData(this);
        }
    }

    public ImagePickFragment() {
        ActivityResultLauncher<String> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback() { // from class: j3.k
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ImagePickFragment.m27491requestPermissionLauncher$lambda0(this.f17198a, ((Boolean) obj).booleanValue());
            }
        });
        AbstractC9133u.m16132f(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(\n        ActivityResultContracts.RequestPermission()\n    ) { isGranted: Boolean ->\n        if (isGranted) {\n            startCamera()\n        } else {\n            XToastUtils.warning(R.string.no_camera_permission)\n            findNavController().navigateUp()\n        }\n    }");
        this.requestPermissionLauncher = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindCameraUseCases() {
        Camera cameraBindToLifecycle;
        CameraSelector cameraSelectorBuild = new CameraSelector.Builder().requireLensFacing(1).build();
        AbstractC9133u.m16132f(cameraSelectorBuild, "Builder().requireLensFacing(CameraSelector.LENS_FACING_BACK)\n                .build()");
        Preview previewBuild = new Preview.Builder().setTargetAspectRatio(0).build();
        AbstractC9133u.m16132f(previewBuild, "Builder()\n            .setTargetAspectRatio(AspectRatio.RATIO_4_3)\n            .build()");
        this.imageCapture = new ImageCapture.Builder().setTargetAspectRatio(0).build();
        ProcessCameraProvider processCameraProvider = this.cameraProvider;
        if (processCameraProvider != null) {
            processCameraProvider.unbindAll();
        }
        try {
            ProcessCameraProvider processCameraProvider2 = this.cameraProvider;
            if (processCameraProvider2 != null && (cameraBindToLifecycle = processCameraProvider2.bindToLifecycle(this, cameraSelectorBuild, previewBuild, this.imageCapture)) != null) {
                this.mCameraControl = cameraBindToLifecycle.getCameraControl();
                cameraBindToLifecycle.getCameraControl().enableTorch(((FragmentImagePickBinding) getMBindView()).f9820c.isChecked());
            }
            previewBuild.setSurfaceProvider(((FragmentImagePickBinding) getMBindView()).f9821d.getSurfaceProvider());
        } catch (Exception e10) {
            Log.e(TAG, "Use case binding failed", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImagePickFragmentArgs getArgs() {
        return (ImagePickFragmentArgs) this.args$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initView$lambda-1, reason: not valid java name */
    public static final void m27488initView$lambda1(ImagePickFragment this$0, View view) {
        AbstractC9133u.m16133g(this$0, "this$0");
        this$0.takePic();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initView$lambda-2, reason: not valid java name */
    public static final void m27489initView$lambda2(ImagePickFragment this$0, View view) {
        AbstractC9133u.m16133g(this$0, "this$0");
        FragmentKt.findNavController(this$0).navigateUp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initView$lambda-3, reason: not valid java name */
    public static final void m27490initView$lambda3(ImagePickFragment this$0, CompoundButton compoundButton, boolean z10) {
        AbstractC9133u.m16133g(this$0, "this$0");
        CameraControl cameraControl = this$0.mCameraControl;
        if (cameraControl == null) {
            return;
        }
        cameraControl.enableTorch(z10);
    }

    private final void requestCameraPermission() {
        this.requestPermissionLauncher.launch("android.permission.CAMERA");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: requestPermissionLauncher$lambda-0, reason: not valid java name */
    public static final void m27491requestPermissionLauncher$lambda0(ImagePickFragment this$0, boolean z10) {
        AbstractC9133u.m16133g(this$0, "this$0");
        if (z10) {
            this$0.startCamera();
        } else {
            XToastUtils.INSTANCE.warning(R$string.no_camera_permission);
            FragmentKt.findNavController(this$0).navigateUp();
        }
    }

    private final void setUpCamera() {
        final ListenableFuture<ProcessCameraProvider> processCameraProvider = ProcessCameraProvider.getInstance(requireContext());
        processCameraProvider.addListener(new Runnable() { // from class: j3.j
            @Override // java.lang.Runnable
            public final void run() {
                ImagePickFragment.m27492setUpCamera$lambda5$lambda4(this.f17196a, processCameraProvider);
            }
        }, ContextCompat.getMainExecutor(getContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setUpCamera$lambda-5$lambda-4, reason: not valid java name */
    public static final void m27492setUpCamera$lambda5$lambda4(ImagePickFragment this$0, ListenableFuture this_run) {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(this_run, "$this_run");
        this$0.cameraProvider = (ProcessCameraProvider) this_run.get();
        this$0.bindCameraUseCases();
    }

    private final void startCamera() {
        setUpCamera();
    }

    private final void takePic() {
        final File file = new File(requireContext().getExternalCacheDir(), System.currentTimeMillis() + ".jpg");
        ImageCapture.OutputFileOptions outputFileOptionsBuild = new ImageCapture.OutputFileOptions.Builder(file).build();
        AbstractC9133u.m16132f(outputFileOptionsBuild, "Builder(\n                file\n            ).build()");
        ImageCapture imageCapture = this.imageCapture;
        if (imageCapture == null) {
            return;
        }
        imageCapture.takePicture(outputFileOptionsBuild, Executors.newSingleThreadExecutor(), new ImageCapture.OnImageSavedCallback() { // from class: com.zykj.image.ImagePickFragment.takePic.1
            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onError(ImageCaptureException exception) {
                AbstractC9133u.m16133g(exception, "exception");
                LifecycleOwnerKt.getLifecycleScope(ImagePickFragment.this).launchWhenResumed(new ImagePickFragment$takePic$1$onError$1(exception, null));
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onImageSaved(ImageCapture.OutputFileResults outputFileResults) {
                AbstractC9133u.m16133g(outputFileResults, "outputFileResults");
                LifecycleOwnerKt.getLifecycleScope(ImagePickFragment.this).launchWhenResumed(new ImagePickFragment$takePic$1$onImageSaved$1(file, ImagePickFragment.this, null));
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.zykj.base.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object initData(p179m7.InterfaceC9324c<? super p123h7.C8736p> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.zykj.image.ImagePickFragment.C73081
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.image.ImagePickFragment$initData$1 r0 = (com.zykj.image.ImagePickFragment.C73081) r0
            int r1 = r0.f9754d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9754d = r1
            goto L18
        L13:
            com.zykj.image.ImagePickFragment$initData$1 r0 = new com.zykj.image.ImagePickFragment$initData$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f9752b
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f9754d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f9751a
            com.zykj.image.ImagePickFragment r0 = (com.zykj.image.ImagePickFragment) r0
            kotlin.AbstractC9079b.m15926b(r5)
            goto L44
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.AbstractC9079b.m15926b(r5)
            r0.f9751a = r4
            r0.f9754d = r3
            java.lang.Object r5 = super.initData(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            r0 = r4
        L44:
            android.content.Context r5 = r0.requireContext()
            java.lang.String r1 = "android.permission.CAMERA"
            int r5 = androidx.core.content.ContextCompat.checkSelfPermission(r5, r1)
            if (r5 != 0) goto L54
            r0.startCamera()
            goto L57
        L54:
            r0.requestCameraPermission()
        L57:
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.image.ImagePickFragment.initData(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes4/com/zykj/image/ImagePickFragment.smali:914
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        ((FragmentImagePickBinding) getMBindView()).f9819b.setOnClickListener(new View.OnClickListener() { // from class: j3.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImagePickFragment.m27488initView$lambda1(this.f17193a, view);
            }
        });
        ((FragmentImagePickBinding) getMBindView()).f9818a.setOnClickListener(new View.OnClickListener() { // from class: j3.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImagePickFragment.m27489initView$lambda2(this.f17194a, view);
            }
        });
        ((FragmentImagePickBinding) getMBindView()).f9820c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: j3.i
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                ImagePickFragment.m27490initView$lambda3(this.f17195a, compoundButton, z10);
            }
        });
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_image_pick;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        CameraControl cameraControl = this.mCameraControl;
        if (cameraControl == null) {
            return;
        }
        cameraControl.enableTorch(((FragmentImagePickBinding) getMBindView()).f9820c.isChecked());
    }
}
