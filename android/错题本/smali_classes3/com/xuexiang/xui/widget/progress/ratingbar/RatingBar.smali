.class public Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:F

.field public f:F

.field public g:F

.field public h:F

.field public i:Z

.field public j:Z

.field public k:Z

.field public l:Z

.field public m:F

.field public n:F

.field public o:Landroid/graphics/drawable/Drawable;

.field public p:Landroid/graphics/drawable/Drawable;

.field public q:Ljava/util/ArrayList;


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
    .locals 6
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 p3, 0x14

    .line 4
    iput p3, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->b:I

    const/4 p3, 0x0

    .line 5
    iput p3, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->e:F

    const/high16 v0, -0x40800000    # -1.0f

    .line 6
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->f:F

    const/high16 v0, 0x3f800000    # 1.0f

    .line 7
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->g:F

    .line 8
    iput p3, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->h:F

    const/4 v1, 0x0

    .line 9
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->i:Z

    const/4 v2, 0x1

    .line 10
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->j:Z

    .line 11
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->k:Z

    .line 12
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->l:Z

    .line 13
    sget-object v2, Lcom/xuexiang/xui/R$styleable;->RatingBar:[I

    invoke-virtual {p1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 14
    sget v2, Lcom/xuexiang/xui/R$styleable;->RatingBar_srb_rating:I

    invoke-virtual {p2, v2, p3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    .line 15
    sget v3, Lcom/xuexiang/xui/R$styleable;->RatingBar_srb_numStars:I

    iget v4, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->a:I

    invoke-virtual {p2, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    iput v3, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->a:I

    .line 16
    sget v3, Lcom/xuexiang/xui/R$styleable;->RatingBar_srb_stepSize:I

    iget v4, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->g:F

    invoke-virtual {p2, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->g:F

    .line 17
    sget v3, Lcom/xuexiang/xui/R$styleable;->RatingBar_srb_minimumStars:I

    iget v4, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->e:F

    invoke-virtual {p2, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->e:F

    .line 18
    sget v3, Lcom/xuexiang/xui/R$styleable;->RatingBar_srb_starPadding:I

    iget v4, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->b:I

    invoke-virtual {p2, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->b:I

    .line 19
    sget v3, Lcom/xuexiang/xui/R$styleable;->RatingBar_srb_starWidth:I

    invoke-virtual {p2, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->c:I

    .line 20
    sget v3, Lcom/xuexiang/xui/R$styleable;->RatingBar_srb_starHeight:I

    invoke-virtual {p2, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->d:I

    .line 21
    sget v3, Lcom/xuexiang/xui/R$styleable;->RatingBar_srb_drawableEmpty:I

    invoke-virtual {p2, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    const/4 v4, 0x0

    const/4 v5, -0x1

    if-eqz v3, :cond_0

    sget v3, Lcom/xuexiang/xui/R$styleable;->RatingBar_srb_drawableEmpty:I

    invoke-virtual {p2, v3, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    invoke-static {p1, v3}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, v4

    :goto_0
    iput-object v3, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->o:Landroid/graphics/drawable/Drawable;

    .line 22
    sget v3, Lcom/xuexiang/xui/R$styleable;->RatingBar_srb_drawableFilled:I

    invoke-virtual {p2, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_1

    sget v3, Lcom/xuexiang/xui/R$styleable;->RatingBar_srb_drawableFilled:I

    invoke-virtual {p2, v3, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    invoke-static {p1, v3}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    :cond_1
    iput-object v4, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->p:Landroid/graphics/drawable/Drawable;

    .line 23
    sget p1, Lcom/xuexiang/xui/R$styleable;->RatingBar_srb_isIndicator:I

    iget-boolean v3, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->i:Z

    invoke-virtual {p2, p1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->i:Z

    .line 24
    sget p1, Lcom/xuexiang/xui/R$styleable;->RatingBar_srb_scrollable:I

    iget-boolean v3, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->j:Z

    invoke-virtual {p2, p1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->j:Z

    .line 25
    sget p1, Lcom/xuexiang/xui/R$styleable;->RatingBar_srb_clickable:I

    iget-boolean v3, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->k:Z

    invoke-virtual {p2, p1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->k:Z

    .line 26
    sget p1, Lcom/xuexiang/xui/R$styleable;->RatingBar_srb_clearRatingEnabled:I

    iget-boolean v3, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->l:Z

    invoke-virtual {p2, p1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->l:Z

    .line 27
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 28
    iget p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->a:I

    if-gtz p1, :cond_2

    const/4 p1, 0x5

    .line 29
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->a:I

    .line 30
    :cond_2
    iget p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->b:I

    if-gez p1, :cond_3

    .line 31
    iput v1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->b:I

    .line 32
    :cond_3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->o:Landroid/graphics/drawable/Drawable;

    if-nez p1, :cond_4

    .line 33
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget p2, Lcom/xuexiang/xui/R$drawable;->srb_ic_empty:I

    invoke-static {p1, p2}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->o:Landroid/graphics/drawable/Drawable;

    .line 34
    :cond_4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->p:Landroid/graphics/drawable/Drawable;

    if-nez p1, :cond_5

    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget p2, Lcom/xuexiang/xui/R$drawable;->srb_ic_filled:I

    invoke-static {p1, p2}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->p:Landroid/graphics/drawable/Drawable;

    .line 36
    :cond_5
    iget p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->g:F

    cmpl-float p2, p1, v0

    if-lez p2, :cond_6

    .line 37
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->g:F

    goto :goto_1

    :cond_6
    const p2, 0x3dcccccd    # 0.1f

    cmpg-float p1, p1, p2

    if-gez p1, :cond_7

    .line 38
    iput p2, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->g:F

    .line 39
    :cond_7
    :goto_1
    iget p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->e:F

    iget p2, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->a:I

    iget v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->g:F

    cmpg-float v1, p1, p3

    if-gez v1, :cond_8

    move p1, p3

    :cond_8
    int-to-float p2, p2

    cmpl-float v1, p1, p2

    if-lez v1, :cond_9

    move p1, p2

    :cond_9
    rem-float p2, p1, v0

    cmpl-float p2, p2, p3

    if-eqz p2, :cond_a

    goto :goto_2

    :cond_a
    move v0, p1

    :goto_2
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->e:F

    .line 40
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->b()V

    .line 41
    invoke-virtual {p0, v2}, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->setRating(F)V

    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->q:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v1, :cond_2

    .line 10
    .line 11
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    add-int/lit8 v3, v3, 0x1

    .line 16
    .line 17
    check-cast v4, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;

    .line 18
    .line 19
    invoke-virtual {v4}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    check-cast v5, Ljava/lang/Integer;

    .line 24
    .line 25
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    float-to-double v6, p1

    .line 30
    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    .line 31
    .line 32
    .line 33
    move-result-wide v6

    .line 34
    int-to-double v8, v5

    .line 35
    cmpl-double v5, v8, v6

    .line 36
    .line 37
    if-lez v5, :cond_0

    .line 38
    .line 39
    invoke-virtual {v4}, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->b()V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    if-nez v5, :cond_1

    .line 44
    .line 45
    invoke-virtual {v4, p1}, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->c(F)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    iget-object v5, v4, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->a:Landroid/widget/ImageView;

    .line 50
    .line 51
    const/16 v6, 0x2710

    .line 52
    .line 53
    invoke-virtual {v5, v6}, Landroid/widget/ImageView;->setImageLevel(I)V

    .line 54
    .line 55
    .line 56
    iget-object v4, v4, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->b:Landroid/widget/ImageView;

    .line 57
    .line 58
    invoke-virtual {v4, v2}, Landroid/widget/ImageView;->setImageLevel(I)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    return-void
.end method

.method public final b()V
    .locals 9

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->q:Ljava/util/ArrayList;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    move v1, v0

    .line 10
    :goto_0
    iget v2, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->a:I

    .line 11
    .line 12
    if-gt v1, v2, :cond_2

    .line 13
    .line 14
    iget v2, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->c:I

    .line 15
    .line 16
    iget v3, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->d:I

    .line 17
    .line 18
    iget v4, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->b:I

    .line 19
    .line 20
    iget-object v5, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->p:Landroid/graphics/drawable/Drawable;

    .line 21
    .line 22
    iget-object v6, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->o:Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    new-instance v7, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object v8

    .line 30
    invoke-direct {v7, v8}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 31
    .line 32
    .line 33
    iput v2, v7, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->c:I

    .line 34
    .line 35
    iput v3, v7, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->d:I

    .line 36
    .line 37
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v7, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v7, v4, v4, v4, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v7}, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->a()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    if-nez v2, :cond_0

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_0
    new-instance v2, Landroid/graphics/drawable/ClipDrawable;

    .line 58
    .line 59
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    const v4, 0x800003

    .line 68
    .line 69
    .line 70
    invoke-direct {v2, v3, v4, v0}, Landroid/graphics/drawable/ClipDrawable;-><init>(Landroid/graphics/drawable/Drawable;II)V

    .line 71
    .line 72
    .line 73
    iget-object v3, v7, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->a:Landroid/widget/ImageView;

    .line 74
    .line 75
    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 76
    .line 77
    .line 78
    :goto_1
    invoke-virtual {v6}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    if-nez v2, :cond_1

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_1
    new-instance v2, Landroid/graphics/drawable/ClipDrawable;

    .line 86
    .line 87
    invoke-virtual {v6}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    const v4, 0x800005

    .line 96
    .line 97
    .line 98
    invoke-direct {v2, v3, v4, v0}, Landroid/graphics/drawable/ClipDrawable;-><init>(Landroid/graphics/drawable/Drawable;II)V

    .line 99
    .line 100
    .line 101
    iget-object v3, v7, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->b:Landroid/widget/ImageView;

    .line 102
    .line 103
    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 104
    .line 105
    .line 106
    :goto_2
    invoke-virtual {p0, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 107
    .line 108
    .line 109
    iget-object v2, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->q:Ljava/util/ArrayList;

    .line 110
    .line 111
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    add-int/lit8 v1, v1, 0x1

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_2
    return-void
.end method

.method public getNumStars()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public getRating()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->f:F

    .line 2
    .line 3
    return v0
.end method

.method public getStarHeight()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public getStarPadding()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public getStarWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public getStepSize()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->g:F

    .line 2
    .line 3
    return v0
.end method

.method public final isClickable()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->k:Z

    .line 2
    .line 3
    return v0
.end method

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
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
    iget p1, p1, Lcom/xuexiang/xui/widget/progress/ratingbar/SavedState;->a:F

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->setRating(F)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
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
    invoke-direct {v1, v0}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    .line 8
    .line 9
    .line 10
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->f:F

    .line 11
    .line 12
    iput v0, v1, Lcom/xuexiang/xui/widget/progress/ratingbar/SavedState;->a:F

    .line 13
    .line 14
    return-object v1
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 9

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->i:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_2

    .line 7
    .line 8
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const/4 v4, 0x1

    .line 21
    if-eqz v3, :cond_c

    .line 22
    .line 23
    if-eq v3, v4, :cond_5

    .line 24
    .line 25
    const/4 p1, 0x2

    .line 26
    if-eq v3, p1, :cond_1

    .line 27
    .line 28
    goto/16 :goto_3

    .line 29
    .line 30
    :cond_1
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->j:Z

    .line 31
    .line 32
    if-nez p1, :cond_2

    .line 33
    .line 34
    goto/16 :goto_2

    .line 35
    .line 36
    :cond_2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->q:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    :cond_3
    :goto_0
    if-ge v1, v2, :cond_d

    .line 43
    .line 44
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    check-cast v3, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;

    .line 51
    .line 52
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    int-to-float v5, v5

    .line 57
    const/high16 v6, 0x41200000    # 10.0f

    .line 58
    .line 59
    div-float/2addr v5, v6

    .line 60
    iget v6, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->e:F

    .line 61
    .line 62
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    int-to-float v7, v7

    .line 67
    mul-float/2addr v6, v7

    .line 68
    add-float/2addr v6, v5

    .line 69
    cmpg-float v5, v0, v6

    .line 70
    .line 71
    if-gez v5, :cond_4

    .line 72
    .line 73
    iget p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->e:F

    .line 74
    .line 75
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->setRating(F)V

    .line 76
    .line 77
    .line 78
    goto/16 :goto_3

    .line 79
    .line 80
    :cond_4
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    int-to-float v5, v5

    .line 85
    cmpl-float v5, v0, v5

    .line 86
    .line 87
    if-lez v5, :cond_3

    .line 88
    .line 89
    invoke-virtual {v3}, Landroid/view/View;->getRight()I

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    int-to-float v5, v5

    .line 94
    cmpg-float v5, v0, v5

    .line 95
    .line 96
    if-gez v5, :cond_3

    .line 97
    .line 98
    iget v5, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->g:F

    .line 99
    .line 100
    invoke-static {v3, v5, v0}, Ly1/a;->c(Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;FF)F

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    iget v5, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->f:F

    .line 105
    .line 106
    cmpl-float v5, v5, v3

    .line 107
    .line 108
    if-eqz v5, :cond_3

    .line 109
    .line 110
    invoke-virtual {p0, v3}, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->setRating(F)V

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_5
    iget v2, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->m:F

    .line 115
    .line 116
    iget v3, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->n:F

    .line 117
    .line 118
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 119
    .line 120
    .line 121
    move-result-wide v5

    .line 122
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getDownTime()J

    .line 123
    .line 124
    .line 125
    move-result-wide v7

    .line 126
    sub-long/2addr v5, v7

    .line 127
    long-to-float v5, v5

    .line 128
    const/high16 v6, 0x43480000    # 200.0f

    .line 129
    .line 130
    cmpl-float v5, v5, v6

    .line 131
    .line 132
    if-lez v5, :cond_6

    .line 133
    .line 134
    goto/16 :goto_2

    .line 135
    .line 136
    :cond_6
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    sub-float/2addr v2, v5

    .line 141
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    sub-float/2addr v3, p1

    .line 150
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    const/high16 v3, 0x40a00000    # 5.0f

    .line 155
    .line 156
    cmpl-float v2, v2, v3

    .line 157
    .line 158
    if-gtz v2, :cond_b

    .line 159
    .line 160
    cmpl-float p1, p1, v3

    .line 161
    .line 162
    if-gtz p1, :cond_b

    .line 163
    .line 164
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->k:Z

    .line 165
    .line 166
    if-nez p1, :cond_7

    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->q:Ljava/util/ArrayList;

    .line 170
    .line 171
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    :cond_8
    if-ge v1, v2, :cond_d

    .line 176
    .line 177
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    add-int/lit8 v1, v1, 0x1

    .line 182
    .line 183
    check-cast v3, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;

    .line 184
    .line 185
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    .line 186
    .line 187
    .line 188
    move-result v5

    .line 189
    int-to-float v5, v5

    .line 190
    cmpl-float v5, v0, v5

    .line 191
    .line 192
    if-lez v5, :cond_8

    .line 193
    .line 194
    invoke-virtual {v3}, Landroid/view/View;->getRight()I

    .line 195
    .line 196
    .line 197
    move-result v5

    .line 198
    int-to-float v5, v5

    .line 199
    cmpg-float v5, v0, v5

    .line 200
    .line 201
    if-gez v5, :cond_8

    .line 202
    .line 203
    iget p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->g:F

    .line 204
    .line 205
    const/high16 v1, 0x3f800000    # 1.0f

    .line 206
    .line 207
    cmpl-float v1, p1, v1

    .line 208
    .line 209
    if-nez v1, :cond_9

    .line 210
    .line 211
    invoke-virtual {v3}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    check-cast p1, Ljava/lang/Integer;

    .line 216
    .line 217
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 218
    .line 219
    .line 220
    move-result p1

    .line 221
    int-to-float p1, p1

    .line 222
    goto :goto_1

    .line 223
    :cond_9
    invoke-static {v3, p1, v0}, Ly1/a;->c(Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;FF)F

    .line 224
    .line 225
    .line 226
    move-result p1

    .line 227
    :goto_1
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->h:F

    .line 228
    .line 229
    cmpl-float v0, v0, p1

    .line 230
    .line 231
    if-nez v0, :cond_a

    .line 232
    .line 233
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->l:Z

    .line 234
    .line 235
    if-eqz v0, :cond_a

    .line 236
    .line 237
    iget p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->e:F

    .line 238
    .line 239
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->setRating(F)V

    .line 240
    .line 241
    .line 242
    goto :goto_3

    .line 243
    :cond_a
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->setRating(F)V

    .line 244
    .line 245
    .line 246
    goto :goto_3

    .line 247
    :cond_b
    :goto_2
    return v1

    .line 248
    :cond_c
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->m:F

    .line 249
    .line 250
    iput v2, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->n:F

    .line 251
    .line 252
    iget p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->f:F

    .line 253
    .line 254
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->h:F

    .line 255
    .line 256
    :cond_d
    :goto_3
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    invoke-interface {p1, v4}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 261
    .line 262
    .line 263
    return v4
.end method

.method public setClearRatingEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->l:Z

    .line 2
    .line 3
    return-void
.end method

.method public setClickable(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->k:Z

    .line 2
    .line 3
    return-void
.end method

.method public setEmptyDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 8

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->o:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->q:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    check-cast v3, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    if-nez v4, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance v4, Landroid/graphics/drawable/ClipDrawable;

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    const v6, 0x800005

    .line 41
    .line 42
    .line 43
    const/4 v7, 0x1

    .line 44
    invoke-direct {v4, v5, v6, v7}, Landroid/graphics/drawable/ClipDrawable;-><init>(Landroid/graphics/drawable/Drawable;II)V

    .line 45
    .line 46
    .line 47
    iget-object v3, v3, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->b:Landroid/widget/ImageView;

    .line 48
    .line 49
    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
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
    .locals 8

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->p:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->q:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    check-cast v3, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    if-nez v4, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance v4, Landroid/graphics/drawable/ClipDrawable;

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    const v6, 0x800003

    .line 41
    .line 42
    .line 43
    const/4 v7, 0x1

    .line 44
    invoke-direct {v4, v5, v6, v7}, Landroid/graphics/drawable/ClipDrawable;-><init>(Landroid/graphics/drawable/Drawable;II)V

    .line 45
    .line 46
    .line 47
    iget-object v3, v3, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->a:Landroid/widget/ImageView;

    .line 48
    .line 49
    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
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
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->i:Z

    .line 2
    .line 3
    return-void
.end method

.method public setMinimumStars(F)V
    .locals 4
    .param p1    # F
        .annotation build Landroidx/annotation/FloatRange;
            from = 0.0
        .end annotation
    .end param

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->a:I

    .line 2
    .line 3
    iget v1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->g:F

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    cmpg-float v3, p1, v2

    .line 7
    .line 8
    if-gez v3, :cond_0

    .line 9
    .line 10
    move p1, v2

    .line 11
    :cond_0
    int-to-float v0, v0

    .line 12
    cmpl-float v3, p1, v0

    .line 13
    .line 14
    if-lez v3, :cond_1

    .line 15
    .line 16
    move p1, v0

    .line 17
    :cond_1
    rem-float v0, p1, v1

    .line 18
    .line 19
    cmpl-float v0, v0, v2

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    move v1, p1

    .line 25
    :goto_0
    iput v1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->e:F

    .line 26
    .line 27
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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->q:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 10
    .line 11
    .line 12
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->a:I

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->b()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public setOnRatingChangeListener(Lcom/xuexiang/xui/widget/progress/ratingbar/a;)V
    .locals 0

    return-void
.end method

.method public setRating(F)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->a:I

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    cmpl-float v1, p1, v0

    .line 5
    .line 6
    if-lez v1, :cond_0

    .line 7
    .line 8
    move p1, v0

    .line 9
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->e:F

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
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->f:F

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
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->f:F

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
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->j:Z

    .line 2
    .line 3
    return-void
.end method

.method public setStarHeight(I)V
    .locals 6
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->d:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->q:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    check-cast v3, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;

    .line 19
    .line 20
    iput p1, v3, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->d:I

    .line 21
    .line 22
    iget-object v4, v3, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->a:Landroid/widget/ImageView;

    .line 23
    .line 24
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    iget v5, v3, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->d:I

    .line 29
    .line 30
    iput v5, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 31
    .line 32
    iget-object v5, v3, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->a:Landroid/widget/ImageView;

    .line 33
    .line 34
    invoke-virtual {v5, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 35
    .line 36
    .line 37
    iget-object v3, v3, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->b:Landroid/widget/ImageView;

    .line 38
    .line 39
    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    return-void
.end method

.method public setStarPadding(I)V
    .locals 4

    .line 1
    if-gez p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->b:I

    .line 5
    .line 6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->q:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    if-ge v1, v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    add-int/lit8 v1, v1, 0x1

    .line 20
    .line 21
    check-cast v2, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;

    .line 22
    .line 23
    iget v3, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->b:I

    .line 24
    .line 25
    invoke-virtual {v2, v3, v3, v3, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    :goto_1
    return-void
.end method

.method public setStarWidth(I)V
    .locals 6
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->c:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->q:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    check-cast v3, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;

    .line 19
    .line 20
    iput p1, v3, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->c:I

    .line 21
    .line 22
    iget-object v4, v3, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->a:Landroid/widget/ImageView;

    .line 23
    .line 24
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    iget v5, v3, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->c:I

    .line 29
    .line 30
    iput v5, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 31
    .line 32
    iget-object v5, v3, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->a:Landroid/widget/ImageView;

    .line 33
    .line 34
    invoke-virtual {v5, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 35
    .line 36
    .line 37
    iget-object v3, v3, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->b:Landroid/widget/ImageView;

    .line 38
    .line 39
    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
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
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RatingBar;->g:F

    .line 2
    .line 3
    return-void
.end method
