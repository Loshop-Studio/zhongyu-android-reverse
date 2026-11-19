.class final Landroidx/compose/ui/viewinterop/AndroidViewBindingKt$AndroidViewBinding$7$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/AndroidViewBindingKt;->AndroidViewBinding(Lhd/q;Landroidx/compose/ui/Modifier;Lhd/l;Lhd/l;Lhd/l;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/l;"
    }
.end annotation


# instance fields
.field final synthetic $localContext:Landroid/content/Context;

.field final synthetic $onRelease:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field final synthetic $parentFragment:Landroidx/fragment/app/Fragment;


# direct methods
.method public constructor <init>(Lhd/l;Landroidx/fragment/app/Fragment;Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            "Landroidx/fragment/app/Fragment;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewBindingKt$AndroidViewBinding$7$1;->$onRelease:Lhd/l;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/viewinterop/AndroidViewBindingKt$AndroidViewBinding$7$1;->$parentFragment:Landroidx/fragment/app/Fragment;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/ui/viewinterop/AndroidViewBindingKt$AndroidViewBinding$7$1;->$localContext:Landroid/content/Context;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/AndroidViewBindingKt$AndroidViewBinding$7$1;->invoke(Landroid/view/View;)V

    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method

.method public final invoke(Landroid/view/View;)V
    .locals 3

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewBindingKt$AndroidViewBinding$7$1;->$onRelease:Lhd/l;

    invoke-static {p1}, Landroidx/compose/ui/viewinterop/AndroidViewBindingKt;->access$getBinding(Landroid/view/View;)Landroidx/viewbinding/ViewBinding;

    move-result-object v1

    invoke-interface {v0, v1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    instance-of v0, p1, Landroid/view/ViewGroup;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Landroid/view/ViewGroup;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_5

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewBindingKt$AndroidViewBinding$7$1;->$parentFragment:Landroidx/fragment/app/Fragment;

    iget-object v2, p0, Landroidx/compose/ui/viewinterop/AndroidViewBindingKt$AndroidViewBinding$7$1;->$localContext:Landroid/content/Context;

    if-eqz v0, :cond_2

    .line 4
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object v1, v0

    goto :goto_3

    .line 5
    :cond_2
    :goto_1
    instance-of v0, v2, Landroidx/fragment/app/FragmentActivity;

    if-eqz v0, :cond_3

    check-cast v2, Landroidx/fragment/app/FragmentActivity;

    goto :goto_2

    :cond_3
    move-object v2, v1

    :goto_2
    if-eqz v2, :cond_4

    invoke-virtual {v2}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    .line 6
    :cond_4
    :goto_3
    new-instance v0, Landroidx/compose/ui/viewinterop/AndroidViewBindingKt$AndroidViewBinding$7$1$1$1;

    invoke-direct {v0, v1}, Landroidx/compose/ui/viewinterop/AndroidViewBindingKt$AndroidViewBinding$7$1$1$1;-><init>(Landroidx/fragment/app/FragmentManager;)V

    invoke-static {p1, v0}, Landroidx/compose/ui/viewinterop/AndroidViewBindingKt;->access$forEachFragmentContainerView(Landroid/view/ViewGroup;Lhd/l;)V

    :cond_5
    return-void
.end method
