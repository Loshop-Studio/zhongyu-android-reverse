.class public final Lg3/a;
.super Lg3/b;
.source "SourceFile"


# instance fields
.field private volatile _immediate:Lg3/a;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final b:Landroid/os/Handler;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final c:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final d:Z

.field private final e:Lg3/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/os/Handler;Ljava/lang/String;)V
    .locals 1
    .param p1    # Landroid/os/Handler;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 10
    invoke-direct {p0, p1, p2, v0}, Lg3/a;-><init>(Landroid/os/Handler;Ljava/lang/String;Z)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Handler;Ljava/lang/String;ILkotlin/jvm/internal/g;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 9
    :cond_0
    invoke-direct {p0, p1, p2}, Lg3/a;-><init>(Landroid/os/Handler;Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>(Landroid/os/Handler;Ljava/lang/String;Z)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lg3/b;-><init>(Lkotlin/jvm/internal/g;)V

    .line 2
    iput-object p1, p0, Lg3/a;->b:Landroid/os/Handler;

    .line 3
    iput-object p2, p0, Lg3/a;->c:Ljava/lang/String;

    .line 4
    iput-boolean p3, p0, Lg3/a;->d:Z

    if-eqz p3, :cond_0

    move-object v0, p0

    .line 5
    :cond_0
    iput-object v0, p0, Lg3/a;->_immediate:Lg3/a;

    .line 6
    iget-object p3, p0, Lg3/a;->_immediate:Lg3/a;

    if-nez p3, :cond_1

    .line 7
    new-instance p3, Lg3/a;

    const/4 v0, 0x1

    invoke-direct {p3, p1, p2, v0}, Lg3/a;-><init>(Landroid/os/Handler;Ljava/lang/String;Z)V

    iput-object p3, p0, Lg3/a;->_immediate:Lg3/a;

    sget-object p1, Lo2/r;->a:Lo2/r;

    .line 8
    :cond_1
    iput-object p3, p0, Lg3/a;->e:Lg3/a;

    return-void
.end method

.method public static final synthetic N(Lg3/a;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lg3/a;->b:Landroid/os/Handler;

    return-object p0
.end method

.method private final O(Lq2/g;Ljava/lang/Runnable;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/concurrent/CancellationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The task was rejected, the handler underlying the dispatcher \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\' was closed"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v0}, Lf3/q1;->c(Lq2/g;Ljava/util/concurrent/CancellationException;)V

    .line 2
    invoke-static {}, Lf3/v0;->b()Lf3/e0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lf3/e0;->J(Lq2/g;Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public J(Lq2/g;Ljava/lang/Runnable;)V
    .locals 1
    .param p1    # Lq2/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Runnable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lg3/a;->b:Landroid/os/Handler;

    invoke-virtual {v0, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0, p1, p2}, Lg3/a;->O(Lq2/g;Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public K(Lq2/g;)Z
    .locals 1
    .param p1    # Lq2/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    iget-boolean p1, p0, Lg3/a;->d:Z

    if-eqz p1, :cond_1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    iget-object v0, p0, Lg3/a;->b:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public bridge synthetic L()Lf3/x1;
    .locals 1

    invoke-virtual {p0}, Lg3/a;->P()Lg3/a;

    move-result-object v0

    return-object v0
.end method

.method public P()Lg3/a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lg3/a;->e:Lg3/a;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    instance-of v0, p1, Lg3/a;

    if-eqz v0, :cond_0

    check-cast p1, Lg3/a;

    iget-object p1, p1, Lg3/a;->b:Landroid/os/Handler;

    iget-object v0, p0, Lg3/a;->b:Landroid/os/Handler;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lg3/a;->b:Landroid/os/Handler;

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lf3/x1;->M()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lg3/a;->c:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lg3/a;->b:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->toString()Ljava/lang/String;

    move-result-object v0

    .line 3
    :cond_0
    iget-boolean v1, p0, Lg3/a;->d:Z

    if-eqz v1, :cond_1

    const-string v1, ".immediate"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public y(JLf3/l;)V
    .locals 4
    .param p3    # Lf3/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lf3/l<",
            "-",
            "Lo2/r;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lg3/a$a;

    invoke-direct {v0, p3, p0}, Lg3/a$a;-><init>(Lf3/l;Lg3/a;)V

    .line 2
    iget-object v1, p0, Lg3/a;->b:Landroid/os/Handler;

    const-wide v2, 0x3fffffffffffffffL    # 1.9999999999999998

    invoke-static {p1, p2, v2, v3}, Lb3/d;->e(JJ)J

    move-result-wide p1

    invoke-virtual {v1, v0, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    new-instance p1, Lg3/a$b;

    invoke-direct {p1, p0, v0}, Lg3/a$b;-><init>(Lg3/a;Ljava/lang/Runnable;)V

    invoke-interface {p3, p1}, Lf3/l;->h(Lx2/l;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-interface {p3}, Lq2/d;->getContext()Lq2/g;

    move-result-object p1

    invoke-direct {p0, p1, v0}, Lg3/a;->O(Lq2/g;Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method
