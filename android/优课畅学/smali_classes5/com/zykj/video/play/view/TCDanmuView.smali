.class public Lcom/zykj/video/play/view/TCDanmuView;
.super Lg9/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/video/play/view/TCDanmuView$c;
    }
.end annotation


# instance fields
.field public r:Landroid/content/Context;

.field public s:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

.field public t:Z

.field public u:Landroid/os/HandlerThread;

.field public v:Lcom/zykj/video/play/view/TCDanmuView$c;

.field public w:Lc9/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lg9/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    new-instance p2, Lcom/zykj/video/play/view/TCDanmuView$b;

    .line 5
    .line 6
    invoke-direct {p2, p0}, Lcom/zykj/video/play/view/TCDanmuView$b;-><init>(Lcom/zykj/video/play/view/TCDanmuView;)V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Lcom/zykj/video/play/view/TCDanmuView;->w:Lc9/a;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lcom/zykj/video/play/view/TCDanmuView;->I(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static synthetic C(Lcom/zykj/video/play/view/TCDanmuView;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/video/play/view/TCDanmuView;->t:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic D(Lcom/zykj/video/play/view/TCDanmuView;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/video/play/view/TCDanmuView;->H()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic E(Lcom/zykj/video/play/view/TCDanmuView;)Lcom/zykj/video/play/view/TCDanmuView$c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/view/TCDanmuView;->v:Lcom/zykj/video/play/view/TCDanmuView$c;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic F(Lcom/zykj/video/play/view/TCDanmuView;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/video/play/view/TCDanmuView;->G(Ljava/lang/String;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final G(Ljava/lang/String;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/view/TCDanmuView;->s:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 2
    .line 3
    iget-object v0, v0, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->A:La9/c;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, v1}, La9/c;->b(I)Lz8/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iput-object p1, v0, Lz8/c;->c:Ljava/lang/CharSequence;

    .line 13
    .line 14
    const/4 p1, 0x5

    .line 15
    iput p1, v0, Lz8/c;->m:I

    .line 16
    .line 17
    iget-object p1, p0, Lcom/zykj/video/play/view/TCDanmuView;->r:Landroid/content/Context;

    .line 18
    .line 19
    const/high16 v1, 0x41a00000    # 20.0f

    .line 20
    .line 21
    invoke-static {p1, v1}, Ln5/a;->a(Landroid/content/Context;F)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    int-to-float p1, p1

    .line 26
    iput p1, v0, Lz8/c;->k:F

    .line 27
    .line 28
    const/4 p1, -0x1

    .line 29
    iput p1, v0, Lz8/c;->f:I

    .line 30
    .line 31
    invoke-virtual {p0}, Lg9/b;->getCurrentTime()J

    .line 32
    .line 33
    .line 34
    move-result-wide v1

    .line 35
    invoke-virtual {v0, v1, v2}, Lz8/c;->B(J)V

    .line 36
    .line 37
    .line 38
    if-eqz p2, :cond_0

    .line 39
    .line 40
    const p1, -0xff0100

    .line 41
    .line 42
    .line 43
    iput p1, v0, Lz8/c;->l:I

    .line 44
    .line 45
    :cond_0
    invoke-virtual {p0, v0}, Lg9/b;->h(Lz8/c;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    return-void
.end method

.method public final H()V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/HandlerThread;

    .line 2
    .line 3
    const-string v1, "Danmu"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lcom/zykj/video/play/view/TCDanmuView;->u:Landroid/os/HandlerThread;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 11
    .line 12
    .line 13
    new-instance v0, Lcom/zykj/video/play/view/TCDanmuView$c;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/zykj/video/play/view/TCDanmuView;->u:Landroid/os/HandlerThread;

    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-direct {v0, p0, v1}, Lcom/zykj/video/play/view/TCDanmuView$c;-><init>(Lcom/zykj/video/play/view/TCDanmuView;Landroid/os/Looper;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lcom/zykj/video/play/view/TCDanmuView;->v:Lcom/zykj/video/play/view/TCDanmuView$c;

    .line 25
    .line 26
    return-void
.end method

.method public final I(Landroid/content/Context;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/zykj/video/play/view/TCDanmuView;->r:Landroid/content/Context;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-virtual {p0, p1}, Lg9/b;->i(Z)V

    .line 5
    .line 6
    .line 7
    new-instance p1, Lcom/zykj/video/play/view/TCDanmuView$a;

    .line 8
    .line 9
    invoke-direct {p1, p0}, Lcom/zykj/video/play/view/TCDanmuView$a;-><init>(Lcom/zykj/video/play/view/TCDanmuView;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lg9/b;->setCallback(Ly8/c$d;)V

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->a()Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lcom/zykj/video/play/view/TCDanmuView;->s:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 20
    .line 21
    iget-object v0, p0, Lcom/zykj/video/play/view/TCDanmuView;->w:Lc9/a;

    .line 22
    .line 23
    invoke-virtual {p0, v0, p1}, Lg9/b;->t(Lc9/a;Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public J(Z)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "onToggleControllerView on:"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "DanmakuView"

    .line 19
    .line 20
    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/16 v0, 0x3e9

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    iget-object p1, p0, Lcom/zykj/video/play/view/TCDanmuView;->v:Lcom/zykj/video/play/view/TCDanmuView$c;

    .line 28
    .line 29
    const-wide/16 v1, 0x64

    .line 30
    .line 31
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageAtTime(IJ)Z

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    iget-object p1, p0, Lcom/zykj/video/play/view/TCDanmuView;->v:Lcom/zykj/video/play/view/TCDanmuView$c;

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public u()V
    .locals 2

    .line 1
    invoke-super {p0}, Lg9/b;->u()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/zykj/video/play/view/TCDanmuView;->t:Z

    .line 6
    .line 7
    iget-object v0, p0, Lcom/zykj/video/play/view/TCDanmuView;->v:Lcom/zykj/video/play/view/TCDanmuView$c;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Lcom/zykj/video/play/view/TCDanmuView;->v:Lcom/zykj/video/play/view/TCDanmuView$c;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lcom/zykj/video/play/view/TCDanmuView;->u:Landroid/os/HandlerThread;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, Lcom/zykj/video/play/view/TCDanmuView;->u:Landroid/os/HandlerThread;

    .line 25
    .line 26
    :cond_1
    return-void
.end method
