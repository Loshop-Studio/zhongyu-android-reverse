.class public Lcom/luck/picture/lib/PictureSelectorPreviewFragment$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/PictureSelectorPreviewFragment$b;->a(ILcom/luck/picture/lib/entity/LocalMedia;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:I

.field public final synthetic d:Lcom/luck/picture/lib/PictureSelectorPreviewFragment$b;


# direct methods
.method public constructor <init>(Lcom/luck/picture/lib/PictureSelectorPreviewFragment$b;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$b$a;->d:Lcom/luck/picture/lib/PictureSelectorPreviewFragment$b;

    .line 2
    .line 3
    iput p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$b$a;->c:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$b$a;->d:Lcom/luck/picture/lib/PictureSelectorPreviewFragment$b;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$b;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 4
    .line 5
    invoke-static {v0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->Y0(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->M:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$b$a;->d:Lcom/luck/picture/lib/PictureSelectorPreviewFragment$b;

    .line 14
    .line 15
    iget-object v0, v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$b;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->p:Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;

    .line 18
    .line 19
    iget v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$b$a;->c:I

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;->l(I)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method
