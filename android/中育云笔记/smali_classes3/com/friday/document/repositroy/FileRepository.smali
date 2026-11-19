# RE note 本类字节码直接引用的读写或显示接口包括JSON。
.class public final Lcom/friday/document/repositroy/FileRepository;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/friday/common/dao/ResourceDao;

.field public final b:Lcom/friday/common/dao/FileDao;

.field public final c:Lc2/v0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/friday/common/dao/ResourceDao;Lcom/friday/common/dao/FileDao;Lc2/v0;)V
    .locals 1

    .line 1
    const-string v0, "resourceDao"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fileDao"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "imageSafetyDao"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/friday/document/repositroy/FileRepository;->a:Lcom/friday/common/dao/ResourceDao;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/friday/document/repositroy/FileRepository;->b:Lcom/friday/common/dao/FileDao;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/friday/document/repositroy/FileRepository;->c:Lc2/v0;

    .line 24
    .line 25
    return-void
.end method

.method public static final synthetic a(Lcom/friday/document/repositroy/FileRepository;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, Lcom/friday/document/repositroy/FileRepository;->e(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic b(Lcom/friday/document/repositroy/FileRepository;)Lcom/friday/common/dao/FileDao;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/repositroy/FileRepository;->b:Lcom/friday/common/dao/FileDao;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic c(Lcom/friday/document/repositroy/FileRepository;)Lcom/friday/common/dao/ResourceDao;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/repositroy/FileRepository;->a:Lcom/friday/common/dao/ResourceDao;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final d(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p1, p0, v2}, Lcom/friday/document/repositroy/FileRepository$clearNoteCacheInternal$2;-><init>(Lcom/friday/common/entity/FileEntity;Lcom/friday/document/repositroy/FileRepository;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p2}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    if-ne p1, p2, :cond_0

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 23
    .line 24
    return-object p1
.end method

# RE I/O 读取 JSON（Gson.fromJson）。
.method public final e(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p5

    .line 4
    .line 5
    instance-of v2, v0, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->r:I

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
    iput v3, v2, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->r:I

    .line 22
    .line 23
    :goto_0
    move-object v7, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;

    .line 26
    .line 27
    invoke-direct {v2, v1, v0}, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;-><init>(Lcom/friday/document/repositroy/FileRepository;Lvc/c;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v0, v7, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->p:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget v3, v7, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->r:I

    .line 38
    .line 39
    const/4 v10, 0x2

    .line 40
    const/4 v12, 0x1

    .line 41
    if-eqz v3, :cond_3

    .line 42
    .line 43
    if-eq v3, v12, :cond_2

    .line 44
    .line 45
    if-ne v3, v10, :cond_1

    .line 46
    .line 47
    iget v3, v7, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->n:I

    .line 48
    .line 49
    iget-object v4, v7, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->m:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v4, Lcom/friday/common/entity/ResourceEntity;

    .line 52
    .line 53
    iget-object v5, v7, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->l:Ljava/lang/Object;

    .line 54
    .line 55
    iget-object v6, v7, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->k:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v6, Ljava/util/Iterator;

    .line 58
    .line 59
    iget-object v8, v7, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->j:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v8, Ljava/util/ArrayList;

    .line 62
    .line 63
    iget-object v9, v7, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->i:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v9, Ljava/util/HashSet;

    .line 66
    .line 67
    iget-object v13, v7, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->h:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v13, Ljava/lang/Iterable;

    .line 70
    .line 71
    iget-object v14, v7, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->g:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v14, Ljava/util/List;

    .line 74
    .line 75
    iget-object v15, v7, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->f:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v15, Ljava/util/List;

    .line 78
    .line 79
    iget-object v10, v7, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->e:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v10, Ljava/util/List;

    .line 82
    .line 83
    iget-object v11, v7, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->d:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v11, Ljava/lang/String;

    .line 86
    .line 87
    iget-object v12, v7, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->c:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v12, Ljava/lang/String;

    .line 90
    .line 91
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    move-object v0, v11

    .line 95
    const/4 v11, 0x2

    .line 96
    goto/16 :goto_5

    .line 97
    .line 98
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 99
    .line 100
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 101
    .line 102
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw v0

    .line 106
    :cond_2
    iget-object v3, v7, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->f:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v3, Ljava/util/List;

    .line 109
    .line 110
    iget-object v4, v7, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->e:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v4, Ljava/util/List;

    .line 113
    .line 114
    iget-object v5, v7, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->d:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v5, Ljava/lang/String;

    .line 117
    .line 118
    iget-object v6, v7, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->c:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v6, Ljava/lang/String;

    .line 121
    .line 122
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    move-object v11, v3

    .line 126
    move-object v10, v4

    .line 127
    move-object v3, v0

    .line 128
    move-object v0, v6

    .line 129
    goto :goto_2

    .line 130
    :cond_3
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    iget-object v3, v1, Lcom/friday/document/repositroy/FileRepository;->a:Lcom/friday/common/dao/ResourceDao;

    .line 134
    .line 135
    move-object/from16 v0, p1

    .line 136
    .line 137
    iput-object v0, v7, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->c:Ljava/lang/Object;

    .line 138
    .line 139
    invoke-static/range {p2 .. p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    iput-object v4, v7, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->d:Ljava/lang/Object;

    .line 144
    .line 145
    move-object/from16 v10, p3

    .line 146
    .line 147
    iput-object v10, v7, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->e:Ljava/lang/Object;

    .line 148
    .line 149
    move-object/from16 v11, p4

    .line 150
    .line 151
    iput-object v11, v7, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->f:Ljava/lang/Object;

    .line 152
    .line 153
    const/4 v4, 0x1

    .line 154
    iput v4, v7, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->r:I

    .line 155
    .line 156
    const-wide/16 v5, 0x0

    .line 157
    .line 158
    const/4 v8, 0x2

    .line 159
    const/4 v9, 0x0

    .line 160
    move-object/from16 v4, p2

    .line 161
    .line 162
    invoke-static/range {v3 .. v9}, Lcom/friday/common/dao/ResourceDao;->c(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    if-ne v3, v2, :cond_4

    .line 167
    .line 168
    goto/16 :goto_4

    .line 169
    .line 170
    :cond_4
    move-object/from16 v5, p2

    .line 171
    .line 172
    :goto_2
    check-cast v3, Ljava/util/List;

    .line 173
    .line 174
    move-object v4, v3

    .line 175
    check-cast v4, Ljava/lang/Iterable;

    .line 176
    .line 177
    new-instance v6, Ljava/util/HashSet;

    .line 178
    .line 179
    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 180
    .line 181
    .line 182
    new-instance v8, Ljava/util/ArrayList;

    .line 183
    .line 184
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 185
    .line 186
    .line 187
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 188
    .line 189
    .line 190
    move-result-object v9

    .line 191
    move-object v12, v9

    .line 192
    move-object v9, v6

    .line 193
    move-object v6, v12

    .line 194
    move-object v12, v0

    .line 195
    move-object v14, v3

    .line 196
    move-object v13, v4

    .line 197
    move-object v15, v11

    .line 198
    const/4 v3, 0x0

    .line 199
    move-object v11, v5

    .line 200
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    if-eqz v0, :cond_8

    .line 205
    .line 206
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    move-object v4, v5

    .line 211
    check-cast v4, Lcom/friday/common/entity/ResourceEntity;

    .line 212
    .line 213
    invoke-virtual {v4}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    invoke-virtual {v4}, Lcom/friday/common/entity/ResourceEntity;->getResourceType()I

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    if-nez v0, :cond_5

    .line 225
    .line 226
    iget-object v0, v1, Lcom/friday/document/repositroy/FileRepository;->c:Lc2/v0;

    .line 227
    .line 228
    invoke-virtual {v4}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    iput-object v12, v7, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->c:Ljava/lang/Object;

    .line 233
    .line 234
    move-object/from16 p1, v11

    .line 235
    .line 236
    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v11

    .line 240
    iput-object v11, v7, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->d:Ljava/lang/Object;

    .line 241
    .line 242
    iput-object v10, v7, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->e:Ljava/lang/Object;

    .line 243
    .line 244
    iput-object v15, v7, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->f:Ljava/lang/Object;

    .line 245
    .line 246
    invoke-static {v14}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v11

    .line 250
    iput-object v11, v7, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->g:Ljava/lang/Object;

    .line 251
    .line 252
    invoke-static {v13}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v11

    .line 256
    iput-object v11, v7, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->h:Ljava/lang/Object;

    .line 257
    .line 258
    iput-object v9, v7, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->i:Ljava/lang/Object;

    .line 259
    .line 260
    iput-object v8, v7, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->j:Ljava/lang/Object;

    .line 261
    .line 262
    iput-object v6, v7, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->k:Ljava/lang/Object;

    .line 263
    .line 264
    iput-object v5, v7, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->l:Ljava/lang/Object;

    .line 265
    .line 266
    iput-object v4, v7, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->m:Ljava/lang/Object;

    .line 267
    .line 268
    iput v3, v7, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->n:I

    .line 269
    .line 270
    const/4 v11, 0x0

    .line 271
    iput v11, v7, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->o:I

    .line 272
    .line 273
    const/4 v11, 0x2

    .line 274
    iput v11, v7, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->r:I

    .line 275
    .line 276
    invoke-interface {v0, v1, v7}, Lc2/v0;->c(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    if-ne v0, v2, :cond_6

    .line 281
    .line 282
    :goto_4
    return-object v2

    .line 283
    :cond_5
    move-object/from16 p1, v11

    .line 284
    .line 285
    const/4 v11, 0x2

    .line 286
    :cond_6
    move-object/from16 v0, p1

    .line 287
    .line 288
    :goto_5
    invoke-virtual {v4}, Lcom/friday/common/entity/ResourceEntity;->getPageName()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    invoke-virtual {v9, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result v1

    .line 296
    if-eqz v1, :cond_7

    .line 297
    .line 298
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    :cond_7
    move-object/from16 v1, p0

    .line 302
    .line 303
    move-object v11, v0

    .line 304
    goto :goto_3

    .line 305
    :cond_8
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 306
    .line 307
    .line 308
    move-result v0

    .line 309
    const/4 v1, 0x0

    .line 310
    :goto_6
    if-ge v1, v0, :cond_9

    .line 311
    .line 312
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    add-int/lit8 v1, v1, 0x1

    .line 317
    .line 318
    check-cast v2, Lcom/friday/common/entity/ResourceEntity;

    .line 319
    .line 320
    new-instance v3, Ljava/io/File;

    .line 321
    .line 322
    invoke-virtual {v2}, Lcom/friday/common/entity/ResourceEntity;->getPageName()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    invoke-interface {v15, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    goto :goto_6

    .line 333
    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 334
    .line 335
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    const-string v1, "index.json"

    .line 342
    .line 343
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 351
    .line 352
    .line 353
    move-result v1

    .line 354
    if-eqz v1, :cond_b

    .line 355
    .line 356
    new-instance v1, Ljava/io/File;

    .line 357
    .line 358
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    const/4 v2, 0x0

    .line 362
    const/4 v4, 0x1

    .line 363
    invoke-static {v1, v2, v4, v2}, Lcd/g;->e(Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    new-instance v1, Lcom/friday/document/repositroy/FileRepository$a;

    .line 368
    .line 369
    invoke-direct {v1}, Lcom/friday/document/repositroy/FileRepository$a;-><init>()V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    :try_start_0
    sget-object v3, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 377
    .line 378
    new-instance v3, Lcom/google/gson/Gson;

    .line 379
    .line 380
    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    .line 381
    .line 382
    .line 383
    invoke-virtual {v3, v0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    check-cast v0, Ljava/util/ArrayList;

    .line 388
    .line 389
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 393
    goto :goto_7

    .line 394
    :catchall_0
    move-exception v0

    .line 395
    sget-object v1, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 396
    .line 397
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    :goto_7
    invoke-static {v0}, Lkotlin/Result;->g(Ljava/lang/Object;)Z

    .line 406
    .line 407
    .line 408
    move-result v1

    .line 409
    if-eqz v1, :cond_a

    .line 410
    .line 411
    goto :goto_8

    .line 412
    :cond_a
    move-object v2, v0

    .line 413
    :goto_8
    check-cast v2, Ljava/util/ArrayList;

    .line 414
    .line 415
    if-eqz v2, :cond_b

    .line 416
    .line 417
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 418
    .line 419
    .line 420
    move-result v0

    .line 421
    const/4 v11, 0x0

    .line 422
    :goto_9
    if-ge v11, v0, :cond_b

    .line 423
    .line 424
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v1

    .line 428
    add-int/lit8 v11, v11, 0x1

    .line 429
    .line 430
    check-cast v1, Ljava/lang/String;

    .line 431
    .line 432
    new-instance v3, Ljava/io/File;

    .line 433
    .line 434
    invoke-direct {v3, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    invoke-interface {v15, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    goto :goto_9

    .line 441
    :cond_b
    new-instance v0, Ljava/io/File;

    .line 442
    .line 443
    invoke-direct {v0, v12}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 444
    .line 445
    .line 446
    invoke-interface {v15, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 447
    .line 448
    .line 449
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 450
    .line 451
    return-object v0
.end method
