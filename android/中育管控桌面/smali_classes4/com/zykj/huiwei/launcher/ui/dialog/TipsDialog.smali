.class public final Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog;
.super Lcom/zykj/huiwei/launcher/ui/dialog/Hilt_TipsDialog;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/huiwei/launcher/ui/dialog/Hilt_TipsDialog<",
        "Lcom/zykj/huiwei/launcher/databinding/HwDialogTipsBinding;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000  2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\u0004J\u0019\u0010\u000c\u001a\u00020\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u0004R\u001b\u0010\u0013\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R#\u0010\u001f\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001a8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u0016\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\""
    }
    d2 = {
        "Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog;",
        "Lcom/zykj/huiwei/launcher/base/CommonDialogFragment;",
        "Lcom/zykj/huiwei/launcher/databinding/HwDialogTipsBinding;",
        "<init>",
        "()V",
        "",
        "layoutId",
        "()I",
        "",
        "g",
        "Landroid/view/View;",
        "v",
        "onClick",
        "(Landroid/view/View;)V",
        "onDestroy",
        "Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialogArgs;",
        "Landroidx/navigation/NavArgsLazy;",
        "o",
        "()Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialogArgs;",
        "args",
        "Lcom/zykj/huiwei/launcher/viewmodels/TipsViewModel;",
        "h",
        "Lkotlin/Lazy;",
        "q",
        "()Lcom/zykj/huiwei/launcher/viewmodels/TipsViewModel;",
        "viewModel",
        "Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;",
        "kotlin.jvm.PlatformType",
        "i",
        "p",
        "()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;",
        "loadingDialog",
        "j",
        "a",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTipsDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TipsDialog.kt\ncom/zykj/huiwei/launcher/ui/dialog/TipsDialog\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,75:1\n42#2,3:76\n106#3,15:79\n*S KotlinDebug\n*F\n+ 1 TipsDialog.kt\ncom/zykj/huiwei/launcher/ui/dialog/TipsDialog\n*L\n19#1:76,3\n20#1:79,15\n*E\n"
    }
.end annotation


# static fields
.field public static final j:Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog$a;

.field public static final k:I


# instance fields
.field public final g:Landroidx/navigation/NavArgsLazy;

.field public final h:Lkotlin/Lazy;

