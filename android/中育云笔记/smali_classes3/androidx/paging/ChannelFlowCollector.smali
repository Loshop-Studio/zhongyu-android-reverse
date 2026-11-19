.class public final Landroidx/paging/ChannelFlowCollector;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvd/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lvd/d;"
    }
.end annotation


# instance fields
.field private final channel:Lkotlinx/coroutines/channels/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/f;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/channels/f;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/channels/f;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "channel"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Landroidx/paging/ChannelFlowCollector;->channel:Lkotlinx/coroutines/channels/f;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/ChannelFlowCollector;->channel:Lkotlinx/coroutines/channels/f;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lkotlinx/coroutines/channels/f;->send(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-ne p1, p2, :cond_0

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 15
    .line 16
    return-object p1
.end method

.method public final getChannel()Lkotlinx/coroutines/channels/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/channels/f;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/ChannelFlowCollector;->channel:Lkotlinx/coroutines/channels/f;

    .line 2
    .line 3
    return-object v0
.end method
