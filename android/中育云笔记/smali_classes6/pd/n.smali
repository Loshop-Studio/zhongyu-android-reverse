.class public abstract Lpd/n;
.super Lpd/k;
.source "SourceFile"


# direct methods
.method public static synthetic c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, Lpd/n;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lhd/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lpd/n;->j(Lhd/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static e(Ljava/util/Iterator;)Lpd/g;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lpd/n$a;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lpd/n$a;-><init>(Ljava/util/Iterator;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lpd/n;->f(Lpd/g;)Lpd/g;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static final f(Lpd/g;)Lpd/g;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p0, Lpd/a;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    new-instance v0, Lpd/a;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lpd/a;-><init>(Lpd/g;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public static g()Lpd/g;
    .locals 1

    .line 1
    sget-object v0, Lpd/d;->a:Lpd/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public static h(Lhd/a;)Lpd/g;
    .locals 2

    .line 1
    const-string v0, "nextFunction"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lpd/f;

    .line 7
    .line 8
    new-instance v1, Lpd/m;

    .line 9
    .line 10
    invoke-direct {v1, p0}, Lpd/m;-><init>(Lhd/a;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, p0, v1}, Lpd/f;-><init>(Lhd/a;Lhd/l;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lpd/n;->f(Lpd/g;)Lpd/g;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public static i(Ljava/lang/Object;Lhd/l;)Lpd/g;
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
    sget-object p0, Lpd/d;->a:Lpd/d;

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    new-instance v0, Lpd/f;

    .line 12
    .line 13
    new-instance v1, Lpd/l;

    .line 14
    .line 15
    invoke-direct {v1, p0}, Lpd/l;-><init>(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, p1}, Lpd/f;-><init>(Lhd/a;Lhd/l;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public static final j(Lhd/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Lhd/a;->invoke()Ljava/lang/Object;

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

.method public static varargs l([Ljava/lang/Object;)Lpd/g;
    .locals 1

    .line 1
    const-string v0, "elements"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lrc/r;->i0([Ljava/lang/Object;)Lpd/g;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method
