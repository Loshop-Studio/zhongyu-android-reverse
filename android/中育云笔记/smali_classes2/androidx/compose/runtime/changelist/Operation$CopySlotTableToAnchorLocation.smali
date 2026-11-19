.class public final Landroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation;
.super Landroidx/compose/runtime/changelist/Operation;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/runtime/changelist/Operation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CopySlotTableToAnchorLocation"
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Landroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation;

    invoke-direct {v0}, Landroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation;-><init>()V

    sput-object v0, Landroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation;->INSTANCE:Landroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation;

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x4

    .line 5
    invoke-direct {p0, v2, v3, v0, v1}, Landroidx/compose/runtime/changelist/Operation;-><init>(IIILkotlin/jvm/internal/n;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public execute(Landroidx/compose/runtime/changelist/OperationArgContainer;Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/changelist/OperationArgContainer;",
            "Landroidx/compose/runtime/Applier<",
            "*>;",
            "Landroidx/compose/runtime/SlotWriter;",
            "Landroidx/compose/runtime/RememberManager;",
            ")V"
        }
    .end annotation

    .line 1
    const/4 p2, 0x2

    .line 2
    invoke-static {p2}, Landroidx/compose/runtime/changelist/Operation$ObjectParameter;->constructor-impl(I)I

    .line 3
    .line 4
    .line 5
    move-result p4

    .line 6
    invoke-interface {p1, p4}, Landroidx/compose/runtime/changelist/OperationArgContainer;->getObject-31yXWZQ(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p4

    .line 10
    check-cast p4, Landroidx/compose/runtime/MovableContentStateReference;

    .line 11
    .line 12
    const/4 v0, 0x3

    .line 13
    invoke-static {v0}, Landroidx/compose/runtime/changelist/Operation$ObjectParameter;->constructor-impl(I)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-interface {p1, v0}, Landroidx/compose/runtime/changelist/OperationArgContainer;->getObject-31yXWZQ(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Landroidx/compose/runtime/MovableContentStateReference;

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    invoke-static {v1}, Landroidx/compose/runtime/changelist/Operation$ObjectParameter;->constructor-impl(I)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-interface {p1, v2}, Landroidx/compose/runtime/changelist/OperationArgContainer;->getObject-31yXWZQ(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Landroidx/compose/runtime/CompositionContext;

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    invoke-static {v3}, Landroidx/compose/runtime/changelist/Operation$ObjectParameter;->constructor-impl(I)I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    invoke-interface {p1, v3}, Landroidx/compose/runtime/changelist/OperationArgContainer;->getObject-31yXWZQ(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, Landroidx/compose/runtime/MovableContentState;

    .line 44
    .line 45
    if-nez p1, :cond_1

    .line 46
    .line 47
    invoke-virtual {v2, p4}, Landroidx/compose/runtime/CompositionContext;->movableContentStateResolve$runtime_release(Landroidx/compose/runtime/MovableContentStateReference;)Landroidx/compose/runtime/MovableContentState;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-eqz p1, :cond_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    const-string p1, "Could not resolve state for movable content"

    .line 55
    .line 56
    invoke-static {p1}, Landroidx/compose/runtime/ComposerKt;->composeRuntimeError(Ljava/lang/String;)Ljava/lang/Void;

    .line 57
    .line 58
    .line 59
    new-instance p1, Lkotlin/KotlinNothingValueException;

    .line 60
    .line 61
    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 62
    .line 63
    .line 64
    throw p1

    .line 65
    :cond_1
    :goto_0
    invoke-virtual {p1}, Landroidx/compose/runtime/MovableContentState;->getSlotTable$runtime_release()Landroidx/compose/runtime/SlotTable;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p3, v1, p1, p2}, Landroidx/compose/runtime/SlotWriter;->moveIntoGroupFrom(ILandroidx/compose/runtime/SlotTable;I)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    sget-object p2, Landroidx/compose/runtime/RecomposeScopeImpl;->Companion:Landroidx/compose/runtime/RecomposeScopeImpl$Companion;

    .line 74
    .line 75
    invoke-virtual {v0}, Landroidx/compose/runtime/MovableContentStateReference;->getComposition$runtime_release()Landroidx/compose/runtime/ControlledComposition;

    .line 76
    .line 77
    .line 78
    move-result-object p4

    .line 79
    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeOwner"

    .line 80
    .line 81
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    check-cast p4, Landroidx/compose/runtime/RecomposeScopeOwner;

    .line 85
    .line 86
    invoke-virtual {p2, p3, p1, p4}, Landroidx/compose/runtime/RecomposeScopeImpl$Companion;->adoptAnchoredScopes$runtime_release(Landroidx/compose/runtime/SlotWriter;Ljava/util/List;Landroidx/compose/runtime/RecomposeScopeOwner;)V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public final getFrom-HpuvwBQ()I
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Landroidx/compose/runtime/changelist/Operation$ObjectParameter;->constructor-impl(I)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    return v0
.end method

.method public final getParentCompositionContext-HpuvwBQ()I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Landroidx/compose/runtime/changelist/Operation$ObjectParameter;->constructor-impl(I)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    return v0
.end method

.method public final getResolvedState-HpuvwBQ()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Landroidx/compose/runtime/changelist/Operation$ObjectParameter;->constructor-impl(I)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    return v0
.end method

.method public final getTo-HpuvwBQ()I
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/compose/runtime/changelist/Operation$ObjectParameter;->constructor-impl(I)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    return v0
.end method

.method public objectParamName-31yXWZQ(I)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Landroidx/compose/runtime/changelist/Operation$ObjectParameter;->constructor-impl(I)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    invoke-static {p1, v0}, Landroidx/compose/runtime/changelist/Operation$ObjectParameter;->equals-impl0(II)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const-string/jumbo p1, "resolvedState"

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    const/4 v0, 0x1

    .line 17
    invoke-static {v0}, Landroidx/compose/runtime/changelist/Operation$ObjectParameter;->constructor-impl(I)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {p1, v0}, Landroidx/compose/runtime/changelist/Operation$ObjectParameter;->equals-impl0(II)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    const-string/jumbo p1, "resolvedCompositionContext"

    .line 28
    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_1
    const/4 v0, 0x2

    .line 32
    invoke-static {v0}, Landroidx/compose/runtime/changelist/Operation$ObjectParameter;->constructor-impl(I)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-static {p1, v0}, Landroidx/compose/runtime/changelist/Operation$ObjectParameter;->equals-impl0(II)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    const-string p1, "from"

    .line 43
    .line 44
    return-object p1

    .line 45
    :cond_2
    const/4 v0, 0x3

    .line 46
    invoke-static {v0}, Landroidx/compose/runtime/changelist/Operation$ObjectParameter;->constructor-impl(I)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    invoke-static {p1, v0}, Landroidx/compose/runtime/changelist/Operation$ObjectParameter;->equals-impl0(II)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    const-string/jumbo p1, "to"

    .line 57
    .line 58
    .line 59
    return-object p1

    .line 60
    :cond_3
    invoke-super {p0, p1}, Landroidx/compose/runtime/changelist/Operation;->objectParamName-31yXWZQ(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    return-object p1
.end method
