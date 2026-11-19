.class public final Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;
.super Lcom/zykj/huiwei/launcher/ui/dialog/Hilt_ChangeAvatarDialog;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/huiwei/launcher/ui/dialog/Hilt_ChangeAvatarDialog<",
        "Lcom/zykj/huiwei/launcher/databinding/HwDialogChangeAvatarBinding;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \u001e2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\u0004J\u0019\u0010\u000c\u001a\u00020\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u001b\u0010\u0012\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u000f\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006 "
    }
    d2 = {
        "Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;",
        "Lcom/zykj/huiwei/launcher/base/CommonDialogFragment;",
        "Lcom/zykj/huiwei/launcher/databinding/HwDialogChangeAvatarBinding;",
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
        "Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;",
        "Lkotlin/Lazy;",
        "u",
        "()Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;",
        "viewModel",
        "Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialogArgs;",
        "h",
        "Landroidx/navigation/NavArgsLazy;",
        "s",
        "()Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialogArgs;",
        "args",
        "Lcom/zykj/huiwei/launcher/ui/adapter/AvatarAdapter;",
        "i",
        "t",
        "()Lcom/zykj/huiwei/launcher/ui/adapter/AvatarAdapter;",
        "avatarAdapter",
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
        "SMAP\nChangeAvatarDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeAvatarDialog.kt\ncom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,87:1\n106#2,15:88\n42#3,3:103\n360#4,7:106\n295#4,2:113\n*S KotlinDebug\n*F\n+ 1 ChangeAvatarDialog.kt\ncom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog\n*L\n21#1:88,15\n22#1:103,3\n42#1:106,7\n63#1:113,2\n*E\n"
    }
.end annotation


# static fields
.field public static final j:Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog$a;

.field public static final k:I


# instance fields
.field public final g:Lkotlin/Lazy;

.field public final h:Landroidx/navigation/NavArgsLazy;

.field public final i:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;->j:Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;->k:I

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/Hilt_ChangeAvatarDialog;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog$special$$inlined$viewModels$default$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 10
    .line 11
    new-instance v2, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog$special$$inlined$viewModels$default$2;

    .line 12
    .line 13
    invoke-direct {v2, v0}, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog$special$$inlined$viewModels$default$2;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-class v1, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;

    .line 21
    .line 22
    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog$special$$inlined$viewModels$default$3;

    .line 27
    .line 28
    invoke-direct {v2, v0}, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog$special$$inlined$viewModels$default$3;-><init>(Lkotlin/Lazy;)V

    .line 29
    .line 30
    .line 31
    new-instance v3, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog$special$$inlined$viewModels$default$4;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-direct {v3, v4, v0}, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog$special$$inlined$viewModels$default$4;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/Lazy;)V

    .line 35
    .line 36
    .line 37
    new-instance v4, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog$special$$inlined$viewModels$default$5;

    .line 38
    .line 39
    invoke-direct {v4, p0, v0}, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/Fragment;Lkotlin/Lazy;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p0, v1, v2, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;->g:Lkotlin/Lazy;

    .line 47
    .line 48
    new-instance v0, Landroidx/navigation/NavArgsLazy;

    .line 49
    .line 50
    const-class v1, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialogArgs;

    .line 51
    .line 52
    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    new-instance v2, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog$c;

    .line 57
    .line 58
    invoke-direct {v2, p0}, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog$c;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 59
    .line 60
    .line 61
    invoke-direct {v0, v1, v2}, Landroidx/navigation/NavArgsLazy;-><init>(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)V

    .line 62
    .line 63
    .line 64
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;->h:Landroidx/navigation/NavArgsLazy;

    .line 65
    .line 66
    new-instance v0, Lb4/h;

    .line 67
    .line 68
    invoke-direct {v0}, Lb4/h;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;->i:Lkotlin/Lazy;

    .line 76
    .line 77
    return-void
.end method

