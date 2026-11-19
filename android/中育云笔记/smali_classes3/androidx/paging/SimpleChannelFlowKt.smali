.class public final Landroidx/paging/SimpleChannelFlowKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation


# direct methods
.method public static final simpleChannelFlow(Lhd/p;)Lvd/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lhd/p;",
            ")",
            "Lvd/c;"
        }
    .end annotation

    .line 1
    const-string v0, "block"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroidx/paging/SimpleChannelFlowKt$simpleChannelFlow$1;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p0, v1}, Landroidx/paging/SimpleChannelFlowKt$simpleChannelFlow$1;-><init>(Lhd/p;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lvd/e;->B(Lhd/p;)Lvd/c;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const/4 v0, -0x2

    .line 17
    const/4 v2, 0x2

    .line 18
    invoke-static {p0, v0, v1, v2, v1}, Lvd/e;->d(Lvd/c;ILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lvd/c;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method
