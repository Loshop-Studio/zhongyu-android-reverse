.class public Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;
.super Landroidx/appcompat/widget/AppCompatTextView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$e;,
        Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$d;
    }
.end annotation


# instance fields
.field public d:Li9/b;

.field public e:Landroid/widget/PopupWindow;

.field public f:Landroid/widget/ListView;

.field public g:Landroid/graphics/drawable/Drawable;

.field public h:Z

.field public i:Z

.field public j:I

.field public k:I

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:Z

.field public r:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->MaterialSpinnerStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->r(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic c(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->l:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic d(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->l:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic e(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)Li9/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->d:Li9/b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic f(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->i:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic g(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->i:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic h(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$d;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
.end method

.method public static synthetic i(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$e;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
.end method

.method public static synthetic j(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->h:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic k(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->l(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private r(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 10

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->MaterialSpinner:[I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-virtual {p0}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    .line 9
    .line 10
    .line 11
    move-result-object p3

    .line 12
    invoke-virtual {p3}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    invoke-static {}, Lcom/xuexiang/xui/utils/f;->m()Z

    .line 17
    .line 18
    .line 19
    :try_start_0
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialSpinner_ms_background_color:I

    .line 20
    .line 21
    const/4 v2, -0x1

    .line 22
    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iput v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->m:I

    .line 27
    .line 28
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialSpinner_ms_background_selector:I

    .line 29
    .line 30
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    sget v3, Lcom/xuexiang/xui/R$styleable;->MaterialSpinner_ms_text_color:I

    .line 35
    .line 36
    invoke-virtual {p2, v3, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    iput v3, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->p:I

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    sget v4, Lcom/xuexiang/xui/R$styleable;->MaterialSpinner_ms_arrow_image:I

    .line 47
    .line 48
    invoke-static {v3, p2, v4}, Lcom/xuexiang/xui/utils/f;->g(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    iput-object v3, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->g:Landroid/graphics/drawable/Drawable;

    .line 53
    .line 54
    sget v3, Lcom/xuexiang/xui/R$styleable;->MaterialSpinner_ms_arrow_tint:I

    .line 55
    .line 56
    iget v4, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->p:I

    .line 57
    .line 58
    invoke-virtual {p2, v3, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    iput v3, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->n:I

    .line 63
    .line 64
    sget v3, Lcom/xuexiang/xui/R$styleable;->MaterialSpinner_ms_hide_arrow:I

    .line 65
    .line 66
    invoke-virtual {p2, v3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    iput-boolean v3, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->h:Z

    .line 71
    .line 72
    sget v3, Lcom/xuexiang/xui/R$styleable;->MaterialSpinner_ms_dropdown_max_height:I

    .line 73
    .line 74
    invoke-virtual {p2, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    iput v3, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->j:I

    .line 79
    .line 80
    sget v3, Lcom/xuexiang/xui/R$styleable;->MaterialSpinner_ms_dropdown_height:I

    .line 81
    .line 82
    const/4 v4, -0x2

    .line 83
    invoke-virtual {p2, v3, v4}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    iput v3, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->k:I

    .line 88
    .line 89
    iget v3, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->n:I

    .line 90
    .line 91
    const v4, 0x3f4ccccd    # 0.8f

    .line 92
    .line 93
    .line 94
    invoke-static {v3, v4}, Lcom/xuexiang/xui/utils/f;->n(IF)I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    iput v3, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->o:I

    .line 99
    .line 100
    sget v3, Lcom/xuexiang/xui/R$styleable;->MaterialSpinner_ms_entries:I

    .line 101
    .line 102
    invoke-virtual {p2, v3, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    sget v5, Lcom/xuexiang/xui/R$styleable;->MaterialSpinner_ms_dropdown_bg:I

    .line 111
    .line 112
    invoke-static {v4, p2, v5}, Lcom/xuexiang/xui/utils/f;->g(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    sget v5, Lcom/xuexiang/xui/R$styleable;->MaterialSpinner_ms_in_dialog:I

    .line 117
    .line 118
    invoke-virtual {p2, v5, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    iput-boolean v5, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->q:Z

    .line 123
    .line 124
    sget v5, Lcom/xuexiang/xui/R$styleable;->MaterialSpinner_ms_pop_anim_style:I

    .line 125
    .line 126
    invoke-virtual {p2, v5, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 127
    .line 128
    .line 129
    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 130
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    sget v6, Lcom/xuexiang/xui/R$attr;->ms_padding_top_size:I

    .line 138
    .line 139
    invoke-static {p2, v6}, Lcom/xuexiang/xui/utils/g;->f(Landroid/content/Context;I)I

    .line 140
    .line 141
    .line 142
    move-result p2

    .line 143
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 144
    .line 145
    .line 146
    move-result-object v6

    .line 147
    sget v7, Lcom/xuexiang/xui/R$attr;->ms_padding_left_size:I

    .line 148
    .line 149
    invoke-static {v6, v7}, Lcom/xuexiang/xui/utils/g;->f(Landroid/content/Context;I)I

    .line 150
    .line 151
    .line 152
    move-result v6

    .line 153
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    sget v8, Lcom/xuexiang/xui/R$attr;->ms_dropdown_offset:I

    .line 158
    .line 159
    invoke-static {v7, v8}, Lcom/xuexiang/xui/utils/g;->f(Landroid/content/Context;I)I

    .line 160
    .line 161
    .line 162
    move-result v7

    .line 163
    iput v7, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->r:I

    .line 164
    .line 165
    const v7, 0x800013

    .line 166
    .line 167
    .line 168
    invoke-virtual {p0, v7}, Landroid/widget/TextView;->setGravity(I)V

    .line 169
    .line 170
    .line 171
    const/4 v7, 0x1

    .line 172
    invoke-virtual {p0, v7}, Landroid/view/View;->setClickable(Z)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p0, v6, p2, p2, p2}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 176
    .line 177
    .line 178
    sget p2, Lcom/xuexiang/xui/R$drawable;->ms_background_selector:I

    .line 179
    .line 180
    invoke-virtual {p0, p2}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundResource(I)V

    .line 181
    .line 182
    .line 183
    iget-boolean p2, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->h:Z

    .line 184
    .line 185
    const/4 v6, 0x0

    .line 186
    if-nez p2, :cond_1

    .line 187
    .line 188
    iget-object p2, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->g:Landroid/graphics/drawable/Drawable;

    .line 189
    .line 190
    if-nez p2, :cond_0

    .line 191
    .line 192
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 193
    .line 194
    .line 195
    move-result-object p2

    .line 196
    sget v8, Lcom/xuexiang/xui/R$drawable;->ms_ic_arrow_up:I

    .line 197
    .line 198
    invoke-static {p2, v8}, Lcom/xuexiang/xui/utils/f;->l(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 199
    .line 200
    .line 201
    move-result-object p2

    .line 202
    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 203
    .line 204
    .line 205
    move-result-object p2

    .line 206
    iput-object p2, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->g:Landroid/graphics/drawable/Drawable;

    .line 207
    .line 208
    :cond_0
    iget-object p2, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->g:Landroid/graphics/drawable/Drawable;

    .line 209
    .line 210
    iget v8, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->n:I

    .line 211
    .line 212
    sget-object v9, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 213
    .line 214
    invoke-virtual {p2, v8, v9}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 218
    .line 219
    .line 220
    move-result-object p2

    .line 221
    sget v8, Lcom/xuexiang/xui/R$attr;->ms_arrow_size:I

    .line 222
    .line 223
    invoke-static {p2, v8}, Lcom/xuexiang/xui/utils/g;->f(Landroid/content/Context;I)I

    .line 224
    .line 225
    .line 226
    move-result p2

    .line 227
    iget-object v8, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->g:Landroid/graphics/drawable/Drawable;

    .line 228
    .line 229
    invoke-virtual {v8, v1, v1, p2, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 230
    .line 231
    .line 232
    iget-object p2, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->g:Landroid/graphics/drawable/Drawable;

    .line 233
    .line 234
    invoke-virtual {p0, v6, v6, p2, v6}, Landroidx/appcompat/widget/AppCompatTextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 235
    .line 236
    .line 237
    :cond_1
    new-instance p2, Landroid/widget/ListView;

    .line 238
    .line 239
    invoke-direct {p2, p1}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    .line 240
    .line 241
    .line 242
    iput-object p2, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->f:Landroid/widget/ListView;

    .line 243
    .line 244
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    invoke-virtual {p2, v1}, Landroid/view/View;->setId(I)V

    .line 249
    .line 250
    .line 251
    iget-object p2, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->f:Landroid/widget/ListView;

    .line 252
    .line 253
    invoke-virtual {p2, v6}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 254
    .line 255
    .line 256
    iget-object p2, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->f:Landroid/widget/ListView;

    .line 257
    .line 258
    invoke-virtual {p2, v7}, Landroid/widget/ListView;->setItemsCanFocus(Z)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 262
    .line 263
    .line 264
    move-result-object p2

    .line 265
    sget v1, Lcom/xuexiang/xui/R$attr;->ms_dropdown_offset:I

    .line 266
    .line 267
    invoke-static {p2, v1}, Lcom/xuexiang/xui/utils/g;->f(Landroid/content/Context;I)I

    .line 268
    .line 269
    .line 270
    move-result p2

    .line 271
    iget-object v1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->f:Landroid/widget/ListView;

    .line 272
    .line 273
    invoke-virtual {v1, p2, p2, p2, p2}, Landroid/view/View;->setPadding(IIII)V

    .line 274
    .line 275
    .line 276
    iget-object p2, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->f:Landroid/widget/ListView;

    .line 277
    .line 278
    new-instance v1, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$a;

    .line 279
    .line 280
    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$a;-><init>(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {p2, v1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 284
    .line 285
    .line 286
    if-eqz v3, :cond_2

    .line 287
    .line 288
    invoke-static {v3}, Lcom/xuexiang/xui/utils/f;->k(I)[Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object p2

    .line 292
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->t([Ljava/lang/Object;)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    .line 293
    .line 294
    .line 295
    :cond_2
    new-instance p2, Landroid/widget/PopupWindow;

    .line 296
    .line 297
    invoke-direct {p2, p1}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;)V

    .line 298
    .line 299
    .line 300
    iput-object p2, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->e:Landroid/widget/PopupWindow;

    .line 301
    .line 302
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->f:Landroid/widget/ListView;

    .line 303
    .line 304
    invoke-virtual {p2, p1}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 305
    .line 306
    .line 307
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->e:Landroid/widget/PopupWindow;

    .line 308
    .line 309
    invoke-virtual {p1, v7}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 310
    .line 311
    .line 312
    if-eq v5, v2, :cond_3

    .line 313
    .line 314
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->e:Landroid/widget/PopupWindow;

    .line 315
    .line 316
    invoke-virtual {p1, v5}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    .line 317
    .line 318
    .line 319
    :cond_3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->e:Landroid/widget/PopupWindow;

    .line 320
    .line 321
    invoke-virtual {p1, v7}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 322
    .line 323
    .line 324
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->e:Landroid/widget/PopupWindow;

    .line 325
    .line 326
    const/4 p2, 0x2

    .line 327
    invoke-virtual {p1, p2}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 328
    .line 329
    .line 330
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->e:Landroid/widget/PopupWindow;

    .line 331
    .line 332
    const/16 p2, 0x30

    .line 333
    .line 334
    invoke-virtual {p1, p2}, Landroid/widget/PopupWindow;->setSoftInputMode(I)V

    .line 335
    .line 336
    .line 337
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->e:Landroid/widget/PopupWindow;

    .line 338
    .line 339
    const/high16 p2, 0x41800000    # 16.0f

    .line 340
    .line 341
    invoke-virtual {p1, p2}, Landroid/widget/PopupWindow;->setElevation(F)V

    .line 342
    .line 343
    .line 344
    if-eqz v4, :cond_4

    .line 345
    .line 346
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->e:Landroid/widget/PopupWindow;

    .line 347
    .line 348
    invoke-virtual {p1, v4}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 349
    .line 350
    .line 351
    goto :goto_0

    .line 352
    :cond_4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->e:Landroid/widget/PopupWindow;

    .line 353
    .line 354
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 355
    .line 356
    .line 357
    move-result-object p2

    .line 358
    sget v1, Lcom/xuexiang/xui/R$drawable;->ms_drop_down_bg:I

    .line 359
    .line 360
    invoke-static {p2, v1}, Lcom/xuexiang/xui/utils/f;->f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 361
    .line 362
    .line 363
    move-result-object p2

    .line 364
    invoke-virtual {p1, p2}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 365
    .line 366
    .line 367
    :goto_0
    iget p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->m:I

    .line 368
    .line 369
    if-eq p1, v2, :cond_5

    .line 370
    .line 371
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->setBackgroundColor(I)V

    .line 372
    .line 373
    .line 374
    goto :goto_1

    .line 375
    :cond_5
    if-eqz v0, :cond_6

    .line 376
    .line 377
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundResource(I)V

    .line 378
    .line 379
    .line 380
    :cond_6
    :goto_1
    iget p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->p:I

    .line 381
    .line 382
    if-eq p1, p3, :cond_7

    .line 383
    .line 384
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->setTextColor(I)V

    .line 385
    .line 386
    .line 387
    :cond_7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->e:Landroid/widget/PopupWindow;

    .line 388
    .line 389
    new-instance p2, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$b;

    .line 390
    .line 391
    invoke-direct {p2, p0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$b;-><init>(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {p1, p2}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 395
    .line 396
    .line 397
    return-void

    .line 398
    :catchall_0
    move-exception p1

    .line 399
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 400
    .line 401
    .line 402
    throw p1
.end method

.method private setAdapterInternal(Li9/b;)V
    .locals 2
    .param p1    # Li9/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->f:Landroid/widget/ListView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->l:I

    .line 7
    .line 8
    invoke-virtual {p1}, Li9/b;->getCount()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-lt v0, v1, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->l:I

    .line 16
    .line 17
    :cond_0
    invoke-virtual {p1}, Li9/b;->getCount()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-ltz v0, :cond_1

    .line 22
    .line 23
    iget v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->l:I

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Li9/b;->a(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    const-string p1, ""

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public getAdapter()Li9/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->d:Li9/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public getItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->d:Li9/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Li9/b;->c()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public getListView()Landroid/widget/ListView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->f:Landroid/widget/ListView;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPopupWindow()Landroid/widget/PopupWindow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->e:Landroid/widget/PopupWindow;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSelectedIndex()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->l:I

    .line 2
    .line 3
    return v0
.end method

.method public getSelectedItem()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->d:Li9/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->l:I

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Li9/b;->a(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
.end method

.method public final l(Z)V
    .locals 3

    .line 1
    const/16 v0, 0x2710

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    move v2, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move v2, v0

    .line 9
    :goto_0
    if-eqz p1, :cond_1

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_1
    move v0, v1

    .line 13
    :goto_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->g:Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    const-string v1, "level"

    .line 16
    .line 17
    filled-new-array {v2, v0}, [I

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {p1, v1, v0}, Landroid/animation/ObjectAnimator;->ofInt(Ljava/lang/Object;Ljava/lang/String;[I)Landroid/animation/ObjectAnimator;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final m(Landroid/view/View;)I
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v1}, Lcom/xuexiang/xui/utils/h;->f(Landroid/content/Context;)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget-object v2, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->f:Landroid/widget/ListView;

    .line 20
    .line 21
    invoke-static {v2}, Lcom/xuexiang/xui/utils/h;->e(Landroid/widget/ListView;)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    iget v3, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->j:I

    .line 26
    .line 27
    if-lez v3, :cond_0

    .line 28
    .line 29
    if-le v2, v3, :cond_0

    .line 30
    .line 31
    move v2, v3

    .line 32
    :cond_0
    const/4 v3, 0x1

    .line 33
    aget v0, v0, v3

    .line 34
    .line 35
    sub-int/2addr v1, v0

    .line 36
    add-int v0, v2, p1

    .line 37
    .line 38
    if-ge v1, v0, :cond_1

    .line 39
    .line 40
    iget v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->r:I

    .line 41
    .line 42
    add-int/2addr v2, v0

    .line 43
    add-int/2addr v2, p1

    .line 44
    neg-int p1, v2

    .line 45
    return p1

    .line 46
    :cond_1
    const/4 p1, 0x0

    .line 47
    return p1
.end method

.method public final n()I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->d:Li9/b;

    .line 2
    .line 3
    const/4 v1, -0x2

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {v0}, Li9/b;->getCount()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    sget v3, Lcom/xuexiang/xui/R$attr;->ms_item_height_size:I

    .line 16
    .line 17
    invoke-static {v2, v3}, Lcom/xuexiang/xui/utils/g;->f(Landroid/content/Context;I)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    mul-int/2addr v0, v2

    .line 22
    int-to-float v0, v0

    .line 23
    iget v2, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->j:I

    .line 24
    .line 25
    if-lez v2, :cond_1

    .line 26
    .line 27
    int-to-float v3, v2

    .line 28
    cmpl-float v3, v0, v3

    .line 29
    .line 30
    if-lez v3, :cond_1

    .line 31
    .line 32
    return v2

    .line 33
    :cond_1
    iget v2, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->k:I

    .line 34
    .line 35
    const/4 v3, -0x1

    .line 36
    if-eq v2, v3, :cond_2

    .line 37
    .line 38
    if-eq v2, v1, :cond_2

    .line 39
    .line 40
    int-to-float v3, v2

    .line 41
    cmpg-float v0, v3, v0

    .line 42
    .line 43
    if-gtz v0, :cond_2

    .line 44
    .line 45
    return v2

    .line 46
    :cond_2
    return v1
.end method

.method public o()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->h:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->l(Z)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->e:Landroid/widget/PopupWindow;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public onMeasure(II)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->e:Landroid/widget/PopupWindow;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->n()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->d:Li9/b;

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const/4 v2, 0x0

    .line 23
    :goto_0
    iget-object v3, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->d:Li9/b;

    .line 24
    .line 25
    invoke-virtual {v3}, Li9/b;->getCount()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-ge v2, v3, :cond_1

    .line 30
    .line 31
    iget-object v3, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->d:Li9/b;

    .line 32
    .line 33
    invoke-virtual {v3, v2}, Li9/b;->b(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-le v4, v5, :cond_0

    .line 46
    .line 47
    move-object v1, v3

    .line 48
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 52
    .line 53
    .line 54
    invoke-super {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatTextView;->onMeasure(II)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    invoke-super {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatTextView;->onMeasure(II)V

    .line 62
    .line 63
    .line 64
    :goto_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->e:Landroid/widget/PopupWindow;

    .line 65
    .line 66
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    invoke-virtual {p1, p2}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2

    .line 1
    instance-of v0, p1, Landroid/os/Bundle;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    check-cast p1, Landroid/os/Bundle;

    .line 6
    .line 7
    const-string v0, "selected_index"

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iput v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->l:I

    .line 14
    .line 15
    iget-object v1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->d:Li9/b;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Li9/b;->a(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->d:Li9/b;

    .line 31
    .line 32
    iget v1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->l:I

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Li9/b;->e(I)V

    .line 35
    .line 36
    .line 37
    :cond_0
    const-string v0, "is_popup_showing"

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->e:Landroid/widget/PopupWindow;

    .line 46
    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    new-instance v0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$c;

    .line 50
    .line 51
    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$c;-><init>(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 55
    .line 56
    .line 57
    :cond_1
    const-string v0, "state"

    .line 58
    .line 59
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    :cond_2
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "state"

    .line 7
    .line 8
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 13
    .line 14
    .line 15
    const-string v1, "selected_index"

    .line 16
    .line 17
    iget v2, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->l:I

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->e:Landroid/widget/PopupWindow;

    .line 23
    .line 24
    const-string v2, "is_popup_showing"

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->o()V

    .line 36
    .line 37
    .line 38
    return-object v0

    .line 39
    :cond_0
    const/4 v1, 0x0

    .line 40
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    return-object v0
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
    const/4 v1, 0x1

    .line 6
    if-ne v0, v1, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->isClickable()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->e:Landroid/widget/PopupWindow;

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->p()V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->o()V

    .line 33
    .line 34
    .line 35
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    return p1
.end method

.method public p()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->h:Z

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->l(Z)V

    .line 14
    .line 15
    .line 16
    :cond_1
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->i:Z

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->u()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final q()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->d:Li9/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Li9/b;->getCount()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public s(Ljava/util/List;)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;
    .locals 2

    .line 1
    new-instance v0, Li9/a;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1, p1}, Li9/a;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    iget p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->p:I

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Li9/b;->f(I)Li9/b;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0}, Landroid/widget/TextView;->getTextSize()F

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-virtual {p1, v0}, Li9/b;->g(F)Li9/b;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->d:Li9/b;

    .line 25
    .line 26
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->setAdapterInternal(Li9/b;)V

    .line 27
    .line 28
    .line 29
    return-object p0
.end method

.method public setArrowColor(I)V
    .locals 2
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->n:I

    .line 2
    .line 3
    const v0, 0x3f4ccccd    # 0.8f

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lcom/xuexiang/xui/utils/f;->n(IF)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->o:I

    .line 11
    .line 12
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->g:Landroid/graphics/drawable/Drawable;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iget v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->n:I

    .line 17
    .line 18
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 19
    .line 20
    invoke-virtual {p1, v0, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public setBackgroundColor(I)V
    .locals 6

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->m:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, Landroid/graphics/drawable/StateListDrawable;

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    :try_start_0
    const-class v1, Landroid/graphics/drawable/StateListDrawable;

    .line 12
    .line 13
    const-string v2, "getStateDrawable"

    .line 14
    .line 15
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 16
    .line 17
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catch_0
    move-exception v0

    .line 37
    goto :goto_2

    .line 38
    :cond_0
    :goto_0
    const v2, 0x3f59999a    # 0.85f

    .line 39
    .line 40
    .line 41
    invoke-static {p1, v2}, Lcom/xuexiang/xui/utils/f;->a(IF)I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    filled-new-array {v2, p1}, [I

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    const/4 v3, 0x0

    .line 50
    :goto_1
    const/4 v4, 0x2

    .line 51
    if-ge v3, v4, :cond_2

    .line 52
    .line 53
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-virtual {v1, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    check-cast v4, Landroid/graphics/drawable/ColorDrawable;

    .line 66
    .line 67
    aget v5, v2, v3

    .line 68
    .line 69
    invoke-virtual {v4, v5}, Landroid/graphics/drawable/ColorDrawable;->setColor(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    .line 71
    .line 72
    add-int/lit8 v3, v3, 0x1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 76
    .line 77
    .line 78
    invoke-static {v0}, Lb8/c;->d(Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_1
    if-eqz v0, :cond_2

    .line 83
    .line 84
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 85
    .line 86
    invoke-virtual {v0, p1, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 87
    .line 88
    .line 89
    :cond_2
    :goto_3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->e:Landroid/widget/PopupWindow;

    .line 90
    .line 91
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 96
    .line 97
    invoke-virtual {v0, p1, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method public setDropdownHeight(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->k:I

    .line 2
    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->e:Landroid/widget/PopupWindow;

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->n()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p1, v0}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setDropdownMaxHeight(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->j:I

    .line 2
    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->e:Landroid/widget/PopupWindow;

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->n()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p1, v0}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setEnabled(Z)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->g:Landroid/graphics/drawable/Drawable;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->n:I

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->o:I

    .line 14
    .line 15
    :goto_0
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 16
    .line 17
    invoke-virtual {v0, p1, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method public setTextColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->p:I

    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final varargs t([Ljava/lang/Object;)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->s(Ljava/util/List;)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public final u()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->q:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->e:Landroid/widget/PopupWindow;

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->e:Landroid/widget/PopupWindow;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {p0, p0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->m(Landroid/view/View;)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-virtual {v0, p0, v1, v2}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
