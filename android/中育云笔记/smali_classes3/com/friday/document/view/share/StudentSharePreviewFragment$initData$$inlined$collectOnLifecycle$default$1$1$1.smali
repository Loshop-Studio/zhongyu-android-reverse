.class public final Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvd/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/friday/document/view/share/StudentSharePreviewFragment;


# direct methods
.method public constructor <init>(Lcom/friday/document/view/share/StudentSharePreviewFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1;->c:Lcom/friday/document/view/share/StudentSharePreviewFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p2, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1$1;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1$1;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1$1;-><init>(Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1$1;->c:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1$1;->d:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v4, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    iget-object p1, v0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1$1;->i:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Lcom/friday/document/model/ShareFile;

    .line 44
    .line 45
    iget-object p1, v0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1$1;->h:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, Lcom/friday/document/model/ShareFile;

    .line 48
    .line 49
    iget-object p1, v0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1$1;->g:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p1, Lvc/c;

    .line 52
    .line 53
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto/16 :goto_3

    .line 57
    .line 58
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw p1

    .line 66
    :cond_2
    iget p1, v0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1$1;->j:I

    .line 67
    .line 68
    iget-object v2, v0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1$1;->i:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v2, Lcom/friday/document/model/ShareFile;

    .line 71
    .line 72
    iget-object v4, v0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1$1;->h:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v4, Lcom/friday/document/model/ShareFile;

    .line 75
    .line 76
    iget-object v5, v0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1$1;->g:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v5, Lvc/c;

    .line 79
    .line 80
    iget-object v6, v0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1$1;->f:Ljava/lang/Object;

    .line 81
    .line 82
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    move-object v9, v5

    .line 86
    move v5, p1

    .line 87
    move-object p1, v6

    .line 88
    move-object v6, v9

    .line 89
    goto :goto_1

    .line 90
    :cond_3
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    move-object v2, p1

    .line 94
    check-cast v2, Lcom/friday/document/model/ShareFile;

    .line 95
    .line 96
    if-eqz v2, :cond_4

    .line 97
    .line 98
    invoke-virtual {v2}, Lcom/friday/document/model/ShareFile;->getFileUrl()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    :cond_4
    if-nez v2, :cond_5

    .line 102
    .line 103
    iget-object p1, p0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1;->c:Lcom/friday/document/view/share/StudentSharePreviewFragment;

    .line 104
    .line 105
    invoke-static {p1}, Lcom/friday/document/view/share/StudentSharePreviewFragment;->s(Lcom/friday/document/view/share/StudentSharePreviewFragment;)V

    .line 106
    .line 107
    .line 108
    goto/16 :goto_3

    .line 109
    .line 110
    :cond_5
    invoke-virtual {v2}, Lcom/friday/document/model/ShareFile;->getType()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    const-string v5, "0"

    .line 115
    .line 116
    invoke-static {p2, v5}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result p2

    .line 120
    if-eqz p2, :cond_6

    .line 121
    .line 122
    iget-object p1, p0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1;->c:Lcom/friday/document/view/share/StudentSharePreviewFragment;

    .line 123
    .line 124
    invoke-static {p1}, Lcom/friday/document/view/share/StudentSharePreviewFragment;->s(Lcom/friday/document/view/share/StudentSharePreviewFragment;)V

    .line 125
    .line 126
    .line 127
    goto/16 :goto_3

    .line 128
    .line 129
    :cond_6
    iget-object p2, p0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1;->c:Lcom/friday/document/view/share/StudentSharePreviewFragment;

    .line 130
    .line 131
    invoke-static {p2, v2}, Lcom/friday/document/view/share/StudentSharePreviewFragment;->A(Lcom/friday/document/view/share/StudentSharePreviewFragment;Lcom/friday/document/model/ShareFile;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2}, Lcom/friday/document/model/ShareFile;->isAV()Z

    .line 135
    .line 136
    .line 137
    move-result p2

    .line 138
    if-eqz p2, :cond_7

    .line 139
    .line 140
    iget-object p1, p0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1;->c:Lcom/friday/document/view/share/StudentSharePreviewFragment;

    .line 141
    .line 142
    invoke-static {p1, v2}, Lcom/friday/document/view/share/StudentSharePreviewFragment;->y(Lcom/friday/document/view/share/StudentSharePreviewFragment;Lcom/friday/document/model/ShareFile;)V

    .line 143
    .line 144
    .line 145
    goto/16 :goto_3

    .line 146
    .line 147
    :cond_7
    iget-object p2, p0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1;->c:Lcom/friday/document/view/share/StudentSharePreviewFragment;

    .line 148
    .line 149
    invoke-static {p2}, Lcom/friday/document/view/share/StudentSharePreviewFragment;->z(Lcom/friday/document/view/share/StudentSharePreviewFragment;)Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 150
    .line 151
    .line 152
    move-result-object p2

    .line 153
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    iput-object v5, v0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1$1;->f:Ljava/lang/Object;

    .line 158
    .line 159
    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    iput-object v5, v0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1$1;->g:Ljava/lang/Object;

    .line 164
    .line 165
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    iput-object v5, v0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1$1;->h:Ljava/lang/Object;

    .line 170
    .line 171
    iput-object v2, v0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1$1;->i:Ljava/lang/Object;

    .line 172
    .line 173
    const/4 v5, 0x0

    .line 174
    iput v5, v0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1$1;->j:I

    .line 175
    .line 176
    iput v4, v0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1$1;->d:I

    .line 177
    .line 178
    invoke-virtual {p2, v2, v5, v0}, Lcom/friday/document/viewmodel/ShareBaseViewModel;->s(Lcom/friday/document/model/ShareFile;ZLvc/c;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p2

    .line 182
    if-ne p2, v1, :cond_8

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_8
    move-object v6, v0

    .line 186
    move-object v4, v2

    .line 187
    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    .line 188
    .line 189
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 190
    .line 191
    .line 192
    move-result p2

    .line 193
    if-nez p2, :cond_9

    .line 194
    .line 195
    iget-object p1, p0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1;->c:Lcom/friday/document/view/share/StudentSharePreviewFragment;

    .line 196
    .line 197
    invoke-static {p1}, Lcom/friday/document/view/share/StudentSharePreviewFragment;->s(Lcom/friday/document/view/share/StudentSharePreviewFragment;)V

    .line 198
    .line 199
    .line 200
    goto/16 :goto_3

    .line 201
    .line 202
    :cond_9
    invoke-virtual {v2}, Lcom/friday/document/model/ShareFile;->getType()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object p2

    .line 206
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 207
    .line 208
    .line 209
    move-result v7

    .line 210
    const/16 v8, 0x31

    .line 211
    .line 212
    if-eq v7, v8, :cond_e

    .line 213
    .line 214
    packed-switch v7, :pswitch_data_0

    .line 215
    .line 216
    .line 217
    packed-switch v7, :pswitch_data_1

    .line 218
    .line 219
    .line 220
    goto/16 :goto_3

    .line 221
    .line 222
    :pswitch_0
    const-string p1, "12"

    .line 223
    .line 224
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result p1

    .line 228
    if-nez p1, :cond_f

    .line 229
    .line 230
    goto/16 :goto_3

    .line 231
    .line 232
    :pswitch_1
    const-string v7, "11"

    .line 233
    .line 234
    invoke-virtual {p2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result p2

    .line 238
    if-nez p2, :cond_a

    .line 239
    .line 240
    goto/16 :goto_3

    .line 241
    .line 242
    :cond_a
    iget-object p2, p0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1;->c:Lcom/friday/document/view/share/StudentSharePreviewFragment;

    .line 243
    .line 244
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    iput-object p1, v0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1$1;->f:Ljava/lang/Object;

    .line 249
    .line 250
    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    iput-object p1, v0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1$1;->g:Ljava/lang/Object;

    .line 255
    .line 256
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    iput-object p1, v0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1$1;->h:Ljava/lang/Object;

    .line 261
    .line 262
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    iput-object p1, v0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1$1;->i:Ljava/lang/Object;

    .line 267
    .line 268
    iput v5, v0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1$1;->j:I

    .line 269
    .line 270
    iput v3, v0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1$1;->d:I

    .line 271
    .line 272
    invoke-static {p2, v2, v0}, Lcom/friday/document/view/share/StudentSharePreviewFragment;->t(Lcom/friday/document/view/share/StudentSharePreviewFragment;Lcom/friday/document/model/ShareFile;Lvc/c;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    if-ne p1, v1, :cond_10

    .line 277
    .line 278
    :goto_2
    return-object v1

    .line 279
    :pswitch_2
    const-string p1, "10"

    .line 280
    .line 281
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result p1

    .line 285
    if-nez p1, :cond_d

    .line 286
    .line 287
    goto :goto_3

    .line 288
    :pswitch_3
    const-string p1, "7"

    .line 289
    .line 290
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result p1

    .line 294
    if-nez p1, :cond_b

    .line 295
    .line 296
    goto :goto_3

    .line 297
    :cond_b
    iget-object p1, p0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1;->c:Lcom/friday/document/view/share/StudentSharePreviewFragment;

    .line 298
    .line 299
    invoke-static {p1, v2}, Lcom/friday/document/view/share/StudentSharePreviewFragment;->w(Lcom/friday/document/view/share/StudentSharePreviewFragment;Lcom/friday/document/model/ShareFile;)V

    .line 300
    .line 301
    .line 302
    goto :goto_3

    .line 303
    :pswitch_4
    const-string p1, "6"

    .line 304
    .line 305
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result p1

    .line 309
    if-nez p1, :cond_c

    .line 310
    .line 311
    goto :goto_3

    .line 312
    :cond_c
    iget-object p1, p0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1;->c:Lcom/friday/document/view/share/StudentSharePreviewFragment;

    .line 313
    .line 314
    invoke-static {p1, v2}, Lcom/friday/document/view/share/StudentSharePreviewFragment;->x(Lcom/friday/document/view/share/StudentSharePreviewFragment;Lcom/friday/document/model/ShareFile;)V

    .line 315
    .line 316
    .line 317
    goto :goto_3

    .line 318
    :pswitch_5
    const-string p1, "5"

    .line 319
    .line 320
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result p1

    .line 324
    if-nez p1, :cond_d

    .line 325
    .line 326
    goto :goto_3

    .line 327
    :pswitch_6
    const-string p1, "4"

    .line 328
    .line 329
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result p1

    .line 333
    if-nez p1, :cond_d

    .line 334
    .line 335
    goto :goto_3

    .line 336
    :pswitch_7
    const-string p1, "3"

    .line 337
    .line 338
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    move-result p1

    .line 342
    if-nez p1, :cond_d

    .line 343
    .line 344
    goto :goto_3

    .line 345
    :cond_d
    iget-object p1, p0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1;->c:Lcom/friday/document/view/share/StudentSharePreviewFragment;

    .line 346
    .line 347
    invoke-static {p1, v2}, Lcom/friday/document/view/share/StudentSharePreviewFragment;->v(Lcom/friday/document/view/share/StudentSharePreviewFragment;Lcom/friday/document/model/ShareFile;)V

    .line 348
    .line 349
    .line 350
    goto :goto_3

    .line 351
    :cond_e
    const-string p1, "1"

    .line 352
    .line 353
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 354
    .line 355
    .line 356
    move-result p1

    .line 357
    if-nez p1, :cond_f

    .line 358
    .line 359
    goto :goto_3

    .line 360
    :cond_f
    iget-object p1, p0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1$1$1;->c:Lcom/friday/document/view/share/StudentSharePreviewFragment;

    .line 361
    .line 362
    invoke-static {p1, v2}, Lcom/friday/document/view/share/StudentSharePreviewFragment;->u(Lcom/friday/document/view/share/StudentSharePreviewFragment;Lcom/friday/document/model/ShareFile;)V

    .line 363
    .line 364
    .line 365
    :cond_10
    :goto_3
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 366
    .line 367
    return-object p1

    .line 368
    nop

    .line 369
    :pswitch_data_0
    .packed-switch 0x33
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    :pswitch_data_1
    .packed-switch 0x61f
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
