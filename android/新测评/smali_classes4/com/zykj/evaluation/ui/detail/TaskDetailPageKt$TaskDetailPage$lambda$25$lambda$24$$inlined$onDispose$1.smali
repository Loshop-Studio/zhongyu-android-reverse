.class public final Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt$TaskDetailPage$lambda$25$lambda$24$$inlined$onDispose$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/runtime/DisposableEffectResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt;->m0(JLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004\u00b8\u0006\u0000"
    }
    d2 = {
        "androidx/compose/runtime/DisposableEffectScope$onDispose$1",
        "Landroidx/compose/runtime/DisposableEffectResult;",
        "dispose",
        "",
        "runtime_release"
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
        "SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 TaskDetailPage.kt\ncom/zykj/evaluation/ui/detail/TaskDetailPageKt\n*L\n1#1,67:1\n155#2,5:68\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic a:Landroidx/lifecycle/MutableLiveData;

.field public final synthetic b:Landroidx/lifecycle/Observer;

.field public final synthetic c:Landroidx/lifecycle/MutableLiveData;

.field public final synthetic d:Landroidx/lifecycle/Observer;

.field public final synthetic e:Landroidx/lifecycle/MutableLiveData;

.field public final synthetic f:Landroidx/lifecycle/Observer;

.field public final synthetic g:Landroidx/lifecycle/MutableLiveData;

.field public final synthetic h:Landroidx/lifecycle/Observer;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/MutableLiveData;Landroidx/lifecycle/Observer;Landroidx/lifecycle/MutableLiveData;Landroidx/lifecycle/Observer;Landroidx/lifecycle/MutableLiveData;Landroidx/lifecycle/Observer;Landroidx/lifecycle/MutableLiveData;Landroidx/lifecycle/Observer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt$TaskDetailPage$lambda$25$lambda$24$$inlined$onDispose$1;->a:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt$TaskDetailPage$lambda$25$lambda$24$$inlined$onDispose$1;->b:Landroidx/lifecycle/Observer;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt$TaskDetailPage$lambda$25$lambda$24$$inlined$onDispose$1;->c:Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt$TaskDetailPage$lambda$25$lambda$24$$inlined$onDispose$1;->d:Landroidx/lifecycle/Observer;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt$TaskDetailPage$lambda$25$lambda$24$$inlined$onDispose$1;->e:Landroidx/lifecycle/MutableLiveData;

    .line 10
    .line 11
    iput-object p6, p0, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt$TaskDetailPage$lambda$25$lambda$24$$inlined$onDispose$1;->f:Landroidx/lifecycle/Observer;

    .line 12
    .line 13
    iput-object p7, p0, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt$TaskDetailPage$lambda$25$lambda$24$$inlined$onDispose$1;->g:Landroidx/lifecycle/MutableLiveData;

    .line 14
    .line 15
    iput-object p8, p0, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt$TaskDetailPage$lambda$25$lambda$24$$inlined$onDispose$1;->h:Landroidx/lifecycle/Observer;

    .line 16
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt$TaskDetailPage$lambda$25$lambda$24$$inlined$onDispose$1;->a:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt$TaskDetailPage$lambda$25$lambda$24$$inlined$onDispose$1;->b:Landroidx/lifecycle/Observer;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroidx/lifecycle/LiveData;->removeObserver(Landroidx/lifecycle/Observer;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt$TaskDetailPage$lambda$25$lambda$24$$inlined$onDispose$1;->c:Landroidx/lifecycle/MutableLiveData;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt$TaskDetailPage$lambda$25$lambda$24$$inlined$onDispose$1;->d:Landroidx/lifecycle/Observer;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroidx/lifecycle/LiveData;->removeObserver(Landroidx/lifecycle/Observer;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt$TaskDetailPage$lambda$25$lambda$24$$inlined$onDispose$1;->e:Landroidx/lifecycle/MutableLiveData;

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt$TaskDetailPage$lambda$25$lambda$24$$inlined$onDispose$1;->f:Landroidx/lifecycle/Observer;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroidx/lifecycle/LiveData;->removeObserver(Landroidx/lifecycle/Observer;)V

    .line 26
    .line 27
    .line 28
    :cond_2
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt$TaskDetailPage$lambda$25$lambda$24$$inlined$onDispose$1;->g:Landroidx/lifecycle/MutableLiveData;

    .line 29
    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt$TaskDetailPage$lambda$25$lambda$24$$inlined$onDispose$1;->h:Landroidx/lifecycle/Observer;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Landroidx/lifecycle/LiveData;->removeObserver(Landroidx/lifecycle/Observer;)V

    .line 35
    .line 36
    .line 37
    :cond_3
    return-void
.end method
