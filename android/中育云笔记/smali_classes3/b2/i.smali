.class public final synthetic Lb2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic c:Lcom/friday/common/camera/ImageCropFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/common/camera/ImageCropFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb2/i;->c:Lcom/friday/common/camera/ImageCropFragment;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb2/i;->c:Lcom/friday/common/camera/ImageCropFragment;

    invoke-static {v0, p1}, Lcom/friday/common/camera/ImageCropFragment;->u(Lcom/friday/common/camera/ImageCropFragment;Landroid/view/View;)V

    return-void
.end method
