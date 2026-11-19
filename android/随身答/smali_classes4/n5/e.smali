.class public final Ln5/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln5/b;


# instance fields
.field public a:J

.field public b:J

.field public c:J

.field public d:J

.field public e:Z

.field public f:Ls5/i;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Ln5/e;)V
    .locals 0

    .line 1
    invoke-static {p0}, Ln5/e;->j(Ln5/e;)V

    return-void
.end method

.method public static final j(Ln5/e;)V
    .locals 5

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-wide v0, p0, Ln5/e;->b:J

    .line 7
    .line 8
    :goto_0
    iget-boolean v2, p0, Ln5/e;->e:Z

    .line 9
    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    iget-object v2, p0, Ln5/e;->f:Ls5/i;

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0, v0, v1}, Ln5/e;->c(J)J

    .line 17
    .line 18
    .line 19
    move-result-wide v3

    .line 20
    invoke-interface {v2, v3, v4}, Ls5/i;->progress(J)V

    .line 21
    .line 22
    .line 23
    :cond_0
    const/16 v2, 0x18

    .line 24
    .line 25
    int-to-long v2, v2

    .line 26
    add-long/2addr v0, v2

    .line 27
    const-wide/16 v2, 0x18

    .line 28
    .line 29
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    return-void
.end method


# virtual methods
.method public a(JZ)J
    .locals 4

    .line 1
    iget-boolean v0, p0, Ln5/e;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    iget-wide v0, p0, Ln5/e;->d:J

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-wide v0, p0, Ln5/e;->c:J

    .line 11
    .line 12
    :goto_0
    sub-long v0, p1, v0

    .line 13
    .line 14
    if-eqz p3, :cond_1

    .line 15
    .line 16
    iput-wide p1, p0, Ln5/e;->d:J

    .line 17
    .line 18
    return-wide v0

    .line 19
    :cond_1
    iget-wide v2, p0, Ln5/e;->c:J

    .line 20
    .line 21
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    const-string v2, "prevTimeForCommand1"

    .line 26
    .line 27
    invoke-static {v2, p3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    iput-wide p1, p0, Ln5/e;->c:J

    .line 31
    .line 32
    const-string p3, "prevTimeForCommand2"

    .line 33
    .line 34
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {p3, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    return-wide v0

    .line 42
    :cond_2
    const-wide/16 p1, 0x0

    .line 43
    .line 44
    return-wide p1
.end method

.method public c(J)J
    .locals 4

    .line 1
    iget-boolean v0, p0, Ln5/e;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-wide v0, p0, Ln5/e;->a:J

    .line 6
    .line 7
    iget-wide v2, p0, Ln5/e;->b:J

    .line 8
    .line 9
    sub-long v2, p1, v2

    .line 10
    .line 11
    add-long/2addr v0, v2

    .line 12
    iput-wide v0, p0, Ln5/e;->a:J

    .line 13
    .line 14
    iput-wide p1, p0, Ln5/e;->b:J

    .line 15
    .line 16
    :cond_0
    iget-wide p1, p0, Ln5/e;->a:J

    .line 17
    .line 18
    return-wide p1
.end method

.method public d(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Ln5/e;->a:J

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Ln5/e;->e:Z

    .line 5
    .line 6
    return-void
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ln5/e;->e:Z

    .line 2
    .line 3
    return v0
.end method

.method public f(Ls5/i;)V
    .locals 1

    .line 1
    const-string v0, "recordListener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Ln5/e;->f:Ls5/i;

    .line 7
    .line 8
    return-void
.end method

.method public final g(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Ln5/e;->d:J

    .line 2
    .line 3
    add-long/2addr v0, p1

    .line 4
    iput-wide v0, p0, Ln5/e;->d:J

    .line 5
    .line 6
    return-void
.end method

.method public final h(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Ln5/e;->c:J

    .line 2
    .line 3
    add-long/2addr v0, p1

    .line 4
    iput-wide v0, p0, Ln5/e;->c:J

    .line 5
    .line 6
    return-void
.end method

.method public i(J)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Ln5/e;->e:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Ln5/e;->e:Z

    .line 7
    .line 8
    iput-wide p1, p0, Ln5/e;->b:J

    .line 9
    .line 10
    iget-wide v0, p0, Ln5/e;->c:J

    .line 11
    .line 12
    sub-long v0, p1, v0

    .line 13
    .line 14
    iput-wide v0, p0, Ln5/e;->c:J

    .line 15
    .line 16
    iget-wide v0, p0, Ln5/e;->d:J

    .line 17
    .line 18
    sub-long/2addr p1, v0

    .line 19
    iput-wide p1, p0, Ln5/e;->d:J

    .line 20
    .line 21
    iget-object p1, p0, Ln5/e;->f:Ls5/i;

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    invoke-interface {p1}, Ls5/i;->startRecord()V

    .line 26
    .line 27
    .line 28
    :cond_0
    new-instance p1, Ljava/lang/Thread;

    .line 29
    .line 30
    new-instance p2, Ln5/d;

    .line 31
    .line 32
    invoke-direct {p2, p0}, Ln5/d;-><init>(Ln5/e;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p1, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void
.end method

.method public k(J)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Ln5/e;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-wide v0, p0, Ln5/e;->a:J

    .line 6
    .line 7
    iget-wide v2, p0, Ln5/e;->b:J

    .line 8
    .line 9
    sub-long v2, p1, v2

    .line 10
    .line 11
    add-long/2addr v0, v2

    .line 12
    iput-wide v0, p0, Ln5/e;->a:J

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-boolean v0, p0, Ln5/e;->e:Z

    .line 16
    .line 17
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    iput-wide v0, p0, Ln5/e;->b:J

    .line 20
    .line 21
    iput-wide v0, p0, Ln5/e;->c:J

    .line 22
    .line 23
    iget-wide v0, p0, Ln5/e;->d:J

    .line 24
    .line 25
    sub-long v0, p1, v0

    .line 26
    .line 27
    iput-wide v0, p0, Ln5/e;->d:J

    .line 28
    .line 29
    iget-object v0, p0, Ln5/e;->f:Ls5/i;

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0, p1, p2}, Ln5/e;->c(J)J

    .line 34
    .line 35
    .line 36
    move-result-wide p1

    .line 37
    invoke-interface {v0, p1, p2}, Ls5/i;->progress(J)V

    .line 38
    .line 39
    .line 40
    :cond_0
    iget-object p1, p0, Ln5/e;->f:Ls5/i;

    .line 41
    .line 42
    if-eqz p1, :cond_1

    .line 43
    .line 44
    invoke-interface {p1}, Ls5/i;->stopRecord()V

    .line 45
    .line 46
    .line 47
    :cond_1
    return-void
.end method
