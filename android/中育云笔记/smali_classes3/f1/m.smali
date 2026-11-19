.class public final synthetic Lf1/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/activity/result/ActivityResultCallback;


# instance fields
.field public final synthetic a:Lcom/canhub/cropper/c;


# direct methods
.method public synthetic constructor <init>(Lcom/canhub/cropper/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/m;->a:Lcom/canhub/cropper/c;

    return-void
.end method


# virtual methods
.method public final onActivityResult(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lf1/m;->a:Lcom/canhub/cropper/c;

    check-cast p1, Landroidx/activity/result/ActivityResult;

    invoke-static {v0, p1}, Lcom/canhub/cropper/c;->a(Lcom/canhub/cropper/c;Landroidx/activity/result/ActivityResult;)V

    return-void
.end method
