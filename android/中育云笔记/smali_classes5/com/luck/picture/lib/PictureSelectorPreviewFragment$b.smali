.class public Lcom/luck/picture/lib/PictureSelectorPreviewFragment$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->O1(Landroid/view/ViewGroup;)V
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
    iput-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$b;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(ILcom/luck/picture/lib/entity/LocalMedia;Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p3, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$b;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 2
    .line 3
    invoke-static {p3}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->z1(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    iget-object p3, p3, Lcom/luck/picture/lib/config/PictureSelectionConfig;->h0:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    if-eqz p3, :cond_0

    .line 14
    .line 15
    iget-object p3, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$b;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 16
    .line 17
    sget v0, Lcom/luck/picture/lib/R$string;->ps_camera_roll:I

    .line 18
    .line 19
    invoke-virtual {p3, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object p3, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$b;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 25
    .line 26
    invoke-static {p3}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->W0(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    iget-object p3, p3, Lcom/luck/picture/lib/config/PictureSelectionConfig;->h0:Ljava/lang/String;

    .line 31
    .line 32
    :goto_0
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$b;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 33
    .line 34
    iget-boolean v1, v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->u:Z

    .line 35
    .line 36
    if-nez v1, :cond_1

    .line 37
    .line 38
    iget-object v0, v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->w:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v0, p3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 41
    .line 42
    .line 43
    move-result p3

    .line 44
    if-nez p3, :cond_1

    .line 45
    .line 46
    invoke-virtual {p2}, Lcom/luck/picture/lib/entity/LocalMedia;->w()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p3

    .line 50
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$b;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 51
    .line 52
    iget-object v0, v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->w:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {p3, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 55
    .line 56
    .line 57
    move-result p3

    .line 58
    if-eqz p3, :cond_4

    .line 59
    .line 60
    :cond_1
    iget-object p3, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$b;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 61
    .line 62
    iget-boolean v0, p3, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->u:Z

    .line 63
    .line 64
    if-eqz v0, :cond_2

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    iget-boolean p1, p3, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->x:Z

    .line 68
    .line 69
    if-eqz p1, :cond_3

    .line 70
    .line 71
    iget p1, p2, Lcom/luck/picture/lib/entity/LocalMedia;->o:I

    .line 72
    .line 73
    add-int/lit8 p1, p1, -0x1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    iget p1, p2, Lcom/luck/picture/lib/entity/LocalMedia;->o:I

    .line 77
    .line 78
    :goto_1
    iget-object p3, p3, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->o:Landroidx/viewpager2/widget/ViewPager2;

    .line 79
    .line 80
    invoke-virtual {p3}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 81
    .line 82
    .line 83
    move-result p3

    .line 84
    if-ne p1, p3, :cond_5

    .line 85
    .line 86
    invoke-virtual {p2}, Lcom/luck/picture/lib/entity/LocalMedia;->E()Z

    .line 87
    .line 88
    .line 89
    move-result p3

    .line 90
    if-eqz p3, :cond_5

    .line 91
    .line 92
    :cond_4
    return-void

    .line 93
    :cond_5
    iget-object p3, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$b;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 94
    .line 95
    iget-object p3, p3, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->o:Landroidx/viewpager2/widget/ViewPager2;

    .line 96
    .line 97
    invoke-virtual {p3}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 98
    .line 99
    .line 100
    move-result-object p3

    .line 101
    if-eqz p3, :cond_6

    .line 102
    .line 103
    iget-object p3, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$b;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 104
    .line 105
    iget-object p3, p3, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->o:Landroidx/viewpager2/widget/ViewPager2;

    .line 106
    .line 107
    const/4 v0, 0x0

    .line 108
    invoke-virtual {p3, v0}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 109
    .line 110
    .line 111
    iget-object p3, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$b;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 112
    .line 113
    iget-object v0, p3, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->o:Landroidx/viewpager2/widget/ViewPager2;

    .line 114
    .line 115
    iget-object p3, p3, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->p:Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;

    .line 116
    .line 117
    invoke-virtual {v0, p3}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 118
    .line 119
    .line 120
    :cond_6
    iget-object p3, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$b;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 121
    .line 122
    iget-object p3, p3, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->o:Landroidx/viewpager2/widget/ViewPager2;

    .line 123
    .line 124
    const/4 v0, 0x0

    .line 125
    invoke-virtual {p3, p1, v0}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(IZ)V

    .line 126
    .line 127
    .line 128
    iget-object p3, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$b;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 129
    .line 130
    invoke-static {p3, p2}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->X0(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;Lcom/luck/picture/lib/entity/LocalMedia;)V

    .line 131
    .line 132
    .line 133
    iget-object p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$b;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 134
    .line 135
    iget-object p2, p2, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->o:Landroidx/viewpager2/widget/ViewPager2;

    .line 136
    .line 137
    new-instance p3, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$b$a;

    .line 138
    .line 139
    invoke-direct {p3, p0, p1}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$b$a;-><init>(Lcom/luck/picture/lib/PictureSelectorPreviewFragment$b;I)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p2, p3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 143
    .line 144
    .line 145
    return-void
.end method
