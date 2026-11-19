.class public Lcom/lljjcoder/style/citythreelist/AreaActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# instance fields
.field private areaBean:Lcom/lljjcoder/style/citythreelist/CityBean;

.field private mCityNameTv:Landroid/widget/TextView;

.field private mCityRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

.field private mImgBack:Landroid/widget/ImageView;

.field private mProCityInfo:Lcom/lljjcoder/style/citylist/bean/CityInfoBean;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/lljjcoder/style/citythreelist/AreaActivity;->mProCityInfo:Lcom/lljjcoder/style/citylist/bean/CityInfoBean;

    .line 6
    .line 7
    new-instance v0, Lcom/lljjcoder/style/citythreelist/CityBean;

    .line 8
    .line 9
    invoke-direct {v0}, Lcom/lljjcoder/style/citythreelist/CityBean;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/lljjcoder/style/citythreelist/AreaActivity;->areaBean:Lcom/lljjcoder/style/citythreelist/CityBean;

    .line 13
    .line 14
    return-void
.end method

.method public static synthetic access$000(Lcom/lljjcoder/style/citythreelist/AreaActivity;)Lcom/lljjcoder/style/citythreelist/CityBean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/style/citythreelist/AreaActivity;->areaBean:Lcom/lljjcoder/style/citythreelist/CityBean;

    .line 2
    .line 3
    return-object p0
.end method

.method private initView()V
    .locals 4

    .line 1
    sget v0, Lcom/lljjcoder/style/citypickerview/R$id;->img_left:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/widget/ImageView;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/lljjcoder/style/citythreelist/AreaActivity;->mImgBack:Landroid/widget/ImageView;

    .line 10
    .line 11
    sget v0, Lcom/lljjcoder/style/citypickerview/R$id;->cityname_tv:I

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroid/widget/TextView;

    .line 18
    .line 19
    iput-object v0, p0, Lcom/lljjcoder/style/citythreelist/AreaActivity;->mCityNameTv:Landroid/widget/TextView;

    .line 20
    .line 21
    iget-object v0, p0, Lcom/lljjcoder/style/citythreelist/AreaActivity;->mImgBack:Landroid/widget/ImageView;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/lljjcoder/style/citythreelist/AreaActivity;->mImgBack:Landroid/widget/ImageView;

    .line 28
    .line 29
    new-instance v2, Lcom/lljjcoder/style/citythreelist/AreaActivity$2;

    .line 30
    .line 31
    invoke-direct {v2, p0}, Lcom/lljjcoder/style/citythreelist/AreaActivity$2;-><init>(Lcom/lljjcoder/style/citythreelist/AreaActivity;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 35
    .line 36
    .line 37
    sget v0, Lcom/lljjcoder/style/citypickerview/R$id;->city_recyclerview:I

    .line 38
    .line 39
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 44
    .line 45
    iput-object v0, p0, Lcom/lljjcoder/style/citythreelist/AreaActivity;->mCityRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    .line 46
    .line 47
    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 48
    .line 49
    invoke-direct {v2, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lcom/lljjcoder/style/citythreelist/AreaActivity;->mCityRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    .line 56
    .line 57
    new-instance v2, Lcom/lljjcoder/widget/RecycleViewDividerForList;

    .line 58
    .line 59
    const/4 v3, 0x1

    .line 60
    invoke-direct {v2, p0, v1, v3}, Lcom/lljjcoder/widget/RecycleViewDividerForList;-><init>(Landroid/content/Context;IZ)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method private setData()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/style/citythreelist/AreaActivity;->mProCityInfo:Lcom/lljjcoder/style/citylist/bean/CityInfoBean;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/lljjcoder/style/citylist/bean/CityInfoBean;->getCityList()Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-lez v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Lcom/lljjcoder/style/citythreelist/AreaActivity;->mCityNameTv:Landroid/widget/TextView;

    .line 16
    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v2, ""

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    iget-object v2, p0, Lcom/lljjcoder/style/citythreelist/AreaActivity;->mProCityInfo:Lcom/lljjcoder/style/citylist/bean/CityInfoBean;

    .line 28
    .line 29
    invoke-virtual {v2}, Lcom/lljjcoder/style/citylist/bean/CityInfoBean;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lcom/lljjcoder/style/citythreelist/AreaActivity;->mProCityInfo:Lcom/lljjcoder/style/citylist/bean/CityInfoBean;

    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/lljjcoder/style/citylist/bean/CityInfoBean;->getCityList()Ljava/util/ArrayList;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-nez v0, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    new-instance v1, Lcom/lljjcoder/style/citythreelist/CityAdapter;

    .line 53
    .line 54
    invoke-direct {v1, p0, v0}, Lcom/lljjcoder/style/citythreelist/CityAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 55
    .line 56
    .line 57
    iget-object v2, p0, Lcom/lljjcoder/style/citythreelist/AreaActivity;->mCityRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    .line 58
    .line 59
    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 60
    .line 61
    .line 62
    new-instance v2, Lcom/lljjcoder/style/citythreelist/AreaActivity$1;

    .line 63
    .line 64
    invoke-direct {v2, p0, v0}, Lcom/lljjcoder/style/citythreelist/AreaActivity$1;-><init>(Lcom/lljjcoder/style/citythreelist/AreaActivity;Ljava/util/List;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, v2}, Lcom/lljjcoder/style/citythreelist/CityAdapter;->setOnItemClickListener(Lcom/lljjcoder/style/citythreelist/CityAdapter$OnItemSelectedListener;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    # RE layout layout/activity_citylist (0x7f0c001d), APK res/zm.xml
    sget p1, Lcom/lljjcoder/style/citypickerview/R$layout;->activity_citylist:I

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setContentView(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-string v0, "bundata"

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lcom/lljjcoder/style/citylist/bean/CityInfoBean;

    .line 20
    .line 21
    iput-object p1, p0, Lcom/lljjcoder/style/citythreelist/AreaActivity;->mProCityInfo:Lcom/lljjcoder/style/citylist/bean/CityInfoBean;

    .line 22
    .line 23
    invoke-direct {p0}, Lcom/lljjcoder/style/citythreelist/AreaActivity;->initView()V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Lcom/lljjcoder/style/citythreelist/AreaActivity;->setData()V

    .line 27
    .line 28
    .line 29
    return-void
.end method