.method public static synthetic n(Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;->v(Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V

    return-void
.end method

.method public static synthetic o()Lcom/zykj/huiwei/launcher/ui/adapter/AvatarAdapter;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;->r()Lcom/zykj/huiwei/launcher/ui/adapter/AvatarAdapter;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic p(Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;->w(Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;Lcom/zykj/huiwei/launcher/proto/m;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;->x(Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;Lcom/zykj/huiwei/launcher/proto/m;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final r()Lcom/zykj/huiwei/launcher/ui/adapter/AvatarAdapter;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/huiwei/launcher/ui/adapter/AvatarAdapter;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/huiwei/launcher/ui/adapter/AvatarAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final v(Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 4

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;->t()Lcom/zykj/huiwei/launcher/ui/adapter/AvatarAdapter;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const/4 p2, 0x0

    .line 22
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lcom/zykj/huiwei/launcher/bean/AvatarItem;

    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/bean/AvatarItem;->getId()J

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;->t()Lcom/zykj/huiwei/launcher/ui/adapter/AvatarAdapter;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v2}, Lcom/zykj/huiwei/launcher/ui/adapter/AvatarAdapter;->g()J

    .line 43
    .line 44
    .line 45
    move-result-wide v2

    .line 46
    cmp-long v0, v0, v2

    .line 47
    .line 48
    if-nez v0, :cond_0

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_0
    add-int/lit8 p2, p2, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    const/4 p2, -0x1

    .line 55
    :goto_1
    if-eq p2, p3, :cond_3

    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;->t()Lcom/zykj/huiwei/launcher/ui/adapter/AvatarAdapter;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;->t()Lcom/zykj/huiwei/launcher/ui/adapter/AvatarAdapter;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0, p3}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, Lcom/zykj/huiwei/launcher/bean/AvatarItem;

    .line 70
    .line 71
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/bean/AvatarItem;->getId()J

    .line 72
    .line 73
    .line 74
    move-result-wide v0

    .line 75
    invoke-virtual {p1, v0, v1}, Lcom/zykj/huiwei/launcher/ui/adapter/AvatarAdapter;->h(J)V

    .line 76
    .line 77
    .line 78
    if-ltz p2, :cond_2

    .line 79
    .line 80
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;->t()Lcom/zykj/huiwei/launcher/ui/adapter/AvatarAdapter;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 85
    .line 86
    .line 87
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;->t()Lcom/zykj/huiwei/launcher/ui/adapter/AvatarAdapter;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 92
    .line 93
    .line 94
    :cond_3
    return-void
.end method

.method public static final w(Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;Ljava/util/List;)Lkotlin/Unit;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;->t()Lcom/zykj/huiwei/launcher/ui/adapter/AvatarAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    move-object v3, v2

    .line 23
    check-cast v3, Lcom/zykj/huiwei/launcher/bean/AvatarItem;

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;->s()Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialogArgs;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-virtual {v4}, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialogArgs;->a()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-virtual {v3}, Lcom/zykj/huiwei/launcher/bean/AvatarItem;->getUrl()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 v2, 0x0

    .line 45
    :goto_0
    check-cast v2, Lcom/zykj/huiwei/launcher/bean/AvatarItem;

    .line 46
    .line 47
    if-eqz v2, :cond_2

    .line 48
    .line 49
    invoke-virtual {v2}, Lcom/zykj/huiwei/launcher/bean/AvatarItem;->getId()J

    .line 50
    .line 51
    .line 52
    move-result-wide v1

    .line 53
    goto :goto_1

    .line 54
    :cond_2
    const-wide/16 v1, -0x1

    .line 55
    .line 56
    :goto_1
    invoke-virtual {v0, v1, v2}, Lcom/zykj/huiwei/launcher/ui/adapter/AvatarAdapter;->h(J)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;->t()Lcom/zykj/huiwei/launcher/ui/adapter/AvatarAdapter;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {p0, p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setNewInstance(Ljava/util/List;)V

    .line 64
    .line 65
    .line 66
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 67
    .line 68
    return-object p0
.end method

.method public static final x(Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;Lcom/zykj/huiwei/launcher/proto/m;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 6
    .line 7
    .line 8
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 9
    .line 10
    return-object p0
.end method


# virtual methods
.method public g()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/huiwei/launcher/databinding/HwDialogChangeAvatarBinding;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;->u()Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Lcom/zykj/huiwei/launcher/databinding/HwDialogChangeAvatarBinding;->setVm(Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lcom/zykj/huiwei/launcher/databinding/HwDialogChangeAvatarBinding;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Lcom/zykj/huiwei/launcher/databinding/HwDialogChangeAvatarBinding;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lcom/zykj/huiwei/launcher/databinding/HwDialogChangeAvatarBinding;

    .line 28
    .line 29
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/databinding/HwDialogChangeAvatarBinding;->rvAvatar:Landroidx/recyclerview/widget/RecyclerView;

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;->t()Lcom/zykj/huiwei/launcher/ui/adapter/AvatarAdapter;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    new-instance v1, Lb4/e;

    .line 40
    .line 41
    invoke-direct {v1, p0}, Lb4/e;-><init>(Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setOnItemClickListener(Lcom/chad/library/adapter/base/listener/OnItemClickListener;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Lcom/zykj/huiwei/launcher/databinding/HwDialogChangeAvatarBinding;

    .line 52
    .line 53
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/databinding/HwDialogChangeAvatarBinding;->rvAvatar:Landroidx/recyclerview/widget/RecyclerView;

    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;->t()Lcom/zykj/huiwei/launcher/ui/adapter/AvatarAdapter;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Lcom/zykj/huiwei/launcher/databinding/HwDialogChangeAvatarBinding;

    .line 67
    .line 68
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/databinding/HwDialogChangeAvatarBinding;->rvAvatar:Landroidx/recyclerview/widget/RecyclerView;

    .line 69
    .line 70
    new-instance v1, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog$initView$2;

    .line 71
    .line 72
    invoke-direct {v1, p0}, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog$initView$2;-><init>(Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;->u()Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;->c()Landroidx/lifecycle/MutableLiveData;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    new-instance v2, Lb4/f;

    .line 91
    .line 92
    invoke-direct {v2, p0}, Lb4/f;-><init>(Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;)V

    .line 93
    .line 94
    .line 95
    new-instance v3, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog$b;

    .line 96
    .line 97
    invoke-direct {v3, v2}, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;->u()Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;->d()Landroidx/lifecycle/MutableLiveData;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    new-instance v2, Lb4/g;

    .line 116
    .line 117
    invoke-direct {v2, p0}, Lb4/g;-><init>(Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;)V

    .line 118
    .line 119
    .line 120
    new-instance v3, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog$b;

    .line 121
    .line 122
    invoke-direct {v3, v2}, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;->u()Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;->b()V

    .line 133
    .line 134
    .line 135
    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0c003e

    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

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
    const v1, 0x7f0901a9

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
    const v0, 0x7f09035e

    .line 44
    .line 45
    .line 46
    if-ne p1, v0, :cond_5

    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;->t()Lcom/zykj/huiwei/launcher/ui/adapter/AvatarAdapter;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/ui/adapter/AvatarAdapter;->g()J

    .line 53
    .line 54
    .line 55
    move-result-wide v0

    .line 56
    const-wide/16 v2, -0x1

    .line 57
    .line 58
    cmp-long p1, v0, v2

    .line 59
    .line 60
    if-nez p1, :cond_4

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_4
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;->u()Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;->t()Lcom/zykj/huiwei/launcher/ui/adapter/AvatarAdapter;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/ui/adapter/AvatarAdapter;->g()J

    .line 72
    .line 73
    .line 74
    move-result-wide v0

    .line 75
    invoke-virtual {p1, v0, v1}, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;->f(J)V

    .line 76
    .line 77
    .line 78
    :cond_5
    :goto_2
    return-void
.end method

.method public final s()Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialogArgs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;->h:Landroidx/navigation/NavArgsLazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialogArgs;

    .line 8
    .line 9
    return-object v0
.end method

.method public final t()Lcom/zykj/huiwei/launcher/ui/adapter/AvatarAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;->i:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/huiwei/launcher/ui/adapter/AvatarAdapter;

    .line 8
    .line 9
    return-object v0
.end method

.method public final u()Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;->g:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;

    .line 8
    .line 9
    return-object v0
.end method
