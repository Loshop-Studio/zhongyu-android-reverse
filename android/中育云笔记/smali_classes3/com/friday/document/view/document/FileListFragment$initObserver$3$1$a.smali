.class public final Lcom/friday/document/view/document/FileListFragment$initObserver$3$1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvd/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/document/FileListFragment$initObserver$3$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/friday/document/view/document/FileListFragment;


# direct methods
.method public constructor <init>(Lcom/friday/document/view/document/FileListFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/friday/document/view/document/FileListFragment$initObserver$3$1$a;->c:Lcom/friday/document/view/document/FileListFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(ZLvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/friday/document/view/document/FileListFragment$initObserver$3$1$a;->c:Lcom/friday/document/view/document/FileListFragment;

    .line 2
    .line 3
    invoke-virtual {p2, p1}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 7
    .line 8
    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/document/FileListFragment$initObserver$3$1$a;->b(ZLvc/c;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
