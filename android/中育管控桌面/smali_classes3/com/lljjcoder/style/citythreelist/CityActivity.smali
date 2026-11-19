.class public Lcom/lljjcoder/style/citythreelist/CityActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# instance fields
.field private area:Lcom/lljjcoder/style/citythreelist/CityBean;

.field private cityBean:Lcom/lljjcoder/style/citythreelist/CityBean;

.field private cityName:Ljava/lang/String;

.field private mCityNameTv:Landroid/widget/TextView;

.field private mCityRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

.field private mImgBack:Landroid/widget/ImageView;

.field private mProInfo:Lcom/lljjcoder/style/citylist/bean/CityInfoBean;


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
    iput-object v0, p0, Lcom/lljjcoder/style/citythreelist/CityActivity;->mProInfo:Lcom/lljjcoder/style/citylist/bean/CityInfoBean;

    .line 6
    .line 7
    const-string v0, ""

    .line 8
    .line 9
    iput-object v0, p0, Lcom/lljjcoder/style/citythreelist/CityActivity;->cityName:Ljava/lang/String;

    .line 10
    .line 11
    new-instance v0, Lcom/lljjcoder/style/citythreelist/CityBean;

    .line 12
    .line 13
    invoke-direct {v0}, Lcom/lljjcoder/style/citythreelist/CityBean;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/lljjcoder/style/citythreelist/CityActivity;->cityBean:Lcom/lljjcoder/style/citythreelist/CityBean;

    .line 17
    .line 18
    new-instance v0, Lcom/lljjcoder/style/citythreelist/CityBean;

    .line 19
    .line 20
    invoke-direct {v0}, Lcom/lljjcoder/style/citythreelist/CityBean;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/lljjcoder/style/citythreelist/CityActivity;->area:Lcom/lljjcoder/style/citythreelist/CityBean;

    .line 24
    .line 25
    return-void
.end method

