.class public Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected animGravity:I

.field protected clickView:Landroid/view/View;

.field protected contentContainer:Landroid/view/ViewGroup;

.field private context:Landroid/content/Context;

.field private dialogView:Landroid/view/ViewGroup;

.field private dismissing:Z

.field private inAnim:Landroid/view/animation/Animation;

.field private isAnim:Z

.field private isShowing:Z

.field protected mDialog:Landroid/app/Dialog;

.field protected mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

.field private final onCancelableTouchListener:Landroid/view/View$OnTouchListener;

.field private onDismissListener:Lcom/xuexiang/xui/widget/picker/widget/listener/OnDismissListener;

.field private onKeyBackListener:Landroid/view/View$OnKeyListener;

.field private outAnim:Landroid/view/animation/Animation;

.field private rootView:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x50

    .line 2
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->animGravity:I

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->isAnim:Z

    .line 4
    new-instance v0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView$4;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView$4;-><init>(Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->onKeyBackListener:Landroid/view/View$OnKeyListener;

    .line 5
    new-instance v0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView$5;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView$5;-><init>(Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->onCancelableTouchListener:Landroid/view/View$OnTouchListener;

    .line 6
    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->context:Landroid/content/Context;

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;)Landroid/view/ViewGroup;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->rootView:Landroid/view/ViewGroup;

    return-object p0
.end method

.method static synthetic access$102(Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->isShowing:Z

    return p1
.end method

.method static synthetic access$202(Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->dismissing:Z

    return p1
.end method

.method static synthetic access$300(Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;)Lcom/xuexiang/xui/widget/picker/widget/listener/OnDismissListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->onDismissListener:Lcom/xuexiang/xui/widget/picker/widget/listener/OnDismissListener;

    return-object p0
.end method

.method private dismissDialog()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mDialog:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    return-void
.end method

.method private getInAnimation()Landroid/view/animation/Animation;
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->animGravity:I

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/xuexiang/xui/widget/picker/widget/utils/PickerViewAnimateUtils;->getAnimationResource(IZ)I

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->context:Landroid/content/Context;

    invoke-static {v1, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    return-object v0
.end method

.method private getOutAnimation()Landroid/view/animation/Animation;
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->animGravity:I

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/xuexiang/xui/widget/picker/widget/utils/PickerViewAnimateUtils;->getAnimationResource(IZ)I

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->context:Landroid/content/Context;

    invoke-static {v1, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    return-object v0
.end method

.method private getWindowWidth(Landroid/view/Window;)I
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/Window;->getWindowManager()Landroid/view/WindowManager;

    move-result-object p1

    .line 2
    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p1

    .line 3
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    .line 4
    invoke-virtual {p1, v0}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 5
    iget p1, v0, Landroid/graphics/Point;->x:I

    return p1
.end method

.method private onAttached(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->decorView:Landroid/view/ViewGroup;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->isAnim:Z

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->contentContainer:Landroid/view/ViewGroup;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->inAnim:Landroid/view/animation/Animation;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_0
    return-void
.end method

.method private setWindowMaxWidth(Landroid/view/Window;)V
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->getWindowWidth(Landroid/view/Window;)I

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->context:Landroid/content/Context;

    sget v2, Lcom/xuexiang/xui/R$attr;->md_dialog_horizontal_margin:I

    sget v3, Lcom/xuexiang/xui/R$dimen;->default_md_dialog_horizontal_margin_phone:I

    invoke-static {v3}, Lcom/xuexiang/xui/utils/ResUtils;->getDimensionPixelSize(I)I

    move-result v3

    invoke-static {v1, v2, v3}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;II)I

    move-result v1

    .line 3
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->context:Landroid/content/Context;

    sget v3, Lcom/xuexiang/xui/R$attr;->md_dialog_max_width:I

    invoke-static {v2, v3}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result v2

    mul-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    .line 4
    new-instance v1, Landroid/view/WindowManager$LayoutParams;

    invoke-direct {v1}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    .line 5
    invoke-virtual {p1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/view/WindowManager$LayoutParams;->copyFrom(Landroid/view/WindowManager$LayoutParams;)I

    .line 6
    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, v1, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 7
    invoke-virtual {p1, v1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    return-void
.end method

.method private showDialog()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mDialog:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    :cond_0
    return-void
.end method


# virtual methods
.method public createDialog()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->dialogView:Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    .line 2
    new-instance v0, Landroid/app/Dialog;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->context:Landroid/content/Context;

    sget v2, Lcom/xuexiang/xui/R$style;->XUIDialog_Custom:I

    invoke-direct {v0, v1, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mDialog:Landroid/app/Dialog;

    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-boolean v1, v1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->cancelable:Z

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mDialog:Landroid/app/Dialog;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->dialogView:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mDialog:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 6
    sget v1, Lcom/xuexiang/xui/R$style;->picker_view_scale_anim:I

    invoke-virtual {v0, v1}, Landroid/view/Window;->setWindowAnimations(I)V

    const/16 v1, 0x11

    .line 7
    invoke-virtual {v0, v1}, Landroid/view/Window;->setGravity(I)V

    .line 8
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->setWindowMaxWidth(Landroid/view/Window;)V

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mDialog:Landroid/app/Dialog;

    new-instance v1, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView$6;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView$6;-><init>(Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;)V

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    :cond_1
    return-void
.end method

.method public dismiss()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->isDialog()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->dismissDialog()V

    goto :goto_1

    .line 3
    :cond_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->dismissing:Z

    if-eqz v0, :cond_1

    return-void

    .line 4
    :cond_1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->isAnim:Z

    if-eqz v0, :cond_2

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->outAnim:Landroid/view/animation/Animation;

    new-instance v1, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView$2;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView$2;-><init>(Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->contentContainer:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->outAnim:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0

    .line 7
    :cond_2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->dismissImmediately()V

    :goto_0
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->dismissing:Z

    :goto_1
    return-void
.end method

.method public dismissImmediately()V
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->decorView:Landroid/view/ViewGroup;

    new-instance v1, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView$3;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView$3;-><init>(Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public findViewById(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->contentContainer:Landroid/view/ViewGroup;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public getDialog()Landroid/app/Dialog;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mDialog:Landroid/app/Dialog;

    return-object v0
.end method

.method public getDialogContainerLayout()Landroid/view/ViewGroup;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->contentContainer:Landroid/view/ViewGroup;

    return-object v0
.end method

.method protected initAnim()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->getInAnimation()Landroid/view/animation/Animation;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->inAnim:Landroid/view/animation/Animation;

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->getOutAnimation()Landroid/view/animation/Animation;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->outAnim:Landroid/view/animation/Animation;

    return-void
.end method

.method protected initEvents()V
    .locals 0

    return-void
.end method

.method protected initViews()V
    .locals 6

    .line 1
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    const/16 v3, 0x50

    invoke-direct {v0, v1, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 2
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->context:Landroid/content/Context;

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->isDialog()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    .line 4
    sget v1, Lcom/xuexiang/xui/R$layout;->xui_layout_picker_view_base:I

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    iput-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->dialogView:Landroid/view/ViewGroup;

    .line 5
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->setBackgroundColor(I)V

    .line 6
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->dialogView:Landroid/view/ViewGroup;

    sget v2, Lcom/xuexiang/xui/R$id;->content_container:I

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    iput-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->contentContainer:Landroid/view/ViewGroup;

    const/16 v2, 0x1e

    .line 7
    iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 8
    iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 9
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 10
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->createDialog()V

    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->dialogView:Landroid/view/ViewGroup;

    new-instance v1, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView$1;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView$1;-><init>(Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 12
    :cond_0
    iget-object v3, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-object v5, v3, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->decorView:Landroid/view/ViewGroup;

    if-nez v5, :cond_1

    .line 13
    iget-object v5, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->context:Landroid/content/Context;

    check-cast v5, Landroid/app/Activity;

    invoke-virtual {v5}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/view/ViewGroup;

    iput-object v5, v3, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->decorView:Landroid/view/ViewGroup;

    .line 14
    :cond_1
    sget v3, Lcom/xuexiang/xui/R$layout;->xui_layout_picker_view_base:I

    iget-object v5, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-object v5, v5, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->decorView:Landroid/view/ViewGroup;

    invoke-virtual {v2, v3, v5, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    iput-object v2, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->rootView:Landroid/view/ViewGroup;

    .line 15
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v3, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 16
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget v2, v2, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->backgroundId:I

    if-eq v2, v1, :cond_2

    .line 17
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->rootView:Landroid/view/ViewGroup;

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->setBackgroundColor(I)V

    .line 18
    :cond_2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->rootView:Landroid/view/ViewGroup;

    sget v2, Lcom/xuexiang/xui/R$id;->content_container:I

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    iput-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->contentContainer:Landroid/view/ViewGroup;

    .line 19
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :goto_0
    const/4 v0, 0x1

    .line 20
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->setKeyBackCancelable(Z)V

    return-void
.end method

.method public isDialog()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isShowing()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->isDialog()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->rootView:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->isShowing:Z

    if-eqz v0, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public setDialogOutSideCancelable()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mDialog:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-boolean v1, v1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->cancelable:Z

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    :cond_0
    return-void
.end method

.method public setKeyBackCancelable(Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->isDialog()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->dialogView:Landroid/view/ViewGroup;

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->rootView:Landroid/view/ViewGroup;

    .line 4
    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->setFocusable(Z)V

    .line 5
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->setFocusableInTouchMode(Z)V

    if-eqz p1, :cond_1

    .line 6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->onKeyBackListener:Landroid/view/View$OnKeyListener;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    .line 7
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    :goto_1
    return-void
.end method

.method public setOnDismissListener(Lcom/xuexiang/xui/widget/picker/widget/listener/OnDismissListener;)Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->onDismissListener:Lcom/xuexiang/xui/widget/picker/widget/listener/OnDismissListener;

    return-object p0
.end method

.method protected setOutSideCancelable(Z)Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->rootView:Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    .line 2
    sget v1, Lcom/xuexiang/xui/R$id;->outmost_container:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->onCancelableTouchListener:Landroid/view/View$OnTouchListener;

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 4
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    :cond_1
    :goto_0
    return-object p0
.end method

.method public show()V
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->isDialog()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 9
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->showDialog()V

    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->isShowing:Z

    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->rootView:Landroid/view/ViewGroup;

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->onAttached(Landroid/view/View;)V

    .line 13
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->rootView:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->requestFocus()Z

    :goto_0
    return-void
.end method

.method public show(Landroid/view/View;)V
    .locals 0

    .line 6
    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->clickView:Landroid/view/View;

    .line 7
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->show()V

    return-void
.end method

.method public show(Landroid/view/View;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->clickView:Landroid/view/View;

    .line 2
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->isAnim:Z

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->show()V

    return-void
.end method

.method public show(Z)V
    .locals 0

    .line 4
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->isAnim:Z

    .line 5
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->show()V

    return-void
.end method
