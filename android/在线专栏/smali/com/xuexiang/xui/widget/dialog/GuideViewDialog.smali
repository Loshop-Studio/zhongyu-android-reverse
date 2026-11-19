.class public Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;
.super Landroid/app/AlertDialog;
.source "SourceFile"


# instance fields
.field private mGuideViewLayout:Landroid/widget/LinearLayout;

.field private mImageView:Landroid/widget/ImageView;

.field private mIndex:I

.field private mResourceIdList:[I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/app/AlertDialog;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;->mIndex:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Landroid/app/AlertDialog;-><init>(Landroid/content/Context;I)V

    const/4 p1, 0x0

    .line 4
    iput p1, p0, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;->mIndex:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I[I)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Landroid/app/AlertDialog;-><init>(Landroid/content/Context;I)V

    const/4 p1, 0x0

    .line 6
    iput p1, p0, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;->mIndex:I

    .line 7
    iput-object p3, p0, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;->mResourceIdList:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;[I)V
    .locals 0

    .line 8
    invoke-direct {p0, p1}, Landroid/app/AlertDialog;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 9
    iput p1, p0, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;->mIndex:I

    .line 10
    iput-object p2, p0, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;->mResourceIdList:[I

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;->mIndex:I

    return p0
.end method

.method static synthetic access$008(Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;)I
    .locals 2

    iget v0, p0, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;->mIndex:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;->mIndex:I

    return v0
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;)[I
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;->mResourceIdList:[I

    return-object p0
.end method

.method static synthetic access$200(Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;)Landroid/widget/ImageView;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;->mImageView:Landroid/widget/ImageView;

    return-object p0
.end method

.method private initView()V
    .locals 3

    .line 1
    new-instance v0, Landroid/widget/ImageView;

    invoke-virtual {p0}, Landroid/app/AlertDialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;->mImageView:Landroid/widget/ImageView;

    .line 2
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v2, -0x2

    invoke-direct {v1, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;->mResourceIdList:[I

    if-eqz v0, :cond_0

    array-length v1, v0

    if-lez v1, :cond_0

    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;->mImageView:Landroid/widget/ImageView;

    iget v2, p0, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;->mIndex:I

    aget v0, v0, v2

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;->mImageView:Landroid/widget/ImageView;

    new-instance v1, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog$1;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog$1;-><init>(Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 6
    :cond_0
    new-instance v0, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Landroid/app/AlertDialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;->mGuideViewLayout:Landroid/widget/LinearLayout;

    .line 7
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v1, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;->mGuideViewLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;->mGuideViewLayout:Landroid/widget/LinearLayout;

    const/16 v2, 0x11

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;->mGuideViewLayout:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;->mImageView:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 11
    invoke-virtual {p0, v1}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    return-void
.end method


# virtual methods
.method public dismiss()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;->mIndex:I

    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;->mResourceIdList:[I

    array-length v2, v1

    add-int/lit8 v2, v2, -0x1

    if-ne v0, v2, :cond_0

    .line 2
    invoke-super {p0}, Landroid/app/AlertDialog;->dismiss()V

    goto :goto_0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 3
    iput v0, p0, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;->mIndex:I

    .line 4
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;->mImageView:Landroid/widget/ImageView;

    aget v0, v1, v0

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    :goto_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/AlertDialog;->onCreate(Landroid/os/Bundle;)V

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;->initView()V

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;->mGuideViewLayout:Landroid/widget/LinearLayout;

    invoke-virtual {p0, p1}, Landroid/app/AlertDialog;->setContentView(Landroid/view/View;)V

    return-void
.end method

.method public setDialogSize(II)Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/AlertDialog;->getWindow()Landroid/view/Window;

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

.method public setGravity(I)Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/AlertDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    .line 3
    iput p1, v1, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 4
    invoke-virtual {v0, v1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    :cond_0
    return-object p0
.end method

.method public setResourseId([I)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;->mResourceIdList:[I

    return-void
.end method

.method public show(II)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/AlertDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    .line 3
    iput p1, v1, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 4
    iput p2, v1, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 5
    invoke-virtual {v0, v1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 6
    invoke-virtual {p0}, Landroid/app/AlertDialog;->show()V

    return-void
.end method
