.class public final Lj1/a$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/util/Pools$Pool;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field public final a:Lj1/a$d;

.field public final b:Lj1/a$g;

.field public final c:Landroidx/core/util/Pools$Pool;


# direct methods
.method public constructor <init>(Landroidx/core/util/Pools$Pool;Lj1/a$d;Lj1/a$g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj1/a$e;->c:Landroidx/core/util/Pools$Pool;

    .line 5
    .line 6
    iput-object p2, p0, Lj1/a$e;->a:Lj1/a$d;

    .line 7
    .line 8
    iput-object p3, p0, Lj1/a$e;->b:Lj1/a$g;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public acquire()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lj1/a$e;->c:Landroidx/core/util/Pools$Pool;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/core/util/Pools$Pool;->acquire()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lj1/a$e;->a:Lj1/a$d;

    .line 10
    .line 11
    invoke-interface {v0}, Lj1/a$d;->create()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "FactoryPools"

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    :cond_0
    instance-of v1, v0, Lj1/a$f;

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    move-object v1, v0

    .line 36
    check-cast v1, Lj1/a$f;

    .line 37
    .line 38
    invoke-interface {v1}, Lj1/a$f;->d()Lj1/c;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const/4 v2, 0x0

    .line 43
    invoke-virtual {v1, v2}, Lj1/c;->b(Z)V

    .line 44
    .line 45
    .line 46
    :cond_1
    return-object v0
.end method

.method public release(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lj1/a$f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lj1/a$f;

    .line 7
    .line 8
    invoke-interface {v0}, Lj1/a$f;->d()Lj1/c;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-virtual {v0, v1}, Lj1/c;->b(Z)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lj1/a$e;->b:Lj1/a$g;

    .line 17
    .line 18
    invoke-interface {v0, p1}, Lj1/a$g;->a(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lj1/a$e;->c:Landroidx/core/util/Pools$Pool;

    .line 22
    .line 23
    invoke-interface {v0, p1}, Landroidx/core/util/Pools$Pool;->release(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1
.end method
