.class public final Lcom/dylanc/longan/WifiListLiveData;
.super Landroidx/lifecycle/LiveData;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/lifecycle/LiveData<",
        "Ljava/util/List<",
        "+",
        "Landroid/net/wifi/ScanResult;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0008\u0005*\u0001\u000f\u0018\u00002\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001B\t\u0008\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\u0008\u0007\u0010\u0005J\u000f\u0010\u0008\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\u0008\u0008\u0010\u0005R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/dylanc/longan/WifiListLiveData;",
        "Landroidx/lifecycle/LiveData;",
        "",
        "Landroid/net/wifi/ScanResult;",
        "<init>",
        "()V",
        "",
        "onActive",
        "onInactive",
        "Landroid/net/wifi/WifiManager;",
        "a",
        "Lkotlin/Lazy;",
        "c",
        "()Landroid/net/wifi/WifiManager;",
        "wifiManager",
        "com/dylanc/longan/WifiListLiveData$a",
        "b",
        "Lcom/dylanc/longan/WifiListLiveData$a;",
        "wifiScanReceiver",
        "longan"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Lkotlin/Lazy;

.field public final b:Lcom/dylanc/longan/WifiListLiveData$a;


# direct methods
.method public constructor <init>()V
    .locals 2
    .annotation build Landroidx/annotation/RequiresPermission;
        allOf = {
            "android.permission.ACCESS_WIFI_STATE",
            "android.permission.CHANGE_WIFI_STATE"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/LiveData;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 5
    .line 6
    sget-object v1, Lcom/dylanc/longan/WifiListLiveData$wifiManager$2;->a:Lcom/dylanc/longan/WifiListLiveData$wifiManager$2;

    .line 7
    .line 8
    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lcom/dylanc/longan/WifiListLiveData;->a:Lkotlin/Lazy;

    .line 13
    .line 14
    new-instance v0, Lcom/dylanc/longan/WifiListLiveData$a;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lcom/dylanc/longan/WifiListLiveData$a;-><init>(Lcom/dylanc/longan/WifiListLiveData;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/dylanc/longan/WifiListLiveData;->b:Lcom/dylanc/longan/WifiListLiveData$a;

    .line 20
    .line 21
    return-void
.end method

.method public static final synthetic a(Lcom/dylanc/longan/WifiListLiveData;)Landroid/net/wifi/WifiManager;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/dylanc/longan/WifiListLiveData;->c()Landroid/net/wifi/WifiManager;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic b(Lcom/dylanc/longan/WifiListLiveData;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/lifecycle/LiveData;->setValue(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final c()Landroid/net/wifi/WifiManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/dylanc/longan/WifiListLiveData;->a:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/net/wifi/WifiManager;

    .line 8
    .line 9
    return-object v0
.end method

.method public onActive()V
    .locals 4

    .line 1
    invoke-static {}, Lf1/a;->a()Landroid/app/Application;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/dylanc/longan/WifiListLiveData;->b:Lcom/dylanc/longan/WifiListLiveData$a;

    .line 6
    .line 7
    new-instance v2, Landroid/content/IntentFilter;

    .line 8
    .line 9
    const-string v3, "android.net.wifi.SCAN_RESULTS"

    .line 10
    .line 11
    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public onInactive()V
    .locals 2

    .line 1
    invoke-static {}, Lf1/a;->a()Landroid/app/Application;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/dylanc/longan/WifiListLiveData;->b:Lcom/dylanc/longan/WifiListLiveData$a;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
