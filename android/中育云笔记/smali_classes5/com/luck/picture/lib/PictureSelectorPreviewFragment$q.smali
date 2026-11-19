.class public Lcom/luck/picture/lib/PictureSelectorPreviewFragment$q;
.super Lcom/luck/picture/lib/widget/TitleBar$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->P1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;


# direct methods
.method public constructor <init>(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$q;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/luck/picture/lib/widget/TitleBar$a;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$q;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 2
    .line 3
    iget-boolean v1, v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->y:Z

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    invoke-static {v0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->u1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->M:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$q;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->n:Lcom/luck/picture/lib/magical/MagicalView;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/luck/picture/lib/magical/MagicalView;->t()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$q;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 24
    .line 25
    invoke-static {v0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->v1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    iget-boolean v1, v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->u:Z

    .line 30
    .line 31
    if-nez v1, :cond_2

    .line 32
    .line 33
    invoke-static {v0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->w1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->M:Z

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$q;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 42
    .line 43
    iget-object v0, v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->n:Lcom/luck/picture/lib/magical/MagicalView;

    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/luck/picture/lib/magical/MagicalView;->t()V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_2
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$q;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 50
    .line 51
    invoke-static {v0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->x1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method
