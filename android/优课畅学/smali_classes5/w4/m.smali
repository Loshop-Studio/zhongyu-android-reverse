.class public final synthetic Lw4/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw4/m;->a:Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lw4/m;->a:Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;

    check-cast p1, Lcom/zykj/study/bean/SelectModel;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;->k(Lcom/zykj/study/ui/home/exercise/ExerciseHistoryFragment;Lcom/zykj/study/bean/SelectModel;I)Lh7/p;

    move-result-object p1

    return-object p1
.end method