.method public static synthetic access$000(Lcom/lljjcoder/style/citythreelist/CityActivity;)Lcom/lljjcoder/style/citythreelist/CityBean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/style/citythreelist/CityActivity;->cityBean:Lcom/lljjcoder/style/citythreelist/CityBean;

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
    iput-object v0, p0, Lcom/lljjcoder/style/citythreelist/CityActivity;->mImgBack:Landroid/widget/ImageView;

    .line 10
    .line 11
    sget v0, Lcom/lljjcoder/style/citypickerview/R$id;->cityname_tv:I

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroid/widget/TextView;

    .line 18
    .line 19
    iput-object v1, p0, Lcom/lljjcoder/style/citythreelist/CityActivity;->mCityNameTv:Landroid/widget/TextView;

    .line 20
    .line 21
    iget-object v1, p0, Lcom/lljjcoder/style/citythreelist/CityActivity;->mImgBack:Landroid/widget/ImageView;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lcom/lljjcoder/style/citythreelist/CityActivity;->mImgBack:Landroid/widget/ImageView;

    .line 28
    .line 29
    new-instance v3, Lcom/lljjcoder/style/citythreelist/CityActivity$2;

    .line 30
    .line 31
    invoke-direct {v3, p0}, Lcom/lljjcoder/style/citythreelist/CityActivity$2;-><init>(Lcom/lljjcoder/style/citythreelist/CityActivity;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Landroid/widget/TextView;

    .line 42
    .line 43
    iput-object v0, p0, Lcom/lljjcoder/style/citythreelist/CityActivity;->mCityNameTv:Landroid/widget/TextView;

    .line 44
    .line 45
    sget v0, Lcom/lljjcoder/style/citypickerview/R$id;->city_recyclerview:I

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 52
    .line 53
    iput-object v0, p0, Lcom/lljjcoder/style/citythreelist/CityActivity;->mCityRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    .line 54
    .line 55
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 56
    .line 57
    invoke-direct {v1, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Lcom/lljjcoder/style/citythreelist/CityActivity;->mCityRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    .line 64
    .line 65
    new-instance v1, Lcom/lljjcoder/widget/RecycleViewDividerForList;

    .line 66
    .line 67
    const/4 v3, 0x1

    .line 68
    invoke-direct {v1, p0, v2, v3}, Lcom/lljjcoder/widget/RecycleViewDividerForList;-><init>(Landroid/content/Context;IZ)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method private setData(Lcom/lljjcoder/style/citylist/bean/CityInfoBean;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/lljjcoder/style/citylist/bean/CityInfoBean;->getCityList()Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-lez v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lcom/lljjcoder/style/citythreelist/CityActivity;->mCityNameTv:Landroid/widget/TextView;

    .line 14
    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v2, ""

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/lljjcoder/style/citylist/bean/CityInfoBean;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/lljjcoder/style/citylist/bean/CityInfoBean;->getCityList()Ljava/util/ArrayList;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-nez p1, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    new-instance v0, Lcom/lljjcoder/style/citythreelist/CityAdapter;

    .line 47
    .line 48
    invoke-direct {v0, p0, p1}, Lcom/lljjcoder/style/citythreelist/CityAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Lcom/lljjcoder/style/citythreelist/CityActivity;->mCityRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    .line 52
    .line 53
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 54
    .line 55
    .line 56
    new-instance v1, Lcom/lljjcoder/style/citythreelist/CityActivity$1;

    .line 57
    .line 58
    invoke-direct {v1, p0, p1}, Lcom/lljjcoder/style/citythreelist/CityActivity$1;-><init>(Lcom/lljjcoder/style/citythreelist/CityActivity;Ljava/util/List;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v1}, Lcom/lljjcoder/style/citythreelist/CityAdapter;->setOnItemClickListener(Lcom/lljjcoder/style/citythreelist/CityAdapter$OnItemSelectedListener;)V

    .line 62
    .line 63
    .line 64
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    const/16 p1, 0x3e9

    .line 5
    .line 6
    if-ne p2, p1, :cond_0

    .line 7
    .line 8
    if-eqz p3, :cond_0

    .line 9
    .line 10
    const-string p1, "area"

    .line 11
    .line 12
    invoke-virtual {p3, p1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    check-cast p2, Lcom/lljjcoder/style/citythreelist/CityBean;

    .line 17
    .line 18
    iput-object p2, p0, Lcom/lljjcoder/style/citythreelist/CityActivity;->area:Lcom/lljjcoder/style/citythreelist/CityBean;

    .line 19
    .line 20
    new-instance p2, Landroid/content/Intent;

    .line 21
    .line 22
    invoke-direct {p2}, Landroid/content/Intent;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string p3, "city"

    .line 26
    .line 27
    iget-object v0, p0, Lcom/lljjcoder/style/citythreelist/CityActivity;->cityBean:Lcom/lljjcoder/style/citythreelist/CityBean;

    .line 28
    .line 29
    invoke-virtual {p2, p3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 30
    .line 31
    .line 32
    iget-object p3, p0, Lcom/lljjcoder/style/citythreelist/CityActivity;->area:Lcom/lljjcoder/style/citythreelist/CityBean;

    .line 33
    .line 34
    invoke-virtual {p2, p1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 35
    .line 36
    .line 37
    const/4 p1, -0x1

    .line 38
    invoke-virtual {p0, p1, p2}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 42
    .line 43
    .line 44
    :cond_0
    return-void
.end method

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
    iput-object p1, p0, Lcom/lljjcoder/style/citythreelist/CityActivity;->mProInfo:Lcom/lljjcoder/style/citylist/bean/CityInfoBean;

    .line 22
    .line 23
    invoke-direct {p0}, Lcom/lljjcoder/style/citythreelist/CityActivity;->initView()V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lcom/lljjcoder/style/citythreelist/CityActivity;->mProInfo:Lcom/lljjcoder/style/citylist/bean/CityInfoBean;

    .line 27
    .line 28
    invoke-direct {p0, p1}, Lcom/lljjcoder/style/citythreelist/CityActivity;->setData(Lcom/lljjcoder/style/citylist/bean/CityInfoBean;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
