.class public Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Landroid/view/ViewGroup;"
    }
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public final h:Ljava/util/ArrayList;

.field public i:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->h:Ljava/util/ArrayList;

    .line 4
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->NineGridImageView:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 5
    sget p2, Lcom/xuexiang/xui/R$styleable;->NineGridImageView_ngiv_imgGap:I

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    float-to-int p2, p2

    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->e:I

    .line 6
    sget p2, Lcom/xuexiang/xui/R$styleable;->NineGridImageView_ngiv_singleImgSize:I

    const/4 v0, -0x1

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->f:I

    .line 7
    sget p2, Lcom/xuexiang/xui/R$styleable;->NineGridImageView_ngiv_showStyle:I

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->d:I

    .line 8
    sget p2, Lcom/xuexiang/xui/R$styleable;->NineGridImageView_ngiv_maxSize:I

    const/16 v0, 0x9

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->c:I

    .line 9
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method


# virtual methods
.method public final onLayout(ZIIII)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:Ljava/util/List;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iget p2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->c:I

    .line 11
    .line 12
    if-lez p2, :cond_1

    .line 13
    .line 14
    if-le p1, p2, :cond_1

    .line 15
    .line 16
    move p1, p2

    .line 17
    :cond_1
    if-gtz p1, :cond_2

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_2
    const/4 p2, 0x0

    .line 21
    :goto_0
    if-ge p2, p1, :cond_3

    .line 22
    .line 23
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    check-cast p3, Landroid/widget/ImageView;

    .line 28
    .line 29
    iget p4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->b:I

    .line 30
    .line 31
    div-int p5, p2, p4

    .line 32
    .line 33
    rem-int p4, p2, p4

    .line 34
    .line 35
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 36
    .line 37
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->e:I

    .line 38
    .line 39
    add-int/2addr v0, v1

    .line 40
    mul-int/2addr v0, p4

    .line 41
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 42
    .line 43
    .line 44
    move-result p4

    .line 45
    add-int/2addr p4, v0

    .line 46
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 47
    .line 48
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->e:I

    .line 49
    .line 50
    add-int/2addr v0, v1

    .line 51
    mul-int/2addr v0, p5

    .line 52
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 53
    .line 54
    .line 55
    move-result p5

    .line 56
    add-int/2addr p5, v0

    .line 57
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 58
    .line 59
    add-int v1, p4, v0

    .line 60
    .line 61
    add-int/2addr v0, p5

    .line 62
    invoke-virtual {p3, p4, p5, v1, v0}, Landroid/view/View;->layout(IIII)V

    .line 63
    .line 64
    .line 65
    add-int/lit8 p2, p2, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    :goto_1
    return-void
.end method

