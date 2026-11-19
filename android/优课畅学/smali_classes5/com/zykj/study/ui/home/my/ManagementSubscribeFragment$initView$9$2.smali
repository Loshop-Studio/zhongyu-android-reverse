.class final Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$9$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
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
    c = "com.zykj.study.ui.home.my.ManagementSubscribeFragment$initView$9$2"
    f = "ManagementSubscribeFragment.kt"
    l = {
        0xf3
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;

.field public final synthetic c:Lcom/zykj/study/bean/OtherSubscribe;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Lcom/zykj/study/bean/OtherSubscribe;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$9$2;->b:Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$9$2;->c:Lcom/zykj/study/bean/OtherSubscribe;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$9$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$9$2;->b:Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$9$2;->c:Lcom/zykj/study/bean/OtherSubscribe;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$9$2;-><init>(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Lcom/zykj/study/bean/OtherSubscribe;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$9$2;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$9$2;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$9$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$9$2;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$9$2;->a:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$9$2;->b:Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->A()Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object v1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$9$2;->c:Lcom/zykj/study/bean/OtherSubscribe;

    .line 34
    .line 35
    invoke-virtual {v1}, Lcom/zykj/study/bean/OtherSubscribe;->getSuperviseId()J

    .line 36
    .line 37
    .line 38
    move-result-wide v3

    .line 39
    iput v2, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$9$2;->a:I

    .line 40
    .line 41
    invoke-virtual {p1, v3, v4, p0}, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;->g(JLm7/c;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-ne p1, v0, :cond_2

    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$9$2;->b:Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;

    .line 49
    .line 50
    invoke-static {p1}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->x(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;)Lcom/zykj/study/adapter/SubscribeTabListAdapter;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-nez p1, :cond_3

    .line 55
    .line 56
    const-string p1, "subscribeTabListAdapter"

    .line 57
    .line 58
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const/4 p1, 0x0

    .line 62
    :cond_3
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 63
    .line 64
    .line 65
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 66
    .line 67
    return-object p1
.end method
