.class public final synthetic La2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Lcom/friday/common/activity/PusherService;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/common/activity/PusherService;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La2/a;->c:Lcom/friday/common/activity/PusherService;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, La2/a;->c:Lcom/friday/common/activity/PusherService;

    invoke-static {v0}, Lcom/friday/common/activity/PusherService;->f(Lcom/friday/common/activity/PusherService;)Landroid/media/projection/MediaProjectionManager;

    move-result-object v0

    return-object v0
.end method
