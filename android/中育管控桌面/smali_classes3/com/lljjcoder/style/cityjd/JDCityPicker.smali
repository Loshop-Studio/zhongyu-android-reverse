.class public Lcom/lljjcoder/style/cityjd/JDCityPicker;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private areaList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/lljjcoder/bean/DistrictBean;",
            ">;"
        }
    .end annotation
.end field

.field private cityConfig:Lcom/lljjcoder/style/cityjd/JDCityConfig;

.field private cityList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/lljjcoder/bean/CityBean;",
            ">;"
        }
    .end annotation
.end field

.field private colorAlert:Ljava/lang/String;

.field private colorSelected:Ljava/lang/String;

.field private context:Landroid/content/Context;

.field private mAreaAdapter:Lcom/lljjcoder/style/cityjd/AreaAdapter;

.field private mAreaTv:Landroid/widget/TextView;

.field private mBaseListener:Lcom/lljjcoder/Interface/OnCityItemClickListener;

.field private mCityAdapter:Lcom/lljjcoder/style/cityjd/CityAdapter;

.field private mCityListView:Landroid/widget/ListView;

.field private mCityTv:Landroid/widget/TextView;

.field private mCloseImg:Landroid/widget/ImageView;

.field private mHandler:Landroid/os/Handler;

.field private mProTv:Landroid/widget/TextView;

.field private mProvinceAdapter:Lcom/lljjcoder/style/cityjd/ProvinceAdapter;

.field private mSelectedLine:Landroid/view/View;

.field private parseHelper:Lcom/lljjcoder/citywheel/CityParseHelper;

.field private popview:Landroid/view/View;

.field private popwindow:Landroid/widget/PopupWindow;

.field private provinceList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/lljjcoder/bean/ProvinceBean;",
            ">;"
        }
    .end annotation
.end field

