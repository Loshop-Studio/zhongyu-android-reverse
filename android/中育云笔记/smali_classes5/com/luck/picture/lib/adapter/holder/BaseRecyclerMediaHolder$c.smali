.class public Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->d(Lcom/luck/picture/lib/entity/LocalMedia;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:I

.field public final synthetic d:Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;


# direct methods
.method public constructor <init>(Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$c;->d:Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;

    .line 2
    .line 3
    iput p2, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$c;->c:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$c;->d:Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->a(Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;)Lcom/luck/picture/lib/adapter/PictureImageGridAdapter$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$c;->d:Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;->a(Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder;)Lcom/luck/picture/lib/adapter/PictureImageGridAdapter$b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget v1, p0, Lcom/luck/picture/lib/adapter/holder/BaseRecyclerMediaHolder$c;->c:I

    .line 16
    .line 17
    invoke-interface {v0, p1, v1}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter$b;->d(Landroid/view/View;I)V

    .line 18
    .line 19
    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    return p1
.end method
