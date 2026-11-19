.class public Lcom/xuexiang/xui/widget/imageview/preview/ui/VideoPlayerActivity;
.super La/b/c/g;
.source ""


# static fields
.field public static final synthetic p:I


# instance fields
.field public o:Landroid/widget/VideoView;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, La/b/c/g;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, La/k/b/p;->onCreate(Landroid/os/Bundle;)V

    # RE layout layout/preview_activity_video_player (0x7f0c005c), APK res/layout/preview_activity_video_player.xml
    const p1, 0x7f0c005c

    invoke-virtual {p0, p1}, La/b/c/g;->setContentView(I)V

    const p1, 0x7f09024c

    invoke-virtual {p0, p1}, La/b/c/g;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/VideoView;

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/VideoPlayerActivity;->o:Landroid/widget/VideoView;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "com.xuexiang.xui.widget.preview.KEY_URL"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const p1, 0x7f0f007d

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/VideoPlayerActivity;->o:Landroid/widget/VideoView;

    invoke-virtual {v0, p1}, Landroid/widget/VideoView;->setVideoPath(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/VideoPlayerActivity;->o:Landroid/widget/VideoView;

    new-instance v0, Lcom/xuexiang/xui/widget/imageview/preview/ui/VideoPlayerActivity$a;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/VideoPlayerActivity$a;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/VideoPlayerActivity;)V

    invoke-virtual {p1, v0}, Landroid/widget/VideoView;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/VideoPlayerActivity;->o:Landroid/widget/VideoView;

    invoke-virtual {p1}, Landroid/widget/VideoView;->start()V

    const p1, 0x7f0901a5

    invoke-virtual {p0, p1}, La/b/c/g;->findViewById(I)Landroid/view/View;

    move-result-object p1

    new-instance v0, Lcom/xuexiang/xui/widget/imageview/preview/ui/VideoPlayerActivity$b;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/imageview/preview/ui/VideoPlayerActivity$b;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/VideoPlayerActivity;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public onPause()V
    .locals 1

    invoke-super {p0}, La/k/b/p;->onPause()V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/VideoPlayerActivity;->o:Landroid/widget/VideoView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/VideoView;->pause()V

    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, La/k/b/p;->onResume()V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/VideoPlayerActivity;->o:Landroid/widget/VideoView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/VideoView;->isPlaying()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/VideoPlayerActivity;->o:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->start()V

    :cond_0
    return-void
.end method

.method public onStop()V
    .locals 1

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/VideoPlayerActivity;->o:Landroid/widget/VideoView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/VideoView;->stopPlayback()V

    .line 2
    :cond_0
    invoke-super {p0}, La/b/c/g;->onStop()V

    return-void
.end method
