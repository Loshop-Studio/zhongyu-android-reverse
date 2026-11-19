.class public final Landroidx/camera/video/Recorder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/video/VideoOutput;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/video/Recorder$State;,
        Landroidx/camera/video/Recorder$RecordingRecord;,
        Landroidx/camera/video/Recorder$AudioState;,
        Landroidx/camera/video/Recorder$SetupVideoTask;,
        Landroidx/camera/video/Recorder$Builder;
    }
.end annotation


# static fields
.field private static final AUDIO_CACHE_SIZE:I = 0x3c

.field private static final AUDIO_EXECUTOR:Ljava/util/concurrent/Executor;

.field static final DEFAULT_ENCODER_FACTORY:Landroidx/camera/video/internal/encoder/EncoderFactory;
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field public static final DEFAULT_QUALITY_SELECTOR:Landroidx/camera/video/QualitySelector;

.field private static final MEDIA_COLUMN:Ljava/lang/String; = "_data"

.field private static final MEDIA_SPEC_DEFAULT:Landroidx/camera/video/MediaSpec;

.field private static final NOT_PENDING:I = 0x0

.field private static final PENDING:I = 0x1

.field private static final PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE:Ljava/lang/Exception;

.field private static final PENDING_STATES:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroidx/camera/video/Recorder$State;",
            ">;"
        }
    .end annotation
.end field

.field private static final RETRY_SETUP_VIDEO_DELAY_MS:J = 0x3e8L

.field private static final RETRY_SETUP_VIDEO_MAX_COUNT:I = 0x3

.field private static final SOURCE_NON_STREAMING_TIMEOUT_MS:J = 0x3e8L

.field private static final TAG:Ljava/lang/String; = "Recorder"

.field private static final VALID_NON_PENDING_STATES_WHILE_PENDING:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroidx/camera/video/Recorder$State;",
            ">;"
        }
    .end annotation
.end field

.field public static final VIDEO_CAPABILITIES_SOURCE_CAMCORDER_PROFILE:I = 0x0

.field public static final VIDEO_CAPABILITIES_SOURCE_CODEC_CAPABILITIES:I = 0x1

.field private static final VIDEO_SPEC_DEFAULT:Landroidx/camera/video/VideoSpec;

.field static sRetrySetupVideoDelayMs:J
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field static sRetrySetupVideoMaxCount:I
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field


# instance fields
.field mActiveRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;
    .annotation build Landroidx/annotation/GuardedBy;
        value = "mLock"
    .end annotation
.end field

.field mActiveSurface:Landroid/view/Surface;

.field mAudioAmplitude:D

.field mAudioEncoder:Landroidx/camera/video/internal/encoder/Encoder;

.field private final mAudioEncoderFactory:Landroidx/camera/video/internal/encoder/EncoderFactory;

.field mAudioErrorCause:Ljava/lang/Throwable;

.field mAudioOutputConfig:Landroidx/camera/video/internal/encoder/OutputConfig;

.field mAudioSource:Landroidx/camera/video/internal/audio/AudioSource;

.field mAudioState:Landroidx/camera/video/Recorder$AudioState;

.field mAudioTrackIndex:Ljava/lang/Integer;

.field mDurationLimitNs:J

.field private final mEncoderNotUsePersistentInputSurface:Z

.field final mEncodingFutures:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation
.end field

.field private final mExecutor:Ljava/util/concurrent/Executor;

.field mFileSizeLimitInBytes:J

.field mFirstRecordingAudioDataTimeUs:J
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field mFirstRecordingVideoBitrate:I
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field mFirstRecordingVideoDataTimeUs:J
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field mInProgressRecording:Landroidx/camera/video/Recorder$RecordingRecord;

.field mInProgressRecordingStopping:Z

.field private mInProgressTransformationInfo:Landroidx/camera/core/SurfaceRequest$TransformationInfo;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field mIsAudioSourceSilenced:Z

.field private final mIsRecording:Landroidx/camera/core/impl/MutableStateObservable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/MutableStateObservable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private mLastGeneratedRecordingId:J
    .annotation build Landroidx/annotation/GuardedBy;
        value = "mLock"
    .end annotation
.end field

.field mLatestSurface:Landroid/view/Surface;

.field mLatestSurfaceRequest:Landroidx/camera/core/SurfaceRequest;

.field private final mLock:Ljava/lang/Object;

.field mMediaMuxer:Landroid/media/MediaMuxer;

.field final mMediaSpec:Landroidx/camera/core/impl/MutableStateObservable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/MutableStateObservable<",
            "Landroidx/camera/video/MediaSpec;",
            ">;"
        }
    .end annotation
.end field

.field private mNeedsResetBeforeNextStart:Z

.field private mNonPendingState:Landroidx/camera/video/Recorder$State;
    .annotation build Landroidx/annotation/GuardedBy;
        value = "mLock"
    .end annotation
.end field

.field mOutputUri:Landroid/net/Uri;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field final mPendingAudioRingBuffer:Landroidx/camera/core/internal/utils/RingBuffer;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/internal/utils/RingBuffer<",
            "Landroidx/camera/video/internal/encoder/EncodedData;",
            ">;"
        }
    .end annotation
.end field

.field mPendingFirstVideoData:Landroidx/camera/video/internal/encoder/EncodedData;

.field mPendingRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;
    .annotation build Landroidx/annotation/GuardedBy;
        value = "mLock"
    .end annotation
.end field

.field mPreviousRecordingAudioDataTimeUs:J

.field mPreviousRecordingVideoDataTimeUs:J

.field mRecordingBytes:J

.field mRecordingDurationNs:J

.field mRecordingStopError:I

.field mRecordingStopErrorCause:Ljava/lang/Throwable;

.field private mResolvedEncoderProfiles:Landroidx/camera/video/internal/VideoValidatedEncoderProfilesProxy;

.field final mSequentialExecutor:Ljava/util/concurrent/Executor;

.field private mSetupVideoTask:Landroidx/camera/video/Recorder$SetupVideoTask;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mShouldSendResumeEvent:Z

.field mSourceNonStreamingTimeout:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field mSourceState:Landroidx/camera/video/VideoOutput$SourceState;

.field private mSourceTransformationInfo:Landroidx/camera/core/SurfaceRequest$TransformationInfo;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mState:Landroidx/camera/video/Recorder$State;
    .annotation build Landroidx/annotation/GuardedBy;
        value = "mLock"
    .end annotation
.end field

.field mStreamId:I
    .annotation build Landroidx/annotation/GuardedBy;
        value = "mLock"
    .end annotation
.end field

.field private final mStreamInfo:Landroidx/camera/core/impl/MutableStateObservable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/MutableStateObservable<",
            "Landroidx/camera/video/StreamInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final mUserProvidedExecutor:Ljava/util/concurrent/Executor;

.field private final mVideoCapabilitiesSource:I

.field mVideoEncoder:Landroidx/camera/video/internal/encoder/Encoder;

.field mVideoEncoderBitrateRange:Landroid/util/Range;
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final mVideoEncoderFactory:Landroidx/camera/video/internal/encoder/EncoderFactory;

.field mVideoEncoderSession:Landroidx/camera/video/VideoEncoderSession;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field mVideoEncoderSessionToRelease:Landroidx/camera/video/VideoEncoderSession;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field mVideoOutputConfig:Landroidx/camera/video/internal/encoder/OutputConfig;

.field mVideoSourceTimebase:Landroidx/camera/core/impl/Timebase;

