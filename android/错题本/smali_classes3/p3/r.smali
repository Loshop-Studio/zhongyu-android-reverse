.class public final Lp3/r;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field public a:F

.field public b:F

.field public c:F

.field public d:I

.field public final e:Landroid/graphics/Paint;

.field public final f:Landroid/graphics/RectF;

.field public g:Landroid/animation/AnimatorSet;

.field public final synthetic h:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;Landroid/content/Context;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lp3/r;->h:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    const/4 p2, 0x0

    .line 7
    invoke-virtual {p0, p2}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 8
    .line 9
    .line 10
    const/4 p2, 0x1

    .line 11
    invoke-virtual {p0, p2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 12
    .line 13
    .line 14
    new-instance v0, Landroid/graphics/Paint;

    .line 15
    .line 16
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lp3/r;->e:Landroid/graphics/Paint;

    .line 20
    .line 21
    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 22
    .line 23
    .line 24
    iget p2, p1, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->g:I

    .line 25
    .line 26
    if-nez p2, :cond_0

    .line 27
    .line 28
    const/4 p2, 0x3

    .line 29
    :cond_0
    iput p2, p1, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->g:I

    .line 30
    .line 31
    new-instance p1, Landroid/graphics/RectF;

    .line 32
    .line 33
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lp3/r;->f:Landroid/graphics/RectF;

    .line 37
    .line 38
    invoke-virtual {p0}, Lp3/r;->c()V

    .line 39
    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public final a(F)V
    .locals 8

    .line 1
    float-to-double v0, p1

    .line 2
    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    .line 3
    .line 4
    .line 5
    move-result-wide v2

    .line 6
    double-to-int v2, v2

    .line 7
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    .line 12
    .line 13
    .line 14
    move-result-wide v4

    .line 15
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    add-int/lit8 v6, v6, -0x1

    .line 20
    .line 21
    int-to-double v6, v6

    .line 22
    cmpl-double v4, v4, v6

    .line 23
    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    const-wide/16 v4, 0x0

    .line 31
    .line 32
    cmpl-double v0, v0, v4

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    add-int/lit8 v0, v2, 0x1

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    int-to-float v1, v1

    .line 47
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    sub-int/2addr v4, v5

    .line 56
    int-to-float v4, v4

    .line 57
    int-to-float v2, v2

    .line 58
    sub-float/2addr p1, v2

    .line 59
    mul-float/2addr v4, p1

    .line 60
    add-float/2addr v4, v1

    .line 61
    iput v4, p0, Lp3/r;->a:F

    .line 62
    .line 63
    invoke-virtual {v3}, Landroid/view/View;->getBottom()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    int-to-float v1, v1

    .line 68
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    invoke-virtual {v3}, Landroid/view/View;->getBottom()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    sub-int/2addr v0, v2

    .line 77
    int-to-float v0, v0

    .line 78
    mul-float/2addr v0, p1

    .line 79
    add-float/2addr v0, v1

    .line 80
    iput v0, p0, Lp3/r;->c:F

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_0
    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    int-to-float p1, p1

    .line 88
    iput p1, p0, Lp3/r;->a:F

    .line 89
    .line 90
    invoke-virtual {v3}, Landroid/view/View;->getBottom()I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    int-to-float p1, p1

    .line 95
    iput p1, p0, Lp3/r;->c:F

    .line 96
    .line 97
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method public final b(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lp3/r;->h:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->getSelectedTabPosition()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sub-int v0, p1, v0

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    int-to-float v1, v1

    .line 18
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    int-to-float p1, p1

    .line 23
    iget v2, p0, Lp3/r;->a:F

    .line 24
    .line 25
    cmpl-float v2, v2, v1

    .line 26
    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    iget v2, p0, Lp3/r;->c:F

    .line 30
    .line 31
    cmpl-float v2, v2, p1

    .line 32
    .line 33
    if-nez v2, :cond_0

    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    iget-object v2, p0, Lp3/r;->g:Landroid/animation/AnimatorSet;

    .line 37
    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    invoke-virtual {v2}, Landroid/animation/AnimatorSet;->isRunning()Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    iget-object v2, p0, Lp3/r;->g:Landroid/animation/AnimatorSet;

    .line 47
    .line 48
    invoke-virtual {v2}, Landroid/animation/AnimatorSet;->end()V

    .line 49
    .line 50
    .line 51
    :cond_1
    new-instance v2, Lp3/q;

    .line 52
    .line 53
    invoke-direct {v2, p0, v0, p1, v1}, Lp3/q;-><init>(Lp3/r;IFF)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final c()V
    .locals 5

    .line 1
    iget-object v0, p0, Lp3/r;->h:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    .line 2
    .line 3
    iget v1, v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->g:I

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    if-ne v1, v2, :cond_1

    .line 9
    .line 10
    iput v3, p0, Lp3/r;->b:F

    .line 11
    .line 12
    iget v1, p0, Lp3/r;->d:I

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    iput v1, v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->f:I

    .line 17
    .line 18
    :cond_0
    iget v0, v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->f:I

    .line 19
    .line 20
    invoke-virtual {p0, v0, v4, v4, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/4 v2, 0x5

    .line 25
    if-ne v1, v2, :cond_3

    .line 26
    .line 27
    iget v1, p0, Lp3/r;->d:I

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    iput v1, v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->f:I

    .line 32
    .line 33
    :cond_2
    iget v0, v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->f:I

    .line 34
    .line 35
    invoke-virtual {p0, v4, v4, v0, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_3
    const/16 v0, 0x77

    .line 40
    .line 41
    if-ne v1, v0, :cond_4

    .line 42
    .line 43
    iput v3, p0, Lp3/r;->b:F

    .line 44
    .line 45
    invoke-virtual {p0, v4, v4, v4, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 46
    .line 47
    .line 48
    :cond_4
    :goto_0
    new-instance v0, Lb0/a;

    .line 49
    .line 50
    const/16 v1, 0x10

    .line 51
    .line 52
    invoke-direct {v0, p0, v1}, Lb0/a;-><init>(Ljava/lang/Object;I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lp3/r;->h:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    .line 5
    .line 6
    iget v1, v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->c:I

    .line 7
    .line 8
    iget-object v2, p0, Lp3/r;->e:Landroid/graphics/Paint;

    .line 9
    .line 10
    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 11
    .line 12
    .line 13
    iget v1, p0, Lp3/r;->b:F

    .line 14
    .line 15
    iget-object v3, p0, Lp3/r;->f:Landroid/graphics/RectF;

    .line 16
    .line 17
    iput v1, v3, Landroid/graphics/RectF;->left:F

    .line 18
    .line 19
    iget v4, p0, Lp3/r;->a:F

    .line 20
    .line 21
    iput v4, v3, Landroid/graphics/RectF;->top:F

    .line 22
    .line 23
    iget v4, v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->f:I

    .line 24
    .line 25
    int-to-float v4, v4

    .line 26
    add-float/2addr v1, v4

    .line 27
    iput v1, v3, Landroid/graphics/RectF;->right:F

    .line 28
    .line 29
    iget v1, p0, Lp3/r;->c:F

    .line 30
    .line 31
    iput v1, v3, Landroid/graphics/RectF;->bottom:F

    .line 32
    .line 33
    iget v0, v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->h:F

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    cmpl-float v1, v0, v1

    .line 37
    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    invoke-virtual {p1, v3, v0, v0, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    invoke-virtual {p1, v3, v2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method
