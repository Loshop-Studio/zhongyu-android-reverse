.class public final synthetic Lb5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/my/AuthorizedLessonFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/my/AuthorizedLessonFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5/c;->a:Lcom/zykj/study/ui/home/my/AuthorizedLessonFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lb5/c;->a:Lcom/zykj/study/ui/home/my/AuthorizedLessonFragment;

    check-cast p1, Lcom/zykj/study/bean/exercise/AuthorizeLesson;

    invoke-static {v0, p1}, Lcom/zykj/study/ui/home/my/AuthorizedLessonFragment;->j(Lcom/zykj/study/ui/home/my/AuthorizedLessonFragment;Lcom/zykj/study/bean/exercise/AuthorizeLesson;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