.field public final i:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog;->j:Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog;->k:I

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/Hilt_TipsDialog;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/navigation/NavArgsLazy;

    .line 5
    .line 6
    const-class v1, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialogArgs;

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog$b;

    .line 13
    .line 14
    invoke-direct {v2, p0}, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog$b;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Landroidx/navigation/NavArgsLazy;-><init>(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog;->g:Landroidx/navigation/NavArgsLazy;

    .line 21
    .line 22
    new-instance v0, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog$special$$inlined$viewModels$default$1;

    .line 23
    .line 24
    invoke-direct {v0, p0}, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 25
    .line 26
    .line 27
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 28
    .line 29
    new-instance v2, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog$special$$inlined$viewModels$default$2;

    .line 30
    .line 31
    invoke-direct {v2, v0}, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog$special$$inlined$viewModels$default$2;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v2}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-class v1, Lcom/zykj/huiwei/launcher/viewmodels/TipsViewModel;

    .line 39
    .line 40
    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    new-instance v2, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog$special$$inlined$viewModels$default$3;

    .line 45
    .line 46
    invoke-direct {v2, v0}, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog$special$$inlined$viewModels$default$3;-><init>(Lkotlin/Lazy;)V

    .line 47
    .line 48
    .line 49
    new-instance v3, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog$special$$inlined$viewModels$default$4;

    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    invoke-direct {v3, v4, v0}, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog$special$$inlined$viewModels$default$4;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/Lazy;)V

    .line 53
    .line 54
    .line 55
    new-instance v4, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog$special$$inlined$viewModels$default$5;

    .line 56
    .line 57
    invoke-direct {v4, p0, v0}, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/Fragment;Lkotlin/Lazy;)V

    .line 58
    .line 59
    .line 60
    invoke-static {p0, v1, v2, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog;->h:Lkotlin/Lazy;

    .line 65
    .line 66
    new-instance v0, Lb4/r;

    .line 67
    .line 68
    invoke-direct {v0, p0}, Lb4/r;-><init>(Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog;)V

    .line 69
    .line 70
    .line 71
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog;->i:Lkotlin/Lazy;

    .line 76
    .line 77
    return-void
.end method

.method public static synthetic n(Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog;->r(Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    move-result-object p0

    return-object p0
.end method

.method public static final r(Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;
    .locals 3

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->g()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const v2, 0x7f11005e

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->n(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const v1, 0x7f1100a8

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {v0, p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->d(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    const/4 v0, 0x1

    .line 45
    const/4 v1, 0x0

    .line 46
    invoke-virtual {p0, v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->i(ZI)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->k(Z)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->a()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method


# virtual methods
.method public g()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog;->o()Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialogArgs;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialogArgs;->b()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0, v0}, Landroidx/fragment/app/DialogFragment;->setCancelable(Z)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog;->o()Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialogArgs;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialogArgs;->b()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog;->o()Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialogArgs;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialogArgs;->c()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog;->q()Lcom/zykj/huiwei/launcher/viewmodels/TipsViewModel;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/TipsViewModel;->d()Landroidx/lifecycle/MutableLiveData;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog;->o()Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialogArgs;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v1}, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialogArgs;->f()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog;->q()Lcom/zykj/huiwei/launcher/viewmodels/TipsViewModel;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/TipsViewModel;->c()Landroidx/lifecycle/MutableLiveData;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog;->o()Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialogArgs;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v1}, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialogArgs;->e()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog;->q()Lcom/zykj/huiwei/launcher/viewmodels/TipsViewModel;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/TipsViewModel;->a()Landroidx/lifecycle/MutableLiveData;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog;->o()Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialogArgs;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {v1}, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialogArgs;->a()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog;->q()Lcom/zykj/huiwei/launcher/viewmodels/TipsViewModel;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/TipsViewModel;->b()Landroidx/lifecycle/MutableLiveData;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog;->o()Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialogArgs;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-virtual {v1}, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialogArgs;->d()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    check-cast v0, Lcom/zykj/huiwei/launcher/databinding/HwDialogTipsBinding;

    .line 125
    .line 126
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog;->q()Lcom/zykj/huiwei/launcher/viewmodels/TipsViewModel;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-virtual {v0, v1}, Lcom/zykj/huiwei/launcher/databinding/HwDialogTipsBinding;->setVm(Lcom/zykj/huiwei/launcher/viewmodels/TipsViewModel;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    check-cast v0, Lcom/zykj/huiwei/launcher/databinding/HwDialogTipsBinding;

    .line 138
    .line 139
    invoke-virtual {v0, p0}, Lcom/zykj/huiwei/launcher/databinding/HwDialogTipsBinding;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 140
    .line 141
    .line 142
    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0c0042

    return v0
.end method

.method public final o()Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialogArgs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog;->g:Landroidx/navigation/NavArgsLazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialogArgs;

    .line 8
    .line 9
    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/zykj/huiwei/launcher/base/CommonDialogFragment;->onClick(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    :goto_0
    if-nez p1, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const v1, 0x7f090352

    .line 24
    .line 25
    .line 26
    if-ne v0, v1, :cond_2

    .line 27
    .line 28
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_2
    :goto_1
    if-nez p1, :cond_3

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    const v0, 0x7f090354

    .line 44
    .line 45
    .line 46
    if-ne p1, v0, :cond_4

    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog;->p()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->show()V

    .line 53
    .line 54
    .line 55
    const-string p1, "TipsDialogRequestKey"

    .line 56
    .line 57
    invoke-static {}, Landroidx/core/os/BundleKt;->bundleOf()Landroid/os/Bundle;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {p0, p1, v0}, Landroidx/fragment/app/FragmentKt;->setFragmentResult(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 62
    .line 63
    .line 64
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p1}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 69
    .line 70
    .line 71
    :cond_4
    :goto_2
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog;->p()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->dismiss()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final p()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog;->i:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 8
    .line 9
    return-object v0
.end method

.method public final q()Lcom/zykj/huiwei/launcher/viewmodels/TipsViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/dialog/TipsDialog;->h:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/huiwei/launcher/viewmodels/TipsViewModel;

    .line 8
    .line 9
    return-object v0
.end method
