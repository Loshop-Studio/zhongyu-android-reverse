.class public Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;
.super Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final TAG_CANCEL:Ljava/lang/String; = "cancel"

.field private static final TAG_SUBMIT:Ljava/lang/String; = "submit"


# instance fields
.field private wheelTime:Lcom/xuexiang/xui/widget/picker/widget/WheelTime;


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

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;->initView(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;)Lcom/xuexiang/xui/widget/picker/widget/WheelTime;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;->wheelTime:Lcom/xuexiang/xui/widget/picker/widget/WheelTime;

    return-object p0
.end method

.method private initDefaultSelectedDate()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->startDate:Ljava/util/Calendar;

    if-eqz v1, :cond_1

    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->endDate:Ljava/util/Calendar;

    if-eqz v2, :cond_1

    .line 2
    iget-object v0, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->date:Ljava/util/Calendar;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-object v2, v2, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->startDate:Ljava/util/Calendar;

    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->date:Ljava/util/Calendar;

    .line 3
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-object v2, v2, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->endDate:Ljava/util/Calendar;

    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-lez v4, :cond_3

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->startDate:Ljava/util/Calendar;

    iput-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->date:Ljava/util/Calendar;

    goto :goto_0

    :cond_1
    if-eqz v1, :cond_2

    .line 5
    iput-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->date:Ljava/util/Calendar;

    goto :goto_0

    .line 6
    :cond_2
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->endDate:Ljava/util/Calendar;

    if-eqz v1, :cond_3

    .line 7
    iput-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->date:Ljava/util/Calendar;

    :cond_3
    :goto_0
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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->customListener:Lcom/xuexiang/xui/widget/picker/widget/listener/CustomListener;

    if-nez v0, :cond_5

    .line 5
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;->isDialog()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$layout;->xui_layout_picker_view_time_dialog:I

    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->contentContainer:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    goto :goto_0

    .line 7
    :cond_0
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$layout;->xui_layout_picker_view_time:I

    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->contentContainer:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 8
    :goto_0
    sget v0, Lcom/xuexiang/xui/R$id;->tvTitle:I

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 9
    sget v1, Lcom/xuexiang/xui/R$id;->ll_content:I

    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    .line 10
    sget v2, Lcom/xuexiang/xui/R$id;->btnSubmit:I

    invoke-virtual {p0, v2}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    .line 11
    sget v3, Lcom/xuexiang/xui/R$id;->btnCancel:I

    invoke-virtual {p0, v3}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    const-string v4, "submit"

    .line 12
    invoke-virtual {v2, v4}, Landroid/widget/Button;->setTag(Ljava/lang/Object;)V

    const-string v4, "cancel"

    .line 13
    invoke-virtual {v3, v4}, Landroid/widget/Button;->setTag(Ljava/lang/Object;)V

    .line 14
    invoke-virtual {v2, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    invoke-virtual {v3, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 16
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

    .line 17
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

    .line 18
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

    .line 19
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget p1, p1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textColorConfirm:I

    invoke-virtual {v2, p1}, Landroid/widget/Button;->setTextColor(I)V

    .line 20
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget p1, p1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textColorCancel:I

    invoke-virtual {v3, p1}, Landroid/widget/Button;->setTextColor(I)V

    .line 21
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget p1, p1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textColorTitle:I

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 22
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;->isDialog()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 23
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/16 p1, 0x8

    .line 24
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 25
    :cond_4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget p1, p1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->bgColorTitle:I

    invoke-virtual {v1, p1}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    .line 26
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget p1, p1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textSizeSubmitCancel:I

    int-to-float p1, p1

    invoke-virtual {v2, p1}, Landroid/widget/Button;->setTextSize(F)V

    .line 27
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget p1, p1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textSizeSubmitCancel:I

    int-to-float p1, p1

    invoke-virtual {v3, p1}, Landroid/widget/Button;->setTextSize(F)V

    .line 28
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget p1, p1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textSizeTitle:I

    int-to-float p1, p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    goto :goto_4

    .line 29
    :cond_5
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget v1, v1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->layoutRes:I

    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->contentContainer:Landroid/view/ViewGroup;

    invoke-virtual {p1, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/picker/widget/listener/CustomListener;->customLayout(Landroid/view/View;)V

    .line 30
    :goto_4
    sget p1, Lcom/xuexiang/xui/R$id;->time_picker:I

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    .line 31
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget v0, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->bgColorWheel:I

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    .line 32
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;->initWheelTime(Landroid/widget/LinearLayout;)V

    return-void
.end method

.method private initWheelTime(Landroid/widget/LinearLayout;)V
    .locals 17

    move-object/from16 v0, p0

    .line 1
    new-instance v1, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;

    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-object v3, v2, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->type:[Z

    iget v4, v2, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textGravity:I

    iget v2, v2, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textSizeContent:I

    move-object/from16 v5, p1

    invoke-direct {v1, v5, v3, v4, v2}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;-><init>(Landroid/view/View;[ZII)V

    iput-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;->wheelTime:Lcom/xuexiang/xui/widget/picker/widget/WheelTime;

    .line 2
    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-object v2, v2, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->timeSelectChangeListener:Lcom/xuexiang/xui/widget/picker/widget/listener/OnTimeSelectChangeListener;

    if-eqz v2, :cond_0

    .line 3
    new-instance v2, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView$1;

    invoke-direct {v2, v0}, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView$1;-><init>(Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;)V

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->setSelectChangeCallback(Lcom/xuexiang/xui/widget/picker/widget/listener/ISelectTimeCallback;)V

    .line 4
    :cond_0
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;->wheelTime:Lcom/xuexiang/xui/widget/picker/widget/WheelTime;

    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-boolean v2, v2, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->isLunarCalendar:Z

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->setLunarMode(Z)V

    .line 5
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget v2, v1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->startYear:I

    if-eqz v2, :cond_1

    iget v1, v1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->endYear:I

    if-eqz v1, :cond_1

    if-gt v2, v1, :cond_1

    .line 6
    invoke-direct/range {p0 .. p0}, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;->setRange()V

    .line 7
    :cond_1
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-object v2, v1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->startDate:Ljava/util/Calendar;

    if-eqz v2, :cond_3

    iget-object v3, v1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->endDate:Ljava/util/Calendar;

    if-eqz v3, :cond_3

    .line 8
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v1

    iget-object v3, v0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-object v3, v3, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->endDate:Ljava/util/Calendar;

    invoke-virtual {v3}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v3

    cmp-long v5, v1, v3

    if-gtz v5, :cond_2

    .line 9
    invoke-direct/range {p0 .. p0}, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;->setRangDate()V

    goto :goto_0

    .line 10
    :cond_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "startDate can\'t be later than endDate"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    const/4 v3, 0x1

    if-eqz v2, :cond_5

    .line 11
    invoke-virtual {v2, v3}, Ljava/util/Calendar;->get(I)I

    move-result v1

    const/16 v2, 0x76c

    if-lt v1, v2, :cond_4

    .line 12
    invoke-direct/range {p0 .. p0}, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;->setRangDate()V

    goto :goto_0

    .line 13
    :cond_4
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "The startDate can not as early as 1900"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 14
    :cond_5
    iget-object v1, v1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->endDate:Ljava/util/Calendar;

    if-eqz v1, :cond_7

    .line 15
    invoke-virtual {v1, v3}, Ljava/util/Calendar;->get(I)I

    move-result v1

    const/16 v2, 0x834

    if-gt v1, v2, :cond_6

    .line 16
    invoke-direct/range {p0 .. p0}, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;->setRangDate()V

    goto :goto_0

    .line 17
    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "The endDate should not be later than 2100"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 18
    :cond_7
    invoke-direct/range {p0 .. p0}, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;->setRangDate()V

    .line 19
    :goto_0
    invoke-direct/range {p0 .. p0}, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;->setTime()V

    .line 20
    iget-object v3, v0, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;->wheelTime:Lcom/xuexiang/xui/widget/picker/widget/WheelTime;

    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-object v4, v1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->labelYear:Ljava/lang/String;

    iget-object v5, v1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->labelMonth:Ljava/lang/String;

    iget-object v6, v1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->labelDay:Ljava/lang/String;

    iget-object v7, v1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->labelHours:Ljava/lang/String;

    iget-object v8, v1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->labelMinutes:Ljava/lang/String;

    iget-object v9, v1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->labelSeconds:Ljava/lang/String;

    invoke-virtual/range {v3 .. v9}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->setLabels(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    iget-object v10, v0, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;->wheelTime:Lcom/xuexiang/xui/widget/picker/widget/WheelTime;

    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget v11, v1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->xOffsetYear:I

    iget v12, v1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->xOffsetMonth:I

    iget v13, v1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->xOffsetDay:I

    iget v14, v1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->xOffsetHours:I

    iget v15, v1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->xOffsetMinutes:I

    iget v1, v1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->xOffsetSeconds:I

    move/from16 v16, v1

    invoke-virtual/range {v10 .. v16}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->setTextXOffset(IIIIII)V

    .line 22
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-boolean v1, v1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->cancelable:Z

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->setOutSideCancelable(Z)Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;

    .line 23
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;->wheelTime:Lcom/xuexiang/xui/widget/picker/widget/WheelTime;

    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-boolean v2, v2, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->cyclic:Z

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->setCyclic(Z)V

    .line 24
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;->wheelTime:Lcom/xuexiang/xui/widget/picker/widget/WheelTime;

    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget v2, v2, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->dividerColor:I

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->setDividerColor(I)V

    .line 25
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;->wheelTime:Lcom/xuexiang/xui/widget/picker/widget/WheelTime;

    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-object v2, v2, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->dividerType:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->setDividerType(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;)V

    .line 26
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;->wheelTime:Lcom/xuexiang/xui/widget/picker/widget/WheelTime;

    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget v2, v2, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->lineSpacingMultiplier:F

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->setLineSpacingMultiplier(F)V

    .line 27
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;->wheelTime:Lcom/xuexiang/xui/widget/picker/widget/WheelTime;

    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget v2, v2, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textColorOut:I

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->setTextColorOut(I)V

    .line 28
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;->wheelTime:Lcom/xuexiang/xui/widget/picker/widget/WheelTime;

    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget v2, v2, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textColorCenter:I

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->setTextColorCenter(I)V

    .line 29
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;->wheelTime:Lcom/xuexiang/xui/widget/picker/widget/WheelTime;

    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-boolean v2, v2, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->isCenterLabel:Z

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->isCenterLabel(Z)V

    return-void
.end method

.method private setRangDate()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;->wheelTime:Lcom/xuexiang/xui/widget/picker/widget/WheelTime;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-object v2, v1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->startDate:Ljava/util/Calendar;

    iget-object v1, v1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->endDate:Ljava/util/Calendar;

    invoke-virtual {v0, v2, v1}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->setRangDate(Ljava/util/Calendar;Ljava/util/Calendar;)V

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;->initDefaultSelectedDate()V

    return-void
.end method

.method private setRange()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;->wheelTime:Lcom/xuexiang/xui/widget/picker/widget/WheelTime;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget v1, v1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->startYear:I

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->setStartYear(I)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;->wheelTime:Lcom/xuexiang/xui/widget/picker/widget/WheelTime;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget v1, v1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->endYear:I

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->setEndYear(I)V

    return-void
.end method

.method private setTime()V
    .locals 14

    .line 1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-object v1, v1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->date:Ljava/util/Calendar;

    const/16 v2, 0xd

    const/16 v3, 0xc

    const/16 v4, 0xb

    const/4 v5, 0x5

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-nez v1, :cond_0

    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    invoke-virtual {v0, v8, v9}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 4
    invoke-virtual {v0, v7}, Ljava/util/Calendar;->get(I)I

    move-result v1

    .line 5
    invoke-virtual {v0, v6}, Ljava/util/Calendar;->get(I)I

    move-result v6

    .line 6
    invoke-virtual {v0, v5}, Ljava/util/Calendar;->get(I)I

    move-result v5

    .line 7
    invoke-virtual {v0, v4}, Ljava/util/Calendar;->get(I)I

    move-result v4

    .line 8
    invoke-virtual {v0, v3}, Ljava/util/Calendar;->get(I)I

    move-result v3

    .line 9
    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v0

    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v1, v7}, Ljava/util/Calendar;->get(I)I

    move-result v1

    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->date:Ljava/util/Calendar;

    invoke-virtual {v0, v6}, Ljava/util/Calendar;->get(I)I

    move-result v6

    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->date:Ljava/util/Calendar;

    invoke-virtual {v0, v5}, Ljava/util/Calendar;->get(I)I

    move-result v5

    .line 13
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->date:Ljava/util/Calendar;

    invoke-virtual {v0, v4}, Ljava/util/Calendar;->get(I)I

    move-result v4

    .line 14
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->date:Ljava/util/Calendar;

    invoke-virtual {v0, v3}, Ljava/util/Calendar;->get(I)I

    move-result v3

    .line 15
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->date:Ljava/util/Calendar;

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v0

    :goto_0
    move v13, v0

    move v8, v1

    move v12, v3

    move v11, v4

    move v10, v5

    move v9, v6

    .line 16
    iget-object v7, p0, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;->wheelTime:Lcom/xuexiang/xui/widget/picker/widget/WheelTime;

    invoke-virtual/range {v7 .. v13}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->setPicker(IIIIII)V

    return-void
.end method


# virtual methods
.method public getWheelTime()Lcom/xuexiang/xui/widget/picker/widget/WheelTime;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;->wheelTime:Lcom/xuexiang/xui/widget/picker/widget/WheelTime;

    return-object v0
.end method

.method public isDialog()Z
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-boolean v0, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->isDialog:Z

    return v0
.end method

.method public isLunarCalendar()Z
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;->wheelTime:Lcom/xuexiang/xui/widget/picker/widget/WheelTime;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->isLunarMode()Z

    move-result v0

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
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;->returnData()V

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->dismiss()V

    return-void
.end method

.method public returnData()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->timeSelectListener:Lcom/xuexiang/xui/widget/picker/widget/listener/OnTimeSelectListener;

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    sget-object v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->dateFormat:Ljava/text/DateFormat;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;->wheelTime:Lcom/xuexiang/xui/widget/picker/widget/WheelTime;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->getTime()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-object v1, v1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->timeSelectListener:Lcom/xuexiang/xui/widget/picker/widget/listener/OnTimeSelectListener;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->clickView:Landroid/view/View;

    invoke-interface {v1, v0, v2}, Lcom/xuexiang/xui/widget/picker/widget/listener/OnTimeSelectListener;->onTimeSelected(Ljava/util/Date;Landroid/view/View;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 4
    invoke-virtual {v0}, Ljava/text/ParseException;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method public setDate(Ljava/util/Calendar;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iput-object p1, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->date:Ljava/util/Calendar;

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;->setTime()V

    return-void
.end method

.method public setLunarCalendar(Z)V
    .locals 17

    move-object/from16 v1, p0

    .line 1
    :try_start_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 2
    sget-object v2, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->dateFormat:Ljava/text/DateFormat;

    iget-object v3, v1, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;->wheelTime:Lcom/xuexiang/xui/widget/picker/widget/WheelTime;

    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->getTime()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    const/4 v2, 0x1

    .line 3
    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v4

    const/4 v2, 0x2

    .line 4
    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v5

    const/4 v2, 0x5

    .line 5
    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v6

    const/16 v2, 0xb

    .line 6
    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v7

    const/16 v2, 0xc

    .line 7
    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v8

    const/16 v2, 0xd

    .line 8
    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v9

    .line 9
    iget-object v0, v1, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;->wheelTime:Lcom/xuexiang/xui/widget/picker/widget/WheelTime;

    move/from16 v2, p1

    invoke-virtual {v0, v2}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->setLunarMode(Z)V

    .line 10
    iget-object v10, v1, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;->wheelTime:Lcom/xuexiang/xui/widget/picker/widget/WheelTime;

    iget-object v0, v1, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-object v11, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->labelYear:Ljava/lang/String;

    iget-object v12, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->labelMonth:Ljava/lang/String;

    iget-object v13, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->labelDay:Ljava/lang/String;

    iget-object v14, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->labelHours:Ljava/lang/String;

    iget-object v15, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->labelMinutes:Ljava/lang/String;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->labelSeconds:Ljava/lang/String;

    move-object/from16 v16, v0

    invoke-virtual/range {v10 .. v16}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->setLabels(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    iget-object v3, v1, Lcom/xuexiang/xui/widget/picker/widget/TimePickerView;->wheelTime:Lcom/xuexiang/xui/widget/picker/widget/WheelTime;

    invoke-virtual/range {v3 .. v9}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->setPicker(IIIIII)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 12
    invoke-virtual {v0}, Ljava/text/ParseException;->printStackTrace()V

    :goto_0
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
