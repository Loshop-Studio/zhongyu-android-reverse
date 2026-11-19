.class public Lcom/luck/picture/lib/adapter/PictureAlbumAdapter$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/adapter/PictureAlbumAdapter;->d(Lcom/luck/picture/lib/adapter/PictureAlbumAdapter$b;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:I

.field public final synthetic d:Lcom/luck/picture/lib/entity/LocalMediaFolder;

.field public final synthetic e:Lcom/luck/picture/lib/adapter/PictureAlbumAdapter;


# direct methods
.method public constructor <init>(Lcom/luck/picture/lib/adapter/PictureAlbumAdapter;ILcom/luck/picture/lib/entity/LocalMediaFolder;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/adapter/PictureAlbumAdapter$a;->e:Lcom/luck/picture/lib/adapter/PictureAlbumAdapter;

    .line 2
    .line 3
    iput p2, p0, Lcom/luck/picture/lib/adapter/PictureAlbumAdapter$a;->c:I

    .line 4
    .line 5
    iput-object p3, p0, Lcom/luck/picture/lib/adapter/PictureAlbumAdapter$a;->d:Lcom/luck/picture/lib/entity/LocalMediaFolder;

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
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/PictureAlbumAdapter$a;->e:Lcom/luck/picture/lib/adapter/PictureAlbumAdapter;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/luck/picture/lib/adapter/PictureAlbumAdapter;->a(Lcom/luck/picture/lib/adapter/PictureAlbumAdapter;)Lq6/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/PictureAlbumAdapter$a;->e:Lcom/luck/picture/lib/adapter/PictureAlbumAdapter;

    .line 11
    .line 12
    invoke-static {p1}, Lcom/luck/picture/lib/adapter/PictureAlbumAdapter;->a(Lcom/luck/picture/lib/adapter/PictureAlbumAdapter;)Lq6/a;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget v0, p0, Lcom/luck/picture/lib/adapter/PictureAlbumAdapter$a;->c:I

    .line 17
    .line 18
    iget-object v1, p0, Lcom/luck/picture/lib/adapter/PictureAlbumAdapter$a;->d:Lcom/luck/picture/lib/entity/LocalMediaFolder;

    .line 19
    .line 20
    invoke-interface {p1, v0, v1}, Lq6/a;->a(ILcom/luck/picture/lib/entity/LocalMediaFolder;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method
