.class public Lcom/zykj/paint/render/SketchPlayer;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/paint/render/SketchPlayer$HeadsetPlugReceiver;
    }
.end annotation


# static fields
.field private static final SPEAKER_OFF:I = 0x1

.field private static final SPEAKER_ON:I = 0x0

.field private static final TAG:Ljava/lang/String; = "SketchPlayer"


# instance fields
.field private conrtolImageView:Landroid/widget/ImageView;

.field private controlBarLayout:Landroid/widget/RelativeLayout;

.field private headsetPlugReceiver:Lcom/zykj/paint/render/SketchPlayer$HeadsetPlugReceiver;

.field private isPause:Z

.field private isPauseBeforeSeekAction:Z

.field private mActionList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/paint/Actions$EzyAction;",
            ">;"
        }
    .end annotation
.end field

.field private mediaPlayer:Landroid/media/MediaPlayer;

.field private path:Ljava/lang/String;

.field private playActionListener:Lcom/zykj/paint/player/PlayActionListener;

.field private seekBar:Landroid/widget/SeekBar;

.field private sketchViewer:Lcom/zykj/paint/render/SketchViewer;

.field private sourceUrl:Ljava/lang/String;

.field private tvEndTime:Landroid/widget/TextView;

.field private tvLessonRecord:Landroid/widget/TextView;

