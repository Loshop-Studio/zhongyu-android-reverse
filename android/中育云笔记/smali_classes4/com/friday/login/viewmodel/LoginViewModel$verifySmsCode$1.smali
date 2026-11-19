.class final Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/login/viewmodel/LoginViewModel;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.login.viewmodel.LoginViewModel$verifySmsCode$1"
    f = "LoginViewModel.kt"
    l = {
        0xa2,
        0xbc
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Z

.field public f:I

.field public final synthetic g:Lcom/friday/login/viewmodel/LoginViewModel;

.field public final synthetic h:Lcom/friday/common/entity/EzyLoginRequest;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/friday/login/viewmodel/LoginViewModel;Lcom/friday/common/entity/EzyLoginRequest;Ljava/lang/String;Ljava/lang/String;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;->g:Lcom/friday/login/viewmodel/LoginViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;->h:Lcom/friday/common/entity/EzyLoginRequest;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;->i:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;->j:Ljava/lang/String;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 6

    .line 1
    new-instance v0, Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;->g:Lcom/friday/login/viewmodel/LoginViewModel;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;->h:Lcom/friday/common/entity/EzyLoginRequest;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;->i:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;->j:Ljava/lang/String;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;-><init>(Lcom/friday/login/viewmodel/LoginViewModel;Lcom/friday/common/entity/EzyLoginRequest;Ljava/lang/String;Ljava/lang/String;Lvc/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;->f:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    if-eq v1, v4, :cond_1

    .line 13
    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lcom/friday/common/entity/User;

    .line 19
    .line 20
    iget-object v0, p0, Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lcom/friday/common/entity/TokenResponse;

    .line 23
    .line 24
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    move-object v10, p0

    .line 28
    goto/16 :goto_4

    .line 29
    .line 30
    :catch_0
    move-exception v0

    .line 31
    move-object p1, v0

    .line 32
    move-object v10, p0

    .line 33
    goto/16 :goto_5

    .line 34
    .line 35
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 36
    .line 37
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 38
    .line 39
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p1

    .line 43
    :cond_1
    :try_start_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 44
    .line 45
    .line 46
    move-object v10, p0

    .line 47
    goto :goto_0

    .line 48
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :try_start_2
    sget-object p1, Lf2/c;->a:Lf2/c;

    .line 52
    .line 53
    invoke-virtual {p1}, Lf2/c;->e()Z

    .line 54
    .line 55
    .line 56
    move-result p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 57
    if-nez p1, :cond_3

    .line 58
    .line 59
    :try_start_3
    iget-object p1, p0, Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;->g:Lcom/friday/login/viewmodel/LoginViewModel;

    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/friday/login/viewmodel/LoginViewModel;->n()Landroidx/lifecycle/MutableLiveData;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-static {v3}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    sget p1, Lcom/friday/login/R$string;->connect_network_please:I

    .line 73
    .line 74
    invoke-static {p1}, Lz1/b;->h(I)V

    .line 75
    .line 76
    .line 77
    sget-object p1, Lqc/q;->a:Lqc/q;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 78
    .line 79
    return-object p1

    .line 80
    :cond_3
    :try_start_4
    iget-object p1, p0, Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;->g:Lcom/friday/login/viewmodel/LoginViewModel;

    .line 81
    .line 82
    invoke-static {p1}, Lcom/friday/login/viewmodel/LoginViewModel;->f(Lcom/friday/login/viewmodel/LoginViewModel;)Ld2/i;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    iget-object v6, p0, Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;->h:Lcom/friday/common/entity/EzyLoginRequest;

    .line 87
    .line 88
    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->getAppPackageName()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    const-string p1, "getAppPackageName(...)"

    .line 93
    .line 94
    invoke-static {v7, p1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->getAppVersionCode()I

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    sget-object p1, Lk2/o;->a:Lk2/o;

    .line 102
    .line 103
    iget-object v1, p0, Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;->i:Ljava/lang/String;

    .line 104
    .line 105
    iget-object v9, p0, Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;->j:Ljava/lang/String;

    .line 106
    .line 107
    invoke-virtual {p1, v1, v9}, Lk2/o;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 111
    if-nez p1, :cond_4

    .line 112
    .line 113
    :try_start_5
    const-string p1, "unknown"
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 114
    .line 115
    :cond_4
    move-object v9, p1

    .line 116
    :try_start_6
    iput v4, p0, Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;->f:I
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    .line 117
    .line 118
    move-object v10, p0

    .line 119
    :try_start_7
    invoke-interface/range {v5 .. v10}, Ld2/i;->c(Lcom/friday/common/entity/EzyLoginRequest;Ljava/lang/String;ILjava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    if-ne p1, v0, :cond_5

    .line 124
    .line 125
    goto/16 :goto_3

    .line 126
    .line 127
    :cond_5
    :goto_0
    check-cast p1, Lcom/friday/common/entity/TokenResponse;

    .line 128
    .line 129
    invoke-virtual {p1}, Lcom/friday/common/entity/TokenResponse;->getSuccess()Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-eqz v1, :cond_c

    .line 134
    .line 135
    invoke-virtual {p1}, Lcom/friday/common/entity/TokenResponse;->getResult()Lcom/friday/common/entity/LoginResp;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    if-eqz v1, :cond_6

    .line 140
    .line 141
    invoke-virtual {v1}, Lcom/friday/common/entity/LoginResp;->getRoleType()I

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    if-ne v1, v4, :cond_6

    .line 146
    .line 147
    iget-object p1, v10, Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;->g:Lcom/friday/login/viewmodel/LoginViewModel;

    .line 148
    .line 149
    invoke-virtual {p1}, Lcom/friday/login/viewmodel/LoginViewModel;->j()Landroidx/lifecycle/MutableLiveData;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    new-instance v0, Le2/a;

    .line 154
    .line 155
    invoke-static {v4}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-direct {v0, v1}, Le2/a;-><init>(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    sget p1, Lcom/friday/login/R$string;->login_role_type_error:I

    .line 166
    .line 167
    invoke-static {p1}, Lz1/b;->h(I)V

    .line 168
    .line 169
    .line 170
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 171
    .line 172
    return-object p1

    .line 173
    :catch_1
    move-exception v0

    .line 174
    :goto_1
    move-object p1, v0

    .line 175
    goto/16 :goto_5

    .line 176
    .line 177
    :cond_6
    sget-object v1, Lk2/o;->a:Lk2/o;

    .line 178
    .line 179
    iget-object v5, v10, Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;->i:Ljava/lang/String;

    .line 180
    .line 181
    iget-object v6, v10, Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;->j:Ljava/lang/String;

    .line 182
    .line 183
    invoke-virtual {p1}, Lcom/friday/common/entity/TokenResponse;->getResult()Lcom/friday/common/entity/LoginResp;

    .line 184
    .line 185
    .line 186
    move-result-object v7

    .line 187
    if-eqz v7, :cond_7

    .line 188
    .line 189
    invoke-virtual {v7}, Lcom/friday/common/entity/LoginResp;->getClientCode()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v7

    .line 193
    if-nez v7, :cond_8

    .line 194
    .line 195
    :cond_7
    const-string v7, ""

    .line 196
    .line 197
    :cond_8
    invoke-virtual {v1, v5, v6, v7}, Lk2/o;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    if-eqz v1, :cond_9

    .line 202
    .line 203
    iget-object v5, v10, Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;->g:Lcom/friday/login/viewmodel/LoginViewModel;

    .line 204
    .line 205
    invoke-virtual {v5}, Lcom/friday/login/viewmodel/LoginViewModel;->n()Landroidx/lifecycle/MutableLiveData;

    .line 206
    .line 207
    .line 208
    move-result-object v5

    .line 209
    invoke-static {v4}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 210
    .line 211
    .line 212
    move-result-object v6

    .line 213
    invoke-virtual {v5, v6}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    goto :goto_2

    .line 217
    :cond_9
    const-string v5, "\u4fdd\u5b58\u8bbe\u5907\u7801\u5931\u8d25"

    .line 218
    .line 219
    invoke-static {v5}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 220
    .line 221
    .line 222
    iget-object v5, v10, Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;->g:Lcom/friday/login/viewmodel/LoginViewModel;

    .line 223
    .line 224
    invoke-virtual {v5}, Lcom/friday/login/viewmodel/LoginViewModel;->m()Landroidx/lifecycle/MutableLiveData;

    .line 225
    .line 226
    .line 227
    move-result-object v5

    .line 228
    invoke-static {v3}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 229
    .line 230
    .line 231
    move-result-object v6

    .line 232
    invoke-virtual {v5, v6}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    :goto_2
    invoke-virtual {p1}, Lcom/friday/common/entity/TokenResponse;->getResult()Lcom/friday/common/entity/LoginResp;

    .line 236
    .line 237
    .line 238
    move-result-object v5

    .line 239
    if-eqz v5, :cond_b

    .line 240
    .line 241
    iget-object v5, v10, Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;->g:Lcom/friday/login/viewmodel/LoginViewModel;

    .line 242
    .line 243
    invoke-virtual {p1}, Lcom/friday/common/entity/TokenResponse;->getResult()Lcom/friday/common/entity/LoginResp;

    .line 244
    .line 245
    .line 246
    move-result-object v6

    .line 247
    invoke-static {v6}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    iget-object v7, v10, Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;->i:Ljava/lang/String;

    .line 251
    .line 252
    iget-object v8, v10, Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;->j:Ljava/lang/String;

    .line 253
    .line 254
    invoke-static {v5, v6, v7, v8}, Lcom/friday/login/viewmodel/LoginViewModel;->h(Lcom/friday/login/viewmodel/LoginViewModel;Lcom/friday/common/entity/LoginResp;Ljava/lang/String;Ljava/lang/String;)Lcom/friday/common/entity/User;

    .line 255
    .line 256
    .line 257
    move-result-object v5

    .line 258
    iget-object v6, v10, Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;->g:Lcom/friday/login/viewmodel/LoginViewModel;

    .line 259
    .line 260
    invoke-static {v6}, Lcom/friday/login/viewmodel/LoginViewModel;->g(Lcom/friday/login/viewmodel/LoginViewModel;)Lcom/friday/common/dao/UserDao;

    .line 261
    .line 262
    .line 263
    move-result-object v6

    .line 264
    iput-object p1, v10, Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;->c:Ljava/lang/Object;

    .line 265
    .line 266
    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v7

    .line 270
    iput-object v7, v10, Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;->d:Ljava/lang/Object;

    .line 271
    .line 272
    iput-boolean v1, v10, Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;->e:Z

    .line 273
    .line 274
    iput v2, v10, Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;->f:I

    .line 275
    .line 276
    invoke-interface {v6, v5, p0}, Lcom/friday/common/dao/UserDao;->h(Lcom/friday/common/entity/User;Lvc/c;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    if-ne v1, v0, :cond_a

    .line 281
    .line 282
    :goto_3
    return-object v0

    .line 283
    :cond_a
    move-object v0, p1

    .line 284
    :goto_4
    sget-object p1, Lcom/friday/common/helper/a;->a:Lcom/friday/common/helper/a;

    .line 285
    .line 286
    invoke-virtual {v0}, Lcom/friday/common/entity/TokenResponse;->getResult()Lcom/friday/common/entity/LoginResp;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v0}, Lcom/friday/common/entity/LoginResp;->getUserId()J

    .line 294
    .line 295
    .line 296
    move-result-wide v0

    .line 297
    invoke-virtual {p1, v0, v1}, Lcom/friday/common/helper/a;->b(J)V

    .line 298
    .line 299
    .line 300
    iget-object p1, v10, Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;->g:Lcom/friday/login/viewmodel/LoginViewModel;

    .line 301
    .line 302
    invoke-virtual {p1}, Lcom/friday/login/viewmodel/LoginViewModel;->m()Landroidx/lifecycle/MutableLiveData;

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    invoke-static {v4}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    goto :goto_6

    .line 314
    :cond_b
    new-instance p1, Ljava/lang/Exception;

    .line 315
    .line 316
    const-string v0, "\u83b7\u53d6\u7528\u6237\u4fe1\u606f\u5931\u8d25"

    .line 317
    .line 318
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    throw p1

    .line 322
    :cond_c
    invoke-virtual {p1}, Lcom/friday/common/entity/TokenResponse;->getError()Lcom/friday/common/entity/ErrorRemote;

    .line 323
    .line 324
    .line 325
    move-result-object p1

    .line 326
    if-eqz p1, :cond_d

    .line 327
    .line 328
    invoke-virtual {p1}, Lcom/friday/common/entity/ErrorRemote;->getMessage()Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object p1

    .line 332
    if-eqz p1, :cond_d

    .line 333
    .line 334
    invoke-static {p1}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 335
    .line 336
    .line 337
    :cond_d
    iget-object p1, v10, Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;->g:Lcom/friday/login/viewmodel/LoginViewModel;

    .line 338
    .line 339
    invoke-virtual {p1}, Lcom/friday/login/viewmodel/LoginViewModel;->m()Landroidx/lifecycle/MutableLiveData;

    .line 340
    .line 341
    .line 342
    move-result-object p1

    .line 343
    invoke-static {v3}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    .line 348
    .line 349
    .line 350
    goto :goto_6

    .line 351
    :catch_2
    move-exception v0

    .line 352
    move-object v10, p0

    .line 353
    goto/16 :goto_1

    .line 354
    .line 355
    :goto_5
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 356
    .line 357
    .line 358
    iget-object p1, v10, Lcom/friday/login/viewmodel/LoginViewModel$verifySmsCode$1;->g:Lcom/friday/login/viewmodel/LoginViewModel;

    .line 359
    .line 360
    invoke-virtual {p1}, Lcom/friday/login/viewmodel/LoginViewModel;->m()Landroidx/lifecycle/MutableLiveData;

    .line 361
    .line 362
    .line 363
    move-result-object p1

    .line 364
    invoke-static {v3}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    :goto_6
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 372
    .line 373
    return-object p1
.end method
