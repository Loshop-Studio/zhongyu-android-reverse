.class public Lcom/lljjcoder/style/citythreelist/ProvinceActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# static fields
.field public static final RESULT_DATA:I = 0x3e9


# instance fields
.field private mCityNameTv:Landroid/widget/TextView;

.field private mCityRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

.field private provinceBean:Lcom/lljjcoder/style/citythreelist/CityBean;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/lljjcoder/style/citythreelist/CityBean;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/lljjcoder/style/citythreelist/CityBean;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/lljjcoder/style/citythreelist/ProvinceActivity;->provinceBean:Lcom/lljjcoder/style/citythreelist/CityBean;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic access$000(Lcom/lljjcoder/style/citythreelist/ProvinceActivity;)Lcom/lljjcoder/style/citythreelist/CityBean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/style/citythreelist/ProvinceActivity;->provinceBean:Lcom/lljjcoder/style/citythreelist/CityBean;

    .line 2
    .line 3
    return-object p0
.end method

.method private initView()V
    .locals 4

    .line 1
    sget v0, Lcom/lljjcoder/style/citypickerview/R$id;->cityname_tv:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/widget/TextView;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/lljjcoder/style/citythreelist/ProvinceActivity;->mCityNameTv:Landroid/widget/TextView;

    .line 10
    .line 11
    const-string v1, "\u9009\u62e9\u7701\u4efd"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 14
    .line 15
    .line 16
    sget v0, Lcom/lljjcoder/style/citypickerview/R$id;->city_recyclerview:I

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 23
    .line 24
    iput-object v0, p0, Lcom/lljjcoder/style/citythreelist/ProvinceActivity;->mCityRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    .line 25
    .line 26
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 27
    .line 28
    invoke-direct {v1, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/lljjcoder/style/citythreelist/ProvinceActivity;->mCityRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    .line 35
    .line 36
    new-instance v1, Lcom/lljjcoder/widget/RecycleViewDividerForList;

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    const/4 v3, 0x1

    .line 40
    invoke-direct {v1, p0, v2, v3}, Lcom/lljjcoder/widget/RecycleViewDividerForList;-><init>(Landroid/content/Context;IZ)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method private setData()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/lljjcoder/style/citylist/utils/CityListLoader;->getInstance()Lcom/lljjcoder/style/citylist/utils/CityListLoader;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/lljjcoder/style/citylist/utils/CityListLoader;->getProListData()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance v1, Lcom/lljjcoder/style/citythreelist/CityAdapter;

    .line 13
    .line 14
    invoke-direct {v1, p0, v0}, Lcom/lljjcoder/style/citythreelist/CityAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 15
    .line 16
    .line 17
    iget-object v2, p0, Lcom/lljjcoder/style/citythreelist/ProvinceActivity;->mCityRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    .line 18
    .line 19
    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 20
    .line 21
    .line 22
    new-instance v2, Lcom/lljjcoder/style/citythreelist/ProvinceActivity$1;

    .line 23
    .line 24
    invoke-direct {v2, p0, v0}, Lcom/lljjcoder/style/citythreelist/ProvinceActivity$1;-><init>(Lcom/lljjcoder/style/citythreelist/ProvinceActivity;Ljava/util/List;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2}, Lcom/lljjcoder/style/citythreelist/CityAdapter;->setOnItemClickListener(Lcom/lljjcoder/style/citythreelist/CityAdapter$OnItemSelectedListener;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    const/16 p2, 0x3e9

    .line 5
    .line 6
    if-ne p1, p2, :cond_0

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
    const-string v0, "city"

    .line 19
    .line 20
    invoke-virtual {p3, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    check-cast p3, Lcom/lljjcoder/style/citythreelist/CityBean;

    .line 25
    .line 26
    new-instance v1, Landroid/content/Intent;

    .line 27
    .line 28
    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v2, "province"

    .line 32
    .line 33
    iget-object v3, p0, Lcom/lljjcoder/style/citythreelist/ProvinceActivity;->provinceBean:Lcom/lljjcoder/style/citythreelist/CityBean;

    .line 34
    .line 35
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 42
    .line 43
    .line 44
    const/4 p1, -0x1

    .line 45
    invoke-virtual {p0, p1, v1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 49
    .line 50
    .line 51
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

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
    invoke-direct {p0}, Lcom/lljjcoder/style/citythreelist/ProvinceActivity;->initView()V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, Lcom/lljjcoder/style/citythreelist/ProvinceActivity;->setData()V

    .line 13
    .line 14
    .line 15
    return-void
.end method
