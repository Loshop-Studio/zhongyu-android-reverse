.class public final Lcom/friday/paint/view/six/NewNoteActivity$initFragment$1;
.super Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/view/six/NewNoteActivity;->initFragment()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/friday/paint/view/six/NewNoteActivity;


# direct methods
.method public constructor <init>(Lcom/friday/paint/view/six/NewNoteActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/view/six/NewNoteActivity$initFragment$1;->a:Lcom/friday/paint/view/six/NewNoteActivity;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onFragmentViewCreated(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    const-string p4, "fm"

    .line 2
    .line 3
    invoke-static {p1, p4}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p4, "f"

    .line 7
    .line 8
    invoke-static {p2, p4}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p4, "v"

    .line 12
    .line 13
    invoke-static {p3, p4}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    instance-of p3, p2, Lcom/friday/paint/view/six/NewStudentPaintFragment;

    .line 17
    .line 18
    if-eqz p3, :cond_0

    .line 19
    .line 20
    iget-object p3, p0, Lcom/friday/paint/view/six/NewNoteActivity$initFragment$1;->a:Lcom/friday/paint/view/six/NewNoteActivity;

    .line 21
    .line 22
    check-cast p2, Lcom/friday/paint/view/six/NewStudentPaintFragment;

    .line 23
    .line 24
    invoke-static {p3, p2}, Lcom/friday/paint/view/six/NewNoteActivity;->access$setPaintFragment$p(Lcom/friday/paint/view/six/NewNoteActivity;Lcom/friday/paint/view/six/NewStudentPaintFragment;)V

    .line 25
    .line 26
    .line 27
    const-string p2, "\u9875\u9762NewNoteActivity.kt -> NewStudentPaintFragment\u5df2\u51c6\u5907\u5c31\u7eea\uff0c\u5f00\u59cb\u6267\u884c"

    .line 28
    .line 29
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-static {p2}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object p2, p0, Lcom/friday/paint/view/six/NewNoteActivity$initFragment$1;->a:Lcom/friday/paint/view/six/NewNoteActivity;

    .line 37
    .line 38
    invoke-static {p2}, Lcom/friday/paint/view/six/NewNoteActivity;->access$getViewModel(Lcom/friday/paint/view/six/NewNoteActivity;)Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-virtual {p2}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->M()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, p0}, Landroidx/fragment/app/FragmentManager;->unregisterFragmentLifecycleCallbacks(Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    return-void
.end method
