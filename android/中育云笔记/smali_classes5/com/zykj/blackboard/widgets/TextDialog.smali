.class public final Lcom/zykj/blackboard/widgets/TextDialog;
.super Landroid/app/Dialog;
.source "SourceFile"


# instance fields
.field public c:Lhd/l;

.field public d:Lhd/l;

.field public e:Lhd/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 2
    sget-object p1, Lcom/zykj/blackboard/widgets/TextDialog$afterTextChangedCallback$1;->c:Lcom/zykj/blackboard/widgets/TextDialog$afterTextChangedCallback$1;

    iput-object p1, p0, Lcom/zykj/blackboard/widgets/TextDialog;->c:Lhd/l;

    .line 3
    sget-object p1, Lcom/zykj/blackboard/widgets/TextDialog$doneCallback$1;->c:Lcom/zykj/blackboard/widgets/TextDialog$doneCallback$1;

    iput-object p1, p0, Lcom/zykj/blackboard/widgets/TextDialog;->d:Lhd/l;

    .line 4
    sget-object p1, Lcom/zykj/blackboard/widgets/TextDialog$cancelCallback$1;->c:Lcom/zykj/blackboard/widgets/TextDialog$cancelCallback$1;

    iput-object p1, p0, Lcom/zykj/blackboard/widgets/TextDialog;->e:Lhd/a;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;IILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 5
    sget p2, Lcom/zykj/blackboard/R$style;->AppTheme_Dialog:I

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/zykj/blackboard/widgets/TextDialog;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public static synthetic a(Lcom/zykj/blackboard/widgets/TextDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/blackboard/widgets/TextDialog;->c(Lcom/zykj/blackboard/widgets/TextDialog;Landroid/view/View;)V

    return-void
.end method

.method public static final c(Lcom/zykj/blackboard/widgets/TextDialog;Landroid/view/View;)V
    .locals 1

    .line 1
    const-string p1, "this$0"

    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/zykj/blackboard/widgets/TextDialog;->d:Lhd/l;

    .line 7
    .line 8
    sget v0, Lcom/zykj/blackboard/R$id;->et_input:I

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Landroid/widget/EditText;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {p1, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 28
    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final b()Lhd/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/widgets/TextDialog;->c:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d(Ljava/lang/String;Lhd/l;Lhd/l;Lhd/a;)V
    .locals 1

    .line 1
    const-string v0, "initText"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "afterTextChangeCallback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "doneCallback"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "cancelCallback"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iput-object p2, p0, Lcom/zykj/blackboard/widgets/TextDialog;->c:Lhd/l;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/zykj/blackboard/widgets/TextDialog;->d:Lhd/l;

    .line 24
    .line 25
    iput-object p4, p0, Lcom/zykj/blackboard/widgets/TextDialog;->e:Lhd/a;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/app/Dialog;->show()V

    .line 28
    .line 29
    .line 30
    sget p2, Lcom/zykj/blackboard/R$id;->et_input:I

    .line 31
    .line 32
    invoke-virtual {p0, p2}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    check-cast p2, Landroid/widget/EditText;

    .line 37
    .line 38
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    sget p1, Lcom/zykj/blackboard/R$layout;->model_blackboard_dialog_text:I

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setContentView(I)V

    .line 7
    .line 8
    .line 9
    sget p1, Lcom/zykj/blackboard/R$id;->et_input:I

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Landroid/widget/EditText;

    .line 16
    .line 17
    new-instance v0, Lcom/zykj/blackboard/widgets/TextDialog$a;

    .line 18
    .line 19
    invoke-direct {v0, p0}, Lcom/zykj/blackboard/widgets/TextDialog$a;-><init>(Lcom/zykj/blackboard/widgets/TextDialog;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 23
    .line 24
    .line 25
    sget p1, Lcom/zykj/blackboard/R$id;->btn_confirm:I

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Landroid/widget/Button;

    .line 32
    .line 33
    new-instance v0, Loa/a;

    .line 34
    .line 35
    invoke-direct {v0, p0}, Loa/a;-><init>(Lcom/zykj/blackboard/widgets/TextDialog;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 39
    .line 40
    .line 41
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
    iget-object v0, p0, Lcom/zykj/blackboard/widgets/TextDialog;->e:Lhd/a;

    .line 10
    .line 11
    invoke-interface {v0}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1

    .line 19
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1
.end method

.method public onStart()V
    .locals 6

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->onStart()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Rect;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2, v0}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    const-string v3, "context.resources"

    .line 31
    .line 32
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const-string v3, "dimen"

    .line 36
    .line 37
    const-string v4, "android"

    .line 38
    .line 39
    const-string v5, "status_bar_height"

    .line 40
    .line 41
    invoke-virtual {v2, v5, v3, v4}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    sub-int/2addr v0, v2

    .line 58
    invoke-virtual {v1, v3, v0}, Landroid/view/Window;->setLayout(II)V

    .line 59
    .line 60
    .line 61
    :cond_0
    return-void
.end method
