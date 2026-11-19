.class public Lorg/eclipse/paho/android/service/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/eclipse/paho/android/service/a;->a(Ljava/lang/String;)Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public c:Landroid/database/Cursor;

.field public d:Z

.field public final e:[Ljava/lang/String;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Lorg/eclipse/paho/android/service/a;


# direct methods
.method public constructor <init>(Lorg/eclipse/paho/android/service/a;Ljava/lang/String;)V
    .locals 13

    .line 1
    iput-object p1, p0, Lorg/eclipse/paho/android/service/a$a;->g:Lorg/eclipse/paho/android/service/a;

    .line 2
    .line 3
    iput-object p2, p0, Lorg/eclipse/paho/android/service/a$a;->f:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    filled-new-array {p2}, [Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v4

    .line 12
    iput-object v4, p0, Lorg/eclipse/paho/android/service/a$a;->e:[Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {p1}, Lorg/eclipse/paho/android/service/a;->g(Lorg/eclipse/paho/android/service/a;)Lorg/eclipse/paho/android/service/a$c;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {p1, v0}, Lorg/eclipse/paho/android/service/a;->f(Lorg/eclipse/paho/android/service/a;Landroid/database/sqlite/SQLiteDatabase;)Landroid/database/sqlite/SQLiteDatabase;

    .line 23
    .line 24
    .line 25
    if-nez p2, :cond_0

    .line 26
    .line 27
    invoke-static {p1}, Lorg/eclipse/paho/android/service/a;->e(Lorg/eclipse/paho/android/service/a;)Landroid/database/sqlite/SQLiteDatabase;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    const/4 v11, 0x0

    .line 32
    const-string v12, "mtimestamp ASC"

    .line 33
    .line 34
    const-string v6, "MqttArrivedMessageTable"

    .line 35
    .line 36
    const/4 v7, 0x0

    .line 37
    const/4 v8, 0x0

    .line 38
    const/4 v9, 0x0

    .line 39
    const/4 v10, 0x0

    .line 40
    invoke-virtual/range {v5 .. v12}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iput-object p1, p0, Lorg/eclipse/paho/android/service/a$a;->c:Landroid/database/Cursor;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-static {p1}, Lorg/eclipse/paho/android/service/a;->e(Lorg/eclipse/paho/android/service/a;)Landroid/database/sqlite/SQLiteDatabase;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const/4 v6, 0x0

    .line 52
    const-string v7, "mtimestamp ASC"

    .line 53
    .line 54
    const-string v1, "MqttArrivedMessageTable"

    .line 55
    .line 56
    const/4 v2, 0x0

    .line 57
    const-string v3, "clientHandle=?"

    .line 58
    .line 59
    const/4 v5, 0x0

    .line 60
    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iput-object p1, p0, Lorg/eclipse/paho/android/service/a$a;->c:Landroid/database/Cursor;

    .line 65
    .line 66
    :goto_0
    iget-object p1, p0, Lorg/eclipse/paho/android/service/a$a;->c:Landroid/database/Cursor;

    .line 67
    .line 68
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    iput-boolean p1, p0, Lorg/eclipse/paho/android/service/a$a;->d:Z

    .line 73
    .line 74
    return-void
.end method


# virtual methods
.method public a()Lorg/eclipse/paho/android/service/b$a;
    .locals 9

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/a$a;->c:Landroid/database/Cursor;

    .line 2
    .line 3
    const-string v1, "messageId"

    .line 4
    .line 5
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    iget-object v0, p0, Lorg/eclipse/paho/android/service/a$a;->c:Landroid/database/Cursor;

    .line 14
    .line 15
    const-string v1, "clientHandle"

    .line 16
    .line 17
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    iget-object v0, p0, Lorg/eclipse/paho/android/service/a$a;->c:Landroid/database/Cursor;

    .line 26
    .line 27
    const-string v1, "destinationName"

    .line 28
    .line 29
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    iget-object v0, p0, Lorg/eclipse/paho/android/service/a$a;->c:Landroid/database/Cursor;

    .line 38
    .line 39
    const-string v1, "payload"

    .line 40
    .line 41
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getBlob(I)[B

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget-object v1, p0, Lorg/eclipse/paho/android/service/a$a;->c:Landroid/database/Cursor;

    .line 50
    .line 51
    const-string v2, "qos"

    .line 52
    .line 53
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    iget-object v2, p0, Lorg/eclipse/paho/android/service/a$a;->c:Landroid/database/Cursor;

    .line 62
    .line 63
    const-string v3, "retained"

    .line 64
    .line 65
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-static {v2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    iget-object v3, p0, Lorg/eclipse/paho/android/service/a$a;->c:Landroid/database/Cursor;

    .line 78
    .line 79
    const-string v7, "duplicate"

    .line 80
    .line 81
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-static {v3}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    new-instance v7, Lorg/eclipse/paho/android/service/a$d;

    .line 94
    .line 95
    iget-object v8, p0, Lorg/eclipse/paho/android/service/a$a;->g:Lorg/eclipse/paho/android/service/a;

    .line 96
    .line 97
    invoke-direct {v7, v8, v0}, Lorg/eclipse/paho/android/service/a$d;-><init>(Lorg/eclipse/paho/android/service/a;[B)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v7, v1}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->setQos(I)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v7, v2}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->setRetained(Z)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v7, v3}, Lorg/eclipse/paho/android/service/a$d;->setDuplicate(Z)V

    .line 107
    .line 108
    .line 109
    iget-object v0, p0, Lorg/eclipse/paho/android/service/a$a;->c:Landroid/database/Cursor;

    .line 110
    .line 111
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    iput-boolean v0, p0, Lorg/eclipse/paho/android/service/a$a;->d:Z

    .line 116
    .line 117
    new-instance v2, Lorg/eclipse/paho/android/service/a$b;

    .line 118
    .line 119
    iget-object v3, p0, Lorg/eclipse/paho/android/service/a$a;->g:Lorg/eclipse/paho/android/service/a;

    .line 120
    .line 121
    invoke-direct/range {v2 .. v7}, Lorg/eclipse/paho/android/service/a$b;-><init>(Lorg/eclipse/paho/android/service/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttMessage;)V

    .line 122
    .line 123
    .line 124
    return-object v2
.end method

.method public finalize()V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/a$a;->c:Landroid/database/Cursor;

    .line 2
    .line 3
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public hasNext()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/eclipse/paho/android/service/a$a;->d:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lorg/eclipse/paho/android/service/a$a;->c:Landroid/database/Cursor;

    .line 6
    .line 7
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-boolean v0, p0, Lorg/eclipse/paho/android/service/a$a;->d:Z

    .line 11
    .line 12
    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/eclipse/paho/android/service/a$a;->a()Lorg/eclipse/paho/android/service/b$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public remove()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw v0
.end method
