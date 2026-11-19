.class public final Lcom/zykj/study/adapter/MyTeachCourseAdapter$Companion$POST_COMPARATOR$1;
.super Landroidx/recyclerview/widget/DiffUtil$ItemCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/study/adapter/MyTeachCourseAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/DiffUtil$ItemCallback<",
        "Lcom/zykj/study/bean/course/CourseDetailsBean;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/DiffUtil$ItemCallback;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Lcom/zykj/study/bean/course/CourseDetailsBean;Lcom/zykj/study/bean/course/CourseDetailsBean;)Z
    .locals 1

    .line 1
    const-string v0, "oldItem"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "newItem"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method

.method public bridge synthetic areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/study/bean/course/CourseDetailsBean;

    .line 2
    .line 3
    check-cast p2, Lcom/zykj/study/bean/course/CourseDetailsBean;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/adapter/MyTeachCourseAdapter$Companion$POST_COMPARATOR$1;->a(Lcom/zykj/study/bean/course/CourseDetailsBean;Lcom/zykj/study/bean/course/CourseDetailsBean;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public bridge synthetic areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/study/bean/course/CourseDetailsBean;

    .line 2
    .line 3
    check-cast p2, Lcom/zykj/study/bean/course/CourseDetailsBean;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/adapter/MyTeachCourseAdapter$Companion$POST_COMPARATOR$1;->b(Lcom/zykj/study/bean/course/CourseDetailsBean;Lcom/zykj/study/bean/course/CourseDetailsBean;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public b(Lcom/zykj/study/bean/course/CourseDetailsBean;Lcom/zykj/study/bean/course/CourseDetailsBean;)Z
    .locals 1

    .line 1
    const-string v0, "oldItem"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "newItem"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseBean;->getId()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-virtual {p2}, Lcom/zykj/study/bean/course/CourseBean;->getId()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-ne p1, p2, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    return p1

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    return p1
.end method
