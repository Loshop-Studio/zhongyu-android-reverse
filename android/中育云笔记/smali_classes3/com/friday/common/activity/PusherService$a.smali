.class public final Lcom/friday/common/activity/PusherService$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/blankj/utilcode/util/NetworkUtils$OnNetworkStatusChangedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/common/activity/PusherService;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/friday/common/activity/PusherService;


# direct methods
.method public constructor <init>(Lcom/friday/common/activity/PusherService;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/common/activity/PusherService$a;->a:Lcom/friday/common/activity/PusherService;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onConnected(Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;)V
    .locals 1

    .line 1
    const-string p1, "\u7f51\u7edc\u6062\u590d\uff0c\u6295\u5c4f\u5c06\u6062\u590d\u670d\u52a1"

    .line 2
    .line 3
    invoke-static {p1}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/friday/common/activity/PusherService$a;->a:Lcom/friday/common/activity/PusherService;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-static {p1, v0}, Lcom/friday/common/activity/PusherService;->g(Lcom/friday/common/activity/PusherService;Z)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public onDisconnected()V
    .locals 2

    .line 1
    const-string v0, "\u7f51\u7edc\u4e22\u5931\uff0c\u6295\u5c4f\u5c06\u505c\u6b62\u670d\u52a1"

    .line 2
    .line 3
    invoke-static {v0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/friday/common/activity/PusherService$a;->a:Lcom/friday/common/activity/PusherService;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-static {v0, v1}, Lcom/friday/common/activity/PusherService;->g(Lcom/friday/common/activity/PusherService;Z)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
