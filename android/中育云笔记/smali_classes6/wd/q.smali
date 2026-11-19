.class public final Lwd/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvc/c;
.implements Lxc/c;


# instance fields
.field public final c:Lvc/c;

.field public final d:Lkotlin/coroutines/d;


# direct methods
.method public constructor <init>(Lvc/c;Lkotlin/coroutines/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwd/q;->c:Lvc/c;

    .line 5
    .line 6
    iput-object p2, p0, Lwd/q;->d:Lkotlin/coroutines/d;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public getCallerFrame()Lxc/c;
    .locals 2

    .line 1
    iget-object v0, p0, Lwd/q;->c:Lvc/c;

    .line 2
    .line 3
    instance-of v1, v0, Lxc/c;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lxc/c;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public getContext()Lkotlin/coroutines/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lwd/q;->d:Lkotlin/coroutines/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public resumeWith(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lwd/q;->c:Lvc/c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lvc/c;->resumeWith(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
