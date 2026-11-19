# RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。
.class public final Lcom/zykj/blackboard/core/edit/BoardControl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/core/edit/IBoardControl;


# instance fields
.field public final a:Ll4/j;

.field public final b:Ljava/util/List;

.field public c:Lcom/zykj/blackboard/bean/BoardConfig;

.field public d:I

.field public e:Ljava/lang/String;

.field public final f:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(IILl4/j;)V
    .locals 1

    .line 1
    const-string v0, "renderLayer"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p3, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->a:Ll4/j;

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
    new-instance p3, Lcom/zykj/blackboard/bean/BoardConfig;

    .line 19
    .line 20
    invoke-direct {p3, p1, p2}, Lcom/zykj/blackboard/bean/BoardConfig;-><init>(II)V

    .line 21
    .line 22
    .line 23
    iput-object p3, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->c:Lcom/zykj/blackboard/bean/BoardConfig;

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
    sget-object p1, Lcom/zykj/blackboard/core/edit/BoardControl$singleExecutor$2;->a:Lcom/zykj/blackboard/core/edit/BoardControl$singleExecutor$2;

    .line 33
    .line 34
    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->f:Lkotlin/Lazy;

    .line 39
    .line 40
    return-void
.end method

.method public static synthetic e(Lcom/zykj/blackboard/core/edit/BoardControl;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->q(Lcom/zykj/blackboard/core/edit/BoardControl;)V

    return-void
.end method

.method public static synthetic f(Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/edit/BoardControl;->o(Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final o(Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V
    .locals 7

    .line 1
    const-string v0, "$dirPath"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "this$0"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$callback"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "$error"

    .line 17
    .line 18
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
    const-string v1, "\u9875\u9762BoardControl:loadDir -> dirPath:"

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
    const-string v1, " \u7ebf\u7a0b\u5f00\u59cb"

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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
    sget-object v0, Le5/c;->a:Le5/c;

    .line 51
    .line 52
    invoke-virtual {v0}, Le5/c;->b()Lio/objectbox/BoxStore;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const-class v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Lio/objectbox/BoxStore;->h(Ljava/lang/Class;)Lq8/a;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-string v1, "BoardBox.boxStore\n      \u2026kBoardEntity::class.java)"

    .line 63
    .line 64
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Lq8/a;->n()Lio/objectbox/query/QueryBuilder;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    const-string v1, "builder"

    .line 72
    .line 73
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->f:Lio/objectbox/Property;

    .line 77
    .line 78
    invoke-virtual {v0, v1, p0}, Lio/objectbox/query/QueryBuilder;->g(Lio/objectbox/Property;Ljava/lang/String;)Lio/objectbox/query/QueryBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Lio/objectbox/query/QueryBuilder;->a()Lio/objectbox/query/Query;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    const-string v1, "builder.build()"

    .line 86
    .line 87
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Lio/objectbox/query/Query;->p()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 95
    .line 96
    const/4 v1, 0x0

    .line 97
    const-wide/16 v2, 0x0

    .line 98
    .line 99
    const/4 v4, 0x1

    .line 100
    if-eqz v0, :cond_0

    .line 101
    .line 102
    const-string p0, "\u9875\u9762BoardControl:loadDir -> \u4ece\u6570\u636e\u5e93\u52a0\u8f7d\u6570\u636e"

    .line 103
    .line 104
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-static {p0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->m(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)V

    .line 112
    .line 113
    .line 114
    :goto_0
    move p0, v4

    .line 115
    goto :goto_1

    .line 116
    :catchall_0
    move-exception p0

    .line 117
    goto/16 :goto_5

    .line 118
    .line 119
    :cond_0
    new-instance v0, Ljava/io/File;

    .line 120
    .line 121
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-eqz v0, :cond_1

    .line 129
    .line 130
    new-instance v0, Ljava/io/File;

    .line 131
    .line 132
    const-string v5, "page_router.bin"

    .line 133
    .line 134
    invoke-direct {v0, p0, v5}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-eqz v0, :cond_1

    .line 142
    .line 143
    const-string v0, "\u9875\u9762BoardControl:loadDir -> \u4ece\u672c\u5730\u6587\u4ef6\u52a0\u8f7d\u6570\u636e"

    .line 144
    .line 145
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    sget-object v0, Lm4/b;->a:Lm4/b;

    .line 153
    .line 154
    invoke-virtual {v0, p0}, Lm4/b;->B(Ljava/lang/String;)Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    invoke-virtual {p1, p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->m(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)V

    .line 159
    .line 160
    .line 161
    goto :goto_0

    .line 162
    :cond_1
    const-string v0, "\u9875\u9762BoardControl:loadDir -> \u65b0\u5efaboard\u7a7a\u767d\u753b\u677f"

    .line 163
    .line 164
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 172
    .line 173
    invoke-direct {v0, v2, v3, p0}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;-><init>(JLjava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->d()V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->m(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)V

    .line 180
    .line 181
    .line 182
    move p0, v1

    .line 183
    :goto_1
    monitor-enter p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 184
    :try_start_1
    iget-object v0, p1, Lcom/zykj/blackboard/core/edit/BoardControl;->b:Ljava/util/List;

    .line 185
    .line 186
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    if-eqz v0, :cond_2

    .line 191
    .line 192
    const/4 v0, 0x0

    .line 193
    goto :goto_3

    .line 194
    :cond_2
    iget-object v0, p1, Lcom/zykj/blackboard/core/edit/BoardControl;->b:Ljava/util/List;

    .line 195
    .line 196
    invoke-static {v0, v4}, Lkotlin/collections/CollectionsKt;->dropLast(Ljava/util/List;I)Ljava/util/List;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 205
    .line 206
    .line 207
    move-result v4

    .line 208
    if-eqz v4, :cond_3

    .line 209
    .line 210
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v4

    .line 214
    check-cast v4, Ln4/h;

    .line 215
    .line 216
    new-instance v5, Ljava/lang/StringBuilder;

    .line 217
    .line 218
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 219
    .line 220
    .line 221
    const-string v6, "\u9875\u9762BoardControl:loadDir -> \u5220\u9664\u4e86\u4e00\u4e2a "

    .line 222
    .line 223
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-interface {v4}, Ln4/h;->getFileName()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v4

    .line 237
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v4

    .line 241
    invoke-static {v4}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    goto :goto_2

    .line 245
    :catchall_1
    move-exception p0

    .line 246
    goto :goto_4

    .line 247
    :cond_3
    iget-object v0, p1, Lcom/zykj/blackboard/core/edit/BoardControl;->b:Ljava/util/List;

    .line 248
    .line 249
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    check-cast v0, Ln4/h;

    .line 254
    .line 255
    new-instance v4, Ljava/lang/StringBuilder;

    .line 256
    .line 257
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 258
    .line 259
    .line 260
    const-string v5, "\u9875\u9762BoardControl:loadDir -> \u4fdd\u7559\u9875: "

    .line 261
    .line 262
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    invoke-interface {v0}, Ln4/h;->getFileName()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v5

    .line 269
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v4

    .line 276
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v4

    .line 280
    invoke-static {v4}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    iget-object v4, p1, Lcom/zykj/blackboard/core/edit/BoardControl;->b:Ljava/util/List;

    .line 284
    .line 285
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 286
    .line 287
    .line 288
    move-result-object v5

    .line 289
    invoke-interface {v4, v5}, Ljava/util/List;->retainAll(Ljava/util/Collection;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 290
    .line 291
    .line 292
    :goto_3
    :try_start_2
    monitor-exit p1

    .line 293
    if-nez v0, :cond_4

    .line 294
    .line 295
    const-string p0, "\u9875\u9762BoardControl:loadDir -> \u6570\u636e\u52a0\u8f7d\u5b8c\u6bd5, \u6570\u636e\u7a7a"

    .line 296
    .line 297
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object p0

    .line 301
    invoke-static {p0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 305
    .line 306
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 307
    .line 308
    .line 309
    move-result-object p1

    .line 310
    invoke-interface {p2, p0, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    return-void

    .line 314
    :cond_4
    invoke-interface {v0}, Ln4/h;->x()J

    .line 315
    .line 316
    .line 317
    move-result-wide v2

    .line 318
    new-instance v0, Lcom/zykj/blackboard/core/edit/BoardControl$loadDir$1$1;

    .line 319
    .line 320
    invoke-direct {v0, p2, p0, v2, v3}, Lcom/zykj/blackboard/core/edit/BoardControl$loadDir$1$1;-><init>(Lkotlin/jvm/functions/Function2;ZJ)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {p1, v1, v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->g(ILkotlin/jvm/functions/Function0;)Z

    .line 324
    .line 325
    .line 326
    return-void

    .line 327
    :goto_4
    monitor-exit p1

    .line 328
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 329
    :goto_5
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 330
    .line 331
    .line 332
    new-instance p1, Ljava/lang/StringBuilder;

    .line 333
    .line 334
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 335
    .line 336
    .line 337
    const-string p2, "\u9875\u9762BoardControl:loadDir -> \u6570\u636e\u52a0\u8f7d\u5931\u8d25\uff0ce: "

    .line 338
    .line 339
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 340
    .line 341
    .line 342
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object p2

    .line 346
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object p1

    .line 353
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object p1

    .line 357
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    invoke-interface {p3, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    return-void
.end method

.method public static final q(Lcom/zykj/blackboard/core/edit/BoardControl;)V
    .locals 2

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->b:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Ln4/h;

    .line 23
    .line 24
    invoke-interface {v1}, Ln4/h;->release()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object p0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->b:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {p0}, Ljava/util/List;->clear()V

    .line 31
    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public a()Ln4/i;
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->d:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->j(I)Ln4/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public b(ZLkotlin/jvm/functions/Function0;)Ln4/i;
    .locals 7

    .line 1
    const-string v0, "renderCallback"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->b:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v1, "\u9875\u9762BoardControl\u9690\u85cf\u4e4b\u524d\u7b2c"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    iget v1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->d:I

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->b:Ljava/util/List;

    .line 43
    .line 44
    iget v1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->d:I

    .line 45
    .line 46
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Ln4/h;

    .line 51
    .line 52
    invoke-interface {v0}, Ln4/h;->hide()V

    .line 53
    .line 54
    .line 55
    :cond_0
    new-instance v1, Lcom/zykj/blackboard/core/edit/PageControl;

    .line 56
    .line 57
    iget-object v3, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->a:Ll4/j;

    .line 58
    .line 59
    const/4 v5, 0x4

    .line 60
    const/4 v6, 0x0

    .line 61
    const/4 v4, 0x0

    .line 62
    move-object v2, p0

    .line 63
    invoke-direct/range {v1 .. v6}, Lcom/zykj/blackboard/core/edit/PageControl;-><init>(Lcom/zykj/blackboard/core/edit/BoardControl;Ll4/j;Lcom/zykj/blackboard/core/data/dao/PageEntity;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 64
    .line 65
    .line 66
    iget-object v0, v2, Lcom/zykj/blackboard/core/edit/BoardControl;->b:Ljava/util/List;

    .line 67
    .line 68
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    if-eqz p1, :cond_1

    .line 72
    .line 73
    iget-object p1, v2, Lcom/zykj/blackboard/core/edit/BoardControl;->b:Ljava/util/List;

    .line 74
    .line 75
    invoke-interface {p1, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    invoke-virtual {p0, p1, p2}, Lcom/zykj/blackboard/core/edit/BoardControl;->r(ILkotlin/jvm/functions/Function0;)Z

    .line 80
    .line 81
    .line 82
    :cond_1
    return-object v1
.end method

.method public c(ILkotlin/jvm/functions/Function0;)V
    .locals 2

    .line 1
    const-string v0, "renderCallback"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/edit/BoardControl;->j(I)Ln4/h;

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
    invoke-virtual {p0, v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->j(I)Ln4/h;

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
    invoke-virtual {p0, v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->j(I)Ln4/h;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    :cond_1
    invoke-interface {v0}, Ln4/h;->onDelete()V

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Ln4/h;->release()V

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/blackboard/core/edit/BoardControl;->r(ILkotlin/jvm/functions/Function0;)Z

    .line 51
    .line 52
    .line 53
    :cond_2
    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->b:Ljava/util/List;

    .line 54
    .line 55
    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->indexOf(Ljava/util/List;Ljava/lang/Object;)I

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

.method public d()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->b:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public g(ILkotlin/jvm/functions/Function0;)Z
    .locals 3

    .line 1
    const-string v0, "renderCallback"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
    check-cast v0, Ln4/h;

    .line 31
    .line 32
    invoke-interface {v0}, Ln4/h;->hide()V

    .line 33
    .line 34
    .line 35
    :cond_1
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/edit/BoardControl;->j(I)Ln4/h;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0, p1, p2}, Lcom/zykj/blackboard/core/edit/BoardControl;->r(ILkotlin/jvm/functions/Function0;)Z

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

.method public getConfig()Lcom/zykj/blackboard/bean/BoardConfig;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->c:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()Lc5/a;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final j(I)Ln4/h;
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
    check-cast p1, Ln4/h;

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    return-object p1
.end method

.method public final k()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->f:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

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

.method public final l(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final m(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)V
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
    iget-object v2, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->a:Ll4/j;

    .line 24
    .line 25
    invoke-direct {v1, p0, v2, v0}, Lcom/zykj/blackboard/core/edit/PageControl;-><init>(Lcom/zykj/blackboard/core/edit/BoardControl;Ll4/j;Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

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

.method public n(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V
    .locals 2

    .line 1
    const-string v0, "dirPath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "error"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
    const-string v1, "\u9875\u9762BoardControl:loadDir\u7684\u8def\u5f84 -> dirPath:"

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
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/edit/BoardControl;->l(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->k()Ljava/util/concurrent/ExecutorService;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    new-instance v1, Ln4/d;

    .line 48
    .line 49
    invoke-direct {v1, p1, p0, p2, p3}, Ln4/d;-><init>(Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final p()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->k()Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ln4/e;

    .line 6
    .line 7
    invoke-direct {v1, p0}, Ln4/e;-><init>(Lcom/zykj/blackboard/core/edit/BoardControl;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final r(ILkotlin/jvm/functions/Function0;)Z
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
    check-cast v0, Ln4/h;

    .line 8
    .line 9
    iput p1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->d:I

    .line 10
    .line 11
    invoke-interface {v0, p2}, Ln4/h;->b(Lkotlin/jvm/functions/Function0;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    return p1
.end method
