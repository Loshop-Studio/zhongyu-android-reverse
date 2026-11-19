.class final Landroidx/compose/foundation/text/selection/SelectionGesturesKt$updateSelectionTouchMode$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text/selection/SelectionGesturesKt;->updateSelectionTouchMode(Landroidx/compose/ui/Modifier;Lhd/l;)Landroidx/compose/ui/Modifier;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $updateTouchMode:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhd/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$updateSelectionTouchMode$1;->$updateTouchMode:Lhd/l;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Landroidx/compose/ui/input/pointer/PointerInputScope;Lvc/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/PointerInputScope;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$updateSelectionTouchMode$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$updateSelectionTouchMode$1;->$updateTouchMode:Lhd/l;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$updateSelectionTouchMode$1$1;-><init>(Lhd/l;Lvc/c;)V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1, v0, p2}, Landroidx/compose/ui/input/pointer/PointerInputScope;->awaitPointerEventScope(Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    if-ne p1, p2, :cond_0

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 21
    .line 22
    return-object p1
.end method
