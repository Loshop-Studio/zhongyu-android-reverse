.class public abstract Lcom/huawei/hms/core/aidl/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/core/aidl/e;


# instance fields
.field public c:Lcom/huawei/hms/support/api/client/Status;


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
.method public getCommonStatus()Lcom/huawei/hms/support/api/client/Status;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/huawei/hms/core/aidl/a;->c:Lcom/huawei/hms/support/api/client/Status;

    .line 2
    .line 3
    return-object v0
.end method

.method public setCommonStatus(Lcom/huawei/hms/support/api/client/Status;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/huawei/hms/core/aidl/a;->c:Lcom/huawei/hms/support/api/client/Status;

    .line 2
    .line 3
    return-void
.end method