.method public final onMeasure(II)V
    .locals 4

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    sub-int v0, p1, v0

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    sub-int/2addr v0, v1

    .line 23
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:Ljava/util/List;

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-lez v1, :cond_1

    .line 32
    .line 33
    iget-object p2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:Ljava/util/List;

    .line 34
    .line 35
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    const/4 v1, 0x1

    .line 40
    if-ne p2, v1, :cond_0

    .line 41
    .line 42
    iget p2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->f:I

    .line 43
    .line 44
    const/4 v2, -0x1

    .line 45
    if-eq p2, v2, :cond_0

    .line 46
    .line 47
    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    iget-object p2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->h:Ljava/util/ArrayList;

    .line 55
    .line 56
    const/4 v2, 0x0

    .line 57
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    check-cast p2, Landroid/widget/ImageView;

    .line 62
    .line 63
    sget-object v2, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 64
    .line 65
    invoke-virtual {p2, v2}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 66
    .line 67
    .line 68
    iget p2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->e:I

    .line 69
    .line 70
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->b:I

    .line 71
    .line 72
    add-int/lit8 v3, v2, -0x1

    .line 73
    .line 74
    mul-int/2addr v3, p2

    .line 75
    sub-int/2addr v0, v3

    .line 76
    div-int/2addr v0, v2

    .line 77
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 78
    .line 79
    :goto_0
    iget p2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 80
    .line 81
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->a:I

    .line 82
    .line 83
    mul-int/2addr p2, v0

    .line 84
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->e:I

    .line 85
    .line 86
    sub-int/2addr v0, v1

    .line 87
    mul-int/2addr v0, v2

    .line 88
    add-int/2addr v0, p2

    .line 89
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    add-int/2addr p2, v0

    .line 94
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    add-int/2addr p2, v0

    .line 99
    :cond_1
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public setAdapter(Lq2/c;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setGap(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->e:I

    .line 2
    .line 3
    return-void
.end method

.method public setImagesData(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_10

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_9

    .line 10
    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->c:I

    .line 20
    .line 21
    if-lez v2, :cond_1

    .line 22
    .line 23
    if-le v1, v2, :cond_1

    .line 24
    .line 25
    move v1, v2

    .line 26
    :cond_1
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->d:I

    .line 27
    .line 28
    const/4 v3, 0x2

    .line 29
    new-array v4, v3, [I

    .line 30
    .line 31
    const/4 v5, 0x1

    .line 32
    const/4 v6, 0x3

    .line 33
    if-eq v2, v5, :cond_3

    .line 34
    .line 35
    div-int/lit8 v2, v1, 0x3

    .line 36
    .line 37
    rem-int/lit8 v3, v1, 0x3

    .line 38
    .line 39
    if-nez v3, :cond_2

    .line 40
    .line 41
    move v3, v0

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move v3, v5

    .line 44
    :goto_0
    add-int/2addr v2, v3

    .line 45
    aput v2, v4, v0

    .line 46
    .line 47
    aput v6, v4, v5

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_3
    if-gt v1, v3, :cond_4

    .line 51
    .line 52
    aput v5, v4, v0

    .line 53
    .line 54
    aput v1, v4, v5

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_4
    if-ne v1, v6, :cond_5

    .line 58
    .line 59
    aput v5, v4, v0

    .line 60
    .line 61
    aput v6, v4, v5

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_5
    const/4 v2, 0x6

    .line 65
    if-gt v1, v2, :cond_6

    .line 66
    .line 67
    aput v3, v4, v0

    .line 68
    .line 69
    div-int/lit8 v2, v1, 0x2

    .line 70
    .line 71
    rem-int/lit8 v3, v1, 0x2

    .line 72
    .line 73
    add-int/2addr v3, v2

    .line 74
    aput v3, v4, v5

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_6
    div-int/lit8 v2, v1, 0x3

    .line 78
    .line 79
    rem-int/lit8 v3, v1, 0x3

    .line 80
    .line 81
    if-nez v3, :cond_7

    .line 82
    .line 83
    move v3, v0

    .line 84
    goto :goto_1

    .line 85
    :cond_7
    move v3, v5

    .line 86
    :goto_1
    add-int/2addr v2, v3

    .line 87
    aput v2, v4, v0

    .line 88
    .line 89
    aput v6, v4, v5

    .line 90
    .line 91
    :goto_2
    aget v2, v4, v0

    .line 92
    .line 93
    iput v2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->a:I

    .line 94
    .line 95
    aget v2, v4, v5

    .line 96
    .line 97
    iput v2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->b:I

    .line 98
    .line 99
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:Ljava/util/List;

    .line 100
    .line 101
    const/4 v3, 0x0

    .line 102
    const-string v4, "Your must set a NineGridImageViewAdapter for NineGirdImageView"

    .line 103
    .line 104
    const-string v5, "NineGirdImageView"

    .line 105
    .line 106
    if-nez v2, :cond_a

    .line 107
    .line 108
    :goto_3
    if-ge v0, v1, :cond_f

    .line 109
    .line 110
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->h:Ljava/util/ArrayList;

    .line 111
    .line 112
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    if-ge v0, v6, :cond_8

    .line 117
    .line 118
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    check-cast v2, Landroid/widget/ImageView;

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_8
    invoke-static {v5, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 126
    .line 127
    .line 128
    move-object v2, v3

    .line 129
    :goto_4
    if-nez v2, :cond_9

    .line 130
    .line 131
    goto :goto_7

    .line 132
    :cond_9
    invoke-virtual {p0}, Landroid/view/ViewGroup;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 133
    .line 134
    .line 135
    move-result-object v6

    .line 136
    invoke-virtual {p0, v2, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 137
    .line 138
    .line 139
    add-int/lit8 v0, v0, 0x1

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_a
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->c:I

    .line 147
    .line 148
    if-lez v2, :cond_b

    .line 149
    .line 150
    if-le v0, v2, :cond_b

    .line 151
    .line 152
    move v0, v2

    .line 153
    :cond_b
    if-le v0, v1, :cond_c

    .line 154
    .line 155
    sub-int/2addr v0, v1

    .line 156
    invoke-virtual {p0, v1, v0}, Landroid/view/ViewGroup;->removeViews(II)V

    .line 157
    .line 158
    .line 159
    goto :goto_8

    .line 160
    :cond_c
    if-ge v0, v1, :cond_f

    .line 161
    .line 162
    :goto_5
    if-ge v0, v1, :cond_f

    .line 163
    .line 164
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->h:Ljava/util/ArrayList;

    .line 165
    .line 166
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 167
    .line 168
    .line 169
    move-result v6

    .line 170
    if-ge v0, v6, :cond_d

    .line 171
    .line 172
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    check-cast v2, Landroid/widget/ImageView;

    .line 177
    .line 178
    goto :goto_6

    .line 179
    :cond_d
    invoke-static {v5, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 180
    .line 181
    .line 182
    move-object v2, v3

    .line 183
    :goto_6
    if-nez v2, :cond_e

    .line 184
    .line 185
    :goto_7
    return-void

    .line 186
    :cond_e
    invoke-virtual {p0}, Landroid/view/ViewGroup;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 187
    .line 188
    .line 189
    move-result-object v6

    .line 190
    invoke-virtual {p0, v2, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 191
    .line 192
    .line 193
    add-int/lit8 v0, v0, 0x1

    .line 194
    .line 195
    goto :goto_5

    .line 196
    :cond_f
    :goto_8
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:Ljava/util/List;

    .line 197
    .line 198
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 199
    .line 200
    .line 201
    return-void

    .line 202
    :cond_10
    :goto_9
    const/16 p1, 0x8

    .line 203
    .line 204
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 205
    .line 206
    .line 207
    return-void
.end method

.method public setItemImageClickListener(Lq2/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq2/a;",
            ")V"
        }
    .end annotation

    .line 1
    return-void
.end method

.method public setItemImageLongClickListener(Lq2/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq2/b;",
            ")V"
        }
    .end annotation

    .line 1
    return-void
.end method

.method public setMaxSize(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->c:I

    .line 2
    .line 3
    return-void
.end method

.method public setShowStyle(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->d:I

    .line 2
    .line 3
    return-void
.end method

.method public setSingleImgSize(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->f:I

    .line 2
    .line 3
    return-void
.end method
