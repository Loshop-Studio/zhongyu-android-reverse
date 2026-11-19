.class public final synthetic Lj3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public final synthetic a:Lcom/zykj/image/ImageCropFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/image/ImageCropFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj3/a;->a:Lcom/zykj/image/ImageCropFragment;

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lj3/a;->a:Lcom/zykj/image/ImageCropFragment;

    invoke-static {v0, p1}, Lcom/zykj/image/ImageCropFragment;->g(Lcom/zykj/image/ImageCropFragment;Landroid/content/DialogInterface;)V

    return-void
.end method
