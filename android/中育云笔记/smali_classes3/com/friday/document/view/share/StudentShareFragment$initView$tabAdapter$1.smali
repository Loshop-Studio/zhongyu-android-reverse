.class public final Lcom/friday/document/view/share/StudentShareFragment$initView$tabAdapter$1;
.super Landroidx/viewpager2/adapter/FragmentStateAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/share/StudentShareFragment;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/friday/document/view/share/StudentShareFragment;


# direct methods
.method public constructor <init>(Lcom/friday/document/view/share/StudentShareFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/share/StudentShareFragment$initView$tabAdapter$1;->a:Lcom/friday/document/view/share/StudentShareFragment;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroidx/viewpager2/adapter/FragmentStateAdapter;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public createFragment(I)Landroidx/fragment/app/Fragment;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/share/StudentShareFragment$initView$tabAdapter$1;->a:Lcom/friday/document/view/share/StudentShareFragment;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/friday/document/view/share/StudentShareFragment;->v(Lcom/friday/document/view/share/StudentShareFragment;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0, p1}, Lrc/g0;->p0(Ljava/util/List;I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Landroidx/fragment/app/Fragment;

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, Lcom/friday/document/view/share/StudentShareFragment$initView$tabAdapter$1;->a:Lcom/friday/document/view/share/StudentShareFragment;

    .line 16
    .line 17
    invoke-static {p1}, Lcom/friday/document/view/share/StudentShareFragment;->v(Lcom/friday/document/view/share/StudentShareFragment;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {p1}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Landroidx/fragment/app/Fragment;

    .line 26
    .line 27
    :cond_0
    return-object p1
.end method

.method public getItemCount()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method
