.class public final Lcom/friday/document/adapter/ImagePagerAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/document/adapter/ImagePagerAdapter$ImageViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/friday/document/adapter/ImagePagerAdapter$ImageViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ljava/util/List;

.field public b:Lhd/a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lhd/a;)V
    .locals 1

    .line 1
    const-string v0, "images"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onControlsVisibleClick"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/friday/document/adapter/ImagePagerAdapter;->a:Ljava/util/List;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/friday/document/adapter/ImagePagerAdapter;->b:Lhd/a;

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic a(Lcom/friday/document/adapter/ImagePagerAdapter;Landroid/view/View;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/adapter/ImagePagerAdapter;->c(Lcom/friday/document/adapter/ImagePagerAdapter;Landroid/view/View;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcom/friday/document/adapter/ImagePagerAdapter;Landroid/view/View;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/friday/document/adapter/ImagePagerAdapter;->b:Lhd/a;

    .line 7
    .line 8
    invoke-interface {p0}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 12
    .line 13
    return-object p0
.end method


# virtual methods
.method public b(Lcom/friday/document/adapter/ImagePagerAdapter$ImageViewHolder;I)V
    .locals 2

    .line 1
    const-string v0, "holder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/friday/document/adapter/ImagePagerAdapter;->a:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    check-cast p2, Lcom/friday/document/model/ShareFile;

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/friday/document/adapter/ImagePagerAdapter$ImageViewHolder;->a()Lcom/friday/document/databinding/ItemPhotoPreviewBinding;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v0, v0, Lcom/friday/document/databinding/ItemPhotoPreviewBinding;->c:Lcom/luck/picture/lib/photoview/PhotoView;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, Lcom/bumptech/glide/b;->t(Landroid/content/Context;)Lcom/bumptech/glide/h;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p2}, Lcom/friday/document/model/ShareFile;->getFileUrl()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    invoke-virtual {v0, p2}, Lcom/bumptech/glide/h;->t(Ljava/lang/String;)Lcom/bumptech/glide/g;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    new-instance v0, Lz0/d;

    .line 37
    .line 38
    invoke-direct {v0}, Lz0/d;-><init>()V

    .line 39
    .line 40
    .line 41
    sget v1, Lcom/friday/document/R$drawable;->placeholder:I

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Lz0/a;->W(I)Lz0/a;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Lz0/d;

    .line 48
    .line 49
    sget v1, Lcom/friday/document/R$drawable;->errorholder:I

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Lz0/a;->j(I)Lz0/a;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {p2, v0}, Lcom/bumptech/glide/g;->p0(Lz0/a;)Lcom/bumptech/glide/g;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-virtual {p1}, Lcom/friday/document/adapter/ImagePagerAdapter$ImageViewHolder;->a()Lcom/friday/document/databinding/ItemPhotoPreviewBinding;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iget-object v0, v0, Lcom/friday/document/databinding/ItemPhotoPreviewBinding;->c:Lcom/luck/picture/lib/photoview/PhotoView;

    .line 64
    .line 65
    invoke-virtual {p2, v0}, Lcom/bumptech/glide/g;->A0(Landroid/widget/ImageView;)La1/i;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Lcom/friday/document/adapter/ImagePagerAdapter$ImageViewHolder;->a()Lcom/friday/document/databinding/ItemPhotoPreviewBinding;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iget-object p1, p1, Lcom/friday/document/databinding/ItemPhotoPreviewBinding;->c:Lcom/luck/picture/lib/photoview/PhotoView;

    .line 73
    .line 74
    const-string p2, "ivPhoto"

    .line 75
    .line 76
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    new-instance p2, Lo2/f;

    .line 80
    .line 81
    invoke-direct {p2, p0}, Lo2/f;-><init>(Lcom/friday/document/adapter/ImagePagerAdapter;)V

    .line 82
    .line 83
    .line 84
    invoke-static {p1, p2}, Lgb/b;->e(Landroid/view/View;Lhd/l;)V

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method public d(Landroid/view/ViewGroup;I)Lcom/friday/document/adapter/ImagePagerAdapter$ImageViewHolder;
    .locals 1

    .line 1
    const-string p2, "parent"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-static {p2, p1, v0}, Lcom/friday/document/databinding/ItemPhotoPreviewBinding;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/friday/document/databinding/ItemPhotoPreviewBinding;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string p2, "inflate(...)"

    .line 20
    .line 21
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    new-instance p2, Lcom/friday/document/adapter/ImagePagerAdapter$ImageViewHolder;

    .line 25
    .line 26
    invoke-direct {p2, p0, p1}, Lcom/friday/document/adapter/ImagePagerAdapter$ImageViewHolder;-><init>(Lcom/friday/document/adapter/ImagePagerAdapter;Lcom/friday/document/databinding/ItemPhotoPreviewBinding;)V

    .line 27
    .line 28
    .line 29
    return-object p2
.end method

.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/adapter/ImagePagerAdapter;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/friday/document/adapter/ImagePagerAdapter$ImageViewHolder;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/adapter/ImagePagerAdapter;->b(Lcom/friday/document/adapter/ImagePagerAdapter$ImageViewHolder;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/adapter/ImagePagerAdapter;->d(Landroid/view/ViewGroup;I)Lcom/friday/document/adapter/ImagePagerAdapter$ImageViewHolder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
