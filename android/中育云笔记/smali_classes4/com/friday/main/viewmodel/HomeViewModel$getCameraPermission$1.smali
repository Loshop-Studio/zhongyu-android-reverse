.class final Lcom/friday/main/viewmodel/HomeViewModel$getCameraPermission$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/main/viewmodel/HomeViewModel;->s()V
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
    c = "com.friday.main.viewmodel.HomeViewModel$getCameraPermission$1"
    f = "HomeViewModel.kt"
    l = {
        0x92,
        0x95,
        0x9a,
        0x9d,
        0xa2,
        0xa5
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Z

.field public e:I

.field public final synthetic f:Lcom/friday/main/viewmodel/HomeViewModel;


# direct methods
.method public constructor <init>(Lcom/friday/main/viewmodel/HomeViewModel;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/main/viewmodel/HomeViewModel$getCameraPermission$1;->f:Lcom/friday/main/viewmodel/HomeViewModel;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/friday/main/viewmodel/HomeViewModel$getCameraPermission$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/main/viewmodel/HomeViewModel$getCameraPermission$1;->f:Lcom/friday/main/viewmodel/HomeViewModel;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/main/viewmodel/HomeViewModel$getCameraPermission$1;-><init>(Lcom/friday/main/viewmodel/HomeViewModel;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/main/viewmodel/HomeViewModel$getCameraPermission$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/main/viewmodel/HomeViewModel$getCameraPermission$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/main/viewmodel/HomeViewModel$getCameraPermission$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/main/viewmodel/HomeViewModel$getCameraPermission$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    move-result-object v1

    .line 5
    iget v0, p0, Lcom/friday/main/viewmodel/HomeViewModel$getCameraPermission$1;->e:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const-string v3, "null cannot be cast to non-null type kotlin.Boolean"

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 16
    .line 17
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p1

    .line 21
    :pswitch_0
    iget-object v0, p0, Lcom/friday/main/viewmodel/HomeViewModel$getCameraPermission$1;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lcom/friday/common/base/BaseCameraResponse;

    .line 24
    .line 25
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto/16 :goto_a

    .line 29
    .line 30
    :catch_0
    move-exception v0

    .line 31
    move-object p1, v0

    .line 32
    goto/16 :goto_9

    .line 33
    .line 34
    :pswitch_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    move-object v8, p0

    .line 38
    goto/16 :goto_7

    .line 39
    .line 40
    :pswitch_2
    iget-object v0, p0, Lcom/friday/main/viewmodel/HomeViewModel$getCameraPermission$1;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Lcom/friday/common/base/BaseCameraResponse;

    .line 43
    .line 44
    :try_start_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    move-object v8, p0

    .line 48
    goto/16 :goto_6

    .line 49
    .line 50
    :catch_1
    move-exception v0

    .line 51
    move-object p1, v0

    .line 52
    move-object v8, p0

    .line 53
    goto/16 :goto_5

    .line 54
    .line 55
    :pswitch_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 56
    .line 57
    .line 58
    move-object v8, p0

    .line 59
    goto/16 :goto_4

    .line 60
    .line 61
    :pswitch_4
    iget-object v0, p0, Lcom/friday/main/viewmodel/HomeViewModel$getCameraPermission$1;->c:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, Lcom/friday/common/base/BaseCameraResponse;

    .line 64
    .line 65
    :try_start_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    move-object v8, p0

    .line 69
    goto :goto_3

    .line 70
    :catch_2
    move-exception v0

    .line 71
    move-object p1, v0

    .line 72
    move-object v8, p0

    .line 73
    goto :goto_2

    .line 74
    :pswitch_5
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :pswitch_6
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    sget-object p1, Lf2/c;->a:Lf2/c;

    .line 82
    .line 83
    invoke-virtual {p1}, Lf2/c;->e()Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-eqz p1, :cond_5

    .line 88
    .line 89
    :try_start_3
    iget-object p1, p0, Lcom/friday/main/viewmodel/HomeViewModel$getCameraPermission$1;->f:Lcom/friday/main/viewmodel/HomeViewModel;

    .line 90
    .line 91
    invoke-static {p1}, Lcom/friday/main/viewmodel/HomeViewModel;->f(Lcom/friday/main/viewmodel/HomeViewModel;)Lu3/a;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    const/4 v0, 0x1

    .line 96
    iput v0, p0, Lcom/friday/main/viewmodel/HomeViewModel$getCameraPermission$1;->e:I

    .line 97
    .line 98
    invoke-interface {p1, p0}, Lu3/a;->a(Lvc/c;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    if-ne p1, v1, :cond_0

    .line 103
    .line 104
    goto/16 :goto_8

    .line 105
    .line 106
    :cond_0
    :goto_0
    check-cast p1, Lcom/friday/common/base/BaseCameraResponse;

    .line 107
    .line 108
    invoke-virtual {p1}, Lcom/friday/common/base/BaseCameraResponse;->getResult()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    check-cast v0, Ljava/lang/Boolean;

    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    iget-object v0, p0, Lcom/friday/main/viewmodel/HomeViewModel$getCameraPermission$1;->f:Lcom/friday/main/viewmodel/HomeViewModel;

    .line 122
    .line 123
    invoke-static {v0}, Lcom/friday/main/viewmodel/HomeViewModel;->j(Lcom/friday/main/viewmodel/HomeViewModel;)Lcom/friday/common/dao/UserDao;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    iput-object p1, p0, Lcom/friday/main/viewmodel/HomeViewModel$getCameraPermission$1;->c:Ljava/lang/Object;

    .line 132
    .line 133
    iput-boolean v5, p0, Lcom/friday/main/viewmodel/HomeViewModel$getCameraPermission$1;->d:Z

    .line 134
    .line 135
    const/4 p1, 0x2

    .line 136
    iput p1, p0, Lcom/friday/main/viewmodel/HomeViewModel$getCameraPermission$1;->e:I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4

    .line 137
    .line 138
    const-wide/16 v6, 0x0

    .line 139
    .line 140
    const/4 v9, 0x2

    .line 141
    const/4 v10, 0x0

    .line 142
    move-object v8, p0

    .line 143
    :try_start_4
    invoke-static/range {v4 .. v10}, Lcom/friday/common/dao/UserDao;->k(Lcom/friday/common/dao/UserDao;ZJLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 147
    if-ne p1, v1, :cond_1

    .line 148
    .line 149
    goto/16 :goto_8

    .line 150
    .line 151
    :catch_3
    move-exception v0

    .line 152
    :goto_1
    move-object p1, v0

    .line 153
    goto :goto_2

    .line 154
    :catch_4
    move-exception v0

    .line 155
    move-object v8, p0

    .line 156
    goto :goto_1

    .line 157
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 158
    .line 159
    .line 160
    :cond_1
    :goto_3
    :try_start_5
    iget-object p1, v8, Lcom/friday/main/viewmodel/HomeViewModel$getCameraPermission$1;->f:Lcom/friday/main/viewmodel/HomeViewModel;

    .line 161
    .line 162
    invoke-static {p1}, Lcom/friday/main/viewmodel/HomeViewModel;->f(Lcom/friday/main/viewmodel/HomeViewModel;)Lu3/a;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    iput-object v2, v8, Lcom/friday/main/viewmodel/HomeViewModel$getCameraPermission$1;->c:Ljava/lang/Object;

    .line 167
    .line 168
    const/4 v0, 0x3

    .line 169
    iput v0, v8, Lcom/friday/main/viewmodel/HomeViewModel$getCameraPermission$1;->e:I

    .line 170
    .line 171
    invoke-interface {p1, p0}, Lu3/a;->b(Lvc/c;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    if-ne p1, v1, :cond_2

    .line 176
    .line 177
    goto :goto_8

    .line 178
    :cond_2
    :goto_4
    check-cast p1, Lcom/friday/common/base/BaseCameraResponse;

    .line 179
    .line 180
    invoke-virtual {p1}, Lcom/friday/common/base/BaseCameraResponse;->getResult()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    check-cast v0, Ljava/lang/Boolean;

    .line 188
    .line 189
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    iget-object v0, v8, Lcom/friday/main/viewmodel/HomeViewModel$getCameraPermission$1;->f:Lcom/friday/main/viewmodel/HomeViewModel;

    .line 194
    .line 195
    invoke-static {v0}, Lcom/friday/main/viewmodel/HomeViewModel;->j(Lcom/friday/main/viewmodel/HomeViewModel;)Lcom/friday/common/dao/UserDao;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    iput-object p1, v8, Lcom/friday/main/viewmodel/HomeViewModel$getCameraPermission$1;->c:Ljava/lang/Object;

    .line 204
    .line 205
    iput-boolean v5, v8, Lcom/friday/main/viewmodel/HomeViewModel$getCameraPermission$1;->d:Z

    .line 206
    .line 207
    const/4 p1, 0x4

    .line 208
    iput p1, v8, Lcom/friday/main/viewmodel/HomeViewModel$getCameraPermission$1;->e:I

    .line 209
    .line 210
    const-wide/16 v6, 0x0

    .line 211
    .line 212
    const/4 v9, 0x2

    .line 213
    const/4 v10, 0x0

    .line 214
    invoke-static/range {v4 .. v10}, Lcom/friday/common/dao/UserDao;->j(Lcom/friday/common/dao/UserDao;ZJLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object p1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    .line 218
    if-ne p1, v1, :cond_3

    .line 219
    .line 220
    goto :goto_8

    .line 221
    :catch_5
    move-exception v0

    .line 222
    move-object p1, v0

    .line 223
    :goto_5
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 224
    .line 225
    .line 226
    :cond_3
    :goto_6
    :try_start_6
    iget-object p1, v8, Lcom/friday/main/viewmodel/HomeViewModel$getCameraPermission$1;->f:Lcom/friday/main/viewmodel/HomeViewModel;

    .line 227
    .line 228
    invoke-static {p1}, Lcom/friday/main/viewmodel/HomeViewModel;->f(Lcom/friday/main/viewmodel/HomeViewModel;)Lu3/a;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    iput-object v2, v8, Lcom/friday/main/viewmodel/HomeViewModel$getCameraPermission$1;->c:Ljava/lang/Object;

    .line 233
    .line 234
    const/4 v0, 0x5

    .line 235
    iput v0, v8, Lcom/friday/main/viewmodel/HomeViewModel$getCameraPermission$1;->e:I

    .line 236
    .line 237
    invoke-interface {p1, p0}, Lu3/a;->c(Lvc/c;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    if-ne p1, v1, :cond_4

    .line 242
    .line 243
    goto :goto_8

    .line 244
    :cond_4
    :goto_7
    check-cast p1, Lcom/friday/common/base/BaseCameraResponse;

    .line 245
    .line 246
    invoke-virtual {p1}, Lcom/friday/common/base/BaseCameraResponse;->getResult()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    check-cast v0, Ljava/lang/Boolean;

    .line 254
    .line 255
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 256
    .line 257
    .line 258
    move-result v5

    .line 259
    iget-object v0, v8, Lcom/friday/main/viewmodel/HomeViewModel$getCameraPermission$1;->f:Lcom/friday/main/viewmodel/HomeViewModel;

    .line 260
    .line 261
    invoke-static {v0}, Lcom/friday/main/viewmodel/HomeViewModel;->j(Lcom/friday/main/viewmodel/HomeViewModel;)Lcom/friday/common/dao/UserDao;

    .line 262
    .line 263
    .line 264
    move-result-object v4

    .line 265
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    iput-object p1, v8, Lcom/friday/main/viewmodel/HomeViewModel$getCameraPermission$1;->c:Ljava/lang/Object;

    .line 270
    .line 271
    iput-boolean v5, v8, Lcom/friday/main/viewmodel/HomeViewModel$getCameraPermission$1;->d:Z

    .line 272
    .line 273
    const/4 p1, 0x6

    .line 274
    iput p1, v8, Lcom/friday/main/viewmodel/HomeViewModel$getCameraPermission$1;->e:I

    .line 275
    .line 276
    const-wide/16 v6, 0x0

    .line 277
    .line 278
    const/4 v9, 0x2

    .line 279
    const/4 v10, 0x0

    .line 280
    invoke-static/range {v4 .. v10}, Lcom/friday/common/dao/UserDao;->m(Lcom/friday/common/dao/UserDao;ZJLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object p1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 284
    if-ne p1, v1, :cond_5

    .line 285
    .line 286
    :goto_8
    return-object v1

    .line 287
    :goto_9
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 288
    .line 289
    .line 290
    :cond_5
    :goto_a
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 291
    .line 292
    return-object p1

    .line 293
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
