.class final Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter$dragAndDropModifierNode$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;-><init>(Lhd/p;Lhd/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/l;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter$dragAndDropModifierNode$1;->this$0:Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/graphics/drawscope/DrawScope;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter$dragAndDropModifierNode$1;->invoke(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V

    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V
    .locals 1

    .line 2
    iget-object v0, p0, Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter$dragAndDropModifierNode$1;->this$0:Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;

    invoke-static {v0}, Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;->access$getCacheDrawScopeDragShadowCallback$p(Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;)Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/compose/foundation/draganddrop/CacheDrawScopeDragShadowCallback;->drawDragShadow(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V

    return-void
.end method
