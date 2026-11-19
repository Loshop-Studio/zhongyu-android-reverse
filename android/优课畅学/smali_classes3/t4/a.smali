.class public final Lt4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lo4/b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lo4/b;)V
    .locals 1

    .line 1
    const-string v0, "courseApi"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lt4/a;->a:Lo4/b;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(IILm7/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/study/bean/course/AuthorizeLessonReqBody;

    .line 2
    .line 3
    invoke-direct {v0, p2, p1}, Lcom/zykj/study/bean/course/AuthorizeLessonReqBody;-><init>(II)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lt4/a;->a:Lo4/b;

    .line 7
    .line 8
    invoke-interface {p1, v0, p3}, Lo4/b;->m(Lcom/zykj/study/bean/course/AuthorizeLessonReqBody;Lm7/c;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final b(IILm7/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/study/bean/course/AuthorizeLessonReqBody;

    .line 2
    .line 3
    invoke-direct {v0, p2, p1}, Lcom/zykj/study/bean/course/AuthorizeLessonReqBody;-><init>(II)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lt4/a;->a:Lo4/b;

    .line 7
    .line 8
    invoke-interface {p1, v0, p3}, Lo4/b;->A(Lcom/zykj/study/bean/course/AuthorizeLessonReqBody;Lm7/c;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final c(Ljava/lang/String;ILm7/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/study/bean/course/SearchReqBody;

    .line 2
    .line 3
    invoke-direct {v0, p2, p1}, Lcom/zykj/study/bean/course/SearchReqBody;-><init>(ILjava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lt4/a;->a:Lo4/b;

    .line 7
    .line 8
    invoke-interface {p1, v0, p3}, Lo4/b;->n(Lcom/zykj/study/bean/course/SearchReqBody;Lm7/c;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final d(ILm7/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lt4/a;->a:Lo4/b;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lo4/b;->b(ILm7/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
