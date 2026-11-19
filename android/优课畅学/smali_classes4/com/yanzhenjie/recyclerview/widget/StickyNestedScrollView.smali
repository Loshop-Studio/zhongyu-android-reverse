.class public Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;
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


# direct methods
.method private b(Landroid/view/View;)Z
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->g(Landroid/view/View;)Ljava/lang/String;

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
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->a:Ljava/util/ArrayList;

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

.method private c()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move-object v2, v1

    .line 9
    move-object v3, v2

    .line 10
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    const/4 v5, 0x0

    .line 15
    if-eqz v4, :cond_7

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    check-cast v4, Landroid/view/View;

    .line 22
    .line 23
    invoke-direct {p0, v4}, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->h(Landroid/view/View;)I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    sub-int/2addr v6, v7

    .line 32
    iget-boolean v7, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->g:Z

    .line 33
    .line 34
    if-eqz v7, :cond_1

    .line 35
    .line 36
    move v7, v5

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    :goto_1
    add-int/2addr v6, v7

    .line 43
    if-gtz v6, :cond_4

    .line 44
    .line 45
    if-eqz v2, :cond_3

    .line 46
    .line 47
    invoke-direct {p0, v2}, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->h(Landroid/view/View;)I

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    sub-int/2addr v7, v8

    .line 56
    iget-boolean v8, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->g:Z

    .line 57
    .line 58
    if-eqz v8, :cond_2

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    :goto_2
    add-int/2addr v7, v5

    .line 66
    if-le v6, v7, :cond_0

    .line 67
    .line 68
    :cond_3
    move-object v2, v4

    .line 69
    goto :goto_0

    .line 70
    :cond_4
    if-eqz v3, :cond_6

    .line 71
    .line 72
    invoke-direct {p0, v3}, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->h(Landroid/view/View;)I

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 77
    .line 78
    .line 79
    move-result v8

    .line 80
    sub-int/2addr v7, v8

    .line 81
    iget-boolean v8, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->g:Z

    .line 82
    .line 83
    if-eqz v8, :cond_5

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    :goto_3
    add-int/2addr v7, v5

    .line 91
    if-ge v6, v7, :cond_0

    .line 92
    .line 93
    :cond_6
    move-object v3, v4

    .line 94
    goto :goto_0

    .line 95
    :cond_7
    if-eqz v2, :cond_e

    .line 96
    .line 97
    if-nez v3, :cond_8

    .line 98
    .line 99
    const/4 v0, 0x0

    .line 100
    goto :goto_5

    .line 101
    :cond_8
    invoke-direct {p0, v3}, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->h(Landroid/view/View;)I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    sub-int/2addr v0, v3

    .line 110
    iget-boolean v3, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->g:Z

    .line 111
    .line 112
    if-eqz v3, :cond_9

    .line 113
    .line 114
    move v3, v5

    .line 115
    goto :goto_4

    .line 116
    :cond_9
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    :goto_4
    add-int/2addr v0, v3

    .line 121
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    sub-int/2addr v0, v3

    .line 126
    invoke-static {v5, v0}, Ljava/lang/Math;->min(II)I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    int-to-float v0, v0

    .line 131
    :goto_5
    iput v0, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->c:F

    .line 132
    .line 133
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 134
    .line 135
    if-eq v2, v0, :cond_11

    .line 136
    .line 137
    if-eqz v0, :cond_c

    .line 138
    .line 139
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->l:Ljava/util/List;

    .line 140
    .line 141
    if-eqz v0, :cond_b

    .line 142
    .line 143
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    if-nez v3, :cond_a

    .line 152
    .line 153
    goto :goto_6

    .line 154
    :cond_a
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-static {v0}, Lcom/blankj/utilcode/util/p;->a(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    throw v1

    .line 162
    :cond_b
    :goto_6
    invoke-direct {p0}, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->m()V

    .line 163
    .line 164
    .line 165
    :cond_c
    invoke-direct {p0, v2}, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->e(Landroid/view/View;)I

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    iput v0, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->e:I

    .line 170
    .line 171
    invoke-direct {p0, v2}, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->l(Landroid/view/View;)V

    .line 172
    .line 173
    .line 174
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->l:Ljava/util/List;

    .line 175
    .line 176
    if-eqz v0, :cond_11

    .line 177
    .line 178
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    if-nez v2, :cond_d

    .line 187
    .line 188
    goto :goto_8

    .line 189
    :cond_d
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-static {v0}, Lcom/blankj/utilcode/util/p;->a(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    throw v1

    .line 197
    :cond_e
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 198
    .line 199
    if-eqz v0, :cond_11

    .line 200
    .line 201
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->l:Ljava/util/List;

    .line 202
    .line 203
    if-eqz v0, :cond_10

    .line 204
    .line 205
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    if-nez v2, :cond_f

    .line 214
    .line 215
    goto :goto_7

    .line 216
    :cond_f
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-static {v0}, Lcom/blankj/utilcode/util/p;->a(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    throw v1

    .line 224
    :cond_10
    :goto_7
    invoke-direct {p0}, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->m()V

    .line 225
    .line 226
    .line 227
    :cond_11
    :goto_8
    return-void
.end method

.method private d(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->b(Landroid/view/View;)Z

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
    invoke-direct {p0, v1}, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->d(Landroid/view/View;)V

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

.method private e(Landroid/view/View;)I
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

.method private f(Landroid/view/View;)I
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

.method private g(Landroid/view/View;)Ljava/lang/String;
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

.method private h(Landroid/view/View;)I
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

.method private i(Landroid/view/View;)V
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

.method private j()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->m()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->a:Ljava/util/ArrayList;

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
    invoke-direct {p0, v0}, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->d(Landroid/view/View;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->c()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method private k(Landroid/view/View;)V
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

.method private l(Landroid/view/View;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->g(Landroid/view/View;)Ljava/lang/String;

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
    iget-object p1, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 18
    .line 19
    invoke-direct {p0, p1}, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->i(Landroid/view/View;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object p1, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 23
    .line 24
    invoke-direct {p0, p1}, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->g(Landroid/view/View;)Ljava/lang/String;

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
    iget-object p1, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->d:Ljava/lang/Runnable;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void
.end method

.method private m()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->g(Landroid/view/View;)Ljava/lang/String;

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
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 16
    .line 17
    invoke-direct {p0, v0}, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->k(Landroid/view/View;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 22
    .line 23
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->d:Ljava/lang/Runnable;

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 26
    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public addView(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/core/widget/NestedScrollView;->addView(Landroid/view/View;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->d(Landroid/view/View;)V

    return-void
.end method

.method public addView(Landroid/view/View;I)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/core/widget/NestedScrollView;->addView(Landroid/view/View;I)V

    .line 4
    invoke-direct {p0, p1}, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->d(Landroid/view/View;)V

    return-void
.end method

.method public addView(Landroid/view/View;II)V
    .locals 0

    .line 7
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    .line 8
    invoke-direct {p0, p1}, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->d(Landroid/view/View;)V

    return-void
.end method

.method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 5
    invoke-super {p0, p1, p2, p3}, Landroidx/core/widget/NestedScrollView;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 6
    invoke-direct {p0, p1}, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->d(Landroid/view/View;)V

    return-void
.end method

.method public addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 9
    invoke-super {p0, p1, p2}, Landroidx/core/widget/NestedScrollView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 10
    invoke-direct {p0, p1}, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->d(Landroid/view/View;)V

    return-void
.end method

.method public dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->b:Landroid/view/View;

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
    iget v1, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->e:I

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
    iget v2, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->c:F

    .line 25
    .line 26
    add-float/2addr v1, v2

    .line 27
    iget-boolean v2, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->g:Z

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
    iget-boolean v0, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->g:Z

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    iget v0, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->c:F

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
    iget v4, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->e:I

    .line 58
    .line 59
    sub-int/2addr v2, v4

    .line 60
    int-to-float v2, v2

    .line 61
    iget-object v4, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 62
    .line 63
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    iget v5, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->i:I

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
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->j:Landroid/graphics/drawable/Drawable;

    .line 77
    .line 78
    if-eqz v0, :cond_2

    .line 79
    .line 80
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 81
    .line 82
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    iget-object v2, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 87
    .line 88
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    iget-object v4, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 93
    .line 94
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    iget v5, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->i:I

    .line 99
    .line 100
    add-int/2addr v4, v5

    .line 101
    iget-object v5, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->j:Landroid/graphics/drawable/Drawable;

    .line 102
    .line 103
    invoke-virtual {v5, v3, v0, v2, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 104
    .line 105
    .line 106
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->j:Landroid/graphics/drawable/Drawable;

    .line 107
    .line 108
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 109
    .line 110
    .line 111
    :cond_2
    iget-boolean v0, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->g:Z

    .line 112
    .line 113
    if-eqz v0, :cond_3

    .line 114
    .line 115
    iget v0, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->c:F

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
    iget-object v3, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->b:Landroid/view/View;

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
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 136
    .line 137
    invoke-direct {p0, v0}, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->g(Landroid/view/View;)Ljava/lang/String;

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
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 150
    .line 151
    invoke-direct {p0, v0}, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->k(Landroid/view/View;)V

    .line 152
    .line 153
    .line 154
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 155
    .line 156
    invoke-virtual {v0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 157
    .line 158
    .line 159
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 160
    .line 161
    invoke-direct {p0, v0}, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->i(Landroid/view/View;)V

    .line 162
    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_4
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->b:Landroid/view/View;

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
    iput-boolean v1, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->f:Z

    .line 9
    .line 10
    :cond_0
    iget-boolean v0, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->f:Z

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->b:Landroid/view/View;

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
    iput-boolean v0, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->f:Z

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
    iget-object v3, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->b:Landroid/view/View;

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
    iget v4, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->c:F

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
    iget-object v3, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 49
    .line 50
    invoke-direct {p0, v3}, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->e(Landroid/view/View;)I

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
    iget-object v3, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 64
    .line 65
    invoke-direct {p0, v3}, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->f(Landroid/view/View;)I

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
    iput-boolean v1, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->f:Z

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_3
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 80
    .line 81
    if-nez v0, :cond_4

    .line 82
    .line 83
    iput-boolean v2, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->f:Z

    .line 84
    .line 85
    :cond_4
    :goto_2
    iget-boolean v0, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->f:Z

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
    iget v1, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->c:F

    .line 95
    .line 96
    add-float/2addr v0, v1

    .line 97
    iget-object v1, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 98
    .line 99
    invoke-direct {p0, v1}, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->h(Landroid/view/View;)I

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

.method public onDetachedFromWindow()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->d:Ljava/lang/Runnable;

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
    iget-boolean p2, p1, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->h:Z

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    const/4 p2, 0x1

    .line 10
    iput-boolean p2, p1, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->g:Z

    .line 11
    .line 12
    :cond_0
    invoke-direct {p0}, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->j()V

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
    invoke-direct {p0}, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->c()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->f:Z

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
    iget v1, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->c:F

    .line 11
    .line 12
    add-float/2addr v0, v1

    .line 13
    iget-object v1, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->b:Landroid/view/View;

    .line 14
    .line 15
    invoke-direct {p0, v1}, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->h(Landroid/view/View;)I

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
    iput-boolean v1, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->k:Z

    .line 33
    .line 34
    :cond_1
    iget-boolean v0, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->k:Z

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
    iput-boolean v1, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->k:Z

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
    iput-boolean v1, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->k:Z

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
    iput-boolean p1, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->g:Z

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->h:Z

    .line 8
    .line 9
    return-void
.end method

.method public setShadowDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->j:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-void
.end method

.method public setShadowHeight(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/yanzhenjie/recyclerview/widget/StickyNestedScrollView;->i:I

    .line 2
    .line 3
    return-void
.end method
