.class final Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmJoinCollection$2;
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
    c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$confirmJoinCollection$2"
    f = "MistakeDetailNewViewModel.kt"
    i = {}
    l = {
        0x548
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMistakeDetailNewViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeDetailNewViewModel.kt\ncom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmJoinCollection$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2474:1\n230#2,3:2475\n233#2,2:2482\n230#2,5:2484\n230#2,5:2489\n1563#3:2478\n1634#3,3:2479\n*S KotlinDebug\n*F\n+ 1 MistakeDetailNewViewModel.kt\ncom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmJoinCollection$2\n*L\n1360#1:2475,3\n1360#1:2482,2\n1367#1:2484,5\n1369#1:2489,5\n1361#1:2478\n1361#1:2479,3\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $collectionIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $state:Lcom/zykj/mistake/feature/notebook/detail/m3;

.field label:I

.field final synthetic this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Ljava/util/List;Lcom/zykj/mistake/feature/notebook/detail/m3;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/zykj/mistake/feature/notebook/detail/m3;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmJoinCollection$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmJoinCollection$2;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmJoinCollection$2;->$collectionIds:Ljava/util/List;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmJoinCollection$2;->$state:Lcom/zykj/mistake/feature/notebook/detail/m3;

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
    new-instance p1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmJoinCollection$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmJoinCollection$2;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmJoinCollection$2;->$collectionIds:Ljava/util/List;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmJoinCollection$2;->$state:Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmJoinCollection$2;-><init>(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Ljava/util/List;Lcom/zykj/mistake/feature/notebook/detail/m3;Lh6/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmJoinCollection$2;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmJoinCollection$2;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmJoinCollection$2;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmJoinCollection$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v2, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmJoinCollection$2;->label:I

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
    new-instance v2, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmJoinCollection$2$1;

    .line 36
    .line 37
    iget-object v4, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmJoinCollection$2;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 38
    .line 39
    iget-object v5, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmJoinCollection$2;->$collectionIds:Ljava/util/List;

    .line 40
    .line 41
    iget-object v6, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmJoinCollection$2;->$state:Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 42
    .line 43
    const/4 v7, 0x0

    .line 44
    invoke-direct {v2, v4, v5, v6, v7}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmJoinCollection$2$1;-><init>(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Ljava/util/List;Lcom/zykj/mistake/feature/notebook/detail/m3;Lh6/c;)V

    .line 45
    .line 46
    .line 47
    iput v3, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmJoinCollection$2;->label:I

    .line 48
    .line 49
    invoke-static {v2, v0}, Lcom/zykj/mistake/data/e;->a(Lr6/c;Lh6/c;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    if-ne v2, v1, :cond_2

    .line 54
    .line 55
    return-object v1

    .line 56
    :cond_2
    move-object v1, v2

    .line 57
    :goto_0
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmJoinCollection$2;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 58
    .line 59
    iget-object v3, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmJoinCollection$2;->$collectionIds:Ljava/util/List;

    .line 60
    .line 61
    invoke-static {v1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    if-eqz v4, :cond_5

    .line 66
    .line 67
    move-object v4, v1

    .line 68
    check-cast v4, Lcom/zykj/mistake/network/ApiResp;

    .line 69
    .line 70
    iget-object v4, v2, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->e:Lkotlinx/coroutines/flow/n0;

    .line 71
    .line 72
    :cond_3
    invoke-virtual {v4}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    move-object v6, v5

    .line 77
    check-cast v6, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 78
    .line 79
    new-instance v7, Ljava/util/ArrayList;

    .line 80
    .line 81
    const/16 v8, 0xa

    .line 82
    .line 83
    invoke-static {v3, v8}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 84
    .line 85
    .line 86
    move-result v8

    .line 87
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 88
    .line 89
    .line 90
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object v8

    .line 94
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v9

    .line 98
    if-eqz v9, :cond_4

    .line 99
    .line 100
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v9

    .line 104
    check-cast v9, Ljava/lang/String;

    .line 105
    .line 106
    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    move-result v9

    .line 110
    new-instance v10, Ljava/lang/Integer;

    .line 111
    .line 112
    invoke-direct {v10, v9}, Ljava/lang/Integer;-><init>(I)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_4
    invoke-static {v7}, Lkotlin/collections/t;->H0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 120
    .line 121
    .line 122
    move-result-object v55

    .line 123
    const v74, -0x8001

    .line 124
    .line 125
    .line 126
    const/16 v75, 0x1

    .line 127
    .line 128
    const/4 v7, 0x0

    .line 129
    const/4 v8, 0x0

    .line 130
    const-wide/16 v9, 0x0

    .line 131
    .line 132
    const/4 v11, 0x0

    .line 133
    const/4 v12, 0x0

    .line 134
    const/4 v13, 0x0

    .line 135
    const/4 v14, 0x0

    .line 136
    const/4 v15, 0x0

    .line 137
    const/16 v16, 0x0

    .line 138
    .line 139
    const/16 v17, 0x0

    .line 140
    .line 141
    const/16 v18, 0x0

    .line 142
    .line 143
    const/16 v19, 0x0

    .line 144
    .line 145
    const/16 v20, 0x0

    .line 146
    .line 147
    const/16 v21, 0x0

    .line 148
    .line 149
    const/16 v22, 0x0

    .line 150
    .line 151
    const/16 v26, 0x0

    .line 152
    .line 153
    const/16 v27, 0x0

    .line 154
    .line 155
    const/16 v31, 0x0

    .line 156
    .line 157
    const/16 v37, 0x0

    .line 158
    .line 159
    const/16 v38, 0x0

    .line 160
    .line 161
    const/16 v39, 0x0

    .line 162
    .line 163
    const/16 v40, 0x0

    .line 164
    .line 165
    const/16 v41, 0x0

    .line 166
    .line 167
    const/16 v42, 0x0

    .line 168
    .line 169
    const/16 v43, 0x0

    .line 170
    .line 171
    const/16 v47, 0x0

    .line 172
    .line 173
    const/16 v50, 0x0

    .line 174
    .line 175
    const/16 v51, 0x0

    .line 176
    .line 177
    const/16 v52, 0x0

    .line 178
    .line 179
    const/16 v54, 0x0

    .line 180
    .line 181
    const/16 v23, 0x0

    .line 182
    .line 183
    const/16 v24, 0x0

    .line 184
    .line 185
    const/16 v25, 0x0

    .line 186
    .line 187
    const/16 v28, 0x0

    .line 188
    .line 189
    const/16 v29, 0x0

    .line 190
    .line 191
    const/16 v30, 0x0

    .line 192
    .line 193
    const/16 v32, 0x0

    .line 194
    .line 195
    const/16 v33, 0x0

    .line 196
    .line 197
    const/16 v34, 0x0

    .line 198
    .line 199
    const/16 v35, 0x0

    .line 200
    .line 201
    const/16 v36, 0x0

    .line 202
    .line 203
    const/16 v44, 0x0

    .line 204
    .line 205
    const/16 v45, 0x0

    .line 206
    .line 207
    const/16 v46, 0x0

    .line 208
    .line 209
    const/16 v48, 0x0

    .line 210
    .line 211
    const/16 v49, 0x0

    .line 212
    .line 213
    const/16 v53, 0x0

    .line 214
    .line 215
    const/16 v56, 0x0

    .line 216
    .line 217
    const/16 v57, 0x0

    .line 218
    .line 219
    const/16 v58, 0x0

    .line 220
    .line 221
    const/16 v59, 0x0

    .line 222
    .line 223
    const/16 v60, 0x0

    .line 224
    .line 225
    const/16 v61, 0x0

    .line 226
    .line 227
    const/16 v62, 0x0

    .line 228
    .line 229
    const/16 v63, 0x0

    .line 230
    .line 231
    const/16 v64, 0x0

    .line 232
    .line 233
    const/16 v65, 0x0

    .line 234
    .line 235
    const/16 v66, 0x0

    .line 236
    .line 237
    const/16 v67, 0x0

    .line 238
    .line 239
    const/16 v68, 0x0

    .line 240
    .line 241
    const/16 v69, 0x0

    .line 242
    .line 243
    const/16 v70, 0x0

    .line 244
    .line 245
    const/16 v71, 0x0

    .line 246
    .line 247
    const/16 v72, 0x0

    .line 248
    .line 249
    const/16 v73, -0x1

    .line 250
    .line 251
    invoke-static/range {v6 .. v75}, Lcom/zykj/mistake/feature/notebook/detail/m3;->a(Lcom/zykj/mistake/feature/notebook/detail/m3;IIJLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZLjava/util/List;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;ZZZLjava/lang/Integer;ZZZZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;Ljava/util/List;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/n3;Lcom/zykj/mistake/feature/notebook/detail/k3;Lcom/zykj/mistake/feature/notebook/detail/q0;ZZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;ZZILjava/util/List;IZLjava/util/ArrayList;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZZZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$CreateCollectionEntry;ZZZZZLcom/zykj/mistake/feature/notebook/detail/l3;IIII)Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 252
    .line 253
    .line 254
    move-result-object v6

    .line 255
    invoke-virtual {v4, v5, v6}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v5

    .line 259
    if-eqz v5, :cond_3

    .line 260
    .line 261
    invoke-virtual {v2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->n()V

    .line 262
    .line 263
    .line 264
    sget-object v3, Lcom/zykj/mistake/feature/notebook/detail/t0;->a:Lcom/zykj/mistake/feature/notebook/detail/t0;

    .line 265
    .line 266
    invoke-virtual {v2, v3}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->S(Lcom/zykj/mistake/feature/notebook/detail/k1;)V

    .line 267
    .line 268
    .line 269
    new-instance v3, Lcom/zykj/mistake/feature/notebook/detail/j1;

    .line 270
    .line 271
    const-string v4, "\u5df2\u53d8\u66f4\u6240\u5c5e\u9519\u9898\u96c6"

    .line 272
    .line 273
    invoke-direct {v3, v4}, Lcom/zykj/mistake/feature/notebook/detail/j1;-><init>(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v2, v3}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->S(Lcom/zykj/mistake/feature/notebook/detail/k1;)V

    .line 277
    .line 278
    .line 279
    :cond_5
    iget-object v2, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$confirmJoinCollection$2;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 280
    .line 281
    invoke-static {v1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    if-eqz v1, :cond_a

    .line 286
    .line 287
    iget-object v3, v2, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->e:Lkotlinx/coroutines/flow/n0;

    .line 288
    .line 289
    :cond_6
    invoke-virtual {v3}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v4

    .line 293
    move-object v5, v4

    .line 294
    check-cast v5, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 295
    .line 296
    const v73, -0x40001

    .line 297
    .line 298
    .line 299
    const/16 v74, 0x1

    .line 300
    .line 301
    const/4 v6, 0x0

    .line 302
    const/4 v7, 0x0

    .line 303
    const-wide/16 v8, 0x0

    .line 304
    .line 305
    const/4 v10, 0x0

    .line 306
    const/4 v11, 0x0

    .line 307
    const/4 v12, 0x0

    .line 308
    const/4 v13, 0x0

    .line 309
    const/4 v14, 0x0

    .line 310
    const/4 v15, 0x0

    .line 311
    const/16 v16, 0x0

    .line 312
    .line 313
    const/16 v17, 0x0

    .line 314
    .line 315
    const/16 v18, 0x0

    .line 316
    .line 317
    const/16 v19, 0x0

    .line 318
    .line 319
    const/16 v20, 0x0

    .line 320
    .line 321
    const/16 v21, 0x0

    .line 322
    .line 323
    const/16 v22, 0x0

    .line 324
    .line 325
    const/16 v23, 0x0

    .line 326
    .line 327
    const/16 v24, 0x0

    .line 328
    .line 329
    const/16 v25, 0x0

    .line 330
    .line 331
    const/16 v26, 0x0

    .line 332
    .line 333
    const/16 v27, 0x0

    .line 334
    .line 335
    const/16 v28, 0x0

    .line 336
    .line 337
    const/16 v29, 0x0

    .line 338
    .line 339
    const/16 v30, 0x0

    .line 340
    .line 341
    const/16 v31, 0x0

    .line 342
    .line 343
    const/16 v32, 0x0

    .line 344
    .line 345
    const/16 v33, 0x0

    .line 346
    .line 347
    const/16 v34, 0x0

    .line 348
    .line 349
    const/16 v35, 0x0

    .line 350
    .line 351
    const/16 v36, 0x0

    .line 352
    .line 353
    const/16 v37, 0x0

    .line 354
    .line 355
    const/16 v38, 0x0

    .line 356
    .line 357
    const/16 v39, 0x0

    .line 358
    .line 359
    const/16 v40, 0x0

    .line 360
    .line 361
    const/16 v41, 0x0

    .line 362
    .line 363
    const/16 v42, 0x0

    .line 364
    .line 365
    const/16 v43, 0x0

    .line 366
    .line 367
    const/16 v44, 0x0

    .line 368
    .line 369
    const/16 v45, 0x0

    .line 370
    .line 371
    const/16 v46, 0x0

    .line 372
    .line 373
    const/16 v47, 0x0

    .line 374
    .line 375
    const/16 v48, 0x0

    .line 376
    .line 377
    const/16 v49, 0x0

    .line 378
    .line 379
    const/16 v50, 0x0

    .line 380
    .line 381
    const/16 v51, 0x0

    .line 382
    .line 383
    const/16 v52, 0x0

    .line 384
    .line 385
    const/16 v53, 0x0

    .line 386
    .line 387
    const/16 v54, 0x0

    .line 388
    .line 389
    const/16 v55, 0x0

    .line 390
    .line 391
    const/16 v56, 0x0

    .line 392
    .line 393
    const/16 v57, 0x0

    .line 394
    .line 395
    const/16 v58, 0x0

    .line 396
    .line 397
    const/16 v59, 0x0

    .line 398
    .line 399
    const/16 v60, 0x0

    .line 400
    .line 401
    const/16 v61, 0x0

    .line 402
    .line 403
    const/16 v62, 0x0

    .line 404
    .line 405
    const/16 v63, 0x0

    .line 406
    .line 407
    const/16 v64, 0x0

    .line 408
    .line 409
    const/16 v65, 0x0

    .line 410
    .line 411
    const/16 v66, 0x0

    .line 412
    .line 413
    const/16 v67, 0x0

    .line 414
    .line 415
    const/16 v68, 0x0

    .line 416
    .line 417
    const/16 v69, 0x0

    .line 418
    .line 419
    const/16 v70, 0x0

    .line 420
    .line 421
    const/16 v71, 0x0

    .line 422
    .line 423
    const/16 v72, -0x1

    .line 424
    .line 425
    invoke-static/range {v5 .. v74}, Lcom/zykj/mistake/feature/notebook/detail/m3;->a(Lcom/zykj/mistake/feature/notebook/detail/m3;IIJLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZLjava/util/List;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;ZZZLjava/lang/Integer;ZZZZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;Ljava/util/List;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/n3;Lcom/zykj/mistake/feature/notebook/detail/k3;Lcom/zykj/mistake/feature/notebook/detail/q0;ZZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;ZZILjava/util/List;IZLjava/util/ArrayList;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZZZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$CreateCollectionEntry;ZZZZZLcom/zykj/mistake/feature/notebook/detail/l3;IIII)Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 426
    .line 427
    .line 428
    move-result-object v5

    .line 429
    invoke-virtual {v3, v4, v5}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    move-result v4

    .line 433
    if-eqz v4, :cond_6

    .line 434
    .line 435
    invoke-static {v1}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->E(Ljava/lang/Throwable;)Z

    .line 436
    .line 437
    .line 438
    move-result v3

    .line 439
    if-eqz v3, :cond_8

    .line 440
    .line 441
    iget-object v3, v2, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->e:Lkotlinx/coroutines/flow/n0;

    .line 442
    .line 443
    :cond_7
    invoke-virtual {v3}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v1

    .line 447
    move-object v4, v1

    .line 448
    check-cast v4, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 449
    .line 450
    const v72, -0x4000001

    .line 451
    .line 452
    .line 453
    const/16 v73, 0x1

    .line 454
    .line 455
    const/4 v5, 0x0

    .line 456
    const/4 v6, 0x0

    .line 457
    const-wide/16 v7, 0x0

    .line 458
    .line 459
    const/4 v9, 0x0

    .line 460
    const/4 v10, 0x0

    .line 461
    const/4 v11, 0x0

    .line 462
    const/4 v12, 0x0

    .line 463
    const/4 v13, 0x0

    .line 464
    const/4 v14, 0x0

    .line 465
    const/4 v15, 0x0

    .line 466
    const/16 v16, 0x0

    .line 467
    .line 468
    const/16 v17, 0x0

    .line 469
    .line 470
    const/16 v18, 0x0

    .line 471
    .line 472
    const/16 v19, 0x0

    .line 473
    .line 474
    const/16 v20, 0x0

    .line 475
    .line 476
    const/16 v21, 0x0

    .line 477
    .line 478
    const/16 v22, 0x0

    .line 479
    .line 480
    const/16 v23, 0x0

    .line 481
    .line 482
    const/16 v24, 0x0

    .line 483
    .line 484
    const/16 v25, 0x0

    .line 485
    .line 486
    const/16 v26, 0x0

    .line 487
    .line 488
    const/16 v27, 0x0

    .line 489
    .line 490
    const/16 v28, 0x0

    .line 491
    .line 492
    const/16 v29, 0x0

    .line 493
    .line 494
    const/16 v30, 0x0

    .line 495
    .line 496
    const/16 v31, 0x0

    .line 497
    .line 498
    const/16 v32, 0x0

    .line 499
    .line 500
    const/16 v33, 0x0

    .line 501
    .line 502
    const/16 v34, 0x0

    .line 503
    .line 504
    const/16 v35, 0x0

    .line 505
    .line 506
    const/16 v36, 0x0

    .line 507
    .line 508
    const/16 v37, 0x0

    .line 509
    .line 510
    const/16 v38, 0x0

    .line 511
    .line 512
    const/16 v39, 0x0

    .line 513
    .line 514
    const/16 v40, 0x0

    .line 515
    .line 516
    const/16 v41, 0x0

    .line 517
    .line 518
    const/16 v42, 0x0

    .line 519
    .line 520
    const/16 v43, 0x0

    .line 521
    .line 522
    const/16 v44, 0x0

    .line 523
    .line 524
    const/16 v45, 0x0

    .line 525
    .line 526
    const/16 v46, 0x0

    .line 527
    .line 528
    const/16 v47, 0x0

    .line 529
    .line 530
    const/16 v48, 0x0

    .line 531
    .line 532
    const/16 v49, 0x0

    .line 533
    .line 534
    const/16 v50, 0x0

    .line 535
    .line 536
    const/16 v51, 0x0

    .line 537
    .line 538
    const/16 v52, 0x0

    .line 539
    .line 540
    const/16 v53, 0x0

    .line 541
    .line 542
    const/16 v54, 0x0

    .line 543
    .line 544
    const/16 v55, 0x0

    .line 545
    .line 546
    const/16 v56, 0x0

    .line 547
    .line 548
    const/16 v57, 0x0

    .line 549
    .line 550
    const/16 v58, 0x0

    .line 551
    .line 552
    const/16 v59, 0x0

    .line 553
    .line 554
    const/16 v60, 0x0

    .line 555
    .line 556
    const/16 v61, 0x0

    .line 557
    .line 558
    const/16 v62, 0x0

    .line 559
    .line 560
    const/16 v63, 0x0

    .line 561
    .line 562
    const/16 v64, 0x1

    .line 563
    .line 564
    const/16 v65, 0x0

    .line 565
    .line 566
    const/16 v66, 0x0

    .line 567
    .line 568
    const/16 v67, 0x0

    .line 569
    .line 570
    const/16 v68, 0x0

    .line 571
    .line 572
    const/16 v69, 0x0

    .line 573
    .line 574
    const/16 v70, 0x0

    .line 575
    .line 576
    const/16 v71, -0x1

    .line 577
    .line 578
    invoke-static/range {v4 .. v73}, Lcom/zykj/mistake/feature/notebook/detail/m3;->a(Lcom/zykj/mistake/feature/notebook/detail/m3;IIJLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZLjava/util/List;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;ZZZLjava/lang/Integer;ZZZZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DetailTab;Ljava/util/List;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/n3;Lcom/zykj/mistake/feature/notebook/detail/k3;Lcom/zykj/mistake/feature/notebook/detail/q0;ZZZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;ZZILjava/util/List;IZLjava/util/ArrayList;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZZZZLjava/lang/String;Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$CreateCollectionEntry;ZZZZZLcom/zykj/mistake/feature/notebook/detail/l3;IIII)Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 579
    .line 580
    .line 581
    move-result-object v2

    .line 582
    invoke-virtual {v3, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 583
    .line 584
    .line 585
    move-result v1

    .line 586
    if-eqz v1, :cond_7

    .line 587
    .line 588
    goto :goto_2

    .line 589
    :cond_8
    new-instance v3, Lcom/zykj/mistake/feature/notebook/detail/j1;

    .line 590
    .line 591
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 592
    .line 593
    .line 594
    move-result-object v1

    .line 595
    if-nez v1, :cond_9

    .line 596
    .line 597
    const-string v1, ""

    .line 598
    .line 599
    :cond_9
    invoke-direct {v3, v1}, Lcom/zykj/mistake/feature/notebook/detail/j1;-><init>(Ljava/lang/String;)V

    .line 600
    .line 601
    .line 602
    invoke-virtual {v2, v3}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->S(Lcom/zykj/mistake/feature/notebook/detail/k1;)V

    .line 603
    .line 604
    .line 605
    :cond_a
    :goto_2
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 606
    .line 607
    return-object v1
.end method
