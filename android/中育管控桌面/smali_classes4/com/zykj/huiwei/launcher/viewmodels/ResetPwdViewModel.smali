.class public final Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;
.super Lcom/zykj/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\nJ\u0015\u0010\u000e\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0019R\u001a\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u001dR\u001d\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010 \u001a\u0004\u0008\u0015\u0010!\u00a8\u0006#"
    }
    d2 = {
        "Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;",
        "Lcom/zykj/base/BaseViewModel;",
        "Lcom/zykj/huiwei/launcher/repository/UserRepository;",
        "userRepository",
        "Landroidx/lifecycle/SavedStateHandle;",
        "savedStateHandle",
        "<init>",
        "(Lcom/zykj/huiwei/launcher/repository/UserRepository;Landroidx/lifecycle/SavedStateHandle;)V",
        "",
        "f",
        "()V",
        "e",
        "Lcom/zykj/huiwei/launcher/viewmodels/a;",
        "event",
        "d",
        "(Lcom/zykj/huiwei/launcher/viewmodels/a;)V",
        "a",
        "Lcom/zykj/huiwei/launcher/repository/UserRepository;",
        "b",
        "Landroidx/lifecycle/SavedStateHandle;",
        "",
        "c",
        "I",
        "passwordLevel",
        "Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;",
        "Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;",
        "currentPolicy",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Ll4/g;",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "_uiState",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "uiState",
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
        "SMAP\nResetPwdViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResetPwdViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,155:1\n230#2,5:156\n230#2,5:161\n230#2,5:166\n*S KotlinDebug\n*F\n+ 1 ResetPwdViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel\n*L\n54#1:156,5\n59#1:161,5\n85#1:166,5\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lcom/zykj/huiwei/launcher/repository/UserRepository;

.field public final b:Landroidx/lifecycle/SavedStateHandle;

.field public final c:I

.field public final d:Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;

.field public final e:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final f:Lkotlinx/coroutines/flow/StateFlow;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/huiwei/launcher/repository/UserRepository;Landroidx/lifecycle/SavedStateHandle;)V
    .locals 13

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
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;->a:Lcom/zykj/huiwei/launcher/repository/UserRepository;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;->b:Landroidx/lifecycle/SavedStateHandle;

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
    iput p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;->c:I

    .line 35
    .line 36
    sget-object p2, Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;->e:Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel$a;

    .line 37
    .line 38
    invoke-virtual {p2, p1}, Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel$a;->a(I)Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    iput-object v5, p0, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;->d:Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;

    .line 43
    .line 44
    new-instance v0, Ll4/g;

    .line 45
    .line 46
    const/16 v11, 0x3ef

    .line 47
    .line 48
    const/4 v12, 0x0

    .line 49
    const/4 v1, 0x0

    .line 50
    const/4 v2, 0x0

    .line 51
    const/4 v3, 0x0

    .line 52
    const/4 v4, 0x0

    .line 53
    const/4 v6, 0x0

    .line 54
    const/4 v7, 0x0

    .line 55
    const/4 v8, 0x0

    .line 56
    const/4 v9, 0x0

    .line 57
    const/4 v10, 0x0

    .line 58
    invoke-direct/range {v0 .. v12}, Ll4/g;-><init>(Ljava/lang/String;Ljava/lang/String;ZZLcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;ZLjava/lang/String;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v0}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;->e:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 66
    .line 67
    invoke-static {p1}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;->f:Lkotlinx/coroutines/flow/StateFlow;

    .line 72
    .line 73
    return-void
.end method

