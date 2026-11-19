.class public Lcom/xuexiang/xui/widget/StickyNestedScrollView;
.super Landroidx/core/widget/NestedScrollView;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public b:Landroid/view/View;

.field public c:F

.field public final d:Lb0/a;

.field public e:I

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:I

.field public j:Landroid/graphics/drawable/Drawable;

.field public k:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x1010080

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroidx/core/widget/NestedScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance p1, Lb0/a;

    const/16 p2, 0x13

    invoke-direct {p1, p0, p2}, Lb0/a;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->d:Lb0/a;

    const/16 p1, 0xa

    .line 5
    iput p1, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->i:I

    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->k:Z

    .line 7
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->a:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final addView(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/core/widget/NestedScrollView;->addView(Landroid/view/View;)V

    .line 2
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->c(Landroid/view/View;)V

    return-void
.end method

.method public final addView(Landroid/view/View;I)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/core/widget/NestedScrollView;->addView(Landroid/view/View;I)V

    .line 4
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->c(Landroid/view/View;)V

    return-void
.end method

.method public final addView(Landroid/view/View;II)V
    .locals 0

    .line 7
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    .line 8
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->c(Landroid/view/View;)V

    return-void
.end method

.method public final addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 5
    invoke-super {p0, p1, p2, p3}, Landroidx/core/widget/NestedScrollView;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 6
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->c(Landroid/view/View;)V

    return-void
.end method

.method public final addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 9
    invoke-super {p0, p1, p2}, Landroidx/core/widget/NestedScrollView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 10
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->c(Landroid/view/View;)V

    return-void
.end method

.method public final b()V
    .locals 10

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
    move v5, v3

    .line 11
    :cond_0
    :goto_0
    if-ge v5, v1, :cond_7

    .line 12
    .line 13
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    add-int/lit8 v5, v5, 0x1

    .line 18
    .line 19
    check-cast v6, Landroid/view/View;

    .line 20
    .line 21
    invoke-virtual {p0, v6}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->f(Landroid/view/View;)I

    .line 22
    .line 23
    .line 24
    move-result v7

    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 26
    .line 27
    .line 28
    move-result v8

    .line 29
    sub-int/2addr v7, v8

    .line 30
    iget-boolean v8, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->g:Z

    .line 31
    .line 32
    if-eqz v8, :cond_1

    .line 33
    .line 34
    move v8, v3

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 37
    .line 38
    .line 39
    move-result v8

    .line 40
    :goto_1
    add-int/2addr v7, v8

    .line 41
    if-gtz v7, :cond_4

    .line 42
    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    invoke-virtual {p0, v2}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->f(Landroid/view/View;)I

    .line 46
    .line 47
    .line 48
    move-result v8

    .line 49
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 50
    .line 51
    .line 52
    move-result v9

    .line 53
    sub-int/2addr v8, v9

    .line 54
    iget-boolean v9, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->g:Z

    .line 55
    .line 56
    if-eqz v9, :cond_2

    .line 57
    .line 58
    move v9, v3

    .line 59
    goto :goto_2

    .line 60
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 61
    .line 62
    .line 63
    move-result v9

    .line 64
    :goto_2
    add-int/2addr v8, v9

    .line 65
    if-le v7, v8, :cond_0

    .line 66
    .line 67
    :cond_3
    move-object v2, v6

    .line 68
    goto :goto_0

    .line 69
    :cond_4
    if-eqz v4, :cond_6

    .line 70
    .line 71
    invoke-virtual {p0, v4}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->f(Landroid/view/View;)I

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 76
    .line 77
    .line 78
    move-result v9

    .line 79
    sub-int/2addr v8, v9

    .line 80
    iget-boolean v9, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->g:Z

    .line 81
    .line 82
    if-eqz v9, :cond_5

    .line 83
    .line 84
    move v9, v3

    .line 85
    goto :goto_3

    .line 86
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 87
    .line 88
    .line 89
    move-result v9

    .line 90
    :goto_3
    add-int/2addr v8, v9

    .line 91
    if-ge v7, v8, :cond_0

    .line 92
    .line 93
    :cond_6
    move-object v4, v6

    .line 94
    goto :goto_0

    .line 95
    :cond_7
    if-eqz v2, :cond_c

    .line 96
    .line 97
    const/4 v0, 0x0

    .line 98
    if-nez v4, :cond_8

    .line 99
    .line 100
    move v1, v0

    .line 101
    goto :goto_5

    .line 102
    :cond_8
    invoke-virtual {p0, v4}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->f(Landroid/view/View;)I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    sub-int/2addr v1, v4

    .line 111
    iget-boolean v4, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->g:Z

    .line 112
    .line 113
    if-eqz v4, :cond_9

    .line 114
    .line 115
    move v4, v3

    .line 116
    goto :goto_4

    .line 117
    :cond_9
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    :goto_4
    add-int/2addr v1, v4

    .line 122
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    sub-int/2addr v1, v4

    .line 127
    invoke-static {v3, v1}, Ljava/lang/Math;->min(II)I

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    int-to-float v1, v1

    .line 132
    :goto_5
    iput v1, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->c:F

    .line 133
    .line 134
    iget-object v1, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 135
    .line 136
    if-eq v2, v1, :cond_d

    .line 137
    .line 138
    if-eqz v1, :cond_a

    .line 139
    .line 140
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->g()V

    .line 141
    .line 142
    .line 143
    :cond_a
    invoke-virtual {p0, v2}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->d(Landroid/view/View;)I

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    iput v1, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->e:I

    .line 148
    .line 149
    iput-object v2, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 150
    .line 151
    invoke-virtual {v2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    const-string v2, "-hastransparency"

    .line 160
    .line 161
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    if-eqz v1, :cond_b

    .line 166
    .line 167
    iget-object v1, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 168
    .line 169
    invoke-virtual {v1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 170
    .line 171
    .line 172
    :cond_b
    iget-object v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 173
    .line 174
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    const-string v1, "-nonconstant"

    .line 183
    .line 184
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    if-eqz v0, :cond_d

    .line 189
    .line 190
    iget-object v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->d:Lb0/a;

    .line 191
    .line 192
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :cond_c
    iget-object v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 197
    .line 198
    if-eqz v0, :cond_d

    .line 199
    .line 200
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->g()V

    .line 201
    .line 202
    .line 203
    :cond_d
    return-void
.end method

.method public final c(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "sticky"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->a:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    check-cast p1, Landroid/view/ViewGroup;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    :goto_0
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-ge v0, v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->c(Landroid/view/View;)V

    .line 41
    .line 42
    .line 43
    add-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    return-void
.end method

.method public final d(Landroid/view/View;)I
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

.method public final dispatchDraw(Landroid/graphics/Canvas;)V
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
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    const-string v2, "-hastransparency"

    .line 146
    .line 147
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    if-eqz v0, :cond_4

    .line 152
    .line 153
    iget-object v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 154
    .line 155
    const/high16 v2, 0x3f800000    # 1.0f

    .line 156
    .line 157
    invoke-virtual {v0, v2}, Landroid/view/View;->setAlpha(F)V

    .line 158
    .line 159
    .line 160
    iget-object v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 161
    .line 162
    invoke-virtual {v0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 163
    .line 164
    .line 165
    iget-object v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 166
    .line 167
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 168
    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 172
    .line 173
    invoke-virtual {v0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 174
    .line 175
    .line 176
    :goto_3
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 177
    .line 178
    .line 179
    :cond_5
    return-void
.end method

.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
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
    invoke-virtual {p0, v3}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->d(Landroid/view/View;)I

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
    invoke-virtual {p0, v3}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->e(Landroid/view/View;)I

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
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->f(Landroid/view/View;)I

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

.method public final f(Landroid/view/View;)I
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

.method public final g()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "-hastransparency"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 20
    .line 21
    const/high16 v1, 0x3f800000    # 1.0f

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 24
    .line 25
    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    iput-object v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 28
    .line 29
    iget-object v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->d:Lb0/a;

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->d:Lb0/a;

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

.method public final onLayout(ZIIII)V
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
    iget-object p2, p1, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 13
    .line 14
    if-eqz p2, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->g()V

    .line 17
    .line 18
    .line 19
    :cond_1
    iget-object p2, p1, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->a:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/util/ArrayList;->clear()V

    .line 22
    .line 23
    .line 24
    const/4 p2, 0x0

    .line 25
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->c(Landroid/view/View;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final onScrollChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroidx/core/widget/NestedScrollView;->onScrollChanged(IIII)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->b()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
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
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/StickyNestedScrollView;->f(Landroid/view/View;)I

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
