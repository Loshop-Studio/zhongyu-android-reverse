.class public Lm6/b;
.super Landroid/app/Dialog;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    sget v0, Lcom/luck/picture/lib/R$style;->Picture_Theme_AlertDialog:I

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, -0x2

    .line 10
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 11
    .line 12
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 13
    .line 14
    const/16 v1, 0x11

    .line 15
    .line 16
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    sget v2, Lcom/luck/picture/lib/R$style;->PictureThemeDialogWindowStyle:I

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1, v0}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    sget p1, Lcom/luck/picture/lib/R$layout;->ps_alert_dialog:I

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setContentView(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lm6/b;->a()V

    .line 10
    .line 11
    .line 12
    return-void
.end method
