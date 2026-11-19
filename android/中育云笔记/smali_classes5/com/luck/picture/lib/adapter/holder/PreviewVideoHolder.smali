.class public Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;
.super Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;
.source "SourceFile"


# instance fields
.field public j:Landroid/widget/ImageView;

.field public k:Landroid/widget/ProgressBar;

.field public l:Landroid/view/View;

.field public m:Z

.field public final n:Lq6/d;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 5

    .line 1
    invoke-direct {p0, p1}, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;-><init>(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->m:Z

    .line 6
    .line 7
    new-instance v1, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder$e;

    .line 8
    .line 9
    invoke-direct {v1, p0}, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder$e;-><init>(Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;)V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->n:Lq6/d;

    .line 13
    .line 14
    sget v1, Lcom/luck/picture/lib/R$id;->iv_play_video:I

    .line 15
    .line 16
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Landroid/widget/ImageView;

    .line 21
    .line 22
    iput-object v1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->j:Landroid/widget/ImageView;

    .line 23
    .line 24
    sget v1, Lcom/luck/picture/lib/R$id;->progress:I

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Landroid/widget/ProgressBar;

    .line 31
    .line 32
    iput-object v1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->k:Landroid/widget/ProgressBar;

    .line 33
    .line 34
    invoke-static {}, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object v2, p0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->j:Landroid/widget/ImageView;

    .line 39
    .line 40
    iget-boolean v1, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->M:Z

    .line 41
    .line 42
    const/16 v3, 0x8

    .line 43
    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    move v1, v3

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    move v1, v0

    .line 49
    :goto_0
    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 50
    .line 51
    .line 52
    sget-object v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->O0:Ln6/d;

    .line 53
    .line 54
    if-nez v1, :cond_1

    .line 55
    .line 56
    new-instance v1, Ln6/b;

    .line 57
    .line 58
    invoke-direct {v1}, Ln6/b;-><init>()V

    .line 59
    .line 60
    .line 61
    sput-object v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->O0:Ln6/d;

    .line 62
    .line 63
    :cond_1
    sget-object v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->O0:Ln6/d;

    .line 64
    .line 65
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-interface {v1, v2}, Ln6/d;->a(Landroid/content/Context;)Landroid/view/View;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iput-object v1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->l:Landroid/view/View;

    .line 74
    .line 75
    if-eqz v1, :cond_4

    .line 76
    .line 77
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    const/4 v2, -0x1

    .line 82
    if-nez v1, :cond_2

    .line 83
    .line 84
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->l:Landroid/view/View;

    .line 85
    .line 86
    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    .line 87
    .line 88
    invoke-direct {v4, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 92
    .line 93
    .line 94
    :cond_2
    check-cast p1, Landroid/view/ViewGroup;

    .line 95
    .line 96
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->l:Landroid/view/View;

    .line 97
    .line 98
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-eq v1, v2, :cond_3

    .line 103
    .line 104
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->l:Landroid/view/View;

    .line 105
    .line 106
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 107
    .line 108
    .line 109
    :cond_3
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->l:Landroid/view/View;

    .line 110
    .line 111
    invoke-virtual {p1, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 112
    .line 113
    .line 114
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->l:Landroid/view/View;

    .line 115
    .line 116
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    .line 121
    .line 122
    new-instance v0, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 125
    .line 126
    .line 127
    const-string v1, "onCreateVideoPlayer cannot be empty,Please implement "

    .line 128
    .line 129
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    const-class v1, Ln6/d;

    .line 133
    .line 134
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw p1
.end method

.method public static synthetic m(Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->p()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic n(Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->t()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic o(Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->u()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private u()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->k:Landroid/widget/ProgressBar;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->j:Landroid/widget/ImageView;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->h:Lcom/luck/picture/lib/photoview/PhotoView;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->l:Landroid/view/View;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 22
    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public a(Lcom/luck/picture/lib/entity/LocalMedia;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->a(Lcom/luck/picture/lib/entity/LocalMedia;I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->l(Lcom/luck/picture/lib/entity/LocalMedia;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->j:Landroid/widget/ImageView;

    .line 8
    .line 9
    new-instance p2, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder$c;

    .line 10
    .line 11
    invoke-direct {p2, p0}, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder$c;-><init>(Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 18
    .line 19
    new-instance p2, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder$d;

    .line 20
    .line 21
    invoke-direct {p2, p0}, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder$d;-><init>(Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public b(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method public e(Lcom/luck/picture/lib/entity/LocalMedia;II)V
    .locals 7

    .line 1
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->g()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v4

    .line 9
    const/4 p1, -0x1

    .line 10
    if-ne p2, p1, :cond_0

    .line 11
    .line 12
    if-ne p3, p1, :cond_0

    .line 13
    .line 14
    sget-object p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 15
    .line 16
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 17
    .line 18
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    iget-object p3, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->h:Lcom/luck/picture/lib/photoview/PhotoView;

    .line 23
    .line 24
    invoke-interface {p1, p2, v4, p3}, Ln6/a;->b(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    sget-object v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 29
    .line 30
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    iget-object v3, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->h:Lcom/luck/picture/lib/photoview/PhotoView;

    .line 37
    .line 38
    move v5, p2

    .line 39
    move v6, p3

    .line 40
    invoke-interface/range {v1 .. v6}, Ln6/a;->f(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void
.end method

.method public f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->h:Lcom/luck/picture/lib/photoview/PhotoView;

    .line 2
    .line 3
    new-instance v1, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder$a;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder$a;-><init>(Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;)V

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
    new-instance v1, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder$b;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder$b;-><init>(Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;Lcom/luck/picture/lib/entity/LocalMedia;)V

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
    .locals 2

    .line 1
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->O0:Ln6/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->l:Landroid/view/View;

    .line 6
    .line 7
    invoke-interface {v0, v1}, Ln6/d;->g(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->O0:Ln6/d;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->n:Lq6/d;

    .line 13
    .line 14
    invoke-interface {v0, v1}, Ln6/d;->h(Lq6/d;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public i()V
    .locals 2

    .line 1
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->O0:Ln6/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->l:Landroid/view/View;

    .line 6
    .line 7
    invoke-interface {v0, v1}, Ln6/d;->e(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->O0:Ln6/d;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->n:Lq6/d;

    .line 13
    .line 14
    invoke-interface {v0, v1}, Ln6/d;->d(Lq6/d;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->t()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public l(Lcom/luck/picture/lib/entity/LocalMedia;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->l(Lcom/luck/picture/lib/entity/LocalMedia;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 5
    .line 6
    iget-boolean p1, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->M:Z

    .line 7
    .line 8
    if-nez p1, :cond_3

    .line 9
    .line 10
    iget p1, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->c:I

    .line 11
    .line 12
    iget v0, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->d:I

    .line 13
    .line 14
    if-ge p1, v0, :cond_3

    .line 15
    .line 16
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->l:Landroid/view/View;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    instance-of v0, p1, Landroid/widget/FrameLayout$LayoutParams;

    .line 23
    .line 24
    const/16 v1, 0x11

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    check-cast p1, Landroid/widget/FrameLayout$LayoutParams;

    .line 29
    .line 30
    iget v0, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->c:I

    .line 31
    .line 32
    iput v0, p1, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 33
    .line 34
    iget v0, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->e:I

    .line 35
    .line 36
    iput v0, p1, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 37
    .line 38
    iput v1, p1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    instance-of v0, p1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    check-cast p1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 46
    .line 47
    iget v0, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->c:I

    .line 48
    .line 49
    iput v0, p1, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 50
    .line 51
    iget v0, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->e:I

    .line 52
    .line 53
    iput v0, p1, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 54
    .line 55
    const/16 v0, 0xd

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_1
    instance-of v0, p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 62
    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    check-cast p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 66
    .line 67
    iget v0, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->c:I

    .line 68
    .line 69
    iput v0, p1, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 70
    .line 71
    iget v0, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->e:I

    .line 72
    .line 73
    iput v0, p1, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 74
    .line 75
    iput v1, p1, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 76
    .line 77
    return-void

    .line 78
    :cond_2
    instance-of v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 79
    .line 80
    if-eqz v0, :cond_3

    .line 81
    .line 82
    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 83
    .line 84
    iget v0, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->c:I

    .line 85
    .line 86
    iput v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 87
    .line 88
    iget v0, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->e:I

    .line 89
    .line 90
    iput v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 91
    .line 92
    const/4 v0, 0x0

    .line 93
    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->topToTop:I

    .line 94
    .line 95
    iput v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->bottomToBottom:I

    .line 96
    .line 97
    :cond_3
    return-void
.end method

.method public final p()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->m:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->q()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->r()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p0}, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->s()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    invoke-virtual {p0}, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->w()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public q()Z
    .locals 2

    .line 1
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->O0:Ln6/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->l:Landroid/view/View;

    .line 6
    .line 7
    invoke-interface {v0, v1}, Ln6/d;->j(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public final r()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->j:Landroid/widget/ImageView;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->O0:Ln6/d;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->l:Landroid/view/View;

    .line 12
    .line 13
    invoke-interface {v0, v1}, Ln6/d;->i(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final s()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->j:Landroid/widget/ImageView;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->O0:Ln6/d;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->l:Landroid/view/View;

    .line 13
    .line 14
    invoke-interface {v0, v1}, Ln6/d;->b(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final t()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->m:Z

    .line 3
    .line 4
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->j:Landroid/widget/ImageView;

    .line 5
    .line 6
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->k:Landroid/widget/ProgressBar;

    .line 10
    .line 11
    const/16 v2, 0x8

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->h:Lcom/luck/picture/lib/photoview/PhotoView;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->l:Landroid/view/View;

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->i:Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder$a;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-interface {v0, v1}, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder$a;->c(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method

.method public v()V
    .locals 2

    .line 1
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->O0:Ln6/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->n:Lq6/d;

    .line 6
    .line 7
    invoke-interface {v0, v1}, Ln6/d;->d(Lq6/d;)V

    .line 8
    .line 9
    .line 10
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->O0:Ln6/d;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->l:Landroid/view/View;

    .line 13
    .line 14
    invoke-interface {v0, v1}, Ln6/d;->c(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public w()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->l:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->O0:Ln6/d;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->k:Landroid/widget/ProgressBar;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->j:Landroid/widget/ImageView;

    .line 16
    .line 17
    const/16 v1, 0x8

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->i:Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder$a;

    .line 23
    .line 24
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->f:Lcom/luck/picture/lib/entity/LocalMedia;

    .line 25
    .line 26
    invoke-virtual {v1}, Lcom/luck/picture/lib/entity/LocalMedia;->q()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-interface {v0, v1}, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder$a;->c(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    iput-boolean v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->m:Z

    .line 35
    .line 36
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->O0:Ln6/d;

    .line 37
    .line 38
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->l:Landroid/view/View;

    .line 39
    .line 40
    iget-object v2, p0, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->f:Lcom/luck/picture/lib/entity/LocalMedia;

    .line 41
    .line 42
    invoke-interface {v0, v1, v2}, Ln6/d;->f(Ljava/lang/Object;Lcom/luck/picture/lib/entity/LocalMedia;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void

    .line 46
    :cond_1
    new-instance v0, Ljava/lang/NullPointerException;

    .line 47
    .line 48
    new-instance v1, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    .line 52
    .line 53
    const-string v2, "VideoPlayer cannot be empty,Please implement "

    .line 54
    .line 55
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-class v2, Ln6/d;

    .line 59
    .line 60
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw v0
.end method
