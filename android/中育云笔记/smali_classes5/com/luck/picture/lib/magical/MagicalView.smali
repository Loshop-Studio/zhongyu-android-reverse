.class public Lcom/luck/picture/lib/magical/MagicalView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public c:F

.field public final d:J

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public final k:I

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public r:Z

.field public final s:Landroid/widget/FrameLayout;

.field public final t:Landroid/view/View;

.field public final u:Lt6/b;

.field public final v:Z

.field public w:I

.field public x:I

.field public y:Lt6/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/luck/picture/lib/magical/MagicalView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/luck/picture/lib/magical/MagicalView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p2, 0x0

    .line 4
    iput p2, p0, Lcom/luck/picture/lib/magical/MagicalView;->c:F

    const-wide/16 p2, 0xfa

    .line 5
    iput-wide p2, p0, Lcom/luck/picture/lib/magical/MagicalView;->d:J

    const/4 p2, 0x0

    .line 6
    iput-boolean p2, p0, Lcom/luck/picture/lib/magical/MagicalView;->r:Z

    .line 7
    invoke-static {}, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    move-result-object p2

    .line 8
    iget-boolean p2, p2, Lcom/luck/picture/lib/config/PictureSelectionConfig;->L:Z

    iput-boolean p2, p0, Lcom/luck/picture/lib/magical/MagicalView;->v:Z

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, La7/e;->d(Landroid/content/Context;)I

    move-result p2

    iput p2, p0, Lcom/luck/picture/lib/magical/MagicalView;->k:I

    .line 10
    invoke-direct {p0}, Lcom/luck/picture/lib/magical/MagicalView;->getScreenSize()V

    .line 11
    new-instance p2, Landroid/view/View;

    invoke-direct {p2, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/luck/picture/lib/magical/MagicalView;->t:Landroid/view/View;

    .line 12
    new-instance p3, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v0, -0x1

    invoke-direct {p3, v0, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 13
    iget p3, p0, Lcom/luck/picture/lib/magical/MagicalView;->c:F

    invoke-virtual {p2, p3}, Landroid/view/View;->setAlpha(F)V

    .line 14
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 15
    new-instance p2, Landroid/widget/FrameLayout;

    invoke-direct {p2, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/luck/picture/lib/magical/MagicalView;->s:Landroid/widget/FrameLayout;

    .line 16
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {p1, v0, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 17
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 18
    new-instance p1, Lt6/b;

    invoke-direct {p1, p2}, Lt6/b;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lcom/luck/picture/lib/magical/MagicalView;->u:Lt6/b;

    return-void
.end method

.method public static synthetic a(Lcom/luck/picture/lib/magical/MagicalView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/luck/picture/lib/magical/MagicalView;->f:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic b(Lcom/luck/picture/lib/magical/MagicalView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/luck/picture/lib/magical/MagicalView;->l:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic c(Lcom/luck/picture/lib/magical/MagicalView;)Landroid/widget/FrameLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/magical/MagicalView;->s:Landroid/widget/FrameLayout;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic d(Lcom/luck/picture/lib/magical/MagicalView;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/magical/MagicalView;->w(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(Lcom/luck/picture/lib/magical/MagicalView;)Lt6/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/magical/MagicalView;->u:Lt6/b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic f(Lcom/luck/picture/lib/magical/MagicalView;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/magical/MagicalView;->y(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g(Lcom/luck/picture/lib/magical/MagicalView;)Lt6/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/magical/MagicalView;->y:Lt6/c;

    .line 2
    .line 3
    return-object p0
.end method

.method private getScreenSize()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, La7/e;->e(Landroid/content/Context;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iput v0, p0, Lcom/luck/picture/lib/magical/MagicalView;->i:I

    .line 10
    .line 11
    iget-boolean v0, p0, Lcom/luck/picture/lib/magical/MagicalView;->v:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, La7/e;->d(Landroid/content/Context;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iput v0, p0, Lcom/luck/picture/lib/magical/MagicalView;->j:I

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, La7/e;->g(Landroid/content/Context;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iput v0, p0, Lcom/luck/picture/lib/magical/MagicalView;->j:I

    .line 35
    .line 36
    return-void
.end method

.method public static synthetic h(Lcom/luck/picture/lib/magical/MagicalView;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/luck/picture/lib/magical/MagicalView;->r:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic i(Lcom/luck/picture/lib/magical/MagicalView;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/luck/picture/lib/magical/MagicalView;->c:F

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic j(Lcom/luck/picture/lib/magical/MagicalView;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/luck/picture/lib/magical/MagicalView;->c:F

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic k(Lcom/luck/picture/lib/magical/MagicalView;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/magical/MagicalView;->t:Landroid/view/View;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic l(Lcom/luck/picture/lib/magical/MagicalView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/luck/picture/lib/magical/MagicalView;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic m(Lcom/luck/picture/lib/magical/MagicalView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/luck/picture/lib/magical/MagicalView;->o:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic n(Lcom/luck/picture/lib/magical/MagicalView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/luck/picture/lib/magical/MagicalView;->h:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic o(Lcom/luck/picture/lib/magical/MagicalView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/luck/picture/lib/magical/MagicalView;->m:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic p(Lcom/luck/picture/lib/magical/MagicalView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/luck/picture/lib/magical/MagicalView;->g:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic q(Lcom/luck/picture/lib/magical/MagicalView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/luck/picture/lib/magical/MagicalView;->n:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic r(Lcom/luck/picture/lib/magical/MagicalView;FFFFFFFFF)V
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p9}, Lcom/luck/picture/lib/magical/MagicalView;->H(FFFFFFFFF)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic s(Lcom/luck/picture/lib/magical/MagicalView;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/magical/MagicalView;->E()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public A(IIZ)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/luck/picture/lib/magical/MagicalView;->v:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Lcom/luck/picture/lib/magical/MagicalView;->i:I

    .line 6
    .line 7
    iget v1, p0, Lcom/luck/picture/lib/magical/MagicalView;->j:I

    .line 8
    .line 9
    if-le v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    int-to-float p1, p1

    .line 13
    int-to-float p2, p2

    .line 14
    div-float/2addr p1, p2

    .line 15
    int-to-float p2, v0

    .line 16
    div-float/2addr p2, p1

    .line 17
    float-to-int p1, p2

    .line 18
    if-le p1, v1, :cond_1

    .line 19
    .line 20
    iget p1, p0, Lcom/luck/picture/lib/magical/MagicalView;->k:I

    .line 21
    .line 22
    iput p1, p0, Lcom/luck/picture/lib/magical/MagicalView;->j:I

    .line 23
    .line 24
    if-eqz p3, :cond_1

    .line 25
    .line 26
    iget-object p1, p0, Lcom/luck/picture/lib/magical/MagicalView;->u:Lt6/b;

    .line 27
    .line 28
    int-to-float p2, v0

    .line 29
    invoke-virtual {p1, p2}, Lt6/b;->d(F)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/luck/picture/lib/magical/MagicalView;->u:Lt6/b;

    .line 33
    .line 34
    iget p2, p0, Lcom/luck/picture/lib/magical/MagicalView;->j:I

    .line 35
    .line 36
    int-to-float p2, p2

    .line 37
    invoke-virtual {p1, p2}, Lt6/b;->a(F)V

    .line 38
    .line 39
    .line 40
    :cond_1
    :goto_0
    return-void
.end method

.method public B()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/luck/picture/lib/magical/MagicalView;->getScreenSize()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-virtual {p0, v0}, Lcom/luck/picture/lib/magical/MagicalView;->J(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public C(IIZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/luck/picture/lib/magical/MagicalView;->getScreenSize()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2, p3}, Lcom/luck/picture/lib/magical/MagicalView;->K(IIZ)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final D()V
    .locals 9

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v1, v0, [I

    .line 3
    .line 4
    iget-object v2, p0, Lcom/luck/picture/lib/magical/MagicalView;->s:Landroid/widget/FrameLayout;

    .line 5
    .line 6
    invoke-virtual {v2, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    iput v1, p0, Lcom/luck/picture/lib/magical/MagicalView;->o:I

    .line 11
    .line 12
    iget v2, p0, Lcom/luck/picture/lib/magical/MagicalView;->i:I

    .line 13
    .line 14
    int-to-float v3, v2

    .line 15
    iget v4, p0, Lcom/luck/picture/lib/magical/MagicalView;->j:I

    .line 16
    .line 17
    int-to-float v5, v4

    .line 18
    div-float/2addr v3, v5

    .line 19
    iget v5, p0, Lcom/luck/picture/lib/magical/MagicalView;->p:I

    .line 20
    .line 21
    int-to-float v6, v5

    .line 22
    iget v7, p0, Lcom/luck/picture/lib/magical/MagicalView;->q:I

    .line 23
    .line 24
    int-to-float v8, v7

    .line 25
    div-float/2addr v6, v8

    .line 26
    cmpg-float v3, v3, v6

    .line 27
    .line 28
    if-gez v3, :cond_0

    .line 29
    .line 30
    iput v2, p0, Lcom/luck/picture/lib/magical/MagicalView;->m:I

    .line 31
    .line 32
    int-to-float v1, v2

    .line 33
    int-to-float v2, v7

    .line 34
    int-to-float v3, v5

    .line 35
    div-float/2addr v2, v3

    .line 36
    mul-float/2addr v1, v2

    .line 37
    float-to-int v1, v1

    .line 38
    iput v1, p0, Lcom/luck/picture/lib/magical/MagicalView;->n:I

    .line 39
    .line 40
    sub-int/2addr v4, v1

    .line 41
    div-int/2addr v4, v0

    .line 42
    iput v4, p0, Lcom/luck/picture/lib/magical/MagicalView;->l:I

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    iput v4, p0, Lcom/luck/picture/lib/magical/MagicalView;->n:I

    .line 46
    .line 47
    int-to-float v3, v4

    .line 48
    int-to-float v4, v5

    .line 49
    int-to-float v5, v7

    .line 50
    div-float/2addr v4, v5

    .line 51
    mul-float/2addr v3, v4

    .line 52
    float-to-int v3, v3

    .line 53
    iput v3, p0, Lcom/luck/picture/lib/magical/MagicalView;->m:I

    .line 54
    .line 55
    iput v1, p0, Lcom/luck/picture/lib/magical/MagicalView;->l:I

    .line 56
    .line 57
    sub-int/2addr v2, v3

    .line 58
    div-int/2addr v2, v0

    .line 59
    iput v2, p0, Lcom/luck/picture/lib/magical/MagicalView;->o:I

    .line 60
    .line 61
    :goto_0
    iget-object v0, p0, Lcom/luck/picture/lib/magical/MagicalView;->u:Lt6/b;

    .line 62
    .line 63
    iget v1, p0, Lcom/luck/picture/lib/magical/MagicalView;->h:I

    .line 64
    .line 65
    int-to-float v1, v1

    .line 66
    invoke-virtual {v0, v1}, Lt6/b;->d(F)V

    .line 67
    .line 68
    .line 69
    iget-object v0, p0, Lcom/luck/picture/lib/magical/MagicalView;->u:Lt6/b;

    .line 70
    .line 71
    iget v1, p0, Lcom/luck/picture/lib/magical/MagicalView;->g:I

    .line 72
    .line 73
    int-to-float v1, v1

    .line 74
    invoke-virtual {v0, v1}, Lt6/b;->a(F)V

    .line 75
    .line 76
    .line 77
    iget-object v0, p0, Lcom/luck/picture/lib/magical/MagicalView;->u:Lt6/b;

    .line 78
    .line 79
    iget v1, p0, Lcom/luck/picture/lib/magical/MagicalView;->e:I

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Lt6/b;->b(I)V

    .line 82
    .line 83
    .line 84
    iget-object v0, p0, Lcom/luck/picture/lib/magical/MagicalView;->u:Lt6/b;

    .line 85
    .line 86
    iget v1, p0, Lcom/luck/picture/lib/magical/MagicalView;->f:I

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Lt6/b;->c(I)V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public final E()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/luck/picture/lib/magical/MagicalView;->r:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/luck/picture/lib/magical/MagicalView;->z()V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lcom/luck/picture/lib/magical/MagicalView;->y:Lt6/c;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-interface {v1, p0, v0}, Lt6/c;->d(Lcom/luck/picture/lib/magical/MagicalView;Z)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public F(IIIIII)V
    .locals 0

    .line 1
    iput p5, p0, Lcom/luck/picture/lib/magical/MagicalView;->p:I

    .line 2
    .line 3
    iput p6, p0, Lcom/luck/picture/lib/magical/MagicalView;->q:I

    .line 4
    .line 5
    iput p1, p0, Lcom/luck/picture/lib/magical/MagicalView;->e:I

    .line 6
    .line 7
    iput p2, p0, Lcom/luck/picture/lib/magical/MagicalView;->f:I

    .line 8
    .line 9
    iput p3, p0, Lcom/luck/picture/lib/magical/MagicalView;->h:I

    .line 10
    .line 11
    iput p4, p0, Lcom/luck/picture/lib/magical/MagicalView;->g:I

    .line 12
    .line 13
    return-void
.end method

.method public final G(FFFF)V
    .locals 11

    .line 1
    const/4 v7, 0x0

    .line 2
    const/4 v9, 0x0

    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v5, 0x0

    .line 7
    move-object v0, p0

    .line 8
    move v4, p1

    .line 9
    move v6, p2

    .line 10
    move v8, p3

    .line 11
    move v10, p4

    .line 12
    invoke-virtual/range {v0 .. v10}, Lcom/luck/picture/lib/magical/MagicalView;->I(ZFFFFFFFFF)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final H(FFFFFFFFF)V
    .locals 11

    .line 1
    const/4 v1, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move v2, p1

    .line 4
    move v3, p2

    .line 5
    move v4, p3

    .line 6
    move v5, p4

    .line 7
    move/from16 v6, p5

    .line 8
    .line 9
    move/from16 v7, p6

    .line 10
    .line 11
    move/from16 v8, p7

    .line 12
    .line 13
    move/from16 v9, p8

    .line 14
    .line 15
    move/from16 v10, p9

    .line 16
    .line 17
    invoke-virtual/range {v0 .. v10}, Lcom/luck/picture/lib/magical/MagicalView;->I(ZFFFFFFFFF)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final I(ZFFFFFFFFF)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lcom/luck/picture/lib/magical/MagicalView;->u:Lt6/b;

    .line 4
    .line 5
    invoke-virtual {p1, p8}, Lt6/b;->d(F)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lcom/luck/picture/lib/magical/MagicalView;->u:Lt6/b;

    .line 9
    .line 10
    invoke-virtual {p1, p10}, Lt6/b;->a(F)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lcom/luck/picture/lib/magical/MagicalView;->u:Lt6/b;

    .line 14
    .line 15
    float-to-int p2, p6

    .line 16
    invoke-virtual {p1, p2}, Lt6/b;->b(I)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lcom/luck/picture/lib/magical/MagicalView;->u:Lt6/b;

    .line 20
    .line 21
    float-to-int p2, p4

    .line 22
    invoke-virtual {p1, p2}, Lt6/b;->c(I)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    sub-float/2addr p6, p5

    .line 27
    mul-float/2addr p6, p2

    .line 28
    sub-float/2addr p8, p7

    .line 29
    mul-float/2addr p8, p2

    .line 30
    sub-float/2addr p10, p9

    .line 31
    mul-float/2addr p10, p2

    .line 32
    sub-float/2addr p4, p3

    .line 33
    mul-float/2addr p2, p4

    .line 34
    iget-object p1, p0, Lcom/luck/picture/lib/magical/MagicalView;->u:Lt6/b;

    .line 35
    .line 36
    add-float/2addr p7, p8

    .line 37
    invoke-virtual {p1, p7}, Lt6/b;->d(F)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lcom/luck/picture/lib/magical/MagicalView;->u:Lt6/b;

    .line 41
    .line 42
    add-float/2addr p9, p10

    .line 43
    invoke-virtual {p1, p9}, Lt6/b;->a(F)V

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Lcom/luck/picture/lib/magical/MagicalView;->u:Lt6/b;

    .line 47
    .line 48
    add-float/2addr p5, p6

    .line 49
    float-to-int p4, p5

    .line 50
    invoke-virtual {p1, p4}, Lt6/b;->b(I)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lcom/luck/picture/lib/magical/MagicalView;->u:Lt6/b;

    .line 54
    .line 55
    add-float/2addr p3, p2

    .line 56
    float-to-int p2, p3

    .line 57
    invoke-virtual {p1, p2}, Lt6/b;->c(I)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public J(Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/high16 v0, 0x3f800000    # 1.0f

    .line 4
    .line 5
    iput v0, p0, Lcom/luck/picture/lib/magical/MagicalView;->c:F

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    iput v0, p0, Lcom/luck/picture/lib/magical/MagicalView;->c:F

    .line 10
    .line 11
    iget-object v1, p0, Lcom/luck/picture/lib/magical/MagicalView;->t:Landroid/view/View;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/luck/picture/lib/magical/MagicalView;->D()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/magical/MagicalView;->x(Z)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public K(IIZ)V
    .locals 2

    .line 1
    iput p1, p0, Lcom/luck/picture/lib/magical/MagicalView;->p:I

    .line 2
    .line 3
    iput p2, p0, Lcom/luck/picture/lib/magical/MagicalView;->q:I

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    iput p1, p0, Lcom/luck/picture/lib/magical/MagicalView;->e:I

    .line 7
    .line 8
    iput p1, p0, Lcom/luck/picture/lib/magical/MagicalView;->f:I

    .line 9
    .line 10
    iput p1, p0, Lcom/luck/picture/lib/magical/MagicalView;->h:I

    .line 11
    .line 12
    iput p1, p0, Lcom/luck/picture/lib/magical/MagicalView;->g:I

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/luck/picture/lib/magical/MagicalView;->D()V

    .line 18
    .line 19
    .line 20
    iget p1, p0, Lcom/luck/picture/lib/magical/MagicalView;->l:I

    .line 21
    .line 22
    int-to-float p1, p1

    .line 23
    iget p2, p0, Lcom/luck/picture/lib/magical/MagicalView;->o:I

    .line 24
    .line 25
    int-to-float p2, p2

    .line 26
    iget v0, p0, Lcom/luck/picture/lib/magical/MagicalView;->m:I

    .line 27
    .line 28
    int-to-float v0, v0

    .line 29
    iget v1, p0, Lcom/luck/picture/lib/magical/MagicalView;->n:I

    .line 30
    .line 31
    int-to-float v1, v1

    .line 32
    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/luck/picture/lib/magical/MagicalView;->G(FFFF)V

    .line 33
    .line 34
    .line 35
    const/high16 p1, 0x3f800000    # 1.0f

    .line 36
    .line 37
    if-eqz p3, :cond_0

    .line 38
    .line 39
    iput p1, p0, Lcom/luck/picture/lib/magical/MagicalView;->c:F

    .line 40
    .line 41
    iget-object p2, p0, Lcom/luck/picture/lib/magical/MagicalView;->t:Landroid/view/View;

    .line 42
    .line 43
    invoke-virtual {p2, p1}, Landroid/view/View;->setAlpha(F)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const/4 p2, 0x0

    .line 48
    iput p2, p0, Lcom/luck/picture/lib/magical/MagicalView;->c:F

    .line 49
    .line 50
    iget-object p3, p0, Lcom/luck/picture/lib/magical/MagicalView;->t:Landroid/view/View;

    .line 51
    .line 52
    invoke-virtual {p3, p2}, Landroid/view/View;->setAlpha(F)V

    .line 53
    .line 54
    .line 55
    iget-object p3, p0, Lcom/luck/picture/lib/magical/MagicalView;->s:Landroid/widget/FrameLayout;

    .line 56
    .line 57
    invoke-virtual {p3, p2}, Landroid/view/View;->setAlpha(F)V

    .line 58
    .line 59
    .line 60
    iget-object p2, p0, Lcom/luck/picture/lib/magical/MagicalView;->s:Landroid/widget/FrameLayout;

    .line 61
    .line 62
    invoke-virtual {p2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-virtual {p2, p1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    const-wide/16 v0, 0xfa

    .line 71
    .line 72
    invoke-virtual {p2, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    invoke-virtual {p2}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 77
    .line 78
    .line 79
    iget-object p2, p0, Lcom/luck/picture/lib/magical/MagicalView;->t:Landroid/view/View;

    .line 80
    .line 81
    invoke-virtual {p2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    invoke-virtual {p2, p1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {p1, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 94
    .line 95
    .line 96
    :goto_0
    invoke-virtual {p0}, Lcom/luck/picture/lib/magical/MagicalView;->E()V

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/magical/MagicalView;->s:Landroid/widget/FrameLayout;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    instance-of v1, v0, Landroidx/viewpager2/widget/ViewPager2;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    check-cast v0, Landroidx/viewpager2/widget/ViewPager2;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x1

    .line 21
    if-eqz v1, :cond_4

    .line 22
    .line 23
    if-eq v1, v2, :cond_3

    .line 24
    .line 25
    const/4 v3, 0x2

    .line 26
    if-eq v1, v3, :cond_1

    .line 27
    .line 28
    const/4 v3, 0x3

    .line 29
    if-eq v1, v3, :cond_3

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    float-to-int v1, v1

    .line 37
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    float-to-int v3, v3

    .line 42
    iget v4, p0, Lcom/luck/picture/lib/magical/MagicalView;->w:I

    .line 43
    .line 44
    sub-int/2addr v1, v4

    .line 45
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    iget v4, p0, Lcom/luck/picture/lib/magical/MagicalView;->x:I

    .line 50
    .line 51
    sub-int v4, v3, v4

    .line 52
    .line 53
    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-le v1, v4, :cond_2

    .line 58
    .line 59
    if-eqz v0, :cond_5

    .line 60
    .line 61
    invoke-virtual {v0, v2}, Landroidx/viewpager2/widget/ViewPager2;->setUserInputEnabled(Z)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    if-eqz v0, :cond_5

    .line 66
    .line 67
    iget v1, p0, Lcom/luck/picture/lib/magical/MagicalView;->x:I

    .line 68
    .line 69
    sub-int/2addr v1, v3

    .line 70
    invoke-virtual {p0, v1}, Landroid/view/View;->canScrollVertically(I)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    invoke-virtual {v0, v1}, Landroidx/viewpager2/widget/ViewPager2;->setUserInputEnabled(Z)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    if-eqz v0, :cond_5

    .line 79
    .line 80
    invoke-virtual {v0, v2}, Landroidx/viewpager2/widget/ViewPager2;->setUserInputEnabled(Z)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    float-to-int v1, v1

    .line 89
    iput v1, p0, Lcom/luck/picture/lib/magical/MagicalView;->w:I

    .line 90
    .line 91
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    float-to-int v1, v1

    .line 96
    iput v1, p0, Lcom/luck/picture/lib/magical/MagicalView;->x:I

    .line 97
    .line 98
    if-eqz v0, :cond_5

    .line 99
    .line 100
    invoke-virtual {v0, v2}, Landroidx/viewpager2/widget/ViewPager2;->setUserInputEnabled(Z)V

    .line 101
    .line 102
    .line 103
    :cond_5
    :goto_1
    invoke-super {p0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    return p1
.end method

.method public setBackgroundAlpha(F)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/luck/picture/lib/magical/MagicalView;->c:F

    .line 2
    .line 3
    iget-object v0, p0, Lcom/luck/picture/lib/magical/MagicalView;->t:Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setBackgroundColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/magical/MagicalView;->t:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setMagicalContent(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/magical/MagicalView;->s:Landroid/widget/FrameLayout;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setOnMojitoViewCallback(Lt6/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/magical/MagicalView;->y:Lt6/c;

    .line 2
    .line 3
    return-void
.end method

.method public t()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/luck/picture/lib/magical/MagicalView;->r:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget v0, p0, Lcom/luck/picture/lib/magical/MagicalView;->h:I

    .line 7
    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    iget v0, p0, Lcom/luck/picture/lib/magical/MagicalView;->g:I

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    iget-object v0, p0, Lcom/luck/picture/lib/magical/MagicalView;->y:Lt6/c;

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    invoke-interface {v0}, Lt6/c;->b()V

    .line 20
    .line 21
    .line 22
    :cond_2
    const/4 v0, 0x0

    .line 23
    invoke-virtual {p0, v0}, Lcom/luck/picture/lib/magical/MagicalView;->w(Z)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/luck/picture/lib/magical/MagicalView;->u()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_3
    :goto_0
    invoke-virtual {p0}, Lcom/luck/picture/lib/magical/MagicalView;->v()V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final u()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/magical/MagicalView;->s:Landroid/widget/FrameLayout;

    .line 2
    .line 3
    new-instance v1, Lcom/luck/picture/lib/magical/MagicalView$c;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lcom/luck/picture/lib/magical/MagicalView$c;-><init>(Lcom/luck/picture/lib/magical/MagicalView;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final v()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/magical/MagicalView;->s:Landroid/widget/FrameLayout;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-wide/16 v2, 0xfa

    .line 13
    .line 14
    invoke-virtual {v0, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v4, Lcom/luck/picture/lib/magical/MagicalView$d;

    .line 19
    .line 20
    invoke-direct {v4, p0}, Lcom/luck/picture/lib/magical/MagicalView$d;-><init>(Lcom/luck/picture/lib/magical/MagicalView;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v4}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/luck/picture/lib/magical/MagicalView;->t:Landroid/view/View;

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final w(Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lcom/luck/picture/lib/magical/MagicalView;->y:Lt6/c;

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-interface {p1, v0}, Lt6/c;->c(Z)V

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public final x(Z)V
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/high16 p1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    iput p1, p0, Lcom/luck/picture/lib/magical/MagicalView;->c:F

    .line 6
    .line 7
    iget-object v0, p0, Lcom/luck/picture/lib/magical/MagicalView;->t:Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 10
    .line 11
    .line 12
    iget p1, p0, Lcom/luck/picture/lib/magical/MagicalView;->l:I

    .line 13
    .line 14
    int-to-float p1, p1

    .line 15
    iget v0, p0, Lcom/luck/picture/lib/magical/MagicalView;->o:I

    .line 16
    .line 17
    int-to-float v0, v0

    .line 18
    iget v1, p0, Lcom/luck/picture/lib/magical/MagicalView;->m:I

    .line 19
    .line 20
    int-to-float v1, v1

    .line 21
    iget v2, p0, Lcom/luck/picture/lib/magical/MagicalView;->n:I

    .line 22
    .line 23
    int-to-float v2, v2

    .line 24
    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/luck/picture/lib/magical/MagicalView;->G(FFFF)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/luck/picture/lib/magical/MagicalView;->E()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    const/4 p1, 0x2

    .line 32
    new-array p1, p1, [F

    .line 33
    .line 34
    fill-array-data p1, :array_0

    .line 35
    .line 36
    .line 37
    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    new-instance v0, Lcom/luck/picture/lib/magical/MagicalView$a;

    .line 42
    .line 43
    invoke-direct {v0, p0}, Lcom/luck/picture/lib/magical/MagicalView$a;-><init>(Lcom/luck/picture/lib/magical/MagicalView;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 47
    .line 48
    .line 49
    new-instance v0, Lcom/luck/picture/lib/magical/MagicalView$b;

    .line 50
    .line 51
    invoke-direct {v0, p0}, Lcom/luck/picture/lib/magical/MagicalView$b;-><init>(Lcom/luck/picture/lib/magical/MagicalView;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 55
    .line 56
    .line 57
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 58
    .line 59
    const-wide/16 v0, 0xfa

    .line 60
    .line 61
    invoke-virtual {p1, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 66
    .line 67
    .line 68
    const/4 p1, 0x0

    .line 69
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/magical/MagicalView;->y(Z)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final y(Z)V
    .locals 4

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    .line 6
    .line 7
    :goto_0
    iget v1, p0, Lcom/luck/picture/lib/magical/MagicalView;->c:F

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    new-array v2, v2, [F

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    aput v1, v2, v3

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    aput v0, v2, v1

    .line 17
    .line 18
    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v1, Lcom/luck/picture/lib/magical/MagicalView$e;

    .line 23
    .line 24
    invoke-direct {v1, p0}, Lcom/luck/picture/lib/magical/MagicalView$e;-><init>(Lcom/luck/picture/lib/magical/MagicalView;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 28
    .line 29
    .line 30
    new-instance v1, Lcom/luck/picture/lib/magical/MagicalView$f;

    .line 31
    .line 32
    invoke-direct {v1, p0, p1}, Lcom/luck/picture/lib/magical/MagicalView$f;-><init>(Lcom/luck/picture/lib/magical/MagicalView;Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 36
    .line 37
    .line 38
    const-wide/16 v1, 0xfa

    .line 39
    .line 40
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final z()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/luck/picture/lib/magical/MagicalView;->j:I

    .line 2
    .line 3
    iput v0, p0, Lcom/luck/picture/lib/magical/MagicalView;->n:I

    .line 4
    .line 5
    iget v1, p0, Lcom/luck/picture/lib/magical/MagicalView;->i:I

    .line 6
    .line 7
    iput v1, p0, Lcom/luck/picture/lib/magical/MagicalView;->m:I

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    iput v1, p0, Lcom/luck/picture/lib/magical/MagicalView;->l:I

    .line 11
    .line 12
    iget-object v2, p0, Lcom/luck/picture/lib/magical/MagicalView;->u:Lt6/b;

    .line 13
    .line 14
    int-to-float v0, v0

    .line 15
    invoke-virtual {v2, v0}, Lt6/b;->a(F)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/luck/picture/lib/magical/MagicalView;->u:Lt6/b;

    .line 19
    .line 20
    iget v2, p0, Lcom/luck/picture/lib/magical/MagicalView;->i:I

    .line 21
    .line 22
    int-to-float v2, v2

    .line 23
    invoke-virtual {v0, v2}, Lt6/b;->d(F)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/luck/picture/lib/magical/MagicalView;->u:Lt6/b;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lt6/b;->c(I)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/luck/picture/lib/magical/MagicalView;->u:Lt6/b;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lt6/b;->b(I)V

    .line 34
    .line 35
    .line 36
    return-void
.end method
