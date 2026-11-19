# RE note 本类字节码直接引用的读写或显示接口包括JSON。
.class public final Lcom/friday/user/work/ClearCacheWork;
.super Landroidx/work/CoroutineWorker;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/user/work/ClearCacheWork$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/friday/user/work/ClearCacheWork$a;

.field public static final b:I

.field public static final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/friday/user/work/ClearCacheWork$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/friday/user/work/ClearCacheWork$a;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/friday/user/work/ClearCacheWork;->a:Lcom/friday/user/work/ClearCacheWork$a;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Lcom/friday/user/work/ClearCacheWork;->b:I

    .line 12
    .line 13
    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppDataPath()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 18
    .line 19
    sget-object v2, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 20
    .line 21
    invoke-virtual {v2}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Lcom/friday/common/helper/b;->t()J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    new-instance v4, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v0, "share"

    .line 41
    .line 42
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, Lcom/friday/user/work/ClearCacheWork;->c:Ljava/lang/String;

    .line 56
    .line 57
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "workerParams"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static final synthetic b(Lcom/friday/user/work/ClearCacheWork;Lcom/friday/common/MyDataBase;Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/friday/user/work/ClearCacheWork;->c(Lcom/friday/common/MyDataBase;Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
# RE I/O 读取 JSON（Gson.fromJson）。
.method public final c(Lcom/friday/common/MyDataBase;Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    instance-of v1, v0, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;

    .line 9
    .line 10
    iget v2, v1, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->q:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->q:I

    .line 20
    .line 21
    move-object/from16 v2, p0

    .line 22
    .line 23
    :goto_0
    move-object v7, v1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v1, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;

    .line 26
    .line 27
    move-object/from16 v2, p0

    .line 28
    .line 29
    invoke-direct {v1, v2, v0}, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;-><init>(Lcom/friday/user/work/ClearCacheWork;Lvc/c;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :goto_1
    iget-object v0, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->o:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget v3, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->q:I

    .line 40
    .line 41
    const/4 v10, 0x4

    .line 42
    const/4 v11, 0x3

    .line 43
    const/4 v12, 0x2

    .line 44
    const/4 v14, 0x1

    .line 45
    if-eqz v3, :cond_5

    .line 46
    .line 47
    if-eq v3, v14, :cond_4

    .line 48
    .line 49
    if-eq v3, v12, :cond_3

    .line 50
    .line 51
    if-eq v3, v11, :cond_2

    .line 52
    .line 53
    if-ne v3, v10, :cond_1

    .line 54
    .line 55
    iget-object v1, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->f:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v1, Ljava/util/List;

    .line 58
    .line 59
    iget-object v1, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->e:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v1, Ljava/lang/String;

    .line 62
    .line 63
    iget-object v1, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->d:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Ljava/lang/String;

    .line 66
    .line 67
    iget-object v3, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->c:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v3, Lcom/friday/common/MyDataBase;

    .line 70
    .line 71
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    const/4 v2, 0x0

    .line 75
    goto/16 :goto_a

    .line 76
    .line 77
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 78
    .line 79
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 80
    .line 81
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw v0

    .line 85
    :cond_2
    iget v3, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->m:I

    .line 86
    .line 87
    iget-object v4, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->l:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v4, Lcom/friday/common/entity/ResourceEntity;

    .line 90
    .line 91
    iget-object v5, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->k:Ljava/lang/Object;

    .line 92
    .line 93
    iget-object v6, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->j:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v6, Ljava/util/Iterator;

    .line 96
    .line 97
    iget-object v8, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->i:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v8, Ljava/util/ArrayList;

    .line 100
    .line 101
    iget-object v9, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->h:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v9, Ljava/util/HashSet;

    .line 104
    .line 105
    iget-object v10, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->g:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v10, Ljava/lang/Iterable;

    .line 108
    .line 109
    iget-object v15, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->f:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v15, Ljava/util/List;

    .line 112
    .line 113
    iget-object v11, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->e:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v11, Ljava/lang/String;

    .line 116
    .line 117
    iget-object v12, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->d:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v12, Ljava/lang/String;

    .line 120
    .line 121
    iget-object v13, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->c:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v13, Lcom/friday/common/MyDataBase;

    .line 124
    .line 125
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    move-object v0, v10

    .line 129
    const/4 v10, 0x3

    .line 130
    goto/16 :goto_5

    .line 131
    .line 132
    :cond_3
    iget v3, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->n:I

    .line 133
    .line 134
    iget v4, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->m:I

    .line 135
    .line 136
    iget-object v5, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->l:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v5, Lcom/friday/common/entity/ResourceEntity;

    .line 139
    .line 140
    iget-object v6, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->k:Ljava/lang/Object;

    .line 141
    .line 142
    iget-object v8, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->j:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v8, Ljava/util/Iterator;

    .line 145
    .line 146
    iget-object v9, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->i:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v9, Ljava/util/ArrayList;

    .line 149
    .line 150
    iget-object v10, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->h:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v10, Ljava/util/HashSet;

    .line 153
    .line 154
    iget-object v11, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->g:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v11, Ljava/lang/Iterable;

    .line 157
    .line 158
    iget-object v12, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->f:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v12, Ljava/util/List;

    .line 161
    .line 162
    iget-object v13, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->e:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v13, Ljava/lang/String;

    .line 165
    .line 166
    iget-object v15, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->d:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v15, Ljava/lang/String;

    .line 169
    .line 170
    iget-object v14, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->c:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v14, Lcom/friday/common/MyDataBase;

    .line 173
    .line 174
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    move v0, v4

    .line 178
    move v4, v3

    .line 179
    move v3, v0

    .line 180
    move-object v0, v13

    .line 181
    move-object v13, v5

    .line 182
    move-object v5, v6

    .line 183
    move-object v6, v8

    .line 184
    move-object v8, v9

    .line 185
    move-object v9, v10

    .line 186
    move-object v10, v11

    .line 187
    move-object v11, v0

    .line 188
    move-object v0, v15

    .line 189
    move-object v15, v12

    .line 190
    move-object v12, v0

    .line 191
    const/4 v0, 0x2

    .line 192
    goto/16 :goto_4

    .line 193
    .line 194
    :cond_4
    iget-object v3, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->e:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v3, Ljava/lang/String;

    .line 197
    .line 198
    iget-object v4, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->d:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v4, Ljava/lang/String;

    .line 201
    .line 202
    iget-object v5, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->c:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v5, Lcom/friday/common/MyDataBase;

    .line 205
    .line 206
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    move-object/from16 v17, v5

    .line 210
    .line 211
    move-object v5, v0

    .line 212
    move-object/from16 v0, v17

    .line 213
    .line 214
    goto :goto_2

    .line 215
    :cond_5
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/MyDataBase;->u()Lcom/friday/common/dao/ResourceDao;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    move-object/from16 v0, p1

    .line 223
    .line 224
    iput-object v0, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->c:Ljava/lang/Object;

    .line 225
    .line 226
    move-object/from16 v10, p2

    .line 227
    .line 228
    iput-object v10, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->d:Ljava/lang/Object;

    .line 229
    .line 230
    move-object/from16 v4, p3

    .line 231
    .line 232
    iput-object v4, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->e:Ljava/lang/Object;

    .line 233
    .line 234
    const/4 v5, 0x1

    .line 235
    iput v5, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->q:I

    .line 236
    .line 237
    const-wide/16 v5, 0x0

    .line 238
    .line 239
    const/4 v8, 0x2

    .line 240
    const/4 v9, 0x0

    .line 241
    invoke-static/range {v3 .. v9}, Lcom/friday/common/dao/ResourceDao;->c(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    if-ne v3, v1, :cond_6

    .line 246
    .line 247
    goto/16 :goto_9

    .line 248
    .line 249
    :cond_6
    move-object v5, v3

    .line 250
    move-object v4, v10

    .line 251
    move-object/from16 v3, p3

    .line 252
    .line 253
    :goto_2
    check-cast v5, Ljava/util/List;

    .line 254
    .line 255
    move-object v6, v5

    .line 256
    check-cast v6, Ljava/lang/Iterable;

    .line 257
    .line 258
    new-instance v8, Ljava/util/HashSet;

    .line 259
    .line 260
    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 261
    .line 262
    .line 263
    new-instance v9, Ljava/util/ArrayList;

    .line 264
    .line 265
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 266
    .line 267
    .line 268
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 269
    .line 270
    .line 271
    move-result-object v10

    .line 272
    const/4 v11, 0x0

    .line 273
    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 274
    .line 275
    .line 276
    move-result v12

    .line 277
    if-eqz v12, :cond_b

    .line 278
    .line 279
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v12

    .line 283
    move-object v13, v12

    .line 284
    check-cast v13, Lcom/friday/common/entity/ResourceEntity;

    .line 285
    .line 286
    invoke-virtual {v0}, Lcom/friday/common/MyDataBase;->u()Lcom/friday/common/dao/ResourceDao;

    .line 287
    .line 288
    .line 289
    move-result-object v14

    .line 290
    invoke-virtual {v13}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v15

    .line 294
    iput-object v0, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->c:Ljava/lang/Object;

    .line 295
    .line 296
    iput-object v4, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->d:Ljava/lang/Object;

    .line 297
    .line 298
    iput-object v3, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->e:Ljava/lang/Object;

    .line 299
    .line 300
    move-object/from16 p1, v0

    .line 301
    .line 302
    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    iput-object v0, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->f:Ljava/lang/Object;

    .line 307
    .line 308
    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    iput-object v0, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->g:Ljava/lang/Object;

    .line 313
    .line 314
    iput-object v8, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->h:Ljava/lang/Object;

    .line 315
    .line 316
    iput-object v9, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->i:Ljava/lang/Object;

    .line 317
    .line 318
    iput-object v10, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->j:Ljava/lang/Object;

    .line 319
    .line 320
    iput-object v12, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->k:Ljava/lang/Object;

    .line 321
    .line 322
    iput-object v13, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->l:Ljava/lang/Object;

    .line 323
    .line 324
    iput v11, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->m:I

    .line 325
    .line 326
    const/4 v0, 0x0

    .line 327
    iput v0, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->n:I

    .line 328
    .line 329
    const/4 v0, 0x2

    .line 330
    iput v0, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->q:I

    .line 331
    .line 332
    invoke-interface {v14, v15, v7}, Lcom/friday/common/dao/ResourceDao;->Z(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v14

    .line 336
    if-ne v14, v1, :cond_7

    .line 337
    .line 338
    goto/16 :goto_9

    .line 339
    .line 340
    :cond_7
    move v14, v11

    .line 341
    move-object v11, v3

    .line 342
    move v3, v14

    .line 343
    move-object v14, v10

    .line 344
    move-object v10, v6

    .line 345
    move-object v6, v14

    .line 346
    move-object v14, v9

    .line 347
    move-object v9, v8

    .line 348
    move-object v8, v14

    .line 349
    move-object/from16 v14, p1

    .line 350
    .line 351
    move-object v15, v5

    .line 352
    move-object v5, v12

    .line 353
    move-object v12, v4

    .line 354
    const/4 v4, 0x0

    .line 355
    :goto_4
    invoke-virtual {v13}, Lcom/friday/common/entity/ResourceEntity;->getResourceType()I

    .line 356
    .line 357
    .line 358
    move-result v16

    .line 359
    if-nez v16, :cond_9

    .line 360
    .line 361
    invoke-virtual {v14}, Lcom/friday/common/MyDataBase;->s()Lc2/v0;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    invoke-virtual {v13}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    iput-object v14, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->c:Ljava/lang/Object;

    .line 370
    .line 371
    iput-object v12, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->d:Ljava/lang/Object;

    .line 372
    .line 373
    iput-object v11, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->e:Ljava/lang/Object;

    .line 374
    .line 375
    move-object/from16 p1, v10

    .line 376
    .line 377
    invoke-static {v15}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v10

    .line 381
    iput-object v10, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->f:Ljava/lang/Object;

    .line 382
    .line 383
    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v10

    .line 387
    iput-object v10, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->g:Ljava/lang/Object;

    .line 388
    .line 389
    iput-object v9, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->h:Ljava/lang/Object;

    .line 390
    .line 391
    iput-object v8, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->i:Ljava/lang/Object;

    .line 392
    .line 393
    iput-object v6, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->j:Ljava/lang/Object;

    .line 394
    .line 395
    iput-object v5, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->k:Ljava/lang/Object;

    .line 396
    .line 397
    iput-object v13, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->l:Ljava/lang/Object;

    .line 398
    .line 399
    iput v3, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->m:I

    .line 400
    .line 401
    iput v4, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->n:I

    .line 402
    .line 403
    const/4 v10, 0x3

    .line 404
    iput v10, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->q:I

    .line 405
    .line 406
    invoke-interface {v0, v2, v7}, Lc2/v0;->c(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    if-ne v0, v1, :cond_8

    .line 411
    .line 412
    goto/16 :goto_9

    .line 413
    .line 414
    :cond_8
    move-object/from16 v0, p1

    .line 415
    .line 416
    move-object v4, v13

    .line 417
    move-object v13, v14

    .line 418
    :goto_5
    move-object v2, v11

    .line 419
    move v11, v3

    .line 420
    move-object v3, v2

    .line 421
    move-object v2, v9

    .line 422
    move-object v9, v8

    .line 423
    move-object v8, v2

    .line 424
    move-object v2, v6

    .line 425
    move-object v6, v0

    .line 426
    move-object v0, v13

    .line 427
    move-object v13, v4

    .line 428
    :goto_6
    move-object v4, v12

    .line 429
    goto :goto_7

    .line 430
    :cond_9
    move-object/from16 p1, v10

    .line 431
    .line 432
    const/4 v10, 0x3

    .line 433
    move-object v0, v11

    .line 434
    move v11, v3

    .line 435
    move-object v3, v0

    .line 436
    move-object v0, v9

    .line 437
    move-object v9, v8

    .line 438
    move-object v8, v0

    .line 439
    move-object v2, v6

    .line 440
    move-object v0, v14

    .line 441
    move-object/from16 v6, p1

    .line 442
    .line 443
    goto :goto_6

    .line 444
    :goto_7
    invoke-virtual {v13}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v12

    .line 448
    invoke-static {v12}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/lang/String;)Z

    .line 449
    .line 450
    .line 451
    invoke-virtual {v13}, Lcom/friday/common/entity/ResourceEntity;->getPageName()Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v12

    .line 455
    invoke-virtual {v8, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    move-result v12

    .line 459
    if-eqz v12, :cond_a

    .line 460
    .line 461
    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 462
    .line 463
    .line 464
    :cond_a
    move-object v10, v2

    .line 465
    move-object v5, v15

    .line 466
    move-object/from16 v2, p0

    .line 467
    .line 468
    goto/16 :goto_3

    .line 469
    .line 470
    :cond_b
    move-object/from16 p1, v0

    .line 471
    .line 472
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 473
    .line 474
    .line 475
    move-result v0

    .line 476
    const/4 v2, 0x0

    .line 477
    :goto_8
    if-ge v2, v0, :cond_c

    .line 478
    .line 479
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v6

    .line 483
    add-int/lit8 v2, v2, 0x1

    .line 484
    .line 485
    check-cast v6, Lcom/friday/common/entity/ResourceEntity;

    .line 486
    .line 487
    invoke-virtual {v6}, Lcom/friday/common/entity/ResourceEntity;->getPageName()Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v6

    .line 491
    invoke-static {v6}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/lang/String;)Z

    .line 492
    .line 493
    .line 494
    goto :goto_8

    .line 495
    :cond_c
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/MyDataBase;->r()Lcom/friday/common/dao/FileDao;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v2

    .line 503
    iput-object v2, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->c:Ljava/lang/Object;

    .line 504
    .line 505
    iput-object v4, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->d:Ljava/lang/Object;

    .line 506
    .line 507
    invoke-static {v3}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 508
    .line 509
    .line 510
    move-result-object v2

    .line 511
    iput-object v2, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->e:Ljava/lang/Object;

    .line 512
    .line 513
    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v2

    .line 517
    iput-object v2, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->f:Ljava/lang/Object;

    .line 518
    .line 519
    const/4 v2, 0x0

    .line 520
    iput-object v2, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->g:Ljava/lang/Object;

    .line 521
    .line 522
    iput-object v2, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->h:Ljava/lang/Object;

    .line 523
    .line 524
    iput-object v2, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->i:Ljava/lang/Object;

    .line 525
    .line 526
    iput-object v2, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->j:Ljava/lang/Object;

    .line 527
    .line 528
    iput-object v2, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->k:Ljava/lang/Object;

    .line 529
    .line 530
    iput-object v2, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->l:Ljava/lang/Object;

    .line 531
    .line 532
    const/4 v2, 0x4

    .line 533
    iput v2, v7, Lcom/friday/user/work/ClearCacheWork$deleteCacheFile$1;->q:I

    .line 534
    .line 535
    const/4 v2, 0x0

    .line 536
    invoke-interface {v0, v3, v2, v7}, Lcom/friday/common/dao/FileDao;->b0(Ljava/lang/String;ZLvc/c;)Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    if-ne v0, v1, :cond_d

    .line 541
    .line 542
    :goto_9
    return-object v1

    .line 543
    :cond_d
    move-object v1, v4

    .line 544
    :goto_a
    invoke-static {v1}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 545
    .line 546
    .line 547
    move-result v0

    .line 548
    if-nez v0, :cond_e

    .line 549
    .line 550
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 551
    .line 552
    return-object v0

    .line 553
    :cond_e
    new-instance v0, Ljava/lang/StringBuilder;

    .line 554
    .line 555
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 556
    .line 557
    .line 558
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 559
    .line 560
    .line 561
    const-string v3, "index.json"

    .line 562
    .line 563
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 564
    .line 565
    .line 566
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 567
    .line 568
    .line 569
    move-result-object v0

    .line 570
    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 571
    .line 572
    .line 573
    move-result v3

    .line 574
    if-nez v3, :cond_10

    .line 575
    .line 576
    invoke-static {v1}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 577
    .line 578
    .line 579
    move-result v0

    .line 580
    if-eqz v0, :cond_f

    .line 581
    .line 582
    invoke-static {v1}, Lcom/blankj/utilcode/util/FileUtils;->deleteAllInDir(Ljava/lang/String;)Z

    .line 583
    .line 584
    .line 585
    :cond_f
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 586
    .line 587
    return-object v0

    .line 588
    :cond_10
    new-instance v3, Ljava/io/File;

    .line 589
    .line 590
    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 591
    .line 592
    .line 593
    const/4 v0, 0x0

    .line 594
    const/4 v5, 0x1

    .line 595
    invoke-static {v3, v0, v5, v0}, Lcd/g;->e(Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    new-instance v3, Lcom/friday/user/work/ClearCacheWork$b;

    .line 600
    .line 601
    invoke-direct {v3}, Lcom/friday/user/work/ClearCacheWork$b;-><init>()V

    .line 602
    .line 603
    .line 604
    invoke-virtual {v3}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 605
    .line 606
    .line 607
    move-result-object v3

    .line 608
    new-instance v4, Lcom/google/gson/Gson;

    .line 609
    .line 610
    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    .line 611
    .line 612
    .line 613
    invoke-virtual {v4, v0, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    move-result-object v0

    .line 617
    check-cast v0, Ljava/util/ArrayList;

    .line 618
    .line 619
    if-eqz v0, :cond_12

    .line 620
    .line 621
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 622
    .line 623
    .line 624
    move-result v3

    .line 625
    move v13, v2

    .line 626
    :cond_11
    :goto_b
    if-ge v13, v3, :cond_12

    .line 627
    .line 628
    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object v2

    .line 632
    add-int/lit8 v13, v13, 0x1

    .line 633
    .line 634
    check-cast v2, Ljava/lang/String;

    .line 635
    .line 636
    new-instance v4, Ljava/io/File;

    .line 637
    .line 638
    invoke-direct {v4, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 639
    .line 640
    .line 641
    invoke-static {v4}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/io/File;)Z

    .line 642
    .line 643
    .line 644
    move-result v2

    .line 645
    if-eqz v2, :cond_11

    .line 646
    .line 647
    invoke-static {v4}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/io/File;)Z

    .line 648
    .line 649
    .line 650
    goto :goto_b

    .line 651
    :cond_12
    invoke-static {v1}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/lang/String;)Z

    .line 652
    .line 653
    .line 654
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 655
    .line 656
    return-object v0
.end method

.method public doWork(Lvc/c;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    instance-of v2, v1, Lcom/friday/user/work/ClearCacheWork$doWork$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->s:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->s:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lcom/friday/user/work/ClearCacheWork$doWork$1;-><init>(Lcom/friday/user/work/ClearCacheWork;Lvc/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->q:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget v4, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->s:I

    .line 36
    .line 37
    packed-switch v4, :pswitch_data_0

    .line 38
    .line 39
    .line 40
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v1

    .line 48
    :pswitch_0
    iget-object v3, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->i:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v3, Ljava/util/List;

    .line 51
    .line 52
    iget-object v3, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->h:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v3, Ljava/util/List;

    .line 55
    .line 56
    iget-object v3, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->g:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v3, Lcom/friday/common/dao/FileDao;

    .line 59
    .line 60
    iget-object v3, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->f:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v3, Lcom/friday/common/dao/ResourceDao;

    .line 63
    .line 64
    iget-object v3, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->e:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v3, Lc2/g2;

    .line 67
    .line 68
    iget-object v2, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->d:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v2, Lcom/friday/common/MyDataBase;

    .line 71
    .line 72
    :try_start_0
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 73
    .line 74
    .line 75
    goto/16 :goto_b

    .line 76
    .line 77
    :pswitch_1
    iget v4, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->o:I

    .line 78
    .line 79
    iget-wide v7, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->c:J

    .line 80
    .line 81
    iget-object v9, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->n:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v9, Ljava/lang/String;

    .line 84
    .line 85
    iget-object v9, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->m:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v9, Lcom/friday/common/entity/FileEntity;

    .line 88
    .line 89
    iget-object v9, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->k:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v9, Ljava/util/Iterator;

    .line 92
    .line 93
    iget-object v10, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->j:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v10, Ljava/lang/Iterable;

    .line 96
    .line 97
    iget-object v11, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->i:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v11, Ljava/util/List;

    .line 100
    .line 101
    iget-object v12, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->h:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v12, Ljava/util/List;

    .line 104
    .line 105
    iget-object v13, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->g:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v13, Lcom/friday/common/dao/FileDao;

    .line 108
    .line 109
    iget-object v14, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->f:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v14, Lcom/friday/common/dao/ResourceDao;

    .line 112
    .line 113
    iget-object v15, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->e:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v15, Lc2/g2;

    .line 116
    .line 117
    iget-object v6, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->d:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v6, Lcom/friday/common/MyDataBase;

    .line 120
    .line 121
    :try_start_1
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 122
    .line 123
    .line 124
    :goto_1
    const/4 v5, 0x0

    .line 125
    goto/16 :goto_6

    .line 126
    .line 127
    :pswitch_2
    iget v4, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->o:I

    .line 128
    .line 129
    iget-wide v6, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->c:J

    .line 130
    .line 131
    iget-object v8, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->m:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v8, Lcom/friday/common/entity/FileEntity;

    .line 134
    .line 135
    iget-object v8, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->k:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v8, Ljava/util/Iterator;

    .line 138
    .line 139
    iget-object v9, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->j:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v9, Ljava/lang/Iterable;

    .line 142
    .line 143
    iget-object v10, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->i:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v10, Ljava/util/List;

    .line 146
    .line 147
    iget-object v11, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->h:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v11, Ljava/util/List;

    .line 150
    .line 151
    iget-object v12, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->g:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v12, Lcom/friday/common/dao/FileDao;

    .line 154
    .line 155
    iget-object v13, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->f:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v13, Lcom/friday/common/dao/ResourceDao;

    .line 158
    .line 159
    iget-object v14, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->e:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v14, Lc2/g2;

    .line 162
    .line 163
    iget-object v15, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->d:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v15, Lcom/friday/common/MyDataBase;

    .line 166
    .line 167
    :try_start_2
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 168
    .line 169
    .line 170
    goto/16 :goto_7

    .line 171
    .line 172
    :pswitch_3
    iget-wide v6, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->c:J

    .line 173
    .line 174
    iget-object v4, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->h:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v4, Ljava/util/List;

    .line 177
    .line 178
    iget-object v8, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->g:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v8, Lcom/friday/common/dao/FileDao;

    .line 181
    .line 182
    iget-object v9, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->f:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v9, Lcom/friday/common/dao/ResourceDao;

    .line 185
    .line 186
    iget-object v10, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->e:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v10, Lc2/g2;

    .line 189
    .line 190
    iget-object v11, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->d:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v11, Lcom/friday/common/MyDataBase;

    .line 193
    .line 194
    :try_start_3
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 195
    .line 196
    .line 197
    goto/16 :goto_5

    .line 198
    .line 199
    :pswitch_4
    iget-wide v6, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->c:J

    .line 200
    .line 201
    iget-object v4, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->h:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v4, Ljava/util/List;

    .line 204
    .line 205
    iget-object v8, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->g:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v8, Lcom/friday/common/dao/FileDao;

    .line 208
    .line 209
    iget-object v9, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->f:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v9, Lcom/friday/common/dao/ResourceDao;

    .line 212
    .line 213
    iget-object v10, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->e:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v10, Lc2/g2;

    .line 216
    .line 217
    iget-object v11, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->d:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v11, Lcom/friday/common/MyDataBase;

    .line 220
    .line 221
    :try_start_4
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 222
    .line 223
    .line 224
    goto/16 :goto_4

    .line 225
    .line 226
    :pswitch_5
    iget v4, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->o:I

    .line 227
    .line 228
    iget-wide v6, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->c:J

    .line 229
    .line 230
    iget-object v8, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->l:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v8, Lcom/friday/common/entity/ShareCacheEntity;

    .line 233
    .line 234
    iget-object v8, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->j:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v8, Ljava/util/Iterator;

    .line 237
    .line 238
    iget-object v9, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->i:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v9, Ljava/lang/Iterable;

    .line 241
    .line 242
    iget-object v10, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->h:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast v10, Ljava/util/List;

    .line 245
    .line 246
    iget-object v11, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->g:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast v11, Lcom/friday/common/dao/FileDao;

    .line 249
    .line 250
    iget-object v12, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->f:Ljava/lang/Object;

    .line 251
    .line 252
    check-cast v12, Lcom/friday/common/dao/ResourceDao;

    .line 253
    .line 254
    iget-object v13, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->e:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v13, Lc2/g2;

    .line 257
    .line 258
    iget-object v14, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->d:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v14, Lcom/friday/common/MyDataBase;

    .line 261
    .line 262
    :try_start_5
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 263
    .line 264
    .line 265
    move-object v1, v13

    .line 266
    move-object v13, v12

    .line 267
    move-object v12, v14

    .line 268
    goto :goto_3

    .line 269
    :pswitch_6
    iget-wide v6, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->c:J

    .line 270
    .line 271
    iget-object v4, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->g:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v4, Lcom/friday/common/dao/FileDao;

    .line 274
    .line 275
    iget-object v8, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->f:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast v8, Lcom/friday/common/dao/ResourceDao;

    .line 278
    .line 279
    iget-object v9, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->e:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v9, Lc2/g2;

    .line 282
    .line 283
    iget-object v10, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->d:Ljava/lang/Object;

    .line 284
    .line 285
    check-cast v10, Lcom/friday/common/MyDataBase;

    .line 286
    .line 287
    :try_start_6
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 288
    .line 289
    .line 290
    goto :goto_2

    .line 291
    :pswitch_7
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    :try_start_7
    sget-object v1, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 295
    .line 296
    invoke-virtual {v1}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    invoke-virtual {v1}, Lcom/friday/common/helper/b;->t()J

    .line 301
    .line 302
    .line 303
    move-result-wide v6

    .line 304
    sget-object v1, Lcom/friday/common/MyDataBase;->a:Lcom/friday/common/MyDataBase$a;

    .line 305
    .line 306
    invoke-virtual {v0}, Landroidx/work/ListenableWorker;->getApplicationContext()Landroid/content/Context;

    .line 307
    .line 308
    .line 309
    move-result-object v4

    .line 310
    const-string v8, "getApplicationContext(...)"

    .line 311
    .line 312
    invoke-static {v4, v8}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v1, v4}, Lcom/friday/common/MyDataBase$a;->a(Landroid/content/Context;)Lcom/friday/common/MyDataBase;

    .line 316
    .line 317
    .line 318
    move-result-object v10

    .line 319
    invoke-virtual {v10}, Lcom/friday/common/MyDataBase;->v()Lc2/g2;

    .line 320
    .line 321
    .line 322
    move-result-object v9

    .line 323
    invoke-virtual {v10}, Lcom/friday/common/MyDataBase;->u()Lcom/friday/common/dao/ResourceDao;

    .line 324
    .line 325
    .line 326
    move-result-object v8

    .line 327
    invoke-virtual {v10}, Lcom/friday/common/MyDataBase;->r()Lcom/friday/common/dao/FileDao;

    .line 328
    .line 329
    .line 330
    move-result-object v4

    .line 331
    iput-object v10, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->d:Ljava/lang/Object;

    .line 332
    .line 333
    iput-object v9, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->e:Ljava/lang/Object;

    .line 334
    .line 335
    iput-object v8, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->f:Ljava/lang/Object;

    .line 336
    .line 337
    iput-object v4, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->g:Ljava/lang/Object;

    .line 338
    .line 339
    iput-wide v6, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->c:J

    .line 340
    .line 341
    const/4 v1, 0x1

    .line 342
    iput v1, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->s:I

    .line 343
    .line 344
    invoke-interface {v9, v6, v7, v2}, Lc2/g2;->e(JLvc/c;)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    if-ne v1, v3, :cond_1

    .line 349
    .line 350
    goto/16 :goto_a

    .line 351
    .line 352
    :cond_1
    :goto_2
    check-cast v1, Ljava/util/List;

    .line 353
    .line 354
    move-object v11, v1

    .line 355
    check-cast v11, Ljava/lang/Iterable;

    .line 356
    .line 357
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 358
    .line 359
    .line 360
    move-result-object v12

    .line 361
    move-object v13, v8

    .line 362
    move-object v8, v12

    .line 363
    move-object v12, v10

    .line 364
    move-object v10, v1

    .line 365
    move-object v1, v9

    .line 366
    move-object v9, v11

    .line 367
    move-object v11, v4

    .line 368
    const/4 v4, 0x0

    .line 369
    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 370
    .line 371
    .line 372
    move-result v14

    .line 373
    if-eqz v14, :cond_3

    .line 374
    .line 375
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v14

    .line 379
    move-object v15, v14

    .line 380
    check-cast v15, Lcom/friday/common/entity/ShareCacheEntity;

    .line 381
    .line 382
    move-object/from16 v16, v14

    .line 383
    .line 384
    invoke-virtual {v15}, Lcom/friday/common/entity/ShareCacheEntity;->getFileId()Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v14

    .line 388
    iput-object v12, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->d:Ljava/lang/Object;

    .line 389
    .line 390
    iput-object v1, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->e:Ljava/lang/Object;

    .line 391
    .line 392
    iput-object v13, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->f:Ljava/lang/Object;

    .line 393
    .line 394
    iput-object v11, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->g:Ljava/lang/Object;

    .line 395
    .line 396
    invoke-static {v10}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v5

    .line 400
    iput-object v5, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->h:Ljava/lang/Object;

    .line 401
    .line 402
    invoke-static {v9}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v5

    .line 406
    iput-object v5, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->i:Ljava/lang/Object;

    .line 407
    .line 408
    iput-object v8, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->j:Ljava/lang/Object;

    .line 409
    .line 410
    invoke-static/range {v16 .. v16}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v5

    .line 414
    iput-object v5, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->k:Ljava/lang/Object;

    .line 415
    .line 416
    invoke-static {v15}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v5

    .line 420
    iput-object v5, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->l:Ljava/lang/Object;

    .line 421
    .line 422
    iput-wide v6, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->c:J

    .line 423
    .line 424
    iput v4, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->o:I

    .line 425
    .line 426
    const/4 v5, 0x0

    .line 427
    iput v5, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->p:I

    .line 428
    .line 429
    const/4 v5, 0x2

    .line 430
    iput v5, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->s:I

    .line 431
    .line 432
    const-wide/16 v15, 0x0

    .line 433
    .line 434
    const/16 v18, 0x2

    .line 435
    .line 436
    const/16 v19, 0x0

    .line 437
    .line 438
    move-object/from16 v17, v2

    .line 439
    .line 440
    invoke-static/range {v13 .. v19}, Lcom/friday/common/dao/ResourceDao;->U(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v2

    .line 444
    move-object/from16 v5, v17

    .line 445
    .line 446
    if-ne v2, v3, :cond_2

    .line 447
    .line 448
    goto/16 :goto_a

    .line 449
    .line 450
    :cond_2
    move-object v2, v5

    .line 451
    goto :goto_3

    .line 452
    :cond_3
    move-object v5, v2

    .line 453
    iput-object v12, v5, Lcom/friday/user/work/ClearCacheWork$doWork$1;->d:Ljava/lang/Object;

    .line 454
    .line 455
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v2

    .line 459
    iput-object v2, v5, Lcom/friday/user/work/ClearCacheWork$doWork$1;->e:Ljava/lang/Object;

    .line 460
    .line 461
    invoke-static {v13}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v2

    .line 465
    iput-object v2, v5, Lcom/friday/user/work/ClearCacheWork$doWork$1;->f:Ljava/lang/Object;

    .line 466
    .line 467
    iput-object v11, v5, Lcom/friday/user/work/ClearCacheWork$doWork$1;->g:Ljava/lang/Object;

    .line 468
    .line 469
    invoke-static {v10}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v2

    .line 473
    iput-object v2, v5, Lcom/friday/user/work/ClearCacheWork$doWork$1;->h:Ljava/lang/Object;

    .line 474
    .line 475
    const/4 v2, 0x0

    .line 476
    iput-object v2, v5, Lcom/friday/user/work/ClearCacheWork$doWork$1;->i:Ljava/lang/Object;

    .line 477
    .line 478
    iput-object v2, v5, Lcom/friday/user/work/ClearCacheWork$doWork$1;->j:Ljava/lang/Object;

    .line 479
    .line 480
    iput-object v2, v5, Lcom/friday/user/work/ClearCacheWork$doWork$1;->k:Ljava/lang/Object;

    .line 481
    .line 482
    iput-object v2, v5, Lcom/friday/user/work/ClearCacheWork$doWork$1;->l:Ljava/lang/Object;

    .line 483
    .line 484
    iput-wide v6, v5, Lcom/friday/user/work/ClearCacheWork$doWork$1;->c:J

    .line 485
    .line 486
    const/4 v2, 0x3

    .line 487
    iput v2, v5, Lcom/friday/user/work/ClearCacheWork$doWork$1;->s:I

    .line 488
    .line 489
    invoke-interface {v1, v6, v7, v5}, Lc2/g2;->b(JLvc/c;)Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v2

    .line 493
    if-ne v2, v3, :cond_4

    .line 494
    .line 495
    goto/16 :goto_a

    .line 496
    .line 497
    :cond_4
    move-object v2, v5

    .line 498
    move-object v4, v10

    .line 499
    move-object v8, v11

    .line 500
    move-object v11, v12

    .line 501
    move-object v9, v13

    .line 502
    move-object v10, v1

    .line 503
    :goto_4
    sget-object v1, Lcom/friday/user/work/ClearCacheWork;->c:Ljava/lang/String;

    .line 504
    .line 505
    invoke-static {v1}, Lcom/blankj/utilcode/util/FileUtils;->deleteAllInDir(Ljava/lang/String;)Z

    .line 506
    .line 507
    .line 508
    iput-object v11, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->d:Ljava/lang/Object;

    .line 509
    .line 510
    invoke-static {v10}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v1

    .line 514
    iput-object v1, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->e:Ljava/lang/Object;

    .line 515
    .line 516
    invoke-static {v9}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object v1

    .line 520
    iput-object v1, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->f:Ljava/lang/Object;

    .line 521
    .line 522
    iput-object v8, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->g:Ljava/lang/Object;

    .line 523
    .line 524
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v1

    .line 528
    iput-object v1, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->h:Ljava/lang/Object;

    .line 529
    .line 530
    iput-wide v6, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->c:J

    .line 531
    .line 532
    const/4 v1, 0x4

    .line 533
    iput v1, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->s:I

    .line 534
    .line 535
    invoke-interface {v8, v6, v7, v2}, Lcom/friday/common/dao/FileDao;->W(JLvc/c;)Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v1

    .line 539
    if-ne v1, v3, :cond_5

    .line 540
    .line 541
    goto/16 :goto_a

    .line 542
    .line 543
    :cond_5
    :goto_5
    check-cast v1, Ljava/util/List;

    .line 544
    .line 545
    if-eqz v1, :cond_d

    .line 546
    .line 547
    move-object v5, v1

    .line 548
    check-cast v5, Ljava/util/Collection;

    .line 549
    .line 550
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 551
    .line 552
    .line 553
    move-result v5

    .line 554
    if-nez v5, :cond_d

    .line 555
    .line 556
    move-object v5, v1

    .line 557
    check-cast v5, Ljava/lang/Iterable;

    .line 558
    .line 559
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 560
    .line 561
    .line 562
    move-result-object v12

    .line 563
    move-object v13, v8

    .line 564
    move-object v14, v9

    .line 565
    move-object v15, v10

    .line 566
    move-object v9, v12

    .line 567
    move-object v12, v4

    .line 568
    move-object v10, v5

    .line 569
    move-wide v7, v6

    .line 570
    move-object v6, v11

    .line 571
    const/4 v4, 0x0

    .line 572
    move-object v11, v1

    .line 573
    :goto_6
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 574
    .line 575
    .line 576
    move-result v1

    .line 577
    if-eqz v1, :cond_c

    .line 578
    .line 579
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    move-result-object v1

    .line 583
    move-object v5, v1

    .line 584
    check-cast v5, Lcom/friday/common/entity/FileEntity;

    .line 585
    .line 586
    move-object/from16 v16, v1

    .line 587
    .line 588
    invoke-virtual {v5}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 589
    .line 590
    .line 591
    move-result-object v1

    .line 592
    move-object/from16 v17, v5

    .line 593
    .line 594
    const-string v5, "1"

    .line 595
    .line 596
    invoke-static {v1, v5}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 597
    .line 598
    .line 599
    move-result v1

    .line 600
    if-eqz v1, :cond_7

    .line 601
    .line 602
    invoke-virtual/range {v17 .. v17}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    move-result-object v1

    .line 606
    invoke-virtual/range {v17 .. v17}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 607
    .line 608
    .line 609
    move-result-object v5

    .line 610
    iput-object v6, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->d:Ljava/lang/Object;

    .line 611
    .line 612
    move-object/from16 v18, v10

    .line 613
    .line 614
    invoke-static {v15}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    move-result-object v10

    .line 618
    iput-object v10, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->e:Ljava/lang/Object;

    .line 619
    .line 620
    invoke-static {v14}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    move-result-object v10

    .line 624
    iput-object v10, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->f:Ljava/lang/Object;

    .line 625
    .line 626
    iput-object v13, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->g:Ljava/lang/Object;

    .line 627
    .line 628
    invoke-static {v12}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object v10

    .line 632
    iput-object v10, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->h:Ljava/lang/Object;

    .line 633
    .line 634
    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 635
    .line 636
    .line 637
    move-result-object v10

    .line 638
    iput-object v10, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->i:Ljava/lang/Object;

    .line 639
    .line 640
    invoke-static/range {v18 .. v18}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    move-result-object v10

    .line 644
    iput-object v10, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->j:Ljava/lang/Object;

    .line 645
    .line 646
    iput-object v9, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->k:Ljava/lang/Object;

    .line 647
    .line 648
    invoke-static/range {v16 .. v16}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 649
    .line 650
    .line 651
    move-result-object v10

    .line 652
    iput-object v10, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->l:Ljava/lang/Object;

    .line 653
    .line 654
    invoke-static/range {v17 .. v17}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 655
    .line 656
    .line 657
    move-result-object v10

    .line 658
    iput-object v10, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->m:Ljava/lang/Object;

    .line 659
    .line 660
    const/4 v10, 0x0

    .line 661
    iput-object v10, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->n:Ljava/lang/Object;

    .line 662
    .line 663
    iput-wide v7, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->c:J

    .line 664
    .line 665
    iput v4, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->o:I

    .line 666
    .line 667
    const/4 v10, 0x0

    .line 668
    iput v10, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->p:I

    .line 669
    .line 670
    const/4 v10, 0x5

    .line 671
    iput v10, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->s:I

    .line 672
    .line 673
    invoke-virtual {v0, v6, v1, v5, v2}, Lcom/friday/user/work/ClearCacheWork;->c(Lcom/friday/common/MyDataBase;Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 674
    .line 675
    .line 676
    move-result-object v1

    .line 677
    if-ne v1, v3, :cond_6

    .line 678
    .line 679
    goto/16 :goto_a

    .line 680
    .line 681
    :cond_6
    move-object v10, v11

    .line 682
    move-object v11, v12

    .line 683
    move-object v12, v13

    .line 684
    move-object v13, v14

    .line 685
    move-object v14, v15

    .line 686
    move-object v15, v6

    .line 687
    move-wide v6, v7

    .line 688
    move-object v8, v9

    .line 689
    move-object/from16 v9, v18

    .line 690
    .line 691
    :goto_7
    move-object v5, v9

    .line 692
    move-object v9, v8

    .line 693
    move-wide v7, v6

    .line 694
    move-object v6, v15

    .line 695
    move-object v15, v14

    .line 696
    move-object v14, v13

    .line 697
    move-object v13, v12

    .line 698
    move-object v12, v11

    .line 699
    move-object v11, v10

    .line 700
    move-object v10, v5

    .line 701
    goto/16 :goto_1

    .line 702
    .line 703
    :cond_7
    move-object/from16 v18, v10

    .line 704
    .line 705
    invoke-virtual/range {v17 .. v17}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 706
    .line 707
    .line 708
    move-result-object v1

    .line 709
    const-string v5, "6"

    .line 710
    .line 711
    invoke-static {v1, v5}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 712
    .line 713
    .line 714
    move-result v5
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    .line 715
    const-string v10, "11"

    .line 716
    .line 717
    if-eqz v5, :cond_8

    .line 718
    .line 719
    :try_start_8
    invoke-virtual/range {v17 .. v17}, Lcom/friday/common/entity/FileEntity;->getTxtFilePath()Ljava/lang/String;

    .line 720
    .line 721
    .line 722
    move-result-object v1

    .line 723
    goto :goto_8

    .line 724
    :cond_8
    invoke-static {v1, v10}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 725
    .line 726
    .line 727
    move-result v1

    .line 728
    if-eqz v1, :cond_9

    .line 729
    .line 730
    invoke-virtual/range {v17 .. v17}, Lcom/friday/common/entity/FileEntity;->getZipFilePath()Ljava/lang/String;

    .line 731
    .line 732
    .line 733
    move-result-object v1

    .line 734
    goto :goto_8

    .line 735
    :cond_9
    invoke-virtual/range {v17 .. v17}, Lcom/friday/common/entity/FileEntity;->getOfficePath()Ljava/lang/String;

    .line 736
    .line 737
    .line 738
    move-result-object v1

    .line 739
    :goto_8
    invoke-static {v1}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/lang/String;)Z

    .line 740
    .line 741
    .line 742
    invoke-virtual/range {v17 .. v17}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 743
    .line 744
    .line 745
    move-result-object v5

    .line 746
    invoke-static {v5, v10}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 747
    .line 748
    .line 749
    move-result v5

    .line 750
    if-eqz v5, :cond_a

    .line 751
    .line 752
    invoke-virtual/range {v17 .. v17}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 753
    .line 754
    .line 755
    move-result-object v5

    .line 756
    sget-object v10, Ljava/io/File;->separator:Ljava/lang/String;

    .line 757
    .line 758
    move-object/from16 v19, v1

    .line 759
    .line 760
    invoke-virtual/range {v17 .. v17}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 761
    .line 762
    .line 763
    move-result-object v1

    .line 764
    move-object/from16 v20, v11

    .line 765
    .line 766
    new-instance v11, Ljava/lang/StringBuilder;

    .line 767
    .line 768
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 769
    .line 770
    .line 771
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 772
    .line 773
    .line 774
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 775
    .line 776
    .line 777
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 778
    .line 779
    .line 780
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 781
    .line 782
    .line 783
    move-result-object v1

    .line 784
    invoke-static {v1}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/lang/String;)Z

    .line 785
    .line 786
    .line 787
    invoke-virtual/range {v17 .. v17}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 788
    .line 789
    .line 790
    move-result-object v1

    .line 791
    invoke-virtual/range {v17 .. v17}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 792
    .line 793
    .line 794
    move-result-object v5

    .line 795
    new-instance v11, Ljava/lang/StringBuilder;

    .line 796
    .line 797
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 798
    .line 799
    .line 800
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 801
    .line 802
    .line 803
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 804
    .line 805
    .line 806
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 807
    .line 808
    .line 809
    const-string v1, ".jpg"

    .line 810
    .line 811
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 812
    .line 813
    .line 814
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 815
    .line 816
    .line 817
    move-result-object v1

    .line 818
    invoke-static {v1}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/lang/String;)Z

    .line 819
    .line 820
    .line 821
    goto :goto_9

    .line 822
    :cond_a
    move-object/from16 v19, v1

    .line 823
    .line 824
    move-object/from16 v20, v11

    .line 825
    .line 826
    :goto_9
    invoke-virtual/range {v17 .. v17}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 827
    .line 828
    .line 829
    move-result-object v1

    .line 830
    iput-object v6, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->d:Ljava/lang/Object;

    .line 831
    .line 832
    invoke-static {v15}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 833
    .line 834
    .line 835
    move-result-object v5

    .line 836
    iput-object v5, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->e:Ljava/lang/Object;

    .line 837
    .line 838
    invoke-static {v14}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 839
    .line 840
    .line 841
    move-result-object v5

    .line 842
    iput-object v5, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->f:Ljava/lang/Object;

    .line 843
    .line 844
    iput-object v13, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->g:Ljava/lang/Object;

    .line 845
    .line 846
    invoke-static {v12}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 847
    .line 848
    .line 849
    move-result-object v5

    .line 850
    iput-object v5, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->h:Ljava/lang/Object;

    .line 851
    .line 852
    invoke-static/range {v20 .. v20}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 853
    .line 854
    .line 855
    move-result-object v5

    .line 856
    iput-object v5, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->i:Ljava/lang/Object;

    .line 857
    .line 858
    invoke-static/range {v18 .. v18}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 859
    .line 860
    .line 861
    move-result-object v5

    .line 862
    iput-object v5, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->j:Ljava/lang/Object;

    .line 863
    .line 864
    iput-object v9, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->k:Ljava/lang/Object;

    .line 865
    .line 866
    invoke-static/range {v16 .. v16}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 867
    .line 868
    .line 869
    move-result-object v5

    .line 870
    iput-object v5, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->l:Ljava/lang/Object;

    .line 871
    .line 872
    invoke-static/range {v17 .. v17}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 873
    .line 874
    .line 875
    move-result-object v5

    .line 876
    iput-object v5, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->m:Ljava/lang/Object;

    .line 877
    .line 878
    invoke-static/range {v19 .. v19}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 879
    .line 880
    .line 881
    move-result-object v5

    .line 882
    iput-object v5, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->n:Ljava/lang/Object;

    .line 883
    .line 884
    iput-wide v7, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->c:J

    .line 885
    .line 886
    iput v4, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->o:I

    .line 887
    .line 888
    const/4 v5, 0x0

    .line 889
    iput v5, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->p:I

    .line 890
    .line 891
    const/4 v10, 0x6

    .line 892
    iput v10, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->s:I

    .line 893
    .line 894
    invoke-interface {v13, v1, v5, v2}, Lcom/friday/common/dao/FileDao;->b0(Ljava/lang/String;ZLvc/c;)Ljava/lang/Object;

    .line 895
    .line 896
    .line 897
    move-result-object v1

    .line 898
    if-ne v1, v3, :cond_b

    .line 899
    .line 900
    goto :goto_a

    .line 901
    :cond_b
    move-object/from16 v10, v18

    .line 902
    .line 903
    move-object/from16 v11, v20

    .line 904
    .line 905
    goto/16 :goto_6

    .line 906
    .line 907
    :cond_c
    move-object/from16 v20, v11

    .line 908
    .line 909
    move-object v11, v6

    .line 910
    move-wide v6, v7

    .line 911
    move-object v4, v12

    .line 912
    move-object v8, v13

    .line 913
    move-object v9, v14

    .line 914
    move-object v10, v15

    .line 915
    move-object/from16 v1, v20

    .line 916
    .line 917
    :cond_d
    invoke-static {}, Lsd/r0;->c()Lsd/t1;

    .line 918
    .line 919
    .line 920
    move-result-object v5

    .line 921
    new-instance v12, Lcom/friday/user/work/ClearCacheWork$doWork$4;

    .line 922
    .line 923
    const/4 v13, 0x0

    .line 924
    invoke-direct {v12, v0, v13}, Lcom/friday/user/work/ClearCacheWork$doWork$4;-><init>(Lcom/friday/user/work/ClearCacheWork;Lvc/c;)V

    .line 925
    .line 926
    .line 927
    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 928
    .line 929
    .line 930
    move-result-object v11

    .line 931
    iput-object v11, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->d:Ljava/lang/Object;

    .line 932
    .line 933
    invoke-static {v10}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 934
    .line 935
    .line 936
    move-result-object v10

    .line 937
    iput-object v10, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->e:Ljava/lang/Object;

    .line 938
    .line 939
    invoke-static {v9}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 940
    .line 941
    .line 942
    move-result-object v9

    .line 943
    iput-object v9, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->f:Ljava/lang/Object;

    .line 944
    .line 945
    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 946
    .line 947
    .line 948
    move-result-object v8

    .line 949
    iput-object v8, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->g:Ljava/lang/Object;

    .line 950
    .line 951
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 952
    .line 953
    .line 954
    move-result-object v4

    .line 955
    iput-object v4, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->h:Ljava/lang/Object;

    .line 956
    .line 957
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 958
    .line 959
    .line 960
    move-result-object v1

    .line 961
    iput-object v1, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->i:Ljava/lang/Object;

    .line 962
    .line 963
    const/4 v10, 0x0

    .line 964
    iput-object v10, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->j:Ljava/lang/Object;

    .line 965
    .line 966
    iput-object v10, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->k:Ljava/lang/Object;

    .line 967
    .line 968
    iput-object v10, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->l:Ljava/lang/Object;

    .line 969
    .line 970
    iput-object v10, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->m:Ljava/lang/Object;

    .line 971
    .line 972
    iput-object v10, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->n:Ljava/lang/Object;

    .line 973
    .line 974
    iput-wide v6, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->c:J

    .line 975
    .line 976
    const/4 v1, 0x7

    .line 977
    iput v1, v2, Lcom/friday/user/work/ClearCacheWork$doWork$1;->s:I

    .line 978
    .line 979
    invoke-static {v5, v12, v2}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 980
    .line 981
    .line 982
    move-result-object v1

    .line 983
    if-ne v1, v3, :cond_e

    .line 984
    .line 985
    :goto_a
    return-object v3

    .line 986
    :cond_e
    :goto_b
    invoke-static {}, Lcom/blankj/utilcode/util/CleanUtils;->cleanExternalCache()Z

    .line 987
    .line 988
    .line 989
    invoke-static {}, Lcom/blankj/utilcode/util/CleanUtils;->cleanInternalCache()Z
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    .line 990
    .line 991
    .line 992
    invoke-static {}, Landroidx/work/ListenableWorker$Result;->success()Landroidx/work/ListenableWorker$Result;

    .line 993
    .line 994
    .line 995
    move-result-object v1

    .line 996
    const-string v2, "success(...)"

    .line 997
    .line 998
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 999
    .line 1000
    .line 1001
    return-object v1

    .line 1002
    :catch_0
    invoke-static {}, Landroidx/work/ListenableWorker$Result;->failure()Landroidx/work/ListenableWorker$Result;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v1

    .line 1006
    const-string v2, "failure(...)"

    .line 1007
    .line 1008
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1009
    .line 1010
    .line 1011
    return-object v1

    .line 1012
    nop

    .line 1013
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
