.class public Lcom/xuexiang/xui/widget/StickyNestedScrollView;
.super Landroidx/core/widget/NestedScrollView;
.source "SourceFile"


# instance fields
.field public a:Ljava/util/ArrayList;

.field public b:Landroid/view/View;

.field public c:F

.field public final d:Ljava/lang/Runnable;

.field public e:I

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:I

.field public j:Landroid/graphics/drawable/Drawable;

.field public k:Z

.field public l:Ljava/util/List;


# virtual methods
.method public addView(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/core/widget/NestedScrollView;->addView(Landroid/view/View;)V

    .line 2
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->d(Landroid/view/View;)V

    return-void
.end method

.method public addView(Landroid/view/View;I)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/core/widget/NestedScrollView;->addView(Landroid/view/View;I)V

    .line 4
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->d(Landroid/view/View;)V

    return-void
.end method

.method public addView(Landroid/view/View;II)V
    .locals 0

    .line 7
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    .line 8
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->d(Landroid/view/View;)V

    return-void
.end method

.method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 5
    invoke-super {p0, p1, p2, p3}, Landroidx/core/widget/NestedScrollView;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 6
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->d(Landroid/view/View;)V

    return-void
.end method

.method public addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 9
    invoke-super {p0, p1, p2}, Landroidx/core/widget/NestedScrollView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 10
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->d(Landroid/view/View;)V

    return-void
.end method

.method public final b(Landroid/view/View;)Z
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->g(Landroid/view/View;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "sticky"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->a:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    return p1

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    return p1
.end method

.method public final c()V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->a:Ljava/util/ArrayList;

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
    const/4 v3, 0x0

    .line 9
    move-object v4, v2

    .line 10
    move-object v5, v4

    .line 11
    move v6, v3

    .line 12
    :cond_0
    :goto_0
    if-ge v6, v1, :cond_7

    .line 13
    .line 14
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v7

    .line 18
    add-int/lit8 v6, v6, 0x1

    .line 19
    .line 20
    check-cast v7, Landroid/view/View;

    .line 21
    .line 22
    invoke-virtual {p0, v7}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->h(Landroid/view/View;)I

    .line 23
    .line 24
    .line 25
    move-result v8

    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 27
    .line 28
    .line 29
    move-result v9

    .line 30
    sub-int/2addr v8, v9

    .line 31
    iget-boolean v9, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->g:Z

    .line 32
    .line 33
    if-eqz v9, :cond_1

    .line 34
    .line 35
    move v9, v3

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 38
    .line 39
    .line 40
    move-result v9

    .line 41
    :goto_1
    add-int/2addr v8, v9

    .line 42
    if-gtz v8, :cond_4

    .line 43
    .line 44
    if-eqz v4, :cond_3

    .line 45
    .line 46
    invoke-virtual {p0, v4}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->h(Landroid/view/View;)I

    .line 47
    .line 48
    .line 49
    move-result v9

    .line 50
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 51
    .line 52
    .line 53
    move-result v10

    .line 54
    sub-int/2addr v9, v10

    .line 55
    iget-boolean v10, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->g:Z

    .line 56
    .line 57
    if-eqz v10, :cond_2

    .line 58
    .line 59
    move v10, v3

    .line 60
    goto :goto_2

    .line 61
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 62
    .line 63
    .line 64
    move-result v10

    .line 65
    :goto_2
    add-int/2addr v9, v10

    .line 66
    if-le v8, v9, :cond_0

    .line 67
    .line 68
    :cond_3
    move-object v4, v7

    .line 69
    goto :goto_0

    .line 70
    :cond_4
    if-eqz v5, :cond_6

    .line 71
    .line 72
    invoke-virtual {p0, v5}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->h(Landroid/view/View;)I

    .line 73
    .line 74
    .line 75
    move-result v9

    .line 76
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 77
    .line 78
    .line 79
    move-result v10

    .line 80
    sub-int/2addr v9, v10

    .line 81
    iget-boolean v10, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->g:Z

    .line 82
    .line 83
    if-eqz v10, :cond_5

    .line 84
    .line 85
    move v10, v3

    .line 86
    goto :goto_3

    .line 87
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 88
    .line 89
    .line 90
    move-result v10

    .line 91
    :goto_3
    add-int/2addr v9, v10

    .line 92
    if-ge v8, v9, :cond_0

    .line 93
    .line 94
    :cond_6
    move-object v5, v7

    .line 95
    goto :goto_0

    .line 96
    :cond_7
    if-eqz v4, :cond_e

    .line 97
    .line 98
    if-nez v5, :cond_8

    .line 99
    .line 100
    const/4 v0, 0x0

    .line 101
    goto :goto_5

    .line 102
    :cond_8
    invoke-virtual {p0, v5}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->h(Landroid/view/View;)I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    sub-int/2addr v0, v1

    .line 111
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->g:Z

    .line 112
    .line 113
    if-eqz v1, :cond_9

    .line 114
    .line 115
    move v1, v3

    .line 116
    goto :goto_4

    .line 117
    :cond_9
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    :goto_4
    add-int/2addr v0, v1

    .line 122
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    sub-int/2addr v0, v1

    .line 127
    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    int-to-float v0, v0

    .line 132
    :goto_5
    iput v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->c:F

    .line 133
    .line 134
    iget-object v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 135
    .line 136
    if-eq v4, v0, :cond_11

    .line 137
    .line 138
    if-eqz v0, :cond_c

    .line 139
    .line 140
    iget-object v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->l:Ljava/util/List;

    .line 141
    .line 142
    if-eqz v0, :cond_b

    .line 143
    .line 144
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-nez v1, :cond_a

    .line 153
    .line 154
    goto :goto_6

    .line 155
    :cond_a
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-static {v0}, Lq/a;->a(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    throw v2

    .line 163
    :cond_b
    :goto_6
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->m()V

    .line 164
    .line 165
    .line 166
    :cond_c
    invoke-virtual {p0, v4}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->e(Landroid/view/View;)I

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    iput v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->e:I

    .line 171
    .line 172
    invoke-virtual {p0, v4}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->l(Landroid/view/View;)V

    .line 173
    .line 174
    .line 175
    iget-object v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->l:Ljava/util/List;

    .line 176
    .line 177
    if-eqz v0, :cond_11

    .line 178
    .line 179
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    if-nez v1, :cond_d

    .line 188
    .line 189
    goto :goto_8

    .line 190
    :cond_d
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-static {v0}, Lq/a;->a(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    throw v2

    .line 198
    :cond_e
    iget-object v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 199
    .line 200
    if-eqz v0, :cond_11

    .line 201
    .line 202
    iget-object v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->l:Ljava/util/List;

    .line 203
    .line 204
    if-eqz v0, :cond_10

    .line 205
    .line 206
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    if-nez v1, :cond_f

    .line 215
    .line 216
    goto :goto_7

    .line 217
    :cond_f
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-static {v0}, Lq/a;->a(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    throw v2

    .line 225
    :cond_10
    :goto_7
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->m()V

    .line 226
    .line 227
    .line 228
    :cond_11
    :goto_8
    return-void
.end method

.method public final d(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b(Landroid/view/View;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p1, Landroid/view/ViewGroup;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    :goto_0
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-ge v0, v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->d(Landroid/view/View;)V

    .line 25
    .line 26
    .line 27
    add-int/lit8 v0, v0, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-void
.end method

.method public dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 5
    .line 6
    if-eqz v0, :cond_5

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget v1, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->e:I

    .line 16
    .line 17
    add-int/2addr v0, v1

    .line 18
    int-to-float v0, v0

    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    int-to-float v1, v1

    .line 24
    iget v2, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->c:F

    .line 25
    .line 26
    add-float/2addr v1, v2

    .line 27
    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->g:Z

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move v2, v3

    .line 38
    :goto_0
    int-to-float v2, v2

    .line 39
    add-float/2addr v1, v2

    .line 40
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 41
    .line 42
    .line 43
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->g:Z

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    iget v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->c:F

    .line 49
    .line 50
    neg-float v0, v0

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    move v0, v1

    .line 53
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    iget v4, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->e:I

    .line 58
    .line 59
    sub-int/2addr v2, v4

    .line 60
    int-to-float v2, v2

    .line 61
    iget-object v4, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 62
    .line 63
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    iget v5, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->i:I

    .line 68
    .line 69
    add-int/2addr v4, v5

    .line 70
    add-int/lit8 v4, v4, 0x1

    .line 71
    .line 72
    int-to-float v4, v4

    .line 73
    invoke-virtual {p1, v1, v0, v2, v4}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 74
    .line 75
    .line 76
    iget-object v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->j:Landroid/graphics/drawable/Drawable;

    .line 77
    .line 78
    if-eqz v0, :cond_2

    .line 79
    .line 80
    iget-object v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 81
    .line 82
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    iget-object v2, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 87
    .line 88
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    iget-object v4, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 93
    .line 94
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    iget v5, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->i:I

    .line 99
    .line 100
    add-int/2addr v4, v5

    .line 101
    iget-object v5, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->j:Landroid/graphics/drawable/Drawable;

    .line 102
    .line 103
    invoke-virtual {v5, v3, v0, v2, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 104
    .line 105
    .line 106
    iget-object v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->j:Landroid/graphics/drawable/Drawable;

    .line 107
    .line 108
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 109
    .line 110
    .line 111
    :cond_2
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->g:Z

    .line 112
    .line 113
    if-eqz v0, :cond_3

    .line 114
    .line 115
    iget v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->c:F

    .line 116
    .line 117
    neg-float v0, v0

    .line 118
    goto :goto_2

    .line 119
    :cond_3
    move v0, v1

    .line 120
    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    int-to-float v2, v2

    .line 125
    iget-object v3, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 126
    .line 127
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    int-to-float v3, v3

    .line 132
    invoke-virtual {p1, v1, v0, v2, v3}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 133
    .line 134
    .line 135
    iget-object v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 136
    .line 137
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->g(Landroid/view/View;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    const-string v1, "-hastransparency"

    .line 142
    .line 143
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-eqz v0, :cond_4

    .line 148
    .line 149
    iget-object v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 150
    .line 151
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->k(Landroid/view/View;)V

    .line 152
    .line 153
    .line 154
    iget-object v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 155
    .line 156
    invoke-virtual {v0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 157
    .line 158
    .line 159
    iget-object v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 160
    .line 161
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->i(Landroid/view/View;)V

    .line 162
    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 166
    .line 167
    invoke-virtual {v0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 168
    .line 169
    .line 170
    :goto_3
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 171
    .line 172
    .line 173
    :cond_5
    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->f:Z

    .line 9
    .line 10
    :cond_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->f:Z

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    iget-object v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    move v0, v1

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    move v0, v2

    .line 22
    :goto_0
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->f:Z

    .line 23
    .line 24
    if-eqz v0, :cond_4

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object v3, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 31
    .line 32
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    int-to-float v3, v3

    .line 37
    iget v4, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->c:F

    .line 38
    .line 39
    add-float/2addr v3, v4

    .line 40
    cmpg-float v0, v0, v3

    .line 41
    .line 42
    if-gtz v0, :cond_2

    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-object v3, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 49
    .line 50
    invoke-virtual {p0, v3}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->e(Landroid/view/View;)I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    int-to-float v3, v3

    .line 55
    cmpl-float v0, v0, v3

    .line 56
    .line 57
    if-ltz v0, :cond_2

    .line 58
    .line 59
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    iget-object v3, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 64
    .line 65
    invoke-virtual {p0, v3}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->f(Landroid/view/View;)I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    int-to-float v3, v3

    .line 70
    cmpg-float v0, v0, v3

    .line 71
    .line 72
    if-gtz v0, :cond_2

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    move v1, v2

    .line 76
    :goto_1
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->f:Z

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 80
    .line 81
    if-nez v0, :cond_4

    .line 82
    .line 83
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->f:Z

    .line 84
    .line 85
    :cond_4
    :goto_2
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->f:Z

    .line 86
    .line 87
    if-eqz v0, :cond_5

    .line 88
    .line 89
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    int-to-float v0, v0

    .line 94
    iget v1, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->c:F

    .line 95
    .line 96
    add-float/2addr v0, v1

    .line 97
    iget-object v1, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 98
    .line 99
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->h(Landroid/view/View;)I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    int-to-float v1, v1

    .line 104
    sub-float/2addr v0, v1

    .line 105
    const/high16 v1, -0x40800000    # -1.0f

    .line 106
    .line 107
    mul-float/2addr v0, v1

    .line 108
    const/4 v1, 0x0

    .line 109
    invoke-virtual {p1, v1, v0}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 110
    .line 111
    .line 112
    :cond_5
    invoke-super {p0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    return p1
.end method

.method public final e(Landroid/view/View;)I
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    if-eq v1, v2, :cond_0

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Landroid/view/View;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    add-int/2addr v0, v1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return v0
.end method

.method public final f(Landroid/view/View;)I
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    if-eq v1, v2, :cond_0

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Landroid/view/View;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    add-int/2addr v0, v1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return v0
.end method

.method public final g(Landroid/view/View;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final h(Landroid/view/View;)I
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    if-eq v1, v2, :cond_0

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Landroid/view/View;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    add-int/2addr v0, v1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return v0
.end method

.method public final i(Landroid/view/View;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final j()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->m()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->a:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->d(Landroid/view/View;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->c()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final k(Landroid/view/View;)V
    .locals 1

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final l(Landroid/view/View;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->g(Landroid/view/View;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-string v0, "-hastransparency"

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->i(Landroid/view/View;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->g(Landroid/view/View;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const-string v0, "-nonconstant"

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    iget-object p1, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->d:Ljava/lang/Runnable;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void
.end method

.method public final m()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->g(Landroid/view/View;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "-hastransparency"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->k(Landroid/view/View;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 22
    .line 23
    iget-object v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->d:Ljava/lang/Runnable;

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->d:Ljava/lang/Runnable;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Landroidx/core/widget/NestedScrollView;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    iget-boolean p2, p1, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->h:Z

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    const/4 p2, 0x1

    .line 10
    iput-boolean p2, p1, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->g:Z

    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->j()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public onScrollChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroidx/core/widget/NestedScrollView;->onScrollChanged(IIII)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->c()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    int-to-float v0, v0

    .line 10
    iget v1, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->c:F

    .line 11
    .line 12
    add-float/2addr v0, v1

    .line 13
    iget-object v1, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->h(Landroid/view/View;)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    int-to-float v1, v1

    .line 20
    sub-float/2addr v0, v1

    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-virtual {p1, v1, v0}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/4 v1, 0x0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->k:Z

    .line 33
    .line 34
    :cond_1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->k:Z

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0, v1}, Landroid/view/MotionEvent;->setAction(I)V

    .line 43
    .line 44
    .line 45
    invoke-super {p0, v0}, Landroidx/core/widget/NestedScrollView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 46
    .line 47
    .line 48
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->k:Z

    .line 49
    .line 50
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    const/4 v1, 0x1

    .line 55
    if-eq v0, v1, :cond_3

    .line 56
    .line 57
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    const/4 v2, 0x3

    .line 62
    if-ne v0, v2, :cond_4

    .line 63
    .line 64
    :cond_3
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->k:Z

    .line 65
    .line 66
    :cond_4
    invoke-super {p0, p1}, Landroidx/core/widget/NestedScrollView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    return p1
.end method

.method public setClipToPadding(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->g:Z

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->h:Z

    .line 8
    .line 9
    return-void
.end method

.method public setShadowDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->j:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-void
.end method

.method public setShadowHeight(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->i:I

    .line 2
    .line 3
    return-void
.end method
