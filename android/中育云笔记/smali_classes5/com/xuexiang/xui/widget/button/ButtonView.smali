.class public Lcom/xuexiang/xui/widget/button/ButtonView;
.super Landroidx/appcompat/widget/AppCompatTextView;
.source "SourceFile"


# instance fields
.field public d:Landroid/graphics/drawable/GradientDrawable;

.field public e:I

.field public f:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/button/ButtonView;->c(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/button/ButtonView;->c(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public final c(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 11

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->ButtonView:[I

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget p2, Lcom/xuexiang/xui/R$styleable;->ButtonView_textSolidColor:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    iput p2, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->e:I

    .line 15
    .line 16
    sget p2, Lcom/xuexiang/xui/R$styleable;->ButtonView_textSelectedSolidColor:I

    .line 17
    .line 18
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    iput p2, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->f:I

    .line 23
    .line 24
    sget p2, Lcom/xuexiang/xui/R$styleable;->ButtonView_textStrokeColor:I

    .line 25
    .line 26
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    sget v1, Lcom/xuexiang/xui/R$styleable;->ButtonView_textRadius:I

    .line 31
    .line 32
    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    sget v2, Lcom/xuexiang/xui/R$styleable;->ButtonView_textLeftTopRadius:I

    .line 37
    .line 38
    invoke-virtual {p1, v2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    sget v3, Lcom/xuexiang/xui/R$styleable;->ButtonView_textLeftBottomRadius:I

    .line 43
    .line 44
    invoke-virtual {p1, v3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    sget v4, Lcom/xuexiang/xui/R$styleable;->ButtonView_textRightTopRadius:I

    .line 49
    .line 50
    invoke-virtual {p1, v4, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    sget v5, Lcom/xuexiang/xui/R$styleable;->ButtonView_textRightBottomRadius:I

    .line 55
    .line 56
    invoke-virtual {p1, v5, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    sget v6, Lcom/xuexiang/xui/R$styleable;->ButtonView_textStrokeWidth:I

    .line 61
    .line 62
    invoke-virtual {p1, v6, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    sget v8, Lcom/xuexiang/xui/R$styleable;->ButtonView_textDrawable:I

    .line 71
    .line 72
    invoke-static {v7, p1, v8}, Lcom/xuexiang/xui/utils/f;->g(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    sget v8, Lcom/xuexiang/xui/R$styleable;->ButtonView_textNormalTextColor:I

    .line 77
    .line 78
    invoke-virtual {p1, v8, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    sget v9, Lcom/xuexiang/xui/R$styleable;->ButtonView_textSelectedTextColor:I

    .line 83
    .line 84
    invoke-virtual {p1, v9, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 85
    .line 86
    .line 87
    move-result v9

    .line 88
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 89
    .line 90
    .line 91
    new-instance p1, Landroid/graphics/drawable/GradientDrawable;

    .line 92
    .line 93
    invoke-direct {p1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 94
    .line 95
    .line 96
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->d:Landroid/graphics/drawable/GradientDrawable;

    .line 97
    .line 98
    invoke-virtual {p1, v6, p2}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 99
    .line 100
    .line 101
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->d:Landroid/graphics/drawable/GradientDrawable;

    .line 102
    .line 103
    iget p2, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->e:I

    .line 104
    .line 105
    invoke-virtual {p1, p2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 106
    .line 107
    .line 108
    const/4 p1, 0x3

    .line 109
    const/4 p2, 0x2

    .line 110
    const/4 v6, 0x1

    .line 111
    if-lez v1, :cond_0

    .line 112
    .line 113
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->d:Landroid/graphics/drawable/GradientDrawable;

    .line 114
    .line 115
    int-to-float v1, v1

    .line 116
    invoke-virtual {v2, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_0
    if-gtz v2, :cond_1

    .line 121
    .line 122
    if-gtz v3, :cond_1

    .line 123
    .line 124
    if-gtz v4, :cond_1

    .line 125
    .line 126
    if-lez v5, :cond_2

    .line 127
    .line 128
    :cond_1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->d:Landroid/graphics/drawable/GradientDrawable;

    .line 129
    .line 130
    int-to-float v2, v2

    .line 131
    int-to-float v4, v4

    .line 132
    int-to-float v5, v5

    .line 133
    int-to-float v3, v3

    .line 134
    const/16 v10, 0x8

    .line 135
    .line 136
    new-array v10, v10, [F

    .line 137
    .line 138
    aput v2, v10, v0

    .line 139
    .line 140
    aput v2, v10, v6

    .line 141
    .line 142
    aput v4, v10, p2

    .line 143
    .line 144
    aput v4, v10, p1

    .line 145
    .line 146
    const/4 v2, 0x4

    .line 147
    aput v5, v10, v2

    .line 148
    .line 149
    const/4 v2, 0x5

    .line 150
    aput v5, v10, v2

    .line 151
    .line 152
    const/4 v2, 0x6

    .line 153
    aput v3, v10, v2

    .line 154
    .line 155
    const/4 v2, 0x7

    .line 156
    aput v3, v10, v2

    .line 157
    .line 158
    invoke-virtual {v1, v10}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadii([F)V

    .line 159
    .line 160
    .line 161
    :cond_2
    :goto_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->d:Landroid/graphics/drawable/GradientDrawable;

    .line 162
    .line 163
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 164
    .line 165
    .line 166
    if-eqz v7, :cond_3

    .line 167
    .line 168
    const/16 v1, 0x14

    .line 169
    .line 170
    invoke-virtual {p0, v7, v1}, Lcom/xuexiang/xui/widget/button/ButtonView;->d(Landroid/graphics/drawable/Drawable;I)Lcom/xuexiang/xui/widget/button/ButtonView;

    .line 171
    .line 172
    .line 173
    :cond_3
    if-eqz v8, :cond_4

    .line 174
    .line 175
    if-eqz v9, :cond_4

    .line 176
    .line 177
    new-array v1, p2, [I

    .line 178
    .line 179
    aput v6, v1, v6

    .line 180
    .line 181
    aput p1, v1, v0

    .line 182
    .line 183
    sget-object p1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 184
    .line 185
    invoke-static {p1, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    check-cast p1, [[I

    .line 190
    .line 191
    const v1, 0x10100a1

    .line 192
    .line 193
    .line 194
    filled-new-array {v1}, [I

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    aput-object v1, p1, v0

    .line 199
    .line 200
    const v1, 0x10100a7

    .line 201
    .line 202
    .line 203
    filled-new-array {v1}, [I

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    aput-object v1, p1, v6

    .line 208
    .line 209
    new-array v1, v0, [I

    .line 210
    .line 211
    aput-object v1, p1, p2

    .line 212
    .line 213
    new-instance p2, Landroid/content/res/ColorStateList;

    .line 214
    .line 215
    filled-new-array {v9, v9, v8}, [I

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    invoke-direct {p2, p1, v1}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 223
    .line 224
    .line 225
    :cond_4
    if-nez v9, :cond_6

    .line 226
    .line 227
    iget p1, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->f:I

    .line 228
    .line 229
    if-eqz p1, :cond_5

    .line 230
    .line 231
    goto :goto_1

    .line 232
    :cond_5
    invoke-virtual {p0, v0}, Landroid/view/View;->setClickable(Z)V

    .line 233
    .line 234
    .line 235
    return-void

    .line 236
    :cond_6
    :goto_1
    invoke-virtual {p0, v6}, Landroid/view/View;->setClickable(Z)V

    .line 237
    .line 238
    .line 239
    return-void
.end method

.method public d(Landroid/graphics/drawable/Drawable;I)Lcom/xuexiang/xui/widget/button/ButtonView;
    .locals 2

    .line 1
    new-instance v0, Lcom/xuexiang/xui/utils/SpanUtils;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/xuexiang/xui/utils/SpanUtils;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-virtual {v0, p1, v1}, Lcom/xuexiang/xui/utils/SpanUtils;->b(Landroid/graphics/drawable/Drawable;I)Lcom/xuexiang/xui/utils/SpanUtils;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p1, p2, v0}, Lcom/xuexiang/xui/utils/SpanUtils;->c(II)Lcom/xuexiang/xui/utils/SpanUtils;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/utils/SpanUtils;->a(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/utils/SpanUtils;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/utils/SpanUtils;->g(I)Lcom/xuexiang/xui/utils/SpanUtils;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Lcom/xuexiang/xui/utils/SpanUtils;->f()Landroid/text/SpannableStringBuilder;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    return-object p0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget v0, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->f:I

    .line 8
    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->d:Landroid/graphics/drawable/GradientDrawable;

    .line 18
    .line 19
    iget v1, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->f:I

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->d:Landroid/graphics/drawable/GradientDrawable;

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/4 v1, 0x1

    .line 38
    if-eq v0, v1, :cond_1

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    const/4 v1, 0x3

    .line 45
    if-ne v0, v1, :cond_2

    .line 46
    .line 47
    :cond_1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->f:I

    .line 48
    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->d:Landroid/graphics/drawable/GradientDrawable;

    .line 52
    .line 53
    iget v1, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->e:I

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->d:Landroid/graphics/drawable/GradientDrawable;

    .line 59
    .line 60
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 61
    .line 62
    .line 63
    :cond_2
    :goto_0
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    return p1
.end method
