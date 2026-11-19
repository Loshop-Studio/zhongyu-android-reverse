.class final Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog$initView$2$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog$initView$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.zykj.lib.login.ui.teacher.pwd.ChangePwdDialog$initView$2$1$1"
    f = "ChangePwdDialog.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Z

.field public final synthetic c:Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog;


# direct methods
.method public constructor <init>(Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog$initView$2$1$1;->c:Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog;

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
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog$initView$2$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog$initView$2$1$1;->c:Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog$initView$2$1$1;-><init>(Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput-boolean p1, v0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog$initView$2$1$1;->b:Z

    .line 15
    .line 16
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog$initView$2$1$1;->invoke(ZLm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(ZLm7/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog$initView$2$1$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog$initView$2$1$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog$initView$2$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog$initView$2$1$1;->b:Z

    .line 2
    .line 3
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog$initView$2$1$1;->a:I

    .line 7
    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog$initView$2$1$1;->c:Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog;

    .line 16
    .line 17
    invoke-static {p1}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog;->g(Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog;)Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-instance v0, Lcom/zykj/base/bean/toast/ToastInfoMessage;

    .line 26
    .line 27
    iget-object v1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog$initView$2$1$1;->c:Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog;

    .line 28
    .line 29
    sget v2, Lcom/zykj/lib/login/R$string;->reLogin:I

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const/4 v2, 0x2

    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-direct {v0, v1, v3, v2, v3}, Lcom/zykj/base/bean/toast/ToastInfoMessage;-><init>(Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/n;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v0}, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;->postValue(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    iget-object p1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog$initView$2$1$1;->c:Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdDialog;

    .line 44
    .line 45
    invoke-static {p1}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p1}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 50
    .line 51
    .line 52
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p1
.end method
