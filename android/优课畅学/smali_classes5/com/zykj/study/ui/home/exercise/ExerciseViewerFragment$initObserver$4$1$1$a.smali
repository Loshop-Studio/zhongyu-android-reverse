.class public final Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$initObserver$4$1$1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll8/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$initObserver$4$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$initObserver$4$1$1$a;->a:Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Ljava/util/List;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$initObserver$4$1$1$a;->a:Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;

    .line 2
    .line 3
    invoke-static {p2}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->w(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;)Lcom/zykj/study/adapter/ChartBarAdapter;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/ListAdapter;->submitList(Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 11
    .line 12
    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment$initObserver$4$1$1$a;->c(Ljava/util/List;Lm7/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
