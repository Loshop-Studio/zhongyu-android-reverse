.class final Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$switchReviewQuestion$3;
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
    c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$switchReviewQuestion$3"
    f = "MistakeDetailNewViewModel.kt"
    i = {
        0x0,
        0x0,
        0x0
    }
    l = {
        0x436
    }
    m = "invokeSuspend"
    n = {
        "$this$launch",
        "$this$invokeSuspend_u24lambda_u240",
        "$i$a$-runCatching-MistakeDetailNewViewModel$switchReviewQuestion$3$1"
    }
    s = {
        "L$0",
        "L$1",
        "I$0"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMistakeDetailNewViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeDetailNewViewModel.kt\ncom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$switchReviewQuestion$3\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,2474:1\n230#2,5:2475\n*S KotlinDebug\n*F\n+ 1 MistakeDetailNewViewModel.kt\ncom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$switchReviewQuestion$3\n*L\n1081#1:2475,5\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $loadingAlreadyShown:Z

.field final synthetic $sessionId:Ljava/lang/String;

.field I$0:I

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;


# direct methods
.method public constructor <init>(ZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Ljava/lang/String;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;",
            "Ljava/lang/String;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$switchReviewQuestion$3;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$switchReviewQuestion$3;->$loadingAlreadyShown:Z

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$switchReviewQuestion$3;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$switchReviewQuestion$3;->$sessionId:Ljava/lang/String;

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
    .locals 4
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
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$switchReviewQuestion$3;

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$switchReviewQuestion$3;->$loadingAlreadyShown:Z

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$switchReviewQuestion$3;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$switchReviewQuestion$3;->$sessionId:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$switchReviewQuestion$3;-><init>(ZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Ljava/lang/String;Lh6/c;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$switchReviewQuestion$3;->L$0:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$switchReviewQuestion$3;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$switchReviewQuestion$3;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$switchReviewQuestion$3;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$switchReviewQuestion$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 75

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$switchReviewQuestion$3;->L$0:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lkotlinx/coroutines/v;

    .line 6
    .line 7
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 8
    .line 9
    iget v2, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$switchReviewQuestion$3;->label:I

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    if-ne v2, v3, :cond_0

    .line 15
    .line 16
    iget-object v0, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$switchReviewQuestion$3;->L$1:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lkotlinx/coroutines/v;

    .line 19
    .line 20
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    move-object/from16 v2, p1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 31
    .line 32
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v0

    .line 36
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-boolean v2, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$switchReviewQuestion$3;->$loadingAlreadyShown:Z

    .line 40
    .line 41
    if-nez v2, :cond_2

    .line 42
    .line 43
    iget-object v2, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$switchReviewQuestion$3;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 44
    .line 45
    sget-object v4, Lcom/zykj/mistake/feature/notebook/detail/h1;->a:Lcom/zykj/mistake/feature/notebook/detail/h1;

    .line 46
    .line 47
    invoke-virtual {v2, v4}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->S(Lcom/zykj/mistake/feature/notebook/detail/k1;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    iget-object v2, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$switchReviewQuestion$3;->$sessionId:Ljava/lang/String;

    .line 51
    .line 52
    :try_start_1
    sget-object v4, Lcom/zykj/mistake/feature/review/q;->a:Lcom/zykj/mistake/feature/review/q;

    .line 53
    .line 54
    const/4 v5, 0x0

    .line 55
    iput-object v5, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$switchReviewQuestion$3;->L$0:Ljava/lang/Object;

    .line 56
    .line 57
    iput-object v5, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$switchReviewQuestion$3;->L$1:Ljava/lang/Object;

    .line 58
    .line 59
    const/4 v5, 0x0

    .line 60
    iput v5, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$switchReviewQuestion$3;->I$0:I

    .line 61
    .line 62
    iput v3, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$switchReviewQuestion$3;->label:I

    .line 63
    .line 64
    invoke-virtual {v4, v2, v5, v1}, Lcom/zykj/mistake/feature/review/q;->c(Ljava/lang/String;ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    if-ne v2, v0, :cond_3

    .line 69
    .line 70
    return-object v0

    .line 71
    :cond_3
    :goto_0
    check-cast v2, Lcom/zykj/mistake/feature/review/m;

    .line 72
    .line 73
    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    goto :goto_2

    .line 78
    :goto_1
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    :goto_2
    iget-object v2, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$switchReviewQuestion$3;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 87
    .line 88
    iget-object v3, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$switchReviewQuestion$3;->$sessionId:Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-eqz v4, :cond_7

    .line 95
    .line 96
    move-object v4, v0

    .line 97
    check-cast v4, Lcom/zykj/mistake/feature/review/m;

    .line 98
    .line 99
    if-eqz v4, :cond_5

    .line 100
    .line 101
    iget-object v5, v4, Lcom/zykj/mistake/feature/review/m;->c:Ljava/util/List;

    .line 102
    .line 103
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    if-eqz v5, :cond_4

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_4
    invoke-static {v2, v4}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->a(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Lcom/zykj/mistake/feature/review/m;)V

    .line 111
    .line 112
    .line 113
    goto/16 :goto_4

    .line 114
    .line 115
    :cond_5
    :goto_3
    iget-object v2, v2, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->e:Lkotlinx/coroutines/flow/n0;

    .line 116
    .line 117
    :cond_6
    invoke-virtual {v2}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    move-object v5, v4

    .line 122
    check-cast v5, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 123
    .line 124
    sget-object v6, Lcom/zykj/mistake/feature/review/q;->a:Lcom/zykj/mistake/feature/review/q;

    .line 125
    .line 126
    invoke-static {v3}, Lcom/zykj/mistake/feature/review/q;->f(Ljava/lang/String;)Lcom/zykj/mistake/feature/review/o;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    invoke-static {v6}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->d0(Lcom/zykj/mistake/feature/review/o;)Lcom/zykj/mistake/feature/notebook/detail/l3;

    .line 131
    .line 132
    .line 133
    move-result-object v70

    .line 134
    const v73, 0x5fffffff

    .line 135
    .line 136
    .line 137
    const/16 v74, 0x1

    .line 138
    .line 139
    const/4 v6, 0x0

    .line 140
    const/4 v7, 0x0

    .line 141
    const-wide/16 v8, 0x0

    .line 142
    .line 143
    const/4 v10, 0x0

    .line 144
    const/4 v11, 0x0

    .line 145
    const/4 v12, 0x0

    .line 146
    const/4 v13, 0x0

    .line 147
    const/4 v14, 0x0

    .line 148
    const/4 v15, 0x0

    .line 149
    const/16 v16, 0x0

    .line 150
    .line 151
    const/16 v17, 0x0

    .line 152
    .line 153
    const/16 v18, 0x0

    .line 154
    .line 155
    const/16 v19, 0x0

    .line 156
    .line 157
    const/16 v20, 0x0

    .line 158
    .line 159
    const/16 v21, 0x0

    .line 160
    .line 161
    const/16 v22, 0x0

    .line 162
    .line 163
    const/16 v23, 0x0

    .line 164
    .line 165
    const/16 v24, 0x0

    .line 166
    .line 167
    const/16 v25, 0x0

    .line 168
    .line 169
    const/16 v26, 0x0

    .line 170
    .line 171
    const/16 v27, 0x0

    .line 172
    .line 173
    const/16 v28, 0x0

    .line 174
    .line 175
    const/16 v29, 0x0

    .line 176
    .line 177
    const/16 v30, 0x0

    .line 178
    .line 179
    const/16 v31, 0x0

    .line 180
    .line 181
    const/16 v32, 0x0

    .line 182
    .line 183
    const/16 v33, 0x0

    .line 184
    .line 185
    const/16 v34, 0x0

    .line 186
    .line 187
    const/16 v35, 0x0

    .line 188
    .line 189
    const/16 v36, 0x0

    .line 190
    .line 191
    const/16 v37, 0x0

    .line 192
    .line 193
    const/16 v38, 0x0

    .line 194
    .line 195
    const/16 v39, 0x0

    .line 196
    .line 197
    const/16 v40, 0x0

    .line 198
    .line 199
    const/16 v41, 0x0

    .line 200
    .line 201
    const/16 v42, 0x0

    .line 202
    .line 203
    const/16 v43, 0x0

    .line 204
    .line 205
    const/16 v44, 0x0

    .line 206
    .line 207
    const/16 v45, 0x0

    .line 208
    .line 209
    const/16 v46, 0x0

    .line 210
    .line 211
    const/16 v47, 0x0

    .line 212
    .line 213
    const/16 v48, 0x0

    .line 214
    .line 215
    const/16 v49, 0x0

    .line 216
    .line 217
    const/16 v50, 0x0

    .line 218
    .line 219
    const/16 v51, 0x0

    .line 220
    .line 221
    const/16 v52, 0x0

    .line 222
    .line 223
    const/16 v53, 0x0

    .line 224
    .line 225
    const/16 v54, 0x0

    .line 226
    .line 227
    const/16 v55, 0x0

    .line 228
    .line 229
    const/16 v56, 0x0

    .line 230
    .line 231
    const/16 v57, 0x0

    .line 232
    .line 233
    const/16 v58, 0x0

    .line 234
    .line 235
    const/16 v59, 0x0

    .line 236
    .line 237
    const/16 v60, 0x0

    .line 238
    .line 239
    const/16 v61, 0x0

    .line 240
    .line 241
    const/16 v62, 0x0

    .line 242
    .line 243
    const/16 v63, 0x0

    .line 244
    .line 245
    const/16 v64, 0x0

    .line 246
    .line 247
    const/16 v65, 0x0

    .line 248
    .line 249
    const/16 v66, 0x0

    .line 250
    .line 251
    const/16 v67, 0x0

    .line 252
    .line 253
    const/16 v68, 0x1

    .line 254
    .line 255
    const/16 v69, 0x0

    .line 256
    .line 257
    const/16 v71, 0x0

    .line 258
    .line 259
    const/16 v72, -0x1

    .line 260
    .line 261
    invoke-static/range {v5 .. v74}, Lcom/zykj/mistake/feature/notebook/detail/m3;->a(Lcom/zykj/mistake/feature/notebook/detail/m3;IIJLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZLjava/util/List;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;ZZZLjava/lang/Integer;ZZZZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;Ljava/util/List;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/n3;Lcom/zykj/mistake/feature/notebook/detail/k3;Lcom/zykj/mistake/feature/notebook/detail/q0;ZZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;ZZILjava/util/List;IZLjava/util/ArrayList;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZZZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$CreateCollectionEntry;ZZZZZLcom/zykj/mistake/feature/notebook/detail/l3;IIII)Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 262
    .line 263
    .line 264
    move-result-object v5

    .line 265
    invoke-virtual {v2, v4, v5}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v4

    .line 269
    if-eqz v4, :cond_6

    .line 270
    .line 271
    :cond_7
    :goto_4
    iget-object v2, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$switchReviewQuestion$3;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 272
    .line 273
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    if-eqz v0, :cond_9

    .line 278
    .line 279
    new-instance v3, Lcom/zykj/mistake/feature/notebook/detail/j1;

    .line 280
    .line 281
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    if-nez v0, :cond_8

    .line 286
    .line 287
    const-string v0, ""

    .line 288
    .line 289
    :cond_8
    invoke-direct {v3, v0}, Lcom/zykj/mistake/feature/notebook/detail/j1;-><init>(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v2, v3}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->S(Lcom/zykj/mistake/feature/notebook/detail/k1;)V

    .line 293
    .line 294
    .line 295
    :cond_9
    iget-object v0, v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$switchReviewQuestion$3;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 296
    .line 297
    sget-object v2, Lcom/zykj/mistake/feature/notebook/detail/x0;->a:Lcom/zykj/mistake/feature/notebook/detail/x0;

    .line 298
    .line 299
    invoke-virtual {v0, v2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->S(Lcom/zykj/mistake/feature/notebook/detail/k1;)V

    .line 300
    .line 301
    .line 302
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 303
    .line 304
    return-object v0
.end method
