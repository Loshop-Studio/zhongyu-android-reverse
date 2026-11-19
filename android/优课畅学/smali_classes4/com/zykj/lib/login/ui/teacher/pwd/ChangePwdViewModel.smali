.class public final Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;
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

.field public final e:Ll8/g;

.field public final f:Ll8/l;

.field public final g:Lkotlin/text/Regex;


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
    iput-object p1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;->a:Lp3/a;

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
    iput-object p1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;->b:Landroidx/lifecycle/MutableLiveData;

    .line 19
    .line 20
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 21
    .line 22
    invoke-direct {p1, v0}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;->c:Landroidx/lifecycle/MutableLiveData;

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
    iput-object p1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;->d:Landroidx/lifecycle/MutableLiveData;

    .line 35
    .line 36
    const/4 p1, 0x7

    .line 37
    const/4 v0, 0x0

    .line 38
    const/4 v1, 0x0

    .line 39
    invoke-static {v0, v0, v1, p1, v1}, Ll8/m;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Ll8/g;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iput-object p1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;->e:Ll8/g;

    .line 44
    .line 45
    invoke-static {p1}, Ll8/e;->a(Ll8/g;)Ll8/l;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iput-object p1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;->f:Ll8/l;

    .line 50
    .line 51
    new-instance p1, Lkotlin/text/Regex;

    .line 52
    .line 53
    const-string v0, "^(?=.*\\d)(?=.*[a-zA-Z]).{8,16}$"

    .line 54
    .line 55
    invoke-direct {p1, v0}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;->g:Lkotlin/text/Regex;

    .line 59
    .line 60
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Li8/b0;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    new-instance v5, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$1;

    .line 65
    .line 66
    invoke-direct {v5, p0, v1}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$1;-><init>(Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;Lm7/c;)V

    .line 67
    .line 68
    .line 69
    const/4 v6, 0x3

    .line 70
    const/4 v7, 0x0

    .line 71
    const/4 v3, 0x0

    .line 72
    const/4 v4, 0x0

    .line 73
    invoke-static/range {v2 .. v7}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public static final synthetic a(Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;)Ll8/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;->e:Ll8/g;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final b()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;->d:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Ll8/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;->f:Ll8/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;->c:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;->b:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()Lp3/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;->a:Lp3/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;->d:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;->b:Landroidx/lifecycle/MutableLiveData;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    check-cast v0, Ljava/lang/String;

    .line 26
    .line 27
    iget-object v1, p0, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;->g:Lkotlin/text/Regex;

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Lkotlin/text/Regex;->h(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_1

    .line 34
    .line 35
    sget-object v0, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 36
    .line 37
    sget v1, Lcom/zykj/lib/login/R$string;->input_pwd_less:I

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lcom/zykj/base/utils/XToastUtils;->info(I)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Li8/b0;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    new-instance v5, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$modifyPwd$1;

    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-direct {v5, p0, v0, v1}, Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$modifyPwd$1;-><init>(Lcom/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel;Ljava/lang/String;Lm7/c;)V

    .line 51
    .line 52
    .line 53
    const/4 v6, 0x3

    .line 54
    const/4 v7, 0x0

    .line 55
    const/4 v3, 0x0

    .line 56
    const/4 v4, 0x0

    .line 57
    invoke-static/range {v2 .. v7}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 58
    .line 59
    .line 60
    return-void
.end method
