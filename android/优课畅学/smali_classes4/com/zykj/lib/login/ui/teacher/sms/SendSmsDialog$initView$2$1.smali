.class final Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog$initView$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog$initView$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.zykj.lib.login.ui.teacher.sms.SendSmsDialog$initView$2$1"
    f = "SendSmsDialog.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;


# direct methods
.method public constructor <init>(Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog$initView$2$1;->c:Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;

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
.method public final c(Lcom/zykj/lib/login/bean/LoginInfo;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog$initView$2$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog$initView$2$1;

    .line 6
    .line 7
    sget-object p2, Lh7/p;->a:Lh7/p;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog$initView$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    new-instance v0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog$initView$2$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog$initView$2$1;->c:Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog$initView$2$1;-><init>(Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog$initView$2$1;->b:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/zykj/lib/login/bean/LoginInfo;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog$initView$2$1;->c(Lcom/zykj/lib/login/bean/LoginInfo;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog$initView$2$1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/lib/login/bean/LoginInfo;

    .line 4
    .line 5
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog$initView$2$1;->a:I

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog$initView$2$1;->c:Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;

    .line 16
    .line 17
    invoke-static {p1}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog$initView$2$1;->c:Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;

    .line 25
    .line 26
    invoke-static {p1}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;->i(Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;)Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1, v0}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;->j(Lcom/zykj/lib/login/bean/LoginInfo;)V

    .line 31
    .line 32
    .line 33
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 34
    .line 35
    return-object p1

    .line 36
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 37
    .line 38
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1
.end method
