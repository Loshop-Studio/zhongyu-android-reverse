.class public final synthetic Lcom/zykj/mistake/feature/home/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:Landroidx/lifecycle/LifecycleOwner;

.field public final synthetic b:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

.field public final synthetic c:Lcom/zykj/mistake/main/MainShellViewModel;

.field public final synthetic d:Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;

.field public final synthetic e:Lcom/zykj/mistake/feature/review/ReviewViewModel;

.field public final synthetic f:Landroidx/compose/runtime/State;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/LifecycleOwner;Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Lcom/zykj/mistake/main/MainShellViewModel;Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;Lcom/zykj/mistake/feature/review/ReviewViewModel;Landroidx/compose/runtime/State;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/home/c;->a:Landroidx/lifecycle/LifecycleOwner;

    iput-object p2, p0, Lcom/zykj/mistake/feature/home/c;->b:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    iput-object p3, p0, Lcom/zykj/mistake/feature/home/c;->c:Lcom/zykj/mistake/main/MainShellViewModel;

    iput-object p4, p0, Lcom/zykj/mistake/feature/home/c;->d:Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;

    iput-object p5, p0, Lcom/zykj/mistake/feature/home/c;->e:Lcom/zykj/mistake/feature/review/ReviewViewModel;

    iput-object p6, p0, Lcom/zykj/mistake/feature/home/c;->f:Landroidx/compose/runtime/State;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Landroidx/compose/runtime/DisposableEffectScope;

    .line 2
    .line 3
    const-string v0, "$this$DisposableEffect"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lcom/zykj/mistake/feature/home/e;

    .line 9
    .line 10
    iget-object v2, p0, Lcom/zykj/mistake/feature/home/c;->b:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 11
    .line 12
    iget-object v3, p0, Lcom/zykj/mistake/feature/home/c;->c:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 13
    .line 14
    iget-object v4, p0, Lcom/zykj/mistake/feature/home/c;->d:Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;

    .line 15
    .line 16
    iget-object v5, p0, Lcom/zykj/mistake/feature/home/c;->e:Lcom/zykj/mistake/feature/review/ReviewViewModel;

    .line 17
    .line 18
    iget-object v6, p0, Lcom/zykj/mistake/feature/home/c;->f:Landroidx/compose/runtime/State;

    .line 19
    .line 20
    invoke-direct/range {v1 .. v6}, Lcom/zykj/mistake/feature/home/e;-><init>(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Lcom/zykj/mistake/main/MainShellViewModel;Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;Lcom/zykj/mistake/feature/review/ReviewViewModel;Landroidx/compose/runtime/State;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lcom/zykj/mistake/feature/home/c;->a:Landroidx/lifecycle/LifecycleOwner;

    .line 24
    .line 25
    invoke-interface {p1}, Landroidx/lifecycle/LifecycleOwner;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, v1}, Landroidx/lifecycle/Lifecycle;->addObserver(Landroidx/lifecycle/LifecycleObserver;)V

    .line 30
    .line 31
    .line 32
    new-instance v0, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$lambda$8$lambda$7$$inlined$onDispose$1;

    .line 33
    .line 34
    invoke-direct {v0, p1, v1}, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$lambda$8$lambda$7$$inlined$onDispose$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lcom/zykj/mistake/feature/home/e;)V

    .line 35
    .line 36
    .line 37
    return-object v0
.end method
