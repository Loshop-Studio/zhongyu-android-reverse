.class public final Landroidx/compose/runtime/changelist/Operation$MoveNode;
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
    name = "MoveNode"
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Landroidx/compose/runtime/changelist/Operation$MoveNode;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/runtime/changelist/Operation$MoveNode;

    invoke-direct {v0}, Landroidx/compose/runtime/changelist/Operation$MoveNode;-><init>()V

    sput-object v0, Landroidx/compose/runtime/changelist/Operation$MoveNode;->INSTANCE:Landroidx/compose/runtime/changelist/Operation$MoveNode;

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x3

    .line 4
    const/4 v3, 0x0

    .line 5
    invoke-direct {p0, v2, v3, v0, v1}, Landroidx/compose/runtime/changelist/Operation;-><init>(IIILkotlin/jvm/internal/n;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public execute(Landroidx/compose/runtime/changelist/OperationArgContainer;Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V
    .locals 1
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
    const/4 p3, 0x0

    .line 2
    invoke-interface {p1, p3}, Landroidx/compose/runtime/changelist/OperationArgContainer;->getInt(I)I

    .line 3
    .line 4
    .line 5
    move-result p3

    .line 6
    const/4 p4, 0x1

    .line 7
    invoke-interface {p1, p4}, Landroidx/compose/runtime/changelist/OperationArgContainer;->getInt(I)I

    .line 8
    .line 9
    .line 10
    move-result p4

    .line 11
    const/4 v0, 0x2

    .line 12
    invoke-interface {p1, v0}, Landroidx/compose/runtime/changelist/OperationArgContainer;->getInt(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-interface {p2, p3, p4, p1}, Landroidx/compose/runtime/Applier;->move(III)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final getCount()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public final getFrom()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getTo()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public intParamName(I)Ljava/lang/String;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const-string p1, "from"

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    if-ne p1, v0, :cond_1

    .line 8
    .line 9
    const-string/jumbo p1, "to"

    .line 10
    .line 11
    .line 12
    return-object p1

    .line 13
    :cond_1
    const/4 v0, 0x2

    .line 14
    if-ne p1, v0, :cond_2

    .line 15
    .line 16
    const-string p1, "count"

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_2
    invoke-super {p0, p1}, Landroidx/compose/runtime/changelist/Operation;->intParamName(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
.end method
