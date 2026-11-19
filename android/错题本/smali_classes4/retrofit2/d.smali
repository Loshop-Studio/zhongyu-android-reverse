.class public final Lretrofit2/d;
.super Lretrofit2/b;
.source "SourceFile"


# virtual methods
.method public final a(Ljava/util/concurrent/Executor;)Ljava/util/List;
    .locals 4

    .line 1
    new-instance v0, Lc8/e;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lc8/e;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v2, Lretrofit2/o;

    .line 8
    .line 9
    invoke-direct {v2, p1}, Lretrofit2/o;-><init>(Ljava/util/concurrent/Executor;)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x2

    .line 13
    new-array p1, p1, [Lretrofit2/f;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    aput-object v0, p1, v3

    .line 17
    .line 18
    aput-object v2, p1, v1

    .line 19
    .line 20
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1
.end method

.method public final b()Ljava/util/List;
    .locals 2

    .line 1
    new-instance v0, Lretrofit2/c;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lretrofit2/c;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
