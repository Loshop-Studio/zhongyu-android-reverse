.class public Lcom/lljjcoder/style/citylist/CConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static sCityInfoBean:Lcom/lljjcoder/style/citylist/bean/CityInfoBean;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static getCitySelected()Lcom/lljjcoder/style/citylist/bean/CityInfoBean;
    .locals 1

    .line 1
    sget-object v0, Lcom/lljjcoder/style/citylist/CConfig;->sCityInfoBean:Lcom/lljjcoder/style/citylist/bean/CityInfoBean;

    .line 2
    .line 3
    return-object v0
.end method

.method public static setCity(Lcom/lljjcoder/style/citylist/bean/CityInfoBean;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/lljjcoder/style/citylist/CConfig;->sCityInfoBean:Lcom/lljjcoder/style/citylist/bean/CityInfoBean;

    .line 2
    .line 3
    return-void
.end method
