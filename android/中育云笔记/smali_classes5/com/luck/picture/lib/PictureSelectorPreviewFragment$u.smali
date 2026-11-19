.class public Lcom/luck/picture/lib/PictureSelectorPreviewFragment$u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/luck/picture/lib/PictureSelectorPreviewFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "u"
.end annotation


# instance fields
.field public final synthetic a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;


# direct methods
.method public constructor <init>(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$u;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;Lcom/luck/picture/lib/PictureSelectorPreviewFragment$j;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$u;-><init>(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$u;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->b1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->L:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$u;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 12
    .line 13
    invoke-static {v0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->c1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$u;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 18
    .line 19
    iget-boolean v1, v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->y:Z

    .line 20
    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    invoke-static {v0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->d1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->M:Z

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$u;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 32
    .line 33
    iget-object v0, v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->n:Lcom/luck/picture/lib/magical/MagicalView;

    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/luck/picture/lib/magical/MagicalView;->t()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$u;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 40
    .line 41
    invoke-static {v0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->v1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    iget-boolean v1, v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->u:Z

    .line 46
    .line 47
    if-nez v1, :cond_3

    .line 48
    .line 49
    invoke-static {v0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->e1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->M:Z

    .line 54
    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$u;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 58
    .line 59
    iget-object v0, v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->n:Lcom/luck/picture/lib/magical/MagicalView;

    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/luck/picture/lib/magical/MagicalView;->t()V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_3
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$u;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 66
    .line 67
    invoke-static {v0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->g1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public b(Lcom/luck/picture/lib/entity/LocalMedia;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$u;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->h1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$u;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 13
    .line 14
    iget-boolean v1, v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->y:Z

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-static {v0, p1}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->i1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;Lcom/luck/picture/lib/entity/LocalMedia;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    :goto_0
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$u;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 8
    .line 9
    iget-object p1, p1, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->r:Lcom/luck/picture/lib/widget/PreviewTitleBar;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$u;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 17
    .line 18
    iget v1, v1, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->t:I

    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, "/"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$u;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 31
    .line 32
    iget v1, v1, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->B:I

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {p1, v0}, Lcom/luck/picture/lib/widget/TitleBar;->setTitle(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$u;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 46
    .line 47
    iget-object v0, v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->r:Lcom/luck/picture/lib/widget/PreviewTitleBar;

    .line 48
    .line 49
    invoke-virtual {v0, p1}, Lcom/luck/picture/lib/widget/TitleBar;->setTitle(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method
