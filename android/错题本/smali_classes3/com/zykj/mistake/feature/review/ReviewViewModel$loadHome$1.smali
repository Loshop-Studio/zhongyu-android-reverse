.class final Lcom/zykj/mistake/feature/review/ReviewViewModel$loadHome$1;
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
    c = "com.zykj.mistake.feature.review.ReviewViewModel$loadHome$1"
    f = "ReviewViewModel.kt"
    i = {
        0x1
    }
    l = {
        0x31,
        0x52
    }
    m = "invokeSuspend"
    n = {
        "error"
    }
    s = {
        "L$0"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nReviewViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReviewViewModel.kt\ncom/zykj/mistake/feature/review/ReviewViewModel$loadHome$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,134:1\n230#2,5:135\n230#2,5:140\n230#2,5:145\n*S KotlinDebug\n*F\n+ 1 ReviewViewModel.kt\ncom/zykj/mistake/feature/review/ReviewViewModel$loadHome$1\n*L\n47#1:135,5\n50#1:140,5\n79#1:145,5\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $studentName:Ljava/lang/String;

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/zykj/mistake/feature/review/ReviewViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/feature/review/ReviewViewModel;Ljava/lang/String;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/feature/review/ReviewViewModel;",
            "Ljava/lang/String;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/review/ReviewViewModel$loadHome$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/review/ReviewViewModel$loadHome$1;->this$0:Lcom/zykj/mistake/feature/review/ReviewViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/review/ReviewViewModel$loadHome$1;->$studentName:Ljava/lang/String;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 2
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
    new-instance p1, Lcom/zykj/mistake/feature/review/ReviewViewModel$loadHome$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/mistake/feature/review/ReviewViewModel$loadHome$1;->this$0:Lcom/zykj/mistake/feature/review/ReviewViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/mistake/feature/review/ReviewViewModel$loadHome$1;->$studentName:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/mistake/feature/review/ReviewViewModel$loadHome$1;-><init>(Lcom/zykj/mistake/feature/review/ReviewViewModel;Ljava/lang/String;Lh6/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/review/ReviewViewModel$loadHome$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/review/ReviewViewModel$loadHome$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/review/ReviewViewModel$loadHome$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/review/ReviewViewModel$loadHome$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 4
    .line 5
    iget v0, v1, Lcom/zykj/mistake/feature/review/ReviewViewModel$loadHome$1;->label:I

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x1

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    if-eq v0, v4, :cond_1

    .line 12
    .line 13
    if-ne v0, v3, :cond_0

    .line 14
    .line 15
    iget-object v0, v1, Lcom/zykj/mistake/feature/review/ReviewViewModel$loadHome$1;->L$0:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ljava/lang/Throwable;

    .line 18
    .line 19
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto/16 :goto_4

    .line 23
    .line 24
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v0

    .line 32
    :cond_1
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    move-object/from16 v0, p1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    goto/16 :goto_2

    .line 40
    .line 41
    :catch_0
    move-exception v0

    .line 42
    goto/16 :goto_5

    .line 43
    .line 44
    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object v0, v1, Lcom/zykj/mistake/feature/review/ReviewViewModel$loadHome$1;->this$0:Lcom/zykj/mistake/feature/review/ReviewViewModel;

    .line 48
    .line 49
    iget-object v0, v0, Lcom/zykj/mistake/feature/review/ReviewViewModel;->b:Lkotlinx/coroutines/flow/n0;

    .line 50
    .line 51
    :cond_3
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    move-object v6, v5

    .line 56
    check-cast v6, Lcom/zykj/mistake/feature/review/i;

    .line 57
    .line 58
    const/16 v27, 0x1

    .line 59
    .line 60
    const v28, 0x5fffff

    .line 61
    .line 62
    .line 63
    const/4 v7, 0x0

    .line 64
    const/4 v8, 0x0

    .line 65
    const/4 v9, 0x0

    .line 66
    const/4 v10, 0x0

    .line 67
    const/4 v11, 0x0

    .line 68
    const/4 v12, 0x0

    .line 69
    const/4 v13, 0x0

    .line 70
    const/4 v14, 0x0

    .line 71
    const/4 v15, 0x0

    .line 72
    const/16 v16, 0x0

    .line 73
    .line 74
    const/16 v17, 0x0

    .line 75
    .line 76
    const/16 v18, 0x0

    .line 77
    .line 78
    const/16 v19, 0x0

    .line 79
    .line 80
    const/16 v20, 0x0

    .line 81
    .line 82
    const/16 v21, 0x0

    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/16 v23, 0x0

    .line 87
    .line 88
    const/16 v24, 0x0

    .line 89
    .line 90
    const/16 v25, 0x0

    .line 91
    .line 92
    const/16 v26, 0x0

    .line 93
    .line 94
    invoke-static/range {v6 .. v28}, Lcom/zykj/mistake/feature/review/i;->a(Lcom/zykj/mistake/feature/review/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;IZLjava/lang/String;IZLjava/lang/String;IZLjava/lang/Integer;IIIIZZI)Lcom/zykj/mistake/feature/review/i;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    invoke-virtual {v0, v5, v6}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    if-eqz v5, :cond_3

    .line 103
    .line 104
    :try_start_1
    iget-object v0, v1, Lcom/zykj/mistake/feature/review/ReviewViewModel$loadHome$1;->this$0:Lcom/zykj/mistake/feature/review/ReviewViewModel;

    .line 105
    .line 106
    iget-object v0, v0, Lcom/zykj/mistake/feature/review/ReviewViewModel;->a:Lcom/zykj/mistake/feature/review/r;

    .line 107
    .line 108
    iget-object v5, v1, Lcom/zykj/mistake/feature/review/ReviewViewModel$loadHome$1;->$studentName:Ljava/lang/String;

    .line 109
    .line 110
    iput v4, v1, Lcom/zykj/mistake/feature/review/ReviewViewModel$loadHome$1;->label:I

    .line 111
    .line 112
    invoke-virtual {v0, v5, v1}, Lcom/zykj/mistake/feature/review/r;->a(Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    if-ne v0, v2, :cond_4

    .line 117
    .line 118
    goto/16 :goto_3

    .line 119
    .line 120
    :cond_4
    :goto_0
    check-cast v0, Lcom/zykj/mistake/feature/review/k;

    .line 121
    .line 122
    iget-object v4, v1, Lcom/zykj/mistake/feature/review/ReviewViewModel$loadHome$1;->this$0:Lcom/zykj/mistake/feature/review/ReviewViewModel;

    .line 123
    .line 124
    iget-object v4, v4, Lcom/zykj/mistake/feature/review/ReviewViewModel;->b:Lkotlinx/coroutines/flow/n0;

    .line 125
    .line 126
    :goto_1
    invoke-virtual {v4}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    move-object v6, v5

    .line 131
    check-cast v6, Lcom/zykj/mistake/feature/review/i;

    .line 132
    .line 133
    iget-object v7, v0, Lcom/zykj/mistake/feature/review/k;->a:Ljava/lang/String;

    .line 134
    .line 135
    iget-object v8, v0, Lcom/zykj/mistake/feature/review/k;->b:Ljava/lang/String;

    .line 136
    .line 137
    iget-object v9, v0, Lcom/zykj/mistake/feature/review/k;->c:Ljava/lang/String;

    .line 138
    .line 139
    iget v10, v0, Lcom/zykj/mistake/feature/review/k;->d:I

    .line 140
    .line 141
    iget-boolean v11, v0, Lcom/zykj/mistake/feature/review/k;->e:Z

    .line 142
    .line 143
    iget-object v12, v0, Lcom/zykj/mistake/feature/review/k;->f:Ljava/lang/String;

    .line 144
    .line 145
    iget v13, v0, Lcom/zykj/mistake/feature/review/k;->g:I

    .line 146
    .line 147
    iget-boolean v14, v0, Lcom/zykj/mistake/feature/review/k;->h:Z

    .line 148
    .line 149
    iget-object v15, v0, Lcom/zykj/mistake/feature/review/k;->i:Ljava/lang/String;

    .line 150
    .line 151
    iget v3, v0, Lcom/zykj/mistake/feature/review/k;->j:I

    .line 152
    .line 153
    move/from16 v16, v3

    .line 154
    .line 155
    iget-boolean v3, v0, Lcom/zykj/mistake/feature/review/k;->k:Z

    .line 156
    .line 157
    move/from16 v17, v3

    .line 158
    .line 159
    iget-object v3, v0, Lcom/zykj/mistake/feature/review/k;->l:Ljava/lang/String;

    .line 160
    .line 161
    move-object/from16 v18, v3

    .line 162
    .line 163
    iget v3, v0, Lcom/zykj/mistake/feature/review/k;->m:I

    .line 164
    .line 165
    move/from16 v19, v3

    .line 166
    .line 167
    iget-boolean v3, v0, Lcom/zykj/mistake/feature/review/k;->n:Z

    .line 168
    .line 169
    move/from16 v20, v3

    .line 170
    .line 171
    iget-object v3, v0, Lcom/zykj/mistake/feature/review/k;->o:Ljava/lang/Integer;

    .line 172
    .line 173
    move-object/from16 v21, v3

    .line 174
    .line 175
    iget v3, v0, Lcom/zykj/mistake/feature/review/k;->p:I

    .line 176
    .line 177
    move/from16 v22, v3

    .line 178
    .line 179
    iget v3, v0, Lcom/zykj/mistake/feature/review/k;->q:I

    .line 180
    .line 181
    move/from16 v23, v3

    .line 182
    .line 183
    iget v3, v0, Lcom/zykj/mistake/feature/review/k;->r:I

    .line 184
    .line 185
    move/from16 v24, v3

    .line 186
    .line 187
    iget v3, v0, Lcom/zykj/mistake/feature/review/k;->s:I

    .line 188
    .line 189
    move/from16 v25, v3

    .line 190
    .line 191
    iget-boolean v3, v0, Lcom/zykj/mistake/feature/review/k;->t:Z

    .line 192
    .line 193
    const/16 v27, 0x0

    .line 194
    .line 195
    const/high16 v28, 0x400000

    .line 196
    .line 197
    move/from16 v26, v3

    .line 198
    .line 199
    invoke-static/range {v6 .. v28}, Lcom/zykj/mistake/feature/review/i;->a(Lcom/zykj/mistake/feature/review/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;IZLjava/lang/String;IZLjava/lang/String;IZLjava/lang/Integer;IIIIZZI)Lcom/zykj/mistake/feature/review/i;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    invoke-virtual {v4, v5, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v3
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 207
    if-eqz v3, :cond_5

    .line 208
    .line 209
    goto :goto_4

    .line 210
    :cond_5
    const/4 v3, 0x2

    .line 211
    goto :goto_1

    .line 212
    :goto_2
    iget-object v3, v1, Lcom/zykj/mistake/feature/review/ReviewViewModel$loadHome$1;->this$0:Lcom/zykj/mistake/feature/review/ReviewViewModel;

    .line 213
    .line 214
    iget-object v3, v3, Lcom/zykj/mistake/feature/review/ReviewViewModel;->b:Lkotlinx/coroutines/flow/n0;

    .line 215
    .line 216
    :cond_6
    invoke-virtual {v3}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v4

    .line 220
    move-object v5, v4

    .line 221
    check-cast v5, Lcom/zykj/mistake/feature/review/i;

    .line 222
    .line 223
    const/16 v26, 0x0

    .line 224
    .line 225
    const v27, 0x4fffff

    .line 226
    .line 227
    .line 228
    const/4 v6, 0x0

    .line 229
    const/4 v7, 0x0

    .line 230
    const/4 v8, 0x0

    .line 231
    const/4 v9, 0x0

    .line 232
    const/4 v10, 0x0

    .line 233
    const/4 v11, 0x0

    .line 234
    const/4 v12, 0x0

    .line 235
    const/4 v13, 0x0

    .line 236
    const/4 v14, 0x0

    .line 237
    const/4 v15, 0x0

    .line 238
    const/16 v16, 0x0

    .line 239
    .line 240
    const/16 v17, 0x0

    .line 241
    .line 242
    const/16 v18, 0x0

    .line 243
    .line 244
    const/16 v19, 0x0

    .line 245
    .line 246
    const/16 v20, 0x0

    .line 247
    .line 248
    const/16 v21, 0x0

    .line 249
    .line 250
    const/16 v22, 0x0

    .line 251
    .line 252
    const/16 v23, 0x0

    .line 253
    .line 254
    const/16 v24, 0x0

    .line 255
    .line 256
    const/16 v25, 0x0

    .line 257
    .line 258
    invoke-static/range {v5 .. v27}, Lcom/zykj/mistake/feature/review/i;->a(Lcom/zykj/mistake/feature/review/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;IZLjava/lang/String;IZLjava/lang/String;IZLjava/lang/Integer;IIIIZZI)Lcom/zykj/mistake/feature/review/i;

    .line 259
    .line 260
    .line 261
    move-result-object v5

    .line 262
    invoke-virtual {v3, v4, v5}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result v4

    .line 266
    if-eqz v4, :cond_6

    .line 267
    .line 268
    iget-object v3, v1, Lcom/zykj/mistake/feature/review/ReviewViewModel$loadHome$1;->this$0:Lcom/zykj/mistake/feature/review/ReviewViewModel;

    .line 269
    .line 270
    iget-object v3, v3, Lcom/zykj/mistake/feature/review/ReviewViewModel;->d:Lkotlinx/coroutines/channels/b;

    .line 271
    .line 272
    new-instance v4, Lcom/zykj/mistake/feature/review/b;

    .line 273
    .line 274
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    if-nez v0, :cond_7

    .line 279
    .line 280
    const-string v0, ""

    .line 281
    .line 282
    :cond_7
    invoke-direct {v4, v0}, Lcom/zykj/mistake/feature/review/b;-><init>(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    const/4 v0, 0x0

    .line 286
    iput-object v0, v1, Lcom/zykj/mistake/feature/review/ReviewViewModel$loadHome$1;->L$0:Ljava/lang/Object;

    .line 287
    .line 288
    const/4 v5, 0x2

    .line 289
    iput v5, v1, Lcom/zykj/mistake/feature/review/ReviewViewModel$loadHome$1;->label:I

    .line 290
    .line 291
    invoke-interface {v3, v1, v4}, Lkotlinx/coroutines/channels/p;->q(Lh6/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    if-ne v0, v2, :cond_8

    .line 296
    .line 297
    :goto_3
    return-object v2

    .line 298
    :cond_8
    :goto_4
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 299
    .line 300
    return-object v0

    .line 301
    :goto_5
    throw v0
.end method
