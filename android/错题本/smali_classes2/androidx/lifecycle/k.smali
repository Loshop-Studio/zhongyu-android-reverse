.class public final synthetic Landroidx/lifecycle/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/lifecycle/k;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Landroidx/lifecycle/k;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lcom/zykj/view/board/play/SketchPlayFragment;->g()Ld6/s;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :pswitch_0
    invoke-static {}, Lcom/zykj/view/board/play/PlayerConfigSetting;->a()Ld6/s;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0

    .line 17
    :pswitch_1
    invoke-static {}, Lcom/zykj/view/board/play/PlayActionListener;->b()Ld6/s;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0

    .line 22
    :pswitch_2
    invoke-static {}, Lcom/zykj/view/board/play/PlayActionListener;->d()Ld6/s;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0

    .line 27
    :pswitch_3
    invoke-static {}, Lcom/zykj/view/board/play/PlayActionListener;->c()Ld6/s;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0

    .line 32
    :pswitch_4
    invoke-static {}, Lcom/zykj/view/board/play/PlayActionListener;->a()Ld6/s;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0

    .line 37
    :pswitch_5
    invoke-static {}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e()Ld6/s;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    return-object v0

    .line 42
    :pswitch_6
    invoke-static {}, Lcom/zykj/view/board/board/DialogKt;->c()Ld6/s;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    return-object v0

    .line 47
    :pswitch_7
    invoke-static {}, Lcom/zykj/view/board/board/BoardFragment;->f()Lcom/zykj/view/board/board/BoardViewModel;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    return-object v0

    .line 52
    :pswitch_8
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 53
    .line 54
    .line 55
    move-result-wide v0

    .line 56
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    return-object v0

    .line 61
    :pswitch_9
    const-string v0, "com.zykj.mistake.feature.collection.filter.MistakeCollectionFilterResultContract.SourceType"

    .line 62
    .line 63
    invoke-static {}, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;->values()[Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-static {v0, v1}, Lm7/y0;->e(Ljava/lang/String;[Ljava/lang/Enum;)Lm7/y;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    return-object v0

    .line 72
    :pswitch_a
    new-instance v0, Lm7/d;

    .line 73
    .line 74
    sget-object v2, Lm7/m1;->a:Lm7/m1;

    .line 75
    .line 76
    invoke-direct {v0, v2, v1}, Lm7/d;-><init>(Li7/b;I)V

    .line 77
    .line 78
    .line 79
    return-object v0

    .line 80
    :pswitch_b
    new-instance v0, Lm7/d;

    .line 81
    .line 82
    sget-object v2, Lm7/m1;->a:Lm7/m1;

    .line 83
    .line 84
    invoke-direct {v0, v2, v1}, Lm7/d;-><init>(Li7/b;I)V

    .line 85
    .line 86
    .line 87
    return-object v0

    .line 88
    :pswitch_c
    const-string v0, "com.zykj.mistake.feature.ask.MistakeAskMaterialContract.SourceType"

    .line 89
    .line 90
    invoke-static {}, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;->values()[Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-static {v0, v1}, Lm7/y0;->e(Ljava/lang/String;[Ljava/lang/Enum;)Lm7/y;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    return-object v0

    .line 99
    :pswitch_d
    new-instance v0, Lm7/d;

    .line 100
    .line 101
    sget-object v2, Lcom/zykj/mistake/feature/ask/v;->a:Lcom/zykj/mistake/feature/ask/v;

    .line 102
    .line 103
    invoke-direct {v0, v2, v1}, Lm7/d;-><init>(Li7/b;I)V

    .line 104
    .line 105
    .line 106
    return-object v0

    .line 107
    :pswitch_e
    const-string v0, "com.zykj.mistake.feature.ask.MistakeAskMaterialContract.MaterialType"

    .line 108
    .line 109
    invoke-static {}, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;->values()[Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-static {v0, v1}, Lm7/y0;->e(Ljava/lang/String;[Ljava/lang/Enum;)Lm7/y;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    return-object v0

    .line 118
    :pswitch_f
    new-instance v0, Lm7/d;

    .line 119
    .line 120
    sget-object v2, Lcom/zykj/mistake/feature/ask/k;->a:Lcom/zykj/mistake/feature/ask/k;

    .line 121
    .line 122
    invoke-direct {v0, v2, v1}, Lm7/d;-><init>(Li7/b;I)V

    .line 123
    .line 124
    .line 125
    return-object v0

    .line 126
    :pswitch_10
    sget v0, Lcom/zykj/mistake/activity/SketchActivity;->v:I

    .line 127
    .line 128
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 129
    .line 130
    return-object v0

    .line 131
    :pswitch_11
    :try_start_0
    new-array v0, v1, [Lcoil3/util/b;

    .line 132
    .line 133
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 138
    .line 139
    .line 140
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 141
    invoke-static {v0}, Lz6/k;->t(Ljava/util/Iterator;)Lz6/h;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-static {v0}, Lz6/k;->z(Lz6/h;)Ljava/util/List;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-static {v0}, Lt6/a;->w(Ljava/util/List;)Ljava/util/List;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    return-object v0

    .line 154
    :catchall_0
    move-exception v0

    .line 155
    new-instance v1, Ljava/util/ServiceConfigurationError;

    .line 156
    .line 157
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    invoke-direct {v1, v2, v0}, Ljava/util/ServiceConfigurationError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 162
    .line 163
    .line 164
    throw v1

    .line 165
    :pswitch_12
    :try_start_1
    new-instance v0, Lcoil3/network/okhttp/internal/c;

    .line 166
    .line 167
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 168
    .line 169
    .line 170
    filled-new-array {v0}, [Lcoil3/network/okhttp/internal/c;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 179
    .line 180
    .line 181
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 182
    invoke-static {v0}, Lz6/k;->t(Ljava/util/Iterator;)Lz6/h;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-static {v0}, Lz6/k;->z(Lz6/h;)Ljava/util/List;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-static {v0}, Lt6/a;->w(Ljava/util/List;)Ljava/util/List;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    return-object v0

    .line 195
    :catchall_1
    move-exception v0

    .line 196
    new-instance v1, Ljava/util/ServiceConfigurationError;

    .line 197
    .line 198
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    invoke-direct {v1, v2, v0}, Ljava/util/ServiceConfigurationError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 203
    .line 204
    .line 205
    throw v1

    .line 206
    :pswitch_13
    sget-object v0, Lcoil3/network/c;->a:Lcoil3/network/internal/a;

    .line 207
    .line 208
    return-object v0

    .line 209
    :pswitch_14
    sget-object v5, Lokio/FileSystem;->SYSTEM:Lokio/FileSystem;

    .line 210
    .line 211
    sget-object v6, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 212
    .line 213
    sget-object v0, Lokio/FileSystem;->SYSTEM_TEMPORARY_DIRECTORY:Lokio/Path;

    .line 214
    .line 215
    const-string v1, "coil3_disk_cache"

    .line 216
    .line 217
    invoke-virtual {v0, v1}, Lokio/Path;->resolve(Ljava/lang/String;)Lokio/Path;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    if-eqz v4, :cond_0

    .line 222
    .line 223
    const-wide/32 v9, 0xa00000

    .line 224
    .line 225
    .line 226
    :try_start_2
    invoke-virtual {v4}, Lokio/Path;->toFile()Ljava/io/File;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    invoke-virtual {v0}, Ljava/io/File;->mkdir()Z

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    new-instance v1, Landroid/os/StatFs;

    .line 238
    .line 239
    invoke-direct {v1, v0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockCountLong()J

    .line 243
    .line 244
    .line 245
    move-result-wide v2

    .line 246
    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockSizeLong()J

    .line 247
    .line 248
    .line 249
    move-result-wide v0

    .line 250
    mul-long/2addr v0, v2

    .line 251
    long-to-double v0, v0

    .line 252
    const-wide v2, 0x3f947ae147ae147bL    # 0.02

    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    mul-double/2addr v2, v0

    .line 258
    double-to-long v7, v2

    .line 259
    const-wide/32 v11, 0xfa00000

    .line 260
    .line 261
    .line 262
    invoke-static/range {v7 .. v12}, Lkotlin/collections/u;->n(JJJ)J

    .line 263
    .line 264
    .line 265
    move-result-wide v9
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 266
    :catch_0
    move-wide v2, v9

    .line 267
    new-instance v1, Lcoil3/disk/j;

    .line 268
    .line 269
    invoke-direct/range {v1 .. v6}, Lcoil3/disk/j;-><init>(JLokio/Path;Lokio/FileSystem;Lkotlin/coroutines/EmptyCoroutineContext;)V

    .line 270
    .line 271
    .line 272
    return-object v1

    .line 273
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 274
    .line 275
    const-string v1, "directory == null"

    .line 276
    .line 277
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    throw v0

    .line 281
    :pswitch_15
    sget-object v0, Lcoil3/compose/j;->a:Lcoil3/compose/j;

    .line 282
    .line 283
    return-object v0

    .line 284
    :pswitch_16
    sget-object v0, Lcoil3/compose/m;->a:Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 285
    .line 286
    sget-object v0, Lcoil3/compose/c;->a:Lcoil3/compose/c;

    .line 287
    .line 288
    return-object v0

    .line 289
    :pswitch_17
    invoke-static {}, Landroidx/savedstate/internal/SavedStateRegistryImpl;->b()Ld6/s;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    return-object v0

    .line 294
    :pswitch_18
    invoke-static {}, Landroidx/navigation/internal/NavBackStackEntryImpl;->b()Landroidx/lifecycle/ViewModelProvider$Factory;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    return-object v0

    .line 299
    :pswitch_19
    invoke-static {}, Landroidx/navigation/internal/NavBackStackEntryImpl;->c()Landroidx/lifecycle/SavedStateViewModelFactory;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    return-object v0

    .line 304
    :pswitch_1a
    invoke-static {}, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->a()Landroidx/lifecycle/ViewModelStoreOwner;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    return-object v0

    .line 309
    :pswitch_1b
    invoke-static {}, Landroidx/lifecycle/compose/LocalLifecycleOwnerKt;->a()Landroidx/lifecycle/LifecycleOwner;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    return-object v0

    .line 314
    :pswitch_1c
    invoke-static {}, Landroidx/lifecycle/ViewModelLazy;->a()Landroidx/lifecycle/viewmodel/CreationExtras$Empty;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    return-object v0

    .line 319
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
