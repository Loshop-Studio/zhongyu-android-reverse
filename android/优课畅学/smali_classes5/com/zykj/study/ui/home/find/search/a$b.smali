.class public final Lcom/zykj/study/ui/home/find/search/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/study/ui/home/find/search/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
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
    invoke-direct {p0}, Lcom/zykj/study/ui/home/find/search/a$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/study/bean/course/CourseSimpleBean;)Landroidx/navigation/NavDirections;
    .locals 1

    .line 1
    const-string v0, "courseDetails"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/study/ui/home/find/search/a$a;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lcom/zykj/study/ui/home/find/search/a$a;-><init>(Lcom/zykj/study/bean/course/CourseSimpleBean;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
