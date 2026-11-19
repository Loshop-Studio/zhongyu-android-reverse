.class public final synthetic Lb2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Lcom/friday/common/camera/ImageCropFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/common/camera/ImageCropFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb2/h;->c:Lcom/friday/common/camera/ImageCropFragment;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lb2/h;->c:Lcom/friday/common/camera/ImageCropFragment;

    invoke-static {v0}, Lcom/friday/common/camera/ImageCropFragment;->r(Lcom/friday/common/camera/ImageCropFragment;)V

    return-void
.end method
