.class public Lcom/zykj/video/play/controller/TCControllerWindow$a;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/video/play/controller/TCControllerWindow;->t(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/video/play/controller/TCControllerWindow;


# direct methods
.method public constructor <init>(Lcom/zykj/video/play/controller/TCControllerWindow;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow$a;->a:Lcom/zykj/video/play/controller/TCControllerWindow;

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
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow$a;->a:Lcom/zykj/video/play/controller/TCControllerWindow;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/zykj/video/play/controller/TCControllerWindow;->a(Lcom/zykj/video/play/controller/TCControllerWindow;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow$a;->a:Lcom/zykj/video/play/controller/TCControllerWindow;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/zykj/video/play/controller/TCControllerWindow;->x()V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow$a;->a:Lcom/zykj/video/play/controller/TCControllerWindow;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/zykj/video/play/controller/TCControllerWindow;->c(Lcom/zykj/video/play/controller/TCControllerWindow;)Lk5/a;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow$a;->a:Lcom/zykj/video/play/controller/TCControllerWindow;

    .line 20
    .line 21
    invoke-static {p1}, Lcom/zykj/video/play/controller/TCControllerWindow;->c(Lcom/zykj/video/play/controller/TCControllerWindow;)Lk5/a;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow$a;->a:Lcom/zykj/video/play/controller/TCControllerWindow;

    .line 29
    .line 30
    invoke-static {p1}, Lcom/zykj/video/play/controller/TCControllerWindow;->c(Lcom/zykj/video/play/controller/TCControllerWindow;)Lk5/a;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-wide/16 v1, 0x1b58

    .line 35
    .line 36
    invoke-virtual {p1, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 37
    .line 38
    .line 39
    :cond_0
    const/4 p1, 0x1

    .line 40
    return p1
.end method

.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow$a;->a:Lcom/zykj/video/play/controller/TCControllerWindow;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/zykj/video/play/controller/TCControllerWindow;->l(Lcom/zykj/video/play/controller/TCControllerWindow;)Ln5/f;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow$a;->a:Lcom/zykj/video/play/controller/TCControllerWindow;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/zykj/video/play/controller/TCControllerWindow;->l(Lcom/zykj/video/play/controller/TCControllerWindow;)Ln5/f;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow$a;->a:Lcom/zykj/video/play/controller/TCControllerWindow;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iget-object v1, p0, Lcom/zykj/video/play/controller/TCControllerWindow$a;->a:Lcom/zykj/video/play/controller/TCControllerWindow;

    .line 22
    .line 23
    invoke-static {v1}, Lcom/zykj/video/play/controller/TCControllerWindow;->n(Lcom/zykj/video/play/controller/TCControllerWindow;)Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Lcom/zykj/video/play/view/TCPointSeekBar;->getProgress()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-virtual {p1, v0, v1}, Ln5/f;->e(II)V

    .line 32
    .line 33
    .line 34
    :cond_0
    const/4 p1, 0x1

    .line 35
    return p1
.end method

.method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 7

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow$a;->a:Lcom/zykj/video/play/controller/TCControllerWindow;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/video/play/controller/TCControllerWindow;->l(Lcom/zykj/video/play/controller/TCControllerWindow;)Ln5/f;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow$a;->a:Lcom/zykj/video/play/controller/TCControllerWindow;

    .line 15
    .line 16
    invoke-static {v0}, Lcom/zykj/video/play/controller/TCControllerWindow;->m(Lcom/zykj/video/play/controller/TCControllerWindow;)Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow$a;->a:Lcom/zykj/video/play/controller/TCControllerWindow;

    .line 23
    .line 24
    invoke-static {v0}, Lcom/zykj/video/play/controller/TCControllerWindow;->l(Lcom/zykj/video/play/controller/TCControllerWindow;)Ln5/f;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow$a;->a:Lcom/zykj/video/play/controller/TCControllerWindow;

    .line 29
    .line 30
    invoke-static {v0}, Lcom/zykj/video/play/controller/TCControllerWindow;->m(Lcom/zykj/video/play/controller/TCControllerWindow;)Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    move-object v3, p1

    .line 39
    move-object v4, p2

    .line 40
    move v5, p3

    .line 41
    move v6, p4

    .line 42
    invoke-virtual/range {v1 .. v6}, Ln5/f;->a(ILandroid/view/MotionEvent;Landroid/view/MotionEvent;FF)V

    .line 43
    .line 44
    .line 45
    :cond_1
    const/4 p1, 0x1

    .line 46
    return p1

    .line 47
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 48
    return p1
.end method

.method public onSingleTapConfirmed(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow$a;->a:Lcom/zykj/video/play/controller/TCControllerWindow;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/zykj/video/play/controller/TCControllerWindow;->k(Lcom/zykj/video/play/controller/TCControllerWindow;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    return p1
.end method
