.class public final Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;
.super Lcom/zykj/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final a:Lp3/a;

.field public final b:Landroidx/lifecycle/MutableLiveData;

.field public final c:Landroidx/lifecycle/MutableLiveData;

.field public final d:Landroidx/lifecycle/MutableLiveData;

.field public final e:Landroidx/lifecycle/MutableLiveData;

.field public f:Lkotlinx/coroutines/n;

.field public final g:Ll8/g;

.field public final h:Ll8/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lp3/a;)V
    .locals 8

    .line 1
    const-string v0, "repository"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zykj/base/BaseViewModel;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;->a:Lp3/a;

    .line 10
    .line 11
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 12
    .line 13
    const-string v0, ""

    .line 14
    .line 15
    invoke-direct {p1, v0}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;->b:Landroidx/lifecycle/MutableLiveData;

    .line 19
    .line 20
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 21
    .line 22
    invoke-direct {p1, v0}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;->c:Landroidx/lifecycle/MutableLiveData;

    .line 26
    .line 27
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 28
    .line 29
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-direct {p1, v0}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;->d:Landroidx/lifecycle/MutableLiveData;

    .line 35
    .line 36
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 37
    .line 38
    const/16 v0, 0x3c

    .line 39
    .line 40
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-direct {p1, v0}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;->e:Landroidx/lifecycle/MutableLiveData;

    .line 48
    .line 49
    const/4 p1, 0x7

    .line 50
    const/4 v0, 0x0

    .line 51
    const/4 v1, 0x0

    .line 52
    invoke-static {v0, v0, v1, p1, v1}, Ll8/m;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Ll8/g;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iput-object p1, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;->g:Ll8/g;

    .line 57
    .line 58
    invoke-static {p1}, Ll8/e;->a(Ll8/g;)Ll8/l;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iput-object p1, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;->h:Ll8/l;

    .line 63
    .line 64
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Li8/b0;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    new-instance v5, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$1;

    .line 69
    .line 70
    invoke-direct {v5, p0, v1}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$1;-><init>(Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;Lm7/c;)V

    .line 71
    .line 72
    .line 73
    const/4 v6, 0x3

    .line 74
    const/4 v7, 0x0

    .line 75
    const/4 v3, 0x0

    .line 76
    const/4 v4, 0x0

    .line 77
    invoke-static/range {v2 .. v7}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public static final synthetic a(Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;)Ll8/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;->g:Ll8/g;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final b()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;->e:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Lkotlinx/coroutines/n;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;->f:Lkotlinx/coroutines/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Ll8/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;->h:Ll8/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;->b:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()Lp3/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;->a:Lp3/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;->c:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;->d:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/base/BaseViewModel;->isDialogVisible()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-direct {v2, p0, v3}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$sendSms$1;-><init>(Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;Lm7/c;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0, v1, v2}, Lcom/zykj/base/BaseViewModel;->launchData(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;)Lkotlinx/coroutines/n;

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final j(Lkotlinx/coroutines/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;->f:Lkotlinx/coroutines/n;

    .line 2
    .line 3
    return-void
.end method

.method public final k()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;->c:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {p0}, Lcom/zykj/base/BaseViewModel;->isDialogVisible()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    new-instance v3, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$verifyCode$1;

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    invoke-direct {v3, p0, v0, v4}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$verifyCode$1;-><init>(Lcom/zykj/lib/login/ui/teacher/sms/SendSmsViewModel;Ljava/lang/String;Lm7/c;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v1, v2, v3}, Lcom/zykj/base/BaseViewModel;->launchData(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;)Lkotlinx/coroutines/n;

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void
.end method
