.class public abstract Lc9/b;
.super Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;
.source "SourceFile"


# instance fields
.field public l:I

.field public m:I

.field public n:Landroid/widget/ImageView;

.field public o:Landroid/widget/ImageView;

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:I

.field public u:I

.field public v:I

.field public w:I

.field public x:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x2

    .line 1
    invoke-direct {p0, p1, v0}, Lc9/b;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 3
    iput p1, p0, Lc9/b;->l:I

    .line 4
    iput p1, p0, Lc9/b;->m:I

    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lc9/b;->s:I

    .line 6
    iput v0, p0, Lc9/b;->t:I

    .line 7
    iput p1, p0, Lc9/b;->v:I

    .line 8
    iput p1, p0, Lc9/b;->w:I

    .line 9
    iput p1, p0, Lc9/b;->x:I

    const/4 p1, 0x4

    .line 10
    iput p1, p0, Lc9/b;->p:I

    .line 11
    iput p2, p0, Lc9/b;->q:I

    .line 12
    iput p2, p0, Lc9/b;->r:I

    return-void
.end method


# virtual methods
.method public k(Landroid/view/View;)Landroid/graphics/Point;
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lc9/b;->p(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lc9/b;->t()V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->h:Landroid/graphics/Point;

    .line 8
    .line 9
    iget p1, p1, Landroid/graphics/Point;->x:I

    .line 10
    .line 11
    iget v0, p0, Lc9/b;->u:I

    .line 12
    .line 13
    invoke-virtual {p0, p1, v0}, Lc9/b;->q(II)V

    .line 14
    .line 15
    .line 16
    iget p1, p0, Lc9/b;->r:I

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    iget p1, p0, Lc9/b;->w:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x1

    .line 24
    if-ne p1, v0, :cond_1

    .line 25
    .line 26
    iget p1, p0, Lc9/b;->x:I

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 p1, 0x0

    .line 30
    :goto_0
    new-instance v0, Landroid/graphics/Point;

    .line 31
    .line 32
    iget v1, p0, Lc9/b;->s:I

    .line 33
    .line 34
    iget v2, p0, Lc9/b;->v:I

    .line 35
    .line 36
    add-int/2addr v1, v2

    .line 37
    iget v2, p0, Lc9/b;->t:I

    .line 38
    .line 39
    add-int/2addr v2, p1

    .line 40
    invoke-direct {v0, v1, v2}, Landroid/graphics/Point;-><init>(II)V

    .line 41
    .line 42
    .line 43
    return-object v0
.end method

.method public m(Landroid/view/View;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->d()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget v1, Lcom/xuexiang/xui/R$layout;->xui_layout_popup:I

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroid/widget/FrameLayout;

    .line 18
    .line 19
    sget v1, Lcom/xuexiang/xui/R$id;->arrow_down:I

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Landroid/widget/ImageView;

    .line 26
    .line 27
    iput-object v1, p0, Lc9/b;->o:Landroid/widget/ImageView;

    .line 28
    .line 29
    sget v1, Lcom/xuexiang/xui/R$id;->arrow_up:I

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Landroid/widget/ImageView;

    .line 36
    .line 37
    iput-object v1, p0, Lc9/b;->n:Landroid/widget/ImageView;

    .line 38
    .line 39
    sget v1, Lcom/xuexiang/xui/R$id;->box:I

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Landroid/widget/FrameLayout;

    .line 46
    .line 47
    invoke-virtual {v1, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 48
    .line 49
    .line 50
    invoke-super {p0, v0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->m(Landroid/view/View;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final p(Landroid/view/View;)V
    .locals 9

    .line 1
    const/4 v0, 0x2

    .line 2
    if-eqz p1, :cond_6

    .line 3
    .line 4
    new-array v1, v0, [I

    .line 5
    .line 6
    invoke-virtual {p1, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 7
    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    aget v3, v1, v2

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    div-int/2addr v4, v0

    .line 17
    add-int/2addr v3, v4

    .line 18
    iput v3, p0, Lc9/b;->u:I

    .line 19
    .line 20
    iget-object v4, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->h:Landroid/graphics/Point;

    .line 21
    .line 22
    iget v4, v4, Landroid/graphics/Point;->x:I

    .line 23
    .line 24
    div-int/lit8 v5, v4, 0x2

    .line 25
    .line 26
    if-ge v3, v5, :cond_0

    .line 27
    .line 28
    iget v4, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->j:I

    .line 29
    .line 30
    div-int/2addr v4, v0

    .line 31
    sub-int/2addr v3, v4

    .line 32
    iget v4, p0, Lc9/b;->l:I

    .line 33
    .line 34
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    iput v3, p0, Lc9/b;->s:I

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    iget v5, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->j:I

    .line 42
    .line 43
    div-int/lit8 v6, v5, 0x2

    .line 44
    .line 45
    add-int/2addr v6, v3

    .line 46
    iget v7, p0, Lc9/b;->l:I

    .line 47
    .line 48
    sub-int v8, v4, v7

    .line 49
    .line 50
    if-ge v6, v8, :cond_1

    .line 51
    .line 52
    div-int/2addr v5, v0

    .line 53
    sub-int/2addr v3, v5

    .line 54
    iput v3, p0, Lc9/b;->s:I

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    sub-int/2addr v4, v7

    .line 58
    sub-int/2addr v4, v5

    .line 59
    iput v4, p0, Lc9/b;->s:I

    .line 60
    .line 61
    :goto_0
    iget v3, p0, Lc9/b;->q:I

    .line 62
    .line 63
    iput v3, p0, Lc9/b;->r:I

    .line 64
    .line 65
    const/4 v4, 0x1

    .line 66
    if-eqz v3, :cond_4

    .line 67
    .line 68
    if-eq v3, v4, :cond_3

    .line 69
    .line 70
    if-eq v3, v0, :cond_2

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    aget p1, v1, v4

    .line 74
    .line 75
    iput p1, p0, Lc9/b;->t:I

    .line 76
    .line 77
    return-void

    .line 78
    :cond_3
    aget v0, v1, v4

    .line 79
    .line 80
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    add-int/2addr v0, p1

    .line 85
    iput v0, p0, Lc9/b;->t:I

    .line 86
    .line 87
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->h:Landroid/graphics/Point;

    .line 88
    .line 89
    iget p1, p1, Landroid/graphics/Point;->y:I

    .line 90
    .line 91
    iget v3, p0, Lc9/b;->m:I

    .line 92
    .line 93
    sub-int/2addr p1, v3

    .line 94
    if-le v0, p1, :cond_5

    .line 95
    .line 96
    aget p1, v1, v4

    .line 97
    .line 98
    iget v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->i:I

    .line 99
    .line 100
    sub-int/2addr p1, v0

    .line 101
    iput p1, p0, Lc9/b;->t:I

    .line 102
    .line 103
    iput v2, p0, Lc9/b;->r:I

    .line 104
    .line 105
    return-void

    .line 106
    :cond_4
    aget v0, v1, v4

    .line 107
    .line 108
    iget v1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->i:I

    .line 109
    .line 110
    sub-int v1, v0, v1

    .line 111
    .line 112
    iput v1, p0, Lc9/b;->t:I

    .line 113
    .line 114
    iget v2, p0, Lc9/b;->m:I

    .line 115
    .line 116
    if-ge v1, v2, :cond_5

    .line 117
    .line 118
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    add-int/2addr v0, p1

    .line 123
    iput v0, p0, Lc9/b;->t:I

    .line 124
    .line 125
    iput v4, p0, Lc9/b;->r:I

    .line 126
    .line 127
    :cond_5
    :goto_1
    return-void

    .line 128
    :cond_6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->h:Landroid/graphics/Point;

    .line 129
    .line 130
    iget v1, p1, Landroid/graphics/Point;->x:I

    .line 131
    .line 132
    iget v2, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->j:I

    .line 133
    .line 134
    sub-int/2addr v1, v2

    .line 135
    div-int/2addr v1, v0

    .line 136
    iput v1, p0, Lc9/b;->s:I

    .line 137
    .line 138
    iget p1, p1, Landroid/graphics/Point;->y:I

    .line 139
    .line 140
    iget v1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->i:I

    .line 141
    .line 142
    sub-int/2addr p1, v1

    .line 143
    div-int/2addr p1, v0

    .line 144
    iput p1, p0, Lc9/b;->t:I

    .line 145
    .line 146
    iput v0, p0, Lc9/b;->r:I

    .line 147
    .line 148
    return-void
.end method

.method public final q(II)V
    .locals 4

    .line 1
    iget-object v0, p0, Lc9/b;->n:Landroid/widget/ImageView;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    div-int/2addr v0, v1

    .line 11
    sub-int/2addr p2, v0

    .line 12
    :cond_0
    iget v0, p0, Lc9/b;->r:I

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    move v0, v2

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    :goto_0
    iget v3, p0, Lc9/b;->p:I

    .line 21
    .line 22
    if-eq v3, v2, :cond_c

    .line 23
    .line 24
    if-eq v3, v1, :cond_a

    .line 25
    .line 26
    const/4 v1, 0x3

    .line 27
    if-eq v3, v1, :cond_8

    .line 28
    .line 29
    const/4 v2, 0x4

    .line 30
    if-eq v3, v2, :cond_2

    .line 31
    .line 32
    return-void

    .line 33
    :cond_2
    div-int/2addr p1, v2

    .line 34
    if-gt p2, p1, :cond_4

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->e()Landroid/widget/PopupWindow;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    sget p2, Lcom/xuexiang/xui/R$style;->XUI_Animation_PopUpMenu_Left:I

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_3
    sget p2, Lcom/xuexiang/xui/R$style;->XUI_Animation_PopDownMenu_Left:I

    .line 46
    .line 47
    :goto_1
    invoke-virtual {p1, p2}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_4
    if-le p2, p1, :cond_6

    .line 52
    .line 53
    mul-int/2addr p1, v1

    .line 54
    if-ge p2, p1, :cond_6

    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->e()Landroid/widget/PopupWindow;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-eqz v0, :cond_5

    .line 61
    .line 62
    sget p2, Lcom/xuexiang/xui/R$style;->XUI_Animation_PopUpMenu_Center:I

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_5
    sget p2, Lcom/xuexiang/xui/R$style;->XUI_Animation_PopDownMenu_Center:I

    .line 66
    .line 67
    :goto_2
    invoke-virtual {p1, p2}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_6
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->e()Landroid/widget/PopupWindow;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-eqz v0, :cond_7

    .line 76
    .line 77
    sget p2, Lcom/xuexiang/xui/R$style;->XUI_Animation_PopUpMenu_Right:I

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_7
    sget p2, Lcom/xuexiang/xui/R$style;->XUI_Animation_PopDownMenu_Right:I

    .line 81
    .line 82
    :goto_3
    invoke-virtual {p1, p2}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_8
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->e()Landroid/widget/PopupWindow;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-eqz v0, :cond_9

    .line 91
    .line 92
    sget p2, Lcom/xuexiang/xui/R$style;->XUI_Animation_PopUpMenu_Center:I

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_9
    sget p2, Lcom/xuexiang/xui/R$style;->XUI_Animation_PopDownMenu_Center:I

    .line 96
    .line 97
    :goto_4
    invoke-virtual {p1, p2}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_a
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->e()Landroid/widget/PopupWindow;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    if-eqz v0, :cond_b

    .line 106
    .line 107
    sget p2, Lcom/xuexiang/xui/R$style;->XUI_Animation_PopUpMenu_Right:I

    .line 108
    .line 109
    goto :goto_5

    .line 110
    :cond_b
    sget p2, Lcom/xuexiang/xui/R$style;->XUI_Animation_PopDownMenu_Right:I

    .line 111
    .line 112
    :goto_5
    invoke-virtual {p1, p2}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :cond_c
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->e()Landroid/widget/PopupWindow;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    if-eqz v0, :cond_d

    .line 121
    .line 122
    sget p2, Lcom/xuexiang/xui/R$style;->XUI_Animation_PopUpMenu_Left:I

    .line 123
    .line 124
    goto :goto_6

    .line 125
    :cond_d
    sget p2, Lcom/xuexiang/xui/R$style;->XUI_Animation_PopDownMenu_Left:I

    .line 126
    .line 127
    :goto_6
    invoke-virtual {p1, p2}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    .line 128
    .line 129
    .line 130
    return-void
.end method

.method public r(I)Lc9/b;
    .locals 0

    .line 1
    iput p1, p0, Lc9/b;->q:I

    .line 2
    .line 3
    return-object p0
.end method

.method public final s(Landroid/view/View;Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 p2, 0x4

    .line 8
    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 9
    .line 10
    .line 11
    :cond_1
    return-void
.end method

.method public final t()V
    .locals 5

    .line 1
    iget v0, p0, Lc9/b;->r:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    if-eq v0, v2, :cond_1

    .line 9
    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v0, p0, Lc9/b;->o:Landroid/widget/ImageView;

    .line 14
    .line 15
    invoke-virtual {p0, v0, v3}, Lc9/b;->s(Landroid/view/View;Z)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lc9/b;->n:Landroid/widget/ImageView;

    .line 19
    .line 20
    invoke-virtual {p0, v0, v3}, Lc9/b;->s(Landroid/view/View;Z)V

    .line 21
    .line 22
    .line 23
    :goto_0
    const/4 v0, 0x0

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    iget-object v0, p0, Lc9/b;->n:Landroid/widget/ImageView;

    .line 26
    .line 27
    invoke-virtual {p0, v0, v2}, Lc9/b;->s(Landroid/view/View;Z)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lc9/b;->o:Landroid/widget/ImageView;

    .line 31
    .line 32
    invoke-virtual {p0, v0, v3}, Lc9/b;->s(Landroid/view/View;Z)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lc9/b;->n:Landroid/widget/ImageView;

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    iget-object v0, p0, Lc9/b;->o:Landroid/widget/ImageView;

    .line 39
    .line 40
    invoke-virtual {p0, v0, v2}, Lc9/b;->s(Landroid/view/View;Z)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lc9/b;->n:Landroid/widget/ImageView;

    .line 44
    .line 45
    invoke-virtual {p0, v0, v3}, Lc9/b;->s(Landroid/view/View;Z)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lc9/b;->o:Landroid/widget/ImageView;

    .line 49
    .line 50
    :goto_1
    if-eqz v0, :cond_3

    .line 51
    .line 52
    iget-object v2, p0, Lc9/b;->n:Landroid/widget/ImageView;

    .line 53
    .line 54
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 63
    .line 64
    iget v3, p0, Lc9/b;->u:I

    .line 65
    .line 66
    iget v4, p0, Lc9/b;->s:I

    .line 67
    .line 68
    sub-int/2addr v3, v4

    .line 69
    div-int/2addr v2, v1

    .line 70
    sub-int/2addr v3, v2

    .line 71
    iput v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 72
    .line 73
    :cond_3
    return-void
.end method

.method public u(Landroid/view/View;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lc9/b;->r(I)Lc9/b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->n(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public v(Landroid/view/View;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lc9/b;->r(I)Lc9/b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->n(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
