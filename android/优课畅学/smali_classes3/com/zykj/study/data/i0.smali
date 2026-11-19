.class public final synthetic Lcom/zykj/study/data/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Lcom/zykj/study/data/GradeEntityDao_Impl;

.field public final synthetic b:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/data/GradeEntityDao_Impl;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/study/data/i0;->a:Lcom/zykj/study/data/GradeEntityDao_Impl;

    iput-object p2, p0, Lcom/zykj/study/data/i0;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/study/data/i0;->a:Lcom/zykj/study/data/GradeEntityDao_Impl;

    iget-object v1, p0, Lcom/zykj/study/data/i0;->b:Ljava/util/List;

    check-cast p1, Landroidx/sqlite/SQLiteConnection;

    invoke-static {v0, v1, p1}, Lcom/zykj/study/data/GradeEntityDao_Impl;->e(Lcom/zykj/study/data/GradeEntityDao_Impl;Ljava/util/List;Landroidx/sqlite/SQLiteConnection;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
