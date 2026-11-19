.class final Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;
.super Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;",
        "Lr6/e;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
        "Ld6/s;",
        "<anonymous>",
        "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1"
    f = "MistakeDetailNotePanel.kt"
    i = {
        0x0,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2
    }
    l = {
        0xcd,
        0xce,
        0xdf
    }
    m = "invokeSuspend"
    n = {
        "$this$awaitEachGesture",
        "$this$awaitEachGesture",
        "down",
        "$this$awaitEachGesture",
        "down",
        "up",
        "startIndex",
        "lastX",
        "completed"
    }
    s = {
        "L$0",
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$2",
        "I$0",
        "F$0",
        "I$1"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMistakeDetailNotePanel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeDetailNotePanel.kt\ncom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,380:1\n360#2,7:381\n295#2,2:391\n1563#2:399\n1634#2,3:400\n65#3:388\n65#3:393\n65#3:396\n60#4:389\n60#4:394\n60#4:397\n22#5:390\n22#5:395\n22#5:398\n*S KotlinDebug\n*F\n+ 1 MistakeDetailNotePanel.kt\ncom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1\n*L\n216#1:381,7\n224#1:391,2\n247#1:399\n247#1:400,3\n220#1:388\n229#1:393\n230#1:396\n220#1:389\n229#1:394\n230#1:397\n220#1:390\n229#1:395\n230#1:398\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $dragOffsetX$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $draggingKey$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $item:Lcom/zykj/mistake/feature/notebook/detail/b5;

.field final synthetic $itemStepPx:F

.field final synthetic $onImageClick:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation
.end field

.field final synthetic $onReorder:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation
.end field

.field final synthetic $orderedItems$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/zykj/mistake/feature/notebook/detail/b5;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $pictureNotes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field F$0:F

.field I$0:I

.field I$1:I

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lr6/c;Lcom/zykj/mistake/feature/notebook/detail/b5;FLjava/util/List;Lr6/c;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/c;",
            "Lcom/zykj/mistake/feature/notebook/detail/b5;",
            "F",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lr6/c;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/zykj/mistake/feature/notebook/detail/b5;",
            ">;>;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Float;",
            ">;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->$onImageClick:Lr6/c;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->$item:Lcom/zykj/mistake/feature/notebook/detail/b5;

    .line 4
    .line 5
    iput p3, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->$itemStepPx:F

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->$pictureNotes:Ljava/util/List;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->$onReorder:Lr6/c;

    .line 10
    .line 11
    iput-object p6, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->$draggingKey$delegate:Landroidx/compose/runtime/MutableState;

    .line 12
    .line 13
    iput-object p7, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->$orderedItems$delegate:Landroidx/compose/runtime/MutableState;

    .line 14
    .line 15
    iput-object p8, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->$dragOffsetX$delegate:Landroidx/compose/runtime/MutableState;

    .line 16
    .line 17
    const/4 p1, 0x2

    .line 18
    invoke-direct {p0, p1, p9}, Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;-><init>(ILh6/c;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lh6/c<",
            "*>;)",
            "Lh6/c<",
            "Ld6/s;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->$onImageClick:Lr6/c;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->$item:Lcom/zykj/mistake/feature/notebook/detail/b5;

    .line 6
    .line 7
    iget v3, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->$itemStepPx:F

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->$pictureNotes:Ljava/util/List;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->$onReorder:Lr6/c;

    .line 12
    .line 13
    iget-object v6, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->$draggingKey$delegate:Landroidx/compose/runtime/MutableState;

    .line 14
    .line 15
    iget-object v7, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->$orderedItems$delegate:Landroidx/compose/runtime/MutableState;

    .line 16
    .line 17
    iget-object v8, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->$dragOffsetX$delegate:Landroidx/compose/runtime/MutableState;

    .line 18
    .line 19
    move-object v9, p2

    .line 20
    invoke-direct/range {v0 .. v9}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;-><init>(Lr6/c;Lcom/zykj/mistake/feature/notebook/detail/b5;FLjava/util/List;Lr6/c;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lh6/c;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->L$0:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0
.end method

.method public final invoke(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "Lh6/c<",
            "-",
            "Ld6/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->invoke(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v3, p0

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 5
    .line 6
    .line 7
    move-result-object v7

    .line 8
    iget-object v0, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->L$0:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 11
    .line 12
    sget-object v8, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 13
    .line 14
    iget v1, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->label:I

    .line 15
    .line 16
    const/4 v9, 0x3

    .line 17
    const/4 v10, 0x2

    .line 18
    const/4 v12, 0x0

    .line 19
    sget-object v13, Ld6/s;->a:Ld6/s;

    .line 20
    .line 21
    const/4 v14, 0x1

    .line 22
    const/4 v15, 0x0

    .line 23
    if-eqz v1, :cond_3

    .line 24
    .line 25
    if-eq v1, v14, :cond_2

    .line 26
    .line 27
    if-eq v1, v10, :cond_1

    .line 28
    .line 29
    if-ne v1, v9, :cond_0

    .line 30
    .line 31
    iget v1, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->I$1:I

    .line 32
    .line 33
    iget v2, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->F$0:F

    .line 34
    .line 35
    iget v4, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->I$0:I

    .line 36
    .line 37
    iget-object v5, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->L$2:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v5, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 40
    .line 41
    iget-object v5, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->L$1:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v5, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 44
    .line 45
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    move/from16 v16, v6

    .line 49
    .line 50
    const/16 v17, 0x20

    .line 51
    .line 52
    move-object/from16 v6, p1

    .line 53
    .line 54
    goto/16 :goto_6

    .line 55
    .line 56
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v0

    .line 64
    :cond_1
    iget-object v1, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->L$1:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v1, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 67
    .line 68
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    move-object/from16 v2, p1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    move-object/from16 v1, p1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iput-object v0, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->L$0:Ljava/lang/Object;

    .line 84
    .line 85
    iput v14, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->label:I

    .line 86
    .line 87
    const/4 v1, 0x0

    .line 88
    const/4 v2, 0x0

    .line 89
    const/4 v4, 0x2

    .line 90
    const/4 v5, 0x0

    .line 91
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->awaitFirstDown$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLandroidx/compose/ui/input/pointer/PointerEventPass;Lh6/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    if-ne v1, v8, :cond_4

    .line 96
    .line 97
    goto/16 :goto_5

    .line 98
    .line 99
    :cond_4
    :goto_0
    check-cast v1, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 100
    .line 101
    invoke-interface {v0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getViewConfiguration()Landroidx/compose/ui/platform/ViewConfiguration;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-interface {v2}, Landroidx/compose/ui/platform/ViewConfiguration;->getLongPressTimeoutMillis()J

    .line 106
    .line 107
    .line 108
    move-result-wide v4

    .line 109
    new-instance v2, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1$up$1;

    .line 110
    .line 111
    invoke-direct {v2, v15}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1$up$1;-><init>(Lh6/c;)V

    .line 112
    .line 113
    .line 114
    iput-object v0, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->L$0:Ljava/lang/Object;

    .line 115
    .line 116
    iput-object v1, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->L$1:Ljava/lang/Object;

    .line 117
    .line 118
    iput v10, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->label:I

    .line 119
    .line 120
    invoke-interface {v0, v4, v5, v2, v3}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->withTimeoutOrNull(JLr6/e;Lh6/c;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    if-ne v2, v8, :cond_5

    .line 125
    .line 126
    goto/16 :goto_5

    .line 127
    .line 128
    :cond_5
    :goto_1
    check-cast v2, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 129
    .line 130
    if-eqz v2, :cond_6

    .line 131
    .line 132
    iget-object v0, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->$draggingKey$delegate:Landroidx/compose/runtime/MutableState;

    .line 133
    .line 134
    sget v1, Lcom/zykj/mistake/feature/notebook/detail/q4;->b:I

    .line 135
    .line 136
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    check-cast v0, Ljava/lang/String;

    .line 141
    .line 142
    if-nez v0, :cond_11

    .line 143
    .line 144
    iget-object v0, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->$onImageClick:Lr6/c;

    .line 145
    .line 146
    iget-object v1, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->$item:Lcom/zykj/mistake/feature/notebook/detail/b5;

    .line 147
    .line 148
    iget-object v1, v1, Lcom/zykj/mistake/feature/notebook/detail/b5;->b:Ljava/lang/String;

    .line 149
    .line 150
    invoke-interface {v0, v1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    return-object v13

    .line 154
    :cond_6
    iget-object v2, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->$orderedItems$delegate:Landroidx/compose/runtime/MutableState;

    .line 155
    .line 156
    sget v4, Lcom/zykj/mistake/feature/notebook/detail/q4;->b:I

    .line 157
    .line 158
    invoke-interface {v2}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    check-cast v2, Ljava/util/List;

    .line 163
    .line 164
    iget-object v4, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->$item:Lcom/zykj/mistake/feature/notebook/detail/b5;

    .line 165
    .line 166
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    move v5, v12

    .line 171
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v10

    .line 175
    move/from16 v16, v6

    .line 176
    .line 177
    const/4 v6, -0x1

    .line 178
    if-eqz v10, :cond_8

    .line 179
    .line 180
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v10

    .line 184
    check-cast v10, Lcom/zykj/mistake/feature/notebook/detail/b5;

    .line 185
    .line 186
    iget-object v10, v10, Lcom/zykj/mistake/feature/notebook/detail/b5;->a:Ljava/lang/String;

    .line 187
    .line 188
    const/16 v17, 0x20

    .line 189
    .line 190
    iget-object v11, v4, Lcom/zykj/mistake/feature/notebook/detail/b5;->a:Ljava/lang/String;

    .line 191
    .line 192
    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v10

    .line 196
    if-eqz v10, :cond_7

    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_7
    add-int/lit8 v5, v5, 0x1

    .line 200
    .line 201
    move/from16 v6, v16

    .line 202
    .line 203
    goto :goto_2

    .line 204
    :cond_8
    const/16 v17, 0x20

    .line 205
    .line 206
    move v5, v6

    .line 207
    :goto_3
    if-ne v5, v6, :cond_9

    .line 208
    .line 209
    goto/16 :goto_c

    .line 210
    .line 211
    :cond_9
    iget-object v2, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->$draggingKey$delegate:Landroidx/compose/runtime/MutableState;

    .line 212
    .line 213
    iget-object v4, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->$item:Lcom/zykj/mistake/feature/notebook/detail/b5;

    .line 214
    .line 215
    iget-object v4, v4, Lcom/zykj/mistake/feature/notebook/detail/b5;->a:Ljava/lang/String;

    .line 216
    .line 217
    invoke-interface {v2, v4}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    iget-object v2, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->$dragOffsetX$delegate:Landroidx/compose/runtime/MutableState;

    .line 221
    .line 222
    invoke-interface {v2, v7}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 226
    .line 227
    .line 228
    move-result-wide v10

    .line 229
    shr-long v10, v10, v17

    .line 230
    .line 231
    long-to-int v2, v10

    .line 232
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 233
    .line 234
    .line 235
    move-result v2

    .line 236
    move v4, v5

    .line 237
    move-object v5, v1

    .line 238
    move v1, v12

    .line 239
    :goto_4
    iput-object v0, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->L$0:Ljava/lang/Object;

    .line 240
    .line 241
    iput-object v5, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->L$1:Ljava/lang/Object;

    .line 242
    .line 243
    iput-object v15, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->L$2:Ljava/lang/Object;

    .line 244
    .line 245
    iput v4, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->I$0:I

    .line 246
    .line 247
    iput v2, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->F$0:F

    .line 248
    .line 249
    iput v1, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->I$1:I

    .line 250
    .line 251
    iput v9, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->label:I

    .line 252
    .line 253
    invoke-static {v0, v15, v3, v14, v15}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lh6/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v6

    .line 257
    if-ne v6, v8, :cond_a

    .line 258
    .line 259
    :goto_5
    return-object v8

    .line 260
    :cond_a
    :goto_6
    check-cast v6, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 261
    .line 262
    invoke-virtual {v6}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 263
    .line 264
    .line 265
    move-result-object v6

    .line 266
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 267
    .line 268
    .line 269
    move-result-object v6

    .line 270
    :goto_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 271
    .line 272
    .line 273
    move-result v10

    .line 274
    if-eqz v10, :cond_c

    .line 275
    .line 276
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v10

    .line 280
    move-object v11, v10

    .line 281
    check-cast v11, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 282
    .line 283
    move-object/from16 p1, v10

    .line 284
    .line 285
    invoke-virtual {v11}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 286
    .line 287
    .line 288
    move-result-wide v9

    .line 289
    invoke-virtual {v5}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 290
    .line 291
    .line 292
    move-result-wide v14

    .line 293
    invoke-static {v9, v10, v14, v15}, Landroidx/compose/ui/input/pointer/PointerId;->equals-impl0(JJ)Z

    .line 294
    .line 295
    .line 296
    move-result v9

    .line 297
    if-eqz v9, :cond_b

    .line 298
    .line 299
    move-object/from16 v10, p1

    .line 300
    .line 301
    goto :goto_8

    .line 302
    :cond_b
    const/4 v9, 0x3

    .line 303
    const/4 v14, 0x1

    .line 304
    const/4 v15, 0x0

    .line 305
    goto :goto_7

    .line 306
    :cond_c
    const/4 v10, 0x0

    .line 307
    :goto_8
    check-cast v10, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 308
    .line 309
    if-nez v10, :cond_d

    .line 310
    .line 311
    move v14, v1

    .line 312
    goto :goto_9

    .line 313
    :cond_d
    invoke-virtual {v10}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    .line 314
    .line 315
    .line 316
    move-result v6

    .line 317
    if-nez v6, :cond_12

    .line 318
    .line 319
    const/4 v14, 0x1

    .line 320
    :goto_9
    iget-object v0, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->$dragOffsetX$delegate:Landroidx/compose/runtime/MutableState;

    .line 321
    .line 322
    sget v1, Lcom/zykj/mistake/feature/notebook/detail/q4;->b:I

    .line 323
    .line 324
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    check-cast v0, Ljava/lang/Number;

    .line 329
    .line 330
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    iget v1, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->$itemStepPx:F

    .line 335
    .line 336
    div-float/2addr v0, v1

    .line 337
    invoke-static {v0}, Lt6/a;->q(F)I

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    add-int/2addr v0, v4

    .line 342
    iget-object v1, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->$orderedItems$delegate:Landroidx/compose/runtime/MutableState;

    .line 343
    .line 344
    invoke-interface {v1}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    check-cast v1, Ljava/util/List;

    .line 349
    .line 350
    invoke-static {v1}, Lkotlin/collections/u;->u(Ljava/util/List;)I

    .line 351
    .line 352
    .line 353
    move-result v1

    .line 354
    invoke-static {v0, v12, v1}, Lkotlin/collections/u;->m(III)I

    .line 355
    .line 356
    .line 357
    move-result v0

    .line 358
    if-ne v0, v4, :cond_e

    .line 359
    .line 360
    iget-object v0, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->$orderedItems$delegate:Landroidx/compose/runtime/MutableState;

    .line 361
    .line 362
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    check-cast v0, Ljava/util/List;

    .line 367
    .line 368
    goto :goto_a

    .line 369
    :cond_e
    iget-object v1, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->$orderedItems$delegate:Landroidx/compose/runtime/MutableState;

    .line 370
    .line 371
    invoke-interface {v1}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v1

    .line 375
    check-cast v1, Ljava/util/List;

    .line 376
    .line 377
    invoke-static {v1}, Lkotlin/collections/t;->E0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    invoke-virtual {v1, v0, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    move-object v0, v1

    .line 389
    :goto_a
    iget-object v1, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->$draggingKey$delegate:Landroidx/compose/runtime/MutableState;

    .line 390
    .line 391
    const/4 v6, 0x0

    .line 392
    invoke-interface {v1, v6}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 393
    .line 394
    .line 395
    iget-object v1, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->$dragOffsetX$delegate:Landroidx/compose/runtime/MutableState;

    .line 396
    .line 397
    invoke-interface {v1, v7}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 398
    .line 399
    .line 400
    new-instance v1, Ljava/util/ArrayList;

    .line 401
    .line 402
    const/16 v2, 0xa

    .line 403
    .line 404
    invoke-static {v0, v2}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 405
    .line 406
    .line 407
    move-result v2

    .line 408
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 409
    .line 410
    .line 411
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 412
    .line 413
    .line 414
    move-result-object v2

    .line 415
    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 416
    .line 417
    .line 418
    move-result v4

    .line 419
    if-eqz v4, :cond_f

    .line 420
    .line 421
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v4

    .line 425
    check-cast v4, Lcom/zykj/mistake/feature/notebook/detail/b5;

    .line 426
    .line 427
    iget-object v4, v4, Lcom/zykj/mistake/feature/notebook/detail/b5;->b:Ljava/lang/String;

    .line 428
    .line 429
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    goto :goto_b

    .line 433
    :cond_f
    if-eqz v14, :cond_10

    .line 434
    .line 435
    iget-object v2, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->$pictureNotes:Ljava/util/List;

    .line 436
    .line 437
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    move-result v2

    .line 441
    if-nez v2, :cond_10

    .line 442
    .line 443
    iget-object v2, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->$orderedItems$delegate:Landroidx/compose/runtime/MutableState;

    .line 444
    .line 445
    invoke-interface {v2, v0}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 446
    .line 447
    .line 448
    iget-object v0, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->$onReorder:Lr6/c;

    .line 449
    .line 450
    invoke-interface {v0, v1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    return-object v13

    .line 454
    :cond_10
    if-nez v14, :cond_11

    .line 455
    .line 456
    iget-object v0, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->$orderedItems$delegate:Landroidx/compose/runtime/MutableState;

    .line 457
    .line 458
    iget-object v1, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->$pictureNotes:Ljava/util/List;

    .line 459
    .line 460
    invoke-static {v1}, Lcom/zykj/mistake/feature/notebook/detail/q4;->i(Ljava/util/List;)Ljava/util/ArrayList;

    .line 461
    .line 462
    .line 463
    move-result-object v1

    .line 464
    invoke-interface {v0, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 465
    .line 466
    .line 467
    :cond_11
    :goto_c
    return-object v13

    .line 468
    :cond_12
    const/4 v6, 0x0

    .line 469
    invoke-virtual {v10}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 470
    .line 471
    .line 472
    move-result-wide v14

    .line 473
    shr-long v14, v14, v17

    .line 474
    .line 475
    long-to-int v9, v14

    .line 476
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 477
    .line 478
    .line 479
    move-result v9

    .line 480
    sub-float/2addr v9, v2

    .line 481
    invoke-virtual {v10}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 482
    .line 483
    .line 484
    move-result-wide v14

    .line 485
    shr-long v14, v14, v17

    .line 486
    .line 487
    long-to-int v2, v14

    .line 488
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 489
    .line 490
    .line 491
    move-result v2

    .line 492
    cmpg-float v14, v9, v16

    .line 493
    .line 494
    if-nez v14, :cond_13

    .line 495
    .line 496
    goto :goto_d

    .line 497
    :cond_13
    invoke-virtual {v10}, Landroidx/compose/ui/input/pointer/PointerInputChange;->consume()V

    .line 498
    .line 499
    .line 500
    iget-object v10, v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;->$dragOffsetX$delegate:Landroidx/compose/runtime/MutableState;

    .line 501
    .line 502
    sget v14, Lcom/zykj/mistake/feature/notebook/detail/q4;->b:I

    .line 503
    .line 504
    invoke-interface {v10}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v14

    .line 508
    check-cast v14, Ljava/lang/Number;

    .line 509
    .line 510
    invoke-virtual {v14}, Ljava/lang/Number;->floatValue()F

    .line 511
    .line 512
    .line 513
    move-result v14

    .line 514
    add-float/2addr v14, v9

    .line 515
    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 516
    .line 517
    .line 518
    move-result-object v9

    .line 519
    invoke-interface {v10, v9}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 520
    .line 521
    .line 522
    :goto_d
    move-object v15, v6

    .line 523
    const/4 v9, 0x3

    .line 524
    const/4 v14, 0x1

    .line 525
    goto/16 :goto_4
.end method
