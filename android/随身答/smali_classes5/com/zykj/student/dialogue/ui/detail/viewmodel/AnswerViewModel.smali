# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class public final Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;
.super Lcom/zykj/student/dialogue/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0007\u0018\u00002\u00020\u0001B)\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0008\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001e\u00a2\u0006\u0004\u0008 \u0010!J\u0015\u0010$\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"\u00a2\u0006\u0004\u0008$\u0010%J\u0015\u0010\'\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u001a\u00a2\u0006\u0004\u0008\'\u0010(J\r\u0010)\u001a\u00020\r\u00a2\u0006\u0004\u0008)\u0010*J\u0015\u0010-\u001a\u00020\r2\u0006\u0010,\u001a\u00020+\u00a2\u0006\u0004\u0008-\u0010.J\u0015\u0010/\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008/\u00100J\u001a\u00102\u001a\u00020\r2\u0008\u0008\u0002\u00101\u001a\u00020\u001aH\u0086@\u00a2\u0006\u0004\u00082\u00103J\r\u00104\u001a\u00020\r\u00a2\u0006\u0004\u00084\u0010*J\r\u00105\u001a\u00020\r\u00a2\u0006\u0004\u00085\u0010*J\u0015\u00107\u001a\u00020\r2\u0006\u00106\u001a\u00020\u001a\u00a2\u0006\u0004\u00087\u0010(J\r\u00108\u001a\u00020\r\u00a2\u0006\u0004\u00088\u0010*J)\u0010;\u001a\u00020\r2\u000c\u0010:\u001a\u0008\u0012\u0004\u0012\u00020\r092\u000c\u0010,\u001a\u0008\u0012\u0004\u0012\u00020\r09\u00a2\u0006\u0004\u0008;\u0010<R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008=\u0010>R\u001c\u0010\u0008\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008?\u0010@R\u001a\u0010E\u001a\u0008\u0012\u0004\u0012\u00020B0A8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008C\u0010DR\u001a\u0010G\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008F\u0010@R\u001d\u0010M\u001a\u0008\u0012\u0004\u0012\u00020\u001a0H8\u0006\u00a2\u0006\u000c\n\u0004\u0008I\u0010J\u001a\u0004\u0008K\u0010LR\u0017\u0010R\u001a\u00020\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008N\u0010O\u001a\u0004\u0008P\u0010QR$\u0010\u0019\u001a\u00020\u00142\u0006\u0010S\u001a\u00020\u00148\u0006@BX\u0086.\u00a2\u0006\u000c\n\u0004\u0008T\u0010O\u001a\u0004\u0008U\u0010QR\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008V\u0010W\u001a\u0004\u0008X\u0010Y\"\u0004\u0008Z\u0010(R$\u0010`\u001a\u00020[2\u0006\u0010S\u001a\u00020[8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\\\u0010]\u001a\u0004\u0008^\u0010_R\u001c\u0010c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010a0\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008b\u0010@R\u001f\u0010f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010a0H8\u0006\u00a2\u0006\u000c\n\u0004\u0008d\u0010J\u001a\u0004\u0008e\u0010LR\u001a\u0010h\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008g\u0010@R\u001d\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0H8\u0006\u00a2\u0006\u000c\n\u0004\u0008i\u0010J\u001a\u0004\u0008j\u0010LR\u001a\u0010n\u001a\u0008\u0012\u0004\u0012\u00020\u00100k8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008l\u0010mR\u001d\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100o8\u0006\u00a2\u0006\u000c\n\u0004\u0008p\u0010q\u001a\u0004\u0008r\u0010sR\u001a\u0010u\u001a\u0008\u0012\u0004\u0012\u00020\u001a0k8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008t\u0010mR\u001d\u0010y\u001a\u0008\u0012\u0004\u0012\u00020\u001a0k8\u0006\u00a2\u0006\u000c\n\u0004\u0008v\u0010m\u001a\u0004\u0008w\u0010xR\u001d\u0010{\u001a\u0008\u0012\u0004\u0012\u00020\u001a0H8\u0006\u00a2\u0006\u000c\n\u0004\u0008z\u0010J\u001a\u0004\u0008{\u0010L\u00a8\u0006|"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;",
        "Lcom/zykj/student/dialogue/base/BaseViewModel;",
        "Lk6/g;",
        "dialogueApi",
        "Landroid/app/Application;",
        "application",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/zykj/message/server/bean/UserInfo;",
        "userInfoFlow",
        "<init>",
        "(Lk6/g;Landroid/app/Application;Lkotlinx/coroutines/flow/MutableStateFlow;)V",
        "Lp6/k;",
        "viewState",
        "",
        "y",
        "(Lp6/k;)V",
        "Lcom/zykj/student/dialogue/ui/detail/viewmodel/b;",
        "event",
        "x",
        "(Lcom/zykj/student/dialogue/ui/detail/viewmodel/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "sessionId",
        "P",
        "(Ljava/lang/String;)V",
        "J",
        "questionId",
        "",
        "fromCollectHistory",
        "R",
        "(Ljava/lang/String;Z)V",
        "",
        "videoProgress",
        "V",
        "(I)V",
        "",
        "speedRate",
        "U",
        "(D)V",
        "resumePlaying",
        "S",
        "(Z)V",
        "O",
        "()V",
        "Lcom/zykj/student/dialogue/ui/detail/viewmodel/a;",
        "action",
        "w",
        "(Lcom/zykj/student/dialogue/ui/detail/viewmodel/a;)V",
        "M",
        "(Lcom/zykj/student/dialogue/ui/detail/viewmodel/b;)V",
        "selectLast",
        "D",
        "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "T",
        "W",
        "understood",
        "X",
        "Q",
        "Lkotlin/Function0;",
        "onShowDialog",
        "N",
        "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V",
        "c",
        "Lk6/g;",
        "d",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Landroidx/datastore/core/DataStore;",
        "Landroidx/datastore/preferences/core/Preferences;",
        "e",
        "Landroidx/datastore/core/DataStore;",
        "dataStore",
        "f",
        "_hasChanged",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "g",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "C",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "hasChanged",
        "h",
        "Ljava/lang/String;",
        "A",
        "()Ljava/lang/String;",
        "filePrefixPath",
        "value",
        "i",
        "I",
        "j",
        "Z",
        "B",
        "()Z",
        "setFromCollectHistory",
        "Lp6/j;",
        "k",
        "Lp6/j;",
        "G",
        "()Lp6/j;",
        "playInfo",
        "Lcom/zykj/student/dialogue/bean/resp/QuestionResp;",
        "l",
        "_questionBean",
        "m",
        "H",
        "questionBean",
        "n",
        "_viewState",
        "o",
        "K",
        "Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "p",
        "Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "_event",
        "Lkotlinx/coroutines/flow/SharedFlow;",
        "q",
        "Lkotlinx/coroutines/flow/SharedFlow;",
        "z",
        "()Lkotlinx/coroutines/flow/SharedFlow;",
        "r",
        "_isPermit",
        "s",
        "L",
        "()Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "isPermit",
        "t",
        "isNoRemind",
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
        "SMAP\nAnswerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnswerViewModel.kt\ncom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,529:1\n774#2:530\n865#2,2:531\n*S KotlinDebug\n*F\n+ 1 AnswerViewModel.kt\ncom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel\n*L\n231#1:530\n231#1:531,2\n*E\n"
    }
