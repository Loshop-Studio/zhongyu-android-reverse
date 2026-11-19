.class public Lcom/xuexiang/xui/widget/picker/widget/WheelTime;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final DEFAULT_END_DAY:I = 0x1f

.field private static final DEFAULT_END_MONTH:I = 0xc

.field private static final DEFAULT_END_YEAR:I = 0x834

.field private static final DEFAULT_START_DAY:I = 0x1

.field private static final DEFAULT_START_MONTH:I = 0x1

.field private static final DEFAULT_START_YEAR:I = 0x76c

.field public static dateFormat:Ljava/text/DateFormat;


# instance fields
.field private currentYear:I

.field private dividerColor:I

.field private dividerType:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

.field private endDay:I

.field private endMonth:I

.field private endYear:I

.field private gravity:I

.field private isLunarCalendar:Z

.field private lineSpacingMultiplier:F

.field private mSelectChangeCallback:Lcom/xuexiang/xui/widget/picker/widget/listener/ISelectTimeCallback;

.field private startDay:I

.field private startMonth:I

.field private startYear:I

.field private textColorCenter:I

.field private textColorOut:I

.field private textSize:I

.field private type:[Z

.field private view:Landroid/view/View;

.field private wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

.field private wv_hours:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

.field private wv_minutes:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

.field private wv_month:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

.field private wv_seconds:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

.field private wv_year:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->dateFormat:Ljava/text/DateFormat;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;[ZII)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x76c

    .line 2
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startYear:I

    const/16 v0, 0x834

    .line 3
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endYear:I

    const/4 v0, 0x1

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startMonth:I

    const/16 v1, 0xc

    .line 5
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endMonth:I

    .line 6
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startDay:I

    const/16 v0, 0x1f

    .line 7
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endDay:I

    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->isLunarCalendar:Z

    .line 9
    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->view:Landroid/view/View;

    .line 10
    iput-object p2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->type:[Z

    .line 11
    iput p3, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->gravity:I

    .line 12
    iput p4, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->textSize:I

    .line 13
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->setView(Landroid/view/View;)V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/picker/widget/WheelTime;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startYear:I

    return p0
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/picker/widget/WheelTime;)Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_month:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    return-object p0
.end method

.method static synthetic access$1000(Lcom/xuexiang/xui/widget/picker/widget/WheelTime;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endDay:I

    return p0
.end method

.method static synthetic access$1100(Lcom/xuexiang/xui/widget/picker/widget/WheelTime;IIIILjava/util/List;Ljava/util/List;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->setReDay(IIIILjava/util/List;Ljava/util/List;)V

    return-void
.end method

.method static synthetic access$200(Lcom/xuexiang/xui/widget/picker/widget/WheelTime;)Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    return-object p0
.end method

.method static synthetic access$300(Lcom/xuexiang/xui/widget/picker/widget/WheelTime;)Lcom/xuexiang/xui/widget/picker/widget/listener/ISelectTimeCallback;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->mSelectChangeCallback:Lcom/xuexiang/xui/widget/picker/widget/listener/ISelectTimeCallback;

    return-object p0
.end method

.method static synthetic access$400(Lcom/xuexiang/xui/widget/picker/widget/WheelTime;)Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_year:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    return-object p0
.end method

.method static synthetic access$500(Lcom/xuexiang/xui/widget/picker/widget/WheelTime;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->currentYear:I

    return p0
.end method

.method static synthetic access$502(Lcom/xuexiang/xui/widget/picker/widget/WheelTime;I)I
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->currentYear:I

    return p1
.end method

.method static synthetic access$600(Lcom/xuexiang/xui/widget/picker/widget/WheelTime;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endYear:I

    return p0
.end method

.method static synthetic access$700(Lcom/xuexiang/xui/widget/picker/widget/WheelTime;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startMonth:I

    return p0
.end method

.method static synthetic access$800(Lcom/xuexiang/xui/widget/picker/widget/WheelTime;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endMonth:I

    return p0
.end method

.method static synthetic access$900(Lcom/xuexiang/xui/widget/picker/widget/WheelTime;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startDay:I

    return p0
.end method

.method private getLunarTime()Ljava/lang/String;
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_year:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v1

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startYear:I

    add-int/2addr v1, v2

    .line 3
    invoke-static {v1}, Lcom/xuexiang/xui/widget/picker/widget/utils/ChinaDateUtils;->leapMonth(I)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v2, :cond_0

    .line 4
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_month:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v2

    :goto_0
    add-int/2addr v2, v4

    :goto_1
    const/4 v5, 0x0

    goto :goto_2

    .line 5
    :cond_0
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_month:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v2

    add-int/2addr v2, v4

    invoke-static {v1}, Lcom/xuexiang/xui/widget/picker/widget/utils/ChinaDateUtils;->leapMonth(I)I

    move-result v5

    sub-int/2addr v2, v5

    if-gtz v2, :cond_1

    .line 6
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_month:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v2

    goto :goto_0

    .line 7
    :cond_1
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_month:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v2

    add-int/2addr v2, v4

    invoke-static {v1}, Lcom/xuexiang/xui/widget/picker/widget/utils/ChinaDateUtils;->leapMonth(I)I

    move-result v5

    sub-int/2addr v2, v5

    if-ne v2, v4, :cond_2

    .line 8
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_month:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v2

    const/4 v5, 0x1

    goto :goto_2

    .line 9
    :cond_2
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_month:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v2

    goto :goto_1

    .line 10
    :goto_2
    iget-object v6, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v6}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v6

    add-int/2addr v6, v4

    .line 11
    invoke-static {v1, v2, v6, v5}, Lcom/xuexiang/xui/widget/picker/widget/utils/LunarCalendarUtils;->lunarToSolar(IIIZ)[I

    move-result-object v1

    .line 12
    aget v2, v1, v3

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "-"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget v3, v1, v4

    .line 13
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x2

    aget v1, v1, v2

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_hours:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 15
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_minutes:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 16
    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_seconds:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 17
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private setChangedListener(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->mSelectChangeCallback:Lcom/xuexiang/xui/widget/picker/widget/listener/ISelectTimeCallback;

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime$5;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime$5;-><init>(Lcom/xuexiang/xui/widget/picker/widget/WheelTime;)V

    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setOnItemSelectedListener(Lcom/xuexiang/xui/widget/picker/wheelview/listener/OnItemSelectedListener;)V

    :cond_0
    return-void
.end method

.method private setContentTextSize()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->textSize:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextSize(F)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_month:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->textSize:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextSize(F)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_year:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->textSize:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextSize(F)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_hours:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->textSize:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextSize(F)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_minutes:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->textSize:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextSize(F)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_seconds:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->textSize:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextSize(F)V

    return-void
.end method

.method private setDividerColor()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->dividerColor:I

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setDividerColor(I)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_month:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->dividerColor:I

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setDividerColor(I)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_year:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->dividerColor:I

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setDividerColor(I)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_hours:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->dividerColor:I

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setDividerColor(I)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_minutes:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->dividerColor:I

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setDividerColor(I)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_seconds:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->dividerColor:I

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setDividerColor(I)V

    return-void
.end method

.method private setDividerType()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->dividerType:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setDividerType(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_month:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->dividerType:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setDividerType(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_year:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->dividerType:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setDividerType(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_hours:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->dividerType:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setDividerType(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_minutes:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->dividerType:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setDividerType(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_seconds:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->dividerType:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setDividerType(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;)V

    return-void
.end method

.method private setLineSpacingMultiplier()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->lineSpacingMultiplier:F

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLineSpacingMultiplier(F)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_month:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->lineSpacingMultiplier:F

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLineSpacingMultiplier(F)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_year:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->lineSpacingMultiplier:F

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLineSpacingMultiplier(F)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_hours:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->lineSpacingMultiplier:F

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLineSpacingMultiplier(F)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_minutes:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->lineSpacingMultiplier:F

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLineSpacingMultiplier(F)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_seconds:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->lineSpacingMultiplier:F

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLineSpacingMultiplier(F)V

    return-void
.end method

.method private setLunar(IIIZIII)V
    .locals 3

    .line 1
    iget-object p7, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->view:Landroid/view/View;

    sget v0, Lcom/xuexiang/xui/R$id;->year:I

    invoke-virtual {p7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p7

    check-cast p7, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iput-object p7, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_year:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 2
    new-instance v0, Lcom/xuexiang/xui/widget/picker/widget/adapter/ArrayWheelAdapter;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startYear:I

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endYear:I

    invoke-static {v1, v2}, Lcom/xuexiang/xui/widget/picker/widget/utils/ChinaDateUtils;->getYears(II)Ljava/util/ArrayList;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/xuexiang/xui/widget/picker/widget/adapter/ArrayWheelAdapter;-><init>(Ljava/util/List;)V

    invoke-virtual {p7, v0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    .line 3
    iget-object p7, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_year:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    const-string v0, ""

    invoke-virtual {p7, v0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLabel(Ljava/lang/String;)V

    .line 4
    iget-object p7, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_year:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startYear:I

    sub-int v1, p1, v1

    invoke-virtual {p7, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 5
    iget-object p7, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_year:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->gravity:I

    invoke-virtual {p7, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setGravity(I)V

    .line 6
    iget-object p7, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->view:Landroid/view/View;

    sget v1, Lcom/xuexiang/xui/R$id;->month:I

    invoke-virtual {p7, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p7

    check-cast p7, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iput-object p7, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_month:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 7
    new-instance v1, Lcom/xuexiang/xui/widget/picker/widget/adapter/ArrayWheelAdapter;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/picker/widget/utils/ChinaDateUtils;->getMonths(I)Ljava/util/ArrayList;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/xuexiang/xui/widget/picker/widget/adapter/ArrayWheelAdapter;-><init>(Ljava/util/List;)V

    invoke-virtual {p7, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    .line 8
    iget-object p7, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_month:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {p7, v0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLabel(Ljava/lang/String;)V

    .line 9
    invoke-static {p1}, Lcom/xuexiang/xui/widget/picker/widget/utils/ChinaDateUtils;->leapMonth(I)I

    move-result p7

    const/4 v1, 0x1

    if-eqz p7, :cond_1

    sub-int/2addr p7, v1

    if-gt p2, p7, :cond_0

    if-eqz p4, :cond_1

    .line 10
    :cond_0
    iget-object p4, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_month:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    add-int/lit8 p7, p2, 0x1

    invoke-virtual {p4, p7}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    goto :goto_0

    .line 11
    :cond_1
    iget-object p4, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_month:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {p4, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 12
    :goto_0
    iget-object p4, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_month:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget p7, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->gravity:I

    invoke-virtual {p4, p7}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setGravity(I)V

    .line 13
    iget-object p4, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->view:Landroid/view/View;

    sget p7, Lcom/xuexiang/xui/R$id;->day:I

    invoke-virtual {p4, p7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p4

    check-cast p4, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iput-object p4, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 14
    invoke-static {p1}, Lcom/xuexiang/xui/widget/picker/widget/utils/ChinaDateUtils;->leapMonth(I)I

    move-result p4

    if-nez p4, :cond_2

    .line 15
    iget-object p4, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    new-instance p7, Lcom/xuexiang/xui/widget/picker/widget/adapter/ArrayWheelAdapter;

    invoke-static {p1, p2}, Lcom/xuexiang/xui/widget/picker/widget/utils/ChinaDateUtils;->monthDays(II)I

    move-result p1

    invoke-static {p1}, Lcom/xuexiang/xui/widget/picker/widget/utils/ChinaDateUtils;->getLunarDays(I)Ljava/util/ArrayList;

    move-result-object p1

    invoke-direct {p7, p1}, Lcom/xuexiang/xui/widget/picker/widget/adapter/ArrayWheelAdapter;-><init>(Ljava/util/List;)V

    invoke-virtual {p4, p7}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    goto :goto_1

    .line 16
    :cond_2
    iget-object p2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    new-instance p4, Lcom/xuexiang/xui/widget/picker/widget/adapter/ArrayWheelAdapter;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/picker/widget/utils/ChinaDateUtils;->leapDays(I)I

    move-result p1

    invoke-static {p1}, Lcom/xuexiang/xui/widget/picker/widget/utils/ChinaDateUtils;->getLunarDays(I)Ljava/util/ArrayList;

    move-result-object p1

    invoke-direct {p4, p1}, Lcom/xuexiang/xui/widget/picker/widget/adapter/ArrayWheelAdapter;-><init>(Ljava/util/List;)V

    invoke-virtual {p2, p4}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    .line 17
    :goto_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLabel(Ljava/lang/String;)V

    .line 18
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    sub-int/2addr p3, v1

    invoke-virtual {p1, p3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 19
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget p2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->gravity:I

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setGravity(I)V

    .line 20
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->view:Landroid/view/View;

    sget p2, Lcom/xuexiang/xui/R$id;->hour:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_hours:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 21
    new-instance p2, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;

    const/16 p3, 0x17

    const/4 p4, 0x0

    invoke-direct {p2, p4, p3}, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;-><init>(II)V

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    .line 22
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_hours:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {p1, p5}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 23
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_hours:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget p2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->gravity:I

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setGravity(I)V

    .line 24
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->view:Landroid/view/View;

    sget p2, Lcom/xuexiang/xui/R$id;->min:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_minutes:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 25
    new-instance p2, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;

    const/16 p3, 0x3b

    invoke-direct {p2, p4, p3}, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;-><init>(II)V

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    .line 26
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_minutes:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {p1, p6}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 27
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_minutes:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget p2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->gravity:I

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setGravity(I)V

    .line 28
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->view:Landroid/view/View;

    sget p2, Lcom/xuexiang/xui/R$id;->second:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_seconds:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 29
    new-instance p2, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;

    invoke-direct {p2, p4, p3}, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;-><init>(II)V

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    .line 30
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_seconds:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {p1, p6}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 31
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_seconds:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget p2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->gravity:I

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setGravity(I)V

    .line 32
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_year:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    new-instance p2, Lcom/xuexiang/xui/widget/picker/widget/WheelTime$1;

    invoke-direct {p2, p0}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime$1;-><init>(Lcom/xuexiang/xui/widget/picker/widget/WheelTime;)V

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setOnItemSelectedListener(Lcom/xuexiang/xui/widget/picker/wheelview/listener/OnItemSelectedListener;)V

    .line 33
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_month:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    new-instance p2, Lcom/xuexiang/xui/widget/picker/widget/WheelTime$2;

    invoke-direct {p2, p0}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime$2;-><init>(Lcom/xuexiang/xui/widget/picker/widget/WheelTime;)V

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setOnItemSelectedListener(Lcom/xuexiang/xui/widget/picker/wheelview/listener/OnItemSelectedListener;)V

    .line 34
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->setChangedListener(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;)V

    .line 35
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_hours:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->setChangedListener(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;)V

    .line 36
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_minutes:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->setChangedListener(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;)V

    .line 37
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_seconds:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->setChangedListener(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;)V

    .line 38
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->type:[Z

    array-length p2, p1

    const/4 p3, 0x6

    if-ne p2, p3, :cond_9

    .line 39
    iget-object p2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_year:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    aget-boolean p1, p1, p4

    const/16 p3, 0x8

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    goto :goto_2

    :cond_3
    const/16 p1, 0x8

    :goto_2
    invoke-virtual {p2, p1}, Landroid/view/View;->setVisibility(I)V

    .line 40
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_month:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget-object p2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->type:[Z

    aget-boolean p2, p2, v1

    if-eqz p2, :cond_4

    const/4 p2, 0x0

    goto :goto_3

    :cond_4
    const/16 p2, 0x8

    :goto_3
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 41
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget-object p2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->type:[Z

    const/4 p5, 0x2

    aget-boolean p2, p2, p5

    if-eqz p2, :cond_5

    const/4 p2, 0x0

    goto :goto_4

    :cond_5
    const/16 p2, 0x8

    :goto_4
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 42
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_hours:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget-object p2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->type:[Z

    const/4 p5, 0x3

    aget-boolean p2, p2, p5

    if-eqz p2, :cond_6

    const/4 p2, 0x0

    goto :goto_5

    :cond_6
    const/16 p2, 0x8

    :goto_5
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 43
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_minutes:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget-object p2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->type:[Z

    const/4 p5, 0x4

    aget-boolean p2, p2, p5

    if-eqz p2, :cond_7

    const/4 p2, 0x0

    goto :goto_6

    :cond_7
    const/16 p2, 0x8

    :goto_6
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 44
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_seconds:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget-object p2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->type:[Z

    const/4 p5, 0x5

    aget-boolean p2, p2, p5

    if-eqz p2, :cond_8

    goto :goto_7

    :cond_8
    const/16 p4, 0x8

    :goto_7
    invoke-virtual {p1, p4}, Landroid/view/View;->setVisibility(I)V

    .line 45
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->setContentTextSize()V

    return-void

    .line 46
    :cond_9
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "type[] length is not 6"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private setReDay(IIIILjava/util/List;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIII",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v0

    .line 2
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p5, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p5

    if-eqz p5, :cond_1

    const/16 p1, 0x1f

    if-le p4, p1, :cond_0

    const/16 p4, 0x1f

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    new-instance p2, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;

    invoke-direct {p2, p3, p4}, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;-><init>(II)V

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    goto :goto_0

    .line 4
    :cond_1
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p6, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    const/16 p1, 0x1e

    if-le p4, p1, :cond_2

    const/16 p4, 0x1e

    .line 5
    :cond_2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    new-instance p2, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;

    invoke-direct {p2, p3, p4}, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;-><init>(II)V

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    goto :goto_0

    .line 6
    :cond_3
    rem-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_4

    rem-int/lit8 p2, p1, 0x64

    if-nez p2, :cond_5

    :cond_4
    rem-int/lit16 p1, p1, 0x190

    if-nez p1, :cond_7

    :cond_5
    const/16 p1, 0x1d

    if-le p4, p1, :cond_6

    const/16 p4, 0x1d

    .line 7
    :cond_6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    new-instance p2, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;

    invoke-direct {p2, p3, p4}, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;-><init>(II)V

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    goto :goto_0

    :cond_7
    const/16 p1, 0x1c

    if-le p4, p1, :cond_8

    const/16 p4, 0x1c

    .line 8
    :cond_8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    new-instance p2, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;

    invoke-direct {p2, p3, p4}, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;-><init>(II)V

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    .line 9
    :goto_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getAdapter()Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;

    move-result-object p1

    invoke-interface {p1}, Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;->getItemsCount()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    if-le v0, p1, :cond_9

    .line 10
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getAdapter()Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;

    move-result-object p1

    invoke-interface {p1}, Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;->getItemsCount()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    .line 11
    iget-object p2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {p2, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    :cond_9
    return-void
.end method

.method private setSolar(IIIIII)V
    .locals 14

    move-object v0, p0

    move v1, p1

    move/from16 v2, p2

    const-string v3, "1"

    const-string v4, "3"

    const-string v5, "5"

    const-string v6, "7"

    const-string v7, "8"

    const-string v8, "10"

    const-string v9, "12"

    .line 1
    filled-new-array/range {v3 .. v9}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, "4"

    const-string v5, "6"

    const-string v6, "9"

    const-string v7, "11"

    .line 2
    filled-new-array {v4, v5, v6, v7}, [Ljava/lang/String;

    move-result-object v4

    .line 3
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    .line 4
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    .line 5
    iput v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->currentYear:I

    .line 6
    iget-object v5, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->view:Landroid/view/View;

    sget v6, Lcom/xuexiang/xui/R$id;->year:I

    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iput-object v5, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_year:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 7
    new-instance v6, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;

    iget v7, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startYear:I

    iget v8, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endYear:I

    invoke-direct {v6, v7, v8}, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;-><init>(II)V

    invoke-virtual {v5, v6}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    .line 8
    iget-object v5, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_year:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v6, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startYear:I

    sub-int v6, v1, v6

    invoke-virtual {v5, v6}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 9
    iget-object v5, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_year:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v6, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->gravity:I

    invoke-virtual {v5, v6}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setGravity(I)V

    .line 10
    iget-object v5, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->view:Landroid/view/View;

    sget v6, Lcom/xuexiang/xui/R$id;->month:I

    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iput-object v5, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_month:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 11
    iget v6, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startYear:I

    iget v7, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endYear:I

    const/4 v8, 0x1

    if-ne v6, v7, :cond_0

    .line 12
    new-instance v6, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;

    iget v7, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startMonth:I

    iget v9, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endMonth:I

    invoke-direct {v6, v7, v9}, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;-><init>(II)V

    invoke-virtual {v5, v6}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    .line 13
    iget-object v5, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_month:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    add-int/lit8 v6, v2, 0x1

    iget v7, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startMonth:I

    sub-int/2addr v6, v7

    invoke-virtual {v5, v6}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    goto :goto_0

    :cond_0
    const/16 v9, 0xc

    if-ne v1, v6, :cond_1

    .line 14
    new-instance v6, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;

    iget v7, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startMonth:I

    invoke-direct {v6, v7, v9}, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;-><init>(II)V

    invoke-virtual {v5, v6}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    .line 15
    iget-object v5, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_month:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    add-int/lit8 v6, v2, 0x1

    iget v7, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startMonth:I

    sub-int/2addr v6, v7

    invoke-virtual {v5, v6}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    goto :goto_0

    :cond_1
    if-ne v1, v7, :cond_2

    .line 16
    new-instance v6, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;

    iget v7, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endMonth:I

    invoke-direct {v6, v8, v7}, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;-><init>(II)V

    invoke-virtual {v5, v6}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    .line 17
    iget-object v5, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_month:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v5, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    goto :goto_0

    .line 18
    :cond_2
    new-instance v6, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;

    invoke-direct {v6, v8, v9}, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;-><init>(II)V

    invoke-virtual {v5, v6}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    .line 19
    iget-object v5, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_month:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v5, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 20
    :goto_0
    iget-object v5, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_month:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v6, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->gravity:I

    invoke-virtual {v5, v6}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setGravity(I)V

    .line 21
    iget-object v5, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->view:Landroid/view/View;

    sget v6, Lcom/xuexiang/xui/R$id;->day:I

    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iput-object v5, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 22
    iget v5, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startYear:I

    iget v6, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endYear:I

    const/16 v7, 0x1c

    const/16 v9, 0x1d

    const/16 v10, 0x1e

    const/16 v11, 0x1f

    if-ne v5, v6, :cond_c

    iget v12, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startMonth:I

    iget v13, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endMonth:I

    if-ne v12, v13, :cond_c

    add-int/2addr v2, v8

    .line 23
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 24
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endDay:I

    if-le v1, v11, :cond_3

    .line 25
    iput v11, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endDay:I

    .line 26
    :cond_3
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    new-instance v2, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;

    iget v5, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startDay:I

    iget v6, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endDay:I

    invoke-direct {v2, v5, v6}, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;-><init>(II)V

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    goto :goto_1

    .line 27
    :cond_4
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v4, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 28
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endDay:I

    if-le v1, v10, :cond_5

    .line 29
    iput v10, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endDay:I

    .line 30
    :cond_5
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    new-instance v2, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;

    iget v5, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startDay:I

    iget v6, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endDay:I

    invoke-direct {v2, v5, v6}, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;-><init>(II)V

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    goto :goto_1

    .line 31
    :cond_6
    rem-int/lit8 v2, v1, 0x4

    if-nez v2, :cond_7

    rem-int/lit8 v2, v1, 0x64

    if-nez v2, :cond_8

    :cond_7
    rem-int/lit16 v1, v1, 0x190

    if-nez v1, :cond_a

    .line 32
    :cond_8
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endDay:I

    if-le v1, v9, :cond_9

    .line 33
    iput v9, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endDay:I

    .line 34
    :cond_9
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    new-instance v2, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;

    iget v5, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startDay:I

    iget v6, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endDay:I

    invoke-direct {v2, v5, v6}, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;-><init>(II)V

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    goto :goto_1

    .line 35
    :cond_a
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endDay:I

    if-le v1, v7, :cond_b

    .line 36
    iput v7, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endDay:I

    .line 37
    :cond_b
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    new-instance v2, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;

    iget v5, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startDay:I

    iget v6, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endDay:I

    invoke-direct {v2, v5, v6}, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;-><init>(II)V

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    .line 38
    :goto_1
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v2, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startDay:I

    sub-int v2, p3, v2

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    goto/16 :goto_5

    :cond_c
    if-ne v1, v5, :cond_12

    add-int/lit8 v5, v2, 0x1

    .line 39
    iget v12, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startMonth:I

    if-ne v5, v12, :cond_12

    .line 40
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    .line 41
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    new-instance v2, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;

    iget v5, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startDay:I

    invoke-direct {v2, v5, v11}, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;-><init>(II)V

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    goto :goto_2

    .line 42
    :cond_d
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v4, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_e

    .line 43
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    new-instance v2, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;

    iget v5, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startDay:I

    invoke-direct {v2, v5, v10}, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;-><init>(II)V

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    goto :goto_2

    .line 44
    :cond_e
    rem-int/lit8 v2, v1, 0x4

    if-nez v2, :cond_f

    rem-int/lit8 v2, v1, 0x64

    if-nez v2, :cond_10

    :cond_f
    rem-int/lit16 v1, v1, 0x190

    if-nez v1, :cond_11

    .line 45
    :cond_10
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    new-instance v2, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;

    iget v5, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startDay:I

    invoke-direct {v2, v5, v9}, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;-><init>(II)V

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    goto :goto_2

    .line 46
    :cond_11
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    new-instance v2, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;

    iget v5, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startDay:I

    invoke-direct {v2, v5, v7}, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;-><init>(II)V

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    .line 47
    :goto_2
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v2, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startDay:I

    sub-int v2, p3, v2

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    goto/16 :goto_5

    :cond_12
    if-ne v1, v6, :cond_1c

    add-int/lit8 v5, v2, 0x1

    .line 48
    iget v6, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endMonth:I

    if-ne v5, v6, :cond_1c

    .line 49
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_14

    .line 50
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endDay:I

    if-le v1, v11, :cond_13

    .line 51
    iput v11, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endDay:I

    .line 52
    :cond_13
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    new-instance v2, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;

    iget v5, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endDay:I

    invoke-direct {v2, v8, v5}, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;-><init>(II)V

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    goto :goto_3

    .line 53
    :cond_14
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v4, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_16

    .line 54
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endDay:I

    if-le v1, v10, :cond_15

    .line 55
    iput v10, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endDay:I

    .line 56
    :cond_15
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    new-instance v2, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;

    iget v5, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endDay:I

    invoke-direct {v2, v8, v5}, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;-><init>(II)V

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    goto :goto_3

    .line 57
    :cond_16
    rem-int/lit8 v2, v1, 0x4

    if-nez v2, :cond_17

    rem-int/lit8 v2, v1, 0x64

    if-nez v2, :cond_18

    :cond_17
    rem-int/lit16 v1, v1, 0x190

    if-nez v1, :cond_1a

    .line 58
    :cond_18
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endDay:I

    if-le v1, v9, :cond_19

    .line 59
    iput v9, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endDay:I

    .line 60
    :cond_19
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    new-instance v2, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;

    iget v5, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endDay:I

    invoke-direct {v2, v8, v5}, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;-><init>(II)V

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    goto :goto_3

    .line 61
    :cond_1a
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endDay:I

    if-le v1, v7, :cond_1b

    .line 62
    iput v7, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endDay:I

    .line 63
    :cond_1b
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    new-instance v2, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;

    iget v5, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endDay:I

    invoke-direct {v2, v8, v5}, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;-><init>(II)V

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    .line 64
    :goto_3
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    add-int/lit8 v2, p3, -0x1

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    goto :goto_5

    :cond_1c
    add-int/2addr v2, v8

    .line 65
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1d

    .line 66
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    new-instance v2, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;

    invoke-direct {v2, v8, v11}, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;-><init>(II)V

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    goto :goto_4

    .line 67
    :cond_1d
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v4, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1e

    .line 68
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    new-instance v2, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;

    invoke-direct {v2, v8, v10}, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;-><init>(II)V

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    goto :goto_4

    .line 69
    :cond_1e
    rem-int/lit8 v2, v1, 0x4

    if-nez v2, :cond_1f

    rem-int/lit8 v2, v1, 0x64

    if-nez v2, :cond_20

    :cond_1f
    rem-int/lit16 v1, v1, 0x190

    if-nez v1, :cond_21

    .line 70
    :cond_20
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    new-instance v2, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;

    invoke-direct {v2, v8, v9}, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;-><init>(II)V

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    goto :goto_4

    .line 71
    :cond_21
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    new-instance v2, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;

    invoke-direct {v2, v8, v7}, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;-><init>(II)V

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    .line 72
    :goto_4
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    add-int/lit8 v2, p3, -0x1

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 73
    :goto_5
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v2, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->gravity:I

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setGravity(I)V

    .line 74
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->view:Landroid/view/View;

    sget v2, Lcom/xuexiang/xui/R$id;->hour:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iput-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_hours:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 75
    new-instance v2, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;

    const/16 v5, 0x17

    const/4 v6, 0x0

    invoke-direct {v2, v6, v5}, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;-><init>(II)V

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    .line 76
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_hours:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    move/from16 v2, p4

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 77
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_hours:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v2, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->gravity:I

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setGravity(I)V

    .line 78
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->view:Landroid/view/View;

    sget v2, Lcom/xuexiang/xui/R$id;->min:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iput-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_minutes:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 79
    new-instance v2, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;

    const/16 v5, 0x3b

    invoke-direct {v2, v6, v5}, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;-><init>(II)V

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    .line 80
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_minutes:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    move/from16 v2, p5

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 81
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_minutes:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v2, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->gravity:I

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setGravity(I)V

    .line 82
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->view:Landroid/view/View;

    sget v2, Lcom/xuexiang/xui/R$id;->second:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iput-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_seconds:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 83
    new-instance v2, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;

    invoke-direct {v2, v6, v5}, Lcom/xuexiang/xui/widget/picker/widget/adapter/NumericWheelAdapter;-><init>(II)V

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setAdapter(Lcom/xuexiang/xui/widget/picker/wheelview/adapter/WheelAdapter;)V

    .line 84
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_seconds:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    move/from16 v2, p6

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCurrentItem(I)V

    .line 85
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_seconds:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v2, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->gravity:I

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setGravity(I)V

    .line 86
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_year:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    new-instance v2, Lcom/xuexiang/xui/widget/picker/widget/WheelTime$3;

    invoke-direct {v2, p0, v3, v4}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime$3;-><init>(Lcom/xuexiang/xui/widget/picker/widget/WheelTime;Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setOnItemSelectedListener(Lcom/xuexiang/xui/widget/picker/wheelview/listener/OnItemSelectedListener;)V

    .line 87
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_month:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    new-instance v2, Lcom/xuexiang/xui/widget/picker/widget/WheelTime$4;

    invoke-direct {v2, p0, v3, v4}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime$4;-><init>(Lcom/xuexiang/xui/widget/picker/widget/WheelTime;Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setOnItemSelectedListener(Lcom/xuexiang/xui/widget/picker/wheelview/listener/OnItemSelectedListener;)V

    .line 88
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->setChangedListener(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;)V

    .line 89
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_hours:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->setChangedListener(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;)V

    .line 90
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_minutes:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->setChangedListener(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;)V

    .line 91
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_seconds:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->setChangedListener(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;)V

    .line 92
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->type:[Z

    array-length v2, v1

    const/4 v3, 0x6

    if-ne v2, v3, :cond_28

    .line 93
    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_year:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    aget-boolean v1, v1, v6

    const/16 v3, 0x8

    if-eqz v1, :cond_22

    const/4 v1, 0x0

    goto :goto_6

    :cond_22
    const/16 v1, 0x8

    :goto_6
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 94
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_month:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->type:[Z

    aget-boolean v2, v2, v8

    if-eqz v2, :cond_23

    const/4 v2, 0x0

    goto :goto_7

    :cond_23
    const/16 v2, 0x8

    :goto_7
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 95
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->type:[Z

    const/4 v4, 0x2

    aget-boolean v2, v2, v4

    if-eqz v2, :cond_24

    const/4 v2, 0x0

    goto :goto_8

    :cond_24
    const/16 v2, 0x8

    :goto_8
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 96
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_hours:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->type:[Z

    const/4 v4, 0x3

    aget-boolean v2, v2, v4

    if-eqz v2, :cond_25

    const/4 v2, 0x0

    goto :goto_9

    :cond_25
    const/16 v2, 0x8

    :goto_9
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 97
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_minutes:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->type:[Z

    const/4 v4, 0x4

    aget-boolean v2, v2, v4

    if-eqz v2, :cond_26

    const/4 v2, 0x0

    goto :goto_a

    :cond_26
    const/16 v2, 0x8

    :goto_a
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 98
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_seconds:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->type:[Z

    const/4 v4, 0x5

    aget-boolean v2, v2, v4

    if-eqz v2, :cond_27

    goto :goto_b

    :cond_27
    const/16 v6, 0x8

    :goto_b
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 99
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->setContentTextSize()V

    return-void

    .line 100
    :cond_28
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "type[] length is not 6"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private setTextColorCenter()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->textColorCenter:I

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextColorCenter(I)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_month:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->textColorCenter:I

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextColorCenter(I)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_year:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->textColorCenter:I

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextColorCenter(I)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_hours:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->textColorCenter:I

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextColorCenter(I)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_minutes:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->textColorCenter:I

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextColorCenter(I)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_seconds:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->textColorCenter:I

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextColorCenter(I)V

    return-void
.end method

.method private setTextColorOut()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->textColorOut:I

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextColorOut(I)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_month:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->textColorOut:I

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextColorOut(I)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_year:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->textColorOut:I

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextColorOut(I)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_hours:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->textColorOut:I

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextColorOut(I)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_minutes:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->textColorOut:I

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextColorOut(I)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_seconds:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->textColorOut:I

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextColorOut(I)V

    return-void
.end method


# virtual methods
.method public getEndYear()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endYear:I

    return v0
.end method

.method public getStartYear()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startYear:I

    return v0
.end method

.method public getTime()Ljava/lang/String;
    .locals 6

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->isLunarCalendar:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->getLunarTime()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    iget v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->currentYear:I

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startYear:I

    const-string v3, " "

    const-string v4, ":"

    const-string v5, "-"

    if-ne v1, v2, :cond_2

    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_month:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v1

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startMonth:I

    add-int/2addr v1, v2

    if-ne v1, v2, :cond_1

    .line 6
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_year:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v1

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startYear:I

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_month:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 7
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v1

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startMonth:I

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 8
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v1

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startDay:I

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_hours:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 9
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_minutes:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 10
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_seconds:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 11
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    .line 12
    :cond_1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_year:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v1

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startYear:I

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_month:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 13
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v1

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startMonth:I

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 14
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_hours:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 15
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_minutes:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 16
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_seconds:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 17
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 18
    :cond_2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_year:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v1

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startYear:I

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_month:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 19
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 20
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_hours:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 21
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_minutes:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 22
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_seconds:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 23
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->getCurrentItem()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->view:Landroid/view/View;

    return-object v0
.end method

.method public isCenterLabel(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->isCenterLabel(Z)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_month:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->isCenterLabel(Z)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_year:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->isCenterLabel(Z)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_hours:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->isCenterLabel(Z)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_minutes:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->isCenterLabel(Z)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_seconds:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->isCenterLabel(Z)V

    return-void
.end method

.method public isLunarMode()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->isLunarCalendar:Z

    return v0
.end method

.method public setCyclic(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_year:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCyclic(Z)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_month:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCyclic(Z)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCyclic(Z)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_hours:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCyclic(Z)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_minutes:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCyclic(Z)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_seconds:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setCyclic(Z)V

    return-void
.end method

.method public setDividerColor(I)V
    .locals 0

    .line 7
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->dividerColor:I

    .line 8
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->setDividerColor()V

    return-void
.end method

.method public setDividerType(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;)V
    .locals 0

    .line 7
    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->dividerType:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$DividerType;

    .line 8
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->setDividerType()V

    return-void
.end method

.method public setEndYear(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endYear:I

    return-void
.end method

.method public setLabels(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->isLunarCalendar:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_year:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLabel(Ljava/lang/String;)V

    goto :goto_0

    .line 3
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_year:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->view:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$string;->xui_picker_view_year:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLabel(Ljava/lang/String;)V

    :goto_0
    if-eqz p2, :cond_2

    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_month:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLabel(Ljava/lang/String;)V

    goto :goto_1

    .line 5
    :cond_2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_month:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget-object p2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->view:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    sget v0, Lcom/xuexiang/xui/R$string;->xui_picker_view_month:I

    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLabel(Ljava/lang/String;)V

    :goto_1
    if-eqz p3, :cond_3

    .line 6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {p1, p3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLabel(Ljava/lang/String;)V

    goto :goto_2

    .line 7
    :cond_3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget-object p2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->view:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    sget p3, Lcom/xuexiang/xui/R$string;->xui_picker_view_day:I

    invoke-virtual {p2, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLabel(Ljava/lang/String;)V

    :goto_2
    if-eqz p4, :cond_4

    .line 8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_hours:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {p1, p4}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLabel(Ljava/lang/String;)V

    goto :goto_3

    .line 9
    :cond_4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_hours:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget-object p2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->view:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    sget p3, Lcom/xuexiang/xui/R$string;->xui_picker_view_hours:I

    invoke-virtual {p2, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLabel(Ljava/lang/String;)V

    :goto_3
    if-eqz p5, :cond_5

    .line 10
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_minutes:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {p1, p5}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLabel(Ljava/lang/String;)V

    goto :goto_4

    .line 11
    :cond_5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_minutes:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget-object p2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->view:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    sget p3, Lcom/xuexiang/xui/R$string;->xui_picker_view_minutes:I

    invoke-virtual {p2, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLabel(Ljava/lang/String;)V

    :goto_4
    if-eqz p6, :cond_6

    .line 12
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_seconds:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {p1, p6}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLabel(Ljava/lang/String;)V

    goto :goto_5

    .line 13
    :cond_6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_seconds:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    iget-object p2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->view:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    sget p3, Lcom/xuexiang/xui/R$string;->xui_picker_view_seconds:I

    invoke-virtual {p2, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setLabel(Ljava/lang/String;)V

    :goto_5
    return-void
.end method

.method public setLineSpacingMultiplier(F)V
    .locals 0

    .line 7
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->lineSpacingMultiplier:F

    .line 8
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->setLineSpacingMultiplier()V

    return-void
.end method

.method public setLunarMode(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->isLunarCalendar:Z

    return-void
.end method

.method public setPicker(III)V
    .locals 7

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    .line 1
    invoke-virtual/range {v0 .. v6}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->setPicker(IIIIII)V

    return-void
.end method

.method public setPicker(IIIIII)V
    .locals 9

    .line 2
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->isLunarCalendar:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    add-int/2addr p2, v0

    .line 3
    invoke-static {p1, p2, p3}, Lcom/xuexiang/xui/widget/picker/widget/utils/LunarCalendarUtils;->solarToLunar(III)[I

    move-result-object p1

    const/4 p2, 0x0

    .line 4
    aget v2, p1, p2

    aget p3, p1, v0

    add-int/lit8 v3, p3, -0x1

    const/4 p3, 0x2

    aget v4, p1, p3

    const/4 p3, 0x3

    aget p1, p1, p3

    if-ne p1, v0, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    move-object v1, p0

    move v6, p4

    move v7, p5

    move v8, p6

    invoke-direct/range {v1 .. v8}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->setLunar(IIIZIII)V

    goto :goto_1

    .line 5
    :cond_1
    invoke-direct/range {p0 .. p6}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->setSolar(IIIIII)V

    :goto_1
    return-void
.end method

.method public setRangDate(Ljava/util/Calendar;Ljava/util/Calendar;)V
    .locals 4

    const/4 v0, 0x5

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-nez p1, :cond_2

    if-eqz p2, :cond_2

    .line 1
    invoke-virtual {p2, v2}, Ljava/util/Calendar;->get(I)I

    move-result p1

    .line 2
    invoke-virtual {p2, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    add-int/2addr v1, v2

    .line 3
    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result p2

    .line 4
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startYear:I

    if-le p1, v0, :cond_0

    .line 5
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endYear:I

    .line 6
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endMonth:I

    .line 7
    iput p2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endDay:I

    goto/16 :goto_0

    :cond_0
    if-ne p1, v0, :cond_6

    .line 8
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startMonth:I

    if-le v1, v0, :cond_1

    .line 9
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endYear:I

    .line 10
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endMonth:I

    .line 11
    iput p2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endDay:I

    goto/16 :goto_0

    :cond_1
    if-ne v1, v0, :cond_6

    .line 12
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startDay:I

    if-le p2, v0, :cond_6

    .line 13
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endYear:I

    .line 14
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endMonth:I

    .line 15
    iput p2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endDay:I

    goto :goto_0

    :cond_2
    if-eqz p1, :cond_5

    if-nez p2, :cond_5

    .line 16
    invoke-virtual {p1, v2}, Ljava/util/Calendar;->get(I)I

    move-result p2

    .line 17
    invoke-virtual {p1, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    add-int/2addr v1, v2

    .line 18
    invoke-virtual {p1, v0}, Ljava/util/Calendar;->get(I)I

    move-result p1

    .line 19
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endYear:I

    if-ge p2, v0, :cond_3

    .line 20
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startMonth:I

    .line 21
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startDay:I

    .line 22
    iput p2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startYear:I

    goto :goto_0

    :cond_3
    if-ne p2, v0, :cond_6

    .line 23
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endMonth:I

    if-ge v1, v0, :cond_4

    .line 24
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startMonth:I

    .line 25
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startDay:I

    .line 26
    iput p2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startYear:I

    goto :goto_0

    :cond_4
    if-ne v1, v0, :cond_6

    .line 27
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endDay:I

    if-ge p1, v0, :cond_6

    .line 28
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startMonth:I

    .line 29
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startDay:I

    .line 30
    iput p2, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startYear:I

    goto :goto_0

    :cond_5
    if-eqz p1, :cond_6

    if-eqz p2, :cond_6

    .line 31
    invoke-virtual {p1, v2}, Ljava/util/Calendar;->get(I)I

    move-result v3

    iput v3, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startYear:I

    .line 32
    invoke-virtual {p2, v2}, Ljava/util/Calendar;->get(I)I

    move-result v3

    iput v3, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endYear:I

    .line 33
    invoke-virtual {p1, v1}, Ljava/util/Calendar;->get(I)I

    move-result v3

    add-int/2addr v3, v2

    iput v3, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startMonth:I

    .line 34
    invoke-virtual {p2, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    add-int/2addr v1, v2

    iput v1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endMonth:I

    .line 35
    invoke-virtual {p1, v0}, Ljava/util/Calendar;->get(I)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startDay:I

    .line 36
    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->endDay:I

    :cond_6
    :goto_0
    return-void
.end method

.method public setSelectChangeCallback(Lcom/xuexiang/xui/widget/picker/widget/listener/ISelectTimeCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->mSelectChangeCallback:Lcom/xuexiang/xui/widget/picker/widget/listener/ISelectTimeCallback;

    return-void
.end method

.method public setStartYear(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->startYear:I

    return-void
.end method

.method public setTextColorCenter(I)V
    .locals 0

    .line 7
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->textColorCenter:I

    .line 8
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->setTextColorCenter()V

    return-void
.end method

.method public setTextColorOut(I)V
    .locals 0

    .line 7
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->textColorOut:I

    .line 8
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->setTextColorOut()V

    return-void
.end method

.method public setTextXOffset(IIIIII)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_day:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextXOffset(I)V

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_month:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextXOffset(I)V

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_year:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {p1, p3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextXOffset(I)V

    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_hours:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {p1, p4}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextXOffset(I)V

    .line 5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_minutes:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {p1, p5}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextXOffset(I)V

    .line 6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->wv_seconds:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {p1, p6}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->setTextXOffset(I)V

    return-void
.end method

.method public setView(Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/WheelTime;->view:Landroid/view/View;

    return-void
.end method
