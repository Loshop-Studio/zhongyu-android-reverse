.class public Lm6/c;
.super Landroid/app/Dialog;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final c:Landroid/widget/TextView;

.field public final d:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget v0, Lcom/luck/picture/lib/R$style;->Picture_Theme_Dialog:I

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 4
    .line 5
    .line 6
    sget p1, Lcom/luck/picture/lib/R$layout;->ps_remind_dialog:I

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setContentView(I)V

    .line 9
    .line 10
    .line 11
    sget p1, Lcom/luck/picture/lib/R$id;->btnOk:I

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Landroid/widget/TextView;

    .line 18
    .line 19
    iput-object p1, p0, Lm6/c;->c:Landroid/widget/TextView;

    .line 20
    .line 21
    sget v0, Lcom/luck/picture/lib/R$id;->tv_content:I

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Landroid/widget/TextView;

    .line 28
    .line 29
    iput-object v0, p0, Lm6/c;->d:Landroid/widget/TextView;

    .line 30
    .line 31
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lm6/c;->b()V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Lm6/c;
    .locals 1

    .line 1
    new-instance v0, Lm6/c;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lm6/c;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public final b()V
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

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    sget v0, Lcom/luck/picture/lib/R$id;->btnOk:I

    .line 6
    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method
