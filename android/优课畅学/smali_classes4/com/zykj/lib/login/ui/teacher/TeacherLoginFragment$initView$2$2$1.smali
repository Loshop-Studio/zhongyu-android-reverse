.class final Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment$initView$2$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment$initView$2$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.zykj.lib.login.ui.teacher.TeacherLoginFragment$initView$2$2$1"
    f = "TeacherLoginFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment$initView$2$2$1;->c:Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment;

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
.method public final c(Lcom/zykj/lib/login/ui/teacher/a;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment$initView$2$2$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment$initView$2$2$1;

    .line 6
    .line 7
    sget-object p2, Lh7/p;->a:Lh7/p;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment$initView$2$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    new-instance v0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment$initView$2$2$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment$initView$2$2$1;->c:Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment$initView$2$2$1;-><init>(Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment$initView$2$2$1;->b:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/zykj/lib/login/ui/teacher/a;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment$initView$2$2$1;->c(Lcom/zykj/lib/login/ui/teacher/a;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment$initView$2$2$1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/lib/login/ui/teacher/a;

    .line 4
    .line 5
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment$initView$2$2$1;->a:I

    .line 9
    .line 10
    if-nez v1, :cond_2

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    instance-of p1, v0, Lcom/zykj/lib/login/ui/teacher/a$b;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    iget-object p1, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment$initView$2$2$1;->c:Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment;

    .line 20
    .line 21
    invoke-static {p1}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    sget v0, Lcom/zykj/lib/login/R$id;->sendSmsDialog:I

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Landroidx/navigation/NavController;->navigate(I)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    instance-of p1, v0, Lcom/zykj/lib/login/ui/teacher/a$a;

    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    check-cast v0, Lcom/zykj/lib/login/ui/teacher/a$a;

    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/zykj/lib/login/ui/teacher/a$a;->a()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    invoke-static {p1}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const-string v0, "arg_pwd_level"

    .line 46
    .line 47
    invoke-static {v0, p1}, Lh7/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    filled-new-array {p1}, [Lkotlin/Pair;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-static {p1}, Landroidx/core/os/BundleKt;->bundleOf([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment$initView$2$2$1;->c:Lcom/zykj/lib/login/ui/teacher/TeacherLoginFragment;

    .line 60
    .line 61
    invoke-static {v0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sget v1, Lcom/zykj/lib/login/R$id;->changePwdDialog:I

    .line 66
    .line 67
    invoke-virtual {v0, v1, p1}, Landroidx/navigation/NavController;->navigate(ILandroid/os/Bundle;)V

    .line 68
    .line 69
    .line 70
    :goto_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 71
    .line 72
    return-object p1

    .line 73
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 74
    .line 75
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 76
    .line 77
    .line 78
    throw p1

    .line 79
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 80
    .line 81
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 82
    .line 83
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p1
.end method
