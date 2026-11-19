.class final Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$10;
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
    c = "com.zykj.study.ui.home.my.ManagementSubscribeFragment$initView$10"
    f = "ManagementSubscribeFragment.kt"
    l = {
        0xfd
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:I

.field public d:I

.field public e:I

.field public final synthetic f:Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;

.field public final synthetic g:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Ljava/util/ArrayList;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$10;->f:Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$10;->g:Ljava/util/ArrayList;

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
    new-instance p1, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$10;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$10;->f:Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$10;->g:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$10;-><init>(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Ljava/util/ArrayList;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$10;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$10;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$10;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$10;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$10;->e:I

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
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$10;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$10;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;

    .line 19
    .line 20
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$10;->f:Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;

    .line 36
    .line 37
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-eqz p1, :cond_5

    .line 42
    .line 43
    const-string v1, "courseId"

    .line 44
    .line 45
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    iget-object v1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$10;->f:Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;

    .line 50
    .line 51
    iget-object v3, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$10;->g:Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {v1}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->A()Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    int-to-long v5, p1

    .line 58
    iput-object v1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$10;->a:Ljava/lang/Object;

    .line 59
    .line 60
    iput-object v3, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$10;->b:Ljava/lang/Object;

    .line 61
    .line 62
    iput p1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$10;->c:I

    .line 63
    .line 64
    const/4 p1, 0x0

    .line 65
    iput p1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$10;->d:I

    .line 66
    .line 67
    iput v2, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$10;->e:I

    .line 68
    .line 69
    invoke-virtual {v4, v5, v6, p0}, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;->i(JLm7/c;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    if-ne p1, v0, :cond_2

    .line 74
    .line 75
    return-object v0

    .line 76
    :cond_2
    move-object v0, v3

    .line 77
    :goto_0
    check-cast p1, Ljava/util/List;

    .line 78
    .line 79
    if-eqz p1, :cond_5

    .line 80
    .line 81
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    if-eqz v3, :cond_3

    .line 90
    .line 91
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    check-cast v3, Lcom/zykj/study/bean/OtherSubscribe;

    .line 96
    .line 97
    invoke-virtual {v3}, Lcom/zykj/study/bean/OtherSubscribe;->getName()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    new-instance v5, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    const-string v4, "\u7684\u5b66\u5458 (\u6388\u6743)"

    .line 110
    .line 111
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    invoke-virtual {v3, v4}, Lcom/zykj/study/bean/OtherSubscribe;->setName(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 123
    .line 124
    .line 125
    invoke-static {v1}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->x(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;)Lcom/zykj/study/adapter/SubscribeTabListAdapter;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    if-nez p1, :cond_4

    .line 130
    .line 131
    const-string p1, "subscribeTabListAdapter"

    .line 132
    .line 133
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    const/4 p1, 0x0

    .line 137
    :cond_4
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 138
    .line 139
    .line 140
    :cond_5
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 141
    .line 142
    return-object p1
.end method
