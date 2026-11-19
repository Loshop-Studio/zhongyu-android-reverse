.class public Lcom/alibaba/sdk/android/sender/SdkInfo;
.super Ljava/lang/Object;


# instance fields
.field a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/alibaba/sdk/android/sender/SdkInfo;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/alibaba/sdk/android/sender/SdkInfo;->c:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/alibaba/sdk/android/sender/SdkInfo;->d:Ljava/lang/String;

    return-object v0
.end method

.method public setAppKey(Ljava/lang/String;)Lcom/alibaba/sdk/android/sender/SdkInfo;
    .locals 0

    iput-object p1, p0, Lcom/alibaba/sdk/android/sender/SdkInfo;->d:Ljava/lang/String;

    return-object p0
.end method

.method public setExt(Ljava/util/Map;)Lcom/alibaba/sdk/android/sender/SdkInfo;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/alibaba/sdk/android/sender/SdkInfo;"
        }
    .end annotation

    iput-object p1, p0, Lcom/alibaba/sdk/android/sender/SdkInfo;->a:Ljava/util/Map;

    return-object p0
.end method

.method public setSdkId(Ljava/lang/String;)Lcom/alibaba/sdk/android/sender/SdkInfo;
    .locals 0

    iput-object p1, p0, Lcom/alibaba/sdk/android/sender/SdkInfo;->b:Ljava/lang/String;

    return-object p0
.end method

.method public setSdkVersion(Ljava/lang/String;)Lcom/alibaba/sdk/android/sender/SdkInfo;
    .locals 0

    iput-object p1, p0, Lcom/alibaba/sdk/android/sender/SdkInfo;->c:Ljava/lang/String;

    return-object p0
.end method
