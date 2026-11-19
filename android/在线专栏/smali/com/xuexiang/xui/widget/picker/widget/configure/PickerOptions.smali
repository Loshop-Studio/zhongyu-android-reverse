.class public Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final PICKER_VIEW_BG_COLOR_DEFAULT:I = -0x1

.field private static final PICKER_VIEW_BG_COLOR_TITLE:I = -0xa0a0b

.field private static final PICKER_VIEW_BTN_COLOR_NORMAL:I = -0xfa8201

.field private static final PICKER_VIEW_COLOR_TITLE:I = -0x1000000

.field public static final TYPE_PICKER_OPTIONS:I = 0x1

.field public static final TYPE_PICKER_TIME:I = 0x2


# instance fields
.field public backgroundId:I

.field public bgColorTitle:I

.field public bgColorWheel:I

.field public cancelable:Z

.field public context:Landroid/content/Context;

.field public customListener:Lcom/xuexiang/xui/widget/picker/widget/listener/CustomListener;

.field public cyclic:Z

.field public cyclic1:Z

.field public cyclic2:Z

.field public cyclic3:Z

.field public date:Ljava/util/Calendar;

.field public decorView:Landroid/view/ViewGroup;

.field public dividerColor:I

.field public dividerType:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

.field public endDate:Ljava/util/Calendar;

.field public endYear:I

.field public font:Landroid/graphics/Typeface;

.field public isCenterLabel:Z

.field public isDialog:Z

.field public isLunarCalendar:Z

.field public isRestoreItem:Z

.field public label1:Ljava/lang/String;

.field public label2:Ljava/lang/String;

.field public label3:Ljava/lang/String;

.field public labelDay:Ljava/lang/String;

.field public labelHours:Ljava/lang/String;

.field public labelMinutes:Ljava/lang/String;

.field public labelMonth:Ljava/lang/String;

.field public labelSeconds:Ljava/lang/String;

.field public labelYear:Ljava/lang/String;

.field public layoutRes:I

.field public lineSpacingMultiplier:F

.field public option1:I

.field public option2:I

.field public option3:I

.field public optionsSelectChangeListener:Lcom/xuexiang/xui/widget/picker/widget/listener/OnOptionsSelectChangeListener;

.field public optionsSelectListener:Lcom/xuexiang/xui/widget/picker/widget/listener/OnOptionsSelectListener;

.field public startDate:Ljava/util/Calendar;

.field public startYear:I

.field public textColorCancel:I

.field public textColorCenter:I

.field public textColorConfirm:I

.field public textColorOut:I

.field public textColorTitle:I

.field public textContentCancel:Ljava/lang/String;

.field public textContentConfirm:Ljava/lang/String;

.field public textContentTitle:Ljava/lang/String;

.field public textGravity:I

.field public textSizeContent:I

.field public textSizeSubmitCancel:I

.field public textSizeTitle:I

.field public timeSelectChangeListener:Lcom/xuexiang/xui/widget/picker/widget/listener/OnTimeSelectChangeListener;

.field public timeSelectListener:Lcom/xuexiang/xui/widget/picker/widget/listener/OnTimeSelectListener;

.field public type:[Z

.field public xOffsetDay:I

.field public xOffsetHours:I

.field public xOffsetMinutes:I

.field public xOffsetMonth:I

.field public xOffsetOne:I

.field public xOffsetSeconds:I

.field public xOffsetThree:I

.field public xOffsetTwo:I

.field public xOffsetYear:I


# direct methods
.method public constructor <init>(I)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->cyclic1:Z

    .line 3
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->cyclic2:Z

    .line 4
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->cyclic3:Z

    .line 5
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->isRestoreItem:Z

    const/4 v1, 0x6

    new-array v1, v1, [Z

    .line 6
    fill-array-data v1, :array_0

    iput-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->type:[Z

    .line 7
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->cyclic:Z

    .line 8
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->isLunarCalendar:Z

    const/16 v1, 0x11

    .line 9
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textGravity:I

    const v2, -0xfa8201

    .line 10
    iput v2, p0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textColorConfirm:I

    .line 11
    iput v2, p0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textColorCancel:I

    const/high16 v2, -0x1000000

    .line 12
    iput v2, p0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textColorTitle:I

    const/4 v2, -0x1

    .line 13
    iput v2, p0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->bgColorWheel:I

    const v3, -0xa0a0b

    .line 14
    iput v3, p0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->bgColorTitle:I

    .line 15
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textSizeSubmitCancel:I

    const/16 v1, 0x12

    .line 16
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textSizeTitle:I

    .line 17
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textSizeContent:I

    const v1, -0x575758

    .line 18
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textColorOut:I

    const v1, -0xd5d5d6

    .line 19
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->textColorCenter:I

    const v1, -0x2a2a2b

    .line 20
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->dividerColor:I

    .line 21
    iput v2, p0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->backgroundId:I

    const v1, 0x3fcccccd    # 1.6f

    .line 22
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->lineSpacingMultiplier:F

    const/4 v1, 0x1

    .line 23
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->cancelable:Z

    .line 24
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->isCenterLabel:Z

    .line 25
    sget-object v0, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->font:Landroid/graphics/Typeface;

    .line 26
    sget-object v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;->FILL:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->dividerType:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

    if-ne p1, v1, :cond_0

    .line 27
    sget p1, Lcom/xuexiang/xui/R$layout;->xui_layout_picker_view_options:I

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->layoutRes:I

    goto :goto_0

    .line 28
    :cond_0
    sget p1, Lcom/xuexiang/xui/R$layout;->xui_layout_picker_view_time:I

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->layoutRes:I

    :goto_0
    return-void

    :array_0
    .array-data 1
        0x1t
        0x1t
        0x1t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method
