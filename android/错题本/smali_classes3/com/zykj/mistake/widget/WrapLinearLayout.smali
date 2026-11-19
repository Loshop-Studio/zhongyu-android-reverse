.class public Lcom/zykj/mistake/widget/WrapLinearLayout;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# instance fields
.field public final a:Lf5/f;

.field public b:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/zykj/mistake/widget/WrapLinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/zykj/mistake/R$style;->WarpLinearLayoutDefault:I

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/mistake/widget/WrapLinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance p3, Lf5/f;

    .line 5
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    if-nez p2, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    sget-object v0, Lcom/zykj/mistake/R$styleable;->WrapLinearLayout:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 7
    sget p2, Lcom/zykj/mistake/R$styleable;->WrapLinearLayout_gravity:I

    iget v0, p3, Lf5/f;->a:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p3, Lf5/f;->a:I

    .line 8
    sget p2, Lcom/zykj/mistake/R$styleable;->WrapLinearLayout_horizontal_Space:I

    iget v0, p3, Lf5/f;->b:F

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    iput p2, p3, Lf5/f;->b:F

    .line 9
    sget p2, Lcom/zykj/mistake/R$styleable;->WrapLinearLayout_vertical_Space:I

    iget v0, p3, Lf5/f;->c:F

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    iput p2, p3, Lf5/f;->c:F

    .line 10
    sget p2, Lcom/zykj/mistake/R$styleable;->WrapLinearLayout_isFull:I

    iget-boolean v0, p3, Lf5/f;->d:Z

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, p3, Lf5/f;->d:Z

    .line 11
    :goto_0
    iput-object p3, p0, Lcom/zykj/mistake/widget/WrapLinearLayout;->a:Lf5/f;

    return-void
.end method


# virtual methods
.method public getGravity()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/widget/WrapLinearLayout;->a:Lf5/f;

    .line 2
    .line 3
    iget v0, v0, Lf5/f;->a:I

    .line 4
    .line 5
    return v0
.end method

.method public getHorizontal_Space()F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/widget/WrapLinearLayout;->a:Lf5/f;

    .line 2
    .line 3
    iget v0, v0, Lf5/f;->b:F

    .line 4
    .line 5
    return v0
.end method

.method public getVertical_Space()F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/widget/WrapLinearLayout;->a:Lf5/f;

    .line 2
    .line 3
    iget v0, v0, Lf5/f;->c:F

    .line 4
    .line 5
    return v0
.end method

