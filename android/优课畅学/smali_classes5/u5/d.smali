.class public final Lu5/d;
.super Landroid/app/Dialog;
.source "SourceFile"


# instance fields
.field public a:Lcom/zykj/view/databinding/ViewDialogCommonTipBinding;

.field public b:Lx7/a;

.field public c:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 2
    new-instance p1, Lu5/c;

    invoke-direct {p1}, Lu5/c;-><init>()V

    iput-object p1, p0, Lu5/d;->b:Lx7/a;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;IILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 3
    sget p2, Lcom/zykj/view/R$style;->AppTheme_Dialog:I

    :cond_0
    invoke-direct {p0, p1, p2}, Lu5/d;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public static synthetic a(Lu5/d;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lu5/d;->e(Lu5/d;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic b()Lh7/p;
    .locals 1

    .line 1
    invoke-static {}, Lu5/d;->d()Lh7/p;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lu5/d;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lu5/d;->f(Lu5/d;Landroid/view/View;)V

    return-void
.end method

.method public static final d()Lh7/p;
    .locals 1

    .line 1
    sget-object v0, Lh7/p;->a:Lh7/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final e(Lu5/d;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lu5/d;->b:Lx7/a;

    .line 5
    .line 6
    invoke-interface {p0}, Lx7/a;->invoke()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static final f(Lu5/d;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic h(Lu5/d;Ljava/lang/String;ZLx7/a;ZILjava/lang/Object;)V
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
    invoke-virtual {p0, p1, p2, p3, p4}, Lu5/d;->g(Ljava/lang/String;ZLx7/a;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/String;ZLx7/a;Z)V
    .locals 3

    .line 1
    const-string v0, "content"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-boolean p2, p0, Lu5/d;->c:Z

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/app/Dialog;->show()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lu5/d;->a:Lcom/zykj/view/databinding/ViewDialogCommonTipBinding;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    const-string v2, "mBinding"

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    move-object v0, v1

    .line 27
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewDialogCommonTipBinding;->d:Landroid/widget/TextView;

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, p2}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 33
    .line 34
    .line 35
    iput-object p3, p0, Lu5/d;->b:Lx7/a;

    .line 36
    .line 37
    iget-object p1, p0, Lu5/d;->a:Lcom/zykj/view/databinding/ViewDialogCommonTipBinding;

    .line 38
    .line 39
    if-nez p1, :cond_1

    .line 40
    .line 41
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move-object v1, p1

    .line 46
    :goto_0
    iget-object p1, v1, Lcom/zykj/view/databinding/ViewDialogCommonTipBinding;->b:Landroid/widget/TextView;

    .line 47
    .line 48
    const-string p2, "tvCancel"

    .line 49
    .line 50
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    if-eqz p4, :cond_2

    .line 54
    .line 55
    const/4 p2, 0x0

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    const/16 p2, 0x8

    .line 58
    .line 59
    :goto_1
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

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
    invoke-static {p1}, Lcom/zykj/view/databinding/ViewDialogCommonTipBinding;->a(Landroid/view/LayoutInflater;)Lcom/zykj/view/databinding/ViewDialogCommonTipBinding;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v0, "inflate(...)"

    .line 17
    .line 18
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lu5/d;->a:Lcom/zykj/view/databinding/ViewDialogCommonTipBinding;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    const-string v1, "mBinding"

    .line 25
    .line 26
    if-nez p1, :cond_0

    .line 27
    .line 28
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    move-object p1, v0

    .line 32
    :cond_0
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lu5/d;->a:Lcom/zykj/view/databinding/ViewDialogCommonTipBinding;

    .line 40
    .line 41
    if-nez p1, :cond_1

    .line 42
    .line 43
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    move-object p1, v0

    .line 47
    :cond_1
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewDialogCommonTipBinding;->c:Landroid/widget/TextView;

    .line 48
    .line 49
    new-instance v2, Lu5/a;

    .line 50
    .line 51
    invoke-direct {v2, p0}, Lu5/a;-><init>(Lu5/d;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, Lu5/d;->a:Lcom/zykj/view/databinding/ViewDialogCommonTipBinding;

    .line 58
    .line 59
    if-nez p1, :cond_2

    .line 60
    .line 61
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    move-object v0, p1

    .line 66
    :goto_0
    iget-object p1, v0, Lcom/zykj/view/databinding/ViewDialogCommonTipBinding;->b:Landroid/widget/TextView;

    .line 67
    .line 68
    new-instance v0, Lu5/b;

    .line 69
    .line 70
    invoke-direct {v0, p0}, Lu5/b;-><init>(Lu5/d;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x4

    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    iget-boolean v0, p0, Lu5/d;->c:Z

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
