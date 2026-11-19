.class public Lcom/luck/picture/lib/PictureSelectorPreviewFragment$p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->N1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/luck/picture/lib/style/SelectMainStyle;

.field public final synthetic d:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;


# direct methods
.method public constructor <init>(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;Lcom/luck/picture/lib/style/SelectMainStyle;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$p;->d:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$p;->c:Lcom/luck/picture/lib/style/SelectMainStyle;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$p;->c:Lcom/luck/picture/lib/style/SelectMainStyle;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/luck/picture/lib/style/SelectMainStyle;->U()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, 0x1

    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    invoke-static {}, Lu6/a;->l()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$p;->d:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 18
    .line 19
    iget-object v2, p1, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->m:Ljava/util/ArrayList;

    .line 20
    .line 21
    iget-object v3, p1, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->o:Landroidx/viewpager2/widget/ViewPager2;

    .line 22
    .line 23
    invoke-virtual {v3}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 32
    .line 33
    invoke-virtual {p1, v2, v1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->E(Lcom/luck/picture/lib/entity/LocalMedia;Z)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-nez p1, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move v0, v1

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-static {}, Lu6/a;->l()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-lez p1, :cond_0

    .line 47
    .line 48
    :goto_0
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$p;->d:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 49
    .line 50
    invoke-static {p1}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->f1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iget-boolean p1, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->O:Z

    .line 55
    .line 56
    if-eqz p1, :cond_2

    .line 57
    .line 58
    invoke-static {}, Lu6/a;->l()I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-nez p1, :cond_2

    .line 63
    .line 64
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$p;->d:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->m0()V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_2
    if-eqz v0, :cond_3

    .line 71
    .line 72
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$p;->d:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 73
    .line 74
    invoke-static {p1}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->q1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)V

    .line 75
    .line 76
    .line 77
    :cond_3
    return-void
.end method
