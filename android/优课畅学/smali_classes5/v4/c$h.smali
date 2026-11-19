.class public final Lv4/c$h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv4/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lv4/c$h;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/study/bean/course/CourseBean;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroidx/navigation/NavDirections;
    .locals 7

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "title"

    .line 7
    .line 8
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lv4/c$a;

    .line 12
    .line 13
    move-object v2, p1

    .line 14
    move v3, p2

    .line 15
    move-object v4, p3

    .line 16
    move-object v5, p4

    .line 17
    move-object v6, p5

    .line 18
    invoke-direct/range {v1 .. v6}, Lv4/c$a;-><init>(Lcom/zykj/study/bean/course/CourseBean;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-object v1
.end method

.method public final b(Lcom/zykj/study/bean/course/CourseSimpleBean;)Landroidx/navigation/NavDirections;
    .locals 1

    .line 1
    const-string v0, "courseDetails"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lv4/c$b;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lv4/c$b;-><init>(Lcom/zykj/study/bean/course/CourseSimpleBean;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public final c(Lcom/zykj/study/data/MyCourseEntity;)Landroidx/navigation/NavDirections;
    .locals 1

    .line 1
    new-instance v0, Lv4/c$c;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lv4/c$c;-><init>(Lcom/zykj/study/data/MyCourseEntity;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;)Landroidx/navigation/NavDirections;
    .locals 1

    .line 1
    const-string v0, "code"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "path"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lv4/c$d;

    .line 12
    .line 13
    invoke-direct {v0, p1, p2}, Lv4/c$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public final e(Lcom/zykj/study/data/MyCourseEntity;)Landroidx/navigation/NavDirections;
    .locals 1

    .line 1
    const-string v0, "myCourse"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lv4/c$e;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lv4/c$e;-><init>(Lcom/zykj/study/data/MyCourseEntity;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public final f()Landroidx/navigation/NavDirections;
    .locals 2

    .line 1
    new-instance v0, Landroidx/navigation/ActionOnlyNavDirections;

    .line 2
    .line 3
    sget v1, Lcom/zykj/study/R$id;->action_homeFragment_to_nav_qr_code:I

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroidx/navigation/ActionOnlyNavDirections;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final g(Ljava/lang/String;ILjava/lang/String;Lcom/zykj/lib/ota/bean/AppType;Z)Landroidx/navigation/NavDirections;
    .locals 7

    .line 1
    const-string v0, "packageName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "versionName"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "appType"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Lv4/c$f;

    .line 17
    .line 18
    move-object v2, p1

    .line 19
    move v3, p2

    .line 20
    move-object v4, p3

    .line 21
    move-object v5, p4

    .line 22
    move v6, p5

    .line 23
    invoke-direct/range {v1 .. v6}, Lv4/c$f;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/zykj/lib/ota/bean/AppType;Z)V

    .line 24
    .line 25
    .line 26
    return-object v1
.end method

.method public final h()Landroidx/navigation/NavDirections;
    .locals 2

    .line 1
    new-instance v0, Landroidx/navigation/ActionOnlyNavDirections;

    .line 2
    .line 3
    sget v1, Lcom/zykj/study/R$id;->action_homeFragment_to_searchFragment:I

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroidx/navigation/ActionOnlyNavDirections;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final i(ILcom/zykj/study/bean/course/CourseBean;)Landroidx/navigation/NavDirections;
    .locals 1

    .line 1
    new-instance v0, Lv4/c$g;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lv4/c$g;-><init>(ILcom/zykj/study/bean/course/CourseBean;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
