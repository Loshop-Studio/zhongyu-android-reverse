.class public Lcom/luck/picture/lib/PictureSelectorFragment$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/PictureSelectorFragment;->L1()V
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
    iput-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$f;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

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
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$f;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v0, v1}, Ln6/a;->c(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$f;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v0, v1}, Ln6/a;->a(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method
