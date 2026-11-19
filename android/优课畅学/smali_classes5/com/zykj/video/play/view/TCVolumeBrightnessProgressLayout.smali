.class public Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout$b;
    }
.end annotation


# instance fields
.field public a:Landroid/widget/ImageView;

.field public b:Landroid/widget/ProgressBar;

.field public c:Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout$b;

.field public d:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/16 p2, 0x3e8

    .line 5
    .line 6
    iput p2, p0, Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;->d:I

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;->a(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget v0, Lcom/zykj/video/play/R$layout;->superplayer_video_volume_brightness_progress_layout:I

    .line 6
    .line 7
    invoke-virtual {p1, v0, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_iv_center:I

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Landroid/widget/ImageView;

    .line 17
    .line 18
    iput-object p1, p0, Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;->a:Landroid/widget/ImageView;

    .line 19
    .line 20
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_pb_progress_bar:I

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Landroid/widget/ProgressBar;

    .line 27
    .line 28
    iput-object p1, p0, Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;->b:Landroid/widget/ProgressBar;

    .line 29
    .line 30
    new-instance p1, Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout$b;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-direct {p1, p0, v0}, Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout$b;-><init>(Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout$a;)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;->c:Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout$b;

    .line 37
    .line 38
    const/16 p1, 0x8

    .line 39
    .line 40
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public b()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;->c:Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout$b;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;->c:Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout$b;

    .line 11
    .line 12
    iget v1, p0, Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;->d:I

    .line 13
    .line 14
    int-to-long v1, v1

    .line 15
    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public setDuration(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;->d:I

    .line 2
    .line 3
    return-void
.end method

.method public setImageResource(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;->a:Landroid/widget/ImageView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setProgress(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;->b:Landroid/widget/ProgressBar;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
