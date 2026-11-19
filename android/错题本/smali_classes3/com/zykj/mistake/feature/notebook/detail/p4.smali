.class public final Lcom/zykj/mistake/feature/notebook/detail/p4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic a:Lr6/c;

.field public final synthetic b:Lcom/zykj/mistake/feature/notebook/detail/b5;

.field public final synthetic c:F

.field public final synthetic d:Ljava/util/List;

.field public final synthetic e:Lr6/c;

.field public final synthetic f:Landroidx/compose/runtime/MutableState;

.field public final synthetic g:Landroidx/compose/runtime/MutableState;

.field public final synthetic h:Landroidx/compose/runtime/MutableState;


# direct methods
.method public constructor <init>(Lr6/c;Lcom/zykj/mistake/feature/notebook/detail/b5;FLjava/util/List;Lr6/c;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/p4;->a:Lr6/c;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/p4;->b:Lcom/zykj/mistake/feature/notebook/detail/b5;

    .line 7
    .line 8
    iput p3, p0, Lcom/zykj/mistake/feature/notebook/detail/p4;->c:F

    .line 9
    .line 10
    iput-object p4, p0, Lcom/zykj/mistake/feature/notebook/detail/p4;->d:Ljava/util/List;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/zykj/mistake/feature/notebook/detail/p4;->e:Lr6/c;

    .line 13
    .line 14
    iput-object p6, p0, Lcom/zykj/mistake/feature/notebook/detail/p4;->f:Landroidx/compose/runtime/MutableState;

    .line 15
    .line 16
    iput-object p7, p0, Lcom/zykj/mistake/feature/notebook/detail/p4;->g:Landroidx/compose/runtime/MutableState;

    .line 17
    .line 18
    iput-object p8, p0, Lcom/zykj/mistake/feature/notebook/detail/p4;->h:Landroidx/compose/runtime/MutableState;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final invoke(Landroidx/compose/ui/input/pointer/PointerInputScope;Lh6/c;)Ljava/lang/Object;
    .locals 10

    .line 1
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;

    .line 2
    .line 3
    iget-object v8, p0, Lcom/zykj/mistake/feature/notebook/detail/p4;->h:Landroidx/compose/runtime/MutableState;

    .line 4
    .line 5
    const/4 v9, 0x0

    .line 6
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/p4;->a:Lr6/c;

    .line 7
    .line 8
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/p4;->b:Lcom/zykj/mistake/feature/notebook/detail/b5;

    .line 9
    .line 10
    iget v3, p0, Lcom/zykj/mistake/feature/notebook/detail/p4;->c:F

    .line 11
    .line 12
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/detail/p4;->d:Ljava/util/List;

    .line 13
    .line 14
    iget-object v5, p0, Lcom/zykj/mistake/feature/notebook/detail/p4;->e:Lr6/c;

    .line 15
    .line 16
    iget-object v6, p0, Lcom/zykj/mistake/feature/notebook/detail/p4;->f:Landroidx/compose/runtime/MutableState;

    .line 17
    .line 18
    iget-object v7, p0, Lcom/zykj/mistake/feature/notebook/detail/p4;->g:Landroidx/compose/runtime/MutableState;

    .line 19
    .line 20
    invoke-direct/range {v0 .. v9}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1;-><init>(Lr6/c;Lcom/zykj/mistake/feature/notebook/detail/b5;FLjava/util/List;Lr6/c;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lh6/c;)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1, v0, p2}, Landroidx/compose/foundation/gestures/ForEachGestureKt;->awaitEachGesture(Landroidx/compose/ui/input/pointer/PointerInputScope;Lr6/e;Lh6/c;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    sget-object p2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    if-ne p1, p2, :cond_0

    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_0
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 33
    .line 34
    return-object p1
.end method
