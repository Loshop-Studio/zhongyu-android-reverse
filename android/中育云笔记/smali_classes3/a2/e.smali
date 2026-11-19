.class public final synthetic La2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Lcom/friday/common/activity/PusherService;

.field public final synthetic d:Landroid/media/ImageReader;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/common/activity/PusherService;Landroid/media/ImageReader;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La2/e;->c:Lcom/friday/common/activity/PusherService;

    iput-object p2, p0, La2/e;->d:Landroid/media/ImageReader;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, La2/e;->c:Lcom/friday/common/activity/PusherService;

    iget-object v1, p0, La2/e;->d:Landroid/media/ImageReader;

    invoke-static {v0, v1}, Lcom/friday/common/activity/PusherService;->e(Lcom/friday/common/activity/PusherService;Landroid/media/ImageReader;)V

    return-void
.end method
