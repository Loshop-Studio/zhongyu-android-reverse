.class public abstract Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment;
.super Lcom/zykj/huiwei/launcher/ui/fragment/applist/Hilt_BaseAppFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/huiwei/launcher/ui/fragment/applist/Hilt_BaseAppFragment<",
        "Lcom/zykj/huiwei/launcher/databinding/HwFragmentAppBinding;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\'\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001a\u0010\u0008\u001a\u00020\u00072\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0094@\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u001b\u0010\u0012\u001a\u00020\r8DX\u0084\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment;",
        "Lcom/zykj/base/BaseFragment;",
        "Lcom/zykj/huiwei/launcher/databinding/HwFragmentAppBinding;",
        "<init>",
        "()V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "initView",
        "(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "layoutId",
        "()I",
        "Lcom/zykj/huiwei/launcher/ui/adapter/AppListAdapter;",
        "f",
        "Lkotlin/Lazy;",
        "m",
        "()Lcom/zykj/huiwei/launcher/ui/adapter/AppListAdapter;",
        "adapter",
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


# instance fields
.field public final f:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/Hilt_BaseAppFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lg4/a;

    .line 5
    .line 6
    invoke-direct {v0}, Lg4/a;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment;->f:Lkotlin/Lazy;

    .line 14
    .line 15
    return-void
.end method

.method public static synthetic j(Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment;->n(Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V

    return-void
.end method

.method public static synthetic k()Lcom/zykj/huiwei/launcher/ui/adapter/AppListAdapter;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment;->l()Lcom/zykj/huiwei/launcher/ui/adapter/AppListAdapter;

    move-result-object v0

    return-object v0
.end method

.method public static final l()Lcom/zykj/huiwei/launcher/ui/adapter/AppListAdapter;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/huiwei/launcher/ui/adapter/AppListAdapter;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/huiwei/launcher/ui/adapter/AppListAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final n(Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 1

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
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment;->m()Lcom/zykj/huiwei/launcher/ui/adapter/AppListAdapter;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1, p3}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lcom/zykj/huiwei/launcher/bean/resp/AppData;

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/bean/resp/AppData;->getAppInfo()Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;->getPackageName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const-string p2, "com.android.launcher3"

    .line 28
    .line 29
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    const/4 p2, 0x2

    .line 34
    const/4 v0, 0x0

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    sget-object p1, Li4/g;->a:Li4/g$a;

    .line 38
    .line 39
    invoke-virtual {p1}, Li4/g$a;->g()Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_0

    .line 44
    .line 45
    new-instance p1, Landroid/content/Intent;

    .line 46
    .line 47
    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment;->m()Lcom/zykj/huiwei/launcher/ui/adapter/AppListAdapter;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-virtual {p2, p3}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    check-cast p2, Lcom/zykj/huiwei/launcher/bean/resp/AppData;

    .line 59
    .line 60
    invoke-virtual {p2}, Lcom/zykj/huiwei/launcher/bean/resp/AppData;->getAppInfo()Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-virtual {p2}, Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;->getPackageName()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment;->m()Lcom/zykj/huiwei/launcher/ui/adapter/AppListAdapter;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0, p3}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p3

    .line 76
    check-cast p3, Lcom/zykj/huiwei/launcher/bean/resp/AppData;

    .line 77
    .line 78
    invoke-virtual {p3}, Lcom/zykj/huiwei/launcher/bean/resp/AppData;->getAppInfo()Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;

    .line 79
    .line 80
    .line 81
    move-result-object p3

    .line 82
    invoke-virtual {p3}, Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;->getActivityName()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p3

    .line 86
    invoke-virtual {p1, p2, p3}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment;->m()Lcom/zykj/huiwei/launcher/ui/adapter/AppListAdapter;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p1, p3}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    check-cast p1, Lcom/zykj/huiwei/launcher/bean/resp/AppData;

    .line 102
    .line 103
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/bean/resp/AppData;->getAppInfo()Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;->getPackageName()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-static {p0, p1, v0, p2, v0}, Lcom/zykj/huiwei/launcher/ext/CommonExtKt;->f(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment;->m()Lcom/zykj/huiwei/launcher/ui/adapter/AppListAdapter;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-virtual {p1, p3}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    check-cast p1, Lcom/zykj/huiwei/launcher/bean/resp/AppData;

    .line 124
    .line 125
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/bean/resp/AppData;->getAppInfo()Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;->getPackageName()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-static {p0, p1, v0, p2, v0}, Lcom/zykj/huiwei/launcher/ext/CommonExtKt;->f(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    :goto_0
    sget-object p1, Li4/g;->a:Li4/g$a;

    .line 137
    .line 138
    invoke-virtual {p1}, Li4/g$a;->g()Z

    .line 139
    .line 140
    .line 141
    move-result p2

    .line 142
    if-eqz p2, :cond_2

    .line 143
    .line 144
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    const-string p2, "requireActivity(...)"

    .line 149
    .line 150
    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1, p0}, Li4/g$a;->e(Landroid/app/Activity;)V

    .line 154
    .line 155
    .line 156
    :cond_2
    return-void
.end method

.method public static synthetic o(Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment;Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentAppBinding;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentAppBinding;->rvList:Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    new-instance p2, Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment$initView$2;

    .line 10
    .line 11
    invoke-direct {p2, p0}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment$initView$2;-><init>(Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment;->m()Lcom/zykj/huiwei/launcher/ui/adapter/AppListAdapter;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    new-instance p2, Lg4/b;

    .line 22
    .line 23
    invoke-direct {p2, p0}, Lg4/b;-><init>(Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setOnItemClickListener(Lcom/chad/library/adapter/base/listener/OnItemClickListener;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentAppBinding;

    .line 34
    .line 35
    iget-object p1, p1, Lcom/zykj/huiwei/launcher/databinding/HwFragmentAppBinding;->rvList:Landroidx/recyclerview/widget/RecyclerView;

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment;->m()Lcom/zykj/huiwei/launcher/ui/adapter/AppListAdapter;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment;->m()Lcom/zykj/huiwei/launcher/ui/adapter/AppListAdapter;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getDraggableModule()Lcom/chad/library/adapter/base/module/BaseDraggableModule;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    const/4 p2, 0x1

    .line 53
    invoke-virtual {p1, p2}, Lcom/chad/library/adapter/base/module/BaseDraggableModule;->setDragEnabled(Z)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment;->m()Lcom/zykj/huiwei/launcher/ui/adapter/AppListAdapter;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getDraggableModule()Lcom/chad/library/adapter/base/module/BaseDraggableModule;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    new-instance p2, Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment$a;

    .line 65
    .line 66
    invoke-direct {p2, p0}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment$a;-><init>(Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, p2}, Lcom/chad/library/adapter/base/module/BaseDraggableModule;->setOnItemDragListener(Lcom/chad/library/adapter/base/listener/OnItemDragListener;)V

    .line 70
    .line 71
    .line 72
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 73
    .line 74
    return-object p0
.end method


# virtual methods
.method public initView(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment;->o(Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment;Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0c0044

    return v0
.end method

.method public final m()Lcom/zykj/huiwei/launcher/ui/adapter/AppListAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment;->f:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/huiwei/launcher/ui/adapter/AppListAdapter;

    .line 8
    .line 9
    return-object v0
.end method
