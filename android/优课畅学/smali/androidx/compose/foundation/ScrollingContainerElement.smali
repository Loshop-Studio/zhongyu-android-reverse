.class final Landroidx/compose/foundation/ScrollingContainerElement;
.super Landroidx/compose/ui/node/ModifierNodeElement;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/compose/ui/node/ModifierNodeElement<",
        "Landroidx/compose/foundation/ScrollingContainerNode;",
        ">;"
    }
.end annotation


# instance fields
.field private final bringIntoViewSpec:Landroidx/compose/foundation/gestures/BringIntoViewSpec;

.field private final enabled:Z

.field private final flingBehavior:Landroidx/compose/foundation/gestures/FlingBehavior;

.field private final interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

.field private final orientation:Landroidx/compose/foundation/gestures/Orientation;

.field private final overscrollEffect:Landroidx/compose/foundation/OverscrollEffect;

.field private final reverseScrolling:Z

.field private final state:Landroidx/compose/foundation/gestures/ScrollableState;

.field private final useLocalOverscrollFactory:Z


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/BringIntoViewSpec;ZLandroidx/compose/foundation/OverscrollEffect;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/node/ModifierNodeElement;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/ScrollingContainerElement;->state:Landroidx/compose/foundation/gestures/ScrollableState;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/foundation/ScrollingContainerElement;->orientation:Landroidx/compose/foundation/gestures/Orientation;

    .line 7
    .line 8
    iput-boolean p3, p0, Landroidx/compose/foundation/ScrollingContainerElement;->enabled:Z

    .line 9
    .line 10
    iput-boolean p4, p0, Landroidx/compose/foundation/ScrollingContainerElement;->reverseScrolling:Z

    .line 11
    .line 12
    iput-object p5, p0, Landroidx/compose/foundation/ScrollingContainerElement;->flingBehavior:Landroidx/compose/foundation/gestures/FlingBehavior;

    .line 13
    .line 14
    iput-object p6, p0, Landroidx/compose/foundation/ScrollingContainerElement;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 15
    .line 16
    iput-object p7, p0, Landroidx/compose/foundation/ScrollingContainerElement;->bringIntoViewSpec:Landroidx/compose/foundation/gestures/BringIntoViewSpec;

    .line 17
    .line 18
    iput-boolean p8, p0, Landroidx/compose/foundation/ScrollingContainerElement;->useLocalOverscrollFactory:Z

    .line 19
    .line 20
    iput-object p9, p0, Landroidx/compose/foundation/ScrollingContainerElement;->overscrollEffect:Landroidx/compose/foundation/OverscrollEffect;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public create()Landroidx/compose/foundation/ScrollingContainerNode;
    .locals 10

    .line 2
    new-instance v0, Landroidx/compose/foundation/ScrollingContainerNode;

    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/ScrollingContainerElement;->state:Landroidx/compose/foundation/gestures/ScrollableState;

    .line 4
    iget-object v2, p0, Landroidx/compose/foundation/ScrollingContainerElement;->orientation:Landroidx/compose/foundation/gestures/Orientation;

    .line 5
    iget-boolean v3, p0, Landroidx/compose/foundation/ScrollingContainerElement;->enabled:Z

    .line 6
    iget-boolean v4, p0, Landroidx/compose/foundation/ScrollingContainerElement;->reverseScrolling:Z

    .line 7
    iget-object v5, p0, Landroidx/compose/foundation/ScrollingContainerElement;->flingBehavior:Landroidx/compose/foundation/gestures/FlingBehavior;

    .line 8
    iget-object v6, p0, Landroidx/compose/foundation/ScrollingContainerElement;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 9
    iget-object v7, p0, Landroidx/compose/foundation/ScrollingContainerElement;->bringIntoViewSpec:Landroidx/compose/foundation/gestures/BringIntoViewSpec;

    .line 10
    iget-boolean v8, p0, Landroidx/compose/foundation/ScrollingContainerElement;->useLocalOverscrollFactory:Z

    .line 11
    iget-object v9, p0, Landroidx/compose/foundation/ScrollingContainerElement;->overscrollEffect:Landroidx/compose/foundation/OverscrollEffect;

    .line 12
    invoke-direct/range {v0 .. v9}, Landroidx/compose/foundation/ScrollingContainerNode;-><init>(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/BringIntoViewSpec;ZLandroidx/compose/foundation/OverscrollEffect;)V

    return-object v0