.end annotation


# instance fields
.field public final c:Lk6/g;

.field public final d:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final e:Landroidx/datastore/core/DataStore;

.field public final f:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final g:Lkotlinx/coroutines/flow/StateFlow;

.field public final h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Z

.field public k:Lp6/j;

.field public final l:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final m:Lkotlinx/coroutines/flow/StateFlow;

.field public final n:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final o:Lkotlinx/coroutines/flow/StateFlow;

.field public final p:Lkotlinx/coroutines/flow/MutableSharedFlow;

.field public final q:Lkotlinx/coroutines/flow/SharedFlow;

.field public final r:Lkotlinx/coroutines/flow/MutableSharedFlow;

.field public final s:Lkotlinx/coroutines/flow/MutableSharedFlow;

.field public final t:Lkotlinx/coroutines/flow/StateFlow;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lk6/g;Landroid/app/Application;Lkotlinx/coroutines/flow/MutableStateFlow;)V
    .locals 12

    .line 1
    const-string v0, "dialogueApi"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "application"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "userInfoFlow"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lcom/zykj/student/dialogue/base/BaseViewModel;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->c:Lk6/g;

    .line 20
    .line 21
    iput-object p3, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->d:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 22
    .line 23
    invoke-static {p2}, Li6/b;->c(Landroid/content/Context;)Landroidx/datastore/core/DataStore;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->e:Landroidx/datastore/core/DataStore;

    .line 28
    .line 29
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-static {v0}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iput-object v1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->f:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 36
    .line 37
    invoke-static {v1}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iput-object v1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->g:Lkotlinx/coroutines/flow/StateFlow;

    .line 42
    .line 43
    invoke-virtual {p2}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    const/4 v1, 0x0

    .line 48
    if-eqz p2, :cond_0

    .line 49
    .line 50
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    move-object p2, v1

    .line 56
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string p2, "/Dialogue/lesson/"

    .line 65
    .line 66
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    iput-object p2, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->h:Ljava/lang/String;

    .line 74
    .line 75
    new-instance v2, Lp6/j;

    .line 76
    .line 77
    const/4 v7, 0x7

    .line 78
    const/4 v8, 0x0

    .line 79
    const/4 v3, 0x0

    .line 80
    const/4 v4, 0x0

    .line 81
    const-wide/16 v5, 0x0

    .line 82
    .line 83
    invoke-direct/range {v2 .. v8}, Lp6/j;-><init>(IZDILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 84
    .line 85
    .line 86
    iput-object v2, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->k:Lp6/j;

    .line 87
    .line 88
    invoke-static {v1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    iput-object p2, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->l:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 93
    .line 94
    invoke-static {p2}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    iput-object p2, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->m:Lkotlinx/coroutines/flow/StateFlow;

    .line 99
    .line 100
    new-instance v2, Lp6/k;

    .line 101
    .line 102
    const/16 v10, 0x3f

    .line 103
    .line 104
    const/4 v11, 0x0

    .line 105
    const/4 v3, 0x0

    .line 106
    const/4 v5, 0x0

    .line 107
    const/4 v6, 0x0

    .line 108
    const-wide/16 v7, 0x0

    .line 109
    .line 110
    const/4 v9, 0x0

    .line 111
    invoke-direct/range {v2 .. v11}, Lp6/k;-><init>(Lkotlin/Result;IZLcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 112
    .line 113
    .line 114
    invoke-static {v2}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    iput-object p2, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->n:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 119
    .line 120
    iput-object p2, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->o:Lkotlinx/coroutines/flow/StateFlow;

    .line 121
    .line 122
    const/4 p2, 0x0

    .line 123
    const/4 v2, 0x7

    .line 124
    invoke-static {p2, p2, v1, v2, v1}, Lkotlinx/coroutines/flow/SharedFlowKt;->MutableSharedFlow$default(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    iput-object v3, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->p:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 129
    .line 130
    iput-object v3, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->q:Lkotlinx/coroutines/flow/SharedFlow;

    .line 131
    .line 132
    invoke-static {p2, p2, v1, v2, v1}, Lkotlinx/coroutines/flow/SharedFlowKt;->MutableSharedFlow$default(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    iput-object p2, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->r:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 137
    .line 138
    iput-object p2, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->s:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 139
    .line 140
    invoke-interface {p1}, Landroidx/datastore/core/DataStore;->getData()Lkotlinx/coroutines/flow/Flow;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    new-instance p2, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$isNoRemind$1;

    .line 145
    .line 146
    invoke-direct {p2, v1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$isNoRemind$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 147
    .line 148
    .line 149
    invoke-static {p1, p3, p2}, Lkotlinx/coroutines/flow/FlowKt;->combine(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 154
    .line 155
    .line 156
    move-result-object p2

    .line 157
    sget-object p3, Lkotlinx/coroutines/flow/SharingStarted;->Companion:Lkotlinx/coroutines/flow/SharingStarted$Companion;

    .line 158
    .line 159
    invoke-virtual {p3}, Lkotlinx/coroutines/flow/SharingStarted$Companion;->getEagerly()Lkotlinx/coroutines/flow/SharingStarted;

    .line 160
    .line 161
    .line 162
    move-result-object p3

    .line 163
    invoke-static {p1, p2, p3, v0}, Lkotlinx/coroutines/flow/FlowKt;->stateIn(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->t:Lkotlinx/coroutines/flow/StateFlow;

    .line 168
    .line 169
    return-void
.end method

.method public static final E(Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;Ljava/lang/Throwable;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->n:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lp6/k;

    .line 9
    .line 10
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const/16 v9, 0x3e

    .line 25
    .line 26
    const/4 v10, 0x0

    .line 27
    const/4 v3, 0x0

    .line 28
    const/4 v4, 0x0

    .line 29
    const/4 v5, 0x0

    .line 30
    const-wide/16 v6, 0x0

    .line 31
    .line 32
    const/4 v8, 0x0

    .line 33
    invoke-static/range {v1 .. v10}, Lp6/k;->b(Lp6/k;Lkotlin/Result;IZLcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;JZILjava/lang/Object;)Lp6/k;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p0, p1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->y(Lp6/k;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public static final F(Ljava/util/List;Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;)I
    .locals 2

    .line 1
    iget-object p1, p1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->n:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lp6/k;

    .line 8
    .line 9
    invoke-virtual {p1}, Lp6/k;->q()Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    sget-object v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;->a:Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;

    .line 14
    .line 15
    if-ne p1, v0, :cond_0

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    :goto_0
    add-int/lit8 p0, p0, -0x1

    .line 22
    .line 23
    return p0

    .line 24
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    :cond_1
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    move-object v1, v0

    .line 44
    check-cast v1, Lcom/zykj/student/dialogue/bean/resp/MessageResponse;

    .line 45
    .line 46
    invoke-virtual {v1}, Lcom/zykj/student/dialogue/bean/resp/MessageResponse;->isPrimary()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    goto :goto_0
.end method

.method public static final synthetic m(Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;Lcom/zykj/student/dialogue/ui/detail/viewmodel/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->x(Lcom/zykj/student/dialogue/ui/detail/viewmodel/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic n(Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;Lp6/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->y(Lp6/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic o(Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;)Landroidx/datastore/core/DataStore;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->e:Landroidx/datastore/core/DataStore;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic p(Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;)Lk6/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->c:Lk6/g;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic q(Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->J(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic r(Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->d:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic s(Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->f:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic t(Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->l:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic u(Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->n:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic v(Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->P(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final A()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final B()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->j:Z

    .line 2
    .line 3
    return v0
.end method

.method public final C()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->g:Lkotlinx/coroutines/flow/StateFlow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final D(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 14

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    instance-of v1, v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$getMessages$1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$getMessages$1;

    .line 9
    .line 10
    iget v2, v1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$getMessages$1;->g:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$getMessages$1;->g:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$getMessages$1;

    .line 23
    .line 24
    invoke-direct {v1, p0, v0}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$getMessages$1;-><init>(Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, v1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$getMessages$1;->e:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget v3, v1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$getMessages$1;->g:I

    .line 34
    .line 35
    const/4 v4, 0x1

    .line 36
    const/4 v5, 0x0

    .line 37
    const/4 v6, 0x2

    .line 38
    if-eqz v3, :cond_3

    .line 39
    .line 40
    if-eq v3, v4, :cond_2

    .line 41
    .line 42
    if-ne v3, v6, :cond_1

    .line 43
    .line 44
    iget-object v2, v1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$getMessages$1;->d:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v2, Lcom/zykj/student/dialogue/network/BaseResponse;

    .line 47
    .line 48
    iget-object v1, v1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$getMessages$1;->c:Ljava/lang/Object;

    .line 49
    .line 50
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto/16 :goto_8

    .line 54
    .line 55
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v0

    .line 63
    :cond_2
    iget-boolean v3, v1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$getMessages$1;->a:Z

    .line 64
    .line 65
    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :catchall_0
    move-exception v0

    .line 70
    goto :goto_2

    .line 71
    :cond_3
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    :try_start_1
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 75
    .line 76
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->c:Lk6/g;

    .line 77
    .line 78
    new-instance v7, Lcom/zykj/student/dialogue/bean/req/MessageRequest;

    .line 79
    .line 80
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->I()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    iget-boolean v11, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->j:Z

    .line 85
    .line 86
    const/4 v12, 0x6

    .line 87
    const/4 v13, 0x0

    .line 88
    const/4 v9, 0x0

    .line 89
    const/4 v10, 0x0

    .line 90
    invoke-direct/range {v7 .. v13}, Lcom/zykj/student/dialogue/bean/req/MessageRequest;-><init>(Ljava/lang/String;IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 91
    .line 92
    .line 93
    move v3, p1

    .line 94
    :try_start_2
    iput-boolean v3, v1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$getMessages$1;->a:Z

    .line 95
    .line 96
    iput v5, v1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$getMessages$1;->b:I

    .line 97
    .line 98
    iput v4, v1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$getMessages$1;->g:I

    .line 99
    .line 100
    invoke-interface {v0, v7, v1}, Lk6/g;->b(Lcom/zykj/student/dialogue/bean/req/MessageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    if-ne v0, v2, :cond_4

    .line 105
    .line 106
    goto :goto_7

    .line 107
    :cond_4
    :goto_1
    check-cast v0, Lcom/zykj/student/dialogue/network/BaseResponse;

    .line 108
    .line 109
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 113
    goto :goto_3

    .line 114
    :catchall_1
    move-exception v0

    .line 115
    move v3, p1

    .line 116
    :goto_2
    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 117
    .line 118
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    :goto_3
    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    if-eqz v4, :cond_b

    .line 131
    .line 132
    move-object v4, v0

    .line 133
    check-cast v4, Lcom/zykj/student/dialogue/network/BaseResponse;

    .line 134
    .line 135
    invoke-virtual {v4}, Lcom/zykj/student/dialogue/network/BaseResponse;->getSuccess()Z

    .line 136
    .line 137
    .line 138
    move-result v7

    .line 139
    if-nez v7, :cond_8

    .line 140
    .line 141
    new-instance v8, Lcom/zykj/base/bean/toast/ToastErrorMessage;

    .line 142
    .line 143
    invoke-virtual {v4}, Lcom/zykj/student/dialogue/network/BaseResponse;->getError()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 144
    .line 145
    .line 146
    move-result-object v7

    .line 147
    if-eqz v7, :cond_6

    .line 148
    .line 149
    invoke-virtual {v7}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getMessage()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v7

    .line 153
    if-nez v7, :cond_5

    .line 154
    .line 155
    goto :goto_5

    .line 156
    :cond_5
    :goto_4
    move-object v10, v7

    .line 157
    goto :goto_6

    .line 158
    :cond_6
    :goto_5
    const-string v7, "\u672a\u77e5\u9519\u8bef"

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :goto_6
    const/4 v12, 0x5

    .line 162
    const/4 v13, 0x0

    .line 163
    const/4 v9, 0x0

    .line 164
    const/4 v11, 0x0

    .line 165
    invoke-direct/range {v8 .. v13}, Lcom/zykj/base/bean/toast/ToastErrorMessage;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 166
    .line 167
    .line 168
    const/4 v7, 0x0

    .line 169
    invoke-static {v8, v7, v6, v7}, Li6/e;->b(Lcom/zykj/base/bean/toast/ToastMessage;Ljava/lang/String;ILjava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    iget-boolean v7, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->j:Z

    .line 173
    .line 174
    if-eqz v7, :cond_b

    .line 175
    .line 176
    iget-object v7, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->r:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 177
    .line 178
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 179
    .line 180
    .line 181
    move-result-object v8

    .line 182
    iput-object v0, v1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$getMessages$1;->c:Ljava/lang/Object;

    .line 183
    .line 184
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    iput-object v4, v1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$getMessages$1;->d:Ljava/lang/Object;

    .line 189
    .line 190
    iput-boolean v3, v1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$getMessages$1;->a:Z

    .line 191
    .line 192
    iput v5, v1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$getMessages$1;->b:I

    .line 193
    .line 194
    iput v6, v1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$getMessages$1;->g:I

    .line 195
    .line 196
    invoke-interface {v7, v8, v1}, Lkotlinx/coroutines/flow/MutableSharedFlow;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    if-ne v1, v2, :cond_7

    .line 201
    .line 202
    :goto_7
    return-object v2

    .line 203
    :cond_7
    move-object v1, v0

    .line 204
    :goto_8
    move-object v0, v1

    .line 205
    goto :goto_b

    .line 206
    :cond_8
    invoke-virtual {v4}, Lcom/zykj/student/dialogue/network/BaseResponse;->getResult()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    check-cast v1, Ljava/util/List;

    .line 211
    .line 212
    if-eqz v1, :cond_a

    .line 213
    .line 214
    if-eqz v3, :cond_9

    .line 215
    .line 216
    invoke-static {v1, p0}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->F(Ljava/util/List;Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;)I

    .line 217
    .line 218
    .line 219
    move-result v2

    .line 220
    :goto_9
    move v5, v2

    .line 221
    goto :goto_a

    .line 222
    :cond_9
    iget-object v2, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->n:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 223
    .line 224
    invoke-interface {v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    check-cast v2, Lp6/k;

    .line 229
    .line 230
    invoke-virtual {v2}, Lp6/k;->p()I

    .line 231
    .line 232
    .line 233
    move-result v2

    .line 234
    goto :goto_9

    .line 235
    :goto_a
    iget-object v2, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->n:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 236
    .line 237
    invoke-interface {v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    move-object v3, v2

    .line 242
    check-cast v3, Lp6/k;

    .line 243
    .line 244
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    invoke-static {v1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    .line 249
    .line 250
    .line 251
    move-result-object v4

    .line 252
    const/16 v11, 0x3c

    .line 253
    .line 254
    const/4 v12, 0x0

    .line 255
    const/4 v6, 0x0

    .line 256
    const/4 v7, 0x0

    .line 257
    const-wide/16 v8, 0x0

    .line 258
    .line 259
    const/4 v10, 0x0

    .line 260
    invoke-static/range {v3 .. v12}, Lp6/k;->b(Lp6/k;Lkotlin/Result;IZLcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;JZILjava/lang/Object;)Lp6/k;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    invoke-virtual {p0, v1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->y(Lp6/k;)V

    .line 265
    .line 266
    .line 267
    goto :goto_b

    .line 268
    :cond_a
    new-instance v1, Ljava/lang/Exception;

    .line 269
    .line 270
    const-string v2, "data is null"

    .line 271
    .line 272
    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    invoke-static {p0, v1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->E(Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;Ljava/lang/Throwable;)V

    .line 276
    .line 277
    .line 278
    :cond_b
    :goto_b
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    if-eqz v0, :cond_c

    .line 283
    .line 284
    new-instance v1, Lh6/b$a$a;

    .line 285
    .line 286
    invoke-direct {v1, v0}, Lh6/b$a$a;-><init>(Ljava/lang/Throwable;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {p0, v1}, Lcom/zykj/student/dialogue/base/BaseViewModel;->g(Lh6/b;)V

    .line 290
    .line 291
    .line 292
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 293
    .line 294
    if-nez v1, :cond_c

    .line 295
    .line 296
    invoke-static {p0, v0}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->E(Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;Ljava/lang/Throwable;)V

    .line 297
    .line 298
    .line 299
    :cond_c
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 300
    .line 301
    return-object v0
.end method

.method public final G()Lp6/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->k:Lp6/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public final H()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->m:Lkotlinx/coroutines/flow/StateFlow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final I()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->i:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "questionId"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public final J(Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$getSessionById$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, p1, v1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$getSessionById$1;-><init>(Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

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

.method public final K()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->o:Lkotlinx/coroutines/flow/StateFlow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final L()Lkotlinx/coroutines/flow/MutableSharedFlow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->s:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final M(Lcom/zykj/student/dialogue/ui/detail/viewmodel/b;)V
    .locals 7

    .line 1
    const-string v0, "event"

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
    new-instance v4, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$onEvent$1;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {v4, p1, p0, v0}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$onEvent$1;-><init>(Lcom/zykj/student/dialogue/ui/detail/viewmodel/b;Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;Lkotlin/coroutines/Continuation;)V

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
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final N(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 1

    .line 1
    const-string v0, "onShowDialog"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "action"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->t:Lkotlinx/coroutines/flow/StateFlow;

    .line 12
    .line 13
    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final O()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->k:Lp6/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Lp6/j;->d()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final P(Ljava/lang/String;)V
    .locals 9

    .line 1
    new-instance v6, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$resetReadState$1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v6, p0, p1, v0}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$resetReadState$1;-><init>(Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 5
    .line 6
    .line 7
    const/16 v7, 0x1f

    .line 8
    .line 9
    const/4 v8, 0x0

    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x0

    .line 15
    move-object v0, p0

    .line 16
    invoke-static/range {v0 .. v8}, Lcom/zykj/student/dialogue/base/BaseViewModel;->f(Lcom/zykj/student/dialogue/base/BaseViewModel;Ljava/lang/String;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final Q()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$setNoRemind$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$setNoRemind$1;-><init>(Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;Lkotlin/coroutines/Continuation;)V

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

.method public final R(Ljava/lang/String;Z)V
    .locals 2

    .line 1
    const-string v0, "questionId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->i:Ljava/lang/String;

    .line 7
    .line 8
    iput-boolean p2, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->j:Z

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->J(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    new-instance p1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/a$d;

    .line 14
    .line 15
    const/4 p2, 0x1

    .line 16
    const/4 v0, 0x0

    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {p1, v1, p2, v0}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/a$d;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->w(Lcom/zykj/student/dialogue/ui/detail/viewmodel/a;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final S(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->k:Lp6/j;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lp6/j;->e(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final T()V
    .locals 9

    .line 1
    new-instance v6, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$setSessionState$1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v6, p0, v0}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$setSessionState$1;-><init>(Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;Lkotlin/coroutines/Continuation;)V

    .line 5
    .line 6
    .line 7
    const/16 v7, 0x1f

    .line 8
    .line 9
    const/4 v8, 0x0

    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x0

    .line 15
    move-object v0, p0

    .line 16
    invoke-static/range {v0 .. v8}, Lcom/zykj/student/dialogue/base/BaseViewModel;->f(Lcom/zykj/student/dialogue/base/BaseViewModel;Ljava/lang/String;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final U(D)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->k:Lp6/j;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lp6/j;->f(D)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final V(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->k:Lp6/j;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lp6/j;->g(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final W()V
    .locals 9

    .line 1
    new-instance v6, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$updateCollectState$1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v6, p0, v0}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$updateCollectState$1;-><init>(Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;Lkotlin/coroutines/Continuation;)V

    .line 5
    .line 6
    .line 7
    const/16 v7, 0x1f

    .line 8
    .line 9
    const/4 v8, 0x0

    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x0

    .line 15
    move-object v0, p0

    .line 16
    invoke-static/range {v0 .. v8}, Lcom/zykj/student/dialogue/base/BaseViewModel;->f(Lcom/zykj/student/dialogue/base/BaseViewModel;Ljava/lang/String;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final X(Z)V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$updateUnderstood$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, p1, v1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$updateUnderstood$1;-><init>(Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;ZLkotlin/coroutines/Continuation;)V

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

.method public final w(Lcom/zykj/student/dialogue/ui/detail/viewmodel/a;)V
    .locals 7

    .line 1
    const-string v0, "action"

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
    new-instance v4, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$dispatch$1;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {v4, p0, p1, v0}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$dispatch$1;-><init>(Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;Lcom/zykj/student/dialogue/ui/detail/viewmodel/a;Lkotlin/coroutines/Continuation;)V

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
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final x(Lcom/zykj/student/dialogue/ui/detail/viewmodel/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->p:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lkotlinx/coroutines/flow/MutableSharedFlow;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-ne p1, p2, :cond_0

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 15
    .line 16
    return-object p1
.end method

.method public final y(Lp6/k;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->n:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final z()Lkotlinx/coroutines/flow/SharedFlow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->q:Lkotlinx/coroutines/flow/SharedFlow;

    .line 2
    .line 3
    return-object v0
.end method
