.class public final synthetic Lb2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Lcom/friday/common/camera/ImagePickFragment;

.field public final synthetic d:Lcom/google/common/util/concurrent/ListenableFuture;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/common/camera/ImagePickFragment;Lcom/google/common/util/concurrent/ListenableFuture;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb2/l;->c:Lcom/friday/common/camera/ImagePickFragment;

    iput-object p2, p0, Lb2/l;->d:Lcom/google/common/util/concurrent/ListenableFuture;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lb2/l;->c:Lcom/friday/common/camera/ImagePickFragment;

    iget-object v1, p0, Lb2/l;->d:Lcom/google/common/util/concurrent/ListenableFuture;

    invoke-static {v0, v1}, Lcom/friday/common/camera/ImagePickFragment;->p(Lcom/friday/common/camera/ImagePickFragment;Lcom/google/common/util/concurrent/ListenableFuture;)V

    return-void
.end method
