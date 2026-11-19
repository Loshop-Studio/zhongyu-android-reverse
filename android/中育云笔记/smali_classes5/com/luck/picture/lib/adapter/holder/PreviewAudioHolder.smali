.class public Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;
.super Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;
.source "SourceFile"


# instance fields
.field public final j:Landroid/os/Handler;

.field public k:Landroid/widget/ImageView;

.field public l:Landroid/widget/TextView;

.field public m:Landroid/widget/TextView;

.field public n:Landroid/widget/TextView;

.field public o:Landroid/widget/SeekBar;

.field public p:Landroid/widget/ImageView;

.field public q:Landroid/widget/ImageView;

.field public r:Landroid/media/MediaPlayer;

.field public s:Z

.field public t:Ljava/lang/Runnable;

.field public final u:Landroid/media/MediaPlayer$OnCompletionListener;

.field public final v:Landroid/media/MediaPlayer$OnErrorListener;

.field public final w:Landroid/media/MediaPlayer$OnPreparedListener;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;-><init>(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->j:Landroid/os/Handler;

    .line 14
    .line 15
    new-instance v0, Landroid/media/MediaPlayer;

    .line 16
    .line 17
    invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->r:Landroid/media/MediaPlayer;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput-boolean v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->s:Z

    .line 24
    .line 25
    new-instance v0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$d;

    .line 26
    .line 27
    invoke-direct {v0, p0}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$d;-><init>(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->t:Ljava/lang/Runnable;

    .line 31
    .line 32
    new-instance v0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$a;

    .line 33
    .line 34
    invoke-direct {v0, p0}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$a;-><init>(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->u:Landroid/media/MediaPlayer$OnCompletionListener;

    .line 38
    .line 39
    new-instance v0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$b;

    .line 40
    .line 41
    invoke-direct {v0, p0}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$b;-><init>(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->v:Landroid/media/MediaPlayer$OnErrorListener;

    .line 45
    .line 46
    new-instance v0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$c;

    .line 47
    .line 48
    invoke-direct {v0, p0}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$c;-><init>(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;)V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->w:Landroid/media/MediaPlayer$OnPreparedListener;

    .line 52
    .line 53
    sget v0, Lcom/luck/picture/lib/R$id;->iv_play_video:I

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Landroid/widget/ImageView;

    .line 60
    .line 61
    iput-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->k:Landroid/widget/ImageView;

    .line 62
    .line 63
    sget v0, Lcom/luck/picture/lib/R$id;->tv_audio_name:I

    .line 64
    .line 65
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, Landroid/widget/TextView;

    .line 70
    .line 71
    iput-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->l:Landroid/widget/TextView;

    .line 72
    .line 73
    sget v0, Lcom/luck/picture/lib/R$id;->tv_current_time:I

    .line 74
    .line 75
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, Landroid/widget/TextView;

    .line 80
    .line 81
    iput-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->n:Landroid/widget/TextView;

    .line 82
    .line 83
    sget v0, Lcom/luck/picture/lib/R$id;->tv_total_duration:I

    .line 84
    .line 85
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, Landroid/widget/TextView;

    .line 90
    .line 91
    iput-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->m:Landroid/widget/TextView;

    .line 92
    .line 93
    sget v0, Lcom/luck/picture/lib/R$id;->music_seek_bar:I

    .line 94
    .line 95
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, Landroid/widget/SeekBar;

    .line 100
    .line 101
    iput-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->o:Landroid/widget/SeekBar;

    .line 102
    .line 103
    sget v0, Lcom/luck/picture/lib/R$id;->iv_play_back:I

    .line 104
    .line 105
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    check-cast v0, Landroid/widget/ImageView;

    .line 110
    .line 111
    iput-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->p:Landroid/widget/ImageView;

    .line 112
    .line 113
    sget v0, Lcom/luck/picture/lib/R$id;->iv_play_fast:I

    .line 114
    .line 115
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    check-cast p1, Landroid/widget/ImageView;

    .line 120
    .line 121
    iput-object p1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->q:Landroid/widget/ImageView;

    .line 122
    .line 123
    return-void
.end method

.method public static synthetic m(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;)Landroid/media/MediaPlayer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->r:Landroid/media/MediaPlayer;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic n(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->j:Landroid/os/Handler;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic o(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->F()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic p(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->C(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic q(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->N()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic r(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->D()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic s(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->L()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic t(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->A()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic u(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->I(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic v(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->B()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic w(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->s:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic x(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->G()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic y(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->M(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic z(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->O()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final A()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->o:Landroid/widget/SeekBar;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getProgress()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    int-to-long v0, v0

    .line 8
    const-wide/16 v2, 0xbb8

    .line 9
    .line 10
    cmp-long v0, v0, v2

    .line 11
    .line 12
    if-lez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->o:Landroid/widget/SeekBar;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getMax()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->o:Landroid/widget/SeekBar;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getProgress()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    int-to-long v4, v1

    .line 31
    add-long/2addr v4, v2

    .line 32
    long-to-int v1, v4

    .line 33
    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->o:Landroid/widget/SeekBar;

    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getProgress()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-virtual {p0, v0}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->I(I)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->r:Landroid/media/MediaPlayer;

    .line 46
    .line 47
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->o:Landroid/widget/SeekBar;

    .line 48
    .line 49
    invoke-virtual {v1}, Landroid/widget/ProgressBar;->getProgress()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public final B()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->r:Landroid/media/MediaPlayer;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->s:Z

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, v0}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->C(Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->O()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final C(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->O()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->o:Landroid/widget/SeekBar;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->n:Landroid/widget/TextView;

    .line 13
    .line 14
    const-string v1, "00:00"

    .line 15
    .line 16
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0, v0}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->H(Z)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->k:Landroid/widget/ImageView;

    .line 23
    .line 24
    sget v0, Lcom/luck/picture/lib/R$drawable;->ps_ic_audio_play:I

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->i:Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder$a;

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    invoke-interface {p1, v0}, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder$a;->c(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void
.end method

.method public final D()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->N()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-virtual {p0, v0}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->H(Z)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->k:Landroid/widget/ImageView;

    .line 9
    .line 10
    sget v1, Lcom/luck/picture/lib/R$drawable;->ps_ic_audio_stop:I

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public E()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->j:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->t:Ljava/lang/Runnable;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->r:Landroid/media/MediaPlayer;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->K()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->r:Landroid/media/MediaPlayer;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->r:Landroid/media/MediaPlayer;

    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final F()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->s:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->r:Landroid/media/MediaPlayer;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->r:Landroid/media/MediaPlayer;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final G()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->r:Landroid/media/MediaPlayer;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->o:Landroid/widget/SeekBar;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/widget/ProgressBar;->getProgress()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->r:Landroid/media/MediaPlayer;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->N()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->D()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final H(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->p:Landroid/widget/ImageView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->q:Landroid/widget/ImageView;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 9
    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->p:Landroid/widget/ImageView;

    .line 14
    .line 15
    const/high16 v0, 0x3f800000    # 1.0f

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->q:Landroid/widget/ImageView;

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->p:Landroid/widget/ImageView;

    .line 27
    .line 28
    const/high16 v0, 0x3f000000    # 0.5f

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->q:Landroid/widget/ImageView;

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final I(I)V
    .locals 2

    .line 1
    int-to-long v0, p1

    .line 2
    invoke-static {v0, v1}, La7/d;->b(J)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->n:Landroid/widget/TextView;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final J()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->r:Landroid/media/MediaPlayer;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->u:Landroid/media/MediaPlayer$OnCompletionListener;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->r:Landroid/media/MediaPlayer;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->v:Landroid/media/MediaPlayer$OnErrorListener;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->r:Landroid/media/MediaPlayer;

    .line 16
    .line 17
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->w:Landroid/media/MediaPlayer$OnPreparedListener;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final K()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->r:Landroid/media/MediaPlayer;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->r:Landroid/media/MediaPlayer;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->r:Landroid/media/MediaPlayer;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final L()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->o:Landroid/widget/SeekBar;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getProgress()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    int-to-long v0, v0

    .line 8
    const-wide/16 v2, 0xbb8

    .line 9
    .line 10
    cmp-long v0, v0, v2

    .line 11
    .line 12
    if-gez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->o:Landroid/widget/SeekBar;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->o:Landroid/widget/SeekBar;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getProgress()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    int-to-long v4, v1

    .line 28
    sub-long/2addr v4, v2

    .line 29
    long-to-int v1, v4

    .line 30
    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->o:Landroid/widget/SeekBar;

    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getProgress()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    invoke-virtual {p0, v0}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->I(I)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->r:Landroid/media/MediaPlayer;

    .line 43
    .line 44
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->o:Landroid/widget/SeekBar;

    .line 45
    .line 46
    invoke-virtual {v1}, Landroid/widget/ProgressBar;->getProgress()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final M(Ljava/lang/String;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {p1}, Ll6/c;->c(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->r:Landroid/media/MediaPlayer;

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {v0, v1, p1}, Landroid/media/MediaPlayer;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    move-exception p1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->r:Landroid/media/MediaPlayer;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->r:Landroid/media/MediaPlayer;

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->prepare()V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->r:Landroid/media/MediaPlayer;

    .line 36
    .line 37
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->o:Landroid/widget/SeekBar;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getProgress()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-virtual {p1, v0}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->r:Landroid/media/MediaPlayer;

    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->start()V

    .line 49
    .line 50
    .line 51
    const/4 p1, 0x0

    .line 52
    iput-boolean p1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->s:Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    .line 54
    return-void

    .line 55
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final N()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->j:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->t:Ljava/lang/Runnable;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final O()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->j:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->t:Ljava/lang/Runnable;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public a(Lcom/luck/picture/lib/entity/LocalMedia;I)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->g()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->o()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-static {v0, v1}, La7/d;->f(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->B()J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    invoke-static {v1, v2}, La7/i;->e(J)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const/4 v2, -0x1

    .line 22
    invoke-virtual {p0, p1, v2, v2}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->e(Lcom/luck/picture/lib/entity/LocalMedia;II)V

    .line 23
    .line 24
    .line 25
    new-instance v2, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->q()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v3, "\n"

    .line 38
    .line 39
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v3, " - "

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    new-instance v4, Landroid/text/SpannableStringBuilder;

    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-direct {v4, v5}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 60
    .line 61
    .line 62
    new-instance v5, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->indexOf(Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    add-int/2addr v0, v1

    .line 89
    new-instance v2, Landroid/text/style/AbsoluteSizeSpan;

    .line 90
    .line 91
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 92
    .line 93
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    const/high16 v5, 0x41400000    # 12.0f

    .line 98
    .line 99
    invoke-static {v3, v5}, La7/e;->a(Landroid/content/Context;F)I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    invoke-direct {v2, v3}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    .line 104
    .line 105
    .line 106
    const/16 v3, 0x11

    .line 107
    .line 108
    invoke-virtual {v4, v2, v1, v0, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 109
    .line 110
    .line 111
    new-instance v2, Landroid/text/style/ForegroundColorSpan;

    .line 112
    .line 113
    const v5, -0x9a9a9b

    .line 114
    .line 115
    .line 116
    invoke-direct {v2, v5}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v4, v2, v1, v0, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 120
    .line 121
    .line 122
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->l:Landroid/widget/TextView;

    .line 123
    .line 124
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 125
    .line 126
    .line 127
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->m:Landroid/widget/TextView;

    .line 128
    .line 129
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->p()J

    .line 130
    .line 131
    .line 132
    move-result-wide v1

    .line 133
    invoke-static {v1, v2}, La7/d;->b(J)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 138
    .line 139
    .line 140
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->o:Landroid/widget/SeekBar;

    .line 141
    .line 142
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->p()J

    .line 143
    .line 144
    .line 145
    move-result-wide v1

    .line 146
    long-to-int v1, v1

    .line 147
    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 148
    .line 149
    .line 150
    const/4 v0, 0x0

    .line 151
    invoke-virtual {p0, v0}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->H(Z)V

    .line 152
    .line 153
    .line 154
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->p:Landroid/widget/ImageView;

    .line 155
    .line 156
    new-instance v1, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$g;

    .line 157
    .line 158
    invoke-direct {v1, p0}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$g;-><init>(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 162
    .line 163
    .line 164
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->q:Landroid/widget/ImageView;

    .line 165
    .line 166
    new-instance v1, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$h;

    .line 167
    .line 168
    invoke-direct {v1, p0}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$h;-><init>(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 172
    .line 173
    .line 174
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->o:Landroid/widget/SeekBar;

    .line 175
    .line 176
    new-instance v1, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$i;

    .line 177
    .line 178
    invoke-direct {v1, p0}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$i;-><init>(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 182
    .line 183
    .line 184
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 185
    .line 186
    new-instance v1, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$j;

    .line 187
    .line 188
    invoke-direct {v1, p0}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$j;-><init>(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 192
    .line 193
    .line 194
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->k:Landroid/widget/ImageView;

    .line 195
    .line 196
    new-instance v1, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$k;

    .line 197
    .line 198
    invoke-direct {v1, p0, p1, p2}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$k;-><init>(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;Lcom/luck/picture/lib/entity/LocalMedia;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 202
    .line 203
    .line 204
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 205
    .line 206
    new-instance v0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$l;

    .line 207
    .line 208
    invoke-direct {v0, p0, p1}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$l;-><init>(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;Lcom/luck/picture/lib/entity/LocalMedia;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 212
    .line 213
    .line 214
    return-void
.end method

.method public b(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method public e(Lcom/luck/picture/lib/entity/LocalMedia;II)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->l:Landroid/widget/TextView;

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    sget p3, Lcom/luck/picture/lib/R$drawable;->ps_ic_audio_play_cover:I

    .line 5
    .line 6
    invoke-virtual {p1, p2, p3, p2, p2}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(IIII)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->h:Lcom/luck/picture/lib/photoview/PhotoView;

    .line 2
    .line 3
    new-instance v1, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$e;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$e;-><init>(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/photoview/PhotoView;->setOnViewTapListener(Lx6/j;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public g(Lcom/luck/picture/lib/entity/LocalMedia;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->h:Lcom/luck/picture/lib/photoview/PhotoView;

    .line 2
    .line 3
    new-instance v1, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$f;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$f;-><init>(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;Lcom/luck/picture/lib/entity/LocalMedia;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/photoview/PhotoView;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public h()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->s:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->J()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-virtual {p0, v0}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->C(Z)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public i()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->s:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->j:Landroid/os/Handler;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->t:Ljava/lang/Runnable;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->K()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->F()V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-virtual {p0, v0}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->C(Z)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
