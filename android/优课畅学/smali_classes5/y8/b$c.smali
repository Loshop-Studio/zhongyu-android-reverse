.class public Ly8/b$c;
.super Ly8/b$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly8/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public a:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ly8/b$a;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x14

    .line 5
    .line 6
    iput-wide v0, p0, Ly8/b$c;->a:J

    .line 7
    .line 8
    return-void
.end method

.method private declared-synchronized c(Lz8/c;IILz8/e;Z)Z
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    const/4 p2, 0x0

    .line 3
    if-eqz p4, :cond_2

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {p1}, Lz8/c;->s()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-static {}, Lf9/c;->b()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    iget-wide p3, p4, Lz8/e;->a:J

    .line 17
    .line 18
    sub-long/2addr v0, p3

    .line 19
    iget-wide p3, p0, Ly8/b$c;->a:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    cmp-long p1, v0, p3

    .line 22
    .line 23
    if-ltz p1, :cond_1

    .line 24
    .line 25
    monitor-exit p0

    .line 26
    const/4 p1, 0x1

    .line 27
    return p1

    .line 28
    :cond_1
    monitor-exit p0

    .line 29
    return p2

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    throw p1

    .line 33
    :cond_2
    :goto_0
    monitor-exit p0

    .line 34
    return p2
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ly8/b$c;->d()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public b(Lz8/c;IILz8/e;ZLmaster/flame/danmaku/danmaku/model/android/DanmakuContext;)Z
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Ly8/b$c;->c(Lz8/c;IILz8/e;Z)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    iget p3, p1, Lz8/c;->F:I

    .line 8
    .line 9
    or-int/lit8 p3, p3, 0x4

    .line 10
    .line 11
    iput p3, p1, Lz8/c;->F:I

    .line 12
    .line 13
    :cond_0
    return p2
.end method

.method public clear()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ly8/b$c;->d()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public declared-synchronized d()V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    monitor-exit p0

    .line 3
    return-void
.end method
