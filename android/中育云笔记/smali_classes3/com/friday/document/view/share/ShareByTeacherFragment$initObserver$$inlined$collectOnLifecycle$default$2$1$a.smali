.class public final Lcom/friday/document/view/share/ShareByTeacherFragment$initObserver$$inlined$collectOnLifecycle$default$2$1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvd/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/share/ShareByTeacherFragment$initObserver$$inlined$collectOnLifecycle$default$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/friday/document/view/share/ShareByTeacherFragment;


# direct methods
.method public constructor <init>(Lcom/friday/document/view/share/ShareByTeacherFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/friday/document/view/share/ShareByTeacherFragment$initObserver$$inlined$collectOnLifecycle$default$2$1$a;->c:Lcom/friday/document/view/share/ShareByTeacherFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;
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
    iget-object p2, p0, Lcom/friday/document/view/share/ShareByTeacherFragment$initObserver$$inlined$collectOnLifecycle$default$2$1$a;->c:Lcom/friday/document/view/share/ShareByTeacherFragment;

    .line 8
    .line 9
    invoke-static {p2}, Lcom/friday/document/view/share/ShareByTeacherFragment;->w(Lcom/friday/document/view/share/ShareByTeacherFragment;)Lcom/friday/document/databinding/FragmentShareByTeacherBinding;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    iget-object p2, p2, Lcom/friday/document/databinding/FragmentShareByTeacherBinding;->e:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 14
    .line 15
    invoke-virtual {p2, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 16
    .line 17
    .line 18
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 19
    .line 20
    return-object p1
.end method
