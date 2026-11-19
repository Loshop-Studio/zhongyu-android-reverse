.class public abstract Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;
.super Landroidx/databinding/ViewDataBinding;
.source "SourceFile"


# instance fields
.field public final a:Landroid/widget/ImageView;

.field public final b:Landroid/widget/ImageView;

.field public final c:Landroid/widget/CheckBox;

.field public final d:Landroid/view/View;

.field public final e:Landroid/view/View;

.field public final f:Landroidx/camera/view/PreviewView;

.field public final g:Landroid/view/View;

.field public final h:Landroid/view/View;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/CheckBox;Landroid/view/View;Landroid/view/View;Landroidx/camera/view/PreviewView;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;->a:Landroid/widget/ImageView;

    .line 5
    .line 6
    iput-object p5, p0, Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;->b:Landroid/widget/ImageView;

    .line 7
    .line 8
    iput-object p6, p0, Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;->c:Landroid/widget/CheckBox;

    .line 9
    .line 10
    iput-object p7, p0, Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;->d:Landroid/view/View;

    .line 11
    .line 12
    iput-object p8, p0, Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;->e:Landroid/view/View;

    .line 13
    .line 14
    iput-object p9, p0, Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;->f:Landroidx/camera/view/PreviewView;

    .line 15
    .line 16
    iput-object p10, p0, Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;->g:Landroid/view/View;

    .line 17
    .line 18
    iput-object p11, p0, Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;->h:Landroid/view/View;

    .line 19
    .line 20
    return-void
.end method

.method public static a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;
    .locals 1

    .line 1
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, p1, p2, v0}, Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;->j(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static j(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;
    .locals 1

    .line 1
    sget v0, Lcom/zykj/view/R$layout;->view_fragment_image_pick:I

    .line 2
    .line 3
    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/zykj/view/databinding/ViewFragmentImagePickBinding;

    .line 8
    .line 9
    return-object p0
.end method