.method public final onLayout(ZIIII)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 p2, 0x0

    .line 6
    move p3, p2

    .line 7
    :goto_0
    iget-object p4, p0, Lcom/zykj/mistake/widget/WrapLinearLayout;->b:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {p4}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result p4

    .line 13
    if-ge p3, p4, :cond_4

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 16
    .line 17
    .line 18
    move-result p4

    .line 19
    iget-object p5, p0, Lcom/zykj/mistake/widget/WrapLinearLayout;->b:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {p5, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p5

    .line 25
    check-cast p5, Lf5/g;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget v1, p5, Lf5/g;->b:I

    .line 32
    .line 33
    iget-object v2, p5, Lf5/g;->a:Ljava/util/ArrayList;

    .line 34
    .line 35
    sub-int/2addr v0, v1

    .line 36
    move v1, p2

    .line 37
    :goto_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    iget-object v4, p0, Lcom/zykj/mistake/widget/WrapLinearLayout;->a:Lf5/f;

    .line 42
    .line 43
    if-ge v1, v3, :cond_3

    .line 44
    .line 45
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    check-cast v3, Landroid/view/View;

    .line 50
    .line 51
    iget-boolean v5, v4, Lf5/f;->d:Z

    .line 52
    .line 53
    if-eqz v5, :cond_0

    .line 54
    .line 55
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    add-int/2addr v5, p4

    .line 60
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    div-int v6, v0, v6

    .line 65
    .line 66
    add-int/2addr v6, v5

    .line 67
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    add-int/2addr v5, p1

    .line 72
    invoke-virtual {v3, p4, p1, v6, v5}, Landroid/view/View;->layout(IIII)V

    .line 73
    .line 74
    .line 75
    int-to-float p4, p4

    .line 76
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    int-to-float v3, v3

    .line 81
    iget v4, v4, Lf5/f;->b:F

    .line 82
    .line 83
    add-float/2addr v3, v4

    .line 84
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    div-int v4, v0, v4

    .line 89
    .line 90
    int-to-float v4, v4

    .line 91
    :goto_2
    add-float/2addr v3, v4

    .line 92
    add-float/2addr v3, p4

    .line 93
    float-to-int p4, v3

    .line 94
    goto :goto_4

    .line 95
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/mistake/widget/WrapLinearLayout;->getGravity()I

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    if-eqz v5, :cond_2

    .line 100
    .line 101
    const/4 v6, 0x2

    .line 102
    if-eq v5, v6, :cond_1

    .line 103
    .line 104
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    add-int/2addr v5, p4

    .line 109
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    add-int/2addr v6, p1

    .line 114
    invoke-virtual {v3, p4, p1, v5, v6}, Landroid/view/View;->layout(IIII)V

    .line 115
    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_1
    div-int/lit8 v5, v0, 0x2

    .line 119
    .line 120
    add-int/2addr v5, p4

    .line 121
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    .line 122
    .line 123
    .line 124
    move-result v6

    .line 125
    add-int/2addr v6, v5

    .line 126
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 127
    .line 128
    .line 129
    move-result v7

    .line 130
    add-int/2addr v7, p1

    .line 131
    invoke-virtual {v3, v5, p1, v6, v7}, Landroid/view/View;->layout(IIII)V

    .line 132
    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_2
    add-int v5, p4, v0

    .line 136
    .line 137
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    .line 138
    .line 139
    .line 140
    move-result v6

    .line 141
    add-int/2addr v6, v5

    .line 142
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 143
    .line 144
    .line 145
    move-result v7

    .line 146
    add-int/2addr v7, p1

    .line 147
    invoke-virtual {v3, v5, p1, v6, v7}, Landroid/view/View;->layout(IIII)V

    .line 148
    .line 149
    .line 150
    :goto_3
    int-to-float p4, p4

    .line 151
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    int-to-float v3, v3

    .line 156
    iget v4, v4, Lf5/f;->b:F

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :goto_4
    add-int/lit8 v1, v1, 0x1

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_3
    int-to-float p1, p1

    .line 163
    iget p4, p5, Lf5/g;->c:I

    .line 164
    .line 165
    int-to-float p4, p4

    .line 166
    iget p5, v4, Lf5/f;->c:F

    .line 167
    .line 168
    add-float/2addr p4, p5

    .line 169
    add-float/2addr p4, p1

    .line 170
    float-to-int p1, p4

    .line 171
    add-int/lit8 p3, p3, 0x1

    .line 172
    .line 173
    goto/16 :goto_0

    .line 174
    .line 175
    :cond_4
    return-void
.end method

.method public final onMeasure(II)V
    .locals 10

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->measureChildren(II)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lcom/zykj/mistake/widget/WrapLinearLayout;->a:Lf5/f;

    .line 25
    .line 26
    const/4 p2, 0x0

    .line 27
    const/high16 v5, -0x80000000

    .line 28
    .line 29
    if-eq v0, v5, :cond_3

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_0
    move v0, p2

    .line 35
    move v1, v0

    .line 36
    :goto_0
    if-ge v0, v4, :cond_2

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    int-to-float v1, v1

    .line 41
    iget v6, p1, Lf5/f;->b:F

    .line 42
    .line 43
    add-float/2addr v1, v6

    .line 44
    float-to-int v1, v1

    .line 45
    :cond_1
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    add-int/2addr v1, v6

    .line 54
    add-int/lit8 v0, v0, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    add-int/2addr v6, v0

    .line 66
    add-int/2addr v1, v6

    .line 67
    goto :goto_2

    .line 68
    :cond_3
    move v0, p2

    .line 69
    move v6, v0

    .line 70
    :goto_1
    if-ge v0, v4, :cond_5

    .line 71
    .line 72
    if-eqz v0, :cond_4

    .line 73
    .line 74
    int-to-float v6, v6

    .line 75
    iget v7, p1, Lf5/f;->b:F

    .line 76
    .line 77
    add-float/2addr v6, v7

    .line 78
    float-to-int v6, v6

    .line 79
    :cond_4
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    add-int/2addr v6, v7

    .line 88
    add-int/lit8 v0, v0, 0x1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 96
    .line 97
    .line 98
    move-result v7

    .line 99
    add-int/2addr v7, v0

    .line 100
    add-int/2addr v7, v6

    .line 101
    if-le v7, v1, :cond_6

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_6
    move v1, v7

    .line 105
    :goto_2
    new-instance v0, Lf5/g;

    .line 106
    .line 107
    invoke-direct {v0, p0}, Lf5/g;-><init>(Lcom/zykj/mistake/widget/WrapLinearLayout;)V

    .line 108
    .line 109
    .line 110
    new-instance v6, Ljava/util/ArrayList;

    .line 111
    .line 112
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 113
    .line 114
    .line 115
    iput-object v6, p0, Lcom/zykj/mistake/widget/WrapLinearLayout;->b:Ljava/util/ArrayList;

    .line 116
    .line 117
    move v6, p2

    .line 118
    :goto_3
    iget-object v7, v0, Lf5/g;->a:Ljava/util/ArrayList;

    .line 119
    .line 120
    if-ge v6, v4, :cond_9

    .line 121
    .line 122
    iget v8, v0, Lf5/g;->b:I

    .line 123
    .line 124
    invoke-virtual {p0, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 125
    .line 126
    .line 127
    move-result-object v9

    .line 128
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredWidth()I

    .line 129
    .line 130
    .line 131
    move-result v9

    .line 132
    add-int/2addr v9, v8

    .line 133
    int-to-float v8, v9

    .line 134
    iget v9, p1, Lf5/f;->b:F

    .line 135
    .line 136
    add-float/2addr v8, v9

    .line 137
    int-to-float v9, v1

    .line 138
    cmpl-float v8, v8, v9

    .line 139
    .line 140
    if-lez v8, :cond_8

    .line 141
    .line 142
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 143
    .line 144
    .line 145
    move-result v7

    .line 146
    if-nez v7, :cond_7

    .line 147
    .line 148
    invoke-virtual {p0, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 149
    .line 150
    .line 151
    move-result-object v7

    .line 152
    invoke-static {v0, v7}, Lf5/g;->a(Lf5/g;Landroid/view/View;)V

    .line 153
    .line 154
    .line 155
    iget-object v7, p0, Lcom/zykj/mistake/widget/WrapLinearLayout;->b:Ljava/util/ArrayList;

    .line 156
    .line 157
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    new-instance v0, Lf5/g;

    .line 161
    .line 162
    invoke-direct {v0, p0}, Lf5/g;-><init>(Lcom/zykj/mistake/widget/WrapLinearLayout;)V

    .line 163
    .line 164
    .line 165
    goto :goto_4

    .line 166
    :cond_7
    iget-object v7, p0, Lcom/zykj/mistake/widget/WrapLinearLayout;->b:Ljava/util/ArrayList;

    .line 167
    .line 168
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    new-instance v0, Lf5/g;

    .line 172
    .line 173
    invoke-direct {v0, p0}, Lf5/g;-><init>(Lcom/zykj/mistake/widget/WrapLinearLayout;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p0, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 177
    .line 178
    .line 179
    move-result-object v7

    .line 180
    invoke-static {v0, v7}, Lf5/g;->a(Lf5/g;Landroid/view/View;)V

    .line 181
    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_8
    invoke-virtual {p0, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 185
    .line 186
    .line 187
    move-result-object v7

    .line 188
    invoke-static {v0, v7}, Lf5/g;->a(Lf5/g;Landroid/view/View;)V

    .line 189
    .line 190
    .line 191
    :goto_4
    add-int/lit8 v6, v6, 0x1

    .line 192
    .line 193
    goto :goto_3

    .line 194
    :cond_9
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 195
    .line 196
    .line 197
    move-result v4

    .line 198
    if-lez v4, :cond_a

    .line 199
    .line 200
    iget-object v4, p0, Lcom/zykj/mistake/widget/WrapLinearLayout;->b:Ljava/util/ArrayList;

    .line 201
    .line 202
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v4

    .line 206
    if-nez v4, :cond_a

    .line 207
    .line 208
    iget-object v4, p0, Lcom/zykj/mistake/widget/WrapLinearLayout;->b:Ljava/util/ArrayList;

    .line 209
    .line 210
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    :cond_a
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 218
    .line 219
    .line 220
    move-result v4

    .line 221
    add-int/2addr v4, v0

    .line 222
    :goto_5
    iget-object v0, p0, Lcom/zykj/mistake/widget/WrapLinearLayout;->b:Ljava/util/ArrayList;

    .line 223
    .line 224
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    if-ge p2, v0, :cond_c

    .line 229
    .line 230
    if-eqz p2, :cond_b

    .line 231
    .line 232
    int-to-float v0, v4

    .line 233
    iget v4, p1, Lf5/f;->c:F

    .line 234
    .line 235
    add-float/2addr v0, v4

    .line 236
    float-to-int v4, v0

    .line 237
    :cond_b
    iget-object v0, p0, Lcom/zykj/mistake/widget/WrapLinearLayout;->b:Ljava/util/ArrayList;

    .line 238
    .line 239
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    check-cast v0, Lf5/g;

    .line 244
    .line 245
    iget v0, v0, Lf5/g;->c:I

    .line 246
    .line 247
    add-int/2addr v4, v0

    .line 248
    add-int/lit8 p2, p2, 0x1

    .line 249
    .line 250
    goto :goto_5

    .line 251
    :cond_c
    if-eq v2, v5, :cond_e

    .line 252
    .line 253
    const/high16 p1, 0x40000000    # 2.0f

    .line 254
    .line 255
    if-eq v2, p1, :cond_f

    .line 256
    .line 257
    :cond_d
    move v3, v4

    .line 258
    goto :goto_6

    .line 259
    :cond_e
    if-le v4, v3, :cond_d

    .line 260
    .line 261
    :cond_f
    :goto_6
    invoke-virtual {p0, v1, v3}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 262
    .line 263
    .line 264
    return-void
.end method

.method public setGravity(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/widget/WrapLinearLayout;->a:Lf5/f;

    .line 2
    .line 3
    iput p1, v0, Lf5/f;->a:I

    .line 4
    .line 5
    return-void
.end method

.method public setHorizontal_Space(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/widget/WrapLinearLayout;->a:Lf5/f;

    .line 2
    .line 3
    iput p1, v0, Lf5/f;->b:F

    .line 4
    .line 5
    return-void
.end method

.method public setIsFull(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/widget/WrapLinearLayout;->a:Lf5/f;

    .line 2
    .line 3
    iput-boolean p1, v0, Lf5/f;->d:Z

    .line 4
    .line 5
    return-void
.end method

.method public setVertical_Space(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/widget/WrapLinearLayout;->a:Lf5/f;

    .line 2
    .line 3
    iput p1, v0, Lf5/f;->c:F

    .line 4
    .line 5
    return-void
.end method
