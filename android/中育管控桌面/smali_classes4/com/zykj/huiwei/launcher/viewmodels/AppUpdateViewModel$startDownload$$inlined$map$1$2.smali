.class public final Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1;->collect(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lkotlinx/coroutines/flow/FlowCollector;

.field public final synthetic b:Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;

.field public final synthetic c:Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/flow/FlowCollector;Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2;->a:Lkotlinx/coroutines/flow/FlowCollector;

    iput-object p2, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2;->b:Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;

    iput-object p3, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2;->c:Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    instance-of v2, v1, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;->b:I

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
    iput v3, v2, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;->b:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;-><init>(Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2;Lkotlin/coroutines/Continuation;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;->a:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget v4, v2, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;->b:I

    .line 36
    .line 37
    const/4 v5, 0x2

    .line 38
    const/4 v6, 0x1

    .line 39
    const/4 v7, 0x0

    .line 40
    if-eqz v4, :cond_3

    .line 41
    .line 42
    if-eq v4, v6, :cond_2

    .line 43
    .line 44
    if-ne v4, v5, :cond_1

    .line 45
    .line 46
    iget-object v3, v2, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;->g:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v3, Lkotlinx/coroutines/flow/FlowCollector;

    .line 49
    .line 50
    iget-object v2, v2, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;->e:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v2, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;

    .line 53
    .line 54
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto/16 :goto_4

    .line 58
    .line 59
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 62
    .line 63
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw v1

    .line 67
    :cond_2
    iget v4, v2, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;->l:I

    .line 68
    .line 69
    iget-object v6, v2, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;->k:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v6, Lcom/zykj/download/work/DownloadFileWorkProxy;

    .line 72
    .line 73
    iget-object v6, v2, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;->j:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v6, Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;

    .line 76
    .line 77
    iget-object v6, v2, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;->i:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v6, Lkotlin/coroutines/Continuation;

    .line 80
    .line 81
    iget-object v6, v2, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;->h:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v6, Lkotlinx/coroutines/flow/FlowCollector;

    .line 84
    .line 85
    iget-object v8, v2, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;->g:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v8, Lkotlinx/coroutines/flow/FlowCollector;

    .line 88
    .line 89
    iget-object v9, v2, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;->f:Ljava/lang/Object;

    .line 90
    .line 91
    iget-object v10, v2, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;->e:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v10, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;

    .line 94
    .line 95
    iget-object v11, v2, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;->c:Ljava/lang/Object;

    .line 96
    .line 97
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_3
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2;->a:Lkotlinx/coroutines/flow/FlowCollector;

    .line 105
    .line 106
    move-object/from16 v4, p1

    .line 107
    .line 108
    check-cast v4, Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;

    .line 109
    .line 110
    new-instance v8, Lcom/zykj/download/work/DownloadFileWorkProxy;

    .line 111
    .line 112
    sget-object v9, Lcom/zykj/huiwei/launcher/app/App;->Companion:Lcom/zykj/huiwei/launcher/app/App$a;

    .line 113
    .line 114
    invoke-virtual {v9}, Lcom/zykj/huiwei/launcher/app/App$a;->a()Lcom/zykj/huiwei/launcher/app/App;

    .line 115
    .line 116
    .line 117
    move-result-object v10

    .line 118
    sget-object v11, Lcom/zykj/download/data/AppDatabase;->a:Lcom/zykj/download/data/AppDatabase$a;

    .line 119
    .line 120
    invoke-virtual {v9}, Lcom/zykj/huiwei/launcher/app/App$a;->a()Lcom/zykj/huiwei/launcher/app/App;

    .line 121
    .line 122
    .line 123
    move-result-object v9

    .line 124
    invoke-virtual {v11, v9}, Lcom/zykj/download/data/AppDatabase$a;->b(Landroid/content/Context;)Lcom/zykj/download/data/AppDatabase;

    .line 125
    .line 126
    .line 127
    move-result-object v9

    .line 128
    invoke-direct {v8, v10, v9, v7}, Lcom/zykj/download/work/DownloadFileWorkProxy;-><init>(Landroid/content/Context;Lcom/zykj/download/data/AppDatabase;Lcom/zykj/download/work/DownloadFileWork;)V

    .line 129
    .line 130
    .line 131
    iget-object v9, v0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2;->b:Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;

    .line 132
    .line 133
    invoke-virtual {v9}, Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;->getFileUrl()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v9

    .line 137
    new-instance v10, Ljava/io/File;

    .line 138
    .line 139
    invoke-static {}, Lcom/blankj/utilcode/util/y;->b()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v11

    .line 143
    invoke-direct {v10, v11}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-static/range {p1 .. p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v11

    .line 150
    iput-object v11, v2, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;->c:Ljava/lang/Object;

    .line 151
    .line 152
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v11

    .line 156
    iput-object v11, v2, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;->e:Ljava/lang/Object;

    .line 157
    .line 158
    invoke-static/range {p1 .. p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v11

    .line 162
    iput-object v11, v2, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;->f:Ljava/lang/Object;

    .line 163
    .line 164
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v11

    .line 168
    iput-object v11, v2, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;->g:Ljava/lang/Object;

    .line 169
    .line 170
    iput-object v1, v2, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;->h:Ljava/lang/Object;

    .line 171
    .line 172
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v11

    .line 176
    iput-object v11, v2, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;->i:Ljava/lang/Object;

    .line 177
    .line 178
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    iput-object v4, v2, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;->j:Ljava/lang/Object;

    .line 183
    .line 184
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    iput-object v4, v2, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;->k:Ljava/lang/Object;

    .line 189
    .line 190
    const/4 v4, 0x0

    .line 191
    iput v4, v2, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;->l:I

    .line 192
    .line 193
    iput v4, v2, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;->m:I

    .line 194
    .line 195
    iput v6, v2, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;->b:I

    .line 196
    .line 197
    invoke-virtual {v8, v9, v10, v2}, Lcom/zykj/download/work/DownloadFileWorkProxy;->checkDownloadSuccess(Ljava/lang/String;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v6

    .line 201
    if-ne v6, v3, :cond_4

    .line 202
    .line 203
    goto/16 :goto_3

    .line 204
    .line 205
    :cond_4
    move-object/from16 v9, p1

    .line 206
    .line 207
    move-object v11, v9

    .line 208
    move-object v8, v1

    .line 209
    move-object v10, v2

    .line 210
    move-object v1, v6

    .line 211
    move-object v6, v8

    .line 212
    :goto_1
    check-cast v1, Ljava/lang/String;

    .line 213
    .line 214
    if-eqz v1, :cond_5

    .line 215
    .line 216
    iget-object v12, v0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2;->c:Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 217
    .line 218
    invoke-virtual {v12}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->i()Landroidx/lifecycle/MutableLiveData;

    .line 219
    .line 220
    .line 221
    move-result-object v12

    .line 222
    invoke-virtual {v12, v1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    goto :goto_2

    .line 226
    :cond_5
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2;->c:Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 227
    .line 228
    new-instance v12, Landroidx/work/OneTimeWorkRequest$Builder;

    .line 229
    .line 230
    const-class v13, Lcom/zykj/download/work/DownloadFileCommonWork;

    .line 231
    .line 232
    invoke-direct {v12, v13}, Landroidx/work/OneTimeWorkRequest$Builder;-><init>(Ljava/lang/Class;)V

    .line 233
    .line 234
    .line 235
    sget-object v14, Lcom/zykj/download/work/DownloadFileCommonWork;->Companion:Lcom/zykj/download/work/DownloadFileCommonWork$a;

    .line 236
    .line 237
    iget-object v13, v0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2;->b:Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;

    .line 238
    .line 239
    invoke-virtual {v13}, Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;->getFileUrl()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v15

    .line 243
    const/16 v18, 0x6

    .line 244
    .line 245
    const/16 v19, 0x0

    .line 246
    .line 247
    const/16 v16, 0x0

    .line 248
    .line 249
    const/16 v17, 0x0

    .line 250
    .line 251
    invoke-static/range {v14 .. v19}, Lcom/zykj/download/work/DownloadFileCommonWork$a;->b(Lcom/zykj/download/work/DownloadFileCommonWork$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Landroidx/work/Data;

    .line 252
    .line 253
    .line 254
    move-result-object v13

    .line 255
    invoke-virtual {v12, v13}, Landroidx/work/WorkRequest$Builder;->setInputData(Landroidx/work/Data;)Landroidx/work/WorkRequest$Builder;

    .line 256
    .line 257
    .line 258
    move-result-object v12

    .line 259
    check-cast v12, Landroidx/work/OneTimeWorkRequest$Builder;

    .line 260
    .line 261
    invoke-virtual {v12}, Landroidx/work/WorkRequest$Builder;->build()Landroidx/work/WorkRequest;

    .line 262
    .line 263
    .line 264
    move-result-object v12

    .line 265
    check-cast v12, Landroidx/work/OneTimeWorkRequest;

    .line 266
    .line 267
    sget-object v13, Landroidx/work/WorkManager;->Companion:Landroidx/work/WorkManager$Companion;

    .line 268
    .line 269
    sget-object v14, Lcom/zykj/huiwei/launcher/app/App;->Companion:Lcom/zykj/huiwei/launcher/app/App$a;

    .line 270
    .line 271
    invoke-virtual {v14}, Lcom/zykj/huiwei/launcher/app/App$a;->a()Lcom/zykj/huiwei/launcher/app/App;

    .line 272
    .line 273
    .line 274
    move-result-object v14

    .line 275
    invoke-virtual {v13, v14}, Landroidx/work/WorkManager$Companion;->getInstance(Landroid/content/Context;)Landroidx/work/WorkManager;

    .line 276
    .line 277
    .line 278
    move-result-object v13

    .line 279
    iget-object v14, v0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2;->b:Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;

    .line 280
    .line 281
    invoke-virtual {v14}, Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;->getFileUrl()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v14

    .line 285
    invoke-static {v14}, Lcom/zykj/huiwei/launcher/ext/CommonExtKt;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v14

    .line 289
    sget-object v15, Landroidx/work/ExistingWorkPolicy;->KEEP:Landroidx/work/ExistingWorkPolicy;

    .line 290
    .line 291
    invoke-virtual {v13, v14, v15, v12}, Landroidx/work/WorkManager;->enqueueUniqueWork(Ljava/lang/String;Landroidx/work/ExistingWorkPolicy;Landroidx/work/OneTimeWorkRequest;)Landroidx/work/Operation;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v1}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->k()Landroidx/lifecycle/MutableLiveData;

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    invoke-virtual {v12}, Landroidx/work/WorkRequest;->getId()Ljava/util/UUID;

    .line 299
    .line 300
    .line 301
    move-result-object v12

    .line 302
    invoke-virtual {v1, v12}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    :goto_2
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 306
    .line 307
    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v11

    .line 311
    iput-object v11, v2, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;->c:Ljava/lang/Object;

    .line 312
    .line 313
    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v10

    .line 317
    iput-object v10, v2, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;->e:Ljava/lang/Object;

    .line 318
    .line 319
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v9

    .line 323
    iput-object v9, v2, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;->f:Ljava/lang/Object;

    .line 324
    .line 325
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v8

    .line 329
    iput-object v8, v2, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;->g:Ljava/lang/Object;

    .line 330
    .line 331
    iput-object v7, v2, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;->h:Ljava/lang/Object;

    .line 332
    .line 333
    iput-object v7, v2, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;->i:Ljava/lang/Object;

    .line 334
    .line 335
    iput-object v7, v2, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;->j:Ljava/lang/Object;

    .line 336
    .line 337
    iput-object v7, v2, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;->k:Ljava/lang/Object;

    .line 338
    .line 339
    iput v4, v2, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;->l:I

    .line 340
    .line 341
    iput v5, v2, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2$1;->b:I

    .line 342
    .line 343
    invoke-interface {v6, v1, v2}, Lkotlinx/coroutines/flow/FlowCollector;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    if-ne v1, v3, :cond_6

    .line 348
    .line 349
    :goto_3
    return-object v3

    .line 350
    :cond_6
    :goto_4
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 351
    .line 352
    return-object v1
.end method
