.class public final synthetic Ln5/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:J

.field public final synthetic c:J

.field public final synthetic d:I

.field public final synthetic e:J

.field public final synthetic f:Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;JJIJLcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln5/x;->a:Ljava/lang/String;

    iput-wide p2, p0, Ln5/x;->b:J

    iput-wide p4, p0, Ln5/x;->c:J

    iput p6, p0, Ln5/x;->d:I

    iput-wide p7, p0, Ln5/x;->e:J

    iput-object p9, p0, Ln5/x;->f:Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Ln5/x;->a:Ljava/lang/String;

    iget-wide v1, p0, Ln5/x;->b:J

    iget-wide v3, p0, Ln5/x;->c:J

    iget v5, p0, Ln5/x;->d:I

    iget-wide v6, p0, Ln5/x;->e:J

    iget-object v8, p0, Ln5/x;->f:Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;

    move-object v9, p1

    check-cast v9, Landroidx/sqlite/SQLiteConnection;

    invoke-static/range {v0 .. v9}, Lcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;->j(Ljava/lang/String;JJIJLcom/zykj/evaluation/di/entity/UploadQuestionDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ln5/v;

    move-result-object p1

    return-object p1
.end method
