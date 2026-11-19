.class final Lcom/zykj/blackboard/core/action/GeometryAction$singleTouchUp$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/action/GeometryAction;->H(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
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
.field public final synthetic c:Lcom/zykj/blackboard/core/action/GeometryAction;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/action/GeometryAction;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/action/GeometryAction$singleTouchUp$1;->c:Lcom/zykj/blackboard/core/action/GeometryAction;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lba/c;)V
    .locals 2

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/GeometryAction$singleTouchUp$1;->c:Lcom/zykj/blackboard/core/action/GeometryAction;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/GeometryAction$singleTouchUp$1;->c:Lcom/zykj/blackboard/core/action/GeometryAction;

    .line 15
    .line 16
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-interface {v1}, Lv9/c;->b()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v1, 0x0

    .line 28
    :goto_0
    invoke-interface {v0, v1, p1}, Lv9/c;->f(Ljava/lang/String;Lba/c;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/GeometryAction$singleTouchUp$1;->c:Lcom/zykj/blackboard/core/action/GeometryAction;

    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->h()Lr9/b;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-interface {v0}, Lr9/b;->i()Lhd/l;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    invoke-interface {p1}, Lba/c;->getId()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-interface {v0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    :cond_2
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/GeometryAction$singleTouchUp$1;->c:Lcom/zykj/blackboard/core/action/GeometryAction;

    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->h()Lr9/b;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-eqz p1, :cond_3

    .line 59
    .line 60
    invoke-interface {p1}, Lr9/b;->l()V

    .line 61
    .line 62
    .line 63
    :cond_3
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lba/c;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/GeometryAction$singleTouchUp$1;->a(Lba/c;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 7
    .line 8
    return-object p1
.end method
