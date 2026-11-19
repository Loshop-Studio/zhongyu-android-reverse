.class public final Landroidx/compose/foundation/text/selection/SelectionGesturesKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final STATIC_KEY:I = 0x845fed


# direct methods
.method public static final synthetic access$awaitDown(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt;->awaitDown(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$distanceIsTolerable(Landroidx/compose/ui/platform/ViewConfiguration;Landroidx/compose/ui/input/pointer/PointerInputChange;Landroidx/compose/ui/input/pointer/PointerInputChange;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt;->distanceIsTolerable(Landroidx/compose/ui/platform/ViewConfiguration;Landroidx/compose/ui/input/pointer/PointerInputChange;Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$mouseSelection(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/selection/ClicksCounter;Landroidx/compose/ui/input/pointer/PointerEvent;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt;->mouseSelection(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/selection/ClicksCounter;Landroidx/compose/ui/input/pointer/PointerEvent;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$mouseSelectionBtf2(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/selection/ClicksCounter;Landroidx/compose/ui/input/pointer/PointerEvent;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt;->mouseSelectionBtf2(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/selection/ClicksCounter;Landroidx/compose/ui/input/pointer/PointerEvent;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$touchSelection(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/text/TextDragObserver;Landroidx/compose/ui/input/pointer/PointerEvent;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt;->touchSelection(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/text/TextDragObserver;Landroidx/compose/ui/input/pointer/PointerEvent;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$touchSelectionFirstPress(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/text/TextDragObserver;Landroidx/compose/ui/input/pointer/PointerEvent;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt;->touchSelectionFirstPress(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/text/TextDragObserver;Landroidx/compose/ui/input/pointer/PointerEvent;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$touchSelectionSubsequentPress(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/text/TextDragObserver;Landroidx/compose/ui/input/pointer/PointerEvent;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt;->touchSelectionSubsequentPress(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/text/TextDragObserver;Landroidx/compose/ui/input/pointer/PointerEvent;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final awaitDown(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lvc/c;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "Lvc/c<",
            "-",
            "Landroidx/compose/ui/input/pointer/PointerEvent;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$awaitDown$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$awaitDown$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$awaitDown$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$awaitDown$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$awaitDown$1;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$awaitDown$1;-><init>(Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$awaitDown$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$awaitDown$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p0, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$awaitDown$1;->L$0:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 41
    .line 42
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p0

    .line 54
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :goto_1
    sget-object p1, Landroidx/compose/ui/input/pointer/PointerEventPass;->Main:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 58
    .line 59
    iput-object p0, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$awaitDown$1;->L$0:Ljava/lang/Object;

    .line 60
    .line 61
    iput v3, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$awaitDown$1;->label:I

    .line 62
    .line 63
    invoke-interface {p0, p1, v0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent(Landroidx/compose/ui/input/pointer/PointerEventPass;Lvc/c;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    if-ne p1, v1, :cond_3

    .line 68
    .line 69
    return-object v1

    .line 70
    :cond_3
    :goto_2
    check-cast p1, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 71
    .line 72
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    move-object v4, v2

    .line 77
    check-cast v4, Ljava/util/Collection;

    .line 78
    .line 79
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    const/4 v5, 0x0

    .line 84
    :goto_3
    if-ge v5, v4, :cond_5

    .line 85
    .line 86
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    check-cast v6, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 91
    .line 92
    invoke-static {v6}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToDownIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    if-nez v6, :cond_4

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_5
    return-object p1
.end method

.method private static final distanceIsTolerable(Landroidx/compose/ui/platform/ViewConfiguration;Landroidx/compose/ui/input/pointer/PointerInputChange;Landroidx/compose/ui/input/pointer/PointerInputChange;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getType-T8wyACA()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p0, v0}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->pointerSlop-E8SPZFQ(Landroidx/compose/ui/platform/ViewConfiguration;I)F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    invoke-virtual {p2}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 14
    .line 15
    .line 16
    move-result-wide p1

    .line 17
    invoke-static {v0, v1, p1, p2}, Landroidx/compose/ui/geometry/Offset;->minus-MK-Hz9U(JJ)J

    .line 18
    .line 19
    .line 20
    move-result-wide p1

    .line 21
    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Offset;->getDistance-impl(J)F

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    cmpg-float p0, p1, p0

    .line 26
    .line 27
    if-gez p0, :cond_0

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_0
    const/4 p0, 0x0

    .line 32
    return p0
.end method

.method public static final isPrecisePointer(Landroidx/compose/ui/input/pointer/PointerEvent;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Ljava/util/Collection;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    move v2, v1

    .line 14
    :goto_0
    if-ge v2, v0, :cond_1

    .line 15
    .line 16
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    check-cast v3, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 21
    .line 22
    invoke-virtual {v3}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getType-T8wyACA()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    sget-object v4, Landroidx/compose/ui/input/pointer/PointerType;->Companion:Landroidx/compose/ui/input/pointer/PointerType$Companion;

    .line 27
    .line 28
    invoke-virtual {v4}, Landroidx/compose/ui/input/pointer/PointerType$Companion;->getMouse-T8wyACA()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-static {v3, v4}, Landroidx/compose/ui/input/pointer/PointerType;->equals-impl0(II)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-nez v3, :cond_0

    .line 37
    .line 38
    return v1

    .line 39
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const/4 p0, 0x1

    .line 43
    return p0
.end method

.method private static final mouseSelection(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/selection/ClicksCounter;Landroidx/compose/ui/input/pointer/PointerEvent;Lvc/c;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;",
            "Landroidx/compose/foundation/text/selection/ClicksCounter;",
            "Landroidx/compose/ui/input/pointer/PointerEvent;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p4, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$1;

    .line 21
    .line 22
    invoke-direct {v0, p4}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$1;-><init>(Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v5, :cond_2

    .line 39
    .line 40
    if-ne v2, v4, :cond_1

    .line 41
    .line 42
    iget-object p0, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$1;->L$2:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 45
    .line 46
    iget-object p1, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$1;->L$1:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, Landroidx/compose/foundation/text/selection/MouseSelectionObserver;

    .line 49
    .line 50
    iget-object p2, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$1;->L$0:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p2, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 53
    .line 54
    invoke-static {p4}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto/16 :goto_5

    .line 58
    .line 59
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 62
    .line 63
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p0

    .line 67
    :cond_2
    iget-object p0, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$1;->L$1:Ljava/lang/Object;

    .line 68
    .line 69
    move-object p1, p0

    .line 70
    check-cast p1, Landroidx/compose/foundation/text/selection/MouseSelectionObserver;

    .line 71
    .line 72
    iget-object p0, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$1;->L$0:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p0, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 75
    .line 76
    invoke-static {p4}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    invoke-static {p4}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2, p3}, Landroidx/compose/foundation/text/selection/ClicksCounter;->update(Landroidx/compose/ui/input/pointer/PointerEvent;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p3}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object p4

    .line 90
    invoke-interface {p4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p4

    .line 94
    check-cast p4, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 95
    .line 96
    invoke-static {p3}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager_androidKt;->isShiftPressed(Landroidx/compose/ui/input/pointer/PointerEvent;)Z

    .line 97
    .line 98
    .line 99
    move-result p3

    .line 100
    if-eqz p3, :cond_7

    .line 101
    .line 102
    invoke-virtual {p4}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 103
    .line 104
    .line 105
    move-result-wide p2

    .line 106
    invoke-interface {p1, p2, p3}, Landroidx/compose/foundation/text/selection/MouseSelectionObserver;->onExtend-k-4lQ0M(J)Z

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    if-eqz p2, :cond_d

    .line 111
    .line 112
    invoke-virtual {p4}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 113
    .line 114
    .line 115
    move-result-wide p2

    .line 116
    new-instance p4, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$shouldConsumeUp$1;

    .line 117
    .line 118
    invoke-direct {p4, p1}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$shouldConsumeUp$1;-><init>(Landroidx/compose/foundation/text/selection/MouseSelectionObserver;)V

    .line 119
    .line 120
    .line 121
    iput-object p0, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$1;->L$0:Ljava/lang/Object;

    .line 122
    .line 123
    iput-object p1, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$1;->L$1:Ljava/lang/Object;

    .line 124
    .line 125
    iput v5, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$1;->label:I

    .line 126
    .line 127
    invoke-static {p0, p2, p3, p4, v0}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->drag-jO51t88(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLhd/l;Lvc/c;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p4

    .line 131
    if-ne p4, v1, :cond_4

    .line 132
    .line 133
    goto/16 :goto_4

    .line 134
    .line 135
    :cond_4
    :goto_1
    check-cast p4, Ljava/lang/Boolean;

    .line 136
    .line 137
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 138
    .line 139
    .line 140
    move-result p2

    .line 141
    if-eqz p2, :cond_6

    .line 142
    .line 143
    invoke-interface {p0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getCurrentEvent()Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    move-object p2, p0

    .line 152
    check-cast p2, Ljava/util/Collection;

    .line 153
    .line 154
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 155
    .line 156
    .line 157
    move-result p2

    .line 158
    :goto_2
    if-ge v3, p2, :cond_6

    .line 159
    .line 160
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p3

    .line 164
    check-cast p3, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 165
    .line 166
    invoke-static {p3}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUp(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 167
    .line 168
    .line 169
    move-result p4

    .line 170
    if-eqz p4, :cond_5

    .line 171
    .line 172
    invoke-virtual {p3}, Landroidx/compose/ui/input/pointer/PointerInputChange;->consume()V

    .line 173
    .line 174
    .line 175
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_6
    invoke-interface {p1}, Landroidx/compose/foundation/text/selection/MouseSelectionObserver;->onDragDone()V

    .line 179
    .line 180
    .line 181
    goto/16 :goto_7

    .line 182
    .line 183
    :cond_7
    invoke-virtual {p2}, Landroidx/compose/foundation/text/selection/ClicksCounter;->getClicks()I

    .line 184
    .line 185
    .line 186
    move-result p2

    .line 187
    if-eq p2, v5, :cond_9

    .line 188
    .line 189
    if-eq p2, v4, :cond_8

    .line 190
    .line 191
    sget-object p2, Landroidx/compose/foundation/text/selection/SelectionAdjustment;->Companion:Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;

    .line 192
    .line 193
    invoke-virtual {p2}, Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;->getParagraph()Landroidx/compose/foundation/text/selection/SelectionAdjustment;

    .line 194
    .line 195
    .line 196
    move-result-object p2

    .line 197
    goto :goto_3

    .line 198
    :cond_8
    sget-object p2, Landroidx/compose/foundation/text/selection/SelectionAdjustment;->Companion:Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;

    .line 199
    .line 200
    invoke-virtual {p2}, Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;->getWord()Landroidx/compose/foundation/text/selection/SelectionAdjustment;

    .line 201
    .line 202
    .line 203
    move-result-object p2

    .line 204
    goto :goto_3

    .line 205
    :cond_9
    sget-object p2, Landroidx/compose/foundation/text/selection/SelectionAdjustment;->Companion:Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;

    .line 206
    .line 207
    invoke-virtual {p2}, Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;->getNone()Landroidx/compose/foundation/text/selection/SelectionAdjustment;

    .line 208
    .line 209
    .line 210
    move-result-object p2

    .line 211
    :goto_3
    invoke-virtual {p4}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 212
    .line 213
    .line 214
    move-result-wide v6

    .line 215
    invoke-interface {p1, v6, v7, p2}, Landroidx/compose/foundation/text/selection/MouseSelectionObserver;->onStart-3MmeM6k(JLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z

    .line 216
    .line 217
    .line 218
    move-result p3

    .line 219
    if-eqz p3, :cond_d

    .line 220
    .line 221
    new-instance p3, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 222
    .line 223
    invoke-direct {p3}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 224
    .line 225
    .line 226
    sget-object v2, Landroidx/compose/foundation/text/selection/SelectionAdjustment;->Companion:Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;

    .line 227
    .line 228
    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;->getNone()Landroidx/compose/foundation/text/selection/SelectionAdjustment;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    invoke-static {p2, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result v2

    .line 236
    xor-int/2addr v2, v5

    .line 237
    iput-boolean v2, p3, Lkotlin/jvm/internal/Ref$BooleanRef;->c:Z

    .line 238
    .line 239
    invoke-virtual {p4}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 240
    .line 241
    .line 242
    move-result-wide v5

    .line 243
    new-instance p4, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$shouldConsumeUp$2;

    .line 244
    .line 245
    invoke-direct {p4, p1, p2, p3}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$shouldConsumeUp$2;-><init>(Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/selection/SelectionAdjustment;Lkotlin/jvm/internal/Ref$BooleanRef;)V

    .line 246
    .line 247
    .line 248
    iput-object p0, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$1;->L$0:Ljava/lang/Object;

    .line 249
    .line 250
    iput-object p1, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$1;->L$1:Ljava/lang/Object;

    .line 251
    .line 252
    iput-object p3, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$1;->L$2:Ljava/lang/Object;

    .line 253
    .line 254
    iput v4, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$1;->label:I

    .line 255
    .line 256
    invoke-static {p0, v5, v6, p4, v0}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->drag-jO51t88(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLhd/l;Lvc/c;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object p4

    .line 260
    if-ne p4, v1, :cond_a

    .line 261
    .line 262
    :goto_4
    return-object v1

    .line 263
    :cond_a
    move-object p2, p0

    .line 264
    move-object p0, p3

    .line 265
    :goto_5
    check-cast p4, Ljava/lang/Boolean;

    .line 266
    .line 267
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 268
    .line 269
    .line 270
    move-result p3

    .line 271
    if-eqz p3, :cond_c

    .line 272
    .line 273
    iget-boolean p0, p0, Lkotlin/jvm/internal/Ref$BooleanRef;->c:Z

    .line 274
    .line 275
    if-eqz p0, :cond_c

    .line 276
    .line 277
    invoke-interface {p2}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getCurrentEvent()Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 278
    .line 279
    .line 280
    move-result-object p0

    .line 281
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    move-object p2, p0

    .line 286
    check-cast p2, Ljava/util/Collection;

    .line 287
    .line 288
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 289
    .line 290
    .line 291
    move-result p2

    .line 292
    :goto_6
    if-ge v3, p2, :cond_c

    .line 293
    .line 294
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object p3

    .line 298
    check-cast p3, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 299
    .line 300
    invoke-static {p3}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUp(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 301
    .line 302
    .line 303
    move-result p4

    .line 304
    if-eqz p4, :cond_b

    .line 305
    .line 306
    invoke-virtual {p3}, Landroidx/compose/ui/input/pointer/PointerInputChange;->consume()V

    .line 307
    .line 308
    .line 309
    :cond_b
    add-int/lit8 v3, v3, 0x1

    .line 310
    .line 311
    goto :goto_6

    .line 312
    :cond_c
    invoke-interface {p1}, Landroidx/compose/foundation/text/selection/MouseSelectionObserver;->onDragDone()V

    .line 313
    .line 314
    .line 315
    :cond_d
    :goto_7
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 316
    .line 317
    return-object p0
.end method

.method private static final mouseSelectionBtf2(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/selection/ClicksCounter;Landroidx/compose/ui/input/pointer/PointerEvent;Lvc/c;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;",
            "Landroidx/compose/foundation/text/selection/ClicksCounter;",
            "Landroidx/compose/ui/input/pointer/PointerEvent;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p4, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelectionBtf2$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelectionBtf2$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelectionBtf2$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelectionBtf2$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelectionBtf2$1;

    .line 21
    .line 22
    invoke-direct {v0, p4}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelectionBtf2$1;-><init>(Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelectionBtf2$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelectionBtf2$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v5, :cond_2

    .line 39
    .line 40
    if-ne v2, v4, :cond_1

    .line 41
    .line 42
    iget-object p0, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelectionBtf2$1;->L$2:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 45
    .line 46
    iget-object p1, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelectionBtf2$1;->L$1:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, Landroidx/compose/foundation/text/selection/MouseSelectionObserver;

    .line 49
    .line 50
    iget-object p2, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelectionBtf2$1;->L$0:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p2, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 53
    .line 54
    :try_start_0
    invoke-static {p4}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    goto/16 :goto_6

    .line 58
    .line 59
    :catchall_0
    move-exception p0

    .line 60
    goto/16 :goto_8

    .line 61
    .line 62
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 63
    .line 64
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 65
    .line 66
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw p0

    .line 70
    :cond_2
    iget-object p0, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelectionBtf2$1;->L$1:Ljava/lang/Object;

    .line 71
    .line 72
    move-object p1, p0

    .line 73
    check-cast p1, Landroidx/compose/foundation/text/selection/MouseSelectionObserver;

    .line 74
    .line 75
    iget-object p0, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelectionBtf2$1;->L$0:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p0, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 78
    .line 79
    :try_start_1
    invoke-static {p4}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :catchall_1
    move-exception p0

    .line 84
    goto :goto_3

    .line 85
    :cond_3
    invoke-static {p4}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p3}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object p4

    .line 92
    invoke-interface {p4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p4

    .line 96
    check-cast p4, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 97
    .line 98
    invoke-static {p3}, Landroidx/compose/foundation/text/selection/TextFieldSelectionManager_androidKt;->isShiftPressed(Landroidx/compose/ui/input/pointer/PointerEvent;)Z

    .line 99
    .line 100
    .line 101
    move-result p3

    .line 102
    if-eqz p3, :cond_7

    .line 103
    .line 104
    invoke-virtual {p4}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 105
    .line 106
    .line 107
    move-result-wide p2

    .line 108
    invoke-interface {p1, p2, p3}, Landroidx/compose/foundation/text/selection/MouseSelectionObserver;->onExtend-k-4lQ0M(J)Z

    .line 109
    .line 110
    .line 111
    move-result p2

    .line 112
    if-eqz p2, :cond_d

    .line 113
    .line 114
    :try_start_2
    invoke-virtual {p4}, Landroidx/compose/ui/input/pointer/PointerInputChange;->consume()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p4}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 118
    .line 119
    .line 120
    move-result-wide p2

    .line 121
    new-instance p4, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelectionBtf2$shouldConsumeUp$1;

    .line 122
    .line 123
    invoke-direct {p4, p1}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelectionBtf2$shouldConsumeUp$1;-><init>(Landroidx/compose/foundation/text/selection/MouseSelectionObserver;)V

    .line 124
    .line 125
    .line 126
    iput-object p0, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelectionBtf2$1;->L$0:Ljava/lang/Object;

    .line 127
    .line 128
    iput-object p1, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelectionBtf2$1;->L$1:Ljava/lang/Object;

    .line 129
    .line 130
    iput v5, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelectionBtf2$1;->label:I

    .line 131
    .line 132
    invoke-static {p0, p2, p3, p4, v0}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->drag-jO51t88(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLhd/l;Lvc/c;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p4

    .line 136
    if-ne p4, v1, :cond_4

    .line 137
    .line 138
    goto/16 :goto_5

    .line 139
    .line 140
    :cond_4
    :goto_1
    check-cast p4, Ljava/lang/Boolean;

    .line 141
    .line 142
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 143
    .line 144
    .line 145
    move-result p2

    .line 146
    if-eqz p2, :cond_6

    .line 147
    .line 148
    invoke-interface {p0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getCurrentEvent()Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    move-object p2, p0

    .line 157
    check-cast p2, Ljava/util/Collection;

    .line 158
    .line 159
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 160
    .line 161
    .line 162
    move-result p2

    .line 163
    :goto_2
    if-ge v3, p2, :cond_6

    .line 164
    .line 165
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p3

    .line 169
    check-cast p3, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 170
    .line 171
    invoke-static {p3}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUp(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 172
    .line 173
    .line 174
    move-result p4

    .line 175
    if-eqz p4, :cond_5

    .line 176
    .line 177
    invoke-virtual {p3}, Landroidx/compose/ui/input/pointer/PointerInputChange;->consume()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 178
    .line 179
    .line 180
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_6
    invoke-interface {p1}, Landroidx/compose/foundation/text/selection/MouseSelectionObserver;->onDragDone()V

    .line 184
    .line 185
    .line 186
    goto/16 :goto_9

    .line 187
    .line 188
    :goto_3
    invoke-interface {p1}, Landroidx/compose/foundation/text/selection/MouseSelectionObserver;->onDragDone()V

    .line 189
    .line 190
    .line 191
    throw p0

    .line 192
    :cond_7
    invoke-virtual {p2}, Landroidx/compose/foundation/text/selection/ClicksCounter;->getClicks()I

    .line 193
    .line 194
    .line 195
    move-result p2

    .line 196
    if-eq p2, v5, :cond_9

    .line 197
    .line 198
    if-eq p2, v4, :cond_8

    .line 199
    .line 200
    sget-object p2, Landroidx/compose/foundation/text/selection/SelectionAdjustment;->Companion:Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;

    .line 201
    .line 202
    invoke-virtual {p2}, Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;->getParagraph()Landroidx/compose/foundation/text/selection/SelectionAdjustment;

    .line 203
    .line 204
    .line 205
    move-result-object p2

    .line 206
    goto :goto_4

    .line 207
    :cond_8
    sget-object p2, Landroidx/compose/foundation/text/selection/SelectionAdjustment;->Companion:Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;

    .line 208
    .line 209
    invoke-virtual {p2}, Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;->getWord()Landroidx/compose/foundation/text/selection/SelectionAdjustment;

    .line 210
    .line 211
    .line 212
    move-result-object p2

    .line 213
    goto :goto_4

    .line 214
    :cond_9
    sget-object p2, Landroidx/compose/foundation/text/selection/SelectionAdjustment;->Companion:Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;

    .line 215
    .line 216
    invoke-virtual {p2}, Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;->getNone()Landroidx/compose/foundation/text/selection/SelectionAdjustment;

    .line 217
    .line 218
    .line 219
    move-result-object p2

    .line 220
    :goto_4
    invoke-virtual {p4}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 221
    .line 222
    .line 223
    move-result-wide v6

    .line 224
    invoke-interface {p1, v6, v7, p2}, Landroidx/compose/foundation/text/selection/MouseSelectionObserver;->onStart-3MmeM6k(JLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z

    .line 225
    .line 226
    .line 227
    move-result p3

    .line 228
    if-eqz p3, :cond_d

    .line 229
    .line 230
    :try_start_3
    invoke-virtual {p4}, Landroidx/compose/ui/input/pointer/PointerInputChange;->consume()V

    .line 231
    .line 232
    .line 233
    new-instance p3, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 234
    .line 235
    invoke-direct {p3}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 236
    .line 237
    .line 238
    sget-object v2, Landroidx/compose/foundation/text/selection/SelectionAdjustment;->Companion:Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;

    .line 239
    .line 240
    invoke-virtual {v2}, Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;->getNone()Landroidx/compose/foundation/text/selection/SelectionAdjustment;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    invoke-static {p2, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v2

    .line 248
    xor-int/2addr v2, v5

    .line 249
    iput-boolean v2, p3, Lkotlin/jvm/internal/Ref$BooleanRef;->c:Z

    .line 250
    .line 251
    invoke-virtual {p4}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 252
    .line 253
    .line 254
    move-result-wide v5

    .line 255
    new-instance p4, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelectionBtf2$shouldConsumeUp$2;

    .line 256
    .line 257
    invoke-direct {p4, p1, p2, p3}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelectionBtf2$shouldConsumeUp$2;-><init>(Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/selection/SelectionAdjustment;Lkotlin/jvm/internal/Ref$BooleanRef;)V

    .line 258
    .line 259
    .line 260
    iput-object p0, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelectionBtf2$1;->L$0:Ljava/lang/Object;

    .line 261
    .line 262
    iput-object p1, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelectionBtf2$1;->L$1:Ljava/lang/Object;

    .line 263
    .line 264
    iput-object p3, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelectionBtf2$1;->L$2:Ljava/lang/Object;

    .line 265
    .line 266
    iput v4, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelectionBtf2$1;->label:I

    .line 267
    .line 268
    invoke-static {p0, v5, v6, p4, v0}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->drag-jO51t88(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLhd/l;Lvc/c;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object p4

    .line 272
    if-ne p4, v1, :cond_a

    .line 273
    .line 274
    :goto_5
    return-object v1

    .line 275
    :cond_a
    move-object p2, p0

    .line 276
    move-object p0, p3

    .line 277
    :goto_6
    check-cast p4, Ljava/lang/Boolean;

    .line 278
    .line 279
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 280
    .line 281
    .line 282
    move-result p3

    .line 283
    if-eqz p3, :cond_c

    .line 284
    .line 285
    iget-boolean p0, p0, Lkotlin/jvm/internal/Ref$BooleanRef;->c:Z

    .line 286
    .line 287
    if-eqz p0, :cond_c

    .line 288
    .line 289
    invoke-interface {p2}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getCurrentEvent()Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 290
    .line 291
    .line 292
    move-result-object p0

    .line 293
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 294
    .line 295
    .line 296
    move-result-object p0

    .line 297
    move-object p2, p0

    .line 298
    check-cast p2, Ljava/util/Collection;

    .line 299
    .line 300
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 301
    .line 302
    .line 303
    move-result p2

    .line 304
    :goto_7
    if-ge v3, p2, :cond_c

    .line 305
    .line 306
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object p3

    .line 310
    check-cast p3, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 311
    .line 312
    invoke-static {p3}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUp(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 313
    .line 314
    .line 315
    move-result p4

    .line 316
    if-eqz p4, :cond_b

    .line 317
    .line 318
    invoke-virtual {p3}, Landroidx/compose/ui/input/pointer/PointerInputChange;->consume()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 319
    .line 320
    .line 321
    :cond_b
    add-int/lit8 v3, v3, 0x1

    .line 322
    .line 323
    goto :goto_7

    .line 324
    :cond_c
    invoke-interface {p1}, Landroidx/compose/foundation/text/selection/MouseSelectionObserver;->onDragDone()V

    .line 325
    .line 326
    .line 327
    goto :goto_9

    .line 328
    :goto_8
    invoke-interface {p1}, Landroidx/compose/foundation/text/selection/MouseSelectionObserver;->onDragDone()V

    .line 329
    .line 330
    .line 331
    throw p0

    .line 332
    :cond_d
    :goto_9
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 333
    .line 334
    return-object p0
.end method

.method public static final selectionGestureInput(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/TextDragObserver;)Landroidx/compose/ui/Modifier;
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGestureInput$1;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGestureInput$1;-><init>(Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/TextDragObserver;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1, p2, v0}, Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt;->pointerInput(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final selectionGesturePointerInputBtf2(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/TextDragObserver;Lvc/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/PointerInputScope;",
            "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;",
            "Landroidx/compose/foundation/text/TextDragObserver;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/foundation/text/selection/ClicksCounter;

    .line 2
    .line 3
    invoke-interface {p0}, Landroidx/compose/ui/input/pointer/PointerInputScope;->getViewConfiguration()Landroidx/compose/ui/platform/ViewConfiguration;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroidx/compose/foundation/text/selection/ClicksCounter;-><init>(Landroidx/compose/ui/platform/ViewConfiguration;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v1, v0, p1, p2, v2}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2;-><init>(Landroidx/compose/foundation/text/selection/ClicksCounter;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/TextDragObserver;Lvc/c;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p0, v1, p3}, Landroidx/compose/foundation/gestures/ForEachGestureKt;->awaitEachGesture(Landroidx/compose/ui/input/pointer/PointerInputScope;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-ne p0, p1, :cond_0

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 28
    .line 29
    return-object p0
.end method

.method private static final touchSelection(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/text/TextDragObserver;Landroidx/compose/ui/input/pointer/PointerEvent;Lvc/c;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "Landroidx/compose/foundation/text/TextDragObserver;",
            "Landroidx/compose/ui/input/pointer/PointerEvent;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p3, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelection$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelection$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelection$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelection$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelection$1;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelection$1;-><init>(Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelection$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelection$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v4, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    iget-object p0, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelection$1;->L$1:Ljava/lang/Object;

    .line 42
    .line 43
    move-object p1, p0

    .line 44
    check-cast p1, Landroidx/compose/foundation/text/TextDragObserver;

    .line 45
    .line 46
    iget-object p0, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelection$1;->L$0:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 49
    .line 50
    :try_start_0
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .line 52
    .line 53
    goto :goto_3

    .line 54
    :catch_0
    move-exception p0

    .line 55
    goto/16 :goto_6

    .line 56
    .line 57
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p0

    .line 65
    :cond_2
    iget-object p0, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelection$1;->L$2:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p0, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 68
    .line 69
    iget-object p1, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelection$1;->L$1:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p1, Landroidx/compose/foundation/text/TextDragObserver;

    .line 72
    .line 73
    iget-object p2, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelection$1;->L$0:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p2, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 76
    .line 77
    :try_start_1
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 78
    .line 79
    .line 80
    move-object v7, p2

    .line 81
    move-object p2, p0

    .line 82
    move-object p0, v7

    .line 83
    goto :goto_1

    .line 84
    :cond_3
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    :try_start_2
    invoke-virtual {p2}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    invoke-static {p2}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    check-cast p2, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 96
    .line 97
    invoke-virtual {p2}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 98
    .line 99
    .line 100
    move-result-wide v5

    .line 101
    iput-object p0, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelection$1;->L$0:Ljava/lang/Object;

    .line 102
    .line 103
    iput-object p1, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelection$1;->L$1:Ljava/lang/Object;

    .line 104
    .line 105
    iput-object p2, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelection$1;->L$2:Ljava/lang/Object;

    .line 106
    .line 107
    iput v4, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelection$1;->label:I

    .line 108
    .line 109
    invoke-static {p0, v5, v6, v0}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->awaitLongPressOrCancellation-rnUCldI(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLvc/c;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p3

    .line 113
    if-ne p3, v1, :cond_4

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_4
    :goto_1
    check-cast p3, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 117
    .line 118
    if-eqz p3, :cond_9

    .line 119
    .line 120
    invoke-interface {p0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getViewConfiguration()Landroidx/compose/ui/platform/ViewConfiguration;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-static {v2, p2, p3}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt;->distanceIsTolerable(Landroidx/compose/ui/platform/ViewConfiguration;Landroidx/compose/ui/input/pointer/PointerInputChange;Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 125
    .line 126
    .line 127
    move-result p2

    .line 128
    if-eqz p2, :cond_9

    .line 129
    .line 130
    invoke-virtual {p3}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 131
    .line 132
    .line 133
    move-result-wide v4

    .line 134
    invoke-interface {p1, v4, v5}, Landroidx/compose/foundation/text/TextDragObserver;->onStart-k-4lQ0M(J)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p3}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 138
    .line 139
    .line 140
    move-result-wide p2

    .line 141
    new-instance v2, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelection$2;

    .line 142
    .line 143
    invoke-direct {v2, p1}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelection$2;-><init>(Landroidx/compose/foundation/text/TextDragObserver;)V

    .line 144
    .line 145
    .line 146
    iput-object p0, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelection$1;->L$0:Ljava/lang/Object;

    .line 147
    .line 148
    iput-object p1, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelection$1;->L$1:Ljava/lang/Object;

    .line 149
    .line 150
    const/4 v4, 0x0

    .line 151
    iput-object v4, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelection$1;->L$2:Ljava/lang/Object;

    .line 152
    .line 153
    iput v3, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelection$1;->label:I

    .line 154
    .line 155
    invoke-static {p0, p2, p3, v2, v0}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->drag-jO51t88(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLhd/l;Lvc/c;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p3

    .line 159
    if-ne p3, v1, :cond_5

    .line 160
    .line 161
    :goto_2
    return-object v1

    .line 162
    :cond_5
    :goto_3
    check-cast p3, Ljava/lang/Boolean;

    .line 163
    .line 164
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 165
    .line 166
    .line 167
    move-result p2

    .line 168
    if-eqz p2, :cond_8

    .line 169
    .line 170
    invoke-interface {p0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getCurrentEvent()Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    move-object p2, p0

    .line 179
    check-cast p2, Ljava/util/Collection;

    .line 180
    .line 181
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 182
    .line 183
    .line 184
    move-result p2

    .line 185
    const/4 p3, 0x0

    .line 186
    :goto_4
    if-ge p3, p2, :cond_7

    .line 187
    .line 188
    invoke-interface {p0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    check-cast v0, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 193
    .line 194
    invoke-static {v0}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUp(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    if-eqz v1, :cond_6

    .line 199
    .line 200
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->consume()V

    .line 201
    .line 202
    .line 203
    :cond_6
    add-int/lit8 p3, p3, 0x1

    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_7
    invoke-interface {p1}, Landroidx/compose/foundation/text/TextDragObserver;->onStop()V

    .line 207
    .line 208
    .line 209
    goto :goto_5

    .line 210
    :cond_8
    invoke-interface {p1}, Landroidx/compose/foundation/text/TextDragObserver;->onCancel()V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0

    .line 211
    .line 212
    .line 213
    :cond_9
    :goto_5
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 214
    .line 215
    return-object p0

    .line 216
    :goto_6
    invoke-interface {p1}, Landroidx/compose/foundation/text/TextDragObserver;->onCancel()V

    .line 217
    .line 218
    .line 219
    throw p0
.end method

.method private static final touchSelectionFirstPress(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/text/TextDragObserver;Landroidx/compose/ui/input/pointer/PointerEvent;Lvc/c;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "Landroidx/compose/foundation/text/TextDragObserver;",
            "Landroidx/compose/ui/input/pointer/PointerEvent;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p3, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;-><init>(Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v4, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    iget-object p0, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;->L$1:Ljava/lang/Object;

    .line 42
    .line 43
    move-object p1, p0

    .line 44
    check-cast p1, Landroidx/compose/foundation/text/TextDragObserver;

    .line 45
    .line 46
    iget-object p0, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;->L$0:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 49
    .line 50
    :try_start_0
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .line 52
    .line 53
    goto :goto_3

    .line 54
    :catch_0
    move-exception p0

    .line 55
    goto/16 :goto_6

    .line 56
    .line 57
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p0

    .line 65
    :cond_2
    iget-object p0, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;->L$2:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p0, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 68
    .line 69
    iget-object p1, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;->L$1:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p1, Landroidx/compose/foundation/text/TextDragObserver;

    .line 72
    .line 73
    iget-object p2, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;->L$0:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p2, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 76
    .line 77
    :try_start_1
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 78
    .line 79
    .line 80
    move-object v7, p2

    .line 81
    move-object p2, p0

    .line 82
    move-object p0, v7

    .line 83
    goto :goto_1

    .line 84
    :cond_3
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    :try_start_2
    invoke-virtual {p2}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    invoke-static {p2}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    check-cast p2, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 96
    .line 97
    invoke-virtual {p2}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 98
    .line 99
    .line 100
    move-result-wide v5

    .line 101
    iput-object p0, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;->L$0:Ljava/lang/Object;

    .line 102
    .line 103
    iput-object p1, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;->L$1:Ljava/lang/Object;

    .line 104
    .line 105
    iput-object p2, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;->L$2:Ljava/lang/Object;

    .line 106
    .line 107
    iput v4, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;->label:I

    .line 108
    .line 109
    invoke-static {p0, v5, v6, v0}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->awaitLongPressOrCancellation-rnUCldI(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLvc/c;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p3

    .line 113
    if-ne p3, v1, :cond_4

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_4
    :goto_1
    check-cast p3, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 117
    .line 118
    if-eqz p3, :cond_9

    .line 119
    .line 120
    invoke-interface {p0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getViewConfiguration()Landroidx/compose/ui/platform/ViewConfiguration;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-static {v2, p2, p3}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt;->distanceIsTolerable(Landroidx/compose/ui/platform/ViewConfiguration;Landroidx/compose/ui/input/pointer/PointerInputChange;Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 125
    .line 126
    .line 127
    move-result p2

    .line 128
    if-eqz p2, :cond_9

    .line 129
    .line 130
    invoke-virtual {p3}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 131
    .line 132
    .line 133
    move-result-wide v4

    .line 134
    invoke-interface {p1, v4, v5}, Landroidx/compose/foundation/text/TextDragObserver;->onStart-k-4lQ0M(J)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p3}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 138
    .line 139
    .line 140
    move-result-wide p2

    .line 141
    new-instance v2, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$dragCompletedWithUp$1;

    .line 142
    .line 143
    invoke-direct {v2, p1}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$dragCompletedWithUp$1;-><init>(Landroidx/compose/foundation/text/TextDragObserver;)V

    .line 144
    .line 145
    .line 146
    iput-object p0, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;->L$0:Ljava/lang/Object;

    .line 147
    .line 148
    iput-object p1, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;->L$1:Ljava/lang/Object;

    .line 149
    .line 150
    const/4 v4, 0x0

    .line 151
    iput-object v4, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;->L$2:Ljava/lang/Object;

    .line 152
    .line 153
    iput v3, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;->label:I

    .line 154
    .line 155
    invoke-static {p0, p2, p3, v2, v0}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->drag-jO51t88(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLhd/l;Lvc/c;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p3

    .line 159
    if-ne p3, v1, :cond_5

    .line 160
    .line 161
    :goto_2
    return-object v1

    .line 162
    :cond_5
    :goto_3
    check-cast p3, Ljava/lang/Boolean;

    .line 163
    .line 164
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 165
    .line 166
    .line 167
    move-result p2

    .line 168
    if-eqz p2, :cond_8

    .line 169
    .line 170
    invoke-interface {p0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getCurrentEvent()Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    move-object p2, p0

    .line 179
    check-cast p2, Ljava/util/Collection;

    .line 180
    .line 181
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 182
    .line 183
    .line 184
    move-result p2

    .line 185
    const/4 p3, 0x0

    .line 186
    :goto_4
    if-ge p3, p2, :cond_7

    .line 187
    .line 188
    invoke-interface {p0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    check-cast v0, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 193
    .line 194
    invoke-static {v0}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUp(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    if-eqz v1, :cond_6

    .line 199
    .line 200
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->consume()V

    .line 201
    .line 202
    .line 203
    :cond_6
    add-int/lit8 p3, p3, 0x1

    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_7
    invoke-interface {p1}, Landroidx/compose/foundation/text/TextDragObserver;->onStop()V

    .line 207
    .line 208
    .line 209
    goto :goto_5

    .line 210
    :cond_8
    invoke-interface {p1}, Landroidx/compose/foundation/text/TextDragObserver;->onCancel()V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0

    .line 211
    .line 212
    .line 213
    :cond_9
    :goto_5
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 214
    .line 215
    return-object p0

    .line 216
    :goto_6
    invoke-interface {p1}, Landroidx/compose/foundation/text/TextDragObserver;->onCancel()V

    .line 217
    .line 218
    .line 219
    throw p0
.end method

.method private static final touchSelectionSubsequentPress(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/text/TextDragObserver;Landroidx/compose/ui/input/pointer/PointerEvent;Lvc/c;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "Landroidx/compose/foundation/text/TextDragObserver;",
            "Landroidx/compose/ui/input/pointer/PointerEvent;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p3, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;-><init>(Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v5, :cond_2

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    iget-object p0, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;->L$1:Ljava/lang/Object;

    .line 43
    .line 44
    move-object p1, p0

    .line 45
    check-cast p1, Landroidx/compose/foundation/text/TextDragObserver;

    .line 46
    .line 47
    iget-object p0, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;->L$0:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p0, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 50
    .line 51
    :try_start_0
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    .line 53
    .line 54
    goto/16 :goto_3

    .line 55
    .line 56
    :catch_0
    move-exception p0

    .line 57
    goto/16 :goto_6

    .line 58
    .line 59
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 62
    .line 63
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p0

    .line 67
    :cond_2
    iget-wide p0, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;->J$0:J

    .line 68
    .line 69
    iget-object p2, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;->L$3:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p2, Lkotlin/jvm/internal/Ref$LongRef;

    .line 72
    .line 73
    iget-object v2, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;->L$2:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v2, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 76
    .line 77
    iget-object v5, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;->L$1:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v5, Landroidx/compose/foundation/text/TextDragObserver;

    .line 80
    .line 81
    iget-object v6, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;->L$0:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v6, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 84
    .line 85
    :try_start_1
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1

    .line 86
    .line 87
    .line 88
    move-object v10, v6

    .line 89
    move-object v6, p2

    .line 90
    move-object v11, v5

    .line 91
    move-object v5, p3

    .line 92
    move-wide p2, p0

    .line 93
    move-object p1, v11

    .line 94
    move-object p0, v10

    .line 95
    goto :goto_1

    .line 96
    :catch_1
    move-exception p0

    .line 97
    move-object p1, v5

    .line 98
    goto/16 :goto_6

    .line 99
    .line 100
    :cond_3
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    :try_start_2
    invoke-virtual {p2}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    invoke-static {p2}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    move-object v2, p2

    .line 112
    check-cast v2, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 113
    .line 114
    invoke-virtual {v2}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 115
    .line 116
    .line 117
    move-result-wide p2

    .line 118
    new-instance v6, Lkotlin/jvm/internal/Ref$LongRef;

    .line 119
    .line 120
    invoke-direct {v6}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 121
    .line 122
    .line 123
    sget-object v7, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 124
    .line 125
    invoke-virtual {v7}, Landroidx/compose/ui/geometry/Offset$Companion;->getUnspecified-F1C5BW0()J

    .line 126
    .line 127
    .line 128
    move-result-wide v7

    .line 129
    iput-wide v7, v6, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 130
    .line 131
    invoke-interface {p0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getViewConfiguration()Landroidx/compose/ui/platform/ViewConfiguration;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    invoke-interface {v7}, Landroidx/compose/ui/platform/ViewConfiguration;->getLongPressTimeoutMillis()J

    .line 136
    .line 137
    .line 138
    move-result-wide v7

    .line 139
    new-instance v9, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1;

    .line 140
    .line 141
    invoke-direct {v9, p2, p3, v6, v4}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1;-><init>(JLkotlin/jvm/internal/Ref$LongRef;Lvc/c;)V

    .line 142
    .line 143
    .line 144
    iput-object p0, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;->L$0:Ljava/lang/Object;

    .line 145
    .line 146
    iput-object p1, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;->L$1:Ljava/lang/Object;

    .line 147
    .line 148
    iput-object v2, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;->L$2:Ljava/lang/Object;

    .line 149
    .line 150
    iput-object v6, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;->L$3:Ljava/lang/Object;

    .line 151
    .line 152
    iput-wide p2, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;->J$0:J

    .line 153
    .line 154
    iput v5, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;->label:I

    .line 155
    .line 156
    invoke-interface {p0, v7, v8, v9, v0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->withTimeoutOrNull(JLhd/p;Lvc/c;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    if-ne v5, v1, :cond_4

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_4
    :goto_1
    check-cast v5, Landroidx/compose/foundation/text/selection/DownResolution;

    .line 164
    .line 165
    if-nez v5, :cond_5

    .line 166
    .line 167
    sget-object v5, Landroidx/compose/foundation/text/selection/DownResolution;->Timeout:Landroidx/compose/foundation/text/selection/DownResolution;

    .line 168
    .line 169
    :cond_5
    sget-object v7, Landroidx/compose/foundation/text/selection/DownResolution;->Cancel:Landroidx/compose/foundation/text/selection/DownResolution;

    .line 170
    .line 171
    if-ne v5, v7, :cond_6

    .line 172
    .line 173
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 174
    .line 175
    return-object p0

    .line 176
    :cond_6
    invoke-virtual {v2}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 177
    .line 178
    .line 179
    move-result-wide v7

    .line 180
    invoke-interface {p1, v7, v8}, Landroidx/compose/foundation/text/TextDragObserver;->onStart-k-4lQ0M(J)V

    .line 181
    .line 182
    .line 183
    sget-object v2, Landroidx/compose/foundation/text/selection/DownResolution;->Up:Landroidx/compose/foundation/text/selection/DownResolution;

    .line 184
    .line 185
    if-ne v5, v2, :cond_7

    .line 186
    .line 187
    invoke-interface {p1}, Landroidx/compose/foundation/text/TextDragObserver;->onStop()V

    .line 188
    .line 189
    .line 190
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 191
    .line 192
    return-object p0

    .line 193
    :cond_7
    sget-object v2, Landroidx/compose/foundation/text/selection/DownResolution;->Drag:Landroidx/compose/foundation/text/selection/DownResolution;

    .line 194
    .line 195
    if-ne v5, v2, :cond_8

    .line 196
    .line 197
    iget-wide v5, v6, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 198
    .line 199
    invoke-interface {p1, v5, v6}, Landroidx/compose/foundation/text/TextDragObserver;->onDrag-k-4lQ0M(J)V

    .line 200
    .line 201
    .line 202
    :cond_8
    new-instance v2, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$dragCompletedWithUp$1;

    .line 203
    .line 204
    invoke-direct {v2, p1}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$dragCompletedWithUp$1;-><init>(Landroidx/compose/foundation/text/TextDragObserver;)V

    .line 205
    .line 206
    .line 207
    iput-object p0, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;->L$0:Ljava/lang/Object;

    .line 208
    .line 209
    iput-object p1, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;->L$1:Ljava/lang/Object;

    .line 210
    .line 211
    iput-object v4, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;->L$2:Ljava/lang/Object;

    .line 212
    .line 213
    iput-object v4, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;->L$3:Ljava/lang/Object;

    .line 214
    .line 215
    iput v3, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;->label:I

    .line 216
    .line 217
    invoke-static {p0, p2, p3, v2, v0}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->drag-jO51t88(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLhd/l;Lvc/c;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object p3

    .line 221
    if-ne p3, v1, :cond_9

    .line 222
    .line 223
    :goto_2
    return-object v1

    .line 224
    :cond_9
    :goto_3
    check-cast p3, Ljava/lang/Boolean;

    .line 225
    .line 226
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 227
    .line 228
    .line 229
    move-result p2

    .line 230
    if-eqz p2, :cond_c

    .line 231
    .line 232
    invoke-interface {p0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getCurrentEvent()Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    move-object p2, p0

    .line 241
    check-cast p2, Ljava/util/Collection;

    .line 242
    .line 243
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 244
    .line 245
    .line 246
    move-result p2

    .line 247
    const/4 p3, 0x0

    .line 248
    :goto_4
    if-ge p3, p2, :cond_b

    .line 249
    .line 250
    invoke-interface {p0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    check-cast v0, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 255
    .line 256
    invoke-static {v0}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUp(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 257
    .line 258
    .line 259
    move-result v1

    .line 260
    if-eqz v1, :cond_a

    .line 261
    .line 262
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->consume()V

    .line 263
    .line 264
    .line 265
    :cond_a
    add-int/lit8 p3, p3, 0x1

    .line 266
    .line 267
    goto :goto_4

    .line 268
    :cond_b
    invoke-interface {p1}, Landroidx/compose/foundation/text/TextDragObserver;->onStop()V

    .line 269
    .line 270
    .line 271
    goto :goto_5

    .line 272
    :cond_c
    invoke-interface {p1}, Landroidx/compose/foundation/text/TextDragObserver;->onCancel()V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0

    .line 273
    .line 274
    .line 275
    :goto_5
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 276
    .line 277
    return-object p0

    .line 278
    :goto_6
    invoke-interface {p1}, Landroidx/compose/foundation/text/TextDragObserver;->onCancel()V

    .line 279
    .line 280
    .line 281
    throw p0
.end method

.method public static final updateSelectionTouchMode(Landroidx/compose/ui/Modifier;Lhd/l;)Landroidx/compose/ui/Modifier;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lhd/l;",
            ")",
            "Landroidx/compose/ui/Modifier;"
        }
    .end annotation

    .line 1
    const v0, 0x845fed

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v1, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$updateSelectionTouchMode$1;

    .line 9
    .line 10
    invoke-direct {v1, p1}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$updateSelectionTouchMode$1;-><init>(Lhd/l;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v0, v1}, Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt;->pointerInput(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
