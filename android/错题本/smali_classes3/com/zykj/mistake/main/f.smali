.class public final synthetic Lcom/zykj/mistake/main/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/mistake/main/MainShellViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/main/MainShellViewModel;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/mistake/main/f;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/main/f;->b:Lcom/zykj/mistake/main/MainShellViewModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/zykj/mistake/main/f;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v2, p1

    .line 9
    .line 10
    check-cast v2, Landroidx/navigation/NavGraphBuilder;

    .line 11
    .line 12
    const-string v1, "$this$NavHost"

    .line 13
    .line 14
    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    new-instance v6, Ln7/l;

    .line 18
    .line 19
    const/16 v1, 0x12

    .line 20
    .line 21
    invoke-direct {v6, v1}, Ln7/l;-><init>(I)V

    .line 22
    .line 23
    .line 24
    new-instance v7, Ln7/l;

    .line 25
    .line 26
    const/4 v1, 0x6

    .line 27
    invoke-direct {v7, v1}, Ln7/l;-><init>(I)V

    .line 28
    .line 29
    .line 30
    new-instance v8, Ln7/l;

    .line 31
    .line 32
    const/16 v1, 0xb

    .line 33
    .line 34
    invoke-direct {v8, v1}, Ln7/l;-><init>(I)V

    .line 35
    .line 36
    .line 37
    new-instance v9, Ln7/l;

    .line 38
    .line 39
    const/16 v1, 0xc

    .line 40
    .line 41
    invoke-direct {v9, v1}, Ln7/l;-><init>(I)V

    .line 42
    .line 43
    .line 44
    new-instance v1, Lt4/f;

    .line 45
    .line 46
    const/4 v3, 0x1

    .line 47
    iget-object v14, v0, Lcom/zykj/mistake/main/f;->b:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 48
    .line 49
    invoke-direct {v1, v14, v3}, Lt4/f;-><init>(Lcom/zykj/mistake/main/MainShellViewModel;I)V

    .line 50
    .line 51
    .line 52
    const v3, -0x55ab5705

    .line 53
    .line 54
    .line 55
    const/4 v15, 0x1

    .line 56
    invoke-static {v3, v15, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 57
    .line 58
    .line 59
    move-result-object v11

    .line 60
    const/16 v12, 0x86

    .line 61
    .line 62
    const/4 v13, 0x0

    .line 63
    const-string v3, "home"

    .line 64
    .line 65
    const/4 v4, 0x0

    .line 66
    const/4 v5, 0x0

    .line 67
    const/4 v10, 0x0

    .line 68
    invoke-static/range {v2 .. v13}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/g;ILjava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    new-instance v6, Ln7/l;

    .line 72
    .line 73
    const/16 v1, 0xd

    .line 74
    .line 75
    invoke-direct {v6, v1}, Ln7/l;-><init>(I)V

    .line 76
    .line 77
    .line 78
    new-instance v7, Ln7/l;

    .line 79
    .line 80
    const/16 v1, 0xe

    .line 81
    .line 82
    invoke-direct {v7, v1}, Ln7/l;-><init>(I)V

    .line 83
    .line 84
    .line 85
    new-instance v8, Ln7/l;

    .line 86
    .line 87
    const/16 v1, 0xf

    .line 88
    .line 89
    invoke-direct {v8, v1}, Ln7/l;-><init>(I)V

    .line 90
    .line 91
    .line 92
    new-instance v9, Ln7/l;

    .line 93
    .line 94
    const/16 v1, 0x10

    .line 95
    .line 96
    invoke-direct {v9, v1}, Ln7/l;-><init>(I)V

    .line 97
    .line 98
    .line 99
    new-instance v1, Lt4/f;

    .line 100
    .line 101
    const/4 v3, 0x2

    .line 102
    invoke-direct {v1, v14, v3}, Lt4/f;-><init>(Lcom/zykj/mistake/main/MainShellViewModel;I)V

    .line 103
    .line 104
    .line 105
    const v3, 0x4a8fe405    # 4715010.5f

    .line 106
    .line 107
    .line 108
    invoke-static {v3, v15, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 109
    .line 110
    .line 111
    move-result-object v11

    .line 112
    invoke-static {}, Lkotlin/collections/e0;->A()Ljava/util/Map;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    sget-object v5, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 117
    .line 118
    const-class v1, Lu4/c;

    .line 119
    .line 120
    invoke-static {v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    invoke-static/range {v2 .. v11}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable(Landroidx/navigation/NavGraphBuilder;Ly6/c;Ljava/util/Map;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/g;)V

    .line 125
    .line 126
    .line 127
    sget-object v4, Lt4/i;->c:Ljava/util/Map;

    .line 128
    .line 129
    new-instance v6, Ln7/l;

    .line 130
    .line 131
    const/16 v1, 0x13

    .line 132
    .line 133
    invoke-direct {v6, v1}, Ln7/l;-><init>(I)V

    .line 134
    .line 135
    .line 136
    new-instance v7, Ln7/l;

    .line 137
    .line 138
    const/16 v1, 0x14

    .line 139
    .line 140
    invoke-direct {v7, v1}, Ln7/l;-><init>(I)V

    .line 141
    .line 142
    .line 143
    new-instance v8, Ln7/l;

    .line 144
    .line 145
    const/16 v1, 0x15

    .line 146
    .line 147
    invoke-direct {v8, v1}, Ln7/l;-><init>(I)V

    .line 148
    .line 149
    .line 150
    new-instance v9, Ln7/l;

    .line 151
    .line 152
    const/16 v1, 0x16

    .line 153
    .line 154
    invoke-direct {v9, v1}, Ln7/l;-><init>(I)V

    .line 155
    .line 156
    .line 157
    new-instance v1, Lt4/f;

    .line 158
    .line 159
    const/4 v3, 0x3

    .line 160
    invoke-direct {v1, v14, v3}, Lt4/f;-><init>(Lcom/zykj/mistake/main/MainShellViewModel;I)V

    .line 161
    .line 162
    .line 163
    const v3, 0xff89a24

    .line 164
    .line 165
    .line 166
    invoke-static {v3, v15, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 167
    .line 168
    .line 169
    move-result-object v11

    .line 170
    const-class v1, Lcom/zykj/mistake/feature/collection/filter/l;

    .line 171
    .line 172
    invoke-static {v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    invoke-static/range {v2 .. v11}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable(Landroidx/navigation/NavGraphBuilder;Ly6/c;Ljava/util/Map;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/g;)V

    .line 177
    .line 178
    .line 179
    sget-object v4, Lt4/i;->b:Ljava/util/Map;

    .line 180
    .line 181
    new-instance v6, Ln7/l;

    .line 182
    .line 183
    const/16 v1, 0x17

    .line 184
    .line 185
    invoke-direct {v6, v1}, Ln7/l;-><init>(I)V

    .line 186
    .line 187
    .line 188
    new-instance v7, Ln7/l;

    .line 189
    .line 190
    const/16 v1, 0x18

    .line 191
    .line 192
    invoke-direct {v7, v1}, Ln7/l;-><init>(I)V

    .line 193
    .line 194
    .line 195
    new-instance v8, Ln7/l;

    .line 196
    .line 197
    const/4 v1, 0x4

    .line 198
    invoke-direct {v8, v1}, Ln7/l;-><init>(I)V

    .line 199
    .line 200
    .line 201
    new-instance v9, Ln7/l;

    .line 202
    .line 203
    const/4 v1, 0x5

    .line 204
    invoke-direct {v9, v1}, Ln7/l;-><init>(I)V

    .line 205
    .line 206
    .line 207
    new-instance v1, Lt4/f;

    .line 208
    .line 209
    const/4 v3, 0x0

    .line 210
    invoke-direct {v1, v14, v3}, Lt4/f;-><init>(Lcom/zykj/mistake/main/MainShellViewModel;I)V

    .line 211
    .line 212
    .line 213
    const v3, -0x2a9eafbd

    .line 214
    .line 215
    .line 216
    invoke-static {v3, v15, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 217
    .line 218
    .line 219
    move-result-object v11

    .line 220
    const-class v1, Lu4/g;

    .line 221
    .line 222
    invoke-static {v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    invoke-static/range {v2 .. v11}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable(Landroidx/navigation/NavGraphBuilder;Ly6/c;Ljava/util/Map;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/g;)V

    .line 227
    .line 228
    .line 229
    sget-object v4, Lt4/i;->d:Ljava/util/Map;

    .line 230
    .line 231
    new-instance v6, Ln7/l;

    .line 232
    .line 233
    const/4 v1, 0x7

    .line 234
    invoke-direct {v6, v1}, Ln7/l;-><init>(I)V

    .line 235
    .line 236
    .line 237
    new-instance v7, Ln7/l;

    .line 238
    .line 239
    const/16 v1, 0x8

    .line 240
    .line 241
    invoke-direct {v7, v1}, Ln7/l;-><init>(I)V

    .line 242
    .line 243
    .line 244
    new-instance v8, Ln7/l;

    .line 245
    .line 246
    const/16 v1, 0x9

    .line 247
    .line 248
    invoke-direct {v8, v1}, Ln7/l;-><init>(I)V

    .line 249
    .line 250
    .line 251
    new-instance v9, Ln7/l;

    .line 252
    .line 253
    const/16 v1, 0xa

    .line 254
    .line 255
    invoke-direct {v9, v1}, Ln7/l;-><init>(I)V

    .line 256
    .line 257
    .line 258
    sget-object v11, Lt4/b;->a:Landroidx/compose/runtime/internal/ComposableLambda;

    .line 259
    .line 260
    const-class v1, Lcom/zykj/mistake/feature/ask/f;

    .line 261
    .line 262
    invoke-static {v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    invoke-static/range {v2 .. v11}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable(Landroidx/navigation/NavGraphBuilder;Ly6/c;Ljava/util/Map;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/g;)V

    .line 267
    .line 268
    .line 269
    :goto_0
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 270
    .line 271
    return-object v1

    .line 272
    :pswitch_0
    move-object/from16 v1, p1

    .line 273
    .line 274
    check-cast v1, Lcom/zykj/mistake/main/p;

    .line 275
    .line 276
    const-string v2, "draft"

    .line 277
    .line 278
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    new-instance v2, Lcom/zykj/mistake/main/g0;

    .line 282
    .line 283
    invoke-direct {v2, v1}, Lcom/zykj/mistake/main/g0;-><init>(Lcom/zykj/mistake/main/p;)V

    .line 284
    .line 285
    .line 286
    iget-object v1, v0, Lcom/zykj/mistake/main/f;->b:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 287
    .line 288
    invoke-virtual {v1, v2}, Lcom/zykj/mistake/main/MainShellViewModel;->b(Lcom/zykj/mistake/main/l;)V

    .line 289
    .line 290
    .line 291
    goto :goto_0

    .line 292
    :pswitch_1
    move-object/from16 v1, p1

    .line 293
    .line 294
    check-cast v1, Ljava/lang/String;

    .line 295
    .line 296
    const-string v2, "name"

    .line 297
    .line 298
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    new-instance v2, Lcom/zykj/mistake/main/b0;

    .line 302
    .line 303
    invoke-direct {v2, v1}, Lcom/zykj/mistake/main/b0;-><init>(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    iget-object v1, v0, Lcom/zykj/mistake/main/f;->b:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 307
    .line 308
    invoke-virtual {v1, v2}, Lcom/zykj/mistake/main/MainShellViewModel;->b(Lcom/zykj/mistake/main/l;)V

    .line 309
    .line 310
    .line 311
    goto :goto_0

    .line 312
    :pswitch_2
    move-object/from16 v1, p1

    .line 313
    .line 314
    check-cast v1, Ljava/lang/Integer;

    .line 315
    .line 316
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 317
    .line 318
    .line 319
    move-result v1

    .line 320
    new-instance v2, Lcom/zykj/mistake/main/x0;

    .line 321
    .line 322
    invoke-direct {v2, v1}, Lcom/zykj/mistake/main/x0;-><init>(I)V

    .line 323
    .line 324
    .line 325
    iget-object v1, v0, Lcom/zykj/mistake/main/f;->b:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 326
    .line 327
    invoke-virtual {v1, v2}, Lcom/zykj/mistake/main/MainShellViewModel;->b(Lcom/zykj/mistake/main/l;)V

    .line 328
    .line 329
    .line 330
    goto :goto_0

    .line 331
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
