.class public Lcom/zykj/video/play/controller/TCControllerFullScreen;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"

# interfaces
.implements Lk5/b;
.implements Landroid/view/View$OnClickListener;
.implements Lcom/zykj/video/play/view/TCVodMoreView$c;
.implements Lcom/zykj/video/play/view/TCVodQualityView$b;
.implements Lcom/zykj/video/play/view/TCPointSeekBar$d;
.implements Lcom/zykj/video/play/view/TCPointSeekBar$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/video/play/controller/TCControllerFullScreen$e;
    }
.end annotation


# instance fields
.field public A:Ln5/f;

.field public B:Z

.field public C:Z

.field public D:I

.field public E:I

.field public F:J

.field public G:J

.field public H:J

.field public I:Z

.field public J:Z

.field public K:Lcom/tencent/rtmp/TXImageSprite;

.field public L:Ljava/util/List;

.field public M:I

.field public N:Lj5/g;

.field public O:Ljava/util/List;

.field public P:Z

.field public a:Landroid/widget/RelativeLayout;

.field public b:Landroid/widget/LinearLayout;

.field public c:Landroid/widget/ImageView;

.field public d:Landroid/widget/TextView;

.field public e:Landroid/widget/TextView;

.field public f:Landroid/widget/ImageView;

.field public g:Landroid/widget/TextView;

.field public h:Landroid/widget/TextView;

.field public i:Lcom/zykj/video/play/view/TCPointSeekBar;

.field public j:Landroid/widget/LinearLayout;

.field public k:Landroid/widget/ProgressBar;

.field public l:Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;

.field public m:Lcom/zykj/video/play/view/TCVideoProgressLayout;

.field public n:Landroid/widget/TextView;

.field public o:Landroid/widget/ImageView;

.field public p:Landroid/widget/ImageView;

.field public q:Landroid/widget/ImageView;

.field public r:Landroid/widget/ImageView;

.field public s:Landroid/widget/ImageView;

.field public t:Lcom/zykj/video/play/view/TCVodQualityView;

.field public u:Lcom/zykj/video/play/view/TCVodMoreView;

.field public v:Landroid/widget/TextView;

.field public w:Lk5/c;

.field public x:Lk5/a;

.field public y:Lcom/zykj/video/play/controller/TCControllerFullScreen$e;

