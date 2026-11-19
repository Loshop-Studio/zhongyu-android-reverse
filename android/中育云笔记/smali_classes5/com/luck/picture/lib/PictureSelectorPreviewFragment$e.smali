.class public Lcom/luck/picture/lib/PictureSelectorPreviewFragment$e;
.super Lcom/luck/picture/lib/widget/BottomNavBar$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->M1()V
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
    iput-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$e;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/luck/picture/lib/widget/BottomNavBar$b;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$e;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->I0()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 2
    .line 3
    return-void
.end method

.method public c()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$e;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->o:Landroidx/viewpager2/widget/ViewPager2;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$e;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 10
    .line 11
    iget-object v1, v1, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->m:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-le v1, v0, :cond_0

    .line 18
    .line 19
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$e;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 20
    .line 21
    iget-object v1, v1, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->m:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 28
    .line 29
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$e;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    invoke-virtual {v1, v0, v2}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->E(Lcom/luck/picture/lib/entity/LocalMedia;Z)I

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void
.end method
