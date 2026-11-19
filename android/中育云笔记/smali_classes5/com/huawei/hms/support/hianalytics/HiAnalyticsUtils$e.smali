.class public Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtils$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtils;->l(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Landroid/content/Context;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/util/Map;

.field public final synthetic f:Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtils;


# direct methods
.method public constructor <init>(Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtils;Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtils$e;->f:Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtils;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtils$e;->c:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtils$e;->d:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtils$e;->e:Ljava/util/Map;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtils;->getInstance()Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtils;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtils$e;->c:Landroid/content/Context;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtils$e;->d:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v3, p0, Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtils$e;->e:Ljava/util/Map;

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/hms/support/hianalytics/HiAnalyticsUtils;->onReport(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
