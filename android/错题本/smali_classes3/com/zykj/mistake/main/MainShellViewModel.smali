.class public final Lcom/zykj/mistake/main/MainShellViewModel;
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
        "Lcom/zykj/mistake/main/MainShellViewModel;",
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
        "SMAP\nMainShellViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainShellViewModel.kt\ncom/zykj/mistake/main/MainShellViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,397:1\n230#2,5:398\n230#2,5:403\n230#2,5:408\n230#2,5:413\n230#2,5:418\n230#2,5:426\n230#2,5:431\n230#2,5:436\n230#2,5:441\n1761#3,3:423\n*S KotlinDebug\n*F\n+ 1 MainShellViewModel.kt\ncom/zykj/mistake/main/MainShellViewModel\n*L\n140#1:398,5\n151#1:403,5\n155#1:408,5\n171#1:413,5\n185#1:418,5\n286#1:426,5\n306#1:431,5\n357#1:436,5\n361#1:441,5\n244#1:423,3\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lkotlinx/coroutines/flow/n0;

.field public final b:Lkotlinx/coroutines/flow/a0;

.field public final c:Lkotlinx/coroutines/flow/f0;

.field public final d:Lkotlinx/coroutines/flow/z;

.field public final e:Lkotlinx/coroutines/flow/n0;

.field public final f:Lkotlinx/coroutines/flow/a0;

.field public g:Lcom/zykj/mistake/main/p;

.field public h:Z

.field public i:Z

