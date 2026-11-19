# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class final Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->v()V
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
    c = "com.zykj.huiwei.launcher.viewmodels.LoginViewModel$login$1"
    f = "LoginViewModel.kt"
    i = {
        0x1,
        0x2,
        0x3,
        0x4,
        0x4,
        0x4,
        0x5,
        0x5,
        0x5,
        0x5,
        0x6,
        0x6,
        0x6,
        0x6,
        0x7,
        0x7,
        0x7,
        0x7,
        0x7,
        0x8,
        0x8,
        0x8,
        0x8
    }
    l = {
        0xa7,
        0xaa,
        0xab,
        0xbd,
        0xd1,
        0xd7,
        0xd8,
        0xe8,
        0xef
    }
    m = "invokeSuspend"
    n = {
        "e",
        "e",
        "loginUrlResp",
        "loginUrlResp",
        "deviceId",
        "loginReq",
        "loginUrlResp",
        "deviceId",
        "loginReq",
        "e",
        "loginUrlResp",
        "deviceId",
        "loginReq",
        "e",
        "loginUrlResp",
        "deviceId",
        "loginReq",
        "loginResp",
        "level",
        "loginUrlResp",
        "deviceId",
        "loginReq",
        "loginResp"
    }
    s = {
        "L$0",
        "L$0",
        "L$0",
        "L$0",
        "L$1",
        "L$2",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "I$0",
        "L$0",
        "L$1",
        "L$2",
        "L$3"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLoginViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,518:1\n56#2:519\n59#2:523\n46#3:520\n51#3:522\n105#4:521\n*S KotlinDebug\n*F\n+ 1 LoginViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1\n*L\n182#1:519\n182#1:523\n182#1:520\n182#1:522\n182#1:521\n*E\n"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:I

.field public f:I

.field public final synthetic g:Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->g:Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1

    new-instance p1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;

    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->g:Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    invoke-direct {p1, v0, p2}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;-><init>(Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    iget v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->f:I

    .line 8
    .line 9
    const-wide/16 v3, 0x1f4

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x1

    .line 13
    const/4 v7, 0x0

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v0

    .line 25
    :pswitch_0
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->d:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;

    .line 28
    .line 29
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Lcom/zykj/huiwei/launcher/bean/req/LoginReq;

    .line 32
    .line 33
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Ljava/lang/String;

    .line 36
    .line 37
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->a:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;

    .line 40
    .line 41
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    .line 43
    .line 44
    goto/16 :goto_f

    .line 45
    .line 46
    :catch_0
    move-exception v0

    .line 47
    goto/16 :goto_e

    .line 48
    .line 49
    :pswitch_1
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->d:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;

    .line 52
    .line 53
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->c:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Lcom/zykj/huiwei/launcher/bean/req/LoginReq;

    .line 56
    .line 57
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, Ljava/lang/String;

    .line 60
    .line 61
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->a:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;

    .line 64
    .line 65
    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 66
    .line 67
    .line 68
    goto/16 :goto_c

    .line 69
    .line 70
    :pswitch_2
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->d:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, Ljava/lang/Exception;

    .line 73
    .line 74
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->c:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, Lcom/zykj/huiwei/launcher/bean/req/LoginReq;

    .line 77
    .line 78
    iget-object v3, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->b:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v3, Ljava/lang/String;

    .line 81
    .line 82
    iget-object v4, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->a:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v4, Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;

    .line 85
    .line 86
    :try_start_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 87
    .line 88
    .line 89
    move-object v6, v4

    .line 90
    move-object v4, v3

    .line 91
    move-object/from16 v3, p1

    .line 92
    .line 93
    goto/16 :goto_a

    .line 94
    .line 95
    :pswitch_3
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->d:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v0, Ljava/lang/Exception;

    .line 98
    .line 99
    iget-object v3, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->c:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v3, Lcom/zykj/huiwei/launcher/bean/req/LoginReq;

    .line 102
    .line 103
    iget-object v4, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->b:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v4, Ljava/lang/String;

    .line 106
    .line 107
    iget-object v6, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->a:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v6, Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;

    .line 110
    .line 111
    :try_start_3
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 112
    .line 113
    .line 114
    move-object/from16 v20, v3

    .line 115
    .line 116
    move-object v3, v0

    .line 117
    move-object/from16 v0, v20

    .line 118
    .line 119
    goto/16 :goto_9

    .line 120
    .line 121
    :pswitch_4
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->c:Ljava/lang/Object;

    .line 122
    .line 123
    move-object v6, v0

    .line 124
    check-cast v6, Lcom/zykj/huiwei/launcher/bean/req/LoginReq;

    .line 125
    .line 126
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->b:Ljava/lang/Object;

    .line 127
    .line 128
    move-object v7, v0

    .line 129
    check-cast v7, Ljava/lang/String;

    .line 130
    .line 131
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->a:Ljava/lang/Object;

    .line 132
    .line 133
    move-object v8, v0

    .line 134
    check-cast v8, Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;

    .line 135
    .line 136
    :try_start_4
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 137
    .line 138
    .line 139
    move-object/from16 v0, p1

    .line 140
    .line 141
    goto/16 :goto_7

    .line 142
    .line 143
    :catch_1
    move-exception v0

    .line 144
    goto/16 :goto_8

    .line 145
    .line 146
    :pswitch_5
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->a:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v0, Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;

    .line 149
    .line 150
    :try_start_5
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 151
    .line 152
    .line 153
    move-object/from16 v8, p1

    .line 154
    .line 155
    :cond_0
    move-object v9, v0

    .line 156
    goto/16 :goto_5

    .line 157
    .line 158
    :pswitch_6
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->a:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v0, Ljava/lang/Exception;

    .line 161
    .line 162
    :try_start_6
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 163
    .line 164
    .line 165
    move-object/from16 v0, p1

    .line 166
    .line 167
    goto/16 :goto_3

    .line 168
    .line 169
    :pswitch_7
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->a:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v0, Ljava/lang/Exception;

    .line 172
    .line 173
    :try_start_7
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    .line 174
    .line 175
    .line 176
    goto/16 :goto_2

    .line 177
    .line 178
    :pswitch_8
    :try_start_8
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2

    .line 179
    .line 180
    .line 181
    move-object/from16 v0, p1

    .line 182
    .line 183
    goto/16 :goto_0

    .line 184
    .line 185
    :catch_2
    move-exception v0

    .line 186
    goto/16 :goto_1

    .line 187
    .line 188
    :pswitch_9
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->g:Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 192
    .line 193
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->k()Landroidx/lifecycle/MutableLiveData;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    check-cast v0, Ljava/lang/CharSequence;

    .line 202
    .line 203
    if-eqz v0, :cond_15

    .line 204
    .line 205
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    if-nez v0, :cond_1

    .line 210
    .line 211
    goto/16 :goto_12

    .line 212
    .line 213
    :cond_1
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->g:Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 214
    .line 215
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->r()Landroidx/lifecycle/MutableLiveData;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    check-cast v0, Ljava/lang/CharSequence;

    .line 224
    .line 225
    if-eqz v0, :cond_14

    .line 226
    .line 227
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    if-nez v0, :cond_2

    .line 232
    .line 233
    goto/16 :goto_11

    .line 234
    .line 235
    :cond_2
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->g:Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 236
    .line 237
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->j()Landroidx/lifecycle/MutableLiveData;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    check-cast v0, Ljava/lang/CharSequence;

    .line 246
    .line 247
    if-eqz v0, :cond_13

    .line 248
    .line 249
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 250
    .line 251
    .line 252
    move-result v0

    .line 253
    if-nez v0, :cond_3

    .line 254
    .line 255
    goto/16 :goto_10

    .line 256
    .line 257
    :cond_3
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->g:Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 258
    .line 259
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->u()Landroidx/lifecycle/MutableLiveData;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 268
    .line 269
    .line 270
    move-result-object v8

    .line 271
    invoke-static {v0, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    if-nez v0, :cond_4

    .line 276
    .line 277
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->g:Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 278
    .line 279
    invoke-virtual {v0}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    new-instance v2, Lcom/zykj/base/bean/toast/ToastWarnMessage;

    .line 284
    .line 285
    const v3, 0x7f11016a

    .line 286
    .line 287
    .line 288
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 289
    .line 290
    .line 291
    move-result-object v3

    .line 292
    invoke-direct {v2, v7, v3, v6, v7}, Lcom/zykj/base/bean/toast/ToastWarnMessage;-><init>(Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v0, v2}, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;->setValue(Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 299
    .line 300
    return-object v0

    .line 301
    :cond_4
    :try_start_9
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->g:Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 302
    .line 303
    invoke-virtual {v0}, Lcom/zykj/base/BaseViewModel;->isDialogVisible()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 308
    .line 309
    .line 310
    move-result-object v8

    .line 311
    invoke-virtual {v0, v8}, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;->setValue(Ljava/lang/Object;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0

    .line 312
    .line 313
    .line 314
    :try_start_a
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->g:Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 315
    .line 316
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->k()Landroidx/lifecycle/MutableLiveData;

    .line 317
    .line 318
    .line 319
    move-result-object v8

    .line 320
    invoke-virtual {v8}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v8

    .line 324
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    check-cast v8, Ljava/lang/String;

    .line 328
    .line 329
    iput v6, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->f:I

    .line 330
    .line 331
    invoke-static {v0, v8, v1}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->a(Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    if-ne v0, v2, :cond_5

    .line 336
    .line 337
    goto/16 :goto_d

    .line 338
    .line 339
    :cond_5
    :goto_0
    check-cast v0, Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_2

    .line 340
    .line 341
    goto :goto_4

    .line 342
    :goto_1
    :try_start_b
    instance-of v8, v0, Ljava/net/ConnectException;

    .line 343
    .line 344
    if-eqz v8, :cond_11

    .line 345
    .line 346
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v8

    .line 350
    iput-object v8, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->a:Ljava/lang/Object;

    .line 351
    .line 352
    const/4 v8, 0x2

    .line 353
    iput v8, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->f:I

    .line 354
    .line 355
    invoke-static {v3, v4, v1}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v8

    .line 359
    if-ne v8, v2, :cond_6

    .line 360
    .line 361
    goto/16 :goto_d

    .line 362
    .line 363
    :cond_6
    :goto_2
    iget-object v8, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->g:Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 364
    .line 365
    invoke-virtual {v8}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->k()Landroidx/lifecycle/MutableLiveData;

    .line 366
    .line 367
    .line 368
    move-result-object v9

    .line 369
    invoke-virtual {v9}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v9

    .line 373
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    check-cast v9, Ljava/lang/String;

    .line 377
    .line 378
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    iput-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->a:Ljava/lang/Object;

    .line 383
    .line 384
    const/4 v0, 0x3

    .line 385
    iput v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->f:I

    .line 386
    .line 387
    invoke-static {v8, v9, v1}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->a(Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    if-ne v0, v2, :cond_7

    .line 392
    .line 393
    goto/16 :goto_d

    .line 394
    .line 395
    :cond_7
    :goto_3
    check-cast v0, Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;

    .line 396
    .line 397
    :goto_4
    iget-object v8, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->g:Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 398
    .line 399
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;->getLcid()Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v9

    .line 403
    invoke-virtual {v8, v9}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->x(Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    iget-object v8, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->g:Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 407
    .line 408
    invoke-static {v8}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->b(Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;)Landroid/app/Application;

    .line 409
    .line 410
    .line 411
    move-result-object v8

    .line 412
    invoke-static {v8}, Lcom/zykj/huiwei/launcher/ext/CommonExtKt;->d(Landroid/content/Context;)Landroidx/datastore/core/DataStore;

    .line 413
    .line 414
    .line 415
    move-result-object v8

    .line 416
    invoke-interface {v8}, Landroidx/datastore/core/DataStore;->getData()Lkotlinx/coroutines/flow/Flow;

    .line 417
    .line 418
    .line 419
    move-result-object v8

    .line 420
    new-instance v9, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1$invokeSuspend$$inlined$mapNotNull$1;

    .line 421
    .line 422
    invoke-direct {v9, v8}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1$invokeSuspend$$inlined$mapNotNull$1;-><init>(Lkotlinx/coroutines/flow/Flow;)V

    .line 423
    .line 424
    .line 425
    iput-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->a:Ljava/lang/Object;

    .line 426
    .line 427
    const/4 v8, 0x4

    .line 428
    iput v8, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->f:I

    .line 429
    .line 430
    invoke-static {v9, v1}, Lkotlinx/coroutines/flow/FlowKt;->first(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v8

    .line 434
    if-ne v8, v2, :cond_0

    .line 435
    .line 436
    goto/16 :goto_d

    .line 437
    .line 438
    :goto_5
    check-cast v8, Ljava/lang/String;

    .line 439
    .line 440
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    .line 441
    .line 442
    .line 443
    move-result v0

    .line 444
    if-nez v0, :cond_8

    .line 445
    .line 446
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->g:Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 447
    .line 448
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->t()Landroidx/lifecycle/MutableLiveData;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 453
    .line 454
    .line 455
    move-result-object v2

    .line 456
    invoke-virtual {v0, v2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 457
    .line 458
    .line 459
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->g:Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 460
    .line 461
    invoke-virtual {v0}, Lcom/zykj/base/BaseViewModel;->isDialogVisible()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 466
    .line 467
    .line 468
    move-result-object v2

    .line 469
    invoke-virtual {v0, v2}, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;->setValue(Ljava/lang/Object;)V

    .line 470
    .line 471
    .line 472
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->g:Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 473
    .line 474
    invoke-virtual {v0}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    new-instance v2, Lcom/zykj/base/bean/toast/ToastWarnMessage;

    .line 479
    .line 480
    const v3, 0x7f11018d

    .line 481
    .line 482
    .line 483
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 484
    .line 485
    .line 486
    move-result-object v3

    .line 487
    invoke-direct {v2, v7, v3, v6, v7}, Lcom/zykj/base/bean/toast/ToastWarnMessage;-><init>(Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 488
    .line 489
    .line 490
    invoke-virtual {v0, v2}, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;->setValue(Ljava/lang/Object;)V

    .line 491
    .line 492
    .line 493
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 494
    .line 495
    return-object v0

    .line 496
    :cond_8
    new-instance v10, Lcom/zykj/huiwei/launcher/bean/req/LoginReq;

    .line 497
    .line 498
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->g:Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 499
    .line 500
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->k()Landroidx/lifecycle/MutableLiveData;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 509
    .line 510
    .line 511
    move-object v11, v0

    .line 512
    check-cast v11, Ljava/lang/String;

    .line 513
    .line 514
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->g:Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 515
    .line 516
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->r()Landroidx/lifecycle/MutableLiveData;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 525
    .line 526
    .line 527
    move-object v12, v0

    .line 528
    check-cast v12, Ljava/lang/String;

    .line 529
    .line 530
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->g:Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 531
    .line 532
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->j()Landroidx/lifecycle/MutableLiveData;

    .line 533
    .line 534
    .line 535
    move-result-object v0

    .line 536
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 541
    .line 542
    .line 543
    move-object v13, v0

    .line 544
    check-cast v13, Ljava/lang/String;

    .line 545
    .line 546
    sget-object v0, Li4/g;->a:Li4/g$a;

    .line 547
    .line 548
    invoke-virtual {v0}, Li4/g$a;->g()Z

    .line 549
    .line 550
    .line 551
    move-result v0

    .line 552
    if-eqz v0, :cond_9

    .line 553
    .line 554
    move-object v14, v8

    .line 555
    goto :goto_6

    .line 556
    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 557
    .line 558
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 559
    .line 560
    .line 561
    const-string v6, "hw_"

    .line 562
    .line 563
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 564
    .line 565
    .line 566
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 567
    .line 568
    .line 569
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    move-object v14, v0

    .line 574
    :goto_6
    const/16 v18, 0x70

    .line 575
    .line 576
    const/16 v19, 0x0

    .line 577
    .line 578
    const/4 v15, 0x0

    .line 579
    const/16 v16, 0x0

    .line 580
    .line 581
    const/16 v17, 0x0

    .line 582
    .line 583
    invoke-direct/range {v10 .. v19}, Lcom/zykj/huiwei/launcher/bean/req/LoginReq;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_0

    .line 584
    .line 585
    .line 586
    :try_start_c
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->g:Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 587
    .line 588
    iput-object v9, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->a:Ljava/lang/Object;

    .line 589
    .line 590
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v6

    .line 594
    iput-object v6, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->b:Ljava/lang/Object;

    .line 595
    .line 596
    iput-object v10, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->c:Ljava/lang/Object;

    .line 597
    .line 598
    const/4 v6, 0x5

    .line 599
    iput v6, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->f:I

    .line 600
    .line 601
    invoke-static {v0, v9, v10, v1}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->c(Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;Lcom/zykj/huiwei/launcher/bean/req/LoginReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    move-result-object v0
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_3

    .line 605
    if-ne v0, v2, :cond_a

    .line 606
    .line 607
    goto/16 :goto_d

    .line 608
    .line 609
    :cond_a
    move-object v7, v8

    .line 610
    move-object v8, v9

    .line 611
    move-object v6, v10

    .line 612
    :goto_7
    :try_start_d
    check-cast v0, Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_1

    .line 613
    .line 614
    move-object v11, v0

    .line 615
    move-object v9, v6

    .line 616
    move-object v4, v7

    .line 617
    move-object v10, v8

    .line 618
    goto :goto_b

    .line 619
    :catch_3
    move-exception v0

    .line 620
    move-object v7, v8

    .line 621
    move-object v8, v9

    .line 622
    move-object v6, v10

    .line 623
    :goto_8
    :try_start_e
    instance-of v9, v0, Ljava/net/ConnectException;

    .line 624
    .line 625
    if-eqz v9, :cond_10

    .line 626
    .line 627
    iput-object v8, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->a:Ljava/lang/Object;

    .line 628
    .line 629
    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    move-result-object v9

    .line 633
    iput-object v9, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->b:Ljava/lang/Object;

    .line 634
    .line 635
    iput-object v6, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->c:Ljava/lang/Object;

    .line 636
    .line 637
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 638
    .line 639
    .line 640
    move-result-object v9

    .line 641
    iput-object v9, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->d:Ljava/lang/Object;

    .line 642
    .line 643
    const/4 v9, 0x6

    .line 644
    iput v9, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->f:I

    .line 645
    .line 646
    invoke-static {v3, v4, v1}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 647
    .line 648
    .line 649
    move-result-object v3

    .line 650
    if-ne v3, v2, :cond_b

    .line 651
    .line 652
    goto/16 :goto_d

    .line 653
    .line 654
    :cond_b
    move-object v3, v0

    .line 655
    move-object v0, v6

    .line 656
    move-object v4, v7

    .line 657
    move-object v6, v8

    .line 658
    :goto_9
    iget-object v7, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->g:Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 659
    .line 660
    iput-object v6, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->a:Ljava/lang/Object;

    .line 661
    .line 662
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 663
    .line 664
    .line 665
    move-result-object v8

    .line 666
    iput-object v8, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->b:Ljava/lang/Object;

    .line 667
    .line 668
    iput-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->c:Ljava/lang/Object;

    .line 669
    .line 670
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 671
    .line 672
    .line 673
    move-result-object v3

    .line 674
    iput-object v3, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->d:Ljava/lang/Object;

    .line 675
    .line 676
    const/4 v3, 0x7

    .line 677
    iput v3, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->f:I

    .line 678
    .line 679
    invoke-static {v7, v6, v0, v1}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->c(Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;Lcom/zykj/huiwei/launcher/bean/req/LoginReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 680
    .line 681
    .line 682
    move-result-object v3

    .line 683
    if-ne v3, v2, :cond_c

    .line 684
    .line 685
    goto/16 :goto_d

    .line 686
    .line 687
    :cond_c
    :goto_a
    check-cast v3, Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;

    .line 688
    .line 689
    move-object v9, v0

    .line 690
    move-object v11, v3

    .line 691
    move-object v10, v6

    .line 692
    :goto_b
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->g:Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 693
    .line 694
    invoke-virtual {v10}, Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;->getServer()Ljava/lang/String;

    .line 695
    .line 696
    .line 697
    move-result-object v3

    .line 698
    invoke-virtual {v11}, Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;->getAccessToken()Ljava/lang/String;

    .line 699
    .line 700
    .line 701
    move-result-object v6

    .line 702
    invoke-virtual {v0, v3, v6}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 703
    .line 704
    .line 705
    invoke-virtual {v11}, Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;->getNeedChangePwd()Z

    .line 706
    .line 707
    .line 708
    move-result v0

    .line 709
    if-eqz v0, :cond_e

    .line 710
    .line 711
    invoke-virtual {v11}, Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;->getPasswordLevel()I

    .line 712
    .line 713
    .line 714
    move-result v0

    .line 715
    iget-object v3, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->g:Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 716
    .line 717
    invoke-static {v3}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->e(Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 718
    .line 719
    .line 720
    move-result-object v3

    .line 721
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 722
    .line 723
    .line 724
    move-result-object v6

    .line 725
    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 726
    .line 727
    .line 728
    move-result-object v7

    .line 729
    iput-object v7, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->a:Ljava/lang/Object;

    .line 730
    .line 731
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 732
    .line 733
    .line 734
    move-result-object v4

    .line 735
    iput-object v4, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->b:Ljava/lang/Object;

    .line 736
    .line 737
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 738
    .line 739
    .line 740
    move-result-object v4

    .line 741
    iput-object v4, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->c:Ljava/lang/Object;

    .line 742
    .line 743
    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 744
    .line 745
    .line 746
    move-result-object v4

    .line 747
    iput-object v4, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->d:Ljava/lang/Object;

    .line 748
    .line 749
    iput v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->e:I

    .line 750
    .line 751
    const/16 v0, 0x8

    .line 752
    .line 753
    iput v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->f:I

    .line 754
    .line 755
    invoke-interface {v3, v6, v1}, Lkotlinx/coroutines/flow/MutableSharedFlow;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 756
    .line 757
    .line 758
    move-result-object v0

    .line 759
    if-ne v0, v2, :cond_d

    .line 760
    .line 761
    goto :goto_d

    .line 762
    :cond_d
    :goto_c
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->g:Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 763
    .line 764
    invoke-virtual {v0}, Lcom/zykj/base/BaseViewModel;->isDialogVisible()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 765
    .line 766
    .line 767
    move-result-object v0

    .line 768
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 769
    .line 770
    .line 771
    move-result-object v2

    .line 772
    invoke-virtual {v0, v2}, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;->setValue(Ljava/lang/Object;)V

    .line 773
    .line 774
    .line 775
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 776
    .line 777
    return-object v0

    .line 778
    :cond_e
    invoke-virtual {v11}, Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;->getAccessToken()Ljava/lang/String;

    .line 779
    .line 780
    .line 781
    move-result-object v0

    .line 782
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 783
    .line 784
    .line 785
    move-result v0

    .line 786
    if-lez v0, :cond_f

    .line 787
    .line 788
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 789
    .line 790
    .line 791
    move-result-object v0

    .line 792
    new-instance v7, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1$1;

    .line 793
    .line 794
    iget-object v8, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->g:Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 795
    .line 796
    const/4 v12, 0x0

    .line 797
    invoke-direct/range {v7 .. v12}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1$1;-><init>(Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;Lcom/zykj/huiwei/launcher/bean/req/LoginReq;Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;Lkotlin/coroutines/Continuation;)V

    .line 798
    .line 799
    .line 800
    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 801
    .line 802
    .line 803
    move-result-object v3

    .line 804
    iput-object v3, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->a:Ljava/lang/Object;

    .line 805
    .line 806
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 807
    .line 808
    .line 809
    move-result-object v3

    .line 810
    iput-object v3, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->b:Ljava/lang/Object;

    .line 811
    .line 812
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 813
    .line 814
    .line 815
    move-result-object v3

    .line 816
    iput-object v3, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->c:Ljava/lang/Object;

    .line 817
    .line 818
    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 819
    .line 820
    .line 821
    move-result-object v3

    .line 822
    iput-object v3, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->d:Ljava/lang/Object;

    .line 823
    .line 824
    const/16 v3, 0x9

    .line 825
    .line 826
    iput v3, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->f:I

    .line 827
    .line 828
    invoke-static {v0, v7, v1}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 829
    .line 830
    .line 831
    move-result-object v0

    .line 832
    if-ne v0, v2, :cond_12

    .line 833
    .line 834
    :goto_d
    return-object v2

    .line 835
    :cond_f
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->g:Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 836
    .line 837
    invoke-virtual {v0}, Lcom/zykj/base/BaseViewModel;->isDialogVisible()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 838
    .line 839
    .line 840
    move-result-object v0

    .line 841
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 842
    .line 843
    .line 844
    move-result-object v2

    .line 845
    invoke-virtual {v0, v2}, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;->setValue(Ljava/lang/Object;)V

    .line 846
    .line 847
    .line 848
    const-string v0, "ZYKJLoginActivity"

    .line 849
    .line 850
    const-string v2, "loginFailed: "

    .line 851
    .line 852
    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 853
    .line 854
    .line 855
    move-result v0

    .line 856
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 857
    .line 858
    .line 859
    goto :goto_f

    .line 860
    :cond_10
    throw v0

    .line 861
    :cond_11
    throw v0
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_0

    .line 862
    :goto_e
    iget-object v2, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->g:Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 863
    .line 864
    invoke-virtual {v2}, Lcom/zykj/base/BaseViewModel;->isDialogVisible()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 865
    .line 866
    .line 867
    move-result-object v2

    .line 868
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 869
    .line 870
    .line 871
    move-result-object v3

    .line 872
    invoke-virtual {v2, v3}, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;->setValue(Ljava/lang/Object;)V

    .line 873
    .line 874
    .line 875
    iget-object v2, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->g:Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 876
    .line 877
    invoke-virtual {v2}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 878
    .line 879
    .line 880
    move-result-object v3

    .line 881
    invoke-virtual {v2, v0, v3}, Lcom/zykj/base/BaseViewModel;->handlerThrowable(Ljava/lang/Throwable;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;)V

    .line 882
    .line 883
    .line 884
    :cond_12
    :goto_f
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 885
    .line 886
    return-object v0

    .line 887
    :cond_13
    :goto_10
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->g:Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 888
    .line 889
    invoke-virtual {v0}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 890
    .line 891
    .line 892
    move-result-object v0

    .line 893
    new-instance v2, Lcom/zykj/base/bean/toast/ToastWarnMessage;

    .line 894
    .line 895
    const v3, 0x7f1101a2

    .line 896
    .line 897
    .line 898
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 899
    .line 900
    .line 901
    move-result-object v3

    .line 902
    invoke-direct {v2, v7, v3, v6, v7}, Lcom/zykj/base/bean/toast/ToastWarnMessage;-><init>(Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 903
    .line 904
    .line 905
    invoke-virtual {v0, v2}, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;->setValue(Ljava/lang/Object;)V

    .line 906
    .line 907
    .line 908
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 909
    .line 910
    return-object v0

    .line 911
    :cond_14
    :goto_11
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->g:Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 912
    .line 913
    invoke-virtual {v0}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 914
    .line 915
    .line 916
    move-result-object v0

    .line 917
    new-instance v2, Lcom/zykj/base/bean/toast/ToastWarnMessage;

    .line 918
    .line 919
    const v3, 0x7f1101a4

    .line 920
    .line 921
    .line 922
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 923
    .line 924
    .line 925
    move-result-object v3

    .line 926
    invoke-direct {v2, v7, v3, v6, v7}, Lcom/zykj/base/bean/toast/ToastWarnMessage;-><init>(Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 927
    .line 928
    .line 929
    invoke-virtual {v0, v2}, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;->setValue(Ljava/lang/Object;)V

    .line 930
    .line 931
    .line 932
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 933
    .line 934
    return-object v0

    .line 935
    :cond_15
    :goto_12
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;->g:Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 936
    .line 937
    invoke-virtual {v0}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 938
    .line 939
    .line 940
    move-result-object v0

    .line 941
    new-instance v2, Lcom/zykj/base/bean/toast/ToastWarnMessage;

    .line 942
    .line 943
    const v3, 0x7f1101a3

    .line 944
    .line 945
    .line 946
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 947
    .line 948
    .line 949
    move-result-object v3

    .line 950
    invoke-direct {v2, v7, v3, v6, v7}, Lcom/zykj/base/bean/toast/ToastWarnMessage;-><init>(Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 951
    .line 952
    .line 953
    invoke-virtual {v0, v2}, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;->setValue(Ljava/lang/Object;)V

    .line 954
    .line 955
    .line 956
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 957
    .line 958
    return-object v0

    .line 959
    :pswitch_data_0
    .packed-switch 0x0
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
