.class public final Lcom/friday/cloudsnote/App$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/alibaba/sdk/android/push/CommonCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/cloudsnote/App;->initCloudChannel(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


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
.method public onFailed(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "errorCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "errorMessage"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/String;)V
    .locals 0

    .line 1
    sget-object p1, Lcom/friday/common/helper/a;->a:Lcom/friday/common/helper/a;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/friday/common/helper/a;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
