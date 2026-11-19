.class public final synthetic Le7/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Le7/t;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Le7/t;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    check-cast p2, Lcom/zykj/mistake/feature/notebook/detail/o3;

    .line 13
    .line 14
    const-string v0, "<unused var>"

    .line 15
    .line 16
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    add-int/lit8 p1, p1, 0x1

    .line 20
    .line 21
    const-string p2, "\u5178\u9519"

    .line 22
    .line 23
    invoke-static {p1, p2}, Landroid/support/v4/media/f;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    check-cast p2, Lcom/zykj/mistake/feature/notebook/detail/o3;

    .line 34
    .line 35
    const-string p1, "answer"

    .line 36
    .line 37
    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p2, Lcom/zykj/mistake/feature/notebook/detail/o3;->a:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {p1}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    if-eqz p2, :cond_0

    .line 47
    .line 48
    const-string p1, "\u4f18\u79c0\u89e3\u7b54"

    .line 49
    .line 50
    :cond_0
    return-object p1

    .line 51
    :pswitch_1
    check-cast p1, Ljava/lang/Integer;

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    check-cast p2, Lh6/f;

    .line 58
    .line 59
    add-int/lit8 p1, p1, 0x1

    .line 60
    .line 61
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    return-object p1

    .line 66
    :pswitch_2
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    return-object p1

    .line 75
    :pswitch_3
    check-cast p1, Lh6/h;

    .line 76
    .line 77
    check-cast p2, Lh6/f;

    .line 78
    .line 79
    invoke-interface {p1, p2}, Lh6/h;->plus(Lh6/h;)Lh6/h;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    return-object p1

    .line 84
    :pswitch_4
    check-cast p1, Lh6/h;

    .line 85
    .line 86
    check-cast p2, Lh6/f;

    .line 87
    .line 88
    invoke-interface {p1, p2}, Lh6/h;->plus(Lh6/h;)Lh6/h;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    return-object p1

    .line 93
    :pswitch_5
    check-cast p1, Ljava/lang/Boolean;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 96
    .line 97
    .line 98
    check-cast p2, Lh6/f;

    .line 99
    .line 100
    return-object p1

    .line 101
    :pswitch_6
    check-cast p1, Ly6/c;

    .line 102
    .line 103
    check-cast p2, Ljava/util/List;

    .line 104
    .line 105
    const-string v0, "clazz"

    .line 106
    .line 107
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    const-string v0, "types"

    .line 111
    .line 112
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    sget-object v0, Lo7/g;->a:Lo7/d;

    .line 116
    .line 117
    const/4 v1, 0x1

    .line 118
    invoke-static {v0, p2, v1}, Ly1/a;->t(Lo7/e;Ljava/util/List;Z)Ljava/util/ArrayList;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    new-instance v1, Li7/f;

    .line 126
    .line 127
    const/4 v2, 0x1

    .line 128
    invoke-direct {v1, p2, v2}, Li7/f;-><init>(Ljava/util/List;I)V

    .line 129
    .line 130
    .line 131
    invoke-static {p1, v0, v1}, Ly1/a;->q(Ly6/c;Ljava/util/ArrayList;Lr6/a;)Li7/b;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    if-eqz p1, :cond_1

    .line 136
    .line 137
    invoke-static {p1}, Lkotlin/collections/u;->v(Li7/b;)Li7/b;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    goto :goto_0

    .line 142
    :cond_1
    const/4 p1, 0x0

    .line 143
    :goto_0
    return-object p1

    .line 144
    :pswitch_7
    check-cast p1, Ly6/c;

    .line 145
    .line 146
    check-cast p2, Ljava/util/List;

    .line 147
    .line 148
    const-string v0, "clazz"

    .line 149
    .line 150
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    const-string v0, "types"

    .line 154
    .line 155
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    sget-object v0, Lo7/g;->a:Lo7/d;

    .line 159
    .line 160
    const/4 v1, 0x1

    .line 161
    invoke-static {v0, p2, v1}, Ly1/a;->t(Lo7/e;Ljava/util/List;Z)Ljava/util/ArrayList;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    new-instance v1, Li7/f;

    .line 169
    .line 170
    const/4 v2, 0x0

    .line 171
    invoke-direct {v1, p2, v2}, Li7/f;-><init>(Ljava/util/List;I)V

    .line 172
    .line 173
    .line 174
    invoke-static {p1, v0, v1}, Ly1/a;->q(Ly6/c;Ljava/util/ArrayList;Lr6/a;)Li7/b;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    return-object p1

    .line 179
    :pswitch_8
    check-cast p1, Lh6/h;

    .line 180
    .line 181
    check-cast p2, Lh6/f;

    .line 182
    .line 183
    const-string v0, "acc"

    .line 184
    .line 185
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    const-string v0, "element"

    .line 189
    .line 190
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    invoke-interface {p2}, Lh6/f;->getKey()Lh6/g;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-interface {p1, v0}, Lh6/h;->minusKey(Lh6/g;)Lh6/h;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    sget-object v0, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 202
    .line 203
    if-ne p1, v0, :cond_2

    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_2
    sget-object v1, Lh6/d;->a:Lh6/d;

    .line 207
    .line 208
    invoke-interface {p1, v1}, Lh6/h;->get(Lh6/g;)Lh6/f;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    check-cast v2, Lh6/e;

    .line 213
    .line 214
    if-nez v2, :cond_3

    .line 215
    .line 216
    new-instance v0, Lkotlin/coroutines/CombinedContext;

    .line 217
    .line 218
    invoke-direct {v0, p1, p2}, Lkotlin/coroutines/CombinedContext;-><init>(Lh6/h;Lh6/f;)V

    .line 219
    .line 220
    .line 221
    :goto_1
    move-object p2, v0

    .line 222
    goto :goto_2

    .line 223
    :cond_3
    invoke-interface {p1, v1}, Lh6/h;->minusKey(Lh6/g;)Lh6/h;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    if-ne p1, v0, :cond_4

    .line 228
    .line 229
    new-instance p1, Lkotlin/coroutines/CombinedContext;

    .line 230
    .line 231
    invoke-direct {p1, p2, v2}, Lkotlin/coroutines/CombinedContext;-><init>(Lh6/h;Lh6/f;)V

    .line 232
    .line 233
    .line 234
    move-object p2, p1

    .line 235
    goto :goto_2

    .line 236
    :cond_4
    new-instance v0, Lkotlin/coroutines/CombinedContext;

    .line 237
    .line 238
    new-instance v1, Lkotlin/coroutines/CombinedContext;

    .line 239
    .line 240
    invoke-direct {v1, p1, p2}, Lkotlin/coroutines/CombinedContext;-><init>(Lh6/h;Lh6/f;)V

    .line 241
    .line 242
    .line 243
    invoke-direct {v0, v1, v2}, Lkotlin/coroutines/CombinedContext;-><init>(Lh6/h;Lh6/f;)V

    .line 244
    .line 245
    .line 246
    goto :goto_1

    .line 247
    :goto_2
    return-object p2

    .line 248
    :pswitch_9
    check-cast p1, Ljava/lang/String;

    .line 249
    .line 250
    check-cast p2, Lh6/f;

    .line 251
    .line 252
    const-string v0, "acc"

    .line 253
    .line 254
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    const-string v0, "element"

    .line 258
    .line 259
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 263
    .line 264
    .line 265
    move-result v0

    .line 266
    if-nez v0, :cond_5

    .line 267
    .line 268
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    goto :goto_3

    .line 273
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 274
    .line 275
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    const-string p1, ", "

    .line 282
    .line 283
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    :goto_3
    return-object p1

    .line 294
    :pswitch_a
    check-cast p1, Le7/v;

    .line 295
    .line 296
    check-cast p2, Lh6/f;

    .line 297
    .line 298
    instance-of v0, p2, Lkotlinx/coroutines/n1;

    .line 299
    .line 300
    if-eqz v0, :cond_6

    .line 301
    .line 302
    check-cast p2, Lkotlinx/coroutines/n1;

    .line 303
    .line 304
    iget-object v0, p1, Le7/v;->a:Lh6/h;

    .line 305
    .line 306
    invoke-interface {p2, v0}, Lkotlinx/coroutines/n1;->updateThreadContext(Lh6/h;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    iget-object v1, p1, Le7/v;->b:[Ljava/lang/Object;

    .line 311
    .line 312
    iget v2, p1, Le7/v;->d:I

    .line 313
    .line 314
    aput-object v0, v1, v2

    .line 315
    .line 316
    iget-object v0, p1, Le7/v;->c:[Lkotlinx/coroutines/n1;

    .line 317
    .line 318
    add-int/lit8 v1, v2, 0x1

    .line 319
    .line 320
    iput v1, p1, Le7/v;->d:I

    .line 321
    .line 322
    aput-object p2, v0, v2

    .line 323
    .line 324
    :cond_6
    return-object p1

    .line 325
    :pswitch_b
    check-cast p1, Lkotlinx/coroutines/n1;

    .line 326
    .line 327
    check-cast p2, Lh6/f;

    .line 328
    .line 329
    if-eqz p1, :cond_7

    .line 330
    .line 331
    goto :goto_4

    .line 332
    :cond_7
    instance-of p1, p2, Lkotlinx/coroutines/n1;

    .line 333
    .line 334
    if-eqz p1, :cond_8

    .line 335
    .line 336
    move-object p1, p2

    .line 337
    check-cast p1, Lkotlinx/coroutines/n1;

    .line 338
    .line 339
    goto :goto_4

    .line 340
    :cond_8
    const/4 p1, 0x0

    .line 341
    :goto_4
    return-object p1

    .line 342
    :pswitch_c
    check-cast p2, Lh6/f;

    .line 343
    .line 344
    instance-of v0, p2, Lkotlinx/coroutines/n1;

    .line 345
    .line 346
    if-eqz v0, :cond_c

    .line 347
    .line 348
    instance-of v0, p1, Ljava/lang/Integer;

    .line 349
    .line 350
    if-eqz v0, :cond_9

    .line 351
    .line 352
    check-cast p1, Ljava/lang/Integer;

    .line 353
    .line 354
    goto :goto_5

    .line 355
    :cond_9
    const/4 p1, 0x0

    .line 356
    :goto_5
    const/4 v0, 0x1

    .line 357
    if-eqz p1, :cond_a

    .line 358
    .line 359
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 360
    .line 361
    .line 362
    move-result p1

    .line 363
    goto :goto_6

    .line 364
    :cond_a
    move p1, v0

    .line 365
    :goto_6
    if-nez p1, :cond_b

    .line 366
    .line 367
    move-object p1, p2

    .line 368
    goto :goto_7

    .line 369
    :cond_b
    add-int/2addr p1, v0

    .line 370
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 371
    .line 372
    .line 373
    move-result-object p1

    .line 374
    :cond_c
    :goto_7
    return-object p1

    .line 375
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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
