.class public final Lcoil3/intercept/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcoil3/r;

.field public final b:Lcoil3/util/a;

.field public final c:Lw1/a;

.field public final d:Lq/d;


# direct methods
.method public constructor <init>(Lcoil3/r;Lcoil3/util/a;Lw1/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcoil3/intercept/b;->a:Lcoil3/r;

    .line 5
    .line 6
    iput-object p2, p0, Lcoil3/intercept/b;->b:Lcoil3/util/a;

    .line 7
    .line 8
    iput-object p3, p0, Lcoil3/intercept/b;->c:Lw1/a;

    .line 9
    .line 10
    new-instance p2, Lq/d;

    .line 11
    .line 12
    invoke-direct {p2, p1, p3}, Lq/d;-><init>(Lcoil3/r;Lw1/a;)V

    .line 13
    .line 14
    .line 15
    iput-object p2, p0, Lcoil3/intercept/b;->d:Lq/d;

    .line 16
    .line 17
    return-void
.end method

.method public static final a(Lcoil3/intercept/b;Ln/k;Lcoil3/d;Ls/f;Ljava/lang/Object;Ls/l;Lcoil3/h;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p7, Lcoil3/intercept/EngineInterceptor$decode$1;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p7

    .line 9
    check-cast v0, Lcoil3/intercept/EngineInterceptor$decode$1;

    .line 10
    .line 11
    iget v1, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->label:I

    .line 12
    .line 13
    const/high16 v2, -0x80000000

    .line 14
    .line 15
    and-int v3, v1, v2

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    sub-int/2addr v1, v2

    .line 20
    iput v1, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->label:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v0, Lcoil3/intercept/EngineInterceptor$decode$1;

    .line 24
    .line 25
    invoke-direct {v0, p0, p7}, Lcoil3/intercept/EngineInterceptor$decode$1;-><init>(Lcoil3/intercept/b;Lh6/c;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object p0, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->result:Ljava/lang/Object;

    .line 29
    .line 30
    sget-object p7, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 31
    .line 32
    iget v1, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->label:I

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    const/4 v3, 0x1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    if-ne v1, v3, :cond_1

    .line 39
    .line 40
    iget p1, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->I$0:I

    .line 41
    .line 42
    iget-object p2, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->L$6:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p2, Lcoil3/decode/j;

    .line 45
    .line 46
    iget-object p2, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->L$5:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p2, Lcoil3/h;

    .line 49
    .line 50
    iget-object p3, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->L$4:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p3, Ls/l;

    .line 53
    .line 54
    iget-object p4, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->L$3:Ljava/lang/Object;

    .line 55
    .line 56
    iget-object p5, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->L$2:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p5, Ls/f;

    .line 59
    .line 60
    iget-object p6, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->L$1:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p6, Lcoil3/d;

    .line 63
    .line 64
    iget-object v1, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->L$0:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v1, Ln/k;

    .line 67
    .line 68
    invoke-static {p0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    move-object v5, p6

    .line 72
    move-object p6, p2

    .line 73
    move-object p2, v5

    .line 74
    move-object v5, p5

    .line 75
    move-object p5, p3

    .line 76
    move-object p3, v5

    .line 77
    goto/16 :goto_4

    .line 78
    .line 79
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 80
    .line 81
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 82
    .line 83
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p0

    .line 87
    :cond_2
    invoke-static {p0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    const/4 p0, 0x0

    .line 91
    :goto_1
    iget-object v1, p2, Lcoil3/d;->g:Ld6/e;

    .line 92
    .line 93
    invoke-interface {v1}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    check-cast v1, Ljava/util/List;

    .line 98
    .line 99
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    :goto_2
    if-ge p0, v1, :cond_4

    .line 104
    .line 105
    iget-object v4, p2, Lcoil3/d;->g:Ld6/e;

    .line 106
    .line 107
    invoke-interface {v4}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    check-cast v4, Ljava/util/List;

    .line 112
    .line 113
    invoke-interface {v4, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    check-cast v4, Lcoil3/decode/i;

    .line 118
    .line 119
    invoke-interface {v4, p1, p5}, Lcoil3/decode/i;->a(Ln/k;Ls/l;)Lcoil3/decode/j;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    if-eqz v4, :cond_3

    .line 124
    .line 125
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    new-instance v1, Lkotlin/Pair;

    .line 130
    .line 131
    invoke-direct {v1, v4, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_3
    add-int/lit8 p0, p0, 0x1

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_4
    move-object v1, v2

    .line 139
    :goto_3
    if-eqz v1, :cond_9

    .line 140
    .line 141
    invoke-virtual {v1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    check-cast p0, Lcoil3/decode/j;

    .line 146
    .line 147
    invoke-virtual {v1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    check-cast v1, Ljava/lang/Number;

    .line 152
    .line 153
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    add-int/2addr v1, v3

    .line 158
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    iput-object p1, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->L$0:Ljava/lang/Object;

    .line 162
    .line 163
    iput-object p2, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->L$1:Ljava/lang/Object;

    .line 164
    .line 165
    iput-object p3, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->L$2:Ljava/lang/Object;

    .line 166
    .line 167
    iput-object p4, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->L$3:Ljava/lang/Object;

    .line 168
    .line 169
    iput-object p5, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->L$4:Ljava/lang/Object;

    .line 170
    .line 171
    iput-object p6, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->L$5:Ljava/lang/Object;

    .line 172
    .line 173
    iput-object p0, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->L$6:Ljava/lang/Object;

    .line 174
    .line 175
    iput v1, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->I$0:I

    .line 176
    .line 177
    iput v3, v0, Lcoil3/intercept/EngineInterceptor$decode$1;->label:I

    .line 178
    .line 179
    invoke-interface {p0, v0}, Lcoil3/decode/j;->a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    if-ne p0, p7, :cond_5

    .line 184
    .line 185
    return-object p7

    .line 186
    :cond_5
    move v5, v1

    .line 187
    move-object v1, p1

    .line 188
    move p1, v5

    .line 189
    :goto_4
    check-cast p0, Lcoil3/decode/g;

    .line 190
    .line 191
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    if-eqz p0, :cond_8

    .line 195
    .line 196
    new-instance p1, Lcoil3/intercept/a;

    .line 197
    .line 198
    iget-object p2, p0, Lcoil3/decode/g;->a:Lcoil3/k;

    .line 199
    .line 200
    iget-boolean p0, p0, Lcoil3/decode/g;->b:Z

    .line 201
    .line 202
    iget-object p3, v1, Ln/k;->c:Lcoil3/decode/DataSource;

    .line 203
    .line 204
    iget-object p4, v1, Ln/k;->a:Lcoil3/decode/p;

    .line 205
    .line 206
    instance-of p5, p4, Lcoil3/decode/o;

    .line 207
    .line 208
    if-eqz p5, :cond_6

    .line 209
    .line 210
    check-cast p4, Lcoil3/decode/o;

    .line 211
    .line 212
    goto :goto_5

    .line 213
    :cond_6
    move-object p4, v2

    .line 214
    :goto_5
    if-eqz p4, :cond_7

    .line 215
    .line 216
    iget-object v2, p4, Lcoil3/decode/o;->c:Ljava/lang/String;

    .line 217
    .line 218
    :cond_7
    invoke-direct {p1, p2, p0, p3, v2}, Lcoil3/intercept/a;-><init>(Lcoil3/k;ZLcoil3/decode/DataSource;Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    return-object p1

    .line 222
    :cond_8
    move p0, p1

    .line 223
    move-object p1, v1

    .line 224
    goto/16 :goto_1

    .line 225
    .line 226
    :cond_9
    const-string p0, "Unable to create a decoder that supports: "

    .line 227
    .line 228
    invoke-static {p4, p0}, Landroid/support/v4/media/f;->i(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 233
    .line 234
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object p0

    .line 238
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    throw p1
.end method

.method public static final b(Lcoil3/intercept/b;Ls/f;Ljava/lang/Object;Ls/l;Lcoil3/h;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 15

    .line 1
    move-object/from16 v1, p5

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    instance-of v2, v1, Lcoil3/intercept/EngineInterceptor$execute$1;

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    move-object v2, v1

    .line 11
    check-cast v2, Lcoil3/intercept/EngineInterceptor$execute$1;

    .line 12
    .line 13
    iget v3, v2, Lcoil3/intercept/EngineInterceptor$execute$1;->label:I

    .line 14
    .line 15
    const/high16 v4, -0x80000000

    .line 16
    .line 17
    and-int v5, v3, v4

    .line 18
    .line 19
    if-eqz v5, :cond_0

    .line 20
    .line 21
    sub-int/2addr v3, v4

    .line 22
    iput v3, v2, Lcoil3/intercept/EngineInterceptor$execute$1;->label:I

    .line 23
    .line 24
    :goto_0
    move-object v6, v2

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    new-instance v2, Lcoil3/intercept/EngineInterceptor$execute$1;

    .line 27
    .line 28
    invoke-direct {v2, p0, v1}, Lcoil3/intercept/EngineInterceptor$execute$1;-><init>(Lcoil3/intercept/b;Lh6/c;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :goto_1
    iget-object v1, v6, Lcoil3/intercept/EngineInterceptor$execute$1;->result:Ljava/lang/Object;

    .line 33
    .line 34
    sget-object v9, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 35
    .line 36
    iget v2, v6, Lcoil3/intercept/EngineInterceptor$execute$1;->label:I

    .line 37
    .line 38
    const/4 v10, 0x3

    .line 39
    const/4 v11, 0x2

    .line 40
    const/4 v3, 0x1

    .line 41
    const/4 v12, 0x0

    .line 42
    if-eqz v2, :cond_4

    .line 43
    .line 44
    if-eq v2, v3, :cond_3

    .line 45
    .line 46
    if-eq v2, v11, :cond_2

    .line 47
    .line 48
    if-ne v2, v10, :cond_1

    .line 49
    .line 50
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto/16 :goto_9

    .line 54
    .line 55
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v0

    .line 63
    :cond_2
    iget-object v0, v6, Lcoil3/intercept/EngineInterceptor$execute$1;->L$3:Ljava/lang/Object;

    .line 64
    .line 65
    move-object v2, v0

    .line 66
    check-cast v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 67
    .line 68
    iget-object v0, v6, Lcoil3/intercept/EngineInterceptor$execute$1;->L$2:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 71
    .line 72
    iget-object v3, v6, Lcoil3/intercept/EngineInterceptor$execute$1;->L$1:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v3, Lcoil3/h;

    .line 75
    .line 76
    iget-object v4, v6, Lcoil3/intercept/EngineInterceptor$execute$1;->L$0:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v4, Ls/f;

    .line 79
    .line 80
    :try_start_0
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    .line 82
    .line 83
    move-object v14, v6

    .line 84
    goto/16 :goto_3

    .line 85
    .line 86
    :catchall_0
    move-exception v0

    .line 87
    goto/16 :goto_a

    .line 88
    .line 89
    :cond_3
    iget-object v2, v6, Lcoil3/intercept/EngineInterceptor$execute$1;->L$6:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 92
    .line 93
    iget-object v3, v6, Lcoil3/intercept/EngineInterceptor$execute$1;->L$5:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v3, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 96
    .line 97
    iget-object v4, v6, Lcoil3/intercept/EngineInterceptor$execute$1;->L$4:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v4, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 100
    .line 101
    iget-object v5, v6, Lcoil3/intercept/EngineInterceptor$execute$1;->L$3:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v5, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 104
    .line 105
    iget-object v7, v6, Lcoil3/intercept/EngineInterceptor$execute$1;->L$2:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v7, Lcoil3/h;

    .line 108
    .line 109
    iget-object v8, v6, Lcoil3/intercept/EngineInterceptor$execute$1;->L$1:Ljava/lang/Object;

    .line 110
    .line 111
    iget-object v13, v6, Lcoil3/intercept/EngineInterceptor$execute$1;->L$0:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v13, Ls/f;

    .line 114
    .line 115
    :try_start_1
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 116
    .line 117
    .line 118
    move-object v14, v6

    .line 119
    move-object v6, v5

    .line 120
    move-object v5, v8

    .line 121
    move-object v8, v4

    .line 122
    move-object v4, v13

    .line 123
    goto/16 :goto_2

    .line 124
    .line 125
    :catchall_1
    move-exception v0

    .line 126
    move-object v2, v3

    .line 127
    goto/16 :goto_a

    .line 128
    .line 129
    :cond_4
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    new-instance v7, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 133
    .line 134
    invoke-direct {v7}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 135
    .line 136
    .line 137
    move-object/from16 v1, p3

    .line 138
    .line 139
    iput-object v1, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 140
    .line 141
    new-instance v8, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 142
    .line 143
    invoke-direct {v8}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 144
    .line 145
    .line 146
    iget-object v1, p0, Lcoil3/intercept/b;->a:Lcoil3/r;

    .line 147
    .line 148
    iget-object v1, v1, Lcoil3/r;->d:Lcoil3/d;

    .line 149
    .line 150
    iput-object v1, v8, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 151
    .line 152
    new-instance v13, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 153
    .line 154
    invoke-direct {v13}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 155
    .line 156
    .line 157
    :try_start_2
    iget-object v1, p0, Lcoil3/intercept/b;->c:Lw1/a;

    .line 158
    .line 159
    iget-object v2, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v2, Ls/l;

    .line 162
    .line 163
    invoke-virtual {v1, v2}, Lw1/a;->d(Ls/l;)Ls/l;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    iput-object v1, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 168
    .line 169
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    iget-object v1, v8, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v1, Lcoil3/d;

    .line 175
    .line 176
    iget-object v2, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 177
    .line 178
    move-object v4, v2

    .line 179
    check-cast v4, Ls/l;

    .line 180
    .line 181
    move-object/from16 v2, p1

    .line 182
    .line 183
    iput-object v2, v6, Lcoil3/intercept/EngineInterceptor$execute$1;->L$0:Ljava/lang/Object;

    .line 184
    .line 185
    move-object/from16 v5, p2

    .line 186
    .line 187
    iput-object v5, v6, Lcoil3/intercept/EngineInterceptor$execute$1;->L$1:Ljava/lang/Object;

    .line 188
    .line 189
    move-object/from16 v14, p4

    .line 190
    .line 191
    iput-object v14, v6, Lcoil3/intercept/EngineInterceptor$execute$1;->L$2:Ljava/lang/Object;

    .line 192
    .line 193
    iput-object v7, v6, Lcoil3/intercept/EngineInterceptor$execute$1;->L$3:Ljava/lang/Object;

    .line 194
    .line 195
    iput-object v8, v6, Lcoil3/intercept/EngineInterceptor$execute$1;->L$4:Ljava/lang/Object;

    .line 196
    .line 197
    iput-object v13, v6, Lcoil3/intercept/EngineInterceptor$execute$1;->L$5:Ljava/lang/Object;

    .line 198
    .line 199
    iput-object v13, v6, Lcoil3/intercept/EngineInterceptor$execute$1;->L$6:Ljava/lang/Object;

    .line 200
    .line 201
    iput v3, v6, Lcoil3/intercept/EngineInterceptor$execute$1;->label:I

    .line 202
    .line 203
    move-object v0, p0

    .line 204
    move-object v3, v5

    .line 205
    move-object v5, v14

    .line 206
    invoke-virtual/range {v0 .. v6}, Lcoil3/intercept/b;->c(Lcoil3/d;Ls/f;Ljava/lang/Object;Ls/l;Lcoil3/h;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 210
    move-object v14, v6

    .line 211
    if-ne v1, v9, :cond_5

    .line 212
    .line 213
    goto/16 :goto_8

    .line 214
    .line 215
    :cond_5
    move-object/from16 v4, p1

    .line 216
    .line 217
    move-object/from16 v5, p2

    .line 218
    .line 219
    move-object v6, v7

    .line 220
    move-object v2, v13

    .line 221
    move-object v3, v2

    .line 222
    move-object/from16 v7, p4

    .line 223
    .line 224
    :goto_2
    :try_start_3
    iput-object v1, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 225
    .line 226
    iget-object v0, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 227
    .line 228
    move-object v1, v0

    .line 229
    check-cast v1, Ln/e;

    .line 230
    .line 231
    instance-of v2, v1, Ln/k;

    .line 232
    .line 233
    if-eqz v2, :cond_7

    .line 234
    .line 235
    iget-object v13, v4, Ls/f;->h:Lh6/h;

    .line 236
    .line 237
    new-instance v0, Lcoil3/intercept/EngineInterceptor$execute$executeResult$1;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 238
    .line 239
    move-object v2, v3

    .line 240
    move-object v3, v8

    .line 241
    const/4 v8, 0x0

    .line 242
    move-object v1, p0

    .line 243
    :try_start_4
    invoke-direct/range {v0 .. v8}, Lcoil3/intercept/EngineInterceptor$execute$executeResult$1;-><init>(Lcoil3/intercept/b;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Ls/f;Ljava/lang/Object;Lkotlin/jvm/internal/Ref$ObjectRef;Lcoil3/h;Lh6/c;)V

    .line 244
    .line 245
    .line 246
    iput-object v4, v14, Lcoil3/intercept/EngineInterceptor$execute$1;->L$0:Ljava/lang/Object;

    .line 247
    .line 248
    iput-object v7, v14, Lcoil3/intercept/EngineInterceptor$execute$1;->L$1:Ljava/lang/Object;

    .line 249
    .line 250
    iput-object v6, v14, Lcoil3/intercept/EngineInterceptor$execute$1;->L$2:Ljava/lang/Object;

    .line 251
    .line 252
    iput-object v2, v14, Lcoil3/intercept/EngineInterceptor$execute$1;->L$3:Ljava/lang/Object;

    .line 253
    .line 254
    iput-object v12, v14, Lcoil3/intercept/EngineInterceptor$execute$1;->L$4:Ljava/lang/Object;

    .line 255
    .line 256
    iput-object v12, v14, Lcoil3/intercept/EngineInterceptor$execute$1;->L$5:Ljava/lang/Object;

    .line 257
    .line 258
    iput-object v12, v14, Lcoil3/intercept/EngineInterceptor$execute$1;->L$6:Ljava/lang/Object;

    .line 259
    .line 260
    iput v11, v14, Lcoil3/intercept/EngineInterceptor$execute$1;->label:I

    .line 261
    .line 262
    invoke-static {v13, v0, v14}, Lkotlinx/coroutines/x;->F(Lh6/h;Lr6/e;Lh6/c;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    if-ne v1, v9, :cond_6

    .line 267
    .line 268
    goto :goto_8

    .line 269
    :cond_6
    move-object v0, v6

    .line 270
    move-object v3, v7

    .line 271
    :goto_3
    check-cast v1, Lcoil3/intercept/a;

    .line 272
    .line 273
    move-object v6, v0

    .line 274
    move-object v7, v3

    .line 275
    :goto_4
    move-object v3, v2

    .line 276
    goto :goto_5

    .line 277
    :cond_7
    move-object v2, v3

    .line 278
    instance-of v1, v1, Ln/i;

    .line 279
    .line 280
    if-eqz v1, :cond_c

    .line 281
    .line 282
    new-instance v1, Lcoil3/intercept/a;

    .line 283
    .line 284
    move-object v3, v0

    .line 285
    check-cast v3, Ln/i;

    .line 286
    .line 287
    iget-object v3, v3, Ln/i;->a:Lcoil3/k;

    .line 288
    .line 289
    move-object v5, v0

    .line 290
    check-cast v5, Ln/i;

    .line 291
    .line 292
    iget-boolean v5, v5, Ln/i;->b:Z

    .line 293
    .line 294
    check-cast v0, Ln/i;

    .line 295
    .line 296
    iget-object v0, v0, Ln/i;->c:Lcoil3/decode/DataSource;

    .line 297
    .line 298
    invoke-direct {v1, v3, v5, v0, v12}, Lcoil3/intercept/a;-><init>(Lcoil3/k;ZLcoil3/decode/DataSource;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 299
    .line 300
    .line 301
    goto :goto_4

    .line 302
    :goto_5
    iget-object v0, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 303
    .line 304
    instance-of v2, v0, Ln/k;

    .line 305
    .line 306
    if-eqz v2, :cond_8

    .line 307
    .line 308
    check-cast v0, Ln/k;

    .line 309
    .line 310
    goto :goto_6

    .line 311
    :cond_8
    move-object v0, v12

    .line 312
    :goto_6
    if-eqz v0, :cond_9

    .line 313
    .line 314
    iget-object v0, v0, Ln/k;->a:Lcoil3/decode/p;

    .line 315
    .line 316
    if-eqz v0, :cond_9

    .line 317
    .line 318
    :try_start_5
    invoke-static {v0}, Landroidx/compose/material3/c;->t(Ljava/lang/AutoCloseable;)V
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    .line 319
    .line 320
    .line 321
    goto :goto_7

    .line 322
    :catch_0
    move-exception v0

    .line 323
    throw v0

    .line 324
    :catch_1
    :cond_9
    :goto_7
    iget-object v0, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 325
    .line 326
    check-cast v0, Ls/l;

    .line 327
    .line 328
    iput-object v12, v14, Lcoil3/intercept/EngineInterceptor$execute$1;->L$0:Ljava/lang/Object;

    .line 329
    .line 330
    iput-object v12, v14, Lcoil3/intercept/EngineInterceptor$execute$1;->L$1:Ljava/lang/Object;

    .line 331
    .line 332
    iput-object v12, v14, Lcoil3/intercept/EngineInterceptor$execute$1;->L$2:Ljava/lang/Object;

    .line 333
    .line 334
    iput-object v12, v14, Lcoil3/intercept/EngineInterceptor$execute$1;->L$3:Ljava/lang/Object;

    .line 335
    .line 336
    iput-object v12, v14, Lcoil3/intercept/EngineInterceptor$execute$1;->L$4:Ljava/lang/Object;

    .line 337
    .line 338
    iput-object v12, v14, Lcoil3/intercept/EngineInterceptor$execute$1;->L$5:Ljava/lang/Object;

    .line 339
    .line 340
    iput-object v12, v14, Lcoil3/intercept/EngineInterceptor$execute$1;->L$6:Ljava/lang/Object;

    .line 341
    .line 342
    iput v10, v14, Lcoil3/intercept/EngineInterceptor$execute$1;->label:I

    .line 343
    .line 344
    invoke-static {v1, v4, v0, v7, v14}, Lcoil3/intercept/c;->a(Lcoil3/intercept/a;Ls/f;Ls/l;Lcoil3/h;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Lcoil3/intercept/a;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    if-ne v1, v9, :cond_a

    .line 349
    .line 350
    :goto_8
    return-object v9

    .line 351
    :cond_a
    :goto_9
    check-cast v1, Lcoil3/intercept/a;

    .line 352
    .line 353
    iget-object v0, v1, Lcoil3/intercept/a;->a:Lcoil3/k;

    .line 354
    .line 355
    sget-object v2, Lcoil3/util/l;->a:[Landroid/graphics/Bitmap$Config;

    .line 356
    .line 357
    instance-of v2, v0, Lcoil3/a;

    .line 358
    .line 359
    if-eqz v2, :cond_b

    .line 360
    .line 361
    check-cast v0, Lcoil3/a;

    .line 362
    .line 363
    iget-object v0, v0, Lcoil3/a;->a:Landroid/graphics/Bitmap;

    .line 364
    .line 365
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    .line 366
    .line 367
    .line 368
    :cond_b
    return-object v1

    .line 369
    :cond_c
    :try_start_6
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 370
    .line 371
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 372
    .line 373
    .line 374
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 375
    :catchall_2
    move-exception v0

    .line 376
    move-object v2, v13

    .line 377
    :goto_a
    iget-object v1, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 378
    .line 379
    instance-of v2, v1, Ln/k;

    .line 380
    .line 381
    if-eqz v2, :cond_d

    .line 382
    .line 383
    move-object v12, v1

    .line 384
    check-cast v12, Ln/k;

    .line 385
    .line 386
    :cond_d
    if-eqz v12, :cond_e

    .line 387
    .line 388
    iget-object v1, v12, Ln/k;->a:Lcoil3/decode/p;

    .line 389
    .line 390
    if-eqz v1, :cond_e

    .line 391
    .line 392
    :try_start_7
    invoke-static {v1}, Landroidx/compose/material3/c;->t(Ljava/lang/AutoCloseable;)V
    :try_end_7
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    .line 393
    .line 394
    .line 395
    goto :goto_b

    .line 396
    :catch_2
    move-exception v0

    .line 397
    throw v0

    .line 398
    :catch_3
    :cond_e
    :goto_b
    throw v0
.end method


# virtual methods
.method public final c(Lcoil3/d;Ls/f;Ljava/lang/Object;Ls/l;Lcoil3/h;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p6, Lcoil3/intercept/EngineInterceptor$fetch$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p6

    .line 6
    check-cast v0, Lcoil3/intercept/EngineInterceptor$fetch$1;

    .line 7
    .line 8
    iget v1, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->label:I

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
    iput v1, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcoil3/intercept/EngineInterceptor$fetch$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p6}, Lcoil3/intercept/EngineInterceptor$fetch$1;-><init>(Lcoil3/intercept/b;Lh6/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p6, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    iget p1, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->I$0:I

    .line 38
    .line 39
    iget-object p2, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->L$5:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p2, Ln/g;

    .line 42
    .line 43
    iget-object p2, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->L$4:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p2, Lcoil3/h;

    .line 46
    .line 47
    iget-object p3, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->L$3:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p3, Ls/l;

    .line 50
    .line 51
    iget-object p4, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->L$2:Ljava/lang/Object;

    .line 52
    .line 53
    iget-object p5, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->L$1:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p5, Ls/f;

    .line 56
    .line 57
    iget-object v2, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->L$0:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v2, Lcoil3/d;

    .line 60
    .line 61
    invoke-static {p6}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    move-object v7, v2

    .line 65
    move v2, p1

    .line 66
    move-object p1, v7

    .line 67
    move-object v7, p5

    .line 68
    move-object p5, p2

    .line 69
    move-object p2, v7

    .line 70
    move-object v7, p4

    .line 71
    move-object p4, p3

    .line 72
    move-object p3, v7

    .line 73
    goto/16 :goto_4

    .line 74
    .line 75
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 76
    .line 77
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 78
    .line 79
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p1

    .line 83
    :cond_2
    invoke-static {p6}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    const/4 p6, 0x0

    .line 87
    :goto_1
    iget-object v2, p1, Lcoil3/d;->f:Ld6/e;

    .line 88
    .line 89
    invoke-interface {v2}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    check-cast v2, Ljava/util/List;

    .line 94
    .line 95
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    :goto_2
    if-ge p6, v2, :cond_4

    .line 100
    .line 101
    iget-object v5, p1, Lcoil3/d;->f:Ld6/e;

    .line 102
    .line 103
    invoke-interface {v5}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    check-cast v5, Ljava/util/List;

    .line 108
    .line 109
    invoke-interface {v5, p6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    check-cast v5, Lkotlin/Pair;

    .line 114
    .line 115
    invoke-virtual {v5}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    check-cast v6, Ln/f;

    .line 120
    .line 121
    invoke-virtual {v5}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    check-cast v5, Ly6/c;

    .line 126
    .line 127
    check-cast v5, Lkotlin/jvm/internal/d;

    .line 128
    .line 129
    invoke-virtual {v5, p3}, Lkotlin/jvm/internal/d;->f(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    if-eqz v5, :cond_3

    .line 134
    .line 135
    const-string v5, "null cannot be cast to non-null type coil3.fetch.Fetcher.Factory<kotlin.Any>"

    .line 136
    .line 137
    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    iget-object v5, p0, Lcoil3/intercept/b;->a:Lcoil3/r;

    .line 141
    .line 142
    invoke-interface {v6, p3, p4, v5}, Ln/f;->a(Ljava/lang/Object;Ls/l;Lcoil3/r;)Ln/g;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    if-eqz v5, :cond_3

    .line 147
    .line 148
    invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 149
    .line 150
    .line 151
    move-result-object p6

    .line 152
    new-instance v2, Lkotlin/Pair;

    .line 153
    .line 154
    invoke-direct {v2, v5, p6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_3
    add-int/lit8 p6, p6, 0x1

    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_4
    move-object v2, v3

    .line 162
    :goto_3
    if-eqz v2, :cond_9

    .line 163
    .line 164
    invoke-virtual {v2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p6

    .line 168
    check-cast p6, Ln/g;

    .line 169
    .line 170
    invoke-virtual {v2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    check-cast v2, Ljava/lang/Number;

    .line 175
    .line 176
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    add-int/2addr v2, v4

    .line 181
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    iput-object p1, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->L$0:Ljava/lang/Object;

    .line 185
    .line 186
    iput-object p2, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->L$1:Ljava/lang/Object;

    .line 187
    .line 188
    iput-object p3, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->L$2:Ljava/lang/Object;

    .line 189
    .line 190
    iput-object p4, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->L$3:Ljava/lang/Object;

    .line 191
    .line 192
    iput-object p5, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->L$4:Ljava/lang/Object;

    .line 193
    .line 194
    iput-object p6, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->L$5:Ljava/lang/Object;

    .line 195
    .line 196
    iput v2, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->I$0:I

    .line 197
    .line 198
    iput v4, v0, Lcoil3/intercept/EngineInterceptor$fetch$1;->label:I

    .line 199
    .line 200
    invoke-interface {p6, v0}, Ln/g;->a(Lh6/c;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object p6

    .line 204
    if-ne p6, v1, :cond_5

    .line 205
    .line 206
    return-object v1

    .line 207
    :cond_5
    :goto_4
    check-cast p6, Ln/e;

    .line 208
    .line 209
    :try_start_0
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 210
    .line 211
    .line 212
    if-eqz p6, :cond_6

    .line 213
    .line 214
    return-object p6

    .line 215
    :cond_6
    move p6, v2

    .line 216
    goto/16 :goto_1

    .line 217
    .line 218
    :catchall_0
    move-exception p1

    .line 219
    instance-of p2, p6, Ln/k;

    .line 220
    .line 221
    if-eqz p2, :cond_7

    .line 222
    .line 223
    move-object v3, p6

    .line 224
    check-cast v3, Ln/k;

    .line 225
    .line 226
    :cond_7
    if-eqz v3, :cond_8

    .line 227
    .line 228
    iget-object p2, v3, Ln/k;->a:Lcoil3/decode/p;

    .line 229
    .line 230
    if-eqz p2, :cond_8

    .line 231
    .line 232
    :try_start_1
    invoke-static {p2}, Landroidx/compose/material3/c;->t(Ljava/lang/AutoCloseable;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 233
    .line 234
    .line 235
    goto :goto_5

    .line 236
    :catch_0
    move-exception p1

    .line 237
    throw p1

    .line 238
    :catch_1
    :cond_8
    :goto_5
    throw p1

    .line 239
    :cond_9
    const-string p1, "Unable to create a fetcher that supports: "

    .line 240
    .line 241
    invoke-static {p3, p1}, Landroid/support/v4/media/f;->i(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 246
    .line 247
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    throw p2
.end method

.method public final d(Lcoil3/intercept/e;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    iget-object v2, v1, Lcoil3/intercept/b;->d:Lq/d;

    .line 8
    .line 9
    instance-of v3, v0, Lcoil3/intercept/EngineInterceptor$intercept$1;

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    move-object v3, v0

    .line 14
    check-cast v3, Lcoil3/intercept/EngineInterceptor$intercept$1;

    .line 15
    .line 16
    iget v4, v3, Lcoil3/intercept/EngineInterceptor$intercept$1;->label:I

    .line 17
    .line 18
    const/high16 v5, -0x80000000

    .line 19
    .line 20
    and-int v6, v4, v5

    .line 21
    .line 22
    if-eqz v6, :cond_0

    .line 23
    .line 24
    sub-int/2addr v4, v5

    .line 25
    iput v4, v3, Lcoil3/intercept/EngineInterceptor$intercept$1;->label:I

    .line 26
    .line 27
    :goto_0
    move-object v9, v3

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    new-instance v3, Lcoil3/intercept/EngineInterceptor$intercept$1;

    .line 30
    .line 31
    invoke-direct {v3, v1, v0}, Lcoil3/intercept/EngineInterceptor$intercept$1;-><init>(Lcoil3/intercept/b;Lh6/c;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :goto_1
    iget-object v0, v9, Lcoil3/intercept/EngineInterceptor$intercept$1;->result:Ljava/lang/Object;

    .line 36
    .line 37
    sget-object v10, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 38
    .line 39
    iget v3, v9, Lcoil3/intercept/EngineInterceptor$intercept$1;->label:I

    .line 40
    .line 41
    const/4 v11, 0x1

    .line 42
    if-eqz v3, :cond_2

    .line 43
    .line 44
    if-ne v3, v11, :cond_1

    .line 45
    .line 46
    iget-object v2, v9, Lcoil3/intercept/EngineInterceptor$intercept$1;->L$0:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, Lcoil3/intercept/d;

    .line 49
    .line 50
    :try_start_0
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    return-object v0

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    move-object v7, v2

    .line 56
    goto/16 :goto_a

    .line 57
    .line 58
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw v0

    .line 66
    :cond_2
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    move-object v12, v10

    .line 70
    :try_start_1
    iget-object v10, v7, Lcoil3/intercept/e;->d:Ls/f;

    .line 71
    .line 72
    iget-object v0, v10, Ls/f;->b:Ljava/lang/Object;

    .line 73
    .line 74
    iget-object v3, v7, Lcoil3/intercept/e;->e:Lt/f;

    .line 75
    .line 76
    if-eqz v7, :cond_3

    .line 77
    .line 78
    iget-object v4, v7, Lcoil3/intercept/e;->f:Lcoil3/h;

    .line 79
    .line 80
    :goto_2
    move-object v5, v4

    .line 81
    goto :goto_3

    .line 82
    :cond_3
    sget-object v4, Lcoil3/h;->a:Lcoil3/f;

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :goto_3
    iget-object v4, v1, Lcoil3/intercept/b;->c:Lw1/a;

    .line 86
    .line 87
    invoke-virtual {v4, v10, v3}, Lw1/a;->c(Ls/f;Lt/f;)Ls/l;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    iget-object v6, v4, Ls/l;->c:Lcoil3/size/Scale;

    .line 92
    .line 93
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    iget-object v8, v1, Lcoil3/intercept/b;->a:Lcoil3/r;

    .line 97
    .line 98
    iget-object v8, v8, Lcoil3/r;->d:Lcoil3/d;

    .line 99
    .line 100
    iget-object v8, v8, Lcoil3/d;->b:Ljava/util/List;

    .line 101
    .line 102
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    .line 103
    .line 104
    .line 105
    move-result v13

    .line 106
    const/4 v15, 0x0

    .line 107
    :goto_4
    if-ge v15, v13, :cond_5

    .line 108
    .line 109
    invoke-interface {v8, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v16

    .line 113
    check-cast v16, Lkotlin/Pair;

    .line 114
    .line 115
    invoke-virtual/range {v16 .. v16}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v17

    .line 119
    move-object/from16 v14, v17

    .line 120
    .line 121
    check-cast v14, Lp/a;

    .line 122
    .line 123
    invoke-virtual/range {v16 .. v16}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v16

    .line 127
    check-cast v16, Ly6/c;

    .line 128
    .line 129
    move-object/from16 v11, v16

    .line 130
    .line 131
    check-cast v11, Lkotlin/jvm/internal/d;

    .line 132
    .line 133
    invoke-virtual {v11, v0}, Lkotlin/jvm/internal/d;->f(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v11

    .line 137
    if-eqz v11, :cond_4

    .line 138
    .line 139
    const-string v11, "null cannot be cast to non-null type coil3.map.Mapper<kotlin.Any, *>"

    .line 140
    .line 141
    invoke-static {v14, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v14, v0, v4}, Lp/a;->a(Ljava/lang/Object;Ls/l;)Lcoil3/x;

    .line 145
    .line 146
    .line 147
    move-result-object v11

    .line 148
    if-eqz v11, :cond_4

    .line 149
    .line 150
    move-object v0, v11

    .line 151
    :cond_4
    add-int/lit8 v15, v15, 0x1

    .line 152
    .line 153
    const/4 v11, 0x1

    .line 154
    goto :goto_4

    .line 155
    :cond_5
    move-object v11, v12

    .line 156
    invoke-virtual {v2, v10, v0, v4, v5}, Lq/d;->b(Ls/f;Ljava/lang/Object;Ls/l;Lcoil3/h;)Lq/a;

    .line 157
    .line 158
    .line 159
    move-result-object v12

    .line 160
    const/4 v8, 0x0

    .line 161
    if-eqz v12, :cond_6

    .line 162
    .line 163
    invoke-virtual {v2, v10, v12, v3, v6}, Lq/d;->a(Ls/f;Lq/a;Lt/f;Lcoil3/size/Scale;)Lq/b;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    goto :goto_5

    .line 168
    :catchall_1
    move-exception v0

    .line 169
    goto :goto_a

    .line 170
    :cond_6
    move-object v2, v8

    .line 171
    :goto_5
    if-eqz v2, :cond_b

    .line 172
    .line 173
    iget-object v0, v2, Lq/b;->b:Ljava/util/Map;

    .line 174
    .line 175
    move-object v3, v8

    .line 176
    new-instance v8, Ls/n;

    .line 177
    .line 178
    iget-object v9, v2, Lq/b;->a:Lcoil3/k;

    .line 179
    .line 180
    sget-object v11, Lcoil3/decode/DataSource;->MEMORY_CACHE:Lcoil3/decode/DataSource;

    .line 181
    .line 182
    const-string v2, "coil#disk_cache_key"

    .line 183
    .line 184
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    instance-of v4, v2, Ljava/lang/String;

    .line 189
    .line 190
    if-eqz v4, :cond_7

    .line 191
    .line 192
    check-cast v2, Ljava/lang/String;

    .line 193
    .line 194
    move-object v13, v2

    .line 195
    goto :goto_6

    .line 196
    :cond_7
    move-object v13, v3

    .line 197
    :goto_6
    const-string v2, "coil#is_sampled"

    .line 198
    .line 199
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    instance-of v2, v0, Ljava/lang/Boolean;

    .line 204
    .line 205
    if-eqz v2, :cond_8

    .line 206
    .line 207
    check-cast v0, Ljava/lang/Boolean;

    .line 208
    .line 209
    goto :goto_7

    .line 210
    :cond_8
    move-object v0, v3

    .line 211
    :goto_7
    if-eqz v0, :cond_9

    .line 212
    .line 213
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    move v14, v0

    .line 218
    goto :goto_8

    .line 219
    :cond_9
    const/4 v14, 0x0

    .line 220
    :goto_8
    if-eqz v7, :cond_a

    .line 221
    .line 222
    iget-boolean v0, v7, Lcoil3/intercept/e;->g:Z

    .line 223
    .line 224
    if-eqz v0, :cond_a

    .line 225
    .line 226
    const/4 v15, 0x1

    .line 227
    goto :goto_9

    .line 228
    :cond_a
    const/4 v15, 0x0

    .line 229
    :goto_9
    invoke-direct/range {v8 .. v15}, Ls/n;-><init>(Lcoil3/k;Ls/f;Lcoil3/decode/DataSource;Lq/a;Ljava/lang/String;ZZ)V

    .line 230
    .line 231
    .line 232
    return-object v8

    .line 233
    :cond_b
    move-object v2, v10

    .line 234
    move-object v6, v12

    .line 235
    iget-object v10, v2, Ls/f;->g:Lh6/h;

    .line 236
    .line 237
    move-object v3, v0

    .line 238
    new-instance v0, Lcoil3/intercept/EngineInterceptor$intercept$2;

    .line 239
    .line 240
    const/4 v8, 0x0

    .line 241
    invoke-direct/range {v0 .. v8}, Lcoil3/intercept/EngineInterceptor$intercept$2;-><init>(Lcoil3/intercept/b;Ls/f;Ljava/lang/Object;Ls/l;Lcoil3/h;Lq/a;Lcoil3/intercept/d;Lh6/c;)V

    .line 242
    .line 243
    .line 244
    iput-object v7, v9, Lcoil3/intercept/EngineInterceptor$intercept$1;->L$0:Ljava/lang/Object;

    .line 245
    .line 246
    const/4 v1, 0x1

    .line 247
    iput v1, v9, Lcoil3/intercept/EngineInterceptor$intercept$1;->label:I

    .line 248
    .line 249
    invoke-static {v10, v0, v9}, Lkotlinx/coroutines/x;->F(Lh6/h;Lr6/e;Lh6/c;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 253
    if-ne v0, v11, :cond_c

    .line 254
    .line 255
    return-object v11

    .line 256
    :cond_c
    return-object v0

    .line 257
    :goto_a
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 258
    .line 259
    if-nez v1, :cond_d

    .line 260
    .line 261
    check-cast v7, Lcoil3/intercept/e;

    .line 262
    .line 263
    iget-object v1, v7, Lcoil3/intercept/e;->d:Ls/f;

    .line 264
    .line 265
    invoke-static {v1, v0}, Ly1/a;->a(Ls/f;Ljava/lang/Throwable;)Ls/b;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    return-object v0

    .line 270
    :cond_d
    throw v0
.end method
