.class public final synthetic Lk1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/canhub/cropper/CropImageActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/canhub/cropper/CropImageActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/d;->a:Lcom/canhub/cropper/CropImageActivity;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lk1/d;->a:Lcom/canhub/cropper/CropImageActivity;

    check-cast p1, Landroidx/activity/OnBackPressedCallback;

    invoke-static {v0, p1}, Lcom/canhub/cropper/CropImageActivity;->p(Lcom/canhub/cropper/CropImageActivity;Landroidx/activity/OnBackPressedCallback;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
