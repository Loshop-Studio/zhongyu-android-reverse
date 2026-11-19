.class public final Lcom/zykj/mistake/feature/collection/detail/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/g;


# instance fields
.field public final synthetic a:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;

.field public final synthetic b:Lt4/e;

.field public final synthetic c:Landroidx/navigation/NavBackStackEntry;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;Lt4/e;Landroidx/navigation/NavBackStackEntry;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/d;->a:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/zykj/mistake/feature/collection/detail/d;->b:Lt4/e;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/zykj/mistake/feature/collection/detail/d;->c:Landroidx/navigation/NavBackStackEntry;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lh6/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Ljava/lang/Integer;

    .line 2
    .line 3
    sget-object p2, Ld6/s;->a:Ld6/s;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    return-object p2

    .line 8
    :cond_0
    new-instance v0, Lcom/zykj/mistake/feature/collection/detail/j0;

    .line 9
    .line 10
    invoke-static {p1}, Lv7/d;->t(Ljava/lang/Object;)Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-direct {v0, p1}, Lcom/zykj/mistake/feature/collection/detail/j0;-><init>(Ljava/util/Set;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/d;->a:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->d(Lcom/zykj/mistake/feature/collection/detail/y0;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/d;->b:Lt4/e;

    .line 23
    .line 24
    invoke-virtual {p1}, Lt4/e;->b()Landroidx/lifecycle/SavedStateHandle;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    const-string v0, "nav_result_refresh_notebook"

    .line 31
    .line 32
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 33
    .line 34
    invoke-virtual {p1, v0, v1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/d;->c:Landroidx/navigation/NavBackStackEntry;

    .line 38
    .line 39
    invoke-virtual {p1}, Landroidx/navigation/NavBackStackEntry;->getSavedStateHandle()Landroidx/lifecycle/SavedStateHandle;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const-string v1, "nav_result_collection_removed_item_id"

    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    invoke-virtual {v0, v1, v2}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Landroidx/navigation/NavBackStackEntry;->getSavedStateHandle()Landroidx/lifecycle/SavedStateHandle;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    const-string v0, "nav_result_collection_removed_item_is_mastered"

    .line 54
    .line 55
    invoke-virtual {p1, v0, v2}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-object p2
.end method
