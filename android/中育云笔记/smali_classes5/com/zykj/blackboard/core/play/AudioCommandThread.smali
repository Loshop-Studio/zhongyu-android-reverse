# RE note 本类字节码直接引用的读写或显示接口包括文件流。
.class public final Lcom/zykj/blackboard/core/play/AudioCommandThread;
.super Lz9/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/play/AudioCommandThread$a;
    }
.end annotation


# instance fields
.field public j:J

.field public k:J

.field public l:Ljava/util/ListIterator;

.field public m:Ljava/lang/String;

.field public n:Ljava/util/ListIterator;

.field public o:J

.field public p:Landroid/media/MediaPlayer;

.field public q:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lz9/e;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->m:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public static final K(Landroid/media/MediaPlayer;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/media/MediaPlayer;->start()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final L(Lcom/zykj/blackboard/core/play/AudioCommandThread;Landroid/media/MediaPlayer;)V
    .locals 0

    .line 1
    const-string p1, "this$0"

    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->E()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static final N(Lcom/zykj/blackboard/core/play/AudioCommandThread;Landroid/media/MediaPlayer;)V
    .locals 0

    .line 1
    const-string p1, "this$0"

    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->q:Z

    .line 8
    .line 9
    return-void
.end method

.method public static final O(Lcom/zykj/blackboard/core/play/AudioCommandThread;Landroid/media/MediaPlayer;)V
    .locals 0

    .line 1
    const-string p1, "this$0"

    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->E()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic v(Lcom/zykj/blackboard/core/play/AudioCommandThread;Landroid/media/MediaPlayer;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->L(Lcom/zykj/blackboard/core/play/AudioCommandThread;Landroid/media/MediaPlayer;)V

    return-void
.end method

.method public static synthetic w(Landroid/media/MediaPlayer;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->K(Landroid/media/MediaPlayer;)V

    return-void
.end method

.method public static synthetic x(Lcom/zykj/blackboard/core/play/AudioCommandThread;Landroid/media/MediaPlayer;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->N(Lcom/zykj/blackboard/core/play/AudioCommandThread;Landroid/media/MediaPlayer;)V

    return-void
.end method

.method public static synthetic y(Lcom/zykj/blackboard/core/play/AudioCommandThread;Landroid/media/MediaPlayer;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->O(Lcom/zykj/blackboard/core/play/AudioCommandThread;Landroid/media/MediaPlayer;)V

    return-void
.end method


# virtual methods
.method public final A(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;)Z
    .locals 8

    .line 1
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->t()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    iget-wide v2, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->k:J

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->r()J

    .line 16
    .line 17
    .line 18
    move-result-wide v4

    .line 19
    cmp-long v0, v2, v4

    .line 20
    .line 21
    if-ltz v0, :cond_1

    .line 22
    .line 23
    iget-wide v2, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->k:J

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->r()J

    .line 26
    .line 27
    .line 28
    move-result-wide v4

    .line 29
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->t()J

    .line 30
    .line 31
    .line 32
    move-result-wide v6

    .line 33
    add-long/2addr v4, v6

    .line 34
    cmp-long p1, v2, v4

    .line 35
    .line 36
    if-gez p1, :cond_1

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    return p1

    .line 40
    :cond_1
    return v1
.end method

.method public final B()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->n:Ljava/util/ListIterator;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 17
    .line 18
    new-instance v1, Ljava/io/File;

    .line 19
    .line 20
    iget-object v2, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->m:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->getFileName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    new-instance v0, Ljava/io/FileInputStream;

    .line 30
    .line 31
    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 32
    .line 33
    .line 34
    :try_start_0
    invoke-static {v0}, Lcom/zykj/board/EzyCommand$CommandSource;->p(Ljava/io/InputStream;)Lcom/zykj/board/EzyCommand$CommandSource;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource;->f()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-interface {v1}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iput-object v1, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->l:Ljava/util/ListIterator;

    .line 47
    .line 48
    sget-object v1, Lqc/q;->a:Lqc/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    invoke-static {v0, v1}, Lcd/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    return v0

    .line 56
    :catchall_0
    move-exception v1

    .line 57
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 58
    :catchall_1
    move-exception v2

    .line 59
    invoke-static {v0, v1}, Lcd/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    throw v2

    .line 63
    :cond_0
    return v1
.end method

.method public final C(Ljava/util/ListIterator;)Z
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/ListIterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_4

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;

    .line 16
    .line 17
    iget-wide v2, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->k:J

    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->r()J

    .line 20
    .line 21
    .line 22
    move-result-wide v4

    .line 23
    cmp-long v2, v2, v4

    .line 24
    .line 25
    const-string v3, "Audio"

    .line 26
    .line 27
    if-gez v2, :cond_2

    .line 28
    .line 29
    const-string v1, "\u65f6\u95f4\u6ca1\u5230"

    .line 30
    .line 31
    invoke-static {v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    :cond_1
    return v0

    .line 44
    :cond_2
    invoke-virtual {p0, v1}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->A(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_3

    .line 49
    .line 50
    const-string v2, "\u8fd9\u8fb9\u5f00\u59cb\u64ad\u653e"

    .line 51
    .line 52
    invoke-static {v3, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    iget-wide v2, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->k:J

    .line 56
    .line 57
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->r()J

    .line 58
    .line 59
    .line 60
    move-result-wide v4

    .line 61
    sub-long/2addr v2, v4

    .line 62
    invoke-virtual {p0, v1, v2, v3}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->J(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;J)V

    .line 63
    .line 64
    .line 65
    :cond_3
    iget-wide v2, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->k:J

    .line 66
    .line 67
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->r()J

    .line 68
    .line 69
    .line 70
    move-result-wide v4

    .line 71
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->t()J

    .line 72
    .line 73
    .line 74
    move-result-wide v6

    .line 75
    add-long/2addr v4, v6

    .line 76
    sub-long/2addr v2, v4

    .line 77
    iput-wide v2, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->k:J

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_4
    const/4 p1, 0x1

    .line 81
    return p1
.end method

.method public final D(Ljava/util/ListIterator;Lhd/a;)Z
    .locals 7

    .line 1
    :goto_0
    invoke-interface {p1}, Ljava/util/ListIterator;->hasNext()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;

    .line 12
    .line 13
    iget-wide v1, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->k:J

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->r()J

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    cmp-long v1, v1, v3

    .line 20
    .line 21
    if-gez v1, :cond_1

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    if-eqz p2, :cond_0

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    :cond_0
    const/4 p1, 0x1

    .line 33
    return p1

    .line 34
    :cond_1
    invoke-virtual {p0, v0}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->A(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    iget-wide v1, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->k:J

    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->r()J

    .line 43
    .line 44
    .line 45
    move-result-wide v3

    .line 46
    sub-long/2addr v1, v3

    .line 47
    invoke-virtual {p0, v0, v1, v2}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->M(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;J)Lz9/e;

    .line 48
    .line 49
    .line 50
    invoke-interface {p2}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    :cond_2
    iget-wide v1, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->k:J

    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->r()J

    .line 56
    .line 57
    .line 58
    move-result-wide v3

    .line 59
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->t()J

    .line 60
    .line 61
    .line 62
    move-result-wide v5

    .line 63
    add-long/2addr v3, v5

    .line 64
    sub-long/2addr v1, v3

    .line 65
    iput-wide v1, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->k:J

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    const/4 p1, 0x0

    .line 69
    return p1
.end method

.method public final E()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->p:Landroid/media/MediaPlayer;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catch_0
    move-exception v0

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    :goto_0
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    goto :goto_2

    .line 24
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 25
    .line 26
    .line 27
    :cond_1
    :goto_2
    const/4 v0, 0x0

    .line 28
    iput-object v0, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->p:Landroid/media/MediaPlayer;

    .line 29
    .line 30
    return-void
.end method

.method public final F(JLhd/a;)V
    .locals 1

    .line 1
    const-string v0, "callBack"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-wide p1, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->j:J

    .line 7
    .line 8
    iput-wide p1, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->k:J

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->E()V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->n:Ljava/util/ListIterator;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    :goto_0
    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    if-eqz p2, :cond_0

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-wide/16 p1, 0x32

    .line 28
    .line 29
    invoke-static {p1, p2}, Ljava/lang/Thread;->sleep(J)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->B()Z

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p3}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->z(Lhd/a;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final G(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->o:J

    .line 2
    .line 3
    return-void
.end method

.method public final H(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lia/c;->d:Lia/c$a;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lia/c$a;->c(Ljava/lang/String;)Lcom/zykj/board/EzyRouterRecord$RouterRecord;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->C()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->n:Ljava/util/ListIterator;

    .line 21
    .line 22
    iput-object p1, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->m:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->B()Z

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final I(F)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->p:Landroid/media/MediaPlayer;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getPlaybackParams()Landroid/media/PlaybackParams;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1, p1}, Landroid/media/PlaybackParams;->setSpeed(F)Landroid/media/PlaybackParams;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setPlaybackParams(Landroid/media/PlaybackParams;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getPlaybackParams()Landroid/media/PlaybackParams;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1, p1}, Landroid/media/PlaybackParams;->setSpeed(F)Landroid/media/PlaybackParams;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setPlaybackParams(Landroid/media/PlaybackParams;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void
.end method

.method public final J(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;J)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->k()Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sget-object v1, Lcom/zykj/blackboard/core/play/AudioCommandThread$a;->a:[I

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    aget v0, v1, v0

    .line 16
    .line 17
    :goto_0
    const/4 v1, 0x1

    .line 18
    if-ne v0, v1, :cond_7

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->n()Lcom/google/protobuf/ByteString;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->t(Lcom/google/protobuf/ByteString;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->E()V

    .line 29
    .line 30
    .line 31
    new-instance v0, Ljava/io/File;

    .line 32
    .line 33
    sget-object v1, Lia/c;->d:Lia/c$a;

    .line 34
    .line 35
    iget-object v2, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->m:Ljava/lang/String;

    .line 36
    .line 37
    sget-object v3, Lcom/zykj/blackboard/enums/DocumentType;->d:Lcom/zykj/blackboard/enums/DocumentType;

    .line 38
    .line 39
    invoke-virtual {v1, v2, v3}, Lia/c$a;->a(Ljava/lang/String;Lcom/zykj/blackboard/enums/DocumentType;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->getFileName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-eqz p1, :cond_7

    .line 55
    .line 56
    new-instance p1, Landroid/media/MediaPlayer;

    .line 57
    .line 58
    invoke-direct {p1}, Landroid/media/MediaPlayer;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object p1, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->p:Landroid/media/MediaPlayer;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {p1, v0}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lz9/e;->e()Lq9/e;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    const/16 v0, 0x10

    .line 75
    .line 76
    if-eqz p1, :cond_1

    .line 77
    .line 78
    invoke-virtual {p1}, Lq9/e;->a()I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    goto :goto_1

    .line 83
    :cond_1
    move p1, v0

    .line 84
    :goto_1
    if-eq p1, v0, :cond_3

    .line 85
    .line 86
    iget-object p1, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->p:Landroid/media/MediaPlayer;

    .line 87
    .line 88
    if-eqz p1, :cond_3

    .line 89
    .line 90
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getPlaybackParams()Landroid/media/PlaybackParams;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {p0}, Lz9/e;->e()Lq9/e;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    if-eqz v2, :cond_2

    .line 99
    .line 100
    invoke-virtual {v2}, Lq9/e;->a()I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    goto :goto_2

    .line 105
    :cond_2
    move v2, v0

    .line 106
    :goto_2
    int-to-float v2, v2

    .line 107
    const/high16 v3, 0x3f800000    # 1.0f

    .line 108
    .line 109
    mul-float/2addr v2, v3

    .line 110
    int-to-float v0, v0

    .line 111
    div-float/2addr v2, v0

    .line 112
    invoke-virtual {v1, v2}, Landroid/media/PlaybackParams;->setSpeed(F)Landroid/media/PlaybackParams;

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, v1}, Landroid/media/MediaPlayer;->setPlaybackParams(Landroid/media/PlaybackParams;)V

    .line 116
    .line 117
    .line 118
    :cond_3
    iget-object p1, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->p:Landroid/media/MediaPlayer;

    .line 119
    .line 120
    if-eqz p1, :cond_4

    .line 121
    .line 122
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->prepare()V

    .line 123
    .line 124
    .line 125
    :cond_4
    iget-object p1, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->p:Landroid/media/MediaPlayer;

    .line 126
    .line 127
    if-eqz p1, :cond_5

    .line 128
    .line 129
    new-instance v0, Lha/a;

    .line 130
    .line 131
    invoke-direct {v0}, Lha/a;-><init>()V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1, v0}, Landroid/media/MediaPlayer;->setOnSeekCompleteListener(Landroid/media/MediaPlayer$OnSeekCompleteListener;)V

    .line 135
    .line 136
    .line 137
    :cond_5
    iget-object p1, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->p:Landroid/media/MediaPlayer;

    .line 138
    .line 139
    if-eqz p1, :cond_6

    .line 140
    .line 141
    long-to-int p2, p2

    .line 142
    invoke-virtual {p1, p2}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 143
    .line 144
    .line 145
    :cond_6
    iget-object p1, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->p:Landroid/media/MediaPlayer;

    .line 146
    .line 147
    if-eqz p1, :cond_7

    .line 148
    .line 149
    new-instance p2, Lha/b;

    .line 150
    .line 151
    invoke-direct {p2, p0}, Lha/b;-><init>(Lcom/zykj/blackboard/core/play/AudioCommandThread;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1, p2}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 155
    .line 156
    .line 157
    :cond_7
    return-void
.end method

.method public final M(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;J)Lz9/e;
    .locals 6

    .line 1
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->k()Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sget-object v1, Lcom/zykj/blackboard/core/play/AudioCommandThread$a;->a:[I

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    aget v0, v1, v0

    .line 16
    .line 17
    :goto_0
    const/4 v1, 0x0

    .line 18
    const/4 v2, 0x1

    .line 19
    if-ne v0, v2, :cond_7

    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->n()Lcom/google/protobuf/ByteString;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->t(Lcom/google/protobuf/ByteString;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->E()V

    .line 30
    .line 31
    .line 32
    new-instance v0, Ljava/io/File;

    .line 33
    .line 34
    sget-object v3, Lia/c;->d:Lia/c$a;

    .line 35
    .line 36
    iget-object v4, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->m:Ljava/lang/String;

    .line 37
    .line 38
    sget-object v5, Lcom/zykj/blackboard/enums/DocumentType;->d:Lcom/zykj/blackboard/enums/DocumentType;

    .line 39
    .line 40
    invoke-virtual {v3, v4, v5}, Lia/c$a;->a(Ljava/lang/String;Lcom/zykj/blackboard/enums/DocumentType;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->getFileName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-direct {v0, v3, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_7

    .line 56
    .line 57
    new-instance p1, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    .line 61
    .line 62
    const-string v3, "\u97f3\u9891\u6587\u4ef6\u8def\u5f84 --> "

    .line 63
    .line 64
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    const-string v3, "AudioCommandThread"

    .line 79
    .line 80
    invoke-static {v3, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    new-instance p1, Landroid/media/MediaPlayer;

    .line 84
    .line 85
    invoke-direct {p1}, Landroid/media/MediaPlayer;-><init>()V

    .line 86
    .line 87
    .line 88
    iput-object p1, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->p:Landroid/media/MediaPlayer;

    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {p1, v0}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, Lz9/e;->e()Lq9/e;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    const/16 v0, 0x10

    .line 102
    .line 103
    if-eqz p1, :cond_1

    .line 104
    .line 105
    invoke-virtual {p1}, Lq9/e;->a()I

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    goto :goto_1

    .line 110
    :cond_1
    move p1, v0

    .line 111
    :goto_1
    if-eq p1, v0, :cond_3

    .line 112
    .line 113
    iget-object p1, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->p:Landroid/media/MediaPlayer;

    .line 114
    .line 115
    if-eqz p1, :cond_3

    .line 116
    .line 117
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getPlaybackParams()Landroid/media/PlaybackParams;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-virtual {p0}, Lz9/e;->e()Lq9/e;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    if-eqz v4, :cond_2

    .line 126
    .line 127
    invoke-virtual {v4}, Lq9/e;->a()I

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    goto :goto_2

    .line 132
    :cond_2
    move v4, v0

    .line 133
    :goto_2
    int-to-float v4, v4

    .line 134
    const/high16 v5, 0x3f800000    # 1.0f

    .line 135
    .line 136
    mul-float/2addr v4, v5

    .line 137
    int-to-float v0, v0

    .line 138
    div-float/2addr v4, v0

    .line 139
    invoke-virtual {v3, v4}, Landroid/media/PlaybackParams;->setSpeed(F)Landroid/media/PlaybackParams;

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1, v3}, Landroid/media/MediaPlayer;->setPlaybackParams(Landroid/media/PlaybackParams;)V

    .line 143
    .line 144
    .line 145
    :cond_3
    iget-object p1, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->p:Landroid/media/MediaPlayer;

    .line 146
    .line 147
    if-eqz p1, :cond_4

    .line 148
    .line 149
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->prepare()V

    .line 150
    .line 151
    .line 152
    :cond_4
    iget-object p1, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->p:Landroid/media/MediaPlayer;

    .line 153
    .line 154
    if-eqz p1, :cond_5

    .line 155
    .line 156
    new-instance v0, Lha/c;

    .line 157
    .line 158
    invoke-direct {v0, p0}, Lha/c;-><init>(Lcom/zykj/blackboard/core/play/AudioCommandThread;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p1, v0}, Landroid/media/MediaPlayer;->setOnSeekCompleteListener(Landroid/media/MediaPlayer$OnSeekCompleteListener;)V

    .line 162
    .line 163
    .line 164
    :cond_5
    iput-boolean v2, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->q:Z

    .line 165
    .line 166
    iget-object p1, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->p:Landroid/media/MediaPlayer;

    .line 167
    .line 168
    if-eqz p1, :cond_6

    .line 169
    .line 170
    long-to-int p2, p2

    .line 171
    invoke-virtual {p1, p2}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 172
    .line 173
    .line 174
    :cond_6
    iget-object p1, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->p:Landroid/media/MediaPlayer;

    .line 175
    .line 176
    if-eqz p1, :cond_7

    .line 177
    .line 178
    new-instance p2, Lha/d;

    .line 179
    .line 180
    invoke-direct {p2, p0}, Lha/d;-><init>(Lcom/zykj/blackboard/core/play/AudioCommandThread;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1, p2}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 184
    .line 185
    .line 186
    :cond_7
    return-object v1
.end method

.method public k()V
    .locals 2

    .line 1
    invoke-super {p0}, Lz9/e;->k()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->p:Landroid/media/MediaPlayer;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    :try_start_0
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catch_0
    move-exception v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 20
    .line 21
    .line 22
    :cond_0
    :goto_0
    return-void
.end method

.method public l()V
    .locals 2

    .line 1
    invoke-super {p0}, Lz9/e;->l()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->k:J

    .line 7
    .line 8
    iput-wide v0, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->j:J

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->E()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public m()V
    .locals 1

    .line 1
    invoke-super {p0}, Lz9/e;->m()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->p:Landroid/media/MediaPlayer;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    :try_start_0
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catch_0
    move-exception v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 14
    .line 15
    .line 16
    :cond_0
    :goto_0
    return-void
.end method

.method public run()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lz9/e;->f()Lcom/zykj/blackboard/enums/PlayStatus;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/zykj/blackboard/enums/PlayStatus;->f:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {p0}, Lz9/e;->f()Lcom/zykj/blackboard/enums/PlayStatus;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v1, Lcom/zykj/blackboard/enums/PlayStatus;->h:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 15
    .line 16
    if-ne v0, v1, :cond_1

    .line 17
    .line 18
    const-wide/16 v0, 0x0

    .line 19
    .line 20
    iput-wide v0, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->j:J

    .line 21
    .line 22
    iput-wide v0, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->k:J

    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->l:Ljava/util/ListIterator;

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->C(Ljava/util/ListIterator;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    invoke-virtual {p0}, Lz9/e;->f()Lcom/zykj/blackboard/enums/PlayStatus;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sget-object v1, Lcom/zykj/blackboard/enums/PlayStatus;->e:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 38
    .line 39
    if-eq v0, v1, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0}, Lz9/e;->f()Lcom/zykj/blackboard/enums/PlayStatus;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sget-object v1, Lcom/zykj/blackboard/enums/PlayStatus;->g:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 46
    .line 47
    if-ne v0, v1, :cond_3

    .line 48
    .line 49
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->B()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    const-string v0, "Audio"

    .line 56
    .line 57
    const-string v1, "\u6211\u6709 \u547d\u4ee4\uff01"

    .line 58
    .line 59
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    iget-wide v0, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->k:J

    .line 64
    .line 65
    invoke-virtual {p0}, Lz9/e;->e()Lq9/e;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    const/16 v3, 0x10

    .line 70
    .line 71
    if-eqz v2, :cond_4

    .line 72
    .line 73
    invoke-virtual {v2}, Lq9/e;->a()I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    goto :goto_1

    .line 78
    :cond_4
    move v2, v3

    .line 79
    :goto_1
    int-to-long v4, v2

    .line 80
    add-long/2addr v0, v4

    .line 81
    iput-wide v0, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->k:J

    .line 82
    .line 83
    iget-wide v0, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->j:J

    .line 84
    .line 85
    invoke-virtual {p0}, Lz9/e;->e()Lq9/e;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    if-eqz v2, :cond_5

    .line 90
    .line 91
    invoke-virtual {v2}, Lq9/e;->a()I

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    :cond_5
    int-to-long v2, v3

    .line 96
    add-long/2addr v0, v2

    .line 97
    iput-wide v0, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->j:J

    .line 98
    .line 99
    iget-wide v2, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->o:J

    .line 100
    .line 101
    cmp-long v2, v0, v2

    .line 102
    .line 103
    if-lez v2, :cond_6

    .line 104
    .line 105
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->u()V

    .line 106
    .line 107
    .line 108
    iget-wide v0, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->o:J

    .line 109
    .line 110
    invoke-virtual {p0, v0, v1}, Lz9/e;->j(J)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_6
    invoke-virtual {p0, v0, v1}, Lz9/e;->j(J)V

    .line 115
    .line 116
    .line 117
    return-void
.end method

.method public s()V
    .locals 0

    .line 1
    invoke-super {p0}, Lz9/e;->s()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->E()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public u()V
    .locals 0

    .line 1
    invoke-super {p0}, Lz9/e;->u()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->E()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final z(Lhd/a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->l:Ljava/util/ListIterator;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    :cond_0
    sget-object v1, Lcom/zykj/blackboard/core/play/AudioCommandThread$fastLoading$1$1;->c:Lcom/zykj/blackboard/core/play/AudioCommandThread$fastLoading$1$1;

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->D(Ljava/util/ListIterator;Lhd/a;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->B()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    :cond_1
    :goto_0
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/play/AudioCommandThread;->q:Z

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    const-wide/16 v0, 0x10

    .line 24
    .line 25
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    invoke-interface {p1}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    return-void
.end method
