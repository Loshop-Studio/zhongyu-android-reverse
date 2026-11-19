.class public Lcom/luck/picture/lib/dialog/PhotoItemSelectedDialog;
.super Landroidx/fragment/app/DialogFragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/luck/picture/lib/dialog/PhotoItemSelectedDialog$a;
    }
.end annotation


# instance fields
.field public d:Z

.field public e:Lq6/c;

.field public f:Lcom/luck/picture/lib/dialog/PhotoItemSelectedDialog$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/DialogFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/luck/picture/lib/dialog/PhotoItemSelectedDialog;->d:Z

    .line 6
    .line 7
    return-void
.end method

.method public static p()Lcom/luck/picture/lib/dialog/PhotoItemSelectedDialog;
    .locals 1

    .line 1
    new-instance v0, Lcom/luck/picture/lib/dialog/PhotoItemSelectedDialog;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/luck/picture/lib/dialog/PhotoItemSelectedDialog;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public final o()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v1}, La7/e;->e(Landroid/content/Context;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, -0x2

    .line 22
    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setLayout(II)V

    .line 23
    .line 24
    .line 25
    const/16 v1, 0x50

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/view/Window;->setGravity(I)V

    .line 28
    .line 29
    .line 30
    sget v1, Lcom/luck/picture/lib/R$style;->PictureThemeDialogFragmentAnim:I

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/luck/picture/lib/dialog/PhotoItemSelectedDialog;->e:Lq6/c;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    sget v2, Lcom/luck/picture/lib/R$id;->ps_tv_photo:I

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    if-ne v0, v2, :cond_0

    .line 13
    .line 14
    invoke-interface {v1, p1, v3}, Lq6/c;->a(Landroid/view/View;I)V

    .line 15
    .line 16
    .line 17
    iput-boolean v3, p0, Lcom/luck/picture/lib/dialog/PhotoItemSelectedDialog;->d:Z

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    sget v2, Lcom/luck/picture/lib/R$id;->ps_tv_video:I

    .line 21
    .line 22
    if-ne v0, v2, :cond_1

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-interface {v1, p1, v0}, Lq6/c;->a(Landroid/view/View;I)V

    .line 26
    .line 27
    .line 28
    iput-boolean v3, p0, Lcom/luck/picture/lib/dialog/PhotoItemSelectedDialog;->d:Z

    .line 29
    .line 30
    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->dismissAllowingStateLoss()V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    const/4 v0, 0x1

    .line 12
    invoke-virtual {p3, v0}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    invoke-virtual {p3}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    if-eqz p3, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    invoke-virtual {p3}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    const v0, 0x106000d

    .line 34
    .line 35
    .line 36
    invoke-virtual {p3, v0}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 37
    .line 38
    .line 39
    :cond_0
    sget p3, Lcom/luck/picture/lib/R$layout;->ps_dialog_camera_selected:I

    .line 40
    .line 41
    invoke-virtual {p1, p3, p2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    return-object p1
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/DialogFragment;->onDismiss(Landroid/content/DialogInterface;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/luck/picture/lib/dialog/PhotoItemSelectedDialog;->f:Lcom/luck/picture/lib/dialog/PhotoItemSelectedDialog$a;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-boolean v1, p0, Lcom/luck/picture/lib/dialog/PhotoItemSelectedDialog;->d:Z

    .line 9
    .line 10
    invoke-interface {v0, v1, p1}, Lcom/luck/picture/lib/dialog/PhotoItemSelectedDialog$a;->a(ZLandroid/content/DialogInterface;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public onStart()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/DialogFragment;->onStart()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/luck/picture/lib/dialog/PhotoItemSelectedDialog;->o()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    sget p2, Lcom/luck/picture/lib/R$id;->ps_tv_photo:I

    .line 5
    .line 6
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    check-cast p2, Landroid/widget/TextView;

    .line 11
    .line 12
    sget v0, Lcom/luck/picture/lib/R$id;->ps_tv_video:I

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Landroid/widget/TextView;

    .line 19
    .line 20
    sget v1, Lcom/luck/picture/lib/R$id;->ps_tv_cancel:I

    .line 21
    .line 22
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Landroid/widget/TextView;

    .line 27
    .line 28
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public q(Lcom/luck/picture/lib/dialog/PhotoItemSelectedDialog$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/dialog/PhotoItemSelectedDialog;->f:Lcom/luck/picture/lib/dialog/PhotoItemSelectedDialog$a;

    .line 2
    .line 3
    return-void
.end method

.method public r(Lq6/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/dialog/PhotoItemSelectedDialog;->e:Lq6/c;

    .line 2
    .line 3
    return-void
.end method

.method public show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1, p0, p2}, Landroidx/fragment/app/FragmentTransaction;->add(Landroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/FragmentTransaction;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 9
    .line 10
    .line 11
    return-void
.end method
