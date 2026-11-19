.class public final synthetic Lx4/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx4/b;->a:Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lx4/b;->a:Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment;

    check-cast p1, Lcom/zykj/study/bean/exercise/QuestionBean;

    invoke-static {v0, p1}, Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment;->g(Lcom/zykj/study/ui/home/exercise/train/AnswerAreaFragment;Lcom/zykj/study/bean/exercise/QuestionBean;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
