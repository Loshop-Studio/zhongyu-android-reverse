.class final Landroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2;
.super Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text/selection/SelectionGesturesKt;->selectionGesturePointerInputBtf2(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/TextDragObserver;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGesturePointerInputBtf2$2"
    f = "SelectionGestures.kt"
    l = {
        0xd1,
        0xd9,
        0xdc,
        0xdd
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $clicksCounter:Landroidx/compose/foundation/text/selection/ClicksCounter;

.field final synthetic $mouseSelectionObserver:Landroidx/compose/foundation/text/selection/MouseSelectionObserver;

.field final synthetic $textDragObserver:Landroidx/compose/foundation/text/TextDragObserver;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/text/selection/ClicksCounter;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/TextDragObserver;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text/selection/ClicksCounter;",
            "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;",
            "Landroidx/compose/foundation/text/TextDragObserver;",
            "Lvc/c<",
            "-",
            "Landroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2;->$clicksCounter:Landroidx/compose/foundation/text/selection/ClicksCounter;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2;->$mouseSelectionObserver:Landroidx/compose/foundation/text/selection/MouseSelectionObserver;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2;->$textDragObserver:Landroidx/compose/foundation/text/TextDragObserver;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;-><init>(ILvc/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lvc/c<",
            "*>;)",
            "Lvc/c<",
            "Lqc/q;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2;->$clicksCounter:Landroidx/compose/foundation/text/selection/ClicksCounter;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2;->$mouseSelectionObserver:Landroidx/compose/foundation/text/selection/MouseSelectionObserver;

    .line 6
    .line 7
    iget-object v3, p0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2;->$textDragObserver:Landroidx/compose/foundation/text/TextDragObserver;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3, p2}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2;-><init>(Landroidx/compose/foundation/text/selection/ClicksCounter;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/TextDragObserver;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2;->L$0:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public final invoke(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lvc/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2;->invoke(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2;->label:I

    .line 6
    .line 7
    const/4 v2, 0x4

    .line 8
    const/4 v3, 0x3

    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x1

    .line 11
    if-eqz v1, :cond_3

    .line 12
    .line 13
    if-eq v1, v5, :cond_2

    .line 14
    .line 15
    if-eq v1, v4, :cond_1

    .line 16
    .line 17
    if-eq v1, v3, :cond_1

    .line 18
    .line 19
    if-ne v1, v2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1

    .line 30
    :cond_1
    :goto_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto/16 :goto_5

    .line 34
    .line 35
    :cond_2
    iget-object v1, p0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2;->L$0:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 38
    .line 39
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2;->L$0:Ljava/lang/Object;

    .line 47
    .line 48
    move-object v1, p1

    .line 49
    check-cast v1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 50
    .line 51
    iput-object v1, p0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2;->L$0:Ljava/lang/Object;

    .line 52
    .line 53
    iput v5, p0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2;->label:I

    .line 54
    .line 55
    invoke-static {v1, p0}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt;->access$awaitDown(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lvc/c;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-ne p1, v0, :cond_4

    .line 60
    .line 61
    goto :goto_4

    .line 62
    :cond_4
    :goto_1
    check-cast p1, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 63
    .line 64
    iget-object v6, p0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2;->$clicksCounter:Landroidx/compose/foundation/text/selection/ClicksCounter;

    .line 65
    .line 66
    invoke-virtual {v6, p1}, Landroidx/compose/foundation/text/selection/ClicksCounter;->update(Landroidx/compose/ui/input/pointer/PointerEvent;)V

    .line 67
    .line 68
    .line 69
    invoke-static {p1}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt;->isPrecisePointer(Landroidx/compose/ui/input/pointer/PointerEvent;)Z

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    const/4 v7, 0x0

    .line 74
    if-eqz v6, :cond_7

    .line 75
    .line 76
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerEvent;->getButtons-ry648PA()I

    .line 77
    .line 78
    .line 79
    move-result v8

    .line 80
    invoke-static {v8}, Landroidx/compose/ui/input/pointer/PointerEvent_androidKt;->isPrimaryPressed-aHzCx-E(I)Z

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    if-eqz v8, :cond_7

    .line 85
    .line 86
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    move-object v9, v8

    .line 91
    check-cast v9, Ljava/util/Collection;

    .line 92
    .line 93
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 94
    .line 95
    .line 96
    move-result v9

    .line 97
    const/4 v10, 0x0

    .line 98
    :goto_2
    if-ge v10, v9, :cond_6

    .line 99
    .line 100
    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v11

    .line 104
    check-cast v11, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 105
    .line 106
    invoke-virtual {v11}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 107
    .line 108
    .line 109
    move-result v11

    .line 110
    if-eqz v11, :cond_5

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_5
    add-int/lit8 v10, v10, 0x1

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_6
    iget-object v2, p0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2;->$mouseSelectionObserver:Landroidx/compose/foundation/text/selection/MouseSelectionObserver;

    .line 117
    .line 118
    iget-object v3, p0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2;->$clicksCounter:Landroidx/compose/foundation/text/selection/ClicksCounter;

    .line 119
    .line 120
    iput-object v7, p0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2;->L$0:Ljava/lang/Object;

    .line 121
    .line 122
    iput v4, p0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2;->label:I

    .line 123
    .line 124
    invoke-static {v1, v2, v3, p1, p0}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt;->access$mouseSelectionBtf2(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/selection/ClicksCounter;Landroidx/compose/ui/input/pointer/PointerEvent;Lvc/c;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    if-ne p1, v0, :cond_9

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_7
    :goto_3
    if-nez v6, :cond_9

    .line 132
    .line 133
    iget-object v4, p0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2;->$clicksCounter:Landroidx/compose/foundation/text/selection/ClicksCounter;

    .line 134
    .line 135
    invoke-virtual {v4}, Landroidx/compose/foundation/text/selection/ClicksCounter;->getClicks()I

    .line 136
    .line 137
    .line 138
    move-result v4

    .line 139
    if-ne v4, v5, :cond_8

    .line 140
    .line 141
    iget-object v2, p0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2;->$textDragObserver:Landroidx/compose/foundation/text/TextDragObserver;

    .line 142
    .line 143
    iput-object v7, p0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2;->L$0:Ljava/lang/Object;

    .line 144
    .line 145
    iput v3, p0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2;->label:I

    .line 146
    .line 147
    invoke-static {v1, v2, p1, p0}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt;->access$touchSelectionFirstPress(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/text/TextDragObserver;Landroidx/compose/ui/input/pointer/PointerEvent;Lvc/c;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    if-ne p1, v0, :cond_9

    .line 152
    .line 153
    goto :goto_4

    .line 154
    :cond_8
    iget-object v3, p0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2;->$textDragObserver:Landroidx/compose/foundation/text/TextDragObserver;

    .line 155
    .line 156
    iput-object v7, p0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2;->L$0:Ljava/lang/Object;

    .line 157
    .line 158
    iput v2, p0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGesturePointerInputBtf2$2;->label:I

    .line 159
    .line 160
    invoke-static {v1, v3, p1, p0}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt;->access$touchSelectionSubsequentPress(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/text/TextDragObserver;Landroidx/compose/ui/input/pointer/PointerEvent;Lvc/c;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    if-ne p1, v0, :cond_9

    .line 165
    .line 166
    :goto_4
    return-object v0

    .line 167
    :cond_9
    :goto_5
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 168
    .line 169
    return-object p1
.end method
