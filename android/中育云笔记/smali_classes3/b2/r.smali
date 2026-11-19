.class public final synthetic Lb2/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic c:Lcom/friday/common/camera/ImagePickFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/common/camera/ImagePickFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb2/r;->c:Lcom/friday/common/camera/ImagePickFragment;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb2/r;->c:Lcom/friday/common/camera/ImagePickFragment;

    invoke-static {v0, p1}, Lcom/friday/common/camera/ImagePickFragment;->t(Lcom/friday/common/camera/ImagePickFragment;Landroid/view/View;)V

    return-void
.end method
