.class public final Lkotlinx/serialization/json/internal/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lkotlinx/serialization/json/internal/x;

.field public b:I


# direct methods
.method public constructor <init>(Ln7/g;Lkotlinx/serialization/json/internal/x;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lkotlinx/serialization/json/internal/q;->a:Lkotlinx/serialization/json/internal/x;

    .line 5
    .line 6
    return-void
.end method

.method public static final a(Lkotlinx/serialization/json/internal/q;Ld6/b;Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, Lkotlinx/serialization/json/internal/q;->a:Lkotlinx/serialization/json/internal/x;

    .line 2
    .line 3
    instance-of v1, p2, Lkotlinx/serialization/json/internal/JsonTreeReader$readObject$2;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p2

    .line 8
    check-cast v1, Lkotlinx/serialization/json/internal/JsonTreeReader$readObject$2;

    .line 9
    .line 10
    iget v2, v1, Lkotlinx/serialization/json/internal/JsonTreeReader$readObject$2;->label:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lkotlinx/serialization/json/internal/JsonTreeReader$readObject$2;->label:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lkotlinx/serialization/json/internal/JsonTreeReader$readObject$2;

    .line 23
    .line 24
    invoke-direct {v1, p0, p2}, Lkotlinx/serialization/json/internal/JsonTreeReader$readObject$2;-><init>(Lkotlinx/serialization/json/internal/q;Lh6/c;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p2, v1, Lkotlinx/serialization/json/internal/JsonTreeReader$readObject$2;->result:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 30
    .line 31
    iget v3, v1, Lkotlinx/serialization/json/internal/JsonTreeReader$readObject$2;->label:I

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x0

    .line 35
    const/4 v6, 0x6

    .line 36
    const/4 v7, 0x7

    .line 37
    const/4 v8, 0x4

    .line 38
    const/4 v9, 0x1

    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    if-ne v3, v9, :cond_1

    .line 42
    .line 43
    iget-object p0, v1, Lkotlinx/serialization/json/internal/JsonTreeReader$readObject$2;->L$3:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p0, Ljava/lang/String;

    .line 46
    .line 47
    iget-object p1, v1, Lkotlinx/serialization/json/internal/JsonTreeReader$readObject$2;->L$2:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Ljava/util/LinkedHashMap;

    .line 50
    .line 51
    iget-object v0, v1, Lkotlinx/serialization/json/internal/JsonTreeReader$readObject$2;->L$1:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Lkotlinx/serialization/json/internal/q;

    .line 54
    .line 55
    iget-object v3, v1, Lkotlinx/serialization/json/internal/JsonTreeReader$readObject$2;->L$0:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v3, Ld6/b;

    .line 58
    .line 59
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    move-object v11, v1

    .line 63
    move-object v1, p1

    .line 64
    move-object p1, v3

    .line 65
    move-object v3, v11

    .line 66
    goto :goto_2

    .line 67
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 68
    .line 69
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 70
    .line 71
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p0

    .line 75
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v6}, Lkotlinx/serialization/json/internal/x;->f(B)B

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/x;->q()B

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eq v0, v8, :cond_9

    .line 87
    .line 88
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 89
    .line 90
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 91
    .line 92
    .line 93
    :goto_1
    iget-object v3, p0, Lkotlinx/serialization/json/internal/q;->a:Lkotlinx/serialization/json/internal/x;

    .line 94
    .line 95
    invoke-virtual {v3}, Lkotlinx/serialization/json/internal/x;->b()Z

    .line 96
    .line 97
    .line 98
    move-result v10

    .line 99
    if-eqz v10, :cond_6

    .line 100
    .line 101
    invoke-virtual {v3}, Lkotlinx/serialization/json/internal/x;->i()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    const/4 v10, 0x5

    .line 106
    invoke-virtual {v3, v10}, Lkotlinx/serialization/json/internal/x;->f(B)B

    .line 107
    .line 108
    .line 109
    iput-object p1, v1, Lkotlinx/serialization/json/internal/JsonTreeReader$readObject$2;->L$0:Ljava/lang/Object;

    .line 110
    .line 111
    iput-object p0, v1, Lkotlinx/serialization/json/internal/JsonTreeReader$readObject$2;->L$1:Ljava/lang/Object;

    .line 112
    .line 113
    iput-object v0, v1, Lkotlinx/serialization/json/internal/JsonTreeReader$readObject$2;->L$2:Ljava/lang/Object;

    .line 114
    .line 115
    iput-object p2, v1, Lkotlinx/serialization/json/internal/JsonTreeReader$readObject$2;->L$3:Ljava/lang/Object;

    .line 116
    .line 117
    iput v9, v1, Lkotlinx/serialization/json/internal/JsonTreeReader$readObject$2;->label:I

    .line 118
    .line 119
    move-object v3, p1

    .line 120
    check-cast v3, Ld6/c;

    .line 121
    .line 122
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    iput-object v1, v3, Ld6/c;->b:Lh6/c;

    .line 126
    .line 127
    sget-object v3, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 128
    .line 129
    if-ne v3, v2, :cond_3

    .line 130
    .line 131
    return-object v2

    .line 132
    :cond_3
    move-object v11, v0

    .line 133
    move-object v0, p0

    .line 134
    move-object p0, p2

    .line 135
    move-object p2, v3

    .line 136
    move-object v3, v1

    .line 137
    move-object v1, v11

    .line 138
    :goto_2
    check-cast p2, Ln7/j;

    .line 139
    .line 140
    invoke-interface {v1, p0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    iget-object p0, v0, Lkotlinx/serialization/json/internal/q;->a:Lkotlinx/serialization/json/internal/x;

    .line 144
    .line 145
    invoke-virtual {p0}, Lkotlinx/serialization/json/internal/x;->e()B

    .line 146
    .line 147
    .line 148
    move-result p2

    .line 149
    if-eq p2, v8, :cond_5

    .line 150
    .line 151
    if-ne p2, v7, :cond_4

    .line 152
    .line 153
    move-object p0, v0

    .line 154
    move-object v0, v1

    .line 155
    goto :goto_3

    .line 156
    :cond_4
    iget-object p0, v0, Lkotlinx/serialization/json/internal/q;->a:Lkotlinx/serialization/json/internal/x;

    .line 157
    .line 158
    const-string p1, "Expected end of the object or comma"

    .line 159
    .line 160
    invoke-static {p0, p1, v4, v5, v6}, Lkotlinx/serialization/json/internal/x;->m(Lkotlinx/serialization/json/internal/x;Ljava/lang/String;ILjava/lang/String;I)V

    .line 161
    .line 162
    .line 163
    throw v5

    .line 164
    :cond_5
    move-object p0, v0

    .line 165
    move-object v0, v1

    .line 166
    move-object v1, v3

    .line 167
    goto :goto_1

    .line 168
    :cond_6
    :goto_3
    iget-object p0, p0, Lkotlinx/serialization/json/internal/q;->a:Lkotlinx/serialization/json/internal/x;

    .line 169
    .line 170
    if-ne p2, v6, :cond_7

    .line 171
    .line 172
    invoke-virtual {p0, v7}, Lkotlinx/serialization/json/internal/x;->f(B)B

    .line 173
    .line 174
    .line 175
    goto :goto_4

    .line 176
    :cond_7
    if-eq p2, v8, :cond_8

    .line 177
    .line 178
    :goto_4
    new-instance p0, Ln7/u;

    .line 179
    .line 180
    invoke-direct {p0, v0}, Ln7/u;-><init>(Ljava/util/Map;)V

    .line 181
    .line 182
    .line 183
    return-object p0

    .line 184
    :cond_8
    const-string p1, "object"

    .line 185
    .line 186
    invoke-static {p0, p1}, Lkotlinx/serialization/json/internal/j;->m(Lkotlinx/serialization/json/internal/x;Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    throw v5

    .line 190
    :cond_9
    iget-object p0, p0, Lkotlinx/serialization/json/internal/q;->a:Lkotlinx/serialization/json/internal/x;

    .line 191
    .line 192
    const-string p1, "Unexpected leading comma"

    .line 193
    .line 194
    invoke-static {p0, p1, v4, v5, v6}, Lkotlinx/serialization/json/internal/x;->m(Lkotlinx/serialization/json/internal/x;Ljava/lang/String;ILjava/lang/String;I)V

    .line 195
    .line 196
    .line 197
    throw v5
.end method


# virtual methods
.method public final b()Ln7/j;
    .locals 9

    .line 1
    iget-object v0, p0, Lkotlinx/serialization/json/internal/q;->a:Lkotlinx/serialization/json/internal/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/x;->q()B

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x1

    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v2}, Lkotlinx/serialization/json/internal/q;->d(Z)Ln7/y;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :cond_0
    const/4 v3, 0x0

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, v3}, Lkotlinx/serialization/json/internal/q;->d(Z)Ln7/y;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0

    .line 23
    :cond_1
    const/4 v4, 0x6

    .line 24
    const/4 v5, 0x0

    .line 25
    if-ne v1, v4, :cond_c

    .line 26
    .line 27
    iget v1, p0, Lkotlinx/serialization/json/internal/q;->b:I

    .line 28
    .line 29
    add-int/2addr v1, v2

    .line 30
    iput v1, p0, Lkotlinx/serialization/json/internal/q;->b:I

    .line 31
    .line 32
    const/16 v2, 0xc8

    .line 33
    .line 34
    if-ne v1, v2, :cond_5

    .line 35
    .line 36
    new-instance v0, Lkotlinx/serialization/json/internal/JsonTreeReader$readDeepRecursive$1;

    .line 37
    .line 38
    invoke-direct {v0, p0, v5}, Lkotlinx/serialization/json/internal/JsonTreeReader$readDeepRecursive$1;-><init>(Lkotlinx/serialization/json/internal/q;Lh6/c;)V

    .line 39
    .line 40
    .line 41
    sget-object v1, Ld6/a;->a:Ljava/lang/Object;

    .line 42
    .line 43
    new-instance v1, Ld6/c;

    .line 44
    .line 45
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object v0, v1, Ld6/c;->a:Lr6/f;

    .line 49
    .line 50
    iput-object v1, v1, Ld6/c;->b:Lh6/c;

    .line 51
    .line 52
    sget-object v2, Ld6/a;->a:Ljava/lang/Object;

    .line 53
    .line 54
    iput-object v2, v1, Ld6/c;->c:Ljava/lang/Object;

    .line 55
    .line 56
    :cond_2
    :goto_0
    iget-object v0, v1, Ld6/c;->c:Ljava/lang/Object;

    .line 57
    .line 58
    iget-object v3, v1, Ld6/c;->b:Lh6/c;

    .line 59
    .line 60
    if-nez v3, :cond_3

    .line 61
    .line 62
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    check-cast v0, Ln7/j;

    .line 66
    .line 67
    goto/16 :goto_3

    .line 68
    .line 69
    :cond_3
    invoke-static {v2, v0}, Lkotlin/Result;->equals-impl0(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-eqz v4, :cond_4

    .line 74
    .line 75
    :try_start_0
    iget-object v0, v1, Ld6/c;->a:Lr6/f;

    .line 76
    .line 77
    sget-object v4, Ld6/s;->a:Ld6/s;

    .line 78
    .line 79
    const/4 v5, 0x3

    .line 80
    invoke-static {v5, v0}, Lkotlin/jvm/internal/p;->c(ILjava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    invoke-interface {v0, v1, v4, v3}, Lr6/f;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    sget-object v4, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 88
    .line 89
    if-eq v0, v4, :cond_2

    .line 90
    .line 91
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-interface {v3, v0}, Lh6/c;->resumeWith(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :catchall_0
    move-exception v0

    .line 100
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-interface {v3, v0}, Lh6/c;->resumeWith(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_4
    iput-object v2, v1, Ld6/c;->c:Ljava/lang/Object;

    .line 113
    .line 114
    invoke-interface {v3, v0}, Lh6/c;->resumeWith(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_5
    invoke-virtual {v0, v4}, Lkotlinx/serialization/json/internal/x;->f(B)B

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/x;->q()B

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    const/4 v6, 0x4

    .line 127
    if-eq v2, v6, :cond_b

    .line 128
    .line 129
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 130
    .line 131
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 132
    .line 133
    .line 134
    :cond_6
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/x;->b()Z

    .line 135
    .line 136
    .line 137
    move-result v7

    .line 138
    const/4 v8, 0x7

    .line 139
    if-eqz v7, :cond_8

    .line 140
    .line 141
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/x;->i()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    const/4 v7, 0x5

    .line 146
    invoke-virtual {v0, v7}, Lkotlinx/serialization/json/internal/x;->f(B)B

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0}, Lkotlinx/serialization/json/internal/q;->b()Ln7/j;

    .line 150
    .line 151
    .line 152
    move-result-object v7

    .line 153
    invoke-interface {v2, v1, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/x;->e()B

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    if-eq v1, v6, :cond_6

    .line 161
    .line 162
    if-ne v1, v8, :cond_7

    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_7
    const-string v1, "Expected end of the object or comma"

    .line 166
    .line 167
    invoke-static {v0, v1, v3, v5, v4}, Lkotlinx/serialization/json/internal/x;->m(Lkotlinx/serialization/json/internal/x;Ljava/lang/String;ILjava/lang/String;I)V

    .line 168
    .line 169
    .line 170
    throw v5

    .line 171
    :cond_8
    :goto_1
    if-ne v1, v4, :cond_9

    .line 172
    .line 173
    invoke-virtual {v0, v8}, Lkotlinx/serialization/json/internal/x;->f(B)B

    .line 174
    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_9
    if-eq v1, v6, :cond_a

    .line 178
    .line 179
    :goto_2
    new-instance v0, Ln7/u;

    .line 180
    .line 181
    invoke-direct {v0, v2}, Ln7/u;-><init>(Ljava/util/Map;)V

    .line 182
    .line 183
    .line 184
    :goto_3
    iget v1, p0, Lkotlinx/serialization/json/internal/q;->b:I

    .line 185
    .line 186
    add-int/lit8 v1, v1, -0x1

    .line 187
    .line 188
    iput v1, p0, Lkotlinx/serialization/json/internal/q;->b:I

    .line 189
    .line 190
    return-object v0

    .line 191
    :cond_a
    const-string v1, "object"

    .line 192
    .line 193
    invoke-static {v0, v1}, Lkotlinx/serialization/json/internal/j;->m(Lkotlinx/serialization/json/internal/x;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    throw v5

    .line 197
    :cond_b
    const-string v1, "Unexpected leading comma"

    .line 198
    .line 199
    invoke-static {v0, v1, v3, v5, v4}, Lkotlinx/serialization/json/internal/x;->m(Lkotlinx/serialization/json/internal/x;Ljava/lang/String;ILjava/lang/String;I)V

    .line 200
    .line 201
    .line 202
    throw v5

    .line 203
    :cond_c
    const/16 v2, 0x8

    .line 204
    .line 205
    if-ne v1, v2, :cond_d

    .line 206
    .line 207
    invoke-virtual {p0}, Lkotlinx/serialization/json/internal/q;->c()Ln7/d;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    return-object v0

    .line 212
    :cond_d
    invoke-static {v1}, Lkotlinx/serialization/json/internal/j;->s(B)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    const-string v2, "Cannot read Json element because of unexpected "

    .line 217
    .line 218
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    invoke-static {v0, v1, v3, v5, v4}, Lkotlinx/serialization/json/internal/x;->m(Lkotlinx/serialization/json/internal/x;Ljava/lang/String;ILjava/lang/String;I)V

    .line 223
    .line 224
    .line 225
    throw v5
.end method

.method public final c()Ln7/d;
    .locals 8

    .line 1
    iget-object v0, p0, Lkotlinx/serialization/json/internal/q;->a:Lkotlinx/serialization/json/internal/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/x;->e()B

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/x;->q()B

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x4

    .line 14
    if-eq v2, v5, :cond_6

    .line 15
    .line 16
    new-instance v2, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    :cond_0
    :goto_0
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/x;->b()Z

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    const/16 v7, 0x9

    .line 26
    .line 27
    if-eqz v6, :cond_3

    .line 28
    .line 29
    invoke-virtual {p0}, Lkotlinx/serialization/json/internal/q;->b()Ln7/j;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/x;->e()B

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eq v1, v5, :cond_0

    .line 41
    .line 42
    if-ne v1, v7, :cond_1

    .line 43
    .line 44
    const/4 v6, 0x1

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move v6, v3

    .line 47
    :goto_1
    iget v7, v0, Lkotlinx/serialization/json/internal/x;->b:I

    .line 48
    .line 49
    if-eqz v6, :cond_2

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    const-string v1, "Expected end of the array or comma"

    .line 53
    .line 54
    invoke-static {v0, v1, v7, v4, v5}, Lkotlinx/serialization/json/internal/x;->m(Lkotlinx/serialization/json/internal/x;Ljava/lang/String;ILjava/lang/String;I)V

    .line 55
    .line 56
    .line 57
    throw v4

    .line 58
    :cond_3
    const/16 v3, 0x8

    .line 59
    .line 60
    if-ne v1, v3, :cond_4

    .line 61
    .line 62
    invoke-virtual {v0, v7}, Lkotlinx/serialization/json/internal/x;->f(B)B

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_4
    if-eq v1, v5, :cond_5

    .line 67
    .line 68
    :goto_2
    new-instance v0, Ln7/d;

    .line 69
    .line 70
    invoke-direct {v0, v2}, Ln7/d;-><init>(Ljava/util/List;)V

    .line 71
    .line 72
    .line 73
    return-object v0

    .line 74
    :cond_5
    const-string v1, "array"

    .line 75
    .line 76
    invoke-static {v0, v1}, Lkotlinx/serialization/json/internal/j;->m(Lkotlinx/serialization/json/internal/x;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v4

    .line 80
    :cond_6
    const-string v1, "Unexpected leading comma"

    .line 81
    .line 82
    const/4 v2, 0x6

    .line 83
    invoke-static {v0, v1, v3, v4, v2}, Lkotlinx/serialization/json/internal/x;->m(Lkotlinx/serialization/json/internal/x;Ljava/lang/String;ILjava/lang/String;I)V

    .line 84
    .line 85
    .line 86
    throw v4
.end method

.method public final d(Z)Ln7/y;
    .locals 2

    .line 1
    iget-object v0, p0, Lkotlinx/serialization/json/internal/q;->a:Lkotlinx/serialization/json/internal/x;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/x;->j()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/x;->i()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :goto_0
    if-nez p1, :cond_1

    .line 15
    .line 16
    const-string v1, "null"

    .line 17
    .line 18
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    sget-object p1, Ln7/r;->INSTANCE:Ln7/r;

    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_1
    new-instance v1, Ln7/p;

    .line 28
    .line 29
    invoke-direct {v1, v0, p1}, Ln7/p;-><init>(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    return-object v1
.end method
