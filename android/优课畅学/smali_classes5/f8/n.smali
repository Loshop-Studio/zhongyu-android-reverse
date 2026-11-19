.class public abstract Lf8/n;
.super Lf8/k;
.source "SourceFile"


# direct methods
.method public static synthetic c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, Lf8/n;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lx7/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lf8/n;->j(Lx7/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static e(Ljava/util/Iterator;)Lf8/g;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lf8/n$a;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lf8/n$a;-><init>(Ljava/util/Iterator;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lf8/n;->f(Lf8/g;)Lf8/g;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static final f(Lf8/g;)Lf8/g;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p0, Lf8/a;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    new-instance v0, Lf8/a;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lf8/a;-><init>(Lf8/g;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public static g()Lf8/g;
    .locals 1

    .line 1
    sget-object v0, Lf8/d;->a:Lf8/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public static h(Ljava/lang/Object;Lx7/l;)Lf8/g;
    .locals 2

    .line 1
    const-string v0, "nextFunction"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    sget-object p0, Lf8/d;->a:Lf8/d;

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    new-instance v0, Lf8/f;

    .line 12
    .line 13
    new-instance v1, Lf8/l;

    .line 14
    .line 15
    invoke-direct {v1, p0}, Lf8/l;-><init>(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, p1}, Lf8/f;-><init>(Lx7/a;Lx7/l;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public static i(Lx7/a;)Lf8/g;
    .locals 2

    .line 1
    const-string v0, "nextFunction"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lf8/f;

    .line 7
    .line 8
    new-instance v1, Lf8/m;

    .line 9
    .line 10
    invoke-direct {v1, p0}, Lf8/m;-><init>(Lx7/a;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, p0, v1}, Lf8/f;-><init>(Lx7/a;Lx7/l;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lf8/n;->f(Lf8/g;)Lf8/g;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public static final j(Lx7/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Lx7/a;->invoke()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    return-object p0
.end method

.method public static varargs l([Ljava/lang/Object;)Lf8/g;
    .locals 1

    .line 1
    const-string v0, "elements"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Li7/r;->j0([Ljava/lang/Object;)Lf8/g;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method
