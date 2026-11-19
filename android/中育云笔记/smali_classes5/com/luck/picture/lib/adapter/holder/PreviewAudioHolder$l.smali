.class public Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->a(Lcom/luck/picture/lib/entity/LocalMedia;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/luck/picture/lib/entity/LocalMedia;

.field public final synthetic d:Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;


# direct methods
.method public constructor <init>(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;Lcom/luck/picture/lib/entity/LocalMedia;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$l;->d:Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$l;->c:Lcom/luck/picture/lib/entity/LocalMedia;

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
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$l;->d:Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->i:Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder$a;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$l;->c:Lcom/luck/picture/lib/entity/LocalMedia;

    .line 8
    .line 9
    invoke-interface {p1, v0}, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder$a;->b(Lcom/luck/picture/lib/entity/LocalMedia;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    return p1
.end method
