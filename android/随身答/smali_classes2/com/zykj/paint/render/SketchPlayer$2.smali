.class Lcom/zykj/paint/render/SketchPlayer$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/paint/render/SketchPlayer;->init(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/paint/render/SketchPlayer;


# direct methods
.method public constructor <init>(Lcom/zykj/paint/render/SketchPlayer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/render/SketchPlayer$2;->this$0:Lcom/zykj/paint/render/SketchPlayer;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 0

    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/zykj/paint/render/SketchPlayer$2;->this$0:Lcom/zykj/paint/render/SketchPlayer;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/zykj/paint/render/SketchPlayer;->access$200(Lcom/zykj/paint/render/SketchPlayer;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {p1, v0}, Lcom/zykj/paint/render/SketchPlayer;->access$102(Lcom/zykj/paint/render/SketchPlayer;Z)Z

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/zykj/paint/render/SketchPlayer$2;->this$0:Lcom/zykj/paint/render/SketchPlayer;

    .line 11
    .line 12
    invoke-static {p1}, Lcom/zykj/paint/render/SketchPlayer;->access$200(Lcom/zykj/paint/render/SketchPlayer;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    iget-object p1, p0, Lcom/zykj/paint/render/SketchPlayer$2;->this$0:Lcom/zykj/paint/render/SketchPlayer;

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/zykj/paint/render/SketchPlayer;->pausePlayer()V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/render/SketchPlayer$2;->this$0:Lcom/zykj/paint/render/SketchPlayer;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/paint/render/SketchPlayer;->access$300(Lcom/zykj/paint/render/SketchPlayer;)Lcom/zykj/paint/render/SketchViewer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1}, Landroid/widget/ProgressBar;->getProgress()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {v0, v1}, Lcom/zykj/paint/render/SketchViewer;->seekToCurrentIndex(I)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iget-object v2, p0, Lcom/zykj/paint/render/SketchPlayer$2;->this$0:Lcom/zykj/paint/render/SketchPlayer;

    .line 16
    .line 17
    invoke-static {v2}, Lcom/zykj/paint/render/SketchPlayer;->access$400(Lcom/zykj/paint/render/SketchPlayer;)Landroid/widget/TextView;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    long-to-int v0, v0

    .line 22
    invoke-static {v0}, Lcom/zykj/paint/util/TimeUtils;->formatTime(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lcom/zykj/paint/render/SketchPlayer$2;->this$0:Lcom/zykj/paint/render/SketchPlayer;

    .line 30
    .line 31
    invoke-static {v1}, Lcom/zykj/paint/render/SketchPlayer;->access$500(Lcom/zykj/paint/render/SketchPlayer;)Landroid/media/MediaPlayer;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    iget-object v1, p0, Lcom/zykj/paint/render/SketchPlayer$2;->this$0:Lcom/zykj/paint/render/SketchPlayer;

    .line 38
    .line 39
    invoke-static {v1}, Lcom/zykj/paint/render/SketchPlayer;->access$500(Lcom/zykj/paint/render/SketchPlayer;)Landroid/media/MediaPlayer;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1, v0}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 44
    .line 45
    .line 46
    :cond_0
    iget-object v0, p0, Lcom/zykj/paint/render/SketchPlayer$2;->this$0:Lcom/zykj/paint/render/SketchPlayer;

    .line 47
    .line 48
    invoke-static {v0}, Lcom/zykj/paint/render/SketchPlayer;->access$100(Lcom/zykj/paint/render/SketchPlayer;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_1

    .line 53
    .line 54
    iget-object v0, p0, Lcom/zykj/paint/render/SketchPlayer$2;->this$0:Lcom/zykj/paint/render/SketchPlayer;

    .line 55
    .line 56
    invoke-static {v0}, Lcom/zykj/paint/render/SketchPlayer;->access$300(Lcom/zykj/paint/render/SketchPlayer;)Lcom/zykj/paint/render/SketchViewer;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {p1}, Landroid/widget/ProgressBar;->getProgress()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    invoke-virtual {v0, p1}, Lcom/zykj/paint/render/SketchViewer;->isEnded(I)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-nez p1, :cond_1

    .line 69
    .line 70
    iget-object p1, p0, Lcom/zykj/paint/render/SketchPlayer$2;->this$0:Lcom/zykj/paint/render/SketchPlayer;

    .line 71
    .line 72
    invoke-virtual {p1}, Lcom/zykj/paint/render/SketchPlayer;->resumePlayer()V

    .line 73
    .line 74
    .line 75
    :cond_1
    return-void
.end method
