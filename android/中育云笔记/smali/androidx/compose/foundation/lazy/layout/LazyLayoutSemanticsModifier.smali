.class final Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;
.super Landroidx/compose/ui/node/ModifierNodeElement;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/compose/ui/node/ModifierNodeElement<",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;",
        ">;"
    }
.end annotation


# instance fields
.field private final itemProviderLambda:Lhd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/a;"
        }
    .end annotation
.end field

.field private final orientation:Landroidx/compose/foundation/gestures/Orientation;

.field private final reverseScrolling:Z

.field private final state:Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;

.field private final userScrollEnabled:Z


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
    invoke-direct {p0}, Landroidx/compose/ui/node/ModifierNodeElement;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->itemProviderLambda:Lhd/a;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->state:Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->orientation:Landroidx/compose/foundation/gestures/Orientation;

    .line 9
    .line 10
    iput-boolean p4, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->userScrollEnabled:Z

    .line 11
    .line 12
    iput-boolean p5, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->reverseScrolling:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public create()Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;
    .locals 6

    .line 2
    new-instance v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;

    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->itemProviderLambda:Lhd/a;

    .line 4
    iget-object v2, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->state:Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;

    .line 5
    iget-object v3, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->orientation:Landroidx/compose/foundation/gestures/Orientation;

    .line 6
    iget-boolean v4, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->userScrollEnabled:Z

    .line 7
    iget-boolean v5, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->reverseScrolling:Z

    .line 8
    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;-><init>(Lhd/a;Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;Landroidx/compose/foundation/gestures/Orientation;ZZ)V

    return-object v0
.end method

.method public bridge synthetic create()Landroidx/compose/ui/Modifier$Node;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->create()Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->itemProviderLambda:Lhd/a;

    .line 12
    .line 13
    check-cast p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;

    .line 14
    .line 15
    iget-object v3, p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->itemProviderLambda:Lhd/a;

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->state:Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;

    .line 21
    .line 22
    iget-object v3, p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->state:Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;

    .line 23
    .line 24
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->orientation:Landroidx/compose/foundation/gestures/Orientation;

    .line 32
    .line 33
    iget-object v3, p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->orientation:Landroidx/compose/foundation/gestures/Orientation;

    .line 34
    .line 35
    if-eq v1, v3, :cond_4

    .line 36
    .line 37
    return v2

    .line 38
    :cond_4
    iget-boolean v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->userScrollEnabled:Z

    .line 39
    .line 40
    iget-boolean v3, p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->userScrollEnabled:Z

    .line 41
    .line 42
    if-eq v1, v3, :cond_5

    .line 43
    .line 44
    return v2

    .line 45
    :cond_5
    iget-boolean v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->reverseScrolling:Z

    .line 46
    .line 47
    iget-boolean p1, p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->reverseScrolling:Z

    .line 48
    .line 49
    if-eq v1, p1, :cond_6

    .line 50
    .line 51
    return v2

    .line 52
    :cond_6
    return v0
.end method

.method public final getItemProviderLambda()Lhd/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/a;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->itemProviderLambda:Lhd/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOrientation()Landroidx/compose/foundation/gestures/Orientation;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->orientation:Landroidx/compose/foundation/gestures/Orientation;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getReverseScrolling()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->reverseScrolling:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getState()Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->state:Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUserScrollEnabled()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->userScrollEnabled:Z

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->itemProviderLambda:Lhd/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->state:Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v0, v1

    .line 16
    mul-int/lit8 v0, v0, 0x1f

    .line 17
    .line 18
    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->orientation:Landroidx/compose/foundation/gestures/Orientation;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    add-int/2addr v0, v1

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-boolean v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->userScrollEnabled:Z

    .line 28
    .line 29
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v0, v1

    .line 34
    mul-int/lit8 v0, v0, 0x1f

    .line 35
    .line 36
    iget-boolean v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->reverseScrolling:Z

    .line 37
    .line 38
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    add-int/2addr v0, v1

    .line 43
    return v0
.end method

.method public inspectableProperties(Landroidx/compose/ui/platform/InspectorInfo;)V
    .locals 0

    return-void
.end method

.method public update(Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;)V
    .locals 6

    .line 2
    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->itemProviderLambda:Lhd/a;

    .line 3
    iget-object v2, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->state:Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;

    .line 4
    iget-object v3, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->orientation:Landroidx/compose/foundation/gestures/Orientation;

    .line 5
    iget-boolean v4, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->userScrollEnabled:Z

    .line 6
    iget-boolean v5, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->reverseScrolling:Z

    move-object v0, p1

    .line 7
    invoke-virtual/range {v0 .. v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;->update(Lhd/a;Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;Landroidx/compose/foundation/gestures/Orientation;ZZ)V

    return-void
.end method

.method public bridge synthetic update(Landroidx/compose/ui/Modifier$Node;)V
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;->update(Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;)V

    return-void
.end method
