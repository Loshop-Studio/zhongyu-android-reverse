.class final Lcom/zykj/blackboard/core/action/TextAction$handleTextConfirm$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/action/TextAction;->c0(ZLandroid/graphics/RectF;FFLjava/lang/String;)V
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
.field public final synthetic c:Lcom/zykj/blackboard/core/action/TextAction;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/action/TextAction;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextConfirm$1;->c:Lcom/zykj/blackboard/core/action/TextAction;

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
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextConfirm$1;->c:Lcom/zykj/blackboard/core/action/TextAction;

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
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextConfirm$1;->c:Lcom/zykj/blackboard/core/action/TextAction;

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
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextConfirm$1;->c:Lcom/zykj/blackboard/core/action/TextAction;

    .line 32
    .line 33
    check-cast p1, Lca/d;

    .line 34
    .line 35
    invoke-static {v0, p1}, Lcom/zykj/blackboard/core/action/TextAction;->R(Lcom/zykj/blackboard/core/action/TextAction;Lca/d;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextConfirm$1;->c:Lcom/zykj/blackboard/core/action/TextAction;

    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/TextAction;->X()Lca/d;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-static {p1, v0}, Lcom/zykj/blackboard/core/action/TextAction;->P(Lcom/zykj/blackboard/core/action/TextAction;Lca/d;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextConfirm$1;->c:Lcom/zykj/blackboard/core/action/TextAction;

    .line 51
    .line 52
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->h()Lr9/b;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-eqz p1, :cond_2

    .line 57
    .line 58
    invoke-interface {p1}, Lr9/b;->l()V

    .line 59
    .line 60
    .line 61
    :cond_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lba/c;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/TextAction$handleTextConfirm$1;->a(Lba/c;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 7
    .line 8
    return-object p1
.end method
