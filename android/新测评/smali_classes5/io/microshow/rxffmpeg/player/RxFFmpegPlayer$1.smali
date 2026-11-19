.class Lio/microshow/rxffmpeg/player/RxFFmpegPlayer$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->onCompletionNative()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/functions/Consumer<",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;


# direct methods
.method public constructor <init>(Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer$1;->this$0:Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Long;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 2
    iget-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer$1;->this$0:Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;

    iget-object v0, p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->path:Ljava/lang/String;

    iget-boolean v1, p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->looping:Z

    invoke-virtual {p1, v0, v1}, Lio/microshow/rxffmpeg/player/BaseMediaPlayer;->play(Ljava/lang/String;Z)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer$1;->accept(Ljava/lang/Long;)V

    return-void
.end method
