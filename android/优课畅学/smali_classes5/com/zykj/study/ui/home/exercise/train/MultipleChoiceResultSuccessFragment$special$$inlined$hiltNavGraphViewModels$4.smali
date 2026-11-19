.class public final Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$special$$inlined$hiltNavGraphViewModels$4;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lx7/a;"
    }
.end annotation


# instance fields
.field public final synthetic a:Landroidx/fragment/app/Fragment;

.field public final synthetic b:Lh7/d;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/Fragment;Lh7/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$special$$inlined$hiltNavGraphViewModels$4;->a:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$special$$inlined$hiltNavGraphViewModels$4;->b:Lh7/d;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke()Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$special$$inlined$hiltNavGraphViewModels$4;->a:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    const-string v1, "requireActivity()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$special$$inlined$hiltNavGraphViewModels$4;->b:Lh7/d;

    invoke-static {v1}, Landroidx/hilt/navigation/fragment/HiltNavGraphViewModelLazyKt;->access$hiltNavGraphViewModels$lambda-0(Lh7/d;)Landroidx/navigation/NavBackStackEntry;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/navigation/NavBackStackEntry;->getDefaultViewModelProviderFactory()Landroidx/lifecycle/ViewModelProvider$Factory;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/hilt/navigation/HiltViewModelFactory;->create(Landroid/content/Context;Landroidx/lifecycle/ViewModelProvider$Factory;)Landroidx/lifecycle/ViewModelProvider$Factory;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceResultSuccessFragment$special$$inlined$hiltNavGraphViewModels$4;->invoke()Landroidx/lifecycle/ViewModelProvider$Factory;

    move-result-object v0

    return-object v0
.end method
