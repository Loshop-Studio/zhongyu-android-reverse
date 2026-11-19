.class final Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lr6/e;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/v;",
        "Ld6/s;",
        "<anonymous>",
        "(Lkotlinx/coroutines/v;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$completeNavigation$1"
    f = "MistakeDetailNewViewModel.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x3,
        0x3,
        0x3,
        0x4,
        0x4,
        0x4
    }
    l = {
        0x1bf,
        0x1c5,
        0x1d8,
        0x1e3,
        0x1f0
    }
    m = "invokeSuspend"
    n = {
        "loadingShownForDraft",
        "isReviewPractice",
        "draftSync",
        "loadingShownForDraft",
        "isReviewPractice",
        "loadingShownForDraft",
        "isReviewPractice",
        "loadingShownForDraft",
        "isReviewPractice",
        "loadingVisible",
        "loadingShownForDraft",
        "isReviewPractice",
        "loadingVisible"
    }
    s = {
        "I$0",
        "Z$0",
        "L$0",
        "I$0",
        "Z$0",
        "I$0",
        "Z$0",
        "I$0",
        "Z$0",
        "I$1",
        "I$0",
        "Z$0",
        "I$1"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMistakeDetailNewViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeDetailNewViewModel.kt\ncom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2474:1\n230#2,5:2475\n230#2,5:2480\n1#3:2485\n*S KotlinDebug\n*F\n+ 1 MistakeDetailNewViewModel.kt\ncom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1\n*L\n451#1:2475,5\n463#1:2480,5\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $navigation:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;

.field final synthetic $skipDraftSync:Z

.field I$0:I

.field I$1:I

.field L$0:Ljava/lang/Object;

.field Z$0:Z

.field label:I

.field final synthetic this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;ZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;",
            "Z",
            "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 2
    .line 3
    iput-boolean p2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->$skipDraftSync:Z

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->$navigation:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lh6/c<",
            "*>;)",
            "Lh6/c<",
            "Ld6/s;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 4
    .line 5
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->$skipDraftSync:Z

    .line 6
    .line 7
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->$navigation:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;-><init>(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;ZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;Lh6/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/v;",
            "Lh6/c<",
            "-",
            "Ld6/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 85

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 4
    .line 5
    iget v0, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->label:I

    .line 6
    .line 7
    sget-object v3, Lcom/zykj/mistake/feature/notebook/detail/h1;->a:Lcom/zykj/mistake/feature/notebook/detail/h1;

    .line 8
    .line 9
    const/4 v4, 0x5

    .line 10
    const/4 v5, 0x4

    .line 11
    const/4 v6, 0x3

    .line 12
    const/4 v7, 0x2

    .line 13
    const/4 v8, 0x0

    .line 14
    sget-object v9, Lcom/zykj/mistake/feature/notebook/detail/x0;->a:Lcom/zykj/mistake/feature/notebook/detail/x0;

    .line 15
    .line 16
    const/4 v10, 0x0

    .line 17
    const/4 v11, 0x1

    .line 18
    if-eqz v0, :cond_5

    .line 19
    .line 20
    if-eq v0, v11, :cond_4

    .line 21
    .line 22
    if-eq v0, v7, :cond_3

    .line 23
    .line 24
    if-eq v0, v6, :cond_2

    .line 25
    .line 26
    if-eq v0, v5, :cond_1

    .line 27
    .line 28
    if-ne v0, v4, :cond_0

    .line 29
    .line 30
    iget v0, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->I$1:I

    .line 31
    .line 32
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    move v3, v0

    .line 36
    move-object/from16 v0, p1

    .line 37
    .line 38
    goto/16 :goto_9

    .line 39
    .line 40
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v0

    .line 48
    :cond_1
    iget v0, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->I$1:I

    .line 49
    .line 50
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    move v3, v0

    .line 54
    move-object/from16 v0, p1

    .line 55
    .line 56
    goto/16 :goto_e

    .line 57
    .line 58
    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto/16 :goto_10

    .line 62
    .line 63
    :cond_3
    iget-boolean v12, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->Z$0:Z

    .line 64
    .line 65
    iget v13, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->I$0:I

    .line 66
    .line 67
    iget-object v0, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->L$0:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, Lcom/zykj/mistake/feature/notebook/detail/h4;

    .line 70
    .line 71
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    .line 73
    .line 74
    move v0, v13

    .line 75
    goto/16 :goto_1

    .line 76
    .line 77
    :catchall_0
    move-exception v0

    .line 78
    goto/16 :goto_2

    .line 79
    .line 80
    :catch_0
    move-exception v0

    .line 81
    goto/16 :goto_4

    .line 82
    .line 83
    :cond_4
    iget-boolean v0, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->Z$0:Z

    .line 84
    .line 85
    iget v12, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->I$0:I

    .line 86
    .line 87
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    move v13, v0

    .line 91
    move v0, v12

    .line 92
    move-object/from16 v12, p1

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_5
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    iget-object v0, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 99
    .line 100
    iget-object v0, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->e:Lkotlinx/coroutines/flow/n0;

    .line 101
    .line 102
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 107
    .line 108
    invoke-static {v0}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->F(Lcom/zykj/mistake/feature/notebook/detail/m3;)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-nez v0, :cond_f

    .line 113
    .line 114
    iget-boolean v12, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->$skipDraftSync:Z

    .line 115
    .line 116
    if-nez v12, :cond_f

    .line 117
    .line 118
    iget-object v12, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 119
    .line 120
    iput v10, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->I$0:I

    .line 121
    .line 122
    iput-boolean v0, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->Z$0:Z

    .line 123
    .line 124
    iput v11, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->label:I

    .line 125
    .line 126
    invoke-static {v12, v1}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->d(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v12

    .line 130
    if-ne v12, v2, :cond_6

    .line 131
    .line 132
    goto/16 :goto_f

    .line 133
    .line 134
    :cond_6
    move v13, v0

    .line 135
    move v0, v10

    .line 136
    :goto_0
    check-cast v12, Lcom/zykj/mistake/feature/notebook/detail/h4;

    .line 137
    .line 138
    sget-object v14, Lcom/zykj/mistake/feature/notebook/detail/f4;->a:Lcom/zykj/mistake/feature/notebook/detail/f4;

    .line 139
    .line 140
    invoke-static {v12, v14}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v14

    .line 144
    if-nez v14, :cond_e

    .line 145
    .line 146
    iget-object v0, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 147
    .line 148
    invoke-virtual {v0, v3}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->S(Lcom/zykj/mistake/feature/notebook/detail/k1;)V

    .line 149
    .line 150
    .line 151
    iget-object v0, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 152
    .line 153
    iget-object v14, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->e:Lkotlinx/coroutines/flow/n0;

    .line 154
    .line 155
    :cond_7
    invoke-virtual {v14}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    move-object v15, v0

    .line 160
    check-cast v15, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 161
    .line 162
    const/16 v83, -0x41

    .line 163
    .line 164
    const/16 v84, 0x1

    .line 165
    .line 166
    const/16 v16, 0x0

    .line 167
    .line 168
    const/16 v17, 0x0

    .line 169
    .line 170
    const-wide/16 v18, 0x0

    .line 171
    .line 172
    const/16 v20, 0x0

    .line 173
    .line 174
    const/16 v21, 0x0

    .line 175
    .line 176
    const/16 v22, 0x0

    .line 177
    .line 178
    const/16 v23, 0x0

    .line 179
    .line 180
    const/16 v24, 0x0

    .line 181
    .line 182
    const/16 v25, 0x0

    .line 183
    .line 184
    const/16 v26, 0x0

    .line 185
    .line 186
    const/16 v27, 0x0

    .line 187
    .line 188
    const/16 v28, 0x0

    .line 189
    .line 190
    const/16 v29, 0x0

    .line 191
    .line 192
    const/16 v30, 0x0

    .line 193
    .line 194
    const/16 v31, 0x0

    .line 195
    .line 196
    const/16 v32, 0x0

    .line 197
    .line 198
    const/16 v33, 0x0

    .line 199
    .line 200
    const/16 v34, 0x0

    .line 201
    .line 202
    const/16 v35, 0x0

    .line 203
    .line 204
    const/16 v36, 0x0

    .line 205
    .line 206
    const/16 v37, 0x0

    .line 207
    .line 208
    const/16 v38, 0x0

    .line 209
    .line 210
    const/16 v39, 0x0

    .line 211
    .line 212
    const/16 v40, 0x0

    .line 213
    .line 214
    const/16 v41, 0x0

    .line 215
    .line 216
    const/16 v42, 0x0

    .line 217
    .line 218
    const/16 v43, 0x0

    .line 219
    .line 220
    const/16 v44, 0x0

    .line 221
    .line 222
    const/16 v45, 0x0

    .line 223
    .line 224
    const/16 v46, 0x0

    .line 225
    .line 226
    const/16 v47, 0x0

    .line 227
    .line 228
    const/16 v48, 0x0

    .line 229
    .line 230
    const/16 v49, 0x0

    .line 231
    .line 232
    const/16 v50, 0x0

    .line 233
    .line 234
    const/16 v51, 0x0

    .line 235
    .line 236
    const/16 v52, 0x0

    .line 237
    .line 238
    const/16 v53, 0x0

    .line 239
    .line 240
    const/16 v54, 0x0

    .line 241
    .line 242
    const/16 v55, 0x1

    .line 243
    .line 244
    const/16 v56, 0x0

    .line 245
    .line 246
    const/16 v57, 0x0

    .line 247
    .line 248
    const/16 v58, 0x0

    .line 249
    .line 250
    const/16 v59, 0x0

    .line 251
    .line 252
    const/16 v60, 0x0

    .line 253
    .line 254
    const/16 v61, 0x0

    .line 255
    .line 256
    const/16 v62, 0x0

    .line 257
    .line 258
    const/16 v63, 0x0

    .line 259
    .line 260
    const/16 v64, 0x0

    .line 261
    .line 262
    const/16 v65, 0x0

    .line 263
    .line 264
    const/16 v66, 0x0

    .line 265
    .line 266
    const/16 v67, 0x0

    .line 267
    .line 268
    const/16 v68, 0x0

    .line 269
    .line 270
    const/16 v69, 0x0

    .line 271
    .line 272
    const/16 v70, 0x0

    .line 273
    .line 274
    const/16 v71, 0x0

    .line 275
    .line 276
    const/16 v72, 0x0

    .line 277
    .line 278
    const/16 v73, 0x0

    .line 279
    .line 280
    const/16 v74, 0x0

    .line 281
    .line 282
    const/16 v75, 0x0

    .line 283
    .line 284
    const/16 v76, 0x0

    .line 285
    .line 286
    const/16 v77, 0x0

    .line 287
    .line 288
    const/16 v78, 0x0

    .line 289
    .line 290
    const/16 v79, 0x0

    .line 291
    .line 292
    const/16 v80, 0x0

    .line 293
    .line 294
    const/16 v81, 0x0

    .line 295
    .line 296
    const/16 v82, -0x1

    .line 297
    .line 298
    invoke-static/range {v15 .. v84}, Lcom/zykj/mistake/feature/notebook/detail/m3;->a(Lcom/zykj/mistake/feature/notebook/detail/m3;IIJLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZLjava/util/List;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;ZZZLjava/lang/Integer;ZZZZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;Ljava/util/List;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/n3;Lcom/zykj/mistake/feature/notebook/detail/k3;Lcom/zykj/mistake/feature/notebook/detail/q0;ZZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;ZZILjava/util/List;IZLjava/util/ArrayList;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZZZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$CreateCollectionEntry;ZZZZZLcom/zykj/mistake/feature/notebook/detail/l3;IIII)Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 299
    .line 300
    .line 301
    move-result-object v15

    .line 302
    invoke-virtual {v14, v0, v15}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result v0

    .line 306
    if-eqz v0, :cond_7

    .line 307
    .line 308
    :try_start_1
    iget-object v0, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 309
    .line 310
    iput-object v8, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->L$0:Ljava/lang/Object;

    .line 311
    .line 312
    iput v11, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->I$0:I

    .line 313
    .line 314
    iput-boolean v13, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->Z$0:Z

    .line 315
    .line 316
    iput v7, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->label:I

    .line 317
    .line 318
    invoke-static {v0, v12, v1}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->f(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Lcom/zykj/mistake/feature/notebook/detail/h4;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v0
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 322
    if-ne v0, v2, :cond_8

    .line 323
    .line 324
    goto/16 :goto_f

    .line 325
    .line 326
    :cond_8
    move v0, v11

    .line 327
    move v12, v13

    .line 328
    :goto_1
    iget-object v13, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 329
    .line 330
    iget-object v14, v13, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->e:Lkotlinx/coroutines/flow/n0;

    .line 331
    .line 332
    :cond_9
    invoke-virtual {v14}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v13

    .line 336
    move-object v15, v13

    .line 337
    check-cast v15, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 338
    .line 339
    const/16 v83, -0x41

    .line 340
    .line 341
    const/16 v84, 0x1

    .line 342
    .line 343
    const/16 v16, 0x0

    .line 344
    .line 345
    const/16 v17, 0x0

    .line 346
    .line 347
    const-wide/16 v18, 0x0

    .line 348
    .line 349
    const/16 v20, 0x0

    .line 350
    .line 351
    const/16 v21, 0x0

    .line 352
    .line 353
    const/16 v22, 0x0

    .line 354
    .line 355
    const/16 v23, 0x0

    .line 356
    .line 357
    const/16 v24, 0x0

    .line 358
    .line 359
    const/16 v25, 0x0

    .line 360
    .line 361
    const/16 v26, 0x0

    .line 362
    .line 363
    const/16 v27, 0x0

    .line 364
    .line 365
    const/16 v28, 0x0

    .line 366
    .line 367
    const/16 v29, 0x0

    .line 368
    .line 369
    const/16 v30, 0x0

    .line 370
    .line 371
    const/16 v31, 0x0

    .line 372
    .line 373
    const/16 v32, 0x0

    .line 374
    .line 375
    const/16 v33, 0x0

    .line 376
    .line 377
    const/16 v34, 0x0

    .line 378
    .line 379
    const/16 v35, 0x0

    .line 380
    .line 381
    const/16 v36, 0x0

    .line 382
    .line 383
    const/16 v37, 0x0

    .line 384
    .line 385
    const/16 v38, 0x0

    .line 386
    .line 387
    const/16 v39, 0x0

    .line 388
    .line 389
    const/16 v40, 0x0

    .line 390
    .line 391
    const/16 v41, 0x0

    .line 392
    .line 393
    const/16 v42, 0x0

    .line 394
    .line 395
    const/16 v43, 0x0

    .line 396
    .line 397
    const/16 v44, 0x0

    .line 398
    .line 399
    const/16 v45, 0x0

    .line 400
    .line 401
    const/16 v46, 0x0

    .line 402
    .line 403
    const/16 v47, 0x0

    .line 404
    .line 405
    const/16 v48, 0x0

    .line 406
    .line 407
    const/16 v49, 0x0

    .line 408
    .line 409
    const/16 v50, 0x0

    .line 410
    .line 411
    const/16 v51, 0x0

    .line 412
    .line 413
    const/16 v52, 0x0

    .line 414
    .line 415
    const/16 v53, 0x0

    .line 416
    .line 417
    const/16 v54, 0x0

    .line 418
    .line 419
    const/16 v55, 0x0

    .line 420
    .line 421
    const/16 v56, 0x0

    .line 422
    .line 423
    const/16 v57, 0x0

    .line 424
    .line 425
    const/16 v58, 0x0

    .line 426
    .line 427
    const/16 v59, 0x0

    .line 428
    .line 429
    const/16 v60, 0x0

    .line 430
    .line 431
    const/16 v61, 0x0

    .line 432
    .line 433
    const/16 v62, 0x0

    .line 434
    .line 435
    const/16 v63, 0x0

    .line 436
    .line 437
    const/16 v64, 0x0

    .line 438
    .line 439
    const/16 v65, 0x0

    .line 440
    .line 441
    const/16 v66, 0x0

    .line 442
    .line 443
    const/16 v67, 0x0

    .line 444
    .line 445
    const/16 v68, 0x0

    .line 446
    .line 447
    const/16 v69, 0x0

    .line 448
    .line 449
    const/16 v70, 0x0

    .line 450
    .line 451
    const/16 v71, 0x0

    .line 452
    .line 453
    const/16 v72, 0x0

    .line 454
    .line 455
    const/16 v73, 0x0

    .line 456
    .line 457
    const/16 v74, 0x0

    .line 458
    .line 459
    const/16 v75, 0x0

    .line 460
    .line 461
    const/16 v76, 0x0

    .line 462
    .line 463
    const/16 v77, 0x0

    .line 464
    .line 465
    const/16 v78, 0x0

    .line 466
    .line 467
    const/16 v79, 0x0

    .line 468
    .line 469
    const/16 v80, 0x0

    .line 470
    .line 471
    const/16 v81, 0x0

    .line 472
    .line 473
    const/16 v82, -0x1

    .line 474
    .line 475
    invoke-static/range {v15 .. v84}, Lcom/zykj/mistake/feature/notebook/detail/m3;->a(Lcom/zykj/mistake/feature/notebook/detail/m3;IIJLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZLjava/util/List;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;ZZZLjava/lang/Integer;ZZZZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;Ljava/util/List;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/n3;Lcom/zykj/mistake/feature/notebook/detail/k3;Lcom/zykj/mistake/feature/notebook/detail/q0;ZZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;ZZILjava/util/List;IZLjava/util/ArrayList;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZZZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$CreateCollectionEntry;ZZZZZLcom/zykj/mistake/feature/notebook/detail/l3;IIII)Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 476
    .line 477
    .line 478
    move-result-object v15

    .line 479
    invoke-virtual {v14, v13, v15}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 480
    .line 481
    .line 482
    move-result v13

    .line 483
    if-eqz v13, :cond_9

    .line 484
    .line 485
    goto/16 :goto_7

    .line 486
    .line 487
    :catchall_1
    move-exception v0

    .line 488
    move v12, v13

    .line 489
    move v13, v11

    .line 490
    :goto_2
    :try_start_2
    iget-object v14, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 491
    .line 492
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    if-nez v0, :cond_a

    .line 497
    .line 498
    const-string v0, ""

    .line 499
    .line 500
    goto :goto_3

    .line 501
    :catchall_2
    move-exception v0

    .line 502
    goto/16 :goto_5

    .line 503
    .line 504
    :cond_a
    :goto_3
    invoke-static {v0}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 505
    .line 506
    .line 507
    move-result v15

    .line 508
    if-eqz v15, :cond_b

    .line 509
    .line 510
    const-string v0, "\u8349\u7a3f\u4e0a\u4f20\u5931\u8d25\uff0c\u8bf7\u68c0\u67e5\u7f51\u7edc\u540e\u91cd\u8bd5"

    .line 511
    .line 512
    :cond_b
    new-instance v15, Lcom/zykj/mistake/feature/notebook/detail/j1;

    .line 513
    .line 514
    invoke-direct {v15, v0}, Lcom/zykj/mistake/feature/notebook/detail/j1;-><init>(Ljava/lang/String;)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {v14, v15}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->S(Lcom/zykj/mistake/feature/notebook/detail/k1;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 518
    .line 519
    .line 520
    iget-object v0, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 521
    .line 522
    iget-object v0, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->e:Lkotlinx/coroutines/flow/n0;

    .line 523
    .line 524
    :cond_c
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v14

    .line 528
    move-object v15, v14

    .line 529
    check-cast v15, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 530
    .line 531
    const/16 v83, -0x41

    .line 532
    .line 533
    const/16 v84, 0x1

    .line 534
    .line 535
    const/16 v16, 0x0

    .line 536
    .line 537
    const/16 v17, 0x0

    .line 538
    .line 539
    const-wide/16 v18, 0x0

    .line 540
    .line 541
    const/16 v20, 0x0

    .line 542
    .line 543
    const/16 v21, 0x0

    .line 544
    .line 545
    const/16 v22, 0x0

    .line 546
    .line 547
    const/16 v23, 0x0

    .line 548
    .line 549
    const/16 v24, 0x0

    .line 550
    .line 551
    const/16 v25, 0x0

    .line 552
    .line 553
    const/16 v26, 0x0

    .line 554
    .line 555
    const/16 v27, 0x0

    .line 556
    .line 557
    const/16 v28, 0x0

    .line 558
    .line 559
    const/16 v29, 0x0

    .line 560
    .line 561
    const/16 v30, 0x0

    .line 562
    .line 563
    const/16 v31, 0x0

    .line 564
    .line 565
    const/16 v32, 0x0

    .line 566
    .line 567
    const/16 v33, 0x0

    .line 568
    .line 569
    const/16 v34, 0x0

    .line 570
    .line 571
    const/16 v35, 0x0

    .line 572
    .line 573
    const/16 v36, 0x0

    .line 574
    .line 575
    const/16 v37, 0x0

    .line 576
    .line 577
    const/16 v38, 0x0

    .line 578
    .line 579
    const/16 v39, 0x0

    .line 580
    .line 581
    const/16 v40, 0x0

    .line 582
    .line 583
    const/16 v41, 0x0

    .line 584
    .line 585
    const/16 v42, 0x0

    .line 586
    .line 587
    const/16 v43, 0x0

    .line 588
    .line 589
    const/16 v44, 0x0

    .line 590
    .line 591
    const/16 v45, 0x0

    .line 592
    .line 593
    const/16 v46, 0x0

    .line 594
    .line 595
    const/16 v47, 0x0

    .line 596
    .line 597
    const/16 v48, 0x0

    .line 598
    .line 599
    const/16 v49, 0x0

    .line 600
    .line 601
    const/16 v50, 0x0

    .line 602
    .line 603
    const/16 v51, 0x0

    .line 604
    .line 605
    const/16 v52, 0x0

    .line 606
    .line 607
    const/16 v53, 0x0

    .line 608
    .line 609
    const/16 v54, 0x0

    .line 610
    .line 611
    const/16 v55, 0x0

    .line 612
    .line 613
    const/16 v56, 0x0

    .line 614
    .line 615
    const/16 v57, 0x0

    .line 616
    .line 617
    const/16 v58, 0x0

    .line 618
    .line 619
    const/16 v59, 0x0

    .line 620
    .line 621
    const/16 v60, 0x0

    .line 622
    .line 623
    const/16 v61, 0x0

    .line 624
    .line 625
    const/16 v62, 0x0

    .line 626
    .line 627
    const/16 v63, 0x0

    .line 628
    .line 629
    const/16 v64, 0x0

    .line 630
    .line 631
    const/16 v65, 0x0

    .line 632
    .line 633
    const/16 v66, 0x0

    .line 634
    .line 635
    const/16 v67, 0x0

    .line 636
    .line 637
    const/16 v68, 0x0

    .line 638
    .line 639
    const/16 v69, 0x0

    .line 640
    .line 641
    const/16 v70, 0x0

    .line 642
    .line 643
    const/16 v71, 0x0

    .line 644
    .line 645
    const/16 v72, 0x0

    .line 646
    .line 647
    const/16 v73, 0x0

    .line 648
    .line 649
    const/16 v74, 0x0

    .line 650
    .line 651
    const/16 v75, 0x0

    .line 652
    .line 653
    const/16 v76, 0x0

    .line 654
    .line 655
    const/16 v77, 0x0

    .line 656
    .line 657
    const/16 v78, 0x0

    .line 658
    .line 659
    const/16 v79, 0x0

    .line 660
    .line 661
    const/16 v80, 0x0

    .line 662
    .line 663
    const/16 v81, 0x0

    .line 664
    .line 665
    const/16 v82, -0x1

    .line 666
    .line 667
    invoke-static/range {v15 .. v84}, Lcom/zykj/mistake/feature/notebook/detail/m3;->a(Lcom/zykj/mistake/feature/notebook/detail/m3;IIJLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZLjava/util/List;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;ZZZLjava/lang/Integer;ZZZZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;Ljava/util/List;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/n3;Lcom/zykj/mistake/feature/notebook/detail/k3;Lcom/zykj/mistake/feature/notebook/detail/q0;ZZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;ZZILjava/util/List;IZLjava/util/ArrayList;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZZZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$CreateCollectionEntry;ZZZZZLcom/zykj/mistake/feature/notebook/detail/l3;IIII)Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 668
    .line 669
    .line 670
    move-result-object v15

    .line 671
    invoke-virtual {v0, v14, v15}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 672
    .line 673
    .line 674
    move-result v14

    .line 675
    if-eqz v14, :cond_c

    .line 676
    .line 677
    move v0, v13

    .line 678
    goto/16 :goto_7

    .line 679
    .line 680
    :goto_4
    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 681
    :goto_5
    iget-object v2, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 682
    .line 683
    iget-object v2, v2, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->e:Lkotlinx/coroutines/flow/n0;

    .line 684
    .line 685
    :goto_6
    invoke-virtual {v2}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 686
    .line 687
    .line 688
    move-result-object v3

    .line 689
    move-object v4, v3

    .line 690
    check-cast v4, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 691
    .line 692
    const/16 v72, -0x41

    .line 693
    .line 694
    const/16 v73, 0x1

    .line 695
    .line 696
    const/4 v5, 0x0

    .line 697
    const/4 v6, 0x0

    .line 698
    const-wide/16 v7, 0x0

    .line 699
    .line 700
    const/4 v9, 0x0

    .line 701
    const/4 v10, 0x0

    .line 702
    const/4 v11, 0x0

    .line 703
    const/4 v12, 0x0

    .line 704
    const/4 v13, 0x0

    .line 705
    const/4 v14, 0x0

    .line 706
    const/4 v15, 0x0

    .line 707
    const/16 v16, 0x0

    .line 708
    .line 709
    const/16 v17, 0x0

    .line 710
    .line 711
    const/16 v18, 0x0

    .line 712
    .line 713
    const/16 v19, 0x0

    .line 714
    .line 715
    const/16 v20, 0x0

    .line 716
    .line 717
    const/16 v21, 0x0

    .line 718
    .line 719
    const/16 v22, 0x0

    .line 720
    .line 721
    const/16 v23, 0x0

    .line 722
    .line 723
    const/16 v24, 0x0

    .line 724
    .line 725
    const/16 v25, 0x0

    .line 726
    .line 727
    const/16 v26, 0x0

    .line 728
    .line 729
    const/16 v27, 0x0

    .line 730
    .line 731
    const/16 v28, 0x0

    .line 732
    .line 733
    const/16 v29, 0x0

    .line 734
    .line 735
    const/16 v30, 0x0

    .line 736
    .line 737
    const/16 v31, 0x0

    .line 738
    .line 739
    const/16 v32, 0x0

    .line 740
    .line 741
    const/16 v33, 0x0

    .line 742
    .line 743
    const/16 v34, 0x0

    .line 744
    .line 745
    const/16 v35, 0x0

    .line 746
    .line 747
    const/16 v36, 0x0

    .line 748
    .line 749
    const/16 v37, 0x0

    .line 750
    .line 751
    const/16 v38, 0x0

    .line 752
    .line 753
    const/16 v39, 0x0

    .line 754
    .line 755
    const/16 v40, 0x0

    .line 756
    .line 757
    const/16 v41, 0x0

    .line 758
    .line 759
    const/16 v42, 0x0

    .line 760
    .line 761
    const/16 v43, 0x0

    .line 762
    .line 763
    const/16 v44, 0x0

    .line 764
    .line 765
    const/16 v45, 0x0

    .line 766
    .line 767
    const/16 v46, 0x0

    .line 768
    .line 769
    const/16 v47, 0x0

    .line 770
    .line 771
    const/16 v48, 0x0

    .line 772
    .line 773
    const/16 v49, 0x0

    .line 774
    .line 775
    const/16 v50, 0x0

    .line 776
    .line 777
    const/16 v51, 0x0

    .line 778
    .line 779
    const/16 v52, 0x0

    .line 780
    .line 781
    const/16 v53, 0x0

    .line 782
    .line 783
    const/16 v54, 0x0

    .line 784
    .line 785
    const/16 v55, 0x0

    .line 786
    .line 787
    const/16 v56, 0x0

    .line 788
    .line 789
    const/16 v57, 0x0

    .line 790
    .line 791
    const/16 v58, 0x0

    .line 792
    .line 793
    const/16 v59, 0x0

    .line 794
    .line 795
    const/16 v60, 0x0

    .line 796
    .line 797
    const/16 v61, 0x0

    .line 798
    .line 799
    const/16 v62, 0x0

    .line 800
    .line 801
    const/16 v63, 0x0

    .line 802
    .line 803
    const/16 v64, 0x0

    .line 804
    .line 805
    const/16 v65, 0x0

    .line 806
    .line 807
    const/16 v66, 0x0

    .line 808
    .line 809
    const/16 v67, 0x0

    .line 810
    .line 811
    const/16 v68, 0x0

    .line 812
    .line 813
    const/16 v69, 0x0

    .line 814
    .line 815
    const/16 v70, 0x0

    .line 816
    .line 817
    const/16 v71, -0x1

    .line 818
    .line 819
    invoke-static/range {v4 .. v73}, Lcom/zykj/mistake/feature/notebook/detail/m3;->a(Lcom/zykj/mistake/feature/notebook/detail/m3;IIJLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZLjava/util/List;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;ZZZLjava/lang/Integer;ZZZZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;Ljava/util/List;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/n3;Lcom/zykj/mistake/feature/notebook/detail/k3;Lcom/zykj/mistake/feature/notebook/detail/q0;ZZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;ZZILjava/util/List;IZLjava/util/ArrayList;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZZZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$CreateCollectionEntry;ZZZZZLcom/zykj/mistake/feature/notebook/detail/l3;IIII)Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 820
    .line 821
    .line 822
    move-result-object v4

    .line 823
    invoke-virtual {v2, v3, v4}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 824
    .line 825
    .line 826
    move-result v3

    .line 827
    if-nez v3, :cond_d

    .line 828
    .line 829
    goto/16 :goto_6

    .line 830
    .line 831
    :cond_d
    throw v0

    .line 832
    :cond_e
    move v12, v13

    .line 833
    goto :goto_7

    .line 834
    :cond_f
    move v12, v0

    .line 835
    move v0, v10

    .line 836
    :goto_7
    iget-object v13, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->$navigation:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;

    .line 837
    .line 838
    sget-object v14, Lcom/zykj/mistake/feature/notebook/detail/i4;->a:[I

    .line 839
    .line 840
    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    .line 841
    .line 842
    .line 843
    move-result v13

    .line 844
    aget v13, v14, v13

    .line 845
    .line 846
    if-eq v13, v11, :cond_26

    .line 847
    .line 848
    if-eq v13, v7, :cond_20

    .line 849
    .line 850
    if-eq v13, v6, :cond_12

    .line 851
    .line 852
    if-ne v13, v5, :cond_11

    .line 853
    .line 854
    if-eqz v0, :cond_10

    .line 855
    .line 856
    iget-object v0, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 857
    .line 858
    invoke-virtual {v0, v9}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->S(Lcom/zykj/mistake/feature/notebook/detail/k1;)V

    .line 859
    .line 860
    .line 861
    :cond_10
    iget-object v0, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 862
    .line 863
    iget-boolean v2, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->d:Z

    .line 864
    .line 865
    iput-boolean v11, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->d:Z

    .line 866
    .line 867
    invoke-virtual {v0, v2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->w(Z)V

    .line 868
    .line 869
    .line 870
    goto/16 :goto_10

    .line 871
    .line 872
    :cond_11
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 873
    .line 874
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 875
    .line 876
    .line 877
    throw v0

    .line 878
    :cond_12
    if-nez v0, :cond_14

    .line 879
    .line 880
    iget-object v5, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 881
    .line 882
    iget-object v7, v5, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->e:Lkotlinx/coroutines/flow/n0;

    .line 883
    .line 884
    invoke-virtual {v7}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 885
    .line 886
    .line 887
    move-result-object v7

    .line 888
    check-cast v7, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 889
    .line 890
    iget-boolean v7, v7, Lcom/zykj/mistake/feature/notebook/detail/m3;->u:Z

    .line 891
    .line 892
    if-nez v7, :cond_13

    .line 893
    .line 894
    move v3, v10

    .line 895
    goto :goto_8

    .line 896
    :cond_13
    invoke-virtual {v5, v3}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->S(Lcom/zykj/mistake/feature/notebook/detail/k1;)V

    .line 897
    .line 898
    .line 899
    :cond_14
    move v3, v11

    .line 900
    :goto_8
    iget-object v5, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 901
    .line 902
    iput-object v8, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->L$0:Ljava/lang/Object;

    .line 903
    .line 904
    iput v0, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->I$0:I

    .line 905
    .line 906
    iput-boolean v12, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->Z$0:Z

    .line 907
    .line 908
    iput v3, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->I$1:I

    .line 909
    .line 910
    iput v4, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->label:I

    .line 911
    .line 912
    invoke-static {v5, v1}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->e(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 913
    .line 914
    .line 915
    move-result-object v0

    .line 916
    if-ne v0, v2, :cond_15

    .line 917
    .line 918
    goto/16 :goto_f

    .line 919
    .line 920
    :cond_15
    :goto_9
    check-cast v0, Ljava/lang/Boolean;

    .line 921
    .line 922
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 923
    .line 924
    .line 925
    move-result v0

    .line 926
    if-nez v0, :cond_16

    .line 927
    .line 928
    if-eqz v3, :cond_2a

    .line 929
    .line 930
    iget-object v0, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 931
    .line 932
    invoke-virtual {v0, v9}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->S(Lcom/zykj/mistake/feature/notebook/detail/k1;)V

    .line 933
    .line 934
    .line 935
    goto/16 :goto_10

    .line 936
    .line 937
    :cond_16
    iget-object v0, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 938
    .line 939
    iget-object v0, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->e:Lkotlinx/coroutines/flow/n0;

    .line 940
    .line 941
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 942
    .line 943
    .line 944
    move-result-object v0

    .line 945
    check-cast v0, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 946
    .line 947
    iget-object v0, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->d:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;

    .line 948
    .line 949
    sget-object v2, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;->REVIEW_RECOMMEND:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;

    .line 950
    .line 951
    if-ne v0, v2, :cond_1e

    .line 952
    .line 953
    iget-object v0, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 954
    .line 955
    if-eqz v3, :cond_17

    .line 956
    .line 957
    move v2, v11

    .line 958
    goto :goto_a

    .line 959
    :cond_17
    move v2, v10

    .line 960
    :goto_a
    iget-object v4, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->e:Lkotlinx/coroutines/flow/n0;

    .line 961
    .line 962
    invoke-virtual {v4}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 963
    .line 964
    .line 965
    move-result-object v5

    .line 966
    check-cast v5, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 967
    .line 968
    iget v7, v5, Lcom/zykj/mistake/feature/notebook/detail/m3;->S:I

    .line 969
    .line 970
    add-int/2addr v7, v11

    .line 971
    iget-object v12, v5, Lcom/zykj/mistake/feature/notebook/detail/m3;->R:Ljava/util/List;

    .line 972
    .line 973
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 974
    .line 975
    .line 976
    move-result v12

    .line 977
    if-ge v7, v12, :cond_18

    .line 978
    .line 979
    invoke-virtual {v0, v11, v2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->X(IZ)Z

    .line 980
    .line 981
    .line 982
    move-result v10

    .line 983
    goto/16 :goto_c

    .line 984
    .line 985
    :cond_18
    iget-object v5, v5, Lcom/zykj/mistake/feature/notebook/detail/m3;->e:Ljava/lang/String;

    .line 986
    .line 987
    sget-object v7, Lcom/zykj/mistake/feature/review/q;->a:Lcom/zykj/mistake/feature/review/q;

    .line 988
    .line 989
    invoke-static {v5}, Lcom/zykj/mistake/feature/review/q;->f(Ljava/lang/String;)Lcom/zykj/mistake/feature/review/o;

    .line 990
    .line 991
    .line 992
    move-result-object v7

    .line 993
    sget-object v12, Lcom/zykj/mistake/feature/review/q;->b:Ljava/util/LinkedHashMap;

    .line 994
    .line 995
    invoke-virtual {v12, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 996
    .line 997
    .line 998
    move-result-object v13

    .line 999
    check-cast v13, Lcom/zykj/mistake/feature/review/n;

    .line 1000
    .line 1001
    if-eqz v13, :cond_1a

    .line 1002
    .line 1003
    iget-boolean v13, v13, Lcom/zykj/mistake/feature/review/n;->i:Z

    .line 1004
    .line 1005
    if-ne v13, v11, :cond_1a

    .line 1006
    .line 1007
    :cond_19
    invoke-virtual {v4}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v0

    .line 1011
    move-object v11, v0

    .line 1012
    check-cast v11, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 1013
    .line 1014
    invoke-static {v7}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->d0(Lcom/zykj/mistake/feature/review/o;)Lcom/zykj/mistake/feature/notebook/detail/l3;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v76

    .line 1018
    const v79, 0x5fffffff

    .line 1019
    .line 1020
    .line 1021
    const/16 v80, 0x1

    .line 1022
    .line 1023
    const/4 v12, 0x0

    .line 1024
    const/4 v13, 0x0

    .line 1025
    const-wide/16 v14, 0x0

    .line 1026
    .line 1027
    const/16 v16, 0x0

    .line 1028
    .line 1029
    const/16 v17, 0x0

    .line 1030
    .line 1031
    const/16 v18, 0x0

    .line 1032
    .line 1033
    const/16 v19, 0x0

    .line 1034
    .line 1035
    const/16 v20, 0x0

    .line 1036
    .line 1037
    const/16 v21, 0x0

    .line 1038
    .line 1039
    const/16 v22, 0x0

    .line 1040
    .line 1041
    const/16 v23, 0x0

    .line 1042
    .line 1043
    const/16 v24, 0x0

    .line 1044
    .line 1045
    const/16 v25, 0x0

    .line 1046
    .line 1047
    const/16 v26, 0x0

    .line 1048
    .line 1049
    const/16 v27, 0x0

    .line 1050
    .line 1051
    const/16 v28, 0x0

    .line 1052
    .line 1053
    const/16 v29, 0x0

    .line 1054
    .line 1055
    const/16 v30, 0x0

    .line 1056
    .line 1057
    const/16 v31, 0x0

    .line 1058
    .line 1059
    const/16 v32, 0x0

    .line 1060
    .line 1061
    const/16 v33, 0x0

    .line 1062
    .line 1063
    const/16 v34, 0x0

    .line 1064
    .line 1065
    const/16 v35, 0x0

    .line 1066
    .line 1067
    const/16 v36, 0x0

    .line 1068
    .line 1069
    const/16 v37, 0x0

    .line 1070
    .line 1071
    const/16 v38, 0x0

    .line 1072
    .line 1073
    const/16 v39, 0x0

    .line 1074
    .line 1075
    const/16 v40, 0x0

    .line 1076
    .line 1077
    const/16 v41, 0x0

    .line 1078
    .line 1079
    const/16 v42, 0x0

    .line 1080
    .line 1081
    const/16 v43, 0x0

    .line 1082
    .line 1083
    const/16 v44, 0x0

    .line 1084
    .line 1085
    const/16 v45, 0x0

    .line 1086
    .line 1087
    const/16 v46, 0x0

    .line 1088
    .line 1089
    const/16 v47, 0x0

    .line 1090
    .line 1091
    const/16 v48, 0x0

    .line 1092
    .line 1093
    const/16 v49, 0x0

    .line 1094
    .line 1095
    const/16 v50, 0x0

    .line 1096
    .line 1097
    const/16 v51, 0x0

    .line 1098
    .line 1099
    const/16 v52, 0x0

    .line 1100
    .line 1101
    const/16 v53, 0x0

    .line 1102
    .line 1103
    const/16 v54, 0x0

    .line 1104
    .line 1105
    const/16 v55, 0x0

    .line 1106
    .line 1107
    const/16 v56, 0x0

    .line 1108
    .line 1109
    const/16 v57, 0x0

    .line 1110
    .line 1111
    const/16 v58, 0x0

    .line 1112
    .line 1113
    const/16 v59, 0x0

    .line 1114
    .line 1115
    const/16 v60, 0x0

    .line 1116
    .line 1117
    const/16 v61, 0x0

    .line 1118
    .line 1119
    const/16 v62, 0x0

    .line 1120
    .line 1121
    const/16 v63, 0x0

    .line 1122
    .line 1123
    const/16 v64, 0x0

    .line 1124
    .line 1125
    const/16 v65, 0x0

    .line 1126
    .line 1127
    const/16 v66, 0x0

    .line 1128
    .line 1129
    const/16 v67, 0x0

    .line 1130
    .line 1131
    const/16 v68, 0x0

    .line 1132
    .line 1133
    const/16 v69, 0x0

    .line 1134
    .line 1135
    const/16 v70, 0x0

    .line 1136
    .line 1137
    const/16 v71, 0x0

    .line 1138
    .line 1139
    const/16 v72, 0x0

    .line 1140
    .line 1141
    const/16 v73, 0x0

    .line 1142
    .line 1143
    const/16 v74, 0x1

    .line 1144
    .line 1145
    const/16 v75, 0x0

    .line 1146
    .line 1147
    const/16 v77, 0x0

    .line 1148
    .line 1149
    const/16 v78, -0x1

    .line 1150
    .line 1151
    invoke-static/range {v11 .. v80}, Lcom/zykj/mistake/feature/notebook/detail/m3;->a(Lcom/zykj/mistake/feature/notebook/detail/m3;IIJLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZLjava/util/List;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;ZZZLjava/lang/Integer;ZZZZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;Ljava/util/List;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/n3;Lcom/zykj/mistake/feature/notebook/detail/k3;Lcom/zykj/mistake/feature/notebook/detail/q0;ZZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;ZZILjava/util/List;IZLjava/util/ArrayList;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZZZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$CreateCollectionEntry;ZZZZZLcom/zykj/mistake/feature/notebook/detail/l3;IIII)Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v2

    .line 1155
    invoke-virtual {v4, v0, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1156
    .line 1157
    .line 1158
    move-result v0

    .line 1159
    if-eqz v0, :cond_19

    .line 1160
    .line 1161
    goto/16 :goto_c

    .line 1162
    .line 1163
    :cond_1a
    invoke-virtual {v12, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v12

    .line 1167
    check-cast v12, Lcom/zykj/mistake/feature/review/n;

    .line 1168
    .line 1169
    if-eqz v12, :cond_1d

    .line 1170
    .line 1171
    iget-boolean v12, v12, Lcom/zykj/mistake/feature/review/n;->h:Z

    .line 1172
    .line 1173
    if-ne v12, v11, :cond_1d

    .line 1174
    .line 1175
    :cond_1b
    invoke-virtual {v4}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v0

    .line 1179
    move-object v11, v0

    .line 1180
    check-cast v11, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 1181
    .line 1182
    invoke-static {v7}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->d0(Lcom/zykj/mistake/feature/review/o;)Lcom/zykj/mistake/feature/notebook/detail/l3;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v76

    .line 1186
    sget-object v2, Lcom/zykj/mistake/feature/review/q;->b:Ljava/util/LinkedHashMap;

    .line 1187
    .line 1188
    invoke-virtual {v2, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v2

    .line 1192
    check-cast v2, Lcom/zykj/mistake/feature/review/n;

    .line 1193
    .line 1194
    if-eqz v2, :cond_1c

    .line 1195
    .line 1196
    iget v2, v2, Lcom/zykj/mistake/feature/review/n;->g:I

    .line 1197
    .line 1198
    move/from16 v77, v2

    .line 1199
    .line 1200
    goto :goto_b

    .line 1201
    :cond_1c
    move/from16 v77, v10

    .line 1202
    .line 1203
    :goto_b
    const v79, 0x77ffffff

    .line 1204
    .line 1205
    .line 1206
    const/16 v80, 0x0

    .line 1207
    .line 1208
    const/4 v12, 0x0

    .line 1209
    const/4 v13, 0x0

    .line 1210
    const-wide/16 v14, 0x0

    .line 1211
    .line 1212
    const/16 v16, 0x0

    .line 1213
    .line 1214
    const/16 v17, 0x0

    .line 1215
    .line 1216
    const/16 v18, 0x0

    .line 1217
    .line 1218
    const/16 v19, 0x0

    .line 1219
    .line 1220
    const/16 v20, 0x0

    .line 1221
    .line 1222
    const/16 v21, 0x0

    .line 1223
    .line 1224
    const/16 v22, 0x0

    .line 1225
    .line 1226
    const/16 v23, 0x0

    .line 1227
    .line 1228
    const/16 v24, 0x0

    .line 1229
    .line 1230
    const/16 v25, 0x0

    .line 1231
    .line 1232
    const/16 v26, 0x0

    .line 1233
    .line 1234
    const/16 v27, 0x0

    .line 1235
    .line 1236
    const/16 v28, 0x0

    .line 1237
    .line 1238
    const/16 v29, 0x0

    .line 1239
    .line 1240
    const/16 v30, 0x0

    .line 1241
    .line 1242
    const/16 v31, 0x0

    .line 1243
    .line 1244
    const/16 v32, 0x0

    .line 1245
    .line 1246
    const/16 v33, 0x0

    .line 1247
    .line 1248
    const/16 v34, 0x0

    .line 1249
    .line 1250
    const/16 v35, 0x0

    .line 1251
    .line 1252
    const/16 v36, 0x0

    .line 1253
    .line 1254
    const/16 v37, 0x0

    .line 1255
    .line 1256
    const/16 v38, 0x0

    .line 1257
    .line 1258
    const/16 v39, 0x0

    .line 1259
    .line 1260
    const/16 v40, 0x0

    .line 1261
    .line 1262
    const/16 v41, 0x0

    .line 1263
    .line 1264
    const/16 v42, 0x0

    .line 1265
    .line 1266
    const/16 v43, 0x0

    .line 1267
    .line 1268
    const/16 v44, 0x0

    .line 1269
    .line 1270
    const/16 v45, 0x0

    .line 1271
    .line 1272
    const/16 v46, 0x0

    .line 1273
    .line 1274
    const/16 v47, 0x0

    .line 1275
    .line 1276
    const/16 v48, 0x0

    .line 1277
    .line 1278
    const/16 v49, 0x0

    .line 1279
    .line 1280
    const/16 v50, 0x0

    .line 1281
    .line 1282
    const/16 v51, 0x0

    .line 1283
    .line 1284
    const/16 v52, 0x0

    .line 1285
    .line 1286
    const/16 v53, 0x0

    .line 1287
    .line 1288
    const/16 v54, 0x0

    .line 1289
    .line 1290
    const/16 v55, 0x0

    .line 1291
    .line 1292
    const/16 v56, 0x0

    .line 1293
    .line 1294
    const/16 v57, 0x0

    .line 1295
    .line 1296
    const/16 v58, 0x0

    .line 1297
    .line 1298
    const/16 v59, 0x0

    .line 1299
    .line 1300
    const/16 v60, 0x0

    .line 1301
    .line 1302
    const/16 v61, 0x0

    .line 1303
    .line 1304
    const/16 v62, 0x0

    .line 1305
    .line 1306
    const/16 v63, 0x0

    .line 1307
    .line 1308
    const/16 v64, 0x0

    .line 1309
    .line 1310
    const/16 v65, 0x0

    .line 1311
    .line 1312
    const/16 v66, 0x0

    .line 1313
    .line 1314
    const/16 v67, 0x0

    .line 1315
    .line 1316
    const/16 v68, 0x0

    .line 1317
    .line 1318
    const/16 v69, 0x0

    .line 1319
    .line 1320
    const/16 v70, 0x0

    .line 1321
    .line 1322
    const/16 v71, 0x0

    .line 1323
    .line 1324
    const/16 v72, 0x1

    .line 1325
    .line 1326
    const/16 v73, 0x0

    .line 1327
    .line 1328
    const/16 v74, 0x0

    .line 1329
    .line 1330
    const/16 v75, 0x0

    .line 1331
    .line 1332
    const/16 v78, -0x1

    .line 1333
    .line 1334
    invoke-static/range {v11 .. v80}, Lcom/zykj/mistake/feature/notebook/detail/m3;->a(Lcom/zykj/mistake/feature/notebook/detail/m3;IIJLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZLjava/util/List;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;ZZZLjava/lang/Integer;ZZZZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;Ljava/util/List;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/n3;Lcom/zykj/mistake/feature/notebook/detail/k3;Lcom/zykj/mistake/feature/notebook/detail/q0;ZZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;ZZILjava/util/List;IZLjava/util/ArrayList;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZZZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$CreateCollectionEntry;ZZZZZLcom/zykj/mistake/feature/notebook/detail/l3;IIII)Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 1335
    .line 1336
    .line 1337
    move-result-object v2

    .line 1338
    invoke-virtual {v4, v0, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1339
    .line 1340
    .line 1341
    move-result v0

    .line 1342
    if-eqz v0, :cond_1b

    .line 1343
    .line 1344
    goto :goto_c

    .line 1345
    :cond_1d
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 1346
    .line 1347
    .line 1348
    move-result-object v4

    .line 1349
    new-instance v7, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$switchReviewQuestion$3;

    .line 1350
    .line 1351
    invoke-direct {v7, v2, v0, v5, v8}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$switchReviewQuestion$3;-><init>(ZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Ljava/lang/String;Lh6/c;)V

    .line 1352
    .line 1353
    .line 1354
    invoke-static {v4, v8, v8, v7, v6}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 1355
    .line 1356
    .line 1357
    move v10, v11

    .line 1358
    :goto_c
    if-eqz v3, :cond_2a

    .line 1359
    .line 1360
    if-nez v10, :cond_2a

    .line 1361
    .line 1362
    iget-object v0, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 1363
    .line 1364
    invoke-virtual {v0, v9}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->S(Lcom/zykj/mistake/feature/notebook/detail/k1;)V

    .line 1365
    .line 1366
    .line 1367
    goto/16 :goto_10

    .line 1368
    .line 1369
    :cond_1e
    iget-object v0, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 1370
    .line 1371
    if-eqz v3, :cond_1f

    .line 1372
    .line 1373
    move v10, v11

    .line 1374
    :cond_1f
    invoke-virtual {v0, v11, v10}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->X(IZ)Z

    .line 1375
    .line 1376
    .line 1377
    move-result v0

    .line 1378
    if-eqz v3, :cond_2a

    .line 1379
    .line 1380
    if-nez v0, :cond_2a

    .line 1381
    .line 1382
    iget-object v0, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 1383
    .line 1384
    invoke-virtual {v0, v9}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->S(Lcom/zykj/mistake/feature/notebook/detail/k1;)V

    .line 1385
    .line 1386
    .line 1387
    goto/16 :goto_10

    .line 1388
    .line 1389
    :cond_20
    if-nez v0, :cond_22

    .line 1390
    .line 1391
    iget-object v4, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 1392
    .line 1393
    iget-object v6, v4, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->e:Lkotlinx/coroutines/flow/n0;

    .line 1394
    .line 1395
    invoke-virtual {v6}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1396
    .line 1397
    .line 1398
    move-result-object v6

    .line 1399
    check-cast v6, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 1400
    .line 1401
    iget-boolean v6, v6, Lcom/zykj/mistake/feature/notebook/detail/m3;->u:Z

    .line 1402
    .line 1403
    if-nez v6, :cond_21

    .line 1404
    .line 1405
    move v3, v10

    .line 1406
    goto :goto_d

    .line 1407
    :cond_21
    invoke-virtual {v4, v3}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->S(Lcom/zykj/mistake/feature/notebook/detail/k1;)V

    .line 1408
    .line 1409
    .line 1410
    :cond_22
    move v3, v11

    .line 1411
    :goto_d
    iget-object v4, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 1412
    .line 1413
    iput-object v8, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->L$0:Ljava/lang/Object;

    .line 1414
    .line 1415
    iput v0, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->I$0:I

    .line 1416
    .line 1417
    iput-boolean v12, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->Z$0:Z

    .line 1418
    .line 1419
    iput v3, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->I$1:I

    .line 1420
    .line 1421
    iput v5, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->label:I

    .line 1422
    .line 1423
    invoke-static {v4, v1}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->e(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 1424
    .line 1425
    .line 1426
    move-result-object v0

    .line 1427
    if-ne v0, v2, :cond_23

    .line 1428
    .line 1429
    goto/16 :goto_f

    .line 1430
    .line 1431
    :cond_23
    :goto_e
    check-cast v0, Ljava/lang/Boolean;

    .line 1432
    .line 1433
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1434
    .line 1435
    .line 1436
    move-result v0

    .line 1437
    if-nez v0, :cond_24

    .line 1438
    .line 1439
    if-eqz v3, :cond_2a

    .line 1440
    .line 1441
    iget-object v0, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 1442
    .line 1443
    invoke-virtual {v0, v9}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->S(Lcom/zykj/mistake/feature/notebook/detail/k1;)V

    .line 1444
    .line 1445
    .line 1446
    goto :goto_10

    .line 1447
    :cond_24
    iget-object v0, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 1448
    .line 1449
    if-eqz v3, :cond_25

    .line 1450
    .line 1451
    move v10, v11

    .line 1452
    :cond_25
    const/4 v2, -0x1

    .line 1453
    invoke-virtual {v0, v2, v10}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->X(IZ)Z

    .line 1454
    .line 1455
    .line 1456
    move-result v0

    .line 1457
    if-eqz v3, :cond_2a

    .line 1458
    .line 1459
    if-nez v0, :cond_2a

    .line 1460
    .line 1461
    iget-object v0, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 1462
    .line 1463
    invoke-virtual {v0, v9}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->S(Lcom/zykj/mistake/feature/notebook/detail/k1;)V

    .line 1464
    .line 1465
    .line 1466
    goto :goto_10

    .line 1467
    :cond_26
    if-eqz v0, :cond_27

    .line 1468
    .line 1469
    iget-object v3, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 1470
    .line 1471
    invoke-virtual {v3, v9}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->S(Lcom/zykj/mistake/feature/notebook/detail/k1;)V

    .line 1472
    .line 1473
    .line 1474
    :cond_27
    iget-object v3, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 1475
    .line 1476
    iget-object v4, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->g:Lkotlinx/coroutines/channels/b;

    .line 1477
    .line 1478
    new-instance v5, Lcom/zykj/mistake/feature/notebook/detail/r0;

    .line 1479
    .line 1480
    iget-object v3, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->e:Lkotlinx/coroutines/flow/n0;

    .line 1481
    .line 1482
    invoke-virtual {v3}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1483
    .line 1484
    .line 1485
    move-result-object v3

    .line 1486
    check-cast v3, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 1487
    .line 1488
    iget-boolean v3, v3, Lcom/zykj/mistake/feature/notebook/detail/m3;->v:Z

    .line 1489
    .line 1490
    if-nez v3, :cond_28

    .line 1491
    .line 1492
    iget-object v3, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 1493
    .line 1494
    iget-object v3, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->e:Lkotlinx/coroutines/flow/n0;

    .line 1495
    .line 1496
    invoke-virtual {v3}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1497
    .line 1498
    .line 1499
    move-result-object v3

    .line 1500
    check-cast v3, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 1501
    .line 1502
    iget-boolean v3, v3, Lcom/zykj/mistake/feature/notebook/detail/m3;->w:Z

    .line 1503
    .line 1504
    if-eqz v3, :cond_29

    .line 1505
    .line 1506
    :cond_28
    move v10, v11

    .line 1507
    :cond_29
    iget-object v3, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 1508
    .line 1509
    iget-object v3, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->e:Lkotlinx/coroutines/flow/n0;

    .line 1510
    .line 1511
    invoke-virtual {v3}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1512
    .line 1513
    .line 1514
    move-result-object v3

    .line 1515
    check-cast v3, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 1516
    .line 1517
    iget-object v3, v3, Lcom/zykj/mistake/feature/notebook/detail/m3;->x:Ljava/lang/Integer;

    .line 1518
    .line 1519
    iget-object v7, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 1520
    .line 1521
    iget-object v7, v7, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->e:Lkotlinx/coroutines/flow/n0;

    .line 1522
    .line 1523
    invoke-virtual {v7}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1524
    .line 1525
    .line 1526
    move-result-object v7

    .line 1527
    check-cast v7, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 1528
    .line 1529
    iget-boolean v7, v7, Lcom/zykj/mistake/feature/notebook/detail/m3;->y:Z

    .line 1530
    .line 1531
    invoke-direct {v5, v10, v3, v7}, Lcom/zykj/mistake/feature/notebook/detail/r0;-><init>(ZLjava/lang/Integer;Z)V

    .line 1532
    .line 1533
    .line 1534
    iput-object v8, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->L$0:Ljava/lang/Object;

    .line 1535
    .line 1536
    iput v0, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->I$0:I

    .line 1537
    .line 1538
    iput-boolean v12, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->Z$0:Z

    .line 1539
    .line 1540
    iput v6, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$completeNavigation$1;->label:I

    .line 1541
    .line 1542
    invoke-interface {v4, v1, v5}, Lkotlinx/coroutines/channels/p;->q(Lh6/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1543
    .line 1544
    .line 1545
    move-result-object v0

    .line 1546
    if-ne v0, v2, :cond_2a

    .line 1547
    .line 1548
    :goto_f
    return-object v2

    .line 1549
    :cond_2a
    :goto_10
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 1550
    .line 1551
    return-object v0
.end method
