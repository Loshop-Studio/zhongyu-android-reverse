.class public final synthetic Lcom/zykj/study/data/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:I

.field public final synthetic c:Lcom/zykj/study/data/MyCourseEntityDao_Impl;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;ILcom/zykj/study/data/MyCourseEntityDao_Impl;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/study/data/s0;->a:Ljava/lang/String;

    iput p2, p0, Lcom/zykj/study/data/s0;->b:I

    iput-object p3, p0, Lcom/zykj/study/data/s0;->c:Lcom/zykj/study/data/MyCourseEntityDao_Impl;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/study/data/s0;->a:Ljava/lang/String;

    iget v1, p0, Lcom/zykj/study/data/s0;->b:I

    iget-object v2, p0, Lcom/zykj/study/data/s0;->c:Lcom/zykj/study/data/MyCourseEntityDao_Impl;

    check-cast p1, Landroidx/sqlite/SQLiteConnection;

    invoke-static {v0, v1, v2, p1}, Lcom/zykj/study/data/MyCourseEntityDao_Impl;->a(Ljava/lang/String;ILcom/zykj/study/data/MyCourseEntityDao_Impl;Landroidx/sqlite/SQLiteConnection;)Lcom/zykj/study/data/MyCourseEntity;

    move-result-object p1

    return-object p1
.end method