.end method

.method public bridge synthetic create()Landroidx/compose/ui/Modifier$Node;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/ScrollingContainerElement;->create()Landroidx/compose/foundation/ScrollingContainerNode;

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
    if-eqz p1, :cond_b

    .line 7
    .line 8
    const-class v2, Landroidx/compose/foundation/ScrollingContainerElement;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eq v2, v3, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    check-cast p1, Landroidx/compose/foundation/ScrollingContainerElement;

    .line 18
    .line 19
    iget-object v2, p0, Landroidx/compose/foundation/ScrollingContainerElement;->state:Landroidx/compose/foundation/gestures/ScrollableState;

    .line 20
    .line 21
    iget-object v3, p1, Landroidx/compose/foundation/ScrollingContainerElement;->state:Landroidx/compose/foundation/gestures/ScrollableState;

    .line 22
    .line 23
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_2

    .line 28
    .line 29
    return v1

    .line 30
    :cond_2
    iget-object v2, p0, Landroidx/compose/foundation/ScrollingContainerElement;->orientation:Landroidx/compose/foundation/gestures/Orientation;

    .line 31
    .line 32
    iget-object v3, p1, Landroidx/compose/foundation/ScrollingContainerElement;->orientation:Landroidx/compose/foundation/gestures/Orientation;

    .line 33
    .line 34
    if-eq v2, v3, :cond_3

    .line 35
    .line 36
    return v1

    .line 37
    :cond_3
    iget-boolean v2, p0, Landroidx/compose/foundation/ScrollingContainerElement;->enabled:Z

    .line 38
    .line 39
    iget-boolean v3, p1, Landroidx/compose/foundation/ScrollingContainerElement;->enabled:Z

    .line 40
    .line 41
    if-eq v2, v3, :cond_4

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
    iget-boolean v2, p0, Landroidx/compose/foundation/ScrollingContainerElement;->reverseScrolling:Z

    .line 45
    .line 46
    iget-boolean v3, p1, Landroidx/compose/foundation/ScrollingContainerElement;->reverseScrolling:Z

    .line 47
    .line 48
    if-eq v2, v3, :cond_5

    .line 49
    .line 50
    return v1

    .line 51
    :cond_5
    iget-object v2, p0, Landroidx/compose/foundation/ScrollingContainerElement;->flingBehavior:Landroidx/compose/foundation/gestures/FlingBehavior;

    .line 52
    .line 53
    iget-object v3, p1, Landroidx/compose/foundation/ScrollingContainerElement;->flingBehavior:Landroidx/compose/foundation/gestures/FlingBehavior;

    .line 54
    .line 55
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-nez v2, :cond_6

    .line 60
    .line 61
    return v1

    .line 62
    :cond_6
    iget-object v2, p0, Landroidx/compose/foundation/ScrollingContainerElement;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 63
    .line 64
    iget-object v3, p1, Landroidx/compose/foundation/ScrollingContainerElement;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 65
    .line 66
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-nez v2, :cond_7

    .line 71
    .line 72
    return v1

    .line 73
    :cond_7
    iget-object v2, p0, Landroidx/compose/foundation/ScrollingContainerElement;->bringIntoViewSpec:Landroidx/compose/foundation/gestures/BringIntoViewSpec;

    .line 74
    .line 75
    iget-object v3, p1, Landroidx/compose/foundation/ScrollingContainerElement;->bringIntoViewSpec:Landroidx/compose/foundation/gestures/BringIntoViewSpec;

    .line 76
    .line 77
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-nez v2, :cond_8

    .line 82
    .line 83
    return v1

    .line 84
    :cond_8
    iget-boolean v2, p0, Landroidx/compose/foundation/ScrollingContainerElement;->useLocalOverscrollFactory:Z

    .line 85
    .line 86
    iget-boolean v3, p1, Landroidx/compose/foundation/ScrollingContainerElement;->useLocalOverscrollFactory:Z

    .line 87
    .line 88
    if-eq v2, v3, :cond_9

    .line 89
    .line 90
    return v1

    .line 91
    :cond_9
    iget-object v2, p0, Landroidx/compose/foundation/ScrollingContainerElement;->overscrollEffect:Landroidx/compose/foundation/OverscrollEffect;

    .line 92
    .line 93
    iget-object p1, p1, Landroidx/compose/foundation/ScrollingContainerElement;->overscrollEffect:Landroidx/compose/foundation/OverscrollEffect;

    .line 94
    .line 95
    invoke-static {v2, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    if-nez p1, :cond_a

    .line 100
    .line 101
    return v1

    .line 102
    :cond_a
    return v0

    .line 103
    :cond_b
    :goto_0
    return v1
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/ScrollingContainerElement;->state:Landroidx/compose/foundation/gestures/ScrollableState;

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
    iget-object v1, p0, Landroidx/compose/foundation/ScrollingContainerElement;->orientation:Landroidx/compose/foundation/gestures/Orientation;

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
    iget-boolean v1, p0, Landroidx/compose/foundation/ScrollingContainerElement;->enabled:Z

    .line 19
    .line 20
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

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
    iget-boolean v1, p0, Landroidx/compose/foundation/ScrollingContainerElement;->reverseScrolling:Z

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
    iget-object v1, p0, Landroidx/compose/foundation/ScrollingContainerElement;->flingBehavior:Landroidx/compose/foundation/gestures/FlingBehavior;

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move v1, v2

    .line 47
    :goto_0
    add-int/2addr v0, v1

    .line 48
    mul-int/lit8 v0, v0, 0x1f

    .line 49
    .line 50
    iget-object v1, p0, Landroidx/compose/foundation/ScrollingContainerElement;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 51
    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    goto :goto_1

    .line 59
    :cond_1
    move v1, v2

    .line 60
    :goto_1
    add-int/2addr v0, v1

    .line 61
    mul-int/lit8 v0, v0, 0x1f

    .line 62
    .line 63
    iget-object v1, p0, Landroidx/compose/foundation/ScrollingContainerElement;->bringIntoViewSpec:Landroidx/compose/foundation/gestures/BringIntoViewSpec;

    .line 64
    .line 65
    if-eqz v1, :cond_2

    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    goto :goto_2

    .line 72
    :cond_2
    move v1, v2

    .line 73
    :goto_2
    add-int/2addr v0, v1

    .line 74
    mul-int/lit8 v0, v0, 0x1f

    .line 75
    .line 76
    iget-boolean v1, p0, Landroidx/compose/foundation/ScrollingContainerElement;->useLocalOverscrollFactory:Z

    .line 77
    .line 78
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    add-int/2addr v0, v1

    .line 83
    mul-int/lit8 v0, v0, 0x1f

    .line 84
    .line 85
    iget-object v1, p0, Landroidx/compose/foundation/ScrollingContainerElement;->overscrollEffect:Landroidx/compose/foundation/OverscrollEffect;

    .line 86
    .line 87
    if-eqz v1, :cond_3

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    :cond_3
    add-int/2addr v0, v2

    .line 94
    return v0
.end method

.method public inspectableProperties(Landroidx/compose/ui/platform/InspectorInfo;)V
    .locals 3

    .line 1
    const-string v0, "scrollingContainer"

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
    const-string v1, "state"

    .line 11
    .line 12
    iget-object v2, p0, Landroidx/compose/foundation/ScrollingContainerElement;->state:Landroidx/compose/foundation/gestures/ScrollableState;

    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "orientation"

    .line 22
    .line 23
    iget-object v2, p0, Landroidx/compose/foundation/ScrollingContainerElement;->orientation:Landroidx/compose/foundation/gestures/Orientation;

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-boolean v1, p0, Landroidx/compose/foundation/ScrollingContainerElement;->enabled:Z

    .line 33
    .line 34
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-string v2, "enabled"

    .line 39
    .line 40
    invoke-virtual {v0, v2, v1}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iget-boolean v1, p0, Landroidx/compose/foundation/ScrollingContainerElement;->reverseScrolling:Z

    .line 48
    .line 49
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    const-string v2, "reverseScrolling"

    .line 54
    .line 55
    invoke-virtual {v0, v2, v1}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-string v1, "flingBehavior"

    .line 63
    .line 64
    iget-object v2, p0, Landroidx/compose/foundation/ScrollingContainerElement;->flingBehavior:Landroidx/compose/foundation/gestures/FlingBehavior;

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
    const-string v1, "interactionSource"

    .line 74
    .line 75
    iget-object v2, p0, Landroidx/compose/foundation/ScrollingContainerElement;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 76
    .line 77
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    const-string v1, "bringIntoViewSpec"

    .line 85
    .line 86
    iget-object v2, p0, Landroidx/compose/foundation/ScrollingContainerElement;->bringIntoViewSpec:Landroidx/compose/foundation/gestures/BringIntoViewSpec;

    .line 87
    .line 88
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    iget-boolean v1, p0, Landroidx/compose/foundation/ScrollingContainerElement;->useLocalOverscrollFactory:Z

    .line 96
    .line 97
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    const-string v2, "useLocalOverscrollFactory"

    .line 102
    .line 103
    invoke-virtual {v0, v2, v1}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    const-string v0, "overscrollEffect"

    .line 111
    .line 112
    iget-object v1, p0, Landroidx/compose/foundation/ScrollingContainerElement;->overscrollEffect:Landroidx/compose/foundation/OverscrollEffect;

    .line 113
    .line 114
    invoke-virtual {p1, v0, v1}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    return-void
.end method

.method public update(Landroidx/compose/foundation/ScrollingContainerNode;)V
    .locals 10

    .line 2
    iget-object v1, p0, Landroidx/compose/foundation/ScrollingContainerElement;->state:Landroidx/compose/foundation/gestures/ScrollableState;

    .line 3
    iget-object v2, p0, Landroidx/compose/foundation/ScrollingContainerElement;->orientation:Landroidx/compose/foundation/gestures/Orientation;

    .line 4
    iget-boolean v3, p0, Landroidx/compose/foundation/ScrollingContainerElement;->useLocalOverscrollFactory:Z

    .line 5
    iget-object v4, p0, Landroidx/compose/foundation/ScrollingContainerElement;->overscrollEffect:Landroidx/compose/foundation/OverscrollEffect;

    .line 6
    iget-boolean v5, p0, Landroidx/compose/foundation/ScrollingContainerElement;->enabled:Z

    .line 7
    iget-boolean v6, p0, Landroidx/compose/foundation/ScrollingContainerElement;->reverseScrolling:Z

    .line 8
    iget-object v7, p0, Landroidx/compose/foundation/ScrollingContainerElement;->flingBehavior:Landroidx/compose/foundation/gestures/FlingBehavior;

    .line 9
    iget-object v8, p0, Landroidx/compose/foundation/ScrollingContainerElement;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 10
    iget-object v9, p0, Landroidx/compose/foundation/ScrollingContainerElement;->bringIntoViewSpec:Landroidx/compose/foundation/gestures/BringIntoViewSpec;

    move-object v0, p1

    .line 11
    invoke-virtual/range {v0 .. v9}, Landroidx/compose/foundation/ScrollingContainerNode;->update(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/OverscrollEffect;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/BringIntoViewSpec;)V

    return-void
.end method

.method public bridge synthetic update(Landroidx/compose/ui/Modifier$Node;)V
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/ScrollingContainerNode;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/ScrollingContainerElement;->update(Landroidx/compose/foundation/ScrollingContainerNode;)V

    return-void
.end method
