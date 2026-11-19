.class public Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;
.super Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lio/github/inflationx/calligraphy3/HasTypeface;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;",
        "Landroid/view/View$OnClickListener;",
        "Lio/github/inflationx/calligraphy3/HasTypeface;"
    }
.end annotation


# static fields
.field private static final TAG_CANCEL:Ljava/lang/String; = "cancel"

.field private static final TAG_SUBMIT:Ljava/lang/String; = "submit"


# instance fields
.field private wheelOptions:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/xuexiang/xui/widget/picker/widget/WheelOptions<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;)V
    .locals 1

    .line 1
    iget-object v0, p1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->context:Landroid/content/Context;

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;-><init>(Landroid/content/Context;)V

    .line 2
    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    .line 3
    iget-object p1, p1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->context:Landroid/content/Context;

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;->initView(Landroid/content/Context;)V

    return-void
.end method

.method private initView(Landroid/content/Context;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->setDialogOutSideCancelable()V

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->initViews()V

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->initAnim()V

    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->initEvents()V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->customListener:Lcom/xuexiang/xui/widget/picker/widget/listener/CustomListener;

    if-nez v0, :cond_5

    .line 6
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;->isDialog()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$layout;->xui_layout_picker_view_options_dialog:I

    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->contentContainer:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    goto :goto_0

    .line 8
    :cond_0
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$layout;->xui_layout_picker_view_options:I

    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->contentContainer:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 9
    :goto_0
    sget v0, Lcom/xuexiang/xui/R$id;->tvTitle:I

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 10
    sget v1, Lcom/xuexiang/xui/R$id;->ll_content:I

    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    .line 11
    sget v2, Lcom/xuexiang/xui/R$id;->btnSubmit:I

    invoke-virtual {p0, v2}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    .line 12
    sget v3, Lcom/xuexiang/xui/R$id;->btnCancel:I

    invoke-virtual {p0, v3}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    const-string v4, "submit"

    .line 13
    invoke-virtual {v2, v4}, Landroid/widget/Button;->setTag(Ljava/lang/Object;)V

    const-string v4, "cancel"

    .line 14
    invoke-virtual {v3, v4}, Landroid/widget/Button;->setTag(Ljava/lang/Object;)V

    .line 15
    invoke-virtual {v2, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 16
    invoke-virtual {v3, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    iget-object v4, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-object v4, v4, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textContentConfirm:Ljava/lang/String;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/xuexiang/xui/R$string;->xui_picker_view_submit:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_1
    iget-object v4, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-object v4, v4, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textContentConfirm:Ljava/lang/String;

    :goto_1
    invoke-virtual {v2, v4}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 18
    iget-object v4, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-object v4, v4, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textContentCancel:Ljava/lang/String;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v4, Lcom/xuexiang/xui/R$string;->xui_picker_view_cancel:I

    invoke-virtual {p1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-object p1, p1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textContentCancel:Ljava/lang/String;

    :goto_2
    invoke-virtual {v3, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 19
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-object p1, p1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textContentTitle:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, ""

    goto :goto_3

    :cond_3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-object p1, p1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textContentTitle:Ljava/lang/String;

    :goto_3
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget p1, p1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textColorConfirm:I

    invoke-virtual {v2, p1}, Landroid/widget/Button;->setTextColor(I)V

    .line 21
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget p1, p1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textColorCancel:I

    invoke-virtual {v3, p1}, Landroid/widget/Button;->setTextColor(I)V

    .line 22
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget p1, p1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textColorTitle:I

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 23
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;->isDialog()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 24
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/16 p1, 0x8

    .line 25
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 26
    :cond_4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget p1, p1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->bgColorTitle:I

    invoke-virtual {v1, p1}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    .line 27
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget p1, p1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textSizeSubmitCancel:I

    int-to-float p1, p1

    invoke-virtual {v2, p1}, Landroid/widget/Button;->setTextSize(F)V

    .line 28
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget p1, p1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textSizeSubmitCancel:I

    int-to-float p1, p1

    invoke-virtual {v3, p1}, Landroid/widget/Button;->setTextSize(F)V

    .line 29
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget p1, p1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textSizeTitle:I

    int-to-float p1, p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    goto :goto_4

    .line 30
    :cond_5
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget v1, v1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->layoutRes:I

    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->contentContainer:Landroid/view/ViewGroup;

    invoke-virtual {p1, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/picker/widget/listener/CustomListener;->customLayout(Landroid/view/View;)V

    .line 31
    :goto_4
    sget p1, Lcom/xuexiang/xui/R$id;->options_picker:I

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    .line 32
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget v0, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->bgColorWheel:I

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    .line 33
    new-instance v0, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-boolean v1, v1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->isRestoreItem:Z

    invoke-direct {v0, p1, v1}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;-><init>(Landroid/view/View;Z)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;->wheelOptions:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    .line 34
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-object p1, p1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->optionsSelectChangeListener:Lcom/xuexiang/xui/widget/picker/widget/listener/OnOptionsSelectChangeListener;

    if-eqz p1, :cond_6

    .line 35
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->setOptionsSelectChangeListener(Lcom/xuexiang/xui/widget/picker/widget/listener/OnOptionsSelectChangeListener;)V

    .line 36
    :cond_6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;->wheelOptions:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget v0, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textSizeContent:I

    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->setTextContentSize(I)V

    .line 37
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;->wheelOptions:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->label1:Ljava/lang/String;

    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->label2:Ljava/lang/String;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->label3:Ljava/lang/String;

    invoke-virtual {p1, v1, v2, v0}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->setLabels(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;->wheelOptions:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget v1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->xOffsetOne:I

    iget v2, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->xOffsetTwo:I

    iget v0, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->xOffsetThree:I

    invoke-virtual {p1, v1, v2, v0}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->setTextXOffset(III)V

    .line 39
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;->wheelOptions:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->cyclic1:Z

    iget-boolean v2, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->cyclic2:Z

    iget-boolean v0, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->cyclic3:Z

    invoke-virtual {p1, v1, v2, v0}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->setCyclic(ZZZ)V

    .line 40
    invoke-static {}, Lcom/xuexiang/xui/XUI;->getDefaultTypeface()Landroid/graphics/Typeface;

    move-result-object p1

    if-nez p1, :cond_7

    .line 41
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;->wheelOptions:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->font:Landroid/graphics/Typeface;

    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->setTypeface(Landroid/graphics/Typeface;)V

    .line 42
    :cond_7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-boolean p1, p1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->cancelable:Z

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->setOutSideCancelable(Z)Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;

    .line 43
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;->wheelOptions:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget v0, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->dividerColor:I

    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->setDividerColor(I)V

    .line 44
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;->wheelOptions:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->dividerType:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->setDividerType(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;)V

    .line 45
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;->wheelOptions:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget v0, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->lineSpacingMultiplier:F

    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->setLineSpacingMultiplier(F)V

    .line 46
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;->wheelOptions:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget v0, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textColorOut:I

    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->setTextColorOut(I)V

    .line 47
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;->wheelOptions:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget v0, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textColorCenter:I

    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->setTextColorCenter(I)V

    .line 48
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;->wheelOptions:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-boolean v0, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->isCenterLabel:Z

    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->isCenterLabel(Z)V

    return-void
.end method

.method private reSetCurrentItems()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;->wheelOptions:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget v2, v1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->option1:I

    iget v3, v1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->option2:I

    iget v1, v1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->option3:I

    invoke-virtual {v0, v2, v3, v1}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->setCurrentItems(III)V

    :cond_0
    return-void
.end method


# virtual methods
.method public isDialog()Z
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-boolean v0, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->isDialog:Z

    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const-string v0, "submit"

    .line 2
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;->returnData()Z

    move-result p1

    if-nez p1, :cond_1

    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->dismiss()V

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->dismiss()V

    :cond_1
    :goto_0
    return-void
.end method

.method public returnData()Z
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->optionsSelectListener:Lcom/xuexiang/xui/widget/picker/widget/listener/OnOptionsSelectListener;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;->wheelOptions:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->getCurrentItems()[I

    move-result-object v0

    .line 3
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-object v2, v2, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->optionsSelectListener:Lcom/xuexiang/xui/widget/picker/widget/listener/OnOptionsSelectListener;

    iget-object v3, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->clickView:Landroid/view/View;

    aget v1, v0, v1

    const/4 v4, 0x1

    aget v4, v0, v4

    const/4 v5, 0x2

    aget v0, v0, v5

    invoke-interface {v2, v3, v1, v4, v0}, Lcom/xuexiang/xui/widget/picker/widget/listener/OnOptionsSelectListener;->onOptionsSelect(Landroid/view/View;III)Z

    move-result v0

    return v0

    :cond_0
    return v1
.end method

.method public setNPicker(Ljava/util/List;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TT;>;",
            "Ljava/util/List<",
            "TT;>;)V"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;->wheelOptions:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->setLinkage(Z)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;->wheelOptions:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, v1}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->setNPicker(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;->reSetCurrentItems()V

    return-void
.end method

.method public setNPicker(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TT;>;",
            "Ljava/util/List<",
            "TT;>;",
            "Ljava/util/List<",
            "TT;>;)V"
        }
    .end annotation

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;->wheelOptions:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->setLinkage(Z)V

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;->wheelOptions:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-virtual {v0, p1, p2, p3}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->setNPicker(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 8
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;->reSetCurrentItems()V

    return-void
.end method

.method public setNPicker([Ljava/lang/Object;[Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TT;[TT;)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;->setNPicker(Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public setNPicker([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TT;[TT;[TT;)V"
        }
    .end annotation

    .line 5
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-static {p3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;->setNPicker(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public setPicker(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TT;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0, v0}, Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;->setPicker(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public setPicker(Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TT;>;",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "TT;>;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;->setPicker(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public setPicker(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TT;>;",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "TT;>;>;",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "TT;>;>;>;)V"
        }
    .end annotation

    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;->wheelOptions:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-virtual {v0, p1, p2, p3}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->setPicker(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 10
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;->reSetCurrentItems()V

    return-void
.end method

.method public setPicker([Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TT;)V"
        }
    .end annotation

    .line 2
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, v0}, Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;->setPicker(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public setPicker([Ljava/lang/Object;[[Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TT;[[TT;)V"
        }
    .end annotation

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    aget-object v2, p2, v1

    array-length v2, v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    array-length v2, p2

    :goto_0
    if-ge v1, v2, :cond_0

    aget-object v3, p2, v1

    .line 6
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 7
    :cond_0
    iget-object p2, p0, Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;->wheelOptions:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p2, p1, v0, v1}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->setPicker(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 8
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;->reSetCurrentItems()V

    return-void
.end method

.method public setPicker([Ljava/lang/Object;[[Ljava/lang/Object;[[[Ljava/lang/Object;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TT;[[TT;[[[TT;)V"
        }
    .end annotation

    .line 11
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    aget-object v2, p2, v1

    array-length v2, v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    array-length v2, p2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, p2, v3

    .line 13
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 14
    :cond_0
    new-instance p2, Ljava/util/ArrayList;

    aget-object v2, p3, v1

    aget-object v2, v2, v1

    array-length v2, v2

    invoke-direct {p2, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    array-length v2, p3

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_2

    aget-object v4, p3, v3

    .line 16
    new-instance v5, Ljava/util/ArrayList;

    aget-object v6, p3, v1

    array-length v6, v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 17
    array-length v6, v4

    const/4 v7, 0x0

    :goto_2
    if-ge v7, v6, :cond_1

    aget-object v8, v4, v7

    .line 18
    invoke-static {v8}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    invoke-interface {v5, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 19
    :cond_1
    invoke-interface {p2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 20
    :cond_2
    iget-object p3, p0, Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;->wheelOptions:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p3, p1, v0, p2}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->setPicker(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 21
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;->reSetCurrentItems()V

    return-void
.end method

.method public setSelectOptions(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iput p1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->option1:I

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;->reSetCurrentItems()V

    return-void
.end method

.method public setSelectOptions(II)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iput p1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->option1:I

    .line 4
    iput p2, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->option2:I

    .line 5
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;->reSetCurrentItems()V

    return-void
.end method

.method public setSelectOptions(III)V
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iput p1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->option1:I

    .line 7
    iput p2, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->option2:I

    .line 8
    iput p3, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->option3:I

    .line 9
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;->reSetCurrentItems()V

    return-void
.end method

.method public setTitleText(Ljava/lang/String;)V
    .locals 1

    .line 1
    sget v0, Lcom/xuexiang/xui/R$id;->tvTitle:I

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public setTypeface(Landroid/graphics/Typeface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;->wheelOptions:Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/widget/WheelOptions;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_0
    return-void
.end method
