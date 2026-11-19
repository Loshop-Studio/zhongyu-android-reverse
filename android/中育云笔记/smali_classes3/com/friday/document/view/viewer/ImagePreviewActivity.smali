.class public final Lcom/friday/document/view/viewer/ImagePreviewActivity;
.super Lcom/friday/document/view/viewer/Hilt_ImagePreviewActivity;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Lcom/alibaba/android/arouter/facade/annotation/Route;
    path = "/document/IMAGE_PREVIEW_ACTIVITY"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/document/view/viewer/Hilt_ImagePreviewActivity<",
        "Lcom/friday/document/databinding/ActivityImagePreviewBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public g:Ljava/lang/String;

.field public h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/friday/document/view/viewer/Hilt_ImagePreviewActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lcom/friday/document/view/viewer/ImagePreviewActivity;->g:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic N(Lcom/friday/document/view/viewer/ImagePreviewActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/viewer/ImagePreviewActivity;->P(Lcom/friday/document/view/viewer/ImagePreviewActivity;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic O(Lcom/friday/document/view/viewer/ImagePreviewActivity;)Lcom/friday/document/databinding/ActivityImagePreviewBinding;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/friday/document/databinding/ActivityImagePreviewBinding;

    .line 6
    .line 7
    return-object p0
.end method

.method public static final P(Lcom/friday/document/view/viewer/ImagePreviewActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getLayoutId()I
    .locals 1

    .line 1
    # RE layout layout/activity_image_preview (0x7f0c001e), APK res/0d.xml
    sget v0, Lcom/friday/document/R$layout;->activity_image_preview:I

    .line 2
    .line 3
    return v0
.end method

.method public initData()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/alibaba/android/arouter/launcher/ARouter;->getInstance()Lcom/alibaba/android/arouter/launcher/ARouter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lcom/alibaba/android/arouter/launcher/ARouter;->inject(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lcom/friday/document/databinding/ActivityImagePreviewBinding;

    .line 13
    .line 14
    iget-object v0, v0, Lcom/friday/document/databinding/ActivityImagePreviewBinding;->c:Landroid/widget/ImageView;

    .line 15
    .line 16
    new-instance v1, Ly2/a;

    .line 17
    .line 18
    invoke-direct {v1, p0}, Ly2/a;-><init>(Lcom/friday/document/view/viewer/ImagePreviewActivity;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 22
    .line 23
    .line 24
    iget-boolean v0, p0, Lcom/friday/document/view/viewer/ImagePreviewActivity;->h:Z

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-static {p0}, Lcom/bumptech/glide/b;->w(Landroidx/fragment/app/FragmentActivity;)Lcom/bumptech/glide/h;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-object v1, p0, Lcom/friday/document/view/viewer/ImagePreviewActivity;->g:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/h;->t(Ljava/lang/String;)Lcom/bumptech/glide/g;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sget-object v1, Lj0/c;->b:Lj0/c;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Lz0/a;->h(Lj0/c;)Lz0/a;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Lcom/bumptech/glide/g;

    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Lcom/friday/document/databinding/ActivityImagePreviewBinding;

    .line 51
    .line 52
    iget-object v1, v1, Lcom/friday/document/databinding/ActivityImagePreviewBinding;->d:Lcom/luck/picture/lib/photoview/PhotoView;

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/g;->A0(Landroid/widget/ImageView;)La1/i;

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_0
    sget-object v0, Lf2/c;->a:Lf2/c;

    .line 59
    .line 60
    invoke-virtual {v0}, Lf2/c;->e()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_1

    .line 65
    .line 66
    sget v0, Lcom/friday/document/R$string;->connect_network_please:I

    .line 67
    .line 68
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    const-string v1, "getString(...)"

    .line 73
    .line 74
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_1
    const/4 v0, 0x1

    .line 82
    invoke-virtual {p0, v0}, Lcom/friday/common/base/BaseActivity;->isShowLoading(Z)V

    .line 83
    .line 84
    .line 85
    invoke-static {p0}, Lcom/bumptech/glide/b;->w(Landroidx/fragment/app/FragmentActivity;)Lcom/bumptech/glide/h;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iget-object v1, p0, Lcom/friday/document/view/viewer/ImagePreviewActivity;->g:Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/h;->t(Ljava/lang/String;)Lcom/bumptech/glide/g;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    new-instance v1, Lcom/friday/document/view/viewer/ImagePreviewActivity$a;

    .line 96
    .line 97
    invoke-direct {v1, p0}, Lcom/friday/document/view/viewer/ImagePreviewActivity$a;-><init>(Lcom/friday/document/view/viewer/ImagePreviewActivity;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/g;->C0(Lz0/c;)Lcom/bumptech/glide/g;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    check-cast v1, Lcom/friday/document/databinding/ActivityImagePreviewBinding;

    .line 109
    .line 110
    iget-object v1, v1, Lcom/friday/document/databinding/ActivityImagePreviewBinding;->d:Lcom/luck/picture/lib/photoview/PhotoView;

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/g;->A0(Landroid/widget/ImageView;)La1/i;

    .line 113
    .line 114
    .line 115
    return-void
.end method
