.class public final synthetic Landroidx/lifecycle/compose/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/lifecycle/compose/g;->a:I

    iput-object p3, p0, Landroidx/lifecycle/compose/g;->b:Ljava/lang/Object;

    iput-object p4, p0, Landroidx/lifecycle/compose/g;->e:Ljava/lang/Object;

    iput-object p5, p0, Landroidx/lifecycle/compose/g;->c:Ljava/lang/Object;

    iput p1, p0, Landroidx/lifecycle/compose/g;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lr6/c;Ljava/lang/Object;II)V
    .locals 0

    .line 2
    iput p5, p0, Landroidx/lifecycle/compose/g;->a:I

    iput-object p1, p0, Landroidx/lifecycle/compose/g;->b:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/lifecycle/compose/g;->c:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/lifecycle/compose/g;->e:Ljava/lang/Object;

    iput p4, p0, Landroidx/lifecycle/compose/g;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Landroidx/lifecycle/compose/g;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/lifecycle/compose/g;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/navigation/NavHostController;

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/lifecycle/compose/g;->e:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lcom/zykj/mistake/main/MainShellViewModel;

    .line 13
    .line 14
    iget-object v2, p0, Landroidx/lifecycle/compose/g;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Landroidx/compose/ui/Modifier;

    .line 17
    .line 18
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 19
    .line 20
    check-cast p2, Ljava/lang/Integer;

    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget p2, p0, Landroidx/lifecycle/compose/g;->d:I

    .line 26
    .line 27
    or-int/lit8 p2, p2, 0x1

    .line 28
    .line 29
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    invoke-static {v0, v1, v2, p1, p2}, Lt4/g;->a(Landroidx/navigation/NavHostController;Lcom/zykj/mistake/main/MainShellViewModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 34
    .line 35
    .line 36
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_0
    iget-object v0, p0, Landroidx/lifecycle/compose/g;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Lcom/zykj/mistake/main/RemoveDialogTarget;

    .line 42
    .line 43
    iget-object v1, p0, Landroidx/lifecycle/compose/g;->e:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, Lr6/a;

    .line 46
    .line 47
    iget-object v2, p0, Landroidx/lifecycle/compose/g;->c:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v2, Lr6/a;

    .line 50
    .line 51
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 52
    .line 53
    check-cast p2, Ljava/lang/Integer;

    .line 54
    .line 55
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 56
    .line 57
    .line 58
    iget p2, p0, Landroidx/lifecycle/compose/g;->d:I

    .line 59
    .line 60
    or-int/lit8 p2, p2, 0x1

    .line 61
    .line 62
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    invoke-static {v0, v1, v2, p1, p2}, Lr4/c;->b(Lcom/zykj/mistake/main/RemoveDialogTarget;Lr6/a;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 67
    .line 68
    .line 69
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 70
    .line 71
    return-object p1

    .line 72
    :pswitch_1
    iget-object v0, p0, Landroidx/lifecycle/compose/g;->b:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 75
    .line 76
    iget-object v1, p0, Landroidx/lifecycle/compose/g;->e:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v1, Lcom/zykj/mistake/main/MainShellViewModel;

    .line 79
    .line 80
    iget-object v2, p0, Landroidx/lifecycle/compose/g;->c:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v2, Lz4/g;

    .line 83
    .line 84
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 85
    .line 86
    check-cast p2, Ljava/lang/Integer;

    .line 87
    .line 88
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 89
    .line 90
    .line 91
    iget p2, p0, Landroidx/lifecycle/compose/g;->d:I

    .line 92
    .line 93
    or-int/lit8 p2, p2, 0x1

    .line 94
    .line 95
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    invoke-static {v0, v1, v2, p1, p2}, Lcom/zykj/mistake/feature/notebook/list/m1;->a(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Lcom/zykj/mistake/main/MainShellViewModel;Lz4/g;Landroidx/compose/runtime/Composer;I)V

    .line 100
    .line 101
    .line 102
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 103
    .line 104
    return-object p1

    .line 105
    :pswitch_2
    iget-object v0, p0, Landroidx/lifecycle/compose/g;->b:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v0, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 108
    .line 109
    iget-object v1, p0, Landroidx/lifecycle/compose/g;->c:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v1, Lr6/c;

    .line 112
    .line 113
    iget-object v2, p0, Landroidx/lifecycle/compose/g;->e:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v2, Lr6/a;

    .line 116
    .line 117
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 118
    .line 119
    check-cast p2, Ljava/lang/Integer;

    .line 120
    .line 121
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 122
    .line 123
    .line 124
    iget p2, p0, Landroidx/lifecycle/compose/g;->d:I

    .line 125
    .line 126
    or-int/lit8 p2, p2, 0x1

    .line 127
    .line 128
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 129
    .line 130
    .line 131
    move-result p2

    .line 132
    invoke-static {v0, v1, v2, p1, p2}, Lcom/zykj/mistake/feature/notebook/list/i1;->f(Lcom/zykj/mistake/feature/notebook/list/e1;Lr6/c;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 133
    .line 134
    .line 135
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 136
    .line 137
    return-object p1

    .line 138
    :pswitch_3
    iget-object v0, p0, Landroidx/lifecycle/compose/g;->b:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v0, Landroidx/compose/ui/Modifier;

    .line 141
    .line 142
    iget-object v1, p0, Landroidx/lifecycle/compose/g;->e:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v1, Lr6/a;

    .line 145
    .line 146
    iget-object v2, p0, Landroidx/lifecycle/compose/g;->c:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v2, Lr6/a;

    .line 149
    .line 150
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 151
    .line 152
    check-cast p2, Ljava/lang/Integer;

    .line 153
    .line 154
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    iget p2, p0, Landroidx/lifecycle/compose/g;->d:I

    .line 158
    .line 159
    or-int/lit8 p2, p2, 0x1

    .line 160
    .line 161
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 162
    .line 163
    .line 164
    move-result p2

    .line 165
    invoke-static {v0, v1, v2, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/s4;->b(Landroidx/compose/ui/Modifier;Lr6/a;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 166
    .line 167
    .line 168
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 169
    .line 170
    return-object p1

    .line 171
    :pswitch_4
    iget-object v0, p0, Landroidx/lifecycle/compose/g;->b:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v0, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 174
    .line 175
    iget-object v1, p0, Landroidx/lifecycle/compose/g;->c:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v1, Lr6/c;

    .line 178
    .line 179
    iget-object v2, p0, Landroidx/lifecycle/compose/g;->e:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v2, Lr6/c;

    .line 182
    .line 183
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 184
    .line 185
    check-cast p2, Ljava/lang/Integer;

    .line 186
    .line 187
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 188
    .line 189
    .line 190
    iget p2, p0, Landroidx/lifecycle/compose/g;->d:I

    .line 191
    .line 192
    or-int/lit8 p2, p2, 0x1

    .line 193
    .line 194
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 195
    .line 196
    .line 197
    move-result p2

    .line 198
    invoke-static {v0, v1, v2, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/s4;->c(Lcom/zykj/mistake/feature/notebook/detail/m3;Lr6/c;Lr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 199
    .line 200
    .line 201
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 202
    .line 203
    return-object p1

    .line 204
    :pswitch_5
    iget-object v0, p0, Landroidx/lifecycle/compose/g;->b:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v0, Lcom/zykj/mistake/feature/notebook/detail/k3;

    .line 207
    .line 208
    iget-object v1, p0, Landroidx/lifecycle/compose/g;->c:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast v1, Lr6/c;

    .line 211
    .line 212
    iget-object v2, p0, Landroidx/lifecycle/compose/g;->e:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v2, Landroidx/compose/ui/Modifier;

    .line 215
    .line 216
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 217
    .line 218
    check-cast p2, Ljava/lang/Integer;

    .line 219
    .line 220
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    iget p2, p0, Landroidx/lifecycle/compose/g;->d:I

    .line 224
    .line 225
    or-int/lit8 p2, p2, 0x1

    .line 226
    .line 227
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 228
    .line 229
    .line 230
    move-result p2

    .line 231
    invoke-static {v0, v1, v2, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/q4;->d(Lcom/zykj/mistake/feature/notebook/detail/k3;Lr6/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 232
    .line 233
    .line 234
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 235
    .line 236
    return-object p1

    .line 237
    :pswitch_6
    iget-object v0, p0, Landroidx/lifecycle/compose/g;->b:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v0, Lcom/zykj/mistake/feature/notebook/detail/l3;

    .line 240
    .line 241
    iget-object v1, p0, Landroidx/lifecycle/compose/g;->e:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v1, Lr6/a;

    .line 244
    .line 245
    iget-object v2, p0, Landroidx/lifecycle/compose/g;->c:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v2, Lr6/a;

    .line 248
    .line 249
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 250
    .line 251
    check-cast p2, Ljava/lang/Integer;

    .line 252
    .line 253
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 254
    .line 255
    .line 256
    iget p2, p0, Landroidx/lifecycle/compose/g;->d:I

    .line 257
    .line 258
    or-int/lit8 p2, p2, 0x1

    .line 259
    .line 260
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 261
    .line 262
    .line 263
    move-result p2

    .line 264
    invoke-static {v0, v1, v2, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/x3;->e(Lcom/zykj/mistake/feature/notebook/detail/l3;Lr6/a;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 265
    .line 266
    .line 267
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 268
    .line 269
    return-object p1

    .line 270
    :pswitch_7
    iget-object v0, p0, Landroidx/lifecycle/compose/g;->b:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 273
    .line 274
    iget-object v1, p0, Landroidx/lifecycle/compose/g;->e:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast v1, Lcom/zykj/mistake/main/MainShellViewModel;

    .line 277
    .line 278
    iget-object v2, p0, Landroidx/lifecycle/compose/g;->c:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast v2, Lz4/e;

    .line 281
    .line 282
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 283
    .line 284
    check-cast p2, Ljava/lang/Integer;

    .line 285
    .line 286
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 287
    .line 288
    .line 289
    iget p2, p0, Landroidx/lifecycle/compose/g;->d:I

    .line 290
    .line 291
    or-int/lit8 p2, p2, 0x1

    .line 292
    .line 293
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 294
    .line 295
    .line 296
    move-result p2

    .line 297
    invoke-static {v0, v1, v2, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/k0;->a(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Lcom/zykj/mistake/main/MainShellViewModel;Lz4/e;Landroidx/compose/runtime/Composer;I)V

    .line 298
    .line 299
    .line 300
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 301
    .line 302
    return-object p1

    .line 303
    :pswitch_8
    iget-object v0, p0, Landroidx/lifecycle/compose/g;->b:Ljava/lang/Object;

    .line 304
    .line 305
    check-cast v0, Ljava/lang/String;

    .line 306
    .line 307
    iget-object v1, p0, Landroidx/lifecycle/compose/g;->e:Ljava/lang/Object;

    .line 308
    .line 309
    check-cast v1, Ljava/lang/String;

    .line 310
    .line 311
    iget-object v2, p0, Landroidx/lifecycle/compose/g;->c:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast v2, Lr6/a;

    .line 314
    .line 315
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 316
    .line 317
    check-cast p2, Ljava/lang/Integer;

    .line 318
    .line 319
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 320
    .line 321
    .line 322
    iget p2, p0, Landroidx/lifecycle/compose/g;->d:I

    .line 323
    .line 324
    or-int/lit8 p2, p2, 0x1

    .line 325
    .line 326
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 327
    .line 328
    .line 329
    move-result p2

    .line 330
    invoke-static {v0, v1, v2, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/t;->c(Ljava/lang/String;Ljava/lang/String;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 331
    .line 332
    .line 333
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 334
    .line 335
    return-object p1

    .line 336
    :pswitch_9
    iget-object v0, p0, Landroidx/lifecycle/compose/g;->b:Ljava/lang/Object;

    .line 337
    .line 338
    check-cast v0, Lcom/zykj/mistake/main/MainShellViewModel;

    .line 339
    .line 340
    iget-object v1, p0, Landroidx/lifecycle/compose/g;->e:Ljava/lang/Object;

    .line 341
    .line 342
    check-cast v1, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 343
    .line 344
    iget-object v2, p0, Landroidx/lifecycle/compose/g;->c:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast v2, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;

    .line 347
    .line 348
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 349
    .line 350
    check-cast p2, Ljava/lang/Integer;

    .line 351
    .line 352
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 353
    .line 354
    .line 355
    iget p2, p0, Landroidx/lifecycle/compose/g;->d:I

    .line 356
    .line 357
    or-int/lit8 p2, p2, 0x1

    .line 358
    .line 359
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 360
    .line 361
    .line 362
    move-result p2

    .line 363
    invoke-static {v0, v1, v2, p1, p2}, Lcom/zykj/mistake/feature/home/k;->a(Lcom/zykj/mistake/main/MainShellViewModel;Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;Landroidx/compose/runtime/Composer;I)V

    .line 364
    .line 365
    .line 366
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 367
    .line 368
    return-object p1

    .line 369
    :pswitch_a
    iget-object v0, p0, Landroidx/lifecycle/compose/g;->b:Ljava/lang/Object;

    .line 370
    .line 371
    check-cast v0, Lcom/zykj/mistake/feature/collection/list/v;

    .line 372
    .line 373
    iget-object v1, p0, Landroidx/lifecycle/compose/g;->c:Ljava/lang/Object;

    .line 374
    .line 375
    check-cast v1, Lr6/c;

    .line 376
    .line 377
    iget-object v2, p0, Landroidx/lifecycle/compose/g;->e:Ljava/lang/Object;

    .line 378
    .line 379
    check-cast v2, Landroidx/compose/ui/Modifier;

    .line 380
    .line 381
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 382
    .line 383
    check-cast p2, Ljava/lang/Integer;

    .line 384
    .line 385
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 386
    .line 387
    .line 388
    iget p2, p0, Landroidx/lifecycle/compose/g;->d:I

    .line 389
    .line 390
    or-int/lit8 p2, p2, 0x1

    .line 391
    .line 392
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 393
    .line 394
    .line 395
    move-result p2

    .line 396
    invoke-static {v0, v1, v2, p1, p2}, Lcom/zykj/mistake/feature/collection/list/c0;->d(Lcom/zykj/mistake/feature/collection/list/v;Lr6/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 397
    .line 398
    .line 399
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 400
    .line 401
    return-object p1

    .line 402
    :pswitch_b
    iget-object v0, p0, Landroidx/lifecycle/compose/g;->b:Ljava/lang/Object;

    .line 403
    .line 404
    check-cast v0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;

    .line 405
    .line 406
    iget-object v1, p0, Landroidx/lifecycle/compose/g;->e:Ljava/lang/Object;

    .line 407
    .line 408
    check-cast v1, Lz4/c;

    .line 409
    .line 410
    iget-object v2, p0, Landroidx/lifecycle/compose/g;->c:Ljava/lang/Object;

    .line 411
    .line 412
    check-cast v2, Lcom/zykj/mistake/main/MainShellViewModel;

    .line 413
    .line 414
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 415
    .line 416
    check-cast p2, Ljava/lang/Integer;

    .line 417
    .line 418
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 419
    .line 420
    .line 421
    iget p2, p0, Landroidx/lifecycle/compose/g;->d:I

    .line 422
    .line 423
    or-int/lit8 p2, p2, 0x1

    .line 424
    .line 425
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 426
    .line 427
    .line 428
    move-result p2

    .line 429
    invoke-static {v0, v1, v2, p1, p2}, Lcom/zykj/mistake/feature/collection/filter/a;->a(Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;Lz4/c;Lcom/zykj/mistake/main/MainShellViewModel;Landroidx/compose/runtime/Composer;I)V

    .line 430
    .line 431
    .line 432
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 433
    .line 434
    return-object p1

    .line 435
    :pswitch_c
    iget-object v0, p0, Landroidx/lifecycle/compose/g;->b:Ljava/lang/Object;

    .line 436
    .line 437
    check-cast v0, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 438
    .line 439
    iget-object v1, p0, Landroidx/lifecycle/compose/g;->e:Ljava/lang/Object;

    .line 440
    .line 441
    check-cast v1, Landroidx/compose/ui/Modifier;

    .line 442
    .line 443
    iget-object v2, p0, Landroidx/lifecycle/compose/g;->c:Ljava/lang/Object;

    .line 444
    .line 445
    check-cast v2, Lr6/c;

    .line 446
    .line 447
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 448
    .line 449
    check-cast p2, Ljava/lang/Integer;

    .line 450
    .line 451
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 452
    .line 453
    .line 454
    iget p2, p0, Landroidx/lifecycle/compose/g;->d:I

    .line 455
    .line 456
    or-int/lit8 p2, p2, 0x1

    .line 457
    .line 458
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 459
    .line 460
    .line 461
    move-result p2

    .line 462
    invoke-static {v0, v1, v2, p1, p2}, Lcom/zykj/mistake/feature/collection/detail/f1;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Landroidx/compose/ui/Modifier;Lr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 463
    .line 464
    .line 465
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 466
    .line 467
    return-object p1

    .line 468
    :pswitch_d
    iget-object v0, p0, Landroidx/lifecycle/compose/g;->b:Ljava/lang/Object;

    .line 469
    .line 470
    check-cast v0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;

    .line 471
    .line 472
    iget-object v1, p0, Landroidx/lifecycle/compose/g;->e:Ljava/lang/Object;

    .line 473
    .line 474
    check-cast v1, Lz4/c;

    .line 475
    .line 476
    iget-object v2, p0, Landroidx/lifecycle/compose/g;->c:Ljava/lang/Object;

    .line 477
    .line 478
    check-cast v2, Lcom/zykj/mistake/main/MainShellViewModel;

    .line 479
    .line 480
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 481
    .line 482
    check-cast p2, Ljava/lang/Integer;

    .line 483
    .line 484
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 485
    .line 486
    .line 487
    iget p2, p0, Landroidx/lifecycle/compose/g;->d:I

    .line 488
    .line 489
    or-int/lit8 p2, p2, 0x1

    .line 490
    .line 491
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 492
    .line 493
    .line 494
    move-result p2

    .line 495
    invoke-static {v0, v1, v2, p1, p2}, Lcom/zykj/mistake/feature/collection/detail/a;->a(Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;Lz4/c;Lcom/zykj/mistake/main/MainShellViewModel;Landroidx/compose/runtime/Composer;I)V

    .line 496
    .line 497
    .line 498
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 499
    .line 500
    return-object p1

    .line 501
    :pswitch_e
    iget-object v0, p0, Landroidx/lifecycle/compose/g;->b:Ljava/lang/Object;

    .line 502
    .line 503
    check-cast v0, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialViewModel;

    .line 504
    .line 505
    iget-object v1, p0, Landroidx/lifecycle/compose/g;->e:Ljava/lang/Object;

    .line 506
    .line 507
    check-cast v1, Lcom/zykj/mistake/feature/ask/f;

    .line 508
    .line 509
    iget-object v2, p0, Landroidx/lifecycle/compose/g;->c:Ljava/lang/Object;

    .line 510
    .line 511
    check-cast v2, Lz4/a;

    .line 512
    .line 513
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 514
    .line 515
    check-cast p2, Ljava/lang/Integer;

    .line 516
    .line 517
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 518
    .line 519
    .line 520
    iget p2, p0, Landroidx/lifecycle/compose/g;->d:I

    .line 521
    .line 522
    or-int/lit8 p2, p2, 0x1

    .line 523
    .line 524
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 525
    .line 526
    .line 527
    move-result p2

    .line 528
    invoke-static {v0, v1, v2, p1, p2}, Lcom/zykj/mistake/feature/ask/a;->a(Lcom/zykj/mistake/feature/ask/MistakeAskMaterialViewModel;Lcom/zykj/mistake/feature/ask/f;Lz4/a;Landroidx/compose/runtime/Composer;I)V

    .line 529
    .line 530
    .line 531
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 532
    .line 533
    return-object p1

    .line 534
    :pswitch_f
    iget-object v0, p0, Landroidx/lifecycle/compose/g;->b:Ljava/lang/Object;

    .line 535
    .line 536
    move-object v1, v0

    .line 537
    check-cast v1, Landroidx/navigation/NavBackStackEntry;

    .line 538
    .line 539
    iget-object v0, p0, Landroidx/lifecycle/compose/g;->e:Ljava/lang/Object;

    .line 540
    .line 541
    move-object v2, v0

    .line 542
    check-cast v2, Landroidx/compose/runtime/saveable/SaveableStateHolder;

    .line 543
    .line 544
    iget-object v0, p0, Landroidx/lifecycle/compose/g;->c:Ljava/lang/Object;

    .line 545
    .line 546
    move-object v3, v0

    .line 547
    check-cast v3, Lr6/e;

    .line 548
    .line 549
    move-object v5, p1

    .line 550
    check-cast v5, Landroidx/compose/runtime/Composer;

    .line 551
    .line 552
    check-cast p2, Ljava/lang/Integer;

    .line 553
    .line 554
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 555
    .line 556
    .line 557
    move-result v6

    .line 558
    iget v4, p0, Landroidx/lifecycle/compose/g;->d:I

    .line 559
    .line 560
    invoke-static/range {v1 .. v6}, Landroidx/navigation/compose/NavBackStackEntryProviderKt;->c(Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/saveable/SaveableStateHolder;Lr6/e;ILandroidx/compose/runtime/Composer;I)Ld6/s;

    .line 561
    .line 562
    .line 563
    move-result-object p1

    .line 564
    return-object p1

    .line 565
    :pswitch_10
    iget-object v0, p0, Landroidx/lifecycle/compose/g;->b:Ljava/lang/Object;

    .line 566
    .line 567
    move-object v1, v0

    .line 568
    check-cast v1, Landroidx/lifecycle/LifecycleOwner;

    .line 569
    .line 570
    iget-object v0, p0, Landroidx/lifecycle/compose/g;->e:Ljava/lang/Object;

    .line 571
    .line 572
    move-object v2, v0

    .line 573
    check-cast v2, Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;

    .line 574
    .line 575
    iget-object v0, p0, Landroidx/lifecycle/compose/g;->c:Ljava/lang/Object;

    .line 576
    .line 577
    move-object v3, v0

    .line 578
    check-cast v3, Lr6/c;

    .line 579
    .line 580
    move-object v5, p1

    .line 581
    check-cast v5, Landroidx/compose/runtime/Composer;

    .line 582
    .line 583
    check-cast p2, Ljava/lang/Integer;

    .line 584
    .line 585
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 586
    .line 587
    .line 588
    move-result v6

    .line 589
    iget v4, p0, Landroidx/lifecycle/compose/g;->d:I

    .line 590
    .line 591
    invoke-static/range {v1 .. v6}, Landroidx/lifecycle/compose/LifecycleEffectKt;->f(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;Lr6/c;ILandroidx/compose/runtime/Composer;I)Ld6/s;

    .line 592
    .line 593
    .line 594
    move-result-object p1

    .line 595
    return-object p1

    .line 596
    :pswitch_11
    iget-object v0, p0, Landroidx/lifecycle/compose/g;->b:Ljava/lang/Object;

    .line 597
    .line 598
    move-object v1, v0

    .line 599
    check-cast v1, Landroidx/lifecycle/LifecycleOwner;

    .line 600
    .line 601
    iget-object v0, p0, Landroidx/lifecycle/compose/g;->e:Ljava/lang/Object;

    .line 602
    .line 603
    move-object v2, v0

    .line 604
    check-cast v2, Landroidx/lifecycle/compose/LifecycleStartStopEffectScope;

    .line 605
    .line 606
    iget-object v0, p0, Landroidx/lifecycle/compose/g;->c:Ljava/lang/Object;

    .line 607
    .line 608
    move-object v3, v0

    .line 609
    check-cast v3, Lr6/c;

    .line 610
    .line 611
    move-object v5, p1

    .line 612
    check-cast v5, Landroidx/compose/runtime/Composer;

    .line 613
    .line 614
    check-cast p2, Ljava/lang/Integer;

    .line 615
    .line 616
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 617
    .line 618
    .line 619
    move-result v6

    .line 620
    iget v4, p0, Landroidx/lifecycle/compose/g;->d:I

    .line 621
    .line 622
    invoke-static/range {v1 .. v6}, Landroidx/lifecycle/compose/LifecycleEffectKt;->m(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/compose/LifecycleStartStopEffectScope;Lr6/c;ILandroidx/compose/runtime/Composer;I)Ld6/s;

    .line 623
    .line 624
    .line 625
    move-result-object p1

    .line 626
    return-object p1

    .line 627
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
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
