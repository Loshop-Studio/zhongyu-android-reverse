package androidx.camera.video;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.os.SystemClock;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.arch.core.util.Function;
import androidx.camera.core.AbstractC0700j;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ConfigProvider;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.core.internal.ThreadConfig;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.SurfaceProcessorNode;
import androidx.camera.core.processing.util.OutConfig;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.video.StreamInfo;
import androidx.camera.video.VideoCapture;
import androidx.camera.video.VideoOutput;
import androidx.camera.video.impl.VideoCaptureConfig;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk;
import androidx.camera.video.internal.config.VideoConfigUtil;
import androidx.camera.video.internal.encoder.SwappedVideoEncoderInfo;
import androidx.camera.video.internal.encoder.VideoEncoderConfig;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import androidx.camera.video.internal.encoder.VideoEncoderInfoImpl;
import androidx.camera.video.internal.utils.DynamicRangeUtil;
import androidx.camera.video.internal.workaround.VideoEncoderInfoWrapper;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class VideoCapture<T extends VideoOutput> extends UseCase {
    private static final Defaults DEFAULT_CONFIG = new Defaults();
    private static final String SURFACE_UPDATE_KEY = "androidx.camera.video.VideoCapture.streamUpdate";
    private static final String TAG = "VideoCapture";

    @Nullable
    private SurfaceEdge mCameraEdge;

    @Nullable
    private SessionConfig.CloseableErrorListener mCloseableErrorListener;

    @Nullable
    private Rect mCropRect;
    DeferrableSurface mDeferrableSurface;
    private boolean mHasCompensatingTransformation;

    @Nullable
    private SurfaceProcessorNode mNode;
    private int mRotationDegrees;

    @NonNull
    SessionConfig.Builder mSessionConfigBuilder;
    VideoOutput.SourceState mSourceState;

    @Nullable
    private SourceStreamRequirementObserver mSourceStreamRequirementObserver;
    StreamInfo mStreamInfo;
    private final Observable.Observer<StreamInfo> mStreamInfoObserver;
    private SurfaceRequest mSurfaceRequest;
    ListenableFuture<Void> mSurfaceUpdateFuture;

    /* renamed from: androidx.camera.video.VideoCapture$2 */
    public class C08132 extends CameraCaptureCallback {
        private boolean mIsFirstCaptureResult = true;
        final /* synthetic */ CallbackToFutureAdapter.Completer val$completer;
        final /* synthetic */ SessionConfig.Builder val$sessionConfigBuilder;
        final /* synthetic */ AtomicBoolean val$surfaceUpdateComplete;

        public C08132(AtomicBoolean atomicBoolean, CallbackToFutureAdapter.Completer completer, SessionConfig.Builder builder) {
            this.val$surfaceUpdateComplete = atomicBoolean;
            this.val$completer = completer;
            this.val$sessionConfigBuilder = builder;
        }

        /* renamed from: a */
        public static /* synthetic */ void m787a(C08132 c08132, SessionConfig.Builder builder) {
            c08132.getClass();
            builder.removeCameraCaptureCallback(c08132);
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCompleted(int i10, @NonNull CameraCaptureResult cameraCaptureResult) {
            Object tag;
            super.onCaptureCompleted(i10, cameraCaptureResult);
            if (this.mIsFirstCaptureResult) {
                this.mIsFirstCaptureResult = false;
                Logger.m573d(VideoCapture.TAG, "cameraCaptureResult timestampNs = " + cameraCaptureResult.getTimestamp() + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
            }
            if (this.val$surfaceUpdateComplete.get() || (tag = cameraCaptureResult.getTagBundle().getTag(VideoCapture.SURFACE_UPDATE_KEY)) == null || ((Integer) tag).intValue() != this.val$completer.hashCode() || !this.val$completer.set(null) || this.val$surfaceUpdateComplete.getAndSet(true)) {
                return;
            }
            ScheduledExecutorService scheduledExecutorServiceMainThreadExecutor = CameraXExecutors.mainThreadExecutor();
            final SessionConfig.Builder builder = this.val$sessionConfigBuilder;
            scheduledExecutorServiceMainThreadExecutor.execute(new Runnable() { // from class: androidx.camera.video.o0
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCapture.C08132.m787a(this.f969c, builder);
                }
            });
        }
    }

    public static final class Builder<T extends VideoOutput> implements UseCaseConfig.Builder<VideoCapture<T>, VideoCaptureConfig<T>, Builder<T>>, ImageOutputConfig.Builder<Builder<T>>, ImageInputConfig.Builder<Builder<T>>, ThreadConfig.Builder<Builder<T>> {
        private final MutableOptionsBundle mMutableConfig;

        public Builder(@NonNull T t10) {
            this(createInitialBundle(t10));
        }

        @NonNull
        private static <T extends VideoOutput> MutableOptionsBundle createInitialBundle(@NonNull T t10) {
            MutableOptionsBundle mutableOptionsBundleCreate = MutableOptionsBundle.create();
            mutableOptionsBundleCreate.insertOption(VideoCaptureConfig.OPTION_VIDEO_OUTPUT, t10);
            return mutableOptionsBundleCreate;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static Builder<? extends VideoOutput> fromConfig(@NonNull Config config) {
            return new Builder<>(MutableOptionsBundle.from(config));
        }

        @Override // androidx.camera.core.ExtendableBuilder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public MutableConfig getMutableConfig() {
            return this.mMutableConfig;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ Object setCustomOrderedResolutions(@NonNull List list) {
            return setCustomOrderedResolutions((List<Size>) list);
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ Object setSupportedResolutions(@NonNull List list) {
            return setSupportedResolutions((List<Pair<Integer, Size[]>>) list);
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setSurfaceProcessingForceEnabled() {
            getMutableConfig().insertOption(VideoCaptureConfig.OPTION_FORCE_ENABLE_SURFACE_PROCESSING, Boolean.TRUE);
            return this;
        }

        @NonNull
        public Builder<T> setTargetFrameRate(@NonNull Range<Integer> range) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_TARGET_FRAME_RATE, range);
            return this;
        }

        @NonNull
        public Builder<T> setVideoEncoderInfoFinder(@NonNull Function<VideoEncoderConfig, VideoEncoderInfo> function) {
            getMutableConfig().insertOption(VideoCaptureConfig.OPTION_VIDEO_ENCODER_INFO_FINDER, function);
            return this;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setVideoOutput(@NonNull VideoOutput videoOutput) {
            getMutableConfig().insertOption(VideoCaptureConfig.OPTION_VIDEO_OUTPUT, videoOutput);
            return this;
        }

        @NonNull
        public Builder<T> setVideoStabilizationEnabled(boolean z10) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_VIDEO_STABILIZATION_MODE, Integer.valueOf(z10 ? 2 : 1));
            return this;
        }

        private Builder(@NonNull MutableOptionsBundle mutableOptionsBundle) {
            this.mMutableConfig = mutableOptionsBundle;
            if (!mutableOptionsBundle.containsOption(VideoCaptureConfig.OPTION_VIDEO_OUTPUT)) {
                throw new IllegalArgumentException("VideoOutput is required");
            }
            Class cls = (Class) mutableOptionsBundle.retrieveOption(TargetConfig.OPTION_TARGET_CLASS, null);
            if (cls == null || cls.equals(VideoCapture.class)) {
                setCaptureType(UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE);
                setTargetClass((Class) VideoCapture.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static <T extends VideoOutput> Builder<T> fromConfig(@NonNull VideoCaptureConfig<T> videoCaptureConfig) {
            return new Builder<>(MutableOptionsBundle.from((Config) videoCaptureConfig));
        }

        @Override // androidx.camera.core.ExtendableBuilder
        @NonNull
        public VideoCapture<T> build() {
            return new VideoCapture<>(getUseCaseConfig());
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public VideoCaptureConfig<T> getUseCaseConfig() {
            return new VideoCaptureConfig<>(OptionsBundle.from(this.mMutableConfig));
        }

        @Override // androidx.camera.core.internal.ThreadConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setBackgroundExecutor(@NonNull Executor executor) {
            getMutableConfig().insertOption(ThreadConfig.OPTION_BACKGROUND_EXECUTOR, executor);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setCaptureOptionUnpacker(@NonNull CaptureConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setCaptureType(@NonNull UseCaseConfigFactory.CaptureType captureType) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_CAPTURE_TYPE, captureType);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setCustomOrderedResolutions(@NonNull List<Size> list) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS, list);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setDefaultCaptureConfig(@NonNull CaptureConfig captureConfig) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG, captureConfig);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setDefaultResolution(@NonNull Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_DEFAULT_RESOLUTION, size);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setDefaultSessionConfig(@NonNull SessionConfig sessionConfig) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG, sessionConfig);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageInputConfig.Builder
        @NonNull
        public Builder<T> setDynamicRange(@NonNull DynamicRange dynamicRange) {
            getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, dynamicRange);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setHighResolutionDisabled(boolean z10) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_HIGH_RESOLUTION_DISABLED, Boolean.valueOf(z10));
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setMaxResolution(@NonNull Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_MAX_RESOLUTION, size);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @NonNull
        public Builder<T> setMirrorMode(int i10) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_MIRROR_MODE, Integer.valueOf(i10));
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setResolutionSelector(@NonNull ResolutionSelector resolutionSelector) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_RESOLUTION_SELECTOR, resolutionSelector);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setSessionOptionUnpacker(@NonNull SessionConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setSupportedResolutions(@NonNull List<Pair<Integer, Size[]>> list) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS, list);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setSurfaceOccupancyPriority(int i10) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, Integer.valueOf(i10));
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setTargetAspectRatio(int i10) {
            throw new UnsupportedOperationException("setTargetAspectRatio is not supported.");
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setTargetClass(@NonNull Class<VideoCapture<T>> cls) {
            getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_CLASS, cls);
            if (getMutableConfig().retrieveOption(TargetConfig.OPTION_TARGET_NAME, null) == null) {
                setTargetName(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setTargetName(@NonNull String str) {
            getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_NAME, str);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setTargetResolution(@NonNull Size size) {
            throw new UnsupportedOperationException("setTargetResolution is not supported.");
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @NonNull
        public Builder<T> setTargetRotation(int i10) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_ROTATION, Integer.valueOf(i10));
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder<T> setZslDisabled(boolean z10) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_ZSL_DISABLED, Boolean.valueOf(z10));
            return this;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class Defaults implements ConfigProvider<VideoCaptureConfig<?>> {
        private static final VideoCaptureConfig<?> DEFAULT_CONFIG;
        static final DynamicRange DEFAULT_DYNAMIC_RANGE;
        static final Range<Integer> DEFAULT_FPS_RANGE;
        private static final int DEFAULT_SURFACE_OCCUPANCY_PRIORITY = 5;
        private static final Function<VideoEncoderConfig, VideoEncoderInfo> DEFAULT_VIDEO_ENCODER_INFO_FINDER;
        private static final VideoOutput DEFAULT_VIDEO_OUTPUT;

        static {
            VideoOutput videoOutput = new VideoOutput() { // from class: androidx.camera.video.p0
                @Override // androidx.camera.video.VideoOutput
                public final void onSurfaceRequested(SurfaceRequest surfaceRequest) {
                    surfaceRequest.willNotProvideSurface();
                }
            };
            DEFAULT_VIDEO_OUTPUT = videoOutput;
            Function<VideoEncoderConfig, VideoEncoderInfo> function = VideoEncoderInfoImpl.FINDER;
            DEFAULT_VIDEO_ENCODER_INFO_FINDER = function;
            DEFAULT_FPS_RANGE = new Range<>(30, 30);
            DynamicRange dynamicRange = DynamicRange.SDR;
            DEFAULT_DYNAMIC_RANGE = dynamicRange;
            DEFAULT_CONFIG = new Builder(videoOutput).setSurfaceOccupancyPriority(5).setVideoEncoderInfoFinder(function).setDynamicRange(dynamicRange).getUseCaseConfig();
        }

        @Override // androidx.camera.core.impl.ConfigProvider
        @NonNull
        public VideoCaptureConfig<?> getConfig() {
            return DEFAULT_CONFIG;
        }
    }

    public static class SourceStreamRequirementObserver implements Observable.Observer<Boolean> {

        @Nullable
        private CameraControlInternal mCameraControl;
        private boolean mIsSourceStreamRequired = false;

        public SourceStreamRequirementObserver(@NonNull CameraControlInternal cameraControlInternal) {
            this.mCameraControl = cameraControlInternal;
        }

        private void updateVideoUsageInCamera(boolean z10) {
            if (this.mIsSourceStreamRequired == z10) {
                return;
            }
            this.mIsSourceStreamRequired = z10;
            CameraControlInternal cameraControlInternal = this.mCameraControl;
            if (cameraControlInternal == null) {
                Logger.m573d(VideoCapture.TAG, "SourceStreamRequirementObserver#isSourceStreamRequired: Received new data despite being closed already");
            } else if (z10) {
                cameraControlInternal.incrementVideoUsage();
            } else {
                cameraControlInternal.decrementVideoUsage();
            }
        }

        @MainThread
        public void close() {
            Preconditions.checkState(Threads.isMainThread(), "SourceStreamRequirementObserver can be closed from main thread only");
            Logger.m573d(VideoCapture.TAG, "SourceStreamRequirementObserver#close: mIsSourceStreamRequired = " + this.mIsSourceStreamRequired);
            if (this.mCameraControl == null) {
                Logger.m573d(VideoCapture.TAG, "SourceStreamRequirementObserver#close: Already closed!");
            } else {
                updateVideoUsageInCamera(false);
                this.mCameraControl = null;
            }
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public void onError(@NonNull Throwable th) {
            Logger.m580w(VideoCapture.TAG, "SourceStreamRequirementObserver#onError", th);
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        @MainThread
        public void onNewData(@Nullable Boolean bool) {
            Preconditions.checkState(Threads.isMainThread(), "SourceStreamRequirementObserver can be updated from main thread only");
            updateVideoUsageInCamera(Boolean.TRUE.equals(bool));
        }
    }

    public VideoCapture(@NonNull VideoCaptureConfig<T> videoCaptureConfig) {
        super(videoCaptureConfig);
        this.mStreamInfo = StreamInfo.STREAM_INFO_ANY_INACTIVE;
        this.mSessionConfigBuilder = new SessionConfig.Builder();
        this.mSurfaceUpdateFuture = null;
        this.mSourceState = VideoOutput.SourceState.INACTIVE;
        this.mHasCompensatingTransformation = false;
        this.mStreamInfoObserver = new Observable.Observer<StreamInfo>() { // from class: androidx.camera.video.VideoCapture.1
            @Override // androidx.camera.core.impl.Observable.Observer
            public void onError(@NonNull Throwable th) {
                Logger.m580w(VideoCapture.TAG, "Receive onError from StreamState observer", th);
            }

            @Override // androidx.camera.core.impl.Observable.Observer
            public void onNewData(@Nullable StreamInfo streamInfo) {
                if (streamInfo == null) {
                    throw new IllegalArgumentException("StreamInfo can't be null");
                }
                if (VideoCapture.this.mSourceState == VideoOutput.SourceState.INACTIVE) {
                    return;
                }
                Logger.m573d(VideoCapture.TAG, "Stream info update: old: " + VideoCapture.this.mStreamInfo + " new: " + streamInfo);
                VideoCapture videoCapture = VideoCapture.this;
                StreamInfo streamInfo2 = videoCapture.mStreamInfo;
                videoCapture.mStreamInfo = streamInfo;
                StreamSpec streamSpec = (StreamSpec) Preconditions.checkNotNull(videoCapture.getAttachedStreamSpec());
                if (VideoCapture.this.isStreamIdChanged(streamInfo2.getId(), streamInfo.getId()) || VideoCapture.this.shouldResetCompensatingTransformation(streamInfo2, streamInfo)) {
                    VideoCapture.this.resetPipeline();
                    return;
                }
                if ((streamInfo2.getId() != -1 && streamInfo.getId() == -1) || (streamInfo2.getId() == -1 && streamInfo.getId() != -1)) {
                    VideoCapture videoCapture2 = VideoCapture.this;
                    videoCapture2.applyStreamInfoAndStreamSpecToSessionConfigBuilder(videoCapture2.mSessionConfigBuilder, streamInfo, streamSpec);
                    VideoCapture videoCapture3 = VideoCapture.this;
                    videoCapture3.updateSessionConfig(AbstractC0700j.m681a(new Object[]{videoCapture3.mSessionConfigBuilder.build()}));
                    VideoCapture.this.notifyReset();
                    return;
                }
                if (streamInfo2.getStreamState() != streamInfo.getStreamState()) {
                    VideoCapture videoCapture4 = VideoCapture.this;
                    videoCapture4.applyStreamInfoAndStreamSpecToSessionConfigBuilder(videoCapture4.mSessionConfigBuilder, streamInfo, streamSpec);
                    VideoCapture videoCapture5 = VideoCapture.this;
                    videoCapture5.updateSessionConfig(AbstractC0700j.m681a(new Object[]{videoCapture5.mSessionConfigBuilder.build()}));
                    VideoCapture.this.notifyUpdated();
                }
            }
        };
    }

    private static void addBySupportedSize(@NonNull Set<Size> set, int i10, int i11, @NonNull Size size, @NonNull VideoEncoderInfo videoEncoderInfo) {
        if (i10 > size.getWidth() || i11 > size.getHeight()) {
            return;
        }
        try {
            set.add(new Size(i10, ((Integer) videoEncoderInfo.getSupportedHeightsFor(i10).clamp(Integer.valueOf(i11))).intValue()));
        } catch (IllegalArgumentException e10) {
            Logger.m580w(TAG, "No supportedHeights for width: " + i10, e10);
        }
        try {
            set.add(new Size(((Integer) videoEncoderInfo.getSupportedWidthsFor(i11).clamp(Integer.valueOf(i10))).intValue(), i11));
        } catch (IllegalArgumentException e11) {
            Logger.m580w(TAG, "No supportedWidths for height: " + i11, e11);
        }
    }

    @NonNull
    private static Rect adjustCropRectByQuirk(@NonNull Rect rect, int i10, boolean z10, @Nullable VideoEncoderInfo videoEncoderInfo) {
        SizeCannotEncodeVideoQuirk sizeCannotEncodeVideoQuirk = (SizeCannotEncodeVideoQuirk) DeviceQuirks.get(SizeCannotEncodeVideoQuirk.class);
        if (sizeCannotEncodeVideoQuirk == null) {
            return rect;
        }
        if (!z10) {
            i10 = 0;
        }
        return sizeCannotEncodeVideoQuirk.adjustCropRectForProblematicEncodeSize(rect, i10, videoEncoderInfo);
    }

    @NonNull
    private static Rect adjustCropRectToValidSize(@NonNull final Rect rect, @NonNull Size size, @NonNull VideoEncoderInfo videoEncoderInfo) {
        Logger.m573d(TAG, String.format("Adjust cropRect %s by width/height alignment %d/%d and supported widths %s / supported heights %s", TransformUtils.rectToString(rect), Integer.valueOf(videoEncoderInfo.getWidthAlignment()), Integer.valueOf(videoEncoderInfo.getHeightAlignment()), videoEncoderInfo.getSupportedWidths(), videoEncoderInfo.getSupportedHeights()));
        if ((!videoEncoderInfo.getSupportedWidths().contains((Range<Integer>) Integer.valueOf(rect.width())) || !videoEncoderInfo.getSupportedHeights().contains((Range<Integer>) Integer.valueOf(rect.height()))) && videoEncoderInfo.canSwapWidthHeight() && videoEncoderInfo.getSupportedHeights().contains((Range<Integer>) Integer.valueOf(rect.width())) && videoEncoderInfo.getSupportedWidths().contains((Range<Integer>) Integer.valueOf(rect.height()))) {
            videoEncoderInfo = new SwappedVideoEncoderInfo(videoEncoderInfo);
        }
        int widthAlignment = videoEncoderInfo.getWidthAlignment();
        int heightAlignment = videoEncoderInfo.getHeightAlignment();
        Range<Integer> supportedWidths = videoEncoderInfo.getSupportedWidths();
        Range<Integer> supportedHeights = videoEncoderInfo.getSupportedHeights();
        int iAlignDown = alignDown(rect.width(), widthAlignment, supportedWidths);
        int iAlignUp = alignUp(rect.width(), widthAlignment, supportedWidths);
        int iAlignDown2 = alignDown(rect.height(), heightAlignment, supportedHeights);
        int iAlignUp2 = alignUp(rect.height(), heightAlignment, supportedHeights);
        HashSet hashSet = new HashSet();
        addBySupportedSize(hashSet, iAlignDown, iAlignDown2, size, videoEncoderInfo);
        addBySupportedSize(hashSet, iAlignDown, iAlignUp2, size, videoEncoderInfo);
        addBySupportedSize(hashSet, iAlignUp, iAlignDown2, size, videoEncoderInfo);
        addBySupportedSize(hashSet, iAlignUp, iAlignUp2, size, videoEncoderInfo);
        if (hashSet.isEmpty()) {
            Logger.m579w(TAG, "Can't find valid cropped size");
            return rect;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        Logger.m573d(TAG, "candidatesList = " + arrayList);
        Collections.sort(arrayList, new Comparator() { // from class: androidx.camera.video.m0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return VideoCapture.m781b(rect, (Size) obj, (Size) obj2);
            }
        });
        Logger.m573d(TAG, "sorted candidatesList = " + arrayList);
        Size size2 = (Size) arrayList.get(0);
        int width = size2.getWidth();
        int height = size2.getHeight();
        if (width == rect.width() && height == rect.height()) {
            Logger.m573d(TAG, "No need to adjust cropRect because crop size is valid.");
            return rect;
        }
        Preconditions.checkState(width % 2 == 0 && height % 2 == 0 && width <= size.getWidth() && height <= size.getHeight());
        Rect rect2 = new Rect(rect);
        if (width != rect.width()) {
            int iMax = Math.max(0, rect.centerX() - (width / 2));
            rect2.left = iMax;
            int i10 = iMax + width;
            rect2.right = i10;
            if (i10 > size.getWidth()) {
                int width2 = size.getWidth();
                rect2.right = width2;
                rect2.left = width2 - width;
            }
        }
        if (height != rect.height()) {
            int iMax2 = Math.max(0, rect.centerY() - (height / 2));
            rect2.top = iMax2;
            int i11 = iMax2 + height;
            rect2.bottom = i11;
            if (i11 > size.getHeight()) {
                int height2 = size.getHeight();
                rect2.bottom = height2;
                rect2.top = height2 - height;
            }
        }
        Logger.m573d(TAG, String.format("Adjust cropRect from %s to %s", TransformUtils.rectToString(rect), TransformUtils.rectToString(rect2)));
        return rect2;
    }

    @NonNull
    private Rect adjustCropRectWithInProgressTransformation(@NonNull Rect rect, int i10) {
        return shouldCompensateTransformation() ? TransformUtils.sizeToRect(TransformUtils.getRotatedSize(((SurfaceRequest.TransformationInfo) Preconditions.checkNotNull(this.mStreamInfo.getInProgressTransformationInfo())).getCropRect(), i10)) : rect;
    }

    @NonNull
    private Size adjustResolutionWithInProgressTransformation(@NonNull Size size, @NonNull Rect rect, @NonNull Rect rect2) {
        if (!shouldCompensateTransformation() || rect2.equals(rect)) {
            return size;
        }
        float fHeight = rect2.height() / rect.height();
        return new Size((int) Math.ceil(size.getWidth() * fHeight), (int) Math.ceil(size.getHeight() * fHeight));
    }

    private static int align(boolean z10, int i10, int i11, @NonNull Range<Integer> range) {
        int i12 = i10 % i11;
        if (i12 != 0) {
            i10 = z10 ? i10 - i12 : i10 + (i11 - i12);
        }
        return ((Integer) range.clamp(Integer.valueOf(i10))).intValue();
    }

    private static int alignDown(int i10, int i11, @NonNull Range<Integer> range) {
        return align(true, i10, i11, range);
    }

    private static int alignUp(int i10, int i11, @NonNull Range<Integer> range) {
        return align(false, i10, i11, range);
    }

    /* renamed from: b */
    public static /* synthetic */ int m781b(Rect rect, Size size, Size size2) {
        return (Math.abs(size.getWidth() - rect.width()) + Math.abs(size.getHeight() - rect.height())) - (Math.abs(size2.getWidth() - rect.width()) + Math.abs(size2.getHeight() - rect.height()));
    }

    /* renamed from: c */
    public static /* synthetic */ void m782c(VideoCapture videoCapture, DeferrableSurface deferrableSurface) {
        if (deferrableSurface == videoCapture.mDeferrableSurface) {
            videoCapture.clearPipeline();
        }
    }

    @NonNull
    private Rect calculateCropRect(@NonNull Size size, @Nullable VideoEncoderInfo videoEncoderInfo) {
        Rect viewPortCropRect = getViewPortCropRect() != null ? getViewPortCropRect() : new Rect(0, 0, size.getWidth(), size.getHeight());
        return (videoEncoderInfo == null || videoEncoderInfo.isSizeSupportedAllowSwapping(viewPortCropRect.width(), viewPortCropRect.height())) ? viewPortCropRect : adjustCropRectToValidSize(viewPortCropRect, size, videoEncoderInfo);
    }

    @MainThread
    private void clearPipeline() {
        Threads.checkMainThread();
        SessionConfig.CloseableErrorListener closeableErrorListener = this.mCloseableErrorListener;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
            this.mCloseableErrorListener = null;
        }
        DeferrableSurface deferrableSurface = this.mDeferrableSurface;
        if (deferrableSurface != null) {
            deferrableSurface.close();
            this.mDeferrableSurface = null;
        }
        SurfaceProcessorNode surfaceProcessorNode = this.mNode;
        if (surfaceProcessorNode != null) {
            surfaceProcessorNode.release();
            this.mNode = null;
        }
        SurfaceEdge surfaceEdge = this.mCameraEdge;
        if (surfaceEdge != null) {
            surfaceEdge.close();
            this.mCameraEdge = null;
        }
        this.mCropRect = null;
        this.mSurfaceRequest = null;
        this.mStreamInfo = StreamInfo.STREAM_INFO_ANY_INACTIVE;
        this.mRotationDegrees = 0;
        this.mHasCompensatingTransformation = false;
    }

    @Nullable
    private SurfaceProcessorNode createNodeIfNeeded(@NonNull CameraInternal cameraInternal, @NonNull VideoCaptureConfig<T> videoCaptureConfig, @NonNull Rect rect, @NonNull Size size, @NonNull DynamicRange dynamicRange) {
        if (!isCreateNodeNeeded(cameraInternal, videoCaptureConfig, rect, size)) {
            return null;
        }
        Logger.m573d(TAG, "Surface processing is enabled.");
        CameraInternal camera = getCamera();
        Objects.requireNonNull(camera);
        return new SurfaceProcessorNode(camera, getEffect() != null ? getEffect().createSurfaceProcessorInternal() : DefaultSurfaceProcessor.Factory.newInstance(dynamicRange));
    }

    @NonNull
    @SuppressLint({"WrongConstant"})
    @MainThread
    private SessionConfig.Builder createPipeline(@NonNull final VideoCaptureConfig<T> videoCaptureConfig, @NonNull StreamSpec streamSpec) {
        VideoCaptureConfig<T> videoCaptureConfig2;
        final VideoCapture<T> videoCapture = this;
        Threads.checkMainThread();
        final CameraInternal cameraInternal = (CameraInternal) Preconditions.checkNotNull(videoCapture.getCamera());
        Size resolution = streamSpec.getResolution();
        Runnable runnable = new Runnable() { // from class: androidx.camera.video.h0
            @Override // java.lang.Runnable
            public final void run() {
                this.f834c.notifyReset();
            }
        };
        Range<Integer> rangeResolveFrameRate = resolveFrameRate(streamSpec);
        MediaSpec mediaSpec = videoCapture.getMediaSpec();
        Objects.requireNonNull(mediaSpec);
        VideoCapabilities videoCapabilities = videoCapture.getVideoCapabilities(cameraInternal.getCameraInfo());
        DynamicRange dynamicRange = streamSpec.getDynamicRange();
        VideoEncoderInfo videoEncoderInfoResolveVideoEncoderInfo = resolveVideoEncoderInfo(videoCaptureConfig.getVideoEncoderInfoFinder(), videoCapabilities.findNearestHigherSupportedEncoderProfilesFor(resolution, dynamicRange), mediaSpec, resolution, dynamicRange, rangeResolveFrameRate);
        videoCapture.mRotationDegrees = videoCapture.getCompensatedRotation(cameraInternal);
        Rect rectCalculateCropRect = videoCapture.calculateCropRect(resolution, videoEncoderInfoResolveVideoEncoderInfo);
        Rect rectAdjustCropRectWithInProgressTransformation = videoCapture.adjustCropRectWithInProgressTransformation(rectCalculateCropRect, videoCapture.mRotationDegrees);
        videoCapture.mCropRect = rectAdjustCropRectWithInProgressTransformation;
        Size sizeAdjustResolutionWithInProgressTransformation = videoCapture.adjustResolutionWithInProgressTransformation(resolution, rectCalculateCropRect, rectAdjustCropRectWithInProgressTransformation);
        if (videoCapture.shouldCompensateTransformation()) {
            videoCapture.mHasCompensatingTransformation = true;
        }
        Rect rect = videoCapture.mCropRect;
        Rect rectAdjustCropRectByQuirk = adjustCropRectByQuirk(rect, videoCapture.mRotationDegrees, videoCapture.isCreateNodeNeeded(cameraInternal, videoCaptureConfig, rect, resolution), videoEncoderInfoResolveVideoEncoderInfo);
        videoCapture.mCropRect = rectAdjustCropRectByQuirk;
        SurfaceProcessorNode surfaceProcessorNodeCreateNodeIfNeeded = videoCapture.createNodeIfNeeded(cameraInternal, videoCaptureConfig, rectAdjustCropRectByQuirk, resolution, dynamicRange);
        videoCapture.mNode = surfaceProcessorNodeCreateNodeIfNeeded;
        final Timebase timebaseResolveTimebase = resolveTimebase(cameraInternal, surfaceProcessorNodeCreateNodeIfNeeded);
        Logger.m573d(TAG, "camera timebase = " + cameraInternal.getCameraInfoInternal().getTimebase() + ", processing timebase = " + timebaseResolveTimebase);
        StreamSpec streamSpecBuild = streamSpec.toBuilder().setResolution(sizeAdjustResolutionWithInProgressTransformation).setExpectedFrameRateRange(rangeResolveFrameRate).build();
        Preconditions.checkState(videoCapture.mCameraEdge == null);
        SurfaceEdge surfaceEdge = new SurfaceEdge(2, 34, streamSpecBuild, videoCapture.getSensorToBufferTransformMatrix(), cameraInternal.getHasTransform(), videoCapture.mCropRect, videoCapture.mRotationDegrees, videoCapture.getAppTargetRotation(), videoCapture.shouldMirror(cameraInternal));
        videoCapture.mCameraEdge = surfaceEdge;
        surfaceEdge.addOnInvalidatedListener(runnable);
        if (videoCapture.mNode != null) {
            OutConfig outConfigM731of = OutConfig.m731of(videoCapture.mCameraEdge);
            final SurfaceEdge surfaceEdge2 = videoCapture.mNode.transform(SurfaceProcessorNode.AbstractC0715In.m713of(videoCapture.mCameraEdge, Collections.singletonList(outConfigM731of))).get(outConfigM731of);
            Objects.requireNonNull(surfaceEdge2);
            Runnable runnable2 = new Runnable() { // from class: androidx.camera.video.i0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f837c.onAppEdgeInvalidated(surfaceEdge2, cameraInternal, videoCaptureConfig, timebaseResolveTimebase);
                }
            };
            videoCapture = this;
            videoCaptureConfig2 = videoCaptureConfig;
            surfaceEdge2.addOnInvalidatedListener(runnable2);
            videoCapture.mSurfaceRequest = surfaceEdge2.createSurfaceRequest(cameraInternal);
            final DeferrableSurface deferrableSurface = videoCapture.mCameraEdge.getDeferrableSurface();
            videoCapture.mDeferrableSurface = deferrableSurface;
            deferrableSurface.getTerminationFuture().addListener(new Runnable() { // from class: androidx.camera.video.j0
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCapture.m782c(this.f955c, deferrableSurface);
                }
            }, CameraXExecutors.mainThreadExecutor());
        } else {
            videoCaptureConfig2 = videoCaptureConfig;
            SurfaceRequest surfaceRequestCreateSurfaceRequest = videoCapture.mCameraEdge.createSurfaceRequest(cameraInternal);
            videoCapture.mSurfaceRequest = surfaceRequestCreateSurfaceRequest;
            videoCapture.mDeferrableSurface = surfaceRequestCreateSurfaceRequest.getDeferrableSurface();
        }
        videoCaptureConfig2.getVideoOutput().onSurfaceRequested(videoCapture.mSurfaceRequest, timebaseResolveTimebase);
        videoCapture.sendTransformationInfoIfReady();
        videoCapture.mDeferrableSurface.setContainerClass(MediaCodec.class);
        SessionConfig.Builder builderCreateFrom = SessionConfig.Builder.createFrom(videoCaptureConfig2, streamSpec.getResolution());
        builderCreateFrom.setExpectedFrameRateRange(streamSpec.getExpectedFrameRateRange());
        builderCreateFrom.setVideoStabilization(videoCaptureConfig2.getVideoStabilizationMode());
        SessionConfig.CloseableErrorListener closeableErrorListener = videoCapture.mCloseableErrorListener;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
        }
        SessionConfig.CloseableErrorListener closeableErrorListener2 = new SessionConfig.CloseableErrorListener(new SessionConfig.ErrorListener() { // from class: androidx.camera.video.k0
            @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
            public final void onError(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
                this.f957a.resetPipeline();
            }
        });
        videoCapture.mCloseableErrorListener = closeableErrorListener2;
        builderCreateFrom.setErrorListener(closeableErrorListener2);
        if (streamSpec.getImplementationOptions() != null) {
            builderCreateFrom.addImplementationOptions(streamSpec.getImplementationOptions());
        }
        return builderCreateFrom;
    }

    /* renamed from: e */
    public static /* synthetic */ void m784e(AtomicBoolean atomicBoolean, SessionConfig.Builder builder, CameraCaptureCallback cameraCaptureCallback) {
        Preconditions.checkState(Threads.isMainThread(), "Surface update cancellation should only occur on main thread.");
        atomicBoolean.set(true);
        builder.removeCameraCaptureCallback(cameraCaptureCallback);
    }

    /* renamed from: f */
    public static /* synthetic */ Object m785f(VideoCapture videoCapture, final SessionConfig.Builder builder, CallbackToFutureAdapter.Completer completer) {
        videoCapture.getClass();
        builder.addTag(SURFACE_UPDATE_KEY, Integer.valueOf(completer.hashCode()));
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final C08132 c08132 = new C08132(atomicBoolean, completer, builder);
        completer.addCancellationListener(new Runnable() { // from class: androidx.camera.video.l0
            @Override // java.lang.Runnable
            public final void run() {
                VideoCapture.m784e(atomicBoolean, builder, c08132);
            }
        }, CameraXExecutors.directExecutor());
        builder.addRepeatingCameraCaptureCallback(c08132);
        return String.format("%s[0x%x]", SURFACE_UPDATE_KEY, Integer.valueOf(completer.hashCode()));
    }

    @Nullable
    private static <T> T fetchObservableValue(@NonNull Observable<T> observable, @Nullable T t10) {
        ListenableFuture<T> listenableFutureFetchData = observable.fetchData();
        if (!listenableFutureFetchData.isDone()) {
            return t10;
        }
        try {
            return listenableFutureFetchData.get();
        } catch (InterruptedException | ExecutionException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @NonNull
    private static List<Size> filterOutEncoderUnsupportedResolutions(@NonNull VideoCaptureConfig<?> videoCaptureConfig, @NonNull MediaSpec mediaSpec, @NonNull DynamicRange dynamicRange, @NonNull VideoCapabilities videoCapabilities, @NonNull List<Size> list, @NonNull Map<Quality, Size> map) {
        VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxyFindNearestHigherSupportedEncoderProfilesFor;
        if (!list.isEmpty()) {
            Iterator<Size> it = list.iterator();
            while (it.hasNext()) {
                Size next = it.next();
                if (!map.containsValue(next) && (videoValidatedEncoderProfilesProxyFindNearestHigherSupportedEncoderProfilesFor = videoCapabilities.findNearestHigherSupportedEncoderProfilesFor(next, dynamicRange)) != null) {
                    Function<VideoEncoderConfig, VideoEncoderInfo> videoEncoderInfoFinder = videoCaptureConfig.getVideoEncoderInfoFinder();
                    Range<Integer> targetFrameRate = videoCaptureConfig.getTargetFrameRate(Defaults.DEFAULT_FPS_RANGE);
                    Objects.requireNonNull(targetFrameRate);
                    MediaSpec mediaSpec2 = mediaSpec;
                    DynamicRange dynamicRange2 = dynamicRange;
                    VideoEncoderInfo videoEncoderInfoFindLargestSupportedSizeVideoEncoderInfo = findLargestSupportedSizeVideoEncoderInfo(videoEncoderInfoFinder, videoValidatedEncoderProfilesProxyFindNearestHigherSupportedEncoderProfilesFor, dynamicRange2, mediaSpec2, next, targetFrameRate);
                    if (videoEncoderInfoFindLargestSupportedSizeVideoEncoderInfo != null && !videoEncoderInfoFindLargestSupportedSizeVideoEncoderInfo.isSizeSupportedAllowSwapping(next.getWidth(), next.getHeight())) {
                        it.remove();
                    }
                    dynamicRange = dynamicRange2;
                    mediaSpec = mediaSpec2;
                }
            }
        }
        return list;
    }

    @Nullable
    private static VideoEncoderInfo findLargestSupportedSizeVideoEncoderInfo(@NonNull Function<VideoEncoderConfig, VideoEncoderInfo> function, @NonNull VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy, @NonNull DynamicRange dynamicRange, @NonNull MediaSpec mediaSpec, @NonNull Size size, @NonNull Range<Integer> range) {
        VideoEncoderInfo videoEncoderInfoResolveVideoEncoderInfo;
        int area;
        if (dynamicRange.isFullySpecified()) {
            return resolveVideoEncoderInfo(function, videoValidatedEncoderProfilesProxy, mediaSpec, size, dynamicRange, range);
        }
        int i10 = Integer.MIN_VALUE;
        VideoEncoderInfo videoEncoderInfo = null;
        for (EncoderProfilesProxy.VideoProfileProxy videoProfileProxy : videoValidatedEncoderProfilesProxy.getVideoProfiles()) {
            if (DynamicRangeUtil.isHdrSettingsMatched(videoProfileProxy, dynamicRange) && (videoEncoderInfoResolveVideoEncoderInfo = resolveVideoEncoderInfo(function, videoValidatedEncoderProfilesProxy, mediaSpec, size, new DynamicRange(DynamicRangeUtil.videoProfileHdrFormatsToDynamicRangeEncoding(videoProfileProxy.getHdrFormat()), DynamicRangeUtil.videoProfileBitDepthToDynamicRangeBitDepth(videoProfileProxy.getBitDepth())), range)) != null && (area = SizeUtil.getArea(((Integer) videoEncoderInfoResolveVideoEncoderInfo.getSupportedWidths().getUpper()).intValue(), ((Integer) videoEncoderInfoResolveVideoEncoderInfo.getSupportedHeights().getUpper()).intValue())) > i10) {
                videoEncoderInfo = videoEncoderInfoResolveVideoEncoderInfo;
                i10 = area;
            }
        }
        return videoEncoderInfo;
    }

    private int getCompensatedRotation(@NonNull CameraInternal cameraInternal) {
        boolean zIsMirroringRequired = isMirroringRequired(cameraInternal);
        int relativeRotation = getRelativeRotation(cameraInternal, zIsMirroringRequired);
        if (!shouldCompensateTransformation()) {
            return relativeRotation;
        }
        SurfaceRequest.TransformationInfo inProgressTransformationInfo = this.mStreamInfo.getInProgressTransformationInfo();
        Objects.requireNonNull(inProgressTransformationInfo);
        int rotationDegrees = inProgressTransformationInfo.getRotationDegrees();
        if (zIsMirroringRequired != inProgressTransformationInfo.isMirroring()) {
            rotationDegrees = -rotationDegrees;
        }
        return TransformUtils.within360(relativeRotation - rotationDegrees);
    }

    @Nullable
    private MediaSpec getMediaSpec() {
        return (MediaSpec) fetchObservableValue(getOutput().getMediaSpec(), null);
    }

    @NonNull
    private VideoCapabilities getVideoCapabilities(@NonNull CameraInfo cameraInfo) {
        return getOutput().getMediaCapabilities(cameraInfo);
    }

    private boolean isCreateNodeNeeded(@NonNull CameraInternal cameraInternal, @NonNull VideoCaptureConfig<?> videoCaptureConfig, @NonNull Rect rect, @NonNull Size size) {
        return getEffect() != null || shouldEnableSurfaceProcessingByConfig(cameraInternal, videoCaptureConfig) || shouldEnableSurfaceProcessingByQuirk(cameraInternal) || shouldCrop(rect, size) || shouldMirror(cameraInternal) || shouldCompensateTransformation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAppEdgeInvalidated(@NonNull SurfaceEdge surfaceEdge, @NonNull CameraInternal cameraInternal, @NonNull VideoCaptureConfig<T> videoCaptureConfig, @NonNull Timebase timebase) {
        if (cameraInternal == getCamera()) {
            this.mSurfaceRequest = surfaceEdge.createSurfaceRequest(cameraInternal);
            videoCaptureConfig.getVideoOutput().onSurfaceRequested(this.mSurfaceRequest, timebase);
            sendTransformationInfoIfReady();
        }
    }

    @NonNull
    private static Range<Integer> resolveFrameRate(@NonNull StreamSpec streamSpec) {
        Range<Integer> expectedFrameRateRange = streamSpec.getExpectedFrameRateRange();
        return Objects.equals(expectedFrameRateRange, StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED) ? Defaults.DEFAULT_FPS_RANGE : expectedFrameRateRange;
    }

    @NonNull
    private static Timebase resolveTimebase(@NonNull CameraInternal cameraInternal, @Nullable SurfaceProcessorNode surfaceProcessorNode) {
        return (surfaceProcessorNode == null && cameraInternal.getHasTransform()) ? Timebase.UPTIME : cameraInternal.getCameraInfoInternal().getTimebase();
    }

    @Nullable
    private static VideoEncoderInfo resolveVideoEncoderInfo(@NonNull Function<VideoEncoderConfig, VideoEncoderInfo> function, @Nullable VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy, @NonNull MediaSpec mediaSpec, @NonNull Size size, @NonNull DynamicRange dynamicRange, @NonNull Range<Integer> range) {
        VideoEncoderInfo videoEncoderInfoApply = function.apply(VideoConfigUtil.resolveVideoEncoderConfig(VideoConfigUtil.resolveVideoMimeInfo(mediaSpec, dynamicRange, videoValidatedEncoderProfilesProxy), Timebase.UPTIME, mediaSpec.getVideoSpec(), size, dynamicRange, range));
        if (videoEncoderInfoApply != null) {
            return VideoEncoderInfoWrapper.from(videoEncoderInfoApply, videoValidatedEncoderProfilesProxy != null ? new Size(videoValidatedEncoderProfilesProxy.getDefaultVideoProfile().getWidth(), videoValidatedEncoderProfilesProxy.getDefaultVideoProfile().getHeight()) : null);
        }
        Logger.m579w(TAG, "Can't find videoEncoderInfo");
        return null;
    }

    private void sendTransformationInfoIfReady() {
        CameraInternal camera = getCamera();
        SurfaceEdge surfaceEdge = this.mCameraEdge;
        if (camera == null || surfaceEdge == null) {
            return;
        }
        int compensatedRotation = getCompensatedRotation(camera);
        this.mRotationDegrees = compensatedRotation;
        surfaceEdge.updateTransformation(compensatedRotation, getAppTargetRotation());
    }

    @MainThread
    private void setupSurfaceUpdateNotifier(@NonNull final SessionConfig.Builder builder, final boolean z10) {
        ListenableFuture<Void> listenableFuture = this.mSurfaceUpdateFuture;
        if (listenableFuture != null && listenableFuture.cancel(false)) {
            Logger.m573d(TAG, "A newer surface update is requested. Previous surface update cancelled.");
        }
        final ListenableFuture<Void> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.n0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return VideoCapture.m785f(this.f965a, builder, completer);
            }
        });
        this.mSurfaceUpdateFuture = future;
        Futures.addCallback(future, new FutureCallback<Void>() { // from class: androidx.camera.video.VideoCapture.3
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(@NonNull Throwable th) {
                if (th instanceof CancellationException) {
                    return;
                }
                Logger.m576e(VideoCapture.TAG, "Surface update completed with unexpected exception", th);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(@Nullable Void r32) {
                ListenableFuture<Void> listenableFuture2 = future;
                VideoCapture videoCapture = VideoCapture.this;
                if (listenableFuture2 != videoCapture.mSurfaceUpdateFuture || videoCapture.mSourceState == VideoOutput.SourceState.INACTIVE) {
                    return;
                }
                videoCapture.setSourceState(z10 ? VideoOutput.SourceState.ACTIVE_STREAMING : VideoOutput.SourceState.ACTIVE_NON_STREAMING);
            }
        }, CameraXExecutors.mainThreadExecutor());
    }

    private boolean shouldCompensateTransformation() {
        return this.mStreamInfo.getInProgressTransformationInfo() != null;
    }

    private static boolean shouldCrop(@NonNull Rect rect, @NonNull Size size) {
        return (size.getWidth() == rect.width() && size.getHeight() == rect.height()) ? false : true;
    }

    private static <T extends VideoOutput> boolean shouldEnableSurfaceProcessingByConfig(@NonNull CameraInternal cameraInternal, @NonNull VideoCaptureConfig<T> videoCaptureConfig) {
        return cameraInternal.getHasTransform() && videoCaptureConfig.isSurfaceProcessingForceEnabled();
    }

    private static boolean shouldEnableSurfaceProcessingByQuirk(@NonNull CameraInternal cameraInternal) {
        if (cameraInternal.getHasTransform()) {
            return SurfaceProcessingQuirk.workaroundBySurfaceProcessing(DeviceQuirks.getAll()) || SurfaceProcessingQuirk.workaroundBySurfaceProcessing(cameraInternal.getCameraInfoInternal().getCameraQuirks());
        }
        return false;
    }

    private boolean shouldMirror(@NonNull CameraInternal cameraInternal) {
        return cameraInternal.getHasTransform() && isMirroringRequired(cameraInternal);
    }

    private void updateCustomOrderedResolutionsByQuality(@NonNull CameraInfoInternal cameraInfoInternal, @NonNull UseCaseConfig.Builder<?, ?, ?> builder) {
        MediaSpec mediaSpec = getMediaSpec();
        Preconditions.checkArgument(mediaSpec != null, "Unable to update target resolution by null MediaSpec.");
        DynamicRange dynamicRange = getDynamicRange();
        VideoCapabilities videoCapabilities = getVideoCapabilities(cameraInfoInternal);
        List<Quality> supportedQualities = videoCapabilities.getSupportedQualities(dynamicRange);
        if (supportedQualities.isEmpty()) {
            Logger.m579w(TAG, "Can't find any supported quality on the device.");
            return;
        }
        VideoSpec videoSpec = mediaSpec.getVideoSpec();
        QualitySelector qualitySelector = videoSpec.getQualitySelector();
        List<Quality> prioritizedQualities = qualitySelector.getPrioritizedQualities(supportedQualities);
        Logger.m573d(TAG, "Found selectedQualities " + prioritizedQualities + " by " + qualitySelector);
        if (prioritizedQualities.isEmpty()) {
            throw new IllegalArgumentException("Unable to find supported quality by QualitySelector");
        }
        int aspectRatio = videoSpec.getAspectRatio();
        Map<Quality, Size> qualityToResolutionMap = QualitySelector.getQualityToResolutionMap(videoCapabilities, dynamicRange);
        QualityRatioToResolutionsTable qualityRatioToResolutionsTable = new QualityRatioToResolutionsTable(cameraInfoInternal.getSupportedResolutions(getImageFormat()), qualityToResolutionMap);
        ArrayList arrayList = new ArrayList();
        Iterator<Quality> it = prioritizedQualities.iterator();
        while (it.hasNext()) {
            arrayList.addAll(qualityRatioToResolutionsTable.getResolutions(it.next(), aspectRatio));
        }
        List<Size> listFilterOutEncoderUnsupportedResolutions = filterOutEncoderUnsupportedResolutions((VideoCaptureConfig) builder.getUseCaseConfig(), mediaSpec, dynamicRange, videoCapabilities, arrayList, qualityToResolutionMap);
        Logger.m573d(TAG, "Set custom ordered resolutions = " + listFilterOutEncoderUnsupportedResolutions);
        builder.getMutableConfig().insertOption(ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS, listFilterOutEncoderUnsupportedResolutions);
    }

    @NonNull
    public static <T extends VideoOutput> VideoCapture<T> withOutput(@NonNull T t10) {
        return new Builder((VideoOutput) Preconditions.checkNotNull(t10)).build();
    }

    @MainThread
    public void applyStreamInfoAndStreamSpecToSessionConfigBuilder(@NonNull SessionConfig.Builder builder, @NonNull StreamInfo streamInfo, @NonNull StreamSpec streamSpec) {
        DeferrableSurface deferrableSurface;
        boolean z10 = streamInfo.getId() == -1;
        boolean z11 = streamInfo.getStreamState() == StreamInfo.StreamState.ACTIVE;
        if (z10 && z11) {
            throw new IllegalStateException("Unexpected stream state, stream is error but active");
        }
        builder.clearSurfaces();
        DynamicRange dynamicRange = streamSpec.getDynamicRange();
        if (!z10 && (deferrableSurface = this.mDeferrableSurface) != null) {
            if (z11) {
                builder.addSurface(deferrableSurface, dynamicRange, null, -1);
            } else {
                builder.addNonRepeatingSurface(deferrableSurface, dynamicRange);
            }
        }
        setupSurfaceUpdateNotifier(builder, z11);
    }

    @Nullable
    @VisibleForTesting
    public SurfaceEdge getCameraEdge() {
        return this.mCameraEdge;
    }

    @Nullable
    @VisibleForTesting
    public Rect getCropRect() {
        return this.mCropRect;
    }

    @Override // androidx.camera.core.UseCase
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCaseConfig<?> getDefaultConfig(boolean z10, @NonNull UseCaseConfigFactory useCaseConfigFactory) {
        Defaults defaults = DEFAULT_CONFIG;
        Config config = useCaseConfigFactory.getConfig(defaults.getConfig().getCaptureType(), 1);
        if (z10) {
            config = Config.mergeConfigs(config, defaults.getConfig());
        }
        if (config == null) {
            return null;
        }
        return getUseCaseConfigBuilder(config).getUseCaseConfig();
    }

    @NonNull
    public DynamicRange getDynamicRange() {
        return getCurrentConfig().hasDynamicRange() ? getCurrentConfig().getDynamicRange() : Defaults.DEFAULT_DYNAMIC_RANGE;
    }

    public int getMirrorMode() {
        int mirrorModeInternal = getMirrorModeInternal();
        if (mirrorModeInternal == -1) {
            return 0;
        }
        return mirrorModeInternal;
    }

    @Nullable
    @VisibleForTesting
    public SurfaceProcessorNode getNode() {
        return this.mNode;
    }

    @NonNull
    public T getOutput() {
        return (T) ((VideoCaptureConfig) getCurrentConfig()).getVideoOutput();
    }

    @VisibleForTesting
    public int getRotationDegrees() {
        return this.mRotationDegrees;
    }

    @Override // androidx.camera.core.UseCase
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Set<Integer> getSupportedEffectTargets() {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        return hashSet;
    }

    @NonNull
    @VisibleForTesting
    public SurfaceRequest getSurfaceRequest() {
        SurfaceRequest surfaceRequest = this.mSurfaceRequest;
        Objects.requireNonNull(surfaceRequest);
        return surfaceRequest;
    }

    @NonNull
    public Range<Integer> getTargetFrameRate() {
        return getTargetFrameRateInternal();
    }

    public int getTargetRotation() {
        return getTargetRotationInternal();
    }

    @Override // androidx.camera.core.UseCase
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCaseConfig.Builder<?, ?, ?> getUseCaseConfigBuilder(@NonNull Config config) {
        return Builder.fromConfig(config);
    }

    public boolean isStreamIdChanged(int i10, int i11) {
        Set<Integer> set = StreamInfo.NON_SURFACE_STREAM_ID;
        return (set.contains(Integer.valueOf(i10)) || set.contains(Integer.valueOf(i11)) || i10 == i11) ? false : true;
    }

    public boolean isVideoStabilizationEnabled() {
        return getCurrentConfig().getVideoStabilizationMode() == 2;
    }

    @Override // androidx.camera.core.UseCase
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCaseConfig<?> onMergeConfig(@NonNull CameraInfoInternal cameraInfoInternal, @NonNull UseCaseConfig.Builder<?, ?, ?> builder) {
        updateCustomOrderedResolutionsByQuality(cameraInfoInternal, builder);
        return builder.getUseCaseConfig();
    }

    @Override // androidx.camera.core.UseCase
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onStateAttached() {
        super.onStateAttached();
        Logger.m573d(TAG, "VideoCapture#onStateAttached: cameraID = " + getCameraId());
        if (getAttachedStreamSpec() == null || this.mSurfaceRequest != null) {
            return;
        }
        StreamSpec streamSpec = (StreamSpec) Preconditions.checkNotNull(getAttachedStreamSpec());
        this.mStreamInfo = (StreamInfo) fetchObservableValue(getOutput().getStreamInfo(), StreamInfo.STREAM_INFO_ANY_INACTIVE);
        SessionConfig.Builder builderCreatePipeline = createPipeline((VideoCaptureConfig) getCurrentConfig(), streamSpec);
        this.mSessionConfigBuilder = builderCreatePipeline;
        applyStreamInfoAndStreamSpecToSessionConfigBuilder(builderCreatePipeline, this.mStreamInfo, streamSpec);
        updateSessionConfig(AbstractC0700j.m681a(new Object[]{this.mSessionConfigBuilder.build()}));
        notifyActive();
        getOutput().getStreamInfo().addObserver(CameraXExecutors.mainThreadExecutor(), this.mStreamInfoObserver);
        SourceStreamRequirementObserver sourceStreamRequirementObserver = this.mSourceStreamRequirementObserver;
        if (sourceStreamRequirementObserver != null) {
            sourceStreamRequirementObserver.close();
        }
        this.mSourceStreamRequirementObserver = new SourceStreamRequirementObserver(getCameraControl());
        getOutput().isSourceStreamRequired().addObserver(CameraXExecutors.mainThreadExecutor(), this.mSourceStreamRequirementObserver);
        setSourceState(VideoOutput.SourceState.ACTIVE_NON_STREAMING);
    }

    @Override // androidx.camera.core.UseCase
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onStateDetached() {
        Logger.m573d(TAG, "VideoCapture#onStateDetached");
        Preconditions.checkState(Threads.isMainThread(), "VideoCapture can only be detached on the main thread.");
        if (this.mSourceStreamRequirementObserver != null) {
            getOutput().isSourceStreamRequired().removeObserver(this.mSourceStreamRequirementObserver);
            this.mSourceStreamRequirementObserver.close();
            this.mSourceStreamRequirementObserver = null;
        }
        setSourceState(VideoOutput.SourceState.INACTIVE);
        getOutput().getStreamInfo().removeObserver(this.mStreamInfoObserver);
        ListenableFuture<Void> listenableFuture = this.mSurfaceUpdateFuture;
        if (listenableFuture != null && listenableFuture.cancel(false)) {
            Logger.m573d(TAG, "VideoCapture is detached from the camera. Surface update cancelled.");
        }
        clearPipeline();
    }

    @Override // androidx.camera.core.UseCase
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public StreamSpec onSuggestedStreamSpecImplementationOptionsUpdated(@NonNull Config config) {
        this.mSessionConfigBuilder.addImplementationOptions(config);
        updateSessionConfig(AbstractC0700j.m681a(new Object[]{this.mSessionConfigBuilder.build()}));
        StreamSpec attachedStreamSpec = getAttachedStreamSpec();
        Objects.requireNonNull(attachedStreamSpec);
        return attachedStreamSpec.toBuilder().setImplementationOptions(config).build();
    }

    @Override // androidx.camera.core.UseCase
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public StreamSpec onSuggestedStreamSpecUpdated(@NonNull StreamSpec streamSpec, @Nullable StreamSpec streamSpec2) {
        Logger.m573d(TAG, "onSuggestedStreamSpecUpdated: " + streamSpec);
        List<Size> customOrderedResolutions = ((VideoCaptureConfig) getCurrentConfig()).getCustomOrderedResolutions(null);
        if (customOrderedResolutions != null && !customOrderedResolutions.contains(streamSpec.getResolution())) {
            Logger.m579w(TAG, "suggested resolution " + streamSpec.getResolution() + " is not in custom ordered resolutions " + customOrderedResolutions);
        }
        return streamSpec;
    }

    @MainThread
    public void resetPipeline() {
        if (getCamera() == null) {
            return;
        }
        clearPipeline();
        SessionConfig.Builder builderCreatePipeline = createPipeline((VideoCaptureConfig) getCurrentConfig(), (StreamSpec) Preconditions.checkNotNull(getAttachedStreamSpec()));
        this.mSessionConfigBuilder = builderCreatePipeline;
        applyStreamInfoAndStreamSpecToSessionConfigBuilder(builderCreatePipeline, this.mStreamInfo, getAttachedStreamSpec());
        updateSessionConfig(AbstractC0700j.m681a(new Object[]{this.mSessionConfigBuilder.build()}));
        notifyReset();
    }

    @MainThread
    public void setSourceState(@NonNull VideoOutput.SourceState sourceState) {
        if (sourceState != this.mSourceState) {
            this.mSourceState = sourceState;
            getOutput().onSourceStateChanged(sourceState);
        }
    }

    public void setTargetRotation(int i10) {
        if (setTargetRotationInternal(i10)) {
            sendTransformationInfoIfReady();
        }
    }

    @Override // androidx.camera.core.UseCase
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setViewPortCropRect(@NonNull Rect rect) {
        super.setViewPortCropRect(rect);
        sendTransformationInfoIfReady();
    }

    public boolean shouldResetCompensatingTransformation(@NonNull StreamInfo streamInfo, @NonNull StreamInfo streamInfo2) {
        return this.mHasCompensatingTransformation && streamInfo.getInProgressTransformationInfo() != null && streamInfo2.getInProgressTransformationInfo() == null;
    }

    @NonNull
    public String toString() {
        return "VideoCapture:" + getName();
    }
}
