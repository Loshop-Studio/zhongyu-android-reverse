.class public final synthetic Landroidx/navigation/compose/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/navigation/compose/b;->a:I

    iput-object p3, p0, Landroidx/navigation/compose/b;->c:Ljava/lang/Object;

    iput-object p4, p0, Landroidx/navigation/compose/b;->d:Ljava/lang/Object;

    iput p1, p0, Landroidx/navigation/compose/b;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Landroidx/navigation/compose/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/navigation/compose/b;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lo2/a;

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/navigation/compose/b;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Landroidx/compose/ui/Modifier;

    .line 13
    .line 14
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 15
    .line 16
    check-cast p2, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget p2, p0, Landroidx/navigation/compose/b;->b:I

    .line 22
    .line 23
    or-int/lit8 p2, p2, 0x1

    .line 24
    .line 25
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    invoke-static {v0, v1, p1, p2}, Lcom/zykj/mistake/main/c1;->a(Lo2/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 30
    .line 31
    .line 32
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 33
    .line 34
    return-object p1

    .line 35
    :pswitch_0
    iget-object v0, p0, Landroidx/navigation/compose/b;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Lcom/zykj/mistake/feature/review/i;

    .line 38
    .line 39
    iget-object v1, p0, Landroidx/navigation/compose/b;->d:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Lr6/c;

    .line 42
    .line 43
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 44
    .line 45
    check-cast p2, Ljava/lang/Integer;

    .line 46
    .line 47
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    iget p2, p0, Landroidx/navigation/compose/b;->b:I

    .line 51
    .line 52
    or-int/lit8 p2, p2, 0x1

    .line 53
    .line 54
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    invoke-static {v0, v1, p1, p2}, Lcom/zykj/mistake/feature/review/y;->f(Lcom/zykj/mistake/feature/review/i;Lr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 59
    .line 60
    .line 61
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 62
    .line 63
    return-object p1

    .line 64
    :pswitch_1
    iget-object v0, p0, Landroidx/navigation/compose/b;->c:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, Ljava/lang/String;

    .line 67
    .line 68
    iget-object v1, p0, Landroidx/navigation/compose/b;->d:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v1, Lr6/a;

    .line 71
    .line 72
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 73
    .line 74
    check-cast p2, Ljava/lang/Integer;

    .line 75
    .line 76
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 77
    .line 78
    .line 79
    iget p2, p0, Landroidx/navigation/compose/b;->b:I

    .line 80
    .line 81
    or-int/lit8 p2, p2, 0x1

    .line 82
    .line 83
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 84
    .line 85
    .line 86
    move-result p2

    .line 87
    invoke-static {v0, v1, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/s4;->d(Ljava/lang/String;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 88
    .line 89
    .line 90
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 91
    .line 92
    return-object p1

    .line 93
    :pswitch_2
    iget-object v0, p0, Landroidx/navigation/compose/b;->c:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 96
    .line 97
    iget-object v1, p0, Landroidx/navigation/compose/b;->d:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v1, Lr6/c;

    .line 100
    .line 101
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 102
    .line 103
    check-cast p2, Ljava/lang/Integer;

    .line 104
    .line 105
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 106
    .line 107
    .line 108
    iget p2, p0, Landroidx/navigation/compose/b;->b:I

    .line 109
    .line 110
    or-int/lit8 p2, p2, 0x1

    .line 111
    .line 112
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 113
    .line 114
    .line 115
    move-result p2

    .line 116
    invoke-static {v0, v1, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/x3;->a(Lcom/zykj/mistake/feature/notebook/detail/m3;Lr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 117
    .line 118
    .line 119
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 120
    .line 121
    return-object p1

    .line 122
    :pswitch_3
    iget-object v0, p0, Landroidx/navigation/compose/b;->c:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v0, Lr6/a;

    .line 125
    .line 126
    iget-object v1, p0, Landroidx/navigation/compose/b;->d:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v1, Lr6/a;

    .line 129
    .line 130
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 131
    .line 132
    check-cast p2, Ljava/lang/Integer;

    .line 133
    .line 134
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 135
    .line 136
    .line 137
    iget p2, p0, Landroidx/navigation/compose/b;->b:I

    .line 138
    .line 139
    or-int/lit8 p2, p2, 0x1

    .line 140
    .line 141
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 142
    .line 143
    .line 144
    move-result p2

    .line 145
    invoke-static {v0, v1, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/g0;->g(Lr6/a;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 146
    .line 147
    .line 148
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 149
    .line 150
    return-object p1

    .line 151
    :pswitch_4
    iget-object v0, p0, Landroidx/navigation/compose/b;->c:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;

    .line 154
    .line 155
    iget-object v1, p0, Landroidx/navigation/compose/b;->d:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v1, Lr6/c;

    .line 158
    .line 159
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 160
    .line 161
    check-cast p2, Ljava/lang/Integer;

    .line 162
    .line 163
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 164
    .line 165
    .line 166
    iget p2, p0, Landroidx/navigation/compose/b;->b:I

    .line 167
    .line 168
    or-int/lit8 p2, p2, 0x1

    .line 169
    .line 170
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 171
    .line 172
    .line 173
    move-result p2

    .line 174
    invoke-static {v0, v1, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/t;->f(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;Lr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 175
    .line 176
    .line 177
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 178
    .line 179
    return-object p1

    .line 180
    :pswitch_5
    iget-object v0, p0, Landroidx/navigation/compose/b;->c:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v0, Lcom/zykj/mistake/feature/notebook/detail/o3;

    .line 183
    .line 184
    iget-object v1, p0, Landroidx/navigation/compose/b;->d:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v1, Lr6/a;

    .line 187
    .line 188
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 189
    .line 190
    check-cast p2, Ljava/lang/Integer;

    .line 191
    .line 192
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 193
    .line 194
    .line 195
    iget p2, p0, Landroidx/navigation/compose/b;->b:I

    .line 196
    .line 197
    or-int/lit8 p2, p2, 0x1

    .line 198
    .line 199
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 200
    .line 201
    .line 202
    move-result p2

    .line 203
    invoke-static {v0, v1, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/t;->s(Lcom/zykj/mistake/feature/notebook/detail/o3;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 204
    .line 205
    .line 206
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 207
    .line 208
    return-object p1

    .line 209
    :pswitch_6
    iget-object v0, p0, Landroidx/navigation/compose/b;->c:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v0, Lcom/zykj/mistake/feature/notebook/detail/j3;

    .line 212
    .line 213
    iget-object v1, p0, Landroidx/navigation/compose/b;->d:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v1, Lr6/a;

    .line 216
    .line 217
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 218
    .line 219
    check-cast p2, Ljava/lang/Integer;

    .line 220
    .line 221
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 222
    .line 223
    .line 224
    iget p2, p0, Landroidx/navigation/compose/b;->b:I

    .line 225
    .line 226
    or-int/lit8 p2, p2, 0x1

    .line 227
    .line 228
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 229
    .line 230
    .line 231
    move-result p2

    .line 232
    invoke-static {v0, v1, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/t;->p(Lcom/zykj/mistake/feature/notebook/detail/j3;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 233
    .line 234
    .line 235
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 236
    .line 237
    return-object p1

    .line 238
    :pswitch_7
    iget-object v0, p0, Landroidx/navigation/compose/b;->c:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v0, Ljava/lang/String;

    .line 241
    .line 242
    iget-object v1, p0, Landroidx/navigation/compose/b;->d:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast v1, Lr6/f;

    .line 245
    .line 246
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 247
    .line 248
    check-cast p2, Ljava/lang/Integer;

    .line 249
    .line 250
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 251
    .line 252
    .line 253
    iget p2, p0, Landroidx/navigation/compose/b;->b:I

    .line 254
    .line 255
    or-int/lit8 p2, p2, 0x1

    .line 256
    .line 257
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 258
    .line 259
    .line 260
    move-result p2

    .line 261
    invoke-static {v0, v1, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/t;->r(Ljava/lang/String;Lr6/f;Landroidx/compose/runtime/Composer;I)V

    .line 262
    .line 263
    .line 264
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 265
    .line 266
    return-object p1

    .line 267
    :pswitch_8
    iget-object v0, p0, Landroidx/navigation/compose/b;->c:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast v0, Lcom/zykj/mistake/feature/notebook/detail/p0;

    .line 270
    .line 271
    iget-object v1, p0, Landroidx/navigation/compose/b;->d:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v1, Lr6/a;

    .line 274
    .line 275
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 276
    .line 277
    check-cast p2, Ljava/lang/Integer;

    .line 278
    .line 279
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 280
    .line 281
    .line 282
    iget p2, p0, Landroidx/navigation/compose/b;->b:I

    .line 283
    .line 284
    or-int/lit8 p2, p2, 0x1

    .line 285
    .line 286
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 287
    .line 288
    .line 289
    move-result p2

    .line 290
    invoke-static {v0, v1, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/t;->k(Lcom/zykj/mistake/feature/notebook/detail/p0;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 291
    .line 292
    .line 293
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 294
    .line 295
    return-object p1

    .line 296
    :pswitch_9
    iget-object v0, p0, Landroidx/navigation/compose/b;->c:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v0, Lcom/zykj/mistake/main/MainShellViewModel;

    .line 299
    .line 300
    iget-object v1, p0, Landroidx/navigation/compose/b;->d:Ljava/lang/Object;

    .line 301
    .line 302
    check-cast v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 303
    .line 304
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 305
    .line 306
    check-cast p2, Ljava/lang/Integer;

    .line 307
    .line 308
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 309
    .line 310
    .line 311
    iget p2, p0, Landroidx/navigation/compose/b;->b:I

    .line 312
    .line 313
    or-int/lit8 p2, p2, 0x1

    .line 314
    .line 315
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 316
    .line 317
    .line 318
    move-result p2

    .line 319
    invoke-static {v0, v1, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/e;->a(Lcom/zykj/mistake/main/MainShellViewModel;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Landroidx/compose/runtime/Composer;I)V

    .line 320
    .line 321
    .line 322
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 323
    .line 324
    return-object p1

    .line 325
    :pswitch_a
    iget-object v0, p0, Landroidx/navigation/compose/b;->c:Ljava/lang/Object;

    .line 326
    .line 327
    check-cast v0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;

    .line 328
    .line 329
    iget-object v1, p0, Landroidx/navigation/compose/b;->d:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast v1, Lcom/zykj/mistake/main/MainShellViewModel;

    .line 332
    .line 333
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 334
    .line 335
    check-cast p2, Ljava/lang/Integer;

    .line 336
    .line 337
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 338
    .line 339
    .line 340
    iget p2, p0, Landroidx/navigation/compose/b;->b:I

    .line 341
    .line 342
    or-int/lit8 p2, p2, 0x1

    .line 343
    .line 344
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 345
    .line 346
    .line 347
    move-result p2

    .line 348
    invoke-static {v0, v1, p1, p2}, Lcom/zykj/mistake/feature/collection/list/a;->a(Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;Lcom/zykj/mistake/main/MainShellViewModel;Landroidx/compose/runtime/Composer;I)V

    .line 349
    .line 350
    .line 351
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 352
    .line 353
    return-object p1

    .line 354
    :pswitch_b
    iget-object v0, p0, Landroidx/navigation/compose/b;->c:Ljava/lang/Object;

    .line 355
    .line 356
    check-cast v0, Lcom/zykj/mistake/main/MainShellViewModel;

    .line 357
    .line 358
    iget-object v1, p0, Landroidx/navigation/compose/b;->d:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast v1, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;

    .line 361
    .line 362
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 363
    .line 364
    check-cast p2, Ljava/lang/Integer;

    .line 365
    .line 366
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 367
    .line 368
    .line 369
    iget p2, p0, Landroidx/navigation/compose/b;->b:I

    .line 370
    .line 371
    or-int/lit8 p2, p2, 0x1

    .line 372
    .line 373
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 374
    .line 375
    .line 376
    move-result p2

    .line 377
    invoke-static {v0, v1, p1, p2}, Lcom/zykj/mistake/feature/collection/filter/a;->b(Lcom/zykj/mistake/main/MainShellViewModel;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;Landroidx/compose/runtime/Composer;I)V

    .line 378
    .line 379
    .line 380
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 381
    .line 382
    return-object p1

    .line 383
    :pswitch_c
    iget-object v0, p0, Landroidx/navigation/compose/b;->c:Ljava/lang/Object;

    .line 384
    .line 385
    check-cast v0, Lcom/zykj/mistake/main/MainShellViewModel;

    .line 386
    .line 387
    iget-object v1, p0, Landroidx/navigation/compose/b;->d:Ljava/lang/Object;

    .line 388
    .line 389
    check-cast v1, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;

    .line 390
    .line 391
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 392
    .line 393
    check-cast p2, Ljava/lang/Integer;

    .line 394
    .line 395
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 396
    .line 397
    .line 398
    iget p2, p0, Landroidx/navigation/compose/b;->b:I

    .line 399
    .line 400
    or-int/lit8 p2, p2, 0x1

    .line 401
    .line 402
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 403
    .line 404
    .line 405
    move-result p2

    .line 406
    invoke-static {v0, v1, p1, p2}, Lcom/zykj/mistake/feature/collection/detail/a;->b(Lcom/zykj/mistake/main/MainShellViewModel;Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;Landroidx/compose/runtime/Composer;I)V

    .line 407
    .line 408
    .line 409
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 410
    .line 411
    return-object p1

    .line 412
    :pswitch_d
    iget-object v0, p0, Landroidx/navigation/compose/b;->c:Ljava/lang/Object;

    .line 413
    .line 414
    check-cast v0, Lcom/zykj/mistake/feature/ask/y;

    .line 415
    .line 416
    iget-object v1, p0, Landroidx/navigation/compose/b;->d:Ljava/lang/Object;

    .line 417
    .line 418
    check-cast v1, Landroidx/compose/ui/Modifier;

    .line 419
    .line 420
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 421
    .line 422
    check-cast p2, Ljava/lang/Integer;

    .line 423
    .line 424
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 425
    .line 426
    .line 427
    iget p2, p0, Landroidx/navigation/compose/b;->b:I

    .line 428
    .line 429
    or-int/lit8 p2, p2, 0x1

    .line 430
    .line 431
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 432
    .line 433
    .line 434
    move-result p2

    .line 435
    invoke-static {v0, v1, p1, p2}, Lcom/zykj/mistake/feature/ask/o0;->i(Lcom/zykj/mistake/feature/ask/y;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 436
    .line 437
    .line 438
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 439
    .line 440
    return-object p1

    .line 441
    :pswitch_e
    iget-object v0, p0, Landroidx/navigation/compose/b;->c:Ljava/lang/Object;

    .line 442
    .line 443
    check-cast v0, Landroidx/compose/runtime/saveable/SaveableStateHolder;

    .line 444
    .line 445
    iget-object v1, p0, Landroidx/navigation/compose/b;->d:Ljava/lang/Object;

    .line 446
    .line 447
    check-cast v1, Lr6/e;

    .line 448
    .line 449
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 450
    .line 451
    check-cast p2, Ljava/lang/Integer;

    .line 452
    .line 453
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 454
    .line 455
    .line 456
    move-result p2

    .line 457
    iget v2, p0, Landroidx/navigation/compose/b;->b:I

    .line 458
    .line 459
    invoke-static {v0, v1, v2, p1, p2}, Landroidx/navigation/compose/NavBackStackEntryProviderKt;->b(Landroidx/compose/runtime/saveable/SaveableStateHolder;Lr6/e;ILandroidx/compose/runtime/Composer;I)Ld6/s;

    .line 460
    .line 461
    .line 462
    move-result-object p1

    .line 463
    return-object p1

    .line 464
    :pswitch_f
    iget-object v0, p0, Landroidx/navigation/compose/b;->c:Ljava/lang/Object;

    .line 465
    .line 466
    check-cast v0, Ljava/util/List;

    .line 467
    .line 468
    iget-object v1, p0, Landroidx/navigation/compose/b;->d:Ljava/lang/Object;

    .line 469
    .line 470
    check-cast v1, Ljava/util/Collection;

    .line 471
    .line 472
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 473
    .line 474
    check-cast p2, Ljava/lang/Integer;

    .line 475
    .line 476
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 477
    .line 478
    .line 479
    move-result p2

    .line 480
    iget v2, p0, Landroidx/navigation/compose/b;->b:I

    .line 481
    .line 482
    invoke-static {v0, v1, v2, p1, p2}, Landroidx/navigation/compose/DialogHostKt;->e(Ljava/util/List;Ljava/util/Collection;ILandroidx/compose/runtime/Composer;I)Ld6/s;

    .line 483
    .line 484
    .line 485
    move-result-object p1

    .line 486
    return-object p1

    .line 487
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
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
