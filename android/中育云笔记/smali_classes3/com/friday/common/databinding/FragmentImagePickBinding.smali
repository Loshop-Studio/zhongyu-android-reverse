.class public abstract Lcom/friday/common/databinding/FragmentImagePickBinding;
.super Landroidx/databinding/ViewDataBinding;
.source "SourceFile"


# instance fields
.field public final c:Landroid/widget/ImageView;

.field public final d:Landroid/widget/ImageView;

.field public final e:Landroid/widget/CheckBox;

.field public final f:Landroidx/cardview/widget/CardView;

.field public final g:Lcom/friday/common/camera/ZoomControlView;

.field public final h:Landroid/view/View;

.field public final i:Landroid/view/View;

.field public final j:Landroidx/camera/view/PreviewView;

.field public final k:Landroid/widget/TextView;

.field public final l:Landroid/view/View;

.field public final m:Landroid/view/View;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/CheckBox;Landroidx/cardview/widget/CardView;Lcom/friday/common/camera/ZoomControlView;Landroid/view/View;Landroid/view/View;Landroidx/camera/view/PreviewView;Landroid/widget/TextView;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lcom/friday/common/databinding/FragmentImagePickBinding;->c:Landroid/widget/ImageView;

    .line 5
    .line 6
    iput-object p5, p0, Lcom/friday/common/databinding/FragmentImagePickBinding;->d:Landroid/widget/ImageView;

    .line 7
    .line 8
    iput-object p6, p0, Lcom/friday/common/databinding/FragmentImagePickBinding;->e:Landroid/widget/CheckBox;

    .line 9
    .line 10
    iput-object p7, p0, Lcom/friday/common/databinding/FragmentImagePickBinding;->f:Landroidx/cardview/widget/CardView;

    .line 11
    .line 12
    iput-object p8, p0, Lcom/friday/common/databinding/FragmentImagePickBinding;->g:Lcom/friday/common/camera/ZoomControlView;

    .line 13
    .line 14
    iput-object p9, p0, Lcom/friday/common/databinding/FragmentImagePickBinding;->h:Landroid/view/View;

    .line 15
    .line 16
    iput-object p10, p0, Lcom/friday/common/databinding/FragmentImagePickBinding;->i:Landroid/view/View;

    .line 17
    .line 18
    iput-object p11, p0, Lcom/friday/common/databinding/FragmentImagePickBinding;->j:Landroidx/camera/view/PreviewView;

    .line 19
    .line 20
    iput-object p12, p0, Lcom/friday/common/databinding/FragmentImagePickBinding;->k:Landroid/widget/TextView;

    .line 21
    .line 22
    iput-object p13, p0, Lcom/friday/common/databinding/FragmentImagePickBinding;->l:Landroid/view/View;

    .line 23
    .line 24
    iput-object p14, p0, Lcom/friday/common/databinding/FragmentImagePickBinding;->m:Landroid/view/View;

    .line 25
    .line 26
    return-void
.end method

.method public static a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/friday/common/databinding/FragmentImagePickBinding;
    .locals 1

    .line 1
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, p1, p2, v0}, Lcom/friday/common/databinding/FragmentImagePickBinding;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lcom/friday/common/databinding/FragmentImagePickBinding;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lcom/friday/common/databinding/FragmentImagePickBinding;
    .locals 1

    .line 1
    sget v0, Lcom/friday/common/R$layout;->fragment_image_pick:I

    .line 2
    .line 3
    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/friday/common/databinding/FragmentImagePickBinding;

    .line 8
    .line 9
    return-object p0
.end method
