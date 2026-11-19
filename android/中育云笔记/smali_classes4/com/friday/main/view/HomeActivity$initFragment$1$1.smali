.class public final Lcom/friday/main/view/HomeActivity$initFragment$1$1;
.super Landroidx/viewpager2/adapter/FragmentStateAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/main/view/HomeActivity;->initFragment()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/friday/main/view/HomeActivity;


# direct methods
.method public constructor <init>(Lcom/friday/main/view/HomeActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/main/view/HomeActivity$initFragment$1$1;->a:Lcom/friday/main/view/HomeActivity;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroidx/viewpager2/adapter/FragmentStateAdapter;-><init>(Landroidx/fragment/app/FragmentActivity;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public createFragment(I)Landroidx/fragment/app/Fragment;
    .locals 2

    .line 1
    const-string v0, "null cannot be cast to non-null type androidx.fragment.app.Fragment"

    .line 2
    .line 3
    if-eqz p1, :cond_3

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eq p1, v1, :cond_2

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    if-eq p1, v1, :cond_1

    .line 10
    .line 11
    const/4 v1, 0x3

    .line 12
    if-eq p1, v1, :cond_0

    .line 13
    .line 14
    iget-object p1, p0, Lcom/friday/main/view/HomeActivity$initFragment$1$1;->a:Lcom/friday/main/view/HomeActivity;

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/friday/main/view/HomeActivity;->z0()Lj2/j;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    check-cast p1, Landroidx/fragment/app/Fragment;

    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_0
    iget-object p1, p0, Lcom/friday/main/view/HomeActivity$initFragment$1$1;->a:Lcom/friday/main/view/HomeActivity;

    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/friday/main/view/HomeActivity;->u0()Lj2/h;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    check-cast p1, Landroidx/fragment/app/Fragment;

    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_1
    iget-object p1, p0, Lcom/friday/main/view/HomeActivity$initFragment$1$1;->a:Lcom/friday/main/view/HomeActivity;

    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/friday/main/view/HomeActivity;->v0()Lj2/i;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    check-cast p1, Landroidx/fragment/app/Fragment;

    .line 48
    .line 49
    return-object p1

    .line 50
    :cond_2
    iget-object p1, p0, Lcom/friday/main/view/HomeActivity$initFragment$1$1;->a:Lcom/friday/main/view/HomeActivity;

    .line 51
    .line 52
    invoke-virtual {p1}, Lcom/friday/main/view/HomeActivity;->r0()Lj2/f;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    check-cast p1, Landroidx/fragment/app/Fragment;

    .line 60
    .line 61
    return-object p1

    .line 62
    :cond_3
    iget-object p1, p0, Lcom/friday/main/view/HomeActivity$initFragment$1$1;->a:Lcom/friday/main/view/HomeActivity;

    .line 63
    .line 64
    invoke-virtual {p1}, Lcom/friday/main/view/HomeActivity;->q0()Lj2/c;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    check-cast p1, Landroidx/fragment/app/Fragment;

    .line 72
    .line 73
    return-object p1
.end method

.method public getItemCount()I
    .locals 1

    const/4 v0, 0x5

    return v0
.end method
