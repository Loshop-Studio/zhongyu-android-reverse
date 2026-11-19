# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class public final Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;
.super Lcom/zykj/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\r\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0014R\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R#\u0010\u001f\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001b0\u001a0\u00198\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u0015\u0010\u001eR\u001d\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00198\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u001d\u001a\u0004\u0008\u001c\u0010\u001e\u00a8\u0006!"
    }
    d2 = {
        "Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;",
        "Lcom/zykj/base/BaseViewModel;",
        "Lcom/zykj/huiwei/launcher/repository/UserRepository;",
        "userRepository",
        "Lcom/zykj/huiwei/launcher/repository/HomeRepository;",
        "homeRepository",
        "Landroidx/datastore/core/DataStore;",
        "Lcom/zykj/huiwei/launcher/proto/m;",
        "userDataStore",
        "<init>",
        "(Lcom/zykj/huiwei/launcher/repository/UserRepository;Lcom/zykj/huiwei/launcher/repository/HomeRepository;Landroidx/datastore/core/DataStore;)V",
        "",
        "b",
        "()V",
        "",
        "profileId",
        "f",
        "(J)V",
        "a",
        "Lcom/zykj/huiwei/launcher/repository/UserRepository;",
        "Lcom/zykj/huiwei/launcher/repository/HomeRepository;",
        "c",
        "Landroidx/datastore/core/DataStore;",
        "e",
        "()Landroidx/datastore/core/DataStore;",
        "Landroidx/lifecycle/MutableLiveData;",
        "",
        "Lcom/zykj/huiwei/launcher/bean/AvatarItem;",
        "d",
        "Landroidx/lifecycle/MutableLiveData;",
        "()Landroidx/lifecycle/MutableLiveData;",
        "avatarItems",
        "userCacheBean",
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
        "SMAP\nChangeAvatarViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeAvatarViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,53:1\n49#2:54\n51#2:58\n46#3:55\n51#3:57\n105#4:56\n*S KotlinDebug\n*F\n+ 1 ChangeAvatarViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel\n*L\n36#1:54\n36#1:58\n36#1:55\n36#1:57\n36#1:56\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lcom/zykj/huiwei/launcher/repository/UserRepository;

.field public final b:Lcom/zykj/huiwei/launcher/repository/HomeRepository;

.field public final c:Landroidx/datastore/core/DataStore;

.field public final d:Landroidx/lifecycle/MutableLiveData;

.field public final e:Landroidx/lifecycle/MutableLiveData;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/huiwei/launcher/repository/UserRepository;Lcom/zykj/huiwei/launcher/repository/HomeRepository;Landroidx/datastore/core/DataStore;)V
    .locals 1

    .line 1
    const-string v0, "userRepository"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "homeRepository"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "userDataStore"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lcom/zykj/base/BaseViewModel;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;->a:Lcom/zykj/huiwei/launcher/repository/UserRepository;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;->b:Lcom/zykj/huiwei/launcher/repository/HomeRepository;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;->c:Landroidx/datastore/core/DataStore;

    .line 24
    .line 25
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 26
    .line 27
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;->d:Landroidx/lifecycle/MutableLiveData;

    .line 31
    .line 32
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 33
    .line 34
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;->e:Landroidx/lifecycle/MutableLiveData;

    .line 38
    .line 39
    return-void
.end method

.method public static final synthetic a(Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;)Lcom/zykj/huiwei/launcher/repository/UserRepository;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;->a:Lcom/zykj/huiwei/launcher/repository/UserRepository;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final b()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;->b:Lcom/zykj/huiwei/launcher/repository/HomeRepository;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/repository/HomeRepository;->b()Lkotlinx/coroutines/flow/Flow;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    new-instance v6, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$getAllProfilesAsync$1;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-direct {v6, p0, v0}, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$getAllProfilesAsync$1;-><init>(Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;Lkotlin/coroutines/Continuation;)V

    .line 11
    .line 12
    .line 13
    const/16 v7, 0xe

    .line 14
    .line 15
    const/4 v8, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    move-object v1, p0

    .line 20
    invoke-static/range {v1 .. v8}, Lcom/zykj/huiwei/launcher/ext/ViewModelExtKt;->g(Lcom/zykj/base/BaseViewModel;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final c()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;->d:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;->e:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Landroidx/datastore/core/DataStore;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;->c:Landroidx/datastore/core/DataStore;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f(J)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;->b:Lcom/zykj/huiwei/launcher/repository/HomeRepository;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lcom/zykj/huiwei/launcher/repository/HomeRepository;->i(J)Lkotlinx/coroutines/flow/Flow;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance v1, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1;

    .line 8
    .line 9
    invoke-direct {v1, p1, p0}, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$$inlined$map$1;-><init>(Lkotlinx/coroutines/flow/Flow;Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;)V

    .line 10
    .line 11
    .line 12
    new-instance v5, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$2;

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    invoke-direct {v5, p0, p1}, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel$setPictureAsync$2;-><init>(Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;Lkotlin/coroutines/Continuation;)V

    .line 16
    .line 17
    .line 18
    const/16 v6, 0xe

    .line 19
    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x0

    .line 24
    move-object v0, p0

    .line 25
    invoke-static/range {v0 .. v7}, Lcom/zykj/huiwei/launcher/ext/ViewModelExtKt;->g(Lcom/zykj/base/BaseViewModel;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method
