.class public final Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$2$1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvd/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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

    iput-object p1, p0, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$2$1$a;->c:Lcom/friday/document/view/share/ShareBaseFileFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    iget-object p2, p0, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$2$1$a;->c:Lcom/friday/document/view/share/ShareBaseFileFragment;

    .line 4
    .line 5
    invoke-static {p2, p1}, Lcom/friday/document/view/share/ShareBaseFileFragment;->z(Lcom/friday/document/view/share/ShareBaseFileFragment;Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    iget-object p2, p0, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$2$1$a;->c:Lcom/friday/document/view/share/ShareBaseFileFragment;

    .line 9
    .line 10
    invoke-static {p2}, Lcom/friday/document/view/share/ShareBaseFileFragment;->x(Lcom/friday/document/view/share/ShareBaseFileFragment;)Lcom/friday/document/adapter/ShareFileAdapter;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    check-cast p1, Ljava/lang/Iterable;

    .line 15
    .line 16
    invoke-static {p1}, Lrc/g0;->X0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/ListAdapter;->submitList(Ljava/util/List;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$2$1$a;->c:Lcom/friday/document/view/share/ShareBaseFileFragment;

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/friday/document/view/share/ShareBaseFileFragment;->F()Lcom/friday/document/model/ShareFile;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    iget-object p2, p0, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$2$1$a;->c:Lcom/friday/document/view/share/ShareBaseFileFragment;

    .line 32
    .line 33
    invoke-virtual {p2}, Lcom/friday/document/view/share/ShareBaseFileFragment;->E()Lcom/friday/document/viewmodel/ShareFileViewModel;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-virtual {p2, p1}, Lcom/friday/document/viewmodel/ShareFileViewModel;->N(Lcom/friday/document/model/ShareFile;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$2$1$a;->c:Lcom/friday/document/view/share/ShareBaseFileFragment;

    .line 41
    .line 42
    const/4 p2, 0x0

    .line 43
    invoke-virtual {p1, p2}, Lcom/friday/document/view/share/ShareBaseFileFragment;->M(Lcom/friday/document/model/ShareFile;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 47
    .line 48
    return-object p1
.end method
