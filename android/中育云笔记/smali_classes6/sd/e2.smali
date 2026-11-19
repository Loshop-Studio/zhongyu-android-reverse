.class public abstract Lsd/e2;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lkotlinx/coroutines/g;)Lsd/v;
    .locals 1

    .line 1
    new-instance v0, Lsd/d2;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lsd/d2;-><init>(Lkotlinx/coroutines/g;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic b(Lkotlinx/coroutines/g;ILjava/lang/Object;)Lsd/v;
    .locals 0

    .line 1
    and-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    :cond_0
    invoke-static {p0}, Lsd/e2;->a(Lkotlinx/coroutines/g;)Lsd/v;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final c(Lhd/p;Lvc/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lsd/c2;

    .line 2
    .line 3
    invoke-interface {p1}, Lvc/c;->getContext()Lkotlin/coroutines/d;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1, p1}, Lsd/c2;-><init>(Lkotlin/coroutines/d;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v0, p0}, Lyd/b;->d(Lxd/y;Ljava/lang/Object;Lhd/p;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-ne p0, v0, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, Lxc/f;->c(Lvc/c;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-object p0
.end method
