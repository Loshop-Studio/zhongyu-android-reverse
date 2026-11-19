# RE note 本类字节码直接引用的读写或显示接口包括JSON。
.class final Lcom/friday/document/service/FileManager$downloadFile$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/service/FileManager;->c(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
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
    c = "com.friday.document.service.FileManager$downloadFile$2"
    f = "FileManager.kt"
    l = {
        0x18f
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

.field public j:I

.field public final synthetic k:Lcom/friday/common/entity/FileEntity;

.field public final synthetic l:Lcom/friday/document/service/FileManager;


# direct methods
.method public constructor <init>(Lcom/friday/common/entity/FileEntity;Lcom/friday/document/service/FileManager;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/service/FileManager$downloadFile$2;->k:Lcom/friday/common/entity/FileEntity;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/service/FileManager$downloadFile$2;->l:Lcom/friday/document/service/FileManager;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/friday/document/service/FileManager$downloadFile$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/service/FileManager$downloadFile$2;->k:Lcom/friday/common/entity/FileEntity;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/service/FileManager$downloadFile$2;->l:Lcom/friday/document/service/FileManager;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/document/service/FileManager$downloadFile$2;-><init>(Lcom/friday/common/entity/FileEntity;Lcom/friday/document/service/FileManager;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/service/FileManager$downloadFile$2;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/service/FileManager$downloadFile$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/service/FileManager$downloadFile$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/service/FileManager$downloadFile$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

# RE I/O 读取 JSON（Gson.fromJson）。
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

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
    iget v2, v0, Lcom/friday/document/service/FileManager$downloadFile$2;->j:I

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    if-ne v2, v3, :cond_0

    .line 13
    .line 14
    iget-object v1, v0, Lcom/friday/document/service/FileManager$downloadFile$2;->i:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Ljava/util/ArrayList;

    .line 17
    .line 18
    iget-object v1, v0, Lcom/friday/document/service/FileManager$downloadFile$2;->h:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Ljava/lang/reflect/Type;

    .line 21
    .line 22
    iget-object v1, v0, Lcom/friday/document/service/FileManager$downloadFile$2;->g:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Ljava/lang/String;

    .line 25
    .line 26
    iget-object v1, v0, Lcom/friday/document/service/FileManager$downloadFile$2;->f:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Ljava/lang/String;

    .line 29
    .line 30
    iget-object v1, v0, Lcom/friday/document/service/FileManager$downloadFile$2;->e:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Ljava/lang/String;

    .line 33
    .line 34
    iget-object v1, v0, Lcom/friday/document/service/FileManager$downloadFile$2;->d:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, Ljava/lang/String;

    .line 37
    .line 38
    iget-object v1, v0, Lcom/friday/document/service/FileManager$downloadFile$2;->c:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Ljava/lang/String;

    .line 41
    .line 42
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto/16 :goto_2

    .line 46
    .line 47
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v1

    .line 55
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object v2, v0, Lcom/friday/document/service/FileManager$downloadFile$2;->k:Lcom/friday/common/entity/FileEntity;

    .line 59
    .line 60
    invoke-virtual {v2}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    sget-object v4, Ljava/io/File;->separator:Ljava/lang/String;

    .line 65
    .line 66
    new-instance v5, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v2, "index.json"

    .line 78
    .line 79
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v8

    .line 86
    iget-object v5, v0, Lcom/friday/document/service/FileManager$downloadFile$2;->k:Lcom/friday/common/entity/FileEntity;

    .line 87
    .line 88
    invoke-virtual {v5}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    new-instance v6, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v5, "res.json"

    .line 104
    .line 105
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v11

    .line 112
    sget-object v6, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 113
    .line 114
    invoke-virtual {v6}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    iget-object v9, v0, Lcom/friday/document/service/FileManager$downloadFile$2;->k:Lcom/friday/common/entity/FileEntity;

    .line 119
    .line 120
    invoke-virtual {v9}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v9

    .line 124
    new-instance v10, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-virtual {v7, v2}, Lcom/friday/common/helper/b;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-virtual {v7, v2}, Lcom/friday/common/helper/b;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    invoke-virtual {v6}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    iget-object v6, v0, Lcom/friday/document/service/FileManager$downloadFile$2;->k:Lcom/friday/common/entity/FileEntity;

    .line 155
    .line 156
    invoke-virtual {v6}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    new-instance v9, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    invoke-virtual {v2, v4}, Lcom/friday/common/helper/b;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    invoke-virtual {v2, v4}, Lcom/friday/common/helper/b;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v10

    .line 186
    sget-object v2, Lcom/friday/common/helper/d;->d:Lcom/friday/common/helper/d$a;

    .line 187
    .line 188
    invoke-virtual {v2}, Lcom/friday/common/helper/d$a;->a()Lcom/friday/common/helper/d;

    .line 189
    .line 190
    .line 191
    move-result-object v9

    .line 192
    const/4 v13, 0x4

    .line 193
    const/4 v14, 0x0

    .line 194
    const/4 v12, 0x0

    .line 195
    invoke-static/range {v9 .. v14}, Lcom/friday/common/helper/d;->h(Lcom/friday/common/helper/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    move-object v4, v10

    .line 199
    move-object v2, v11

    .line 200
    new-instance v5, Ljava/io/File;

    .line 201
    .line 202
    invoke-direct {v5, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    const/4 v6, 0x0

    .line 206
    invoke-static {v5, v6, v3, v6}, Lcd/g;->e(Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    new-instance v6, Lcom/friday/document/service/FileManager$downloadFile$2$a;

    .line 211
    .line 212
    invoke-direct {v6}, Lcom/friday/document/service/FileManager$downloadFile$2$a;-><init>()V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v6}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 216
    .line 217
    .line 218
    move-result-object v12

    .line 219
    new-instance v6, Lcom/google/gson/Gson;

    .line 220
    .line 221
    invoke-direct {v6}, Lcom/google/gson/Gson;-><init>()V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v6, v5, v12}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v6

    .line 228
    move-object v13, v6

    .line 229
    check-cast v13, Ljava/util/ArrayList;

    .line 230
    .line 231
    if-eqz v13, :cond_3

    .line 232
    .line 233
    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    .line 234
    .line 235
    .line 236
    move-result v6

    .line 237
    if-eqz v6, :cond_2

    .line 238
    .line 239
    goto :goto_1

    .line 240
    :cond_2
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 241
    .line 242
    .line 243
    move-result v6

    .line 244
    const/4 v9, 0x0

    .line 245
    :goto_0
    if-ge v9, v6, :cond_3

    .line 246
    .line 247
    invoke-virtual {v13, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v10

    .line 251
    add-int/lit8 v9, v9, 0x1

    .line 252
    .line 253
    check-cast v10, Lcom/friday/common/entity/NoteResource;

    .line 254
    .line 255
    sget-object v11, Lcom/friday/common/helper/d;->d:Lcom/friday/common/helper/d$a;

    .line 256
    .line 257
    invoke-virtual {v11}, Lcom/friday/common/helper/d$a;->a()Lcom/friday/common/helper/d;

    .line 258
    .line 259
    .line 260
    move-result-object v14

    .line 261
    invoke-virtual {v10}, Lcom/friday/common/entity/NoteResource;->getService()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v15

    .line 265
    invoke-virtual {v10}, Lcom/friday/common/entity/NoteResource;->getLocal()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v16

    .line 269
    const/16 v18, 0x4

    .line 270
    .line 271
    const/16 v19, 0x0

    .line 272
    .line 273
    const/16 v17, 0x0

    .line 274
    .line 275
    invoke-static/range {v14 .. v19}, Lcom/friday/common/helper/d;->h(Lcom/friday/common/helper/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    goto :goto_0

    .line 279
    :cond_3
    :goto_1
    sget-object v6, Lcom/friday/common/helper/d;->d:Lcom/friday/common/helper/d$a;

    .line 280
    .line 281
    invoke-virtual {v6}, Lcom/friday/common/helper/d$a;->a()Lcom/friday/common/helper/d;

    .line 282
    .line 283
    .line 284
    move-result-object v6

    .line 285
    const/4 v10, 0x4

    .line 286
    const/4 v11, 0x0

    .line 287
    const/4 v9, 0x0

    .line 288
    invoke-static/range {v6 .. v11}, Lcom/friday/common/helper/d;->h(Lcom/friday/common/helper/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    iget-object v6, v0, Lcom/friday/document/service/FileManager$downloadFile$2;->l:Lcom/friday/document/service/FileManager;

    .line 292
    .line 293
    invoke-static {v6}, Lcom/friday/document/service/FileManager;->i(Lcom/friday/document/service/FileManager;)Lcom/friday/common/dao/FileDao;

    .line 294
    .line 295
    .line 296
    move-result-object v6

    .line 297
    iget-object v9, v0, Lcom/friday/document/service/FileManager$downloadFile$2;->k:Lcom/friday/common/entity/FileEntity;

    .line 298
    .line 299
    invoke-virtual {v9}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v9

    .line 303
    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v8

    .line 307
    iput-object v8, v0, Lcom/friday/document/service/FileManager$downloadFile$2;->c:Ljava/lang/Object;

    .line 308
    .line 309
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    iput-object v2, v0, Lcom/friday/document/service/FileManager$downloadFile$2;->d:Ljava/lang/Object;

    .line 314
    .line 315
    invoke-static {v7}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    iput-object v2, v0, Lcom/friday/document/service/FileManager$downloadFile$2;->e:Ljava/lang/Object;

    .line 320
    .line 321
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v2

    .line 325
    iput-object v2, v0, Lcom/friday/document/service/FileManager$downloadFile$2;->f:Ljava/lang/Object;

    .line 326
    .line 327
    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    iput-object v2, v0, Lcom/friday/document/service/FileManager$downloadFile$2;->g:Ljava/lang/Object;

    .line 332
    .line 333
    invoke-static {v12}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    iput-object v2, v0, Lcom/friday/document/service/FileManager$downloadFile$2;->h:Ljava/lang/Object;

    .line 338
    .line 339
    invoke-static {v13}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    iput-object v2, v0, Lcom/friday/document/service/FileManager$downloadFile$2;->i:Ljava/lang/Object;

    .line 344
    .line 345
    iput v3, v0, Lcom/friday/document/service/FileManager$downloadFile$2;->j:I

    .line 346
    .line 347
    invoke-interface {v6, v9, v3, v0}, Lcom/friday/common/dao/FileDao;->b0(Ljava/lang/String;ZLvc/c;)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    if-ne v2, v1, :cond_4

    .line 352
    .line 353
    return-object v1

    .line 354
    :cond_4
    :goto_2
    sget-object v1, Lqc/q;->a:Lqc/q;

    .line 355
    .line 356
    return-object v1
.end method
