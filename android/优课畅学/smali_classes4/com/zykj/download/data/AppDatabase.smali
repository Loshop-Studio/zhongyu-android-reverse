.class public abstract Lcom/zykj/download/data/AppDatabase;
.super Landroidx/room/RoomDatabase;
.source "SourceFile"


# annotations
.annotation build Landroidx/room/Database;
    entities = {
        Lcom/zykj/download/data/DownloadEntity;,
        Lcom/zykj/download/data/UploadEntity;
    }
    exportSchema = false
    version = 0x1
.end annotation

.annotation build Landroidx/room/TypeConverters;
    value = {
        Lf3/a;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/download/data/AppDatabase$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/zykj/download/data/AppDatabase$a;

.field public static volatile b:Lcom/zykj/download/data/AppDatabase;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/download/data/AppDatabase$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/download/data/AppDatabase$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/download/data/AppDatabase;->a:Lcom/zykj/download/data/AppDatabase$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/room/RoomDatabase;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic g()Lcom/zykj/download/data/AppDatabase;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/download/data/AppDatabase;->b:Lcom/zykj/download/data/AppDatabase;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic h(Lcom/zykj/download/data/AppDatabase;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/zykj/download/data/AppDatabase;->b:Lcom/zykj/download/data/AppDatabase;

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public abstract i()Lf3/b;
.end method
