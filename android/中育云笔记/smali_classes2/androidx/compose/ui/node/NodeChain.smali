.class public final Landroidx/compose/ui/node/NodeChain;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/node/NodeChain$Differ;,
        Landroidx/compose/ui/node/NodeChain$Logger;
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private buffer:Landroidx/compose/runtime/collection/MutableVector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/collection/MutableVector<",
            "Landroidx/compose/ui/Modifier$Element;",
            ">;"
        }
    .end annotation
.end field

.field private cachedDiffer:Landroidx/compose/ui/node/NodeChain$Differ;

.field private current:Landroidx/compose/runtime/collection/MutableVector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/collection/MutableVector<",
            "Landroidx/compose/ui/Modifier$Element;",
            ">;"
        }
    .end annotation
.end field

.field private head:Landroidx/compose/ui/Modifier$Node;

.field private final innerCoordinator:Landroidx/compose/ui/node/InnerNodeCoordinator;

.field private final layoutNode:Landroidx/compose/ui/node/LayoutNode;

.field private logger:Landroidx/compose/ui/node/NodeChain$Logger;

.field private outerCoordinator:Landroidx/compose/ui/node/NodeCoordinator;

.field private final tail:Landroidx/compose/ui/Modifier$Node;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/node/LayoutNode;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/node/NodeChain;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    .line 5
    .line 6
    new-instance v0, Landroidx/compose/ui/node/InnerNodeCoordinator;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Landroidx/compose/ui/node/InnerNodeCoordinator;-><init>(Landroidx/compose/ui/node/LayoutNode;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Landroidx/compose/ui/node/NodeChain;->innerCoordinator:Landroidx/compose/ui/node/InnerNodeCoordinator;

    .line 12
    .line 13
    iput-object v0, p0, Landroidx/compose/ui/node/NodeChain;->outerCoordinator:Landroidx/compose/ui/node/NodeCoordinator;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroidx/compose/ui/node/InnerNodeCoordinator;->getTail()Landroidx/compose/ui/node/TailModifierNode;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Landroidx/compose/ui/node/NodeChain;->tail:Landroidx/compose/ui/Modifier$Node;

    .line 20
    .line 21
    iput-object p1, p0, Landroidx/compose/ui/node/NodeChain;->head:Landroidx/compose/ui/Modifier$Node;

    .line 22
    .line 23
    return-void
.end method

.method public static final synthetic access$createAndInsertNodeAsChild(Landroidx/compose/ui/node/NodeChain;Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;)Landroidx/compose/ui/Modifier$Node;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/compose/ui/node/NodeChain;->createAndInsertNodeAsChild(Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;)Landroidx/compose/ui/Modifier$Node;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$detachAndRemoveNode(Landroidx/compose/ui/node/NodeChain;Landroidx/compose/ui/Modifier$Node;)Landroidx/compose/ui/Modifier$Node;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/ui/node/NodeChain;->detachAndRemoveNode(Landroidx/compose/ui/Modifier$Node;)Landroidx/compose/ui/Modifier$Node;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getAggregateChildKindSet(Landroidx/compose/ui/node/NodeChain;)I
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/node/NodeChain;->getAggregateChildKindSet()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$getLogger$p(Landroidx/compose/ui/node/NodeChain;)Landroidx/compose/ui/node/NodeChain$Logger;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/node/NodeChain;->logger:Landroidx/compose/ui/node/NodeChain$Logger;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$propagateCoordinator(Landroidx/compose/ui/node/NodeChain;Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/compose/ui/node/NodeChain;->propagateCoordinator(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$updateNode(Landroidx/compose/ui/node/NodeChain;Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/ui/node/NodeChain;->updateNode(Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final createAndInsertNodeAsChild(Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;)Landroidx/compose/ui/Modifier$Node;
    .locals 1

    .line 1
    instance-of v0, p1, Landroidx/compose/ui/node/ModifierNodeElement;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Landroidx/compose/ui/node/ModifierNodeElement;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/compose/ui/node/ModifierNodeElement;->create()Landroidx/compose/ui/Modifier$Node;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Landroidx/compose/ui/node/NodeKindKt;->calculateNodeKindSetFromIncludingDelegates(Landroidx/compose/ui/Modifier$Node;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p1, v0}, Landroidx/compose/ui/Modifier$Node;->setKindSet$ui_release(I)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance v0, Landroidx/compose/ui/node/BackwardsCompatNode;

    .line 20
    .line 21
    invoke-direct {v0, p1}, Landroidx/compose/ui/node/BackwardsCompatNode;-><init>(Landroidx/compose/ui/Modifier$Element;)V

    .line 22
    .line 23
    .line 24
    move-object p1, v0

    .line 25
    :goto_0
    invoke-virtual {p1}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    const-string v0, "A ModifierNodeElement cannot return an already attached node from create() "

    .line 32
    .line 33
    invoke-static {v0}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    const/4 v0, 0x1

    .line 37
    invoke-virtual {p1, v0}, Landroidx/compose/ui/Modifier$Node;->setInsertedNodeAwaitingAttachForInvalidation$ui_release(Z)V

    .line 38
    .line 39
    .line 40
    invoke-direct {p0, p1, p2}, Landroidx/compose/ui/node/NodeChain;->insertChild(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/Modifier$Node;)Landroidx/compose/ui/Modifier$Node;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1
.end method

.method private final detachAndRemoveNode(Landroidx/compose/ui/Modifier$Node;)Landroidx/compose/ui/Modifier$Node;
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Landroidx/compose/ui/node/NodeKindKt;->autoInvalidateRemovedNode(Landroidx/compose/ui/Modifier$Node;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroidx/compose/ui/Modifier$Node;->runDetachLifecycle$ui_release()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/compose/ui/Modifier$Node;->markAsDetached$ui_release()V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-direct {p0, p1}, Landroidx/compose/ui/node/NodeChain;->removeNode(Landroidx/compose/ui/Modifier$Node;)Landroidx/compose/ui/Modifier$Node;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method private final getAggregateChildKindSet()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeChain;->head:Landroidx/compose/ui/Modifier$Node;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method private final getDiffer(Landroidx/compose/ui/Modifier$Node;ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/runtime/collection/MutableVector;Z)Landroidx/compose/ui/node/NodeChain$Differ;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier$Node;",
            "I",
            "Landroidx/compose/runtime/collection/MutableVector<",
            "Landroidx/compose/ui/Modifier$Element;",
            ">;",
            "Landroidx/compose/runtime/collection/MutableVector<",
            "Landroidx/compose/ui/Modifier$Element;",
            ">;Z)",
            "Landroidx/compose/ui/node/NodeChain$Differ;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeChain;->cachedDiffer:Landroidx/compose/ui/node/NodeChain$Differ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Landroidx/compose/ui/node/NodeChain$Differ;

    .line 6
    .line 7
    move-object v2, p0

    .line 8
    move-object v3, p1

    .line 9
    move v4, p2

    .line 10
    move-object v5, p3

    .line 11
    move-object v6, p4

    .line 12
    move v7, p5

    .line 13
    invoke-direct/range {v1 .. v7}, Landroidx/compose/ui/node/NodeChain$Differ;-><init>(Landroidx/compose/ui/node/NodeChain;Landroidx/compose/ui/Modifier$Node;ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/runtime/collection/MutableVector;Z)V

    .line 14
    .line 15
    .line 16
    iput-object v1, v2, Landroidx/compose/ui/node/NodeChain;->cachedDiffer:Landroidx/compose/ui/node/NodeChain$Differ;

    .line 17
    .line 18
    return-object v1

    .line 19
    :cond_0
    move-object v2, p0

    .line 20
    move-object v3, p1

    .line 21
    move v4, p2

    .line 22
    move-object v5, p3

    .line 23
    move-object v6, p4

    .line 24
    move v7, p5

    .line 25
    invoke-virtual {v0, v3}, Landroidx/compose/ui/node/NodeChain$Differ;->setNode(Landroidx/compose/ui/Modifier$Node;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v4}, Landroidx/compose/ui/node/NodeChain$Differ;->setOffset(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v5}, Landroidx/compose/ui/node/NodeChain$Differ;->setBefore(Landroidx/compose/runtime/collection/MutableVector;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v6}, Landroidx/compose/ui/node/NodeChain$Differ;->setAfter(Landroidx/compose/runtime/collection/MutableVector;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v7}, Landroidx/compose/ui/node/NodeChain$Differ;->setShouldAttachOnInsert(Z)V

    .line 38
    .line 39
    .line 40
    return-object v0
.end method

.method private final insertChild(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/Modifier$Node;)Landroidx/compose/ui/Modifier$Node;
    .locals 1

    .line 1
    invoke-virtual {p2}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroidx/compose/ui/Modifier$Node;->setParent$ui_release(Landroidx/compose/ui/Modifier$Node;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroidx/compose/ui/Modifier$Node;->setChild$ui_release(Landroidx/compose/ui/Modifier$Node;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p2, p1}, Landroidx/compose/ui/Modifier$Node;->setChild$ui_release(Landroidx/compose/ui/Modifier$Node;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p2}, Landroidx/compose/ui/Modifier$Node;->setParent$ui_release(Landroidx/compose/ui/Modifier$Node;)V

    .line 17
    .line 18
    .line 19
    return-object p1
.end method

.method private final padChain()Landroidx/compose/ui/Modifier$Node;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeChain;->head:Landroidx/compose/ui/Modifier$Node;

    .line 2
    .line 3
    invoke-static {}, Landroidx/compose/ui/node/NodeChainKt;->access$getSentinelHead$p()Landroidx/compose/ui/node/NodeChainKt$SentinelHead$1;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    :goto_0
    if-nez v0, :cond_1

    .line 13
    .line 14
    const-string/jumbo v0, "padChain called on already padded chain"

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeChain;->head:Landroidx/compose/ui/Modifier$Node;

    .line 21
    .line 22
    invoke-static {}, Landroidx/compose/ui/node/NodeChainKt;->access$getSentinelHead$p()Landroidx/compose/ui/node/NodeChainKt$SentinelHead$1;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Landroidx/compose/ui/Modifier$Node;->setParent$ui_release(Landroidx/compose/ui/Modifier$Node;)V

    .line 27
    .line 28
    .line 29
    invoke-static {}, Landroidx/compose/ui/node/NodeChainKt;->access$getSentinelHead$p()Landroidx/compose/ui/node/NodeChainKt$SentinelHead$1;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1, v0}, Landroidx/compose/ui/Modifier$Node;->setChild$ui_release(Landroidx/compose/ui/Modifier$Node;)V

    .line 34
    .line 35
    .line 36
    invoke-static {}, Landroidx/compose/ui/node/NodeChainKt;->access$getSentinelHead$p()Landroidx/compose/ui/node/NodeChainKt$SentinelHead$1;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    return-object v0
.end method

.method private final propagateCoordinator(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :goto_0
    if-eqz p1, :cond_3

    .line 6
    .line 7
    invoke-static {}, Landroidx/compose/ui/node/NodeChainKt;->access$getSentinelHead$p()Landroidx/compose/ui/node/NodeChainKt$SentinelHead$1;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-ne p1, v0, :cond_1

    .line 12
    .line 13
    iget-object p1, p0, Landroidx/compose/ui/node/NodeChain;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->getInnerCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    :goto_1
    invoke-virtual {p2, p1}, Landroidx/compose/ui/node/NodeCoordinator;->setWrappedBy$ui_release(Landroidx/compose/ui/node/NodeCoordinator;)V

    .line 28
    .line 29
    .line 30
    iput-object p2, p0, Landroidx/compose/ui/node/NodeChain;->outerCoordinator:Landroidx/compose/ui/node/NodeCoordinator;

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    const/4 v0, 0x2

    .line 34
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-virtual {p1}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    and-int/2addr v0, v1

    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    return-void

    .line 46
    :cond_2
    invoke-virtual {p1, p2}, Landroidx/compose/ui/Modifier$Node;->updateCoordinator$ui_release(Landroidx/compose/ui/node/NodeCoordinator;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    goto :goto_0

    .line 54
    :cond_3
    return-void
.end method

.method private final removeNode(Landroidx/compose/ui/Modifier$Node;)Landroidx/compose/ui/Modifier$Node;
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroidx/compose/ui/Modifier$Node;->setParent$ui_release(Landroidx/compose/ui/Modifier$Node;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v2}, Landroidx/compose/ui/Modifier$Node;->setChild$ui_release(Landroidx/compose/ui/Modifier$Node;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Landroidx/compose/ui/Modifier$Node;->setChild$ui_release(Landroidx/compose/ui/Modifier$Node;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v2}, Landroidx/compose/ui/Modifier$Node;->setParent$ui_release(Landroidx/compose/ui/Modifier$Node;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-object v1
.end method

.method private final structuralUpdate(ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/compose/runtime/collection/MutableVector<",
            "Landroidx/compose/ui/Modifier$Element;",
            ">;",
            "Landroidx/compose/runtime/collection/MutableVector<",
            "Landroidx/compose/ui/Modifier$Element;",
            ">;",
            "Landroidx/compose/ui/Modifier$Node;",
            "Z)V"
        }
    .end annotation

    .line 1
    move-object v0, p0

    .line 2
    move v2, p1

    .line 3
    move-object v3, p2

    .line 4
    move-object v4, p3

    .line 5
    move-object v1, p4

    .line 6
    move v5, p5

    .line 7
    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/node/NodeChain;->getDiffer(Landroidx/compose/ui/Modifier$Node;ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/runtime/collection/MutableVector;Z)Landroidx/compose/ui/node/NodeChain$Differ;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {v3}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    sub-int/2addr p2, v2

    .line 16
    invoke-virtual {v4}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 17
    .line 18
    .line 19
    move-result p3

    .line 20
    sub-int/2addr p3, v2

    .line 21
    invoke-static {p2, p3, p1}, Landroidx/compose/ui/node/MyersDiffKt;->executeDiff(IILandroidx/compose/ui/node/DiffCallback;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {p0}, Landroidx/compose/ui/node/NodeChain;->syncAggregateChildKindSet()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method private final syncAggregateChildKindSet()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeChain;->tail:Landroidx/compose/ui/Modifier$Node;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-static {}, Landroidx/compose/ui/node/NodeChainKt;->access$getSentinelHead$p()Landroidx/compose/ui/node/NodeChainKt$SentinelHead$1;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-eq v0, v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    or-int/2addr v1, v2

    .line 21
    invoke-virtual {v0, v1}, Landroidx/compose/ui/Modifier$Node;->setAggregateChildKindSet$ui_release(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
.end method

.method private final trimChain(Landroidx/compose/ui/Modifier$Node;)Landroidx/compose/ui/Modifier$Node;
    .locals 5

    .line 1
    invoke-static {}, Landroidx/compose/ui/node/NodeChainKt;->access$getSentinelHead$p()Landroidx/compose/ui/node/NodeChainKt$SentinelHead$1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    move p1, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move p1, v1

    .line 12
    :goto_0
    if-nez p1, :cond_1

    .line 13
    .line 14
    const-string/jumbo p1, "trimChain called on already trimmed chain"

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    invoke-static {}, Landroidx/compose/ui/node/NodeChainKt;->access$getSentinelHead$p()Landroidx/compose/ui/node/NodeChainKt$SentinelHead$1;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-nez p1, :cond_2

    .line 29
    .line 30
    iget-object p1, p0, Landroidx/compose/ui/node/NodeChain;->tail:Landroidx/compose/ui/Modifier$Node;

    .line 31
    .line 32
    :cond_2
    const/4 v0, 0x0

    .line 33
    invoke-virtual {p1, v0}, Landroidx/compose/ui/Modifier$Node;->setParent$ui_release(Landroidx/compose/ui/Modifier$Node;)V

    .line 34
    .line 35
    .line 36
    invoke-static {}, Landroidx/compose/ui/node/NodeChainKt;->access$getSentinelHead$p()Landroidx/compose/ui/node/NodeChainKt$SentinelHead$1;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v3, v0}, Landroidx/compose/ui/Modifier$Node;->setChild$ui_release(Landroidx/compose/ui/Modifier$Node;)V

    .line 41
    .line 42
    .line 43
    invoke-static {}, Landroidx/compose/ui/node/NodeChainKt;->access$getSentinelHead$p()Landroidx/compose/ui/node/NodeChainKt$SentinelHead$1;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    const/4 v4, -0x1

    .line 48
    invoke-virtual {v3, v4}, Landroidx/compose/ui/Modifier$Node;->setAggregateChildKindSet$ui_release(I)V

    .line 49
    .line 50
    .line 51
    invoke-static {}, Landroidx/compose/ui/node/NodeChainKt;->access$getSentinelHead$p()Landroidx/compose/ui/node/NodeChainKt$SentinelHead$1;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-virtual {v3, v0}, Landroidx/compose/ui/Modifier$Node;->updateCoordinator$ui_release(Landroidx/compose/ui/node/NodeCoordinator;)V

    .line 56
    .line 57
    .line 58
    invoke-static {}, Landroidx/compose/ui/node/NodeChainKt;->access$getSentinelHead$p()Landroidx/compose/ui/node/NodeChainKt$SentinelHead$1;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-eq p1, v0, :cond_3

    .line 63
    .line 64
    move v1, v2

    .line 65
    :cond_3
    if-nez v1, :cond_4

    .line 66
    .line 67
    const-string/jumbo v0, "trimChain did not update the head"

    .line 68
    .line 69
    .line 70
    invoke-static {v0}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    :cond_4
    return-object p1
.end method

.method private final updateNode(Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;)V
    .locals 1

    .line 1
    instance-of p1, p1, Landroidx/compose/ui/node/ModifierNodeElement;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    instance-of p1, p2, Landroidx/compose/ui/node/ModifierNodeElement;

    .line 7
    .line 8
    if-eqz p1, :cond_1

    .line 9
    .line 10
    check-cast p2, Landroidx/compose/ui/node/ModifierNodeElement;

    .line 11
    .line 12
    invoke-static {p2, p3}, Landroidx/compose/ui/node/NodeChainKt;->access$updateUnsafe(Landroidx/compose/ui/node/ModifierNodeElement;Landroidx/compose/ui/Modifier$Node;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p3}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-static {p3}, Landroidx/compose/ui/node/NodeKindKt;->autoInvalidateUpdatedNode(Landroidx/compose/ui/Modifier$Node;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-virtual {p3, v0}, Landroidx/compose/ui/Modifier$Node;->setUpdatedNodeAwaitingAttachForInvalidation$ui_release(Z)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    instance-of p1, p3, Landroidx/compose/ui/node/BackwardsCompatNode;

    .line 30
    .line 31
    if-eqz p1, :cond_3

    .line 32
    .line 33
    move-object p1, p3

    .line 34
    check-cast p1, Landroidx/compose/ui/node/BackwardsCompatNode;

    .line 35
    .line 36
    invoke-virtual {p1, p2}, Landroidx/compose/ui/node/BackwardsCompatNode;->setElement(Landroidx/compose/ui/Modifier$Element;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p3}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_2

    .line 44
    .line 45
    invoke-static {p3}, Landroidx/compose/ui/node/NodeKindKt;->autoInvalidateUpdatedNode(Landroidx/compose/ui/Modifier$Node;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_2
    invoke-virtual {p3, v0}, Landroidx/compose/ui/Modifier$Node;->setUpdatedNodeAwaitingAttachForInvalidation$ui_release(Z)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_3
    const-string p1, "Unknown Modifier.Node type"

    .line 54
    .line 55
    invoke-static {p1}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method


# virtual methods
.method public final synthetic firstFromHead-aLcG6gQ$ui_release(ILhd/l;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I",
            "Lhd/l;",
            ")TT;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/node/NodeChain;->access$getAggregateChildKindSet(Landroidx/compose/ui/node/NodeChain;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/2addr v0, p1

    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :goto_0
    if-eqz v0, :cond_2

    .line 14
    .line 15
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    and-int/2addr v2, p1

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    move-object v2, v0

    .line 23
    :goto_1
    if-eqz v2, :cond_1

    .line 24
    .line 25
    const/4 v3, 0x3

    .line 26
    const-string v4, "T"

    .line 27
    .line 28
    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->m(ILjava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p2, v2}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    return-object v2

    .line 44
    :cond_0
    invoke-static {v1}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    and-int/2addr v2, p1

    .line 54
    if-eqz v2, :cond_2

    .line 55
    .line 56
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    goto :goto_0

    .line 61
    :cond_2
    return-object v1
.end method

.method public final getHead$ui_release()Landroidx/compose/ui/Modifier$Node;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeChain;->head:Landroidx/compose/ui/Modifier$Node;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getInnerCoordinator$ui_release()Landroidx/compose/ui/node/InnerNodeCoordinator;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeChain;->innerCoordinator:Landroidx/compose/ui/node/InnerNodeCoordinator;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLayoutNode()Landroidx/compose/ui/node/LayoutNode;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeChain;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getModifierInfo()Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/compose/ui/layout/ModifierInfo;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeChain;->current:Landroidx/compose/runtime/collection/MutableVector;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    invoke-virtual {v0}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    new-instance v2, Landroidx/compose/runtime/collection/MutableVector;

    .line 15
    .line 16
    new-array v1, v1, [Landroidx/compose/ui/layout/ModifierInfo;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-direct {v2, v1, v3}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    :goto_0
    if-eqz v1, :cond_4

    .line 27
    .line 28
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    if-eq v1, v4, :cond_4

    .line 33
    .line 34
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    if-eqz v4, :cond_3

    .line 39
    .line 40
    invoke-virtual {v4}, Landroidx/compose/ui/node/NodeCoordinator;->getLayer()Landroidx/compose/ui/node/OwnedLayer;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    iget-object v6, p0, Landroidx/compose/ui/node/NodeChain;->innerCoordinator:Landroidx/compose/ui/node/InnerNodeCoordinator;

    .line 45
    .line 46
    invoke-virtual {v6}, Landroidx/compose/ui/node/NodeCoordinator;->getLayer()Landroidx/compose/ui/node/OwnedLayer;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    iget-object v8, p0, Landroidx/compose/ui/node/NodeChain;->tail:Landroidx/compose/ui/Modifier$Node;

    .line 55
    .line 56
    if-ne v7, v8, :cond_1

    .line 57
    .line 58
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->getCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    if-eq v8, v7, :cond_1

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    const/4 v6, 0x0

    .line 70
    :goto_1
    if-nez v5, :cond_2

    .line 71
    .line 72
    move-object v5, v6

    .line 73
    :cond_2
    new-instance v6, Landroidx/compose/ui/layout/ModifierInfo;

    .line 74
    .line 75
    add-int/lit8 v7, v3, 0x1

    .line 76
    .line 77
    iget-object v8, v0, Landroidx/compose/runtime/collection/MutableVector;->content:[Ljava/lang/Object;

    .line 78
    .line 79
    aget-object v3, v8, v3

    .line 80
    .line 81
    check-cast v3, Landroidx/compose/ui/Modifier;

    .line 82
    .line 83
    invoke-direct {v6, v3, v4, v5}, Landroidx/compose/ui/layout/ModifierInfo;-><init>(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/LayoutCoordinates;Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v6}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    move v3, v7

    .line 94
    goto :goto_0

    .line 95
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 96
    .line 97
    const-string v1, "getModifierInfo called on node with no coordinator"

    .line 98
    .line 99
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw v0

    .line 103
    :cond_4
    invoke-virtual {v2}, Landroidx/compose/runtime/collection/MutableVector;->asMutableList()Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    return-object v0
.end method

.method public final getOuterCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeChain;->outerCoordinator:Landroidx/compose/ui/node/NodeCoordinator;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTail$ui_release()Landroidx/compose/ui/Modifier$Node;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeChain;->tail:Landroidx/compose/ui/Modifier$Node;

    .line 2
    .line 3
    return-object v0
.end method

.method public final has$ui_release(I)Z
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/node/NodeChain;->getAggregateChildKindSet()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/2addr p1, v0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    return p1

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    return p1
.end method

.method public final has-H91voCI$ui_release(I)Z
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/node/NodeChain;->getAggregateChildKindSet()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/2addr p1, v0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    return p1

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    return p1
.end method

.method public final synthetic head-H91voCI$ui_release(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I)TT;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/node/NodeChain;->access$getAggregateChildKindSet(Landroidx/compose/ui/node/NodeChain;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/2addr v0, p1

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :goto_0
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    and-int/2addr v1, p1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x3

    .line 22
    const-string v1, "T"

    .line 23
    .line 24
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->m(ILjava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    and-int/2addr v1, p1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 p1, 0x0

    .line 41
    return-object p1
.end method

.method public final headToTail$ui_release(ILhd/l;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/node/NodeChain;->access$getAggregateChildKindSet(Landroidx/compose/ui/node/NodeChain;)I

    move-result v0

    and-int/2addr v0, p1

    if-nez v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_3

    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v1

    and-int/2addr v1, p1

    if-eqz v1, :cond_1

    .line 4
    invoke-interface {p2, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    :cond_1
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    move-result v1

    and-int/2addr v1, p1

    if-nez v1, :cond_2

    goto :goto_1

    .line 6
    :cond_2
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public final headToTail$ui_release(Lhd/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 7
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_0

    .line 8
    invoke-interface {p1, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final synthetic headToTail-aLcG6gQ$ui_release(ILhd/l;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/node/NodeChain;->access$getAggregateChildKindSet(Landroidx/compose/ui/node/NodeChain;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/2addr v0, p1

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :goto_0
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    and-int/2addr v1, p1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    move-object v1, v0

    .line 22
    :goto_1
    if-eqz v1, :cond_0

    .line 23
    .line 24
    const/4 v2, 0x3

    .line 25
    const-string v3, "T"

    .line 26
    .line 27
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->m(ILjava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {p2, v1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-static {v1}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    and-int/2addr v1, p1

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    return-void
.end method

.method public final headToTailExclusive$ui_release(Lhd/l;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    invoke-interface {p1, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return-void
.end method

.method public final isUpdating$ui_release()Z
    .locals 1

    .line 1
    invoke-static {}, Landroidx/compose/ui/node/NodeChainKt;->access$getSentinelHead$p()Landroidx/compose/ui/node/NodeChainKt$SentinelHead$1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public final markAsAttached()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->markAsAttached$ui_release()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
.end method

.method public final markAsDetached$ui_release()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->markAsDetached$ui_release()V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    return-void
.end method

.method public final resetState$ui_release()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->reset$ui_release()V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeChain;->runDetachLifecycle$ui_release()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeChain;->markAsDetached$ui_release()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final runAttachLifecycle()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeChain;->outerCoordinator:Landroidx/compose/ui/node/NodeCoordinator;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/ui/node/NodeChain;->innerCoordinator:Landroidx/compose/ui/node/InnerNodeCoordinator;

    .line 4
    .line 5
    :goto_0
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->onAttach()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->getWrapped$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v1}, Landroidx/compose/ui/node/NodeCoordinator;->onAttach()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_1
    if-eqz v0, :cond_3

    .line 26
    .line 27
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->runAttachLifecycle$ui_release()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getInsertedNodeAwaitingAttachForInvalidation$ui_release()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKindKt;->autoInvalidateInsertedNode(Landroidx/compose/ui/Modifier$Node;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getUpdatedNodeAwaitingAttachForInvalidation$ui_release()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKindKt;->autoInvalidateUpdatedNode(Landroidx/compose/ui/Modifier$Node;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    const/4 v1, 0x0

    .line 49
    invoke-virtual {v0, v1}, Landroidx/compose/ui/Modifier$Node;->setInsertedNodeAwaitingAttachForInvalidation$ui_release(Z)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Landroidx/compose/ui/Modifier$Node;->setUpdatedNodeAwaitingAttachForInvalidation$ui_release(Z)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    goto :goto_1

    .line 60
    :cond_3
    return-void
.end method

.method public final runDetachLifecycle$ui_release()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->runDetachLifecycle$ui_release()V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeChain;->innerCoordinator:Landroidx/compose/ui/node/InnerNodeCoordinator;

    .line 22
    .line 23
    iget-object v1, p0, Landroidx/compose/ui/node/NodeChain;->outerCoordinator:Landroidx/compose/ui/node/NodeCoordinator;

    .line 24
    .line 25
    :goto_1
    if-eq v0, v1, :cond_2

    .line 26
    .line 27
    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->onDetach()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->getWrappedBy$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    invoke-virtual {v1}, Landroidx/compose/ui/node/NodeCoordinator;->onDetach()V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final syncCoordinators()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/NodeChain;->innerCoordinator:Landroidx/compose/ui/node/InnerNodeCoordinator;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/ui/node/NodeChain;->tail:Landroidx/compose/ui/Modifier$Node;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    :goto_0
    if-eqz v1, :cond_3

    .line 10
    .line 11
    invoke-static {v1}, Landroidx/compose/ui/node/DelegatableNodeKt;->asLayoutModifierNode(Landroidx/compose/ui/Modifier$Node;)Landroidx/compose/ui/node/LayoutModifierNode;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-eqz v2, :cond_2

    .line 16
    .line 17
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const-string v4, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator"

    .line 28
    .line 29
    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    check-cast v3, Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;

    .line 33
    .line 34
    invoke-virtual {v3}, Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;->getLayoutModifierNode()Landroidx/compose/ui/node/LayoutModifierNode;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {v3, v2}, Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;->setLayoutModifierNode$ui_release(Landroidx/compose/ui/node/LayoutModifierNode;)V

    .line 39
    .line 40
    .line 41
    if-eq v4, v1, :cond_1

    .line 42
    .line 43
    invoke-virtual {v3}, Landroidx/compose/ui/node/NodeCoordinator;->onLayoutModifierNodeChanged()V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_0
    new-instance v3, Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;

    .line 48
    .line 49
    iget-object v4, p0, Landroidx/compose/ui/node/NodeChain;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    .line 50
    .line 51
    invoke-direct {v3, v4, v2}, Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;-><init>(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/LayoutModifierNode;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v3}, Landroidx/compose/ui/Modifier$Node;->updateCoordinator$ui_release(Landroidx/compose/ui/node/NodeCoordinator;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    :goto_1
    invoke-virtual {v0, v3}, Landroidx/compose/ui/node/NodeCoordinator;->setWrappedBy$ui_release(Landroidx/compose/ui/node/NodeCoordinator;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3, v0}, Landroidx/compose/ui/node/NodeCoordinator;->setWrapped$ui_release(Landroidx/compose/ui/node/NodeCoordinator;)V

    .line 61
    .line 62
    .line 63
    move-object v0, v3

    .line 64
    goto :goto_2

    .line 65
    :cond_2
    invoke-virtual {v1, v0}, Landroidx/compose/ui/Modifier$Node;->updateCoordinator$ui_release(Landroidx/compose/ui/node/NodeCoordinator;)V

    .line 66
    .line 67
    .line 68
    :goto_2
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    goto :goto_0

    .line 73
    :cond_3
    iget-object v1, p0, Landroidx/compose/ui/node/NodeChain;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    .line 74
    .line 75
    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    if-eqz v1, :cond_4

    .line 80
    .line 81
    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getInnerCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    goto :goto_3

    .line 86
    :cond_4
    const/4 v1, 0x0

    .line 87
    :goto_3
    invoke-virtual {v0, v1}, Landroidx/compose/ui/node/NodeCoordinator;->setWrappedBy$ui_release(Landroidx/compose/ui/node/NodeCoordinator;)V

    .line 88
    .line 89
    .line 90
    iput-object v0, p0, Landroidx/compose/ui/node/NodeChain;->outerCoordinator:Landroidx/compose/ui/node/NodeCoordinator;

    .line 91
    .line 92
    return-void
.end method

.method public final synthetic tail-H91voCI$ui_release(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I)TT;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/node/NodeChain;->access$getAggregateChildKindSet(Landroidx/compose/ui/node/NodeChain;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/2addr v0, p1

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :goto_0
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    and-int/2addr v1, p1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x3

    .line 22
    const-string v1, "T"

    .line 23
    .line 24
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->m(ILjava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 p1, 0x0

    .line 34
    return-object p1
.end method

.method public final tailToHead$ui_release(ILhd/l;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/node/NodeChain;->access$getAggregateChildKindSet(Landroidx/compose/ui/node/NodeChain;)I

    move-result v0

    and-int/2addr v0, p1

    if-nez v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_2

    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v1

    and-int/2addr v1, p1

    if-eqz v1, :cond_1

    .line 4
    invoke-interface {p2, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    :cond_1
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public final tailToHead$ui_release(Lhd/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 6
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_0

    .line 7
    invoke-interface {p1, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final synthetic tailToHead-aLcG6gQ$ui_release(ILhd/l;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/node/NodeChain;->access$getAggregateChildKindSet(Landroidx/compose/ui/node/NodeChain;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/2addr v0, p1

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :goto_0
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    and-int/2addr v1, p1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    move-object v1, v0

    .line 22
    :goto_1
    if-eqz v1, :cond_0

    .line 23
    .line 24
    const/4 v2, 0x3

    .line 25
    const-string v3, "T"

    .line 26
    .line 27
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->m(ILjava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {p2, v1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-static {v1}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "["

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Landroidx/compose/ui/node/NodeChain;->head:Landroidx/compose/ui/Modifier$Node;

    .line 12
    .line 13
    iget-object v2, p0, Landroidx/compose/ui/node/NodeChain;->tail:Landroidx/compose/ui/Modifier$Node;

    .line 14
    .line 15
    const-string v3, "]"

    .line 16
    .line 17
    if-ne v1, v2, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    :goto_0
    if-eqz v1, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    if-eq v1, v2, :cond_2

    .line 34
    .line 35
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    iget-object v4, p0, Landroidx/compose/ui/node/NodeChain;->tail:Landroidx/compose/ui/Modifier$Node;

    .line 47
    .line 48
    if-ne v2, v4, :cond_1

    .line 49
    .line 50
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    const-string v2, ","

    .line 55
    .line 56
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    goto :goto_0

    .line 64
    :cond_2
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    const-string/jumbo v1, "toString(...)"

    .line 69
    .line 70
    .line 71
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return-object v0
.end method

.method public final updateFrom$ui_release(Landroidx/compose/ui/Modifier;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/compose/ui/node/NodeChain;->padChain()Landroidx/compose/ui/Modifier$Node;

    .line 4
    .line 5
    .line 6
    move-result-object v6

    .line 7
    iget-object v2, v0, Landroidx/compose/ui/node/NodeChain;->current:Landroidx/compose/runtime/collection/MutableVector;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {v2}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v3, v1

    .line 18
    :goto_0
    iget-object v4, v0, Landroidx/compose/ui/node/NodeChain;->buffer:Landroidx/compose/runtime/collection/MutableVector;

    .line 19
    .line 20
    const/16 v5, 0x10

    .line 21
    .line 22
    if-nez v4, :cond_1

    .line 23
    .line 24
    new-instance v4, Landroidx/compose/runtime/collection/MutableVector;

    .line 25
    .line 26
    new-array v7, v5, [Landroidx/compose/ui/Modifier$Element;

    .line 27
    .line 28
    invoke-direct {v4, v7, v1}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 29
    .line 30
    .line 31
    :cond_1
    move-object/from16 v7, p1

    .line 32
    .line 33
    invoke-static {v7, v4}, Landroidx/compose/ui/node/NodeChainKt;->access$fillVector(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/runtime/collection/MutableVector;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-virtual {v4}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    const/4 v8, 0x0

    .line 42
    const-string v9, "expected prior modifier list to be non-empty"

    .line 43
    .line 44
    const/4 v10, 0x1

    .line 45
    if-ne v7, v3, :cond_c

    .line 46
    .line 47
    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    move v12, v1

    .line 52
    move-object/from16 v16, v5

    .line 53
    .line 54
    :goto_1
    if-eqz v16, :cond_9

    .line 55
    .line 56
    if-ge v12, v3, :cond_9

    .line 57
    .line 58
    if-eqz v2, :cond_8

    .line 59
    .line 60
    iget-object v5, v2, Landroidx/compose/runtime/collection/MutableVector;->content:[Ljava/lang/Object;

    .line 61
    .line 62
    aget-object v5, v5, v12

    .line 63
    .line 64
    move-object v14, v5

    .line 65
    check-cast v14, Landroidx/compose/ui/Modifier$Element;

    .line 66
    .line 67
    iget-object v5, v4, Landroidx/compose/runtime/collection/MutableVector;->content:[Ljava/lang/Object;

    .line 68
    .line 69
    aget-object v5, v5, v12

    .line 70
    .line 71
    move-object v15, v5

    .line 72
    check-cast v15, Landroidx/compose/ui/Modifier$Element;

    .line 73
    .line 74
    invoke-static {v14, v15}, Landroidx/compose/ui/node/NodeChainKt;->actionForModifiers(Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Element;)I

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    if-eqz v5, :cond_6

    .line 79
    .line 80
    if-eq v5, v10, :cond_4

    .line 81
    .line 82
    const/4 v7, 0x2

    .line 83
    if-eq v5, v7, :cond_3

    .line 84
    .line 85
    :cond_2
    :goto_2
    move-object/from16 v5, v16

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_3
    iget-object v11, v0, Landroidx/compose/ui/node/NodeChain;->logger:Landroidx/compose/ui/node/NodeChain$Logger;

    .line 89
    .line 90
    if-eqz v11, :cond_2

    .line 91
    .line 92
    move v13, v12

    .line 93
    invoke-interface/range {v11 .. v16}, Landroidx/compose/ui/node/NodeChain$Logger;->nodeReused(IILandroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;)V

    .line 94
    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_4
    move-object/from16 v5, v16

    .line 98
    .line 99
    invoke-direct {v0, v14, v15, v5}, Landroidx/compose/ui/node/NodeChain;->updateNode(Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;)V

    .line 100
    .line 101
    .line 102
    iget-object v11, v0, Landroidx/compose/ui/node/NodeChain;->logger:Landroidx/compose/ui/node/NodeChain$Logger;

    .line 103
    .line 104
    if-eqz v11, :cond_5

    .line 105
    .line 106
    move v13, v12

    .line 107
    move-object/from16 v16, v5

    .line 108
    .line 109
    invoke-interface/range {v11 .. v16}, Landroidx/compose/ui/node/NodeChain$Logger;->nodeUpdated(IILandroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;)V

    .line 110
    .line 111
    .line 112
    :cond_5
    :goto_3
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 113
    .line 114
    .line 115
    move-result-object v16

    .line 116
    add-int/lit8 v12, v12, 0x1

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_6
    move-object/from16 v5, v16

    .line 120
    .line 121
    iget-object v7, v0, Landroidx/compose/ui/node/NodeChain;->logger:Landroidx/compose/ui/node/NodeChain$Logger;

    .line 122
    .line 123
    if-eqz v7, :cond_7

    .line 124
    .line 125
    invoke-interface {v7, v12, v14, v15, v5}, Landroidx/compose/ui/node/NodeChain$Logger;->linearDiffAborted(ILandroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;)V

    .line 126
    .line 127
    .line 128
    :cond_7
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 129
    .line 130
    .line 131
    move-result-object v16

    .line 132
    goto :goto_4

    .line 133
    :cond_8
    invoke-static {v9}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateExceptionForNullCheck(Ljava/lang/String;)Ljava/lang/Void;

    .line 134
    .line 135
    .line 136
    new-instance v1, Lkotlin/KotlinNothingValueException;

    .line 137
    .line 138
    invoke-direct {v1}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 139
    .line 140
    .line 141
    throw v1

    .line 142
    :cond_9
    move-object/from16 v5, v16

    .line 143
    .line 144
    move-object/from16 v16, v5

    .line 145
    .line 146
    :goto_4
    if-ge v12, v3, :cond_13

    .line 147
    .line 148
    if-eqz v2, :cond_b

    .line 149
    .line 150
    if-eqz v16, :cond_a

    .line 151
    .line 152
    iget-object v1, v0, Landroidx/compose/ui/node/NodeChain;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    .line 153
    .line 154
    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getApplyingModifierOnAttach$ui_release()Z

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    xor-int/lit8 v5, v1, 0x1

    .line 159
    .line 160
    move-object v3, v4

    .line 161
    move v1, v12

    .line 162
    move-object/from16 v4, v16

    .line 163
    .line 164
    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/node/NodeChain;->structuralUpdate(ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;Z)V

    .line 165
    .line 166
    .line 167
    :goto_5
    move-object v4, v6

    .line 168
    :goto_6
    move v1, v10

    .line 169
    goto/16 :goto_a

    .line 170
    .line 171
    :cond_a
    const-string/jumbo v1, "structuralUpdate requires a non-null tail"

    .line 172
    .line 173
    .line 174
    invoke-static {v1}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateExceptionForNullCheck(Ljava/lang/String;)Ljava/lang/Void;

    .line 175
    .line 176
    .line 177
    new-instance v1, Lkotlin/KotlinNothingValueException;

    .line 178
    .line 179
    invoke-direct {v1}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 180
    .line 181
    .line 182
    throw v1

    .line 183
    :cond_b
    invoke-static {v9}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateExceptionForNullCheck(Ljava/lang/String;)Ljava/lang/Void;

    .line 184
    .line 185
    .line 186
    new-instance v1, Lkotlin/KotlinNothingValueException;

    .line 187
    .line 188
    invoke-direct {v1}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 189
    .line 190
    .line 191
    throw v1

    .line 192
    :cond_c
    iget-object v7, v0, Landroidx/compose/ui/node/NodeChain;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    .line 193
    .line 194
    invoke-virtual {v7}, Landroidx/compose/ui/node/LayoutNode;->getApplyingModifierOnAttach$ui_release()Z

    .line 195
    .line 196
    .line 197
    move-result v7

    .line 198
    if-eqz v7, :cond_f

    .line 199
    .line 200
    if-nez v3, :cond_f

    .line 201
    .line 202
    move v13, v1

    .line 203
    move-object v15, v6

    .line 204
    :goto_7
    invoke-virtual {v4}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    if-ge v13, v1, :cond_e

    .line 209
    .line 210
    iget-object v1, v4, Landroidx/compose/runtime/collection/MutableVector;->content:[Ljava/lang/Object;

    .line 211
    .line 212
    aget-object v1, v1, v13

    .line 213
    .line 214
    move-object v14, v1

    .line 215
    check-cast v14, Landroidx/compose/ui/Modifier$Element;

    .line 216
    .line 217
    invoke-direct {v0, v14, v15}, Landroidx/compose/ui/node/NodeChain;->createAndInsertNodeAsChild(Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;)Landroidx/compose/ui/Modifier$Node;

    .line 218
    .line 219
    .line 220
    move-result-object v16

    .line 221
    iget-object v11, v0, Landroidx/compose/ui/node/NodeChain;->logger:Landroidx/compose/ui/node/NodeChain$Logger;

    .line 222
    .line 223
    if-eqz v11, :cond_d

    .line 224
    .line 225
    const/4 v12, 0x0

    .line 226
    invoke-interface/range {v11 .. v16}, Landroidx/compose/ui/node/NodeChain$Logger;->nodeInserted(IILandroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/Modifier$Node;)V

    .line 227
    .line 228
    .line 229
    :cond_d
    add-int/lit8 v13, v13, 0x1

    .line 230
    .line 231
    move-object/from16 v15, v16

    .line 232
    .line 233
    goto :goto_7

    .line 234
    :cond_e
    invoke-direct {v0}, Landroidx/compose/ui/node/NodeChain;->syncAggregateChildKindSet()V

    .line 235
    .line 236
    .line 237
    move-object v3, v4

    .line 238
    goto :goto_5

    .line 239
    :cond_f
    invoke-virtual {v4}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 240
    .line 241
    .line 242
    move-result v3

    .line 243
    if-nez v3, :cond_15

    .line 244
    .line 245
    if-eqz v2, :cond_14

    .line 246
    .line 247
    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    move v5, v1

    .line 252
    :goto_8
    if-eqz v3, :cond_11

    .line 253
    .line 254
    invoke-virtual {v2}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 255
    .line 256
    .line 257
    move-result v7

    .line 258
    if-ge v5, v7, :cond_11

    .line 259
    .line 260
    iget-object v7, v0, Landroidx/compose/ui/node/NodeChain;->logger:Landroidx/compose/ui/node/NodeChain$Logger;

    .line 261
    .line 262
    if-eqz v7, :cond_10

    .line 263
    .line 264
    iget-object v9, v2, Landroidx/compose/runtime/collection/MutableVector;->content:[Ljava/lang/Object;

    .line 265
    .line 266
    aget-object v9, v9, v5

    .line 267
    .line 268
    check-cast v9, Landroidx/compose/ui/Modifier$Element;

    .line 269
    .line 270
    invoke-interface {v7, v5, v9, v3}, Landroidx/compose/ui/node/NodeChain$Logger;->nodeRemoved(ILandroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;)V

    .line 271
    .line 272
    .line 273
    :cond_10
    invoke-direct {v0, v3}, Landroidx/compose/ui/node/NodeChain;->detachAndRemoveNode(Landroidx/compose/ui/Modifier$Node;)Landroidx/compose/ui/Modifier$Node;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    invoke-virtual {v3}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    add-int/lit8 v5, v5, 0x1

    .line 282
    .line 283
    goto :goto_8

    .line 284
    :cond_11
    iget-object v3, v0, Landroidx/compose/ui/node/NodeChain;->innerCoordinator:Landroidx/compose/ui/node/InnerNodeCoordinator;

    .line 285
    .line 286
    iget-object v5, v0, Landroidx/compose/ui/node/NodeChain;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    .line 287
    .line 288
    invoke-virtual {v5}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    .line 289
    .line 290
    .line 291
    move-result-object v5

    .line 292
    if-eqz v5, :cond_12

    .line 293
    .line 294
    invoke-virtual {v5}, Landroidx/compose/ui/node/LayoutNode;->getInnerCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    .line 295
    .line 296
    .line 297
    move-result-object v5

    .line 298
    goto :goto_9

    .line 299
    :cond_12
    move-object v5, v8

    .line 300
    :goto_9
    invoke-virtual {v3, v5}, Landroidx/compose/ui/node/NodeCoordinator;->setWrappedBy$ui_release(Landroidx/compose/ui/node/NodeCoordinator;)V

    .line 301
    .line 302
    .line 303
    iget-object v3, v0, Landroidx/compose/ui/node/NodeChain;->innerCoordinator:Landroidx/compose/ui/node/InnerNodeCoordinator;

    .line 304
    .line 305
    iput-object v3, v0, Landroidx/compose/ui/node/NodeChain;->outerCoordinator:Landroidx/compose/ui/node/NodeCoordinator;

    .line 306
    .line 307
    :cond_13
    move-object v3, v4

    .line 308
    move-object v4, v6

    .line 309
    goto :goto_a

    .line 310
    :cond_14
    invoke-static {v9}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateExceptionForNullCheck(Ljava/lang/String;)Ljava/lang/Void;

    .line 311
    .line 312
    .line 313
    new-instance v1, Lkotlin/KotlinNothingValueException;

    .line 314
    .line 315
    invoke-direct {v1}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 316
    .line 317
    .line 318
    throw v1

    .line 319
    :cond_15
    if-nez v2, :cond_16

    .line 320
    .line 321
    new-instance v2, Landroidx/compose/runtime/collection/MutableVector;

    .line 322
    .line 323
    new-array v3, v5, [Landroidx/compose/ui/Modifier$Element;

    .line 324
    .line 325
    invoke-direct {v2, v3, v1}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 326
    .line 327
    .line 328
    :cond_16
    iget-object v1, v0, Landroidx/compose/ui/node/NodeChain;->layoutNode:Landroidx/compose/ui/node/LayoutNode;

    .line 329
    .line 330
    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getApplyingModifierOnAttach$ui_release()Z

    .line 331
    .line 332
    .line 333
    move-result v1

    .line 334
    xor-int/lit8 v5, v1, 0x1

    .line 335
    .line 336
    const/4 v1, 0x0

    .line 337
    move-object v3, v4

    .line 338
    move-object v4, v6

    .line 339
    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/node/NodeChain;->structuralUpdate(ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;Z)V

    .line 340
    .line 341
    .line 342
    goto/16 :goto_6

    .line 343
    .line 344
    :goto_a
    iput-object v3, v0, Landroidx/compose/ui/node/NodeChain;->current:Landroidx/compose/runtime/collection/MutableVector;

    .line 345
    .line 346
    if-eqz v2, :cond_17

    .line 347
    .line 348
    invoke-virtual {v2}, Landroidx/compose/runtime/collection/MutableVector;->clear()V

    .line 349
    .line 350
    .line 351
    move-object v8, v2

    .line 352
    :cond_17
    iput-object v8, v0, Landroidx/compose/ui/node/NodeChain;->buffer:Landroidx/compose/runtime/collection/MutableVector;

    .line 353
    .line 354
    invoke-direct {v0, v4}, Landroidx/compose/ui/node/NodeChain;->trimChain(Landroidx/compose/ui/Modifier$Node;)Landroidx/compose/ui/Modifier$Node;

    .line 355
    .line 356
    .line 357
    move-result-object v2

    .line 358
    iput-object v2, v0, Landroidx/compose/ui/node/NodeChain;->head:Landroidx/compose/ui/Modifier$Node;

    .line 359
    .line 360
    if-eqz v1, :cond_18

    .line 361
    .line 362
    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeChain;->syncCoordinators()V

    .line 363
    .line 364
    .line 365
    :cond_18
    return-void
.end method

.method public final useLogger$ui_release(Landroidx/compose/ui/node/NodeChain$Logger;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/node/NodeChain;->logger:Landroidx/compose/ui/node/NodeChain$Logger;

    .line 2
    .line 3
    return-void
.end method
