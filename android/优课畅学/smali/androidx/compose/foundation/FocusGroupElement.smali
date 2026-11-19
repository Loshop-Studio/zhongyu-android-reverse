.class final Landroidx/compose/foundation/FocusGroupElement;
.super Landroidx/compose/ui/node/ModifierNodeElement;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/compose/ui/node/ModifierNodeElement<",
        "Landroidx/compose/foundation/FocusGroupNode;",
        ">;"
    }
.end annotation


# static fields
.field public static final INSTANCE:Landroidx/compose/foundation/FocusGroupElement;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/FocusGroupElement;

    invoke-direct {v0}, Landroidx/compose/foundation/FocusGroupElement;-><init>()V

    sput-object v0, Landroidx/compose/foundation/FocusGroupElement;->INSTANCE:Landroidx/compose/foundation/FocusGroupElement;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/node/ModifierNodeElement;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public create()Landroidx/compose/foundation/FocusGroupNode;
    .locals 1

    .line 2
    new-instance v0, Landroidx/compose/foundation/FocusGroupNode;

    invoke-direct {v0}, Landroidx/compose/foundation/FocusGroupNode;-><init>()V

    return-object v0
.end method

.method public bridge synthetic create()Landroidx/compose/ui/Modifier$Node;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/FocusGroupElement;->create()Landroidx/compose/foundation/FocusGroupNode;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 0

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 1

    const v0, -0x3f680779

    return v0
.end method

.method public inspectableProperties(Landroidx/compose/ui/platform/InspectorInfo;)V
    .locals 1

    .line 1
    const-string v0, "focusGroup"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroidx/compose/ui/platform/InspectorInfo;->setName(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public update(Landroidx/compose/foundation/FocusGroupNode;)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic update(Landroidx/compose/ui/Modifier$Node;)V
    .locals 0

    .line 2
    check-cast p1, Landroidx/compose/foundation/FocusGroupNode;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/FocusGroupElement;->update(Landroidx/compose/foundation/FocusGroupNode;)V

    return-void
.end method
