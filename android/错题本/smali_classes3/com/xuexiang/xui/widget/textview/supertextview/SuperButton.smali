.class public Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;
.super Landroidx/appcompat/widget/AppCompatButton;
.source "SourceFile"


# instance fields
.field public A:Z

.field public B:Z

.field public C:I

.field public D:I

.field public E:Landroid/graphics/drawable/GradientDrawable;

.field public F:Lx1/b;

.field public a:Landroid/content/Context;

.field public final b:I

.field public final c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:F

.field public i:F

.field public j:F

.field public k:F

.field public l:F

.field public m:I

.field public n:I

.field public o:F

.field public p:F

.field public q:I

.field public r:I

.field public s:I

.field public t:I

.field public u:I

.field public v:I

.field public w:I

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/AppCompatButton;-><init>(Landroid/content/Context;)V

    const/high16 v0, 0x20000000

    .line 2
    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->b:I

    .line 3
    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->c:I

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->b(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 5
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/high16 v0, 0x20000000

    .line 6
    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->b:I

    .line 7
    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->c:I

    .line 8
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->b(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 9
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/high16 p3, 0x20000000

    .line 10
    iput p3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->b:I

    .line 11
    iput p3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->c:I

    .line 12
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->b(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private getAlphaViewHelper()Lx1/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->F:Lx1/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lx1/b;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lx1/b;-><init>(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->F:Lx1/b;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->F:Lx1/b;

    .line 13
    .line 14
    return-object v0
.end method

.method private setSelectorColor(I)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->s:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_3

    .line 5
    .line 6
    const v0, -0x101009e

    .line 7
    .line 8
    .line 9
    if-eq p1, v0, :cond_2

    .line 10
    .line 11
    const v0, 0x101009e

    .line 12
    .line 13
    .line 14
    if-eq p1, v0, :cond_1

    .line 15
    .line 16
    const v0, 0x10100a7

    .line 17
    .line 18
    .line 19
    if-eq p1, v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->E:Landroid/graphics/drawable/GradientDrawable;

    .line 23
    .line 24
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->e:I

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->E:Landroid/graphics/drawable/GradientDrawable;

    .line 31
    .line 32
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->g:I

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->E:Landroid/graphics/drawable/GradientDrawable;

    .line 39
    .line 40
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->f:I

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 43
    .line 44
    .line 45
    :cond_3
    :goto_0
    return-void
.end method


# virtual methods
.method public final a(I)Landroid/graphics/drawable/GradientDrawable;
    .locals 10

    .line 1
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->E:Landroid/graphics/drawable/GradientDrawable;

    .line 7
    .line 8
    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->C:I

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x3

    .line 12
    const/4 v4, 0x2

    .line 13
    const/4 v5, 0x1

    .line 14
    if-eqz v1, :cond_3

    .line 15
    .line 16
    if-eq v1, v5, :cond_2

    .line 17
    .line 18
    if-eq v1, v4, :cond_1

    .line 19
    .line 20
    if-eq v1, v3, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v0, v3}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-virtual {v0, v4}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    invoke-virtual {v0, v5}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_3
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 36
    .line 37
    .line 38
    :goto_0
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->s:I

    .line 39
    .line 40
    const/4 v1, -0x1

    .line 41
    if-eq v0, v1, :cond_8

    .line 42
    .line 43
    iget-object v6, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->E:Landroid/graphics/drawable/GradientDrawable;

    .line 44
    .line 45
    packed-switch v0, :pswitch_data_0

    .line 46
    .line 47
    .line 48
    const/4 v0, 0x0

    .line 49
    goto :goto_1

    .line 50
    :pswitch_0
    sget-object v0, Landroid/graphics/drawable/GradientDrawable$Orientation;->TL_BR:Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :pswitch_1
    sget-object v0, Landroid/graphics/drawable/GradientDrawable$Orientation;->LEFT_RIGHT:Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :pswitch_2
    sget-object v0, Landroid/graphics/drawable/GradientDrawable$Orientation;->BL_TR:Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :pswitch_3
    sget-object v0, Landroid/graphics/drawable/GradientDrawable$Orientation;->BOTTOM_TOP:Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :pswitch_4
    sget-object v0, Landroid/graphics/drawable/GradientDrawable$Orientation;->BR_TL:Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :pswitch_5
    sget-object v0, Landroid/graphics/drawable/GradientDrawable$Orientation;->RIGHT_LEFT:Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :pswitch_6
    sget-object v0, Landroid/graphics/drawable/GradientDrawable$Orientation;->TR_BL:Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :pswitch_7
    sget-object v0, Landroid/graphics/drawable/GradientDrawable$Orientation;->TOP_BOTTOM:Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 72
    .line 73
    :goto_1
    invoke-virtual {v6, v0}, Landroid/graphics/drawable/GradientDrawable;->setOrientation(Landroid/graphics/drawable/GradientDrawable$Orientation;)V

    .line 74
    .line 75
    .line 76
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->x:I

    .line 77
    .line 78
    if-ne v0, v1, :cond_4

    .line 79
    .line 80
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->E:Landroid/graphics/drawable/GradientDrawable;

    .line 81
    .line 82
    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->w:I

    .line 83
    .line 84
    iget v6, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->y:I

    .line 85
    .line 86
    filled-new-array {v1, v6}, [I

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColors([I)V

    .line 91
    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->E:Landroid/graphics/drawable/GradientDrawable;

    .line 95
    .line 96
    iget v6, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->w:I

    .line 97
    .line 98
    iget v7, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->y:I

    .line 99
    .line 100
    filled-new-array {v6, v0, v7}, [I

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/GradientDrawable;->setColors([I)V

    .line 105
    .line 106
    .line 107
    :goto_2
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->z:I

    .line 108
    .line 109
    if-eqz v0, :cond_7

    .line 110
    .line 111
    if-eq v0, v5, :cond_6

    .line 112
    .line 113
    if-eq v0, v4, :cond_5

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->E:Landroid/graphics/drawable/GradientDrawable;

    .line 117
    .line 118
    invoke-virtual {v0, v4}, Landroid/graphics/drawable/GradientDrawable;->setGradientType(I)V

    .line 119
    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->E:Landroid/graphics/drawable/GradientDrawable;

    .line 123
    .line 124
    invoke-virtual {v0, v5}, Landroid/graphics/drawable/GradientDrawable;->setGradientType(I)V

    .line 125
    .line 126
    .line 127
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->E:Landroid/graphics/drawable/GradientDrawable;

    .line 128
    .line 129
    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->v:I

    .line 130
    .line 131
    int-to-float v1, v1

    .line 132
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setGradientRadius(F)V

    .line 133
    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->E:Landroid/graphics/drawable/GradientDrawable;

    .line 137
    .line 138
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/GradientDrawable;->setGradientType(I)V

    .line 139
    .line 140
    .line 141
    :goto_3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->E:Landroid/graphics/drawable/GradientDrawable;

    .line 142
    .line 143
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->A:Z

    .line 144
    .line 145
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setUseLevel(Z)V

    .line 146
    .line 147
    .line 148
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->t:I

    .line 149
    .line 150
    if-eqz v0, :cond_9

    .line 151
    .line 152
    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->u:I

    .line 153
    .line 154
    if-eqz v1, :cond_9

    .line 155
    .line 156
    iget-object v6, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->E:Landroid/graphics/drawable/GradientDrawable;

    .line 157
    .line 158
    int-to-float v0, v0

    .line 159
    int-to-float v1, v1

    .line 160
    invoke-virtual {v6, v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setGradientCenter(FF)V

    .line 161
    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->E:Landroid/graphics/drawable/GradientDrawable;

    .line 165
    .line 166
    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->d:I

    .line 167
    .line 168
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 169
    .line 170
    .line 171
    :cond_9
    :goto_4
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->C:I

    .line 172
    .line 173
    if-nez v0, :cond_a

    .line 174
    .line 175
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->E:Landroid/graphics/drawable/GradientDrawable;

    .line 176
    .line 177
    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->q:I

    .line 178
    .line 179
    iget v6, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->r:I

    .line 180
    .line 181
    invoke-virtual {v0, v1, v6}, Landroid/graphics/drawable/GradientDrawable;->setSize(II)V

    .line 182
    .line 183
    .line 184
    :cond_a
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->E:Landroid/graphics/drawable/GradientDrawable;

    .line 185
    .line 186
    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->m:I

    .line 187
    .line 188
    iget v6, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->n:I

    .line 189
    .line 190
    iget v7, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->o:F

    .line 191
    .line 192
    iget v8, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->p:F

    .line 193
    .line 194
    invoke-virtual {v0, v1, v6, v7, v8}, Landroid/graphics/drawable/GradientDrawable;->setStroke(IIFF)V

    .line 195
    .line 196
    .line 197
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->C:I

    .line 198
    .line 199
    if-nez v0, :cond_c

    .line 200
    .line 201
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->h:F

    .line 202
    .line 203
    const/4 v1, 0x0

    .line 204
    cmpl-float v1, v0, v1

    .line 205
    .line 206
    if-eqz v1, :cond_b

    .line 207
    .line 208
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->E:Landroid/graphics/drawable/GradientDrawable;

    .line 209
    .line 210
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 211
    .line 212
    .line 213
    goto :goto_5

    .line 214
    :cond_b
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->E:Landroid/graphics/drawable/GradientDrawable;

    .line 215
    .line 216
    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->i:F

    .line 217
    .line 218
    iget v6, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->j:F

    .line 219
    .line 220
    iget v7, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->l:F

    .line 221
    .line 222
    iget v8, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->k:F

    .line 223
    .line 224
    const/16 v9, 0x8

    .line 225
    .line 226
    new-array v9, v9, [F

    .line 227
    .line 228
    aput v1, v9, v2

    .line 229
    .line 230
    aput v1, v9, v5

    .line 231
    .line 232
    aput v6, v9, v4

    .line 233
    .line 234
    aput v6, v9, v3

    .line 235
    .line 236
    const/4 v1, 0x4

    .line 237
    aput v7, v9, v1

    .line 238
    .line 239
    const/4 v1, 0x5

    .line 240
    aput v7, v9, v1

    .line 241
    .line 242
    const/4 v1, 0x6

    .line 243
    aput v8, v9, v1

    .line 244
    .line 245
    const/4 v1, 0x7

    .line 246
    aput v8, v9, v1

    .line 247
    .line 248
    invoke-virtual {v0, v9}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadii([F)V

    .line 249
    .line 250
    .line 251
    :cond_c
    :goto_5
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->setSelectorColor(I)V

    .line 252
    .line 253
    .line 254
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->E:Landroid/graphics/drawable/GradientDrawable;

    .line 255
    .line 256
    return-object p1

    .line 257
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->a:Landroid/content/Context;

    .line 2
    .line 3
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->SuperButton:[I

    .line 4
    .line 5
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    sget p2, Lcom/xuexiang/xui/R$styleable;->SuperButton_sGravity:I

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    iput p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->D:I

    .line 17
    .line 18
    sget p2, Lcom/xuexiang/xui/R$styleable;->SuperButton_sShapeType:I

    .line 19
    .line 20
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    iput p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->C:I

    .line 25
    .line 26
    sget p2, Lcom/xuexiang/xui/R$styleable;->SuperButton_sSolidColor:I

    .line 27
    .line 28
    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->b:I

    .line 29
    .line 30
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    iput p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->d:I

    .line 35
    .line 36
    sget p2, Lcom/xuexiang/xui/R$styleable;->SuperButton_sSelectorPressedColor:I

    .line 37
    .line 38
    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->c:I

    .line 39
    .line 40
    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    iput p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->e:I

    .line 45
    .line 46
    sget p2, Lcom/xuexiang/xui/R$styleable;->SuperButton_sSelectorDisableColor:I

    .line 47
    .line 48
    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    iput p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->f:I

    .line 53
    .line 54
    sget p2, Lcom/xuexiang/xui/R$styleable;->SuperButton_sSelectorNormalColor:I

    .line 55
    .line 56
    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    iput p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->g:I

    .line 61
    .line 62
    sget p2, Lcom/xuexiang/xui/R$styleable;->SuperButton_sCornersRadius:I

    .line 63
    .line 64
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    int-to-float p2, p2

    .line 69
    iput p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->h:F

    .line 70
    .line 71
    sget p2, Lcom/xuexiang/xui/R$styleable;->SuperButton_sCornersTopLeftRadius:I

    .line 72
    .line 73
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    int-to-float p2, p2

    .line 78
    iput p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->i:F

    .line 79
    .line 80
    sget p2, Lcom/xuexiang/xui/R$styleable;->SuperButton_sCornersTopRightRadius:I

    .line 81
    .line 82
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    int-to-float p2, p2

    .line 87
    iput p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->j:F

    .line 88
    .line 89
    sget p2, Lcom/xuexiang/xui/R$styleable;->SuperButton_sCornersBottomLeftRadius:I

    .line 90
    .line 91
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 92
    .line 93
    .line 94
    move-result p2

    .line 95
    int-to-float p2, p2

    .line 96
    iput p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->k:F

    .line 97
    .line 98
    sget p2, Lcom/xuexiang/xui/R$styleable;->SuperButton_sCornersBottomRightRadius:I

    .line 99
    .line 100
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    int-to-float p2, p2

    .line 105
    iput p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->l:F

    .line 106
    .line 107
    sget p2, Lcom/xuexiang/xui/R$styleable;->SuperButton_sStrokeWidth:I

    .line 108
    .line 109
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    iput p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->m:I

    .line 114
    .line 115
    sget p2, Lcom/xuexiang/xui/R$styleable;->SuperButton_sStrokeDashWidth:I

    .line 116
    .line 117
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 118
    .line 119
    .line 120
    move-result p2

    .line 121
    int-to-float p2, p2

    .line 122
    iput p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->o:F

    .line 123
    .line 124
    sget p2, Lcom/xuexiang/xui/R$styleable;->SuperButton_sStrokeDashGap:I

    .line 125
    .line 126
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    int-to-float p2, p2

    .line 131
    iput p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->p:F

    .line 132
    .line 133
    sget p2, Lcom/xuexiang/xui/R$styleable;->SuperButton_sStrokeColor:I

    .line 134
    .line 135
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 136
    .line 137
    .line 138
    move-result p2

    .line 139
    iput p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->n:I

    .line 140
    .line 141
    sget p2, Lcom/xuexiang/xui/R$styleable;->SuperButton_sSizeWidth:I

    .line 142
    .line 143
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 144
    .line 145
    .line 146
    move-result p2

    .line 147
    iput p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->q:I

    .line 148
    .line 149
    sget p2, Lcom/xuexiang/xui/R$styleable;->SuperButton_sSizeHeight:I

    .line 150
    .line 151
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->a:Landroid/content/Context;

    .line 152
    .line 153
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 162
    .line 163
    const/high16 v2, 0x42400000    # 48.0f

    .line 164
    .line 165
    mul-float/2addr v2, v1

    .line 166
    const/high16 v1, 0x3f000000    # 0.5f

    .line 167
    .line 168
    add-float/2addr v2, v1

    .line 169
    float-to-int v1, v2

    .line 170
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 171
    .line 172
    .line 173
    move-result p2

    .line 174
    iput p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->r:I

    .line 175
    .line 176
    sget p2, Lcom/xuexiang/xui/R$styleable;->SuperButton_sGradientOrientation:I

    .line 177
    .line 178
    const/4 v1, -0x1

    .line 179
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 180
    .line 181
    .line 182
    move-result p2

    .line 183
    iput p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->s:I

    .line 184
    .line 185
    sget p2, Lcom/xuexiang/xui/R$styleable;->SuperButton_sGradientAngle:I

    .line 186
    .line 187
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 188
    .line 189
    .line 190
    sget p2, Lcom/xuexiang/xui/R$styleable;->SuperButton_sGradientCenterX:I

    .line 191
    .line 192
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 193
    .line 194
    .line 195
    move-result p2

    .line 196
    iput p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->t:I

    .line 197
    .line 198
    sget p2, Lcom/xuexiang/xui/R$styleable;->SuperButton_sGradientCenterY:I

    .line 199
    .line 200
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 201
    .line 202
    .line 203
    move-result p2

    .line 204
    iput p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->u:I

    .line 205
    .line 206
    sget p2, Lcom/xuexiang/xui/R$styleable;->SuperButton_sGradientGradientRadius:I

    .line 207
    .line 208
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 209
    .line 210
    .line 211
    move-result p2

    .line 212
    iput p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->v:I

    .line 213
    .line 214
    sget p2, Lcom/xuexiang/xui/R$styleable;->SuperButton_sGradientStartColor:I

    .line 215
    .line 216
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 217
    .line 218
    .line 219
    move-result p2

    .line 220
    iput p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->w:I

    .line 221
    .line 222
    sget p2, Lcom/xuexiang/xui/R$styleable;->SuperButton_sGradientCenterColor:I

    .line 223
    .line 224
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 225
    .line 226
    .line 227
    move-result p2

    .line 228
    iput p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->x:I

    .line 229
    .line 230
    sget p2, Lcom/xuexiang/xui/R$styleable;->SuperButton_sGradientEndColor:I

    .line 231
    .line 232
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 233
    .line 234
    .line 235
    move-result p2

    .line 236
    iput p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->y:I

    .line 237
    .line 238
    sget p2, Lcom/xuexiang/xui/R$styleable;->SuperButton_sGradientType:I

    .line 239
    .line 240
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 241
    .line 242
    .line 243
    move-result p2

    .line 244
    iput p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->z:I

    .line 245
    .line 246
    sget p2, Lcom/xuexiang/xui/R$styleable;->SuperButton_sGradientUseLevel:I

    .line 247
    .line 248
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 249
    .line 250
    .line 251
    move-result p2

    .line 252
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->A:Z

    .line 253
    .line 254
    sget p2, Lcom/xuexiang/xui/R$styleable;->SuperButton_sUseSelector:I

    .line 255
    .line 256
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 257
    .line 258
    .line 259
    move-result p2

    .line 260
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->B:Z

    .line 261
    .line 262
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 263
    .line 264
    .line 265
    const/4 p1, 0x1

    .line 266
    invoke-virtual {p0, p1}, Landroid/view/View;->setClickable(Z)V

    .line 267
    .line 268
    .line 269
    iget-boolean p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->B:Z

    .line 270
    .line 271
    if-eqz p2, :cond_0

    .line 272
    .line 273
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->getSelector()Landroid/graphics/drawable/StateListDrawable;

    .line 274
    .line 275
    .line 276
    move-result-object p2

    .line 277
    goto :goto_0

    .line 278
    :cond_0
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->a(I)Landroid/graphics/drawable/GradientDrawable;

    .line 279
    .line 280
    .line 281
    move-result-object p2

    .line 282
    :goto_0
    invoke-virtual {p0, p2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 283
    .line 284
    .line 285
    iget p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->D:I

    .line 286
    .line 287
    if-eqz p2, :cond_5

    .line 288
    .line 289
    if-eq p2, p1, :cond_4

    .line 290
    .line 291
    const/4 p1, 0x2

    .line 292
    if-eq p2, p1, :cond_3

    .line 293
    .line 294
    const/4 p1, 0x3

    .line 295
    if-eq p2, p1, :cond_2

    .line 296
    .line 297
    const/4 p1, 0x4

    .line 298
    if-eq p2, p1, :cond_1

    .line 299
    .line 300
    return-void

    .line 301
    :cond_1
    const/16 p1, 0x51

    .line 302
    .line 303
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 304
    .line 305
    .line 306
    return-void

    .line 307
    :cond_2
    const/16 p1, 0x31

    .line 308
    .line 309
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 310
    .line 311
    .line 312
    return-void

    .line 313
    :cond_3
    const p1, 0x800015

    .line 314
    .line 315
    .line 316
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 317
    .line 318
    .line 319
    return-void

    .line 320
    :cond_4
    const p1, 0x800013

    .line 321
    .line 322
    .line 323
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 324
    .line 325
    .line 326
    return-void

    .line 327
    :cond_5
    const/16 p1, 0x11

    .line 328
    .line 329
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 330
    .line 331
    .line 332
    return-void
.end method

.method public final c()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->s:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->g:I

    .line 8
    .line 9
    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->e:I

    .line 10
    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    :goto_0
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_1
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public getSelector()Landroid/graphics/drawable/StateListDrawable;
    .locals 4

    .line 1
    new-instance v0, Landroid/graphics/drawable/StateListDrawable;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 4
    .line 5
    .line 6
    const v1, 0x10100a7

    .line 7
    .line 8
    .line 9
    const v2, 0x101009e

    .line 10
    .line 11
    .line 12
    filled-new-array {v1, v2}, [I

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->a(I)Landroid/graphics/drawable/GradientDrawable;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v3, v1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 21
    .line 22
    .line 23
    const v1, -0x101009e

    .line 24
    .line 25
    .line 26
    filled-new-array {v1}, [I

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->a(I)Landroid/graphics/drawable/GradientDrawable;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v3, v1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 35
    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    new-array v1, v1, [I

    .line 39
    .line 40
    invoke-virtual {p0, v2}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->a(I)Landroid/graphics/drawable/GradientDrawable;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 45
    .line 46
    .line 47
    return-object v0
.end method

.method public setChangeAlphaWhenDisable(Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->getAlphaViewHelper()Lx1/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lx1/b;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lx1/b;->c(Z)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public setChangeAlphaWhenPress(Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->getAlphaViewHelper()Lx1/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lx1/b;

    .line 12
    .line 13
    iput-boolean p1, v0, Lx1/b;->b:Z

    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public setEnabled(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->c()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->getAlphaViewHelper()Lx1/a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lx1/b;

    .line 15
    .line 16
    invoke-virtual {v0, p0, p1}, Lx1/b;->a(Landroid/view/View;Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public setPressed(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setPressed(Z)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->c()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->getAlphaViewHelper()Lx1/a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lx1/b;

    .line 15
    .line 16
    invoke-virtual {v0, p0, p1}, Lx1/b;->b(Landroid/view/View;Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method
