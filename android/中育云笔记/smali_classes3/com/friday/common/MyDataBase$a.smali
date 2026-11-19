.class public final Lcom/friday/common/MyDataBase$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/friday/common/MyDataBase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/common/MyDataBase$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Lcom/friday/common/MyDataBase;
    .locals 11

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-class v0, Lcom/friday/common/MyDataBase;

    .line 7
    .line 8
    const-string v1, "FRIDAY_NOTE_DB"

    .line 9
    .line 10
    invoke-static {p1, v0, v1}, Landroidx/room/Room;->databaseBuilder(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)Landroidx/room/RoomDatabase$Builder;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {}, Lcom/friday/common/MyDataBase;->i()Landroidx/room/migration/Migration;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {}, Lcom/friday/common/MyDataBase;->j()Landroidx/room/migration/Migration;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {}, Lcom/friday/common/MyDataBase;->k()Landroidx/room/migration/Migration;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-static {}, Lcom/friday/common/MyDataBase;->l()Landroidx/room/migration/Migration;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-static {}, Lcom/friday/common/MyDataBase;->m()Landroidx/room/migration/Migration;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-static {}, Lcom/friday/common/MyDataBase;->n()Landroidx/room/migration/Migration;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-static {}, Lcom/friday/common/MyDataBase;->o()Landroidx/room/migration/Migration;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    invoke-static {}, Lcom/friday/common/MyDataBase;->p()Landroidx/room/migration/Migration;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    invoke-static {}, Lcom/friday/common/MyDataBase;->q()Landroidx/room/migration/Migration;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    invoke-static {}, Lcom/friday/common/MyDataBase;->g()Landroidx/room/migration/Migration;

    .line 51
    .line 52
    .line 53
    move-result-object v9

    .line 54
    invoke-static {}, Lcom/friday/common/MyDataBase;->h()Landroidx/room/migration/Migration;

    .line 55
    .line 56
    .line 57
    move-result-object v10

    .line 58
    filled-new-array/range {v0 .. v10}, [Landroidx/room/migration/Migration;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {p1, v0}, Landroidx/room/RoomDatabase$Builder;->addMigrations([Landroidx/room/migration/Migration;)Landroidx/room/RoomDatabase$Builder;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Landroidx/room/RoomDatabase$Builder;->build()Landroidx/room/RoomDatabase;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    check-cast p1, Lcom/friday/common/MyDataBase;

    .line 71
    .line 72
    return-object p1
.end method
