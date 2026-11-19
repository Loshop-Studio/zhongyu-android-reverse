.class public final Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/objectbox/EntityInfo;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/objectbox/EntityInfo<",
        "Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/Class;

.field public static final b:Lc8/b;

.field public static final c:Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_$a;

.field public static final d:Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_;

.field public static final e:Lio/objectbox/Property;

.field public static final f:Lio/objectbox/Property;

.field public static final g:Lio/objectbox/Property;

.field public static final h:Lio/objectbox/Property;

.field public static final i:Lio/objectbox/Property;

.field public static final j:Lio/objectbox/Property;

.field public static final k:[Lio/objectbox/Property;

.field public static final l:Lio/objectbox/Property;

.field public static final m:Lio/objectbox/relation/RelationInfo;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    const-class v0, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_;->a:Ljava/lang/Class;

    .line 4
    .line 5
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/FileInfoEntityCursor$a;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/zykj/blackboard/core/data/dao/FileInfoEntityCursor$a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_;->b:Lc8/b;

    .line 11
    .line 12
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_$a;

    .line 13
    .line 14
    invoke-direct {v0}, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_$a;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_;->c:Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_$a;

    .line 18
    .line 19
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_;

    .line 20
    .line 21
    invoke-direct {v2}, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v2, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_;->d:Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_;

    .line 25
    .line 26
    new-instance v1, Lio/objectbox/Property;

    .line 27
    .line 28
    const/4 v7, 0x1

    .line 29
    const-string v8, "id"

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 34
    .line 35
    const-string v6, "id"

    .line 36
    .line 37
    invoke-direct/range {v1 .. v8}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;ZLjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    move-object v0, v1

    .line 41
    move-object v7, v5

    .line 42
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_;->e:Lio/objectbox/Property;

    .line 43
    .line 44
    new-instance v1, Lio/objectbox/Property;

    .line 45
    .line 46
    const-class v5, Ljava/lang/String;

    .line 47
    .line 48
    const-string v6, "fileName"

    .line 49
    .line 50
    const/4 v3, 0x1

    .line 51
    const/4 v4, 0x2

    .line 52
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    move-object v8, v1

    .line 56
    sput-object v8, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_;->f:Lio/objectbox/Property;

    .line 57
    .line 58
    new-instance v1, Lio/objectbox/Property;

    .line 59
    .line 60
    const-string v6, "width"

    .line 61
    .line 62
    const/4 v3, 0x2

    .line 63
    const/4 v4, 0x3

    .line 64
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 65
    .line 66
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    move-object v9, v1

    .line 70
    sput-object v9, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_;->g:Lio/objectbox/Property;

    .line 71
    .line 72
    new-instance v1, Lio/objectbox/Property;

    .line 73
    .line 74
    const/4 v4, 0x4

    .line 75
    const-string v6, "height"

    .line 76
    .line 77
    const/4 v3, 0x3

    .line 78
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    move-object v10, v1

    .line 82
    sput-object v10, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_;->h:Lio/objectbox/Property;

    .line 83
    .line 84
    new-instance v1, Lio/objectbox/Property;

    .line 85
    .line 86
    const-class v5, Ljava/lang/String;

    .line 87
    .line 88
    const-string v6, "validate"

    .line 89
    .line 90
    const/4 v3, 0x4

    .line 91
    const/4 v4, 0x5

    .line 92
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    move-object v11, v1

    .line 96
    sput-object v11, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_;->i:Lio/objectbox/Property;

    .line 97
    .line 98
    new-instance v1, Lio/objectbox/Property;

    .line 99
    .line 100
    const-string v6, "recordId"

    .line 101
    .line 102
    move-object v5, v7

    .line 103
    const/4 v7, 0x1

    .line 104
    const/4 v3, 0x5

    .line 105
    const/4 v4, 0x6

    .line 106
    invoke-direct/range {v1 .. v7}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;Z)V

    .line 107
    .line 108
    .line 109
    sput-object v1, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_;->j:Lio/objectbox/Property;

    .line 110
    .line 111
    move-object v3, v0

    .line 112
    move-object v4, v8

    .line 113
    move-object v5, v9

    .line 114
    move-object v6, v10

    .line 115
    move-object v7, v11

    .line 116
    move-object v8, v1

    .line 117
    filled-new-array/range {v3 .. v8}, [Lio/objectbox/Property;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    move-object v1, v3

    .line 122
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_;->k:[Lio/objectbox/Property;

    .line 123
    .line 124
    sput-object v1, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_;->l:Lio/objectbox/Property;

    .line 125
    .line 126
    new-instance v0, Lio/objectbox/relation/RelationInfo;

    .line 127
    .line 128
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity_;->d:Lcom/zykj/blackboard/core/data/dao/FileRecordEntity_;

    .line 129
    .line 130
    new-instance v3, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_$1;

    .line 131
    .line 132
    invoke-direct {v3}, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_$1;-><init>()V

    .line 133
    .line 134
    .line 135
    invoke-direct {v0, v2, v1, v8, v3}, Lio/objectbox/relation/RelationInfo;-><init>(Lio/objectbox/EntityInfo;Lio/objectbox/EntityInfo;Lio/objectbox/Property;Lio/objectbox/internal/ToOneGetter;)V

    .line 136
    .line 137
    .line 138
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_;->m:Lio/objectbox/relation/RelationInfo;

    .line 139
    .line 140
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public d()[Lio/objectbox/Property;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_;->k:[Lio/objectbox/Property;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()Ljava/lang/Class;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_;->a:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public i()Lc8/b;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_;->b:Lc8/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public j()I
    .locals 1

    .line 1
    const/4 v0, 0x7

    return v0
.end method

.method public l()Lc8/c;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_;->c:Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public r()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "FileInfoEntity"

    .line 2
    .line 3
    return-object v0
.end method

.method public s()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "FileInfoEntity"

    .line 2
    .line 3
    return-object v0
.end method
