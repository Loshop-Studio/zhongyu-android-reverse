.class public final synthetic Ltb/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Lcom/zykj/view/ui/camera/ImagePickFragment;

.field public final synthetic d:Lcom/google/common/util/concurrent/ListenableFuture;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/ui/camera/ImagePickFragment;Lcom/google/common/util/concurrent/ListenableFuture;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltb/a;->c:Lcom/zykj/view/ui/camera/ImagePickFragment;

    iput-object p2, p0, Ltb/a;->d:Lcom/google/common/util/concurrent/ListenableFuture;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Ltb/a;->c:Lcom/zykj/view/ui/camera/ImagePickFragment;

    iget-object v1, p0, Ltb/a;->d:Lcom/google/common/util/concurrent/ListenableFuture;

    invoke-static {v0, v1}, Lcom/zykj/view/ui/camera/ImagePickFragment;->s(Lcom/zykj/view/ui/camera/ImagePickFragment;Lcom/google/common/util/concurrent/ListenableFuture;)V

    return-void
.end method
