.class public abstract Lb/c/a/e/b/a/a/a/a;
.super Landroid/widget/RelativeLayout;
.source ""

# interfaces
.implements Lio/github/inflationx/calligraphy3/HasTypeface;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        "T:",
        "Lb/c/a/e/b/a/a/a/a<",
        "TE;TT;>;>",
        "Landroid/widget/RelativeLayout;",
        "Lio/github/inflationx/calligraphy3/HasTypeface;"
    }
.end annotation


# instance fields
.field public b:Ljava/util/concurrent/ScheduledExecutorService;

.field public c:Landroid/content/Context;

.field public d:Landroid/util/DisplayMetrics;

.field public e:La/t/a/b;

.field public f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TE;>;"
        }
    .end annotation
.end field

.field public g:J

.field public h:J

.field public i:Z

.field public j:Z

.field public k:I

.field public l:I

.field public m:Landroid/widget/LinearLayout;

.field public n:Z

.field public o:Landroid/widget/LinearLayout;

.field public p:Landroid/widget/TextView;

.field public q:Z

.field public r:F

.field public s:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {p0 .. p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v0, Lb/c/a/e/b/a/a/a/a;->f:Ljava/util/List;

    const/4 v3, 0x1

    iput-boolean v3, v0, Lb/c/a/e/b/a/a/a/a;->q:Z

    new-instance v4, Landroid/os/Handler;

    new-instance v5, Lb/c/a/e/b/a/a/a/a$a;

    invoke-direct {v5, v0}, Lb/c/a/e/b/a/a/a/a$a;-><init>(Lb/c/a/e/b/a/a/a/a;)V

    invoke-direct {v4, v5}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object v4, v0, Lb/c/a/e/b/a/a/a/a;->s:Landroid/os/Handler;

    .line 1
    iput-object v1, v0, Lb/c/a/e/b/a/a/a/a;->c:Landroid/content/Context;

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    iput-object v4, v0, Lb/c/a/e/b/a/a/a/a;->d:Landroid/util/DisplayMetrics;

    sget-object v4, Lb/c/a/b;->a:[I

    invoke-virtual {v1, v2, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v4

    const/16 v5, 0xd

    const/high16 v6, -0x40800000    # -1.0f

    invoke-virtual {v4, v5, v6}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v5

    iput v5, v0, Lb/c/a/e/b/a/a/a/a;->r:F

    const/16 v5, 0xa

    invoke-virtual {v4, v5, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v5

    const/4 v6, 0x5

    invoke-virtual {v4, v6, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    int-to-long v7, v7

    iput-wide v7, v0, Lb/c/a/e/b/a/a/a/a;->g:J

    const/16 v7, 0xc

    invoke-virtual {v4, v7, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v8

    int-to-long v8, v8

    iput-wide v8, v0, Lb/c/a/e/b/a/a/a/a;->h:J

    const/4 v8, 0x7

    invoke-virtual {v4, v8, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v8

    iput-boolean v8, v0, Lb/c/a/e/b/a/a/a/a;->i:Z

    const/4 v8, 0x0

    invoke-virtual {v4, v8, v8}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v9

    const/16 v10, 0x8

    invoke-virtual {v4, v10, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v10

    iput-boolean v10, v0, Lb/c/a/e/b/a/a/a/a;->n:Z

    const/4 v10, 0x6

    const/16 v11, 0x11

    invoke-virtual {v4, v10, v11}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v10

    const/high16 v12, 0x41200000    # 10.0f

    invoke-virtual {v0, v12}, Lb/c/a/e/b/a/a/a/a;->a(F)I

    move-result v13

    int-to-float v13, v13

    const/4 v14, 0x2

    invoke-virtual {v4, v14, v13}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v13

    const/high16 v16, 0x40c00000    # 6.0f

    if-ne v10, v11, :cond_0

    move/from16 v15, v16

    goto :goto_0

    :cond_0
    const/high16 v15, 0x40000000    # 2.0f

    :goto_0
    invoke-virtual {v0, v15}, Lb/c/a/e/b/a/a/a/a;->a(F)I

    move-result v15

    int-to-float v15, v15

    const/4 v6, 0x4

    invoke-virtual {v4, v6, v15}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v15

    invoke-virtual {v0, v12}, Lb/c/a/e/b/a/a/a/a;->a(F)I

    move-result v12

    int-to-float v12, v12

    const/4 v6, 0x3

    invoke-virtual {v4, v6, v12}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v12

    if-ne v10, v11, :cond_1

    move/from16 v6, v16

    goto :goto_1

    :cond_1
    const/high16 v6, 0x40000000    # 2.0f

    :goto_1
    invoke-virtual {v0, v6}, Lb/c/a/e/b/a/a/a/a;->a(F)I

    move-result v6

    int-to-float v6, v6

    invoke-virtual {v4, v3, v6}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v6

    const/16 v11, 0xe

    const-string v17, "#ffffff"

    invoke-static/range {v17 .. v17}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    invoke-virtual {v4, v11, v7}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v7

    const/16 v11, 0xf

    const/high16 v17, 0x41480000    # 12.5f

    .line 2
    iget-object v8, v0, Lb/c/a/e/b/a/a/a/a;->c:Landroid/content/Context;

    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v8

    iget v8, v8, Landroid/util/DisplayMetrics;->scaledDensity:F

    mul-float v8, v8, v17

    .line 3
    invoke-virtual {v4, v11, v8}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v8

    const/16 v11, 0xb

    invoke-virtual {v4, v11, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v11

    const/16 v14, 0x9

    invoke-virtual {v4, v14, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v14

    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    const-string v4, "http://schemas.android.com/apk/res/android"

    const-string v3, "layout_height"

    invoke-interface {v2, v4, v3}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v5, :cond_2

    new-instance v4, Lb/c/a/e/b/a/b/b;

    invoke-direct {v4, v1}, Lb/c/a/e/b/a/b/b;-><init>(Landroid/content/Context;)V

    goto :goto_2

    :cond_2
    new-instance v4, La/t/a/b;

    invoke-direct {v4, v1}, La/t/a/b;-><init>(Landroid/content/Context;)V

    :goto_2
    iput-object v4, v0, Lb/c/a/e/b/a/a/a/a;->e:La/t/a/b;

    const/4 v5, 0x2

    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->setOverScrollMode(I)V

    iget-object v4, v0, Lb/c/a/e/b/a/a/a/a;->d:Landroid/util/DisplayMetrics;

    iget v4, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v4, v0, Lb/c/a/e/b/a/a/a/a;->k:I

    iget v5, v0, Lb/c/a/e/b/a/a/a/a;->r:F

    const/16 v17, 0x0

    cmpg-float v17, v5, v17

    move/from16 v18, v10

    const/4 v10, -0x2

    if-gez v17, :cond_5

    const-string v4, "-1"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/4 v3, -0x1

    goto :goto_3

    :cond_3
    const-string v4, "-2"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    iput v10, v0, Lb/c/a/e/b/a/a/a/a;->l:I

    goto :goto_4

    :cond_4
    const/4 v3, 0x1

    new-array v4, v3, [I

    const v3, 0x10100f5

    const/4 v5, 0x0

    aput v3, v4, v5

    invoke-virtual {v1, v2, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    invoke-virtual {v2, v5, v10}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    :goto_3
    iput v3, v0, Lb/c/a/e/b/a/a/a/a;->l:I

    goto :goto_4

    :cond_5
    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v3, v5, v2

    if-lez v3, :cond_6

    iput v2, v0, Lb/c/a/e/b/a/a/a/a;->r:F

    :cond_6
    int-to-float v2, v4

    iget v3, v0, Lb/c/a/e/b/a/a/a/a;->r:F

    mul-float/2addr v2, v3

    float-to-int v2, v2

    iput v2, v0, Lb/c/a/e/b/a/a/a/a;->l:I

    :goto_4
    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    iget v3, v0, Lb/c/a/e/b/a/a/a/a;->k:I

    iget v4, v0, Lb/c/a/e/b/a/a/a/a;->l:I

    invoke-direct {v2, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    iget-object v3, v0, Lb/c/a/e/b/a/a/a/a;->e:La/t/a/b;

    invoke-virtual {v0, v3, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v3, Landroid/widget/RelativeLayout;

    invoke-direct {v3, v1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v3, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v2, v0, Lb/c/a/e/b/a/a/a/a;->m:Landroid/widget/LinearLayout;

    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    iget v4, v0, Lb/c/a/e/b/a/a/a/a;->k:I

    invoke-direct {v2, v4, v10}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/4 v4, -0x1

    const/16 v5, 0xc

    invoke-virtual {v2, v5, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    iget-object v4, v0, Lb/c/a/e/b/a/a/a/a;->m:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v4, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v2, v0, Lb/c/a/e/b/a/a/a/a;->m:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v9}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    iget-object v2, v0, Lb/c/a/e/b/a/a/a/a;->m:Landroid/widget/LinearLayout;

    float-to-int v3, v13

    float-to-int v4, v15

    float-to-int v5, v12

    float-to-int v6, v6

    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    iget-object v2, v0, Lb/c/a/e/b/a/a/a/a;->m:Landroid/widget/LinearLayout;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setClipChildren(Z)V

    iget-object v2, v0, Lb/c/a/e/b/a/a/a/a;->m:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setClipToPadding(Z)V

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v2, v0, Lb/c/a/e/b/a/a/a/a;->o:Landroid/widget/LinearLayout;

    const/16 v4, 0x11

    invoke-virtual {v2, v4}, Landroid/widget/LinearLayout;->setGravity(I)V

    iget-object v2, v0, Lb/c/a/e/b/a/a/a/a;->o:Landroid/widget/LinearLayout;

    if-eqz v14, :cond_7

    move v4, v3

    goto :goto_5

    :cond_7
    const/4 v4, 0x4

    :goto_5
    invoke-virtual {v2, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v2, v0, Lb/c/a/e/b/a/a/a/a;->o:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setClipChildren(Z)V

    iget-object v2, v0, Lb/c/a/e/b/a/a/a/a;->o:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setClipToPadding(Z)V

    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v2, v0, Lb/c/a/e/b/a/a/a/a;->p:Landroid/widget/TextView;

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-direct {v1, v3, v10, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v1, v0, Lb/c/a/e/b/a/a/a/a;->p:Landroid/widget/TextView;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setSingleLine(Z)V

    iget-object v1, v0, Lb/c/a/e/b/a/a/a/a;->p:Landroid/widget/TextView;

    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v1, v0, Lb/c/a/e/b/a/a/a/a;->p:Landroid/widget/TextView;

    invoke-virtual {v1, v3, v8}, Landroid/widget/TextView;->setTextSize(IF)V

    iget-object v1, v0, Lb/c/a/e/b/a/a/a/a;->p:Landroid/widget/TextView;

    if-eqz v11, :cond_8

    const/4 v6, 0x0

    goto :goto_6

    :cond_8
    const/4 v6, 0x4

    :goto_6
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setVisibility(I)V

    move/from16 v1, v18

    const/16 v2, 0x11

    if-ne v1, v2, :cond_9

    iget-object v1, v0, Lb/c/a/e/b/a/a/a/a;->m:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    iget-object v1, v0, Lb/c/a/e/b/a/a/a/a;->m:Landroid/widget/LinearLayout;

    iget-object v2, v0, Lb/c/a/e/b/a/a/a/a;->o:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto :goto_7

    :cond_9
    const/high16 v2, 0x40e00000    # 7.0f

    const/16 v3, 0x10

    const/4 v4, 0x5

    if-ne v1, v4, :cond_a

    iget-object v1, v0, Lb/c/a/e/b/a/a/a/a;->m:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    iget-object v1, v0, Lb/c/a/e/b/a/a/a/a;->m:Landroid/widget/LinearLayout;

    iget-object v3, v0, Lb/c/a/e/b/a/a/a/a;->p:Landroid/widget/TextView;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    iget-object v1, v0, Lb/c/a/e/b/a/a/a/a;->m:Landroid/widget/LinearLayout;

    iget-object v3, v0, Lb/c/a/e/b/a/a/a/a;->o:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    iget-object v1, v0, Lb/c/a/e/b/a/a/a/a;->p:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Lb/c/a/e/b/a/a/a/a;->a(F)I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v3, v2, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    iget-object v1, v0, Lb/c/a/e/b/a/a/a/a;->p:Landroid/widget/TextView;

    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    iget-object v1, v0, Lb/c/a/e/b/a/a/a/a;->p:Landroid/widget/TextView;

    const/4 v4, 0x3

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setGravity(I)V

    goto :goto_7

    :cond_a
    const/4 v4, 0x3

    if-ne v1, v4, :cond_b

    iget-object v1, v0, Lb/c/a/e/b/a/a/a/a;->m:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    iget-object v1, v0, Lb/c/a/e/b/a/a/a/a;->m:Landroid/widget/LinearLayout;

    iget-object v3, v0, Lb/c/a/e/b/a/a/a/a;->o:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    iget-object v1, v0, Lb/c/a/e/b/a/a/a/a;->m:Landroid/widget/LinearLayout;

    iget-object v3, v0, Lb/c/a/e/b/a/a/a/a;->p:Landroid/widget/TextView;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    iget-object v1, v0, Lb/c/a/e/b/a/a/a/a;->p:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Lb/c/a/e/b/a/a/a/a;->a(F)I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v3, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    iget-object v1, v0, Lb/c/a/e/b/a/a/a/a;->p:Landroid/widget/TextView;

    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    iget-object v1, v0, Lb/c/a/e/b/a/a/a/a;->p:Landroid/widget/TextView;

    const/4 v2, 0x5

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setGravity(I)V

    :cond_b
    :goto_7
    return-void
.end method


# virtual methods
.method public a(F)I
    .locals 1

    iget-object v0, p0, Lb/c/a/e/b/a/a/a/a;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr p1, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p1, v0

    float-to-int p1, p1

    return p1
.end method

.method public b()V
    .locals 8

    invoke-virtual {p0}, Lb/c/a/e/b/a/a/a/a;->c()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Lb/c/a/e/b/a/a/a/a;->j:Z

    if-eqz v0, :cond_1

    return-void

    .line 1
    :cond_1
    iget-object v0, p0, Lb/c/a/e/b/a/a/a/a;->e:La/t/a/b;

    instance-of v0, v0, Lb/c/a/e/b/a/b/b;

    if-eqz v0, :cond_2

    .line 2
    iget-boolean v0, p0, Lb/c/a/e/b/a/a/a/a;->i:Z

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lb/c/a/e/b/a/a/a/a;->d()V

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    iput-object v1, p0, Lb/c/a/e/b/a/a/a/a;->b:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v2, Lb/c/a/e/b/a/a/a/a$b;

    invoke-direct {v2, p0}, Lb/c/a/e/b/a/a/a/a$b;-><init>(Lb/c/a/e/b/a/a/a/a;)V

    iget-wide v3, p0, Lb/c/a/e/b/a/a/a/a;->g:J

    iget-wide v5, p0, Lb/c/a/e/b/a/a/a/a;->h:J

    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface/range {v1 .. v7}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lb/c/a/e/b/a/a/a/a;->j:Z

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lb/c/a/e/b/a/a/a/a;->j:Z

    :goto_0
    return-void
.end method

.method public c()Z
    .locals 3

    iget-object v0, p0, Lb/c/a/e/b/a/a/a/a;->e:La/t/a/b;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lb/c/a/e/b/a/a/a/a;->f:Ljava/util/List;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-boolean v0, p0, Lb/c/a/e/b/a/a/a/a;->q:Z

    const/4 v2, 0x1

    if-nez v0, :cond_2

    iget-object v0, p0, Lb/c/a/e/b/a/a/a/a;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eq v0, v2, :cond_3

    :cond_2
    move v1, v2

    :cond_3
    :goto_0
    return v1
.end method

.method public d()V
    .locals 1

    .line 1
    iget-object v0, p0, Lb/c/a/e/b/a/a/a/a;->b:Ljava/util/concurrent/ScheduledExecutorService;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->shutdown()V

    const/4 v0, 0x0

    iput-object v0, p0, Lb/c/a/e/b/a/a/a/a;->b:Ljava/util/concurrent/ScheduledExecutorService;

    .line 2
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lb/c/a/e/b/a/a/a/a;->j:Z

    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lb/c/a/e/b/a/a/a/a;->b()V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lb/c/a/e/b/a/a/a/a;->d()V

    :goto_0
    invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public getContainerScale()F
    .locals 1

    iget v0, p0, Lb/c/a/e/b/a/a/a/a;->r:F

    return v0
.end method

.method public getItemHeight()I
    .locals 1

    iget v0, p0, Lb/c/a/e/b/a/a/a/a;->l:I

    return v0
.end method

.method public getItemWidth()I
    .locals 1

    iget v0, p0, Lb/c/a/e/b/a/a/a/a;->k:I

    return v0
.end method

.method public getViewPager()La/t/a/b;
    .locals 1

    iget-object v0, p0, Lb/c/a/e/b/a/a/a/a;->e:La/t/a/b;

    return-object v0
.end method

.method public abstract setCurrentIndicator(I)V
.end method

.method public setTypeface(Landroid/graphics/Typeface;)V
    .locals 1

    iget-object v0, p0, Lb/c/a/e/b/a/a/a/a;->p:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_0
    return-void
.end method
