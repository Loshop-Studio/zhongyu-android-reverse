# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class final Lcom/zykj/study/ui/home/my/StudentViewContentFragment$initData$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/my/StudentViewContentFragment;->initData(Lm7/c;)Ljava/lang/Object;
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
    c = "com.zykj.study.ui.home.my.StudentViewContentFragment$initData$2"
    f = "StudentViewContentFragment.kt"
    l = {
        0x24
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/study/ui/home/my/StudentViewContentFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/my/StudentViewContentFragment;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$initData$2;->b:Lcom/zykj/study/ui/home/my/StudentViewContentFragment;

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

.method public static synthetic c(Lcom/zykj/study/ui/home/my/StudentViewContentFragment;Lcom/zykj/study/bean/course/CatalogBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$initData$2;->d(Lcom/zykj/study/ui/home/my/StudentViewContentFragment;Lcom/zykj/study/bean/course/CatalogBean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lcom/zykj/study/ui/home/my/StudentViewContentFragment;Lcom/zykj/study/bean/course/CatalogBean;)Lh7/p;
    .locals 9

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/my/StudentViewContentFragment;->k(Lcom/zykj/study/ui/home/my/StudentViewContentFragment;)Lcom/zykj/study/viewmodels/StudentViewViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/StudentViewViewModel;->h()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Integer;

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-static {p0}, Lcom/zykj/study/ui/home/my/StudentViewContentFragment;->k(Lcom/zykj/study/ui/home/my/StudentViewContentFragment;)Lcom/zykj/study/viewmodels/StudentViewViewModel;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/StudentViewViewModel;->d()Landroidx/lifecycle/MutableLiveData;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/zykj/study/bean/teach/SuperviseGroupSelectBean;->getSuperviseGroupMember()Lcom/zykj/study/bean/teach/SuperviseGroupMember;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->getUserId()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    if-nez v5, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    sget-object v1, Lcom/zykj/study/ui/home/my/o;->a:Lcom/zykj/study/ui/home/my/o$c;

    .line 51
    .line 52
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CatalogBean;->getTitle()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CatalogBean;->getId()I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    const/16 v7, 0x10

    .line 61
    .line 62
    const/4 v8, 0x0

    .line 63
    const/4 v6, 0x0

    .line 64
    invoke-static/range {v1 .. v8}, Lcom/zykj/study/ui/home/my/o$c;->c(Lcom/zykj/study/ui/home/my/o$c;ILjava/lang/String;ILjava/lang/String;ZILjava/lang/Object;)Landroidx/navigation/NavDirections;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-virtual {p0, p1}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 73
    .line 74
    .line 75
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 76
    .line 77
    return-object p0

    .line 78
    :cond_1
    :goto_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 79
    .line 80
    return-object p0

    .line 81
    :cond_2
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 82
    .line 83
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$initData$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$initData$2;->b:Lcom/zykj/study/ui/home/my/StudentViewContentFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$initData$2;-><init>(Lcom/zykj/study/ui/home/my/StudentViewContentFragment;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$initData$2;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$initData$2;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$initData$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$initData$2;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$initData$2;->a:I

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
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$initData$2;->b:Lcom/zykj/study/ui/home/my/StudentViewContentFragment;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/zykj/study/ui/home/my/StudentViewContentFragment;->j(Lcom/zykj/study/ui/home/my/StudentViewContentFragment;)Lcom/zykj/study/viewmodels/StudentViewContentViewModel;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/StudentViewContentViewModel;->d()Landroidx/datastore/core/DataStore;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-interface {p1}, Landroidx/datastore/core/DataStore;->getData()Ll8/c;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput v2, p0, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$initData$2;->a:I

    .line 42
    .line 43
    invoke-static {p1, p0}, Ll8/e;->z(Ll8/c;Lm7/c;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-ne p1, v0, :cond_2

    .line 48
    .line 49
    return-object v0

    .line 50
    :cond_2
    :goto_0
    check-cast p1, Lcom/zykj/lib/login/proto/UserBean;

    .line 51
    .line 52
    if-eqz p1, :cond_3

    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/zykj/lib/login/proto/UserBean;->getRole()Lcom/zykj/lib/login/proto/RoleType;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    goto :goto_1

    .line 59
    :cond_3
    const/4 p1, 0x0

    .line 60
    :goto_1
    sget-object v0, Lcom/zykj/lib/login/proto/RoleType;->Teacher:Lcom/zykj/lib/login/proto/RoleType;

    .line 61
    .line 62
    if-ne p1, v0, :cond_4

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_4
    const/4 v2, 0x0

    .line 66
    :goto_2
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$initData$2;->b:Lcom/zykj/study/ui/home/my/StudentViewContentFragment;

    .line 67
    .line 68
    invoke-static {p1}, Lcom/zykj/study/ui/home/my/StudentViewContentFragment;->j(Lcom/zykj/study/ui/home/my/StudentViewContentFragment;)Lcom/zykj/study/viewmodels/StudentViewContentViewModel;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/StudentViewContentViewModel;->c()Ljava/util/HashSet;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$initData$2;->b:Lcom/zykj/study/ui/home/my/StudentViewContentFragment;

    .line 77
    .line 78
    new-instance v1, Lcom/zykj/study/ui/home/my/l;

    .line 79
    .line 80
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/my/l;-><init>(Lcom/zykj/study/ui/home/my/StudentViewContentFragment;)V

    .line 81
    .line 82
    .line 83
    new-instance v0, Lcom/zykj/study/adapter/CatalogProgressAdapter;

    .line 84
    .line 85
    invoke-direct {v0, v2, p1, v1}, Lcom/zykj/study/adapter/CatalogProgressAdapter;-><init>(ZLjava/util/HashSet;Lx7/l;)V

    .line 86
    .line 87
    .line 88
    return-object v0
.end method
