# RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。
.class public final Lcom/zykj/blackboard/core/edit/BoardControl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/core/edit/IBoardControl;


# instance fields
.field public final a:Lw9/h;

.field public final b:Ljava/util/List;

.field public c:Lq9/b;

.field public d:I

.field public e:Ljava/lang/String;

.field public final f:Lqc/d;


# direct methods
.method public constructor <init>(IILw9/h;)V
    .locals 1

    .line 1
    const-string v0, "renderLayer"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p3, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->a:Lw9/h;

    .line 10
    .line 11
    new-instance p3, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p3, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->b:Ljava/util/List;

    .line 17
    .line 18
    new-instance p3, Lq9/b;

    .line 19
    .line 20
    invoke-direct {p3, p1, p2}, Lq9/b;-><init>(II)V

    .line 21
    .line 22
    .line 23
    iput-object p3, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->c:Lq9/b;

    .line 24
    .line 25
    const/4 p1, -0x1

    .line 26
    iput p1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->d:I

    .line 27
    .line 28
    const-string p1, ""

    .line 29
    .line 30
    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->e:Ljava/lang/String;

    .line 31
    .line 32
    sget-object p1, Lcom/zykj/blackboard/core/edit/BoardControl$singleExecutor$2;->c:Lcom/zykj/blackboard/core/edit/BoardControl$singleExecutor$2;

    .line 33
    .line 34
    invoke-static {p1}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->f:Lqc/d;

    .line 39
    .line 40
    return-void
.end method

