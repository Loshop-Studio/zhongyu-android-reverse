.class public Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;
.super Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;
.source "SourceFile"


# instance fields
.field public b:Landroid/view/View;

.field public c:Landroid/widget/ImageView;

.field public d:Landroid/view/View;

.field public e:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    throw v0
.end method

.method public final b()V
    .locals 3

    .line 1
    sget v0, Lio/microshow/rxffmpeg/R$id;->bottomPanel:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->b:Landroid/view/View;

    .line 8
    .line 9
    sget v0, Lio/microshow/rxffmpeg/R$id;->progress_view:I

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Landroid/widget/SeekBar;

    .line 16
    .line 17
    sget v0, Lio/microshow/rxffmpeg/R$id;->time_view:I

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Landroid/widget/TextView;

    .line 24
    .line 25
    sget v0, Lio/microshow/rxffmpeg/R$id;->progressBar:I

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Landroid/widget/ProgressBar;

    .line 32
    .line 33
    sget v0, Lio/microshow/rxffmpeg/R$id;->iv_play:I

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Landroid/widget/ImageView;

    .line 40
    .line 41
    iput-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->c:Landroid/widget/ImageView;

    .line 42
    .line 43
    sget v0, Lio/microshow/rxffmpeg/R$id;->repeatPlay:I

    .line 44
    .line 45
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iput-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->d:Landroid/view/View;

    .line 50
    .line 51
    new-instance v1, Ll5/c;

    .line 52
    .line 53
    const/4 v2, 0x0

    .line 54
    invoke-direct {v1, p0, v2}, Ll5/c;-><init>(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 58
    .line 59
    .line 60
    sget v0, Lio/microshow/rxffmpeg/R$id;->iv_fullscreen:I

    .line 61
    .line 62
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    new-instance v1, Ll5/c;

    .line 67
    .line 68
    const/4 v2, 0x1

    .line 69
    invoke-direct {v1, p0, v2}, Ll5/c;-><init>(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 73
    .line 74
    .line 75
    sget v0, Lio/microshow/rxffmpeg/R$id;->iv_mute:I

    .line 76
    .line 77
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, Landroid/widget/ImageView;

    .line 82
    .line 83
    iput-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->e:Landroid/widget/ImageView;

    .line 84
    .line 85
    new-instance v1, Ll5/c;

    .line 86
    .line 87
    const/4 v2, 0x2

    .line 88
    invoke-direct {v1, p0, v2}, Ll5/c;-><init>(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 92
    .line 93
    .line 94
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->c:Landroid/widget/ImageView;

    .line 95
    .line 96
    new-instance v1, Ll5/c;

    .line 97
    .line 98
    const/4 v2, 0x3

    .line 99
    invoke-direct {v1, p0, v2}, Ll5/c;-><init>(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lio/microshow/rxffmpeg/R$layout;->rxffmpeg_player_controller:I

    .line 2
    .line 3
    return v0
.end method
