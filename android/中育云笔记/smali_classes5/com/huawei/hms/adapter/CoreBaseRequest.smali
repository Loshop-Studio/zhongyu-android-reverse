.class Lcom/huawei/hms/adapter/CoreBaseRequest;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/core/aidl/e;


# instance fields
.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Landroid/os/Parcelable;


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


# virtual methods
.method public getJsonHeader()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/huawei/hms/adapter/CoreBaseRequest;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getJsonObject()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/huawei/hms/adapter/CoreBaseRequest;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getParcelable()Landroid/os/Parcelable;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/huawei/hms/adapter/CoreBaseRequest;->e:Landroid/os/Parcelable;

    .line 2
    .line 3
    return-object v0
.end method

.method public setJsonHeader(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/huawei/hms/adapter/CoreBaseRequest;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setJsonObject(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/huawei/hms/adapter/CoreBaseRequest;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setParcelable(Landroid/os/Parcelable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/huawei/hms/adapter/CoreBaseRequest;->e:Landroid/os/Parcelable;

    .line 2
    .line 3
    return-void
.end method
