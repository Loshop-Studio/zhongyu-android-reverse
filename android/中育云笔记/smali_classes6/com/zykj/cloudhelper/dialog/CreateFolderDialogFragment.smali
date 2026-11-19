.class public final Lcom/zykj/cloudhelper/dialog/CreateFolderDialogFragment;
.super Lcom/zykj/cloudhelper/dialog/Hilt_CreateFolderDialogFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/cloudhelper/dialog/Hilt_CreateFolderDialogFragment<",
        "Lcom/zykj/cloudhelper/databinding/NoteHelperCreateFolderBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final k:Lqc/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/zykj/cloudhelper/dialog/Hilt_CreateFolderDialogFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 5
    .line 6
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lcom/zykj/cloudhelper/dialog/CreateFolderDialogFragment$special$$inlined$activityViewModels$default$1;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lcom/zykj/cloudhelper/dialog/CreateFolderDialogFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/zykj/cloudhelper/dialog/CreateFolderDialogFragment$special$$inlined$activityViewModels$default$2;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v3, p0}, Lcom/zykj/cloudhelper/dialog/CreateFolderDialogFragment$special$$inlined$activityViewModels$default$2;-><init>(Lhd/a;Landroidx/fragment/app/Fragment;)V

    .line 19
    .line 20
    .line 21
    new-instance v3, Lcom/zykj/cloudhelper/dialog/CreateFolderDialogFragment$special$$inlined$activityViewModels$default$3;

    .line 22
    .line 23
    invoke-direct {v3, p0}, Lcom/zykj/cloudhelper/dialog/CreateFolderDialogFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lod/c;Lhd/a;Lhd/a;Lhd/a;)Lqc/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lcom/zykj/cloudhelper/dialog/CreateFolderDialogFragment;->k:Lqc/d;

    .line 31
    .line 32
    return-void
.end method

.method public static synthetic r(Lcom/zykj/cloudhelper/dialog/CreateFolderDialogFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/cloudhelper/dialog/CreateFolderDialogFragment;->u(Lcom/zykj/cloudhelper/dialog/CreateFolderDialogFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic s(Lcom/zykj/cloudhelper/dialog/CreateFolderDialogFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/cloudhelper/dialog/CreateFolderDialogFragment;->v(Lcom/zykj/cloudhelper/dialog/CreateFolderDialogFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final u(Lcom/zykj/cloudhelper/dialog/CreateFolderDialogFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->dismissAllowingStateLoss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final v(Lcom/zykj/cloudhelper/dialog/CreateFolderDialogFragment;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/cloudhelper/databinding/NoteHelperCreateFolderBinding;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/zykj/cloudhelper/databinding/NoteHelperCreateFolderBinding;->c:Lcom/zykj/view/widget/LimitEditText;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, Lqd/c0;->e1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    :cond_0
    const-string p1, ""

    .line 28
    .line 29
    :cond_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    const-string p0, "\u6587\u4ef6\u540d\u4e0d\u80fd\u4e3a\u7a7a"

    .line 36
    .line 37
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    new-instance v0, Lkotlin/text/Regex;

    .line 42
    .line 43
    const-string v1, "^([\\u4e00-\\u9fa5a-zA-Z0-9\"\\s\\.\\/\\\u201c\\\u201d\\_\\\uff08\\\uff09\\(\\)\\\u3010\\\u3011])+$"

    .line 44
    .line 45
    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, p1}, Lkotlin/text/Regex;->g(Ljava/lang/CharSequence;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_3

    .line 53
    .line 54
    sget p0, Lcom/friday/common/R$string;->name_content_rule:I

    .line 55
    .line 56
    invoke-static {p0}, Lz1/b;->h(I)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/cloudhelper/dialog/CreateFolderDialogFragment;->t()Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->p()Landroidx/lifecycle/MutableLiveData;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->dismissAllowingStateLoss()V

    .line 72
    .line 73
    .line 74
    return-void
.end method


# virtual methods
.method public getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/cloudhelper/R$layout;->note_helper_create_folder:I

    .line 2
    .line 3
    return v0
.end method

.method public initData()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/cloudhelper/databinding/NoteHelperCreateFolderBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/cloudhelper/databinding/NoteHelperCreateFolderBinding;->e:Landroid/widget/TextView;

    .line 8
    .line 9
    new-instance v1, Lta/a;

    .line 10
    .line 11
    invoke-direct {v1, p0}, Lta/a;-><init>(Lcom/zykj/cloudhelper/dialog/CreateFolderDialogFragment;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lcom/zykj/cloudhelper/databinding/NoteHelperCreateFolderBinding;

    .line 22
    .line 23
    iget-object v0, v0, Lcom/zykj/cloudhelper/databinding/NoteHelperCreateFolderBinding;->f:Landroid/widget/TextView;

    .line 24
    .line 25
    new-instance v1, Lta/b;

    .line 26
    .line 27
    invoke-direct {v1, p0}, Lta/b;-><init>(Lcom/zykj/cloudhelper/dialog/CreateFolderDialogFragment;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lcom/blankj/utilcode/util/KeyboardUtils;->hideSoftInput(Landroid/view/Window;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final t()Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/cloudhelper/dialog/CreateFolderDialogFragment;->k:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    .line 8
    .line 9
    return-object v0
.end method
