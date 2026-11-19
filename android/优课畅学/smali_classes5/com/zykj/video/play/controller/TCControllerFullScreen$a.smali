.class public Lcom/zykj/video/play/controller/TCControllerFullScreen$a;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/video/play/controller/TCControllerFullScreen;->A(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/video/play/controller/TCControllerFullScreen;


# direct methods
.method public constructor <init>(Lcom/zykj/video/play/controller/TCControllerFullScreen;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$a;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$a;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->i(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_0
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$a;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->j(Lcom/zykj/video/play/controller/TCControllerFullScreen;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$a;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->G()V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$a;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 22
    .line 23
    invoke-static {p1}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->r(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Lk5/a;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$a;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 30
    .line 31
    invoke-static {p1}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->r(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Lk5/a;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$a;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 39
    .line 40
    invoke-static {p1}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->r(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Lk5/a;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-wide/16 v1, 0x1b58

    .line 45
    .line 46
    invoke-virtual {p1, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 47
    .line 48
    .line 49
    :cond_1
    const/4 p1, 0x1

    .line 50
    return p1
.end method

.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$a;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->i(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, 0x1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    return v0

    .line 11
    :cond_0
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$a;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->t(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Ln5/f;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$a;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 20
    .line 21
    invoke-static {p1}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->t(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Ln5/f;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object v1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$a;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    iget-object v2, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$a;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 32
    .line 33
    invoke-static {v2}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->v(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v2}, Lcom/zykj/video/play/view/TCPointSeekBar;->getProgress()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-virtual {p1, v1, v2}, Ln5/f;->e(II)V

    .line 42
    .line 43
    .line 44
    :cond_1
    return v0
.end method

.method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$a;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->i(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    if-eqz p1, :cond_3

    .line 12
    .line 13
    if-nez p2, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$a;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 17
    .line 18
    invoke-static {v0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->t(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Ln5/f;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$a;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 25
    .line 26
    invoke-static {v0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->u(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$a;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 33
    .line 34
    invoke-static {v0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->t(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Ln5/f;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$a;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 39
    .line 40
    invoke-static {v0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->u(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    move-object v3, p1

    .line 49
    move-object v4, p2

    .line 50
    move v5, p3

    .line 51
    move v6, p4

    .line 52
    invoke-virtual/range {v1 .. v6}, Ln5/f;->a(ILandroid/view/MotionEvent;Landroid/view/MotionEvent;FF)V

    .line 53
    .line 54
    .line 55
    :cond_2
    const/4 p1, 0x1

    .line 56
    return p1

    .line 57
    :cond_3
    :goto_0
    return v1
.end method

.method public onSingleTapConfirmed(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$a;->a:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->s(Lcom/zykj/video/play/controller/TCControllerFullScreen;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    return p1
.end method
