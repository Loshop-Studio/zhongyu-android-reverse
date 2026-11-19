package androidx.camera.lifecycle;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.OptIn;
import androidx.annotation.VisibleForTesting;
import androidx.arch.core.util.Function;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraEffect;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraX;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.ExperimentalCameraInfo;
import androidx.camera.core.LayoutSettings;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.ViewPort;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraConfigProvider;
import androidx.camera.core.impl.CameraConfigs;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.ExtendedCameraConfigProviderStore;
import androidx.camera.core.impl.RestrictedCameraInfo;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import androidx.lifecycle.LifecycleOwner;
import androidx.tracing.Trace;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.C9114c0;
import p123h7.C8736p;
import p134i7.AbstractC8801r;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class ProcessCameraProvider implements LifecycleCameraProvider {
    public static final Companion Companion = new Companion(null);
    private static final ProcessCameraProvider sAppInstance = new ProcessCameraProvider();

    @GuardedBy("mLock")
    private final Map<CameraUseCaseAdapter.CameraId, RestrictedCameraInfo> mCameraInfoMap;
    private CameraX mCameraX;

    @GuardedBy("mLock")
    private CameraXConfig.Provider mCameraXConfigProvider;

    @GuardedBy("mLock")
    private ListenableFuture<CameraX> mCameraXInitializeFuture;

    @GuardedBy("mLock")
    private ListenableFuture<Void> mCameraXShutdownFuture;
    private Context mContext;
    private final LifecycleCameraRepository mLifecycleCameraRepository;
    private final Object mLock = new Object();

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ProcessCameraProvider getInstance$lambda$0(InterfaceC10570l tmp0, Object obj) {
            AbstractC9133u.m16133g(tmp0, "$tmp0");
            return (ProcessCameraProvider) tmp0.invoke(obj);
        }

        @ExperimentalCameraProviderConfiguration
        public final void configureInstance(CameraXConfig cameraXConfig) {
            AbstractC9133u.m16133g(cameraXConfig, "cameraXConfig");
            Trace.beginSection("CX:configureInstance");
            try {
                ProcessCameraProvider.sAppInstance.configureInstanceInternal(cameraXConfig);
                C8736p c8736p = C8736p.f16368a;
            } finally {
                Trace.endSection();
            }
        }

        public final ListenableFuture<ProcessCameraProvider> getInstance(final Context context) {
            AbstractC9133u.m16133g(context, "context");
            Preconditions.checkNotNull(context);
            ListenableFuture orCreateCameraXInstance = ProcessCameraProvider.sAppInstance.getOrCreateCameraXInstance(context);
            final InterfaceC10570l interfaceC10570l = new InterfaceC10570l() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$Companion$getInstance$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public final ProcessCameraProvider invoke(CameraX cameraX) {
                    ProcessCameraProvider processCameraProvider = ProcessCameraProvider.sAppInstance;
                    AbstractC9133u.m16132f(cameraX, "cameraX");
                    processCameraProvider.setCameraX(cameraX);
                    ProcessCameraProvider processCameraProvider2 = ProcessCameraProvider.sAppInstance;
                    Context applicationContext = ContextUtil.getApplicationContext(context);
                    AbstractC9133u.m16132f(applicationContext, "getApplicationContext(context)");
                    processCameraProvider2.setContext(applicationContext);
                    return ProcessCameraProvider.sAppInstance;
                }
            };
            ListenableFuture<ProcessCameraProvider> listenableFutureTransform = Futures.transform(orCreateCameraXInstance, new Function() { // from class: androidx.camera.lifecycle.d
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return ProcessCameraProvider.Companion.getInstance$lambda$0(interfaceC10570l, obj);
                }
            }, CameraXExecutors.directExecutor());
            AbstractC9133u.m16132f(listenableFutureTransform, "context: Context): Liste…tExecutor()\n            )");
            return listenableFutureTransform;
        }

        private Companion() {
        }
    }

    private ProcessCameraProvider() {
        ListenableFuture<Void> listenableFutureImmediateFuture = Futures.immediateFuture(null);
        AbstractC9133u.m16132f(listenableFutureImmediateFuture, "immediateFuture<Void>(null)");
        this.mCameraXShutdownFuture = listenableFutureImmediateFuture;
        this.mLifecycleCameraRepository = new LifecycleCameraRepository();
        this.mCameraInfoMap = new HashMap();
    }

    @ExperimentalCameraProviderConfiguration
    public static final void configureInstance(CameraXConfig cameraXConfig) {
        Companion.configureInstance(cameraXConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureInstanceInternal(final CameraXConfig cameraXConfig) {
        Trace.beginSection("CX:configureInstanceInternal");
        try {
            synchronized (this.mLock) {
                Preconditions.checkNotNull(cameraXConfig);
                Preconditions.checkState(this.mCameraXConfigProvider == null, "CameraX has already been configured. To use a different configuration, shutdown() must be called.");
                this.mCameraXConfigProvider = new CameraXConfig.Provider() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$configureInstanceInternal$1$1$1
                    @Override // androidx.camera.core.CameraXConfig.Provider
                    public final CameraXConfig getCameraXConfig() {
                        return cameraXConfig;
                    }
                };
                C8736p c8736p = C8736p.f16368a;
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CameraInfo> getActiveConcurrentCameraInfos() {
        CameraX cameraX = this.mCameraX;
        if (cameraX == null) {
            return new ArrayList();
        }
        AbstractC9133u.m16130d(cameraX);
        List<CameraInfo> activeConcurrentCameraInfos = cameraX.getCameraFactory().getCameraCoordinator().getActiveConcurrentCameraInfos();
        AbstractC9133u.m16132f(activeConcurrentCameraInfos, "mCameraX!!.cameraFactory…tiveConcurrentCameraInfos");
        return activeConcurrentCameraInfos;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CameraConfig getCameraConfig(CameraSelector cameraSelector, CameraInfo cameraInfo) {
        Iterator<CameraFilter> it = cameraSelector.getCameraFilterSet().iterator();
        CameraConfig cameraConfig = null;
        while (it.hasNext()) {
            CameraFilter next = it.next();
            AbstractC9133u.m16132f(next, "cameraSelector.cameraFilterSet");
            CameraFilter cameraFilter = next;
            if (!AbstractC9133u.m16128b(cameraFilter.getIdentifier(), CameraFilter.DEFAULT_ID)) {
                CameraConfigProvider configProvider = ExtendedCameraConfigProviderStore.getConfigProvider(cameraFilter.getIdentifier());
                Context context = this.mContext;
                AbstractC9133u.m16130d(context);
                CameraConfig config = configProvider.getConfig(cameraInfo, context);
                if (config == null) {
                    continue;
                } else {
                    if (cameraConfig != null) {
                        throw new IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                    }
                    cameraConfig = config;
                }
            }
        }
        return cameraConfig == null ? CameraConfigs.defaultConfig() : cameraConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCameraOperatingMode() {
        CameraX cameraX = this.mCameraX;
        if (cameraX == null) {
            return 0;
        }
        AbstractC9133u.m16130d(cameraX);
        return cameraX.getCameraFactory().getCameraCoordinator().getCameraOperatingMode();
    }

    public static final ListenableFuture<ProcessCameraProvider> getInstance(Context context) {
        return Companion.getInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ListenableFuture<CameraX> getOrCreateCameraXInstance(Context context) {
        synchronized (this.mLock) {
            ListenableFuture<CameraX> listenableFuture = this.mCameraXInitializeFuture;
            if (listenableFuture != null) {
                AbstractC9133u.m16131e(listenableFuture, "null cannot be cast to non-null type com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.CameraX>");
                return listenableFuture;
            }
            final CameraX cameraX = new CameraX(context, this.mCameraXConfigProvider);
            ListenableFuture<CameraX> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.lifecycle.a
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return ProcessCameraProvider.getOrCreateCameraXInstance$lambda$18$lambda$17(this.f870a, cameraX, completer);
                }
            });
            this.mCameraXInitializeFuture = future;
            AbstractC9133u.m16131e(future, "null cannot be cast to non-null type com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.CameraX>");
            return future;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getOrCreateCameraXInstance$lambda$18$lambda$17(ProcessCameraProvider this$0, final CameraX cameraX, final CallbackToFutureAdapter.Completer completer) {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(cameraX, "$cameraX");
        AbstractC9133u.m16133g(completer, "completer");
        synchronized (this$0.mLock) {
            FutureChain futureChainFrom = FutureChain.from(this$0.mCameraXShutdownFuture);
            final InterfaceC10570l interfaceC10570l = new InterfaceC10570l() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$getOrCreateCameraXInstance$1$1$1$future$1
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public final ListenableFuture<Void> invoke(Void r12) {
                    return cameraX.getInitializeFuture();
                }
            };
            FutureChain futureChainTransformAsync = futureChainFrom.transformAsync(new AsyncFunction() { // from class: androidx.camera.lifecycle.c
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final ListenableFuture apply(Object obj) {
                    return ProcessCameraProvider.m665xb817548d(interfaceC10570l, obj);
                }
            }, CameraXExecutors.directExecutor());
            AbstractC9133u.m16132f(futureChainTransformAsync, "cameraX = CameraX(contex…                        )");
            Futures.addCallback(futureChainTransformAsync, new FutureCallback<Void>() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$getOrCreateCameraXInstance$1$1$1$1
                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onFailure(Throwable t10) {
                    AbstractC9133u.m16133g(t10, "t");
                    completer.setException(t10);
                }

                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onSuccess(Void r22) {
                    completer.set(cameraX);
                }
            }, CameraXExecutors.directExecutor());
            C8736p c8736p = C8736p.f16368a;
        }
        return "ProcessCameraProvider-initializeCameraX";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getOrCreateCameraXInstance$lambda$18$lambda$17$lambda$16$lambda$15 */
    public static final ListenableFuture m665xb817548d(InterfaceC10570l tmp0, Object obj) {
        AbstractC9133u.m16133g(tmp0, "$tmp0");
        return (ListenableFuture) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPreview(UseCase useCase) {
        return useCase instanceof Preview;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isVideoCapture(UseCase useCase) {
        return useCase.getCurrentConfig().containsOption(UseCaseConfig.OPTION_CAPTURE_TYPE) && useCase.getCurrentConfig().getCaptureType() == UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setActiveConcurrentCameraInfos(List<? extends CameraInfo> list) {
        CameraX cameraX = this.mCameraX;
        if (cameraX == null) {
            return;
        }
        AbstractC9133u.m16130d(cameraX);
        cameraX.getCameraFactory().getCameraCoordinator().setActiveConcurrentCameraInfos(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCameraOperatingMode(int i10) {
        CameraX cameraX = this.mCameraX;
        if (cameraX == null) {
            return;
        }
        AbstractC9133u.m16130d(cameraX);
        cameraX.getCameraFactory().getCameraCoordinator().setCameraOperatingMode(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCameraX(CameraX cameraX) {
        this.mCameraX = cameraX;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setContext(Context context) {
        this.mContext = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void shutdownAsync$lambda$0(ProcessCameraProvider this$0) {
        AbstractC9133u.m16133g(this$0, "this$0");
        this$0.unbindAll();
        this$0.mLifecycleCameraRepository.clear();
    }

    @MainThread
    public final Camera bindToLifecycle(LifecycleOwner lifecycleOwner, CameraSelector cameraSelector, UseCase... useCases) {
        AbstractC9133u.m16133g(lifecycleOwner, "lifecycleOwner");
        AbstractC9133u.m16133g(cameraSelector, "cameraSelector");
        AbstractC9133u.m16133g(useCases, "useCases");
        Trace.beginSection("CX:bindToLifecycle");
        try {
            if (getCameraOperatingMode() == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
            }
            setCameraOperatingMode(1);
            LayoutSettings DEFAULT = LayoutSettings.DEFAULT;
            AbstractC9133u.m16132f(DEFAULT, "DEFAULT");
            AbstractC9133u.m16132f(DEFAULT, "DEFAULT");
            Camera cameraBindToLifecycle$camera_lifecycle_release = bindToLifecycle$camera_lifecycle_release(lifecycleOwner, cameraSelector, null, DEFAULT, DEFAULT, null, AbstractC8809v.m14771n(), (UseCase[]) Arrays.copyOf(useCases, useCases.length));
            Trace.endSection();
            return cameraBindToLifecycle$camera_lifecycle_release;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @OptIn(markerClass = {ExperimentalCameraInfo.class})
    public final Camera bindToLifecycle$camera_lifecycle_release(LifecycleOwner lifecycleOwner, CameraSelector primaryCameraSelector, CameraSelector cameraSelector, LayoutSettings primaryLayoutSettings, LayoutSettings secondaryLayoutSettings, ViewPort viewPort, List<? extends CameraEffect> effects, UseCase... useCases) {
        CameraInternal cameraInternal;
        RestrictedCameraInfo restrictedCameraInfo;
        AbstractC9133u.m16133g(lifecycleOwner, "lifecycleOwner");
        AbstractC9133u.m16133g(primaryCameraSelector, "primaryCameraSelector");
        AbstractC9133u.m16133g(primaryLayoutSettings, "primaryLayoutSettings");
        AbstractC9133u.m16133g(secondaryLayoutSettings, "secondaryLayoutSettings");
        AbstractC9133u.m16133g(effects, "effects");
        AbstractC9133u.m16133g(useCases, "useCases");
        Trace.beginSection("CX:bindToLifecycle-internal");
        try {
            Threads.checkMainThread();
            CameraX cameraX = this.mCameraX;
            AbstractC9133u.m16130d(cameraX);
            CameraInternal cameraInternalSelect = primaryCameraSelector.select(cameraX.getCameraRepository().getCameras());
            AbstractC9133u.m16132f(cameraInternalSelect, "primaryCameraSelector.se…cameraRepository.cameras)");
            cameraInternalSelect.setPrimary(true);
            CameraInfo cameraInfo = getCameraInfo(primaryCameraSelector);
            AbstractC9133u.m16131e(cameraInfo, "null cannot be cast to non-null type androidx.camera.core.impl.RestrictedCameraInfo");
            RestrictedCameraInfo restrictedCameraInfo2 = (RestrictedCameraInfo) cameraInfo;
            if (cameraSelector != null) {
                CameraX cameraX2 = this.mCameraX;
                AbstractC9133u.m16130d(cameraX2);
                CameraInternal cameraInternalSelect2 = cameraSelector.select(cameraX2.getCameraRepository().getCameras());
                cameraInternalSelect2.setPrimary(false);
                CameraInfo cameraInfo2 = getCameraInfo(cameraSelector);
                AbstractC9133u.m16131e(cameraInfo2, "null cannot be cast to non-null type androidx.camera.core.impl.RestrictedCameraInfo");
                cameraInternal = cameraInternalSelect2;
                restrictedCameraInfo = (RestrictedCameraInfo) cameraInfo2;
            } else {
                cameraInternal = null;
                restrictedCameraInfo = null;
            }
            LifecycleCamera lifecycleCamera = this.mLifecycleCameraRepository.getLifecycleCamera(lifecycleOwner, CameraUseCaseAdapter.generateCameraId(restrictedCameraInfo2, restrictedCameraInfo));
            Collection<LifecycleCamera> lifecycleCameras = this.mLifecycleCameraRepository.getLifecycleCameras();
            for (UseCase useCase : AbstractC8801r.m14729r0(useCases)) {
                for (LifecycleCamera lifecycleCameras2 : lifecycleCameras) {
                    AbstractC9133u.m16132f(lifecycleCameras2, "lifecycleCameras");
                    LifecycleCamera lifecycleCamera2 = lifecycleCameras2;
                    if (lifecycleCamera2.isBound(useCase) && !AbstractC9133u.m16128b(lifecycleCamera2, lifecycleCamera)) {
                        C9114c0 c9114c0 = C9114c0.f17482a;
                        String str = String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{useCase}, 1));
                        AbstractC9133u.m16132f(str, "format(format, *args)");
                        throw new IllegalStateException(str);
                    }
                }
            }
            if (lifecycleCamera == null) {
                LifecycleCameraRepository lifecycleCameraRepository = this.mLifecycleCameraRepository;
                CameraX cameraX3 = this.mCameraX;
                AbstractC9133u.m16130d(cameraX3);
                CameraCoordinator cameraCoordinator = cameraX3.getCameraFactory().getCameraCoordinator();
                CameraX cameraX4 = this.mCameraX;
                AbstractC9133u.m16130d(cameraX4);
                CameraDeviceSurfaceManager cameraDeviceSurfaceManager = cameraX4.getCameraDeviceSurfaceManager();
                CameraX cameraX5 = this.mCameraX;
                AbstractC9133u.m16130d(cameraX5);
                lifecycleCamera = lifecycleCameraRepository.createLifecycleCamera(lifecycleOwner, new CameraUseCaseAdapter(cameraInternalSelect, cameraInternal, restrictedCameraInfo2, restrictedCameraInfo, primaryLayoutSettings, secondaryLayoutSettings, cameraCoordinator, cameraDeviceSurfaceManager, cameraX5.getDefaultConfigFactory()));
            }
            LifecycleCamera lifecycleCamera3 = lifecycleCamera;
            if (useCases.length == 0) {
                AbstractC9133u.m16130d(lifecycleCamera3);
            } else {
                LifecycleCameraRepository lifecycleCameraRepository2 = this.mLifecycleCameraRepository;
                AbstractC9133u.m16130d(lifecycleCamera3);
                List listM14774q = AbstractC8809v.m14774q(Arrays.copyOf(useCases, useCases.length));
                CameraX cameraX6 = this.mCameraX;
                AbstractC9133u.m16130d(cameraX6);
                lifecycleCameraRepository2.bindToLifecycleCamera(lifecycleCamera3, viewPort, effects, listM14774q, cameraX6.getCameraFactory().getCameraCoordinator());
            }
            Trace.endSection();
            return lifecycleCamera3;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.camera.core.CameraProvider
    public List<CameraInfo> getAvailableCameraInfos() {
        Trace.beginSection("CX:getAvailableCameraInfos");
        try {
            ArrayList arrayList = new ArrayList();
            CameraX cameraX = this.mCameraX;
            AbstractC9133u.m16130d(cameraX);
            LinkedHashSet<CameraInternal> cameras = cameraX.getCameraRepository().getCameras();
            AbstractC9133u.m16132f(cameras, "mCameraX!!.cameraRepository.cameras");
            Iterator<CameraInternal> it = cameras.iterator();
            while (it.hasNext()) {
                CameraInfo cameraInfo = it.next().getCameraInfo();
                AbstractC9133u.m16132f(cameraInfo, "camera.cameraInfo");
                arrayList.add(cameraInfo);
            }
            return arrayList;
        } finally {
            Trace.endSection();
        }
    }

    @OptIn(markerClass = {ExperimentalCameraInfo.class})
    public final List<List<CameraInfo>> getAvailableConcurrentCameraInfos() {
        Trace.beginSection("CX:getAvailableConcurrentCameraInfos");
        try {
            Objects.requireNonNull(this.mCameraX);
            CameraX cameraX = this.mCameraX;
            AbstractC9133u.m16130d(cameraX);
            Objects.requireNonNull(cameraX.getCameraFactory().getCameraCoordinator());
            CameraX cameraX2 = this.mCameraX;
            AbstractC9133u.m16130d(cameraX2);
            List<List<CameraSelector>> concurrentCameraSelectors = cameraX2.getCameraFactory().getCameraCoordinator().getConcurrentCameraSelectors();
            AbstractC9133u.m16132f(concurrentCameraSelectors, "mCameraX!!.cameraFactory…concurrentCameraSelectors");
            ArrayList arrayList = new ArrayList();
            for (List<CameraSelector> list : concurrentCameraSelectors) {
                ArrayList arrayList2 = new ArrayList();
                for (CameraSelector cameraSelector : list) {
                    try {
                        AbstractC9133u.m16132f(cameraSelector, "cameraSelector");
                        arrayList2.add(getCameraInfo(cameraSelector));
                    } catch (IllegalArgumentException unused) {
                    }
                }
                arrayList.add(arrayList2);
            }
            Trace.endSection();
            return arrayList;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.camera.core.CameraProvider
    @ExperimentalCameraInfo
    public CameraInfo getCameraInfo(CameraSelector cameraSelector) {
        Object restrictedCameraInfo;
        AbstractC9133u.m16133g(cameraSelector, "cameraSelector");
        Trace.beginSection("CX:getCameraInfo");
        try {
            CameraX cameraX = this.mCameraX;
            AbstractC9133u.m16130d(cameraX);
            CameraInfoInternal cameraInfoInternal = cameraSelector.select(cameraX.getCameraRepository().getCameras()).getCameraInfoInternal();
            AbstractC9133u.m16132f(cameraInfoInternal, "cameraSelector.select(mC…meras).cameraInfoInternal");
            CameraConfig cameraConfig = getCameraConfig(cameraSelector, cameraInfoInternal);
            CameraUseCaseAdapter.CameraId cameraIdCreate = CameraUseCaseAdapter.CameraId.create(cameraInfoInternal.getCameraId(), cameraConfig.getCompatibilityId());
            AbstractC9133u.m16132f(cameraIdCreate, "create(\n                …ilityId\n                )");
            synchronized (this.mLock) {
                try {
                    restrictedCameraInfo = this.mCameraInfoMap.get(cameraIdCreate);
                    if (restrictedCameraInfo == null) {
                        restrictedCameraInfo = new RestrictedCameraInfo(cameraInfoInternal, cameraConfig);
                        this.mCameraInfoMap.put(cameraIdCreate, restrictedCameraInfo);
                    }
                    C8736p c8736p = C8736p.f16368a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return (RestrictedCameraInfo) restrictedCameraInfo;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.camera.core.CameraProvider
    public boolean hasCamera(CameraSelector cameraSelector) {
        boolean z10;
        AbstractC9133u.m16133g(cameraSelector, "cameraSelector");
        Trace.beginSection("CX:hasCamera");
        try {
            CameraX cameraX = this.mCameraX;
            AbstractC9133u.m16130d(cameraX);
            cameraSelector.select(cameraX.getCameraRepository().getCameras());
            z10 = true;
        } catch (IllegalArgumentException unused) {
            z10 = false;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
        Trace.endSection();
        return z10;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    public boolean isBound(UseCase useCase) {
        AbstractC9133u.m16133g(useCase, "useCase");
        for (LifecycleCamera lifecycleCamera : this.mLifecycleCameraRepository.getLifecycleCameras()) {
            AbstractC9133u.m16132f(lifecycleCamera, "mLifecycleCameraRepository.lifecycleCameras");
            if (lifecycleCamera.isBound(useCase)) {
                return true;
            }
        }
        return false;
    }

    @MainThread
    public final boolean isConcurrentCameraModeOn() {
        return getCameraOperatingMode() == 2;
    }

    @VisibleForTesting
    public final ListenableFuture<Void> shutdownAsync() {
        ListenableFuture<Void> listenableFutureImmediateFuture;
        Threads.runOnMainSync(new Runnable() { // from class: androidx.camera.lifecycle.b
            @Override // java.lang.Runnable
            public final void run() {
                ProcessCameraProvider.shutdownAsync$lambda$0(this.f872a);
            }
        });
        CameraX cameraX = this.mCameraX;
        if (cameraX != null) {
            AbstractC9133u.m16130d(cameraX);
            cameraX.getCameraFactory().getCameraCoordinator().shutdown();
        }
        CameraX cameraX2 = this.mCameraX;
        if (cameraX2 != null) {
            AbstractC9133u.m16130d(cameraX2);
            listenableFutureImmediateFuture = cameraX2.shutdown();
        } else {
            listenableFutureImmediateFuture = Futures.immediateFuture(null);
        }
        AbstractC9133u.m16132f(listenableFutureImmediateFuture, "if (mCameraX != null) mC…mediateFuture<Void>(null)");
        synchronized (this.mLock) {
            this.mCameraXConfigProvider = null;
            this.mCameraXInitializeFuture = null;
            this.mCameraXShutdownFuture = listenableFutureImmediateFuture;
            this.mCameraInfoMap.clear();
            C8736p c8736p = C8736p.f16368a;
        }
        this.mCameraX = null;
        this.mContext = null;
        return listenableFutureImmediateFuture;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    @MainThread
    public void unbind(UseCase... useCases) {
        AbstractC9133u.m16133g(useCases, "useCases");
        Trace.beginSection("CX:unbind");
        try {
            Threads.checkMainThread();
            if (getCameraOperatingMode() == 2) {
                throw new UnsupportedOperationException("Unbind usecase is not supported in concurrent camera mode, call unbindAll() first.");
            }
            this.mLifecycleCameraRepository.unbind(AbstractC8809v.m14774q(Arrays.copyOf(useCases, useCases.length)));
            C8736p c8736p = C8736p.f16368a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    @MainThread
    public void unbindAll() {
        Trace.beginSection("CX:unbindAll");
        try {
            Threads.checkMainThread();
            setCameraOperatingMode(0);
            this.mLifecycleCameraRepository.unbindAll();
            C8736p c8736p = C8736p.f16368a;
        } finally {
            Trace.endSection();
        }
    }

    @MainThread
    public final Camera bindToLifecycle(LifecycleOwner lifecycleOwner, CameraSelector cameraSelector, UseCaseGroup useCaseGroup) {
        AbstractC9133u.m16133g(lifecycleOwner, "lifecycleOwner");
        AbstractC9133u.m16133g(cameraSelector, "cameraSelector");
        AbstractC9133u.m16133g(useCaseGroup, "useCaseGroup");
        Trace.beginSection("CX:bindToLifecycle-UseCaseGroup");
        try {
            if (getCameraOperatingMode() != 2) {
                setCameraOperatingMode(1);
                LayoutSettings DEFAULT = LayoutSettings.DEFAULT;
                AbstractC9133u.m16132f(DEFAULT, "DEFAULT");
                AbstractC9133u.m16132f(DEFAULT, "DEFAULT");
                ViewPort viewPort = useCaseGroup.getViewPort();
                List<CameraEffect> effects = useCaseGroup.getEffects();
                AbstractC9133u.m16132f(effects, "useCaseGroup.effects");
                List<UseCase> useCases = useCaseGroup.getUseCases();
                AbstractC9133u.m16132f(useCases, "useCaseGroup.useCases");
                UseCase[] useCaseArr = (UseCase[]) useCases.toArray(new UseCase[0]);
                Camera cameraBindToLifecycle$camera_lifecycle_release = bindToLifecycle$camera_lifecycle_release(lifecycleOwner, cameraSelector, null, DEFAULT, DEFAULT, viewPort, effects, (UseCase[]) Arrays.copyOf(useCaseArr, useCaseArr.length));
                Trace.endSection();
                return cameraBindToLifecycle$camera_lifecycle_release;
            }
            throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first.");
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01f6 A[Catch: all -> 0x0267, TRY_ENTER, TryCatch #0 {all -> 0x0267, blocks: (B:50:0x01b5, B:52:0x01c3, B:61:0x0205, B:57:0x01f6, B:59:0x01fc, B:65:0x026c, B:66:0x0270, B:68:0x0276), top: B:87:0x01b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x026c A[Catch: all -> 0x0267, TryCatch #0 {all -> 0x0267, blocks: (B:50:0x01b5, B:52:0x01c3, B:61:0x0205, B:57:0x01f6, B:59:0x01fc, B:65:0x026c, B:66:0x0270, B:68:0x0276), top: B:87:0x01b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0276 A[Catch: all -> 0x0267, TRY_LEAVE, TryCatch #0 {all -> 0x0267, blocks: (B:50:0x01b5, B:52:0x01c3, B:61:0x0205, B:57:0x01f6, B:59:0x01fc, B:65:0x026c, B:66:0x0270, B:68:0x0276), top: B:87:0x01b5 }] */
    @androidx.annotation.OptIn(markerClass = {androidx.camera.core.ExperimentalCameraInfo.class})
    @androidx.annotation.MainThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.camera.core.ConcurrentCamera bindToLifecycle(java.util.List<androidx.camera.core.ConcurrentCamera.SingleCameraConfig> r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.lifecycle.ProcessCameraProvider.bindToLifecycle(java.util.List):androidx.camera.core.ConcurrentCamera");
    }
}
