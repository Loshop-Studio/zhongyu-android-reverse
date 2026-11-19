.class public Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public a:Landroid/view/View;

.field public b:I

.field public c:Landroid/graphics/Path;

.field public final d:Landroid/graphics/Paint;

.field public e:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

.field public f:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;

.field public g:I

.field public final h:I

.field public final i:I

.field public final j:I

.field public final k:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "#B2299EE3"

    .line 5
    .line 6
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iput v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->b:I

    .line 11
    .line 12
    sget-object v0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;->BOTTOM:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    .line 13
    .line 14
    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->e:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    .line 15
    .line 16
    sget-object v0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;->CENTER:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;

    .line 17
    .line 18
    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->f:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;

    .line 19
    .line 20
    const/16 v0, 0x1e

    .line 21
    .line 22
    iput v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->g:I

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 26
    .line 27
    .line 28
    new-instance v1, Landroid/widget/TextView;

    .line 29
    .line 30
    invoke-direct {v1, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 31
    .line 32
    .line 33
    iput-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->a:Landroid/view/View;

    .line 34
    .line 35
    const/4 p1, -0x1

    .line 36
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->a:Landroid/view/View;

    .line 40
    .line 41
    const/4 v2, -0x2

    .line 42
    invoke-virtual {p0, v1, v2, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->a:Landroid/view/View;

    .line 46
    .line 47
    invoke-virtual {v1, v0, v0, v0, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 48
    .line 49
    .line 50
    new-instance v0, Landroid/graphics/Paint;

    .line 51
    .line 52
    const/4 v1, 0x1

    .line 53
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->d:Landroid/graphics/Paint;

    .line 57
    .line 58
    iget v1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->b:I

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 61
    .line 62
    .line 63
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    sget v1, Lcom/xuexiang/xui/R$attr;->xui_tip_popup_padding_top:I

    .line 73
    .line 74
    invoke-static {v0, v1, p1}, Lkotlin/collections/u;->G(Landroid/content/Context;II)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    iput v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->i:I

    .line 79
    .line 80
    iput v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->h:I

    .line 81
    .line 82
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    sget v1, Lcom/xuexiang/xui/R$attr;->xui_tip_popup_padding_left:I

    .line 87
    .line 88
    invoke-static {v0, v1, p1}, Lkotlin/collections/u;->G(Landroid/content/Context;II)I

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->k:I

    .line 93
    .line 94
    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->j:I

    .line 95
    .line 96
    invoke-static {}, Lt1/a;->b()V

    .line 97
    .line 98
    .line 99
    const/4 p1, 0x0

    .line 100
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->setTextTypeFace(Landroid/graphics/Typeface;)V

    .line 101
    .line 102
    .line 103
    return-void
.end method


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->c:Landroid/graphics/Path;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->d:Landroid/graphics/Paint;

    .line 9
    .line 10
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    new-instance p3, Landroid/graphics/RectF;

    .line 5
    .line 6
    int-to-float p1, p1

    .line 7
    int-to-float p2, p2

    .line 8
    const/4 p4, 0x0

    .line 9
    invoke-direct {p3, p4, p4, p1, p2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 10
    .line 11
    .line 12
    new-instance p1, Landroid/graphics/Path;

    .line 13
    .line 14
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->c:Landroid/graphics/Path;

    .line 18
    .line 19
    return-void
.end method

.method public setAlign(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->f:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;

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

    return-void
.end method

.method public setClickToHide(Z)V
    .locals 0

    return-void
.end method

.method public setColor(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->b:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->d:Landroid/graphics/Paint;

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
    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->g:I

    .line 2
    .line 3
    return-void
.end method

.method public setCustomView(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->a:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->a:Landroid/view/View;

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

    return-void
.end method

.method public setListenerDisplay(Lh3/b;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setListenerHide(Lh3/c;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setPosition(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;)V
    .locals 5

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->e:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    .line 2
    .line 3
    sget-object v0, Lh3/a;->a:[I

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
    iget v1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->i:I

    .line 13
    .line 14
    iget v2, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->j:I

    .line 15
    .line 16
    iget v3, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->h:I

    .line 17
    .line 18
    iget v4, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->k:I

    .line 19
    .line 20
    if-eq p1, v0, :cond_3

    .line 21
    .line 22
    const/4 v0, 0x2

    .line 23
    if-eq p1, v0, :cond_2

    .line 24
    .line 25
    const/4 v0, 0x3

    .line 26
    if-eq p1, v0, :cond_1

    .line 27
    .line 28
    const/4 v0, 0x4

    .line 29
    if-eq p1, v0, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    add-int/lit8 v4, v4, 0xf

    .line 33
    .line 34
    invoke-virtual {p0, v4, v3, v2, v1}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    add-int/lit8 v2, v2, 0xf

    .line 39
    .line 40
    invoke-virtual {p0, v4, v3, v2, v1}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    add-int/lit8 v3, v3, 0xf

    .line 45
    .line 46
    invoke-virtual {p0, v4, v3, v2, v1}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    add-int/lit8 v1, v1, 0xf

    .line 51
    .line 52
    invoke-virtual {p0, v4, v3, v2, v1}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 53
    .line 54
    .line 55
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public setText(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->a:Landroid/view/View;

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->a:Landroid/view/View;

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->a:Landroid/view/View;

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->a:Landroid/view/View;

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

.method public setTooltipAnimation(Lh3/d;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setupPosition(Landroid/graphics/Rect;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->e:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    .line 2
    .line 3
    sget-object v1, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;->LEFT:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

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
    sget-object v4, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;->RIGHT:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

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
    iget-object v4, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->f:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;

    .line 24
    .line 25
    sget-object v5, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;->CENTER:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;

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
    invoke-static {v0, v2, v3, v1}, Landroidx/compose/material3/c;->D(FFFF)F

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    float-to-int v2, v0

    .line 39
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->e:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    .line 40
    .line 41
    sget-object v1, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;->BOTTOM:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    .line 42
    .line 43
    if-ne v0, v1, :cond_2

    .line 44
    .line 45
    iget v0, p1, Landroid/graphics/Rect;->bottom:I

    .line 46
    .line 47
    int-to-float v0, v0

    .line 48
    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 49
    .line 50
    .line 51
    iget p1, p1, Landroid/graphics/Rect;->left:I

    .line 52
    .line 53
    add-int/2addr p1, v2

    .line 54
    int-to-float p1, p1

    .line 55
    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationX(F)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    iget v0, p1, Landroid/graphics/Rect;->top:I

    .line 60
    .line 61
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    sub-int/2addr v0, v1

    .line 66
    int-to-float v0, v0

    .line 67
    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 68
    .line 69
    .line 70
    iget p1, p1, Landroid/graphics/Rect;->left:I

    .line 71
    .line 72
    add-int/2addr p1, v2

    .line 73
    int-to-float p1, p1

    .line 74
    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationX(F)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_3
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    sget-object v4, Lh3/a;->b:[I

    .line 95
    .line 96
    iget-object v6, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->f:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$ALIGN;

    .line 97
    .line 98
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    aget v4, v4, v6

    .line 103
    .line 104
    const/4 v6, 0x1

    .line 105
    if-eq v4, v6, :cond_5

    .line 106
    .line 107
    const/4 v6, 0x2

    .line 108
    if-eq v4, v6, :cond_4

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_4
    const/high16 v2, -0x40800000    # -1.0f

    .line 112
    .line 113
    int-to-float v4, v5

    .line 114
    mul-float/2addr v4, v2

    .line 115
    div-float/2addr v4, v3

    .line 116
    int-to-float v0, v0

    .line 117
    div-float/2addr v0, v3

    .line 118
    add-float/2addr v0, v4

    .line 119
    float-to-int v2, v0

    .line 120
    :cond_5
    :goto_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->e:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$Position;

    .line 121
    .line 122
    if-ne v0, v1, :cond_6

    .line 123
    .line 124
    iget v0, p1, Landroid/graphics/Rect;->top:I

    .line 125
    .line 126
    add-int/2addr v0, v2

    .line 127
    int-to-float v0, v0

    .line 128
    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 129
    .line 130
    .line 131
    iget p1, p1, Landroid/graphics/Rect;->left:I

    .line 132
    .line 133
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    sub-int/2addr p1, v0

    .line 138
    int-to-float p1, p1

    .line 139
    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationX(F)V

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :cond_6
    iget v0, p1, Landroid/graphics/Rect;->top:I

    .line 144
    .line 145
    add-int/2addr v0, v2

    .line 146
    int-to-float v0, v0

    .line 147
    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 148
    .line 149
    .line 150
    iget p1, p1, Landroid/graphics/Rect;->right:I

    .line 151
    .line 152
    int-to-float p1, p1

    .line 153
    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationX(F)V

    .line 154
    .line 155
    .line 156
    return-void
.end method
