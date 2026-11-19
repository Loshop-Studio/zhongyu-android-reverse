.class public final Lh7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/f;
.implements Lkotlinx/coroutines/u1;


# instance fields
.field public final a:Lkotlinx/coroutines/g;

.field public final synthetic b:Lkotlinx/coroutines/sync/a;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/sync/a;Lkotlinx/coroutines/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh7/b;->b:Lkotlinx/coroutines/sync/a;

    .line 5
    .line 6
    iput-object p2, p0, Lh7/b;->a:Lkotlinx/coroutines/g;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Le7/p;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh7/b;->a:Lkotlinx/coroutines/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lkotlinx/coroutines/g;->a(Le7/p;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b(Ljava/lang/Object;Lr6/f;)V
    .locals 1

    .line 1
    sget-object p1, Lkotlinx/coroutines/sync/a;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    iget-object v0, p0, Lh7/b;->b:Lkotlinx/coroutines/sync/a;

    .line 5
    .line 6
    invoke-virtual {p1, v0, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Landroidx/navigation/i;

    .line 10
    .line 11
    invoke-direct {p1, v0, p0}, Landroidx/navigation/i;-><init>(Lkotlinx/coroutines/sync/a;Lh7/b;)V

    .line 12
    .line 13
    .line 14
    iget-object p2, p0, Lh7/b;->a:Lkotlinx/coroutines/g;

    .line 15
    .line 16
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 17
    .line 18
    invoke-virtual {p2, v0, p1}, Lkotlinx/coroutines/g;->d(Ljava/lang/Object;Lr6/c;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final d(Ljava/lang/Object;Lr6/c;)V
    .locals 1

    .line 1
    check-cast p1, Ld6/s;

    .line 2
    .line 3
    iget-object v0, p0, Lh7/b;->a:Lkotlinx/coroutines/g;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lkotlinx/coroutines/g;->d(Ljava/lang/Object;Lr6/c;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final getContext()Lh6/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lh7/b;->a:Lkotlinx/coroutines/g;

    .line 2
    .line 3
    iget-object v0, v0, Lkotlinx/coroutines/g;->e:Lh6/h;

    .line 4
    .line 5
    return-object v0
.end method

.method public final i(Ljava/lang/Throwable;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh7/b;->a:Lkotlinx/coroutines/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lkotlinx/coroutines/g;->i(Ljava/lang/Throwable;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final isActive()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh7/b;->a:Lkotlinx/coroutines/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Lkotlinx/coroutines/g;->isActive()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final m(Lr6/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh7/b;->a:Lkotlinx/coroutines/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lkotlinx/coroutines/g;->m(Lr6/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final n(Ljava/lang/Object;Lr6/f;)Le7/r;
    .locals 2

    .line 1
    check-cast p1, Ld6/s;

    .line 2
    .line 3
    new-instance p2, Landroidx/navigation/serialization/b;

    .line 4
    .line 5
    iget-object v0, p0, Lh7/b;->b:Lkotlinx/coroutines/sync/a;

    .line 6
    .line 7
    invoke-direct {p2, v0, p0}, Landroidx/navigation/serialization/b;-><init>(Lkotlinx/coroutines/sync/a;Lh7/b;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lh7/b;->a:Lkotlinx/coroutines/g;

    .line 11
    .line 12
    invoke-virtual {v1, p1, p2}, Lkotlinx/coroutines/g;->n(Ljava/lang/Object;Lr6/f;)Le7/r;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    sget-object p2, Lkotlinx/coroutines/sync/a;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-object p1
.end method

.method public final r(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh7/b;->a:Lkotlinx/coroutines/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lkotlinx/coroutines/g;->r(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh7/b;->a:Lkotlinx/coroutines/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lkotlinx/coroutines/g;->resumeWith(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
