.class public Lcom/lljjcoder/citywheel/CustomConfig$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lljjcoder/citywheel/CustomConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private cancelText:Ljava/lang/String;

.field private cancelTextColorStr:Ljava/lang/String;

.field private cancelTextSize:I

.field private cityDataList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/lljjcoder/bean/CustomCityData;",
            ">;"
        }
    .end annotation
.end field

.field private confirmText:Ljava/lang/String;

.field private confirmTextColorStr:Ljava/lang/String;

.field private confirmTextSize:I

.field private customItemLayout:Ljava/lang/Integer;

.field private customItemTextViewId:Ljava/lang/Integer;

.field private defaultCityName:Ljava/lang/String;

.field private defaultDistrict:Ljava/lang/String;

.field private defaultProvinceName:Ljava/lang/String;

.field private drawShadows:Z

.field private isCityCyclic:Z

.field private isDistrictCyclic:Z

.field private isProvinceCyclic:Z

.field private isShowBackground:Z

.field private lineColor:Ljava/lang/String;

.field private lineHeigh:I

.field private mTitle:Ljava/lang/String;

.field private mWheelType:Lcom/lljjcoder/citywheel/CustomConfig$WheelType;

.field private titleBackgroundColorStr:Ljava/lang/String;

.field private titleTextColorStr:Ljava/lang/String;

.field private titleTextSize:I

.field private visibleItems:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x5

    .line 5
    iput v0, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->visibleItems:I

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->isProvinceCyclic:Z

    .line 9
    .line 10
    iput-boolean v0, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->isCityCyclic:Z

    .line 11
    .line 12
    iput-boolean v0, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->isDistrictCyclic:Z

    .line 13
    .line 14
    const-string v1, "#000000"

    .line 15
    .line 16
    iput-object v1, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->cancelTextColorStr:Ljava/lang/String;

    .line 17
    .line 18
    const-string v1, "\u53d6\u6d88"

    .line 19
    .line 20
    iput-object v1, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->cancelText:Ljava/lang/String;

    .line 21
    .line 22
    const/16 v1, 0x10

    .line 23
    .line 24
    iput v1, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->cancelTextSize:I

    .line 25
    .line 26
    const-string v2, "#0000FF"

    .line 27
    .line 28
    iput-object v2, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->confirmTextColorStr:Ljava/lang/String;

    .line 29
    .line 30
    const-string v2, "\u786e\u5b9a"

    .line 31
    .line 32
    iput-object v2, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->confirmText:Ljava/lang/String;

    .line 33
    .line 34
    iput v1, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->confirmTextSize:I

    .line 35
    .line 36
    const-string v1, "\u9009\u62e9\u5730\u533a"

    .line 37
    .line 38
    iput-object v1, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->mTitle:Ljava/lang/String;

    .line 39
    .line 40
    const-string v1, "#E9E9E9"

    .line 41
    .line 42
    iput-object v1, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->titleBackgroundColorStr:Ljava/lang/String;

    .line 43
    .line 44
    const-string v1, "#585858"

    .line 45
    .line 46
    iput-object v1, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->titleTextColorStr:Ljava/lang/String;

    .line 47
    .line 48
    const/16 v1, 0x12

    .line 49
    .line 50
    iput v1, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->titleTextSize:I

    .line 51
    .line 52
    iput-boolean v0, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->isShowBackground:Z

    .line 53
    .line 54
    iput-boolean v0, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->drawShadows:Z

    .line 55
    .line 56
    const-string v0, "#C7C7C7"

    .line 57
    .line 58
    iput-object v0, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->lineColor:Ljava/lang/String;

    .line 59
    .line 60
    sget-object v0, Lcom/lljjcoder/citywheel/CustomConfig$WheelType;->PRO_CITY_DIS:Lcom/lljjcoder/citywheel/CustomConfig$WheelType;

    .line 61
    .line 62
    iput-object v0, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->mWheelType:Lcom/lljjcoder/citywheel/CustomConfig$WheelType;

    .line 63
    .line 64
    const/4 v0, 0x3

    .line 65
    iput v0, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->lineHeigh:I

    .line 66
    .line 67
    new-instance v0, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 70
    .line 71
    .line 72
    iput-object v0, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->cityDataList:Ljava/util/List;

    .line 73
    .line 74
    const-string v0, ""

    .line 75
    .line 76
    iput-object v0, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->defaultProvinceName:Ljava/lang/String;

    .line 77
    .line 78
    iput-object v0, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->defaultCityName:Ljava/lang/String;

    .line 79
    .line 80
    iput-object v0, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->defaultDistrict:Ljava/lang/String;

    .line 81
    .line 82
    return-void
