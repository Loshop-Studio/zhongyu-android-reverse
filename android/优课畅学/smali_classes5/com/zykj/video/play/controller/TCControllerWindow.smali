.class public Lcom/zykj/video/play/controller/TCControllerWindow;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"

# interfaces
.implements Lk5/b;
.implements Landroid/view/View$OnClickListener;
.implements Landroid/widget/AdapterView$OnItemSelectedListener;
.implements Lcom/zykj/video/play/view/TCPointSeekBar$d;


# instance fields
.field public A:J

.field public B:Landroid/graphics/Bitmap;

.field public C:J

.field public a:Landroid/widget/LinearLayout;

.field public b:Landroid/widget/LinearLayout;

.field public c:Landroid/widget/ImageView;

.field public d:Landroid/widget/ImageView;

.field public e:Landroid/widget/TextView;

.field public f:Landroid/widget/TextView;

.field public g:Landroid/widget/ImageView;

.field public h:Landroid/widget/ImageView;

.field public i:Landroid/widget/TextView;

.field public j:Landroid/widget/TextView;

.field public k:Lcom/zykj/video/play/view/TCPointSeekBar;

.field public l:Landroid/widget/LinearLayout;

.field public m:Landroid/widget/ProgressBar;

.field public n:Landroid/widget/Spinner;

.field public o:Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;

.field public p:Lcom/zykj/video/play/view/TCVideoProgressLayout;

.field public q:Lk5/c;

.field public r:Lk5/a;

.field public s:Landroid/view/GestureDetector;

.field public t:Ln5/f;

.field public u:Z

.field public v:Z

.field public w:I

.field public x:I

.field public y:J

