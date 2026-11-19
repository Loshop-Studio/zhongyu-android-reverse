.class public abstract Lkotlinx/coroutines/flow/internal/FlowCoroutineKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lx7/p;Lm7/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lm8/g;

    .line 2
    .line 3
    invoke-interface {p1}, Lm7/c;->getContext()Lkotlin/coroutines/d;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1, p1}, Lm8/g;-><init>(Lkotlin/coroutines/d;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v0, p0}, Lo8/b;->b(Ln8/z;Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-ne p0, v0, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, Lo7/f;->c(Lm7/c;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-object p0
.end method

.method public static final b(Lx7/q;)Ll8/c;
    .locals 1

    .line 1
    new-instance v0, Lkotlinx/coroutines/flow/internal/FlowCoroutineKt$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lkotlinx/coroutines/flow/internal/FlowCoroutineKt$a;-><init>(Lx7/q;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
