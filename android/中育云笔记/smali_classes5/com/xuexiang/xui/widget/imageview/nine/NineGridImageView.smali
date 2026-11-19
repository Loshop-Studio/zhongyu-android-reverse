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
.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:Ljava/util/List;

.field public l:Ljava/util/List;


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

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->k:Ljava/util/List;

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->e(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public a(II)[I
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    if-eq p2, v1, :cond_1

    .line 6
    .line 7
    div-int/lit8 p2, p1, 0x3

    .line 8
    .line 9
    const/4 v2, 0x3

    .line 10
    rem-int/2addr p1, v2

    .line 11
    const/4 v3, 0x0

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    move p1, v3

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move p1, v1

    .line 17
    :goto_0
    add-int/2addr p2, p1

    .line 18
    aput p2, v0, v3

    .line 19
    .line 20
    aput v2, v0, v1

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_1
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->b(I[I)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method public final b(I[I)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x2

    .line 4
    if-gt p1, v2, :cond_0

    .line 5
    .line 6
    aput v1, p2, v0

    .line 7
    .line 8
    aput p1, p2, v1

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const/4 v3, 0x4

    .line 12
    const/4 v4, 0x3

    .line 13
    if-ne p1, v4, :cond_2

    .line 14
    .line 15
    iget p1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->j:I

    .line 16
    .line 17
    if-eq p1, v2, :cond_1

    .line 18
    .line 19
    if-eq p1, v4, :cond_1

    .line 20
    .line 21
    if-eq p1, v3, :cond_1

    .line 22
    .line 23
    aput v1, p2, v0

    .line 24
    .line 25
    aput v4, p2, v1

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    aput v2, p2, v0

    .line 29
    .line 30
    aput v2, p2, v1

    .line 31
    .line 32
    return-void

    .line 33
    :cond_2
    const/4 v5, 0x6

    .line 34
    if-gt p1, v5, :cond_4

    .line 35
    .line 36
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->j:I

    .line 37
    .line 38
    if-eq v5, v2, :cond_3

    .line 39
    .line 40
    if-eq v5, v4, :cond_3

    .line 41
    .line 42
    if-eq v5, v3, :cond_3

    .line 43
    .line 44
    aput v2, p2, v0

    .line 45
    .line 46
    div-int/lit8 v0, p1, 0x2

    .line 47
    .line 48
    rem-int/2addr p1, v2

    .line 49
    add-int/2addr v0, p1

    .line 50
    aput v0, p2, v1

    .line 51
    .line 52
    return-void

    .line 53
    :cond_3
    aput v4, p2, v0

    .line 54
    .line 55
    aput v4, p2, v1

    .line 56
    .line 57
    return-void

    .line 58
    :cond_4
    div-int/lit8 v2, p1, 0x3

    .line 59
    .line 60
    rem-int/2addr p1, v4

    .line 61
    if-nez p1, :cond_5

    .line 62
    .line 63
    move p1, v0

    .line 64
    goto :goto_0

    .line 65
    :cond_5
    move p1, v1

    .line 66
    :goto_0
    add-int/2addr v2, p1

    .line 67
    aput v2, p2, v0

    .line 68
    .line 69
    aput v4, p2, v1

    .line 70
    .line 71
    return-void
.end method

.method public final c(I)Landroid/widget/ImageView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->k:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ge p1, v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->k:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Landroid/widget/ImageView;

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    const-string p1, "NineGirdImageView"

    .line 19
    .line 20
    const-string v0, "Your must set a NineGridImageViewAdapter for NineGirdImageView"

    .line 21
    .line 22
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    return-object p1
.end method

.method public final d(I)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->e:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    if-le p1, v0, :cond_0

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    return p1
.end method

.method public final e(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->NineGridImageView:[I

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget p2, Lcom/xuexiang/xui/R$styleable;->NineGridImageView_ngiv_imgGap:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    float-to-int p2, p2

    .line 15
    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 16
    .line 17
    sget p2, Lcom/xuexiang/xui/R$styleable;->NineGridImageView_ngiv_singleImgSize:I

    .line 18
    .line 19
    const/4 v0, -0x1

    .line 20
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->h:I

    .line 25
    .line 26
    sget p2, Lcom/xuexiang/xui/R$styleable;->NineGridImageView_ngiv_showStyle:I

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->f:I

    .line 34
    .line 35
    sget p2, Lcom/xuexiang/xui/R$styleable;->NineGridImageView_ngiv_maxSize:I

    .line 36
    .line 37
    const/16 v0, 0x9

    .line 38
    .line 39
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->e:I

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->l:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->d(I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->j:I

    .line 15
    .line 16
    if-eqz v1, :cond_6

    .line 17
    .line 18
    const/4 v1, 0x2

    .line 19
    if-gt v0, v1, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 v1, 0x3

    .line 23
    if-eq v0, v1, :cond_5

    .line 24
    .line 25
    const/4 v1, 0x4

    .line 26
    if-eq v0, v1, :cond_4

    .line 27
    .line 28
    const/4 v1, 0x5

    .line 29
    if-eq v0, v1, :cond_3

    .line 30
    .line 31
    const/4 v1, 0x6

    .line 32
    if-eq v0, v1, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i(I)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_2
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->j(I)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_3
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g(I)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_4
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->h(I)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_5
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->k(I)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_6
    :goto_0
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i(I)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final g(I)V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    if-ge v0, p1, :cond_f

    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    check-cast v1, Landroid/widget/ImageView;

    .line 9
    .line 10
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->j:I

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    const/4 v4, 0x3

    .line 14
    const/4 v5, 0x2

    .line 15
    if-eq v2, v5, :cond_a

    .line 16
    .line 17
    if-eq v2, v4, :cond_5

    .line 18
    .line 19
    const/4 v6, 0x4

    .line 20
    if-eq v2, v6, :cond_0

    .line 21
    .line 22
    goto/16 :goto_a

    .line 23
    .line 24
    :cond_0
    if-nez v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 35
    .line 36
    mul-int/lit8 v7, v6, 0x2

    .line 37
    .line 38
    add-int/2addr v7, v2

    .line 39
    iget v8, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 40
    .line 41
    add-int/2addr v7, v8

    .line 42
    mul-int/2addr v6, v4

    .line 43
    add-int/2addr v6, v8

    .line 44
    div-int/2addr v6, v5

    .line 45
    :goto_1
    add-int/2addr v6, v3

    .line 46
    goto :goto_3

    .line 47
    :cond_1
    if-ne v0, v3, :cond_2

    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 58
    .line 59
    mul-int/lit8 v7, v6, 0x3

    .line 60
    .line 61
    iget v8, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 62
    .line 63
    add-int/2addr v7, v8

    .line 64
    div-int/2addr v7, v5

    .line 65
    add-int/2addr v3, v7

    .line 66
    add-int/2addr v3, v8

    .line 67
    mul-int/lit8 v7, v6, 0x2

    .line 68
    .line 69
    add-int/2addr v7, v2

    .line 70
    add-int/2addr v7, v8

    .line 71
    mul-int/2addr v6, v4

    .line 72
    add-int/2addr v6, v8

    .line 73
    div-int/2addr v6, v5

    .line 74
    goto :goto_1

    .line 75
    :cond_2
    if-ne v0, v5, :cond_3

    .line 76
    .line 77
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 82
    .line 83
    mul-int/2addr v3, v5

    .line 84
    add-int/2addr v2, v3

    .line 85
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 86
    .line 87
    mul-int/2addr v3, v5

    .line 88
    add-int/2addr v2, v3

    .line 89
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 94
    .line 95
    :goto_2
    add-int v7, v2, v4

    .line 96
    .line 97
    add-int v6, v3, v4

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_3
    if-ne v0, v4, :cond_4

    .line 101
    .line 102
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 107
    .line 108
    mul-int/2addr v3, v5

    .line 109
    add-int/2addr v2, v3

    .line 110
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 111
    .line 112
    mul-int/2addr v3, v5

    .line 113
    add-int/2addr v2, v3

    .line 114
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 119
    .line 120
    add-int/2addr v3, v4

    .line 121
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 122
    .line 123
    add-int/2addr v3, v5

    .line 124
    goto :goto_2

    .line 125
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 130
    .line 131
    mul-int/2addr v3, v5

    .line 132
    add-int/2addr v2, v3

    .line 133
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 134
    .line 135
    mul-int/2addr v3, v5

    .line 136
    add-int/2addr v2, v3

    .line 137
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 142
    .line 143
    mul-int/lit8 v6, v4, 0x2

    .line 144
    .line 145
    add-int/2addr v3, v6

    .line 146
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 147
    .line 148
    mul-int/2addr v6, v5

    .line 149
    add-int/2addr v3, v6

    .line 150
    goto :goto_2

    .line 151
    :goto_3
    invoke-virtual {v1, v2, v3, v7, v6}, Landroid/view/View;->layout(IIII)V

    .line 152
    .line 153
    .line 154
    goto/16 :goto_a

    .line 155
    .line 156
    :cond_5
    if-nez v0, :cond_6

    .line 157
    .line 158
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 167
    .line 168
    :goto_4
    add-int v5, v2, v4

    .line 169
    .line 170
    add-int/2addr v4, v3

    .line 171
    goto :goto_6

    .line 172
    :cond_6
    if-ne v0, v3, :cond_7

    .line 173
    .line 174
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 179
    .line 180
    add-int/2addr v2, v3

    .line 181
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 182
    .line 183
    add-int/2addr v2, v3

    .line 184
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 189
    .line 190
    goto :goto_4

    .line 191
    :cond_7
    if-ne v0, v5, :cond_8

    .line 192
    .line 193
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 198
    .line 199
    mul-int/2addr v3, v5

    .line 200
    add-int/2addr v2, v3

    .line 201
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 202
    .line 203
    mul-int/2addr v3, v5

    .line 204
    add-int/2addr v2, v3

    .line 205
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 206
    .line 207
    .line 208
    move-result v3

    .line 209
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 210
    .line 211
    goto :goto_4

    .line 212
    :cond_8
    if-ne v0, v4, :cond_9

    .line 213
    .line 214
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 215
    .line 216
    .line 217
    move-result v2

    .line 218
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 223
    .line 224
    add-int/2addr v3, v4

    .line 225
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 226
    .line 227
    add-int/2addr v3, v6

    .line 228
    mul-int/lit8 v7, v4, 0x3

    .line 229
    .line 230
    add-int/2addr v7, v6

    .line 231
    div-int/2addr v7, v5

    .line 232
    :goto_5
    add-int/2addr v7, v2

    .line 233
    mul-int/2addr v4, v5

    .line 234
    add-int/2addr v4, v3

    .line 235
    add-int/2addr v4, v6

    .line 236
    move v5, v7

    .line 237
    goto :goto_6

    .line 238
    :cond_9
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 239
    .line 240
    .line 241
    move-result v2

    .line 242
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 243
    .line 244
    mul-int/2addr v3, v4

    .line 245
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 246
    .line 247
    add-int/2addr v3, v4

    .line 248
    div-int/2addr v3, v5

    .line 249
    add-int/2addr v2, v3

    .line 250
    add-int/2addr v2, v4

    .line 251
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 252
    .line 253
    .line 254
    move-result v3

    .line 255
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 256
    .line 257
    add-int/2addr v3, v4

    .line 258
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 259
    .line 260
    add-int/2addr v3, v6

    .line 261
    mul-int/lit8 v7, v4, 0x3

    .line 262
    .line 263
    add-int/2addr v7, v6

    .line 264
    div-int/2addr v7, v5

    .line 265
    goto :goto_5

    .line 266
    :goto_6
    invoke-virtual {v1, v2, v3, v5, v4}, Landroid/view/View;->layout(IIII)V

    .line 267
    .line 268
    .line 269
    goto/16 :goto_a

    .line 270
    .line 271
    :cond_a
    if-nez v0, :cond_b

    .line 272
    .line 273
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 274
    .line 275
    .line 276
    move-result v2

    .line 277
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 278
    .line 279
    .line 280
    move-result v3

    .line 281
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 282
    .line 283
    mul-int/lit8 v6, v4, 0x3

    .line 284
    .line 285
    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 286
    .line 287
    add-int/2addr v6, v7

    .line 288
    div-int/2addr v6, v5

    .line 289
    :goto_7
    add-int/2addr v6, v2

    .line 290
    mul-int/2addr v4, v5

    .line 291
    add-int/2addr v4, v3

    .line 292
    add-int/2addr v4, v7

    .line 293
    goto :goto_9

    .line 294
    :cond_b
    if-ne v0, v3, :cond_c

    .line 295
    .line 296
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 297
    .line 298
    .line 299
    move-result v2

    .line 300
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 301
    .line 302
    mul-int/2addr v3, v4

    .line 303
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 304
    .line 305
    add-int/2addr v3, v4

    .line 306
    div-int/2addr v3, v5

    .line 307
    add-int/2addr v2, v3

    .line 308
    add-int/2addr v2, v4

    .line 309
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 310
    .line 311
    .line 312
    move-result v3

    .line 313
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 314
    .line 315
    mul-int/lit8 v6, v4, 0x3

    .line 316
    .line 317
    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 318
    .line 319
    add-int/2addr v6, v7

    .line 320
    div-int/2addr v6, v5

    .line 321
    goto :goto_7

    .line 322
    :cond_c
    if-ne v0, v5, :cond_d

    .line 323
    .line 324
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 325
    .line 326
    .line 327
    move-result v2

    .line 328
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 329
    .line 330
    .line 331
    move-result v3

    .line 332
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 333
    .line 334
    mul-int/lit8 v6, v4, 0x2

    .line 335
    .line 336
    add-int/2addr v3, v6

    .line 337
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 338
    .line 339
    :goto_8
    mul-int/2addr v6, v5

    .line 340
    add-int/2addr v3, v6

    .line 341
    add-int v6, v2, v4

    .line 342
    .line 343
    add-int/2addr v4, v3

    .line 344
    goto :goto_9

    .line 345
    :cond_d
    if-ne v0, v4, :cond_e

    .line 346
    .line 347
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 348
    .line 349
    .line 350
    move-result v2

    .line 351
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 352
    .line 353
    add-int/2addr v2, v3

    .line 354
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 355
    .line 356
    add-int/2addr v2, v3

    .line 357
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 358
    .line 359
    .line 360
    move-result v3

    .line 361
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 362
    .line 363
    mul-int/lit8 v6, v4, 0x2

    .line 364
    .line 365
    add-int/2addr v3, v6

    .line 366
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 367
    .line 368
    goto :goto_8

    .line 369
    :cond_e
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 370
    .line 371
    .line 372
    move-result v2

    .line 373
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 374
    .line 375
    mul-int/2addr v3, v5

    .line 376
    add-int/2addr v2, v3

    .line 377
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 378
    .line 379
    mul-int/2addr v3, v5

    .line 380
    add-int/2addr v2, v3

    .line 381
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 382
    .line 383
    .line 384
    move-result v3

    .line 385
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 386
    .line 387
    mul-int/lit8 v6, v4, 0x2

    .line 388
    .line 389
    add-int/2addr v3, v6

    .line 390
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 391
    .line 392
    goto :goto_8

    .line 393
    :goto_9
    invoke-virtual {v1, v2, v3, v6, v4}, Landroid/view/View;->layout(IIII)V

    .line 394
    .line 395
    .line 396
    :goto_a
    add-int/lit8 v0, v0, 0x1

    .line 397
    .line 398
    goto/16 :goto_0

    .line 399
    .line 400
    :cond_f
    return-void
.end method

.method public final h(I)V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    if-ge v0, p1, :cond_c

    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    check-cast v1, Landroid/widget/ImageView;

    .line 9
    .line 10
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->j:I

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    const/4 v4, 0x2

    .line 14
    if-eq v2, v4, :cond_8

    .line 15
    .line 16
    const/4 v5, 0x3

    .line 17
    if-eq v2, v5, :cond_4

    .line 18
    .line 19
    const/4 v6, 0x4

    .line 20
    if-eq v2, v6, :cond_0

    .line 21
    .line 22
    goto/16 :goto_7

    .line 23
    .line 24
    :cond_0
    if-nez v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 35
    .line 36
    mul-int/lit8 v7, v6, 0x2

    .line 37
    .line 38
    add-int/2addr v7, v2

    .line 39
    iget v8, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 40
    .line 41
    add-int/2addr v7, v8

    .line 42
    mul-int/2addr v6, v5

    .line 43
    add-int/2addr v6, v3

    .line 44
    mul-int/2addr v8, v4

    .line 45
    add-int/2addr v6, v8

    .line 46
    goto :goto_2

    .line 47
    :cond_1
    if-ne v0, v3, :cond_2

    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 54
    .line 55
    mul-int/2addr v3, v4

    .line 56
    add-int/2addr v2, v3

    .line 57
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 58
    .line 59
    mul-int/2addr v3, v4

    .line 60
    add-int/2addr v2, v3

    .line 61
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 66
    .line 67
    :goto_1
    add-int v7, v2, v4

    .line 68
    .line 69
    add-int v6, v3, v4

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_2
    if-ne v0, v4, :cond_3

    .line 73
    .line 74
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 79
    .line 80
    mul-int/2addr v3, v4

    .line 81
    add-int/2addr v2, v3

    .line 82
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 83
    .line 84
    mul-int/2addr v3, v4

    .line 85
    add-int/2addr v2, v3

    .line 86
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 91
    .line 92
    add-int/2addr v3, v4

    .line 93
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 94
    .line 95
    add-int/2addr v3, v5

    .line 96
    goto :goto_1

    .line 97
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 102
    .line 103
    mul-int/2addr v3, v4

    .line 104
    add-int/2addr v2, v3

    .line 105
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 106
    .line 107
    mul-int/2addr v3, v4

    .line 108
    add-int/2addr v2, v3

    .line 109
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 114
    .line 115
    mul-int/lit8 v6, v5, 0x2

    .line 116
    .line 117
    add-int/2addr v3, v6

    .line 118
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 119
    .line 120
    mul-int/2addr v6, v4

    .line 121
    add-int/2addr v3, v6

    .line 122
    add-int v7, v2, v5

    .line 123
    .line 124
    add-int v6, v3, v5

    .line 125
    .line 126
    :goto_2
    invoke-virtual {v1, v2, v3, v7, v6}, Landroid/view/View;->layout(IIII)V

    .line 127
    .line 128
    .line 129
    goto/16 :goto_7

    .line 130
    .line 131
    :cond_4
    if-nez v0, :cond_5

    .line 132
    .line 133
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 142
    .line 143
    :goto_3
    add-int v5, v2, v4

    .line 144
    .line 145
    add-int/2addr v4, v3

    .line 146
    goto :goto_4

    .line 147
    :cond_5
    if-ne v0, v3, :cond_6

    .line 148
    .line 149
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 154
    .line 155
    add-int/2addr v2, v3

    .line 156
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 157
    .line 158
    add-int/2addr v2, v3

    .line 159
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_6
    if-ne v0, v4, :cond_7

    .line 167
    .line 168
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 173
    .line 174
    mul-int/2addr v3, v4

    .line 175
    add-int/2addr v2, v3

    .line 176
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 177
    .line 178
    mul-int/2addr v3, v4

    .line 179
    add-int/2addr v2, v3

    .line 180
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_7
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 196
    .line 197
    add-int/2addr v3, v5

    .line 198
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 199
    .line 200
    add-int/2addr v3, v6

    .line 201
    mul-int/lit8 v7, v5, 0x3

    .line 202
    .line 203
    add-int/2addr v7, v2

    .line 204
    mul-int/lit8 v8, v6, 0x2

    .line 205
    .line 206
    add-int/2addr v7, v8

    .line 207
    mul-int/2addr v5, v4

    .line 208
    add-int/2addr v5, v3

    .line 209
    add-int v4, v5, v6

    .line 210
    .line 211
    move v5, v7

    .line 212
    :goto_4
    invoke-virtual {v1, v2, v3, v5, v4}, Landroid/view/View;->layout(IIII)V

    .line 213
    .line 214
    .line 215
    goto :goto_7

    .line 216
    :cond_8
    if-nez v0, :cond_9

    .line 217
    .line 218
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 223
    .line 224
    .line 225
    move-result v3

    .line 226
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 227
    .line 228
    mul-int/lit8 v6, v5, 0x3

    .line 229
    .line 230
    add-int/2addr v6, v2

    .line 231
    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 232
    .line 233
    mul-int/lit8 v8, v7, 0x2

    .line 234
    .line 235
    add-int/2addr v6, v8

    .line 236
    mul-int/2addr v5, v4

    .line 237
    add-int/2addr v5, v3

    .line 238
    add-int/2addr v5, v7

    .line 239
    goto :goto_6

    .line 240
    :cond_9
    if-ne v0, v3, :cond_a

    .line 241
    .line 242
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 247
    .line 248
    .line 249
    move-result v3

    .line 250
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 251
    .line 252
    mul-int/lit8 v6, v5, 0x2

    .line 253
    .line 254
    add-int/2addr v3, v6

    .line 255
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 256
    .line 257
    :goto_5
    mul-int/2addr v6, v4

    .line 258
    add-int/2addr v3, v6

    .line 259
    add-int v6, v2, v5

    .line 260
    .line 261
    add-int/2addr v5, v3

    .line 262
    goto :goto_6

    .line 263
    :cond_a
    if-ne v0, v4, :cond_b

    .line 264
    .line 265
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 266
    .line 267
    .line 268
    move-result v2

    .line 269
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 270
    .line 271
    add-int/2addr v2, v3

    .line 272
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 273
    .line 274
    add-int/2addr v2, v3

    .line 275
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 276
    .line 277
    .line 278
    move-result v3

    .line 279
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 280
    .line 281
    mul-int/lit8 v6, v5, 0x2

    .line 282
    .line 283
    add-int/2addr v3, v6

    .line 284
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 285
    .line 286
    goto :goto_5

    .line 287
    :cond_b
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 288
    .line 289
    .line 290
    move-result v2

    .line 291
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 292
    .line 293
    mul-int/2addr v3, v4

    .line 294
    add-int/2addr v2, v3

    .line 295
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 296
    .line 297
    mul-int/2addr v3, v4

    .line 298
    add-int/2addr v2, v3

    .line 299
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 300
    .line 301
    .line 302
    move-result v3

    .line 303
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 304
    .line 305
    mul-int/lit8 v6, v5, 0x2

    .line 306
    .line 307
    add-int/2addr v3, v6

    .line 308
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 309
    .line 310
    goto :goto_5

    .line 311
    :goto_6
    invoke-virtual {v1, v2, v3, v6, v5}, Landroid/view/View;->layout(IIII)V

    .line 312
    .line 313
    .line 314
    :goto_7
    add-int/lit8 v0, v0, 0x1

    .line 315
    .line 316
    goto/16 :goto_0

    .line 317
    .line 318
    :cond_c
    return-void
.end method

.method public final i(I)V
    .locals 6

    .line 1
    if-gtz p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    const/4 v0, 0x0

    .line 5
    :goto_0
    if-ge v0, p1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Landroid/widget/ImageView;

    .line 12
    .line 13
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->d:I

    .line 14
    .line 15
    div-int v3, v0, v2

    .line 16
    .line 17
    rem-int v2, v0, v2

    .line 18
    .line 19
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 20
    .line 21
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 22
    .line 23
    add-int/2addr v4, v5

    .line 24
    mul-int/2addr v4, v2

    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    add-int/2addr v4, v2

    .line 30
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 31
    .line 32
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 33
    .line 34
    add-int/2addr v2, v5

    .line 35
    mul-int/2addr v2, v3

    .line 36
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    add-int/2addr v2, v3

    .line 41
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 42
    .line 43
    add-int v5, v4, v3

    .line 44
    .line 45
    add-int/2addr v3, v2

    .line 46
    invoke-virtual {v1, v4, v2, v5, v3}, Landroid/view/View;->layout(IIII)V

    .line 47
    .line 48
    .line 49
    add-int/lit8 v0, v0, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    :goto_1
    return-void
.end method

.method public final j(I)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    if-ge v0, p1, :cond_12

    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    check-cast v1, Landroid/widget/ImageView;

    .line 9
    .line 10
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->j:I

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    const/4 v4, 0x4

    .line 14
    const/4 v5, 0x3

    .line 15
    const/4 v6, 0x2

    .line 16
    if-eq v2, v6, :cond_c

    .line 17
    .line 18
    if-eq v2, v5, :cond_6

    .line 19
    .line 20
    if-eq v2, v4, :cond_0

    .line 21
    .line 22
    goto/16 :goto_c

    .line 23
    .line 24
    :cond_0
    if-nez v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 35
    .line 36
    :goto_1
    add-int v5, v2, v4

    .line 37
    .line 38
    add-int/2addr v4, v3

    .line 39
    goto/16 :goto_4

    .line 40
    .line 41
    :cond_1
    if-ne v0, v3, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 48
    .line 49
    add-int/2addr v2, v3

    .line 50
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 51
    .line 52
    add-int/2addr v2, v3

    .line 53
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 58
    .line 59
    mul-int/lit8 v5, v4, 0x2

    .line 60
    .line 61
    add-int/2addr v5, v2

    .line 62
    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 63
    .line 64
    add-int/2addr v5, v7

    .line 65
    mul-int/2addr v4, v6

    .line 66
    add-int/2addr v4, v3

    .line 67
    add-int/2addr v4, v7

    .line 68
    goto :goto_4

    .line 69
    :cond_2
    if-ne v0, v6, :cond_3

    .line 70
    .line 71
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 80
    .line 81
    add-int/2addr v3, v4

    .line 82
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 83
    .line 84
    :goto_2
    add-int/2addr v3, v5

    .line 85
    goto :goto_1

    .line 86
    :cond_3
    if-ne v0, v5, :cond_4

    .line 87
    .line 88
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 97
    .line 98
    mul-int/lit8 v5, v4, 0x2

    .line 99
    .line 100
    add-int/2addr v3, v5

    .line 101
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 102
    .line 103
    :goto_3
    mul-int/2addr v5, v6

    .line 104
    goto :goto_2

    .line 105
    :cond_4
    if-ne v0, v4, :cond_5

    .line 106
    .line 107
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 112
    .line 113
    add-int/2addr v2, v3

    .line 114
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 115
    .line 116
    add-int/2addr v2, v3

    .line 117
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 122
    .line 123
    mul-int/lit8 v5, v4, 0x2

    .line 124
    .line 125
    add-int/2addr v3, v5

    .line 126
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 134
    .line 135
    mul-int/2addr v3, v6

    .line 136
    add-int/2addr v2, v3

    .line 137
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 138
    .line 139
    mul-int/2addr v3, v6

    .line 140
    add-int/2addr v2, v3

    .line 141
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 146
    .line 147
    mul-int/lit8 v5, v4, 0x2

    .line 148
    .line 149
    add-int/2addr v3, v5

    .line 150
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :goto_4
    invoke-virtual {v1, v2, v3, v5, v4}, Landroid/view/View;->layout(IIII)V

    .line 154
    .line 155
    .line 156
    goto/16 :goto_c

    .line 157
    .line 158
    :cond_6
    if-nez v0, :cond_7

    .line 159
    .line 160
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 169
    .line 170
    :goto_5
    add-int v5, v2, v4

    .line 171
    .line 172
    add-int/2addr v4, v3

    .line 173
    goto/16 :goto_7

    .line 174
    .line 175
    :cond_7
    if-ne v0, v3, :cond_8

    .line 176
    .line 177
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 182
    .line 183
    add-int/2addr v2, v3

    .line 184
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 185
    .line 186
    add-int/2addr v2, v3

    .line 187
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 192
    .line 193
    goto :goto_5

    .line 194
    :cond_8
    if-ne v0, v6, :cond_9

    .line 195
    .line 196
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 201
    .line 202
    mul-int/2addr v3, v6

    .line 203
    add-int/2addr v2, v3

    .line 204
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 205
    .line 206
    mul-int/2addr v3, v6

    .line 207
    add-int/2addr v2, v3

    .line 208
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 209
    .line 210
    .line 211
    move-result v3

    .line 212
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 213
    .line 214
    goto :goto_5

    .line 215
    :cond_9
    if-ne v0, v5, :cond_a

    .line 216
    .line 217
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 218
    .line 219
    .line 220
    move-result v2

    .line 221
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 226
    .line 227
    add-int/2addr v3, v4

    .line 228
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 229
    .line 230
    add-int/2addr v3, v5

    .line 231
    mul-int/lit8 v7, v4, 0x2

    .line 232
    .line 233
    add-int/2addr v7, v2

    .line 234
    add-int/2addr v7, v5

    .line 235
    mul-int/2addr v4, v6

    .line 236
    add-int/2addr v4, v3

    .line 237
    add-int/2addr v4, v5

    .line 238
    move v5, v7

    .line 239
    goto :goto_7

    .line 240
    :cond_a
    if-ne v0, v4, :cond_b

    .line 241
    .line 242
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 247
    .line 248
    mul-int/2addr v3, v6

    .line 249
    add-int/2addr v2, v3

    .line 250
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 251
    .line 252
    mul-int/2addr v3, v6

    .line 253
    add-int/2addr v2, v3

    .line 254
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 255
    .line 256
    .line 257
    move-result v3

    .line 258
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 259
    .line 260
    add-int/2addr v3, v4

    .line 261
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 262
    .line 263
    :goto_6
    add-int/2addr v3, v5

    .line 264
    goto :goto_5

    .line 265
    :cond_b
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 266
    .line 267
    .line 268
    move-result v2

    .line 269
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 270
    .line 271
    mul-int/2addr v3, v6

    .line 272
    add-int/2addr v2, v3

    .line 273
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 274
    .line 275
    mul-int/2addr v3, v6

    .line 276
    add-int/2addr v2, v3

    .line 277
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 278
    .line 279
    .line 280
    move-result v3

    .line 281
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 282
    .line 283
    mul-int/lit8 v5, v4, 0x2

    .line 284
    .line 285
    add-int/2addr v3, v5

    .line 286
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 287
    .line 288
    mul-int/2addr v5, v6

    .line 289
    goto :goto_6

    .line 290
    :goto_7
    invoke-virtual {v1, v2, v3, v5, v4}, Landroid/view/View;->layout(IIII)V

    .line 291
    .line 292
    .line 293
    goto/16 :goto_c

    .line 294
    .line 295
    :cond_c
    if-nez v0, :cond_d

    .line 296
    .line 297
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 298
    .line 299
    .line 300
    move-result v2

    .line 301
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 302
    .line 303
    .line 304
    move-result v3

    .line 305
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 306
    .line 307
    mul-int/lit8 v5, v4, 0x2

    .line 308
    .line 309
    add-int/2addr v5, v2

    .line 310
    iget v7, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 311
    .line 312
    add-int/2addr v5, v7

    .line 313
    mul-int/2addr v4, v6

    .line 314
    add-int/2addr v4, v3

    .line 315
    add-int/2addr v4, v7

    .line 316
    goto/16 :goto_b

    .line 317
    .line 318
    :cond_d
    if-ne v0, v3, :cond_e

    .line 319
    .line 320
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 321
    .line 322
    .line 323
    move-result v2

    .line 324
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 325
    .line 326
    mul-int/2addr v3, v6

    .line 327
    add-int/2addr v2, v3

    .line 328
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 329
    .line 330
    mul-int/2addr v3, v6

    .line 331
    add-int/2addr v2, v3

    .line 332
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 333
    .line 334
    .line 335
    move-result v3

    .line 336
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 337
    .line 338
    :goto_8
    add-int v5, v2, v4

    .line 339
    .line 340
    add-int/2addr v4, v3

    .line 341
    goto :goto_b

    .line 342
    :cond_e
    if-ne v0, v6, :cond_f

    .line 343
    .line 344
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 345
    .line 346
    .line 347
    move-result v2

    .line 348
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 349
    .line 350
    mul-int/2addr v3, v6

    .line 351
    add-int/2addr v2, v3

    .line 352
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 353
    .line 354
    mul-int/2addr v3, v6

    .line 355
    add-int/2addr v2, v3

    .line 356
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 357
    .line 358
    .line 359
    move-result v3

    .line 360
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 361
    .line 362
    add-int/2addr v3, v4

    .line 363
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 364
    .line 365
    :goto_9
    add-int/2addr v3, v5

    .line 366
    goto :goto_8

    .line 367
    :cond_f
    if-ne v0, v5, :cond_10

    .line 368
    .line 369
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 370
    .line 371
    .line 372
    move-result v2

    .line 373
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 374
    .line 375
    .line 376
    move-result v3

    .line 377
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 378
    .line 379
    mul-int/lit8 v5, v4, 0x2

    .line 380
    .line 381
    add-int/2addr v3, v5

    .line 382
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 383
    .line 384
    :goto_a
    mul-int/2addr v5, v6

    .line 385
    goto :goto_9

    .line 386
    :cond_10
    if-ne v0, v4, :cond_11

    .line 387
    .line 388
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 389
    .line 390
    .line 391
    move-result v2

    .line 392
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 393
    .line 394
    add-int/2addr v2, v3

    .line 395
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 396
    .line 397
    add-int/2addr v2, v3

    .line 398
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 399
    .line 400
    .line 401
    move-result v3

    .line 402
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 403
    .line 404
    mul-int/lit8 v5, v4, 0x2

    .line 405
    .line 406
    add-int/2addr v3, v5

    .line 407
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 408
    .line 409
    goto :goto_a

    .line 410
    :cond_11
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 411
    .line 412
    .line 413
    move-result v2

    .line 414
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 415
    .line 416
    mul-int/2addr v3, v6

    .line 417
    add-int/2addr v2, v3

    .line 418
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 419
    .line 420
    mul-int/2addr v3, v6

    .line 421
    add-int/2addr v2, v3

    .line 422
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 423
    .line 424
    .line 425
    move-result v3

    .line 426
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 427
    .line 428
    mul-int/lit8 v5, v4, 0x2

    .line 429
    .line 430
    add-int/2addr v3, v5

    .line 431
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 432
    .line 433
    goto :goto_a

    .line 434
    :goto_b
    invoke-virtual {v1, v2, v3, v5, v4}, Landroid/view/View;->layout(IIII)V

    .line 435
    .line 436
    .line 437
    :goto_c
    add-int/lit8 v0, v0, 0x1

    .line 438
    .line 439
    goto/16 :goto_0

    .line 440
    .line 441
    :cond_12
    return-void
.end method

.method public final k(I)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    if-ge v0, p1, :cond_9

    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    check-cast v1, Landroid/widget/ImageView;

    .line 9
    .line 10
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->j:I

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    const/4 v4, 0x2

    .line 14
    if-eq v2, v4, :cond_6

    .line 15
    .line 16
    const/4 v5, 0x3

    .line 17
    if-eq v2, v5, :cond_3

    .line 18
    .line 19
    const/4 v5, 0x4

    .line 20
    if-eq v2, v5, :cond_0

    .line 21
    .line 22
    goto/16 :goto_9

    .line 23
    .line 24
    :cond_0
    if-nez v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 35
    .line 36
    add-int v6, v2, v5

    .line 37
    .line 38
    mul-int/2addr v5, v4

    .line 39
    add-int/2addr v5, v3

    .line 40
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 41
    .line 42
    add-int/2addr v5, v4

    .line 43
    goto :goto_2

    .line 44
    :cond_1
    if-ne v0, v3, :cond_2

    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 51
    .line 52
    add-int/2addr v2, v3

    .line 53
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 54
    .line 55
    add-int/2addr v2, v3

    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 61
    .line 62
    :goto_1
    add-int v6, v2, v4

    .line 63
    .line 64
    add-int v5, v3, v4

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 72
    .line 73
    add-int/2addr v2, v3

    .line 74
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 75
    .line 76
    add-int/2addr v2, v3

    .line 77
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 82
    .line 83
    add-int/2addr v3, v4

    .line 84
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 85
    .line 86
    add-int/2addr v3, v5

    .line 87
    goto :goto_1

    .line 88
    :goto_2
    invoke-virtual {v1, v2, v3, v6, v5}, Landroid/view/View;->layout(IIII)V

    .line 89
    .line 90
    .line 91
    goto/16 :goto_9

    .line 92
    .line 93
    :cond_3
    if-nez v0, :cond_4

    .line 94
    .line 95
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 104
    .line 105
    :goto_3
    add-int v5, v2, v4

    .line 106
    .line 107
    :goto_4
    add-int/2addr v4, v3

    .line 108
    goto :goto_5

    .line 109
    :cond_4
    if-ne v0, v3, :cond_5

    .line 110
    .line 111
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 116
    .line 117
    add-int/2addr v2, v3

    .line 118
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 119
    .line 120
    add-int/2addr v2, v3

    .line 121
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 137
    .line 138
    add-int/2addr v3, v4

    .line 139
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 140
    .line 141
    add-int/2addr v3, v5

    .line 142
    mul-int/lit8 v6, v4, 0x2

    .line 143
    .line 144
    add-int/2addr v6, v2

    .line 145
    add-int/2addr v5, v6

    .line 146
    goto :goto_4

    .line 147
    :goto_5
    invoke-virtual {v1, v2, v3, v5, v4}, Landroid/view/View;->layout(IIII)V

    .line 148
    .line 149
    .line 150
    goto :goto_9

    .line 151
    :cond_6
    if-nez v0, :cond_7

    .line 152
    .line 153
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 162
    .line 163
    mul-int/lit8 v5, v4, 0x2

    .line 164
    .line 165
    add-int/2addr v5, v2

    .line 166
    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 167
    .line 168
    add-int/2addr v5, v6

    .line 169
    :goto_6
    add-int/2addr v4, v3

    .line 170
    goto :goto_8

    .line 171
    :cond_7
    if-ne v0, v3, :cond_8

    .line 172
    .line 173
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 182
    .line 183
    add-int/2addr v3, v4

    .line 184
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 185
    .line 186
    :goto_7
    add-int/2addr v3, v5

    .line 187
    add-int v5, v2, v4

    .line 188
    .line 189
    goto :goto_6

    .line 190
    :cond_8
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 195
    .line 196
    add-int/2addr v2, v3

    .line 197
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 198
    .line 199
    add-int/2addr v2, v3

    .line 200
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 201
    .line 202
    .line 203
    move-result v3

    .line 204
    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 205
    .line 206
    add-int/2addr v3, v4

    .line 207
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 208
    .line 209
    goto :goto_7

    .line 210
    :goto_8
    invoke-virtual {v1, v2, v3, v5, v4}, Landroid/view/View;->layout(IIII)V

    .line 211
    .line 212
    .line 213
    :goto_9
    add-int/lit8 v0, v0, 0x1

    .line 214
    .line 215
    goto/16 :goto_0

    .line 216
    .line 217
    :cond_9
    return-void
.end method

.method public l(Ljava/util/List;I)V
    .locals 3

    .line 1
    if-eqz p1, :cond_6

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
    goto :goto_4

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 12
    .line 13
    .line 14
    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->j:I

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->d(I)I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->f:I

    .line 25
    .line 26
    invoke-virtual {p0, p2, v1}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->a(II)[I

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    aget v2, v1, v0

    .line 31
    .line 32
    iput v2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->c:I

    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    aget v1, v1, v2

    .line 36
    .line 37
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->d:I

    .line 38
    .line 39
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->l:Ljava/util/List;

    .line 40
    .line 41
    if-nez v1, :cond_2

    .line 42
    .line 43
    :goto_0
    if-ge v0, p2, :cond_5

    .line 44
    .line 45
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->c(I)Landroid/widget/ImageView;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    if-nez v1, :cond_1

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {p0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 57
    .line 58
    .line 59
    add-int/lit8 v0, v0, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->d(I)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-le v0, p2, :cond_3

    .line 71
    .line 72
    sub-int/2addr v0, p2

    .line 73
    invoke-virtual {p0, p2, v0}, Landroid/view/ViewGroup;->removeViews(II)V

    .line 74
    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_3
    if-ge v0, p2, :cond_5

    .line 78
    .line 79
    :goto_1
    if-ge v0, p2, :cond_5

    .line 80
    .line 81
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->c(I)Landroid/widget/ImageView;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    if-nez v1, :cond_4

    .line 86
    .line 87
    :goto_2
    return-void

    .line 88
    :cond_4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-virtual {p0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 93
    .line 94
    .line 95
    add-int/lit8 v0, v0, 0x1

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_5
    :goto_3
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->l:Ljava/util/List;

    .line 99
    .line 100
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_6
    :goto_4
    const/16 p1, 0x8

    .line 105
    .line 106
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 107
    .line 108
    .line 109
    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->f()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onMeasure(II)V
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
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->l:Ljava/util/List;

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
    iget-object p2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->l:Ljava/util/List;

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
    iget p2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->h:I

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
    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    iget-object p2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->k:Ljava/util/List;

    .line 55
    .line 56
    const/4 v2, 0x0

    .line 57
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

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
    iget p2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 69
    .line 70
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->d:I

    .line 71
    .line 72
    add-int/lit8 v3, v2, -0x1

    .line 73
    .line 74
    mul-int/2addr p2, v3

    .line 75
    sub-int/2addr v0, p2

    .line 76
    div-int/2addr v0, v2

    .line 77
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 78
    .line 79
    :goto_0
    iget p2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->i:I

    .line 80
    .line 81
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->c:I

    .line 82
    .line 83
    mul-int/2addr p2, v0

    .line 84
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 85
    .line 86
    sub-int/2addr v0, v1

    .line 87
    mul-int/2addr v2, v0

    .line 88
    add-int/2addr p2, v2

    .line 89
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 90
    .line 91
    .line 92
    move-result v0

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

.method public setAdapter(Lo8/c;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setGap(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->g:I

    .line 2
    .line 3
    return-void
.end method

.method public setImagesData(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->l(Ljava/util/List;I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public setItemImageClickListener(Lo8/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo8/a;",
            ")V"
        }
    .end annotation

    .line 1
    return-void
.end method

.method public setItemImageLongClickListener(Lo8/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo8/b;",
            ")V"
        }
    .end annotation

    .line 1
    return-void
.end method

.method public setMaxSize(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->e:I

    .line 2
    .line 3
    return-void
.end method

.method public setShowStyle(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->f:I

    .line 2
    .line 3
    return-void
.end method

.method public setSingleImgSize(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/nine/NineGridImageView;->h:I

    .line 2
    .line 3
    return-void
.end method
