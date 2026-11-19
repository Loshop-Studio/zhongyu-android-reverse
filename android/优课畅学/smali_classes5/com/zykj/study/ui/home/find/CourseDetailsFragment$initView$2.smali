# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class final Lcom/zykj/study/ui/home/find/CourseDetailsFragment$initView$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
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
    c = "com.zykj.study.ui.home.find.CourseDetailsFragment$initView$2"
    f = "CourseDetailsFragment.kt"
    l = {
        0x36
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/study/ui/home/find/CourseDetailsFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$initView$2;->b:Lcom/zykj/study/ui/home/find/CourseDetailsFragment;

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

.method public static synthetic c(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;Lcom/zykj/study/bean/course/CatalogBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$initView$2;->d(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;Lcom/zykj/study/bean/course/CatalogBean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;Lcom/zykj/study/bean/course/CatalogBean;)Lh7/p;
    .locals 8

    .line 1
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/zykj/study/ui/home/find/b;->a:Lcom/zykj/study/ui/home/find/b$b;

    .line 6
    .line 7
    sget-object v2, Le5/e;->a:Le5/e;

    .line 8
    .line 9
    invoke-virtual {v2}, Le5/e;->c()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {p0}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->q(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;)Lcom/zykj/study/viewmodels/CourseDetailsViewModel;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v3}, Lcom/zykj/study/viewmodels/CourseDetailsViewModel;->d()Ll8/h;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-interface {v3}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Lcom/zykj/http/bean/HeaderBean;

    .line 26
    .line 27
    invoke-virtual {v3}, Lcom/zykj/http/bean/HeaderBean;->getAccessToken()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-static {p0}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->q(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;)Lcom/zykj/study/viewmodels/CourseDetailsViewModel;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {v4}, Lcom/zykj/study/viewmodels/CourseDetailsViewModel;->d()Ll8/h;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-interface {v4}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    check-cast v4, Lcom/zykj/http/bean/HeaderBean;

    .line 44
    .line 45
    invoke-virtual {v4}, Lcom/zykj/http/bean/HeaderBean;->getServerUrl()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CatalogBean;->getId()I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    invoke-static {p0}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->q(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;)Lcom/zykj/study/viewmodels/CourseDetailsViewModel;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    invoke-virtual {v6}, Lcom/zykj/study/viewmodels/CourseDetailsViewModel;->b()Landroidx/lifecycle/MutableLiveData;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    invoke-virtual {v6}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    check-cast v6, Lcom/zykj/study/bean/course/CourseDetailsBean;

    .line 66
    .line 67
    if-eqz v6, :cond_0

    .line 68
    .line 69
    invoke-virtual {v6}, Lcom/zykj/study/bean/course/CourseBean;->getId()I

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    goto :goto_0

    .line 78
    :cond_0
    const/4 v6, 0x0

    .line 79
    :goto_0
    new-instance v7, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v2, "?token="

    .line 88
    .line 89
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string v2, "&url="

    .line 96
    .line 97
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v2, "#/?entry=study&catalogId="

    .line 104
    .line 105
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const-string v2, "&courseId="

    .line 112
    .line 113
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CatalogBean;->getTitle()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    invoke-static {p0}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->q(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;)Lcom/zykj/study/viewmodels/CourseDetailsViewModel;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/CourseDetailsViewModel;->b()Landroidx/lifecycle/MutableLiveData;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-virtual {p0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    move-object v2, p0

    .line 140
    check-cast v2, Lcom/zykj/study/bean/course/CourseDetailsBean;

    .line 141
    .line 142
    const/4 v3, 0x0

    .line 143
    const/4 v4, 0x0

    .line 144
    invoke-virtual/range {v1 .. v6}, Lcom/zykj/study/ui/home/find/b$b;->a(Lcom/zykj/study/bean/course/CourseBean;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroidx/navigation/NavDirections;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-virtual {v0, p0}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 149
    .line 150
    .line 151
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 152
    .line 153
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$initView$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$initView$2;->b:Lcom/zykj/study/ui/home/find/CourseDetailsFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$initView$2;-><init>(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$initView$2;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$initView$2;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$initView$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$initView$2;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$initView$2;->a:I

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
    iget-object p1, p0, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$initView$2;->b:Lcom/zykj/study/ui/home/find/CourseDetailsFragment;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->q(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;)Lcom/zykj/study/viewmodels/CourseDetailsViewModel;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/CourseDetailsViewModel;->h()Landroidx/datastore/core/DataStore;

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
    iput v2, p0, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$initView$2;->a:I

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
    iget-object p1, p0, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$initView$2;->b:Lcom/zykj/study/ui/home/find/CourseDetailsFragment;

    .line 67
    .line 68
    invoke-static {p1}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->q(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;)Lcom/zykj/study/viewmodels/CourseDetailsViewModel;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/CourseDetailsViewModel;->f()Ljava/util/HashSet;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iget-object v0, p0, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$initView$2;->b:Lcom/zykj/study/ui/home/find/CourseDetailsFragment;

    .line 77
    .line 78
    new-instance v1, Lcom/zykj/study/ui/home/find/a;

    .line 79
    .line 80
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/find/a;-><init>(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;)V

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
