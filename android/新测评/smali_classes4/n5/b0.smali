.class public final synthetic Ln5/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:J

.field public final synthetic c:J

.field public final synthetic d:I

.field public final synthetic e:Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;JJILcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln5/b0;->a:Ljava/lang/String;

    iput-wide p2, p0, Ln5/b0;->b:J

    iput-wide p4, p0, Ln5/b0;->c:J

    iput p6, p0, Ln5/b0;->d:I

    iput-object p7, p0, Ln5/b0;->e:Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Ln5/b0;->a:Ljava/lang/String;

    iget-wide v1, p0, Ln5/b0;->b:J

    iget-wide v3, p0, Ln5/b0;->c:J

    iget v5, p0, Ln5/b0;->d:I

    iget-object v6, p0, Ln5/b0;->e:Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;

    move-object v7, p1

    check-cast v7, Landroidx/sqlite/SQLiteConnection;

    invoke-static/range {v0 .. v7}, Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;->g(Ljava/lang/String;JJILcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
