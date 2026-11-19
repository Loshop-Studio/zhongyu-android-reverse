.class public final Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;",
        "Landroidx/lifecycle/ViewModel;",
        "<init>",
        "()V",
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
        "SMAP\nMistakeCollectionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeCollectionViewModel.kt\ncom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,255:1\n230#2,5:256\n230#2,5:261\n230#2,5:266\n230#2,5:271\n230#2,5:276\n230#2,5:281\n230#2,5:286\n230#2,5:293\n230#2,5:311\n295#3,2:291\n1617#3,9:298\n1869#3:307\n1870#3:309\n1626#3:310\n1#4:308\n*S KotlinDebug\n*F\n+ 1 MistakeCollectionViewModel.kt\ncom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel\n*L\n35#1:256,5\n45#1:261,5\n55#1:266,5\n69#1:271,5\n119#1:276,5\n127#1:281,5\n143#1:286,5\n169#1:293,5\n201#1:311,5\n151#1:291,2\n176#1:298,9\n176#1:307\n176#1:309\n176#1:310\n176#1:308\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lcom/zykj/mistake/data/a;

.field public final b:Lkotlinx/coroutines/flow/n0;

.field public final c:Lkotlinx/coroutines/flow/a0;

.field public final d:Lkotlinx/coroutines/channels/b;

.field public final e:Lkotlinx/coroutines/flow/c;

.field public f:Lkotlinx/coroutines/k1;

