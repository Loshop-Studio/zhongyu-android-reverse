.class final Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$setAskForHelp$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->Y(JZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
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
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
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
    c = "com.zykj.evaluation.ui.guide.noStem.NoStemViewModel$setAskForHelp$1"
    f = "NoStemViewModel.kt"
    i = {}
    l = {
        0x7a
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNoStemViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NoStemViewModel.kt\ncom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$setAskForHelp$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,336:1\n1563#2:337\n1634#2,2:338\n1563#2:340\n1634#2,3:341\n1636#2:344\n*S KotlinDebug\n*F\n+ 1 NoStemViewModel.kt\ncom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$setAskForHelp$1\n*L\n130#1:337\n130#1:338,2\n132#1:340\n132#1:341,3\n130#1:344\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

.field public final synthetic c:J

.field public final synthetic d:Z


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;JZLkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$setAskForHelp$1;->b:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    iput-wide p2, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$setAskForHelp$1;->c:J

    iput-boolean p4, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$setAskForHelp$1;->d:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6

    new-instance v0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$setAskForHelp$1;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$setAskForHelp$1;->b:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    iget-wide v2, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$setAskForHelp$1;->c:J

    iget-boolean v4, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$setAskForHelp$1;->d:Z

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$setAskForHelp$1;-><init>(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;JZLkotlin/coroutines/Continuation;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$setAskForHelp$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$setAskForHelp$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$setAskForHelp$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$setAskForHelp$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v2, v0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$setAskForHelp$1;->a:I

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    if-ne v2, v3, :cond_0

    .line 13
    .line 14
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    move-object/from16 v2, p1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v1

    .line 28
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object v2, v0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$setAskForHelp$1;->b:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    .line 32
    .line 33
    invoke-static {v2}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->H(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;)Lp5/j;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    new-instance v4, Lcom/zykj/evaluation/bean/AskForHelpReq;

    .line 38
    .line 39
    iget-object v5, v0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$setAskForHelp$1;->b:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    .line 40
    .line 41
    invoke-virtual {v5}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->q()J

    .line 42
    .line 43
    .line 44
    move-result-wide v5

    .line 45
    iget-wide v7, v0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$setAskForHelp$1;->c:J

    .line 46
    .line 47
    iget-boolean v9, v0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$setAskForHelp$1;->d:Z

    .line 48
    .line 49
    invoke-direct/range {v4 .. v9}, Lcom/zykj/evaluation/bean/AskForHelpReq;-><init>(JJZ)V

    .line 50
    .line 51
    .line 52
    iput v3, v0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$setAskForHelp$1;->a:I

    .line 53
    .line 54
    invoke-interface {v2, v4, v0}, Lp5/j;->h(Lcom/zykj/evaluation/bean/AskForHelpReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    if-ne v2, v1, :cond_2

    .line 59
    .line 60
    return-object v1

    .line 61
    :cond_2
    :goto_0
    check-cast v2, Lcom/zykj/http/bean/ApiResp;

    .line 62
    .line 63
    invoke-static {v2}, Lo5/g;->b(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    iget-object v1, v0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$setAskForHelp$1;->b:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    .line 67
    .line 68
    iget-wide v2, v0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$setAskForHelp$1;->c:J

    .line 69
    .line 70
    iget-boolean v9, v0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$setAskForHelp$1;->d:Z

    .line 71
    .line 72
    invoke-virtual {v1}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->V()Li6/o0;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-virtual {v1}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->V()Li6/o0;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-virtual {v5}, Li6/o0;->b()Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    new-instance v6, Ljava/util/ArrayList;

    .line 85
    .line 86
    const/16 v7, 0xa

    .line 87
    .line 88
    invoke-static {v5, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 93
    .line 94
    .line 95
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v16

    .line 99
    :goto_1
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    if-eqz v5, :cond_5

    .line 104
    .line 105
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    move-object/from16 v17, v5

    .line 110
    .line 111
    check-cast v17, Li6/b;

    .line 112
    .line 113
    invoke-virtual/range {v17 .. v17}, Li6/b;->e()Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    new-instance v8, Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-static {v5, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 120
    .line 121
    .line 122
    move-result v10

    .line 123
    invoke-direct {v8, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 124
    .line 125
    .line 126
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object v18

    .line 130
    :goto_2
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    if-eqz v5, :cond_4

    .line 135
    .line 136
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    check-cast v5, Li6/l;

    .line 141
    .line 142
    invoke-virtual {v5}, Li6/l;->f()J

    .line 143
    .line 144
    .line 145
    move-result-wide v10

    .line 146
    cmp-long v10, v10, v2

    .line 147
    .line 148
    if-nez v10, :cond_3

    .line 149
    .line 150
    const/16 v14, 0xf7

    .line 151
    .line 152
    const/4 v15, 0x0

    .line 153
    move-object v10, v4

    .line 154
    move-object v4, v5

    .line 155
    const/4 v5, 0x0

    .line 156
    move-object v11, v6

    .line 157
    move v12, v7

    .line 158
    const-wide/16 v6, 0x0

    .line 159
    .line 160
    move-object/from16 v21, v8

    .line 161
    .line 162
    const/4 v8, 0x0

    .line 163
    move-object v13, v10

    .line 164
    const/4 v10, 0x0

    .line 165
    move-object/from16 v19, v11

    .line 166
    .line 167
    const/4 v11, 0x0

    .line 168
    move/from16 v20, v12

    .line 169
    .line 170
    const/4 v12, 0x0

    .line 171
    move-object/from16 v22, v13

    .line 172
    .line 173
    const/4 v13, 0x0

    .line 174
    move-wide/from16 v24, v2

    .line 175
    .line 176
    move-object/from16 v2, v19

    .line 177
    .line 178
    move/from16 v26, v20

    .line 179
    .line 180
    move-object/from16 v3, v21

    .line 181
    .line 182
    move-object/from16 v0, v22

    .line 183
    .line 184
    invoke-static/range {v4 .. v15}, Li6/l;->b(Li6/l;Ljava/lang/String;JZZILjava/lang/String;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Li6/l;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    goto :goto_3

    .line 189
    :cond_3
    move-wide/from16 v24, v2

    .line 190
    .line 191
    move-object v0, v4

    .line 192
    move-object v4, v5

    .line 193
    move-object v2, v6

    .line 194
    move/from16 v26, v7

    .line 195
    .line 196
    move-object v3, v8

    .line 197
    :goto_3
    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-object v4, v0

    .line 201
    move-object v6, v2

    .line 202
    move-object v8, v3

    .line 203
    move-wide/from16 v2, v24

    .line 204
    .line 205
    move/from16 v7, v26

    .line 206
    .line 207
    move-object/from16 v0, p0

    .line 208
    .line 209
    goto :goto_2

    .line 210
    :cond_4
    move-wide/from16 v24, v2

    .line 211
    .line 212
    move-object v0, v4

    .line 213
    move-object v2, v6

    .line 214
    move/from16 v26, v7

    .line 215
    .line 216
    move-object v3, v8

    .line 217
    const/16 v22, 0x7

    .line 218
    .line 219
    const/16 v23, 0x0

    .line 220
    .line 221
    const/16 v18, 0x0

    .line 222
    .line 223
    const/16 v19, 0x0

    .line 224
    .line 225
    const/16 v20, 0x0

    .line 226
    .line 227
    move-object/from16 v21, v3

    .line 228
    .line 229
    invoke-static/range {v17 .. v23}, Li6/b;->b(Li6/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Li6/b;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-wide/from16 v2, v24

    .line 237
    .line 238
    move-object/from16 v0, p0

    .line 239
    .line 240
    goto/16 :goto_1

    .line 241
    .line 242
    :cond_5
    move-object v0, v4

    .line 243
    move-object v2, v6

    .line 244
    invoke-virtual {v0, v2}, Li6/o0;->a(Ljava/util/List;)Li6/o0;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    invoke-static {v1, v0}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->M(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Li6/o0;)V

    .line 249
    .line 250
    .line 251
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 252
    .line 253
    return-object v0
.end method
