.class final Lcom/zykj/study/ui/MainFragment$initView$2$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/MainFragment$initView$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.zykj.study.ui.MainFragment$initView$2$1$1"
    f = "MainFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Li8/b0;

.field public final synthetic d:Lcom/zykj/study/ui/MainFragment;


# direct methods
.method public constructor <init>(Li8/b0;Lcom/zykj/study/ui/MainFragment;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/MainFragment$initView$2$1$1;->c:Li8/b0;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/ui/MainFragment$initView$2$1$1;->d:Lcom/zykj/study/ui/MainFragment;

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
.method public final c(Lcom/zykj/lib/login/proto/UserBean;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/MainFragment$initView$2$1$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/study/ui/MainFragment$initView$2$1$1;

    .line 6
    .line 7
    sget-object p2, Lh7/p;->a:Lh7/p;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/MainFragment$initView$2$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/study/ui/MainFragment$initView$2$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/study/ui/MainFragment$initView$2$1$1;->c:Li8/b0;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/study/ui/MainFragment$initView$2$1$1;->d:Lcom/zykj/study/ui/MainFragment;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lcom/zykj/study/ui/MainFragment$initView$2$1$1;-><init>(Li8/b0;Lcom/zykj/study/ui/MainFragment;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lcom/zykj/study/ui/MainFragment$initView$2$1$1;->b:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/zykj/lib/login/proto/UserBean;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/MainFragment$initView$2$1$1;->c(Lcom/zykj/lib/login/proto/UserBean;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    const-string v0, "getId(...)"

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/study/ui/MainFragment$initView$2$1$1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lcom/zykj/lib/login/proto/UserBean;

    .line 6
    .line 7
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    iget v2, p0, Lcom/zykj/study/ui/MainFragment$initView$2$1$1;->a:I

    .line 11
    .line 12
    if-nez v2, :cond_2

    .line 13
    .line 14
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lcom/zykj/study/ui/MainFragment$initView$2$1$1;->d:Lcom/zykj/study/ui/MainFragment;

    .line 18
    .line 19
    :try_start_0
    sget-object v2, Lkotlin/Result;->b:Lkotlin/Result$a;

    .line 20
    .line 21
    invoke-virtual {v1}, Lcom/zykj/lib/login/proto/UserBean;->getId()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {v2, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    invoke-static {p1}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    sget v0, Lcom/zykj/lib/login/R$id;->nav_login:I

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Landroidx/navigation/NavController;->navigate(I)V

    .line 41
    .line 42
    .line 43
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    goto :goto_1

    .line 48
    :cond_0
    invoke-static {p1}, Lcom/zykj/study/ui/MainFragment;->h(Lcom/zykj/study/ui/MainFragment;)Lcom/zykj/study/viewmodels/MainViewModel;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v2}, Lcom/zykj/study/viewmodels/MainViewModel;->c()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Lcom/zykj/lib/login/proto/UserBean;->getRole()Lcom/zykj/lib/login/proto/RoleType;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    sget-object v3, Lcom/zykj/lib/login/proto/RoleType;->Student:Lcom/zykj/lib/login/proto/RoleType;

    .line 60
    .line 61
    if-ne v2, v3, :cond_1

    .line 62
    .line 63
    invoke-virtual {v1}, Lcom/zykj/lib/login/proto/UserBean;->getId()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-static {v2, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 71
    .line 72
    .line 73
    move-result-wide v2

    .line 74
    invoke-static {v2, v3}, Le5/n;->b(J)V

    .line 75
    .line 76
    .line 77
    :cond_1
    invoke-virtual {v1}, Lcom/zykj/lib/login/proto/UserBean;->getUserName()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-static {v0}, Lcom/tencent/bugly/crashreport/CrashReport;->setUserId(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    sget-object v0, Lcom/zykj/study/ui/c;->a:Lcom/zykj/study/ui/c$a;

    .line 85
    .line 86
    invoke-virtual {v0}, Lcom/zykj/study/ui/c$a;->a()Landroidx/navigation/NavDirections;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-static {p1}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {p1, v0}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 95
    .line 96
    .line 97
    move-object p1, v0

    .line 98
    :goto_0
    invoke-static {p1}, Lkotlin/Result;->b(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    .line 100
    .line 101
    goto :goto_2

    .line 102
    :goto_1
    sget-object v0, Lkotlin/Result;->b:Lkotlin/Result$a;

    .line 103
    .line 104
    invoke-static {p1}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-static {p1}, Lkotlin/Result;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    :goto_2
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 112
    .line 113
    return-object p1

    .line 114
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 115
    .line 116
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 117
    .line 118
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw p1
.end method
