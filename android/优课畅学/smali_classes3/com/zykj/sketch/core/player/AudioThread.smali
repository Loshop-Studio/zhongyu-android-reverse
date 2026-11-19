.class public final Lcom/zykj/sketch/core/player/AudioThread;
.super Lcom/zykj/sketch/core/player/PlayThread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/sketch/core/player/AudioThread$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/zykj/sketch/core/player/AudioThread$Companion;

.field public static final PERIOD:J = 0x28L


# instance fields
.field private audioTaskList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/sketch/core/data/AudioTask;",
            ">;"
        }
    .end annotation
.end field

.field private currentMediaPlayer:Landroid/media/MediaPlayer;

.field private iterator:Ljava/util/ListIterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ListIterator<",
            "Lcom/zykj/sketch/core/data/AudioTask;",
            ">;"
        }
    .end annotation
.end field

.field private final mediaPlayerList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/media/MediaPlayer;",
            ">;"
        }
    .end annotation
.end field

.field private playActionListener:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/sketch/core/listener/PlayActionListener;",
            ">;"
        }
    .end annotation
.end field

.field private playTime:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/sketch/core/player/AudioThread$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/sketch/core/player/AudioThread$Companion;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/sketch/core/player/AudioThread;->Companion:Lcom/zykj/sketch/core/player/AudioThread$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/sketch/core/player/PlayThread;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/zykj/sketch/core/player/AudioThread;->mediaPlayerList:Ljava/util/List;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/zykj/sketch/core/player/AudioThread;->audioTaskList:Ljava/util/List;

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic a(Lcom/zykj/sketch/core/player/AudioThread;Landroid/media/MediaPlayer;II)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/sketch/core/player/AudioThread;->initMediaPlayer$lambda-18$lambda-13(Lcom/zykj/sketch/core/player/AudioThread;Landroid/media/MediaPlayer;II)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Landroid/media/MediaPlayer;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/sketch/core/player/AudioThread;->initMediaPlayer$lambda-18$lambda-14(Landroid/media/MediaPlayer;)V

    return-void
.end method

.method public static synthetic c(Lcom/zykj/sketch/core/player/AudioThread;Landroid/media/MediaPlayer;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/sketch/core/player/AudioThread;->initMediaPlayer$lambda-18$lambda-17(Lcom/zykj/sketch/core/player/AudioThread;Landroid/media/MediaPlayer;)V

    return-void
.end method

.method private final getTotalDuration()J
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/player/AudioThread;->audioTaskList:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Lcom/zykj/sketch/core/data/AudioTask;

    .line 20
    .line 21
    invoke-virtual {v3}, Lcom/zykj/sketch/core/data/AudioTask;->getDuration()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    int-to-long v3, v3

    .line 26
    add-long/2addr v1, v3

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-wide v1
.end method

.method private final initMediaPlayer(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/core/data/AudioTask;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/player/AudioThread;->mediaPlayerList:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lcom/zykj/sketch/core/data/AudioTask;

    .line 21
    .line 22
    new-instance v1, Landroid/media/MediaPlayer;

    .line 23
    .line 24
    invoke-direct {v1}, Landroid/media/MediaPlayer;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/zykj/sketch/core/data/AudioTask;->getPath()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v1, v0}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    new-instance v0, Lcom/zykj/sketch/core/player/a;

    .line 35
    .line 36
    invoke-direct {v0, p0}, Lcom/zykj/sketch/core/player/a;-><init>(Lcom/zykj/sketch/core/player/AudioThread;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v0}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    .line 40
    .line 41
    .line 42
    new-instance v0, Lcom/zykj/sketch/core/player/b;

    .line 43
    .line 44
    invoke-direct {v0}, Lcom/zykj/sketch/core/player/b;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v0}, Landroid/media/MediaPlayer;->setOnSeekCompleteListener(Landroid/media/MediaPlayer$OnSeekCompleteListener;)V

    .line 48
    .line 49
    .line 50
    new-instance v0, Lcom/zykj/sketch/core/player/c;

    .line 51
    .line 52
    invoke-direct {v0, p0}, Lcom/zykj/sketch/core/player/c;-><init>(Lcom/zykj/sketch/core/player/AudioThread;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, v0}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Landroid/media/MediaPlayer;->prepare()V

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, Lcom/zykj/sketch/core/player/AudioThread;->mediaPlayerList:Ljava/util/List;

    .line 62
    .line 63
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    return-void
.end method

