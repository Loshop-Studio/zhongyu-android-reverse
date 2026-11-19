.class public final Ld7/c$b;
.super Ls6/f$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld7/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lv6/a;

.field public final b:Ld7/c$a;

.field public final c:Ld7/c$c;

.field public final d:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Ld7/c$a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ls6/f$c;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ld7/c$b;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    iput-object p1, p0, Ld7/c$b;->b:Ld7/c$a;

    .line 12
    .line 13
    new-instance v0, Lv6/a;

    .line 14
    .line 15
    invoke-direct {v0}, Lv6/a;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Ld7/c$b;->a:Lv6/a;

    .line 19
    .line 20
    invoke-virtual {p1}, Ld7/c$a;->b()Ld7/c$c;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Ld7/c$b;->c:Ld7/c$c;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lv6/b;
    .locals 6

    .line 1
    iget-object v0, p0, Ld7/c$b;->a:Lv6/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv6/a;->isDisposed()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p1, Lio/reactivex/internal/disposables/EmptyDisposable;->a:Lio/reactivex/internal/disposables/EmptyDisposable;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    iget-object v0, p0, Ld7/c$b;->c:Ld7/c$c;

    .line 13
    .line 14
    iget-object v5, p0, Ld7/c$b;->a:Lv6/a;

    .line 15
    .line 16
    move-object v1, p1

    .line 17
    move-wide v2, p2

    .line 18
    move-object v4, p4

    .line 19
    invoke-virtual/range {v0 .. v5}, Lio/reactivex/internal/schedulers/a;->e(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Ly6/a;)Lio/reactivex/internal/schedulers/ScheduledRunnable;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
.end method

.method public dispose()V
    .locals 3

    .line 1
    iget-object v0, p0, Ld7/c$b;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Ld7/c$b;->a:Lv6/a;

    .line 12
    .line 13
    invoke-virtual {v0}, Lv6/a;->dispose()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Ld7/c$b;->b:Ld7/c$a;

    .line 17
    .line 18
    iget-object v1, p0, Ld7/c$b;->c:Ld7/c$c;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ld7/c$a;->d(Ld7/c$c;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public isDisposed()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ld7/c$b;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
