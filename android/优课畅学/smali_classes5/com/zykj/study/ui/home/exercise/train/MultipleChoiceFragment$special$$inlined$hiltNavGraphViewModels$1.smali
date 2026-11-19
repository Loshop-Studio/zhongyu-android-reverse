.class public final Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment$special$$inlined$hiltNavGraphViewModels$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment;-><init>()V
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

.field public final synthetic b:I


# direct methods
.method public constructor <init>(Landroidx/fragment/app/Fragment;I)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment$special$$inlined$hiltNavGraphViewModels$1;->a:Landroidx/fragment/app/Fragment;

    iput p2, p0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment$special$$inlined$hiltNavGraphViewModels$1;->b:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Landroidx/navigation/NavBackStackEntry;
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment$special$$inlined$hiltNavGraphViewModels$1;->a:Landroidx/fragment/app/Fragment;

    invoke-static {v0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    move-result-object v0

    iget v1, p0, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment$special$$inlined$hiltNavGraphViewModels$1;->b:I

    invoke-virtual {v0, v1}, Landroidx/navigation/NavController;->getBackStackEntry(I)Landroidx/navigation/NavBackStackEntry;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment$special$$inlined$hiltNavGraphViewModels$1;->invoke()Landroidx/navigation/NavBackStackEntry;

    move-result-object v0

    return-object v0
.end method
