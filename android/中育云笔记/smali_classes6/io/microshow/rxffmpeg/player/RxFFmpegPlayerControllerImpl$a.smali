.class public Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;


# direct methods
.method public constructor <init>(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$a;->c:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$a;->c:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;

    .line 2
    .line 3
    iget-object p1, p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->c:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;

    .line 4
    .line 5
    invoke-virtual {p1}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->h()V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$a;->c:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;

    .line 9
    .line 10
    invoke-static {p1}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->f(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/16 v0, 0x8

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