.field public g:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/zykj/mistake/data/a;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Lcom/zykj/mistake/data/a;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;->a:Lcom/zykj/mistake/data/a;

    .line 11
    .line 12
    new-instance v0, Lcom/zykj/mistake/feature/collection/list/v;

    .line 13
    .line 14
    invoke-direct {v0}, Lcom/zykj/mistake/feature/collection/list/v;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lkotlinx/coroutines/flow/h;->b(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;->b:Lkotlinx/coroutines/flow/n0;

    .line 22
    .line 23
    new-instance v1, Lkotlinx/coroutines/flow/a0;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Lkotlinx/coroutines/flow/a0;-><init>(Lkotlinx/coroutines/flow/y;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;->c:Lkotlinx/coroutines/flow/a0;

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    const/4 v1, 0x7

    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-static {v0, v1, v2}, Lkotlinx/coroutines/channels/k;->a(IILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/channels/b;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iput-object v0, p0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;->d:Lkotlinx/coroutines/channels/b;

    .line 38
    .line 39
    invoke-static {v0}, Lkotlinx/coroutines/flow/h;->l(Lkotlinx/coroutines/channels/b;)Lkotlinx/coroutines/flow/c;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;->e:Lkotlinx/coroutines/flow/c;

    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/mistake/feature/collection/list/u;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    sget-object v2, Lcom/zykj/mistake/feature/collection/list/i;->a:Lcom/zykj/mistake/feature/collection/list/i;

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    iget-object v3, v0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;->b:Lkotlinx/coroutines/flow/n0;

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    :cond_0
    invoke-virtual {v3}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    move-object v4, v1

    .line 20
    check-cast v4, Lcom/zykj/mistake/feature/collection/list/v;

    .line 21
    .line 22
    const/4 v13, 0x0

    .line 23
    const/16 v14, 0xc3f

    .line 24
    .line 25
    const/4 v5, 0x0

    .line 26
    const/4 v6, 0x0

    .line 27
    const/4 v7, 0x0

    .line 28
    const/4 v8, 0x1

    .line 29
    const-string v9, ""

    .line 30
    .line 31
    const-string v10, ""

    .line 32
    .line 33
    const/4 v11, 0x0

    .line 34
    const/4 v12, 0x0

    .line 35
    invoke-static/range {v4 .. v14}, Lcom/zykj/mistake/feature/collection/list/v;->a(Lcom/zykj/mistake/feature/collection/list/v;ILjava/util/ArrayList;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;I)Lcom/zykj/mistake/feature/collection/list/v;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v3, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    goto/16 :goto_1

    .line 46
    .line 47
    :cond_1
    sget-object v2, Lcom/zykj/mistake/feature/collection/list/p;->a:Lcom/zykj/mistake/feature/collection/list/p;

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    :cond_2
    invoke-virtual {v3}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    move-object v4, v1

    .line 60
    check-cast v4, Lcom/zykj/mistake/feature/collection/list/v;

    .line 61
    .line 62
    const/4 v13, 0x0

    .line 63
    const/16 v14, 0xc3f

    .line 64
    .line 65
    const/4 v5, 0x0

    .line 66
    const/4 v6, 0x0

    .line 67
    const/4 v7, 0x0

    .line 68
    const/4 v8, 0x0

    .line 69
    const-string v9, ""

    .line 70
    .line 71
    const-string v10, ""

    .line 72
    .line 73
    const/4 v11, 0x0

    .line 74
    const/4 v12, 0x0

    .line 75
    invoke-static/range {v4 .. v14}, Lcom/zykj/mistake/feature/collection/list/v;->a(Lcom/zykj/mistake/feature/collection/list/v;ILjava/util/ArrayList;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;I)Lcom/zykj/mistake/feature/collection/list/v;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {v3, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_2

    .line 84
    .line 85
    goto/16 :goto_1

    .line 86
    .line 87
    :cond_3
    instance-of v2, v1, Lcom/zykj/mistake/feature/collection/list/k;

    .line 88
    .line 89
    if-eqz v2, :cond_5

    .line 90
    .line 91
    :cond_4
    invoke-virtual {v3}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    move-object v4, v2

    .line 96
    check-cast v4, Lcom/zykj/mistake/feature/collection/list/v;

    .line 97
    .line 98
    move-object v5, v1

    .line 99
    check-cast v5, Lcom/zykj/mistake/feature/collection/list/k;

    .line 100
    .line 101
    iget-object v5, v5, Lcom/zykj/mistake/feature/collection/list/k;->a:Ljava/lang/String;

    .line 102
    .line 103
    const/16 v6, 0x14

    .line 104
    .line 105
    invoke-static {v6, v5}, Lkotlin/text/p;->i0(ILjava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v9

    .line 109
    const/4 v13, 0x0

    .line 110
    const/16 v14, 0xe7f

    .line 111
    .line 112
    const/4 v5, 0x0

    .line 113
    const/4 v6, 0x0

    .line 114
    const/4 v7, 0x0

    .line 115
    const/4 v8, 0x0

    .line 116
    const-string v10, ""

    .line 117
    .line 118
    const/4 v11, 0x0

    .line 119
    const/4 v12, 0x0

    .line 120
    invoke-static/range {v4 .. v14}, Lcom/zykj/mistake/feature/collection/list/v;->a(Lcom/zykj/mistake/feature/collection/list/v;ILjava/util/ArrayList;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;I)Lcom/zykj/mistake/feature/collection/list/v;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    invoke-virtual {v3, v2, v4}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    if-eqz v2, :cond_4

    .line 129
    .line 130
    goto/16 :goto_1

    .line 131
    .line 132
    :cond_5
    sget-object v2, Lcom/zykj/mistake/feature/collection/list/m;->a:Lcom/zykj/mistake/feature/collection/list/m;

    .line 133
    .line 134
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    const/4 v4, 0x3

    .line 139
    const/4 v5, 0x0

    .line 140
    if-eqz v2, :cond_8

    .line 141
    .line 142
    invoke-virtual {v3}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    check-cast v1, Lcom/zykj/mistake/feature/collection/list/v;

    .line 147
    .line 148
    iget-object v1, v1, Lcom/zykj/mistake/feature/collection/list/v;->h:Ljava/lang/String;

    .line 149
    .line 150
    invoke-static {v1}, Lkotlin/text/p;->k0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    invoke-virtual {v3}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    check-cast v1, Lcom/zykj/mistake/feature/collection/list/v;

    .line 163
    .line 164
    iget-boolean v1, v1, Lcom/zykj/mistake/feature/collection/list/v;->j:Z

    .line 165
    .line 166
    if-eqz v1, :cond_6

    .line 167
    .line 168
    goto/16 :goto_1

    .line 169
    .line 170
    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    if-nez v1, :cond_7

    .line 175
    .line 176
    new-instance v1, Lcom/zykj/mistake/feature/collection/list/f;

    .line 177
    .line 178
    const-string v2, "\u8bf7\u8f93\u5165\u9519\u9898\u96c6\u540d\u79f0"

    .line 179
    .line 180
    invoke-direct {v1, v2}, Lcom/zykj/mistake/feature/collection/list/f;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;->c(Lcom/zykj/mistake/feature/collection/list/g;)V

    .line 184
    .line 185
    .line 186
    return-void

    .line 187
    :cond_7
    invoke-virtual {v3}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    move-object v6, v1

    .line 192
    check-cast v6, Lcom/zykj/mistake/feature/collection/list/v;

    .line 193
    .line 194
    const/4 v15, 0x0

    .line 195
    const/16 v16, 0xcff

    .line 196
    .line 197
    const/4 v7, 0x0

    .line 198
    const/4 v8, 0x0

    .line 199
    const/4 v9, 0x0

    .line 200
    const/4 v10, 0x0

    .line 201
    const/4 v11, 0x0

    .line 202
    const-string v12, ""

    .line 203
    .line 204
    const/4 v13, 0x1

    .line 205
    const/4 v14, 0x0

    .line 206
    invoke-static/range {v6 .. v16}, Lcom/zykj/mistake/feature/collection/list/v;->a(Lcom/zykj/mistake/feature/collection/list/v;ILjava/util/ArrayList;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;I)Lcom/zykj/mistake/feature/collection/list/v;

    .line 207
    .line 208
    .line 209
    move-result-object v6

    .line 210
    invoke-virtual {v3, v1, v6}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    if-eqz v1, :cond_7

    .line 215
    .line 216
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    new-instance v3, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$dispatch$5;

    .line 221
    .line 222
    invoke-direct {v3, v0, v2, v5}, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$dispatch$5;-><init>(Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;Ljava/lang/String;Lh6/c;)V

    .line 223
    .line 224
    .line 225
    invoke-static {v1, v5, v5, v3, v4}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 226
    .line 227
    .line 228
    return-void

    .line 229
    :cond_8
    instance-of v2, v1, Lcom/zykj/mistake/feature/collection/list/h;

    .line 230
    .line 231
    if-eqz v2, :cond_b

    .line 232
    .line 233
    check-cast v1, Lcom/zykj/mistake/feature/collection/list/h;

    .line 234
    .line 235
    iget v1, v1, Lcom/zykj/mistake/feature/collection/list/h;->a:I

    .line 236
    .line 237
    iget v2, v0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;->g:I

    .line 238
    .line 239
    if-ne v2, v1, :cond_9

    .line 240
    .line 241
    goto/16 :goto_1

    .line 242
    .line 243
    :cond_9
    iput v1, v0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;->g:I

    .line 244
    .line 245
    :cond_a
    invoke-virtual {v3}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    move-object v2, v1

    .line 250
    check-cast v2, Lcom/zykj/mistake/feature/collection/list/v;

    .line 251
    .line 252
    new-instance v2, Lcom/zykj/mistake/feature/collection/list/v;

    .line 253
    .line 254
    invoke-direct {v2}, Lcom/zykj/mistake/feature/collection/list/v;-><init>()V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v3, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v1

    .line 261
    if-eqz v1, :cond_a

    .line 262
    .line 263
    invoke-virtual {v0}, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;->b()V

    .line 264
    .line 265
    .line 266
    return-void

    .line 267
    :cond_b
    sget-object v2, Lcom/zykj/mistake/feature/collection/list/s;->a:Lcom/zykj/mistake/feature/collection/list/s;

    .line 268
    .line 269
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v2

    .line 273
    if-eqz v2, :cond_c

    .line 274
    .line 275
    invoke-virtual {v0}, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;->b()V

    .line 276
    .line 277
    .line 278
    return-void

    .line 279
    :cond_c
    sget-object v2, Lcom/zykj/mistake/feature/collection/list/q;->a:Lcom/zykj/mistake/feature/collection/list/q;

    .line 280
    .line 281
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result v2

    .line 285
    if-nez v2, :cond_1d

    .line 286
    .line 287
    instance-of v2, v1, Lcom/zykj/mistake/feature/collection/list/r;

    .line 288
    .line 289
    if-eqz v2, :cond_e

    .line 290
    .line 291
    :cond_d
    invoke-virtual {v3}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    move-object v4, v2

    .line 296
    check-cast v4, Lcom/zykj/mistake/feature/collection/list/v;

    .line 297
    .line 298
    move-object v5, v1

    .line 299
    check-cast v5, Lcom/zykj/mistake/feature/collection/list/r;

    .line 300
    .line 301
    iget-object v5, v5, Lcom/zykj/mistake/feature/collection/list/r;->a:Ljava/lang/String;

    .line 302
    .line 303
    invoke-static {v5}, Lv7/d;->t(Ljava/lang/Object;)Ljava/util/Set;

    .line 304
    .line 305
    .line 306
    move-result-object v13

    .line 307
    const/16 v14, 0x3ff

    .line 308
    .line 309
    const/4 v5, 0x0

    .line 310
    const/4 v6, 0x0

    .line 311
    const/4 v7, 0x0

    .line 312
    const/4 v8, 0x0

    .line 313
    const/4 v9, 0x0

    .line 314
    const/4 v10, 0x0

    .line 315
    const/4 v11, 0x0

    .line 316
    const/4 v12, 0x1

    .line 317
    invoke-static/range {v4 .. v14}, Lcom/zykj/mistake/feature/collection/list/v;->a(Lcom/zykj/mistake/feature/collection/list/v;ILjava/util/ArrayList;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;I)Lcom/zykj/mistake/feature/collection/list/v;

    .line 318
    .line 319
    .line 320
    move-result-object v4

    .line 321
    invoke-virtual {v3, v2, v4}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    move-result v2

    .line 325
    if-eqz v2, :cond_d

    .line 326
    .line 327
    goto/16 :goto_1

    .line 328
    .line 329
    :cond_e
    instance-of v2, v1, Lcom/zykj/mistake/feature/collection/list/t;

    .line 330
    .line 331
    if-eqz v2, :cond_11

    .line 332
    .line 333
    :cond_f
    invoke-virtual {v3}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    move-object v4, v2

    .line 338
    check-cast v4, Lcom/zykj/mistake/feature/collection/list/v;

    .line 339
    .line 340
    iget-object v5, v4, Lcom/zykj/mistake/feature/collection/list/v;->l:Ljava/util/Set;

    .line 341
    .line 342
    check-cast v5, Ljava/lang/Iterable;

    .line 343
    .line 344
    invoke-static {v5}, Lkotlin/collections/t;->G0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 345
    .line 346
    .line 347
    move-result-object v13

    .line 348
    move-object v5, v1

    .line 349
    check-cast v5, Lcom/zykj/mistake/feature/collection/list/t;

    .line 350
    .line 351
    iget-object v5, v5, Lcom/zykj/mistake/feature/collection/list/t;->a:Ljava/lang/String;

    .line 352
    .line 353
    invoke-interface {v13, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 354
    .line 355
    .line 356
    move-result v6

    .line 357
    if-nez v6, :cond_10

    .line 358
    .line 359
    invoke-interface {v13, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    :cond_10
    const/4 v12, 0x0

    .line 363
    const/16 v14, 0x7ff

    .line 364
    .line 365
    const/4 v5, 0x0

    .line 366
    const/4 v6, 0x0

    .line 367
    const/4 v7, 0x0

    .line 368
    const/4 v8, 0x0

    .line 369
    const/4 v9, 0x0

    .line 370
    const/4 v10, 0x0

    .line 371
    const/4 v11, 0x0

    .line 372
    invoke-static/range {v4 .. v14}, Lcom/zykj/mistake/feature/collection/list/v;->a(Lcom/zykj/mistake/feature/collection/list/v;ILjava/util/ArrayList;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;I)Lcom/zykj/mistake/feature/collection/list/v;

    .line 373
    .line 374
    .line 375
    move-result-object v4

    .line 376
    invoke-virtual {v3, v2, v4}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    move-result v2

    .line 380
    if-eqz v2, :cond_f

    .line 381
    .line 382
    goto/16 :goto_1

    .line 383
    .line 384
    :cond_11
    sget-object v2, Lcom/zykj/mistake/feature/collection/list/o;->a:Lcom/zykj/mistake/feature/collection/list/o;

    .line 385
    .line 386
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    move-result v2

    .line 390
    if-eqz v2, :cond_12

    .line 391
    .line 392
    sget-object v1, Lcom/zykj/mistake/feature/collection/list/e;->a:Lcom/zykj/mistake/feature/collection/list/e;

    .line 393
    .line 394
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;->c(Lcom/zykj/mistake/feature/collection/list/g;)V

    .line 395
    .line 396
    .line 397
    return-void

    .line 398
    :cond_12
    sget-object v2, Lcom/zykj/mistake/feature/collection/list/n;->a:Lcom/zykj/mistake/feature/collection/list/n;

    .line 399
    .line 400
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    move-result v2

    .line 404
    if-eqz v2, :cond_16

    .line 405
    .line 406
    invoke-virtual {v3}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v1

    .line 410
    check-cast v1, Lcom/zykj/mistake/feature/collection/list/v;

    .line 411
    .line 412
    iget-object v1, v1, Lcom/zykj/mistake/feature/collection/list/v;->l:Ljava/util/Set;

    .line 413
    .line 414
    move-object v2, v1

    .line 415
    check-cast v2, Ljava/lang/Iterable;

    .line 416
    .line 417
    new-instance v3, Ljava/util/ArrayList;

    .line 418
    .line 419
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 420
    .line 421
    .line 422
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 423
    .line 424
    .line 425
    move-result-object v2

    .line 426
    :cond_13
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 427
    .line 428
    .line 429
    move-result v6

    .line 430
    if-eqz v6, :cond_14

    .line 431
    .line 432
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v6

    .line 436
    check-cast v6, Ljava/lang/String;

    .line 437
    .line 438
    invoke-static {v6}, Lkotlin/text/w;->D(Ljava/lang/String;)Ljava/lang/Integer;

    .line 439
    .line 440
    .line 441
    move-result-object v6

    .line 442
    if-eqz v6, :cond_13

    .line 443
    .line 444
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 445
    .line 446
    .line 447
    goto :goto_0

    .line 448
    :cond_14
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 449
    .line 450
    .line 451
    move-result v2

    .line 452
    if-eqz v2, :cond_15

    .line 453
    .line 454
    goto/16 :goto_1

    .line 455
    .line 456
    :cond_15
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 457
    .line 458
    .line 459
    move-result-object v2

    .line 460
    new-instance v6, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$removeSelectedCollections$1;

    .line 461
    .line 462
    invoke-direct {v6, v0, v3, v1, v5}, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$removeSelectedCollections$1;-><init>(Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;Ljava/util/List;Ljava/util/Set;Lh6/c;)V

    .line 463
    .line 464
    .line 465
    invoke-static {v2, v5, v5, v6, v4}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 466
    .line 467
    .line 468
    return-void

    .line 469
    :cond_16
    sget-object v2, Lcom/zykj/mistake/feature/collection/list/j;->a:Lcom/zykj/mistake/feature/collection/list/j;

    .line 470
    .line 471
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 472
    .line 473
    .line 474
    move-result v2

    .line 475
    if-eqz v2, :cond_18

    .line 476
    .line 477
    :cond_17
    invoke-virtual {v3}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    move-object v4, v1

    .line 482
    check-cast v4, Lcom/zykj/mistake/feature/collection/list/v;

    .line 483
    .line 484
    sget-object v13, Lkotlin/collections/EmptySet;->INSTANCE:Lkotlin/collections/EmptySet;

    .line 485
    .line 486
    const/16 v14, 0x3ff

    .line 487
    .line 488
    const/4 v5, 0x0

    .line 489
    const/4 v6, 0x0

    .line 490
    const/4 v7, 0x0

    .line 491
    const/4 v8, 0x0

    .line 492
    const/4 v9, 0x0

    .line 493
    const/4 v10, 0x0

    .line 494
    const/4 v11, 0x0

    .line 495
    const/4 v12, 0x0

    .line 496
    invoke-static/range {v4 .. v14}, Lcom/zykj/mistake/feature/collection/list/v;->a(Lcom/zykj/mistake/feature/collection/list/v;ILjava/util/ArrayList;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;I)Lcom/zykj/mistake/feature/collection/list/v;

    .line 497
    .line 498
    .line 499
    move-result-object v2

    .line 500
    invoke-virtual {v3, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 501
    .line 502
    .line 503
    move-result v1

    .line 504
    if-eqz v1, :cond_17

    .line 505
    .line 506
    goto :goto_1

    .line 507
    :cond_18
    instance-of v2, v1, Lcom/zykj/mistake/feature/collection/list/l;

    .line 508
    .line 509
    if-eqz v2, :cond_1c

    .line 510
    .line 511
    invoke-virtual {v3}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v2

    .line 515
    check-cast v2, Lcom/zykj/mistake/feature/collection/list/v;

    .line 516
    .line 517
    iget-object v2, v2, Lcom/zykj/mistake/feature/collection/list/v;->c:Ljava/util/List;

    .line 518
    .line 519
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 520
    .line 521
    .line 522
    move-result-object v2

    .line 523
    :cond_19
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 524
    .line 525
    .line 526
    move-result v3

    .line 527
    if-eqz v3, :cond_1a

    .line 528
    .line 529
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v3

    .line 533
    move-object v4, v3

    .line 534
    check-cast v4, Lcom/zykj/mistake/feature/collection/list/b;

    .line 535
    .line 536
    iget-object v4, v4, Lcom/zykj/mistake/feature/collection/list/b;->a:Ljava/lang/String;

    .line 537
    .line 538
    move-object v6, v1

    .line 539
    check-cast v6, Lcom/zykj/mistake/feature/collection/list/l;

    .line 540
    .line 541
    iget-object v6, v6, Lcom/zykj/mistake/feature/collection/list/l;->a:Ljava/lang/String;

    .line 542
    .line 543
    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 544
    .line 545
    .line 546
    move-result v4

    .line 547
    if-eqz v4, :cond_19

    .line 548
    .line 549
    move-object v5, v3

    .line 550
    :cond_1a
    check-cast v5, Lcom/zykj/mistake/feature/collection/list/b;

    .line 551
    .line 552
    if-nez v5, :cond_1b

    .line 553
    .line 554
    goto :goto_1

    .line 555
    :cond_1b
    new-instance v1, Lcom/zykj/mistake/feature/collection/list/d;

    .line 556
    .line 557
    iget-object v2, v5, Lcom/zykj/mistake/feature/collection/list/b;->a:Ljava/lang/String;

    .line 558
    .line 559
    iget-object v3, v5, Lcom/zykj/mistake/feature/collection/list/b;->b:Ljava/lang/String;

    .line 560
    .line 561
    iget v4, v5, Lcom/zykj/mistake/feature/collection/list/b;->c:I

    .line 562
    .line 563
    sget-object v5, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;->EXISTING:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;

    .line 564
    .line 565
    invoke-direct {v1, v2, v3, v4, v5}, Lcom/zykj/mistake/feature/collection/list/d;-><init>(Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;)V

    .line 566
    .line 567
    .line 568
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;->c(Lcom/zykj/mistake/feature/collection/list/g;)V

    .line 569
    .line 570
    .line 571
    return-void

    .line 572
    :cond_1c
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    .line 573
    .line 574
    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 575
    .line 576
    .line 577
    throw v1

    .line 578
    :cond_1d
    :goto_1
    return-void
.end method

.method public final b()V
    .locals 14

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;->g:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;->f:Lkotlinx/coroutines/k1;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lkotlinx/coroutines/c1;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 12
    .line 13
    .line 14
    :cond_1
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;->b:Lkotlinx/coroutines/flow/n0;

    .line 15
    .line 16
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    move-object v3, v2

    .line 21
    check-cast v3, Lcom/zykj/mistake/feature/collection/list/v;

    .line 22
    .line 23
    sget-object v12, Lkotlin/collections/EmptySet;->INSTANCE:Lkotlin/collections/EmptySet;

    .line 24
    .line 25
    const/16 v13, 0x3c7

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    const/4 v5, 0x0

    .line 29
    const/4 v6, 0x1

    .line 30
    const/4 v7, 0x0

    .line 31
    const/4 v8, 0x0

    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v10, 0x0

    .line 34
    const/4 v11, 0x0

    .line 35
    invoke-static/range {v3 .. v13}, Lcom/zykj/mistake/feature/collection/list/v;->a(Lcom/zykj/mistake/feature/collection/list/v;ILjava/util/ArrayList;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Set;I)Lcom/zykj/mistake/feature/collection/list/v;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v0, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    new-instance v2, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$requestCollections$2;

    .line 50
    .line 51
    invoke-direct {v2, p0, v1}, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$requestCollections$2;-><init>(Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;Lh6/c;)V

    .line 52
    .line 53
    .line 54
    const/4 v3, 0x3

    .line 55
    invoke-static {v0, v1, v1, v2, v3}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;->f:Lkotlinx/coroutines/k1;

    .line 60
    .line 61
    return-void
.end method

.method public final c(Lcom/zykj/mistake/feature/collection/list/g;)V
    .locals 3

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$sendEffect$1;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, v2}, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel$sendEffect$1;-><init>(Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;Lcom/zykj/mistake/feature/collection/list/g;Lh6/c;)V

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
