.class public final synthetic Lcom/zykj/study/data/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Lcom/zykj/study/data/CourseStudyEntityDao_Impl;

.field public final synthetic b:Lcom/zykj/study/data/CourseStudyEntity;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/data/CourseStudyEntityDao_Impl;Lcom/zykj/study/data/CourseStudyEntity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/study/data/u;->a:Lcom/zykj/study/data/CourseStudyEntityDao_Impl;

    iput-object p2, p0, Lcom/zykj/study/data/u;->b:Lcom/zykj/study/data/CourseStudyEntity;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/study/data/u;->a:Lcom/zykj/study/data/CourseStudyEntityDao_Impl;

    iget-object v1, p0, Lcom/zykj/study/data/u;->b:Lcom/zykj/study/data/CourseStudyEntity;

    check-cast p1, Landroidx/sqlite/SQLiteConnection;

    invoke-static {v0, v1, p1}, Lcom/zykj/study/data/CourseStudyEntityDao_Impl;->f(Lcom/zykj/study/data/CourseStudyEntityDao_Impl;Lcom/zykj/study/data/CourseStudyEntity;Landroidx/sqlite/SQLiteConnection;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
