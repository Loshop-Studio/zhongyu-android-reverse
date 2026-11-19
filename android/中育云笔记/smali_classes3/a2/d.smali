.class public final synthetic La2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/ImageReader$OnImageAvailableListener;


# instance fields
.field public final synthetic a:Lcom/friday/common/activity/PusherService;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/common/activity/PusherService;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La2/d;->a:Lcom/friday/common/activity/PusherService;

    return-void
.end method


# virtual methods
.method public final onImageAvailable(Landroid/media/ImageReader;)V
    .locals 1

    .line 1
    iget-object v0, p0, La2/d;->a:Lcom/friday/common/activity/PusherService;

    invoke-static {v0, p1}, Lcom/friday/common/activity/PusherService;->b(Lcom/friday/common/activity/PusherService;Landroid/media/ImageReader;)V

    return-void
.end method
