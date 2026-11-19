.class final Lcom/friday/document/view/document/NewestFragment$onClick$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/document/NewestFragment;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.document.view.document.NewestFragment$onClick$1"
    f = "NewestFragment.kt"
    l = {
        0xef
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/document/view/document/NewestFragment;


# direct methods
.method public constructor <init>(Lcom/friday/document/view/document/NewestFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/document/NewestFragment$onClick$1;->d:Lcom/friday/document/view/document/NewestFragment;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/friday/document/view/document/NewestFragment$onClick$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/view/document/NewestFragment$onClick$1;->d:Lcom/friday/document/view/document/NewestFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/document/view/document/NewestFragment$onClick$1;-><init>(Lcom/friday/document/view/document/NewestFragment;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/document/NewestFragment$onClick$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/document/NewestFragment$onClick$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/view/document/NewestFragment$onClick$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/view/document/NewestFragment$onClick$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/document/view/document/NewestFragment$onClick$1;->c:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-static {}, Lcom/blankj/utilcode/util/NetworkUtils;->isConnected()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-nez p1, :cond_2

    .line 32
    .line 33
    const-string p1, "\u5f53\u524d\u6ca1\u6709\u7f51\u7edc\uff0c\u8bf7\u68c0\u67e5\u7f51\u7edc\u8fde\u63a5\u540e\u518d\u6b21\u5c1d\u8bd5"

    .line 34
    .line 35
    invoke-static {p1}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 36
    .line 37
    .line 38
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 39
    .line 40
    return-object p1

    .line 41
    :cond_2
    iget-object p1, p0, Lcom/friday/document/view/document/NewestFragment$onClick$1;->d:Lcom/friday/document/view/document/NewestFragment;

    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, Lcom/friday/document/viewmodel/NewestViewModel;

    .line 48
    .line 49
    iput v2, p0, Lcom/friday/document/view/document/NewestFragment$onClick$1;->c:I

    .line 50
    .line 51
    invoke-virtual {p1, p0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->C(Lvc/c;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-ne p1, v0, :cond_3

    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_3
    :goto_0
    check-cast p1, Ljava/lang/Number;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-nez p1, :cond_4

    .line 65
    .line 66
    const-string p1, "\u5f53\u524d\u6ca1\u6709\u9700\u8981\u624b\u52a8\u540c\u6b65\u7684\u6587\u4ef6"

    .line 67
    .line 68
    invoke-static {p1}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 69
    .line 70
    .line 71
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 72
    .line 73
    return-object p1

    .line 74
    :cond_4
    new-instance p1, Lcom/friday/document/view/ManualSyncFileDialog;

    .line 75
    .line 76
    invoke-direct {p1}, Lcom/friday/document/view/ManualSyncFileDialog;-><init>()V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Lcom/friday/document/view/document/NewestFragment$onClick$1;->d:Lcom/friday/document/view/document/NewestFragment;

    .line 80
    .line 81
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    const-string v1, "getChildFragmentManager(...)"

    .line 86
    .line 87
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    const-class v1, Lcom/friday/document/view/ManualSyncFileDialog;

    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {p1, v0, v1}, Lcom/friday/common/base/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 100
    .line 101
    return-object p1
.end method
