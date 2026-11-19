.class final Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/viewer/TxtEditActivity;->onBackPressed()V
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
    c = "com.friday.document.view.viewer.TxtEditActivity$onBackPressed$1"
    f = "TxtEditActivity.kt"
    l = {
        0xea,
        0x107
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Z

.field public g:I

.field public final synthetic h:Lcom/friday/document/view/viewer/TxtEditActivity;


# direct methods
.method public constructor <init>(Lcom/friday/document/view/viewer/TxtEditActivity;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1;->h:Lcom/friday/document/view/viewer/TxtEditActivity;

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
    new-instance p1, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1;->h:Lcom/friday/document/view/viewer/TxtEditActivity;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1;-><init>(Lcom/friday/document/view/viewer/TxtEditActivity;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v2, v0, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1;->g:I

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    const/4 v4, 0x1

    .line 11
    if-eqz v2, :cond_2

    .line 12
    .line 13
    if-eq v2, v4, :cond_1

    .line 14
    .line 15
    if-ne v2, v3, :cond_0

    .line 16
    .line 17
    iget-object v1, v0, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 20
    .line 21
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto/16 :goto_2

    .line 25
    .line 26
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 29
    .line 30
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v1

    .line 34
    :cond_1
    iget-object v1, v0, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1;->e:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, Ljava/io/File;

    .line 37
    .line 38
    iget-object v1, v0, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1;->d:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Ljava/io/File;

    .line 41
    .line 42
    iget-object v1, v0, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 45
    .line 46
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto/16 :goto_0

    .line 50
    .line 51
    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object v2, v0, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1;->h:Lcom/friday/document/view/viewer/TxtEditActivity;

    .line 55
    .line 56
    iget-boolean v5, v2, Lcom/friday/document/view/viewer/TxtEditActivity;->m:Z

    .line 57
    .line 58
    if-nez v5, :cond_3

    .line 59
    .line 60
    invoke-virtual {v2}, Landroid/app/Activity;->finish()V

    .line 61
    .line 62
    .line 63
    sget-object v1, Lqc/q;->a:Lqc/q;

    .line 64
    .line 65
    return-object v1

    .line 66
    :cond_3
    new-instance v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 67
    .line 68
    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 69
    .line 70
    .line 71
    iget-object v5, v0, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1;->h:Lcom/friday/document/view/viewer/TxtEditActivity;

    .line 72
    .line 73
    invoke-static {v5}, Lcom/friday/document/view/viewer/TxtEditActivity;->U(Lcom/friday/document/view/viewer/TxtEditActivity;)Lcom/friday/document/databinding/ActivityTxtEditBinding;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    iget-object v5, v5, Lcom/friday/document/databinding/ActivityTxtEditBinding;->c:Lcom/zykj/view/widget/LimitEditText;

    .line 78
    .line 79
    invoke-virtual {v5}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    iput-object v5, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v5, Ljava/lang/CharSequence;

    .line 90
    .line 91
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    if-eqz v5, :cond_4

    .line 96
    .line 97
    const-string v5, " "

    .line 98
    .line 99
    iput-object v5, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 100
    .line 101
    :cond_4
    iget-object v5, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 102
    .line 103
    move-object v6, v5

    .line 104
    check-cast v6, Ljava/lang/String;

    .line 105
    .line 106
    const/4 v10, 0x4

    .line 107
    const/4 v11, 0x0

    .line 108
    const-string v7, "\n"

    .line 109
    .line 110
    const-string v8, "\r\n"

    .line 111
    .line 112
    const/4 v9, 0x0

    .line 113
    invoke-static/range {v6 .. v11}, Lqd/z;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    iget-object v5, v0, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1;->h:Lcom/friday/document/view/viewer/TxtEditActivity;

    .line 117
    .line 118
    iget-object v5, v5, Lcom/friday/document/view/viewer/TxtEditActivity;->h:Ljava/lang/String;

    .line 119
    .line 120
    const-string v6, ""

    .line 121
    .line 122
    invoke-static {v5, v6}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    const-string v7, "forName(...)"

    .line 127
    .line 128
    const-string v8, "GB2312"

    .line 129
    .line 130
    const/4 v9, 0x0

    .line 131
    if-eqz v5, :cond_9

    .line 132
    .line 133
    iget-object v5, v0, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1;->h:Lcom/friday/document/view/viewer/TxtEditActivity;

    .line 134
    .line 135
    invoke-static {v5}, Lcom/friday/document/view/viewer/TxtEditActivity;->T(Lcom/friday/document/view/viewer/TxtEditActivity;)Lcom/friday/common/entity/FileEntity;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    if-nez v5, :cond_9

    .line 140
    .line 141
    iget-object v3, v0, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1;->h:Lcom/friday/document/view/viewer/TxtEditActivity;

    .line 142
    .line 143
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    invoke-virtual {v5}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    const-string v10, "toString(...)"

    .line 152
    .line 153
    invoke-static {v5, v10}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    new-instance v10, Lkotlin/text/Regex;

    .line 157
    .line 158
    const-string v11, "-"

    .line 159
    .line 160
    invoke-direct {v10, v11}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v10, v5, v6}, Lkotlin/text/Regex;->m(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    iput-object v5, v3, Lcom/friday/document/view/viewer/TxtEditActivity;->h:Ljava/lang/String;

    .line 168
    .line 169
    new-instance v3, Ljava/io/File;

    .line 170
    .line 171
    sget-object v5, Lz1/a;->a:Lz1/a$a;

    .line 172
    .line 173
    invoke-virtual {v5}, Lz1/a$a;->a()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    sget-object v6, Ljava/io/File;->separator:Ljava/lang/String;

    .line 178
    .line 179
    iget-object v10, v0, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1;->h:Lcom/friday/document/view/viewer/TxtEditActivity;

    .line 180
    .line 181
    iget-object v10, v10, Lcom/friday/document/view/viewer/TxtEditActivity;->h:Ljava/lang/String;

    .line 182
    .line 183
    new-instance v11, Ljava/lang/StringBuilder;

    .line 184
    .line 185
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    const-string v5, "txt"

    .line 195
    .line 196
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v5

    .line 209
    invoke-direct {v3, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    invoke-static {v3}, Lcom/blankj/utilcode/util/FileUtils;->createOrExistsDir(Ljava/io/File;)Z

    .line 213
    .line 214
    .line 215
    new-instance v5, Ljava/io/File;

    .line 216
    .line 217
    iget-object v10, v0, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1;->h:Lcom/friday/document/view/viewer/TxtEditActivity;

    .line 218
    .line 219
    iget-object v10, v10, Lcom/friday/document/view/viewer/TxtEditActivity;->h:Ljava/lang/String;

    .line 220
    .line 221
    new-instance v11, Ljava/lang/StringBuilder;

    .line 222
    .line 223
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    const-string v10, ".txt"

    .line 230
    .line 231
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v11

    .line 238
    invoke-direct {v5, v3, v11}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    invoke-static {v5}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/io/File;)Z

    .line 242
    .line 243
    .line 244
    move-result v11

    .line 245
    if-eqz v11, :cond_5

    .line 246
    .line 247
    invoke-static {v5}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/io/File;)Z

    .line 248
    .line 249
    .line 250
    :cond_5
    invoke-static {v5}, Lcom/blankj/utilcode/util/FileUtils;->createOrExistsFile(Ljava/io/File;)Z

    .line 251
    .line 252
    .line 253
    move-result v11

    .line 254
    if-nez v11, :cond_7

    .line 255
    .line 256
    invoke-static {}, Lsd/r0;->c()Lsd/t1;

    .line 257
    .line 258
    .line 259
    move-result-object v6

    .line 260
    new-instance v7, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1$1;

    .line 261
    .line 262
    iget-object v8, v0, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1;->h:Lcom/friday/document/view/viewer/TxtEditActivity;

    .line 263
    .line 264
    invoke-direct {v7, v8, v9}, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1$1;-><init>(Lcom/friday/document/view/viewer/TxtEditActivity;Lvc/c;)V

    .line 265
    .line 266
    .line 267
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    iput-object v2, v0, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1;->c:Ljava/lang/Object;

    .line 272
    .line 273
    invoke-static {v3}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    iput-object v2, v0, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1;->d:Ljava/lang/Object;

    .line 278
    .line 279
    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    iput-object v2, v0, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1;->e:Ljava/lang/Object;

    .line 284
    .line 285
    iput-boolean v11, v0, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1;->f:Z

    .line 286
    .line 287
    iput v4, v0, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1;->g:I

    .line 288
    .line 289
    invoke-static {v6, v7, v0}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    if-ne v2, v1, :cond_6

    .line 294
    .line 295
    goto/16 :goto_1

    .line 296
    .line 297
    :cond_6
    :goto_0
    sget-object v1, Lqc/q;->a:Lqc/q;

    .line 298
    .line 299
    return-object v1

    .line 300
    :cond_7
    new-instance v1, Ljava/io/File;

    .line 301
    .line 302
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v4

    .line 306
    invoke-direct {v1, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    iget-object v2, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast v2, Ljava/lang/String;

    .line 312
    .line 313
    invoke-static {v8}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 314
    .line 315
    .line 316
    move-result-object v4

    .line 317
    invoke-static {v4, v7}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    invoke-static {v1, v2, v4}, Lcd/g;->f(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;)V

    .line 321
    .line 322
    .line 323
    iget-object v1, v0, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1;->h:Lcom/friday/document/view/viewer/TxtEditActivity;

    .line 324
    .line 325
    invoke-static {v1}, Lcom/friday/document/view/viewer/TxtEditActivity;->V(Lcom/friday/document/view/viewer/TxtEditActivity;)Lcom/friday/document/viewmodel/TxtEditViewModel;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    new-instance v11, Lcom/friday/common/entity/CreateNoteInput;

    .line 330
    .line 331
    iget-object v2, v0, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1;->h:Lcom/friday/document/view/viewer/TxtEditActivity;

    .line 332
    .line 333
    iget-object v12, v2, Lcom/friday/document/view/viewer/TxtEditActivity;->h:Ljava/lang/String;

    .line 334
    .line 335
    iget-object v2, v2, Lcom/friday/document/view/viewer/TxtEditActivity;->j:Ljava/lang/String;

    .line 336
    .line 337
    new-instance v4, Ljava/lang/StringBuilder;

    .line 338
    .line 339
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v13

    .line 352
    iget-object v2, v0, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1;->h:Lcom/friday/document/view/viewer/TxtEditActivity;

    .line 353
    .line 354
    iget-object v2, v2, Lcom/friday/document/view/viewer/TxtEditActivity;->i:Ljava/lang/String;

    .line 355
    .line 356
    if-nez v2, :cond_8

    .line 357
    .line 358
    const-string v2, "0"

    .line 359
    .line 360
    :cond_8
    move-object v14, v2

    .line 361
    sget-object v2, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 362
    .line 363
    invoke-virtual {v2}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 364
    .line 365
    .line 366
    move-result-object v2

    .line 367
    invoke-virtual {v2}, Lcom/friday/common/helper/b;->t()J

    .line 368
    .line 369
    .line 370
    move-result-wide v15

    .line 371
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v2

    .line 375
    new-instance v3, Ljava/lang/StringBuilder;

    .line 376
    .line 377
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 384
    .line 385
    .line 386
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v17

    .line 390
    const-string v18, "6"

    .line 391
    .line 392
    invoke-direct/range {v11 .. v18}, Lcom/friday/common/entity/CreateNoteInput;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v1, v11}, Lcom/friday/document/viewmodel/TxtEditViewModel;->h(Lcom/friday/common/entity/CreateNoteInput;)V

    .line 396
    .line 397
    .line 398
    goto/16 :goto_2

    .line 399
    .line 400
    :cond_9
    iget-object v5, v0, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1;->h:Lcom/friday/document/view/viewer/TxtEditActivity;

    .line 401
    .line 402
    invoke-static {v5}, Lcom/friday/document/view/viewer/TxtEditActivity;->U(Lcom/friday/document/view/viewer/TxtEditActivity;)Lcom/friday/document/databinding/ActivityTxtEditBinding;

    .line 403
    .line 404
    .line 405
    move-result-object v5

    .line 406
    iget-object v5, v5, Lcom/friday/document/databinding/ActivityTxtEditBinding;->c:Lcom/zykj/view/widget/LimitEditText;

    .line 407
    .line 408
    invoke-virtual {v5}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 409
    .line 410
    .line 411
    move-result-object v5

    .line 412
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v5

    .line 416
    iget-object v6, v0, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1;->h:Lcom/friday/document/view/viewer/TxtEditActivity;

    .line 417
    .line 418
    invoke-static {v6}, Lcom/friday/document/view/viewer/TxtEditActivity;->W(Lcom/friday/document/view/viewer/TxtEditActivity;)Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v6

    .line 422
    invoke-static {v5, v6}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    move-result v5

    .line 426
    if-eqz v5, :cond_a

    .line 427
    .line 428
    iget-object v1, v0, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1;->h:Lcom/friday/document/view/viewer/TxtEditActivity;

    .line 429
    .line 430
    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    .line 431
    .line 432
    .line 433
    sget-object v1, Lqc/q;->a:Lqc/q;

    .line 434
    .line 435
    return-object v1

    .line 436
    :cond_a
    iget-object v5, v0, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1;->h:Lcom/friday/document/view/viewer/TxtEditActivity;

    .line 437
    .line 438
    invoke-static {v5}, Lcom/friday/document/view/viewer/TxtEditActivity;->T(Lcom/friday/document/view/viewer/TxtEditActivity;)Lcom/friday/common/entity/FileEntity;

    .line 439
    .line 440
    .line 441
    move-result-object v5

    .line 442
    if-eqz v5, :cond_c

    .line 443
    .line 444
    iget-object v1, v0, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1;->h:Lcom/friday/document/view/viewer/TxtEditActivity;

    .line 445
    .line 446
    invoke-virtual {v5}, Lcom/friday/common/entity/FileEntity;->getTxtFilePath()Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v3

    .line 450
    invoke-static {v3}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 451
    .line 452
    .line 453
    move-result v3

    .line 454
    if-nez v3, :cond_b

    .line 455
    .line 456
    invoke-virtual {v5}, Lcom/friday/common/entity/FileEntity;->getTxtFilePath()Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v3

    .line 460
    invoke-static {v3}, Lcom/blankj/utilcode/util/FileUtils;->createOrExistsFile(Ljava/lang/String;)Z

    .line 461
    .line 462
    .line 463
    :cond_b
    new-instance v3, Ljava/io/File;

    .line 464
    .line 465
    invoke-virtual {v5}, Lcom/friday/common/entity/FileEntity;->getTxtFilePath()Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v6

    .line 469
    invoke-direct {v3, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 470
    .line 471
    .line 472
    iget-object v2, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 473
    .line 474
    check-cast v2, Ljava/lang/String;

    .line 475
    .line 476
    invoke-static {v8}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 477
    .line 478
    .line 479
    move-result-object v6

    .line 480
    invoke-static {v6, v7}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 481
    .line 482
    .line 483
    invoke-static {v3, v2, v6}, Lcd/g;->f(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;)V

    .line 484
    .line 485
    .line 486
    invoke-static {v1}, Lcom/friday/document/view/viewer/TxtEditActivity;->V(Lcom/friday/document/view/viewer/TxtEditActivity;)Lcom/friday/document/viewmodel/TxtEditViewModel;

    .line 487
    .line 488
    .line 489
    move-result-object v2

    .line 490
    iget-object v1, v1, Lcom/friday/document/view/viewer/TxtEditActivity;->h:Ljava/lang/String;

    .line 491
    .line 492
    invoke-virtual {v5}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v3

    .line 496
    invoke-virtual {v2, v1, v3, v4}, Lcom/friday/document/viewmodel/TxtEditViewModel;->n(Ljava/lang/String;Ljava/lang/String;I)V

    .line 497
    .line 498
    .line 499
    goto :goto_2

    .line 500
    :cond_c
    invoke-static {}, Lsd/r0;->c()Lsd/t1;

    .line 501
    .line 502
    .line 503
    move-result-object v4

    .line 504
    new-instance v5, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1$3;

    .line 505
    .line 506
    iget-object v6, v0, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1;->h:Lcom/friday/document/view/viewer/TxtEditActivity;

    .line 507
    .line 508
    invoke-direct {v5, v6, v9}, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1$3;-><init>(Lcom/friday/document/view/viewer/TxtEditActivity;Lvc/c;)V

    .line 509
    .line 510
    .line 511
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v2

    .line 515
    iput-object v2, v0, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1;->c:Ljava/lang/Object;

    .line 516
    .line 517
    iput v3, v0, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1;->g:I

    .line 518
    .line 519
    invoke-static {v4, v5, v0}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    move-result-object v2

    .line 523
    if-ne v2, v1, :cond_d

    .line 524
    .line 525
    :goto_1
    return-object v1

    .line 526
    :cond_d
    :goto_2
    sget-object v1, Lqc/q;->a:Lqc/q;

    .line 527
    .line 528
    return-object v1
.end method
