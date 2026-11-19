.class public Lm5/a;
.super Lcom/huawei/hms/framework/common/hianalytics/HianalyticsBaseData;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/huawei/hms/framework/common/hianalytics/HianalyticsBaseData;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "sdk_version"

    .line 5
    .line 6
    const-string v1, "8.0.1.304"

    .line 7
    .line 8
    invoke-virtual {p0, v0, v1}, Lcom/huawei/hms/framework/common/hianalytics/HianalyticsBaseData;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/hms/framework/common/hianalytics/HianalyticsBaseData;

    .line 9
    .line 10
    .line 11
    return-void
.end method
