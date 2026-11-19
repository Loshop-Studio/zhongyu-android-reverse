.class public Le7/o;
.super Lkotlinx/coroutines/a;
.source "SourceFile"

# interfaces
.implements Li6/b;


# instance fields
.field public final d:Lh6/c;


# direct methods
.method public constructor <init>(Lh6/c;Lh6/h;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p2, v0}, Lkotlinx/coroutines/a;-><init>(Lh6/h;Z)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Le7/o;->d:Lh6/c;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final M()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public c0()V
    .locals 0

    .line 1
    return-void
.end method

.method public final getCallerFrame()Li6/b;
    .locals 2

    .line 1
    iget-object v0, p0, Le7/o;->d:Lh6/c;

    .line 2
    .line 3
    instance-of v1, v0, Li6/b;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Li6/b;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public s(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le7/o;->d:Lh6/c;

    .line 2
    .line 3
    invoke-static {v0}, Lv7/l;->n(Lh6/c;)Lh6/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1}, Lkotlinx/coroutines/x;->x(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {v0, p1}, Le7/a;->h(Lh6/c;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public t(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le7/o;->d:Lh6/c;

    .line 2
    .line 3
    invoke-static {p1}, Lkotlinx/coroutines/x;->x(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Lh6/c;->resumeWith(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
