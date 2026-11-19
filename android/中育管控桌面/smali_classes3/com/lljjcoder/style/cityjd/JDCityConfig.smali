.class public Lcom/lljjcoder/style/cityjd/JDCityConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lljjcoder/style/cityjd/JDCityConfig$Builder;,
        Lcom/lljjcoder/style/cityjd/JDCityConfig$ShowType;
    }
.end annotation


# instance fields
.field private showType:Lcom/lljjcoder/style/cityjd/JDCityConfig$ShowType;


# direct methods
.method public constructor <init>(Lcom/lljjcoder/style/cityjd/JDCityConfig$Builder;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/lljjcoder/style/cityjd/JDCityConfig$ShowType;->PRO_CITY_DIS:Lcom/lljjcoder/style/cityjd/JDCityConfig$ShowType;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityConfig;->showType:Lcom/lljjcoder/style/cityjd/JDCityConfig$ShowType;

    .line 7
    .line 8
    iget-object p1, p1, Lcom/lljjcoder/style/cityjd/JDCityConfig$Builder;->showType:Lcom/lljjcoder/style/cityjd/JDCityConfig$ShowType;

    .line 9
    .line 10
    iput-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityConfig;->showType:Lcom/lljjcoder/style/cityjd/JDCityConfig$ShowType;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public getShowType()Lcom/lljjcoder/style/cityjd/JDCityConfig$ShowType;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityConfig;->showType:Lcom/lljjcoder/style/cityjd/JDCityConfig$ShowType;

    .line 2
    .line 3
    return-object v0
.end method

.method public setShowType(Lcom/lljjcoder/style/cityjd/JDCityConfig$ShowType;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityConfig;->showType:Lcom/lljjcoder/style/cityjd/JDCityConfig$ShowType;

    .line 2
    .line 3
    return-void
.end method
