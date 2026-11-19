# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class public final Lcom/zykj/study/a$h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll6/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/study/a$h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lcom/zykj/study/a$h;

.field public final b:I


# direct methods
.method public constructor <init>(Lcom/zykj/study/a$h;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 5
    .line 6
    iput p2, p0, Lcom/zykj/study/a$h$a;->b:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lcom/zykj/study/a$h$a;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/AssertionError;

    .line 7
    .line 8
    iget v1, p0, Lcom/zykj/study/a$h$a;->b:I

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(I)V

    .line 11
    .line 12
    .line 13
    throw v0

    .line 14
    :pswitch_0
    iget-object v0, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 15
    .line 16
    invoke-static {v0}, Lcom/zykj/study/a$h;->d(Lcom/zykj/study/a$h;)Lj6/a;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, Lj6/b;->a(Lj6/a;)Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, Lu3/b;->a(Landroid/content/Context;)Landroidx/datastore/core/DataStore;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0

    .line 29
    :pswitch_1
    iget-object v0, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 30
    .line 31
    invoke-static {v0}, Lcom/zykj/study/a$h;->f(Lcom/zykj/study/a$h;)Lcom/zykj/study/provide/GlobalObjectProvide;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-object v1, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 36
    .line 37
    iget-object v1, v1, Lcom/zykj/study/a$h;->E:Ll6/f;

    .line 38
    .line 39
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Lo4/k;

    .line 44
    .line 45
    invoke-static {v0, v1}, Ls4/v;->a(Lcom/zykj/study/provide/GlobalObjectProvide;Lo4/k;)Lv3/a;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    return-object v0

    .line 50
    :pswitch_2
    new-instance v0, Lt4/g;

    .line 51
    .line 52
    iget-object v1, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 53
    .line 54
    iget-object v1, v1, Lcom/zykj/study/a$h;->l:Ll6/f;

    .line 55
    .line 56
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, Lo4/b;

    .line 61
    .line 62
    invoke-direct {v0, v1}, Lt4/g;-><init>(Lo4/b;)V

    .line 63
    .line 64
    .line 65
    return-object v0

    .line 66
    :pswitch_3
    iget-object v0, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 67
    .line 68
    invoke-static {v0}, Lcom/zykj/study/a$h;->e(Lcom/zykj/study/a$h;)Ls4/o;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iget-object v1, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 73
    .line 74
    iget-object v1, v1, Lcom/zykj/study/a$h;->u:Ll6/f;

    .line 75
    .line 76
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    check-cast v1, Lcom/zykj/study/data/AppDatabase;

    .line 81
    .line 82
    invoke-static {v0, v1}, Ls4/t;->a(Ls4/o;Lcom/zykj/study/data/AppDatabase;)Lcom/zykj/study/data/SearchHistoryEntityDao;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    return-object v0

    .line 87
    :pswitch_4
    new-instance v0, Lcom/zykj/study/repository/SearchHistoryRepository;

    .line 88
    .line 89
    iget-object v1, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 90
    .line 91
    iget-object v1, v1, Lcom/zykj/study/a$h;->L:Ll6/f;

    .line 92
    .line 93
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    check-cast v1, Lcom/zykj/study/data/SearchHistoryEntityDao;

    .line 98
    .line 99
    invoke-direct {v0, v1}, Lcom/zykj/study/repository/SearchHistoryRepository;-><init>(Lcom/zykj/study/data/SearchHistoryEntityDao;)V

    .line 100
    .line 101
    .line 102
    return-object v0

    .line 103
    :pswitch_5
    iget-object v0, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 104
    .line 105
    invoke-static {v0}, Lcom/zykj/study/a$h;->e(Lcom/zykj/study/a$h;)Ls4/o;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    iget-object v1, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 110
    .line 111
    iget-object v1, v1, Lcom/zykj/study/a$h;->u:Ll6/f;

    .line 112
    .line 113
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    check-cast v1, Lcom/zykj/study/data/AppDatabase;

    .line 118
    .line 119
    invoke-static {v0, v1}, Ls4/r;->a(Ls4/o;Lcom/zykj/study/data/AppDatabase;)Lcom/zykj/study/data/PdfDao;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    return-object v0

    .line 124
    :pswitch_6
    iget-object v0, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 125
    .line 126
    invoke-virtual {v0}, Lcom/zykj/study/a$h;->i()Li9/a0;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-static {v0}, Ls4/b;->a(Li9/a0;)Lo4/f;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    return-object v0

    .line 135
    :pswitch_7
    new-instance v0, Lt4/k;

    .line 136
    .line 137
    iget-object v1, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 138
    .line 139
    iget-object v1, v1, Lcom/zykj/study/a$h;->I:Ll6/f;

    .line 140
    .line 141
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    check-cast v1, Lo4/f;

    .line 146
    .line 147
    invoke-direct {v0, v1}, Lt4/k;-><init>(Lo4/f;)V

    .line 148
    .line 149
    .line 150
    return-object v0

    .line 151
    :pswitch_8
    iget-object v0, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 152
    .line 153
    invoke-virtual {v0}, Lcom/zykj/study/a$h;->i()Li9/a0;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-static {v0}, Ls4/g;->a(Li9/a0;)Lo4/g;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    return-object v0

    .line 162
    :pswitch_9
    new-instance v0, Lcom/zykj/study/repository/QuickCodeRepository;

    .line 163
    .line 164
    iget-object v1, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 165
    .line 166
    iget-object v1, v1, Lcom/zykj/study/a$h;->G:Ll6/f;

    .line 167
    .line 168
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    check-cast v1, Lo4/g;

    .line 173
    .line 174
    invoke-direct {v0, v1}, Lcom/zykj/study/repository/QuickCodeRepository;-><init>(Lo4/g;)V

    .line 175
    .line 176
    .line 177
    return-object v0

    .line 178
    :pswitch_a
    iget-object v0, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 179
    .line 180
    invoke-virtual {v0}, Lcom/zykj/study/a$h;->i()Li9/a0;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-static {v0}, Ls4/i;->a(Li9/a0;)Lo4/i;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    return-object v0

    .line 189
    :pswitch_b
    iget-object v0, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 190
    .line 191
    invoke-virtual {v0}, Lcom/zykj/study/a$h;->i()Li9/a0;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-static {v0}, Ls4/l;->a(Li9/a0;)Lo4/k;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    return-object v0

    .line 200
    :pswitch_c
    iget-object v0, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 201
    .line 202
    invoke-static {v0}, Lcom/zykj/study/a$h;->d(Lcom/zykj/study/a$h;)Lj6/a;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-static {v0}, Lj6/b;->a(Lj6/a;)Landroid/content/Context;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-static {v0}, Ls4/x;->a(Landroid/content/Context;)Lcom/zykj/study/bean/DataStoreManager;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    return-object v0

    .line 215
    :pswitch_d
    iget-object v0, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 216
    .line 217
    invoke-virtual {v0}, Lcom/zykj/study/a$h;->i()Li9/a0;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-static {v0}, Ls4/e;->a(Li9/a0;)Lo4/c;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    return-object v0

    .line 226
    :pswitch_e
    iget-object v0, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 227
    .line 228
    invoke-static {v0}, Lcom/zykj/study/a$h;->e(Lcom/zykj/study/a$h;)Ls4/o;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    iget-object v1, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 233
    .line 234
    iget-object v1, v1, Lcom/zykj/study/a$h;->u:Ll6/f;

    .line 235
    .line 236
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    check-cast v1, Lcom/zykj/study/data/AppDatabase;

    .line 241
    .line 242
    invoke-static {v0, v1}, Ls4/u;->a(Ls4/o;Lcom/zykj/study/data/AppDatabase;)Lcom/zykj/study/data/SubjectEntityDao;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    return-object v0

    .line 247
    :pswitch_f
    iget-object v0, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 248
    .line 249
    invoke-static {v0}, Lcom/zykj/study/a$h;->e(Lcom/zykj/study/a$h;)Ls4/o;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    iget-object v1, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 254
    .line 255
    iget-object v1, v1, Lcom/zykj/study/a$h;->u:Ll6/f;

    .line 256
    .line 257
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    check-cast v1, Lcom/zykj/study/data/AppDatabase;

    .line 262
    .line 263
    invoke-static {v0, v1}, Ls4/q;->a(Ls4/o;Lcom/zykj/study/data/AppDatabase;)Lcom/zykj/study/data/GradeEntityDao;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    return-object v0

    .line 268
    :pswitch_10
    iget-object v0, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 269
    .line 270
    invoke-static {v0}, Lcom/zykj/study/a$h;->e(Lcom/zykj/study/a$h;)Ls4/o;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    iget-object v1, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 275
    .line 276
    iget-object v1, v1, Lcom/zykj/study/a$h;->u:Ll6/f;

    .line 277
    .line 278
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    check-cast v1, Lcom/zykj/study/data/AppDatabase;

    .line 283
    .line 284
    invoke-static {v0, v1}, Ls4/s;->a(Ls4/o;Lcom/zykj/study/data/AppDatabase;)Lcom/zykj/study/data/PeriodEntityDao;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    return-object v0

    .line 289
    :pswitch_11
    new-instance v1, Lcom/zykj/study/repository/DictRepository;

    .line 290
    .line 291
    iget-object v0, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 292
    .line 293
    iget-object v0, v0, Lcom/zykj/study/a$h;->u:Ll6/f;

    .line 294
    .line 295
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    move-object v2, v0

    .line 300
    check-cast v2, Lcom/zykj/study/data/AppDatabase;

    .line 301
    .line 302
    iget-object v0, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 303
    .line 304
    iget-object v0, v0, Lcom/zykj/study/a$h;->y:Ll6/f;

    .line 305
    .line 306
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    move-object v3, v0

    .line 311
    check-cast v3, Lcom/zykj/study/data/PeriodEntityDao;

    .line 312
    .line 313
    iget-object v0, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 314
    .line 315
    iget-object v0, v0, Lcom/zykj/study/a$h;->z:Ll6/f;

    .line 316
    .line 317
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    move-object v4, v0

    .line 322
    check-cast v4, Lcom/zykj/study/data/GradeEntityDao;

    .line 323
    .line 324
    iget-object v0, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 325
    .line 326
    iget-object v0, v0, Lcom/zykj/study/a$h;->A:Ll6/f;

    .line 327
    .line 328
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    move-object v5, v0

    .line 333
    check-cast v5, Lcom/zykj/study/data/SubjectEntityDao;

    .line 334
    .line 335
    iget-object v0, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 336
    .line 337
    iget-object v0, v0, Lcom/zykj/study/a$h;->B:Ll6/f;

    .line 338
    .line 339
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    move-object v6, v0

    .line 344
    check-cast v6, Lo4/c;

    .line 345
    .line 346
    invoke-direct/range {v1 .. v6}, Lcom/zykj/study/repository/DictRepository;-><init>(Lcom/zykj/study/data/AppDatabase;Lcom/zykj/study/data/PeriodEntityDao;Lcom/zykj/study/data/GradeEntityDao;Lcom/zykj/study/data/SubjectEntityDao;Lo4/c;)V

    .line 347
    .line 348
    .line 349
    return-object v1

    .line 350
    :pswitch_12
    iget-object v0, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 351
    .line 352
    invoke-virtual {v0}, Lcom/zykj/study/a$h;->i()Li9/a0;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    invoke-static {v0}, Ls4/j;->a(Li9/a0;)Lo4/j;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    return-object v0

    .line 361
    :pswitch_13
    new-instance v0, Lcom/zykj/study/repository/TeachCourseRepository;

    .line 362
    .line 363
    iget-object v1, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 364
    .line 365
    iget-object v1, v1, Lcom/zykj/study/a$h;->w:Ll6/f;

    .line 366
    .line 367
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    check-cast v1, Lo4/j;

    .line 372
    .line 373
    invoke-direct {v0, v1}, Lcom/zykj/study/repository/TeachCourseRepository;-><init>(Lo4/j;)V

    .line 374
    .line 375
    .line 376
    return-object v0

    .line 377
    :pswitch_14
    iget-object v0, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 378
    .line 379
    invoke-static {v0}, Lcom/zykj/study/a$h;->e(Lcom/zykj/study/a$h;)Ls4/o;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    iget-object v1, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 384
    .line 385
    invoke-static {v1}, Lcom/zykj/study/a$h;->d(Lcom/zykj/study/a$h;)Lj6/a;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    invoke-static {v1}, Lj6/b;->a(Lj6/a;)Landroid/content/Context;

    .line 390
    .line 391
    .line 392
    move-result-object v1

    .line 393
    invoke-static {v0, v1}, Ls4/p;->a(Ls4/o;Landroid/content/Context;)Lcom/zykj/study/data/AppDatabase;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    return-object v0

    .line 398
    :pswitch_15
    new-instance v0, Lcom/zykj/study/repository/CourseRepository;

    .line 399
    .line 400
    iget-object v1, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 401
    .line 402
    iget-object v1, v1, Lcom/zykj/study/a$h;->u:Ll6/f;

    .line 403
    .line 404
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    check-cast v1, Lcom/zykj/study/data/AppDatabase;

    .line 409
    .line 410
    iget-object v2, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 411
    .line 412
    iget-object v2, v2, Lcom/zykj/study/a$h;->r:Ll6/f;

    .line 413
    .line 414
    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v2

    .line 418
    check-cast v2, Landroidx/datastore/core/DataStore;

    .line 419
    .line 420
    iget-object v3, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 421
    .line 422
    iget-object v3, v3, Lcom/zykj/study/a$h;->l:Ll6/f;

    .line 423
    .line 424
    invoke-interface {v3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v3

    .line 428
    check-cast v3, Lo4/b;

    .line 429
    .line 430
    invoke-direct {v0, v1, v2, v3}, Lcom/zykj/study/repository/CourseRepository;-><init>(Lcom/zykj/study/data/AppDatabase;Landroidx/datastore/core/DataStore;Lo4/b;)V

    .line 431
    .line 432
    .line 433
    return-object v0

    .line 434
    :pswitch_16
    iget-object v0, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 435
    .line 436
    invoke-virtual {v0}, Lcom/zykj/study/a$h;->i()Li9/a0;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    invoke-static {v0}, Ls4/f;->a(Li9/a0;)Lo4/d;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    return-object v0

    .line 445
    :pswitch_17
    new-instance v0, Lcom/zykj/study/repository/ExerciseRepository;

    .line 446
    .line 447
    iget-object v1, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 448
    .line 449
    iget-object v1, v1, Lcom/zykj/study/a$h;->l:Ll6/f;

    .line 450
    .line 451
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v1

    .line 455
    check-cast v1, Lo4/b;

    .line 456
    .line 457
    iget-object v2, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 458
    .line 459
    iget-object v2, v2, Lcom/zykj/study/a$h;->s:Ll6/f;

    .line 460
    .line 461
    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v2

    .line 465
    check-cast v2, Lo4/d;

    .line 466
    .line 467
    invoke-direct {v0, v1, v2}, Lcom/zykj/study/repository/ExerciseRepository;-><init>(Lo4/b;Lo4/d;)V

    .line 468
    .line 469
    .line 470
    return-object v0

    .line 471
    :pswitch_18
    iget-object v0, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 472
    .line 473
    invoke-static {v0}, Lcom/zykj/study/a$h;->d(Lcom/zykj/study/a$h;)Lj6/a;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    invoke-static {v0}, Lj6/b;->a(Lj6/a;)Landroid/content/Context;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    invoke-static {v0}, Lm3/c;->a(Landroid/content/Context;)Landroidx/datastore/core/DataStore;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    return-object v0

    .line 486
    :pswitch_19
    new-instance v0, Lcom/zykj/http/interceptor/NetworkInterceptor;

    .line 487
    .line 488
    invoke-direct {v0}, Lcom/zykj/http/interceptor/NetworkInterceptor;-><init>()V

    .line 489
    .line 490
    .line 491
    new-instance v1, Lcom/zykj/http/interceptor/GzipInterceptor;

    .line 492
    .line 493
    invoke-direct {v1}, Lcom/zykj/http/interceptor/GzipInterceptor;-><init>()V

    .line 494
    .line 495
    .line 496
    invoke-static {v0, v1}, Ls4/a0;->a(Lcom/zykj/http/interceptor/NetworkInterceptor;Lcom/zykj/http/interceptor/GzipInterceptor;)Li9/a0;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    return-object v0

    .line 501
    :pswitch_1a
    iget-object v0, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 502
    .line 503
    iget-object v0, v0, Lcom/zykj/study/a$h;->o:Ll6/f;

    .line 504
    .line 505
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    check-cast v0, Li9/a0;

    .line 510
    .line 511
    invoke-static {v0}, Ls4/c;->a(Li9/a0;)Lo4/e;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    return-object v0

    .line 516
    :pswitch_1b
    iget-object v0, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 517
    .line 518
    invoke-virtual {v0}, Lcom/zykj/study/a$h;->h()Li9/a0;

    .line 519
    .line 520
    .line 521
    move-result-object v0

    .line 522
    invoke-static {v0}, Ls4/k;->a(Li9/a0;)Lo4/a;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    return-object v0

    .line 527
    :pswitch_1c
    new-instance v0, Lcom/zykj/study/provide/AccountRepositoryImp;

    .line 528
    .line 529
    iget-object v1, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 530
    .line 531
    iget-object v1, v1, Lcom/zykj/study/a$h;->n:Ll6/f;

    .line 532
    .line 533
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v1

    .line 537
    check-cast v1, Lo4/a;

    .line 538
    .line 539
    iget-object v2, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 540
    .line 541
    iget-object v2, v2, Lcom/zykj/study/a$h;->p:Ll6/f;

    .line 542
    .line 543
    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v2

    .line 547
    check-cast v2, Lo4/e;

    .line 548
    .line 549
    iget-object v3, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 550
    .line 551
    iget-object v3, v3, Lcom/zykj/study/a$h;->h:Ll6/f;

    .line 552
    .line 553
    invoke-interface {v3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    move-result-object v3

    .line 557
    check-cast v3, Ll8/h;

    .line 558
    .line 559
    iget-object v4, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 560
    .line 561
    iget-object v4, v4, Lcom/zykj/study/a$h;->e:Ll6/f;

    .line 562
    .line 563
    invoke-interface {v4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    move-result-object v4

    .line 567
    check-cast v4, Lcom/zykj/study/bean/ClientCodeLiveData;

    .line 568
    .line 569
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/zykj/study/provide/AccountRepositoryImp;-><init>(Lo4/a;Lo4/e;Ll8/h;Lcom/zykj/study/bean/ClientCodeLiveData;)V

    .line 570
    .line 571
    .line 572
    return-object v0

    .line 573
    :pswitch_1d
    iget-object v0, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 574
    .line 575
    invoke-static {v0}, Lcom/zykj/study/a$h;->d(Lcom/zykj/study/a$h;)Lj6/a;

    .line 576
    .line 577
    .line 578
    move-result-object v0

    .line 579
    invoke-static {v0}, Lj6/b;->a(Lj6/a;)Landroid/content/Context;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    invoke-static {v0}, Lm3/b;->a(Landroid/content/Context;)Landroidx/datastore/core/DataStore;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    return-object v0

    .line 588
    :pswitch_1e
    iget-object v0, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 589
    .line 590
    invoke-virtual {v0}, Lcom/zykj/study/a$h;->p()Li9/a0;

    .line 591
    .line 592
    .line 593
    move-result-object v0

    .line 594
    invoke-static {v0}, Ls4/h;->a(Li9/a0;)Lo4/h;

    .line 595
    .line 596
    .line 597
    move-result-object v0

    .line 598
    return-object v0

    .line 599
    :pswitch_1f
    iget-object v0, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 600
    .line 601
    iget-object v0, v0, Lcom/zykj/study/a$h;->i:Ll6/f;

    .line 602
    .line 603
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    check-cast v0, Lo4/h;

    .line 608
    .line 609
    iget-object v1, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 610
    .line 611
    iget-object v1, v1, Lcom/zykj/study/a$h;->j:Ll6/f;

    .line 612
    .line 613
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    move-result-object v1

    .line 617
    check-cast v1, Landroidx/datastore/core/DataStore;

    .line 618
    .line 619
    iget-object v2, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 620
    .line 621
    iget-object v2, v2, Lcom/zykj/study/a$h;->f:Ll6/f;

    .line 622
    .line 623
    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    move-result-object v2

    .line 627
    check-cast v2, Ll8/g;

    .line 628
    .line 629
    iget-object v3, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 630
    .line 631
    iget-object v3, v3, Lcom/zykj/study/a$h;->h:Ll6/f;

    .line 632
    .line 633
    invoke-interface {v3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    move-result-object v3

    .line 637
    check-cast v3, Ll8/h;

    .line 638
    .line 639
    iget-object v4, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 640
    .line 641
    iget-object v4, v4, Lcom/zykj/study/a$h;->e:Ll6/f;

    .line 642
    .line 643
    invoke-interface {v4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 644
    .line 645
    .line 646
    move-result-object v4

    .line 647
    check-cast v4, Lcom/zykj/study/bean/ClientCodeLiveData;

    .line 648
    .line 649
    invoke-static {v0, v1, v2, v3, v4}, Ls4/z;->a(Lo4/h;Landroidx/datastore/core/DataStore;Ll8/g;Ll8/h;Lcom/zykj/study/bean/ClientCodeLiveData;)Li3/a;

    .line 650
    .line 651
    .line 652
    move-result-object v0

    .line 653
    return-object v0

    .line 654
    :pswitch_20
    invoke-static {}, Ls4/d0;->a()Ll8/h;

    .line 655
    .line 656
    .line 657
    move-result-object v0

    .line 658
    return-object v0

    .line 659
    :pswitch_21
    iget-object v0, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 660
    .line 661
    invoke-virtual {v0}, Lcom/zykj/study/a$h;->i()Li9/a0;

    .line 662
    .line 663
    .line 664
    move-result-object v0

    .line 665
    invoke-static {v0}, Ls4/d;->a(Li9/a0;)Lo4/b;

    .line 666
    .line 667
    .line 668
    move-result-object v0

    .line 669
    return-object v0

    .line 670
    :pswitch_22
    new-instance v0, Lt4/a;

    .line 671
    .line 672
    iget-object v1, p0, Lcom/zykj/study/a$h$a;->a:Lcom/zykj/study/a$h;

    .line 673
    .line 674
    iget-object v1, v1, Lcom/zykj/study/a$h;->l:Ll6/f;

    .line 675
    .line 676
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 677
    .line 678
    .line 679
    move-result-object v1

    .line 680
    check-cast v1, Lo4/b;

    .line 681
    .line 682
    invoke-direct {v0, v1}, Lt4/a;-><init>(Lo4/b;)V

    .line 683
    .line 684
    .line 685
    return-object v0

    .line 686
    :pswitch_23
    invoke-static {}, Ls4/e0;->a()Ll8/g;

    .line 687
    .line 688
    .line 689
    move-result-object v0

    .line 690
    return-object v0

    .line 691
    :pswitch_24
    invoke-static {}, Ls4/g0;->a()Ll8/g;

    .line 692
    .line 693
    .line 694
    move-result-object v0

    .line 695
    return-object v0

    .line 696
    :pswitch_25
    invoke-static {}, Ls4/y;->a()Lcom/zykj/study/bean/ClientCodeLiveData;

    .line 697
    .line 698
    .line 699
    move-result-object v0

    .line 700
    return-object v0

    .line 701
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
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
