.class final Lcom/friday/paint/view/StudentPaintFragment$initData$9$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/view/StudentPaintFragment$initData$9;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.paint.view.StudentPaintFragment$initData$9$1"
    f = "StudentPaintFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lcom/friday/paint/view/StudentPaintFragment;


# direct methods
.method public constructor <init>(Lcom/friday/paint/view/StudentPaintFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/view/StudentPaintFragment$initData$9$1;->e:Lcom/friday/paint/view/StudentPaintFragment;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2

    .line 1
    new-instance v0, Lcom/friday/paint/view/StudentPaintFragment$initData$9$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/paint/view/StudentPaintFragment$initData$9$1;->e:Lcom/friday/paint/view/StudentPaintFragment;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/friday/paint/view/StudentPaintFragment$initData$9$1;-><init>(Lcom/friday/paint/view/StudentPaintFragment;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/friday/paint/view/StudentPaintFragment$initData$9$1;->d:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final g(Lcom/friday/common/classtest/MqttResponse;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/StudentPaintFragment$initData$9$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/friday/paint/view/StudentPaintFragment$initData$9$1;

    .line 6
    .line 7
    sget-object p2, Lqc/q;->a:Lqc/q;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/friday/paint/view/StudentPaintFragment$initData$9$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/friday/common/classtest/MqttResponse;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/StudentPaintFragment$initData$9$1;->g(Lcom/friday/common/classtest/MqttResponse;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/friday/paint/view/StudentPaintFragment$initData$9$1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/friday/common/classtest/MqttResponse;

    .line 4
    .line 5
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/friday/paint/view/StudentPaintFragment$initData$9$1;->c:I

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Lcom/friday/paint/view/StudentPaintFragment$initData$9$1;->e:Lcom/friday/paint/view/StudentPaintFragment;

    .line 18
    .line 19
    invoke-static {p1, v0}, Lcom/friday/paint/view/StudentPaintFragment;->v1(Lcom/friday/paint/view/StudentPaintFragment;Lcom/friday/common/classtest/MqttResponse;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1
.end method
