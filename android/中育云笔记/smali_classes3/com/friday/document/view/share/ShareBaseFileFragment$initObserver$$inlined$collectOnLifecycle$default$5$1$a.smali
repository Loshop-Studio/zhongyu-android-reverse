.class public final Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$5$1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvd/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$5$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/friday/document/view/share/ShareBaseFileFragment;


# direct methods
.method public constructor <init>(Lcom/friday/document/view/share/ShareBaseFileFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$5$1$a;->c:Lcom/friday/document/view/share/ShareBaseFileFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Lcom/friday/document/model/ShareFile;

    .line 2
    .line 3
    iget-object p2, p0, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$5$1$a;->c:Lcom/friday/document/view/share/ShareBaseFileFragment;

    .line 4
    .line 5
    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    const-string v0, "getViewLifecycleOwner(...)"

    .line 10
    .line 11
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p2}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    new-instance v4, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$5$1;

    .line 19
    .line 20
    iget-object p2, p0, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$5$1$a;->c:Lcom/friday/document/view/share/ShareBaseFileFragment;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-direct {v4, p2, p1, v0}, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$5$1;-><init>(Lcom/friday/document/view/share/ShareBaseFileFragment;Lcom/friday/document/model/ShareFile;Lvc/c;)V

    .line 24
    .line 25
    .line 26
    const/4 v5, 0x3

    .line 27
    const/4 v6, 0x0

    .line 28
    const/4 v2, 0x0

    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 31
    .line 32
    .line 33
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 34
    .line 35
    return-object p1
.end method
