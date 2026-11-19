.class final Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmRemoveMistake$1;
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
    c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$confirmRemoveMistake$1"
    f = "MistakeDetailNewViewModel.kt"
    i = {}
    l = {
        0x92e
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMistakeDetailNewViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeDetailNewViewModel.kt\ncom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmRemoveMistake$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,2474:1\n230#2,5:2475\n*S KotlinDebug\n*F\n+ 1 MistakeDetailNewViewModel.kt\ncom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmRemoveMistake$1\n*L\n2353#1:2475,5\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $req:Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;

.field final synthetic $state:Lcom/zykj/mistake/feature/notebook/detail/m3;

.field label:I

.field final synthetic this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;Lcom/zykj/mistake/feature/notebook/detail/m3;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;",
            "Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;",
            "Lcom/zykj/mistake/feature/notebook/detail/m3;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmRemoveMistake$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmRemoveMistake$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmRemoveMistake$1;->$req:Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmRemoveMistake$1;->$state:Lcom/zykj/mistake/feature/notebook/detail/m3;

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
    new-instance p1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmRemoveMistake$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmRemoveMistake$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmRemoveMistake$1;->$req:Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmRemoveMistake$1;->$state:Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmRemoveMistake$1;-><init>(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;Lcom/zykj/mistake/feature/notebook/detail/m3;Lh6/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmRemoveMistake$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmRemoveMistake$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmRemoveMistake$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmRemoveMistake$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 76

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 4
    .line 5
    iget v2, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmRemoveMistake$1;->label:I

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-eqz v2, :cond_1

    .line 9
    .line 10
    if-ne v2, v3, :cond_0

    .line 11
    .line 12
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    move-object/from16 v1, p1

    .line 16
    .line 17
    check-cast v1, Lkotlin/Result;

    .line 18
    .line 19
    invoke-virtual {v1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v1

    .line 32
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    new-instance v2, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmRemoveMistake$1$1;

    .line 36
    .line 37
    iget-object v4, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmRemoveMistake$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 38
    .line 39
    iget-object v5, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmRemoveMistake$1;->$req:Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;

    .line 40
    .line 41
    const/4 v6, 0x0

    .line 42
    invoke-direct {v2, v4, v5, v6}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmRemoveMistake$1$1;-><init>(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Lcom/zykj/mistake/entity/req/MultiRemoveMistakeReq;Lh6/c;)V

    .line 43
    .line 44
    .line 45
    iput v3, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmRemoveMistake$1;->label:I

    .line 46
    .line 47
    invoke-static {v2, v0}, Lcom/zykj/mistake/data/e;->a(Lr6/c;Lh6/c;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    if-ne v2, v1, :cond_2

    .line 52
    .line 53
    return-object v1

    .line 54
    :cond_2
    move-object v1, v2

    .line 55
    :goto_0
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmRemoveMistake$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 56
    .line 57
    iget-object v3, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmRemoveMistake$1;->$state:Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 58
    .line 59
    invoke-static {v1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_5

    .line 64
    .line 65
    move-object v4, v1

    .line 66
    check-cast v4, Lcom/zykj/mistake/network/ApiResp;

    .line 67
    .line 68
    iget-object v4, v2, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->e:Lkotlinx/coroutines/flow/n0;

    .line 69
    .line 70
    :cond_3
    invoke-virtual {v4}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    move-object v6, v5

    .line 75
    check-cast v6, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 76
    .line 77
    iget v7, v3, Lcom/zykj/mistake/feature/notebook/detail/m3;->b:I

    .line 78
    .line 79
    new-instance v8, Ljava/lang/Integer;

    .line 80
    .line 81
    invoke-direct {v8, v7}, Ljava/lang/Integer;-><init>(I)V

    .line 82
    .line 83
    .line 84
    iget-object v7, v2, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->e:Lkotlinx/coroutines/flow/n0;

    .line 85
    .line 86
    invoke-virtual {v7}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    check-cast v7, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 91
    .line 92
    iget-object v9, v7, Lcom/zykj/mistake/feature/notebook/detail/m3;->R:Ljava/util/List;

    .line 93
    .line 94
    iget v7, v7, Lcom/zykj/mistake/feature/notebook/detail/m3;->S:I

    .line 95
    .line 96
    invoke-static {v7, v9}, Lkotlin/collections/t;->j0(ILjava/util/List;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    check-cast v7, Lp4/e;

    .line 101
    .line 102
    if-eqz v7, :cond_4

    .line 103
    .line 104
    iget-boolean v7, v7, Lp4/e;->j:Z

    .line 105
    .line 106
    :goto_1
    move/from16 v32, v7

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_4
    const/4 v7, 0x0

    .line 110
    goto :goto_1

    .line 111
    :goto_2
    const/16 v74, -0x1

    .line 112
    .line 113
    const/16 v75, 0x1

    .line 114
    .line 115
    const/4 v7, 0x0

    .line 116
    move-object/from16 v31, v8

    .line 117
    .line 118
    const/4 v8, 0x0

    .line 119
    const-wide/16 v9, 0x0

    .line 120
    .line 121
    const/4 v11, 0x0

    .line 122
    const/4 v12, 0x0

    .line 123
    const/4 v13, 0x0

    .line 124
    const/4 v14, 0x0

    .line 125
    const/4 v15, 0x0

    .line 126
    const/16 v16, 0x0

    .line 127
    .line 128
    const/16 v17, 0x0

    .line 129
    .line 130
    const/16 v18, 0x0

    .line 131
    .line 132
    const/16 v19, 0x0

    .line 133
    .line 134
    const/16 v20, 0x0

    .line 135
    .line 136
    const/16 v21, 0x0

    .line 137
    .line 138
    const/16 v22, 0x0

    .line 139
    .line 140
    const/16 v23, 0x0

    .line 141
    .line 142
    const/16 v24, 0x0

    .line 143
    .line 144
    const/16 v25, 0x0

    .line 145
    .line 146
    const/16 v26, 0x0

    .line 147
    .line 148
    const/16 v27, 0x0

    .line 149
    .line 150
    const/16 v28, 0x0

    .line 151
    .line 152
    const/16 v29, 0x0

    .line 153
    .line 154
    const/16 v30, 0x0

    .line 155
    .line 156
    const/16 v33, 0x0

    .line 157
    .line 158
    const/16 v34, 0x0

    .line 159
    .line 160
    const/16 v35, 0x0

    .line 161
    .line 162
    const/16 v36, 0x0

    .line 163
    .line 164
    const/16 v37, 0x0

    .line 165
    .line 166
    const/16 v38, 0x0

    .line 167
    .line 168
    const/16 v39, 0x0

    .line 169
    .line 170
    const/16 v40, 0x0

    .line 171
    .line 172
    const/16 v41, 0x0

    .line 173
    .line 174
    const/16 v42, 0x0

    .line 175
    .line 176
    const/16 v43, 0x0

    .line 177
    .line 178
    const/16 v44, 0x0

    .line 179
    .line 180
    const/16 v45, 0x0

    .line 181
    .line 182
    const/16 v46, 0x0

    .line 183
    .line 184
    const/16 v47, 0x0

    .line 185
    .line 186
    const/16 v48, 0x0

    .line 187
    .line 188
    const/16 v49, 0x0

    .line 189
    .line 190
    const/16 v50, 0x0

    .line 191
    .line 192
    const/16 v51, 0x0

    .line 193
    .line 194
    const/16 v52, 0x0

    .line 195
    .line 196
    const/16 v53, 0x0

    .line 197
    .line 198
    const/16 v54, 0x0

    .line 199
    .line 200
    const/16 v55, 0x0

    .line 201
    .line 202
    const/16 v56, 0x0

    .line 203
    .line 204
    const/16 v57, 0x0

    .line 205
    .line 206
    const/16 v58, 0x0

    .line 207
    .line 208
    const/16 v59, 0x0

    .line 209
    .line 210
    const/16 v60, 0x0

    .line 211
    .line 212
    const/16 v61, 0x0

    .line 213
    .line 214
    const/16 v62, 0x0

    .line 215
    .line 216
    const/16 v63, 0x0

    .line 217
    .line 218
    const/16 v64, 0x0

    .line 219
    .line 220
    const/16 v65, 0x0

    .line 221
    .line 222
    const/16 v66, 0x0

    .line 223
    .line 224
    const/16 v67, 0x0

    .line 225
    .line 226
    const/16 v68, 0x0

    .line 227
    .line 228
    const/16 v69, 0x0

    .line 229
    .line 230
    const/16 v70, 0x0

    .line 231
    .line 232
    const/16 v71, 0x0

    .line 233
    .line 234
    const/16 v72, 0x0

    .line 235
    .line 236
    const v73, -0x1800001

    .line 237
    .line 238
    .line 239
    invoke-static/range {v6 .. v75}, Lcom/zykj/mistake/feature/notebook/detail/m3;->a(Lcom/zykj/mistake/feature/notebook/detail/m3;IIJLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZLjava/util/List;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;ZZZLjava/lang/Integer;ZZZZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;Ljava/util/List;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/n3;Lcom/zykj/mistake/feature/notebook/detail/k3;Lcom/zykj/mistake/feature/notebook/detail/q0;ZZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;ZZILjava/util/List;IZLjava/util/ArrayList;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZZZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$CreateCollectionEntry;ZZZZZLcom/zykj/mistake/feature/notebook/detail/l3;IIII)Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 240
    .line 241
    .line 242
    move-result-object v6

    .line 243
    invoke-virtual {v4, v5, v6}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v5

    .line 247
    if-eqz v5, :cond_3

    .line 248
    .line 249
    sget-object v4, Lcom/zykj/mistake/feature/notebook/detail/f1;->a:Lcom/zykj/mistake/feature/notebook/detail/f1;

    .line 250
    .line 251
    invoke-virtual {v2, v4}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->S(Lcom/zykj/mistake/feature/notebook/detail/k1;)V

    .line 252
    .line 253
    .line 254
    new-instance v4, Lcom/zykj/mistake/feature/notebook/detail/e1;

    .line 255
    .line 256
    iget v3, v3, Lcom/zykj/mistake/feature/notebook/detail/m3;->b:I

    .line 257
    .line 258
    invoke-direct {v4, v3}, Lcom/zykj/mistake/feature/notebook/detail/e1;-><init>(I)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v2, v4}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->S(Lcom/zykj/mistake/feature/notebook/detail/k1;)V

    .line 262
    .line 263
    .line 264
    :cond_5
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmRemoveMistake$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 265
    .line 266
    invoke-static {v1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    if-eqz v1, :cond_7

    .line 271
    .line 272
    new-instance v3, Lcom/zykj/mistake/feature/notebook/detail/j1;

    .line 273
    .line 274
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    if-nez v1, :cond_6

    .line 279
    .line 280
    const-string v1, ""

    .line 281
    .line 282
    :cond_6
    invoke-direct {v3, v1}, Lcom/zykj/mistake/feature/notebook/detail/j1;-><init>(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v2, v3}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->S(Lcom/zykj/mistake/feature/notebook/detail/k1;)V

    .line 286
    .line 287
    .line 288
    :cond_7
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 289
    .line 290
    return-object v1
.end method
