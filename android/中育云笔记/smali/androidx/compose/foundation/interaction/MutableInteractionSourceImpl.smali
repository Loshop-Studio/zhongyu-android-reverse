.class final Landroidx/compose/foundation/interaction/MutableInteractionSourceImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/interaction/MutableInteractionSource;


# annotations
.annotation build Landroidx/compose/runtime/Stable;
.end annotation


# instance fields
.field private final interactions:Lvd/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvd/k;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lkotlinx/coroutines/channels/BufferOverflow;->d:Lkotlinx/coroutines/channels/BufferOverflow;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    const/16 v4, 0x10

    .line 10
    .line 11
    invoke-static {v3, v4, v0, v1, v2}, Lvd/q;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lvd/k;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Landroidx/compose/foundation/interaction/MutableInteractionSourceImpl;->interactions:Lvd/k;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public emit(Landroidx/compose/foundation/interaction/Interaction;Lvc/c;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/interaction/Interaction;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/interaction/MutableInteractionSourceImpl;->getInteractions()Lvd/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1, p2}, Lvd/k;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    if-ne p1, p2, :cond_0

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 17
    .line 18
    return-object p1
.end method

.method public bridge synthetic getInteractions()Lvd/c;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/interaction/MutableInteractionSourceImpl;->getInteractions()Lvd/k;

    move-result-object v0

    return-object v0
.end method

.method public getInteractions()Lvd/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lvd/k;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Landroidx/compose/foundation/interaction/MutableInteractionSourceImpl;->interactions:Lvd/k;

    return-object v0
.end method

.method public tryEmit(Landroidx/compose/foundation/interaction/Interaction;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/interaction/MutableInteractionSourceImpl;->getInteractions()Lvd/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Lvd/k;->a(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method
