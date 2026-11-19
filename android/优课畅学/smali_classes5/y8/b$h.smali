.class public Ly8/b$h;
.super Ly8/b$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly8/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "h"
.end annotation


# instance fields
.field public a:I

.field public b:Lz8/c;

.field public c:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ly8/b$a;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Ly8/b$h;->a:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Ly8/b$h;->b:Lz8/c;

    .line 9
    .line 10
    const/high16 v0, 0x3f800000    # 1.0f

    .line 11
    .line 12
    iput v0, p0, Ly8/b$h;->c:F

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ly8/b$h;->e(Ljava/lang/Integer;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public declared-synchronized b(Lz8/c;IILz8/e;ZLmaster/flame/danmaku/danmaku/model/android/DanmakuContext;)Z
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual/range {p0 .. p6}, Ly8/b$h;->c(Lz8/c;IILz8/e;ZLmaster/flame/danmaku/danmaku/model/android/DanmakuContext;)Z

    .line 3
    .line 4
    .line 5
    move-result p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 6
    move-object p3, p1

    .line 7
    move-object p1, p0

    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    :try_start_1
    iget p4, p3, Lz8/c;->F:I

    .line 11
    .line 12
    or-int/lit8 p4, p4, 0x2

    .line 13
    .line 14
    iput p4, p3, Lz8/c;->F:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    :goto_0
    move-object p2, v0

    .line 19
    goto :goto_2

    .line 20
    :cond_0
    :goto_1
    monitor-exit p0

    .line 21
    return p2

    .line 22
    :catchall_1
    move-exception v0

    .line 23
    move-object p1, p0

    .line 24
    goto :goto_0

    .line 25
    :goto_2
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 26
    throw p2
.end method

.method public final c(Lz8/c;IILz8/e;ZLmaster/flame/danmaku/danmaku/model/android/DanmakuContext;)Z
    .locals 4

    .line 1
    iget p3, p0, Ly8/b$h;->a:I

    .line 2
    .line 3
    const/4 p4, 0x0

    .line 4
    if-lez p3, :cond_5

    .line 5
    .line 6
    invoke-virtual {p1}, Lz8/c;->m()I

    .line 7
    .line 8
    .line 9
    move-result p3

    .line 10
    const/4 p5, 0x1

    .line 11
    if-eq p3, p5, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    iget-object p3, p0, Ly8/b$h;->b:Lz8/c;

    .line 15
    .line 16
    if-eqz p3, :cond_4

    .line 17
    .line 18
    invoke-virtual {p3}, Lz8/c;->w()Z

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    if-eqz p3, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-virtual {p1}, Lz8/c;->b()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    iget-object p3, p0, Ly8/b$h;->b:Lz8/c;

    .line 30
    .line 31
    invoke-virtual {p3}, Lz8/c;->b()J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    sub-long/2addr v0, v2

    .line 36
    const-wide/16 v2, 0x0

    .line 37
    .line 38
    cmp-long p3, v0, v2

    .line 39
    .line 40
    if-ltz p3, :cond_2

    .line 41
    .line 42
    long-to-float p3, v0

    .line 43
    iget-object p6, p6, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->A:La9/c;

    .line 44
    .line 45
    iget-object p6, p6, La9/c;->f:Lz8/f;

    .line 46
    .line 47
    iget-wide v0, p6, Lz8/f;->c:J

    .line 48
    .line 49
    long-to-float p6, v0

    .line 50
    iget v0, p0, Ly8/b$h;->c:F

    .line 51
    .line 52
    mul-float/2addr p6, v0

    .line 53
    cmpg-float p3, p3, p6

    .line 54
    .line 55
    if-gez p3, :cond_2

    .line 56
    .line 57
    return p5

    .line 58
    :cond_2
    iget p3, p0, Ly8/b$h;->a:I

    .line 59
    .line 60
    if-le p2, p3, :cond_3

    .line 61
    .line 62
    return p5

    .line 63
    :cond_3
    iput-object p1, p0, Ly8/b$h;->b:Lz8/c;

    .line 64
    .line 65
    return p4

    .line 66
    :cond_4
    :goto_0
    iput-object p1, p0, Ly8/b$h;->b:Lz8/c;

    .line 67
    .line 68
    :cond_5
    :goto_1
    return p4
.end method

.method public clear()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ly8/b$h;->d()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public declared-synchronized d()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x0

    .line 3
    :try_start_0
    iput-object v0, p0, Ly8/b$h;->b:Lz8/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    monitor-exit p0

    .line 6
    return-void

    .line 7
    :catchall_0
    move-exception v0

    .line 8
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    throw v0
.end method

.method public e(Ljava/lang/Integer;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ly8/b$h;->d()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget v1, p0, Ly8/b$h;->a:I

    .line 12
    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    div-int/lit8 p1, p1, 0x5

    .line 24
    .line 25
    add-int/2addr v0, p1

    .line 26
    iput v0, p0, Ly8/b$h;->a:I

    .line 27
    .line 28
    const/high16 p1, 0x3f800000    # 1.0f

    .line 29
    .line 30
    int-to-float v0, v0

    .line 31
    div-float/2addr p1, v0

    .line 32
    iput p1, p0, Ly8/b$h;->c:F

    .line 33
    .line 34
    :cond_1
    :goto_0
    return-void
.end method
