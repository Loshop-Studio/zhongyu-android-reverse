.class public final Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;
.super Lcom/zykj/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR%\u0010\u0016\u001a\u0010\u0012\u000c\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R%\u0010\u0019\u001a\u0010\u0012\u000c\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0013\u001a\u0004\u0008\u0018\u0010\u0015R%\u0010\u001a\u001a\u0010\u0012\u000c\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0013\u001a\u0004\u0008\u0012\u0010\u0015R%\u0010\u001c\u001a\u0010\u0012\u000c\u0012\n \u0011*\u0004\u0018\u00010\u001b0\u001b0\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0013\u001a\u0004\u0008\u0017\u0010\u0015R%\u0010\u001e\u001a\u0010\u0012\u000c\u0012\n \u0011*\u0004\u0018\u00010\u001b0\u001b0\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u0013\u001a\u0004\u0008\u000c\u0010\u0015R\u001d\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0013\u001a\u0004\u0008\t\u0010\u0015R%\u0010!\u001a\u0010\u0012\u000c\u0012\n \u0011*\u0004\u0018\u00010\u001b0\u001b0\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u0013\u001a\u0004\u0008\u001d\u0010\u0015\u00a8\u0006\""
    }
    d2 = {
        "Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;",
        "Lcom/zykj/base/BaseViewModel;",
        "Lcom/zykj/huiwei/launcher/repository/UserRepository;",
        "userRepository",
        "<init>",
        "(Lcom/zykj/huiwei/launcher/repository/UserRepository;)V",
        "",
        "h",
        "()V",
        "a",
        "Lcom/zykj/huiwei/launcher/repository/UserRepository;",
        "Lkotlin/text/Regex;",
        "b",
        "Lkotlin/text/Regex;",
        "passwordRegex",
        "Landroidx/lifecycle/MutableLiveData;",
        "",
        "kotlin.jvm.PlatformType",
        "c",
        "Landroidx/lifecycle/MutableLiveData;",
        "f",
        "()Landroidx/lifecycle/MutableLiveData;",
        "oldPasswordLiveData",
        "d",
        "e",
        "newPasswordLiveData",
        "doubleNewPasswordLiveData",
        "",
        "newPassTips",
        "g",
        "doubleNewPassTips",
        "changeSuccess",
        "i",
        "isBtnEnable",
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


# instance fields
.field public final a:Lcom/zykj/huiwei/launcher/repository/UserRepository;

.field public final b:Lkotlin/text/Regex;

.field public final c:Landroidx/lifecycle/MutableLiveData;

.field public final d:Landroidx/lifecycle/MutableLiveData;

.field public final e:Landroidx/lifecycle/MutableLiveData;

.field public final f:Landroidx/lifecycle/MutableLiveData;

.field public final g:Landroidx/lifecycle/MutableLiveData;

.field public final h:Landroidx/lifecycle/MutableLiveData;

.field public final i:Landroidx/lifecycle/MutableLiveData;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/huiwei/launcher/repository/UserRepository;)V
    .locals 1

    .line 1
    const-string v0, "userRepository"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zykj/base/BaseViewModel;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;->a:Lcom/zykj/huiwei/launcher/repository/UserRepository;

    .line 10
    .line 11
    new-instance p1, Lkotlin/text/Regex;

    .line 12
    .line 13
    const-string v0, "^(?=.*\\d)(?=.*[a-zA-Z]).{8,16}$"

    .line 14
    .line 15
    invoke-direct {p1, v0}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;->b:Lkotlin/text/Regex;

    .line 19
    .line 20
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 21
    .line 22
    const-string v0, ""

    .line 23
    .line 24
    invoke-direct {p1, v0}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;->c:Landroidx/lifecycle/MutableLiveData;

    .line 28
    .line 29
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 30
    .line 31
    invoke-direct {p1, v0}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;->d:Landroidx/lifecycle/MutableLiveData;

    .line 35
    .line 36
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 37
    .line 38
    invoke-direct {p1, v0}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;->e:Landroidx/lifecycle/MutableLiveData;

    .line 42
    .line 43
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 44
    .line 45
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 46
    .line 47
    invoke-direct {p1, v0}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;->f:Landroidx/lifecycle/MutableLiveData;

    .line 51
    .line 52
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 53
    .line 54
    invoke-direct {p1, v0}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;->g:Landroidx/lifecycle/MutableLiveData;

    .line 58
    .line 59
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 60
    .line 61
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 62
    .line 63
    .line 64
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;->h:Landroidx/lifecycle/MutableLiveData;

    .line 65
    .line 66
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 67
    .line 68
    invoke-direct {p1, v0}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;->i:Landroidx/lifecycle/MutableLiveData;

    .line 72
    .line 73
    return-void
.end method


# virtual methods
.method public final a()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;->h:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;->g:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;->e:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;->f:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;->d:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;->c:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;->i:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()V
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;->c:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;->d:Landroidx/lifecycle/MutableLiveData;

    .line 12
    .line 13
    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v2, p0, Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;->e:Landroidx/lifecycle/MutableLiveData;

    .line 22
    .line 23
    invoke-virtual {v2}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    iget-object v3, p0, Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;->b:Lkotlin/text/Regex;

    .line 32
    .line 33
    invoke-virtual {v3, v1}, Lkotlin/text/Regex;->matches(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    iget-object v3, p0, Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;->f:Landroidx/lifecycle/MutableLiveData;

    .line 40
    .line 41
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 42
    .line 43
    invoke-virtual {v3, v4}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-nez v3, :cond_0

    .line 51
    .line 52
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-nez v2, :cond_1

    .line 57
    .line 58
    :cond_0
    move-object v4, p0

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    iget-object v2, p0, Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;->g:Landroidx/lifecycle/MutableLiveData;

    .line 61
    .line 62
    invoke-virtual {v2, v4}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object v2, p0, Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;->a:Lcom/zykj/huiwei/launcher/repository/UserRepository;

    .line 66
    .line 67
    new-instance v3, Lcom/zykj/huiwei/launcher/bean/req/UpdatePwdReq;

    .line 68
    .line 69
    invoke-direct {v3, v0, v1}, Lcom/zykj/huiwei/launcher/bean/req/UpdatePwdReq;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, v3}, Lcom/zykj/huiwei/launcher/repository/UserRepository;->d(Lcom/zykj/huiwei/launcher/bean/req/UpdatePwdReq;)Lkotlinx/coroutines/flow/Flow;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    new-instance v9, Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel$updatePwd$1;

    .line 77
    .line 78
    const/4 v0, 0x0

    .line 79
    invoke-direct {v9, p0, v0}, Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel$updatePwd$1;-><init>(Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;Lkotlin/coroutines/Continuation;)V

    .line 80
    .line 81
    .line 82
    const/16 v10, 0xe

    .line 83
    .line 84
    const/4 v11, 0x0

    .line 85
    const/4 v6, 0x0

    .line 86
    const/4 v7, 0x0

    .line 87
    const/4 v8, 0x0

    .line 88
    move-object v4, p0

    .line 89
    invoke-static/range {v4 .. v11}, Lcom/zykj/huiwei/launcher/ext/ViewModelExtKt;->g(Lcom/zykj/base/BaseViewModel;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :goto_0
    iget-object v0, v4, Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;->g:Landroidx/lifecycle/MutableLiveData;

    .line 94
    .line 95
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_2
    move-object v4, p0

    .line 102
    iget-object v0, v4, Lcom/zykj/huiwei/launcher/viewmodels/ModifyPasswordViewModel;->f:Landroidx/lifecycle/MutableLiveData;

    .line 103
    .line 104
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    return-void
.end method
