.class public interface abstract Landroidx/compose/ui/draganddrop/DragAndDropManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008`\u0018\u00002\u00020\u0001J\"\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH&\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH&\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u000e8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016\u00f8\u0001\u0001\u0082\u0002\r\n\u0005\u0008\u00a1\u001e0\u0001\n\u0004\u0008!0\u0001\u00a8\u0006\u0017\u00c0\u0006\u0001"
    }
    d2 = {
        "Landroidx/compose/ui/draganddrop/DragAndDropManager;",
        "",
        "Landroidx/compose/ui/draganddrop/DragAndDropNode;",
        "node",
        "Landroidx/compose/ui/geometry/Offset;",
        "offset",
        "Ld6/s;",
        "requestDragAndDropTransfer-Uv8p0NA",
        "(Landroidx/compose/ui/draganddrop/DragAndDropNode;J)V",
        "requestDragAndDropTransfer",
        "Landroidx/compose/ui/draganddrop/DragAndDropTarget;",
        "target",
        "registerTargetInterest",
        "(Landroidx/compose/ui/draganddrop/DragAndDropTarget;)V",
        "",
        "isInterestedTarget",
        "(Landroidx/compose/ui/draganddrop/DragAndDropTarget;)Z",
        "Landroidx/compose/ui/Modifier;",
        "getModifier",
        "()Landroidx/compose/ui/Modifier;",
        "modifier",
        "isRequestDragAndDropTransferRequired",
        "()Z",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract getModifier()Landroidx/compose/ui/Modifier;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract isInterestedTarget(Landroidx/compose/ui/draganddrop/DragAndDropTarget;)Z
    .param p1    # Landroidx/compose/ui/draganddrop/DragAndDropTarget;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract isRequestDragAndDropTransferRequired()Z
.end method

.method public abstract registerTargetInterest(Landroidx/compose/ui/draganddrop/DragAndDropTarget;)V
    .param p1    # Landroidx/compose/ui/draganddrop/DragAndDropTarget;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract requestDragAndDropTransfer-Uv8p0NA(Landroidx/compose/ui/draganddrop/DragAndDropNode;J)V
    .param p1    # Landroidx/compose/ui/draganddrop/DragAndDropNode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
