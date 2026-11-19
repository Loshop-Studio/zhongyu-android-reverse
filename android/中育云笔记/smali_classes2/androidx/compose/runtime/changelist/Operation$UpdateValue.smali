.class public final Landroidx/compose/runtime/changelist/Operation$UpdateValue;
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
    name = "UpdateValue"
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Landroidx/compose/runtime/changelist/Operation$UpdateValue;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/runtime/changelist/Operation$UpdateValue;

    invoke-direct {v0}, Landroidx/compose/runtime/changelist/Operation$UpdateValue;-><init>()V

    sput-object v0, Landroidx/compose/runtime/changelist/Operation$UpdateValue;->INSTANCE:Landroidx/compose/runtime/changelist/Operation$UpdateValue;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-direct {p0, v0, v0, v1}, Landroidx/compose/runtime/changelist/Operation;-><init>(IILkotlin/jvm/internal/n;)V

    .line 4
    .line 5
    .line 6
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
    invoke-interface {p1, p2}, Landroidx/compose/runtime/changelist/OperationArgContainer;->getInt(I)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    instance-of p2, v0, Landroidx/compose/runtime/RememberObserverHolder;

    .line 15
    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    move-object p2, v0

    .line 19
    check-cast p2, Landroidx/compose/runtime/RememberObserverHolder;

    .line 20
    .line 21
    invoke-interface {p4, p2}, Landroidx/compose/runtime/RememberManager;->remembering(Landroidx/compose/runtime/RememberObserverHolder;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {p3}, Landroidx/compose/runtime/SlotWriter;->getCurrentGroup()I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    invoke-virtual {p3, p2, p1, v0}, Landroidx/compose/runtime/SlotWriter;->set(IILjava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    instance-of v0, p2, Landroidx/compose/runtime/RememberObserverHolder;

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {p3}, Landroidx/compose/runtime/SlotWriter;->getSlotsSize()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-virtual {p3}, Landroidx/compose/runtime/SlotWriter;->getCurrentGroup()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-virtual {p3, v1, p1}, Landroidx/compose/runtime/SlotWriter;->slotIndexOfGroupSlotIndex(II)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    sub-int/2addr v0, p1

    .line 49
    check-cast p2, Landroidx/compose/runtime/RememberObserverHolder;

    .line 50
    .line 51
    const/4 p1, -0x1

    .line 52
    invoke-interface {p4, p2, v0, p1, p1}, Landroidx/compose/runtime/RememberManager;->forgetting(Landroidx/compose/runtime/RememberObserverHolder;III)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_1
    instance-of p1, p2, Landroidx/compose/runtime/RecomposeScopeImpl;

    .line 57
    .line 58
    if-eqz p1, :cond_2

    .line 59
    .line 60
    check-cast p2, Landroidx/compose/runtime/RecomposeScopeImpl;

    .line 61
    .line 62
    invoke-virtual {p2}, Landroidx/compose/runtime/RecomposeScopeImpl;->release()V

    .line 63
    .line 64
    .line 65
    :cond_2
    return-void
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
    invoke-super {p0, p1}, Landroidx/compose/runtime/changelist/Operation;->objectParamName-31yXWZQ(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method
