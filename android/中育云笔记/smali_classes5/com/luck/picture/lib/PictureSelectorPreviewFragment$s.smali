.class public Lcom/luck/picture/lib/PictureSelectorPreviewFragment$s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->P1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;


# direct methods
.method public constructor <init>(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$s;->c:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

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
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$s;->c:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 2
    .line 3
    iget-boolean v0, p1, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->y:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->y1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object v0, p1, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->m:Ljava/util/ArrayList;

    .line 12
    .line 13
    iget-object p1, p1, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->o:Landroidx/viewpager2/widget/ViewPager2;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 24
    .line 25
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$s;->c:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 26
    .line 27
    iget-object v1, v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->F:Landroid/widget/TextView;

    .line 28
    .line 29
    invoke-virtual {v1}, Landroid/view/View;->isSelected()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-virtual {v0, p1, v1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->E(Lcom/luck/picture/lib/entity/LocalMedia;Z)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-nez p1, :cond_1

    .line 38
    .line 39
    sget-object p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 40
    .line 41
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$s;->c:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 42
    .line 43
    iget-object v0, p1, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->F:Landroid/widget/TextView;

    .line 44
    .line 45
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    sget v1, Lcom/luck/picture/lib/R$anim;->ps_anim_modal_in:I

    .line 50
    .line 51
    invoke-static {p1, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {v0, p1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    return-void
.end method
