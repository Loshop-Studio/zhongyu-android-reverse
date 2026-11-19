.class public abstract Lcom/zykj/sketch/core/action/BaseAction;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/sketch/core/listener/IAction;


# instance fields
.field private actionControl:Lcom/zykj/sketch/core/listener/IControl;

.field private list:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;",
            ">;"
        }
    .end annotation
.end field

.field private record:Z

.field private startTime:J


# direct methods
.method public constructor <init>(Lcom/zykj/sketch/core/listener/IControl;)V
    .locals 1

    .line 1
    const-string v0, "actionControl"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/sketch/core/action/BaseAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 10
    .line 11
    new-instance p1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/zykj/sketch/core/action/BaseAction;->list:Ljava/util/List;

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic isTouchEnable$default(Lcom/zykj/sketch/core/action/BaseAction;Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;ZILjava/lang/Object;)Z
    .locals 0

    .line 1
    if-nez p4, :cond_1

    .line 2
    .line 3
    and-int/lit8 p3, p3, 0x2

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    const/4 p2, 0x1

    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/core/action/BaseAction;->isTouchEnable(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;Z)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    const-string p1, "Super calls with default arguments not supported in this target, function: isTouchEnable"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method


# virtual methods
.method public getTouchEventList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/action/BaseAction;->list:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getTouchStartTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/sketch/core/action/BaseAction;->startTime:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public isRecord()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/sketch/core/action/BaseAction;->record:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isTouchEnable(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;Z)Z
    .locals 4

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/sketch/core/action/BaseAction;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 7
    .line 8
    invoke-interface {v0}, Lcom/zykj/sketch/core/listener/IControl;->getSketchConfig()Lcom/zykj/sketch/core/config/SketchConfig;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lcom/zykj/sketch/core/config/SketchConfig;->isTouchable()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x1

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getPointerPropertiesList()Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v3, "event.pointerPropertiesList"

    .line 25
    .line 26
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    check-cast v0, Ljava/lang/Iterable;

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties;

    .line 46
    .line 47
    invoke-virtual {v3}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties;->getToolType()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-ne v3, v2, :cond_0

    .line 52
    .line 53
    return v1

    .line 54
    :cond_1
    if-eqz p2, :cond_3

    .line 55
    .line 56
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getPointerPropertiesList()Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties;

    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties;->getId()I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-nez p1, :cond_2

    .line 71
    .line 72
    return v2

    .line 73
    :cond_2
    return v1

    .line 74
    :cond_3
    return v2
.end method

.method public onTouchDown(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V
    .locals 2

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getEventTime()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    iput-wide v0, p0, Lcom/zykj/sketch/core/action/BaseAction;->startTime:J

    .line 11
    .line 12
    iget-object v0, p0, Lcom/zykj/sketch/core/action/BaseAction;->list:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public onTouchMove(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/sketch/core/action/BaseAction;->list:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onTouchPointerDown(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/sketch/core/action/BaseAction;->list:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onTouchPointerUp(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/sketch/core/action/BaseAction;->list:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onTouchUp(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/sketch/core/action/BaseAction;->list:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setRecord(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/sketch/core/action/BaseAction;->record:Z

    .line 2
    .line 3
    return-void
.end method
