.class final Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/login/viewmodel/LoginViewModel;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
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
    c = "com.friday.login.viewmodel.LoginViewModel$ezyLogin$1"
    f = "LoginViewModel.kt"
    l = {
        0x3c,
        0x54,
        0x68
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:I

.field public final synthetic f:Lcom/friday/login/viewmodel/LoginViewModel;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Lcom/friday/common/entity/EzyLoginRequest;

.field public final synthetic i:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/friday/login/viewmodel/LoginViewModel;Ljava/lang/String;Lcom/friday/common/entity/EzyLoginRequest;Ljava/lang/String;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;->f:Lcom/friday/login/viewmodel/LoginViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;->g:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;->h:Lcom/friday/common/entity/EzyLoginRequest;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;->i:Ljava/lang/String;

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
    new-instance v0, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;->f:Lcom/friday/login/viewmodel/LoginViewModel;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;->g:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;->h:Lcom/friday/common/entity/EzyLoginRequest;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;->i:Ljava/lang/String;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;-><init>(Lcom/friday/login/viewmodel/LoginViewModel;Ljava/lang/String;Lcom/friday/common/entity/EzyLoginRequest;Ljava/lang/String;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;->e:I

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v1, :cond_3

    .line 11
    .line 12
    if-eq v1, v4, :cond_2

    .line 13
    .line 14
    if-eq v1, v3, :cond_1

    .line 15
    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;->d:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lcom/friday/common/entity/User;

    .line 21
    .line 22
    iget-object v0, p0, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lcom/friday/common/entity/TokenResponse;

    .line 25
    .line 26
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    move-object v10, p0

    .line 30
    goto/16 :goto_3

    .line 31
    .line 32
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 35
    .line 36
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1

    .line 40
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    move-object v10, p0

    .line 44
    goto/16 :goto_1

    .line 45
    .line 46
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    sget-object p1, Lf2/c;->a:Lf2/c;

    .line 54
    .line 55
    invoke-virtual {p1}, Lf2/c;->e()Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-nez p1, :cond_4

    .line 60
    .line 61
    iget-object p1, p0, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;->f:Lcom/friday/login/viewmodel/LoginViewModel;

    .line 62
    .line 63
    invoke-virtual {p1}, Lcom/friday/login/viewmodel/LoginViewModel;->n()Landroidx/lifecycle/MutableLiveData;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    const/4 v0, 0x0

    .line 68
    invoke-static {v0}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    sget p1, Lcom/friday/login/R$string;->connect_network_please:I

    .line 76
    .line 77
    invoke-static {p1}, Lz1/b;->h(I)V

    .line 78
    .line 79
    .line 80
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 81
    .line 82
    return-object p1

    .line 83
    :cond_4
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    new-instance v1, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1$1;

    .line 88
    .line 89
    iget-object v5, p0, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;->g:Ljava/lang/String;

    .line 90
    .line 91
    iget-object v6, p0, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;->f:Lcom/friday/login/viewmodel/LoginViewModel;

    .line 92
    .line 93
    const/4 v7, 0x0

    .line 94
    invoke-direct {v1, v5, v6, v7}, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1$1;-><init>(Ljava/lang/String;Lcom/friday/login/viewmodel/LoginViewModel;Lvc/c;)V

    .line 95
    .line 96
    .line 97
    iput v4, p0, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;->e:I

    .line 98
    .line 99
    invoke-static {p1, v1, p0}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    if-ne p1, v0, :cond_5

    .line 104
    .line 105
    move-object v10, p0

    .line 106
    goto/16 :goto_2

    .line 107
    .line 108
    :cond_5
    :goto_0
    sget-object p1, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 109
    .line 110
    invoke-virtual {p1}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    iget-object v1, p0, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;->g:Ljava/lang/String;

    .line 115
    .line 116
    invoke-virtual {p1, v1}, Lcom/friday/common/helper/b;->A(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    iget-object p1, p0, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;->f:Lcom/friday/login/viewmodel/LoginViewModel;

    .line 120
    .line 121
    invoke-static {p1}, Lcom/friday/login/viewmodel/LoginViewModel;->f(Lcom/friday/login/viewmodel/LoginViewModel;)Ld2/i;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    iget-object v6, p0, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;->h:Lcom/friday/common/entity/EzyLoginRequest;

    .line 126
    .line 127
    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->getAppPackageName()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    const-string p1, "getAppPackageName(...)"

    .line 132
    .line 133
    invoke-static {v7, p1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->getAppVersionCode()I

    .line 137
    .line 138
    .line 139
    move-result v8

    .line 140
    sget-object p1, Lk2/o;->a:Lk2/o;

    .line 141
    .line 142
    iget-object v1, p0, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;->g:Ljava/lang/String;

    .line 143
    .line 144
    iget-object v9, p0, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;->i:Ljava/lang/String;

    .line 145
    .line 146
    invoke-virtual {p1, v1, v9}, Lk2/o;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    if-nez p1, :cond_6

    .line 151
    .line 152
    const-string p1, "unknown"

    .line 153
    .line 154
    :cond_6
    move-object v9, p1

    .line 155
    iput v3, p0, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;->e:I

    .line 156
    .line 157
    move-object v10, p0

    .line 158
    invoke-interface/range {v5 .. v10}, Ld2/i;->c(Lcom/friday/common/entity/EzyLoginRequest;Ljava/lang/String;ILjava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    if-ne p1, v0, :cond_7

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_7
    :goto_1
    check-cast p1, Lcom/friday/common/entity/TokenResponse;

    .line 166
    .line 167
    invoke-virtual {p1}, Lcom/friday/common/entity/TokenResponse;->getSuccess()Z

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    if-eqz v1, :cond_d

    .line 172
    .line 173
    invoke-virtual {p1}, Lcom/friday/common/entity/TokenResponse;->getResult()Lcom/friday/common/entity/LoginResp;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    if-eqz v1, :cond_8

    .line 178
    .line 179
    invoke-virtual {v1}, Lcom/friday/common/entity/LoginResp;->getRoleType()I

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    if-ne v1, v4, :cond_8

    .line 184
    .line 185
    iget-object p1, v10, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;->f:Lcom/friday/login/viewmodel/LoginViewModel;

    .line 186
    .line 187
    invoke-virtual {p1}, Lcom/friday/login/viewmodel/LoginViewModel;->j()Landroidx/lifecycle/MutableLiveData;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    new-instance v0, Le2/a;

    .line 192
    .line 193
    invoke-static {v4}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    invoke-direct {v0, v1}, Le2/a;-><init>(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    sget p1, Lcom/friday/login/R$string;->login_role_type_error:I

    .line 204
    .line 205
    invoke-static {p1}, Lz1/b;->h(I)V

    .line 206
    .line 207
    .line 208
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 209
    .line 210
    return-object p1

    .line 211
    :cond_8
    sget-object v1, Lk2/o;->a:Lk2/o;

    .line 212
    .line 213
    iget-object v3, v10, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;->g:Ljava/lang/String;

    .line 214
    .line 215
    iget-object v4, v10, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;->i:Ljava/lang/String;

    .line 216
    .line 217
    invoke-virtual {p1}, Lcom/friday/common/entity/TokenResponse;->getResult()Lcom/friday/common/entity/LoginResp;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    if-eqz v5, :cond_9

    .line 222
    .line 223
    invoke-virtual {v5}, Lcom/friday/common/entity/LoginResp;->getClientCode()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v5

    .line 227
    if-nez v5, :cond_a

    .line 228
    .line 229
    :cond_9
    const-string v5, ""

    .line 230
    .line 231
    :cond_a
    invoke-virtual {v1, v3, v4, v5}, Lk2/o;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 232
    .line 233
    .line 234
    invoke-virtual {p1}, Lcom/friday/common/entity/TokenResponse;->getResult()Lcom/friday/common/entity/LoginResp;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    if-eqz v1, :cond_c

    .line 239
    .line 240
    iget-object v1, v10, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;->f:Lcom/friday/login/viewmodel/LoginViewModel;

    .line 241
    .line 242
    invoke-virtual {p1}, Lcom/friday/common/entity/TokenResponse;->getResult()Lcom/friday/common/entity/LoginResp;

    .line 243
    .line 244
    .line 245
    move-result-object v3

    .line 246
    invoke-static {v3}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    iget-object v4, v10, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;->g:Ljava/lang/String;

    .line 250
    .line 251
    iget-object v5, v10, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;->i:Ljava/lang/String;

    .line 252
    .line 253
    invoke-static {v1, v3, v4, v5}, Lcom/friday/login/viewmodel/LoginViewModel;->h(Lcom/friday/login/viewmodel/LoginViewModel;Lcom/friday/common/entity/LoginResp;Ljava/lang/String;Ljava/lang/String;)Lcom/friday/common/entity/User;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    iget-object v3, v10, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;->f:Lcom/friday/login/viewmodel/LoginViewModel;

    .line 258
    .line 259
    invoke-static {v3}, Lcom/friday/login/viewmodel/LoginViewModel;->g(Lcom/friday/login/viewmodel/LoginViewModel;)Lcom/friday/common/dao/UserDao;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    iput-object p1, v10, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;->c:Ljava/lang/Object;

    .line 264
    .line 265
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v4

    .line 269
    iput-object v4, v10, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;->d:Ljava/lang/Object;

    .line 270
    .line 271
    iput v2, v10, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;->e:I

    .line 272
    .line 273
    invoke-interface {v3, v1, p0}, Lcom/friday/common/dao/UserDao;->h(Lcom/friday/common/entity/User;Lvc/c;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    if-ne v1, v0, :cond_b

    .line 278
    .line 279
    :goto_2
    return-object v0

    .line 280
    :cond_b
    move-object v0, p1

    .line 281
    :goto_3
    sget-object p1, Lcom/friday/common/helper/a;->a:Lcom/friday/common/helper/a;

    .line 282
    .line 283
    invoke-virtual {v0}, Lcom/friday/common/entity/TokenResponse;->getResult()Lcom/friday/common/entity/LoginResp;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v1}, Lcom/friday/common/entity/LoginResp;->getUserId()J

    .line 291
    .line 292
    .line 293
    move-result-wide v1

    .line 294
    invoke-virtual {p1, v1, v2}, Lcom/friday/common/helper/a;->b(J)V

    .line 295
    .line 296
    .line 297
    move-object p1, v0

    .line 298
    goto :goto_4

    .line 299
    :cond_c
    new-instance p1, Ljava/lang/Exception;

    .line 300
    .line 301
    const-string v0, "\u83b7\u53d6\u7528\u6237\u4fe1\u606f\u5931\u8d25"

    .line 302
    .line 303
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    throw p1

    .line 307
    :cond_d
    :goto_4
    iget-object v0, v10, Lcom/friday/login/viewmodel/LoginViewModel$ezyLogin$1;->f:Lcom/friday/login/viewmodel/LoginViewModel;

    .line 308
    .line 309
    invoke-virtual {v0}, Lcom/friday/login/viewmodel/LoginViewModel;->n()Landroidx/lifecycle/MutableLiveData;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    invoke-virtual {p1}, Lcom/friday/common/entity/TokenResponse;->getSuccess()Z

    .line 314
    .line 315
    .line 316
    move-result v1

    .line 317
    invoke-static {v1}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {p1}, Lcom/friday/common/entity/TokenResponse;->getSuccess()Z

    .line 325
    .line 326
    .line 327
    move-result v0

    .line 328
    if-nez v0, :cond_e

    .line 329
    .line 330
    invoke-virtual {p1}, Lcom/friday/common/entity/TokenResponse;->getError()Lcom/friday/common/entity/ErrorRemote;

    .line 331
    .line 332
    .line 333
    move-result-object p1

    .line 334
    if-eqz p1, :cond_e

    .line 335
    .line 336
    invoke-virtual {p1}, Lcom/friday/common/entity/ErrorRemote;->getMessage()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object p1

    .line 340
    if-eqz p1, :cond_e

    .line 341
    .line 342
    invoke-static {p1}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 343
    .line 344
    .line 345
    :cond_e
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 346
    .line 347
    return-object p1
.end method
