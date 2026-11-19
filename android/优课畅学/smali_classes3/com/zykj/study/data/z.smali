.class public final synthetic Lcom/zykj/study/data/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Landroidx/room/RoomRawQuery;

.field public final synthetic b:Lcom/zykj/study/data/CourseStudyEntityDao_Impl;


# direct methods
.method public synthetic constructor <init>(Landroidx/room/RoomRawQuery;Lcom/zykj/study/data/CourseStudyEntityDao_Impl;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/study/data/z;->a:Landroidx/room/RoomRawQuery;

    iput-object p2, p0, Lcom/zykj/study/data/z;->b:Lcom/zykj/study/data/CourseStudyEntityDao_Impl;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/study/data/z;->a:Landroidx/room/RoomRawQuery;

    iget-object v1, p0, Lcom/zykj/study/data/z;->b:Lcom/zykj/study/data/CourseStudyEntityDao_Impl;

    check-cast p1, Landroidx/sqlite/SQLiteConnection;

    invoke-static {v0, v1, p1}, Lcom/zykj/study/data/CourseStudyEntityDao_Impl$getCourseStudyList$1;->b(Landroidx/room/RoomRawQuery;Lcom/zykj/study/data/CourseStudyEntityDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
