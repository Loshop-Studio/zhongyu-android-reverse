.class public Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheetItemView;
.super Lcom/xuexiang/xui/widget/alpha/XUIAlphaLinearLayout;
.source "SourceFile"


# instance fields
.field private mAppCompatImageView:Landroidx/appcompat/widget/AppCompatImageView;

.field private mSubScript:Landroid/view/ViewStub;

.field private mTextView:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/alpha/XUIAlphaLinearLayout;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/alpha/XUIAlphaLinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/alpha/XUIAlphaLinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public getAppCompatImageView()Landroidx/appcompat/widget/AppCompatImageView;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheetItemView;->mAppCompatImageView:Landroidx/appcompat/widget/AppCompatImageView;

    return-object v0
.end method

.method public getSubScript()Landroid/view/ViewStub;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheetItemView;->mSubScript:Landroid/view/ViewStub;

    return-object v0
.end method

.method public getTextView()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheetItemView;->mTextView:Landroid/widget/TextView;

    return-object v0
.end method

.method protected onFinishInflate()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/LinearLayout;->onFinishInflate()V

    .line 2
    sget v0, Lcom/xuexiang/xui/R$id;->grid_item_image:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/AppCompatImageView;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheetItemView;->mAppCompatImageView:Landroidx/appcompat/widget/AppCompatImageView;

    .line 3
    sget v0, Lcom/xuexiang/xui/R$id;->grid_item_subscript:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewStub;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheetItemView;->mSubScript:Landroid/view/ViewStub;

    .line 4
    sget v0, Lcom/xuexiang/xui/R$id;->grid_item_title:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheetItemView;->mTextView:Landroid/widget/TextView;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheetItemView;->mTextView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
