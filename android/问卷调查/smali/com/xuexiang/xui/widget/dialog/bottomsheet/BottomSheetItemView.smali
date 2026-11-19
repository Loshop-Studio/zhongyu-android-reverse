.class public Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheetItemView;
.super Lb/c/a/e/a/b;
.source ""


# instance fields
.field public c:Landroidx/appcompat/widget/AppCompatImageView;

.field public d:Landroid/view/ViewStub;

.field public e:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lb/c/a/e/a/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public getAppCompatImageView()Landroidx/appcompat/widget/AppCompatImageView;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheetItemView;->c:Landroidx/appcompat/widget/AppCompatImageView;

    return-object v0
.end method

.method public getSubScript()Landroid/view/ViewStub;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheetItemView;->d:Landroid/view/ViewStub;

    return-object v0
.end method

.method public getTextView()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheetItemView;->e:Landroid/widget/TextView;

    return-object v0
.end method

.method public onFinishInflate()V
    .locals 1

    invoke-super {p0}, Landroid/widget/LinearLayout;->onFinishInflate()V

    const v0, 0x7f0900ff

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/AppCompatImageView;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheetItemView;->c:Landroidx/appcompat/widget/AppCompatImageView;

    const v0, 0x7f090100

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewStub;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheetItemView;->d:Landroid/view/ViewStub;

    const v0, 0x7f090101

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheetItemView;->e:Landroid/widget/TextView;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheetItemView;->e:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
