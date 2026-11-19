.class Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$1;
.super Lio/microshow/rxffmpeg/player/MeasureHelper;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;


# direct methods
.method public constructor <init>(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$1;->this$0:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lio/microshow/rxffmpeg/player/MeasureHelper;-><init>(Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public isFullScreen()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$1;->this$0:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;

    .line 2
    .line 3
    invoke-static {v0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->access$000(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method
