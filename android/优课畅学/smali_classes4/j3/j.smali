.class public final synthetic Lj3/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/image/ImagePickFragment;

.field public final synthetic b:Lcom/google/common/util/concurrent/ListenableFuture;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/image/ImagePickFragment;Lcom/google/common/util/concurrent/ListenableFuture;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj3/j;->a:Lcom/zykj/image/ImagePickFragment;

    iput-object p2, p0, Lj3/j;->b:Lcom/google/common/util/concurrent/ListenableFuture;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lj3/j;->a:Lcom/zykj/image/ImagePickFragment;

    iget-object v1, p0, Lj3/j;->b:Lcom/google/common/util/concurrent/ListenableFuture;

    invoke-static {v0, v1}, Lcom/zykj/image/ImagePickFragment;->i(Lcom/zykj/image/ImagePickFragment;Lcom/google/common/util/concurrent/ListenableFuture;)V

    return-void
.end method
