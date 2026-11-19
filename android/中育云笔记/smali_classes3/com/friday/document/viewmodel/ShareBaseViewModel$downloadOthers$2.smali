# RE note 本类字节码直接引用的读写或显示接口包括JSON。
.class final Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/ShareBaseViewModel;->w(Lcom/friday/document/model/ShareFile;Lvc/c;)Ljava/lang/Object;
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
    c = "com.friday.document.viewmodel.ShareBaseViewModel$downloadOthers$2"
    f = "ShareBaseViewModel.kt"
    l = {
        0xe7,
        0xf2
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

.field public k:Ljava/lang/Object;

.field public l:I

.field public m:I

.field public final synthetic n:Lcom/friday/document/viewmodel/ShareBaseViewModel;

.field public final synthetic o:Lcom/friday/document/model/ShareFile;


# direct methods
.method public constructor <init>(Lcom/friday/document/viewmodel/ShareBaseViewModel;Lcom/friday/document/model/ShareFile;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->n:Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->o:Lcom/friday/document/model/ShareFile;

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
    new-instance p1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->n:Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->o:Lcom/friday/document/model/ShareFile;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;-><init>(Lcom/friday/document/viewmodel/ShareBaseViewModel;Lcom/friday/document/model/ShareFile;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

# RE I/O 读取 JSON（Gson.fromJson）。
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    iget v0, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->m:I

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    const/4 v4, 0x2

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    if-eq v0, v3, :cond_1

    .line 14
    .line 15
    if-ne v0, v4, :cond_0

    .line 16
    .line 17
    iget-object v0, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->d:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Ljava/lang/String;

    .line 20
    .line 21
    iget-object v0, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Ljava/lang/String;

    .line 24
    .line 25
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto/16 :goto_7

    .line 29
    .line 30
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 31
    .line 32
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 33
    .line 34
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v0

    .line 38
    :cond_1
    iget-object v0, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->k:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Lcom/friday/document/model/ConvertEntity;

    .line 41
    .line 42
    iget-object v0, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->j:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Ljava/lang/String;

    .line 45
    .line 46
    iget-object v0, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->i:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Lje/y;

    .line 49
    .line 50
    iget-object v0, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->h:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Lje/v;

    .line 53
    .line 54
    iget-object v0, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->g:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Ljava/lang/String;

    .line 57
    .line 58
    iget-object v0, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->f:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Ljava/lang/String;

    .line 61
    .line 62
    iget-object v0, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->e:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Lcom/alibaba/sdk/android/oss/ServiceException;

    .line 65
    .line 66
    iget-object v0, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->d:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, Ljava/lang/String;

    .line 69
    .line 70
    iget-object v0, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->c:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, Ljava/lang/String;

    .line 73
    .line 74
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto/16 :goto_3

    .line 78
    .line 79
    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    iget-object v0, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->n:Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 83
    .line 84
    iget-object v5, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->o:Lcom/friday/document/model/ShareFile;

    .line 85
    .line 86
    invoke-virtual {v5}, Lcom/friday/document/model/ShareFile;->getFileUrl()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    const-string v13, "et"

    .line 91
    .line 92
    const-string v14, "dps"

    .line 93
    .line 94
    const-string v6, "doc"

    .line 95
    .line 96
    const-string v7, "docx"

    .line 97
    .line 98
    const-string v8, "ppt"

    .line 99
    .line 100
    const-string v9, "pptx"

    .line 101
    .line 102
    const-string v10, "xls"

    .line 103
    .line 104
    const-string v11, "xlsx"

    .line 105
    .line 106
    const-string v12, "wps"

    .line 107
    .line 108
    filled-new-array/range {v6 .. v14}, [Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    invoke-static {v0, v5, v6}, Lcom/friday/document/viewmodel/ShareBaseViewModel;->f(Lcom/friday/document/viewmodel/ShareBaseViewModel;Ljava/lang/String;[Ljava/lang/String;)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_3

    .line 117
    .line 118
    iget-object v0, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->o:Lcom/friday/document/model/ShareFile;

    .line 119
    .line 120
    invoke-virtual {v0}, Lcom/friday/document/model/ShareFile;->getFileUrl()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    const/4 v9, 0x4

    .line 125
    const/4 v10, 0x0

    .line 126
    const-string v6, "."

    .line 127
    .line 128
    const-string v7, "pdf"

    .line 129
    .line 130
    const/4 v8, 0x0

    .line 131
    invoke-static/range {v5 .. v10}, Lqd/c0;->B0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    :goto_0
    move-object v6, v0

    .line 136
    goto :goto_1

    .line 137
    :cond_3
    iget-object v0, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->o:Lcom/friday/document/model/ShareFile;

    .line 138
    .line 139
    invoke-virtual {v0}, Lcom/friday/document/model/ShareFile;->getFileUrl()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    goto :goto_0

    .line 144
    :goto_1
    iget-object v0, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->o:Lcom/friday/document/model/ShareFile;

    .line 145
    .line 146
    invoke-virtual {v0}, Lcom/friday/document/model/ShareFile;->getOthersPath()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    iget-object v0, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->o:Lcom/friday/document/model/ShareFile;

    .line 151
    .line 152
    invoke-virtual {v0}, Lcom/friday/document/model/ShareFile;->isOfficeFile()Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    if-eqz v0, :cond_a

    .line 157
    .line 158
    :try_start_0
    sget-object v0, Lcom/friday/common/helper/d;->d:Lcom/friday/common/helper/d$a;

    .line 159
    .line 160
    invoke-virtual {v0}, Lcom/friday/common/helper/d$a;->a()Lcom/friday/common/helper/d;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    const/4 v9, 0x4

    .line 165
    const/4 v10, 0x0

    .line 166
    const/4 v8, 0x0

    .line 167
    invoke-static/range {v5 .. v10}, Lcom/friday/common/helper/d;->h(Lcom/friday/common/helper/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    :try_end_0
    .catch Lcom/alibaba/sdk/android/oss/ServiceException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 168
    .line 169
    .line 170
    goto/16 :goto_5

    .line 171
    .line 172
    :catch_0
    move-exception v0

    .line 173
    goto/16 :goto_4

    .line 174
    .line 175
    :catch_1
    move-exception v0

    .line 176
    invoke-virtual {v0}, Lcom/alibaba/sdk/android/oss/ServiceException;->getStatusCode()I

    .line 177
    .line 178
    .line 179
    move-result v5

    .line 180
    const/16 v8, 0x194

    .line 181
    .line 182
    if-ne v5, v8, :cond_9

    .line 183
    .line 184
    iget-object v5, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->o:Lcom/friday/document/model/ShareFile;

    .line 185
    .line 186
    invoke-virtual {v5}, Lcom/friday/document/model/ShareFile;->getFileUrl()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    const-string v8, "http"

    .line 191
    .line 192
    const/4 v9, 0x0

    .line 193
    const/4 v10, 0x0

    .line 194
    invoke-static {v5, v8, v10, v4, v9}, Lqd/z;->O(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v5

    .line 198
    if-eqz v5, :cond_4

    .line 199
    .line 200
    iget-object v5, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->o:Lcom/friday/document/model/ShareFile;

    .line 201
    .line 202
    invoke-virtual {v5}, Lcom/friday/document/model/ShareFile;->getFileUrl()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v5

    .line 206
    goto :goto_2

    .line 207
    :cond_4
    sget-object v5, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 208
    .line 209
    invoke-virtual {v5}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 210
    .line 211
    .line 212
    move-result-object v5

    .line 213
    iget-object v8, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->o:Lcom/friday/document/model/ShareFile;

    .line 214
    .line 215
    invoke-virtual {v8}, Lcom/friday/document/model/ShareFile;->getFileUrl()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v8

    .line 219
    invoke-virtual {v5, v8}, Lcom/friday/common/helper/b;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v5

    .line 223
    :goto_2
    new-instance v8, Ljava/lang/StringBuilder;

    .line 224
    .line 225
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 226
    .line 227
    .line 228
    const-string v9, "http://sfs.zykj.org:8085/OfficeConvertToPdf/Convert?pptUrl="

    .line 229
    .line 230
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v8

    .line 240
    iget-object v9, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->n:Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 241
    .line 242
    invoke-static {v9}, Lcom/friday/document/viewmodel/ShareBaseViewModel;->h(Lcom/friday/document/viewmodel/ShareBaseViewModel;)Ljava/util/HashMap;

    .line 243
    .line 244
    .line 245
    move-result-object v9

    .line 246
    invoke-static {v10}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 247
    .line 248
    .line 249
    move-result-object v11

    .line 250
    invoke-virtual {v9, v8, v11}, Ljava/util/HashMap;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v9

    .line 254
    const-string v11, "getOrDefault(...)"

    .line 255
    .line 256
    invoke-static {v9, v11}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    check-cast v9, Ljava/lang/Number;

    .line 260
    .line 261
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 262
    .line 263
    .line 264
    move-result v9

    .line 265
    if-ge v9, v4, :cond_8

    .line 266
    .line 267
    iget-object v4, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->n:Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 268
    .line 269
    invoke-static {v4}, Lcom/friday/document/viewmodel/ShareBaseViewModel;->h(Lcom/friday/document/viewmodel/ShareBaseViewModel;)Ljava/util/HashMap;

    .line 270
    .line 271
    .line 272
    move-result-object v4

    .line 273
    add-int/lit8 v10, v9, 0x1

    .line 274
    .line 275
    invoke-static {v10}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 276
    .line 277
    .line 278
    move-result-object v10

    .line 279
    invoke-interface {v4, v8, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    new-instance v4, Lje/v$a;

    .line 283
    .line 284
    invoke-direct {v4}, Lje/v$a;-><init>()V

    .line 285
    .line 286
    .line 287
    sget-object v10, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 288
    .line 289
    const-wide/16 v11, 0xc8

    .line 290
    .line 291
    invoke-virtual {v4, v11, v12, v10}, Lje/v$a;->e(JLjava/util/concurrent/TimeUnit;)Lje/v$a;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    invoke-virtual {v4, v11, v12, v10}, Lje/v$a;->O(JLjava/util/concurrent/TimeUnit;)Lje/v$a;

    .line 296
    .line 297
    .line 298
    move-result-object v4

    .line 299
    invoke-virtual {v4, v11, v12, v10}, Lje/v$a;->R(JLjava/util/concurrent/TimeUnit;)Lje/v$a;

    .line 300
    .line 301
    .line 302
    move-result-object v4

    .line 303
    invoke-virtual {v4}, Lje/v$a;->c()Lje/v;

    .line 304
    .line 305
    .line 306
    move-result-object v4

    .line 307
    new-instance v10, Lje/w$a;

    .line 308
    .line 309
    invoke-direct {v10}, Lje/w$a;-><init>()V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v10}, Lje/w$a;->f()Lje/w$a;

    .line 313
    .line 314
    .line 315
    move-result-object v10

    .line 316
    invoke-virtual {v10, v8}, Lje/w$a;->p(Ljava/lang/String;)Lje/w$a;

    .line 317
    .line 318
    .line 319
    move-result-object v10

    .line 320
    invoke-virtual {v10}, Lje/w$a;->b()Lje/w;

    .line 321
    .line 322
    .line 323
    move-result-object v10

    .line 324
    invoke-virtual {v4, v10}, Lje/v;->b(Lje/w;)Lje/e;

    .line 325
    .line 326
    .line 327
    move-result-object v10

    .line 328
    invoke-interface {v10}, Lje/e;->execute()Lje/y;

    .line 329
    .line 330
    .line 331
    move-result-object v10

    .line 332
    invoke-virtual {v10}, Lje/y;->e()Lje/z;

    .line 333
    .line 334
    .line 335
    move-result-object v11

    .line 336
    if-eqz v11, :cond_7

    .line 337
    .line 338
    invoke-virtual {v11}, Lje/z;->string()Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v11

    .line 342
    if-eqz v11, :cond_7

    .line 343
    .line 344
    :try_start_1
    new-instance v12, Lcom/google/gson/Gson;

    .line 345
    .line 346
    invoke-direct {v12}, Lcom/google/gson/Gson;-><init>()V

    .line 347
    .line 348
    .line 349
    const-class v13, Lcom/friday/document/model/ConvertEntity;

    .line 350
    .line 351
    invoke-virtual {v12, v11, v13}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v12

    .line 355
    check-cast v12, Lcom/friday/document/model/ConvertEntity;
    :try_end_1
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 356
    .line 357
    invoke-virtual {v12}, Lcom/friday/document/model/ConvertEntity;->getSuccess()Z

    .line 358
    .line 359
    .line 360
    move-result v13

    .line 361
    if-eqz v13, :cond_6

    .line 362
    .line 363
    iget-object v13, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->n:Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 364
    .line 365
    iget-object v14, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->o:Lcom/friday/document/model/ShareFile;

    .line 366
    .line 367
    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v6

    .line 371
    iput-object v6, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->c:Ljava/lang/Object;

    .line 372
    .line 373
    invoke-static {v7}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v6

    .line 377
    iput-object v6, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->d:Ljava/lang/Object;

    .line 378
    .line 379
    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    iput-object v0, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->e:Ljava/lang/Object;

    .line 384
    .line 385
    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    iput-object v0, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->f:Ljava/lang/Object;

    .line 390
    .line 391
    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    iput-object v0, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->g:Ljava/lang/Object;

    .line 396
    .line 397
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    iput-object v0, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->h:Ljava/lang/Object;

    .line 402
    .line 403
    invoke-static {v10}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    iput-object v0, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->i:Ljava/lang/Object;

    .line 408
    .line 409
    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    iput-object v0, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->j:Ljava/lang/Object;

    .line 414
    .line 415
    invoke-static {v12}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    iput-object v0, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->k:Ljava/lang/Object;

    .line 420
    .line 421
    iput v9, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->l:I

    .line 422
    .line 423
    iput v3, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->m:I

    .line 424
    .line 425
    invoke-virtual {v13, v14, v1}, Lcom/friday/document/viewmodel/ShareBaseViewModel;->w(Lcom/friday/document/model/ShareFile;Lvc/c;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    if-ne v0, v2, :cond_5

    .line 430
    .line 431
    goto/16 :goto_6

    .line 432
    .line 433
    :cond_5
    :goto_3
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 434
    .line 435
    return-object v0

    .line 436
    :cond_6
    new-instance v0, Ljava/lang/Exception;

    .line 437
    .line 438
    const-string v2, "\u4e0b\u8f7d\u5931\u8d25\uff0c\u8f6c\u6362\u63a5\u53e3\u8fd4\u56de\u5931\u8d25"

    .line 439
    .line 440
    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 441
    .line 442
    .line 443
    throw v0

    .line 444
    :goto_4
    throw v0

    .line 445
    :catch_2
    new-instance v0, Ljava/lang/Exception;

    .line 446
    .line 447
    const-string v2, "\u4e0b\u8f7d\u5931\u8d25\uff0c\u89e3\u6790\u5931\u8d25"

    .line 448
    .line 449
    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 450
    .line 451
    .line 452
    throw v0

    .line 453
    :cond_7
    new-instance v0, Ljava/lang/Exception;

    .line 454
    .line 455
    const-string v2, "\u4e0b\u8f7d\u5931\u8d25\uff0c\u8fd4\u56de\u4e3a\u7a7a"

    .line 456
    .line 457
    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 458
    .line 459
    .line 460
    throw v0

    .line 461
    :cond_8
    iget-object v0, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->n:Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 462
    .line 463
    invoke-static {v0}, Lcom/friday/document/viewmodel/ShareBaseViewModel;->h(Lcom/friday/document/viewmodel/ShareBaseViewModel;)Ljava/util/HashMap;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    invoke-static {v10}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 468
    .line 469
    .line 470
    move-result-object v2

    .line 471
    invoke-interface {v0, v8, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    new-instance v0, Ljava/lang/Exception;

    .line 475
    .line 476
    const-string v2, "\u4e0b\u8f7d\u5931\u8d25\uff0c\u91cd\u8bd5\u6b21\u6570\u8d85\u8fc72\u6b21"

    .line 477
    .line 478
    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 479
    .line 480
    .line 481
    throw v0

    .line 482
    :cond_9
    throw v0

    .line 483
    :cond_a
    iget-object v0, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->o:Lcom/friday/document/model/ShareFile;

    .line 484
    .line 485
    invoke-virtual {v0}, Lcom/friday/document/model/ShareFile;->getType()Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    const-string v3, "9"

    .line 490
    .line 491
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 492
    .line 493
    .line 494
    move-result v0

    .line 495
    if-nez v0, :cond_b

    .line 496
    .line 497
    iget-object v0, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->o:Lcom/friday/document/model/ShareFile;

    .line 498
    .line 499
    invoke-virtual {v0}, Lcom/friday/document/model/ShareFile;->getType()Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    const-string v3, "8"

    .line 504
    .line 505
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 506
    .line 507
    .line 508
    move-result v0

    .line 509
    if-nez v0, :cond_b

    .line 510
    .line 511
    sget-object v0, Lcom/friday/common/helper/d;->d:Lcom/friday/common/helper/d$a;

    .line 512
    .line 513
    invoke-virtual {v0}, Lcom/friday/common/helper/d$a;->a()Lcom/friday/common/helper/d;

    .line 514
    .line 515
    .line 516
    move-result-object v5

    .line 517
    const/4 v9, 0x4

    .line 518
    const/4 v10, 0x0

    .line 519
    const/4 v8, 0x0

    .line 520
    invoke-static/range {v5 .. v10}, Lcom/friday/common/helper/d;->h(Lcom/friday/common/helper/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 521
    .line 522
    .line 523
    :cond_b
    :goto_5
    iget-object v0, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->n:Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 524
    .line 525
    invoke-static {v0}, Lcom/friday/document/viewmodel/ShareBaseViewModel;->i(Lcom/friday/document/viewmodel/ShareBaseViewModel;)Lc2/g2;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    new-instance v8, Lcom/friday/common/entity/ShareCacheEntity;

    .line 530
    .line 531
    invoke-static {}, Lk2/u;->a()Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v9

    .line 535
    const-string v3, "get32UUID(...)"

    .line 536
    .line 537
    invoke-static {v9, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 538
    .line 539
    .line 540
    iget-object v3, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->o:Lcom/friday/document/model/ShareFile;

    .line 541
    .line 542
    invoke-virtual {v3}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    .line 543
    .line 544
    .line 545
    move-result-object v10

    .line 546
    iget-object v3, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->o:Lcom/friday/document/model/ShareFile;

    .line 547
    .line 548
    invoke-virtual {v3}, Lcom/friday/document/model/ShareFile;->getVersion()I

    .line 549
    .line 550
    .line 551
    move-result v11

    .line 552
    iget-object v3, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->n:Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 553
    .line 554
    invoke-static {v3}, Lcom/friday/document/viewmodel/ShareBaseViewModel;->m(Lcom/friday/document/viewmodel/ShareBaseViewModel;)J

    .line 555
    .line 556
    .line 557
    move-result-wide v12

    .line 558
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 559
    .line 560
    .line 561
    move-result-wide v14

    .line 562
    invoke-direct/range {v8 .. v15}, Lcom/friday/common/entity/ShareCacheEntity;-><init>(Ljava/lang/String;Ljava/lang/String;IJJ)V

    .line 563
    .line 564
    .line 565
    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    move-result-object v3

    .line 569
    iput-object v3, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->c:Ljava/lang/Object;

    .line 570
    .line 571
    invoke-static {v7}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v3

    .line 575
    iput-object v3, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->d:Ljava/lang/Object;

    .line 576
    .line 577
    iput v4, v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;->m:I

    .line 578
    .line 579
    invoke-interface {v0, v8, v1}, Lc2/g2;->g(Lcom/friday/common/entity/ShareCacheEntity;Lvc/c;)Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    if-ne v0, v2, :cond_c

    .line 584
    .line 585
    :goto_6
    return-object v2

    .line 586
    :cond_c
    :goto_7
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 587
    .line 588
    return-object v0
.end method
