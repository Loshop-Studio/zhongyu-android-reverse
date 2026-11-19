.class public final synthetic Lb5/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:Lcom/zykj/study/bean/exercise/ExerciseBean;

.field public final synthetic e:Z

.field public final synthetic f:Lkotlin/jvm/internal/Ref$ObjectRef;

.field public final synthetic g:Lcom/zykj/study/ui/home/my/CourseContentFragment;


# direct methods
.method public synthetic constructor <init>(IIILcom/zykj/study/bean/exercise/ExerciseBean;ZLkotlin/jvm/internal/Ref$ObjectRef;Lcom/zykj/study/ui/home/my/CourseContentFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lb5/m;->a:I

    iput p2, p0, Lb5/m;->b:I

    iput p3, p0, Lb5/m;->c:I

    iput-object p4, p0, Lb5/m;->d:Lcom/zykj/study/bean/exercise/ExerciseBean;

    iput-boolean p5, p0, Lb5/m;->e:Z

    iput-object p6, p0, Lb5/m;->f:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p7, p0, Lb5/m;->g:Lcom/zykj/study/ui/home/my/CourseContentFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lb5/m;->a:I

    iget v1, p0, Lb5/m;->b:I

    iget v2, p0, Lb5/m;->c:I

    iget-object v3, p0, Lb5/m;->d:Lcom/zykj/study/bean/exercise/ExerciseBean;

    iget-boolean v4, p0, Lb5/m;->e:Z

    iget-object v5, p0, Lb5/m;->f:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v6, p0, Lb5/m;->g:Lcom/zykj/study/ui/home/my/CourseContentFragment;

    move-object v7, p1

    check-cast v7, Lcom/zykj/study/bean/exercise/QuestionBean;

    invoke-static/range {v0 .. v7}, Lcom/zykj/study/ui/home/my/CourseContentFragment;->g(IIILcom/zykj/study/bean/exercise/ExerciseBean;ZLkotlin/jvm/internal/Ref$ObjectRef;Lcom/zykj/study/ui/home/my/CourseContentFragment;Lcom/zykj/study/bean/exercise/QuestionBean;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
