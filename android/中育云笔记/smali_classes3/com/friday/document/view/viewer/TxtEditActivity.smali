.class public final Lcom/friday/document/view/viewer/TxtEditActivity;
.super Lcom/friday/document/view/viewer/Hilt_TxtEditActivity;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Lcom/alibaba/android/arouter/facade/annotation/Route;
    path = "/document/TxtEditActivity"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/document/view/viewer/Hilt_TxtEditActivity<",
        "Lcom/friday/document/databinding/ActivityTxtEditBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final g:Lqc/d;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/String;

.field public l:Ljava/lang/String;

.field public m:Z

.field public n:Ljava/lang/String;

.field public o:Lcom/friday/common/entity/FileEntity;

.field public p:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/friday/document/view/viewer/Hilt_TxtEditActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/friday/document/view/viewer/TxtEditActivity$special$$inlined$viewModels$default$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/friday/document/view/viewer/TxtEditActivity$special$$inlined$viewModels$default$1;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Landroidx/lifecycle/ViewModelLazy;

    .line 10
    .line 11
    const-class v2, Lcom/friday/document/viewmodel/TxtEditViewModel;

    .line 12
    .line 13
    invoke-static {v2}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    new-instance v3, Lcom/friday/document/view/viewer/TxtEditActivity$special$$inlined$viewModels$default$2;

    .line 18
    .line 19
    invoke-direct {v3, p0}, Lcom/friday/document/view/viewer/TxtEditActivity$special$$inlined$viewModels$default$2;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 20
    .line 21
    .line 22
    new-instance v4, Lcom/friday/document/view/viewer/TxtEditActivity$special$$inlined$viewModels$default$3;

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    invoke-direct {v4, v5, p0}, Lcom/friday/document/view/viewer/TxtEditActivity$special$$inlined$viewModels$default$3;-><init>(Lhd/a;Landroidx/activity/ComponentActivity;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/ViewModelLazy;-><init>(Lod/c;Lhd/a;Lhd/a;Lhd/a;)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Lcom/friday/document/view/viewer/TxtEditActivity;->g:Lqc/d;

    .line 32
    .line 33
    const-string v0, ""

    .line 34
    .line 35
    iput-object v0, p0, Lcom/friday/document/view/viewer/TxtEditActivity;->h:Ljava/lang/String;

    .line 36
    .line 37
    iput-object v0, p0, Lcom/friday/document/view/viewer/TxtEditActivity;->j:Ljava/lang/String;

    .line 38
    .line 39
    iput-object v0, p0, Lcom/friday/document/view/viewer/TxtEditActivity;->k:Ljava/lang/String;

    .line 40
    .line 41
    iput-object v0, p0, Lcom/friday/document/view/viewer/TxtEditActivity;->l:Ljava/lang/String;

    .line 42
    .line 43
    iput-object v0, p0, Lcom/friday/document/view/viewer/TxtEditActivity;->n:Ljava/lang/String;

    .line 44
    .line 45
    return-void
.end method

.method public static synthetic N(Lcom/friday/document/view/viewer/TxtEditActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/viewer/TxtEditActivity;->f0(Lcom/friday/document/view/viewer/TxtEditActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic O(Lcom/friday/document/view/viewer/TxtEditActivity;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/viewer/TxtEditActivity;->d0(Lcom/friday/document/view/viewer/TxtEditActivity;Lcom/friday/common/entity/FileEntity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic P(Lcom/friday/document/view/viewer/TxtEditActivity;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/viewer/TxtEditActivity;->a0(Lcom/friday/document/view/viewer/TxtEditActivity;Lcom/friday/common/entity/FileEntity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Q(Lcom/friday/document/view/viewer/TxtEditActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/viewer/TxtEditActivity;->b0(Lcom/friday/document/view/viewer/TxtEditActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic R(Lcom/friday/document/view/viewer/TxtEditActivity;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/viewer/TxtEditActivity;->e0(Lcom/friday/document/view/viewer/TxtEditActivity;Lcom/friday/common/entity/FileEntity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic S(Lcom/friday/document/view/viewer/TxtEditActivity;Landroid/view/View;Landroid/widget/PopupWindow;Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/document/view/viewer/TxtEditActivity;->c0(Lcom/friday/document/view/viewer/TxtEditActivity;Landroid/view/View;Landroid/widget/PopupWindow;Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic T(Lcom/friday/document/view/viewer/TxtEditActivity;)Lcom/friday/common/entity/FileEntity;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/view/viewer/TxtEditActivity;->o:Lcom/friday/common/entity/FileEntity;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic U(Lcom/friday/document/view/viewer/TxtEditActivity;)Lcom/friday/document/databinding/ActivityTxtEditBinding;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/friday/document/databinding/ActivityTxtEditBinding;

    .line 6
    .line 7
    return-object p0
.end method

.method public static final synthetic V(Lcom/friday/document/view/viewer/TxtEditActivity;)Lcom/friday/document/viewmodel/TxtEditViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/viewer/TxtEditActivity;->Z()Lcom/friday/document/viewmodel/TxtEditViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic W(Lcom/friday/document/view/viewer/TxtEditActivity;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/view/viewer/TxtEditActivity;->p:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic X(Lcom/friday/document/view/viewer/TxtEditActivity;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/viewer/TxtEditActivity;->p:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public static final a0(Lcom/friday/document/view/viewer/TxtEditActivity;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string v0, "UpdateSelectedNote"

    .line 4
    .line 5
    invoke-static {v0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lcom/friday/common/entity/UpdateSpecifiedItem;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v2, p0, Lcom/friday/document/view/viewer/TxtEditActivity;->k:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v2}, Lcom/friday/common/entity/FromPage;->valueOf(Ljava/lang/String;)Lcom/friday/common/entity/FromPage;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-direct {v1, p1, v2}, Lcom/friday/common/entity/UpdateSpecifiedItem;-><init>(Ljava/lang/String;Lcom/friday/common/entity/FromPage;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0, v1}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 28
    .line 29
    .line 30
    :cond_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 31
    .line 32
    return-object p0
.end method

.method public static final b0(Lcom/friday/document/view/viewer/TxtEditActivity;Landroid/view/View;)V
    .locals 3

    .line 1
    new-instance v0, Lm2/a$a;

    .line 2
    .line 3
    new-instance v1, Lm2/a;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lm2/a;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Lm2/a$a;-><init>(Lm2/a;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v1}, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->a(Landroid/view/LayoutInflater;)Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v2, "inflate(...)"

    .line 20
    .line 21
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lm2/a$a;->b(Landroidx/databinding/ViewDataBinding;)Lm2/a$a;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    sget v2, Lcom/friday/document/R$dimen;->view_168:I

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    float-to-int v1, v1

    .line 39
    const/4 v2, -0x2

    .line 40
    invoke-virtual {v0, v1, v2}, Lm2/a$a;->e(II)Lm2/a$a;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const/4 v1, 0x1

    .line 45
    invoke-virtual {v0, v1}, Lm2/a$a;->d(Z)Lm2/a$a;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    new-instance v1, Ly2/q;

    .line 50
    .line 51
    invoke-direct {v1, p0}, Ly2/q;-><init>(Lcom/friday/document/view/viewer/TxtEditActivity;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v1}, Lm2/a$a;->c(Lhd/q;)Lm2/a$a;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {p0}, Lm2/a$a;->a()Lm2/a;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    const/4 v0, 0x0

    .line 63
    const/16 v1, 0x50

    .line 64
    .line 65
    invoke-virtual {p0, p1, v0, v0, v1}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;III)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public static final c0(Lcom/friday/document/view/viewer/TxtEditActivity;Landroid/view/View;Landroid/widget/PopupWindow;Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;)Lqc/q;
    .locals 2

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "popupWindow"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "dataBinding"

    .line 12
    .line 13
    invoke-static {p3, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p3, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->f:Landroid/widget/TextView;

    .line 17
    .line 18
    iget-object p0, p0, Lcom/friday/document/view/viewer/TxtEditActivity;->l:Ljava/lang/String;

    .line 19
    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v1, "\u6536\u5230\u5206\u4eab\uff1a"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 38
    .line 39
    .line 40
    iget-object p0, p3, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->e:Landroid/widget/TextView;

    .line 41
    .line 42
    const/16 p1, 0x8

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2}, Landroid/widget/PopupWindow;->dismiss()V

    .line 48
    .line 49
    .line 50
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 51
    .line 52
    return-object p0
.end method

.method public static final d0(Lcom/friday/document/view/viewer/TxtEditActivity;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 6

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lcom/friday/document/view/viewer/TxtEditActivity;->o:Lcom/friday/common/entity/FileEntity;

    .line 4
    .line 5
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v3, Lcom/friday/document/view/viewer/TxtEditActivity$initData$4$1;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {v3, p0, p1, v2}, Lcom/friday/document/view/viewer/TxtEditActivity$initData$4$1;-><init>(Lcom/friday/document/view/viewer/TxtEditActivity;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

    .line 17
    .line 18
    .line 19
    const/4 v4, 0x2

    .line 20
    const/4 v5, 0x0

    .line 21
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    invoke-virtual {p0, p1}, Lcom/friday/common/base/BaseActivity;->isShowLoading(Z)V

    .line 27
    .line 28
    .line 29
    const-string p1, "\u672a\u627e\u5230\u8be5\u6587\u672c"

    .line 30
    .line 31
    invoke-static {p1}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 35
    .line 36
    .line 37
    :goto_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 38
    .line 39
    return-object p0
.end method

.method public static final e0(Lcom/friday/document/view/viewer/TxtEditActivity;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 4
    .line 5
    .line 6
    const-string v0, "UpdateSelectedNote"

    .line 7
    .line 8
    invoke-static {v0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Lcom/friday/common/entity/UpdateSpecifiedItem;

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object p0, p0, Lcom/friday/document/view/viewer/TxtEditActivity;->k:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {p0}, Lcom/friday/common/entity/FromPage;->valueOf(Ljava/lang/String;)Lcom/friday/common/entity/FromPage;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-direct {v1, p1, p0}, Lcom/friday/common/entity/UpdateSpecifiedItem;-><init>(Ljava/lang/String;Lcom/friday/common/entity/FromPage;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {v0, v1}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 31
    .line 32
    return-object p0
.end method

.method public static final f0(Lcom/friday/document/view/viewer/TxtEditActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/viewer/TxtEditActivity;->onBackPressed()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final Y(Landroid/widget/EditText;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setLongClickable(Z)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextIsSelectable(Z)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcom/friday/document/view/viewer/TxtEditActivity$a;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/friday/document/view/viewer/TxtEditActivity$a;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catch_0
    move-exception p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final Z()Lcom/friday/document/viewmodel/TxtEditViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/viewer/TxtEditActivity;->g:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/document/viewmodel/TxtEditViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public final g0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/document/view/viewer/TxtEditActivity;->m:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/friday/document/view/viewer/TxtEditActivity;->n:Ljava/lang/String;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-lez v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public getLayoutId()I
    .locals 1

    .line 1
    # RE layout layout/activity_txt_edit (0x7f0c0023), APK res/c11.xml
    sget v0, Lcom/friday/document/R$layout;->activity_txt_edit:I

    .line 2
    .line 3
    return v0
.end method

.method public initData()V
    .locals 11

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
    check-cast v0, Lcom/friday/document/databinding/ActivityTxtEditBinding;

    .line 13
    .line 14
    iget-object v0, v0, Lcom/friday/document/databinding/ActivityTxtEditBinding;->h:Landroid/widget/TextView;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/friday/document/view/viewer/TxtEditActivity;->j:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 19
    .line 20
    .line 21
    iget-boolean v0, p0, Lcom/friday/document/view/viewer/TxtEditActivity;->m:Z

    .line 22
    .line 23
    const-string v1, "nsvTxt"

    .line 24
    .line 25
    const/16 v2, 0x8

    .line 26
    .line 27
    const-string v3, "etTxt"

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lcom/friday/document/databinding/ActivityTxtEditBinding;

    .line 37
    .line 38
    iget-object v0, v0, Lcom/friday/document/databinding/ActivityTxtEditBinding;->c:Lcom/zykj/view/widget/LimitEditText;

    .line 39
    .line 40
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Lcom/friday/document/databinding/ActivityTxtEditBinding;

    .line 51
    .line 52
    iget-object v0, v0, Lcom/friday/document/databinding/ActivityTxtEditBinding;->f:Landroidx/core/widget/NestedScrollView;

    .line 53
    .line 54
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, Lcom/friday/document/databinding/ActivityTxtEditBinding;

    .line 66
    .line 67
    iget-object v0, v0, Lcom/friday/document/databinding/ActivityTxtEditBinding;->c:Lcom/zykj/view/widget/LimitEditText;

    .line 68
    .line 69
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, Lcom/friday/document/databinding/ActivityTxtEditBinding;

    .line 80
    .line 81
    iget-object v0, v0, Lcom/friday/document/databinding/ActivityTxtEditBinding;->f:Landroidx/core/widget/NestedScrollView;

    .line 82
    .line 83
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 87
    .line 88
    .line 89
    :goto_0
    invoke-virtual {p0}, Lcom/friday/document/view/viewer/TxtEditActivity;->Z()Lcom/friday/document/viewmodel/TxtEditViewModel;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/TxtEditViewModel;->k()Landroidx/lifecycle/MutableLiveData;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    new-instance v1, Ly2/l;

    .line 98
    .line 99
    invoke-direct {v1, p0}, Ly2/l;-><init>(Lcom/friday/document/view/viewer/TxtEditActivity;)V

    .line 100
    .line 101
    .line 102
    new-instance v5, Lcom/friday/document/view/viewer/TxtEditActivity$b;

    .line 103
    .line 104
    invoke-direct {v5, v1}, Lcom/friday/document/view/viewer/TxtEditActivity$b;-><init>(Lhd/l;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, p0, v5}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Lcom/friday/document/view/viewer/TxtEditActivity;->g0()Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    const-string v1, "ivNoteInfo"

    .line 115
    .line 116
    if-eqz v0, :cond_1

    .line 117
    .line 118
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    check-cast v0, Lcom/friday/document/databinding/ActivityTxtEditBinding;

    .line 123
    .line 124
    iget-object v0, v0, Lcom/friday/document/databinding/ActivityTxtEditBinding;->e:Landroid/widget/ImageView;

    .line 125
    .line 126
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 130
    .line 131
    .line 132
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    new-instance v8, Lcom/friday/document/view/viewer/TxtEditActivity$initData$2;

    .line 141
    .line 142
    const/4 v0, 0x0

    .line 143
    invoke-direct {v8, p0, v0}, Lcom/friday/document/view/viewer/TxtEditActivity$initData$2;-><init>(Lcom/friday/document/view/viewer/TxtEditActivity;Lvc/c;)V

    .line 144
    .line 145
    .line 146
    const/4 v9, 0x2

    .line 147
    const/4 v10, 0x0

    .line 148
    const/4 v7, 0x0

    .line 149
    invoke-static/range {v5 .. v10}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 150
    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_1
    iget-object v0, p0, Lcom/friday/document/view/viewer/TxtEditActivity;->h:Ljava/lang/String;

    .line 154
    .line 155
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-lez v0, :cond_2

    .line 160
    .line 161
    const/4 v0, 0x1

    .line 162
    invoke-virtual {p0, v0}, Lcom/friday/common/base/BaseActivity;->isShowLoading(Z)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0}, Lcom/friday/document/view/viewer/TxtEditActivity;->Z()Lcom/friday/document/viewmodel/TxtEditViewModel;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    iget-object v5, p0, Lcom/friday/document/view/viewer/TxtEditActivity;->h:Ljava/lang/String;

    .line 170
    .line 171
    invoke-virtual {v0, v5}, Lcom/friday/document/viewmodel/TxtEditViewModel;->j(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    :cond_2
    :goto_1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    check-cast v0, Lcom/friday/document/databinding/ActivityTxtEditBinding;

    .line 179
    .line 180
    iget-object v0, v0, Lcom/friday/document/databinding/ActivityTxtEditBinding;->e:Landroid/widget/ImageView;

    .line 181
    .line 182
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0}, Lcom/friday/document/view/viewer/TxtEditActivity;->g0()Z

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    if-eqz v1, :cond_3

    .line 190
    .line 191
    move v2, v4

    .line 192
    :cond_3
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    check-cast v0, Lcom/friday/document/databinding/ActivityTxtEditBinding;

    .line 200
    .line 201
    iget-object v0, v0, Lcom/friday/document/databinding/ActivityTxtEditBinding;->e:Landroid/widget/ImageView;

    .line 202
    .line 203
    new-instance v1, Ly2/m;

    .line 204
    .line 205
    invoke-direct {v1, p0}, Ly2/m;-><init>(Lcom/friday/document/view/viewer/TxtEditActivity;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p0}, Lcom/friday/document/view/viewer/TxtEditActivity;->Z()Lcom/friday/document/viewmodel/TxtEditViewModel;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/TxtEditViewModel;->l()Landroidx/lifecycle/MutableLiveData;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    new-instance v1, Ly2/n;

    .line 220
    .line 221
    invoke-direct {v1, p0}, Ly2/n;-><init>(Lcom/friday/document/view/viewer/TxtEditActivity;)V

    .line 222
    .line 223
    .line 224
    new-instance v2, Lcom/friday/document/view/viewer/TxtEditActivity$b;

    .line 225
    .line 226
    invoke-direct {v2, v1}, Lcom/friday/document/view/viewer/TxtEditActivity$b;-><init>(Lhd/l;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {p0}, Lcom/friday/document/view/viewer/TxtEditActivity;->Z()Lcom/friday/document/viewmodel/TxtEditViewModel;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/TxtEditViewModel;->m()Landroidx/lifecycle/MutableLiveData;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    new-instance v1, Ly2/o;

    .line 241
    .line 242
    invoke-direct {v1, p0}, Ly2/o;-><init>(Lcom/friday/document/view/viewer/TxtEditActivity;)V

    .line 243
    .line 244
    .line 245
    new-instance v2, Lcom/friday/document/view/viewer/TxtEditActivity$b;

    .line 246
    .line 247
    invoke-direct {v2, v1}, Lcom/friday/document/view/viewer/TxtEditActivity$b;-><init>(Lhd/l;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    check-cast v0, Lcom/friday/document/databinding/ActivityTxtEditBinding;

    .line 258
    .line 259
    iget-object v0, v0, Lcom/friday/document/databinding/ActivityTxtEditBinding;->d:Landroid/widget/ImageView;

    .line 260
    .line 261
    new-instance v1, Ly2/p;

    .line 262
    .line 263
    invoke-direct {v1, p0}, Ly2/p;-><init>(Lcom/friday/document/view/viewer/TxtEditActivity;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    check-cast v0, Lcom/friday/document/databinding/ActivityTxtEditBinding;

    .line 274
    .line 275
    iget-object v0, v0, Lcom/friday/document/databinding/ActivityTxtEditBinding;->c:Lcom/zykj/view/widget/LimitEditText;

    .line 276
    .line 277
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {p0, v0}, Lcom/friday/document/view/viewer/TxtEditActivity;->Y(Landroid/widget/EditText;)V

    .line 281
    .line 282
    .line 283
    return-void
.end method

.method public onBackPressed()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v3, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v3, p0, v2}, Lcom/friday/document/view/viewer/TxtEditActivity$onBackPressed$1;-><init>(Lcom/friday/document/view/viewer/TxtEditActivity;Lvc/c;)V

    .line 13
    .line 14
    .line 15
    const/4 v4, 0x2

    .line 16
    const/4 v5, 0x0

    .line 17
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 18
    .line 19
    .line 20
    return-void
.end method
