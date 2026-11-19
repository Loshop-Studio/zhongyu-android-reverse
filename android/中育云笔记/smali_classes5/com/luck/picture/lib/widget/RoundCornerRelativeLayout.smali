.class public Lcom/luck/picture/lib/widget/RoundCornerRelativeLayout;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# instance fields
.field public final c:Landroid/graphics/Path;

.field public final d:F

.field public final e:Z

.field public final f:Z

.field public final g:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/luck/picture/lib/widget/RoundCornerRelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/luck/picture/lib/widget/RoundCornerRelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/luck/picture/lib/widget/RoundCornerRelativeLayout;->g:Landroid/graphics/RectF;

    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    sget-object v0, Lcom/luck/picture/lib/R$styleable;->PictureRoundCornerRelativeLayout:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 6
    sget p2, Lcom/luck/picture/lib/R$styleable;->PictureRoundCornerRelativeLayout_psCorners:I

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    iput p2, p0, Lcom/luck/picture/lib/widget/RoundCornerRelativeLayout;->d:F

    .line 7
    sget p2, Lcom/luck/picture/lib/R$styleable;->PictureRoundCornerRelativeLayout_psTopNormal:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/luck/picture/lib/widget/RoundCornerRelativeLayout;->e:Z

    .line 8
    sget p2, Lcom/luck/picture/lib/R$styleable;->PictureRoundCornerRelativeLayout_psBottomNormal:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/luck/picture/lib/widget/RoundCornerRelativeLayout;->f:Z

    .line 9
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 10
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/luck/picture/lib/widget/RoundCornerRelativeLayout;->c:Landroid/graphics/Path;

    return-void
.end method


# virtual methods
.method public dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/luck/picture/lib/widget/RoundCornerRelativeLayout;->c:Landroid/graphics/Path;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 7
    .line 8
    .line 9
    invoke-super {p0, p1}, Landroid/view/View;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 10

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    iget-object p3, p0, Lcom/luck/picture/lib/widget/RoundCornerRelativeLayout;->c:Landroid/graphics/Path;

    .line 5
    .line 6
    invoke-virtual {p3}, Landroid/graphics/Path;->reset()V

    .line 7
    .line 8
    .line 9
    iget-object p3, p0, Lcom/luck/picture/lib/widget/RoundCornerRelativeLayout;->g:Landroid/graphics/RectF;

    .line 10
    .line 11
    int-to-float p1, p1

    .line 12
    iput p1, p3, Landroid/graphics/RectF;->right:F

    .line 13
    .line 14
    int-to-float p1, p2

    .line 15
    iput p1, p3, Landroid/graphics/RectF;->bottom:F

    .line 16
    .line 17
    iget-boolean p1, p0, Lcom/luck/picture/lib/widget/RoundCornerRelativeLayout;->e:Z

    .line 18
    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    iget-boolean p2, p0, Lcom/luck/picture/lib/widget/RoundCornerRelativeLayout;->f:Z

    .line 22
    .line 23
    if-nez p2, :cond_0

    .line 24
    .line 25
    iget-object p1, p0, Lcom/luck/picture/lib/widget/RoundCornerRelativeLayout;->c:Landroid/graphics/Path;

    .line 26
    .line 27
    iget p2, p0, Lcom/luck/picture/lib/widget/RoundCornerRelativeLayout;->d:F

    .line 28
    .line 29
    sget-object p4, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 30
    .line 31
    invoke-virtual {p1, p3, p2, p2, p4}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    const/4 p2, 0x7

    .line 36
    const/4 p4, 0x6

    .line 37
    const/4 v0, 0x5

    .line 38
    const/4 v1, 0x4

    .line 39
    const/4 v2, 0x3

    .line 40
    const/4 v3, 0x2

    .line 41
    const/4 v4, 0x1

    .line 42
    const/4 v5, 0x0

    .line 43
    const/16 v6, 0x8

    .line 44
    .line 45
    const/4 v7, 0x0

    .line 46
    if-eqz p1, :cond_1

    .line 47
    .line 48
    iget p1, p0, Lcom/luck/picture/lib/widget/RoundCornerRelativeLayout;->d:F

    .line 49
    .line 50
    new-array v8, v6, [F

    .line 51
    .line 52
    aput v7, v8, v5

    .line 53
    .line 54
    aput v7, v8, v4

    .line 55
    .line 56
    aput v7, v8, v3

    .line 57
    .line 58
    aput v7, v8, v2

    .line 59
    .line 60
    aput p1, v8, v1

    .line 61
    .line 62
    aput p1, v8, v0

    .line 63
    .line 64
    aput p1, v8, p4

    .line 65
    .line 66
    aput p1, v8, p2

    .line 67
    .line 68
    iget-object p1, p0, Lcom/luck/picture/lib/widget/RoundCornerRelativeLayout;->c:Landroid/graphics/Path;

    .line 69
    .line 70
    sget-object v9, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 71
    .line 72
    invoke-virtual {p1, p3, v8, v9}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 73
    .line 74
    .line 75
    :cond_1
    iget-boolean p1, p0, Lcom/luck/picture/lib/widget/RoundCornerRelativeLayout;->f:Z

    .line 76
    .line 77
    if-eqz p1, :cond_2

    .line 78
    .line 79
    iget p1, p0, Lcom/luck/picture/lib/widget/RoundCornerRelativeLayout;->d:F

    .line 80
    .line 81
    new-array p3, v6, [F

    .line 82
    .line 83
    aput p1, p3, v5

    .line 84
    .line 85
    aput p1, p3, v4

    .line 86
    .line 87
    aput p1, p3, v3

    .line 88
    .line 89
    aput p1, p3, v2

    .line 90
    .line 91
    aput v7, p3, v1

    .line 92
    .line 93
    aput v7, p3, v0

    .line 94
    .line 95
    aput v7, p3, p4

    .line 96
    .line 97
    aput v7, p3, p2

    .line 98
    .line 99
    iget-object p1, p0, Lcom/luck/picture/lib/widget/RoundCornerRelativeLayout;->c:Landroid/graphics/Path;

    .line 100
    .line 101
    iget-object p2, p0, Lcom/luck/picture/lib/widget/RoundCornerRelativeLayout;->g:Landroid/graphics/RectF;

    .line 102
    .line 103
    sget-object p4, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 104
    .line 105
    invoke-virtual {p1, p2, p3, p4}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 106
    .line 107
    .line 108
    :cond_2
    return-void
.end method
