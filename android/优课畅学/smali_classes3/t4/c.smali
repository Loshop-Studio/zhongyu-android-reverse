.class public final synthetic Lt4/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic a:Lcom/zykj/study/repository/CourseRepository;

.field public final synthetic b:Lcom/zykj/study/data/CourseStudyKeyEntity;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/repository/CourseRepository;Lcom/zykj/study/data/CourseStudyKeyEntity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt4/c;->a:Lcom/zykj/study/repository/CourseRepository;

    iput-object p2, p0, Lt4/c;->b:Lcom/zykj/study/data/CourseStudyKeyEntity;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lt4/c;->a:Lcom/zykj/study/repository/CourseRepository;

    iget-object v1, p0, Lt4/c;->b:Lcom/zykj/study/data/CourseStudyKeyEntity;

    invoke-static {v0, v1}, Lcom/zykj/study/repository/CourseRepository;->c(Lcom/zykj/study/repository/CourseRepository;Lcom/zykj/study/data/CourseStudyKeyEntity;)Landroidx/paging/PagingSource;

    move-result-object v0

    return-object v0
.end method
