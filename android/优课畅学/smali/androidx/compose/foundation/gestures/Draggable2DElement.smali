.class public final Landroidx/compose/foundation/gestures/Draggable2DElement;
.super Landroidx/compose/ui/node/ModifierNodeElement;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/gestures/Draggable2DElement$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/compose/ui/node/ModifierNodeElement<",
        "Landroidx/compose/foundation/gestures/Draggable2DNode;",
        ">;"
    }
.end annotation


# static fields
.field public static final $stable:I

.field private static final CanDrag:Lx7/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx7/l;"
        }
    .end annotation
.end field

.field public static final Companion:Landroidx/compose/foundation/gestures/Draggable2DElement$Companion;


# instance fields
.field private final enabled:Z

.field private final interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

.field private final onDragStarted:Lx7/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx7/l;"
        }
    .end annotation
.end field

.field private final onDragStopped:Lx7/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx7/l;"
        }
    .end annotation
.end field

.field private final reverseDirection:Z

.field private final startDragImmediately:Z

.field private final state:Landroidx/compose/foundation/gestures/Draggable2DState;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/foundation/gestures/Draggable2DElement$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/compose/foundation/gestures/Draggable2DElement$Companion;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/compose/foundation/gestures/Draggable2DElement;->Companion:Landroidx/compose/foundation/gestures/Draggable2DElement$Companion;

    .line 8
    .line 9
    sget-object v0, Landroidx/compose/foundation/gestures/Draggable2DElement$Companion$CanDrag$1;->INSTANCE:Landroidx/compose/foundation/gestures/Draggable2DElement$Companion$CanDrag$1;

    .line 10
    .line 11
    sput-object v0, Landroidx/compose/foundation/gestures/Draggable2DElement;->CanDrag:Lx7/l;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Landroidx/compose/foundation/gestures/Draggable2DState;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLx7/l;Lx7/l;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/Draggable2DState;",
            "Z",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Z",
            "Lx7/l;",
            "Lx7/l;",
            "Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/node/ModifierNodeElement;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->state:Landroidx/compose/foundation/gestures/Draggable2DState;

    .line 5
    .line 6
    iput-boolean p2, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->enabled:Z

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 9
    .line 10
    iput-boolean p4, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->startDragImmediately:Z

    .line 11
    .line 12
    iput-object p5, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->onDragStarted:Lx7/l;

    .line 13
    .line 14
    iput-object p6, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->onDragStopped:Lx7/l;

    .line 15
    .line 16
    iput-boolean p7, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->reverseDirection:Z

    .line 17
    .line 18
    return-void
.end method

.method public static final synthetic access$getCanDrag$cp()Lx7/l;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/foundation/gestures/Draggable2DElement;->CanDrag:Lx7/l;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public create()Landroidx/compose/foundation/gestures/Draggable2DNode;
    .locals 9

    .line 2
    new-instance v0, Landroidx/compose/foundation/gestures/Draggable2DNode;

    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->state:Landroidx/compose/foundation/gestures/Draggable2DState;

    .line 4
    sget-object v2, Landroidx/compose/foundation/gestures/Draggable2DElement;->CanDrag:Lx7/l;

    .line 5
    iget-boolean v3, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->enabled:Z

    .line 6
    iget-object v4, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 7
    iget-boolean v5, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->startDragImmediately:Z

    .line 8
    iget-boolean v6, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->reverseDirection:Z

    .line 9
    iget-object v7, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->onDragStarted:Lx7/l;

    .line 10
    iget-object v8, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->onDragStopped:Lx7/l;

    .line 11
    invoke-direct/range {v0 .. v8}, Landroidx/compose/foundation/gestures/Draggable2DNode;-><init>(Landroidx/compose/foundation/gestures/Draggable2DState;Lx7/l;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZZLx7/l;Lx7/l;)V

    return-object v0
.end method

