.class public Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->h(Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$e;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$e;

.field public final synthetic d:Lcom/luck/picture/lib/entity/LocalMedia;

.field public final synthetic e:Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;


# direct methods
.method public constructor <init>(Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$e;Lcom/luck/picture/lib/entity/LocalMedia;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$a;->e:Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$a;->c:Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$e;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$a;->d:Lcom/luck/picture/lib/entity/LocalMedia;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$a;->e:Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->a(Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;)Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$a;->e:Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->a(Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;)Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$a;->c:Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$e;

    .line 16
    .line 17
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getAbsoluteAdapterPosition()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iget-object v2, p0, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$a;->d:Lcom/luck/picture/lib/entity/LocalMedia;

    .line 22
    .line 23
    invoke-interface {v0, v1, v2, p1}, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$c;->a(ILcom/luck/picture/lib/entity/LocalMedia;Landroid/view/View;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method
