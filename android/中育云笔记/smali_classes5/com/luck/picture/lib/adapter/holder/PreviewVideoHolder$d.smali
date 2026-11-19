.class public Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->a(Lcom/luck/picture/lib/entity/LocalMedia;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;


# direct methods
.method public constructor <init>(Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder$d;->c:Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder$d;->c:Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;

    .line 2
    .line 3
    iget-object v0, p1, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 4
    .line 5
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->L0:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;->m(Lcom/luck/picture/lib/adapter/holder/PreviewVideoHolder;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object p1, p1, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->i:Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder$a;

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-interface {p1}, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder$a;->a()V

    .line 18
    .line 19
    .line 20
    :cond_1
    return-void
.end method
