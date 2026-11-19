.class public Lcom/luck/picture/lib/PictureSelectorFragment$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/luck/picture/lib/adapter/PictureImageGridAdapter$b;


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
    iput-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$e;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;ILcom/luck/picture/lib/entity/LocalMedia;)I
    .locals 2

    .line 1
    iget-object p2, p0, Lcom/luck/picture/lib/PictureSelectorFragment$e;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->isSelected()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p2, p3, v0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->E(Lcom/luck/picture/lib/entity/LocalMedia;Z)I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    sget-object p3, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 14
    .line 15
    iget-object p3, p0, Lcom/luck/picture/lib/PictureSelectorFragment$e;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 16
    .line 17
    invoke-virtual {p3}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    sget v0, Lcom/luck/picture/lib/R$anim;->ps_anim_modal_in:I

    .line 22
    .line 23
    invoke-static {p3, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    invoke-virtual {p3}, Landroid/view/animation/Animation;->getDuration()J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    long-to-int v0, v0

    .line 32
    invoke-static {v0}, Lcom/luck/picture/lib/PictureSelectorFragment;->t1(I)I

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, p3}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    return p2
.end method

.method public b()V
    .locals 1

    .line 1
    invoke-static {}, La7/f;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment$e;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->A0()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public c(Landroid/view/View;ILcom/luck/picture/lib/entity/LocalMedia;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$e;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/luck/picture/lib/PictureSelectorFragment;->u1(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget p1, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->l:I

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/4 v1, 0x0

    .line 11
    if-ne p1, v0, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$e;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 14
    .line 15
    invoke-static {p1}, Lcom/luck/picture/lib/PictureSelectorFragment;->v1(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-boolean p1, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->e:Z

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    invoke-static {}, Lu6/a;->h()V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$e;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 27
    .line 28
    invoke-virtual {p1, p3, v1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->E(Lcom/luck/picture/lib/entity/LocalMedia;Z)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-nez p1, :cond_1

    .line 33
    .line 34
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$e;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 35
    .line 36
    invoke-static {p1}, Lcom/luck/picture/lib/PictureSelectorFragment;->w1(Lcom/luck/picture/lib/PictureSelectorFragment;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    invoke-static {}, La7/f;->a()Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    :cond_1
    return-void

    .line 47
    :cond_2
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$e;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 48
    .line 49
    invoke-static {p1, p2, v1}, Lcom/luck/picture/lib/PictureSelectorFragment;->n1(Lcom/luck/picture/lib/PictureSelectorFragment;IZ)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public d(Landroid/view/View;I)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$e;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/luck/picture/lib/PictureSelectorFragment;->l1(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/widget/SlideSelectTouchListener;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$e;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/luck/picture/lib/PictureSelectorFragment;->x1(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-boolean p1, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->E0:Z

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$e;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 20
    .line 21
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string v0, "vibrator"

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Landroid/os/Vibrator;

    .line 32
    .line 33
    const-wide/16 v0, 0x32

    .line 34
    .line 35
    invoke-virtual {p1, v0, v1}, Landroid/os/Vibrator;->vibrate(J)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$e;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 39
    .line 40
    invoke-static {p1}, Lcom/luck/picture/lib/PictureSelectorFragment;->l1(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/widget/SlideSelectTouchListener;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1, p2}, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->p(I)V

    .line 45
    .line 46
    .line 47
    :cond_0
    return-void
.end method
