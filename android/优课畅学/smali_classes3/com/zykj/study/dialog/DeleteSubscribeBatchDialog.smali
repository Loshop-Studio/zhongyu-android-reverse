.class public final Lcom/zykj/study/dialog/DeleteSubscribeBatchDialog;
.super Lcom/zykj/base/BaseDialogFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/dialog/DeleteSubscribeBatchDialog$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/base/BaseDialogFragment<",
        "Lcom/zykj/study/databinding/DialogBatchSubscribeDeleteBinding;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lcom/zykj/study/dialog/DeleteSubscribeBatchDialog$a;

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/study/dialog/DeleteSubscribeBatchDialog$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/study/dialog/DeleteSubscribeBatchDialog$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/study/dialog/DeleteSubscribeBatchDialog;->a:Lcom/zykj/study/dialog/DeleteSubscribeBatchDialog$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/study/dialog/DeleteSubscribeBatchDialog;->b:I

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

.method public static synthetic f(Lcom/zykj/study/dialog/DeleteSubscribeBatchDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/dialog/DeleteSubscribeBatchDialog;->i(Lcom/zykj/study/dialog/DeleteSubscribeBatchDialog;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic g(Lcom/zykj/study/dialog/DeleteSubscribeBatchDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/dialog/DeleteSubscribeBatchDialog;->h(Lcom/zykj/study/dialog/DeleteSubscribeBatchDialog;Landroid/view/View;)V

    return-void
.end method

.method public static final h(Lcom/zykj/study/dialog/DeleteSubscribeBatchDialog;Landroid/view/View;)V
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

.method public static final i(Lcom/zykj/study/dialog/DeleteSubscribeBatchDialog;Landroid/view/View;)V
    .locals 1

    .line 1
    new-instance p1, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v0, "DELETE_SUB_BATCH"

    .line 7
    .line 8
    invoke-static {p0, v0, p1}, Landroidx/fragment/app/FragmentKt;->setFragmentResult(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    sget p1, Lcom/zykj/study/R$string;->batch_delete_dialog_message:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    const-string v0, "number"

    .line 10
    .line 11
    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    if-nez p2, :cond_1

    .line 16
    .line 17
    :cond_0
    const/4 p2, 0x0

    .line 18
    invoke-static {p2}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    :cond_1
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-virtual {p0, p1, p2}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const-string p2, "getString(...)"

    .line 31
    .line 32
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    new-instance p2, Landroid/text/SpannableStringBuilder;

    .line 36
    .line 37
    invoke-direct {p2, p1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 38
    .line 39
    .line 40
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    .line 41
    .line 42
    const/high16 v1, -0x10000

    .line 43
    .line 44
    invoke-direct {v0, v1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    const/16 v1, 0x15

    .line 52
    .line 53
    sub-int/2addr p1, v1

    .line 54
    const/16 v2, 0x21

    .line 55
    .line 56
    invoke-virtual {p2, v0, v1, p1, v2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, Lcom/zykj/study/databinding/DialogBatchSubscribeDeleteBinding;

    .line 64
    .line 65
    iget-object p1, p1, Lcom/zykj/study/databinding/DialogBatchSubscribeDeleteBinding;->tvMessage:Landroidx/appcompat/widget/AppCompatTextView;

    .line 66
    .line 67
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    check-cast p1, Lcom/zykj/study/databinding/DialogBatchSubscribeDeleteBinding;

    .line 75
    .line 76
    iget-object p1, p1, Lcom/zykj/study/databinding/DialogBatchSubscribeDeleteBinding;->tvCancel:Landroidx/appcompat/widget/AppCompatTextView;

    .line 77
    .line 78
    new-instance p2, Lp4/j;

    .line 79
    .line 80
    invoke-direct {p2, p0}, Lp4/j;-><init>(Lcom/zykj/study/dialog/DeleteSubscribeBatchDialog;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    check-cast p1, Lcom/zykj/study/databinding/DialogBatchSubscribeDeleteBinding;

    .line 91
    .line 92
    iget-object p1, p1, Lcom/zykj/study/databinding/DialogBatchSubscribeDeleteBinding;->tvSure:Landroidx/appcompat/widget/AppCompatTextView;

    .line 93
    .line 94
    new-instance p2, Lp4/k;

    .line 95
    .line 96
    invoke-direct {p2, p0}, Lp4/k;-><init>(Lcom/zykj/study/dialog/DeleteSubscribeBatchDialog;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 100
    .line 101
    .line 102
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 103
    .line 104
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->dialog_batch_subscribe_delete:I

    .line 2
    .line 3
    return v0
.end method
