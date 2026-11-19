.class public final Lcom/zykj/mistake/feature/ask/MistakeAskMaterialViewModel;
.super Landroidx/lifecycle/AndroidViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/zykj/mistake/feature/ask/MistakeAskMaterialViewModel;",
        "Landroidx/lifecycle/AndroidViewModel;",
        "Landroid/app/Application;",
        "application",
        "<init>",
        "(Landroid/app/Application;)V",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMistakeAskMaterialViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeAskMaterialViewModel.kt\ncom/zykj/mistake/feature/ask/MistakeAskMaterialViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,132:1\n230#2,5:133\n230#2,5:172\n230#2,5:185\n774#3:138\n865#3,2:139\n295#3,2:141\n1563#3:143\n1634#3,3:144\n1563#3:148\n1634#3,3:149\n1788#3,4:152\n295#3,2:156\n295#3,2:158\n1563#3:160\n1634#3,2:161\n1563#3:163\n1634#3,3:164\n1788#3,4:167\n1636#3:171\n1563#3:177\n1634#3,2:178\n1563#3:180\n1634#3,3:181\n1636#3:184\n1374#3:190\n1460#3,2:191\n774#3:193\n865#3,2:194\n1462#3,3:196\n1#4:147\n*S KotlinDebug\n*F\n+ 1 MistakeAskMaterialViewModel.kt\ncom/zykj/mistake/feature/ask/MistakeAskMaterialViewModel\n*L\n27#1:133,5\n98#1:172,5\n114#1:185,5\n37#1:138\n37#1:139,2\n38#1:141,2\n41#1:143\n41#1:144,3\n54#1:148\n54#1:149,3\n69#1:152,4\n77#1:156,2\n79#1:158,2\n85#1:160\n85#1:161,2\n89#1:163\n89#1:164,3\n93#1:167,4\n85#1:171\n108#1:177\n108#1:178,2\n109#1:180\n109#1:181,3\n108#1:184\n118#1:190\n118#1:191,2\n119#1:193\n119#1:194,2\n118#1:196,3\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lkotlinx/coroutines/flow/n0;

.field public final b:Lkotlinx/coroutines/flow/a0;

.field public final c:Lkotlinx/coroutines/channels/b;

.field public final d:Lkotlinx/coroutines/flow/c;


