.class public Lcom/flyco/tablayout/SegmentTabLayout;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public A:F

.field public B:I

.field public C:I

.field public D:I

.field public E:Z

.field public final F:I

.field public final G:I

.field public final H:F

.field public final I:Landroid/animation/ValueAnimator;

.field public final J:Landroid/view/animation/OvershootInterpolator;

.field public final K:[F

.field public L:Z

.field public final M:Lb1/d;

.field public final N:Lb1/d;

.field public final a:Landroid/content/Context;

.field public b:[Ljava/lang/String;

.field public final c:Landroid/widget/LinearLayout;

.field public d:I

.field public e:I

.field public f:I

.field public final g:Landroid/graphics/Rect;

.field public final h:Landroid/graphics/drawable/GradientDrawable;

.field public final i:Landroid/graphics/drawable/GradientDrawable;

.field public final j:Landroid/graphics/Paint;

.field public k:F

.field public l:Z

.field public m:F

.field public n:I

.field public o:F

.field public p:F

.field public final q:F

.field public final r:F

.field public final s:F

.field public final t:F

.field public u:J

.field public v:Z

.field public w:Z

.field public x:I

.field public y:F

.field public z:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-direct {p0, p1, v0, v1}, Lcom/flyco/tablayout/SegmentTabLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/flyco/tablayout/SegmentTabLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 10

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance p3, Landroid/graphics/Rect;

    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    iput-object p3, p0, Lcom/flyco/tablayout/SegmentTabLayout;->g:Landroid/graphics/Rect;

    .line 5
    new-instance p3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {p3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iput-object p3, p0, Lcom/flyco/tablayout/SegmentTabLayout;->h:Landroid/graphics/drawable/GradientDrawable;

    .line 6
    new-instance p3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {p3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iput-object p3, p0, Lcom/flyco/tablayout/SegmentTabLayout;->i:Landroid/graphics/drawable/GradientDrawable;

    .line 7
    new-instance p3, Landroid/graphics/Paint;

    const/4 v0, 0x1

    invoke-direct {p3, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p3, p0, Lcom/flyco/tablayout/SegmentTabLayout;->j:Landroid/graphics/Paint;

    .line 8
    new-instance p3, Landroid/view/animation/OvershootInterpolator;

    const v1, 0x3f4ccccd    # 0.8f

    invoke-direct {p3, v1}, Landroid/view/animation/OvershootInterpolator;-><init>(F)V

    iput-object p3, p0, Lcom/flyco/tablayout/SegmentTabLayout;->J:Landroid/view/animation/OvershootInterpolator;

    const/16 p3, 0x8

    .line 9
    new-array p3, p3, [F

    iput-object p3, p0, Lcom/flyco/tablayout/SegmentTabLayout;->K:[F

    .line 10
    iput-boolean v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->L:Z

    .line 11
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 12
    new-instance p3, Landroid/util/SparseArray;

    invoke-direct {p3}, Landroid/util/SparseArray;-><init>()V

    .line 13
    new-instance p3, Lb1/d;

    .line 14
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p3, p0, Lcom/flyco/tablayout/SegmentTabLayout;->M:Lb1/d;

    .line 16
    new-instance v1, Lb1/d;

    .line 17
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object v1, p0, Lcom/flyco/tablayout/SegmentTabLayout;->N:Lb1/d;

    const/4 v2, 0x0

    .line 19
    invoke-virtual {p0, v2}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 20
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 21
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 22
    iput-object p1, p0, Lcom/flyco/tablayout/SegmentTabLayout;->a:Landroid/content/Context;

    .line 23
    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v3, p0, Lcom/flyco/tablayout/SegmentTabLayout;->c:Landroid/widget/LinearLayout;

    .line 24
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 25
    sget-object v3, Lcom/flyco/tablayout/R$styleable;->SegmentTabLayout:[I

    invoke-virtual {p1, p2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v3

    .line 26
    sget v4, Lcom/flyco/tablayout/R$styleable;->SegmentTabLayout_tl_indicator_color:I

    const-string v5, "#222831"

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v3, v4, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v4

    iput v4, p0, Lcom/flyco/tablayout/SegmentTabLayout;->n:I

    .line 27
    sget v4, Lcom/flyco/tablayout/R$styleable;->SegmentTabLayout_tl_indicator_height:I

    const/high16 v5, -0x40800000    # -1.0f

    invoke-virtual {v3, v4, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    iput v4, p0, Lcom/flyco/tablayout/SegmentTabLayout;->o:F

    .line 28
    sget v4, Lcom/flyco/tablayout/R$styleable;->SegmentTabLayout_tl_indicator_corner_radius:I

    invoke-virtual {v3, v4, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    iput v4, p0, Lcom/flyco/tablayout/SegmentTabLayout;->p:F

    .line 29
    sget v4, Lcom/flyco/tablayout/R$styleable;->SegmentTabLayout_tl_indicator_margin_left:I

    const/4 v6, 0x0

    invoke-virtual {p0, v6}, Lcom/flyco/tablayout/SegmentTabLayout;->b(F)I

    move-result v7

    int-to-float v7, v7

    invoke-virtual {v3, v4, v7}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    iput v4, p0, Lcom/flyco/tablayout/SegmentTabLayout;->q:F

    .line 30
    sget v4, Lcom/flyco/tablayout/R$styleable;->SegmentTabLayout_tl_indicator_margin_top:I

    invoke-virtual {v3, v4, v6}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    iput v4, p0, Lcom/flyco/tablayout/SegmentTabLayout;->r:F

    .line 31
    sget v4, Lcom/flyco/tablayout/R$styleable;->SegmentTabLayout_tl_indicator_margin_right:I

    invoke-virtual {p0, v6}, Lcom/flyco/tablayout/SegmentTabLayout;->b(F)I

    move-result v7

    int-to-float v7, v7

    invoke-virtual {v3, v4, v7}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    iput v4, p0, Lcom/flyco/tablayout/SegmentTabLayout;->s:F

    .line 32
    sget v4, Lcom/flyco/tablayout/R$styleable;->SegmentTabLayout_tl_indicator_margin_bottom:I

    invoke-virtual {v3, v4, v6}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    iput v4, p0, Lcom/flyco/tablayout/SegmentTabLayout;->t:F

    .line 33
    sget v4, Lcom/flyco/tablayout/R$styleable;->SegmentTabLayout_tl_indicator_anim_enable:I

    invoke-virtual {v3, v4, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    iput-boolean v4, p0, Lcom/flyco/tablayout/SegmentTabLayout;->v:Z

    .line 34
    sget v4, Lcom/flyco/tablayout/R$styleable;->SegmentTabLayout_tl_indicator_bounce_enable:I

    invoke-virtual {v3, v4, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    iput-boolean v4, p0, Lcom/flyco/tablayout/SegmentTabLayout;->w:Z

    .line 35
    sget v4, Lcom/flyco/tablayout/R$styleable;->SegmentTabLayout_tl_indicator_anim_duration:I

    const/4 v7, -0x1

    invoke-virtual {v3, v4, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    int-to-long v7, v4

    iput-wide v7, p0, Lcom/flyco/tablayout/SegmentTabLayout;->u:J

    .line 36
    sget v4, Lcom/flyco/tablayout/R$styleable;->SegmentTabLayout_tl_divider_color:I

    iget v7, p0, Lcom/flyco/tablayout/SegmentTabLayout;->n:I

    invoke-virtual {v3, v4, v7}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v4

    iput v4, p0, Lcom/flyco/tablayout/SegmentTabLayout;->x:I

    .line 37
    sget v4, Lcom/flyco/tablayout/R$styleable;->SegmentTabLayout_tl_divider_width:I

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-virtual {p0, v7}, Lcom/flyco/tablayout/SegmentTabLayout;->b(F)I

    move-result v8

    int-to-float v8, v8

    invoke-virtual {v3, v4, v8}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    iput v4, p0, Lcom/flyco/tablayout/SegmentTabLayout;->y:F

    .line 38
    sget v4, Lcom/flyco/tablayout/R$styleable;->SegmentTabLayout_tl_divider_padding:I

    invoke-virtual {v3, v4, v6}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    iput v4, p0, Lcom/flyco/tablayout/SegmentTabLayout;->z:F

    .line 39
    sget v4, Lcom/flyco/tablayout/R$styleable;->SegmentTabLayout_tl_textsize:I

    .line 40
    iget-object v8, p0, Lcom/flyco/tablayout/SegmentTabLayout;->a:Landroid/content/Context;

    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v8

    iget v8, v8, Landroid/util/DisplayMetrics;->scaledDensity:F

    const/high16 v9, 0x41500000    # 13.0f

    mul-float/2addr v9, v8

    const/high16 v8, 0x3f000000    # 0.5f

    add-float/2addr v9, v8

    float-to-int v8, v9

    int-to-float v8, v8

    .line 41
    invoke-virtual {v3, v4, v8}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    iput v4, p0, Lcom/flyco/tablayout/SegmentTabLayout;->A:F

    .line 42
    sget v4, Lcom/flyco/tablayout/R$styleable;->SegmentTabLayout_tl_textSelectColor:I

    const-string v8, "#ffffff"

    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v8

    invoke-virtual {v3, v4, v8}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v4

    iput v4, p0, Lcom/flyco/tablayout/SegmentTabLayout;->B:I

    .line 43
    sget v4, Lcom/flyco/tablayout/R$styleable;->SegmentTabLayout_tl_textUnselectColor:I

    iget v8, p0, Lcom/flyco/tablayout/SegmentTabLayout;->n:I

    invoke-virtual {v3, v4, v8}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v4

    iput v4, p0, Lcom/flyco/tablayout/SegmentTabLayout;->C:I

    .line 44
    sget v4, Lcom/flyco/tablayout/R$styleable;->SegmentTabLayout_tl_textBold:I

    invoke-virtual {v3, v4, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    iput v4, p0, Lcom/flyco/tablayout/SegmentTabLayout;->D:I

    .line 45
    sget v4, Lcom/flyco/tablayout/R$styleable;->SegmentTabLayout_tl_textAllCaps:I

    invoke-virtual {v3, v4, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    iput-boolean v4, p0, Lcom/flyco/tablayout/SegmentTabLayout;->E:Z

    .line 46
    sget v4, Lcom/flyco/tablayout/R$styleable;->SegmentTabLayout_tl_tab_space_equal:I

    invoke-virtual {v3, v4, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->l:Z

    .line 47
    sget v0, Lcom/flyco/tablayout/R$styleable;->SegmentTabLayout_tl_tab_width:I

    invoke-virtual {p0, v5}, Lcom/flyco/tablayout/SegmentTabLayout;->b(F)I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v3, v0, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    iput v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->m:F

    .line 48
    sget v4, Lcom/flyco/tablayout/R$styleable;->SegmentTabLayout_tl_tab_padding:I

    iget-boolean v5, p0, Lcom/flyco/tablayout/SegmentTabLayout;->l:Z

    if-nez v5, :cond_1

    cmpl-float v0, v0, v6

    if-lez v0, :cond_0

    goto :goto_1

    :cond_0
    const/high16 v0, 0x41200000    # 10.0f

    invoke-virtual {p0, v0}, Lcom/flyco/tablayout/SegmentTabLayout;->b(F)I

    move-result v0

    :goto_0
    int-to-float v0, v0

    goto :goto_2

    :cond_1
    :goto_1
    invoke-virtual {p0, v6}, Lcom/flyco/tablayout/SegmentTabLayout;->b(F)I

    move-result v0

    goto :goto_0

    :goto_2
    invoke-virtual {v3, v4, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    iput v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->k:F

    .line 49
    sget v0, Lcom/flyco/tablayout/R$styleable;->SegmentTabLayout_tl_bar_color:I

    invoke-virtual {v3, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->F:I

    .line 50
    sget v0, Lcom/flyco/tablayout/R$styleable;->SegmentTabLayout_tl_bar_stroke_color:I

    iget v4, p0, Lcom/flyco/tablayout/SegmentTabLayout;->n:I

    invoke-virtual {v3, v0, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->G:I

    .line 51
    sget v0, Lcom/flyco/tablayout/R$styleable;->SegmentTabLayout_tl_bar_stroke_width:I

    invoke-virtual {p0, v7}, Lcom/flyco/tablayout/SegmentTabLayout;->b(F)I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v3, v0, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v0

    iput v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->H:F

    .line 52
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 53
    const-string v0, "http://schemas.android.com/apk/res/android"

    const-string v3, "layout_height"

    invoke-interface {p2, v0, v3}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 54
    const-string v3, "-1"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_3

    .line 55
    :cond_2
    const-string v3, "-2"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_3

    :cond_3
    const v0, 0x10100f5

    .line 56
    filled-new-array {v0}, [I

    move-result-object v0

    .line 57
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, -0x2

    .line 58
    invoke-virtual {p1, v2, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 59
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 60
    :goto_3
    new-instance p1, Lb1/b;

    const/4 p2, 0x1

    .line 61
    invoke-direct {p1, p2}, Lb1/b;-><init>(I)V

    .line 62
    filled-new-array {v1, p3}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/animation/ValueAnimator;->ofObject(Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ValueAnimator;

    move-result-object p1

    iput-object p1, p0, Lcom/flyco/tablayout/SegmentTabLayout;->I:Landroid/animation/ValueAnimator;

    .line 63
    invoke-virtual {p1, p0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->c:Landroid/widget/LinearLayout;

    .line 2
    .line 3
    iget v1, p0, Lcom/flyco/tablayout/SegmentTabLayout;->d:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    int-to-float v1, v1

    .line 14
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    int-to-float v0, v0

    .line 19
    float-to-int v1, v1

    .line 20
    iget-object v2, p0, Lcom/flyco/tablayout/SegmentTabLayout;->g:Landroid/graphics/Rect;

    .line 21
    .line 22
    iput v1, v2, Landroid/graphics/Rect;->left:I

    .line 23
    .line 24
    float-to-int v0, v0

    .line 25
    iput v0, v2, Landroid/graphics/Rect;->right:I

    .line 26
    .line 27
    iget-boolean v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->v:Z

    .line 28
    .line 29
    const/4 v1, 0x7

    .line 30
    const/4 v2, 0x6

    .line 31
    const/4 v3, 0x5

    .line 32
    const/4 v4, 0x4

    .line 33
    const/4 v5, 0x3

    .line 34
    const/4 v6, 0x2

    .line 35
    const/4 v7, 0x0

    .line 36
    iget-object v8, p0, Lcom/flyco/tablayout/SegmentTabLayout;->K:[F

    .line 37
    .line 38
    const/4 v9, 0x1

    .line 39
    if-nez v0, :cond_2

    .line 40
    .line 41
    iget v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->d:I

    .line 42
    .line 43
    const/4 v10, 0x0

    .line 44
    if-nez v0, :cond_0

    .line 45
    .line 46
    iget v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->p:F

    .line 47
    .line 48
    aput v0, v8, v7

    .line 49
    .line 50
    aput v0, v8, v9

    .line 51
    .line 52
    aput v10, v8, v6

    .line 53
    .line 54
    aput v10, v8, v5

    .line 55
    .line 56
    aput v10, v8, v4

    .line 57
    .line 58
    aput v10, v8, v3

    .line 59
    .line 60
    aput v0, v8, v2

    .line 61
    .line 62
    aput v0, v8, v1

    .line 63
    .line 64
    return-void

    .line 65
    :cond_0
    iget v11, p0, Lcom/flyco/tablayout/SegmentTabLayout;->f:I

    .line 66
    .line 67
    sub-int/2addr v11, v9

    .line 68
    if-ne v0, v11, :cond_1

    .line 69
    .line 70
    aput v10, v8, v7

    .line 71
    .line 72
    aput v10, v8, v9

    .line 73
    .line 74
    iget v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->p:F

    .line 75
    .line 76
    aput v0, v8, v6

    .line 77
    .line 78
    aput v0, v8, v5

    .line 79
    .line 80
    aput v0, v8, v4

    .line 81
    .line 82
    aput v0, v8, v3

    .line 83
    .line 84
    aput v10, v8, v2

    .line 85
    .line 86
    aput v10, v8, v1

    .line 87
    .line 88
    return-void

    .line 89
    :cond_1
    aput v10, v8, v7

    .line 90
    .line 91
    aput v10, v8, v9

    .line 92
    .line 93
    aput v10, v8, v6

    .line 94
    .line 95
    aput v10, v8, v5

    .line 96
    .line 97
    aput v10, v8, v4

    .line 98
    .line 99
    aput v10, v8, v3

    .line 100
    .line 101
    aput v10, v8, v2

    .line 102
    .line 103
    aput v10, v8, v1

    .line 104
    .line 105
    return-void

    .line 106
    :cond_2
    iget v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->p:F

    .line 107
    .line 108
    aput v0, v8, v7

    .line 109
    .line 110
    aput v0, v8, v9

    .line 111
    .line 112
    aput v0, v8, v6

    .line 113
    .line 114
    aput v0, v8, v5

    .line 115
    .line 116
    aput v0, v8, v4

    .line 117
    .line 118
    aput v0, v8, v3

    .line 119
    .line 120
    aput v0, v8, v2

    .line 121
    .line 122
    aput v0, v8, v1

    .line 123
    .line 124
    return-void
.end method

.method public final b(F)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 12
    .line 13
    mul-float/2addr p1, v0

    .line 14
    const/high16 v0, 0x3f000000    # 0.5f

    .line 15
    .line 16
    add-float/2addr p1, v0

    .line 17
    float-to-int p1, p1

    .line 18
    return p1
.end method

.method public final c(I)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget v2, p0, Lcom/flyco/tablayout/SegmentTabLayout;->f:I

    .line 4
    .line 5
    if-ge v1, v2, :cond_3

    .line 6
    .line 7
    iget-object v2, p0, Lcom/flyco/tablayout/SegmentTabLayout;->c:Landroid/widget/LinearLayout;

    .line 8
    .line 9
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/4 v3, 0x1

    .line 14
    if-ne v1, p1, :cond_0

    .line 15
    .line 16
    move v4, v3

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    move v4, v0

    .line 19
    :goto_1
    sget v5, Lcom/flyco/tablayout/R$id;->tv_tab_title:I

    .line 20
    .line 21
    invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Landroid/widget/TextView;

    .line 26
    .line 27
    if-eqz v4, :cond_1

    .line 28
    .line 29
    iget v5, p0, Lcom/flyco/tablayout/SegmentTabLayout;->B:I

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_1
    iget v5, p0, Lcom/flyco/tablayout/SegmentTabLayout;->C:I

    .line 33
    .line 34
    :goto_2
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 35
    .line 36
    .line 37
    iget v5, p0, Lcom/flyco/tablayout/SegmentTabLayout;->D:I

    .line 38
    .line 39
    if-ne v5, v3, :cond_2

    .line 40
    .line 41
    invoke-virtual {v2}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 46
    .line 47
    .line 48
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    return-void
.end method

.method public final d()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget v2, p0, Lcom/flyco/tablayout/SegmentTabLayout;->f:I

    .line 4
    .line 5
    if-ge v1, v2, :cond_4

    .line 6
    .line 7
    iget-object v2, p0, Lcom/flyco/tablayout/SegmentTabLayout;->c:Landroid/widget/LinearLayout;

    .line 8
    .line 9
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget v3, p0, Lcom/flyco/tablayout/SegmentTabLayout;->k:F

    .line 14
    .line 15
    float-to-int v4, v3

    .line 16
    float-to-int v3, v3

    .line 17
    invoke-virtual {v2, v4, v0, v3, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 18
    .line 19
    .line 20
    sget v3, Lcom/flyco/tablayout/R$id;->tv_tab_title:I

    .line 21
    .line 22
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Landroid/widget/TextView;

    .line 27
    .line 28
    iget v3, p0, Lcom/flyco/tablayout/SegmentTabLayout;->d:I

    .line 29
    .line 30
    if-ne v1, v3, :cond_0

    .line 31
    .line 32
    iget v3, p0, Lcom/flyco/tablayout/SegmentTabLayout;->B:I

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    iget v3, p0, Lcom/flyco/tablayout/SegmentTabLayout;->C:I

    .line 36
    .line 37
    :goto_1
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 38
    .line 39
    .line 40
    iget v3, p0, Lcom/flyco/tablayout/SegmentTabLayout;->A:F

    .line 41
    .line 42
    invoke-virtual {v2, v0, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 43
    .line 44
    .line 45
    iget-boolean v3, p0, Lcom/flyco/tablayout/SegmentTabLayout;->E:Z

    .line 46
    .line 47
    if-eqz v3, :cond_1

    .line 48
    .line 49
    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-virtual {v3}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 62
    .line 63
    .line 64
    :cond_1
    iget v3, p0, Lcom/flyco/tablayout/SegmentTabLayout;->D:I

    .line 65
    .line 66
    const/4 v4, 0x2

    .line 67
    if-ne v3, v4, :cond_2

    .line 68
    .line 69
    invoke-virtual {v2}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    const/4 v3, 0x1

    .line 74
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 75
    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_2
    if-nez v3, :cond_3

    .line 79
    .line 80
    invoke-virtual {v2}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 85
    .line 86
    .line 87
    :cond_3
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_4
    return-void
.end method

.method public getCurrentTab()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public getDividerColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->x:I

    .line 2
    .line 3
    return v0
.end method

.method public getDividerPadding()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->z:F

    .line 2
    .line 3
    return v0
.end method

.method public getDividerWidth()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->y:F

    .line 2
    .line 3
    return v0
.end method

.method public getIndicatorAnimDuration()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->u:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getIndicatorColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->n:I

    .line 2
    .line 3
    return v0
.end method

.method public getIndicatorCornerRadius()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->p:F

    .line 2
    .line 3
    return v0
.end method

.method public getIndicatorHeight()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->o:F

    .line 2
    .line 3
    return v0
.end method

.method public getIndicatorMarginBottom()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->t:F

    .line 2
    .line 3
    return v0
.end method

.method public getIndicatorMarginLeft()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->q:F

    .line 2
    .line 3
    return v0
.end method

.method public getIndicatorMarginRight()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->s:F

    .line 2
    .line 3
    return v0
.end method

.method public getIndicatorMarginTop()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->r:F

    .line 2
    .line 3
    return v0
.end method

.method public getTabCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->f:I

    .line 2
    .line 3
    return v0
.end method

.method public getTabPadding()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->k:F

    .line 2
    .line 3
    return v0
.end method

.method public getTabWidth()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->m:F

    .line 2
    .line 3
    return v0
.end method

.method public getTextBold()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->D:I

    .line 2
    .line 3
    return v0
.end method

.method public getTextSelectColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->B:I

    .line 2
    .line 3
    return v0
.end method

.method public getTextUnselectColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->C:I

    .line 2
    .line 3
    return v0
.end method

.method public getTextsize()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->A:F

    .line 2
    .line 3
    return v0
.end method

.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lb1/d;

    .line 6
    .line 7
    iget v0, p1, Lb1/d;->a:F

    .line 8
    .line 9
    float-to-int v0, v0

    .line 10
    iget-object v1, p0, Lcom/flyco/tablayout/SegmentTabLayout;->g:Landroid/graphics/Rect;

    .line 11
    .line 12
    iput v0, v1, Landroid/graphics/Rect;->left:I

    .line 13
    .line 14
    iget p1, p1, Lb1/d;->b:F

    .line 15
    .line 16
    float-to-int p1, p1

    .line 17
    iput p1, v1, Landroid/graphics/Rect;->right:I

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 11

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_7

    .line 9
    .line 10
    iget v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->f:I

    .line 11
    .line 12
    if-gtz v0, :cond_0

    .line 13
    .line 14
    goto/16 :goto_2

    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    iget v2, p0, Lcom/flyco/tablayout/SegmentTabLayout;->o:F

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    cmpg-float v2, v2, v3

    .line 28
    .line 29
    if-gez v2, :cond_1

    .line 30
    .line 31
    int-to-float v2, v0

    .line 32
    iget v4, p0, Lcom/flyco/tablayout/SegmentTabLayout;->r:F

    .line 33
    .line 34
    sub-float/2addr v2, v4

    .line 35
    iget v4, p0, Lcom/flyco/tablayout/SegmentTabLayout;->t:F

    .line 36
    .line 37
    sub-float/2addr v2, v4

    .line 38
    iput v2, p0, Lcom/flyco/tablayout/SegmentTabLayout;->o:F

    .line 39
    .line 40
    :cond_1
    iget v2, p0, Lcom/flyco/tablayout/SegmentTabLayout;->p:F

    .line 41
    .line 42
    cmpg-float v4, v2, v3

    .line 43
    .line 44
    const/high16 v5, 0x40000000    # 2.0f

    .line 45
    .line 46
    if-ltz v4, :cond_2

    .line 47
    .line 48
    iget v4, p0, Lcom/flyco/tablayout/SegmentTabLayout;->o:F

    .line 49
    .line 50
    div-float/2addr v4, v5

    .line 51
    cmpl-float v2, v2, v4

    .line 52
    .line 53
    if-lez v2, :cond_3

    .line 54
    .line 55
    :cond_2
    iget v2, p0, Lcom/flyco/tablayout/SegmentTabLayout;->o:F

    .line 56
    .line 57
    div-float/2addr v2, v5

    .line 58
    iput v2, p0, Lcom/flyco/tablayout/SegmentTabLayout;->p:F

    .line 59
    .line 60
    :cond_3
    iget v2, p0, Lcom/flyco/tablayout/SegmentTabLayout;->F:I

    .line 61
    .line 62
    iget-object v4, p0, Lcom/flyco/tablayout/SegmentTabLayout;->i:Landroid/graphics/drawable/GradientDrawable;

    .line 63
    .line 64
    invoke-virtual {v4, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 65
    .line 66
    .line 67
    iget v2, p0, Lcom/flyco/tablayout/SegmentTabLayout;->H:F

    .line 68
    .line 69
    float-to-int v2, v2

    .line 70
    iget v5, p0, Lcom/flyco/tablayout/SegmentTabLayout;->G:I

    .line 71
    .line 72
    invoke-virtual {v4, v2, v5}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 73
    .line 74
    .line 75
    iget v2, p0, Lcom/flyco/tablayout/SegmentTabLayout;->p:F

    .line 76
    .line 77
    invoke-virtual {v4, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    sub-int/2addr v6, v7

    .line 97
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 98
    .line 99
    .line 100
    move-result v7

    .line 101
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 102
    .line 103
    .line 104
    move-result v8

    .line 105
    sub-int/2addr v7, v8

    .line 106
    invoke-virtual {v4, v2, v5, v6, v7}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v4, p1}, Landroid/graphics/drawable/GradientDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 110
    .line 111
    .line 112
    iget-boolean v2, p0, Lcom/flyco/tablayout/SegmentTabLayout;->v:Z

    .line 113
    .line 114
    const/4 v4, 0x0

    .line 115
    if-nez v2, :cond_4

    .line 116
    .line 117
    iget v2, p0, Lcom/flyco/tablayout/SegmentTabLayout;->y:F

    .line 118
    .line 119
    cmpl-float v3, v2, v3

    .line 120
    .line 121
    if-lez v3, :cond_4

    .line 122
    .line 123
    iget-object v10, p0, Lcom/flyco/tablayout/SegmentTabLayout;->j:Landroid/graphics/Paint;

    .line 124
    .line 125
    invoke-virtual {v10, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 126
    .line 127
    .line 128
    iget v2, p0, Lcom/flyco/tablayout/SegmentTabLayout;->x:I

    .line 129
    .line 130
    invoke-virtual {v10, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 131
    .line 132
    .line 133
    move v2, v4

    .line 134
    :goto_0
    iget v3, p0, Lcom/flyco/tablayout/SegmentTabLayout;->f:I

    .line 135
    .line 136
    add-int/lit8 v3, v3, -0x1

    .line 137
    .line 138
    if-ge v2, v3, :cond_4

    .line 139
    .line 140
    iget-object v3, p0, Lcom/flyco/tablayout/SegmentTabLayout;->c:Landroid/widget/LinearLayout;

    .line 141
    .line 142
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    invoke-virtual {v3}, Landroid/view/View;->getRight()I

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    add-int/2addr v5, v1

    .line 151
    int-to-float v6, v5

    .line 152
    iget v7, p0, Lcom/flyco/tablayout/SegmentTabLayout;->z:F

    .line 153
    .line 154
    invoke-virtual {v3}, Landroid/view/View;->getRight()I

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    add-int/2addr v3, v1

    .line 159
    int-to-float v8, v3

    .line 160
    int-to-float v3, v0

    .line 161
    iget v5, p0, Lcom/flyco/tablayout/SegmentTabLayout;->z:F

    .line 162
    .line 163
    sub-float v9, v3, v5

    .line 164
    .line 165
    move-object v5, p1

    .line 166
    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 167
    .line 168
    .line 169
    add-int/lit8 v2, v2, 0x1

    .line 170
    .line 171
    goto :goto_0

    .line 172
    :cond_4
    move-object v5, p1

    .line 173
    iget-boolean p1, p0, Lcom/flyco/tablayout/SegmentTabLayout;->v:Z

    .line 174
    .line 175
    if-eqz p1, :cond_5

    .line 176
    .line 177
    iget-boolean p1, p0, Lcom/flyco/tablayout/SegmentTabLayout;->L:Z

    .line 178
    .line 179
    if-eqz p1, :cond_6

    .line 180
    .line 181
    iput-boolean v4, p0, Lcom/flyco/tablayout/SegmentTabLayout;->L:Z

    .line 182
    .line 183
    invoke-virtual {p0}, Lcom/flyco/tablayout/SegmentTabLayout;->a()V

    .line 184
    .line 185
    .line 186
    goto :goto_1

    .line 187
    :cond_5
    invoke-virtual {p0}, Lcom/flyco/tablayout/SegmentTabLayout;->a()V

    .line 188
    .line 189
    .line 190
    :cond_6
    :goto_1
    iget p1, p0, Lcom/flyco/tablayout/SegmentTabLayout;->n:I

    .line 191
    .line 192
    iget-object v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->h:Landroid/graphics/drawable/GradientDrawable;

    .line 193
    .line 194
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 195
    .line 196
    .line 197
    iget p1, p0, Lcom/flyco/tablayout/SegmentTabLayout;->q:F

    .line 198
    .line 199
    float-to-int p1, p1

    .line 200
    add-int/2addr p1, v1

    .line 201
    iget-object v2, p0, Lcom/flyco/tablayout/SegmentTabLayout;->g:Landroid/graphics/Rect;

    .line 202
    .line 203
    iget v3, v2, Landroid/graphics/Rect;->left:I

    .line 204
    .line 205
    add-int/2addr p1, v3

    .line 206
    iget v3, p0, Lcom/flyco/tablayout/SegmentTabLayout;->r:F

    .line 207
    .line 208
    float-to-int v4, v3

    .line 209
    iget v2, v2, Landroid/graphics/Rect;->right:I

    .line 210
    .line 211
    add-int/2addr v1, v2

    .line 212
    int-to-float v1, v1

    .line 213
    iget v2, p0, Lcom/flyco/tablayout/SegmentTabLayout;->s:F

    .line 214
    .line 215
    sub-float/2addr v1, v2

    .line 216
    float-to-int v1, v1

    .line 217
    iget v2, p0, Lcom/flyco/tablayout/SegmentTabLayout;->o:F

    .line 218
    .line 219
    add-float/2addr v3, v2

    .line 220
    float-to-int v2, v3

    .line 221
    invoke-virtual {v0, p1, v4, v1, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 222
    .line 223
    .line 224
    iget-object p1, p0, Lcom/flyco/tablayout/SegmentTabLayout;->K:[F

    .line 225
    .line 226
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadii([F)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0, v5}, Landroid/graphics/drawable/GradientDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 230
    .line 231
    .line 232
    :cond_7
    :goto_2
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Landroid/os/Bundle;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Landroid/os/Bundle;

    .line 6
    .line 7
    const-string v0, "mCurrentTab"

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iput v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->d:I

    .line 14
    .line 15
    const-string v0, "instanceState"

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->d:I

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->c:Landroid/widget/LinearLayout;

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-lez v0, :cond_0

    .line 32
    .line 33
    iget v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->d:I

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Lcom/flyco/tablayout/SegmentTabLayout;->c(I)V

    .line 36
    .line 37
    .line 38
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "instanceState"

    .line 7
    .line 8
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 13
    .line 14
    .line 15
    const-string v1, "mCurrentTab"

    .line 16
    .line 17
    iget v2, p0, Lcom/flyco/tablayout/SegmentTabLayout;->d:I

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public setCurrentTab(I)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->d:I

    .line 2
    .line 3
    iput v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->e:I

    .line 4
    .line 5
    iput p1, p0, Lcom/flyco/tablayout/SegmentTabLayout;->d:I

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/flyco/tablayout/SegmentTabLayout;->c(I)V

    .line 8
    .line 9
    .line 10
    iget-boolean p1, p0, Lcom/flyco/tablayout/SegmentTabLayout;->v:Z

    .line 11
    .line 12
    if-eqz p1, :cond_4

    .line 13
    .line 14
    iget p1, p0, Lcom/flyco/tablayout/SegmentTabLayout;->d:I

    .line 15
    .line 16
    iget-object v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->c:Landroid/widget/LinearLayout;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    int-to-float v1, v1

    .line 27
    iget-object v2, p0, Lcom/flyco/tablayout/SegmentTabLayout;->M:Lb1/d;

    .line 28
    .line 29
    iput v1, v2, Lb1/d;->a:F

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    int-to-float p1, p1

    .line 36
    iput p1, v2, Lb1/d;->b:F

    .line 37
    .line 38
    iget p1, p0, Lcom/flyco/tablayout/SegmentTabLayout;->e:I

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    int-to-float v0, v0

    .line 49
    iget-object v1, p0, Lcom/flyco/tablayout/SegmentTabLayout;->N:Lb1/d;

    .line 50
    .line 51
    iput v0, v1, Lb1/d;->a:F

    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    int-to-float p1, p1

    .line 58
    iput p1, v1, Lb1/d;->b:F

    .line 59
    .line 60
    iget v0, v1, Lb1/d;->a:F

    .line 61
    .line 62
    iget v3, v2, Lb1/d;->a:F

    .line 63
    .line 64
    cmpl-float v0, v0, v3

    .line 65
    .line 66
    if-nez v0, :cond_0

    .line 67
    .line 68
    iget v0, v2, Lb1/d;->b:F

    .line 69
    .line 70
    cmpl-float p1, p1, v0

    .line 71
    .line 72
    if-nez p1, :cond_0

    .line 73
    .line 74
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_0
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    iget-object v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->I:Landroid/animation/ValueAnimator;

    .line 83
    .line 84
    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->setObjectValues([Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iget-boolean p1, p0, Lcom/flyco/tablayout/SegmentTabLayout;->w:Z

    .line 88
    .line 89
    if-eqz p1, :cond_1

    .line 90
    .line 91
    iget-object p1, p0, Lcom/flyco/tablayout/SegmentTabLayout;->J:Landroid/view/animation/OvershootInterpolator;

    .line 92
    .line 93
    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 94
    .line 95
    .line 96
    :cond_1
    iget-wide v1, p0, Lcom/flyco/tablayout/SegmentTabLayout;->u:J

    .line 97
    .line 98
    const-wide/16 v3, 0x0

    .line 99
    .line 100
    cmp-long p1, v1, v3

    .line 101
    .line 102
    if-gez p1, :cond_3

    .line 103
    .line 104
    iget-boolean p1, p0, Lcom/flyco/tablayout/SegmentTabLayout;->w:Z

    .line 105
    .line 106
    if-eqz p1, :cond_2

    .line 107
    .line 108
    const-wide/16 v1, 0x1f4

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_2
    const-wide/16 v1, 0xfa

    .line 112
    .line 113
    :goto_0
    iput-wide v1, p0, Lcom/flyco/tablayout/SegmentTabLayout;->u:J

    .line 114
    .line 115
    :cond_3
    iget-wide v1, p0, Lcom/flyco/tablayout/SegmentTabLayout;->u:J

    .line 116
    .line 117
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method public setDividerColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/flyco/tablayout/SegmentTabLayout;->x:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setDividerPadding(F)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/flyco/tablayout/SegmentTabLayout;->b(F)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    iput p1, p0, Lcom/flyco/tablayout/SegmentTabLayout;->z:F

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setDividerWidth(F)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/flyco/tablayout/SegmentTabLayout;->b(F)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    iput p1, p0, Lcom/flyco/tablayout/SegmentTabLayout;->y:F

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setIndicatorAnimDuration(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/flyco/tablayout/SegmentTabLayout;->u:J

    .line 2
    .line 3
    return-void
.end method

.method public setIndicatorAnimEnable(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/flyco/tablayout/SegmentTabLayout;->v:Z

    .line 2
    .line 3
    return-void
.end method

.method public setIndicatorBounceEnable(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/flyco/tablayout/SegmentTabLayout;->w:Z

    .line 2
    .line 3
    return-void
.end method

.method public setIndicatorColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/flyco/tablayout/SegmentTabLayout;->n:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setIndicatorCornerRadius(F)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/flyco/tablayout/SegmentTabLayout;->b(F)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    iput p1, p0, Lcom/flyco/tablayout/SegmentTabLayout;->p:F

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setIndicatorHeight(F)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/flyco/tablayout/SegmentTabLayout;->b(F)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    iput p1, p0, Lcom/flyco/tablayout/SegmentTabLayout;->o:F

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setOnTabSelectListener(Lc1/a;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setTabData([Ljava/lang/String;)V
    .locals 7

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    array-length v0, p1

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    iput-object p1, p0, Lcom/flyco/tablayout/SegmentTabLayout;->b:[Ljava/lang/String;

    .line 7
    .line 8
    iget-object p1, p0, Lcom/flyco/tablayout/SegmentTabLayout;->c:Landroid/widget/LinearLayout;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->b:[Ljava/lang/String;

    .line 14
    .line 15
    array-length v0, v0

    .line 16
    iput v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->f:I

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    move v1, v0

    .line 20
    :goto_0
    iget v2, p0, Lcom/flyco/tablayout/SegmentTabLayout;->f:I

    .line 21
    .line 22
    if-ge v1, v2, :cond_2

    .line 23
    .line 24
    sget v2, Lcom/flyco/tablayout/R$layout;->layout_tab_segment:I

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    iget-object v4, p0, Lcom/flyco/tablayout/SegmentTabLayout;->a:Landroid/content/Context;

    .line 28
    .line 29
    invoke-static {v4, v2, v3}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    sget v3, Lcom/flyco/tablayout/R$id;->tv_tab_title:I

    .line 41
    .line 42
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, Landroid/widget/TextView;

    .line 47
    .line 48
    iget-object v4, p0, Lcom/flyco/tablayout/SegmentTabLayout;->b:[Ljava/lang/String;

    .line 49
    .line 50
    aget-object v4, v4, v1

    .line 51
    .line 52
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    .line 54
    .line 55
    new-instance v3, Lb1/c;

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    invoke-direct {v3, p0, v4}, Lb1/c;-><init>(Landroid/view/KeyEvent$Callback;I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 62
    .line 63
    .line 64
    iget-boolean v3, p0, Lcom/flyco/tablayout/SegmentTabLayout;->l:Z

    .line 65
    .line 66
    const/4 v4, -0x1

    .line 67
    if-eqz v3, :cond_0

    .line 68
    .line 69
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 70
    .line 71
    const/high16 v5, 0x3f800000    # 1.0f

    .line 72
    .line 73
    invoke-direct {v3, v0, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_0
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 78
    .line 79
    const/4 v5, -0x2

    .line 80
    invoke-direct {v3, v5, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 81
    .line 82
    .line 83
    :goto_1
    iget v5, p0, Lcom/flyco/tablayout/SegmentTabLayout;->m:F

    .line 84
    .line 85
    const/4 v6, 0x0

    .line 86
    cmpl-float v5, v5, v6

    .line 87
    .line 88
    if-lez v5, :cond_1

    .line 89
    .line 90
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 91
    .line 92
    iget v5, p0, Lcom/flyco/tablayout/SegmentTabLayout;->m:F

    .line 93
    .line 94
    float-to-int v5, v5

    .line 95
    invoke-direct {v3, v5, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 96
    .line 97
    .line 98
    :cond_1
    invoke-virtual {p1, v2, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 99
    .line 100
    .line 101
    add-int/lit8 v1, v1, 0x1

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_2
    invoke-virtual {p0}, Lcom/flyco/tablayout/SegmentTabLayout;->d()V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 109
    .line 110
    const-string v0, "Titles can not be NULL or EMPTY !"

    .line 111
    .line 112
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw p1
.end method

.method public setTabPadding(F)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/flyco/tablayout/SegmentTabLayout;->b(F)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    iput p1, p0, Lcom/flyco/tablayout/SegmentTabLayout;->k:F

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/flyco/tablayout/SegmentTabLayout;->d()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setTabSpaceEqual(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/flyco/tablayout/SegmentTabLayout;->l:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/flyco/tablayout/SegmentTabLayout;->d()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setTabWidth(F)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/flyco/tablayout/SegmentTabLayout;->b(F)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    iput p1, p0, Lcom/flyco/tablayout/SegmentTabLayout;->m:F

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/flyco/tablayout/SegmentTabLayout;->d()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setTextAllCaps(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/flyco/tablayout/SegmentTabLayout;->E:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/flyco/tablayout/SegmentTabLayout;->d()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setTextBold(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/flyco/tablayout/SegmentTabLayout;->D:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/flyco/tablayout/SegmentTabLayout;->d()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setTextSelectColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/flyco/tablayout/SegmentTabLayout;->B:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/flyco/tablayout/SegmentTabLayout;->d()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setTextUnselectColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/flyco/tablayout/SegmentTabLayout;->C:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/flyco/tablayout/SegmentTabLayout;->d()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setTextsize(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/flyco/tablayout/SegmentTabLayout;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v0, v0, Landroid/util/DisplayMetrics;->scaledDensity:F

    .line 12
    .line 13
    mul-float/2addr p1, v0

    .line 14
    const/high16 v0, 0x3f000000    # 0.5f

    .line 15
    .line 16
    add-float/2addr p1, v0

    .line 17
    float-to-int p1, p1

    .line 18
    int-to-float p1, p1

    .line 19
    iput p1, p0, Lcom/flyco/tablayout/SegmentTabLayout;->A:F

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/flyco/tablayout/SegmentTabLayout;->d()V

    .line 22
    .line 23
    .line 24
    return-void
.end method
