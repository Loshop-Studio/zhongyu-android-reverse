# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class public final Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;
.super Lcom/zykj/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008%\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001By\u0008\u0007\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0002\u0012\u000e\u0008\u0001\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0082@\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ \u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020 H\u0082@\u00a2\u0006\u0004\u0008#\u0010$J \u0010\'\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\"H\u0082@\u00a2\u0006\u0004\u0008\'\u0010(J2\u0010+\u001a\u00020&2\u0008\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\"2\u0006\u0010*\u001a\u00020)H\u0082@\u00a2\u0006\u0004\u0008+\u0010,J!\u0010/\u001a\u00020&2\u0008\u0010-\u001a\u0004\u0018\u00010\u001a2\u0008\u0010.\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0004\u0008/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u001aH\u0086@\u00a2\u0006\u0004\u00081\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u001aH\u0086@\u00a2\u0006\u0004\u00083\u00102J\u0012\u00104\u001a\u0004\u0018\u00010\u001aH\u0086@\u00a2\u0006\u0004\u00084\u00102J\r\u00105\u001a\u00020&\u00a2\u0006\u0004\u00085\u00106R\u001d\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u00087\u00108\u001a\u0004\u00089\u0010:R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008;\u00108R\u001a\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008<\u00108R\u001a\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008=\u00108R\u001a\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008>\u0010?R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u0010AR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008B\u0010CR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010DR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00081\u0010ER\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008F\u0010GR$\u0010N\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008H\u0010I\u001a\u0004\u0008J\u0010K\"\u0004\u0008L\u0010MR%\u0010T\u001a\u0010\u0012\u000c\u0012\n P*\u0004\u0018\u00010)0)0O8\u0006\u00a2\u0006\u000c\n\u0004\u0008J\u0010Q\u001a\u0004\u0008R\u0010SR\u001d\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0O8\u0006\u00a2\u0006\u000c\n\u0004\u00089\u0010Q\u001a\u0004\u0008H\u0010SR\u001d\u0010V\u001a\u0008\u0012\u0004\u0012\u00020\u001a0O8\u0006\u00a2\u0006\u000c\n\u0004\u0008R\u0010Q\u001a\u0004\u0008U\u0010SR\u001d\u0010X\u001a\u0008\u0012\u0004\u0012\u00020\u001a0O8\u0006\u00a2\u0006\u000c\n\u0004\u0008W\u0010Q\u001a\u0004\u0008F\u0010SR%\u0010Z\u001a\u0010\u0012\u000c\u0012\n P*\u0004\u0018\u00010)0)0O8\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010Q\u001a\u0004\u0008Y\u0010SR%\u0010\\\u001a\u0010\u0012\u000c\u0012\n P*\u0004\u0018\u00010)0)0O8\u0006\u00a2\u0006\u000c\n\u0004\u00083\u0010Q\u001a\u0004\u0008[\u0010SR\u001a\u0010`\u001a\u0008\u0012\u0004\u0012\u00020^0]8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008U\u0010_R\u001d\u0010d\u001a\u0008\u0012\u0004\u0012\u00020^0a8\u0006\u00a2\u0006\u000c\n\u0004\u00084\u0010b\u001a\u0004\u0008W\u0010c\u00a8\u0006e"
    }
    d2 = {
        "Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;",
        "Lcom/zykj/base/BaseViewModel;",
        "Landroidx/datastore/core/DataStore;",
        "Lcom/zykj/huiwei/launcher/proto/a;",
        "serverDataStore",
        "Lcom/zykj/huiwei/launcher/proto/m;",
        "userDataStore",
        "Lcom/zykj/huiwei/launcher/proto/d;",
        "settingDataStore",
        "Lcom/zykj/huiwei/launcher/proto/g;",
        "studentDataStore",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/zykj/http/bean/HeaderBean;",
        "headerBeanFlow",
        "Lcom/zykj/huiwei/launcher/repository/AuthRepository;",
        "authRepository",
        "Lw3/b;",
        "gatewayRepository",
        "Lcom/zykj/huiwei/launcher/repository/UserRepository;",
        "userRepository",
        "Lw3/a;",
        "deviceRepository",
        "Landroid/app/Application;",
        "application",
        "<init>",
        "(Landroidx/datastore/core/DataStore;Landroidx/datastore/core/DataStore;Landroidx/datastore/core/DataStore;Landroidx/datastore/core/DataStore;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/huiwei/launcher/repository/AuthRepository;Lw3/b;Lcom/zykj/huiwei/launcher/repository/UserRepository;Lw3/a;Landroid/app/Application;)V",
        "",
        "schoolCode",
        "Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;",
        "h",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loginUrlResp",
        "Lcom/zykj/huiwei/launcher/bean/req/LoginReq;",
        "loginReq",
        "Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;",
        "p",
        "(Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;Lcom/zykj/huiwei/launcher/bean/req/LoginReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loginResp",
        "",
        "z",
        "(Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "needCheckCrack",
        "w",
        "(Lcom/zykj/huiwei/launcher/bean/req/LoginReq;Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "serverUrl",
        "token",
        "y",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "i",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "q",
        "s",
        "v",
        "()V",
        "a",
        "Landroidx/datastore/core/DataStore;",
        "m",
        "()Landroidx/datastore/core/DataStore;",
        "b",
        "c",
        "d",
        "e",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "f",
        "Lcom/zykj/huiwei/launcher/repository/AuthRepository;",
        "g",
        "Lw3/b;",
        "Lcom/zykj/huiwei/launcher/repository/UserRepository;",
        "Lw3/a;",
        "j",
        "Landroid/app/Application;",
        "k",
        "Ljava/lang/String;",
        "l",
        "()Ljava/lang/String;",
        "x",
        "(Ljava/lang/String;)V",
        "schoolId",
        "Landroidx/lifecycle/MutableLiveData;",
        "kotlin.jvm.PlatformType",
        "Landroidx/lifecycle/MutableLiveData;",
        "n",
        "()Landroidx/lifecycle/MutableLiveData;",
        "showLogin",
        "r",
        "userName",
        "o",
        "password",
        "u",
        "isPolicyChecked",
        "t",
        "isLoginSuccess",
        "Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "",
        "Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "_simplePsdShareFlow",
        "Lkotlinx/coroutines/flow/SharedFlow;",
        "Lkotlinx/coroutines/flow/SharedFlow;",
        "()Lkotlinx/coroutines/flow/SharedFlow;",
        "simplePsdShareFlow",
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
        "SMAP\nLoginViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/LoginViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,518:1\n230#2,5:519\n*S KotlinDebug\n*F\n+ 1 LoginViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/LoginViewModel\n*L\n91#1:519,5\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Landroidx/datastore/core/DataStore;

.field public final b:Landroidx/datastore/core/DataStore;

.field public final c:Landroidx/datastore/core/DataStore;

.field public final d:Landroidx/datastore/core/DataStore;

.field public final e:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final f:Lcom/zykj/huiwei/launcher/repository/AuthRepository;

.field public final g:Lw3/b;

.field public final h:Lcom/zykj/huiwei/launcher/repository/UserRepository;

.field public final i:Lw3/a;

.field public final j:Landroid/app/Application;

.field public k:Ljava/lang/String;

.field public final l:Landroidx/lifecycle/MutableLiveData;

.field public final m:Landroidx/lifecycle/MutableLiveData;

.field public final n:Landroidx/lifecycle/MutableLiveData;

.field public final o:Landroidx/lifecycle/MutableLiveData;

.field public final p:Landroidx/lifecycle/MutableLiveData;

.field public final q:Landroidx/lifecycle/MutableLiveData;

.field public final r:Lkotlinx/coroutines/flow/MutableSharedFlow;

.field public final s:Lkotlinx/coroutines/flow/SharedFlow;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/datastore/core/DataStore;Landroidx/datastore/core/DataStore;Landroidx/datastore/core/DataStore;Landroidx/datastore/core/DataStore;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/huiwei/launcher/repository/AuthRepository;Lw3/b;Lcom/zykj/huiwei/launcher/repository/UserRepository;Lw3/a;Landroid/app/Application;)V
    .locals 1

    .line 1
    const-string v0, "serverDataStore"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "userDataStore"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "settingDataStore"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "studentDataStore"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "headerBeanFlow"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "authRepository"

    .line 27
    .line 28
    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v0, "gatewayRepository"

    .line 32
    .line 33
    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v0, "userRepository"

    .line 37
    .line 38
    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-string v0, "deviceRepository"

    .line 42
    .line 43
    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string v0, "application"

    .line 47
    .line 48
    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-direct {p0}, Lcom/zykj/base/BaseViewModel;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->a:Landroidx/datastore/core/DataStore;

    .line 55
    .line 56
    iput-object p2, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->b:Landroidx/datastore/core/DataStore;

    .line 57
    .line 58
    iput-object p3, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->c:Landroidx/datastore/core/DataStore;

    .line 59
    .line 60
    iput-object p4, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->d:Landroidx/datastore/core/DataStore;

    .line 61
    .line 62
    iput-object p5, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->e:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 63
    .line 64
    iput-object p6, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->f:Lcom/zykj/huiwei/launcher/repository/AuthRepository;

    .line 65
    .line 66
    iput-object p7, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->g:Lw3/b;

    .line 67
    .line 68
    iput-object p8, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->h:Lcom/zykj/huiwei/launcher/repository/UserRepository;

    .line 69
    .line 70
    iput-object p9, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->i:Lw3/a;

    .line 71
    .line 72
    iput-object p10, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->j:Landroid/app/Application;

    .line 73
    .line 74
    new-instance p4, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$1;

    .line 75
    .line 76
    const/4 p7, 0x0

    .line 77
    invoke-direct {p4, p0, p7}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$1;-><init>(Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;Lkotlin/coroutines/Continuation;)V

    .line 78
    .line 79
    .line 80
    const/4 p5, 0x3

    .line 81
    const/4 p6, 0x0

    .line 82
    const/4 p2, 0x0

    .line 83
    const/4 p3, 0x0

    .line 84
    move-object p1, p0

    .line 85
    invoke-static/range {p1 .. p6}, Lcom/zykj/base/BaseViewModel;->launch$default(Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 86
    .line 87
    .line 88
    new-instance p2, Landroidx/lifecycle/MutableLiveData;

    .line 89
    .line 90
    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 91
    .line 92
    invoke-direct {p2, p3}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    iput-object p2, p1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->l:Landroidx/lifecycle/MutableLiveData;

    .line 96
    .line 97
    new-instance p2, Landroidx/lifecycle/MutableLiveData;

    .line 98
    .line 99
    invoke-direct {p2}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 100
    .line 101
    .line 102
    iput-object p2, p1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->m:Landroidx/lifecycle/MutableLiveData;

    .line 103
    .line 104
    new-instance p2, Landroidx/lifecycle/MutableLiveData;

    .line 105
    .line 106
    invoke-direct {p2}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 107
    .line 108
    .line 109
    iput-object p2, p1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->n:Landroidx/lifecycle/MutableLiveData;

    .line 110
    .line 111
    new-instance p2, Landroidx/lifecycle/MutableLiveData;

    .line 112
    .line 113
    invoke-direct {p2}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 114
    .line 115
    .line 116
    iput-object p2, p1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->o:Landroidx/lifecycle/MutableLiveData;

    .line 117
    .line 118
    new-instance p2, Landroidx/lifecycle/MutableLiveData;

    .line 119
    .line 120
    invoke-direct {p2, p3}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    iput-object p2, p1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->p:Landroidx/lifecycle/MutableLiveData;

    .line 124
    .line 125
    new-instance p2, Landroidx/lifecycle/MutableLiveData;

    .line 126
    .line 127
    invoke-direct {p2, p3}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    iput-object p2, p1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->q:Landroidx/lifecycle/MutableLiveData;

    .line 131
    .line 132
    const/4 p2, 0x1

    .line 133
    const/4 p3, 0x4

    .line 134
    const/4 p4, 0x0

    .line 135
    invoke-static {p4, p2, p7, p3, p7}, Lkotlinx/coroutines/flow/SharedFlowKt;->MutableSharedFlow$default(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    iput-object p2, p1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->r:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 140
    .line 141
    invoke-static {p2}, Lkotlinx/coroutines/flow/FlowKt;->asSharedFlow(Lkotlinx/coroutines/flow/MutableSharedFlow;)Lkotlinx/coroutines/flow/SharedFlow;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    iput-object p2, p1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->s:Lkotlinx/coroutines/flow/SharedFlow;

    .line 146
    .line 147
    return-void
.end method

.method public static final synthetic a(Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->h(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic b(Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;)Landroid/app/Application;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->j:Landroid/app/Application;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic c(Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;Lcom/zykj/huiwei/launcher/bean/req/LoginReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->p(Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;Lcom/zykj/huiwei/launcher/bean/req/LoginReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic d(Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;)Landroidx/datastore/core/DataStore;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->b:Landroidx/datastore/core/DataStore;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic e(Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;)Lkotlinx/coroutines/flow/MutableSharedFlow;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->r:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic f(Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;Lcom/zykj/huiwei/launcher/bean/req/LoginReq;Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->w(Lcom/zykj/huiwei/launcher/bean/req/LoginReq;Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic g(Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->z(Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final h(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$gatewayBean$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$gatewayBean$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$gatewayBean$1;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$gatewayBean$1;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$gatewayBean$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$gatewayBean$1;-><init>(Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$gatewayBean$1;->b:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$gatewayBean$1;->d:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$gatewayBean$1;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p2, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->g:Lw3/b;

    .line 58
    .line 59
    iput-object p1, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$gatewayBean$1;->a:Ljava/lang/Object;

    .line 60
    .line 61
    iput v3, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$gatewayBean$1;->d:I

    .line 62
    .line 63
    invoke-virtual {p2, p1, v0}, Lw3/b;->a(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    if-ne p2, v1, :cond_3

    .line 68
    .line 69
    return-object v1

    .line 70
    :cond_3
    :goto_1
    check-cast p2, Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;

    .line 71
    .line 72
    invoke-virtual {p2}, Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;->getServer()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    if-eqz v0, :cond_4

    .line 77
    .line 78
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_4

    .line 83
    .line 84
    invoke-virtual {p2, p1}, Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;->setCode(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-object p2

    .line 88
    :cond_4
    new-instance p1, Lcom/zykj/http/exception/RemoteCodeException;

    .line 89
    .line 90
    new-instance v0, Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 91
    .line 92
    const p2, 0x7f110181

    .line 93
    .line 94
    .line 95
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    const/16 v5, 0x8

    .line 100
    .line 101
    const/4 v6, 0x0

    .line 102
    const/4 v1, 0x0

    .line 103
    const-string v2, "\u5b66\u6821\u4ee3\u7801\u9519\u8bef"

    .line 104
    .line 105
    const/4 v4, 0x0

    .line 106
    invoke-direct/range {v0 .. v6}, Lcom/zykj/lib/error/code/ErrorCodeInfo;-><init>(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 107
    .line 108
    .line 109
    invoke-direct {p1, v0}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCodeInfo;)V

    .line 110
    .line 111
    .line 112
    throw p1
.end method

.method public final i(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$getClassName$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$getClassName$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$getClassName$1;->c:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$getClassName$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$getClassName$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$getClassName$1;-><init>(Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$getClassName$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$getClassName$1;->c:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->d:Landroidx/datastore/core/DataStore;

    .line 54
    .line 55
    invoke-interface {p1}, Landroidx/datastore/core/DataStore;->getData()Lkotlinx/coroutines/flow/Flow;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput v3, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$getClassName$1;->c:I

    .line 60
    .line 61
    invoke-static {p1, v0}, Lkotlinx/coroutines/flow/FlowKt;->firstOrNull(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-ne p1, v1, :cond_3

    .line 66
    .line 67
    return-object v1

    .line 68
    :cond_3
    :goto_1
    check-cast p1, Lcom/zykj/huiwei/launcher/proto/g;

    .line 69
    .line 70
    if-eqz p1, :cond_4

    .line 71
    .line 72
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/proto/g;->getGradeName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/proto/g;->getClassName()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    new-instance v1, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v0, "/"

    .line 89
    .line 90
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    return-object p1

    .line 101
    :cond_4
    const/4 p1, 0x0

    .line 102
    return-object p1
.end method

.method public final j()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->o:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->m:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->k:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()Landroidx/datastore/core/DataStore;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->a:Landroidx/datastore/core/DataStore;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->l:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final o()Lkotlinx/coroutines/flow/SharedFlow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->s:Lkotlinx/coroutines/flow/SharedFlow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p(Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;Lcom/zykj/huiwei/launcher/bean/req/LoginReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p3, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$getToken$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$getToken$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$getToken$1;->e:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$getToken$1;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$getToken$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$getToken$1;-><init>(Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$getToken$1;->c:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$getToken$1;->e:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$getToken$1;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Lcom/zykj/huiwei/launcher/bean/req/LoginReq;

    .line 41
    .line 42
    iget-object p1, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$getToken$1;->a:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;

    .line 45
    .line 46
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p1

    .line 58
    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;->getServer()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p3

    .line 65
    if-eqz p3, :cond_5

    .line 66
    .line 67
    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    .line 68
    .line 69
    .line 70
    move-result p3

    .line 71
    if-eqz p3, :cond_5

    .line 72
    .line 73
    iget-object p3, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->f:Lcom/zykj/huiwei/launcher/repository/AuthRepository;

    .line 74
    .line 75
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;->getServer()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    iput-object p1, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$getToken$1;->a:Ljava/lang/Object;

    .line 87
    .line 88
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iput-object p1, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$getToken$1;->b:Ljava/lang/Object;

    .line 93
    .line 94
    iput v3, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$getToken$1;->e:I

    .line 95
    .line 96
    invoke-virtual {p3, v2, p2, v0}, Lcom/zykj/huiwei/launcher/repository/AuthRepository;->a(Ljava/lang/String;Lcom/zykj/huiwei/launcher/bean/req/LoginReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p3

    .line 100
    if-ne p3, v1, :cond_3

    .line 101
    .line 102
    return-object v1

    .line 103
    :cond_3
    :goto_1
    check-cast p3, Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;

    .line 104
    .line 105
    invoke-virtual {p3}, Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;->getRoleType()I

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-ne p1, v3, :cond_4

    .line 110
    .line 111
    return-object p3

    .line 112
    :cond_4
    new-instance p1, Lcom/zykj/http/exception/RemoteCodeException;

    .line 113
    .line 114
    new-instance v0, Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 115
    .line 116
    const p2, 0x7f11001d

    .line 117
    .line 118
    .line 119
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    const/16 v5, 0x8

    .line 124
    .line 125
    const/4 v6, 0x0

    .line 126
    const/4 v1, 0x0

    .line 127
    const-string v2, "\u5b66\u6821\u4ee3\u7801\u9519\u8bef"

    .line 128
    .line 129
    const/4 v4, 0x0

    .line 130
    invoke-direct/range {v0 .. v6}, Lcom/zykj/lib/error/code/ErrorCodeInfo;-><init>(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 131
    .line 132
    .line 133
    invoke-direct {p1, v0}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCodeInfo;)V

    .line 134
    .line 135
    .line 136
    throw p1

    .line 137
    :cond_5
    new-instance p1, Lcom/zykj/http/exception/RemoteCodeException;

    .line 138
    .line 139
    new-instance v0, Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 140
    .line 141
    const p2, 0x7f110181

    .line 142
    .line 143
    .line 144
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    const/16 v5, 0x8

    .line 149
    .line 150
    const/4 v6, 0x0

    .line 151
    const/4 v1, 0x0

    .line 152
    const-string v2, "\u5b66\u6821\u4ee3\u7801\u9519\u8bef"

    .line 153
    .line 154
    const/4 v4, 0x0

    .line 155
    invoke-direct/range {v0 .. v6}, Lcom/zykj/lib/error/code/ErrorCodeInfo;-><init>(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 156
    .line 157
    .line 158
    invoke-direct {p1, v0}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCodeInfo;)V

    .line 159
    .line 160
    .line 161
    throw p1
.end method

.method public final q(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->n:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final r()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->n:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$getUsername$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$getUsername$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$getUsername$1;->c:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$getUsername$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$getUsername$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$getUsername$1;-><init>(Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$getUsername$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$getUsername$1;->c:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->b:Landroidx/datastore/core/DataStore;

    .line 54
    .line 55
    invoke-interface {p1}, Landroidx/datastore/core/DataStore;->getData()Lkotlinx/coroutines/flow/Flow;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput v3, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$getUsername$1;->c:I

    .line 60
    .line 61
    invoke-static {p1, v0}, Lkotlinx/coroutines/flow/FlowKt;->firstOrNull(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-ne p1, v1, :cond_3

    .line 66
    .line 67
    return-object v1

    .line 68
    :cond_3
    :goto_1
    check-cast p1, Lcom/zykj/huiwei/launcher/proto/m;

    .line 69
    .line 70
    if-eqz p1, :cond_4

    .line 71
    .line 72
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/proto/m;->getRealName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    return-object p1

    .line 77
    :cond_4
    const/4 p1, 0x0

    .line 78
    return-object p1
.end method

.method public final t()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->q:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final u()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->p:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final v()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$login$1;-><init>(Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;Lkotlin/coroutines/Continuation;)V

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

.method public final w(Lcom/zykj/huiwei/launcher/bean/req/LoginReq;Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p5, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$1;->g:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$1;->g:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p5}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$1;-><init>(Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p5, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$1;->e:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$1;->g:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x3

    .line 35
    const/4 v5, 0x2

    .line 36
    const/4 v6, 0x1

    .line 37
    if-eqz v2, :cond_4

    .line 38
    .line 39
    if-eq v2, v6, :cond_3

    .line 40
    .line 41
    if-eq v2, v5, :cond_2

    .line 42
    .line 43
    if-ne v2, v4, :cond_1

    .line 44
    .line 45
    iget-object p1, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$1;->c:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;

    .line 48
    .line 49
    iget-object p2, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$1;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p2, Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;

    .line 52
    .line 53
    iget-object p3, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$1;->a:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p3, Lcom/zykj/huiwei/launcher/bean/req/LoginReq;

    .line 56
    .line 57
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto/16 :goto_4

    .line 61
    .line 62
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 63
    .line 64
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 65
    .line 66
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw p1

    .line 70
    :cond_2
    iget-boolean p1, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$1;->d:Z

    .line 71
    .line 72
    iget-object p2, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$1;->c:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p2, Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;

    .line 75
    .line 76
    iget-object p3, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$1;->b:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p3, Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;

    .line 79
    .line 80
    iget-object p4, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$1;->a:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p4, Lcom/zykj/huiwei/launcher/bean/req/LoginReq;

    .line 83
    .line 84
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    iget-boolean p4, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$1;->d:Z

    .line 89
    .line 90
    iget-object p1, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$1;->c:Ljava/lang/Object;

    .line 91
    .line 92
    move-object p3, p1

    .line 93
    check-cast p3, Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;

    .line 94
    .line 95
    iget-object p1, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$1;->b:Ljava/lang/Object;

    .line 96
    .line 97
    move-object p2, p1

    .line 98
    check-cast p2, Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;

    .line 99
    .line 100
    iget-object p1, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$1;->a:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast p1, Lcom/zykj/huiwei/launcher/bean/req/LoginReq;

    .line 103
    .line 104
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_4
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    iget-object p5, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->a:Landroidx/datastore/core/DataStore;

    .line 112
    .line 113
    new-instance v2, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$2;

    .line 114
    .line 115
    invoke-direct {v2, p2, p3, v3}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$2;-><init>(Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;Lkotlin/coroutines/Continuation;)V

    .line 116
    .line 117
    .line 118
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    iput-object v7, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$1;->a:Ljava/lang/Object;

    .line 123
    .line 124
    iput-object p2, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$1;->b:Ljava/lang/Object;

    .line 125
    .line 126
    iput-object p3, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$1;->c:Ljava/lang/Object;

    .line 127
    .line 128
    iput-boolean p4, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$1;->d:Z

    .line 129
    .line 130
    iput v6, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$1;->g:I

    .line 131
    .line 132
    invoke-interface {p5, v2, v0}, Landroidx/datastore/core/DataStore;->updateData(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p5

    .line 136
    if-ne p5, v1, :cond_5

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_5
    :goto_1
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p5

    .line 143
    iput-object p5, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$1;->a:Ljava/lang/Object;

    .line 144
    .line 145
    iput-object p2, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$1;->b:Ljava/lang/Object;

    .line 146
    .line 147
    iput-object p3, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$1;->c:Ljava/lang/Object;

    .line 148
    .line 149
    iput-boolean p4, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$1;->d:Z

    .line 150
    .line 151
    iput v5, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$1;->g:I

    .line 152
    .line 153
    invoke-virtual {p0, p2, p3, v0}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->z(Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p5

    .line 157
    if-ne p5, v1, :cond_6

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_6
    move v8, p4

    .line 161
    move-object p4, p1

    .line 162
    move p1, v8

    .line 163
    move-object v8, p3

    .line 164
    move-object p3, p2

    .line 165
    move-object p2, v8

    .line 166
    :goto_2
    iget-object p5, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->c:Landroidx/datastore/core/DataStore;

    .line 167
    .line 168
    new-instance v2, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$3;

    .line 169
    .line 170
    invoke-direct {v2, p1, v3}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$3;-><init>(ZLkotlin/coroutines/Continuation;)V

    .line 171
    .line 172
    .line 173
    invoke-static {p4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object p4

    .line 177
    iput-object p4, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$1;->a:Ljava/lang/Object;

    .line 178
    .line 179
    iput-object p3, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$1;->b:Ljava/lang/Object;

    .line 180
    .line 181
    iput-object p2, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$1;->c:Ljava/lang/Object;

    .line 182
    .line 183
    iput-boolean p1, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$1;->d:Z

    .line 184
    .line 185
    iput v4, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$loginSuccess$1;->g:I

    .line 186
    .line 187
    invoke-interface {p5, v2, v0}, Landroidx/datastore/core/DataStore;->updateData(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    if-ne p1, v1, :cond_7

    .line 192
    .line 193
    :goto_3
    return-object v1

    .line 194
    :cond_7
    move-object p1, p2

    .line 195
    move-object p2, p3

    .line 196
    :goto_4
    sget-object p3, Lcom/zykj/message/server/MessageManage;->a:Lcom/zykj/message/server/MessageManage;

    .line 197
    .line 198
    new-instance v0, Lcom/zykj/message/server/bean/ServerInfo;

    .line 199
    .line 200
    sget-object v1, Lcom/zykj/message/server/bean/Status;->b:Lcom/zykj/message/server/bean/Status;

    .line 201
    .line 202
    invoke-virtual {p2}, Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;->getServer()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;->getAccessToken()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;->getRongCloudToken()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    const-string p4, ""

    .line 215
    .line 216
    if-nez p1, :cond_8

    .line 217
    .line 218
    move-object v4, p4

    .line 219
    goto :goto_5

    .line 220
    :cond_8
    move-object v4, p1

    .line 221
    :goto_5
    invoke-virtual {p2}, Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;->getWebServer()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    if-nez p1, :cond_9

    .line 226
    .line 227
    move-object v5, p4

    .line 228
    goto :goto_6

    .line 229
    :cond_9
    move-object v5, p1

    .line 230
    :goto_6
    invoke-direct/range {v0 .. v5}, Lcom/zykj/message/server/bean/ServerInfo;-><init>(Lcom/zykj/message/server/bean/Status;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p3, v0}, Lcom/zykj/message/server/MessageManage;->c(Lcom/zykj/message/server/bean/ServerInfo;)V

    .line 234
    .line 235
    .line 236
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->q:Landroidx/lifecycle/MutableLiveData;

    .line 237
    .line 238
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 239
    .line 240
    .line 241
    move-result-object p2

    .line 242
    invoke-virtual {p1, p2}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 246
    .line 247
    return-object p1
.end method

.method public final x(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->k:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final y(Ljava/lang/String;Ljava/lang/String;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->e:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    :goto_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, Lcom/zykj/http/bean/HeaderBean;

    .line 9
    .line 10
    const/16 v8, 0x13

    .line 11
    .line 12
    const/4 v9, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v7, 0x0

    .line 16
    move-object v5, p1

    .line 17
    move-object v6, p2

    .line 18
    invoke-static/range {v2 .. v9}, Lcom/zykj/http/bean/HeaderBean;->copy$default(Lcom/zykj/http/bean/HeaderBean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/zykj/http/bean/HeaderBean;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {v0, v1, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    move-object p1, v5

    .line 30
    move-object p2, v6

    .line 31
    goto :goto_0
.end method

.method public final z(Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p3, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$updateUserCache$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$updateUserCache$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$updateUserCache$1;->f:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$updateUserCache$1;->f:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$updateUserCache$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$updateUserCache$1;-><init>(Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$updateUserCache$1;->d:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$updateUserCache$1;->f:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x3

    .line 35
    const/4 v5, 0x2

    .line 36
    const/4 v6, 0x1

    .line 37
    if-eqz v2, :cond_4

    .line 38
    .line 39
    if-eq v2, v6, :cond_3

    .line 40
    .line 41
    if-eq v2, v5, :cond_2

    .line 42
    .line 43
    if-ne v2, v4, :cond_1

    .line 44
    .line 45
    iget-object p1, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$updateUserCache$1;->c:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, Lcom/zykj/huiwei/launcher/bean/StudentInfoBean;

    .line 48
    .line 49
    iget-object p1, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$updateUserCache$1;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p1, Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;

    .line 52
    .line 53
    iget-object p1, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$updateUserCache$1;->a:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;

    .line 56
    .line 57
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto/16 :goto_4

    .line 61
    .line 62
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 63
    .line 64
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 65
    .line 66
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw p1

    .line 70
    :cond_2
    iget-object p1, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$updateUserCache$1;->c:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p1, Lcom/zykj/huiwei/launcher/bean/StudentInfoBean;

    .line 73
    .line 74
    iget-object p2, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$updateUserCache$1;->b:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p2, Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;

    .line 77
    .line 78
    iget-object v2, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$updateUserCache$1;->a:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v2, Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;

    .line 81
    .line 82
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_3
    iget-object p1, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$updateUserCache$1;->b:Ljava/lang/Object;

    .line 87
    .line 88
    move-object p2, p1

    .line 89
    check-cast p2, Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;

    .line 90
    .line 91
    iget-object p1, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$updateUserCache$1;->a:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast p1, Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;

    .line 94
    .line 95
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_4
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/bean/resp/GatewayBean;->getServer()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p3

    .line 106
    invoke-virtual {p2}, Lcom/zykj/huiwei/launcher/bean/resp/LoginResp;->getAccessToken()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-virtual {p0, p3, v2}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    iget-object p3, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->h:Lcom/zykj/huiwei/launcher/repository/UserRepository;

    .line 114
    .line 115
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    iput-object v2, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$updateUserCache$1;->a:Ljava/lang/Object;

    .line 120
    .line 121
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    iput-object v2, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$updateUserCache$1;->b:Ljava/lang/Object;

    .line 126
    .line 127
    iput v6, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$updateUserCache$1;->f:I

    .line 128
    .line 129
    invoke-virtual {p3, v0}, Lcom/zykj/huiwei/launcher/repository/UserRepository;->e(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p3

    .line 133
    if-ne p3, v1, :cond_5

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_5
    :goto_1
    check-cast p3, Lcom/zykj/huiwei/launcher/bean/StudentInfoBean;

    .line 137
    .line 138
    iget-object v2, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->b:Landroidx/datastore/core/DataStore;

    .line 139
    .line 140
    new-instance v6, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$updateUserCache$2;

    .line 141
    .line 142
    invoke-direct {v6, p3, v3}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$updateUserCache$2;-><init>(Lcom/zykj/huiwei/launcher/bean/StudentInfoBean;Lkotlin/coroutines/Continuation;)V

    .line 143
    .line 144
    .line 145
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    iput-object v7, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$updateUserCache$1;->a:Ljava/lang/Object;

    .line 150
    .line 151
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    iput-object v7, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$updateUserCache$1;->b:Ljava/lang/Object;

    .line 156
    .line 157
    iput-object p3, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$updateUserCache$1;->c:Ljava/lang/Object;

    .line 158
    .line 159
    iput v5, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$updateUserCache$1;->f:I

    .line 160
    .line 161
    invoke-interface {v2, v6, v0}, Landroidx/datastore/core/DataStore;->updateData(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    if-ne v2, v1, :cond_6

    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_6
    move-object v2, p1

    .line 169
    move-object p1, p3

    .line 170
    :goto_2
    iget-object p3, p0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;->d:Landroidx/datastore/core/DataStore;

    .line 171
    .line 172
    new-instance v5, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$updateUserCache$3;

    .line 173
    .line 174
    invoke-direct {v5, p1, v3}, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$updateUserCache$3;-><init>(Lcom/zykj/huiwei/launcher/bean/StudentInfoBean;Lkotlin/coroutines/Continuation;)V

    .line 175
    .line 176
    .line 177
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    iput-object v2, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$updateUserCache$1;->a:Ljava/lang/Object;

    .line 182
    .line 183
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p2

    .line 187
    iput-object p2, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$updateUserCache$1;->b:Ljava/lang/Object;

    .line 188
    .line 189
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    iput-object p1, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$updateUserCache$1;->c:Ljava/lang/Object;

    .line 194
    .line 195
    iput v4, v0, Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel$updateUserCache$1;->f:I

    .line 196
    .line 197
    invoke-interface {p3, v5, v0}, Landroidx/datastore/core/DataStore;->updateData(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    if-ne p1, v1, :cond_7

    .line 202
    .line 203
    :goto_3
    return-object v1

    .line 204
    :cond_7
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 205
    .line 206
    return-object p1
.end method
