.class public final Lkotlinx/coroutines/channels/e;
.super Lk8/a;
.source "SourceFile"

# interfaces
.implements Lk8/g;


# direct methods
.method public constructor <init>(Lkotlin/coroutines/d;Lkotlinx/coroutines/channels/a;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, p2, v0, v0}, Lk8/a;-><init>(Lkotlin/coroutines/d;Lkotlinx/coroutines/channels/a;ZZ)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public H0(Ljava/lang/Throwable;Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lk8/a;->L0()Lkotlinx/coroutines/channels/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Lkotlinx/coroutines/channels/f;->close(Ljava/lang/Throwable;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lkotlinx/coroutines/a;->getContext()Lkotlin/coroutines/d;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-static {p2, p1}, Li8/a0;->a(Lkotlin/coroutines/d;Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public bridge synthetic I0(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lh7/p;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/channels/e;->M0(Lh7/p;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public M0(Lh7/p;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lk8/a;->L0()Lkotlinx/coroutines/channels/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-static {p1, v0, v1, v0}, Lkotlinx/coroutines/channels/f$a;->a(Lkotlinx/coroutines/channels/f;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public bridge synthetic getChannel()Lkotlinx/coroutines/channels/f;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lk8/a;->K0()Lkotlinx/coroutines/channels/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public isActive()Z
    .locals 1

    .line 1
    invoke-super {p0}, Lkotlinx/coroutines/a;->isActive()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method
