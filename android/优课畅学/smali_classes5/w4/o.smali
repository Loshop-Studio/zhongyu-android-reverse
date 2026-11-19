.class public final synthetic Lw4/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic a:Lcom/zykj/study/bean/exercise/QuestionBean;

.field public final synthetic b:Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/bean/exercise/QuestionBean;Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw4/o;->a:Lcom/zykj/study/bean/exercise/QuestionBean;

    iput-object p2, p0, Lw4/o;->b:Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lw4/o;->a:Lcom/zykj/study/bean/exercise/QuestionBean;

    iget-object v1, p0, Lw4/o;->b:Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;

    invoke-static {v0, v1}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->j(Lcom/zykj/study/bean/exercise/QuestionBean;Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;)Lh7/p;

    move-result-object v0

    return-object v0
.end method
