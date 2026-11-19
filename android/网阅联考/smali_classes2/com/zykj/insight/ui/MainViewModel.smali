.class public final Lcom/zykj/insight/ui/MainViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0008\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR+\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/zykj/insight/ui/MainViewModel;",
        "Landroidx/lifecycle/ViewModel;",
        "Lcom/zykj/message/server/bean/ServerInfo;",
        "serverInfo",
        "",
        "f",
        "c",
        "Lcom/zykj/http/bean/HeaderLiveData;",
        "a",
        "Lcom/zykj/http/bean/HeaderLiveData;",
        "headLiveData",
        "Lu1/g;",
        "b",
        "Lu1/g;",
        "service",
        "Lv1/b;",
        "<set-?>",
        "Landroidx/compose/runtime/MutableState;",
        "d",
        "()Lv1/b;",
        "e",
        "(Lv1/b;)V",
        "mainState",
        "<init>",
        "(Lcom/zykj/http/bean/HeaderLiveData;Lu1/g;)V",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainViewModel.kt\ncom/zykj/insight/ui/MainViewModel\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,60:1\n76#2:61\n102#2,2:62\n*S KotlinDebug\n*F\n+ 1 MainViewModel.kt\ncom/zykj/insight/ui/MainViewModel\n*L\n32#1:61\n32#1:62,2\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lcom/zykj/http/bean/HeaderLiveData;

.field public final b:Lu1/g;

.field public final c:Landroidx/compose/runtime/MutableState;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/http/bean/HeaderLiveData;Lu1/g;)V
    .locals 1

    .line 1
    const-string v0, "headLiveData"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "service"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/insight/ui/MainViewModel;->a:Lcom/zykj/http/bean/HeaderLiveData;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/insight/ui/MainViewModel;->b:Lu1/g;

    .line 17
    .line 18
    new-instance p1, Lv1/b;

    .line 19
    .line 20
    const/4 p2, 0x1

    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-direct {p1, v0, p2, v0}, Lv1/b;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 23
    .line 24
    .line 25
    const/4 p2, 0x2

    .line 26
    invoke-static {p1, v0, p2, v0}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Lcom/zykj/insight/ui/MainViewModel;->c:Landroidx/compose/runtime/MutableState;

    .line 31
    .line 32
    return-void
.end method

.method public static final synthetic a(Lcom/zykj/insight/ui/MainViewModel;)Lu1/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/insight/ui/MainViewModel;->b:Lu1/g;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b(Lcom/zykj/insight/ui/MainViewModel;Lv1/b;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/insight/ui/MainViewModel;->e(Lv1/b;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    new-instance v3, Lcom/zykj/insight/ui/MainViewModel$getDongNiUrl$1;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v3, p0, v4}, Lcom/zykj/insight/ui/MainViewModel$getDongNiUrl$1;-><init>(Lcom/zykj/insight/ui/MainViewModel;Lkotlin/coroutines/Continuation;)V

    .line 11
    .line 12
    .line 13
    const/4 v4, 0x3

    .line 14
    const/4 v5, 0x0

    .line 15
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final d()Lv1/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/insight/ui/MainViewModel;->c:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lv1/b;

    .line 8
    .line 9
    return-object v0
.end method

.method public final e(Lv1/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/insight/ui/MainViewModel;->c:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final f(Lcom/zykj/message/server/bean/ServerInfo;)V
    .locals 10

    .line 1
    const-string v0, "serverInfo"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/insight/ui/MainViewModel;->a:Lcom/zykj/http/bean/HeaderLiveData;

    .line 7
    .line 8
    new-instance v9, Lcom/zykj/http/bean/HeaderBean;

    .line 9
    .line 10
    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->getAppPackageName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->getAppVersionCode()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/ServerInfo;->b()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/ServerInfo;->e()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    const/4 v6, 0x0

    .line 31
    const/16 v7, 0x10

    .line 32
    .line 33
    const/4 v8, 0x0

    .line 34
    move-object v1, v9

    .line 35
    invoke-direct/range {v1 .. v8}, Lcom/zykj/http/bean/HeaderBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v9}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method
