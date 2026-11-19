.class public abstract Lcoil3/network/okhttp/internal/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lokhttp3/i0;)Lcoil3/network/m;
    .locals 10

    .line 1
    iget v1, p0, Lokhttp3/i0;->d:I

    .line 2
    .line 3
    iget-wide v2, p0, Lokhttp3/i0;->k:J

    .line 4
    .line 5
    iget-wide v4, p0, Lokhttp3/i0;->l:J

    .line 6
    .line 7
    iget-object v0, p0, Lokhttp3/i0;->f:Lokhttp3/q;

    .line 8
    .line 9
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lokhttp3/q;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :goto_0
    move-object v7, v0

    .line 19
    check-cast v7, Ld6/j;

    .line 20
    .line 21
    invoke-virtual {v7}, Ld6/j;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v8

    .line 25
    if-eqz v8, :cond_1

    .line 26
    .line 27
    invoke-virtual {v7}, Ld6/j;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    check-cast v7, Lkotlin/Pair;

    .line 32
    .line 33
    invoke-virtual {v7}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    check-cast v8, Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v7}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    check-cast v7, Ljava/lang/String;

    .line 44
    .line 45
    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 46
    .line 47
    invoke-virtual {v8, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v8

    .line 51
    const-string/jumbo v9, "toLowerCase(...)"

    .line 52
    .line 53
    .line 54
    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v6, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    if-nez v9, :cond_0

    .line 62
    .line 63
    new-instance v9, Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-interface {v6, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    :cond_0
    check-cast v9, Ljava/util/List;

    .line 72
    .line 73
    invoke-interface {v9, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    new-instance v0, Lcoil3/network/k;

    .line 78
    .line 79
    invoke-static {v6}, Lkotlin/collections/e0;->J(Ljava/util/Map;)Ljava/util/Map;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    invoke-direct {v0, v6}, Lcoil3/network/k;-><init>(Ljava/util/Map;)V

    .line 84
    .line 85
    .line 86
    iget-object v6, p0, Lokhttp3/i0;->g:Lokhttp3/m0;

    .line 87
    .line 88
    if-eqz v6, :cond_2

    .line 89
    .line 90
    invoke-virtual {v6}, Lokhttp3/m0;->source()Lokio/BufferedSource;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    if-eqz v6, :cond_2

    .line 95
    .line 96
    new-instance v7, Lcoil3/network/n;

    .line 97
    .line 98
    invoke-direct {v7, v6}, Lcoil3/network/n;-><init>(Lokio/BufferedSource;)V

    .line 99
    .line 100
    .line 101
    :goto_1
    move-object v6, v0

    .line 102
    goto :goto_2

    .line 103
    :cond_2
    const/4 v7, 0x0

    .line 104
    goto :goto_1

    .line 105
    :goto_2
    new-instance v0, Lcoil3/network/m;

    .line 106
    .line 107
    move-object v8, p0

    .line 108
    invoke-direct/range {v0 .. v8}, Lcoil3/network/m;-><init>(IJJLcoil3/network/k;Lcoil3/network/n;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    return-object v0
.end method

.method public static final b(Lcoil3/network/l;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Lokhttp3/c0;
    .locals 6

    .line 1
    instance-of v0, p1, Lcoil3/network/okhttp/internal/UtilsKt$toRequest$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcoil3/network/okhttp/internal/UtilsKt$toRequest$1;

    .line 7
    .line 8
    iget v1, v0, Lcoil3/network/okhttp/internal/UtilsKt$toRequest$1;->label:I

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
    iput v1, v0, Lcoil3/network/okhttp/internal/UtilsKt$toRequest$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcoil3/network/okhttp/internal/UtilsKt$toRequest$1;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Lcoil3/network/okhttp/internal/UtilsKt$toRequest$1;-><init>(Lh6/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcoil3/network/okhttp/internal/UtilsKt$toRequest$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v1, v0, Lcoil3/network/okhttp/internal/UtilsKt$toRequest$1;->label:I

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    const/4 p0, 0x1

    .line 35
    if-ne v1, p0, :cond_2

    .line 36
    .line 37
    iget-object v1, v0, Lcoil3/network/okhttp/internal/UtilsKt$toRequest$1;->L$3:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Ljava/lang/String;

    .line 40
    .line 41
    iget-object v3, v0, Lcoil3/network/okhttp/internal/UtilsKt$toRequest$1;->L$2:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v3, Lokhttp3/b0;

    .line 44
    .line 45
    iget-object v4, v0, Lcoil3/network/okhttp/internal/UtilsKt$toRequest$1;->L$1:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v4, Lokhttp3/b0;

    .line 48
    .line 49
    iget-object v0, v0, Lcoil3/network/okhttp/internal/UtilsKt$toRequest$1;->L$0:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, Lcoil3/network/l;

    .line 52
    .line 53
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    check-cast p1, Lokio/ByteString;

    .line 57
    .line 58
    if-eqz p1, :cond_1

    .line 59
    .line 60
    sget-object v5, Lokhttp3/g0;->Companion:Lokhttp3/f0;

    .line 61
    .line 62
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    new-instance v5, Lokhttp3/d0;

    .line 66
    .line 67
    invoke-direct {v5, v2, p1, p0}, Lokhttp3/d0;-><init>(Lokhttp3/u;Ljava/lang/Object;I)V

    .line 68
    .line 69
    .line 70
    move-object v2, v5

    .line 71
    goto :goto_2

    .line 72
    :cond_1
    move-object p0, v0

    .line 73
    goto :goto_1

    .line 74
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 75
    .line 76
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 77
    .line 78
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw p0

    .line 82
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    new-instance v3, Lokhttp3/b0;

    .line 86
    .line 87
    invoke-direct {v3}, Lokhttp3/b0;-><init>()V

    .line 88
    .line 89
    .line 90
    iget-object p1, p0, Lcoil3/network/l;->a:Ljava/lang/String;

    .line 91
    .line 92
    invoke-virtual {v3, p1}, Lokhttp3/b0;->f(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    iget-object v1, p0, Lcoil3/network/l;->b:Ljava/lang/String;

    .line 96
    .line 97
    move-object v4, v3

    .line 98
    :goto_1
    move-object v0, p0

    .line 99
    :goto_2
    invoke-virtual {v3, v1, v2}, Lokhttp3/b0;->d(Ljava/lang/String;Lokhttp3/g0;)V

    .line 100
    .line 101
    .line 102
    iget-object p0, v0, Lcoil3/network/l;->c:Lcoil3/network/k;

    .line 103
    .line 104
    new-instance p1, Lkotlin/jvm/internal/o;

    .line 105
    .line 106
    const/4 v0, 0x2

    .line 107
    const/4 v1, 0x0

    .line 108
    invoke-direct {p1, v0, v1}, Lkotlin/jvm/internal/o;-><init>(IZ)V

    .line 109
    .line 110
    .line 111
    iget-object p0, p0, Lcoil3/network/k;->a:Ljava/util/Map;

    .line 112
    .line 113
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-eqz v0, :cond_5

    .line 126
    .line 127
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    check-cast v0, Ljava/util/Map$Entry;

    .line 132
    .line 133
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    check-cast v1, Ljava/lang/String;

    .line 138
    .line 139
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    check-cast v0, Ljava/util/List;

    .line 144
    .line 145
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    if-eqz v2, :cond_4

    .line 154
    .line 155
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    check-cast v2, Ljava/lang/String;

    .line 160
    .line 161
    invoke-virtual {p1, v1, v2}, Lkotlin/jvm/internal/o;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_5
    invoke-virtual {p1}, Lkotlin/jvm/internal/o;->f()Lokhttp3/q;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0}, Lokhttp3/q;->c()Lkotlin/jvm/internal/o;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    iput-object p0, v4, Lokhttp3/b0;->c:Lkotlin/jvm/internal/o;

    .line 177
    .line 178
    invoke-virtual {v4}, Lokhttp3/b0;->b()Lokhttp3/c0;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    return-object p0
.end method
