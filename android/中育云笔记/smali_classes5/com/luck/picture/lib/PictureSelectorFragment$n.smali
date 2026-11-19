.class public Lcom/luck/picture/lib/PictureSelectorFragment$n;
.super Lcom/luck/picture/lib/widget/TitleBar$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/PictureSelectorFragment;->a2()V
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
    iput-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$n;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

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
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment$n;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/luck/picture/lib/PictureSelectorFragment;->H1(Lcom/luck/picture/lib/PictureSelectorFragment;)Lm6/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment$n;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 14
    .line 15
    invoke-static {v0}, Lcom/luck/picture/lib/PictureSelectorFragment;->H1(Lcom/luck/picture/lib/PictureSelectorFragment;)Lm6/a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Lm6/a;->dismiss()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment$n;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->p0()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public b(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment$n;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/luck/picture/lib/PictureSelectorFragment;->H1(Lcom/luck/picture/lib/PictureSelectorFragment;)Lm6/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lm6/a;->showAsDropDown(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public c()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment$n;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/luck/picture/lib/PictureSelectorFragment;->B1(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->n0:Z

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iget-object v2, p0, Lcom/luck/picture/lib/PictureSelectorFragment$n;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 16
    .line 17
    invoke-static {v2}, Lcom/luck/picture/lib/PictureSelectorFragment;->E1(Lcom/luck/picture/lib/PictureSelectorFragment;)J

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    sub-long/2addr v0, v2

    .line 22
    const/16 v2, 0x1f4

    .line 23
    .line 24
    int-to-long v2, v2

    .line 25
    cmp-long v0, v0, v2

    .line 26
    .line 27
    if-gez v0, :cond_0

    .line 28
    .line 29
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment$n;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 30
    .line 31
    invoke-static {v0}, Lcom/luck/picture/lib/PictureSelectorFragment;->U0(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Lcom/luck/picture/lib/adapter/PictureImageGridAdapter;->getItemCount()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-lez v0, :cond_0

    .line 40
    .line 41
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment$n;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 42
    .line 43
    invoke-static {v0}, Lcom/luck/picture/lib/PictureSelectorFragment;->G1(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const/4 v1, 0x0

    .line 48
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_0
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment$n;->a:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 53
    .line 54
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 55
    .line 56
    .line 57
    move-result-wide v1

    .line 58
    invoke-static {v0, v1, v2}, Lcom/luck/picture/lib/PictureSelectorFragment;->F1(Lcom/luck/picture/lib/PictureSelectorFragment;J)J

    .line 59
    .line 60
    .line 61
    :cond_1
    return-void
.end method
