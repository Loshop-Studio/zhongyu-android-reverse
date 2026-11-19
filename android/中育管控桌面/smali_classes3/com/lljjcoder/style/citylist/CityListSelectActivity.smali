.class public Lcom/lljjcoder/style/citylist/CityListSelectActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# static fields
.field public static final CITY_SELECT_RESULT_FRAG:I = 0x32

.field public static sCityInfoBeanList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/lljjcoder/style/citylist/bean/CityInfoBean;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public adapter:Lcom/lljjcoder/style/citylist/sortlistview/SortAdapter;

.field private characterParser:Lcom/lljjcoder/style/citylist/sortlistview/CharacterParser;

.field private cityInfoBean:Lcom/lljjcoder/style/citylist/bean/CityInfoBean;

.field private cityListInfo:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/lljjcoder/style/citylist/bean/CityInfoBean;",
            ">;"
        }
    .end annotation
.end field

.field imgBack:Landroid/widget/ImageView;

.field mCityTextSearch:Lcom/lljjcoder/style/citylist/widget/CleanableEditView;

.field mCurrentCity:Landroid/widget/TextView;

.field mCurrentCityTag:Landroid/widget/TextView;

.field mDialog:Landroid/widget/TextView;

.field mLocalCity:Landroid/widget/TextView;

.field mLocalCityTag:Landroid/widget/TextView;

.field mSidrbar:Lcom/lljjcoder/style/citylist/sortlistview/SideBar;

.field private pinyinComparator:Lcom/lljjcoder/style/citylist/sortlistview/PinyinComparator;

.field sortListView:Landroid/widget/ListView;