.end method

.method public static synthetic access$000(Lcom/lljjcoder/citywheel/CustomConfig$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->titleBackgroundColorStr:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$100(Lcom/lljjcoder/citywheel/CustomConfig$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->mTitle:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1000(Lcom/lljjcoder/citywheel/CustomConfig$Builder;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->visibleItems:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$1100(Lcom/lljjcoder/citywheel/CustomConfig$Builder;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->isProvinceCyclic:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$1200(Lcom/lljjcoder/citywheel/CustomConfig$Builder;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->isDistrictCyclic:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$1300(Lcom/lljjcoder/citywheel/CustomConfig$Builder;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->isCityCyclic:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$1400(Lcom/lljjcoder/citywheel/CustomConfig$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->defaultDistrict:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1500(Lcom/lljjcoder/citywheel/CustomConfig$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->defaultCityName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1600(Lcom/lljjcoder/citywheel/CustomConfig$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->defaultProvinceName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1700(Lcom/lljjcoder/citywheel/CustomConfig$Builder;)Lcom/lljjcoder/citywheel/CustomConfig$WheelType;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->mWheelType:Lcom/lljjcoder/citywheel/CustomConfig$WheelType;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1800(Lcom/lljjcoder/citywheel/CustomConfig$Builder;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->isShowBackground:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$1900(Lcom/lljjcoder/citywheel/CustomConfig$Builder;)Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->customItemLayout:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$200(Lcom/lljjcoder/citywheel/CustomConfig$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->titleTextColorStr:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$2000(Lcom/lljjcoder/citywheel/CustomConfig$Builder;)Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->customItemTextViewId:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$2100(Lcom/lljjcoder/citywheel/CustomConfig$Builder;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->drawShadows:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$2200(Lcom/lljjcoder/citywheel/CustomConfig$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->lineColor:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$2300(Lcom/lljjcoder/citywheel/CustomConfig$Builder;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->lineHeigh:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$2400(Lcom/lljjcoder/citywheel/CustomConfig$Builder;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->cityDataList:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$300(Lcom/lljjcoder/citywheel/CustomConfig$Builder;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->titleTextSize:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$400(Lcom/lljjcoder/citywheel/CustomConfig$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->cancelTextColorStr:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$500(Lcom/lljjcoder/citywheel/CustomConfig$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->cancelText:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$600(Lcom/lljjcoder/citywheel/CustomConfig$Builder;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->cancelTextSize:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$700(Lcom/lljjcoder/citywheel/CustomConfig$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->confirmTextColorStr:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$800(Lcom/lljjcoder/citywheel/CustomConfig$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->confirmText:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$900(Lcom/lljjcoder/citywheel/CustomConfig$Builder;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->confirmTextSize:I

    .line 2
    .line 3
    return p0
.end method


# virtual methods
.method public build()Lcom/lljjcoder/citywheel/CustomConfig;
    .locals 1

    .line 1
    new-instance v0, Lcom/lljjcoder/citywheel/CustomConfig;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/lljjcoder/citywheel/CustomConfig;-><init>(Lcom/lljjcoder/citywheel/CustomConfig$Builder;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public cancelText(Ljava/lang/String;)Lcom/lljjcoder/citywheel/CustomConfig$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->cancelText:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public cancelTextColor(Ljava/lang/String;)Lcom/lljjcoder/citywheel/CustomConfig$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->cancelTextColorStr:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public cancelTextSize(I)Lcom/lljjcoder/citywheel/CustomConfig$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->cancelTextSize:I

    .line 2
    .line 3
    return-object p0
.end method

.method public city(Ljava/lang/String;)Lcom/lljjcoder/citywheel/CustomConfig$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->defaultCityName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public cityCyclic(Z)Lcom/lljjcoder/citywheel/CustomConfig$Builder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->isCityCyclic:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public confirTextColor(Ljava/lang/String;)Lcom/lljjcoder/citywheel/CustomConfig$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->confirmTextColorStr:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public confirmText(Ljava/lang/String;)Lcom/lljjcoder/citywheel/CustomConfig$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->confirmText:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public confirmTextSize(I)Lcom/lljjcoder/citywheel/CustomConfig$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->confirmTextSize:I

    .line 2
    .line 3
    return-object p0
.end method

.method public district(Ljava/lang/String;)Lcom/lljjcoder/citywheel/CustomConfig$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->defaultDistrict:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public districtCyclic(Z)Lcom/lljjcoder/citywheel/CustomConfig$Builder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->isDistrictCyclic:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public drawShadows(Z)Lcom/lljjcoder/citywheel/CustomConfig$Builder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->drawShadows:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public province(Ljava/lang/String;)Lcom/lljjcoder/citywheel/CustomConfig$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->defaultProvinceName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public provinceCyclic(Z)Lcom/lljjcoder/citywheel/CustomConfig$Builder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->isProvinceCyclic:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public setCityData(Ljava/util/List;)Lcom/lljjcoder/citywheel/CustomConfig$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/lljjcoder/bean/CustomCityData;",
            ">;)",
            "Lcom/lljjcoder/citywheel/CustomConfig$Builder;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->cityDataList:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public setCityWheelType(Lcom/lljjcoder/citywheel/CustomConfig$WheelType;)Lcom/lljjcoder/citywheel/CustomConfig$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->mWheelType:Lcom/lljjcoder/citywheel/CustomConfig$WheelType;

    .line 2
    .line 3
    return-object p0
.end method

.method public setCustomItemLayout(Ljava/lang/Integer;)Lcom/lljjcoder/citywheel/CustomConfig$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->customItemLayout:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public setCustomItemTextViewId(Ljava/lang/Integer;)Lcom/lljjcoder/citywheel/CustomConfig$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->customItemTextViewId:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public setLineColor(Ljava/lang/String;)Lcom/lljjcoder/citywheel/CustomConfig$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->lineColor:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public setLineHeigh(I)Lcom/lljjcoder/citywheel/CustomConfig$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->lineHeigh:I

    .line 2
    .line 3
    return-object p0
.end method

.method public showBackground(Z)Lcom/lljjcoder/citywheel/CustomConfig$Builder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->isShowBackground:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public title(Ljava/lang/String;)Lcom/lljjcoder/citywheel/CustomConfig$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->mTitle:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public titleBackgroundColor(Ljava/lang/String;)Lcom/lljjcoder/citywheel/CustomConfig$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->titleBackgroundColorStr:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public titleTextColor(Ljava/lang/String;)Lcom/lljjcoder/citywheel/CustomConfig$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->titleTextColorStr:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public titleTextSize(I)Lcom/lljjcoder/citywheel/CustomConfig$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->titleTextSize:I

    .line 2
    .line 3
    return-object p0
.end method

.method public visibleItemsCount(I)Lcom/lljjcoder/citywheel/CustomConfig$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/lljjcoder/citywheel/CustomConfig$Builder;->visibleItems:I

    .line 2
    .line 3
    return-object p0
.end method
