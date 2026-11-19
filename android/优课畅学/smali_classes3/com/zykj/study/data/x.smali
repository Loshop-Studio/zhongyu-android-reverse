.class public final synthetic Lcom/zykj/study/data/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:I

.field public final synthetic d:Lcom/zykj/study/data/CourseStudyEntityDao_Impl;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ILcom/zykj/study/data/CourseStudyEntityDao_Impl;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/study/data/x;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/zykj/study/data/x;->b:Ljava/lang/String;

    iput p3, p0, Lcom/zykj/study/data/x;->c:I

    iput-object p4, p0, Lcom/zykj/study/data/x;->d:Lcom/zykj/study/data/CourseStudyEntityDao_Impl;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/study/data/x;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/zykj/study/data/x;->b:Ljava/lang/String;

    iget v2, p0, Lcom/zykj/study/data/x;->c:I

    iget-object v3, p0, Lcom/zykj/study/data/x;->d:Lcom/zykj/study/data/CourseStudyEntityDao_Impl;

    check-cast p1, Landroidx/sqlite/SQLiteConnection;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/zykj/study/data/CourseStudyEntityDao_Impl;->d(Ljava/lang/String;Ljava/lang/String;ILcom/zykj/study/data/CourseStudyEntityDao_Impl;Landroidx/sqlite/SQLiteConnection;)Lcom/zykj/study/data/CourseStudyEntity;

    move-result-object p1

    return-object p1
.end method