.field private tabIndex:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->provinceList:Ljava/util/List;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->cityList:Ljava/util/List;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->areaList:Ljava/util/List;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iput v1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->tabIndex:I

    .line 13
    .line 14
    const-string v1, "#ff181c20"

    .line 15
    .line 16
    iput-object v1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->colorSelected:Ljava/lang/String;

    .line 17
    .line 18
    const-string v1, "#ffff4444"

    .line 19
    .line 20
    iput-object v1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->colorAlert:Ljava/lang/String;

    .line 21
    .line 22
    iput-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->cityConfig:Lcom/lljjcoder/style/cityjd/JDCityConfig;

    .line 23
    .line 24
    new-instance v0, Landroid/os/Handler;

    .line 25
    .line 26
    new-instance v1, Lcom/lljjcoder/style/cityjd/JDCityPicker$9;

    .line 27
    .line 28
    invoke-direct {v1, p0}, Lcom/lljjcoder/style/cityjd/JDCityPicker$9;-><init>(Lcom/lljjcoder/style/cityjd/JDCityPicker;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mHandler:Landroid/os/Handler;

    .line 35
    .line 36
    return-void
.end method

.method public static synthetic access$000(Lcom/lljjcoder/style/cityjd/JDCityPicker;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->context:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$100(Lcom/lljjcoder/style/cityjd/JDCityPicker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->hidePop()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$1000(Lcom/lljjcoder/style/cityjd/JDCityPicker;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->selectedList(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$1100(Lcom/lljjcoder/style/cityjd/JDCityPicker;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mProTv:Landroid/widget/TextView;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1200(Lcom/lljjcoder/style/cityjd/JDCityPicker;Landroid/widget/TextView;)Landroid/animation/AnimatorSet;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->tabSelectedIndicatorAnimation(Landroid/widget/TextView;)Landroid/animation/AnimatorSet;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic access$1300(Lcom/lljjcoder/style/cityjd/JDCityPicker;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mCityTv:Landroid/widget/TextView;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1400(Lcom/lljjcoder/style/cityjd/JDCityPicker;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mAreaTv:Landroid/widget/TextView;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1500(Lcom/lljjcoder/style/cityjd/JDCityPicker;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mSelectedLine:Landroid/view/View;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1602(Lcom/lljjcoder/style/cityjd/JDCityPicker;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->provinceList:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$1700(Lcom/lljjcoder/style/cityjd/JDCityPicker;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->cityList:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1702(Lcom/lljjcoder/style/cityjd/JDCityPicker;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->cityList:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$1800(Lcom/lljjcoder/style/cityjd/JDCityPicker;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->areaList:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1802(Lcom/lljjcoder/style/cityjd/JDCityPicker;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->areaList:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$1900(Lcom/lljjcoder/style/cityjd/JDCityPicker;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->updateTabsStyle(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$200(Lcom/lljjcoder/style/cityjd/JDCityPicker;)Lcom/lljjcoder/Interface/OnCityItemClickListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mBaseListener:Lcom/lljjcoder/Interface/OnCityItemClickListener;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$300(Lcom/lljjcoder/style/cityjd/JDCityPicker;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->tabIndex:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$302(Lcom/lljjcoder/style/cityjd/JDCityPicker;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->tabIndex:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$400(Lcom/lljjcoder/style/cityjd/JDCityPicker;)Lcom/lljjcoder/style/cityjd/ProvinceAdapter;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mProvinceAdapter:Lcom/lljjcoder/style/cityjd/ProvinceAdapter;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$500(Lcom/lljjcoder/style/cityjd/JDCityPicker;)Landroid/widget/ListView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mCityListView:Landroid/widget/ListView;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$600(Lcom/lljjcoder/style/cityjd/JDCityPicker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->updateTabVisible()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$700(Lcom/lljjcoder/style/cityjd/JDCityPicker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->updateIndicator()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$800(Lcom/lljjcoder/style/cityjd/JDCityPicker;)Lcom/lljjcoder/style/cityjd/CityAdapter;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mCityAdapter:Lcom/lljjcoder/style/cityjd/CityAdapter;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$900(Lcom/lljjcoder/style/cityjd/JDCityPicker;)Lcom/lljjcoder/style/cityjd/AreaAdapter;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mAreaAdapter:Lcom/lljjcoder/style/cityjd/AreaAdapter;

    .line 2
    .line 3
    return-object p0
.end method

.method private callback(Lcom/lljjcoder/bean/DistrictBean;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->provinceList:Ljava/util/List;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, -0x1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mProvinceAdapter:Lcom/lljjcoder/style/cityjd/ProvinceAdapter;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/lljjcoder/style/cityjd/ProvinceAdapter;->getSelectedPosition()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eq v0, v2, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->provinceList:Ljava/util/List;

    .line 24
    .line 25
    iget-object v3, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mProvinceAdapter:Lcom/lljjcoder/style/cityjd/ProvinceAdapter;

    .line 26
    .line 27
    invoke-virtual {v3}, Lcom/lljjcoder/style/cityjd/ProvinceAdapter;->getSelectedPosition()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lcom/lljjcoder/bean/ProvinceBean;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move-object v0, v1

    .line 39
    :goto_0
    iget-object v3, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->cityList:Ljava/util/List;

    .line 40
    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-nez v3, :cond_1

    .line 48
    .line 49
    iget-object v3, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mCityAdapter:Lcom/lljjcoder/style/cityjd/CityAdapter;

    .line 50
    .line 51
    if-eqz v3, :cond_1

    .line 52
    .line 53
    invoke-virtual {v3}, Lcom/lljjcoder/style/cityjd/CityAdapter;->getSelectedPosition()I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eq v3, v2, :cond_1

    .line 58
    .line 59
    iget-object v1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->cityList:Ljava/util/List;

    .line 60
    .line 61
    iget-object v2, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mCityAdapter:Lcom/lljjcoder/style/cityjd/CityAdapter;

    .line 62
    .line 63
    invoke-virtual {v2}, Lcom/lljjcoder/style/cityjd/CityAdapter;->getSelectedPosition()I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Lcom/lljjcoder/bean/CityBean;

    .line 72
    .line 73
    :cond_1
    iget-object v2, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mBaseListener:Lcom/lljjcoder/Interface/OnCityItemClickListener;

    .line 74
    .line 75
    invoke-virtual {v2, v0, v1, p1}, Lcom/lljjcoder/Interface/OnCityItemClickListener;->onSelected(Lcom/lljjcoder/bean/ProvinceBean;Lcom/lljjcoder/bean/CityBean;Lcom/lljjcoder/bean/DistrictBean;)V

    .line 76
    .line 77
    .line 78
    invoke-direct {p0}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->hidePop()V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method private hidePop()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->isShow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->popwindow:Landroid/widget/PopupWindow;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method private initJDCityPickerPop()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->cityConfig:Lcom/lljjcoder/style/cityjd/JDCityConfig;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/lljjcoder/style/cityjd/JDCityConfig$Builder;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/lljjcoder/style/cityjd/JDCityConfig$Builder;-><init>()V

    .line 8
    .line 9
    .line 10
    sget-object v1, Lcom/lljjcoder/style/cityjd/JDCityConfig$ShowType;->PRO_CITY_DIS:Lcom/lljjcoder/style/cityjd/JDCityConfig$ShowType;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/lljjcoder/style/cityjd/JDCityConfig$Builder;->setJDCityShowType(Lcom/lljjcoder/style/cityjd/JDCityConfig$ShowType;)Lcom/lljjcoder/style/cityjd/JDCityConfig$Builder;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Lcom/lljjcoder/style/cityjd/JDCityConfig$Builder;->build()Lcom/lljjcoder/style/cityjd/JDCityConfig;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->cityConfig:Lcom/lljjcoder/style/cityjd/JDCityConfig;

    .line 21
    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    iput v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->tabIndex:I

    .line 24
    .line 25
    iget-object v1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->parseHelper:Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 26
    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    new-instance v1, Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 30
    .line 31
    invoke-direct {v1}, Lcom/lljjcoder/citywheel/CityParseHelper;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->parseHelper:Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 35
    .line 36
    :cond_1
    iget-object v1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->parseHelper:Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 37
    .line 38
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CityParseHelper;->getProvinceBeanArrayList()Ljava/util/ArrayList;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->context:Landroid/content/Context;

    .line 49
    .line 50
    const-string v1, "\u8bf7\u8c03\u7528init\u65b9\u6cd5\u8fdb\u884c\u521d\u59cb\u5316\u76f8\u5173\u64cd\u4f5c"

    .line 51
    .line 52
    invoke-static {v0, v1}, Lcom/lljjcoder/style/citylist/Toast/ToastUtils;->showLongToast(Landroid/content/Context;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_2
    iget-object v1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->context:Landroid/content/Context;

    .line 57
    .line 58
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    sget v2, Lcom/lljjcoder/style/citypickerview/R$layout;->pop_jdcitypicker:I

    .line 63
    .line 64
    const/4 v3, 0x0

    .line 65
    invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    iput-object v1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->popview:Landroid/view/View;

    .line 70
    .line 71
    sget v2, Lcom/lljjcoder/style/citypickerview/R$id;->city_listview:I

    .line 72
    .line 73
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    check-cast v1, Landroid/widget/ListView;

    .line 78
    .line 79
    iput-object v1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mCityListView:Landroid/widget/ListView;

    .line 80
    .line 81
    iget-object v1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->popview:Landroid/view/View;

    .line 82
    .line 83
    sget v2, Lcom/lljjcoder/style/citypickerview/R$id;->province_tv:I

    .line 84
    .line 85
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    check-cast v1, Landroid/widget/TextView;

    .line 90
    .line 91
    iput-object v1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mProTv:Landroid/widget/TextView;

    .line 92
    .line 93
    iget-object v1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->popview:Landroid/view/View;

    .line 94
    .line 95
    sget v2, Lcom/lljjcoder/style/citypickerview/R$id;->city_tv:I

    .line 96
    .line 97
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    check-cast v1, Landroid/widget/TextView;

    .line 102
    .line 103
    iput-object v1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mCityTv:Landroid/widget/TextView;

    .line 104
    .line 105
    iget-object v1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->popview:Landroid/view/View;

    .line 106
    .line 107
    sget v2, Lcom/lljjcoder/style/citypickerview/R$id;->area_tv:I

    .line 108
    .line 109
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    check-cast v1, Landroid/widget/TextView;

    .line 114
    .line 115
    iput-object v1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mAreaTv:Landroid/widget/TextView;

    .line 116
    .line 117
    iget-object v1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->popview:Landroid/view/View;

    .line 118
    .line 119
    sget v2, Lcom/lljjcoder/style/citypickerview/R$id;->close_img:I

    .line 120
    .line 121
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    check-cast v1, Landroid/widget/ImageView;

    .line 126
    .line 127
    iput-object v1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mCloseImg:Landroid/widget/ImageView;

    .line 128
    .line 129
    iget-object v1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->popview:Landroid/view/View;

    .line 130
    .line 131
    sget v2, Lcom/lljjcoder/style/citypickerview/R$id;->selected_line:I

    .line 132
    .line 133
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    iput-object v1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mSelectedLine:Landroid/view/View;

    .line 138
    .line 139
    new-instance v1, Landroid/widget/PopupWindow;

    .line 140
    .line 141
    iget-object v2, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->popview:Landroid/view/View;

    .line 142
    .line 143
    const/4 v3, -0x2

    .line 144
    const/4 v4, -0x1

    .line 145
    invoke-direct {v1, v2, v4, v3}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;II)V

    .line 146
    .line 147
    .line 148
    iput-object v1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->popwindow:Landroid/widget/PopupWindow;

    .line 149
    .line 150
    sget v2, Lcom/lljjcoder/style/citypickerview/R$style;->AnimBottom:I

    .line 151
    .line 152
    invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    .line 153
    .line 154
    .line 155
    iget-object v1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->popwindow:Landroid/widget/PopupWindow;

    .line 156
    .line 157
    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    .line 158
    .line 159
    invoke-direct {v2}, Landroid/graphics/drawable/ColorDrawable;-><init>()V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 163
    .line 164
    .line 165
    iget-object v1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->popwindow:Landroid/widget/PopupWindow;

    .line 166
    .line 167
    const/4 v2, 0x1

    .line 168
    invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setTouchable(Z)V

    .line 169
    .line 170
    .line 171
    iget-object v1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->popwindow:Landroid/widget/PopupWindow;

    .line 172
    .line 173
    invoke-virtual {v1, v0}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 174
    .line 175
    .line 176
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->popwindow:Landroid/widget/PopupWindow;

    .line 177
    .line 178
    invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 179
    .line 180
    .line 181
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->popwindow:Landroid/widget/PopupWindow;

    .line 182
    .line 183
    new-instance v1, Lcom/lljjcoder/style/cityjd/JDCityPicker$1;

    .line 184
    .line 185
    invoke-direct {v1, p0}, Lcom/lljjcoder/style/cityjd/JDCityPicker$1;-><init>(Lcom/lljjcoder/style/cityjd/JDCityPicker;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 189
    .line 190
    .line 191
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mCloseImg:Landroid/widget/ImageView;

    .line 192
    .line 193
    new-instance v1, Lcom/lljjcoder/style/cityjd/JDCityPicker$2;

    .line 194
    .line 195
    invoke-direct {v1, p0}, Lcom/lljjcoder/style/cityjd/JDCityPicker$2;-><init>(Lcom/lljjcoder/style/cityjd/JDCityPicker;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 199
    .line 200
    .line 201
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mProTv:Landroid/widget/TextView;

    .line 202
    .line 203
    new-instance v1, Lcom/lljjcoder/style/cityjd/JDCityPicker$3;

    .line 204
    .line 205
    invoke-direct {v1, p0}, Lcom/lljjcoder/style/cityjd/JDCityPicker$3;-><init>(Lcom/lljjcoder/style/cityjd/JDCityPicker;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 209
    .line 210
    .line 211
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mCityTv:Landroid/widget/TextView;

    .line 212
    .line 213
    new-instance v1, Lcom/lljjcoder/style/cityjd/JDCityPicker$4;

    .line 214
    .line 215
    invoke-direct {v1, p0}, Lcom/lljjcoder/style/cityjd/JDCityPicker$4;-><init>(Lcom/lljjcoder/style/cityjd/JDCityPicker;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 219
    .line 220
    .line 221
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mAreaTv:Landroid/widget/TextView;

    .line 222
    .line 223
    new-instance v1, Lcom/lljjcoder/style/cityjd/JDCityPicker$5;

    .line 224
    .line 225
    invoke-direct {v1, p0}, Lcom/lljjcoder/style/cityjd/JDCityPicker$5;-><init>(Lcom/lljjcoder/style/cityjd/JDCityPicker;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 229
    .line 230
    .line 231
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mCityListView:Landroid/widget/ListView;

    .line 232
    .line 233
    new-instance v1, Lcom/lljjcoder/style/cityjd/JDCityPicker$6;

    .line 234
    .line 235
    invoke-direct {v1, p0}, Lcom/lljjcoder/style/cityjd/JDCityPicker$6;-><init>(Lcom/lljjcoder/style/cityjd/JDCityPicker;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 239
    .line 240
    .line 241
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->context:Landroid/content/Context;

    .line 242
    .line 243
    const/high16 v1, 0x3f000000    # 0.5f

    .line 244
    .line 245
    invoke-static {v0, v1}, Lcom/lljjcoder/utils/utils;->setBackgroundAlpha(Landroid/content/Context;F)V

    .line 246
    .line 247
    .line 248
    invoke-direct {p0}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->updateIndicator()V

    .line 249
    .line 250
    .line 251
    invoke-direct {p0, v4}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->updateTabsStyle(I)V

    .line 252
    .line 253
    .line 254
    invoke-direct {p0}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->setProvinceListData()V

    .line 255
    .line 256
    .line 257
    return-void
.end method

.method private isShow()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->popwindow:Landroid/widget/PopupWindow;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method private selectedList(I)V
    .locals 6

    .line 1
    iget v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->tabIndex:I

    .line 2
    .line 3
    const-string v1, "\u8bf7\u9009\u62e9"

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    const/4 v4, 0x2

    .line 11
    if-eq v0, v3, :cond_1

    .line 12
    .line 13
    if-eq v0, v4, :cond_0

    .line 14
    .line 15
    goto/16 :goto_0

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mAreaAdapter:Lcom/lljjcoder/style/cityjd/AreaAdapter;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lcom/lljjcoder/style/cityjd/AreaAdapter;->getItem(I)Lcom/lljjcoder/bean/DistrictBean;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-eqz p1, :cond_4

    .line 24
    .line 25
    invoke-direct {p0, p1}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->callback(Lcom/lljjcoder/bean/DistrictBean;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mCityAdapter:Lcom/lljjcoder/style/cityjd/CityAdapter;

    .line 30
    .line 31
    invoke-virtual {v0, p1}, Lcom/lljjcoder/style/cityjd/CityAdapter;->getItem(I)Lcom/lljjcoder/bean/CityBean;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz v0, :cond_4

    .line 36
    .line 37
    iget-object v3, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mCityTv:Landroid/widget/TextView;

    .line 38
    .line 39
    new-instance v5, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Lcom/lljjcoder/bean/CityBean;->getName()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    .line 60
    .line 61
    iget-object v2, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mAreaTv:Landroid/widget/TextView;

    .line 62
    .line 63
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mCityAdapter:Lcom/lljjcoder/style/cityjd/CityAdapter;

    .line 67
    .line 68
    invoke-virtual {v1, p1}, Lcom/lljjcoder/style/cityjd/CityAdapter;->updateSelectedPosition(I)V

    .line 69
    .line 70
    .line 71
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mCityAdapter:Lcom/lljjcoder/style/cityjd/CityAdapter;

    .line 72
    .line 73
    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 74
    .line 75
    .line 76
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->cityConfig:Lcom/lljjcoder/style/cityjd/JDCityConfig;

    .line 77
    .line 78
    if-eqz p1, :cond_2

    .line 79
    .line 80
    invoke-virtual {p1}, Lcom/lljjcoder/style/cityjd/JDCityConfig;->getShowType()Lcom/lljjcoder/style/cityjd/JDCityConfig$ShowType;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    sget-object v1, Lcom/lljjcoder/style/cityjd/JDCityConfig$ShowType;->PRO_CITY:Lcom/lljjcoder/style/cityjd/JDCityConfig$ShowType;

    .line 85
    .line 86
    if-ne p1, v1, :cond_2

    .line 87
    .line 88
    new-instance p1, Lcom/lljjcoder/bean/DistrictBean;

    .line 89
    .line 90
    invoke-direct {p1}, Lcom/lljjcoder/bean/DistrictBean;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-direct {p0, p1}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->callback(Lcom/lljjcoder/bean/DistrictBean;)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_2
    new-instance p1, Lcom/lljjcoder/style/cityjd/AreaAdapter;

    .line 98
    .line 99
    iget-object v1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->context:Landroid/content/Context;

    .line 100
    .line 101
    invoke-virtual {v0}, Lcom/lljjcoder/bean/CityBean;->getCityList()Ljava/util/ArrayList;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-direct {p1, v1, v2}, Lcom/lljjcoder/style/cityjd/AreaAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 106
    .line 107
    .line 108
    iput-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mAreaAdapter:Lcom/lljjcoder/style/cityjd/AreaAdapter;

    .line 109
    .line 110
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mHandler:Landroid/os/Handler;

    .line 111
    .line 112
    invoke-virtual {v0}, Lcom/lljjcoder/bean/CityBean;->getCityList()Ljava/util/ArrayList;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-static {p1, v4, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :cond_3
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mProvinceAdapter:Lcom/lljjcoder/style/cityjd/ProvinceAdapter;

    .line 125
    .line 126
    invoke-virtual {v0, p1}, Lcom/lljjcoder/style/cityjd/ProvinceAdapter;->getItem(I)Lcom/lljjcoder/bean/ProvinceBean;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    if-eqz v0, :cond_4

    .line 131
    .line 132
    iget-object v4, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mProTv:Landroid/widget/TextView;

    .line 133
    .line 134
    new-instance v5, Ljava/lang/StringBuilder;

    .line 135
    .line 136
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0}, Lcom/lljjcoder/bean/ProvinceBean;->getName()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 154
    .line 155
    .line 156
    iget-object v2, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mCityTv:Landroid/widget/TextView;

    .line 157
    .line 158
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 159
    .line 160
    .line 161
    iget-object v1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mProvinceAdapter:Lcom/lljjcoder/style/cityjd/ProvinceAdapter;

    .line 162
    .line 163
    invoke-virtual {v1, p1}, Lcom/lljjcoder/style/cityjd/ProvinceAdapter;->updateSelectedPosition(I)V

    .line 164
    .line 165
    .line 166
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mProvinceAdapter:Lcom/lljjcoder/style/cityjd/ProvinceAdapter;

    .line 167
    .line 168
    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 169
    .line 170
    .line 171
    new-instance p1, Lcom/lljjcoder/style/cityjd/CityAdapter;

    .line 172
    .line 173
    iget-object v1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->context:Landroid/content/Context;

    .line 174
    .line 175
    invoke-virtual {v0}, Lcom/lljjcoder/bean/ProvinceBean;->getCityList()Ljava/util/ArrayList;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    invoke-direct {p1, v1, v2}, Lcom/lljjcoder/style/cityjd/CityAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 180
    .line 181
    .line 182
    iput-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mCityAdapter:Lcom/lljjcoder/style/cityjd/CityAdapter;

    .line 183
    .line 184
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mHandler:Landroid/os/Handler;

    .line 185
    .line 186
    invoke-virtual {v0}, Lcom/lljjcoder/bean/ProvinceBean;->getCityList()Ljava/util/ArrayList;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-static {p1, v3, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 195
    .line 196
    .line 197
    :cond_4
    :goto_0
    return-void
.end method

.method private setProvinceListData()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->parseHelper:Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CityParseHelper;->getProvinceBeanArrayList()Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->provinceList:Ljava/util/List;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    new-instance v0, Lcom/lljjcoder/style/cityjd/ProvinceAdapter;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->context:Landroid/content/Context;

    .line 20
    .line 21
    iget-object v2, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->provinceList:Ljava/util/List;

    .line 22
    .line 23
    invoke-direct {v0, v1, v2}, Lcom/lljjcoder/style/cityjd/ProvinceAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mProvinceAdapter:Lcom/lljjcoder/style/cityjd/ProvinceAdapter;

    .line 27
    .line 28
    iget-object v1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mCityListView:Landroid/widget/ListView;

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->context:Landroid/content/Context;

    .line 35
    .line 36
    const-string v1, "\u89e3\u6790\u672c\u5730\u57ce\u5e02\u6570\u636e\u5931\u8d25\uff01"

    .line 37
    .line 38
    invoke-static {v0, v1}, Lcom/lljjcoder/style/citylist/Toast/ToastUtils;->showLongToast(Landroid/content/Context;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method private tabSelectedIndicatorAnimation(Landroid/widget/TextView;)Landroid/animation/AnimatorSet;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mSelectedLine:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getX()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getX()F

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x2

    .line 12
    new-array v4, v3, [F

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    aput v1, v4, v5

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    aput v2, v4, v1

    .line 19
    .line 20
    const-string v2, "X"

    .line 21
    .line 22
    invoke-static {v0, v2, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v2, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mSelectedLine:Landroid/view/View;

    .line 27
    .line 28
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    iget v4, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    filled-new-array {v4, p1}, [I

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    new-instance v4, Lcom/lljjcoder/style/cityjd/JDCityPicker$8;

    .line 47
    .line 48
    invoke-direct {v4, p0, v2}, Lcom/lljjcoder/style/cityjd/JDCityPicker$8;-><init>(Lcom/lljjcoder/style/cityjd/JDCityPicker;Landroid/view/ViewGroup$LayoutParams;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v4}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 52
    .line 53
    .line 54
    new-instance v2, Landroid/animation/AnimatorSet;

    .line 55
    .line 56
    invoke-direct {v2}, Landroid/animation/AnimatorSet;-><init>()V

    .line 57
    .line 58
    .line 59
    new-instance v4, Landroidx/interpolator/view/animation/FastOutSlowInInterpolator;

    .line 60
    .line 61
    invoke-direct {v4}, Landroidx/interpolator/view/animation/FastOutSlowInInterpolator;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2, v4}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 65
    .line 66
    .line 67
    new-array v3, v3, [Landroid/animation/Animator;

    .line 68
    .line 69
    aput-object v0, v3, v5

    .line 70
    .line 71
    aput-object p1, v3, v1

    .line 72
    .line 73
    invoke-virtual {v2, v3}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 74
    .line 75
    .line 76
    return-object v2
.end method

.method private updateIndicator()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->popview:Landroid/view/View;

    .line 2
    .line 3
    new-instance v1, Lcom/lljjcoder/style/cityjd/JDCityPicker$7;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lcom/lljjcoder/style/cityjd/JDCityPicker$7;-><init>(Lcom/lljjcoder/style/cityjd/JDCityPicker;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private updateTabVisible()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mProTv:Landroid/widget/TextView;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->provinceList:Ljava/util/List;

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v1, v3

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    :goto_0
    move v1, v2

    .line 20
    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mCityTv:Landroid/widget/TextView;

    .line 24
    .line 25
    iget-object v1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->cityList:Ljava/util/List;

    .line 26
    .line 27
    if-eqz v1, :cond_3

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    move v1, v3

    .line 37
    goto :goto_3

    .line 38
    :cond_3
    :goto_2
    move v1, v2

    .line 39
    :goto_3
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mAreaTv:Landroid/widget/TextView;

    .line 43
    .line 44
    iget-object v1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->areaList:Ljava/util/List;

    .line 45
    .line 46
    if-eqz v1, :cond_5

    .line 47
    .line 48
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_4

    .line 53
    .line 54
    goto :goto_4

    .line 55
    :cond_4
    move v2, v3

    .line 56
    :cond_5
    :goto_4
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method private updateTabsStyle(I)V
    .locals 3

    .line 1
    const/4 v0, -0x1

    .line 2
    const/16 v1, 0x8

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    if-eq p1, v0, :cond_3

    .line 6
    .line 7
    if-eqz p1, :cond_2

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-eq p1, v0, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    if-eq p1, v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mProTv:Landroid/widget/TextView;

    .line 17
    .line 18
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->colorSelected:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mCityTv:Landroid/widget/TextView;

    .line 28
    .line 29
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->colorSelected:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mAreaTv:Landroid/widget/TextView;

    .line 39
    .line 40
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->colorAlert:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mProTv:Landroid/widget/TextView;

    .line 50
    .line 51
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mCityTv:Landroid/widget/TextView;

    .line 55
    .line 56
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mAreaTv:Landroid/widget/TextView;

    .line 60
    .line 61
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_1
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mProTv:Landroid/widget/TextView;

    .line 66
    .line 67
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->colorSelected:Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 74
    .line 75
    .line 76
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mCityTv:Landroid/widget/TextView;

    .line 77
    .line 78
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->colorAlert:Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 85
    .line 86
    .line 87
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mProTv:Landroid/widget/TextView;

    .line 88
    .line 89
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 90
    .line 91
    .line 92
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mCityTv:Landroid/widget/TextView;

    .line 93
    .line 94
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 95
    .line 96
    .line 97
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mAreaTv:Landroid/widget/TextView;

    .line 98
    .line 99
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :cond_2
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mProTv:Landroid/widget/TextView;

    .line 104
    .line 105
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->colorAlert:Ljava/lang/String;

    .line 106
    .line 107
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 112
    .line 113
    .line 114
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mProTv:Landroid/widget/TextView;

    .line 115
    .line 116
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 117
    .line 118
    .line 119
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mCityTv:Landroid/widget/TextView;

    .line 120
    .line 121
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 122
    .line 123
    .line 124
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mAreaTv:Landroid/widget/TextView;

    .line 125
    .line 126
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :cond_3
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mProTv:Landroid/widget/TextView;

    .line 131
    .line 132
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->colorAlert:Ljava/lang/String;

    .line 133
    .line 134
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 139
    .line 140
    .line 141
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mProTv:Landroid/widget/TextView;

    .line 142
    .line 143
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 144
    .line 145
    .line 146
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mCityTv:Landroid/widget/TextView;

    .line 147
    .line 148
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 149
    .line 150
    .line 151
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mAreaTv:Landroid/widget/TextView;

    .line 152
    .line 153
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 154
    .line 155
    .line 156
    return-void
.end method


# virtual methods
.method public init(Landroid/content/Context;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->context:Landroid/content/Context;

    .line 2
    .line 3
    new-instance v0, Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 4
    .line 5
    invoke-direct {v0}, Lcom/lljjcoder/citywheel/CityParseHelper;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->parseHelper:Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CityParseHelper;->getProvinceBeanArrayList()Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->parseHelper:Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lcom/lljjcoder/citywheel/CityParseHelper;->initData(Landroid/content/Context;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public setConfig(Lcom/lljjcoder/style/cityjd/JDCityConfig;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->cityConfig:Lcom/lljjcoder/style/cityjd/JDCityConfig;

    .line 2
    .line 3
    return-void
.end method

.method public setOnCityItemClickListener(Lcom/lljjcoder/Interface/OnCityItemClickListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->mBaseListener:Lcom/lljjcoder/Interface/OnCityItemClickListener;

    .line 2
    .line 3
    return-void
.end method

.method public showCityPicker()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->initJDCityPickerPop()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->isShow()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->popwindow:Landroid/widget/PopupWindow;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker;->popview:Landroid/view/View;

    .line 13
    .line 14
    const/16 v2, 0x50

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-virtual {v0, v1, v2, v3, v3}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method
