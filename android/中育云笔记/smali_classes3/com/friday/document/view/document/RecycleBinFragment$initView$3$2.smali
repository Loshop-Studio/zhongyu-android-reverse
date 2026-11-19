.class public final Lcom/friday/document/view/document/RecycleBinFragment$initView$3$2;
.super Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/document/RecycleBinFragment;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/friday/document/view/document/RecycleBinFragment;


# direct methods
.method public constructor <init>(Lcom/friday/document/view/document/RecycleBinFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/document/RecycleBinFragment$initView$3$2;->a:Lcom/friday/document/view/document/RecycleBinFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onItemRangeRemoved(II)V
    .locals 6

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;->onItemRangeRemoved(II)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/friday/document/view/document/RecycleBinFragment$initView$3$2;->a:Lcom/friday/document/view/document/RecycleBinFragment;

    .line 5
    .line 6
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v3, Lcom/friday/document/view/document/RecycleBinFragment$initView$3$2$onItemRangeRemoved$1;

    .line 11
    .line 12
    iget-object p1, p0, Lcom/friday/document/view/document/RecycleBinFragment$initView$3$2;->a:Lcom/friday/document/view/document/RecycleBinFragment;

    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    invoke-direct {v3, p1, p2}, Lcom/friday/document/view/document/RecycleBinFragment$initView$3$2$onItemRangeRemoved$1;-><init>(Lcom/friday/document/view/document/RecycleBinFragment;Lvc/c;)V

    .line 16
    .line 17
    .line 18
    const/4 v4, 0x3

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v1, 0x0

    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 23
    .line 24
    .line 25
    return-void
.end method
