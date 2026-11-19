.class public final synthetic Lw4/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic a:Lcom/zykj/study/bean/exercise/QuestionBean;

.field public final synthetic b:Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/bean/exercise/QuestionBean;Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw4/w;->a:Lcom/zykj/study/bean/exercise/QuestionBean;

    iput-object p2, p0, Lw4/w;->b:Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lw4/w;->a:Lcom/zykj/study/bean/exercise/QuestionBean;

    iget-object v1, p0, Lw4/w;->b:Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;

    invoke-static {v0, v1}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->g(Lcom/zykj/study/bean/exercise/QuestionBean;Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;)Lh7/p;

    move-result-object v0

    return-object v0
.end method
