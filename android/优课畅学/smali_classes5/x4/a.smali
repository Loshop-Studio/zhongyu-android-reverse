.class public final synthetic Lx4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx4/a;->a:Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lx4/a;->a:Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment;

    invoke-static {v0}, Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment;->h(Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment;)Landroidx/lifecycle/ViewModelStoreOwner;

    move-result-object v0

    return-object v0
.end method
