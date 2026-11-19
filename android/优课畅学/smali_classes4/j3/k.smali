.class public final synthetic Lj3/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/activity/result/ActivityResultCallback;


# instance fields
.field public final synthetic a:Lcom/zykj/image/ImagePickFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/image/ImagePickFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj3/k;->a:Lcom/zykj/image/ImagePickFragment;

    return-void
.end method


# virtual methods
.method public final onActivityResult(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lj3/k;->a:Lcom/zykj/image/ImagePickFragment;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, p1}, Lcom/zykj/image/ImagePickFragment;->j(Lcom/zykj/image/ImagePickFragment;Z)V

    return-void
.end method
