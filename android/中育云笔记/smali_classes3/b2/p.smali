.class public final synthetic Lb2/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/activity/result/ActivityResultCallback;


# instance fields
.field public final synthetic a:Lcom/friday/common/camera/ImagePickFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/common/camera/ImagePickFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb2/p;->a:Lcom/friday/common/camera/ImagePickFragment;

    return-void
.end method


# virtual methods
.method public final onActivityResult(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb2/p;->a:Lcom/friday/common/camera/ImagePickFragment;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, p1}, Lcom/friday/common/camera/ImagePickFragment;->s(Lcom/friday/common/camera/ImagePickFragment;Z)V

    return-void
.end method
