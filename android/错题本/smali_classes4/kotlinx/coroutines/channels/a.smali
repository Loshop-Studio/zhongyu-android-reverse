.class public final Lkotlinx/coroutines/channels/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/u1;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Lkotlinx/coroutines/g;

.field public final synthetic c:Lkotlinx/coroutines/channels/b;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/channels/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkotlinx/coroutines/channels/a;->c:Lkotlinx/coroutines/channels/b;

    .line 5
    .line 6
    sget-object p1, Lkotlinx/coroutines/channels/c;->p:Le7/r;

    .line 7
    .line 8
    iput-object p1, p0, Lkotlinx/coroutines/channels/a;->a:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Le7/p;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/channels/a;->b:Lkotlinx/coroutines/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lkotlinx/coroutines/g;->a(Le7/p;I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/channels/a;->a:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v1, Lkotlinx/coroutines/channels/c;->p:Le7/r;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    sget-object v1, Lkotlinx/coroutines/channels/c;->l:Le7/r;

    .line 9
    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    :goto_0
    move-object v8, p0

    .line 13
    goto/16 :goto_8

    .line 14
    .line 15
    :cond_0
    sget-object v0, Lkotlinx/coroutines/channels/b;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 16
    .line 17
    iget-object v3, p0, Lkotlinx/coroutines/channels/a;->c:Lkotlinx/coroutines/channels/b;

    .line 18
    .line 19
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lkotlinx/coroutines/channels/i;

    .line 24
    .line 25
    :goto_1
    invoke-virtual {v3}, Lkotlinx/coroutines/channels/b;->v()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    sget-object p1, Lkotlinx/coroutines/channels/c;->l:Le7/r;

    .line 32
    .line 33
    iput-object p1, p0, Lkotlinx/coroutines/channels/a;->a:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-virtual {v3}, Lkotlinx/coroutines/channels/b;->n()Ljava/lang/Throwable;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-nez p1, :cond_1

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    sget v0, Le7/q;->a:I

    .line 44
    .line 45
    throw p1

    .line 46
    :cond_2
    sget-object v1, Lkotlinx/coroutines/channels/b;->c:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 47
    .line 48
    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 49
    .line 50
    .line 51
    move-result-wide v6

    .line 52
    sget v1, Lkotlinx/coroutines/channels/c;->b:I

    .line 53
    .line 54
    int-to-long v4, v1

    .line 55
    div-long v8, v6, v4

    .line 56
    .line 57
    rem-long v4, v6, v4

    .line 58
    .line 59
    long-to-int v5, v4

    .line 60
    iget-wide v10, v0, Le7/p;->c:J

    .line 61
    .line 62
    cmp-long v1, v10, v8

    .line 63
    .line 64
    if-eqz v1, :cond_4

    .line 65
    .line 66
    invoke-virtual {v3, v8, v9, v0}, Lkotlinx/coroutines/channels/b;->m(JLkotlinx/coroutines/channels/i;)Lkotlinx/coroutines/channels/i;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    if-nez v1, :cond_3

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_3
    move-object v4, v1

    .line 74
    goto :goto_2

    .line 75
    :cond_4
    move-object v4, v0

    .line 76
    :goto_2
    const/4 v8, 0x0

    .line 77
    invoke-virtual/range {v3 .. v8}, Lkotlinx/coroutines/channels/b;->G(Lkotlinx/coroutines/channels/i;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    sget-object v1, Lkotlinx/coroutines/channels/c;->m:Le7/r;

    .line 82
    .line 83
    if-eq v0, v1, :cond_13

    .line 84
    .line 85
    sget-object v9, Lkotlinx/coroutines/channels/c;->o:Le7/r;

    .line 86
    .line 87
    if-ne v0, v9, :cond_6

    .line 88
    .line 89
    invoke-virtual {v3}, Lkotlinx/coroutines/channels/b;->s()J

    .line 90
    .line 91
    .line 92
    move-result-wide v0

    .line 93
    cmp-long v0, v6, v0

    .line 94
    .line 95
    if-gez v0, :cond_5

    .line 96
    .line 97
    invoke-virtual {v4}, Le7/b;->a()V

    .line 98
    .line 99
    .line 100
    :cond_5
    move-object v0, v4

    .line 101
    goto :goto_1

    .line 102
    :cond_6
    sget-object v8, Lkotlinx/coroutines/channels/c;->n:Le7/r;

    .line 103
    .line 104
    if-ne v0, v8, :cond_12

    .line 105
    .line 106
    invoke-static {p1}, Lv7/l;->n(Lh6/c;)Lh6/c;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-static {p1}, Lkotlinx/coroutines/x;->o(Lh6/c;)Lkotlinx/coroutines/g;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    :try_start_0
    iput-object p1, p0, Lkotlinx/coroutines/channels/a;->b:Lkotlinx/coroutines/g;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 115
    .line 116
    move-object v8, p0

    .line 117
    :try_start_1
    invoke-virtual/range {v3 .. v8}, Lkotlinx/coroutines/channels/b;->G(Lkotlinx/coroutines/channels/i;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    if-ne v0, v1, :cond_7

    .line 122
    .line 123
    invoke-virtual {p0, v4, v5}, Lkotlinx/coroutines/channels/a;->a(Le7/p;I)V

    .line 124
    .line 125
    .line 126
    goto/16 :goto_6

    .line 127
    .line 128
    :catchall_0
    move-exception v0

    .line 129
    goto/16 :goto_7

    .line 130
    .line 131
    :cond_7
    const/4 v1, 0x0

    .line 132
    if-ne v0, v9, :cond_11

    .line 133
    .line 134
    invoke-virtual {v3}, Lkotlinx/coroutines/channels/b;->s()J

    .line 135
    .line 136
    .line 137
    move-result-wide v9

    .line 138
    cmp-long v0, v6, v9

    .line 139
    .line 140
    if-gez v0, :cond_8

    .line 141
    .line 142
    invoke-virtual {v4}, Le7/b;->a()V

    .line 143
    .line 144
    .line 145
    :cond_8
    sget-object v0, Lkotlinx/coroutines/channels/b;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 146
    .line 147
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    check-cast v0, Lkotlinx/coroutines/channels/i;

    .line 152
    .line 153
    :goto_3
    invoke-virtual {v3}, Lkotlinx/coroutines/channels/b;->v()Z

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    if-eqz v2, :cond_a

    .line 158
    .line 159
    iget-object v0, v8, Lkotlinx/coroutines/channels/a;->b:Lkotlinx/coroutines/g;

    .line 160
    .line 161
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    iput-object v1, v8, Lkotlinx/coroutines/channels/a;->b:Lkotlinx/coroutines/g;

    .line 165
    .line 166
    sget-object v1, Lkotlinx/coroutines/channels/c;->l:Le7/r;

    .line 167
    .line 168
    iput-object v1, v8, Lkotlinx/coroutines/channels/a;->a:Ljava/lang/Object;

    .line 169
    .line 170
    invoke-virtual {v3}, Lkotlinx/coroutines/channels/b;->n()Ljava/lang/Throwable;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    if-nez v1, :cond_9

    .line 175
    .line 176
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 177
    .line 178
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    invoke-virtual {v0, v1}, Lkotlinx/coroutines/g;->resumeWith(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    goto/16 :goto_6

    .line 186
    .line 187
    :cond_9
    invoke-static {v1}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-virtual {v0, v1}, Lkotlinx/coroutines/g;->resumeWith(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    goto :goto_6

    .line 199
    :cond_a
    sget-object v2, Lkotlinx/coroutines/channels/b;->c:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 200
    .line 201
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 202
    .line 203
    .line 204
    move-result-wide v6

    .line 205
    sget v2, Lkotlinx/coroutines/channels/c;->b:I

    .line 206
    .line 207
    int-to-long v4, v2

    .line 208
    div-long v9, v6, v4

    .line 209
    .line 210
    rem-long v4, v6, v4

    .line 211
    .line 212
    long-to-int v5, v4

    .line 213
    iget-wide v11, v0, Le7/p;->c:J

    .line 214
    .line 215
    cmp-long v2, v11, v9

    .line 216
    .line 217
    if-eqz v2, :cond_c

    .line 218
    .line 219
    invoke-virtual {v3, v9, v10, v0}, Lkotlinx/coroutines/channels/b;->m(JLkotlinx/coroutines/channels/i;)Lkotlinx/coroutines/channels/i;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    if-nez v2, :cond_b

    .line 224
    .line 225
    goto :goto_3

    .line 226
    :cond_b
    move-object v4, v2

    .line 227
    goto :goto_4

    .line 228
    :cond_c
    move-object v4, v0

    .line 229
    :goto_4
    invoke-virtual/range {v3 .. v8}, Lkotlinx/coroutines/channels/b;->G(Lkotlinx/coroutines/channels/i;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    move-object v2, v4

    .line 234
    sget-object v4, Lkotlinx/coroutines/channels/c;->m:Le7/r;

    .line 235
    .line 236
    if-ne v0, v4, :cond_d

    .line 237
    .line 238
    invoke-virtual {p0, v2, v5}, Lkotlinx/coroutines/channels/a;->a(Le7/p;I)V

    .line 239
    .line 240
    .line 241
    goto :goto_6

    .line 242
    :cond_d
    sget-object v4, Lkotlinx/coroutines/channels/c;->o:Le7/r;

    .line 243
    .line 244
    if-ne v0, v4, :cond_f

    .line 245
    .line 246
    invoke-virtual {v3}, Lkotlinx/coroutines/channels/b;->s()J

    .line 247
    .line 248
    .line 249
    move-result-wide v4

    .line 250
    cmp-long v0, v6, v4

    .line 251
    .line 252
    if-gez v0, :cond_e

    .line 253
    .line 254
    invoke-virtual {v2}, Le7/b;->a()V

    .line 255
    .line 256
    .line 257
    :cond_e
    move-object v0, v2

    .line 258
    goto :goto_3

    .line 259
    :cond_f
    sget-object v3, Lkotlinx/coroutines/channels/c;->n:Le7/r;

    .line 260
    .line 261
    if-eq v0, v3, :cond_10

    .line 262
    .line 263
    invoke-virtual {v2}, Le7/b;->a()V

    .line 264
    .line 265
    .line 266
    iput-object v0, v8, Lkotlinx/coroutines/channels/a;->a:Ljava/lang/Object;

    .line 267
    .line 268
    iput-object v1, v8, Lkotlinx/coroutines/channels/a;->b:Lkotlinx/coroutines/g;

    .line 269
    .line 270
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 271
    .line 272
    :goto_5
    invoke-virtual {p1, v0, v1}, Lkotlinx/coroutines/g;->b(Ljava/lang/Object;Lr6/f;)V

    .line 273
    .line 274
    .line 275
    goto :goto_6

    .line 276
    :cond_10
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 277
    .line 278
    const-string v1, "unexpected"

    .line 279
    .line 280
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    throw v0

    .line 284
    :cond_11
    invoke-virtual {v4}, Le7/b;->a()V

    .line 285
    .line 286
    .line 287
    iput-object v0, v8, Lkotlinx/coroutines/channels/a;->a:Ljava/lang/Object;

    .line 288
    .line 289
    iput-object v1, v8, Lkotlinx/coroutines/channels/a;->b:Lkotlinx/coroutines/g;

    .line 290
    .line 291
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 292
    .line 293
    goto :goto_5

    .line 294
    :goto_6
    invoke-virtual {p1}, Lkotlinx/coroutines/g;->t()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 299
    .line 300
    return-object p1

    .line 301
    :catchall_1
    move-exception v0

    .line 302
    move-object v8, p0

    .line 303
    :goto_7
    invoke-virtual {p1}, Lkotlinx/coroutines/g;->A()V

    .line 304
    .line 305
    .line 306
    throw v0

    .line 307
    :cond_12
    move-object v8, p0

    .line 308
    invoke-virtual {v4}, Le7/b;->a()V

    .line 309
    .line 310
    .line 311
    iput-object v0, v8, Lkotlinx/coroutines/channels/a;->a:Ljava/lang/Object;

    .line 312
    .line 313
    :goto_8
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 314
    .line 315
    .line 316
    move-result-object p1

    .line 317
    return-object p1

    .line 318
    :cond_13
    move-object v8, p0

    .line 319
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 320
    .line 321
    const-string v0, "unreachable"

    .line 322
    .line 323
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    throw p1
.end method

.method public final c()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/channels/a;->a:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v1, Lkotlinx/coroutines/channels/c;->p:Le7/r;

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    iput-object v1, p0, Lkotlinx/coroutines/channels/a;->a:Ljava/lang/Object;

    .line 8
    .line 9
    sget-object v1, Lkotlinx/coroutines/channels/c;->l:Le7/r;

    .line 10
    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    iget-object v0, p0, Lkotlinx/coroutines/channels/a;->c:Lkotlinx/coroutines/channels/b;

    .line 15
    .line 16
    invoke-virtual {v0}, Lkotlinx/coroutines/channels/b;->p()Ljava/lang/Throwable;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sget v1, Le7/q;->a:I

    .line 21
    .line 22
    throw v0

    .line 23
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v1, "`hasNext()` has not been invoked"

    .line 26
    .line 27
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v0
.end method
