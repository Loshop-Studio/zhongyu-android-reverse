.class final Lcom/zykj/study/ui/home/find/MicroCodeFragment$initView$fragment$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/find/MicroCodeFragment;->initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lx7/p;"
    }
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.study.ui.home.find.MicroCodeFragment$initView$fragment$2"
    f = "MicroCodeFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/study/ui/home/find/MicroCodeFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/find/MicroCodeFragment;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$initView$fragment$2;->c:Lcom/zykj/study/ui/home/find/MicroCodeFragment;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/String;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$initView$fragment$2;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/study/ui/home/find/MicroCodeFragment$initView$fragment$2;

    .line 6
    .line 7
    sget-object p2, Lh7/p;->a:Lh7/p;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$initView$fragment$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$initView$fragment$2;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$initView$fragment$2;->c:Lcom/zykj/study/ui/home/find/MicroCodeFragment;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$initView$fragment$2;-><init>(Lcom/zykj/study/ui/home/find/MicroCodeFragment;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$initView$fragment$2;->b:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$initView$fragment$2;->c(Ljava/lang/String;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$initView$fragment$2;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$initView$fragment$2;->a:I

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    iget-object p1, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$initView$fragment$2;->c:Lcom/zykj/study/ui/home/find/MicroCodeFragment;

    .line 21
    .line 22
    invoke-static {p1, v0}, Lcom/zykj/study/ui/home/find/MicroCodeFragment;->p(Lcom/zykj/study/ui/home/find/MicroCodeFragment;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 31
    .line 32
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p1
.end method