.method private static final initMediaPlayer$lambda-18$lambda-13(Lcom/zykj/sketch/core/player/AudioThread;Landroid/media/MediaPlayer;II)Z
    .locals 0

    .line 1
    const-string p2, "this$0"

    .line 2
    .line 3
    invoke-static {p0, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p2, "mp"

    .line 7
    .line 8
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1}, Lcom/zykj/sketch/core/player/AudioThread;->resetMediaPlay(Landroid/media/MediaPlayer;)V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    return p0
.end method

.method private static final initMediaPlayer$lambda-18$lambda-14(Landroid/media/MediaPlayer;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/media/MediaPlayer;->start()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final initMediaPlayer$lambda-18$lambda-17(Lcom/zykj/sketch/core/player/AudioThread;Landroid/media/MediaPlayer;)V
    .locals 2

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "mp"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1}, Lcom/zykj/sketch/core/player/AudioThread;->resetMediaPlay(Landroid/media/MediaPlayer;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lcom/zykj/sketch/core/player/AudioThread;->iterator:Ljava/util/ListIterator;

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/ListIterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    iget-object p1, p0, Lcom/zykj/sketch/core/player/AudioThread;->currentMediaPlayer:Landroid/media/MediaPlayer;

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->isPlaying()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-nez p1, :cond_0

    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/sketch/core/player/PlayThread;->stopPlay()V

    .line 36
    .line 37
    .line 38
    invoke-direct {p0}, Lcom/zykj/sketch/core/player/AudioThread;->getTotalDuration()J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    invoke-direct {p0, v0, v1}, Lcom/zykj/sketch/core/player/AudioThread;->notifyProgress(J)V

    .line 43
    .line 44
    .line 45
    iget-object p0, p0, Lcom/zykj/sketch/core/player/AudioThread;->playActionListener:Ljava/util/List;

    .line 46
    .line 47
    if-eqz p0, :cond_1

    .line 48
    .line 49
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-eqz p1, :cond_1

    .line 58
    .line 59
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, Lcom/zykj/sketch/core/listener/PlayActionListener;

    .line 64
    .line 65
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/PlayActionListener;->onPlayEnd()V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    return-void
.end method

.method private final notifyProgress(J)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/core/player/PlayThread;->getPlayStatus()Lcom/zykj/sketch/core/data/PlayStatus;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/zykj/sketch/core/data/PlayStatus;->RECORD_END:Lcom/zykj/sketch/core/data/PlayStatus;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/zykj/sketch/core/player/AudioThread;->getTotalDuration()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-wide v0, p1

    .line 15
    :goto_0
    invoke-direct {p0}, Lcom/zykj/sketch/core/player/AudioThread;->getTotalDuration()J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    cmp-long p1, v2, p1

    .line 20
    .line 21
    if-gez p1, :cond_1

    .line 22
    .line 23
    invoke-direct {p0}, Lcom/zykj/sketch/core/player/AudioThread;->getTotalDuration()J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    :cond_1
    iget-object p1, p0, Lcom/zykj/sketch/core/player/AudioThread;->playActionListener:Ljava/util/List;

    .line 28
    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    if-eqz p2, :cond_2

    .line 40
    .line 41
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    check-cast p2, Lcom/zykj/sketch/core/listener/PlayActionListener;

    .line 46
    .line 47
    :try_start_0
    invoke-interface {p2, v0, v1}, Lcom/zykj/sketch/core/listener/PlayActionListener;->onProgress(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :catchall_0
    move-exception p2

    .line 52
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    return-void
.end method

.method private final declared-synchronized resetMediaPlay(Landroid/media/MediaPlayer;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/zykj/sketch/core/player/AudioThread;->mediaPlayerList:Ljava/util/List;

    .line 3
    .line 4
    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->isPlaying()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->stop()V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    goto :goto_2

    .line 20
    :cond_0
    :goto_0
    const/4 v1, -0x1

    .line 21
    if-le v0, v1, :cond_1

    .line 22
    .line 23
    iget-object v1, p0, Lcom/zykj/sketch/core/player/AudioThread;->audioTaskList:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lcom/zykj/sketch/core/data/AudioTask;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->reset()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/zykj/sketch/core/data/AudioTask;->getPath()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {p1, v1}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    :try_start_1
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->prepare()V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :catch_0
    :try_start_2
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->reset()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Lcom/zykj/sketch/core/data/AudioTask;->getPath()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {p1, v0}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->prepare()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 56
    .line 57
    .line 58
    :cond_1
    :goto_1
    monitor-exit p0

    .line 59
    return-void

    .line 60
    :goto_2
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 61
    throw p1
.end method

.method private final stopAllAudio()V
    .locals 5

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/zykj/sketch/core/player/AudioThread;->audioTaskList:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_2

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    add-int/lit8 v3, v1, 0x1

    .line 19
    .line 20
    if-gez v1, :cond_0

    .line 21
    .line 22
    invoke-static {}, Li7/v;->w()V

    .line 23
    .line 24
    .line 25
    goto :goto_1

    .line 26
    :catch_0
    move-exception v0

    .line 27
    goto :goto_2

    .line 28
    :cond_0
    :goto_1
    check-cast v2, Lcom/zykj/sketch/core/data/AudioTask;

    .line 29
    .line 30
    iget-object v4, p0, Lcom/zykj/sketch/core/player/AudioThread;->mediaPlayerList:Ljava/util/List;

    .line 31
    .line 32
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Landroid/media/MediaPlayer;

    .line 37
    .line 38
    invoke-virtual {v1}, Landroid/media/MediaPlayer;->isPlaying()Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    invoke-virtual {v1}, Landroid/media/MediaPlayer;->stop()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Landroid/media/MediaPlayer;->reset()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Lcom/zykj/sketch/core/data/AudioTask;->getPath()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v1, v2}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Landroid/media/MediaPlayer;->prepareAsync()V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    .line 59
    .line 60
    :cond_1
    move v1, v3

    .line 61
    goto :goto_0

    .line 62
    :cond_2
    return-void

    .line 63
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 64
    .line 65
    .line 66
    return-void
.end method


# virtual methods
.method public final initSeekTo()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/player/AudioThread;->audioTaskList:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, Lcom/zykj/sketch/core/player/AudioThread;->iterator:Ljava/util/ListIterator;

    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/sketch/core/player/AudioThread;->currentMediaPlayer:Landroid/media/MediaPlayer;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lcom/zykj/sketch/core/player/AudioThread;->resetMediaPlay(Landroid/media/MediaPlayer;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-direct {p0}, Lcom/zykj/sketch/core/player/AudioThread;->stopAllAudio()V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/zykj/sketch/core/player/AudioThread;->iterator:Ljava/util/ListIterator;

    .line 20
    .line 21
    if-eqz v0, :cond_5

    .line 22
    .line 23
    :cond_1
    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_4

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Lcom/zykj/sketch/core/data/AudioTask;

    .line 34
    .line 35
    iget-wide v2, p0, Lcom/zykj/sketch/core/player/AudioThread;->playTime:J

    .line 36
    .line 37
    invoke-virtual {v1}, Lcom/zykj/sketch/core/data/AudioTask;->getStartTime()J

    .line 38
    .line 39
    .line 40
    move-result-wide v4

    .line 41
    cmp-long v2, v2, v4

    .line 42
    .line 43
    if-gez v2, :cond_1

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    :cond_2
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_3

    .line 59
    .line 60
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, Lcom/zykj/sketch/core/data/AudioTask;

    .line 65
    .line 66
    :cond_3
    iget-object v2, p0, Lcom/zykj/sketch/core/player/AudioThread;->audioTaskList:Ljava/util/List;

    .line 67
    .line 68
    invoke-interface {v2, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    iget-object v3, p0, Lcom/zykj/sketch/core/player/AudioThread;->mediaPlayerList:Ljava/util/List;

    .line 73
    .line 74
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    check-cast v2, Landroid/media/MediaPlayer;

    .line 79
    .line 80
    iput-object v2, p0, Lcom/zykj/sketch/core/player/AudioThread;->currentMediaPlayer:Landroid/media/MediaPlayer;

    .line 81
    .line 82
    invoke-direct {p0, v2}, Lcom/zykj/sketch/core/player/AudioThread;->resetMediaPlay(Landroid/media/MediaPlayer;)V

    .line 83
    .line 84
    .line 85
    iget-wide v3, p0, Lcom/zykj/sketch/core/player/AudioThread;->playTime:J

    .line 86
    .line 87
    invoke-virtual {v1}, Lcom/zykj/sketch/core/data/AudioTask;->getStartTime()J

    .line 88
    .line 89
    .line 90
    move-result-wide v5

    .line 91
    sub-long/2addr v3, v5

    .line 92
    long-to-int v1, v3

    .line 93
    invoke-virtual {v2, v1}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 94
    .line 95
    .line 96
    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-eqz v1, :cond_5

    .line 101
    .line 102
    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :cond_4
    :goto_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-eqz v1, :cond_5

    .line 111
    .line 112
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_5
    return-void
.end method

.method public pausePlay()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/zykj/sketch/core/player/PlayThread;->pausePlay()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/sketch/core/player/AudioThread;->currentMediaPlayer:Landroid/media/MediaPlayer;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    :try_start_0
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/sketch/core/player/PlayThread;->getPlayStatus()Lcom/zykj/sketch/core/data/PlayStatus;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    sget-object v2, Lcom/zykj/sketch/core/data/PlayStatus;->RECORD_PAUSE:Lcom/zykj/sketch/core/data/PlayStatus;

    .line 19
    .line 20
    if-eq v1, v2, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/zykj/sketch/core/player/PlayThread;->getPlayStatus()Lcom/zykj/sketch/core/data/PlayStatus;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    sget-object v2, Lcom/zykj/sketch/core/data/PlayStatus;->RECORD_WAIT:Lcom/zykj/sketch/core/data/PlayStatus;

    .line 27
    .line 28
    if-ne v1, v2, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    :goto_0
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    goto :goto_2

    .line 37
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 38
    .line 39
    .line 40
    :cond_1
    :goto_2
    iget-object v0, p0, Lcom/zykj/sketch/core/player/AudioThread;->playActionListener:Ljava/util/List;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, Lcom/zykj/sketch/core/listener/PlayActionListener;

    .line 59
    .line 60
    invoke-interface {v1}, Lcom/zykj/sketch/core/listener/PlayActionListener;->onPlayPause()V

    .line 61
    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_2
    return-void
.end method

.method public declared-synchronized reset()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lcom/zykj/sketch/core/player/AudioThread;->pausePlay()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 3
    .line 4
    .line 5
    :try_start_1
    iget-object v0, p0, Lcom/zykj/sketch/core/player/AudioThread;->mediaPlayerList:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Landroid/media/MediaPlayer;

    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/media/MediaPlayer;->isPlaying()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-virtual {v1}, Landroid/media/MediaPlayer;->stop()V

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    goto :goto_2

    .line 35
    :cond_0
    :goto_1
    invoke-virtual {v1}, Landroid/media/MediaPlayer;->release()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :goto_2
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 40
    .line 41
    .line 42
    :cond_1
    iget-object v0, p0, Lcom/zykj/sketch/core/player/AudioThread;->audioTaskList:Ljava/util/List;

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, Lcom/zykj/sketch/core/player/AudioThread;->iterator:Ljava/util/ListIterator;

    .line 49
    .line 50
    iget-object v0, p0, Lcom/zykj/sketch/core/player/AudioThread;->audioTaskList:Ljava/util/List;

    .line 51
    .line 52
    invoke-direct {p0, v0}, Lcom/zykj/sketch/core/player/AudioThread;->initMediaPlayer(Ljava/util/List;)V

    .line 53
    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    iput-object v0, p0, Lcom/zykj/sketch/core/player/AudioThread;->currentMediaPlayer:Landroid/media/MediaPlayer;

    .line 57
    .line 58
    invoke-super {p0}, Lcom/zykj/sketch/core/player/PlayThread;->reset()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 59
    .line 60
    .line 61
    monitor-exit p0

    .line 62
    return-void

    .line 63
    :catchall_1
    move-exception v0

    .line 64
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 65
    throw v0
.end method

.method public resumePlay()V
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/sketch/utils/LogUtils;->Companion:Lcom/zykj/sketch/utils/LogUtils$Companion;

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/utils/LogUtils$Companion;->e(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/sketch/core/player/AudioThread;->initSeekTo()V

    .line 9
    .line 10
    .line 11
    invoke-super {p0}, Lcom/zykj/sketch/core/player/PlayThread;->resumePlay()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/sketch/core/player/AudioThread;->playActionListener:Ljava/util/List;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Lcom/zykj/sketch/core/listener/PlayActionListener;

    .line 33
    .line 34
    invoke-interface {v1}, Lcom/zykj/sketch/core/listener/PlayActionListener;->onPlayStart()V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-void
.end method

.method public run()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/core/player/PlayThread;->getPlayStatus()Lcom/zykj/sketch/core/data/PlayStatus;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/zykj/sketch/core/data/PlayStatus;->RECORD_PAUSE:Lcom/zykj/sketch/core/data/PlayStatus;

    .line 6
    .line 7
    if-eq v0, v1, :cond_7

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/sketch/core/player/PlayThread;->getPlayStatus()Lcom/zykj/sketch/core/data/PlayStatus;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Lcom/zykj/sketch/core/data/PlayStatus;->RECORD_WAIT:Lcom/zykj/sketch/core/data/PlayStatus;

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    goto/16 :goto_3

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/sketch/core/player/PlayThread;->getPlayStatus()Lcom/zykj/sketch/core/data/PlayStatus;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sget-object v1, Lcom/zykj/sketch/core/data/PlayStatus;->RECORD_END:Lcom/zykj/sketch/core/data/PlayStatus;

    .line 24
    .line 25
    if-ne v0, v1, :cond_1

    .line 26
    .line 27
    const-wide/16 v0, 0x0

    .line 28
    .line 29
    iput-wide v0, p0, Lcom/zykj/sketch/core/player/AudioThread;->playTime:J

    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    iget-object v0, p0, Lcom/zykj/sketch/core/player/AudioThread;->iterator:Ljava/util/ListIterator;

    .line 33
    .line 34
    if-eqz v0, :cond_6

    .line 35
    .line 36
    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_6

    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/zykj/sketch/core/player/PlayThread;->getPlayStatus()Lcom/zykj/sketch/core/data/PlayStatus;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    sget-object v2, Lcom/zykj/sketch/core/data/PlayStatus;->RECORD_PAUSE:Lcom/zykj/sketch/core/data/PlayStatus;

    .line 47
    .line 48
    if-eq v1, v2, :cond_7

    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/zykj/sketch/core/player/PlayThread;->getPlayStatus()Lcom/zykj/sketch/core/data/PlayStatus;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    sget-object v2, Lcom/zykj/sketch/core/data/PlayStatus;->RECORD_WAIT:Lcom/zykj/sketch/core/data/PlayStatus;

    .line 55
    .line 56
    if-eq v1, v2, :cond_7

    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/zykj/sketch/core/player/PlayThread;->getPlayStatus()Lcom/zykj/sketch/core/data/PlayStatus;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    sget-object v2, Lcom/zykj/sketch/core/data/PlayStatus;->RECORD_END:Lcom/zykj/sketch/core/data/PlayStatus;

    .line 63
    .line 64
    if-ne v1, v2, :cond_3

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_3
    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Lcom/zykj/sketch/core/data/AudioTask;

    .line 72
    .line 73
    invoke-virtual {v1}, Lcom/zykj/sketch/core/data/AudioTask;->getStartTime()J

    .line 74
    .line 75
    .line 76
    move-result-wide v2

    .line 77
    iget-wide v4, p0, Lcom/zykj/sketch/core/player/AudioThread;->playTime:J

    .line 78
    .line 79
    cmp-long v2, v2, v4

    .line 80
    .line 81
    if-gtz v2, :cond_5

    .line 82
    .line 83
    :try_start_0
    iget-object v2, p0, Lcom/zykj/sketch/core/player/AudioThread;->mediaPlayerList:Ljava/util/List;

    .line 84
    .line 85
    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    add-int/lit8 v3, v3, -0x1

    .line 90
    .line 91
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    check-cast v2, Landroid/media/MediaPlayer;

    .line 96
    .line 97
    iput-object v2, p0, Lcom/zykj/sketch/core/player/AudioThread;->currentMediaPlayer:Landroid/media/MediaPlayer;

    .line 98
    .line 99
    if-eqz v2, :cond_4

    .line 100
    .line 101
    invoke-direct {p0, v2}, Lcom/zykj/sketch/core/player/AudioThread;->resetMediaPlay(Landroid/media/MediaPlayer;)V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :catch_0
    move-exception v1

    .line 106
    goto :goto_2

    .line 107
    :cond_4
    :goto_1
    iget-object v2, p0, Lcom/zykj/sketch/core/player/AudioThread;->currentMediaPlayer:Landroid/media/MediaPlayer;

    .line 108
    .line 109
    if-eqz v2, :cond_2

    .line 110
    .line 111
    iget-wide v3, p0, Lcom/zykj/sketch/core/player/AudioThread;->playTime:J

    .line 112
    .line 113
    invoke-virtual {v1}, Lcom/zykj/sketch/core/data/AudioTask;->getStartTime()J

    .line 114
    .line 115
    .line 116
    move-result-wide v5

    .line 117
    sub-long/2addr v3, v5

    .line 118
    long-to-int v1, v3

    .line 119
    invoke-virtual {v2, v1}, Landroid/media/MediaPlayer;->seekTo(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :goto_2
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_5
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-eqz v1, :cond_6

    .line 132
    .line 133
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    :cond_6
    iget-wide v0, p0, Lcom/zykj/sketch/core/player/AudioThread;->playTime:J

    .line 137
    .line 138
    invoke-direct {p0, v0, v1}, Lcom/zykj/sketch/core/player/AudioThread;->notifyProgress(J)V

    .line 139
    .line 140
    .line 141
    iget-wide v0, p0, Lcom/zykj/sketch/core/player/AudioThread;->playTime:J

    .line 142
    .line 143
    const-wide/16 v2, 0x28

    .line 144
    .line 145
    add-long/2addr v0, v2

    .line 146
    iput-wide v0, p0, Lcom/zykj/sketch/core/player/AudioThread;->playTime:J

    .line 147
    .line 148
    :cond_7
    :goto_3
    return-void
.end method

.method public final seekTo(I)V
    .locals 2

    .line 1
    int-to-long v0, p1

    .line 2
    iput-wide v0, p0, Lcom/zykj/sketch/core/player/AudioThread;->playTime:J

    .line 3
    .line 4
    return-void
.end method

.method public final setData(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/core/data/AudioTask;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "list"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/sketch/core/player/AudioThread;->audioTaskList:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/sketch/core/player/AudioThread;->mediaPlayerList:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/sketch/core/player/AudioThread;->audioTaskList:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 19
    .line 20
    .line 21
    invoke-direct {p0, p1}, Lcom/zykj/sketch/core/player/AudioThread;->initMediaPlayer(Ljava/util/List;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final setProgressListener(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/core/listener/PlayActionListener;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "playActionListener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/sketch/core/player/AudioThread;->playActionListener:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method

.method public declared-synchronized shutdown()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-super {p0}, Lcom/zykj/sketch/core/player/PlayThread;->shutdown()V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/zykj/sketch/core/player/AudioThread;->pausePlay()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 6
    .line 7
    .line 8
    :try_start_1
    iget-object v0, p0, Lcom/zykj/sketch/core/player/AudioThread;->audioTaskList:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/sketch/core/player/AudioThread;->mediaPlayerList:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Landroid/media/MediaPlayer;

    .line 30
    .line 31
    invoke-virtual {v1}, Landroid/media/MediaPlayer;->isPlaying()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    invoke-virtual {v1}, Landroid/media/MediaPlayer;->stop()V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    goto :goto_2

    .line 43
    :cond_0
    :goto_1
    invoke-virtual {v1}, Landroid/media/MediaPlayer;->release()V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    iget-object v0, p0, Lcom/zykj/sketch/core/player/AudioThread;->mediaPlayerList:Ljava/util/List;

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    .line 51
    .line 52
    goto :goto_3

    .line 53
    :goto_2
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 54
    .line 55
    .line 56
    :goto_3
    const/4 v0, 0x0

    .line 57
    iput-object v0, p0, Lcom/zykj/sketch/core/player/AudioThread;->currentMediaPlayer:Landroid/media/MediaPlayer;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 58
    .line 59
    monitor-exit p0

    .line 60
    return-void

    .line 61
    :catchall_1
    move-exception v0

    .line 62
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 63
    throw v0
.end method

.method public startPlay()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/zykj/sketch/core/player/PlayThread;->startPlay()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/sketch/core/player/AudioThread;->playActionListener:Ljava/util/List;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lcom/zykj/sketch/core/listener/PlayActionListener;

    .line 23
    .line 24
    invoke-interface {v1}, Lcom/zykj/sketch/core/listener/PlayActionListener;->onPlayStart()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void
.end method

.method public waitPlay()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/zykj/sketch/core/player/PlayThread;->waitPlay()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/sketch/core/player/AudioThread;->currentMediaPlayer:Landroid/media/MediaPlayer;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    :try_start_0
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/sketch/core/player/PlayThread;->getPlayStatus()Lcom/zykj/sketch/core/data/PlayStatus;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    sget-object v2, Lcom/zykj/sketch/core/data/PlayStatus;->RECORD_PAUSE:Lcom/zykj/sketch/core/data/PlayStatus;

    .line 19
    .line 20
    if-eq v1, v2, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/zykj/sketch/core/player/PlayThread;->getPlayStatus()Lcom/zykj/sketch/core/data/PlayStatus;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    sget-object v2, Lcom/zykj/sketch/core/data/PlayStatus;->RECORD_WAIT:Lcom/zykj/sketch/core/data/PlayStatus;

    .line 27
    .line 28
    if-ne v1, v2, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    :goto_0
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    goto :goto_2

    .line 37
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 38
    .line 39
    .line 40
    :cond_1
    :goto_2
    iget-object v0, p0, Lcom/zykj/sketch/core/player/AudioThread;->playActionListener:Ljava/util/List;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, Lcom/zykj/sketch/core/listener/PlayActionListener;

    .line 59
    .line 60
    invoke-interface {v1}, Lcom/zykj/sketch/core/listener/PlayActionListener;->onWaitPlay()V

    .line 61
    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_2
    return-void
.end method
