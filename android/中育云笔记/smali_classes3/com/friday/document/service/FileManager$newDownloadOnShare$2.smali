.class final Lcom/friday/document/service/FileManager$newDownloadOnShare$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/service/FileManager;->C(Ljava/util/List;Lcom/friday/document/model/ShareFile;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.document.service.FileManager$newDownloadOnShare$2"
    f = "FileManager.kt"
    l = {
        0x207,
        0x20b,
        0x20c
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:I

.field public l:I

.field public m:J

.field public n:I

.field public final synthetic o:Lcom/friday/document/service/FileManager;

.field public final synthetic p:Ljava/util/List;

.field public final synthetic q:Lcom/friday/document/model/ShareFile;


# direct methods
.method public constructor <init>(Lcom/friday/document/service/FileManager;Ljava/util/List;Lcom/friday/document/model/ShareFile;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->o:Lcom/friday/document/service/FileManager;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->p:Ljava/util/List;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->q:Lcom/friday/document/model/ShareFile;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 3

    .line 1
    new-instance p1, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->o:Lcom/friday/document/service/FileManager;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->p:Ljava/util/List;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->q:Lcom/friday/document/model/ShareFile;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;-><init>(Lcom/friday/document/service/FileManager;Ljava/util/List;Lcom/friday/document/model/ShareFile;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v2, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->n:I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x3

    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x2

    .line 13
    if-eqz v2, :cond_3

    .line 14
    .line 15
    if-eq v2, v5, :cond_2

    .line 16
    .line 17
    if-eq v2, v6, :cond_1

    .line 18
    .line 19
    if-ne v2, v4, :cond_0

    .line 20
    .line 21
    iget-object v1, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Ljava/lang/String;

    .line 24
    .line 25
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto/16 :goto_4

    .line 29
    .line 30
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 31
    .line 32
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 33
    .line 34
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v1

    .line 38
    :cond_1
    iget-wide v2, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->m:J

    .line 39
    .line 40
    iget-object v5, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v5, Ljava/lang/String;

    .line 43
    .line 44
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto/16 :goto_2

    .line 48
    .line 49
    :cond_2
    iget v2, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->k:I

    .line 50
    .line 51
    iget-object v7, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->j:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v7, Lcom/friday/common/entity/ResourceEntity;

    .line 54
    .line 55
    iget-object v7, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->i:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v7, Ljava/lang/String;

    .line 58
    .line 59
    iget-object v7, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->h:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v7, Lcom/friday/common/entity/ResourceEntity;

    .line 62
    .line 63
    iget-object v7, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->f:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v7, Ljava/util/Iterator;

    .line 66
    .line 67
    iget-object v8, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->e:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v8, Lcom/friday/document/service/FileManager;

    .line 70
    .line 71
    iget-object v9, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->d:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v9, Ljava/lang/Iterable;

    .line 74
    .line 75
    iget-object v10, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->c:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v10, Ljava/lang/String;

    .line 78
    .line 79
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    goto/16 :goto_1

    .line 83
    .line 84
    :cond_3
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppDataPath()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    sget-object v7, Ljava/io/File;->separator:Ljava/lang/String;

    .line 92
    .line 93
    iget-object v8, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->o:Lcom/friday/document/service/FileManager;

    .line 94
    .line 95
    invoke-static {v8}, Lcom/friday/document/service/FileManager;->q(Lcom/friday/document/service/FileManager;)J

    .line 96
    .line 97
    .line 98
    move-result-wide v8

    .line 99
    new-instance v10, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string v2, "share"

    .line 111
    .line 112
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v10, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    iget-object v7, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->p:Ljava/util/List;

    .line 129
    .line 130
    check-cast v7, Ljava/lang/Iterable;

    .line 131
    .line 132
    iget-object v8, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->o:Lcom/friday/document/service/FileManager;

    .line 133
    .line 134
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 135
    .line 136
    .line 137
    move-result-object v9

    .line 138
    move-object v10, v7

    .line 139
    move-object v7, v2

    .line 140
    move v2, v3

    .line 141
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 142
    .line 143
    .line 144
    move-result v11

    .line 145
    if-eqz v11, :cond_6

    .line 146
    .line 147
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v11

    .line 151
    move-object v12, v11

    .line 152
    check-cast v12, Lcom/friday/common/entity/ResourceEntity;

    .line 153
    .line 154
    invoke-virtual {v12}, Lcom/friday/common/entity/ResourceEntity;->getResourceType()I

    .line 155
    .line 156
    .line 157
    move-result v13

    .line 158
    if-ne v13, v6, :cond_5

    .line 159
    .line 160
    invoke-static {}, Lk2/u;->a()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v13

    .line 164
    new-instance v14, Ljava/lang/StringBuilder;

    .line 165
    .line 166
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    const-string v13, ".jpg"

    .line 176
    .line 177
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v17

    .line 184
    sget-object v13, Lcom/friday/common/helper/d;->d:Lcom/friday/common/helper/d$a;

    .line 185
    .line 186
    invoke-virtual {v13}, Lcom/friday/common/helper/d$a;->a()Lcom/friday/common/helper/d;

    .line 187
    .line 188
    .line 189
    move-result-object v15

    .line 190
    invoke-virtual {v12}, Lcom/friday/common/entity/ResourceEntity;->getOssImageUrl()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v16

    .line 194
    const/16 v19, 0x4

    .line 195
    .line 196
    const/16 v20, 0x0

    .line 197
    .line 198
    const/16 v18, 0x0

    .line 199
    .line 200
    invoke-static/range {v15 .. v20}, Lcom/friday/common/helper/d;->h(Lcom/friday/common/helper/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    move-object/from16 v13, v17

    .line 204
    .line 205
    invoke-virtual {v12, v13}, Lcom/friday/common/entity/ResourceEntity;->mapSelf(Ljava/lang/String;)Lcom/friday/common/entity/ResourceEntity;

    .line 206
    .line 207
    .line 208
    move-result-object v14

    .line 209
    invoke-static {v8}, Lcom/friday/document/service/FileManager;->k(Lcom/friday/document/service/FileManager;)Lcom/friday/common/dao/ResourceDao;

    .line 210
    .line 211
    .line 212
    move-result-object v15

    .line 213
    iput-object v7, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->c:Ljava/lang/Object;

    .line 214
    .line 215
    invoke-static {v10}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    iput-object v4, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->d:Ljava/lang/Object;

    .line 220
    .line 221
    iput-object v8, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->e:Ljava/lang/Object;

    .line 222
    .line 223
    iput-object v9, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->f:Ljava/lang/Object;

    .line 224
    .line 225
    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    iput-object v4, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->g:Ljava/lang/Object;

    .line 230
    .line 231
    invoke-static {v12}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    iput-object v4, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->h:Ljava/lang/Object;

    .line 236
    .line 237
    invoke-static {v13}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v4

    .line 241
    iput-object v4, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->i:Ljava/lang/Object;

    .line 242
    .line 243
    invoke-static {v14}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v4

    .line 247
    iput-object v4, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->j:Ljava/lang/Object;

    .line 248
    .line 249
    iput v2, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->k:I

    .line 250
    .line 251
    iput v3, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->l:I

    .line 252
    .line 253
    iput v5, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->n:I

    .line 254
    .line 255
    invoke-interface {v15, v14, v0}, Lcom/friday/common/dao/ResourceDao;->E(Lcom/friday/common/entity/ResourceEntity;Lvc/c;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v4

    .line 259
    if-ne v4, v1, :cond_4

    .line 260
    .line 261
    goto/16 :goto_3

    .line 262
    .line 263
    :cond_4
    move-object/from16 v21, v10

    .line 264
    .line 265
    move-object v10, v7

    .line 266
    move-object v7, v9

    .line 267
    move-object/from16 v9, v21

    .line 268
    .line 269
    :goto_1
    move-object/from16 v21, v9

    .line 270
    .line 271
    move-object v9, v7

    .line 272
    move-object v7, v10

    .line 273
    move-object/from16 v10, v21

    .line 274
    .line 275
    :cond_5
    const/4 v4, 0x3

    .line 276
    goto/16 :goto_0

    .line 277
    .line 278
    :cond_6
    sget-object v2, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 279
    .line 280
    invoke-virtual {v2}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    invoke-virtual {v2}, Lcom/friday/common/helper/b;->t()J

    .line 285
    .line 286
    .line 287
    move-result-wide v2

    .line 288
    iget-object v4, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->o:Lcom/friday/document/service/FileManager;

    .line 289
    .line 290
    invoke-static {v4}, Lcom/friday/document/service/FileManager;->k(Lcom/friday/document/service/FileManager;)Lcom/friday/common/dao/ResourceDao;

    .line 291
    .line 292
    .line 293
    move-result-object v4

    .line 294
    iget-object v5, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->q:Lcom/friday/document/model/ShareFile;

    .line 295
    .line 296
    invoke-virtual {v5}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v5

    .line 300
    invoke-static {v7}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v8

    .line 304
    iput-object v8, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->c:Ljava/lang/Object;

    .line 305
    .line 306
    const/4 v8, 0x0

    .line 307
    iput-object v8, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->d:Ljava/lang/Object;

    .line 308
    .line 309
    iput-object v8, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->e:Ljava/lang/Object;

    .line 310
    .line 311
    iput-object v8, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->f:Ljava/lang/Object;

    .line 312
    .line 313
    iput-object v8, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->g:Ljava/lang/Object;

    .line 314
    .line 315
    iput-object v8, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->h:Ljava/lang/Object;

    .line 316
    .line 317
    iput-object v8, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->i:Ljava/lang/Object;

    .line 318
    .line 319
    iput-object v8, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->j:Ljava/lang/Object;

    .line 320
    .line 321
    iput-wide v2, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->m:J

    .line 322
    .line 323
    iput v6, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->n:I

    .line 324
    .line 325
    invoke-interface {v4, v5, v2, v3, v0}, Lcom/friday/common/dao/ResourceDao;->S(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v4

    .line 329
    if-ne v4, v1, :cond_7

    .line 330
    .line 331
    goto :goto_3

    .line 332
    :cond_7
    move-object v5, v7

    .line 333
    :goto_2
    iget-object v4, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->o:Lcom/friday/document/service/FileManager;

    .line 334
    .line 335
    invoke-static {v4}, Lcom/friday/document/service/FileManager;->l(Lcom/friday/document/service/FileManager;)Lc2/g2;

    .line 336
    .line 337
    .line 338
    move-result-object v4

    .line 339
    new-instance v6, Lcom/friday/common/entity/ShareCacheEntity;

    .line 340
    .line 341
    invoke-static {}, Lk2/u;->a()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v7

    .line 345
    const-string v8, "get32UUID(...)"

    .line 346
    .line 347
    invoke-static {v7, v8}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    iget-object v8, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->q:Lcom/friday/document/model/ShareFile;

    .line 351
    .line 352
    invoke-virtual {v8}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v8

    .line 356
    iget-object v9, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->q:Lcom/friday/document/model/ShareFile;

    .line 357
    .line 358
    invoke-virtual {v9}, Lcom/friday/document/model/ShareFile;->getVersion()I

    .line 359
    .line 360
    .line 361
    move-result v9

    .line 362
    iget-object v10, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->o:Lcom/friday/document/service/FileManager;

    .line 363
    .line 364
    invoke-static {v10}, Lcom/friday/document/service/FileManager;->q(Lcom/friday/document/service/FileManager;)J

    .line 365
    .line 366
    .line 367
    move-result-wide v10

    .line 368
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 369
    .line 370
    .line 371
    move-result-wide v12

    .line 372
    invoke-direct/range {v6 .. v13}, Lcom/friday/common/entity/ShareCacheEntity;-><init>(Ljava/lang/String;Ljava/lang/String;IJJ)V

    .line 373
    .line 374
    .line 375
    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v5

    .line 379
    iput-object v5, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->c:Ljava/lang/Object;

    .line 380
    .line 381
    iput-wide v2, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->m:J

    .line 382
    .line 383
    const/4 v2, 0x3

    .line 384
    iput v2, v0, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;->n:I

    .line 385
    .line 386
    invoke-interface {v4, v6, v0}, Lc2/g2;->g(Lcom/friday/common/entity/ShareCacheEntity;Lvc/c;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    if-ne v2, v1, :cond_8

    .line 391
    .line 392
    :goto_3
    return-object v1

    .line 393
    :cond_8
    :goto_4
    sget-object v1, Lqc/q;->a:Lqc/q;

    .line 394
    .line 395
    return-object v1
.end method
