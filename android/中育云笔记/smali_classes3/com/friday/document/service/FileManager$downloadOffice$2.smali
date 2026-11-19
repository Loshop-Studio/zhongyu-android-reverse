.class final Lcom/friday/document/service/FileManager$downloadOffice$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/service/FileManager;->e(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
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
    c = "com.friday.document.service.FileManager$downloadOffice$2"
    f = "FileManager.kt"
    l = {
        0x163,
        0x164,
        0x16a,
        0x173,
        0x174
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Z

.field public g:I

.field public final synthetic h:Lcom/friday/common/entity/FileEntity;

.field public final synthetic i:Lcom/friday/document/service/FileManager;


# direct methods
.method public constructor <init>(Lcom/friday/common/entity/FileEntity;Lcom/friday/document/service/FileManager;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->h:Lcom/friday/common/entity/FileEntity;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->i:Lcom/friday/document/service/FileManager;

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
    new-instance p1, Lcom/friday/document/service/FileManager$downloadOffice$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->h:Lcom/friday/common/entity/FileEntity;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->i:Lcom/friday/document/service/FileManager;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/document/service/FileManager$downloadOffice$2;-><init>(Lcom/friday/common/entity/FileEntity;Lcom/friday/document/service/FileManager;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/service/FileManager$downloadOffice$2;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/service/FileManager$downloadOffice$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/service/FileManager$downloadOffice$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/service/FileManager$downloadOffice$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->g:I

    .line 6
    .line 7
    const/4 v2, 0x5

    .line 8
    const/4 v3, 0x4

    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x1

    .line 12
    if-eqz v1, :cond_5

    .line 13
    .line 14
    if-eq v1, v6, :cond_4

    .line 15
    .line 16
    if-eq v1, v5, :cond_3

    .line 17
    .line 18
    if-eq v1, v4, :cond_2

    .line 19
    .line 20
    if-eq v1, v3, :cond_1

    .line 21
    .line 22
    if-ne v1, v2, :cond_0

    .line 23
    .line 24
    iget-object v0, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->e:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Ljava/lang/String;

    .line 27
    .line 28
    iget-object v0, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->d:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Ljava/lang/String;

    .line 31
    .line 32
    iget-object v0, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto/16 :goto_5

    .line 40
    .line 41
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 42
    .line 43
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v0

    .line 49
    :cond_1
    iget-object v1, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->e:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Ljava/lang/String;

    .line 52
    .line 53
    iget-object v3, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->d:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v3, Ljava/lang/String;

    .line 56
    .line 57
    iget-object v4, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->c:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v4, Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto/16 :goto_3

    .line 65
    .line 66
    :cond_2
    iget-object v0, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->d:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, Ljava/lang/String;

    .line 69
    .line 70
    iget-object v0, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->c:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, Ljava/lang/String;

    .line 73
    .line 74
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto/16 :goto_2

    .line 78
    .line 79
    :cond_3
    iget-boolean v1, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->f:Z

    .line 80
    .line 81
    iget-object v2, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->d:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v2, Ljava/lang/String;

    .line 84
    .line 85
    iget-object v3, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->c:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v3, Ljava/lang/String;

    .line 88
    .line 89
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    goto/16 :goto_1

    .line 93
    .line 94
    :cond_4
    iget-boolean v1, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->f:Z

    .line 95
    .line 96
    iget-object v2, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->d:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v2, Ljava/lang/String;

    .line 99
    .line 100
    iget-object v3, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->c:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v3, Ljava/lang/String;

    .line 103
    .line 104
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    goto/16 :goto_0

    .line 108
    .line 109
    :cond_5
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    sget-object v1, Lz1/a;->a:Lz1/a$a;

    .line 113
    .line 114
    invoke-virtual {v1}, Lz1/a$a;->a()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    sget-object v7, Ljava/io/File;->separator:Ljava/lang/String;

    .line 119
    .line 120
    iget-object v8, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->h:Lcom/friday/common/entity/FileEntity;

    .line 121
    .line 122
    invoke-virtual {v8}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v8

    .line 126
    iget-object v9, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->h:Lcom/friday/common/entity/FileEntity;

    .line 127
    .line 128
    invoke-virtual {v9}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v9

    .line 132
    new-instance v10, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const-string v1, "office"

    .line 144
    .line 145
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-static {v1}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 165
    .line 166
    .line 167
    move-result v7

    .line 168
    if-eqz v7, :cond_9

    .line 169
    .line 170
    iget-object v7, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->h:Lcom/friday/common/entity/FileEntity;

    .line 171
    .line 172
    invoke-virtual {v7}, Lcom/friday/common/entity/FileEntity;->getOfficePath()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v7

    .line 176
    invoke-static {v1, v7}, Lcom/blankj/utilcode/util/FileUtils;->move(Ljava/lang/String;Ljava/lang/String;)Z

    .line 177
    .line 178
    .line 179
    move-result v7

    .line 180
    if-eqz v7, :cond_9

    .line 181
    .line 182
    iget-object v2, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->h:Lcom/friday/common/entity/FileEntity;

    .line 183
    .line 184
    invoke-virtual {v2}, Lcom/friday/common/entity/FileEntity;->getOfficePath()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    invoke-static {v2}, Lcom/blankj/utilcode/util/FileUtils;->getFileMD5ToString(Ljava/lang/String;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    iget-object v3, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->i:Lcom/friday/document/service/FileManager;

    .line 193
    .line 194
    invoke-static {v3}, Lcom/friday/document/service/FileManager;->i(Lcom/friday/document/service/FileManager;)Lcom/friday/common/dao/FileDao;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    iget-object v8, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->h:Lcom/friday/common/entity/FileEntity;

    .line 199
    .line 200
    invoke-virtual {v8}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v8

    .line 204
    invoke-static {v2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v9

    .line 211
    iput-object v9, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->c:Ljava/lang/Object;

    .line 212
    .line 213
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v9

    .line 217
    iput-object v9, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->d:Ljava/lang/Object;

    .line 218
    .line 219
    iput-boolean v7, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->f:Z

    .line 220
    .line 221
    iput v6, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->g:I

    .line 222
    .line 223
    invoke-interface {v3, v8, v2, p0}, Lcom/friday/common/dao/FileDao;->c(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    if-ne v3, v0, :cond_6

    .line 228
    .line 229
    goto/16 :goto_4

    .line 230
    .line 231
    :cond_6
    move-object v3, v1

    .line 232
    move v1, v7

    .line 233
    :goto_0
    iget-object v7, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->i:Lcom/friday/document/service/FileManager;

    .line 234
    .line 235
    invoke-static {v7}, Lcom/friday/document/service/FileManager;->i(Lcom/friday/document/service/FileManager;)Lcom/friday/common/dao/FileDao;

    .line 236
    .line 237
    .line 238
    move-result-object v8

    .line 239
    iget-object v7, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->h:Lcom/friday/common/entity/FileEntity;

    .line 240
    .line 241
    invoke-virtual {v7}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v9

    .line 245
    iget-object v7, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->h:Lcom/friday/common/entity/FileEntity;

    .line 246
    .line 247
    invoke-virtual {v7}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v10

    .line 251
    iget-object v7, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->h:Lcom/friday/common/entity/FileEntity;

    .line 252
    .line 253
    invoke-virtual {v7}, Lcom/friday/common/entity/FileEntity;->getUpdateTime()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v12

    .line 257
    invoke-static {v3}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v7

    .line 261
    iput-object v7, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->c:Ljava/lang/Object;

    .line 262
    .line 263
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v7

    .line 267
    iput-object v7, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->d:Ljava/lang/Object;

    .line 268
    .line 269
    iput-boolean v1, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->f:Z

    .line 270
    .line 271
    iput v5, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->g:I

    .line 272
    .line 273
    const/4 v11, 0x1

    .line 274
    move-object v13, p0

    .line 275
    invoke-interface/range {v8 .. v13}, Lcom/friday/common/dao/FileDao;->a0(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v5

    .line 279
    if-ne v5, v0, :cond_7

    .line 280
    .line 281
    goto/16 :goto_4

    .line 282
    .line 283
    :cond_7
    :goto_1
    iget-object v5, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->i:Lcom/friday/document/service/FileManager;

    .line 284
    .line 285
    invoke-static {v5}, Lcom/friday/document/service/FileManager;->i(Lcom/friday/document/service/FileManager;)Lcom/friday/common/dao/FileDao;

    .line 286
    .line 287
    .line 288
    move-result-object v5

    .line 289
    iget-object v7, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->h:Lcom/friday/common/entity/FileEntity;

    .line 290
    .line 291
    invoke-virtual {v7}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v7

    .line 295
    invoke-static {v3}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v3

    .line 299
    iput-object v3, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->c:Ljava/lang/Object;

    .line 300
    .line 301
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    iput-object v2, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->d:Ljava/lang/Object;

    .line 306
    .line 307
    iput-boolean v1, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->f:Z

    .line 308
    .line 309
    iput v4, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->g:I

    .line 310
    .line 311
    invoke-interface {v5, v7, v6, p0}, Lcom/friday/common/dao/FileDao;->b0(Ljava/lang/String;ZLvc/c;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    if-ne v1, v0, :cond_8

    .line 316
    .line 317
    goto/16 :goto_4

    .line 318
    .line 319
    :cond_8
    :goto_2
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 320
    .line 321
    return-object v0

    .line 322
    :cond_9
    iget-object v4, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->h:Lcom/friday/common/entity/FileEntity;

    .line 323
    .line 324
    invoke-virtual {v4}, Lcom/friday/common/entity/FileEntity;->getRealOssUrl()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v8

    .line 328
    sget-object v4, Lcom/friday/common/helper/d;->d:Lcom/friday/common/helper/d$a;

    .line 329
    .line 330
    invoke-virtual {v4}, Lcom/friday/common/helper/d$a;->a()Lcom/friday/common/helper/d;

    .line 331
    .line 332
    .line 333
    move-result-object v7

    .line 334
    iget-object v4, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->h:Lcom/friday/common/entity/FileEntity;

    .line 335
    .line 336
    invoke-virtual {v4}, Lcom/friday/common/entity/FileEntity;->getOfficePath()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v9

    .line 340
    const/4 v11, 0x4

    .line 341
    const/4 v12, 0x0

    .line 342
    const/4 v10, 0x0

    .line 343
    invoke-static/range {v7 .. v12}, Lcom/friday/common/helper/d;->h(Lcom/friday/common/helper/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 344
    .line 345
    .line 346
    iget-object v4, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->h:Lcom/friday/common/entity/FileEntity;

    .line 347
    .line 348
    invoke-virtual {v4}, Lcom/friday/common/entity/FileEntity;->getOfficePath()Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v4

    .line 352
    invoke-static {v4}, Lcom/blankj/utilcode/util/FileUtils;->getFileMD5ToString(Ljava/lang/String;)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v4

    .line 356
    iget-object v5, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->i:Lcom/friday/document/service/FileManager;

    .line 357
    .line 358
    invoke-static {v5}, Lcom/friday/document/service/FileManager;->i(Lcom/friday/document/service/FileManager;)Lcom/friday/common/dao/FileDao;

    .line 359
    .line 360
    .line 361
    move-result-object v5

    .line 362
    iget-object v7, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->h:Lcom/friday/common/entity/FileEntity;

    .line 363
    .line 364
    invoke-virtual {v7}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v7

    .line 368
    invoke-static {v4}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v9

    .line 375
    iput-object v9, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->c:Ljava/lang/Object;

    .line 376
    .line 377
    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v9

    .line 381
    iput-object v9, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->d:Ljava/lang/Object;

    .line 382
    .line 383
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v9

    .line 387
    iput-object v9, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->e:Ljava/lang/Object;

    .line 388
    .line 389
    iput v3, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->g:I

    .line 390
    .line 391
    invoke-interface {v5, v7, v4, p0}, Lcom/friday/common/dao/FileDao;->c(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v3

    .line 395
    if-ne v3, v0, :cond_a

    .line 396
    .line 397
    goto :goto_4

    .line 398
    :cond_a
    move-object v3, v4

    .line 399
    move-object v4, v1

    .line 400
    move-object v1, v3

    .line 401
    move-object v3, v8

    .line 402
    :goto_3
    iget-object v5, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->i:Lcom/friday/document/service/FileManager;

    .line 403
    .line 404
    invoke-static {v5}, Lcom/friday/document/service/FileManager;->i(Lcom/friday/document/service/FileManager;)Lcom/friday/common/dao/FileDao;

    .line 405
    .line 406
    .line 407
    move-result-object v5

    .line 408
    iget-object v7, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->h:Lcom/friday/common/entity/FileEntity;

    .line 409
    .line 410
    invoke-virtual {v7}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v7

    .line 414
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v4

    .line 418
    iput-object v4, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->c:Ljava/lang/Object;

    .line 419
    .line 420
    invoke-static {v3}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v3

    .line 424
    iput-object v3, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->d:Ljava/lang/Object;

    .line 425
    .line 426
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v1

    .line 430
    iput-object v1, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->e:Ljava/lang/Object;

    .line 431
    .line 432
    iput v2, p0, Lcom/friday/document/service/FileManager$downloadOffice$2;->g:I

    .line 433
    .line 434
    invoke-interface {v5, v7, v6, p0}, Lcom/friday/common/dao/FileDao;->b0(Ljava/lang/String;ZLvc/c;)Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object v1

    .line 438
    if-ne v1, v0, :cond_b

    .line 439
    .line 440
    :goto_4
    return-object v0

    .line 441
    :cond_b
    :goto_5
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 442
    .line 443
    return-object v0
.end method
