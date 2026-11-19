.class final Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5;
.super Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->detectDragGesturesAfterLongPress(Landroidx/compose/ui/input/pointer/PointerInputScope;Lhd/l;Lhd/a;Lhd/a;Lhd/p;Lvc/c;)Ljava/lang/Object;
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
    c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5"
    f = "DragGestureDetector.kt"
    l = {
        0x162,
        0x163,
        0x168
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $onDrag:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field

.field final synthetic $onDragCancel:Lhd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/a;"
        }
    .end annotation
.end field

.field final synthetic $onDragEnd:Lhd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/a;"
        }
    .end annotation
.end field

.field final synthetic $onDragStart:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lhd/l;Lhd/a;Lhd/a;Lhd/p;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            "Lhd/a;",
            "Lhd/a;",
            "Lhd/p;",
            "Lvc/c<",
            "-",
            "Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5;->$onDragStart:Lhd/l;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5;->$onDragEnd:Lhd/a;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5;->$onDragCancel:Lhd/a;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5;->$onDrag:Lhd/p;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;-><init>(ILvc/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 6
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
    new-instance v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5;->$onDragStart:Lhd/l;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5;->$onDragEnd:Lhd/a;

    .line 6
    .line 7
    iget-object v3, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5;->$onDragCancel:Lhd/a;

    .line 8
    .line 9
    iget-object v4, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5;->$onDrag:Lhd/p;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5;-><init>(Lhd/l;Lhd/a;Lhd/a;Lhd/p;Lvc/c;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5;->L$0:Ljava/lang/Object;

    .line 16
    .line 17
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
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5;->invoke(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5;->label:I

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v1, :cond_3

    .line 11
    .line 12
    if-eq v1, v4, :cond_2

    .line 13
    .line 14
    if-eq v1, v3, :cond_1

    .line 15
    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5;->L$0:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 21
    .line 22
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    move-object v8, p0

    .line 26
    goto/16 :goto_3

    .line 27
    .line 28
    :catch_0
    move-exception v0

    .line 29
    move-object p1, v0

    .line 30
    move-object v8, p0

    .line 31
    goto/16 :goto_8

    .line 32
    .line 33
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 36
    .line 37
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1

    .line 41
    :cond_1
    iget-object v1, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5;->L$0:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 44
    .line 45
    :try_start_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 46
    .line 47
    .line 48
    move-object v8, p0

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    iget-object v1, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5;->L$0:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 53
    .line 54
    :try_start_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0

    .line 55
    .line 56
    .line 57
    move-object v8, p0

    .line 58
    goto :goto_0

    .line 59
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5;->L$0:Ljava/lang/Object;

    .line 63
    .line 64
    move-object v5, p1

    .line 65
    check-cast v5, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 66
    .line 67
    :try_start_3
    iput-object v5, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5;->L$0:Ljava/lang/Object;

    .line 68
    .line 69
    iput v4, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5;->label:I
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_2

    .line 70
    .line 71
    const/4 v6, 0x0

    .line 72
    const/4 v7, 0x0

    .line 73
    const/4 v9, 0x2

    .line 74
    const/4 v10, 0x0

    .line 75
    move-object v8, p0

    .line 76
    :try_start_4
    invoke-static/range {v5 .. v10}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->awaitFirstDown$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLandroidx/compose/ui/input/pointer/PointerEventPass;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    if-ne p1, v0, :cond_4

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_4
    move-object v1, v5

    .line 84
    :goto_0
    check-cast p1, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 85
    .line 86
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 87
    .line 88
    .line 89
    move-result-wide v4

    .line 90
    iput-object v1, v8, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5;->L$0:Ljava/lang/Object;

    .line 91
    .line 92
    iput v3, v8, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5;->label:I

    .line 93
    .line 94
    invoke-static {v1, v4, v5, p0}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->awaitLongPressOrCancellation-rnUCldI(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLvc/c;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    if-ne p1, v0, :cond_5

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_5
    :goto_1
    check-cast p1, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 102
    .line 103
    if-eqz p1, :cond_a

    .line 104
    .line 105
    iget-object v3, v8, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5;->$onDragStart:Lhd/l;

    .line 106
    .line 107
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 108
    .line 109
    .line 110
    move-result-wide v4

    .line 111
    invoke-static {v4, v5}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    invoke-interface {v3, v4}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 119
    .line 120
    .line 121
    move-result-wide v3

    .line 122
    new-instance p1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$1;

    .line 123
    .line 124
    iget-object v5, v8, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5;->$onDrag:Lhd/p;

    .line 125
    .line 126
    invoke-direct {p1, v5}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$1;-><init>(Lhd/p;)V

    .line 127
    .line 128
    .line 129
    iput-object v1, v8, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5;->L$0:Ljava/lang/Object;

    .line 130
    .line 131
    iput v2, v8, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5;->label:I

    .line 132
    .line 133
    invoke-static {v1, v3, v4, p1, p0}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->drag-jO51t88(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLhd/l;Lvc/c;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    if-ne p1, v0, :cond_6

    .line 138
    .line 139
    :goto_2
    return-object v0

    .line 140
    :cond_6
    move-object v0, v1

    .line 141
    :goto_3
    check-cast p1, Ljava/lang/Boolean;

    .line 142
    .line 143
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    if-eqz p1, :cond_9

    .line 148
    .line 149
    invoke-interface {v0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getCurrentEvent()Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    move-object v0, p1

    .line 158
    check-cast v0, Ljava/util/Collection;

    .line 159
    .line 160
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    const/4 v1, 0x0

    .line 165
    :goto_4
    if-ge v1, v0, :cond_8

    .line 166
    .line 167
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    check-cast v2, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 172
    .line 173
    invoke-static {v2}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUp(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    if-eqz v3, :cond_7

    .line 178
    .line 179
    invoke-virtual {v2}, Landroidx/compose/ui/input/pointer/PointerInputChange;->consume()V

    .line 180
    .line 181
    .line 182
    goto :goto_6

    .line 183
    :catch_1
    move-exception v0

    .line 184
    :goto_5
    move-object p1, v0

    .line 185
    goto :goto_8

    .line 186
    :cond_7
    :goto_6
    add-int/lit8 v1, v1, 0x1

    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_8
    iget-object p1, v8, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5;->$onDragEnd:Lhd/a;

    .line 190
    .line 191
    invoke-interface {p1}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    goto :goto_7

    .line 195
    :cond_9
    iget-object p1, v8, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5;->$onDragCancel:Lhd/a;

    .line 196
    .line 197
    invoke-interface {p1}, Lhd/a;->invoke()Ljava/lang/Object;
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_1

    .line 198
    .line 199
    .line 200
    :cond_a
    :goto_7
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 201
    .line 202
    return-object p1

    .line 203
    :catch_2
    move-exception v0

    .line 204
    move-object v8, p0

    .line 205
    goto :goto_5

    .line 206
    :goto_8
    iget-object v0, v8, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5;->$onDragCancel:Lhd/a;

    .line 207
    .line 208
    invoke-interface {v0}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    throw p1
.end method
