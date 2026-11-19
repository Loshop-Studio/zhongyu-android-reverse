.class final Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel$getSubscribeTab$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;->i(JLm7/c;)Ljava/lang/Object;
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
    c = "com.zykj.study.viewmodels.ManagementSubscribeViewModel$getSubscribeTab$2"
    f = "ManagementSubscribeViewModel.kt"
    l = {
        0x1c
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;

.field public final synthetic c:J


# direct methods
.method public constructor <init>(Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;JLm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel$getSubscribeTab$2;->b:Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;

    .line 2
    .line 3
    iput-wide p2, p0, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel$getSubscribeTab$2;->c:J

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 3

    .line 1
    new-instance p1, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel$getSubscribeTab$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel$getSubscribeTab$2;->b:Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;

    .line 4
    .line 5
    iget-wide v1, p0, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel$getSubscribeTab$2;->c:J

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel$getSubscribeTab$2;-><init>(Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;JLm7/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel$getSubscribeTab$2;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel$getSubscribeTab$2;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel$getSubscribeTab$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel$getSubscribeTab$2;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel$getSubscribeTab$2;->a:I

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
    return-object p1

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
    iget-object p1, p0, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel$getSubscribeTab$2;->b:Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;->a(Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;)Lcom/zykj/study/repository/SubscribeRepository;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-wide v3, p0, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel$getSubscribeTab$2;->c:J

    .line 34
    .line 35
    iput v2, p0, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel$getSubscribeTab$2;->a:I

    .line 36
    .line 37
    invoke-virtual {p1, v3, v4, p0}, Lcom/zykj/study/repository/SubscribeRepository;->j(JLm7/c;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-ne p1, v0, :cond_2

    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_2
    return-object p1
.end method
