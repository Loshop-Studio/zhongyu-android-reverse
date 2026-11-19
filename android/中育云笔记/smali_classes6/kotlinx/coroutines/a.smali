.class public abstract Lkotlinx/coroutines/a;
.super Lkotlinx/coroutines/JobSupport;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/g;
.implements Lvc/c;
.implements Lsd/i0;


# instance fields
.field public final e:Lkotlin/coroutines/d;


# direct methods
.method public constructor <init>(Lkotlin/coroutines/d;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0, p3}, Lkotlinx/coroutines/JobSupport;-><init>(Z)V

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    sget-object p2, Lkotlinx/coroutines/g;->b0:Lkotlinx/coroutines/g$b;

    .line 7
    .line 8
    invoke-interface {p1, p2}, Lkotlin/coroutines/d;->get(Lkotlin/coroutines/d$c;)Lkotlin/coroutines/d$b;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    check-cast p2, Lkotlinx/coroutines/g;

    .line 13
    .line 14
    invoke-virtual {p0, p2}, Lkotlinx/coroutines/JobSupport;->c0(Lkotlinx/coroutines/g;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-interface {p1, p0}, Lkotlin/coroutines/d;->plus(Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lkotlinx/coroutines/a;->e:Lkotlin/coroutines/d;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public F0(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/JobSupport;->w(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public G0(Ljava/lang/Throwable;Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public H0(Ljava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final I0(Lkotlinx/coroutines/CoroutineStart;Ljava/lang/Object;Lhd/p;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p3, p2, p0}, Lkotlinx/coroutines/CoroutineStart;->c(Lhd/p;Ljava/lang/Object;Lvc/c;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public J()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lsd/j0;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, " was cancelled"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method

.method public final b0(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/a;->e:Lkotlin/coroutines/d;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lsd/g0;->a(Lkotlin/coroutines/d;Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final getContext()Lkotlin/coroutines/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/a;->e:Lkotlin/coroutines/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public getCoroutineContext()Lkotlin/coroutines/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/a;->e:Lkotlin/coroutines/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public isActive()Z
    .locals 1

    .line 1
    invoke-super {p0}, Lkotlinx/coroutines/JobSupport;->isActive()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public k0()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/a;->e:Lkotlin/coroutines/d;

    .line 2
    .line 3
    invoke-static {v0}, Lsd/c0;->g(Lkotlin/coroutines/d;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-super {p0}, Lkotlinx/coroutines/JobSupport;->k0()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const/16 v2, 0x22

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v0, "\":"

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-super {p0}, Lkotlinx/coroutines/JobSupport;->k0()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    return-object v0
.end method

.method public final p0(Ljava/lang/Object;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lsd/x;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lsd/x;

    .line 6
    .line 7
    iget-object v0, p1, Lsd/x;->a:Ljava/lang/Throwable;

    .line 8
    .line 9
    invoke-virtual {p1}, Lsd/x;->a()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-virtual {p0, v0, p1}, Lkotlinx/coroutines/a;->G0(Ljava/lang/Throwable;Z)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/a;->H0(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lsd/y;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/JobSupport;->j0(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    sget-object v0, Lsd/q1;->b:Lxd/c0;

    .line 10
    .line 11
    if-ne p1, v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/a;->F0(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
