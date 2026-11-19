.class public abstract Lcom/zykj/download/data/AppDatabase;
.super Landroidx/room/RoomDatabase;
.source "SourceFile"


# annotations
.annotation build Landroidx/room/Database;
    entities = {
        Lw5/b;,
        Lw5/e;
    }
    exportSchema = false
    version = 0x1
.end annotation

.annotation build Landroidx/room/TypeConverters;
    value = {
        Lw5/a;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/download/data/AppDatabase$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/zykj/download/data/AppDatabase;",
        "Landroidx/room/RoomDatabase;",
        "<init>",
        "()V",
        "Lw5/c;",
        "i",
        "()Lw5/c;",
        "a",
        "download_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lcom/zykj/download/data/AppDatabase$a;

.field public static volatile b:Lcom/zykj/download/data/AppDatabase;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/download/data/AppDatabase$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/download/data/AppDatabase$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

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
.method public abstract i()Lw5/c;
.end method
