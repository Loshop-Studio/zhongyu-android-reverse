.class public abstract Lcoil3/network/okhttp/internal/UtilsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Ll8/y;)Lu/l;
    .locals 0

    .line 1
    invoke-static {p0}, Lcoil3/network/okhttp/internal/UtilsKt;->e(Ll8/y;)Lu/l;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic b(Lu/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcoil3/network/okhttp/internal/UtilsKt;->f(Lu/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final c(Lcoil3/network/c;)Ll8/q;
    .locals 4

    .line 1
    new-instance v0, Ll8/q$a;

    .line 2
    .line 3
    invoke-direct {v0}, Ll8/q$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcoil3/network/c;->b()Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/util/Map$Entry;

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Ljava/lang/String;

    .line 35
    .line 36
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Ljava/util/List;

    .line 41
    .line 42
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_0

    .line 51
    .line 52
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    check-cast v3, Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v0, v2, v3}, Ll8/q$a;->e(Ljava/lang/String;Ljava/lang/String;)Ll8/q$a;

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    invoke-virtual {v0}, Ll8/q$a;->f()Ll8/q;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0
.end method

.method public static final d(Ll8/q;)Lcoil3/network/c;
    .locals 3

    .line 1
    new-instance v0, Lcoil3/network/c$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lcoil3/network/c$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ll8/q;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lkotlin/Pair;

    .line 21
    .line 22
    invoke-virtual {v1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v0, v2, v1}, Lcoil3/network/c$a;->a(Ljava/lang/String;Ljava/lang/String;)Lcoil3/network/c$a;

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {v0}, Lcoil3/network/c$a;->b()Lcoil3/network/c;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method

.method public static final e(Ll8/y;)Lu/l;
    .locals 9

    .line 1
    invoke-virtual {p0}, Ll8/y;->i()I

    .line 2
    .line 3
    .line 4
    move-result v1

    .line 5
    invoke-virtual {p0}, Ll8/y;->x()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    invoke-virtual {p0}, Ll8/y;->v()J

    .line 10
    .line 11
    .line 12
    move-result-wide v4

    .line 13
    invoke-virtual {p0}, Ll8/y;->o()Ll8/q;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lcoil3/network/okhttp/internal/UtilsKt;->d(Ll8/q;)Lcoil3/network/c;

    .line 18
    .line 19
    .line 20
    move-result-object v6

    .line 21
    invoke-virtual {p0}, Ll8/y;->a()Ll8/z;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0}, Ll8/z;->source()Lokio/BufferedSource;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-static {v0}, Lu/g;->a(Lokio/BufferedSource;)Lu/m;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :goto_0
    move-object v7, v0

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    const/4 v0, 0x0

    .line 40
    goto :goto_0

    .line 41
    :goto_1
    new-instance v0, Lu/l;

    .line 42
    .line 43
    move-object v8, p0

    .line 44
    invoke-direct/range {v0 .. v8}, Lu/l;-><init>(IJJLcoil3/network/c;Lu/m;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-object v0
.end method

.method public static final f(Lu/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    iget v1, v0, Lcoil3/network/okhttp/internal/UtilsKt$toRequest$1;->f:I

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
    iput v1, v0, Lcoil3/network/okhttp/internal/UtilsKt$toRequest$1;->f:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcoil3/network/okhttp/internal/UtilsKt$toRequest$1;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Lcoil3/network/okhttp/internal/UtilsKt$toRequest$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcoil3/network/okhttp/internal/UtilsKt$toRequest$1;->e:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    iget v1, v0, Lcoil3/network/okhttp/internal/UtilsKt$toRequest$1;->f:I

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    const/4 p0, 0x1

    .line 36
    if-ne v1, p0, :cond_2

    .line 37
    .line 38
    iget-object v1, v0, Lcoil3/network/okhttp/internal/UtilsKt$toRequest$1;->d:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Ljava/lang/String;

    .line 41
    .line 42
    iget-object v3, v0, Lcoil3/network/okhttp/internal/UtilsKt$toRequest$1;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v3, Ll8/w$a;

    .line 45
    .line 46
    iget-object v4, v0, Lcoil3/network/okhttp/internal/UtilsKt$toRequest$1;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v4, Ll8/w$a;

    .line 49
    .line 50
    iget-object v0, v0, Lcoil3/network/okhttp/internal/UtilsKt$toRequest$1;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Lu/j;

    .line 53
    .line 54
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    check-cast p1, Lokio/ByteString;

    .line 58
    .line 59
    if-eqz p1, :cond_1

    .line 60
    .line 61
    sget-object v5, Ll8/x;->Companion:Ll8/x$a;

    .line 62
    .line 63
    invoke-static {v5, p1, v2, p0, v2}, Ll8/x$a;->o(Ll8/x$a;Lokio/ByteString;Ll8/t;ILjava/lang/Object;)Ll8/x;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    goto :goto_2

    .line 68
    :cond_1
    move-object p0, v0

    .line 69
    goto :goto_1

    .line 70
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 71
    .line 72
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 73
    .line 74
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw p0

    .line 78
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    new-instance v3, Ll8/w$a;

    .line 82
    .line 83
    invoke-direct {v3}, Ll8/w$a;-><init>()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Lu/j;->d()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {v3, p1}, Ll8/w$a;->n(Ljava/lang/String;)Ll8/w$a;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Lu/j;->c()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {p0}, Lu/j;->a()Lu/k;

    .line 98
    .line 99
    .line 100
    move-object v4, v3

    .line 101
    :goto_1
    move-object v0, p0

    .line 102
    :goto_2
    invoke-virtual {v3, v1, v2}, Ll8/w$a;->j(Ljava/lang/String;Ll8/x;)Ll8/w$a;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Lu/j;->b()Lcoil3/network/c;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-static {p0}, Lcoil3/network/okhttp/internal/UtilsKt;->c(Lcoil3/network/c;)Ll8/q;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-virtual {v4, p0}, Ll8/w$a;->i(Ll8/q;)Ll8/w$a;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v4}, Ll8/w$a;->b()Ll8/w;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    return-object p0
.end method
