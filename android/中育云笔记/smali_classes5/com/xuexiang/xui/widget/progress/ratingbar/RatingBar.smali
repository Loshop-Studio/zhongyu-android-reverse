.class public Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar$a;
    }
.end annotation


# instance fields
.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:F

.field public h:F

.field public i:F

.field public j:F

.field public k:Z

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:F

.field public p:F

.field public q:Landroid/graphics/drawable/Drawable;

.field public r:Landroid/graphics/drawable/Drawable;

.field public s:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 p3, 0x14

    .line 4
    iput p3, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->d:I

    const/4 p3, 0x0

    .line 5
    iput p3, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->g:F

    const/high16 v0, -0x40800000    # -1.0f

    .line 6
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->h:F

    const/high16 v0, 0x3f800000    # 1.0f

    .line 7
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->i:F

    .line 8
    iput p3, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->j:F

    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->k:Z

    const/4 v1, 0x1

    .line 10
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->l:Z

    .line 11
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->m:Z

    .line 12
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->n:Z

    .line 13
    sget-object v1, Lcom/xuexiang/xui/R$styleable;->RatingBar:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 14
    sget v1, Lcom/xuexiang/xui/R$styleable;->RatingBar_srb_rating:I

    invoke-virtual {p2, v1, p3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p3

    .line 15
    sget v1, Lcom/xuexiang/xui/R$styleable;->RatingBar_srb_numStars:I

    iget v2, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->c:I

    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->c:I

    .line 16
    sget v1, Lcom/xuexiang/xui/R$styleable;->RatingBar_srb_stepSize:I

    iget v2, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->i:F

    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->i:F

    .line 17
    sget v1, Lcom/xuexiang/xui/R$styleable;->RatingBar_srb_minimumStars:I

    iget v2, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->g:F

    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->g:F

    .line 18
    sget v1, Lcom/xuexiang/xui/R$styleable;->RatingBar_srb_starPadding:I

    iget v2, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->d:I

    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->d:I

    .line 19
    sget v1, Lcom/xuexiang/xui/R$styleable;->RatingBar_srb_starWidth:I

    invoke-virtual {p2, v1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->e:I

    .line 20
    sget v1, Lcom/xuexiang/xui/R$styleable;->RatingBar_srb_starHeight:I

    invoke-virtual {p2, v1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->f:I

    .line 21
    sget v0, Lcom/xuexiang/xui/R$styleable;->RatingBar_srb_drawableEmpty:I

    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-eqz v0, :cond_0

    sget v0, Lcom/xuexiang/xui/R$styleable;->RatingBar_srb_drawableEmpty:I

    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    invoke-static {p1, v0}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->q:Landroid/graphics/drawable/Drawable;

    .line 22
    sget v0, Lcom/xuexiang/xui/R$styleable;->RatingBar_srb_drawableFilled:I

    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Lcom/xuexiang/xui/R$styleable;->RatingBar_srb_drawableFilled:I

    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    invoke-static {p1, v0}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    :cond_1
    iput-object v1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->r:Landroid/graphics/drawable/Drawable;

    .line 23
    sget p1, Lcom/xuexiang/xui/R$styleable;->RatingBar_srb_isIndicator:I

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->k:Z

    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->k:Z

    .line 24
    sget p1, Lcom/xuexiang/xui/R$styleable;->RatingBar_srb_scrollable:I

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->l:Z

    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->l:Z

    .line 25
    sget p1, Lcom/xuexiang/xui/R$styleable;->RatingBar_srb_clickable:I

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->m:Z

    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->m:Z

    .line 26
    sget p1, Lcom/xuexiang/xui/R$styleable;->RatingBar_srb_clearRatingEnabled:I

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->n:Z

    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->n:Z

    .line 27
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 28
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->j()V

    .line 29
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->e()V

    .line 30
    invoke-virtual {p0, p3}, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->setRating(F)V

    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->s:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Ljava/lang/Integer;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    float-to-double v3, p1

    .line 30
    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    .line 31
    .line 32
    .line 33
    move-result-wide v3

    .line 34
    int-to-double v5, v2

    .line 35
    cmpl-double v2, v5, v3

    .line 36
    .line 37
    if-lez v2, :cond_0

    .line 38
    .line 39
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->b()V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    if-nez v2, :cond_1

    .line 44
    .line 45
    invoke-virtual {v1, p1}, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->f(F)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->d()V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    return-void
.end method

.method public final b(IIIILandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;
    .locals 6

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move v2, p1

    .line 8
    move v3, p2

    .line 9
    move v4, p3

    .line 10
    move v5, p4

    .line 11
    invoke-direct/range {v0 .. v5}, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;-><init>(Landroid/content/Context;IIII)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p5}, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->e(Landroid/graphics/drawable/Drawable;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p6}, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->c(Landroid/graphics/drawable/Drawable;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public final c(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->s:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_3

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;

    .line 18
    .line 19
    invoke-virtual {p0, p1, v1}, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->h(FLandroid/view/View;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->i:F

    .line 27
    .line 28
    const/high16 v2, 0x3f800000    # 1.0f

    .line 29
    .line 30
    cmpl-float v2, v0, v2

    .line 31
    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Ljava/lang/Integer;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    int-to-float p1, p1

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    invoke-static {v1, v0, p1}, Lcom/xuexiang/xui/widget/progress/ratingbar/a;->a(Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;FF)F

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    :goto_1
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->j:F

    .line 51
    .line 52
    cmpl-float v0, v0, p1

    .line 53
    .line 54
    if-nez v0, :cond_2

    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->f()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    iget p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->g:F

    .line 63
    .line 64
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->setRating(F)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_2
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->setRating(F)V

    .line 69
    .line 70
    .line 71
    :cond_3
    return-void
.end method

.method public final d(F)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->s:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_3

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    int-to-float v2, v2

    .line 24
    const/high16 v3, 0x41200000    # 10.0f

    .line 25
    .line 26
    div-float/2addr v2, v3

    .line 27
    iget v3, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->g:F

    .line 28
    .line 29
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    int-to-float v4, v4

    .line 34
    mul-float/2addr v3, v4

    .line 35
    add-float/2addr v2, v3

    .line 36
    cmpg-float v2, p1, v2

    .line 37
    .line 38
    if-gez v2, :cond_1

    .line 39
    .line 40
    iget p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->g:F

    .line 41
    .line 42
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->setRating(F)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    invoke-virtual {p0, p1, v1}, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->h(FLandroid/view/View;)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-nez v2, :cond_2

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    iget v2, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->i:F

    .line 54
    .line 55
    invoke-static {v1, v2, p1}, Lcom/xuexiang/xui/widget/progress/ratingbar/a;->a(Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;FF)F

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    iget v2, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->h:F

    .line 60
    .line 61
    cmpl-float v2, v2, v1

    .line 62
    .line 63
    if-eqz v2, :cond_0

    .line 64
    .line 65
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->setRating(F)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    return-void
.end method

.method public final e()V
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->s:Ljava/util/List;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    move v2, v0

    .line 10
    :goto_0
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->c:I

    .line 11
    .line 12
    if-gt v2, v0, :cond_0

    .line 13
    .line 14
    iget v3, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->e:I

    .line 15
    .line 16
    iget v4, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->f:I

    .line 17
    .line 18
    iget v5, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->d:I

    .line 19
    .line 20
    iget-object v6, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->r:Landroid/graphics/drawable/Drawable;

    .line 21
    .line 22
    iget-object v7, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->q:Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    move-object v1, p0

    .line 25
    invoke-virtual/range {v1 .. v7}, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->b(IIIILandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 30
    .line 31
    .line 32
    iget-object v3, v1, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->s:Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move-object v1, p0

    .line 41
    return-void
.end method

.method public f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->n:Z

    .line 2
    .line 3
    return v0
.end method

.method public g()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->k:Z

    .line 2
    .line 3
    return v0
.end method

.method public getNumStars()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public getRating()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->h:F

    .line 2
    .line 3
    return v0
.end method

.method public getStarHeight()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->f:I

    .line 2
    .line 3
    return v0
.end method

.method public getStarPadding()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public getStarWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public getStepSize()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->i:F

    .line 2
    .line 3
    return v0
.end method

.method public final h(FLandroid/view/View;)Z
    .locals 1

    .line 1
    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    cmpl-float v0, p1, v0

    .line 7
    .line 8
    if-lez v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p2}, Landroid/view/View;->getRight()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    int-to-float p2, p2

    .line 15
    cmpg-float p1, p1, p2

    .line 16
    .line 17
    if-gez p1, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    return p1

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    return p1
.end method

.method public i()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->l:Z

    .line 2
    .line 3
    return v0
.end method

.method public isClickable()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->m:Z

    .line 2
    .line 3
    return v0
.end method

.method public final j()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->c:I

    .line 2
    .line 3
    if-gtz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x5

    .line 6
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->c:I

    .line 7
    .line 8
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->d:I

    .line 9
    .line 10
    if-gez v0, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->d:I

    .line 14
    .line 15
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->q:Landroid/graphics/drawable/Drawable;

    .line 16
    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sget v1, Lcom/xuexiang/xui/R$drawable;->srb_ic_empty:I

    .line 24
    .line 25
    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->q:Landroid/graphics/drawable/Drawable;

    .line 30
    .line 31
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->r:Landroid/graphics/drawable/Drawable;

    .line 32
    .line 33
    if-nez v0, :cond_3

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sget v1, Lcom/xuexiang/xui/R$drawable;->srb_ic_filled:I

    .line 40
    .line 41
    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->r:Landroid/graphics/drawable/Drawable;

    .line 46
    .line 47
    :cond_3
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->i:F

    .line 48
    .line 49
    const/high16 v1, 0x3f800000    # 1.0f

    .line 50
    .line 51
    cmpl-float v2, v0, v1

    .line 52
    .line 53
    if-lez v2, :cond_4

    .line 54
    .line 55
    iput v1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->i:F

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_4
    const v1, 0x3dcccccd    # 0.1f

    .line 59
    .line 60
    .line 61
    cmpg-float v0, v0, v1

    .line 62
    .line 63
    if-gez v0, :cond_5

    .line 64
    .line 65
    iput v1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->i:F

    .line 66
    .line 67
    :cond_5
    :goto_0
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->g:F

    .line 68
    .line 69
    iget v1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->c:I

    .line 70
    .line 71
    iget v2, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->i:F

    .line 72
    .line 73
    invoke-static {v0, v1, v2}, Lcom/xuexiang/xui/widget/progress/ratingbar/a;->c(FIF)F

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->g:F

    .line 78
    .line 79
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    check-cast p1, Lcom/xuexiang/xui/widget/progress/ratingbar/SavedState;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/progress/ratingbar/SavedState;->a()F

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->setRating(F)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/xuexiang/xui/widget/progress/ratingbar/SavedState;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Lcom/xuexiang/xui/widget/progress/ratingbar/SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 8
    .line 9
    .line 10
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->h:F

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Lcom/xuexiang/xui/widget/progress/ratingbar/SavedState;->b(F)V

    .line 13
    .line 14
    .line 15
    return-object v1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->g()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const/4 v4, 0x1

    .line 22
    if-eqz v3, :cond_6

    .line 23
    .line 24
    if-eq v3, v4, :cond_3

    .line 25
    .line 26
    const/4 p1, 0x2

    .line 27
    if-eq v3, p1, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->i()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-nez p1, :cond_2

    .line 35
    .line 36
    return v1

    .line 37
    :cond_2
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->d(F)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_3
    iget v2, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->o:F

    .line 42
    .line 43
    iget v3, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->p:F

    .line 44
    .line 45
    invoke-static {v2, v3, p1}, Lcom/xuexiang/xui/widget/progress/ratingbar/a;->d(FFLandroid/view/MotionEvent;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_5

    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->isClickable()Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-nez p1, :cond_4

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_4
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->c(F)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_5
    :goto_0
    return v1

    .line 63
    :cond_6
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->o:F

    .line 64
    .line 65
    iput v2, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->p:F

    .line 66
    .line 67
    iget p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->h:F

    .line 68
    .line 69
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->j:F

    .line 70
    .line 71
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-interface {p1, v4}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 76
    .line 77
    .line 78
    return v4
.end method

.method public setClearRatingEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->n:Z

    .line 2
    .line 3
    return-void
.end method

.method public setClickable(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->m:Z

    .line 2
    .line 3
    return-void
.end method

.method public setEmptyDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->q:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->s:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;

    .line 20
    .line 21
    invoke-virtual {v1, p1}, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->c(Landroid/graphics/drawable/Drawable;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method public setEmptyDrawableRes(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/DrawableRes;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->setEmptyDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setFilledDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->r:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->s:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;

    .line 20
    .line 21
    invoke-virtual {v1, p1}, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->e(Landroid/graphics/drawable/Drawable;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method public setFilledDrawableRes(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/DrawableRes;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->setFilledDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setIsIndicator(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->k:Z

    .line 2
    .line 3
    return-void
.end method

.method public setMinimumStars(F)V
    .locals 2
    .param p1    # F
        .annotation build Landroidx/annotation/FloatRange;
            from = 0.0
        .end annotation
    .end param

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->c:I

    .line 2
    .line 3
    iget v1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->i:F

    .line 4
    .line 5
    invoke-static {p1, v0, v1}, Lcom/xuexiang/xui/widget/progress/ratingbar/a;->c(FIF)F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->g:F

    .line 10
    .line 11
    return-void
.end method

.method public setNumStars(I)V
    .locals 1

    .line 1
    if-gtz p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->s:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 10
    .line 11
    .line 12
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->c:I

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->e()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public setOnRatingChangeListener(Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar$a;)V
    .locals 0

    return-void
.end method

.method public setRating(F)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->c:I

    .line 2
    .line 3
    int-to-float v1, v0

    .line 4
    cmpl-float v1, p1, v1

    .line 5
    .line 6
    if-lez v1, :cond_0

    .line 7
    .line 8
    int-to-float p1, v0

    .line 9
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->g:F

    .line 10
    .line 11
    cmpg-float v1, p1, v0

    .line 12
    .line 13
    if-gez v1, :cond_1

    .line 14
    .line 15
    move p1, v0

    .line 16
    :cond_1
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->h:F

    .line 17
    .line 18
    cmpl-float v0, v0, p1

    .line 19
    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    return-void

    .line 23
    :cond_2
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->h:F

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->a(F)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public setScrollable(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->l:Z

    .line 2
    .line 3
    return-void
.end method

.method public setStarHeight(I)V
    .locals 2
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->f:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->s:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;

    .line 20
    .line 21
    invoke-virtual {v1, p1}, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->g(I)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method public setStarPadding(I)V
    .locals 2

    .line 1
    if-gez p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->d:I

    .line 5
    .line 6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->s:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;

    .line 23
    .line 24
    iget v1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->d:I

    .line 25
    .line 26
    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    :goto_1
    return-void
.end method

.method public setStarWidth(I)V
    .locals 2
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->e:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->s:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;

    .line 20
    .line 21
    invoke-virtual {v1, p1}, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->h(I)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method public setStepSize(F)V
    .locals 0
    .param p1    # F
        .annotation build Landroidx/annotation/FloatRange;
            from = 0.1
            to = 1.0
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->i:F

    .line 2
    .line 3
    return-void
.end method
