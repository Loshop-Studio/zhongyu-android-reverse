.class final Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;
.super Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/TransformGestureDetectorKt;->detectTransformGestures(Landroidx/compose/ui/input/pointer/PointerInputScope;ZLkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
        "",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2"
    f = "TransformGestureDetector.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1
    }
    l = {
        0x3b,
        0x3d
    }
    m = "invokeSuspend"
    n = {
        "$this$awaitEachGesture",
        "rotation",
        "zoom",
        "pan",
        "pastTouchSlop",
        "touchSlop",
        "lockedToPanZoom",
        "$this$awaitEachGesture",
        "rotation",
        "zoom",
        "pan",
        "pastTouchSlop",
        "touchSlop",
        "lockedToPanZoom"
    }
    s = {
        "L$0",
        "F$0",
        "F$1",
        "J$0",
        "I$0",
        "F$2",
        "I$1",
        "L$0",
        "F$0",
        "F$1",
        "J$0",
        "I$0",
        "F$2",
        "I$1"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTransformGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,255:1\n101#2,2:256\n33#2,6:258\n103#2:264\n33#2,6:265\n101#2,2:271\n33#2,6:273\n103#2:279\n*S KotlinDebug\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2\n*L\n62#1:256,2\n62#1:258,6\n62#1:264\n96#1:265,6\n103#1:271,2\n103#1:273,6\n103#1:279\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $onGesture:Lkotlin/jvm/functions/Function4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function4<",
            "Landroidx/compose/ui/geometry/Offset;",
            "Landroidx/compose/ui/geometry/Offset;",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $panZoomLock:Z

.field F$0:F

.field F$1:F

.field F$2:F

.field I$0:I

.field I$1:I

.field J$0:J

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(ZLkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function4<",
            "-",
            "Landroidx/compose/ui/geometry/Offset;",
            "-",
            "Landroidx/compose/ui/geometry/Offset;",
            "-",
            "Ljava/lang/Float;",
            "-",
            "Ljava/lang/Float;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->$panZoomLock:Z

    iput-object p2, p0, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->$onGesture:Lkotlin/jvm/functions/Function4;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;

    iget-boolean v1, p0, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->$panZoomLock:Z

    iget-object v2, p0, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->$onGesture:Lkotlin/jvm/functions/Function4;

    invoke-direct {v0, v1, v2, p2}, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;-><init>(ZLkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->invoke(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v7

    .line 7
    iget v0, v6, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->label:I

    .line 8
    .line 9
    const/high16 v8, 0x3f800000    # 1.0f

    .line 10
    .line 11
    const/4 v9, 0x2

    .line 12
    const/4 v10, 0x0

    .line 13
    const/4 v11, 0x0

    .line 14
    const/4 v12, 0x1

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    if-eq v0, v12, :cond_1

    .line 18
    .line 19
    if-ne v0, v9, :cond_0

    .line 20
    .line 21
    iget v0, v6, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->I$1:I

    .line 22
    .line 23
    iget v1, v6, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->F$2:F

    .line 24
    .line 25
    iget v2, v6, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->I$0:I

    .line 26
    .line 27
    iget-wide v3, v6, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->J$0:J

    .line 28
    .line 29
    iget v5, v6, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->F$1:F

    .line 30
    .line 31
    iget v13, v6, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->F$0:F

    .line 32
    .line 33
    iget-object v14, v6, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->L$0:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v14, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 36
    .line 37
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    move-object/from16 v9, p1

    .line 41
    .line 42
    move-object v15, v6

    .line 43
    goto/16 :goto_2

    .line 44
    .line 45
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v0

    .line 53
    :cond_1
    iget v0, v6, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->I$1:I

    .line 54
    .line 55
    iget v1, v6, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->F$2:F

    .line 56
    .line 57
    iget v2, v6, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->I$0:I

    .line 58
    .line 59
    iget-wide v3, v6, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->J$0:J

    .line 60
    .line 61
    iget v5, v6, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->F$1:F

    .line 62
    .line 63
    iget v13, v6, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->F$0:F

    .line 64
    .line 65
    iget-object v14, v6, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->L$0:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v14, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 68
    .line 69
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iget-object v0, v6, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->L$0:Ljava/lang/Object;

    .line 77
    .line 78
    move-object v14, v0

    .line 79
    check-cast v14, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 80
    .line 81
    sget-object v0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 82
    .line 83
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 84
    .line 85
    .line 86
    move-result-wide v4

    .line 87
    invoke-interface {v14}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getViewConfiguration()Landroidx/compose/ui/platform/ViewConfiguration;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-interface {v0}, Landroidx/compose/ui/platform/ViewConfiguration;->getTouchSlop()F

    .line 92
    .line 93
    .line 94
    move-result v13

    .line 95
    const/4 v1, 0x0

    .line 96
    const/4 v2, 0x0

    .line 97
    const/4 v15, 0x2

    .line 98
    const/16 v16, 0x0

    .line 99
    .line 100
    iput-object v14, v6, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->L$0:Ljava/lang/Object;

    .line 101
    .line 102
    iput v10, v6, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->F$0:F

    .line 103
    .line 104
    iput v8, v6, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->F$1:F

    .line 105
    .line 106
    iput-wide v4, v6, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->J$0:J

    .line 107
    .line 108
    iput v11, v6, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->I$0:I

    .line 109
    .line 110
    iput v13, v6, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->F$2:F

    .line 111
    .line 112
    iput v11, v6, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->I$1:I

    .line 113
    .line 114
    iput v12, v6, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->label:I

    .line 115
    .line 116
    move-object v0, v14

    .line 117
    move-object/from16 v3, p0

    .line 118
    .line 119
    move-wide/from16 v17, v4

    .line 120
    .line 121
    move v4, v15

    .line 122
    move-object/from16 v5, v16

    .line 123
    .line 124
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->awaitFirstDown$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLandroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    if-ne v0, v7, :cond_3

    .line 129
    .line 130
    return-object v7

    .line 131
    :cond_3
    move v5, v8

    .line 132
    move v0, v11

    .line 133
    move v2, v0

    .line 134
    move v1, v13

    .line 135
    move-wide/from16 v3, v17

    .line 136
    .line 137
    move v13, v10

    .line 138
    :goto_0
    move-object v15, v6

    .line 139
    :goto_1
    iput-object v14, v15, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->L$0:Ljava/lang/Object;

    .line 140
    .line 141
    iput v13, v15, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->F$0:F

    .line 142
    .line 143
    iput v5, v15, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->F$1:F

    .line 144
    .line 145
    iput-wide v3, v15, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->J$0:J

    .line 146
    .line 147
    iput v2, v15, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->I$0:I

    .line 148
    .line 149
    iput v1, v15, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->F$2:F

    .line 150
    .line 151
    iput v0, v15, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->I$1:I

    .line 152
    .line 153
    iput v9, v15, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->label:I

    .line 154
    .line 155
    const/4 v9, 0x0

    .line 156
    invoke-static {v14, v9, v15, v12, v9}, Landroidx/compose/ui/input/pointer/b;->t(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v9

    .line 160
    if-ne v9, v7, :cond_4

    .line 161
    .line 162
    return-object v7

    .line 163
    :cond_4
    :goto_2
    check-cast v9, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 164
    .line 165
    invoke-virtual {v9}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 166
    .line 167
    .line 168
    move-result-object v8

    .line 169
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 170
    .line 171
    .line 172
    move-result v10

    .line 173
    move v12, v11

    .line 174
    :goto_3
    if-ge v12, v10, :cond_6

    .line 175
    .line 176
    invoke-interface {v8, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v20

    .line 180
    check-cast v20, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 181
    .line 182
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 183
    .line 184
    .line 185
    move-result v20

    .line 186
    if-eqz v20, :cond_5

    .line 187
    .line 188
    const/4 v8, 0x1

    .line 189
    goto :goto_4

    .line 190
    :cond_5
    add-int/lit8 v12, v12, 0x1

    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_6
    move v8, v11

    .line 194
    :goto_4
    if-nez v8, :cond_14

    .line 195
    .line 196
    invoke-static {v9}, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt;->calculateZoom(Landroidx/compose/ui/input/pointer/PointerEvent;)F

    .line 197
    .line 198
    .line 199
    move-result v10

    .line 200
    invoke-static {v9}, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt;->calculateRotation(Landroidx/compose/ui/input/pointer/PointerEvent;)F

    .line 201
    .line 202
    .line 203
    move-result v12

    .line 204
    move/from16 p1, v12

    .line 205
    .line 206
    invoke-static {v9}, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt;->calculatePan(Landroidx/compose/ui/input/pointer/PointerEvent;)J

    .line 207
    .line 208
    .line 209
    move-result-wide v11

    .line 210
    if-nez v2, :cond_a

    .line 211
    .line 212
    mul-float/2addr v5, v10

    .line 213
    add-float v13, v13, p1

    .line 214
    .line 215
    invoke-static {v3, v4, v11, v12}, Landroidx/compose/ui/geometry/Offset;->plus-MK-Hz9U(JJ)J

    .line 216
    .line 217
    .line 218
    move-result-wide v3

    .line 219
    move/from16 v21, v0

    .line 220
    .line 221
    const/4 v0, 0x0

    .line 222
    invoke-static {v9, v0}, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt;->calculateCentroidSize(Landroidx/compose/ui/input/pointer/PointerEvent;Z)F

    .line 223
    .line 224
    .line 225
    move-result v22

    .line 226
    move/from16 v19, v2

    .line 227
    .line 228
    const/4 v0, 0x1

    .line 229
    int-to-float v2, v0

    .line 230
    sub-float/2addr v2, v5

    .line 231
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 232
    .line 233
    .line 234
    move-result v2

    .line 235
    mul-float v2, v2, v22

    .line 236
    .line 237
    const v23, 0x40490fdb    # (float)Math.PI

    .line 238
    .line 239
    .line 240
    mul-float v23, v23, v13

    .line 241
    .line 242
    mul-float v23, v23, v22

    .line 243
    .line 244
    const/high16 v22, 0x43340000    # 180.0f

    .line 245
    .line 246
    div-float v23, v23, v22

    .line 247
    .line 248
    invoke-static/range {v23 .. v23}, Ljava/lang/Math;->abs(F)F

    .line 249
    .line 250
    .line 251
    move-result v22

    .line 252
    invoke-static {v3, v4}, Landroidx/compose/ui/geometry/Offset;->getDistance-impl(J)F

    .line 253
    .line 254
    .line 255
    move-result v23

    .line 256
    cmpl-float v2, v2, v1

    .line 257
    .line 258
    if-gtz v2, :cond_8

    .line 259
    .line 260
    cmpl-float v2, v22, v1

    .line 261
    .line 262
    if-gtz v2, :cond_8

    .line 263
    .line 264
    cmpl-float v2, v23, v1

    .line 265
    .line 266
    if-lez v2, :cond_7

    .line 267
    .line 268
    goto :goto_5

    .line 269
    :cond_7
    move/from16 v2, v19

    .line 270
    .line 271
    goto :goto_7

    .line 272
    :cond_8
    :goto_5
    iget-boolean v2, v15, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->$panZoomLock:Z

    .line 273
    .line 274
    if-eqz v2, :cond_9

    .line 275
    .line 276
    cmpg-float v2, v22, v1

    .line 277
    .line 278
    if-gez v2, :cond_9

    .line 279
    .line 280
    move v2, v0

    .line 281
    goto :goto_6

    .line 282
    :cond_9
    const/4 v2, 0x0

    .line 283
    :goto_6
    move/from16 v21, v2

    .line 284
    .line 285
    move v2, v0

    .line 286
    goto :goto_7

    .line 287
    :cond_a
    move/from16 v21, v0

    .line 288
    .line 289
    move/from16 v19, v2

    .line 290
    .line 291
    const/4 v0, 0x1

    .line 292
    :goto_7
    if-eqz v2, :cond_12

    .line 293
    .line 294
    const/4 v0, 0x0

    .line 295
    invoke-static {v9, v0}, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt;->calculateCentroid(Landroidx/compose/ui/input/pointer/PointerEvent;Z)J

    .line 296
    .line 297
    .line 298
    move-result-wide v19

    .line 299
    if-eqz v21, :cond_b

    .line 300
    .line 301
    const/16 v18, 0x0

    .line 302
    .line 303
    goto :goto_8

    .line 304
    :cond_b
    move/from16 v18, p1

    .line 305
    .line 306
    :goto_8
    const/16 v23, 0x0

    .line 307
    .line 308
    cmpg-float v24, v18, v23

    .line 309
    .line 310
    if-nez v24, :cond_c

    .line 311
    .line 312
    const/16 v24, 0x1

    .line 313
    .line 314
    goto :goto_9

    .line 315
    :cond_c
    move/from16 v24, v0

    .line 316
    .line 317
    :goto_9
    if-eqz v24, :cond_f

    .line 318
    .line 319
    const/high16 v17, 0x3f800000    # 1.0f

    .line 320
    .line 321
    cmpg-float v24, v10, v17

    .line 322
    .line 323
    if-nez v24, :cond_d

    .line 324
    .line 325
    const/16 v24, 0x1

    .line 326
    .line 327
    goto :goto_a

    .line 328
    :cond_d
    move/from16 v24, v0

    .line 329
    .line 330
    :goto_a
    if-eqz v24, :cond_e

    .line 331
    .line 332
    sget-object v24, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 333
    .line 334
    move/from16 p1, v1

    .line 335
    .line 336
    invoke-virtual/range {v24 .. v24}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 337
    .line 338
    .line 339
    move-result-wide v0

    .line 340
    invoke-static {v11, v12, v0, v1}, Landroidx/compose/ui/geometry/Offset;->equals-impl0(JJ)Z

    .line 341
    .line 342
    .line 343
    move-result v0

    .line 344
    if-nez v0, :cond_10

    .line 345
    .line 346
    goto :goto_b

    .line 347
    :cond_e
    move/from16 p1, v1

    .line 348
    .line 349
    goto :goto_b

    .line 350
    :cond_f
    move/from16 p1, v1

    .line 351
    .line 352
    const/high16 v17, 0x3f800000    # 1.0f

    .line 353
    .line 354
    :goto_b
    iget-object v0, v15, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->$onGesture:Lkotlin/jvm/functions/Function4;

    .line 355
    .line 356
    invoke-static/range {v19 .. v20}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    invoke-static {v11, v12}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 361
    .line 362
    .line 363
    move-result-object v11

    .line 364
    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/Boxing;->boxFloat(F)Ljava/lang/Float;

    .line 365
    .line 366
    .line 367
    move-result-object v10

    .line 368
    invoke-static/range {v18 .. v18}, Lkotlin/coroutines/jvm/internal/Boxing;->boxFloat(F)Ljava/lang/Float;

    .line 369
    .line 370
    .line 371
    move-result-object v12

    .line 372
    invoke-interface {v0, v1, v11, v10, v12}, Lkotlin/jvm/functions/Function4;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    :cond_10
    invoke-virtual {v9}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 380
    .line 381
    .line 382
    move-result v1

    .line 383
    const/4 v10, 0x0

    .line 384
    :goto_c
    if-ge v10, v1, :cond_13

    .line 385
    .line 386
    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v11

    .line 390
    check-cast v11, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 391
    .line 392
    invoke-static {v11}, Landroidx/compose/ui/input/pointer/PointerEventKt;->positionChanged(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 393
    .line 394
    .line 395
    move-result v12

    .line 396
    if-eqz v12, :cond_11

    .line 397
    .line 398
    invoke-virtual {v11}, Landroidx/compose/ui/input/pointer/PointerInputChange;->consume()V

    .line 399
    .line 400
    .line 401
    :cond_11
    add-int/lit8 v10, v10, 0x1

    .line 402
    .line 403
    goto :goto_c

    .line 404
    :cond_12
    move/from16 p1, v1

    .line 405
    .line 406
    const/high16 v17, 0x3f800000    # 1.0f

    .line 407
    .line 408
    const/16 v23, 0x0

    .line 409
    .line 410
    :cond_13
    move/from16 v0, v21

    .line 411
    .line 412
    goto :goto_d

    .line 413
    :cond_14
    move/from16 v21, v0

    .line 414
    .line 415
    move/from16 p1, v1

    .line 416
    .line 417
    move/from16 v19, v2

    .line 418
    .line 419
    const/high16 v17, 0x3f800000    # 1.0f

    .line 420
    .line 421
    const/16 v23, 0x0

    .line 422
    .line 423
    :goto_d
    if-nez v8, :cond_18

    .line 424
    .line 425
    invoke-virtual {v9}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 426
    .line 427
    .line 428
    move-result-object v1

    .line 429
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 430
    .line 431
    .line 432
    move-result v8

    .line 433
    const/4 v9, 0x0

    .line 434
    :goto_e
    if-ge v9, v8, :cond_16

    .line 435
    .line 436
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v10

    .line 440
    check-cast v10, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 441
    .line 442
    invoke-virtual {v10}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    .line 443
    .line 444
    .line 445
    move-result v10

    .line 446
    if-eqz v10, :cond_15

    .line 447
    .line 448
    const/4 v1, 0x1

    .line 449
    goto :goto_f

    .line 450
    :cond_15
    add-int/lit8 v9, v9, 0x1

    .line 451
    .line 452
    goto :goto_e

    .line 453
    :cond_16
    const/4 v1, 0x0

    .line 454
    :goto_f
    if-nez v1, :cond_17

    .line 455
    .line 456
    goto :goto_10

    .line 457
    :cond_17
    move/from16 v1, p1

    .line 458
    .line 459
    move/from16 v8, v17

    .line 460
    .line 461
    move/from16 v10, v23

    .line 462
    .line 463
    const/4 v9, 0x2

    .line 464
    const/4 v11, 0x0

    .line 465
    const/4 v12, 0x1

    .line 466
    goto/16 :goto_1

    .line 467
    .line 468
    :cond_18
    :goto_10
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 469
    .line 470
    return-object v0
.end method
