.class public final synthetic Lt4/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic a:Lcom/zykj/study/repository/CourseRepository;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/repository/CourseRepository;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt4/d;->a:Lcom/zykj/study/repository/CourseRepository;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lt4/d;->a:Lcom/zykj/study/repository/CourseRepository;

    invoke-static {v0}, Lcom/zykj/study/repository/CourseRepository;->b(Lcom/zykj/study/repository/CourseRepository;)Landroidx/paging/PagingSource;

    move-result-object v0

    return-object v0
.end method
