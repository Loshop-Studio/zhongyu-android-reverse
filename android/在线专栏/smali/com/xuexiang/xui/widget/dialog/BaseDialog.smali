.class public Lcom/xuexiang/xui/widget/dialog/BaseDialog;
.super Landroidx/appcompat/app/e;
.source "SourceFile"


# instance fields
.field private mContentView:Landroid/view/View;

.field private mIsSyncSystemUiVisibility:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 3
    sget v0, Lcom/xuexiang/xui/R$style;->XUIDialog_Custom:I

    invoke-direct {p0, p1, v0}, Landroidx/appcompat/app/e;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    .line 1
    sget v0, Lcom/xuexiang/xui/R$style;->XUIDialog_Custom:I

    invoke-direct {p0, p1, v0, p2}, Lcom/xuexiang/xui/widget/dialog/BaseDialog;-><init>(Landroid/content/Context;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;II)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/app/e;-><init>(Landroid/content/Context;I)V

    .line 5
    invoke-virtual {p0, p3}, Lcom/xuexiang/xui/widget/dialog/BaseDialog;->init(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ILandroid/view/View;)V
    .locals 0

    .line 6
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/app/e;-><init>(Landroid/content/Context;I)V

    .line 7
    invoke-direct {p0, p3}, Lcom/xuexiang/xui/widget/dialog/BaseDialog;->init(Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/View;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$style;->XUIDialog_Custom:I

    invoke-direct {p0, p1, v0, p2}, Lcom/xuexiang/xui/widget/dialog/BaseDialog;-><init>(Landroid/content/Context;ILandroid/view/View;)V

    return-void
.end method

.method private init(Landroid/view/View;)V
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/e;->setContentView(Landroid/view/View;)V

    .line 4
    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/BaseDialog;->mContentView:Landroid/view/View;

    const/4 p1, 0x1

    .line 5
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    return-void
.end method


# virtual methods
.method public findViewById(I)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/BaseDialog;->mContentView:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public getDrawable(I)Landroid/graphics/drawable/Drawable;
    .locals 1

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method public getString(I)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public init(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/dialog/BaseDialog;->init(Landroid/view/View;)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    invoke-static {p1, p0}, Lcom/xuexiang/xui/utils/KeyboardUtils;->dispatchTouchEvent(Landroid/view/MotionEvent;Landroid/app/Dialog;)V

    .line 2
    invoke-super {p0, p1}, Landroid/app/Dialog;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method protected performShow()V
    .locals 0

    invoke-super {p0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public setDialogSize(II)Lcom/xuexiang/xui/widget/dialog/BaseDialog;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    .line 3
    iput p1, v1, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 4
    iput p2, v1, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 5
    invoke-virtual {v0, v1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    :cond_0
    return-object p0
.end method

.method public setIsSyncSystemUiVisibility(Z)Lcom/xuexiang/xui/widget/dialog/BaseDialog;
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/dialog/BaseDialog;->mIsSyncSystemUiVisibility:Z

    return-object p0
.end method

.method public show()V
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/BaseDialog;->mIsSyncSystemUiVisibility:Z

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/dialog/BaseDialog;->showIfSync(Z)V

    return-void
.end method

.method public showIfSync(Z)V
    .locals 2

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/xuexiang/xui/utils/WidgetUtils;->findActivity(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    new-instance v1, Lcom/xuexiang/xui/widget/dialog/BaseDialog$1;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/dialog/BaseDialog$1;-><init>(Lcom/xuexiang/xui/widget/dialog/BaseDialog;)V

    invoke-static {p1, v0, v1}, Lcom/xuexiang/xui/utils/StatusBarUtils;->showWindow(Landroid/app/Activity;Landroid/view/Window;Lcom/xuexiang/xui/utils/StatusBarUtils$IWindowShower;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/dialog/BaseDialog;->performShow()V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/dialog/BaseDialog;->performShow()V

    :cond_1
    :goto_0
    return-void
.end method
