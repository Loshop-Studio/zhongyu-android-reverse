.class public final Le7/l;
.super Lkotlinx/coroutines/r;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/c0;


# instance fields
.field public final synthetic a:Lkotlinx/coroutines/c0;

.field public final b:Lkotlinx/coroutines/r;

.field public final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/r;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lkotlinx/coroutines/r;-><init>()V

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Lkotlinx/coroutines/c0;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p1

    .line 9
    check-cast v0, Lkotlinx/coroutines/c0;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-nez v0, :cond_1

    .line 14
    .line 15
    sget-object v0, Lkotlinx/coroutines/z;->a:Lkotlinx/coroutines/c0;

    .line 16
    .line 17
    :cond_1
    iput-object v0, p0, Le7/l;->a:Lkotlinx/coroutines/c0;

    .line 18
    .line 19
    iput-object p1, p0, Le7/l;->b:Lkotlinx/coroutines/r;

    .line 20
    .line 21
    iput-object p2, p0, Le7/l;->c:Ljava/lang/String;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a(JLkotlinx/coroutines/q1;Lh6/h;)Lkotlinx/coroutines/g0;
    .locals 1

    .line 1
    iget-object v0, p0, Le7/l;->a:Lkotlinx/coroutines/c0;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3, p4}, Lkotlinx/coroutines/c0;->a(JLkotlinx/coroutines/q1;Lh6/h;)Lkotlinx/coroutines/g0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final b(JLkotlinx/coroutines/g;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le7/l;->a:Lkotlinx/coroutines/c0;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Lkotlinx/coroutines/c0;->b(JLkotlinx/coroutines/g;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final dispatch(Lh6/h;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le7/l;->b:Lkotlinx/coroutines/r;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lkotlinx/coroutines/r;->dispatch(Lh6/h;Ljava/lang/Runnable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final dispatchYield(Lh6/h;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le7/l;->b:Lkotlinx/coroutines/r;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lkotlinx/coroutines/r;->dispatchYield(Lh6/h;Ljava/lang/Runnable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final isDispatchNeeded(Lh6/h;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Le7/l;->b:Lkotlinx/coroutines/r;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lkotlinx/coroutines/r;->isDispatchNeeded(Lh6/h;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le7/l;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
