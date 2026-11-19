.class public final synthetic Lx4/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx4/b0;->a:Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lx4/b0;->a:Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment;

    invoke-static {v0}, Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment;->g(Lcom/zykj/study/ui/home/exercise/train/MultipleChoiceFragment;)Landroidx/lifecycle/ViewModelStoreOwner;

    move-result-object v0

    return-object v0
.end method
