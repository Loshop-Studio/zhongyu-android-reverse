.class public Lcom/zykj/video/play/view/TCPointSeekBar;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/video/play/view/TCPointSeekBar$h;,
        Lcom/zykj/video/play/view/TCPointSeekBar$g;,
        Lcom/zykj/video/play/view/TCPointSeekBar$f;,
        Lcom/zykj/video/play/view/TCPointSeekBar$e;,
        Lcom/zykj/video/play/view/TCPointSeekBar$d;
    }
.end annotation


# instance fields
.field public A:Z

.field public B:Lcom/zykj/video/play/view/TCPointSeekBar$d;

.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:Landroid/graphics/Paint;

.field public j:Landroid/graphics/Paint;

.field public k:Landroid/graphics/Paint;

.field public l:Landroid/graphics/drawable/Drawable;

.field public m:I

.field public n:F

.field public o:F

.field public p:F

.field public q:F

.field public r:Z

.field public s:F

.field public t:F

.field public u:I

.field public v:I

.field public w:F

.field public x:Lcom/zykj/video/play/view/TCPointSeekBar$h;

.field public y:Ljava/util/List;

.field public z:Lcom/zykj/video/play/view/TCPointSeekBar$e;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput p1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->s:F

    .line 6
    .line 7
    const/16 v0, 0x64

    .line 8
    .line 9
    iput v0, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->v:I

    .line 10
    .line 11
    iput p1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->w:F

    .line 12
    .line 13
    invoke-virtual {p0, p2}, Lcom/zykj/video/play/view/TCPointSeekBar;->u(Landroid/util/AttributeSet;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static synthetic a(Lcom/zykj/video/play/view/TCPointSeekBar;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/video/play/view/TCPointSeekBar;->k()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Lcom/zykj/video/play/view/TCPointSeekBar;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->A:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic c(Lcom/zykj/video/play/view/TCPointSeekBar;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->A:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic d(Lcom/zykj/video/play/view/TCPointSeekBar;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->y:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic e(Lcom/zykj/video/play/view/TCPointSeekBar;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->r:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic f(Lcom/zykj/video/play/view/TCPointSeekBar;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/video/play/view/TCPointSeekBar;->l()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g(Lcom/zykj/video/play/view/TCPointSeekBar;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/video/play/view/TCPointSeekBar;->p()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic h(Lcom/zykj/video/play/view/TCPointSeekBar;)Lcom/zykj/video/play/view/TCPointSeekBar$e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->z:Lcom/zykj/video/play/view/TCPointSeekBar$e;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public getMax()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->v:I

    .line 2
    .line 3
    return v0
.end method

.method public getProgress()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->u:I

    .line 2
    .line 3
    return v0
.end method

.method public i(Lcom/zykj/video/play/view/TCPointSeekBar$f;I)V
    .locals 9

    .line 1
    iget v0, p1, Lcom/zykj/video/play/view/TCPointSeekBar$f;->a:I

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    const/high16 v1, 0x3f800000    # 1.0f

    .line 5
    .line 6
    mul-float/2addr v0, v1

    .line 7
    iget v1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->v:I

    .line 8
    .line 9
    int-to-float v1, v1

    .line 10
    div-float/2addr v0, v1

    .line 11
    iget v1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->f:I

    .line 12
    .line 13
    iget v2, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->e:I

    .line 14
    .line 15
    sub-int/2addr v1, v2

    .line 16
    iget v2, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->d:I

    .line 17
    .line 18
    iget v3, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->c:I

    .line 19
    .line 20
    sub-int/2addr v2, v3

    .line 21
    int-to-float v2, v2

    .line 22
    mul-float/2addr v0, v2

    .line 23
    iget-object v2, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->l:Landroid/graphics/drawable/Drawable;

    .line 24
    .line 25
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    sub-int/2addr v2, v1

    .line 30
    div-int/lit8 v2, v2, 0x2

    .line 31
    .line 32
    int-to-float v2, v2

    .line 33
    iget v3, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->e:I

    .line 34
    .line 35
    int-to-float v3, v3

    .line 36
    iget v4, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->f:I

    .line 37
    .line 38
    int-to-float v4, v4

    .line 39
    int-to-float v1, v1

    .line 40
    add-float/2addr v1, v2

    .line 41
    new-instance v5, Lcom/zykj/video/play/view/TCPointSeekBar$g;

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    invoke-direct {v5, v6}, Lcom/zykj/video/play/view/TCPointSeekBar$g;-><init>(Landroid/content/Context;)V

    .line 48
    .line 49
    .line 50
    new-instance v6, Landroid/widget/RelativeLayout$LayoutParams;

    .line 51
    .line 52
    iget-object v7, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->l:Landroid/graphics/drawable/Drawable;

    .line 53
    .line 54
    invoke-virtual {v7}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    iget-object v8, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->l:Landroid/graphics/drawable/Drawable;

    .line 59
    .line 60
    invoke-virtual {v8}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 61
    .line 62
    .line 63
    move-result v8

    .line 64
    invoke-direct {v6, v7, v8}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 65
    .line 66
    .line 67
    float-to-int v0, v0

    .line 68
    iput v0, v6, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 69
    .line 70
    invoke-virtual {v5, v2, v3, v4, v1}, Lcom/zykj/video/play/view/TCPointSeekBar$g;->c(FFFF)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v5, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 74
    .line 75
    .line 76
    iget p1, p1, Lcom/zykj/video/play/view/TCPointSeekBar$f;->b:I

    .line 77
    .line 78
    invoke-virtual {v5, p1}, Lcom/zykj/video/play/view/TCPointSeekBar$g;->b(I)V

    .line 79
    .line 80
    .line 81
    new-instance p1, Lcom/zykj/video/play/view/TCPointSeekBar$c;

    .line 82
    .line 83
    invoke-direct {p1, p0, v5, p2}, Lcom/zykj/video/play/view/TCPointSeekBar$c;-><init>(Lcom/zykj/video/play/view/TCPointSeekBar;Lcom/zykj/video/play/view/TCPointSeekBar$g;I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v5, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public final j()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/video/play/view/TCPointSeekBar$b;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/video/play/view/TCPointSeekBar$b;-><init>(Lcom/zykj/video/play/view/TCPointSeekBar;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final k()V
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/video/play/view/TCPointSeekBar$h;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->l:Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Lcom/zykj/video/play/view/TCPointSeekBar$h;-><init>(Landroid/content/Context;Landroid/graphics/drawable/Drawable;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->x:Lcom/zykj/video/play/view/TCPointSeekBar$h;

    .line 13
    .line 14
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->l:Landroid/graphics/drawable/Drawable;

    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iget-object v2, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->l:Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->x:Lcom/zykj/video/play/view/TCPointSeekBar$h;

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->x:Lcom/zykj/video/play/view/TCPointSeekBar$h;

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final l()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->d:I

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->c:I

    .line 4
    .line 5
    sub-int/2addr v0, v1

    .line 6
    int-to-float v0, v0

    .line 7
    iget v1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->u:I

    .line 8
    .line 9
    int-to-float v1, v1

    .line 10
    const/high16 v2, 0x3f800000    # 1.0f

    .line 11
    .line 12
    mul-float/2addr v1, v2

    .line 13
    iget v2, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->v:I

    .line 14
    .line 15
    int-to-float v2, v2

    .line 16
    div-float/2addr v1, v2

    .line 17
    mul-float/2addr v0, v1

    .line 18
    iput v0, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->n:F

    .line 19
    .line 20
    iput v0, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->t:F

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput v0, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->s:F

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/zykj/video/play/view/TCPointSeekBar;->m()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final m()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->s:F

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/zykj/video/play/view/TCPointSeekBar;->q(F)F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->l:Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    int-to-float v1, v1

    .line 14
    add-float/2addr v1, v0

    .line 15
    iput v0, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->n:F

    .line 16
    .line 17
    iput v1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->o:F

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput v0, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->p:F

    .line 21
    .line 22
    iget v0, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->b:I

    .line 23
    .line 24
    int-to-float v0, v0

    .line 25
    iput v0, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->q:F

    .line 26
    .line 27
    return-void
.end method

.method public final n()V
    .locals 4

    .line 1
    iget v0, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->n:F

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    cmpl-float v1, v0, v1

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, v0, v2}, Lcom/zykj/video/play/view/TCPointSeekBar;->o(IZ)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget v1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->o:F

    .line 15
    .line 16
    iget v3, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->a:I

    .line 17
    .line 18
    int-to-float v3, v3

    .line 19
    cmpl-float v1, v1, v3

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    iget v0, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->v:I

    .line 24
    .line 25
    invoke-virtual {p0, v0, v2}, Lcom/zykj/video/play/view/TCPointSeekBar;->o(IZ)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    iget v1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->m:I

    .line 30
    .line 31
    int-to-float v1, v1

    .line 32
    add-float/2addr v0, v1

    .line 33
    iget v1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->h:I

    .line 34
    .line 35
    int-to-float v3, v1

    .line 36
    cmpl-float v3, v0, v3

    .line 37
    .line 38
    if-ltz v3, :cond_2

    .line 39
    .line 40
    iget v0, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->v:I

    .line 41
    .line 42
    invoke-virtual {p0, v0, v2}, Lcom/zykj/video/play/view/TCPointSeekBar;->o(IZ)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_2
    int-to-float v1, v1

    .line 47
    div-float/2addr v0, v1

    .line 48
    const/high16 v1, 0x3f800000    # 1.0f

    .line 49
    .line 50
    mul-float/2addr v0, v1

    .line 51
    iget v1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->v:I

    .line 52
    .line 53
    int-to-float v3, v1

    .line 54
    mul-float/2addr v0, v3

    .line 55
    float-to-int v0, v0

    .line 56
    if-le v0, v1, :cond_3

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    move v1, v0

    .line 60
    :goto_0
    invoke-virtual {p0, v1, v2}, Lcom/zykj/video/play/view/TCPointSeekBar;->o(IZ)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final o(IZ)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->u:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->B:Lcom/zykj/video/play/view/TCPointSeekBar$d;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p0, p1, p2}, Lcom/zykj/video/play/view/TCPointSeekBar$d;->d(Lcom/zykj/video/play/view/TCPointSeekBar;IZ)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/RectF;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 7
    .line 8
    .line 9
    iget v1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->c:I

    .line 10
    .line 11
    int-to-float v1, v1

    .line 12
    iput v1, v0, Landroid/graphics/RectF;->left:F

    .line 13
    .line 14
    iget v1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->d:I

    .line 15
    .line 16
    int-to-float v1, v1

    .line 17
    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 18
    .line 19
    iget v1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->e:I

    .line 20
    .line 21
    int-to-float v1, v1

    .line 22
    iput v1, v0, Landroid/graphics/RectF;->top:F

    .line 23
    .line 24
    iget v1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->f:I

    .line 25
    .line 26
    int-to-float v1, v1

    .line 27
    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 28
    .line 29
    iget v1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->g:I

    .line 30
    .line 31
    int-to-float v2, v1

    .line 32
    int-to-float v1, v1

    .line 33
    iget-object v3, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->i:Landroid/graphics/Paint;

    .line 34
    .line 35
    invoke-virtual {p1, v0, v2, v1, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 36
    .line 37
    .line 38
    new-instance v0, Landroid/graphics/RectF;

    .line 39
    .line 40
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 41
    .line 42
    .line 43
    iget v1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->c:I

    .line 44
    .line 45
    int-to-float v1, v1

    .line 46
    iput v1, v0, Landroid/graphics/RectF;->left:F

    .line 47
    .line 48
    iget v1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->e:I

    .line 49
    .line 50
    int-to-float v1, v1

    .line 51
    iput v1, v0, Landroid/graphics/RectF;->top:F

    .line 52
    .line 53
    iget v1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->o:F

    .line 54
    .line 55
    iget v2, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->m:I

    .line 56
    .line 57
    int-to-float v2, v2

    .line 58
    sub-float/2addr v1, v2

    .line 59
    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 60
    .line 61
    iget v1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->f:I

    .line 62
    .line 63
    int-to-float v1, v1

    .line 64
    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 65
    .line 66
    iget v1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->g:I

    .line 67
    .line 68
    int-to-float v2, v1

    .line 69
    int-to-float v1, v1

    .line 70
    iget-object v3, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->j:Landroid/graphics/Paint;

    .line 71
    .line 72
    invoke-virtual {p1, v0, v2, v1, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Lcom/zykj/video/play/view/TCPointSeekBar;->j()V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->a:I

    .line 5
    .line 6
    iput p2, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->b:I

    .line 7
    .line 8
    iget p3, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->m:I

    .line 9
    .line 10
    iput p3, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->c:I

    .line 11
    .line 12
    sub-int p3, p1, p3

    .line 13
    .line 14
    iput p3, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->d:I

    .line 15
    .line 16
    int-to-float p3, p2

    .line 17
    iget p4, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->w:F

    .line 18
    .line 19
    sub-float/2addr p3, p4

    .line 20
    const/high16 p4, 0x40000000    # 2.0f

    .line 21
    .line 22
    div-float/2addr p3, p4

    .line 23
    float-to-int p4, p3

    .line 24
    iput p4, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->e:I

    .line 25
    .line 26
    int-to-float p4, p2

    .line 27
    sub-float/2addr p4, p3

    .line 28
    float-to-int p3, p4

    .line 29
    iput p3, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->f:I

    .line 30
    .line 31
    div-int/lit8 p2, p2, 0x2

    .line 32
    .line 33
    iput p2, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->g:I

    .line 34
    .line 35
    iput p1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->h:I

    .line 36
    .line 37
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    if-eq v0, v2, :cond_2

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    if-eq v0, v2, :cond_1

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    if-eq v0, v2, :cond_2

    .line 23
    .line 24
    return v1

    .line 25
    :cond_1
    invoke-virtual {p0, p1}, Lcom/zykj/video/play/view/TCPointSeekBar;->s(Landroid/view/MotionEvent;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    return p1

    .line 30
    :cond_2
    invoke-virtual {p0, p1}, Lcom/zykj/video/play/view/TCPointSeekBar;->t(Landroid/view/MotionEvent;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    return p1

    .line 35
    :cond_3
    invoke-virtual {p0, p1}, Lcom/zykj/video/play/view/TCPointSeekBar;->r(Landroid/view/MotionEvent;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    return p1
.end method

.method public final p()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->x:Lcom/zykj/video/play/view/TCPointSeekBar$h;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 8
    .line 9
    iget v1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->n:F

    .line 10
    .line 11
    float-to-int v1, v1

    .line 12
    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 13
    .line 14
    iget v1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->p:F

    .line 15
    .line 16
    float-to-int v1, v1

    .line 17
    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 18
    .line 19
    iget-object v1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->x:Lcom/zykj/video/play/view/TCPointSeekBar$h;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final q(F)F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->n:F

    .line 2
    .line 3
    add-float/2addr v0, p1

    .line 4
    return v0
.end method

.method public final r(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 6
    .line 7
    .line 8
    iget p1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->n:F

    .line 9
    .line 10
    const/high16 v1, 0x42c80000    # 100.0f

    .line 11
    .line 12
    sub-float/2addr p1, v1

    .line 13
    cmpl-float p1, v0, p1

    .line 14
    .line 15
    if-ltz p1, :cond_1

    .line 16
    .line 17
    iget p1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->o:F

    .line 18
    .line 19
    add-float/2addr p1, v1

    .line 20
    cmpg-float p1, v0, p1

    .line 21
    .line 22
    if-gtz p1, :cond_1

    .line 23
    .line 24
    iget-object p1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->B:Lcom/zykj/video/play/view/TCPointSeekBar$d;

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    invoke-interface {p1, p0}, Lcom/zykj/video/play/view/TCPointSeekBar$d;->b(Lcom/zykj/video/play/view/TCPointSeekBar;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    const/4 p1, 0x1

    .line 32
    iput-boolean p1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->r:Z

    .line 33
    .line 34
    iput v0, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->t:F

    .line 35
    .line 36
    return p1

    .line 37
    :cond_1
    const/4 p1, 0x0

    .line 38
    return p1
.end method

.method public final s(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 6
    .line 7
    .line 8
    iget-boolean p1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->r:Z

    .line 9
    .line 10
    if-eqz p1, :cond_2

    .line 11
    .line 12
    iget p1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->t:F

    .line 13
    .line 14
    sub-float p1, v0, p1

    .line 15
    .line 16
    iput p1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->s:F

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/zykj/video/play/view/TCPointSeekBar;->m()V

    .line 19
    .line 20
    .line 21
    iget p1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->o:F

    .line 22
    .line 23
    iget v1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->m:I

    .line 24
    .line 25
    int-to-float v1, v1

    .line 26
    sub-float/2addr p1, v1

    .line 27
    iget v1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->c:I

    .line 28
    .line 29
    int-to-float v1, v1

    .line 30
    cmpg-float p1, p1, v1

    .line 31
    .line 32
    if-gtz p1, :cond_0

    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    iput p1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->n:F

    .line 36
    .line 37
    iget-object v1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->l:Landroid/graphics/drawable/Drawable;

    .line 38
    .line 39
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    int-to-float v1, v1

    .line 44
    add-float/2addr p1, v1

    .line 45
    iput p1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->o:F

    .line 46
    .line 47
    :cond_0
    iget p1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->n:F

    .line 48
    .line 49
    iget v1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->m:I

    .line 50
    .line 51
    int-to-float v1, v1

    .line 52
    add-float/2addr p1, v1

    .line 53
    iget v1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->d:I

    .line 54
    .line 55
    int-to-float v1, v1

    .line 56
    cmpl-float p1, p1, v1

    .line 57
    .line 58
    if-ltz p1, :cond_1

    .line 59
    .line 60
    iget p1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->a:I

    .line 61
    .line 62
    int-to-float v1, p1

    .line 63
    iput v1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->o:F

    .line 64
    .line 65
    iget-object v1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->l:Landroid/graphics/drawable/Drawable;

    .line 66
    .line 67
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    sub-int/2addr p1, v1

    .line 72
    int-to-float p1, p1

    .line 73
    iput p1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->n:F

    .line 74
    .line 75
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/video/play/view/TCPointSeekBar;->p()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Lcom/zykj/video/play/view/TCPointSeekBar;->n()V

    .line 82
    .line 83
    .line 84
    iput v0, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->t:F

    .line 85
    .line 86
    const/4 p1, 0x1

    .line 87
    return p1

    .line 88
    :cond_2
    const/4 p1, 0x0

    .line 89
    return p1
.end method

.method public setMax(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->v:I

    .line 2
    .line 3
    return-void
.end method

.method public setOnPointClickListener(Lcom/zykj/video/play/view/TCPointSeekBar$e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->z:Lcom/zykj/video/play/view/TCPointSeekBar$e;

    .line 2
    .line 3
    return-void
.end method

.method public setOnSeekBarChangeListener(Lcom/zykj/video/play/view/TCPointSeekBar$d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->B:Lcom/zykj/video/play/view/TCPointSeekBar$d;

    .line 2
    .line 3
    return-void
.end method

.method public setPointList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/video/play/view/TCPointSeekBar$f;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->y:Ljava/util/List;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->A:Z

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setProgress(I)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-gez p1, :cond_0

    .line 3
    .line 4
    move p1, v0

    .line 5
    :cond_0
    iget v1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->v:I

    .line 6
    .line 7
    if-le p1, v1, :cond_1

    .line 8
    .line 9
    move p1, v1

    .line 10
    :cond_1
    iget-boolean v1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->r:Z

    .line 11
    .line 12
    if-nez v1, :cond_2

    .line 13
    .line 14
    iput p1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->u:I

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1, v0}, Lcom/zykj/video/play/view/TCPointSeekBar;->o(IZ)V

    .line 20
    .line 21
    .line 22
    :cond_2
    return-void
.end method

.method public final t(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 5
    .line 6
    .line 7
    iget-boolean p1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->r:Z

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    iput-boolean v0, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->r:Z

    .line 13
    .line 14
    iget-object p1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->B:Lcom/zykj/video/play/view/TCPointSeekBar$d;

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-interface {p1, p0}, Lcom/zykj/video/play/view/TCPointSeekBar$d;->g(Lcom/zykj/video/play/view/TCPointSeekBar;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    const/4 p1, 0x1

    .line 22
    return p1

    .line 23
    :cond_1
    return v0
.end method

.method public final u(Landroid/util/AttributeSet;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget v2, Lcom/zykj/video/play/R$color;->superplayer_default_progress_color:I

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    sget v3, Lcom/zykj/video/play/R$color;->superplayer_default_progress_background_color:I

    .line 20
    .line 21
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    sget-object v4, Lcom/zykj/video/play/R$styleable;->SuperPlayerTCPointSeekBar:[I

    .line 32
    .line 33
    invoke-virtual {v3, p1, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    sget v3, Lcom/zykj/video/play/R$styleable;->SuperPlayerTCPointSeekBar_psb_thumbBackground:I

    .line 38
    .line 39
    invoke-virtual {p1, v3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    iput-object v3, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->l:Landroid/graphics/drawable/Drawable;

    .line 44
    .line 45
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    div-int/lit8 v3, v3, 0x2

    .line 50
    .line 51
    iput v3, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->m:I

    .line 52
    .line 53
    sget v3, Lcom/zykj/video/play/R$styleable;->SuperPlayerTCPointSeekBar_psb_progressColor:I

    .line 54
    .line 55
    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    sget v3, Lcom/zykj/video/play/R$styleable;->SuperPlayerTCPointSeekBar_psb_backgroundColor:I

    .line 60
    .line 61
    invoke-virtual {p1, v3, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    sget v3, Lcom/zykj/video/play/R$styleable;->SuperPlayerTCPointSeekBar_psb_progress:I

    .line 66
    .line 67
    invoke-virtual {p1, v3, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    iput v0, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->u:I

    .line 72
    .line 73
    sget v0, Lcom/zykj/video/play/R$styleable;->SuperPlayerTCPointSeekBar_psb_max:I

    .line 74
    .line 75
    const/16 v3, 0x64

    .line 76
    .line 77
    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    iput v0, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->v:I

    .line 82
    .line 83
    sget v0, Lcom/zykj/video/play/R$styleable;->SuperPlayerTCPointSeekBar_psb_progressHeight:I

    .line 84
    .line 85
    const/high16 v3, 0x41000000    # 8.0f

    .line 86
    .line 87
    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    iput v0, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->w:F

    .line 92
    .line 93
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 94
    .line 95
    .line 96
    :cond_0
    new-instance p1, Landroid/graphics/Paint;

    .line 97
    .line 98
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 99
    .line 100
    .line 101
    iput-object p1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->i:Landroid/graphics/Paint;

    .line 102
    .line 103
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 104
    .line 105
    .line 106
    new-instance p1, Landroid/graphics/Paint;

    .line 107
    .line 108
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 109
    .line 110
    .line 111
    iput-object p1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->k:Landroid/graphics/Paint;

    .line 112
    .line 113
    const/high16 v0, -0x10000

    .line 114
    .line 115
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 116
    .line 117
    .line 118
    new-instance p1, Landroid/graphics/Paint;

    .line 119
    .line 120
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 121
    .line 122
    .line 123
    iput-object p1, p0, Lcom/zykj/video/play/view/TCPointSeekBar;->j:Landroid/graphics/Paint;

    .line 124
    .line 125
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 126
    .line 127
    .line 128
    new-instance p1, Lcom/zykj/video/play/view/TCPointSeekBar$a;

    .line 129
    .line 130
    invoke-direct {p1, p0}, Lcom/zykj/video/play/view/TCPointSeekBar$a;-><init>(Lcom/zykj/video/play/view/TCPointSeekBar;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 134
    .line 135
    .line 136
    return-void
.end method