.method public static final synthetic a(Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;)Lcom/zykj/huiwei/launcher/repository/UserRepository;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;->a:Lcom/zykj/huiwei/launcher/repository/UserRepository;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b(Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;->e:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    return-object p0
.end method

.method private final e()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;->e:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ll4/g;

    .line 8
    .line 9
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v4, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel$performSubmit$1;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {v4, p0, v0, v2}, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel$performSubmit$1;-><init>(Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;Ll4/g;Lkotlin/coroutines/Continuation;)V

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

.method private final f()V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;->e:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 4
    .line 5
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ll4/g;

    .line 10
    .line 11
    invoke-virtual {v1}, Ll4/g;->g()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v1}, Ll4/g;->d()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v1}, Ll4/g;->e()Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    const/16 v5, 0x8

    .line 28
    .line 29
    const/4 v6, 0x0

    .line 30
    const/4 v7, 0x1

    .line 31
    if-lt v4, v5, :cond_0

    .line 32
    .line 33
    invoke-virtual {v1}, Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;->c()Lkotlin/text/Regex;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-virtual {v4, v2}, Lkotlin/text/Regex;->matches(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-nez v4, :cond_0

    .line 42
    .line 43
    move/from16 v16, v7

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move/from16 v16, v6

    .line 47
    .line 48
    :goto_0
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-lez v4, :cond_1

    .line 53
    .line 54
    invoke-virtual {v1}, Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;->c()Lkotlin/text/Regex;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v1, v2}, Lkotlin/text/Regex;->matches(Ljava/lang/CharSequence;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_1

    .line 63
    .line 64
    move v1, v7

    .line 65
    goto :goto_1

    .line 66
    :cond_1
    move v1, v6

    .line 67
    :goto_1
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-lez v4, :cond_2

    .line 72
    .line 73
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-nez v4, :cond_2

    .line 78
    .line 79
    move/from16 v17, v7

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_2
    move/from16 v17, v6

    .line 83
    .line 84
    :goto_2
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    if-lez v4, :cond_3

    .line 89
    .line 90
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-eqz v2, :cond_3

    .line 95
    .line 96
    move v2, v7

    .line 97
    goto :goto_3

    .line 98
    :cond_3
    move v2, v6

    .line 99
    :goto_3
    if-eqz v1, :cond_4

    .line 100
    .line 101
    if-eqz v2, :cond_4

    .line 102
    .line 103
    move v12, v7

    .line 104
    goto :goto_4

    .line 105
    :cond_4
    move v12, v6

    .line 106
    :goto_4
    iget-object v1, v0, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;->e:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 107
    .line 108
    :cond_5
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    move-object v8, v2

    .line 113
    check-cast v8, Ll4/g;

    .line 114
    .line 115
    if-eqz v17, :cond_6

    .line 116
    .line 117
    const-string v3, "\u4e24\u6b21\u5bc6\u7801\u8f93\u5165\u4e0d\u4e00\u81f4"

    .line 118
    .line 119
    :goto_5
    move-object/from16 v18, v3

    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_6
    const-string v3, ""

    .line 123
    .line 124
    goto :goto_5

    .line 125
    :goto_6
    const/16 v19, 0x77

    .line 126
    .line 127
    const/16 v20, 0x0

    .line 128
    .line 129
    const/4 v9, 0x0

    .line 130
    const/4 v10, 0x0

    .line 131
    const/4 v11, 0x0

    .line 132
    const/4 v13, 0x0

    .line 133
    const/4 v14, 0x0

    .line 134
    const/4 v15, 0x0

    .line 135
    invoke-static/range {v8 .. v20}, Ll4/g;->b(Ll4/g;Ljava/lang/String;Ljava/lang/String;ZZLcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;ZLjava/lang/String;ZZLjava/lang/String;ILjava/lang/Object;)Ll4/g;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    invoke-interface {v1, v2, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    if-eqz v2, :cond_5

    .line 144
    .line 145
    return-void
.end method


# virtual methods
.method public final c()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;->f:Lkotlinx/coroutines/flow/StateFlow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d(Lcom/zykj/huiwei/launcher/viewmodels/a;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "event"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    instance-of v2, v1, Lcom/zykj/huiwei/launcher/viewmodels/a$b;

    .line 11
    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    iget-object v2, v0, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;->e:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 15
    .line 16
    :cond_0
    invoke-interface {v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    move-object v4, v3

    .line 21
    check-cast v4, Ll4/g;

    .line 22
    .line 23
    move-object v5, v1

    .line 24
    check-cast v5, Lcom/zykj/huiwei/launcher/viewmodels/a$b;

    .line 25
    .line 26
    invoke-virtual {v5}, Lcom/zykj/huiwei/launcher/viewmodels/a$b;->a()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    const/16 v15, 0x3fe

    .line 31
    .line 32
    const/16 v16, 0x0

    .line 33
    .line 34
    const/4 v6, 0x0

    .line 35
    const/4 v7, 0x0

    .line 36
    const/4 v8, 0x0

    .line 37
    const/4 v9, 0x0

    .line 38
    const/4 v10, 0x0

    .line 39
    const/4 v11, 0x0

    .line 40
    const/4 v12, 0x0

    .line 41
    const/4 v13, 0x0

    .line 42
    const/4 v14, 0x0

    .line 43
    invoke-static/range {v4 .. v16}, Ll4/g;->b(Ll4/g;Ljava/lang/String;Ljava/lang/String;ZZLcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;ZLjava/lang/String;ZZLjava/lang/String;ILjava/lang/Object;)Ll4/g;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-interface {v2, v3, v4}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_0

    .line 52
    .line 53
    invoke-direct {v0}, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;->f()V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_1
    instance-of v2, v1, Lcom/zykj/huiwei/launcher/viewmodels/a$a;

    .line 58
    .line 59
    if-eqz v2, :cond_3

    .line 60
    .line 61
    iget-object v2, v0, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;->e:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 62
    .line 63
    :cond_2
    invoke-interface {v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    move-object v4, v3

    .line 68
    check-cast v4, Ll4/g;

    .line 69
    .line 70
    move-object v5, v1

    .line 71
    check-cast v5, Lcom/zykj/huiwei/launcher/viewmodels/a$a;

    .line 72
    .line 73
    invoke-virtual {v5}, Lcom/zykj/huiwei/launcher/viewmodels/a$a;->a()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    const/16 v15, 0x3fd

    .line 78
    .line 79
    const/16 v16, 0x0

    .line 80
    .line 81
    const/4 v5, 0x0

    .line 82
    const/4 v7, 0x0

    .line 83
    const/4 v8, 0x0

    .line 84
    const/4 v9, 0x0

    .line 85
    const/4 v10, 0x0

    .line 86
    const/4 v11, 0x0

    .line 87
    const/4 v12, 0x0

    .line 88
    const/4 v13, 0x0

    .line 89
    const/4 v14, 0x0

    .line 90
    invoke-static/range {v4 .. v16}, Ll4/g;->b(Ll4/g;Ljava/lang/String;Ljava/lang/String;ZZLcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;ZLjava/lang/String;ZZLjava/lang/String;ILjava/lang/Object;)Ll4/g;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-interface {v2, v3, v4}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    if-eqz v3, :cond_2

    .line 99
    .line 100
    invoke-direct {v0}, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;->f()V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_3
    instance-of v1, v1, Lcom/zykj/huiwei/launcher/viewmodels/a$c;

    .line 105
    .line 106
    if-eqz v1, :cond_4

    .line 107
    .line 108
    invoke-direct {v0}, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;->e()V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :cond_4
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    .line 113
    .line 114
    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 115
    .line 116
    .line 117
    throw v1
.end method
