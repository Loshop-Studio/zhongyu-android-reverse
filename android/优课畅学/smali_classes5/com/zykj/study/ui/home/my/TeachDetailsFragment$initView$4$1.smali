.class public final Lcom/zykj/study/ui/home/my/TeachDetailsFragment$initView$4$1;
.super Landroidx/viewpager2/adapter/FragmentStateAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/my/TeachDetailsFragment;->initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/my/TeachDetailsFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/viewpager2/adapter/FragmentStateAdapter;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public createFragment(I)Landroidx/fragment/app/Fragment;
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    new-instance p1, Lcom/zykj/study/ui/home/my/CourseViewFragment;

    .line 4
    .line 5
    invoke-direct {p1}, Lcom/zykj/study/ui/home/my/CourseViewFragment;-><init>()V

    .line 6
    .line 7
    .line 8
    return-object p1

    .line 9
    :cond_0
    new-instance p1, Lcom/zykj/study/ui/home/my/StudentViewFragment;

    .line 10
    .line 11
    invoke-direct {p1}, Lcom/zykj/study/ui/home/my/StudentViewFragment;-><init>()V

    .line 12
    .line 13
    .line 14
    return-object p1
.end method

.method public getItemCount()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method
