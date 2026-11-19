.class public abstract Lp5/x1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lcom/zykj/blackboard/core/edit/IPageControl;Lx7/p;)V
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onChange"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lp5/x1$a;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lp5/x1$a;-><init>(Lx7/p;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p0, v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->addWithdrawListener(Lcom/zykj/blackboard/listener/WithdrawListener;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static final b(Lcom/zykj/blackboard/core/edit/IPageControl;Lx7/l;)V
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onEvent"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lp5/x1$b;

    .line 12
    .line 13
    invoke-direct {v0, p1, p0}, Lp5/x1$b;-><init>(Lx7/l;Lcom/zykj/blackboard/core/edit/IPageControl;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p0, v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->addEventListener(Lcom/zykj/blackboard/listener/EventListener;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static final c(Lcom/zykj/blackboard/core/edit/IPageControl;Lx7/a;Lx7/p;Lx7/a;)V
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onMoveStart"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onMoving"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "onMoveEnd"

    .line 17
    .line 18
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Lp5/x1$c;

    .line 22
    .line 23
    invoke-direct {v0, p2, p1, p3}, Lp5/x1$c;-><init>(Lx7/p;Lx7/a;Lx7/a;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p0, v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->setAreaMoveListener(Lcom/zykj/blackboard/listener/IAreaMoveListener;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public static final d(Lcom/zykj/blackboard/core/edit/IPageControl;Lx7/l;)V
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onMicroPhoneChange"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lp5/x1$d;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lp5/x1$d;-><init>(Lx7/l;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p0, v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->setMicroPhoneListener(Lcom/zykj/blackboard/listener/MicroPhoneListener;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static final e(Lcom/zykj/blackboard/core/edit/IPageControl;Lx7/a;Lx7/l;Lx7/a;)V
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onStart"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onProgress"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "onStop"

    .line 17
    .line 18
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Lp5/x1$e;

    .line 22
    .line 23
    invoke-direct {v0, p2, p1, p3}, Lp5/x1$e;-><init>(Lx7/l;Lx7/a;Lx7/a;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p0, v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->setRecordListener(Lcom/zykj/blackboard/listener/RecordListener;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public static final f(Lcom/zykj/blackboard/core/edit/IPageControl;Lx7/l;Lx7/l;)V
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onTextColorChange"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onTextSizeChange"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lp5/x1$f;

    .line 17
    .line 18
    invoke-direct {v0, p1, p2}, Lp5/x1$f;-><init>(Lx7/l;Lx7/l;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p0, v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->setTextSelectListener(Lcom/zykj/blackboard/listener/ITextSelectListener;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
