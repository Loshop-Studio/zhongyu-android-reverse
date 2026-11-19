.class public abstract Lcom/huawei/hms/support/api/entity/auth/AbstractResp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/core/aidl/e;


# instance fields
.field public c:I

.field public d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/huawei/hms/support/api/entity/auth/AbstractResp;->c:I

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public getErrorReason()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/huawei/hms/support/api/entity/auth/AbstractResp;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRtnCode()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/huawei/hms/support/api/entity/auth/AbstractResp;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public setErrorReason(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/huawei/hms/support/api/entity/auth/AbstractResp;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setRtnCode(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/huawei/hms/support/api/entity/auth/AbstractResp;->c:I

    .line 2
    .line 3
    return-void
.end method
