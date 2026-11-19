.class final Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;
.super Landroidx/compose/ui/node/DelegatingNode;
.source "SourceFile"


# instance fields
.field private final cacheDrawScopeDragShadowCallback:Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback;

.field private final dragAndDropModifierNode:Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;


# direct methods
.method public constructor <init>(Lhd/p;Lhd/l;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/p;",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/node/DelegatingNode;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback;

    .line 5
    .line 6
    invoke-direct {v0}, Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v1, Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter$cacheDrawScopeDragShadowCallback$1$1;

    .line 10
    .line 11
    invoke-direct {v1, v0}, Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter$cacheDrawScopeDragShadowCallback$1$1;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v1}, Landroidx/compose/ui/draw/DrawModifierKt;->CacheDrawModifierNode(Lhd/l;)Landroidx/compose/ui/draw/CacheDrawModifierNode;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {p0, v1}, Landroidx/compose/ui/node/DelegatingNode;->delegate(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/DelegatableNode;

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;->cacheDrawScopeDragShadowCallback:Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback;

    .line 22
    .line 23
    new-instance v0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;

    .line 24
    .line 25
    new-instance v1, Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter$dragAndDropModifierNode$1;

    .line 26
    .line 27
    invoke-direct {v1, p0}, Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter$dragAndDropModifierNode$1;-><init>(Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;)V

    .line 28
    .line 29
    .line 30
    invoke-direct {v0, v1, p1, p2}, Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;-><init>(Lhd/l;Lhd/p;Lhd/l;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/DelegatingNode;->delegate(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/DelegatableNode;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;

    .line 38
    .line 39
    iput-object p1, p0, Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;->dragAndDropModifierNode:Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;

    .line 40
    .line 41
    return-void
.end method

.method public static final synthetic access$getCacheDrawScopeDragShadowCallback$p(Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;)Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;->cacheDrawScopeDragShadowCallback:Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback;

    .line 2
    .line 3
    return-object p0
.end method

.method private static getDetectDragStart$delegate(Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;)Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v0, Lkotlin/jvm/internal/MutablePropertyReference0Impl;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;->dragAndDropModifierNode:Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;

    .line 4
    .line 5
    const-string v4, "getDetectDragStart()Lkotlin/jvm/functions/Function2;"

    .line 6
    .line 7
    const/4 v5, 0x0

    .line 8
    const-class v2, Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;

    .line 9
    .line 10
    const-string v3, "detectDragStart"

    .line 11
    .line 12
    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/MutablePropertyReference0Impl;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lkotlin/jvm/internal/y;->d(Lkotlin/jvm/internal/MutablePropertyReference0;)Lod/i;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method private static getTransferData$delegate(Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;)Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v0, Lkotlin/jvm/internal/MutablePropertyReference0Impl;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;->dragAndDropModifierNode:Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;

    .line 4
    .line 5
    const-string v4, "getTransferData()Lkotlin/jvm/functions/Function1;"

    .line 6
    .line 7
    const/4 v5, 0x0

    .line 8
    const-class v2, Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;

    .line 9
    .line 10
    const-string v3, "transferData"

    .line 11
    .line 12
    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/MutablePropertyReference0Impl;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lkotlin/jvm/internal/y;->d(Lkotlin/jvm/internal/MutablePropertyReference0;)Lod/i;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method


# virtual methods
.method public final getDetectDragStart()Lhd/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/p;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;->dragAndDropModifierNode:Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;->getDetectDragStart()Lhd/p;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final getTransferData()Lhd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;->dragAndDropModifierNode:Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;->getTransferData()Lhd/l;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final setDetectDragStart(Lhd/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/p;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;->dragAndDropModifierNode:Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;->setDetectDragStart(Lhd/p;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setTransferData(Lhd/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;->dragAndDropModifierNode:Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;->setTransferData(Lhd/l;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
