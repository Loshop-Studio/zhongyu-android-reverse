.class public final Lcom/zykj/view/dialog/CommonTipDialog;
.super Landroid/app/Dialog;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0014\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J5\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00102\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00162\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010 \u00a8\u0006!"
    }
    d2 = {
        "Lcom/zykj/view/dialog/CommonTipDialog;",
        "Landroid/app/Dialog;",
        "Landroid/content/Context;",
        "context",
        "",
        "themeResId",
        "<init>",
        "(Landroid/content/Context;I)V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Ld6/s;",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "keyCode",
        "Landroid/view/KeyEvent;",
        "event",
        "",
        "onKeyDown",
        "(ILandroid/view/KeyEvent;)Z",
        "",
        "content",
        "cancelAble",
        "Lkotlin/Function0;",
        "callback",
        "needCancelButton",
        "showDialog",
        "(Ljava/lang/String;ZLr6/a;Z)V",
        "Lcom/zykj/view/databinding/ViewDialogCommonTipBinding;",
        "mBinding",
        "Lcom/zykj/view/databinding/ViewDialogCommonTipBinding;",
        "confirmCallback",
        "Lr6/a;",
        "Z",
        "view_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCommonTipDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonTipDialog.kt\ncom/zykj/view/dialog/CommonTipDialog\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,52:1\n257#2,2:53\n*S KotlinDebug\n*F\n+ 1 CommonTipDialog.kt\ncom/zykj/view/dialog/CommonTipDialog\n*L\n50#1:53,2\n*E\n"
    }
.end annotation


# instance fields
.field private cancelAble:Z

.field private confirmCallback:Lr6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/a;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private mBinding:Lcom/zykj/view/databinding/ViewDialogCommonTipBinding;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 2
    new-instance p1, Lcom/zykj/view/board/play/b;

    const/4 p2, 0x2

    invoke-direct {p1, p2}, Lcom/zykj/view/board/play/b;-><init>(I)V

    iput-object p1, p0, Lcom/zykj/view/dialog/CommonTipDialog;->confirmCallback:Lr6/a;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;IILkotlin/jvm/internal/e;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 3
    sget p2, Lcom/zykj/view/R$style;->AppTheme_Dialog:I

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/zykj/view/dialog/CommonTipDialog;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public static synthetic a(Lcom/zykj/view/dialog/CommonTipDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/dialog/CommonTipDialog;->onCreate$lambda$1(Lcom/zykj/view/dialog/CommonTipDialog;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic b()Ld6/s;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/view/dialog/CommonTipDialog;->confirmCallback$lambda$0()Ld6/s;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lcom/zykj/view/dialog/CommonTipDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/dialog/CommonTipDialog;->onCreate$lambda$2(Lcom/zykj/view/dialog/CommonTipDialog;Landroid/view/View;)V

    return-void
.end method

.method private static final confirmCallback$lambda$0()Ld6/s;
    .locals 1

    .line 1
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 2
    .line 3
    return-object v0
.end method

.method private static final onCreate$lambda$1(Lcom/zykj/view/dialog/CommonTipDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/zykj/view/dialog/CommonTipDialog;->confirmCallback:Lr6/a;

    .line 5
    .line 6
    invoke-interface {p0}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private static final onCreate$lambda$2(Lcom/zykj/view/dialog/CommonTipDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic showDialog$default(Lcom/zykj/view/dialog/CommonTipDialog;Ljava/lang/String;ZLr6/a;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p5, p5, 0x8

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const/4 p4, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/zykj/view/dialog/CommonTipDialog;->showDialog(Ljava/lang/String;ZLr6/a;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 4
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1}, Lcom/zykj/view/databinding/ViewDialogCommonTipBinding;->inflate(Landroid/view/LayoutInflater;)Lcom/zykj/view/databinding/ViewDialogCommonTipBinding;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v0, "inflate(...)"

    .line 17
    .line 18
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lcom/zykj/view/dialog/CommonTipDialog;->mBinding:Lcom/zykj/view/databinding/ViewDialogCommonTipBinding;

    .line 22
    .line 23
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lcom/zykj/view/dialog/CommonTipDialog;->mBinding:Lcom/zykj/view/databinding/ViewDialogCommonTipBinding;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    const-string v1, "mBinding"

    .line 34
    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewDialogCommonTipBinding;->tvConfirm:Landroid/widget/TextView;

    .line 38
    .line 39
    new-instance v2, Lcom/zykj/view/dialog/a;

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-direct {v2, p0, v3}, Lcom/zykj/view/dialog/a;-><init>(Lcom/zykj/view/dialog/CommonTipDialog;I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lcom/zykj/view/dialog/CommonTipDialog;->mBinding:Lcom/zykj/view/databinding/ViewDialogCommonTipBinding;

    .line 49
    .line 50
    if-eqz p1, :cond_0

    .line 51
    .line 52
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewDialogCommonTipBinding;->tvCancel:Landroid/widget/TextView;

    .line 53
    .line 54
    new-instance v0, Lcom/zykj/view/dialog/a;

    .line 55
    .line 56
    const/4 v1, 0x1

    .line 57
    invoke-direct {v0, p0, v1}, Lcom/zykj/view/dialog/a;-><init>(Lcom/zykj/view/dialog/CommonTipDialog;I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_0
    invoke-static {v1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v0

    .line 68
    :cond_1
    invoke-static {v1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw v0
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1
    .param p2    # Landroid/view/KeyEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x4

    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    iget-boolean v0, p0, Lcom/zykj/view/dialog/CommonTipDialog;->cancelAble:Z

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1
.end method

.method public final showDialog(Ljava/lang/String;ZLr6/a;Z)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lr6/a;",
            "Z)V"
        }
    .end annotation

    .line 1
    const-string v0, "content"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-boolean p2, p0, Lcom/zykj/view/dialog/CommonTipDialog;->cancelAble:Z

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/app/Dialog;->show()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/view/dialog/CommonTipDialog;->mBinding:Lcom/zykj/view/databinding/ViewDialogCommonTipBinding;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    const-string v2, "mBinding"

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewDialogCommonTipBinding;->tvContent:Landroid/widget/TextView;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p2}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 29
    .line 30
    .line 31
    iput-object p3, p0, Lcom/zykj/view/dialog/CommonTipDialog;->confirmCallback:Lr6/a;

    .line 32
    .line 33
    iget-object p1, p0, Lcom/zykj/view/dialog/CommonTipDialog;->mBinding:Lcom/zykj/view/databinding/ViewDialogCommonTipBinding;

    .line 34
    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewDialogCommonTipBinding;->tvCancel:Landroid/widget/TextView;

    .line 38
    .line 39
    const-string p2, "tvCancel"

    .line 40
    .line 41
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    if-eqz p4, :cond_0

    .line 45
    .line 46
    const/4 p2, 0x0

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const/16 p2, 0x8

    .line 49
    .line 50
    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v1

    .line 58
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v1
.end method
