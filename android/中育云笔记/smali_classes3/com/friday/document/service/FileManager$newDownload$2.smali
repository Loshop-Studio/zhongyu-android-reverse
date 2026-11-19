.class final Lcom/friday/document/service/FileManager$newDownload$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/service/FileManager;->a(Ljava/util/List;Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
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
    c = "com.friday.document.service.FileManager$newDownload$2"
    f = "FileManager.kt"
    l = {
        0x1e4,
        0x1ea,
        0x1ee,
        0x1ef
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:I

.field public g:J

.field public h:I

.field public final synthetic i:Lcom/friday/common/entity/FileEntity;

.field public final synthetic j:Lcom/friday/document/service/FileManager;

.field public final synthetic k:Ljava/util/List;


# direct methods
.method public constructor <init>(Lcom/friday/common/entity/FileEntity;Lcom/friday/document/service/FileManager;Ljava/util/List;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/service/FileManager$newDownload$2;->i:Lcom/friday/common/entity/FileEntity;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/service/FileManager$newDownload$2;->j:Lcom/friday/document/service/FileManager;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/friday/document/service/FileManager$newDownload$2;->k:Ljava/util/List;

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

.method public static synthetic g(Lcom/friday/common/entity/ResourceEntity;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/document/service/FileManager$newDownload$2;->m(Lcom/friday/common/entity/ResourceEntity;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Lcom/friday/common/entity/ResourceEntity;)Ljava/lang/CharSequence;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/friday/common/entity/ResourceEntity;->getOssImageUrl()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v2, "id="

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v0, "\uff0curl="

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 3

    .line 1
    new-instance p1, Lcom/friday/document/service/FileManager$newDownload$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/service/FileManager$newDownload$2;->i:Lcom/friday/common/entity/FileEntity;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/service/FileManager$newDownload$2;->j:Lcom/friday/document/service/FileManager;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/friday/document/service/FileManager$newDownload$2;->k:Ljava/util/List;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/friday/document/service/FileManager$newDownload$2;-><init>(Lcom/friday/common/entity/FileEntity;Lcom/friday/document/service/FileManager;Ljava/util/List;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/service/FileManager$newDownload$2;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/service/FileManager$newDownload$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/service/FileManager$newDownload$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/service/FileManager$newDownload$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v2, v1, Lcom/friday/document/service/FileManager$newDownload$2;->h:I

    .line 8
    .line 9
    const/4 v3, 0x4

    .line 10
    const/4 v4, 0x3

    .line 11
    const/4 v5, 0x2

    .line 12
    const/4 v6, 0x1

    .line 13
    if-eqz v2, :cond_4

    .line 14
    .line 15
    if-eq v2, v6, :cond_3

    .line 16
    .line 17
    if-eq v2, v5, :cond_2

    .line 18
    .line 19
    if-eq v2, v4, :cond_1

    .line 20
    .line 21
    if-ne v2, v3, :cond_0

    .line 22
    .line 23
    iget-object v0, v1, Lcom/friday/document/service/FileManager$newDownload$2;->e:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v2, v0

    .line 26
    check-cast v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 27
    .line 28
    iget-object v0, v1, Lcom/friday/document/service/FileManager$newDownload$2;->d:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Ljava/util/List;

    .line 31
    .line 32
    iget-object v0, v1, Lcom/friday/document/service/FileManager$newDownload$2;->c:Ljava/lang/Object;

    .line 33
    .line 34
    move-object v3, v0

    .line 35
    check-cast v3, Ljava/lang/String;

    .line 36
    .line 37
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    goto/16 :goto_8

    .line 41
    .line 42
    :catch_0
    move-exception v0

    .line 43
    goto/16 :goto_9

    .line 44
    .line 45
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v0

    .line 53
    :cond_1
    iget-wide v4, v1, Lcom/friday/document/service/FileManager$newDownload$2;->g:J

    .line 54
    .line 55
    iget v2, v1, Lcom/friday/document/service/FileManager$newDownload$2;->f:I

    .line 56
    .line 57
    iget-object v7, v1, Lcom/friday/document/service/FileManager$newDownload$2;->e:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v7, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 60
    .line 61
    iget-object v8, v1, Lcom/friday/document/service/FileManager$newDownload$2;->d:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v8, Ljava/util/List;

    .line 64
    .line 65
    iget-object v9, v1, Lcom/friday/document/service/FileManager$newDownload$2;->c:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v9, Ljava/lang/String;

    .line 68
    .line 69
    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 70
    .line 71
    .line 72
    move-object/from16 v19, v7

    .line 73
    .line 74
    move v7, v2

    .line 75
    move-object/from16 v2, v19

    .line 76
    .line 77
    move-object/from16 v19, v9

    .line 78
    .line 79
    move-object v9, v8

    .line 80
    move-object/from16 v8, v19

    .line 81
    .line 82
    goto/16 :goto_6

    .line 83
    .line 84
    :catch_1
    move-exception v0

    .line 85
    move-object v2, v7

    .line 86
    :goto_0
    move-object v3, v9

    .line 87
    goto/16 :goto_9

    .line 88
    .line 89
    :cond_2
    iget v2, v1, Lcom/friday/document/service/FileManager$newDownload$2;->f:I

    .line 90
    .line 91
    iget-object v5, v1, Lcom/friday/document/service/FileManager$newDownload$2;->e:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v5, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 94
    .line 95
    iget-object v7, v1, Lcom/friday/document/service/FileManager$newDownload$2;->d:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v7, Ljava/util/List;

    .line 98
    .line 99
    iget-object v8, v1, Lcom/friday/document/service/FileManager$newDownload$2;->c:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v8, Ljava/lang/String;

    .line 102
    .line 103
    :try_start_2
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 104
    .line 105
    .line 106
    move-object/from16 v19, v7

    .line 107
    .line 108
    move v7, v2

    .line 109
    move-object v2, v5

    .line 110
    move-object/from16 v5, v19

    .line 111
    .line 112
    goto/16 :goto_5

    .line 113
    .line 114
    :catch_2
    move-exception v0

    .line 115
    move-object v2, v5

    .line 116
    :goto_1
    move-object v3, v8

    .line 117
    goto/16 :goto_9

    .line 118
    .line 119
    :cond_3
    iget v2, v1, Lcom/friday/document/service/FileManager$newDownload$2;->f:I

    .line 120
    .line 121
    iget-object v7, v1, Lcom/friday/document/service/FileManager$newDownload$2;->e:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v7, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 124
    .line 125
    iget-object v8, v1, Lcom/friday/document/service/FileManager$newDownload$2;->d:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v8, Ljava/util/List;

    .line 128
    .line 129
    iget-object v9, v1, Lcom/friday/document/service/FileManager$newDownload$2;->c:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v9, Ljava/lang/String;

    .line 132
    .line 133
    :try_start_3
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 134
    .line 135
    .line 136
    move-object/from16 v19, v7

    .line 137
    .line 138
    move v7, v2

    .line 139
    :goto_2
    move-object/from16 v2, v19

    .line 140
    .line 141
    goto/16 :goto_4

    .line 142
    .line 143
    :cond_4
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    iget-object v2, v1, Lcom/friday/document/service/FileManager$newDownload$2;->i:Lcom/friday/common/entity/FileEntity;

    .line 147
    .line 148
    invoke-virtual {v2}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    iget-object v7, v1, Lcom/friday/document/service/FileManager$newDownload$2;->j:Lcom/friday/document/service/FileManager;

    .line 153
    .line 154
    iget-object v8, v1, Lcom/friday/document/service/FileManager$newDownload$2;->k:Ljava/util/List;

    .line 155
    .line 156
    invoke-virtual {v7, v8}, Lcom/friday/document/service/FileManager;->x(Ljava/util/List;)Ljava/util/List;

    .line 157
    .line 158
    .line 159
    move-result-object v8

    .line 160
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 161
    .line 162
    .line 163
    move-result v7

    .line 164
    iget-object v9, v1, Lcom/friday/document/service/FileManager$newDownload$2;->k:Ljava/util/List;

    .line 165
    .line 166
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 167
    .line 168
    .line 169
    move-result v9

    .line 170
    new-instance v10, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 173
    .line 174
    .line 175
    const-string v11, "\u9875\u9762 FileManager.kt -> newDownload\uff0c\u5f00\u59cb\u4e0b\u8f7d\u8d44\u6e90\uff0c\u6587\u4ef6id="

    .line 176
    .line 177
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    const-string v11, "\uff0c\u539f\u59cb\u603b\u6570="

    .line 184
    .line 185
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    const-string v9, "\uff0c\u5b9e\u9645\u4e0b\u8f7d\u603b\u6570="

    .line 192
    .line 193
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v9

    .line 203
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v9

    .line 207
    invoke-static {v9}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    move-object v9, v8

    .line 211
    check-cast v9, Ljava/lang/Iterable;

    .line 212
    .line 213
    const/16 v10, 0x14

    .line 214
    .line 215
    invoke-static {v9, v10}, Lrc/g0;->Q0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 216
    .line 217
    .line 218
    move-result-object v9

    .line 219
    move-object v10, v9

    .line 220
    check-cast v10, Ljava/lang/Iterable;

    .line 221
    .line 222
    new-instance v16, Lcom/friday/document/service/a;

    .line 223
    .line 224
    invoke-direct/range {v16 .. v16}, Lcom/friday/document/service/a;-><init>()V

    .line 225
    .line 226
    .line 227
    const/16 v17, 0x1f

    .line 228
    .line 229
    const/16 v18, 0x0

    .line 230
    .line 231
    const/4 v11, 0x0

    .line 232
    const/4 v12, 0x0

    .line 233
    const/4 v13, 0x0

    .line 234
    const/4 v14, 0x0

    .line 235
    const/4 v15, 0x0

    .line 236
    invoke-static/range {v10 .. v18}, Lrc/g0;->w0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lhd/l;ILjava/lang/Object;)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v9

    .line 240
    new-instance v10, Ljava/lang/StringBuilder;

    .line 241
    .line 242
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 243
    .line 244
    .line 245
    const-string v11, "\u9875\u9762 FileManager.kt -> newDownload\uff0c\u4e0b\u8f7d\u8d44\u6e90\u6e05\u5355="

    .line 246
    .line 247
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v9

    .line 257
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v9

    .line 261
    invoke-static {v9}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    new-instance v9, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 265
    .line 266
    invoke-direct {v9}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 267
    .line 268
    .line 269
    :try_start_4
    move-object v10, v8

    .line 270
    check-cast v10, Ljava/lang/Iterable;

    .line 271
    .line 272
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 273
    .line 274
    .line 275
    move-result-object v10

    .line 276
    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 277
    .line 278
    .line 279
    move-result v11

    .line 280
    if-eqz v11, :cond_5

    .line 281
    .line 282
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v11

    .line 286
    check-cast v11, Lcom/friday/common/entity/ResourceEntity;

    .line 287
    .line 288
    iput-object v11, v9, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 289
    .line 290
    sget-object v12, Lcom/friday/common/helper/d;->d:Lcom/friday/common/helper/d$a;

    .line 291
    .line 292
    invoke-virtual {v12}, Lcom/friday/common/helper/d$a;->a()Lcom/friday/common/helper/d;

    .line 293
    .line 294
    .line 295
    move-result-object v13

    .line 296
    invoke-virtual {v11}, Lcom/friday/common/entity/ResourceEntity;->getOssImageUrl()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v14

    .line 300
    invoke-virtual {v11}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v15

    .line 304
    const/16 v17, 0x4

    .line 305
    .line 306
    const/16 v18, 0x0

    .line 307
    .line 308
    const/16 v16, 0x0

    .line 309
    .line 310
    invoke-static/range {v13 .. v18}, Lcom/friday/common/helper/d;->h(Lcom/friday/common/helper/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    goto :goto_3

    .line 314
    :catch_3
    move-exception v0

    .line 315
    move-object v3, v2

    .line 316
    move-object v2, v9

    .line 317
    goto/16 :goto_9

    .line 318
    .line 319
    :cond_5
    new-instance v10, Ljava/lang/StringBuilder;

    .line 320
    .line 321
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 322
    .line 323
    .line 324
    const-string v11, "\u9875\u9762 FileManager.kt -> newDownload\uff0c\u8d44\u6e90\u4e0b\u8f7d\u5b8c\u6210\uff0c\u5f00\u59cb\u540c\u6b65\u672c\u5730\u6570\u636e\u5e93\uff0c\u6587\u4ef6id="

    .line 325
    .line 326
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v10

    .line 336
    filled-new-array {v10}, [Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v10

    .line 340
    invoke-static {v10}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    iget-object v10, v1, Lcom/friday/document/service/FileManager$newDownload$2;->j:Lcom/friday/document/service/FileManager;

    .line 344
    .line 345
    invoke-static {v10}, Lcom/friday/document/service/FileManager;->k(Lcom/friday/document/service/FileManager;)Lcom/friday/common/dao/ResourceDao;

    .line 346
    .line 347
    .line 348
    move-result-object v10

    .line 349
    iput-object v2, v1, Lcom/friday/document/service/FileManager$newDownload$2;->c:Ljava/lang/Object;

    .line 350
    .line 351
    iput-object v8, v1, Lcom/friday/document/service/FileManager$newDownload$2;->d:Ljava/lang/Object;

    .line 352
    .line 353
    iput-object v9, v1, Lcom/friday/document/service/FileManager$newDownload$2;->e:Ljava/lang/Object;

    .line 354
    .line 355
    iput v7, v1, Lcom/friday/document/service/FileManager$newDownload$2;->f:I

    .line 356
    .line 357
    iput v6, v1, Lcom/friday/document/service/FileManager$newDownload$2;->h:I

    .line 358
    .line 359
    invoke-interface {v10, v2, v8, v1}, Lcom/friday/common/dao/ResourceDao;->s(Ljava/lang/String;Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v10
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 363
    if-ne v10, v0, :cond_6

    .line 364
    .line 365
    goto/16 :goto_7

    .line 366
    .line 367
    :cond_6
    move-object/from16 v19, v9

    .line 368
    .line 369
    move-object v9, v2

    .line 370
    goto/16 :goto_2

    .line 371
    .line 372
    :goto_4
    :try_start_5
    sget-object v10, Lcom/friday/document/repair/CommandImageRepairer;->a:Lcom/friday/document/repair/CommandImageRepairer;

    .line 373
    .line 374
    iget-object v11, v1, Lcom/friday/document/service/FileManager$newDownload$2;->i:Lcom/friday/common/entity/FileEntity;

    .line 375
    .line 376
    iget-object v12, v1, Lcom/friday/document/service/FileManager$newDownload$2;->j:Lcom/friday/document/service/FileManager;

    .line 377
    .line 378
    invoke-static {v12}, Lcom/friday/document/service/FileManager;->k(Lcom/friday/document/service/FileManager;)Lcom/friday/common/dao/ResourceDao;

    .line 379
    .line 380
    .line 381
    move-result-object v12

    .line 382
    iput-object v9, v1, Lcom/friday/document/service/FileManager$newDownload$2;->c:Ljava/lang/Object;

    .line 383
    .line 384
    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v13

    .line 388
    iput-object v13, v1, Lcom/friday/document/service/FileManager$newDownload$2;->d:Ljava/lang/Object;

    .line 389
    .line 390
    iput-object v2, v1, Lcom/friday/document/service/FileManager$newDownload$2;->e:Ljava/lang/Object;

    .line 391
    .line 392
    iput v7, v1, Lcom/friday/document/service/FileManager$newDownload$2;->f:I

    .line 393
    .line 394
    iput v5, v1, Lcom/friday/document/service/FileManager$newDownload$2;->h:I

    .line 395
    .line 396
    invoke-virtual {v10, v11, v8, v12, v1}, Lcom/friday/document/repair/CommandImageRepairer;->i(Lcom/friday/common/entity/FileEntity;Ljava/util/List;Lcom/friday/common/dao/ResourceDao;Lvc/c;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v5
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    .line 400
    if-ne v5, v0, :cond_7

    .line 401
    .line 402
    goto :goto_7

    .line 403
    :cond_7
    move-object v5, v8

    .line 404
    move-object v8, v9

    .line 405
    :goto_5
    :try_start_6
    sget-object v9, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 406
    .line 407
    invoke-virtual {v9}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 408
    .line 409
    .line 410
    move-result-object v9

    .line 411
    invoke-virtual {v9}, Lcom/friday/common/helper/b;->t()J

    .line 412
    .line 413
    .line 414
    move-result-wide v9

    .line 415
    iget-object v11, v1, Lcom/friday/document/service/FileManager$newDownload$2;->j:Lcom/friday/document/service/FileManager;

    .line 416
    .line 417
    invoke-static {v11}, Lcom/friday/document/service/FileManager;->k(Lcom/friday/document/service/FileManager;)Lcom/friday/common/dao/ResourceDao;

    .line 418
    .line 419
    .line 420
    move-result-object v11

    .line 421
    iput-object v8, v1, Lcom/friday/document/service/FileManager$newDownload$2;->c:Ljava/lang/Object;

    .line 422
    .line 423
    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v12

    .line 427
    iput-object v12, v1, Lcom/friday/document/service/FileManager$newDownload$2;->d:Ljava/lang/Object;

    .line 428
    .line 429
    iput-object v2, v1, Lcom/friday/document/service/FileManager$newDownload$2;->e:Ljava/lang/Object;

    .line 430
    .line 431
    iput v7, v1, Lcom/friday/document/service/FileManager$newDownload$2;->f:I

    .line 432
    .line 433
    iput-wide v9, v1, Lcom/friday/document/service/FileManager$newDownload$2;->g:J

    .line 434
    .line 435
    iput v4, v1, Lcom/friday/document/service/FileManager$newDownload$2;->h:I

    .line 436
    .line 437
    invoke-interface {v11, v8, v9, v10, v1}, Lcom/friday/common/dao/ResourceDao;->S(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v4

    .line 441
    if-ne v4, v0, :cond_8

    .line 442
    .line 443
    goto :goto_7

    .line 444
    :cond_8
    move-wide/from16 v19, v9

    .line 445
    .line 446
    move-object v9, v5

    .line 447
    move-wide/from16 v4, v19

    .line 448
    .line 449
    :goto_6
    iget-object v10, v1, Lcom/friday/document/service/FileManager$newDownload$2;->j:Lcom/friday/document/service/FileManager;

    .line 450
    .line 451
    invoke-static {v10}, Lcom/friday/document/service/FileManager;->i(Lcom/friday/document/service/FileManager;)Lcom/friday/common/dao/FileDao;

    .line 452
    .line 453
    .line 454
    move-result-object v10

    .line 455
    iput-object v8, v1, Lcom/friday/document/service/FileManager$newDownload$2;->c:Ljava/lang/Object;

    .line 456
    .line 457
    invoke-static {v9}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v9

    .line 461
    iput-object v9, v1, Lcom/friday/document/service/FileManager$newDownload$2;->d:Ljava/lang/Object;

    .line 462
    .line 463
    iput-object v2, v1, Lcom/friday/document/service/FileManager$newDownload$2;->e:Ljava/lang/Object;

    .line 464
    .line 465
    iput v7, v1, Lcom/friday/document/service/FileManager$newDownload$2;->f:I

    .line 466
    .line 467
    iput-wide v4, v1, Lcom/friday/document/service/FileManager$newDownload$2;->g:J

    .line 468
    .line 469
    iput v3, v1, Lcom/friday/document/service/FileManager$newDownload$2;->h:I

    .line 470
    .line 471
    invoke-interface {v10, v8, v6, v1}, Lcom/friday/common/dao/FileDao;->b0(Ljava/lang/String;ZLvc/c;)Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v3
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    .line 475
    if-ne v3, v0, :cond_9

    .line 476
    .line 477
    :goto_7
    return-object v0

    .line 478
    :cond_9
    move-object v3, v8

    .line 479
    :goto_8
    :try_start_7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 480
    .line 481
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 482
    .line 483
    .line 484
    const-string v4, "\u9875\u9762 FileManager.kt -> newDownload\uff0c\u4e0b\u8f7d\u5b8c\u6210\u5e76\u5df2\u66f4\u65b0\u672c\u5730\u72b6\u6001\uff0c\u6587\u4ef6id="

    .line 485
    .line 486
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 487
    .line 488
    .line 489
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 490
    .line 491
    .line 492
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    .line 501
    .line 502
    .line 503
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 504
    .line 505
    return-object v0

    .line 506
    :catch_4
    move-exception v0

    .line 507
    goto/16 :goto_1

    .line 508
    .line 509
    :catch_5
    move-exception v0

    .line 510
    goto/16 :goto_0

    .line 511
    .line 512
    :goto_9
    iget-object v4, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 513
    .line 514
    check-cast v4, Lcom/friday/common/entity/ResourceEntity;

    .line 515
    .line 516
    const/4 v5, 0x0

    .line 517
    if-eqz v4, :cond_a

    .line 518
    .line 519
    invoke-virtual {v4}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object v4

    .line 523
    goto :goto_a

    .line 524
    :cond_a
    move-object v4, v5

    .line 525
    :goto_a
    iget-object v2, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 526
    .line 527
    check-cast v2, Lcom/friday/common/entity/ResourceEntity;

    .line 528
    .line 529
    if-eqz v2, :cond_b

    .line 530
    .line 531
    invoke-virtual {v2}, Lcom/friday/common/entity/ResourceEntity;->getOssImageUrl()Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v5

    .line 535
    :cond_b
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v2

    .line 539
    new-instance v6, Ljava/lang/StringBuilder;

    .line 540
    .line 541
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 542
    .line 543
    .line 544
    const-string v7, "\u9875\u9762 FileManager.kt -> newDownload\uff0c\u4e0b\u8f7d\u4e2d\u65ad\uff0c\u6587\u4ef6id="

    .line 545
    .line 546
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 547
    .line 548
    .line 549
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 550
    .line 551
    .line 552
    const-string v3, "\uff0c\u5931\u8d25\u8d44\u6e90="

    .line 553
    .line 554
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 555
    .line 556
    .line 557
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 558
    .line 559
    .line 560
    const-string v3, "\uff0c\u5931\u8d25\u5730\u5740="

    .line 561
    .line 562
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 563
    .line 564
    .line 565
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 566
    .line 567
    .line 568
    const-string v3, "\uff0c\u5f02\u5e38="

    .line 569
    .line 570
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 571
    .line 572
    .line 573
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 574
    .line 575
    .line 576
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object v2

    .line 580
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    move-result-object v2

    .line 584
    invoke-static {v2}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 585
    .line 586
    .line 587
    throw v0
.end method
