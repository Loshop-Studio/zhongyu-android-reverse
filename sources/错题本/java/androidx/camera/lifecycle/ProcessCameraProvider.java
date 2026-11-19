package androidx.camera.lifecycle;

import android.content.Context;
import android.view.LifecycleOwner;
import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.OptIn;
import androidx.annotation.VisibleForTesting;
import androidx.arch.core.util.Function;
import androidx.camera.camera2.interop.C0304d;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraEffect;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraInfoUnavailableException;
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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.util.Preconditions;
import androidx.tracing.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.AbstractC5802q;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.EmptyList;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009a8.RunnableC0023a;
import p049e1.InterfaceFutureC5453a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\u0018\u0000 m2\u00020\u0001:\u0001mB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0\f\"\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0010\u0010\u0014J\u001f\u0010\u0010\u001a\u00020\u00182\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H\u0007¢\u0006\u0004\b\u0010\u0010\u0019Jk\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00152\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0\f\"\u0004\u0018\u00010\rH\u0001¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020\rH\u0016¢\u0006\u0004\b'\u0010(J'\u0010*\u001a\u00020)2\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0\f\"\u0004\u0018\u00010\rH\u0017¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020)H\u0017¢\u0006\u0004\b,\u0010\u0003J\u0017\u0010-\u001a\u00020&2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u0015H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020/2\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020&2\u0006\u0010%\u001a\u00020\rH\u0002¢\u0006\u0004\b4\u0010(J\u0017\u00105\u001a\u00020&2\u0006\u0010%\u001a\u00020\rH\u0002¢\u0006\u0004\b5\u0010(J\u001d\u00109\u001a\b\u0012\u0004\u0012\u0002080\u00042\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020)2\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b=\u0010>J\u001f\u0010A\u001a\u00020@2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010?\u001a\u00020/H\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020)2\u0006\u0010C\u001a\u000208H\u0002¢\u0006\u0004\bD\u0010EJ\u0017\u0010F\u001a\u00020)2\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u001e\u0010N\u001a\n\u0012\u0004\u0012\u000208\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bN\u0010OR$\u0010Q\u001a\u0010\u0012\f\u0012\n P*\u0004\u0018\u00010\u00050\u00050\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bQ\u0010OR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010U\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010W\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR \u0010\\\u001a\u000e\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020[0Y8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u001d\u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u00150\u00158G¢\u0006\u0006\u001a\u0004\b^\u00101R\u0011\u0010`\u001a\u00020&8G¢\u0006\u0006\u001a\u0004\b`\u0010aR$\u0010c\u001a\u00020b2\u0006\u0010c\u001a\u00020b8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR0\u0010l\u001a\b\u0012\u0004\u0012\u00020/0\u00152\f\u0010h\u001a\b\u0012\u0004\u0012\u00020/0\u00158B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bi\u00101\"\u0004\bj\u0010k¨\u0006n"}, m5110d2 = {"Landroidx/camera/lifecycle/ProcessCameraProvider;", "Landroidx/camera/lifecycle/LifecycleCameraProvider;", "<init>", "()V", "Le1/a;", "Ljava/lang/Void;", "shutdownAsync", "()Le1/a;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/camera/core/CameraSelector;", "cameraSelector", "", "Landroidx/camera/core/UseCase;", "useCases", "Landroidx/camera/core/Camera;", "bindToLifecycle", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/core/CameraSelector;[Landroidx/camera/core/UseCase;)Landroidx/camera/core/Camera;", "Landroidx/camera/core/UseCaseGroup;", "useCaseGroup", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/core/CameraSelector;Landroidx/camera/core/UseCaseGroup;)Landroidx/camera/core/Camera;", "", "Landroidx/camera/core/ConcurrentCamera$SingleCameraConfig;", "singleCameraConfigs", "Landroidx/camera/core/ConcurrentCamera;", "(Ljava/util/List;)Landroidx/camera/core/ConcurrentCamera;", "primaryCameraSelector", "secondaryCameraSelector", "Landroidx/camera/core/LayoutSettings;", "primaryLayoutSettings", "secondaryLayoutSettings", "Landroidx/camera/core/ViewPort;", "viewPort", "Landroidx/camera/core/CameraEffect;", "effects", "bindToLifecycle$camera_lifecycle_release", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/core/CameraSelector;Landroidx/camera/core/CameraSelector;Landroidx/camera/core/LayoutSettings;Landroidx/camera/core/LayoutSettings;Landroidx/camera/core/ViewPort;Ljava/util/List;[Landroidx/camera/core/UseCase;)Landroidx/camera/core/Camera;", "useCase", "", "isBound", "(Landroidx/camera/core/UseCase;)Z", "Ld6/s;", "unbind", "([Landroidx/camera/core/UseCase;)V", "unbindAll", "hasCamera", "(Landroidx/camera/core/CameraSelector;)Z", "Landroidx/camera/core/CameraInfo;", "getAvailableCameraInfos", "()Ljava/util/List;", "getCameraInfo", "(Landroidx/camera/core/CameraSelector;)Landroidx/camera/core/CameraInfo;", "isVideoCapture", "isPreview", "Landroid/content/Context;", "context", "Landroidx/camera/core/CameraX;", "getOrCreateCameraXInstance", "(Landroid/content/Context;)Le1/a;", "Landroidx/camera/core/CameraXConfig;", "cameraXConfig", "configureInstanceInternal", "(Landroidx/camera/core/CameraXConfig;)V", "cameraInfo", "Landroidx/camera/core/impl/CameraConfig;", "getCameraConfig", "(Landroidx/camera/core/CameraSelector;Landroidx/camera/core/CameraInfo;)Landroidx/camera/core/impl/CameraConfig;", "cameraX", "setCameraX", "(Landroidx/camera/core/CameraX;)V", "setContext", "(Landroid/content/Context;)V", "", "mLock", "Ljava/lang/Object;", "Landroidx/camera/core/CameraXConfig$Provider;", "mCameraXConfigProvider", "Landroidx/camera/core/CameraXConfig$Provider;", "mCameraXInitializeFuture", "Le1/a;", "kotlin.jvm.PlatformType", "mCameraXShutdownFuture", "Landroidx/camera/lifecycle/LifecycleCameraRepository;", "mLifecycleCameraRepository", "Landroidx/camera/lifecycle/LifecycleCameraRepository;", "mCameraX", "Landroidx/camera/core/CameraX;", "mContext", "Landroid/content/Context;", "", "Landroidx/camera/core/internal/CameraUseCaseAdapter$CameraId;", "Landroidx/camera/core/impl/RestrictedCameraInfo;", "mCameraInfoMap", "Ljava/util/Map;", "getAvailableConcurrentCameraInfos", "availableConcurrentCameraInfos", "isConcurrentCameraModeOn", "()Z", "", "cameraOperatingMode", "getCameraOperatingMode", "()I", "setCameraOperatingMode", "(I)V", "cameraInfos", "getActiveConcurrentCameraInfos", "setActiveConcurrentCameraInfos", "(Ljava/util/List;)V", "activeConcurrentCameraInfos", "Companion", "camera-lifecycle_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nProcessCameraProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessCameraProvider.kt\nandroidx/camera/lifecycle/ProcessCameraProvider\n+ 2 Trace.kt\nandroidx/tracing/TraceKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,995:1\n27#2,5:996\n27#2,3:1001\n31#2:1006\n27#2,3:1007\n31#2:1016\n27#2,3:1017\n31#2:1022\n27#2,5:1023\n27#2,5:1028\n27#2,5:1033\n27#2,5:1038\n27#2,5:1043\n27#2,5:1048\n27#2,5:1053\n37#3,2:1004\n37#3,2:1010\n37#3,2:1012\n37#3,2:1014\n1855#4,2:1020\n*S KotlinDebug\n*F\n+ 1 ProcessCameraProvider.kt\nandroidx/camera/lifecycle/ProcessCameraProvider\n*L\n204#1:996,5\n244#1:1001,3\n244#1:1006\n327#1:1007,3\n327#1:1016\n557#1:1017,3\n557#1:1022\n665#1:1023,5\n679#1:1028,5\n687#1:1033,5\n711#1:1038,5\n736#1:1043,5\n761#1:1048,5\n830#1:1053,5\n261#1:1004,2\n388#1:1010,2\n453#1:1012,2\n467#1:1014,2\n589#1:1020,2\n*E\n"})
/* loaded from: classes.dex */
public final class ProcessCameraProvider implements LifecycleCameraProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ProcessCameraProvider sAppInstance = new ProcessCameraProvider();

    @GuardedBy("mLock")
    @NotNull
    private final Map<CameraUseCaseAdapter.CameraId, RestrictedCameraInfo> mCameraInfoMap;

    @Nullable
    private CameraX mCameraX;

    @GuardedBy("mLock")
    @Nullable
    private CameraXConfig.Provider mCameraXConfigProvider;

    @GuardedBy("mLock")
    @Nullable
    private InterfaceFutureC5453a mCameraXInitializeFuture;

    @GuardedBy("mLock")
    @NotNull
    private InterfaceFutureC5453a mCameraXShutdownFuture;

    @Nullable
    private Context mContext;

    @NotNull
    private final LifecycleCameraRepository mLifecycleCameraRepository;

    @NotNull
    private final Object mLock = new Object();

    @Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m5110d2 = {"Landroidx/camera/lifecycle/ProcessCameraProvider$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Le1/a;", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "getInstance", "(Landroid/content/Context;)Le1/a;", "Landroidx/camera/core/CameraXConfig;", "cameraXConfig", "Ld6/s;", "configureInstance", "(Landroidx/camera/core/CameraXConfig;)V", "sAppInstance", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "camera-lifecycle_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nProcessCameraProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessCameraProvider.kt\nandroidx/camera/lifecycle/ProcessCameraProvider$Companion\n+ 2 Trace.kt\nandroidx/tracing/TraceKt\n*L\n1#1,995:1\n27#2,5:996\n*S KotlinDebug\n*F\n+ 1 ProcessCameraProvider.kt\nandroidx/camera/lifecycle/ProcessCameraProvider$Companion\n*L\n992#1:996,5\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ProcessCameraProvider getInstance$lambda$0(InterfaceC6471c tmp0, Object obj) {
            AbstractC5830k.m5330g(tmp0, "$tmp0");
            return (ProcessCameraProvider) tmp0.invoke(obj);
        }

        @ExperimentalCameraProviderConfiguration
        @JvmStatic
        public final void configureInstance(@NotNull CameraXConfig cameraXConfig) {
            AbstractC5830k.m5330g(cameraXConfig, "cameraXConfig");
            Trace.beginSection("CX:configureInstance");
            try {
                ProcessCameraProvider.sAppInstance.configureInstanceInternal(cameraXConfig);
            } finally {
                Trace.endSection();
            }
        }

        @JvmStatic
        @NotNull
        public final InterfaceFutureC5453a getInstance(@NotNull final Context context) {
            AbstractC5830k.m5330g(context, "context");
            Preconditions.checkNotNull(context);
            InterfaceFutureC5453a orCreateCameraXInstance = ProcessCameraProvider.sAppInstance.getOrCreateCameraXInstance(context);
            final InterfaceC6471c interfaceC6471c = new InterfaceC6471c() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$Companion$getInstance$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public final ProcessCameraProvider invoke(CameraX cameraX) {
                    ProcessCameraProvider processCameraProvider = ProcessCameraProvider.sAppInstance;
                    AbstractC5830k.m5329f(cameraX, "cameraX");
                    processCameraProvider.setCameraX(cameraX);
                    ProcessCameraProvider processCameraProvider2 = ProcessCameraProvider.sAppInstance;
                    Context applicationContext = ContextUtil.getApplicationContext(context);
                    AbstractC5830k.m5329f(applicationContext, "getApplicationContext(context)");
                    processCameraProvider2.setContext(applicationContext);
                    return ProcessCameraProvider.sAppInstance;
                }
            };
            InterfaceFutureC5453a interfaceFutureC5453aTransform = Futures.transform(orCreateCameraXInstance, new Function() { // from class: androidx.camera.lifecycle.b
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return ProcessCameraProvider.Companion.getInstance$lambda$0(interfaceC6471c, obj);
                }
            }, CameraXExecutors.directExecutor());
            AbstractC5830k.m5329f(interfaceFutureC5453aTransform, "context: Context): Liste…tExecutor()\n            )");
            return interfaceFutureC5453aTransform;
        }

        private Companion() {
        }
    }

    private ProcessCameraProvider() {
        InterfaceFutureC5453a interfaceFutureC5453aImmediateFuture = Futures.immediateFuture(null);
        AbstractC5830k.m5329f(interfaceFutureC5453aImmediateFuture, "immediateFuture<Void>(null)");
        this.mCameraXShutdownFuture = interfaceFutureC5453aImmediateFuture;
        this.mLifecycleCameraRepository = new LifecycleCameraRepository();
        this.mCameraInfoMap = new HashMap();
    }

    @ExperimentalCameraProviderConfiguration
    @JvmStatic
    public static final void configureInstance(@NotNull CameraXConfig cameraXConfig) {
        INSTANCE.configureInstance(cameraXConfig);
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
                    @NotNull
                    public final CameraXConfig getCameraXConfig() {
                        return cameraXConfig;
                    }
                };
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
        AbstractC5830k.m5327d(cameraX);
        List<CameraInfo> activeConcurrentCameraInfos = cameraX.getCameraFactory().getCameraCoordinator().getActiveConcurrentCameraInfos();
        AbstractC5830k.m5329f(activeConcurrentCameraInfos, "mCameraX!!.cameraFactory…tiveConcurrentCameraInfos");
        return activeConcurrentCameraInfos;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CameraConfig getCameraConfig(CameraSelector cameraSelector, CameraInfo cameraInfo) {
        Iterator<CameraFilter> it = cameraSelector.getCameraFilterSet().iterator();
        CameraConfig cameraConfig = null;
        while (it.hasNext()) {
            CameraFilter next = it.next();
            AbstractC5830k.m5329f(next, "cameraSelector.cameraFilterSet");
            CameraFilter cameraFilter = next;
            if (!AbstractC5830k.m5325b(cameraFilter.getIdentifier(), CameraFilter.DEFAULT_ID)) {
                CameraConfigProvider configProvider = ExtendedCameraConfigProviderStore.getConfigProvider(cameraFilter.getIdentifier());
                Context context = this.mContext;
                AbstractC5830k.m5327d(context);
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
        AbstractC5830k.m5327d(cameraX);
        return cameraX.getCameraFactory().getCameraCoordinator().getCameraOperatingMode();
    }

    @JvmStatic
    @NotNull
    public static final InterfaceFutureC5453a getInstance(@NotNull Context context) {
        return INSTANCE.getInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceFutureC5453a getOrCreateCameraXInstance(Context context) {
        synchronized (this.mLock) {
            InterfaceFutureC5453a interfaceFutureC5453a = this.mCameraXInitializeFuture;
            if (interfaceFutureC5453a != null) {
                return interfaceFutureC5453a;
            }
            InterfaceFutureC5453a future = CallbackToFutureAdapter.getFuture(new C0304d(this, new CameraX(context, this.mCameraXConfigProvider)));
            this.mCameraXInitializeFuture = future;
            AbstractC5830k.m5328e(future, "null cannot be cast to non-null type com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.CameraX>");
            return future;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getOrCreateCameraXInstance$lambda$18$lambda$17(ProcessCameraProvider this$0, final CameraX cameraX, final CallbackToFutureAdapter.Completer completer) {
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(cameraX, "$cameraX");
        AbstractC5830k.m5330g(completer, "completer");
        synchronized (this$0.mLock) {
            FutureChain futureChainFrom = FutureChain.from(this$0.mCameraXShutdownFuture);
            final InterfaceC6471c interfaceC6471c = new InterfaceC6471c() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$getOrCreateCameraXInstance$1$1$1$future$1
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                @NotNull
                public final InterfaceFutureC5453a invoke(@Nullable Void r1) {
                    return cameraX.getInitializeFuture();
                }
            };
            FutureChain futureChainTransformAsync = futureChainFrom.transformAsync(new AsyncFunction() { // from class: androidx.camera.lifecycle.a
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final InterfaceFutureC5453a apply(Object obj) {
                    return ProcessCameraProvider.m752xb817548d(interfaceC6471c, obj);
                }
            }, CameraXExecutors.directExecutor());
            AbstractC5830k.m5329f(futureChainTransformAsync, "cameraX = CameraX(contex…                        )");
            Futures.addCallback(futureChainTransformAsync, new FutureCallback<Void>() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$getOrCreateCameraXInstance$1$1$1$1
                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onFailure(@NotNull Throwable t8) {
                    AbstractC5830k.m5330g(t8, "t");
                    completer.setException(t8);
                }

                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onSuccess(@Nullable Void result) {
                    completer.set(cameraX);
                }
            }, CameraXExecutors.directExecutor());
        }
        return "ProcessCameraProvider-initializeCameraX";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getOrCreateCameraXInstance$lambda$18$lambda$17$lambda$16$lambda$15 */
    public static final InterfaceFutureC5453a m752xb817548d(InterfaceC6471c tmp0, Object obj) {
        AbstractC5830k.m5330g(tmp0, "$tmp0");
        return (InterfaceFutureC5453a) tmp0.invoke(obj);
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
        AbstractC5830k.m5327d(cameraX);
        cameraX.getCameraFactory().getCameraCoordinator().setActiveConcurrentCameraInfos(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCameraOperatingMode(int i) {
        CameraX cameraX = this.mCameraX;
        if (cameraX == null) {
            return;
        }
        AbstractC5830k.m5327d(cameraX);
        cameraX.getCameraFactory().getCameraCoordinator().setCameraOperatingMode(i);
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
        AbstractC5830k.m5330g(this$0, "this$0");
        this$0.unbindAll();
        this$0.mLifecycleCameraRepository.clear();
    }

    @MainThread
    @NotNull
    public final Camera bindToLifecycle(@NotNull LifecycleOwner lifecycleOwner, @NotNull CameraSelector cameraSelector, @NotNull UseCase... useCases) {
        AbstractC5830k.m5330g(lifecycleOwner, "lifecycleOwner");
        AbstractC5830k.m5330g(cameraSelector, "cameraSelector");
        AbstractC5830k.m5330g(useCases, "useCases");
        Trace.beginSection("CX:bindToLifecycle");
        try {
            if (getCameraOperatingMode() == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
            }
            setCameraOperatingMode(1);
            LayoutSettings DEFAULT = LayoutSettings.DEFAULT;
            AbstractC5830k.m5329f(DEFAULT, "DEFAULT");
            AbstractC5830k.m5329f(DEFAULT, "DEFAULT");
            Camera cameraBindToLifecycle$camera_lifecycle_release = bindToLifecycle$camera_lifecycle_release(lifecycleOwner, cameraSelector, null, DEFAULT, DEFAULT, null, EmptyList.INSTANCE, (UseCase[]) Arrays.copyOf(useCases, useCases.length));
            Trace.endSection();
            return cameraBindToLifecycle$camera_lifecycle_release;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @OptIn(markerClass = {ExperimentalCameraInfo.class})
    @NotNull
    public final Camera bindToLifecycle$camera_lifecycle_release(@NotNull LifecycleOwner lifecycleOwner, @NotNull CameraSelector primaryCameraSelector, @Nullable CameraSelector secondaryCameraSelector, @NotNull LayoutSettings primaryLayoutSettings, @NotNull LayoutSettings secondaryLayoutSettings, @Nullable ViewPort viewPort, @NotNull List<? extends CameraEffect> effects, @NotNull UseCase... useCases) {
        CameraInternal cameraInternalSelect;
        RestrictedCameraInfo restrictedCameraInfo;
        AbstractC5830k.m5330g(lifecycleOwner, "lifecycleOwner");
        AbstractC5830k.m5330g(primaryCameraSelector, "primaryCameraSelector");
        AbstractC5830k.m5330g(primaryLayoutSettings, "primaryLayoutSettings");
        AbstractC5830k.m5330g(secondaryLayoutSettings, "secondaryLayoutSettings");
        AbstractC5830k.m5330g(effects, "effects");
        AbstractC5830k.m5330g(useCases, "useCases");
        Trace.beginSection("CX:bindToLifecycle-internal");
        try {
            Threads.checkMainThread();
            CameraX cameraX = this.mCameraX;
            AbstractC5830k.m5327d(cameraX);
            CameraInternal cameraInternalSelect2 = primaryCameraSelector.select(cameraX.getCameraRepository().getCameras());
            AbstractC5830k.m5329f(cameraInternalSelect2, "primaryCameraSelector.se…cameraRepository.cameras)");
            cameraInternalSelect2.setPrimary(true);
            CameraInfo cameraInfo = getCameraInfo(primaryCameraSelector);
            AbstractC5830k.m5328e(cameraInfo, "null cannot be cast to non-null type androidx.camera.core.impl.RestrictedCameraInfo");
            RestrictedCameraInfo restrictedCameraInfo2 = (RestrictedCameraInfo) cameraInfo;
            int i = 0;
            if (secondaryCameraSelector != null) {
                CameraX cameraX2 = this.mCameraX;
                AbstractC5830k.m5327d(cameraX2);
                cameraInternalSelect = secondaryCameraSelector.select(cameraX2.getCameraRepository().getCameras());
                cameraInternalSelect.setPrimary(false);
                CameraInfo cameraInfo2 = getCameraInfo(secondaryCameraSelector);
                AbstractC5830k.m5328e(cameraInfo2, "null cannot be cast to non-null type androidx.camera.core.impl.RestrictedCameraInfo");
                restrictedCameraInfo = (RestrictedCameraInfo) cameraInfo2;
            } else {
                cameraInternalSelect = null;
                restrictedCameraInfo = null;
            }
            LifecycleCamera lifecycleCamera = this.mLifecycleCameraRepository.getLifecycleCamera(lifecycleOwner, CameraUseCaseAdapter.generateCameraId(restrictedCameraInfo2, restrictedCameraInfo));
            Collection<LifecycleCamera> lifecycleCameras = this.mLifecycleCameraRepository.getLifecycleCameras();
            ArrayList arrayListM5190Q = AbstractC5802q.m5190Q(useCases);
            int size = arrayListM5190Q.size();
            while (i < size) {
                Object obj = arrayListM5190Q.get(i);
                i++;
                UseCase useCase = (UseCase) obj;
                for (LifecycleCamera lifecycleCameras2 : lifecycleCameras) {
                    int i8 = i;
                    AbstractC5830k.m5329f(lifecycleCameras2, "lifecycleCameras");
                    LifecycleCamera lifecycleCamera2 = lifecycleCameras2;
                    if (lifecycleCamera2.isBound(useCase) && !lifecycleCamera2.equals(lifecycleCamera)) {
                        throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{useCase}, 1)));
                    }
                    i = i8;
                }
            }
            if (lifecycleCamera == null) {
                LifecycleCameraRepository lifecycleCameraRepository = this.mLifecycleCameraRepository;
                CameraX cameraX3 = this.mCameraX;
                AbstractC5830k.m5327d(cameraX3);
                CameraCoordinator cameraCoordinator = cameraX3.getCameraFactory().getCameraCoordinator();
                CameraX cameraX4 = this.mCameraX;
                AbstractC5830k.m5327d(cameraX4);
                CameraDeviceSurfaceManager cameraDeviceSurfaceManager = cameraX4.getCameraDeviceSurfaceManager();
                CameraX cameraX5 = this.mCameraX;
                AbstractC5830k.m5327d(cameraX5);
                lifecycleCamera = lifecycleCameraRepository.createLifecycleCamera(lifecycleOwner, new CameraUseCaseAdapter(cameraInternalSelect2, cameraInternalSelect, restrictedCameraInfo2, restrictedCameraInfo, primaryLayoutSettings, secondaryLayoutSettings, cameraCoordinator, cameraDeviceSurfaceManager, cameraX5.getDefaultConfigFactory()));
            }
            LifecycleCamera lifecycleCamera3 = lifecycleCamera;
            if (useCases.length == 0) {
                AbstractC5830k.m5327d(lifecycleCamera3);
            } else {
                LifecycleCameraRepository lifecycleCameraRepository2 = this.mLifecycleCameraRepository;
                AbstractC5830k.m5327d(lifecycleCamera3);
                List listM5287z = AbstractC5806u.m5287z(Arrays.copyOf(useCases, useCases.length));
                CameraX cameraX6 = this.mCameraX;
                AbstractC5830k.m5327d(cameraX6);
                lifecycleCameraRepository2.bindToLifecycleCamera(lifecycleCamera3, viewPort, effects, listM5287z, cameraX6.getCameraFactory().getCameraCoordinator());
            }
            Trace.endSection();
            return lifecycleCamera3;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.camera.core.CameraProvider
    @NotNull
    public List<CameraInfo> getAvailableCameraInfos() {
        Trace.beginSection("CX:getAvailableCameraInfos");
        try {
            ArrayList arrayList = new ArrayList();
            CameraX cameraX = this.mCameraX;
            AbstractC5830k.m5327d(cameraX);
            LinkedHashSet<CameraInternal> cameras = cameraX.getCameraRepository().getCameras();
            AbstractC5830k.m5329f(cameras, "mCameraX!!.cameraRepository.cameras");
            Iterator<CameraInternal> it = cameras.iterator();
            while (it.hasNext()) {
                CameraInfo cameraInfo = it.next().getCameraInfo();
                AbstractC5830k.m5329f(cameraInfo, "camera.cameraInfo");
                arrayList.add(cameraInfo);
            }
            return arrayList;
        } finally {
            Trace.endSection();
        }
    }

    @OptIn(markerClass = {ExperimentalCameraInfo.class})
    @NotNull
    public final List<List<CameraInfo>> getAvailableConcurrentCameraInfos() {
        Trace.beginSection("CX:getAvailableConcurrentCameraInfos");
        try {
            Objects.requireNonNull(this.mCameraX);
            CameraX cameraX = this.mCameraX;
            AbstractC5830k.m5327d(cameraX);
            Objects.requireNonNull(cameraX.getCameraFactory().getCameraCoordinator());
            CameraX cameraX2 = this.mCameraX;
            AbstractC5830k.m5327d(cameraX2);
            List<List<CameraSelector>> concurrentCameraSelectors = cameraX2.getCameraFactory().getCameraCoordinator().getConcurrentCameraSelectors();
            AbstractC5830k.m5329f(concurrentCameraSelectors, "mCameraX!!.cameraFactory…concurrentCameraSelectors");
            ArrayList arrayList = new ArrayList();
            for (List<CameraSelector> list : concurrentCameraSelectors) {
                ArrayList arrayList2 = new ArrayList();
                for (CameraSelector cameraSelector : list) {
                    try {
                        AbstractC5830k.m5329f(cameraSelector, "cameraSelector");
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
    @NotNull
    public CameraInfo getCameraInfo(@NotNull CameraSelector cameraSelector) {
        Object restrictedCameraInfo;
        AbstractC5830k.m5330g(cameraSelector, "cameraSelector");
        Trace.beginSection("CX:getCameraInfo");
        try {
            CameraX cameraX = this.mCameraX;
            AbstractC5830k.m5327d(cameraX);
            CameraInfoInternal cameraInfoInternal = cameraSelector.select(cameraX.getCameraRepository().getCameras()).getCameraInfoInternal();
            AbstractC5830k.m5329f(cameraInfoInternal, "cameraSelector.select(mC…meras).cameraInfoInternal");
            CameraConfig cameraConfig = getCameraConfig(cameraSelector, cameraInfoInternal);
            CameraUseCaseAdapter.CameraId cameraIdCreate = CameraUseCaseAdapter.CameraId.create(cameraInfoInternal.getCameraId(), cameraConfig.getCompatibilityId());
            AbstractC5830k.m5329f(cameraIdCreate, "create(\n                …ilityId\n                )");
            synchronized (this.mLock) {
                restrictedCameraInfo = this.mCameraInfoMap.get(cameraIdCreate);
                if (restrictedCameraInfo == null) {
                    restrictedCameraInfo = new RestrictedCameraInfo(cameraInfoInternal, cameraConfig);
                    this.mCameraInfoMap.put(cameraIdCreate, restrictedCameraInfo);
                }
            }
            return (RestrictedCameraInfo) restrictedCameraInfo;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.camera.core.CameraProvider
    public boolean hasCamera(@NotNull CameraSelector cameraSelector) throws CameraInfoUnavailableException {
        boolean z8;
        AbstractC5830k.m5330g(cameraSelector, "cameraSelector");
        Trace.beginSection("CX:hasCamera");
        try {
            CameraX cameraX = this.mCameraX;
            AbstractC5830k.m5327d(cameraX);
            cameraSelector.select(cameraX.getCameraRepository().getCameras());
            z8 = true;
        } catch (IllegalArgumentException unused) {
            z8 = false;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
        Trace.endSection();
        return z8;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    public boolean isBound(@NotNull UseCase useCase) {
        AbstractC5830k.m5330g(useCase, "useCase");
        for (LifecycleCamera lifecycleCamera : this.mLifecycleCameraRepository.getLifecycleCameras()) {
            AbstractC5830k.m5329f(lifecycleCamera, "mLifecycleCameraRepository.lifecycleCameras");
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
    @NotNull
    public final InterfaceFutureC5453a shutdownAsync() {
        Threads.runOnMainSync(new RunnableC0023a(this, 8));
        CameraX cameraX = this.mCameraX;
        if (cameraX != null) {
            cameraX.getCameraFactory().getCameraCoordinator().shutdown();
        }
        CameraX cameraX2 = this.mCameraX;
        InterfaceFutureC5453a interfaceFutureC5453aShutdown = cameraX2 != null ? cameraX2.shutdown() : Futures.immediateFuture(null);
        AbstractC5830k.m5329f(interfaceFutureC5453aShutdown, "if (mCameraX != null) mC…mediateFuture<Void>(null)");
        synchronized (this.mLock) {
            this.mCameraXConfigProvider = null;
            this.mCameraXInitializeFuture = null;
            this.mCameraXShutdownFuture = interfaceFutureC5453aShutdown;
            this.mCameraInfoMap.clear();
        }
        this.mCameraX = null;
        this.mContext = null;
        return interfaceFutureC5453aShutdown;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    @MainThread
    public void unbind(@NotNull UseCase... useCases) {
        AbstractC5830k.m5330g(useCases, "useCases");
        Trace.beginSection("CX:unbind");
        try {
            Threads.checkMainThread();
            if (getCameraOperatingMode() == 2) {
                throw new UnsupportedOperationException("Unbind usecase is not supported in concurrent camera mode, call unbindAll() first.");
            }
            this.mLifecycleCameraRepository.unbind(AbstractC5806u.m5287z(Arrays.copyOf(useCases, useCases.length)));
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
        } finally {
            Trace.endSection();
        }
    }

    @MainThread
    @NotNull
    public final Camera bindToLifecycle(@NotNull LifecycleOwner lifecycleOwner, @NotNull CameraSelector cameraSelector, @NotNull UseCaseGroup useCaseGroup) {
        AbstractC5830k.m5330g(lifecycleOwner, "lifecycleOwner");
        AbstractC5830k.m5330g(cameraSelector, "cameraSelector");
        AbstractC5830k.m5330g(useCaseGroup, "useCaseGroup");
        Trace.beginSection("CX:bindToLifecycle-UseCaseGroup");
        try {
            if (getCameraOperatingMode() != 2) {
                setCameraOperatingMode(1);
                LayoutSettings DEFAULT = LayoutSettings.DEFAULT;
                AbstractC5830k.m5329f(DEFAULT, "DEFAULT");
                AbstractC5830k.m5329f(DEFAULT, "DEFAULT");
                ViewPort viewPort = useCaseGroup.getViewPort();
                List<CameraEffect> effects = useCaseGroup.getEffects();
                AbstractC5830k.m5329f(effects, "useCaseGroup.effects");
                List<UseCase> useCases = useCaseGroup.getUseCases();
                AbstractC5830k.m5329f(useCases, "useCaseGroup.useCases");
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

    /* JADX WARN: Removed duplicated region for block: B:57:0x01fa A[Catch: all -> 0x026c, TRY_ENTER, TryCatch #0 {all -> 0x026c, blocks: (B:50:0x01b7, B:52:0x01c5, B:61:0x0209, B:57:0x01fa, B:59:0x0200, B:65:0x0271, B:66:0x0275, B:68:0x027b), top: B:87:0x01b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0271 A[Catch: all -> 0x026c, TryCatch #0 {all -> 0x026c, blocks: (B:50:0x01b7, B:52:0x01c5, B:61:0x0209, B:57:0x01fa, B:59:0x0200, B:65:0x0271, B:66:0x0275, B:68:0x027b), top: B:87:0x01b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027b A[Catch: all -> 0x026c, TRY_LEAVE, TryCatch #0 {all -> 0x026c, blocks: (B:50:0x01b7, B:52:0x01c5, B:61:0x0209, B:57:0x01fa, B:59:0x0200, B:65:0x0271, B:66:0x0275, B:68:0x027b), top: B:87:0x01b7 }] */
    @androidx.annotation.OptIn(markerClass = {androidx.camera.core.ExperimentalCameraInfo.class})
    @androidx.annotation.MainThread
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.camera.core.ConcurrentCamera bindToLifecycle(@org.jetbrains.annotations.NotNull java.util.List<androidx.camera.core.ConcurrentCamera.SingleCameraConfig> r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.lifecycle.ProcessCameraProvider.bindToLifecycle(java.util.List):androidx.camera.core.ConcurrentCamera");
    }
}
