.class final Lcom/zykj/blackboard/core/action/TextAction$handleTextConfirm$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


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
        "Lkotlin/jvm/functions/Function1<",
        "Lq4/c;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lq4/c;",
        "it",
        "",
        "a",
        "(Lq4/c;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/blackboard/core/action/TextAction;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/action/TextAction;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextConfirm$1;->a:Lcom/zykj/blackboard/core/action/TextAction;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lq4/c;)V
    .locals 2

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextConfirm$1;->a:Lcom/zykj/blackboard/core/action/TextAction;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lk4/c;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextConfirm$1;->a:Lcom/zykj/blackboard/core/action/TextAction;

    .line 15
    .line 16
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lk4/c;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-interface {v1}, Lk4/c;->b()Ljava/lang/String;

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
    invoke-interface {v0, v1, p1}, Lk4/c;->y(Ljava/lang/String;Lq4/c;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextConfirm$1;->a:Lcom/zykj/blackboard/core/action/TextAction;

    .line 32
    .line 33
    check-cast p1, Lr4/d;

    .line 34
    .line 35
    invoke-static {v0, p1}, Lcom/zykj/blackboard/core/action/TextAction;->R(Lcom/zykj/blackboard/core/action/TextAction;Lr4/d;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextConfirm$1;->a:Lcom/zykj/blackboard/core/action/TextAction;

    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/TextAction;->X()Lr4/d;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-static {p1, v0}, Lcom/zykj/blackboard/core/action/TextAction;->P(Lcom/zykj/blackboard/core/action/TextAction;Lr4/d;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/TextAction$handleTextConfirm$1;->a:Lcom/zykj/blackboard/core/action/TextAction;

    .line 51
    .line 52
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->h()Lg4/b;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-eqz p1, :cond_2

    .line 57
    .line 58
    invoke-interface {p1}, Lg4/b;->l()V

    .line 59
    .line 60
    .line 61
    :cond_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq4/c;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/TextAction$handleTextConfirm$1;->a(Lq4/c;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 7
    .line 8
    return-object p1
.end method
