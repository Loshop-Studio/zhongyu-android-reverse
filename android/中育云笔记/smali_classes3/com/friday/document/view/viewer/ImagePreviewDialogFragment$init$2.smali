.class public final Lcom/friday/document/view/viewer/ImagePreviewDialogFragment$init$2;
.super Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;->y()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;


# direct methods
.method public constructor <init>(Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment$init$2;->a:Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onPageSelected(I)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;->onPageSelected(I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment$init$2;->a:Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;

    .line 5
    .line 6
    invoke-static {v0}, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;->t(Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;)Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/ShareBaseViewModel;->C()Lvd/u;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Lvd/u;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ljava/util/List;

    .line 19
    .line 20
    if-ltz p1, :cond_0

    .line 21
    .line 22
    move-object v1, v0

    .line 23
    check-cast v1, Ljava/util/Collection;

    .line 24
    .line 25
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-ge p1, v1, :cond_0

    .line 30
    .line 31
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Lcom/friday/document/model/ShareFile;

    .line 36
    .line 37
    iget-object v0, p0, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment$init$2;->a:Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;

    .line 38
    .line 39
    invoke-static {v0, p1}, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;->v(Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;Lcom/friday/document/model/ShareFile;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-object v1, p0, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment$init$2;->a:Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;

    .line 47
    .line 48
    invoke-static {v1}, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;->u(Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;)Lcom/friday/document/databinding/DialogImageViewPagerBinding;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    iget-object v1, v1, Lcom/friday/document/databinding/DialogImageViewPagerBinding;->c:Landroid/widget/TextView;

    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getFileName()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    .line 60
    .line 61
    iget-object p1, p0, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment$init$2;->a:Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;

    .line 62
    .line 63
    invoke-static {p1}, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;->t(Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;)Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p1, v0}, Lcom/friday/document/viewmodel/ShareBaseViewModel;->I(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :cond_0
    return-void
.end method
