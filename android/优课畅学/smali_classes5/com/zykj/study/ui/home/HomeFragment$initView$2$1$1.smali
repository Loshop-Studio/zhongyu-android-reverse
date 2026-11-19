.class public final Lcom/zykj/study/ui/home/HomeFragment$initView$2$1$1;
.super Landroidx/viewpager2/adapter/FragmentStateAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/HomeFragment$initView$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method public constructor <init>(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/Lifecycle;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/viewpager2/adapter/FragmentStateAdapter;-><init>(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/Lifecycle;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public createFragment(I)Landroidx/fragment/app/Fragment;
    .locals 1

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p1, v0, :cond_0

    .line 8
    .line 9
    new-instance p1, Lcom/zykj/study/ui/home/my/MyFragment;

    .line 10
    .line 11
    invoke-direct {p1}, Lcom/zykj/study/ui/home/my/MyFragment;-><init>()V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    new-instance p1, Lcom/zykj/study/ui/home/message/MessageFragment;

    .line 16
    .line 17
    invoke-direct {p1}, Lcom/zykj/study/ui/home/message/MessageFragment;-><init>()V

    .line 18
    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_1
    new-instance p1, Lcom/zykj/study/ui/home/study/StudyFragment;

    .line 22
    .line 23
    invoke-direct {p1}, Lcom/zykj/study/ui/home/study/StudyFragment;-><init>()V

    .line 24
    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_2
    new-instance p1, Lcom/zykj/study/ui/home/find/FindFragment;

    .line 28
    .line 29
    invoke-direct {p1}, Lcom/zykj/study/ui/home/find/FindFragment;-><init>()V

    .line 30
    .line 31
    .line 32
    return-object p1
.end method

.method public getItemCount()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method
