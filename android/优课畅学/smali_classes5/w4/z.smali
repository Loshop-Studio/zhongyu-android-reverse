.class public final synthetic Lw4/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw4/z;->a:Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lw4/z;->a:Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;

    check-cast p1, Lcom/zykj/study/bean/exercise/ExerciseBean;

    invoke-static {v0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->r(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;Lcom/zykj/study/bean/exercise/ExerciseBean;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
