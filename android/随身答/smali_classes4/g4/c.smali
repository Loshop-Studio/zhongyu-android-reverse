.class public Lg4/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static y:Ljava/text/DateFormat;


# instance fields
.field public a:Landroid/view/View;

.field public b:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

.field public c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

.field public d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

.field public e:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

.field public f:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

.field public g:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

.field public h:I

.field public i:[Z

.field public j:I

.field public k:I

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:I

.field public u:F

.field public v:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

.field public w:Z

.field public x:Lk4/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 2
    .line 3
    const-string v1, "yyyy-MM-dd HH:mm:ss"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lg4/c;->y:Ljava/text/DateFormat;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Landroid/view/View;[ZII)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x76c

    .line 5
    .line 6
    iput v0, p0, Lg4/c;->j:I

    .line 7
    .line 8
    const/16 v0, 0x834

    .line 9
    .line 10
    iput v0, p0, Lg4/c;->k:I

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    iput v0, p0, Lg4/c;->l:I

    .line 14
    .line 15
    const/16 v1, 0xc

    .line 16
    .line 17
    iput v1, p0, Lg4/c;->m:I

    .line 18
    .line 19
    iput v0, p0, Lg4/c;->n:I

    .line 20
    .line 21
    const/16 v0, 0x1f

    .line 22
    .line 23
    iput v0, p0, Lg4/c;->o:I

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    iput-boolean v0, p0, Lg4/c;->w:Z

    .line 27
    .line 28
    iput-object p1, p0, Lg4/c;->a:Landroid/view/View;

    .line 29
    .line 30
    iput-object p2, p0, Lg4/c;->i:[Z

    .line 31
    .line 32
    iput p3, p0, Lg4/c;->h:I

    .line 33
    .line 34
    iput p4, p0, Lg4/c;->q:I

    .line 35
    .line 36
    invoke-virtual {p0, p1}, Lg4/c;->N(Landroid/view/View;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public static synthetic a(Lg4/c;)I
    .locals 0

    .line 1
    iget p0, p0, Lg4/c;->j:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic b(Lg4/c;)Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;
    .locals 0

    .line 1
    iget-object p0, p0, Lg4/c;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic c(Lg4/c;)I
    .locals 0

    .line 1
    iget p0, p0, Lg4/c;->o:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic d(Lg4/c;IIIILjava/util/List;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p6}, Lg4/c;->F(IIIILjava/util/List;Ljava/util/List;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(Lg4/c;)Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;
    .locals 0

    .line 1
    iget-object p0, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic f(Lg4/c;)Lk4/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lg4/c;->x:Lk4/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic g(Lg4/c;)Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;
    .locals 0

    .line 1
    iget-object p0, p0, Lg4/c;->b:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic h(Lg4/c;)I
    .locals 0

    .line 1
    iget p0, p0, Lg4/c;->p:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic i(Lg4/c;I)I
    .locals 0

    .line 1
    iput p1, p0, Lg4/c;->p:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic j(Lg4/c;)I
    .locals 0

    .line 1
    iget p0, p0, Lg4/c;->k:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic k(Lg4/c;)I
    .locals 0

    .line 1
    iget p0, p0, Lg4/c;->l:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic l(Lg4/c;)I
    .locals 0

    .line 1
    iget p0, p0, Lg4/c;->m:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic m(Lg4/c;)I
    .locals 0

    .line 1
    iget p0, p0, Lg4/c;->n:I

    .line 2
    .line 3
    return p0
.end method


# virtual methods
.method public A(F)V
    .locals 0

    .line 1
    iput p1, p0, Lg4/c;->u:F

    .line 2
    .line 3
    invoke-virtual {p0}, Lg4/c;->z()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final B(IIIZIII)V
    .locals 3

    .line 1
    iget-object p7, p0, Lg4/c;->a:Landroid/view/View;

    .line 2
    .line 3
    sget v0, Lcom/xuexiang/xui/R$id;->year:I

    .line 4
    .line 5
    invoke-virtual {p7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p7

    .line 9
    check-cast p7, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 10
    .line 11
    iput-object p7, p0, Lg4/c;->b:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 12
    .line 13
    new-instance v0, Lh4/a;

    .line 14
    .line 15
    iget v1, p0, Lg4/c;->j:I

    .line 16
    .line 17
    iget v2, p0, Lg4/c;->k:I

    .line 18
    .line 19
    invoke-static {v1, v2}, Ll4/a;->e(II)Ljava/util/ArrayList;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-direct {v0, v1}, Lh4/a;-><init>(Ljava/util/List;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p7, v0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Ld4/a;)V

    .line 27
    .line 28
    .line 29
    iget-object p7, p0, Lg4/c;->b:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 30
    .line 31
    const-string v0, ""

    .line 32
    .line 33
    invoke-virtual {p7, v0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLabel(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-object p7, p0, Lg4/c;->b:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 37
    .line 38
    iget v1, p0, Lg4/c;->j:I

    .line 39
    .line 40
    sub-int v1, p1, v1

    .line 41
    .line 42
    invoke-virtual {p7, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 43
    .line 44
    .line 45
    iget-object p7, p0, Lg4/c;->b:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 46
    .line 47
    iget v1, p0, Lg4/c;->h:I

    .line 48
    .line 49
    invoke-virtual {p7, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setGravity(I)V

    .line 50
    .line 51
    .line 52
    iget-object p7, p0, Lg4/c;->a:Landroid/view/View;

    .line 53
    .line 54
    sget v1, Lcom/xuexiang/xui/R$id;->month:I

    .line 55
    .line 56
    invoke-virtual {p7, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object p7

    .line 60
    check-cast p7, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 61
    .line 62
    iput-object p7, p0, Lg4/c;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 63
    .line 64
    new-instance v1, Lh4/a;

    .line 65
    .line 66
    invoke-static {p1}, Ll4/a;->d(I)Ljava/util/ArrayList;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-direct {v1, v2}, Lh4/a;-><init>(Ljava/util/List;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p7, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Ld4/a;)V

    .line 74
    .line 75
    .line 76
    iget-object p7, p0, Lg4/c;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 77
    .line 78
    invoke-virtual {p7, v0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLabel(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-static {p1}, Ll4/a;->g(I)I

    .line 82
    .line 83
    .line 84
    move-result p7

    .line 85
    const/4 v1, 0x1

    .line 86
    if-eqz p7, :cond_1

    .line 87
    .line 88
    sub-int/2addr p7, v1

    .line 89
    if-gt p2, p7, :cond_0

    .line 90
    .line 91
    if-eqz p4, :cond_1

    .line 92
    .line 93
    :cond_0
    iget-object p4, p0, Lg4/c;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 94
    .line 95
    add-int/lit8 p7, p2, 0x1

    .line 96
    .line 97
    invoke-virtual {p4, p7}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_1
    iget-object p4, p0, Lg4/c;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 102
    .line 103
    invoke-virtual {p4, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 104
    .line 105
    .line 106
    :goto_0
    iget-object p4, p0, Lg4/c;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 107
    .line 108
    iget p7, p0, Lg4/c;->h:I

    .line 109
    .line 110
    invoke-virtual {p4, p7}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setGravity(I)V

    .line 111
    .line 112
    .line 113
    iget-object p4, p0, Lg4/c;->a:Landroid/view/View;

    .line 114
    .line 115
    sget p7, Lcom/xuexiang/xui/R$id;->day:I

    .line 116
    .line 117
    invoke-virtual {p4, p7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 118
    .line 119
    .line 120
    move-result-object p4

    .line 121
    check-cast p4, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 122
    .line 123
    iput-object p4, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 124
    .line 125
    invoke-static {p1}, Ll4/a;->g(I)I

    .line 126
    .line 127
    .line 128
    move-result p4

    .line 129
    if-nez p4, :cond_2

    .line 130
    .line 131
    iget-object p4, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 132
    .line 133
    new-instance p7, Lh4/a;

    .line 134
    .line 135
    invoke-static {p1, p2}, Ll4/a;->h(II)I

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    invoke-static {p1}, Ll4/a;->b(I)Ljava/util/ArrayList;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-direct {p7, p1}, Lh4/a;-><init>(Ljava/util/List;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p4, p7}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Ld4/a;)V

    .line 147
    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_2
    iget-object p2, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 151
    .line 152
    new-instance p4, Lh4/a;

    .line 153
    .line 154
    invoke-static {p1}, Ll4/a;->f(I)I

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    invoke-static {p1}, Ll4/a;->b(I)Ljava/util/ArrayList;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-direct {p4, p1}, Lh4/a;-><init>(Ljava/util/List;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p2, p4}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Ld4/a;)V

    .line 166
    .line 167
    .line 168
    :goto_1
    iget-object p1, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 169
    .line 170
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLabel(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    iget-object p1, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 174
    .line 175
    sub-int/2addr p3, v1

    .line 176
    invoke-virtual {p1, p3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 177
    .line 178
    .line 179
    iget-object p1, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 180
    .line 181
    iget p2, p0, Lg4/c;->h:I

    .line 182
    .line 183
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setGravity(I)V

    .line 184
    .line 185
    .line 186
    iget-object p1, p0, Lg4/c;->a:Landroid/view/View;

    .line 187
    .line 188
    sget p2, Lcom/xuexiang/xui/R$id;->hour:I

    .line 189
    .line 190
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    check-cast p1, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 195
    .line 196
    iput-object p1, p0, Lg4/c;->e:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 197
    .line 198
    new-instance p2, Lh4/b;

    .line 199
    .line 200
    const/16 p3, 0x17

    .line 201
    .line 202
    const/4 p4, 0x0

    .line 203
    invoke-direct {p2, p4, p3}, Lh4/b;-><init>(II)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Ld4/a;)V

    .line 207
    .line 208
    .line 209
    iget-object p1, p0, Lg4/c;->e:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 210
    .line 211
    invoke-virtual {p1, p5}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 212
    .line 213
    .line 214
    iget-object p1, p0, Lg4/c;->e:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 215
    .line 216
    iget p2, p0, Lg4/c;->h:I

    .line 217
    .line 218
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setGravity(I)V

    .line 219
    .line 220
    .line 221
    iget-object p1, p0, Lg4/c;->a:Landroid/view/View;

    .line 222
    .line 223
    sget p2, Lcom/xuexiang/xui/R$id;->min:I

    .line 224
    .line 225
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    check-cast p1, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 230
    .line 231
    iput-object p1, p0, Lg4/c;->f:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 232
    .line 233
    new-instance p2, Lh4/b;

    .line 234
    .line 235
    const/16 p3, 0x3b

    .line 236
    .line 237
    invoke-direct {p2, p4, p3}, Lh4/b;-><init>(II)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Ld4/a;)V

    .line 241
    .line 242
    .line 243
    iget-object p1, p0, Lg4/c;->f:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 244
    .line 245
    invoke-virtual {p1, p6}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 246
    .line 247
    .line 248
    iget-object p1, p0, Lg4/c;->f:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 249
    .line 250
    iget p2, p0, Lg4/c;->h:I

    .line 251
    .line 252
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setGravity(I)V

    .line 253
    .line 254
    .line 255
    iget-object p1, p0, Lg4/c;->a:Landroid/view/View;

    .line 256
    .line 257
    sget p2, Lcom/xuexiang/xui/R$id;->second:I

    .line 258
    .line 259
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    check-cast p1, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 264
    .line 265
    iput-object p1, p0, Lg4/c;->g:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 266
    .line 267
    new-instance p2, Lh4/b;

    .line 268
    .line 269
    invoke-direct {p2, p4, p3}, Lh4/b;-><init>(II)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Ld4/a;)V

    .line 273
    .line 274
    .line 275
    iget-object p1, p0, Lg4/c;->g:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 276
    .line 277
    invoke-virtual {p1, p6}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 278
    .line 279
    .line 280
    iget-object p1, p0, Lg4/c;->g:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 281
    .line 282
    iget p2, p0, Lg4/c;->h:I

    .line 283
    .line 284
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setGravity(I)V

    .line 285
    .line 286
    .line 287
    iget-object p1, p0, Lg4/c;->b:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 288
    .line 289
    new-instance p2, Lg4/c$a;

    .line 290
    .line 291
    invoke-direct {p2, p0}, Lg4/c$a;-><init>(Lg4/c;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setOnItemSelectedListener(Le4/b;)V

    .line 295
    .line 296
    .line 297
    iget-object p1, p0, Lg4/c;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 298
    .line 299
    new-instance p2, Lg4/c$b;

    .line 300
    .line 301
    invoke-direct {p2, p0}, Lg4/c$b;-><init>(Lg4/c;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setOnItemSelectedListener(Le4/b;)V

    .line 305
    .line 306
    .line 307
    iget-object p1, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 308
    .line 309
    invoke-virtual {p0, p1}, Lg4/c;->q(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;)V

    .line 310
    .line 311
    .line 312
    iget-object p1, p0, Lg4/c;->e:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 313
    .line 314
    invoke-virtual {p0, p1}, Lg4/c;->q(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;)V

    .line 315
    .line 316
    .line 317
    iget-object p1, p0, Lg4/c;->f:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 318
    .line 319
    invoke-virtual {p0, p1}, Lg4/c;->q(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;)V

    .line 320
    .line 321
    .line 322
    iget-object p1, p0, Lg4/c;->g:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 323
    .line 324
    invoke-virtual {p0, p1}, Lg4/c;->q(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;)V

    .line 325
    .line 326
    .line 327
    iget-object p1, p0, Lg4/c;->i:[Z

    .line 328
    .line 329
    array-length p2, p1

    .line 330
    const/4 p3, 0x6

    .line 331
    if-ne p2, p3, :cond_9

    .line 332
    .line 333
    iget-object p2, p0, Lg4/c;->b:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 334
    .line 335
    aget-boolean p1, p1, p4

    .line 336
    .line 337
    const/16 p3, 0x8

    .line 338
    .line 339
    if-eqz p1, :cond_3

    .line 340
    .line 341
    move p1, p4

    .line 342
    goto :goto_2

    .line 343
    :cond_3
    move p1, p3

    .line 344
    :goto_2
    invoke-virtual {p2, p1}, Landroid/view/View;->setVisibility(I)V

    .line 345
    .line 346
    .line 347
    iget-object p1, p0, Lg4/c;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 348
    .line 349
    iget-object p2, p0, Lg4/c;->i:[Z

    .line 350
    .line 351
    aget-boolean p2, p2, v1

    .line 352
    .line 353
    if-eqz p2, :cond_4

    .line 354
    .line 355
    move p2, p4

    .line 356
    goto :goto_3

    .line 357
    :cond_4
    move p2, p3

    .line 358
    :goto_3
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 359
    .line 360
    .line 361
    iget-object p1, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 362
    .line 363
    iget-object p2, p0, Lg4/c;->i:[Z

    .line 364
    .line 365
    const/4 p5, 0x2

    .line 366
    aget-boolean p2, p2, p5

    .line 367
    .line 368
    if-eqz p2, :cond_5

    .line 369
    .line 370
    move p2, p4

    .line 371
    goto :goto_4

    .line 372
    :cond_5
    move p2, p3

    .line 373
    :goto_4
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 374
    .line 375
    .line 376
    iget-object p1, p0, Lg4/c;->e:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 377
    .line 378
    iget-object p2, p0, Lg4/c;->i:[Z

    .line 379
    .line 380
    const/4 p5, 0x3

    .line 381
    aget-boolean p2, p2, p5

    .line 382
    .line 383
    if-eqz p2, :cond_6

    .line 384
    .line 385
    move p2, p4

    .line 386
    goto :goto_5

    .line 387
    :cond_6
    move p2, p3

    .line 388
    :goto_5
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 389
    .line 390
    .line 391
    iget-object p1, p0, Lg4/c;->f:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 392
    .line 393
    iget-object p2, p0, Lg4/c;->i:[Z

    .line 394
    .line 395
    const/4 p5, 0x4

    .line 396
    aget-boolean p2, p2, p5

    .line 397
    .line 398
    if-eqz p2, :cond_7

    .line 399
    .line 400
    move p2, p4

    .line 401
    goto :goto_6

    .line 402
    :cond_7
    move p2, p3

    .line 403
    :goto_6
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 404
    .line 405
    .line 406
    iget-object p1, p0, Lg4/c;->g:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 407
    .line 408
    iget-object p2, p0, Lg4/c;->i:[Z

    .line 409
    .line 410
    const/4 p5, 0x5

    .line 411
    aget-boolean p2, p2, p5

    .line 412
    .line 413
    if-eqz p2, :cond_8

    .line 414
    .line 415
    goto :goto_7

    .line 416
    :cond_8
    move p4, p3

    .line 417
    :goto_7
    invoke-virtual {p1, p4}, Landroid/view/View;->setVisibility(I)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {p0}, Lg4/c;->r()V

    .line 421
    .line 422
    .line 423
    return-void

    .line 424
    :cond_9
    new-instance p1, Ljava/lang/RuntimeException;

    .line 425
    .line 426
    const-string p2, "type[] length is not 6"

    .line 427
    .line 428
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    throw p1
.end method

.method public C(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lg4/c;->w:Z

    .line 2
    .line 3
    return-void
.end method

.method public D(IIIIII)V
    .locals 9

    .line 1
    iget-boolean v0, p0, Lg4/c;->w:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    add-int/2addr p2, v0

    .line 7
    invoke-static {p1, p2, p3}, Ll4/b;->d(III)[I

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 p2, 0x0

    .line 12
    aget v2, p1, p2

    .line 13
    .line 14
    aget p3, p1, v0

    .line 15
    .line 16
    add-int/lit8 v3, p3, -0x1

    .line 17
    .line 18
    const/4 p3, 0x2

    .line 19
    aget v4, p1, p3

    .line 20
    .line 21
    const/4 p3, 0x3

    .line 22
    aget p1, p1, p3

    .line 23
    .line 24
    if-ne p1, v0, :cond_0

    .line 25
    .line 26
    move v5, v0

    .line 27
    :goto_0
    move-object v1, p0

    .line 28
    move v6, p4

    .line 29
    move v7, p5

    .line 30
    move v8, p6

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    move v5, p2

    .line 33
    goto :goto_0

    .line 34
    :goto_1
    invoke-virtual/range {v1 .. v8}, Lg4/c;->B(IIIZIII)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    invoke-virtual/range {p0 .. p6}, Lg4/c;->G(IIIIII)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public E(Ljava/util/Calendar;Ljava/util/Calendar;)V
    .locals 4

    .line 1
    const/4 v0, 0x5

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x1

    .line 4
    if-nez p1, :cond_2

    .line 5
    .line 6
    if-eqz p2, :cond_2

    .line 7
    .line 8
    invoke-virtual {p2, v2}, Ljava/util/Calendar;->get(I)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-virtual {p2, v1}, Ljava/util/Calendar;->get(I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    add-int/2addr v1, v2

    .line 17
    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    iget v0, p0, Lg4/c;->j:I

    .line 22
    .line 23
    if-le p1, v0, :cond_0

    .line 24
    .line 25
    iput p1, p0, Lg4/c;->k:I

    .line 26
    .line 27
    iput v1, p0, Lg4/c;->m:I

    .line 28
    .line 29
    iput p2, p0, Lg4/c;->o:I

    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    if-ne p1, v0, :cond_6

    .line 33
    .line 34
    iget v0, p0, Lg4/c;->l:I

    .line 35
    .line 36
    if-le v1, v0, :cond_1

    .line 37
    .line 38
    iput p1, p0, Lg4/c;->k:I

    .line 39
    .line 40
    iput v1, p0, Lg4/c;->m:I

    .line 41
    .line 42
    iput p2, p0, Lg4/c;->o:I

    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    if-ne v1, v0, :cond_6

    .line 46
    .line 47
    iget v0, p0, Lg4/c;->n:I

    .line 48
    .line 49
    if-le p2, v0, :cond_6

    .line 50
    .line 51
    iput p1, p0, Lg4/c;->k:I

    .line 52
    .line 53
    iput v1, p0, Lg4/c;->m:I

    .line 54
    .line 55
    iput p2, p0, Lg4/c;->o:I

    .line 56
    .line 57
    return-void

    .line 58
    :cond_2
    if-eqz p1, :cond_5

    .line 59
    .line 60
    if-nez p2, :cond_5

    .line 61
    .line 62
    invoke-virtual {p1, v2}, Ljava/util/Calendar;->get(I)I

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    invoke-virtual {p1, v1}, Ljava/util/Calendar;->get(I)I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    add-int/2addr v1, v2

    .line 71
    invoke-virtual {p1, v0}, Ljava/util/Calendar;->get(I)I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    iget v0, p0, Lg4/c;->k:I

    .line 76
    .line 77
    if-ge p2, v0, :cond_3

    .line 78
    .line 79
    iput v1, p0, Lg4/c;->l:I

    .line 80
    .line 81
    iput p1, p0, Lg4/c;->n:I

    .line 82
    .line 83
    iput p2, p0, Lg4/c;->j:I

    .line 84
    .line 85
    return-void

    .line 86
    :cond_3
    if-ne p2, v0, :cond_6

    .line 87
    .line 88
    iget v0, p0, Lg4/c;->m:I

    .line 89
    .line 90
    if-ge v1, v0, :cond_4

    .line 91
    .line 92
    iput v1, p0, Lg4/c;->l:I

    .line 93
    .line 94
    iput p1, p0, Lg4/c;->n:I

    .line 95
    .line 96
    iput p2, p0, Lg4/c;->j:I

    .line 97
    .line 98
    return-void

    .line 99
    :cond_4
    if-ne v1, v0, :cond_6

    .line 100
    .line 101
    iget v0, p0, Lg4/c;->o:I

    .line 102
    .line 103
    if-ge p1, v0, :cond_6

    .line 104
    .line 105
    iput v1, p0, Lg4/c;->l:I

    .line 106
    .line 107
    iput p1, p0, Lg4/c;->n:I

    .line 108
    .line 109
    iput p2, p0, Lg4/c;->j:I

    .line 110
    .line 111
    return-void

    .line 112
    :cond_5
    if-eqz p1, :cond_6

    .line 113
    .line 114
    if-eqz p2, :cond_6

    .line 115
    .line 116
    invoke-virtual {p1, v2}, Ljava/util/Calendar;->get(I)I

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    iput v3, p0, Lg4/c;->j:I

    .line 121
    .line 122
    invoke-virtual {p2, v2}, Ljava/util/Calendar;->get(I)I

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    iput v3, p0, Lg4/c;->k:I

    .line 127
    .line 128
    invoke-virtual {p1, v1}, Ljava/util/Calendar;->get(I)I

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    add-int/2addr v3, v2

    .line 133
    iput v3, p0, Lg4/c;->l:I

    .line 134
    .line 135
    invoke-virtual {p2, v1}, Ljava/util/Calendar;->get(I)I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    add-int/2addr v1, v2

    .line 140
    iput v1, p0, Lg4/c;->m:I

    .line 141
    .line 142
    invoke-virtual {p1, v0}, Ljava/util/Calendar;->get(I)I

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    iput p1, p0, Lg4/c;->n:I

    .line 147
    .line 148
    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    iput p1, p0, Lg4/c;->o:I

    .line 153
    .line 154
    :cond_6
    return-void
.end method

.method public final F(IIIILjava/util/List;Ljava/util/List;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {p5, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p5

    .line 15
    if-eqz p5, :cond_1

    .line 16
    .line 17
    const/16 p1, 0x1f

    .line 18
    .line 19
    if-le p4, p1, :cond_0

    .line 20
    .line 21
    move p4, p1

    .line 22
    :cond_0
    iget-object p1, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 23
    .line 24
    new-instance p2, Lh4/b;

    .line 25
    .line 26
    invoke-direct {p2, p3, p4}, Lh4/b;-><init>(II)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Ld4/a;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-interface {p6, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    if-eqz p2, :cond_3

    .line 42
    .line 43
    const/16 p1, 0x1e

    .line 44
    .line 45
    if-le p4, p1, :cond_2

    .line 46
    .line 47
    move p4, p1

    .line 48
    :cond_2
    iget-object p1, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 49
    .line 50
    new-instance p2, Lh4/b;

    .line 51
    .line 52
    invoke-direct {p2, p3, p4}, Lh4/b;-><init>(II)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Ld4/a;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    rem-int/lit8 p2, p1, 0x4

    .line 60
    .line 61
    if-nez p2, :cond_4

    .line 62
    .line 63
    rem-int/lit8 p2, p1, 0x64

    .line 64
    .line 65
    if-nez p2, :cond_5

    .line 66
    .line 67
    :cond_4
    rem-int/lit16 p1, p1, 0x190

    .line 68
    .line 69
    if-nez p1, :cond_7

    .line 70
    .line 71
    :cond_5
    const/16 p1, 0x1d

    .line 72
    .line 73
    if-le p4, p1, :cond_6

    .line 74
    .line 75
    move p4, p1

    .line 76
    :cond_6
    iget-object p1, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 77
    .line 78
    new-instance p2, Lh4/b;

    .line 79
    .line 80
    invoke-direct {p2, p3, p4}, Lh4/b;-><init>(II)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Ld4/a;)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_7
    const/16 p1, 0x1c

    .line 88
    .line 89
    if-le p4, p1, :cond_8

    .line 90
    .line 91
    move p4, p1

    .line 92
    :cond_8
    iget-object p1, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 93
    .line 94
    new-instance p2, Lh4/b;

    .line 95
    .line 96
    invoke-direct {p2, p3, p4}, Lh4/b;-><init>(II)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Ld4/a;)V

    .line 100
    .line 101
    .line 102
    :goto_0
    iget-object p1, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 103
    .line 104
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getAdapter()Ld4/a;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-interface {p1}, Ld4/a;->a()I

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    add-int/lit8 p1, p1, -0x1

    .line 113
    .line 114
    if-le v0, p1, :cond_9

    .line 115
    .line 116
    iget-object p1, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 117
    .line 118
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getAdapter()Ld4/a;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-interface {p1}, Ld4/a;->a()I

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    add-int/lit8 p1, p1, -0x1

    .line 127
    .line 128
    iget-object p2, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 129
    .line 130
    invoke-virtual {p2, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 131
    .line 132
    .line 133
    :cond_9
    return-void
.end method

.method public final G(IIIIII)V
    .locals 11

    .line 1
    const-string v5, "10"

    .line 2
    .line 3
    const-string v6, "12"

    .line 4
    .line 5
    const-string v0, "1"

    .line 6
    .line 7
    const-string v1, "3"

    .line 8
    .line 9
    const-string v2, "5"

    .line 10
    .line 11
    const-string v3, "7"

    .line 12
    .line 13
    const-string v4, "8"

    .line 14
    .line 15
    filled-new-array/range {v0 .. v6}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "9"

    .line 20
    .line 21
    const-string v2, "11"

    .line 22
    .line 23
    const-string v3, "4"

    .line 24
    .line 25
    const-string v4, "6"

    .line 26
    .line 27
    filled-new-array {v3, v4, v1, v2}, [Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iput p1, p0, Lg4/c;->p:I

    .line 40
    .line 41
    iget-object v2, p0, Lg4/c;->a:Landroid/view/View;

    .line 42
    .line 43
    sget v3, Lcom/xuexiang/xui/R$id;->year:I

    .line 44
    .line 45
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 50
    .line 51
    iput-object v2, p0, Lg4/c;->b:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 52
    .line 53
    new-instance v3, Lh4/b;

    .line 54
    .line 55
    iget v4, p0, Lg4/c;->j:I

    .line 56
    .line 57
    iget v5, p0, Lg4/c;->k:I

    .line 58
    .line 59
    invoke-direct {v3, v4, v5}, Lh4/b;-><init>(II)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2, v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Ld4/a;)V

    .line 63
    .line 64
    .line 65
    iget-object v2, p0, Lg4/c;->b:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 66
    .line 67
    iget v3, p0, Lg4/c;->j:I

    .line 68
    .line 69
    sub-int v3, p1, v3

    .line 70
    .line 71
    invoke-virtual {v2, v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 72
    .line 73
    .line 74
    iget-object v2, p0, Lg4/c;->b:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 75
    .line 76
    iget v3, p0, Lg4/c;->h:I

    .line 77
    .line 78
    invoke-virtual {v2, v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setGravity(I)V

    .line 79
    .line 80
    .line 81
    iget-object v2, p0, Lg4/c;->a:Landroid/view/View;

    .line 82
    .line 83
    sget v3, Lcom/xuexiang/xui/R$id;->month:I

    .line 84
    .line 85
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    check-cast v2, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 90
    .line 91
    iput-object v2, p0, Lg4/c;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 92
    .line 93
    iget v3, p0, Lg4/c;->j:I

    .line 94
    .line 95
    iget v4, p0, Lg4/c;->k:I

    .line 96
    .line 97
    const/4 v5, 0x1

    .line 98
    if-ne v3, v4, :cond_0

    .line 99
    .line 100
    new-instance v3, Lh4/b;

    .line 101
    .line 102
    iget v4, p0, Lg4/c;->l:I

    .line 103
    .line 104
    iget v6, p0, Lg4/c;->m:I

    .line 105
    .line 106
    invoke-direct {v3, v4, v6}, Lh4/b;-><init>(II)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2, v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Ld4/a;)V

    .line 110
    .line 111
    .line 112
    iget-object v2, p0, Lg4/c;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 113
    .line 114
    add-int/lit8 v3, p2, 0x1

    .line 115
    .line 116
    iget v4, p0, Lg4/c;->l:I

    .line 117
    .line 118
    sub-int/2addr v3, v4

    .line 119
    invoke-virtual {v2, v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_0
    const/16 v6, 0xc

    .line 124
    .line 125
    if-ne p1, v3, :cond_1

    .line 126
    .line 127
    new-instance v3, Lh4/b;

    .line 128
    .line 129
    iget v4, p0, Lg4/c;->l:I

    .line 130
    .line 131
    invoke-direct {v3, v4, v6}, Lh4/b;-><init>(II)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2, v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Ld4/a;)V

    .line 135
    .line 136
    .line 137
    iget-object v2, p0, Lg4/c;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 138
    .line 139
    add-int/lit8 v3, p2, 0x1

    .line 140
    .line 141
    iget v4, p0, Lg4/c;->l:I

    .line 142
    .line 143
    sub-int/2addr v3, v4

    .line 144
    invoke-virtual {v2, v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 145
    .line 146
    .line 147
    goto :goto_0

    .line 148
    :cond_1
    if-ne p1, v4, :cond_2

    .line 149
    .line 150
    new-instance v3, Lh4/b;

    .line 151
    .line 152
    iget v4, p0, Lg4/c;->m:I

    .line 153
    .line 154
    invoke-direct {v3, v5, v4}, Lh4/b;-><init>(II)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Ld4/a;)V

    .line 158
    .line 159
    .line 160
    iget-object v2, p0, Lg4/c;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 161
    .line 162
    invoke-virtual {v2, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 163
    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_2
    new-instance v3, Lh4/b;

    .line 167
    .line 168
    invoke-direct {v3, v5, v6}, Lh4/b;-><init>(II)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2, v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Ld4/a;)V

    .line 172
    .line 173
    .line 174
    iget-object v2, p0, Lg4/c;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 175
    .line 176
    invoke-virtual {v2, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 177
    .line 178
    .line 179
    :goto_0
    iget-object v2, p0, Lg4/c;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 180
    .line 181
    iget v3, p0, Lg4/c;->h:I

    .line 182
    .line 183
    invoke-virtual {v2, v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setGravity(I)V

    .line 184
    .line 185
    .line 186
    iget-object v2, p0, Lg4/c;->a:Landroid/view/View;

    .line 187
    .line 188
    sget v3, Lcom/xuexiang/xui/R$id;->day:I

    .line 189
    .line 190
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    check-cast v2, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 195
    .line 196
    iput-object v2, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 197
    .line 198
    iget v2, p0, Lg4/c;->j:I

    .line 199
    .line 200
    iget v3, p0, Lg4/c;->k:I

    .line 201
    .line 202
    const/16 v4, 0x1c

    .line 203
    .line 204
    const/16 v6, 0x1d

    .line 205
    .line 206
    const/16 v7, 0x1e

    .line 207
    .line 208
    const/16 v8, 0x1f

    .line 209
    .line 210
    if-ne v2, v3, :cond_c

    .line 211
    .line 212
    iget v9, p0, Lg4/c;->l:I

    .line 213
    .line 214
    iget v10, p0, Lg4/c;->m:I

    .line 215
    .line 216
    if-ne v9, v10, :cond_c

    .line 217
    .line 218
    add-int/2addr p2, v5

    .line 219
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v2

    .line 227
    if-eqz v2, :cond_4

    .line 228
    .line 229
    iget p1, p0, Lg4/c;->o:I

    .line 230
    .line 231
    if-le p1, v8, :cond_3

    .line 232
    .line 233
    iput v8, p0, Lg4/c;->o:I

    .line 234
    .line 235
    :cond_3
    iget-object p1, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 236
    .line 237
    new-instance p2, Lh4/b;

    .line 238
    .line 239
    iget v2, p0, Lg4/c;->n:I

    .line 240
    .line 241
    iget v3, p0, Lg4/c;->o:I

    .line 242
    .line 243
    invoke-direct {p2, v2, v3}, Lh4/b;-><init>(II)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Ld4/a;)V

    .line 247
    .line 248
    .line 249
    goto :goto_1

    .line 250
    :cond_4
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object p2

    .line 254
    invoke-interface {v1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result p2

    .line 258
    if-eqz p2, :cond_6

    .line 259
    .line 260
    iget p1, p0, Lg4/c;->o:I

    .line 261
    .line 262
    if-le p1, v7, :cond_5

    .line 263
    .line 264
    iput v7, p0, Lg4/c;->o:I

    .line 265
    .line 266
    :cond_5
    iget-object p1, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 267
    .line 268
    new-instance p2, Lh4/b;

    .line 269
    .line 270
    iget v2, p0, Lg4/c;->n:I

    .line 271
    .line 272
    iget v3, p0, Lg4/c;->o:I

    .line 273
    .line 274
    invoke-direct {p2, v2, v3}, Lh4/b;-><init>(II)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Ld4/a;)V

    .line 278
    .line 279
    .line 280
    goto :goto_1

    .line 281
    :cond_6
    rem-int/lit8 p2, p1, 0x4

    .line 282
    .line 283
    if-nez p2, :cond_7

    .line 284
    .line 285
    rem-int/lit8 p2, p1, 0x64

    .line 286
    .line 287
    if-nez p2, :cond_8

    .line 288
    .line 289
    :cond_7
    rem-int/lit16 p1, p1, 0x190

    .line 290
    .line 291
    if-nez p1, :cond_a

    .line 292
    .line 293
    :cond_8
    iget p1, p0, Lg4/c;->o:I

    .line 294
    .line 295
    if-le p1, v6, :cond_9

    .line 296
    .line 297
    iput v6, p0, Lg4/c;->o:I

    .line 298
    .line 299
    :cond_9
    iget-object p1, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 300
    .line 301
    new-instance p2, Lh4/b;

    .line 302
    .line 303
    iget v2, p0, Lg4/c;->n:I

    .line 304
    .line 305
    iget v3, p0, Lg4/c;->o:I

    .line 306
    .line 307
    invoke-direct {p2, v2, v3}, Lh4/b;-><init>(II)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Ld4/a;)V

    .line 311
    .line 312
    .line 313
    goto :goto_1

    .line 314
    :cond_a
    iget p1, p0, Lg4/c;->o:I

    .line 315
    .line 316
    if-le p1, v4, :cond_b

    .line 317
    .line 318
    iput v4, p0, Lg4/c;->o:I

    .line 319
    .line 320
    :cond_b
    iget-object p1, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 321
    .line 322
    new-instance p2, Lh4/b;

    .line 323
    .line 324
    iget v2, p0, Lg4/c;->n:I

    .line 325
    .line 326
    iget v3, p0, Lg4/c;->o:I

    .line 327
    .line 328
    invoke-direct {p2, v2, v3}, Lh4/b;-><init>(II)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Ld4/a;)V

    .line 332
    .line 333
    .line 334
    :goto_1
    iget-object p1, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 335
    .line 336
    iget p2, p0, Lg4/c;->n:I

    .line 337
    .line 338
    sub-int p2, p3, p2

    .line 339
    .line 340
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 341
    .line 342
    .line 343
    goto/16 :goto_5

    .line 344
    .line 345
    :cond_c
    if-ne p1, v2, :cond_12

    .line 346
    .line 347
    add-int/lit8 v2, p2, 0x1

    .line 348
    .line 349
    iget v9, p0, Lg4/c;->l:I

    .line 350
    .line 351
    if-ne v2, v9, :cond_12

    .line 352
    .line 353
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object p2

    .line 357
    invoke-interface {v0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result p2

    .line 361
    if-eqz p2, :cond_d

    .line 362
    .line 363
    iget-object p1, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 364
    .line 365
    new-instance p2, Lh4/b;

    .line 366
    .line 367
    iget v2, p0, Lg4/c;->n:I

    .line 368
    .line 369
    invoke-direct {p2, v2, v8}, Lh4/b;-><init>(II)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Ld4/a;)V

    .line 373
    .line 374
    .line 375
    goto :goto_2

    .line 376
    :cond_d
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object p2

    .line 380
    invoke-interface {v1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    move-result p2

    .line 384
    if-eqz p2, :cond_e

    .line 385
    .line 386
    iget-object p1, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 387
    .line 388
    new-instance p2, Lh4/b;

    .line 389
    .line 390
    iget v2, p0, Lg4/c;->n:I

    .line 391
    .line 392
    invoke-direct {p2, v2, v7}, Lh4/b;-><init>(II)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Ld4/a;)V

    .line 396
    .line 397
    .line 398
    goto :goto_2

    .line 399
    :cond_e
    rem-int/lit8 p2, p1, 0x4

    .line 400
    .line 401
    if-nez p2, :cond_f

    .line 402
    .line 403
    rem-int/lit8 p2, p1, 0x64

    .line 404
    .line 405
    if-nez p2, :cond_10

    .line 406
    .line 407
    :cond_f
    rem-int/lit16 p1, p1, 0x190

    .line 408
    .line 409
    if-nez p1, :cond_11

    .line 410
    .line 411
    :cond_10
    iget-object p1, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 412
    .line 413
    new-instance p2, Lh4/b;

    .line 414
    .line 415
    iget v2, p0, Lg4/c;->n:I

    .line 416
    .line 417
    invoke-direct {p2, v2, v6}, Lh4/b;-><init>(II)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Ld4/a;)V

    .line 421
    .line 422
    .line 423
    goto :goto_2

    .line 424
    :cond_11
    iget-object p1, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 425
    .line 426
    new-instance p2, Lh4/b;

    .line 427
    .line 428
    iget v2, p0, Lg4/c;->n:I

    .line 429
    .line 430
    invoke-direct {p2, v2, v4}, Lh4/b;-><init>(II)V

    .line 431
    .line 432
    .line 433
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Ld4/a;)V

    .line 434
    .line 435
    .line 436
    :goto_2
    iget-object p1, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 437
    .line 438
    iget p2, p0, Lg4/c;->n:I

    .line 439
    .line 440
    sub-int p2, p3, p2

    .line 441
    .line 442
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 443
    .line 444
    .line 445
    goto/16 :goto_5

    .line 446
    .line 447
    :cond_12
    if-ne p1, v3, :cond_1c

    .line 448
    .line 449
    add-int/lit8 v2, p2, 0x1

    .line 450
    .line 451
    iget v3, p0, Lg4/c;->m:I

    .line 452
    .line 453
    if-ne v2, v3, :cond_1c

    .line 454
    .line 455
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object p2

    .line 459
    invoke-interface {v0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    move-result p2

    .line 463
    if-eqz p2, :cond_14

    .line 464
    .line 465
    iget p1, p0, Lg4/c;->o:I

    .line 466
    .line 467
    if-le p1, v8, :cond_13

    .line 468
    .line 469
    iput v8, p0, Lg4/c;->o:I

    .line 470
    .line 471
    :cond_13
    iget-object p1, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 472
    .line 473
    new-instance p2, Lh4/b;

    .line 474
    .line 475
    iget v2, p0, Lg4/c;->o:I

    .line 476
    .line 477
    invoke-direct {p2, v5, v2}, Lh4/b;-><init>(II)V

    .line 478
    .line 479
    .line 480
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Ld4/a;)V

    .line 481
    .line 482
    .line 483
    goto :goto_3

    .line 484
    :cond_14
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object p2

    .line 488
    invoke-interface {v1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 489
    .line 490
    .line 491
    move-result p2

    .line 492
    if-eqz p2, :cond_16

    .line 493
    .line 494
    iget p1, p0, Lg4/c;->o:I

    .line 495
    .line 496
    if-le p1, v7, :cond_15

    .line 497
    .line 498
    iput v7, p0, Lg4/c;->o:I

    .line 499
    .line 500
    :cond_15
    iget-object p1, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 501
    .line 502
    new-instance p2, Lh4/b;

    .line 503
    .line 504
    iget v2, p0, Lg4/c;->o:I

    .line 505
    .line 506
    invoke-direct {p2, v5, v2}, Lh4/b;-><init>(II)V

    .line 507
    .line 508
    .line 509
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Ld4/a;)V

    .line 510
    .line 511
    .line 512
    goto :goto_3

    .line 513
    :cond_16
    rem-int/lit8 p2, p1, 0x4

    .line 514
    .line 515
    if-nez p2, :cond_17

    .line 516
    .line 517
    rem-int/lit8 p2, p1, 0x64

    .line 518
    .line 519
    if-nez p2, :cond_18

    .line 520
    .line 521
    :cond_17
    rem-int/lit16 p1, p1, 0x190

    .line 522
    .line 523
    if-nez p1, :cond_1a

    .line 524
    .line 525
    :cond_18
    iget p1, p0, Lg4/c;->o:I

    .line 526
    .line 527
    if-le p1, v6, :cond_19

    .line 528
    .line 529
    iput v6, p0, Lg4/c;->o:I

    .line 530
    .line 531
    :cond_19
    iget-object p1, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 532
    .line 533
    new-instance p2, Lh4/b;

    .line 534
    .line 535
    iget v2, p0, Lg4/c;->o:I

    .line 536
    .line 537
    invoke-direct {p2, v5, v2}, Lh4/b;-><init>(II)V

    .line 538
    .line 539
    .line 540
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Ld4/a;)V

    .line 541
    .line 542
    .line 543
    goto :goto_3

    .line 544
    :cond_1a
    iget p1, p0, Lg4/c;->o:I

    .line 545
    .line 546
    if-le p1, v4, :cond_1b

    .line 547
    .line 548
    iput v4, p0, Lg4/c;->o:I

    .line 549
    .line 550
    :cond_1b
    iget-object p1, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 551
    .line 552
    new-instance p2, Lh4/b;

    .line 553
    .line 554
    iget v2, p0, Lg4/c;->o:I

    .line 555
    .line 556
    invoke-direct {p2, v5, v2}, Lh4/b;-><init>(II)V

    .line 557
    .line 558
    .line 559
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Ld4/a;)V

    .line 560
    .line 561
    .line 562
    :goto_3
    iget-object p1, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 563
    .line 564
    add-int/lit8 p2, p3, -0x1

    .line 565
    .line 566
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 567
    .line 568
    .line 569
    goto :goto_5

    .line 570
    :cond_1c
    add-int/2addr p2, v5

    .line 571
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    move-result-object v2

    .line 575
    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 576
    .line 577
    .line 578
    move-result v2

    .line 579
    if-eqz v2, :cond_1d

    .line 580
    .line 581
    iget-object p1, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 582
    .line 583
    new-instance p2, Lh4/b;

    .line 584
    .line 585
    invoke-direct {p2, v5, v8}, Lh4/b;-><init>(II)V

    .line 586
    .line 587
    .line 588
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Ld4/a;)V

    .line 589
    .line 590
    .line 591
    goto :goto_4

    .line 592
    :cond_1d
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object p2

    .line 596
    invoke-interface {v1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 597
    .line 598
    .line 599
    move-result p2

    .line 600
    if-eqz p2, :cond_1e

    .line 601
    .line 602
    iget-object p1, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 603
    .line 604
    new-instance p2, Lh4/b;

    .line 605
    .line 606
    invoke-direct {p2, v5, v7}, Lh4/b;-><init>(II)V

    .line 607
    .line 608
    .line 609
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Ld4/a;)V

    .line 610
    .line 611
    .line 612
    goto :goto_4

    .line 613
    :cond_1e
    rem-int/lit8 p2, p1, 0x4

    .line 614
    .line 615
    if-nez p2, :cond_1f

    .line 616
    .line 617
    rem-int/lit8 p2, p1, 0x64

    .line 618
    .line 619
    if-nez p2, :cond_20

    .line 620
    .line 621
    :cond_1f
    rem-int/lit16 p1, p1, 0x190

    .line 622
    .line 623
    if-nez p1, :cond_21

    .line 624
    .line 625
    :cond_20
    iget-object p1, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 626
    .line 627
    new-instance p2, Lh4/b;

    .line 628
    .line 629
    invoke-direct {p2, v5, v6}, Lh4/b;-><init>(II)V

    .line 630
    .line 631
    .line 632
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Ld4/a;)V

    .line 633
    .line 634
    .line 635
    goto :goto_4

    .line 636
    :cond_21
    iget-object p1, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 637
    .line 638
    new-instance p2, Lh4/b;

    .line 639
    .line 640
    invoke-direct {p2, v5, v4}, Lh4/b;-><init>(II)V

    .line 641
    .line 642
    .line 643
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Ld4/a;)V

    .line 644
    .line 645
    .line 646
    :goto_4
    iget-object p1, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 647
    .line 648
    add-int/lit8 p2, p3, -0x1

    .line 649
    .line 650
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 651
    .line 652
    .line 653
    :goto_5
    iget-object p1, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 654
    .line 655
    iget p2, p0, Lg4/c;->h:I

    .line 656
    .line 657
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setGravity(I)V

    .line 658
    .line 659
    .line 660
    iget-object p1, p0, Lg4/c;->a:Landroid/view/View;

    .line 661
    .line 662
    sget p2, Lcom/xuexiang/xui/R$id;->hour:I

    .line 663
    .line 664
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 665
    .line 666
    .line 667
    move-result-object p1

    .line 668
    check-cast p1, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 669
    .line 670
    iput-object p1, p0, Lg4/c;->e:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 671
    .line 672
    new-instance p2, Lh4/b;

    .line 673
    .line 674
    const/16 v2, 0x17

    .line 675
    .line 676
    const/4 v3, 0x0

    .line 677
    invoke-direct {p2, v3, v2}, Lh4/b;-><init>(II)V

    .line 678
    .line 679
    .line 680
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Ld4/a;)V

    .line 681
    .line 682
    .line 683
    iget-object p1, p0, Lg4/c;->e:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 684
    .line 685
    invoke-virtual {p1, p4}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 686
    .line 687
    .line 688
    iget-object p1, p0, Lg4/c;->e:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 689
    .line 690
    iget p2, p0, Lg4/c;->h:I

    .line 691
    .line 692
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setGravity(I)V

    .line 693
    .line 694
    .line 695
    iget-object p1, p0, Lg4/c;->a:Landroid/view/View;

    .line 696
    .line 697
    sget p2, Lcom/xuexiang/xui/R$id;->min:I

    .line 698
    .line 699
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 700
    .line 701
    .line 702
    move-result-object p1

    .line 703
    check-cast p1, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 704
    .line 705
    iput-object p1, p0, Lg4/c;->f:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 706
    .line 707
    new-instance p2, Lh4/b;

    .line 708
    .line 709
    const/16 v2, 0x3b

    .line 710
    .line 711
    invoke-direct {p2, v3, v2}, Lh4/b;-><init>(II)V

    .line 712
    .line 713
    .line 714
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Ld4/a;)V

    .line 715
    .line 716
    .line 717
    iget-object p1, p0, Lg4/c;->f:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 718
    .line 719
    move/from16 p2, p5

    .line 720
    .line 721
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 722
    .line 723
    .line 724
    iget-object p1, p0, Lg4/c;->f:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 725
    .line 726
    iget p2, p0, Lg4/c;->h:I

    .line 727
    .line 728
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setGravity(I)V

    .line 729
    .line 730
    .line 731
    iget-object p1, p0, Lg4/c;->a:Landroid/view/View;

    .line 732
    .line 733
    sget p2, Lcom/xuexiang/xui/R$id;->second:I

    .line 734
    .line 735
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 736
    .line 737
    .line 738
    move-result-object p1

    .line 739
    check-cast p1, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 740
    .line 741
    iput-object p1, p0, Lg4/c;->g:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 742
    .line 743
    new-instance p2, Lh4/b;

    .line 744
    .line 745
    invoke-direct {p2, v3, v2}, Lh4/b;-><init>(II)V

    .line 746
    .line 747
    .line 748
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Ld4/a;)V

    .line 749
    .line 750
    .line 751
    iget-object p1, p0, Lg4/c;->g:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 752
    .line 753
    move/from16 p2, p6

    .line 754
    .line 755
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 756
    .line 757
    .line 758
    iget-object p1, p0, Lg4/c;->g:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 759
    .line 760
    iget p2, p0, Lg4/c;->h:I

    .line 761
    .line 762
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setGravity(I)V

    .line 763
    .line 764
    .line 765
    iget-object p1, p0, Lg4/c;->b:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 766
    .line 767
    new-instance p2, Lg4/c$c;

    .line 768
    .line 769
    invoke-direct {p2, p0, v0, v1}, Lg4/c$c;-><init>(Lg4/c;Ljava/util/List;Ljava/util/List;)V

    .line 770
    .line 771
    .line 772
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setOnItemSelectedListener(Le4/b;)V

    .line 773
    .line 774
    .line 775
    iget-object p1, p0, Lg4/c;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 776
    .line 777
    new-instance p2, Lg4/c$d;

    .line 778
    .line 779
    invoke-direct {p2, p0, v0, v1}, Lg4/c$d;-><init>(Lg4/c;Ljava/util/List;Ljava/util/List;)V

    .line 780
    .line 781
    .line 782
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setOnItemSelectedListener(Le4/b;)V

    .line 783
    .line 784
    .line 785
    iget-object p1, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 786
    .line 787
    invoke-virtual {p0, p1}, Lg4/c;->q(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;)V

    .line 788
    .line 789
    .line 790
    iget-object p1, p0, Lg4/c;->e:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 791
    .line 792
    invoke-virtual {p0, p1}, Lg4/c;->q(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;)V

    .line 793
    .line 794
    .line 795
    iget-object p1, p0, Lg4/c;->f:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 796
    .line 797
    invoke-virtual {p0, p1}, Lg4/c;->q(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;)V

    .line 798
    .line 799
    .line 800
    iget-object p1, p0, Lg4/c;->g:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 801
    .line 802
    invoke-virtual {p0, p1}, Lg4/c;->q(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;)V

    .line 803
    .line 804
    .line 805
    iget-object p1, p0, Lg4/c;->i:[Z

    .line 806
    .line 807
    array-length p2, p1

    .line 808
    const/4 v0, 0x6

    .line 809
    if-ne p2, v0, :cond_28

    .line 810
    .line 811
    iget-object p2, p0, Lg4/c;->b:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 812
    .line 813
    aget-boolean p1, p1, v3

    .line 814
    .line 815
    const/16 v0, 0x8

    .line 816
    .line 817
    if-eqz p1, :cond_22

    .line 818
    .line 819
    move p1, v3

    .line 820
    goto :goto_6

    .line 821
    :cond_22
    move p1, v0

    .line 822
    :goto_6
    invoke-virtual {p2, p1}, Landroid/view/View;->setVisibility(I)V

    .line 823
    .line 824
    .line 825
    iget-object p1, p0, Lg4/c;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 826
    .line 827
    iget-object p2, p0, Lg4/c;->i:[Z

    .line 828
    .line 829
    aget-boolean p2, p2, v5

    .line 830
    .line 831
    if-eqz p2, :cond_23

    .line 832
    .line 833
    move p2, v3

    .line 834
    goto :goto_7

    .line 835
    :cond_23
    move p2, v0

    .line 836
    :goto_7
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 837
    .line 838
    .line 839
    iget-object p1, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 840
    .line 841
    iget-object p2, p0, Lg4/c;->i:[Z

    .line 842
    .line 843
    const/4 v1, 0x2

    .line 844
    aget-boolean p2, p2, v1

    .line 845
    .line 846
    if-eqz p2, :cond_24

    .line 847
    .line 848
    move p2, v3

    .line 849
    goto :goto_8

    .line 850
    :cond_24
    move p2, v0

    .line 851
    :goto_8
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 852
    .line 853
    .line 854
    iget-object p1, p0, Lg4/c;->e:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 855
    .line 856
    iget-object p2, p0, Lg4/c;->i:[Z

    .line 857
    .line 858
    const/4 v1, 0x3

    .line 859
    aget-boolean p2, p2, v1

    .line 860
    .line 861
    if-eqz p2, :cond_25

    .line 862
    .line 863
    move p2, v3

    .line 864
    goto :goto_9

    .line 865
    :cond_25
    move p2, v0

    .line 866
    :goto_9
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 867
    .line 868
    .line 869
    iget-object p1, p0, Lg4/c;->f:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 870
    .line 871
    iget-object p2, p0, Lg4/c;->i:[Z

    .line 872
    .line 873
    const/4 v1, 0x4

    .line 874
    aget-boolean p2, p2, v1

    .line 875
    .line 876
    if-eqz p2, :cond_26

    .line 877
    .line 878
    move p2, v3

    .line 879
    goto :goto_a

    .line 880
    :cond_26
    move p2, v0

    .line 881
    :goto_a
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 882
    .line 883
    .line 884
    iget-object p1, p0, Lg4/c;->g:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 885
    .line 886
    iget-object p2, p0, Lg4/c;->i:[Z

    .line 887
    .line 888
    const/4 v1, 0x5

    .line 889
    aget-boolean p2, p2, v1

    .line 890
    .line 891
    if-eqz p2, :cond_27

    .line 892
    .line 893
    goto :goto_b

    .line 894
    :cond_27
    move v3, v0

    .line 895
    :goto_b
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 896
    .line 897
    .line 898
    invoke-virtual {p0}, Lg4/c;->r()V

    .line 899
    .line 900
    .line 901
    return-void

    .line 902
    :cond_28
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 903
    .line 904
    const-string p2, "type[] length is not 6"

    .line 905
    .line 906
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 907
    .line 908
    .line 909
    throw p1
.end method

.method public H(I)V
    .locals 0

    .line 1
    iput p1, p0, Lg4/c;->j:I

    .line 2
    .line 3
    return-void
.end method

.method public final I()V
    .locals 2

    .line 1
    iget-object v0, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 2
    .line 3
    iget v1, p0, Lg4/c;->s:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextColorCenter(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lg4/c;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 9
    .line 10
    iget v1, p0, Lg4/c;->s:I

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextColorCenter(I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lg4/c;->b:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 16
    .line 17
    iget v1, p0, Lg4/c;->s:I

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextColorCenter(I)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lg4/c;->e:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 23
    .line 24
    iget v1, p0, Lg4/c;->s:I

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextColorCenter(I)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lg4/c;->f:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 30
    .line 31
    iget v1, p0, Lg4/c;->s:I

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextColorCenter(I)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lg4/c;->g:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 37
    .line 38
    iget v1, p0, Lg4/c;->s:I

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextColorCenter(I)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public J(I)V
    .locals 0

    .line 1
    iput p1, p0, Lg4/c;->s:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lg4/c;->I()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final K()V
    .locals 2

    .line 1
    iget-object v0, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 2
    .line 3
    iget v1, p0, Lg4/c;->r:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextColorOut(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lg4/c;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 9
    .line 10
    iget v1, p0, Lg4/c;->r:I

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextColorOut(I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lg4/c;->b:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 16
    .line 17
    iget v1, p0, Lg4/c;->r:I

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextColorOut(I)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lg4/c;->e:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 23
    .line 24
    iget v1, p0, Lg4/c;->r:I

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextColorOut(I)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lg4/c;->f:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 30
    .line 31
    iget v1, p0, Lg4/c;->r:I

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextColorOut(I)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lg4/c;->g:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 37
    .line 38
    iget v1, p0, Lg4/c;->r:I

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextColorOut(I)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public L(I)V
    .locals 0

    .line 1
    iput p1, p0, Lg4/c;->r:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lg4/c;->K()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public M(IIIIII)V
    .locals 1

    .line 1
    iget-object v0, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextXOffset(I)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lg4/c;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextXOffset(I)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lg4/c;->b:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 12
    .line 13
    invoke-virtual {p1, p3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextXOffset(I)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lg4/c;->e:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 17
    .line 18
    invoke-virtual {p1, p4}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextXOffset(I)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lg4/c;->f:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 22
    .line 23
    invoke-virtual {p1, p5}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextXOffset(I)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lg4/c;->g:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 27
    .line 28
    invoke-virtual {p1, p6}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextXOffset(I)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public N(Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lg4/c;->a:Landroid/view/View;

    .line 2
    .line 3
    return-void
.end method

.method public final n()Ljava/lang/String;
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lg4/c;->b:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    iget v2, p0, Lg4/c;->j:I

    .line 13
    .line 14
    add-int/2addr v1, v2

    .line 15
    invoke-static {v1}, Ll4/a;->g(I)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x1

    .line 20
    const/4 v4, 0x0

    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    iget-object v2, p0, Lg4/c;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 24
    .line 25
    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    :goto_0
    add-int/2addr v2, v3

    .line 30
    :goto_1
    move v5, v4

    .line 31
    goto :goto_2

    .line 32
    :cond_0
    iget-object v2, p0, Lg4/c;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 33
    .line 34
    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    add-int/2addr v2, v3

    .line 39
    invoke-static {v1}, Ll4/a;->g(I)I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    sub-int/2addr v2, v5

    .line 44
    if-gtz v2, :cond_1

    .line 45
    .line 46
    iget-object v2, p0, Lg4/c;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 47
    .line 48
    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    goto :goto_0

    .line 53
    :cond_1
    iget-object v2, p0, Lg4/c;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 54
    .line 55
    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    add-int/2addr v2, v3

    .line 60
    invoke-static {v1}, Ll4/a;->g(I)I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    sub-int/2addr v2, v5

    .line 65
    if-ne v2, v3, :cond_2

    .line 66
    .line 67
    iget-object v2, p0, Lg4/c;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 68
    .line 69
    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    move v5, v3

    .line 74
    goto :goto_2

    .line 75
    :cond_2
    iget-object v2, p0, Lg4/c;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 76
    .line 77
    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    goto :goto_1

    .line 82
    :goto_2
    iget-object v6, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 83
    .line 84
    invoke-virtual {v6}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    add-int/2addr v6, v3

    .line 89
    invoke-static {v1, v2, v6, v5}, Ll4/b;->b(IIIZ)[I

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    aget v2, v1, v4

    .line 94
    .line 95
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string v2, "-"

    .line 99
    .line 100
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    aget v3, v1, v3

    .line 104
    .line 105
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const/4 v2, 0x2

    .line 112
    aget v1, v1, v2

    .line 113
    .line 114
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const-string v1, " "

    .line 118
    .line 119
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    iget-object v1, p0, Lg4/c;->e:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 123
    .line 124
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    const-string v1, ":"

    .line 132
    .line 133
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    iget-object v2, p0, Lg4/c;->f:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 137
    .line 138
    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    iget-object v1, p0, Lg4/c;->g:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 149
    .line 150
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    return-object v0
.end method

.method public o()Ljava/lang/String;
    .locals 6

    .line 1
    iget-boolean v0, p0, Lg4/c;->w:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lg4/c;->n()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    iget v1, p0, Lg4/c;->p:I

    .line 16
    .line 17
    iget v2, p0, Lg4/c;->j:I

    .line 18
    .line 19
    const-string v3, " "

    .line 20
    .line 21
    const-string v4, ":"

    .line 22
    .line 23
    const-string v5, "-"

    .line 24
    .line 25
    if-ne v1, v2, :cond_2

    .line 26
    .line 27
    iget-object v1, p0, Lg4/c;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 28
    .line 29
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    iget v2, p0, Lg4/c;->l:I

    .line 34
    .line 35
    add-int/2addr v1, v2

    .line 36
    if-ne v1, v2, :cond_1

    .line 37
    .line 38
    iget-object v1, p0, Lg4/c;->b:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 39
    .line 40
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    iget v2, p0, Lg4/c;->j:I

    .line 45
    .line 46
    add-int/2addr v1, v2

    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    iget-object v1, p0, Lg4/c;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 54
    .line 55
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    iget v2, p0, Lg4/c;->l:I

    .line 60
    .line 61
    add-int/2addr v1, v2

    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 69
    .line 70
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    iget v2, p0, Lg4/c;->n:I

    .line 75
    .line 76
    add-int/2addr v1, v2

    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    iget-object v1, p0, Lg4/c;->e:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 84
    .line 85
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    iget-object v1, p0, Lg4/c;->f:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 96
    .line 97
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    iget-object v1, p0, Lg4/c;->g:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 108
    .line 109
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    goto/16 :goto_0

    .line 117
    .line 118
    :cond_1
    iget-object v1, p0, Lg4/c;->b:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 119
    .line 120
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    iget v2, p0, Lg4/c;->j:I

    .line 125
    .line 126
    add-int/2addr v1, v2

    .line 127
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    iget-object v1, p0, Lg4/c;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 134
    .line 135
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    iget v2, p0, Lg4/c;->l:I

    .line 140
    .line 141
    add-int/2addr v1, v2

    .line 142
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    iget-object v1, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 149
    .line 150
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    add-int/lit8 v1, v1, 0x1

    .line 155
    .line 156
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    iget-object v1, p0, Lg4/c;->e:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 163
    .line 164
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    iget-object v1, p0, Lg4/c;->f:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 175
    .line 176
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    iget-object v1, p0, Lg4/c;->g:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 187
    .line 188
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    goto :goto_0

    .line 196
    :cond_2
    iget-object v1, p0, Lg4/c;->b:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 197
    .line 198
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    iget v2, p0, Lg4/c;->j:I

    .line 203
    .line 204
    add-int/2addr v1, v2

    .line 205
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    iget-object v1, p0, Lg4/c;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 212
    .line 213
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    add-int/lit8 v1, v1, 0x1

    .line 218
    .line 219
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    iget-object v1, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 226
    .line 227
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    .line 228
    .line 229
    .line 230
    move-result v1

    .line 231
    add-int/lit8 v1, v1, 0x1

    .line 232
    .line 233
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    iget-object v1, p0, Lg4/c;->e:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 240
    .line 241
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    .line 242
    .line 243
    .line 244
    move-result v1

    .line 245
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    iget-object v1, p0, Lg4/c;->f:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 252
    .line 253
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    .line 254
    .line 255
    .line 256
    move-result v1

    .line 257
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    iget-object v1, p0, Lg4/c;->g:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 264
    .line 265
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    .line 266
    .line 267
    .line 268
    move-result v1

    .line 269
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    return-object v0
.end method

.method public p(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->h(Z)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg4/c;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->h(Z)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lg4/c;->b:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->h(Z)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lg4/c;->e:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->h(Z)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lg4/c;->f:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->h(Z)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lg4/c;->g:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->h(Z)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final q(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lg4/c;->x:Lk4/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lg4/c$e;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lg4/c$e;-><init>(Lg4/c;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setOnItemSelectedListener(Le4/b;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final r()V
    .locals 2

    .line 1
    iget-object v0, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 2
    .line 3
    iget v1, p0, Lg4/c;->q:I

    .line 4
    .line 5
    int-to-float v1, v1

    .line 6
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextSize(F)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lg4/c;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 10
    .line 11
    iget v1, p0, Lg4/c;->q:I

    .line 12
    .line 13
    int-to-float v1, v1

    .line 14
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextSize(F)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lg4/c;->b:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 18
    .line 19
    iget v1, p0, Lg4/c;->q:I

    .line 20
    .line 21
    int-to-float v1, v1

    .line 22
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextSize(F)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lg4/c;->e:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 26
    .line 27
    iget v1, p0, Lg4/c;->q:I

    .line 28
    .line 29
    int-to-float v1, v1

    .line 30
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextSize(F)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lg4/c;->f:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 34
    .line 35
    iget v1, p0, Lg4/c;->q:I

    .line 36
    .line 37
    int-to-float v1, v1

    .line 38
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextSize(F)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lg4/c;->g:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 42
    .line 43
    iget v1, p0, Lg4/c;->q:I

    .line 44
    .line 45
    int-to-float v1, v1

    .line 46
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextSize(F)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public s(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lg4/c;->b:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCyclic(Z)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg4/c;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCyclic(Z)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCyclic(Z)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lg4/c;->e:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCyclic(Z)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lg4/c;->f:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCyclic(Z)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lg4/c;->g:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCyclic(Z)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final t()V
    .locals 2

    .line 1
    iget-object v0, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 2
    .line 3
    iget v1, p0, Lg4/c;->t:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setDividerColor(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lg4/c;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 9
    .line 10
    iget v1, p0, Lg4/c;->t:I

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setDividerColor(I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lg4/c;->b:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 16
    .line 17
    iget v1, p0, Lg4/c;->t:I

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setDividerColor(I)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lg4/c;->e:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 23
    .line 24
    iget v1, p0, Lg4/c;->t:I

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setDividerColor(I)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lg4/c;->f:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 30
    .line 31
    iget v1, p0, Lg4/c;->t:I

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setDividerColor(I)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lg4/c;->g:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 37
    .line 38
    iget v1, p0, Lg4/c;->t:I

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setDividerColor(I)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public u(I)V
    .locals 0

    .line 1
    iput p1, p0, Lg4/c;->t:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lg4/c;->t()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final v()V
    .locals 2

    .line 1
    iget-object v0, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 2
    .line 3
    iget-object v1, p0, Lg4/c;->v:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setDividerType(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lg4/c;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 9
    .line 10
    iget-object v1, p0, Lg4/c;->v:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setDividerType(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lg4/c;->b:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 16
    .line 17
    iget-object v1, p0, Lg4/c;->v:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setDividerType(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lg4/c;->e:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 23
    .line 24
    iget-object v1, p0, Lg4/c;->v:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setDividerType(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lg4/c;->f:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 30
    .line 31
    iget-object v1, p0, Lg4/c;->v:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setDividerType(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lg4/c;->g:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 37
    .line 38
    iget-object v1, p0, Lg4/c;->v:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setDividerType(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public w(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lg4/c;->v:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

    .line 2
    .line 3
    invoke-virtual {p0}, Lg4/c;->v()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public x(I)V
    .locals 0

    .line 1
    iput p1, p0, Lg4/c;->k:I

    .line 2
    .line 3
    return-void
.end method

.method public y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lg4/c;->w:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    if-eqz p1, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, Lg4/c;->b:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLabel(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    iget-object p1, p0, Lg4/c;->b:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 15
    .line 16
    iget-object v0, p0, Lg4/c;->a:Landroid/view/View;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sget v1, Lcom/xuexiang/xui/R$string;->xui_picker_view_year:I

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLabel(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    if-eqz p2, :cond_2

    .line 32
    .line 33
    iget-object p1, p0, Lg4/c;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLabel(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    iget-object p1, p0, Lg4/c;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 40
    .line 41
    iget-object p2, p0, Lg4/c;->a:Landroid/view/View;

    .line 42
    .line 43
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    sget v0, Lcom/xuexiang/xui/R$string;->xui_picker_view_month:I

    .line 48
    .line 49
    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLabel(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :goto_1
    if-eqz p3, :cond_3

    .line 57
    .line 58
    iget-object p1, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 59
    .line 60
    invoke-virtual {p1, p3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLabel(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_3
    iget-object p1, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 65
    .line 66
    iget-object p2, p0, Lg4/c;->a:Landroid/view/View;

    .line 67
    .line 68
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    sget p3, Lcom/xuexiang/xui/R$string;->xui_picker_view_day:I

    .line 73
    .line 74
    invoke-virtual {p2, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLabel(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :goto_2
    if-eqz p4, :cond_4

    .line 82
    .line 83
    iget-object p1, p0, Lg4/c;->e:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 84
    .line 85
    invoke-virtual {p1, p4}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLabel(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_4
    iget-object p1, p0, Lg4/c;->e:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 90
    .line 91
    iget-object p2, p0, Lg4/c;->a:Landroid/view/View;

    .line 92
    .line 93
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    sget p3, Lcom/xuexiang/xui/R$string;->xui_picker_view_hours:I

    .line 98
    .line 99
    invoke-virtual {p2, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLabel(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    :goto_3
    if-eqz p5, :cond_5

    .line 107
    .line 108
    iget-object p1, p0, Lg4/c;->f:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 109
    .line 110
    invoke-virtual {p1, p5}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLabel(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_5
    iget-object p1, p0, Lg4/c;->f:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 115
    .line 116
    iget-object p2, p0, Lg4/c;->a:Landroid/view/View;

    .line 117
    .line 118
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    sget p3, Lcom/xuexiang/xui/R$string;->xui_picker_view_minutes:I

    .line 123
    .line 124
    invoke-virtual {p2, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLabel(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    :goto_4
    if-eqz p6, :cond_6

    .line 132
    .line 133
    iget-object p1, p0, Lg4/c;->g:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 134
    .line 135
    invoke-virtual {p1, p6}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLabel(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :cond_6
    iget-object p1, p0, Lg4/c;->g:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 140
    .line 141
    iget-object p2, p0, Lg4/c;->a:Landroid/view/View;

    .line 142
    .line 143
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    sget p3, Lcom/xuexiang/xui/R$string;->xui_picker_view_seconds:I

    .line 148
    .line 149
    invoke-virtual {p2, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p2

    .line 153
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLabel(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    return-void
.end method

.method public final z()V
    .locals 2

    .line 1
    iget-object v0, p0, Lg4/c;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 2
    .line 3
    iget v1, p0, Lg4/c;->u:F

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLineSpacingMultiplier(F)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lg4/c;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 9
    .line 10
    iget v1, p0, Lg4/c;->u:F

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLineSpacingMultiplier(F)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lg4/c;->b:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 16
    .line 17
    iget v1, p0, Lg4/c;->u:F

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLineSpacingMultiplier(F)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lg4/c;->e:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 23
    .line 24
    iget v1, p0, Lg4/c;->u:F

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLineSpacingMultiplier(F)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lg4/c;->f:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 30
    .line 31
    iget v1, p0, Lg4/c;->u:F

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLineSpacingMultiplier(F)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lg4/c;->g:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 37
    .line 38
    iget v1, p0, Lg4/c;->u:F

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLineSpacingMultiplier(F)V

    .line 41
    .line 42
    .line 43
    return-void
.end method