# direct methods
.method public constructor <init>(Landroid/app/Application;)V
    .locals 3
    .param p1    # Landroid/app/Application;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "application"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Landroidx/lifecycle/AndroidViewModel;-><init>(Landroid/app/Application;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Lcom/zykj/mistake/feature/ask/z;

    .line 10
    .line 11
    const/16 v0, 0x1f

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-direct {p1, v1, v1, v2, v0}, Lcom/zykj/mistake/feature/ask/z;-><init>(Ljava/util/ArrayList;Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;II)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Lkotlinx/coroutines/flow/h;->b(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n0;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialViewModel;->a:Lkotlinx/coroutines/flow/n0;

    .line 23
    .line 24
    new-instance v0, Lkotlinx/coroutines/flow/a0;

    .line 25
    .line 26
    invoke-direct {v0, p1}, Lkotlinx/coroutines/flow/a0;-><init>(Lkotlinx/coroutines/flow/y;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialViewModel;->b:Lkotlinx/coroutines/flow/a0;

    .line 30
    .line 31
    const/4 p1, 0x7

    .line 32
    invoke-static {v2, p1, v1}, Lkotlinx/coroutines/channels/k;->a(IILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/channels/b;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialViewModel;->c:Lkotlinx/coroutines/channels/b;

    .line 37
    .line 38
    invoke-static {p1}, Lkotlinx/coroutines/flow/h;->l(Lkotlinx/coroutines/channels/b;)Lkotlinx/coroutines/flow/c;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, p0, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialViewModel;->d:Lkotlinx/coroutines/flow/c;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/mistake/feature/ask/u;)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    instance-of v2, v1, Lcom/zykj/mistake/feature/ask/q;

    .line 6
    .line 7
    const/16 v4, 0xa

    .line 8
    .line 9
    iget-object v6, v0, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialViewModel;->a:Lkotlinx/coroutines/flow/n0;

    .line 10
    .line 11
    if-eqz v2, :cond_d

    .line 12
    .line 13
    check-cast v1, Lcom/zykj/mistake/feature/ask/q;

    .line 14
    .line 15
    iget-object v1, v1, Lcom/zykj/mistake/feature/ask/q;->a:Lcom/zykj/mistake/feature/ask/f;

    .line 16
    .line 17
    iget-object v1, v1, Lcom/zykj/mistake/feature/ask/f;->a:Ljava/util/List;

    .line 18
    .line 19
    new-instance v2, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    if-eqz v7, :cond_1

    .line 33
    .line 34
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    move-object v8, v7

    .line 39
    check-cast v8, Lcom/zykj/mistake/feature/ask/m;

    .line 40
    .line 41
    iget-object v8, v8, Lcom/zykj/mistake/feature/ask/m;->b:Ljava/util/List;

    .line 42
    .line 43
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result v8

    .line 47
    if-nez v8, :cond_0

    .line 48
    .line 49
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    const/4 v7, 0x0

    .line 58
    :cond_2
    if-ge v7, v1, :cond_3

    .line 59
    .line 60
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    add-int/lit8 v7, v7, 0x1

    .line 65
    .line 66
    move-object v9, v8

    .line 67
    check-cast v9, Lcom/zykj/mistake/feature/ask/m;

    .line 68
    .line 69
    iget-object v9, v9, Lcom/zykj/mistake/feature/ask/m;->a:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    .line 70
    .line 71
    sget-object v10, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;->STEM:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    .line 72
    .line 73
    if-ne v9, v10, :cond_2

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    const/4 v8, 0x0

    .line 77
    :goto_1
    check-cast v8, Lcom/zykj/mistake/feature/ask/m;

    .line 78
    .line 79
    if-eqz v8, :cond_4

    .line 80
    .line 81
    iget-object v1, v8, Lcom/zykj/mistake/feature/ask/m;->a:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    .line 82
    .line 83
    if-eqz v1, :cond_4

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_4
    invoke-static {v2}, Lkotlin/collections/t;->i0(Ljava/util/List;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    check-cast v1, Lcom/zykj/mistake/feature/ask/m;

    .line 91
    .line 92
    if-eqz v1, :cond_5

    .line 93
    .line 94
    iget-object v1, v1, Lcom/zykj/mistake/feature/ask/m;->a:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_5
    sget-object v1, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;->STEM:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    .line 98
    .line 99
    :goto_2
    new-instance v7, Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-static {v2, v4}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 102
    .line 103
    .line 104
    move-result v8

    .line 105
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 109
    .line 110
    .line 111
    move-result v8

    .line 112
    const/4 v9, 0x0

    .line 113
    :goto_3
    if-ge v9, v8, :cond_b

    .line 114
    .line 115
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v10

    .line 119
    add-int/lit8 v9, v9, 0x1

    .line 120
    .line 121
    check-cast v10, Lcom/zykj/mistake/feature/ask/m;

    .line 122
    .line 123
    iget-object v11, v10, Lcom/zykj/mistake/feature/ask/m;->b:Ljava/util/List;

    .line 124
    .line 125
    new-instance v12, Ljava/util/ArrayList;

    .line 126
    .line 127
    invoke-static {v11, v4}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 128
    .line 129
    .line 130
    move-result v13

    .line 131
    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 132
    .line 133
    .line 134
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 135
    .line 136
    .line 137
    move-result-object v11

    .line 138
    :goto_4
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 139
    .line 140
    .line 141
    move-result v13

    .line 142
    if-eqz v13, :cond_6

    .line 143
    .line 144
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v13

    .line 148
    check-cast v13, Lcom/zykj/mistake/feature/ask/x;

    .line 149
    .line 150
    new-instance v14, Lcom/zykj/mistake/feature/ask/y;

    .line 151
    .line 152
    iget-object v15, v13, Lcom/zykj/mistake/feature/ask/x;->a:Ljava/lang/String;

    .line 153
    .line 154
    iget-object v4, v13, Lcom/zykj/mistake/feature/ask/x;->b:Ljava/lang/String;

    .line 155
    .line 156
    iget-object v3, v13, Lcom/zykj/mistake/feature/ask/x;->c:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;

    .line 157
    .line 158
    iget-object v5, v13, Lcom/zykj/mistake/feature/ask/x;->d:Ljava/lang/String;

    .line 159
    .line 160
    move-object/from16 p1, v2

    .line 161
    .line 162
    iget-object v2, v13, Lcom/zykj/mistake/feature/ask/x;->e:Ljava/lang/String;

    .line 163
    .line 164
    iget-object v13, v13, Lcom/zykj/mistake/feature/ask/x;->f:Lcom/zykj/mistake/feature/ask/c0;

    .line 165
    .line 166
    move-object/from16 v19, v2

    .line 167
    .line 168
    const/4 v2, 0x0

    .line 169
    invoke-static {v15, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v22

    .line 173
    const-string v20, ""

    .line 174
    .line 175
    move-object/from16 v17, v3

    .line 176
    .line 177
    move-object/from16 v16, v4

    .line 178
    .line 179
    move-object/from16 v18, v5

    .line 180
    .line 181
    move-object/from16 v21, v13

    .line 182
    .line 183
    invoke-direct/range {v14 .. v22}, Lcom/zykj/mistake/feature/ask/y;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/ask/c0;Z)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-object/from16 v2, p1

    .line 190
    .line 191
    const/16 v4, 0xa

    .line 192
    .line 193
    goto :goto_4

    .line 194
    :cond_6
    move-object/from16 p1, v2

    .line 195
    .line 196
    iget-object v13, v10, Lcom/zykj/mistake/feature/ask/m;->a:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    .line 197
    .line 198
    invoke-virtual {v13}, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;->getTitle()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v14

    .line 202
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    if-eqz v2, :cond_7

    .line 207
    .line 208
    const/4 v15, 0x0

    .line 209
    goto :goto_6

    .line 210
    :cond_7
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    const/4 v3, 0x0

    .line 215
    const/4 v4, 0x0

    .line 216
    :cond_8
    :goto_5
    if-ge v4, v2, :cond_a

    .line 217
    .line 218
    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v5

    .line 222
    add-int/lit8 v4, v4, 0x1

    .line 223
    .line 224
    check-cast v5, Lcom/zykj/mistake/feature/ask/y;

    .line 225
    .line 226
    iget-boolean v5, v5, Lcom/zykj/mistake/feature/ask/y;->h:Z

    .line 227
    .line 228
    if-eqz v5, :cond_8

    .line 229
    .line 230
    add-int/lit8 v3, v3, 0x1

    .line 231
    .line 232
    if-ltz v3, :cond_9

    .line 233
    .line 234
    goto :goto_5

    .line 235
    :cond_9
    invoke-static {}, Lkotlin/collections/u;->K()V

    .line 236
    .line 237
    .line 238
    const/16 v23, 0x0

    .line 239
    .line 240
    throw v23

    .line 241
    :cond_a
    move v15, v3

    .line 242
    :goto_6
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 243
    .line 244
    .line 245
    move-result v16

    .line 246
    move-object/from16 v17, v12

    .line 247
    .line 248
    new-instance v12, Lcom/zykj/mistake/feature/ask/n;

    .line 249
    .line 250
    invoke-direct/range {v12 .. v17}, Lcom/zykj/mistake/feature/ask/n;-><init>(Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;Ljava/lang/String;IILjava/util/List;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-object/from16 v2, p1

    .line 257
    .line 258
    const/16 v4, 0xa

    .line 259
    .line 260
    goto/16 :goto_3

    .line 261
    .line 262
    :cond_b
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 263
    .line 264
    .line 265
    move-result v2

    .line 266
    const/4 v3, 0x0

    .line 267
    const/4 v4, 0x0

    .line 268
    :goto_7
    if-ge v4, v2, :cond_c

    .line 269
    .line 270
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v5

    .line 274
    add-int/lit8 v4, v4, 0x1

    .line 275
    .line 276
    check-cast v5, Lcom/zykj/mistake/feature/ask/n;

    .line 277
    .line 278
    iget v5, v5, Lcom/zykj/mistake/feature/ask/n;->c:I

    .line 279
    .line 280
    add-int/2addr v3, v5

    .line 281
    goto :goto_7

    .line 282
    :cond_c
    new-instance v2, Lcom/zykj/mistake/feature/ask/z;

    .line 283
    .line 284
    const/16 v4, 0x18

    .line 285
    .line 286
    invoke-direct {v2, v7, v1, v3, v4}, Lcom/zykj/mistake/feature/ask/z;-><init>(Ljava/util/ArrayList;Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;II)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    const/4 v3, 0x0

    .line 293
    invoke-virtual {v6, v3, v2}, Lkotlinx/coroutines/flow/n0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    return-void

    .line 297
    :cond_d
    const/4 v3, 0x0

    .line 298
    instance-of v2, v1, Lcom/zykj/mistake/feature/ask/r;

    .line 299
    .line 300
    if-eqz v2, :cond_f

    .line 301
    .line 302
    :goto_8
    invoke-virtual {v6}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    move-object v4, v2

    .line 307
    check-cast v4, Lcom/zykj/mistake/feature/ask/z;

    .line 308
    .line 309
    move-object v5, v1

    .line 310
    check-cast v5, Lcom/zykj/mistake/feature/ask/r;

    .line 311
    .line 312
    iget-object v5, v5, Lcom/zykj/mistake/feature/ask/r;->a:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    .line 313
    .line 314
    const/16 v7, 0x1d

    .line 315
    .line 316
    const/4 v8, 0x0

    .line 317
    invoke-static {v4, v3, v5, v8, v7}, Lcom/zykj/mistake/feature/ask/z;->a(Lcom/zykj/mistake/feature/ask/z;Ljava/util/ArrayList;Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;II)Lcom/zykj/mistake/feature/ask/z;

    .line 318
    .line 319
    .line 320
    move-result-object v4

    .line 321
    invoke-virtual {v6, v2, v4}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    move-result v2

    .line 325
    if-eqz v2, :cond_e

    .line 326
    .line 327
    goto/16 :goto_14

    .line 328
    .line 329
    :cond_e
    const/4 v3, 0x0

    .line 330
    goto :goto_8

    .line 331
    :cond_f
    instance-of v2, v1, Lcom/zykj/mistake/feature/ask/s;

    .line 332
    .line 333
    if-eqz v2, :cond_1e

    .line 334
    .line 335
    check-cast v1, Lcom/zykj/mistake/feature/ask/s;

    .line 336
    .line 337
    iget-object v2, v1, Lcom/zykj/mistake/feature/ask/s;->a:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    .line 338
    .line 339
    iget-object v1, v1, Lcom/zykj/mistake/feature/ask/s;->b:Ljava/lang/String;

    .line 340
    .line 341
    invoke-virtual {v6}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v3

    .line 345
    check-cast v3, Lcom/zykj/mistake/feature/ask/z;

    .line 346
    .line 347
    iget-object v4, v3, Lcom/zykj/mistake/feature/ask/z;->a:Ljava/util/List;

    .line 348
    .line 349
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 350
    .line 351
    .line 352
    move-result-object v4

    .line 353
    :cond_10
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 354
    .line 355
    .line 356
    move-result v5

    .line 357
    if-eqz v5, :cond_11

    .line 358
    .line 359
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v5

    .line 363
    move-object v7, v5

    .line 364
    check-cast v7, Lcom/zykj/mistake/feature/ask/n;

    .line 365
    .line 366
    iget-object v7, v7, Lcom/zykj/mistake/feature/ask/n;->a:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    .line 367
    .line 368
    if-ne v7, v2, :cond_10

    .line 369
    .line 370
    goto :goto_9

    .line 371
    :cond_11
    const/4 v5, 0x0

    .line 372
    :goto_9
    check-cast v5, Lcom/zykj/mistake/feature/ask/n;

    .line 373
    .line 374
    if-eqz v5, :cond_24

    .line 375
    .line 376
    iget-object v4, v5, Lcom/zykj/mistake/feature/ask/n;->e:Ljava/util/List;

    .line 377
    .line 378
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 379
    .line 380
    .line 381
    move-result-object v4

    .line 382
    :cond_12
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 383
    .line 384
    .line 385
    move-result v5

    .line 386
    if-eqz v5, :cond_13

    .line 387
    .line 388
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v5

    .line 392
    move-object v7, v5

    .line 393
    check-cast v7, Lcom/zykj/mistake/feature/ask/y;

    .line 394
    .line 395
    iget-object v7, v7, Lcom/zykj/mistake/feature/ask/y;->a:Ljava/lang/String;

    .line 396
    .line 397
    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    move-result v7

    .line 401
    if-eqz v7, :cond_12

    .line 402
    .line 403
    goto :goto_a

    .line 404
    :cond_13
    const/4 v5, 0x0

    .line 405
    :goto_a
    check-cast v5, Lcom/zykj/mistake/feature/ask/y;

    .line 406
    .line 407
    if-eqz v5, :cond_24

    .line 408
    .line 409
    iget-boolean v4, v5, Lcom/zykj/mistake/feature/ask/y;->h:Z

    .line 410
    .line 411
    if-nez v4, :cond_14

    .line 412
    .line 413
    iget v4, v3, Lcom/zykj/mistake/feature/ask/z;->c:I

    .line 414
    .line 415
    iget v5, v3, Lcom/zykj/mistake/feature/ask/z;->d:I

    .line 416
    .line 417
    if-lt v4, v5, :cond_14

    .line 418
    .line 419
    new-instance v1, Lcom/zykj/mistake/feature/ask/i;

    .line 420
    .line 421
    const-string v2, "\u6700\u591a\u53ef\u90095\u5f20\u56fe\u7247\uff0c\u8bf7\u51cf\u5c11\u5df2\u9009\u7d20\u6750\u540e\u91cd\u8bd5\u3002"

    .line 422
    .line 423
    invoke-direct {v1, v2}, Lcom/zykj/mistake/feature/ask/i;-><init>(Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialViewModel;->b(Lcom/zykj/mistake/feature/ask/j;)V

    .line 427
    .line 428
    .line 429
    return-void

    .line 430
    :cond_14
    iget-object v3, v3, Lcom/zykj/mistake/feature/ask/z;->a:Ljava/util/List;

    .line 431
    .line 432
    new-instance v4, Ljava/util/ArrayList;

    .line 433
    .line 434
    const/16 v5, 0xa

    .line 435
    .line 436
    invoke-static {v3, v5}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 437
    .line 438
    .line 439
    move-result v7

    .line 440
    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 441
    .line 442
    .line 443
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 444
    .line 445
    .line 446
    move-result-object v3

    .line 447
    :goto_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 448
    .line 449
    .line 450
    move-result v5

    .line 451
    if-eqz v5, :cond_1c

    .line 452
    .line 453
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v5

    .line 457
    check-cast v5, Lcom/zykj/mistake/feature/ask/n;

    .line 458
    .line 459
    iget-object v7, v5, Lcom/zykj/mistake/feature/ask/n;->a:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    .line 460
    .line 461
    if-eq v7, v2, :cond_15

    .line 462
    .line 463
    goto :goto_f

    .line 464
    :cond_15
    iget-object v7, v5, Lcom/zykj/mistake/feature/ask/n;->e:Ljava/util/List;

    .line 465
    .line 466
    new-instance v8, Ljava/util/ArrayList;

    .line 467
    .line 468
    const/16 v9, 0xa

    .line 469
    .line 470
    invoke-static {v7, v9}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 471
    .line 472
    .line 473
    move-result v10

    .line 474
    invoke-direct {v8, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 475
    .line 476
    .line 477
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 478
    .line 479
    .line 480
    move-result-object v7

    .line 481
    :goto_c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 482
    .line 483
    .line 484
    move-result v9

    .line 485
    if-eqz v9, :cond_17

    .line 486
    .line 487
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v9

    .line 491
    check-cast v9, Lcom/zykj/mistake/feature/ask/y;

    .line 492
    .line 493
    iget-object v10, v9, Lcom/zykj/mistake/feature/ask/y;->a:Ljava/lang/String;

    .line 494
    .line 495
    invoke-static {v10, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 496
    .line 497
    .line 498
    move-result v10

    .line 499
    if-eqz v10, :cond_16

    .line 500
    .line 501
    iget-boolean v10, v9, Lcom/zykj/mistake/feature/ask/y;->h:Z

    .line 502
    .line 503
    xor-int/lit8 v10, v10, 0x1

    .line 504
    .line 505
    const/16 v11, 0x7f

    .line 506
    .line 507
    const/4 v12, 0x0

    .line 508
    invoke-static {v9, v12, v10, v11}, Lcom/zykj/mistake/feature/ask/y;->a(Lcom/zykj/mistake/feature/ask/y;Ljava/lang/String;ZI)Lcom/zykj/mistake/feature/ask/y;

    .line 509
    .line 510
    .line 511
    move-result-object v9

    .line 512
    :cond_16
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 513
    .line 514
    .line 515
    goto :goto_c

    .line 516
    :cond_17
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 517
    .line 518
    .line 519
    move-result v7

    .line 520
    if-eqz v7, :cond_18

    .line 521
    .line 522
    const/4 v9, 0x0

    .line 523
    goto :goto_e

    .line 524
    :cond_18
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 525
    .line 526
    .line 527
    move-result v7

    .line 528
    const/4 v9, 0x0

    .line 529
    const/4 v10, 0x0

    .line 530
    :cond_19
    :goto_d
    if-ge v10, v7, :cond_1b

    .line 531
    .line 532
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    move-result-object v11

    .line 536
    add-int/lit8 v10, v10, 0x1

    .line 537
    .line 538
    check-cast v11, Lcom/zykj/mistake/feature/ask/y;

    .line 539
    .line 540
    iget-boolean v11, v11, Lcom/zykj/mistake/feature/ask/y;->h:Z

    .line 541
    .line 542
    if-eqz v11, :cond_19

    .line 543
    .line 544
    add-int/lit8 v9, v9, 0x1

    .line 545
    .line 546
    if-ltz v9, :cond_1a

    .line 547
    .line 548
    goto :goto_d

    .line 549
    :cond_1a
    invoke-static {}, Lkotlin/collections/u;->K()V

    .line 550
    .line 551
    .line 552
    const/16 v23, 0x0

    .line 553
    .line 554
    throw v23

    .line 555
    :cond_1b
    :goto_e
    const/16 v7, 0xb

    .line 556
    .line 557
    invoke-static {v5, v9, v8, v7}, Lcom/zykj/mistake/feature/ask/n;->a(Lcom/zykj/mistake/feature/ask/n;ILjava/util/ArrayList;I)Lcom/zykj/mistake/feature/ask/n;

    .line 558
    .line 559
    .line 560
    move-result-object v5

    .line 561
    :goto_f
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 562
    .line 563
    .line 564
    goto :goto_b

    .line 565
    :cond_1c
    invoke-virtual {v6}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    move-result-object v1

    .line 569
    move-object v2, v1

    .line 570
    check-cast v2, Lcom/zykj/mistake/feature/ask/z;

    .line 571
    .line 572
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 573
    .line 574
    .line 575
    move-result v3

    .line 576
    const/4 v5, 0x0

    .line 577
    const/4 v8, 0x0

    .line 578
    :goto_10
    if-ge v5, v3, :cond_1d

    .line 579
    .line 580
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    move-result-object v7

    .line 584
    add-int/lit8 v5, v5, 0x1

    .line 585
    .line 586
    check-cast v7, Lcom/zykj/mistake/feature/ask/n;

    .line 587
    .line 588
    iget v7, v7, Lcom/zykj/mistake/feature/ask/n;->c:I

    .line 589
    .line 590
    add-int/2addr v8, v7

    .line 591
    goto :goto_10

    .line 592
    :cond_1d
    const/16 v3, 0x1a

    .line 593
    .line 594
    const/4 v12, 0x0

    .line 595
    invoke-static {v2, v4, v12, v8, v3}, Lcom/zykj/mistake/feature/ask/z;->a(Lcom/zykj/mistake/feature/ask/z;Ljava/util/ArrayList;Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;II)Lcom/zykj/mistake/feature/ask/z;

    .line 596
    .line 597
    .line 598
    move-result-object v2

    .line 599
    invoke-virtual {v6, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 600
    .line 601
    .line 602
    move-result v1

    .line 603
    if-eqz v1, :cond_1c

    .line 604
    .line 605
    goto/16 :goto_14

    .line 606
    .line 607
    :cond_1e
    instance-of v2, v1, Lcom/zykj/mistake/feature/ask/t;

    .line 608
    .line 609
    if-eqz v2, :cond_25

    .line 610
    .line 611
    check-cast v1, Lcom/zykj/mistake/feature/ask/t;

    .line 612
    .line 613
    iget-object v2, v1, Lcom/zykj/mistake/feature/ask/t;->a:Ljava/lang/String;

    .line 614
    .line 615
    iget-object v1, v1, Lcom/zykj/mistake/feature/ask/t;->b:Ljava/lang/String;

    .line 616
    .line 617
    invoke-static {v1}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 618
    .line 619
    .line 620
    move-result v3

    .line 621
    if-eqz v3, :cond_1f

    .line 622
    .line 623
    goto/16 :goto_14

    .line 624
    .line 625
    :cond_1f
    invoke-virtual {v6}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-result-object v3

    .line 629
    check-cast v3, Lcom/zykj/mistake/feature/ask/z;

    .line 630
    .line 631
    iget-object v3, v3, Lcom/zykj/mistake/feature/ask/z;->a:Ljava/util/List;

    .line 632
    .line 633
    new-instance v4, Ljava/util/ArrayList;

    .line 634
    .line 635
    const/16 v5, 0xa

    .line 636
    .line 637
    invoke-static {v3, v5}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 638
    .line 639
    .line 640
    move-result v7

    .line 641
    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 642
    .line 643
    .line 644
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 645
    .line 646
    .line 647
    move-result-object v3

    .line 648
    :goto_11
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 649
    .line 650
    .line 651
    move-result v7

    .line 652
    if-eqz v7, :cond_22

    .line 653
    .line 654
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 655
    .line 656
    .line 657
    move-result-object v7

    .line 658
    check-cast v7, Lcom/zykj/mistake/feature/ask/n;

    .line 659
    .line 660
    iget-object v8, v7, Lcom/zykj/mistake/feature/ask/n;->e:Ljava/util/List;

    .line 661
    .line 662
    new-instance v9, Ljava/util/ArrayList;

    .line 663
    .line 664
    invoke-static {v8, v5}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 665
    .line 666
    .line 667
    move-result v10

    .line 668
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 669
    .line 670
    .line 671
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 672
    .line 673
    .line 674
    move-result-object v8

    .line 675
    :goto_12
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 676
    .line 677
    .line 678
    move-result v10

    .line 679
    if-eqz v10, :cond_21

    .line 680
    .line 681
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 682
    .line 683
    .line 684
    move-result-object v10

    .line 685
    check-cast v10, Lcom/zykj/mistake/feature/ask/y;

    .line 686
    .line 687
    iget-object v11, v10, Lcom/zykj/mistake/feature/ask/y;->a:Ljava/lang/String;

    .line 688
    .line 689
    invoke-static {v11, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 690
    .line 691
    .line 692
    move-result v11

    .line 693
    if-eqz v11, :cond_20

    .line 694
    .line 695
    const/16 v11, 0xdf

    .line 696
    .line 697
    const/4 v12, 0x0

    .line 698
    invoke-static {v10, v1, v12, v11}, Lcom/zykj/mistake/feature/ask/y;->a(Lcom/zykj/mistake/feature/ask/y;Ljava/lang/String;ZI)Lcom/zykj/mistake/feature/ask/y;

    .line 699
    .line 700
    .line 701
    move-result-object v10

    .line 702
    goto :goto_13

    .line 703
    :cond_20
    const/4 v12, 0x0

    .line 704
    :goto_13
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 705
    .line 706
    .line 707
    goto :goto_12

    .line 708
    :cond_21
    const/4 v12, 0x0

    .line 709
    const/16 v8, 0xf

    .line 710
    .line 711
    invoke-static {v7, v12, v9, v8}, Lcom/zykj/mistake/feature/ask/n;->a(Lcom/zykj/mistake/feature/ask/n;ILjava/util/ArrayList;I)Lcom/zykj/mistake/feature/ask/n;

    .line 712
    .line 713
    .line 714
    move-result-object v7

    .line 715
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 716
    .line 717
    .line 718
    goto :goto_11

    .line 719
    :cond_22
    const/4 v12, 0x0

    .line 720
    :cond_23
    invoke-virtual {v6}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    move-result-object v1

    .line 724
    move-object v2, v1

    .line 725
    check-cast v2, Lcom/zykj/mistake/feature/ask/z;

    .line 726
    .line 727
    const/16 v3, 0x1e

    .line 728
    .line 729
    const/4 v5, 0x0

    .line 730
    invoke-static {v2, v4, v5, v12, v3}, Lcom/zykj/mistake/feature/ask/z;->a(Lcom/zykj/mistake/feature/ask/z;Ljava/util/ArrayList;Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;II)Lcom/zykj/mistake/feature/ask/z;

    .line 731
    .line 732
    .line 733
    move-result-object v2

    .line 734
    invoke-virtual {v6, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 735
    .line 736
    .line 737
    move-result v1

    .line 738
    if-eqz v1, :cond_23

    .line 739
    .line 740
    :cond_24
    :goto_14
    return-void

    .line 741
    :cond_25
    sget-object v2, Lcom/zykj/mistake/feature/ask/o;->a:Lcom/zykj/mistake/feature/ask/o;

    .line 742
    .line 743
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 744
    .line 745
    .line 746
    move-result v2

    .line 747
    if-eqz v2, :cond_26

    .line 748
    .line 749
    sget-object v1, Lcom/zykj/mistake/feature/ask/g;->a:Lcom/zykj/mistake/feature/ask/g;

    .line 750
    .line 751
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialViewModel;->b(Lcom/zykj/mistake/feature/ask/j;)V

    .line 752
    .line 753
    .line 754
    return-void

    .line 755
    :cond_26
    sget-object v2, Lcom/zykj/mistake/feature/ask/p;->a:Lcom/zykj/mistake/feature/ask/p;

    .line 756
    .line 757
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 758
    .line 759
    .line 760
    move-result v1

    .line 761
    if-eqz v1, :cond_2b

    .line 762
    .line 763
    invoke-virtual {v6}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 764
    .line 765
    .line 766
    move-result-object v1

    .line 767
    check-cast v1, Lcom/zykj/mistake/feature/ask/z;

    .line 768
    .line 769
    iget-object v1, v1, Lcom/zykj/mistake/feature/ask/z;->a:Ljava/util/List;

    .line 770
    .line 771
    new-instance v2, Ljava/util/ArrayList;

    .line 772
    .line 773
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 774
    .line 775
    .line 776
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 777
    .line 778
    .line 779
    move-result-object v1

    .line 780
    :goto_15
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 781
    .line 782
    .line 783
    move-result v3

    .line 784
    if-eqz v3, :cond_29

    .line 785
    .line 786
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 787
    .line 788
    .line 789
    move-result-object v3

    .line 790
    check-cast v3, Lcom/zykj/mistake/feature/ask/n;

    .line 791
    .line 792
    iget-object v3, v3, Lcom/zykj/mistake/feature/ask/n;->e:Ljava/util/List;

    .line 793
    .line 794
    new-instance v4, Ljava/util/ArrayList;

    .line 795
    .line 796
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 797
    .line 798
    .line 799
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 800
    .line 801
    .line 802
    move-result-object v3

    .line 803
    :cond_27
    :goto_16
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 804
    .line 805
    .line 806
    move-result v5

    .line 807
    if-eqz v5, :cond_28

    .line 808
    .line 809
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 810
    .line 811
    .line 812
    move-result-object v5

    .line 813
    move-object v6, v5

    .line 814
    check-cast v6, Lcom/zykj/mistake/feature/ask/y;

    .line 815
    .line 816
    iget-boolean v6, v6, Lcom/zykj/mistake/feature/ask/y;->h:Z

    .line 817
    .line 818
    if-eqz v6, :cond_27

    .line 819
    .line 820
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 821
    .line 822
    .line 823
    goto :goto_16

    .line 824
    :cond_28
    invoke-static {v4, v2}, Lkotlin/collections/y;->S(Ljava/lang/Iterable;Ljava/util/Collection;)V

    .line 825
    .line 826
    .line 827
    goto :goto_15

    .line 828
    :cond_29
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 829
    .line 830
    .line 831
    move-result v1

    .line 832
    if-eqz v1, :cond_2a

    .line 833
    .line 834
    new-instance v1, Lcom/zykj/mistake/feature/ask/i;

    .line 835
    .line 836
    const-string v2, "\u81f3\u5c11\u9009\u62e9\u4e00\u4e2a\u7d20\u6750"

    .line 837
    .line 838
    invoke-direct {v1, v2}, Lcom/zykj/mistake/feature/ask/i;-><init>(Ljava/lang/String;)V

    .line 839
    .line 840
    .line 841
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialViewModel;->b(Lcom/zykj/mistake/feature/ask/j;)V

    .line 842
    .line 843
    .line 844
    return-void

    .line 845
    :cond_2a
    new-instance v1, Lcom/zykj/mistake/feature/ask/h;

    .line 846
    .line 847
    invoke-direct {v1, v2}, Lcom/zykj/mistake/feature/ask/h;-><init>(Ljava/util/ArrayList;)V

    .line 848
    .line 849
    .line 850
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialViewModel;->b(Lcom/zykj/mistake/feature/ask/j;)V

    .line 851
    .line 852
    .line 853
    return-void

    .line 854
    :cond_2b
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    .line 855
    .line 856
    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 857
    .line 858
    .line 859
    throw v1
.end method

.method public final b(Lcom/zykj/mistake/feature/ask/j;)V
    .locals 3

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialViewModel$sendEffect$1;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, v2}, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialViewModel$sendEffect$1;-><init>(Lcom/zykj/mistake/feature/ask/MistakeAskMaterialViewModel;Lcom/zykj/mistake/feature/ask/j;Lh6/c;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x3

    .line 12
    invoke-static {v0, v2, v2, v1, p1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 13
    .line 14
    .line 15
    return-void
.end method
