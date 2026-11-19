.class public final Ls3/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroid/widget/TextView;

.field public b:Landroid/text/TextPaint;

.field public c:F

.field public d:I

.field public e:F

.field public f:F

.field public g:F

.field public h:Z

.field public i:Z

.field public j:Ljava/util/ArrayList;

.field public k:Lcom/xuexiang/xui/widget/searchview/e;

.field public l:Ls3/a;


# direct methods
.method public static b(Landroid/widget/TextView;Landroid/util/AttributeSet;I)Ls3/c;
    .locals 6

    .line 1
    new-instance v0, Ls3/c;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/xuexiang/xui/widget/searchview/e;

    .line 7
    .line 8
    const/4 v2, 0x3

    .line 9
    invoke-direct {v1, v0, v2}, Lcom/xuexiang/xui/widget/searchview/e;-><init>(Ljava/lang/Object;I)V

    .line 10
    .line 11
    .line 12
    iput-object v1, v0, Ls3/c;->k:Lcom/xuexiang/xui/widget/searchview/e;

    .line 13
    .line 14
    new-instance v1, Ls3/a;

    .line 15
    .line 16
    invoke-direct {v1, v0}, Ls3/a;-><init>(Ls3/c;)V

    .line 17
    .line 18
    .line 19
    iput-object v1, v0, Ls3/c;->l:Ls3/a;

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iget v1, v1, Landroid/util/DisplayMetrics;->scaledDensity:F

    .line 34
    .line 35
    iput-object p0, v0, Ls3/c;->a:Landroid/widget/TextView;

    .line 36
    .line 37
    new-instance v2, Landroid/text/TextPaint;

    .line 38
    .line 39
    invoke-direct {v2}, Landroid/text/TextPaint;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v2, v0, Ls3/c;->b:Landroid/text/TextPaint;

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/widget/TextView;->getTextSize()F

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    iget v3, v0, Ls3/c;->c:F

    .line 49
    .line 50
    cmpl-float v3, v3, v2

    .line 51
    .line 52
    if-eqz v3, :cond_0

    .line 53
    .line 54
    iput v2, v0, Ls3/c;->c:F

    .line 55
    .line 56
    :cond_0
    invoke-virtual {p0}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    instance-of v2, v2, Landroid/text/method/SingleLineTransformationMethod;

    .line 61
    .line 62
    const/4 v3, 0x1

    .line 63
    if-eqz v2, :cond_1

    .line 64
    .line 65
    move v2, v3

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    invoke-virtual {p0}, Landroid/widget/TextView;->getMaxLines()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    :goto_0
    iput v2, v0, Ls3/c;->d:I

    .line 72
    .line 73
    const/high16 v2, 0x41000000    # 8.0f

    .line 74
    .line 75
    mul-float/2addr v1, v2

    .line 76
    iput v1, v0, Ls3/c;->e:F

    .line 77
    .line 78
    iget v1, v0, Ls3/c;->c:F

    .line 79
    .line 80
    iput v1, v0, Ls3/c;->f:F

    .line 81
    .line 82
    const/high16 v1, 0x3f000000    # 0.5f

    .line 83
    .line 84
    iput v1, v0, Ls3/c;->g:F

    .line 85
    .line 86
    if-eqz p1, :cond_2

    .line 87
    .line 88
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    iget v1, v0, Ls3/c;->e:F

    .line 93
    .line 94
    float-to-int v1, v1

    .line 95
    iget v2, v0, Ls3/c;->g:F

    .line 96
    .line 97
    sget-object v4, Lcom/xuexiang/xui/R$styleable;->AutoFitTextView:[I

    .line 98
    .line 99
    const/4 v5, 0x0

    .line 100
    invoke-virtual {p0, p1, v4, p2, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    sget p1, Lcom/xuexiang/xui/R$styleable;->AutoFitTextView_aftv_enable:I

    .line 105
    .line 106
    invoke-virtual {p0, p1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    sget p1, Lcom/xuexiang/xui/R$styleable;->AutoFitTextView_aftv_minTextSize:I

    .line 111
    .line 112
    invoke-virtual {p0, p1, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    sget p2, Lcom/xuexiang/xui/R$styleable;->AutoFitTextView_aftv_precision:I

    .line 117
    .line 118
    invoke-virtual {p0, p2, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 119
    .line 120
    .line 121
    move-result p2

    .line 122
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 123
    .line 124
    .line 125
    int-to-float p0, p1

    .line 126
    invoke-virtual {v0, p0, v5}, Ls3/c;->e(FI)V

    .line 127
    .line 128
    .line 129
    iget p0, v0, Ls3/c;->g:F

    .line 130
    .line 131
    cmpl-float p0, p0, p2

    .line 132
    .line 133
    if-eqz p0, :cond_2

    .line 134
    .line 135
    iput p2, v0, Ls3/c;->g:F

    .line 136
    .line 137
    invoke-virtual {v0}, Ls3/c;->a()V

    .line 138
    .line 139
    .line 140
    :cond_2
    invoke-virtual {v0, v3}, Ls3/c;->d(Z)V

    .line 141
    .line 142
    .line 143
    return-object v0
.end method

.method public static c(Ljava/lang/CharSequence;Landroid/text/TextPaint;FIFFFLandroid/util/DisplayMetrics;)F
    .locals 16

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move/from16 v8, p2

    .line 4
    .line 5
    move/from16 v9, p3

    .line 6
    .line 7
    add-float v0, p4, p5

    .line 8
    .line 9
    const/high16 v2, 0x40000000    # 2.0f

    .line 10
    .line 11
    div-float v10, v0, v2

    .line 12
    .line 13
    const/4 v11, 0x0

    .line 14
    move-object/from16 v12, p7

    .line 15
    .line 16
    invoke-static {v11, v10, v12}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 21
    .line 22
    .line 23
    const/4 v13, 0x1

    .line 24
    if-eq v9, v13, :cond_0

    .line 25
    .line 26
    new-instance v0, Landroid/text/StaticLayout;

    .line 27
    .line 28
    float-to-int v3, v8

    .line 29
    sget-object v4, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    const/4 v7, 0x1

    .line 33
    const/high16 v5, 0x3f800000    # 1.0f

    .line 34
    .line 35
    move-object v2, v1

    .line 36
    move-object/from16 v1, p0

    .line 37
    .line 38
    invoke-direct/range {v0 .. v7}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/text/StaticLayout;->getLineCount()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    move v15, v1

    .line 46
    :goto_0
    move-object v14, v0

    .line 47
    goto :goto_1

    .line 48
    :cond_0
    const/4 v0, 0x0

    .line 49
    move v15, v13

    .line 50
    goto :goto_0

    .line 51
    :goto_1
    if-le v15, v9, :cond_2

    .line 52
    .line 53
    sub-float v0, p5, p4

    .line 54
    .line 55
    cmpg-float v0, v0, p6

    .line 56
    .line 57
    if-gez v0, :cond_1

    .line 58
    .line 59
    goto :goto_4

    .line 60
    :cond_1
    move-object/from16 v0, p0

    .line 61
    .line 62
    move-object/from16 v1, p1

    .line 63
    .line 64
    move/from16 v4, p4

    .line 65
    .line 66
    move/from16 v6, p6

    .line 67
    .line 68
    move v2, v8

    .line 69
    move v3, v9

    .line 70
    move v5, v10

    .line 71
    move-object v7, v12

    .line 72
    invoke-static/range {v0 .. v7}, Ls3/c;->c(Ljava/lang/CharSequence;Landroid/text/TextPaint;FIFFFLandroid/util/DisplayMetrics;)F

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    return v0

    .line 77
    :cond_2
    move v3, v9

    .line 78
    move v4, v10

    .line 79
    if-ge v15, v3, :cond_3

    .line 80
    .line 81
    move-object/from16 v0, p0

    .line 82
    .line 83
    move-object/from16 v1, p1

    .line 84
    .line 85
    move/from16 v2, p2

    .line 86
    .line 87
    move/from16 v5, p5

    .line 88
    .line 89
    move/from16 v6, p6

    .line 90
    .line 91
    move-object/from16 v7, p7

    .line 92
    .line 93
    invoke-static/range {v0 .. v7}, Ls3/c;->c(Ljava/lang/CharSequence;Landroid/text/TextPaint;FIFFFLandroid/util/DisplayMetrics;)F

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    return v0

    .line 98
    :cond_3
    move-object/from16 v1, p1

    .line 99
    .line 100
    if-ne v3, v13, :cond_5

    .line 101
    .line 102
    invoke-interface/range {p0 .. p0}, Ljava/lang/CharSequence;->length()I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    move-object/from16 v2, p0

    .line 107
    .line 108
    invoke-virtual {v1, v2, v11, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/CharSequence;II)F

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    :cond_4
    move v8, v0

    .line 113
    goto :goto_3

    .line 114
    :cond_5
    move-object/from16 v2, p0

    .line 115
    .line 116
    const/4 v0, 0x0

    .line 117
    :goto_2
    if-ge v11, v15, :cond_4

    .line 118
    .line 119
    invoke-virtual {v14, v11}, Landroid/text/Layout;->getLineWidth(I)F

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    cmpl-float v5, v5, v0

    .line 124
    .line 125
    if-lez v5, :cond_6

    .line 126
    .line 127
    invoke-virtual {v14, v11}, Landroid/text/Layout;->getLineWidth(I)F

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    :cond_6
    add-int/lit8 v11, v11, 0x1

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :goto_3
    sub-float v0, p5, p4

    .line 135
    .line 136
    cmpg-float v0, v0, p6

    .line 137
    .line 138
    if-gez v0, :cond_7

    .line 139
    .line 140
    :goto_4
    return p4

    .line 141
    :cond_7
    cmpl-float v0, v8, p2

    .line 142
    .line 143
    if-lez v0, :cond_8

    .line 144
    .line 145
    move/from16 v6, p6

    .line 146
    .line 147
    move-object/from16 v7, p7

    .line 148
    .line 149
    move-object v0, v2

    .line 150
    move v5, v4

    .line 151
    move/from16 v2, p2

    .line 152
    .line 153
    move/from16 v4, p4

    .line 154
    .line 155
    invoke-static/range {v0 .. v7}, Ls3/c;->c(Ljava/lang/CharSequence;Landroid/text/TextPaint;FIFFFLandroid/util/DisplayMetrics;)F

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    return v0

    .line 160
    :cond_8
    cmpg-float v0, v8, p2

    .line 161
    .line 162
    if-gez v0, :cond_9

    .line 163
    .line 164
    move-object/from16 v0, p0

    .line 165
    .line 166
    move-object/from16 v1, p1

    .line 167
    .line 168
    move/from16 v2, p2

    .line 169
    .line 170
    move/from16 v3, p3

    .line 171
    .line 172
    move/from16 v5, p5

    .line 173
    .line 174
    move/from16 v6, p6

    .line 175
    .line 176
    move-object/from16 v7, p7

    .line 177
    .line 178
    invoke-static/range {v0 .. v7}, Ls3/c;->c(Ljava/lang/CharSequence;Landroid/text/TextPaint;FIFFFLandroid/util/DisplayMetrics;)F

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    return v0

    .line 183
    :cond_9
    return v4
.end method


# virtual methods
.method public final a()V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ls3/c;->a:Landroid/widget/TextView;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/widget/TextView;->getTextSize()F

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x1

    .line 10
    iput-boolean v3, v0, Ls3/c;->i:Z

    .line 11
    .line 12
    iget-object v5, v0, Ls3/c;->b:Landroid/text/TextPaint;

    .line 13
    .line 14
    iget v12, v0, Ls3/c;->e:F

    .line 15
    .line 16
    iget v13, v0, Ls3/c;->f:F

    .line 17
    .line 18
    iget v14, v0, Ls3/c;->d:I

    .line 19
    .line 20
    iget v15, v0, Ls3/c;->g:F

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    if-lez v14, :cond_0

    .line 24
    .line 25
    const v6, 0x7fffffff

    .line 26
    .line 27
    .line 28
    if-ne v14, v6, :cond_1

    .line 29
    .line 30
    :cond_0
    :goto_0
    move v9, v4

    .line 31
    goto/16 :goto_6

    .line 32
    .line 33
    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    sub-int/2addr v6, v7

    .line 42
    invoke-virtual {v1}, Landroid/view/View;->getPaddingRight()I

    .line 43
    .line 44
    .line 45
    move-result v7

    .line 46
    sub-int/2addr v6, v7

    .line 47
    if-gtz v6, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    invoke-virtual {v1}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    if-eqz v8, :cond_3

    .line 59
    .line 60
    invoke-interface {v8, v7, v1}, Landroid/text/method/TransformationMethod;->getTransformation(Ljava/lang/CharSequence;Landroid/view/View;)Ljava/lang/CharSequence;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    :cond_3
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 69
    .line 70
    .line 71
    move-result-object v9

    .line 72
    if-eqz v8, :cond_4

    .line 73
    .line 74
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 75
    .line 76
    .line 77
    move-result-object v9

    .line 78
    :cond_4
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    invoke-virtual {v1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    invoke-virtual {v5, v9}, Landroid/text/TextPaint;->set(Landroid/text/TextPaint;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v5, v13}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 90
    .line 91
    .line 92
    if-ne v14, v3, :cond_6

    .line 93
    .line 94
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    invoke-virtual {v5, v7, v4, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/CharSequence;II)F

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    int-to-float v9, v6

    .line 103
    cmpl-float v3, v3, v9

    .line 104
    .line 105
    if-gtz v3, :cond_5

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_5
    move v3, v6

    .line 109
    move-object v4, v7

    .line 110
    move-object/from16 v16, v8

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_6
    :goto_1
    int-to-float v3, v6

    .line 114
    invoke-static {v4, v13, v8}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 115
    .line 116
    .line 117
    move-result v9

    .line 118
    invoke-virtual {v5, v9}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 119
    .line 120
    .line 121
    move v9, v4

    .line 122
    new-instance v4, Landroid/text/StaticLayout;

    .line 123
    .line 124
    float-to-int v3, v3

    .line 125
    move-object v11, v8

    .line 126
    sget-object v8, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 127
    .line 128
    const/4 v10, 0x0

    .line 129
    move-object/from16 v16, v11

    .line 130
    .line 131
    const/4 v11, 0x1

    .line 132
    move/from16 v17, v9

    .line 133
    .line 134
    const/high16 v9, 0x3f800000    # 1.0f

    .line 135
    .line 136
    move-object/from16 v18, v7

    .line 137
    .line 138
    move v7, v3

    .line 139
    move v3, v6

    .line 140
    move-object v6, v5

    .line 141
    move-object/from16 v5, v18

    .line 142
    .line 143
    invoke-direct/range {v4 .. v11}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    .line 144
    .line 145
    .line 146
    move-object/from16 v18, v6

    .line 147
    .line 148
    move-object v6, v4

    .line 149
    move-object v4, v5

    .line 150
    move-object/from16 v5, v18

    .line 151
    .line 152
    invoke-virtual {v6}, Landroid/text/StaticLayout;->getLineCount()I

    .line 153
    .line 154
    .line 155
    move-result v6

    .line 156
    if-le v6, v14, :cond_7

    .line 157
    .line 158
    :goto_2
    int-to-float v6, v3

    .line 159
    const/4 v8, 0x0

    .line 160
    move v9, v13

    .line 161
    move v7, v14

    .line 162
    move v10, v15

    .line 163
    move-object/from16 v11, v16

    .line 164
    .line 165
    invoke-static/range {v4 .. v11}, Ls3/c;->c(Ljava/lang/CharSequence;Landroid/text/TextPaint;FIFFFLandroid/util/DisplayMetrics;)F

    .line 166
    .line 167
    .line 168
    move-result v13

    .line 169
    goto :goto_3

    .line 170
    :cond_7
    move v9, v13

    .line 171
    :goto_3
    cmpg-float v3, v13, v12

    .line 172
    .line 173
    if-gez v3, :cond_8

    .line 174
    .line 175
    :goto_4
    const/4 v9, 0x0

    .line 176
    goto :goto_5

    .line 177
    :cond_8
    move v12, v13

    .line 178
    goto :goto_4

    .line 179
    :goto_5
    invoke-virtual {v1, v9, v12}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 180
    .line 181
    .line 182
    :goto_6
    iput-boolean v9, v0, Ls3/c;->i:Z

    .line 183
    .line 184
    invoke-virtual {v1}, Landroid/widget/TextView;->getTextSize()F

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    cmpl-float v1, v1, v2

    .line 189
    .line 190
    if-eqz v1, :cond_a

    .line 191
    .line 192
    iget-object v1, v0, Ls3/c;->j:Ljava/util/ArrayList;

    .line 193
    .line 194
    if-nez v1, :cond_9

    .line 195
    .line 196
    goto :goto_8

    .line 197
    :cond_9
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    move v4, v9

    .line 202
    :goto_7
    if-ge v4, v2, :cond_a

    .line 203
    .line 204
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v3

    .line 208
    add-int/lit8 v4, v4, 0x1

    .line 209
    .line 210
    check-cast v3, Ls3/b;

    .line 211
    .line 212
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    goto :goto_7

    .line 216
    :cond_a
    :goto_8
    return-void
.end method

.method public final d(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Ls3/c;->l:Ls3/a;

    .line 2
    .line 3
    iget-object v1, p0, Ls3/c;->k:Lcom/xuexiang/xui/widget/searchview/e;

    .line 4
    .line 5
    iget-object v2, p0, Ls3/c;->a:Landroid/widget/TextView;

    .line 6
    .line 7
    iget-boolean v3, p0, Ls3/c;->h:Z

    .line 8
    .line 9
    if-eq v3, p1, :cond_1

    .line 10
    .line 11
    iput-boolean p1, p0, Ls3/c;->h:Z

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Ls3/c;->a()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    iget v0, p0, Ls3/c;->c:F

    .line 33
    .line 34
    invoke-virtual {v2, p1, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void
.end method

.method public final e(FI)V
    .locals 2

    .line 1
    iget-object v0, p0, Ls3/c;->a:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    :cond_0
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {p2, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iget p2, p0, Ls3/c;->e:F

    .line 26
    .line 27
    cmpl-float p2, p1, p2

    .line 28
    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    iput p1, p0, Ls3/c;->e:F

    .line 32
    .line 33
    invoke-virtual {p0}, Ls3/c;->a()V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-void
.end method
