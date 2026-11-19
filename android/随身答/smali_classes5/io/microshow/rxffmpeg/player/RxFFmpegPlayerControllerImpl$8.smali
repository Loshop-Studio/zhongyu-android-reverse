.class Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->onTimeUpdate(Lio/microshow/rxffmpeg/player/IMediaPlayer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;

.field final synthetic val$currentTime:I

.field final synthetic val$totalTime:I


# direct methods
.method public constructor <init>(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$8;->this$0:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;

    .line 2
    .line 3
    iput p2, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$8;->val$totalTime:I

    .line 4
    .line 5
    iput p3, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$8;->val$currentTime:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetTextI18n"
        }
    .end annotation

    .line 1
    iget v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$8;->val$totalTime:I

    .line 2
    .line 3
    if-gtz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$8;->this$0:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;

    .line 6
    .line 7
    invoke-static {v0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->access$200(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/16 v1, 0x8

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$8;->this$0:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;

    .line 18
    .line 19
    invoke-static {v0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->access$200(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$8;->this$0:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;

    .line 28
    .line 29
    invoke-static {v0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->access$300(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;)Landroid/widget/TextView;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    iget v2, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$8;->val$currentTime:I

    .line 39
    .line 40
    iget v3, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$8;->val$totalTime:I

    .line 41
    .line 42
    invoke-static {v2, v3}, Lio/microshow/rxffmpeg/player/Helper;->secdsToDateFormat(II)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v2, " / "

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    iget v2, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$8;->val$totalTime:I

    .line 55
    .line 56
    invoke-static {v2, v2}, Lio/microshow/rxffmpeg/player/Helper;->secdsToDateFormat(II)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$8;->this$0:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;

    .line 71
    .line 72
    invoke-static {v0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->access$100(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_1

    .line 77
    .line 78
    iget v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$8;->val$totalTime:I

    .line 79
    .line 80
    if-lez v0, :cond_1

    .line 81
    .line 82
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$8;->this$0:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;

    .line 83
    .line 84
    invoke-static {v0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->access$400(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;)Landroid/widget/SeekBar;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    iget v1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$8;->val$currentTime:I

    .line 89
    .line 90
    mul-int/lit8 v1, v1, 0x64

    .line 91
    .line 92
    iget v2, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$8;->val$totalTime:I

    .line 93
    .line 94
    div-int/2addr v1, v2

    .line 95
    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 96
    .line 97
    .line 98
    :cond_1
    return-void
.end method
