# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class public final Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;
.super Lcom/zykj/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final a:Lp3/a;

.field public final b:Landroidx/datastore/core/DataStore;

.field public final c:Landroidx/datastore/core/DataStore;

.field public final d:Landroidx/lifecycle/MutableLiveData;

.field public final e:Landroidx/lifecycle/MutableLiveData;

.field public final f:Landroidx/lifecycle/MutableLiveData;

.field public final g:Landroidx/lifecycle/MutableLiveData;

.field public final h:Ll8/g;

.field public final i:Ll8/l;

.field public final j:Ll8/g;

.field public final k:Ll8/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lp3/a;Landroidx/datastore/core/DataStore;Landroidx/datastore/core/DataStore;)V
    .locals 6

    .line 1
    const-string v0, "accountRepository"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "serverDataStore"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "userDataStore"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lcom/zykj/base/BaseViewModel;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;->a:Lp3/a;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;->b:Landroidx/datastore/core/DataStore;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;->c:Landroidx/datastore/core/DataStore;

    .line 24
    .line 25
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 26
    .line 27
    const-string p2, ""

    .line 28
    .line 29
    invoke-direct {p1, p2}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;->d:Landroidx/lifecycle/MutableLiveData;

    .line 33
    .line 34
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 35
    .line 36
    invoke-direct {p1, p2}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;->e:Landroidx/lifecycle/MutableLiveData;

    .line 40
    .line 41
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 42
    .line 43
    invoke-direct {p1, p2}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;->f:Landroidx/lifecycle/MutableLiveData;

    .line 47
    .line 48
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 49
    .line 50
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 51
    .line 52
    invoke-direct {p1, p2}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;->g:Landroidx/lifecycle/MutableLiveData;

    .line 56
    .line 57
    const/4 p1, 0x0

    .line 58
    const/4 p2, 0x0

    .line 59
    const/4 p3, 0x7

    .line 60
    invoke-static {p1, p1, p2, p3, p2}, Ll8/m;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Ll8/g;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;->h:Ll8/g;

    .line 65
    .line 66
    invoke-static {v0}, Ll8/e;->a(Ll8/g;)Ll8/l;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iput-object v0, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;->i:Ll8/l;

    .line 71
    .line 72
    invoke-static {p1, p1, p2, p3, p2}, Ll8/m;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Ll8/g;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iput-object p1, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;->j:Ll8/g;

    .line 77
    .line 78
    invoke-static {p1}, Ll8/e;->a(Ll8/g;)Ll8/l;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    iput-object p1, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;->k:Ll8/l;

    .line 83
    .line 84
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Li8/b0;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    new-instance v3, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$1;

    .line 89
    .line 90
    invoke-direct {v3, p0, p2}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$1;-><init>(Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;Lm7/c;)V

    .line 91
    .line 92
    .line 93
    const/4 v4, 0x3

    .line 94
    const/4 v5, 0x0

    .line 95
    const/4 v1, 0x0

    .line 96
    const/4 v2, 0x0

    .line 97
    invoke-static/range {v0 .. v5}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method public static final synthetic a(Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;)Ll8/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;->j:Ll8/g;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b(Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;)Ll8/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;->h:Ll8/g;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final c()Lp3/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;->a:Lp3/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Ll8/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;->k:Ll8/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;->f:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;->d:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Landroidx/datastore/core/DataStore;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;->b:Landroidx/datastore/core/DataStore;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Landroidx/datastore/core/DataStore;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;->c:Landroidx/datastore/core/DataStore;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;->e:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j(Lcom/zykj/lib/login/bean/LoginInfo;)V
    .locals 7

    .line 1
    const-string v0, "loginInfo"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Li8/b0;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v4, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$handleLoginInfo$1;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {v4, p1, p0, v0}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$handleLoginInfo$1;-><init>(Lcom/zykj/lib/login/bean/LoginInfo;Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;Lm7/c;)V

    .line 14
    .line 15
    .line 16
    const/4 v5, 0x3

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-static/range {v1 .. v6}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final k()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;->g:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()Ll8/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;->i:Ll8/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()V
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
    new-instance v2, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$login$1;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-direct {v2, p0, v3}, Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel$login$1;-><init>(Lcom/zykj/lib/login/ui/teacher/TeacherLoginViewModel;Lm7/c;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0, v1, v2}, Lcom/zykj/base/BaseViewModel;->launchData(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;)Lkotlinx/coroutines/n;

    .line 16
    .line 17
    .line 18
    return-void
.end method
