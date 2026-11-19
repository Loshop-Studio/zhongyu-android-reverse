.class public final synthetic Lj3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/Observer;


# instance fields
.field public final synthetic a:Lcom/zykj/image/ImageCropFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/image/ImageCropFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj3/c;->a:Lcom/zykj/image/ImageCropFragment;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lj3/c;->a:Lcom/zykj/image/ImageCropFragment;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/zykj/image/ImageCropFragment;->h(Lcom/zykj/image/ImageCropFragment;Ljava/lang/String;)V

    return-void
.end method
