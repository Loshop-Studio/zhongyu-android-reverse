.class public abstract Le2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/lifecycle/LiveData;Landroidx/lifecycle/LifecycleOwner;Lhd/l;)V
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "owner"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onEventUnhandled"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Le2/b$a;

    .line 17
    .line 18
    invoke-direct {v0, p2}, Le2/b$a;-><init>(Lhd/l;)V

    .line 19
    .line 20
    .line 21
    new-instance p2, Le2/b$b;

    .line 22
    .line 23
    invoke-direct {p2, v0}, Le2/b$b;-><init>(Lhd/l;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1, p2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method
