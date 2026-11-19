package com.zykj.image;

import android.media.AudioAttributes;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.Log;
import android.view.View;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Keep;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Preview;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.PlanarYUVLuminanceSource;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.HybridBinarizer;
import com.zykj.base.utils.XToastUtils;
import com.zykj.image.QRCodeFragment;
import com.zykj.image.databinding.FragmentQrCodeBinding;
import java.nio.ByteBuffer;
import java.util.Hashtable;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.AbstractC8726f;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.C8843i0;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@Keep
/* loaded from: classes4.dex */
public final class QRCodeFragment extends Hilt_QRCodeFragment {
    public static final C7311a Companion = new C7311a(null);
    public static final String RESULT_QR_KEY = "qr_code_key";
    public static final String RESULT_QR_TEXT = "qr_code_text";
    public static final String TAG = "QRCodeFragment";
    private ProcessCameraProvider cameraProvider;
    private CameraControl mCameraControl;
    private final ActivityResultLauncher<String> requestPermissionLauncher;

    /* renamed from: com.zykj.image.QRCodeFragment$a */
    public static final class C7311a {
        public /* synthetic */ C7311a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final byte[] m9233a(ImageProxy image) {
            AbstractC9133u.m16133g(image, "image");
            byte[] bArr = new byte[image.getWidth() * (image.getHeight() + (image.getHeight() / 2))];
            int i10 = 0;
            ByteBuffer buffer = image.getPlanes()[0].getBuffer();
            AbstractC9133u.m16132f(buffer, "image.planes[0].buffer");
            ByteBuffer buffer2 = image.getPlanes()[1].getBuffer();
            AbstractC9133u.m16132f(buffer2, "image.planes[1].buffer");
            ByteBuffer buffer3 = image.getPlanes()[2].getBuffer();
            AbstractC9133u.m16132f(buffer3, "image.planes[2].buffer");
            buffer.get(bArr, 0, image.getWidth() * image.getHeight());
            int rowStride = image.getPlanes()[1].getRowStride() - (image.getWidth() / 2);
            int width = image.getWidth() * image.getHeight();
            if (rowStride == 0) {
                buffer2.get(bArr, width, (image.getWidth() * image.getHeight()) / 4);
                buffer3.get(bArr, width + ((image.getWidth() * image.getHeight()) / 4), (image.getWidth() * image.getHeight()) / 4);
                return bArr;
            }
            int height = image.getHeight() / 2;
            if (height > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    buffer2.get(bArr, width, image.getWidth() / 2);
                    width += image.getWidth() / 2;
                    if (i11 < (image.getHeight() / 2) - 2) {
                        buffer2.position(buffer2.position() + rowStride);
                    }
                    if (i12 >= height) {
                        break;
                    }
                    i11 = i12;
                }
            }
            int height2 = image.getHeight() / 2;
            if (height2 > 0) {
                while (true) {
                    int i13 = i10 + 1;
                    buffer3.get(bArr, width, image.getWidth() / 2);
                    width += image.getWidth() / 2;
                    if (i10 < (image.getHeight() / 2) - 1) {
                        buffer3.position(buffer3.position() + rowStride);
                    }
                    if (i13 >= height2) {
                        break;
                    }
                    i10 = i13;
                }
            }
            return bArr;
        }