.method public static final A(Ljava/util/ArrayList;Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lhd/l;ZLhd/l;Z)V
    .locals 5

    .line 1
    const-string v0, "$pagesSnapshot"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$boardDirPath"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "this$0"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string p2, "$error"

    .line 17
    .line 18
    invoke-static {p3, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string p2, "$callback"

    .line 22
    .line 23
    invoke-static {p5, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    const-string v0, "\u9875\u9762 BoardControl.kt -> save\uff0c\u6570\u636e\u4fdd\u5b58\u5931\u8d25\uff0c\u76ee\u5f55="

    .line 31
    .line 32
    if-eqz p2, :cond_0

    .line 33
    .line 34
    new-instance p0, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string p1, "\uff0c\u539f\u56e0=\u9875\u9762\u5df2\u88ab\u56de\u6536\u6216\u6570\u636e\u4e0d\u5b8c\u6574"

    .line 46
    .line 47
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {p0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_0
    sget-object p2, Lna/d;->a:Lna/d;

    .line 63
    .line 64
    invoke-virtual {p2}, Lna/d;->f()Lio/objectbox/BoxStore;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    const-class v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 69
    .line 70
    invoke-virtual {p2, v1}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    const-string v1, "BoardBox.boxStore.boxFor\u2026kBoardEntity::class.java)"

    .line 75
    .line 76
    invoke-static {p2, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2}, Ljc/a;->o()Lio/objectbox/query/QueryBuilder;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    const-string v1, "builder"

    .line 84
    .line 85
    invoke-static {p2, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->h:Lio/objectbox/Property;

    .line 89
    .line 90
    invoke-virtual {p2, v1, p1}, Lio/objectbox/query/QueryBuilder;->g(Lio/objectbox/Property;Ljava/lang/String;)Lio/objectbox/query/QueryBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2}, Lio/objectbox/query/QueryBuilder;->e()Lio/objectbox/query/Query;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    const-string v1, "builder.build()"

    .line 98
    .line 99
    invoke-static {p2, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p2}, Lio/objectbox/query/Query;->n()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    check-cast p2, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 107
    .line 108
    if-nez p2, :cond_1

    .line 109
    .line 110
    new-instance p0, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    const-string p1, "\uff0c\u539f\u56e0=\u9875\u9762\u6570\u636e\u5e93\u5df2\u88ab\u6e05\u7406"

    .line 122
    .line 123
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-static {p0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_1
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    const/4 v2, 0x0

    .line 143
    if-eqz v1, :cond_2

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_2
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    move v3, v2

    .line 151
    :cond_3
    if-ge v3, v1, :cond_4

    .line 152
    .line 153
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    add-int/lit8 v3, v3, 0x1

    .line 158
    .line 159
    check-cast v4, Ly9/m;

    .line 160
    .line 161
    invoke-interface {v4}, Ly9/n;->t()Z

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    if-nez v4, :cond_3

    .line 166
    .line 167
    new-instance p0, Ljava/lang/StringBuilder;

    .line 168
    .line 169
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    const-string p1, "\uff0c\u539f\u56e0=\u6709\u6570\u636e\u6b63\u5728\u4fdd\u5b58\u5230\u6570\u636e\u5e93"

    .line 179
    .line 180
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    invoke-static {p0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    new-instance p0, Ljava/lang/Exception;

    .line 195
    .line 196
    const-string p1, "\u6b63\u5728\u4fdd\u5b58\u6570\u636e\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5"

    .line 197
    .line 198
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-interface {p3, p0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    return-void

    .line 205
    :cond_4
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 206
    .line 207
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 208
    .line 209
    .line 210
    const-string v1, "\u9875\u9762 BoardControl.kt -> save\uff0c\u5f00\u59cb\u67e5\u8be2\u6570\u636e\u5e93\uff0c\u76ee\u5f55="

    .line 211
    .line 212
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    :try_start_0
    sget-object v0, Lna/d;->a:Lna/d;

    .line 230
    .line 231
    invoke-virtual {v0}, Lna/d;->f()Lio/objectbox/BoxStore;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    new-instance v1, Ly9/h;

    .line 236
    .line 237
    invoke-direct {v1, p0, p6}, Ly9/h;-><init>(Ljava/util/ArrayList;Z)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v0, v1}, Lio/objectbox/BoxStore;->I(Ljava/lang/Runnable;)V

    .line 241
    .line 242
    .line 243
    new-instance p6, Ljava/util/ArrayList;

    .line 244
    .line 245
    const/16 v0, 0xa

    .line 246
    .line 247
    invoke-static {p0, v0}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    invoke-direct {p6, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    :goto_1
    if-ge v2, v0, :cond_5

    .line 259
    .line 260
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    add-int/lit8 v2, v2, 0x1

    .line 265
    .line 266
    check-cast v1, Ly9/m;

    .line 267
    .line 268
    invoke-interface {v1}, Ly9/m;->getFileName()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    invoke-interface {p6, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    goto :goto_1

    .line 276
    :catch_0
    move-exception p0

    .line 277
    goto :goto_2

    .line 278
    :cond_5
    sget-object p0, Lx9/c;->a:Lx9/c;

    .line 279
    .line 280
    invoke-virtual {p0, p2, p6}, Lx9/c;->j(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;Ljava/util/List;)V

    .line 281
    .line 282
    .line 283
    if-eqz p4, :cond_6

    .line 284
    .line 285
    new-instance p0, Ljava/lang/StringBuilder;

    .line 286
    .line 287
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 288
    .line 289
    .line 290
    const-string p2, "\u9875\u9762 BoardControl.kt -> save\uff0c\u5f00\u59cb\u6e05\u9664\u6570\u636e\u5e93\uff0c\u76ee\u5f55="

    .line 291
    .line 292
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object p0

    .line 302
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    invoke-static {p0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    sget-object p0, Lna/d;->a:Lna/d;

    .line 310
    .line 311
    const/4 p2, 0x2

    .line 312
    const/4 p4, 0x0

    .line 313
    invoke-static {p0, p1, p4, p2, p4}, Lna/d;->c(Lna/d;Ljava/lang/String;Landroid/content/Context;ILjava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    :cond_6
    new-instance p0, Ljava/lang/StringBuilder;

    .line 317
    .line 318
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 319
    .line 320
    .line 321
    const-string p2, "\u9875\u9762 BoardControl.kt -> save\uff0c\u4fdd\u5b58\u7ed3\u675f\uff0c\u76ee\u5f55="

    .line 322
    .line 323
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object p0

    .line 333
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object p0

    .line 337
    invoke-static {p0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 338
    .line 339
    .line 340
    invoke-interface {p5, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 341
    .line 342
    .line 343
    return-void

    .line 344
    :goto_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 345
    .line 346
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 347
    .line 348
    .line 349
    const-string p2, "\u9875\u9762 BoardControl.kt -> save\uff0c\u6570\u636e\u4fdd\u5b58\u5931\u8d25\uff0c\u5f02\u5e38="

    .line 350
    .line 351
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 355
    .line 356
    .line 357
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object p1

    .line 361
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object p1

    .line 365
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    invoke-interface {p3, p0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    return-void
.end method

.method public static final B(Ljava/util/ArrayList;Z)V
    .locals 8

    .line 1
    const-string v0, "$pagesSnapshot"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    move v2, v1

    .line 12
    :goto_0
    if-ge v2, v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    add-int/lit8 v4, v1, 0x1

    .line 21
    .line 22
    if-gez v1, :cond_0

    .line 23
    .line 24
    invoke-static {}, Lrc/w;->w()V

    .line 25
    .line 26
    .line 27
    :cond_0
    check-cast v3, Ly9/m;

    .line 28
    .line 29
    new-instance v5, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    const-string v6, "\u9875\u9762 BoardControl.kt -> save\uff0c\u7b2c"

    .line 35
    .line 36
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v7, "\u9875\u5feb\u7167\u51c6\u5907\u4fdd\u5b58\uff0c\u6587\u4ef6="

    .line 43
    .line 44
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-interface {v3}, Ly9/m;->getFileName()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-static {v5}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    if-eqz p1, :cond_1

    .line 66
    .line 67
    invoke-interface {v3}, Ly9/n;->s()V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    invoke-interface {v3}, Ly9/n;->save()V

    .line 72
    .line 73
    .line 74
    :goto_1
    new-instance v5, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v1, "\u9875\u5feb\u7167\u4fdd\u5b58\u7ed3\u675f\uff0c\u6587\u4ef6="

    .line 86
    .line 87
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-interface {v3}, Ly9/m;->getFileName()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    move v1, v4

    .line 109
    goto :goto_0

    .line 110
    :cond_2
    return-void
.end method

.method public static final D(Ljava/util/ArrayList;Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lhd/l;Lhd/l;Z)V
    .locals 3

    .line 1
    const-string v0, "$pagesSnapshot"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$boardDirPath"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "this$0"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string p2, "$error"

    .line 17
    .line 18
    invoke-static {p3, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string p2, "$callback"

    .line 22
    .line 23
    invoke-static {p4, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    const-string v0, "\u9875\u9762 BoardControl.kt -> saveAsMdbFmt\uff0c\u6570\u636e\u4fdd\u5b58\u5931\u8d25\uff0c\u76ee\u5f55="

    .line 31
    .line 32
    if-eqz p2, :cond_0

    .line 33
    .line 34
    new-instance p0, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string p1, "\uff0c\u539f\u56e0=\u9875\u9762\u5df2\u88ab\u56de\u6536\u6216\u6570\u636e\u4e0d\u5b8c\u6574"

    .line 46
    .line 47
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {p0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_0
    sget-object p2, Lna/d;->a:Lna/d;

    .line 63
    .line 64
    invoke-virtual {p2}, Lna/d;->f()Lio/objectbox/BoxStore;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    const-class v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 69
    .line 70
    invoke-virtual {p2, v1}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    const-string v1, "BoardBox.boxStore.boxFor\u2026kBoardEntity::class.java)"

    .line 75
    .line 76
    invoke-static {p2, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2}, Ljc/a;->o()Lio/objectbox/query/QueryBuilder;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    const-string v1, "builder"

    .line 84
    .line 85
    invoke-static {p2, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->h:Lio/objectbox/Property;

    .line 89
    .line 90
    invoke-virtual {p2, v1, p1}, Lio/objectbox/query/QueryBuilder;->g(Lio/objectbox/Property;Ljava/lang/String;)Lio/objectbox/query/QueryBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2}, Lio/objectbox/query/QueryBuilder;->e()Lio/objectbox/query/Query;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    const-string v1, "builder.build()"

    .line 98
    .line 99
    invoke-static {p2, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p2}, Lio/objectbox/query/Query;->n()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    check-cast p2, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 107
    .line 108
    if-nez p2, :cond_1

    .line 109
    .line 110
    new-instance p0, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    const-string p1, "\uff0c\u539f\u56e0=\u9875\u9762\u6570\u636e\u5e93\u5df2\u88ab\u6e05\u7406"

    .line 122
    .line 123
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-static {p0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_1
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 139
    .line 140
    .line 141
    move-result p2

    .line 142
    if-eqz p2, :cond_2

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_2
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 146
    .line 147
    .line 148
    move-result p2

    .line 149
    const/4 v1, 0x0

    .line 150
    :cond_3
    if-ge v1, p2, :cond_4

    .line 151
    .line 152
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    add-int/lit8 v1, v1, 0x1

    .line 157
    .line 158
    check-cast v2, Ly9/m;

    .line 159
    .line 160
    invoke-interface {v2}, Ly9/n;->t()Z

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    if-nez v2, :cond_3

    .line 165
    .line 166
    new-instance p0, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    const-string p1, "\uff0c\u539f\u56e0=\u6709\u6570\u636e\u6b63\u5728\u4fdd\u5b58\u5230\u6570\u636e\u5e93"

    .line 178
    .line 179
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    invoke-static {p0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    new-instance p0, Ljava/lang/Exception;

    .line 194
    .line 195
    const-string p1, "\u6b63\u5728\u4fdd\u5b58\u6570\u636e\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5"

    .line 196
    .line 197
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    invoke-interface {p3, p0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    return-void

    .line 204
    :cond_4
    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 205
    .line 206
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 207
    .line 208
    .line 209
    const-string v0, "\u9875\u9762 BoardControl.kt -> saveAsMdbFmt\uff0c\u5f00\u59cb\u67e5\u8be2\u6570\u636e\u5e93\uff0c\u76ee\u5f55="

    .line 210
    .line 211
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object p2

    .line 221
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object p2

    .line 225
    invoke-static {p2}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    :try_start_0
    sget-object p2, Lna/d;->a:Lna/d;

    .line 229
    .line 230
    invoke-virtual {p2}, Lna/d;->f()Lio/objectbox/BoxStore;

    .line 231
    .line 232
    .line 233
    move-result-object p2

    .line 234
    new-instance v0, Ly9/j;

    .line 235
    .line 236
    invoke-direct {v0, p0, p5}, Ly9/j;-><init>(Ljava/util/ArrayList;Z)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {p2, v0}, Lio/objectbox/BoxStore;->I(Ljava/lang/Runnable;)V

    .line 240
    .line 241
    .line 242
    new-instance p0, Ljava/lang/StringBuilder;

    .line 243
    .line 244
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 245
    .line 246
    .line 247
    const-string p2, "\u9875\u9762 BoardControl.kt -> saveAsMdbFmt\uff0c\u4fdd\u5b58\u7ed3\u675f\uff0c\u76ee\u5f55="

    .line 248
    .line 249
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    invoke-static {p0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    invoke-interface {p4, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 267
    .line 268
    .line 269
    return-void

    .line 270
    :catch_0
    move-exception p0

    .line 271
    new-instance p1, Ljava/lang/StringBuilder;

    .line 272
    .line 273
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 274
    .line 275
    .line 276
    const-string p2, "\u9875\u9762 BoardControl.kt -> saveAsMdbFmt\uff0c\u6570\u636e\u4fdd\u5b58\u5931\u8d25\uff0c\u5f02\u5e38="

    .line 277
    .line 278
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object p1

    .line 288
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object p1

    .line 292
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    invoke-interface {p3, p0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    return-void
.end method

.method public static final E(Ljava/util/ArrayList;Z)V
    .locals 8

    .line 1
    const-string v0, "$pagesSnapshot"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    move v2, v1

    .line 12
    :goto_0
    if-ge v2, v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    add-int/lit8 v4, v1, 0x1

    .line 21
    .line 22
    if-gez v1, :cond_0

    .line 23
    .line 24
    invoke-static {}, Lrc/w;->w()V

    .line 25
    .line 26
    .line 27
    :cond_0
    check-cast v3, Ly9/m;

    .line 28
    .line 29
    new-instance v5, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    const-string v6, "\u9875\u9762 BoardControl.kt -> saveAsMdbFmt\uff0c\u7b2c"

    .line 35
    .line 36
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v7, "\u9875\u5feb\u7167\u51c6\u5907\u4fdd\u5b58\uff0c\u6587\u4ef6="

    .line 43
    .line 44
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-interface {v3}, Ly9/m;->getFileName()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-static {v5}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    if-eqz p1, :cond_1

    .line 66
    .line 67
    invoke-interface {v3}, Ly9/n;->s()V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    invoke-interface {v3}, Ly9/n;->save()V

    .line 72
    .line 73
    .line 74
    :goto_1
    new-instance v5, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v1, "\u9875\u5feb\u7167\u4fdd\u5b58\u7ed3\u675f\uff0c\u6587\u4ef6="

    .line 86
    .line 87
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-interface {v3}, Ly9/m;->getFileName()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    move v1, v4

    .line 109
    goto :goto_0

    .line 110
    :cond_2
    return-void
.end method

.method public static synthetic f(Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lhd/p;Lhd/l;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/edit/BoardControl;->u(Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lhd/p;Lhd/l;)V

    return-void
.end method

.method public static synthetic g(Lcom/zykj/blackboard/core/edit/BoardControl;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->y(Lcom/zykj/blackboard/core/edit/BoardControl;)V

    return-void
.end method

.method public static synthetic h(Ljava/util/ArrayList;Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lhd/l;Lhd/l;Z)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/zykj/blackboard/core/edit/BoardControl;->D(Ljava/util/ArrayList;Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lhd/l;Lhd/l;Z)V

    return-void
.end method

.method public static synthetic i(Ljava/util/ArrayList;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/blackboard/core/edit/BoardControl;->B(Ljava/util/ArrayList;Z)V

    return-void
.end method

.method public static synthetic j(Ljava/util/ArrayList;Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lhd/l;ZLhd/l;Z)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lcom/zykj/blackboard/core/edit/BoardControl;->A(Ljava/util/ArrayList;Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lhd/l;ZLhd/l;Z)V

    return-void
.end method

.method public static synthetic k(Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lhd/p;Lhd/l;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/edit/BoardControl;->w(Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lhd/p;Lhd/l;)V

    return-void
.end method

.method public static synthetic l(Ljava/util/ArrayList;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/blackboard/core/edit/BoardControl;->E(Ljava/util/ArrayList;Z)V

    return-void
.end method

.method public static final u(Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lhd/p;Lhd/l;)V
    .locals 6

    .line 1
    const-string v0, "$dirPath"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "this$0"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$callback"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "$error"

    .line 17
    .line 18
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v1, "\u9875\u9762 BoardControl.kt -> loadDir\uff0c\u7ebf\u7a0b\u5f00\u59cb\uff0c\u76ee\u5f55="

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    sget-object v0, Lna/d;->a:Lna/d;

    .line 46
    .line 47
    invoke-virtual {v0}, Lna/d;->f()Lio/objectbox/BoxStore;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-class v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const-string v1, "BoardBox.boxStore\n      \u2026kBoardEntity::class.java)"

    .line 58
    .line 59
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Ljc/a;->o()Lio/objectbox/query/QueryBuilder;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    const-string v1, "builder"

    .line 67
    .line 68
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->h:Lio/objectbox/Property;

    .line 72
    .line 73
    invoke-virtual {v0, v1, p0}, Lio/objectbox/query/QueryBuilder;->g(Lio/objectbox/Property;Ljava/lang/String;)Lio/objectbox/query/QueryBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Lio/objectbox/query/QueryBuilder;->e()Lio/objectbox/query/Query;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    const-string v1, "builder.build()"

    .line 81
    .line 82
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Lio/objectbox/query/Query;->n()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 90
    .line 91
    const-wide/16 v1, 0x0

    .line 92
    .line 93
    const/4 v3, 0x1

    .line 94
    const/4 v4, 0x0

    .line 95
    if-eqz v0, :cond_0

    .line 96
    .line 97
    const-string p0, "\u9875\u9762 BoardControl.kt -> loadDir\uff0c\u4ece\u6570\u636e\u5e93\u52a0\u8f7d\u6570\u636e"

    .line 98
    .line 99
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-static {p0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->s(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)V

    .line 107
    .line 108
    .line 109
    :goto_0
    move p0, v3

    .line 110
    goto :goto_1

    .line 111
    :catchall_0
    move-exception p0

    .line 112
    goto/16 :goto_5

    .line 113
    .line 114
    :cond_0
    new-instance v0, Ljava/io/File;

    .line 115
    .line 116
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-eqz v0, :cond_1

    .line 124
    .line 125
    new-instance v0, Ljava/io/File;

    .line 126
    .line 127
    const-string v5, "page_router.bin"

    .line 128
    .line 129
    invoke-direct {v0, p0, v5}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-eqz v0, :cond_1

    .line 137
    .line 138
    const-string v0, "\u9875\u9762 BoardControl.kt -> loadDir\uff0c\u4ece\u672c\u5730\u6587\u4ef6\u52a0\u8f7d\u6570\u636e"

    .line 139
    .line 140
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    sget-object v0, Lx9/b;->a:Lx9/b;

    .line 148
    .line 149
    invoke-virtual {v0, p0}, Lx9/b;->C(Ljava/lang/String;)Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    invoke-virtual {p1, p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->s(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)V

    .line 154
    .line 155
    .line 156
    goto :goto_0

    .line 157
    :cond_1
    const-string v0, "\u9875\u9762 BoardControl.kt -> loadDir\uff0c\u65b0\u5efa\u7a7a\u767d\u753b\u677f"

    .line 158
    .line 159
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 167
    .line 168
    invoke-direct {v0, v1, v2, p0}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;-><init>(JLjava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->d()V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->s(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)V

    .line 175
    .line 176
    .line 177
    move p0, v4

    .line 178
    :goto_1
    monitor-enter p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 179
    :try_start_1
    iget-object v0, p1, Lcom/zykj/blackboard/core/edit/BoardControl;->b:Ljava/util/List;

    .line 180
    .line 181
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    if-eqz v0, :cond_2

    .line 186
    .line 187
    const/4 v0, 0x0

    .line 188
    goto :goto_3

    .line 189
    :cond_2
    :goto_2
    iget-object v0, p1, Lcom/zykj/blackboard/core/edit/BoardControl;->b:Ljava/util/List;

    .line 190
    .line 191
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    if-le v0, v3, :cond_3

    .line 196
    .line 197
    new-instance v0, Ljava/lang/StringBuilder;

    .line 198
    .line 199
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 200
    .line 201
    .line 202
    const-string v5, "\u9875\u9762 BoardControl.kt -> loadDir\uff0c\u5220\u9664\u591a\u4f59\u9875\u9762\uff0c\u6587\u4ef6="

    .line 203
    .line 204
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    iget-object v5, p1, Lcom/zykj/blackboard/core/edit/BoardControl;->b:Ljava/util/List;

    .line 208
    .line 209
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v5

    .line 213
    check-cast v5, Ly9/m;

    .line 214
    .line 215
    invoke-interface {v5}, Ly9/m;->getFileName()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    iget-object v0, p1, Lcom/zykj/blackboard/core/edit/BoardControl;->b:Ljava/util/List;

    .line 234
    .line 235
    invoke-interface {v0, v4}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    goto :goto_2

    .line 239
    :catchall_1
    move-exception p0

    .line 240
    goto :goto_4

    .line 241
    :cond_3
    iget-object v0, p1, Lcom/zykj/blackboard/core/edit/BoardControl;->b:Ljava/util/List;

    .line 242
    .line 243
    invoke-static {v0}, Lrc/g0;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    check-cast v0, Ly9/m;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 248
    .line 249
    :goto_3
    :try_start_2
    monitor-exit p1

    .line 250
    if-nez v0, :cond_4

    .line 251
    .line 252
    const-string p0, "\u9875\u9762 BoardControl.kt -> loadDir\uff0c\u6570\u636e\u52a0\u8f7d\u5b8c\u6bd5\uff0c\u9875\u9762\u4e3a\u7a7a"

    .line 253
    .line 254
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    invoke-static {p0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 262
    .line 263
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    invoke-interface {p2, p0, p1}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    return-void

    .line 271
    :cond_4
    invoke-interface {v0}, Ly9/m;->w()J

    .line 272
    .line 273
    .line 274
    move-result-wide v0

    .line 275
    new-instance v2, Lcom/zykj/blackboard/core/edit/BoardControl$loadDir$1$1;

    .line 276
    .line 277
    invoke-direct {v2, p2, p0, v0, v1}, Lcom/zykj/blackboard/core/edit/BoardControl$loadDir$1$1;-><init>(Lhd/p;ZJ)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {p1, v4, v2}, Lcom/zykj/blackboard/core/edit/BoardControl;->m(ILhd/a;)Z

    .line 281
    .line 282
    .line 283
    return-void

    .line 284
    :goto_4
    monitor-exit p1

    .line 285
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 286
    :goto_5
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 287
    .line 288
    .line 289
    new-instance p1, Ljava/lang/StringBuilder;

    .line 290
    .line 291
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 292
    .line 293
    .line 294
    const-string p2, "\u9875\u9762 BoardControl.kt -> loadDir\uff0c\u6570\u636e\u52a0\u8f7d\u5931\u8d25\uff0c\u5f02\u5e38="

    .line 295
    .line 296
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object p2

    .line 303
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object p1

    .line 310
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object p1

    .line 314
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    invoke-interface {p3, p0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    return-void
.end method

.method public static final w(Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lhd/p;Lhd/l;)V
    .locals 8

    .line 1
    const-string v0, "$dirPath"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "this$0"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$callback"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "$error"

    .line 17
    .line 18
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v1, "\u9875\u9762 BoardControl.kt -> loadDirAsMdbFmt\uff0c\u7ebf\u7a0b\u5f00\u59cb\uff0c\u76ee\u5f55="

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    new-instance v0, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, "/page_mdb"

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    new-instance v1, Ljava/io/File;

    .line 63
    .line 64
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    const-wide/16 v2, 0x0

    .line 72
    .line 73
    const/4 v4, 0x1

    .line 74
    const/4 v5, 0x0

    .line 75
    if-eqz v1, :cond_1

    .line 76
    .line 77
    sget-object v1, Lna/d;->a:Lna/d;

    .line 78
    .line 79
    sget-object v6, Lna/a;->a:Lna/a;

    .line 80
    .line 81
    invoke-virtual {v6}, Lna/a;->a()Landroid/content/Context;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    invoke-static {v6}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, v6, v0}, Lna/d;->h(Landroid/content/Context;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Lna/d;->f()Lio/objectbox/BoxStore;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    const-class v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    const-string v1, "BoardBox.boxStore.boxFor\u2026kBoardEntity::class.java)"

    .line 102
    .line 103
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Ljc/a;->o()Lio/objectbox/query/QueryBuilder;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    const-string v1, "builder"

    .line 111
    .line 112
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->h:Lio/objectbox/Property;

    .line 116
    .line 117
    invoke-virtual {v0, v1, p0}, Lio/objectbox/query/QueryBuilder;->g(Lio/objectbox/Property;Ljava/lang/String;)Lio/objectbox/query/QueryBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Lio/objectbox/query/QueryBuilder;->e()Lio/objectbox/query/Query;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    const-string v1, "builder.build()"

    .line 125
    .line 126
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0}, Lio/objectbox/query/Query;->n()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 134
    .line 135
    if-eqz v0, :cond_0

    .line 136
    .line 137
    const-string p0, "\u9875\u9762 BoardControl.kt -> loadDirAsMdbFmt\uff0c\u4ece\u6570\u636e\u5e93\u52a0\u8f7d\u6570\u636e"

    .line 138
    .line 139
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    invoke-static {p0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->s(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)V

    .line 147
    .line 148
    .line 149
    :goto_0
    move p0, v4

    .line 150
    goto/16 :goto_3

    .line 151
    .line 152
    :catchall_0
    move-exception p0

    .line 153
    goto/16 :goto_7

    .line 154
    .line 155
    :cond_0
    const-string v0, "\u9875\u9762 BoardControl.kt -> loadDirAsMdbFmt\uff0c\u65b0\u5efa\u7a7a\u767d\u753b\u677f"

    .line 156
    .line 157
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 165
    .line 166
    invoke-direct {v0, v2, v3, p0}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;-><init>(JLjava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->d()V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->s(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)V

    .line 173
    .line 174
    .line 175
    :goto_1
    move p0, v5

    .line 176
    goto/16 :goto_3

    .line 177
    .line 178
    :cond_1
    sget-object v1, Lna/d;->a:Lna/d;

    .line 179
    .line 180
    sget-object v6, Lna/a;->a:Lna/a;

    .line 181
    .line 182
    invoke-virtual {v6}, Lna/a;->a()Landroid/content/Context;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    invoke-static {v6}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1, v6, v0}, Lna/d;->h(Landroid/content/Context;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    new-instance v0, Ljava/io/File;

    .line 193
    .line 194
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-eqz v0, :cond_3

    .line 202
    .line 203
    new-instance v0, Ljava/io/File;

    .line 204
    .line 205
    const-string v1, "page_router.bin"

    .line 206
    .line 207
    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    if-eqz v0, :cond_3

    .line 215
    .line 216
    const-string v0, "\u9875\u9762 BoardControl.kt -> loadDirAsMdbFmt\uff0c\u4ece\u672c\u5730\u6587\u4ef6\u52a0\u8f7d\u6570\u636e"

    .line 217
    .line 218
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    sget-object v0, Lx9/b;->a:Lx9/b;

    .line 226
    .line 227
    invoke-virtual {v0, p0}, Lx9/b;->C(Ljava/lang/String;)Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    new-instance v1, Ljava/lang/StringBuilder;

    .line 232
    .line 233
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 234
    .line 235
    .line 236
    const-string v6, "\u9875\u9762 BoardControl.kt -> loadDirAsMdbFmt\uff0c\u65e7bin\u8f6cmdb\u7ed3\u679c\uff0c\u76ee\u5f55="

    .line 237
    .line 238
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    const-string p0, "\uff0c\u9875\u9762\u6570="

    .line 245
    .line 246
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->c()Lio/objectbox/relation/ToMany;

    .line 250
    .line 251
    .line 252
    move-result-object p0

    .line 253
    invoke-virtual {p0}, Lio/objectbox/relation/ToMany;->size()I

    .line 254
    .line 255
    .line 256
    move-result p0

    .line 257
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object p0

    .line 264
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object p0

    .line 268
    invoke-static {p0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->c()Lio/objectbox/relation/ToMany;

    .line 272
    .line 273
    .line 274
    move-result-object p0

    .line 275
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 280
    .line 281
    .line 282
    move-result v1

    .line 283
    if-eqz v1, :cond_2

    .line 284
    .line 285
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    check-cast v1, Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 290
    .line 291
    new-instance v6, Ljava/lang/StringBuilder;

    .line 292
    .line 293
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 294
    .line 295
    .line 296
    const-string v7, "\u9875\u9762 BoardControl.kt -> loadDirAsMdbFmt\uff0c\u65e7bin\u8f6cmdb\u9875\u9762\u76ee\u5f55="

    .line 297
    .line 298
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->d()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v7

    .line 305
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    const-string v7, "\uff0c\u8d44\u6e90\u6587\u4ef6\u6570="

    .line 309
    .line 310
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->g()Lio/objectbox/relation/ToOne;

    .line 314
    .line 315
    .line 316
    move-result-object v7

    .line 317
    invoke-virtual {v7}, Lio/objectbox/relation/ToOne;->d()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v7

    .line 321
    check-cast v7, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 322
    .line 323
    invoke-virtual {v7}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->c()Lio/objectbox/relation/ToMany;

    .line 324
    .line 325
    .line 326
    move-result-object v7

    .line 327
    invoke-virtual {v7}, Lio/objectbox/relation/ToMany;->size()I

    .line 328
    .line 329
    .line 330
    move-result v7

    .line 331
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    const-string v7, "\uff0c\u547d\u4ee4\u6587\u4ef6\u6570="

    .line 335
    .line 336
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->g()Lio/objectbox/relation/ToOne;

    .line 340
    .line 341
    .line 342
    move-result-object v7

    .line 343
    invoke-virtual {v7}, Lio/objectbox/relation/ToOne;->d()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v7

    .line 347
    check-cast v7, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 348
    .line 349
    invoke-virtual {v7}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->b()Lio/objectbox/relation/ToMany;

    .line 350
    .line 351
    .line 352
    move-result-object v7

    .line 353
    invoke-virtual {v7}, Lio/objectbox/relation/ToMany;->size()I

    .line 354
    .line 355
    .line 356
    move-result v7

    .line 357
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    const-string v7, "\uff0c\u89e6\u6478\u6587\u4ef6\u6570="

    .line 361
    .line 362
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->g()Lio/objectbox/relation/ToOne;

    .line 366
    .line 367
    .line 368
    move-result-object v7

    .line 369
    invoke-virtual {v7}, Lio/objectbox/relation/ToOne;->d()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v7

    .line 373
    check-cast v7, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 374
    .line 375
    invoke-virtual {v7}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->i()Lio/objectbox/relation/ToMany;

    .line 376
    .line 377
    .line 378
    move-result-object v7

    .line 379
    invoke-virtual {v7}, Lio/objectbox/relation/ToMany;->size()I

    .line 380
    .line 381
    .line 382
    move-result v7

    .line 383
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 384
    .line 385
    .line 386
    const-string v7, "\uff0c\u77e9\u9635\u6587\u4ef6\u6570="

    .line 387
    .line 388
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->g()Lio/objectbox/relation/ToOne;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    invoke-virtual {v1}, Lio/objectbox/relation/ToOne;->d()Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    check-cast v1, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 400
    .line 401
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->f()Lio/objectbox/relation/ToMany;

    .line 402
    .line 403
    .line 404
    move-result-object v1

    .line 405
    invoke-virtual {v1}, Lio/objectbox/relation/ToMany;->size()I

    .line 406
    .line 407
    .line 408
    move-result v1

    .line 409
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v1

    .line 416
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v1

    .line 420
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 421
    .line 422
    .line 423
    goto/16 :goto_2

    .line 424
    .line 425
    :cond_2
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->s(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)V

    .line 426
    .line 427
    .line 428
    goto/16 :goto_0

    .line 429
    .line 430
    :cond_3
    const-string v0, "\u9875\u9762 BoardControl.kt -> loadDirAsMdbFmt\uff0c\u65b0\u5efa\u7a7a\u767d\u753b\u677f"

    .line 431
    .line 432
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 437
    .line 438
    .line 439
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 440
    .line 441
    invoke-direct {v0, v2, v3, p0}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;-><init>(JLjava/lang/String;)V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->d()V

    .line 445
    .line 446
    .line 447
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->s(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)V

    .line 448
    .line 449
    .line 450
    goto/16 :goto_1

    .line 451
    .line 452
    :goto_3
    monitor-enter p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 453
    :try_start_1
    iget-object v0, p1, Lcom/zykj/blackboard/core/edit/BoardControl;->b:Ljava/util/List;

    .line 454
    .line 455
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 456
    .line 457
    .line 458
    move-result v0

    .line 459
    if-eqz v0, :cond_4

    .line 460
    .line 461
    const/4 v0, 0x0

    .line 462
    goto :goto_5

    .line 463
    :cond_4
    :goto_4
    iget-object v0, p1, Lcom/zykj/blackboard/core/edit/BoardControl;->b:Ljava/util/List;

    .line 464
    .line 465
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 466
    .line 467
    .line 468
    move-result v0

    .line 469
    if-le v0, v4, :cond_5

    .line 470
    .line 471
    new-instance v0, Ljava/lang/StringBuilder;

    .line 472
    .line 473
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 474
    .line 475
    .line 476
    const-string v1, "\u9875\u9762 BoardControl.kt -> loadDirAsMdbFmt\uff0c\u5220\u9664\u591a\u4f59\u9875\u9762\uff0c\u6587\u4ef6="

    .line 477
    .line 478
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 479
    .line 480
    .line 481
    iget-object v1, p1, Lcom/zykj/blackboard/core/edit/BoardControl;->b:Ljava/util/List;

    .line 482
    .line 483
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v1

    .line 487
    check-cast v1, Ly9/m;

    .line 488
    .line 489
    invoke-interface {v1}, Ly9/m;->getFileName()Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object v1

    .line 493
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 494
    .line 495
    .line 496
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 505
    .line 506
    .line 507
    iget-object v0, p1, Lcom/zykj/blackboard/core/edit/BoardControl;->b:Ljava/util/List;

    .line 508
    .line 509
    invoke-interface {v0, v5}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    goto :goto_4

    .line 513
    :catchall_1
    move-exception p0

    .line 514
    goto :goto_6

    .line 515
    :cond_5
    iget-object v0, p1, Lcom/zykj/blackboard/core/edit/BoardControl;->b:Ljava/util/List;

    .line 516
    .line 517
    invoke-static {v0}, Lrc/g0;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    check-cast v0, Ly9/m;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 522
    .line 523
    :goto_5
    :try_start_2
    monitor-exit p1

    .line 524
    if-nez v0, :cond_6

    .line 525
    .line 526
    const-string p0, "\u9875\u9762 BoardControl.kt -> loadDirAsMdbFmt\uff0c\u6570\u636e\u52a0\u8f7d\u5b8c\u6bd5\uff0c\u9875\u9762\u4e3a\u7a7a"

    .line 527
    .line 528
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object p0

    .line 532
    invoke-static {p0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 533
    .line 534
    .line 535
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 536
    .line 537
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 538
    .line 539
    .line 540
    move-result-object p1

    .line 541
    invoke-interface {p2, p0, p1}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 542
    .line 543
    .line 544
    return-void

    .line 545
    :cond_6
    invoke-interface {v0}, Ly9/m;->w()J

    .line 546
    .line 547
    .line 548
    move-result-wide v0

    .line 549
    new-instance v2, Lcom/zykj/blackboard/core/edit/BoardControl$loadDirAsMdbFmt$1$2;

    .line 550
    .line 551
    invoke-direct {v2, p2, p0, v0, v1}, Lcom/zykj/blackboard/core/edit/BoardControl$loadDirAsMdbFmt$1$2;-><init>(Lhd/p;ZJ)V

    .line 552
    .line 553
    .line 554
    invoke-virtual {p1, v5, v2}, Lcom/zykj/blackboard/core/edit/BoardControl;->m(ILhd/a;)Z

    .line 555
    .line 556
    .line 557
    return-void

    .line 558
    :goto_6
    monitor-exit p1

    .line 559
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 560
    :goto_7
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 561
    .line 562
    .line 563
    new-instance p1, Ljava/lang/StringBuilder;

    .line 564
    .line 565
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 566
    .line 567
    .line 568
    const-string p2, "\u9875\u9762 BoardControl.kt -> loadDirAsMdbFmt\uff0c\u6570\u636e\u52a0\u8f7d\u5931\u8d25\uff0c\u5f02\u5e38="

    .line 569
    .line 570
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 571
    .line 572
    .line 573
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 574
    .line 575
    .line 576
    move-result-object p2

    .line 577
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 578
    .line 579
    .line 580
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 581
    .line 582
    .line 583
    move-result-object p1

    .line 584
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 585
    .line 586
    .line 587
    move-result-object p1

    .line 588
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 589
    .line 590
    .line 591
    invoke-interface {p3, p0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    return-void
.end method

.method public static final y(Lcom/zykj/blackboard/core/edit/BoardControl;)V
    .locals 2

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->b:Ljava/util/List;

    .line 7
    .line 8
    check-cast v0, Ljava/lang/Iterable;

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ly9/m;

    .line 25
    .line 26
    invoke-interface {v1}, Ly9/m;->release()V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object p0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->b:Ljava/util/List;

    .line 31
    .line 32
    invoke-interface {p0}, Ljava/util/List;->clear()V

    .line 33
    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final C(ZZLhd/l;Lhd/l;)V
    .locals 7

    .line 1
    new-instance v1, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->b:Ljava/util/List;

    .line 4
    .line 5
    check-cast p1, Ljava/util/Collection;

    .line 6
    .line 7
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->n()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->q()Ljava/util/concurrent/ExecutorService;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    new-instance v0, Ly9/i;

    .line 19
    .line 20
    move-object v3, p0

    .line 21
    move v6, p2

    .line 22
    move-object v5, p3

    .line 23
    move-object v4, p4

    .line 24
    invoke-direct/range {v0 .. v6}, Ly9/i;-><init>(Ljava/util/ArrayList;Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lhd/l;Lhd/l;Z)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public a(ILhd/a;)V
    .locals 2

    .line 1
    const-string v0, "renderCallback"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/edit/BoardControl;->p(I)Ly9/m;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    add-int/lit8 v1, p1, 0x1

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->p(I)Ly9/m;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    add-int/lit8 v1, p1, -0x1

    .line 22
    .line 23
    invoke-virtual {p0, v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->p(I)Ly9/m;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    :cond_1
    invoke-interface {v0}, Ly9/m;->onDelete()V

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Ly9/m;->release()V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->b:Ljava/util/List;

    .line 34
    .line 35
    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    iget v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->d:I

    .line 39
    .line 40
    if-ne v0, p1, :cond_2

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->b:Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {p1, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    invoke-virtual {p0, p1, p2}, Lcom/zykj/blackboard/core/edit/BoardControl;->z(ILhd/a;)Z

    .line 51
    .line 52
    .line 53
    :cond_2
    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->b:Ljava/util/List;

    .line 54
    .line 55
    invoke-static {p1, v1}, Lrc/g0;->r0(Ljava/util/List;Ljava/lang/Object;)I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    iput p1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->d:I

    .line 60
    .line 61
    return-void
.end method

.method public b()Ly9/n;
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->d:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->p(I)Ly9/m;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public c(ZZLhd/l;Lhd/l;)V
    .locals 9

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "error"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lq9/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lq9/b;->L()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/zykj/blackboard/core/edit/BoardControl;->C(ZZLhd/l;Lhd/l;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    .line 26
    .line 27
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->b:Ljava/util/List;

    .line 28
    .line 29
    check-cast v0, Ljava/util/Collection;

    .line 30
    .line 31
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->n()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->q()Ljava/util/concurrent/ExecutorService;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    new-instance v1, Ly9/d;

    .line 43
    .line 44
    move-object v4, p0

    .line 45
    move v6, p1

    .line 46
    move v8, p2

    .line 47
    move-object v7, p3

    .line 48
    move-object v5, p4

    .line 49
    invoke-direct/range {v1 .. v8}, Ly9/d;-><init>(Ljava/util/ArrayList;Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lhd/l;ZLhd/l;Z)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public d()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->b:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public e(ZLhd/a;)Ly9/n;
    .locals 7

    .line 1
    const-string v0, "renderCallback"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->b:Ljava/util/List;

    .line 7
    .line 8
    check-cast v0, Ljava/util/Collection;

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v1, "\u9875\u9762 BoardControl.kt -> createPage\uff0c\u9690\u85cf\u4e4b\u524d\u7b2c"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget v1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->d:I

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const v1, 0x9875

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->b:Ljava/util/List;

    .line 51
    .line 52
    iget v1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->d:I

    .line 53
    .line 54
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, Ly9/m;

    .line 59
    .line 60
    invoke-interface {v0}, Ly9/m;->hide()V

    .line 61
    .line 62
    .line 63
    :cond_0
    new-instance v1, Lcom/zykj/blackboard/core/edit/PageControl;

    .line 64
    .line 65
    iget-object v3, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->a:Lw9/h;

    .line 66
    .line 67
    const/4 v5, 0x4

    .line 68
    const/4 v6, 0x0

    .line 69
    const/4 v4, 0x0

    .line 70
    move-object v2, p0

    .line 71
    invoke-direct/range {v1 .. v6}, Lcom/zykj/blackboard/core/edit/PageControl;-><init>(Lcom/zykj/blackboard/core/edit/BoardControl;Lw9/h;Lcom/zykj/blackboard/core/data/dao/PageEntity;ILkotlin/jvm/internal/n;)V

    .line 72
    .line 73
    .line 74
    iget-object v0, v2, Lcom/zykj/blackboard/core/edit/BoardControl;->b:Ljava/util/List;

    .line 75
    .line 76
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    if-eqz p1, :cond_1

    .line 80
    .line 81
    iget-object p1, v2, Lcom/zykj/blackboard/core/edit/BoardControl;->b:Ljava/util/List;

    .line 82
    .line 83
    invoke-interface {p1, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    invoke-virtual {p0, p1, p2}, Lcom/zykj/blackboard/core/edit/BoardControl;->z(ILhd/a;)Z

    .line 88
    .line 89
    .line 90
    :cond_1
    return-object v1
.end method

.method public getConfig()Lq9/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->c:Lq9/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public m(ILhd/a;)Z
    .locals 3

    .line 1
    const-string v0, "renderCallback"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->d:I

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-ne v0, p1, :cond_0

    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    if-ltz v0, :cond_1

    .line 13
    .line 14
    iget-object v2, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->b:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-ge v0, v2, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->b:Ljava/util/List;

    .line 23
    .line 24
    iget v2, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->d:I

    .line 25
    .line 26
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Ly9/m;

    .line 31
    .line 32
    invoke-interface {v0}, Ly9/m;->hide()V

    .line 33
    .line 34
    .line 35
    :cond_1
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/edit/BoardControl;->p(I)Ly9/m;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0, p1, p2}, Lcom/zykj/blackboard/core/edit/BoardControl;->z(ILhd/a;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    return p1

    .line 46
    :cond_2
    return v1
.end method

.method public n()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final o()Lma/a;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final p(I)Ly9/m;
    .locals 1

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->b:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-ge p1, v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->b:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Ly9/m;

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    return-object p1
.end method

.method public final q()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->f:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/concurrent/ExecutorService;

    .line 8
    .line 9
    return-object v0
.end method

.method public final r(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final s(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->c()Lio/objectbox/relation/ToMany;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 20
    .line 21
    new-instance v1, Lcom/zykj/blackboard/core/edit/PageControl;

    .line 22
    .line 23
    iget-object v2, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->a:Lw9/h;

    .line 24
    .line 25
    invoke-direct {v1, p0, v2, v0}, Lcom/zykj/blackboard/core/edit/PageControl;-><init>(Lcom/zykj/blackboard/core/edit/BoardControl;Lw9/h;Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->b:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return-void
.end method

.method public t(Ljava/lang/String;Lhd/p;Lhd/l;)V
    .locals 2

    .line 1
    const-string v0, "dirPath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "error"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lq9/b;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Lq9/b;->L()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/edit/BoardControl;->v(Ljava/lang/String;Lhd/p;Lhd/l;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    const-string v1, "\u9875\u9762 BoardControl.kt -> loadDir\uff0c\u5f00\u59cb\u52a0\u8f7d\uff0c\u76ee\u5f55="

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/edit/BoardControl;->r(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->q()Ljava/util/concurrent/ExecutorService;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    new-instance v1, Ly9/e;

    .line 62
    .line 63
    invoke-direct {v1, p1, p0, p2, p3}, Ly9/e;-><init>(Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lhd/p;Lhd/l;)V

    .line 64
    .line 65
    .line 66
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public final v(Ljava/lang/String;Lhd/p;Lhd/l;)V
    .locals 2

    .line 1
    const-string v0, "dirPath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "error"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v1, "\u9875\u9762 BoardControl.kt -> loadDirAsMdbFmt\uff0c\u5f00\u59cb\u52a0\u8f7d\uff0c\u76ee\u5f55="

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/edit/BoardControl;->r(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->q()Ljava/util/concurrent/ExecutorService;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    new-instance v1, Ly9/g;

    .line 48
    .line 49
    invoke-direct {v1, p1, p0, p2, p3}, Ly9/g;-><init>(Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lhd/p;Lhd/l;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final x()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->q()Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ly9/f;

    .line 6
    .line 7
    invoke-direct {v1, p0}, Ly9/f;-><init>(Lcom/zykj/blackboard/core/edit/BoardControl;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final z(ILhd/a;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->b:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ly9/m;

    .line 8
    .line 9
    iput p1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->d:I

    .line 10
    .line 11
    invoke-interface {v0, p2}, Ly9/m;->b(Lhd/a;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    return p1
.end method
