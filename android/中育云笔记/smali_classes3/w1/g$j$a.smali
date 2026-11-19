.class public final Lw1/g$j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgc/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw1/g$j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lw1/g$h;

.field public final b:Lw1/g$d;

.field public final c:Lw1/g$j;

.field public final d:I


# direct methods
.method public constructor <init>(Lw1/g$h;Lw1/g$d;Lw1/g$j;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 5
    .line 6
    iput-object p2, p0, Lw1/g$j$a;->b:Lw1/g$d;

    .line 7
    .line 8
    iput-object p3, p0, Lw1/g$j$a;->c:Lw1/g$j;

    .line 9
    .line 10
    iput p4, p0, Lw1/g$j$a;->d:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lw1/g$j$a;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/AssertionError;

    .line 7
    .line 8
    iget v1, p0, Lw1/g$j$a;->d:I

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(I)V

    .line 11
    .line 12
    .line 13
    throw v0

    .line 14
    :pswitch_0
    new-instance v2, Lcom/friday/user/viewmodel/UserViewModel;

    .line 15
    .line 16
    iget-object v0, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 17
    .line 18
    iget-object v0, v0, Lw1/g$h;->o:Lgc/f;

    .line 19
    .line 20
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    move-object v3, v0

    .line 25
    check-cast v3, Lcom/friday/common/dao/UserDao;

    .line 26
    .line 27
    iget-object v0, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 28
    .line 29
    iget-object v0, v0, Lw1/g$h;->m:Lgc/f;

    .line 30
    .line 31
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    move-object v4, v0

    .line 36
    check-cast v4, Lcom/friday/common/dao/FileDao;

    .line 37
    .line 38
    iget-object v0, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 39
    .line 40
    iget-object v0, v0, Lw1/g$h;->k:Lgc/f;

    .line 41
    .line 42
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    move-object v5, v0

    .line 47
    check-cast v5, Lcom/friday/common/dao/ResourceDao;

    .line 48
    .line 49
    iget-object v0, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 50
    .line 51
    iget-object v0, v0, Lw1/g$h;->l:Lgc/f;

    .line 52
    .line 53
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    move-object v6, v0

    .line 58
    check-cast v6, Lc2/g2;

    .line 59
    .line 60
    iget-object v0, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 61
    .line 62
    iget-object v0, v0, Lw1/g$h;->n:Lgc/f;

    .line 63
    .line 64
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    move-object v7, v0

    .line 69
    check-cast v7, Lc2/v0;

    .line 70
    .line 71
    iget-object v0, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 72
    .line 73
    iget-object v0, v0, Lw1/g$h;->v:Lgc/f;

    .line 74
    .line 75
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    move-object v8, v0

    .line 80
    check-cast v8, Ld2/i;

    .line 81
    .line 82
    invoke-direct/range {v2 .. v8}, Lcom/friday/user/viewmodel/UserViewModel;-><init>(Lcom/friday/common/dao/UserDao;Lcom/friday/common/dao/FileDao;Lcom/friday/common/dao/ResourceDao;Lc2/g2;Lc2/v0;Ld2/i;)V

    .line 83
    .line 84
    .line 85
    return-object v2

    .line 86
    :pswitch_1
    new-instance v0, Lcom/friday/document/viewmodel/TxtEditViewModel;

    .line 87
    .line 88
    iget-object v1, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 89
    .line 90
    iget-object v1, v1, Lw1/g$h;->m:Lgc/f;

    .line 91
    .line 92
    invoke-interface {v1}, Lpc/a;->get()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    check-cast v1, Lcom/friday/common/dao/FileDao;

    .line 97
    .line 98
    invoke-direct {v0, v1}, Lcom/friday/document/viewmodel/TxtEditViewModel;-><init>(Lcom/friday/common/dao/FileDao;)V

    .line 99
    .line 100
    .line 101
    return-object v0

    .line 102
    :pswitch_2
    new-instance v0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel;

    .line 103
    .line 104
    iget-object v1, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 105
    .line 106
    iget-object v1, v1, Lw1/g$h;->u:Lgc/f;

    .line 107
    .line 108
    invoke-interface {v1}, Lpc/a;->get()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    check-cast v1, Ls2/a;

    .line 113
    .line 114
    iget-object v2, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 115
    .line 116
    iget-object v2, v2, Lw1/g$h;->m:Lgc/f;

    .line 117
    .line 118
    invoke-interface {v2}, Lpc/a;->get()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    check-cast v2, Lcom/friday/common/dao/FileDao;

    .line 123
    .line 124
    iget-object v3, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 125
    .line 126
    iget-object v3, v3, Lw1/g$h;->z:Lgc/f;

    .line 127
    .line 128
    invoke-interface {v3}, Lpc/a;->get()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    check-cast v3, Lcom/friday/document/service/FileManager;

    .line 133
    .line 134
    invoke-direct {v0, v1, v2, v3}, Lcom/friday/document/viewmodel/TeacherOnlyViewModel;-><init>(Ls2/a;Lcom/friday/common/dao/FileDao;Lcom/friday/document/service/FileManager;)V

    .line 135
    .line 136
    .line 137
    return-object v0

    .line 138
    :pswitch_3
    new-instance v4, Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 139
    .line 140
    iget-object v0, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 141
    .line 142
    iget-object v0, v0, Lw1/g$h;->F:Lgc/f;

    .line 143
    .line 144
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    move-object v5, v0

    .line 149
    check-cast v5, Ls2/b;

    .line 150
    .line 151
    iget-object v0, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 152
    .line 153
    iget-object v0, v0, Lw1/g$h;->v:Lgc/f;

    .line 154
    .line 155
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    move-object v6, v0

    .line 160
    check-cast v6, Ld2/i;

    .line 161
    .line 162
    iget-object v0, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 163
    .line 164
    iget-object v0, v0, Lw1/g$h;->l:Lgc/f;

    .line 165
    .line 166
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    move-object v7, v0

    .line 171
    check-cast v7, Lc2/g2;

    .line 172
    .line 173
    iget-object v0, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 174
    .line 175
    iget-object v0, v0, Lw1/g$h;->k:Lgc/f;

    .line 176
    .line 177
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    move-object v8, v0

    .line 182
    check-cast v8, Lcom/friday/common/dao/ResourceDao;

    .line 183
    .line 184
    iget-object v0, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 185
    .line 186
    iget-object v0, v0, Lw1/g$h;->z:Lgc/f;

    .line 187
    .line 188
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    move-object v9, v0

    .line 193
    check-cast v9, Lcom/friday/document/service/FileManager;

    .line 194
    .line 195
    invoke-direct/range {v4 .. v9}, Lcom/friday/document/viewmodel/StudentShareViewModel;-><init>(Ls2/b;Ld2/i;Lc2/g2;Lcom/friday/common/dao/ResourceDao;Lcom/friday/document/service/FileManager;)V

    .line 196
    .line 197
    .line 198
    return-object v4

    .line 199
    :pswitch_4
    new-instance v0, Lcom/friday/document/viewmodel/ShareFileViewModel;

    .line 200
    .line 201
    iget-object v1, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 202
    .line 203
    invoke-static {v1}, Lw1/g$h;->e(Lw1/g$h;)Lec/a;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    invoke-static {v1}, Lec/c;->a(Lec/a;)Landroid/content/Context;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    iget-object v2, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 212
    .line 213
    iget-object v2, v2, Lw1/g$h;->F:Lgc/f;

    .line 214
    .line 215
    invoke-interface {v2}, Lpc/a;->get()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    check-cast v2, Ls2/b;

    .line 220
    .line 221
    invoke-direct {v0, v1, v2}, Lcom/friday/document/viewmodel/ShareFileViewModel;-><init>(Landroid/content/Context;Ls2/b;)V

    .line 222
    .line 223
    .line 224
    return-object v0

    .line 225
    :pswitch_5
    new-instance v0, Lcom/friday/document/viewmodel/ShareByTeacherViewModel;

    .line 226
    .line 227
    iget-object v1, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 228
    .line 229
    iget-object v1, v1, Lw1/g$h;->F:Lgc/f;

    .line 230
    .line 231
    invoke-interface {v1}, Lpc/a;->get()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    check-cast v1, Ls2/b;

    .line 236
    .line 237
    invoke-direct {v0, v1}, Lcom/friday/document/viewmodel/ShareByTeacherViewModel;-><init>(Ls2/b;)V

    .line 238
    .line 239
    .line 240
    return-object v0

    .line 241
    :pswitch_6
    new-instance v0, Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 242
    .line 243
    iget-object v1, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 244
    .line 245
    iget-object v1, v1, Lw1/g$h;->F:Lgc/f;

    .line 246
    .line 247
    invoke-interface {v1}, Lpc/a;->get()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    check-cast v1, Ls2/b;

    .line 252
    .line 253
    iget-object v2, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 254
    .line 255
    iget-object v2, v2, Lw1/g$h;->l:Lgc/f;

    .line 256
    .line 257
    invoke-interface {v2}, Lpc/a;->get()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    check-cast v2, Lc2/g2;

    .line 262
    .line 263
    iget-object v3, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 264
    .line 265
    iget-object v3, v3, Lw1/g$h;->k:Lgc/f;

    .line 266
    .line 267
    invoke-interface {v3}, Lpc/a;->get()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v3

    .line 271
    check-cast v3, Lcom/friday/common/dao/ResourceDao;

    .line 272
    .line 273
    iget-object v4, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 274
    .line 275
    iget-object v4, v4, Lw1/g$h;->z:Lgc/f;

    .line 276
    .line 277
    invoke-interface {v4}, Lpc/a;->get()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v4

    .line 281
    check-cast v4, Lcom/friday/document/service/FileManager;

    .line 282
    .line 283
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/friday/document/viewmodel/ShareBaseViewModel;-><init>(Ls2/b;Lc2/g2;Lcom/friday/common/dao/ResourceDao;Lcom/friday/document/service/FileManager;)V

    .line 284
    .line 285
    .line 286
    return-object v0

    .line 287
    :pswitch_7
    new-instance v0, Lcom/friday/main/viewmodel/SearchViewModel;

    .line 288
    .line 289
    iget-object v1, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 290
    .line 291
    iget-object v1, v1, Lw1/g$h;->m:Lgc/f;

    .line 292
    .line 293
    invoke-interface {v1}, Lpc/a;->get()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    check-cast v1, Lcom/friday/common/dao/FileDao;

    .line 298
    .line 299
    iget-object v2, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 300
    .line 301
    iget-object v2, v2, Lw1/g$h;->C:Lgc/f;

    .line 302
    .line 303
    invoke-interface {v2}, Lpc/a;->get()Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    check-cast v2, Lj2/d;

    .line 308
    .line 309
    iget-object v3, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 310
    .line 311
    iget-object v3, v3, Lw1/g$h;->t:Lgc/f;

    .line 312
    .line 313
    invoke-interface {v3}, Lpc/a;->get()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v3

    .line 317
    check-cast v3, Lu3/b;

    .line 318
    .line 319
    iget-object v4, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 320
    .line 321
    iget-object v4, v4, Lw1/g$h;->k:Lgc/f;

    .line 322
    .line 323
    invoke-interface {v4}, Lpc/a;->get()Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v4

    .line 327
    check-cast v4, Lcom/friday/common/dao/ResourceDao;

    .line 328
    .line 329
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/friday/main/viewmodel/SearchViewModel;-><init>(Lcom/friday/common/dao/FileDao;Lj2/d;Lu3/b;Lcom/friday/common/dao/ResourceDao;)V

    .line 330
    .line 331
    .line 332
    return-object v0

    .line 333
    :pswitch_8
    new-instance v0, Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 334
    .line 335
    iget-object v1, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 336
    .line 337
    iget-object v1, v1, Lw1/g$h;->m:Lgc/f;

    .line 338
    .line 339
    invoke-interface {v1}, Lpc/a;->get()Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v1

    .line 343
    check-cast v1, Lcom/friday/common/dao/FileDao;

    .line 344
    .line 345
    iget-object v2, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 346
    .line 347
    iget-object v2, v2, Lw1/g$h;->k:Lgc/f;

    .line 348
    .line 349
    invoke-interface {v2}, Lpc/a;->get()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    check-cast v2, Lcom/friday/common/dao/ResourceDao;

    .line 354
    .line 355
    iget-object v3, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 356
    .line 357
    iget-object v3, v3, Lw1/g$h;->u:Lgc/f;

    .line 358
    .line 359
    invoke-interface {v3}, Lpc/a;->get()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v3

    .line 363
    check-cast v3, Ls2/a;

    .line 364
    .line 365
    iget-object v4, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 366
    .line 367
    iget-object v4, v4, Lw1/g$h;->z:Lgc/f;

    .line 368
    .line 369
    invoke-interface {v4}, Lpc/a;->get()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v4

    .line 373
    check-cast v4, Lcom/friday/document/service/FileManager;

    .line 374
    .line 375
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/friday/document/viewmodel/RecycleBinViewModel;-><init>(Lcom/friday/common/dao/FileDao;Lcom/friday/common/dao/ResourceDao;Ls2/a;Lcom/friday/document/service/FileManager;)V

    .line 376
    .line 377
    .line 378
    return-object v0

    .line 379
    :pswitch_9
    new-instance v0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 380
    .line 381
    iget-object v1, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 382
    .line 383
    iget-object v1, v1, Lw1/g$h;->E:Lgc/f;

    .line 384
    .line 385
    invoke-interface {v1}, Lpc/a;->get()Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    check-cast v1, Lpa/a;

    .line 390
    .line 391
    iget-object v2, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 392
    .line 393
    iget-object v2, v2, Lw1/g$h;->v:Lgc/f;

    .line 394
    .line 395
    invoke-interface {v2}, Lpc/a;->get()Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v2

    .line 399
    check-cast v2, Ld2/i;

    .line 400
    .line 401
    iget-object v3, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 402
    .line 403
    iget-object v3, v3, Lw1/g$h;->m:Lgc/f;

    .line 404
    .line 405
    invoke-interface {v3}, Lpc/a;->get()Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v3

    .line 409
    check-cast v3, Lcom/friday/common/dao/FileDao;

    .line 410
    .line 411
    invoke-direct {v0, v1, v2, v3}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;-><init>(Lpa/a;Ld2/i;Lcom/friday/common/dao/FileDao;)V

    .line 412
    .line 413
    .line 414
    return-object v0

    .line 415
    :pswitch_a
    new-instance v0, Lcom/friday/document/viewmodel/PdfViewerViewModel;

    .line 416
    .line 417
    iget-object v1, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 418
    .line 419
    iget-object v1, v1, Lw1/g$h;->D:Lgc/f;

    .line 420
    .line 421
    invoke-interface {v1}, Lpc/a;->get()Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    check-cast v1, Lc2/a1;

    .line 426
    .line 427
    invoke-direct {v0, v1}, Lcom/friday/document/viewmodel/PdfViewerViewModel;-><init>(Lc2/a1;)V

    .line 428
    .line 429
    .line 430
    return-object v0

    .line 431
    :pswitch_b
    new-instance v0, Lcom/friday/paint/viewmodel/PaintViewModel;

    .line 432
    .line 433
    invoke-direct {v0}, Lcom/friday/paint/viewmodel/PaintViewModel;-><init>()V

    .line 434
    .line 435
    .line 436
    return-object v0

    .line 437
    :pswitch_c
    new-instance v0, Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 438
    .line 439
    iget-object v1, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 440
    .line 441
    iget-object v1, v1, Lw1/g$h;->m:Lgc/f;

    .line 442
    .line 443
    invoke-interface {v1}, Lpc/a;->get()Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v1

    .line 447
    check-cast v1, Lcom/friday/common/dao/FileDao;

    .line 448
    .line 449
    iget-object v2, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 450
    .line 451
    iget-object v2, v2, Lw1/g$h;->k:Lgc/f;

    .line 452
    .line 453
    invoke-interface {v2}, Lpc/a;->get()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v2

    .line 457
    check-cast v2, Lcom/friday/common/dao/ResourceDao;

    .line 458
    .line 459
    iget-object v3, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 460
    .line 461
    iget-object v3, v3, Lw1/g$h;->o:Lgc/f;

    .line 462
    .line 463
    invoke-interface {v3}, Lpc/a;->get()Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v3

    .line 467
    check-cast v3, Lcom/friday/common/dao/UserDao;

    .line 468
    .line 469
    iget-object v4, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 470
    .line 471
    iget-object v4, v4, Lw1/g$h;->n:Lgc/f;

    .line 472
    .line 473
    invoke-interface {v4}, Lpc/a;->get()Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v4

    .line 477
    check-cast v4, Lc2/v0;

    .line 478
    .line 479
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/friday/paint/viewmodel/NoteViewModel;-><init>(Lcom/friday/common/dao/FileDao;Lcom/friday/common/dao/ResourceDao;Lcom/friday/common/dao/UserDao;Lc2/v0;)V

    .line 480
    .line 481
    .line 482
    return-object v0

    .line 483
    :pswitch_d
    new-instance v5, Lcom/friday/document/viewmodel/NewestViewModel;

    .line 484
    .line 485
    iget-object v0, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 486
    .line 487
    iget-object v0, v0, Lw1/g$h;->m:Lgc/f;

    .line 488
    .line 489
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v0

    .line 493
    move-object v6, v0

    .line 494
    check-cast v6, Lcom/friday/common/dao/FileDao;

    .line 495
    .line 496
    iget-object v0, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 497
    .line 498
    iget-object v0, v0, Lw1/g$h;->k:Lgc/f;

    .line 499
    .line 500
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    move-object v7, v0

    .line 505
    check-cast v7, Lcom/friday/common/dao/ResourceDao;

    .line 506
    .line 507
    iget-object v0, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 508
    .line 509
    iget-object v0, v0, Lw1/g$h;->u:Lgc/f;

    .line 510
    .line 511
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    move-object v8, v0

    .line 516
    check-cast v8, Ls2/a;

    .line 517
    .line 518
    iget-object v0, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 519
    .line 520
    iget-object v0, v0, Lw1/g$h;->z:Lgc/f;

    .line 521
    .line 522
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    move-object v9, v0

    .line 527
    check-cast v9, Lcom/friday/document/service/FileManager;

    .line 528
    .line 529
    iget-object v0, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 530
    .line 531
    iget-object v0, v0, Lw1/g$h;->A:Lgc/f;

    .line 532
    .line 533
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    move-object v10, v0

    .line 538
    check-cast v10, Lcom/friday/document/repositroy/FileRepository;

    .line 539
    .line 540
    invoke-direct/range {v5 .. v10}, Lcom/friday/document/viewmodel/NewestViewModel;-><init>(Lcom/friday/common/dao/FileDao;Lcom/friday/common/dao/ResourceDao;Ls2/a;Lcom/friday/document/service/FileManager;Lcom/friday/document/repositroy/FileRepository;)V

    .line 541
    .line 542
    .line 543
    return-object v5

    .line 544
    :pswitch_e
    new-instance v6, Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 545
    .line 546
    iget-object v0, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 547
    .line 548
    iget-object v0, v0, Lw1/g$h;->m:Lgc/f;

    .line 549
    .line 550
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object v0

    .line 554
    move-object v7, v0

    .line 555
    check-cast v7, Lcom/friday/common/dao/FileDao;

    .line 556
    .line 557
    iget-object v0, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 558
    .line 559
    iget-object v0, v0, Lw1/g$h;->k:Lgc/f;

    .line 560
    .line 561
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    move-object v8, v0

    .line 566
    check-cast v8, Lcom/friday/common/dao/ResourceDao;

    .line 567
    .line 568
    iget-object v0, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 569
    .line 570
    iget-object v0, v0, Lw1/g$h;->o:Lgc/f;

    .line 571
    .line 572
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    move-object v9, v0

    .line 577
    check-cast v9, Lcom/friday/common/dao/UserDao;

    .line 578
    .line 579
    iget-object v0, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 580
    .line 581
    iget-object v0, v0, Lw1/g$h;->n:Lgc/f;

    .line 582
    .line 583
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    move-object v10, v0

    .line 588
    check-cast v10, Lc2/v0;

    .line 589
    .line 590
    iget-object v0, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 591
    .line 592
    iget-object v0, v0, Lw1/g$h;->C:Lgc/f;

    .line 593
    .line 594
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    move-result-object v0

    .line 598
    move-object v11, v0

    .line 599
    check-cast v11, Lj2/d;

    .line 600
    .line 601
    invoke-direct/range {v6 .. v11}, Lcom/friday/paint/viewmodel/NewNoteViewModel;-><init>(Lcom/friday/common/dao/FileDao;Lcom/friday/common/dao/ResourceDao;Lcom/friday/common/dao/UserDao;Lc2/v0;Lj2/d;)V

    .line 602
    .line 603
    .line 604
    return-object v6

    .line 605
    :pswitch_f
    new-instance v0, Lcom/friday/document/viewmodel/ManualSyncViewModel;

    .line 606
    .line 607
    iget-object v1, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 608
    .line 609
    iget-object v1, v1, Lw1/g$h;->m:Lgc/f;

    .line 610
    .line 611
    invoke-interface {v1}, Lpc/a;->get()Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object v1

    .line 615
    check-cast v1, Lcom/friday/common/dao/FileDao;

    .line 616
    .line 617
    iget-object v2, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 618
    .line 619
    iget-object v2, v2, Lw1/g$h;->z:Lgc/f;

    .line 620
    .line 621
    invoke-interface {v2}, Lpc/a;->get()Ljava/lang/Object;

    .line 622
    .line 623
    .line 624
    move-result-object v2

    .line 625
    check-cast v2, Lcom/friday/document/service/FileManager;

    .line 626
    .line 627
    invoke-direct {v0, v1, v2}, Lcom/friday/document/viewmodel/ManualSyncViewModel;-><init>(Lcom/friday/common/dao/FileDao;Lcom/friday/document/service/FileManager;)V

    .line 628
    .line 629
    .line 630
    return-object v0

    .line 631
    :pswitch_10
    new-instance v0, Lcom/friday/cloudsnote/viewModel/MainViewModel;

    .line 632
    .line 633
    iget-object v1, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 634
    .line 635
    iget-object v1, v1, Lw1/g$h;->o:Lgc/f;

    .line 636
    .line 637
    invoke-interface {v1}, Lpc/a;->get()Ljava/lang/Object;

    .line 638
    .line 639
    .line 640
    move-result-object v1

    .line 641
    check-cast v1, Lcom/friday/common/dao/UserDao;

    .line 642
    .line 643
    iget-object v2, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 644
    .line 645
    iget-object v2, v2, Lw1/g$h;->q:Lgc/f;

    .line 646
    .line 647
    invoke-interface {v2}, Lpc/a;->get()Ljava/lang/Object;

    .line 648
    .line 649
    .line 650
    move-result-object v2

    .line 651
    check-cast v2, Lcom/friday/common/network/StudentSession;

    .line 652
    .line 653
    iget-object v3, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 654
    .line 655
    iget-object v3, v3, Lw1/g$h;->v:Lgc/f;

    .line 656
    .line 657
    invoke-interface {v3}, Lpc/a;->get()Ljava/lang/Object;

    .line 658
    .line 659
    .line 660
    move-result-object v3

    .line 661
    check-cast v3, Ld2/i;

    .line 662
    .line 663
    invoke-direct {v0, v1, v2, v3}, Lcom/friday/cloudsnote/viewModel/MainViewModel;-><init>(Lcom/friday/common/dao/UserDao;Lcom/friday/common/network/StudentSession;Ld2/i;)V

    .line 664
    .line 665
    .line 666
    return-object v0

    .line 667
    :pswitch_11
    new-instance v0, Lcom/friday/login/viewmodel/LoginViewModel;

    .line 668
    .line 669
    iget-object v1, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 670
    .line 671
    iget-object v1, v1, Lw1/g$h;->v:Lgc/f;

    .line 672
    .line 673
    invoke-interface {v1}, Lpc/a;->get()Ljava/lang/Object;

    .line 674
    .line 675
    .line 676
    move-result-object v1

    .line 677
    check-cast v1, Ld2/i;

    .line 678
    .line 679
    iget-object v2, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 680
    .line 681
    iget-object v2, v2, Lw1/g$h;->o:Lgc/f;

    .line 682
    .line 683
    invoke-interface {v2}, Lpc/a;->get()Ljava/lang/Object;

    .line 684
    .line 685
    .line 686
    move-result-object v2

    .line 687
    check-cast v2, Lcom/friday/common/dao/UserDao;

    .line 688
    .line 689
    iget-object v3, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 690
    .line 691
    iget-object v3, v3, Lw1/g$h;->p:Lgc/f;

    .line 692
    .line 693
    invoke-interface {v3}, Lpc/a;->get()Ljava/lang/Object;

    .line 694
    .line 695
    .line 696
    move-result-object v3

    .line 697
    check-cast v3, Lvd/l;

    .line 698
    .line 699
    invoke-direct {v0, v1, v2, v3}, Lcom/friday/login/viewmodel/LoginViewModel;-><init>(Ld2/i;Lcom/friday/common/dao/UserDao;Lvd/l;)V

    .line 700
    .line 701
    .line 702
    return-object v0

    .line 703
    :pswitch_12
    new-instance v0, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;

    .line 704
    .line 705
    invoke-direct {v0}, Lcom/friday/lecture/viewmodel/offline/LectureDialogViewModel;-><init>()V

    .line 706
    .line 707
    .line 708
    return-object v0

    .line 709
    :pswitch_13
    new-instance v1, Lcom/friday/main/viewmodel/HomeViewModel;

    .line 710
    .line 711
    iget-object v0, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 712
    .line 713
    iget-object v0, v0, Lw1/g$h;->B:Lgc/f;

    .line 714
    .line 715
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    move-result-object v0

    .line 719
    move-object v2, v0

    .line 720
    check-cast v2, Lu3/a;

    .line 721
    .line 722
    iget-object v0, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 723
    .line 724
    iget-object v0, v0, Lw1/g$h;->q:Lgc/f;

    .line 725
    .line 726
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 727
    .line 728
    .line 729
    move-result-object v0

    .line 730
    move-object v3, v0

    .line 731
    check-cast v3, Lcom/friday/common/network/StudentSession;

    .line 732
    .line 733
    iget-object v0, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 734
    .line 735
    iget-object v0, v0, Lw1/g$h;->m:Lgc/f;

    .line 736
    .line 737
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 738
    .line 739
    .line 740
    move-result-object v0

    .line 741
    move-object v4, v0

    .line 742
    check-cast v4, Lcom/friday/common/dao/FileDao;

    .line 743
    .line 744
    iget-object v0, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 745
    .line 746
    iget-object v0, v0, Lw1/g$h;->o:Lgc/f;

    .line 747
    .line 748
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 749
    .line 750
    .line 751
    move-result-object v0

    .line 752
    move-object v5, v0

    .line 753
    check-cast v5, Lcom/friday/common/dao/UserDao;

    .line 754
    .line 755
    iget-object v0, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 756
    .line 757
    iget-object v0, v0, Lw1/g$h;->p:Lgc/f;

    .line 758
    .line 759
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 760
    .line 761
    .line 762
    move-result-object v0

    .line 763
    move-object v6, v0

    .line 764
    check-cast v6, Lvd/l;

    .line 765
    .line 766
    iget-object v0, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 767
    .line 768
    iget-object v0, v0, Lw1/g$h;->r:Lgc/f;

    .line 769
    .line 770
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    move-result-object v0

    .line 774
    move-object v7, v0

    .line 775
    check-cast v7, Lvd/k;

    .line 776
    .line 777
    invoke-direct/range {v1 .. v7}, Lcom/friday/main/viewmodel/HomeViewModel;-><init>(Lu3/a;Lcom/friday/common/network/StudentSession;Lcom/friday/common/dao/FileDao;Lcom/friday/common/dao/UserDao;Lvd/l;Lvd/k;)V

    .line 778
    .line 779
    .line 780
    return-object v1

    .line 781
    :pswitch_14
    new-instance v0, Lcom/friday/main/viewmodel/FullScreenViewModel;

    .line 782
    .line 783
    iget-object v1, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 784
    .line 785
    iget-object v1, v1, Lw1/g$h;->m:Lgc/f;

    .line 786
    .line 787
    invoke-interface {v1}, Lpc/a;->get()Ljava/lang/Object;

    .line 788
    .line 789
    .line 790
    move-result-object v1

    .line 791
    check-cast v1, Lcom/friday/common/dao/FileDao;

    .line 792
    .line 793
    iget-object v2, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 794
    .line 795
    iget-object v2, v2, Lw1/g$h;->k:Lgc/f;

    .line 796
    .line 797
    invoke-interface {v2}, Lpc/a;->get()Ljava/lang/Object;

    .line 798
    .line 799
    .line 800
    move-result-object v2

    .line 801
    check-cast v2, Lcom/friday/common/dao/ResourceDao;

    .line 802
    .line 803
    iget-object v3, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 804
    .line 805
    iget-object v3, v3, Lw1/g$h;->l:Lgc/f;

    .line 806
    .line 807
    invoke-interface {v3}, Lpc/a;->get()Ljava/lang/Object;

    .line 808
    .line 809
    .line 810
    move-result-object v3

    .line 811
    check-cast v3, Lc2/g2;

    .line 812
    .line 813
    invoke-direct {v0, v1, v2, v3}, Lcom/friday/main/viewmodel/FullScreenViewModel;-><init>(Lcom/friday/common/dao/FileDao;Lcom/friday/common/dao/ResourceDao;Lc2/g2;)V

    .line 814
    .line 815
    .line 816
    return-object v0

    .line 817
    :pswitch_15
    new-instance v4, Lcom/friday/document/viewmodel/FolderViewModel;

    .line 818
    .line 819
    iget-object v0, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 820
    .line 821
    iget-object v0, v0, Lw1/g$h;->m:Lgc/f;

    .line 822
    .line 823
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 824
    .line 825
    .line 826
    move-result-object v0

    .line 827
    move-object v5, v0

    .line 828
    check-cast v5, Lcom/friday/common/dao/FileDao;

    .line 829
    .line 830
    iget-object v0, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 831
    .line 832
    iget-object v0, v0, Lw1/g$h;->k:Lgc/f;

    .line 833
    .line 834
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 835
    .line 836
    .line 837
    move-result-object v0

    .line 838
    move-object v6, v0

    .line 839
    check-cast v6, Lcom/friday/common/dao/ResourceDao;

    .line 840
    .line 841
    iget-object v0, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 842
    .line 843
    iget-object v0, v0, Lw1/g$h;->u:Lgc/f;

    .line 844
    .line 845
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 846
    .line 847
    .line 848
    move-result-object v0

    .line 849
    move-object v7, v0

    .line 850
    check-cast v7, Ls2/a;

    .line 851
    .line 852
    iget-object v0, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 853
    .line 854
    iget-object v0, v0, Lw1/g$h;->z:Lgc/f;

    .line 855
    .line 856
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 857
    .line 858
    .line 859
    move-result-object v0

    .line 860
    move-object v8, v0

    .line 861
    check-cast v8, Lcom/friday/document/service/FileManager;

    .line 862
    .line 863
    iget-object v0, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 864
    .line 865
    iget-object v0, v0, Lw1/g$h;->A:Lgc/f;

    .line 866
    .line 867
    invoke-interface {v0}, Lpc/a;->get()Ljava/lang/Object;

    .line 868
    .line 869
    .line 870
    move-result-object v0

    .line 871
    move-object v9, v0

    .line 872
    check-cast v9, Lcom/friday/document/repositroy/FileRepository;

    .line 873
    .line 874
    invoke-direct/range {v4 .. v9}, Lcom/friday/document/viewmodel/FolderViewModel;-><init>(Lcom/friday/common/dao/FileDao;Lcom/friday/common/dao/ResourceDao;Ls2/a;Lcom/friday/document/service/FileManager;Lcom/friday/document/repositroy/FileRepository;)V

    .line 875
    .line 876
    .line 877
    return-object v4

    .line 878
    :pswitch_16
    new-instance v0, Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 879
    .line 880
    iget-object v1, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 881
    .line 882
    iget-object v1, v1, Lw1/g$h;->m:Lgc/f;

    .line 883
    .line 884
    invoke-interface {v1}, Lpc/a;->get()Ljava/lang/Object;

    .line 885
    .line 886
    .line 887
    move-result-object v1

    .line 888
    check-cast v1, Lcom/friday/common/dao/FileDao;

    .line 889
    .line 890
    iget-object v2, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 891
    .line 892
    iget-object v2, v2, Lw1/g$h;->k:Lgc/f;

    .line 893
    .line 894
    invoke-interface {v2}, Lpc/a;->get()Ljava/lang/Object;

    .line 895
    .line 896
    .line 897
    move-result-object v2

    .line 898
    check-cast v2, Lcom/friday/common/dao/ResourceDao;

    .line 899
    .line 900
    iget-object v3, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 901
    .line 902
    iget-object v3, v3, Lw1/g$h;->n:Lgc/f;

    .line 903
    .line 904
    invoke-interface {v3}, Lpc/a;->get()Ljava/lang/Object;

    .line 905
    .line 906
    .line 907
    move-result-object v3

    .line 908
    check-cast v3, Lc2/v0;

    .line 909
    .line 910
    iget-object v4, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 911
    .line 912
    iget-object v4, v4, Lw1/g$h;->t:Lgc/f;

    .line 913
    .line 914
    invoke-interface {v4}, Lpc/a;->get()Ljava/lang/Object;

    .line 915
    .line 916
    .line 917
    move-result-object v4

    .line 918
    check-cast v4, Lu3/b;

    .line 919
    .line 920
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/friday/main/viewmodel/FolderMoveViewModel;-><init>(Lcom/friday/common/dao/FileDao;Lcom/friday/common/dao/ResourceDao;Lc2/v0;Lu3/b;)V

    .line 921
    .line 922
    .line 923
    return-object v0

    .line 924
    :pswitch_17
    new-instance v0, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 925
    .line 926
    iget-object v1, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 927
    .line 928
    iget-object v1, v1, Lw1/g$h;->o:Lgc/f;

    .line 929
    .line 930
    invoke-interface {v1}, Lpc/a;->get()Ljava/lang/Object;

    .line 931
    .line 932
    .line 933
    move-result-object v1

    .line 934
    check-cast v1, Lcom/friday/common/dao/UserDao;

    .line 935
    .line 936
    invoke-direct {v0, v1}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;-><init>(Lcom/friday/common/dao/UserDao;)V

    .line 937
    .line 938
    .line 939
    return-object v0

    .line 940
    :pswitch_18
    new-instance v0, Lcom/friday/main/viewmodel/DbViewModel;

    .line 941
    .line 942
    iget-object v1, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 943
    .line 944
    iget-object v1, v1, Lw1/g$h;->m:Lgc/f;

    .line 945
    .line 946
    invoke-interface {v1}, Lpc/a;->get()Ljava/lang/Object;

    .line 947
    .line 948
    .line 949
    move-result-object v1

    .line 950
    check-cast v1, Lcom/friday/common/dao/FileDao;

    .line 951
    .line 952
    iget-object v2, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 953
    .line 954
    iget-object v2, v2, Lw1/g$h;->k:Lgc/f;

    .line 955
    .line 956
    invoke-interface {v2}, Lpc/a;->get()Ljava/lang/Object;

    .line 957
    .line 958
    .line 959
    move-result-object v2

    .line 960
    check-cast v2, Lcom/friday/common/dao/ResourceDao;

    .line 961
    .line 962
    iget-object v3, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 963
    .line 964
    iget-object v3, v3, Lw1/g$h;->l:Lgc/f;

    .line 965
    .line 966
    invoke-interface {v3}, Lpc/a;->get()Ljava/lang/Object;

    .line 967
    .line 968
    .line 969
    move-result-object v3

    .line 970
    check-cast v3, Lc2/g2;

    .line 971
    .line 972
    iget-object v4, p0, Lw1/g$j$a;->a:Lw1/g$h;

    .line 973
    .line 974
    iget-object v4, v4, Lw1/g$h;->n:Lgc/f;

    .line 975
    .line 976
    invoke-interface {v4}, Lpc/a;->get()Ljava/lang/Object;

    .line 977
    .line 978
    .line 979
    move-result-object v4

    .line 980
    check-cast v4, Lc2/v0;

    .line 981
    .line 982
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/friday/main/viewmodel/DbViewModel;-><init>(Lcom/friday/common/dao/FileDao;Lcom/friday/common/dao/ResourceDao;Lc2/g2;Lc2/v0;)V

    .line 983
    .line 984
    .line 985
    return-object v0

    .line 986
    :pswitch_19
    new-instance v0, Lcom/friday/common/camera/CameraViewModel;

    .line 987
    .line 988
    invoke-direct {v0}, Lcom/friday/common/camera/CameraViewModel;-><init>()V

    .line 989
    .line 990
    .line 991
    return-object v0

    .line 992
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
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
