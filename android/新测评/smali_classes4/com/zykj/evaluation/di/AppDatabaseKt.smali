.class public abstract Lcom/zykj/evaluation/di/AppDatabaseKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroidx/room/migration/Migration;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/evaluation/di/AppDatabaseKt$MIGRATION_1_2$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/evaluation/di/AppDatabaseKt$MIGRATION_1_2$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/evaluation/di/AppDatabaseKt;->a:Landroidx/room/migration/Migration;

    .line 7
    .line 8
    return-void
.end method

.method public static final a()Landroidx/room/migration/Migration;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/evaluation/di/AppDatabaseKt;->a:Landroidx/room/migration/Migration;

    .line 2
    .line 3
    return-object v0
.end method