.field mVideoTrackIndex:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    sget-object v0, Landroidx/camera/video/Recorder$State;->PENDING_RECORDING:Landroidx/camera/video/Recorder$State;

    .line 2
    .line 3
    sget-object v1, Landroidx/camera/video/Recorder$State;->PENDING_PAUSED:Landroidx/camera/video/Recorder$State;

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Landroidx/camera/video/Recorder;->PENDING_STATES:Ljava/util/Set;

    .line 14
    .line 15
    sget-object v0, Landroidx/camera/video/Recorder$State;->CONFIGURING:Landroidx/camera/video/Recorder$State;

    .line 16
    .line 17
    sget-object v1, Landroidx/camera/video/Recorder$State;->IDLING:Landroidx/camera/video/Recorder$State;

    .line 18
    .line 19
    sget-object v2, Landroidx/camera/video/Recorder$State;->RESETTING:Landroidx/camera/video/Recorder$State;

    .line 20
    .line 21
    sget-object v3, Landroidx/camera/video/Recorder$State;->STOPPING:Landroidx/camera/video/Recorder$State;

    .line 22
    .line 23
    sget-object v4, Landroidx/camera/video/Recorder$State;->ERROR:Landroidx/camera/video/Recorder$State;

    .line 24
    .line 25
    invoke-static {v0, v1, v2, v3, v4}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Landroidx/camera/video/Recorder;->VALID_NON_PENDING_STATES_WHILE_PENDING:Ljava/util/Set;

    .line 34
    .line 35
    sget-object v0, Landroidx/camera/video/Quality;->FHD:Landroidx/camera/video/Quality;

    .line 36
    .line 37
    sget-object v1, Landroidx/camera/video/Quality;->HD:Landroidx/camera/video/Quality;

    .line 38
    .line 39
    sget-object v2, Landroidx/camera/video/Quality;->SD:Landroidx/camera/video/Quality;

    .line 40
    .line 41
    filled-new-array {v0, v1, v2}, [Landroidx/camera/video/Quality;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-static {v0}, Landroidx/camera/video/FallbackStrategy;->higherQualityOrLowerThan(Landroidx/camera/video/Quality;)Landroidx/camera/video/FallbackStrategy;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {v1, v0}, Landroidx/camera/video/QualitySelector;->fromOrderedList(Ljava/util/List;Landroidx/camera/video/FallbackStrategy;)Landroidx/camera/video/QualitySelector;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    sput-object v0, Landroidx/camera/video/Recorder;->DEFAULT_QUALITY_SELECTOR:Landroidx/camera/video/QualitySelector;

    .line 58
    .line 59
    invoke-static {}, Landroidx/camera/video/VideoSpec;->builder()Landroidx/camera/video/VideoSpec$Builder;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v1, v0}, Landroidx/camera/video/VideoSpec$Builder;->setQualitySelector(Landroidx/camera/video/QualitySelector;)Landroidx/camera/video/VideoSpec$Builder;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    const/4 v1, -0x1

    .line 68
    invoke-virtual {v0, v1}, Landroidx/camera/video/VideoSpec$Builder;->setAspectRatio(I)Landroidx/camera/video/VideoSpec$Builder;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Landroidx/camera/video/VideoSpec$Builder;->build()Landroidx/camera/video/VideoSpec;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    sput-object v0, Landroidx/camera/video/Recorder;->VIDEO_SPEC_DEFAULT:Landroidx/camera/video/VideoSpec;

    .line 77
    .line 78
    invoke-static {}, Landroidx/camera/video/MediaSpec;->builder()Landroidx/camera/video/MediaSpec$Builder;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-virtual {v2, v1}, Landroidx/camera/video/MediaSpec$Builder;->setOutputFormat(I)Landroidx/camera/video/MediaSpec$Builder;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v1, v0}, Landroidx/camera/video/MediaSpec$Builder;->setVideoSpec(Landroidx/camera/video/VideoSpec;)Landroidx/camera/video/MediaSpec$Builder;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v0}, Landroidx/camera/video/MediaSpec$Builder;->build()Landroidx/camera/video/MediaSpec;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    sput-object v0, Landroidx/camera/video/Recorder;->MEDIA_SPEC_DEFAULT:Landroidx/camera/video/MediaSpec;

    .line 95
    .line 96
    new-instance v0, Ljava/lang/RuntimeException;

    .line 97
    .line 98
    const-string v1, "The video frame producer became inactive before any data was received."

    .line 99
    .line 100
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    sput-object v0, Landroidx/camera/video/Recorder;->PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE:Ljava/lang/Exception;

    .line 104
    .line 105
    new-instance v0, Landroidx/camera/video/j;

    .line 106
    .line 107
    invoke-direct {v0}, Landroidx/camera/video/j;-><init>()V

    .line 108
    .line 109
    .line 110
    sput-object v0, Landroidx/camera/video/Recorder;->DEFAULT_ENCODER_FACTORY:Landroidx/camera/video/internal/encoder/EncoderFactory;

    .line 111
    .line 112
    invoke-static {}, Landroidx/camera/core/impl/utils/executor/CameraXExecutors;->ioExecutor()Ljava/util/concurrent/Executor;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-static {v0}, Landroidx/camera/core/impl/utils/executor/CameraXExecutors;->newSequentialExecutor(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    sput-object v0, Landroidx/camera/video/Recorder;->AUDIO_EXECUTOR:Ljava/util/concurrent/Executor;

    .line 121
    .line 122
    const/4 v0, 0x3

    .line 123
    sput v0, Landroidx/camera/video/Recorder;->sRetrySetupVideoMaxCount:I

    .line 124
    .line 125
    const-wide/16 v0, 0x3e8

    .line 126
    .line 127
    sput-wide v0, Landroidx/camera/video/Recorder;->sRetrySetupVideoDelayMs:J

    .line 128
    .line 129
    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;Landroidx/camera/video/MediaSpec;ILandroidx/camera/video/internal/encoder/EncoderFactory;Landroidx/camera/video/internal/encoder/EncoderFactory;)V
    .locals 7
    .param p1    # Ljava/util/concurrent/Executor;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Landroidx/camera/video/MediaSpec;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Landroidx/camera/video/internal/encoder/EncoderFactory;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Landroidx/camera/video/internal/encoder/EncoderFactory;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/camera/video/Recorder;->mLock:Ljava/lang/Object;

    .line 10
    .line 11
    const-class v0, Landroidx/camera/video/internal/compat/quirk/EncoderNotUsePersistentInputSurfaceQuirk;

    .line 12
    .line 13
    invoke-static {v0}, Landroidx/camera/video/internal/compat/quirk/DeviceQuirks;->get(Ljava/lang/Class;)Landroidx/camera/core/impl/Quirk;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x1

    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    move v0, v1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v0, v2

    .line 24
    :goto_0
    iput-boolean v0, p0, Landroidx/camera/video/Recorder;->mEncoderNotUsePersistentInputSurface:Z

    .line 25
    .line 26
    sget-object v0, Landroidx/camera/video/Recorder$State;->CONFIGURING:Landroidx/camera/video/Recorder$State;

    .line 27
    .line 28
    iput-object v0, p0, Landroidx/camera/video/Recorder;->mState:Landroidx/camera/video/Recorder$State;

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    iput-object v0, p0, Landroidx/camera/video/Recorder;->mNonPendingState:Landroidx/camera/video/Recorder$State;

    .line 32
    .line 33
    iput v2, p0, Landroidx/camera/video/Recorder;->mStreamId:I

    .line 34
    .line 35
    iput-object v0, p0, Landroidx/camera/video/Recorder;->mActiveRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 36
    .line 37
    iput-object v0, p0, Landroidx/camera/video/Recorder;->mPendingRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 38
    .line 39
    const-wide/16 v3, 0x0

    .line 40
    .line 41
    iput-wide v3, p0, Landroidx/camera/video/Recorder;->mLastGeneratedRecordingId:J

    .line 42
    .line 43
    iput-object v0, p0, Landroidx/camera/video/Recorder;->mInProgressRecording:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 44
    .line 45
    iput-boolean v2, p0, Landroidx/camera/video/Recorder;->mInProgressRecordingStopping:Z

    .line 46
    .line 47
    iput-object v0, p0, Landroidx/camera/video/Recorder;->mInProgressTransformationInfo:Landroidx/camera/core/SurfaceRequest$TransformationInfo;

    .line 48
    .line 49
    iput-object v0, p0, Landroidx/camera/video/Recorder;->mSourceTransformationInfo:Landroidx/camera/core/SurfaceRequest$TransformationInfo;

    .line 50
    .line 51
    iput-object v0, p0, Landroidx/camera/video/Recorder;->mResolvedEncoderProfiles:Landroidx/camera/video/internal/VideoValidatedEncoderProfilesProxy;

    .line 52
    .line 53
    new-instance v5, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object v5, p0, Landroidx/camera/video/Recorder;->mEncodingFutures:Ljava/util/List;

    .line 59
    .line 60
    iput-object v0, p0, Landroidx/camera/video/Recorder;->mAudioTrackIndex:Ljava/lang/Integer;

    .line 61
    .line 62
    iput-object v0, p0, Landroidx/camera/video/Recorder;->mVideoTrackIndex:Ljava/lang/Integer;

    .line 63
    .line 64
    iput-object v0, p0, Landroidx/camera/video/Recorder;->mLatestSurface:Landroid/view/Surface;

    .line 65
    .line 66
    iput-object v0, p0, Landroidx/camera/video/Recorder;->mActiveSurface:Landroid/view/Surface;

    .line 67
    .line 68
    iput-object v0, p0, Landroidx/camera/video/Recorder;->mMediaMuxer:Landroid/media/MediaMuxer;

    .line 69
    .line 70
    iput-object v0, p0, Landroidx/camera/video/Recorder;->mAudioSource:Landroidx/camera/video/internal/audio/AudioSource;

    .line 71
    .line 72
    iput-object v0, p0, Landroidx/camera/video/Recorder;->mVideoEncoder:Landroidx/camera/video/internal/encoder/Encoder;

    .line 73
    .line 74
    iput-object v0, p0, Landroidx/camera/video/Recorder;->mVideoOutputConfig:Landroidx/camera/video/internal/encoder/OutputConfig;

    .line 75
    .line 76
    iput-object v0, p0, Landroidx/camera/video/Recorder;->mAudioEncoder:Landroidx/camera/video/internal/encoder/Encoder;

    .line 77
    .line 78
    iput-object v0, p0, Landroidx/camera/video/Recorder;->mAudioOutputConfig:Landroidx/camera/video/internal/encoder/OutputConfig;

    .line 79
    .line 80
    sget-object v5, Landroidx/camera/video/Recorder$AudioState;->INITIALIZING:Landroidx/camera/video/Recorder$AudioState;

    .line 81
    .line 82
    iput-object v5, p0, Landroidx/camera/video/Recorder;->mAudioState:Landroidx/camera/video/Recorder$AudioState;

    .line 83
    .line 84
    sget-object v5, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 85
    .line 86
    iput-object v5, p0, Landroidx/camera/video/Recorder;->mOutputUri:Landroid/net/Uri;

    .line 87
    .line 88
    iput-wide v3, p0, Landroidx/camera/video/Recorder;->mRecordingBytes:J

    .line 89
    .line 90
    iput-wide v3, p0, Landroidx/camera/video/Recorder;->mRecordingDurationNs:J

    .line 91
    .line 92
    const-wide v5, 0x7fffffffffffffffL

    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    iput-wide v5, p0, Landroidx/camera/video/Recorder;->mFirstRecordingVideoDataTimeUs:J

    .line 98
    .line 99
    iput v2, p0, Landroidx/camera/video/Recorder;->mFirstRecordingVideoBitrate:I

    .line 100
    .line 101
    iput-object v0, p0, Landroidx/camera/video/Recorder;->mVideoEncoderBitrateRange:Landroid/util/Range;

    .line 102
    .line 103
    iput-wide v5, p0, Landroidx/camera/video/Recorder;->mFirstRecordingAudioDataTimeUs:J

    .line 104
    .line 105
    iput-wide v5, p0, Landroidx/camera/video/Recorder;->mPreviousRecordingVideoDataTimeUs:J

    .line 106
    .line 107
    iput-wide v5, p0, Landroidx/camera/video/Recorder;->mPreviousRecordingAudioDataTimeUs:J

    .line 108
    .line 109
    iput-wide v3, p0, Landroidx/camera/video/Recorder;->mFileSizeLimitInBytes:J

    .line 110
    .line 111
    iput-wide v3, p0, Landroidx/camera/video/Recorder;->mDurationLimitNs:J

    .line 112
    .line 113
    iput v1, p0, Landroidx/camera/video/Recorder;->mRecordingStopError:I

    .line 114
    .line 115
    iput-object v0, p0, Landroidx/camera/video/Recorder;->mRecordingStopErrorCause:Ljava/lang/Throwable;

    .line 116
    .line 117
    iput-object v0, p0, Landroidx/camera/video/Recorder;->mPendingFirstVideoData:Landroidx/camera/video/internal/encoder/EncodedData;

    .line 118
    .line 119
    new-instance v1, Landroidx/camera/core/internal/utils/ArrayRingBuffer;

    .line 120
    .line 121
    const/16 v3, 0x3c

    .line 122
    .line 123
    invoke-direct {v1, v3}, Landroidx/camera/core/internal/utils/ArrayRingBuffer;-><init>(I)V

    .line 124
    .line 125
    .line 126
    iput-object v1, p0, Landroidx/camera/video/Recorder;->mPendingAudioRingBuffer:Landroidx/camera/core/internal/utils/RingBuffer;

    .line 127
    .line 128
    iput-object v0, p0, Landroidx/camera/video/Recorder;->mAudioErrorCause:Ljava/lang/Throwable;

    .line 129
    .line 130
    iput-boolean v2, p0, Landroidx/camera/video/Recorder;->mIsAudioSourceSilenced:Z

    .line 131
    .line 132
    sget-object v1, Landroidx/camera/video/VideoOutput$SourceState;->INACTIVE:Landroidx/camera/video/VideoOutput$SourceState;

    .line 133
    .line 134
    iput-object v1, p0, Landroidx/camera/video/Recorder;->mSourceState:Landroidx/camera/video/VideoOutput$SourceState;

    .line 135
    .line 136
    iput-object v0, p0, Landroidx/camera/video/Recorder;->mSourceNonStreamingTimeout:Ljava/util/concurrent/ScheduledFuture;

    .line 137
    .line 138
    iput-boolean v2, p0, Landroidx/camera/video/Recorder;->mNeedsResetBeforeNextStart:Z

    .line 139
    .line 140
    iput-object v0, p0, Landroidx/camera/video/Recorder;->mVideoEncoderSessionToRelease:Landroidx/camera/video/VideoEncoderSession;

    .line 141
    .line 142
    const-wide/16 v3, 0x0

    .line 143
    .line 144
    iput-wide v3, p0, Landroidx/camera/video/Recorder;->mAudioAmplitude:D

    .line 145
    .line 146
    iput-boolean v2, p0, Landroidx/camera/video/Recorder;->mShouldSendResumeEvent:Z

    .line 147
    .line 148
    iput-object v0, p0, Landroidx/camera/video/Recorder;->mSetupVideoTask:Landroidx/camera/video/Recorder$SetupVideoTask;

    .line 149
    .line 150
    iput-object p1, p0, Landroidx/camera/video/Recorder;->mUserProvidedExecutor:Ljava/util/concurrent/Executor;

    .line 151
    .line 152
    if-eqz p1, :cond_1

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_1
    invoke-static {}, Landroidx/camera/core/impl/utils/executor/CameraXExecutors;->ioExecutor()Ljava/util/concurrent/Executor;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    :goto_1
    iput-object p1, p0, Landroidx/camera/video/Recorder;->mExecutor:Ljava/util/concurrent/Executor;

    .line 160
    .line 161
    invoke-static {p1}, Landroidx/camera/core/impl/utils/executor/CameraXExecutors;->newSequentialExecutor(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    iput-object v0, p0, Landroidx/camera/video/Recorder;->mSequentialExecutor:Ljava/util/concurrent/Executor;

    .line 166
    .line 167
    invoke-direct {p0, p2}, Landroidx/camera/video/Recorder;->composeRecorderMediaSpec(Landroidx/camera/video/MediaSpec;)Landroidx/camera/video/MediaSpec;

    .line 168
    .line 169
    .line 170
    move-result-object p2

    .line 171
    invoke-static {p2}, Landroidx/camera/core/impl/MutableStateObservable;->withInitialState(Ljava/lang/Object;)Landroidx/camera/core/impl/MutableStateObservable;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    iput-object p2, p0, Landroidx/camera/video/Recorder;->mMediaSpec:Landroidx/camera/core/impl/MutableStateObservable;

    .line 176
    .line 177
    iput p3, p0, Landroidx/camera/video/Recorder;->mVideoCapabilitiesSource:I

    .line 178
    .line 179
    iget p2, p0, Landroidx/camera/video/Recorder;->mStreamId:I

    .line 180
    .line 181
    iget-object p3, p0, Landroidx/camera/video/Recorder;->mState:Landroidx/camera/video/Recorder$State;

    .line 182
    .line 183
    invoke-direct {p0, p3}, Landroidx/camera/video/Recorder;->internalStateToStreamState(Landroidx/camera/video/Recorder$State;)Landroidx/camera/video/StreamInfo$StreamState;

    .line 184
    .line 185
    .line 186
    move-result-object p3

    .line 187
    invoke-static {p2, p3}, Landroidx/camera/video/StreamInfo;->of(ILandroidx/camera/video/StreamInfo$StreamState;)Landroidx/camera/video/StreamInfo;

    .line 188
    .line 189
    .line 190
    move-result-object p2

    .line 191
    invoke-static {p2}, Landroidx/camera/core/impl/MutableStateObservable;->withInitialState(Ljava/lang/Object;)Landroidx/camera/core/impl/MutableStateObservable;

    .line 192
    .line 193
    .line 194
    move-result-object p2

    .line 195
    iput-object p2, p0, Landroidx/camera/video/Recorder;->mStreamInfo:Landroidx/camera/core/impl/MutableStateObservable;

    .line 196
    .line 197
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 198
    .line 199
    invoke-static {p2}, Landroidx/camera/core/impl/MutableStateObservable;->withInitialState(Ljava/lang/Object;)Landroidx/camera/core/impl/MutableStateObservable;

    .line 200
    .line 201
    .line 202
    move-result-object p2

    .line 203
    iput-object p2, p0, Landroidx/camera/video/Recorder;->mIsRecording:Landroidx/camera/core/impl/MutableStateObservable;

    .line 204
    .line 205
    iput-object p4, p0, Landroidx/camera/video/Recorder;->mVideoEncoderFactory:Landroidx/camera/video/internal/encoder/EncoderFactory;

    .line 206
    .line 207
    iput-object p5, p0, Landroidx/camera/video/Recorder;->mAudioEncoderFactory:Landroidx/camera/video/internal/encoder/EncoderFactory;

    .line 208
    .line 209
    new-instance p2, Landroidx/camera/video/VideoEncoderSession;

    .line 210
    .line 211
    invoke-direct {p2, p4, v0, p1}, Landroidx/camera/video/VideoEncoderSession;-><init>(Landroidx/camera/video/internal/encoder/EncoderFactory;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V

    .line 212
    .line 213
    .line 214
    iput-object p2, p0, Landroidx/camera/video/Recorder;->mVideoEncoderSession:Landroidx/camera/video/VideoEncoderSession;

    .line 215
    .line 216
    return-void
.end method

.method public static synthetic a(Landroidx/camera/video/Recorder;Landroid/net/Uri;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/camera/video/Recorder;->mOutputUri:Landroid/net/Uri;

    .line 2
    .line 3
    return-void
.end method

.method public static synthetic access$000(Landroidx/camera/video/Recorder;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/camera/video/Recorder;->safeToCloseVideoEncoder()Lcom/google/common/util/concurrent/ListenableFuture;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic access$100(Landroidx/camera/video/Recorder;)Landroidx/camera/video/internal/encoder/EncoderFactory;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/camera/video/Recorder;->mVideoEncoderFactory:Landroidx/camera/video/internal/encoder/EncoderFactory;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1200(Landroidx/camera/video/Recorder;)Landroidx/camera/core/impl/MutableStateObservable;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/camera/video/Recorder;->mIsRecording:Landroidx/camera/core/impl/MutableStateObservable;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$200(Landroidx/camera/video/Recorder;)Ljava/util/concurrent/Executor;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/camera/video/Recorder;->mExecutor:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$300(Landroidx/camera/video/Recorder;)Landroidx/camera/video/internal/VideoValidatedEncoderProfilesProxy;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/camera/video/Recorder;->mResolvedEncoderProfiles:Landroidx/camera/video/internal/VideoValidatedEncoderProfilesProxy;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$700(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/camera/video/Recorder;->scheduleTask(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(Landroidx/camera/video/Recorder;Landroidx/camera/video/Recorder$RecordingRecord;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/camera/video/Recorder;->pauseInternal(Landroidx/camera/video/Recorder$RecordingRecord;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Ljava/util/concurrent/Executor;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private clearPendingAudioRingBuffer()V
    .locals 1

    .line 1
    :goto_0
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mPendingAudioRingBuffer:Landroidx/camera/core/internal/utils/RingBuffer;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/camera/core/internal/utils/RingBuffer;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mPendingAudioRingBuffer:Landroidx/camera/core/internal/utils/RingBuffer;

    .line 10
    .line 11
    invoke-interface {v0}, Landroidx/camera/core/internal/utils/RingBuffer;->dequeue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
.end method

.method private composeRecorderMediaSpec(Landroidx/camera/video/MediaSpec;)Landroidx/camera/video/MediaSpec;
    .locals 2
    .param p1    # Landroidx/camera/video/MediaSpec;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroidx/camera/video/MediaSpec;->toBuilder()Landroidx/camera/video/MediaSpec$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Landroidx/camera/video/MediaSpec;->getVideoSpec()Landroidx/camera/video/VideoSpec;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Landroidx/camera/video/VideoSpec;->getAspectRatio()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const/4 v1, -0x1

    .line 14
    if-ne p1, v1, :cond_0

    .line 15
    .line 16
    new-instance p1, Landroidx/camera/video/k;

    .line 17
    .line 18
    invoke-direct {p1}, Landroidx/camera/video/k;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Landroidx/camera/video/MediaSpec$Builder;->configureVideo(Landroidx/core/util/Consumer;)Landroidx/camera/video/MediaSpec$Builder;

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {v0}, Landroidx/camera/video/MediaSpec$Builder;->build()Landroidx/camera/video/MediaSpec;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
.end method

.method private configureInternal(Landroidx/camera/core/SurfaceRequest;Landroidx/camera/core/impl/Timebase;Z)V
    .locals 7
    .param p1    # Landroidx/camera/core/SurfaceRequest;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/camera/core/impl/Timebase;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p1}, Landroidx/camera/core/SurfaceRequest;->isServiced()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "Recorder"

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string p1, "Ignore the SurfaceRequest since it is already served."

    .line 10
    .line 11
    invoke-static {v1, p1}, Landroidx/camera/core/Logger;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mSequentialExecutor:Ljava/util/concurrent/Executor;

    .line 16
    .line 17
    new-instance v2, Landroidx/camera/video/n;

    .line 18
    .line 19
    invoke-direct {v2, p0}, Landroidx/camera/video/n;-><init>(Landroidx/camera/video/Recorder;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0, v2}, Landroidx/camera/core/SurfaceRequest;->setTransformationInfoListener(Ljava/util/concurrent/Executor;Landroidx/camera/core/SurfaceRequest$TransformationInfoListener;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Landroidx/camera/core/SurfaceRequest;->getResolution()Landroid/util/Size;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p1}, Landroidx/camera/core/SurfaceRequest;->getDynamicRange()Landroidx/camera/core/DynamicRange;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {p1}, Landroidx/camera/core/SurfaceRequest;->getCamera()Landroidx/camera/core/impl/CameraInternal;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-interface {v3}, Landroidx/camera/core/impl/CameraInternal;->getCameraInfo()Landroidx/camera/core/CameraInfo;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-static {v3}, Landroidx/camera/video/Recorder;->getVideoCapabilities(Landroidx/camera/core/CameraInfo;)Landroidx/camera/video/VideoCapabilities;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-interface {v3, v0, v2}, Landroidx/camera/video/VideoCapabilities;->findNearestHigherSupportedQualityFor(Landroid/util/Size;Landroidx/camera/core/DynamicRange;)Landroidx/camera/video/Quality;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    new-instance v5, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    const-string v6, "Using supported quality of "

    .line 55
    .line 56
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v6, " for surface size "

    .line 63
    .line 64
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-static {v1, v0}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    sget-object v0, Landroidx/camera/video/Quality;->NONE:Landroidx/camera/video/Quality;

    .line 78
    .line 79
    if-eq v4, v0, :cond_2

    .line 80
    .line 81
    invoke-interface {v3, v4, v2}, Landroidx/camera/video/VideoCapabilities;->getProfiles(Landroidx/camera/video/Quality;Landroidx/camera/core/DynamicRange;)Landroidx/camera/video/internal/VideoValidatedEncoderProfilesProxy;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iput-object v0, p0, Landroidx/camera/video/Recorder;->mResolvedEncoderProfiles:Landroidx/camera/video/internal/VideoValidatedEncoderProfilesProxy;

    .line 86
    .line 87
    if-eqz v0, :cond_1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    .line 91
    .line 92
    const-string p2, "Camera advertised available quality but did not produce EncoderProfiles  for advertised quality."

    .line 93
    .line 94
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    throw p1

    .line 98
    :cond_2
    :goto_0
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mSetupVideoTask:Landroidx/camera/video/Recorder$SetupVideoTask;

    .line 99
    .line 100
    if-eqz v0, :cond_3

    .line 101
    .line 102
    invoke-virtual {v0}, Landroidx/camera/video/Recorder$SetupVideoTask;->cancelFailedRetry()V

    .line 103
    .line 104
    .line 105
    :cond_3
    new-instance v0, Landroidx/camera/video/Recorder$SetupVideoTask;

    .line 106
    .line 107
    if-eqz p3, :cond_4

    .line 108
    .line 109
    sget p3, Landroidx/camera/video/Recorder;->sRetrySetupVideoMaxCount:I

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_4
    const/4 p3, 0x0

    .line 113
    :goto_1
    invoke-direct {v0, p0, p1, p2, p3}, Landroidx/camera/video/Recorder$SetupVideoTask;-><init>(Landroidx/camera/video/Recorder;Landroidx/camera/core/SurfaceRequest;Landroidx/camera/core/impl/Timebase;I)V

    .line 114
    .line 115
    .line 116
    iput-object v0, p0, Landroidx/camera/video/Recorder;->mSetupVideoTask:Landroidx/camera/video/Recorder$SetupVideoTask;

    .line 117
    .line 118
    invoke-virtual {v0}, Landroidx/camera/video/Recorder$SetupVideoTask;->start()V

    .line 119
    .line 120
    .line 121
    return-void
.end method

.method public static synthetic d(Landroidx/camera/video/Recorder;Landroidx/camera/video/Recorder$RecordingRecord;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/camera/video/Recorder;->resumeInternal(Landroidx/camera/video/Recorder$RecordingRecord;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(Landroidx/camera/video/Recorder;Landroidx/camera/core/SurfaceRequest;Landroidx/camera/core/impl/Timebase;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/camera/video/Recorder;->onSurfaceRequestedInternal(Landroidx/camera/core/SurfaceRequest;Landroidx/camera/core/impl/Timebase;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f(Landroidx/camera/video/Recorder;Landroidx/camera/video/Recorder$RecordingRecord;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/camera/video/i;

    .line 5
    .line 6
    invoke-direct {v0, p0, p2}, Landroidx/camera/video/i;-><init>(Landroidx/camera/video/Recorder;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mAudioSource:Landroidx/camera/video/internal/audio/AudioSource;

    .line 10
    .line 11
    iget-object v2, p0, Landroidx/camera/video/Recorder;->mSequentialExecutor:Ljava/util/concurrent/Executor;

    .line 12
    .line 13
    new-instance v3, Landroidx/camera/video/Recorder$4;

    .line 14
    .line 15
    invoke-direct {v3, p0, v0}, Landroidx/camera/video/Recorder$4;-><init>(Landroidx/camera/video/Recorder;Landroidx/core/util/Consumer;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2, v3}, Landroidx/camera/video/internal/audio/AudioSource;->setAudioSourceCallback(Ljava/util/concurrent/Executor;Landroidx/camera/video/internal/audio/AudioSource$AudioSourceCallback;)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mAudioEncoder:Landroidx/camera/video/internal/encoder/Encoder;

    .line 22
    .line 23
    new-instance v2, Landroidx/camera/video/Recorder$5;

    .line 24
    .line 25
    invoke-direct {v2, p0, p2, v0, p1}, Landroidx/camera/video/Recorder$5;-><init>(Landroidx/camera/video/Recorder;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;Landroidx/core/util/Consumer;Landroidx/camera/video/Recorder$RecordingRecord;)V

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Landroidx/camera/video/Recorder;->mSequentialExecutor:Ljava/util/concurrent/Executor;

    .line 29
    .line 30
    invoke-interface {v1, v2, p0}, Landroidx/camera/video/internal/encoder/Encoder;->setEncoderCallback(Landroidx/camera/video/internal/encoder/EncoderCallback;Ljava/util/concurrent/Executor;)V

    .line 31
    .line 32
    .line 33
    const-string p0, "audioEncodingFuture"

    .line 34
    .line 35
    return-object p0
.end method

.method private finalizePendingRecording(Landroidx/camera/video/Recorder$RecordingRecord;ILjava/lang/Throwable;)V
    .locals 6
    .param p1    # Landroidx/camera/video/Recorder$RecordingRecord;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Throwable;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    sget-object v0, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroidx/camera/video/Recorder$RecordingRecord;->finalizeRecording(Landroid/net/Uri;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/camera/video/Recorder$RecordingRecord;->getOutputOptions()Landroidx/camera/video/OutputOptions;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-object v2, p0, Landroidx/camera/video/Recorder;->mAudioErrorCause:Ljava/lang/Throwable;

    .line 11
    .line 12
    const-wide/16 v3, 0x0

    .line 13
    .line 14
    const/4 v5, 0x1

    .line 15
    invoke-static {v5, v2, v3, v4}, Landroidx/camera/video/AudioStats;->of(ILjava/lang/Throwable;D)Landroidx/camera/video/AudioStats;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-wide/16 v3, 0x0

    .line 20
    .line 21
    invoke-static {v3, v4, v3, v4, v2}, Landroidx/camera/video/RecordingStats;->of(JJLandroidx/camera/video/AudioStats;)Landroidx/camera/video/RecordingStats;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {v0}, Landroidx/camera/video/OutputResults;->of(Landroid/net/Uri;)Landroidx/camera/video/OutputResults;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v1, v2, v0, p2, p3}, Landroidx/camera/video/VideoRecordEvent;->finalizeWithError(Landroidx/camera/video/OutputOptions;Landroidx/camera/video/RecordingStats;Landroidx/camera/video/OutputResults;ILjava/lang/Throwable;)Landroidx/camera/video/VideoRecordEvent$Finalize;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-virtual {p1, p2}, Landroidx/camera/video/Recorder$RecordingRecord;->updateVideoRecordEvent(Landroidx/camera/video/VideoRecordEvent;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public static synthetic g(Landroidx/camera/video/Recorder;Landroidx/camera/video/VideoOutput$SourceState;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/camera/video/Recorder;->onSourceStateChangedInternal(Landroidx/camera/video/VideoOutput$SourceState;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private getAudioDataToWriteAndClearCache(J)Ljava/util/List;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Landroidx/camera/video/internal/encoder/EncodedData;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :cond_0
    :goto_0
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mPendingAudioRingBuffer:Landroidx/camera/core/internal/utils/RingBuffer;

    .line 7
    .line 8
    invoke-interface {v1}, Landroidx/camera/core/internal/utils/RingBuffer;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mPendingAudioRingBuffer:Landroidx/camera/core/internal/utils/RingBuffer;

    .line 15
    .line 16
    invoke-interface {v1}, Landroidx/camera/core/internal/utils/RingBuffer;->dequeue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Landroidx/camera/video/internal/encoder/EncodedData;

    .line 21
    .line 22
    invoke-interface {v1}, Landroidx/camera/video/internal/encoder/EncodedData;->getPresentationTimeUs()J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    cmp-long v2, v2, p1

    .line 27
    .line 28
    if-ltz v2, :cond_0

    .line 29
    .line 30
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return-object v0
.end method

.method public static getVideoCapabilities(Landroidx/camera/core/CameraInfo;)Landroidx/camera/video/VideoCapabilities;
    .locals 1
    .param p0    # Landroidx/camera/core/CameraInfo;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, v0}, Landroidx/camera/video/Recorder;->getVideoCapabilities(Landroidx/camera/core/CameraInfo;I)Landroidx/camera/video/VideoCapabilities;

    move-result-object p0

    return-object p0
.end method

.method public static getVideoCapabilities(Landroidx/camera/core/CameraInfo;I)Landroidx/camera/video/VideoCapabilities;
    .locals 2
    .param p0    # Landroidx/camera/core/CameraInfo;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 2
    new-instance v0, Landroidx/camera/video/RecorderVideoCapabilities;

    check-cast p0, Landroidx/camera/core/impl/CameraInfoInternal;

    sget-object v1, Landroidx/camera/video/internal/encoder/VideoEncoderInfoImpl;->FINDER:Landroidx/arch/core/util/Function;

    invoke-direct {v0, p1, p0, v1}, Landroidx/camera/video/RecorderVideoCapabilities;-><init>(ILandroidx/camera/core/impl/CameraInfoInternal;Landroidx/arch/core/util/Function;)V

    return-object v0
.end method

.method public static synthetic h(Landroidx/camera/video/Recorder;Landroidx/camera/video/Recorder$RecordingRecord;JILjava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, Landroidx/camera/video/Recorder;->stopInternal(Landroidx/camera/video/Recorder$RecordingRecord;JILjava/lang/Throwable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic i(Landroidx/camera/video/Recorder;Landroidx/camera/video/Recorder$RecordingRecord;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/camera/video/Recorder;->muteInternal(Landroidx/camera/video/Recorder$RecordingRecord;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private internalAudioStateToAudioStatsState(Landroidx/camera/video/Recorder$AudioState;)I
    .locals 4
    .param p1    # Landroidx/camera/video/Recorder$AudioState;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_5

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    if-eq v0, v1, :cond_5

    .line 9
    .line 10
    const/4 v2, 0x5

    .line 11
    const/4 v3, 0x3

    .line 12
    if-eq v0, v3, :cond_2

    .line 13
    .line 14
    const/4 v1, 0x4

    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    if-ne v0, v2, :cond_0

    .line 18
    .line 19
    return v1

    .line 20
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 21
    .line 22
    new-instance v1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v2, "Invalid internal audio state: "

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    throw v0

    .line 43
    :cond_1
    return v3

    .line 44
    :cond_2
    iget-object p1, p0, Landroidx/camera/video/Recorder;->mInProgressRecording:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 45
    .line 46
    if-eqz p1, :cond_3

    .line 47
    .line 48
    invoke-virtual {p1}, Landroidx/camera/video/Recorder$RecordingRecord;->isMuted()Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_3

    .line 53
    .line 54
    return v2

    .line 55
    :cond_3
    iget-boolean p1, p0, Landroidx/camera/video/Recorder;->mIsAudioSourceSilenced:Z

    .line 56
    .line 57
    if-eqz p1, :cond_4

    .line 58
    .line 59
    return v1

    .line 60
    :cond_4
    const/4 p1, 0x0

    .line 61
    return p1

    .line 62
    :cond_5
    const/4 p1, 0x1

    .line 63
    return p1
.end method

.method private internalStateToStreamState(Landroidx/camera/video/Recorder$State;)Landroidx/camera/video/StreamInfo$StreamState;
    .locals 2
    .param p1    # Landroidx/camera/video/Recorder$State;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    const-class v0, Landroidx/camera/video/internal/compat/quirk/DeactivateEncoderSurfaceBeforeStopEncoderQuirk;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/camera/video/internal/compat/quirk/DeviceQuirks;->get(Ljava/lang/Class;)Landroidx/camera/core/impl/Quirk;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/camera/video/internal/compat/quirk/DeactivateEncoderSurfaceBeforeStopEncoderQuirk;

    .line 8
    .line 9
    sget-object v1, Landroidx/camera/video/Recorder$State;->RECORDING:Landroidx/camera/video/Recorder$State;

    .line 10
    .line 11
    if-eq p1, v1, :cond_1

    .line 12
    .line 13
    sget-object v1, Landroidx/camera/video/Recorder$State;->STOPPING:Landroidx/camera/video/Recorder$State;

    .line 14
    .line 15
    if-ne p1, v1, :cond_0

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    sget-object p1, Landroidx/camera/video/StreamInfo$StreamState;->INACTIVE:Landroidx/camera/video/StreamInfo$StreamState;

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_1
    :goto_0
    sget-object p1, Landroidx/camera/video/StreamInfo$StreamState;->ACTIVE:Landroidx/camera/video/StreamInfo$StreamState;

    .line 24
    .line 25
    return-object p1
.end method

.method private static isSameRecording(Landroidx/camera/video/Recording;Landroidx/camera/video/Recorder$RecordingRecord;)Z
    .locals 3
    .param p0    # Landroidx/camera/video/Recording;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroidx/camera/video/Recorder$RecordingRecord;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroidx/camera/video/Recording;->getRecordingId()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-virtual {p1}, Landroidx/camera/video/Recorder$RecordingRecord;->getRecordingId()J

    .line 10
    .line 11
    .line 12
    move-result-wide p0

    .line 13
    cmp-long p0, v1, p0

    .line 14
    .line 15
    if-nez p0, :cond_1

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_1
    return v0
.end method

.method public static synthetic j(Landroidx/camera/video/internal/encoder/Encoder;)V
    .locals 2

    .line 1
    const-string v0, "Recorder"

    .line 2
    .line 3
    const-string v1, "The source didn\'t become non-streaming before timeout. Waited 1000ms"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-class v0, Landroidx/camera/video/internal/compat/quirk/DeactivateEncoderSurfaceBeforeStopEncoderQuirk;

    .line 9
    .line 10
    invoke-static {v0}, Landroidx/camera/video/internal/compat/quirk/DeviceQuirks;->get(Ljava/lang/Class;)Landroidx/camera/core/impl/Quirk;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-static {p0}, Landroidx/camera/video/Recorder;->notifyEncoderSourceStopped(Landroidx/camera/video/internal/encoder/Encoder;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public static synthetic k(Landroidx/camera/video/Recorder;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mLatestSurfaceRequest:Landroidx/camera/core/SurfaceRequest;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mVideoSourceTimebase:Landroidx/camera/core/impl/Timebase;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {p0, v0, v1, v2}, Landroidx/camera/video/Recorder;->configureInternal(Landroidx/camera/core/SurfaceRequest;Landroidx/camera/core/impl/Timebase;Z)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    .line 13
    .line 14
    const-string v0, "surface request is required to retry initialization."

    .line 15
    .line 16
    invoke-direct {p0, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    throw p0
.end method

.method public static synthetic l(Landroidx/camera/video/Recorder;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mAudioErrorCause:Ljava/lang/Throwable;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    instance-of v0, p2, Landroidx/camera/video/internal/encoder/EncodeException;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Landroidx/camera/video/Recorder$AudioState;->ERROR_ENCODER:Landroidx/camera/video/Recorder$AudioState;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroidx/camera/video/Recorder;->setAudioState(Landroidx/camera/video/Recorder$AudioState;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    sget-object v0, Landroidx/camera/video/Recorder$AudioState;->ERROR_SOURCE:Landroidx/camera/video/Recorder$AudioState;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Landroidx/camera/video/Recorder;->setAudioState(Landroidx/camera/video/Recorder$AudioState;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    iput-object p2, p0, Landroidx/camera/video/Recorder;->mAudioErrorCause:Ljava/lang/Throwable;

    .line 21
    .line 22
    invoke-virtual {p0}, Landroidx/camera/video/Recorder;->updateInProgressStatusEvent()V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    invoke-virtual {p1, p0}, Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;->set(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public static synthetic m(Landroidx/camera/video/Recorder;Landroidx/camera/core/SurfaceRequest$TransformationInfo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/camera/video/Recorder;->mSourceTransformationInfo:Landroidx/camera/core/SurfaceRequest$TransformationInfo;

    .line 2
    .line 3
    return-void
.end method

.method private makePendingRecordingActiveLocked(Landroidx/camera/video/Recorder$State;)Landroidx/camera/video/Recorder$RecordingRecord;
    .locals 4
    .param p1    # Landroidx/camera/video/Recorder$State;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/GuardedBy;
        value = "mLock"
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    sget-object v0, Landroidx/camera/video/Recorder$State;->PENDING_PAUSED:Landroidx/camera/video/Recorder$State;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    sget-object v0, Landroidx/camera/video/Recorder$State;->PENDING_RECORDING:Landroidx/camera/video/Recorder$State;

    .line 8
    .line 9
    if-ne p1, v0, :cond_4

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    :goto_0
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mActiveRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 13
    .line 14
    if-nez v0, :cond_3

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mPendingRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    iput-object v0, p0, Landroidx/camera/video/Recorder;->mActiveRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 21
    .line 22
    invoke-virtual {v0}, Landroidx/camera/video/Recorder$RecordingRecord;->getRecordingState()Landroidx/camera/core/impl/StateObservable;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {}, Landroidx/camera/core/impl/utils/executor/CameraXExecutors;->directExecutor()Ljava/util/concurrent/Executor;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    new-instance v3, Landroidx/camera/video/Recorder$7;

    .line 31
    .line 32
    invoke-direct {v3, p0}, Landroidx/camera/video/Recorder$7;-><init>(Landroidx/camera/video/Recorder;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v2, v3}, Landroidx/camera/core/impl/StateObservable;->addObserver(Ljava/util/concurrent/Executor;Landroidx/camera/core/impl/Observable$Observer;)V

    .line 36
    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    iput-object v1, p0, Landroidx/camera/video/Recorder;->mPendingRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 40
    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    sget-object p1, Landroidx/camera/video/Recorder$State;->PAUSED:Landroidx/camera/video/Recorder$State;

    .line 44
    .line 45
    invoke-virtual {p0, p1}, Landroidx/camera/video/Recorder;->setState(Landroidx/camera/video/Recorder$State;)V

    .line 46
    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_1
    sget-object p1, Landroidx/camera/video/Recorder$State;->RECORDING:Landroidx/camera/video/Recorder$State;

    .line 50
    .line 51
    invoke-virtual {p0, p1}, Landroidx/camera/video/Recorder;->setState(Landroidx/camera/video/Recorder$State;)V

    .line 52
    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    .line 56
    .line 57
    const-string v0, "Pending recording should exist when in a PENDING state."

    .line 58
    .line 59
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    throw p1

    .line 63
    :cond_3
    new-instance p1, Ljava/lang/AssertionError;

    .line 64
    .line 65
    const-string v0, "Cannot make pending recording active because another recording is already active."

    .line 66
    .line 67
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    throw p1

    .line 71
    :cond_4
    new-instance p1, Ljava/lang/AssertionError;

    .line 72
    .line 73
    const-string v0, "makePendingRecordingActiveLocked() can only be called from a pending state."

    .line 74
    .line 75
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    throw p1
.end method

.method private muteInternal(Landroidx/camera/video/Recorder$RecordingRecord;Z)V
    .locals 1
    .param p1    # Landroidx/camera/video/Recorder$RecordingRecord;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p1}, Landroidx/camera/video/Recorder$RecordingRecord;->isMuted()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ne v0, p2, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p1, p2}, Landroidx/camera/video/Recorder$RecordingRecord;->mute(Z)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mInProgressRecording:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 12
    .line 13
    if-ne v0, p1, :cond_1

    .line 14
    .line 15
    iget-boolean p1, p0, Landroidx/camera/video/Recorder;->mInProgressRecordingStopping:Z

    .line 16
    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    iget-object p1, p0, Landroidx/camera/video/Recorder;->mAudioSource:Landroidx/camera/video/internal/audio/AudioSource;

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Landroidx/camera/video/internal/audio/AudioSource;->mute(Z)V

    .line 24
    .line 25
    .line 26
    :cond_1
    :goto_0
    return-void
.end method

.method public static synthetic n(Landroidx/camera/video/VideoSpec$Builder;)V
    .locals 1

    .line 1
    sget-object v0, Landroidx/camera/video/Recorder;->VIDEO_SPEC_DEFAULT:Landroidx/camera/video/VideoSpec;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/camera/video/VideoSpec;->getAspectRatio()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p0, v0}, Landroidx/camera/video/VideoSpec$Builder;->setAspectRatio(I)Landroidx/camera/video/VideoSpec$Builder;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static notifyEncoderSourceStopped(Landroidx/camera/video/internal/encoder/Encoder;)V
    .locals 1
    .param p0    # Landroidx/camera/video/internal/encoder/Encoder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    instance-of v0, p0, Landroidx/camera/video/internal/encoder/EncoderImpl;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Landroidx/camera/video/internal/encoder/EncoderImpl;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/camera/video/internal/encoder/EncoderImpl;->signalSourceStopped()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public static synthetic o(Landroidx/camera/video/Recorder;Landroidx/camera/video/Recorder$RecordingRecord;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mVideoEncoder:Landroidx/camera/video/internal/encoder/Encoder;

    .line 2
    .line 3
    new-instance v1, Landroidx/camera/video/Recorder$3;

    .line 4
    .line 5
    invoke-direct {v1, p0, p2, p1}, Landroidx/camera/video/Recorder$3;-><init>(Landroidx/camera/video/Recorder;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;Landroidx/camera/video/Recorder$RecordingRecord;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Landroidx/camera/video/Recorder;->mSequentialExecutor:Ljava/util/concurrent/Executor;

    .line 9
    .line 10
    invoke-interface {v0, v1, p0}, Landroidx/camera/video/internal/encoder/Encoder;->setEncoderCallback(Landroidx/camera/video/internal/encoder/EncoderCallback;Ljava/util/concurrent/Executor;)V

    .line 11
    .line 12
    .line 13
    const-string p0, "videoEncodingFuture"

    .line 14
    .line 15
    return-object p0
.end method

.method private onRecordingFinalized(Landroidx/camera/video/Recorder$RecordingRecord;)V
    .locals 8
    .param p1    # Landroidx/camera/video/Recorder$RecordingRecord;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mActiveRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 5
    .line 6
    if-ne v1, p1, :cond_b

    .line 7
    .line 8
    invoke-virtual {v1}, Landroidx/camera/video/Recorder$RecordingRecord;->getRecordingState()Landroidx/camera/core/impl/StateObservable;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Landroidx/camera/core/impl/StateObservable;->removeObservers()V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput-object p1, p0, Landroidx/camera/video/Recorder;->mActiveRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 17
    .line 18
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mState:Landroidx/camera/video/Recorder$State;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v2, 0x1

    .line 25
    const/4 v3, 0x0

    .line 26
    packed-switch v1, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    goto :goto_3

    .line 30
    :pswitch_0
    move-object v4, p1

    .line 31
    move v6, v2

    .line 32
    move v1, v3

    .line 33
    move v5, v1

    .line 34
    move v7, v5

    .line 35
    :goto_0
    move-object v2, v4

    .line 36
    goto/16 :goto_7

    .line 37
    .line 38
    :pswitch_1
    iget-boolean v1, p0, Landroidx/camera/video/Recorder;->mEncoderNotUsePersistentInputSurface:Z

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    iput-object p1, p0, Landroidx/camera/video/Recorder;->mActiveSurface:Landroid/view/Surface;

    .line 43
    .line 44
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mLatestSurfaceRequest:Landroidx/camera/core/SurfaceRequest;

    .line 45
    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    invoke-virtual {v1}, Landroidx/camera/core/SurfaceRequest;->isServiced()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-nez v1, :cond_0

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :catchall_0
    move-exception p1

    .line 56
    goto/16 :goto_8

    .line 57
    .line 58
    :cond_0
    move v2, v3

    .line 59
    :goto_1
    sget-object v1, Landroidx/camera/video/Recorder$State;->CONFIGURING:Landroidx/camera/video/Recorder$State;

    .line 60
    .line 61
    invoke-virtual {p0, v1}, Landroidx/camera/video/Recorder;->setState(Landroidx/camera/video/Recorder$State;)V

    .line 62
    .line 63
    .line 64
    move-object v4, p1

    .line 65
    move v5, v2

    .line 66
    move v1, v3

    .line 67
    move v6, v1

    .line 68
    :goto_2
    move v7, v6

    .line 69
    goto :goto_0

    .line 70
    :cond_1
    sget-object v1, Landroidx/camera/video/Recorder$State;->IDLING:Landroidx/camera/video/Recorder$State;

    .line 71
    .line 72
    invoke-virtual {p0, v1}, Landroidx/camera/video/Recorder;->setState(Landroidx/camera/video/Recorder$State;)V

    .line 73
    .line 74
    .line 75
    :goto_3
    move-object v2, p1

    .line 76
    move-object v4, v2

    .line 77
    move v1, v3

    .line 78
    move v5, v1

    .line 79
    :goto_4
    move v6, v5

    .line 80
    move v7, v6

    .line 81
    goto/16 :goto_7

    .line 82
    .line 83
    :pswitch_2
    new-instance p1, Ljava/lang/AssertionError;

    .line 84
    .line 85
    new-instance v1, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    .line 89
    .line 90
    const-string v2, "Unexpected state on finalize of recording: "

    .line 91
    .line 92
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    iget-object v2, p0, Landroidx/camera/video/Recorder;->mState:Landroidx/camera/video/Recorder$State;

    .line 96
    .line 97
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-direct {p1, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    throw p1

    .line 108
    :pswitch_3
    move v1, v2

    .line 109
    goto :goto_5

    .line 110
    :pswitch_4
    move v1, v3

    .line 111
    :goto_5
    iget-object v4, p0, Landroidx/camera/video/Recorder;->mSourceState:Landroidx/camera/video/VideoOutput$SourceState;

    .line 112
    .line 113
    sget-object v5, Landroidx/camera/video/VideoOutput$SourceState;->INACTIVE:Landroidx/camera/video/VideoOutput$SourceState;

    .line 114
    .line 115
    if-ne v4, v5, :cond_2

    .line 116
    .line 117
    iget-object v2, p0, Landroidx/camera/video/Recorder;->mPendingRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 118
    .line 119
    iput-object p1, p0, Landroidx/camera/video/Recorder;->mPendingRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 120
    .line 121
    sget-object v4, Landroidx/camera/video/Recorder$State;->CONFIGURING:Landroidx/camera/video/Recorder$State;

    .line 122
    .line 123
    invoke-virtual {p0, v4}, Landroidx/camera/video/Recorder;->setState(Landroidx/camera/video/Recorder$State;)V

    .line 124
    .line 125
    .line 126
    sget-object v4, Landroidx/camera/video/Recorder;->PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE:Ljava/lang/Exception;

    .line 127
    .line 128
    const/4 v5, 0x4

    .line 129
    move v6, v3

    .line 130
    move v7, v5

    .line 131
    move v5, v6

    .line 132
    goto :goto_7

    .line 133
    :cond_2
    iget-boolean v4, p0, Landroidx/camera/video/Recorder;->mEncoderNotUsePersistentInputSurface:Z

    .line 134
    .line 135
    if-eqz v4, :cond_4

    .line 136
    .line 137
    iput-object p1, p0, Landroidx/camera/video/Recorder;->mActiveSurface:Landroid/view/Surface;

    .line 138
    .line 139
    iget-object v4, p0, Landroidx/camera/video/Recorder;->mLatestSurfaceRequest:Landroidx/camera/core/SurfaceRequest;

    .line 140
    .line 141
    if-eqz v4, :cond_3

    .line 142
    .line 143
    invoke-virtual {v4}, Landroidx/camera/core/SurfaceRequest;->isServiced()Z

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    if-nez v4, :cond_3

    .line 148
    .line 149
    goto :goto_6

    .line 150
    :cond_3
    move v2, v3

    .line 151
    :goto_6
    sget-object v4, Landroidx/camera/video/Recorder$State;->CONFIGURING:Landroidx/camera/video/Recorder$State;

    .line 152
    .line 153
    invoke-direct {p0, v4}, Landroidx/camera/video/Recorder;->updateNonPendingState(Landroidx/camera/video/Recorder$State;)V

    .line 154
    .line 155
    .line 156
    move-object v4, p1

    .line 157
    move v5, v2

    .line 158
    move v6, v3

    .line 159
    goto :goto_2

    .line 160
    :cond_4
    iget-object v2, p0, Landroidx/camera/video/Recorder;->mVideoEncoder:Landroidx/camera/video/internal/encoder/Encoder;

    .line 161
    .line 162
    if-eqz v2, :cond_5

    .line 163
    .line 164
    iget-object v2, p0, Landroidx/camera/video/Recorder;->mState:Landroidx/camera/video/Recorder$State;

    .line 165
    .line 166
    invoke-direct {p0, v2}, Landroidx/camera/video/Recorder;->makePendingRecordingActiveLocked(Landroidx/camera/video/Recorder$State;)Landroidx/camera/video/Recorder$RecordingRecord;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    move-object v4, p1

    .line 171
    move v5, v3

    .line 172
    move v6, v5

    .line 173
    move v7, v6

    .line 174
    move-object p1, v2

    .line 175
    goto/16 :goto_0

    .line 176
    .line 177
    :cond_5
    move-object v2, p1

    .line 178
    move-object v4, v2

    .line 179
    move v5, v3

    .line 180
    goto :goto_4

    .line 181
    :goto_7
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 182
    if-eqz v5, :cond_6

    .line 183
    .line 184
    iget-object p1, p0, Landroidx/camera/video/Recorder;->mLatestSurfaceRequest:Landroidx/camera/core/SurfaceRequest;

    .line 185
    .line 186
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mVideoSourceTimebase:Landroidx/camera/core/impl/Timebase;

    .line 187
    .line 188
    invoke-direct {p0, p1, v0, v3}, Landroidx/camera/video/Recorder;->configureInternal(Landroidx/camera/core/SurfaceRequest;Landroidx/camera/core/impl/Timebase;Z)V

    .line 189
    .line 190
    .line 191
    return-void

    .line 192
    :cond_6
    if-eqz v6, :cond_7

    .line 193
    .line 194
    invoke-direct {p0}, Landroidx/camera/video/Recorder;->reset()V

    .line 195
    .line 196
    .line 197
    return-void

    .line 198
    :cond_7
    if-eqz p1, :cond_9

    .line 199
    .line 200
    iget-boolean v0, p0, Landroidx/camera/video/Recorder;->mEncoderNotUsePersistentInputSurface:Z

    .line 201
    .line 202
    if-nez v0, :cond_8

    .line 203
    .line 204
    invoke-direct {p0, p1, v1}, Landroidx/camera/video/Recorder;->startRecording(Landroidx/camera/video/Recorder$RecordingRecord;Z)V

    .line 205
    .line 206
    .line 207
    return-void

    .line 208
    :cond_8
    new-instance p1, Ljava/lang/AssertionError;

    .line 209
    .line 210
    const-string v0, "Attempt to start a pending recording while the Recorder is waiting for a new surface request."

    .line 211
    .line 212
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    throw p1

    .line 216
    :cond_9
    if-eqz v2, :cond_a

    .line 217
    .line 218
    invoke-direct {p0, v2, v7, v4}, Landroidx/camera/video/Recorder;->finalizePendingRecording(Landroidx/camera/video/Recorder$RecordingRecord;ILjava/lang/Throwable;)V

    .line 219
    .line 220
    .line 221
    :cond_a
    return-void

    .line 222
    :cond_b
    :try_start_1
    new-instance p1, Ljava/lang/AssertionError;

    .line 223
    .line 224
    const-string v1, "Active recording did not match finalized recording on finalize."

    .line 225
    .line 226
    invoke-direct {p1, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    throw p1

    .line 230
    :goto_8
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 231
    throw p1

    .line 232
    nop

    .line 233
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private onResetVideo()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mState:Landroidx/camera/video/Recorder$State;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :pswitch_0
    invoke-virtual {p0}, Landroidx/camera/video/Recorder;->isPersistentRecordingInProgress()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    move v1, v2

    .line 22
    goto :goto_1

    .line 23
    :catchall_0
    move-exception v1

    .line 24
    goto :goto_2

    .line 25
    :cond_0
    :pswitch_1
    sget-object v1, Landroidx/camera/video/Recorder$State;->CONFIGURING:Landroidx/camera/video/Recorder$State;

    .line 26
    .line 27
    invoke-virtual {p0, v1}, Landroidx/camera/video/Recorder;->setState(Landroidx/camera/video/Recorder$State;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :pswitch_2
    sget-object v1, Landroidx/camera/video/Recorder$State;->CONFIGURING:Landroidx/camera/video/Recorder$State;

    .line 32
    .line 33
    invoke-direct {p0, v1}, Landroidx/camera/video/Recorder;->updateNonPendingState(Landroidx/camera/video/Recorder$State;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    const/4 v1, 0x1

    .line 37
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    iput-boolean v2, p0, Landroidx/camera/video/Recorder;->mNeedsResetBeforeNextStart:Z

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mLatestSurfaceRequest:Landroidx/camera/core/SurfaceRequest;

    .line 43
    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    invoke-virtual {v0}, Landroidx/camera/core/SurfaceRequest;->isServiced()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_1

    .line 51
    .line 52
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mLatestSurfaceRequest:Landroidx/camera/core/SurfaceRequest;

    .line 53
    .line 54
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mVideoSourceTimebase:Landroidx/camera/core/impl/Timebase;

    .line 55
    .line 56
    invoke-direct {p0, v0, v1, v2}, Landroidx/camera/video/Recorder;->configureInternal(Landroidx/camera/core/SurfaceRequest;Landroidx/camera/core/impl/Timebase;Z)V

    .line 57
    .line 58
    .line 59
    :cond_1
    return-void

    .line 60
    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    throw v1

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private onSurfaceRequestedInternal(Landroidx/camera/core/SurfaceRequest;Landroidx/camera/core/impl/Timebase;)V
    .locals 1
    .param p1    # Landroidx/camera/core/SurfaceRequest;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/camera/core/impl/Timebase;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mLatestSurfaceRequest:Landroidx/camera/core/SurfaceRequest;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/camera/core/SurfaceRequest;->isServiced()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mLatestSurfaceRequest:Landroidx/camera/core/SurfaceRequest;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/camera/core/SurfaceRequest;->willNotProvideSurface()Z

    .line 14
    .line 15
    .line 16
    :cond_0
    iput-object p1, p0, Landroidx/camera/video/Recorder;->mLatestSurfaceRequest:Landroidx/camera/core/SurfaceRequest;

    .line 17
    .line 18
    iput-object p2, p0, Landroidx/camera/video/Recorder;->mVideoSourceTimebase:Landroidx/camera/core/impl/Timebase;

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    invoke-direct {p0, p1, p2, v0}, Landroidx/camera/video/Recorder;->configureInternal(Landroidx/camera/core/SurfaceRequest;Landroidx/camera/core/impl/Timebase;Z)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private pauseInternal(Landroidx/camera/video/Recorder$RecordingRecord;)V
    .locals 2
    .param p1    # Landroidx/camera/video/Recorder$RecordingRecord;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mInProgressRecording:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 2
    .line 3
    if-ne v0, p1, :cond_1

    .line 4
    .line 5
    iget-boolean p1, p0, Landroidx/camera/video/Recorder;->mInProgressRecordingStopping:Z

    .line 6
    .line 7
    if-nez p1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/camera/video/Recorder;->isAudioEnabled()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, Landroidx/camera/video/Recorder;->mAudioEncoder:Landroidx/camera/video/internal/encoder/Encoder;

    .line 16
    .line 17
    invoke-interface {p1}, Landroidx/camera/video/internal/encoder/Encoder;->pause()V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object p1, p0, Landroidx/camera/video/Recorder;->mVideoEncoder:Landroidx/camera/video/internal/encoder/Encoder;

    .line 21
    .line 22
    invoke-interface {p1}, Landroidx/camera/video/internal/encoder/Encoder;->pause()V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Landroidx/camera/video/Recorder;->mInProgressRecording:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroidx/camera/video/Recorder$RecordingRecord;->getOutputOptions()Landroidx/camera/video/OutputOptions;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p0}, Landroidx/camera/video/Recorder;->getInProgressRecordingStats()Landroidx/camera/video/RecordingStats;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {v0, v1}, Landroidx/camera/video/VideoRecordEvent;->pause(Landroidx/camera/video/OutputOptions;Landroidx/camera/video/RecordingStats;)Landroidx/camera/video/VideoRecordEvent$Pause;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {p1, v0}, Landroidx/camera/video/Recorder$RecordingRecord;->updateVideoRecordEvent(Landroidx/camera/video/VideoRecordEvent;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void
.end method

.method private prepareRecordingInternal(Landroid/content/Context;Landroidx/camera/video/OutputOptions;)Landroidx/camera/video/PendingRecording;
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/camera/video/OutputOptions;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    const-string v0, "The OutputOptions cannot be null."

    .line 2
    .line 3
    invoke-static {p2, v0}, Landroidx/core/util/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroidx/camera/video/PendingRecording;

    .line 7
    .line 8
    invoke-direct {v0, p1, p0, p2}, Landroidx/camera/video/PendingRecording;-><init>(Landroid/content/Context;Landroidx/camera/video/Recorder;Landroidx/camera/video/OutputOptions;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method private releaseCurrentAudioSource()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mAudioSource:Landroidx/camera/video/internal/audio/AudioSource;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iput-object v1, p0, Landroidx/camera/video/Recorder;->mAudioSource:Landroidx/camera/video/internal/audio/AudioSource;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "Releasing audio source: 0x%x"

    .line 21
    .line 22
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v2, "Recorder"

    .line 27
    .line 28
    invoke-static {v2, v1}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Landroidx/camera/video/internal/audio/AudioSource;->release()Lcom/google/common/util/concurrent/ListenableFuture;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    new-instance v2, Landroidx/camera/video/Recorder$2;

    .line 36
    .line 37
    invoke-direct {v2, p0, v0}, Landroidx/camera/video/Recorder$2;-><init>(Landroidx/camera/video/Recorder;Landroidx/camera/video/internal/audio/AudioSource;)V

    .line 38
    .line 39
    .line 40
    invoke-static {}, Landroidx/camera/core/impl/utils/executor/CameraXExecutors;->directExecutor()Ljava/util/concurrent/Executor;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v1, v2, v0}, Landroidx/camera/core/impl/utils/futures/Futures;->addCallback(Lcom/google/common/util/concurrent/ListenableFuture;Landroidx/camera/core/impl/utils/futures/FutureCallback;Ljava/util/concurrent/Executor;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 49
    .line 50
    const-string v1, "Cannot release null audio source."

    .line 51
    .line 52
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    throw v0
.end method

.method private reset()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mAudioEncoder:Landroidx/camera/video/internal/encoder/Encoder;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "Recorder"

    .line 6
    .line 7
    const-string v1, "Releasing audio encoder."

    .line 8
    .line 9
    invoke-static {v0, v1}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mAudioEncoder:Landroidx/camera/video/internal/encoder/Encoder;

    .line 13
    .line 14
    invoke-interface {v0}, Landroidx/camera/video/internal/encoder/Encoder;->release()V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Landroidx/camera/video/Recorder;->mAudioEncoder:Landroidx/camera/video/internal/encoder/Encoder;

    .line 19
    .line 20
    iput-object v0, p0, Landroidx/camera/video/Recorder;->mAudioOutputConfig:Landroidx/camera/video/internal/encoder/OutputConfig;

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mAudioSource:Landroidx/camera/video/internal/audio/AudioSource;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-direct {p0}, Landroidx/camera/video/Recorder;->releaseCurrentAudioSource()V

    .line 27
    .line 28
    .line 29
    :cond_1
    sget-object v0, Landroidx/camera/video/Recorder$AudioState;->INITIALIZING:Landroidx/camera/video/Recorder$AudioState;

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Landroidx/camera/video/Recorder;->setAudioState(Landroidx/camera/video/Recorder$AudioState;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0}, Landroidx/camera/video/Recorder;->resetVideo()V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method private resetVideo()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mVideoEncoder:Landroidx/camera/video/internal/encoder/Encoder;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "Recorder"

    .line 6
    .line 7
    const-string v1, "Releasing video encoder."

    .line 8
    .line 9
    invoke-static {v0, v1}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, Landroidx/camera/video/Recorder;->tryReleaseVideoEncoder()V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-direct {p0}, Landroidx/camera/video/Recorder;->onResetVideo()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method private restoreNonPendingState()V
    .locals 3
    .annotation build Landroidx/annotation/GuardedBy;
        value = "mLock"
    .end annotation

    .line 1
    sget-object v0, Landroidx/camera/video/Recorder;->PENDING_STATES:Ljava/util/Set;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mState:Landroidx/camera/video/Recorder$State;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mNonPendingState:Landroidx/camera/video/Recorder$State;

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroidx/camera/video/Recorder;->setState(Landroidx/camera/video/Recorder$State;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 18
    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v2, "Cannot restore non-pending state when in state "

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object v2, p0, Landroidx/camera/video/Recorder;->mState:Landroidx/camera/video/Recorder$State;

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    throw v0
.end method

.method private resumeInternal(Landroidx/camera/video/Recorder$RecordingRecord;)V
    .locals 2
    .param p1    # Landroidx/camera/video/Recorder$RecordingRecord;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mInProgressRecording:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 2
    .line 3
    if-ne v0, p1, :cond_2

    .line 4
    .line 5
    iget-boolean p1, p0, Landroidx/camera/video/Recorder;->mInProgressRecordingStopping:Z

    .line 6
    .line 7
    if-nez p1, :cond_2

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/camera/video/Recorder;->isAudioEnabled()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, Landroidx/camera/video/Recorder;->mAudioEncoder:Landroidx/camera/video/internal/encoder/Encoder;

    .line 16
    .line 17
    invoke-interface {p1}, Landroidx/camera/video/internal/encoder/Encoder;->start()V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object p1, p0, Landroidx/camera/video/Recorder;->mVideoEncoder:Landroidx/camera/video/internal/encoder/Encoder;

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    invoke-interface {p1}, Landroidx/camera/video/internal/encoder/Encoder;->start()V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Landroidx/camera/video/Recorder;->mInProgressRecording:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 28
    .line 29
    invoke-virtual {p1}, Landroidx/camera/video/Recorder$RecordingRecord;->getOutputOptions()Landroidx/camera/video/OutputOptions;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p0}, Landroidx/camera/video/Recorder;->getInProgressRecordingStats()Landroidx/camera/video/RecordingStats;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-static {v0, v1}, Landroidx/camera/video/VideoRecordEvent;->resume(Landroidx/camera/video/OutputOptions;Landroidx/camera/video/RecordingStats;)Landroidx/camera/video/VideoRecordEvent$Resume;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {p1, v0}, Landroidx/camera/video/Recorder$RecordingRecord;->updateVideoRecordEvent(Landroidx/camera/video/VideoRecordEvent;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    const/4 p1, 0x1

    .line 46
    iput-boolean p1, p0, Landroidx/camera/video/Recorder;->mShouldSendResumeEvent:Z

    .line 47
    .line 48
    :cond_2
    return-void
.end method

.method private safeToCloseVideoEncoder()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Try to safely release video encoder: "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mVideoEncoder:Landroidx/camera/video/internal/encoder/Encoder;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "Recorder"

    .line 21
    .line 22
    invoke-static {v1, v0}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mVideoEncoderSession:Landroidx/camera/video/VideoEncoderSession;

    .line 26
    .line 27
    invoke-virtual {v0}, Landroidx/camera/video/VideoEncoderSession;->signalTermination()Lcom/google/common/util/concurrent/ListenableFuture;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0
.end method

.method private static scheduleTask(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 2
    .param p0    # Ljava/lang/Runnable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/util/concurrent/Executor;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            "Ljava/util/concurrent/Executor;",
            "J",
            "Ljava/util/concurrent/TimeUnit;",
            ")",
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation

    .line 1
    invoke-static {}, Landroidx/camera/core/impl/utils/executor/CameraXExecutors;->mainThreadExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Landroidx/camera/video/b;

    .line 6
    .line 7
    invoke-direct {v1, p1, p0}, Landroidx/camera/video/b;-><init>(Ljava/util/concurrent/Executor;Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1, p2, p3, p4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method private setStreamId(I)V
    .locals 3
    .annotation build Landroidx/annotation/GuardedBy;
        value = "mLock"
    .end annotation

    .line 1
    iget v0, p0, Landroidx/camera/video/Recorder;->mStreamId:I

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v1, "Transitioning streamId: "

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget v1, p0, Landroidx/camera/video/Recorder;->mStreamId:I

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v1, " --> "

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-string v1, "Recorder"

    .line 34
    .line 35
    invoke-static {v1, v0}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iput p1, p0, Landroidx/camera/video/Recorder;->mStreamId:I

    .line 39
    .line 40
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mStreamInfo:Landroidx/camera/core/impl/MutableStateObservable;

    .line 41
    .line 42
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mState:Landroidx/camera/video/Recorder$State;

    .line 43
    .line 44
    invoke-direct {p0, v1}, Landroidx/camera/video/Recorder;->internalStateToStreamState(Landroidx/camera/video/Recorder$State;)Landroidx/camera/video/StreamInfo$StreamState;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iget-object v2, p0, Landroidx/camera/video/Recorder;->mInProgressTransformationInfo:Landroidx/camera/core/SurfaceRequest$TransformationInfo;

    .line 49
    .line 50
    invoke-static {p1, v1, v2}, Landroidx/camera/video/StreamInfo;->of(ILandroidx/camera/video/StreamInfo$StreamState;Landroidx/camera/core/SurfaceRequest$TransformationInfo;)Landroidx/camera/video/StreamInfo;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {v0, p1}, Landroidx/camera/core/impl/MutableStateObservable;->setState(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method private setupAudio(Landroidx/camera/video/Recorder$RecordingRecord;)V
    .locals 5
    .param p1    # Landroidx/camera/video/Recorder$RecordingRecord;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RequiresPermission;
        value = "android.permission.RECORD_AUDIO"
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mMediaSpec:Landroidx/camera/core/impl/MutableStateObservable;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroidx/camera/video/Recorder;->getObservableData(Landroidx/camera/core/impl/StateObservable;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/camera/video/MediaSpec;

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mResolvedEncoderProfiles:Landroidx/camera/video/internal/VideoValidatedEncoderProfilesProxy;

    .line 10
    .line 11
    invoke-static {v0, v1}, Landroidx/camera/video/internal/config/AudioConfigUtil;->resolveAudioMimeInfo(Landroidx/camera/video/MediaSpec;Landroidx/camera/video/internal/VideoValidatedEncoderProfilesProxy;)Landroidx/camera/video/internal/config/AudioMimeInfo;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    sget-object v2, Landroidx/camera/core/impl/Timebase;->UPTIME:Landroidx/camera/core/impl/Timebase;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroidx/camera/video/MediaSpec;->getAudioSpec()Landroidx/camera/video/AudioSpec;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-static {v1, v3}, Landroidx/camera/video/internal/config/AudioConfigUtil;->resolveAudioSettings(Landroidx/camera/video/internal/config/AudioMimeInfo;Landroidx/camera/video/AudioSpec;)Landroidx/camera/video/internal/audio/AudioSettings;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget-object v4, p0, Landroidx/camera/video/Recorder;->mAudioSource:Landroidx/camera/video/internal/audio/AudioSource;

    .line 26
    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    invoke-direct {p0}, Landroidx/camera/video/Recorder;->releaseCurrentAudioSource()V

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-direct {p0, p1, v3}, Landroidx/camera/video/Recorder;->setupAudioSource(Landroidx/camera/video/Recorder$RecordingRecord;Landroidx/camera/video/internal/audio/AudioSettings;)Landroidx/camera/video/internal/audio/AudioSource;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Landroidx/camera/video/Recorder;->mAudioSource:Landroidx/camera/video/internal/audio/AudioSource;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const-string v4, "Set up new audio source: 0x%x"

    .line 51
    .line 52
    invoke-static {v4, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    const-string v4, "Recorder"

    .line 57
    .line 58
    invoke-static {v4, p1}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Landroidx/camera/video/MediaSpec;->getAudioSpec()Landroidx/camera/video/AudioSpec;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-static {v1, v2, v3, p1}, Landroidx/camera/video/internal/config/AudioConfigUtil;->resolveAudioEncoderConfig(Landroidx/camera/video/internal/config/AudioMimeInfo;Landroidx/camera/core/impl/Timebase;Landroidx/camera/video/internal/audio/AudioSettings;Landroidx/camera/video/AudioSpec;)Landroidx/camera/video/internal/encoder/AudioEncoderConfig;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mAudioEncoderFactory:Landroidx/camera/video/internal/encoder/EncoderFactory;

    .line 70
    .line 71
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mExecutor:Ljava/util/concurrent/Executor;

    .line 72
    .line 73
    invoke-interface {v0, v1, p1}, Landroidx/camera/video/internal/encoder/EncoderFactory;->createEncoder(Ljava/util/concurrent/Executor;Landroidx/camera/video/internal/encoder/EncoderConfig;)Landroidx/camera/video/internal/encoder/Encoder;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iput-object p1, p0, Landroidx/camera/video/Recorder;->mAudioEncoder:Landroidx/camera/video/internal/encoder/Encoder;

    .line 78
    .line 79
    invoke-interface {p1}, Landroidx/camera/video/internal/encoder/Encoder;->getInput()Landroidx/camera/video/internal/encoder/Encoder$EncoderInput;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    instance-of v0, p1, Landroidx/camera/video/internal/encoder/Encoder$ByteBufferInput;

    .line 84
    .line 85
    if-eqz v0, :cond_1

    .line 86
    .line 87
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mAudioSource:Landroidx/camera/video/internal/audio/AudioSource;

    .line 88
    .line 89
    check-cast p1, Landroidx/camera/video/internal/encoder/Encoder$ByteBufferInput;

    .line 90
    .line 91
    invoke-virtual {v0, p1}, Landroidx/camera/video/internal/audio/AudioSource;->setBufferProvider(Landroidx/camera/video/internal/BufferProvider;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    .line 96
    .line 97
    const-string v0, "The EncoderInput of audio isn\'t a ByteBufferInput."

    .line 98
    .line 99
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    throw p1
.end method

.method private setupAudioSource(Landroidx/camera/video/Recorder$RecordingRecord;Landroidx/camera/video/internal/audio/AudioSettings;)Landroidx/camera/video/internal/audio/AudioSource;
    .locals 1
    .param p1    # Landroidx/camera/video/Recorder$RecordingRecord;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/camera/video/internal/audio/AudioSettings;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation build Landroidx/annotation/RequiresPermission;
        value = "android.permission.RECORD_AUDIO"
    .end annotation

    .line 1
    sget-object v0, Landroidx/camera/video/Recorder;->AUDIO_EXECUTOR:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, Landroidx/camera/video/Recorder$RecordingRecord;->performOneTimeAudioSourceCreation(Landroidx/camera/video/internal/audio/AudioSettings;Ljava/util/concurrent/Executor;)Landroidx/camera/video/internal/audio/AudioSource;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method private startInternal(Landroidx/camera/video/Recorder$RecordingRecord;)V
    .locals 8
    .param p1    # Landroidx/camera/video/Recorder$RecordingRecord;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mInProgressRecording:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 2
    .line 3
    if-nez v0, :cond_c

    .line 4
    .line 5
    invoke-virtual {p1}, Landroidx/camera/video/Recorder$RecordingRecord;->getOutputOptions()Landroidx/camera/video/OutputOptions;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroidx/camera/video/OutputOptions;->getFileSizeLimit()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    const-wide/16 v2, 0x0

    .line 14
    .line 15
    cmp-long v0, v0, v2

    .line 16
    .line 17
    const-string v1, "Recorder"

    .line 18
    .line 19
    if-lez v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, Landroidx/camera/video/Recorder$RecordingRecord;->getOutputOptions()Landroidx/camera/video/OutputOptions;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Landroidx/camera/video/OutputOptions;->getFileSizeLimit()J

    .line 26
    .line 27
    .line 28
    move-result-wide v4

    .line 29
    long-to-double v4, v4

    .line 30
    const-wide v6, 0x3fee666666666666L    # 0.95

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    mul-double/2addr v4, v6

    .line 36
    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    .line 37
    .line 38
    .line 39
    move-result-wide v4

    .line 40
    iput-wide v4, p0, Landroidx/camera/video/Recorder;->mFileSizeLimitInBytes:J

    .line 41
    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    const-string v4, "File size limit in bytes: "

    .line 48
    .line 49
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    iget-wide v4, p0, Landroidx/camera/video/Recorder;->mFileSizeLimitInBytes:J

    .line 53
    .line 54
    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v1, v0}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    iput-wide v2, p0, Landroidx/camera/video/Recorder;->mFileSizeLimitInBytes:J

    .line 66
    .line 67
    :goto_0
    invoke-virtual {p1}, Landroidx/camera/video/Recorder$RecordingRecord;->getOutputOptions()Landroidx/camera/video/OutputOptions;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0}, Landroidx/camera/video/OutputOptions;->getDurationLimitMillis()J

    .line 72
    .line 73
    .line 74
    move-result-wide v4

    .line 75
    cmp-long v0, v4, v2

    .line 76
    .line 77
    if-lez v0, :cond_1

    .line 78
    .line 79
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 80
    .line 81
    invoke-virtual {p1}, Landroidx/camera/video/Recorder$RecordingRecord;->getOutputOptions()Landroidx/camera/video/OutputOptions;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {v2}, Landroidx/camera/video/OutputOptions;->getDurationLimitMillis()J

    .line 86
    .line 87
    .line 88
    move-result-wide v2

    .line 89
    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 90
    .line 91
    .line 92
    move-result-wide v2

    .line 93
    iput-wide v2, p0, Landroidx/camera/video/Recorder;->mDurationLimitNs:J

    .line 94
    .line 95
    new-instance v0, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 98
    .line 99
    .line 100
    const-string v2, "Duration limit in nanoseconds: "

    .line 101
    .line 102
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    iget-wide v2, p0, Landroidx/camera/video/Recorder;->mDurationLimitNs:J

    .line 106
    .line 107
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-static {v1, v0}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_1
    iput-wide v2, p0, Landroidx/camera/video/Recorder;->mDurationLimitNs:J

    .line 119
    .line 120
    :goto_1
    iput-object p1, p0, Landroidx/camera/video/Recorder;->mInProgressRecording:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 121
    .line 122
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mAudioState:Landroidx/camera/video/Recorder$AudioState;

    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-eqz v0, :cond_5

    .line 129
    .line 130
    const/4 v1, 0x1

    .line 131
    if-eq v0, v1, :cond_3

    .line 132
    .line 133
    const/4 v1, 0x2

    .line 134
    if-eq v0, v1, :cond_2

    .line 135
    .line 136
    const/4 v1, 0x3

    .line 137
    if-eq v0, v1, :cond_2

    .line 138
    .line 139
    const/4 v1, 0x4

    .line 140
    if-eq v0, v1, :cond_2

    .line 141
    .line 142
    const/4 v1, 0x5

    .line 143
    if-eq v0, v1, :cond_2

    .line 144
    .line 145
    goto/16 :goto_6

    .line 146
    .line 147
    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    .line 148
    .line 149
    new-instance v0, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 152
    .line 153
    .line 154
    const-string v1, "Incorrectly invoke startInternal in audio state "

    .line 155
    .line 156
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mAudioState:Landroidx/camera/video/Recorder$AudioState;

    .line 160
    .line 161
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    throw p1

    .line 172
    :cond_3
    invoke-virtual {p1}, Landroidx/camera/video/Recorder$RecordingRecord;->hasAudioEnabled()Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-eqz v0, :cond_4

    .line 177
    .line 178
    sget-object v0, Landroidx/camera/video/Recorder$AudioState;->ENABLED:Landroidx/camera/video/Recorder$AudioState;

    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_4
    sget-object v0, Landroidx/camera/video/Recorder$AudioState;->DISABLED:Landroidx/camera/video/Recorder$AudioState;

    .line 182
    .line 183
    :goto_2
    invoke-virtual {p0, v0}, Landroidx/camera/video/Recorder;->setAudioState(Landroidx/camera/video/Recorder$AudioState;)V

    .line 184
    .line 185
    .line 186
    goto :goto_6

    .line 187
    :cond_5
    invoke-virtual {p1}, Landroidx/camera/video/Recorder$RecordingRecord;->hasAudioEnabled()Z

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    if-eqz v0, :cond_a

    .line 192
    .line 193
    invoke-virtual {p0}, Landroidx/camera/video/Recorder;->isAudioSupported()Z

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    if-eqz v0, :cond_9

    .line 198
    .line 199
    :try_start_0
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mInProgressRecording:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 200
    .line 201
    invoke-virtual {v0}, Landroidx/camera/video/Recorder$RecordingRecord;->isPersistent()Z

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    if-eqz v0, :cond_6

    .line 206
    .line 207
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mAudioEncoder:Landroidx/camera/video/internal/encoder/Encoder;

    .line 208
    .line 209
    if-nez v0, :cond_7

    .line 210
    .line 211
    goto :goto_3

    .line 212
    :catch_0
    move-exception v0

    .line 213
    goto :goto_4

    .line 214
    :catch_1
    move-exception v0

    .line 215
    goto :goto_4

    .line 216
    :cond_6
    :goto_3
    invoke-direct {p0, p1}, Landroidx/camera/video/Recorder;->setupAudio(Landroidx/camera/video/Recorder$RecordingRecord;)V

    .line 217
    .line 218
    .line 219
    :cond_7
    sget-object v0, Landroidx/camera/video/Recorder$AudioState;->ENABLED:Landroidx/camera/video/Recorder$AudioState;

    .line 220
    .line 221
    invoke-virtual {p0, v0}, Landroidx/camera/video/Recorder;->setAudioState(Landroidx/camera/video/Recorder$AudioState;)V
    :try_end_0
    .catch Landroidx/camera/video/internal/audio/AudioSourceAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroidx/camera/video/internal/encoder/InvalidConfigException; {:try_start_0 .. :try_end_0} :catch_0

    .line 222
    .line 223
    .line 224
    goto :goto_6

    .line 225
    :goto_4
    const-string v2, "Unable to create audio resource with error: "

    .line 226
    .line 227
    invoke-static {v1, v2, v0}, Landroidx/camera/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 228
    .line 229
    .line 230
    instance-of v1, v0, Landroidx/camera/video/internal/encoder/InvalidConfigException;

    .line 231
    .line 232
    if-eqz v1, :cond_8

    .line 233
    .line 234
    sget-object v1, Landroidx/camera/video/Recorder$AudioState;->ERROR_ENCODER:Landroidx/camera/video/Recorder$AudioState;

    .line 235
    .line 236
    goto :goto_5

    .line 237
    :cond_8
    sget-object v1, Landroidx/camera/video/Recorder$AudioState;->ERROR_SOURCE:Landroidx/camera/video/Recorder$AudioState;

    .line 238
    .line 239
    :goto_5
    invoke-virtual {p0, v1}, Landroidx/camera/video/Recorder;->setAudioState(Landroidx/camera/video/Recorder$AudioState;)V

    .line 240
    .line 241
    .line 242
    iput-object v0, p0, Landroidx/camera/video/Recorder;->mAudioErrorCause:Ljava/lang/Throwable;

    .line 243
    .line 244
    goto :goto_6

    .line 245
    :cond_9
    new-instance p1, Ljava/lang/AssertionError;

    .line 246
    .line 247
    const-string v0, "The Recorder doesn\'t support recording with audio"

    .line 248
    .line 249
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    throw p1

    .line 253
    :cond_a
    :goto_6
    const/4 v0, 0x0

    .line 254
    invoke-direct {p0, p1, v0}, Landroidx/camera/video/Recorder;->updateEncoderCallbacks(Landroidx/camera/video/Recorder$RecordingRecord;Z)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {p0}, Landroidx/camera/video/Recorder;->isAudioEnabled()Z

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    if-eqz v0, :cond_b

    .line 262
    .line 263
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mAudioSource:Landroidx/camera/video/internal/audio/AudioSource;

    .line 264
    .line 265
    invoke-virtual {p1}, Landroidx/camera/video/Recorder$RecordingRecord;->isMuted()Z

    .line 266
    .line 267
    .line 268
    move-result p1

    .line 269
    invoke-virtual {v0, p1}, Landroidx/camera/video/internal/audio/AudioSource;->start(Z)V

    .line 270
    .line 271
    .line 272
    iget-object p1, p0, Landroidx/camera/video/Recorder;->mAudioEncoder:Landroidx/camera/video/internal/encoder/Encoder;

    .line 273
    .line 274
    invoke-interface {p1}, Landroidx/camera/video/internal/encoder/Encoder;->start()V

    .line 275
    .line 276
    .line 277
    :cond_b
    iget-object p1, p0, Landroidx/camera/video/Recorder;->mVideoEncoder:Landroidx/camera/video/internal/encoder/Encoder;

    .line 278
    .line 279
    invoke-interface {p1}, Landroidx/camera/video/internal/encoder/Encoder;->start()V

    .line 280
    .line 281
    .line 282
    iget-object p1, p0, Landroidx/camera/video/Recorder;->mInProgressRecording:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 283
    .line 284
    invoke-virtual {p1}, Landroidx/camera/video/Recorder$RecordingRecord;->getOutputOptions()Landroidx/camera/video/OutputOptions;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    invoke-virtual {p0}, Landroidx/camera/video/Recorder;->getInProgressRecordingStats()Landroidx/camera/video/RecordingStats;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    invoke-static {v0, v1}, Landroidx/camera/video/VideoRecordEvent;->start(Landroidx/camera/video/OutputOptions;Landroidx/camera/video/RecordingStats;)Landroidx/camera/video/VideoRecordEvent$Start;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    invoke-virtual {p1, v0}, Landroidx/camera/video/Recorder$RecordingRecord;->updateVideoRecordEvent(Landroidx/camera/video/VideoRecordEvent;)V

    .line 297
    .line 298
    .line 299
    return-void

    .line 300
    :cond_c
    new-instance p1, Ljava/lang/AssertionError;

    .line 301
    .line 302
    const-string v0, "Attempted to start a new recording while another was in progress."

    .line 303
    .line 304
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    throw p1
.end method

.method private startRecording(Landroidx/camera/video/Recorder$RecordingRecord;Z)V
    .locals 0
    .param p1    # Landroidx/camera/video/Recorder$RecordingRecord;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Landroidx/camera/video/Recorder;->startInternal(Landroidx/camera/video/Recorder$RecordingRecord;)V

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    invoke-direct {p0, p1}, Landroidx/camera/video/Recorder;->pauseInternal(Landroidx/camera/video/Recorder$RecordingRecord;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method private static supportedMuxerFormatOrDefaultFrom(Landroidx/camera/video/internal/VideoValidatedEncoderProfilesProxy;I)I
    .locals 3
    .param p0    # Landroidx/camera/video/internal/VideoValidatedEncoderProfilesProxy;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    if-eqz p0, :cond_4

    .line 2
    .line 3
    invoke-interface {p0}, Landroidx/camera/core/impl/EncoderProfilesProxy;->getRecommendedFileFormat()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/4 v0, 0x0

    .line 8
    const/4 v1, 0x2

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eq p0, v2, :cond_2

    .line 11
    .line 12
    if-eq p0, v1, :cond_1

    .line 13
    .line 14
    const/16 v0, 0x9

    .line 15
    .line 16
    if-eq p0, v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return v2

    .line 20
    :cond_1
    return v0

    .line 21
    :cond_2
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 22
    .line 23
    const/16 p1, 0x1a

    .line 24
    .line 25
    if-ge p0, p1, :cond_3

    .line 26
    .line 27
    return v0

    .line 28
    :cond_3
    return v1

    .line 29
    :cond_4
    :goto_0
    return p1
.end method

.method private tryReleaseVideoEncoder()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mVideoEncoderSessionToRelease:Landroidx/camera/video/VideoEncoderSession;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/camera/video/VideoEncoderSession;->getVideoEncoder()Landroidx/camera/video/internal/encoder/Encoder;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mVideoEncoder:Landroidx/camera/video/internal/encoder/Encoder;

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    invoke-static {v0}, Landroidx/core/util/Preconditions;->checkState(Z)V

    .line 17
    .line 18
    .line 19
    new-instance v0, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v1, "Releasing video encoder: "

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mVideoEncoder:Landroidx/camera/video/internal/encoder/Encoder;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v1, "Recorder"

    .line 39
    .line 40
    invoke-static {v1, v0}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mVideoEncoderSessionToRelease:Landroidx/camera/video/VideoEncoderSession;

    .line 44
    .line 45
    invoke-virtual {v0}, Landroidx/camera/video/VideoEncoderSession;->terminateNow()V

    .line 46
    .line 47
    .line 48
    const/4 v0, 0x0

    .line 49
    iput-object v0, p0, Landroidx/camera/video/Recorder;->mVideoEncoderSessionToRelease:Landroidx/camera/video/VideoEncoderSession;

    .line 50
    .line 51
    iput-object v0, p0, Landroidx/camera/video/Recorder;->mVideoEncoder:Landroidx/camera/video/internal/encoder/Encoder;

    .line 52
    .line 53
    iput-object v0, p0, Landroidx/camera/video/Recorder;->mVideoOutputConfig:Landroidx/camera/video/internal/encoder/OutputConfig;

    .line 54
    .line 55
    invoke-virtual {p0, v0}, Landroidx/camera/video/Recorder;->setLatestSurface(Landroid/view/Surface;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_1
    invoke-direct {p0}, Landroidx/camera/video/Recorder;->safeToCloseVideoEncoder()Lcom/google/common/util/concurrent/ListenableFuture;

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method private updateEncoderCallbacks(Landroidx/camera/video/Recorder$RecordingRecord;Z)V
    .locals 2
    .param p1    # Landroidx/camera/video/Recorder$RecordingRecord;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mEncodingFutures:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mEncodingFutures:Ljava/util/List;

    .line 10
    .line 11
    invoke-static {v0}, Landroidx/camera/core/impl/utils/futures/Futures;->allAsList(Ljava/util/Collection;)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mEncodingFutures:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 28
    .line 29
    .line 30
    :cond_1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mEncodingFutures:Ljava/util/List;

    .line 31
    .line 32
    new-instance v1, Landroidx/camera/video/c;

    .line 33
    .line 34
    invoke-direct {v1, p0, p1}, Landroidx/camera/video/c;-><init>(Landroidx/camera/video/Recorder;Landroidx/camera/video/Recorder$RecordingRecord;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v1}, Landroidx/concurrent/futures/CallbackToFutureAdapter;->getFuture(Landroidx/concurrent/futures/CallbackToFutureAdapter$Resolver;)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Landroidx/camera/video/Recorder;->isAudioEnabled()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    if-nez p2, :cond_2

    .line 51
    .line 52
    iget-object p2, p0, Landroidx/camera/video/Recorder;->mEncodingFutures:Ljava/util/List;

    .line 53
    .line 54
    new-instance v0, Landroidx/camera/video/d;

    .line 55
    .line 56
    invoke-direct {v0, p0, p1}, Landroidx/camera/video/d;-><init>(Landroidx/camera/video/Recorder;Landroidx/camera/video/Recorder$RecordingRecord;)V

    .line 57
    .line 58
    .line 59
    invoke-static {v0}, Landroidx/concurrent/futures/CallbackToFutureAdapter;->getFuture(Landroidx/concurrent/futures/CallbackToFutureAdapter$Resolver;)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    :cond_2
    iget-object p1, p0, Landroidx/camera/video/Recorder;->mEncodingFutures:Ljava/util/List;

    .line 67
    .line 68
    invoke-static {p1}, Landroidx/camera/core/impl/utils/futures/Futures;->allAsList(Ljava/util/Collection;)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    new-instance p2, Landroidx/camera/video/Recorder$6;

    .line 73
    .line 74
    invoke-direct {p2, p0}, Landroidx/camera/video/Recorder$6;-><init>(Landroidx/camera/video/Recorder;)V

    .line 75
    .line 76
    .line 77
    invoke-static {}, Landroidx/camera/core/impl/utils/executor/CameraXExecutors;->directExecutor()Ljava/util/concurrent/Executor;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-static {p1, p2, v0}, Landroidx/camera/core/impl/utils/futures/Futures;->addCallback(Lcom/google/common/util/concurrent/ListenableFuture;Landroidx/camera/core/impl/utils/futures/FutureCallback;Ljava/util/concurrent/Executor;)V

    .line 82
    .line 83
    .line 84
    return-void
.end method

.method private updateNonPendingState(Landroidx/camera/video/Recorder$State;)V
    .locals 3
    .param p1    # Landroidx/camera/video/Recorder$State;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/GuardedBy;
        value = "mLock"
    .end annotation

    .line 1
    sget-object v0, Landroidx/camera/video/Recorder;->PENDING_STATES:Ljava/util/Set;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mState:Landroidx/camera/video/Recorder$State;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    sget-object v0, Landroidx/camera/video/Recorder;->VALID_NON_PENDING_STATES_WHILE_PENDING:Ljava/util/Set;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mNonPendingState:Landroidx/camera/video/Recorder$State;

    .line 20
    .line 21
    if-eq v0, p1, :cond_0

    .line 22
    .line 23
    iput-object p1, p0, Landroidx/camera/video/Recorder;->mNonPendingState:Landroidx/camera/video/Recorder$State;

    .line 24
    .line 25
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mStreamInfo:Landroidx/camera/core/impl/MutableStateObservable;

    .line 26
    .line 27
    iget v1, p0, Landroidx/camera/video/Recorder;->mStreamId:I

    .line 28
    .line 29
    invoke-direct {p0, p1}, Landroidx/camera/video/Recorder;->internalStateToStreamState(Landroidx/camera/video/Recorder$State;)Landroidx/camera/video/StreamInfo$StreamState;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object v2, p0, Landroidx/camera/video/Recorder;->mInProgressTransformationInfo:Landroidx/camera/core/SurfaceRequest$TransformationInfo;

    .line 34
    .line 35
    invoke-static {v1, p1, v2}, Landroidx/camera/video/StreamInfo;->of(ILandroidx/camera/video/StreamInfo$StreamState;Landroidx/camera/core/SurfaceRequest$TransformationInfo;)Landroidx/camera/video/StreamInfo;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {v0, p1}, Landroidx/camera/core/impl/MutableStateObservable;->setState(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void

    .line 43
    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    .line 44
    .line 45
    new-instance v1, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    const-string v2, "Invalid state transition. State is not a valid non-pending state while in a pending state: "

    .line 51
    .line 52
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    throw v0

    .line 66
    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    .line 67
    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    const-string v1, "Can only updated non-pending state from a pending state, but state is "

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mState:Landroidx/camera/video/Recorder$State;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    throw p1
.end method


# virtual methods
.method public finalizeInProgressRecording(ILjava/lang/Throwable;)V
    .locals 6
    .param p2    # Ljava/lang/Throwable;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mInProgressRecording:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mMediaMuxer:Landroid/media/MediaMuxer;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    :try_start_0
    invoke-virtual {v0}, Landroid/media/MediaMuxer;->stop()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mMediaMuxer:Landroid/media/MediaMuxer;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/media/MediaMuxer;->release()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catch_0
    move-exception v0

    .line 21
    new-instance v3, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v4, "MediaMuxer failed to stop or release with error: "

    .line 27
    .line 28
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v3, "Recorder"

    .line 43
    .line 44
    invoke-static {v3, v0}, Landroidx/camera/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    if-nez p1, :cond_0

    .line 48
    .line 49
    move p1, v1

    .line 50
    :cond_0
    :goto_0
    iput-object v2, p0, Landroidx/camera/video/Recorder;->mMediaMuxer:Landroid/media/MediaMuxer;

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    if-nez p1, :cond_2

    .line 54
    .line 55
    const/16 p1, 0x8

    .line 56
    .line 57
    :cond_2
    :goto_1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mInProgressRecording:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 58
    .line 59
    iget-object v3, p0, Landroidx/camera/video/Recorder;->mOutputUri:Landroid/net/Uri;

    .line 60
    .line 61
    invoke-virtual {v0, v3}, Landroidx/camera/video/Recorder$RecordingRecord;->finalizeRecording(Landroid/net/Uri;)V

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mInProgressRecording:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 65
    .line 66
    invoke-virtual {v0}, Landroidx/camera/video/Recorder$RecordingRecord;->getOutputOptions()Landroidx/camera/video/OutputOptions;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {p0}, Landroidx/camera/video/Recorder;->getInProgressRecordingStats()Landroidx/camera/video/RecordingStats;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    iget-object v4, p0, Landroidx/camera/video/Recorder;->mOutputUri:Landroid/net/Uri;

    .line 75
    .line 76
    invoke-static {v4}, Landroidx/camera/video/OutputResults;->of(Landroid/net/Uri;)Landroidx/camera/video/OutputResults;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    iget-object v5, p0, Landroidx/camera/video/Recorder;->mInProgressRecording:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 81
    .line 82
    if-nez p1, :cond_3

    .line 83
    .line 84
    invoke-static {v0, v3, v4}, Landroidx/camera/video/VideoRecordEvent;->finalize(Landroidx/camera/video/OutputOptions;Landroidx/camera/video/RecordingStats;Landroidx/camera/video/OutputResults;)Landroidx/camera/video/VideoRecordEvent$Finalize;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    goto :goto_2

    .line 89
    :cond_3
    invoke-static {v0, v3, v4, p1, p2}, Landroidx/camera/video/VideoRecordEvent;->finalizeWithError(Landroidx/camera/video/OutputOptions;Landroidx/camera/video/RecordingStats;Landroidx/camera/video/OutputResults;ILjava/lang/Throwable;)Landroidx/camera/video/VideoRecordEvent$Finalize;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    :goto_2
    invoke-virtual {v5, p1}, Landroidx/camera/video/Recorder$RecordingRecord;->updateVideoRecordEvent(Landroidx/camera/video/VideoRecordEvent;)V

    .line 94
    .line 95
    .line 96
    iget-object p1, p0, Landroidx/camera/video/Recorder;->mInProgressRecording:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 97
    .line 98
    iput-object v2, p0, Landroidx/camera/video/Recorder;->mInProgressRecording:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 99
    .line 100
    const/4 p2, 0x0

    .line 101
    iput-boolean p2, p0, Landroidx/camera/video/Recorder;->mInProgressRecordingStopping:Z

    .line 102
    .line 103
    iput-object v2, p0, Landroidx/camera/video/Recorder;->mAudioTrackIndex:Ljava/lang/Integer;

    .line 104
    .line 105
    iput-object v2, p0, Landroidx/camera/video/Recorder;->mVideoTrackIndex:Ljava/lang/Integer;

    .line 106
    .line 107
    iget-object p2, p0, Landroidx/camera/video/Recorder;->mEncodingFutures:Ljava/util/List;

    .line 108
    .line 109
    invoke-interface {p2}, Ljava/util/List;->clear()V

    .line 110
    .line 111
    .line 112
    sget-object p2, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 113
    .line 114
    iput-object p2, p0, Landroidx/camera/video/Recorder;->mOutputUri:Landroid/net/Uri;

    .line 115
    .line 116
    const-wide/16 v3, 0x0

    .line 117
    .line 118
    iput-wide v3, p0, Landroidx/camera/video/Recorder;->mRecordingBytes:J

    .line 119
    .line 120
    iput-wide v3, p0, Landroidx/camera/video/Recorder;->mRecordingDurationNs:J

    .line 121
    .line 122
    const-wide v3, 0x7fffffffffffffffL

    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    iput-wide v3, p0, Landroidx/camera/video/Recorder;->mFirstRecordingVideoDataTimeUs:J

    .line 128
    .line 129
    iput-wide v3, p0, Landroidx/camera/video/Recorder;->mFirstRecordingAudioDataTimeUs:J

    .line 130
    .line 131
    iput-wide v3, p0, Landroidx/camera/video/Recorder;->mPreviousRecordingVideoDataTimeUs:J

    .line 132
    .line 133
    iput-wide v3, p0, Landroidx/camera/video/Recorder;->mPreviousRecordingAudioDataTimeUs:J

    .line 134
    .line 135
    iput v1, p0, Landroidx/camera/video/Recorder;->mRecordingStopError:I

    .line 136
    .line 137
    iput-object v2, p0, Landroidx/camera/video/Recorder;->mRecordingStopErrorCause:Ljava/lang/Throwable;

    .line 138
    .line 139
    iput-object v2, p0, Landroidx/camera/video/Recorder;->mAudioErrorCause:Ljava/lang/Throwable;

    .line 140
    .line 141
    const-wide/16 v3, 0x0

    .line 142
    .line 143
    iput-wide v3, p0, Landroidx/camera/video/Recorder;->mAudioAmplitude:D

    .line 144
    .line 145
    invoke-direct {p0}, Landroidx/camera/video/Recorder;->clearPendingAudioRingBuffer()V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0, v2}, Landroidx/camera/video/Recorder;->setInProgressTransformationInfo(Landroidx/camera/core/SurfaceRequest$TransformationInfo;)V

    .line 149
    .line 150
    .line 151
    iget-object p2, p0, Landroidx/camera/video/Recorder;->mAudioState:Landroidx/camera/video/Recorder$AudioState;

    .line 152
    .line 153
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 154
    .line 155
    .line 156
    move-result p2

    .line 157
    if-eq p2, v1, :cond_6

    .line 158
    .line 159
    const/4 v0, 0x2

    .line 160
    if-eq p2, v0, :cond_5

    .line 161
    .line 162
    const/4 v0, 0x3

    .line 163
    if-eq p2, v0, :cond_5

    .line 164
    .line 165
    const/4 v0, 0x4

    .line 166
    if-eq p2, v0, :cond_4

    .line 167
    .line 168
    const/4 v0, 0x5

    .line 169
    if-eq p2, v0, :cond_4

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_4
    sget-object p2, Landroidx/camera/video/Recorder$AudioState;->INITIALIZING:Landroidx/camera/video/Recorder$AudioState;

    .line 173
    .line 174
    invoke-virtual {p0, p2}, Landroidx/camera/video/Recorder;->setAudioState(Landroidx/camera/video/Recorder$AudioState;)V

    .line 175
    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_5
    sget-object p2, Landroidx/camera/video/Recorder$AudioState;->IDLING:Landroidx/camera/video/Recorder$AudioState;

    .line 179
    .line 180
    invoke-virtual {p0, p2}, Landroidx/camera/video/Recorder;->setAudioState(Landroidx/camera/video/Recorder$AudioState;)V

    .line 181
    .line 182
    .line 183
    iget-object p2, p0, Landroidx/camera/video/Recorder;->mAudioSource:Landroidx/camera/video/internal/audio/AudioSource;

    .line 184
    .line 185
    invoke-virtual {p2}, Landroidx/camera/video/internal/audio/AudioSource;->stop()V

    .line 186
    .line 187
    .line 188
    :goto_3
    invoke-direct {p0, p1}, Landroidx/camera/video/Recorder;->onRecordingFinalized(Landroidx/camera/video/Recorder$RecordingRecord;)V

    .line 189
    .line 190
    .line 191
    return-void

    .line 192
    :cond_6
    new-instance p1, Ljava/lang/AssertionError;

    .line 193
    .line 194
    const-string p2, "Incorrectly finalize recording when audio state is IDLING"

    .line 195
    .line 196
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    throw p1

    .line 200
    :cond_7
    new-instance p1, Ljava/lang/AssertionError;

    .line 201
    .line 202
    const-string p2, "Attempted to finalize in-progress recording, but no recording is in progress."

    .line 203
    .line 204
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    throw p1
.end method

.method public getAspectRatio()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mMediaSpec:Landroidx/camera/core/impl/MutableStateObservable;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroidx/camera/video/Recorder;->getObservableData(Landroidx/camera/core/impl/StateObservable;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/camera/video/MediaSpec;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/camera/video/MediaSpec;->getVideoSpec()Landroidx/camera/video/VideoSpec;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Landroidx/camera/video/VideoSpec;->getAspectRatio()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    return v0
.end method

.method public getAudioSource()I
    .locals 1
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mMediaSpec:Landroidx/camera/core/impl/MutableStateObservable;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroidx/camera/video/Recorder;->getObservableData(Landroidx/camera/core/impl/StateObservable;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/camera/video/MediaSpec;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/camera/video/MediaSpec;->getAudioSpec()Landroidx/camera/video/AudioSpec;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Landroidx/camera/video/AudioSpec;->getSource()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    return v0
.end method

.method public getExecutor()Ljava/util/concurrent/Executor;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mUserProvidedExecutor:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    return-object v0
.end method

.method public getInProgressRecordingStats()Landroidx/camera/video/RecordingStats;
    .locals 8
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iget-wide v0, p0, Landroidx/camera/video/Recorder;->mRecordingDurationNs:J

    .line 2
    .line 3
    iget-wide v2, p0, Landroidx/camera/video/Recorder;->mRecordingBytes:J

    .line 4
    .line 5
    iget-object v4, p0, Landroidx/camera/video/Recorder;->mAudioState:Landroidx/camera/video/Recorder$AudioState;

    .line 6
    .line 7
    invoke-direct {p0, v4}, Landroidx/camera/video/Recorder;->internalAudioStateToAudioStatsState(Landroidx/camera/video/Recorder$AudioState;)I

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    iget-object v5, p0, Landroidx/camera/video/Recorder;->mAudioErrorCause:Ljava/lang/Throwable;

    .line 12
    .line 13
    iget-wide v6, p0, Landroidx/camera/video/Recorder;->mAudioAmplitude:D

    .line 14
    .line 15
    invoke-static {v4, v5, v6, v7}, Landroidx/camera/video/AudioStats;->of(ILjava/lang/Throwable;D)Landroidx/camera/video/AudioStats;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-static {v0, v1, v2, v3, v4}, Landroidx/camera/video/RecordingStats;->of(JJLandroidx/camera/video/AudioStats;)Landroidx/camera/video/RecordingStats;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0
.end method

.method public getMediaCapabilities(Landroidx/camera/core/CameraInfo;)Landroidx/camera/video/VideoCapabilities;
    .locals 1
    .param p1    # Landroidx/camera/core/CameraInfo;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .line 1
    iget v0, p0, Landroidx/camera/video/Recorder;->mVideoCapabilitiesSource:I

    .line 2
    .line 3
    invoke-static {p1, v0}, Landroidx/camera/video/Recorder;->getVideoCapabilities(Landroidx/camera/core/CameraInfo;I)Landroidx/camera/video/VideoCapabilities;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public getMediaSpec()Landroidx/camera/core/impl/Observable;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/camera/core/impl/Observable<",
            "Landroidx/camera/video/MediaSpec;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mMediaSpec:Landroidx/camera/core/impl/MutableStateObservable;

    .line 2
    .line 3
    return-object v0
.end method

.method public getObservableData(Landroidx/camera/core/impl/StateObservable;)Ljava/lang/Object;
    .locals 1
    .param p1    # Landroidx/camera/core/impl/StateObservable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/camera/core/impl/StateObservable<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroidx/camera/core/impl/StateObservable;->fetchData()Lcom/google/common/util/concurrent/ListenableFuture;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-object p1

    .line 10
    :catch_0
    move-exception p1

    .line 11
    goto :goto_0

    .line 12
    :catch_1
    move-exception p1

    .line 13
    :goto_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 16
    .line 17
    .line 18
    throw v0
.end method

.method public getQualitySelector()Landroidx/camera/video/QualitySelector;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mMediaSpec:Landroidx/camera/core/impl/MutableStateObservable;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroidx/camera/video/Recorder;->getObservableData(Landroidx/camera/core/impl/StateObservable;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/camera/video/MediaSpec;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/camera/video/MediaSpec;->getVideoSpec()Landroidx/camera/video/VideoSpec;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Landroidx/camera/video/VideoSpec;->getQualitySelector()Landroidx/camera/video/QualitySelector;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method public getStreamInfo()Landroidx/camera/core/impl/Observable;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/camera/core/impl/Observable<",
            "Landroidx/camera/video/StreamInfo;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mStreamInfo:Landroidx/camera/core/impl/MutableStateObservable;

    .line 2
    .line 3
    return-object v0
.end method

.method public getTargetVideoEncodingBitRate()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mMediaSpec:Landroidx/camera/core/impl/MutableStateObservable;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroidx/camera/video/Recorder;->getObservableData(Landroidx/camera/core/impl/StateObservable;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/camera/video/MediaSpec;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/camera/video/MediaSpec;->getVideoSpec()Landroidx/camera/video/VideoSpec;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Landroidx/camera/video/VideoSpec;->getBitrate()Landroid/util/Range;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    return v0
.end method

.method public getVideoCapabilitiesSource()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/camera/video/Recorder;->mVideoCapabilitiesSource:I

    .line 2
    .line 3
    return v0
.end method

.method public isAudioEnabled()Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mAudioState:Landroidx/camera/video/Recorder$AudioState;

    .line 2
    .line 3
    sget-object v1, Landroidx/camera/video/Recorder$AudioState;->ENABLED:Landroidx/camera/video/Recorder$AudioState;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public isAudioSupported()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mMediaSpec:Landroidx/camera/core/impl/MutableStateObservable;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroidx/camera/video/Recorder;->getObservableData(Landroidx/camera/core/impl/StateObservable;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/camera/video/MediaSpec;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/camera/video/MediaSpec;->getAudioSpec()Landroidx/camera/video/AudioSpec;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Landroidx/camera/video/AudioSpec;->getChannelCount()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    return v0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    return v0
.end method

.method public isPersistentRecordingInProgress()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mInProgressRecording:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/camera/video/Recorder$RecordingRecord;->isPersistent()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public isSourceStreamRequired()Landroidx/camera/core/impl/Observable;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/camera/core/impl/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mIsRecording:Landroidx/camera/core/impl/MutableStateObservable;

    .line 2
    .line 3
    return-object v0
.end method

.method public mute(Landroidx/camera/video/Recording;Z)V
    .locals 3
    .param p1    # Landroidx/camera/video/Recording;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mPendingRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 5
    .line 6
    invoke-static {p1, v1}, Landroidx/camera/video/Recorder;->isSameRecording(Landroidx/camera/video/Recording;Landroidx/camera/video/Recorder$RecordingRecord;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mActiveRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 13
    .line 14
    invoke-static {p1, v1}, Landroidx/camera/video/Recorder;->isSameRecording(Landroidx/camera/video/Recording;Landroidx/camera/video/Recorder$RecordingRecord;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    const-string p2, "Recorder"

    .line 21
    .line 22
    new-instance v1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v2, "mute() called on a recording that is no longer active: "

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Landroidx/camera/video/Recording;->getOutputOptions()Landroidx/camera/video/OutputOptions;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {p2, p1}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    monitor-exit v0

    .line 47
    return-void

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mPendingRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 51
    .line 52
    invoke-static {p1, v1}, Landroidx/camera/video/Recorder;->isSameRecording(Landroidx/camera/video/Recording;Landroidx/camera/video/Recorder$RecordingRecord;)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_1

    .line 57
    .line 58
    iget-object p1, p0, Landroidx/camera/video/Recorder;->mPendingRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    iget-object p1, p0, Landroidx/camera/video/Recorder;->mActiveRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 62
    .line 63
    :goto_0
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mSequentialExecutor:Ljava/util/concurrent/Executor;

    .line 64
    .line 65
    new-instance v2, Landroidx/camera/video/h;

    .line 66
    .line 67
    invoke-direct {v2, p0, p1, p2}, Landroidx/camera/video/h;-><init>(Landroidx/camera/video/Recorder;Landroidx/camera/video/Recorder$RecordingRecord;Z)V

    .line 68
    .line 69
    .line 70
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 71
    .line 72
    .line 73
    monitor-exit v0

    .line 74
    return-void

    .line 75
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    throw p1
.end method

.method public onConfigured()V
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mState:Landroidx/camera/video/Recorder$State;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    goto/16 :goto_3

    .line 17
    .line 18
    :pswitch_0
    const-string v1, "Recorder"

    .line 19
    .line 20
    const-string v5, "onConfigured() was invoked when the Recorder had encountered error"

    .line 21
    .line 22
    invoke-static {v1, v5}, Landroidx/camera/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    goto/16 :goto_3

    .line 26
    .line 27
    :catchall_0
    move-exception v1

    .line 28
    goto/16 :goto_5

    .line 29
    .line 30
    :pswitch_1
    iget-boolean v1, p0, Landroidx/camera/video/Recorder;->mEncoderNotUsePersistentInputSurface:Z

    .line 31
    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    goto/16 :goto_3

    .line 35
    .line 36
    :cond_0
    new-instance v1, Ljava/lang/AssertionError;

    .line 37
    .line 38
    const-string v2, "Unexpectedly invoke onConfigured() in a STOPPING state when it\'s not waiting for a new surface."

    .line 39
    .line 40
    invoke-direct {v1, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    throw v1

    .line 44
    :pswitch_2
    move v1, v2

    .line 45
    goto :goto_0

    .line 46
    :pswitch_3
    move v1, v4

    .line 47
    :goto_0
    invoke-virtual {p0}, Landroidx/camera/video/Recorder;->isPersistentRecordingInProgress()Z

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    const-string v6, "Unexpectedly invoke onConfigured() when there\'s a non-persistent in-progress recording"

    .line 52
    .line 53
    invoke-static {v5, v6}, Landroidx/core/util/Preconditions;->checkState(ZLjava/lang/String;)V

    .line 54
    .line 55
    .line 56
    move v8, v2

    .line 57
    move-object v5, v3

    .line 58
    move-object v6, v5

    .line 59
    move v7, v4

    .line 60
    goto :goto_4

    .line 61
    :pswitch_4
    new-instance v1, Ljava/lang/AssertionError;

    .line 62
    .line 63
    new-instance v2, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    const-string v3, "Incorrectly invoke onConfigured() in state "

    .line 69
    .line 70
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    iget-object v3, p0, Landroidx/camera/video/Recorder;->mState:Landroidx/camera/video/Recorder$State;

    .line 74
    .line 75
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-direct {v1, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    throw v1

    .line 86
    :pswitch_5
    move v1, v2

    .line 87
    goto :goto_1

    .line 88
    :pswitch_6
    move v1, v4

    .line 89
    :goto_1
    iget-object v5, p0, Landroidx/camera/video/Recorder;->mActiveRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 90
    .line 91
    if-eqz v5, :cond_1

    .line 92
    .line 93
    move-object v5, v3

    .line 94
    move-object v6, v5

    .line 95
    move v7, v4

    .line 96
    :goto_2
    move v8, v7

    .line 97
    goto :goto_4

    .line 98
    :cond_1
    iget-object v5, p0, Landroidx/camera/video/Recorder;->mSourceState:Landroidx/camera/video/VideoOutput$SourceState;

    .line 99
    .line 100
    sget-object v6, Landroidx/camera/video/VideoOutput$SourceState;->INACTIVE:Landroidx/camera/video/VideoOutput$SourceState;

    .line 101
    .line 102
    if-ne v5, v6, :cond_2

    .line 103
    .line 104
    iget-object v5, p0, Landroidx/camera/video/Recorder;->mPendingRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 105
    .line 106
    iput-object v3, p0, Landroidx/camera/video/Recorder;->mPendingRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 107
    .line 108
    invoke-direct {p0}, Landroidx/camera/video/Recorder;->restoreNonPendingState()V

    .line 109
    .line 110
    .line 111
    sget-object v6, Landroidx/camera/video/Recorder;->PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE:Ljava/lang/Exception;

    .line 112
    .line 113
    const/4 v7, 0x4

    .line 114
    move v8, v4

    .line 115
    goto :goto_4

    .line 116
    :cond_2
    iget-object v5, p0, Landroidx/camera/video/Recorder;->mState:Landroidx/camera/video/Recorder$State;

    .line 117
    .line 118
    invoke-direct {p0, v5}, Landroidx/camera/video/Recorder;->makePendingRecordingActiveLocked(Landroidx/camera/video/Recorder$State;)Landroidx/camera/video/Recorder$RecordingRecord;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    move-object v6, v3

    .line 123
    move v7, v4

    .line 124
    move v8, v7

    .line 125
    move-object v3, v5

    .line 126
    move-object v5, v6

    .line 127
    goto :goto_4

    .line 128
    :pswitch_7
    sget-object v1, Landroidx/camera/video/Recorder$State;->IDLING:Landroidx/camera/video/Recorder$State;

    .line 129
    .line 130
    invoke-virtual {p0, v1}, Landroidx/camera/video/Recorder;->setState(Landroidx/camera/video/Recorder$State;)V

    .line 131
    .line 132
    .line 133
    :goto_3
    move-object v5, v3

    .line 134
    move-object v6, v5

    .line 135
    move v1, v4

    .line 136
    move v7, v1

    .line 137
    goto :goto_2

    .line 138
    :goto_4
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    if-eqz v8, :cond_4

    .line 140
    .line 141
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mInProgressRecording:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 142
    .line 143
    invoke-direct {p0, v0, v2}, Landroidx/camera/video/Recorder;->updateEncoderCallbacks(Landroidx/camera/video/Recorder$RecordingRecord;Z)V

    .line 144
    .line 145
    .line 146
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mVideoEncoder:Landroidx/camera/video/internal/encoder/Encoder;

    .line 147
    .line 148
    invoke-interface {v0}, Landroidx/camera/video/internal/encoder/Encoder;->start()V

    .line 149
    .line 150
    .line 151
    iget-boolean v0, p0, Landroidx/camera/video/Recorder;->mShouldSendResumeEvent:Z

    .line 152
    .line 153
    if-eqz v0, :cond_3

    .line 154
    .line 155
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mInProgressRecording:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 156
    .line 157
    invoke-virtual {v0}, Landroidx/camera/video/Recorder$RecordingRecord;->getOutputOptions()Landroidx/camera/video/OutputOptions;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    invoke-virtual {p0}, Landroidx/camera/video/Recorder;->getInProgressRecordingStats()Landroidx/camera/video/RecordingStats;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    invoke-static {v2, v3}, Landroidx/camera/video/VideoRecordEvent;->resume(Landroidx/camera/video/OutputOptions;Landroidx/camera/video/RecordingStats;)Landroidx/camera/video/VideoRecordEvent$Resume;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    invoke-virtual {v0, v2}, Landroidx/camera/video/Recorder$RecordingRecord;->updateVideoRecordEvent(Landroidx/camera/video/VideoRecordEvent;)V

    .line 170
    .line 171
    .line 172
    iput-boolean v4, p0, Landroidx/camera/video/Recorder;->mShouldSendResumeEvent:Z

    .line 173
    .line 174
    :cond_3
    if-eqz v1, :cond_6

    .line 175
    .line 176
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mVideoEncoder:Landroidx/camera/video/internal/encoder/Encoder;

    .line 177
    .line 178
    invoke-interface {v0}, Landroidx/camera/video/internal/encoder/Encoder;->pause()V

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :cond_4
    if-eqz v3, :cond_5

    .line 183
    .line 184
    invoke-direct {p0, v3, v1}, Landroidx/camera/video/Recorder;->startRecording(Landroidx/camera/video/Recorder$RecordingRecord;Z)V

    .line 185
    .line 186
    .line 187
    return-void

    .line 188
    :cond_5
    if-eqz v5, :cond_6

    .line 189
    .line 190
    invoke-direct {p0, v5, v7, v6}, Landroidx/camera/video/Recorder;->finalizePendingRecording(Landroidx/camera/video/Recorder$RecordingRecord;ILjava/lang/Throwable;)V

    .line 191
    .line 192
    .line 193
    :cond_6
    return-void

    .line 194
    :goto_5
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 195
    throw v1

    .line 196
    nop

    .line 197
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_4
        :pswitch_0
    .end packed-switch
.end method

.method public onEncoderSetupError(Ljava/lang/Throwable;)V
    .locals 4
    .param p1    # Ljava/lang/Throwable;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mState:Landroidx/camera/video/Recorder$State;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :pswitch_0
    new-instance v1, Ljava/lang/AssertionError;

    .line 16
    .line 17
    new-instance v2, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v3, "Encountered encoder setup error while in unexpected state "

    .line 23
    .line 24
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    iget-object v3, p0, Landroidx/camera/video/Recorder;->mState:Landroidx/camera/video/Recorder$State;

    .line 28
    .line 29
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v3, ": "

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-direct {v1, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    throw v1

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    goto :goto_1

    .line 50
    :pswitch_1
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mPendingRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 51
    .line 52
    iput-object v2, p0, Landroidx/camera/video/Recorder;->mPendingRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 53
    .line 54
    move-object v2, v1

    .line 55
    :pswitch_2
    const/4 v1, -0x1

    .line 56
    invoke-direct {p0, v1}, Landroidx/camera/video/Recorder;->setStreamId(I)V

    .line 57
    .line 58
    .line 59
    sget-object v1, Landroidx/camera/video/Recorder$State;->ERROR:Landroidx/camera/video/Recorder$State;

    .line 60
    .line 61
    invoke-virtual {p0, v1}, Landroidx/camera/video/Recorder;->setState(Landroidx/camera/video/Recorder$State;)V

    .line 62
    .line 63
    .line 64
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    if-eqz v2, :cond_0

    .line 66
    .line 67
    const/4 v0, 0x7

    .line 68
    invoke-direct {p0, v2, v0, p1}, Landroidx/camera/video/Recorder;->finalizePendingRecording(Landroidx/camera/video/Recorder$RecordingRecord;ILjava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    :cond_0
    return-void

    .line 72
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    throw p1

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public onInProgressRecordingInternalError(Landroidx/camera/video/Recorder$RecordingRecord;ILjava/lang/Throwable;)V
    .locals 9
    .param p1    # Landroidx/camera/video/Recorder$RecordingRecord;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Throwable;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mInProgressRecording:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 2
    .line 3
    if-ne p1, v0, :cond_2

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mLock:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mState:Landroidx/camera/video/Recorder$State;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 11
    .line 12
    .line 13
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 14
    const/4 v2, 0x0

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    goto :goto_1

    .line 19
    :pswitch_0
    :try_start_1
    sget-object v0, Landroidx/camera/video/Recorder$State;->STOPPING:Landroidx/camera/video/Recorder$State;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Landroidx/camera/video/Recorder;->setState(Landroidx/camera/video/Recorder$State;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    move-object p1, v0

    .line 28
    move-object v3, p0

    .line 29
    goto :goto_3

    .line 30
    :goto_0
    :pswitch_1
    :try_start_2
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mActiveRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 31
    .line 32
    if-ne p1, v0, :cond_1

    .line 33
    .line 34
    :goto_1
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    const-wide/16 v5, -0x1

    .line 38
    .line 39
    move-object v3, p0

    .line 40
    move-object v4, p1

    .line 41
    move v7, p2

    .line 42
    move-object v8, p3

    .line 43
    invoke-virtual/range {v3 .. v8}, Landroidx/camera/video/Recorder;->stopInternal(Landroidx/camera/video/Recorder$RecordingRecord;JILjava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    move-object v3, p0

    .line 48
    return-void

    .line 49
    :catchall_1
    move-exception v0

    .line 50
    move-object v3, p0

    .line 51
    :goto_2
    move-object p1, v0

    .line 52
    goto :goto_3

    .line 53
    :cond_1
    move-object v3, p0

    .line 54
    :try_start_3
    new-instance p1, Ljava/lang/AssertionError;

    .line 55
    .line 56
    const-string p2, "Internal error occurred for recording but it is not the active recording."

    .line 57
    .line 58
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    throw p1

    .line 62
    :catchall_2
    move-exception v0

    .line 63
    goto :goto_2

    .line 64
    :pswitch_2
    move-object v3, p0

    .line 65
    new-instance p1, Ljava/lang/AssertionError;

    .line 66
    .line 67
    new-instance p2, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    const-string p3, "In-progress recording error occurred while in unexpected state: "

    .line 73
    .line 74
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    iget-object p3, v3, Landroidx/camera/video/Recorder;->mState:Landroidx/camera/video/Recorder$State;

    .line 78
    .line 79
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    throw p1

    .line 90
    :goto_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 91
    throw p1

    .line 92
    :cond_2
    move-object v3, p0

    .line 93
    new-instance p1, Ljava/lang/AssertionError;

    .line 94
    .line 95
    const-string p2, "Internal error occurred on recording that is not the current in-progress recording."

    .line 96
    .line 97
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    throw p1

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public onSourceStateChanged(Landroidx/camera/video/VideoOutput$SourceState;)V
    .locals 2
    .param p1    # Landroidx/camera/video/VideoOutput$SourceState;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mSequentialExecutor:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    new-instance v1, Landroidx/camera/video/f;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Landroidx/camera/video/f;-><init>(Landroidx/camera/video/Recorder;Landroidx/camera/video/VideoOutput$SourceState;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onSourceStateChangedInternal(Landroidx/camera/video/VideoOutput$SourceState;)V
    .locals 3
    .param p1    # Landroidx/camera/video/VideoOutput$SourceState;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mSourceState:Landroidx/camera/video/VideoOutput$SourceState;

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/camera/video/Recorder;->mSourceState:Landroidx/camera/video/VideoOutput$SourceState;

    .line 4
    .line 5
    const-string v1, "Recorder"

    .line 6
    .line 7
    if-eq v0, p1, :cond_4

    .line 8
    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v2, "Video source has transitioned to state: "

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v1, v0}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    sget-object v0, Landroidx/camera/video/VideoOutput$SourceState;->INACTIVE:Landroidx/camera/video/VideoOutput$SourceState;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    if-ne p1, v0, :cond_2

    .line 33
    .line 34
    iget-object p1, p0, Landroidx/camera/video/Recorder;->mActiveSurface:Landroid/view/Surface;

    .line 35
    .line 36
    const/4 v0, 0x4

    .line 37
    const/4 v2, 0x0

    .line 38
    if-nez p1, :cond_1

    .line 39
    .line 40
    iget-object p1, p0, Landroidx/camera/video/Recorder;->mSetupVideoTask:Landroidx/camera/video/Recorder$SetupVideoTask;

    .line 41
    .line 42
    if-eqz p1, :cond_0

    .line 43
    .line 44
    invoke-virtual {p1}, Landroidx/camera/video/Recorder$SetupVideoTask;->cancelFailedRetry()V

    .line 45
    .line 46
    .line 47
    iput-object v2, p0, Landroidx/camera/video/Recorder;->mSetupVideoTask:Landroidx/camera/video/Recorder$SetupVideoTask;

    .line 48
    .line 49
    :cond_0
    invoke-virtual {p0, v0, v2, v1}, Landroidx/camera/video/Recorder;->requestReset(ILjava/lang/Throwable;Z)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    const/4 p1, 0x1

    .line 54
    iput-boolean p1, p0, Landroidx/camera/video/Recorder;->mNeedsResetBeforeNextStart:Z

    .line 55
    .line 56
    iget-object p1, p0, Landroidx/camera/video/Recorder;->mInProgressRecording:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 57
    .line 58
    if-eqz p1, :cond_3

    .line 59
    .line 60
    invoke-virtual {p1}, Landroidx/camera/video/Recorder$RecordingRecord;->isPersistent()Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-nez p1, :cond_3

    .line 65
    .line 66
    iget-object p1, p0, Landroidx/camera/video/Recorder;->mInProgressRecording:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 67
    .line 68
    invoke-virtual {p0, p1, v0, v2}, Landroidx/camera/video/Recorder;->onInProgressRecordingInternalError(Landroidx/camera/video/Recorder$RecordingRecord;ILjava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_2
    sget-object v0, Landroidx/camera/video/VideoOutput$SourceState;->ACTIVE_NON_STREAMING:Landroidx/camera/video/VideoOutput$SourceState;

    .line 73
    .line 74
    if-ne p1, v0, :cond_3

    .line 75
    .line 76
    iget-object p1, p0, Landroidx/camera/video/Recorder;->mSourceNonStreamingTimeout:Ljava/util/concurrent/ScheduledFuture;

    .line 77
    .line 78
    if-eqz p1, :cond_3

    .line 79
    .line 80
    invoke-interface {p1, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_3

    .line 85
    .line 86
    iget-object p1, p0, Landroidx/camera/video/Recorder;->mVideoEncoder:Landroidx/camera/video/internal/encoder/Encoder;

    .line 87
    .line 88
    if-eqz p1, :cond_3

    .line 89
    .line 90
    invoke-static {p1}, Landroidx/camera/video/Recorder;->notifyEncoderSourceStopped(Landroidx/camera/video/internal/encoder/Encoder;)V

    .line 91
    .line 92
    .line 93
    :cond_3
    return-void

    .line 94
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 97
    .line 98
    .line 99
    const-string v2, "Video source transitions to the same state: "

    .line 100
    .line 101
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-static {v1, p1}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    return-void
.end method

.method public onSurfaceRequested(Landroidx/camera/core/SurfaceRequest;)V
    .locals 1
    .param p1    # Landroidx/camera/core/SurfaceRequest;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    sget-object v0, Landroidx/camera/core/impl/Timebase;->UPTIME:Landroidx/camera/core/impl/Timebase;

    invoke-virtual {p0, p1, v0}, Landroidx/camera/video/Recorder;->onSurfaceRequested(Landroidx/camera/core/SurfaceRequest;Landroidx/camera/core/impl/Timebase;)V

    return-void
.end method

.method public onSurfaceRequested(Landroidx/camera/core/SurfaceRequest;Landroidx/camera/core/impl/Timebase;)V
    .locals 4
    .param p1    # Landroidx/camera/core/SurfaceRequest;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/camera/core/impl/Timebase;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mLock:Ljava/lang/Object;

    monitor-enter v0

    .line 3
    :try_start_0
    const-string v1, "Recorder"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Surface is requested in state: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Landroidx/camera/video/Recorder;->mState:Landroidx/camera/video/Recorder$State;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", Current surface: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Landroidx/camera/video/Recorder;->mStreamId:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mState:Landroidx/camera/video/Recorder$State;

    sget-object v2, Landroidx/camera/video/Recorder$State;->ERROR:Landroidx/camera/video/Recorder$State;

    if-ne v1, v2, :cond_0

    .line 5
    sget-object v1, Landroidx/camera/video/Recorder$State;->CONFIGURING:Landroidx/camera/video/Recorder$State;

    invoke-virtual {p0, v1}, Landroidx/camera/video/Recorder;->setState(Landroidx/camera/video/Recorder$State;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 6
    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mSequentialExecutor:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/camera/video/e;

    invoke-direct {v1, p0, p1, p2}, Landroidx/camera/video/e;-><init>(Landroidx/camera/video/Recorder;Landroidx/camera/core/SurfaceRequest;Landroidx/camera/core/impl/Timebase;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    .line 8
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public onVideoEncoderReady(Landroidx/camera/video/VideoEncoderSession;)V
    .locals 2
    .param p1    # Landroidx/camera/video/VideoEncoderSession;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p1}, Landroidx/camera/video/VideoEncoderSession;->getVideoEncoder()Landroidx/camera/video/internal/encoder/Encoder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Landroidx/camera/video/Recorder;->mVideoEncoder:Landroidx/camera/video/internal/encoder/Encoder;

    .line 6
    .line 7
    invoke-interface {v0}, Landroidx/camera/video/internal/encoder/Encoder;->getEncoderInfo()Landroidx/camera/video/internal/encoder/EncoderInfo;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroidx/camera/video/internal/encoder/VideoEncoderInfo;

    .line 12
    .line 13
    invoke-interface {v0}, Landroidx/camera/video/internal/encoder/VideoEncoderInfo;->getSupportedBitrateRange()Landroid/util/Range;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Landroidx/camera/video/Recorder;->mVideoEncoderBitrateRange:Landroid/util/Range;

    .line 18
    .line 19
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mVideoEncoder:Landroidx/camera/video/internal/encoder/Encoder;

    .line 20
    .line 21
    invoke-interface {v0}, Landroidx/camera/video/internal/encoder/Encoder;->getConfiguredBitrate()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iput v0, p0, Landroidx/camera/video/Recorder;->mFirstRecordingVideoBitrate:I

    .line 26
    .line 27
    invoke-virtual {p1}, Landroidx/camera/video/VideoEncoderSession;->getActiveSurface()Landroid/view/Surface;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Landroidx/camera/video/Recorder;->mActiveSurface:Landroid/view/Surface;

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Landroidx/camera/video/Recorder;->setLatestSurface(Landroid/view/Surface;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mSequentialExecutor:Ljava/util/concurrent/Executor;

    .line 37
    .line 38
    new-instance v1, Landroidx/camera/video/p;

    .line 39
    .line 40
    invoke-direct {v1, p0}, Landroidx/camera/video/p;-><init>(Landroidx/camera/video/Recorder;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v0, v1}, Landroidx/camera/video/VideoEncoderSession;->setOnSurfaceUpdateListener(Ljava/util/concurrent/Executor;Landroidx/camera/video/internal/encoder/Encoder$SurfaceInput$OnSurfaceUpdateListener;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Landroidx/camera/video/VideoEncoderSession;->getReadyToReleaseFuture()Lcom/google/common/util/concurrent/ListenableFuture;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    new-instance v1, Landroidx/camera/video/Recorder$1;

    .line 51
    .line 52
    invoke-direct {v1, p0, p1}, Landroidx/camera/video/Recorder$1;-><init>(Landroidx/camera/video/Recorder;Landroidx/camera/video/VideoEncoderSession;)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Landroidx/camera/video/Recorder;->mSequentialExecutor:Ljava/util/concurrent/Executor;

    .line 56
    .line 57
    invoke-static {v0, v1, p1}, Landroidx/camera/core/impl/utils/futures/Futures;->addCallback(Lcom/google/common/util/concurrent/ListenableFuture;Landroidx/camera/core/impl/utils/futures/FutureCallback;Ljava/util/concurrent/Executor;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public pause(Landroidx/camera/video/Recording;)V
    .locals 4
    .param p1    # Landroidx/camera/video/Recording;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mPendingRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 5
    .line 6
    invoke-static {p1, v1}, Landroidx/camera/video/Recorder;->isSameRecording(Landroidx/camera/video/Recording;Landroidx/camera/video/Recorder$RecordingRecord;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mActiveRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 13
    .line 14
    invoke-static {p1, v1}, Landroidx/camera/video/Recorder;->isSameRecording(Landroidx/camera/video/Recording;Landroidx/camera/video/Recorder$RecordingRecord;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    const-string v1, "Recorder"

    .line 21
    .line 22
    new-instance v2, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v3, "pause() called on a recording that is no longer active: "

    .line 28
    .line 29
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Landroidx/camera/video/Recording;->getOutputOptions()Landroidx/camera/video/OutputOptions;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {v1, p1}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    monitor-exit v0

    .line 47
    return-void

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    iget-object p1, p0, Landroidx/camera/video/Recorder;->mState:Landroidx/camera/video/Recorder$State;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_3

    .line 57
    .line 58
    const/4 v1, 0x1

    .line 59
    if-eq p1, v1, :cond_2

    .line 60
    .line 61
    const/4 v1, 0x3

    .line 62
    if-eq p1, v1, :cond_3

    .line 63
    .line 64
    const/4 v1, 0x4

    .line 65
    if-eq p1, v1, :cond_1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    sget-object p1, Landroidx/camera/video/Recorder$State;->PAUSED:Landroidx/camera/video/Recorder$State;

    .line 69
    .line 70
    invoke-virtual {p0, p1}, Landroidx/camera/video/Recorder;->setState(Landroidx/camera/video/Recorder$State;)V

    .line 71
    .line 72
    .line 73
    iget-object p1, p0, Landroidx/camera/video/Recorder;->mActiveRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 74
    .line 75
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mSequentialExecutor:Ljava/util/concurrent/Executor;

    .line 76
    .line 77
    new-instance v2, Landroidx/camera/video/o;

    .line 78
    .line 79
    invoke-direct {v2, p0, p1}, Landroidx/camera/video/o;-><init>(Landroidx/camera/video/Recorder;Landroidx/camera/video/Recorder$RecordingRecord;)V

    .line 80
    .line 81
    .line 82
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_2
    sget-object p1, Landroidx/camera/video/Recorder$State;->PENDING_PAUSED:Landroidx/camera/video/Recorder$State;

    .line 87
    .line 88
    invoke-virtual {p0, p1}, Landroidx/camera/video/Recorder;->setState(Landroidx/camera/video/Recorder$State;)V

    .line 89
    .line 90
    .line 91
    :goto_0
    monitor-exit v0

    .line 92
    return-void

    .line 93
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 94
    .line 95
    new-instance v1, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 98
    .line 99
    .line 100
    const-string v2, "Called pause() from invalid state: "

    .line 101
    .line 102
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    iget-object v2, p0, Landroidx/camera/video/Recorder;->mState:Landroidx/camera/video/Recorder$State;

    .line 106
    .line 107
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw p1

    .line 118
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    throw p1
.end method

.method public prepareRecording(Landroid/content/Context;Landroidx/camera/video/FileDescriptorOutputOptions;)Landroidx/camera/video/PendingRecording;
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/camera/video/FileDescriptorOutputOptions;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 3
    invoke-direct {p0, p1, p2}, Landroidx/camera/video/Recorder;->prepareRecordingInternal(Landroid/content/Context;Landroidx/camera/video/OutputOptions;)Landroidx/camera/video/PendingRecording;

    move-result-object p1

    return-object p1

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "File descriptors as output destinations are not supported on pre-Android O (API 26) devices."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public prepareRecording(Landroid/content/Context;Landroidx/camera/video/FileOutputOptions;)Landroidx/camera/video/PendingRecording;
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/camera/video/FileOutputOptions;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/camera/video/Recorder;->prepareRecordingInternal(Landroid/content/Context;Landroidx/camera/video/OutputOptions;)Landroidx/camera/video/PendingRecording;

    move-result-object p1

    return-object p1
.end method

.method public prepareRecording(Landroid/content/Context;Landroidx/camera/video/MediaStoreOutputOptions;)Landroidx/camera/video/PendingRecording;
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/camera/video/MediaStoreOutputOptions;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 5
    invoke-direct {p0, p1, p2}, Landroidx/camera/video/Recorder;->prepareRecordingInternal(Landroid/content/Context;Landroidx/camera/video/OutputOptions;)Landroidx/camera/video/PendingRecording;

    move-result-object p1

    return-object p1
.end method

.method public requestReset(ILjava/lang/Throwable;Z)V
    .locals 11
    .param p2    # Ljava/lang/Throwable;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mState:Landroidx/camera/video/Recorder$State;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v2, 0x1

    .line 11
    const/4 v3, 0x0

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    :pswitch_0
    goto :goto_0

    .line 16
    :pswitch_1
    sget-object v0, Landroidx/camera/video/Recorder$State;->RESETTING:Landroidx/camera/video/Recorder$State;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Landroidx/camera/video/Recorder;->setState(Landroidx/camera/video/Recorder$State;)V

    .line 19
    .line 20
    .line 21
    :goto_0
    move v2, v3

    .line 22
    goto :goto_2

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    move-object p1, v0

    .line 25
    goto :goto_3

    .line 26
    :pswitch_2
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mInProgressRecording:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    move v0, v2

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    move v0, v3

    .line 33
    :goto_1
    new-instance v4, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string v5, "In-progress recording shouldn\'t be null when in state "

    .line 39
    .line 40
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    iget-object v5, p0, Landroidx/camera/video/Recorder;->mState:Landroidx/camera/video/Recorder$State;

    .line 44
    .line 45
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-static {v0, v4}, Landroidx/core/util/Preconditions;->checkState(ZLjava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mActiveRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 56
    .line 57
    iget-object v4, p0, Landroidx/camera/video/Recorder;->mInProgressRecording:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 58
    .line 59
    if-ne v0, v4, :cond_2

    .line 60
    .line 61
    invoke-virtual {p0}, Landroidx/camera/video/Recorder;->isPersistentRecordingInProgress()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_1

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_1
    sget-object v0, Landroidx/camera/video/Recorder$State;->RESETTING:Landroidx/camera/video/Recorder$State;

    .line 69
    .line 70
    invoke-virtual {p0, v0}, Landroidx/camera/video/Recorder;->setState(Landroidx/camera/video/Recorder$State;)V

    .line 71
    .line 72
    .line 73
    move v10, v3

    .line 74
    move v3, v2

    .line 75
    move v2, v10

    .line 76
    goto :goto_2

    .line 77
    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    .line 78
    .line 79
    const-string p2, "In-progress recording does not match the active recording. Unable to reset encoder."

    .line 80
    .line 81
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    throw p1

    .line 85
    :pswitch_3
    sget-object v0, Landroidx/camera/video/Recorder$State;->RESETTING:Landroidx/camera/video/Recorder$State;

    .line 86
    .line 87
    invoke-direct {p0, v0}, Landroidx/camera/video/Recorder;->updateNonPendingState(Landroidx/camera/video/Recorder$State;)V

    .line 88
    .line 89
    .line 90
    :goto_2
    :pswitch_4
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    if-eqz v2, :cond_4

    .line 92
    .line 93
    if-eqz p3, :cond_3

    .line 94
    .line 95
    invoke-direct {p0}, Landroidx/camera/video/Recorder;->resetVideo()V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_3
    invoke-direct {p0}, Landroidx/camera/video/Recorder;->reset()V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :cond_4
    if-eqz v3, :cond_5

    .line 104
    .line 105
    iget-object v5, p0, Landroidx/camera/video/Recorder;->mInProgressRecording:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 106
    .line 107
    const-wide/16 v6, -0x1

    .line 108
    .line 109
    move-object v4, p0

    .line 110
    move v8, p1

    .line 111
    move-object v9, p2

    .line 112
    invoke-virtual/range {v4 .. v9}, Landroidx/camera/video/Recorder;->stopInternal(Landroidx/camera/video/Recorder$RecordingRecord;JILjava/lang/Throwable;)V

    .line 113
    .line 114
    .line 115
    :cond_5
    return-void

    .line 116
    :goto_3
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 117
    throw p1

    .line 118
    nop

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_4
    .end packed-switch
.end method

.method public resume(Landroidx/camera/video/Recording;)V
    .locals 4
    .param p1    # Landroidx/camera/video/Recording;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mPendingRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 5
    .line 6
    invoke-static {p1, v1}, Landroidx/camera/video/Recorder;->isSameRecording(Landroidx/camera/video/Recording;Landroidx/camera/video/Recorder$RecordingRecord;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mActiveRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 13
    .line 14
    invoke-static {p1, v1}, Landroidx/camera/video/Recorder;->isSameRecording(Landroidx/camera/video/Recording;Landroidx/camera/video/Recorder$RecordingRecord;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    const-string v1, "Recorder"

    .line 21
    .line 22
    new-instance v2, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v3, "resume() called on a recording that is no longer active: "

    .line 28
    .line 29
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Landroidx/camera/video/Recording;->getOutputOptions()Landroidx/camera/video/OutputOptions;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {v1, p1}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    monitor-exit v0

    .line 47
    return-void

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    iget-object p1, p0, Landroidx/camera/video/Recorder;->mState:Landroidx/camera/video/Recorder$State;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_3

    .line 57
    .line 58
    const/4 v1, 0x5

    .line 59
    if-eq p1, v1, :cond_2

    .line 60
    .line 61
    const/4 v1, 0x2

    .line 62
    if-eq p1, v1, :cond_1

    .line 63
    .line 64
    const/4 v1, 0x3

    .line 65
    if-eq p1, v1, :cond_3

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    sget-object p1, Landroidx/camera/video/Recorder$State;->PENDING_RECORDING:Landroidx/camera/video/Recorder$State;

    .line 69
    .line 70
    invoke-virtual {p0, p1}, Landroidx/camera/video/Recorder;->setState(Landroidx/camera/video/Recorder$State;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    sget-object p1, Landroidx/camera/video/Recorder$State;->RECORDING:Landroidx/camera/video/Recorder$State;

    .line 75
    .line 76
    invoke-virtual {p0, p1}, Landroidx/camera/video/Recorder;->setState(Landroidx/camera/video/Recorder$State;)V

    .line 77
    .line 78
    .line 79
    iget-object p1, p0, Landroidx/camera/video/Recorder;->mActiveRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 80
    .line 81
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mSequentialExecutor:Ljava/util/concurrent/Executor;

    .line 82
    .line 83
    new-instance v2, Landroidx/camera/video/g;

    .line 84
    .line 85
    invoke-direct {v2, p0, p1}, Landroidx/camera/video/g;-><init>(Landroidx/camera/video/Recorder;Landroidx/camera/video/Recorder$RecordingRecord;)V

    .line 86
    .line 87
    .line 88
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 89
    .line 90
    .line 91
    :goto_0
    monitor-exit v0

    .line 92
    return-void

    .line 93
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 94
    .line 95
    new-instance v1, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 98
    .line 99
    .line 100
    const-string v2, "Called resume() from invalid state: "

    .line 101
    .line 102
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    iget-object v2, p0, Landroidx/camera/video/Recorder;->mState:Landroidx/camera/video/Recorder$State;

    .line 106
    .line 107
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw p1

    .line 118
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    throw p1
.end method

.method public setAudioState(Landroidx/camera/video/Recorder$AudioState;)V
    .locals 2
    .param p1    # Landroidx/camera/video/Recorder$AudioState;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Transitioning audio state: "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mAudioState:Landroidx/camera/video/Recorder$AudioState;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, " --> "

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v1, "Recorder"

    .line 29
    .line 30
    invoke-static {v1, v0}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Landroidx/camera/video/Recorder;->mAudioState:Landroidx/camera/video/Recorder$AudioState;

    .line 34
    .line 35
    return-void
.end method

.method public setInProgressTransformationInfo(Landroidx/camera/core/SurfaceRequest$TransformationInfo;)V
    .locals 4
    .param p1    # Landroidx/camera/core/SurfaceRequest$TransformationInfo;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    const-string v0, "Recorder"

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "Update stream transformation info: "

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v0, v1}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Landroidx/camera/video/Recorder;->mInProgressTransformationInfo:Landroidx/camera/core/SurfaceRequest$TransformationInfo;

    .line 24
    .line 25
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mLock:Ljava/lang/Object;

    .line 26
    .line 27
    monitor-enter v0

    .line 28
    :try_start_0
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mStreamInfo:Landroidx/camera/core/impl/MutableStateObservable;

    .line 29
    .line 30
    iget v2, p0, Landroidx/camera/video/Recorder;->mStreamId:I

    .line 31
    .line 32
    iget-object v3, p0, Landroidx/camera/video/Recorder;->mState:Landroidx/camera/video/Recorder$State;

    .line 33
    .line 34
    invoke-direct {p0, v3}, Landroidx/camera/video/Recorder;->internalStateToStreamState(Landroidx/camera/video/Recorder$State;)Landroidx/camera/video/StreamInfo$StreamState;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-static {v2, v3, p1}, Landroidx/camera/video/StreamInfo;->of(ILandroidx/camera/video/StreamInfo$StreamState;Landroidx/camera/core/SurfaceRequest$TransformationInfo;)Landroidx/camera/video/StreamInfo;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {v1, p1}, Landroidx/camera/core/impl/MutableStateObservable;->setState(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    monitor-exit v0

    .line 46
    return-void

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    throw p1
.end method

.method public setLatestSurface(Landroid/view/Surface;)V
    .locals 1
    .param p1    # Landroid/view/Surface;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mLatestSurface:Landroid/view/Surface;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput-object p1, p0, Landroidx/camera/video/Recorder;->mLatestSurface:Landroid/view/Surface;

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mLock:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    const/4 p1, 0x0

    .line 21
    :goto_0
    invoke-direct {p0, p1}, Landroidx/camera/video/Recorder;->setStreamId(I)V

    .line 22
    .line 23
    .line 24
    monitor-exit v0

    .line 25
    return-void

    .line 26
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    throw p1
.end method

.method public setState(Landroidx/camera/video/Recorder$State;)V
    .locals 3
    .param p1    # Landroidx/camera/video/Recorder$State;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/GuardedBy;
        value = "mLock"
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mState:Landroidx/camera/video/Recorder$State;

    .line 2
    .line 3
    if-eq v0, p1, :cond_4

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v1, "Transitioning Recorder internal state: "

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mState:Landroidx/camera/video/Recorder$State;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, " --> "

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v1, "Recorder"

    .line 33
    .line 34
    invoke-static {v1, v0}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    sget-object v0, Landroidx/camera/video/Recorder;->PENDING_STATES:Ljava/util/Set;

    .line 38
    .line 39
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const/4 v2, 0x0

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mState:Landroidx/camera/video/Recorder$State;

    .line 47
    .line 48
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_2

    .line 53
    .line 54
    sget-object v0, Landroidx/camera/video/Recorder;->VALID_NON_PENDING_STATES_WHILE_PENDING:Ljava/util/Set;

    .line 55
    .line 56
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mState:Landroidx/camera/video/Recorder$State;

    .line 57
    .line 58
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_0

    .line 63
    .line 64
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mState:Landroidx/camera/video/Recorder$State;

    .line 65
    .line 66
    iput-object v0, p0, Landroidx/camera/video/Recorder;->mNonPendingState:Landroidx/camera/video/Recorder$State;

    .line 67
    .line 68
    invoke-direct {p0, v0}, Landroidx/camera/video/Recorder;->internalStateToStreamState(Landroidx/camera/video/Recorder$State;)Landroidx/camera/video/StreamInfo$StreamState;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    goto :goto_0

    .line 73
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    .line 74
    .line 75
    new-instance v0, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    const-string v1, "Invalid state transition. Should not be transitioning to a PENDING state from state "

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mState:Landroidx/camera/video/Recorder$State;

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    throw p1

    .line 98
    :cond_1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mNonPendingState:Landroidx/camera/video/Recorder$State;

    .line 99
    .line 100
    if-eqz v0, :cond_2

    .line 101
    .line 102
    iput-object v2, p0, Landroidx/camera/video/Recorder;->mNonPendingState:Landroidx/camera/video/Recorder$State;

    .line 103
    .line 104
    :cond_2
    :goto_0
    iput-object p1, p0, Landroidx/camera/video/Recorder;->mState:Landroidx/camera/video/Recorder$State;

    .line 105
    .line 106
    if-nez v2, :cond_3

    .line 107
    .line 108
    invoke-direct {p0, p1}, Landroidx/camera/video/Recorder;->internalStateToStreamState(Landroidx/camera/video/Recorder$State;)Landroidx/camera/video/StreamInfo$StreamState;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    :cond_3
    iget-object p1, p0, Landroidx/camera/video/Recorder;->mStreamInfo:Landroidx/camera/core/impl/MutableStateObservable;

    .line 113
    .line 114
    iget v0, p0, Landroidx/camera/video/Recorder;->mStreamId:I

    .line 115
    .line 116
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mInProgressTransformationInfo:Landroidx/camera/core/SurfaceRequest$TransformationInfo;

    .line 117
    .line 118
    invoke-static {v0, v2, v1}, Landroidx/camera/video/StreamInfo;->of(ILandroidx/camera/video/StreamInfo$StreamState;Landroidx/camera/core/SurfaceRequest$TransformationInfo;)Landroidx/camera/video/StreamInfo;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/MutableStateObservable;->setState(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :cond_4
    new-instance v0, Ljava/lang/AssertionError;

    .line 127
    .line 128
    new-instance v1, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 131
    .line 132
    .line 133
    const-string v2, "Attempted to transition to state "

    .line 134
    .line 135
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    const-string v2, ", but Recorder is already in state "

    .line 142
    .line 143
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    throw v0
.end method

.method public setupAndStartMediaMuxer(Landroidx/camera/video/Recorder$RecordingRecord;)V
    .locals 9
    .param p1    # Landroidx/camera/video/Recorder$RecordingRecord;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mMediaMuxer:Landroid/media/MediaMuxer;

    .line 2
    .line 3
    if-nez v0, :cond_b

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/camera/video/Recorder;->isAudioEnabled()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mPendingAudioRingBuffer:Landroidx/camera/core/internal/utils/RingBuffer;

    .line 12
    .line 13
    invoke-interface {v0}, Landroidx/camera/core/internal/utils/RingBuffer;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    .line 21
    .line 22
    const-string v0, "Audio is enabled but no audio sample is ready. Cannot start media muxer."

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mPendingFirstVideoData:Landroidx/camera/video/internal/encoder/EncodedData;

    .line 29
    .line 30
    if-eqz v0, :cond_a

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    :try_start_0
    iput-object v1, p0, Landroidx/camera/video/Recorder;->mPendingFirstVideoData:Landroidx/camera/video/internal/encoder/EncodedData;

    .line 34
    .line 35
    invoke-interface {v0}, Landroidx/camera/video/internal/encoder/EncodedData;->getPresentationTimeUs()J

    .line 36
    .line 37
    .line 38
    move-result-wide v2

    .line 39
    invoke-direct {p0, v2, v3}, Landroidx/camera/video/Recorder;->getAudioDataToWriteAndClearCache(J)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-interface {v0}, Landroidx/camera/video/internal/encoder/EncodedData;->size()J

    .line 44
    .line 45
    .line 46
    move-result-wide v3

    .line 47
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-eqz v6, :cond_2

    .line 56
    .line 57
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    check-cast v6, Landroidx/camera/video/internal/encoder/EncodedData;

    .line 62
    .line 63
    invoke-interface {v6}, Landroidx/camera/video/internal/encoder/EncodedData;->size()J

    .line 64
    .line 65
    .line 66
    move-result-wide v6

    .line 67
    add-long/2addr v3, v6

    .line 68
    goto :goto_1

    .line 69
    :catchall_0
    move-exception p1

    .line 70
    goto/16 :goto_6

    .line 71
    .line 72
    :cond_2
    iget-wide v5, p0, Landroidx/camera/video/Recorder;->mFileSizeLimitInBytes:J

    .line 73
    .line 74
    const-wide/16 v7, 0x0

    .line 75
    .line 76
    cmp-long v7, v5, v7

    .line 77
    .line 78
    if-eqz v7, :cond_3

    .line 79
    .line 80
    cmp-long v5, v3, v5

    .line 81
    .line 82
    if-lez v5, :cond_3

    .line 83
    .line 84
    const-string v2, "Recorder"

    .line 85
    .line 86
    const-string v5, "Initial data exceeds file size limit %d > %d"

    .line 87
    .line 88
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    iget-wide v6, p0, Landroidx/camera/video/Recorder;->mFileSizeLimitInBytes:J

    .line 93
    .line 94
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    filled-new-array {v3, v4}, [Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-static {v5, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-static {v2, v3}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    const/4 v2, 0x2

    .line 110
    invoke-virtual {p0, p1, v2, v1}, Landroidx/camera/video/Recorder;->onInProgressRecordingInternalError(Landroidx/camera/video/Recorder$RecordingRecord;ILjava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    .line 112
    .line 113
    invoke-interface {v0}, Landroidx/camera/video/internal/encoder/EncodedData;->close()V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :cond_3
    const/4 v1, 0x5

    .line 118
    :try_start_1
    iget-object v3, p0, Landroidx/camera/video/Recorder;->mMediaSpec:Landroidx/camera/core/impl/MutableStateObservable;

    .line 119
    .line 120
    invoke-virtual {p0, v3}, Landroidx/camera/video/Recorder;->getObservableData(Landroidx/camera/core/impl/StateObservable;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    check-cast v3, Landroidx/camera/video/MediaSpec;

    .line 125
    .line 126
    invoke-virtual {v3}, Landroidx/camera/video/MediaSpec;->getOutputFormat()I

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    const/4 v5, -0x1

    .line 131
    if-ne v4, v5, :cond_4

    .line 132
    .line 133
    iget-object v3, p0, Landroidx/camera/video/Recorder;->mResolvedEncoderProfiles:Landroidx/camera/video/internal/VideoValidatedEncoderProfilesProxy;

    .line 134
    .line 135
    sget-object v4, Landroidx/camera/video/Recorder;->MEDIA_SPEC_DEFAULT:Landroidx/camera/video/MediaSpec;

    .line 136
    .line 137
    invoke-virtual {v4}, Landroidx/camera/video/MediaSpec;->getOutputFormat()I

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    invoke-static {v4}, Landroidx/camera/video/MediaSpec;->outputFormatToMuxerFormat(I)I

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    invoke-static {v3, v4}, Landroidx/camera/video/Recorder;->supportedMuxerFormatOrDefaultFrom(Landroidx/camera/video/internal/VideoValidatedEncoderProfilesProxy;I)I

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    goto :goto_2

    .line 150
    :catch_0
    move-exception v2

    .line 151
    goto/16 :goto_5

    .line 152
    .line 153
    :cond_4
    invoke-virtual {v3}, Landroidx/camera/video/MediaSpec;->getOutputFormat()I

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    invoke-static {v3}, Landroidx/camera/video/MediaSpec;->outputFormatToMuxerFormat(I)I

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    :goto_2
    new-instance v4, Landroidx/camera/video/q;

    .line 162
    .line 163
    invoke-direct {v4, p0}, Landroidx/camera/video/q;-><init>(Landroidx/camera/video/Recorder;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1, v3, v4}, Landroidx/camera/video/Recorder$RecordingRecord;->performOneTimeMediaMuxerCreation(ILandroidx/core/util/Consumer;)Landroid/media/MediaMuxer;

    .line 167
    .line 168
    .line 169
    move-result-object v3
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 170
    :try_start_2
    iget-object v4, p0, Landroidx/camera/video/Recorder;->mSourceTransformationInfo:Landroidx/camera/core/SurfaceRequest$TransformationInfo;

    .line 171
    .line 172
    if-eqz v4, :cond_5

    .line 173
    .line 174
    invoke-virtual {p0, v4}, Landroidx/camera/video/Recorder;->setInProgressTransformationInfo(Landroidx/camera/core/SurfaceRequest$TransformationInfo;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v4}, Landroidx/camera/core/SurfaceRequest$TransformationInfo;->getRotationDegrees()I

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    invoke-virtual {v3, v4}, Landroid/media/MediaMuxer;->setOrientationHint(I)V

    .line 182
    .line 183
    .line 184
    :cond_5
    invoke-virtual {p1}, Landroidx/camera/video/Recorder$RecordingRecord;->getOutputOptions()Landroidx/camera/video/OutputOptions;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    invoke-virtual {v4}, Landroidx/camera/video/OutputOptions;->getLocation()Landroid/location/Location;

    .line 189
    .line 190
    .line 191
    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 192
    if-eqz v4, :cond_6

    .line 193
    .line 194
    :try_start_3
    invoke-virtual {v4}, Landroid/location/Location;->getLatitude()D

    .line 195
    .line 196
    .line 197
    move-result-wide v5

    .line 198
    invoke-virtual {v4}, Landroid/location/Location;->getLongitude()D

    .line 199
    .line 200
    .line 201
    move-result-wide v7

    .line 202
    invoke-static {v5, v6, v7, v8}, Landroidx/camera/video/internal/workaround/CorrectNegativeLatLongForMediaMuxer;->adjustGeoLocation(DD)Landroid/util/Pair;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    iget-object v5, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v5, Ljava/lang/Double;

    .line 209
    .line 210
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    .line 211
    .line 212
    .line 213
    move-result-wide v5

    .line 214
    double-to-float v5, v5

    .line 215
    iget-object v4, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v4, Ljava/lang/Double;

    .line 218
    .line 219
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 220
    .line 221
    .line 222
    move-result-wide v6

    .line 223
    double-to-float v4, v6

    .line 224
    invoke-virtual {v3, v5, v4}, Landroid/media/MediaMuxer;->setLocation(FF)V
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 225
    .line 226
    .line 227
    goto :goto_3

    .line 228
    :catch_1
    move-exception v2

    .line 229
    :try_start_4
    invoke-virtual {v3}, Landroid/media/MediaMuxer;->release()V

    .line 230
    .line 231
    .line 232
    invoke-virtual {p0, p1, v1, v2}, Landroidx/camera/video/Recorder;->onInProgressRecordingInternalError(Landroidx/camera/video/Recorder$RecordingRecord;ILjava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 233
    .line 234
    .line 235
    invoke-interface {v0}, Landroidx/camera/video/internal/encoder/EncodedData;->close()V

    .line 236
    .line 237
    .line 238
    return-void

    .line 239
    :cond_6
    :goto_3
    :try_start_5
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mVideoOutputConfig:Landroidx/camera/video/internal/encoder/OutputConfig;

    .line 240
    .line 241
    invoke-interface {v1}, Landroidx/camera/video/internal/encoder/OutputConfig;->getMediaFormat()Landroid/media/MediaFormat;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    invoke-virtual {v3, v1}, Landroid/media/MediaMuxer;->addTrack(Landroid/media/MediaFormat;)I

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    iput-object v1, p0, Landroidx/camera/video/Recorder;->mVideoTrackIndex:Ljava/lang/Integer;

    .line 254
    .line 255
    invoke-virtual {p0}, Landroidx/camera/video/Recorder;->isAudioEnabled()Z

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    if-eqz v1, :cond_7

    .line 260
    .line 261
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mAudioOutputConfig:Landroidx/camera/video/internal/encoder/OutputConfig;

    .line 262
    .line 263
    invoke-interface {v1}, Landroidx/camera/video/internal/encoder/OutputConfig;->getMediaFormat()Landroid/media/MediaFormat;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    invoke-virtual {v3, v1}, Landroid/media/MediaMuxer;->addTrack(Landroid/media/MediaFormat;)I

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    iput-object v1, p0, Landroidx/camera/video/Recorder;->mAudioTrackIndex:Ljava/lang/Integer;

    .line 276
    .line 277
    :cond_7
    invoke-virtual {v3}, Landroid/media/MediaMuxer;->start()V

    .line 278
    .line 279
    .line 280
    iput-object v3, p0, Landroidx/camera/video/Recorder;->mMediaMuxer:Landroid/media/MediaMuxer;

    .line 281
    .line 282
    invoke-virtual {p0, v0, p1}, Landroidx/camera/video/Recorder;->writeVideoData(Landroidx/camera/video/internal/encoder/EncodedData;Landroidx/camera/video/Recorder$RecordingRecord;)V

    .line 283
    .line 284
    .line 285
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 290
    .line 291
    .line 292
    move-result v2

    .line 293
    if-eqz v2, :cond_8

    .line 294
    .line 295
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    check-cast v2, Landroidx/camera/video/internal/encoder/EncodedData;

    .line 300
    .line 301
    invoke-virtual {p0, v2, p1}, Landroidx/camera/video/Recorder;->writeAudioData(Landroidx/camera/video/internal/encoder/EncodedData;Landroidx/camera/video/Recorder$RecordingRecord;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 302
    .line 303
    .line 304
    goto :goto_4

    .line 305
    :cond_8
    invoke-interface {v0}, Landroidx/camera/video/internal/encoder/EncodedData;->close()V

    .line 306
    .line 307
    .line 308
    return-void

    .line 309
    :goto_5
    :try_start_6
    invoke-virtual {p0, p1, v1, v2}, Landroidx/camera/video/Recorder;->onInProgressRecordingInternalError(Landroidx/camera/video/Recorder$RecordingRecord;ILjava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 310
    .line 311
    .line 312
    invoke-interface {v0}, Landroidx/camera/video/internal/encoder/EncodedData;->close()V

    .line 313
    .line 314
    .line 315
    return-void

    .line 316
    :goto_6
    if-eqz v0, :cond_9

    .line 317
    .line 318
    :try_start_7
    invoke-interface {v0}, Landroidx/camera/video/internal/encoder/EncodedData;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 319
    .line 320
    .line 321
    goto :goto_7

    .line 322
    :catchall_1
    move-exception v0

    .line 323
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 324
    .line 325
    .line 326
    :cond_9
    :goto_7
    throw p1

    .line 327
    :cond_a
    new-instance p1, Ljava/lang/AssertionError;

    .line 328
    .line 329
    const-string v0, "Media muxer cannot be started without an encoded video frame."

    .line 330
    .line 331
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    throw p1

    .line 335
    :cond_b
    new-instance p1, Ljava/lang/AssertionError;

    .line 336
    .line 337
    const-string v0, "Unable to set up media muxer when one already exists."

    .line 338
    .line 339
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 340
    .line 341
    .line 342
    throw p1
.end method

.method public start(Landroidx/camera/video/PendingRecording;)Landroidx/camera/video/Recording;
    .locals 9
    .param p1    # Landroidx/camera/video/PendingRecording;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    const-string v0, "The given PendingRecording cannot be null."

    .line 2
    .line 3
    invoke-static {p1, v0}, Landroidx/core/util/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mLock:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-wide v1, p0, Landroidx/camera/video/Recorder;->mLastGeneratedRecordingId:J

    .line 10
    .line 11
    const-wide/16 v3, 0x1

    .line 12
    .line 13
    add-long/2addr v1, v3

    .line 14
    iput-wide v1, p0, Landroidx/camera/video/Recorder;->mLastGeneratedRecordingId:J

    .line 15
    .line 16
    iget-object v3, p0, Landroidx/camera/video/Recorder;->mState:Landroidx/camera/video/Recorder$State;

    .line 17
    .line 18
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const/4 v4, 0x0

    .line 23
    const/4 v5, 0x0

    .line 24
    packed-switch v3, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    goto/16 :goto_2

    .line 28
    .line 29
    :pswitch_0
    iget-object v3, p0, Landroidx/camera/video/Recorder;->mActiveRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 30
    .line 31
    :goto_0
    move-object v8, v4

    .line 32
    move-object v4, v3

    .line 33
    move-object v3, v8

    .line 34
    goto :goto_4

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    goto/16 :goto_5

    .line 37
    .line 38
    :pswitch_1
    iget-object v3, p0, Landroidx/camera/video/Recorder;->mPendingRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 39
    .line 40
    invoke-static {v3}, Landroidx/core/util/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, Landroidx/camera/video/Recorder$RecordingRecord;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :pswitch_2
    iget-object v3, p0, Landroidx/camera/video/Recorder;->mState:Landroidx/camera/video/Recorder$State;

    .line 48
    .line 49
    sget-object v6, Landroidx/camera/video/Recorder$State;->IDLING:Landroidx/camera/video/Recorder$State;

    .line 50
    .line 51
    if-ne v3, v6, :cond_1

    .line 52
    .line 53
    iget-object v3, p0, Landroidx/camera/video/Recorder;->mActiveRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 54
    .line 55
    if-nez v3, :cond_0

    .line 56
    .line 57
    iget-object v3, p0, Landroidx/camera/video/Recorder;->mPendingRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 58
    .line 59
    if-nez v3, :cond_0

    .line 60
    .line 61
    const/4 v3, 0x1

    .line 62
    goto :goto_1

    .line 63
    :cond_0
    move v3, v5

    .line 64
    :goto_1
    const-string v7, "Expected recorder to be idle but a recording is either pending or in progress."

    .line 65
    .line 66
    invoke-static {v3, v7}, Landroidx/core/util/Preconditions;->checkState(ZLjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    .line 69
    :cond_1
    :try_start_1
    invoke-static {p1, v1, v2}, Landroidx/camera/video/Recorder$RecordingRecord;->from(Landroidx/camera/video/PendingRecording;J)Landroidx/camera/video/Recorder$RecordingRecord;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-virtual {p1}, Landroidx/camera/video/PendingRecording;->getApplicationContext()Landroid/content/Context;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    invoke-virtual {v3, v7}, Landroidx/camera/video/Recorder$RecordingRecord;->initializeRecording(Landroid/content/Context;)V

    .line 78
    .line 79
    .line 80
    iput-object v3, p0, Landroidx/camera/video/Recorder;->mPendingRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 81
    .line 82
    iget-object v3, p0, Landroidx/camera/video/Recorder;->mState:Landroidx/camera/video/Recorder$State;

    .line 83
    .line 84
    if-ne v3, v6, :cond_2

    .line 85
    .line 86
    sget-object v3, Landroidx/camera/video/Recorder$State;->PENDING_RECORDING:Landroidx/camera/video/Recorder$State;

    .line 87
    .line 88
    invoke-virtual {p0, v3}, Landroidx/camera/video/Recorder;->setState(Landroidx/camera/video/Recorder$State;)V

    .line 89
    .line 90
    .line 91
    iget-object v3, p0, Landroidx/camera/video/Recorder;->mSequentialExecutor:Ljava/util/concurrent/Executor;

    .line 92
    .line 93
    new-instance v6, Landroidx/camera/video/l;

    .line 94
    .line 95
    invoke-direct {v6, p0}, Landroidx/camera/video/l;-><init>(Landroidx/camera/video/Recorder;)V

    .line 96
    .line 97
    .line 98
    invoke-interface {v3, v6}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 99
    .line 100
    .line 101
    goto :goto_2

    .line 102
    :catch_0
    move-exception v3

    .line 103
    goto :goto_3

    .line 104
    :cond_2
    sget-object v6, Landroidx/camera/video/Recorder$State;->ERROR:Landroidx/camera/video/Recorder$State;

    .line 105
    .line 106
    if-ne v3, v6, :cond_3

    .line 107
    .line 108
    sget-object v3, Landroidx/camera/video/Recorder$State;->PENDING_RECORDING:Landroidx/camera/video/Recorder$State;

    .line 109
    .line 110
    invoke-virtual {p0, v3}, Landroidx/camera/video/Recorder;->setState(Landroidx/camera/video/Recorder$State;)V

    .line 111
    .line 112
    .line 113
    iget-object v3, p0, Landroidx/camera/video/Recorder;->mSequentialExecutor:Ljava/util/concurrent/Executor;

    .line 114
    .line 115
    new-instance v6, Landroidx/camera/video/m;

    .line 116
    .line 117
    invoke-direct {v6, p0}, Landroidx/camera/video/m;-><init>(Landroidx/camera/video/Recorder;)V

    .line 118
    .line 119
    .line 120
    invoke-interface {v3, v6}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_3
    sget-object v3, Landroidx/camera/video/Recorder$State;->PENDING_RECORDING:Landroidx/camera/video/Recorder$State;

    .line 125
    .line 126
    invoke-virtual {p0, v3}, Landroidx/camera/video/Recorder;->setState(Landroidx/camera/video/Recorder$State;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 127
    .line 128
    .line 129
    :goto_2
    move-object v3, v4

    .line 130
    goto :goto_4

    .line 131
    :goto_3
    const/4 v5, 0x5

    .line 132
    :goto_4
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 133
    if-nez v4, :cond_5

    .line 134
    .line 135
    if-eqz v5, :cond_4

    .line 136
    .line 137
    const-string v0, "Recorder"

    .line 138
    .line 139
    new-instance v4, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 142
    .line 143
    .line 144
    const-string v6, "Recording was started when the Recorder had encountered error "

    .line 145
    .line 146
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    invoke-static {v0, v4}, Landroidx/camera/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    invoke-static {p1, v1, v2}, Landroidx/camera/video/Recorder$RecordingRecord;->from(Landroidx/camera/video/PendingRecording;J)Landroidx/camera/video/Recorder$RecordingRecord;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-direct {p0, v0, v5, v3}, Landroidx/camera/video/Recorder;->finalizePendingRecording(Landroidx/camera/video/Recorder$RecordingRecord;ILjava/lang/Throwable;)V

    .line 164
    .line 165
    .line 166
    invoke-static {p1, v1, v2}, Landroidx/camera/video/Recording;->createFinalizedFrom(Landroidx/camera/video/PendingRecording;J)Landroidx/camera/video/Recording;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    return-object p1

    .line 171
    :cond_4
    invoke-static {p1, v1, v2}, Landroidx/camera/video/Recording;->from(Landroidx/camera/video/PendingRecording;J)Landroidx/camera/video/Recording;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    return-object p1

    .line 176
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 177
    .line 178
    const-string v0, "A recording is already in progress. Previous recordings must be stopped before a new recording can be started."

    .line 179
    .line 180
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    throw p1

    .line 184
    :goto_5
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 185
    throw p1

    .line 186
    nop

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method public stop(Landroidx/camera/video/Recording;ILjava/lang/Throwable;)V
    .locals 12
    .param p1    # Landroidx/camera/video/Recording;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Throwable;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mPendingRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 5
    .line 6
    invoke-static {p1, v0}, Landroidx/camera/video/Recorder;->isSameRecording(Landroidx/camera/video/Recording;Landroidx/camera/video/Recorder$RecordingRecord;)Z

    .line 7
    .line 8
    .line 9
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    :try_start_1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mActiveRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 13
    .line 14
    invoke-static {p1, v0}, Landroidx/camera/video/Recorder;->isSameRecording(Landroidx/camera/video/Recording;Landroidx/camera/video/Recorder$RecordingRecord;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    const-string p2, "Recorder"

    .line 21
    .line 22
    new-instance p3, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v0, "stop() called on a recording that is no longer active: "

    .line 28
    .line 29
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Landroidx/camera/video/Recording;->getOutputOptions()Landroidx/camera/video/OutputOptions;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {p2, p1}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    return-void

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    move-object p1, v0

    .line 50
    move-object v6, p0

    .line 51
    goto/16 :goto_3

    .line 52
    .line 53
    :cond_0
    :try_start_2
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mState:Landroidx/camera/video/Recorder$State;

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 56
    .line 57
    .line 58
    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 59
    const/4 v2, 0x0

    .line 60
    packed-switch v0, :pswitch_data_0

    .line 61
    .line 62
    .line 63
    :goto_0
    move-object v6, p0

    .line 64
    move v10, p2

    .line 65
    move-object v11, p3

    .line 66
    goto :goto_2

    .line 67
    :pswitch_0
    :try_start_3
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mActiveRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 68
    .line 69
    invoke-static {p1, v0}, Landroidx/camera/video/Recorder;->isSameRecording(Landroidx/camera/video/Recording;Landroidx/camera/video/Recorder$RecordingRecord;)Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    invoke-static {p1}, Landroidx/core/util/Preconditions;->checkState(Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :pswitch_1
    :try_start_4
    sget-object p1, Landroidx/camera/video/Recorder$State;->STOPPING:Landroidx/camera/video/Recorder$State;

    .line 78
    .line 79
    invoke-virtual {p0, p1}, Landroidx/camera/video/Recorder;->setState(Landroidx/camera/video/Recorder$State;)V

    .line 80
    .line 81
    .line 82
    sget-object p1, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 83
    .line 84
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 85
    .line 86
    .line 87
    move-result-wide v3

    .line 88
    invoke-virtual {p1, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMicros(J)J

    .line 89
    .line 90
    .line 91
    move-result-wide v8

    .line 92
    iget-object v7, p0, Landroidx/camera/video/Recorder;->mActiveRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 93
    .line 94
    iget-object p1, p0, Landroidx/camera/video/Recorder;->mSequentialExecutor:Ljava/util/concurrent/Executor;

    .line 95
    .line 96
    new-instance v5, Landroidx/camera/video/t;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 97
    .line 98
    move-object v6, p0

    .line 99
    move v10, p2

    .line 100
    move-object v11, p3

    .line 101
    :try_start_5
    invoke-direct/range {v5 .. v11}, Landroidx/camera/video/t;-><init>(Landroidx/camera/video/Recorder;Landroidx/camera/video/Recorder$RecordingRecord;JILjava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    invoke-interface {p1, v5}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 105
    .line 106
    .line 107
    goto :goto_2

    .line 108
    :catchall_1
    move-exception v0

    .line 109
    :goto_1
    move-object p1, v0

    .line 110
    goto :goto_3

    .line 111
    :catchall_2
    move-exception v0

    .line 112
    move-object v6, p0

    .line 113
    goto :goto_1

    .line 114
    :pswitch_2
    move-object v6, p0

    .line 115
    move v10, p2

    .line 116
    move-object v11, p3

    .line 117
    iget-object p2, v6, Landroidx/camera/video/Recorder;->mPendingRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 118
    .line 119
    invoke-static {p1, p2}, Landroidx/camera/video/Recorder;->isSameRecording(Landroidx/camera/video/Recording;Landroidx/camera/video/Recorder$RecordingRecord;)Z

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    invoke-static {p1}, Landroidx/core/util/Preconditions;->checkState(Z)V

    .line 124
    .line 125
    .line 126
    iget-object p1, v6, Landroidx/camera/video/Recorder;->mPendingRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 127
    .line 128
    iput-object v2, v6, Landroidx/camera/video/Recorder;->mPendingRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 129
    .line 130
    invoke-direct {p0}, Landroidx/camera/video/Recorder;->restoreNonPendingState()V

    .line 131
    .line 132
    .line 133
    move-object v2, p1

    .line 134
    :goto_2
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 135
    if-eqz v2, :cond_2

    .line 136
    .line 137
    const/16 p1, 0xa

    .line 138
    .line 139
    if-ne v10, p1, :cond_1

    .line 140
    .line 141
    const-string p1, "Recorder"

    .line 142
    .line 143
    const-string p2, "Recording was stopped due to recording being garbage collected before any valid data has been produced."

    .line 144
    .line 145
    invoke-static {p1, p2}, Landroidx/camera/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    .line 149
    .line 150
    const-string p2, "Recording was stopped before any data could be produced."

    .line 151
    .line 152
    invoke-direct {p1, p2, v11}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 153
    .line 154
    .line 155
    const/16 p2, 0x8

    .line 156
    .line 157
    invoke-direct {p0, v2, p2, p1}, Landroidx/camera/video/Recorder;->finalizePendingRecording(Landroidx/camera/video/Recorder$RecordingRecord;ILjava/lang/Throwable;)V

    .line 158
    .line 159
    .line 160
    :cond_2
    return-void

    .line 161
    :pswitch_3
    move-object v6, p0

    .line 162
    :try_start_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 163
    .line 164
    const-string p2, "Calling stop() while idling or initializing is invalid."

    .line 165
    .line 166
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    throw p1

    .line 170
    :goto_3
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 171
    throw p1

    .line 172
    nop

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public stopInternal(Landroidx/camera/video/Recorder$RecordingRecord;JILjava/lang/Throwable;)V
    .locals 2
    .param p1    # Landroidx/camera/video/Recorder$RecordingRecord;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Ljava/lang/Throwable;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mInProgressRecording:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 2
    .line 3
    if-ne v0, p1, :cond_3

    .line 4
    .line 5
    iget-boolean p1, p0, Landroidx/camera/video/Recorder;->mInProgressRecordingStopping:Z

    .line 6
    .line 7
    if-nez p1, :cond_3

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Landroidx/camera/video/Recorder;->mInProgressRecordingStopping:Z

    .line 11
    .line 12
    iput p4, p0, Landroidx/camera/video/Recorder;->mRecordingStopError:I

    .line 13
    .line 14
    iput-object p5, p0, Landroidx/camera/video/Recorder;->mRecordingStopErrorCause:Ljava/lang/Throwable;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/camera/video/Recorder;->isAudioEnabled()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-direct {p0}, Landroidx/camera/video/Recorder;->clearPendingAudioRingBuffer()V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Landroidx/camera/video/Recorder;->mAudioEncoder:Landroidx/camera/video/internal/encoder/Encoder;

    .line 26
    .line 27
    invoke-interface {p1, p2, p3}, Landroidx/camera/video/internal/encoder/Encoder;->stop(J)V

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-object p1, p0, Landroidx/camera/video/Recorder;->mPendingFirstVideoData:Landroidx/camera/video/internal/encoder/EncodedData;

    .line 31
    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    invoke-interface {p1}, Landroidx/camera/video/internal/encoder/EncodedData;->close()V

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    iput-object p1, p0, Landroidx/camera/video/Recorder;->mPendingFirstVideoData:Landroidx/camera/video/internal/encoder/EncodedData;

    .line 39
    .line 40
    :cond_1
    iget-object p1, p0, Landroidx/camera/video/Recorder;->mSourceState:Landroidx/camera/video/VideoOutput$SourceState;

    .line 41
    .line 42
    sget-object p4, Landroidx/camera/video/VideoOutput$SourceState;->ACTIVE_NON_STREAMING:Landroidx/camera/video/VideoOutput$SourceState;

    .line 43
    .line 44
    if-eq p1, p4, :cond_2

    .line 45
    .line 46
    iget-object p1, p0, Landroidx/camera/video/Recorder;->mVideoEncoder:Landroidx/camera/video/internal/encoder/Encoder;

    .line 47
    .line 48
    new-instance p4, Landroidx/camera/video/s;

    .line 49
    .line 50
    invoke-direct {p4, p1}, Landroidx/camera/video/s;-><init>(Landroidx/camera/video/internal/encoder/Encoder;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Landroidx/camera/video/Recorder;->mSequentialExecutor:Ljava/util/concurrent/Executor;

    .line 54
    .line 55
    const-wide/16 v0, 0x3e8

    .line 56
    .line 57
    sget-object p5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 58
    .line 59
    invoke-static {p4, p1, v0, v1, p5}, Landroidx/camera/video/Recorder;->scheduleTask(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iput-object p1, p0, Landroidx/camera/video/Recorder;->mSourceNonStreamingTimeout:Ljava/util/concurrent/ScheduledFuture;

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    iget-object p1, p0, Landroidx/camera/video/Recorder;->mVideoEncoder:Landroidx/camera/video/internal/encoder/Encoder;

    .line 67
    .line 68
    invoke-static {p1}, Landroidx/camera/video/Recorder;->notifyEncoderSourceStopped(Landroidx/camera/video/internal/encoder/Encoder;)V

    .line 69
    .line 70
    .line 71
    :goto_0
    iget-object p1, p0, Landroidx/camera/video/Recorder;->mVideoEncoder:Landroidx/camera/video/internal/encoder/Encoder;

    .line 72
    .line 73
    invoke-interface {p1, p2, p3}, Landroidx/camera/video/internal/encoder/Encoder;->stop(J)V

    .line 74
    .line 75
    .line 76
    :cond_3
    return-void
.end method

.method public tryServicePendingRecording()V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mState:Landroidx/camera/video/Recorder$State;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    if-eq v1, v2, :cond_0

    .line 14
    .line 15
    const/4 v5, 0x2

    .line 16
    if-eq v1, v5, :cond_1

    .line 17
    .line 18
    move v5, v3

    .line 19
    move-object v1, v4

    .line 20
    :goto_0
    move-object v2, v1

    .line 21
    goto :goto_2

    .line 22
    :cond_0
    move v2, v3

    .line 23
    :cond_1
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mActiveRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 24
    .line 25
    if-nez v1, :cond_4

    .line 26
    .line 27
    iget-boolean v1, p0, Landroidx/camera/video/Recorder;->mNeedsResetBeforeNextStart:Z

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mSourceState:Landroidx/camera/video/VideoOutput$SourceState;

    .line 33
    .line 34
    sget-object v5, Landroidx/camera/video/VideoOutput$SourceState;->INACTIVE:Landroidx/camera/video/VideoOutput$SourceState;

    .line 35
    .line 36
    if-ne v1, v5, :cond_3

    .line 37
    .line 38
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mPendingRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 39
    .line 40
    iput-object v4, p0, Landroidx/camera/video/Recorder;->mPendingRecordingRecord:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 41
    .line 42
    invoke-direct {p0}, Landroidx/camera/video/Recorder;->restoreNonPendingState()V

    .line 43
    .line 44
    .line 45
    sget-object v3, Landroidx/camera/video/Recorder;->PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE:Ljava/lang/Exception;

    .line 46
    .line 47
    const/4 v5, 0x4

    .line 48
    move-object v6, v3

    .line 49
    move v3, v2

    .line 50
    move-object v2, v6

    .line 51
    goto :goto_2

    .line 52
    :catchall_0
    move-exception v1

    .line 53
    goto :goto_3

    .line 54
    :cond_3
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mVideoEncoder:Landroidx/camera/video/internal/encoder/Encoder;

    .line 55
    .line 56
    if-eqz v1, :cond_4

    .line 57
    .line 58
    iget-object v1, p0, Landroidx/camera/video/Recorder;->mState:Landroidx/camera/video/Recorder$State;

    .line 59
    .line 60
    invoke-direct {p0, v1}, Landroidx/camera/video/Recorder;->makePendingRecordingActiveLocked(Landroidx/camera/video/Recorder$State;)Landroidx/camera/video/Recorder$RecordingRecord;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    move v5, v3

    .line 65
    move v3, v2

    .line 66
    move-object v2, v4

    .line 67
    move-object v4, v1

    .line 68
    move-object v1, v2

    .line 69
    goto :goto_2

    .line 70
    :cond_4
    :goto_1
    move v5, v3

    .line 71
    move-object v1, v4

    .line 72
    move v3, v2

    .line 73
    goto :goto_0

    .line 74
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    if-eqz v4, :cond_5

    .line 76
    .line 77
    invoke-direct {p0, v4, v3}, Landroidx/camera/video/Recorder;->startRecording(Landroidx/camera/video/Recorder$RecordingRecord;Z)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_5
    if-eqz v1, :cond_6

    .line 82
    .line 83
    invoke-direct {p0, v1, v5, v2}, Landroidx/camera/video/Recorder;->finalizePendingRecording(Landroidx/camera/video/Recorder$RecordingRecord;ILjava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    :cond_6
    return-void

    .line 87
    :goto_3
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 88
    throw v1
.end method

.method public updateInProgressStatusEvent()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder;->mInProgressRecording:Landroidx/camera/video/Recorder$RecordingRecord;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/camera/video/Recorder$RecordingRecord;->getOutputOptions()Landroidx/camera/video/OutputOptions;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, Landroidx/camera/video/Recorder;->getInProgressRecordingStats()Landroidx/camera/video/RecordingStats;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {v1, v2}, Landroidx/camera/video/VideoRecordEvent;->status(Landroidx/camera/video/OutputOptions;Landroidx/camera/video/RecordingStats;)Landroidx/camera/video/VideoRecordEvent$Status;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Landroidx/camera/video/Recorder$RecordingRecord;->updateVideoRecordEvent(Landroidx/camera/video/VideoRecordEvent;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public writeAudioData(Landroidx/camera/video/internal/encoder/EncodedData;Landroidx/camera/video/Recorder$RecordingRecord;)V
    .locals 17
    .param p1    # Landroidx/camera/video/internal/encoder/EncodedData;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/camera/video/Recorder$RecordingRecord;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-wide v2, v0, Landroidx/camera/video/Recorder;->mRecordingBytes:J

    .line 6
    .line 7
    invoke-interface/range {p1 .. p1}, Landroidx/camera/video/internal/encoder/EncodedData;->size()J

    .line 8
    .line 9
    .line 10
    move-result-wide v4

    .line 11
    add-long/2addr v2, v4

    .line 12
    iget-wide v4, v0, Landroidx/camera/video/Recorder;->mFileSizeLimitInBytes:J

    .line 13
    .line 14
    const-wide/16 v6, 0x0

    .line 15
    .line 16
    cmp-long v8, v4, v6

    .line 17
    .line 18
    const/4 v9, 0x0

    .line 19
    const-string v10, "Recorder"

    .line 20
    .line 21
    if-eqz v8, :cond_0

    .line 22
    .line 23
    cmp-long v4, v2, v4

    .line 24
    .line 25
    if-lez v4, :cond_0

    .line 26
    .line 27
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    iget-wide v3, v0, Landroidx/camera/video/Recorder;->mFileSizeLimitInBytes:J

    .line 32
    .line 33
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    const-string v3, "Reach file size limit %d > %d"

    .line 42
    .line 43
    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {v10, v2}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 v2, 0x2

    .line 51
    invoke-virtual {v0, v1, v2, v9}, Landroidx/camera/video/Recorder;->onInProgressRecordingInternalError(Landroidx/camera/video/Recorder$RecordingRecord;ILjava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_0
    invoke-interface/range {p1 .. p1}, Landroidx/camera/video/internal/encoder/EncodedData;->getPresentationTimeUs()J

    .line 56
    .line 57
    .line 58
    move-result-wide v4

    .line 59
    iget-wide v11, v0, Landroidx/camera/video/Recorder;->mFirstRecordingAudioDataTimeUs:J

    .line 60
    .line 61
    const-wide v13, 0x7fffffffffffffffL

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    cmp-long v8, v11, v13

    .line 67
    .line 68
    if-nez v8, :cond_1

    .line 69
    .line 70
    iput-wide v4, v0, Landroidx/camera/video/Recorder;->mFirstRecordingAudioDataTimeUs:J

    .line 71
    .line 72
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    iget-wide v6, v0, Landroidx/camera/video/Recorder;->mFirstRecordingAudioDataTimeUs:J

    .line 77
    .line 78
    invoke-static {v6, v7}, Landroidx/camera/video/internal/DebugUtils;->readableUs(J)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    filled-new-array {v1, v6}, [Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    const-string v6, "First audio time: %d (%s)"

    .line 87
    .line 88
    invoke-static {v6, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-static {v10, v1}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_1
    sget-object v8, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 97
    .line 98
    move-wide v15, v6

    .line 99
    iget-wide v6, v0, Landroidx/camera/video/Recorder;->mFirstRecordingVideoDataTimeUs:J

    .line 100
    .line 101
    invoke-static {v6, v7, v11, v12}, Ljava/lang/Math;->min(JJ)J

    .line 102
    .line 103
    .line 104
    move-result-wide v6

    .line 105
    sub-long v6, v4, v6

    .line 106
    .line 107
    invoke-virtual {v8, v6, v7}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 108
    .line 109
    .line 110
    move-result-wide v6

    .line 111
    iget-wide v11, v0, Landroidx/camera/video/Recorder;->mPreviousRecordingAudioDataTimeUs:J

    .line 112
    .line 113
    cmp-long v11, v11, v13

    .line 114
    .line 115
    if-eqz v11, :cond_2

    .line 116
    .line 117
    const/4 v11, 0x1

    .line 118
    goto :goto_0

    .line 119
    :cond_2
    const/4 v11, 0x0

    .line 120
    :goto_0
    const-string v12, "There should be a previous data for adjusting the duration."

    .line 121
    .line 122
    invoke-static {v11, v12}, Landroidx/core/util/Preconditions;->checkState(ZLjava/lang/String;)V

    .line 123
    .line 124
    .line 125
    iget-wide v11, v0, Landroidx/camera/video/Recorder;->mPreviousRecordingAudioDataTimeUs:J

    .line 126
    .line 127
    sub-long v11, v4, v11

    .line 128
    .line 129
    invoke-virtual {v8, v11, v12}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 130
    .line 131
    .line 132
    move-result-wide v11

    .line 133
    add-long/2addr v6, v11

    .line 134
    iget-wide v11, v0, Landroidx/camera/video/Recorder;->mDurationLimitNs:J

    .line 135
    .line 136
    cmp-long v8, v11, v15

    .line 137
    .line 138
    if-eqz v8, :cond_3

    .line 139
    .line 140
    cmp-long v8, v6, v11

    .line 141
    .line 142
    if-lez v8, :cond_3

    .line 143
    .line 144
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    iget-wide v3, v0, Landroidx/camera/video/Recorder;->mDurationLimitNs:J

    .line 149
    .line 150
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    const-string v3, "Audio data reaches duration limit %d > %d"

    .line 159
    .line 160
    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-static {v10, v2}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    const/16 v2, 0x9

    .line 168
    .line 169
    invoke-virtual {v0, v1, v2, v9}, Landroidx/camera/video/Recorder;->onInProgressRecordingInternalError(Landroidx/camera/video/Recorder$RecordingRecord;ILjava/lang/Throwable;)V

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :cond_3
    :goto_1
    iget-object v1, v0, Landroidx/camera/video/Recorder;->mMediaMuxer:Landroid/media/MediaMuxer;

    .line 174
    .line 175
    iget-object v6, v0, Landroidx/camera/video/Recorder;->mAudioTrackIndex:Ljava/lang/Integer;

    .line 176
    .line 177
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 178
    .line 179
    .line 180
    move-result v6

    .line 181
    invoke-interface/range {p1 .. p1}, Landroidx/camera/video/internal/encoder/EncodedData;->getByteBuffer()Ljava/nio/ByteBuffer;

    .line 182
    .line 183
    .line 184
    move-result-object v7

    .line 185
    invoke-interface/range {p1 .. p1}, Landroidx/camera/video/internal/encoder/EncodedData;->getBufferInfo()Landroid/media/MediaCodec$BufferInfo;

    .line 186
    .line 187
    .line 188
    move-result-object v8

    .line 189
    invoke-virtual {v1, v6, v7, v8}, Landroid/media/MediaMuxer;->writeSampleData(ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V

    .line 190
    .line 191
    .line 192
    iput-wide v2, v0, Landroidx/camera/video/Recorder;->mRecordingBytes:J

    .line 193
    .line 194
    iput-wide v4, v0, Landroidx/camera/video/Recorder;->mPreviousRecordingAudioDataTimeUs:J

    .line 195
    .line 196
    return-void
.end method

.method public writeVideoData(Landroidx/camera/video/internal/encoder/EncodedData;Landroidx/camera/video/Recorder$RecordingRecord;)V
    .locals 17
    .param p1    # Landroidx/camera/video/internal/encoder/EncodedData;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/camera/video/Recorder$RecordingRecord;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, Landroidx/camera/video/Recorder;->mVideoTrackIndex:Ljava/lang/Integer;

    .line 6
    .line 7
    if-eqz v2, :cond_4

    .line 8
    .line 9
    iget-wide v2, v0, Landroidx/camera/video/Recorder;->mRecordingBytes:J

    .line 10
    .line 11
    invoke-interface/range {p1 .. p1}, Landroidx/camera/video/internal/encoder/EncodedData;->size()J

    .line 12
    .line 13
    .line 14
    move-result-wide v4

    .line 15
    add-long/2addr v2, v4

    .line 16
    iget-wide v4, v0, Landroidx/camera/video/Recorder;->mFileSizeLimitInBytes:J

    .line 17
    .line 18
    const-wide/16 v6, 0x0

    .line 19
    .line 20
    cmp-long v8, v4, v6

    .line 21
    .line 22
    const/4 v9, 0x0

    .line 23
    const-string v10, "Recorder"

    .line 24
    .line 25
    if-eqz v8, :cond_0

    .line 26
    .line 27
    cmp-long v4, v2, v4

    .line 28
    .line 29
    if-lez v4, :cond_0

    .line 30
    .line 31
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    iget-wide v3, v0, Landroidx/camera/video/Recorder;->mFileSizeLimitInBytes:J

    .line 36
    .line 37
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    const-string v3, "Reach file size limit %d > %d"

    .line 46
    .line 47
    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-static {v10, v2}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 v2, 0x2

    .line 55
    invoke-virtual {v0, v1, v2, v9}, Landroidx/camera/video/Recorder;->onInProgressRecordingInternalError(Landroidx/camera/video/Recorder$RecordingRecord;ILjava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_0
    invoke-interface/range {p1 .. p1}, Landroidx/camera/video/internal/encoder/EncodedData;->getPresentationTimeUs()J

    .line 60
    .line 61
    .line 62
    move-result-wide v4

    .line 63
    iget-wide v11, v0, Landroidx/camera/video/Recorder;->mFirstRecordingVideoDataTimeUs:J

    .line 64
    .line 65
    const-wide v13, 0x7fffffffffffffffL

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    cmp-long v8, v11, v13

    .line 71
    .line 72
    if-nez v8, :cond_1

    .line 73
    .line 74
    iput-wide v4, v0, Landroidx/camera/video/Recorder;->mFirstRecordingVideoDataTimeUs:J

    .line 75
    .line 76
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    iget-wide v8, v0, Landroidx/camera/video/Recorder;->mFirstRecordingVideoDataTimeUs:J

    .line 81
    .line 82
    invoke-static {v8, v9}, Landroidx/camera/video/internal/DebugUtils;->readableUs(J)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v8

    .line 86
    filled-new-array {v1, v8}, [Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    const-string v8, "First video time: %d (%s)"

    .line 91
    .line 92
    invoke-static {v8, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-static {v10, v1}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_1
    sget-object v8, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 101
    .line 102
    move-wide v15, v6

    .line 103
    iget-wide v6, v0, Landroidx/camera/video/Recorder;->mFirstRecordingAudioDataTimeUs:J

    .line 104
    .line 105
    invoke-static {v11, v12, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 106
    .line 107
    .line 108
    move-result-wide v6

    .line 109
    sub-long v6, v4, v6

    .line 110
    .line 111
    invoke-virtual {v8, v6, v7}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 112
    .line 113
    .line 114
    move-result-wide v6

    .line 115
    iget-wide v11, v0, Landroidx/camera/video/Recorder;->mPreviousRecordingVideoDataTimeUs:J

    .line 116
    .line 117
    cmp-long v11, v11, v13

    .line 118
    .line 119
    if-eqz v11, :cond_2

    .line 120
    .line 121
    const/4 v11, 0x1

    .line 122
    goto :goto_0

    .line 123
    :cond_2
    const/4 v11, 0x0

    .line 124
    :goto_0
    const-string v12, "There should be a previous data for adjusting the duration."

    .line 125
    .line 126
    invoke-static {v11, v12}, Landroidx/core/util/Preconditions;->checkState(ZLjava/lang/String;)V

    .line 127
    .line 128
    .line 129
    iget-wide v11, v0, Landroidx/camera/video/Recorder;->mPreviousRecordingVideoDataTimeUs:J

    .line 130
    .line 131
    sub-long v11, v4, v11

    .line 132
    .line 133
    invoke-virtual {v8, v11, v12}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 134
    .line 135
    .line 136
    move-result-wide v11

    .line 137
    add-long/2addr v11, v6

    .line 138
    iget-wide v13, v0, Landroidx/camera/video/Recorder;->mDurationLimitNs:J

    .line 139
    .line 140
    cmp-long v8, v13, v15

    .line 141
    .line 142
    if-eqz v8, :cond_3

    .line 143
    .line 144
    cmp-long v8, v11, v13

    .line 145
    .line 146
    if-lez v8, :cond_3

    .line 147
    .line 148
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    iget-wide v3, v0, Landroidx/camera/video/Recorder;->mDurationLimitNs:J

    .line 153
    .line 154
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    const-string v3, "Video data reaches duration limit %d > %d"

    .line 163
    .line 164
    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    invoke-static {v10, v2}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    const/16 v2, 0x9

    .line 172
    .line 173
    invoke-virtual {v0, v1, v2, v9}, Landroidx/camera/video/Recorder;->onInProgressRecordingInternalError(Landroidx/camera/video/Recorder$RecordingRecord;ILjava/lang/Throwable;)V

    .line 174
    .line 175
    .line 176
    return-void

    .line 177
    :cond_3
    :goto_1
    iget-object v1, v0, Landroidx/camera/video/Recorder;->mMediaMuxer:Landroid/media/MediaMuxer;

    .line 178
    .line 179
    iget-object v8, v0, Landroidx/camera/video/Recorder;->mVideoTrackIndex:Ljava/lang/Integer;

    .line 180
    .line 181
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 182
    .line 183
    .line 184
    move-result v8

    .line 185
    invoke-interface/range {p1 .. p1}, Landroidx/camera/video/internal/encoder/EncodedData;->getByteBuffer()Ljava/nio/ByteBuffer;

    .line 186
    .line 187
    .line 188
    move-result-object v9

    .line 189
    invoke-interface/range {p1 .. p1}, Landroidx/camera/video/internal/encoder/EncodedData;->getBufferInfo()Landroid/media/MediaCodec$BufferInfo;

    .line 190
    .line 191
    .line 192
    move-result-object v10

    .line 193
    invoke-virtual {v1, v8, v9, v10}, Landroid/media/MediaMuxer;->writeSampleData(ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V

    .line 194
    .line 195
    .line 196
    iput-wide v2, v0, Landroidx/camera/video/Recorder;->mRecordingBytes:J

    .line 197
    .line 198
    iput-wide v6, v0, Landroidx/camera/video/Recorder;->mRecordingDurationNs:J

    .line 199
    .line 200
    iput-wide v4, v0, Landroidx/camera/video/Recorder;->mPreviousRecordingVideoDataTimeUs:J

    .line 201
    .line 202
    invoke-virtual {v0}, Landroidx/camera/video/Recorder;->updateInProgressStatusEvent()V

    .line 203
    .line 204
    .line 205
    return-void

    .line 206
    :cond_4
    new-instance v1, Ljava/lang/AssertionError;

    .line 207
    .line 208
    const-string v2, "Video data comes before the track is added to MediaMuxer."

    .line 209
    .line 210
    invoke-direct {v1, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    throw v1
.end method
