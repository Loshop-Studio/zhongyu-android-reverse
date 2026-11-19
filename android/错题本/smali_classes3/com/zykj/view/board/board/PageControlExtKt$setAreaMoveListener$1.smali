.class public final Lcom/zykj/view/board/board/PageControlExtKt$setAreaMoveListener$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/listener/IAreaMoveListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/board/PageControlExtKt;->setAreaMoveListener(Lcom/zykj/blackboard/core/edit/IPageControl;Lr6/a;Lr6/e;Lr6/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\n\u0010\tR\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0006R\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u000c\u001a\u0004\u0008\u0011\u0010\u000e\"\u0004\u0008\u0012\u0010\u0006\u00a8\u0006\u0013"
    }
    d2 = {
        "com/zykj/view/board/board/PageControlExtKt$setAreaMoveListener$1",
        "Lcom/zykj/blackboard/listener/IAreaMoveListener;",
        "",
        "progress",
        "Ld6/s;",
        "onVerticalMove",
        "(F)V",
        "onHorizontalMove",
        "onMoveStart",
        "()V",
        "onMoveEnd",
        "lastVerticalProgress",
        "F",
        "getLastVerticalProgress",
        "()F",
        "setLastVerticalProgress",
        "lastHorizontalProgress",
        "getLastHorizontalProgress",
        "setLastHorizontalProgress",
        "view_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $onMoveEnd:Lr6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/a;"
        }
    .end annotation
.end field

.field final synthetic $onMoveStart:Lr6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/a;"
        }
    .end annotation
.end field

.field final synthetic $onMoving:Lr6/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/e;"
        }
    .end annotation
.end field

.field private lastHorizontalProgress:F

.field private lastVerticalProgress:F


# direct methods
.method public constructor <init>(Lr6/e;Lr6/a;Lr6/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/e;",
            "Lr6/a;",
            "Lr6/a;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/board/PageControlExtKt$setAreaMoveListener$1;->$onMoving:Lr6/e;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/view/board/board/PageControlExtKt$setAreaMoveListener$1;->$onMoveStart:Lr6/a;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/view/board/board/PageControlExtKt$setAreaMoveListener$1;->$onMoveEnd:Lr6/a;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final getLastHorizontalProgress()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/board/PageControlExtKt$setAreaMoveListener$1;->lastHorizontalProgress:F

    .line 2
    .line 3
    return v0
.end method

.method public final getLastVerticalProgress()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/board/PageControlExtKt$setAreaMoveListener$1;->lastVerticalProgress:F

    .line 2
    .line 3
    return v0
.end method

.method public onHorizontalMove(F)V
    .locals 2

    .line 1
    iput p1, p0, Lcom/zykj/view/board/board/PageControlExtKt$setAreaMoveListener$1;->lastHorizontalProgress:F

    .line 2
    .line 3
    iget-object p1, p0, Lcom/zykj/view/board/board/PageControlExtKt$setAreaMoveListener$1;->$onMoving:Lr6/e;

    .line 4
    .line 5
    iget v0, p0, Lcom/zykj/view/board/board/PageControlExtKt$setAreaMoveListener$1;->lastVerticalProgress:F

    .line 6
    .line 7
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v1, p0, Lcom/zykj/view/board/board/PageControlExtKt$setAreaMoveListener$1;->lastHorizontalProgress:F

    .line 12
    .line 13
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {p1, v0, v1}, Lr6/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public onMoveEnd()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/PageControlExtKt$setAreaMoveListener$1;->$onMoveEnd:Lr6/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onMoveStart()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/PageControlExtKt$setAreaMoveListener$1;->$onMoveStart:Lr6/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onVerticalMove(F)V
    .locals 2

    .line 1
    iput p1, p0, Lcom/zykj/view/board/board/PageControlExtKt$setAreaMoveListener$1;->lastVerticalProgress:F

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/view/board/board/PageControlExtKt$setAreaMoveListener$1;->$onMoving:Lr6/e;

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget v1, p0, Lcom/zykj/view/board/board/PageControlExtKt$setAreaMoveListener$1;->lastHorizontalProgress:F

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v0, p1, v1}, Lr6/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final setLastHorizontalProgress(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/view/board/board/PageControlExtKt$setAreaMoveListener$1;->lastHorizontalProgress:F

    .line 2
    .line 3
    return-void
.end method

.method public final setLastVerticalProgress(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/view/board/board/PageControlExtKt$setAreaMoveListener$1;->lastVerticalProgress:F

    .line 2
    .line 3
    return-void
.end method
