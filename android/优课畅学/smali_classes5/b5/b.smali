.class public final synthetic Lb5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/my/AuthorizedLessonFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/my/AuthorizedLessonFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5/b;->a:Lcom/zykj/study/ui/home/my/AuthorizedLessonFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lb5/b;->a:Lcom/zykj/study/ui/home/my/AuthorizedLessonFragment;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Lcom/zykj/study/bean/exercise/AuthorizeLesson;

    invoke-static {v0, p1, p2}, Lcom/zykj/study/ui/home/my/AuthorizedLessonFragment;->m(Lcom/zykj/study/ui/home/my/AuthorizedLessonFragment;ILcom/zykj/study/bean/exercise/AuthorizeLesson;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
