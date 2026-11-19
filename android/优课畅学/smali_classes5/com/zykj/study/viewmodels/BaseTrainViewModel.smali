.class public abstract Lcom/zykj/study/viewmodels/BaseTrainViewModel;
.super Lcom/zykj/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public a:J

.field public b:I

.field public c:Lcom/zykj/study/bean/exercise/QuestionBean;

.field public d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/base/BaseViewModel;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/study/viewmodels/BaseTrainViewModel;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/viewmodels/BaseTrainViewModel;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final c()Lcom/zykj/study/bean/exercise/QuestionBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/BaseTrainViewModel;->c:Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "questionBean"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/study/viewmodels/BaseTrainViewModel;->d:Z

    .line 2
    .line 3
    return v0
.end method

.method public final e(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/study/viewmodels/BaseTrainViewModel;->a:J

    .line 2
    .line 3
    return-void
.end method

.method public final f(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/study/viewmodels/BaseTrainViewModel;->b:I

    .line 2
    .line 3
    return-void
.end method

.method public final g(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/study/viewmodels/BaseTrainViewModel;->d:Z

    .line 2
    .line 3
    return-void
.end method

.method public final h(Lcom/zykj/study/bean/exercise/QuestionBean;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/study/viewmodels/BaseTrainViewModel;->c:Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 7
    .line 8
    return-void
.end method