.field public z:Landroid/view/GestureDetector;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/4 p2, -0x1

    .line 5
    iput p2, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->E:I

    .line 6
    .line 7
    iput p2, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->M:I

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->A(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static synthetic i(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->J:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic j(Lcom/zykj/video/play/controller/TCControllerFullScreen;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->M()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic k(Lcom/zykj/video/play/controller/TCControllerFullScreen;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->D:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic l(Lcom/zykj/video/play/controller/TCControllerFullScreen;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->G:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static synthetic m(Lcom/zykj/video/play/controller/TCControllerFullScreen;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->setThumbnail(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic n(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->L:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic o(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->v:Landroid/widget/TextView;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic p(Lcom/zykj/video/play/controller/TCControllerFullScreen;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->z(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic q(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Landroid/widget/ImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->r:Landroid/widget/ImageView;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic r(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Lk5/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->x:Lk5/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic s(Lcom/zykj/video/play/controller/TCControllerFullScreen;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->J()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private setThumbnail(I)V
    .locals 2

    .line 1
    int-to-float p1, p1

    .line 2
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->i:Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 3
    .line 4
    invoke-virtual {v0}, Lcom/zykj/video/play/view/TCPointSeekBar;->getMax()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    int-to-float v0, v0

    .line 9
    div-float/2addr p1, v0

    .line 10
    iget-wide v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->F:J

    .line 11
    .line 12
    long-to-float v0, v0

    .line 13
    mul-float/2addr v0, p1

    .line 14
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->K:Lcom/tencent/rtmp/TXImageSprite;

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Lcom/tencent/rtmp/TXImageSprite;->getThumbnail(F)Landroid/graphics/Bitmap;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->m:Lcom/zykj/video/play/view/TCVideoProgressLayout;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Lcom/zykj/video/play/view/TCVideoProgressLayout;->setThumbnail(Landroid/graphics/Bitmap;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method public static synthetic t(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Ln5/f;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->A:Ln5/f;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic u(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->l:Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic v(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Lcom/zykj/video/play/view/TCPointSeekBar;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->i:Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic w(Lcom/zykj/video/play/controller/TCControllerFullScreen;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->C:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic x(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Lcom/zykj/video/play/view/TCVideoProgressLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->m:Lcom/zykj/video/play/view/TCVideoProgressLayout;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic y(Lcom/zykj/video/play/controller/TCControllerFullScreen;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->F:J

    .line 2
    .line 3
    return-wide v0
.end method


# virtual methods
.method public final A(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->B(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lk5/a;

    .line 5
    .line 6
    invoke-direct {p1, p0}, Lk5/a;-><init>(Lk5/b;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->x:Lk5/a;

    .line 10
    .line 11
    new-instance p1, Landroid/view/GestureDetector;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Lcom/zykj/video/play/controller/TCControllerFullScreen$a;

    .line 18
    .line 19
    invoke-direct {v1, p0}, Lcom/zykj/video/play/controller/TCControllerFullScreen$a;-><init>(Lcom/zykj/video/play/controller/TCControllerFullScreen;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p1, v0, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->z:Landroid/view/GestureDetector;

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    invoke-virtual {p1, v0}, Landroid/view/GestureDetector;->setIsLongpressEnabled(Z)V

    .line 29
    .line 30
    .line 31
    new-instance p1, Ln5/f;

    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-direct {p1, v0}, Ln5/f;-><init>(Landroid/content/Context;)V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->A:Ln5/f;

    .line 41
    .line 42
    new-instance v0, Lcom/zykj/video/play/controller/TCControllerFullScreen$b;

    .line 43
    .line 44
    invoke-direct {v0, p0}, Lcom/zykj/video/play/controller/TCControllerFullScreen$b;-><init>(Lcom/zykj/video/play/controller/TCControllerFullScreen;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v0}, Ln5/f;->f(Ln5/f$a;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final B(Landroid/content/Context;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/video/play/controller/TCControllerFullScreen$e;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/video/play/controller/TCControllerFullScreen$e;-><init>(Lcom/zykj/video/play/controller/TCControllerFullScreen;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->y:Lcom/zykj/video/play/controller/TCControllerFullScreen$e;

    .line 7
    .line 8
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget v0, Lcom/zykj/video/play/R$layout;->superplayer_vod_controller_fullscreen:I

    .line 13
    .line 14
    invoke-virtual {p1, v0, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_rl_top:I

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Landroid/widget/RelativeLayout;

    .line 24
    .line 25
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->a:Landroid/widget/RelativeLayout;

    .line 26
    .line 27
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 28
    .line 29
    .line 30
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_ll_bottom:I

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Landroid/widget/LinearLayout;

    .line 37
    .line 38
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->b:Landroid/widget/LinearLayout;

    .line 39
    .line 40
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 41
    .line 42
    .line 43
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_ll_replay:I

    .line 44
    .line 45
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Landroid/widget/LinearLayout;

    .line 50
    .line 51
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->j:Landroid/widget/LinearLayout;

    .line 52
    .line 53
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_iv_back:I

    .line 54
    .line 55
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, Landroid/widget/ImageView;

    .line 60
    .line 61
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->o:Landroid/widget/ImageView;

    .line 62
    .line 63
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_iv_lock:I

    .line 64
    .line 65
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, Landroid/widget/ImageView;

    .line 70
    .line 71
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->r:Landroid/widget/ImageView;

    .line 72
    .line 73
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_tv_title:I

    .line 74
    .line 75
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    check-cast p1, Landroid/widget/TextView;

    .line 80
    .line 81
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->d:Landroid/widget/TextView;

    .line 82
    .line 83
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_iv_pause:I

    .line 84
    .line 85
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    check-cast p1, Landroid/widget/ImageView;

    .line 90
    .line 91
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->c:Landroid/widget/ImageView;

    .line 92
    .line 93
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_iv_danmuku:I

    .line 94
    .line 95
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    check-cast p1, Landroid/widget/ImageView;

    .line 100
    .line 101
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->p:Landroid/widget/ImageView;

    .line 102
    .line 103
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_iv_more:I

    .line 104
    .line 105
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    check-cast p1, Landroid/widget/ImageView;

    .line 110
    .line 111
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->s:Landroid/widget/ImageView;

    .line 112
    .line 113
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_iv_snapshot:I

    .line 114
    .line 115
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    check-cast p1, Landroid/widget/ImageView;

    .line 120
    .line 121
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->q:Landroid/widget/ImageView;

    .line 122
    .line 123
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_tv_current:I

    .line 124
    .line 125
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    check-cast p1, Landroid/widget/TextView;

    .line 130
    .line 131
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->g:Landroid/widget/TextView;

    .line 132
    .line 133
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_tv_duration:I

    .line 134
    .line 135
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    check-cast p1, Landroid/widget/TextView;

    .line 140
    .line 141
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->h:Landroid/widget/TextView;

    .line 142
    .line 143
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_seekbar_progress:I

    .line 144
    .line 145
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    check-cast p1, Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 150
    .line 151
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->i:Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 152
    .line 153
    const/4 v0, 0x0

    .line 154
    invoke-virtual {p1, v0}, Lcom/zykj/video/play/view/TCPointSeekBar;->setProgress(I)V

    .line 155
    .line 156
    .line 157
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->i:Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 158
    .line 159
    invoke-virtual {p1, p0}, Lcom/zykj/video/play/view/TCPointSeekBar;->setOnPointClickListener(Lcom/zykj/video/play/view/TCPointSeekBar$e;)V

    .line 160
    .line 161
    .line 162
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->i:Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 163
    .line 164
    invoke-virtual {p1, p0}, Lcom/zykj/video/play/view/TCPointSeekBar;->setOnSeekBarChangeListener(Lcom/zykj/video/play/view/TCPointSeekBar$d;)V

    .line 165
    .line 166
    .line 167
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_tv_quality:I

    .line 168
    .line 169
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    check-cast p1, Landroid/widget/TextView;

    .line 174
    .line 175
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->n:Landroid/widget/TextView;

    .line 176
    .line 177
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_tv_back_to_live:I

    .line 178
    .line 179
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    check-cast p1, Landroid/widget/TextView;

    .line 184
    .line 185
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->e:Landroid/widget/TextView;

    .line 186
    .line 187
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_pb_live:I

    .line 188
    .line 189
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    check-cast p1, Landroid/widget/ProgressBar;

    .line 194
    .line 195
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->k:Landroid/widget/ProgressBar;

    .line 196
    .line 197
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_vod_quality:I

    .line 198
    .line 199
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    check-cast p1, Lcom/zykj/video/play/view/TCVodQualityView;

    .line 204
    .line 205
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->t:Lcom/zykj/video/play/view/TCVodQualityView;

    .line 206
    .line 207
    invoke-virtual {p1, p0}, Lcom/zykj/video/play/view/TCVodQualityView;->setCallback(Lcom/zykj/video/play/view/TCVodQualityView$b;)V

    .line 208
    .line 209
    .line 210
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_vod_more:I

    .line 211
    .line 212
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    check-cast p1, Lcom/zykj/video/play/view/TCVodMoreView;

    .line 217
    .line 218
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->u:Lcom/zykj/video/play/view/TCVodMoreView;

    .line 219
    .line 220
    invoke-virtual {p1, p0}, Lcom/zykj/video/play/view/TCVodMoreView;->setCallback(Lcom/zykj/video/play/view/TCVodMoreView$c;)V

    .line 221
    .line 222
    .line 223
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->e:Landroid/widget/TextView;

    .line 224
    .line 225
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 226
    .line 227
    .line 228
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->j:Landroid/widget/LinearLayout;

    .line 229
    .line 230
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 231
    .line 232
    .line 233
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->r:Landroid/widget/ImageView;

    .line 234
    .line 235
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 236
    .line 237
    .line 238
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->o:Landroid/widget/ImageView;

    .line 239
    .line 240
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 241
    .line 242
    .line 243
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->c:Landroid/widget/ImageView;

    .line 244
    .line 245
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 246
    .line 247
    .line 248
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->p:Landroid/widget/ImageView;

    .line 249
    .line 250
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 251
    .line 252
    .line 253
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->q:Landroid/widget/ImageView;

    .line 254
    .line 255
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 256
    .line 257
    .line 258
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->s:Landroid/widget/ImageView;

    .line 259
    .line 260
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 261
    .line 262
    .line 263
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->n:Landroid/widget/TextView;

    .line 264
    .line 265
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 266
    .line 267
    .line 268
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_large_tv_vtt_text:I

    .line 269
    .line 270
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    check-cast p1, Landroid/widget/TextView;

    .line 275
    .line 276
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->v:Landroid/widget/TextView;

    .line 277
    .line 278
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 279
    .line 280
    .line 281
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->N:Lj5/g;

    .line 282
    .line 283
    if-eqz p1, :cond_0

    .line 284
    .line 285
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->n:Landroid/widget/TextView;

    .line 286
    .line 287
    iget-object p1, p1, Lj5/g;->d:Ljava/lang/String;

    .line 288
    .line 289
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 290
    .line 291
    .line 292
    :cond_0
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_gesture_progress:I

    .line 293
    .line 294
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    check-cast p1, Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;

    .line 299
    .line 300
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->l:Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;

    .line 301
    .line 302
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_video_progress_layout:I

    .line 303
    .line 304
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 305
    .line 306
    .line 307
    move-result-object p1

    .line 308
    check-cast p1, Lcom/zykj/video/play/view/TCVideoProgressLayout;

    .line 309
    .line 310
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->m:Lcom/zykj/video/play/view/TCVideoProgressLayout;

    .line 311
    .line 312
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_large_iv_water_mark:I

    .line 313
    .line 314
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 315
    .line 316
    .line 317
    move-result-object p1

    .line 318
    check-cast p1, Landroid/widget/ImageView;

    .line 319
    .line 320
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->f:Landroid/widget/ImageView;

    .line 321
    .line 322
    return-void
.end method

.method public C()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->D()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final D()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->K:Lcom/tencent/rtmp/TXImageSprite;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/rtmp/TXImageSprite;->release()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->K:Lcom/tencent/rtmp/TXImageSprite;

    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final E()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->j:Landroid/widget/LinearLayout;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->N(Landroid/view/View;Z)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->w:Lk5/c;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0}, Lk5/c;->onResume()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final F()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->L:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->M:I

    .line 6
    .line 7
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lj5/d;

    .line 12
    .line 13
    iget v0, v0, Lj5/d;->b:F

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    iget-object v1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->w:Lk5/c;

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    float-to-int v0, v0

    .line 22
    invoke-interface {v1, v0}, Lk5/c;->k(I)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->w:Lk5/c;

    .line 26
    .line 27
    invoke-interface {v0}, Lk5/c;->onResume()V

    .line 28
    .line 29
    .line 30
    :cond_1
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->v:Landroid/widget/TextView;

    .line 31
    .line 32
    const/16 v1, 0x8

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->j:Landroid/widget/LinearLayout;

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-virtual {p0, v0, v1}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->N(Landroid/view/View;Z)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public G()V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->B:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->a:Landroid/widget/RelativeLayout;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->b:Landroid/widget/LinearLayout;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->y:Lcom/zykj/video/play/controller/TCControllerFullScreen$e;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->r:Landroid/widget/ImageView;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 25
    .line 26
    .line 27
    iget v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->D:I

    .line 28
    .line 29
    const/4 v2, 0x3

    .line 30
    if-ne v0, v2, :cond_1

    .line 31
    .line 32
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->b:Landroid/widget/LinearLayout;

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->e:Landroid/widget/TextView;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->L:Ljava/util/List;

    .line 51
    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_2

    .line 63
    .line 64
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    check-cast v2, Lj5/d;

    .line 69
    .line 70
    iget v2, v2, Lj5/d;->b:F

    .line 71
    .line 72
    iget-wide v3, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->F:J

    .line 73
    .line 74
    long-to-float v3, v3

    .line 75
    div-float/2addr v2, v3

    .line 76
    iget-object v3, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->i:Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 77
    .line 78
    invoke-virtual {v3}, Lcom/zykj/video/play/view/TCPointSeekBar;->getMax()I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    int-to-float v3, v3

    .line 83
    mul-float/2addr v2, v3

    .line 84
    float-to-int v2, v2

    .line 85
    new-instance v3, Lcom/zykj/video/play/view/TCPointSeekBar$f;

    .line 86
    .line 87
    const/4 v4, -0x1

    .line 88
    invoke-direct {v3, v2, v4}, Lcom/zykj/video/play/view/TCPointSeekBar$f;-><init>(II)V

    .line 89
    .line 90
    .line 91
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_2
    iget-object v1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->i:Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 96
    .line 97
    invoke-virtual {v1, v0}, Lcom/zykj/video/play/view/TCPointSeekBar;->setPointList(Ljava/util/List;)V

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method public final H()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->hide()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->u:Lcom/zykj/video/play/view/TCVodMoreView;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Lcom/zykj/video/play/view/TCVodMoreView;->setVisibility(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final I()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->O:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->O:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x1

    .line 19
    const/4 v2, 0x0

    .line 20
    if-ne v0, v1, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->O:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_5

    .line 29
    .line 30
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->O:Ljava/util/List;

    .line 31
    .line 32
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lj5/g;

    .line 37
    .line 38
    iget-object v0, v0, Lj5/g;->d:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_1
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->t:Lcom/zykj/video/play/view/TCVodQualityView;

    .line 48
    .line 49
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 50
    .line 51
    .line 52
    iget-boolean v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->P:Z

    .line 53
    .line 54
    if-nez v0, :cond_4

    .line 55
    .line 56
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->N:Lj5/g;

    .line 57
    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    :goto_0
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->O:Ljava/util/List;

    .line 61
    .line 62
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-ge v2, v0, :cond_3

    .line 67
    .line 68
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->O:Ljava/util/List;

    .line 69
    .line 70
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    check-cast v0, Lj5/g;

    .line 75
    .line 76
    if-eqz v0, :cond_2

    .line 77
    .line 78
    iget-object v0, v0, Lj5/g;->d:Ljava/lang/String;

    .line 79
    .line 80
    if-eqz v0, :cond_2

    .line 81
    .line 82
    iget-object v3, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->N:Lj5/g;

    .line 83
    .line 84
    iget-object v3, v3, Lj5/g;->d:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_2

    .line 91
    .line 92
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->t:Lcom/zykj/video/play/view/TCVodQualityView;

    .line 93
    .line 94
    invoke-virtual {v0, v2}, Lcom/zykj/video/play/view/TCVodQualityView;->setDefaultSelectedQuality(I)V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_3
    :goto_1
    iput-boolean v1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->P:Z

    .line 102
    .line 103
    :cond_4
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->t:Lcom/zykj/video/play/view/TCVodQualityView;

    .line 104
    .line 105
    iget-object v1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->O:Ljava/util/List;

    .line 106
    .line 107
    invoke-virtual {v0, v1}, Lcom/zykj/video/play/view/TCVodQualityView;->setVideoQualityList(Ljava/util/List;)V

    .line 108
    .line 109
    .line 110
    :cond_5
    :goto_2
    return-void
.end method

.method public final J()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->J:Z

    .line 2
    .line 3
    const-wide/16 v1, 0x1b58

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->B:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->hide()V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->G()V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->x:Lk5/a;

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->x:Lk5/a;

    .line 26
    .line 27
    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->r:Landroid/widget/ImageView;

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->y:Lcom/zykj/video/play/controller/TCControllerFullScreen$e;

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->y:Lcom/zykj/video/play/controller/TCControllerFullScreen$e;

    .line 45
    .line 46
    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 47
    .line 48
    .line 49
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->u:Lcom/zykj/video/play/view/TCVodMoreView;

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_3

    .line 56
    .line 57
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->u:Lcom/zykj/video/play/view/TCVodMoreView;

    .line 58
    .line 59
    const/16 v1, 0x8

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Lcom/zykj/video/play/view/TCVodMoreView;->setVisibility(I)V

    .line 62
    .line 63
    .line 64
    :cond_3
    return-void
.end method

.method public final K()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->I:Z

    .line 2
    .line 3
    xor-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iput-boolean v1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->I:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->p:Landroid/widget/ImageView;

    .line 10
    .line 11
    sget v1, Lcom/zykj/video/play/R$drawable;->superplayer_ic_danmuku_on:I

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->p:Landroid/widget/ImageView;

    .line 18
    .line 19
    sget v1, Lcom/zykj/video/play/R$drawable;->superplayer_ic_danmuku_off:I

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 22
    .line 23
    .line 24
    :goto_0
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->w:Lk5/c;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-boolean v1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->I:Z

    .line 29
    .line 30
    invoke-interface {v0, v1}, Lk5/c;->h(Z)V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public final L()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->J:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput-boolean v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->J:Z

    .line 6
    .line 7
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->r:Landroid/widget/ImageView;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->y:Lcom/zykj/video/play/controller/TCControllerFullScreen$e;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->y:Lcom/zykj/video/play/controller/TCControllerFullScreen$e;

    .line 21
    .line 22
    const-wide/16 v2, 0x1b58

    .line 23
    .line 24
    invoke-virtual {p0, v0, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-boolean v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->J:Z

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->r:Landroid/widget/ImageView;

    .line 32
    .line 33
    sget v2, Lcom/zykj/video/play/R$drawable;->superplayer_ic_player_lock:I

    .line 34
    .line 35
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->hide()V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->r:Landroid/widget/ImageView;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->r:Landroid/widget/ImageView;

    .line 48
    .line 49
    sget v1, Lcom/zykj/video/play/R$drawable;->superplayer_ic_player_unlock:I

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->G()V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final M()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->E:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_1

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x3

    .line 10
    if-eq v0, v1, :cond_1

    .line 11
    .line 12
    const/4 v1, 0x4

    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->w:Lk5/c;

    .line 17
    .line 18
    if-eqz v0, :cond_3

    .line 19
    .line 20
    invoke-interface {v0}, Lk5/c;->onResume()V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->w:Lk5/c;

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    invoke-interface {v0}, Lk5/c;->onPause()V

    .line 29
    .line 30
    .line 31
    :cond_2
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->j:Landroid/widget/LinearLayout;

    .line 32
    .line 33
    const/16 v1, 0x8

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 36
    .line 37
    .line 38
    :cond_3
    :goto_0
    invoke-virtual {p0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->G()V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final N(Landroid/view/View;Z)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/16 p2, 0x8

    .line 6
    .line 7
    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public O(Lj5/b;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->K:Lcom/tencent/rtmp/TXImageSprite;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->D()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->m:Lcom/zykj/video/play/view/TCVideoProgressLayout;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz p1, :cond_2

    .line 13
    .line 14
    iget-object v3, p1, Lj5/b;->a:Ljava/util/List;

    .line 15
    .line 16
    if-eqz v3, :cond_2

    .line 17
    .line 18
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-nez v3, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    move v3, v2

    .line 26
    goto :goto_1

    .line 27
    :cond_2
    :goto_0
    move v3, v1

    .line 28
    :goto_1
    invoke-virtual {v0, v3}, Lcom/zykj/video/play/view/TCVideoProgressLayout;->setProgressVisibility(Z)V

    .line 29
    .line 30
    .line 31
    iget v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->D:I

    .line 32
    .line 33
    if-ne v0, v1, :cond_4

    .line 34
    .line 35
    new-instance v0, Lcom/tencent/rtmp/TXImageSprite;

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-direct {v0, v1}, Lcom/tencent/rtmp/TXImageSprite;-><init>(Landroid/content/Context;)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->K:Lcom/tencent/rtmp/TXImageSprite;

    .line 45
    .line 46
    if-eqz p1, :cond_3

    .line 47
    .line 48
    invoke-static {}, Ll5/b;->a()Ll5/b;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const-string v1, "image_sprite"

    .line 53
    .line 54
    const-wide/16 v3, 0x0

    .line 55
    .line 56
    invoke-virtual {v0, v1, v3, v4, v2}, Ll5/b;->d(Ljava/lang/String;JI)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->K:Lcom/tencent/rtmp/TXImageSprite;

    .line 60
    .line 61
    iget-object v1, p1, Lj5/b;->b:Ljava/lang/String;

    .line 62
    .line 63
    iget-object p1, p1, Lj5/b;->a:Ljava/util/List;

    .line 64
    .line 65
    invoke-virtual {v0, v1, p1}, Lcom/tencent/rtmp/TXImageSprite;->setVTTUrlAndImageUrls(Ljava/lang/String;Ljava/util/List;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_3
    const/4 p1, 0x0

    .line 70
    invoke-virtual {v0, p1, p1}, Lcom/tencent/rtmp/TXImageSprite;->setVTTUrlAndImageUrls(Ljava/lang/String;Ljava/util/List;)V

    .line 71
    .line 72
    .line 73
    :cond_4
    return-void
.end method

.method public P(Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->L:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public Q(I)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eq p1, v1, :cond_3

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    if-eq p1, v2, :cond_2

    .line 7
    .line 8
    const/4 v2, 0x3

    .line 9
    if-eq p1, v2, :cond_1

    .line 10
    .line 11
    const/4 v0, 0x4

    .line 12
    if-eq p1, v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->c:Landroid/widget/ImageView;

    .line 16
    .line 17
    sget v2, Lcom/zykj/video/play/R$drawable;->superplayer_ic_vod_play_normal:I

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->j:Landroid/widget/LinearLayout;

    .line 23
    .line 24
    invoke-virtual {p0, v0, v1}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->N(Landroid/view/View;Z)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    iget-object v2, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->c:Landroid/widget/ImageView;

    .line 29
    .line 30
    sget v3, Lcom/zykj/video/play/R$drawable;->superplayer_ic_vod_pause_normal:I

    .line 31
    .line 32
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 33
    .line 34
    .line 35
    iget-object v2, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->k:Landroid/widget/ProgressBar;

    .line 36
    .line 37
    invoke-virtual {p0, v2, v1}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->N(Landroid/view/View;Z)V

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->j:Landroid/widget/LinearLayout;

    .line 41
    .line 42
    invoke-virtual {p0, v1, v0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->N(Landroid/view/View;Z)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    iget-object v1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->c:Landroid/widget/ImageView;

    .line 47
    .line 48
    sget v2, Lcom/zykj/video/play/R$drawable;->superplayer_ic_vod_play_normal:I

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 51
    .line 52
    .line 53
    iget-object v1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->j:Landroid/widget/LinearLayout;

    .line 54
    .line 55
    invoke-virtual {p0, v1, v0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->N(Landroid/view/View;Z)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    iget-object v1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->c:Landroid/widget/ImageView;

    .line 60
    .line 61
    sget v2, Lcom/zykj/video/play/R$drawable;->superplayer_ic_vod_pause_normal:I

    .line 62
    .line 63
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->k:Landroid/widget/ProgressBar;

    .line 67
    .line 68
    invoke-virtual {p0, v1, v0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->N(Landroid/view/View;Z)V

    .line 69
    .line 70
    .line 71
    iget-object v1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->j:Landroid/widget/LinearLayout;

    .line 72
    .line 73
    invoke-virtual {p0, v1, v0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->N(Landroid/view/View;Z)V

    .line 74
    .line 75
    .line 76
    :goto_0
    iput p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->E:I

    .line 77
    .line 78
    return-void
.end method

.method public R(I)V
    .locals 3

    .line 1
    iput p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->D:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/16 v1, 0x8

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    if-eq p1, v2, :cond_3

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    if-eq p1, v2, :cond_2

    .line 11
    .line 12
    const/4 v2, 0x3

    .line 13
    if-eq p1, v2, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->b:Landroid/widget/LinearLayout;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->e:Landroid/widget/TextView;

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->h:Landroid/widget/TextView;

    .line 30
    .line 31
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->u:Lcom/zykj/video/play/view/TCVodMoreView;

    .line 35
    .line 36
    invoke-virtual {p1, v2}, Lcom/zykj/video/play/view/TCVodMoreView;->h(I)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_2
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->e:Landroid/widget/TextView;

    .line 41
    .line 42
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->h:Landroid/widget/TextView;

    .line 46
    .line 47
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->u:Lcom/zykj/video/play/view/TCVodMoreView;

    .line 51
    .line 52
    invoke-virtual {p1, v2}, Lcom/zykj/video/play/view/TCVodMoreView;->h(I)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->i:Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 56
    .line 57
    const/16 v0, 0x64

    .line 58
    .line 59
    invoke-virtual {p1, v0}, Lcom/zykj/video/play/view/TCPointSeekBar;->setProgress(I)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_3
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->e:Landroid/widget/TextView;

    .line 64
    .line 65
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->u:Lcom/zykj/video/play/view/TCVodMoreView;

    .line 69
    .line 70
    invoke-virtual {p1, v2}, Lcom/zykj/video/play/view/TCVodMoreView;->h(I)V

    .line 71
    .line 72
    .line 73
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->h:Landroid/widget/TextView;

    .line 74
    .line 75
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public S(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->d:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public T(JJ)V
    .locals 6

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    if-gez v2, :cond_0

    .line 6
    .line 7
    move-wide p1, v0

    .line 8
    :cond_0
    iput-wide p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->H:J

    .line 9
    .line 10
    cmp-long v2, p3, v0

    .line 11
    .line 12
    if-gez v2, :cond_1

    .line 13
    .line 14
    move-wide p3, v0

    .line 15
    :cond_1
    iput-wide p3, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->F:J

    .line 16
    .line 17
    iget-object p3, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->g:Landroid/widget/TextView;

    .line 18
    .line 19
    invoke-static {p1, p2}, Ln5/d;->b(J)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    iget-wide p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->F:J

    .line 27
    .line 28
    cmp-long p3, p1, v0

    .line 29
    .line 30
    const/high16 p4, 0x3f800000    # 1.0f

    .line 31
    .line 32
    if-lez p3, :cond_2

    .line 33
    .line 34
    iget-wide v2, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->H:J

    .line 35
    .line 36
    long-to-float p3, v2

    .line 37
    long-to-float v2, p1

    .line 38
    div-float/2addr p3, v2

    .line 39
    goto :goto_0

    .line 40
    :cond_2
    move p3, p4

    .line 41
    :goto_0
    iget-wide v2, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->H:J

    .line 42
    .line 43
    cmp-long v4, v2, v0

    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    if-nez v4, :cond_3

    .line 47
    .line 48
    iput-wide v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->G:J

    .line 49
    .line 50
    move p3, v5

    .line 51
    :cond_3
    iget v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->D:I

    .line 52
    .line 53
    const/4 v1, 0x2

    .line 54
    if-eq v0, v1, :cond_4

    .line 55
    .line 56
    const/4 v1, 0x3

    .line 57
    if-ne v0, v1, :cond_7

    .line 58
    .line 59
    :cond_4
    iget-wide v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->G:J

    .line 60
    .line 61
    cmp-long p3, v0, v2

    .line 62
    .line 63
    if-lez p3, :cond_5

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_5
    move-wide v0, v2

    .line 67
    :goto_1
    iput-wide v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->G:J

    .line 68
    .line 69
    sub-long v0, p1, v2

    .line 70
    .line 71
    const-wide/16 v2, 0x1c20

    .line 72
    .line 73
    cmp-long p3, p1, v2

    .line 74
    .line 75
    if-lez p3, :cond_6

    .line 76
    .line 77
    move-wide p1, v2

    .line 78
    :cond_6
    iput-wide p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->F:J

    .line 79
    .line 80
    long-to-float p3, v0

    .line 81
    long-to-float p1, p1

    .line 82
    div-float/2addr p3, p1

    .line 83
    sub-float p3, p4, p3

    .line 84
    .line 85
    :cond_7
    cmpl-float p1, p3, v5

    .line 86
    .line 87
    if-ltz p1, :cond_9

    .line 88
    .line 89
    cmpg-float p1, p3, p4

    .line 90
    .line 91
    if-gtz p1, :cond_9

    .line 92
    .line 93
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->i:Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 94
    .line 95
    invoke-virtual {p1}, Lcom/zykj/video/play/view/TCPointSeekBar;->getMax()I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    int-to-float p1, p1

    .line 100
    mul-float/2addr p3, p1

    .line 101
    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    iget-boolean p2, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->C:Z

    .line 106
    .line 107
    if-nez p2, :cond_8

    .line 108
    .line 109
    iget-object p2, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->i:Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 110
    .line 111
    invoke-virtual {p2, p1}, Lcom/zykj/video/play/view/TCPointSeekBar;->setProgress(I)V

    .line 112
    .line 113
    .line 114
    :cond_8
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->h:Landroid/widget/TextView;

    .line 115
    .line 116
    iget-wide p2, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->F:J

    .line 117
    .line 118
    invoke-static {p2, p3}, Ln5/d;->b(J)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 123
    .line 124
    .line 125
    :cond_9
    return-void
.end method

.method public U(Lj5/g;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->n:Landroid/widget/TextView;

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->N:Lj5/g;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->n:Landroid/widget/TextView;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object p1, p1, Lj5/g;->d:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->O:Ljava/util/List;

    .line 23
    .line 24
    if-eqz p1, :cond_3

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_3

    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    :goto_0
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->O:Ljava/util/List;

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-ge p1, v0, :cond_3

    .line 40
    .line 41
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->O:Ljava/util/List;

    .line 42
    .line 43
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Lj5/g;

    .line 48
    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    iget-object v0, v0, Lj5/g;->d:Ljava/lang/String;

    .line 52
    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    iget-object v1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->N:Lj5/g;

    .line 56
    .line 57
    iget-object v1, v1, Lj5/g;->d:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->t:Lcom/zykj/video/play/view/TCVodQualityView;

    .line 66
    .line 67
    invoke-virtual {v0, p1}, Lcom/zykj/video/play/view/TCVodQualityView;->setDefaultSelectedQuality(I)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_2
    add-int/lit8 p1, p1, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_3
    return-void
.end method

.method public a(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->w:Lk5/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lk5/c;->a(F)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public b(Lcom/zykj/video/play/view/TCPointSeekBar;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->x:Lk5/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->w:Lk5/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lk5/c;->i(Z)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public d(Lcom/zykj/video/play/view/TCPointSeekBar;IZ)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->m:Lcom/zykj/video/play/view/TCVideoProgressLayout;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    if-eqz p3, :cond_3

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/zykj/video/play/view/TCVideoProgressLayout;->c()V

    .line 8
    .line 9
    .line 10
    int-to-float v0, p2

    .line 11
    invoke-virtual {p1}, Lcom/zykj/video/play/view/TCPointSeekBar;->getMax()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    int-to-float p1, p1

    .line 16
    div-float/2addr v0, p1

    .line 17
    iget-wide v1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->F:J

    .line 18
    .line 19
    long-to-float p1, v1

    .line 20
    mul-float/2addr p1, v0

    .line 21
    iget v1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->D:I

    .line 22
    .line 23
    const/4 v2, 0x2

    .line 24
    if-eq v1, v2, :cond_1

    .line 25
    .line 26
    const/4 v2, 0x3

    .line 27
    if-ne v1, v2, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->m:Lcom/zykj/video/play/view/TCVideoProgressLayout;

    .line 31
    .line 32
    new-instance v1, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    float-to-long v2, p1

    .line 38
    invoke-static {v2, v3}, Ln5/d;->b(J)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string p1, " / "

    .line 46
    .line 47
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    iget-wide v2, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->F:J

    .line 51
    .line 52
    invoke-static {v2, v3}, Ln5/d;->b(J)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {v0, p1}, Lcom/zykj/video/play/view/TCVideoProgressLayout;->setTimeText(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_1
    :goto_0
    iget-wide v1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->G:J

    .line 68
    .line 69
    const-wide/16 v3, 0x1c20

    .line 70
    .line 71
    cmp-long p1, v1, v3

    .line 72
    .line 73
    if-lez p1, :cond_2

    .line 74
    .line 75
    long-to-float p1, v1

    .line 76
    const/high16 v1, 0x3f800000    # 1.0f

    .line 77
    .line 78
    sub-float/2addr v1, v0

    .line 79
    const/high16 v0, 0x45e10000    # 7200.0f

    .line 80
    .line 81
    mul-float/2addr v1, v0

    .line 82
    sub-float/2addr p1, v1

    .line 83
    float-to-int p1, p1

    .line 84
    int-to-float p1, p1

    .line 85
    goto :goto_1

    .line 86
    :cond_2
    long-to-float p1, v1

    .line 87
    mul-float/2addr p1, v0

    .line 88
    :goto_1
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->m:Lcom/zykj/video/play/view/TCVideoProgressLayout;

    .line 89
    .line 90
    float-to-long v1, p1

    .line 91
    invoke-static {v1, v2}, Ln5/d;->b(J)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {v0, p1}, Lcom/zykj/video/play/view/TCVideoProgressLayout;->setTimeText(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    :goto_2
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->m:Lcom/zykj/video/play/view/TCVideoProgressLayout;

    .line 99
    .line 100
    invoke-virtual {p1, p2}, Lcom/zykj/video/play/view/TCVideoProgressLayout;->setProgress(I)V

    .line 101
    .line 102
    .line 103
    :cond_3
    if-eqz p3, :cond_4

    .line 104
    .line 105
    iget p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->D:I

    .line 106
    .line 107
    const/4 p3, 0x1

    .line 108
    if-ne p1, p3, :cond_4

    .line 109
    .line 110
    invoke-direct {p0, p2}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->setThumbnail(I)V

    .line 111
    .line 112
    .line 113
    :cond_4
    return-void
.end method

.method public e(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->w:Lk5/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lk5/c;->c(Z)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public f(Lj5/g;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->w:Lk5/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lk5/c;->g(Lj5/g;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->t:Lcom/zykj/video/play/view/TCVodQualityView;

    .line 9
    .line 10
    const/16 v0, 0x8

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public g(Lcom/zykj/video/play/view/TCPointSeekBar;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Lcom/zykj/video/play/view/TCPointSeekBar;->getProgress()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Lcom/zykj/video/play/view/TCPointSeekBar;->getMax()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget v1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->D:I

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-eq v1, v2, :cond_2

    .line 13
    .line 14
    const/4 v3, 0x2

    .line 15
    if-eq v1, v3, :cond_0

    .line 16
    .line 17
    const/4 v3, 0x3

    .line 18
    if-eq v1, v3, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->k:Landroid/widget/ProgressBar;

    .line 22
    .line 23
    invoke-virtual {p0, v1, v2}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->N(Landroid/view/View;Z)V

    .line 24
    .line 25
    .line 26
    iget-wide v1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->G:J

    .line 27
    .line 28
    int-to-long v3, v0

    .line 29
    mul-long/2addr v3, v1

    .line 30
    long-to-float v3, v3

    .line 31
    const/high16 v4, 0x3f800000    # 1.0f

    .line 32
    .line 33
    mul-float/2addr v3, v4

    .line 34
    int-to-float v5, p1

    .line 35
    div-float/2addr v3, v5

    .line 36
    float-to-int v3, v3

    .line 37
    const-wide/16 v6, 0x1c20

    .line 38
    .line 39
    cmp-long v6, v1, v6

    .line 40
    .line 41
    if-lez v6, :cond_1

    .line 42
    .line 43
    long-to-float v1, v1

    .line 44
    sub-int/2addr p1, v0

    .line 45
    mul-int/lit16 p1, p1, 0x1c20

    .line 46
    .line 47
    int-to-float p1, p1

    .line 48
    mul-float/2addr p1, v4

    .line 49
    div-float/2addr p1, v5

    .line 50
    sub-float/2addr v1, p1

    .line 51
    float-to-int v3, v1

    .line 52
    :cond_1
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->w:Lk5/c;

    .line 53
    .line 54
    if-eqz p1, :cond_3

    .line 55
    .line 56
    invoke-interface {p1, v3}, Lk5/c;->k(I)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    if-ltz v0, :cond_3

    .line 61
    .line 62
    if-gt v0, p1, :cond_3

    .line 63
    .line 64
    iget-object v1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->j:Landroid/widget/LinearLayout;

    .line 65
    .line 66
    const/4 v2, 0x0

    .line 67
    invoke-virtual {p0, v1, v2}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->N(Landroid/view/View;Z)V

    .line 68
    .line 69
    .line 70
    int-to-float v0, v0

    .line 71
    int-to-float p1, p1

    .line 72
    div-float/2addr v0, p1

    .line 73
    iget-wide v1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->F:J

    .line 74
    .line 75
    long-to-float p1, v1

    .line 76
    mul-float/2addr p1, v0

    .line 77
    float-to-int p1, p1

    .line 78
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->w:Lk5/c;

    .line 79
    .line 80
    if-eqz v0, :cond_3

    .line 81
    .line 82
    invoke-interface {v0, p1}, Lk5/c;->k(I)V

    .line 83
    .line 84
    .line 85
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->w:Lk5/c;

    .line 86
    .line 87
    invoke-interface {p1}, Lk5/c;->onResume()V

    .line 88
    .line 89
    .line 90
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->x:Lk5/a;

    .line 91
    .line 92
    const-wide/16 v0, 0x1b58

    .line 93
    .line 94
    invoke-virtual {p0, p1, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method public getSpeed()F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->w:Lk5/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lk5/c;->getSpeed()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    .line 11
    .line 12
    return v0
.end method

.method public h(Landroid/view/View;I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->y:Lcom/zykj/video/play/controller/TCControllerFullScreen$e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->x:Lk5/a;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->x:Lk5/a;

    .line 11
    .line 12
    const-wide/16 v1, 0x1b58

    .line 13
    .line 14
    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->L:Ljava/util/List;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-static {}, Ll5/b;->a()Ll5/b;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-wide/16 v1, 0x0

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    const-string v4, "player_point"

    .line 29
    .line 30
    invoke-virtual {v0, v4, v1, v2, v3}, Ll5/b;->d(Ljava/lang/String;JI)V

    .line 31
    .line 32
    .line 33
    iput p2, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->M:I

    .line 34
    .line 35
    new-instance v0, Lcom/zykj/video/play/controller/TCControllerFullScreen$c;

    .line 36
    .line 37
    invoke-direct {v0, p0, p1, p2}, Lcom/zykj/video/play/controller/TCControllerFullScreen$c;-><init>(Lcom/zykj/video/play/controller/TCControllerFullScreen;Landroid/view/View;I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void
.end method

.method public hide()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->B:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->a:Landroid/widget/RelativeLayout;

    .line 5
    .line 6
    const/16 v1, 0x8

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->b:Landroid/widget/LinearLayout;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->t:Lcom/zykj/video/play/view/TCVodQualityView;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->v:Landroid/widget/TextView;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->r:Landroid/widget/ImageView;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 29
    .line 30
    .line 31
    iget v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->D:I

    .line 32
    .line 33
    const/4 v2, 0x3

    .line 34
    if-ne v0, v2, :cond_0

    .line 35
    .line 36
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->e:Landroid/widget/TextView;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    sget v0, Lcom/zykj/video/play/R$id;->superplayer_iv_back:I

    .line 6
    .line 7
    if-eq p1, v0, :cond_9

    .line 8
    .line 9
    sget v0, Lcom/zykj/video/play/R$id;->superplayer_tv_title:I

    .line 10
    .line 11
    if-ne p1, v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget v0, Lcom/zykj/video/play/R$id;->superplayer_iv_pause:I

    .line 15
    .line 16
    if-ne p1, v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->M()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    sget v0, Lcom/zykj/video/play/R$id;->superplayer_iv_danmuku:I

    .line 23
    .line 24
    if-ne p1, v0, :cond_2

    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->K()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_2
    sget v0, Lcom/zykj/video/play/R$id;->superplayer_iv_snapshot:I

    .line 31
    .line 32
    if-ne p1, v0, :cond_3

    .line 33
    .line 34
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->w:Lk5/c;

    .line 35
    .line 36
    if-eqz p1, :cond_a

    .line 37
    .line 38
    invoke-interface {p1}, Lk5/c;->d()V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_3
    sget v0, Lcom/zykj/video/play/R$id;->superplayer_iv_more:I

    .line 43
    .line 44
    if-ne p1, v0, :cond_4

    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->H()V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_4
    sget v0, Lcom/zykj/video/play/R$id;->superplayer_tv_quality:I

    .line 51
    .line 52
    if-ne p1, v0, :cond_5

    .line 53
    .line 54
    invoke-virtual {p0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->I()V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_5
    sget v0, Lcom/zykj/video/play/R$id;->superplayer_iv_lock:I

    .line 59
    .line 60
    if-ne p1, v0, :cond_6

    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->L()V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_6
    sget v0, Lcom/zykj/video/play/R$id;->superplayer_ll_replay:I

    .line 67
    .line 68
    if-ne p1, v0, :cond_7

    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->E()V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_7
    sget v0, Lcom/zykj/video/play/R$id;->superplayer_tv_back_to_live:I

    .line 75
    .line 76
    if-ne p1, v0, :cond_8

    .line 77
    .line 78
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->w:Lk5/c;

    .line 79
    .line 80
    if-eqz p1, :cond_a

    .line 81
    .line 82
    invoke-interface {p1}, Lk5/c;->e()V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_8
    sget v0, Lcom/zykj/video/play/R$id;->superplayer_large_tv_vtt_text:I

    .line 87
    .line 88
    if-ne p1, v0, :cond_a

    .line 89
    .line 90
    invoke-virtual {p0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->F()V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_9
    :goto_0
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->w:Lk5/c;

    .line 95
    .line 96
    if-eqz p1, :cond_a

    .line 97
    .line 98
    const/4 v0, 0x2

    .line 99
    invoke-interface {p1, v0}, Lk5/c;->b(I)V

    .line 100
    .line 101
    .line 102
    :cond_a
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->z:Landroid/view/GestureDetector;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-boolean v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->J:Z

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    if-nez v0, :cond_7

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-ne v0, v1, :cond_7

    .line 18
    .line 19
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->A:Ln5/f;

    .line 20
    .line 21
    if-eqz v0, :cond_7

    .line 22
    .line 23
    invoke-virtual {v0}, Ln5/f;->d()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_7

    .line 28
    .line 29
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->A:Ln5/f;

    .line 30
    .line 31
    invoke-virtual {v0}, Ln5/f;->c()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iget-object v2, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->i:Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 36
    .line 37
    invoke-virtual {v2}, Lcom/zykj/video/play/view/TCPointSeekBar;->getMax()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-le v0, v2, :cond_1

    .line 42
    .line 43
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->i:Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/zykj/video/play/view/TCPointSeekBar;->getMax()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    :cond_1
    const/4 v2, 0x0

    .line 50
    if-gez v0, :cond_2

    .line 51
    .line 52
    move v0, v2

    .line 53
    :cond_2
    iget-object v3, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->i:Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 54
    .line 55
    invoke-virtual {v3, v0}, Lcom/zykj/video/play/view/TCPointSeekBar;->setProgress(I)V

    .line 56
    .line 57
    .line 58
    int-to-float v0, v0

    .line 59
    const/high16 v3, 0x3f800000    # 1.0f

    .line 60
    .line 61
    mul-float/2addr v0, v3

    .line 62
    iget-object v4, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->i:Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 63
    .line 64
    invoke-virtual {v4}, Lcom/zykj/video/play/view/TCPointSeekBar;->getMax()I

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    int-to-float v4, v4

    .line 69
    div-float/2addr v0, v4

    .line 70
    iget v4, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->D:I

    .line 71
    .line 72
    const/4 v5, 0x2

    .line 73
    if-eq v4, v5, :cond_4

    .line 74
    .line 75
    const/4 v5, 0x3

    .line 76
    if-ne v4, v5, :cond_3

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    iget-wide v3, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->F:J

    .line 80
    .line 81
    long-to-float v3, v3

    .line 82
    mul-float/2addr v0, v3

    .line 83
    float-to-int v0, v0

    .line 84
    goto :goto_1

    .line 85
    :cond_4
    :goto_0
    iget-wide v4, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->G:J

    .line 86
    .line 87
    const-wide/16 v6, 0x1c20

    .line 88
    .line 89
    cmp-long v6, v4, v6

    .line 90
    .line 91
    if-lez v6, :cond_5

    .line 92
    .line 93
    long-to-float v4, v4

    .line 94
    const/high16 v5, 0x45e10000    # 7200.0f

    .line 95
    .line 96
    sub-float/2addr v3, v0

    .line 97
    mul-float/2addr v3, v5

    .line 98
    sub-float/2addr v4, v3

    .line 99
    float-to-int v0, v4

    .line 100
    goto :goto_1

    .line 101
    :cond_5
    long-to-float v3, v4

    .line 102
    mul-float/2addr v3, v0

    .line 103
    float-to-int v0, v3

    .line 104
    :goto_1
    iget-object v3, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->w:Lk5/c;

    .line 105
    .line 106
    if-eqz v3, :cond_6

    .line 107
    .line 108
    invoke-interface {v3, v0}, Lk5/c;->k(I)V

    .line 109
    .line 110
    .line 111
    :cond_6
    iput-boolean v2, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->C:Z

    .line 112
    .line 113
    :cond_7
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-nez v0, :cond_8

    .line 118
    .line 119
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->x:Lk5/a;

    .line 120
    .line 121
    invoke-virtual {p0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 122
    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_8
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    if-ne p1, v1, :cond_9

    .line 130
    .line 131
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->x:Lk5/a;

    .line 132
    .line 133
    const-wide/16 v2, 0x1b58

    .line 134
    .line 135
    invoke-virtual {p0, p1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 136
    .line 137
    .line 138
    :cond_9
    :goto_2
    return v1
.end method

.method public setBackground(Landroid/graphics/Bitmap;)V
    .locals 0

    return-void
.end method

.method public setCallback(Lk5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->w:Lk5/c;

    .line 2
    .line 3
    return-void
.end method

.method public setVideoQualityList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lj5/g;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->O:Ljava/util/List;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->P:Z

    .line 5
    .line 6
    return-void
.end method

.method public final z(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen;->v:Landroid/widget/TextView;

    .line 2
    .line 3
    new-instance v1, Lcom/zykj/video/play/controller/TCControllerFullScreen$d;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lcom/zykj/video/play/controller/TCControllerFullScreen$d;-><init>(Lcom/zykj/video/play/controller/TCControllerFullScreen;I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method
