.class public final synthetic Ln5/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:J

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln5/f;->a:Ljava/lang/String;

    iput-wide p2, p0, Ln5/f;->b:J

    iput-wide p4, p0, Ln5/f;->c:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Ln5/f;->a:Ljava/lang/String;

    iget-wide v1, p0, Ln5/f;->b:J

    iget-wide v3, p0, Ln5/f;->c:J

    move-object v5, p1

    check-cast v5, Landroidx/sqlite/SQLiteConnection;

    invoke-static/range {v0 .. v5}, Lcom/zykj/evaluation/di/entity/SubmitTaskDao_Impl;->i(Ljava/lang/String;JJLandroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
