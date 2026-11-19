package com.friday.common.camera;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.Preview;
import androidx.camera.core.ZoomState;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blankj.utilcode.util.ClickUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.friday.common.R$string;
import com.friday.common.camera.ImagePickFragment;
import com.friday.common.databinding.FragmentImagePickBinding;
import com.friday.common.entity.EventBusKey;
import com.google.common.util.concurrent.ListenableFuture;
import com.jeremyliao.liveeventbus.LiveEventBus;
import java.io.File;
import java.util.concurrent.Executors;
import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9529a;
import p211jd.AbstractC9719c;
import p309qc.InterfaceC10773d;
import sd.AbstractC11117h;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class ImagePickFragment extends Hilt_ImagePickFragment {

    /* renamed from: x */
    public static final C5935a f5700x = new C5935a(null);

    /* renamed from: y */
    public static final int f5701y = 8;

    /* renamed from: i */
    public final InterfaceC10773d f5702i;

    /* renamed from: j */
    public ProcessCameraProvider f5703j;

    /* renamed from: k */
    public ImageCapture f5704k;

    /* renamed from: l */
    public CameraControl f5705l;

    /* renamed from: m */
    public FragmentImagePickBinding f5706m;

    /* renamed from: n */
    public Camera f5707n;

    /* renamed from: o */
    public CameraBean f5708o;

    /* renamed from: p */
    public Preview f5709p;

    /* renamed from: q */
    public final ActivityResultLauncher f5710q;

    /* renamed from: r */
    public float f5711r;

    /* renamed from: s */
    public float f5712s;

    /* renamed from: t */
    public float f5713t;

    /* renamed from: u */
    public float f5714u;

    /* renamed from: v */
    public float f5715v;

    /* renamed from: w */
    public InterfaceC10045g f5716w;

    /* renamed from: com.friday.common.camera.ImagePickFragment$a */
    public static final class C5935a {
        public /* synthetic */ C5935a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final ImagePickFragment m4887a(CameraBean cameraBean) {
            AbstractC9979u.m20294g(cameraBean, "cameraBean");
            Bundle bundle = new Bundle();
            bundle.putParcelable("CAMERA_BEAN", cameraBean);
            ImagePickFragment imagePickFragment = new ImagePickFragment();
            imagePickFragment.setArguments(bundle);
            return imagePickFragment;
        }

        public C5935a() {
        }
    }

    /* renamed from: com.friday.common.camera.ImagePickFragment$b */
    public static final class ViewTreeObserverOnGlobalLayoutListenerC5936b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: c */
        public final /* synthetic */ View f5721c;

        /* renamed from: d */
        public final /* synthetic */ ImagePickFragment f5722d;

        /* renamed from: e */
        public final /* synthetic */ ScaleGestureDetector f5723e;

        public ViewTreeObserverOnGlobalLayoutListenerC5936b(View view, ImagePickFragment imagePickFragment, ScaleGestureDetector scaleGestureDetector) {
            this.f5721c = view;
            this.f5722d = imagePickFragment;
            this.f5723e = scaleGestureDetector;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.f5721c.getMeasuredWidth() <= 0 || this.f5721c.getMeasuredHeight() <= 0) {
                return;
            }
            this.f5721c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            FragmentImagePickBinding fragmentImagePickBinding = this.f5722d.f5706m;
            if (fragmentImagePickBinding == null) {
                AbstractC9979u.m20312y("mBindView");
                fragmentImagePickBinding = null;
            }
            fragmentImagePickBinding.f6002j.setOnTouchListener(this.f5722d.new ViewOnTouchListenerC5938c(this.f5723e));
        }
    }

    /* renamed from: com.friday.common.camera.ImagePickFragment$c */
    public static final class ViewOnTouchListenerC5938c implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ ScaleGestureDetector f5730d;

        public ViewOnTouchListenerC5938c(ScaleGestureDetector scaleGestureDetector) {
            this.f5730d = scaleGestureDetector;
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getActionMasked() == 0) {
                FragmentImagePickBinding fragmentImagePickBinding = ImagePickFragment.this.f5706m;
                FragmentImagePickBinding fragmentImagePickBinding2 = null;
                if (fragmentImagePickBinding == null) {
                    AbstractC9979u.m20312y("mBindView");
                    fragmentImagePickBinding = null;
                }
                CardView cvZoomValue = fragmentImagePickBinding.f5998f;
                AbstractC9979u.m20293f(cvZoomValue, "cvZoomValue");
                cvZoomValue.setVisibility(0);
                FragmentImagePickBinding fragmentImagePickBinding3 = ImagePickFragment.this.f5706m;
                if (fragmentImagePickBinding3 == null) {
                    AbstractC9979u.m20312y("mBindView");
                } else {
                    fragmentImagePickBinding2 = fragmentImagePickBinding3;
                }
                ZoomControlView dbView = fragmentImagePickBinding2.f5999g;
                AbstractC9979u.m20293f(dbView, "dbView");
                dbView.setVisibility(8);
                ImagePickFragment.this.m4886U();
            } else if (motionEvent.getActionMasked() == 1) {
                ImagePickFragment.this.m4860H().m4830h(motionEvent.getX(), motionEvent.getY());
            }
            this.f5730d.onTouchEvent(motionEvent);
            return true;
        }
    }

    /* renamed from: com.friday.common.camera.ImagePickFragment$d */
    public static final class C5939d extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public C5939d() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector detector) {
            AbstractC9979u.m20294g(detector, "detector");
            if (ImagePickFragment.this.f5707n == null) {
                return true;
            }
            Camera camera = ImagePickFragment.this.f5707n;
            FragmentImagePickBinding fragmentImagePickBinding = null;
            if (camera == null) {
                AbstractC9979u.m20312y("camera");
                camera = null;
            }
            ZoomState value = camera.getCameraInfo().getZoomState().getValue();
            if (value == null) {
                return true;
            }
            Float fValueOf = Float.valueOf(value.getZoomRatio() * detector.getScaleFactor());
            ImagePickFragment imagePickFragment = ImagePickFragment.this;
            double dM19281c = AbstractC9719c.m19281c(fValueOf.floatValue() * 10.0d) / 10.0d;
            FragmentImagePickBinding fragmentImagePickBinding2 = imagePickFragment.f5706m;
            if (fragmentImagePickBinding2 == null) {
                AbstractC9979u.m20312y("mBindView");
                fragmentImagePickBinding2 = null;
            }
            fragmentImagePickBinding2.f5999g.setRealTimeValue((float) dM19281c);
            FragmentImagePickBinding fragmentImagePickBinding3 = imagePickFragment.f5706m;
            if (fragmentImagePickBinding3 == null) {
                AbstractC9979u.m20312y("mBindView");
            } else {
                fragmentImagePickBinding = fragmentImagePickBinding3;
            }
            imagePickFragment.m4885T(fragmentImagePickBinding.f5999g.getRealTimeValue());
            imagePickFragment.m4886U();
            return true;
        }
    }

    public ImagePickFragment() {
        final InterfaceC9529a interfaceC9529a = null;
        this.f5702i = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9983y.m20315b(CameraViewModel.class), new InterfaceC9529a() { // from class: com.friday.common.camera.ImagePickFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.friday.common.camera.ImagePickFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC9529a interfaceC9529a2 = interfaceC9529a;
                return (interfaceC9529a2 == null || (creationExtras = (CreationExtras) interfaceC9529a2.invoke()) == null) ? this.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
            }
        }, new InterfaceC9529a() { // from class: com.friday.common.camera.ImagePickFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback() { // from class: b2.p
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ImagePickFragment.m4864M(this.f2991a, ((Boolean) obj).booleanValue());
            }
        });
        AbstractC9979u.m20293f(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.f5710q = activityResultLauncherRegisterForActivityResult;
    }

    /* renamed from: E */
    public static final void m4858E(ImagePickFragment imagePickFragment, View view) {
        InterfaceC10045g interfaceC10045g;
        AbstractC9979u.m20291d(view);
        view.setVisibility(8);
        FragmentImagePickBinding fragmentImagePickBinding = imagePickFragment.f5706m;
        if (fragmentImagePickBinding == null) {
            AbstractC9979u.m20312y("mBindView");
            fragmentImagePickBinding = null;
        }
        ZoomControlView dbView = fragmentImagePickBinding.f5999g;
        AbstractC9979u.m20293f(dbView, "dbView");
        dbView.setVisibility(0);
        InterfaceC10045g interfaceC10045g2 = imagePickFragment.f5716w;
        if (interfaceC10045g2 == null || !interfaceC10045g2.isActive() || (interfaceC10045g = imagePickFragment.f5716w) == null) {
            return;
        }
        InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
    }

    /* renamed from: F */
    public static final boolean m4859F(ImagePickFragment imagePickFragment, View view, MotionEvent motionEvent) {
        InterfaceC10045g interfaceC10045g;
        int actionMasked = motionEvent.getActionMasked();
        FragmentImagePickBinding fragmentImagePickBinding = null;
        if (actionMasked == 0) {
            InterfaceC10045g interfaceC10045g2 = imagePickFragment.f5716w;
            if (interfaceC10045g2 != null && interfaceC10045g2.isActive() && (interfaceC10045g = imagePickFragment.f5716w) != null) {
                InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
            }
            imagePickFragment.f5714u = motionEvent.getRawX();
            imagePickFragment.f5715v = motionEvent.getRawY();
            imagePickFragment.f5711r = motionEvent.getY();
        } else if (actionMasked == 1) {
            Rect rect = new Rect();
            FragmentImagePickBinding fragmentImagePickBinding2 = imagePickFragment.f5706m;
            if (fragmentImagePickBinding2 == null) {
                AbstractC9979u.m20312y("mBindView");
                fragmentImagePickBinding2 = null;
            }
            fragmentImagePickBinding2.f5996d.getGlobalVisibleRect(rect);
            if (motionEvent.getRawX() >= rect.left && motionEvent.getRawX() <= rect.right && motionEvent.getRawY() >= rect.top) {
                float rawY = motionEvent.getRawY();
                int i10 = rect.bottom;
                if (rawY <= i10) {
                    float f10 = imagePickFragment.f5714u;
                    if (f10 >= rect.left && f10 <= rect.right) {
                        float f11 = imagePickFragment.f5715v;
                        if (f11 >= rect.top && f11 <= i10) {
                            FragmentImagePickBinding fragmentImagePickBinding3 = imagePickFragment.f5706m;
                            if (fragmentImagePickBinding3 == null) {
                                AbstractC9979u.m20312y("mBindView");
                                fragmentImagePickBinding3 = null;
                            }
                            fragmentImagePickBinding3.f5996d.performClick();
                        }
                    }
                }
            }
            m4866R(imagePickFragment, 0L, 1, null);
            imagePickFragment.f5712s = 0.0f;
            imagePickFragment.f5713t = 0.0f;
        } else if (actionMasked == 2) {
            float y10 = motionEvent.getY() - imagePickFragment.f5711r;
            imagePickFragment.f5713t += y10 - imagePickFragment.f5712s;
            imagePickFragment.f5712s = y10;
            FragmentImagePickBinding fragmentImagePickBinding4 = imagePickFragment.f5706m;
            if (fragmentImagePickBinding4 == null) {
                AbstractC9979u.m20312y("mBindView");
                fragmentImagePickBinding4 = null;
            }
            float realTimeValue = fragmentImagePickBinding4.f5999g.getRealTimeValue();
            float f12 = imagePickFragment.f5713t;
            if (f12 > 5.0f) {
                FragmentImagePickBinding fragmentImagePickBinding5 = imagePickFragment.f5706m;
                if (fragmentImagePickBinding5 == null) {
                    AbstractC9979u.m20312y("mBindView");
                    fragmentImagePickBinding5 = null;
                }
                fragmentImagePickBinding5.f5999g.setRealTimeValue(realTimeValue - 0.1f);
            } else if (f12 < -5.0f) {
                FragmentImagePickBinding fragmentImagePickBinding6 = imagePickFragment.f5706m;
                if (fragmentImagePickBinding6 == null) {
                    AbstractC9979u.m20312y("mBindView");
                    fragmentImagePickBinding6 = null;
                }
                fragmentImagePickBinding6.f5999g.setRealTimeValue(0.1f + realTimeValue);
            }
            FragmentImagePickBinding fragmentImagePickBinding7 = imagePickFragment.f5706m;
            if (fragmentImagePickBinding7 == null) {
                AbstractC9979u.m20312y("mBindView");
                fragmentImagePickBinding7 = null;
            }
            if (fragmentImagePickBinding7.f5999g.getRealTimeValue() != realTimeValue) {
                imagePickFragment.f5713t = 0.0f;
                FragmentImagePickBinding fragmentImagePickBinding8 = imagePickFragment.f5706m;
                if (fragmentImagePickBinding8 == null) {
                    AbstractC9979u.m20312y("mBindView");
                } else {
                    fragmentImagePickBinding = fragmentImagePickBinding8;
                }
                imagePickFragment.m4885T(fragmentImagePickBinding.f5999g.getRealTimeValue());
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public final CameraViewModel m4860H() {
        return (CameraViewModel) this.f5702i.getValue();
    }

    /* renamed from: I */
    public static final void m4861I(ImagePickFragment imagePickFragment, View view) {
        if (imagePickFragment.f5708o != null) {
            FragmentImagePickBinding fragmentImagePickBinding = imagePickFragment.f5706m;
            if (fragmentImagePickBinding == null) {
                AbstractC9979u.m20312y("mBindView");
                fragmentImagePickBinding = null;
            }
            fragmentImagePickBinding.f5996d.setEnabled(false);
            imagePickFragment.m4884S();
        }
    }

    /* renamed from: J */
    public static final void m4862J(ImagePickFragment imagePickFragment, View view) {
        imagePickFragment.m4879G();
    }

    /* renamed from: K */
    public static final void m4863K(ImagePickFragment imagePickFragment, CompoundButton compoundButton, boolean z10) {
        CameraControl cameraControl = imagePickFragment.f5705l;
        if (cameraControl != null) {
            cameraControl.enableTorch(z10);
        }
    }

    /* renamed from: M */
    public static final void m4864M(ImagePickFragment imagePickFragment, boolean z10) {
        if (z10) {
            imagePickFragment.m4882P();
        } else {
            ToastUtils.showShort("没有拍照权限", new Object[0]);
            imagePickFragment.requireActivity().finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: O */
    public static final void m4865O(ImagePickFragment imagePickFragment, ListenableFuture listenableFuture) {
        imagePickFragment.f5703j = (ProcessCameraProvider) listenableFuture.get();
        imagePickFragment.m4878D();
    }

    /* renamed from: R */
    public static /* synthetic */ void m4866R(ImagePickFragment imagePickFragment, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 3000;
        }
        imagePickFragment.m4883Q(j10);
    }

    private final void initData() {
        Preview previewBuild = new Preview.Builder().setTargetAspectRatio(0).build();
        this.f5709p = previewBuild;
        if (previewBuild != null) {
            FragmentImagePickBinding fragmentImagePickBinding = this.f5706m;
            if (fragmentImagePickBinding == null) {
                AbstractC9979u.m20312y("mBindView");
                fragmentImagePickBinding = null;
            }
            previewBuild.setSurfaceProvider(fragmentImagePickBinding.f6002j.getSurfaceProvider());
        }
        if (ContextCompat.checkSelfPermission(requireContext(), "android.permission.CAMERA") == 0) {
            m4882P();
        } else {
            m4880L();
        }
    }

    private final void initView() {
        FragmentImagePickBinding fragmentImagePickBinding = this.f5706m;
        FragmentImagePickBinding fragmentImagePickBinding2 = null;
        if (fragmentImagePickBinding == null) {
            AbstractC9979u.m20312y("mBindView");
            fragmentImagePickBinding = null;
        }
        ClickUtils.applySingleDebouncing(fragmentImagePickBinding.f5996d, new View.OnClickListener() { // from class: b2.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImagePickFragment.m4861I(this.f2988c, view);
            }
        });
        FragmentImagePickBinding fragmentImagePickBinding3 = this.f5706m;
        if (fragmentImagePickBinding3 == null) {
            AbstractC9979u.m20312y("mBindView");
            fragmentImagePickBinding3 = null;
        }
        fragmentImagePickBinding3.f5995c.setOnClickListener(new View.OnClickListener() { // from class: b2.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImagePickFragment.m4862J(this.f2989c, view);
            }
        });
        FragmentImagePickBinding fragmentImagePickBinding4 = this.f5706m;
        if (fragmentImagePickBinding4 == null) {
            AbstractC9979u.m20312y("mBindView");
        } else {
            fragmentImagePickBinding2 = fragmentImagePickBinding4;
        }
        fragmentImagePickBinding2.f5997e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: b2.o
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                ImagePickFragment.m4863K(this.f2990a, compoundButton, z10);
            }
        });
    }

    /* renamed from: D */
    public final void m4878D() {
        this.f5704k = new ImageCapture.Builder().setTargetAspectRatio(0).build();
        ProcessCameraProvider processCameraProvider = this.f5703j;
        if (processCameraProvider != null) {
            processCameraProvider.unbindAll();
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            CameraSelector cameraSelectorBuild = new CameraSelector.Builder().requireLensFacing(1).build();
            AbstractC9979u.m20293f(cameraSelectorBuild, "build(...)");
            Camera cameraBindToLifecycle = processCameraProvider.bindToLifecycle(viewLifecycleOwner, cameraSelectorBuild, this.f5704k, this.f5709p);
            this.f5705l = cameraBindToLifecycle.getCameraControl();
            this.f5707n = cameraBindToLifecycle;
        }
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(requireContext(), new C5939d());
        FragmentImagePickBinding fragmentImagePickBinding = this.f5706m;
        FragmentImagePickBinding fragmentImagePickBinding2 = null;
        if (fragmentImagePickBinding == null) {
            AbstractC9979u.m20312y("mBindView");
            fragmentImagePickBinding = null;
        }
        PreviewView prevView = fragmentImagePickBinding.f6002j;
        AbstractC9979u.m20293f(prevView, "prevView");
        prevView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC5936b(prevView, this, scaleGestureDetector));
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        AbstractC9979u.m20293f(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new ImagePickFragment$bindCameraUseCases$3(this, null), 3, null);
        FragmentImagePickBinding fragmentImagePickBinding3 = this.f5706m;
        if (fragmentImagePickBinding3 == null) {
            AbstractC9979u.m20312y("mBindView");
            fragmentImagePickBinding3 = null;
        }
        fragmentImagePickBinding3.f5999g.setOnTouchListener(new View.OnTouchListener() { // from class: b2.q
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return ImagePickFragment.m4859F(this.f2992c, view, motionEvent);
            }
        });
        FragmentImagePickBinding fragmentImagePickBinding4 = this.f5706m;
        if (fragmentImagePickBinding4 == null) {
            AbstractC9979u.m20312y("mBindView");
            fragmentImagePickBinding4 = null;
        }
        fragmentImagePickBinding4.f5998f.setOnClickListener(new View.OnClickListener() { // from class: b2.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImagePickFragment.m4858E(this.f2993c, view);
            }
        });
        Camera camera = this.f5707n;
        if (camera == null) {
            AbstractC9979u.m20312y("camera");
            camera = null;
        }
        ZoomState value = camera.getCameraInfo().getZoomState().getValue();
        if (value != null) {
            float maxZoomRatio = value.getMaxZoomRatio();
            FragmentImagePickBinding fragmentImagePickBinding5 = this.f5706m;
            if (fragmentImagePickBinding5 == null) {
                AbstractC9979u.m20312y("mBindView");
                fragmentImagePickBinding5 = null;
            }
            fragmentImagePickBinding5.f5999g.m4894d(AbstractC9719c.m19282d(maxZoomRatio));
        }
        FragmentImagePickBinding fragmentImagePickBinding6 = this.f5706m;
        if (fragmentImagePickBinding6 == null) {
            AbstractC9979u.m20312y("mBindView");
            fragmentImagePickBinding6 = null;
        }
        fragmentImagePickBinding6.f5999g.setRealTimeValue(m4860H().m4827e());
        m4885T(m4860H().m4827e());
        FragmentImagePickBinding fragmentImagePickBinding7 = this.f5706m;
        if (fragmentImagePickBinding7 == null) {
            AbstractC9979u.m20312y("mBindView");
        } else {
            fragmentImagePickBinding2 = fragmentImagePickBinding7;
        }
        fragmentImagePickBinding2.f6003k.setText(getString(R$string.zoom_control_value, String.valueOf(m4860H().m4827e())));
    }

    /* renamed from: G */
    public final void m4879G() {
        CameraBean cameraBean = this.f5708o;
        if (cameraBean != null && cameraBean.m4820l() == 0) {
            LiveEventBus.get(EventBusKey.KEY_CLASS_BITMAP, Bitmap.class).post(null);
        }
        requireActivity().finish();
    }

    /* renamed from: L */
    public final void m4880L() {
        this.f5710q.launch("android.permission.CAMERA");
    }

    /* renamed from: N */
    public final void m4881N() {
        ProcessCameraProvider.Companion companion = ProcessCameraProvider.Companion;
        Context contextRequireContext = requireContext();
        AbstractC9979u.m20293f(contextRequireContext, "requireContext(...)");
        final ListenableFuture<ProcessCameraProvider> companion2 = companion.getInstance(contextRequireContext);
        companion2.addListener(new Runnable() { // from class: b2.l
            @Override // java.lang.Runnable
            public final void run() {
                ImagePickFragment.m4865O(this.f2986c, companion2);
            }
        }, ContextCompat.getMainExecutor(requireContext()));
    }

    /* renamed from: P */
    public final void m4882P() {
        m4881N();
    }

    /* renamed from: Q */
    public final void m4883Q(long j10) {
        InterfaceC10045g interfaceC10045g = this.f5716w;
        if (interfaceC10045g != null) {
            InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        this.f5716w = AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new ImagePickFragment$startJob$1(j10, this, null), 3, null);
    }

    /* renamed from: S */
    public final void m4884S() {
        CameraBean cameraBean = this.f5708o;
        AbstractC9979u.m20291d(cameraBean);
        ImageCapture.OutputFileOptions outputFileOptionsBuild = new ImageCapture.OutputFileOptions.Builder(new File(cameraBean.m4817i())).build();
        AbstractC9979u.m20293f(outputFileOptionsBuild, "build(...)");
        ImageCapture imageCapture = this.f5704k;
        if (imageCapture != null) {
            imageCapture.takePicture(outputFileOptionsBuild, Executors.newSingleThreadExecutor(), new ImageCapture.OnImageSavedCallback() { // from class: com.friday.common.camera.ImagePickFragment$takePic$1
                @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
                public void onError(ImageCaptureException exception) {
                    AbstractC9979u.m20294g(exception, "exception");
                    ImagePickFragment imagePickFragment = this.f5736a;
                    try {
                        Result.C9921a c9921a = Result.f23263d;
                        LifecycleOwner viewLifecycleOwner = imagePickFragment.getViewLifecycleOwner();
                        AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                        Result.m20054c(AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new ImagePickFragment$takePic$1$onError$1$1(imagePickFragment, exception, null), 3, null));
                    } catch (Throwable th) {
                        Result.C9921a c9921a2 = Result.f23263d;
                        Result.m20054c(AbstractC9924b.m20070a(th));
                    }
                }

                @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
                public void onImageSaved(ImageCapture.OutputFileResults outputFileResults) {
                    AbstractC9979u.m20294g(outputFileResults, "outputFileResults");
                    try {
                        LifecycleOwner viewLifecycleOwner = this.f5736a.getViewLifecycleOwner();
                        AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new ImagePickFragment$takePic$1$onImageSaved$1(this.f5736a, null), 3, null);
                    } catch (IllegalStateException e10) {
                        e10.printStackTrace();
                    }
                }
            });
        }
    }

    /* renamed from: T */
    public final void m4885T(float f10) {
        CameraControl cameraControl = this.f5705l;
        if (cameraControl != null) {
            cameraControl.setZoomRatio(f10);
        }
        m4860H().m4829g(f10);
    }

    /* renamed from: U */
    public final void m4886U() {
        FragmentImagePickBinding fragmentImagePickBinding = this.f5706m;
        FragmentImagePickBinding fragmentImagePickBinding2 = null;
        if (fragmentImagePickBinding == null) {
            AbstractC9979u.m20312y("mBindView");
            fragmentImagePickBinding = null;
        }
        TextView textView = fragmentImagePickBinding.f6003k;
        int i10 = R$string.zoom_control_value;
        FragmentImagePickBinding fragmentImagePickBinding3 = this.f5706m;
        if (fragmentImagePickBinding3 == null) {
            AbstractC9979u.m20312y("mBindView");
        } else {
            fragmentImagePickBinding2 = fragmentImagePickBinding3;
        }
        textView.setText(getString(i10, String.valueOf(fragmentImagePickBinding2.f5999g.getRealTimeValue())));
    }

    @Override // com.friday.common.camera.Hilt_ImagePickFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        AbstractC9979u.m20294g(context, "context");
        super.onAttach(context);
        requireActivity().getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback() { // from class: com.friday.common.camera.ImagePickFragment$onAttach$callback$1
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                this.f5732a.m4879G();
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC9979u.m20294g(inflater, "inflater");
        FragmentImagePickBinding fragmentImagePickBindingM5236a = FragmentImagePickBinding.m5236a(inflater, viewGroup, false);
        AbstractC9979u.m20293f(fragmentImagePickBindingM5236a, "inflate(...)");
        this.f5706m = fragmentImagePickBindingM5236a;
        if (fragmentImagePickBindingM5236a == null) {
            AbstractC9979u.m20312y("mBindView");
            fragmentImagePickBindingM5236a = null;
        }
        View root = fragmentImagePickBindingM5236a.getRoot();
        AbstractC9979u.m20293f(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        CameraControl cameraControl = this.f5705l;
        if (cameraControl != null) {
            FragmentImagePickBinding fragmentImagePickBinding = this.f5706m;
            if (fragmentImagePickBinding == null) {
                AbstractC9979u.m20312y("mBindView");
                fragmentImagePickBinding = null;
            }
            cameraControl.enableTorch(fragmentImagePickBinding.f5997e.isChecked());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC9979u.m20294g(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        CameraBean cameraBean = arguments != null ? (CameraBean) arguments.getParcelable("CAMERA_BEAN") : null;
        this.f5708o = cameraBean;
        if (cameraBean == null) {
            throw new IllegalArgumentException("参数不对");
        }
        initView();
        initData();
    }
}
