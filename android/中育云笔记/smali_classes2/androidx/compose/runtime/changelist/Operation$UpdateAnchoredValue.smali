.class public final Landroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue;
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
    name = "UpdateAnchoredValue"
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Landroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue;

    invoke-direct {v0}, Landroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue;-><init>()V

    sput-object v0, Landroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue;->INSTANCE:Landroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    invoke-direct {p0, v2, v0, v1}, Landroidx/compose/runtime/changelist/Operation;-><init>(IILkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public execute(Landroidx/compose/runtime/changelist/OperationArgContainer;Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V
    .locals 2
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
    const/4 p2, 0x0

    .line 2
    invoke-static {p2}, Landroidx/compose/runtime/changelist/Operation$ObjectParameter;->constructor-impl(I)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    invoke-interface {p1, v0}, Landroidx/compose/runtime/changelist/OperationArgContainer;->getObject-31yXWZQ(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-static {v1}, Landroidx/compose/runtime/changelist/Operation$ObjectParameter;->constructor-impl(I)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-interface {p1, v1}, Landroidx/compose/runtime/changelist/OperationArgContainer;->getObject-31yXWZQ(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Landroidx/compose/runtime/Anchor;

    .line 20
    .line 21
    invoke-interface {p1, p2}, Landroidx/compose/runtime/changelist/OperationArgContainer;->getInt(I)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    instance-of p2, v0, Landroidx/compose/runtime/RememberObserverHolder;

    .line 26
    .line 27
    if-eqz p2, :cond_0

    .line 28
    .line 29
    move-object p2, v0

    .line 30
    check-cast p2, Landroidx/compose/runtime/RememberObserverHolder;

    .line 31
    .line 32
    invoke-interface {p4, p2}, Landroidx/compose/runtime/RememberManager;->remembering(Landroidx/compose/runtime/RememberObserverHolder;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {p3, v1}, Landroidx/compose/runtime/SlotWriter;->anchorIndex(Landroidx/compose/runtime/Anchor;)I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    invoke-virtual {p3, p2, p1, v0}, Landroidx/compose/runtime/SlotWriter;->set(IILjava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    instance-of v1, v0, Landroidx/compose/runtime/RememberObserverHolder;

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    invoke-virtual {p3}, Landroidx/compose/runtime/SlotWriter;->getSlotsSize()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-virtual {p3, p2, p1}, Landroidx/compose/runtime/SlotWriter;->slotIndexOfGroupSlotIndex(II)I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    sub-int/2addr v1, p1

    .line 56
    check-cast v0, Landroidx/compose/runtime/RememberObserverHolder;

    .line 57
    .line 58
    invoke-virtual {v0}, Landroidx/compose/runtime/RememberObserverHolder;->getAfter()Landroidx/compose/runtime/Anchor;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-eqz p1, :cond_1

    .line 63
    .line 64
    invoke-virtual {p1}, Landroidx/compose/runtime/Anchor;->getValid()Z

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    if-eqz p2, :cond_1

    .line 69
    .line 70
    invoke-virtual {p3, p1}, Landroidx/compose/runtime/SlotWriter;->anchorIndex(Landroidx/compose/runtime/Anchor;)I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    invoke-virtual {p3}, Landroidx/compose/runtime/SlotWriter;->getSlotsSize()I

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    invoke-virtual {p3, p1}, Landroidx/compose/runtime/SlotWriter;->slotsEndAllIndex$runtime_release(I)I

    .line 79
    .line 80
    .line 81
    move-result p3

    .line 82
    sub-int/2addr p2, p3

    .line 83
    goto :goto_0

    .line 84
    :cond_1
    const/4 p1, -0x1

    .line 85
    move p2, p1

    .line 86
    :goto_0
    invoke-interface {p4, v0, v1, p1, p2}, Landroidx/compose/runtime/RememberManager;->forgetting(Landroidx/compose/runtime/RememberObserverHolder;III)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_2
    instance-of p1, v0, Landroidx/compose/runtime/RecomposeScopeImpl;

    .line 91
    .line 92
    if-eqz p1, :cond_3

    .line 93
    .line 94
    check-cast v0, Landroidx/compose/runtime/RecomposeScopeImpl;

    .line 95
    .line 96
    invoke-virtual {v0}, Landroidx/compose/runtime/RecomposeScopeImpl;->release()V

    .line 97
    .line 98
    .line 99
    :cond_3
    return-void
.end method

.method public final getAnchor-HpuvwBQ()I
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

.method public final getGroupSlotIndex()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getValue-HpuvwBQ()I
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

.method public intParamName(I)Ljava/lang/String;
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const-string p1, "groupSlotIndex"

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    invoke-super {p0, p1}, Landroidx/compose/runtime/changelist/Operation;->intParamName(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
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
    const-string/jumbo p1, "value"

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
    const-string p1, "anchor"

    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_1
    invoke-super {p0, p1}, Landroidx/compose/runtime/changelist/Operation;->objectParamName-31yXWZQ(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1
.end method
