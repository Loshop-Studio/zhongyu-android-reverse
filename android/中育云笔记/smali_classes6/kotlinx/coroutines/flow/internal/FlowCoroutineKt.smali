.class public abstract Lkotlinx/coroutines/flow/internal/FlowCoroutineKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lhd/p;Lvc/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lwd/g;

    .line 2
    .line 3
    invoke-interface {p1}, Lvc/c;->getContext()Lkotlin/coroutines/d;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1, p1}, Lwd/g;-><init>(Lkotlin/coroutines/d;Lvc/c;)V

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

.method public static final b(Lhd/q;)Lvd/c;
    .locals 1

    .line 1
    new-instance v0, Lkotlinx/coroutines/flow/internal/FlowCoroutineKt$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lkotlinx/coroutines/flow/internal/FlowCoroutineKt$a;-><init>(Lhd/q;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