.field private tvStartTime:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/zykj/paint/render/SketchPlayer;->init(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    invoke-direct {p0, p1}, Lcom/zykj/paint/render/SketchPlayer;->init(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 5
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    invoke-direct {p0, p1}, Lcom/zykj/paint/render/SketchPlayer;->init(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic access$000(Lcom/zykj/paint/render/SketchPlayer;)Lcom/zykj/paint/player/PlayActionListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/paint/render/SketchPlayer;->playActionListener:Lcom/zykj/paint/player/PlayActionListener;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$100(Lcom/zykj/paint/render/SketchPlayer;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/zykj/paint/render/SketchPlayer;->isPauseBeforeSeekAction:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$102(Lcom/zykj/paint/render/SketchPlayer;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/paint/render/SketchPlayer;->isPauseBeforeSeekAction:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$200(Lcom/zykj/paint/render/SketchPlayer;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/zykj/paint/render/SketchPlayer;->isPause:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$300(Lcom/zykj/paint/render/SketchPlayer;)Lcom/zykj/paint/render/SketchViewer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/paint/render/SketchPlayer;->sketchViewer:Lcom/zykj/paint/render/SketchViewer;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$400(Lcom/zykj/paint/render/SketchPlayer;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/paint/render/SketchPlayer;->tvStartTime:Landroid/widget/TextView;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$500(Lcom/zykj/paint/render/SketchPlayer;)Landroid/media/MediaPlayer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/paint/render/SketchPlayer;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$600(Lcom/zykj/paint/render/SketchPlayer;)Landroid/widget/SeekBar;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/paint/render/SketchPlayer;->seekBar:Landroid/widget/SeekBar;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$700(Lcom/zykj/paint/render/SketchPlayer;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/paint/render/SketchPlayer;->mActionList:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$800(Lcom/zykj/paint/render/SketchPlayer;Ljava/util/List;)I
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/paint/render/SketchPlayer;->getTotalTime(Ljava/util/List;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private getTotalTime(Ljava/util/List;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/paint/Actions$EzyAction;",
            ">;)I"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lcom/zykj/paint/Actions$EzyAction;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyAction;->getStartAt()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyAction;->getDuration()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    add-int/2addr v0, p1

    .line 22
    return v0
.end method

.method private init(Landroid/content/Context;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "SketchPlayer"

    .line 2
    .line 3
    const-string v1, "init..."

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget v0, Lcom/zykj/paint/R$layout;->view_sketch_player:I

    .line 13
    .line 14
    invoke-virtual {p1, v0, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    sget v0, Lcom/zykj/paint/R$id;->control_bar:I

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Landroid/widget/RelativeLayout;

    .line 25
    .line 26
    iput-object v0, p0, Lcom/zykj/paint/render/SketchPlayer;->controlBarLayout:Landroid/widget/RelativeLayout;

    .line 27
    .line 28
    sget v0, Lcom/zykj/paint/R$id;->tv_start_time:I

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Landroid/widget/TextView;

    .line 35
    .line 36
    iput-object v0, p0, Lcom/zykj/paint/render/SketchPlayer;->tvStartTime:Landroid/widget/TextView;

    .line 37
    .line 38
    sget v0, Lcom/zykj/paint/R$id;->tv_end_time:I

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Landroid/widget/TextView;

    .line 45
    .line 46
    iput-object v0, p0, Lcom/zykj/paint/render/SketchPlayer;->tvEndTime:Landroid/widget/TextView;

    .line 47
    .line 48
    sget v0, Lcom/zykj/paint/R$id;->tv_lesson_record:I

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Landroid/widget/TextView;

    .line 55
    .line 56
    iput-object v0, p0, Lcom/zykj/paint/render/SketchPlayer;->tvLessonRecord:Landroid/widget/TextView;

    .line 57
    .line 58
    new-instance v1, Lcom/zykj/paint/render/SketchPlayer$1;

    .line 59
    .line 60
    invoke-direct {v1, p0}, Lcom/zykj/paint/render/SketchPlayer$1;-><init>(Lcom/zykj/paint/render/SketchPlayer;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 64
    .line 65
    .line 66
    sget v0, Lcom/zykj/paint/R$id;->seek_bar_music:I

    .line 67
    .line 68
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, Landroid/widget/SeekBar;

    .line 73
    .line 74
    iput-object v0, p0, Lcom/zykj/paint/render/SketchPlayer;->seekBar:Landroid/widget/SeekBar;

    .line 75
    .line 76
    new-instance v1, Lcom/zykj/paint/render/SketchPlayer$2;

    .line 77
    .line 78
    invoke-direct {v1, p0}, Lcom/zykj/paint/render/SketchPlayer$2;-><init>(Lcom/zykj/paint/render/SketchPlayer;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 82
    .line 83
    .line 84
    sget v0, Lcom/zykj/paint/R$id;->mapViewer:I

    .line 85
    .line 86
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    check-cast v0, Lcom/zykj/paint/render/SketchViewer;

    .line 91
    .line 92
    iput-object v0, p0, Lcom/zykj/paint/render/SketchPlayer;->sketchViewer:Lcom/zykj/paint/render/SketchViewer;

    .line 93
    .line 94
    new-instance v1, Lcom/zykj/paint/render/SketchPlayer$3;

    .line 95
    .line 96
    invoke-direct {v1, p0}, Lcom/zykj/paint/render/SketchPlayer$3;-><init>(Lcom/zykj/paint/render/SketchPlayer;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v1}, Lcom/zykj/paint/render/SketchViewer;->setPlayStatusListener(Lcom/zykj/paint/player/PlayStatusListener;)V

    .line 100
    .line 101
    .line 102
    sget v0, Lcom/zykj/paint/R$id;->img_music_control:I

    .line 103
    .line 104
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    check-cast p1, Landroid/widget/ImageView;

    .line 109
    .line 110
    iput-object p1, p0, Lcom/zykj/paint/render/SketchPlayer;->conrtolImageView:Landroid/widget/ImageView;

    .line 111
    .line 112
    new-instance v0, Lcom/zykj/paint/render/SketchPlayer$4;

    .line 113
    .line 114
    invoke-direct {v0, p0}, Lcom/zykj/paint/render/SketchPlayer$4;-><init>(Lcom/zykj/paint/render/SketchPlayer;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 118
    .line 119
    .line 120
    return-void
.end method

.method private playMusic()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/render/SketchPlayer;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/media/MediaPlayer;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/zykj/paint/render/SketchPlayer;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 11
    .line 12
    const/4 v1, 0x3

    .line 13
    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setAudioStreamType(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lcom/zykj/paint/render/SketchPlayer;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    .line 19
    .line 20
    .line 21
    :try_start_0
    iget-object v0, p0, Lcom/zykj/paint/render/SketchPlayer;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/zykj/paint/render/SketchPlayer;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 27
    .line 28
    iget-object v1, p0, Lcom/zykj/paint/render/SketchPlayer;->path:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lcom/zykj/paint/render/SketchPlayer;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepareAsync()V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lcom/zykj/paint/render/SketchPlayer;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 39
    .line 40
    new-instance v1, Lcom/zykj/paint/render/SketchPlayer$5;

    .line 41
    .line 42
    invoke-direct {v1, p0}, Lcom/zykj/paint/render/SketchPlayer$5;-><init>(Lcom/zykj/paint/render/SketchPlayer;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :catch_0
    move-exception v0

    .line 50
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method private playWithLocalSource()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/zykj/paint/render/SketchPlayer;->isPause:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/paint/render/SketchPlayer;->conrtolImageView:Landroid/widget/ImageView;

    .line 5
    .line 6
    sget v1, Lcom/zykj/paint/R$drawable;->selector_btn_music_pause:I

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/paint/render/SketchPlayer;->mActionList:Ljava/util/List;

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lcom/zykj/paint/render/SketchPlayer;->getTotalTime(Ljava/util/List;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v2, "totalTime--->>>"

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const-string v2, "SketchPlayer"

    .line 35
    .line 36
    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, Lcom/zykj/paint/render/SketchPlayer;->seekBar:Landroid/widget/SeekBar;

    .line 40
    .line 41
    invoke-virtual {v1, v0}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 42
    .line 43
    .line 44
    iget-object v1, p0, Lcom/zykj/paint/render/SketchPlayer;->tvEndTime:Landroid/widget/TextView;

    .line 45
    .line 46
    invoke-static {v0}, Lcom/zykj/paint/util/TimeUtils;->formatTime(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lcom/zykj/paint/render/SketchPlayer;->sketchViewer:Lcom/zykj/paint/render/SketchViewer;

    .line 54
    .line 55
    iget-object v1, p0, Lcom/zykj/paint/render/SketchPlayer;->mActionList:Ljava/util/List;

    .line 56
    .line 57
    iget-object v2, p0, Lcom/zykj/paint/render/SketchPlayer;->sourceUrl:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v0, v1, v2}, Lcom/zykj/paint/render/SketchViewer;->setDataSource(Ljava/util/List;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method


# virtual methods
.method public destroyPlayer()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/zykj/paint/render/SketchPlayer;->isPause:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/paint/render/SketchPlayer;->sketchViewer:Lcom/zykj/paint/render/SketchViewer;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/zykj/paint/render/SketchViewer;->release()V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, Lcom/zykj/paint/render/SketchPlayer;->sketchViewer:Lcom/zykj/paint/render/SketchViewer;

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lcom/zykj/paint/render/SketchPlayer;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object v0, p0, Lcom/zykj/paint/render/SketchPlayer;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-object v0, p0, Lcom/zykj/paint/render/SketchPlayer;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, Lcom/zykj/paint/render/SketchPlayer;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 35
    .line 36
    :cond_2
    return-void
.end method

.method public getSnapshot()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/render/SketchPlayer;->sketchViewer:Lcom/zykj/paint/render/SketchViewer;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/paint/render/SketchViewer;->getCapture()Landroid/graphics/Bitmap;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public hideSeekBar()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/render/SketchPlayer;->conrtolImageView:Landroid/widget/ImageView;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/zykj/paint/render/SketchPlayer;->tvStartTime:Landroid/widget/TextView;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/zykj/paint/render/SketchPlayer;->tvEndTime:Landroid/widget/TextView;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/zykj/paint/render/SketchPlayer;->seekBar:Landroid/widget/SeekBar;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public pausePlayer()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/zykj/paint/render/SketchPlayer;->isPause:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/paint/render/SketchPlayer;->conrtolImageView:Landroid/widget/ImageView;

    .line 5
    .line 6
    sget v1, Lcom/zykj/paint/R$drawable;->selector_btn_music_play:I

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/paint/render/SketchPlayer;->sketchViewer:Lcom/zykj/paint/render/SketchViewer;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/zykj/paint/render/SketchViewer;->pause()V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lcom/zykj/paint/render/SketchPlayer;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    .line 23
    .line 24
    .line 25
    :cond_1
    iget-object v0, p0, Lcom/zykj/paint/render/SketchPlayer;->playActionListener:Lcom/zykj/paint/player/PlayActionListener;

    .line 26
    .line 27
    invoke-interface {v0}, Lcom/zykj/paint/player/PlayActionListener;->onPause()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public play(Ljava/util/List;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/paint/Actions$EzyAction;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p2, p0, Lcom/zykj/paint/render/SketchPlayer;->sourceUrl:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p1, p0, Lcom/zykj/paint/render/SketchPlayer;->mActionList:Ljava/util/List;

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/zykj/paint/render/SketchPlayer;->playWithLocalSource()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public registerHeadsetPlugReceiver(Landroid/content/Context;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/paint/render/SketchPlayer$HeadsetPlugReceiver;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/paint/render/SketchPlayer$HeadsetPlugReceiver;-><init>(Lcom/zykj/paint/render/SketchPlayer;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/zykj/paint/render/SketchPlayer;->headsetPlugReceiver:Lcom/zykj/paint/render/SketchPlayer$HeadsetPlugReceiver;

    .line 7
    .line 8
    new-instance v0, Landroid/content/IntentFilter;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v1, "android.intent.action.HEADSET_PLUG"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/zykj/paint/render/SketchPlayer;->headsetPlugReceiver:Lcom/zykj/paint/render/SketchPlayer$HeadsetPlugReceiver;

    .line 19
    .line 20
    invoke-virtual {p1, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public releaseCacheBitmap()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/render/SketchPlayer;->sketchViewer:Lcom/zykj/paint/render/SketchViewer;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->destroyDrawingCache()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public resumePlayer()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/zykj/paint/render/SketchPlayer;->isPause:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/paint/render/SketchPlayer;->conrtolImageView:Landroid/widget/ImageView;

    .line 5
    .line 6
    sget v1, Lcom/zykj/paint/R$drawable;->selector_btn_music_pause:I

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/paint/render/SketchPlayer;->sketchViewer:Lcom/zykj/paint/render/SketchViewer;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/zykj/paint/render/SketchViewer;->resume()V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lcom/zykj/paint/render/SketchPlayer;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 23
    .line 24
    .line 25
    :cond_1
    iget-object v0, p0, Lcom/zykj/paint/render/SketchPlayer;->playActionListener:Lcom/zykj/paint/player/PlayActionListener;

    .line 26
    .line 27
    invoke-interface {v0}, Lcom/zykj/paint/player/PlayActionListener;->onResume()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public setPlayActionListener(Lcom/zykj/paint/player/PlayActionListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/render/SketchPlayer;->playActionListener:Lcom/zykj/paint/player/PlayActionListener;

    .line 2
    .line 3
    return-void
.end method

.method public showSeekBar()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/render/SketchPlayer;->conrtolImageView:Landroid/widget/ImageView;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/zykj/paint/render/SketchPlayer;->tvStartTime:Landroid/widget/TextView;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/zykj/paint/render/SketchPlayer;->tvEndTime:Landroid/widget/TextView;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/zykj/paint/render/SketchPlayer;->seekBar:Landroid/widget/SeekBar;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public startMusic(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/render/SketchPlayer;->path:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public unRegisterHeadsetReceiver(Landroid/content/Context;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/render/SketchPlayer;->headsetPlugReceiver:Lcom/zykj/paint/render/SketchPlayer$HeadsetPlugReceiver;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method
