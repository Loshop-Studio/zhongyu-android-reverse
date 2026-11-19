.class final Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;
.super Landroidx/compose/ui/Modifier$Node;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/node/SemanticsModifierNode;


# instance fields
.field private final indexForKeyMapping:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field private itemProviderLambda:Lhd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/a;"
        }
    .end annotation
.end field

.field private orientation:Landroidx/compose/foundation/gestures/Orientation;

.field private reverseScrolling:Z

.field private scrollAxisRange:Landroidx/compose/ui/semantics/ScrollAxisRange;

.field private scrollToIndexAction:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field private state:Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;

.field private userScrollEnabled:Z


# direct methods
.method public constructor <init>(Lhd/a;Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;Landroidx/compose/foundation/gestures/Orientation;ZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/a;",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;",
            "Landroidx/compose/foundation/gestures/Orientation;",
            "ZZ)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/Modifier$Node;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;->itemProviderLambda:Lhd/a;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;->state:Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;->orientation:Landroidx/compose/foundation/gestures/Orientation;

    .line 9
    .line 10
    iput-boolean p4, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;->userScrollEnabled:Z

    .line 11
    .line 12
    iput-boolean p5, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;->reverseScrolling:Z

    .line 13
    .line 14
    new-instance p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode$indexForKeyMapping$1;

    .line 15
    .line 16
    invoke-direct {p1, p0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode$indexForKeyMapping$1;-><init>(Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;->indexForKeyMapping:Lhd/l;

    .line 20
    .line 21
    invoke-direct {p0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;->updateCachedSemanticsValues()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public static final synthetic access$getItemProviderLambda$p(Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;)Lhd/a;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;->itemProviderLambda:Lhd/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getState$p(Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;)Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;->state:Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;

    .line 2
    .line 3
    return-object p0
.end method

.method private final getCollectionInfo()Landroidx/compose/ui/semantics/CollectionInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;->state:Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;->collectionInfo()Landroidx/compose/ui/semantics/CollectionInfo;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method private final isVertical()Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;->orientation:Landroidx/compose/foundation/gestures/Orientation;

    .line 2
    .line 3
    sget-object v1, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method private final updateCachedSemanticsValues()V
    .locals 4

    .line 1
    new-instance v0, Landroidx/compose/ui/semantics/ScrollAxisRange;

    .line 2
    .line 3
    new-instance v1, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$1;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$1;-><init>(Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;)V

    .line 6
    .line 7
    .line 8
    new-instance v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$2;

    .line 9
    .line 10
    invoke-direct {v2, p0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$2;-><init>(Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;)V

    .line 11
    .line 12
    .line 13
    iget-boolean v3, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;->reverseScrolling:Z

    .line 14
    .line 15
    invoke-direct {v0, v1, v2, v3}, Landroidx/compose/ui/semantics/ScrollAxisRange;-><init>(Lhd/a;Lhd/a;Z)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;->scrollAxisRange:Landroidx/compose/ui/semantics/ScrollAxisRange;

    .line 19
    .line 20
    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;->userScrollEnabled:Z

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    new-instance v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3;

    .line 25
    .line 26
    invoke-direct {v0, p0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3;-><init>(Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v0, 0x0

    .line 31
    :goto_0
    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;->scrollToIndexAction:Lhd/l;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public applySemantics(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p1, v0}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->setTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Z)V

    .line 3
    .line 4
    .line 5
    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;->indexForKeyMapping:Lhd/l;

    .line 6
    .line 7
    invoke-static {p1, v1}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->indexForKey(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Lhd/l;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;->isVertical()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const-string v2, "scrollAxisRange"

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;->scrollAxisRange:Landroidx/compose/ui/semantics/ScrollAxisRange;

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    move-object v1, v3

    .line 27
    :cond_0
    invoke-static {p1, v1}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->setVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/ScrollAxisRange;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;->scrollAxisRange:Landroidx/compose/ui/semantics/ScrollAxisRange;

    .line 32
    .line 33
    if-nez v1, :cond_2

    .line 34
    .line 35
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    move-object v1, v3

    .line 39
    :cond_2
    invoke-static {p1, v1}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->setHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/ScrollAxisRange;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;->scrollToIndexAction:Lhd/l;

    .line 43
    .line 44
    if-eqz v1, :cond_3

    .line 45
    .line 46
    invoke-static {p1, v3, v1, v0, v3}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->scrollToIndex$default(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lhd/l;ILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    :cond_3
    new-instance v1, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode$applySemantics$2;

    .line 50
    .line 51
    invoke-direct {v1, p0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode$applySemantics$2;-><init>(Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;)V

    .line 52
    .line 53
    .line 54
    invoke-static {p1, v3, v1, v0, v3}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->getScrollViewportLength$default(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lhd/a;ILjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-direct {p0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;->getCollectionInfo()Landroidx/compose/ui/semantics/CollectionInfo;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {p1, v0}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->setCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/CollectionInfo;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public getShouldAutoInvalidate()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final update(Lhd/a;Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;Landroidx/compose/foundation/gestures/Orientation;ZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/a;",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;",
            "Landroidx/compose/foundation/gestures/Orientation;",
            "ZZ)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;->itemProviderLambda:Lhd/a;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;->state:Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;

    .line 4
    .line 5
    iget-object p1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;->orientation:Landroidx/compose/foundation/gestures/Orientation;

    .line 6
    .line 7
    if-eq p1, p3, :cond_0

    .line 8
    .line 9
    iput-object p3, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;->orientation:Landroidx/compose/foundation/gestures/Orientation;

    .line 10
    .line 11
    invoke-static {p0}, Landroidx/compose/ui/node/SemanticsModifierNodeKt;->invalidateSemantics(Landroidx/compose/ui/node/SemanticsModifierNode;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-boolean p1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;->userScrollEnabled:Z

    .line 15
    .line 16
    if-ne p1, p4, :cond_2

    .line 17
    .line 18
    iget-boolean p1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;->reverseScrolling:Z

    .line 19
    .line 20
    if-eq p1, p5, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    return-void

    .line 24
    :cond_2
    :goto_0
    iput-boolean p4, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;->userScrollEnabled:Z

    .line 25
    .line 26
    iput-boolean p5, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;->reverseScrolling:Z

    .line 27
    .line 28
    invoke-direct {p0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;->updateCachedSemanticsValues()V

    .line 29
    .line 30
    .line 31
    invoke-static {p0}, Landroidx/compose/ui/node/SemanticsModifierNodeKt;->invalidateSemantics(Landroidx/compose/ui/node/SemanticsModifierNode;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method
