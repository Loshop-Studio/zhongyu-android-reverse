.class public Lcom/luck/picture/lib/PictureSelectorPreviewFragment$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->O1(Landroid/view/ViewGroup;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroidx/recyclerview/widget/ItemTouchHelper;

.field public final synthetic b:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;


# direct methods
.method public constructor <init>(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;Landroidx/recyclerview/widget/ItemTouchHelper;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$d;->b:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$d;->a:Landroidx/recyclerview/widget/ItemTouchHelper;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILandroid/view/View;)V
    .locals 2

    .line 1
    iget-object p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$d;->b:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 2
    .line 3
    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const-string p3, "vibrator"

    .line 8
    .line 9
    invoke-virtual {p2, p3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    check-cast p2, Landroid/os/Vibrator;

    .line 14
    .line 15
    const-wide/16 v0, 0x32

    .line 16
    .line 17
    invoke-virtual {p2, v0, v1}, Landroid/os/Vibrator;->vibrate(J)V

    .line 18
    .line 19
    .line 20
    iget-object p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$d;->b:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 21
    .line 22
    iget-object p2, p2, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->M:Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;

    .line 23
    .line 24
    invoke-virtual {p2}, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->getItemCount()I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    iget-object p3, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$d;->b:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 29
    .line 30
    invoke-static {p3}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->Z0(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 31
    .line 32
    .line 33
    move-result-object p3

    .line 34
    iget p3, p3, Lcom/luck/picture/lib/config/PictureSelectionConfig;->m:I

    .line 35
    .line 36
    if-eq p2, p3, :cond_0

    .line 37
    .line 38
    iget-object p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$d;->a:Landroidx/recyclerview/widget/ItemTouchHelper;

    .line 39
    .line 40
    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/ItemTouchHelper;->startDrag(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    iget-object p3, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$d;->b:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 49
    .line 50
    iget-object p3, p3, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->M:Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;

    .line 51
    .line 52
    invoke-virtual {p3}, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->getItemCount()I

    .line 53
    .line 54
    .line 55
    move-result p3

    .line 56
    add-int/lit8 p3, p3, -0x1

    .line 57
    .line 58
    if-eq p2, p3, :cond_1

    .line 59
    .line 60
    iget-object p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$d;->a:Landroidx/recyclerview/widget/ItemTouchHelper;

    .line 61
    .line 62
    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/ItemTouchHelper;->startDrag(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    .line 63
    .line 64
    .line 65
    :cond_1
    return-void
.end method