        public C7311a() {
        }
    }

    /* renamed from: com.zykj.image.QRCodeFragment$b */
    public static final class C7312b implements ImageAnalysis.Analyzer, ResultPointCallback {

        /* renamed from: a */
        public final int f9767a;

        /* renamed from: b */
        public final int f9768b;

        /* renamed from: c */
        public final ViewfinderView f9769c;

        /* renamed from: d */
        public final InterfaceC10570l f9770d;

        /* renamed from: e */
        public float f9771e;

        /* renamed from: f */
        public float f9772f;

        /* renamed from: g */
        public float f9773g;

        /* renamed from: h */
        public float f9774h;

        /* renamed from: i */
        public final MultiFormatReader f9775i;

        public C7312b(int i10, int i11, ViewfinderView viewFinder, InterfaceC10570l handlerResult) {
            AbstractC9133u.m16133g(viewFinder, "viewFinder");
            AbstractC9133u.m16133g(handlerResult, "handlerResult");
            this.f9767a = i10;
            this.f9768b = i11;
            this.f9769c = viewFinder;
            this.f9770d = handlerResult;
            this.f9771e = 1.0f;
            this.f9772f = 1.0f;
            MultiFormatReader multiFormatReader = new MultiFormatReader();
            Vector vector = new Vector();
            Vector vector2 = new Vector();
            vector2.add(BarcodeFormat.UPC_A);
            vector2.add(BarcodeFormat.UPC_E);
            vector2.add(BarcodeFormat.EAN_13);
            vector2.add(BarcodeFormat.EAN_8);
            vector2.add(BarcodeFormat.CODE_39);
            vector2.add(BarcodeFormat.CODE_93);
            vector2.add(BarcodeFormat.CODE_128);
            vector2.add(BarcodeFormat.ITF);
            vector2.add(BarcodeFormat.QR_CODE);
            vector2.add(BarcodeFormat.DATA_MATRIX);
            vector.addAll(vector2);
            Hashtable hashtable = new Hashtable(3);
            hashtable.put(DecodeHintType.POSSIBLE_FORMATS, vector);
            hashtable.put(DecodeHintType.NEED_RESULT_POINT_CALLBACK, this);
            multiFormatReader.setHints(hashtable);
            C8736p c8736p = C8736p.f16368a;
            this.f9775i = multiFormatReader;
        }

        /* renamed from: a */
        public final InterfaceC10570l m9234a() {
            return this.f9770d;
        }

        @Override // androidx.camera.core.ImageAnalysis.Analyzer
        public void analyze(ImageProxy imageProxy) {
            AbstractC9133u.m16133g(imageProxy, "imageProxy");
            if (35 != imageProxy.getFormat()) {
                imageProxy.close();
                return;
            }
            this.f9771e = (imageProxy.getWidth() * 1.0f) / this.f9767a;
            this.f9772f = (imageProxy.getHeight() * 1.0f) / this.f9768b;
            float width = this.f9769c.getWidth() * this.f9771e;
            float height = this.f9769c.getHeight() * this.f9772f;
            float f10 = 2;
            this.f9773g = (imageProxy.getWidth() - width) / f10;
            this.f9774h = (imageProxy.getHeight() - height) / f10;
            try {
                PlanarYUVLuminanceSource planarYUVLuminanceSource = new PlanarYUVLuminanceSource(QRCodeFragment.Companion.m9233a(imageProxy), imageProxy.getWidth(), imageProxy.getHeight(), (int) this.f9773g, (int) this.f9774h, (int) width, (int) height, false);
                imageProxy.close();
                try {
                    Result resultDecodeWithState = this.f9775i.decodeWithState(new BinaryBitmap(new HybridBinarizer(planarYUVLuminanceSource)));
                    resultDecodeWithState.getText();
                    resultDecodeWithState.getTimestamp();
                    InterfaceC10570l interfaceC10570lM9234a = m9234a();
                    String text = resultDecodeWithState.getText();
                    AbstractC9133u.m16132f(text, "decode.text");
                    interfaceC10570lM9234a.invoke(text);
                } catch (NotFoundException unused) {
                }
            } catch (Throwable th) {
                imageProxy.close();
                th.printStackTrace();
            }
        }

        /* renamed from: b */
        public final ViewfinderView m9235b() {
            return this.f9769c;
        }

        @Override // com.google.zxing.ResultPointCallback
        public void foundPossibleResultPoint(ResultPoint resultPoint) {
            if (resultPoint == null) {
                return;
            }
            m9235b().m9236a(new ResultPoint(resultPoint.getX() / this.f9771e, resultPoint.getY() / this.f9772f));
        }
    }

    public QRCodeFragment() {
        ActivityResultLauncher<String> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback() { // from class: j3.p
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                QRCodeFragment.m27494requestPermissionLauncher$lambda0(this.f17208a, ((Boolean) obj).booleanValue());
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
        ImageAnalysis imageAnalysisBuild = new ImageAnalysis.Builder().setTargetAspectRatio(0).build();
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        int width = ((FragmentQrCodeBinding) getMBindView()).f9827b.getWidth();
        int height = ((FragmentQrCodeBinding) getMBindView()).f9827b.getHeight();
        ViewfinderView viewfinderView = ((FragmentQrCodeBinding) getMBindView()).f9829d;
        AbstractC9133u.m16132f(viewfinderView, "mBindView.viewFinder");
        imageAnalysisBuild.setAnalyzer(executorServiceNewSingleThreadExecutor, new C7312b(width, height, viewfinderView, new InterfaceC10570l() { // from class: com.zykj.image.QRCodeFragment$bindCameraUseCases$imageAnalyzer$1$1

            @InterfaceC9539d(m17800c = "com.zykj.image.QRCodeFragment$bindCameraUseCases$imageAnalyzer$1$1$1", m17801f = "QRCodeFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
            /* renamed from: com.zykj.image.QRCodeFragment$bindCameraUseCases$imageAnalyzer$1$1$1 */
            public static final class C73131 extends SuspendLambda implements InterfaceC10574p {

                /* renamed from: a */
                public int f9777a;

                /* renamed from: b */
                public final /* synthetic */ QRCodeFragment f9778b;

                /* renamed from: c */
                public final /* synthetic */ String f9779c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C73131(QRCodeFragment qRCodeFragment, String str, InterfaceC9324c interfaceC9324c) {
                    super(2, interfaceC9324c);
                    this.f9778b = qRCodeFragment;
                    this.f9779c = str;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                    return new C73131(this.f9778b, this.f9779c, interfaceC9324c);
                }

                @Override // p300x7.InterfaceC10574p
                public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                    return ((C73131) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    AbstractC9434a.m17291f();
                    if (this.f9777a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                    Object systemService = this.f9778b.requireActivity().getSystemService("vibrator");
                    if (systemService == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.os.Vibrator");
                    }
                    ((Vibrator) systemService).vibrate(200L, (AudioAttributes) null);
                    FragmentKt.setFragmentResult(this.f9778b, QRCodeFragment.RESULT_QR_KEY, BundleKt.bundleOf(AbstractC8726f.m14230a(QRCodeFragment.RESULT_QR_TEXT, this.f9779c)));
                    androidx.navigation.fragment.FragmentKt.findNavController(this.f9778b).navigateUp();
                    return C8736p.f16368a;
                }
            }

            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return C8736p.f16368a;
            }

            public final void invoke(String result) {
                AbstractC9133u.m16133g(result, "result");
                AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(this.f9776a), C8843i0.m14868c(), null, new C73131(this.f9776a, result, null), 2, null);
            }
        }));
        AbstractC9133u.m16132f(imageAnalysisBuild, "Builder()\n            .setTargetAspectRatio(AspectRatio.RATIO_4_3)\n            .build().apply {\n                this@apply.setAnalyzer(\n                    Executors.newSingleThreadExecutor(),\n                    QrCodeAnalyzer(\n                        mBindView.prevView.width,\n                        mBindView.prevView.height,\n                        mBindView.viewFinder\n                    ) { result ->\n                        lifecycleScope.launch(Dispatchers.Main) {\n\n                            val vibrator =\n                                requireActivity().getSystemService(Context.VIBRATOR_SERVICE) as Vibrator\n                            vibrator.vibrate(200L, null)\n\n                            setFragmentResult(\n                                RESULT_QR_KEY,\n                                bundleOf(RESULT_QR_TEXT to result)\n                            )\n\n                            findNavController().navigateUp()\n                        }\n                    }\n                )\n            }");
        ProcessCameraProvider processCameraProvider = this.cameraProvider;
        if (processCameraProvider != null) {
            processCameraProvider.unbindAll();
        }
        try {
            ProcessCameraProvider processCameraProvider2 = this.cameraProvider;
            if (processCameraProvider2 != null && (cameraBindToLifecycle = processCameraProvider2.bindToLifecycle(this, cameraSelectorBuild, previewBuild, imageAnalysisBuild)) != null) {
                this.mCameraControl = cameraBindToLifecycle.getCameraControl();
            }
            previewBuild.setSurfaceProvider(((FragmentQrCodeBinding) getMBindView()).f9827b.getSurfaceProvider());
        } catch (Exception e10) {
            Log.e(TAG, "Use case binding failed", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initView$lambda-1, reason: not valid java name */
    public static final void m27493initView$lambda1(QRCodeFragment this$0, View view) {
        AbstractC9133u.m16133g(this$0, "this$0");
        androidx.navigation.fragment.FragmentKt.findNavController(this$0).navigateUp();
    }

    private final void requestCameraPermission() {
        this.requestPermissionLauncher.launch("android.permission.CAMERA");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: requestPermissionLauncher$lambda-0, reason: not valid java name */
    public static final void m27494requestPermissionLauncher$lambda0(QRCodeFragment this$0, boolean z10) {
        AbstractC9133u.m16133g(this$0, "this$0");
        if (z10) {
            this$0.startCamera();
        } else {
            XToastUtils.INSTANCE.warning(R$string.no_camera_permission);
            androidx.navigation.fragment.FragmentKt.findNavController(this$0).navigateUp();
        }
    }

    private final void setUpCamera() {
        final ListenableFuture<ProcessCameraProvider> processCameraProvider = ProcessCameraProvider.getInstance(requireContext());
        processCameraProvider.addListener(new Runnable() { // from class: j3.n
            @Override // java.lang.Runnable
            public final void run() {
                QRCodeFragment.m27495setUpCamera$lambda3$lambda2(this.f17205a, processCameraProvider);
            }
        }, ContextCompat.getMainExecutor(getContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setUpCamera$lambda-3$lambda-2, reason: not valid java name */
    public static final void m27495setUpCamera$lambda3$lambda2(QRCodeFragment this$0, ListenableFuture this_run) {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(this_run, "$this_run");
        this$0.cameraProvider = (ProcessCameraProvider) this_run.get();
        this$0.bindCameraUseCases();
    }

    private final void startCamera() {
        setUpCamera();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        if (ContextCompat.checkSelfPermission(requireContext(), "android.permission.CAMERA") == 0) {
            startCamera();
        } else {
            requestCameraPermission();
        }
        ((FragmentQrCodeBinding) getMBindView()).f9826a.setOnClickListener(new View.OnClickListener() { // from class: j3.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QRCodeFragment.m27493initView$lambda1(this.f17207a, view);
            }
        });
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_qr_code;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ProcessCameraProvider processCameraProvider = this.cameraProvider;
        if (processCameraProvider == null) {
            return;
        }
        processCameraProvider.unbindAll();
    }
}
