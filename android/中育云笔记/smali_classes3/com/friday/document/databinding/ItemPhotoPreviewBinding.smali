.class public abstract Lcom/friday/document/databinding/ItemPhotoPreviewBinding;
.super Landroidx/databinding/ViewDataBinding;
.source "SourceFile"


# instance fields
.field public final c:Lcom/luck/picture/lib/photoview/PhotoView;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILcom/luck/picture/lib/photoview/PhotoView;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lcom/friday/document/databinding/ItemPhotoPreviewBinding;->c:Lcom/luck/picture/lib/photoview/PhotoView;

    .line 5
    .line 6
    return-void
.end method

.method public static a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/friday/document/databinding/ItemPhotoPreviewBinding;
    .locals 1

    .line 1
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, p1, p2, v0}, Lcom/friday/document/databinding/ItemPhotoPreviewBinding;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lcom/friday/document/databinding/ItemPhotoPreviewBinding;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lcom/friday/document/databinding/ItemPhotoPreviewBinding;
    .locals 1

    .line 1
    sget v0, Lcom/friday/document/R$layout;->item_photo_preview:I

    .line 2
    .line 3
    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/friday/document/databinding/ItemPhotoPreviewBinding;

    .line 8
    .line 9
    return-object p0
.end method
