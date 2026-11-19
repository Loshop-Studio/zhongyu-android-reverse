# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class final Lcom/zykj/study/ui/home/my/MyCourseFragment$initView$6$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/my/MyCourseFragment;->initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
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
    c = "com.zykj.study.ui.home.my.MyCourseFragment$initView$6$1"
    f = "MyCourseFragment.kt"
    l = {
        0x6f
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:I

.field public final synthetic d:Lcom/zykj/study/ui/home/my/MyCourseFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/my/MyCourseFragment;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/MyCourseFragment$initView$6$1;->d:Lcom/zykj/study/ui/home/my/MyCourseFragment;

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
    new-instance p1, Lcom/zykj/study/ui/home/my/MyCourseFragment$initView$6$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/MyCourseFragment$initView$6$1;->d:Lcom/zykj/study/ui/home/my/MyCourseFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/zykj/study/ui/home/my/MyCourseFragment$initView$6$1;-><init>(Lcom/zykj/study/ui/home/my/MyCourseFragment;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/MyCourseFragment$initView$6$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/my/MyCourseFragment$initView$6$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/my/MyCourseFragment$initView$6$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/MyCourseFragment$initView$6$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v2, v0, Lcom/zykj/study/ui/home/my/MyCourseFragment$initView$6$1;->c:I

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    if-ne v2, v3, :cond_0

    .line 13
    .line 14
    iget-object v1, v0, Lcom/zykj/study/ui/home/my/MyCourseFragment$initView$6$1;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Lv4/c$h;

    .line 17
    .line 18
    iget-object v2, v0, Lcom/zykj/study/ui/home/my/MyCourseFragment$initView$6$1;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Landroidx/navigation/NavController;

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    move-object/from16 v3, p1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 31
    .line 32
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v1

    .line 36
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object v2, v0, Lcom/zykj/study/ui/home/my/MyCourseFragment$initView$6$1;->d:Lcom/zykj/study/ui/home/my/MyCourseFragment;

    .line 40
    .line 41
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    const-string v4, "requireActivity(...)"

    .line 46
    .line 47
    invoke-static {v2, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    sget v4, Lcom/zykj/study/R$id;->nav_host_fragment:I

    .line 51
    .line 52
    invoke-static {v2, v4}, Landroidx/navigation/Navigation;->findNavController(Landroid/app/Activity;I)Landroidx/navigation/NavController;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    sget-object v4, Lv4/c;->a:Lv4/c$h;

    .line 57
    .line 58
    iget-object v5, v0, Lcom/zykj/study/ui/home/my/MyCourseFragment$initView$6$1;->d:Lcom/zykj/study/ui/home/my/MyCourseFragment;

    .line 59
    .line 60
    invoke-static {v5}, Lcom/zykj/study/ui/home/my/MyCourseFragment;->m(Lcom/zykj/study/ui/home/my/MyCourseFragment;)Lcom/zykj/study/viewmodels/MyCourseViewModel;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    invoke-virtual {v5}, Lcom/zykj/study/viewmodels/MyCourseViewModel;->e()Landroidx/datastore/core/DataStore;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-interface {v5}, Landroidx/datastore/core/DataStore;->getData()Ll8/c;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    iput-object v2, v0, Lcom/zykj/study/ui/home/my/MyCourseFragment$initView$6$1;->a:Ljava/lang/Object;

    .line 73
    .line 74
    iput-object v4, v0, Lcom/zykj/study/ui/home/my/MyCourseFragment$initView$6$1;->b:Ljava/lang/Object;

    .line 75
    .line 76
    iput v3, v0, Lcom/zykj/study/ui/home/my/MyCourseFragment$initView$6$1;->c:I

    .line 77
    .line 78
    invoke-static {v5, v0}, Ll8/e;->z(Ll8/c;Lm7/c;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    if-ne v3, v1, :cond_2

    .line 83
    .line 84
    return-object v1

    .line 85
    :cond_2
    move-object v1, v4

    .line 86
    :goto_0
    check-cast v3, Lcom/zykj/lib/login/proto/UserBean;

    .line 87
    .line 88
    if-eqz v3, :cond_4

    .line 89
    .line 90
    invoke-virtual {v3}, Lcom/zykj/lib/login/proto/UserBean;->getId()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    if-nez v3, :cond_3

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_3
    :goto_1
    move-object v6, v3

    .line 98
    goto :goto_3

    .line 99
    :cond_4
    :goto_2
    const-string v3, ""

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :goto_3
    new-instance v18, Ljava/util/Date;

    .line 103
    .line 104
    invoke-direct/range {v18 .. v18}, Ljava/util/Date;-><init>()V

    .line 105
    .line 106
    .line 107
    sget-object v17, Lcom/zykj/study/bean/course/CourseType;->UNDERCARRIAGE:Lcom/zykj/study/bean/course/CourseType;

    .line 108
    .line 109
    new-instance v4, Lcom/zykj/study/data/MyCourseEntity;

    .line 110
    .line 111
    const/16 v20, 0x4bfc

    .line 112
    .line 113
    const/16 v21, 0x0

    .line 114
    .line 115
    const/4 v5, 0x0

    .line 116
    const/4 v7, 0x0

    .line 117
    const/4 v8, 0x0

    .line 118
    const/4 v9, 0x0

    .line 119
    const/4 v10, 0x0

    .line 120
    const/4 v11, 0x0

    .line 121
    const/4 v12, 0x0

    .line 122
    const/4 v13, 0x0

    .line 123
    const/4 v14, 0x0

    .line 124
    const/4 v15, 0x0

    .line 125
    const/16 v16, 0x0

    .line 126
    .line 127
    const/16 v19, 0x0

    .line 128
    .line 129
    invoke-direct/range {v4 .. v21}, Lcom/zykj/study/data/MyCourseEntity;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIZZLcom/zykj/study/bean/course/CourseType;Ljava/util/Date;IILkotlin/jvm/internal/n;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1, v4}, Lv4/c$h;->c(Lcom/zykj/study/data/MyCourseEntity;)Landroidx/navigation/NavDirections;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-virtual {v2, v1}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 137
    .line 138
    .line 139
    sget-object v1, Lh7/p;->a:Lh7/p;

    .line 140
    .line 141
    return-object v1
.end method
