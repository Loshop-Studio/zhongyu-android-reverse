.class public Lcom/huawei/hms/support/api/entity/opendevice/OdidResp;
.super Lcom/huawei/hms/core/aidl/a;
.source "SourceFile"


# instance fields
.field public d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/huawei/hms/core/aidl/a;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/huawei/hms/support/api/entity/opendevice/OdidResp;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/huawei/hms/support/api/entity/opendevice/OdidResp;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method
