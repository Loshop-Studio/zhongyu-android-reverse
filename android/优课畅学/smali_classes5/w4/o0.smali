.class public final synthetic Lw4/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw4/o0;->a:Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lw4/o0;->a:Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;

    check-cast p1, Lcom/zykj/study/bean/teach/ChoiceChartData;

    invoke-static {v0, p1}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->k(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;Lcom/zykj/study/bean/teach/ChoiceChartData;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