.method public bridge synthetic create()Landroidx/compose/ui/Modifier$Node;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/gestures/Draggable2DElement;->create()Landroidx/compose/foundation/gestures/Draggable2DNode;

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
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    const-class v2, Landroidx/compose/foundation/gestures/Draggable2DElement;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    if-eq v2, v3, :cond_2

    .line 16
    .line 17
    return v1

    .line 18
    :cond_2
    check-cast p1, Landroidx/compose/foundation/gestures/Draggable2DElement;

    .line 19
    .line 20
    iget-object v2, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->state:Landroidx/compose/foundation/gestures/Draggable2DState;

    .line 21
    .line 22
    iget-object v3, p1, Landroidx/compose/foundation/gestures/Draggable2DElement;->state:Landroidx/compose/foundation/gestures/Draggable2DState;

    .line 23
    .line 24
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_3

    .line 29
    .line 30
    return v1

    .line 31
    :cond_3
    iget-boolean v2, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->enabled:Z

    .line 32
    .line 33
    iget-boolean v3, p1, Landroidx/compose/foundation/gestures/Draggable2DElement;->enabled:Z

    .line 34
    .line 35
    if-eq v2, v3, :cond_4

    .line 36
    .line 37
    return v1

    .line 38
    :cond_4
    iget-object v2, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 39
    .line 40
    iget-object v3, p1, Landroidx/compose/foundation/gestures/Draggable2DElement;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 41
    .line 42
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-nez v2, :cond_5

    .line 47
    .line 48
    return v1

    .line 49
    :cond_5
    iget-boolean v2, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->startDragImmediately:Z

    .line 50
    .line 51
    iget-boolean v3, p1, Landroidx/compose/foundation/gestures/Draggable2DElement;->startDragImmediately:Z

    .line 52
    .line 53
    if-eq v2, v3, :cond_6

    .line 54
    .line 55
    return v1

    .line 56
    :cond_6
    iget-object v2, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->onDragStarted:Lx7/l;

    .line 57
    .line 58
    iget-object v3, p1, Landroidx/compose/foundation/gestures/Draggable2DElement;->onDragStarted:Lx7/l;

    .line 59
    .line 60
    if-eq v2, v3, :cond_7

    .line 61
    .line 62
    return v1

    .line 63
    :cond_7
    iget-object v2, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->onDragStopped:Lx7/l;

    .line 64
    .line 65
    iget-object v3, p1, Landroidx/compose/foundation/gestures/Draggable2DElement;->onDragStopped:Lx7/l;

    .line 66
    .line 67
    if-eq v2, v3, :cond_8

    .line 68
    .line 69
    return v1

    .line 70
    :cond_8
    iget-boolean v2, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->reverseDirection:Z

    .line 71
    .line 72
    iget-boolean p1, p1, Landroidx/compose/foundation/gestures/Draggable2DElement;->reverseDirection:Z

    .line 73
    .line 74
    if-eq v2, p1, :cond_9

    .line 75
    .line 76
    return v1

    .line 77
    :cond_9
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->state:Landroidx/compose/foundation/gestures/Draggable2DState;

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
    iget-boolean v1, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->enabled:Z

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

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
    iget-object v1, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v1, 0x0

    .line 28
    :goto_0
    add-int/2addr v0, v1

    .line 29
    mul-int/lit8 v0, v0, 0x1f

    .line 30
    .line 31
    iget-boolean v1, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->startDragImmediately:Z

    .line 32
    .line 33
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    add-int/2addr v0, v1

    .line 38
    mul-int/lit8 v0, v0, 0x1f

    .line 39
    .line 40
    iget-object v1, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->onDragStarted:Lx7/l;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    add-int/2addr v0, v1

    .line 47
    mul-int/lit8 v0, v0, 0x1f

    .line 48
    .line 49
    iget-object v1, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->onDragStopped:Lx7/l;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    add-int/2addr v0, v1

    .line 56
    mul-int/lit8 v0, v0, 0x1f

    .line 57
    .line 58
    iget-boolean v1, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->reverseDirection:Z

    .line 59
    .line 60
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    add-int/2addr v0, v1

    .line 65
    return v0
.end method

.method public inspectableProperties(Landroidx/compose/ui/platform/InspectorInfo;)V
    .locals 3

    .line 1
    const-string v0, "draggable2D"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroidx/compose/ui/platform/InspectorInfo;->setName(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-boolean v1, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->enabled:Z

    .line 11
    .line 12
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "enabled"

    .line 17
    .line 18
    invoke-virtual {v0, v2, v1}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v1, "interactionSource"

    .line 26
    .line 27
    iget-object v2, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 28
    .line 29
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-boolean v1, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->startDragImmediately:Z

    .line 37
    .line 38
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const-string v2, "startDragImmediately"

    .line 43
    .line 44
    invoke-virtual {v0, v2, v1}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v1, "onDragStarted"

    .line 52
    .line 53
    iget-object v2, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->onDragStarted:Lx7/l;

    .line 54
    .line 55
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-string v1, "onDragStopped"

    .line 63
    .line 64
    iget-object v2, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->onDragStopped:Lx7/l;

    .line 65
    .line 66
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iget-boolean v1, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->reverseDirection:Z

    .line 74
    .line 75
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    const-string v2, "reverseDirection"

    .line 80
    .line 81
    invoke-virtual {v0, v2, v1}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    const-string v0, "state"

    .line 89
    .line 90
    iget-object v1, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->state:Landroidx/compose/foundation/gestures/Draggable2DState;

    .line 91
    .line 92
    invoke-virtual {p1, v0, v1}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public update(Landroidx/compose/foundation/gestures/Draggable2DNode;)V
    .locals 9

    .line 2
    iget-object v1, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->state:Landroidx/compose/foundation/gestures/Draggable2DState;

    .line 3
    sget-object v2, Landroidx/compose/foundation/gestures/Draggable2DElement;->CanDrag:Lx7/l;

    .line 4
    iget-boolean v3, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->enabled:Z

    .line 5
    iget-object v4, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 6
    iget-boolean v5, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->startDragImmediately:Z

    .line 7
    iget-boolean v6, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->reverseDirection:Z

    .line 8
    iget-object v7, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->onDragStarted:Lx7/l;

    .line 9
    iget-object v8, p0, Landroidx/compose/foundation/gestures/Draggable2DElement;->onDragStopped:Lx7/l;

    move-object v0, p1

    .line 10
    invoke-virtual/range {v0 .. v8}, Landroidx/compose/foundation/gestures/Draggable2DNode;->update(Landroidx/compose/foundation/gestures/Draggable2DState;Lx7/l;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZZLx7/l;Lx7/l;)V

    return-void
.end method

.method public bridge synthetic update(Landroidx/compose/ui/Modifier$Node;)V
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/gestures/Draggable2DNode;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/gestures/Draggable2DElement;->update(Landroidx/compose/foundation/gestures/Draggable2DNode;)V

    return-void
.end method
