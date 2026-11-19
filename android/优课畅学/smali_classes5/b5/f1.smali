.class public final synthetic Lb5/f1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp2/d$b;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;

.field public final synthetic b:Lcom/zykj/study/bean/teach/QuizScore;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;Lcom/zykj/study/bean/teach/QuizScore;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5/f1;->a:Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;

    iput-object p2, p0, Lb5/f1;->b:Lcom/zykj/study/bean/teach/QuizScore;

    return-void
.end method


# virtual methods
.method public final a(Lm1/c;Lm1/a;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lb5/f1;->a:Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;

    iget-object v1, p0, Lb5/f1;->b:Lcom/zykj/study/bean/teach/QuizScore;

    invoke-static {v0, v1, p1, p2, p3}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;->h(Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragment;Lcom/zykj/study/bean/teach/QuizScore;Lm1/c;Lm1/a;I)V

    return-void
.end method