.field public j:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/zykj/mistake/main/m;

    .line 5
    .line 6
    sget-object v1, Lcom/zykj/mistake/main/b;->a:Lcom/zykj/mistake/main/b;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v0, v1, v2}, Lcom/zykj/mistake/main/m;-><init>(Lcom/zykj/mistake/main/l;Lcom/zykj/mistake/main/RemoveDialogTarget;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lkotlinx/coroutines/flow/h;->b(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lcom/zykj/mistake/main/MainShellViewModel;->a:Lkotlinx/coroutines/flow/n0;

    .line 17
    .line 18
    new-instance v1, Lkotlinx/coroutines/flow/a0;

    .line 19
    .line 20
    invoke-direct {v1, v0}, Lkotlinx/coroutines/flow/a0;-><init>(Lkotlinx/coroutines/flow/y;)V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Lcom/zykj/mistake/main/MainShellViewModel;->b:Lkotlinx/coroutines/flow/a0;

    .line 24
    .line 25
    const/16 v0, 0x8

    .line 26
    .line 27
    const/4 v1, 0x5

    .line 28
    invoke-static {v0, v1, v2}, Lkotlinx/coroutines/flow/h;->a(IILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/f0;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lcom/zykj/mistake/main/MainShellViewModel;->c:Lkotlinx/coroutines/flow/f0;

    .line 33
    .line 34
    new-instance v1, Lkotlinx/coroutines/flow/z;

    .line 35
    .line 36
    invoke-direct {v1, v0}, Lkotlinx/coroutines/flow/z;-><init>(Lkotlinx/coroutines/flow/x;)V

    .line 37
    .line 38
    .line 39
    iput-object v1, p0, Lcom/zykj/mistake/main/MainShellViewModel;->d:Lkotlinx/coroutines/flow/z;

    .line 40
    .line 41
    invoke-static {v2}, Lkotlinx/coroutines/flow/h;->b(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n0;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, p0, Lcom/zykj/mistake/main/MainShellViewModel;->e:Lkotlinx/coroutines/flow/n0;

    .line 46
    .line 47
    new-instance v1, Lkotlinx/coroutines/flow/a0;

    .line 48
    .line 49
    invoke-direct {v1, v0}, Lkotlinx/coroutines/flow/a0;-><init>(Lkotlinx/coroutines/flow/y;)V

    .line 50
    .line 51
    .line 52
    iput-object v1, p0, Lcom/zykj/mistake/main/MainShellViewModel;->f:Lkotlinx/coroutines/flow/a0;

    .line 53
    .line 54
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    .line 1
    :cond_0
    iget-object v0, p0, Lcom/zykj/mistake/main/MainShellViewModel;->a:Lkotlinx/coroutines/flow/n0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, Lcom/zykj/mistake/main/m;

    .line 9
    .line 10
    sget-object v3, Lcom/zykj/mistake/main/b;->a:Lcom/zykj/mistake/main/b;

    .line 11
    .line 12
    const/4 v4, 0x2

    .line 13
    const/4 v5, 0x0

    .line 14
    invoke-static {v2, v3, v5, v4}, Lcom/zykj/mistake/main/m;->a(Lcom/zykj/mistake/main/m;Lcom/zykj/mistake/main/l;Lcom/zykj/mistake/main/RemoveDialogTarget;I)Lcom/zykj/mistake/main/m;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v0, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    return-void
.end method

.method public final b(Lcom/zykj/mistake/main/l;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    sget-object v2, Lcom/zykj/mistake/main/c0;->a:Lcom/zykj/mistake/main/c0;

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/zykj/mistake/main/MainShellViewModel;->a()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    instance-of v2, v1, Lcom/zykj/mistake/main/r0;

    .line 18
    .line 19
    const/4 v3, 0x2

    .line 20
    iget-object v4, v0, Lcom/zykj/mistake/main/MainShellViewModel;->a:Lkotlinx/coroutines/flow/n0;

    .line 21
    .line 22
    const/4 v5, 0x0

    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    check-cast v1, Lcom/zykj/mistake/main/r0;

    .line 26
    .line 27
    iget-object v2, v1, Lcom/zykj/mistake/main/r0;->a:Ljava/util/List;

    .line 28
    .line 29
    :cond_1
    invoke-virtual {v4}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    move-object v6, v1

    .line 34
    check-cast v6, Lcom/zykj/mistake/main/m;

    .line 35
    .line 36
    new-instance v7, Lcom/zykj/mistake/main/d;

    .line 37
    .line 38
    new-instance v8, Lcom/zykj/mistake/main/a1;

    .line 39
    .line 40
    sget-object v9, Lcom/zykj/mistake/main/TagEditorTarget;->NOTEBOOK:Lcom/zykj/mistake/main/TagEditorTarget;

    .line 41
    .line 42
    const/16 v10, 0xc

    .line 43
    .line 44
    invoke-direct {v8, v9, v2, v5, v10}, Lcom/zykj/mistake/main/a1;-><init>(Lcom/zykj/mistake/main/TagEditorTarget;Ljava/util/List;Ljava/util/List;I)V

    .line 45
    .line 46
    .line 47
    invoke-direct {v7, v8}, Lcom/zykj/mistake/main/d;-><init>(Lcom/zykj/mistake/main/a1;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v6, v7, v5, v3}, Lcom/zykj/mistake/main/m;->a(Lcom/zykj/mistake/main/m;Lcom/zykj/mistake/main/l;Lcom/zykj/mistake/main/RemoveDialogTarget;I)Lcom/zykj/mistake/main/m;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    invoke-virtual {v4, v1, v6}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    goto/16 :goto_9

    .line 61
    .line 62
    :cond_2
    instance-of v2, v1, Lcom/zykj/mistake/main/o0;

    .line 63
    .line 64
    if-eqz v2, :cond_4

    .line 65
    .line 66
    check-cast v1, Lcom/zykj/mistake/main/o0;

    .line 67
    .line 68
    iget-object v2, v1, Lcom/zykj/mistake/main/o0;->a:Ljava/util/List;

    .line 69
    .line 70
    iget-object v6, v1, Lcom/zykj/mistake/main/o0;->b:Ljava/util/List;

    .line 71
    .line 72
    :cond_3
    invoke-virtual {v4}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    move-object v7, v1

    .line 77
    check-cast v7, Lcom/zykj/mistake/main/m;

    .line 78
    .line 79
    new-instance v8, Lcom/zykj/mistake/main/d;

    .line 80
    .line 81
    new-instance v9, Lcom/zykj/mistake/main/a1;

    .line 82
    .line 83
    sget-object v10, Lcom/zykj/mistake/main/TagEditorTarget;->DETAIL:Lcom/zykj/mistake/main/TagEditorTarget;

    .line 84
    .line 85
    const/16 v11, 0x8

    .line 86
    .line 87
    invoke-direct {v9, v10, v2, v6, v11}, Lcom/zykj/mistake/main/a1;-><init>(Lcom/zykj/mistake/main/TagEditorTarget;Ljava/util/List;Ljava/util/List;I)V

    .line 88
    .line 89
    .line 90
    invoke-direct {v8, v9}, Lcom/zykj/mistake/main/d;-><init>(Lcom/zykj/mistake/main/a1;)V

    .line 91
    .line 92
    .line 93
    invoke-static {v7, v8, v5, v3}, Lcom/zykj/mistake/main/m;->a(Lcom/zykj/mistake/main/m;Lcom/zykj/mistake/main/l;Lcom/zykj/mistake/main/RemoveDialogTarget;I)Lcom/zykj/mistake/main/m;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    invoke-virtual {v4, v1, v7}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-eqz v1, :cond_3

    .line 102
    .line 103
    goto/16 :goto_9

    .line 104
    .line 105
    :cond_4
    instance-of v2, v1, Lcom/zykj/mistake/main/s0;

    .line 106
    .line 107
    if-eqz v2, :cond_7

    .line 108
    .line 109
    check-cast v1, Lcom/zykj/mistake/main/s0;

    .line 110
    .line 111
    iget-object v2, v1, Lcom/zykj/mistake/main/s0;->a:Ljava/util/List;

    .line 112
    .line 113
    :cond_5
    invoke-virtual {v4}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    move-object v6, v1

    .line 118
    check-cast v6, Lcom/zykj/mistake/main/m;

    .line 119
    .line 120
    iget-object v7, v6, Lcom/zykj/mistake/main/m;->a:Lcom/zykj/mistake/main/l;

    .line 121
    .line 122
    instance-of v8, v7, Lcom/zykj/mistake/main/d;

    .line 123
    .line 124
    if-eqz v8, :cond_6

    .line 125
    .line 126
    check-cast v7, Lcom/zykj/mistake/main/d;

    .line 127
    .line 128
    iget-object v7, v7, Lcom/zykj/mistake/main/d;->a:Lcom/zykj/mistake/main/a1;

    .line 129
    .line 130
    const/4 v8, 0x5

    .line 131
    invoke-static {v7, v2, v5, v8}, Lcom/zykj/mistake/main/a1;->a(Lcom/zykj/mistake/main/a1;Ljava/util/List;Lcom/zykj/mistake/main/a;I)Lcom/zykj/mistake/main/a1;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    new-instance v8, Lcom/zykj/mistake/main/d;

    .line 136
    .line 137
    invoke-direct {v8, v7}, Lcom/zykj/mistake/main/d;-><init>(Lcom/zykj/mistake/main/a1;)V

    .line 138
    .line 139
    .line 140
    invoke-static {v6, v8, v5, v3}, Lcom/zykj/mistake/main/m;->a(Lcom/zykj/mistake/main/m;Lcom/zykj/mistake/main/l;Lcom/zykj/mistake/main/RemoveDialogTarget;I)Lcom/zykj/mistake/main/m;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    :cond_6
    invoke-virtual {v4, v1, v6}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-eqz v1, :cond_5

    .line 149
    .line 150
    goto/16 :goto_9

    .line 151
    .line 152
    :cond_7
    instance-of v2, v1, Lcom/zykj/mistake/main/q0;

    .line 153
    .line 154
    if-eqz v2, :cond_11

    .line 155
    .line 156
    check-cast v1, Lcom/zykj/mistake/main/q0;

    .line 157
    .line 158
    iget-object v7, v1, Lcom/zykj/mistake/main/q0;->a:Ljava/util/List;

    .line 159
    .line 160
    iget-object v8, v1, Lcom/zykj/mistake/main/q0;->b:Ljava/util/List;

    .line 161
    .line 162
    iget-object v6, v0, Lcom/zykj/mistake/main/MainShellViewModel;->g:Lcom/zykj/mistake/main/p;

    .line 163
    .line 164
    if-eqz v6, :cond_f

    .line 165
    .line 166
    new-instance v1, Ljava/util/ArrayList;

    .line 167
    .line 168
    const/16 v2, 0xa

    .line 169
    .line 170
    invoke-static {v7, v2}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 171
    .line 172
    .line 173
    move-result v9

    .line 174
    invoke-direct {v1, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 175
    .line 176
    .line 177
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 178
    .line 179
    .line 180
    move-result-object v9

    .line 181
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 182
    .line 183
    .line 184
    move-result v10

    .line 185
    if-eqz v10, :cond_8

    .line 186
    .line 187
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v10

    .line 191
    check-cast v10, Lp4/a;

    .line 192
    .line 193
    iget-wide v10, v10, Lp4/a;->a:J

    .line 194
    .line 195
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 196
    .line 197
    .line 198
    move-result-object v10

    .line 199
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    goto :goto_0

    .line 203
    :cond_8
    invoke-static {v1}, Lkotlin/collections/t;->H0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    new-instance v9, Ljava/util/ArrayList;

    .line 208
    .line 209
    invoke-static {v8, v2}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 210
    .line 211
    .line 212
    move-result v10

    .line 213
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 214
    .line 215
    .line 216
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 217
    .line 218
    .line 219
    move-result-object v10

    .line 220
    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 221
    .line 222
    .line 223
    move-result v11

    .line 224
    if-eqz v11, :cond_9

    .line 225
    .line 226
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v11

    .line 230
    check-cast v11, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 231
    .line 232
    invoke-virtual {v11}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 233
    .line 234
    .line 235
    move-result-wide v11

    .line 236
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 237
    .line 238
    .line 239
    move-result-object v11

    .line 240
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    goto :goto_1

    .line 244
    :cond_9
    invoke-static {v9}, Lkotlin/collections/t;->H0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 245
    .line 246
    .line 247
    move-result-object v9

    .line 248
    iget-object v10, v6, Lcom/zykj/mistake/main/p;->l:Ljava/util/List;

    .line 249
    .line 250
    new-instance v11, Ljava/util/ArrayList;

    .line 251
    .line 252
    invoke-static {v10, v2}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 253
    .line 254
    .line 255
    move-result v2

    .line 256
    invoke-direct {v11, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 257
    .line 258
    .line 259
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 264
    .line 265
    .line 266
    move-result v10

    .line 267
    if-eqz v10, :cond_a

    .line 268
    .line 269
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v10

    .line 273
    check-cast v10, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 274
    .line 275
    invoke-virtual {v10}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 276
    .line 277
    .line 278
    move-result-wide v12

    .line 279
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 280
    .line 281
    .line 282
    move-result-object v10

    .line 283
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    goto :goto_2

    .line 287
    :cond_a
    invoke-static {v11}, Lkotlin/collections/t;->H0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    iget-object v10, v6, Lcom/zykj/mistake/main/p;->g:Ljava/util/Set;

    .line 292
    .line 293
    check-cast v10, Ljava/lang/Iterable;

    .line 294
    .line 295
    new-instance v11, Ljava/util/ArrayList;

    .line 296
    .line 297
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 298
    .line 299
    .line 300
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 301
    .line 302
    .line 303
    move-result-object v10

    .line 304
    :cond_b
    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 305
    .line 306
    .line 307
    move-result v12

    .line 308
    if-eqz v12, :cond_c

    .line 309
    .line 310
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v12

    .line 314
    move-object v13, v12

    .line 315
    check-cast v13, Ljava/lang/Number;

    .line 316
    .line 317
    invoke-virtual {v13}, Ljava/lang/Number;->longValue()J

    .line 318
    .line 319
    .line 320
    move-result-wide v13

    .line 321
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 322
    .line 323
    .line 324
    move-result-object v13

    .line 325
    invoke-interface {v1, v13}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v13

    .line 329
    if-eqz v13, :cond_b

    .line 330
    .line 331
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    goto :goto_3

    .line 335
    :cond_c
    invoke-static {v11}, Lkotlin/collections/t;->H0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 336
    .line 337
    .line 338
    move-result-object v13

    .line 339
    new-instance v1, Ljava/util/ArrayList;

    .line 340
    .line 341
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 342
    .line 343
    .line 344
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 345
    .line 346
    .line 347
    move-result-object v10

    .line 348
    :cond_d
    :goto_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 349
    .line 350
    .line 351
    move-result v11

    .line 352
    if-eqz v11, :cond_e

    .line 353
    .line 354
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v11

    .line 358
    move-object v12, v11

    .line 359
    check-cast v12, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 360
    .line 361
    invoke-virtual {v12}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 362
    .line 363
    .line 364
    move-result-wide v14

    .line 365
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 366
    .line 367
    .line 368
    move-result-object v14

    .line 369
    invoke-interface {v2, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    move-result v14

    .line 373
    if-eqz v14, :cond_d

    .line 374
    .line 375
    invoke-virtual {v12}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 376
    .line 377
    .line 378
    move-result-wide v14

    .line 379
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 380
    .line 381
    .line 382
    move-result-object v12

    .line 383
    invoke-interface {v9, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    move-result v12

    .line 387
    if-eqz v12, :cond_d

    .line 388
    .line 389
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    goto :goto_4

    .line 393
    :cond_e
    const/16 v19, 0x7bc

    .line 394
    .line 395
    const/4 v9, 0x0

    .line 396
    const/4 v10, 0x0

    .line 397
    const/4 v11, 0x0

    .line 398
    const/4 v12, 0x0

    .line 399
    const/4 v14, 0x0

    .line 400
    const/4 v15, 0x0

    .line 401
    const/16 v16, 0x0

    .line 402
    .line 403
    const/16 v17, 0x0

    .line 404
    .line 405
    move-object/from16 v18, v1

    .line 406
    .line 407
    invoke-static/range {v6 .. v19}, Lcom/zykj/mistake/main/p;->a(Lcom/zykj/mistake/main/p;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/util/List;I)Lcom/zykj/mistake/main/p;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    :goto_5
    move-object v2, v1

    .line 412
    goto :goto_6

    .line 413
    :cond_f
    new-instance v1, Lcom/zykj/mistake/main/p;

    .line 414
    .line 415
    invoke-direct {v1, v7, v8}, Lcom/zykj/mistake/main/p;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 416
    .line 417
    .line 418
    goto :goto_5

    .line 419
    :cond_10
    :goto_6
    invoke-virtual {v4}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v1

    .line 423
    move-object v6, v1

    .line 424
    check-cast v6, Lcom/zykj/mistake/main/m;

    .line 425
    .line 426
    new-instance v7, Lcom/zykj/mistake/main/c;

    .line 427
    .line 428
    invoke-direct {v7, v2}, Lcom/zykj/mistake/main/c;-><init>(Lcom/zykj/mistake/main/p;)V

    .line 429
    .line 430
    .line 431
    invoke-static {v6, v7, v5, v3}, Lcom/zykj/mistake/main/m;->a(Lcom/zykj/mistake/main/m;Lcom/zykj/mistake/main/l;Lcom/zykj/mistake/main/RemoveDialogTarget;I)Lcom/zykj/mistake/main/m;

    .line 432
    .line 433
    .line 434
    move-result-object v6

    .line 435
    invoke-virtual {v4, v1, v6}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    move-result v1

    .line 439
    if-eqz v1, :cond_10

    .line 440
    .line 441
    goto/16 :goto_9

    .line 442
    .line 443
    :cond_11
    instance-of v2, v1, Lcom/zykj/mistake/main/i0;

    .line 444
    .line 445
    if-eqz v2, :cond_12

    .line 446
    .line 447
    invoke-virtual {v0}, Lcom/zykj/mistake/main/MainShellViewModel;->a()V

    .line 448
    .line 449
    .line 450
    new-instance v2, Lcom/zykj/mistake/main/w;

    .line 451
    .line 452
    check-cast v1, Lcom/zykj/mistake/main/i0;

    .line 453
    .line 454
    iget-object v3, v1, Lcom/zykj/mistake/main/i0;->a:Lcom/zykj/mistake/main/TagEditorTarget;

    .line 455
    .line 456
    iget-object v1, v1, Lcom/zykj/mistake/main/i0;->b:Lcom/zykj/mistake/main/z0;

    .line 457
    .line 458
    invoke-direct {v2, v3, v1}, Lcom/zykj/mistake/main/w;-><init>(Lcom/zykj/mistake/main/TagEditorTarget;Lcom/zykj/mistake/main/z0;)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v0, v2}, Lcom/zykj/mistake/main/MainShellViewModel;->c(Lcom/zykj/mistake/main/a0;)V

    .line 462
    .line 463
    .line 464
    return-void

    .line 465
    :cond_12
    instance-of v2, v1, Lcom/zykj/mistake/main/g0;

    .line 466
    .line 467
    const/4 v6, 0x3

    .line 468
    if-eqz v2, :cond_19

    .line 469
    .line 470
    check-cast v1, Lcom/zykj/mistake/main/g0;

    .line 471
    .line 472
    iget-object v1, v1, Lcom/zykj/mistake/main/g0;->a:Lcom/zykj/mistake/main/p;

    .line 473
    .line 474
    iput-object v1, v0, Lcom/zykj/mistake/main/MainShellViewModel;->g:Lcom/zykj/mistake/main/p;

    .line 475
    .line 476
    invoke-virtual {v0}, Lcom/zykj/mistake/main/MainShellViewModel;->a()V

    .line 477
    .line 478
    .line 479
    new-instance v2, Lcom/zykj/mistake/main/u;

    .line 480
    .line 481
    const-string v3, "<this>"

    .line 482
    .line 483
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 484
    .line 485
    .line 486
    new-instance v3, Lcom/zykj/mistake/entity/req/MistakeListReq;

    .line 487
    .line 488
    invoke-direct {v3}, Lcom/zykj/mistake/entity/req/MistakeListReq;-><init>()V

    .line 489
    .line 490
    .line 491
    iget v4, v1, Lcom/zykj/mistake/main/p;->c:I

    .line 492
    .line 493
    invoke-virtual {v3, v4}, Lcom/zykj/mistake/entity/req/MistakeListReq;->setTimeType(I)V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/req/MistakeListReq;->getTimeType()I

    .line 497
    .line 498
    .line 499
    move-result v4

    .line 500
    if-ne v4, v6, :cond_13

    .line 501
    .line 502
    iget-object v4, v1, Lcom/zykj/mistake/main/p;->d:Ljava/lang/String;

    .line 503
    .line 504
    invoke-virtual {v3, v4}, Lcom/zykj/mistake/entity/req/MistakeListReq;->setStartTime(Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    iget-object v4, v1, Lcom/zykj/mistake/main/p;->e:Ljava/lang/String;

    .line 508
    .line 509
    invoke-virtual {v3, v4}, Lcom/zykj/mistake/entity/req/MistakeListReq;->setEndTime(Ljava/lang/String;)V

    .line 510
    .line 511
    .line 512
    :cond_13
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/req/MistakeListReq;->getTopicIds()Ljava/util/ArrayList;

    .line 513
    .line 514
    .line 515
    move-result-object v4

    .line 516
    iget-object v5, v1, Lcom/zykj/mistake/main/p;->g:Ljava/util/Set;

    .line 517
    .line 518
    check-cast v5, Ljava/util/Collection;

    .line 519
    .line 520
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 521
    .line 522
    .line 523
    iget-object v4, v1, Lcom/zykj/mistake/main/p;->h:Ljava/lang/Integer;

    .line 524
    .line 525
    if-eqz v4, :cond_14

    .line 526
    .line 527
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 528
    .line 529
    .line 530
    move-result v4

    .line 531
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/req/MistakeListReq;->getDiff()Ljava/util/ArrayList;

    .line 532
    .line 533
    .line 534
    move-result-object v5

    .line 535
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 536
    .line 537
    .line 538
    move-result-object v4

    .line 539
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 540
    .line 541
    .line 542
    :cond_14
    iget-object v4, v1, Lcom/zykj/mistake/main/p;->i:Ljava/lang/Integer;

    .line 543
    .line 544
    if-eqz v4, :cond_15

    .line 545
    .line 546
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 547
    .line 548
    .line 549
    move-result v4

    .line 550
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/req/MistakeListReq;->getAttainedLevel()Ljava/util/ArrayList;

    .line 551
    .line 552
    .line 553
    move-result-object v5

    .line 554
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 555
    .line 556
    .line 557
    move-result-object v4

    .line 558
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 559
    .line 560
    .line 561
    :cond_15
    iget-object v4, v1, Lcom/zykj/mistake/main/p;->j:Ljava/lang/Integer;

    .line 562
    .line 563
    if-eqz v4, :cond_16

    .line 564
    .line 565
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 566
    .line 567
    .line 568
    move-result v4

    .line 569
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/req/MistakeListReq;->getErrorReason()Ljava/util/ArrayList;

    .line 570
    .line 571
    .line 572
    move-result-object v5

    .line 573
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 574
    .line 575
    .line 576
    move-result-object v4

    .line 577
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 578
    .line 579
    .line 580
    :cond_16
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/req/MistakeListReq;->getTagIdList()Ljava/util/ArrayList;

    .line 581
    .line 582
    .line 583
    move-result-object v4

    .line 584
    invoke-static {}, Lkotlin/collections/u;->q()Lkotlin/collections/builders/ListBuilder;

    .line 585
    .line 586
    .line 587
    move-result-object v5

    .line 588
    iget-boolean v6, v1, Lcom/zykj/mistake/main/p;->k:Z

    .line 589
    .line 590
    const/4 v7, 0x0

    .line 591
    if-eqz v6, :cond_17

    .line 592
    .line 593
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 594
    .line 595
    .line 596
    move-result-object v6

    .line 597
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 598
    .line 599
    .line 600
    :cond_17
    iget-object v1, v1, Lcom/zykj/mistake/main/p;->l:Ljava/util/List;

    .line 601
    .line 602
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 603
    .line 604
    .line 605
    move-result-object v1

    .line 606
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 607
    .line 608
    .line 609
    move-result v6

    .line 610
    if-eqz v6, :cond_18

    .line 611
    .line 612
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    move-result-object v6

    .line 616
    check-cast v6, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 617
    .line 618
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 619
    .line 620
    .line 621
    move-result-wide v8

    .line 622
    long-to-int v6, v8

    .line 623
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 624
    .line 625
    .line 626
    move-result-object v6

    .line 627
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 628
    .line 629
    .line 630
    goto :goto_7

    .line 631
    :cond_18
    invoke-virtual {v5}, Lkotlin/collections/builders/ListBuilder;->build()Ljava/util/List;

    .line 632
    .line 633
    .line 634
    move-result-object v1

    .line 635
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 636
    .line 637
    .line 638
    invoke-virtual {v3, v7}, Lcom/zykj/mistake/entity/req/MistakeListReq;->setHaveNoTag(Z)V

    .line 639
    .line 640
    .line 641
    invoke-direct {v2, v3}, Lcom/zykj/mistake/main/u;-><init>(Lcom/zykj/mistake/entity/req/MistakeListReq;)V

    .line 642
    .line 643
    .line 644
    invoke-virtual {v0, v2}, Lcom/zykj/mistake/main/MainShellViewModel;->c(Lcom/zykj/mistake/main/a0;)V

    .line 645
    .line 646
    .line 647
    return-void

    .line 648
    :cond_19
    sget-object v2, Lcom/zykj/mistake/main/w0;->a:Lcom/zykj/mistake/main/w0;

    .line 649
    .line 650
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 651
    .line 652
    .line 653
    move-result v2

    .line 654
    if-eqz v2, :cond_1c

    .line 655
    .line 656
    :cond_1a
    invoke-virtual {v4}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v1

    .line 660
    move-object v2, v1

    .line 661
    check-cast v2, Lcom/zykj/mistake/main/m;

    .line 662
    .line 663
    iget-object v6, v2, Lcom/zykj/mistake/main/m;->a:Lcom/zykj/mistake/main/l;

    .line 664
    .line 665
    instance-of v7, v6, Lcom/zykj/mistake/main/c;

    .line 666
    .line 667
    if-eqz v7, :cond_1b

    .line 668
    .line 669
    check-cast v6, Lcom/zykj/mistake/main/c;

    .line 670
    .line 671
    iget-object v6, v6, Lcom/zykj/mistake/main/c;->a:Lcom/zykj/mistake/main/p;

    .line 672
    .line 673
    new-instance v7, Lcom/zykj/mistake/main/p;

    .line 674
    .line 675
    iget-object v8, v6, Lcom/zykj/mistake/main/p;->a:Ljava/util/List;

    .line 676
    .line 677
    iget-object v6, v6, Lcom/zykj/mistake/main/p;->b:Ljava/util/List;

    .line 678
    .line 679
    invoke-direct {v7, v8, v6}, Lcom/zykj/mistake/main/p;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 680
    .line 681
    .line 682
    new-instance v6, Lcom/zykj/mistake/main/c;

    .line 683
    .line 684
    invoke-direct {v6, v7}, Lcom/zykj/mistake/main/c;-><init>(Lcom/zykj/mistake/main/p;)V

    .line 685
    .line 686
    .line 687
    invoke-static {v2, v6, v5, v3}, Lcom/zykj/mistake/main/m;->a(Lcom/zykj/mistake/main/m;Lcom/zykj/mistake/main/l;Lcom/zykj/mistake/main/RemoveDialogTarget;I)Lcom/zykj/mistake/main/m;

    .line 688
    .line 689
    .line 690
    move-result-object v2

    .line 691
    :cond_1b
    invoke-virtual {v4, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 692
    .line 693
    .line 694
    move-result v1

    .line 695
    if-eqz v1, :cond_1a

    .line 696
    .line 697
    return-void

    .line 698
    :cond_1c
    instance-of v2, v1, Lcom/zykj/mistake/main/x0;

    .line 699
    .line 700
    if-eqz v2, :cond_1e

    .line 701
    .line 702
    move-object v2, v1

    .line 703
    check-cast v2, Lcom/zykj/mistake/main/x0;

    .line 704
    .line 705
    iget v2, v2, Lcom/zykj/mistake/main/x0;->a:I

    .line 706
    .line 707
    if-ne v2, v6, :cond_1d

    .line 708
    .line 709
    invoke-virtual {v0}, Lcom/zykj/mistake/main/MainShellViewModel;->d()V

    .line 710
    .line 711
    .line 712
    return-void

    .line 713
    :cond_1d
    new-instance v2, Landroidx/navigation/i;

    .line 714
    .line 715
    const/16 v3, 0xf

    .line 716
    .line 717
    invoke-direct {v2, v1, v3}, Landroidx/navigation/i;-><init>(Ljava/lang/Object;I)V

    .line 718
    .line 719
    .line 720
    invoke-virtual {v0, v2}, Lcom/zykj/mistake/main/MainShellViewModel;->e(Lr6/c;)V

    .line 721
    .line 722
    .line 723
    return-void

    .line 724
    :cond_1e
    sget-object v2, Lcom/zykj/mistake/main/t0;->a:Lcom/zykj/mistake/main/t0;

    .line 725
    .line 726
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 727
    .line 728
    .line 729
    move-result v2

    .line 730
    if-eqz v2, :cond_1f

    .line 731
    .line 732
    invoke-virtual {v0}, Lcom/zykj/mistake/main/MainShellViewModel;->d()V

    .line 733
    .line 734
    .line 735
    return-void

    .line 736
    :cond_1f
    sget-object v2, Lcom/zykj/mistake/main/n0;->a:Lcom/zykj/mistake/main/n0;

    .line 737
    .line 738
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 739
    .line 740
    .line 741
    move-result v2

    .line 742
    if-eqz v2, :cond_20

    .line 743
    .line 744
    new-instance v1, Lcom/zykj/mistake/feature/notebook/list/k1;

    .line 745
    .line 746
    const/4 v2, 0x7

    .line 747
    invoke-direct {v1, v2}, Lcom/zykj/mistake/feature/notebook/list/k1;-><init>(I)V

    .line 748
    .line 749
    .line 750
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/main/MainShellViewModel;->f(Lr6/c;)V

    .line 751
    .line 752
    .line 753
    return-void

    .line 754
    :cond_20
    instance-of v2, v1, Lcom/zykj/mistake/main/p0;

    .line 755
    .line 756
    if-eqz v2, :cond_21

    .line 757
    .line 758
    check-cast v1, Lcom/zykj/mistake/main/p0;

    .line 759
    .line 760
    iget-wide v2, v1, Lcom/zykj/mistake/main/p0;->a:J

    .line 761
    .line 762
    iget-object v1, v1, Lcom/zykj/mistake/main/p0;->b:Ljava/lang/String;

    .line 763
    .line 764
    new-instance v4, Lcom/zykj/mistake/main/n;

    .line 765
    .line 766
    invoke-direct {v4, v2, v3, v1}, Lcom/zykj/mistake/main/n;-><init>(JLjava/lang/String;)V

    .line 767
    .line 768
    .line 769
    invoke-virtual {v0, v4}, Lcom/zykj/mistake/main/MainShellViewModel;->f(Lr6/c;)V

    .line 770
    .line 771
    .line 772
    return-void

    .line 773
    :cond_21
    instance-of v2, v1, Lcom/zykj/mistake/main/b0;

    .line 774
    .line 775
    if-eqz v2, :cond_22

    .line 776
    .line 777
    check-cast v1, Lcom/zykj/mistake/main/b0;

    .line 778
    .line 779
    iget-object v1, v1, Lcom/zykj/mistake/main/b0;->a:Ljava/lang/String;

    .line 780
    .line 781
    new-instance v2, Landroidx/navigation/internal/d;

    .line 782
    .line 783
    const/4 v3, 0x4

    .line 784
    invoke-direct {v2, v1, v3}, Landroidx/navigation/internal/d;-><init>(Ljava/lang/String;I)V

    .line 785
    .line 786
    .line 787
    invoke-virtual {v0, v2}, Lcom/zykj/mistake/main/MainShellViewModel;->f(Lr6/c;)V

    .line 788
    .line 789
    .line 790
    return-void

    .line 791
    :cond_22
    sget-object v2, Lcom/zykj/mistake/main/l0;->a:Lcom/zykj/mistake/main/l0;

    .line 792
    .line 793
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 794
    .line 795
    .line 796
    move-result v2

    .line 797
    if-eqz v2, :cond_25

    .line 798
    .line 799
    :cond_23
    invoke-virtual {v4}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 800
    .line 801
    .line 802
    move-result-object v1

    .line 803
    move-object v2, v1

    .line 804
    check-cast v2, Lcom/zykj/mistake/main/m;

    .line 805
    .line 806
    iget-object v6, v2, Lcom/zykj/mistake/main/m;->a:Lcom/zykj/mistake/main/l;

    .line 807
    .line 808
    instance-of v7, v6, Lcom/zykj/mistake/main/d;

    .line 809
    .line 810
    if-eqz v7, :cond_24

    .line 811
    .line 812
    check-cast v6, Lcom/zykj/mistake/main/d;

    .line 813
    .line 814
    iget-object v6, v6, Lcom/zykj/mistake/main/d;->a:Lcom/zykj/mistake/main/a1;

    .line 815
    .line 816
    const-string v7, "state"

    .line 817
    .line 818
    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 819
    .line 820
    .line 821
    const/4 v7, 0x7

    .line 822
    invoke-static {v6, v5, v5, v7}, Lcom/zykj/mistake/main/a1;->a(Lcom/zykj/mistake/main/a1;Ljava/util/List;Lcom/zykj/mistake/main/a;I)Lcom/zykj/mistake/main/a1;

    .line 823
    .line 824
    .line 825
    move-result-object v6

    .line 826
    new-instance v7, Lcom/zykj/mistake/main/d;

    .line 827
    .line 828
    invoke-direct {v7, v6}, Lcom/zykj/mistake/main/d;-><init>(Lcom/zykj/mistake/main/a1;)V

    .line 829
    .line 830
    .line 831
    invoke-static {v2, v7, v5, v3}, Lcom/zykj/mistake/main/m;->a(Lcom/zykj/mistake/main/m;Lcom/zykj/mistake/main/l;Lcom/zykj/mistake/main/RemoveDialogTarget;I)Lcom/zykj/mistake/main/m;

    .line 832
    .line 833
    .line 834
    move-result-object v2

    .line 835
    :cond_24
    invoke-virtual {v4, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 836
    .line 837
    .line 838
    move-result v1

    .line 839
    if-eqz v1, :cond_23

    .line 840
    .line 841
    goto/16 :goto_9

    .line 842
    .line 843
    :cond_25
    sget-object v2, Lcom/zykj/mistake/main/e0;->a:Lcom/zykj/mistake/main/e0;

    .line 844
    .line 845
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 846
    .line 847
    .line 848
    move-result v2

    .line 849
    if-eqz v2, :cond_2f

    .line 850
    .line 851
    invoke-virtual {v4}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 852
    .line 853
    .line 854
    move-result-object v1

    .line 855
    check-cast v1, Lcom/zykj/mistake/main/m;

    .line 856
    .line 857
    iget-object v1, v1, Lcom/zykj/mistake/main/m;->a:Lcom/zykj/mistake/main/l;

    .line 858
    .line 859
    instance-of v2, v1, Lcom/zykj/mistake/main/d;

    .line 860
    .line 861
    if-eqz v2, :cond_26

    .line 862
    .line 863
    move-object v5, v1

    .line 864
    check-cast v5, Lcom/zykj/mistake/main/d;

    .line 865
    .line 866
    :cond_26
    if-eqz v5, :cond_35

    .line 867
    .line 868
    iget-object v1, v5, Lcom/zykj/mistake/main/d;->a:Lcom/zykj/mistake/main/a1;

    .line 869
    .line 870
    if-nez v1, :cond_27

    .line 871
    .line 872
    goto/16 :goto_9

    .line 873
    .line 874
    :cond_27
    iget-object v2, v1, Lcom/zykj/mistake/main/a1;->d:Lcom/zykj/mistake/main/a;

    .line 875
    .line 876
    if-nez v2, :cond_28

    .line 877
    .line 878
    goto/16 :goto_9

    .line 879
    .line 880
    :cond_28
    iget-boolean v3, v2, Lcom/zykj/mistake/main/a;->e:Z

    .line 881
    .line 882
    if-eqz v3, :cond_29

    .line 883
    .line 884
    goto/16 :goto_9

    .line 885
    .line 886
    :cond_29
    iget-object v3, v2, Lcom/zykj/mistake/main/a;->c:Ljava/lang/String;

    .line 887
    .line 888
    invoke-static {v3}, Lkotlin/text/p;->k0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 889
    .line 890
    .line 891
    move-result-object v3

    .line 892
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 893
    .line 894
    .line 895
    move-result-object v7

    .line 896
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 897
    .line 898
    .line 899
    move-result v3

    .line 900
    if-nez v3, :cond_2a

    .line 901
    .line 902
    new-instance v1, Landroidx/navigation/i;

    .line 903
    .line 904
    const/16 v3, 0x10

    .line 905
    .line 906
    invoke-direct {v1, v2, v3}, Landroidx/navigation/i;-><init>(Ljava/lang/Object;I)V

    .line 907
    .line 908
    .line 909
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/main/MainShellViewModel;->f(Lr6/c;)V

    .line 910
    .line 911
    .line 912
    return-void

    .line 913
    :cond_2a
    iget-object v3, v1, Lcom/zykj/mistake/main/a1;->b:Ljava/util/List;

    .line 914
    .line 915
    if-eqz v3, :cond_2b

    .line 916
    .line 917
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 918
    .line 919
    .line 920
    move-result v4

    .line 921
    if-eqz v4, :cond_2b

    .line 922
    .line 923
    goto :goto_8

    .line 924
    :cond_2b
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 925
    .line 926
    .line 927
    move-result-object v3

    .line 928
    :cond_2c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 929
    .line 930
    .line 931
    move-result v4

    .line 932
    if-eqz v4, :cond_2d

    .line 933
    .line 934
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 935
    .line 936
    .line 937
    move-result-object v4

    .line 938
    check-cast v4, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 939
    .line 940
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 941
    .line 942
    .line 943
    move-result-wide v5

    .line 944
    iget-wide v8, v2, Lcom/zykj/mistake/main/a;->a:J

    .line 945
    .line 946
    cmp-long v5, v5, v8

    .line 947
    .line 948
    if-eqz v5, :cond_2c

    .line 949
    .line 950
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getName()Ljava/lang/String;

    .line 951
    .line 952
    .line 953
    move-result-object v4

    .line 954
    invoke-static {v4}, Lkotlin/text/p;->k0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 955
    .line 956
    .line 957
    move-result-object v4

    .line 958
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 959
    .line 960
    .line 961
    move-result-object v4

    .line 962
    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 963
    .line 964
    .line 965
    move-result v4

    .line 966
    if-eqz v4, :cond_2c

    .line 967
    .line 968
    new-instance v1, Lcom/zykj/mistake/feature/notebook/list/k1;

    .line 969
    .line 970
    const/4 v2, 0x5

    .line 971
    invoke-direct {v1, v2}, Lcom/zykj/mistake/feature/notebook/list/k1;-><init>(I)V

    .line 972
    .line 973
    .line 974
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/main/MainShellViewModel;->f(Lr6/c;)V

    .line 975
    .line 976
    .line 977
    return-void

    .line 978
    :cond_2d
    :goto_8
    new-instance v3, Landroidx/navigation/d;

    .line 979
    .line 980
    const/16 v4, 0xc

    .line 981
    .line 982
    invoke-direct {v3, v4, v2, v7}, Landroidx/navigation/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 983
    .line 984
    .line 985
    invoke-virtual {v0, v3}, Lcom/zykj/mistake/main/MainShellViewModel;->f(Lr6/c;)V

    .line 986
    .line 987
    .line 988
    iget-wide v8, v2, Lcom/zykj/mistake/main/a;->a:J

    .line 989
    .line 990
    const-wide/16 v3, 0x0

    .line 991
    .line 992
    cmp-long v3, v8, v3

    .line 993
    .line 994
    if-nez v3, :cond_2e

    .line 995
    .line 996
    new-instance v2, Lcom/zykj/mistake/main/x;

    .line 997
    .line 998
    iget-object v1, v1, Lcom/zykj/mistake/main/a1;->a:Lcom/zykj/mistake/main/TagEditorTarget;

    .line 999
    .line 1000
    invoke-direct {v2, v1, v7}, Lcom/zykj/mistake/main/x;-><init>(Lcom/zykj/mistake/main/TagEditorTarget;Ljava/lang/String;)V

    .line 1001
    .line 1002
    .line 1003
    invoke-virtual {v0, v2}, Lcom/zykj/mistake/main/MainShellViewModel;->c(Lcom/zykj/mistake/main/a0;)V

    .line 1004
    .line 1005
    .line 1006
    return-void

    .line 1007
    :cond_2e
    new-instance v4, Lcom/zykj/mistake/main/y;

    .line 1008
    .line 1009
    iget-object v5, v1, Lcom/zykj/mistake/main/a1;->a:Lcom/zykj/mistake/main/TagEditorTarget;

    .line 1010
    .line 1011
    iget-object v6, v2, Lcom/zykj/mistake/main/a;->b:Ljava/lang/String;

    .line 1012
    .line 1013
    invoke-direct/range {v4 .. v9}, Lcom/zykj/mistake/main/y;-><init>(Lcom/zykj/mistake/main/TagEditorTarget;Ljava/lang/String;Ljava/lang/String;J)V

    .line 1014
    .line 1015
    .line 1016
    invoke-virtual {v0, v4}, Lcom/zykj/mistake/main/MainShellViewModel;->c(Lcom/zykj/mistake/main/a0;)V

    .line 1017
    .line 1018
    .line 1019
    return-void

    .line 1020
    :cond_2f
    sget-object v2, Lcom/zykj/mistake/main/j0;->a:Lcom/zykj/mistake/main/j0;

    .line 1021
    .line 1022
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1023
    .line 1024
    .line 1025
    move-result v2

    .line 1026
    if-eqz v2, :cond_30

    .line 1027
    .line 1028
    new-instance v1, Lcom/zykj/mistake/feature/notebook/list/k1;

    .line 1029
    .line 1030
    const/4 v2, 0x5

    .line 1031
    invoke-direct {v1, v2}, Lcom/zykj/mistake/feature/notebook/list/k1;-><init>(I)V

    .line 1032
    .line 1033
    .line 1034
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/main/MainShellViewModel;->f(Lr6/c;)V

    .line 1035
    .line 1036
    .line 1037
    return-void

    .line 1038
    :cond_30
    sget-object v2, Lcom/zykj/mistake/main/k0;->a:Lcom/zykj/mistake/main/k0;

    .line 1039
    .line 1040
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1041
    .line 1042
    .line 1043
    move-result v2

    .line 1044
    if-eqz v2, :cond_31

    .line 1045
    .line 1046
    new-instance v1, Lcom/zykj/mistake/feature/notebook/list/k1;

    .line 1047
    .line 1048
    const/4 v2, 0x6

    .line 1049
    invoke-direct {v1, v2}, Lcom/zykj/mistake/feature/notebook/list/k1;-><init>(I)V

    .line 1050
    .line 1051
    .line 1052
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/main/MainShellViewModel;->f(Lr6/c;)V

    .line 1053
    .line 1054
    .line 1055
    return-void

    .line 1056
    :cond_31
    instance-of v2, v1, Lcom/zykj/mistake/main/y0;

    .line 1057
    .line 1058
    const/4 v7, 0x1

    .line 1059
    if-eqz v2, :cond_33

    .line 1060
    .line 1061
    check-cast v1, Lcom/zykj/mistake/main/y0;

    .line 1062
    .line 1063
    iget-object v2, v1, Lcom/zykj/mistake/main/y0;->a:Lcom/zykj/mistake/main/RemoveDialogTarget;

    .line 1064
    .line 1065
    :cond_32
    invoke-virtual {v4}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v1

    .line 1069
    move-object v3, v1

    .line 1070
    check-cast v3, Lcom/zykj/mistake/main/m;

    .line 1071
    .line 1072
    invoke-static {v3, v5, v2, v7}, Lcom/zykj/mistake/main/m;->a(Lcom/zykj/mistake/main/m;Lcom/zykj/mistake/main/l;Lcom/zykj/mistake/main/RemoveDialogTarget;I)Lcom/zykj/mistake/main/m;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v3

    .line 1076
    invoke-virtual {v4, v1, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1077
    .line 1078
    .line 1079
    move-result v1

    .line 1080
    if-eqz v1, :cond_32

    .line 1081
    .line 1082
    goto :goto_9

    .line 1083
    :cond_33
    sget-object v2, Lcom/zykj/mistake/main/m0;->a:Lcom/zykj/mistake/main/m0;

    .line 1084
    .line 1085
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1086
    .line 1087
    .line 1088
    move-result v2

    .line 1089
    if-eqz v2, :cond_36

    .line 1090
    .line 1091
    :cond_34
    invoke-virtual {v4}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v1

    .line 1095
    move-object v2, v1

    .line 1096
    check-cast v2, Lcom/zykj/mistake/main/m;

    .line 1097
    .line 1098
    invoke-static {v2, v5, v5, v7}, Lcom/zykj/mistake/main/m;->a(Lcom/zykj/mistake/main/m;Lcom/zykj/mistake/main/l;Lcom/zykj/mistake/main/RemoveDialogTarget;I)Lcom/zykj/mistake/main/m;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v2

    .line 1102
    invoke-virtual {v4, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1103
    .line 1104
    .line 1105
    move-result v1

    .line 1106
    if-eqz v1, :cond_34

    .line 1107
    .line 1108
    :cond_35
    :goto_9
    return-void

    .line 1109
    :cond_36
    instance-of v2, v1, Lcom/zykj/mistake/main/h0;

    .line 1110
    .line 1111
    if-eqz v2, :cond_3b

    .line 1112
    .line 1113
    check-cast v1, Lcom/zykj/mistake/main/h0;

    .line 1114
    .line 1115
    iget-object v2, v1, Lcom/zykj/mistake/main/h0;->a:Lcom/zykj/mistake/main/RemoveDialogTarget;

    .line 1116
    .line 1117
    :cond_37
    invoke-virtual {v4}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v1

    .line 1121
    move-object v8, v1

    .line 1122
    check-cast v8, Lcom/zykj/mistake/main/m;

    .line 1123
    .line 1124
    invoke-static {v8, v5, v5, v7}, Lcom/zykj/mistake/main/m;->a(Lcom/zykj/mistake/main/m;Lcom/zykj/mistake/main/l;Lcom/zykj/mistake/main/RemoveDialogTarget;I)Lcom/zykj/mistake/main/m;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v8

    .line 1128
    invoke-virtual {v4, v1, v8}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1129
    .line 1130
    .line 1131
    move-result v1

    .line 1132
    if-eqz v1, :cond_37

    .line 1133
    .line 1134
    sget-object v1, Lcom/zykj/mistake/main/o;->a:[I

    .line 1135
    .line 1136
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 1137
    .line 1138
    .line 1139
    move-result v2

    .line 1140
    aget v1, v1, v2

    .line 1141
    .line 1142
    if-eq v1, v7, :cond_3a

    .line 1143
    .line 1144
    if-eq v1, v3, :cond_39

    .line 1145
    .line 1146
    if-ne v1, v6, :cond_38

    .line 1147
    .line 1148
    sget-object v1, Lcom/zykj/mistake/main/s;->a:Lcom/zykj/mistake/main/s;

    .line 1149
    .line 1150
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/main/MainShellViewModel;->c(Lcom/zykj/mistake/main/a0;)V

    .line 1151
    .line 1152
    .line 1153
    return-void

    .line 1154
    :cond_38
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    .line 1155
    .line 1156
    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 1157
    .line 1158
    .line 1159
    throw v1

    .line 1160
    :cond_39
    sget-object v1, Lcom/zykj/mistake/main/t;->a:Lcom/zykj/mistake/main/t;

    .line 1161
    .line 1162
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/main/MainShellViewModel;->c(Lcom/zykj/mistake/main/a0;)V

    .line 1163
    .line 1164
    .line 1165
    return-void

    .line 1166
    :cond_3a
    sget-object v1, Lcom/zykj/mistake/main/v;->a:Lcom/zykj/mistake/main/v;

    .line 1167
    .line 1168
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/main/MainShellViewModel;->c(Lcom/zykj/mistake/main/a0;)V

    .line 1169
    .line 1170
    .line 1171
    return-void

    .line 1172
    :cond_3b
    instance-of v2, v1, Lcom/zykj/mistake/main/f0;

    .line 1173
    .line 1174
    if-eqz v2, :cond_3c

    .line 1175
    .line 1176
    check-cast v1, Lcom/zykj/mistake/main/f0;

    .line 1177
    .line 1178
    iget-object v2, v1, Lcom/zykj/mistake/main/f0;->a:Ljava/lang/String;

    .line 1179
    .line 1180
    iget-object v1, v1, Lcom/zykj/mistake/main/f0;->b:Ljava/lang/String;

    .line 1181
    .line 1182
    new-instance v3, Landroidx/navigation/d;

    .line 1183
    .line 1184
    const/16 v4, 0xb

    .line 1185
    .line 1186
    invoke-direct {v3, v4, v2, v1}, Landroidx/navigation/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1187
    .line 1188
    .line 1189
    invoke-virtual {v0, v3}, Lcom/zykj/mistake/main/MainShellViewModel;->e(Lr6/c;)V

    .line 1190
    .line 1191
    .line 1192
    return-void

    .line 1193
    :cond_3c
    sget-object v2, Lcom/zykj/mistake/main/v0;->a:Lcom/zykj/mistake/main/v0;

    .line 1194
    .line 1195
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1196
    .line 1197
    .line 1198
    move-result v2

    .line 1199
    if-eqz v2, :cond_3d

    .line 1200
    .line 1201
    new-instance v1, Lcom/zykj/mistake/feature/notebook/list/k1;

    .line 1202
    .line 1203
    const/16 v2, 0x8

    .line 1204
    .line 1205
    invoke-direct {v1, v2}, Lcom/zykj/mistake/feature/notebook/list/k1;-><init>(I)V

    .line 1206
    .line 1207
    .line 1208
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/main/MainShellViewModel;->e(Lr6/c;)V

    .line 1209
    .line 1210
    .line 1211
    return-void

    .line 1212
    :cond_3d
    instance-of v2, v1, Lcom/zykj/mistake/main/d0;

    .line 1213
    .line 1214
    if-eqz v2, :cond_3e

    .line 1215
    .line 1216
    new-instance v2, Lcom/zykj/mistake/main/q;

    .line 1217
    .line 1218
    check-cast v1, Lcom/zykj/mistake/main/d0;

    .line 1219
    .line 1220
    iget-object v3, v1, Lcom/zykj/mistake/main/d0;->a:Lcom/zykj/mistake/platform/picker/CollectionDatePickerTarget;

    .line 1221
    .line 1222
    iget-object v4, v1, Lcom/zykj/mistake/main/d0;->b:Ljava/lang/String;

    .line 1223
    .line 1224
    iget-object v1, v1, Lcom/zykj/mistake/main/d0;->c:Ljava/lang/String;

    .line 1225
    .line 1226
    invoke-direct {v2, v3, v4, v1}, Lcom/zykj/mistake/main/q;-><init>(Lcom/zykj/mistake/platform/picker/CollectionDatePickerTarget;Ljava/lang/String;Ljava/lang/String;)V

    .line 1227
    .line 1228
    .line 1229
    invoke-virtual {v0, v2}, Lcom/zykj/mistake/main/MainShellViewModel;->c(Lcom/zykj/mistake/main/a0;)V

    .line 1230
    .line 1231
    .line 1232
    return-void

    .line 1233
    :cond_3e
    instance-of v2, v1, Lcom/zykj/mistake/main/u0;

    .line 1234
    .line 1235
    if-eqz v2, :cond_3f

    .line 1236
    .line 1237
    new-instance v2, Lcom/zykj/mistake/main/r;

    .line 1238
    .line 1239
    check-cast v1, Lcom/zykj/mistake/main/u0;

    .line 1240
    .line 1241
    iget-object v1, v1, Lcom/zykj/mistake/main/u0;->a:Lcom/zykj/mistake/platform/picker/CollectionDatePickerTarget;

    .line 1242
    .line 1243
    invoke-direct {v2, v1}, Lcom/zykj/mistake/main/r;-><init>(Lcom/zykj/mistake/platform/picker/CollectionDatePickerTarget;)V

    .line 1244
    .line 1245
    .line 1246
    invoke-virtual {v0, v2}, Lcom/zykj/mistake/main/MainShellViewModel;->c(Lcom/zykj/mistake/main/a0;)V

    .line 1247
    .line 1248
    .line 1249
    return-void

    .line 1250
    :cond_3f
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    .line 1251
    .line 1252
    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 1253
    .line 1254
    .line 1255
    throw v1
.end method

.method public final c(Lcom/zykj/mistake/main/a0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/main/MainShellViewModel;->c:Lkotlinx/coroutines/flow/f0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lkotlinx/coroutines/flow/f0;->a(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/main/MainShellViewModel;->a:Lkotlinx/coroutines/flow/n0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/mistake/main/m;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/zykj/mistake/main/m;->a:Lcom/zykj/mistake/main/l;

    .line 10
    .line 11
    instance-of v1, v0, Lcom/zykj/mistake/main/c;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    check-cast v0, Lcom/zykj/mistake/main/c;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, v0, Lcom/zykj/mistake/main/c;->a:Lcom/zykj/mistake/main/p;

    .line 22
    .line 23
    new-instance v1, Lcom/zykj/mistake/main/z;

    .line 24
    .line 25
    iget-object v2, v0, Lcom/zykj/mistake/main/p;->d:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v0, v0, Lcom/zykj/mistake/main/p;->e:Ljava/lang/String;

    .line 28
    .line 29
    invoke-direct {v1, v2, v0}, Lcom/zykj/mistake/main/z;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v1}, Lcom/zykj/mistake/main/MainShellViewModel;->c(Lcom/zykj/mistake/main/a0;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void
.end method

.method public final e(Lr6/c;)V
    .locals 6

    .line 1
    :cond_0
    iget-object v0, p0, Lcom/zykj/mistake/main/MainShellViewModel;->a:Lkotlinx/coroutines/flow/n0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, Lcom/zykj/mistake/main/m;

    .line 9
    .line 10
    iget-object v3, v2, Lcom/zykj/mistake/main/m;->a:Lcom/zykj/mistake/main/l;

    .line 11
    .line 12
    instance-of v4, v3, Lcom/zykj/mistake/main/c;

    .line 13
    .line 14
    if-eqz v4, :cond_1

    .line 15
    .line 16
    check-cast v3, Lcom/zykj/mistake/main/c;

    .line 17
    .line 18
    iget-object v3, v3, Lcom/zykj/mistake/main/c;->a:Lcom/zykj/mistake/main/p;

    .line 19
    .line 20
    invoke-interface {p1, v3}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Lcom/zykj/mistake/main/p;

    .line 25
    .line 26
    const-string v4, "draft"

    .line 27
    .line 28
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    new-instance v4, Lcom/zykj/mistake/main/c;

    .line 32
    .line 33
    invoke-direct {v4, v3}, Lcom/zykj/mistake/main/c;-><init>(Lcom/zykj/mistake/main/p;)V

    .line 34
    .line 35
    .line 36
    const/4 v3, 0x2

    .line 37
    const/4 v5, 0x0

    .line 38
    invoke-static {v2, v4, v5, v3}, Lcom/zykj/mistake/main/m;->a(Lcom/zykj/mistake/main/m;Lcom/zykj/mistake/main/l;Lcom/zykj/mistake/main/RemoveDialogTarget;I)Lcom/zykj/mistake/main/m;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    :cond_1
    invoke-virtual {v0, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    return-void
.end method

.method public final f(Lr6/c;)V
    .locals 6

    .line 1
    :cond_0
    iget-object v0, p0, Lcom/zykj/mistake/main/MainShellViewModel;->a:Lkotlinx/coroutines/flow/n0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, Lcom/zykj/mistake/main/m;

    .line 9
    .line 10
    iget-object v3, v2, Lcom/zykj/mistake/main/m;->a:Lcom/zykj/mistake/main/l;

    .line 11
    .line 12
    instance-of v4, v3, Lcom/zykj/mistake/main/d;

    .line 13
    .line 14
    if-eqz v4, :cond_1

    .line 15
    .line 16
    check-cast v3, Lcom/zykj/mistake/main/d;

    .line 17
    .line 18
    iget-object v3, v3, Lcom/zykj/mistake/main/d;->a:Lcom/zykj/mistake/main/a1;

    .line 19
    .line 20
    invoke-interface {p1, v3}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Lcom/zykj/mistake/main/a1;

    .line 25
    .line 26
    const-string v4, "state"

    .line 27
    .line 28
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    new-instance v4, Lcom/zykj/mistake/main/d;

    .line 32
    .line 33
    invoke-direct {v4, v3}, Lcom/zykj/mistake/main/d;-><init>(Lcom/zykj/mistake/main/a1;)V

    .line 34
    .line 35
    .line 36
    const/4 v3, 0x2

    .line 37
    const/4 v5, 0x0

    .line 38
    invoke-static {v2, v4, v5, v3}, Lcom/zykj/mistake/main/m;->a(Lcom/zykj/mistake/main/m;Lcom/zykj/mistake/main/l;Lcom/zykj/mistake/main/RemoveDialogTarget;I)Lcom/zykj/mistake/main/m;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    :cond_1
    invoke-virtual {v0, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    return-void
.end method
