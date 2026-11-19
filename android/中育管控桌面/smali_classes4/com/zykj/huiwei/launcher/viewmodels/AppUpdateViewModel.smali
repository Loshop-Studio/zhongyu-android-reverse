.class public final Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;
.super Lcom/zykj/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u0007\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\t\u0008\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\t\u0010\u0008J\u0015\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000e\u0010\rJ\r\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0012\u0010\u0003J\u001d\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u001d\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u001b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u001d\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u001b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u001c\u001a\u0004\u0008 \u0010\u001eR\u001d\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u001b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u001c\u001a\u0004\u0008\"\u0010\u001eR\u001d\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u001b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u001c\u001a\u0004\u0008$\u0010\u001eR\u001d\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u001b8\u0006\u00a2\u0006\u000c\n\u0004\u0008&\u0010\u001c\u001a\u0004\u0008\'\u0010\u001eR%\u0010+\u001a\u0010\u0012\u000c\u0012\n )*\u0004\u0018\u00010\u000f0\u000f0\u001b8\u0006\u00a2\u0006\u000c\n\u0004\u0008$\u0010\u001c\u001a\u0004\u0008*\u0010\u001eR%\u0010.\u001a\u0010\u0012\u000c\u0012\n )*\u0004\u0018\u00010,0,0\u001b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\'\u0010\u001c\u001a\u0004\u0008-\u0010\u001eR%\u00100\u001a\u0010\u0012\u000c\u0012\n )*\u0004\u0018\u00010\u000f0\u000f0\u001b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\u001c\u001a\u0004\u0008/\u0010\u001eR%\u00103\u001a\u0010\u0012\u000c\u0012\n )*\u0004\u0018\u00010\u000f0\u000f0\u001b8\u0006\u00a2\u0006\u000c\n\u0004\u00081\u0010\u001c\u001a\u0004\u00082\u0010\u001eR%\u00105\u001a\u0010\u0012\u000c\u0012\n )*\u0004\u0018\u00010\u000f0\u000f0\u001b8\u0006\u00a2\u0006\u000c\n\u0004\u0008-\u0010\u001c\u001a\u0004\u00084\u0010\u001eR%\u00108\u001a\u0010\u0012\u000c\u0012\n )*\u0004\u0018\u00010\u000f0\u000f0\u001b8\u0006\u00a2\u0006\u000c\n\u0004\u00086\u0010\u001c\u001a\u0004\u00087\u0010\u001eR\u001d\u0010;\u001a\u0008\u0012\u0004\u0012\u0002090\u001b8\u0006\u00a2\u0006\u000c\n\u0004\u0008:\u0010\u001c\u001a\u0004\u00086\u0010\u001eR\u001d\u0010<\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u001b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001c\u001a\u0004\u00081\u0010\u001eR\u001f\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130=8\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010>\u001a\u0004\u0008&\u0010?R\u001d\u0010D\u001a\u0008\u0012\u0004\u0012\u00020\u000f0A8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010B\u001a\u0004\u0008:\u0010CR\u0014\u0010G\u001a\u00020E8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010F\u00a8\u0006H"
    }
    d2 = {
        "Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;",
        "Lcom/zykj/base/BaseViewModel;",
        "<init>",
        "()V",
        "Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;",
        "versionInfo",
        "",
        "w",
        "(Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;)V",
        "a",
        "Landroid/app/Activity;",
        "activity",
        "c",
        "(Landroid/app/Activity;)V",
        "d",
        "",
        "p",
        "()Z",
        "v",
        "Lo1/a;",
        "iCheckAppUpdate",
        "",
        "packageName",
        "b",
        "(Lo1/a;Ljava/lang/String;)V",
        "o",
        "(Ljava/lang/String;)V",
        "Landroidx/lifecycle/MutableLiveData;",
        "Landroidx/lifecycle/MutableLiveData;",
        "m",
        "()Landroidx/lifecycle/MutableLiveData;",
        "title",
        "n",
        "version",
        "h",
        "content",
        "f",
        "cancel",
        "e",
        "g",
        "confirm",
        "kotlin.jvm.PlatformType",
        "u",
        "isShowProgress",
        "",
        "j",
        "progress",
        "t",
        "isShowContent",
        "i",
        "r",
        "isShowClose",
        "q",
        "isShowCancel",
        "k",
        "s",
        "isShowConfirm",
        "Ljava/util/UUID;",
        "l",
        "requestId",
        "downloadSuccess",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "()Lkotlinx/coroutines/flow/MutableStateFlow;",
        "appStoreService",
        "Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "()Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "showUpdateSharedFlow",
        "Landroid/content/ServiceConnection;",
        "Landroid/content/ServiceConnection;",
        "connection",
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
        "SMAP\nAppUpdateViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppUpdateViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,163:1\n49#2:164\n51#2:168\n46#3:165\n51#3:167\n105#4:166\n*S KotlinDebug\n*F\n+ 1 AppUpdateViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel\n*L\n68#1:164\n68#1:168\n68#1:165\n68#1:167\n68#1:166\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Landroidx/lifecycle/MutableLiveData;

.field public final b:Landroidx/lifecycle/MutableLiveData;

.field public final c:Landroidx/lifecycle/MutableLiveData;

.field public final d:Landroidx/lifecycle/MutableLiveData;

.field public final e:Landroidx/lifecycle/MutableLiveData;

.field public final f:Landroidx/lifecycle/MutableLiveData;

.field public final g:Landroidx/lifecycle/MutableLiveData;

.field public final h:Landroidx/lifecycle/MutableLiveData;

.field public final i:Landroidx/lifecycle/MutableLiveData;

.field public final j:Landroidx/lifecycle/MutableLiveData;

.field public final k:Landroidx/lifecycle/MutableLiveData;

.field public final l:Landroidx/lifecycle/MutableLiveData;

.field public final m:Landroidx/lifecycle/MutableLiveData;

.field public final n:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final o:Lkotlinx/coroutines/flow/MutableSharedFlow;

.field public final p:Landroid/content/ServiceConnection;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/zykj/base/BaseViewModel;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 5
    .line 6
    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->a:Landroidx/lifecycle/MutableLiveData;

    .line 10
    .line 11
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 12
    .line 13
    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->b:Landroidx/lifecycle/MutableLiveData;

    .line 17
    .line 18
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 19
    .line 20
    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->c:Landroidx/lifecycle/MutableLiveData;

    .line 24
    .line 25
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 26
    .line 27
    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->d:Landroidx/lifecycle/MutableLiveData;

    .line 31
    .line 32
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 33
    .line 34
    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->e:Landroidx/lifecycle/MutableLiveData;

    .line 38
    .line 39
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 40
    .line 41
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 42
    .line 43
    invoke-direct {v0, v1}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->f:Landroidx/lifecycle/MutableLiveData;

    .line 47
    .line 48
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-direct {v0, v1}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->g:Landroidx/lifecycle/MutableLiveData;

    .line 59
    .line 60
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 61
    .line 62
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 63
    .line 64
    invoke-direct {v0, v1}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->h:Landroidx/lifecycle/MutableLiveData;

    .line 68
    .line 69
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 70
    .line 71
    invoke-direct {v0, v1}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->i:Landroidx/lifecycle/MutableLiveData;

    .line 75
    .line 76
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 77
    .line 78
    invoke-direct {v0, v1}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->j:Landroidx/lifecycle/MutableLiveData;

    .line 82
    .line 83
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 84
    .line 85
    invoke-direct {v0, v1}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->k:Landroidx/lifecycle/MutableLiveData;

    .line 89
    .line 90
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 91
    .line 92
    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 93
    .line 94
    .line 95
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->l:Landroidx/lifecycle/MutableLiveData;

    .line 96
    .line 97
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 98
    .line 99
    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 100
    .line 101
    .line 102
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->m:Landroidx/lifecycle/MutableLiveData;

    .line 103
    .line 104
    const/4 v0, 0x0

    .line 105
    invoke-static {v0}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    iput-object v1, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->n:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 110
    .line 111
    const/4 v1, 0x0

    .line 112
    const/4 v2, 0x7

    .line 113
    invoke-static {v1, v1, v0, v2, v0}, Lkotlinx/coroutines/flow/SharedFlowKt;->MutableSharedFlow$default(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->o:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 118
    .line 119
    new-instance v0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$a;

    .line 120
    .line 121
    invoke-direct {v0, p0}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$a;-><init>(Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;)V

    .line 122
    .line 123
    .line 124
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->p:Landroid/content/ServiceConnection;

    .line 125
    .line 126
    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;)V
    .locals 10

    .line 1
    const-string v0, "versionInfo"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkDownloadSuccess$1;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p1, v1}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkDownloadSuccess$1;-><init>(Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;Lkotlin/coroutines/Continuation;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lkotlinx/coroutines/flow/FlowKt;->flow(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    new-instance v7, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkDownloadSuccess$2;

    .line 17
    .line 18
    invoke-direct {v7, p0, v1}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkDownloadSuccess$2;-><init>(Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;Lkotlin/coroutines/Continuation;)V

    .line 19
    .line 20
    .line 21
    const/16 v8, 0xe

    .line 22
    .line 23
    const/4 v9, 0x0

    .line 24
    const/4 v4, 0x0

    .line 25
    const/4 v5, 0x0

    .line 26
    const/4 v6, 0x0

    .line 27
    move-object v2, p0

    .line 28
    invoke-static/range {v2 .. v9}, Lcom/zykj/huiwei/launcher/ext/ViewModelExtKt;->g(Lcom/zykj/base/BaseViewModel;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final b(Lo1/a;Ljava/lang/String;)V
    .locals 7

    .line 1
    const-string v0, "iCheckAppUpdate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "packageName"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    new-instance v4, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkUpdate$1;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-direct {v4, p1, p2, p0, v0}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkUpdate$1;-><init>(Lo1/a;Ljava/lang/String;Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    const/4 v5, 0x2

    .line 26
    const/4 v6, 0x0

    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final c(Landroid/app/Activity;)V
    .locals 3

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->p()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Landroid/content/Intent;

    .line 13
    .line 14
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v1, "cn.com.techvision.appstore"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 20
    .line 21
    .line 22
    const-string v1, "cn.com.techvision.appstore.action.CHECK_UPDATE_SERVICE"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->p:Landroid/content/ServiceConnection;

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    invoke-virtual {p1, v0, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
.end method

.method public final d(Landroid/app/Activity;)V
    .locals 1

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->p()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->p:Landroid/content/ServiceConnection;

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final e()Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->n:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->d:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->e:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->c:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->m:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->g:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->l:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()Lkotlinx/coroutines/flow/MutableSharedFlow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->o:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->a:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->b:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final o(Ljava/lang/String;)V
    .locals 7

    .line 1
    const-string v0, "packageName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    new-instance v4, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$gotoUpdate$1;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {v4, p0, p1, v0}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$gotoUpdate$1;-><init>(Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 18
    .line 19
    .line 20
    const/4 v5, 0x2

    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final p()Z
    .locals 2

    .line 1
    sget-object v0, Li4/g;->a:Li4/g$a;

    .line 2
    .line 3
    const-string v1, "cn.com.techvision.appstore"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Li4/g$a;->f(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final q()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->j:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->i:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->k:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->h:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final u()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->f:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final v()V
    .locals 0

    .line 1
    return-void
.end method

.method public final w(Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;)V
    .locals 9

    .line 1
    const-string v0, "versionInfo"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lkotlinx/coroutines/flow/FlowKt;->flowOf(Ljava/lang/Object;)Lkotlinx/coroutines/flow/Flow;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v2, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1;

    .line 11
    .line 12
    invoke-direct {v2, v0, p1, p0}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1;-><init>(Lkotlinx/coroutines/flow/Flow;Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;)V

    .line 13
    .line 14
    .line 15
    const/16 v7, 0x1e

    .line 16
    .line 17
    const/4 v8, 0x0

    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v5, 0x0

    .line 21
    const/4 v6, 0x0

    .line 22
    move-object v1, p0

    .line 23
    invoke-static/range {v1 .. v8}, Lcom/zykj/huiwei/launcher/ext/ViewModelExtKt;->e(Lcom/zykj/base/BaseViewModel;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
