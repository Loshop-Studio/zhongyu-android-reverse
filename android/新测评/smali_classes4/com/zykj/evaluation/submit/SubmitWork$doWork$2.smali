.class final Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/submit/SubmitWork;->h(Lcom/zykj/evaluation/submit/SubmitWork;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Landroidx/work/ListenableWorker$Result;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/work/ListenableWorker$Result;",
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
    c = "com.zykj.evaluation.submit.SubmitWork$doWork$2"
    f = "SubmitWork.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x5,
        0x5,
        0x5,
        0x5,
        0x5,
        0x5,
        0x6,
        0x6,
        0x6,
        0x6,
        0x6,
        0x6,
        0x7,
        0x7,
        0x7,
        0x7,
        0x7,
        0x7,
        0x8,
        0x8,
        0x8,
        0x8,
        0x8,
        0x8,
        0x8,
        0x9,
        0x9
    }
    l = {
        0x4f,
        0x54,
        0x76,
        0x7c,
        0x7f,
        0x80,
        0x81,
        0x83,
        0x88,
        0x8e
    }
    m = "invokeSuspend"
    n = {
        "$this$coroutineScope",
        "userId",
        "taskId",
        "taskState",
        "$this$coroutineScope",
        "userId",
        "taskId",
        "taskState",
        "$this$coroutineScope",
        "commitState",
        "job",
        "userId",
        "taskId",
        "taskState",
        "$this$coroutineScope",
        "commitState",
        "job",
        "userId",
        "taskId",
        "taskState",
        "$this$coroutineScope",
        "commitState",
        "job",
        "userId",
        "taskId",
        "taskState",
        "$this$coroutineScope",
        "commitState",
        "job",
        "userId",
        "taskId",
        "taskState",
        "$this$coroutineScope",
        "commitState",
        "job",
        "userId",
        "taskId",
        "taskState",
        "$this$coroutineScope",
        "commitState",
        "job",
        "userId",
        "taskId",
        "taskState",
        "$this$coroutineScope",
        "commitState",
        "job",
        "e",
        "userId",
        "taskId",
        "taskState",
        "$this$coroutineScope",
        "e"
    }
    s = {
        "L$0",
        "J$0",
        "J$1",
        "I$0",
        "L$0",
        "J$0",
        "J$1",
        "I$0",
        "L$0",
        "L$1",
        "L$2",
        "J$0",
        "J$1",
        "I$0",
        "L$0",
        "L$1",
        "L$2",
        "J$0",
        "J$1",
        "I$0",
        "L$0",
        "L$1",
        "L$2",
        "J$0",
        "J$1",
        "I$0",
        "L$0",
        "L$1",
        "L$2",
        "J$0",
        "J$1",
        "I$0",
        "L$0",
        "L$1",
        "L$2",
        "J$0",
        "J$1",
        "I$0",
        "L$0",
        "L$1",
        "L$2",
        "J$0",
        "J$1",
        "I$0",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "J$0",
        "J$1",
        "I$0",
        "L$0",
        "L$1"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSubmitWork.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubmitWork.kt\ncom/zykj/evaluation/submit/SubmitWork$doWork$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n1#2:207\n*E\n"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:J

.field public e:J

.field public f:I

.field public g:I

.field public synthetic h:Ljava/lang/Object;

.field public final synthetic i:Lcom/zykj/evaluation/submit/SubmitWork;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/submit/SubmitWork;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->i:Lcom/zykj/evaluation/submit/SubmitWork;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance v0, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;

    iget-object v1, p0, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->i:Lcom/zykj/evaluation/submit/SubmitWork;

    invoke-direct {v0, v1, p2}, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;-><init>(Lcom/zykj/evaluation/submit/SubmitWork;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->h:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v3, p0

    .line 2
    .line 3
    iget-object v0, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->h:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v6, v0

    .line 6
    check-cast v6, Lkotlinx/coroutines/CoroutineScope;

    .line 7
    .line 8
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v7

    .line 12
    iget v0, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->g:I

    .line 13
    .line 14
    const/4 v9, 0x1

    .line 15
    const-string v10, "["

    .line 16
    .line 17
    const/4 v11, 0x0

    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw v0

    .line 29
    :pswitch_0
    iget-object v0, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->a:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Ljava/lang/Exception;

    .line 32
    .line 33
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_1
    iget-object v0, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->c:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Ljava/lang/Exception;

    .line 40
    .line 41
    iget-object v0, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Lkotlinx/coroutines/Job;

    .line 44
    .line 45
    iget-object v0, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->a:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 48
    .line 49
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    .line 52
    move-object/from16 v0, p1

    .line 53
    .line 54
    move-object v12, v3

    .line 55
    const/16 v20, 0x68

    .line 56
    .line 57
    goto/16 :goto_e

    .line 58
    .line 59
    :catch_0
    move-exception v0

    .line 60
    :goto_0
    const/16 v20, 0x68

    .line 61
    .line 62
    goto/16 :goto_12

    .line 63
    .line 64
    :pswitch_2
    iget v1, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->f:I

    .line 65
    .line 66
    iget-wide v4, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->e:J

    .line 67
    .line 68
    iget-wide v12, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->d:J

    .line 69
    .line 70
    iget-object v0, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->b:Ljava/lang/Object;

    .line 71
    .line 72
    move-object v2, v0

    .line 73
    check-cast v2, Lkotlinx/coroutines/Job;

    .line 74
    .line 75
    iget-object v0, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->a:Ljava/lang/Object;

    .line 76
    .line 77
    move-object v9, v0

    .line 78
    check-cast v9, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 79
    .line 80
    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 81
    .line 82
    .line 83
    move-object/from16 v0, p1

    .line 84
    .line 85
    move-wide v13, v12

    .line 86
    const/16 v20, 0x68

    .line 87
    .line 88
    move-object v12, v3

    .line 89
    goto/16 :goto_c

    .line 90
    .line 91
    :catch_1
    move-exception v0

    .line 92
    move-wide v13, v12

    .line 93
    const/16 v20, 0x68

    .line 94
    .line 95
    move-object v12, v3

    .line 96
    goto/16 :goto_d

    .line 97
    .line 98
    :pswitch_3
    iget v1, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->f:I

    .line 99
    .line 100
    iget-wide v4, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->e:J

    .line 101
    .line 102
    iget-wide v12, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->d:J

    .line 103
    .line 104
    iget-object v0, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->b:Ljava/lang/Object;

    .line 105
    .line 106
    move-object v2, v0

    .line 107
    check-cast v2, Lkotlinx/coroutines/Job;

    .line 108
    .line 109
    iget-object v0, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->a:Ljava/lang/Object;

    .line 110
    .line 111
    move-object v9, v0

    .line 112
    check-cast v9, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 113
    .line 114
    :try_start_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 115
    .line 116
    .line 117
    move-wide v13, v12

    .line 118
    const/16 v20, 0x68

    .line 119
    .line 120
    move-object v12, v3

    .line 121
    goto/16 :goto_b

    .line 122
    .line 123
    :pswitch_4
    iget v1, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->f:I

    .line 124
    .line 125
    iget-wide v4, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->e:J

    .line 126
    .line 127
    iget-wide v12, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->d:J

    .line 128
    .line 129
    iget-object v0, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->b:Ljava/lang/Object;

    .line 130
    .line 131
    move-object v2, v0

    .line 132
    check-cast v2, Lkotlinx/coroutines/Job;

    .line 133
    .line 134
    iget-object v0, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->a:Ljava/lang/Object;

    .line 135
    .line 136
    move-object v9, v0

    .line 137
    check-cast v9, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 138
    .line 139
    :try_start_3
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 140
    .line 141
    .line 142
    move-wide v13, v12

    .line 143
    const/16 v20, 0x68

    .line 144
    .line 145
    move-object v12, v3

    .line 146
    goto/16 :goto_a

    .line 147
    .line 148
    :pswitch_5
    iget v1, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->f:I

    .line 149
    .line 150
    iget-wide v4, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->e:J

    .line 151
    .line 152
    iget-wide v12, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->d:J

    .line 153
    .line 154
    iget-object v0, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->b:Ljava/lang/Object;

    .line 155
    .line 156
    move-object v2, v0

    .line 157
    check-cast v2, Lkotlinx/coroutines/Job;

    .line 158
    .line 159
    iget-object v0, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->a:Ljava/lang/Object;

    .line 160
    .line 161
    move-object v9, v0

    .line 162
    check-cast v9, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 163
    .line 164
    :try_start_4
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 165
    .line 166
    .line 167
    move-wide v13, v12

    .line 168
    const/16 v20, 0x68

    .line 169
    .line 170
    move-object v12, v3

    .line 171
    goto/16 :goto_9

    .line 172
    .line 173
    :pswitch_6
    iget-object v0, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->b:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v0, Lkotlinx/coroutines/Job;

    .line 176
    .line 177
    iget-object v0, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->a:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 180
    .line 181
    :try_start_5
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 182
    .line 183
    .line 184
    move-object/from16 v0, p1

    .line 185
    .line 186
    move-object v12, v3

    .line 187
    const/16 v20, 0x68

    .line 188
    .line 189
    goto/16 :goto_8

    .line 190
    .line 191
    :pswitch_7
    iget v0, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->f:I

    .line 192
    .line 193
    iget-wide v1, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->e:J

    .line 194
    .line 195
    iget-wide v4, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->d:J

    .line 196
    .line 197
    iget-object v12, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->b:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v12, Lkotlinx/coroutines/Job;

    .line 200
    .line 201
    iget-object v13, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->a:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v13, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 204
    .line 205
    :try_start_6
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    move-object/from16 v20, v12

    .line 209
    .line 210
    move-object v12, v3

    .line 211
    move-object v3, v13

    .line 212
    move-wide v13, v4

    .line 213
    move-wide v4, v1

    .line 214
    move-object/from16 v2, v20

    .line 215
    .line 216
    move v1, v0

    .line 217
    const/16 v20, 0x68

    .line 218
    .line 219
    goto/16 :goto_5

    .line 220
    .line 221
    :pswitch_8
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 222
    .line 223
    .line 224
    return-object p1

    .line 225
    :pswitch_9
    iget v0, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->f:I

    .line 226
    .line 227
    iget-wide v1, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->e:J

    .line 228
    .line 229
    iget-wide v4, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->d:J

    .line 230
    .line 231
    :try_start_7
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    .line 232
    .line 233
    .line 234
    move v14, v0

    .line 235
    move-object v12, v3

    .line 236
    move-wide v15, v4

    .line 237
    move-object/from16 v0, p1

    .line 238
    .line 239
    goto :goto_2

    .line 240
    :pswitch_a
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    :try_start_8
    iget-object v0, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->i:Lcom/zykj/evaluation/submit/SubmitWork;

    .line 244
    .line 245
    invoke-virtual {v0}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    const-string v1, "USER_ID"

    .line 250
    .line 251
    const-wide/16 v4, -0x1

    .line 252
    .line 253
    invoke-virtual {v0, v1, v4, v5}, Landroidx/work/Data;->getLong(Ljava/lang/String;J)J

    .line 254
    .line 255
    .line 256
    move-result-wide v1

    .line 257
    iget-object v0, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->i:Lcom/zykj/evaluation/submit/SubmitWork;

    .line 258
    .line 259
    invoke-virtual {v0}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    const-string v12, "TASK_ID"

    .line 264
    .line 265
    invoke-virtual {v0, v12, v4, v5}, Landroidx/work/Data;->getLong(Ljava/lang/String;J)J

    .line 266
    .line 267
    .line 268
    move-result-wide v12

    .line 269
    iget-object v0, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->i:Lcom/zykj/evaluation/submit/SubmitWork;

    .line 270
    .line 271
    invoke-virtual {v0}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    const-string v14, "TASK_STATE"

    .line 276
    .line 277
    const/4 v15, -0x1

    .line 278
    invoke-virtual {v0, v14, v15}, Landroidx/work/Data;->getInt(Ljava/lang/String;I)I

    .line 279
    .line 280
    .line 281
    move-result v14
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    .line 282
    cmp-long v0, v1, v4

    .line 283
    .line 284
    if-eqz v0, :cond_d

    .line 285
    .line 286
    cmp-long v0, v12, v4

    .line 287
    .line 288
    if-eqz v0, :cond_d

    .line 289
    .line 290
    :try_start_9
    iget-object v0, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->i:Lcom/zykj/evaluation/submit/SubmitWork;

    .line 291
    .line 292
    iput-object v6, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->h:Ljava/lang/Object;

    .line 293
    .line 294
    iput-wide v1, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->d:J

    .line 295
    .line 296
    iput-wide v12, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->e:J

    .line 297
    .line 298
    iput v14, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->f:I

    .line 299
    .line 300
    iput v9, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->g:I
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_a

    .line 301
    .line 302
    move-object v5, v3

    .line 303
    move-wide v3, v12

    .line 304
    :try_start_a
    invoke-static/range {v0 .. v5}, Lcom/zykj/evaluation/submit/SubmitWork;->c(Lcom/zykj/evaluation/submit/SubmitWork;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v0
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_9

    .line 308
    move-object v12, v5

    .line 309
    if-ne v0, v7, :cond_0

    .line 310
    .line 311
    :goto_1
    move-object v3, v12

    .line 312
    goto/16 :goto_13

    .line 313
    .line 314
    :cond_0
    move-wide v15, v1

    .line 315
    move-wide v1, v3

    .line 316
    :goto_2
    :try_start_b
    check-cast v0, Ln5/a;
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_4

    .line 317
    .line 318
    if-eqz v0, :cond_1

    .line 319
    .line 320
    :try_start_c
    iget-object v3, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->i:Lcom/zykj/evaluation/submit/SubmitWork;

    .line 321
    .line 322
    invoke-static {v3, v0}, Lcom/zykj/evaluation/submit/SubmitWork;->d(Lcom/zykj/evaluation/submit/SubmitWork;Ln5/a;)V

    .line 323
    .line 324
    .line 325
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_2

    .line 326
    .line 327
    goto :goto_3

    .line 328
    :catch_2
    move-exception v0

    .line 329
    move-object v3, v12

    .line 330
    goto/16 :goto_0

    .line 331
    .line 332
    :cond_1
    move-object v0, v11

    .line 333
    :goto_3
    if-eqz v0, :cond_2

    .line 334
    .line 335
    :try_start_d
    sget-object v0, Lcom/zykj/evaluation/bean/TaskState$ToDo;->INSTANCE:Lcom/zykj/evaluation/bean/TaskState$ToDo;

    .line 336
    .line 337
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskState;->getState()I

    .line 338
    .line 339
    .line 340
    move-result v0
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_4

    .line 341
    if-eq v14, v0, :cond_3

    .line 342
    .line 343
    :try_start_e
    sget-object v0, Lcom/zykj/evaluation/bean/TaskState$ToCorrect;->INSTANCE:Lcom/zykj/evaluation/bean/TaskState$ToCorrect;

    .line 344
    .line 345
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskState;->getState()I

    .line 346
    .line 347
    .line 348
    move-result v0

    .line 349
    if-eq v14, v0, :cond_3

    .line 350
    .line 351
    sget-object v0, Lcom/zykj/evaluation/bean/TaskState$Correcting;->INSTANCE:Lcom/zykj/evaluation/bean/TaskState$Correcting;

    .line 352
    .line 353
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskState;->getState()I

    .line 354
    .line 355
    .line 356
    move-result v0
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_2

    .line 357
    if-eq v14, v0, :cond_3

    .line 358
    .line 359
    :cond_2
    move-wide/from16 v17, v1

    .line 360
    .line 361
    move/from16 v19, v14

    .line 362
    .line 363
    const/16 v20, 0x68

    .line 364
    .line 365
    goto/16 :goto_10

    .line 366
    .line 367
    :cond_3
    :try_start_f
    new-instance v0, Ljava/lang/StringBuilder;

    .line 368
    .line 369
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 370
    .line 371
    .line 372
    const-string v3, "\u5f00\u59cb\u63d0\u4ea4\u8bd5\u5377 ---> taskId: "

    .line 373
    .line 374
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 392
    .line 393
    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 394
    .line 395
    .line 396
    sget-object v3, Lm5/e$c;->b:Lm5/e$c;

    .line 397
    .line 398
    iput-object v3, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 399
    .line 400
    new-instance v4, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2$job$1;

    .line 401
    .line 402
    move/from16 v19, v14

    .line 403
    .line 404
    iget-object v14, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->i:Lcom/zykj/evaluation/submit/SubmitWork;

    .line 405
    .line 406
    const/16 v21, 0x0

    .line 407
    .line 408
    move-object/from16 v20, v0

    .line 409
    .line 410
    move-wide/from16 v17, v1

    .line 411
    .line 412
    move-object v13, v4

    .line 413
    invoke-direct/range {v13 .. v21}, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2$job$1;-><init>(Lcom/zykj/evaluation/submit/SubmitWork;JJILkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_4

    .line 414
    .line 415
    .line 416
    const/4 v5, 0x3

    .line 417
    move-object v1, v6

    .line 418
    const/4 v6, 0x0

    .line 419
    const/4 v2, 0x0

    .line 420
    const/4 v3, 0x0

    .line 421
    :try_start_10
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 422
    .line 423
    .line 424
    move-result-object v0
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_8

    .line 425
    move-object v6, v1

    .line 426
    move-object v2, v0

    .line 427
    move-wide v13, v15

    .line 428
    move-wide/from16 v4, v17

    .line 429
    .line 430
    move/from16 v1, v19

    .line 431
    .line 432
    move-object/from16 v3, v20

    .line 433
    .line 434
    :goto_4
    :try_start_11
    iget-object v0, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 435
    .line 436
    sget-object v15, Lm5/e$c;->b:Lm5/e$c;

    .line 437
    .line 438
    invoke-static {v0, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    move-result v0

    .line 442
    if-eqz v0, :cond_5

    .line 443
    .line 444
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    iput-object v0, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->h:Ljava/lang/Object;

    .line 449
    .line 450
    iput-object v3, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->a:Ljava/lang/Object;

    .line 451
    .line 452
    iput-object v2, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->b:Ljava/lang/Object;

    .line 453
    .line 454
    iput-wide v13, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->d:J

    .line 455
    .line 456
    iput-wide v4, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->e:J

    .line 457
    .line 458
    iput v1, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->f:I

    .line 459
    .line 460
    const/4 v0, 0x3

    .line 461
    iput v0, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->g:I
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_4

    .line 462
    .line 463
    const/16 v20, 0x68

    .line 464
    .line 465
    const-wide/16 v8, 0x3e8

    .line 466
    .line 467
    :try_start_12
    invoke-static {v8, v9, v12}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v8

    .line 471
    if-ne v8, v7, :cond_4

    .line 472
    .line 473
    goto/16 :goto_1

    .line 474
    .line 475
    :cond_4
    :goto_5
    const/4 v9, 0x1

    .line 476
    goto :goto_4

    .line 477
    :catch_3
    move-exception v0

    .line 478
    :goto_6
    move-object v3, v12

    .line 479
    goto/16 :goto_12

    .line 480
    .line 481
    :catch_4
    move-exception v0

    .line 482
    :goto_7
    const/16 v20, 0x68

    .line 483
    .line 484
    goto :goto_6

    .line 485
    :cond_5
    move v0, v9

    .line 486
    const/16 v20, 0x68

    .line 487
    .line 488
    invoke-static {v2, v11, v0, v11}, Lkotlinx/coroutines/Job$DefaultImpls;->cancel$default(Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 489
    .line 490
    .line 491
    iget-object v0, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 492
    .line 493
    sget-object v8, Lm5/e$a;->b:Lm5/e$a;

    .line 494
    .line 495
    invoke-static {v0, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 496
    .line 497
    .line 498
    move-result v0

    .line 499
    if-eqz v0, :cond_7

    .line 500
    .line 501
    new-instance v0, Ljava/lang/StringBuilder;

    .line 502
    .line 503
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 504
    .line 505
    .line 506
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 507
    .line 508
    .line 509
    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 510
    .line 511
    .line 512
    const-string v8, "] \u8bd5\u5377\u63d0\u4ea4\u5931\u8d25\uff0c\u5b58\u5728\u672a\u6210\u529f\u63d0\u4ea4\u7684\u9898"

    .line 513
    .line 514
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 515
    .line 516
    .line 517
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 526
    .line 527
    .line 528
    iget-object v0, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->i:Lcom/zykj/evaluation/submit/SubmitWork;

    .line 529
    .line 530
    const/16 v8, 0x69

    .line 531
    .line 532
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 533
    .line 534
    .line 535
    move-result-object v8

    .line 536
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v9

    .line 540
    iput-object v9, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->h:Ljava/lang/Object;

    .line 541
    .line 542
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v3

    .line 546
    iput-object v3, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->a:Ljava/lang/Object;

    .line 547
    .line 548
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    move-result-object v2

    .line 552
    iput-object v2, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->b:Ljava/lang/Object;

    .line 553
    .line 554
    iput-wide v13, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->d:J

    .line 555
    .line 556
    iput-wide v4, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->e:J

    .line 557
    .line 558
    iput v1, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->f:I

    .line 559
    .line 560
    const/4 v1, 0x4

    .line 561
    iput v1, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->g:I
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_3

    .line 562
    .line 563
    const/4 v2, 0x0

    .line 564
    const/4 v4, 0x2

    .line 565
    const/4 v5, 0x0

    .line 566
    move-object v1, v8

    .line 567
    move-object v3, v12

    .line 568
    :try_start_13
    invoke-static/range {v0 .. v5}, Lcom/zykj/evaluation/submit/SubmitWork;->j(Lcom/zykj/evaluation/submit/SubmitWork;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    move-result-object v0
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_5

    .line 572
    if-ne v0, v7, :cond_6

    .line 573
    .line 574
    goto/16 :goto_1

    .line 575
    .line 576
    :cond_6
    :goto_8
    :try_start_14
    check-cast v0, Landroidx/work/ListenableWorker$Result;
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_3

    .line 577
    .line 578
    return-object v0

    .line 579
    :catch_5
    move-exception v0

    .line 580
    move-object v12, v3

    .line 581
    goto/16 :goto_12

    .line 582
    .line 583
    :cond_7
    :try_start_15
    iget-object v0, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->i:Lcom/zykj/evaluation/submit/SubmitWork;

    .line 584
    .line 585
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object v8

    .line 589
    iput-object v8, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->h:Ljava/lang/Object;

    .line 590
    .line 591
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    move-result-object v8

    .line 595
    iput-object v8, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->a:Ljava/lang/Object;

    .line 596
    .line 597
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 598
    .line 599
    .line 600
    move-result-object v8

    .line 601
    iput-object v8, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->b:Ljava/lang/Object;

    .line 602
    .line 603
    iput-wide v13, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->d:J

    .line 604
    .line 605
    iput-wide v4, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->e:J

    .line 606
    .line 607
    iput v1, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->f:I

    .line 608
    .line 609
    const/4 v8, 0x5

    .line 610
    iput v8, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->g:I

    .line 611
    .line 612
    invoke-virtual {v0, v12}, Lcom/zykj/evaluation/submit/SubmitWork;->m(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    move-result-object v0
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_7

    .line 616
    if-ne v0, v7, :cond_8

    .line 617
    .line 618
    goto/16 :goto_1

    .line 619
    .line 620
    :cond_8
    move-object v9, v3

    .line 621
    :goto_9
    :try_start_16
    iget-object v0, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->i:Lcom/zykj/evaluation/submit/SubmitWork;

    .line 622
    .line 623
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    move-result-object v3

    .line 627
    iput-object v3, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->h:Ljava/lang/Object;

    .line 628
    .line 629
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    move-result-object v3

    .line 633
    iput-object v3, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->a:Ljava/lang/Object;

    .line 634
    .line 635
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v3

    .line 639
    iput-object v3, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->b:Ljava/lang/Object;

    .line 640
    .line 641
    iput-wide v13, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->d:J

    .line 642
    .line 643
    iput-wide v4, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->e:J

    .line 644
    .line 645
    iput v1, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->f:I

    .line 646
    .line 647
    const/4 v3, 0x6

    .line 648
    iput v3, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->g:I

    .line 649
    .line 650
    invoke-virtual {v0, v12}, Lcom/zykj/evaluation/submit/SubmitWork;->f(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 651
    .line 652
    .line 653
    move-result-object v0

    .line 654
    if-ne v0, v7, :cond_9

    .line 655
    .line 656
    goto/16 :goto_1

    .line 657
    .line 658
    :cond_9
    :goto_a
    iget-object v0, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->i:Lcom/zykj/evaluation/submit/SubmitWork;

    .line 659
    .line 660
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 661
    .line 662
    .line 663
    move-result-object v3

    .line 664
    iput-object v3, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->h:Ljava/lang/Object;

    .line 665
    .line 666
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 667
    .line 668
    .line 669
    move-result-object v3

    .line 670
    iput-object v3, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->a:Ljava/lang/Object;

    .line 671
    .line 672
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    move-result-object v3

    .line 676
    iput-object v3, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->b:Ljava/lang/Object;

    .line 677
    .line 678
    iput-wide v13, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->d:J

    .line 679
    .line 680
    iput-wide v4, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->e:J

    .line 681
    .line 682
    iput v1, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->f:I

    .line 683
    .line 684
    const/4 v3, 0x7

    .line 685
    iput v3, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->g:I

    .line 686
    .line 687
    invoke-virtual {v0, v12}, Lcom/zykj/evaluation/submit/SubmitWork;->g(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 688
    .line 689
    .line 690
    move-result-object v0

    .line 691
    if-ne v0, v7, :cond_a

    .line 692
    .line 693
    goto/16 :goto_1

    .line 694
    .line 695
    :cond_a
    :goto_b
    new-instance v0, Ljava/lang/StringBuilder;

    .line 696
    .line 697
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 698
    .line 699
    .line 700
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 701
    .line 702
    .line 703
    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 704
    .line 705
    .line 706
    const-string v3, "] \u8bd5\u5377\u63d0\u4ea4\u6210\u529f"

    .line 707
    .line 708
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 709
    .line 710
    .line 711
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 712
    .line 713
    .line 714
    move-result-object v0

    .line 715
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    move-result-object v0

    .line 719
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 720
    .line 721
    .line 722
    iget-object v0, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->i:Lcom/zykj/evaluation/submit/SubmitWork;

    .line 723
    .line 724
    invoke-static {v4, v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    .line 725
    .line 726
    .line 727
    move-result-object v3

    .line 728
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 729
    .line 730
    .line 731
    move-result-object v8

    .line 732
    iput-object v8, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->h:Ljava/lang/Object;

    .line 733
    .line 734
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 735
    .line 736
    .line 737
    move-result-object v8

    .line 738
    iput-object v8, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->a:Ljava/lang/Object;

    .line 739
    .line 740
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 741
    .line 742
    .line 743
    move-result-object v8

    .line 744
    iput-object v8, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->b:Ljava/lang/Object;

    .line 745
    .line 746
    iput-wide v13, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->d:J

    .line 747
    .line 748
    iput-wide v4, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->e:J

    .line 749
    .line 750
    iput v1, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->f:I

    .line 751
    .line 752
    const/16 v8, 0x8

    .line 753
    .line 754
    iput v8, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->g:I

    .line 755
    .line 756
    invoke-static {v0, v3, v12}, Lcom/zykj/evaluation/submit/SubmitWork;->e(Lcom/zykj/evaluation/submit/SubmitWork;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 757
    .line 758
    .line 759
    move-result-object v0

    .line 760
    if-ne v0, v7, :cond_b

    .line 761
    .line 762
    goto/16 :goto_1

    .line 763
    .line 764
    :cond_b
    :goto_c
    check-cast v0, Landroidx/work/ListenableWorker$Result;
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_6

    .line 765
    .line 766
    goto :goto_f

    .line 767
    :catch_6
    move-exception v0

    .line 768
    goto :goto_d

    .line 769
    :catch_7
    move-exception v0

    .line 770
    move-object v9, v3

    .line 771
    :goto_d
    :try_start_17
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 772
    .line 773
    .line 774
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 775
    .line 776
    .line 777
    move-result-object v3

    .line 778
    new-instance v8, Ljava/lang/StringBuilder;

    .line 779
    .line 780
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 781
    .line 782
    .line 783
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 784
    .line 785
    .line 786
    invoke-virtual {v8, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 787
    .line 788
    .line 789
    const-string v10, "] \u8bd5\u5377\u63d0\u4ea4\u5931\u8d25 ---> error:"

    .line 790
    .line 791
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 792
    .line 793
    .line 794
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 795
    .line 796
    .line 797
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 798
    .line 799
    .line 800
    move-result-object v3

    .line 801
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 802
    .line 803
    .line 804
    move-result-object v3

    .line 805
    invoke-static {v3}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 806
    .line 807
    .line 808
    invoke-static {v0}, Lcom/tencent/bugly/crashreport/CrashReport;->postCatchedException(Ljava/lang/Throwable;)V

    .line 809
    .line 810
    .line 811
    iget-object v3, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->i:Lcom/zykj/evaluation/submit/SubmitWork;

    .line 812
    .line 813
    invoke-static/range {v20 .. v20}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 814
    .line 815
    .line 816
    move-result-object v8

    .line 817
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 818
    .line 819
    .line 820
    move-result-object v10

    .line 821
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 822
    .line 823
    .line 824
    move-result-object v15

    .line 825
    iput-object v15, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->h:Ljava/lang/Object;

    .line 826
    .line 827
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 828
    .line 829
    .line 830
    move-result-object v9

    .line 831
    iput-object v9, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->a:Ljava/lang/Object;

    .line 832
    .line 833
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 834
    .line 835
    .line 836
    move-result-object v2

    .line 837
    iput-object v2, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->b:Ljava/lang/Object;

    .line 838
    .line 839
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 840
    .line 841
    .line 842
    move-result-object v0

    .line 843
    iput-object v0, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->c:Ljava/lang/Object;

    .line 844
    .line 845
    iput-wide v13, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->d:J

    .line 846
    .line 847
    iput-wide v4, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->e:J

    .line 848
    .line 849
    iput v1, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->f:I

    .line 850
    .line 851
    const/16 v0, 0x9

    .line 852
    .line 853
    iput v0, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->g:I

    .line 854
    .line 855
    invoke-static {v3, v8, v10, v12}, Lcom/zykj/evaluation/submit/SubmitWork;->b(Lcom/zykj/evaluation/submit/SubmitWork;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 856
    .line 857
    .line 858
    move-result-object v0

    .line 859
    if-ne v0, v7, :cond_c

    .line 860
    .line 861
    goto/16 :goto_1

    .line 862
    .line 863
    :cond_c
    :goto_e
    check-cast v0, Landroidx/work/ListenableWorker$Result;

    .line 864
    .line 865
    :goto_f
    return-object v0

    .line 866
    :catch_8
    move-exception v0

    .line 867
    move-object v6, v1

    .line 868
    goto/16 :goto_7

    .line 869
    .line 870
    :goto_10
    move-wide v1, v15

    .line 871
    move-wide/from16 v3, v17

    .line 872
    .line 873
    move/from16 v14, v19

    .line 874
    .line 875
    goto :goto_11

    .line 876
    :catch_9
    move-exception v0

    .line 877
    move-object v12, v5

    .line 878
    goto/16 :goto_7

    .line 879
    .line 880
    :catch_a
    move-exception v0

    .line 881
    move-object v12, v3

    .line 882
    goto/16 :goto_0

    .line 883
    .line 884
    :cond_d
    move-wide/from16 v22, v12

    .line 885
    .line 886
    move-object v12, v3

    .line 887
    move-wide/from16 v3, v22

    .line 888
    .line 889
    const/16 v20, 0x68

    .line 890
    .line 891
    :goto_11
    iget-object v0, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->i:Lcom/zykj/evaluation/submit/SubmitWork;

    .line 892
    .line 893
    const/16 v5, 0x64

    .line 894
    .line 895
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 896
    .line 897
    .line 898
    move-result-object v5

    .line 899
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 900
    .line 901
    .line 902
    move-result-object v8

    .line 903
    iput-object v8, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->h:Ljava/lang/Object;

    .line 904
    .line 905
    iput-wide v1, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->d:J

    .line 906
    .line 907
    iput-wide v3, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->e:J

    .line 908
    .line 909
    iput v14, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->f:I

    .line 910
    .line 911
    const/4 v1, 0x2

    .line 912
    iput v1, v12, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->g:I
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_3

    .line 913
    .line 914
    const/4 v2, 0x0

    .line 915
    const/4 v4, 0x2

    .line 916
    move-object v1, v5

    .line 917
    const/4 v5, 0x0

    .line 918
    move-object v3, v12

    .line 919
    :try_start_18
    invoke-static/range {v0 .. v5}, Lcom/zykj/evaluation/submit/SubmitWork;->j(Lcom/zykj/evaluation/submit/SubmitWork;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 920
    .line 921
    .line 922
    move-result-object v0
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_b

    .line 923
    if-ne v0, v7, :cond_e

    .line 924
    .line 925
    goto :goto_13

    .line 926
    :cond_e
    return-object v0

    .line 927
    :catch_b
    move-exception v0

    .line 928
    :goto_12
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 929
    .line 930
    .line 931
    invoke-static {v0}, Lcom/tencent/bugly/crashreport/CrashReport;->postCatchedException(Ljava/lang/Throwable;)V

    .line 932
    .line 933
    .line 934
    iget-object v1, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->i:Lcom/zykj/evaluation/submit/SubmitWork;

    .line 935
    .line 936
    invoke-static/range {v20 .. v20}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 937
    .line 938
    .line 939
    move-result-object v2

    .line 940
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 941
    .line 942
    .line 943
    move-result-object v4

    .line 944
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 945
    .line 946
    .line 947
    move-result-object v5

    .line 948
    iput-object v5, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->h:Ljava/lang/Object;

    .line 949
    .line 950
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 951
    .line 952
    .line 953
    move-result-object v0

    .line 954
    iput-object v0, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->a:Ljava/lang/Object;

    .line 955
    .line 956
    iput-object v11, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->b:Ljava/lang/Object;

    .line 957
    .line 958
    iput-object v11, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->c:Ljava/lang/Object;

    .line 959
    .line 960
    const/16 v0, 0xa

    .line 961
    .line 962
    iput v0, v3, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;->g:I

    .line 963
    .line 964
    invoke-static {v1, v2, v4, v3}, Lcom/zykj/evaluation/submit/SubmitWork;->b(Lcom/zykj/evaluation/submit/SubmitWork;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 965
    .line 966
    .line 967
    move-result-object v0

    .line 968
    if-ne v0, v7, :cond_f

    .line 969
    .line 970
    :goto_13
    return-object v7

    .line 971
    :cond_f
    return-object v0

    .line 972
    nop

    .line 973
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
