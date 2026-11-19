.class final Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Ljava/util/List<",
        "+",
        "Landroidx/work/WorkInfo;",
        ">;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "workInfoList",
        "",
        "Landroidx/work/WorkInfo;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.evaluation.ui.detail.mistake.MistakeViewModel$uploadFileAndAddMistake$4$1"
    f = "MistakeViewModel.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1
    }
    l = {
        0x11f,
        0x12a
    }
    m = "invokeSuspend"
    n = {
        "workInfoList",
        "urlList",
        "shootUrlList",
        "workInfoList",
        "urlList",
        "shootUrlList"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$0",
        "L$1",
        "L$2"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMistakeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeViewModel.kt\ncom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,585:1\n1740#2,3:586\n1563#2:589\n1634#2,3:590\n785#2:593\n796#2:594\n1878#2,2:595\n797#2,2:597\n1880#2:599\n799#2:600\n230#2,2:602\n295#2,2:604\n295#2,2:606\n295#2,2:608\n774#2:610\n865#2,2:611\n1563#2:613\n1634#2,3:614\n1740#2,3:617\n1#3:601\n*S KotlinDebug\n*F\n+ 1 MistakeViewModel.kt\ncom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1\n*L\n277#1:586,3\n279#1:589\n279#1:590,3\n282#1:593\n282#1:594\n282#1:595,2\n282#1:597,2\n282#1:599\n282#1:600\n305#1:602,2\n307#1:604,2\n308#1:606,2\n309#1:608,2\n310#1:610\n310#1:611,2\n311#1:613\n311#1:614,3\n317#1:617,3\n*E\n"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

.field public final synthetic f:Lz5/l1;

.field public final synthetic g:Lkotlin/jvm/functions/Function0;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;Lz5/l1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->e:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->f:Lz5/l1;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->g:Lkotlin/jvm/functions/Function0;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 4

    new-instance v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->e:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    iget-object v2, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->f:Lz5/l1;

    iget-object v3, p0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->g:Lkotlin/jvm/functions/Function0;

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;-><init>(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;Lz5/l1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->d:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->a(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/List;

    .line 6
    .line 7
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget v3, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->c:I

    .line 12
    .line 13
    const-string v4, ""

    .line 14
    .line 15
    const/16 v5, 0xa

    .line 16
    .line 17
    const/4 v6, 0x2

    .line 18
    const/4 v8, 0x1

    .line 19
    if-eqz v3, :cond_2

    .line 20
    .line 21
    if-eq v3, v8, :cond_1

    .line 22
    .line 23
    if-ne v3, v6, :cond_0

    .line 24
    .line 25
    iget-object v1, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Ljava/util/List;

    .line 28
    .line 29
    iget-object v1, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->a:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Ljava/util/List;

    .line 32
    .line 33
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto/16 :goto_11

    .line 37
    .line 38
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v1

    .line 46
    :cond_1
    iget-object v3, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v3, Ljava/util/List;

    .line 49
    .line 50
    iget-object v8, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v8, Ljava/util/List;

    .line 53
    .line 54
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto/16 :goto_5

    .line 58
    .line 59
    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    if-eqz v1, :cond_3

    .line 63
    .line 64
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_3

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_3
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v9

    .line 79
    if-eqz v9, :cond_8

    .line 80
    .line 81
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v9

    .line 85
    check-cast v9, Landroidx/work/WorkInfo;

    .line 86
    .line 87
    invoke-virtual {v9}, Landroidx/work/WorkInfo;->getState()Landroidx/work/WorkInfo$State;

    .line 88
    .line 89
    .line 90
    move-result-object v9

    .line 91
    sget-object v10, Landroidx/work/WorkInfo$State;->SUCCEEDED:Landroidx/work/WorkInfo$State;

    .line 92
    .line 93
    if-ne v9, v10, :cond_4

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_4
    if-eqz v1, :cond_5

    .line 97
    .line 98
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-eqz v2, :cond_5

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_5
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    :cond_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-eqz v2, :cond_7

    .line 114
    .line 115
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    check-cast v2, Landroidx/work/WorkInfo;

    .line 120
    .line 121
    invoke-virtual {v2}, Landroidx/work/WorkInfo;->getState()Landroidx/work/WorkInfo$State;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    invoke-virtual {v2}, Landroidx/work/WorkInfo$State;->isFinished()Z

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    if-nez v2, :cond_6

    .line 130
    .line 131
    goto/16 :goto_12

    .line 132
    .line 133
    :cond_7
    :goto_1
    sget-object v1, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 134
    .line 135
    const-string v2, "\u56fe\u7247\u4e0a\u4f20\u5931\u8d25"

    .line 136
    .line 137
    invoke-virtual {v1, v2}, Lcom/zykj/base/utils/XToastUtils;->error(Ljava/lang/CharSequence;)V

    .line 138
    .line 139
    .line 140
    iget-object v1, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->e:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    .line 141
    .line 142
    invoke-virtual {v1}, Lcom/zykj/evaluation/base/BaseViewModel;->c()V

    .line 143
    .line 144
    .line 145
    goto/16 :goto_12

    .line 146
    .line 147
    :cond_8
    :goto_2
    new-instance v3, Ljava/util/ArrayList;

    .line 148
    .line 149
    invoke-static {v1, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 150
    .line 151
    .line 152
    move-result v9

    .line 153
    invoke-direct {v3, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 154
    .line 155
    .line 156
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 157
    .line 158
    .line 159
    move-result-object v9

    .line 160
    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 161
    .line 162
    .line 163
    move-result v10

    .line 164
    if-eqz v10, :cond_a

    .line 165
    .line 166
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v10

    .line 170
    check-cast v10, Landroidx/work/WorkInfo;

    .line 171
    .line 172
    invoke-virtual {v10}, Landroidx/work/WorkInfo;->getOutputData()Landroidx/work/Data;

    .line 173
    .line 174
    .line 175
    move-result-object v10

    .line 176
    const-string v11, "SUCCESS_KEY"

    .line 177
    .line 178
    invoke-virtual {v10, v11}, Landroidx/work/Data;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v10

    .line 182
    if-nez v10, :cond_9

    .line 183
    .line 184
    move-object v10, v4

    .line 185
    :cond_9
    invoke-interface {v3, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_a
    iget-object v9, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->f:Lz5/l1;

    .line 190
    .line 191
    new-instance v10, Ljava/util/ArrayList;

    .line 192
    .line 193
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 197
    .line 198
    .line 199
    move-result v11

    .line 200
    const/4 v12, 0x0

    .line 201
    const/4 v13, 0x0

    .line 202
    :goto_4
    if-ge v13, v11, :cond_d

    .line 203
    .line 204
    invoke-virtual {v3, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v14

    .line 208
    add-int/lit8 v13, v13, 0x1

    .line 209
    .line 210
    add-int/lit8 v15, v12, 0x1

    .line 211
    .line 212
    if-gez v12, :cond_b

    .line 213
    .line 214
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 215
    .line 216
    .line 217
    :cond_b
    move-object/from16 v16, v14

    .line 218
    .line 219
    check-cast v16, Ljava/lang/String;

    .line 220
    .line 221
    invoke-static/range {v16 .. v16}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 222
    .line 223
    .line 224
    move-result v16

    .line 225
    if-nez v16, :cond_c

    .line 226
    .line 227
    invoke-virtual {v9}, Lz5/l1;->j()Ljava/util/List;

    .line 228
    .line 229
    .line 230
    move-result-object v7

    .line 231
    invoke-static {v7, v12}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v7

    .line 235
    check-cast v7, Lz5/f;

    .line 236
    .line 237
    if-eqz v7, :cond_c

    .line 238
    .line 239
    invoke-virtual {v7}, Lz5/f;->d()Z

    .line 240
    .line 241
    .line 242
    move-result v7

    .line 243
    if-ne v7, v8, :cond_c

    .line 244
    .line 245
    invoke-interface {v10, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    :cond_c
    move v12, v15

    .line 249
    goto :goto_4

    .line 250
    :cond_d
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    .line 251
    .line 252
    .line 253
    move-result v7

    .line 254
    if-nez v7, :cond_f

    .line 255
    .line 256
    iget-object v7, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->e:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    .line 257
    .line 258
    invoke-static {v7}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->t(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;)Lp5/j;

    .line 259
    .line 260
    .line 261
    move-result-object v7

    .line 262
    new-instance v9, Lcom/zykj/evaluation/bean/MonitorPictureReq;

    .line 263
    .line 264
    const-string v11, "\u9519\u9898\u672c"

    .line 265
    .line 266
    const-string v12, "com.zykj.mistake"

    .line 267
    .line 268
    invoke-direct {v9, v11, v12, v10}, Lcom/zykj/evaluation/bean/MonitorPictureReq;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 269
    .line 270
    .line 271
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v11

    .line 275
    iput-object v11, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->d:Ljava/lang/Object;

    .line 276
    .line 277
    iput-object v3, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->a:Ljava/lang/Object;

    .line 278
    .line 279
    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v11

    .line 283
    iput-object v11, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->b:Ljava/lang/Object;

    .line 284
    .line 285
    iput v8, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->c:I

    .line 286
    .line 287
    invoke-interface {v7, v9, v0}, Lp5/j;->j(Lcom/zykj/evaluation/bean/MonitorPictureReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v7

    .line 291
    if-ne v7, v2, :cond_e

    .line 292
    .line 293
    goto/16 :goto_10

    .line 294
    .line 295
    :cond_e
    move-object v8, v3

    .line 296
    move-object v3, v10

    .line 297
    :goto_5
    move-object v10, v3

    .line 298
    move-object v3, v8

    .line 299
    :cond_f
    iget-object v7, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->e:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    .line 300
    .line 301
    invoke-virtual {v7}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->S()V

    .line 302
    .line 303
    .line 304
    iget-object v7, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->e:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    .line 305
    .line 306
    invoke-static {v7}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->t(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;)Lp5/j;

    .line 307
    .line 308
    .line 309
    move-result-object v7

    .line 310
    iget-object v8, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->e:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    .line 311
    .line 312
    invoke-static {v8}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->m(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;)J

    .line 313
    .line 314
    .line 315
    move-result-wide v18

    .line 316
    iget-object v8, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->e:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    .line 317
    .line 318
    invoke-static {v8}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->o(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;)Z

    .line 319
    .line 320
    .line 321
    move-result v20

    .line 322
    iget-object v8, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->e:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    .line 323
    .line 324
    invoke-static {v8}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->r(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;)J

    .line 325
    .line 326
    .line 327
    move-result-wide v21

    .line 328
    iget-object v8, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->f:Lz5/l1;

    .line 329
    .line 330
    invoke-virtual {v8}, Lz5/l1;->i()J

    .line 331
    .line 332
    .line 333
    move-result-wide v23

    .line 334
    iget-object v8, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->f:Lz5/l1;

    .line 335
    .line 336
    invoke-virtual {v8}, Lz5/l1;->k()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v8

    .line 340
    iget-object v9, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->e:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    .line 341
    .line 342
    invoke-static {v9}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->n(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;)Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v9

    .line 346
    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    move-result v9

    .line 350
    const/4 v11, 0x0

    .line 351
    if-nez v9, :cond_10

    .line 352
    .line 353
    goto :goto_6

    .line 354
    :cond_10
    move-object v8, v11

    .line 355
    :goto_6
    if-nez v8, :cond_11

    .line 356
    .line 357
    move-object/from16 v25, v4

    .line 358
    .line 359
    goto :goto_7

    .line 360
    :cond_11
    move-object/from16 v25, v8

    .line 361
    .line 362
    :goto_7
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 363
    .line 364
    .line 365
    move-result-object v4

    .line 366
    :cond_12
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 367
    .line 368
    .line 369
    move-result v8

    .line 370
    if-eqz v8, :cond_21

    .line 371
    .line 372
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v8

    .line 376
    move-object/from16 v27, v8

    .line 377
    .line 378
    check-cast v27, Ljava/lang/String;

    .line 379
    .line 380
    invoke-static/range {v27 .. v27}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 381
    .line 382
    .line 383
    move-result v8

    .line 384
    if-nez v8, :cond_12

    .line 385
    .line 386
    iget-object v4, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->e:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    .line 387
    .line 388
    invoke-static {v4}, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;->p(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;)Z

    .line 389
    .line 390
    .line 391
    move-result v4

    .line 392
    if-nez v4, :cond_13

    .line 393
    .line 394
    move-object/from16 v26, v3

    .line 395
    .line 396
    goto :goto_8

    .line 397
    :cond_13
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 398
    .line 399
    .line 400
    move-result-object v4

    .line 401
    move-object/from16 v26, v4

    .line 402
    .line 403
    :goto_8
    iget-object v4, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->f:Lz5/l1;

    .line 404
    .line 405
    invoke-virtual {v4}, Lz5/l1;->f()Ljava/util/List;

    .line 406
    .line 407
    .line 408
    move-result-object v4

    .line 409
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 410
    .line 411
    .line 412
    move-result-object v4

    .line 413
    :cond_14
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 414
    .line 415
    .line 416
    move-result v8

    .line 417
    if-eqz v8, :cond_15

    .line 418
    .line 419
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v8

    .line 423
    move-object v9, v8

    .line 424
    check-cast v9, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 425
    .line 426
    invoke-virtual {v9}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->isSelected()Z

    .line 427
    .line 428
    .line 429
    move-result v9

    .line 430
    if-eqz v9, :cond_14

    .line 431
    .line 432
    goto :goto_9

    .line 433
    :cond_15
    move-object v8, v11

    .line 434
    :goto_9
    check-cast v8, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 435
    .line 436
    if-eqz v8, :cond_16

    .line 437
    .line 438
    invoke-virtual {v8}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->getId()J

    .line 439
    .line 440
    .line 441
    move-result-wide v8

    .line 442
    long-to-int v4, v8

    .line 443
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 444
    .line 445
    .line 446
    move-result-object v4

    .line 447
    move-object/from16 v28, v4

    .line 448
    .line 449
    goto :goto_a

    .line 450
    :cond_16
    move-object/from16 v28, v11

    .line 451
    .line 452
    :goto_a
    iget-object v4, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->f:Lz5/l1;

    .line 453
    .line 454
    invoke-virtual {v4}, Lz5/l1;->c()Ljava/util/List;

    .line 455
    .line 456
    .line 457
    move-result-object v4

    .line 458
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 459
    .line 460
    .line 461
    move-result-object v4

    .line 462
    :cond_17
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 463
    .line 464
    .line 465
    move-result v8

    .line 466
    if-eqz v8, :cond_18

    .line 467
    .line 468
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v8

    .line 472
    move-object v9, v8

    .line 473
    check-cast v9, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 474
    .line 475
    invoke-virtual {v9}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->isSelected()Z

    .line 476
    .line 477
    .line 478
    move-result v9

    .line 479
    if-eqz v9, :cond_17

    .line 480
    .line 481
    goto :goto_b

    .line 482
    :cond_18
    move-object v8, v11

    .line 483
    :goto_b
    check-cast v8, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 484
    .line 485
    if-eqz v8, :cond_19

    .line 486
    .line 487
    invoke-virtual {v8}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->getId()J

    .line 488
    .line 489
    .line 490
    move-result-wide v8

    .line 491
    long-to-int v4, v8

    .line 492
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 493
    .line 494
    .line 495
    move-result-object v4

    .line 496
    move-object/from16 v29, v4

    .line 497
    .line 498
    goto :goto_c

    .line 499
    :cond_19
    move-object/from16 v29, v11

    .line 500
    .line 501
    :goto_c
    iget-object v4, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->f:Lz5/l1;

    .line 502
    .line 503
    invoke-virtual {v4}, Lz5/l1;->g()Ljava/util/List;

    .line 504
    .line 505
    .line 506
    move-result-object v4

    .line 507
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 508
    .line 509
    .line 510
    move-result-object v4

    .line 511
    :cond_1a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 512
    .line 513
    .line 514
    move-result v8

    .line 515
    if-eqz v8, :cond_1b

    .line 516
    .line 517
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v8

    .line 521
    move-object v9, v8

    .line 522
    check-cast v9, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 523
    .line 524
    invoke-virtual {v9}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->isSelected()Z

    .line 525
    .line 526
    .line 527
    move-result v9

    .line 528
    if-eqz v9, :cond_1a

    .line 529
    .line 530
    goto :goto_d

    .line 531
    :cond_1b
    move-object v8, v11

    .line 532
    :goto_d
    check-cast v8, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 533
    .line 534
    if-eqz v8, :cond_1c

    .line 535
    .line 536
    invoke-virtual {v8}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->getId()J

    .line 537
    .line 538
    .line 539
    move-result-wide v8

    .line 540
    long-to-int v4, v8

    .line 541
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 542
    .line 543
    .line 544
    move-result-object v11

    .line 545
    :cond_1c
    move-object/from16 v30, v11

    .line 546
    .line 547
    iget-object v4, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->f:Lz5/l1;

    .line 548
    .line 549
    invoke-virtual {v4}, Lz5/l1;->e()Ljava/util/List;

    .line 550
    .line 551
    .line 552
    move-result-object v4

    .line 553
    new-instance v8, Ljava/util/ArrayList;

    .line 554
    .line 555
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 556
    .line 557
    .line 558
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 559
    .line 560
    .line 561
    move-result-object v4

    .line 562
    :cond_1d
    :goto_e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 563
    .line 564
    .line 565
    move-result v9

    .line 566
    if-eqz v9, :cond_1e

    .line 567
    .line 568
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    move-result-object v9

    .line 572
    move-object v11, v9

    .line 573
    check-cast v11, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 574
    .line 575
    invoke-virtual {v11}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->isSelected()Z

    .line 576
    .line 577
    .line 578
    move-result v11

    .line 579
    if-eqz v11, :cond_1d

    .line 580
    .line 581
    invoke-interface {v8, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 582
    .line 583
    .line 584
    goto :goto_e

    .line 585
    :cond_1e
    new-instance v4, Ljava/util/ArrayList;

    .line 586
    .line 587
    invoke-static {v8, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 588
    .line 589
    .line 590
    move-result v5

    .line 591
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 592
    .line 593
    .line 594
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 595
    .line 596
    .line 597
    move-result v5

    .line 598
    const/4 v9, 0x0

    .line 599
    :goto_f
    if-ge v9, v5, :cond_1f

    .line 600
    .line 601
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    move-result-object v11

    .line 605
    add-int/lit8 v9, v9, 0x1

    .line 606
    .line 607
    check-cast v11, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 608
    .line 609
    invoke-virtual {v11}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->getId()J

    .line 610
    .line 611
    .line 612
    move-result-wide v11

    .line 613
    long-to-int v11, v11

    .line 614
    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 615
    .line 616
    .line 617
    move-result-object v11

    .line 618
    invoke-interface {v4, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 619
    .line 620
    .line 621
    goto :goto_f

    .line 622
    :cond_1f
    new-instance v17, Lcom/zykj/evaluation/bean/AddMistakeReq;

    .line 623
    .line 624
    move-object/from16 v31, v4

    .line 625
    .line 626
    invoke-direct/range {v17 .. v31}, Lcom/zykj/evaluation/bean/AddMistakeReq;-><init>(JZJJLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V

    .line 627
    .line 628
    .line 629
    move-object/from16 v4, v17

    .line 630
    .line 631
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 632
    .line 633
    .line 634
    move-result-object v1

    .line 635
    iput-object v1, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->d:Ljava/lang/Object;

    .line 636
    .line 637
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 638
    .line 639
    .line 640
    move-result-object v1

    .line 641
    iput-object v1, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->a:Ljava/lang/Object;

    .line 642
    .line 643
    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 644
    .line 645
    .line 646
    move-result-object v1

    .line 647
    iput-object v1, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->b:Ljava/lang/Object;

    .line 648
    .line 649
    iput v6, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->c:I

    .line 650
    .line 651
    invoke-interface {v7, v4, v0}, Lp5/j;->g(Lcom/zykj/evaluation/bean/AddMistakeReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 652
    .line 653
    .line 654
    move-result-object v1

    .line 655
    if-ne v1, v2, :cond_20

    .line 656
    .line 657
    :goto_10
    return-object v2

    .line 658
    :cond_20
    :goto_11
    iget-object v1, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->e:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    .line 659
    .line 660
    invoke-virtual {v1}, Lcom/zykj/evaluation/base/BaseViewModel;->c()V

    .line 661
    .line 662
    .line 663
    iget-object v1, v0, Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel$uploadFileAndAddMistake$4$1;->g:Lkotlin/jvm/functions/Function0;

    .line 664
    .line 665
    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 666
    .line 667
    .line 668
    :goto_12
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 669
    .line 670
    return-object v1

    .line 671
    :cond_21
    new-instance v1, Ljava/util/NoSuchElementException;

    .line 672
    .line 673
    const-string v2, "Collection contains no element matching the predicate."

    .line 674
    .line 675
    invoke-direct {v1, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 676
    .line 677
    .line 678
    throw v1
.end method
