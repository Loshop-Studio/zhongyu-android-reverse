.class public Lcom/luck/picture/lib/PictureSelectorFragment$o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm6/a$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/PictureSelectorFragment;->W1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/luck/picture/lib/PictureSelectorFragment;


# direct methods
.method public constructor <init>(Lcom/luck/picture/lib/PictureSelectorFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$o;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment$o;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/luck/picture/lib/PictureSelectorFragment;->I1(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->t0:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment$o;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 12
    .line 13
    invoke-static {v0}, Lcom/luck/picture/lib/PictureSelectorFragment;->J1(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/widget/TitleBar;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lcom/luck/picture/lib/widget/TitleBar;->getImageArrow()Landroid/widget/ImageView;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-static {v0, v1}, La7/b;->a(Landroid/widget/ImageView;Z)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment$o;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/luck/picture/lib/PictureSelectorFragment;->W0(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->t0:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment$o;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 12
    .line 13
    invoke-static {v0}, Lcom/luck/picture/lib/PictureSelectorFragment;->J1(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/widget/TitleBar;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lcom/luck/picture/lib/widget/TitleBar;->getImageArrow()Landroid/widget/ImageView;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-static {v0, v1}, La7/b;->a(Landroid/widget/ImageView;Z)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method
