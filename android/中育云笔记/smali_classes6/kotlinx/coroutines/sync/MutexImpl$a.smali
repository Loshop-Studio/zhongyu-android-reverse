.class public final Lkotlinx/coroutines/sync/MutexImpl$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsd/j;
.implements Lsd/n2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlinx/coroutines/sync/MutexImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final c:Lkotlinx/coroutines/c;

.field public final d:Ljava/lang/Object;

.field public final synthetic e:Lkotlinx/coroutines/sync/MutexImpl;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/sync/MutexImpl;Lkotlinx/coroutines/c;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lkotlinx/coroutines/sync/MutexImpl$a;->e:Lkotlinx/coroutines/sync/MutexImpl;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lkotlinx/coroutines/sync/MutexImpl$a;->c:Lkotlinx/coroutines/c;

    .line 7
    .line 8
    iput-object p3, p0, Lkotlinx/coroutines/sync/MutexImpl$a;->d:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method

.method public static synthetic a(Lkotlinx/coroutines/sync/MutexImpl;Lkotlinx/coroutines/sync/MutexImpl$a;Ljava/lang/Throwable;Lqc/q;Lkotlin/coroutines/d;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lkotlinx/coroutines/sync/MutexImpl$a;->j(Lkotlinx/coroutines/sync/MutexImpl;Lkotlinx/coroutines/sync/MutexImpl$a;Ljava/lang/Throwable;Lqc/q;Lkotlin/coroutines/d;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlinx/coroutines/sync/MutexImpl;Lkotlinx/coroutines/sync/MutexImpl$a;Ljava/lang/Throwable;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lkotlinx/coroutines/sync/MutexImpl$a;->g(Lkotlinx/coroutines/sync/MutexImpl;Lkotlinx/coroutines/sync/MutexImpl$a;Ljava/lang/Throwable;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lkotlinx/coroutines/sync/MutexImpl;Lkotlinx/coroutines/sync/MutexImpl$a;Ljava/lang/Throwable;)Lqc/q;
    .locals 0

    .line 1
    iget-object p1, p1, Lkotlinx/coroutines/sync/MutexImpl$a;->d:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/sync/MutexImpl;->unlock(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 7
    .line 8
    return-object p0
.end method

.method public static final j(Lkotlinx/coroutines/sync/MutexImpl;Lkotlinx/coroutines/sync/MutexImpl$a;Ljava/lang/Throwable;Lqc/q;Lkotlin/coroutines/d;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {}, Lkotlinx/coroutines/sync/MutexImpl;->v()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget-object p3, p1, Lkotlinx/coroutines/sync/MutexImpl$a;->d:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {p2, p0, p3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p1, Lkotlinx/coroutines/sync/MutexImpl$a;->d:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/sync/MutexImpl;->unlock(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 16
    .line 17
    return-object p0
.end method


# virtual methods
.method public bridge synthetic C(Lsd/e0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lqc/q;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/sync/MutexImpl$a;->h(Lsd/e0;Lqc/q;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public D(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/sync/MutexImpl$a;->c:Lkotlinx/coroutines/c;

    invoke-virtual {v0, p1}, Lkotlinx/coroutines/c;->D(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;Lhd/l;)V
    .locals 0

    .line 1
    check-cast p1, Lqc/q;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/sync/MutexImpl$a;->d(Lqc/q;Lhd/l;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d(Lqc/q;Lhd/l;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/sync/MutexImpl$a;->c:Lkotlinx/coroutines/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lkotlinx/coroutines/c;->c(Ljava/lang/Object;Lhd/l;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public e(Lqc/q;Lhd/q;)V
    .locals 2

    .line 1
    invoke-static {}, Lkotlinx/coroutines/sync/MutexImpl;->v()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget-object v0, p0, Lkotlinx/coroutines/sync/MutexImpl$a;->e:Lkotlinx/coroutines/sync/MutexImpl;

    .line 6
    .line 7
    iget-object v1, p0, Lkotlinx/coroutines/sync/MutexImpl$a;->d:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object p2, p0, Lkotlinx/coroutines/sync/MutexImpl$a;->c:Lkotlinx/coroutines/c;

    .line 13
    .line 14
    iget-object v0, p0, Lkotlinx/coroutines/sync/MutexImpl$a;->e:Lkotlinx/coroutines/sync/MutexImpl;

    .line 15
    .line 16
    new-instance v1, Lbe/e;

    .line 17
    .line 18
    invoke-direct {v1, v0, p0}, Lbe/e;-><init>(Lkotlinx/coroutines/sync/MutexImpl;Lkotlinx/coroutines/sync/MutexImpl$a;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2, p1, v1}, Lkotlinx/coroutines/c;->c(Ljava/lang/Object;Lhd/l;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public f(Lxd/z;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/sync/MutexImpl$a;->c:Lkotlinx/coroutines/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lkotlinx/coroutines/c;->f(Lxd/z;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public getContext()Lkotlin/coroutines/d;
    .locals 1

    iget-object v0, p0, Lkotlinx/coroutines/sync/MutexImpl$a;->c:Lkotlinx/coroutines/c;

    invoke-virtual {v0}, Lkotlinx/coroutines/c;->getContext()Lkotlin/coroutines/d;

    move-result-object v0

    return-object v0
.end method

.method public h(Lsd/e0;Lqc/q;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/sync/MutexImpl$a;->c:Lkotlinx/coroutines/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lkotlinx/coroutines/c;->C(Lsd/e0;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public i(Lqc/q;Ljava/lang/Object;Lhd/q;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object p3, p0, Lkotlinx/coroutines/sync/MutexImpl$a;->e:Lkotlinx/coroutines/sync/MutexImpl;

    .line 2
    .line 3
    iget-object v0, p0, Lkotlinx/coroutines/sync/MutexImpl$a;->c:Lkotlinx/coroutines/c;

    .line 4
    .line 5
    new-instance v1, Lbe/d;

    .line 6
    .line 7
    invoke-direct {v1, p3, p0}, Lbe/d;-><init>(Lkotlinx/coroutines/sync/MutexImpl;Lkotlinx/coroutines/sync/MutexImpl$a;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1, p2, v1}, Lkotlinx/coroutines/c;->r(Ljava/lang/Object;Ljava/lang/Object;Lhd/q;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-static {}, Lkotlinx/coroutines/sync/MutexImpl;->v()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    iget-object p3, p0, Lkotlinx/coroutines/sync/MutexImpl$a;->e:Lkotlinx/coroutines/sync/MutexImpl;

    .line 21
    .line 22
    iget-object v0, p0, Lkotlinx/coroutines/sync/MutexImpl$a;->d:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {p2, p3, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-object p1
.end method

.method public isActive()Z
    .locals 1

    iget-object v0, p0, Lkotlinx/coroutines/sync/MutexImpl$a;->c:Lkotlinx/coroutines/c;

    invoke-virtual {v0}, Lkotlinx/coroutines/c;->isActive()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic k(Ljava/lang/Object;Lhd/q;)V
    .locals 0

    .line 1
    check-cast p1, Lqc/q;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/sync/MutexImpl$a;->e(Lqc/q;Lhd/q;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public o(Ljava/lang/Throwable;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/sync/MutexImpl$a;->c:Lkotlinx/coroutines/c;

    invoke-virtual {v0, p1}, Lkotlinx/coroutines/c;->o(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic r(Ljava/lang/Object;Ljava/lang/Object;Lhd/q;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lqc/q;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lkotlinx/coroutines/sync/MutexImpl$a;->i(Lqc/q;Ljava/lang/Object;Lhd/q;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public resumeWith(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lkotlinx/coroutines/sync/MutexImpl$a;->c:Lkotlinx/coroutines/c;

    invoke-virtual {v0, p1}, Lkotlinx/coroutines/c;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public u(Lhd/l;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/sync/MutexImpl$a;->c:Lkotlinx/coroutines/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lkotlinx/coroutines/c;->u(Lhd/l;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
