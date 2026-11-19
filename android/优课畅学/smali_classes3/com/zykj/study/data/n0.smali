.class public final synthetic Lcom/zykj/study/data/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lcom/zykj/study/data/MyCourseEntityDao_Impl;

.field public final synthetic c:Lcom/zykj/study/bean/course/CourseType;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lcom/zykj/study/data/MyCourseEntityDao_Impl;Lcom/zykj/study/bean/course/CourseType;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/study/data/n0;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/zykj/study/data/n0;->b:Lcom/zykj/study/data/MyCourseEntityDao_Impl;

    iput-object p3, p0, Lcom/zykj/study/data/n0;->c:Lcom/zykj/study/bean/course/CourseType;

    iput p4, p0, Lcom/zykj/study/data/n0;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/study/data/n0;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/zykj/study/data/n0;->b:Lcom/zykj/study/data/MyCourseEntityDao_Impl;

    iget-object v2, p0, Lcom/zykj/study/data/n0;->c:Lcom/zykj/study/bean/course/CourseType;

    iget v3, p0, Lcom/zykj/study/data/n0;->d:I

    check-cast p1, Landroidx/sqlite/SQLiteConnection;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/zykj/study/data/MyCourseEntityDao_Impl;->f(Ljava/lang/String;Lcom/zykj/study/data/MyCourseEntityDao_Impl;Lcom/zykj/study/bean/course/CourseType;ILandroidx/sqlite/SQLiteConnection;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
