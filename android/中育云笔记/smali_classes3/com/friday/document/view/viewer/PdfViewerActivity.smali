.class public final Lcom/friday/document/view/viewer/PdfViewerActivity;
.super Lcom/friday/document/view/viewer/Hilt_PdfViewerActivity;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Lcom/alibaba/android/arouter/facade/annotation/Route;
    path = "/document/PdfViewerActivity"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/document/view/viewer/Hilt_PdfViewerActivity<",
        "Lcom/friday/document/databinding/ActivityOfficeWebBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/friday/document/view/viewer/Hilt_PdfViewerActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lcom/friday/document/view/viewer/PdfViewerActivity;->g:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic N(Lcom/friday/document/view/viewer/PdfViewerActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/viewer/PdfViewerActivity;->O(Lcom/friday/document/view/viewer/PdfViewerActivity;Landroid/view/View;)V

    return-void
.end method

.method public static final O(Lcom/friday/document/view/viewer/PdfViewerActivity;Landroid/view/View;)V
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
    # RE layout layout/activity_office_web (0x7f0c0021), APK res/is.xml
    sget v0, Lcom/friday/document/R$layout;->activity_office_web:I

    .line 2
    .line 3
    return v0
.end method

.method public initData()V
    .locals 4

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
    check-cast v0, Lcom/friday/document/databinding/ActivityOfficeWebBinding;

    .line 13
    .line 14
    iget-object v0, v0, Lcom/friday/document/databinding/ActivityOfficeWebBinding;->e:Landroid/widget/ImageView;

    .line 15
    .line 16
    new-instance v1, Ly2/j;

    .line 17
    .line 18
    invoke-direct {v1, p0}, Ly2/j;-><init>(Lcom/friday/document/view/viewer/PdfViewerActivity;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sget v1, Lcom/friday/document/R$id;->fragment_container:I

    .line 33
    .line 34
    sget-object v2, Lcom/friday/document/view/preview/PdfPreviewFragment;->j:Lcom/friday/document/view/preview/PdfPreviewFragment$a;

    .line 35
    .line 36
    iget-object v3, p0, Lcom/friday/document/view/viewer/PdfViewerActivity;->g:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v2, v3}, Lcom/friday/document/view/preview/PdfPreviewFragment$a;->a(Ljava/lang/String;)Lcom/friday/document/view/preview/PdfPreviewFragment;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentTransaction;->commit()I

    .line 47
    .line 48
    .line 49
    return-void
.end method