.field private sourceDateList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/lljjcoder/style/citylist/sortlistview/SortModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->sCityInfoBeanList:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->cityListInfo:Ljava/util/List;

    .line 10
    .line 11
    new-instance v0, Lcom/lljjcoder/style/citylist/bean/CityInfoBean;

    .line 12
    .line 13
    invoke-direct {v0}, Lcom/lljjcoder/style/citylist/bean/CityInfoBean;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->cityInfoBean:Lcom/lljjcoder/style/citylist/bean/CityInfoBean;

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic access$000(Lcom/lljjcoder/style/citylist/CityListSelectActivity;)Lcom/lljjcoder/style/citylist/bean/CityInfoBean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->cityInfoBean:Lcom/lljjcoder/style/citylist/bean/CityInfoBean;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$002(Lcom/lljjcoder/style/citylist/CityListSelectActivity;Lcom/lljjcoder/style/citylist/bean/CityInfoBean;)Lcom/lljjcoder/style/citylist/bean/CityInfoBean;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->cityInfoBean:Lcom/lljjcoder/style/citylist/bean/CityInfoBean;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$100(Lcom/lljjcoder/style/citylist/CityListSelectActivity;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->cityListInfo:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$200(Lcom/lljjcoder/style/citylist/CityListSelectActivity;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->filterData(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private filledData(Ljava/util/List;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/lljjcoder/style/citylist/bean/CityInfoBean;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/lljjcoder/style/citylist/sortlistview/SortModel;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    move v2, v1

    .line 8
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    if-ge v2, v3, :cond_2

    .line 13
    .line 14
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    check-cast v3, Lcom/lljjcoder/style/citylist/bean/CityInfoBean;

    .line 19
    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    new-instance v4, Lcom/lljjcoder/style/citylist/sortlistview/SortModel;

    .line 23
    .line 24
    invoke-direct {v4}, Lcom/lljjcoder/style/citylist/sortlistview/SortModel;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3}, Lcom/lljjcoder/style/citylist/bean/CityInfoBean;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    if-nez v5, :cond_1

    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-lez v5, :cond_1

    .line 42
    .line 43
    const/4 v5, 0x1

    .line 44
    invoke-virtual {v3, v1, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    const-string v7, ""

    .line 49
    .line 50
    invoke-static {v6, v7}, Ln1/b;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    if-nez v7, :cond_1

    .line 63
    .line 64
    invoke-virtual {v4, v3}, Lcom/lljjcoder/style/citylist/sortlistview/SortModel;->setName(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v6, v1, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-virtual {v3}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    const-string v5, "[A-Z]"

    .line 76
    .line 77
    invoke-virtual {v3, v5}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    if-eqz v5, :cond_0

    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-virtual {v4, v3}, Lcom/lljjcoder/style/citylist/sortlistview/SortModel;->setSortLetters(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_0
    const-string v3, "#"

    .line 92
    .line 93
    invoke-virtual {v4, v3}, Lcom/lljjcoder/style/citylist/sortlistview/SortModel;->setSortLetters(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    :goto_1
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_2
    return-object v0
.end method

.method private filterData(Ljava/lang/String;)V
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->sourceDateList:Ljava/util/List;

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->sourceDateList:Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_3

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Lcom/lljjcoder/style/citylist/sortlistview/SortModel;

    .line 35
    .line 36
    invoke-virtual {v2}, Lcom/lljjcoder/style/citylist/sortlistview/SortModel;->getName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v3, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-nez v4, :cond_2

    .line 45
    .line 46
    iget-object v4, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->characterParser:Lcom/lljjcoder/style/citylist/sortlistview/CharacterParser;

    .line 47
    .line 48
    invoke-virtual {v4, v3}, Lcom/lljjcoder/style/citylist/sortlistview/CharacterParser;->getSelling(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v3, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-eqz v3, :cond_1

    .line 57
    .line 58
    :cond_2
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    :goto_1
    iget-object p1, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->pinyinComparator:Lcom/lljjcoder/style/citylist/sortlistview/PinyinComparator;

    .line 63
    .line 64
    invoke-static {v0, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->adapter:Lcom/lljjcoder/style/citylist/sortlistview/SortAdapter;

    .line 68
    .line 69
    invoke-virtual {p1, v0}, Lcom/lljjcoder/style/citylist/sortlistview/SortAdapter;->updateListView(Ljava/util/List;)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method private initList()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->sourceDateList:Ljava/util/List;

    .line 7
    .line 8
    new-instance v0, Lcom/lljjcoder/style/citylist/sortlistview/SortAdapter;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->sourceDateList:Ljava/util/List;

    .line 11
    .line 12
    invoke-direct {v0, p0, v1}, Lcom/lljjcoder/style/citylist/sortlistview/SortAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->adapter:Lcom/lljjcoder/style/citylist/sortlistview/SortAdapter;

    .line 16
    .line 17
    iget-object v1, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->sortListView:Landroid/widget/ListView;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 20
    .line 21
    .line 22
    invoke-static {}, Lcom/lljjcoder/style/citylist/sortlistview/CharacterParser;->getInstance()Lcom/lljjcoder/style/citylist/sortlistview/CharacterParser;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->characterParser:Lcom/lljjcoder/style/citylist/sortlistview/CharacterParser;

    .line 27
    .line 28
    new-instance v0, Lcom/lljjcoder/style/citylist/sortlistview/PinyinComparator;

    .line 29
    .line 30
    invoke-direct {v0}, Lcom/lljjcoder/style/citylist/sortlistview/PinyinComparator;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->pinyinComparator:Lcom/lljjcoder/style/citylist/sortlistview/PinyinComparator;

    .line 34
    .line 35
    iget-object v0, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->mSidrbar:Lcom/lljjcoder/style/citylist/sortlistview/SideBar;

    .line 36
    .line 37
    iget-object v1, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->mDialog:Landroid/widget/TextView;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lcom/lljjcoder/style/citylist/sortlistview/SideBar;->setTextView(Landroid/widget/TextView;)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->mSidrbar:Lcom/lljjcoder/style/citylist/sortlistview/SideBar;

    .line 43
    .line 44
    new-instance v1, Lcom/lljjcoder/style/citylist/CityListSelectActivity$2;

    .line 45
    .line 46
    invoke-direct {v1, p0}, Lcom/lljjcoder/style/citylist/CityListSelectActivity$2;-><init>(Lcom/lljjcoder/style/citylist/CityListSelectActivity;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Lcom/lljjcoder/style/citylist/sortlistview/SideBar;->setOnTouchingLetterChangedListener(Lcom/lljjcoder/style/citylist/sortlistview/SideBar$OnTouchingLetterChangedListener;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->sortListView:Landroid/widget/ListView;

    .line 53
    .line 54
    new-instance v1, Lcom/lljjcoder/style/citylist/CityListSelectActivity$3;

    .line 55
    .line 56
    invoke-direct {v1, p0}, Lcom/lljjcoder/style/citylist/CityListSelectActivity$3;-><init>(Lcom/lljjcoder/style/citylist/CityListSelectActivity;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->mCityTextSearch:Lcom/lljjcoder/style/citylist/widget/CleanableEditView;

    .line 63
    .line 64
    new-instance v1, Lcom/lljjcoder/style/citylist/CityListSelectActivity$4;

    .line 65
    .line 66
    invoke-direct {v1, p0}, Lcom/lljjcoder/style/citylist/CityListSelectActivity$4;-><init>(Lcom/lljjcoder/style/citylist/CityListSelectActivity;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method private initView()V
    .locals 2

    .line 1
    sget v0, Lcom/lljjcoder/style/citypickerview/R$id;->cityInputText:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/lljjcoder/style/citylist/widget/CleanableEditView;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->mCityTextSearch:Lcom/lljjcoder/style/citylist/widget/CleanableEditView;

    .line 10
    .line 11
    sget v0, Lcom/lljjcoder/style/citypickerview/R$id;->currentCityTag:I

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
    iput-object v0, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->mCurrentCityTag:Landroid/widget/TextView;

    .line 20
    .line 21
    sget v0, Lcom/lljjcoder/style/citypickerview/R$id;->currentCity:I

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Landroid/widget/TextView;

    .line 28
    .line 29
    iput-object v0, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->mCurrentCity:Landroid/widget/TextView;

    .line 30
    .line 31
    sget v0, Lcom/lljjcoder/style/citypickerview/R$id;->localCityTag:I

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Landroid/widget/TextView;

    .line 38
    .line 39
    iput-object v0, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->mLocalCityTag:Landroid/widget/TextView;

    .line 40
    .line 41
    sget v0, Lcom/lljjcoder/style/citypickerview/R$id;->localCity:I

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Landroid/widget/TextView;

    .line 48
    .line 49
    iput-object v0, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->mLocalCity:Landroid/widget/TextView;

    .line 50
    .line 51
    sget v0, Lcom/lljjcoder/style/citypickerview/R$id;->country_lvcountry:I

    .line 52
    .line 53
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Landroid/widget/ListView;

    .line 58
    .line 59
    iput-object v0, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->sortListView:Landroid/widget/ListView;

    .line 60
    .line 61
    sget v0, Lcom/lljjcoder/style/citypickerview/R$id;->dialog:I

    .line 62
    .line 63
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    check-cast v0, Landroid/widget/TextView;

    .line 68
    .line 69
    iput-object v0, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->mDialog:Landroid/widget/TextView;

    .line 70
    .line 71
    sget v0, Lcom/lljjcoder/style/citypickerview/R$id;->sidrbar:I

    .line 72
    .line 73
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    check-cast v0, Lcom/lljjcoder/style/citylist/sortlistview/SideBar;

    .line 78
    .line 79
    iput-object v0, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->mSidrbar:Lcom/lljjcoder/style/citylist/sortlistview/SideBar;

    .line 80
    .line 81
    sget v0, Lcom/lljjcoder/style/citypickerview/R$id;->imgBack:I

    .line 82
    .line 83
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast v0, Landroid/widget/ImageView;

    .line 88
    .line 89
    iput-object v0, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->imgBack:Landroid/widget/ImageView;

    .line 90
    .line 91
    new-instance v1, Lcom/lljjcoder/style/citylist/CityListSelectActivity$1;

    .line 92
    .line 93
    invoke-direct {v1, p0}, Lcom/lljjcoder/style/citylist/CityListSelectActivity$1;-><init>(Lcom/lljjcoder/style/citylist/CityListSelectActivity;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method private setCityData(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/lljjcoder/style/citylist/bean/CityInfoBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->cityListInfo:Ljava/util/List;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    new-array v1, v0, [Ljava/lang/String;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_0
    if-ge v2, v0, :cond_1

    .line 14
    .line 15
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Lcom/lljjcoder/style/citylist/bean/CityInfoBean;

    .line 20
    .line 21
    invoke-virtual {v3}, Lcom/lljjcoder/style/citylist/bean/CityInfoBean;->getName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    aput-object v3, v1, v2

    .line 26
    .line 27
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget-object v0, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->sourceDateList:Ljava/util/List;

    .line 31
    .line 32
    invoke-direct {p0, p1}, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->filledData(Ljava/util/List;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->sourceDateList:Ljava/util/List;

    .line 40
    .line 41
    iget-object v0, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->pinyinComparator:Lcom/lljjcoder/style/citylist/sortlistview/PinyinComparator;

    .line 42
    .line 43
    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->adapter:Lcom/lljjcoder/style/citylist/sortlistview/SortAdapter;

    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 49
    .line 50
    .line 51
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    # RE layout layout/activity_city_list_select (0x7f0c001c), APK res/u4.xml
    sget p1, Lcom/lljjcoder/style/citypickerview/R$layout;->activity_city_list_select:I

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setContentView(I)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->initView()V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->initList()V

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lcom/lljjcoder/style/citylist/utils/CityListLoader;->getInstance()Lcom/lljjcoder/style/citylist/utils/CityListLoader;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Lcom/lljjcoder/style/citylist/utils/CityListLoader;->getCityListData()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-direct {p0, p1}, Lcom/lljjcoder/style/citylist/CityListSelectActivity;->setCityData(Ljava/util/List;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
