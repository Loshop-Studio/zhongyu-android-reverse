.class public final Lcom/zykj/student/dialogue/upload/OssTaskManger;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ly6/b;

.field public final b:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final c:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ly6/b;Lkotlinx/coroutines/flow/MutableStateFlow;)V
    .locals 1

    .line 1
    const-string v0, "ossTokenApi"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "userInfoFlow"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/student/dialogue/upload/OssTaskManger;->a:Ly6/b;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/student/dialogue/upload/OssTaskManger;->b:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 17
    .line 18
    new-instance p1, Ly6/a;

    .line 19
    .line 20
    invoke-direct {p1}, Ly6/a;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lcom/zykj/student/dialogue/upload/OssTaskManger;->c:Lkotlin/Lazy;

    .line 28
    .line 29
    return-void
.end method

.method public static synthetic a()Landroidx/work/WorkManager;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/student/dialogue/upload/OssTaskManger;->g()Landroidx/work/WorkManager;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f(Lcom/zykj/student/dialogue/upload/OssTaskManger;Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/String;[Ljava/lang/String;ILjava/lang/Object;)Landroidx/work/OneTimeWorkRequest;
    .locals 1

    .line 1
    and-int/lit8 p7, p6, 0x4

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p7, :cond_0

    .line 5
    .line 6
    move p3, v0

    .line 7
    :cond_0
    and-int/lit8 p7, p6, 0x8

    .line 8
    .line 9
    if-eqz p7, :cond_1

    .line 10
    .line 11
    new-array p4, v0, [Ljava/lang/String;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p6, p6, 0x10

    .line 14
    .line 15
    if-eqz p6, :cond_2

    .line 16
    .line 17
    new-array p5, v0, [Ljava/lang/String;

    .line 18
    .line 19
    :cond_2
    invoke-virtual/range {p0 .. p5}, Lcom/zykj/student/dialogue/upload/OssTaskManger;->e(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/String;[Ljava/lang/String;)Landroidx/work/OneTimeWorkRequest;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public static final g()Landroidx/work/WorkManager;
    .locals 3

    .line 1
    sget-object v0, Landroidx/work/WorkManager;->Companion:Landroidx/work/WorkManager$Companion;

    .line 2
    .line 3
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "getApp(...)"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroidx/work/WorkManager$Companion;->getInstance(Landroid/content/Context;)Landroidx/work/WorkManager;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method


# virtual methods
.method public final b(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p3

    .line 4
    .line 5
    instance-of v2, v0, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->s:I

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
    iput v3, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->s:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;-><init>(Lcom/zykj/student/dialogue/upload/OssTaskManger;Lkotlin/coroutines/Continuation;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->q:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget v4, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->s:I

    .line 36
    .line 37
    const/4 v5, 0x2

    .line 38
    const/4 v6, 0x1

    .line 39
    if-eqz v4, :cond_3

    .line 40
    .line 41
    if-eq v4, v6, :cond_2

    .line 42
    .line 43
    if-ne v4, v5, :cond_1

    .line 44
    .line 45
    iget-object v3, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->k:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v3, Ljava/lang/String;

    .line 48
    .line 49
    iget-object v4, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->j:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v4, Lcom/zykj/student/dialogue/upload/TokenReq;

    .line 52
    .line 53
    iget-object v4, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->i:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v4, Ljava/lang/String;

    .line 56
    .line 57
    iget-object v4, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->h:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v4, Ljava/lang/String;

    .line 60
    .line 61
    iget-object v4, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->g:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v4, Ljava/lang/String;

    .line 64
    .line 65
    iget-object v4, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->f:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v4, Ljava/lang/String;

    .line 68
    .line 69
    iget-object v4, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->e:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v4, Ljava/lang/String;

    .line 72
    .line 73
    iget-object v4, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->d:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v4, Ljava/lang/String;

    .line 76
    .line 77
    iget-object v4, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->c:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v4, Ljava/lang/String;

    .line 80
    .line 81
    iget-object v4, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->b:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v4, Ljava/lang/String;

    .line 84
    .line 85
    iget-object v2, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->a:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v2, Ljava/lang/String;

    .line 88
    .line 89
    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    .line 91
    .line 92
    const/16 p3, 0x0

    .line 93
    .line 94
    goto/16 :goto_3

    .line 95
    .line 96
    :catchall_0
    move-exception v0

    .line 97
    const/16 p3, 0x0

    .line 98
    .line 99
    goto/16 :goto_4

    .line 100
    .line 101
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 102
    .line 103
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 104
    .line 105
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    throw v0

    .line 109
    :cond_2
    iget-object v4, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->b:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v4, Ljava/lang/String;

    .line 112
    .line 113
    iget-object v6, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->a:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v6, Ljava/lang/String;

    .line 116
    .line 117
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    move-object v13, v6

    .line 121
    goto :goto_1

    .line 122
    :cond_3
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    iget-object v0, v1, Lcom/zykj/student/dialogue/upload/OssTaskManger;->b:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 126
    .line 127
    move-object/from16 v4, p1

    .line 128
    .line 129
    iput-object v4, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->a:Ljava/lang/Object;

    .line 130
    .line 131
    move-object/from16 v8, p2

    .line 132
    .line 133
    iput-object v8, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->b:Ljava/lang/Object;

    .line 134
    .line 135
    iput v6, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->s:I

    .line 136
    .line 137
    invoke-static {v0, v2}, Lkotlinx/coroutines/flow/FlowKt;->firstOrNull(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    if-ne v0, v3, :cond_4

    .line 142
    .line 143
    goto/16 :goto_2

    .line 144
    .line 145
    :cond_4
    move-object v13, v4

    .line 146
    move-object v4, v8

    .line 147
    :goto_1
    check-cast v0, Lcom/zykj/message/server/bean/UserInfo;

    .line 148
    .line 149
    if-eqz v0, :cond_8

    .line 150
    .line 151
    invoke-virtual {v0}, Lcom/zykj/message/server/bean/UserInfo;->a()Ljava/lang/Long;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    if-eqz v0, :cond_8

    .line 156
    .line 157
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 158
    .line 159
    .line 160
    move-result-wide v8

    .line 161
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v14

    .line 169
    const-string v0, "toString(...)"

    .line 170
    .line 171
    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    const/16 v18, 0x4

    .line 175
    .line 176
    const/16 v19, 0x0

    .line 177
    .line 178
    const-string v15, "-"

    .line 179
    .line 180
    const-string v16, ""

    .line 181
    .line 182
    const/16 v17, 0x0

    .line 183
    .line 184
    invoke-static/range {v14 .. v19}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v14

    .line 188
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 189
    .line 190
    .line 191
    move-result-wide v10

    .line 192
    new-instance v0, Ljava/lang/StringBuilder;

    .line 193
    .line 194
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    const-string v6, "+"

    .line 201
    .line 202
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    const-string v12, "quora_v2"

    .line 206
    .line 207
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    const-string v15, "log"

    .line 214
    .line 215
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    const/16 p3, 0x0

    .line 222
    .line 223
    const/4 v7, 0x2

    .line 224
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    const-string v7, ".txt"

    .line 231
    .line 232
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v0, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    invoke-static {v0}, Lcom/blankj/utilcode/util/EncryptUtils;->encryptMD5ToString(Ljava/lang/String;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v17

    .line 261
    move-wide/from16 v18, v8

    .line 262
    .line 263
    new-instance v8, Lcom/zykj/student/dialogue/upload/TokenReq;

    .line 264
    .line 265
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    move-wide/from16 v19, v18

    .line 269
    .line 270
    const/16 v18, 0x1

    .line 271
    .line 272
    move-wide/from16 v20, v19

    .line 273
    .line 274
    const/16 v19, 0x0

    .line 275
    .line 276
    const/4 v9, 0x0

    .line 277
    move-object v6, v12

    .line 278
    const/4 v12, 0x2

    .line 279
    move-object v5, v6

    .line 280
    move-wide/from16 v22, v10

    .line 281
    .line 282
    move-object v11, v7

    .line 283
    move-wide/from16 v6, v20

    .line 284
    .line 285
    const/4 v10, 0x2

    .line 286
    move-object/from16 v21, v15

    .line 287
    .line 288
    move-wide/from16 v15, v22

    .line 289
    .line 290
    invoke-direct/range {v8 .. v19}, Lcom/zykj/student/dialogue/upload/TokenReq;-><init>(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 291
    .line 292
    .line 293
    move-object v10, v8

    .line 294
    move-wide v8, v15

    .line 295
    move-object v15, v11

    .line 296
    new-instance v11, Ljava/lang/StringBuilder;

    .line 297
    .line 298
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    const-string v12, "/log/"

    .line 305
    .line 306
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v11, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    const-string v12, "/"

    .line 313
    .line 314
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v11

    .line 330
    :try_start_1
    sget-object v12, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 331
    .line 332
    iget-object v12, v1, Lcom/zykj/student/dialogue/upload/OssTaskManger;->a:Ly6/b;

    .line 333
    .line 334
    move-object/from16 p2, v0

    .line 335
    .line 336
    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    iput-object v0, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->a:Ljava/lang/Object;

    .line 341
    .line 342
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    iput-object v0, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->b:Ljava/lang/Object;

    .line 347
    .line 348
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    iput-object v0, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->c:Ljava/lang/Object;

    .line 353
    .line 354
    invoke-static/range {v21 .. v21}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    iput-object v0, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->d:Ljava/lang/Object;

    .line 359
    .line 360
    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    iput-object v0, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->e:Ljava/lang/Object;

    .line 365
    .line 366
    invoke-static {v15}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    iput-object v0, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->f:Ljava/lang/Object;

    .line 371
    .line 372
    invoke-static {v14}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    iput-object v0, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->g:Ljava/lang/Object;

    .line 377
    .line 378
    invoke-static/range {p2 .. p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    iput-object v0, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->h:Ljava/lang/Object;

    .line 383
    .line 384
    invoke-static/range {v17 .. v17}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    iput-object v0, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->i:Ljava/lang/Object;

    .line 389
    .line 390
    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    iput-object v0, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->j:Ljava/lang/Object;

    .line 395
    .line 396
    iput-object v11, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->k:Ljava/lang/Object;

    .line 397
    .line 398
    iput-wide v6, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->l:J

    .line 399
    .line 400
    const/4 v0, 0x2

    .line 401
    iput v0, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->n:I

    .line 402
    .line 403
    const/4 v0, 0x2

    .line 404
    iput v0, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->o:I

    .line 405
    .line 406
    iput-wide v8, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->m:J

    .line 407
    .line 408
    const/4 v0, 0x0

    .line 409
    iput v0, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->p:I

    .line 410
    .line 411
    const/4 v0, 0x2

    .line 412
    iput v0, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->s:I

    .line 413
    .line 414
    invoke-interface {v12, v10, v2}, Ly6/b;->a(Lcom/zykj/student/dialogue/upload/TokenReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 418
    if-ne v0, v3, :cond_5

    .line 419
    .line 420
    :goto_2
    return-object v3

    .line 421
    :cond_5
    move-object v3, v11

    .line 422
    :goto_3
    :try_start_2
    check-cast v0, Lcom/zykj/student/dialogue/network/BaseResponse;

    .line 423
    .line 424
    invoke-static {v0}, Li6/c;->b(Lcom/zykj/student/dialogue/network/BaseResponse;)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    check-cast v0, Lcom/zykj/student/dialogue/upload/OssToken;

    .line 429
    .line 430
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 434
    goto :goto_5

    .line 435
    :catchall_1
    move-exception v0

    .line 436
    goto :goto_4

    .line 437
    :catchall_2
    move-exception v0

    .line 438
    move-object v3, v11

    .line 439
    :goto_4
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 440
    .line 441
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    :goto_5
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 450
    .line 451
    .line 452
    move-result v2

    .line 453
    if-eqz v2, :cond_6

    .line 454
    .line 455
    move-object/from16 v0, p3

    .line 456
    .line 457
    :cond_6
    check-cast v0, Lcom/zykj/student/dialogue/upload/OssToken;

    .line 458
    .line 459
    if-eqz v0, :cond_7

    .line 460
    .line 461
    new-instance v7, Lcom/zykj/student/dialogue/upload/OssData;

    .line 462
    .line 463
    invoke-direct {v7, v0, v3}, Lcom/zykj/student/dialogue/upload/OssData;-><init>(Lcom/zykj/student/dialogue/upload/OssToken;Ljava/lang/String;)V

    .line 464
    .line 465
    .line 466
    goto :goto_6

    .line 467
    :cond_7
    move-object/from16 v7, p3

    .line 468
    .line 469
    :goto_6
    return-object v7

    .line 470
    :cond_8
    const/16 p3, 0x0

    .line 471
    .line 472
    return-object p3
.end method

.method public final c(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 25

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    instance-of v2, v0, Lcom/zykj/student/dialogue/upload/OssTaskManger$getResOssData$1;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getResOssData$1;

    iget v3, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getResOssData$1;->q:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getResOssData$1;->q:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getResOssData$1;

    invoke-direct {v2, v1, v0}, Lcom/zykj/student/dialogue/upload/OssTaskManger$getResOssData$1;-><init>(Lcom/zykj/student/dialogue/upload/OssTaskManger;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v0, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getResOssData$1;->o:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 1
    iget v4, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getResOssData$1;->q:I

    const/4 v5, 0x2

    const/4 v7, 0x1

    if-eqz v4, :cond_4

    if-eq v4, v7, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getResOssData$1;->i:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v4, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getResOssData$1;->h:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v4, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getResOssData$1;->g:Ljava/lang/Object;

    check-cast v4, Lcom/zykj/student/dialogue/upload/TokenReq;

    iget-object v4, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getResOssData$1;->f:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v4, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getResOssData$1;->e:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v4, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getResOssData$1;->d:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v4, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getResOssData$1;->c:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v4, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getResOssData$1;->b:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v2, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getResOssData$1;->a:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 p2, 0x0

    goto/16 :goto_3

    :catchall_0
    move-exception v0

    const/16 p2, 0x0

    goto/16 :goto_4

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v4, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getResOssData$1;->a:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    :cond_3
    move-object v11, v4

    goto :goto_1

    :cond_4
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 2
    iget-object v0, v1, Lcom/zykj/student/dialogue/upload/OssTaskManger;->b:Lkotlinx/coroutines/flow/MutableStateFlow;

    move-object/from16 v4, p1

    iput-object v4, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getResOssData$1;->a:Ljava/lang/Object;

    iput v7, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getResOssData$1;->q:I

    invoke-static {v0, v2}, Lkotlinx/coroutines/flow/FlowKt;->firstOrNull(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_3

    goto/16 :goto_2

    :goto_1
    check-cast v0, Lcom/zykj/message/server/bean/UserInfo;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lcom/zykj/message/server/bean/UserInfo;->a()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    .line 3
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v12

    const-string v0, "toString(...)"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v16, 0x4

    const/16 v17, 0x0

    const-string v13, "-"

    const-string v14, ""

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, "+"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "quora_v2"

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v15, "res"

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p2, 0x0

    const/4 v6, 0x0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 6
    invoke-static {v0}, Lcom/blankj/utilcode/util/EncryptUtils;->encryptMD5ToString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    move-wide/from16 v18, v8

    .line 7
    new-instance v8, Lcom/zykj/student/dialogue/upload/TokenReq;

    .line 8
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-wide/from16 v19, v18

    const/16 v18, 0x1b

    move-wide/from16 v20, v19

    const/16 v19, 0x0

    const/4 v9, 0x0

    move-object v4, v10

    const/4 v10, 0x0

    move-wide/from16 v23, v12

    move-object v13, v15

    move-wide/from16 v15, v23

    const/4 v12, 0x0

    move-object/from16 v22, v13

    const/4 v13, 0x0

    move-wide/from16 v5, v20

    .line 9
    invoke-direct/range {v8 .. v19}, Lcom/zykj/student/dialogue/upload/TokenReq;-><init>(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v10, v8

    move-wide v8, v15

    .line 10
    const-string v12, "yyyyMMdd"

    invoke-static {v12}, Lcom/blankj/utilcode/util/TimeUtils;->getSafeDateFormat(Ljava/lang/String;)Ljava/text/SimpleDateFormat;

    move-result-object v12

    invoke-static {v8, v9, v12}, Lcom/blankj/utilcode/util/TimeUtils;->millis2String(JLjava/text/DateFormat;)Ljava/lang/String;

    move-result-object v12

    .line 11
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v15, "/res/"

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v15, "/"

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 12
    :try_start_1
    sget-object v15, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iget-object v15, v1, Lcom/zykj/student/dialogue/upload/OssTaskManger;->a:Ly6/b;

    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getResOssData$1;->a:Ljava/lang/Object;

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getResOssData$1;->b:Ljava/lang/Object;

    invoke-static/range {v22 .. v22}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getResOssData$1;->c:Ljava/lang/Object;

    invoke-static {v14}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getResOssData$1;->d:Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getResOssData$1;->e:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getResOssData$1;->f:Ljava/lang/Object;

    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getResOssData$1;->g:Ljava/lang/Object;

    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getResOssData$1;->h:Ljava/lang/Object;

    iput-object v13, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getResOssData$1;->i:Ljava/lang/Object;

    iput-wide v5, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getResOssData$1;->j:J

    iput v7, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getResOssData$1;->l:I

    const/4 v0, 0x0

    iput v0, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getResOssData$1;->m:I

    iput-wide v8, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getResOssData$1;->k:J

    iput v0, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getResOssData$1;->n:I

    const/4 v0, 0x2

    iput v0, v2, Lcom/zykj/student/dialogue/upload/OssTaskManger$getResOssData$1;->q:I

    invoke-interface {v15, v10, v2}, Ly6/b;->a(Lcom/zykj/student/dialogue/upload/TokenReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    if-ne v0, v3, :cond_5

    :goto_2
    return-object v3

    :cond_5
    move-object v3, v13

    :goto_3
    :try_start_2
    check-cast v0, Lcom/zykj/student/dialogue/network/BaseResponse;

    invoke-static {v0}, Li6/c;->b(Lcom/zykj/student/dialogue/network/BaseResponse;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/zykj/student/dialogue/upload/OssToken;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception v0

    goto :goto_4

    :catchall_2
    move-exception v0

    move-object v3, v13

    :goto_4
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_5
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    move-object/from16 v0, p2

    :cond_6
    check-cast v0, Lcom/zykj/student/dialogue/upload/OssToken;

    if-eqz v0, :cond_7

    .line 13
    new-instance v6, Lcom/zykj/student/dialogue/upload/OssData;

    invoke-direct {v6, v0, v3}, Lcom/zykj/student/dialogue/upload/OssData;-><init>(Lcom/zykj/student/dialogue/upload/OssToken;Ljava/lang/String;)V

    goto :goto_6

    :cond_7
    move-object/from16 v6, p2

    :goto_6
    return-object v6

    :cond_8
    const/16 p2, 0x0

    return-object p2
.end method

.method public final d()Landroidx/work/WorkManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/upload/OssTaskManger;->c:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/work/WorkManager;

    .line 8
    .line 9
    return-object v0
.end method

.method public final varargs e(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/String;[Ljava/lang/String;)Landroidx/work/OneTimeWorkRequest;
    .locals 2

    .line 1
    const-string v0, "uniqueWorkName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fileAbsolutePath"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "extras"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "tags"

    .line 17
    .line 18
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    sget-object v0, Lcom/zykj/student/dialogue/upload/UploadWork;->b:Lcom/zykj/student/dialogue/upload/UploadWork$a;

    .line 22
    .line 23
    array-length v1, p5

    .line 24
    invoke-static {p5, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p5

    .line 28
    check-cast p5, [Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, p3, p2, p4, p5}, Lcom/zykj/student/dialogue/upload/UploadWork$a;->a(ILjava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Landroidx/work/OneTimeWorkRequest$Builder;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-virtual {p2}, Landroidx/work/WorkRequest$Builder;->build()Landroidx/work/WorkRequest;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    check-cast p2, Landroidx/work/OneTimeWorkRequest;

    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/upload/OssTaskManger;->d()Landroidx/work/WorkManager;

    .line 41
    .line 42
    .line 43
    move-result-object p3

    .line 44
    sget-object p4, Landroidx/work/ExistingWorkPolicy;->REPLACE:Landroidx/work/ExistingWorkPolicy;

    .line 45
    .line 46
    invoke-virtual {p3, p1, p4, p2}, Landroidx/work/WorkManager;->enqueueUniqueWork(Ljava/lang/String;Landroidx/work/ExistingWorkPolicy;Landroidx/work/OneTimeWorkRequest;)Landroidx/work/Operation;

    .line 47
    .line 48
    .line 49
    return-object p2
.end method
