.class public Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$PlayerCoreType;
    }
.end annotation


# instance fields
.field public c:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$PlayerCoreType;

.field public d:Landroid/content/Context;

.field public e:Lio/microshow/rxffmpeg/player/MeasureHelper;

.field public f:Landroid/widget/FrameLayout;

.field public g:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;

.field public h:Landroid/view/TextureView;

.field public i:Lio/microshow/rxffmpeg/player/a;

.field public j:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    sget-object p2, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$PlayerCoreType;->c:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$PlayerCoreType;

    iput-object p2, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->c:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$PlayerCoreType;

    const/4 p2, 0x0

    .line 4
    iput p2, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->j:I

    .line 5
    iput-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->d:Landroid/content/Context;

    .line 6
    new-instance p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$a;

    invoke-direct {p1, p0, p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$a;-><init>(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;Landroid/view/View;)V

    iput-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->e:Lio/microshow/rxffmpeg/player/MeasureHelper;

    .line 7
    invoke-virtual {p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->d()V

    const/4 p1, 0x1

    .line 8
    invoke-virtual {p0, p1}, Landroid/view/View;->setKeepScreenOn(Z)V

    return-void
.end method

.method public static synthetic a(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;)I
    .locals 0

    .line 1
    iget p0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->j:I

    .line 2
    .line 3
    return p0
.end method


# virtual methods
.method public b()Z
    .locals 4

    .line 1
    iget v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->j:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ne v0, v2, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->d:Landroid/content/Context;

    .line 9
    .line 10
    invoke-static {v0, v2}, Lic/a;->h(Landroid/content/Context;Z)Landroid/view/ViewGroup;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    return v1

    .line 17
    :cond_1
    iget-object v1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->f:Landroid/widget/FrameLayout;

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 20
    .line 21
    .line 22
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 23
    .line 24
    const/4 v3, -0x1

    .line 25
    invoke-direct {v1, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 26
    .line 27
    .line 28
    iget-object v3, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->f:Landroid/widget/FrameLayout;

    .line 29
    .line 30
    invoke-virtual {v0, v3, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 31
    .line 32
    .line 33
    iput v2, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->j:I

    .line 34
    .line 35
    return v2
.end method

.method public c()Z
    .locals 3

    .line 1
    iget v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->j:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-ne v0, v1, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->d:Landroid/content/Context;

    .line 8
    .line 9
    invoke-static {v0, v2}, Lic/a;->h(Landroid/content/Context;Z)Landroid/view/ViewGroup;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    return v2

    .line 16
    :cond_0
    iget-object v1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->f:Landroid/widget/FrameLayout;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 22
    .line 23
    const/4 v1, -0x1

    .line 24
    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->f:Landroid/widget/FrameLayout;

    .line 28
    .line 29
    invoke-virtual {p0, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 30
    .line 31
    .line 32
    iput v2, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->j:I

    .line 33
    .line 34
    :cond_1
    return v2
.end method

.method public final d()V
    .locals 2

    .line 1
    new-instance v0, Landroid/widget/FrameLayout;

    .line 2
    .line 3
    iget-object v1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->d:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->f:Landroid/widget/FrameLayout;

    .line 9
    .line 10
    const/high16 v1, -0x1000000

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 16
    .line 17
    const/4 v1, -0x1

    .line 18
    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->f:Landroid/widget/FrameLayout;

    .line 22
    .line 23
    invoke-virtual {p0, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public e()Z
    .locals 2

    .line 1
    iget v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->j:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public f()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->i:Lio/microshow/rxffmpeg/player/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lio/microshow/rxffmpeg/player/b;->isPlaying()Z

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

.method public g()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->i:Lio/microshow/rxffmpeg/player/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lio/microshow/rxffmpeg/player/b;->pause()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->g:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->d()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public getContainerView()Landroid/widget/FrameLayout;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->f:Landroid/widget/FrameLayout;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMuteSolo()I
    .locals 3

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->i:Lio/microshow/rxffmpeg/player/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, Lio/microshow/rxffmpeg/player/b;->a()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v2, -0x1

    .line 11
    if-eq v0, v2, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->i:Lio/microshow/rxffmpeg/player/a;

    .line 14
    .line 15
    invoke-interface {v0}, Lio/microshow/rxffmpeg/player/b;->a()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0

    .line 20
    :cond_0
    return v1
.end method

.method public getTextureView()Landroid/view/TextureView;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->h:Landroid/view/TextureView;

    .line 2
    .line 3
    return-object v0
.end method

.method public getVolume()I
    .locals 3

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->i:Lio/microshow/rxffmpeg/player/a;

    .line 2
    .line 3
    const/16 v1, 0x64

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Lio/microshow/rxffmpeg/player/b;->b()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v2, -0x1

    .line 12
    if-eq v0, v2, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->i:Lio/microshow/rxffmpeg/player/a;

    .line 15
    .line 16
    invoke-interface {v0}, Lio/microshow/rxffmpeg/player/b;->b()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    return v0

    .line 21
    :cond_0
    return v1
.end method

.method public h()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->i:Lio/microshow/rxffmpeg/player/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lio/microshow/rxffmpeg/player/a;->f()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public i()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->i:Lio/microshow/rxffmpeg/player/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lio/microshow/rxffmpeg/player/b;->resume()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->g:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->e()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public j()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->c()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->b()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    return v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->e:Lio/microshow/rxffmpeg/player/MeasureHelper;

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->h:Landroid/view/TextureView;

    .line 9
    .line 10
    iget-object v1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->f:Landroid/widget/FrameLayout;

    .line 11
    .line 12
    invoke-virtual {p1, v0, v1}, Lio/microshow/rxffmpeg/player/MeasureHelper;->g(Landroid/view/TextureView;Landroid/widget/FrameLayout;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public onMeasure(II)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->e:Lio/microshow/rxffmpeg/player/MeasureHelper;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p1, p2, v0}, Lio/microshow/rxffmpeg/player/MeasureHelper;->a(II)[I

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const/4 p2, 0x0

    .line 19
    aget p2, p1, p2

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    aget p1, p1, v0

    .line 23
    .line 24
    invoke-virtual {p0, p2, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public setFitModel(Lio/microshow/rxffmpeg/player/MeasureHelper$FitModel;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->e:Lio/microshow/rxffmpeg/player/MeasureHelper;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lio/microshow/rxffmpeg/player/MeasureHelper;->f(Lio/microshow/rxffmpeg/player/MeasureHelper$FitModel;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->e:Lio/microshow/rxffmpeg/player/MeasureHelper;

    .line 11
    .line 12
    invoke-virtual {p1}, Lio/microshow/rxffmpeg/player/MeasureHelper;->e()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public setMuteSolo(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->i:Lio/microshow/rxffmpeg/player/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lio/microshow/rxffmpeg/player/b;->d(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setOnCompleteListener(Lio/microshow/rxffmpeg/player/b$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->i:Lio/microshow/rxffmpeg/player/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lio/microshow/rxffmpeg/player/a;->g(Lio/microshow/rxffmpeg/player/b$a;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setPlayerBackgroundColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->f:Landroid/widget/FrameLayout;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setTextureViewEnabledTouch(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->h:Landroid/view/TextureView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    instance-of v1, v0, Lio/microshow/rxffmpeg/player/ScaleTextureView;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Lio/microshow/rxffmpeg/player/ScaleTextureView;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lio/microshow/rxffmpeg/player/ScaleTextureView;->setEnabledTouch(Z)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public setVolume(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->i:Lio/microshow/rxffmpeg/player/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lio/microshow/rxffmpeg/player/b;->c(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method
