.class public Lcom/flyco/tablayout/CommonTabLayout;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public A:Z

.field public B:I

.field public C:I

.field public D:F

.field public E:I

.field public F:I

.field public G:F

.field public H:F

.field public I:F

.field public J:I

.field public K:I

.field public L:I

.field public M:Z

.field public N:Z

.field public O:I

.field public P:F

.field public Q:F

.field public R:F

.field public final S:Landroid/animation/ValueAnimator;

.field public final T:Landroid/view/animation/OvershootInterpolator;

.field public U:Z

.field public final V:Lb1/a;

.field public final W:Lb1/a;

.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/ArrayList;

.field public final c:Landroid/widget/LinearLayout;

.field public d:I

.field public e:I

.field public f:I

.field public final g:Landroid/graphics/Rect;

.field public final h:Landroid/graphics/drawable/GradientDrawable;

.field public final i:Landroid/graphics/Paint;

.field public final j:Landroid/graphics/Paint;

.field public final k:Landroid/graphics/Paint;

.field public final l:Landroid/graphics/Path;

.field public m:I

.field public n:F

.field public o:Z

.field public p:F

.field public q:I

.field public r:F

.field public s:F

.field public t:F

.field public final u:F

.field public final v:F

.field public final w:F

.field public final x:F

.field public y:J

