.class public Lcom/lljjcoder/style/citylist/utils/CityListLoader;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final BUNDATA:Ljava/lang/String; = "bundata"

.field private static volatile instance:Lcom/lljjcoder/style/citylist/utils/CityListLoader;

.field private static mCityListData:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/lljjcoder/style/citylist/bean/CityInfoBean;",
            ">;"
        }
    .end annotation
.end field

.field private static mProListData:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/lljjcoder/style/citylist/bean/CityInfoBean;",
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
    sput-object v0, Lcom/lljjcoder/style/citylist/utils/CityListLoader;->mCityListData:Ljava/util/List;

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/lljjcoder/style/citylist/utils/CityListLoader;->mProListData:Ljava/util/List;

    .line 14
    .line 15
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static getInstance()Lcom/lljjcoder/style/citylist/utils/CityListLoader;
    .locals 2

    .line 1
    sget-object v0, Lcom/lljjcoder/style/citylist/utils/CityListLoader;->instance:Lcom/lljjcoder/style/citylist/utils/CityListLoader;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lcom/lljjcoder/style/citylist/utils/CityListLoader;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/lljjcoder/style/citylist/utils/CityListLoader;->instance:Lcom/lljjcoder/style/citylist/utils/CityListLoader;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lcom/lljjcoder/style/citylist/utils/CityListLoader;

    .line 13
    .line 14
    invoke-direct {v1}, Lcom/lljjcoder/style/citylist/utils/CityListLoader;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lcom/lljjcoder/style/citylist/utils/CityListLoader;->instance:Lcom/lljjcoder/style/citylist/utils/CityListLoader;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit v0

    .line 23
    goto :goto_2

    .line 24
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw v1

    .line 26
    :cond_1
    :goto_2
    sget-object v0, Lcom/lljjcoder/style/citylist/utils/CityListLoader;->instance:Lcom/lljjcoder/style/citylist/utils/CityListLoader;

    .line 27
    .line 28
    return-object v0
.end method


# virtual methods
.method public getCityListData()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/lljjcoder/style/citylist/bean/CityInfoBean;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/lljjcoder/style/citylist/utils/CityListLoader;->mCityListData:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getProListData()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/lljjcoder/style/citylist/bean/CityInfoBean;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/lljjcoder/style/citylist/utils/CityListLoader;->mProListData:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public loadCityData(Landroid/content/Context;)V
    .locals 6

    .line 1
    const-string v0, "china_city_data.json"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lcom/lljjcoder/utils/utils;->getJson(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance v0, Lcom/lljjcoder/style/citylist/utils/CityListLoader$1;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lcom/lljjcoder/style/citylist/utils/CityListLoader$1;-><init>(Lcom/lljjcoder/style/citylist/utils/CityListLoader;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, Lcom/google/gson/Gson;

    .line 17
    .line 18
    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p1, v0}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Ljava/util/ArrayList;

    .line 26
    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_0
    const/4 v0, 0x0

    .line 37
    move v1, v0

    .line 38
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-ge v1, v2, :cond_2

    .line 43
    .line 44
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Lcom/lljjcoder/style/citylist/bean/CityInfoBean;

    .line 49
    .line 50
    invoke-virtual {v2}, Lcom/lljjcoder/style/citylist/bean/CityInfoBean;->getCityList()Ljava/util/ArrayList;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    move v3, v0

    .line 55
    :goto_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-ge v3, v4, :cond_1

    .line 60
    .line 61
    sget-object v4, Lcom/lljjcoder/style/citylist/utils/CityListLoader;->mCityListData:Ljava/util/List;

    .line 62
    .line 63
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    add-int/lit8 v3, v3, 0x1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    :goto_2
    return-void
.end method

.method public loadProData(Landroid/content/Context;)V
    .locals 2

    .line 1
    const-string v0, "china_city_data.json"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lcom/lljjcoder/utils/utils;->getJson(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance v0, Lcom/lljjcoder/style/citylist/utils/CityListLoader$2;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lcom/lljjcoder/style/citylist/utils/CityListLoader$2;-><init>(Lcom/lljjcoder/style/citylist/utils/CityListLoader;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, Lcom/google/gson/Gson;

    .line 17
    .line 18
    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p1, v0}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Ljava/util/List;

    .line 26
    .line 27
    sput-object p1, Lcom/lljjcoder/style/citylist/utils/CityListLoader;->mProListData:Ljava/util/List;

    .line 28
    .line 29
    return-void
.end method
