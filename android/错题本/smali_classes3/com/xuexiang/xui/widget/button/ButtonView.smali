.class public Lcom/xuexiang/xui/widget/button/ButtonView;
.super Landroidx/appcompat/widget/AppCompatTextView;
.source "SourceFile"


# instance fields
.field public b:Landroid/graphics/drawable/GradientDrawable;

.field public c:I

.field public d:I


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
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/button/ButtonView;->b(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/button/ButtonView;->b(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public final b(Landroid/content/Context;Landroid/util/AttributeSet;)V
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
    iput p2, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->c:I

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
    iput p2, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->d:I

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
    sget v7, Lcom/xuexiang/xui/R$styleable;->ButtonView_textDrawable:I

    .line 70
    .line 71
    invoke-virtual {p1, v7}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    sget v8, Lcom/xuexiang/xui/R$styleable;->ButtonView_textNormalTextColor:I

    .line 76
    .line 77
    invoke-virtual {p1, v8, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 78
    .line 79
    .line 80
    move-result v8

    .line 81
    sget v9, Lcom/xuexiang/xui/R$styleable;->ButtonView_textSelectedTextColor:I

    .line 82
    .line 83
    invoke-virtual {p1, v9, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 84
    .line 85
    .line 86
    move-result v9

    .line 87
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 88
    .line 89
    .line 90
    new-instance p1, Landroid/graphics/drawable/GradientDrawable;

    .line 91
    .line 92
    invoke-direct {p1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 93
    .line 94
    .line 95
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->b:Landroid/graphics/drawable/GradientDrawable;

    .line 96
    .line 97
    invoke-virtual {p1, v6, p2}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 98
    .line 99
    .line 100
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->b:Landroid/graphics/drawable/GradientDrawable;

    .line 101
    .line 102
    iget p2, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->c:I

    .line 103
    .line 104
    invoke-virtual {p1, p2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 105
    .line 106
    .line 107
    const/4 p1, 0x3

    .line 108
    const/4 p2, 0x2

    .line 109
    const/4 v6, 0x1

    .line 110
    if-lez v1, :cond_0

    .line 111
    .line 112
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->b:Landroid/graphics/drawable/GradientDrawable;

    .line 113
    .line 114
    int-to-float v1, v1

    .line 115
    invoke-virtual {v2, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_0
    if-gtz v2, :cond_1

    .line 120
    .line 121
    if-gtz v3, :cond_1

    .line 122
    .line 123
    if-gtz v4, :cond_1

    .line 124
    .line 125
    if-lez v5, :cond_2

    .line 126
    .line 127
    :cond_1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->b:Landroid/graphics/drawable/GradientDrawable;

    .line 128
    .line 129
    int-to-float v2, v2

    .line 130
    int-to-float v4, v4

    .line 131
    int-to-float v5, v5

    .line 132
    int-to-float v3, v3

    .line 133
    const/16 v10, 0x8

    .line 134
    .line 135
    new-array v10, v10, [F

    .line 136
    .line 137
    aput v2, v10, v0

    .line 138
    .line 139
    aput v2, v10, v6

    .line 140
    .line 141
    aput v4, v10, p2

    .line 142
    .line 143
    aput v4, v10, p1

    .line 144
    .line 145
    const/4 v2, 0x4

    .line 146
    aput v5, v10, v2

    .line 147
    .line 148
    const/4 v2, 0x5

    .line 149
    aput v5, v10, v2

    .line 150
    .line 151
    const/4 v2, 0x6

    .line 152
    aput v3, v10, v2

    .line 153
    .line 154
    const/4 v2, 0x7

    .line 155
    aput v3, v10, v2

    .line 156
    .line 157
    invoke-virtual {v1, v10}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadii([F)V

    .line 158
    .line 159
    .line 160
    :cond_2
    :goto_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->b:Landroid/graphics/drawable/GradientDrawable;

    .line 161
    .line 162
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 163
    .line 164
    .line 165
    if-eqz v7, :cond_3

    .line 166
    .line 167
    new-instance v1, Lcom/xuexiang/xui/utils/i;

    .line 168
    .line 169
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 170
    .line 171
    .line 172
    new-instance v2, Landroid/text/SpannableStringBuilder;

    .line 173
    .line 174
    invoke-direct {v2}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 175
    .line 176
    .line 177
    iput-object v2, v1, Lcom/xuexiang/xui/utils/i;->t:Landroid/text/SpannableStringBuilder;

    .line 178
    .line 179
    const-string v3, ""

    .line 180
    .line 181
    iput-object v3, v1, Lcom/xuexiang/xui/utils/i;->a:Ljava/lang/CharSequence;

    .line 182
    .line 183
    invoke-virtual {v1}, Lcom/xuexiang/xui/utils/i;->b()V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v1}, Lcom/xuexiang/xui/utils/i;->a()V

    .line 187
    .line 188
    .line 189
    iput v6, v1, Lcom/xuexiang/xui/utils/i;->u:I

    .line 190
    .line 191
    iput-object v7, v1, Lcom/xuexiang/xui/utils/i;->p:Landroid/graphics/drawable/Drawable;

    .line 192
    .line 193
    iput v6, v1, Lcom/xuexiang/xui/utils/i;->r:I

    .line 194
    .line 195
    invoke-virtual {v1}, Lcom/xuexiang/xui/utils/i;->a()V

    .line 196
    .line 197
    .line 198
    iput p2, v1, Lcom/xuexiang/xui/utils/i;->u:I

    .line 199
    .line 200
    const/16 v3, 0x14

    .line 201
    .line 202
    iput v3, v1, Lcom/xuexiang/xui/utils/i;->s:I

    .line 203
    .line 204
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    .line 205
    .line 206
    .line 207
    move-result-object v3

    .line 208
    invoke-virtual {v1}, Lcom/xuexiang/xui/utils/i;->a()V

    .line 209
    .line 210
    .line 211
    iput v0, v1, Lcom/xuexiang/xui/utils/i;->u:I

    .line 212
    .line 213
    iput-object v3, v1, Lcom/xuexiang/xui/utils/i;->a:Ljava/lang/CharSequence;

    .line 214
    .line 215
    iput v0, v1, Lcom/xuexiang/xui/utils/i;->d:I

    .line 216
    .line 217
    invoke-virtual {v1}, Lcom/xuexiang/xui/utils/i;->a()V

    .line 218
    .line 219
    .line 220
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 221
    .line 222
    .line 223
    :cond_3
    if-eqz v8, :cond_4

    .line 224
    .line 225
    if-eqz v9, :cond_4

    .line 226
    .line 227
    new-array v1, p2, [I

    .line 228
    .line 229
    aput v6, v1, v6

    .line 230
    .line 231
    aput p1, v1, v0

    .line 232
    .line 233
    sget-object p1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 234
    .line 235
    invoke-static {p1, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    check-cast p1, [[I

    .line 240
    .line 241
    const v1, 0x10100a1

    .line 242
    .line 243
    .line 244
    filled-new-array {v1}, [I

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    aput-object v1, p1, v0

    .line 249
    .line 250
    const v1, 0x10100a7

    .line 251
    .line 252
    .line 253
    filled-new-array {v1}, [I

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    aput-object v1, p1, v6

    .line 258
    .line 259
    new-array v1, v0, [I

    .line 260
    .line 261
    aput-object v1, p1, p2

    .line 262
    .line 263
    new-instance p2, Landroid/content/res/ColorStateList;

    .line 264
    .line 265
    filled-new-array {v9, v9, v8}, [I

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    invoke-direct {p2, p1, v1}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 273
    .line 274
    .line 275
    :cond_4
    if-nez v9, :cond_6

    .line 276
    .line 277
    iget p1, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->d:I

    .line 278
    .line 279
    if-eqz p1, :cond_5

    .line 280
    .line 281
    goto :goto_1

    .line 282
    :cond_5
    invoke-virtual {p0, v0}, Landroid/view/View;->setClickable(Z)V

    .line 283
    .line 284
    .line 285
    return-void

    .line 286
    :cond_6
    :goto_1
    invoke-virtual {p0, v6}, Landroid/view/View;->setClickable(Z)V

    .line 287
    .line 288
    .line 289
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
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
    iget v0, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->d:I

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->b:Landroid/graphics/drawable/GradientDrawable;

    .line 18
    .line 19
    iget v1, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->d:I

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->b:Landroid/graphics/drawable/GradientDrawable;

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
    iget v0, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->d:I

    .line 48
    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->b:Landroid/graphics/drawable/GradientDrawable;

    .line 52
    .line 53
    iget v1, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->c:I

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/ButtonView;->b:Landroid/graphics/drawable/GradientDrawable;

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