.field public z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-direct {p0, p1, v0, v1}, Lcom/flyco/tablayout/CommonTabLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/flyco/tablayout/CommonTabLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 3
    invoke-direct/range {p0 .. p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v0, Lcom/flyco/tablayout/CommonTabLayout;->b:Ljava/util/ArrayList;

    .line 5
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    iput-object v3, v0, Lcom/flyco/tablayout/CommonTabLayout;->g:Landroid/graphics/Rect;

    .line 6
    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iput-object v3, v0, Lcom/flyco/tablayout/CommonTabLayout;->h:Landroid/graphics/drawable/GradientDrawable;

    .line 7
    new-instance v3, Landroid/graphics/Paint;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v3, v0, Lcom/flyco/tablayout/CommonTabLayout;->i:Landroid/graphics/Paint;

    .line 8
    new-instance v3, Landroid/graphics/Paint;

    invoke-direct {v3, v4}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v3, v0, Lcom/flyco/tablayout/CommonTabLayout;->j:Landroid/graphics/Paint;

    .line 9
    new-instance v3, Landroid/graphics/Paint;

    invoke-direct {v3, v4}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v3, v0, Lcom/flyco/tablayout/CommonTabLayout;->k:Landroid/graphics/Paint;

    .line 10
    new-instance v3, Landroid/graphics/Path;

    invoke-direct {v3}, Landroid/graphics/Path;-><init>()V

    iput-object v3, v0, Lcom/flyco/tablayout/CommonTabLayout;->l:Landroid/graphics/Path;

    const/4 v3, 0x0

    .line 11
    iput v3, v0, Lcom/flyco/tablayout/CommonTabLayout;->m:I

    .line 12
    new-instance v5, Landroid/view/animation/OvershootInterpolator;

    const/high16 v6, 0x3fc00000    # 1.5f

    invoke-direct {v5, v6}, Landroid/view/animation/OvershootInterpolator;-><init>(F)V

    iput-object v5, v0, Lcom/flyco/tablayout/CommonTabLayout;->T:Landroid/view/animation/OvershootInterpolator;

    .line 13
    iput-boolean v4, v0, Lcom/flyco/tablayout/CommonTabLayout;->U:Z

    .line 14
    new-instance v5, Landroid/graphics/Paint;

    invoke-direct {v5, v4}, Landroid/graphics/Paint;-><init>(I)V

    .line 15
    new-instance v5, Landroid/util/SparseArray;

    invoke-direct {v5}, Landroid/util/SparseArray;-><init>()V

    .line 16
    new-instance v5, Lb1/a;

    .line 17
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object v5, v0, Lcom/flyco/tablayout/CommonTabLayout;->V:Lb1/a;

    .line 19
    new-instance v6, Lb1/a;

    .line 20
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object v6, v0, Lcom/flyco/tablayout/CommonTabLayout;->W:Lb1/a;

    .line 22
    invoke-virtual {v0, v3}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 23
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 24
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 25
    iput-object v1, v0, Lcom/flyco/tablayout/CommonTabLayout;->a:Landroid/content/Context;

    .line 26
    new-instance v7, Landroid/widget/LinearLayout;

    invoke-direct {v7, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v7, v0, Lcom/flyco/tablayout/CommonTabLayout;->c:Landroid/widget/LinearLayout;

    .line 27
    invoke-virtual {v0, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 28
    sget-object v7, Lcom/flyco/tablayout/R$styleable;->CommonTabLayout:[I

    invoke-virtual {v1, v2, v7}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v7

    .line 29
    sget v8, Lcom/flyco/tablayout/R$styleable;->CommonTabLayout_tl_indicator_style:I

    invoke-virtual {v7, v8, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v8

    iput v8, v0, Lcom/flyco/tablayout/CommonTabLayout;->m:I

    .line 30
    sget v9, Lcom/flyco/tablayout/R$styleable;->CommonTabLayout_tl_indicator_color:I

    const-string v10, "#ffffff"

    const/4 v11, 0x2

    if-ne v8, v11, :cond_0

    const-string v8, "#4B6A87"

    goto :goto_0

    :cond_0
    move-object v8, v10

    :goto_0
    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v8

    invoke-virtual {v7, v9, v8}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v8

    iput v8, v0, Lcom/flyco/tablayout/CommonTabLayout;->q:I

    .line 31
    sget v8, Lcom/flyco/tablayout/R$styleable;->CommonTabLayout_tl_indicator_height:I

    iget v9, v0, Lcom/flyco/tablayout/CommonTabLayout;->m:I

    const/4 v12, -0x1

    if-ne v9, v4, :cond_1

    const/high16 v9, 0x40800000    # 4.0f

    goto :goto_2

    :cond_1
    if-ne v9, v11, :cond_2

    move v9, v12

    goto :goto_1

    :cond_2
    move v9, v11

    :goto_1
    int-to-float v9, v9

    .line 32
    :goto_2
    invoke-virtual {v0, v9}, Lcom/flyco/tablayout/CommonTabLayout;->b(F)I

    move-result v9

    int-to-float v9, v9

    .line 33
    invoke-virtual {v7, v8, v9}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v8

    iput v8, v0, Lcom/flyco/tablayout/CommonTabLayout;->r:F

    .line 34
    sget v8, Lcom/flyco/tablayout/R$styleable;->CommonTabLayout_tl_indicator_width:I

    iget v9, v0, Lcom/flyco/tablayout/CommonTabLayout;->m:I

    const/high16 v13, 0x41200000    # 10.0f

    const/high16 v14, -0x40800000    # -1.0f

    if-ne v9, v4, :cond_3

    move v9, v13

    goto :goto_3

    :cond_3
    move v9, v14

    :goto_3
    invoke-virtual {v0, v9}, Lcom/flyco/tablayout/CommonTabLayout;->b(F)I

    move-result v9

    int-to-float v9, v9

    invoke-virtual {v7, v8, v9}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v8

    iput v8, v0, Lcom/flyco/tablayout/CommonTabLayout;->s:F

    .line 35
    sget v8, Lcom/flyco/tablayout/R$styleable;->CommonTabLayout_tl_indicator_corner_radius:I

    iget v9, v0, Lcom/flyco/tablayout/CommonTabLayout;->m:I

    const/4 v15, 0x0

    if-ne v9, v11, :cond_4

    move v9, v14

    goto :goto_4

    :cond_4
    move v9, v15

    :goto_4
    invoke-virtual {v0, v9}, Lcom/flyco/tablayout/CommonTabLayout;->b(F)I

    move-result v9

    int-to-float v9, v9

    invoke-virtual {v7, v8, v9}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v8

    iput v8, v0, Lcom/flyco/tablayout/CommonTabLayout;->t:F

    .line 36
    sget v8, Lcom/flyco/tablayout/R$styleable;->CommonTabLayout_tl_indicator_margin_left:I

    invoke-virtual {v0, v15}, Lcom/flyco/tablayout/CommonTabLayout;->b(F)I

    move-result v9

    int-to-float v9, v9

    invoke-virtual {v7, v8, v9}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v8

    iput v8, v0, Lcom/flyco/tablayout/CommonTabLayout;->u:F

    .line 37
    sget v8, Lcom/flyco/tablayout/R$styleable;->CommonTabLayout_tl_indicator_margin_top:I

    iget v9, v0, Lcom/flyco/tablayout/CommonTabLayout;->m:I

    const/high16 v16, 0x40e00000    # 7.0f

    if-ne v9, v11, :cond_5

    move/from16 v9, v16

    goto :goto_5

    :cond_5
    move v9, v15

    :goto_5
    invoke-virtual {v0, v9}, Lcom/flyco/tablayout/CommonTabLayout;->b(F)I

    move-result v9

    int-to-float v9, v9

    invoke-virtual {v7, v8, v9}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v8

    iput v8, v0, Lcom/flyco/tablayout/CommonTabLayout;->v:F

    .line 38
    sget v8, Lcom/flyco/tablayout/R$styleable;->CommonTabLayout_tl_indicator_margin_right:I

    invoke-virtual {v0, v15}, Lcom/flyco/tablayout/CommonTabLayout;->b(F)I

    move-result v9

    int-to-float v9, v9

    invoke-virtual {v7, v8, v9}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v8

    iput v8, v0, Lcom/flyco/tablayout/CommonTabLayout;->w:F

    .line 39
    sget v8, Lcom/flyco/tablayout/R$styleable;->CommonTabLayout_tl_indicator_margin_bottom:I

    iget v9, v0, Lcom/flyco/tablayout/CommonTabLayout;->m:I

    if-ne v9, v11, :cond_6

    move/from16 v9, v16

    goto :goto_6

    :cond_6
    move v9, v15

    :goto_6
    invoke-virtual {v0, v9}, Lcom/flyco/tablayout/CommonTabLayout;->b(F)I

    move-result v9

    int-to-float v9, v9

    invoke-virtual {v7, v8, v9}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v8

    iput v8, v0, Lcom/flyco/tablayout/CommonTabLayout;->x:F

    .line 40
    sget v8, Lcom/flyco/tablayout/R$styleable;->CommonTabLayout_tl_indicator_anim_enable:I

    invoke-virtual {v7, v8, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v8

    iput-boolean v8, v0, Lcom/flyco/tablayout/CommonTabLayout;->z:Z

    .line 41
    sget v8, Lcom/flyco/tablayout/R$styleable;->CommonTabLayout_tl_indicator_bounce_enable:I

    invoke-virtual {v7, v8, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v8

    iput-boolean v8, v0, Lcom/flyco/tablayout/CommonTabLayout;->A:Z

    .line 42
    sget v8, Lcom/flyco/tablayout/R$styleable;->CommonTabLayout_tl_indicator_anim_duration:I

    invoke-virtual {v7, v8, v12}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v8

    int-to-long v8, v8

    iput-wide v8, v0, Lcom/flyco/tablayout/CommonTabLayout;->y:J

    .line 43
    sget v8, Lcom/flyco/tablayout/R$styleable;->CommonTabLayout_tl_indicator_gravity:I

    const/16 v9, 0x50

    invoke-virtual {v7, v8, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v8

    iput v8, v0, Lcom/flyco/tablayout/CommonTabLayout;->B:I

    .line 44
    sget v8, Lcom/flyco/tablayout/R$styleable;->CommonTabLayout_tl_underline_color:I

    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v11

    invoke-virtual {v7, v8, v11}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v8

    iput v8, v0, Lcom/flyco/tablayout/CommonTabLayout;->C:I

    .line 45
    sget v8, Lcom/flyco/tablayout/R$styleable;->CommonTabLayout_tl_underline_height:I

    invoke-virtual {v0, v15}, Lcom/flyco/tablayout/CommonTabLayout;->b(F)I

    move-result v11

    int-to-float v11, v11

    invoke-virtual {v7, v8, v11}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v8

    iput v8, v0, Lcom/flyco/tablayout/CommonTabLayout;->D:F

    .line 46
    sget v8, Lcom/flyco/tablayout/R$styleable;->CommonTabLayout_tl_underline_gravity:I

    invoke-virtual {v7, v8, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v8

    iput v8, v0, Lcom/flyco/tablayout/CommonTabLayout;->E:I

    .line 47
    sget v8, Lcom/flyco/tablayout/R$styleable;->CommonTabLayout_tl_divider_color:I

    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    invoke-virtual {v7, v8, v9}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v8

    iput v8, v0, Lcom/flyco/tablayout/CommonTabLayout;->F:I

    .line 48
    sget v8, Lcom/flyco/tablayout/R$styleable;->CommonTabLayout_tl_divider_width:I

    invoke-virtual {v0, v15}, Lcom/flyco/tablayout/CommonTabLayout;->b(F)I

    move-result v9

    int-to-float v9, v9

    invoke-virtual {v7, v8, v9}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v8

    iput v8, v0, Lcom/flyco/tablayout/CommonTabLayout;->G:F

    .line 49
    sget v8, Lcom/flyco/tablayout/R$styleable;->CommonTabLayout_tl_divider_padding:I

    const/high16 v9, 0x41400000    # 12.0f

    invoke-virtual {v0, v9}, Lcom/flyco/tablayout/CommonTabLayout;->b(F)I

    move-result v9

    int-to-float v9, v9

    invoke-virtual {v7, v8, v9}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v8

    iput v8, v0, Lcom/flyco/tablayout/CommonTabLayout;->H:F

    .line 50
    sget v8, Lcom/flyco/tablayout/R$styleable;->CommonTabLayout_tl_textsize:I

    .line 51
    iget-object v9, v0, Lcom/flyco/tablayout/CommonTabLayout;->a:Landroid/content/Context;

    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v9

    iget v9, v9, Landroid/util/DisplayMetrics;->scaledDensity:F

    const/high16 v11, 0x41500000    # 13.0f

    mul-float/2addr v11, v9

    const/high16 v9, 0x3f000000    # 0.5f

    add-float/2addr v11, v9

    float-to-int v9, v11

    int-to-float v9, v9

    .line 52
    invoke-virtual {v7, v8, v9}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v8

    iput v8, v0, Lcom/flyco/tablayout/CommonTabLayout;->I:F

    .line 53
    sget v8, Lcom/flyco/tablayout/R$styleable;->CommonTabLayout_tl_textSelectColor:I

    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    invoke-virtual {v7, v8, v9}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v8

    iput v8, v0, Lcom/flyco/tablayout/CommonTabLayout;->J:I

    .line 54
    sget v8, Lcom/flyco/tablayout/R$styleable;->CommonTabLayout_tl_textUnselectColor:I

    const-string v9, "#AAffffff"

    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    invoke-virtual {v7, v8, v9}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v8

    iput v8, v0, Lcom/flyco/tablayout/CommonTabLayout;->K:I

    .line 55
    sget v8, Lcom/flyco/tablayout/R$styleable;->CommonTabLayout_tl_textBold:I

    invoke-virtual {v7, v8, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v8

    iput v8, v0, Lcom/flyco/tablayout/CommonTabLayout;->L:I

    .line 56
    sget v8, Lcom/flyco/tablayout/R$styleable;->CommonTabLayout_tl_textAllCaps:I

    invoke-virtual {v7, v8, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v8

    iput-boolean v8, v0, Lcom/flyco/tablayout/CommonTabLayout;->M:Z

    .line 57
    sget v8, Lcom/flyco/tablayout/R$styleable;->CommonTabLayout_tl_iconVisible:I

    invoke-virtual {v7, v8, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v8

    iput-boolean v8, v0, Lcom/flyco/tablayout/CommonTabLayout;->N:Z

    .line 58
    sget v8, Lcom/flyco/tablayout/R$styleable;->CommonTabLayout_tl_iconGravity:I

    const/16 v9, 0x30

    invoke-virtual {v7, v8, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v8

    iput v8, v0, Lcom/flyco/tablayout/CommonTabLayout;->O:I

    .line 59
    sget v8, Lcom/flyco/tablayout/R$styleable;->CommonTabLayout_tl_iconWidth:I

    invoke-virtual {v0, v15}, Lcom/flyco/tablayout/CommonTabLayout;->b(F)I

    move-result v9

    int-to-float v9, v9

    invoke-virtual {v7, v8, v9}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v8

    iput v8, v0, Lcom/flyco/tablayout/CommonTabLayout;->P:F

    .line 60
    sget v8, Lcom/flyco/tablayout/R$styleable;->CommonTabLayout_tl_iconHeight:I

    invoke-virtual {v0, v15}, Lcom/flyco/tablayout/CommonTabLayout;->b(F)I

    move-result v9

    int-to-float v9, v9

    invoke-virtual {v7, v8, v9}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v8

    iput v8, v0, Lcom/flyco/tablayout/CommonTabLayout;->Q:F

    .line 61
    sget v8, Lcom/flyco/tablayout/R$styleable;->CommonTabLayout_tl_iconMargin:I

    const/high16 v9, 0x40200000    # 2.5f

    invoke-virtual {v0, v9}, Lcom/flyco/tablayout/CommonTabLayout;->b(F)I

    move-result v9

    int-to-float v9, v9

    invoke-virtual {v7, v8, v9}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v8

    iput v8, v0, Lcom/flyco/tablayout/CommonTabLayout;->R:F

    .line 62
    sget v8, Lcom/flyco/tablayout/R$styleable;->CommonTabLayout_tl_tab_space_equal:I

    invoke-virtual {v7, v8, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    iput-boolean v4, v0, Lcom/flyco/tablayout/CommonTabLayout;->o:Z

    .line 63
    sget v4, Lcom/flyco/tablayout/R$styleable;->CommonTabLayout_tl_tab_width:I

    invoke-virtual {v0, v14}, Lcom/flyco/tablayout/CommonTabLayout;->b(F)I

    move-result v8

    int-to-float v8, v8

    invoke-virtual {v7, v4, v8}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    iput v4, v0, Lcom/flyco/tablayout/CommonTabLayout;->p:F

    .line 64
    sget v8, Lcom/flyco/tablayout/R$styleable;->CommonTabLayout_tl_tab_padding:I

    iget-boolean v9, v0, Lcom/flyco/tablayout/CommonTabLayout;->o:Z

    if-nez v9, :cond_8

    cmpl-float v4, v4, v15

    if-lez v4, :cond_7

    goto :goto_8

    :cond_7
    invoke-virtual {v0, v13}, Lcom/flyco/tablayout/CommonTabLayout;->b(F)I

    move-result v4

    :goto_7
    int-to-float v4, v4

    goto :goto_9

    :cond_8
    :goto_8
    invoke-virtual {v0, v15}, Lcom/flyco/tablayout/CommonTabLayout;->b(F)I

    move-result v4

    goto :goto_7

    :goto_9
    invoke-virtual {v7, v8, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    iput v4, v0, Lcom/flyco/tablayout/CommonTabLayout;->n:F

    .line 65
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->recycle()V

    .line 66
    const-string v4, "http://schemas.android.com/apk/res/android"

    const-string v7, "layout_height"

    invoke-interface {v2, v4, v7}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 67
    const-string v7, "-1"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    goto :goto_a

    .line 68
    :cond_9
    const-string v7, "-2"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_a

    goto :goto_a

    :cond_a
    const v4, 0x10100f5

    .line 69
    filled-new-array {v4}, [I

    move-result-object v4

    .line 70
    invoke-virtual {v1, v2, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v1

    const/4 v2, -0x2

    .line 71
    invoke-virtual {v1, v3, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 72
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 73
    :goto_a
    new-instance v1, Lb1/b;

    const/4 v2, 0x0

    .line 74
    invoke-direct {v1, v2}, Lb1/b;-><init>(I)V

    .line 75
    filled-new-array {v6, v5}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/animation/ValueAnimator;->ofObject(Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ValueAnimator;

    move-result-object v1

    iput-object v1, v0, Lcom/flyco/tablayout/CommonTabLayout;->S:Landroid/animation/ValueAnimator;

    .line 76
    invoke-virtual {v1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->c:Landroid/widget/LinearLayout;

    .line 2
    .line 3
    iget v1, p0, Lcom/flyco/tablayout/CommonTabLayout;->d:I

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
    move-result v2

    .line 18
    int-to-float v2, v2

    .line 19
    float-to-int v1, v1

    .line 20
    iget-object v3, p0, Lcom/flyco/tablayout/CommonTabLayout;->g:Landroid/graphics/Rect;

    .line 21
    .line 22
    iput v1, v3, Landroid/graphics/Rect;->left:I

    .line 23
    .line 24
    float-to-int v1, v2

    .line 25
    iput v1, v3, Landroid/graphics/Rect;->right:I

    .line 26
    .line 27
    iget v1, p0, Lcom/flyco/tablayout/CommonTabLayout;->s:F

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    cmpg-float v1, v1, v2

    .line 31
    .line 32
    if-gez v1, :cond_0

    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    int-to-float v1, v1

    .line 40
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    int-to-float v0, v0

    .line 45
    iget v2, p0, Lcom/flyco/tablayout/CommonTabLayout;->s:F

    .line 46
    .line 47
    const/high16 v4, 0x40000000    # 2.0f

    .line 48
    .line 49
    invoke-static {v0, v2, v4, v1}, Landroidx/collection/a;->a(FFFF)F

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    float-to-int v0, v0

    .line 54
    iput v0, v3, Landroid/graphics/Rect;->left:I

    .line 55
    .line 56
    int-to-float v0, v0

    .line 57
    add-float/2addr v0, v2

    .line 58
    float-to-int v0, v0

    .line 59
    iput v0, v3, Landroid/graphics/Rect;->right:I

    .line 60
    .line 61
    return-void
.end method

.method public final b(F)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->a:Landroid/content/Context;

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

.method public final c()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->c:Landroid/widget/LinearLayout;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->b:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    iput v1, p0, Lcom/flyco/tablayout/CommonTabLayout;->f:I

    .line 13
    .line 14
    if-lez v1, :cond_3

    .line 15
    .line 16
    iget v1, p0, Lcom/flyco/tablayout/CommonTabLayout;->O:I

    .line 17
    .line 18
    const/4 v2, 0x3

    .line 19
    iget-object v3, p0, Lcom/flyco/tablayout/CommonTabLayout;->a:Landroid/content/Context;

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    if-eq v1, v2, :cond_2

    .line 23
    .line 24
    const/4 v2, 0x5

    .line 25
    if-eq v1, v2, :cond_1

    .line 26
    .line 27
    const/16 v2, 0x50

    .line 28
    .line 29
    if-ne v1, v2, :cond_0

    .line 30
    .line 31
    sget v1, Lcom/flyco/tablayout/R$layout;->layout_tab_bottom:I

    .line 32
    .line 33
    invoke-static {v3, v1, v4}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    sget v1, Lcom/flyco/tablayout/R$layout;->layout_tab_top:I

    .line 39
    .line 40
    invoke-static {v3, v1, v4}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    sget v1, Lcom/flyco/tablayout/R$layout;->layout_tab_right:I

    .line 46
    .line 47
    invoke-static {v3, v1, v4}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    goto :goto_0

    .line 52
    :cond_2
    sget v1, Lcom/flyco/tablayout/R$layout;->layout_tab_left:I

    .line 53
    .line 54
    invoke-static {v3, v1, v4}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    :goto_0
    const/4 v2, 0x0

    .line 59
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-virtual {v1, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    sget v3, Lcom/flyco/tablayout/R$id;->tv_tab_title:I

    .line 67
    .line 68
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    check-cast v1, Landroid/widget/TextView;

    .line 73
    .line 74
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    new-instance v0, Ljava/lang/ClassCastException;

    .line 82
    .line 83
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 84
    .line 85
    .line 86
    throw v0

    .line 87
    :cond_3
    invoke-virtual {p0}, Lcom/flyco/tablayout/CommonTabLayout;->e()V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public final d(I)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->f:I

    .line 2
    .line 3
    if-lez v0, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->c:Landroid/widget/LinearLayout;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move p1, v1

    .line 17
    :goto_0
    sget v2, Lcom/flyco/tablayout/R$id;->tv_tab_title:I

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Landroid/widget/TextView;

    .line 24
    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    iget v3, p0, Lcom/flyco/tablayout/CommonTabLayout;->J:I

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    iget v3, p0, Lcom/flyco/tablayout/CommonTabLayout;->K:I

    .line 31
    .line 32
    :goto_1
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 33
    .line 34
    .line 35
    sget v2, Lcom/flyco/tablayout/R$id;->iv_tab_icon:I

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Landroid/widget/ImageView;

    .line 42
    .line 43
    iget-object v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->b:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    const/4 v0, 0x0

    .line 52
    throw v0

    .line 53
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 54
    .line 55
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_3
    return-void
.end method

.method public final e()V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget v2, p0, Lcom/flyco/tablayout/CommonTabLayout;->f:I

    .line 4
    .line 5
    if-ge v1, v2, :cond_6

    .line 6
    .line 7
    iget-object v2, p0, Lcom/flyco/tablayout/CommonTabLayout;->c:Landroid/widget/LinearLayout;

    .line 8
    .line 9
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget v3, p0, Lcom/flyco/tablayout/CommonTabLayout;->n:F

    .line 14
    .line 15
    float-to-int v3, v3

    .line 16
    invoke-virtual {v2, v3, v0, v3, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 17
    .line 18
    .line 19
    sget v3, Lcom/flyco/tablayout/R$id;->tv_tab_title:I

    .line 20
    .line 21
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Landroid/widget/TextView;

    .line 26
    .line 27
    iget v4, p0, Lcom/flyco/tablayout/CommonTabLayout;->d:I

    .line 28
    .line 29
    if-ne v1, v4, :cond_0

    .line 30
    .line 31
    iget v4, p0, Lcom/flyco/tablayout/CommonTabLayout;->J:I

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    iget v4, p0, Lcom/flyco/tablayout/CommonTabLayout;->K:I

    .line 35
    .line 36
    :goto_1
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 37
    .line 38
    .line 39
    iget v4, p0, Lcom/flyco/tablayout/CommonTabLayout;->I:F

    .line 40
    .line 41
    invoke-virtual {v3, v0, v4}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 42
    .line 43
    .line 44
    iget-boolean v4, p0, Lcom/flyco/tablayout/CommonTabLayout;->M:Z

    .line 45
    .line 46
    if-eqz v4, :cond_1

    .line 47
    .line 48
    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-virtual {v4}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    iget v4, p0, Lcom/flyco/tablayout/CommonTabLayout;->L:I

    .line 64
    .line 65
    const/4 v5, 0x2

    .line 66
    if-ne v4, v5, :cond_2

    .line 67
    .line 68
    invoke-virtual {v3}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    const/4 v4, 0x1

    .line 73
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 74
    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_2
    if-nez v4, :cond_3

    .line 78
    .line 79
    invoke-virtual {v3}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-virtual {v3, v0}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 84
    .line 85
    .line 86
    :cond_3
    :goto_2
    sget v3, Lcom/flyco/tablayout/R$id;->iv_tab_icon:I

    .line 87
    .line 88
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    check-cast v2, Landroid/widget/ImageView;

    .line 93
    .line 94
    iget-boolean v3, p0, Lcom/flyco/tablayout/CommonTabLayout;->N:Z

    .line 95
    .line 96
    if-eqz v3, :cond_5

    .line 97
    .line 98
    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 99
    .line 100
    .line 101
    iget-object v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->b:Ljava/util/ArrayList;

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    if-nez v0, :cond_4

    .line 108
    .line 109
    iget v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->d:I

    .line 110
    .line 111
    const/4 v2, 0x0

    .line 112
    throw v2

    .line 113
    :cond_4
    new-instance v0, Ljava/lang/ClassCastException;

    .line 114
    .line 115
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 116
    .line 117
    .line 118
    throw v0

    .line 119
    :cond_5
    const/16 v3, 0x8

    .line 120
    .line 121
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 122
    .line 123
    .line 124
    add-int/lit8 v1, v1, 0x1

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_6
    return-void
.end method

.method public getCurrentTab()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public getDividerColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->F:I

    .line 2
    .line 3
    return v0
.end method

.method public getDividerPadding()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->H:F

    .line 2
    .line 3
    return v0
.end method

.method public getDividerWidth()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->G:F

    .line 2
    .line 3
    return v0
.end method

.method public getIconGravity()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->O:I

    .line 2
    .line 3
    return v0
.end method

.method public getIconHeight()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->Q:F

    .line 2
    .line 3
    return v0
.end method

.method public getIconMargin()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->R:F

    .line 2
    .line 3
    return v0
.end method

.method public getIconWidth()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->P:F

    .line 2
    .line 3
    return v0
.end method

.method public getIndicatorAnimDuration()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->y:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getIndicatorColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->q:I

    .line 2
    .line 3
    return v0
.end method

.method public getIndicatorCornerRadius()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->t:F

    .line 2
    .line 3
    return v0
.end method

.method public getIndicatorHeight()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->r:F

    .line 2
    .line 3
    return v0
.end method

.method public getIndicatorMarginBottom()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->x:F

    .line 2
    .line 3
    return v0
.end method

.method public getIndicatorMarginLeft()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->u:F

    .line 2
    .line 3
    return v0
.end method

.method public getIndicatorMarginRight()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->w:F

    .line 2
    .line 3
    return v0
.end method

.method public getIndicatorMarginTop()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->v:F

    .line 2
    .line 3
    return v0
.end method

.method public getIndicatorStyle()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->m:I

    .line 2
    .line 3
    return v0
.end method

.method public getIndicatorWidth()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->s:F

    .line 2
    .line 3
    return v0
.end method

.method public getTabCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->f:I

    .line 2
    .line 3
    return v0
.end method

.method public getTabPadding()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->n:F

    .line 2
    .line 3
    return v0
.end method

.method public getTabWidth()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->p:F

    .line 2
    .line 3
    return v0
.end method

.method public getTextBold()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->L:I

    .line 2
    .line 3
    return v0
.end method

.method public getTextSelectColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->J:I

    .line 2
    .line 3
    return v0
.end method

.method public getTextUnselectColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->K:I

    .line 2
    .line 3
    return v0
.end method

.method public getTextsize()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->I:F

    .line 2
    .line 3
    return v0
.end method

.method public getUnderlineColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->C:I

    .line 2
    .line 3
    return v0
.end method

.method public getUnderlineHeight()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->D:F

    .line 2
    .line 3
    return v0
.end method

.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->c:Landroid/widget/LinearLayout;

    .line 2
    .line 3
    iget v1, p0, Lcom/flyco/tablayout/CommonTabLayout;->d:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lb1/a;

    .line 14
    .line 15
    iget v1, p1, Lb1/a;->a:F

    .line 16
    .line 17
    float-to-int v2, v1

    .line 18
    iget-object v3, p0, Lcom/flyco/tablayout/CommonTabLayout;->g:Landroid/graphics/Rect;

    .line 19
    .line 20
    iput v2, v3, Landroid/graphics/Rect;->left:I

    .line 21
    .line 22
    iget p1, p1, Lb1/a;->b:F

    .line 23
    .line 24
    float-to-int p1, p1

    .line 25
    iput p1, v3, Landroid/graphics/Rect;->right:I

    .line 26
    .line 27
    iget p1, p0, Lcom/flyco/tablayout/CommonTabLayout;->s:F

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    cmpg-float p1, p1, v2

    .line 31
    .line 32
    if-gez p1, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    int-to-float p1, p1

    .line 40
    iget v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->s:F

    .line 41
    .line 42
    const/high16 v2, 0x40000000    # 2.0f

    .line 43
    .line 44
    invoke-static {p1, v0, v2, v1}, Landroidx/collection/a;->a(FFFF)F

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    float-to-int p1, p1

    .line 49
    iput p1, v3, Landroid/graphics/Rect;->left:I

    .line 50
    .line 51
    int-to-float p1, p1

    .line 52
    add-float/2addr p1, v0

    .line 53
    float-to-int p1, p1

    .line 54
    iput p1, v3, Landroid/graphics/Rect;->right:I

    .line 55
    .line 56
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 13

    .line 1
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_c

    .line 9
    .line 10
    iget v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->f:I

    .line 11
    .line 12
    if-gtz v0, :cond_0

    .line 13
    .line 14
    goto/16 :goto_4

    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 17
    .line 18
    .line 19
    move-result v6

    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 21
    .line 22
    .line 23
    move-result v7

    .line 24
    iget v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->G:F

    .line 25
    .line 26
    const/4 v8, 0x0

    .line 27
    cmpl-float v1, v0, v8

    .line 28
    .line 29
    const/4 v9, 0x0

    .line 30
    iget-object v10, p0, Lcom/flyco/tablayout/CommonTabLayout;->c:Landroid/widget/LinearLayout;

    .line 31
    .line 32
    const/4 v11, 0x1

    .line 33
    if-lez v1, :cond_1

    .line 34
    .line 35
    iget-object v5, p0, Lcom/flyco/tablayout/CommonTabLayout;->j:Landroid/graphics/Paint;

    .line 36
    .line 37
    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 38
    .line 39
    .line 40
    iget v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->F:I

    .line 41
    .line 42
    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 43
    .line 44
    .line 45
    move v12, v9

    .line 46
    :goto_0
    iget v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->f:I

    .line 47
    .line 48
    sub-int/2addr v0, v11

    .line 49
    if-ge v12, v0, :cond_1

    .line 50
    .line 51
    invoke-virtual {v10, v12}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    add-int/2addr v1, v7

    .line 60
    int-to-float v1, v1

    .line 61
    iget v2, p0, Lcom/flyco/tablayout/CommonTabLayout;->H:F

    .line 62
    .line 63
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    add-int/2addr v0, v7

    .line 68
    int-to-float v3, v0

    .line 69
    int-to-float v0, v6

    .line 70
    iget v4, p0, Lcom/flyco/tablayout/CommonTabLayout;->H:F

    .line 71
    .line 72
    sub-float v4, v0, v4

    .line 73
    .line 74
    move-object v0, p1

    .line 75
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 76
    .line 77
    .line 78
    add-int/lit8 v12, v12, 0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    iget v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->D:F

    .line 82
    .line 83
    cmpl-float v0, v0, v8

    .line 84
    .line 85
    const/16 v12, 0x50

    .line 86
    .line 87
    if-lez v0, :cond_3

    .line 88
    .line 89
    iget v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->C:I

    .line 90
    .line 91
    iget-object v5, p0, Lcom/flyco/tablayout/CommonTabLayout;->i:Landroid/graphics/Paint;

    .line 92
    .line 93
    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 94
    .line 95
    .line 96
    iget v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->E:I

    .line 97
    .line 98
    if-ne v0, v12, :cond_2

    .line 99
    .line 100
    int-to-float v1, v7

    .line 101
    int-to-float v4, v6

    .line 102
    iget v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->D:F

    .line 103
    .line 104
    sub-float v2, v4, v0

    .line 105
    .line 106
    invoke-virtual {v10}, Landroid/view/View;->getWidth()I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    add-int/2addr v0, v7

    .line 111
    int-to-float v3, v0

    .line 112
    move-object v0, p1

    .line 113
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_2
    int-to-float v1, v7

    .line 118
    invoke-virtual {v10}, Landroid/view/View;->getWidth()I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    add-int/2addr v0, v7

    .line 123
    int-to-float v3, v0

    .line 124
    iget v4, p0, Lcom/flyco/tablayout/CommonTabLayout;->D:F

    .line 125
    .line 126
    const/4 v2, 0x0

    .line 127
    move-object v0, p1

    .line 128
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 129
    .line 130
    .line 131
    :cond_3
    :goto_1
    iget-boolean v1, p0, Lcom/flyco/tablayout/CommonTabLayout;->z:Z

    .line 132
    .line 133
    if-eqz v1, :cond_4

    .line 134
    .line 135
    iget-boolean v1, p0, Lcom/flyco/tablayout/CommonTabLayout;->U:Z

    .line 136
    .line 137
    if-eqz v1, :cond_5

    .line 138
    .line 139
    iput-boolean v9, p0, Lcom/flyco/tablayout/CommonTabLayout;->U:Z

    .line 140
    .line 141
    invoke-virtual {p0}, Lcom/flyco/tablayout/CommonTabLayout;->a()V

    .line 142
    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_4
    invoke-virtual {p0}, Lcom/flyco/tablayout/CommonTabLayout;->a()V

    .line 146
    .line 147
    .line 148
    :cond_5
    :goto_2
    iget v1, p0, Lcom/flyco/tablayout/CommonTabLayout;->m:I

    .line 149
    .line 150
    const/4 v2, 0x2

    .line 151
    iget-object v3, p0, Lcom/flyco/tablayout/CommonTabLayout;->g:Landroid/graphics/Rect;

    .line 152
    .line 153
    if-ne v1, v11, :cond_6

    .line 154
    .line 155
    iget v1, p0, Lcom/flyco/tablayout/CommonTabLayout;->r:F

    .line 156
    .line 157
    cmpl-float v1, v1, v8

    .line 158
    .line 159
    if-lez v1, :cond_c

    .line 160
    .line 161
    iget v1, p0, Lcom/flyco/tablayout/CommonTabLayout;->q:I

    .line 162
    .line 163
    iget-object v4, p0, Lcom/flyco/tablayout/CommonTabLayout;->k:Landroid/graphics/Paint;

    .line 164
    .line 165
    invoke-virtual {v4, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 166
    .line 167
    .line 168
    iget-object v1, p0, Lcom/flyco/tablayout/CommonTabLayout;->l:Landroid/graphics/Path;

    .line 169
    .line 170
    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    .line 171
    .line 172
    .line 173
    iget v5, v3, Landroid/graphics/Rect;->left:I

    .line 174
    .line 175
    add-int/2addr v5, v7

    .line 176
    int-to-float v5, v5

    .line 177
    int-to-float v6, v6

    .line 178
    invoke-virtual {v1, v5, v6}, Landroid/graphics/Path;->moveTo(FF)V

    .line 179
    .line 180
    .line 181
    iget v5, v3, Landroid/graphics/Rect;->left:I

    .line 182
    .line 183
    div-int/2addr v5, v2

    .line 184
    add-int/2addr v5, v7

    .line 185
    iget v8, v3, Landroid/graphics/Rect;->right:I

    .line 186
    .line 187
    div-int/2addr v8, v2

    .line 188
    add-int/2addr v8, v5

    .line 189
    int-to-float v2, v8

    .line 190
    iget v5, p0, Lcom/flyco/tablayout/CommonTabLayout;->r:F

    .line 191
    .line 192
    sub-float v5, v6, v5

    .line 193
    .line 194
    invoke-virtual {v1, v2, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 195
    .line 196
    .line 197
    iget v2, v3, Landroid/graphics/Rect;->right:I

    .line 198
    .line 199
    add-int/2addr v7, v2

    .line 200
    int-to-float v2, v7

    .line 201
    invoke-virtual {v1, v2, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v1}, Landroid/graphics/Path;->close()V

    .line 205
    .line 206
    .line 207
    invoke-virtual {p1, v1, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 208
    .line 209
    .line 210
    return-void

    .line 211
    :cond_6
    iget-object v4, p0, Lcom/flyco/tablayout/CommonTabLayout;->h:Landroid/graphics/drawable/GradientDrawable;

    .line 212
    .line 213
    if-ne v1, v2, :cond_a

    .line 214
    .line 215
    iget v1, p0, Lcom/flyco/tablayout/CommonTabLayout;->r:F

    .line 216
    .line 217
    cmpg-float v1, v1, v8

    .line 218
    .line 219
    if-gez v1, :cond_7

    .line 220
    .line 221
    int-to-float v1, v6

    .line 222
    iget v2, p0, Lcom/flyco/tablayout/CommonTabLayout;->v:F

    .line 223
    .line 224
    sub-float/2addr v1, v2

    .line 225
    iget v2, p0, Lcom/flyco/tablayout/CommonTabLayout;->x:F

    .line 226
    .line 227
    sub-float/2addr v1, v2

    .line 228
    iput v1, p0, Lcom/flyco/tablayout/CommonTabLayout;->r:F

    .line 229
    .line 230
    :cond_7
    iget v1, p0, Lcom/flyco/tablayout/CommonTabLayout;->r:F

    .line 231
    .line 232
    cmpl-float v2, v1, v8

    .line 233
    .line 234
    if-lez v2, :cond_c

    .line 235
    .line 236
    iget v2, p0, Lcom/flyco/tablayout/CommonTabLayout;->t:F

    .line 237
    .line 238
    cmpg-float v5, v2, v8

    .line 239
    .line 240
    const/high16 v6, 0x40000000    # 2.0f

    .line 241
    .line 242
    if-ltz v5, :cond_8

    .line 243
    .line 244
    div-float v5, v1, v6

    .line 245
    .line 246
    cmpl-float v2, v2, v5

    .line 247
    .line 248
    if-lez v2, :cond_9

    .line 249
    .line 250
    :cond_8
    div-float/2addr v1, v6

    .line 251
    iput v1, p0, Lcom/flyco/tablayout/CommonTabLayout;->t:F

    .line 252
    .line 253
    :cond_9
    iget v1, p0, Lcom/flyco/tablayout/CommonTabLayout;->q:I

    .line 254
    .line 255
    invoke-virtual {v4, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 256
    .line 257
    .line 258
    iget v1, p0, Lcom/flyco/tablayout/CommonTabLayout;->u:F

    .line 259
    .line 260
    float-to-int v1, v1

    .line 261
    add-int/2addr v1, v7

    .line 262
    iget v2, v3, Landroid/graphics/Rect;->left:I

    .line 263
    .line 264
    add-int/2addr v1, v2

    .line 265
    iget v2, p0, Lcom/flyco/tablayout/CommonTabLayout;->v:F

    .line 266
    .line 267
    float-to-int v5, v2

    .line 268
    iget v3, v3, Landroid/graphics/Rect;->right:I

    .line 269
    .line 270
    add-int/2addr v7, v3

    .line 271
    int-to-float v3, v7

    .line 272
    iget v6, p0, Lcom/flyco/tablayout/CommonTabLayout;->w:F

    .line 273
    .line 274
    sub-float/2addr v3, v6

    .line 275
    float-to-int v3, v3

    .line 276
    iget v6, p0, Lcom/flyco/tablayout/CommonTabLayout;->r:F

    .line 277
    .line 278
    add-float/2addr v2, v6

    .line 279
    float-to-int v2, v2

    .line 280
    invoke-virtual {v4, v1, v5, v3, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 281
    .line 282
    .line 283
    iget v1, p0, Lcom/flyco/tablayout/CommonTabLayout;->t:F

    .line 284
    .line 285
    invoke-virtual {v4, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v4, p1}, Landroid/graphics/drawable/GradientDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 289
    .line 290
    .line 291
    return-void

    .line 292
    :cond_a
    iget v1, p0, Lcom/flyco/tablayout/CommonTabLayout;->r:F

    .line 293
    .line 294
    cmpl-float v1, v1, v8

    .line 295
    .line 296
    if-lez v1, :cond_c

    .line 297
    .line 298
    iget v1, p0, Lcom/flyco/tablayout/CommonTabLayout;->q:I

    .line 299
    .line 300
    invoke-virtual {v4, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 301
    .line 302
    .line 303
    iget v1, p0, Lcom/flyco/tablayout/CommonTabLayout;->B:I

    .line 304
    .line 305
    if-ne v1, v12, :cond_b

    .line 306
    .line 307
    iget v1, p0, Lcom/flyco/tablayout/CommonTabLayout;->u:F

    .line 308
    .line 309
    float-to-int v1, v1

    .line 310
    add-int/2addr v1, v7

    .line 311
    iget v2, v3, Landroid/graphics/Rect;->left:I

    .line 312
    .line 313
    add-int/2addr v1, v2

    .line 314
    iget v2, p0, Lcom/flyco/tablayout/CommonTabLayout;->r:F

    .line 315
    .line 316
    float-to-int v2, v2

    .line 317
    sub-int v2, v6, v2

    .line 318
    .line 319
    iget v5, p0, Lcom/flyco/tablayout/CommonTabLayout;->x:F

    .line 320
    .line 321
    float-to-int v5, v5

    .line 322
    sub-int/2addr v2, v5

    .line 323
    iget v3, v3, Landroid/graphics/Rect;->right:I

    .line 324
    .line 325
    add-int/2addr v7, v3

    .line 326
    iget v3, p0, Lcom/flyco/tablayout/CommonTabLayout;->w:F

    .line 327
    .line 328
    float-to-int v3, v3

    .line 329
    sub-int/2addr v7, v3

    .line 330
    sub-int/2addr v6, v5

    .line 331
    invoke-virtual {v4, v1, v2, v7, v6}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 332
    .line 333
    .line 334
    goto :goto_3

    .line 335
    :cond_b
    iget v1, p0, Lcom/flyco/tablayout/CommonTabLayout;->u:F

    .line 336
    .line 337
    float-to-int v1, v1

    .line 338
    add-int/2addr v1, v7

    .line 339
    iget v2, v3, Landroid/graphics/Rect;->left:I

    .line 340
    .line 341
    add-int/2addr v1, v2

    .line 342
    iget v2, p0, Lcom/flyco/tablayout/CommonTabLayout;->v:F

    .line 343
    .line 344
    float-to-int v2, v2

    .line 345
    iget v3, v3, Landroid/graphics/Rect;->right:I

    .line 346
    .line 347
    add-int/2addr v7, v3

    .line 348
    iget v3, p0, Lcom/flyco/tablayout/CommonTabLayout;->w:F

    .line 349
    .line 350
    float-to-int v3, v3

    .line 351
    sub-int/2addr v7, v3

    .line 352
    iget v3, p0, Lcom/flyco/tablayout/CommonTabLayout;->r:F

    .line 353
    .line 354
    float-to-int v3, v3

    .line 355
    add-int/2addr v3, v2

    .line 356
    invoke-virtual {v4, v1, v2, v7, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 357
    .line 358
    .line 359
    :goto_3
    iget v1, p0, Lcom/flyco/tablayout/CommonTabLayout;->t:F

    .line 360
    .line 361
    invoke-virtual {v4, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v4, p1}, Landroid/graphics/drawable/GradientDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 365
    .line 366
    .line 367
    :cond_c
    :goto_4
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
    iput v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->d:I

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
    iget v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->d:I

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->c:Landroid/widget/LinearLayout;

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
    iget v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->d:I

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Lcom/flyco/tablayout/CommonTabLayout;->d(I)V

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
    iget v2, p0, Lcom/flyco/tablayout/CommonTabLayout;->d:I

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
    iget v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->d:I

    .line 2
    .line 3
    iput v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->e:I

    .line 4
    .line 5
    iput p1, p0, Lcom/flyco/tablayout/CommonTabLayout;->d:I

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/flyco/tablayout/CommonTabLayout;->d(I)V

    .line 8
    .line 9
    .line 10
    iget-boolean p1, p0, Lcom/flyco/tablayout/CommonTabLayout;->z:Z

    .line 11
    .line 12
    if-eqz p1, :cond_4

    .line 13
    .line 14
    iget p1, p0, Lcom/flyco/tablayout/CommonTabLayout;->d:I

    .line 15
    .line 16
    iget-object v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->c:Landroid/widget/LinearLayout;

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
    iget-object v2, p0, Lcom/flyco/tablayout/CommonTabLayout;->V:Lb1/a;

    .line 28
    .line 29
    iput v1, v2, Lb1/a;->a:F

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
    iput p1, v2, Lb1/a;->b:F

    .line 37
    .line 38
    iget p1, p0, Lcom/flyco/tablayout/CommonTabLayout;->e:I

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
    iget-object v1, p0, Lcom/flyco/tablayout/CommonTabLayout;->W:Lb1/a;

    .line 50
    .line 51
    iput v0, v1, Lb1/a;->a:F

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
    iput p1, v1, Lb1/a;->b:F

    .line 59
    .line 60
    iget v0, v1, Lb1/a;->a:F

    .line 61
    .line 62
    iget v3, v2, Lb1/a;->a:F

    .line 63
    .line 64
    cmpl-float v0, v0, v3

    .line 65
    .line 66
    if-nez v0, :cond_0

    .line 67
    .line 68
    iget v0, v2, Lb1/a;->b:F

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
    iget-object v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->S:Landroid/animation/ValueAnimator;

    .line 83
    .line 84
    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->setObjectValues([Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iget-boolean p1, p0, Lcom/flyco/tablayout/CommonTabLayout;->A:Z

    .line 88
    .line 89
    if-eqz p1, :cond_1

    .line 90
    .line 91
    iget-object p1, p0, Lcom/flyco/tablayout/CommonTabLayout;->T:Landroid/view/animation/OvershootInterpolator;

    .line 92
    .line 93
    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 94
    .line 95
    .line 96
    :cond_1
    iget-wide v1, p0, Lcom/flyco/tablayout/CommonTabLayout;->y:J

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
    iget-boolean p1, p0, Lcom/flyco/tablayout/CommonTabLayout;->A:Z

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
    iput-wide v1, p0, Lcom/flyco/tablayout/CommonTabLayout;->y:J

    .line 114
    .line 115
    :cond_3
    iget-wide v1, p0, Lcom/flyco/tablayout/CommonTabLayout;->y:J

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
    iput p1, p0, Lcom/flyco/tablayout/CommonTabLayout;->F:I

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
    invoke-virtual {p0, p1}, Lcom/flyco/tablayout/CommonTabLayout;->b(F)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    iput p1, p0, Lcom/flyco/tablayout/CommonTabLayout;->H:F

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
    invoke-virtual {p0, p1}, Lcom/flyco/tablayout/CommonTabLayout;->b(F)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    iput p1, p0, Lcom/flyco/tablayout/CommonTabLayout;->G:F

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setIconGravity(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/flyco/tablayout/CommonTabLayout;->O:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/flyco/tablayout/CommonTabLayout;->c()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setIconHeight(F)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/flyco/tablayout/CommonTabLayout;->b(F)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    iput p1, p0, Lcom/flyco/tablayout/CommonTabLayout;->Q:F

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/flyco/tablayout/CommonTabLayout;->e()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setIconMargin(F)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/flyco/tablayout/CommonTabLayout;->b(F)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    iput p1, p0, Lcom/flyco/tablayout/CommonTabLayout;->R:F

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/flyco/tablayout/CommonTabLayout;->e()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setIconVisible(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/flyco/tablayout/CommonTabLayout;->N:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/flyco/tablayout/CommonTabLayout;->e()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setIconWidth(F)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/flyco/tablayout/CommonTabLayout;->b(F)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    iput p1, p0, Lcom/flyco/tablayout/CommonTabLayout;->P:F

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/flyco/tablayout/CommonTabLayout;->e()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setIndicatorAnimDuration(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/flyco/tablayout/CommonTabLayout;->y:J

    .line 2
    .line 3
    return-void
.end method

.method public setIndicatorAnimEnable(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/flyco/tablayout/CommonTabLayout;->z:Z

    .line 2
    .line 3
    return-void
.end method

.method public setIndicatorBounceEnable(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/flyco/tablayout/CommonTabLayout;->A:Z

    .line 2
    .line 3
    return-void
.end method

.method public setIndicatorColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/flyco/tablayout/CommonTabLayout;->q:I

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
    invoke-virtual {p0, p1}, Lcom/flyco/tablayout/CommonTabLayout;->b(F)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    iput p1, p0, Lcom/flyco/tablayout/CommonTabLayout;->t:F

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setIndicatorGravity(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/flyco/tablayout/CommonTabLayout;->B:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setIndicatorHeight(F)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/flyco/tablayout/CommonTabLayout;->b(F)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    iput p1, p0, Lcom/flyco/tablayout/CommonTabLayout;->r:F

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setIndicatorStyle(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/flyco/tablayout/CommonTabLayout;->m:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setIndicatorWidth(F)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/flyco/tablayout/CommonTabLayout;->b(F)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    iput p1, p0, Lcom/flyco/tablayout/CommonTabLayout;->s:F

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

.method public setTabData(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->b:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/flyco/tablayout/CommonTabLayout;->c()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "TabEntitys can not be NULL or EMPTY !"

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1
.end method

.method public setTabPadding(F)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/flyco/tablayout/CommonTabLayout;->b(F)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    iput p1, p0, Lcom/flyco/tablayout/CommonTabLayout;->n:F

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/flyco/tablayout/CommonTabLayout;->e()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setTabSpaceEqual(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/flyco/tablayout/CommonTabLayout;->o:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/flyco/tablayout/CommonTabLayout;->e()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setTabWidth(F)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/flyco/tablayout/CommonTabLayout;->b(F)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    iput p1, p0, Lcom/flyco/tablayout/CommonTabLayout;->p:F

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/flyco/tablayout/CommonTabLayout;->e()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setTextAllCaps(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/flyco/tablayout/CommonTabLayout;->M:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/flyco/tablayout/CommonTabLayout;->e()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setTextBold(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/flyco/tablayout/CommonTabLayout;->L:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/flyco/tablayout/CommonTabLayout;->e()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setTextSelectColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/flyco/tablayout/CommonTabLayout;->J:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/flyco/tablayout/CommonTabLayout;->e()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setTextUnselectColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/flyco/tablayout/CommonTabLayout;->K:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/flyco/tablayout/CommonTabLayout;->e()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setTextsize(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/flyco/tablayout/CommonTabLayout;->a:Landroid/content/Context;

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
    iput p1, p0, Lcom/flyco/tablayout/CommonTabLayout;->I:F

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/flyco/tablayout/CommonTabLayout;->e()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public setUnderlineColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/flyco/tablayout/CommonTabLayout;->C:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setUnderlineGravity(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/flyco/tablayout/CommonTabLayout;->E:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setUnderlineHeight(F)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/flyco/tablayout/CommonTabLayout;->b(F)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    iput p1, p0, Lcom/flyco/tablayout/CommonTabLayout;->D:F

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 9
    .line 10
    .line 11
    return-void
.end method
