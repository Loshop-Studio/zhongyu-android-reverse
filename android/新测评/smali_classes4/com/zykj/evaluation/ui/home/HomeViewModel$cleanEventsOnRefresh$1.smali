.class final Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/home/HomeViewModel;->H()V
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
    c = "com.zykj.evaluation.ui.home.HomeViewModel$cleanEventsOnRefresh$1"
    f = "HomeViewModel.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0x2b8
    }
    m = "invokeSuspend"
    n = {
        "$this$update$iv",
        "prevValue$iv",
        "data",
        "$this$invokeSuspend_u24lambda_u243_u24lambda_u242",
        "$this$forEach$iv",
        "element$iv",
        "modifyInfo",
        "$i$f$update",
        "$i$a$-update-HomeViewModel$cleanEventsOnRefresh$1$1",
        "$i$a$-apply-HomeViewModel$cleanEventsOnRefresh$1$1$1",
        "$i$f$forEach",
        "$i$a$-forEach-HomeViewModel$cleanEventsOnRefresh$1$1$1$1",
        "taskId",
        "isCommitting"
    }
    s = {
        "L$0",
        "L$2",
        "L$3",
        "L$5",
        "L$6",
        "L$8",
        "L$9",
        "I$0",
        "I$1",
        "I$2",
        "I$3",
        "I$4",
        "J$0",
        "I$5"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,715:1\n230#2,3:716\n233#2,2:721\n216#3,2:719\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1\n*L\n691#1:716,3\n691#1:721,2\n693#1:719,2\n*E\n"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:I

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:J

.field public r:I

.field public final synthetic s:Lcom/zykj/evaluation/ui/home/HomeViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/home/HomeViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->s:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1

    new-instance p1, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;

    iget-object v0, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->s:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    invoke-direct {p1, v0, p2}, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;-><init>(Lcom/zykj/evaluation/ui/home/HomeViewModel;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v6

    .line 7
    iget v0, v5, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->r:I

    .line 8
    .line 9
    const/4 v7, 0x1

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    if-ne v0, v7, :cond_0

    .line 13
    .line 14
    iget v0, v5, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->p:I

    .line 15
    .line 16
    iget-wide v1, v5, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->q:J

    .line 17
    .line 18
    iget v3, v5, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->n:I

    .line 19
    .line 20
    iget v4, v5, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->m:I

    .line 21
    .line 22
    iget v9, v5, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->l:I

    .line 23
    .line 24
    iget v10, v5, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->k:I

    .line 25
    .line 26
    iget-object v11, v5, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->j:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v11, Lt6/p0;

    .line 29
    .line 30
    iget-object v12, v5, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->i:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v12, Ljava/util/Map$Entry;

    .line 33
    .line 34
    iget-object v12, v5, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->h:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v12, Ljava/util/Iterator;

    .line 37
    .line 38
    iget-object v13, v5, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->g:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v13, Ljava/util/Map;

    .line 41
    .line 42
    iget-object v14, v5, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->f:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v14, Ljava/util/Map;

    .line 45
    .line 46
    iget-object v15, v5, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->e:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v15, Ljava/util/Map;

    .line 49
    .line 50
    iget-object v7, v5, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->d:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v7, Ljava/util/Map;

    .line 53
    .line 54
    iget-object v8, v5, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->c:Ljava/lang/Object;

    .line 55
    .line 56
    move/from16 v17, v0

    .line 57
    .line 58
    iget-object v0, v5, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->b:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Lcom/zykj/evaluation/ui/home/HomeViewModel;

    .line 61
    .line 62
    move-object/from16 v18, v0

    .line 63
    .line 64
    iget-object v0, v5, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->a:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 67
    .line 68
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    move-object v5, v13

    .line 72
    const/16 v16, 0x1

    .line 73
    .line 74
    move-object v13, v8

    .line 75
    move-object/from16 v8, v18

    .line 76
    .line 77
    move-object/from16 v18, v11

    .line 78
    .line 79
    move v11, v4

    .line 80
    move-object/from16 v24, v0

    .line 81
    .line 82
    move-object/from16 v0, p1

    .line 83
    .line 84
    move-object/from16 v25, v7

    .line 85
    .line 86
    move-object/from16 v7, v24

    .line 87
    .line 88
    move/from16 v24, v10

    .line 89
    .line 90
    move v10, v3

    .line 91
    move-wide v3, v1

    .line 92
    move v2, v9

    .line 93
    move/from16 v9, v24

    .line 94
    .line 95
    move-object v1, v15

    .line 96
    move-object v15, v12

    .line 97
    move-object/from16 v12, v25

    .line 98
    .line 99
    goto/16 :goto_2

    .line 100
    .line 101
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 102
    .line 103
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 104
    .line 105
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    throw v0

    .line 109
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    iget-object v0, v5, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->s:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    .line 113
    .line 114
    invoke-static {v0}, Lcom/zykj/evaluation/ui/home/HomeViewModel;->w(Lcom/zykj/evaluation/ui/home/HomeViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    iget-object v1, v5, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->s:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    .line 119
    .line 120
    const/4 v2, 0x0

    .line 121
    :goto_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    move-object v4, v3

    .line 126
    check-cast v4, Ljava/util/Map;

    .line 127
    .line 128
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 129
    .line 130
    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    .line 131
    .line 132
    .line 133
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 134
    .line 135
    .line 136
    move-result-object v8

    .line 137
    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 138
    .line 139
    .line 140
    move-result-object v8

    .line 141
    move v9, v2

    .line 142
    move-object v13, v3

    .line 143
    move-object v12, v4

    .line 144
    move-object/from16 v17, v12

    .line 145
    .line 146
    move-object v15, v8

    .line 147
    const/4 v10, 0x0

    .line 148
    const/4 v11, 0x0

    .line 149
    const/4 v14, 0x0

    .line 150
    move-object v8, v1

    .line 151
    move-object v1, v7

    .line 152
    move-object v7, v0

    .line 153
    move-object v0, v1

    .line 154
    :goto_1
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    if-eqz v2, :cond_7

    .line 159
    .line 160
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    check-cast v2, Ljava/util/Map$Entry;

    .line 165
    .line 166
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    check-cast v3, Ljava/lang/Number;

    .line 171
    .line 172
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 173
    .line 174
    .line 175
    move-result-wide v3

    .line 176
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v18

    .line 180
    move-object/from16 p1, v12

    .line 181
    .line 182
    move-object/from16 v12, v18

    .line 183
    .line 184
    check-cast v12, Lt6/p0;

    .line 185
    .line 186
    move-object/from16 v18, v2

    .line 187
    .line 188
    invoke-virtual {v12}, Lt6/p0;->c()Lt6/q0;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    instance-of v2, v2, Lt6/q0$b$c;

    .line 193
    .line 194
    invoke-static {v8}, Lcom/zykj/evaluation/ui/home/HomeViewModel;->o(Lcom/zykj/evaluation/ui/home/HomeViewModel;)Lcom/zykj/evaluation/di/AppDatabase;

    .line 195
    .line 196
    .line 197
    move-result-object v19

    .line 198
    invoke-virtual/range {v19 .. v19}, Lcom/zykj/evaluation/di/AppDatabase;->g()Ln5/b;

    .line 199
    .line 200
    .line 201
    move-result-object v19

    .line 202
    invoke-static {v8}, Lcom/zykj/evaluation/ui/home/HomeViewModel;->y(Lcom/zykj/evaluation/ui/home/HomeViewModel;)J

    .line 203
    .line 204
    .line 205
    move-result-wide v20

    .line 206
    iput-object v7, v5, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->a:Ljava/lang/Object;

    .line 207
    .line 208
    iput-object v8, v5, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->b:Ljava/lang/Object;

    .line 209
    .line 210
    iput-object v13, v5, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->c:Ljava/lang/Object;

    .line 211
    .line 212
    move-object/from16 v22, v8

    .line 213
    .line 214
    invoke-static/range {p1 .. p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v8

    .line 218
    iput-object v8, v5, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->d:Ljava/lang/Object;

    .line 219
    .line 220
    iput-object v1, v5, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->e:Ljava/lang/Object;

    .line 221
    .line 222
    iput-object v0, v5, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->f:Ljava/lang/Object;

    .line 223
    .line 224
    invoke-static/range {v17 .. v17}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v8

    .line 228
    iput-object v8, v5, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->g:Ljava/lang/Object;

    .line 229
    .line 230
    iput-object v15, v5, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->h:Ljava/lang/Object;

    .line 231
    .line 232
    invoke-static/range {v18 .. v18}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v8

    .line 236
    iput-object v8, v5, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->i:Ljava/lang/Object;

    .line 237
    .line 238
    iput-object v12, v5, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->j:Ljava/lang/Object;

    .line 239
    .line 240
    iput v9, v5, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->k:I

    .line 241
    .line 242
    iput v14, v5, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->l:I

    .line 243
    .line 244
    iput v11, v5, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->m:I

    .line 245
    .line 246
    iput v10, v5, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->n:I

    .line 247
    .line 248
    const/4 v8, 0x0

    .line 249
    iput v8, v5, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->o:I

    .line 250
    .line 251
    iput-wide v3, v5, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->q:J

    .line 252
    .line 253
    iput v2, v5, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->p:I

    .line 254
    .line 255
    const/4 v8, 0x1

    .line 256
    iput v8, v5, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;->r:I

    .line 257
    .line 258
    move-object/from16 v18, v0

    .line 259
    .line 260
    move/from16 v16, v8

    .line 261
    .line 262
    move-object/from16 v0, v19

    .line 263
    .line 264
    move-object v8, v1

    .line 265
    move/from16 v19, v2

    .line 266
    .line 267
    move-wide/from16 v1, v20

    .line 268
    .line 269
    invoke-interface/range {v0 .. v5}, Ln5/b;->d(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    if-ne v0, v6, :cond_2

    .line 274
    .line 275
    return-object v6

    .line 276
    :cond_2
    move-object v1, v8

    .line 277
    move v2, v14

    .line 278
    move-object/from16 v5, v17

    .line 279
    .line 280
    move-object/from16 v14, v18

    .line 281
    .line 282
    move/from16 v17, v19

    .line 283
    .line 284
    move-object/from16 v8, v22

    .line 285
    .line 286
    move-object/from16 v18, v12

    .line 287
    .line 288
    move-object/from16 v12, p1

    .line 289
    .line 290
    :goto_2
    check-cast v0, Ln5/a;

    .line 291
    .line 292
    if-eqz v0, :cond_3

    .line 293
    .line 294
    invoke-virtual {v0}, Ln5/a;->f()Z

    .line 295
    .line 296
    .line 297
    move-result v0

    .line 298
    xor-int/lit8 v0, v0, 0x1

    .line 299
    .line 300
    move/from16 p1, v0

    .line 301
    .line 302
    goto :goto_3

    .line 303
    :cond_3
    const/16 p1, 0x0

    .line 304
    .line 305
    :goto_3
    invoke-virtual/range {v18 .. v18}, Lt6/p0;->c()Lt6/q0;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    instance-of v0, v0, Lt6/q0$b$a;

    .line 310
    .line 311
    if-eqz v0, :cond_4

    .line 312
    .line 313
    if-eqz p1, :cond_4

    .line 314
    .line 315
    move/from16 v0, v16

    .line 316
    .line 317
    goto :goto_4

    .line 318
    :cond_4
    const/4 v0, 0x0

    .line 319
    :goto_4
    if-nez v17, :cond_5

    .line 320
    .line 321
    if-eqz v0, :cond_6

    .line 322
    .line 323
    :cond_5
    invoke-static {v3, v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    const/16 v22, 0x2

    .line 328
    .line 329
    const/16 v23, 0x0

    .line 330
    .line 331
    const/16 v19, 0x0

    .line 332
    .line 333
    const/16 v20, 0x0

    .line 334
    .line 335
    const/16 v21, 0x0

    .line 336
    .line 337
    invoke-static/range {v18 .. v23}, Lt6/p0;->b(Lt6/p0;Ljava/lang/Boolean;Lt6/q0;Ljava/lang/Boolean;ILjava/lang/Object;)Lt6/p0;

    .line 338
    .line 339
    .line 340
    move-result-object v3

    .line 341
    invoke-interface {v14, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    :cond_6
    move-object/from16 v17, v5

    .line 345
    .line 346
    move-object v0, v14

    .line 347
    move-object/from16 v5, p0

    .line 348
    .line 349
    move v14, v2

    .line 350
    goto/16 :goto_1

    .line 351
    .line 352
    :cond_7
    move-object/from16 v22, v8

    .line 353
    .line 354
    const/16 v16, 0x1

    .line 355
    .line 356
    move-object v8, v1

    .line 357
    invoke-interface {v7, v13, v8}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v0

    .line 361
    if-eqz v0, :cond_8

    .line 362
    .line 363
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 364
    .line 365
    return-object v0

    .line 366
    :cond_8
    move-object/from16 v5, p0

    .line 367
    .line 368
    move-object v0, v7

    .line 369
    move v2, v9

    .line 370
    move-object/from16 v1, v22

    .line 371
    .line 372
    goto/16 :goto_0
.end method
