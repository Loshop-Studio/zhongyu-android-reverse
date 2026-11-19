# RE note 本类字节码直接引用的读写或显示接口包括JSON。
.class final Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.friday.document.viewmodel.StudentShareViewModel$downloadOthers$1$1"
    f = "StudentShareViewModel.kt"
    l = {
        0x160
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:I

.field public final synthetic f:Lcom/friday/document/viewmodel/StudentShareViewModel;

.field public final synthetic g:Lcom/friday/document/model/ShareFile;


# direct methods
.method public constructor <init>(Lcom/friday/document/viewmodel/StudentShareViewModel;Lcom/friday/document/model/ShareFile;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;->f:Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;->g:Lcom/friday/document/model/ShareFile;

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
    new-instance p1, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;->f:Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;->g:Lcom/friday/document/model/ShareFile;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;-><init>(Lcom/friday/document/viewmodel/StudentShareViewModel;Lcom/friday/document/model/ShareFile;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

# RE I/O 读取 JSON（Gson.fromJson）。
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;->e:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/lang/String;

    .line 15
    .line 16
    iget-object v0, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto/16 :goto_5

    .line 24
    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;->f:Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 37
    .line 38
    iget-object v1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;->g:Lcom/friday/document/model/ShareFile;

    .line 39
    .line 40
    invoke-virtual {v1}, Lcom/friday/document/model/ShareFile;->getFileUrl()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const-string v10, "et"

    .line 45
    .line 46
    const-string v11, "dps"

    .line 47
    .line 48
    const-string v3, "doc"

    .line 49
    .line 50
    const-string v4, "docx"

    .line 51
    .line 52
    const-string v5, "ppt"

    .line 53
    .line 54
    const-string v6, "pptx"

    .line 55
    .line 56
    const-string v7, "xls"

    .line 57
    .line 58
    const-string v8, "xlsx"

    .line 59
    .line 60
    const-string v9, "wps"

    .line 61
    .line 62
    filled-new-array/range {v3 .. v11}, [Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-static {p1, v1, v3}, Lcom/friday/document/viewmodel/StudentShareViewModel;->h(Lcom/friday/document/viewmodel/StudentShareViewModel;Ljava/lang/String;[Ljava/lang/String;)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_2

    .line 71
    .line 72
    iget-object p1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;->g:Lcom/friday/document/model/ShareFile;

    .line 73
    .line 74
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getFileUrl()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    const/4 v7, 0x4

    .line 79
    const/4 v8, 0x0

    .line 80
    const-string v4, "."

    .line 81
    .line 82
    const-string v5, "pdf"

    .line 83
    .line 84
    const/4 v6, 0x0

    .line 85
    invoke-static/range {v3 .. v8}, Lqd/c0;->B0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    :goto_0
    move-object v4, p1

    .line 90
    goto :goto_1

    .line 91
    :cond_2
    iget-object p1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;->g:Lcom/friday/document/model/ShareFile;

    .line 92
    .line 93
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getFileUrl()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    goto :goto_0

    .line 98
    :goto_1
    iget-object p1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;->g:Lcom/friday/document/model/ShareFile;

    .line 99
    .line 100
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getOthersPath()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    iget-object p1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;->g:Lcom/friday/document/model/ShareFile;

    .line 105
    .line 106
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->isOfficeFile()Z

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    if-eqz p1, :cond_9

    .line 111
    .line 112
    :try_start_0
    sget-object p1, Lcom/friday/common/helper/d;->d:Lcom/friday/common/helper/d$a;

    .line 113
    .line 114
    invoke-virtual {p1}, Lcom/friday/common/helper/d$a;->a()Lcom/friday/common/helper/d;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    const/4 v7, 0x4

    .line 119
    const/4 v8, 0x0

    .line 120
    const/4 v6, 0x0

    .line 121
    invoke-static/range {v3 .. v8}, Lcom/friday/common/helper/d;->h(Lcom/friday/common/helper/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    :try_end_0
    .catch Lcom/alibaba/sdk/android/oss/ServiceException; {:try_start_0 .. :try_end_0} :catch_0

    .line 122
    .line 123
    .line 124
    goto/16 :goto_4

    .line 125
    .line 126
    :catch_0
    move-exception v0

    .line 127
    move-object p1, v0

    .line 128
    invoke-virtual {p1}, Lcom/alibaba/sdk/android/oss/ServiceException;->getStatusCode()I

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    const/16 v0, 0x194

    .line 133
    .line 134
    const/4 v1, 0x0

    .line 135
    if-ne p1, v0, :cond_8

    .line 136
    .line 137
    iget-object p1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;->g:Lcom/friday/document/model/ShareFile;

    .line 138
    .line 139
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getFileUrl()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    const-string v0, "http"

    .line 144
    .line 145
    const/4 v3, 0x0

    .line 146
    const/4 v4, 0x2

    .line 147
    invoke-static {p1, v0, v3, v4, v1}, Lqd/z;->O(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    if-eqz v0, :cond_3

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_3
    sget-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 155
    .line 156
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-virtual {v0, p1}, Lcom/friday/common/helper/b;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 165
    .line 166
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 167
    .line 168
    .line 169
    const-string v5, "http://sfs.zykj.org:8085/OfficeConvertToPdf/Convert?pptUrl="

    .line 170
    .line 171
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    iget-object v0, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;->f:Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 182
    .line 183
    invoke-static {v0}, Lcom/friday/document/viewmodel/StudentShareViewModel;->j(Lcom/friday/document/viewmodel/StudentShareViewModel;)Ljava/util/HashMap;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    check-cast v0, Ljava/lang/Integer;

    .line 192
    .line 193
    if-eqz v0, :cond_4

    .line 194
    .line 195
    iget-object v5, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;->f:Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 196
    .line 197
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-lt v0, v4, :cond_4

    .line 202
    .line 203
    invoke-static {v5}, Lcom/friday/document/viewmodel/StudentShareViewModel;->j(Lcom/friday/document/viewmodel/StudentShareViewModel;)Ljava/util/HashMap;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-static {v3}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v5, v1}, Lcom/friday/document/viewmodel/StudentShareViewModel;->F(Lcom/friday/document/model/ShareFile;)V

    .line 215
    .line 216
    .line 217
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 218
    .line 219
    return-object p1

    .line 220
    :cond_4
    iget-object v0, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;->f:Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 221
    .line 222
    invoke-static {v0}, Lcom/friday/document/viewmodel/StudentShareViewModel;->j(Lcom/friday/document/viewmodel/StudentShareViewModel;)Ljava/util/HashMap;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    if-eqz v0, :cond_5

    .line 231
    .line 232
    iget-object v0, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;->f:Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 233
    .line 234
    invoke-static {v0}, Lcom/friday/document/viewmodel/StudentShareViewModel;->j(Lcom/friday/document/viewmodel/StudentShareViewModel;)Ljava/util/HashMap;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    iget-object v3, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;->f:Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 239
    .line 240
    invoke-static {v3}, Lcom/friday/document/viewmodel/StudentShareViewModel;->j(Lcom/friday/document/viewmodel/StudentShareViewModel;)Ljava/util/HashMap;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    invoke-virtual {v3, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v3

    .line 248
    invoke-static {v3}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    check-cast v3, Ljava/lang/Number;

    .line 252
    .line 253
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 254
    .line 255
    .line 256
    move-result v3

    .line 257
    add-int/2addr v3, v2

    .line 258
    invoke-static {v3}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    goto :goto_3

    .line 266
    :cond_5
    iget-object v0, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;->f:Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 267
    .line 268
    invoke-static {v0}, Lcom/friday/document/viewmodel/StudentShareViewModel;->j(Lcom/friday/document/viewmodel/StudentShareViewModel;)Ljava/util/HashMap;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-static {v3}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    :goto_3
    new-instance v0, Lje/v$a;

    .line 280
    .line 281
    invoke-direct {v0}, Lje/v$a;-><init>()V

    .line 282
    .line 283
    .line 284
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 285
    .line 286
    const-wide/16 v3, 0xc8

    .line 287
    .line 288
    invoke-virtual {v0, v3, v4, v2}, Lje/v$a;->e(JLjava/util/concurrent/TimeUnit;)Lje/v$a;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    invoke-virtual {v0, v3, v4, v2}, Lje/v$a;->O(JLjava/util/concurrent/TimeUnit;)Lje/v$a;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    invoke-virtual {v0, v3, v4, v2}, Lje/v$a;->R(JLjava/util/concurrent/TimeUnit;)Lje/v$a;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-virtual {v0}, Lje/v$a;->c()Lje/v;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    new-instance v2, Lje/w$a;

    .line 305
    .line 306
    invoke-direct {v2}, Lje/w$a;-><init>()V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v2}, Lje/w$a;->f()Lje/w$a;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    invoke-virtual {v2, p1}, Lje/w$a;->p(Ljava/lang/String;)Lje/w$a;

    .line 314
    .line 315
    .line 316
    move-result-object p1

    .line 317
    invoke-virtual {p1}, Lje/w$a;->b()Lje/w;

    .line 318
    .line 319
    .line 320
    move-result-object p1

    .line 321
    invoke-virtual {v0, p1}, Lje/v;->b(Lje/w;)Lje/e;

    .line 322
    .line 323
    .line 324
    move-result-object p1

    .line 325
    invoke-interface {p1}, Lje/e;->execute()Lje/y;

    .line 326
    .line 327
    .line 328
    move-result-object p1

    .line 329
    invoke-virtual {p1}, Lje/y;->e()Lje/z;

    .line 330
    .line 331
    .line 332
    move-result-object p1

    .line 333
    if-eqz p1, :cond_7

    .line 334
    .line 335
    invoke-virtual {p1}, Lje/z;->string()Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object p1

    .line 339
    if-eqz p1, :cond_7

    .line 340
    .line 341
    iget-object v0, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;->f:Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 342
    .line 343
    iget-object v2, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;->g:Lcom/friday/document/model/ShareFile;

    .line 344
    .line 345
    :try_start_1
    new-instance v3, Lcom/google/gson/Gson;

    .line 346
    .line 347
    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    .line 348
    .line 349
    .line 350
    const-class v4, Lcom/friday/document/model/ConvertEntity;

    .line 351
    .line 352
    invoke-virtual {v3, p1, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object p1

    .line 356
    check-cast p1, Lcom/friday/document/model/ConvertEntity;

    .line 357
    .line 358
    invoke-virtual {p1}, Lcom/friday/document/model/ConvertEntity;->getSuccess()Z

    .line 359
    .line 360
    .line 361
    move-result p1

    .line 362
    if-eqz p1, :cond_6

    .line 363
    .line 364
    invoke-virtual {v0, v2}, Lcom/friday/document/viewmodel/StudentShareViewModel;->t(Lcom/friday/document/model/ShareFile;)V

    .line 365
    .line 366
    .line 367
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 368
    .line 369
    return-object p1

    .line 370
    :cond_6
    invoke-virtual {v0, v1}, Lcom/friday/document/viewmodel/StudentShareViewModel;->F(Lcom/friday/document/model/ShareFile;)V

    .line 371
    .line 372
    .line 373
    sget-object p1, Lqc/q;->a:Lqc/q;
    :try_end_1
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_1 .. :try_end_1} :catch_1

    .line 374
    .line 375
    return-object p1

    .line 376
    :catch_1
    invoke-virtual {v0, v1}, Lcom/friday/document/viewmodel/StudentShareViewModel;->F(Lcom/friday/document/model/ShareFile;)V

    .line 377
    .line 378
    .line 379
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 380
    .line 381
    return-object p1

    .line 382
    :cond_7
    iget-object p1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;->f:Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 383
    .line 384
    invoke-virtual {p1, v1}, Lcom/friday/document/viewmodel/StudentShareViewModel;->F(Lcom/friday/document/model/ShareFile;)V

    .line 385
    .line 386
    .line 387
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 388
    .line 389
    return-object p1

    .line 390
    :cond_8
    iget-object p1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;->f:Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 391
    .line 392
    invoke-virtual {p1, v1}, Lcom/friday/document/viewmodel/StudentShareViewModel;->F(Lcom/friday/document/model/ShareFile;)V

    .line 393
    .line 394
    .line 395
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 396
    .line 397
    return-object p1

    .line 398
    :cond_9
    iget-object p1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;->g:Lcom/friday/document/model/ShareFile;

    .line 399
    .line 400
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getType()Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object p1

    .line 404
    const-string v1, "9"

    .line 405
    .line 406
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    move-result p1

    .line 410
    if-nez p1, :cond_a

    .line 411
    .line 412
    iget-object p1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;->g:Lcom/friday/document/model/ShareFile;

    .line 413
    .line 414
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getType()Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object p1

    .line 418
    const-string v1, "8"

    .line 419
    .line 420
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    move-result p1

    .line 424
    if-nez p1, :cond_a

    .line 425
    .line 426
    sget-object p1, Lcom/friday/common/helper/d;->d:Lcom/friday/common/helper/d$a;

    .line 427
    .line 428
    invoke-virtual {p1}, Lcom/friday/common/helper/d$a;->a()Lcom/friday/common/helper/d;

    .line 429
    .line 430
    .line 431
    move-result-object v3

    .line 432
    const/4 v7, 0x4

    .line 433
    const/4 v8, 0x0

    .line 434
    const/4 v6, 0x0

    .line 435
    invoke-static/range {v3 .. v8}, Lcom/friday/common/helper/d;->h(Lcom/friday/common/helper/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 436
    .line 437
    .line 438
    :cond_a
    :goto_4
    iget-object p1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;->f:Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 439
    .line 440
    invoke-static {p1}, Lcom/friday/document/viewmodel/StudentShareViewModel;->k(Lcom/friday/document/viewmodel/StudentShareViewModel;)Lc2/g2;

    .line 441
    .line 442
    .line 443
    move-result-object p1

    .line 444
    new-instance v6, Lcom/friday/common/entity/ShareCacheEntity;

    .line 445
    .line 446
    invoke-static {}, Lk2/u;->a()Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v7

    .line 450
    const-string v1, "get32UUID(...)"

    .line 451
    .line 452
    invoke-static {v7, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 453
    .line 454
    .line 455
    iget-object v1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;->g:Lcom/friday/document/model/ShareFile;

    .line 456
    .line 457
    invoke-virtual {v1}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v8

    .line 461
    iget-object v1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;->g:Lcom/friday/document/model/ShareFile;

    .line 462
    .line 463
    invoke-virtual {v1}, Lcom/friday/document/model/ShareFile;->getVersion()I

    .line 464
    .line 465
    .line 466
    move-result v9

    .line 467
    iget-object v1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;->f:Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 468
    .line 469
    invoke-static {v1}, Lcom/friday/document/viewmodel/StudentShareViewModel;->n(Lcom/friday/document/viewmodel/StudentShareViewModel;)J

    .line 470
    .line 471
    .line 472
    move-result-wide v10

    .line 473
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 474
    .line 475
    .line 476
    move-result-wide v12

    .line 477
    invoke-direct/range {v6 .. v13}, Lcom/friday/common/entity/ShareCacheEntity;-><init>(Ljava/lang/String;Ljava/lang/String;IJJ)V

    .line 478
    .line 479
    .line 480
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    iput-object v1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;->c:Ljava/lang/Object;

    .line 485
    .line 486
    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v1

    .line 490
    iput-object v1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;->d:Ljava/lang/Object;

    .line 491
    .line 492
    iput v2, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;->e:I

    .line 493
    .line 494
    invoke-interface {p1, v6, p0}, Lc2/g2;->g(Lcom/friday/common/entity/ShareCacheEntity;Lvc/c;)Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object p1

    .line 498
    if-ne p1, v0, :cond_b

    .line 499
    .line 500
    return-object v0

    .line 501
    :cond_b
    :goto_5
    iget-object p1, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;->f:Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 502
    .line 503
    iget-object v0, p0, Lcom/friday/document/viewmodel/StudentShareViewModel$downloadOthers$1$1;->g:Lcom/friday/document/model/ShareFile;

    .line 504
    .line 505
    invoke-virtual {p1, v0}, Lcom/friday/document/viewmodel/StudentShareViewModel;->F(Lcom/friday/document/model/ShareFile;)V

    .line 506
    .line 507
    .line 508
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 509
    .line 510
    return-object p1
.end method
