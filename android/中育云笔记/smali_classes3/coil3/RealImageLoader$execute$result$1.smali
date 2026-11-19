.class final Lcoil3/RealImageLoader$execute$result$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcoil3/RealImageLoader;->g(Lw/g;ILvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "coil3.RealImageLoader$execute$result$1"
    f = "RealImageLoader.kt"
    l = {
        0x8e
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lw/g;

.field public final synthetic e:Lcoil3/RealImageLoader;

.field public final synthetic f:Lx/e;

.field public final synthetic g:Lcoil3/b;

.field public final synthetic h:Lk/j;


# direct methods
.method public constructor <init>(Lw/g;Lcoil3/RealImageLoader;Lx/e;Lcoil3/b;Lk/j;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcoil3/RealImageLoader$execute$result$1;->d:Lw/g;

    .line 2
    .line 3
    iput-object p2, p0, Lcoil3/RealImageLoader$execute$result$1;->e:Lcoil3/RealImageLoader;

    .line 4
    .line 5
    iput-object p3, p0, Lcoil3/RealImageLoader$execute$result$1;->f:Lx/e;

    .line 6
    .line 7
    iput-object p4, p0, Lcoil3/RealImageLoader$execute$result$1;->g:Lcoil3/b;

    .line 8
    .line 9
    iput-object p5, p0, Lcoil3/RealImageLoader$execute$result$1;->h:Lk/j;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 7

    .line 1
    new-instance v0, Lcoil3/RealImageLoader$execute$result$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcoil3/RealImageLoader$execute$result$1;->d:Lw/g;

    .line 4
    .line 5
    iget-object v2, p0, Lcoil3/RealImageLoader$execute$result$1;->e:Lcoil3/RealImageLoader;

    .line 6
    .line 7
    iget-object v3, p0, Lcoil3/RealImageLoader$execute$result$1;->f:Lx/e;

    .line 8
    .line 9
    iget-object v4, p0, Lcoil3/RealImageLoader$execute$result$1;->g:Lcoil3/b;

    .line 10
    .line 11
    iget-object v5, p0, Lcoil3/RealImageLoader$execute$result$1;->h:Lk/j;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Lcoil3/RealImageLoader$execute$result$1;-><init>(Lw/g;Lcoil3/RealImageLoader;Lx/e;Lcoil3/b;Lk/j;Lvc/c;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcoil3/RealImageLoader$execute$result$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcoil3/RealImageLoader$execute$result$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcoil3/RealImageLoader$execute$result$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcoil3/RealImageLoader$execute$result$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcoil3/RealImageLoader$execute$result$1;->c:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    new-instance v3, Lcoil3/intercept/RealInterceptorChain;

    .line 28
    .line 29
    iget-object v4, p0, Lcoil3/RealImageLoader$execute$result$1;->d:Lw/g;

    .line 30
    .line 31
    iget-object p1, p0, Lcoil3/RealImageLoader$execute$result$1;->e:Lcoil3/RealImageLoader;

    .line 32
    .line 33
    invoke-virtual {p1}, Lcoil3/RealImageLoader;->d()Lcoil3/a;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, Lcoil3/a;->g()Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    iget-object v7, p0, Lcoil3/RealImageLoader$execute$result$1;->d:Lw/g;

    .line 42
    .line 43
    iget-object v8, p0, Lcoil3/RealImageLoader$execute$result$1;->f:Lx/e;

    .line 44
    .line 45
    iget-object v9, p0, Lcoil3/RealImageLoader$execute$result$1;->g:Lcoil3/b;

    .line 46
    .line 47
    iget-object p1, p0, Lcoil3/RealImageLoader$execute$result$1;->h:Lk/j;

    .line 48
    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    move v10, v2

    .line 52
    goto :goto_0

    .line 53
    :cond_2
    const/4 p1, 0x0

    .line 54
    move v10, p1

    .line 55
    :goto_0
    const/4 v6, 0x0

    .line 56
    invoke-direct/range {v3 .. v10}, Lcoil3/intercept/RealInterceptorChain;-><init>(Lw/g;Ljava/util/List;ILw/g;Lx/e;Lcoil3/b;Z)V

    .line 57
    .line 58
    .line 59
    iput v2, p0, Lcoil3/RealImageLoader$execute$result$1;->c:I

    .line 60
    .line 61
    invoke-virtual {v3, p0}, Lcoil3/intercept/RealInterceptorChain;->g(Lvc/c;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-ne p1, v0, :cond_3

    .line 66
    .line 67
    return-object v0

    .line 68
    :cond_3
    return-object p1
.end method
