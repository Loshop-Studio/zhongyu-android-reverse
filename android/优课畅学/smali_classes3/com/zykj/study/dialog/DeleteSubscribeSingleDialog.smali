.class public final Lcom/zykj/study/dialog/DeleteSubscribeSingleDialog;
.super Lcom/zykj/base/BaseDialogFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/dialog/DeleteSubscribeSingleDialog$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/base/BaseDialogFragment<",
        "Lcom/zykj/study/databinding/DialogSingleSubscribeDeleteBinding;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lcom/zykj/study/dialog/DeleteSubscribeSingleDialog$a;

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/study/dialog/DeleteSubscribeSingleDialog$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/study/dialog/DeleteSubscribeSingleDialog$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/study/dialog/DeleteSubscribeSingleDialog;->a:Lcom/zykj/study/dialog/DeleteSubscribeSingleDialog$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/study/dialog/DeleteSubscribeSingleDialog;->b:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/base/BaseDialogFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f(Lcom/zykj/study/dialog/DeleteSubscribeSingleDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/dialog/DeleteSubscribeSingleDialog;->i(Lcom/zykj/study/dialog/DeleteSubscribeSingleDialog;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic g(Lcom/zykj/study/dialog/DeleteSubscribeSingleDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/dialog/DeleteSubscribeSingleDialog;->h(Lcom/zykj/study/dialog/DeleteSubscribeSingleDialog;Landroid/view/View;)V

    return-void
.end method

.method public static final h(Lcom/zykj/study/dialog/DeleteSubscribeSingleDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final i(Lcom/zykj/study/dialog/DeleteSubscribeSingleDialog;Landroid/view/View;)V
    .locals 2

    .line 1
    new-instance p1, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "accountId"

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sget-object v0, Lh7/p;->a:Lh7/p;

    .line 24
    .line 25
    const-string v0, "DELETE_SUB_SING"

    .line 26
    .line 27
    invoke-static {p0, v0, p1}, Landroidx/fragment/app/FragmentKt;->setFragmentResult(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 28
    .line 29
    .line 30
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p0}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 35
    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/study/databinding/DialogSingleSubscribeDeleteBinding;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/zykj/study/databinding/DialogSingleSubscribeDeleteBinding;->tvCancel:Landroidx/appcompat/widget/AppCompatTextView;

    .line 8
    .line 9
    new-instance p2, Lp4/l;

    .line 10
    .line 11
    invoke-direct {p2, p0}, Lp4/l;-><init>(Lcom/zykj/study/dialog/DeleteSubscribeSingleDialog;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lcom/zykj/study/databinding/DialogSingleSubscribeDeleteBinding;

    .line 22
    .line 23
    iget-object p1, p1, Lcom/zykj/study/databinding/DialogSingleSubscribeDeleteBinding;->tvSure:Landroidx/appcompat/widget/AppCompatTextView;

    .line 24
    .line 25
    new-instance p2, Lp4/m;

    .line 26
    .line 27
    invoke-direct {p2, p0}, Lp4/m;-><init>(Lcom/zykj/study/dialog/DeleteSubscribeSingleDialog;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 31
    .line 32
    .line 33
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 34
    .line 35
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->dialog_single_subscribe_delete:I

    .line 2
    .line 3
    return v0
.end method
