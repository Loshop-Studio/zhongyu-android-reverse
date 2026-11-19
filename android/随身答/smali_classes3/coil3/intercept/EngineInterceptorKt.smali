.class public abstract Lcoil3/intercept/EngineInterceptorKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lcoil3/intercept/EngineInterceptor$b;Ly/e;Ly/m;Lcoil3/b;Lcoil3/util/Logger;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    move-object/from16 v1, p5

    .line 4
    .line 5
    instance-of v2, v1, Lcoil3/intercept/EngineInterceptorKt$transform$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;

    .line 11
    .line 12
    iget v3, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->i:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->i:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;

    .line 25
    .line 26
    invoke-direct {v2, v1}, Lcoil3/intercept/EngineInterceptorKt$transform$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->h:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    iget v3, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->i:I

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    const/4 v5, 0x0

    .line 38
    const/4 v6, 0x1

    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    if-ne v3, v6, :cond_1

    .line 42
    .line 43
    iget v0, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->g:I

    .line 44
    .line 45
    iget v3, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->f:I

    .line 46
    .line 47
    iget-object v7, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->e:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v7, Ljava/util/List;

    .line 50
    .line 51
    iget-object v8, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->d:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v8, Lcoil3/b;

    .line 54
    .line 55
    iget-object v9, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->c:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v9, Ly/m;

    .line 58
    .line 59
    iget-object v10, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->b:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v10, Ly/e;

    .line 62
    .line 63
    iget-object v11, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->a:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v11, Lcoil3/intercept/EngineInterceptor$b;

    .line 66
    .line 67
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    check-cast v1, Landroid/graphics/Bitmap;

    .line 71
    .line 72
    invoke-interface {v2}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 73
    .line 74
    .line 75
    move-result-object v12

    .line 76
    invoke-static {v12}, Lkotlinx/coroutines/JobKt;->ensureActive(Lkotlin/coroutines/CoroutineContext;)V

    .line 77
    .line 78
    .line 79
    add-int/2addr v3, v6

    .line 80
    move-object/from16 v17, v9

    .line 81
    .line 82
    move v9, v0

    .line 83
    move-object v0, v10

    .line 84
    move-object v10, v11

    .line 85
    move-object v11, v7

    .line 86
    move v7, v3

    .line 87
    move-object/from16 v3, v17

    .line 88
    .line 89
    goto/16 :goto_1

    .line 90
    .line 91
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 92
    .line 93
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 94
    .line 95
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw v0

    .line 99
    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    invoke-static/range {p1 .. p1}, Ly/f;->e(Ly/e;)Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-eqz v1, :cond_3

    .line 111
    .line 112
    return-object p0

    .line 113
    :cond_3
    invoke-virtual/range {p0 .. p0}, Lcoil3/intercept/EngineInterceptor$b;->e()Lk/j;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    instance-of v3, v1, Lk/a;

    .line 118
    .line 119
    if-nez v3, :cond_5

    .line 120
    .line 121
    invoke-static/range {p1 .. p1}, Ly/f;->b(Ly/e;)Z

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    if-nez v3, :cond_5

    .line 126
    .line 127
    if-eqz v0, :cond_4

    .line 128
    .line 129
    sget-object v1, Lcoil3/util/Logger$Level;->c:Lcoil3/util/Logger$Level;

    .line 130
    .line 131
    invoke-interface {v0}, Lcoil3/util/Logger;->a()Lcoil3/util/Logger$Level;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-virtual {v2, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-gtz v2, :cond_4

    .line 140
    .line 141
    invoke-virtual/range {p0 .. p0}, Lcoil3/intercept/EngineInterceptor$b;->e()Lk/j;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-interface {v2}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    new-instance v3, Ljava/lang/StringBuilder;

    .line 158
    .line 159
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 160
    .line 161
    .line 162
    const-string v4, "allowConversionToBitmap=false, skipping transformations for type "

    .line 163
    .line 164
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    const/16 v2, 0x2e

    .line 171
    .line 172
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    const-string v3, "EngineInterceptor"

    .line 180
    .line 181
    invoke-interface {v0, v3, v1, v2, v5}, Lcoil3/util/Logger;->b(Ljava/lang/String;Lcoil3/util/Logger$Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 182
    .line 183
    .line 184
    :cond_4
    return-object p0

    .line 185
    :cond_5
    move-object/from16 v3, p2

    .line 186
    .line 187
    invoke-static {v1, v3, v7, v0}, Lq/b;->a(Lk/j;Ly/m;Ljava/util/List;Lcoil3/util/Logger;)Landroid/graphics/Bitmap;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    move-object/from16 v0, p1

    .line 192
    .line 193
    move-object/from16 v8, p3

    .line 194
    .line 195
    invoke-virtual {v8, v0, v1}, Lcoil3/b;->p(Ly/e;Landroid/graphics/Bitmap;)V

    .line 196
    .line 197
    .line 198
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 199
    .line 200
    .line 201
    move-result v9

    .line 202
    move-object/from16 v10, p0

    .line 203
    .line 204
    move-object v11, v7

    .line 205
    move v7, v4

    .line 206
    :goto_1
    if-lt v7, v9, :cond_6

    .line 207
    .line 208
    invoke-virtual {v8, v0, v1}, Lcoil3/b;->o(Ly/e;Landroid/graphics/Bitmap;)V

    .line 209
    .line 210
    .line 211
    invoke-static {v1, v4, v6, v5}, Lk/n;->d(Landroid/graphics/Bitmap;ZILjava/lang/Object;)Lk/a;

    .line 212
    .line 213
    .line 214
    move-result-object v11

    .line 215
    const/16 v15, 0xe

    .line 216
    .line 217
    const/16 v16, 0x0

    .line 218
    .line 219
    const/4 v12, 0x0

    .line 220
    const/4 v13, 0x0

    .line 221
    const/4 v14, 0x0

    .line 222
    invoke-static/range {v10 .. v16}, Lcoil3/intercept/EngineInterceptor$b;->b(Lcoil3/intercept/EngineInterceptor$b;Lk/j;ZLcoil3/decode/DataSource;Ljava/lang/String;ILjava/lang/Object;)Lcoil3/intercept/EngineInterceptor$b;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    return-object v0

    .line 227
    :cond_6
    invoke-interface {v11, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    invoke-static {v1}, Lq/a;->a(Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v3}, Ly/m;->k()Lz/e;

    .line 235
    .line 236
    .line 237
    iput-object v10, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->a:Ljava/lang/Object;

    .line 238
    .line 239
    iput-object v0, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->b:Ljava/lang/Object;

    .line 240
    .line 241
    iput-object v3, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->c:Ljava/lang/Object;

    .line 242
    .line 243
    iput-object v8, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->d:Ljava/lang/Object;

    .line 244
    .line 245
    iput-object v11, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->e:Ljava/lang/Object;

    .line 246
    .line 247
    iput v7, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->f:I

    .line 248
    .line 249
    iput v9, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->g:I

    .line 250
    .line 251
    iput v6, v2, Lcoil3/intercept/EngineInterceptorKt$transform$1;->i:I

    .line 252
    .line 253
    throw v5
.end method
