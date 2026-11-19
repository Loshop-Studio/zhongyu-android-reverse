.class public Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/xuexiang/xui/widget/picker/widget/listener/OnOptionsSelectListener;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;-><init>(I)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    .line 3
    iput-object p1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->context:Landroid/content/Context;

    .line 4
    iput-object p2, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->optionsSelectListener:Lcom/xuexiang/xui/widget/picker/widget/listener/OnOptionsSelectListener;

    .line 5
    invoke-static {p1}, Lcom/xuexiang/xui/utils/ThemeUtils;->getMainThemeColor(Landroid/content/Context;)I

    move-result p2

    iput p2, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textColorConfirm:I

    .line 6
    iget-object p2, p0, Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    invoke-static {p1}, Lcom/xuexiang/xui/utils/ThemeUtils;->getMainThemeColor(Landroid/content/Context;)I

    move-result p1

    iput p1, p2, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textColorCancel:I

    return-void
.end method


# virtual methods
.method public build()Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    invoke-direct {v0, v1}, Lcom/xuexiang/xui/widget/picker/widget/OptionsPickerView;-><init>(Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;)V

    return-object v0
.end method

.method public isCenterLabel(Z)Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iput-boolean p1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->isCenterLabel:Z

    return-object p0
.end method

.method public isDialog(Z)Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iput-boolean p1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->isDialog:Z

    return-object p0
.end method

.method public isRestoreItem(Z)Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iput-boolean p1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->isRestoreItem:Z

    return-object p0
.end method

.method public setBackgroundId(I)Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iput p1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->backgroundId:I

    return-object p0
.end method

.method public setBgColor(I)Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iput p1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->bgColorWheel:I

    return-object p0
.end method

.method public setCancelColor(I)Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iput p1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textColorCancel:I

    return-object p0
.end method

.method public setCancelText(Ljava/lang/String;)Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iput-object p1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textContentCancel:Ljava/lang/String;

    return-object p0
.end method

.method public setContentTextSize(I)Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iput p1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textSizeContent:I

    return-object p0
.end method

.method public setCyclic(ZZZ)Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iput-boolean p1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->cyclic1:Z

    .line 2
    iput-boolean p2, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->cyclic2:Z

    .line 3
    iput-boolean p3, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->cyclic3:Z

    return-object p0
.end method

.method public setDecorView(Landroid/view/ViewGroup;)Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iput-object p1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->decorView:Landroid/view/ViewGroup;

    return-object p0
.end method

.method public setDividerColor(I)Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iput p1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->dividerColor:I

    return-object p0
.end method

.method public setDividerType(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;)Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iput-object p1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->dividerType:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

    return-object p0
.end method

.method public setLabels(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iput-object p1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->label1:Ljava/lang/String;

    .line 2
    iput-object p2, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->label2:Ljava/lang/String;

    .line 3
    iput-object p3, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->label3:Ljava/lang/String;

    return-object p0
.end method

.method public setLayoutRes(ILcom/xuexiang/xui/widget/picker/widget/listener/CustomListener;)Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iput p1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->layoutRes:I

    .line 2
    iput-object p2, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->customListener:Lcom/xuexiang/xui/widget/picker/widget/listener/CustomListener;

    return-object p0
.end method

.method public setLineSpacingMultiplier(F)Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iput p1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->lineSpacingMultiplier:F

    return-object p0
.end method

.method public setOptionsSelectChangeListener(Lcom/xuexiang/xui/widget/picker/widget/listener/OnOptionsSelectChangeListener;)Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iput-object p1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->optionsSelectChangeListener:Lcom/xuexiang/xui/widget/picker/widget/listener/OnOptionsSelectChangeListener;

    return-object p0
.end method

.method public setOutSideCancelable(Z)Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iput-boolean p1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->cancelable:Z

    return-object p0
.end method

.method public setSelectOptions(I)Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iput p1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->option1:I

    return-object p0
.end method

.method public setSelectOptions(II)Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iput p1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->option1:I

    .line 3
    iput p2, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->option2:I

    return-object p0
.end method

.method public setSelectOptions(III)Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iput p1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->option1:I

    .line 5
    iput p2, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->option2:I

    .line 6
    iput p3, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->option3:I

    return-object p0
.end method

.method public setSubCalSize(I)Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iput p1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textSizeSubmitCancel:I

    return-object p0
.end method

.method public setSubmitColor(I)Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iput p1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textColorConfirm:I

    return-object p0
.end method

.method public setSubmitText(Ljava/lang/String;)Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iput-object p1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textContentConfirm:Ljava/lang/String;

    return-object p0
.end method

.method public setTextColorCenter(I)Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iput p1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textColorCenter:I

    return-object p0
.end method

.method public setTextColorOut(I)Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iput p1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textColorOut:I

    return-object p0
.end method

.method public setTextXOffset(III)Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iput p1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->xOffsetOne:I

    .line 2
    iput p2, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->xOffsetTwo:I

    .line 3
    iput p3, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->xOffsetThree:I

    return-object p0
.end method

.method public setTitleBgColor(I)Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iput p1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->bgColorTitle:I

    return-object p0
.end method

.method public setTitleColor(I)Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iput p1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textColorTitle:I

    return-object p0
.end method

.method public setTitleSize(I)Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iput p1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textSizeTitle:I

    return-object p0
.end method

.method public setTitleText(Ljava/lang/String;)Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iput-object p1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textContentTitle:Ljava/lang/String;

    return-object p0
.end method

.method public setTypeface(Landroid/graphics/Typeface;)Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/builder/OptionsPickerBuilder;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iput-object p1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->font:Landroid/graphics/Typeface;

    return-object p0
.end method
