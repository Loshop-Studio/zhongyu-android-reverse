.class public Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "g"
.end annotation


# instance fields
.field public final a:I

.field public b:Landroid/view/View;

.field public c:I

.field public d:Landroid/graphics/Path;

.field public e:Landroid/graphics/Paint;

.field public f:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

.field public g:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;

.field public h:Z

.field public i:Z

.field public j:J

.field public k:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$f;

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0xf

    .line 5
    .line 6
    iput v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->a:I

    .line 7
    .line 8
    const-string v0, "#B2299EE3"

    .line 9
    .line 10
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iput v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->c:I

    .line 15
    .line 16
    sget-object v0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;->d:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    .line 17
    .line 18
    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->f:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    .line 19
    .line 20
    sget-object v0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;->b:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;

    .line 21
    .line 22
    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->g:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->i:Z

    .line 26
    .line 27
    const-wide/16 v1, 0xfa0

    .line 28
    .line 29
    iput-wide v1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->j:J

    .line 30
    .line 31
    new-instance v1, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$c;

    .line 32
    .line 33
    invoke-direct {v1}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$c;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->k:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$f;

    .line 37
    .line 38
    const/16 v1, 0x1e

    .line 39
    .line 40
    iput v1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->l:I

    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    invoke-virtual {p0, v1}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 44
    .line 45
    .line 46
    new-instance v2, Landroid/widget/TextView;

    .line 47
    .line 48
    invoke-direct {v2, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 49
    .line 50
    .line 51
    iput-object v2, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->b:Landroid/view/View;

    .line 52
    .line 53
    const/4 p1, -0x1

    .line 54
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->b:Landroid/view/View;

    .line 58
    .line 59
    const/4 v2, -0x2

    .line 60
    invoke-virtual {p0, p1, v2, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    .line 61
    .line 62
    .line 63
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->b:Landroid/view/View;

    .line 64
    .line 65
    invoke-virtual {p1, v1, v1, v1, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 66
    .line 67
    .line 68
    new-instance p1, Landroid/graphics/Paint;

    .line 69
    .line 70
    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 71
    .line 72
    .line 73
    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->e:Landroid/graphics/Paint;

    .line 74
    .line 75
    iget v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->c:I

    .line 76
    .line 77
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 78
    .line 79
    .line 80
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->e:Landroid/graphics/Paint;

    .line 81
    .line 82
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 83
    .line 84
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    sget v0, Lcom/xuexiang/xui/R$attr;->xui_tip_popup_padding_top:I

    .line 92
    .line 93
    invoke-static {p1, v0}, Lcom/xuexiang/xui/utils/g;->o(Landroid/content/Context;I)I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->n:I

    .line 98
    .line 99
    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->m:I

    .line 100
    .line 101
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    sget v0, Lcom/xuexiang/xui/R$attr;->xui_tip_popup_padding_left:I

    .line 106
    .line 107
    invoke-static {p1, v0}, Lcom/xuexiang/xui/utils/g;->o(Landroid/content/Context;I)I

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->p:I

    .line 112
    .line 113
    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->o:I

    .line 114
    .line 115
    invoke-static {}, Lo2/b;->c()Landroid/graphics/Typeface;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->setTextTypeFace(Landroid/graphics/Typeface;)V

    .line 120
    .line 121
    .line 122
    return-void
.end method

.method public static synthetic a(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;)Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$d;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
.end method

.method public static synthetic b(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;)Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$e;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
.end method

.method public static synthetic c(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->h:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic d(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->h(Landroid/graphics/Rect;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public e(Landroid/graphics/Rect;I)Z
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->f:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    .line 6
    .line 7
    sget-object v2, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;->a:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    iget v2, p1, Landroid/graphics/Rect;->left:I

    .line 17
    .line 18
    if-le v1, v2, :cond_0

    .line 19
    .line 20
    add-int/lit8 v2, v2, -0x1e

    .line 21
    .line 22
    iput v2, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->f:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    .line 26
    .line 27
    sget-object v2, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;->b:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    .line 28
    .line 29
    if-ne v1, v2, :cond_1

    .line 30
    .line 31
    iget v1, p1, Landroid/graphics/Rect;->right:I

    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    add-int/2addr v1, v2

    .line 38
    if-le v1, p2, :cond_1

    .line 39
    .line 40
    iget p1, p1, Landroid/graphics/Rect;->right:I

    .line 41
    .line 42
    sub-int/2addr p2, p1

    .line 43
    add-int/lit8 p2, p2, -0x1e

    .line 44
    .line 45
    iput p2, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->f:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    .line 49
    .line 50
    sget-object v2, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;->c:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    .line 51
    .line 52
    if-eq v1, v2, :cond_2

    .line 53
    .line 54
    sget-object v2, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;->d:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    .line 55
    .line 56
    if-ne v1, v2, :cond_4

    .line 57
    .line 58
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    sub-int/2addr v1, v2

    .line 67
    int-to-float v1, v1

    .line 68
    const/high16 v2, 0x40000000    # 2.0f

    .line 69
    .line 70
    div-float/2addr v1, v2

    .line 71
    iget v2, p1, Landroid/graphics/Rect;->right:I

    .line 72
    .line 73
    int-to-float v4, v2

    .line 74
    add-float/2addr v4, v1

    .line 75
    int-to-float p2, p2

    .line 76
    cmpl-float v4, v4, p2

    .line 77
    .line 78
    const/high16 v5, 0x41f00000    # 30.0f

    .line 79
    .line 80
    if-lez v4, :cond_3

    .line 81
    .line 82
    int-to-float v4, v2

    .line 83
    add-float/2addr v4, v1

    .line 84
    sub-float/2addr v4, p2

    .line 85
    add-float/2addr v4, v5

    .line 86
    iget p2, p1, Landroid/graphics/Rect;->left:I

    .line 87
    .line 88
    int-to-float p2, p2

    .line 89
    sub-float/2addr p2, v4

    .line 90
    float-to-int p2, p2

    .line 91
    iput p2, p1, Landroid/graphics/Rect;->left:I

    .line 92
    .line 93
    int-to-float p2, v2

    .line 94
    sub-float/2addr p2, v4

    .line 95
    float-to-int p2, p2

    .line 96
    iput p2, p1, Landroid/graphics/Rect;->right:I

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_3
    iget p2, p1, Landroid/graphics/Rect;->left:I

    .line 100
    .line 101
    int-to-float v4, p2

    .line 102
    sub-float/2addr v4, v1

    .line 103
    const/4 v6, 0x0

    .line 104
    cmpg-float v4, v4, v6

    .line 105
    .line 106
    if-gez v4, :cond_4

    .line 107
    .line 108
    int-to-float v4, p2

    .line 109
    sub-float/2addr v4, v1

    .line 110
    sub-float/2addr v6, v4

    .line 111
    add-float/2addr v6, v5

    .line 112
    int-to-float p2, p2

    .line 113
    add-float/2addr p2, v6

    .line 114
    float-to-int p2, p2

    .line 115
    iput p2, p1, Landroid/graphics/Rect;->left:I

    .line 116
    .line 117
    int-to-float p2, v2

    .line 118
    add-float/2addr p2, v6

    .line 119
    float-to-int p2, p2

    .line 120
    iput p2, p1, Landroid/graphics/Rect;->right:I

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_4
    const/4 v3, 0x0

    .line 124
    :goto_0
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 128
    .line 129
    .line 130
    return v3
.end method

.method public final f(Landroid/graphics/RectF;FFFF)Landroid/graphics/Path;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    new-instance v2, Landroid/graphics/Path;

    .line 6
    .line 7
    invoke-direct {v2}, Landroid/graphics/Path;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v3, v0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->q:Landroid/graphics/Rect;

    .line 11
    .line 12
    if-nez v3, :cond_0

    .line 13
    .line 14
    return-object v2

    .line 15
    :cond_0
    const/4 v4, 0x0

    .line 16
    cmpg-float v5, p2, v4

    .line 17
    .line 18
    if-gez v5, :cond_1

    .line 19
    .line 20
    move v5, v4

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    move/from16 v5, p2

    .line 23
    .line 24
    :goto_0
    cmpg-float v6, p3, v4

    .line 25
    .line 26
    if-gez v6, :cond_2

    .line 27
    .line 28
    move v6, v4

    .line 29
    goto :goto_1

    .line 30
    :cond_2
    move/from16 v6, p3

    .line 31
    .line 32
    :goto_1
    cmpg-float v7, p5, v4

    .line 33
    .line 34
    if-gez v7, :cond_3

    .line 35
    .line 36
    move v7, v4

    .line 37
    goto :goto_2

    .line 38
    :cond_3
    move/from16 v7, p5

    .line 39
    .line 40
    :goto_2
    cmpg-float v8, p4, v4

    .line 41
    .line 42
    if-gez v8, :cond_4

    .line 43
    .line 44
    move v8, v4

    .line 45
    goto :goto_3

    .line 46
    :cond_4
    move/from16 v8, p4

    .line 47
    .line 48
    :goto_3
    iget-object v9, v0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->f:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    .line 49
    .line 50
    sget-object v10, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;->b:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    .line 51
    .line 52
    const/high16 v11, 0x41700000    # 15.0f

    .line 53
    .line 54
    if-ne v9, v10, :cond_5

    .line 55
    .line 56
    move v12, v11

    .line 57
    goto :goto_4

    .line 58
    :cond_5
    move v12, v4

    .line 59
    :goto_4
    sget-object v13, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;->d:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    .line 60
    .line 61
    if-ne v9, v13, :cond_6

    .line 62
    .line 63
    move v14, v11

    .line 64
    goto :goto_5

    .line 65
    :cond_6
    move v14, v4

    .line 66
    :goto_5
    sget-object v15, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;->a:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    .line 67
    .line 68
    if-ne v9, v15, :cond_7

    .line 69
    .line 70
    move/from16 v16, v11

    .line 71
    .line 72
    goto :goto_6

    .line 73
    :cond_7
    move/from16 v16, v4

    .line 74
    .line 75
    :goto_6
    sget-object v4, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;->c:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    .line 76
    .line 77
    if-ne v9, v4, :cond_8

    .line 78
    .line 79
    goto :goto_7

    .line 80
    :cond_8
    const/4 v11, 0x0

    .line 81
    :goto_7
    iget v9, v1, Landroid/graphics/RectF;->left:F

    .line 82
    .line 83
    add-float/2addr v12, v9

    .line 84
    iget v9, v1, Landroid/graphics/RectF;->top:F

    .line 85
    .line 86
    add-float/2addr v14, v9

    .line 87
    iget v9, v1, Landroid/graphics/RectF;->right:F

    .line 88
    .line 89
    sub-float v9, v9, v16

    .line 90
    .line 91
    move-object/from16 v16, v3

    .line 92
    .line 93
    iget v3, v1, Landroid/graphics/RectF;->bottom:F

    .line 94
    .line 95
    sub-float/2addr v3, v11

    .line 96
    invoke-virtual/range {v16 .. v16}, Landroid/graphics/Rect;->centerX()I

    .line 97
    .line 98
    .line 99
    move-result v11

    .line 100
    int-to-float v11, v11

    .line 101
    invoke-virtual {v0}, Landroid/view/View;->getX()F

    .line 102
    .line 103
    .line 104
    move-result v16

    .line 105
    sub-float v11, v11, v16

    .line 106
    .line 107
    const/high16 v16, 0x40000000    # 2.0f

    .line 108
    .line 109
    div-float v5, v5, v16

    .line 110
    .line 111
    move/from16 p2, v5

    .line 112
    .line 113
    add-float v5, v12, p2

    .line 114
    .line 115
    invoke-virtual {v2, v5, v14}, Landroid/graphics/Path;->moveTo(FF)V

    .line 116
    .line 117
    .line 118
    move/from16 p3, v6

    .line 119
    .line 120
    iget-object v6, v0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->f:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    .line 121
    .line 122
    move/from16 p5, v7

    .line 123
    .line 124
    const/16 v7, 0xf

    .line 125
    .line 126
    if-ne v6, v13, :cond_9

    .line 127
    .line 128
    int-to-float v6, v7

    .line 129
    sub-float v13, v11, v6

    .line 130
    .line 131
    invoke-virtual {v2, v13, v14}, Landroid/graphics/Path;->lineTo(FF)V

    .line 132
    .line 133
    .line 134
    iget v13, v1, Landroid/graphics/RectF;->top:F

    .line 135
    .line 136
    invoke-virtual {v2, v11, v13}, Landroid/graphics/Path;->lineTo(FF)V

    .line 137
    .line 138
    .line 139
    add-float/2addr v6, v11

    .line 140
    invoke-virtual {v2, v6, v14}, Landroid/graphics/Path;->lineTo(FF)V

    .line 141
    .line 142
    .line 143
    :cond_9
    div-float v6, p3, v16

    .line 144
    .line 145
    sub-float v13, v9, v6

    .line 146
    .line 147
    invoke-virtual {v2, v13, v14}, Landroid/graphics/Path;->lineTo(FF)V

    .line 148
    .line 149
    .line 150
    add-float/2addr v6, v14

    .line 151
    invoke-virtual {v2, v9, v14, v9, v6}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 152
    .line 153
    .line 154
    iget-object v6, v0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->f:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    .line 155
    .line 156
    if-ne v6, v15, :cond_a

    .line 157
    .line 158
    div-float v6, v3, v16

    .line 159
    .line 160
    int-to-float v13, v7

    .line 161
    sub-float v15, v6, v13

    .line 162
    .line 163
    invoke-virtual {v2, v9, v15}, Landroid/graphics/Path;->lineTo(FF)V

    .line 164
    .line 165
    .line 166
    iget v15, v1, Landroid/graphics/RectF;->right:F

    .line 167
    .line 168
    invoke-virtual {v2, v15, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 169
    .line 170
    .line 171
    add-float/2addr v6, v13

    .line 172
    invoke-virtual {v2, v9, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 173
    .line 174
    .line 175
    :cond_a
    div-float v8, v8, v16

    .line 176
    .line 177
    sub-float v6, v3, v8

    .line 178
    .line 179
    invoke-virtual {v2, v9, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 180
    .line 181
    .line 182
    sub-float v6, v9, v8

    .line 183
    .line 184
    invoke-virtual {v2, v9, v3, v6, v3}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 185
    .line 186
    .line 187
    iget-object v6, v0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->f:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    .line 188
    .line 189
    if-ne v6, v4, :cond_b

    .line 190
    .line 191
    int-to-float v4, v7

    .line 192
    add-float v6, v11, v4

    .line 193
    .line 194
    invoke-virtual {v2, v6, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 195
    .line 196
    .line 197
    iget v6, v1, Landroid/graphics/RectF;->bottom:F

    .line 198
    .line 199
    invoke-virtual {v2, v11, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 200
    .line 201
    .line 202
    sub-float/2addr v11, v4

    .line 203
    invoke-virtual {v2, v11, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 204
    .line 205
    .line 206
    :cond_b
    div-float v4, p5, v16

    .line 207
    .line 208
    add-float v6, v12, v4

    .line 209
    .line 210
    invoke-virtual {v2, v6, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 211
    .line 212
    .line 213
    sub-float v4, v3, v4

    .line 214
    .line 215
    invoke-virtual {v2, v12, v3, v12, v4}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 216
    .line 217
    .line 218
    iget-object v4, v0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->f:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    .line 219
    .line 220
    if-ne v4, v10, :cond_c

    .line 221
    .line 222
    div-float v3, v3, v16

    .line 223
    .line 224
    int-to-float v4, v7

    .line 225
    add-float v6, v3, v4

    .line 226
    .line 227
    invoke-virtual {v2, v12, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 228
    .line 229
    .line 230
    iget v1, v1, Landroid/graphics/RectF;->left:F

    .line 231
    .line 232
    invoke-virtual {v2, v1, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 233
    .line 234
    .line 235
    sub-float/2addr v3, v4

    .line 236
    invoke-virtual {v2, v12, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 237
    .line 238
    .line 239
    :cond_c
    add-float v1, v14, p2

    .line 240
    .line 241
    invoke-virtual {v2, v12, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v2, v12, v14, v5, v14}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v2}, Landroid/graphics/Path;->close()V

    .line 248
    .line 249
    .line 250
    return-object v2
.end method

.method public g()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g$c;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g$c;-><init>(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->i:Z

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    new-instance v0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g$d;

    .line 18
    .line 19
    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g$d;-><init>(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;)V

    .line 20
    .line 21
    .line 22
    iget-wide v1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->j:J

    .line 23
    .line 24
    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public final h(Landroid/graphics/Rect;)V
    .locals 6

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->setupPosition(Landroid/graphics/Rect;)V

    .line 2
    .line 3
    .line 4
    new-instance v1, Landroid/graphics/RectF;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    int-to-float p1, p1

    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    int-to-float v0, v0

    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-direct {v1, v2, v2, p1, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 18
    .line 19
    .line 20
    iget p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->l:I

    .line 21
    .line 22
    int-to-float v2, p1

    .line 23
    int-to-float v3, p1

    .line 24
    int-to-float v4, p1

    .line 25
    int-to-float v5, p1

    .line 26
    move-object v0, p0

    .line 27
    invoke-virtual/range {v0 .. v5}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->f(Landroid/graphics/RectF;FFFF)Landroid/graphics/Path;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, v0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->d:Landroid/graphics/Path;

    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->k()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->g()V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public i()V
    .locals 1

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g$e;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g$e;-><init>(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->l(Landroid/animation/Animator$AnimatorListener;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public j(Landroid/graphics/Rect;I)V
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->q:Landroid/graphics/Rect;

    .line 7
    .line 8
    new-instance v0, Landroid/graphics/Rect;

    .line 9
    .line 10
    invoke-direct {v0, p1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0, p2}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->e(Landroid/graphics/Rect;I)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->h(Landroid/graphics/Rect;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    new-instance p2, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g$f;

    .line 28
    .line 29
    invoke-direct {p2, p0, v0}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g$f;-><init>(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;Landroid/graphics/Rect;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public k()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->k:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$f;

    .line 2
    .line 3
    new-instance v1, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g$a;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g$a;-><init>(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, p0, v1}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$f;->a(Landroid/view/View;Landroid/animation/Animator$AnimatorListener;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public l(Landroid/animation/Animator$AnimatorListener;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->k:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$f;

    .line 2
    .line 3
    new-instance v1, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g$b;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g$b;-><init>(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;Landroid/animation/Animator$AnimatorListener;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, p0, v1}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$f;->b(Landroid/view/View;Landroid/animation/Animator$AnimatorListener;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->d:Landroid/graphics/Path;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->e:Landroid/graphics/Paint;

    .line 9
    .line 10
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 6

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    new-instance v1, Landroid/graphics/RectF;

    .line 5
    .line 6
    int-to-float p1, p1

    .line 7
    int-to-float p2, p2

    .line 8
    const/4 p3, 0x0

    .line 9
    invoke-direct {v1, p3, p3, p1, p2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 10
    .line 11
    .line 12
    iget p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->l:I

    .line 13
    .line 14
    int-to-float v2, p1

    .line 15
    int-to-float v3, p1

    .line 16
    int-to-float v4, p1

    .line 17
    int-to-float v5, p1

    .line 18
    move-object v0, p0

    .line 19
    invoke-virtual/range {v0 .. v5}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->f(Landroid/graphics/RectF;FFFF)Landroid/graphics/Path;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, v0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->d:Landroid/graphics/Path;

    .line 24
    .line 25
    return-void
.end method

.method public setAlign(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->g:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setAutoHide(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->i:Z

    .line 2
    .line 3
    return-void
.end method

.method public setClickToHide(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->h:Z

    .line 2
    .line 3
    return-void
.end method

.method public setColor(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->c:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->e:Landroid/graphics/Paint;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setCorner(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->l:I

    .line 2
    .line 3
    return-void
.end method

.method public setCustomView(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->b:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->b:Landroid/view/View;

    .line 7
    .line 8
    const/4 v0, -0x2

    .line 9
    invoke-virtual {p0, p1, v0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setDuration(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->j:J

    .line 2
    .line 3
    return-void
.end method

.method public setListenerDisplay(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$d;)V
    .locals 0

    return-void
.end method

.method public setListenerHide(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$e;)V
    .locals 0

    return-void
.end method

.method public setPosition(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;)V
    .locals 3

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->f:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    .line 2
    .line 3
    sget-object v0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$b;->a:[I

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    aget p1, v0, p1

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    if-eq p1, v0, :cond_3

    .line 13
    .line 14
    const/4 v0, 0x2

    .line 15
    if-eq p1, v0, :cond_2

    .line 16
    .line 17
    const/4 v0, 0x3

    .line 18
    if-eq p1, v0, :cond_1

    .line 19
    .line 20
    const/4 v0, 0x4

    .line 21
    if-eq p1, v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->p:I

    .line 25
    .line 26
    add-int/lit8 p1, p1, 0xf

    .line 27
    .line 28
    iget v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->m:I

    .line 29
    .line 30
    iget v1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->o:I

    .line 31
    .line 32
    iget v2, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->n:I

    .line 33
    .line 34
    invoke-virtual {p0, p1, v0, v1, v2}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    iget p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->p:I

    .line 39
    .line 40
    iget v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->m:I

    .line 41
    .line 42
    iget v1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->o:I

    .line 43
    .line 44
    add-int/lit8 v1, v1, 0xf

    .line 45
    .line 46
    iget v2, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->n:I

    .line 47
    .line 48
    invoke-virtual {p0, p1, v0, v1, v2}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    iget p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->p:I

    .line 53
    .line 54
    iget v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->m:I

    .line 55
    .line 56
    add-int/lit8 v0, v0, 0xf

    .line 57
    .line 58
    iget v1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->o:I

    .line 59
    .line 60
    iget v2, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->n:I

    .line 61
    .line 62
    invoke-virtual {p0, p1, v0, v1, v2}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    iget p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->p:I

    .line 67
    .line 68
    iget v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->m:I

    .line 69
    .line 70
    iget v1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->o:I

    .line 71
    .line 72
    iget v2, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->n:I

    .line 73
    .line 74
    add-int/lit8 v2, v2, 0xf

    .line 75
    .line 76
    invoke-virtual {p0, p1, v0, v1, v2}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 77
    .line 78
    .line 79
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public setText(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->b:Landroid/view/View;

    .line 2
    .line 3
    instance-of v1, v0, Landroid/widget/TextView;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Landroid/widget/TextView;

    .line 8
    .line 9
    invoke-static {p1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public setTextColor(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->b:Landroid/view/View;

    .line 2
    .line 3
    instance-of v1, v0, Landroid/widget/TextView;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Landroid/widget/TextView;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setTextGravity(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->b:Landroid/view/View;

    .line 2
    .line 3
    instance-of v1, v0, Landroid/widget/TextView;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Landroid/widget/TextView;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setTextTypeFace(Landroid/graphics/Typeface;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->b:Landroid/view/View;

    .line 2
    .line 3
    instance-of v1, v0, Landroid/widget/TextView;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Landroid/widget/TextView;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setTooltipAnimation(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->k:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$f;

    .line 2
    .line 3
    return-void
.end method

.method public setupPosition(Landroid/graphics/Rect;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->f:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    .line 2
    .line 3
    sget-object v1, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;->a:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/high16 v3, 0x40000000    # 2.0f

    .line 7
    .line 8
    if-eq v0, v1, :cond_3

    .line 9
    .line 10
    sget-object v4, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;->b:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    .line 11
    .line 12
    if-ne v0, v4, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    iget-object v4, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->g:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;

    .line 24
    .line 25
    sget-object v5, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;->b:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;

    .line 26
    .line 27
    if-ne v4, v5, :cond_1

    .line 28
    .line 29
    int-to-float v1, v1

    .line 30
    div-float/2addr v1, v3

    .line 31
    const/high16 v2, 0x3f800000    # 1.0f

    .line 32
    .line 33
    int-to-float v0, v0

    .line 34
    mul-float/2addr v0, v2

    .line 35
    div-float/2addr v0, v3

    .line 36
    sub-float/2addr v1, v0

    .line 37
    float-to-int v2, v1

    .line 38
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->f:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    .line 39
    .line 40
    sget-object v1, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;->d:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    .line 41
    .line 42
    if-ne v0, v1, :cond_2

    .line 43
    .line 44
    iget v0, p1, Landroid/graphics/Rect;->bottom:I

    .line 45
    .line 46
    int-to-float v0, v0

    .line 47
    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 48
    .line 49
    .line 50
    iget p1, p1, Landroid/graphics/Rect;->left:I

    .line 51
    .line 52
    add-int/2addr p1, v2

    .line 53
    int-to-float p1, p1

    .line 54
    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationX(F)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_2
    iget v0, p1, Landroid/graphics/Rect;->top:I

    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    sub-int/2addr v0, v1

    .line 65
    int-to-float v0, v0

    .line 66
    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 67
    .line 68
    .line 69
    iget p1, p1, Landroid/graphics/Rect;->left:I

    .line 70
    .line 71
    add-int/2addr p1, v2

    .line 72
    int-to-float p1, p1

    .line 73
    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationX(F)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_3
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    sget-object v4, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$b;->b:[I

    .line 94
    .line 95
    iget-object v6, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->g:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;

    .line 96
    .line 97
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    aget v4, v4, v6

    .line 102
    .line 103
    const/4 v6, 0x1

    .line 104
    if-eq v4, v6, :cond_5

    .line 105
    .line 106
    const/4 v6, 0x2

    .line 107
    if-eq v4, v6, :cond_4

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_4
    const/high16 v2, -0x40800000    # -1.0f

    .line 111
    .line 112
    int-to-float v4, v5

    .line 113
    mul-float/2addr v4, v2

    .line 114
    div-float/2addr v4, v3

    .line 115
    int-to-float v0, v0

    .line 116
    div-float/2addr v0, v3

    .line 117
    add-float/2addr v4, v0

    .line 118
    float-to-int v2, v4

    .line 119
    :cond_5
    :goto_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$g;->f:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    .line 120
    .line 121
    if-ne v0, v1, :cond_6

    .line 122
    .line 123
    iget v0, p1, Landroid/graphics/Rect;->top:I

    .line 124
    .line 125
    add-int/2addr v0, v2

    .line 126
    int-to-float v0, v0

    .line 127
    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 128
    .line 129
    .line 130
    iget p1, p1, Landroid/graphics/Rect;->left:I

    .line 131
    .line 132
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    sub-int/2addr p1, v0

    .line 137
    int-to-float p1, p1

    .line 138
    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationX(F)V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :cond_6
    iget v0, p1, Landroid/graphics/Rect;->top:I

    .line 143
    .line 144
    add-int/2addr v0, v2

    .line 145
    int-to-float v0, v0

    .line 146
    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 147
    .line 148
    .line 149
    iget p1, p1, Landroid/graphics/Rect;->right:I

    .line 150
    .line 151
    int-to-float p1, p1

    .line 152
    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationX(F)V

    .line 153
    .line 154
    .line 155
    return-void
.end method
