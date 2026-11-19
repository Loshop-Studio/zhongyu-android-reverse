.class public final Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;
.super Lcom/zykj/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\r\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u001a\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u001d\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u001d0!8\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010#\u001a\u0004\u0008$\u0010%R\u001a\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00100\'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010(R\u001d\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100*8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010+\u001a\u0004\u0008\"\u0010,\u00a8\u0006-"
    }
    d2 = {
        "Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;",
        "Lcom/zykj/base/BaseViewModel;",
        "Lcom/zykj/huiwei/launcher/repository/UserRepository;",
        "userRepository",
        "Landroidx/lifecycle/SavedStateHandle;",
        "savedStateHandle",
        "<init>",
        "(Lcom/zykj/huiwei/launcher/repository/UserRepository;Landroidx/lifecycle/SavedStateHandle;)V",
        "Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/b;",
        "event",
        "",
        "g",
        "(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/b;)V",
        "j",
        "()V",
        "h",
        "Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/c;",
        "effect",
        "i",
        "(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/c;)V",
        "a",
        "Lcom/zykj/huiwei/launcher/repository/UserRepository;",
        "b",
        "Landroidx/lifecycle/SavedStateHandle;",
        "",
        "c",
        "I",
        "passwordLevel",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Ld4/q;",
        "d",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "_uiState",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "e",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "f",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "uiState",
        "Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "_effect",
        "Lkotlinx/coroutines/flow/SharedFlow;",
        "Lkotlinx/coroutines/flow/SharedFlow;",
        "()Lkotlinx/coroutines/flow/SharedFlow;",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nChangePsdViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangePsdViewModel.kt\ncom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,141:1\n230#2,5:142\n230#2,5:147\n230#2,5:152\n230#2,5:157\n*S KotlinDebug\n*F\n+ 1 ChangePsdViewModel.kt\ncom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel\n*L\n65#1:142,5\n69#1:147,5\n73#1:152,5\n107#1:157,5\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lcom/zykj/huiwei/launcher/repository/UserRepository;

.field public final b:Landroidx/lifecycle/SavedStateHandle;

.field public final c:I

.field public final d:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final e:Lkotlinx/coroutines/flow/StateFlow;

.field public final f:Lkotlinx/coroutines/flow/MutableSharedFlow;

.field public final g:Lkotlinx/coroutines/flow/SharedFlow;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/huiwei/launcher/repository/UserRepository;Landroidx/lifecycle/SavedStateHandle;)V
    .locals 12

    .line 1
    const-string v0, "userRepository"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "savedStateHandle"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/zykj/base/BaseViewModel;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;->a:Lcom/zykj/huiwei/launcher/repository/UserRepository;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;->b:Landroidx/lifecycle/SavedStateHandle;

    .line 17
    .line 18
    const-string p1, "arg_pwd_level"

    .line 19
    .line 20
    invoke-virtual {p2, p1}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Ljava/lang/Integer;

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 p1, 0x1

    .line 34
    :goto_0
    iput p1, p0, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;->c:I

    .line 35
    .line 36
    new-instance v0, Ld4/q;

    .line 37
    .line 38
    sget-object p2, Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;->e:Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel$a;

    .line 39
    .line 40
    invoke-virtual {p2, p1}, Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel$a;->a(I)Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    const/16 v10, 0x1df

    .line 45
    .line 46
    const/4 v11, 0x0

    .line 47
    const/4 v1, 0x0

    .line 48
    const/4 v2, 0x0

    .line 49
    const/4 v3, 0x0

    .line 50
    const/4 v4, 0x0

    .line 51
    const/4 v5, 0x0

    .line 52
    const/4 v7, 0x0

    .line 53
    const/4 v8, 0x0

    .line 54
    const/4 v9, 0x0

    .line 55
    invoke-direct/range {v0 .. v11}, Ld4/q;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v0}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;->d:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 63
    .line 64
    invoke-static {p1}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;->e:Lkotlinx/coroutines/flow/StateFlow;

    .line 69
    .line 70
    const/4 p1, 0x7

    .line 71
    const/4 p2, 0x0

    .line 72
    const/4 v0, 0x0

    .line 73
    invoke-static {p2, p2, v0, p1, v0}, Lkotlinx/coroutines/flow/SharedFlowKt;->MutableSharedFlow$default(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;->f:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 78
    .line 79
    invoke-static {p1}, Lkotlinx/coroutines/flow/FlowKt;->asSharedFlow(Lkotlinx/coroutines/flow/MutableSharedFlow;)Lkotlinx/coroutines/flow/SharedFlow;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;->g:Lkotlinx/coroutines/flow/SharedFlow;

    .line 84
    .line 85
    return-void
.end method

.method public static final synthetic a(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;)Lcom/zykj/huiwei/launcher/repository/UserRepository;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;->a:Lcom/zykj/huiwei/launcher/repository/UserRepository;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;)Lkotlinx/coroutines/flow/MutableSharedFlow;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;->f:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic c(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;->d:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic d(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/c;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;->i(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/c;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final e()Lkotlinx/coroutines/flow/SharedFlow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;->g:Lkotlinx/coroutines/flow/SharedFlow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;->e:Lkotlinx/coroutines/flow/StateFlow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/b;)V
    .locals 14

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/b$c;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;->d:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 11
    .line 12
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    move-object v2, v1

    .line 17
    check-cast v2, Ld4/q;

    .line 18
    .line 19
    move-object v3, p1

    .line 20
    check-cast v3, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/b$c;

    .line 21
    .line 22
    invoke-virtual {v3}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/b$c;->a()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    const/16 v12, 0x1fe

    .line 27
    .line 28
    const/4 v13, 0x0

    .line 29
    const/4 v4, 0x0

    .line 30
    const/4 v5, 0x0

    .line 31
    const/4 v6, 0x0

    .line 32
    const/4 v7, 0x0

    .line 33
    const/4 v8, 0x0

    .line 34
    const/4 v9, 0x0

    .line 35
    const/4 v10, 0x0

    .line 36
    const/4 v11, 0x0

    .line 37
    invoke-static/range {v2 .. v13}, Ld4/q;->b(Ld4/q;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;ZZLjava/lang/String;ILjava/lang/Object;)Ld4/q;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-interface {v0, v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;->j()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_1
    instance-of v0, p1, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/b$b;

    .line 52
    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;->d:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 56
    .line 57
    :cond_2
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    move-object v2, v1

    .line 62
    check-cast v2, Ld4/q;

    .line 63
    .line 64
    move-object v3, p1

    .line 65
    check-cast v3, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/b$b;

    .line 66
    .line 67
    invoke-virtual {v3}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/b$b;->a()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    const/16 v12, 0x1fd

    .line 72
    .line 73
    const/4 v13, 0x0

    .line 74
    const/4 v3, 0x0

    .line 75
    const/4 v5, 0x0

    .line 76
    const/4 v6, 0x0

    .line 77
    const/4 v7, 0x0

    .line 78
    const/4 v8, 0x0

    .line 79
    const/4 v9, 0x0

    .line 80
    const/4 v10, 0x0

    .line 81
    const/4 v11, 0x0

    .line 82
    invoke-static/range {v2 .. v13}, Ld4/q;->b(Ld4/q;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;ZZLjava/lang/String;ILjava/lang/Object;)Ld4/q;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-interface {v0, v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_2

    .line 91
    .line 92
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;->j()V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_3
    instance-of v0, p1, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/b$a;

    .line 97
    .line 98
    if-eqz v0, :cond_5

    .line 99
    .line 100
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;->d:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 101
    .line 102
    :cond_4
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    move-object v2, v1

    .line 107
    check-cast v2, Ld4/q;

    .line 108
    .line 109
    move-object v3, p1

    .line 110
    check-cast v3, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/b$a;

    .line 111
    .line 112
    invoke-virtual {v3}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/b$a;->a()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    const/16 v12, 0x1fb

    .line 117
    .line 118
    const/4 v13, 0x0

    .line 119
    const/4 v3, 0x0

    .line 120
    const/4 v4, 0x0

    .line 121
    const/4 v6, 0x0

    .line 122
    const/4 v7, 0x0

    .line 123
    const/4 v8, 0x0

    .line 124
    const/4 v9, 0x0

    .line 125
    const/4 v10, 0x0

    .line 126
    const/4 v11, 0x0

    .line 127
    invoke-static/range {v2 .. v13}, Ld4/q;->b(Ld4/q;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;ZZLjava/lang/String;ILjava/lang/Object;)Ld4/q;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    invoke-interface {v0, v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-eqz v1, :cond_4

    .line 136
    .line 137
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;->j()V

    .line 138
    .line 139
    .line 140
    return-void

    .line 141
    :cond_5
    instance-of p1, p1, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/b$d;

    .line 142
    .line 143
    if-eqz p1, :cond_6

    .line 144
    .line 145
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;->h()V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 150
    .line 151
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 152
    .line 153
    .line 154
    throw p1
.end method

.method public final h()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;->d:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ld4/q;

    .line 8
    .line 9
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v4, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel$performSubmit$1;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {v4, p0, v0, v2}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel$performSubmit$1;-><init>(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;Ld4/q;Lkotlin/coroutines/Continuation;)V

    .line 17
    .line 18
    .line 19
    const/4 v5, 0x3

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final i(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/c;)V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel$sendEffect$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, p1, v1}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel$sendEffect$1;-><init>(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/c;Lkotlin/coroutines/Continuation;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final j()V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;->d:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 4
    .line 5
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ld4/q;

    .line 10
    .line 11
    invoke-virtual {v1}, Ld4/q;->g()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v1}, Ld4/q;->f()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v1}, Ld4/q;->d()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual {v1}, Ld4/q;->e()Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    const/4 v6, 0x0

    .line 32
    const/4 v7, 0x1

    .line 33
    const/16 v8, 0x8

    .line 34
    .line 35
    if-lt v5, v8, :cond_0

    .line 36
    .line 37
    invoke-virtual {v1}, Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;->c()Lkotlin/text/Regex;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    invoke-virtual {v5, v3}, Lkotlin/text/Regex;->matches(Ljava/lang/CharSequence;)Z

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-nez v5, :cond_0

    .line 46
    .line 47
    move/from16 v16, v7

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    move/from16 v16, v6

    .line 51
    .line 52
    :goto_0
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-lt v5, v8, :cond_1

    .line 57
    .line 58
    invoke-virtual {v1}, Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;->c()Lkotlin/text/Regex;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1, v3}, Lkotlin/text/Regex;->matches(Ljava/lang/CharSequence;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_1

    .line 67
    .line 68
    move v1, v7

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    move v1, v6

    .line 71
    :goto_1
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    if-lez v5, :cond_2

    .line 76
    .line 77
    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    if-nez v5, :cond_2

    .line 82
    .line 83
    move/from16 v17, v7

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_2
    move/from16 v17, v6

    .line 87
    .line 88
    :goto_2
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    if-lez v5, :cond_3

    .line 93
    .line 94
    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    if-eqz v3, :cond_3

    .line 99
    .line 100
    move v3, v7

    .line 101
    goto :goto_3

    .line 102
    :cond_3
    move v3, v6

    .line 103
    :goto_3
    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-nez v2, :cond_4

    .line 108
    .line 109
    if-eqz v1, :cond_4

    .line 110
    .line 111
    if-eqz v3, :cond_4

    .line 112
    .line 113
    move v14, v7

    .line 114
    goto :goto_4

    .line 115
    :cond_4
    move v14, v6

    .line 116
    :goto_4
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;->d:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 117
    .line 118
    :cond_5
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    move-object v9, v2

    .line 123
    check-cast v9, Ld4/q;

    .line 124
    .line 125
    if-eqz v17, :cond_6

    .line 126
    .line 127
    const-string v3, "\u4e24\u6b21\u5bc6\u7801\u8f93\u5165\u4e0d\u4e00\u81f4"

    .line 128
    .line 129
    :goto_5
    move-object/from16 v18, v3

    .line 130
    .line 131
    goto :goto_6

    .line 132
    :cond_6
    const-string v3, ""

    .line 133
    .line 134
    goto :goto_5

    .line 135
    :goto_6
    const/16 v19, 0x2f

    .line 136
    .line 137
    const/16 v20, 0x0

    .line 138
    .line 139
    const/4 v10, 0x0

    .line 140
    const/4 v11, 0x0

    .line 141
    const/4 v12, 0x0

    .line 142
    const/4 v13, 0x0

    .line 143
    const/4 v15, 0x0

    .line 144
    invoke-static/range {v9 .. v20}, Ld4/q;->b(Ld4/q;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;ZZLjava/lang/String;ILjava/lang/Object;)Ld4/q;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    invoke-interface {v1, v2, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    if-eqz v2, :cond_5

    .line 153
    .line 154
    return-void
.end method
