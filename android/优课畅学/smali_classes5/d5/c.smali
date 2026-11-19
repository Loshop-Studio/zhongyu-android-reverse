.class public final synthetic Ld5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/study/StudyListFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/study/StudyListFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld5/c;->a:Lcom/zykj/study/ui/home/study/StudyListFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ld5/c;->a:Lcom/zykj/study/ui/home/study/StudyListFragment;

    check-cast p1, Lcom/zykj/study/data/CourseStudyEntity;

    invoke-static {v0, p1}, Lcom/zykj/study/ui/home/study/StudyListFragment;->g(Lcom/zykj/study/ui/home/study/StudyListFragment;Lcom/zykj/study/data/CourseStudyEntity;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
