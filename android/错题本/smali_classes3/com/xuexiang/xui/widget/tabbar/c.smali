.class public final Lcom/xuexiang/xui/widget/tabbar/c;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# instance fields
.field public final a:Lcom/xuexiang/xui/widget/tabbar/d;

.field public final synthetic b:Lcom/xuexiang/xui/widget/tabbar/TabSegment;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/c;->b:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    new-instance p2, Lcom/xuexiang/xui/widget/tabbar/d;

    .line 7
    .line 8
    invoke-direct {p2, p1, p0}, Lcom/xuexiang/xui/widget/tabbar/d;-><init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lcom/xuexiang/xui/widget/tabbar/c;)V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/c;->a:Lcom/xuexiang/xui/widget/tabbar/d;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/c;->b:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    .line 5
    .line 6
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->f:Z

    .line 7
    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    iget-object v1, v0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->k:Landroid/graphics/Rect;

    .line 11
    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    iget-boolean v2, v0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->h:Z

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    iput v2, v1, Landroid/graphics/Rect;->top:I

    .line 23
    .line 24
    iget-object v1, v0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->k:Landroid/graphics/Rect;

    .line 25
    .line 26
    iget v2, v1, Landroid/graphics/Rect;->top:I

    .line 27
    .line 28
    iget v3, v0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->g:I

    .line 29
    .line 30
    add-int/2addr v2, v3

    .line 31
    iput v2, v1, Landroid/graphics/Rect;->bottom:I

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    sub-int/2addr v2, v3

    .line 43
    iput v2, v1, Landroid/graphics/Rect;->bottom:I

    .line 44
    .line 45
    iget-object v1, v0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->k:Landroid/graphics/Rect;

    .line 46
    .line 47
    iget v2, v1, Landroid/graphics/Rect;->bottom:I

    .line 48
    .line 49
    iget v3, v0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->g:I

    .line 50
    .line 51
    sub-int/2addr v2, v3

    .line 52
    iput v2, v1, Landroid/graphics/Rect;->top:I

    .line 53
    .line 54
    :goto_0
    iget-object v1, v0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->i:Landroid/graphics/drawable/Drawable;

    .line 55
    .line 56
    if-eqz v1, :cond_1

    .line 57
    .line 58
    iget-object v2, v0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->k:Landroid/graphics/Rect;

    .line 59
    .line 60
    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 61
    .line 62
    .line 63
    iget-object v0, v0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->i:Landroid/graphics/drawable/Drawable;

    .line 64
    .line 65
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_1
    iget-object v1, v0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->k:Landroid/graphics/Rect;

    .line 70
    .line 71
    iget-object v0, v0, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->l:Landroid/graphics/Paint;

    .line 72
    .line 73
    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 74
    .line 75
    .line 76
    :cond_2
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/xuexiang/xui/widget/tabbar/c;->a:Lcom/xuexiang/xui/widget/tabbar/d;

    .line 4
    .line 5
    iget-object v2, v1, Lp3/s;->c:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/4 v4, 0x0

    .line 12
    move v5, v4

    .line 13
    move v6, v5

    .line 14
    :goto_0
    if-ge v5, v3, :cond_1

    .line 15
    .line 16
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v7

    .line 20
    check-cast v7, Landroid/view/View;

    .line 21
    .line 22
    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    .line 23
    .line 24
    .line 25
    move-result v7

    .line 26
    if-nez v7, :cond_0

    .line 27
    .line 28
    add-int/lit8 v6, v6, 0x1

    .line 29
    .line 30
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    if-eqz v3, :cond_9

    .line 34
    .line 35
    if-nez v6, :cond_2

    .line 36
    .line 37
    goto/16 :goto_4

    .line 38
    .line 39
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    move v6, v4

    .line 44
    :goto_1
    iget-object v7, v0, Lcom/xuexiang/xui/widget/tabbar/c;->b:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    .line 45
    .line 46
    if-ge v6, v3, :cond_8

    .line 47
    .line 48
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v8

    .line 52
    check-cast v8, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    .line 53
    .line 54
    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    .line 55
    .line 56
    .line 57
    move-result v9

    .line 58
    if-eqz v9, :cond_3

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_3
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    .line 62
    .line 63
    .line 64
    move-result v9

    .line 65
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 66
    .line 67
    .line 68
    move-result v10

    .line 69
    add-int v11, v5, v9

    .line 70
    .line 71
    sub-int v12, p5, p3

    .line 72
    .line 73
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 74
    .line 75
    .line 76
    move-result v13

    .line 77
    sub-int/2addr v12, v13

    .line 78
    invoke-virtual {v8, v5, v10, v11, v12}, Landroid/view/View;->layout(IIII)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v6}, Lp3/s;->b(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v10

    .line 85
    check-cast v10, Lp3/h;

    .line 86
    .line 87
    iget v12, v10, Lp3/h;->b:I

    .line 88
    .line 89
    iget v13, v10, Lp3/h;->a:I

    .line 90
    .line 91
    iget v14, v7, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->p:I

    .line 92
    .line 93
    const/4 v15, 0x1

    .line 94
    if-ne v14, v15, :cond_4

    .line 95
    .line 96
    iget-boolean v14, v7, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->j:Z

    .line 97
    .line 98
    if-eqz v14, :cond_4

    .line 99
    .line 100
    invoke-virtual {v8}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->getTextView()Landroid/widget/TextView;

    .line 101
    .line 102
    .line 103
    move-result-object v8

    .line 104
    invoke-virtual {v8}, Landroid/view/View;->getLeft()I

    .line 105
    .line 106
    .line 107
    move-result v9

    .line 108
    add-int/2addr v5, v9

    .line 109
    invoke-virtual {v8}, Landroid/view/View;->getWidth()I

    .line 110
    .line 111
    .line 112
    move-result v9

    .line 113
    :cond_4
    if-ne v12, v5, :cond_5

    .line 114
    .line 115
    if-eq v13, v9, :cond_6

    .line 116
    .line 117
    :cond_5
    iput v5, v10, Lp3/h;->b:I

    .line 118
    .line 119
    iput v9, v10, Lp3/h;->a:I

    .line 120
    .line 121
    :cond_6
    iget v5, v7, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->p:I

    .line 122
    .line 123
    if-nez v5, :cond_7

    .line 124
    .line 125
    iget v5, v7, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->q:I

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_7
    move v5, v4

    .line 129
    :goto_2
    add-int/2addr v11, v5

    .line 130
    move v5, v11

    .line 131
    :goto_3
    add-int/lit8 v6, v6, 0x1

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_8
    iget v2, v7, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->c:I

    .line 135
    .line 136
    const/4 v3, -0x1

    .line 137
    if-eq v2, v3, :cond_9

    .line 138
    .line 139
    iget-object v3, v7, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->s:Landroid/animation/Animator;

    .line 140
    .line 141
    if-nez v3, :cond_9

    .line 142
    .line 143
    iget v3, v7, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->r:I

    .line 144
    .line 145
    if-nez v3, :cond_9

    .line 146
    .line 147
    invoke-virtual {v1, v2}, Lp3/s;->b(I)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    check-cast v1, Lp3/h;

    .line 152
    .line 153
    invoke-virtual {v7, v1, v4}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->e(Lp3/h;Z)V

    .line 154
    .line 155
    .line 156
    :cond_9
    :goto_4
    return-void
.end method

.method public final onMeasure(II)V
    .locals 10

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/c;->a:Lcom/xuexiang/xui/widget/tabbar/d;

    .line 10
    .line 11
    iget-object v0, v0, Lp3/s;->c:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    move v3, v2

    .line 19
    move v4, v3

    .line 20
    :goto_0
    if-ge v3, v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    check-cast v5, Landroid/view/View;

    .line 27
    .line 28
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-nez v5, :cond_0

    .line 33
    .line 34
    add-int/lit8 v4, v4, 0x1

    .line 35
    .line 36
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    if-eqz v1, :cond_8

    .line 40
    .line 41
    if-nez v4, :cond_2

    .line 42
    .line 43
    goto :goto_5

    .line 44
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    sub-int v3, p2, v3

    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    sub-int/2addr v3, v5

    .line 55
    iget-object v5, p0, Lcom/xuexiang/xui/widget/tabbar/c;->b:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    .line 56
    .line 57
    iget v6, v5, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->p:I

    .line 58
    .line 59
    const/high16 v7, 0x40000000    # 2.0f

    .line 60
    .line 61
    const/4 v8, 0x1

    .line 62
    if-ne v6, v8, :cond_4

    .line 63
    .line 64
    div-int v4, p1, v4

    .line 65
    .line 66
    :goto_1
    if-ge v2, v1, :cond_7

    .line 67
    .line 68
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    check-cast v5, Landroid/view/View;

    .line 73
    .line 74
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    if-eqz v6, :cond_3

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_3
    invoke-static {v4, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    invoke-static {v3, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 86
    .line 87
    .line 88
    move-result v8

    .line 89
    invoke-virtual {v5, v6, v8}, Landroid/view/View;->measure(II)V

    .line 90
    .line 91
    .line 92
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_4
    move v4, v2

    .line 96
    :goto_3
    if-ge v2, v1, :cond_6

    .line 97
    .line 98
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    check-cast v6, Landroid/view/View;

    .line 103
    .line 104
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    .line 105
    .line 106
    .line 107
    move-result v8

    .line 108
    if-eqz v8, :cond_5

    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_5
    const/high16 v8, -0x80000000

    .line 112
    .line 113
    invoke-static {p1, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 114
    .line 115
    .line 116
    move-result v8

    .line 117
    invoke-static {v3, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 118
    .line 119
    .line 120
    move-result v9

    .line 121
    invoke-virtual {v6, v8, v9}, Landroid/view/View;->measure(II)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    .line 125
    .line 126
    .line 127
    move-result v6

    .line 128
    iget v8, v5, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->q:I

    .line 129
    .line 130
    add-int/2addr v6, v8

    .line 131
    add-int/2addr v6, v4

    .line 132
    move v4, v6

    .line 133
    :goto_4
    add-int/lit8 v2, v2, 0x1

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_6
    iget p1, v5, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->q:I

    .line 137
    .line 138
    sub-int p1, v4, p1

    .line 139
    .line 140
    :cond_7
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :cond_8
    :goto_5
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 145
    .line 146
    .line 147
    return-void
.end method
