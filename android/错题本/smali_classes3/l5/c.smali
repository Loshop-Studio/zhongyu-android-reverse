.class public final Ll5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;


# direct methods
.method public synthetic constructor <init>(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;I)V
    .locals 0

    .line 1
    iput p2, p0, Ll5/c;->a:I

    iput-object p1, p0, Ll5/c;->b:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget p1, p0, Ll5/c;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ll5/c;->b:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;

    .line 7
    .line 8
    iget-object v0, p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->a:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object p1, p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->a:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void

    .line 21
    :pswitch_0
    iget-object p1, p0, Ll5/c;->b:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;

    .line 22
    .line 23
    iget-object v0, p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->a:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {v0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->getVolume()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    iget-object v0, p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->a:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;

    .line 34
    .line 35
    const/16 v1, 0x64

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->setVolume(I)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->e:Landroid/widget/ImageView;

    .line 41
    .line 42
    sget v0, Lio/microshow/rxffmpeg/R$mipmap;->rxffmpeg_player_unmute:I

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    iget-object v0, p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->a:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;

    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    invoke-virtual {v0, v1}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->setVolume(I)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->e:Landroid/widget/ImageView;

    .line 55
    .line 56
    sget v0, Lio/microshow/rxffmpeg/R$mipmap;->rxffmpeg_player_mute:I

    .line 57
    .line 58
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 59
    .line 60
    .line 61
    :cond_2
    :goto_0
    return-void

    .line 62
    :pswitch_1
    iget-object p1, p0, Ll5/c;->b:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;

    .line 63
    .line 64
    iget-object p1, p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->a:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;

    .line 65
    .line 66
    if-eqz p1, :cond_7

    .line 67
    .line 68
    iget-object v0, p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->a:Landroid/content/Context;

    .line 69
    .line 70
    iget v1, p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->d:I

    .line 71
    .line 72
    const/4 v2, -0x1

    .line 73
    const/4 v3, 0x1

    .line 74
    if-ne v1, v3, :cond_4

    .line 75
    .line 76
    if-ne v1, v3, :cond_7

    .line 77
    .line 78
    const/4 v1, 0x0

    .line 79
    invoke-static {v0, v1}, Lt6/a;->u(Landroid/content/Context;Z)Landroid/view/ViewGroup;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    if-nez v0, :cond_3

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_3
    iget-object v3, p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->c:Landroid/widget/FrameLayout;

    .line 87
    .line 88
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 89
    .line 90
    .line 91
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 92
    .line 93
    invoke-direct {v0, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 94
    .line 95
    .line 96
    iget-object v2, p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->c:Landroid/widget/FrameLayout;

    .line 97
    .line 98
    invoke-virtual {p1, v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 99
    .line 100
    .line 101
    iput v1, p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->d:I

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_4
    if-ne v1, v3, :cond_5

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_5
    invoke-static {v0, v3}, Lt6/a;->u(Landroid/content/Context;Z)Landroid/view/ViewGroup;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    if-nez v0, :cond_6

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_6
    iget-object v1, p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->c:Landroid/widget/FrameLayout;

    .line 115
    .line 116
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 117
    .line 118
    .line 119
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 120
    .line 121
    invoke-direct {v1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 122
    .line 123
    .line 124
    iget-object v2, p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->c:Landroid/widget/FrameLayout;

    .line 125
    .line 126
    invoke-virtual {v0, v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 127
    .line 128
    .line 129
    iput v3, p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->d:I

    .line 130
    .line 131
    :cond_7
    :goto_1
    return-void

    .line 132
    :pswitch_2
    iget-object p1, p0, Ll5/c;->b:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;

    .line 133
    .line 134
    iget-object v0, p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->a:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;

    .line 135
    .line 136
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    iget-object p1, p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->d:Landroid/view/View;

    .line 140
    .line 141
    const/16 v0, 0x8

    .line 142
    .line 143
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
