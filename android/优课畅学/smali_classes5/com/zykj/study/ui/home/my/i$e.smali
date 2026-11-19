.class public final Lcom/zykj/study/ui/home/my/i$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/study/ui/home/my/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
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
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/i$e;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)Landroidx/navigation/NavDirections;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/study/ui/home/my/i$a;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lcom/zykj/study/ui/home/my/i$a;-><init>(I)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final b(Lcom/zykj/study/bean/course/CourseBean;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroidx/navigation/NavDirections;
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
    new-instance v1, Lcom/zykj/study/ui/home/my/i$b;

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
    invoke-direct/range {v1 .. v6}, Lcom/zykj/study/ui/home/my/i$b;-><init>(Lcom/zykj/study/bean/course/CourseBean;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-object v1
.end method

.method public final c(Lcom/zykj/study/data/MyCourseEntity;)Landroidx/navigation/NavDirections;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/study/ui/home/my/i$c;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lcom/zykj/study/ui/home/my/i$c;-><init>(Lcom/zykj/study/data/MyCourseEntity;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final d(I)Landroidx/navigation/NavDirections;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/study/ui/home/my/i$d;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lcom/zykj/study/ui/home/my/i$d;-><init>(I)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
