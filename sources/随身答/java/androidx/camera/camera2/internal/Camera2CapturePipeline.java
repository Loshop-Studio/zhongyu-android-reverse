package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.VisibleForTesting;
import androidx.arch.core.util.Function;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.FlashAvailabilityChecker;
import androidx.camera.camera2.internal.compat.workaround.OverrideAeModeForStillCapture;
import androidx.camera.camera2.internal.compat.workaround.UseFlashModeTorchFor3aUpdate;
import androidx.camera.camera2.internal.compat.workaround.UseTorchAsFlash;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraCaptureResults;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.ConvergenceUtils;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
class Camera2CapturePipeline {
    private static final String TAG = "Camera2CapturePipeline";

    @NonNull
    private final Camera2CameraControlImpl mCameraControl;

    @NonNull
    private final Quirks mCameraQuirk;

    @NonNull
    private final Executor mExecutor;
    private final boolean mHasFlashUnit;
    private final boolean mIsLegacyDevice;

    @NonNull
    private final ScheduledExecutorService mScheduler;
    private int mTemplate = 1;

    @NonNull
    private final UseTorchAsFlash mUseTorchAsFlash;

    public static class AePreCaptureTask implements PipelineTask {
        private final Camera2CameraControlImpl mCameraControl;
        private final int mFlashMode;
        private boolean mIsExecuted = false;
        private final OverrideAeModeForStillCapture mOverrideAeModeForStillCapture;

        public AePreCaptureTask(@NonNull Camera2CameraControlImpl camera2CameraControlImpl, int i9, @NonNull OverrideAeModeForStillCapture overrideAeModeForStillCapture) {
            this.mCameraControl = camera2CameraControlImpl;
            this.mFlashMode = i9;
            this.mOverrideAeModeForStillCapture = overrideAeModeForStillCapture;
        }

