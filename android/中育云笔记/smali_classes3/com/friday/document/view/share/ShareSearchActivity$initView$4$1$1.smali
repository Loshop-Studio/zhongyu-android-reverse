.class final Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/share/ShareSearchActivity;->initView()V
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
    c = "com.friday.document.view.share.ShareSearchActivity$initView$4$1$1"
    f = "ShareSearchActivity.kt"
    l = {
        0x98,
        0xa5,
        0xbb
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/document/model/ShareFile;

.field public final synthetic e:Lcom/friday/document/view/share/ShareSearchActivity;


# direct methods
.method public constructor <init>(Lcom/friday/document/model/ShareFile;Lcom/friday/document/view/share/ShareSearchActivity;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;->d:Lcom/friday/document/model/ShareFile;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;->e:Lcom/friday/document/view/share/ShareSearchActivity;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;->d:Lcom/friday/document/model/ShareFile;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;->e:Lcom/friday/document/view/share/ShareSearchActivity;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;-><init>(Lcom/friday/document/model/ShareFile;Lcom/friday/document/view/share/ShareSearchActivity;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;->c:I

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
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    move-object v8, p0

    .line 22
    goto/16 :goto_3

    .line 23
    .line 24
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    move-object v8, p0

    .line 36
    goto/16 :goto_1

    .line 37
    .line 38
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    move-object v8, p0

    .line 42
    goto/16 :goto_6

    .line 43
    .line 44
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;->d:Lcom/friday/document/model/ShareFile;

    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getType()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    const/16 v5, 0x31

    .line 58
    .line 59
    if-eq v1, v5, :cond_e

    .line 60
    .line 61
    const/16 v5, 0x36

    .line 62
    .line 63
    if-eq v1, v5, :cond_9

    .line 64
    .line 65
    const/16 v3, 0x621

    .line 66
    .line 67
    if-eq v1, v3, :cond_7

    .line 68
    .line 69
    const/16 v3, 0x38

    .line 70
    .line 71
    if-eq v1, v3, :cond_5

    .line 72
    .line 73
    const/16 v3, 0x39

    .line 74
    .line 75
    if-eq v1, v3, :cond_4

    .line 76
    .line 77
    :goto_0
    move-object v8, p0

    .line 78
    goto/16 :goto_2

    .line 79
    .line 80
    :cond_4
    const-string v1, "9"

    .line 81
    .line 82
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-nez p1, :cond_6

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_5
    const-string v1, "8"

    .line 90
    .line 91
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-nez p1, :cond_6

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_6
    sget-object v5, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 99
    .line 100
    iget-object p1, p0, Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;->d:Lcom/friday/document/model/ShareFile;

    .line 101
    .line 102
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getFileName()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    iget-object p1, p0, Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;->d:Lcom/friday/document/model/ShareFile;

    .line 107
    .line 108
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getRealOssUrl()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    iget-object p1, p0, Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;->d:Lcom/friday/document/model/ShareFile;

    .line 113
    .line 114
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v9

    .line 118
    const/16 v12, 0x10

    .line 119
    .line 120
    const/4 v13, 0x0

    .line 121
    const/4 v8, 0x1

    .line 122
    const-wide/16 v10, 0x0

    .line 123
    .line 124
    invoke-static/range {v5 .. v13}, Lcom/friday/common/helper/c;->s(Lcom/friday/common/helper/c;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;JILjava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    move-object v8, p0

    .line 128
    goto/16 :goto_7

    .line 129
    .line 130
    :cond_7
    const-string v1, "12"

    .line 131
    .line 132
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    if-nez p1, :cond_8

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_8
    move-object v8, p0

    .line 140
    goto/16 :goto_4

    .line 141
    .line 142
    :cond_9
    const-string v1, "6"

    .line 143
    .line 144
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    if-nez p1, :cond_a

    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_a
    iget-object p1, p0, Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;->e:Lcom/friday/document/view/share/ShareSearchActivity;

    .line 152
    .line 153
    invoke-static {p1}, Lcom/friday/document/view/share/ShareSearchActivity;->U(Lcom/friday/document/view/share/ShareSearchActivity;)Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    iget-object v6, p0, Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;->d:Lcom/friday/document/model/ShareFile;

    .line 158
    .line 159
    iput v3, p0, Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;->c:I

    .line 160
    .line 161
    const/4 v7, 0x0

    .line 162
    const/4 v9, 0x2

    .line 163
    const/4 v10, 0x0

    .line 164
    move-object v8, p0

    .line 165
    invoke-static/range {v5 .. v10}, Lcom/friday/document/viewmodel/StudentShareViewModel;->q(Lcom/friday/document/viewmodel/StudentShareViewModel;Lcom/friday/document/model/ShareFile;ZLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    if-ne p1, v0, :cond_b

    .line 170
    .line 171
    goto/16 :goto_5

    .line 172
    .line 173
    :cond_b
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 174
    .line 175
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    if-nez p1, :cond_d

    .line 180
    .line 181
    sget-object p1, Lf2/c;->a:Lf2/c;

    .line 182
    .line 183
    invoke-virtual {p1}, Lf2/c;->e()Z

    .line 184
    .line 185
    .line 186
    move-result p1

    .line 187
    if-nez p1, :cond_c

    .line 188
    .line 189
    sget p1, Lcom/friday/document/R$string;->disconnected_net_without_text:I

    .line 190
    .line 191
    invoke-static {p1}, Lz1/b;->h(I)V

    .line 192
    .line 193
    .line 194
    goto/16 :goto_7

    .line 195
    .line 196
    :cond_c
    iget-object p1, v8, Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;->e:Lcom/friday/document/view/share/ShareSearchActivity;

    .line 197
    .line 198
    invoke-virtual {p1, v4}, Lcom/friday/common/base/BaseActivity;->isShowLoading(Z)V

    .line 199
    .line 200
    .line 201
    iget-object p1, v8, Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;->e:Lcom/friday/document/view/share/ShareSearchActivity;

    .line 202
    .line 203
    invoke-static {p1}, Lcom/friday/document/view/share/ShareSearchActivity;->U(Lcom/friday/document/view/share/ShareSearchActivity;)Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    iget-object v0, v8, Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;->d:Lcom/friday/document/model/ShareFile;

    .line 208
    .line 209
    invoke-virtual {p1, v0}, Lcom/friday/document/viewmodel/StudentShareViewModel;->u(Lcom/friday/document/model/ShareFile;)V

    .line 210
    .line 211
    .line 212
    goto/16 :goto_7

    .line 213
    .line 214
    :cond_d
    iget-object p1, v8, Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;->e:Lcom/friday/document/view/share/ShareSearchActivity;

    .line 215
    .line 216
    invoke-static {p1}, Lcom/friday/document/view/share/ShareSearchActivity;->U(Lcom/friday/document/view/share/ShareSearchActivity;)Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    iget-object v0, v8, Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;->d:Lcom/friday/document/model/ShareFile;

    .line 221
    .line 222
    invoke-virtual {p1, v0}, Lcom/friday/document/viewmodel/StudentShareViewModel;->v(Lcom/friday/document/model/ShareFile;)V

    .line 223
    .line 224
    .line 225
    goto/16 :goto_7

    .line 226
    .line 227
    :cond_e
    move-object v8, p0

    .line 228
    const-string v1, "1"

    .line 229
    .line 230
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result p1

    .line 234
    if-nez p1, :cond_12

    .line 235
    .line 236
    :goto_2
    iget-object p1, v8, Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;->e:Lcom/friday/document/view/share/ShareSearchActivity;

    .line 237
    .line 238
    invoke-static {p1}, Lcom/friday/document/view/share/ShareSearchActivity;->U(Lcom/friday/document/view/share/ShareSearchActivity;)Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 239
    .line 240
    .line 241
    move-result-object v5

    .line 242
    iget-object v6, v8, Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;->d:Lcom/friday/document/model/ShareFile;

    .line 243
    .line 244
    iput v2, v8, Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;->c:I

    .line 245
    .line 246
    const/4 v7, 0x0

    .line 247
    const/4 v9, 0x2

    .line 248
    const/4 v10, 0x0

    .line 249
    invoke-static/range {v5 .. v10}, Lcom/friday/document/viewmodel/StudentShareViewModel;->q(Lcom/friday/document/viewmodel/StudentShareViewModel;Lcom/friday/document/model/ShareFile;ZLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    if-ne p1, v0, :cond_f

    .line 254
    .line 255
    goto :goto_5

    .line 256
    :cond_f
    :goto_3
    check-cast p1, Ljava/lang/Boolean;

    .line 257
    .line 258
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 259
    .line 260
    .line 261
    move-result p1

    .line 262
    if-nez p1, :cond_11

    .line 263
    .line 264
    sget-object p1, Lf2/c;->a:Lf2/c;

    .line 265
    .line 266
    invoke-virtual {p1}, Lf2/c;->e()Z

    .line 267
    .line 268
    .line 269
    move-result p1

    .line 270
    if-nez p1, :cond_10

    .line 271
    .line 272
    sget p1, Lcom/friday/document/R$string;->connect_network_please:I

    .line 273
    .line 274
    invoke-static {p1}, Lz1/b;->h(I)V

    .line 275
    .line 276
    .line 277
    goto :goto_7

    .line 278
    :cond_10
    iget-object p1, v8, Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;->e:Lcom/friday/document/view/share/ShareSearchActivity;

    .line 279
    .line 280
    invoke-virtual {p1, v4}, Lcom/friday/common/base/BaseActivity;->isShowLoading(Z)V

    .line 281
    .line 282
    .line 283
    iget-object p1, v8, Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;->e:Lcom/friday/document/view/share/ShareSearchActivity;

    .line 284
    .line 285
    invoke-static {p1}, Lcom/friday/document/view/share/ShareSearchActivity;->U(Lcom/friday/document/view/share/ShareSearchActivity;)Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    iget-object v0, v8, Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;->d:Lcom/friday/document/model/ShareFile;

    .line 290
    .line 291
    invoke-virtual {p1, v0}, Lcom/friday/document/viewmodel/StudentShareViewModel;->t(Lcom/friday/document/model/ShareFile;)V

    .line 292
    .line 293
    .line 294
    goto :goto_7

    .line 295
    :cond_11
    iget-object p1, v8, Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;->e:Lcom/friday/document/view/share/ShareSearchActivity;

    .line 296
    .line 297
    invoke-static {p1}, Lcom/friday/document/view/share/ShareSearchActivity;->U(Lcom/friday/document/view/share/ShareSearchActivity;)Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    iget-object v0, v8, Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;->d:Lcom/friday/document/model/ShareFile;

    .line 302
    .line 303
    invoke-virtual {p1, v0}, Lcom/friday/document/viewmodel/StudentShareViewModel;->F(Lcom/friday/document/model/ShareFile;)V

    .line 304
    .line 305
    .line 306
    goto :goto_7

    .line 307
    :cond_12
    :goto_4
    iget-object p1, v8, Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;->e:Lcom/friday/document/view/share/ShareSearchActivity;

    .line 308
    .line 309
    invoke-static {p1}, Lcom/friday/document/view/share/ShareSearchActivity;->U(Lcom/friday/document/view/share/ShareSearchActivity;)Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 310
    .line 311
    .line 312
    move-result-object v5

    .line 313
    iget-object v6, v8, Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;->d:Lcom/friday/document/model/ShareFile;

    .line 314
    .line 315
    iput v4, v8, Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;->c:I

    .line 316
    .line 317
    const/4 v7, 0x0

    .line 318
    const/4 v9, 0x2

    .line 319
    const/4 v10, 0x0

    .line 320
    invoke-static/range {v5 .. v10}, Lcom/friday/document/viewmodel/StudentShareViewModel;->q(Lcom/friday/document/viewmodel/StudentShareViewModel;Lcom/friday/document/model/ShareFile;ZLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    if-ne p1, v0, :cond_13

    .line 325
    .line 326
    :goto_5
    return-object v0

    .line 327
    :cond_13
    :goto_6
    check-cast p1, Ljava/lang/Boolean;

    .line 328
    .line 329
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 330
    .line 331
    .line 332
    move-result p1

    .line 333
    if-nez p1, :cond_15

    .line 334
    .line 335
    sget-object p1, Lf2/c;->a:Lf2/c;

    .line 336
    .line 337
    invoke-virtual {p1}, Lf2/c;->e()Z

    .line 338
    .line 339
    .line 340
    move-result p1

    .line 341
    if-nez p1, :cond_14

    .line 342
    .line 343
    sget p1, Lcom/friday/document/R$string;->dis_net:I

    .line 344
    .line 345
    invoke-static {p1}, Lz1/b;->h(I)V

    .line 346
    .line 347
    .line 348
    goto :goto_7

    .line 349
    :cond_14
    iget-object p1, v8, Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;->e:Lcom/friday/document/view/share/ShareSearchActivity;

    .line 350
    .line 351
    invoke-virtual {p1, v4}, Lcom/friday/common/base/BaseActivity;->isShowLoading(Z)V

    .line 352
    .line 353
    .line 354
    iget-object p1, v8, Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;->e:Lcom/friday/document/view/share/ShareSearchActivity;

    .line 355
    .line 356
    invoke-static {p1}, Lcom/friday/document/view/share/ShareSearchActivity;->U(Lcom/friday/document/view/share/ShareSearchActivity;)Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 357
    .line 358
    .line 359
    move-result-object p1

    .line 360
    iget-object v0, v8, Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;->d:Lcom/friday/document/model/ShareFile;

    .line 361
    .line 362
    invoke-virtual {p1, v0}, Lcom/friday/document/viewmodel/StudentShareViewModel;->r(Lcom/friday/document/model/ShareFile;)V

    .line 363
    .line 364
    .line 365
    goto :goto_7

    .line 366
    :cond_15
    iget-object p1, v8, Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;->e:Lcom/friday/document/view/share/ShareSearchActivity;

    .line 367
    .line 368
    invoke-static {p1}, Lcom/friday/document/view/share/ShareSearchActivity;->U(Lcom/friday/document/view/share/ShareSearchActivity;)Lcom/friday/document/viewmodel/StudentShareViewModel;

    .line 369
    .line 370
    .line 371
    move-result-object p1

    .line 372
    iget-object v0, v8, Lcom/friday/document/view/share/ShareSearchActivity$initView$4$1$1;->d:Lcom/friday/document/model/ShareFile;

    .line 373
    .line 374
    invoke-virtual {p1, v0}, Lcom/friday/document/viewmodel/StudentShareViewModel;->s(Lcom/friday/document/model/ShareFile;)V

    .line 375
    .line 376
    .line 377
    :goto_7
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 378
    .line 379
    return-object p1
.end method
