.class public final Lcom/zykj/view/board/board/PageControlExtKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001aA\u0010\u0008\u001a\u00020\u0002*\u00020\u00002\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a%\u0010\u000c\u001a\u00020\u0002*\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\u0004\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a9\u0010\u0012\u001a\u00020\u0002*\u00020\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00020\u0004\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a%\u0010\u0015\u001a\u00020\u0002*\u00020\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\u0004\u00a2\u0006\u0004\u0008\u0015\u0010\r\u001aG\u0010\u001a\u001a\u00020\u0002*\u00020\u00002\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00020\u00172\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001b\u001a%\u0010\u001e\u001a\u00020\u0002*\u00020\u00002\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00020\u0004\u00a2\u0006\u0004\u0008\u001e\u0010\r\u001a+\u0010 \u001a\u00020\u0002*\u00020\u00002\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\u0017\u00a2\u0006\u0004\u0008 \u0010!\u00a8\u0006\""
    }
    d2 = {
        "Lcom/zykj/blackboard/core/edit/IPageControl;",
        "Lkotlin/Function0;",
        "Ld6/s;",
        "onStart",
        "Lkotlin/Function1;",
        "",
        "onProgress",
        "onStop",
        "setRecordListener",
        "(Lcom/zykj/blackboard/core/edit/IPageControl;Lr6/a;Lr6/c;Lr6/a;)V",
        "",
        "onMicroPhoneChange",
        "setMicroPhoneListener",
        "(Lcom/zykj/blackboard/core/edit/IPageControl;Lr6/c;)V",
        "",
        "onTextColorChange",
        "",
        "onTextSizeChange",
        "setTextSelectListener",
        "(Lcom/zykj/blackboard/core/edit/IPageControl;Lr6/c;Lr6/c;)V",
        "onGeometryColorChange",
        "bindGeometryColorSelectListener",
        "onMoveStart",
        "Lkotlin/Function2;",
        "onMoving",
        "onMoveEnd",
        "setAreaMoveListener",
        "(Lcom/zykj/blackboard/core/edit/IPageControl;Lr6/a;Lr6/e;Lr6/a;)V",
        "Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;",
        "onEvent",
        "addTempEventListener",
        "onChange",
        "addRevokeListener",
        "(Lcom/zykj/blackboard/core/edit/IPageControl;Lr6/e;)V",
        "view_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final addRevokeListener(Lcom/zykj/blackboard/core/edit/IPageControl;Lr6/e;)V
    .locals 1
    .param p0    # Lcom/zykj/blackboard/core/edit/IPageControl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/blackboard/core/edit/IPageControl;",
            "Lr6/e;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onChange"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/zykj/view/board/board/PageControlExtKt$addRevokeListener$1;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lcom/zykj/view/board/board/PageControlExtKt$addRevokeListener$1;-><init>(Lr6/e;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p0, v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->addWithdrawListener(Lcom/zykj/blackboard/listener/WithdrawListener;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static final addTempEventListener(Lcom/zykj/blackboard/core/edit/IPageControl;Lr6/c;)V
    .locals 1
    .param p0    # Lcom/zykj/blackboard/core/edit/IPageControl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/blackboard/core/edit/IPageControl;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onEvent"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/zykj/view/board/board/PageControlExtKt$addTempEventListener$1;

    .line 12
    .line 13
    invoke-direct {v0, p1, p0}, Lcom/zykj/view/board/board/PageControlExtKt$addTempEventListener$1;-><init>(Lr6/c;Lcom/zykj/blackboard/core/edit/IPageControl;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p0, v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->addEventListener(Lcom/zykj/blackboard/listener/EventListener;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static final bindGeometryColorSelectListener(Lcom/zykj/blackboard/core/edit/IPageControl;Lr6/c;)V
    .locals 1
    .param p0    # Lcom/zykj/blackboard/core/edit/IPageControl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/blackboard/core/edit/IPageControl;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onGeometryColorChange"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/zykj/view/board/board/PageControlExtKt$bindGeometryColorSelectListener$1;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lcom/zykj/view/board/board/PageControlExtKt$bindGeometryColorSelectListener$1;-><init>(Lr6/c;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p0, v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->setGeometrySelectListener(Lcom/zykj/blackboard/listener/IGeometrySelectListener;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static final setAreaMoveListener(Lcom/zykj/blackboard/core/edit/IPageControl;Lr6/a;Lr6/e;Lr6/a;)V
    .locals 1
    .param p0    # Lcom/zykj/blackboard/core/edit/IPageControl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/blackboard/core/edit/IPageControl;",
            "Lr6/a;",
            "Lr6/e;",
            "Lr6/a;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onMoveStart"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onMoving"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "onMoveEnd"

    .line 17
    .line 18
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Lcom/zykj/view/board/board/PageControlExtKt$setAreaMoveListener$1;

    .line 22
    .line 23
    invoke-direct {v0, p2, p1, p3}, Lcom/zykj/view/board/board/PageControlExtKt$setAreaMoveListener$1;-><init>(Lr6/e;Lr6/a;Lr6/a;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p0, v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->setAreaMoveListener(Lcom/zykj/blackboard/listener/IAreaMoveListener;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public static final setMicroPhoneListener(Lcom/zykj/blackboard/core/edit/IPageControl;Lr6/c;)V
    .locals 1
    .param p0    # Lcom/zykj/blackboard/core/edit/IPageControl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/blackboard/core/edit/IPageControl;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onMicroPhoneChange"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/zykj/view/board/board/PageControlExtKt$setMicroPhoneListener$1;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lcom/zykj/view/board/board/PageControlExtKt$setMicroPhoneListener$1;-><init>(Lr6/c;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p0, v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->setMicroPhoneListener(Lcom/zykj/blackboard/listener/MicroPhoneListener;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static final setRecordListener(Lcom/zykj/blackboard/core/edit/IPageControl;Lr6/a;Lr6/c;Lr6/a;)V
    .locals 1
    .param p0    # Lcom/zykj/blackboard/core/edit/IPageControl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/blackboard/core/edit/IPageControl;",
            "Lr6/a;",
            "Lr6/c;",
            "Lr6/a;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onStart"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onProgress"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "onStop"

    .line 17
    .line 18
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Lcom/zykj/view/board/board/PageControlExtKt$setRecordListener$1;

    .line 22
    .line 23
    invoke-direct {v0, p2, p1, p3}, Lcom/zykj/view/board/board/PageControlExtKt$setRecordListener$1;-><init>(Lr6/c;Lr6/a;Lr6/a;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p0, v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->setRecordListener(Lcom/zykj/blackboard/listener/RecordListener;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public static final setTextSelectListener(Lcom/zykj/blackboard/core/edit/IPageControl;Lr6/c;Lr6/c;)V
    .locals 1
    .param p0    # Lcom/zykj/blackboard/core/edit/IPageControl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/blackboard/core/edit/IPageControl;",
            "Lr6/c;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onTextColorChange"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onTextSizeChange"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lcom/zykj/view/board/board/PageControlExtKt$setTextSelectListener$1;

    .line 17
    .line 18
    invoke-direct {v0, p1, p2}, Lcom/zykj/view/board/board/PageControlExtKt$setTextSelectListener$1;-><init>(Lr6/c;Lr6/c;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p0, v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->setTextSelectListener(Lcom/zykj/blackboard/listener/ITextSelectListener;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