        /* renamed from: b */
        public static /* synthetic */ Object m346b(AePreCaptureTask aePreCaptureTask, CallbackToFutureAdapter.Completer completer) {
            aePreCaptureTask.mCameraControl.getFocusMeteringControl().triggerAePrecapture(completer);
            aePreCaptureTask.mOverrideAeModeForStillCapture.onAePrecaptureStarted();
            return "AePreCapture";
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public boolean isCaptureResultNeeded() {
            return this.mFlashMode == 0;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public void postCapture() {
            if (this.mIsExecuted) {
                Logger.m501d(Camera2CapturePipeline.TAG, "cancel TriggerAePreCapture");
                this.mCameraControl.getFocusMeteringControl().cancelAfAeTrigger(false, true);
                this.mOverrideAeModeForStillCapture.onAePrecaptureFinished();
            }
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        @NonNull
        public ListenableFuture<Boolean> preCapture(@Nullable TotalCaptureResult totalCaptureResult) {
            if (!Camera2CapturePipeline.isFlashRequired(this.mFlashMode, totalCaptureResult)) {
                return Futures.immediateFuture(Boolean.FALSE);
            }
            Logger.m501d(Camera2CapturePipeline.TAG, "Trigger AE");
            this.mIsExecuted = true;
            return FutureChain.from(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.u0
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return Camera2CapturePipeline.AePreCaptureTask.m346b(this.f435a, completer);
                }
            })).transform(new Function() { // from class: androidx.camera.camera2.internal.v0
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return Boolean.TRUE;
                }
            }, CameraXExecutors.directExecutor());
        }
    }

    public static class AfTask implements PipelineTask {
        private final Camera2CameraControlImpl mCameraControl;
        private boolean mIsExecuted = false;

        public AfTask(@NonNull Camera2CameraControlImpl camera2CameraControlImpl) {
            this.mCameraControl = camera2CameraControlImpl;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public boolean isCaptureResultNeeded() {
            return true;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public void postCapture() {
            if (this.mIsExecuted) {
                Logger.m501d(Camera2CapturePipeline.TAG, "cancel TriggerAF");
                this.mCameraControl.getFocusMeteringControl().cancelAfAeTrigger(true, false);
            }
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        @NonNull
        public ListenableFuture<Boolean> preCapture(@Nullable TotalCaptureResult totalCaptureResult) {
            Integer num;
            int iIntValue;
            ListenableFuture<Boolean> listenableFutureImmediateFuture = Futures.immediateFuture(Boolean.TRUE);
            if (totalCaptureResult != null && (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) != null && ((iIntValue = num.intValue()) == 1 || iIntValue == 2)) {
                Logger.m501d(Camera2CapturePipeline.TAG, "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    Logger.m501d(Camera2CapturePipeline.TAG, "Trigger AF");
                    this.mIsExecuted = true;
                    this.mCameraControl.getFocusMeteringControl().triggerAf(null, false);
                }
            }
            return listenableFutureImmediateFuture;
        }
    }

    public static class CameraCapturePipelineImpl implements CameraCapturePipeline {
        private final Executor mExecutor;
        private int mFlashMode;
        private final Pipeline mPipelineDelegate;

        public CameraCapturePipelineImpl(Pipeline pipeline, Executor executor, int i9) {
            this.mPipelineDelegate = pipeline;
            this.mExecutor = executor;
            this.mFlashMode = i9;
        }

        /* renamed from: a */
        public static /* synthetic */ Object m347a(CameraCapturePipelineImpl cameraCapturePipelineImpl, CallbackToFutureAdapter.Completer completer) {
            cameraCapturePipelineImpl.mPipelineDelegate.executePostCapture();
            completer.set(null);
            return "invokePostCaptureFuture";
        }

        /* renamed from: b */
        public static /* synthetic */ Void m348b(TotalCaptureResult totalCaptureResult) {
            return null;
        }

        @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
        @NonNull
        public ListenableFuture<Void> invokePostCapture() {
            return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.w0
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return Camera2CapturePipeline.CameraCapturePipelineImpl.m347a(this.f445a, completer);
                }
            });
        }

        @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
        @NonNull
        public ListenableFuture<Void> invokePreCapture() {
            Logger.m501d(Camera2CapturePipeline.TAG, "invokePreCapture");
            return FutureChain.from(this.mPipelineDelegate.executePreCapture(this.mFlashMode)).transform(new Function() { // from class: androidx.camera.camera2.internal.x0
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return Camera2CapturePipeline.CameraCapturePipelineImpl.m348b((TotalCaptureResult) obj);
                }
            }, this.mExecutor);
        }
    }

    @VisibleForTesting
    public static class Pipeline {
        private static final long CHECK_3A_TIMEOUT_IN_NS;
        private static final long CHECK_3A_WITH_FLASH_TIMEOUT_IN_NS;
        private final Camera2CameraControlImpl mCameraControl;
        private final Executor mExecutor;
        private final boolean mIsLegacyDevice;
        private final OverrideAeModeForStillCapture mOverrideAeModeForStillCapture;
        private final ScheduledExecutorService mScheduler;
        private final int mTemplate;
        private long mTimeout3A = CHECK_3A_TIMEOUT_IN_NS;
        final List<PipelineTask> mTasks = new ArrayList();
        private final PipelineTask mPipelineSubTask = new C02881();

        /* renamed from: androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline$1 */
        public class C02881 implements PipelineTask {
            public C02881() {
            }

            @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
            public boolean isCaptureResultNeeded() {
                Iterator<PipelineTask> it = Pipeline.this.mTasks.iterator();
                while (it.hasNext()) {
                    if (it.next().isCaptureResultNeeded()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
            public void postCapture() {
                Iterator<PipelineTask> it = Pipeline.this.mTasks.iterator();
                while (it.hasNext()) {
                    it.next().postCapture();
                }
            }

            @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
            @NonNull
            public ListenableFuture<Boolean> preCapture(@Nullable TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                Iterator<PipelineTask> it = Pipeline.this.mTasks.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().preCapture(totalCaptureResult));
                }
                return Futures.transform(Futures.allAsList(arrayList), new Function() { // from class: androidx.camera.camera2.internal.e1
                    @Override // androidx.arch.core.util.Function
                    public final Object apply(Object obj) {
                        return Boolean.valueOf(((List) obj).contains(Boolean.TRUE));
                    }
                }, CameraXExecutors.directExecutor());
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            CHECK_3A_TIMEOUT_IN_NS = timeUnit.toNanos(1L);
            CHECK_3A_WITH_FLASH_TIMEOUT_IN_NS = timeUnit.toNanos(5L);
        }

        public Pipeline(int i9, @NonNull Executor executor, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull Camera2CameraControlImpl camera2CameraControlImpl, boolean z9, @NonNull OverrideAeModeForStillCapture overrideAeModeForStillCapture) {
            this.mTemplate = i9;
            this.mExecutor = executor;
            this.mScheduler = scheduledExecutorService;
            this.mCameraControl = camera2CameraControlImpl;
            this.mIsLegacyDevice = z9;
            this.mOverrideAeModeForStillCapture = overrideAeModeForStillCapture;
        }

        /* renamed from: a */
        public static /* synthetic */ ListenableFuture m349a(Pipeline pipeline, int i9, TotalCaptureResult totalCaptureResult) {
            pipeline.getClass();
            if (Camera2CapturePipeline.isFlashRequired(i9, totalCaptureResult)) {
                pipeline.setTimeout3A(CHECK_3A_WITH_FLASH_TIMEOUT_IN_NS);
            }
            return pipeline.mPipelineSubTask.preCapture(totalCaptureResult);
        }

        @OptIn(markerClass = {ExperimentalCamera2Interop.class})
        private void applyAeModeQuirk(@NonNull CaptureConfig.Builder builder) {
            Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
            builder2.setCaptureRequestOption(CaptureRequest.CONTROL_AE_MODE, 3);
            builder.addImplementationOptions(builder2.build());
        }

        private void applyStillCaptureTemplate(@NonNull CaptureConfig.Builder builder, @NonNull CaptureConfig captureConfig) {
            int i9 = (this.mTemplate != 3 || this.mIsLegacyDevice) ? (captureConfig.getTemplateType() == -1 || captureConfig.getTemplateType() == 5) ? 2 : -1 : 4;
            if (i9 != -1) {
                builder.setTemplateType(i9);
            }
        }

        /* renamed from: d */
        public static /* synthetic */ ListenableFuture m352d(Pipeline pipeline, Boolean bool) {
            pipeline.getClass();
            return Boolean.TRUE.equals(bool) ? Camera2CapturePipeline.waitForResult(pipeline.mTimeout3A, pipeline.mScheduler, pipeline.mCameraControl, new ResultListener.Checker() { // from class: androidx.camera.camera2.internal.d1
                @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.ResultListener.Checker
                public final boolean check(TotalCaptureResult totalCaptureResult) {
                    return Camera2CapturePipeline.is3AConverged(totalCaptureResult, false);
                }
            }) : Futures.immediateFuture(null);
        }

        /* renamed from: e */
        public static /* synthetic */ Object m353e(Pipeline pipeline, CaptureConfig.Builder builder, final CallbackToFutureAdapter.Completer completer) {
            pipeline.getClass();
            builder.addCameraCaptureCallback(new CameraCaptureCallback() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline.Pipeline.2
                @Override // androidx.camera.core.impl.CameraCaptureCallback
                public void onCaptureCancelled(int i9) {
                    completer.setException(new ImageCaptureException(3, "Capture request is cancelled because camera is closed", null));
                }

                @Override // androidx.camera.core.impl.CameraCaptureCallback
                public void onCaptureCompleted(int i9, @NonNull CameraCaptureResult cameraCaptureResult) {
                    completer.set(null);
                }

                @Override // androidx.camera.core.impl.CameraCaptureCallback
                public void onCaptureFailed(int i9, @NonNull CameraCaptureFailure cameraCaptureFailure) {
                    completer.setException(new ImageCaptureException(2, "Capture request failed with reason " + cameraCaptureFailure.getReason(), null));
                }
            });
            return "submitStillCapture";
        }

        private void setTimeout3A(long j9) {
            this.mTimeout3A = j9;
        }

        public void addTask(@NonNull PipelineTask pipelineTask) {
            this.mTasks.add(pipelineTask);
        }

        @NonNull
        public ListenableFuture<List<Void>> executeCapture(@NonNull final List<CaptureConfig> list, final int i9) {
            FutureChain futureChainTransformAsync = FutureChain.from(executePreCapture(i9)).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.z0
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final ListenableFuture apply(Object obj) {
                    return this.f474a.submitConfigsInternal(list, i9);
                }
            }, this.mExecutor);
            futureChainTransformAsync.addListener(new Runnable() { // from class: androidx.camera.camera2.internal.a1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f204a.executePostCapture();
                }
            }, this.mExecutor);
            return futureChainTransformAsync;
        }

        public void executePostCapture() {
            this.mPipelineSubTask.postCapture();
        }

        @NonNull
        public ListenableFuture<TotalCaptureResult> executePreCapture(final int i9) {
            ListenableFuture<TotalCaptureResult> listenableFutureImmediateFuture = Futures.immediateFuture(null);
            if (this.mTasks.isEmpty()) {
                return listenableFutureImmediateFuture;
            }
            return FutureChain.from(this.mPipelineSubTask.isCaptureResultNeeded() ? Camera2CapturePipeline.waitForResult(this.mCameraControl, null) : Futures.immediateFuture(null)).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.b1
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final ListenableFuture apply(Object obj) {
                    return Camera2CapturePipeline.Pipeline.m349a(this.f210a, i9, (TotalCaptureResult) obj);
                }
            }, this.mExecutor).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.c1
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final ListenableFuture apply(Object obj) {
                    return Camera2CapturePipeline.Pipeline.m352d(this.f216a, (Boolean) obj);
                }
            }, this.mExecutor);
        }

        @NonNull
        public ListenableFuture<List<Void>> submitConfigsInternal(@NonNull List<CaptureConfig> list, int i9) {
            ImageProxy imageProxyDequeueImageFromBuffer;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (CaptureConfig captureConfig : list) {
                final CaptureConfig.Builder builderFrom = CaptureConfig.Builder.from(captureConfig);
                CameraCaptureResult cameraCaptureResultRetrieveCameraCaptureResult = (captureConfig.getTemplateType() != 5 || this.mCameraControl.getZslControl().isZslDisabledByFlashMode() || this.mCameraControl.getZslControl().isZslDisabledByUserCaseConfig() || (imageProxyDequeueImageFromBuffer = this.mCameraControl.getZslControl().dequeueImageFromBuffer()) == null || !this.mCameraControl.getZslControl().enqueueImageToImageWriter(imageProxyDequeueImageFromBuffer)) ? null : CameraCaptureResults.retrieveCameraCaptureResult(imageProxyDequeueImageFromBuffer.getImageInfo());
                if (cameraCaptureResultRetrieveCameraCaptureResult != null) {
                    builderFrom.setCameraCaptureResult(cameraCaptureResultRetrieveCameraCaptureResult);
                } else {
                    applyStillCaptureTemplate(builderFrom, captureConfig);
                }
                if (this.mOverrideAeModeForStillCapture.shouldSetAeModeAlwaysFlash(i9)) {
                    applyAeModeQuirk(builderFrom);
                }
                arrayList.add(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.y0
                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                        return Camera2CapturePipeline.Pipeline.m353e(this.f465a, builderFrom, completer);
                    }
                }));
                arrayList2.add(builderFrom.build());
            }
            this.mCameraControl.submitCaptureRequestsInternal(arrayList2);
            return Futures.allAsList(arrayList);
        }
    }

    public interface PipelineTask {
        boolean isCaptureResultNeeded();

        void postCapture();

        @NonNull
        ListenableFuture<Boolean> preCapture(@Nullable TotalCaptureResult totalCaptureResult);
    }

    public static class ResultListener implements Camera2CameraControlImpl.CaptureResultListener {
        private final Checker mChecker;
        private CallbackToFutureAdapter.Completer<TotalCaptureResult> mCompleter;
        private final ListenableFuture<TotalCaptureResult> mFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.f1
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Camera2CapturePipeline.ResultListener.m355a(this.f303a, completer);
            }
        });

        public interface Checker {
            boolean check(@NonNull TotalCaptureResult totalCaptureResult);
        }

        public ResultListener(@Nullable Checker checker) {
            this.mChecker = checker;
        }

        /* renamed from: a */
        public static /* synthetic */ Object m355a(ResultListener resultListener, CallbackToFutureAdapter.Completer completer) {
            resultListener.mCompleter = completer;
            return "waitFor3AResult";
        }

        @NonNull
        public ListenableFuture<TotalCaptureResult> getFuture() {
            return this.mFuture;
        }

        @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
        public boolean onCaptureResult(@NonNull TotalCaptureResult totalCaptureResult) {
            Checker checker = this.mChecker;
            if (checker != null && !checker.check(totalCaptureResult)) {
                return false;
            }
            this.mCompleter.set(totalCaptureResult);
            return true;
        }
    }

    public static class ScreenFlashTask implements PipelineTask {
        private static final long CHECK_3A_WITH_SCREEN_FLASH_TIMEOUT_IN_NS = TimeUnit.SECONDS.toNanos(2);
        private final Camera2CameraControlImpl mCameraControl;
        private final Executor mExecutor;
        private final ScheduledExecutorService mScheduler;
        private final ImageCapture.ScreenFlash mScreenFlash;
        private final UseFlashModeTorchFor3aUpdate mUseFlashModeTorchFor3aUpdate;

        public ScreenFlashTask(@NonNull Camera2CameraControlImpl camera2CameraControlImpl, @NonNull Executor executor, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull UseFlashModeTorchFor3aUpdate useFlashModeTorchFor3aUpdate) {
            this.mCameraControl = camera2CameraControlImpl;
            this.mExecutor = executor;
            this.mScheduler = scheduledExecutorService;
            this.mUseFlashModeTorchFor3aUpdate = useFlashModeTorchFor3aUpdate;
            ImageCapture.ScreenFlash screenFlash = camera2CameraControlImpl.getScreenFlash();
            Objects.requireNonNull(screenFlash);
            this.mScreenFlash = screenFlash;
        }

        /* renamed from: a */
        public static /* synthetic */ void m356a(ScreenFlashTask screenFlashTask, AtomicReference atomicReference, CallbackToFutureAdapter.Completer completer) {
            screenFlashTask.getClass();
            Logger.m501d(Camera2CapturePipeline.TAG, "ScreenFlashTask#preCapture: invoking applyScreenFlashUi");
            screenFlashTask.mScreenFlash.apply(System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(3L), (ImageCapture.ScreenFlashListener) atomicReference.get());
            completer.set(null);
        }

        /* renamed from: e */
        public static /* synthetic */ ListenableFuture m360e(final ScreenFlashTask screenFlashTask, Void r12) {
            screenFlashTask.getClass();
            return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.g1
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return Camera2CapturePipeline.ScreenFlashTask.m364i(this.f311a, completer);
                }
            });
        }

        /* renamed from: f */
        public static /* synthetic */ void m361f() {
        }

        /* renamed from: g */
        public static /* synthetic */ Object m362g(final ScreenFlashTask screenFlashTask, final AtomicReference atomicReference, final CallbackToFutureAdapter.Completer completer) {
            screenFlashTask.getClass();
            CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.camera2.internal.l1
                @Override // java.lang.Runnable
                public final void run() {
                    Camera2CapturePipeline.ScreenFlashTask.m356a(this.f349a, atomicReference, completer);
                }
            });
            return "OnScreenFlashStart";
        }

        /* renamed from: h */
        public static /* synthetic */ void m363h(CallbackToFutureAdapter.Completer completer) {
            Logger.m501d(Camera2CapturePipeline.TAG, "ScreenFlashTask#preCapture: UI change applied");
            completer.set(null);
        }

        /* renamed from: i */
        public static /* synthetic */ Object m364i(ScreenFlashTask screenFlashTask, CallbackToFutureAdapter.Completer completer) {
            if (!screenFlashTask.mUseFlashModeTorchFor3aUpdate.shouldUseFlashModeTorch()) {
                completer.set(null);
                return "EnableTorchInternal";
            }
            Logger.m501d(Camera2CapturePipeline.TAG, "ScreenFlashTask#preCapture: enable torch");
            screenFlashTask.mCameraControl.enableTorchInternal(true);
            completer.set(null);
            return "EnableTorchInternal";
        }

        /* renamed from: k */
        public static /* synthetic */ Object m366k(AtomicReference atomicReference, final CallbackToFutureAdapter.Completer completer) {
            atomicReference.set(new ImageCapture.ScreenFlashListener() { // from class: androidx.camera.camera2.internal.n1
                @Override // androidx.camera.core.ImageCapture.ScreenFlashListener
                public final void onCompleted() {
                    Camera2CapturePipeline.ScreenFlashTask.m363h(completer);
                }
            });
            return "OnScreenFlashUiApplied";
        }

        /* renamed from: m */
        public static /* synthetic */ ListenableFuture m368m(ScreenFlashTask screenFlashTask, ListenableFuture listenableFuture, Object obj) {
            screenFlashTask.getClass();
            return Futures.makeTimeoutFuture(TimeUnit.SECONDS.toMillis(3L), screenFlashTask.mScheduler, null, true, listenableFuture);
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public boolean isCaptureResultNeeded() {
            return false;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public void postCapture() {
            Logger.m501d(Camera2CapturePipeline.TAG, "ScreenFlashTask#postCapture");
            if (this.mUseFlashModeTorchFor3aUpdate.shouldUseFlashModeTorch()) {
                this.mCameraControl.enableTorchInternal(false);
            }
            this.mCameraControl.getFocusMeteringControl().enableExternalFlashAeMode(false).addListener(new Runnable() { // from class: androidx.camera.camera2.internal.j1
                @Override // java.lang.Runnable
                public final void run() {
                    Camera2CapturePipeline.ScreenFlashTask.m361f();
                }
            }, this.mExecutor);
            this.mCameraControl.getFocusMeteringControl().cancelAfAeTrigger(false, true);
            ScheduledExecutorService scheduledExecutorServiceMainThreadExecutor = CameraXExecutors.mainThreadExecutor();
            final ImageCapture.ScreenFlash screenFlash = this.mScreenFlash;
            Objects.requireNonNull(screenFlash);
            scheduledExecutorServiceMainThreadExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.k1
                @Override // java.lang.Runnable
                public final void run() {
                    screenFlash.clear();
                }
            });
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        @NonNull
        public ListenableFuture<Boolean> preCapture(@Nullable TotalCaptureResult totalCaptureResult) {
            Logger.m501d(Camera2CapturePipeline.TAG, "ScreenFlashTask#preCapture");
            final AtomicReference atomicReference = new AtomicReference();
            final ListenableFuture future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.o1
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return Camera2CapturePipeline.ScreenFlashTask.m366k(atomicReference, completer);
                }
            });
            return FutureChain.from(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.p1
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return Camera2CapturePipeline.ScreenFlashTask.m362g(this.f389a, atomicReference, completer);
                }
            })).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.q1
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final ListenableFuture apply(Object obj) {
                    return this.f398a.mCameraControl.getFocusMeteringControl().enableExternalFlashAeMode(true);
                }
            }, this.mExecutor).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.r1
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final ListenableFuture apply(Object obj) {
                    return Camera2CapturePipeline.ScreenFlashTask.m360e(this.f409a, (Void) obj);
                }
            }, this.mExecutor).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.s1
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final ListenableFuture apply(Object obj) {
                    return Camera2CapturePipeline.ScreenFlashTask.m368m(this.f416a, future, obj);
                }
            }, this.mExecutor).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.t1
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final ListenableFuture apply(Object obj) {
                    return this.f427a.mCameraControl.getFocusMeteringControl().triggerAePrecapture();
                }
            }, this.mExecutor).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.h1
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final ListenableFuture apply(Object obj) {
                    Camera2CapturePipeline.ScreenFlashTask screenFlashTask = this.f315a;
                    return Camera2CapturePipeline.waitForResult(Camera2CapturePipeline.ScreenFlashTask.CHECK_3A_WITH_SCREEN_FLASH_TIMEOUT_IN_NS, screenFlashTask.mScheduler, screenFlashTask.mCameraControl, new Camera2CapturePipeline.ResultListener.Checker() { // from class: androidx.camera.camera2.internal.m1
                        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.ResultListener.Checker
                        public final boolean check(TotalCaptureResult totalCaptureResult2) {
                            return Camera2CapturePipeline.is3AConverged(totalCaptureResult2, false);
                        }
                    });
                }
            }, this.mExecutor).transform(new Function() { // from class: androidx.camera.camera2.internal.i1
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return Boolean.FALSE;
                }
            }, CameraXExecutors.directExecutor());
        }
    }

    public static class TorchTask implements PipelineTask {
        private static final long CHECK_3A_WITH_TORCH_TIMEOUT_IN_NS = TimeUnit.SECONDS.toNanos(2);
        private final Camera2CameraControlImpl mCameraControl;
        private final Executor mExecutor;
        private final int mFlashMode;
        private boolean mIsExecuted = false;
        private final ScheduledExecutorService mScheduler;
        private final boolean mTriggerAePrecapture;

        public TorchTask(@NonNull Camera2CameraControlImpl camera2CameraControlImpl, int i9, @NonNull Executor executor, ScheduledExecutorService scheduledExecutorService, boolean z9) {
            this.mCameraControl = camera2CameraControlImpl;
            this.mFlashMode = i9;
            this.mExecutor = executor;
            this.mScheduler = scheduledExecutorService;
            this.mTriggerAePrecapture = z9;
        }

        /* renamed from: a */
        public static /* synthetic */ ListenableFuture m369a(TorchTask torchTask, Void r12) {
            return torchTask.mTriggerAePrecapture ? torchTask.mCameraControl.getFocusMeteringControl().triggerAePrecapture() : Futures.immediateFuture(null);
        }

        /* renamed from: b */
        public static /* synthetic */ Object m370b(TorchTask torchTask, CallbackToFutureAdapter.Completer completer) {
            torchTask.mCameraControl.getTorchControl().enableTorchInternal(completer, true);
            return "TorchOn";
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public boolean isCaptureResultNeeded() {
            return this.mFlashMode == 0;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public void postCapture() {
            if (this.mIsExecuted) {
                this.mCameraControl.getTorchControl().enableTorchInternal(null, false);
                Logger.m501d(Camera2CapturePipeline.TAG, "Turning off torch");
                if (this.mTriggerAePrecapture) {
                    this.mCameraControl.getFocusMeteringControl().cancelAfAeTrigger(false, true);
                }
            }
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        @NonNull
        public ListenableFuture<Boolean> preCapture(@Nullable TotalCaptureResult totalCaptureResult) {
            Logger.m501d(Camera2CapturePipeline.TAG, "TorchTask#preCapture: isFlashRequired = " + Camera2CapturePipeline.isFlashRequired(this.mFlashMode, totalCaptureResult));
            if (Camera2CapturePipeline.isFlashRequired(this.mFlashMode, totalCaptureResult)) {
                if (!this.mCameraControl.isTorchOn()) {
                    Logger.m501d(Camera2CapturePipeline.TAG, "Turn on torch");
                    this.mIsExecuted = true;
                    return FutureChain.from(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.v1
                        @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                        public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                            return Camera2CapturePipeline.TorchTask.m370b(this.f441a, completer);
                        }
                    })).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.w1
                        @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                        public final ListenableFuture apply(Object obj) {
                            return Camera2CapturePipeline.TorchTask.m369a(this.f446a, (Void) obj);
                        }
                    }, this.mExecutor).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.x1
                        @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                        public final ListenableFuture apply(Object obj) {
                            Camera2CapturePipeline.TorchTask torchTask = this.f453a;
                            return Camera2CapturePipeline.waitForResult(Camera2CapturePipeline.TorchTask.CHECK_3A_WITH_TORCH_TIMEOUT_IN_NS, torchTask.mScheduler, torchTask.mCameraControl, new Camera2CapturePipeline.ResultListener.Checker() { // from class: androidx.camera.camera2.internal.u1
                                @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.ResultListener.Checker
                                public final boolean check(TotalCaptureResult totalCaptureResult2) {
                                    return Camera2CapturePipeline.is3AConverged(totalCaptureResult2, true);
                                }
                            });
                        }
                    }, this.mExecutor).transform(new Function() { // from class: androidx.camera.camera2.internal.y1
                        @Override // androidx.arch.core.util.Function
                        public final Object apply(Object obj) {
                            return Boolean.FALSE;
                        }
                    }, CameraXExecutors.directExecutor());
                }
                Logger.m501d(Camera2CapturePipeline.TAG, "Torch already on, not turn on");
            }
            return Futures.immediateFuture(Boolean.FALSE);
        }
    }

    public Camera2CapturePipeline(@NonNull Camera2CameraControlImpl camera2CameraControlImpl, @NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat, @NonNull Quirks quirks, @NonNull Executor executor, @NonNull ScheduledExecutorService scheduledExecutorService) {
        this.mCameraControl = camera2CameraControlImpl;
        Integer num = (Integer) cameraCharacteristicsCompat.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.mIsLegacyDevice = num != null && num.intValue() == 2;
        this.mExecutor = executor;
        this.mScheduler = scheduledExecutorService;
        this.mCameraQuirk = quirks;
        this.mUseTorchAsFlash = new UseTorchAsFlash(quirks);
        this.mHasFlashUnit = FlashAvailabilityChecker.isFlashAvailable(new C0430r0(cameraCharacteristicsCompat));
    }

    public static boolean is3AConverged(@Nullable TotalCaptureResult totalCaptureResult, boolean z9) {
        if (totalCaptureResult == null) {
            return false;
        }
        return ConvergenceUtils.is3AConverged(new Camera2CameraCaptureResult(totalCaptureResult), z9);
    }

    public static boolean isFlashRequired(int i9, @Nullable TotalCaptureResult totalCaptureResult) {
        Logger.m501d(TAG, "isFlashRequired: flashMode = " + i9);
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 == 2) {
                    return false;
                }
                if (i9 != 3) {
                    throw new AssertionError(i9);
                }
            }
            return true;
        }
        Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
        Logger.m501d(TAG, "isFlashRequired: aeState = " + num);
        return num != null && num.intValue() == 4;
    }

    private boolean isTorchAsFlash(int i9) {
        return this.mUseTorchAsFlash.shouldUseTorchAsFlash() || this.mTemplate == 3 || i9 == 1;
    }

    @NonNull
    public static ListenableFuture<TotalCaptureResult> waitForResult(long j9, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull Camera2CameraControlImpl camera2CameraControlImpl, @Nullable ResultListener.Checker checker) {
        return Futures.makeTimeoutFuture(TimeUnit.NANOSECONDS.toMillis(j9), scheduledExecutorService, null, true, waitForResult(camera2CameraControlImpl, checker));
    }

    @VisibleForTesting
    public Pipeline createPipeline(int i9, int i10, int i11) {
        int i12;
        OverrideAeModeForStillCapture overrideAeModeForStillCapture = new OverrideAeModeForStillCapture(this.mCameraQuirk);
        Pipeline pipeline = new Pipeline(this.mTemplate, this.mExecutor, this.mScheduler, this.mCameraControl, this.mIsLegacyDevice, overrideAeModeForStillCapture);
        if (i9 == 0) {
            pipeline.addTask(new AfTask(this.mCameraControl));
        }
        if (i10 != 3) {
            if (this.mHasFlashUnit) {
                if (isTorchAsFlash(i11)) {
                    i12 = i10;
                    pipeline.addTask(new TorchTask(this.mCameraControl, i12, this.mExecutor, this.mScheduler, (this.mUseTorchAsFlash.shouldUseTorchAsFlash() || this.mCameraControl.isInVideoUsage()) ? false : true));
                } else {
                    i12 = i10;
                    pipeline.addTask(new AePreCaptureTask(this.mCameraControl, i12, overrideAeModeForStillCapture));
                }
            }
            Logger.m501d(TAG, "createPipeline: captureMode = " + i9 + ", flashMode = " + i12 + ", flashType = " + i11 + ", pipeline tasks = " + pipeline.mTasks);
            return pipeline;
        }
        pipeline.addTask(new ScreenFlashTask(this.mCameraControl, this.mExecutor, this.mScheduler, new UseFlashModeTorchFor3aUpdate(this.mCameraQuirk)));
        i12 = i10;
        Logger.m501d(TAG, "createPipeline: captureMode = " + i9 + ", flashMode = " + i12 + ", flashType = " + i11 + ", pipeline tasks = " + pipeline.mTasks);
        return pipeline;
    }

    @NonNull
    public CameraCapturePipeline getCameraCapturePipeline(int i9, int i10, int i11) {
        return new CameraCapturePipelineImpl(createPipeline(i9, i10, i11), this.mExecutor, i10);
    }

    public void setTemplate(int i9) {
        this.mTemplate = i9;
    }

    @NonNull
    public ListenableFuture<List<Void>> submitStillCaptures(@NonNull List<CaptureConfig> list, int i9, int i10, int i11) {
        return Futures.nonCancellationPropagating(createPipeline(i9, i10, i11).executeCapture(list, i10));
    }

    @NonNull
    public static ListenableFuture<TotalCaptureResult> waitForResult(@NonNull final Camera2CameraControlImpl camera2CameraControlImpl, @Nullable ResultListener.Checker checker) {
        final ResultListener resultListener = new ResultListener(checker);
        camera2CameraControlImpl.addCaptureResultListener(resultListener);
        ListenableFuture<TotalCaptureResult> future = resultListener.getFuture();
        future.addListener(new Runnable() { // from class: androidx.camera.camera2.internal.t0
            @Override // java.lang.Runnable
            public final void run() {
                camera2CameraControlImpl.removeCaptureResultListener(resultListener);
            }
        }, camera2CameraControlImpl.mExecutor);
        return future;
    }
}