.field public z:J


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
    iput p2, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->x:I

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lcom/zykj/video/play/controller/TCControllerWindow;->t(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private A(Landroid/view/View;Z)V
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

.method public static synthetic a(Lcom/zykj/video/play/controller/TCControllerWindow;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/video/play/controller/TCControllerWindow;->z()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Lcom/zykj/video/play/controller/TCControllerWindow;)Lk5/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->r:Lk5/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic e(Lcom/zykj/video/play/controller/TCControllerWindow;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->z:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static synthetic f(Lcom/zykj/video/play/controller/TCControllerWindow;Landroid/widget/ImageView;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/video/play/controller/TCControllerWindow;->w(Landroid/widget/ImageView;Landroid/graphics/Bitmap;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic h(Lcom/zykj/video/play/controller/TCControllerWindow;)Landroid/widget/ImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->g:Landroid/widget/ImageView;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic i(Lcom/zykj/video/play/controller/TCControllerWindow;)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->B:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic j(Lcom/zykj/video/play/controller/TCControllerWindow;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->B:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic k(Lcom/zykj/video/play/controller/TCControllerWindow;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/video/play/controller/TCControllerWindow;->y()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic l(Lcom/zykj/video/play/controller/TCControllerWindow;)Ln5/f;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->t:Ln5/f;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic m(Lcom/zykj/video/play/controller/TCControllerWindow;)Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->o:Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic n(Lcom/zykj/video/play/controller/TCControllerWindow;)Lcom/zykj/video/play/view/TCPointSeekBar;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->k:Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic o(Lcom/zykj/video/play/controller/TCControllerWindow;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->v:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic p(Lcom/zykj/video/play/controller/TCControllerWindow;)Lcom/zykj/video/play/view/TCVideoProgressLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->p:Lcom/zykj/video/play/view/TCVideoProgressLayout;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic q(Lcom/zykj/video/play/controller/TCControllerWindow;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->y:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static synthetic r(Lcom/zykj/video/play/controller/TCControllerWindow;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->w:I

    .line 2
    .line 3
    return p0
.end method

.method private t(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/video/play/controller/TCControllerWindow;->u(Landroid/content/Context;)V

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
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->r:Lk5/a;

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
    new-instance v1, Lcom/zykj/video/play/controller/TCControllerWindow$a;

    .line 18
    .line 19
    invoke-direct {v1, p0}, Lcom/zykj/video/play/controller/TCControllerWindow$a;-><init>(Lcom/zykj/video/play/controller/TCControllerWindow;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p1, v0, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->s:Landroid/view/GestureDetector;

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
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->t:Ln5/f;

    .line 41
    .line 42
    new-instance v0, Lcom/zykj/video/play/controller/TCControllerWindow$b;

    .line 43
    .line 44
    invoke-direct {v0, p0}, Lcom/zykj/video/play/controller/TCControllerWindow$b;-><init>(Lcom/zykj/video/play/controller/TCControllerWindow;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v0}, Ln5/f;->f(Ln5/f$a;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method private u(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget v0, Lcom/zykj/video/play/R$layout;->superplayer_vod_controller_window:I

    .line 6
    .line 7
    invoke-virtual {p1, v0, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_rl_top:I

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Landroid/widget/LinearLayout;

    .line 17
    .line 18
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->a:Landroid/widget/LinearLayout;

    .line 19
    .line 20
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 21
    .line 22
    .line 23
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_ll_bottom:I

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Landroid/widget/LinearLayout;

    .line 30
    .line 31
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->b:Landroid/widget/LinearLayout;

    .line 32
    .line 33
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 34
    .line 35
    .line 36
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_ll_replay:I

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, Landroid/widget/LinearLayout;

    .line 43
    .line 44
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->l:Landroid/widget/LinearLayout;

    .line 45
    .line 46
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_tv_title:I

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, Landroid/widget/TextView;

    .line 53
    .line 54
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->e:Landroid/widget/TextView;

    .line 55
    .line 56
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_iv_pause:I

    .line 57
    .line 58
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    check-cast p1, Landroid/widget/ImageView;

    .line 63
    .line 64
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->c:Landroid/widget/ImageView;

    .line 65
    .line 66
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_tv_current:I

    .line 67
    .line 68
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    check-cast p1, Landroid/widget/TextView;

    .line 73
    .line 74
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->i:Landroid/widget/TextView;

    .line 75
    .line 76
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_tv_duration:I

    .line 77
    .line 78
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    check-cast p1, Landroid/widget/TextView;

    .line 83
    .line 84
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->j:Landroid/widget/TextView;

    .line 85
    .line 86
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_seekbar_progress:I

    .line 87
    .line 88
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    check-cast p1, Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 93
    .line 94
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->k:Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 95
    .line 96
    const/4 v0, 0x0

    .line 97
    invoke-virtual {p1, v0}, Lcom/zykj/video/play/view/TCPointSeekBar;->setProgress(I)V

    .line 98
    .line 99
    .line 100
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->k:Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 101
    .line 102
    const/16 v0, 0x64

    .line 103
    .line 104
    invoke-virtual {p1, v0}, Lcom/zykj/video/play/view/TCPointSeekBar;->setMax(I)V

    .line 105
    .line 106
    .line 107
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_iv_fullscreen:I

    .line 108
    .line 109
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    check-cast p1, Landroid/widget/ImageView;

    .line 114
    .line 115
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->d:Landroid/widget/ImageView;

    .line 116
    .line 117
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_tv_back_to_live:I

    .line 118
    .line 119
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    check-cast p1, Landroid/widget/TextView;

    .line 124
    .line 125
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->f:Landroid/widget/TextView;

    .line 126
    .line 127
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_pb_live:I

    .line 128
    .line 129
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    check-cast p1, Landroid/widget/ProgressBar;

    .line 134
    .line 135
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->m:Landroid/widget/ProgressBar;

    .line 136
    .line 137
    sget p1, Lcom/zykj/video/play/R$id;->sp_speed:I

    .line 138
    .line 139
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    check-cast p1, Landroid/widget/Spinner;

    .line 144
    .line 145
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->n:Landroid/widget/Spinner;

    .line 146
    .line 147
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->f:Landroid/widget/TextView;

    .line 148
    .line 149
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 150
    .line 151
    .line 152
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->c:Landroid/widget/ImageView;

    .line 153
    .line 154
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 155
    .line 156
    .line 157
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->d:Landroid/widget/ImageView;

    .line 158
    .line 159
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 160
    .line 161
    .line 162
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->a:Landroid/widget/LinearLayout;

    .line 163
    .line 164
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 165
    .line 166
    .line 167
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->l:Landroid/widget/LinearLayout;

    .line 168
    .line 169
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 170
    .line 171
    .line 172
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->k:Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 173
    .line 174
    invoke-virtual {p1, p0}, Lcom/zykj/video/play/view/TCPointSeekBar;->setOnSeekBarChangeListener(Lcom/zykj/video/play/view/TCPointSeekBar$d;)V

    .line 175
    .line 176
    .line 177
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->n:Landroid/widget/Spinner;

    .line 178
    .line 179
    invoke-virtual {p1, p0}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 180
    .line 181
    .line 182
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_gesture_progress:I

    .line 183
    .line 184
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    check-cast p1, Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;

    .line 189
    .line 190
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->o:Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;

    .line 191
    .line 192
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_video_progress_layout:I

    .line 193
    .line 194
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    check-cast p1, Lcom/zykj/video/play/view/TCVideoProgressLayout;

    .line 199
    .line 200
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->p:Lcom/zykj/video/play/view/TCVideoProgressLayout;

    .line 201
    .line 202
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_small_iv_background:I

    .line 203
    .line 204
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    check-cast p1, Landroid/widget/ImageView;

    .line 209
    .line 210
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->g:Landroid/widget/ImageView;

    .line 211
    .line 212
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->B:Landroid/graphics/Bitmap;

    .line 213
    .line 214
    invoke-virtual {p0, p1}, Lcom/zykj/video/play/controller/TCControllerWindow;->setBackground(Landroid/graphics/Bitmap;)V

    .line 215
    .line 216
    .line 217
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_small_iv_water_mark:I

    .line 218
    .line 219
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    check-cast p1, Landroid/widget/ImageView;

    .line 224
    .line 225
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->h:Landroid/widget/ImageView;

    .line 226
    .line 227
    return-void
.end method

.method private y()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->u:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/zykj/video/play/controller/TCControllerWindow;->hide()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/video/play/controller/TCControllerWindow;->x()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->r:Lk5/a;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->r:Lk5/a;

    .line 20
    .line 21
    const-wide/16 v1, 0x1b58

    .line 22
    .line 23
    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 24
    .line 25
    .line 26
    :cond_1
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->q:Lk5/c;

    .line 27
    .line 28
    if-eqz v0, :cond_6

    .line 29
    .line 30
    invoke-interface {v0}, Lk5/c;->getSpeed()F

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/high16 v1, 0x3f800000    # 1.0f

    .line 35
    .line 36
    cmpl-float v1, v0, v1

    .line 37
    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->n:Landroid/widget/Spinner;

    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_2
    const/high16 v1, 0x3fa00000    # 1.25f

    .line 48
    .line 49
    cmpl-float v1, v0, v1

    .line 50
    .line 51
    const/4 v2, 0x1

    .line 52
    if-nez v1, :cond_3

    .line 53
    .line 54
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->n:Landroid/widget/Spinner;

    .line 55
    .line 56
    invoke-virtual {v0, v2}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_3
    const/high16 v1, 0x3fc00000    # 1.5f

    .line 61
    .line 62
    cmpl-float v1, v0, v1

    .line 63
    .line 64
    if-nez v1, :cond_4

    .line 65
    .line 66
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->n:Landroid/widget/Spinner;

    .line 67
    .line 68
    const/4 v1, 0x2

    .line 69
    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_4
    const/high16 v1, 0x40000000    # 2.0f

    .line 74
    .line 75
    cmpl-float v0, v0, v1

    .line 76
    .line 77
    if-nez v0, :cond_5

    .line 78
    .line 79
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->n:Landroid/widget/Spinner;

    .line 80
    .line 81
    const/4 v1, 0x3

    .line 82
    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_5
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->n:Landroid/widget/Spinner;

    .line 87
    .line 88
    invoke-virtual {v0, v2}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 89
    .line 90
    .line 91
    :cond_6
    return-void
.end method

.method private z()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->x:I

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
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->q:Lk5/c;

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
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->q:Lk5/c;

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
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->l:Landroid/widget/LinearLayout;

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
    invoke-virtual {p0}, Lcom/zykj/video/play/controller/TCControllerWindow;->x()V

    .line 39
    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public B(I)V
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
    const/4 v2, 0x4

    .line 12
    if-eq p1, v2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v2, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->c:Landroid/widget/ImageView;

    .line 16
    .line 17
    sget v3, Lcom/zykj/video/play/R$drawable;->superplayer_ic_vod_play_normal:I

    .line 18
    .line 19
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->m:Landroid/widget/ProgressBar;

    .line 23
    .line 24
    invoke-direct {p0, v2, v0}, Lcom/zykj/video/play/controller/TCControllerWindow;->A(Landroid/view/View;Z)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->l:Landroid/widget/LinearLayout;

    .line 28
    .line 29
    invoke-direct {p0, v0, v1}, Lcom/zykj/video/play/controller/TCControllerWindow;->A(Landroid/view/View;Z)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    iget-object v2, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->c:Landroid/widget/ImageView;

    .line 34
    .line 35
    sget v3, Lcom/zykj/video/play/R$drawable;->superplayer_ic_vod_pause_normal:I

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 38
    .line 39
    .line 40
    iget-object v2, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->m:Landroid/widget/ProgressBar;

    .line 41
    .line 42
    invoke-direct {p0, v2, v1}, Lcom/zykj/video/play/controller/TCControllerWindow;->A(Landroid/view/View;Z)V

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->l:Landroid/widget/LinearLayout;

    .line 46
    .line 47
    invoke-direct {p0, v1, v0}, Lcom/zykj/video/play/controller/TCControllerWindow;->A(Landroid/view/View;Z)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    iget-object v1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->c:Landroid/widget/ImageView;

    .line 52
    .line 53
    sget v2, Lcom/zykj/video/play/R$drawable;->superplayer_ic_vod_play_normal:I

    .line 54
    .line 55
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->m:Landroid/widget/ProgressBar;

    .line 59
    .line 60
    invoke-direct {p0, v1, v0}, Lcom/zykj/video/play/controller/TCControllerWindow;->A(Landroid/view/View;Z)V

    .line 61
    .line 62
    .line 63
    iget-object v1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->l:Landroid/widget/LinearLayout;

    .line 64
    .line 65
    invoke-direct {p0, v1, v0}, Lcom/zykj/video/play/controller/TCControllerWindow;->A(Landroid/view/View;Z)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    iget-object v1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->c:Landroid/widget/ImageView;

    .line 70
    .line 71
    sget v2, Lcom/zykj/video/play/R$drawable;->superplayer_ic_vod_pause_normal:I

    .line 72
    .line 73
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 74
    .line 75
    .line 76
    iget-object v1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->m:Landroid/widget/ProgressBar;

    .line 77
    .line 78
    invoke-direct {p0, v1, v0}, Lcom/zykj/video/play/controller/TCControllerWindow;->A(Landroid/view/View;Z)V

    .line 79
    .line 80
    .line 81
    iget-object v1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->l:Landroid/widget/LinearLayout;

    .line 82
    .line 83
    invoke-direct {p0, v1, v0}, Lcom/zykj/video/play/controller/TCControllerWindow;->A(Landroid/view/View;Z)V

    .line 84
    .line 85
    .line 86
    :goto_0
    iput p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->x:I

    .line 87
    .line 88
    return-void
.end method

.method public C(I)V
    .locals 3

    .line 1
    iput p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->w:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    if-eq p1, v0, :cond_3

    .line 8
    .line 9
    const/4 v0, 0x2

    .line 10
    if-eq p1, v0, :cond_2

    .line 11
    .line 12
    const/4 v0, 0x3

    .line 13
    if-eq p1, v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->b:Landroid/widget/LinearLayout;

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
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->f:Landroid/widget/TextView;

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->j:Landroid/widget/TextView;

    .line 30
    .line 31
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_2
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->f:Landroid/widget/TextView;

    .line 36
    .line 37
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->j:Landroid/widget/TextView;

    .line 41
    .line 42
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->k:Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 46
    .line 47
    const/16 v0, 0x64

    .line 48
    .line 49
    invoke-virtual {p1, v0}, Lcom/zykj/video/play/view/TCPointSeekBar;->setProgress(I)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_3
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->f:Landroid/widget/TextView;

    .line 54
    .line 55
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->j:Landroid/widget/TextView;

    .line 59
    .line 60
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public D(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->e:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public E(JJ)V
    .locals 8

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
    iput-wide p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->A:J

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
    iput-wide p3, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->y:J

    .line 16
    .line 17
    iget-object p3, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->i:Landroid/widget/TextView;

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
    iget-wide p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->y:J

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
    iget-wide v2, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->A:J

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
    iget-wide v2, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->A:J

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
    iput-wide v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->z:J

    .line 49
    .line 50
    move p3, v5

    .line 51
    :cond_3
    iget v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->w:I

    .line 52
    .line 53
    const/4 v1, 0x2

    .line 54
    if-eq v0, v1, :cond_4

    .line 55
    .line 56
    const/4 v4, 0x3

    .line 57
    if-ne v0, v4, :cond_7

    .line 58
    .line 59
    :cond_4
    iget-wide v6, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->z:J

    .line 60
    .line 61
    cmp-long p3, v6, v2

    .line 62
    .line 63
    if-lez p3, :cond_5

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_5
    move-wide v6, v2

    .line 67
    :goto_1
    iput-wide v6, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->z:J

    .line 68
    .line 69
    sub-long v2, p1, v2

    .line 70
    .line 71
    const-wide/16 v6, 0x1c20

    .line 72
    .line 73
    cmp-long p3, p1, v6

    .line 74
    .line 75
    if-lez p3, :cond_6

    .line 76
    .line 77
    move-wide p1, v6

    .line 78
    :cond_6
    iput-wide p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->y:J

    .line 79
    .line 80
    long-to-float p3, v2

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
    if-ltz p1, :cond_a

    .line 88
    .line 89
    cmpg-float p1, p3, p4

    .line 90
    .line 91
    if-gtz p1, :cond_a

    .line 92
    .line 93
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->k:Lcom/zykj/video/play/view/TCPointSeekBar;

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
    iget-boolean p2, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->v:Z

    .line 106
    .line 107
    if-nez p2, :cond_9

    .line 108
    .line 109
    iget p2, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->w:I

    .line 110
    .line 111
    if-ne p2, v1, :cond_8

    .line 112
    .line 113
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->k:Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 114
    .line 115
    invoke-virtual {p1}, Lcom/zykj/video/play/view/TCPointSeekBar;->getMax()I

    .line 116
    .line 117
    .line 118
    move-result p2

    .line 119
    invoke-virtual {p1, p2}, Lcom/zykj/video/play/view/TCPointSeekBar;->setProgress(I)V

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_8
    iget-object p2, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->k:Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 124
    .line 125
    invoke-virtual {p2, p1}, Lcom/zykj/video/play/view/TCPointSeekBar;->setProgress(I)V

    .line 126
    .line 127
    .line 128
    :cond_9
    :goto_2
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->j:Landroid/widget/TextView;

    .line 129
    .line 130
    iget-wide p2, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->y:J

    .line 131
    .line 132
    invoke-static {p2, p3}, Ln5/d;->b(J)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 137
    .line 138
    .line 139
    :cond_a
    return-void
.end method

.method public b(Lcom/zykj/video/play/view/TCPointSeekBar;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->r:Lk5/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d(Lcom/zykj/video/play/view/TCPointSeekBar;IZ)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->p:Lcom/zykj/video/play/view/TCVideoProgressLayout;

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
    int-to-float p3, p2

    .line 11
    invoke-virtual {p1}, Lcom/zykj/video/play/view/TCPointSeekBar;->getMax()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    int-to-float p1, p1

    .line 16
    div-float/2addr p3, p1

    .line 17
    iget-wide v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->y:J

    .line 18
    .line 19
    long-to-float p1, v0

    .line 20
    mul-float/2addr p1, p3

    .line 21
    iget v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->w:I

    .line 22
    .line 23
    const/4 v1, 0x2

    .line 24
    if-eq v0, v1, :cond_1

    .line 25
    .line 26
    const/4 v1, 0x3

    .line 27
    if-ne v0, v1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object p3, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->p:Lcom/zykj/video/play/view/TCVideoProgressLayout;

    .line 31
    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    float-to-long v1, p1

    .line 38
    invoke-static {v1, v2}, Ln5/d;->b(J)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string p1, " / "

    .line 46
    .line 47
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    iget-wide v1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->y:J

    .line 51
    .line 52
    invoke-static {v1, v2}, Ln5/d;->b(J)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p3, p1}, Lcom/zykj/video/play/view/TCVideoProgressLayout;->setTimeText(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_1
    :goto_0
    iget-wide v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->z:J

    .line 68
    .line 69
    const-wide/16 v2, 0x1c20

    .line 70
    .line 71
    cmp-long p1, v0, v2

    .line 72
    .line 73
    if-lez p1, :cond_2

    .line 74
    .line 75
    long-to-float p1, v0

    .line 76
    const/high16 v0, 0x3f800000    # 1.0f

    .line 77
    .line 78
    sub-float/2addr v0, p3

    .line 79
    const/high16 p3, 0x45e10000    # 7200.0f

    .line 80
    .line 81
    mul-float/2addr v0, p3

    .line 82
    sub-float/2addr p1, v0

    .line 83
    float-to-int p1, p1

    .line 84
    int-to-float p1, p1

    .line 85
    goto :goto_1

    .line 86
    :cond_2
    long-to-float p1, v0

    .line 87
    mul-float/2addr p1, p3

    .line 88
    :goto_1
    iget-object p3, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->p:Lcom/zykj/video/play/view/TCVideoProgressLayout;

    .line 89
    .line 90
    float-to-long v0, p1

    .line 91
    invoke-static {v0, v1}, Ln5/d;->b(J)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {p3, p1}, Lcom/zykj/video/play/view/TCVideoProgressLayout;->setTimeText(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    :goto_2
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->p:Lcom/zykj/video/play/view/TCVideoProgressLayout;

    .line 99
    .line 100
    invoke-virtual {p1, p2}, Lcom/zykj/video/play/view/TCVideoProgressLayout;->setProgress(I)V

    .line 101
    .line 102
    .line 103
    :cond_3
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
    iget v1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->w:I

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
    iget-object v1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->m:Landroid/widget/ProgressBar;

    .line 22
    .line 23
    invoke-direct {p0, v1, v2}, Lcom/zykj/video/play/controller/TCControllerWindow;->A(Landroid/view/View;Z)V

    .line 24
    .line 25
    .line 26
    iget-wide v1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->z:J

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
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->q:Lk5/c;

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
    iget-object v1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->l:Landroid/widget/LinearLayout;

    .line 65
    .line 66
    const/4 v2, 0x0

    .line 67
    invoke-direct {p0, v1, v2}, Lcom/zykj/video/play/controller/TCControllerWindow;->A(Landroid/view/View;Z)V

    .line 68
    .line 69
    .line 70
    int-to-float v0, v0

    .line 71
    int-to-float p1, p1

    .line 72
    div-float/2addr v0, p1

    .line 73
    iget-wide v1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->y:J

    .line 74
    .line 75
    long-to-float p1, v1

    .line 76
    mul-float/2addr p1, v0

    .line 77
    float-to-int p1, p1

    .line 78
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->q:Lk5/c;

    .line 79
    .line 80
    if-eqz v0, :cond_3

    .line 81
    .line 82
    invoke-interface {v0, p1}, Lk5/c;->k(I)V

    .line 83
    .line 84
    .line 85
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->q:Lk5/c;

    .line 86
    .line 87
    invoke-interface {p1}, Lk5/c;->onResume()V

    .line 88
    .line 89
    .line 90
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->r:Lk5/a;

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

.method public hide()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->u:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->a:Landroid/widget/LinearLayout;

    .line 5
    .line 6
    const/16 v1, 0x8

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->b:Landroid/widget/LinearLayout;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    iget v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->w:I

    .line 17
    .line 18
    const/4 v2, 0x3

    .line 19
    if-ne v0, v2, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->f:Landroid/widget/TextView;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-wide v2, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->C:J

    .line 6
    .line 7
    sub-long/2addr v0, v2

    .line 8
    const-wide/16 v2, 0x12c

    .line 9
    .line 10
    cmp-long v0, v0, v2

    .line 11
    .line 12
    if-gez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    iput-wide v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->C:J

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    sget v0, Lcom/zykj/video/play/R$id;->superplayer_rl_top:I

    .line 26
    .line 27
    if-ne p1, v0, :cond_1

    .line 28
    .line 29
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->q:Lk5/c;

    .line 30
    .line 31
    if-eqz p1, :cond_5

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    invoke-interface {p1, v0}, Lk5/c;->b(I)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    sget v0, Lcom/zykj/video/play/R$id;->superplayer_iv_pause:I

    .line 39
    .line 40
    if-ne p1, v0, :cond_2

    .line 41
    .line 42
    invoke-direct {p0}, Lcom/zykj/video/play/controller/TCControllerWindow;->z()V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_2
    sget v0, Lcom/zykj/video/play/R$id;->superplayer_iv_fullscreen:I

    .line 47
    .line 48
    if-ne p1, v0, :cond_3

    .line 49
    .line 50
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->q:Lk5/c;

    .line 51
    .line 52
    if-eqz p1, :cond_5

    .line 53
    .line 54
    const/4 v0, 0x2

    .line 55
    invoke-interface {p1, v0}, Lk5/c;->j(I)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_3
    sget v0, Lcom/zykj/video/play/R$id;->superplayer_ll_replay:I

    .line 60
    .line 61
    if-ne p1, v0, :cond_4

    .line 62
    .line 63
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->q:Lk5/c;

    .line 64
    .line 65
    if-eqz p1, :cond_5

    .line 66
    .line 67
    invoke-interface {p1}, Lk5/c;->onResume()V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_4
    sget v0, Lcom/zykj/video/play/R$id;->superplayer_tv_back_to_live:I

    .line 72
    .line 73
    if-ne p1, v0, :cond_5

    .line 74
    .line 75
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->q:Lk5/c;

    .line 76
    .line 77
    if-eqz p1, :cond_5

    .line 78
    .line 79
    invoke-interface {p1}, Lk5/c;->e()V

    .line 80
    .line 81
    .line 82
    :cond_5
    :goto_0
    return-void
.end method

.method public onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 1
    check-cast p2, Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget p4, Lcom/zykj/video/play/R$color;->superplayer_white:I

    .line 8
    .line 9
    invoke-virtual {p1, p4}, Landroid/content/res/Resources;->getColor(I)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 14
    .line 15
    .line 16
    const/high16 p1, 0x41300000    # 11.0f

    .line 17
    .line 18
    const/4 p4, 0x2

    .line 19
    invoke-virtual {p2, p4, p1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 20
    .line 21
    .line 22
    const/16 p1, 0x11

    .line 23
    .line 24
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 25
    .line 26
    .line 27
    const/high16 p1, 0x3f800000    # 1.0f

    .line 28
    .line 29
    if-eqz p3, :cond_3

    .line 30
    .line 31
    const/4 p2, 0x1

    .line 32
    if-eq p3, p2, :cond_2

    .line 33
    .line 34
    if-eq p3, p4, :cond_1

    .line 35
    .line 36
    const/4 p2, 0x3

    .line 37
    if-eq p3, p2, :cond_0

    .line 38
    .line 39
    iget-object p2, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->q:Lk5/c;

    .line 40
    .line 41
    invoke-interface {p2, p1}, Lk5/c;->a(F)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->q:Lk5/c;

    .line 46
    .line 47
    const/high16 p2, 0x40000000    # 2.0f

    .line 48
    .line 49
    invoke-interface {p1, p2}, Lk5/c;->a(F)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->q:Lk5/c;

    .line 54
    .line 55
    const/high16 p2, 0x3fc00000    # 1.5f

    .line 56
    .line 57
    invoke-interface {p1, p2}, Lk5/c;->a(F)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_2
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->q:Lk5/c;

    .line 62
    .line 63
    const/high16 p2, 0x3fa00000    # 1.25f

    .line 64
    .line 65
    invoke-interface {p1, p2}, Lk5/c;->a(F)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_3
    iget-object p2, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->q:Lk5/c;

    .line 70
    .line 71
    invoke-interface {p2, p1}, Lk5/c;->a(F)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->s:Landroid/view/GestureDetector;

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
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x1

    .line 13
    if-ne v0, v1, :cond_7

    .line 14
    .line 15
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->t:Ln5/f;

    .line 16
    .line 17
    if-eqz v0, :cond_7

    .line 18
    .line 19
    invoke-virtual {v0}, Ln5/f;->d()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_7

    .line 24
    .line 25
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->t:Ln5/f;

    .line 26
    .line 27
    invoke-virtual {v0}, Ln5/f;->c()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget-object v2, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->k:Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 32
    .line 33
    invoke-virtual {v2}, Lcom/zykj/video/play/view/TCPointSeekBar;->getMax()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-le v0, v2, :cond_1

    .line 38
    .line 39
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->k:Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/zykj/video/play/view/TCPointSeekBar;->getMax()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    :cond_1
    const/4 v2, 0x0

    .line 46
    if-gez v0, :cond_2

    .line 47
    .line 48
    move v0, v2

    .line 49
    :cond_2
    iget-object v3, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->k:Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 50
    .line 51
    invoke-virtual {v3, v0}, Lcom/zykj/video/play/view/TCPointSeekBar;->setProgress(I)V

    .line 52
    .line 53
    .line 54
    int-to-float v0, v0

    .line 55
    const/high16 v3, 0x3f800000    # 1.0f

    .line 56
    .line 57
    mul-float/2addr v0, v3

    .line 58
    iget-object v4, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->k:Lcom/zykj/video/play/view/TCPointSeekBar;

    .line 59
    .line 60
    invoke-virtual {v4}, Lcom/zykj/video/play/view/TCPointSeekBar;->getMax()I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    int-to-float v4, v4

    .line 65
    div-float/2addr v0, v4

    .line 66
    iget v4, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->w:I

    .line 67
    .line 68
    const/4 v5, 0x2

    .line 69
    if-eq v4, v5, :cond_4

    .line 70
    .line 71
    const/4 v5, 0x3

    .line 72
    if-ne v4, v5, :cond_3

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    iget-wide v3, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->y:J

    .line 76
    .line 77
    long-to-float v3, v3

    .line 78
    mul-float/2addr v0, v3

    .line 79
    float-to-int v0, v0

    .line 80
    goto :goto_1

    .line 81
    :cond_4
    :goto_0
    iget-wide v4, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->z:J

    .line 82
    .line 83
    const-wide/16 v6, 0x1c20

    .line 84
    .line 85
    cmp-long v6, v4, v6

    .line 86
    .line 87
    if-lez v6, :cond_5

    .line 88
    .line 89
    long-to-float v4, v4

    .line 90
    const/high16 v5, 0x45e10000    # 7200.0f

    .line 91
    .line 92
    sub-float/2addr v3, v0

    .line 93
    mul-float/2addr v3, v5

    .line 94
    sub-float/2addr v4, v3

    .line 95
    float-to-int v0, v4

    .line 96
    goto :goto_1

    .line 97
    :cond_5
    long-to-float v3, v4

    .line 98
    mul-float/2addr v3, v0

    .line 99
    float-to-int v0, v3

    .line 100
    :goto_1
    iget-object v3, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->q:Lk5/c;

    .line 101
    .line 102
    if-eqz v3, :cond_6

    .line 103
    .line 104
    invoke-interface {v3, v0}, Lk5/c;->k(I)V

    .line 105
    .line 106
    .line 107
    :cond_6
    iput-boolean v2, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->v:Z

    .line 108
    .line 109
    :cond_7
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-nez v0, :cond_8

    .line 114
    .line 115
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->r:Lk5/a;

    .line 116
    .line 117
    invoke-virtual {p0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_8
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    if-ne p1, v1, :cond_9

    .line 126
    .line 127
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->r:Lk5/a;

    .line 128
    .line 129
    const-wide/16 v2, 0x1b58

    .line 130
    .line 131
    invoke-virtual {p0, p1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 132
    .line 133
    .line 134
    :cond_9
    :goto_2
    return v1
.end method

.method public s()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/video/play/controller/TCControllerWindow$d;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/video/play/controller/TCControllerWindow$d;-><init>(Lcom/zykj/video/play/controller/TCControllerWindow;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setBackground(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/video/play/controller/TCControllerWindow$c;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/zykj/video/play/controller/TCControllerWindow$c;-><init>(Lcom/zykj/video/play/controller/TCControllerWindow;Landroid/graphics/Bitmap;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setCallback(Lk5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->q:Lk5/c;

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

    return-void
.end method

.method public v()V
    .locals 0

    .line 1
    return-void
.end method

.method public final w(Landroid/widget/ImageView;Landroid/graphics/Bitmap;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-direct {v0, v1, p2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    :goto_0
    return-void
.end method

.method public x()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->u:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->a:Landroid/widget/LinearLayout;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->b:Landroid/widget/LinearLayout;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 13
    .line 14
    .line 15
    iget v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->w:I

    .line 16
    .line 17
    const/4 v2, 0x3

    .line 18
    if-ne v0, v2, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow;->f:Landroid/widget/TextView;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method
