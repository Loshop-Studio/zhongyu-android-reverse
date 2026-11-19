.class final Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/RecycleBinPreviewFragment;->initData()V
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
    c = "com.friday.document.view.RecycleBinPreviewFragment$initData$3$1"
    f = "RecycleBinPreviewFragment.kt"
    l = {
        0x52,
        0x56,
        0x5d,
        0x69
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:I

.field public f:I

.field public final synthetic g:Lcom/friday/common/entity/FileEntity;

.field public final synthetic h:Lcom/friday/document/view/RecycleBinPreviewFragment;


# direct methods
.method public constructor <init>(Lcom/friday/common/entity/FileEntity;Lcom/friday/document/view/RecycleBinPreviewFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->g:Lcom/friday/common/entity/FileEntity;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->h:Lcom/friday/document/view/RecycleBinPreviewFragment;

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
    new-instance p1, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->g:Lcom/friday/common/entity/FileEntity;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->h:Lcom/friday/document/view/RecycleBinPreviewFragment;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;-><init>(Lcom/friday/common/entity/FileEntity;Lcom/friday/document/view/RecycleBinPreviewFragment;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->f:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x4

    .line 10
    const/4 v5, 0x3

    .line 11
    const/4 v6, 0x2

    .line 12
    const/4 v7, 0x1

    .line 13
    if-eqz v1, :cond_4

    .line 14
    .line 15
    if-eq v1, v7, :cond_3

    .line 16
    .line 17
    if-eq v1, v6, :cond_2

    .line 18
    .line 19
    if-eq v1, v5, :cond_1

    .line 20
    .line 21
    if-ne v1, v4, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->c:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Ljava/lang/String;

    .line 26
    .line 27
    :goto_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto/16 :goto_7

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
    iget-object v0, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->d:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Ljava/util/List;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto/16 :goto_2

    .line 49
    .line 50
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto/16 :goto_1

    .line 54
    .line 55
    :cond_4
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->g:Lcom/friday/common/entity/FileEntity;

    .line 59
    .line 60
    if-nez p1, :cond_5

    .line 61
    .line 62
    iget-object p1, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->h:Lcom/friday/document/view/RecycleBinPreviewFragment;

    .line 63
    .line 64
    invoke-static {p1}, Lcom/friday/document/view/RecycleBinPreviewFragment;->B(Lcom/friday/document/view/RecycleBinPreviewFragment;)V

    .line 65
    .line 66
    .line 67
    goto/16 :goto_8

    .line 68
    .line 69
    :cond_5
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    const/16 v8, 0x30

    .line 78
    .line 79
    if-eq v1, v8, :cond_f

    .line 80
    .line 81
    const/16 v8, 0x31

    .line 82
    .line 83
    if-eq v1, v8, :cond_a

    .line 84
    .line 85
    const/16 v8, 0x36

    .line 86
    .line 87
    if-eq v1, v8, :cond_7

    .line 88
    .line 89
    const/16 v4, 0x621

    .line 90
    .line 91
    if-eq v1, v4, :cond_6

    .line 92
    .line 93
    goto/16 :goto_4

    .line 94
    .line 95
    :cond_6
    const-string v1, "12"

    .line 96
    .line 97
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-nez p1, :cond_b

    .line 102
    .line 103
    goto/16 :goto_4

    .line 104
    .line 105
    :cond_7
    const-string v1, "6"

    .line 106
    .line 107
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-nez p1, :cond_8

    .line 112
    .line 113
    goto/16 :goto_4

    .line 114
    .line 115
    :cond_8
    iget-object p1, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->g:Lcom/friday/common/entity/FileEntity;

    .line 116
    .line 117
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getTxtFilePath()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-nez v1, :cond_9

    .line 126
    .line 127
    iget-object p1, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->h:Lcom/friday/document/view/RecycleBinPreviewFragment;

    .line 128
    .line 129
    invoke-static {p1}, Lcom/friday/document/view/RecycleBinPreviewFragment;->B(Lcom/friday/document/view/RecycleBinPreviewFragment;)V

    .line 130
    .line 131
    .line 132
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 133
    .line 134
    return-object p1

    .line 135
    :cond_9
    iget-object v1, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->h:Lcom/friday/document/view/RecycleBinPreviewFragment;

    .line 136
    .line 137
    iget-object v2, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->g:Lcom/friday/common/entity/FileEntity;

    .line 138
    .line 139
    invoke-virtual {v2}, Lcom/friday/common/entity/FileEntity;->getTxtFilePath()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    iput-object p1, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->c:Ljava/lang/Object;

    .line 148
    .line 149
    iput v4, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->f:I

    .line 150
    .line 151
    invoke-static {v1, v2, p0}, Lcom/friday/document/view/RecycleBinPreviewFragment;->E(Lcom/friday/document/view/RecycleBinPreviewFragment;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    if-ne p1, v0, :cond_13

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_a
    const-string v1, "1"

    .line 159
    .line 160
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result p1

    .line 164
    if-nez p1, :cond_b

    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_b
    iget-object p1, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->h:Lcom/friday/document/view/RecycleBinPreviewFragment;

    .line 168
    .line 169
    invoke-static {p1}, Lcom/friday/document/view/RecycleBinPreviewFragment;->H(Lcom/friday/document/view/RecycleBinPreviewFragment;)Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    iget-object v1, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->g:Lcom/friday/common/entity/FileEntity;

    .line 174
    .line 175
    iput v7, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->f:I

    .line 176
    .line 177
    invoke-virtual {p1, v1, p0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->w(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    if-ne p1, v0, :cond_c

    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_c
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 185
    .line 186
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    if-nez p1, :cond_d

    .line 191
    .line 192
    iget-object p1, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->h:Lcom/friday/document/view/RecycleBinPreviewFragment;

    .line 193
    .line 194
    invoke-static {p1}, Lcom/friday/document/view/RecycleBinPreviewFragment;->B(Lcom/friday/document/view/RecycleBinPreviewFragment;)V

    .line 195
    .line 196
    .line 197
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 198
    .line 199
    return-object p1

    .line 200
    :cond_d
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    new-instance v1, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1$1;

    .line 205
    .line 206
    iget-object v4, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->g:Lcom/friday/common/entity/FileEntity;

    .line 207
    .line 208
    iget-object v7, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->h:Lcom/friday/document/view/RecycleBinPreviewFragment;

    .line 209
    .line 210
    invoke-direct {v1, v4, v7, v3}, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1$1;-><init>(Lcom/friday/common/entity/FileEntity;Lcom/friday/document/view/RecycleBinPreviewFragment;Lvc/c;)V

    .line 211
    .line 212
    .line 213
    iput v6, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->f:I

    .line 214
    .line 215
    invoke-static {p1, v1, p0}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    if-ne p1, v0, :cond_e

    .line 220
    .line 221
    goto :goto_3

    .line 222
    :cond_e
    :goto_2
    iget-object v1, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->h:Lcom/friday/document/view/RecycleBinPreviewFragment;

    .line 223
    .line 224
    move-object v4, p1

    .line 225
    check-cast v4, Ljava/util/List;

    .line 226
    .line 227
    invoke-static {}, Lsd/r0;->c()Lsd/t1;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    new-instance v7, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1$2$1;

    .line 232
    .line 233
    invoke-direct {v7, v1, v4, v3}, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1$2$1;-><init>(Lcom/friday/document/view/RecycleBinPreviewFragment;Ljava/util/List;Lvc/c;)V

    .line 234
    .line 235
    .line 236
    iput-object p1, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->c:Ljava/lang/Object;

    .line 237
    .line 238
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    iput-object p1, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->d:Ljava/lang/Object;

    .line 243
    .line 244
    iput v2, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->e:I

    .line 245
    .line 246
    iput v5, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->f:I

    .line 247
    .line 248
    invoke-static {v6, v7, p0}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    if-ne p1, v0, :cond_13

    .line 253
    .line 254
    :goto_3
    return-object v0

    .line 255
    :cond_f
    const-string v0, "0"

    .line 256
    .line 257
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result p1

    .line 261
    if-nez p1, :cond_12

    .line 262
    .line 263
    :goto_4
    iget-object v8, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->h:Lcom/friday/document/view/RecycleBinPreviewFragment;

    .line 264
    .line 265
    iget-object p1, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->g:Lcom/friday/common/entity/FileEntity;

    .line 266
    .line 267
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getOssFileUrl()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v9

    .line 271
    iget-object p1, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->g:Lcom/friday/common/entity/FileEntity;

    .line 272
    .line 273
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v10

    .line 277
    iget-object p1, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->g:Lcom/friday/common/entity/FileEntity;

    .line 278
    .line 279
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v11

    .line 283
    iget-object p1, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->g:Lcom/friday/common/entity/FileEntity;

    .line 284
    .line 285
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    const-string v0, "8"

    .line 290
    .line 291
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result p1

    .line 295
    if-nez p1, :cond_11

    .line 296
    .line 297
    iget-object p1, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->g:Lcom/friday/common/entity/FileEntity;

    .line 298
    .line 299
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object p1

    .line 303
    const-string v0, "9"

    .line 304
    .line 305
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result p1

    .line 309
    if-eqz p1, :cond_10

    .line 310
    .line 311
    goto :goto_5

    .line 312
    :cond_10
    move v12, v2

    .line 313
    goto :goto_6

    .line 314
    :cond_11
    :goto_5
    move v12, v7

    .line 315
    :goto_6
    iget-object v13, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->g:Lcom/friday/common/entity/FileEntity;

    .line 316
    .line 317
    invoke-static/range {v8 .. v13}, Lcom/friday/document/view/RecycleBinPreviewFragment;->C(Lcom/friday/document/view/RecycleBinPreviewFragment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/friday/common/entity/FileEntity;)V

    .line 318
    .line 319
    .line 320
    goto :goto_7

    .line 321
    :cond_12
    iget-object p1, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->h:Lcom/friday/document/view/RecycleBinPreviewFragment;

    .line 322
    .line 323
    invoke-static {p1}, Lcom/friday/document/view/RecycleBinPreviewFragment;->B(Lcom/friday/document/view/RecycleBinPreviewFragment;)V

    .line 324
    .line 325
    .line 326
    :cond_13
    :goto_7
    iget-object p1, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->h:Lcom/friday/document/view/RecycleBinPreviewFragment;

    .line 327
    .line 328
    iget-object v0, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->g:Lcom/friday/common/entity/FileEntity;

    .line 329
    .line 330
    invoke-static {p1, v0}, Lcom/friday/document/view/RecycleBinPreviewFragment;->I(Lcom/friday/document/view/RecycleBinPreviewFragment;Lcom/friday/common/entity/FileEntity;)V

    .line 331
    .line 332
    .line 333
    iget-object p1, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->h:Lcom/friday/document/view/RecycleBinPreviewFragment;

    .line 334
    .line 335
    iget-object v0, p0, Lcom/friday/document/view/RecycleBinPreviewFragment$initData$3$1;->g:Lcom/friday/common/entity/FileEntity;

    .line 336
    .line 337
    invoke-static {p1, v0}, Lcom/friday/document/view/RecycleBinPreviewFragment;->J(Lcom/friday/document/view/RecycleBinPreviewFragment;Lcom/friday/common/entity/FileEntity;)V

    .line 338
    .line 339
    .line 340
    :goto_8
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 341
    .line 342
    return-object p1
.end method
