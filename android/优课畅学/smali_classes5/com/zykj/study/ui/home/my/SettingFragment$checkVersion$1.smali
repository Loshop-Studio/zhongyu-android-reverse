# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class final Lcom/zykj/study/ui/home/my/SettingFragment$checkVersion$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/my/SettingFragment;->m()V
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
    c = "com.zykj.study.ui.home.my.SettingFragment$checkVersion$1"
    f = "SettingFragment.kt"
    l = {
        0x4e
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/study/ui/home/my/SettingFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/my/SettingFragment;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/SettingFragment$checkVersion$1;->b:Lcom/zykj/study/ui/home/my/SettingFragment;

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
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/zykj/study/ui/home/my/SettingFragment$checkVersion$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/SettingFragment$checkVersion$1;->b:Lcom/zykj/study/ui/home/my/SettingFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/zykj/study/ui/home/my/SettingFragment$checkVersion$1;-><init>(Lcom/zykj/study/ui/home/my/SettingFragment;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/SettingFragment$checkVersion$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/my/SettingFragment$checkVersion$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/my/SettingFragment$checkVersion$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/SettingFragment$checkVersion$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/study/ui/home/my/SettingFragment$checkVersion$1;->a:I

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
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/SettingFragment$checkVersion$1;->b:Lcom/zykj/study/ui/home/my/SettingFragment;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/zykj/study/ui/home/my/SettingFragment;->l(Lcom/zykj/study/ui/home/my/SettingFragment;)Lcom/zykj/lib/login/ui/main/LoginViewModel;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Lcom/zykj/lib/login/ui/main/LoginViewModel;->c()Landroidx/datastore/core/DataStore;

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
    iput v2, p0, Lcom/zykj/study/ui/home/my/SettingFragment$checkVersion$1;->a:I

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
    if-eqz p1, :cond_4

    .line 53
    .line 54
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/SettingFragment$checkVersion$1;->b:Lcom/zykj/study/ui/home/my/SettingFragment;

    .line 55
    .line 56
    invoke-virtual {p1}, Lcom/zykj/lib/login/proto/UserBean;->getId()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    const-string v2, "getId(...)"

    .line 61
    .line 62
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-lez v1, :cond_4

    .line 70
    .line 71
    sget-object v2, Lv4/c;->a:Lv4/c$h;

    .line 72
    .line 73
    invoke-virtual {p1}, Lcom/zykj/lib/login/proto/UserBean;->getRole()Lcom/zykj/lib/login/proto/RoleType;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    sget-object v1, Lcom/zykj/lib/login/proto/RoleType;->Student:Lcom/zykj/lib/login/proto/RoleType;

    .line 78
    .line 79
    if-ne p1, v1, :cond_3

    .line 80
    .line 81
    sget-object p1, Lcom/zykj/lib/ota/bean/AppType;->STUDENT:Lcom/zykj/lib/ota/bean/AppType;

    .line 82
    .line 83
    :goto_1
    move-object v6, p1

    .line 84
    goto :goto_2

    .line 85
    :cond_3
    sget-object p1, Lcom/zykj/lib/ota/bean/AppType;->TEACHER:Lcom/zykj/lib/ota/bean/AppType;

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :goto_2
    const/4 v7, 0x0

    .line 89
    const-string v3, "com.zhongyukejiao.learningexpert"

    .line 90
    .line 91
    const/16 v4, 0x2777

    .line 92
    .line 93
    const-string v5, "1.1.3"

    .line 94
    .line 95
    invoke-virtual/range {v2 .. v7}, Lv4/c$h;->g(Ljava/lang/String;ILjava/lang/String;Lcom/zykj/lib/ota/bean/AppType;Z)Landroidx/navigation/NavDirections;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    :try_start_0
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    if-eqz v0, :cond_4

    .line 104
    .line 105
    sget v1, Lcom/zykj/study/R$id;->nav_host_fragment:I

    .line 106
    .line 107
    invoke-static {v0, v1}, Landroidx/navigation/ActivityKt;->findNavController(Landroid/app/Activity;I)Landroidx/navigation/NavController;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    if-eqz v0, :cond_4

    .line 112
    .line 113
    invoke-virtual {v0, p1}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 114
    .line 115
    .line 116
    goto :goto_3

    .line 117
    :catch_0
    move-exception v0

    .line 118
    move-object p1, v0

    .line 119
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 120
    .line 121
    .line 122
    :cond_4
    :goto_3
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 123
    .line 124
    return-object p1
.end method
