.class public final synthetic Lw4/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Lcom/zykj/study/bean/exercise/QuestionGroupBean;

.field public final synthetic b:Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/bean/exercise/QuestionGroupBean;Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw4/v;->a:Lcom/zykj/study/bean/exercise/QuestionGroupBean;

    iput-object p2, p0, Lw4/v;->b:Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lw4/v;->a:Lcom/zykj/study/bean/exercise/QuestionGroupBean;

    iget-object v1, p0, Lw4/v;->b:Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;

    check-cast p1, Lcom/zykj/study/bean/exercise/QuestionBean;

    invoke-static {v0, v1, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;->m(Lcom/zykj/study/bean/exercise/QuestionGroupBean;Lcom/zykj/study/ui/home/exercise/ExerciseHistoryStudentFragment;Lcom/zykj/study/bean/exercise/QuestionBean;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
